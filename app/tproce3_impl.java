package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tproce3_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A457FasCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtproce3_level1item") == 0 )
      {
         gxnrgridtproce3_level1item_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Procesos con notas de observ.", ""), (short)(0)) ;
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

   public void gxnrgridtproce3_level1item_newrow_invoke( )
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
      gxnrgridtproce3_level1item_newrow( ) ;
      /* End function gxnrGridtproce3_level1item_newrow_invoke */
   }

   public tproce3_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tproce3_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tproce3_impl.class ));
   }

   public tproce3_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkProProvi = UIFactory.getCheckbox(this);
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
      A5289ProProvi = ((GXutil.strcmp(GXutil.rtrim( A5289ProProvi), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", A5289ProProvi);
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Procesos con notas de observ.", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TPROCE3.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCE3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCE3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCE3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCE3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPROCE3.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCE3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCE3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCE3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc2_Internalname, httpContext.getMessage( "Descripcion II", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc2_Internalname, GXutil.rtrim( A4628ProDsc2), GXutil.rtrim( localUtil.format( A4628ProDsc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProDsc2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCE3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkProProvi.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkProProvi.getInternalname(), httpContext.getMessage( "Provisional", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkProProvi.getInternalname(), A5289ProProvi, "", httpContext.getMessage( "Provisional", ""), 1, chkProProvi.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(54, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,54);\"");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCE3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProUltLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProUltLin_Internalname, httpContext.getMessage( "Ultima Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A775ProUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProUltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A775ProUltLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A775ProUltLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProUltLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProUltLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPROCE3.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TPROCE3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtproce3_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCE3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCE3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCE3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtproce3_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol73( ) ;
      nGXsfl_73_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount88 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_88 = (short)(1) ;
            scanStartRR88( ) ;
            while ( RcdFound88 != 0 )
            {
               init_level_properties88( ) ;
               getByPrimaryKeyRR88( ) ;
               addRowRR88( ) ;
               scanNextRR88( ) ;
            }
            scanEndRR88( ) ;
            nBlankRcdCount88 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalRR88( ) ;
         standaloneModalRR88( ) ;
         sMode88 = Gx_mode ;
         while ( nGXsfl_73_idx < nRC_GXsfl_73 )
         {
            bGXsfl_73_Refreshing = true ;
            readRowRR88( ) ;
            edtProNumLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRONUMLIN_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDEC_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtFasPreSal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPRESAL_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreSal_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtFasPrePie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREPIE_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPrePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPrePie_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtFasVelPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASVELPRO_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasVelPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasVelPro_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtFasNumPas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASNUMPAS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasNumPas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumPas_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCON_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtFasForMul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFORMUL_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasForMul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForMul_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtFasConPla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCONPLA_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasConPla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasConPla_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            if ( ( nRcdExists_88 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalRR88( ) ;
            }
            sendRowRR88( ) ;
            bGXsfl_73_Refreshing = false ;
         }
         Gx_mode = sMode88 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount88 = (short)(5) ;
         nRcdExists_88 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartRR88( ) ;
            while ( RcdFound88 != 0 )
            {
               sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_7388( ) ;
               init_level_properties88( ) ;
               standaloneNotModalRR88( ) ;
               getByPrimaryKeyRR88( ) ;
               standaloneModalRR88( ) ;
               addRowRR88( ) ;
               scanNextRR88( ) ;
            }
            scanEndRR88( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode88 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_7388( ) ;
      initAllRR88( ) ;
      init_level_properties88( ) ;
      nRcdExists_88 = (short)(0) ;
      nIsMod_88 = (short)(0) ;
      nRcdDeleted_88 = (short)(0) ;
      nBlankRcdCount88 = (short)(nBlankRcdUsr88+nBlankRcdCount88) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount88 > 0 )
      {
         standaloneNotModalRR88( ) ;
         standaloneModalRR88( ) ;
         addRowRR88( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtProNumLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount88 = (short)(nBlankRcdCount88-1) ;
      }
      Gx_mode = sMode88 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtproce3_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtproce3_level1item", Gridtproce3_level1itemContainer, subGridtproce3_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtproce3_level1itemContainerData", Gridtproce3_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtproce3_level1itemContainerData"+"V", Gridtproce3_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtproce3_level1itemContainerData"+"V"+"\" value='"+Gridtproce3_level1itemContainer.GridValuesHidden()+"'/>") ;
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
         Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
         Z759ProDsc = httpContext.cgiGet( "Z759ProDsc") ;
         Z4628ProDsc2 = httpContext.cgiGet( "Z4628ProDsc2") ;
         Z5289ProProvi = httpContext.cgiGet( "Z5289ProProvi") ;
         Z775ProUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z775ProUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_73 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_73"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A13687ProMaxLin = (short)(localUtil.ctol( httpContext.cgiGet( "PROMAXLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13687ProMaxLin = false ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A4628ProDsc2 = httpContext.cgiGet( edtProDsc2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
         A5289ProProvi = ((GXutil.strcmp(httpContext.cgiGet( chkProProvi.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", A5289ProProvi);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROULTLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProUltLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A775ProUltLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
         }
         else
         {
            A775ProUltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
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
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
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
            initAllRR87( ) ;
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
      disableAttributesRR87( ) ;
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

   public void confirm_RR88( )
   {
      nGXsfl_73_idx = 0 ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         readRowRR88( ) ;
         if ( ( nRcdExists_88 != 0 ) || ( nIsMod_88 != 0 ) )
         {
            getKeyRR88( ) ;
            if ( ( nRcdExists_88 == 0 ) && ( nRcdDeleted_88 == 0 ) )
            {
               if ( RcdFound88 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateRR88( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableRR88( ) ;
                     closeExtendedTableCursorsRR88( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PRONUMLIN_" + sGXsfl_73_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProNumLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound88 != 0 )
               {
                  if ( nRcdDeleted_88 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyRR88( ) ;
                     loadRR88( ) ;
                     beforeValidateRR88( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsRR88( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_88 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateRR88( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableRR88( ) ;
                           closeExtendedTableCursorsRR88( ) ;
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
                  if ( nRcdDeleted_88 == 0 )
                  {
                     GXCCtl = "PRONUMLIN_" + sGXsfl_73_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProNumLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProNumLin_Internalname, GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreSal_Internalname, GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPrePie_Internalname, GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasVelPro_Internalname, GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasNumPas_Internalname, GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( edtFasCon_Internalname, GXutil.rtrim( A458FasCon)) ;
         httpContext.changePostValue( edtFasForMul_Internalname, GXutil.rtrim( A4286FasForMul)) ;
         httpContext.changePostValue( edtFasConPla_Internalname, GXutil.rtrim( A4299FasConPla)) ;
         httpContext.changePostValue( "ZT_"+"Z774ProNumLin_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_73_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_88_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_88_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_88_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_88 != 0 )
         {
            httpContext.changePostValue( "PRONUMLIN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProNumLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDEC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPRESAL_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREPIE_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASVELPRO_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASNUMPAS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCON_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASFORMUL_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCONPLA_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasConPla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T00RR6 */
      pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A13687ProMaxLin = T00RR6_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T00RR6_n13687ProMaxLin[0] ;
      }
      else
      {
         A13687ProMaxLin = (short)(0) ;
         n13687ProMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaptionRR0( )
   {
   }

   public void zmRR87( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z759ProDsc = T00RR8_A759ProDsc[0] ;
            Z4628ProDsc2 = T00RR8_A4628ProDsc2[0] ;
            Z5289ProProvi = T00RR8_A5289ProProvi[0] ;
            Z775ProUltLin = T00RR8_A775ProUltLin[0] ;
         }
         else
         {
            Z759ProDsc = A759ProDsc ;
            Z4628ProDsc2 = A4628ProDsc2 ;
            Z5289ProProvi = A5289ProProvi ;
            Z775ProUltLin = A775ProUltLin ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z758ProCod = A758ProCod ;
         Z759ProDsc = A759ProDsc ;
         Z4628ProDsc2 = A4628ProDsc2 ;
         Z5289ProProvi = A5289ProProvi ;
         Z775ProUltLin = A775ProUltLin ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z13687ProMaxLin = A13687ProMaxLin ;
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

   public void loadRR87( )
   {
      /* Using cursor T00RR11 */
      pr_default.execute(7, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound87 = (short)(1) ;
         A759ProDsc = T00RR11_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A4628ProDsc2 = T00RR11_A4628ProDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
         A5289ProProvi = T00RR11_A5289ProProvi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", A5289ProProvi);
         A407EmprNom = T00RR11_A407EmprNom[0] ;
         n407EmprNom = T00RR11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A775ProUltLin = T00RR11_A775ProUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
         A13687ProMaxLin = T00RR11_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T00RR11_n13687ProMaxLin[0] ;
         zmRR87( -2) ;
      }
      pr_default.close(7);
      onLoadActionsRR87( ) ;
   }

   public void onLoadActionsRR87( )
   {
   }

   public void checkExtendedTableRR87( )
   {
      nIsDirty_87 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00RR9 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00RR9_A407EmprNom[0] ;
      n407EmprNom = T00RR9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      /* Using cursor T00RR6 */
      pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A13687ProMaxLin = T00RR6_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T00RR6_n13687ProMaxLin[0] ;
      }
      else
      {
         nIsDirty_87 = (short)(1) ;
         A13687ProMaxLin = (short)(0) ;
         n13687ProMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
      }
      pr_default.close(3);
      if ( ! ( ( GXutil.strcmp(A5289ProProvi, "S") == 0 ) || ( GXutil.strcmp(A5289ProProvi, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Provisional", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PROPROVI");
         AnyError = (short)(1) ;
         GX_FocusControl = chkProProvi.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsRR87( )
   {
      pr_default.close(6);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod )
   {
      /* Using cursor T00RR12 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00RR12_A407EmprNom[0] ;
      n407EmprNom = T00RR12_n407EmprNom[0] ;
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
                         String A758ProCod )
   {
      /* Using cursor T00RR14 */
      pr_default.execute(9, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A13687ProMaxLin = T00RR14_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T00RR14_n13687ProMaxLin[0] ;
      }
      else
      {
         A13687ProMaxLin = (short)(0) ;
         n13687ProMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13687ProMaxLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKeyRR87( )
   {
      /* Using cursor T00RR15 */
      pr_default.execute(10, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound87 = (short)(1) ;
      }
      else
      {
         RcdFound87 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00RR8 */
      pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zmRR87( 2) ;
         RcdFound87 = (short)(1) ;
         A758ProCod = T00RR8_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A759ProDsc = T00RR8_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A4628ProDsc2 = T00RR8_A4628ProDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
         A5289ProProvi = T00RR8_A5289ProProvi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", A5289ProProvi);
         A775ProUltLin = T00RR8_A775ProUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
         A396EmprCod = T00RR8_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         sMode87 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadRR87( ) ;
         if ( AnyError == 1 )
         {
            RcdFound87 = (short)(0) ;
            initializeNonKeyRR87( ) ;
         }
         Gx_mode = sMode87 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound87 = (short)(0) ;
         initializeNonKeyRR87( ) ;
         sMode87 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode87 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKeyRR87( ) ;
      if ( RcdFound87 == 0 )
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
      RcdFound87 = (short)(0) ;
      /* Using cursor T00RR16 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T00RR16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00RR16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00RR16_A758ProCod[0], A758ProCod) < 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T00RR16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00RR16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00RR16_A758ProCod[0], A758ProCod) > 0 ) ) )
         {
            A396EmprCod = T00RR16_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A758ProCod = T00RR16_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound87 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound87 = (short)(0) ;
      /* Using cursor T00RR17 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T00RR17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00RR17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00RR17_A758ProCod[0], A758ProCod) > 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T00RR17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00RR17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00RR17_A758ProCod[0], A758ProCod) < 0 ) ) )
         {
            A396EmprCod = T00RR17_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A758ProCod = T00RR17_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound87 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyRR87( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertRR87( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound87 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
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
               updateRR87( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertRR87( ) ;
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
                  insertRR87( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
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
      if ( RcdFound87 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtProDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartRR87( ) ;
      if ( RcdFound87 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndRR87( ) ;
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
      if ( RcdFound87 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProDsc_Internalname ;
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
      if ( RcdFound87 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProDsc_Internalname ;
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
      scanStartRR87( ) ;
      if ( RcdFound87 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound87 != 0 )
         {
            scanNextRR87( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndRR87( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyRR87( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00RR7 */
         pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROCES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z759ProDsc, T00RR7_A759ProDsc[0]) != 0 ) || ( GXutil.strcmp(Z4628ProDsc2, T00RR7_A4628ProDsc2[0]) != 0 ) || ( GXutil.strcmp(Z5289ProProvi, T00RR7_A5289ProProvi[0]) != 0 ) || ( Z775ProUltLin != T00RR7_A775ProUltLin[0] ) )
         {
            if ( GXutil.strcmp(Z759ProDsc, T00RR7_A759ProDsc[0]) != 0 )
            {
               GXutil.writeLogln("tproce3:[seudo value changed for attri]"+"ProDsc");
               GXutil.writeLogRaw("Old: ",Z759ProDsc);
               GXutil.writeLogRaw("Current: ",T00RR7_A759ProDsc[0]);
            }
            if ( GXutil.strcmp(Z4628ProDsc2, T00RR7_A4628ProDsc2[0]) != 0 )
            {
               GXutil.writeLogln("tproce3:[seudo value changed for attri]"+"ProDsc2");
               GXutil.writeLogRaw("Old: ",Z4628ProDsc2);
               GXutil.writeLogRaw("Current: ",T00RR7_A4628ProDsc2[0]);
            }
            if ( GXutil.strcmp(Z5289ProProvi, T00RR7_A5289ProProvi[0]) != 0 )
            {
               GXutil.writeLogln("tproce3:[seudo value changed for attri]"+"ProProvi");
               GXutil.writeLogRaw("Old: ",Z5289ProProvi);
               GXutil.writeLogRaw("Current: ",T00RR7_A5289ProProvi[0]);
            }
            if ( Z775ProUltLin != T00RR7_A775ProUltLin[0] )
            {
               GXutil.writeLogln("tproce3:[seudo value changed for attri]"+"ProUltLin");
               GXutil.writeLogRaw("Old: ",Z775ProUltLin);
               GXutil.writeLogRaw("Current: ",T00RR7_A775ProUltLin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPROCES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertRR87( )
   {
      beforeValidateRR87( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableRR87( ) ;
      }
      if ( AnyError == 0 )
      {
         zmRR87( 0) ;
         checkOptimisticConcurrencyRR87( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmRR87( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertRR87( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00RR18 */
                  pr_default.execute(13, new Object[] {A758ProCod, A759ProDsc, A4628ProDsc2, A5289ProProvi, Short.valueOf(A775ProUltLin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevelRR87( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionRR0( ) ;
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
            loadRR87( ) ;
         }
         endLevelRR87( ) ;
      }
      closeExtendedTableCursorsRR87( ) ;
   }

   public void updateRR87( )
   {
      beforeValidateRR87( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableRR87( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyRR87( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmRR87( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateRR87( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00RR19 */
                  pr_default.execute(14, new Object[] {A759ProDsc, A4628ProDsc2, A5289ProProvi, Short.valueOf(A775ProUltLin), A396EmprCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROCES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateRR87( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelRR87( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionRR0( ) ;
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
         endLevelRR87( ) ;
      }
      closeExtendedTableCursorsRR87( ) ;
   }

   public void deferredUpdateRR87( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateRR87( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyRR87( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsRR87( ) ;
         afterConfirmRR87( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteRR87( ) ;
            if ( AnyError == 0 )
            {
               scanStartRR88( ) ;
               while ( RcdFound88 != 0 )
               {
                  getByPrimaryKeyRR88( ) ;
                  deleteRR88( ) ;
                  scanNextRR88( ) ;
               }
               scanEndRR88( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00RR20 */
                  pr_default.execute(15, new Object[] {A396EmprCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound87 == 0 )
                        {
                           initAllRR87( ) ;
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
                        resetCaptionRR0( ) ;
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
      sMode87 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelRR87( ) ;
      Gx_mode = sMode87 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsRR87( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00RR21 */
         pr_default.execute(16, new Object[] {A396EmprCod});
         A407EmprNom = T00RR21_A407EmprNom[0] ;
         n407EmprNom = T00RR21_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(16);
         /* Using cursor T00RR23 */
         pr_default.execute(17, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            A13687ProMaxLin = T00RR23_A13687ProMaxLin[0] ;
            n13687ProMaxLin = T00RR23_n13687ProMaxLin[0] ;
         }
         else
         {
            A13687ProMaxLin = (short)(0) ;
            n13687ProMaxLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
         }
         pr_default.close(17);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00RR24 */
         pr_default.execute(18, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00RR25 */
         pr_default.execute(19, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00RR26 */
         pr_default.execute(20, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases Fac. x Cliente (Cab)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00RR27 */
         pr_default.execute(21, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00RR28 */
         pr_default.execute(22, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMFP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00RR29 */
         pr_default.execute(23, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OTPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00RR30 */
         pr_default.execute(24, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSLA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00RR31 */
         pr_default.execute(25, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00RR32 */
         pr_default.execute(26, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00RR33 */
         pr_default.execute(27, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00RR34 */
         pr_default.execute(28, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
      }
   }

   public void processNestedLevelRR88( )
   {
      nGXsfl_73_idx = 0 ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         readRowRR88( ) ;
         if ( ( nRcdExists_88 != 0 ) || ( nIsMod_88 != 0 ) )
         {
            standaloneNotModalRR88( ) ;
            getKeyRR88( ) ;
            if ( ( nRcdExists_88 == 0 ) && ( nRcdDeleted_88 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertRR88( ) ;
            }
            else
            {
               if ( RcdFound88 != 0 )
               {
                  if ( ( nRcdDeleted_88 != 0 ) && ( nRcdExists_88 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteRR88( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_88 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateRR88( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_88 == 0 )
                  {
                     GXCCtl = "PRONUMLIN_" + sGXsfl_73_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProNumLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProNumLin_Internalname, GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreSal_Internalname, GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPrePie_Internalname, GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasVelPro_Internalname, GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasNumPas_Internalname, GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( edtFasCon_Internalname, GXutil.rtrim( A458FasCon)) ;
         httpContext.changePostValue( edtFasForMul_Internalname, GXutil.rtrim( A4286FasForMul)) ;
         httpContext.changePostValue( edtFasConPla_Internalname, GXutil.rtrim( A4299FasConPla)) ;
         httpContext.changePostValue( "ZT_"+"Z774ProNumLin_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_73_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_88_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_88_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_88_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_88 != 0 )
         {
            httpContext.changePostValue( "PRONUMLIN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProNumLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDEC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPRESAL_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREPIE_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASVELPRO_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASNUMPAS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCON_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASFORMUL_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCONPLA_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasConPla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T00RR23 */
      pr_default.execute(17, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A13687ProMaxLin = T00RR23_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T00RR23_n13687ProMaxLin[0] ;
      }
      else
      {
         A13687ProMaxLin = (short)(0) ;
         n13687ProMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
      }
      /* End of After( level) rules */
      initAllRR88( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_88 = (short)(0) ;
      nIsMod_88 = (short)(0) ;
      nRcdDeleted_88 = (short)(0) ;
   }

   public void processLevelRR87( )
   {
      /* Save parent mode. */
      sMode87 = Gx_mode ;
      processNestedLevelRR88( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode87 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelRR87( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteRR87( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tproce3");
         if ( AnyError == 0 )
         {
            confirmValuesRR0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tproce3");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartRR87( )
   {
      /* Using cursor T00RR35 */
      pr_default.execute(29);
      RcdFound87 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound87 = (short)(1) ;
         A396EmprCod = T00RR35_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = T00RR35_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextRR87( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound87 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound87 = (short)(1) ;
         A396EmprCod = T00RR35_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = T00RR35_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
   }

   public void scanEndRR87( )
   {
      pr_default.close(29);
   }

   public void afterConfirmRR87( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertRR87( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateRR87( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteRR87( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteRR87( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateRR87( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesRR87( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtProDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc2_Enabled), 5, 0), true);
      chkProProvi.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkProProvi.getInternalname(), "Enabled", GXutil.ltrimstr( chkProProvi.getEnabled(), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtProUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUltLin_Enabled), 5, 0), true);
   }

   public void zmRR88( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z457FasCod = T00RR3_A457FasCod[0] ;
         }
         else
         {
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z758ProCod = A758ProCod ;
         Z774ProNumLin = A774ProNumLin ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
         Z459FasDec = A459FasDec ;
         Z469FasPreSal = A469FasPreSal ;
         Z468FasPrePie = A468FasPrePie ;
         Z472FasVelPro = A472FasVelPro ;
         Z464FasNumPas = A464FasNumPas ;
         Z456FasActTin = A456FasActTin ;
         Z458FasCon = A458FasCon ;
         Z4286FasForMul = A4286FasForMul ;
         Z4299FasConPla = A4299FasConPla ;
         Z602MaqCod = A602MaqCod ;
      }
   }

   public void standaloneNotModalRR88( )
   {
   }

   public void standaloneModalRR88( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProNumLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      }
      else
      {
         edtProNumLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      }
   }

   public void loadRR88( )
   {
      /* Using cursor T00RR36 */
      pr_default.execute(30, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound88 = (short)(1) ;
         A460FasDsc = T00RR36_A460FasDsc[0] ;
         A459FasDec = T00RR36_A459FasDec[0] ;
         n459FasDec = T00RR36_n459FasDec[0] ;
         A469FasPreSal = T00RR36_A469FasPreSal[0] ;
         n469FasPreSal = T00RR36_n469FasPreSal[0] ;
         A468FasPrePie = T00RR36_A468FasPrePie[0] ;
         n468FasPrePie = T00RR36_n468FasPrePie[0] ;
         A472FasVelPro = T00RR36_A472FasVelPro[0] ;
         n472FasVelPro = T00RR36_n472FasVelPro[0] ;
         A464FasNumPas = T00RR36_A464FasNumPas[0] ;
         n464FasNumPas = T00RR36_n464FasNumPas[0] ;
         A456FasActTin = T00RR36_A456FasActTin[0] ;
         n456FasActTin = T00RR36_n456FasActTin[0] ;
         A458FasCon = T00RR36_A458FasCon[0] ;
         n458FasCon = T00RR36_n458FasCon[0] ;
         A4286FasForMul = T00RR36_A4286FasForMul[0] ;
         n4286FasForMul = T00RR36_n4286FasForMul[0] ;
         A4299FasConPla = T00RR36_A4299FasConPla[0] ;
         n4299FasConPla = T00RR36_n4299FasConPla[0] ;
         A457FasCod = T00RR36_A457FasCod[0] ;
         A602MaqCod = T00RR36_A602MaqCod[0] ;
         n602MaqCod = T00RR36_n602MaqCod[0] ;
         zmRR88( -5) ;
      }
      pr_default.close(30);
      onLoadActionsRR88( ) ;
   }

   public void onLoadActionsRR88( )
   {
   }

   public void checkExtendedTableRR88( )
   {
      nIsDirty_88 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalRR88( ) ;
      /* Using cursor T00RR4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T00RR4_A460FasDsc[0] ;
      A459FasDec = T00RR4_A459FasDec[0] ;
      n459FasDec = T00RR4_n459FasDec[0] ;
      A469FasPreSal = T00RR4_A469FasPreSal[0] ;
      n469FasPreSal = T00RR4_n469FasPreSal[0] ;
      A468FasPrePie = T00RR4_A468FasPrePie[0] ;
      n468FasPrePie = T00RR4_n468FasPrePie[0] ;
      A472FasVelPro = T00RR4_A472FasVelPro[0] ;
      n472FasVelPro = T00RR4_n472FasVelPro[0] ;
      A464FasNumPas = T00RR4_A464FasNumPas[0] ;
      n464FasNumPas = T00RR4_n464FasNumPas[0] ;
      A456FasActTin = T00RR4_A456FasActTin[0] ;
      n456FasActTin = T00RR4_n456FasActTin[0] ;
      A458FasCon = T00RR4_A458FasCon[0] ;
      n458FasCon = T00RR4_n458FasCon[0] ;
      A4286FasForMul = T00RR4_A4286FasForMul[0] ;
      n4286FasForMul = T00RR4_n4286FasForMul[0] ;
      A4299FasConPla = T00RR4_A4299FasConPla[0] ;
      n4299FasConPla = T00RR4_n4299FasConPla[0] ;
      A602MaqCod = T00RR4_A602MaqCod[0] ;
      n602MaqCod = T00RR4_n602MaqCod[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsRR88( )
   {
      pr_default.close(2);
   }

   public void enableDisableRR88( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         String A457FasCod )
   {
      /* Using cursor T00RR37 */
      pr_default.execute(31, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(31) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T00RR37_A460FasDsc[0] ;
      A459FasDec = T00RR37_A459FasDec[0] ;
      n459FasDec = T00RR37_n459FasDec[0] ;
      A469FasPreSal = T00RR37_A469FasPreSal[0] ;
      n469FasPreSal = T00RR37_n469FasPreSal[0] ;
      A468FasPrePie = T00RR37_A468FasPrePie[0] ;
      n468FasPrePie = T00RR37_n468FasPrePie[0] ;
      A472FasVelPro = T00RR37_A472FasVelPro[0] ;
      n472FasVelPro = T00RR37_n472FasVelPro[0] ;
      A464FasNumPas = T00RR37_A464FasNumPas[0] ;
      n464FasNumPas = T00RR37_n464FasNumPas[0] ;
      A456FasActTin = T00RR37_A456FasActTin[0] ;
      n456FasActTin = T00RR37_n456FasActTin[0] ;
      A458FasCon = T00RR37_A458FasCon[0] ;
      n458FasCon = T00RR37_n458FasCon[0] ;
      A4286FasForMul = T00RR37_A4286FasForMul[0] ;
      n4286FasForMul = T00RR37_n4286FasForMul[0] ;
      A4299FasConPla = T00RR37_A4299FasConPla[0] ;
      n4299FasConPla = T00RR37_n4299FasConPla[0] ;
      A602MaqCod = T00RR37_A602MaqCod[0] ;
      n602MaqCod = T00RR37_n602MaqCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A456FasActTin))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A458FasCon))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4286FasForMul))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4299FasConPla))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(31) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(31);
   }

   public void getKeyRR88( )
   {
      /* Using cursor T00RR38 */
      pr_default.execute(32, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound88 = (short)(1) ;
      }
      else
      {
         RcdFound88 = (short)(0) ;
      }
      pr_default.close(32);
   }

   public void getByPrimaryKeyRR88( )
   {
      /* Using cursor T00RR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmRR88( 5) ;
         RcdFound88 = (short)(1) ;
         initializeNonKeyRR88( ) ;
         A774ProNumLin = T00RR3_A774ProNumLin[0] ;
         A457FasCod = T00RR3_A457FasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z774ProNumLin = A774ProNumLin ;
         sMode88 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalRR88( ) ;
         loadRR88( ) ;
         Gx_mode = sMode88 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound88 = (short)(0) ;
         initializeNonKeyRR88( ) ;
         sMode88 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalRR88( ) ;
         Gx_mode = sMode88 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesRR88( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyRR88( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00RR2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z457FasCod, T00RR2_A457FasCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z457FasCod, T00RR2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("tproce3:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T00RR2_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPROLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertRR88( )
   {
      beforeValidateRR88( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableRR88( ) ;
      }
      if ( AnyError == 0 )
      {
         zmRR88( 0) ;
         checkOptimisticConcurrencyRR88( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmRR88( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertRR88( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00RR39 */
                  pr_default.execute(33, new Object[] {A758ProCod, Short.valueOf(A774ProNumLin), A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
                  if ( (pr_default.getStatus(33) == 1) )
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
            loadRR88( ) ;
         }
         endLevelRR88( ) ;
      }
      closeExtendedTableCursorsRR88( ) ;
   }

   public void updateRR88( )
   {
      beforeValidateRR88( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableRR88( ) ;
      }
      if ( ( nIsMod_88 != 0 ) || ( nIsDirty_88 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyRR88( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmRR88( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateRR88( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00RR40 */
                     pr_default.execute(34, new Object[] {A457FasCod, A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
                     if ( (pr_default.getStatus(34) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROLIN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateRR88( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyRR88( ) ;
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
            endLevelRR88( ) ;
         }
      }
      closeExtendedTableCursorsRR88( ) ;
   }

   public void deferredUpdateRR88( )
   {
   }

   public void deleteRR88( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateRR88( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyRR88( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsRR88( ) ;
         afterConfirmRR88( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteRR88( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00RR41 */
               pr_default.execute(35, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
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
      sMode88 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelRR88( ) ;
      Gx_mode = sMode88 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsRR88( )
   {
      standaloneModalRR88( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00RR42 */
         pr_default.execute(36, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T00RR42_A460FasDsc[0] ;
         A459FasDec = T00RR42_A459FasDec[0] ;
         n459FasDec = T00RR42_n459FasDec[0] ;
         A469FasPreSal = T00RR42_A469FasPreSal[0] ;
         n469FasPreSal = T00RR42_n469FasPreSal[0] ;
         A468FasPrePie = T00RR42_A468FasPrePie[0] ;
         n468FasPrePie = T00RR42_n468FasPrePie[0] ;
         A472FasVelPro = T00RR42_A472FasVelPro[0] ;
         n472FasVelPro = T00RR42_n472FasVelPro[0] ;
         A464FasNumPas = T00RR42_A464FasNumPas[0] ;
         n464FasNumPas = T00RR42_n464FasNumPas[0] ;
         A456FasActTin = T00RR42_A456FasActTin[0] ;
         n456FasActTin = T00RR42_n456FasActTin[0] ;
         A458FasCon = T00RR42_A458FasCon[0] ;
         n458FasCon = T00RR42_n458FasCon[0] ;
         A4286FasForMul = T00RR42_A4286FasForMul[0] ;
         n4286FasForMul = T00RR42_n4286FasForMul[0] ;
         A4299FasConPla = T00RR42_A4299FasConPla[0] ;
         n4299FasConPla = T00RR42_n4299FasConPla[0] ;
         A602MaqCod = T00RR42_A602MaqCod[0] ;
         n602MaqCod = T00RR42_n602MaqCod[0] ;
         pr_default.close(36);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00RR43 */
         pr_default.execute(37, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT002", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T00RR44 */
         pr_default.execute(38, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
      }
   }

   public void endLevelRR88( )
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

   public void scanStartRR88( )
   {
      /* Scan By routine */
      /* Using cursor T00RR45 */
      pr_default.execute(39, new Object[] {A396EmprCod, A758ProCod});
      RcdFound88 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound88 = (short)(1) ;
         A774ProNumLin = T00RR45_A774ProNumLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextRR88( )
   {
      /* Scan next routine */
      pr_default.readNext(39);
      RcdFound88 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound88 = (short)(1) ;
         A774ProNumLin = T00RR45_A774ProNumLin[0] ;
      }
   }

   public void scanEndRR88( )
   {
      pr_default.close(39);
   }

   public void afterConfirmRR88( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertRR88( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateRR88( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteRR88( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteRR88( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateRR88( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesRR88( )
   {
      edtProNumLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtFasDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtFasPreSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreSal_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtFasPrePie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPrePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPrePie_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtFasVelPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasVelPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasVelPro_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtFasNumPas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasNumPas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumPas_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtFasActTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtFasCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtFasForMul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasForMul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForMul_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtFasConPla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasConPla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasConPla_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void send_integrity_lvl_hashesRR88( )
   {
   }

   public void send_integrity_lvl_hashesRR87( )
   {
   }

   public void subsflControlProps_7388( )
   {
      edtProNumLin_Internalname = "PRONUMLIN_"+sGXsfl_73_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_73_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_73_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_73_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_73_idx ;
      edtFasPreSal_Internalname = "FASPRESAL_"+sGXsfl_73_idx ;
      edtFasPrePie_Internalname = "FASPREPIE_"+sGXsfl_73_idx ;
      edtFasVelPro_Internalname = "FASVELPRO_"+sGXsfl_73_idx ;
      edtFasNumPas_Internalname = "FASNUMPAS_"+sGXsfl_73_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_73_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_73_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_73_idx ;
      edtFasConPla_Internalname = "FASCONPLA_"+sGXsfl_73_idx ;
   }

   public void subsflControlProps_fel_7388( )
   {
      edtProNumLin_Internalname = "PRONUMLIN_"+sGXsfl_73_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_73_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_73_fel_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_73_fel_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_73_fel_idx ;
      edtFasPreSal_Internalname = "FASPRESAL_"+sGXsfl_73_fel_idx ;
      edtFasPrePie_Internalname = "FASPREPIE_"+sGXsfl_73_fel_idx ;
      edtFasVelPro_Internalname = "FASVELPRO_"+sGXsfl_73_fel_idx ;
      edtFasNumPas_Internalname = "FASNUMPAS_"+sGXsfl_73_fel_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_73_fel_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_73_fel_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_73_fel_idx ;
      edtFasConPla_Internalname = "FASCONPLA_"+sGXsfl_73_fel_idx ;
   }

   public void addRowRR88( )
   {
      nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_7388( ) ;
      sendRowRR88( ) ;
   }

   public void sendRowRR88( )
   {
      Gridtproce3_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtproce3_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtproce3_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtproce3_level1item_Class, "") != 0 )
         {
            subGridtproce3_level1item_Linesclass = subGridtproce3_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtproce3_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtproce3_level1item_Backstyle = (byte)(0) ;
         subGridtproce3_level1item_Backcolor = subGridtproce3_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtproce3_level1item_Class, "") != 0 )
         {
            subGridtproce3_level1item_Linesclass = subGridtproce3_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtproce3_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtproce3_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtproce3_level1item_Class, "") != 0 )
         {
            subGridtproce3_level1item_Linesclass = subGridtproce3_level1item_Class+"Odd" ;
         }
         subGridtproce3_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtproce3_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtproce3_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_73_idx) % (2))) == 0 )
         {
            subGridtproce3_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtproce3_level1item_Class, "") != 0 )
            {
               subGridtproce3_level1item_Linesclass = subGridtproce3_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtproce3_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtproce3_level1item_Class, "") != 0 )
            {
               subGridtproce3_level1item_Linesclass = subGridtproce3_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_88_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtproce3_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProNumLin_Internalname,GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A774ProNumLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProNumLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProNumLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_88_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtproce3_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtproce3_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtproce3_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtproce3_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDec_Internalname,GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasDec_Enabled!=0) ? localUtil.format( A459FasDec, "ZZ9.9") : localUtil.format( A459FasDec, "ZZ9.9"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtproce3_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreSal_Internalname,GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreSal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasPreSal_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtproce3_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPrePie_Internalname,GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPrePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPrePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasPrePie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtproce3_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasVelPro_Internalname,GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasVelPro_Enabled!=0) ? localUtil.format( A472FasVelPro, "ZZ9.9") : localUtil.format( A472FasVelPro, "ZZ9.9"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasVelPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasVelPro_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtproce3_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasNumPas_Internalname,GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasNumPas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasNumPas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasNumPas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtproce3_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasActTin_Internalname,GXutil.rtrim( A456FasActTin),GXutil.rtrim( localUtil.format( A456FasActTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasActTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasActTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtproce3_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCon_Internalname,GXutil.rtrim( A458FasCon),GXutil.rtrim( localUtil.format( A458FasCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtproce3_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasForMul_Internalname,GXutil.rtrim( A4286FasForMul),GXutil.rtrim( localUtil.format( A4286FasForMul, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasForMul_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasForMul_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtproce3_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasConPla_Internalname,GXutil.rtrim( A4299FasConPla),GXutil.rtrim( localUtil.format( A4299FasConPla, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasConPla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasConPla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridtproce3_level1itemRow);
      send_integrity_lvl_hashesRR88( ) ;
      GXCCtl = "Z774ProNumLin_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z457FasCod_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "nRcdDeleted_88_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_88_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_88_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRONUMLIN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProNumLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDEC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPRESAL_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREPIE_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASVELPRO_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASNUMPAS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACTTIN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCON_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFORMUL_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCONPLA_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasConPla_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtproce3_level1itemContainer.AddRow(Gridtproce3_level1itemRow);
   }

   public void readRowRR88( )
   {
      nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_7388( ) ;
      edtProNumLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRONUMLIN_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDEC_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreSal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPRESAL_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPrePie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREPIE_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasVelPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASVELPRO_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasNumPas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASNUMPAS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCON_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasForMul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFORMUL_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasConPla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCONPLA_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PRONUMLIN_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProNumLin_Internalname ;
         wbErr = true ;
         A774ProNumLin = (short)(0) ;
      }
      else
      {
         A774ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
      A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
      n602MaqCod = false ;
      A459FasDec = localUtil.ctond( httpContext.cgiGet( edtFasDec_Internalname)) ;
      n459FasDec = false ;
      A469FasPreSal = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPreSal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n469FasPreSal = false ;
      A468FasPrePie = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPrePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n468FasPrePie = false ;
      A472FasVelPro = localUtil.ctond( httpContext.cgiGet( edtFasVelPro_Internalname)) ;
      n472FasVelPro = false ;
      A464FasNumPas = (short)(localUtil.ctol( httpContext.cgiGet( edtFasNumPas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n464FasNumPas = false ;
      A456FasActTin = GXutil.upper( httpContext.cgiGet( edtFasActTin_Internalname)) ;
      n456FasActTin = false ;
      A458FasCon = GXutil.upper( httpContext.cgiGet( edtFasCon_Internalname)) ;
      n458FasCon = false ;
      A4286FasForMul = GXutil.upper( httpContext.cgiGet( edtFasForMul_Internalname)) ;
      n4286FasForMul = false ;
      A4299FasConPla = GXutil.upper( httpContext.cgiGet( edtFasConPla_Internalname)) ;
      n4299FasConPla = false ;
      GXCCtl = "Z774ProNumLin_" + sGXsfl_73_idx ;
      Z774ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_73_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_88_" + sGXsfl_73_idx ;
      nRcdDeleted_88 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_88_" + sGXsfl_73_idx ;
      nRcdExists_88 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_88_" + sGXsfl_73_idx ;
      nIsMod_88 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtProNumLin_Enabled = edtProNumLin_Enabled ;
   }

   public void confirmValuesRR0( )
   {
      nGXsfl_73_idx = 0 ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_7388( ) ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_7388( ) ;
         httpContext.changePostValue( "Z774ProNumLin_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z774ProNumLin_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z774ProNumLin_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_73_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tproce3", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4628ProDsc2", GXutil.rtrim( Z4628ProDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5289ProProvi", GXutil.rtrim( Z5289ProProvi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z775ProUltLin", GXutil.ltrim( localUtil.ntoc( Z775ProUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_73", GXutil.ltrim( localUtil.ntoc( nGXsfl_73_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMAXLIN", GXutil.ltrim( localUtil.ntoc( A13687ProMaxLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tproce3", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPROCE3" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Procesos con notas de observ.", "") ;
   }

   public void initializeNonKeyRR87( )
   {
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A4628ProDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
      A5289ProProvi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", A5289ProProvi);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A775ProUltLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
      A13687ProMaxLin = (short)(0) ;
      n13687ProMaxLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
      Z759ProDsc = "" ;
      Z4628ProDsc2 = "" ;
      Z5289ProProvi = "" ;
      Z775ProUltLin = (short)(0) ;
   }

   public void initAllRR87( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      initializeNonKeyRR87( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyRR88( )
   {
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A602MaqCod = "" ;
      n602MaqCod = false ;
      A459FasDec = DecimalUtil.ZERO ;
      n459FasDec = false ;
      A469FasPreSal = (short)(0) ;
      n469FasPreSal = false ;
      A468FasPrePie = (short)(0) ;
      n468FasPrePie = false ;
      A472FasVelPro = DecimalUtil.ZERO ;
      n472FasVelPro = false ;
      A464FasNumPas = (short)(0) ;
      n464FasNumPas = false ;
      A456FasActTin = "" ;
      n456FasActTin = false ;
      A458FasCon = "" ;
      n458FasCon = false ;
      A4286FasForMul = "" ;
      n4286FasForMul = false ;
      A4299FasConPla = "" ;
      n4299FasConPla = false ;
      Z457FasCod = "" ;
   }

   public void initAllRR88( )
   {
      A774ProNumLin = (short)(0) ;
      initializeNonKeyRR88( ) ;
   }

   public void standaloneModalInsertRR88( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241524443", true, true);
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
      httpContext.AddJavascriptSource("tproce3.js", "?20268241524444", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties88( )
   {
      edtProNumLin_Enabled = defedtProNumLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void startgridcontrol73( )
   {
      Gridtproce3_level1itemContainer.AddObjectProperty("GridName", "Gridtproce3_level1item");
      Gridtproce3_level1itemContainer.AddObjectProperty("Header", subGridtproce3_level1item_Header);
      Gridtproce3_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtproce3_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtproce3_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtproce3_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtproce3_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtproce3_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), ".", "")));
      Gridtproce3_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProNumLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddColumnProperties(Gridtproce3_level1itemColumn);
      Gridtproce3_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtproce3_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Gridtproce3_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddColumnProperties(Gridtproce3_level1itemColumn);
      Gridtproce3_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtproce3_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Gridtproce3_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddColumnProperties(Gridtproce3_level1itemColumn);
      Gridtproce3_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtproce3_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
      Gridtproce3_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddColumnProperties(Gridtproce3_level1itemColumn);
      Gridtproce3_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtproce3_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      Gridtproce3_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddColumnProperties(Gridtproce3_level1itemColumn);
      Gridtproce3_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtproce3_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
      Gridtproce3_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddColumnProperties(Gridtproce3_level1itemColumn);
      Gridtproce3_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtproce3_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
      Gridtproce3_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddColumnProperties(Gridtproce3_level1itemColumn);
      Gridtproce3_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtproce3_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
      Gridtproce3_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddColumnProperties(Gridtproce3_level1itemColumn);
      Gridtproce3_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtproce3_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
      Gridtproce3_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddColumnProperties(Gridtproce3_level1itemColumn);
      Gridtproce3_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtproce3_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A456FasActTin));
      Gridtproce3_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddColumnProperties(Gridtproce3_level1itemColumn);
      Gridtproce3_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtproce3_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A458FasCon));
      Gridtproce3_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddColumnProperties(Gridtproce3_level1itemColumn);
      Gridtproce3_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtproce3_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A4286FasForMul));
      Gridtproce3_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddColumnProperties(Gridtproce3_level1itemColumn);
      Gridtproce3_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtproce3_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A4299FasConPla));
      Gridtproce3_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasConPla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddColumnProperties(Gridtproce3_level1itemColumn);
      Gridtproce3_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtproce3_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtproce3_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtproce3_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtproce3_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtproce3_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtproce3_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtproce3_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtproce3_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtProDsc2_Internalname = "PRODSC2" ;
      chkProProvi.setInternalname( "PROPROVI" );
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtProUltLin_Internalname = "PROULTLIN" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtProNumLin_Internalname = "PRONUMLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtFasDec_Internalname = "FASDEC" ;
      edtFasPreSal_Internalname = "FASPRESAL" ;
      edtFasPrePie_Internalname = "FASPREPIE" ;
      edtFasVelPro_Internalname = "FASVELPRO" ;
      edtFasNumPas_Internalname = "FASNUMPAS" ;
      edtFasActTin_Internalname = "FASACTTIN" ;
      edtFasCon_Internalname = "FASCON" ;
      edtFasForMul_Internalname = "FASFORMUL" ;
      edtFasConPla_Internalname = "FASCONPLA" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtproce3_level1item_Internalname = "GRIDTPROCE3_LEVEL1ITEM" ;
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
      subGridtproce3_level1item_Allowcollapsing = (byte)(0) ;
      subGridtproce3_level1item_Allowselection = (byte)(0) ;
      subGridtproce3_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Procesos con notas de observ.", "") );
      edtFasConPla_Jsonclick = "" ;
      edtFasForMul_Jsonclick = "" ;
      edtFasCon_Jsonclick = "" ;
      edtFasActTin_Jsonclick = "" ;
      edtFasNumPas_Jsonclick = "" ;
      edtFasVelPro_Jsonclick = "" ;
      edtFasPrePie_Jsonclick = "" ;
      edtFasPreSal_Jsonclick = "" ;
      edtFasDec_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtProNumLin_Jsonclick = "" ;
      subGridtproce3_level1item_Class = "Grid" ;
      subGridtproce3_level1item_Backcolorstyle = (byte)(0) ;
      edtFasConPla_Enabled = 0 ;
      edtFasForMul_Enabled = 0 ;
      edtFasCon_Enabled = 0 ;
      edtFasActTin_Enabled = 0 ;
      edtFasNumPas_Enabled = 0 ;
      edtFasVelPro_Enabled = 0 ;
      edtFasPrePie_Enabled = 0 ;
      edtFasPreSal_Enabled = 0 ;
      edtFasDec_Enabled = 0 ;
      edtMaqCod_Enabled = 0 ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtProNumLin_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtProUltLin_Jsonclick = "" ;
      edtProUltLin_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      chkProProvi.setEnabled( 1 );
      edtProDsc2_Jsonclick = "" ;
      edtProDsc2_Enabled = 1 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 1 ;
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

   public void gxnrgridtproce3_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_7388( ) ;
      while ( nGXsfl_73_idx <= nRC_GXsfl_73 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalRR88( ) ;
         standaloneModalRR88( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowRR88( ) ;
         nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_7388( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtproce3_level1itemContainer)) ;
      /* End function gxnrGridtproce3_level1item_newrow */
   }

   public void init_web_controls( )
   {
      chkProProvi.setName( "PROPROVI" );
      chkProProvi.setWebtags( "" );
      chkProProvi.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkProProvi.getInternalname(), "TitleCaption", chkProProvi.getCaption(), true);
      chkProProvi.setCheckedValue( "N" );
      A5289ProProvi = ((GXutil.strcmp(GXutil.rtrim( A5289ProProvi), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", A5289ProProvi);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00RR21 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00RR21_A407EmprNom[0] ;
      n407EmprNom = T00RR21_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(16);
      /* Using cursor T00RR23 */
      pr_default.execute(17, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A13687ProMaxLin = T00RR23_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T00RR23_n13687ProMaxLin[0] ;
      }
      else
      {
         A13687ProMaxLin = (short)(0) ;
         n13687ProMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
      }
      pr_default.close(17);
      GX_FocusControl = edtProDsc_Internalname ;
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
      /* Using cursor T00RR21 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00RR21_A407EmprNom[0] ;
      n407EmprNom = T00RR21_n407EmprNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Procod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T00RR23 */
      pr_default.execute(17, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A13687ProMaxLin = T00RR23_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T00RR23_n13687ProMaxLin[0] ;
      }
      else
      {
         A13687ProMaxLin = (short)(0) ;
         n13687ProMaxLin = false ;
      }
      pr_default.close(17);
      dynload_actions( ) ;
      A5289ProProvi = ((GXutil.strcmp(GXutil.rtrim( A5289ProProvi), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", GXutil.rtrim( A4628ProDsc2));
      httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", GXutil.rtrim( A5289ProProvi));
      httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrim( localUtil.ntoc( A775ProUltLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrim( localUtil.ntoc( A13687ProMaxLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4628ProDsc2", GXutil.rtrim( Z4628ProDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5289ProProvi", GXutil.rtrim( Z5289ProProvi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z775ProUltLin", GXutil.ltrim( localUtil.ntoc( Z775ProUltLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13687ProMaxLin", GXutil.ltrim( localUtil.ntoc( Z13687ProMaxLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      n459FasDec = false ;
      n469FasPreSal = false ;
      n468FasPrePie = false ;
      n472FasVelPro = false ;
      n464FasNumPas = false ;
      n456FasActTin = false ;
      n458FasCon = false ;
      n4286FasForMul = false ;
      n4299FasConPla = false ;
      n602MaqCod = false ;
      /* Using cursor T00RR42 */
      pr_default.execute(36, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T00RR42_A460FasDsc[0] ;
      A459FasDec = T00RR42_A459FasDec[0] ;
      n459FasDec = T00RR42_n459FasDec[0] ;
      A469FasPreSal = T00RR42_A469FasPreSal[0] ;
      n469FasPreSal = T00RR42_n469FasPreSal[0] ;
      A468FasPrePie = T00RR42_A468FasPrePie[0] ;
      n468FasPrePie = T00RR42_n468FasPrePie[0] ;
      A472FasVelPro = T00RR42_A472FasVelPro[0] ;
      n472FasVelPro = T00RR42_n472FasVelPro[0] ;
      A464FasNumPas = T00RR42_A464FasNumPas[0] ;
      n464FasNumPas = T00RR42_n464FasNumPas[0] ;
      A456FasActTin = T00RR42_A456FasActTin[0] ;
      n456FasActTin = T00RR42_n456FasActTin[0] ;
      A458FasCon = T00RR42_A458FasCon[0] ;
      n458FasCon = T00RR42_n458FasCon[0] ;
      A4286FasForMul = T00RR42_A4286FasForMul[0] ;
      n4286FasForMul = T00RR42_n4286FasForMul[0] ;
      A4299FasConPla = T00RR42_A4299FasConPla[0] ;
      n4299FasConPla = T00RR42_n4299FasConPla[0] ;
      A602MaqCod = T00RR42_A602MaqCod[0] ;
      n602MaqCod = T00RR42_n602MaqCod[0] ;
      pr_default.close(36);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", GXutil.rtrim( A456FasActTin));
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", GXutil.rtrim( A458FasCon));
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", GXutil.rtrim( A4286FasForMul));
      httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", GXutil.rtrim( A4299FasConPla));
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", GXutil.rtrim( A602MaqCod));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A4628ProDsc2',fld:'PRODSC2',pic:''},{av:'A775ProUltLin',fld:'PROULTLIN',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13687ProMaxLin',fld:'PROMAXLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z758ProCod'},{av:'Z759ProDsc'},{av:'Z4628ProDsc2'},{av:'Z5289ProProvi'},{av:'Z775ProUltLin'},{av:'Z407EmprNom'},{av:'Z13687ProMaxLin'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]}");
      setEventMetadata("VALID_PROPROVI","{handler:'valid_Proprovi',iparms:[{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]");
      setEventMetadata("VALID_PROPROVI",",oparms:[{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]}");
      setEventMetadata("VALID_PRONUMLIN","{handler:'valid_Pronumlin',iparms:[{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]");
      setEventMetadata("VALID_PRONUMLIN",",oparms:[{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A4299FasConPla',fld:'FASCONPLA',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A4299FasConPla',fld:'FASCONPLA',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]}");
      setEventMetadata("NULL","{handler:'valid_Fasconpla',iparms:[{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]");
      setEventMetadata("NULL",",oparms:[{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]}");
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
      pr_default.close(36);
      pr_default.close(16);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z759ProDsc = "" ;
      Z4628ProDsc2 = "" ;
      Z5289ProProvi = "" ;
      Z457FasCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A5289ProProvi = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A759ProDsc = "" ;
      A4628ProDsc2 = "" ;
      A407EmprNom = "" ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtproce3_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode88 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A460FasDsc = "" ;
      A602MaqCod = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4286FasForMul = "" ;
      A4299FasConPla = "" ;
      T00RR6_A13687ProMaxLin = new short[1] ;
      T00RR6_n13687ProMaxLin = new boolean[] {false} ;
      Z407EmprNom = "" ;
      T00RR11_A758ProCod = new String[] {""} ;
      T00RR11_A759ProDsc = new String[] {""} ;
      T00RR11_A4628ProDsc2 = new String[] {""} ;
      T00RR11_A5289ProProvi = new String[] {""} ;
      T00RR11_A407EmprNom = new String[] {""} ;
      T00RR11_n407EmprNom = new boolean[] {false} ;
      T00RR11_A775ProUltLin = new short[1] ;
      T00RR11_A396EmprCod = new String[] {""} ;
      T00RR11_A13687ProMaxLin = new short[1] ;
      T00RR11_n13687ProMaxLin = new boolean[] {false} ;
      T00RR9_A407EmprNom = new String[] {""} ;
      T00RR9_n407EmprNom = new boolean[] {false} ;
      T00RR12_A407EmprNom = new String[] {""} ;
      T00RR12_n407EmprNom = new boolean[] {false} ;
      T00RR14_A13687ProMaxLin = new short[1] ;
      T00RR14_n13687ProMaxLin = new boolean[] {false} ;
      T00RR15_A396EmprCod = new String[] {""} ;
      T00RR15_A758ProCod = new String[] {""} ;
      T00RR8_A758ProCod = new String[] {""} ;
      T00RR8_A759ProDsc = new String[] {""} ;
      T00RR8_A4628ProDsc2 = new String[] {""} ;
      T00RR8_A5289ProProvi = new String[] {""} ;
      T00RR8_A775ProUltLin = new short[1] ;
      T00RR8_A396EmprCod = new String[] {""} ;
      sMode87 = "" ;
      T00RR16_A396EmprCod = new String[] {""} ;
      T00RR16_A758ProCod = new String[] {""} ;
      T00RR17_A396EmprCod = new String[] {""} ;
      T00RR17_A758ProCod = new String[] {""} ;
      T00RR7_A758ProCod = new String[] {""} ;
      T00RR7_A759ProDsc = new String[] {""} ;
      T00RR7_A4628ProDsc2 = new String[] {""} ;
      T00RR7_A5289ProProvi = new String[] {""} ;
      T00RR7_A775ProUltLin = new short[1] ;
      T00RR7_A396EmprCod = new String[] {""} ;
      T00RR21_A407EmprNom = new String[] {""} ;
      T00RR21_n407EmprNom = new boolean[] {false} ;
      T00RR23_A13687ProMaxLin = new short[1] ;
      T00RR23_n13687ProMaxLin = new boolean[] {false} ;
      T00RR24_A396EmprCod = new String[] {""} ;
      T00RR24_A13026PedDGId = new int[1] ;
      T00RR24_A758ProCod = new String[] {""} ;
      T00RR25_A396EmprCod = new String[] {""} ;
      T00RR25_A12851ProCodID = new String[] {""} ;
      T00RR25_A758ProCod = new String[] {""} ;
      T00RR26_A396EmprCod = new String[] {""} ;
      T00RR26_A252CliCod = new int[1] ;
      T00RR26_A4589FFProCod = new String[] {""} ;
      T00RR27_A396EmprCod = new String[] {""} ;
      T00RR27_A252CliCod = new int[1] ;
      T00RR27_A10839Txt_Cor = new String[] {""} ;
      T00RR27_A758ProCod = new String[] {""} ;
      T00RR28_A396EmprCod = new String[] {""} ;
      T00RR28_A2248ManCod = new short[1] ;
      T00RR28_A5835ManFasCod = new String[] {""} ;
      T00RR28_A758ProCod = new String[] {""} ;
      T00RR29_A396EmprCod = new String[] {""} ;
      T00RR29_A7843Int_Num = new int[1] ;
      T00RR29_A758ProCod = new String[] {""} ;
      T00RR30_A396EmprCod = new String[] {""} ;
      T00RR30_A4618EnsLCod = new int[1] ;
      T00RR30_A758ProCod = new String[] {""} ;
      T00RR31_A396EmprCod = new String[] {""} ;
      T00RR31_A758ProCod = new String[] {""} ;
      T00RR31_A774ProNumLin = new short[1] ;
      T00RR31_A6438ProFsaL = new short[1] ;
      T00RR32_A396EmprCod = new String[] {""} ;
      T00RR32_A361DisCod = new int[1] ;
      T00RR32_A758ProCod = new String[] {""} ;
      T00RR33_A396EmprCod = new String[] {""} ;
      T00RR33_A129BarCod = new int[1] ;
      T00RR33_A132BarCodReo = new byte[1] ;
      T00RR33_A130BarCodPar = new String[] {""} ;
      T00RR33_A758ProCod = new String[] {""} ;
      T00RR34_A396EmprCod = new String[] {""} ;
      T00RR34_A252CliCod = new int[1] ;
      T00RR34_A65ArtCod = new String[] {""} ;
      T00RR34_A758ProCod = new String[] {""} ;
      T00RR35_A396EmprCod = new String[] {""} ;
      T00RR35_A758ProCod = new String[] {""} ;
      Z460FasDsc = "" ;
      Z459FasDec = DecimalUtil.ZERO ;
      Z472FasVelPro = DecimalUtil.ZERO ;
      Z456FasActTin = "" ;
      Z458FasCon = "" ;
      Z4286FasForMul = "" ;
      Z4299FasConPla = "" ;
      Z602MaqCod = "" ;
      T00RR36_A758ProCod = new String[] {""} ;
      T00RR36_A774ProNumLin = new short[1] ;
      T00RR36_A460FasDsc = new String[] {""} ;
      T00RR36_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RR36_n459FasDec = new boolean[] {false} ;
      T00RR36_A469FasPreSal = new short[1] ;
      T00RR36_n469FasPreSal = new boolean[] {false} ;
      T00RR36_A468FasPrePie = new short[1] ;
      T00RR36_n468FasPrePie = new boolean[] {false} ;
      T00RR36_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RR36_n472FasVelPro = new boolean[] {false} ;
      T00RR36_A464FasNumPas = new short[1] ;
      T00RR36_n464FasNumPas = new boolean[] {false} ;
      T00RR36_A456FasActTin = new String[] {""} ;
      T00RR36_n456FasActTin = new boolean[] {false} ;
      T00RR36_A458FasCon = new String[] {""} ;
      T00RR36_n458FasCon = new boolean[] {false} ;
      T00RR36_A4286FasForMul = new String[] {""} ;
      T00RR36_n4286FasForMul = new boolean[] {false} ;
      T00RR36_A4299FasConPla = new String[] {""} ;
      T00RR36_n4299FasConPla = new boolean[] {false} ;
      T00RR36_A396EmprCod = new String[] {""} ;
      T00RR36_A457FasCod = new String[] {""} ;
      T00RR36_A602MaqCod = new String[] {""} ;
      T00RR36_n602MaqCod = new boolean[] {false} ;
      T00RR4_A460FasDsc = new String[] {""} ;
      T00RR4_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RR4_n459FasDec = new boolean[] {false} ;
      T00RR4_A469FasPreSal = new short[1] ;
      T00RR4_n469FasPreSal = new boolean[] {false} ;
      T00RR4_A468FasPrePie = new short[1] ;
      T00RR4_n468FasPrePie = new boolean[] {false} ;
      T00RR4_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RR4_n472FasVelPro = new boolean[] {false} ;
      T00RR4_A464FasNumPas = new short[1] ;
      T00RR4_n464FasNumPas = new boolean[] {false} ;
      T00RR4_A456FasActTin = new String[] {""} ;
      T00RR4_n456FasActTin = new boolean[] {false} ;
      T00RR4_A458FasCon = new String[] {""} ;
      T00RR4_n458FasCon = new boolean[] {false} ;
      T00RR4_A4286FasForMul = new String[] {""} ;
      T00RR4_n4286FasForMul = new boolean[] {false} ;
      T00RR4_A4299FasConPla = new String[] {""} ;
      T00RR4_n4299FasConPla = new boolean[] {false} ;
      T00RR4_A602MaqCod = new String[] {""} ;
      T00RR4_n602MaqCod = new boolean[] {false} ;
      T00RR37_A460FasDsc = new String[] {""} ;
      T00RR37_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RR37_n459FasDec = new boolean[] {false} ;
      T00RR37_A469FasPreSal = new short[1] ;
      T00RR37_n469FasPreSal = new boolean[] {false} ;
      T00RR37_A468FasPrePie = new short[1] ;
      T00RR37_n468FasPrePie = new boolean[] {false} ;
      T00RR37_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RR37_n472FasVelPro = new boolean[] {false} ;
      T00RR37_A464FasNumPas = new short[1] ;
      T00RR37_n464FasNumPas = new boolean[] {false} ;
      T00RR37_A456FasActTin = new String[] {""} ;
      T00RR37_n456FasActTin = new boolean[] {false} ;
      T00RR37_A458FasCon = new String[] {""} ;
      T00RR37_n458FasCon = new boolean[] {false} ;
      T00RR37_A4286FasForMul = new String[] {""} ;
      T00RR37_n4286FasForMul = new boolean[] {false} ;
      T00RR37_A4299FasConPla = new String[] {""} ;
      T00RR37_n4299FasConPla = new boolean[] {false} ;
      T00RR37_A602MaqCod = new String[] {""} ;
      T00RR37_n602MaqCod = new boolean[] {false} ;
      T00RR38_A396EmprCod = new String[] {""} ;
      T00RR38_A758ProCod = new String[] {""} ;
      T00RR38_A774ProNumLin = new short[1] ;
      T00RR3_A758ProCod = new String[] {""} ;
      T00RR3_A774ProNumLin = new short[1] ;
      T00RR3_A396EmprCod = new String[] {""} ;
      T00RR3_A457FasCod = new String[] {""} ;
      T00RR2_A758ProCod = new String[] {""} ;
      T00RR2_A774ProNumLin = new short[1] ;
      T00RR2_A396EmprCod = new String[] {""} ;
      T00RR2_A457FasCod = new String[] {""} ;
      T00RR42_A460FasDsc = new String[] {""} ;
      T00RR42_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RR42_n459FasDec = new boolean[] {false} ;
      T00RR42_A469FasPreSal = new short[1] ;
      T00RR42_n469FasPreSal = new boolean[] {false} ;
      T00RR42_A468FasPrePie = new short[1] ;
      T00RR42_n468FasPrePie = new boolean[] {false} ;
      T00RR42_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RR42_n472FasVelPro = new boolean[] {false} ;
      T00RR42_A464FasNumPas = new short[1] ;
      T00RR42_n464FasNumPas = new boolean[] {false} ;
      T00RR42_A456FasActTin = new String[] {""} ;
      T00RR42_n456FasActTin = new boolean[] {false} ;
      T00RR42_A458FasCon = new String[] {""} ;
      T00RR42_n458FasCon = new boolean[] {false} ;
      T00RR42_A4286FasForMul = new String[] {""} ;
      T00RR42_n4286FasForMul = new boolean[] {false} ;
      T00RR42_A4299FasConPla = new String[] {""} ;
      T00RR42_n4299FasConPla = new boolean[] {false} ;
      T00RR42_A602MaqCod = new String[] {""} ;
      T00RR42_n602MaqCod = new boolean[] {false} ;
      T00RR43_A396EmprCod = new String[] {""} ;
      T00RR43_A758ProCod = new String[] {""} ;
      T00RR43_A774ProNumLin = new short[1] ;
      T00RR43_A7897Dtp_Ordl = new short[1] ;
      T00RR44_A396EmprCod = new String[] {""} ;
      T00RR44_A758ProCod = new String[] {""} ;
      T00RR44_A774ProNumLin = new short[1] ;
      T00RR44_A6438ProFsaL = new short[1] ;
      T00RR45_A396EmprCod = new String[] {""} ;
      T00RR45_A758ProCod = new String[] {""} ;
      T00RR45_A774ProNumLin = new short[1] ;
      Gridtproce3_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtproce3_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtproce3_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ758ProCod = "" ;
      ZZ759ProDsc = "" ;
      ZZ4628ProDsc2 = "" ;
      ZZ5289ProProvi = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tproce3__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tproce3__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tproce3__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tproce3__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tproce3__default(),
         new Object[] {
             new Object[] {
            T00RR2_A758ProCod, T00RR2_A774ProNumLin, T00RR2_A396EmprCod, T00RR2_A457FasCod
            }
            , new Object[] {
            T00RR3_A758ProCod, T00RR3_A774ProNumLin, T00RR3_A396EmprCod, T00RR3_A457FasCod
            }
            , new Object[] {
            T00RR4_A460FasDsc, T00RR4_A459FasDec, T00RR4_n459FasDec, T00RR4_A469FasPreSal, T00RR4_n469FasPreSal, T00RR4_A468FasPrePie, T00RR4_n468FasPrePie, T00RR4_A472FasVelPro, T00RR4_n472FasVelPro, T00RR4_A464FasNumPas,
            T00RR4_n464FasNumPas, T00RR4_A456FasActTin, T00RR4_n456FasActTin, T00RR4_A458FasCon, T00RR4_n458FasCon, T00RR4_A4286FasForMul, T00RR4_n4286FasForMul, T00RR4_A4299FasConPla, T00RR4_n4299FasConPla, T00RR4_A602MaqCod,
            T00RR4_n602MaqCod
            }
            , new Object[] {
            T00RR6_A13687ProMaxLin, T00RR6_n13687ProMaxLin
            }
            , new Object[] {
            T00RR7_A758ProCod, T00RR7_A759ProDsc, T00RR7_A4628ProDsc2, T00RR7_A5289ProProvi, T00RR7_A775ProUltLin, T00RR7_A396EmprCod
            }
            , new Object[] {
            T00RR8_A758ProCod, T00RR8_A759ProDsc, T00RR8_A4628ProDsc2, T00RR8_A5289ProProvi, T00RR8_A775ProUltLin, T00RR8_A396EmprCod
            }
            , new Object[] {
            T00RR9_A407EmprNom, T00RR9_n407EmprNom
            }
            , new Object[] {
            T00RR11_A758ProCod, T00RR11_A759ProDsc, T00RR11_A4628ProDsc2, T00RR11_A5289ProProvi, T00RR11_A407EmprNom, T00RR11_n407EmprNom, T00RR11_A775ProUltLin, T00RR11_A396EmprCod, T00RR11_A13687ProMaxLin, T00RR11_n13687ProMaxLin
            }
            , new Object[] {
            T00RR12_A407EmprNom, T00RR12_n407EmprNom
            }
            , new Object[] {
            T00RR14_A13687ProMaxLin, T00RR14_n13687ProMaxLin
            }
            , new Object[] {
            T00RR15_A396EmprCod, T00RR15_A758ProCod
            }
            , new Object[] {
            T00RR16_A396EmprCod, T00RR16_A758ProCod
            }
            , new Object[] {
            T00RR17_A396EmprCod, T00RR17_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00RR21_A407EmprNom, T00RR21_n407EmprNom
            }
            , new Object[] {
            T00RR23_A13687ProMaxLin, T00RR23_n13687ProMaxLin
            }
            , new Object[] {
            T00RR24_A396EmprCod, T00RR24_A13026PedDGId, T00RR24_A758ProCod
            }
            , new Object[] {
            T00RR25_A396EmprCod, T00RR25_A12851ProCodID, T00RR25_A758ProCod
            }
            , new Object[] {
            T00RR26_A396EmprCod, T00RR26_A252CliCod, T00RR26_A4589FFProCod
            }
            , new Object[] {
            T00RR27_A396EmprCod, T00RR27_A252CliCod, T00RR27_A10839Txt_Cor, T00RR27_A758ProCod
            }
            , new Object[] {
            T00RR28_A396EmprCod, T00RR28_A2248ManCod, T00RR28_A5835ManFasCod, T00RR28_A758ProCod
            }
            , new Object[] {
            T00RR29_A396EmprCod, T00RR29_A7843Int_Num, T00RR29_A758ProCod
            }
            , new Object[] {
            T00RR30_A396EmprCod, T00RR30_A4618EnsLCod, T00RR30_A758ProCod
            }
            , new Object[] {
            T00RR31_A396EmprCod, T00RR31_A758ProCod, T00RR31_A774ProNumLin, T00RR31_A6438ProFsaL
            }
            , new Object[] {
            T00RR32_A396EmprCod, T00RR32_A361DisCod, T00RR32_A758ProCod
            }
            , new Object[] {
            T00RR33_A396EmprCod, T00RR33_A129BarCod, T00RR33_A132BarCodReo, T00RR33_A130BarCodPar, T00RR33_A758ProCod
            }
            , new Object[] {
            T00RR34_A396EmprCod, T00RR34_A252CliCod, T00RR34_A65ArtCod, T00RR34_A758ProCod
            }
            , new Object[] {
            T00RR35_A396EmprCod, T00RR35_A758ProCod
            }
            , new Object[] {
            T00RR36_A758ProCod, T00RR36_A774ProNumLin, T00RR36_A460FasDsc, T00RR36_A459FasDec, T00RR36_n459FasDec, T00RR36_A469FasPreSal, T00RR36_n469FasPreSal, T00RR36_A468FasPrePie, T00RR36_n468FasPrePie, T00RR36_A472FasVelPro,
            T00RR36_n472FasVelPro, T00RR36_A464FasNumPas, T00RR36_n464FasNumPas, T00RR36_A456FasActTin, T00RR36_n456FasActTin, T00RR36_A458FasCon, T00RR36_n458FasCon, T00RR36_A4286FasForMul, T00RR36_n4286FasForMul, T00RR36_A4299FasConPla,
            T00RR36_n4299FasConPla, T00RR36_A396EmprCod, T00RR36_A457FasCod, T00RR36_A602MaqCod, T00RR36_n602MaqCod
            }
            , new Object[] {
            T00RR37_A460FasDsc, T00RR37_A459FasDec, T00RR37_n459FasDec, T00RR37_A469FasPreSal, T00RR37_n469FasPreSal, T00RR37_A468FasPrePie, T00RR37_n468FasPrePie, T00RR37_A472FasVelPro, T00RR37_n472FasVelPro, T00RR37_A464FasNumPas,
            T00RR37_n464FasNumPas, T00RR37_A456FasActTin, T00RR37_n456FasActTin, T00RR37_A458FasCon, T00RR37_n458FasCon, T00RR37_A4286FasForMul, T00RR37_n4286FasForMul, T00RR37_A4299FasConPla, T00RR37_n4299FasConPla, T00RR37_A602MaqCod,
            T00RR37_n602MaqCod
            }
            , new Object[] {
            T00RR38_A396EmprCod, T00RR38_A758ProCod, T00RR38_A774ProNumLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00RR42_A460FasDsc, T00RR42_A459FasDec, T00RR42_n459FasDec, T00RR42_A469FasPreSal, T00RR42_n469FasPreSal, T00RR42_A468FasPrePie, T00RR42_n468FasPrePie, T00RR42_A472FasVelPro, T00RR42_n472FasVelPro, T00RR42_A464FasNumPas,
            T00RR42_n464FasNumPas, T00RR42_A456FasActTin, T00RR42_n456FasActTin, T00RR42_A458FasCon, T00RR42_n458FasCon, T00RR42_A4286FasForMul, T00RR42_n4286FasForMul, T00RR42_A4299FasConPla, T00RR42_n4299FasConPla, T00RR42_A602MaqCod,
            T00RR42_n602MaqCod
            }
            , new Object[] {
            T00RR43_A396EmprCod, T00RR43_A758ProCod, T00RR43_A774ProNumLin, T00RR43_A7897Dtp_Ordl
            }
            , new Object[] {
            T00RR44_A396EmprCod, T00RR44_A758ProCod, T00RR44_A774ProNumLin, T00RR44_A6438ProFsaL
            }
            , new Object[] {
            T00RR45_A396EmprCod, T00RR45_A758ProCod, T00RR45_A774ProNumLin
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridtproce3_level1item_Backcolorstyle ;
   private byte subGridtproce3_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtproce3_level1item_Allowselection ;
   private byte subGridtproce3_level1item_Allowhovering ;
   private byte subGridtproce3_level1item_Allowcollapsing ;
   private byte subGridtproce3_level1item_Collapsed ;
   private short Z775ProUltLin ;
   private short Z774ProNumLin ;
   private short nRcdDeleted_88 ;
   private short nRcdExists_88 ;
   private short nIsMod_88 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A775ProUltLin ;
   private short nBlankRcdCount88 ;
   private short RcdFound88 ;
   private short nBlankRcdUsr88 ;
   private short A13687ProMaxLin ;
   private short A774ProNumLin ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short Z13687ProMaxLin ;
   private short RcdFound87 ;
   private short nIsDirty_87 ;
   private short Z469FasPreSal ;
   private short Z468FasPrePie ;
   private short Z464FasNumPas ;
   private short nIsDirty_88 ;
   private short ZZ775ProUltLin ;
   private short ZZ13687ProMaxLin ;
   private int nRC_GXsfl_73 ;
   private int nGXsfl_73_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtProDsc2_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtProUltLin_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtProNumLin_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtFasDec_Enabled ;
   private int edtFasPreSal_Enabled ;
   private int edtFasPrePie_Enabled ;
   private int edtFasVelPro_Enabled ;
   private int edtFasNumPas_Enabled ;
   private int edtFasActTin_Enabled ;
   private int edtFasCon_Enabled ;
   private int edtFasForMul_Enabled ;
   private int edtFasConPla_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtproce3_level1item_Backcolor ;
   private int subGridtproce3_level1item_Allbackcolor ;
   private int defedtProNumLin_Enabled ;
   private int idxLst ;
   private int subGridtproce3_level1item_Selectedindex ;
   private int subGridtproce3_level1item_Selectioncolor ;
   private int subGridtproce3_level1item_Hoveringcolor ;
   private long GRIDTPROCE3_LEVEL1ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal Z459FasDec ;
   private java.math.BigDecimal Z472FasVelPro ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z759ProDsc ;
   private String Z4628ProDsc2 ;
   private String Z5289ProProvi ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_73_idx="0001" ;
   private String Gx_mode ;
   private String A5289ProProvi ;
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
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String edtProDsc2_Internalname ;
   private String A4628ProDsc2 ;
   private String edtProDsc2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtProUltLin_Internalname ;
   private String edtProUltLin_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode88 ;
   private String edtProNumLin_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasDsc_Internalname ;
   private String edtMaqCod_Internalname ;
   private String edtFasDec_Internalname ;
   private String edtFasPreSal_Internalname ;
   private String edtFasPrePie_Internalname ;
   private String edtFasVelPro_Internalname ;
   private String edtFasNumPas_Internalname ;
   private String edtFasActTin_Internalname ;
   private String edtFasCon_Internalname ;
   private String edtFasForMul_Internalname ;
   private String edtFasConPla_Internalname ;
   private String sStyleString ;
   private String subGridtproce3_level1item_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A460FasDsc ;
   private String A602MaqCod ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A4286FasForMul ;
   private String A4299FasConPla ;
   private String Z407EmprNom ;
   private String sMode87 ;
   private String Z460FasDsc ;
   private String Z456FasActTin ;
   private String Z458FasCon ;
   private String Z4286FasForMul ;
   private String Z4299FasConPla ;
   private String Z602MaqCod ;
   private String sGXsfl_73_fel_idx="0001" ;
   private String subGridtproce3_level1item_Class ;
   private String subGridtproce3_level1item_Linesclass ;
   private String ROClassString ;
   private String edtProNumLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtFasDec_Jsonclick ;
   private String edtFasPreSal_Jsonclick ;
   private String edtFasPrePie_Jsonclick ;
   private String edtFasVelPro_Jsonclick ;
   private String edtFasNumPas_Jsonclick ;
   private String edtFasActTin_Jsonclick ;
   private String edtFasCon_Jsonclick ;
   private String edtFasForMul_Jsonclick ;
   private String edtFasConPla_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtproce3_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ758ProCod ;
   private String ZZ759ProDsc ;
   private String ZZ4628ProDsc2 ;
   private String ZZ5289ProProvi ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_73_Refreshing=false ;
   private boolean n13687ProMaxLin ;
   private boolean n407EmprNom ;
   private boolean n459FasDec ;
   private boolean n469FasPreSal ;
   private boolean n468FasPrePie ;
   private boolean n472FasVelPro ;
   private boolean n464FasNumPas ;
   private boolean n456FasActTin ;
   private boolean n458FasCon ;
   private boolean n4286FasForMul ;
   private boolean n4299FasConPla ;
   private boolean n602MaqCod ;
   private com.genexus.webpanels.GXWebGrid Gridtproce3_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtproce3_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtproce3_level1itemColumn ;
   private ICheckbox chkProProvi ;
   private IDataStoreProvider pr_default ;
   private short[] T00RR6_A13687ProMaxLin ;
   private boolean[] T00RR6_n13687ProMaxLin ;
   private String[] T00RR11_A758ProCod ;
   private String[] T00RR11_A759ProDsc ;
   private String[] T00RR11_A4628ProDsc2 ;
   private String[] T00RR11_A5289ProProvi ;
   private String[] T00RR11_A407EmprNom ;
   private boolean[] T00RR11_n407EmprNom ;
   private short[] T00RR11_A775ProUltLin ;
   private String[] T00RR11_A396EmprCod ;
   private short[] T00RR11_A13687ProMaxLin ;
   private boolean[] T00RR11_n13687ProMaxLin ;
   private String[] T00RR9_A407EmprNom ;
   private boolean[] T00RR9_n407EmprNom ;
   private String[] T00RR12_A407EmprNom ;
   private boolean[] T00RR12_n407EmprNom ;
   private short[] T00RR14_A13687ProMaxLin ;
   private boolean[] T00RR14_n13687ProMaxLin ;
   private String[] T00RR15_A396EmprCod ;
   private String[] T00RR15_A758ProCod ;
   private String[] T00RR8_A758ProCod ;
   private String[] T00RR8_A759ProDsc ;
   private String[] T00RR8_A4628ProDsc2 ;
   private String[] T00RR8_A5289ProProvi ;
   private short[] T00RR8_A775ProUltLin ;
   private String[] T00RR8_A396EmprCod ;
   private String[] T00RR16_A396EmprCod ;
   private String[] T00RR16_A758ProCod ;
   private String[] T00RR17_A396EmprCod ;
   private String[] T00RR17_A758ProCod ;
   private String[] T00RR7_A758ProCod ;
   private String[] T00RR7_A759ProDsc ;
   private String[] T00RR7_A4628ProDsc2 ;
   private String[] T00RR7_A5289ProProvi ;
   private short[] T00RR7_A775ProUltLin ;
   private String[] T00RR7_A396EmprCod ;
   private String[] T00RR21_A407EmprNom ;
   private boolean[] T00RR21_n407EmprNom ;
   private short[] T00RR23_A13687ProMaxLin ;
   private boolean[] T00RR23_n13687ProMaxLin ;
   private String[] T00RR24_A396EmprCod ;
   private int[] T00RR24_A13026PedDGId ;
   private String[] T00RR24_A758ProCod ;
   private String[] T00RR25_A396EmprCod ;
   private String[] T00RR25_A12851ProCodID ;
   private String[] T00RR25_A758ProCod ;
   private String[] T00RR26_A396EmprCod ;
   private int[] T00RR26_A252CliCod ;
   private String[] T00RR26_A4589FFProCod ;
   private String[] T00RR27_A396EmprCod ;
   private int[] T00RR27_A252CliCod ;
   private String[] T00RR27_A10839Txt_Cor ;
   private String[] T00RR27_A758ProCod ;
   private String[] T00RR28_A396EmprCod ;
   private short[] T00RR28_A2248ManCod ;
   private String[] T00RR28_A5835ManFasCod ;
   private String[] T00RR28_A758ProCod ;
   private String[] T00RR29_A396EmprCod ;
   private int[] T00RR29_A7843Int_Num ;
   private String[] T00RR29_A758ProCod ;
   private String[] T00RR30_A396EmprCod ;
   private int[] T00RR30_A4618EnsLCod ;
   private String[] T00RR30_A758ProCod ;
   private String[] T00RR31_A396EmprCod ;
   private String[] T00RR31_A758ProCod ;
   private short[] T00RR31_A774ProNumLin ;
   private short[] T00RR31_A6438ProFsaL ;
   private String[] T00RR32_A396EmprCod ;
   private int[] T00RR32_A361DisCod ;
   private String[] T00RR32_A758ProCod ;
   private String[] T00RR33_A396EmprCod ;
   private int[] T00RR33_A129BarCod ;
   private byte[] T00RR33_A132BarCodReo ;
   private String[] T00RR33_A130BarCodPar ;
   private String[] T00RR33_A758ProCod ;
   private String[] T00RR34_A396EmprCod ;
   private int[] T00RR34_A252CliCod ;
   private String[] T00RR34_A65ArtCod ;
   private String[] T00RR34_A758ProCod ;
   private String[] T00RR35_A396EmprCod ;
   private String[] T00RR35_A758ProCod ;
   private String[] T00RR36_A758ProCod ;
   private short[] T00RR36_A774ProNumLin ;
   private String[] T00RR36_A460FasDsc ;
   private java.math.BigDecimal[] T00RR36_A459FasDec ;
   private boolean[] T00RR36_n459FasDec ;
   private short[] T00RR36_A469FasPreSal ;
   private boolean[] T00RR36_n469FasPreSal ;
   private short[] T00RR36_A468FasPrePie ;
   private boolean[] T00RR36_n468FasPrePie ;
   private java.math.BigDecimal[] T00RR36_A472FasVelPro ;
   private boolean[] T00RR36_n472FasVelPro ;
   private short[] T00RR36_A464FasNumPas ;
   private boolean[] T00RR36_n464FasNumPas ;
   private String[] T00RR36_A456FasActTin ;
   private boolean[] T00RR36_n456FasActTin ;
   private String[] T00RR36_A458FasCon ;
   private boolean[] T00RR36_n458FasCon ;
   private String[] T00RR36_A4286FasForMul ;
   private boolean[] T00RR36_n4286FasForMul ;
   private String[] T00RR36_A4299FasConPla ;
   private boolean[] T00RR36_n4299FasConPla ;
   private String[] T00RR36_A396EmprCod ;
   private String[] T00RR36_A457FasCod ;
   private String[] T00RR36_A602MaqCod ;
   private boolean[] T00RR36_n602MaqCod ;
   private String[] T00RR4_A460FasDsc ;
   private java.math.BigDecimal[] T00RR4_A459FasDec ;
   private boolean[] T00RR4_n459FasDec ;
   private short[] T00RR4_A469FasPreSal ;
   private boolean[] T00RR4_n469FasPreSal ;
   private short[] T00RR4_A468FasPrePie ;
   private boolean[] T00RR4_n468FasPrePie ;
   private java.math.BigDecimal[] T00RR4_A472FasVelPro ;
   private boolean[] T00RR4_n472FasVelPro ;
   private short[] T00RR4_A464FasNumPas ;
   private boolean[] T00RR4_n464FasNumPas ;
   private String[] T00RR4_A456FasActTin ;
   private boolean[] T00RR4_n456FasActTin ;
   private String[] T00RR4_A458FasCon ;
   private boolean[] T00RR4_n458FasCon ;
   private String[] T00RR4_A4286FasForMul ;
   private boolean[] T00RR4_n4286FasForMul ;
   private String[] T00RR4_A4299FasConPla ;
   private boolean[] T00RR4_n4299FasConPla ;
   private String[] T00RR4_A602MaqCod ;
   private boolean[] T00RR4_n602MaqCod ;
   private String[] T00RR37_A460FasDsc ;
   private java.math.BigDecimal[] T00RR37_A459FasDec ;
   private boolean[] T00RR37_n459FasDec ;
   private short[] T00RR37_A469FasPreSal ;
   private boolean[] T00RR37_n469FasPreSal ;
   private short[] T00RR37_A468FasPrePie ;
   private boolean[] T00RR37_n468FasPrePie ;
   private java.math.BigDecimal[] T00RR37_A472FasVelPro ;
   private boolean[] T00RR37_n472FasVelPro ;
   private short[] T00RR37_A464FasNumPas ;
   private boolean[] T00RR37_n464FasNumPas ;
   private String[] T00RR37_A456FasActTin ;
   private boolean[] T00RR37_n456FasActTin ;
   private String[] T00RR37_A458FasCon ;
   private boolean[] T00RR37_n458FasCon ;
   private String[] T00RR37_A4286FasForMul ;
   private boolean[] T00RR37_n4286FasForMul ;
   private String[] T00RR37_A4299FasConPla ;
   private boolean[] T00RR37_n4299FasConPla ;
   private String[] T00RR37_A602MaqCod ;
   private boolean[] T00RR37_n602MaqCod ;
   private String[] T00RR38_A396EmprCod ;
   private String[] T00RR38_A758ProCod ;
   private short[] T00RR38_A774ProNumLin ;
   private String[] T00RR3_A758ProCod ;
   private short[] T00RR3_A774ProNumLin ;
   private String[] T00RR3_A396EmprCod ;
   private String[] T00RR3_A457FasCod ;
   private String[] T00RR2_A758ProCod ;
   private short[] T00RR2_A774ProNumLin ;
   private String[] T00RR2_A396EmprCod ;
   private String[] T00RR2_A457FasCod ;
   private String[] T00RR42_A460FasDsc ;
   private java.math.BigDecimal[] T00RR42_A459FasDec ;
   private boolean[] T00RR42_n459FasDec ;
   private short[] T00RR42_A469FasPreSal ;
   private boolean[] T00RR42_n469FasPreSal ;
   private short[] T00RR42_A468FasPrePie ;
   private boolean[] T00RR42_n468FasPrePie ;
   private java.math.BigDecimal[] T00RR42_A472FasVelPro ;
   private boolean[] T00RR42_n472FasVelPro ;
   private short[] T00RR42_A464FasNumPas ;
   private boolean[] T00RR42_n464FasNumPas ;
   private String[] T00RR42_A456FasActTin ;
   private boolean[] T00RR42_n456FasActTin ;
   private String[] T00RR42_A458FasCon ;
   private boolean[] T00RR42_n458FasCon ;
   private String[] T00RR42_A4286FasForMul ;
   private boolean[] T00RR42_n4286FasForMul ;
   private String[] T00RR42_A4299FasConPla ;
   private boolean[] T00RR42_n4299FasConPla ;
   private String[] T00RR42_A602MaqCod ;
   private boolean[] T00RR42_n602MaqCod ;
   private String[] T00RR43_A396EmprCod ;
   private String[] T00RR43_A758ProCod ;
   private short[] T00RR43_A774ProNumLin ;
   private short[] T00RR43_A7897Dtp_Ordl ;
   private String[] T00RR44_A396EmprCod ;
   private String[] T00RR44_A758ProCod ;
   private short[] T00RR44_A774ProNumLin ;
   private short[] T00RR44_A6438ProFsaL ;
   private String[] T00RR45_A396EmprCod ;
   private String[] T00RR45_A758ProCod ;
   private short[] T00RR45_A774ProNumLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tproce3__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproce3__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproce3__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproce3__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproce3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00RR2", "SELECT ProCod, ProNumLin, EmprCod, FasCod FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?  FOR UPDATE OF FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR3", "SELECT ProCod, ProNumLin, EmprCod, FasCod FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR4", "SELECT FasDsc, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasForMul, FasConPla, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR6", "SELECT COALESCE( T1.ProMaxLin, 0) AS ProMaxLin FROM (SELECT MAX(ProNumLin) AS ProMaxLin, EmprCod, ProCod FROM TXPPROLIN GROUP BY EmprCod, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR7", "SELECT ProCod, ProDsc, ProDsc2, ProProvi, ProUltLin, EmprCod FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ?  FOR UPDATE OF ProDsc, ProDsc2, ProProvi, ProUltLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR8", "SELECT ProCod, ProDsc, ProDsc2, ProProvi, ProUltLin, EmprCod FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR11", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProCod, TM1.ProDsc, TM1.ProDsc2, TM1.ProProvi, T2.EmprNom, TM1.ProUltLin, TM1.EmprCod, COALESCE( T3.ProMaxLin, 0) AS ProMaxLin FROM ((TXPPROCES TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT MAX(ProNumLin) AS ProMaxLin, EmprCod, ProCod FROM TXPPROLIN GROUP BY EmprCod, ProCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.ProCod = ? ORDER BY TM1.EmprCod, TM1.ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR12", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR14", "SELECT COALESCE( T1.ProMaxLin, 0) AS ProMaxLin FROM (SELECT MAX(ProNumLin) AS ProMaxLin, EmprCod, ProCod FROM TXPPROLIN GROUP BY EmprCod, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR15", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod FROM TXPPROCES WHERE ( EmprCod > ? or EmprCod = ? and ProCod > ?) ORDER BY EmprCod, ProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RR17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod FROM TXPPROCES WHERE ( EmprCod < ? or EmprCod = ? and ProCod < ?) ORDER BY EmprCod DESC, ProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00RR18", "INSERT INTO TXPPROCES(ProCod, ProDsc, ProDsc2, ProProvi, ProUltLin, EmprCod, ProDscM, ProDscF, ProTipP, ProTipT, ProImBmp, ProImBmp2, ProImBmp3, ProImBmp4, ProCosPrd, ProMerPor, ProMarPor, ProPreMax, ProPreMin, ProEst) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ')", GX_NOMASK, "TXPPROCES")
         ,new UpdateCursor("T00RR19", "UPDATE TXPPROCES SET ProDsc=?, ProDsc2=?, ProProvi=?, ProUltLin=?  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK, "TXPPROCES")
         ,new UpdateCursor("T00RR20", "DELETE FROM TXPPROCES  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK, "TXPPROCES")
         ,new ForEachCursor("T00RR21", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR23", "SELECT COALESCE( T1.ProMaxLin, 0) AS ProMaxLin FROM (SELECT MAX(ProNumLin) AS ProMaxLin, EmprCod, ProCod FROM TXPPROLIN GROUP BY EmprCod, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR24", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod FROM TXPPEDDG4 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RR25", "SELECT * FROM (SELECT EmprCod, ProCodID, ProCod FROM TXPPROCo1 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RR26", "SELECT * FROM (SELECT EmprCod, CliCod, FFProCod FROM TXPFasFCl WHERE EmprCod = ? AND FFProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RR27", "SELECT * FROM (SELECT EmprCod, CliCod, Txt_Cor, ProCod FROM TXPPRE001 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RR28", "SELECT * FROM (SELECT EmprCod, ManCod, ManFasCod, ProCod FROM TXPPREMFP WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RR29", "SELECT * FROM (SELECT EmprCod, Int_Num, ProCod FROM TXPOTPRO WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RR30", "SELECT * FROM (SELECT EmprCod, EnsLCod, ProCod FROM TXPENSLA1 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RR31", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RR32", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RR33", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RR34", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RR35", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProCod FROM TXPPROCES ORDER BY EmprCod, ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR36", "SELECT T1.ProCod, T1.ProNumLin, T2.FasDsc, T2.FasDec, T2.FasPreSal, T2.FasPrePie, T2.FasVelPro, T2.FasNumPas, T2.FasActTin, T2.FasCon, T2.FasForMul, T2.FasConPla, T1.EmprCod, T1.FasCod, T2.MaqCod FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? and T1.ProNumLin = ? ORDER BY T1.EmprCod, T1.ProCod, T1.ProNumLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR37", "SELECT FasDsc, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasForMul, FasConPla, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR38", "SELECT EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00RR39", "INSERT INTO TXPPROLIN(ProCod, ProNumLin, EmprCod, FasCod, ProFasNot, ProUltFP, Dtp_FasDsc, Dtp_Tpp, Dtp_H2OReh, Dtp_TpCost, Dtp_UnpLt, Dtp_UOrd) VALUES(?, ?, ?, ?, ' ', 0, ' ', 0, ' ', 0, 0, 0)", GX_NOMASK, "TXPPROLIN")
         ,new UpdateCursor("T00RR40", "UPDATE TXPPROLIN SET FasCod=?  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK, "TXPPROLIN")
         ,new UpdateCursor("T00RR41", "DELETE FROM TXPPROLIN  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK, "TXPPROLIN")
         ,new ForEachCursor("T00RR42", "SELECT FasDsc, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasForMul, FasConPla, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RR43", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl FROM TXPDT002 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RR44", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RR45", "SELECT EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod, ProNumLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 3);
               ((String[]) buf[22])[0] = rslt.getString(14, 8);
               ((String[]) buf[23])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 100);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 100);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

