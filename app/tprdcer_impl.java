package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprdcer_impl extends GXDataArea
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
         A9711Ct_codigo = (short)(GXutil.lval( httpContext.GetPar( "Ct_codigo"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A9711Ct_codigo) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtprdcer_level1item") == 0 )
      {
         gxnrgridtprdcer_level1item_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PRODUCTOS CON CERTIFICACIONES", ""), (short)(0)) ;
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

   public void gxnrgridtprdcer_level1item_newrow_invoke( )
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
      gxnrgridtprdcer_level1item_newrow( ) ;
      /* End function gxnrGridtprdcer_level1item_newrow_invoke */
   }

   public tprdcer_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprdcer_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprdcer_impl.class ));
   }

   public tprdcer_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "PRODUCTOS CON CERTIFICACIONES", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDCER.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDCER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDCER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDCER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDCER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPRDCER.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDCER.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDCER.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDCER.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDCER.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDCER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtprdcer_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDCER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDCER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDCER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtprdcer_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol58( ) ;
      nGXsfl_58_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1268 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1268 = (short)(1) ;
            scanStart14R1268( ) ;
            while ( RcdFound1268 != 0 )
            {
               init_level_properties1268( ) ;
               getByPrimaryKey14R1268( ) ;
               addRow14R1268( ) ;
               scanNext14R1268( ) ;
            }
            scanEnd14R1268( ) ;
            nBlankRcdCount1268 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal14R1268( ) ;
         standaloneModal14R1268( ) ;
         sMode1268 = Gx_mode ;
         while ( nGXsfl_58_idx < nRC_GXsfl_58 )
         {
            bGXsfl_58_Refreshing = true ;
            readRow14R1268( ) ;
            edtCt_codigo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CT_CODIGO_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCt_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCt_codigo_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtCt_Desc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CT_DESC_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCt_Desc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCt_Desc_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            if ( ( nRcdExists_1268 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal14R1268( ) ;
            }
            sendRow14R1268( ) ;
            bGXsfl_58_Refreshing = false ;
         }
         Gx_mode = sMode1268 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1268 = (short)(5) ;
         nRcdExists_1268 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart14R1268( ) ;
            while ( RcdFound1268 != 0 )
            {
               sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_581268( ) ;
               init_level_properties1268( ) ;
               standaloneNotModal14R1268( ) ;
               getByPrimaryKey14R1268( ) ;
               standaloneModal14R1268( ) ;
               addRow14R1268( ) ;
               scanNext14R1268( ) ;
            }
            scanEnd14R1268( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1268 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_581268( ) ;
      initAll14R1268( ) ;
      init_level_properties1268( ) ;
      nRcdExists_1268 = (short)(0) ;
      nIsMod_1268 = (short)(0) ;
      nRcdDeleted_1268 = (short)(0) ;
      nBlankRcdCount1268 = (short)(nBlankRcdUsr1268+nBlankRcdCount1268) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1268 > 0 )
      {
         standaloneNotModal14R1268( ) ;
         standaloneModal14R1268( ) ;
         addRow14R1268( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCt_codigo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1268 = (short)(nBlankRcdCount1268-1) ;
      }
      Gx_mode = sMode1268 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtprdcer_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtprdcer_level1item", Gridtprdcer_level1itemContainer, subGridtprdcer_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtprdcer_level1itemContainerData", Gridtprdcer_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtprdcer_level1itemContainerData"+"V", Gridtprdcer_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtprdcer_level1itemContainerData"+"V"+"\" value='"+Gridtprdcer_level1itemContainer.GridValuesHidden()+"'/>") ;
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
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
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
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
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
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
            initAll14R29( ) ;
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
      disableAttributes14R29( ) ;
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

   public void confirm_14R1268( )
   {
      nGXsfl_58_idx = 0 ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         readRow14R1268( ) ;
         if ( ( nRcdExists_1268 != 0 ) || ( nIsMod_1268 != 0 ) )
         {
            getKey14R1268( ) ;
            if ( ( nRcdExists_1268 == 0 ) && ( nRcdDeleted_1268 == 0 ) )
            {
               if ( RcdFound1268 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate14R1268( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable14R1268( ) ;
                     closeExtendedTableCursors14R1268( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CT_CODIGO_" + sGXsfl_58_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCt_codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1268 != 0 )
               {
                  if ( nRcdDeleted_1268 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey14R1268( ) ;
                     load14R1268( ) ;
                     beforeValidate14R1268( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls14R1268( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1268 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate14R1268( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable14R1268( ) ;
                           closeExtendedTableCursors14R1268( ) ;
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
                  if ( nRcdDeleted_1268 == 0 )
                  {
                     GXCCtl = "CT_CODIGO_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCt_codigo_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCt_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A9711Ct_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCt_Desc_Internalname, GXutil.rtrim( A9712Ct_Desc)) ;
         httpContext.changePostValue( "ZT_"+"Z9711Ct_codigo_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z9711Ct_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1268_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1268, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1268_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1268, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1268_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1268, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1268 != 0 )
         {
            httpContext.changePostValue( "CT_CODIGO_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCt_codigo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CT_DESC_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCt_Desc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption14R0( )
   {
   }

   public void zm14R29( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z718PrdNom = T014R6_A718PrdNom[0] ;
         }
         else
         {
            Z718PrdNom = A718PrdNom ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
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

   public void load14R29( )
   {
      /* Using cursor T014R8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A407EmprNom = T014R8_A407EmprNom[0] ;
         n407EmprNom = T014R8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A718PrdNom = T014R8_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         zm14R29( -1) ;
      }
      pr_default.close(6);
      onLoadActions14R29( ) ;
   }

   public void onLoadActions14R29( )
   {
   }

   public void checkExtendedTable14R29( )
   {
      nIsDirty_29 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T014R7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T014R7_A407EmprNom[0] ;
      n407EmprNom = T014R7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors14R29( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T014R9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T014R9_A407EmprNom[0] ;
      n407EmprNom = T014R9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey14R29( )
   {
      /* Using cursor T014R10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T014R6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm14R29( 1) ;
         RcdFound29 = (short)(1) ;
         A719PrdNum = T014R6_A719PrdNum[0] ;
         n719PrdNum = T014R6_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = T014R6_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A396EmprCod = T014R6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load14R29( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey14R29( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey14R29( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey14R29( ) ;
      if ( RcdFound29 == 0 )
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
      RcdFound29 = (short)(0) ;
      /* Using cursor T014R11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T014R11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T014R11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T014R11_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T014R11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T014R11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T014R11_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            A396EmprCod = T014R11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T014R11_A719PrdNum[0] ;
            n719PrdNum = T014R11_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T014R12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T014R12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T014R12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T014R12_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T014R12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T014R12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T014R12_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            A396EmprCod = T014R12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T014R12_A719PrdNum[0] ;
            n719PrdNum = T014R12_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey14R29( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert14R29( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound29 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               n719PrdNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
               update14R29( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert14R29( ) ;
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
                  insert14R29( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart14R29( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd14R29( ) ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
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
      scanStart14R29( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound29 != 0 )
         {
            scanNext14R29( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd14R29( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency14R29( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T014R5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z718PrdNom, T014R5_A718PrdNom[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T014R5_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("tprdcer:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T014R5_A718PrdNom[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert14R29( )
   {
      beforeValidate14R29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable14R29( ) ;
      }
      if ( AnyError == 0 )
      {
         zm14R29( 0) ;
         checkOptimisticConcurrency14R29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm14R29( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert14R29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T014R13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
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
                        processLevel14R29( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption14R0( ) ;
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
            load14R29( ) ;
         }
         endLevel14R29( ) ;
      }
      closeExtendedTableCursors14R29( ) ;
   }

   public void update14R29( )
   {
      beforeValidate14R29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable14R29( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency14R29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm14R29( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate14R29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T014R14 */
                  pr_default.execute(12, new Object[] {A718PrdNom, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate14R29( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel14R29( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption14R0( ) ;
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
         endLevel14R29( ) ;
      }
      closeExtendedTableCursors14R29( ) ;
   }

   public void deferredUpdate14R29( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate14R29( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency14R29( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls14R29( ) ;
         afterConfirm14R29( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete14R29( ) ;
            if ( AnyError == 0 )
            {
               scanStart14R1268( ) ;
               while ( RcdFound1268 != 0 )
               {
                  getByPrimaryKey14R1268( ) ;
                  delete14R1268( ) ;
                  scanNext14R1268( ) ;
               }
               scanEnd14R1268( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T014R15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound29 == 0 )
                        {
                           initAll14R29( ) ;
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
                        resetCaption14R0( ) ;
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
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel14R29( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls14R29( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T014R16 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         A407EmprNom = T014R16_A407EmprNom[0] ;
         n407EmprNom = T014R16_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T014R17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T014R18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T014R19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T014R20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T014R21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T014R22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T014R23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T014R24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T014R25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T014R26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T014R27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T014R28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T014R29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T014R30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T014R31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T014R32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T014R33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T014R34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T014R35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T014R36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T014R37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T014R38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T014R39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T014R40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T014R41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T014R42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T014R43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T014R44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T014R45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T014R46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T014R47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T014R48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALMC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T014R49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMCONS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T014R50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T014R51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T014R52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T014R53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T014R54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T014R55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T014R56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T014R57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T014R58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROPRV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T014R59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T014R60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T014R61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T014R62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T014R63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T014R64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T014R65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T014R66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T014R67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T014R68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T014R69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T014R70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T014R71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T014R72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T014R73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T014R74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T014R75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T014R76 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T014R77 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T014R78 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T014R79 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T014R80 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T014R81 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T014R82 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T014R83 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T014R84 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T014R85 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T014R86 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T014R87 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T014R88 */
         pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
      }
   }

   public void processNestedLevel14R1268( )
   {
      nGXsfl_58_idx = 0 ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         readRow14R1268( ) ;
         if ( ( nRcdExists_1268 != 0 ) || ( nIsMod_1268 != 0 ) )
         {
            standaloneNotModal14R1268( ) ;
            getKey14R1268( ) ;
            if ( ( nRcdExists_1268 == 0 ) && ( nRcdDeleted_1268 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert14R1268( ) ;
            }
            else
            {
               if ( RcdFound1268 != 0 )
               {
                  if ( ( nRcdDeleted_1268 != 0 ) && ( nRcdExists_1268 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete14R1268( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1268 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update14R1268( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1268 == 0 )
                  {
                     GXCCtl = "CT_CODIGO_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCt_codigo_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCt_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A9711Ct_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCt_Desc_Internalname, GXutil.rtrim( A9712Ct_Desc)) ;
         httpContext.changePostValue( "ZT_"+"Z9711Ct_codigo_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z9711Ct_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1268_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1268, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1268_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1268, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1268_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1268, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1268 != 0 )
         {
            httpContext.changePostValue( "CT_CODIGO_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCt_codigo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CT_DESC_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCt_Desc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll14R1268( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1268 = (short)(0) ;
      nIsMod_1268 = (short)(0) ;
      nRcdDeleted_1268 = (short)(0) ;
   }

   public void processLevel14R29( )
   {
      /* Save parent mode. */
      sMode29 = Gx_mode ;
      processNestedLevel14R1268( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel14R29( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete14R29( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tprdcer");
         if ( AnyError == 0 )
         {
            confirmValues14R0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tprdcer");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart14R29( )
   {
      /* Using cursor T014R89 */
      pr_default.execute(87);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(87) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T014R89_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T014R89_A719PrdNum[0] ;
         n719PrdNum = T014R89_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext14R29( )
   {
      /* Scan next routine */
      pr_default.readNext(87);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(87) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T014R89_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T014R89_A719PrdNum[0] ;
         n719PrdNum = T014R89_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd14R29( )
   {
      pr_default.close(87);
   }

   public void afterConfirm14R29( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert14R29( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate14R29( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete14R29( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete14R29( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate14R29( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes14R29( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
   }

   public void zm14R1268( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -3 )
      {
         Z719PrdNum = A719PrdNum ;
         Z396EmprCod = A396EmprCod ;
         Z9711Ct_codigo = A9711Ct_codigo ;
         Z9712Ct_Desc = A9712Ct_Desc ;
      }
   }

   public void standaloneNotModal14R1268( )
   {
   }

   public void standaloneModal14R1268( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCt_codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCt_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCt_codigo_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      }
      else
      {
         edtCt_codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCt_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCt_codigo_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      }
   }

   public void load14R1268( )
   {
      /* Using cursor T014R90 */
      pr_default.execute(88, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A9711Ct_codigo)});
      if ( (pr_default.getStatus(88) != 101) )
      {
         RcdFound1268 = (short)(1) ;
         A9712Ct_Desc = T014R90_A9712Ct_Desc[0] ;
         n9712Ct_Desc = T014R90_n9712Ct_Desc[0] ;
         zm14R1268( -3) ;
      }
      pr_default.close(88);
      onLoadActions14R1268( ) ;
   }

   public void onLoadActions14R1268( )
   {
   }

   public void checkExtendedTable14R1268( )
   {
      nIsDirty_1268 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal14R1268( ) ;
      /* Using cursor T014R4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A9711Ct_codigo)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CT_CODIGO_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CERTI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCt_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9712Ct_Desc = T014R4_A9712Ct_Desc[0] ;
      n9712Ct_Desc = T014R4_n9712Ct_Desc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors14R1268( )
   {
      pr_default.close(2);
   }

   public void enableDisable14R1268( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         short A9711Ct_codigo )
   {
      /* Using cursor T014R91 */
      pr_default.execute(89, new Object[] {A396EmprCod, Short.valueOf(A9711Ct_codigo)});
      if ( (pr_default.getStatus(89) == 101) )
      {
         GXCCtl = "CT_CODIGO_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CERTI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCt_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9712Ct_Desc = T014R91_A9712Ct_Desc[0] ;
      n9712Ct_Desc = T014R91_n9712Ct_Desc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9712Ct_Desc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(89) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(89);
   }

   public void getKey14R1268( )
   {
      /* Using cursor T014R92 */
      pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A9711Ct_codigo)});
      if ( (pr_default.getStatus(90) != 101) )
      {
         RcdFound1268 = (short)(1) ;
      }
      else
      {
         RcdFound1268 = (short)(0) ;
      }
      pr_default.close(90);
   }

   public void getByPrimaryKey14R1268( )
   {
      /* Using cursor T014R3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A9711Ct_codigo)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm14R1268( 3) ;
         RcdFound1268 = (short)(1) ;
         initializeNonKey14R1268( ) ;
         A9711Ct_codigo = T014R3_A9711Ct_codigo[0] ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z9711Ct_codigo = A9711Ct_codigo ;
         sMode1268 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal14R1268( ) ;
         load14R1268( ) ;
         Gx_mode = sMode1268 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1268 = (short)(0) ;
         initializeNonKey14R1268( ) ;
         sMode1268 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal14R1268( ) ;
         Gx_mode = sMode1268 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes14R1268( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency14R1268( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T014R2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A9711Ct_codigo)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRDCER"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRDCER"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert14R1268( )
   {
      beforeValidate14R1268( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable14R1268( ) ;
      }
      if ( AnyError == 0 )
      {
         zm14R1268( 0) ;
         checkOptimisticConcurrency14R1268( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm14R1268( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert14R1268( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T014R93 */
                  pr_default.execute(91, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod, Short.valueOf(A9711Ct_codigo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDCER");
                  if ( (pr_default.getStatus(91) == 1) )
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
            load14R1268( ) ;
         }
         endLevel14R1268( ) ;
      }
      closeExtendedTableCursors14R1268( ) ;
   }

   public void update14R1268( )
   {
      beforeValidate14R1268( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable14R1268( ) ;
      }
      if ( ( nIsMod_1268 != 0 ) || ( nIsDirty_1268 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency14R1268( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm14R1268( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate14R1268( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPPRDCER */
                     deferredUpdate14R1268( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey14R1268( ) ;
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
            endLevel14R1268( ) ;
         }
      }
      closeExtendedTableCursors14R1268( ) ;
   }

   public void deferredUpdate14R1268( )
   {
   }

   public void delete14R1268( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate14R1268( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency14R1268( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls14R1268( ) ;
         afterConfirm14R1268( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete14R1268( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T014R94 */
               pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A9711Ct_codigo)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDCER");
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
      sMode1268 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel14R1268( ) ;
      Gx_mode = sMode1268 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls14R1268( )
   {
      standaloneModal14R1268( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T014R95 */
         pr_default.execute(93, new Object[] {A396EmprCod, Short.valueOf(A9711Ct_codigo)});
         A9712Ct_Desc = T014R95_A9712Ct_Desc[0] ;
         n9712Ct_Desc = T014R95_n9712Ct_Desc[0] ;
         pr_default.close(93);
      }
   }

   public void endLevel14R1268( )
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

   public void scanStart14R1268( )
   {
      /* Scan By routine */
      /* Using cursor T014R96 */
      pr_default.execute(94, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      RcdFound1268 = (short)(0) ;
      if ( (pr_default.getStatus(94) != 101) )
      {
         RcdFound1268 = (short)(1) ;
         A9711Ct_codigo = T014R96_A9711Ct_codigo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext14R1268( )
   {
      /* Scan next routine */
      pr_default.readNext(94);
      RcdFound1268 = (short)(0) ;
      if ( (pr_default.getStatus(94) != 101) )
      {
         RcdFound1268 = (short)(1) ;
         A9711Ct_codigo = T014R96_A9711Ct_codigo[0] ;
      }
   }

   public void scanEnd14R1268( )
   {
      pr_default.close(94);
   }

   public void afterConfirm14R1268( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert14R1268( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate14R1268( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete14R1268( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete14R1268( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate14R1268( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes14R1268( )
   {
      edtCt_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCt_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCt_codigo_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtCt_Desc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCt_Desc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCt_Desc_Enabled), 5, 0), !bGXsfl_58_Refreshing);
   }

   public void send_integrity_lvl_hashes14R1268( )
   {
   }

   public void send_integrity_lvl_hashes14R29( )
   {
   }

   public void subsflControlProps_581268( )
   {
      edtCt_codigo_Internalname = "CT_CODIGO_"+sGXsfl_58_idx ;
      edtCt_Desc_Internalname = "CT_DESC_"+sGXsfl_58_idx ;
   }

   public void subsflControlProps_fel_581268( )
   {
      edtCt_codigo_Internalname = "CT_CODIGO_"+sGXsfl_58_fel_idx ;
      edtCt_Desc_Internalname = "CT_DESC_"+sGXsfl_58_fel_idx ;
   }

   public void addRow14R1268( )
   {
      nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_581268( ) ;
      sendRow14R1268( ) ;
   }

   public void sendRow14R1268( )
   {
      Gridtprdcer_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtprdcer_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtprdcer_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtprdcer_level1item_Class, "") != 0 )
         {
            subGridtprdcer_level1item_Linesclass = subGridtprdcer_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtprdcer_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtprdcer_level1item_Backstyle = (byte)(0) ;
         subGridtprdcer_level1item_Backcolor = subGridtprdcer_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtprdcer_level1item_Class, "") != 0 )
         {
            subGridtprdcer_level1item_Linesclass = subGridtprdcer_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtprdcer_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtprdcer_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtprdcer_level1item_Class, "") != 0 )
         {
            subGridtprdcer_level1item_Linesclass = subGridtprdcer_level1item_Class+"Odd" ;
         }
         subGridtprdcer_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtprdcer_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtprdcer_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_58_idx) % (2))) == 0 )
         {
            subGridtprdcer_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtprdcer_level1item_Class, "") != 0 )
            {
               subGridtprdcer_level1item_Linesclass = subGridtprdcer_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtprdcer_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtprdcer_level1item_Class, "") != 0 )
            {
               subGridtprdcer_level1item_Linesclass = subGridtprdcer_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1268_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridtprdcer_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCt_codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A9711Ct_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9711Ct_codigo), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCt_codigo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCt_codigo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtprdcer_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCt_Desc_Internalname,GXutil.rtrim( A9712Ct_Desc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCt_Desc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCt_Desc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridtprdcer_level1itemRow);
      send_integrity_lvl_hashes14R1268( ) ;
      GXCCtl = "Z9711Ct_codigo_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9711Ct_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1268_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1268, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1268_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1268, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1268_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1268, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CT_CODIGO_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCt_codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CT_DESC_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCt_Desc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtprdcer_level1itemContainer.AddRow(Gridtprdcer_level1itemRow);
   }

   public void readRow14R1268( )
   {
      nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_581268( ) ;
      edtCt_codigo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CT_CODIGO_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCt_Desc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CT_DESC_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCt_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCt_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CT_CODIGO_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCt_codigo_Internalname ;
         wbErr = true ;
         A9711Ct_codigo = (short)(0) ;
      }
      else
      {
         A9711Ct_codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtCt_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9712Ct_Desc = httpContext.cgiGet( edtCt_Desc_Internalname) ;
      n9712Ct_Desc = false ;
      GXCCtl = "Z9711Ct_codigo_" + sGXsfl_58_idx ;
      Z9711Ct_codigo = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1268_" + sGXsfl_58_idx ;
      nRcdDeleted_1268 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1268_" + sGXsfl_58_idx ;
      nRcdExists_1268 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1268_" + sGXsfl_58_idx ;
      nIsMod_1268 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCt_codigo_Enabled = edtCt_codigo_Enabled ;
   }

   public void confirmValues14R0( )
   {
      nGXsfl_58_idx = 0 ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_581268( ) ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_581268( ) ;
         httpContext.changePostValue( "Z9711Ct_codigo_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z9711Ct_codigo_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9711Ct_codigo_"+sGXsfl_58_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tprdcer", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
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
      return formatLink("app.tprdcer", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPRDCER" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PRODUCTOS CON CERTIFICACIONES", "") ;
   }

   public void initializeNonKey14R29( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      Z718PrdNom = "" ;
   }

   public void initAll14R29( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey14R29( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey14R1268( )
   {
      A9712Ct_Desc = "" ;
      n9712Ct_Desc = false ;
   }

   public void initAll14R1268( )
   {
      A9711Ct_codigo = (short)(0) ;
      initializeNonKey14R1268( ) ;
   }

   public void standaloneModalInsert14R1268( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241542575", true, true);
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
      httpContext.AddJavascriptSource("tprdcer.js", "?20268241542575", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1268( )
   {
      edtCt_codigo_Enabled = defedtCt_codigo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCt_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCt_codigo_Enabled), 5, 0), !bGXsfl_58_Refreshing);
   }

   public void startgridcontrol58( )
   {
      Gridtprdcer_level1itemContainer.AddObjectProperty("GridName", "Gridtprdcer_level1item");
      Gridtprdcer_level1itemContainer.AddObjectProperty("Header", subGridtprdcer_level1item_Header);
      Gridtprdcer_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtprdcer_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtprdcer_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtprdcer_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtprdcer_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtprdcer_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtprdcer_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtprdcer_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtprdcer_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9711Ct_codigo, (byte)(4), (byte)(0), ".", "")));
      Gridtprdcer_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCt_codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtprdcer_level1itemContainer.AddColumnProperties(Gridtprdcer_level1itemColumn);
      Gridtprdcer_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtprdcer_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A9712Ct_Desc));
      Gridtprdcer_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCt_Desc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtprdcer_level1itemContainer.AddColumnProperties(Gridtprdcer_level1itemColumn);
      Gridtprdcer_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtprdcer_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtprdcer_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtprdcer_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtprdcer_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtprdcer_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtprdcer_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtprdcer_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtprdcer_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtprdcer_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtprdcer_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtprdcer_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtprdcer_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtprdcer_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtCt_codigo_Internalname = "CT_CODIGO" ;
      edtCt_Desc_Internalname = "CT_DESC" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtprdcer_level1item_Internalname = "GRIDTPRDCER_LEVEL1ITEM" ;
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
      subGridtprdcer_level1item_Allowcollapsing = (byte)(0) ;
      subGridtprdcer_level1item_Allowselection = (byte)(0) ;
      subGridtprdcer_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "PRODUCTOS CON CERTIFICACIONES", "") );
      edtCt_Desc_Jsonclick = "" ;
      edtCt_codigo_Jsonclick = "" ;
      subGridtprdcer_level1item_Class = "Grid" ;
      subGridtprdcer_level1item_Backcolorstyle = (byte)(0) ;
      edtCt_Desc_Enabled = 0 ;
      edtCt_codigo_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
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

   public void gxnrgridtprdcer_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_581268( ) ;
      while ( nGXsfl_58_idx <= nRC_GXsfl_58 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal14R1268( ) ;
         standaloneModal14R1268( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow14R1268( ) ;
         nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_581268( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtprdcer_level1itemContainer)) ;
      /* End function gxnrGridtprdcer_level1item_newrow */
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
      /* Using cursor T014R16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T014R16_A407EmprNom[0] ;
      n407EmprNom = T014R16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      GX_FocusControl = edtPrdNom_Internalname ;
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
      /* Using cursor T014R16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T014R16_A407EmprNom[0] ;
      n407EmprNom = T014R16_n407EmprNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Ct_codigo( )
   {
      n9712Ct_Desc = false ;
      /* Using cursor T014R95 */
      pr_default.execute(93, new Object[] {A396EmprCod, Short.valueOf(A9711Ct_codigo)});
      if ( (pr_default.getStatus(93) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CERTI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CT_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCt_codigo_Internalname ;
      }
      A9712Ct_Desc = T014R95_A9712Ct_Desc[0] ;
      n9712Ct_Desc = T014R95_n9712Ct_Desc[0] ;
      pr_default.close(93);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9712Ct_Desc", GXutil.rtrim( A9712Ct_Desc));
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
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z718PrdNom'},{av:'Z407EmprNom'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_CT_CODIGO","{handler:'valid_Ct_codigo',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9711Ct_codigo',fld:'CT_CODIGO',pic:'ZZZ9'},{av:'A9712Ct_Desc',fld:'CT_DESC',pic:''}]");
      setEventMetadata("VALID_CT_CODIGO",",oparms:[{av:'A9712Ct_Desc',fld:'CT_DESC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Ct_desc',iparms:[]");
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
      pr_default.close(93);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z718PrdNom = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtprdcer_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1268 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A9712Ct_Desc = "" ;
      Z407EmprNom = "" ;
      T014R8_A719PrdNum = new String[] {""} ;
      T014R8_n719PrdNum = new boolean[] {false} ;
      T014R8_A407EmprNom = new String[] {""} ;
      T014R8_n407EmprNom = new boolean[] {false} ;
      T014R8_A718PrdNom = new String[] {""} ;
      T014R8_A396EmprCod = new String[] {""} ;
      T014R7_A407EmprNom = new String[] {""} ;
      T014R7_n407EmprNom = new boolean[] {false} ;
      T014R9_A407EmprNom = new String[] {""} ;
      T014R9_n407EmprNom = new boolean[] {false} ;
      T014R10_A396EmprCod = new String[] {""} ;
      T014R10_A719PrdNum = new String[] {""} ;
      T014R10_n719PrdNum = new boolean[] {false} ;
      T014R6_A719PrdNum = new String[] {""} ;
      T014R6_n719PrdNum = new boolean[] {false} ;
      T014R6_A718PrdNom = new String[] {""} ;
      T014R6_A396EmprCod = new String[] {""} ;
      sMode29 = "" ;
      T014R11_A396EmprCod = new String[] {""} ;
      T014R11_A719PrdNum = new String[] {""} ;
      T014R11_n719PrdNum = new boolean[] {false} ;
      T014R12_A396EmprCod = new String[] {""} ;
      T014R12_A719PrdNum = new String[] {""} ;
      T014R12_n719PrdNum = new boolean[] {false} ;
      T014R5_A719PrdNum = new String[] {""} ;
      T014R5_n719PrdNum = new boolean[] {false} ;
      T014R5_A718PrdNom = new String[] {""} ;
      T014R5_A396EmprCod = new String[] {""} ;
      T014R16_A407EmprNom = new String[] {""} ;
      T014R16_n407EmprNom = new boolean[] {false} ;
      T014R17_A396EmprCod = new String[] {""} ;
      T014R17_A719PrdNum = new String[] {""} ;
      T014R17_n719PrdNum = new boolean[] {false} ;
      T014R17_A13217NormaID = new String[] {""} ;
      T014R18_A396EmprCod = new String[] {""} ;
      T014R18_A719PrdNum = new String[] {""} ;
      T014R18_n719PrdNum = new boolean[] {false} ;
      T014R18_A13586TheList = new String[] {""} ;
      T014R19_A396EmprCod = new String[] {""} ;
      T014R19_A5532Lb_numero = new int[1] ;
      T014R19_A5555Lb_opcion = new String[] {""} ;
      T014R19_A13460Lb_linCP = new short[1] ;
      T014R19_A13458Lb_TipCP = new String[] {""} ;
      T014R20_A396EmprCod = new String[] {""} ;
      T014R20_A13418AlbProID = new int[1] ;
      T014R20_A13442AlbProLine = new short[1] ;
      T014R21_A396EmprCod = new String[] {""} ;
      T014R21_A13324LDESID = new int[1] ;
      T014R21_A13333LDESNPeque = new String[] {""} ;
      T014R21_A13337LDESComb = new String[] {""} ;
      T014R21_A13339LDESFondo = new String[] {""} ;
      T014R21_A13342LDESLinea = new short[1] ;
      T014R22_A396EmprCod = new String[] {""} ;
      T014R22_A13312Lb_NLab = new int[1] ;
      T014R22_A13305Lb_IDVeces = new short[1] ;
      T014R22_A13306Lb_LinID = new short[1] ;
      T014R23_A396EmprCod = new String[] {""} ;
      T014R23_A12673LavMqId = new int[1] ;
      T014R23_A12692LavMqLnPq = new short[1] ;
      T014R23_A12681LavMqLn = new short[1] ;
      T014R24_A396EmprCod = new String[] {""} ;
      T014R24_A719PrdNum = new String[] {""} ;
      T014R24_n719PrdNum = new boolean[] {false} ;
      T014R24_A9713Tb1_Cod = new short[1] ;
      T014R25_A396EmprCod = new String[] {""} ;
      T014R25_A12236PrdNumD = new String[] {""} ;
      T014R25_A719PrdNum = new String[] {""} ;
      T014R25_n719PrdNum = new boolean[] {false} ;
      T014R26_A396EmprCod = new String[] {""} ;
      T014R26_A12225DocDisID = new long[1] ;
      T014R26_A12226LinDisID = new short[1] ;
      T014R27_A396EmprCod = new String[] {""} ;
      T014R27_A12225DocDisID = new long[1] ;
      T014R28_A396EmprCod = new String[] {""} ;
      T014R28_A12205OrdenCID = new long[1] ;
      T014R28_A12206OrdenCLnId = new short[1] ;
      T014R29_A396EmprCod = new String[] {""} ;
      T014R29_A719PrdNum = new String[] {""} ;
      T014R29_n719PrdNum = new boolean[] {false} ;
      T014R29_A11664LoteID = new String[] {""} ;
      T014R29_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T014R30_A396EmprCod = new String[] {""} ;
      T014R30_A4850DevComCod = new int[1] ;
      T014R30_A719PrdNum = new String[] {""} ;
      T014R30_n719PrdNum = new boolean[] {false} ;
      T014R31_A396EmprCod = new String[] {""} ;
      T014R31_A252CliCod = new int[1] ;
      T014R31_A494ForSer = new String[] {""} ;
      T014R31_A482ForColNom = new String[] {""} ;
      T014R31_A483ForColNum = new int[1] ;
      T014R31_A831TipColCod = new byte[1] ;
      T014R31_A3571EnsCod = new String[] {""} ;
      T014R31_A3582EnsLin = new short[1] ;
      T014R32_A396EmprCod = new String[] {""} ;
      T014R32_A129BarCod = new int[1] ;
      T014R32_A132BarCodReo = new byte[1] ;
      T014R32_A130BarCodPar = new String[] {""} ;
      T014R32_A4075recestncol = new byte[1] ;
      T014R32_A4076recestnpro = new byte[1] ;
      T014R32_A4108recestlin = new short[1] ;
      T014R33_A396EmprCod = new String[] {""} ;
      T014R33_A4052EstNumFor = new int[1] ;
      T014R33_A4053EstNumCol = new byte[1] ;
      T014R33_A4090EstEspLin = new byte[1] ;
      T014R34_A396EmprCod = new String[] {""} ;
      T014R34_A4052EstNumFor = new int[1] ;
      T014R34_A4053EstNumCol = new byte[1] ;
      T014R34_A4084EstProLin = new byte[1] ;
      T014R35_A396EmprCod = new String[] {""} ;
      T014R35_A11644TransferId = new long[1] ;
      T014R35_A11653TransferLn = new int[1] ;
      T014R36_A396EmprCod = new String[] {""} ;
      T014R36_A11634TaesId = new String[] {""} ;
      T014R36_A11637TaesLn = new short[1] ;
      T014R36_A11641TaesLnP = new short[1] ;
      T014R37_A396EmprCod = new String[] {""} ;
      T014R37_A719PrdNum = new String[] {""} ;
      T014R37_n719PrdNum = new boolean[] {false} ;
      T014R37_A11329H_stklin = new long[1] ;
      T014R38_A396EmprCod = new String[] {""} ;
      T014R38_A11270Pot_num = new int[1] ;
      T014R38_A11271Pot_lin = new short[1] ;
      T014R39_A396EmprCod = new String[] {""} ;
      T014R39_A719PrdNum = new String[] {""} ;
      T014R39_n719PrdNum = new boolean[] {false} ;
      T014R39_A11199PrdNcasC = new String[] {""} ;
      T014R40_A396EmprCod = new String[] {""} ;
      T014R40_A719PrdNum = new String[] {""} ;
      T014R40_n719PrdNum = new boolean[] {false} ;
      T014R40_A11197CFraseR = new String[] {""} ;
      T014R41_A396EmprCod = new String[] {""} ;
      T014R41_A10243Jt_codigo = new short[1] ;
      T014R41_A10246Jt_ord = new short[1] ;
      T014R42_A396EmprCod = new String[] {""} ;
      T014R42_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T014R42_A10238Bny_lin = new short[1] ;
      T014R43_A396EmprCod = new String[] {""} ;
      T014R43_A129BarCod = new int[1] ;
      T014R43_A132BarCodReo = new byte[1] ;
      T014R43_A130BarCodPar = new String[] {""} ;
      T014R43_A758ProCod = new String[] {""} ;
      T014R43_A194BarOrdLin = new short[1] ;
      T014R43_A719PrdNum = new String[] {""} ;
      T014R43_n719PrdNum = new boolean[] {false} ;
      T014R44_A396EmprCod = new String[] {""} ;
      T014R44_A719PrdNum = new String[] {""} ;
      T014R44_n719PrdNum = new boolean[] {false} ;
      T014R44_A9735Cod_Rgo = new String[] {""} ;
      T014R45_A396EmprCod = new String[] {""} ;
      T014R45_A9652OeNum = new long[1] ;
      T014R45_A9653OeHdr = new int[1] ;
      T014R45_A9654OeHdrr = new byte[1] ;
      T014R45_A9655OeHdrp = new String[] {""} ;
      T014R45_A9656OeLinC = new byte[1] ;
      T014R45_A9657OeComb = new String[] {""} ;
      T014R45_A9658Oefondo = new String[] {""} ;
      T014R45_A9659OeMolCil = new byte[1] ;
      T014R45_A9686OePasLin = new short[1] ;
      T014R45_A9694OePasPLi = new short[1] ;
      T014R46_A396EmprCod = new String[] {""} ;
      T014R46_A9652OeNum = new long[1] ;
      T014R46_A9653OeHdr = new int[1] ;
      T014R46_A9654OeHdrr = new byte[1] ;
      T014R46_A9655OeHdrp = new String[] {""} ;
      T014R46_A9656OeLinC = new byte[1] ;
      T014R46_A9657OeComb = new String[] {""} ;
      T014R46_A9658Oefondo = new String[] {""} ;
      T014R46_A9659OeMolCil = new byte[1] ;
      T014R46_A9677OeMolLin = new byte[1] ;
      T014R47_A396EmprCod = new String[] {""} ;
      T014R47_A9578Pas_Num = new int[1] ;
      T014R47_A719PrdNum = new String[] {""} ;
      T014R47_n719PrdNum = new boolean[] {false} ;
      T014R48_A396EmprCod = new String[] {""} ;
      T014R48_A719PrdNum = new String[] {""} ;
      T014R48_n719PrdNum = new boolean[] {false} ;
      T014R48_A8908CC_AlmCod = new byte[1] ;
      T014R49_A396EmprCod = new String[] {""} ;
      T014R49_A719PrdNum = new String[] {""} ;
      T014R49_n719PrdNum = new boolean[] {false} ;
      T014R49_A8661Almc_Ln = new int[1] ;
      T014R50_A396EmprCod = new String[] {""} ;
      T014R50_A719PrdNum = new String[] {""} ;
      T014R50_n719PrdNum = new boolean[] {false} ;
      T014R50_A8648Mat_PrdN = new String[] {""} ;
      T014R51_A396EmprCod = new String[] {""} ;
      T014R51_A8585Pet_cod = new long[1] ;
      T014R51_A719PrdNum = new String[] {""} ;
      T014R51_n719PrdNum = new boolean[] {false} ;
      T014R52_A396EmprCod = new String[] {""} ;
      T014R52_A719PrdNum = new String[] {""} ;
      T014R52_n719PrdNum = new boolean[] {false} ;
      T014R52_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T014R53_A396EmprCod = new String[] {""} ;
      T014R53_A719PrdNum = new String[] {""} ;
      T014R53_n719PrdNum = new boolean[] {false} ;
      T014R53_A8366PrdAnyo = new short[1] ;
      T014R53_A8360PrdProv = new int[1] ;
      T014R54_A396EmprCod = new String[] {""} ;
      T014R54_A252CliCod = new int[1] ;
      T014R54_A494ForSer = new String[] {""} ;
      T014R54_A482ForColNom = new String[] {""} ;
      T014R54_A483ForColNum = new int[1] ;
      T014R54_A831TipColCod = new byte[1] ;
      T014R54_A7797Sim_lin = new short[1] ;
      T014R55_A396EmprCod = new String[] {""} ;
      T014R55_A7163Vir_Codigo = new int[1] ;
      T014R55_A719PrdNum = new String[] {""} ;
      T014R55_n719PrdNum = new boolean[] {false} ;
      T014R56_A396EmprCod = new String[] {""} ;
      T014R56_A6310Lb_TaAuxC = new String[] {""} ;
      T014R56_A6313lb_TaAuxL = new short[1] ;
      T014R56_A6378Lb_TauxLP = new short[1] ;
      T014R57_A396EmprCod = new String[] {""} ;
      T014R57_A6290PreCoNum = new int[1] ;
      T014R57_A719PrdNum = new String[] {""} ;
      T014R57_n719PrdNum = new boolean[] {false} ;
      T014R58_A396EmprCod = new String[] {""} ;
      T014R58_A719PrdNum = new String[] {""} ;
      T014R58_n719PrdNum = new boolean[] {false} ;
      T014R58_A6158PrdPrv = new int[1] ;
      T014R59_A396EmprCod = new String[] {""} ;
      T014R59_A719PrdNum = new String[] {""} ;
      T014R59_n719PrdNum = new boolean[] {false} ;
      T014R59_A5973PrdSusNum = new String[] {""} ;
      T014R60_A396EmprCod = new String[] {""} ;
      T014R60_A5612Lb_CodGru = new String[] {""} ;
      T014R60_A5615Lb_LinGru = new short[1] ;
      T014R61_A396EmprCod = new String[] {""} ;
      T014R61_A5532Lb_numero = new int[1] ;
      T014R61_A5555Lb_opcion = new String[] {""} ;
      T014R61_A5560Lb_LineaPr = new short[1] ;
      T014R62_A396EmprCod = new String[] {""} ;
      T014R62_A5532Lb_numero = new int[1] ;
      T014R62_A5555Lb_opcion = new String[] {""} ;
      T014R62_A5557Lb_LineaC = new short[1] ;
      T014R63_A396EmprCod = new String[] {""} ;
      T014R63_A5145SobCod = new int[1] ;
      T014R63_A719PrdNum = new String[] {""} ;
      T014R63_n719PrdNum = new boolean[] {false} ;
      T014R64_A396EmprCod = new String[] {""} ;
      T014R64_A4744RecPreCod = new int[1] ;
      T014R64_A4762RecPreLin = new short[1] ;
      T014R64_A4763RecPreNli = new short[1] ;
      T014R65_A396EmprCod = new String[] {""} ;
      T014R65_A4492HreBarCod = new int[1] ;
      T014R65_A4493HreBarReo = new byte[1] ;
      T014R65_A4494HreBarPar = new String[] {""} ;
      T014R65_A4495HreNumCie = new byte[1] ;
      T014R65_A4545HreLinMaq = new short[1] ;
      T014R65_A4550HreLinPro = new byte[1] ;
      T014R65_A4557HreRecLin = new short[1] ;
      T014R66_A396EmprCod = new String[] {""} ;
      T014R66_A4492HreBarCod = new int[1] ;
      T014R66_A4493HreBarReo = new byte[1] ;
      T014R66_A4494HreBarPar = new String[] {""} ;
      T014R66_A4495HreNumCie = new byte[1] ;
      T014R66_A4508HreLinMAL = new short[1] ;
      T014R66_A4509HreNumAny = new byte[1] ;
      T014R66_A719PrdNum = new String[] {""} ;
      T014R66_n719PrdNum = new boolean[] {false} ;
      T014R67_A396EmprCod = new String[] {""} ;
      T014R67_A252CliCod = new int[1] ;
      T014R67_A4415EstCol = new String[] {""} ;
      T014R67_A4416EstColLin = new short[1] ;
      T014R68_A396EmprCod = new String[] {""} ;
      T014R68_A129BarCod = new int[1] ;
      T014R68_A132BarCodReo = new byte[1] ;
      T014R68_A130BarCodPar = new String[] {""} ;
      T014R68_A2524DisComLin = new byte[1] ;
      T014R68_A1056DisComCod = new String[] {""} ;
      T014R68_A1032FonCod = new String[] {""} ;
      T014R68_A2124RecMolCod = new byte[1] ;
      T014R68_A2672RecPasLin = new short[1] ;
      T014R68_A2675RecPasPLi = new short[1] ;
      T014R69_A396EmprCod = new String[] {""} ;
      T014R69_A129BarCod = new int[1] ;
      T014R69_A132BarCodReo = new byte[1] ;
      T014R69_A130BarCodPar = new String[] {""} ;
      T014R69_A2524DisComLin = new byte[1] ;
      T014R69_A1056DisComCod = new String[] {""} ;
      T014R69_A1032FonCod = new String[] {""} ;
      T014R69_A2124RecMolCod = new byte[1] ;
      T014R69_A2126RecMolLin = new byte[1] ;
      T014R70_A396EmprCod = new String[] {""} ;
      T014R70_A2107PasCod = new String[] {""} ;
      T014R70_A719PrdNum = new String[] {""} ;
      T014R70_n719PrdNum = new boolean[] {false} ;
      T014R71_A396EmprCod = new String[] {""} ;
      T014R71_A2637HisEstHRu = new int[1] ;
      T014R71_A2636HisEstHRe = new byte[1] ;
      T014R71_A2635HisEstHPa = new String[] {""} ;
      T014R71_A2638HisEstLCo = new byte[1] ;
      T014R71_A2630HisEstCom = new String[] {""} ;
      T014R71_A2634HisEstFon = new String[] {""} ;
      T014R71_A719PrdNum = new String[] {""} ;
      T014R71_n719PrdNum = new boolean[] {false} ;
      T014R72_A396EmprCod = new String[] {""} ;
      T014R72_A252CliCod = new int[1] ;
      T014R72_A2141SerEst = new String[] {""} ;
      T014R72_A1013DibCli = new String[] {""} ;
      T014R72_A1014DibInt = new int[1] ;
      T014R72_A2074ColCom = new String[] {""} ;
      T014R72_A2078ColFon = new String[] {""} ;
      T014R72_A2098MolCod = new byte[1] ;
      T014R72_A2535ForPrdLin = new short[1] ;
      T014R73_A396EmprCod = new String[] {""} ;
      T014R73_A719PrdNum = new String[] {""} ;
      T014R73_n719PrdNum = new boolean[] {false} ;
      T014R73_A3342CCStkLin = new long[1] ;
      T014R74_A396EmprCod = new String[] {""} ;
      T014R74_A252CliCod = new int[1] ;
      T014R74_A2891HMaForSer = new String[] {""} ;
      T014R74_A2892HMaForCNom = new String[] {""} ;
      T014R74_A2893HMaForCNum = new int[1] ;
      T014R74_A2894HMaTipCCod = new byte[1] ;
      T014R74_A2895HMaForNumC = new int[1] ;
      T014R74_A2897HMaColLin = new short[1] ;
      T014R74_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T014R74_A2907HmaLin = new short[1] ;
      T014R75_A396EmprCod = new String[] {""} ;
      T014R75_A129BarCod = new int[1] ;
      T014R75_A132BarCodReo = new byte[1] ;
      T014R75_A130BarCodPar = new String[] {""} ;
      T014R75_A2808RecLinMAL = new short[1] ;
      T014R75_A1377RecNumAny = new byte[1] ;
      T014R75_A719PrdNum = new String[] {""} ;
      T014R75_n719PrdNum = new boolean[] {false} ;
      T014R76_A396EmprCod = new String[] {""} ;
      T014R76_A129BarCod = new int[1] ;
      T014R76_A132BarCodReo = new byte[1] ;
      T014R76_A130BarCodPar = new String[] {""} ;
      T014R76_A2804RecLinMaq = new short[1] ;
      T014R76_A1273RecLinPro = new byte[1] ;
      T014R76_A811RecLin = new short[1] ;
      T014R77_A396EmprCod = new String[] {""} ;
      T014R77_A129BarCod = new int[1] ;
      T014R77_A132BarCodReo = new byte[1] ;
      T014R77_A130BarCodPar = new String[] {""} ;
      T014R77_A2494BarDosPro = new String[] {""} ;
      T014R77_A719PrdNum = new String[] {""} ;
      T014R77_n719PrdNum = new boolean[] {false} ;
      T014R78_A396EmprCod = new String[] {""} ;
      T014R78_A1314EnsLabCod = new int[1] ;
      T014R78_A1317EnsLabLin = new short[1] ;
      T014R79_A396EmprCod = new String[] {""} ;
      T014R79_A910Workstat = new String[] {""} ;
      T014R79_A887EscMLin = new int[1] ;
      T014R80_A396EmprCod = new String[] {""} ;
      T014R80_A859CumCodCont = new int[1] ;
      T014R80_A719PrdNum = new String[] {""} ;
      T014R80_n719PrdNum = new boolean[] {false} ;
      T014R81_A396EmprCod = new String[] {""} ;
      T014R81_A719PrdNum = new String[] {""} ;
      T014R81_n719PrdNum = new boolean[] {false} ;
      T014R81_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T014R82_A396EmprCod = new String[] {""} ;
      T014R82_A486ForNumCol = new int[1] ;
      T014R82_A715PrdLin = new short[1] ;
      T014R83_A396EmprCod = new String[] {""} ;
      T014R83_A719PrdNum = new String[] {""} ;
      T014R83_n719PrdNum = new boolean[] {false} ;
      T014R83_A681PrdAny = new short[1] ;
      T014R84_A396EmprCod = new String[] {""} ;
      T014R84_A719PrdNum = new String[] {""} ;
      T014R84_n719PrdNum = new boolean[] {false} ;
      T014R84_A688PrdComCod = new String[] {""} ;
      T014R85_A396EmprCod = new String[] {""} ;
      T014R85_A719PrdNum = new String[] {""} ;
      T014R85_n719PrdNum = new boolean[] {false} ;
      T014R85_A680PrdAltNum = new String[] {""} ;
      T014R86_A396EmprCod = new String[] {""} ;
      T014R86_A658PedCod = new int[1] ;
      T014R86_A719PrdNum = new String[] {""} ;
      T014R86_n719PrdNum = new boolean[] {false} ;
      T014R87_A396EmprCod = new String[] {""} ;
      T014R87_A486ForNumCol = new int[1] ;
      T014R87_A309ColLin = new short[1] ;
      T014R88_A396EmprCod = new String[] {""} ;
      T014R88_A719PrdNum = new String[] {""} ;
      T014R88_n719PrdNum = new boolean[] {false} ;
      T014R88_A647NumCon = new int[1] ;
      T014R89_A396EmprCod = new String[] {""} ;
      T014R89_A719PrdNum = new String[] {""} ;
      T014R89_n719PrdNum = new boolean[] {false} ;
      Z9712Ct_Desc = "" ;
      T014R90_A719PrdNum = new String[] {""} ;
      T014R90_n719PrdNum = new boolean[] {false} ;
      T014R90_A9712Ct_Desc = new String[] {""} ;
      T014R90_n9712Ct_Desc = new boolean[] {false} ;
      T014R90_A396EmprCod = new String[] {""} ;
      T014R90_A9711Ct_codigo = new short[1] ;
      T014R4_A9712Ct_Desc = new String[] {""} ;
      T014R4_n9712Ct_Desc = new boolean[] {false} ;
      T014R91_A9712Ct_Desc = new String[] {""} ;
      T014R91_n9712Ct_Desc = new boolean[] {false} ;
      T014R92_A396EmprCod = new String[] {""} ;
      T014R92_A719PrdNum = new String[] {""} ;
      T014R92_n719PrdNum = new boolean[] {false} ;
      T014R92_A9711Ct_codigo = new short[1] ;
      T014R3_A719PrdNum = new String[] {""} ;
      T014R3_n719PrdNum = new boolean[] {false} ;
      T014R3_A396EmprCod = new String[] {""} ;
      T014R3_A9711Ct_codigo = new short[1] ;
      T014R2_A719PrdNum = new String[] {""} ;
      T014R2_n719PrdNum = new boolean[] {false} ;
      T014R2_A396EmprCod = new String[] {""} ;
      T014R2_A9711Ct_codigo = new short[1] ;
      T014R95_A9712Ct_Desc = new String[] {""} ;
      T014R95_n9712Ct_Desc = new boolean[] {false} ;
      T014R96_A396EmprCod = new String[] {""} ;
      T014R96_A719PrdNum = new String[] {""} ;
      T014R96_n719PrdNum = new boolean[] {false} ;
      T014R96_A9711Ct_codigo = new short[1] ;
      Gridtprdcer_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtprdcer_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtprdcer_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ718PrdNom = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tprdcer__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tprdcer__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tprdcer__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tprdcer__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprdcer__default(),
         new Object[] {
             new Object[] {
            T014R2_A719PrdNum, T014R2_A396EmprCod, T014R2_A9711Ct_codigo
            }
            , new Object[] {
            T014R3_A719PrdNum, T014R3_A396EmprCod, T014R3_A9711Ct_codigo
            }
            , new Object[] {
            T014R4_A9712Ct_Desc, T014R4_n9712Ct_Desc
            }
            , new Object[] {
            T014R5_A719PrdNum, T014R5_A718PrdNom, T014R5_A396EmprCod
            }
            , new Object[] {
            T014R6_A719PrdNum, T014R6_A718PrdNom, T014R6_A396EmprCod
            }
            , new Object[] {
            T014R7_A407EmprNom, T014R7_n407EmprNom
            }
            , new Object[] {
            T014R8_A719PrdNum, T014R8_A407EmprNom, T014R8_n407EmprNom, T014R8_A718PrdNom, T014R8_A396EmprCod
            }
            , new Object[] {
            T014R9_A407EmprNom, T014R9_n407EmprNom
            }
            , new Object[] {
            T014R10_A396EmprCod, T014R10_A719PrdNum
            }
            , new Object[] {
            T014R11_A396EmprCod, T014R11_A719PrdNum
            }
            , new Object[] {
            T014R12_A396EmprCod, T014R12_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T014R16_A407EmprNom, T014R16_n407EmprNom
            }
            , new Object[] {
            T014R17_A396EmprCod, T014R17_A719PrdNum, T014R17_A13217NormaID
            }
            , new Object[] {
            T014R18_A396EmprCod, T014R18_A719PrdNum, T014R18_A13586TheList
            }
            , new Object[] {
            T014R19_A396EmprCod, T014R19_A5532Lb_numero, T014R19_A5555Lb_opcion, T014R19_A13460Lb_linCP, T014R19_A13458Lb_TipCP
            }
            , new Object[] {
            T014R20_A396EmprCod, T014R20_A13418AlbProID, T014R20_A13442AlbProLine
            }
            , new Object[] {
            T014R21_A396EmprCod, T014R21_A13324LDESID, T014R21_A13333LDESNPeque, T014R21_A13337LDESComb, T014R21_A13339LDESFondo, T014R21_A13342LDESLinea
            }
            , new Object[] {
            T014R22_A396EmprCod, T014R22_A13312Lb_NLab, T014R22_A13305Lb_IDVeces, T014R22_A13306Lb_LinID
            }
            , new Object[] {
            T014R23_A396EmprCod, T014R23_A12673LavMqId, T014R23_A12692LavMqLnPq, T014R23_A12681LavMqLn
            }
            , new Object[] {
            T014R24_A396EmprCod, T014R24_A719PrdNum, T014R24_A9713Tb1_Cod
            }
            , new Object[] {
            T014R25_A396EmprCod, T014R25_A12236PrdNumD, T014R25_A719PrdNum
            }
            , new Object[] {
            T014R26_A396EmprCod, T014R26_A12225DocDisID, T014R26_A12226LinDisID
            }
            , new Object[] {
            T014R27_A396EmprCod, T014R27_A12225DocDisID
            }
            , new Object[] {
            T014R28_A396EmprCod, T014R28_A12205OrdenCID, T014R28_A12206OrdenCLnId
            }
            , new Object[] {
            T014R29_A396EmprCod, T014R29_A719PrdNum, T014R29_A11664LoteID, T014R29_A11665LoteFec
            }
            , new Object[] {
            T014R30_A396EmprCod, T014R30_A4850DevComCod, T014R30_A719PrdNum
            }
            , new Object[] {
            T014R31_A396EmprCod, T014R31_A252CliCod, T014R31_A494ForSer, T014R31_A482ForColNom, T014R31_A483ForColNum, T014R31_A831TipColCod, T014R31_A3571EnsCod, T014R31_A3582EnsLin
            }
            , new Object[] {
            T014R32_A396EmprCod, T014R32_A129BarCod, T014R32_A132BarCodReo, T014R32_A130BarCodPar, T014R32_A4075recestncol, T014R32_A4076recestnpro, T014R32_A4108recestlin
            }
            , new Object[] {
            T014R33_A396EmprCod, T014R33_A4052EstNumFor, T014R33_A4053EstNumCol, T014R33_A4090EstEspLin
            }
            , new Object[] {
            T014R34_A396EmprCod, T014R34_A4052EstNumFor, T014R34_A4053EstNumCol, T014R34_A4084EstProLin
            }
            , new Object[] {
            T014R35_A396EmprCod, T014R35_A11644TransferId, T014R35_A11653TransferLn
            }
            , new Object[] {
            T014R36_A396EmprCod, T014R36_A11634TaesId, T014R36_A11637TaesLn, T014R36_A11641TaesLnP
            }
            , new Object[] {
            T014R37_A396EmprCod, T014R37_A719PrdNum, T014R37_A11329H_stklin
            }
            , new Object[] {
            T014R38_A396EmprCod, T014R38_A11270Pot_num, T014R38_A11271Pot_lin
            }
            , new Object[] {
            T014R39_A396EmprCod, T014R39_A719PrdNum, T014R39_A11199PrdNcasC
            }
            , new Object[] {
            T014R40_A396EmprCod, T014R40_A719PrdNum, T014R40_A11197CFraseR
            }
            , new Object[] {
            T014R41_A396EmprCod, T014R41_A10243Jt_codigo, T014R41_A10246Jt_ord
            }
            , new Object[] {
            T014R42_A396EmprCod, T014R42_A10236Bny_dia, T014R42_A10238Bny_lin
            }
            , new Object[] {
            T014R43_A396EmprCod, T014R43_A129BarCod, T014R43_A132BarCodReo, T014R43_A130BarCodPar, T014R43_A758ProCod, T014R43_A194BarOrdLin, T014R43_A719PrdNum
            }
            , new Object[] {
            T014R44_A396EmprCod, T014R44_A719PrdNum, T014R44_A9735Cod_Rgo
            }
            , new Object[] {
            T014R45_A396EmprCod, T014R45_A9652OeNum, T014R45_A9653OeHdr, T014R45_A9654OeHdrr, T014R45_A9655OeHdrp, T014R45_A9656OeLinC, T014R45_A9657OeComb, T014R45_A9658Oefondo, T014R45_A9659OeMolCil, T014R45_A9686OePasLin,
            T014R45_A9694OePasPLi
            }
            , new Object[] {
            T014R46_A396EmprCod, T014R46_A9652OeNum, T014R46_A9653OeHdr, T014R46_A9654OeHdrr, T014R46_A9655OeHdrp, T014R46_A9656OeLinC, T014R46_A9657OeComb, T014R46_A9658Oefondo, T014R46_A9659OeMolCil, T014R46_A9677OeMolLin
            }
            , new Object[] {
            T014R47_A396EmprCod, T014R47_A9578Pas_Num, T014R47_A719PrdNum
            }
            , new Object[] {
            T014R48_A396EmprCod, T014R48_A719PrdNum, T014R48_A8908CC_AlmCod
            }
            , new Object[] {
            T014R49_A396EmprCod, T014R49_A719PrdNum, T014R49_A8661Almc_Ln
            }
            , new Object[] {
            T014R50_A396EmprCod, T014R50_A719PrdNum, T014R50_A8648Mat_PrdN
            }
            , new Object[] {
            T014R51_A396EmprCod, T014R51_A8585Pet_cod, T014R51_A719PrdNum
            }
            , new Object[] {
            T014R52_A396EmprCod, T014R52_A719PrdNum, T014R52_A8577RecFecHr
            }
            , new Object[] {
            T014R53_A396EmprCod, T014R53_A719PrdNum, T014R53_A8366PrdAnyo, T014R53_A8360PrdProv
            }
            , new Object[] {
            T014R54_A396EmprCod, T014R54_A252CliCod, T014R54_A494ForSer, T014R54_A482ForColNom, T014R54_A483ForColNum, T014R54_A831TipColCod, T014R54_A7797Sim_lin
            }
            , new Object[] {
            T014R55_A396EmprCod, T014R55_A7163Vir_Codigo, T014R55_A719PrdNum
            }
            , new Object[] {
            T014R56_A396EmprCod, T014R56_A6310Lb_TaAuxC, T014R56_A6313lb_TaAuxL, T014R56_A6378Lb_TauxLP
            }
            , new Object[] {
            T014R57_A396EmprCod, T014R57_A6290PreCoNum, T014R57_A719PrdNum
            }
            , new Object[] {
            T014R58_A396EmprCod, T014R58_A719PrdNum, T014R58_A6158PrdPrv
            }
            , new Object[] {
            T014R59_A396EmprCod, T014R59_A719PrdNum, T014R59_A5973PrdSusNum
            }
            , new Object[] {
            T014R60_A396EmprCod, T014R60_A5612Lb_CodGru, T014R60_A5615Lb_LinGru
            }
            , new Object[] {
            T014R61_A396EmprCod, T014R61_A5532Lb_numero, T014R61_A5555Lb_opcion, T014R61_A5560Lb_LineaPr
            }
            , new Object[] {
            T014R62_A396EmprCod, T014R62_A5532Lb_numero, T014R62_A5555Lb_opcion, T014R62_A5557Lb_LineaC
            }
            , new Object[] {
            T014R63_A396EmprCod, T014R63_A5145SobCod, T014R63_A719PrdNum
            }
            , new Object[] {
            T014R64_A396EmprCod, T014R64_A4744RecPreCod, T014R64_A4762RecPreLin, T014R64_A4763RecPreNli
            }
            , new Object[] {
            T014R65_A396EmprCod, T014R65_A4492HreBarCod, T014R65_A4493HreBarReo, T014R65_A4494HreBarPar, T014R65_A4495HreNumCie, T014R65_A4545HreLinMaq, T014R65_A4550HreLinPro, T014R65_A4557HreRecLin
            }
            , new Object[] {
            T014R66_A396EmprCod, T014R66_A4492HreBarCod, T014R66_A4493HreBarReo, T014R66_A4494HreBarPar, T014R66_A4495HreNumCie, T014R66_A4508HreLinMAL, T014R66_A4509HreNumAny, T014R66_A719PrdNum
            }
            , new Object[] {
            T014R67_A396EmprCod, T014R67_A252CliCod, T014R67_A4415EstCol, T014R67_A4416EstColLin
            }
            , new Object[] {
            T014R68_A396EmprCod, T014R68_A129BarCod, T014R68_A132BarCodReo, T014R68_A130BarCodPar, T014R68_A2524DisComLin, T014R68_A1056DisComCod, T014R68_A1032FonCod, T014R68_A2124RecMolCod, T014R68_A2672RecPasLin, T014R68_A2675RecPasPLi
            }
            , new Object[] {
            T014R69_A396EmprCod, T014R69_A129BarCod, T014R69_A132BarCodReo, T014R69_A130BarCodPar, T014R69_A2524DisComLin, T014R69_A1056DisComCod, T014R69_A1032FonCod, T014R69_A2124RecMolCod, T014R69_A2126RecMolLin
            }
            , new Object[] {
            T014R70_A396EmprCod, T014R70_A2107PasCod, T014R70_A719PrdNum
            }
            , new Object[] {
            T014R71_A396EmprCod, T014R71_A2637HisEstHRu, T014R71_A2636HisEstHRe, T014R71_A2635HisEstHPa, T014R71_A2638HisEstLCo, T014R71_A2630HisEstCom, T014R71_A2634HisEstFon, T014R71_A719PrdNum
            }
            , new Object[] {
            T014R72_A396EmprCod, T014R72_A252CliCod, T014R72_A2141SerEst, T014R72_A1013DibCli, T014R72_A1014DibInt, T014R72_A2074ColCom, T014R72_A2078ColFon, T014R72_A2098MolCod, T014R72_A2535ForPrdLin
            }
            , new Object[] {
            T014R73_A396EmprCod, T014R73_A719PrdNum, T014R73_A3342CCStkLin
            }
            , new Object[] {
            T014R74_A396EmprCod, T014R74_A252CliCod, T014R74_A2891HMaForSer, T014R74_A2892HMaForCNom, T014R74_A2893HMaForCNum, T014R74_A2894HMaTipCCod, T014R74_A2895HMaForNumC, T014R74_A2897HMaColLin, T014R74_A2896HMaFec, T014R74_A2907HmaLin
            }
            , new Object[] {
            T014R75_A396EmprCod, T014R75_A129BarCod, T014R75_A132BarCodReo, T014R75_A130BarCodPar, T014R75_A2808RecLinMAL, T014R75_A1377RecNumAny, T014R75_A719PrdNum
            }
            , new Object[] {
            T014R76_A396EmprCod, T014R76_A129BarCod, T014R76_A132BarCodReo, T014R76_A130BarCodPar, T014R76_A2804RecLinMaq, T014R76_A1273RecLinPro, T014R76_A811RecLin
            }
            , new Object[] {
            T014R77_A396EmprCod, T014R77_A129BarCod, T014R77_A132BarCodReo, T014R77_A130BarCodPar, T014R77_A2494BarDosPro, T014R77_A719PrdNum
            }
            , new Object[] {
            T014R78_A396EmprCod, T014R78_A1314EnsLabCod, T014R78_A1317EnsLabLin
            }
            , new Object[] {
            T014R79_A396EmprCod, T014R79_A910Workstat, T014R79_A887EscMLin
            }
            , new Object[] {
            T014R80_A396EmprCod, T014R80_A859CumCodCont, T014R80_A719PrdNum
            }
            , new Object[] {
            T014R81_A396EmprCod, T014R81_A719PrdNum, T014R81_A810RecFec
            }
            , new Object[] {
            T014R82_A396EmprCod, T014R82_A486ForNumCol, T014R82_A715PrdLin
            }
            , new Object[] {
            T014R83_A396EmprCod, T014R83_A719PrdNum, T014R83_A681PrdAny
            }
            , new Object[] {
            T014R84_A396EmprCod, T014R84_A719PrdNum, T014R84_A688PrdComCod
            }
            , new Object[] {
            T014R85_A396EmprCod, T014R85_A719PrdNum, T014R85_A680PrdAltNum
            }
            , new Object[] {
            T014R86_A396EmprCod, T014R86_A658PedCod, T014R86_A719PrdNum
            }
            , new Object[] {
            T014R87_A396EmprCod, T014R87_A486ForNumCol, T014R87_A309ColLin
            }
            , new Object[] {
            T014R88_A396EmprCod, T014R88_A719PrdNum, T014R88_A647NumCon
            }
            , new Object[] {
            T014R89_A396EmprCod, T014R89_A719PrdNum
            }
            , new Object[] {
            T014R90_A719PrdNum, T014R90_A9712Ct_Desc, T014R90_n9712Ct_Desc, T014R90_A396EmprCod, T014R90_A9711Ct_codigo
            }
            , new Object[] {
            T014R91_A9712Ct_Desc, T014R91_n9712Ct_Desc
            }
            , new Object[] {
            T014R92_A396EmprCod, T014R92_A719PrdNum, T014R92_A9711Ct_codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T014R95_A9712Ct_Desc, T014R95_n9712Ct_Desc
            }
            , new Object[] {
            T014R96_A396EmprCod, T014R96_A719PrdNum, T014R96_A9711Ct_codigo
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridtprdcer_level1item_Backcolorstyle ;
   private byte subGridtprdcer_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtprdcer_level1item_Allowselection ;
   private byte subGridtprdcer_level1item_Allowhovering ;
   private byte subGridtprdcer_level1item_Allowcollapsing ;
   private byte subGridtprdcer_level1item_Collapsed ;
   private short Z9711Ct_codigo ;
   private short nRcdDeleted_1268 ;
   private short nRcdExists_1268 ;
   private short nIsMod_1268 ;
   private short A9711Ct_codigo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1268 ;
   private short RcdFound1268 ;
   private short nBlankRcdUsr1268 ;
   private short RcdFound29 ;
   private short nIsDirty_29 ;
   private short nIsDirty_1268 ;
   private int nRC_GXsfl_58 ;
   private int nGXsfl_58_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtCt_codigo_Enabled ;
   private int edtCt_Desc_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtprdcer_level1item_Backcolor ;
   private int subGridtprdcer_level1item_Allbackcolor ;
   private int defedtCt_codigo_Enabled ;
   private int idxLst ;
   private int subGridtprdcer_level1item_Selectedindex ;
   private int subGridtprdcer_level1item_Selectioncolor ;
   private int subGridtprdcer_level1item_Hoveringcolor ;
   private long GRIDTPRDCER_LEVEL1ITEM_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z718PrdNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_58_idx="0001" ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode1268 ;
   private String edtCt_codigo_Internalname ;
   private String edtCt_Desc_Internalname ;
   private String sStyleString ;
   private String subGridtprdcer_level1item_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A9712Ct_Desc ;
   private String Z407EmprNom ;
   private String sMode29 ;
   private String Z9712Ct_Desc ;
   private String sGXsfl_58_fel_idx="0001" ;
   private String subGridtprdcer_level1item_Class ;
   private String subGridtprdcer_level1item_Linesclass ;
   private String ROClassString ;
   private String edtCt_codigo_Jsonclick ;
   private String edtCt_Desc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtprdcer_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ718PrdNom ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_58_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n719PrdNum ;
   private boolean n9712Ct_Desc ;
   private com.genexus.webpanels.GXWebGrid Gridtprdcer_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtprdcer_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtprdcer_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private String[] T014R8_A719PrdNum ;
   private boolean[] T014R8_n719PrdNum ;
   private String[] T014R8_A407EmprNom ;
   private boolean[] T014R8_n407EmprNom ;
   private String[] T014R8_A718PrdNom ;
   private String[] T014R8_A396EmprCod ;
   private String[] T014R7_A407EmprNom ;
   private boolean[] T014R7_n407EmprNom ;
   private String[] T014R9_A407EmprNom ;
   private boolean[] T014R9_n407EmprNom ;
   private String[] T014R10_A396EmprCod ;
   private String[] T014R10_A719PrdNum ;
   private boolean[] T014R10_n719PrdNum ;
   private String[] T014R6_A719PrdNum ;
   private boolean[] T014R6_n719PrdNum ;
   private String[] T014R6_A718PrdNom ;
   private String[] T014R6_A396EmprCod ;
   private String[] T014R11_A396EmprCod ;
   private String[] T014R11_A719PrdNum ;
   private boolean[] T014R11_n719PrdNum ;
   private String[] T014R12_A396EmprCod ;
   private String[] T014R12_A719PrdNum ;
   private boolean[] T014R12_n719PrdNum ;
   private String[] T014R5_A719PrdNum ;
   private boolean[] T014R5_n719PrdNum ;
   private String[] T014R5_A718PrdNom ;
   private String[] T014R5_A396EmprCod ;
   private String[] T014R16_A407EmprNom ;
   private boolean[] T014R16_n407EmprNom ;
   private String[] T014R17_A396EmprCod ;
   private String[] T014R17_A719PrdNum ;
   private boolean[] T014R17_n719PrdNum ;
   private String[] T014R17_A13217NormaID ;
   private String[] T014R18_A396EmprCod ;
   private String[] T014R18_A719PrdNum ;
   private boolean[] T014R18_n719PrdNum ;
   private String[] T014R18_A13586TheList ;
   private String[] T014R19_A396EmprCod ;
   private int[] T014R19_A5532Lb_numero ;
   private String[] T014R19_A5555Lb_opcion ;
   private short[] T014R19_A13460Lb_linCP ;
   private String[] T014R19_A13458Lb_TipCP ;
   private String[] T014R20_A396EmprCod ;
   private int[] T014R20_A13418AlbProID ;
   private short[] T014R20_A13442AlbProLine ;
   private String[] T014R21_A396EmprCod ;
   private int[] T014R21_A13324LDESID ;
   private String[] T014R21_A13333LDESNPeque ;
   private String[] T014R21_A13337LDESComb ;
   private String[] T014R21_A13339LDESFondo ;
   private short[] T014R21_A13342LDESLinea ;
   private String[] T014R22_A396EmprCod ;
   private int[] T014R22_A13312Lb_NLab ;
   private short[] T014R22_A13305Lb_IDVeces ;
   private short[] T014R22_A13306Lb_LinID ;
   private String[] T014R23_A396EmprCod ;
   private int[] T014R23_A12673LavMqId ;
   private short[] T014R23_A12692LavMqLnPq ;
   private short[] T014R23_A12681LavMqLn ;
   private String[] T014R24_A396EmprCod ;
   private String[] T014R24_A719PrdNum ;
   private boolean[] T014R24_n719PrdNum ;
   private short[] T014R24_A9713Tb1_Cod ;
   private String[] T014R25_A396EmprCod ;
   private String[] T014R25_A12236PrdNumD ;
   private String[] T014R25_A719PrdNum ;
   private boolean[] T014R25_n719PrdNum ;
   private String[] T014R26_A396EmprCod ;
   private long[] T014R26_A12225DocDisID ;
   private short[] T014R26_A12226LinDisID ;
   private String[] T014R27_A396EmprCod ;
   private long[] T014R27_A12225DocDisID ;
   private String[] T014R28_A396EmprCod ;
   private long[] T014R28_A12205OrdenCID ;
   private short[] T014R28_A12206OrdenCLnId ;
   private String[] T014R29_A396EmprCod ;
   private String[] T014R29_A719PrdNum ;
   private boolean[] T014R29_n719PrdNum ;
   private String[] T014R29_A11664LoteID ;
   private java.util.Date[] T014R29_A11665LoteFec ;
   private String[] T014R30_A396EmprCod ;
   private int[] T014R30_A4850DevComCod ;
   private String[] T014R30_A719PrdNum ;
   private boolean[] T014R30_n719PrdNum ;
   private String[] T014R31_A396EmprCod ;
   private int[] T014R31_A252CliCod ;
   private String[] T014R31_A494ForSer ;
   private String[] T014R31_A482ForColNom ;
   private int[] T014R31_A483ForColNum ;
   private byte[] T014R31_A831TipColCod ;
   private String[] T014R31_A3571EnsCod ;
   private short[] T014R31_A3582EnsLin ;
   private String[] T014R32_A396EmprCod ;
   private int[] T014R32_A129BarCod ;
   private byte[] T014R32_A132BarCodReo ;
   private String[] T014R32_A130BarCodPar ;
   private byte[] T014R32_A4075recestncol ;
   private byte[] T014R32_A4076recestnpro ;
   private short[] T014R32_A4108recestlin ;
   private String[] T014R33_A396EmprCod ;
   private int[] T014R33_A4052EstNumFor ;
   private byte[] T014R33_A4053EstNumCol ;
   private byte[] T014R33_A4090EstEspLin ;
   private String[] T014R34_A396EmprCod ;
   private int[] T014R34_A4052EstNumFor ;
   private byte[] T014R34_A4053EstNumCol ;
   private byte[] T014R34_A4084EstProLin ;
   private String[] T014R35_A396EmprCod ;
   private long[] T014R35_A11644TransferId ;
   private int[] T014R35_A11653TransferLn ;
   private String[] T014R36_A396EmprCod ;
   private String[] T014R36_A11634TaesId ;
   private short[] T014R36_A11637TaesLn ;
   private short[] T014R36_A11641TaesLnP ;
   private String[] T014R37_A396EmprCod ;
   private String[] T014R37_A719PrdNum ;
   private boolean[] T014R37_n719PrdNum ;
   private long[] T014R37_A11329H_stklin ;
   private String[] T014R38_A396EmprCod ;
   private int[] T014R38_A11270Pot_num ;
   private short[] T014R38_A11271Pot_lin ;
   private String[] T014R39_A396EmprCod ;
   private String[] T014R39_A719PrdNum ;
   private boolean[] T014R39_n719PrdNum ;
   private String[] T014R39_A11199PrdNcasC ;
   private String[] T014R40_A396EmprCod ;
   private String[] T014R40_A719PrdNum ;
   private boolean[] T014R40_n719PrdNum ;
   private String[] T014R40_A11197CFraseR ;
   private String[] T014R41_A396EmprCod ;
   private short[] T014R41_A10243Jt_codigo ;
   private short[] T014R41_A10246Jt_ord ;
   private String[] T014R42_A396EmprCod ;
   private java.util.Date[] T014R42_A10236Bny_dia ;
   private short[] T014R42_A10238Bny_lin ;
   private String[] T014R43_A396EmprCod ;
   private int[] T014R43_A129BarCod ;
   private byte[] T014R43_A132BarCodReo ;
   private String[] T014R43_A130BarCodPar ;
   private String[] T014R43_A758ProCod ;
   private short[] T014R43_A194BarOrdLin ;
   private String[] T014R43_A719PrdNum ;
   private boolean[] T014R43_n719PrdNum ;
   private String[] T014R44_A396EmprCod ;
   private String[] T014R44_A719PrdNum ;
   private boolean[] T014R44_n719PrdNum ;
   private String[] T014R44_A9735Cod_Rgo ;
   private String[] T014R45_A396EmprCod ;
   private long[] T014R45_A9652OeNum ;
   private int[] T014R45_A9653OeHdr ;
   private byte[] T014R45_A9654OeHdrr ;
   private String[] T014R45_A9655OeHdrp ;
   private byte[] T014R45_A9656OeLinC ;
   private String[] T014R45_A9657OeComb ;
   private String[] T014R45_A9658Oefondo ;
   private byte[] T014R45_A9659OeMolCil ;
   private short[] T014R45_A9686OePasLin ;
   private short[] T014R45_A9694OePasPLi ;
   private String[] T014R46_A396EmprCod ;
   private long[] T014R46_A9652OeNum ;
   private int[] T014R46_A9653OeHdr ;
   private byte[] T014R46_A9654OeHdrr ;
   private String[] T014R46_A9655OeHdrp ;
   private byte[] T014R46_A9656OeLinC ;
   private String[] T014R46_A9657OeComb ;
   private String[] T014R46_A9658Oefondo ;
   private byte[] T014R46_A9659OeMolCil ;
   private byte[] T014R46_A9677OeMolLin ;
   private String[] T014R47_A396EmprCod ;
   private int[] T014R47_A9578Pas_Num ;
   private String[] T014R47_A719PrdNum ;
   private boolean[] T014R47_n719PrdNum ;
   private String[] T014R48_A396EmprCod ;
   private String[] T014R48_A719PrdNum ;
   private boolean[] T014R48_n719PrdNum ;
   private byte[] T014R48_A8908CC_AlmCod ;
   private String[] T014R49_A396EmprCod ;
   private String[] T014R49_A719PrdNum ;
   private boolean[] T014R49_n719PrdNum ;
   private int[] T014R49_A8661Almc_Ln ;
   private String[] T014R50_A396EmprCod ;
   private String[] T014R50_A719PrdNum ;
   private boolean[] T014R50_n719PrdNum ;
   private String[] T014R50_A8648Mat_PrdN ;
   private String[] T014R51_A396EmprCod ;
   private long[] T014R51_A8585Pet_cod ;
   private String[] T014R51_A719PrdNum ;
   private boolean[] T014R51_n719PrdNum ;
   private String[] T014R52_A396EmprCod ;
   private String[] T014R52_A719PrdNum ;
   private boolean[] T014R52_n719PrdNum ;
   private java.util.Date[] T014R52_A8577RecFecHr ;
   private String[] T014R53_A396EmprCod ;
   private String[] T014R53_A719PrdNum ;
   private boolean[] T014R53_n719PrdNum ;
   private short[] T014R53_A8366PrdAnyo ;
   private int[] T014R53_A8360PrdProv ;
   private String[] T014R54_A396EmprCod ;
   private int[] T014R54_A252CliCod ;
   private String[] T014R54_A494ForSer ;
   private String[] T014R54_A482ForColNom ;
   private int[] T014R54_A483ForColNum ;
   private byte[] T014R54_A831TipColCod ;
   private short[] T014R54_A7797Sim_lin ;
   private String[] T014R55_A396EmprCod ;
   private int[] T014R55_A7163Vir_Codigo ;
   private String[] T014R55_A719PrdNum ;
   private boolean[] T014R55_n719PrdNum ;
   private String[] T014R56_A396EmprCod ;
   private String[] T014R56_A6310Lb_TaAuxC ;
   private short[] T014R56_A6313lb_TaAuxL ;
   private short[] T014R56_A6378Lb_TauxLP ;
   private String[] T014R57_A396EmprCod ;
   private int[] T014R57_A6290PreCoNum ;
   private String[] T014R57_A719PrdNum ;
   private boolean[] T014R57_n719PrdNum ;
   private String[] T014R58_A396EmprCod ;
   private String[] T014R58_A719PrdNum ;
   private boolean[] T014R58_n719PrdNum ;
   private int[] T014R58_A6158PrdPrv ;
   private String[] T014R59_A396EmprCod ;
   private String[] T014R59_A719PrdNum ;
   private boolean[] T014R59_n719PrdNum ;
   private String[] T014R59_A5973PrdSusNum ;
   private String[] T014R60_A396EmprCod ;
   private String[] T014R60_A5612Lb_CodGru ;
   private short[] T014R60_A5615Lb_LinGru ;
   private String[] T014R61_A396EmprCod ;
   private int[] T014R61_A5532Lb_numero ;
   private String[] T014R61_A5555Lb_opcion ;
   private short[] T014R61_A5560Lb_LineaPr ;
   private String[] T014R62_A396EmprCod ;
   private int[] T014R62_A5532Lb_numero ;
   private String[] T014R62_A5555Lb_opcion ;
   private short[] T014R62_A5557Lb_LineaC ;
   private String[] T014R63_A396EmprCod ;
   private int[] T014R63_A5145SobCod ;
   private String[] T014R63_A719PrdNum ;
   private boolean[] T014R63_n719PrdNum ;
   private String[] T014R64_A396EmprCod ;
   private int[] T014R64_A4744RecPreCod ;
   private short[] T014R64_A4762RecPreLin ;
   private short[] T014R64_A4763RecPreNli ;
   private String[] T014R65_A396EmprCod ;
   private int[] T014R65_A4492HreBarCod ;
   private byte[] T014R65_A4493HreBarReo ;
   private String[] T014R65_A4494HreBarPar ;
   private byte[] T014R65_A4495HreNumCie ;
   private short[] T014R65_A4545HreLinMaq ;
   private byte[] T014R65_A4550HreLinPro ;
   private short[] T014R65_A4557HreRecLin ;
   private String[] T014R66_A396EmprCod ;
   private int[] T014R66_A4492HreBarCod ;
   private byte[] T014R66_A4493HreBarReo ;
   private String[] T014R66_A4494HreBarPar ;
   private byte[] T014R66_A4495HreNumCie ;
   private short[] T014R66_A4508HreLinMAL ;
   private byte[] T014R66_A4509HreNumAny ;
   private String[] T014R66_A719PrdNum ;
   private boolean[] T014R66_n719PrdNum ;
   private String[] T014R67_A396EmprCod ;
   private int[] T014R67_A252CliCod ;
   private String[] T014R67_A4415EstCol ;
   private short[] T014R67_A4416EstColLin ;
   private String[] T014R68_A396EmprCod ;
   private int[] T014R68_A129BarCod ;
   private byte[] T014R68_A132BarCodReo ;
   private String[] T014R68_A130BarCodPar ;
   private byte[] T014R68_A2524DisComLin ;
   private String[] T014R68_A1056DisComCod ;
   private String[] T014R68_A1032FonCod ;
   private byte[] T014R68_A2124RecMolCod ;
   private short[] T014R68_A2672RecPasLin ;
   private short[] T014R68_A2675RecPasPLi ;
   private String[] T014R69_A396EmprCod ;
   private int[] T014R69_A129BarCod ;
   private byte[] T014R69_A132BarCodReo ;
   private String[] T014R69_A130BarCodPar ;
   private byte[] T014R69_A2524DisComLin ;
   private String[] T014R69_A1056DisComCod ;
   private String[] T014R69_A1032FonCod ;
   private byte[] T014R69_A2124RecMolCod ;
   private byte[] T014R69_A2126RecMolLin ;
   private String[] T014R70_A396EmprCod ;
   private String[] T014R70_A2107PasCod ;
   private String[] T014R70_A719PrdNum ;
   private boolean[] T014R70_n719PrdNum ;
   private String[] T014R71_A396EmprCod ;
   private int[] T014R71_A2637HisEstHRu ;
   private byte[] T014R71_A2636HisEstHRe ;
   private String[] T014R71_A2635HisEstHPa ;
   private byte[] T014R71_A2638HisEstLCo ;
   private String[] T014R71_A2630HisEstCom ;
   private String[] T014R71_A2634HisEstFon ;
   private String[] T014R71_A719PrdNum ;
   private boolean[] T014R71_n719PrdNum ;
   private String[] T014R72_A396EmprCod ;
   private int[] T014R72_A252CliCod ;
   private String[] T014R72_A2141SerEst ;
   private String[] T014R72_A1013DibCli ;
   private int[] T014R72_A1014DibInt ;
   private String[] T014R72_A2074ColCom ;
   private String[] T014R72_A2078ColFon ;
   private byte[] T014R72_A2098MolCod ;
   private short[] T014R72_A2535ForPrdLin ;
   private String[] T014R73_A396EmprCod ;
   private String[] T014R73_A719PrdNum ;
   private boolean[] T014R73_n719PrdNum ;
   private long[] T014R73_A3342CCStkLin ;
   private String[] T014R74_A396EmprCod ;
   private int[] T014R74_A252CliCod ;
   private String[] T014R74_A2891HMaForSer ;
   private String[] T014R74_A2892HMaForCNom ;
   private int[] T014R74_A2893HMaForCNum ;
   private byte[] T014R74_A2894HMaTipCCod ;
   private int[] T014R74_A2895HMaForNumC ;
   private short[] T014R74_A2897HMaColLin ;
   private java.util.Date[] T014R74_A2896HMaFec ;
   private short[] T014R74_A2907HmaLin ;
   private String[] T014R75_A396EmprCod ;
   private int[] T014R75_A129BarCod ;
   private byte[] T014R75_A132BarCodReo ;
   private String[] T014R75_A130BarCodPar ;
   private short[] T014R75_A2808RecLinMAL ;
   private byte[] T014R75_A1377RecNumAny ;
   private String[] T014R75_A719PrdNum ;
   private boolean[] T014R75_n719PrdNum ;
   private String[] T014R76_A396EmprCod ;
   private int[] T014R76_A129BarCod ;
   private byte[] T014R76_A132BarCodReo ;
   private String[] T014R76_A130BarCodPar ;
   private short[] T014R76_A2804RecLinMaq ;
   private byte[] T014R76_A1273RecLinPro ;
   private short[] T014R76_A811RecLin ;
   private String[] T014R77_A396EmprCod ;
   private int[] T014R77_A129BarCod ;
   private byte[] T014R77_A132BarCodReo ;
   private String[] T014R77_A130BarCodPar ;
   private String[] T014R77_A2494BarDosPro ;
   private String[] T014R77_A719PrdNum ;
   private boolean[] T014R77_n719PrdNum ;
   private String[] T014R78_A396EmprCod ;
   private int[] T014R78_A1314EnsLabCod ;
   private short[] T014R78_A1317EnsLabLin ;
   private String[] T014R79_A396EmprCod ;
   private String[] T014R79_A910Workstat ;
   private int[] T014R79_A887EscMLin ;
   private String[] T014R80_A396EmprCod ;
   private int[] T014R80_A859CumCodCont ;
   private String[] T014R80_A719PrdNum ;
   private boolean[] T014R80_n719PrdNum ;
   private String[] T014R81_A396EmprCod ;
   private String[] T014R81_A719PrdNum ;
   private boolean[] T014R81_n719PrdNum ;
   private java.util.Date[] T014R81_A810RecFec ;
   private String[] T014R82_A396EmprCod ;
   private int[] T014R82_A486ForNumCol ;
   private short[] T014R82_A715PrdLin ;
   private String[] T014R83_A396EmprCod ;
   private String[] T014R83_A719PrdNum ;
   private boolean[] T014R83_n719PrdNum ;
   private short[] T014R83_A681PrdAny ;
   private String[] T014R84_A396EmprCod ;
   private String[] T014R84_A719PrdNum ;
   private boolean[] T014R84_n719PrdNum ;
   private String[] T014R84_A688PrdComCod ;
   private String[] T014R85_A396EmprCod ;
   private String[] T014R85_A719PrdNum ;
   private boolean[] T014R85_n719PrdNum ;
   private String[] T014R85_A680PrdAltNum ;
   private String[] T014R86_A396EmprCod ;
   private int[] T014R86_A658PedCod ;
   private String[] T014R86_A719PrdNum ;
   private boolean[] T014R86_n719PrdNum ;
   private String[] T014R87_A396EmprCod ;
   private int[] T014R87_A486ForNumCol ;
   private short[] T014R87_A309ColLin ;
   private String[] T014R88_A396EmprCod ;
   private String[] T014R88_A719PrdNum ;
   private boolean[] T014R88_n719PrdNum ;
   private int[] T014R88_A647NumCon ;
   private String[] T014R89_A396EmprCod ;
   private String[] T014R89_A719PrdNum ;
   private boolean[] T014R89_n719PrdNum ;
   private String[] T014R90_A719PrdNum ;
   private boolean[] T014R90_n719PrdNum ;
   private String[] T014R90_A9712Ct_Desc ;
   private boolean[] T014R90_n9712Ct_Desc ;
   private String[] T014R90_A396EmprCod ;
   private short[] T014R90_A9711Ct_codigo ;
   private String[] T014R4_A9712Ct_Desc ;
   private boolean[] T014R4_n9712Ct_Desc ;
   private String[] T014R91_A9712Ct_Desc ;
   private boolean[] T014R91_n9712Ct_Desc ;
   private String[] T014R92_A396EmprCod ;
   private String[] T014R92_A719PrdNum ;
   private boolean[] T014R92_n719PrdNum ;
   private short[] T014R92_A9711Ct_codigo ;
   private String[] T014R3_A719PrdNum ;
   private boolean[] T014R3_n719PrdNum ;
   private String[] T014R3_A396EmprCod ;
   private short[] T014R3_A9711Ct_codigo ;
   private String[] T014R2_A719PrdNum ;
   private boolean[] T014R2_n719PrdNum ;
   private String[] T014R2_A396EmprCod ;
   private short[] T014R2_A9711Ct_codigo ;
   private String[] T014R95_A9712Ct_Desc ;
   private boolean[] T014R95_n9712Ct_Desc ;
   private String[] T014R96_A396EmprCod ;
   private String[] T014R96_A719PrdNum ;
   private boolean[] T014R96_n719PrdNum ;
   private short[] T014R96_A9711Ct_codigo ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tprdcer__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdcer__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdcer__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdcer__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdcer__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T014R2", "SELECT PrdNum, EmprCod, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ? AND Ct_codigo = ?  FOR UPDATE OF PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014R3", "SELECT PrdNum, EmprCod, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ? AND Ct_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014R4", "SELECT Ct_Desc FROM TXPCERTI WHERE EmprCod = ? AND Ct_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014R5", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014R6", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014R7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014R8", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdNum, T2.EmprNom, TM1.PrdNom, TM1.EmprCod FROM (TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014R9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014R10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014R11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ?) ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ?) ORDER BY EmprCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T014R13", "INSERT INTO TXPPRODUC(PrdNum, PrdNom, EmprCod, PrvNum, PrdExiAlm, PrdPreAct, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdExiCC, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T014R14", "UPDATE TXPPRODUC SET PrdNom=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T014R15", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T014R16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014R17", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R18", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R19", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R20", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R21", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R22", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R23", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R24", "SELECT * FROM (SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R25", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R26", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R27", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R28", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R29", "SELECT * FROM (SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R30", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R31", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R32", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R33", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R34", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R35", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R36", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R37", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R38", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R39", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R40", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R41", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R42", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R43", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R44", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R45", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R46", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R47", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R48", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R49", "SELECT * FROM (SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R50", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R51", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R52", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R53", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R54", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R55", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R56", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R57", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R58", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R59", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R60", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R61", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R62", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R63", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R64", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R65", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R66", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R67", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R68", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R69", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R70", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R71", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R72", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R73", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R74", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R75", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R76", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R77", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R78", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R79", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R80", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R81", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R82", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R83", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R84", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R85", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdAltNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R86", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R87", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R88", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014R89", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum FROM TXPPRODUC ORDER BY EmprCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014R90", "SELECT T1.PrdNum, T2.Ct_Desc, T1.EmprCod, T1.Ct_codigo FROM (TXPPRDCER T1 INNER JOIN TXPCERTI T2 ON T2.EmprCod = T1.EmprCod AND T2.Ct_codigo = T1.Ct_codigo) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.Ct_codigo = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.Ct_codigo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014R91", "SELECT Ct_Desc FROM TXPCERTI WHERE EmprCod = ? AND Ct_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014R92", "SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ? AND Ct_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T014R93", "INSERT INTO TXPPRDCER(PrdNum, EmprCod, Ct_codigo) VALUES(?, ?, ?)", GX_NOMASK, "TXPPRDCER")
         ,new UpdateCursor("T014R94", "DELETE FROM TXPPRDCER  WHERE EmprCod = ? AND PrdNum = ? AND Ct_codigo = ?", GX_NOMASK, "TXPPRDCER")
         ,new ForEachCursor("T014R95", "SELECT Ct_Desc FROM TXPCERTI WHERE EmprCod = ? AND Ct_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014R96", "SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, Ct_codigo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 72 :
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
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
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
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 26);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 82 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 88 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 91 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 93 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 94 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
   }

}

