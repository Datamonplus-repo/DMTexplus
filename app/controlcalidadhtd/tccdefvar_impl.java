package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tccdefvar_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11522CCVCod = httpContext.GetPar( "CCVCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A11522CCVCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
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
         gxload_3( A396EmprCod, A4031CCTCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtccdefvar_linea") == 0 )
      {
         gxnrgridtccdefvar_linea_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TCCDef Var", ""), (short)(0)) ;
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

   public void gxnrgridtccdefvar_linea_newrow_invoke( )
   {
      nRC_GXsfl_133 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_133"))) ;
      nGXsfl_133_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_133_idx"))) ;
      sGXsfl_133_idx = httpContext.GetPar( "sGXsfl_133_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtccdefvar_linea_newrow( ) ;
      /* End function gxnrGridtccdefvar_linea_newrow_invoke */
   }

   public tccdefvar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tccdefvar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tccdefvar_impl.class ));
   }

   public tccdefvar_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCCTLinTpoD = new HTMLChoice();
      cmbCCTLinTpoI = new HTMLChoice();
      cmbCCVTpoDat = new HTMLChoice();
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
      if ( cmbCCTLinTpoI.getItemCount() > 0 )
      {
         A4048CCTLinTpoI = cmbCCTLinTpoI.getValidValue(A4048CCTLinTpoI) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTLinTpoI.setValue( GXutil.rtrim( A4048CCTLinTpoI) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Values", cmbCCTLinTpoI.ToJavascriptSource(), true);
      }
      if ( cmbCCVTpoDat.getItemCount() > 0 )
      {
         A11528CCVTpoDat = cmbCCVTpoDat.getValidValue(A11528CCVTpoDat) ;
         n11528CCVTpoDat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCVTpoDat.setValue( GXutil.rtrim( A11528CCVTpoDat) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCVTpoDat.getInternalname(), "Values", cmbCCVTpoDat.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "TCCDef Var", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCDefVar.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\TCCDefVar.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCTCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCTLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLinDsc_Internalname, GXutil.rtrim( A4043CCTLinDsc), GXutil.rtrim( localUtil.format( A4043CCTLinDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLinDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCTLinDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCTLinTpoD, cmbCCTLinTpoD.getInternalname(), GXutil.rtrim( A4044CCTLinTpoD), 1, cmbCCTLinTpoD.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCCTLinTpoD.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\TCCDefVar.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLinLgoD_Internalname, GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTLinLgoD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4045CCTLinLgoD), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4045CCTLinLgoD), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLinLgoD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCTLinLgoD_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLinPict_Internalname, GXutil.rtrim( A4046CCTLinPict), GXutil.rtrim( localUtil.format( A4046CCTLinPict, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLinPict_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCTLinPict_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLinVarW_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLinVarW_Internalname, httpContext.getMessage( "Variable Word", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLinVarW_Internalname, GXutil.rtrim( A4047CCTLinVarW), GXutil.rtrim( localUtil.format( A4047CCTLinVarW, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLinVarW_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCTLinVarW_Enabled, 0, "text", "", 32, "chr", 1, "row", 32, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCCTLinTpoI.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCCTLinTpoI.getInternalname(), httpContext.getMessage( "Tipo de Ingreso", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCTLinTpoI, cmbCCTLinTpoI.getInternalname(), GXutil.rtrim( A4048CCTLinTpoI), 1, cmbCCTLinTpoI.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCCTLinTpoI.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      cmbCCTLinTpoI.setValue( GXutil.rtrim( A4048CCTLinTpoI) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Values", cmbCCTLinTpoI.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTSta_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTSta_Internalname, httpContext.getMessage( "Standar", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTSta_Internalname, GXutil.rtrim( A4408CCTSta), GXutil.rtrim( localUtil.format( A4408CCTSta, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTSta_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCTSta_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCVCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCVCod_Internalname, httpContext.getMessage( "Variable Automática", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVCod_Internalname, GXutil.rtrim( A11522CCVCod), GXutil.rtrim( localUtil.format( A11522CCVCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCVCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCVPict_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCVPict_Internalname, httpContext.getMessage( "Mascara", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVPict_Internalname, GXutil.rtrim( A11526CCVPict), GXutil.rtrim( localUtil.format( A11526CCVPict, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVPict_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCVPict_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCVLgoDat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCVLgoDat_Internalname, httpContext.getMessage( "Largo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVLgoDat_Internalname, GXutil.ltrim( localUtil.ntoc( A11527CCVLgoDat, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCVLgoDat_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11527CCVLgoDat), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11527CCVLgoDat), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVLgoDat_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCVLgoDat_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCCVTpoDat.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCCVTpoDat.getInternalname(), httpContext.getMessage( "Tipo de Datos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCVTpoDat, cmbCCVTpoDat.getInternalname(), GXutil.rtrim( A11528CCVTpoDat), 1, cmbCCVTpoDat.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCCVTpoDat.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", "", true, (byte)(0), "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      cmbCCVTpoDat.setValue( GXutil.rtrim( A11528CCVTpoDat) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCVTpoDat.getInternalname(), "Values", cmbCCVTpoDat.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCVDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCVDsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVDsc_Internalname, GXutil.rtrim( A11529CCVDsc), GXutil.rtrim( localUtil.format( A11529CCVDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCVDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCVNorma_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCVNorma_Internalname, httpContext.getMessage( "Norma", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVNorma_Internalname, GXutil.rtrim( A13249CCVNorma), GXutil.rtrim( localUtil.format( A13249CCVNorma, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVNorma_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCVNorma_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCVEspecif_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCVEspecif_Internalname, httpContext.getMessage( "Especificacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCVEspecif_Internalname, GXutil.rtrim( A13250CCVEspecif), GXutil.rtrim( localUtil.format( A13250CCVEspecif, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCVEspecif_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCVEspecif_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLinDscL_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLinDscL_Internalname, httpContext.getMessage( "Desc. Larga", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtCCTLinDscL_Internalname, A11476CCTLinDscL, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"", (short)(0), 1, edtCCTLinDscL_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2048", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLineatable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelinea_Internalname, httpContext.getMessage( "Linea", ""), "", "", lblTitlelinea_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtccdefvar_linea( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCDefVar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtccdefvar_linea( )
   {
      /*  Grid Control  */
      startgridcontrol133( ) ;
      nGXsfl_133_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount623 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_623 = (short)(1) ;
            scanStart1SS623( ) ;
            while ( RcdFound623 != 0 )
            {
               init_level_properties623( ) ;
               getByPrimaryKey1SS623( ) ;
               addRow1SS623( ) ;
               scanNext1SS623( ) ;
            }
            scanEnd1SS623( ) ;
            nBlankRcdCount623 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1SS623( ) ;
         standaloneModal1SS623( ) ;
         sMode623 = Gx_mode ;
         while ( nGXsfl_133_idx < nRC_GXsfl_133 )
         {
            bGXsfl_133_Refreshing = true ;
            readRow1SS623( ) ;
            edtCCTValLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVALLIN_"+sGXsfl_133_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), !bGXsfl_133_Refreshing);
            edtCCTValDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVALDSC_"+sGXsfl_133_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), !bGXsfl_133_Refreshing);
            edtCCTVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVAL_"+sGXsfl_133_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), !bGXsfl_133_Refreshing);
            if ( ( nRcdExists_623 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1SS623( ) ;
            }
            sendRow1SS623( ) ;
            bGXsfl_133_Refreshing = false ;
         }
         Gx_mode = sMode623 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount623 = (short)(5) ;
         nRcdExists_623 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1SS623( ) ;
            while ( RcdFound623 != 0 )
            {
               sGXsfl_133_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_133_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_133623( ) ;
               init_level_properties623( ) ;
               standaloneNotModal1SS623( ) ;
               getByPrimaryKey1SS623( ) ;
               standaloneModal1SS623( ) ;
               addRow1SS623( ) ;
               scanNext1SS623( ) ;
            }
            scanEnd1SS623( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode623 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_133_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_133_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_133623( ) ;
      initAll1SS623( ) ;
      init_level_properties623( ) ;
      nRcdExists_623 = (short)(0) ;
      nIsMod_623 = (short)(0) ;
      nRcdDeleted_623 = (short)(0) ;
      nBlankRcdCount623 = (short)(nBlankRcdUsr623+nBlankRcdCount623) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount623 > 0 )
      {
         standaloneNotModal1SS623( ) ;
         standaloneModal1SS623( ) ;
         addRow1SS623( ) ;
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
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtccdefvar_lineaContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtccdefvar_linea", Gridtccdefvar_lineaContainer, subGridtccdefvar_linea_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtccdefvar_lineaContainerData", Gridtccdefvar_lineaContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtccdefvar_lineaContainerData"+"V", Gridtccdefvar_lineaContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtccdefvar_lineaContainerData"+"V"+"\" value='"+Gridtccdefvar_lineaContainer.GridValuesHidden()+"'/>") ;
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
         Z4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4031CCTCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z4034CCTLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4043CCTLinDsc = httpContext.cgiGet( "Z4043CCTLinDsc") ;
         Z4044CCTLinTpoD = httpContext.cgiGet( "Z4044CCTLinTpoD") ;
         Z4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( "Z4045CCTLinLgoD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4046CCTLinPict = httpContext.cgiGet( "Z4046CCTLinPict") ;
         Z4047CCTLinVarW = httpContext.cgiGet( "Z4047CCTLinVarW") ;
         Z4048CCTLinTpoI = httpContext.cgiGet( "Z4048CCTLinTpoI") ;
         Z4408CCTSta = httpContext.cgiGet( "Z4408CCTSta") ;
         Z13249CCVNorma = httpContext.cgiGet( "Z13249CCVNorma") ;
         Z13250CCVEspecif = httpContext.cgiGet( "Z13250CCVEspecif") ;
         Z11476CCTLinDscL = httpContext.cgiGet( "Z11476CCTLinDscL") ;
         Z11522CCVCod = httpContext.cgiGet( "Z11522CCVCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_133 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_133"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
         cmbCCTLinTpoD.setName( cmbCCTLinTpoD.getInternalname() );
         cmbCCTLinTpoD.setValue( httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) );
         A4044CCTLinTpoD = httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCTLINLGOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCTLinLgoD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4045CCTLinLgoD = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         }
         else
         {
            A4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         }
         A4046CCTLinPict = httpContext.cgiGet( edtCCTLinPict_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
         A4047CCTLinVarW = GXutil.upper( httpContext.cgiGet( edtCCTLinVarW_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4047CCTLinVarW", A4047CCTLinVarW);
         cmbCCTLinTpoI.setName( cmbCCTLinTpoI.getInternalname() );
         cmbCCTLinTpoI.setValue( httpContext.cgiGet( cmbCCTLinTpoI.getInternalname()) );
         A4048CCTLinTpoI = httpContext.cgiGet( cmbCCTLinTpoI.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
         A4408CCTSta = httpContext.cgiGet( edtCCTSta_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4408CCTSta", A4408CCTSta);
         A11522CCVCod = httpContext.cgiGet( edtCCVCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
         A11526CCVPict = httpContext.cgiGet( edtCCVPict_Internalname) ;
         n11526CCVPict = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
         A11527CCVLgoDat = (short)(localUtil.ctol( httpContext.cgiGet( edtCCVLgoDat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11527CCVLgoDat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
         cmbCCVTpoDat.setName( cmbCCVTpoDat.getInternalname() );
         cmbCCVTpoDat.setValue( httpContext.cgiGet( cmbCCVTpoDat.getInternalname()) );
         A11528CCVTpoDat = httpContext.cgiGet( cmbCCVTpoDat.getInternalname()) ;
         n11528CCVTpoDat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
         A11529CCVDsc = httpContext.cgiGet( edtCCVDsc_Internalname) ;
         n11529CCVDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
         A13249CCVNorma = httpContext.cgiGet( edtCCVNorma_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13249CCVNorma", A13249CCVNorma);
         A13250CCVEspecif = httpContext.cgiGet( edtCCVEspecif_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13250CCVEspecif", A13250CCVEspecif);
         A11476CCTLinDscL = httpContext.cgiGet( edtCCTLinDscL_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11476CCTLinDscL", A11476CCTLinDscL);
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
            initAll1SS622( ) ;
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
      disableAttributes1SS622( ) ;
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

   public void confirm_1SS623( )
   {
      nGXsfl_133_idx = 0 ;
      while ( nGXsfl_133_idx < nRC_GXsfl_133 )
      {
         readRow1SS623( ) ;
         if ( ( nRcdExists_623 != 0 ) || ( nIsMod_623 != 0 ) )
         {
            getKey1SS623( ) ;
            if ( ( nRcdExists_623 == 0 ) && ( nRcdDeleted_623 == 0 ) )
            {
               if ( RcdFound623 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1SS623( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1SS623( ) ;
                     closeExtendedTableCursors1SS623( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CCTVALLIN_" + sGXsfl_133_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCCTValLin_Internalname ;
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
                     getByPrimaryKey1SS623( ) ;
                     load1SS623( ) ;
                     beforeValidate1SS623( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1SS623( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_623 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1SS623( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1SS623( ) ;
                           closeExtendedTableCursors1SS623( ) ;
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
                     GXCCtl = "CCTVALLIN_" + sGXsfl_133_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTValLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCTValLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTValDsc_Internalname, GXutil.rtrim( A4050CCTValDsc)) ;
         httpContext.changePostValue( edtCCTVal_Internalname, GXutil.rtrim( A4051CCTVal)) ;
         httpContext.changePostValue( "ZT_"+"Z4049CCTValLin_"+sGXsfl_133_idx, GXutil.ltrim( localUtil.ntoc( Z4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4050CCTValDsc_"+sGXsfl_133_idx, GXutil.rtrim( Z4050CCTValDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4051CCTVal_"+sGXsfl_133_idx, GXutil.rtrim( Z4051CCTVal)) ;
         httpContext.changePostValue( "nRcdDeleted_623_"+sGXsfl_133_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_623_"+sGXsfl_133_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_623_"+sGXsfl_133_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_623 != 0 )
         {
            httpContext.changePostValue( "CCTVALLIN_"+sGXsfl_133_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTVALDSC_"+sGXsfl_133_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTVAL_"+sGXsfl_133_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1SS0( )
   {
   }

   public void zm1SS622( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4043CCTLinDsc = T01SS5_A4043CCTLinDsc[0] ;
            Z4044CCTLinTpoD = T01SS5_A4044CCTLinTpoD[0] ;
            Z4045CCTLinLgoD = T01SS5_A4045CCTLinLgoD[0] ;
            Z4046CCTLinPict = T01SS5_A4046CCTLinPict[0] ;
            Z4047CCTLinVarW = T01SS5_A4047CCTLinVarW[0] ;
            Z4048CCTLinTpoI = T01SS5_A4048CCTLinTpoI[0] ;
            Z4408CCTSta = T01SS5_A4408CCTSta[0] ;
            Z13249CCVNorma = T01SS5_A13249CCVNorma[0] ;
            Z13250CCVEspecif = T01SS5_A13250CCVEspecif[0] ;
            Z11476CCTLinDscL = T01SS5_A11476CCTLinDscL[0] ;
            Z11522CCVCod = T01SS5_A11522CCVCod[0] ;
         }
         else
         {
            Z4043CCTLinDsc = A4043CCTLinDsc ;
            Z4044CCTLinTpoD = A4044CCTLinTpoD ;
            Z4045CCTLinLgoD = A4045CCTLinLgoD ;
            Z4046CCTLinPict = A4046CCTLinPict ;
            Z4047CCTLinVarW = A4047CCTLinVarW ;
            Z4048CCTLinTpoI = A4048CCTLinTpoI ;
            Z4408CCTSta = A4408CCTSta ;
            Z13249CCVNorma = A13249CCVNorma ;
            Z13250CCVEspecif = A13250CCVEspecif ;
            Z11476CCTLinDscL = A11476CCTLinDscL ;
            Z11522CCVCod = A11522CCVCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z4034CCTLin = A4034CCTLin ;
         Z4043CCTLinDsc = A4043CCTLinDsc ;
         Z4044CCTLinTpoD = A4044CCTLinTpoD ;
         Z4045CCTLinLgoD = A4045CCTLinLgoD ;
         Z4046CCTLinPict = A4046CCTLinPict ;
         Z4047CCTLinVarW = A4047CCTLinVarW ;
         Z4048CCTLinTpoI = A4048CCTLinTpoI ;
         Z4408CCTSta = A4408CCTSta ;
         Z13249CCVNorma = A13249CCVNorma ;
         Z13250CCVEspecif = A13250CCVEspecif ;
         Z11476CCTLinDscL = A11476CCTLinDscL ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z11522CCVCod = A11522CCVCod ;
         Z407EmprNom = A407EmprNom ;
         Z11526CCVPict = A11526CCVPict ;
         Z11527CCVLgoDat = A11527CCVLgoDat ;
         Z11528CCVTpoDat = A11528CCVTpoDat ;
         Z11529CCVDsc = A11529CCVDsc ;
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

   public void load1SS622( )
   {
      /* Using cursor T01SS9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound622 = (short)(1) ;
         A407EmprNom = T01SS9_A407EmprNom[0] ;
         n407EmprNom = T01SS9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4043CCTLinDsc = T01SS9_A4043CCTLinDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
         A4044CCTLinTpoD = T01SS9_A4044CCTLinTpoD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
         A4045CCTLinLgoD = T01SS9_A4045CCTLinLgoD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         A4046CCTLinPict = T01SS9_A4046CCTLinPict[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
         A4047CCTLinVarW = T01SS9_A4047CCTLinVarW[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4047CCTLinVarW", A4047CCTLinVarW);
         A4048CCTLinTpoI = T01SS9_A4048CCTLinTpoI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
         A4408CCTSta = T01SS9_A4408CCTSta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4408CCTSta", A4408CCTSta);
         A11526CCVPict = T01SS9_A11526CCVPict[0] ;
         n11526CCVPict = T01SS9_n11526CCVPict[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
         A11527CCVLgoDat = T01SS9_A11527CCVLgoDat[0] ;
         n11527CCVLgoDat = T01SS9_n11527CCVLgoDat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
         A11528CCVTpoDat = T01SS9_A11528CCVTpoDat[0] ;
         n11528CCVTpoDat = T01SS9_n11528CCVTpoDat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
         A11529CCVDsc = T01SS9_A11529CCVDsc[0] ;
         n11529CCVDsc = T01SS9_n11529CCVDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
         A13249CCVNorma = T01SS9_A13249CCVNorma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13249CCVNorma", A13249CCVNorma);
         A13250CCVEspecif = T01SS9_A13250CCVEspecif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13250CCVEspecif", A13250CCVEspecif);
         A11476CCTLinDscL = T01SS9_A11476CCTLinDscL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11476CCTLinDscL", A11476CCTLinDscL);
         A11522CCVCod = T01SS9_A11522CCVCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
         zm1SS622( -1) ;
      }
      pr_default.close(7);
      onLoadActions1SS622( ) ;
   }

   public void onLoadActions1SS622( )
   {
   }

   public void checkExtendedTable1SS622( )
   {
      nIsDirty_622 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01SS6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SS6_A407EmprNom[0] ;
      n407EmprNom = T01SS6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01SS8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A11522CCVCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Variables Automáticas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11526CCVPict = T01SS8_A11526CCVPict[0] ;
      n11526CCVPict = T01SS8_n11526CCVPict[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
      A11527CCVLgoDat = T01SS8_A11527CCVLgoDat[0] ;
      n11527CCVLgoDat = T01SS8_n11527CCVLgoDat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
      A11528CCVTpoDat = T01SS8_A11528CCVTpoDat[0] ;
      n11528CCVTpoDat = T01SS8_n11528CCVTpoDat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
      A11529CCVDsc = T01SS8_A11529CCVDsc[0] ;
      n11529CCVDsc = T01SS8_n11529CCVDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
      pr_default.close(6);
      /* Using cursor T01SS7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1SS622( )
   {
      pr_default.close(4);
      pr_default.close(6);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01SS10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SS10_A407EmprNom[0] ;
      n407EmprNom = T01SS10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_4( String A396EmprCod ,
                         String A11522CCVCod )
   {
      /* Using cursor T01SS11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A11522CCVCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Variables Automáticas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11526CCVPict = T01SS11_A11526CCVPict[0] ;
      n11526CCVPict = T01SS11_n11526CCVPict[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
      A11527CCVLgoDat = T01SS11_A11527CCVLgoDat[0] ;
      n11527CCVLgoDat = T01SS11_n11527CCVLgoDat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
      A11528CCVTpoDat = T01SS11_A11528CCVTpoDat[0] ;
      n11528CCVTpoDat = T01SS11_n11528CCVTpoDat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
      A11529CCVDsc = T01SS11_A11529CCVDsc[0] ;
      n11529CCVDsc = T01SS11_n11529CCVDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11526CCVPict))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11527CCVLgoDat, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11528CCVTpoDat))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11529CCVDsc))+"\"") ;
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
                         int A4031CCTCod )
   {
      /* Using cursor T01SS12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1SS622( )
   {
      /* Using cursor T01SS13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound622 = (short)(1) ;
      }
      else
      {
         RcdFound622 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SS5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1SS622( 1) ;
         RcdFound622 = (short)(1) ;
         A4034CCTLin = T01SS5_A4034CCTLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
         A4043CCTLinDsc = T01SS5_A4043CCTLinDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
         A4044CCTLinTpoD = T01SS5_A4044CCTLinTpoD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
         A4045CCTLinLgoD = T01SS5_A4045CCTLinLgoD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         A4046CCTLinPict = T01SS5_A4046CCTLinPict[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
         A4047CCTLinVarW = T01SS5_A4047CCTLinVarW[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4047CCTLinVarW", A4047CCTLinVarW);
         A4048CCTLinTpoI = T01SS5_A4048CCTLinTpoI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
         A4408CCTSta = T01SS5_A4408CCTSta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4408CCTSta", A4408CCTSta);
         A13249CCVNorma = T01SS5_A13249CCVNorma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13249CCVNorma", A13249CCVNorma);
         A13250CCVEspecif = T01SS5_A13250CCVEspecif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13250CCVEspecif", A13250CCVEspecif);
         A11476CCTLinDscL = T01SS5_A11476CCTLinDscL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11476CCTLinDscL", A11476CCTLinDscL);
         A396EmprCod = T01SS5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = T01SS5_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A11522CCVCod = T01SS5_A11522CCVCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         sMode622 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1SS622( ) ;
         if ( AnyError == 1 )
         {
            RcdFound622 = (short)(0) ;
            initializeNonKey1SS622( ) ;
         }
         Gx_mode = sMode622 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound622 = (short)(0) ;
         initializeNonKey1SS622( ) ;
         sMode622 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode622 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1SS622( ) ;
      if ( RcdFound622 == 0 )
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
      RcdFound622 = (short)(0) ;
      /* Using cursor T01SS14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4031CCTCod), Integer.valueOf(A4031CCTCod), A396EmprCod, Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01SS14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SS14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SS14_A4031CCTCod[0] < A4031CCTCod ) || ( T01SS14_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01SS14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SS14_A4034CCTLin[0] < A4034CCTLin ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01SS14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SS14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SS14_A4031CCTCod[0] > A4031CCTCod ) || ( T01SS14_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01SS14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SS14_A4034CCTLin[0] > A4034CCTLin ) ) )
         {
            A396EmprCod = T01SS14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4031CCTCod = T01SS14_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A4034CCTLin = T01SS14_A4034CCTLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
            RcdFound622 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound622 = (short)(0) ;
      /* Using cursor T01SS15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4031CCTCod), Integer.valueOf(A4031CCTCod), A396EmprCod, Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01SS15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SS15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SS15_A4031CCTCod[0] > A4031CCTCod ) || ( T01SS15_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01SS15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SS15_A4034CCTLin[0] > A4034CCTLin ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01SS15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SS15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SS15_A4031CCTCod[0] < A4031CCTCod ) || ( T01SS15_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01SS15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SS15_A4034CCTLin[0] < A4034CCTLin ) ) )
         {
            A396EmprCod = T01SS15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4031CCTCod = T01SS15_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A4034CCTLin = T01SS15_A4034CCTLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
            RcdFound622 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SS622( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SS622( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound622 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) || ( A4034CCTLin != Z4034CCTLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
               update1SS622( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) || ( A4034CCTLin != Z4034CCTLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SS622( ) ;
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
                  insert1SS622( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) || ( A4034CCTLin != Z4034CCTLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
      if ( RcdFound622 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCCTLinDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1SS622( ) ;
      if ( RcdFound622 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCTLinDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1SS622( ) ;
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
      if ( RcdFound622 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCTLinDsc_Internalname ;
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
      if ( RcdFound622 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCTLinDsc_Internalname ;
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
      scanStart1SS622( ) ;
      if ( RcdFound622 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound622 != 0 )
         {
            scanNext1SS622( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCTLinDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1SS622( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1SS622( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SS4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z4043CCTLinDsc, T01SS4_A4043CCTLinDsc[0]) != 0 ) || ( GXutil.strcmp(Z4044CCTLinTpoD, T01SS4_A4044CCTLinTpoD[0]) != 0 ) || ( Z4045CCTLinLgoD != T01SS4_A4045CCTLinLgoD[0] ) || ( GXutil.strcmp(Z4046CCTLinPict, T01SS4_A4046CCTLinPict[0]) != 0 ) || ( GXutil.strcmp(Z4047CCTLinVarW, T01SS4_A4047CCTLinVarW[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4048CCTLinTpoI, T01SS4_A4048CCTLinTpoI[0]) != 0 ) || ( GXutil.strcmp(Z4408CCTSta, T01SS4_A4408CCTSta[0]) != 0 ) || ( GXutil.strcmp(Z13249CCVNorma, T01SS4_A13249CCVNorma[0]) != 0 ) || ( GXutil.strcmp(Z13250CCVEspecif, T01SS4_A13250CCVEspecif[0]) != 0 ) || ( GXutil.strcmp(Z11476CCTLinDscL, T01SS4_A11476CCTLinDscL[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11522CCVCod, T01SS4_A11522CCVCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4043CCTLinDsc, T01SS4_A4043CCTLinDsc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdefvar:[seudo value changed for attri]"+"CCTLinDsc");
               GXutil.writeLogRaw("Old: ",Z4043CCTLinDsc);
               GXutil.writeLogRaw("Current: ",T01SS4_A4043CCTLinDsc[0]);
            }
            if ( GXutil.strcmp(Z4044CCTLinTpoD, T01SS4_A4044CCTLinTpoD[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdefvar:[seudo value changed for attri]"+"CCTLinTpoD");
               GXutil.writeLogRaw("Old: ",Z4044CCTLinTpoD);
               GXutil.writeLogRaw("Current: ",T01SS4_A4044CCTLinTpoD[0]);
            }
            if ( Z4045CCTLinLgoD != T01SS4_A4045CCTLinLgoD[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdefvar:[seudo value changed for attri]"+"CCTLinLgoD");
               GXutil.writeLogRaw("Old: ",Z4045CCTLinLgoD);
               GXutil.writeLogRaw("Current: ",T01SS4_A4045CCTLinLgoD[0]);
            }
            if ( GXutil.strcmp(Z4046CCTLinPict, T01SS4_A4046CCTLinPict[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdefvar:[seudo value changed for attri]"+"CCTLinPict");
               GXutil.writeLogRaw("Old: ",Z4046CCTLinPict);
               GXutil.writeLogRaw("Current: ",T01SS4_A4046CCTLinPict[0]);
            }
            if ( GXutil.strcmp(Z4047CCTLinVarW, T01SS4_A4047CCTLinVarW[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdefvar:[seudo value changed for attri]"+"CCTLinVarW");
               GXutil.writeLogRaw("Old: ",Z4047CCTLinVarW);
               GXutil.writeLogRaw("Current: ",T01SS4_A4047CCTLinVarW[0]);
            }
            if ( GXutil.strcmp(Z4048CCTLinTpoI, T01SS4_A4048CCTLinTpoI[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdefvar:[seudo value changed for attri]"+"CCTLinTpoI");
               GXutil.writeLogRaw("Old: ",Z4048CCTLinTpoI);
               GXutil.writeLogRaw("Current: ",T01SS4_A4048CCTLinTpoI[0]);
            }
            if ( GXutil.strcmp(Z4408CCTSta, T01SS4_A4408CCTSta[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdefvar:[seudo value changed for attri]"+"CCTSta");
               GXutil.writeLogRaw("Old: ",Z4408CCTSta);
               GXutil.writeLogRaw("Current: ",T01SS4_A4408CCTSta[0]);
            }
            if ( GXutil.strcmp(Z13249CCVNorma, T01SS4_A13249CCVNorma[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdefvar:[seudo value changed for attri]"+"CCVNorma");
               GXutil.writeLogRaw("Old: ",Z13249CCVNorma);
               GXutil.writeLogRaw("Current: ",T01SS4_A13249CCVNorma[0]);
            }
            if ( GXutil.strcmp(Z13250CCVEspecif, T01SS4_A13250CCVEspecif[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdefvar:[seudo value changed for attri]"+"CCVEspecif");
               GXutil.writeLogRaw("Old: ",Z13250CCVEspecif);
               GXutil.writeLogRaw("Current: ",T01SS4_A13250CCVEspecif[0]);
            }
            if ( GXutil.strcmp(Z11476CCTLinDscL, T01SS4_A11476CCTLinDscL[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdefvar:[seudo value changed for attri]"+"CCTLinDscL");
               GXutil.writeLogRaw("Old: ",Z11476CCTLinDscL);
               GXutil.writeLogRaw("Current: ",T01SS4_A11476CCTLinDscL[0]);
            }
            if ( GXutil.strcmp(Z11522CCVCod, T01SS4_A11522CCVCod[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdefvar:[seudo value changed for attri]"+"CCVCod");
               GXutil.writeLogRaw("Old: ",Z11522CCVCod);
               GXutil.writeLogRaw("Current: ",T01SS4_A11522CCVCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCDef1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SS622( )
   {
      beforeValidate1SS622( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SS622( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SS622( 0) ;
         checkOptimisticConcurrency1SS622( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SS622( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SS622( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SS16 */
                  pr_default.execute(14, new Object[] {Short.valueOf(A4034CCTLin), A4043CCTLinDsc, A4044CCTLinTpoD, Short.valueOf(A4045CCTLinLgoD), A4046CCTLinPict, A4047CCTLinVarW, A4048CCTLinTpoI, A4408CCTSta, A13249CCVNorma, A13250CCVEspecif, A11476CCTLinDscL, A396EmprCod, Integer.valueOf(A4031CCTCod), A11522CCVCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        processLevel1SS622( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1SS0( ) ;
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
            load1SS622( ) ;
         }
         endLevel1SS622( ) ;
      }
      closeExtendedTableCursors1SS622( ) ;
   }

   public void update1SS622( )
   {
      beforeValidate1SS622( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SS622( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SS622( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SS622( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SS622( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SS17 */
                  pr_default.execute(15, new Object[] {A4043CCTLinDsc, A4044CCTLinTpoD, Short.valueOf(A4045CCTLinLgoD), A4046CCTLinPict, A4047CCTLinVarW, A4048CCTLinTpoI, A4408CCTSta, A13249CCVNorma, A13250CCVEspecif, A11476CCTLinDscL, A11522CCVCod, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SS622( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1SS622( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1SS0( ) ;
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
         endLevel1SS622( ) ;
      }
      closeExtendedTableCursors1SS622( ) ;
   }

   public void deferredUpdate1SS622( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1SS622( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SS622( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SS622( ) ;
         afterConfirm1SS622( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SS622( ) ;
            if ( AnyError == 0 )
            {
               scanStart1SS623( ) ;
               while ( RcdFound623 != 0 )
               {
                  getByPrimaryKey1SS623( ) ;
                  delete1SS623( ) ;
                  scanNext1SS623( ) ;
               }
               scanEnd1SS623( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SS18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound622 == 0 )
                        {
                           initAll1SS622( ) ;
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
                        resetCaption1SS0( ) ;
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
      sMode622 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SS622( ) ;
      Gx_mode = sMode622 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SS622( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SS19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T01SS19_A407EmprNom[0] ;
         n407EmprNom = T01SS19_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         /* Using cursor T01SS20 */
         pr_default.execute(18, new Object[] {A396EmprCod, A11522CCVCod});
         A11526CCVPict = T01SS20_A11526CCVPict[0] ;
         n11526CCVPict = T01SS20_n11526CCVPict[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
         A11527CCVLgoDat = T01SS20_A11527CCVLgoDat[0] ;
         n11527CCVLgoDat = T01SS20_n11527CCVLgoDat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
         A11528CCVTpoDat = T01SS20_A11528CCVTpoDat[0] ;
         n11528CCVTpoDat = T01SS20_n11528CCVTpoDat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
         A11529CCVDsc = T01SS20_A11529CCVDsc[0] ;
         n11529CCVDsc = T01SS20_n11529CCVDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
         pr_default.close(18);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01SS21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Valores Estandars", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01SS22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSta", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01SS23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void processNestedLevel1SS623( )
   {
      nGXsfl_133_idx = 0 ;
      while ( nGXsfl_133_idx < nRC_GXsfl_133 )
      {
         readRow1SS623( ) ;
         if ( ( nRcdExists_623 != 0 ) || ( nIsMod_623 != 0 ) )
         {
            standaloneNotModal1SS623( ) ;
            getKey1SS623( ) ;
            if ( ( nRcdExists_623 == 0 ) && ( nRcdDeleted_623 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1SS623( ) ;
            }
            else
            {
               if ( RcdFound623 != 0 )
               {
                  if ( ( nRcdDeleted_623 != 0 ) && ( nRcdExists_623 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1SS623( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_623 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1SS623( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_623 == 0 )
                  {
                     GXCCtl = "CCTVALLIN_" + sGXsfl_133_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTValLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCTValLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTValDsc_Internalname, GXutil.rtrim( A4050CCTValDsc)) ;
         httpContext.changePostValue( edtCCTVal_Internalname, GXutil.rtrim( A4051CCTVal)) ;
         httpContext.changePostValue( "ZT_"+"Z4049CCTValLin_"+sGXsfl_133_idx, GXutil.ltrim( localUtil.ntoc( Z4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4050CCTValDsc_"+sGXsfl_133_idx, GXutil.rtrim( Z4050CCTValDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4051CCTVal_"+sGXsfl_133_idx, GXutil.rtrim( Z4051CCTVal)) ;
         httpContext.changePostValue( "nRcdDeleted_623_"+sGXsfl_133_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_623_"+sGXsfl_133_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_623_"+sGXsfl_133_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_623 != 0 )
         {
            httpContext.changePostValue( "CCTVALLIN_"+sGXsfl_133_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTVALDSC_"+sGXsfl_133_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTVAL_"+sGXsfl_133_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1SS623( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_623 = (short)(0) ;
      nIsMod_623 = (short)(0) ;
      nRcdDeleted_623 = (short)(0) ;
   }

   public void processLevel1SS622( )
   {
      /* Save parent mode. */
      sMode622 = Gx_mode ;
      processNestedLevel1SS623( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode622 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1SS622( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SS622( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tccdefvar");
         if ( AnyError == 0 )
         {
            confirmValues1SS0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tccdefvar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SS622( )
   {
      /* Using cursor T01SS24 */
      pr_default.execute(22);
      RcdFound622 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound622 = (short)(1) ;
         A396EmprCod = T01SS24_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = T01SS24_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = T01SS24_A4034CCTLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SS622( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound622 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound622 = (short)(1) ;
         A396EmprCod = T01SS24_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = T01SS24_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = T01SS24_A4034CCTLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
      }
   }

   public void scanEnd1SS622( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1SS622( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SS622( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SS622( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SS622( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SS622( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SS622( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SS622( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
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
      edtCCTLinVarW_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinVarW_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinVarW_Enabled), 5, 0), true);
      cmbCCTLinTpoI.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoI.getEnabled(), 5, 0), true);
      edtCCTSta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), true);
      edtCCVCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVCod_Enabled), 5, 0), true);
      edtCCVPict_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVPict_Enabled), 5, 0), true);
      edtCCVLgoDat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVLgoDat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVLgoDat_Enabled), 5, 0), true);
      cmbCCVTpoDat.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCVTpoDat.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCVTpoDat.getEnabled(), 5, 0), true);
      edtCCVDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVDsc_Enabled), 5, 0), true);
      edtCCVNorma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVNorma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVNorma_Enabled), 5, 0), true);
      edtCCVEspecif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVEspecif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVEspecif_Enabled), 5, 0), true);
      edtCCTLinDscL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDscL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDscL_Enabled), 5, 0), true);
   }

   public void zm1SS623( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4050CCTValDsc = T01SS3_A4050CCTValDsc[0] ;
            Z4051CCTVal = T01SS3_A4051CCTVal[0] ;
         }
         else
         {
            Z4050CCTValDsc = A4050CCTValDsc ;
            Z4051CCTVal = A4051CCTVal ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         Z4049CCTValLin = A4049CCTValLin ;
         Z4050CCTValDsc = A4050CCTValDsc ;
         Z4051CCTVal = A4051CCTVal ;
      }
   }

   public void standaloneNotModal1SS623( )
   {
   }

   public void standaloneModal1SS623( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCCTValLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), !bGXsfl_133_Refreshing);
      }
      else
      {
         edtCCTValLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), !bGXsfl_133_Refreshing);
      }
   }

   public void load1SS623( )
   {
      /* Using cursor T01SS25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound623 = (short)(1) ;
         A4050CCTValDsc = T01SS25_A4050CCTValDsc[0] ;
         A4051CCTVal = T01SS25_A4051CCTVal[0] ;
         zm1SS623( -5) ;
      }
      pr_default.close(23);
      onLoadActions1SS623( ) ;
   }

   public void onLoadActions1SS623( )
   {
   }

   public void checkExtendedTable1SS623( )
   {
      nIsDirty_623 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1SS623( ) ;
   }

   public void closeExtendedTableCursors1SS623( )
   {
   }

   public void enableDisable1SS623( )
   {
   }

   public void getKey1SS623( )
   {
      /* Using cursor T01SS26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound623 = (short)(1) ;
      }
      else
      {
         RcdFound623 = (short)(0) ;
      }
      pr_default.close(24);
   }

   public void getByPrimaryKey1SS623( )
   {
      /* Using cursor T01SS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1SS623( 5) ;
         RcdFound623 = (short)(1) ;
         initializeNonKey1SS623( ) ;
         A4049CCTValLin = T01SS3_A4049CCTValLin[0] ;
         A4050CCTValDsc = T01SS3_A4050CCTValDsc[0] ;
         A4051CCTVal = T01SS3_A4051CCTVal[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         Z4049CCTValLin = A4049CCTValLin ;
         sMode623 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1SS623( ) ;
         load1SS623( ) ;
         Gx_mode = sMode623 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound623 = (short)(0) ;
         initializeNonKey1SS623( ) ;
         sMode623 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1SS623( ) ;
         Gx_mode = sMode623 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1SS623( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1SS623( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4050CCTValDsc, T01SS2_A4050CCTValDsc[0]) != 0 ) || ( GXutil.strcmp(Z4051CCTVal, T01SS2_A4051CCTVal[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4050CCTValDsc, T01SS2_A4050CCTValDsc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdefvar:[seudo value changed for attri]"+"CCTValDsc");
               GXutil.writeLogRaw("Old: ",Z4050CCTValDsc);
               GXutil.writeLogRaw("Current: ",T01SS2_A4050CCTValDsc[0]);
            }
            if ( GXutil.strcmp(Z4051CCTVal, T01SS2_A4051CCTVal[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdefvar:[seudo value changed for attri]"+"CCTVal");
               GXutil.writeLogRaw("Old: ",Z4051CCTVal);
               GXutil.writeLogRaw("Current: ",T01SS2_A4051CCTVal[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCDef2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SS623( )
   {
      beforeValidate1SS623( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SS623( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SS623( 0) ;
         checkOptimisticConcurrency1SS623( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SS623( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SS623( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SS27 */
                  pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin), A4050CCTValDsc, A4051CCTVal});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
                  if ( (pr_default.getStatus(25) == 1) )
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
            load1SS623( ) ;
         }
         endLevel1SS623( ) ;
      }
      closeExtendedTableCursors1SS623( ) ;
   }

   public void update1SS623( )
   {
      beforeValidate1SS623( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SS623( ) ;
      }
      if ( ( nIsMod_623 != 0 ) || ( nIsDirty_623 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1SS623( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1SS623( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1SS623( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01SS28 */
                     pr_default.execute(26, new Object[] {A4050CCTValDsc, A4051CCTVal, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
                     if ( (pr_default.getStatus(26) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef2"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1SS623( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1SS623( ) ;
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
            endLevel1SS623( ) ;
         }
      }
      closeExtendedTableCursors1SS623( ) ;
   }

   public void deferredUpdate1SS623( )
   {
   }

   public void delete1SS623( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1SS623( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SS623( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SS623( ) ;
         afterConfirm1SS623( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SS623( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SS29 */
               pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
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
      endLevel1SS623( ) ;
      Gx_mode = sMode623 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SS623( )
   {
      standaloneModal1SS623( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1SS623( )
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

   public void scanStart1SS623( )
   {
      /* Scan By routine */
      /* Using cursor T01SS30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      RcdFound623 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound623 = (short)(1) ;
         A4049CCTValLin = T01SS30_A4049CCTValLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SS623( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound623 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound623 = (short)(1) ;
         A4049CCTValLin = T01SS30_A4049CCTValLin[0] ;
      }
   }

   public void scanEnd1SS623( )
   {
      pr_default.close(28);
   }

   public void afterConfirm1SS623( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SS623( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SS623( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SS623( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SS623( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SS623( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SS623( )
   {
      edtCCTValLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), !bGXsfl_133_Refreshing);
      edtCCTValDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), !bGXsfl_133_Refreshing);
      edtCCTVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), !bGXsfl_133_Refreshing);
   }

   public void send_integrity_lvl_hashes1SS623( )
   {
   }

   public void send_integrity_lvl_hashes1SS622( )
   {
   }

   public void subsflControlProps_133623( )
   {
      edtCCTValLin_Internalname = "CCTVALLIN_"+sGXsfl_133_idx ;
      edtCCTValDsc_Internalname = "CCTVALDSC_"+sGXsfl_133_idx ;
      edtCCTVal_Internalname = "CCTVAL_"+sGXsfl_133_idx ;
   }

   public void subsflControlProps_fel_133623( )
   {
      edtCCTValLin_Internalname = "CCTVALLIN_"+sGXsfl_133_fel_idx ;
      edtCCTValDsc_Internalname = "CCTVALDSC_"+sGXsfl_133_fel_idx ;
      edtCCTVal_Internalname = "CCTVAL_"+sGXsfl_133_fel_idx ;
   }

   public void addRow1SS623( )
   {
      nGXsfl_133_idx = (int)(nGXsfl_133_idx+1) ;
      sGXsfl_133_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_133_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_133623( ) ;
      sendRow1SS623( ) ;
   }

   public void sendRow1SS623( )
   {
      Gridtccdefvar_lineaRow = GXWebRow.GetNew(context) ;
      if ( subGridtccdefvar_linea_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtccdefvar_linea_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtccdefvar_linea_Class, "") != 0 )
         {
            subGridtccdefvar_linea_Linesclass = subGridtccdefvar_linea_Class+"Odd" ;
         }
      }
      else if ( subGridtccdefvar_linea_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtccdefvar_linea_Backstyle = (byte)(0) ;
         subGridtccdefvar_linea_Backcolor = subGridtccdefvar_linea_Allbackcolor ;
         if ( GXutil.strcmp(subGridtccdefvar_linea_Class, "") != 0 )
         {
            subGridtccdefvar_linea_Linesclass = subGridtccdefvar_linea_Class+"Uniform" ;
         }
      }
      else if ( subGridtccdefvar_linea_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtccdefvar_linea_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtccdefvar_linea_Class, "") != 0 )
         {
            subGridtccdefvar_linea_Linesclass = subGridtccdefvar_linea_Class+"Odd" ;
         }
         subGridtccdefvar_linea_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtccdefvar_linea_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtccdefvar_linea_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_133_idx) % (2))) == 0 )
         {
            subGridtccdefvar_linea_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtccdefvar_linea_Class, "") != 0 )
            {
               subGridtccdefvar_linea_Linesclass = subGridtccdefvar_linea_Class+"Even" ;
            }
         }
         else
         {
            subGridtccdefvar_linea_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtccdefvar_linea_Class, "") != 0 )
            {
               subGridtccdefvar_linea_Linesclass = subGridtccdefvar_linea_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_623_" + sGXsfl_133_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 134,'',false,'" + sGXsfl_133_idx + "',133)\"" ;
      ROClassString = "Attribute" ;
      Gridtccdefvar_lineaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTValLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4049CCTValLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTValLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTValLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(133),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_623_" + sGXsfl_133_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_133_idx + "',133)\"" ;
      ROClassString = "Attribute" ;
      Gridtccdefvar_lineaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTValDsc_Internalname,GXutil.rtrim( A4050CCTValDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,135);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTValDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTValDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(133),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_623_" + sGXsfl_133_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 136,'',false,'" + sGXsfl_133_idx + "',133)\"" ;
      ROClassString = "Attribute" ;
      Gridtccdefvar_lineaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTVal_Internalname,GXutil.rtrim( A4051CCTVal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(133),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridtccdefvar_lineaRow);
      send_integrity_lvl_hashes1SS623( ) ;
      GXCCtl = "Z4049CCTValLin_" + sGXsfl_133_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4050CCTValDsc_" + sGXsfl_133_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4050CCTValDsc));
      GXCCtl = "Z4051CCTVal_" + sGXsfl_133_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4051CCTVal));
      GXCCtl = "nRcdDeleted_623_" + sGXsfl_133_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_623_" + sGXsfl_133_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_623_" + sGXsfl_133_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVALLIN_"+sGXsfl_133_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVALDSC_"+sGXsfl_133_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVAL_"+sGXsfl_133_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtccdefvar_lineaContainer.AddRow(Gridtccdefvar_lineaRow);
   }

   public void readRow1SS623( )
   {
      nGXsfl_133_idx = (int)(nGXsfl_133_idx+1) ;
      sGXsfl_133_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_133_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_133623( ) ;
      edtCCTValLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVALLIN_"+sGXsfl_133_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTValDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVALDSC_"+sGXsfl_133_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVAL_"+sGXsfl_133_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTValLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTValLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "CCTVALLIN_" + sGXsfl_133_idx ;
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
      GXCCtl = "Z4049CCTValLin_" + sGXsfl_133_idx ;
      Z4049CCTValLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4050CCTValDsc_" + sGXsfl_133_idx ;
      Z4050CCTValDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4051CCTVal_" + sGXsfl_133_idx ;
      Z4051CCTVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_623_" + sGXsfl_133_idx ;
      nRcdDeleted_623 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_623_" + sGXsfl_133_idx ;
      nRcdExists_623 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_623_" + sGXsfl_133_idx ;
      nIsMod_623 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCCTValLin_Enabled = edtCCTValLin_Enabled ;
   }

   public void confirmValues1SS0( )
   {
      nGXsfl_133_idx = 0 ;
      sGXsfl_133_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_133_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_133623( ) ;
      while ( nGXsfl_133_idx < nRC_GXsfl_133 )
      {
         nGXsfl_133_idx = (int)(nGXsfl_133_idx+1) ;
         sGXsfl_133_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_133_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_133623( ) ;
         httpContext.changePostValue( "Z4049CCTValLin_"+sGXsfl_133_idx, httpContext.cgiGet( "ZT_"+"Z4049CCTValLin_"+sGXsfl_133_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4049CCTValLin_"+sGXsfl_133_idx) ;
         httpContext.changePostValue( "Z4050CCTValDsc_"+sGXsfl_133_idx, httpContext.cgiGet( "ZT_"+"Z4050CCTValDsc_"+sGXsfl_133_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4050CCTValDsc_"+sGXsfl_133_idx) ;
         httpContext.changePostValue( "Z4051CCTVal_"+sGXsfl_133_idx, httpContext.cgiGet( "ZT_"+"Z4051CCTVal_"+sGXsfl_133_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4051CCTVal_"+sGXsfl_133_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.tccdefvar", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4034CCTLin", GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4043CCTLinDsc", GXutil.rtrim( Z4043CCTLinDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4044CCTLinTpoD", GXutil.rtrim( Z4044CCTLinTpoD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4045CCTLinLgoD", GXutil.ltrim( localUtil.ntoc( Z4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4046CCTLinPict", GXutil.rtrim( Z4046CCTLinPict));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4047CCTLinVarW", GXutil.rtrim( Z4047CCTLinVarW));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4048CCTLinTpoI", GXutil.rtrim( Z4048CCTLinTpoI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4408CCTSta", GXutil.rtrim( Z4408CCTSta));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13249CCVNorma", GXutil.rtrim( Z13249CCVNorma));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13250CCVEspecif", GXutil.rtrim( Z13250CCVEspecif));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11476CCTLinDscL", Z11476CCTLinDscL);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11522CCVCod", GXutil.rtrim( Z11522CCVCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_133", GXutil.ltrim( localUtil.ntoc( nGXsfl_133_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.controlcalidadhtd.tccdefvar", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.TCCDefVar" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TCCDef Var", "") ;
   }

   public void initializeNonKey1SS622( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A4043CCTLinDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
      A4044CCTLinTpoD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
      A4045CCTLinLgoD = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
      A4046CCTLinPict = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
      A4047CCTLinVarW = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4047CCTLinVarW", A4047CCTLinVarW);
      A4048CCTLinTpoI = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
      A4408CCTSta = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4408CCTSta", A4408CCTSta);
      A11522CCVCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", A11522CCVCod);
      A11526CCVPict = "" ;
      n11526CCVPict = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", A11526CCVPict);
      A11527CCVLgoDat = (short)(0) ;
      n11527CCVLgoDat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
      A11528CCVTpoDat = "" ;
      n11528CCVTpoDat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
      A11529CCVDsc = "" ;
      n11529CCVDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", A11529CCVDsc);
      A13249CCVNorma = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13249CCVNorma", A13249CCVNorma);
      A13250CCVEspecif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13250CCVEspecif", A13250CCVEspecif);
      A11476CCTLinDscL = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11476CCTLinDscL", A11476CCTLinDscL);
      Z4043CCTLinDsc = "" ;
      Z4044CCTLinTpoD = "" ;
      Z4045CCTLinLgoD = (short)(0) ;
      Z4046CCTLinPict = "" ;
      Z4047CCTLinVarW = "" ;
      Z4048CCTLinTpoI = "" ;
      Z4408CCTSta = "" ;
      Z13249CCVNorma = "" ;
      Z13250CCVEspecif = "" ;
      Z11476CCTLinDscL = "" ;
      Z11522CCVCod = "" ;
   }

   public void initAll1SS622( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4031CCTCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A4034CCTLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
      initializeNonKey1SS622( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1SS623( )
   {
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      Z4050CCTValDsc = "" ;
      Z4051CCTVal = "" ;
   }

   public void initAll1SS623( )
   {
      A4049CCTValLin = (byte)(0) ;
      initializeNonKey1SS623( ) ;
   }

   public void standaloneModalInsert1SS623( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415115394", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/tccdefvar.js", "?202682415115395", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties623( )
   {
      edtCCTValLin_Enabled = defedtCCTValLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), !bGXsfl_133_Refreshing);
   }

   public void startgridcontrol133( )
   {
      Gridtccdefvar_lineaContainer.AddObjectProperty("GridName", "Gridtccdefvar_linea");
      Gridtccdefvar_lineaContainer.AddObjectProperty("Header", subGridtccdefvar_linea_Header);
      Gridtccdefvar_lineaContainer.AddObjectProperty("Class", "Grid");
      Gridtccdefvar_lineaContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtccdefvar_lineaContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtccdefvar_lineaContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtccdefvar_linea_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtccdefvar_lineaContainer.AddObjectProperty("CmpContext", "");
      Gridtccdefvar_lineaContainer.AddObjectProperty("InMasterPage", "false");
      Gridtccdefvar_lineaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtccdefvar_lineaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), ".", "")));
      Gridtccdefvar_lineaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtccdefvar_lineaContainer.AddColumnProperties(Gridtccdefvar_lineaColumn);
      Gridtccdefvar_lineaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtccdefvar_lineaColumn.AddObjectProperty("Value", GXutil.rtrim( A4050CCTValDsc));
      Gridtccdefvar_lineaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtccdefvar_lineaContainer.AddColumnProperties(Gridtccdefvar_lineaColumn);
      Gridtccdefvar_lineaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtccdefvar_lineaColumn.AddObjectProperty("Value", GXutil.rtrim( A4051CCTVal));
      Gridtccdefvar_lineaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtccdefvar_lineaContainer.AddColumnProperties(Gridtccdefvar_lineaColumn);
      Gridtccdefvar_lineaContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtccdefvar_linea_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtccdefvar_lineaContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtccdefvar_linea_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtccdefvar_lineaContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtccdefvar_linea_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtccdefvar_lineaContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtccdefvar_linea_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtccdefvar_lineaContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtccdefvar_linea_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtccdefvar_lineaContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtccdefvar_linea_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtccdefvar_lineaContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtccdefvar_linea_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtCCTCod_Internalname = "CCTCOD" ;
      edtCCTLin_Internalname = "CCTLIN" ;
      edtCCTLinDsc_Internalname = "CCTLINDSC" ;
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD" );
      edtCCTLinLgoD_Internalname = "CCTLINLGOD" ;
      edtCCTLinPict_Internalname = "CCTLINPICT" ;
      edtCCTLinVarW_Internalname = "CCTLINVARW" ;
      cmbCCTLinTpoI.setInternalname( "CCTLINTPOI" );
      edtCCTSta_Internalname = "CCTSTA" ;
      edtCCVCod_Internalname = "CCVCOD" ;
      edtCCVPict_Internalname = "CCVPICT" ;
      edtCCVLgoDat_Internalname = "CCVLGODAT" ;
      cmbCCVTpoDat.setInternalname( "CCVTPODAT" );
      edtCCVDsc_Internalname = "CCVDSC" ;
      edtCCVNorma_Internalname = "CCVNORMA" ;
      edtCCVEspecif_Internalname = "CCVESPECIF" ;
      edtCCTLinDscL_Internalname = "CCTLINDSCL" ;
      lblTitlelinea_Internalname = "TITLELINEA" ;
      edtCCTValLin_Internalname = "CCTVALLIN" ;
      edtCCTValDsc_Internalname = "CCTVALDSC" ;
      edtCCTVal_Internalname = "CCTVAL" ;
      divLineatable_Internalname = "LINEATABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtccdefvar_linea_Internalname = "GRIDTCCDEFVAR_LINEA" ;
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
      subGridtccdefvar_linea_Allowcollapsing = (byte)(0) ;
      subGridtccdefvar_linea_Allowselection = (byte)(0) ;
      subGridtccdefvar_linea_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "TCCDef Var", "") );
      edtCCTVal_Jsonclick = "" ;
      edtCCTValDsc_Jsonclick = "" ;
      edtCCTValLin_Jsonclick = "" ;
      subGridtccdefvar_linea_Class = "Grid" ;
      subGridtccdefvar_linea_Backcolorstyle = (byte)(0) ;
      edtCCTVal_Enabled = 1 ;
      edtCCTValDsc_Enabled = 1 ;
      edtCCTValLin_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCCTLinDscL_Enabled = 1 ;
      edtCCVEspecif_Jsonclick = "" ;
      edtCCVEspecif_Enabled = 1 ;
      edtCCVNorma_Jsonclick = "" ;
      edtCCVNorma_Enabled = 1 ;
      edtCCVDsc_Jsonclick = "" ;
      edtCCVDsc_Enabled = 0 ;
      cmbCCVTpoDat.setJsonclick( "" );
      cmbCCVTpoDat.setEnabled( 0 );
      edtCCVLgoDat_Jsonclick = "" ;
      edtCCVLgoDat_Enabled = 0 ;
      edtCCVPict_Jsonclick = "" ;
      edtCCVPict_Enabled = 0 ;
      edtCCVCod_Jsonclick = "" ;
      edtCCVCod_Enabled = 1 ;
      edtCCTSta_Jsonclick = "" ;
      edtCCTSta_Enabled = 1 ;
      cmbCCTLinTpoI.setJsonclick( "" );
      cmbCCTLinTpoI.setEnabled( 1 );
      edtCCTLinVarW_Jsonclick = "" ;
      edtCCTLinVarW_Enabled = 1 ;
      edtCCTLinPict_Jsonclick = "" ;
      edtCCTLinPict_Enabled = 1 ;
      edtCCTLinLgoD_Jsonclick = "" ;
      edtCCTLinLgoD_Enabled = 1 ;
      cmbCCTLinTpoD.setJsonclick( "" );
      cmbCCTLinTpoD.setEnabled( 1 );
      edtCCTLinDsc_Jsonclick = "" ;
      edtCCTLinDsc_Enabled = 1 ;
      edtCCTLin_Jsonclick = "" ;
      edtCCTLin_Enabled = 1 ;
      edtCCTCod_Jsonclick = "" ;
      edtCCTCod_Enabled = 1 ;
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

   public void gxnrgridtccdefvar_linea_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_133623( ) ;
      while ( nGXsfl_133_idx <= nRC_GXsfl_133 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1SS623( ) ;
         standaloneModal1SS623( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1SS623( ) ;
         nGXsfl_133_idx = (int)(nGXsfl_133_idx+1) ;
         sGXsfl_133_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_133_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_133623( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtccdefvar_lineaContainer)) ;
      /* End function gxnrGridtccdefvar_linea_newrow */
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
      cmbCCTLinTpoI.setName( "CCTLINTPOI" );
      cmbCCTLinTpoI.setWebtags( "" );
      cmbCCTLinTpoI.addItem("L", httpContext.getMessage( "Lista", ""), (short)(0));
      cmbCCTLinTpoI.addItem("R", httpContext.getMessage( "Rango", ""), (short)(0));
      if ( cmbCCTLinTpoI.getItemCount() > 0 )
      {
         A4048CCTLinTpoI = cmbCCTLinTpoI.getValidValue(A4048CCTLinTpoI) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", A4048CCTLinTpoI);
      }
      cmbCCVTpoDat.setName( "CCVTPODAT" );
      cmbCCVTpoDat.setWebtags( "" );
      cmbCCVTpoDat.addItem("", httpContext.getMessage( "No Aplica", ""), (short)(0));
      cmbCCVTpoDat.addItem("N", httpContext.getMessage( "Numerico", ""), (short)(0));
      cmbCCVTpoDat.addItem("F", httpContext.getMessage( "Fecha", ""), (short)(0));
      cmbCCVTpoDat.addItem("H", httpContext.getMessage( "Hora", ""), (short)(0));
      cmbCCVTpoDat.addItem("C", httpContext.getMessage( "Caracter", ""), (short)(0));
      if ( cmbCCVTpoDat.getItemCount() > 0 )
      {
         A11528CCVTpoDat = cmbCCVTpoDat.getValidValue(A11528CCVTpoDat) ;
         n11528CCVTpoDat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", A11528CCVTpoDat);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01SS19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SS19_A407EmprNom[0] ;
      n407EmprNom = T01SS19_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      /* Using cursor T01SS31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(29);
      GX_FocusControl = edtCCTLinDsc_Internalname ;
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
      /* Using cursor T01SS19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01SS19_A407EmprNom[0] ;
      n407EmprNom = T01SS19_n407EmprNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Cctcod( )
   {
      /* Using cursor T01SS31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Cctlin( )
   {
      n11528CCVTpoDat = false ;
      A11528CCVTpoDat = cmbCCVTpoDat.getValue() ;
      n11528CCVTpoDat = false ;
      cmbCCVTpoDat.setValue( A11528CCVTpoDat );
      A4048CCTLinTpoI = cmbCCTLinTpoI.getValue() ;
      cmbCCTLinTpoI.setValue( A4048CCTLinTpoI );
      A4044CCTLinTpoD = cmbCCTLinTpoD.getValue() ;
      cmbCCTLinTpoD.setValue( A4044CCTLinTpoD );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
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
      if ( cmbCCTLinTpoI.getItemCount() > 0 )
      {
         A4048CCTLinTpoI = cmbCCTLinTpoI.getValidValue(A4048CCTLinTpoI) ;
         cmbCCTLinTpoI.setValue( A4048CCTLinTpoI );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTLinTpoI.setValue( GXutil.rtrim( A4048CCTLinTpoI) );
      }
      if ( cmbCCVTpoDat.getItemCount() > 0 )
      {
         A11528CCVTpoDat = cmbCCVTpoDat.getValidValue(A11528CCVTpoDat) ;
         n11528CCVTpoDat = false ;
         cmbCCVTpoDat.setValue( A11528CCVTpoDat );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCVTpoDat.setValue( GXutil.rtrim( A11528CCVTpoDat) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", GXutil.rtrim( A4043CCTLinDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", GXutil.rtrim( A4044CCTLinTpoD));
      cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Values", cmbCCTLinTpoD.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", GXutil.rtrim( A4046CCTLinPict));
      httpContext.ajax_rsp_assign_attri("", false, "A4047CCTLinVarW", GXutil.rtrim( A4047CCTLinVarW));
      httpContext.ajax_rsp_assign_attri("", false, "A4048CCTLinTpoI", GXutil.rtrim( A4048CCTLinTpoI));
      cmbCCTLinTpoI.setValue( GXutil.rtrim( A4048CCTLinTpoI) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Values", cmbCCTLinTpoI.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A4408CCTSta", GXutil.rtrim( A4408CCTSta));
      httpContext.ajax_rsp_assign_attri("", false, "A11522CCVCod", GXutil.rtrim( A11522CCVCod));
      httpContext.ajax_rsp_assign_attri("", false, "A13249CCVNorma", GXutil.rtrim( A13249CCVNorma));
      httpContext.ajax_rsp_assign_attri("", false, "A13250CCVEspecif", GXutil.rtrim( A13250CCVEspecif));
      httpContext.ajax_rsp_assign_attri("", false, "A11476CCTLinDscL", A11476CCTLinDscL);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", GXutil.rtrim( A11526CCVPict));
      httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrim( localUtil.ntoc( A11527CCVLgoDat, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", GXutil.rtrim( A11528CCVTpoDat));
      cmbCCVTpoDat.setValue( GXutil.rtrim( A11528CCVTpoDat) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCVTpoDat.getInternalname(), "Values", cmbCCVTpoDat.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", GXutil.rtrim( A11529CCVDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4034CCTLin", GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4043CCTLinDsc", GXutil.rtrim( Z4043CCTLinDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4044CCTLinTpoD", GXutil.rtrim( Z4044CCTLinTpoD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4045CCTLinLgoD", GXutil.ltrim( localUtil.ntoc( Z4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4046CCTLinPict", GXutil.rtrim( Z4046CCTLinPict));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4047CCTLinVarW", GXutil.rtrim( Z4047CCTLinVarW));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4048CCTLinTpoI", GXutil.rtrim( Z4048CCTLinTpoI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4408CCTSta", GXutil.rtrim( Z4408CCTSta));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11522CCVCod", GXutil.rtrim( Z11522CCVCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13249CCVNorma", GXutil.rtrim( Z13249CCVNorma));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13250CCVEspecif", GXutil.rtrim( Z13250CCVEspecif));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11476CCTLinDscL", Z11476CCTLinDscL);
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11526CCVPict", GXutil.rtrim( Z11526CCVPict));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11527CCVLgoDat", GXutil.ltrim( localUtil.ntoc( Z11527CCVLgoDat, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11528CCVTpoDat", GXutil.rtrim( Z11528CCVTpoDat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11529CCVDsc", GXutil.rtrim( Z11529CCVDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Ccvcod( )
   {
      n11526CCVPict = false ;
      n11527CCVLgoDat = false ;
      n11528CCVTpoDat = false ;
      A11528CCVTpoDat = cmbCCVTpoDat.getValue() ;
      n11528CCVTpoDat = false ;
      cmbCCVTpoDat.setValue( A11528CCVTpoDat );
      n11529CCVDsc = false ;
      /* Using cursor T01SS20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A11522CCVCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Variables Automáticas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A11526CCVPict = T01SS20_A11526CCVPict[0] ;
      n11526CCVPict = T01SS20_n11526CCVPict[0] ;
      A11527CCVLgoDat = T01SS20_A11527CCVLgoDat[0] ;
      n11527CCVLgoDat = T01SS20_n11527CCVLgoDat[0] ;
      A11528CCVTpoDat = T01SS20_A11528CCVTpoDat[0] ;
      n11528CCVTpoDat = T01SS20_n11528CCVTpoDat[0] ;
      cmbCCVTpoDat.setValue( A11528CCVTpoDat );
      A11529CCVDsc = T01SS20_A11529CCVDsc[0] ;
      n11529CCVDsc = T01SS20_n11529CCVDsc[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      if ( cmbCCVTpoDat.getItemCount() > 0 )
      {
         A11528CCVTpoDat = cmbCCVTpoDat.getValidValue(A11528CCVTpoDat) ;
         n11528CCVTpoDat = false ;
         cmbCCVTpoDat.setValue( A11528CCVTpoDat );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCVTpoDat.setValue( GXutil.rtrim( A11528CCVTpoDat) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", GXutil.rtrim( A11526CCVPict));
      httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrim( localUtil.ntoc( A11527CCVLgoDat, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", GXutil.rtrim( A11528CCVTpoDat));
      cmbCCVTpoDat.setValue( GXutil.rtrim( A11528CCVTpoDat) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCVTpoDat.getInternalname(), "Values", cmbCCVTpoDat.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", GXutil.rtrim( A11529CCVDsc));
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
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_CCTCOD",",oparms:[]}");
      setEventMetadata("VALID_CCTLIN","{handler:'valid_Cctlin',iparms:[{av:'cmbCCVTpoDat'},{av:'A11528CCVTpoDat',fld:'CCVTPODAT',pic:''},{av:'cmbCCTLinTpoI'},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'cmbCCTLinTpoD'},{av:'A4044CCTLinTpoD',fld:'CCTLINTPOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_CCTLIN",",oparms:[{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'cmbCCTLinTpoD'},{av:'A4044CCTLinTpoD',fld:'CCTLINTPOD',pic:''},{av:'A4045CCTLinLgoD',fld:'CCTLINLGOD',pic:'ZZ9'},{av:'A4046CCTLinPict',fld:'CCTLINPICT',pic:''},{av:'A4047CCTLinVarW',fld:'CCTLINVARW',pic:'@!'},{av:'cmbCCTLinTpoI'},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A4408CCTSta',fld:'CCTSTA',pic:''},{av:'A11522CCVCod',fld:'CCVCOD',pic:''},{av:'A13249CCVNorma',fld:'CCVNORMA',pic:''},{av:'A13250CCVEspecif',fld:'CCVESPECIF',pic:''},{av:'A11476CCTLinDscL',fld:'CCTLINDSCL',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11526CCVPict',fld:'CCVPICT',pic:''},{av:'A11527CCVLgoDat',fld:'CCVLGODAT',pic:'ZZ9'},{av:'cmbCCVTpoDat'},{av:'A11528CCVTpoDat',fld:'CCVTPODAT',pic:''},{av:'A11529CCVDsc',fld:'CCVDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4031CCTCod'},{av:'Z4034CCTLin'},{av:'Z4043CCTLinDsc'},{av:'Z4044CCTLinTpoD'},{av:'Z4045CCTLinLgoD'},{av:'Z4046CCTLinPict'},{av:'Z4047CCTLinVarW'},{av:'Z4048CCTLinTpoI'},{av:'Z4408CCTSta'},{av:'Z11522CCVCod'},{av:'Z13249CCVNorma'},{av:'Z13250CCVEspecif'},{av:'Z11476CCTLinDscL'},{av:'Z407EmprNom'},{av:'Z11526CCVPict'},{av:'Z11527CCVLgoDat'},{av:'Z11528CCVTpoDat'},{av:'Z11529CCVDsc'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_CCVCOD","{handler:'valid_Ccvcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11522CCVCod',fld:'CCVCOD',pic:''},{av:'A11526CCVPict',fld:'CCVPICT',pic:''},{av:'A11527CCVLgoDat',fld:'CCVLGODAT',pic:'ZZ9'},{av:'cmbCCVTpoDat'},{av:'A11528CCVTpoDat',fld:'CCVTPODAT',pic:''},{av:'A11529CCVDsc',fld:'CCVDSC',pic:''}]");
      setEventMetadata("VALID_CCVCOD",",oparms:[{av:'A11526CCVPict',fld:'CCVPICT',pic:''},{av:'A11527CCVLgoDat',fld:'CCVLGODAT',pic:'ZZ9'},{av:'cmbCCVTpoDat'},{av:'A11528CCVTpoDat',fld:'CCVTPODAT',pic:''},{av:'A11529CCVDsc',fld:'CCVDSC',pic:''}]}");
      setEventMetadata("VALID_CCTVALLIN","{handler:'valid_Cctvallin',iparms:[]");
      setEventMetadata("VALID_CCTVALLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Cctval',iparms:[]");
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
      pr_default.close(17);
      pr_default.close(29);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4043CCTLinDsc = "" ;
      Z4044CCTLinTpoD = "" ;
      Z4046CCTLinPict = "" ;
      Z4047CCTLinVarW = "" ;
      Z4048CCTLinTpoI = "" ;
      Z4408CCTSta = "" ;
      Z13249CCVNorma = "" ;
      Z13250CCVEspecif = "" ;
      Z11476CCTLinDscL = "" ;
      Z11522CCVCod = "" ;
      Z4050CCTValDsc = "" ;
      Z4051CCTVal = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A11522CCVCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A4044CCTLinTpoD = "" ;
      A4048CCTLinTpoI = "" ;
      A11528CCVTpoDat = "" ;
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
      A4043CCTLinDsc = "" ;
      A4046CCTLinPict = "" ;
      A4047CCTLinVarW = "" ;
      A4408CCTSta = "" ;
      A11526CCVPict = "" ;
      A11529CCVDsc = "" ;
      A13249CCVNorma = "" ;
      A13250CCVEspecif = "" ;
      A11476CCTLinDscL = "" ;
      lblTitlelinea_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtccdefvar_lineaContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode623 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      Z407EmprNom = "" ;
      Z11526CCVPict = "" ;
      Z11528CCVTpoDat = "" ;
      Z11529CCVDsc = "" ;
      T01SS9_A4034CCTLin = new short[1] ;
      T01SS9_A407EmprNom = new String[] {""} ;
      T01SS9_n407EmprNom = new boolean[] {false} ;
      T01SS9_A4043CCTLinDsc = new String[] {""} ;
      T01SS9_A4044CCTLinTpoD = new String[] {""} ;
      T01SS9_A4045CCTLinLgoD = new short[1] ;
      T01SS9_A4046CCTLinPict = new String[] {""} ;
      T01SS9_A4047CCTLinVarW = new String[] {""} ;
      T01SS9_A4048CCTLinTpoI = new String[] {""} ;
      T01SS9_A4408CCTSta = new String[] {""} ;
      T01SS9_A11526CCVPict = new String[] {""} ;
      T01SS9_n11526CCVPict = new boolean[] {false} ;
      T01SS9_A11527CCVLgoDat = new short[1] ;
      T01SS9_n11527CCVLgoDat = new boolean[] {false} ;
      T01SS9_A11528CCVTpoDat = new String[] {""} ;
      T01SS9_n11528CCVTpoDat = new boolean[] {false} ;
      T01SS9_A11529CCVDsc = new String[] {""} ;
      T01SS9_n11529CCVDsc = new boolean[] {false} ;
      T01SS9_A13249CCVNorma = new String[] {""} ;
      T01SS9_A13250CCVEspecif = new String[] {""} ;
      T01SS9_A11476CCTLinDscL = new String[] {""} ;
      T01SS9_A396EmprCod = new String[] {""} ;
      T01SS9_A4031CCTCod = new int[1] ;
      T01SS9_A11522CCVCod = new String[] {""} ;
      T01SS6_A407EmprNom = new String[] {""} ;
      T01SS6_n407EmprNom = new boolean[] {false} ;
      T01SS8_A11526CCVPict = new String[] {""} ;
      T01SS8_n11526CCVPict = new boolean[] {false} ;
      T01SS8_A11527CCVLgoDat = new short[1] ;
      T01SS8_n11527CCVLgoDat = new boolean[] {false} ;
      T01SS8_A11528CCVTpoDat = new String[] {""} ;
      T01SS8_n11528CCVTpoDat = new boolean[] {false} ;
      T01SS8_A11529CCVDsc = new String[] {""} ;
      T01SS8_n11529CCVDsc = new boolean[] {false} ;
      T01SS7_A396EmprCod = new String[] {""} ;
      T01SS10_A407EmprNom = new String[] {""} ;
      T01SS10_n407EmprNom = new boolean[] {false} ;
      T01SS11_A11526CCVPict = new String[] {""} ;
      T01SS11_n11526CCVPict = new boolean[] {false} ;
      T01SS11_A11527CCVLgoDat = new short[1] ;
      T01SS11_n11527CCVLgoDat = new boolean[] {false} ;
      T01SS11_A11528CCVTpoDat = new String[] {""} ;
      T01SS11_n11528CCVTpoDat = new boolean[] {false} ;
      T01SS11_A11529CCVDsc = new String[] {""} ;
      T01SS11_n11529CCVDsc = new boolean[] {false} ;
      T01SS12_A396EmprCod = new String[] {""} ;
      T01SS13_A396EmprCod = new String[] {""} ;
      T01SS13_A4031CCTCod = new int[1] ;
      T01SS13_A4034CCTLin = new short[1] ;
      T01SS5_A4034CCTLin = new short[1] ;
      T01SS5_A4043CCTLinDsc = new String[] {""} ;
      T01SS5_A4044CCTLinTpoD = new String[] {""} ;
      T01SS5_A4045CCTLinLgoD = new short[1] ;
      T01SS5_A4046CCTLinPict = new String[] {""} ;
      T01SS5_A4047CCTLinVarW = new String[] {""} ;
      T01SS5_A4048CCTLinTpoI = new String[] {""} ;
      T01SS5_A4408CCTSta = new String[] {""} ;
      T01SS5_A13249CCVNorma = new String[] {""} ;
      T01SS5_A13250CCVEspecif = new String[] {""} ;
      T01SS5_A11476CCTLinDscL = new String[] {""} ;
      T01SS5_A396EmprCod = new String[] {""} ;
      T01SS5_A4031CCTCod = new int[1] ;
      T01SS5_A11522CCVCod = new String[] {""} ;
      sMode622 = "" ;
      T01SS14_A396EmprCod = new String[] {""} ;
      T01SS14_A4031CCTCod = new int[1] ;
      T01SS14_A4034CCTLin = new short[1] ;
      T01SS15_A396EmprCod = new String[] {""} ;
      T01SS15_A4031CCTCod = new int[1] ;
      T01SS15_A4034CCTLin = new short[1] ;
      T01SS4_A4034CCTLin = new short[1] ;
      T01SS4_A4043CCTLinDsc = new String[] {""} ;
      T01SS4_A4044CCTLinTpoD = new String[] {""} ;
      T01SS4_A4045CCTLinLgoD = new short[1] ;
      T01SS4_A4046CCTLinPict = new String[] {""} ;
      T01SS4_A4047CCTLinVarW = new String[] {""} ;
      T01SS4_A4048CCTLinTpoI = new String[] {""} ;
      T01SS4_A4408CCTSta = new String[] {""} ;
      T01SS4_A13249CCVNorma = new String[] {""} ;
      T01SS4_A13250CCVEspecif = new String[] {""} ;
      T01SS4_A11476CCTLinDscL = new String[] {""} ;
      T01SS4_A396EmprCod = new String[] {""} ;
      T01SS4_A4031CCTCod = new int[1] ;
      T01SS4_A11522CCVCod = new String[] {""} ;
      T01SS19_A407EmprNom = new String[] {""} ;
      T01SS19_n407EmprNom = new boolean[] {false} ;
      T01SS20_A11526CCVPict = new String[] {""} ;
      T01SS20_n11526CCVPict = new boolean[] {false} ;
      T01SS20_A11527CCVLgoDat = new short[1] ;
      T01SS20_n11527CCVLgoDat = new boolean[] {false} ;
      T01SS20_A11528CCVTpoDat = new String[] {""} ;
      T01SS20_n11528CCVTpoDat = new boolean[] {false} ;
      T01SS20_A11529CCVDsc = new String[] {""} ;
      T01SS20_n11529CCVDsc = new boolean[] {false} ;
      T01SS21_A396EmprCod = new String[] {""} ;
      T01SS21_A252CliCod = new int[1] ;
      T01SS21_A9713Tb1_Cod = new short[1] ;
      T01SS21_A11736CCArtCod = new String[] {""} ;
      T01SS21_A11748TipArtiId = new short[1] ;
      T01SS21_A11737CCColNom = new String[] {""} ;
      T01SS21_A11738CCColNum = new int[1] ;
      T01SS21_A11749CCCTc = new byte[1] ;
      T01SS21_A11750IntId = new short[1] ;
      T01SS21_A4031CCTCod = new int[1] ;
      T01SS21_A4034CCTLin = new short[1] ;
      T01SS22_A396EmprCod = new String[] {""} ;
      T01SS22_A252CliCod = new int[1] ;
      T01SS22_A65ArtCod = new String[] {""} ;
      T01SS22_A4058CCFColNom = new String[] {""} ;
      T01SS22_A4059CCFColNum = new int[1] ;
      T01SS22_A4031CCTCod = new int[1] ;
      T01SS22_A4034CCTLin = new short[1] ;
      T01SS23_A396EmprCod = new String[] {""} ;
      T01SS23_A129BarCod = new int[1] ;
      T01SS23_A132BarCodReo = new byte[1] ;
      T01SS23_A130BarCodPar = new String[] {""} ;
      T01SS23_A758ProCod = new String[] {""} ;
      T01SS23_A194BarOrdLin = new short[1] ;
      T01SS23_A4031CCTCod = new int[1] ;
      T01SS23_A4034CCTLin = new short[1] ;
      T01SS24_A396EmprCod = new String[] {""} ;
      T01SS24_A4031CCTCod = new int[1] ;
      T01SS24_A4034CCTLin = new short[1] ;
      T01SS25_A396EmprCod = new String[] {""} ;
      T01SS25_A4031CCTCod = new int[1] ;
      T01SS25_A4034CCTLin = new short[1] ;
      T01SS25_A4049CCTValLin = new byte[1] ;
      T01SS25_A4050CCTValDsc = new String[] {""} ;
      T01SS25_A4051CCTVal = new String[] {""} ;
      T01SS26_A396EmprCod = new String[] {""} ;
      T01SS26_A4031CCTCod = new int[1] ;
      T01SS26_A4034CCTLin = new short[1] ;
      T01SS26_A4049CCTValLin = new byte[1] ;
      T01SS3_A396EmprCod = new String[] {""} ;
      T01SS3_A4031CCTCod = new int[1] ;
      T01SS3_A4034CCTLin = new short[1] ;
      T01SS3_A4049CCTValLin = new byte[1] ;
      T01SS3_A4050CCTValDsc = new String[] {""} ;
      T01SS3_A4051CCTVal = new String[] {""} ;
      T01SS2_A396EmprCod = new String[] {""} ;
      T01SS2_A4031CCTCod = new int[1] ;
      T01SS2_A4034CCTLin = new short[1] ;
      T01SS2_A4049CCTValLin = new byte[1] ;
      T01SS2_A4050CCTValDsc = new String[] {""} ;
      T01SS2_A4051CCTVal = new String[] {""} ;
      T01SS30_A396EmprCod = new String[] {""} ;
      T01SS30_A4031CCTCod = new int[1] ;
      T01SS30_A4034CCTLin = new short[1] ;
      T01SS30_A4049CCTValLin = new byte[1] ;
      Gridtccdefvar_lineaRow = new com.genexus.webpanels.GXWebRow();
      subGridtccdefvar_linea_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtccdefvar_lineaColumn = new com.genexus.webpanels.GXWebColumn();
      T01SS31_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ4043CCTLinDsc = "" ;
      ZZ4044CCTLinTpoD = "" ;
      ZZ4046CCTLinPict = "" ;
      ZZ4047CCTLinVarW = "" ;
      ZZ4048CCTLinTpoI = "" ;
      ZZ4408CCTSta = "" ;
      ZZ11522CCVCod = "" ;
      ZZ13249CCVNorma = "" ;
      ZZ13250CCVEspecif = "" ;
      ZZ11476CCTLinDscL = "" ;
      ZZ407EmprNom = "" ;
      ZZ11526CCVPict = "" ;
      ZZ11528CCVTpoDat = "" ;
      ZZ11529CCVDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccdefvar__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccdefvar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccdefvar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccdefvar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccdefvar__default(),
         new Object[] {
             new Object[] {
            T01SS2_A396EmprCod, T01SS2_A4031CCTCod, T01SS2_A4034CCTLin, T01SS2_A4049CCTValLin, T01SS2_A4050CCTValDsc, T01SS2_A4051CCTVal
            }
            , new Object[] {
            T01SS3_A396EmprCod, T01SS3_A4031CCTCod, T01SS3_A4034CCTLin, T01SS3_A4049CCTValLin, T01SS3_A4050CCTValDsc, T01SS3_A4051CCTVal
            }
            , new Object[] {
            T01SS4_A4034CCTLin, T01SS4_A4043CCTLinDsc, T01SS4_A4044CCTLinTpoD, T01SS4_A4045CCTLinLgoD, T01SS4_A4046CCTLinPict, T01SS4_A4047CCTLinVarW, T01SS4_A4048CCTLinTpoI, T01SS4_A4408CCTSta, T01SS4_A13249CCVNorma, T01SS4_A13250CCVEspecif,
            T01SS4_A11476CCTLinDscL, T01SS4_A396EmprCod, T01SS4_A4031CCTCod, T01SS4_A11522CCVCod
            }
            , new Object[] {
            T01SS5_A4034CCTLin, T01SS5_A4043CCTLinDsc, T01SS5_A4044CCTLinTpoD, T01SS5_A4045CCTLinLgoD, T01SS5_A4046CCTLinPict, T01SS5_A4047CCTLinVarW, T01SS5_A4048CCTLinTpoI, T01SS5_A4408CCTSta, T01SS5_A13249CCVNorma, T01SS5_A13250CCVEspecif,
            T01SS5_A11476CCTLinDscL, T01SS5_A396EmprCod, T01SS5_A4031CCTCod, T01SS5_A11522CCVCod
            }
            , new Object[] {
            T01SS6_A407EmprNom, T01SS6_n407EmprNom
            }
            , new Object[] {
            T01SS7_A396EmprCod
            }
            , new Object[] {
            T01SS8_A11526CCVPict, T01SS8_n11526CCVPict, T01SS8_A11527CCVLgoDat, T01SS8_n11527CCVLgoDat, T01SS8_A11528CCVTpoDat, T01SS8_n11528CCVTpoDat, T01SS8_A11529CCVDsc, T01SS8_n11529CCVDsc
            }
            , new Object[] {
            T01SS9_A4034CCTLin, T01SS9_A407EmprNom, T01SS9_n407EmprNom, T01SS9_A4043CCTLinDsc, T01SS9_A4044CCTLinTpoD, T01SS9_A4045CCTLinLgoD, T01SS9_A4046CCTLinPict, T01SS9_A4047CCTLinVarW, T01SS9_A4048CCTLinTpoI, T01SS9_A4408CCTSta,
            T01SS9_A11526CCVPict, T01SS9_n11526CCVPict, T01SS9_A11527CCVLgoDat, T01SS9_n11527CCVLgoDat, T01SS9_A11528CCVTpoDat, T01SS9_n11528CCVTpoDat, T01SS9_A11529CCVDsc, T01SS9_n11529CCVDsc, T01SS9_A13249CCVNorma, T01SS9_A13250CCVEspecif,
            T01SS9_A11476CCTLinDscL, T01SS9_A396EmprCod, T01SS9_A4031CCTCod, T01SS9_A11522CCVCod
            }
            , new Object[] {
            T01SS10_A407EmprNom, T01SS10_n407EmprNom
            }
            , new Object[] {
            T01SS11_A11526CCVPict, T01SS11_n11526CCVPict, T01SS11_A11527CCVLgoDat, T01SS11_n11527CCVLgoDat, T01SS11_A11528CCVTpoDat, T01SS11_n11528CCVTpoDat, T01SS11_A11529CCVDsc, T01SS11_n11529CCVDsc
            }
            , new Object[] {
            T01SS12_A396EmprCod
            }
            , new Object[] {
            T01SS13_A396EmprCod, T01SS13_A4031CCTCod, T01SS13_A4034CCTLin
            }
            , new Object[] {
            T01SS14_A396EmprCod, T01SS14_A4031CCTCod, T01SS14_A4034CCTLin
            }
            , new Object[] {
            T01SS15_A396EmprCod, T01SS15_A4031CCTCod, T01SS15_A4034CCTLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SS19_A407EmprNom, T01SS19_n407EmprNom
            }
            , new Object[] {
            T01SS20_A11526CCVPict, T01SS20_n11526CCVPict, T01SS20_A11527CCVLgoDat, T01SS20_n11527CCVLgoDat, T01SS20_A11528CCVTpoDat, T01SS20_n11528CCVTpoDat, T01SS20_A11529CCVDsc, T01SS20_n11529CCVDsc
            }
            , new Object[] {
            T01SS21_A396EmprCod, T01SS21_A252CliCod, T01SS21_A9713Tb1_Cod, T01SS21_A11736CCArtCod, T01SS21_A11748TipArtiId, T01SS21_A11737CCColNom, T01SS21_A11738CCColNum, T01SS21_A11749CCCTc, T01SS21_A11750IntId, T01SS21_A4031CCTCod,
            T01SS21_A4034CCTLin
            }
            , new Object[] {
            T01SS22_A396EmprCod, T01SS22_A252CliCod, T01SS22_A65ArtCod, T01SS22_A4058CCFColNom, T01SS22_A4059CCFColNum, T01SS22_A4031CCTCod, T01SS22_A4034CCTLin
            }
            , new Object[] {
            T01SS23_A396EmprCod, T01SS23_A129BarCod, T01SS23_A132BarCodReo, T01SS23_A130BarCodPar, T01SS23_A758ProCod, T01SS23_A194BarOrdLin, T01SS23_A4031CCTCod, T01SS23_A4034CCTLin
            }
            , new Object[] {
            T01SS24_A396EmprCod, T01SS24_A4031CCTCod, T01SS24_A4034CCTLin
            }
            , new Object[] {
            T01SS25_A396EmprCod, T01SS25_A4031CCTCod, T01SS25_A4034CCTLin, T01SS25_A4049CCTValLin, T01SS25_A4050CCTValDsc, T01SS25_A4051CCTVal
            }
            , new Object[] {
            T01SS26_A396EmprCod, T01SS26_A4031CCTCod, T01SS26_A4034CCTLin, T01SS26_A4049CCTValLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SS30_A396EmprCod, T01SS30_A4031CCTCod, T01SS30_A4034CCTLin, T01SS30_A4049CCTValLin
            }
            , new Object[] {
            T01SS31_A396EmprCod
            }
         }
      );
   }

   private byte Z4049CCTValLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A4049CCTValLin ;
   private byte Gx_BScreen ;
   private byte subGridtccdefvar_linea_Backcolorstyle ;
   private byte subGridtccdefvar_linea_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtccdefvar_linea_Allowselection ;
   private byte subGridtccdefvar_linea_Allowhovering ;
   private byte subGridtccdefvar_linea_Allowcollapsing ;
   private byte subGridtccdefvar_linea_Collapsed ;
   private short Z4034CCTLin ;
   private short Z4045CCTLinLgoD ;
   private short nRcdDeleted_623 ;
   private short nRcdExists_623 ;
   private short nIsMod_623 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4034CCTLin ;
   private short A4045CCTLinLgoD ;
   private short A11527CCVLgoDat ;
   private short nBlankRcdCount623 ;
   private short RcdFound623 ;
   private short nBlankRcdUsr623 ;
   private short Z11527CCVLgoDat ;
   private short RcdFound622 ;
   private short nIsDirty_622 ;
   private short nIsDirty_623 ;
   private short ZZ4034CCTLin ;
   private short ZZ4045CCTLinLgoD ;
   private short ZZ11527CCVLgoDat ;
   private int Z4031CCTCod ;
   private int nRC_GXsfl_133 ;
   private int nGXsfl_133_idx=1 ;
   private int A4031CCTCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCCTCod_Enabled ;
   private int edtCCTLin_Enabled ;
   private int edtCCTLinDsc_Enabled ;
   private int edtCCTLinLgoD_Enabled ;
   private int edtCCTLinPict_Enabled ;
   private int edtCCTLinVarW_Enabled ;
   private int edtCCTSta_Enabled ;
   private int edtCCVCod_Enabled ;
   private int edtCCVPict_Enabled ;
   private int edtCCVLgoDat_Enabled ;
   private int edtCCVDsc_Enabled ;
   private int edtCCVNorma_Enabled ;
   private int edtCCVEspecif_Enabled ;
   private int edtCCTLinDscL_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtCCTValLin_Enabled ;
   private int edtCCTValDsc_Enabled ;
   private int edtCCTVal_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtccdefvar_linea_Backcolor ;
   private int subGridtccdefvar_linea_Allbackcolor ;
   private int defedtCCTValLin_Enabled ;
   private int idxLst ;
   private int subGridtccdefvar_linea_Selectedindex ;
   private int subGridtccdefvar_linea_Selectioncolor ;
   private int subGridtccdefvar_linea_Hoveringcolor ;
   private int ZZ4031CCTCod ;
   private long GRIDTCCDEFVAR_LINEA_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4043CCTLinDsc ;
   private String Z4044CCTLinTpoD ;
   private String Z4046CCTLinPict ;
   private String Z4047CCTLinVarW ;
   private String Z4048CCTLinTpoI ;
   private String Z4408CCTSta ;
   private String Z13249CCVNorma ;
   private String Z13250CCVEspecif ;
   private String Z11522CCVCod ;
   private String Z4050CCTValDsc ;
   private String Z4051CCTVal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A11522CCVCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_133_idx="0001" ;
   private String Gx_mode ;
   private String A4044CCTLinTpoD ;
   private String A4048CCTLinTpoI ;
   private String A11528CCVTpoDat ;
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
   private String edtCCTCod_Internalname ;
   private String edtCCTCod_Jsonclick ;
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
   private String edtCCTLinVarW_Internalname ;
   private String A4047CCTLinVarW ;
   private String edtCCTLinVarW_Jsonclick ;
   private String edtCCTSta_Internalname ;
   private String A4408CCTSta ;
   private String edtCCTSta_Jsonclick ;
   private String edtCCVCod_Internalname ;
   private String edtCCVCod_Jsonclick ;
   private String edtCCVPict_Internalname ;
   private String A11526CCVPict ;
   private String edtCCVPict_Jsonclick ;
   private String edtCCVLgoDat_Internalname ;
   private String edtCCVLgoDat_Jsonclick ;
   private String edtCCVDsc_Internalname ;
   private String A11529CCVDsc ;
   private String edtCCVDsc_Jsonclick ;
   private String edtCCVNorma_Internalname ;
   private String A13249CCVNorma ;
   private String edtCCVNorma_Jsonclick ;
   private String edtCCVEspecif_Internalname ;
   private String A13250CCVEspecif ;
   private String edtCCVEspecif_Jsonclick ;
   private String edtCCTLinDscL_Internalname ;
   private String divLineatable_Internalname ;
   private String lblTitlelinea_Internalname ;
   private String lblTitlelinea_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode623 ;
   private String edtCCTValLin_Internalname ;
   private String edtCCTValDsc_Internalname ;
   private String edtCCTVal_Internalname ;
   private String sStyleString ;
   private String subGridtccdefvar_linea_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A4050CCTValDsc ;
   private String A4051CCTVal ;
   private String Z407EmprNom ;
   private String Z11526CCVPict ;
   private String Z11528CCVTpoDat ;
   private String Z11529CCVDsc ;
   private String sMode622 ;
   private String sGXsfl_133_fel_idx="0001" ;
   private String subGridtccdefvar_linea_Class ;
   private String subGridtccdefvar_linea_Linesclass ;
   private String ROClassString ;
   private String edtCCTValLin_Jsonclick ;
   private String edtCCTValDsc_Jsonclick ;
   private String edtCCTVal_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtccdefvar_linea_Header ;
   private String ZZ396EmprCod ;
   private String ZZ4043CCTLinDsc ;
   private String ZZ4044CCTLinTpoD ;
   private String ZZ4046CCTLinPict ;
   private String ZZ4047CCTLinVarW ;
   private String ZZ4048CCTLinTpoI ;
   private String ZZ4408CCTSta ;
   private String ZZ11522CCVCod ;
   private String ZZ13249CCVNorma ;
   private String ZZ13250CCVEspecif ;
   private String ZZ407EmprNom ;
   private String ZZ11526CCVPict ;
   private String ZZ11528CCVTpoDat ;
   private String ZZ11529CCVDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n11528CCVTpoDat ;
   private boolean bGXsfl_133_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n11526CCVPict ;
   private boolean n11527CCVLgoDat ;
   private boolean n11529CCVDsc ;
   private boolean Gx_longc ;
   private String Z11476CCTLinDscL ;
   private String A11476CCTLinDscL ;
   private String ZZ11476CCTLinDscL ;
   private com.genexus.webpanels.GXWebGrid Gridtccdefvar_lineaContainer ;
   private com.genexus.webpanels.GXWebRow Gridtccdefvar_lineaRow ;
   private com.genexus.webpanels.GXWebColumn Gridtccdefvar_lineaColumn ;
   private HTMLChoice cmbCCTLinTpoD ;
   private HTMLChoice cmbCCTLinTpoI ;
   private HTMLChoice cmbCCVTpoDat ;
   private IDataStoreProvider pr_default ;
   private short[] T01SS9_A4034CCTLin ;
   private String[] T01SS9_A407EmprNom ;
   private boolean[] T01SS9_n407EmprNom ;
   private String[] T01SS9_A4043CCTLinDsc ;
   private String[] T01SS9_A4044CCTLinTpoD ;
   private short[] T01SS9_A4045CCTLinLgoD ;
   private String[] T01SS9_A4046CCTLinPict ;
   private String[] T01SS9_A4047CCTLinVarW ;
   private String[] T01SS9_A4048CCTLinTpoI ;
   private String[] T01SS9_A4408CCTSta ;
   private String[] T01SS9_A11526CCVPict ;
   private boolean[] T01SS9_n11526CCVPict ;
   private short[] T01SS9_A11527CCVLgoDat ;
   private boolean[] T01SS9_n11527CCVLgoDat ;
   private String[] T01SS9_A11528CCVTpoDat ;
   private boolean[] T01SS9_n11528CCVTpoDat ;
   private String[] T01SS9_A11529CCVDsc ;
   private boolean[] T01SS9_n11529CCVDsc ;
   private String[] T01SS9_A13249CCVNorma ;
   private String[] T01SS9_A13250CCVEspecif ;
   private String[] T01SS9_A11476CCTLinDscL ;
   private String[] T01SS9_A396EmprCod ;
   private int[] T01SS9_A4031CCTCod ;
   private String[] T01SS9_A11522CCVCod ;
   private String[] T01SS6_A407EmprNom ;
   private boolean[] T01SS6_n407EmprNom ;
   private String[] T01SS8_A11526CCVPict ;
   private boolean[] T01SS8_n11526CCVPict ;
   private short[] T01SS8_A11527CCVLgoDat ;
   private boolean[] T01SS8_n11527CCVLgoDat ;
   private String[] T01SS8_A11528CCVTpoDat ;
   private boolean[] T01SS8_n11528CCVTpoDat ;
   private String[] T01SS8_A11529CCVDsc ;
   private boolean[] T01SS8_n11529CCVDsc ;
   private String[] T01SS7_A396EmprCod ;
   private String[] T01SS10_A407EmprNom ;
   private boolean[] T01SS10_n407EmprNom ;
   private String[] T01SS11_A11526CCVPict ;
   private boolean[] T01SS11_n11526CCVPict ;
   private short[] T01SS11_A11527CCVLgoDat ;
   private boolean[] T01SS11_n11527CCVLgoDat ;
   private String[] T01SS11_A11528CCVTpoDat ;
   private boolean[] T01SS11_n11528CCVTpoDat ;
   private String[] T01SS11_A11529CCVDsc ;
   private boolean[] T01SS11_n11529CCVDsc ;
   private String[] T01SS12_A396EmprCod ;
   private String[] T01SS13_A396EmprCod ;
   private int[] T01SS13_A4031CCTCod ;
   private short[] T01SS13_A4034CCTLin ;
   private short[] T01SS5_A4034CCTLin ;
   private String[] T01SS5_A4043CCTLinDsc ;
   private String[] T01SS5_A4044CCTLinTpoD ;
   private short[] T01SS5_A4045CCTLinLgoD ;
   private String[] T01SS5_A4046CCTLinPict ;
   private String[] T01SS5_A4047CCTLinVarW ;
   private String[] T01SS5_A4048CCTLinTpoI ;
   private String[] T01SS5_A4408CCTSta ;
   private String[] T01SS5_A13249CCVNorma ;
   private String[] T01SS5_A13250CCVEspecif ;
   private String[] T01SS5_A11476CCTLinDscL ;
   private String[] T01SS5_A396EmprCod ;
   private int[] T01SS5_A4031CCTCod ;
   private String[] T01SS5_A11522CCVCod ;
   private String[] T01SS14_A396EmprCod ;
   private int[] T01SS14_A4031CCTCod ;
   private short[] T01SS14_A4034CCTLin ;
   private String[] T01SS15_A396EmprCod ;
   private int[] T01SS15_A4031CCTCod ;
   private short[] T01SS15_A4034CCTLin ;
   private short[] T01SS4_A4034CCTLin ;
   private String[] T01SS4_A4043CCTLinDsc ;
   private String[] T01SS4_A4044CCTLinTpoD ;
   private short[] T01SS4_A4045CCTLinLgoD ;
   private String[] T01SS4_A4046CCTLinPict ;
   private String[] T01SS4_A4047CCTLinVarW ;
   private String[] T01SS4_A4048CCTLinTpoI ;
   private String[] T01SS4_A4408CCTSta ;
   private String[] T01SS4_A13249CCVNorma ;
   private String[] T01SS4_A13250CCVEspecif ;
   private String[] T01SS4_A11476CCTLinDscL ;
   private String[] T01SS4_A396EmprCod ;
   private int[] T01SS4_A4031CCTCod ;
   private String[] T01SS4_A11522CCVCod ;
   private String[] T01SS19_A407EmprNom ;
   private boolean[] T01SS19_n407EmprNom ;
   private String[] T01SS20_A11526CCVPict ;
   private boolean[] T01SS20_n11526CCVPict ;
   private short[] T01SS20_A11527CCVLgoDat ;
   private boolean[] T01SS20_n11527CCVLgoDat ;
   private String[] T01SS20_A11528CCVTpoDat ;
   private boolean[] T01SS20_n11528CCVTpoDat ;
   private String[] T01SS20_A11529CCVDsc ;
   private boolean[] T01SS20_n11529CCVDsc ;
   private String[] T01SS21_A396EmprCod ;
   private int[] T01SS21_A252CliCod ;
   private short[] T01SS21_A9713Tb1_Cod ;
   private String[] T01SS21_A11736CCArtCod ;
   private short[] T01SS21_A11748TipArtiId ;
   private String[] T01SS21_A11737CCColNom ;
   private int[] T01SS21_A11738CCColNum ;
   private byte[] T01SS21_A11749CCCTc ;
   private short[] T01SS21_A11750IntId ;
   private int[] T01SS21_A4031CCTCod ;
   private short[] T01SS21_A4034CCTLin ;
   private String[] T01SS22_A396EmprCod ;
   private int[] T01SS22_A252CliCod ;
   private String[] T01SS22_A65ArtCod ;
   private String[] T01SS22_A4058CCFColNom ;
   private int[] T01SS22_A4059CCFColNum ;
   private int[] T01SS22_A4031CCTCod ;
   private short[] T01SS22_A4034CCTLin ;
   private String[] T01SS23_A396EmprCod ;
   private int[] T01SS23_A129BarCod ;
   private byte[] T01SS23_A132BarCodReo ;
   private String[] T01SS23_A130BarCodPar ;
   private String[] T01SS23_A758ProCod ;
   private short[] T01SS23_A194BarOrdLin ;
   private int[] T01SS23_A4031CCTCod ;
   private short[] T01SS23_A4034CCTLin ;
   private String[] T01SS24_A396EmprCod ;
   private int[] T01SS24_A4031CCTCod ;
   private short[] T01SS24_A4034CCTLin ;
   private String[] T01SS25_A396EmprCod ;
   private int[] T01SS25_A4031CCTCod ;
   private short[] T01SS25_A4034CCTLin ;
   private byte[] T01SS25_A4049CCTValLin ;
   private String[] T01SS25_A4050CCTValDsc ;
   private String[] T01SS25_A4051CCTVal ;
   private String[] T01SS26_A396EmprCod ;
   private int[] T01SS26_A4031CCTCod ;
   private short[] T01SS26_A4034CCTLin ;
   private byte[] T01SS26_A4049CCTValLin ;
   private String[] T01SS3_A396EmprCod ;
   private int[] T01SS3_A4031CCTCod ;
   private short[] T01SS3_A4034CCTLin ;
   private byte[] T01SS3_A4049CCTValLin ;
   private String[] T01SS3_A4050CCTValDsc ;
   private String[] T01SS3_A4051CCTVal ;
   private String[] T01SS2_A396EmprCod ;
   private int[] T01SS2_A4031CCTCod ;
   private short[] T01SS2_A4034CCTLin ;
   private byte[] T01SS2_A4049CCTValLin ;
   private String[] T01SS2_A4050CCTValDsc ;
   private String[] T01SS2_A4051CCTVal ;
   private String[] T01SS30_A396EmprCod ;
   private int[] T01SS30_A4031CCTCod ;
   private short[] T01SS30_A4034CCTLin ;
   private byte[] T01SS30_A4049CCTValLin ;
   private String[] T01SS31_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tccdefvar__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccdefvar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccdefvar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccdefvar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccdefvar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SS2", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?  FOR UPDATE OF CCTValDsc, CCTVal NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS3", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS4", "SELECT CCTLin, CCTLinDsc, CCTLinTpoD, CCTLinLgoD, CCTLinPict, CCTLinVarW, CCTLinTpoI, CCTSta, CCVNorma, CCVEspecif, CCTLinDscL, EmprCod, CCTCod, CCVCod FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?  FOR UPDATE OF CCTLinDsc, CCTLinTpoD, CCTLinLgoD, CCTLinPict, CCTLinVarW, CCTLinTpoI, CCTSta, CCVNorma, CCVEspecif, CCTLinDscL, CCVCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS5", "SELECT CCTLin, CCTLinDsc, CCTLinTpoD, CCTLinLgoD, CCTLinPict, CCTLinVarW, CCTLinTpoI, CCTSta, CCVNorma, CCVEspecif, CCTLinDscL, EmprCod, CCTCod, CCVCod FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS7", "SELECT EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS8", "SELECT CCVPict, CCVLgoDat, CCVTpoDat, CCVDsc FROM TXPCCVar WHERE EmprCod = ? AND CCVCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS9", "SELECT /*+ FIRST_ROWS(100) */ TM1.CCTLin, T2.EmprNom, TM1.CCTLinDsc, TM1.CCTLinTpoD, TM1.CCTLinLgoD, TM1.CCTLinPict, TM1.CCTLinVarW, TM1.CCTLinTpoI, TM1.CCTSta, T3.CCVPict, T3.CCVLgoDat, T3.CCVTpoDat, T3.CCVDsc, TM1.CCVNorma, TM1.CCVEspecif, TM1.CCTLinDscL, TM1.EmprCod, TM1.CCTCod, TM1.CCVCod FROM ((TXPCCDef1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCCVar T3 ON T3.EmprCod = TM1.EmprCod AND T3.CCVCod = TM1.CCVCod) WHERE TM1.EmprCod = ? and TM1.CCTCod = ? and TM1.CCTLin = ? ORDER BY TM1.EmprCod, TM1.CCTCod, TM1.CCTLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS11", "SELECT CCVPict, CCVLgoDat, CCVTpoDat, CCVDsc FROM TXPCCVar WHERE EmprCod = ? AND CCVCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS12", "SELECT EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod, CCTLin FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod, CCTLin FROM TXPCCDef1 WHERE ( EmprCod > ? or EmprCod = ? and CCTCod > ? or CCTCod = ? and EmprCod = ? and CCTLin > ?) ORDER BY EmprCod, CCTCod, CCTLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SS15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod, CCTLin FROM TXPCCDef1 WHERE ( EmprCod < ? or EmprCod = ? and CCTCod < ? or CCTCod = ? and EmprCod = ? and CCTLin < ?) ORDER BY EmprCod DESC, CCTCod DESC, CCTLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SS16", "INSERT INTO TXPCCDef1(CCTLin, CCTLinDsc, CCTLinTpoD, CCTLinLgoD, CCTLinPict, CCTLinVarW, CCTLinTpoI, CCTSta, CCVNorma, CCVEspecif, CCTLinDscL, EmprCod, CCTCod, CCVCod, CCTLinDc2, CCTLinVWor, CCTLinWNor, CCVEspe2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPCCDef1")
         ,new UpdateCursor("T01SS17", "UPDATE TXPCCDef1 SET CCTLinDsc=?, CCTLinTpoD=?, CCTLinLgoD=?, CCTLinPict=?, CCTLinVarW=?, CCTLinTpoI=?, CCTSta=?, CCVNorma=?, CCVEspecif=?, CCTLinDscL=?, CCVCod=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCCDef1")
         ,new UpdateCursor("T01SS18", "DELETE FROM TXPCCDef1  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCCDef1")
         ,new ForEachCursor("T01SS19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS20", "SELECT CCVPict, CCVLgoDat, CCVTpoDat, CCVDsc FROM TXPCCVar WHERE EmprCod = ? AND CCVCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS21", "SELECT * FROM (SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod, CCTLin FROM TXPCCCNOS WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SS22", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin FROM TXPCCSta WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SS23", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin FROM TXPCC1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SS24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CCTCod, CCTLin FROM TXPCCDef1 ORDER BY EmprCod, CCTCod, CCTLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS25", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? and CCTValLin = ? ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS26", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin FROM TXPCCDef2 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01SS27", "INSERT INTO TXPCCDef2(EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCDef2")
         ,new UpdateCursor("T01SS28", "UPDATE TXPCCDef2 SET CCTValDsc=?, CCTVal=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?", GX_NOMASK, "TXPCCDef2")
         ,new UpdateCursor("T01SS29", "DELETE FROM TXPCCDef2  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?", GX_NOMASK, "TXPCCDef2")
         ,new ForEachCursor("T01SS30", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SS31", "SELECT EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 32);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 32);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((String[]) buf[7])[0] = rslt.getString(7, 32);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 40);
               ((String[]) buf[10])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((String[]) buf[19])[0] = rslt.getString(15, 30);
               ((String[]) buf[20])[0] = rslt.getVarchar(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 3);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 10);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 19 :
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
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 29 :
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 40);
               stmt.setString(6, (String)parms[5], 32);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 40);
               stmt.setString(9, (String)parms[8], 30);
               stmt.setString(10, (String)parms[9], 30);
               stmt.setVarchar(11, (String)parms[10], 2048, false);
               stmt.setString(12, (String)parms[11], 3);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 10);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 40);
               stmt.setString(5, (String)parms[4], 32);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setString(8, (String)parms[7], 30);
               stmt.setString(9, (String)parms[8], 30);
               stmt.setVarchar(10, (String)parms[9], 2048, false);
               stmt.setString(11, (String)parms[10], 10);
               stmt.setString(12, (String)parms[11], 3);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 40);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

