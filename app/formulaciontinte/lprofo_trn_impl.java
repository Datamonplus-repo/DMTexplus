package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lprofo_trn_impl extends GXDataArea
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
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
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
         gxload_3( A396EmprCod, A764ProForCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Proceso Quimico (Lineas)", ""), (short)(0)) ;
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

   public lprofo_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lprofo_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lprofo_trn_impl.class ));
   }

   public lprofo_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Proceso Quimico (Lineas)", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\LPROFO_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_FormulacionTinte\\LPROFO_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCod_Internalname, GXutil.rtrim( A764ProForCod), GXutil.rtrim( localUtil.format( A764ProForCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc), GXutil.rtrim( localUtil.format( A766ProForDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDsc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForDsc2_Internalname, httpContext.getMessage( "Proceso(Large)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc2_Internalname, GXutil.rtrim( A4715ProForDsc2), GXutil.rtrim( localUtil.format( A4715ProForDsc2, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForDsc2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForLin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForPrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForPrd_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForPrd_Internalname, GXutil.rtrim( A770ProForPrd), GXutil.rtrim( localUtil.format( A770ProForPrd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForPrd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForPrd_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForDes_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDes_Internalname, GXutil.rtrim( A765ProForDes), GXutil.rtrim( localUtil.format( A765ProForDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForDes_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdUMe_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtForPrdUMe_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc), GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtForPrdDsc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCan_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCan_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForCan_Enabled!=0) ? localUtil.format( A762ProForCan, "ZZZZZ9.9999") : localUtil.format( A762ProForCan, "ZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCan_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForCan_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCla_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCla_Internalname, httpContext.getMessage( "Clave I", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCla_Internalname, GXutil.rtrim( A763ProForCla), GXutil.rtrim( localUtil.format( A763ProForCla, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCla_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForCla_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForNro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForNro_Internalname, httpContext.getMessage( "Nº", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1645ProForNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1645ProForNro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForNro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForNro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTnq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTnq_Internalname, httpContext.getMessage( "Tq.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3379ProForTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3379ProForTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTnq_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForTnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCPo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCPo_Internalname, httpContext.getMessage( "% Cpd.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCPo_Internalname, GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForCPo_Enabled!=0) ? localUtil.format( A6062ProForCPo, "ZZ9.99") : localUtil.format( A6062ProForCPo, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCPo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForCPo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForClv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForClv_Internalname, httpContext.getMessage( "Clave II", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForClv_Internalname, GXutil.rtrim( A5358ProForClv), GXutil.rtrim( localUtil.format( A5358ProForClv, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForClv_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForClv_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForFT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForFT_Internalname, httpContext.getMessage( "Ficha Tecn.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForFT_Internalname, GXutil.rtrim( A13178ProForFT), GXutil.rtrim( localUtil.format( A13178ProForFT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForFT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForFT_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDe2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForDe2_Internalname, httpContext.getMessage( "Descripcion (Large)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDe2_Internalname, GXutil.rtrim( A13111ProForDe2), GXutil.rtrim( localUtil.format( A13111ProForDe2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDe2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForDe2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\LPROFO_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\LPROFO_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\LPROFO_TRN.htm");
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
         Z764ProForCod = httpContext.cgiGet( "Z764ProForCod") ;
         Z767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z767ProForLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z770ProForPrd = httpContext.cgiGet( "Z770ProForPrd") ;
         Z765ProForDes = httpContext.cgiGet( "Z765ProForDes") ;
         Z762ProForCan = localUtil.ctond( httpContext.cgiGet( "Z762ProForCan")) ;
         Z763ProForCla = httpContext.cgiGet( "Z763ProForCla") ;
         Z1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1645ProForNro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3379ProForTnq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6062ProForCPo = localUtil.ctond( httpContext.cgiGet( "Z6062ProForCPo")) ;
         Z5358ProForClv = httpContext.cgiGet( "Z5358ProForClv") ;
         Z13178ProForFT = httpContext.cgiGet( "Z13178ProForFT") ;
         Z13111ProForDe2 = httpContext.cgiGet( "Z13111ProForDe2") ;
         Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = httpContext.cgiGet( edtProForDsc2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProForLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A767ProForLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
         }
         else
         {
            A767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
         }
         A770ProForPrd = httpContext.cgiGet( edtProForPrd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
         A765ProForDes = httpContext.cgiGet( edtProForDes_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A765ProForDes", A765ProForDes);
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
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORCAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProForCan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A762ProForCan = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A762ProForCan", GXutil.ltrimstr( A762ProForCan, 12, 5));
         }
         else
         {
            A762ProForCan = localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A762ProForCan", GXutil.ltrimstr( A762ProForCan, 12, 5));
         }
         A763ProForCla = httpContext.cgiGet( edtProForCla_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A763ProForCla", A763ProForCla);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORNRO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProForNro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1645ProForNro = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1645ProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1645ProForNro), 2, 0));
         }
         else
         {
            A1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1645ProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1645ProForNro), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORTNQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProForTnq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3379ProForTnq = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3379ProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3379ProForTnq), 2, 0));
         }
         else
         {
            A3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3379ProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3379ProForTnq), 2, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForCPo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForCPo_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORCPO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProForCPo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6062ProForCPo = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6062ProForCPo", GXutil.ltrimstr( A6062ProForCPo, 6, 2));
         }
         else
         {
            A6062ProForCPo = localUtil.ctond( httpContext.cgiGet( edtProForCPo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6062ProForCPo", GXutil.ltrimstr( A6062ProForCPo, 6, 2));
         }
         A5358ProForClv = httpContext.cgiGet( edtProForClv_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5358ProForClv", A5358ProForClv);
         A13178ProForFT = httpContext.cgiGet( edtProForFT_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", A13178ProForFT);
         A13111ProForDe2 = httpContext.cgiGet( edtProForDe2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13111ProForDe2", A13111ProForDe2);
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
            A764ProForCod = httpContext.GetPar( "ProForCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
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
            initAll1VX90( ) ;
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
      disableAttributes1VX90( ) ;
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

   public void resetCaption1VX0( )
   {
   }

   public void zm1VX90( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z770ProForPrd = T01VX3_A770ProForPrd[0] ;
            Z765ProForDes = T01VX3_A765ProForDes[0] ;
            Z762ProForCan = T01VX3_A762ProForCan[0] ;
            Z763ProForCla = T01VX3_A763ProForCla[0] ;
            Z1645ProForNro = T01VX3_A1645ProForNro[0] ;
            Z3379ProForTnq = T01VX3_A3379ProForTnq[0] ;
            Z6062ProForCPo = T01VX3_A6062ProForCPo[0] ;
            Z5358ProForClv = T01VX3_A5358ProForClv[0] ;
            Z13178ProForFT = T01VX3_A13178ProForFT[0] ;
            Z13111ProForDe2 = T01VX3_A13111ProForDe2[0] ;
            Z490ForPrdUMe = T01VX3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z770ProForPrd = A770ProForPrd ;
            Z765ProForDes = A765ProForDes ;
            Z762ProForCan = A762ProForCan ;
            Z763ProForCla = A763ProForCla ;
            Z1645ProForNro = A1645ProForNro ;
            Z3379ProForTnq = A3379ProForTnq ;
            Z6062ProForCPo = A6062ProForCPo ;
            Z5358ProForClv = A5358ProForClv ;
            Z13178ProForFT = A13178ProForFT ;
            Z13111ProForDe2 = A13111ProForDe2 ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z767ProForLin = A767ProForLin ;
         Z770ProForPrd = A770ProForPrd ;
         Z765ProForDes = A765ProForDes ;
         Z762ProForCan = A762ProForCan ;
         Z763ProForCla = A763ProForCla ;
         Z1645ProForNro = A1645ProForNro ;
         Z3379ProForTnq = A3379ProForTnq ;
         Z6062ProForCPo = A6062ProForCPo ;
         Z5358ProForClv = A5358ProForClv ;
         Z13178ProForFT = A13178ProForFT ;
         Z13111ProForDe2 = A13111ProForDe2 ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z766ProForDsc = A766ProForDsc ;
         Z4715ProForDsc2 = A4715ProForDsc2 ;
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

   public void load1VX90( )
   {
      /* Using cursor T01VX6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A766ProForDsc = T01VX6_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = T01VX6_A4715ProForDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
         A770ProForPrd = T01VX6_A770ProForPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
         A765ProForDes = T01VX6_A765ProForDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A765ProForDes", A765ProForDes);
         A488ForPrdDsc = T01VX6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01VX6_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         A762ProForCan = T01VX6_A762ProForCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A762ProForCan", GXutil.ltrimstr( A762ProForCan, 12, 5));
         A763ProForCla = T01VX6_A763ProForCla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A763ProForCla", A763ProForCla);
         A1645ProForNro = T01VX6_A1645ProForNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1645ProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1645ProForNro), 2, 0));
         A3379ProForTnq = T01VX6_A3379ProForTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3379ProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3379ProForTnq), 2, 0));
         A6062ProForCPo = T01VX6_A6062ProForCPo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6062ProForCPo", GXutil.ltrimstr( A6062ProForCPo, 6, 2));
         A5358ProForClv = T01VX6_A5358ProForClv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5358ProForClv", A5358ProForClv);
         A13178ProForFT = T01VX6_A13178ProForFT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", A13178ProForFT);
         A13111ProForDe2 = T01VX6_A13111ProForDe2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13111ProForDe2", A13111ProForDe2);
         A490ForPrdUMe = T01VX6_A490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         zm1VX90( -2) ;
      }
      pr_default.close(4);
      onLoadActions1VX90( ) ;
   }

   public void onLoadActions1VX90( )
   {
   }

   public void checkExtendedTable1VX90( )
   {
      nIsDirty_90 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01VX5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01VX5_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01VX5_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      pr_default.close(3);
      /* Using cursor T01VX4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01VX4_A766ProForDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A4715ProForDsc2 = T01VX4_A4715ProForDsc2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
      pr_default.close(2);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1VX90( )
   {
      pr_default.close(3);
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         byte A490ForPrdUMe )
   {
      /* Using cursor T01VX7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01VX7_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01VX7_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_3( String A396EmprCod ,
                         String A764ProForCod )
   {
      /* Using cursor T01VX8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01VX8_A766ProForDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A4715ProForDsc2 = T01VX8_A4715ProForDsc2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4715ProForDsc2))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1VX90( )
   {
      /* Using cursor T01VX9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound90 = (short)(1) ;
      }
      else
      {
         RcdFound90 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01VX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1VX90( 2) ;
         RcdFound90 = (short)(1) ;
         A767ProForLin = T01VX3_A767ProForLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
         A770ProForPrd = T01VX3_A770ProForPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
         A765ProForDes = T01VX3_A765ProForDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A765ProForDes", A765ProForDes);
         A762ProForCan = T01VX3_A762ProForCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A762ProForCan", GXutil.ltrimstr( A762ProForCan, 12, 5));
         A763ProForCla = T01VX3_A763ProForCla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A763ProForCla", A763ProForCla);
         A1645ProForNro = T01VX3_A1645ProForNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1645ProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1645ProForNro), 2, 0));
         A3379ProForTnq = T01VX3_A3379ProForTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3379ProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3379ProForTnq), 2, 0));
         A6062ProForCPo = T01VX3_A6062ProForCPo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6062ProForCPo", GXutil.ltrimstr( A6062ProForCPo, 6, 2));
         A5358ProForClv = T01VX3_A5358ProForClv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5358ProForClv", A5358ProForClv);
         A13178ProForFT = T01VX3_A13178ProForFT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", A13178ProForFT);
         A13111ProForDe2 = T01VX3_A13111ProForDe2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13111ProForDe2", A13111ProForDe2);
         A396EmprCod = T01VX3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = T01VX3_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A490ForPrdUMe = T01VX3_A490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z767ProForLin = A767ProForLin ;
         sMode90 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1VX90( ) ;
         if ( AnyError == 1 )
         {
            RcdFound90 = (short)(0) ;
            initializeNonKey1VX90( ) ;
         }
         Gx_mode = sMode90 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound90 = (short)(0) ;
         initializeNonKey1VX90( ) ;
         sMode90 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode90 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1VX90( ) ;
      if ( RcdFound90 == 0 )
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
      RcdFound90 = (short)(0) ;
      /* Using cursor T01VX10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A764ProForCod, A764ProForCod, A396EmprCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01VX10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VX10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VX10_A764ProForCod[0], A764ProForCod) < 0 ) || ( GXutil.strcmp(T01VX10_A764ProForCod[0], A764ProForCod) == 0 ) && ( GXutil.strcmp(T01VX10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VX10_A767ProForLin[0] < A767ProForLin ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01VX10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VX10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VX10_A764ProForCod[0], A764ProForCod) > 0 ) || ( GXutil.strcmp(T01VX10_A764ProForCod[0], A764ProForCod) == 0 ) && ( GXutil.strcmp(T01VX10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VX10_A767ProForLin[0] > A767ProForLin ) ) )
         {
            A396EmprCod = T01VX10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A764ProForCod = T01VX10_A764ProForCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            A767ProForLin = T01VX10_A767ProForLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
            RcdFound90 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound90 = (short)(0) ;
      /* Using cursor T01VX11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A764ProForCod, A764ProForCod, A396EmprCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01VX11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VX11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VX11_A764ProForCod[0], A764ProForCod) > 0 ) || ( GXutil.strcmp(T01VX11_A764ProForCod[0], A764ProForCod) == 0 ) && ( GXutil.strcmp(T01VX11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VX11_A767ProForLin[0] > A767ProForLin ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01VX11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VX11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VX11_A764ProForCod[0], A764ProForCod) < 0 ) || ( GXutil.strcmp(T01VX11_A764ProForCod[0], A764ProForCod) == 0 ) && ( GXutil.strcmp(T01VX11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VX11_A767ProForLin[0] < A767ProForLin ) ) )
         {
            A396EmprCod = T01VX11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A764ProForCod = T01VX11_A764ProForCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            A767ProForLin = T01VX11_A767ProForLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
            RcdFound90 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VX90( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1VX90( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound90 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) || ( A767ProForLin != Z767ProForLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A764ProForCod = Z764ProForCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
               A767ProForLin = Z767ProForLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
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
               update1VX90( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) || ( A767ProForLin != Z767ProForLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1VX90( ) ;
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
                  insert1VX90( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) || ( A767ProForLin != Z767ProForLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = Z764ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A767ProForLin = Z767ProForLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
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
      if ( RcdFound90 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtProForPrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1VX90( ) ;
      if ( RcdFound90 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForPrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VX90( ) ;
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
      if ( RcdFound90 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForPrd_Internalname ;
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
      if ( RcdFound90 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForPrd_Internalname ;
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
      scanStart1VX90( ) ;
      if ( RcdFound90 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound90 != 0 )
         {
            scanNext1VX90( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForPrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VX90( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1VX90( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01VX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPROFO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z770ProForPrd, T01VX2_A770ProForPrd[0]) != 0 ) || ( GXutil.strcmp(Z765ProForDes, T01VX2_A765ProForDes[0]) != 0 ) || ( DecimalUtil.compareTo(Z762ProForCan, T01VX2_A762ProForCan[0]) != 0 ) || ( GXutil.strcmp(Z763ProForCla, T01VX2_A763ProForCla[0]) != 0 ) || ( Z1645ProForNro != T01VX2_A1645ProForNro[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3379ProForTnq != T01VX2_A3379ProForTnq[0] ) || ( DecimalUtil.compareTo(Z6062ProForCPo, T01VX2_A6062ProForCPo[0]) != 0 ) || ( GXutil.strcmp(Z5358ProForClv, T01VX2_A5358ProForClv[0]) != 0 ) || ( GXutil.strcmp(Z13178ProForFT, T01VX2_A13178ProForFT[0]) != 0 ) || ( GXutil.strcmp(Z13111ProForDe2, T01VX2_A13111ProForDe2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z490ForPrdUMe != T01VX2_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z770ProForPrd, T01VX2_A770ProForPrd[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.lprofo_trn:[seudo value changed for attri]"+"ProForPrd");
               GXutil.writeLogRaw("Old: ",Z770ProForPrd);
               GXutil.writeLogRaw("Current: ",T01VX2_A770ProForPrd[0]);
            }
            if ( GXutil.strcmp(Z765ProForDes, T01VX2_A765ProForDes[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.lprofo_trn:[seudo value changed for attri]"+"ProForDes");
               GXutil.writeLogRaw("Old: ",Z765ProForDes);
               GXutil.writeLogRaw("Current: ",T01VX2_A765ProForDes[0]);
            }
            if ( DecimalUtil.compareTo(Z762ProForCan, T01VX2_A762ProForCan[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.lprofo_trn:[seudo value changed for attri]"+"ProForCan");
               GXutil.writeLogRaw("Old: ",Z762ProForCan);
               GXutil.writeLogRaw("Current: ",T01VX2_A762ProForCan[0]);
            }
            if ( GXutil.strcmp(Z763ProForCla, T01VX2_A763ProForCla[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.lprofo_trn:[seudo value changed for attri]"+"ProForCla");
               GXutil.writeLogRaw("Old: ",Z763ProForCla);
               GXutil.writeLogRaw("Current: ",T01VX2_A763ProForCla[0]);
            }
            if ( Z1645ProForNro != T01VX2_A1645ProForNro[0] )
            {
               GXutil.writeLogln("formulaciontinte.lprofo_trn:[seudo value changed for attri]"+"ProForNro");
               GXutil.writeLogRaw("Old: ",Z1645ProForNro);
               GXutil.writeLogRaw("Current: ",T01VX2_A1645ProForNro[0]);
            }
            if ( Z3379ProForTnq != T01VX2_A3379ProForTnq[0] )
            {
               GXutil.writeLogln("formulaciontinte.lprofo_trn:[seudo value changed for attri]"+"ProForTnq");
               GXutil.writeLogRaw("Old: ",Z3379ProForTnq);
               GXutil.writeLogRaw("Current: ",T01VX2_A3379ProForTnq[0]);
            }
            if ( DecimalUtil.compareTo(Z6062ProForCPo, T01VX2_A6062ProForCPo[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.lprofo_trn:[seudo value changed for attri]"+"ProForCPo");
               GXutil.writeLogRaw("Old: ",Z6062ProForCPo);
               GXutil.writeLogRaw("Current: ",T01VX2_A6062ProForCPo[0]);
            }
            if ( GXutil.strcmp(Z5358ProForClv, T01VX2_A5358ProForClv[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.lprofo_trn:[seudo value changed for attri]"+"ProForClv");
               GXutil.writeLogRaw("Old: ",Z5358ProForClv);
               GXutil.writeLogRaw("Current: ",T01VX2_A5358ProForClv[0]);
            }
            if ( GXutil.strcmp(Z13178ProForFT, T01VX2_A13178ProForFT[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.lprofo_trn:[seudo value changed for attri]"+"ProForFT");
               GXutil.writeLogRaw("Old: ",Z13178ProForFT);
               GXutil.writeLogRaw("Current: ",T01VX2_A13178ProForFT[0]);
            }
            if ( GXutil.strcmp(Z13111ProForDe2, T01VX2_A13111ProForDe2[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.lprofo_trn:[seudo value changed for attri]"+"ProForDe2");
               GXutil.writeLogRaw("Old: ",Z13111ProForDe2);
               GXutil.writeLogRaw("Current: ",T01VX2_A13111ProForDe2[0]);
            }
            if ( Z490ForPrdUMe != T01VX2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("formulaciontinte.lprofo_trn:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01VX2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPROFO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VX90( )
   {
      beforeValidate1VX90( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VX90( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VX90( 0) ;
         checkOptimisticConcurrency1VX90( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VX90( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VX90( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VX12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A767ProForLin), A770ProForPrd, A765ProForDes, A762ProForCan, A763ProForCla, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A6062ProForCPo, A5358ProForClv, A13178ProForFT, A13111ProForDe2, A396EmprCod, A764ProForCod, Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        resetCaption1VX0( ) ;
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
            load1VX90( ) ;
         }
         endLevel1VX90( ) ;
      }
      closeExtendedTableCursors1VX90( ) ;
   }

   public void update1VX90( )
   {
      beforeValidate1VX90( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VX90( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VX90( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VX90( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VX90( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VX13 */
                  pr_default.execute(11, new Object[] {A770ProForPrd, A765ProForDes, A762ProForCan, A763ProForCla, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A6062ProForCPo, A5358ProForClv, A13178ProForFT, A13111ProForDe2, Byte.valueOf(A490ForPrdUMe), A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPROFO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VX90( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1VX0( ) ;
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
         endLevel1VX90( ) ;
      }
      closeExtendedTableCursors1VX90( ) ;
   }

   public void deferredUpdate1VX90( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1VX90( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VX90( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VX90( ) ;
         afterConfirm1VX90( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VX90( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01VX14 */
               pr_default.execute(12, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound90 == 0 )
                     {
                        initAll1VX90( ) ;
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
                     resetCaption1VX0( ) ;
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
      sMode90 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1VX90( ) ;
      Gx_mode = sMode90 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1VX90( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01VX15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T01VX15_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = T01VX15_A4715ProForDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
         pr_default.close(13);
         /* Using cursor T01VX16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01VX16_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01VX16_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         pr_default.close(14);
      }
   }

   public void endLevel1VX90( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VX90( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.lprofo_trn");
         if ( AnyError == 0 )
         {
            confirmValues1VX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.lprofo_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1VX90( )
   {
      /* Using cursor T01VX17 */
      pr_default.execute(15);
      RcdFound90 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A396EmprCod = T01VX17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = T01VX17_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A767ProForLin = T01VX17_A767ProForLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1VX90( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound90 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A396EmprCod = T01VX17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = T01VX17_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A767ProForLin = T01VX17_A767ProForLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
      }
   }

   public void scanEnd1VX90( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1VX90( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1VX90( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VX90( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VX90( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VX90( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VX90( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VX90( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), true);
      edtProForDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc2_Enabled), 5, 0), true);
      edtProForLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), true);
      edtProForPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPrd_Enabled), 5, 0), true);
      edtProForDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDes_Enabled), 5, 0), true);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), true);
      edtProForCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCan_Enabled), 5, 0), true);
      edtProForCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCla_Enabled), 5, 0), true);
      edtProForNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForNro_Enabled), 5, 0), true);
      edtProForTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTnq_Enabled), 5, 0), true);
      edtProForCPo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCPo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCPo_Enabled), 5, 0), true);
      edtProForClv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Enabled), 5, 0), true);
      edtProForFT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForFT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForFT_Enabled), 5, 0), true);
      edtProForDe2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDe2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDe2_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1VX90( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1VX0( )
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.lprofo_trn", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z767ProForLin", GXutil.ltrim( localUtil.ntoc( Z767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z770ProForPrd", GXutil.rtrim( Z770ProForPrd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z765ProForDes", GXutil.rtrim( Z765ProForDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z762ProForCan", GXutil.ltrim( localUtil.ntoc( Z762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z763ProForCla", GXutil.rtrim( Z763ProForCla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1645ProForNro", GXutil.ltrim( localUtil.ntoc( Z1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3379ProForTnq", GXutil.ltrim( localUtil.ntoc( Z3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6062ProForCPo", GXutil.ltrim( localUtil.ntoc( Z6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5358ProForClv", GXutil.rtrim( Z5358ProForClv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13178ProForFT", GXutil.rtrim( Z13178ProForFT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13111ProForDe2", GXutil.rtrim( Z13111ProForDe2));
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
      return formatLink("app.formulaciontinte.lprofo_trn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.LPROFO_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Proceso Quimico (Lineas)", "") ;
   }

   public void initializeNonKey1VX90( )
   {
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A4715ProForDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
      A770ProForPrd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
      A765ProForDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A765ProForDes", A765ProForDes);
      A490ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A762ProForCan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A762ProForCan", GXutil.ltrimstr( A762ProForCan, 12, 5));
      A763ProForCla = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A763ProForCla", A763ProForCla);
      A1645ProForNro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1645ProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1645ProForNro), 2, 0));
      A3379ProForTnq = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3379ProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3379ProForTnq), 2, 0));
      A6062ProForCPo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6062ProForCPo", GXutil.ltrimstr( A6062ProForCPo, 6, 2));
      A5358ProForClv = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5358ProForClv", A5358ProForClv);
      A13178ProForFT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", A13178ProForFT);
      A13111ProForDe2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13111ProForDe2", A13111ProForDe2);
      Z770ProForPrd = "" ;
      Z765ProForDes = "" ;
      Z762ProForCan = DecimalUtil.ZERO ;
      Z763ProForCla = "" ;
      Z1645ProForNro = (byte)(0) ;
      Z3379ProForTnq = (byte)(0) ;
      Z6062ProForCPo = DecimalUtil.ZERO ;
      Z5358ProForClv = "" ;
      Z13178ProForFT = "" ;
      Z13111ProForDe2 = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1VX90( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A764ProForCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      A767ProForLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
      initializeNonKey1VX90( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016401448", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/lprofo_trn.js", "?202661016401448", false, true);
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
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtProForDsc2_Internalname = "PROFORDSC2" ;
      edtProForLin_Internalname = "PROFORLIN" ;
      edtProForPrd_Internalname = "PROFORPRD" ;
      edtProForDes_Internalname = "PROFORDES" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtProForCan_Internalname = "PROFORCAN" ;
      edtProForCla_Internalname = "PROFORCLA" ;
      edtProForNro_Internalname = "PROFORNRO" ;
      edtProForTnq_Internalname = "PROFORTNQ" ;
      edtProForCPo_Internalname = "PROFORCPO" ;
      edtProForClv_Internalname = "PROFORCLV" ;
      edtProForFT_Internalname = "PROFORFT" ;
      edtProForDe2_Internalname = "PROFORDE2" ;
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
      Form.setCaption( httpContext.getMessage( "Proceso Quimico (Lineas)", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtProForDe2_Jsonclick = "" ;
      edtProForDe2_Enabled = 1 ;
      edtProForFT_Jsonclick = "" ;
      edtProForFT_Enabled = 1 ;
      edtProForClv_Jsonclick = "" ;
      edtProForClv_Enabled = 1 ;
      edtProForCPo_Jsonclick = "" ;
      edtProForCPo_Enabled = 1 ;
      edtProForTnq_Jsonclick = "" ;
      edtProForTnq_Enabled = 1 ;
      edtProForNro_Jsonclick = "" ;
      edtProForNro_Enabled = 1 ;
      edtProForCla_Jsonclick = "" ;
      edtProForCla_Enabled = 1 ;
      edtProForCan_Jsonclick = "" ;
      edtProForCan_Enabled = 1 ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForPrdUMe_Enabled = 1 ;
      edtProForDes_Jsonclick = "" ;
      edtProForDes_Enabled = 1 ;
      edtProForPrd_Jsonclick = "" ;
      edtProForPrd_Enabled = 1 ;
      edtProForLin_Jsonclick = "" ;
      edtProForLin_Enabled = 1 ;
      edtProForDsc2_Jsonclick = "" ;
      edtProForDsc2_Enabled = 0 ;
      edtProForDsc_Jsonclick = "" ;
      edtProForDsc_Enabled = 0 ;
      edtProForCod_Jsonclick = "" ;
      edtProForCod_Enabled = 1 ;
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
      /* Using cursor T01VX15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01VX15_A766ProForDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A4715ProForDsc2 = T01VX15_A4715ProForDsc2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
      pr_default.close(13);
      GX_FocusControl = edtProForPrd_Internalname ;
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

   public void valid_Proforcod( )
   {
      /* Using cursor T01VX15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A766ProForDsc = T01VX15_A766ProForDsc[0] ;
      A4715ProForDsc2 = T01VX15_A4715ProForDsc2[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", GXutil.rtrim( A4715ProForDsc2));
   }

   public void valid_Proforlin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", GXutil.rtrim( A770ProForPrd));
      httpContext.ajax_rsp_assign_attri("", false, "A765ProForDes", GXutil.rtrim( A765ProForDes));
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A762ProForCan", GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A763ProForCla", GXutil.rtrim( A763ProForCla));
      httpContext.ajax_rsp_assign_attri("", false, "A1645ProForNro", GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3379ProForTnq", GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6062ProForCPo", GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5358ProForClv", GXutil.rtrim( A5358ProForClv));
      httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", GXutil.rtrim( A13178ProForFT));
      httpContext.ajax_rsp_assign_attri("", false, "A13111ProForDe2", GXutil.rtrim( A13111ProForDe2));
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", GXutil.rtrim( A4715ProForDsc2));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z767ProForLin", GXutil.ltrim( localUtil.ntoc( Z767ProForLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z770ProForPrd", GXutil.rtrim( Z770ProForPrd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z765ProForDes", GXutil.rtrim( Z765ProForDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z762ProForCan", GXutil.ltrim( localUtil.ntoc( Z762ProForCan, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z763ProForCla", GXutil.rtrim( Z763ProForCla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1645ProForNro", GXutil.ltrim( localUtil.ntoc( Z1645ProForNro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3379ProForTnq", GXutil.ltrim( localUtil.ntoc( Z3379ProForTnq, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6062ProForCPo", GXutil.ltrim( localUtil.ntoc( Z6062ProForCPo, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5358ProForClv", GXutil.rtrim( Z5358ProForClv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13178ProForFT", GXutil.rtrim( Z13178ProForFT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13111ProForDe2", GXutil.rtrim( Z13111ProForDe2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z488ForPrdDsc", GXutil.rtrim( Z488ForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z766ProForDsc", GXutil.rtrim( Z766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4715ProForDsc2", GXutil.rtrim( Z4715ProForDsc2));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Forprdume( )
   {
      n488ForPrdDsc = false ;
      /* Using cursor T01VX16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A488ForPrdDsc = T01VX16_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01VX16_n488ForPrdDsc[0] ;
      pr_default.close(14);
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A4715ProForDsc2',fld:'PROFORDSC2',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A4715ProForDsc2',fld:'PROFORDSC2',pic:''}]}");
      setEventMetadata("VALID_PROFORLIN","{handler:'valid_Proforlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PROFORLIN",",oparms:[{av:'A770ProForPrd',fld:'PROFORPRD',pic:''},{av:'A765ProForDes',fld:'PROFORDES',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A762ProForCan',fld:'PROFORCAN',pic:'ZZZZZ9.9999'},{av:'A763ProForCla',fld:'PROFORCLA',pic:''},{av:'A1645ProForNro',fld:'PROFORNRO',pic:'Z9'},{av:'A3379ProForTnq',fld:'PROFORTNQ',pic:'Z9'},{av:'A6062ProForCPo',fld:'PROFORCPO',pic:'ZZ9.99'},{av:'A5358ProForClv',fld:'PROFORCLV',pic:''},{av:'A13178ProForFT',fld:'PROFORFT',pic:''},{av:'A13111ProForDe2',fld:'PROFORDE2',pic:''},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A4715ProForDsc2',fld:'PROFORDSC2',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z764ProForCod'},{av:'Z767ProForLin'},{av:'Z770ProForPrd'},{av:'Z765ProForDes'},{av:'Z490ForPrdUMe'},{av:'Z762ProForCan'},{av:'Z763ProForCla'},{av:'Z1645ProForNro'},{av:'Z3379ProForTnq'},{av:'Z6062ProForCPo'},{av:'Z5358ProForClv'},{av:'Z13178ProForFT'},{av:'Z13111ProForDe2'},{av:'Z488ForPrdDsc'},{av:'Z766ProForDsc'},{av:'Z4715ProForDsc2'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
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
      pr_default.close(13);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z764ProForCod = "" ;
      Z770ProForPrd = "" ;
      Z765ProForDes = "" ;
      Z762ProForCan = DecimalUtil.ZERO ;
      Z763ProForCla = "" ;
      Z6062ProForCPo = DecimalUtil.ZERO ;
      Z5358ProForClv = "" ;
      Z13178ProForFT = "" ;
      Z13111ProForDe2 = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
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
      A766ProForDsc = "" ;
      A4715ProForDsc2 = "" ;
      A770ProForPrd = "" ;
      A765ProForDes = "" ;
      A488ForPrdDsc = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      A5358ProForClv = "" ;
      A13178ProForFT = "" ;
      A13111ProForDe2 = "" ;
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
      Z766ProForDsc = "" ;
      Z4715ProForDsc2 = "" ;
      Z488ForPrdDsc = "" ;
      T01VX6_A767ProForLin = new short[1] ;
      T01VX6_A766ProForDsc = new String[] {""} ;
      T01VX6_A4715ProForDsc2 = new String[] {""} ;
      T01VX6_A770ProForPrd = new String[] {""} ;
      T01VX6_A765ProForDes = new String[] {""} ;
      T01VX6_A488ForPrdDsc = new String[] {""} ;
      T01VX6_n488ForPrdDsc = new boolean[] {false} ;
      T01VX6_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VX6_A763ProForCla = new String[] {""} ;
      T01VX6_A1645ProForNro = new byte[1] ;
      T01VX6_A3379ProForTnq = new byte[1] ;
      T01VX6_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VX6_A5358ProForClv = new String[] {""} ;
      T01VX6_A13178ProForFT = new String[] {""} ;
      T01VX6_A13111ProForDe2 = new String[] {""} ;
      T01VX6_A396EmprCod = new String[] {""} ;
      T01VX6_A764ProForCod = new String[] {""} ;
      T01VX6_A490ForPrdUMe = new byte[1] ;
      T01VX5_A488ForPrdDsc = new String[] {""} ;
      T01VX5_n488ForPrdDsc = new boolean[] {false} ;
      T01VX4_A766ProForDsc = new String[] {""} ;
      T01VX4_A4715ProForDsc2 = new String[] {""} ;
      T01VX7_A488ForPrdDsc = new String[] {""} ;
      T01VX7_n488ForPrdDsc = new boolean[] {false} ;
      T01VX8_A766ProForDsc = new String[] {""} ;
      T01VX8_A4715ProForDsc2 = new String[] {""} ;
      T01VX9_A396EmprCod = new String[] {""} ;
      T01VX9_A764ProForCod = new String[] {""} ;
      T01VX9_A767ProForLin = new short[1] ;
      T01VX3_A767ProForLin = new short[1] ;
      T01VX3_A770ProForPrd = new String[] {""} ;
      T01VX3_A765ProForDes = new String[] {""} ;
      T01VX3_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VX3_A763ProForCla = new String[] {""} ;
      T01VX3_A1645ProForNro = new byte[1] ;
      T01VX3_A3379ProForTnq = new byte[1] ;
      T01VX3_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VX3_A5358ProForClv = new String[] {""} ;
      T01VX3_A13178ProForFT = new String[] {""} ;
      T01VX3_A13111ProForDe2 = new String[] {""} ;
      T01VX3_A396EmprCod = new String[] {""} ;
      T01VX3_A764ProForCod = new String[] {""} ;
      T01VX3_A490ForPrdUMe = new byte[1] ;
      sMode90 = "" ;
      T01VX10_A396EmprCod = new String[] {""} ;
      T01VX10_A764ProForCod = new String[] {""} ;
      T01VX10_A767ProForLin = new short[1] ;
      T01VX11_A396EmprCod = new String[] {""} ;
      T01VX11_A764ProForCod = new String[] {""} ;
      T01VX11_A767ProForLin = new short[1] ;
      T01VX2_A767ProForLin = new short[1] ;
      T01VX2_A770ProForPrd = new String[] {""} ;
      T01VX2_A765ProForDes = new String[] {""} ;
      T01VX2_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VX2_A763ProForCla = new String[] {""} ;
      T01VX2_A1645ProForNro = new byte[1] ;
      T01VX2_A3379ProForTnq = new byte[1] ;
      T01VX2_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VX2_A5358ProForClv = new String[] {""} ;
      T01VX2_A13178ProForFT = new String[] {""} ;
      T01VX2_A13111ProForDe2 = new String[] {""} ;
      T01VX2_A396EmprCod = new String[] {""} ;
      T01VX2_A764ProForCod = new String[] {""} ;
      T01VX2_A490ForPrdUMe = new byte[1] ;
      T01VX15_A766ProForDsc = new String[] {""} ;
      T01VX15_A4715ProForDsc2 = new String[] {""} ;
      T01VX16_A488ForPrdDsc = new String[] {""} ;
      T01VX16_n488ForPrdDsc = new boolean[] {false} ;
      T01VX17_A396EmprCod = new String[] {""} ;
      T01VX17_A764ProForCod = new String[] {""} ;
      T01VX17_A767ProForLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ764ProForCod = "" ;
      ZZ770ProForPrd = "" ;
      ZZ765ProForDes = "" ;
      ZZ762ProForCan = DecimalUtil.ZERO ;
      ZZ763ProForCla = "" ;
      ZZ6062ProForCPo = DecimalUtil.ZERO ;
      ZZ5358ProForClv = "" ;
      ZZ13178ProForFT = "" ;
      ZZ13111ProForDe2 = "" ;
      ZZ488ForPrdDsc = "" ;
      ZZ766ProForDsc = "" ;
      ZZ4715ProForDsc2 = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.lprofo_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.lprofo_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.lprofo_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.lprofo_trn__default(),
         new Object[] {
             new Object[] {
            T01VX2_A767ProForLin, T01VX2_A770ProForPrd, T01VX2_A765ProForDes, T01VX2_A762ProForCan, T01VX2_A763ProForCla, T01VX2_A1645ProForNro, T01VX2_A3379ProForTnq, T01VX2_A6062ProForCPo, T01VX2_A5358ProForClv, T01VX2_A13178ProForFT,
            T01VX2_A13111ProForDe2, T01VX2_A396EmprCod, T01VX2_A764ProForCod, T01VX2_A490ForPrdUMe
            }
            , new Object[] {
            T01VX3_A767ProForLin, T01VX3_A770ProForPrd, T01VX3_A765ProForDes, T01VX3_A762ProForCan, T01VX3_A763ProForCla, T01VX3_A1645ProForNro, T01VX3_A3379ProForTnq, T01VX3_A6062ProForCPo, T01VX3_A5358ProForClv, T01VX3_A13178ProForFT,
            T01VX3_A13111ProForDe2, T01VX3_A396EmprCod, T01VX3_A764ProForCod, T01VX3_A490ForPrdUMe
            }
            , new Object[] {
            T01VX4_A766ProForDsc, T01VX4_A4715ProForDsc2
            }
            , new Object[] {
            T01VX5_A488ForPrdDsc, T01VX5_n488ForPrdDsc
            }
            , new Object[] {
            T01VX6_A767ProForLin, T01VX6_A766ProForDsc, T01VX6_A4715ProForDsc2, T01VX6_A770ProForPrd, T01VX6_A765ProForDes, T01VX6_A488ForPrdDsc, T01VX6_n488ForPrdDsc, T01VX6_A762ProForCan, T01VX6_A763ProForCla, T01VX6_A1645ProForNro,
            T01VX6_A3379ProForTnq, T01VX6_A6062ProForCPo, T01VX6_A5358ProForClv, T01VX6_A13178ProForFT, T01VX6_A13111ProForDe2, T01VX6_A396EmprCod, T01VX6_A764ProForCod, T01VX6_A490ForPrdUMe
            }
            , new Object[] {
            T01VX7_A488ForPrdDsc, T01VX7_n488ForPrdDsc
            }
            , new Object[] {
            T01VX8_A766ProForDsc, T01VX8_A4715ProForDsc2
            }
            , new Object[] {
            T01VX9_A396EmprCod, T01VX9_A764ProForCod, T01VX9_A767ProForLin
            }
            , new Object[] {
            T01VX10_A396EmprCod, T01VX10_A764ProForCod, T01VX10_A767ProForLin
            }
            , new Object[] {
            T01VX11_A396EmprCod, T01VX11_A764ProForCod, T01VX11_A767ProForLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01VX15_A766ProForDsc, T01VX15_A4715ProForDsc2
            }
            , new Object[] {
            T01VX16_A488ForPrdDsc, T01VX16_n488ForPrdDsc
            }
            , new Object[] {
            T01VX17_A396EmprCod, T01VX17_A764ProForCod, T01VX17_A767ProForLin
            }
         }
      );
   }

   private byte Z1645ProForNro ;
   private byte Z3379ProForTnq ;
   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ490ForPrdUMe ;
   private byte ZZ1645ProForNro ;
   private byte ZZ3379ProForTnq ;
   private short Z767ProForLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A767ProForLin ;
   private short RcdFound90 ;
   private short nIsDirty_90 ;
   private short ZZ767ProForLin ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtProForDsc2_Enabled ;
   private int edtProForLin_Enabled ;
   private int edtProForPrd_Enabled ;
   private int edtProForDes_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Enabled ;
   private int edtProForCan_Enabled ;
   private int edtProForCla_Enabled ;
   private int edtProForNro_Enabled ;
   private int edtProForTnq_Enabled ;
   private int edtProForCPo_Enabled ;
   private int edtProForClv_Enabled ;
   private int edtProForFT_Enabled ;
   private int edtProForDe2_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z762ProForCan ;
   private java.math.BigDecimal Z6062ProForCPo ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal A6062ProForCPo ;
   private java.math.BigDecimal ZZ762ProForCan ;
   private java.math.BigDecimal ZZ6062ProForCPo ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z764ProForCod ;
   private String Z770ProForPrd ;
   private String Z765ProForDes ;
   private String Z763ProForCla ;
   private String Z5358ProForClv ;
   private String Z13178ProForFT ;
   private String Z13111ProForDe2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A764ProForCod ;
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
   private String edtProForCod_Internalname ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Jsonclick ;
   private String edtProForDsc2_Internalname ;
   private String A4715ProForDsc2 ;
   private String edtProForDsc2_Jsonclick ;
   private String edtProForLin_Internalname ;
   private String edtProForLin_Jsonclick ;
   private String edtProForPrd_Internalname ;
   private String A770ProForPrd ;
   private String edtProForPrd_Jsonclick ;
   private String edtProForDes_Internalname ;
   private String A765ProForDes ;
   private String edtProForDes_Jsonclick ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtProForCan_Internalname ;
   private String edtProForCan_Jsonclick ;
   private String edtProForCla_Internalname ;
   private String A763ProForCla ;
   private String edtProForCla_Jsonclick ;
   private String edtProForNro_Internalname ;
   private String edtProForNro_Jsonclick ;
   private String edtProForTnq_Internalname ;
   private String edtProForTnq_Jsonclick ;
   private String edtProForCPo_Internalname ;
   private String edtProForCPo_Jsonclick ;
   private String edtProForClv_Internalname ;
   private String A5358ProForClv ;
   private String edtProForClv_Jsonclick ;
   private String edtProForFT_Internalname ;
   private String A13178ProForFT ;
   private String edtProForFT_Jsonclick ;
   private String edtProForDe2_Internalname ;
   private String A13111ProForDe2 ;
   private String edtProForDe2_Jsonclick ;
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
   private String Z766ProForDsc ;
   private String Z4715ProForDsc2 ;
   private String Z488ForPrdDsc ;
   private String sMode90 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ764ProForCod ;
   private String ZZ770ProForPrd ;
   private String ZZ765ProForDes ;
   private String ZZ763ProForCla ;
   private String ZZ5358ProForClv ;
   private String ZZ13178ProForFT ;
   private String ZZ13111ProForDe2 ;
   private String ZZ488ForPrdDsc ;
   private String ZZ766ProForDsc ;
   private String ZZ4715ProForDsc2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n488ForPrdDsc ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private short[] T01VX6_A767ProForLin ;
   private String[] T01VX6_A766ProForDsc ;
   private String[] T01VX6_A4715ProForDsc2 ;
   private String[] T01VX6_A770ProForPrd ;
   private String[] T01VX6_A765ProForDes ;
   private String[] T01VX6_A488ForPrdDsc ;
   private boolean[] T01VX6_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01VX6_A762ProForCan ;
   private String[] T01VX6_A763ProForCla ;
   private byte[] T01VX6_A1645ProForNro ;
   private byte[] T01VX6_A3379ProForTnq ;
   private java.math.BigDecimal[] T01VX6_A6062ProForCPo ;
   private String[] T01VX6_A5358ProForClv ;
   private String[] T01VX6_A13178ProForFT ;
   private String[] T01VX6_A13111ProForDe2 ;
   private String[] T01VX6_A396EmprCod ;
   private String[] T01VX6_A764ProForCod ;
   private byte[] T01VX6_A490ForPrdUMe ;
   private String[] T01VX5_A488ForPrdDsc ;
   private boolean[] T01VX5_n488ForPrdDsc ;
   private String[] T01VX4_A766ProForDsc ;
   private String[] T01VX4_A4715ProForDsc2 ;
   private String[] T01VX7_A488ForPrdDsc ;
   private boolean[] T01VX7_n488ForPrdDsc ;
   private String[] T01VX8_A766ProForDsc ;
   private String[] T01VX8_A4715ProForDsc2 ;
   private String[] T01VX9_A396EmprCod ;
   private String[] T01VX9_A764ProForCod ;
   private short[] T01VX9_A767ProForLin ;
   private short[] T01VX3_A767ProForLin ;
   private String[] T01VX3_A770ProForPrd ;
   private String[] T01VX3_A765ProForDes ;
   private java.math.BigDecimal[] T01VX3_A762ProForCan ;
   private String[] T01VX3_A763ProForCla ;
   private byte[] T01VX3_A1645ProForNro ;
   private byte[] T01VX3_A3379ProForTnq ;
   private java.math.BigDecimal[] T01VX3_A6062ProForCPo ;
   private String[] T01VX3_A5358ProForClv ;
   private String[] T01VX3_A13178ProForFT ;
   private String[] T01VX3_A13111ProForDe2 ;
   private String[] T01VX3_A396EmprCod ;
   private String[] T01VX3_A764ProForCod ;
   private byte[] T01VX3_A490ForPrdUMe ;
   private String[] T01VX10_A396EmprCod ;
   private String[] T01VX10_A764ProForCod ;
   private short[] T01VX10_A767ProForLin ;
   private String[] T01VX11_A396EmprCod ;
   private String[] T01VX11_A764ProForCod ;
   private short[] T01VX11_A767ProForLin ;
   private short[] T01VX2_A767ProForLin ;
   private String[] T01VX2_A770ProForPrd ;
   private String[] T01VX2_A765ProForDes ;
   private java.math.BigDecimal[] T01VX2_A762ProForCan ;
   private String[] T01VX2_A763ProForCla ;
   private byte[] T01VX2_A1645ProForNro ;
   private byte[] T01VX2_A3379ProForTnq ;
   private java.math.BigDecimal[] T01VX2_A6062ProForCPo ;
   private String[] T01VX2_A5358ProForClv ;
   private String[] T01VX2_A13178ProForFT ;
   private String[] T01VX2_A13111ProForDe2 ;
   private String[] T01VX2_A396EmprCod ;
   private String[] T01VX2_A764ProForCod ;
   private byte[] T01VX2_A490ForPrdUMe ;
   private String[] T01VX15_A766ProForDsc ;
   private String[] T01VX15_A4715ProForDsc2 ;
   private String[] T01VX16_A488ForPrdDsc ;
   private boolean[] T01VX16_n488ForPrdDsc ;
   private String[] T01VX17_A396EmprCod ;
   private String[] T01VX17_A764ProForCod ;
   private short[] T01VX17_A767ProForLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class lprofo_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lprofo_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lprofo_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lprofo_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01VX2", "SELECT ProForLin, ProForPrd, ProForDes, ProForCan, ProForCla, ProForNro, ProForTnq, ProForCPo, ProForClv, ProForFT, ProForDe2, EmprCod, ProForCod, ForPrdUMe FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?  FOR UPDATE OF ProForPrd, ProForDes, ProForCan, ProForCla, ProForNro, ProForTnq, ProForCPo, ProForClv, ProForFT, ProForDe2, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VX3", "SELECT ProForLin, ProForPrd, ProForDes, ProForCan, ProForCla, ProForNro, ProForTnq, ProForCPo, ProForClv, ProForFT, ProForDe2, EmprCod, ProForCod, ForPrdUMe FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VX4", "SELECT ProForDsc, ProForDsc2 FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VX5", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VX6", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProForLin, T2.ProForDsc, T2.ProForDsc2, TM1.ProForPrd, TM1.ProForDes, T3.ForPrdDsc, TM1.ProForCan, TM1.ProForCla, TM1.ProForNro, TM1.ProForTnq, TM1.ProForCPo, TM1.ProForClv, TM1.ProForFT, TM1.ProForDe2, TM1.EmprCod, TM1.ProForCod, TM1.ForPrdUMe FROM ((TXPLPROFO TM1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = TM1.EmprCod AND T2.ProForCod = TM1.ProForCod) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = TM1.EmprCod AND T3.ForPrdUMe = TM1.ForPrdUMe) WHERE TM1.EmprCod = ? and TM1.ProForCod = ? and TM1.ProForLin = ? ORDER BY TM1.EmprCod, TM1.ProForCod, TM1.ProForLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VX7", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VX8", "SELECT ProForDsc, ProForDsc2 FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VX9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VX10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE ( EmprCod > ? or EmprCod = ? and ProForCod > ? or ProForCod = ? and EmprCod = ? and ProForLin > ?) ORDER BY EmprCod, ProForCod, ProForLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VX11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE ( EmprCod < ? or EmprCod = ? and ProForCod < ? or ProForCod = ? and EmprCod = ? and ProForLin < ?) ORDER BY EmprCod DESC, ProForCod DESC, ProForLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01VX12", "INSERT INTO TXPLPROFO(ProForLin, ProForPrd, ProForDes, ProForCan, ProForCla, ProForNro, ProForTnq, ProForCPo, ProForClv, ProForFT, ProForDe2, EmprCod, ProForCod, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPROFO")
         ,new UpdateCursor("T01VX13", "UPDATE TXPLPROFO SET ProForPrd=?, ProForDes=?, ProForCan=?, ProForCla=?, ProForNro=?, ProForTnq=?, ProForCPo=?, ProForClv=?, ProForFT=?, ProForDe2=?, ForPrdUMe=?  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK, "TXPLPROFO")
         ,new UpdateCursor("T01VX14", "DELETE FROM TXPLPROFO  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK, "TXPLPROFO")
         ,new ForEachCursor("T01VX15", "SELECT ProForDsc, ProForDsc2 FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VX16", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VX17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProForCod, ProForLin FROM TXPLPROFO ORDER BY EmprCod, ProForCod, ProForLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 40);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((String[]) buf[12])[0] = rslt.getString(13, 6);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 40);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((String[]) buf[12])[0] = rslt.getString(13, 6);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((String[]) buf[14])[0] = rslt.getString(14, 40);
               ((String[]) buf[15])[0] = rslt.getString(15, 3);
               ((String[]) buf[16])[0] = rslt.getString(16, 6);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(9, (String)parms[8], 30);
               stmt.setString(10, (String)parms[9], 6);
               stmt.setString(11, (String)parms[10], 40);
               stmt.setString(12, (String)parms[11], 3);
               stmt.setString(13, (String)parms[12], 6);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 26);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 30);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setString(10, (String)parms[9], 40);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 3);
               stmt.setString(13, (String)parms[12], 6);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

