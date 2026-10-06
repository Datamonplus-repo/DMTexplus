package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class devoluciontejido_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A11669DevCruId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
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
         gxload_7( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A840TrnCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Devolucion de Tejido", ""), (short)(0)) ;
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

   public devoluciontejido_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public devoluciontejido_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_trn_impl.class ));
   }

   public devoluciontejido_trn_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbREst = new HTMLChoice();
      cmbAlbRUni = new HTMLChoice();
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
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      }
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Devolucion de Tejido", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruId_Internalname, httpContext.getMessage( "Devolucion Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruId_Internalname, GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevCruId_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruFec_Internalname, httpContext.getMessage( "Fecha Devolucion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDevCruFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruFec_Internalname, localUtil.format(A11670DevCruFec, "99/99/99"), localUtil.format( A11670DevCruFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevCruFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnNom_Internalname, httpContext.getMessage( "Transportista", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruEst_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruEst_Internalname, httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruEst_Internalname, GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11671DevCruEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A11671DevCruEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruEst_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevCruEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruMat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruMat_Internalname, GXutil.rtrim( A11672DevCruMat), GXutil.rtrim( localUtil.format( A11672DevCruMat, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruMat_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevCruMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruSal_Internalname, httpContext.getMessage( "Fecha-Hora Salida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDevCruSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruSal_Internalname, localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11673DevCruSal, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruSal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevCruSal_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruHash_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruHash_Internalname, httpContext.getMessage( "Hash", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevCruHash_Internalname, GXutil.rtrim( A11674DevCruHash), "", "", (short)(0), 1, edtDevCruHash_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruDesc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruDesc_Internalname, httpContext.getMessage( "Descripcion Hash", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevCruDesc_Internalname, GXutil.rtrim( A11675DevCruDesc), "", "", (short)(0), 1, edtDevCruDesc_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruDtSy_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruDtSy_Internalname, httpContext.getMessage( "Data System Hash", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDevCruDtSy_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruDtSy_Internalname, localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruDtSy_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevCruDtSy_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruDtSy_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruDtSy_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruGros_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruGros_Internalname, httpContext.getMessage( "Gross Total", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruGros_Internalname, GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruGros_Enabled!=0) ? localUtil.format( A11677DevCruGros, "ZZZZZZZZZ9.99") : localUtil.format( A11677DevCruGros, "ZZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruGros_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevCruGros_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruStt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruStt_Internalname, httpContext.getMessage( "Status", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruStt_Internalname, GXutil.rtrim( A11678DevCruStt), GXutil.rtrim( localUtil.format( A11678DevCruStt, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruStt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevCruStt_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruEnvA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruEnvA_Internalname, httpContext.getMessage( "Estado envio AT", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruEnvA_Internalname, GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruEnvA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11679DevCruEnvA), "9") : localUtil.format( DecimalUtil.doubleToDec(A11679DevCruEnvA), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruEnvA_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevCruEnvA_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruAtId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruAtId_Internalname, httpContext.getMessage( "ATDocCodeID", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruAtId_Internalname, GXutil.rtrim( A11680DevCruAtId), GXutil.rtrim( localUtil.format( A11680DevCruAtId, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruAtId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevCruAtId_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruAT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruAT_Internalname, httpContext.getMessage( "Manual o Automatico", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruAT_Internalname, GXutil.rtrim( A11681DevCruAT), GXutil.rtrim( localUtil.format( A11681DevCruAT, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruAT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevCruAT_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevCruObs_Internalname, A11682DevCruObs, "", "", (short)(0), 1, edtDevCruObs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRecCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRef_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRef_Internalname, httpContext.getMessage( "Codigo Referencia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRefDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRefDsc_Internalname, httpContext.getMessage( "Descripcion Referencia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc), GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRefDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRefDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruUnd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruUnd_Internalname, httpContext.getMessage( "Unidades", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruUnd_Enabled!=0) ? localUtil.format( A11683DevCruUnd, "ZZZZZ9.99") : localUtil.format( A11683DevCruUnd, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruUnd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevCruUnd_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruPzs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruPzs_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruPzs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevCruPzs_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniUti_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniUti_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRUniUti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniEnt_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieUti_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieUti_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRPieUti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieEnt_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbREst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbREst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbREst, cmbAlbREst.getInternalname(), GXutil.trim( GXutil.str( A47AlbREst, 1, 0)), 1, cmbAlbREst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbREst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", "", true, (byte)(0), "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRUni.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRUni.getInternalname(), httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", "", true, (byte)(0), "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_TRN.htm");
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
         Z11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( "Z11669DevCruId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( "Z11683DevCruUnd")) ;
         Z11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( "Z11684DevCruPzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVCRUID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDevCruId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11669DevCruId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         }
         else
         {
            A11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         }
         A11670DevCruFec = localUtil.ctod( httpContext.cgiGet( edtDevCruFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A11671DevCruEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevCruEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
         A11672DevCruMat = httpContext.cgiGet( edtDevCruMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
         A11673DevCruSal = localUtil.ctot( httpContext.cgiGet( edtDevCruSal_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11674DevCruHash = httpContext.cgiGet( edtDevCruHash_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
         A11675DevCruDesc = httpContext.cgiGet( edtDevCruDesc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
         A11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( edtDevCruDtSy_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11677DevCruGros = localUtil.ctond( httpContext.cgiGet( edtDevCruGros_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
         A11678DevCruStt = httpContext.cgiGet( edtDevCruStt_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
         A11679DevCruEnvA = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevCruEnvA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
         A11680DevCruAtId = httpContext.cgiGet( edtDevCruAtId_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
         A11681DevCruAT = httpContext.cgiGet( edtDevCruAT_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
         A11682DevCruObs = httpContext.cgiGet( edtDevCruObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A44AlbRecCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
         else
         {
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
         A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVCRUUND");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDevCruUnd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11683DevCruUnd = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A11683DevCruUnd", GXutil.ltrimstr( A11683DevCruUnd, 9, 2));
         }
         else
         {
            A11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11683DevCruUnd", GXutil.ltrimstr( A11683DevCruUnd, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVCRUPZS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDevCruPzs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11684DevCruPzs = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A11684DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11684DevCruPzs), 6, 0));
         }
         else
         {
            A11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11684DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11684DevCruPzs), 6, 0));
         }
         A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
         A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
         A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
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
            A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
            initAll1V81634( ) ;
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
      disableAttributes1V81634( ) ;
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

   public void resetCaption1V80( )
   {
   }

   public void zm1V81634( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11683DevCruUnd = T01V83_A11683DevCruUnd[0] ;
            Z11684DevCruPzs = T01V83_A11684DevCruPzs[0] ;
         }
         else
         {
            Z11683DevCruUnd = A11683DevCruUnd ;
            Z11684DevCruPzs = A11684DevCruPzs ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z11683DevCruUnd = A11683DevCruUnd ;
         Z11684DevCruPzs = A11684DevCruPzs ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z11669DevCruId = A11669DevCruId ;
         Z407EmprNom = A407EmprNom ;
         Z11670DevCruFec = A11670DevCruFec ;
         Z11671DevCruEst = A11671DevCruEst ;
         Z11672DevCruMat = A11672DevCruMat ;
         Z11673DevCruSal = A11673DevCruSal ;
         Z11674DevCruHash = A11674DevCruHash ;
         Z11675DevCruDesc = A11675DevCruDesc ;
         Z11676DevCruDtSy = A11676DevCruDtSy ;
         Z11677DevCruGros = A11677DevCruGros ;
         Z11678DevCruStt = A11678DevCruStt ;
         Z11679DevCruEnvA = A11679DevCruEnvA ;
         Z11680DevCruAtId = A11680DevCruAtId ;
         Z11681DevCruAT = A11681DevCruAT ;
         Z11682DevCruObs = A11682DevCruObs ;
         Z45AlbRef = A45AlbRef ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z47AlbREst = A47AlbREst ;
         Z56AlbRUni = A56AlbRUni ;
         Z252CliCod = A252CliCod ;
         Z840TrnCod = A840TrnCod ;
         Z279CliNom = A279CliNom ;
         Z841TrnNom = A841TrnNom ;
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

   public void load1V81634( )
   {
      /* Using cursor T01V89 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A407EmprNom = T01V89_A407EmprNom[0] ;
         n407EmprNom = T01V89_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11670DevCruFec = T01V89_A11670DevCruFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A279CliNom = T01V89_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A841TrnNom = T01V89_A841TrnNom[0] ;
         n841TrnNom = T01V89_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A11671DevCruEst = T01V89_A11671DevCruEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
         A11672DevCruMat = T01V89_A11672DevCruMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
         A11673DevCruSal = T01V89_A11673DevCruSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11674DevCruHash = T01V89_A11674DevCruHash[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
         A11675DevCruDesc = T01V89_A11675DevCruDesc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
         A11676DevCruDtSy = T01V89_A11676DevCruDtSy[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11677DevCruGros = T01V89_A11677DevCruGros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
         A11678DevCruStt = T01V89_A11678DevCruStt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
         A11679DevCruEnvA = T01V89_A11679DevCruEnvA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
         A11680DevCruAtId = T01V89_A11680DevCruAtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
         A11681DevCruAT = T01V89_A11681DevCruAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
         A11682DevCruObs = T01V89_A11682DevCruObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
         A45AlbRef = T01V89_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A3613AlbRefDsc = T01V89_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A11683DevCruUnd = T01V89_A11683DevCruUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11683DevCruUnd", GXutil.ltrimstr( A11683DevCruUnd, 9, 2));
         A11684DevCruPzs = T01V89_A11684DevCruPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11684DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11684DevCruPzs), 6, 0));
         A60AlbRUniUti = T01V89_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A58AlbRUniEnt = T01V89_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A54AlbRPieUti = T01V89_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A52AlbRPieEnt = T01V89_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A47AlbREst = T01V89_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A56AlbRUni = T01V89_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A252CliCod = T01V89_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01V89_A840TrnCod[0] ;
         n840TrnCod = T01V89_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         zm1V81634( -3) ;
      }
      pr_default.close(7);
      onLoadActions1V81634( ) ;
   }

   public void onLoadActions1V81634( )
   {
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
   }

   public void checkExtendedTable1V81634( )
   {
      nIsDirty_1634 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01V84 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01V84_A407EmprNom[0] ;
      n407EmprNom = T01V84_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01V86 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DEVOLUCION GENERO CRUDO detail", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11670DevCruFec = T01V86_A11670DevCruFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      A11671DevCruEst = T01V86_A11671DevCruEst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
      A11672DevCruMat = T01V86_A11672DevCruMat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
      A11673DevCruSal = T01V86_A11673DevCruSal[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11674DevCruHash = T01V86_A11674DevCruHash[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
      A11675DevCruDesc = T01V86_A11675DevCruDesc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
      A11676DevCruDtSy = T01V86_A11676DevCruDtSy[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11677DevCruGros = T01V86_A11677DevCruGros[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
      A11678DevCruStt = T01V86_A11678DevCruStt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
      A11679DevCruEnvA = T01V86_A11679DevCruEnvA[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      A11680DevCruAtId = T01V86_A11680DevCruAtId[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
      A11681DevCruAT = T01V86_A11681DevCruAT[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      A11682DevCruObs = T01V86_A11682DevCruObs[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
      pr_default.close(4);
      /* Using cursor T01V85 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A45AlbRef = T01V85_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A3613AlbRefDsc = T01V85_A3613AlbRefDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      A60AlbRUniUti = T01V85_A60AlbRUniUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A58AlbRUniEnt = T01V85_A58AlbRUniEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A54AlbRPieUti = T01V85_A54AlbRPieUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A52AlbRPieEnt = T01V85_A52AlbRPieEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A47AlbREst = T01V85_A47AlbREst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A56AlbRUni = T01V85_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A252CliCod = T01V85_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A840TrnCod = T01V85_A840TrnCod[0] ;
      n840TrnCod = T01V85_n840TrnCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      pr_default.close(3);
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_1634 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_1634 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_1634 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      nIsDirty_1634 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      /* Using cursor T01V87 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01V87_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T01V88 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01V88_A841TrnNom[0] ;
      n841TrnNom = T01V88_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1V81634( )
   {
      pr_default.close(2);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod )
   {
      /* Using cursor T01V810 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01V810_A407EmprNom[0] ;
      n407EmprNom = T01V810_n407EmprNom[0] ;
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

   public void gxload_6( String A396EmprCod ,
                         int A11669DevCruId )
   {
      /* Using cursor T01V811 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DEVOLUCION GENERO CRUDO detail", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11670DevCruFec = T01V811_A11670DevCruFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      A11671DevCruEst = T01V811_A11671DevCruEst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
      A11672DevCruMat = T01V811_A11672DevCruMat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
      A11673DevCruSal = T01V811_A11673DevCruSal[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11674DevCruHash = T01V811_A11674DevCruHash[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
      A11675DevCruDesc = T01V811_A11675DevCruDesc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
      A11676DevCruDtSy = T01V811_A11676DevCruDtSy[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11677DevCruGros = T01V811_A11677DevCruGros[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
      A11678DevCruStt = T01V811_A11678DevCruStt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
      A11679DevCruEnvA = T01V811_A11679DevCruEnvA[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      A11680DevCruAtId = T01V811_A11680DevCruAtId[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
      A11681DevCruAT = T01V811_A11681DevCruAT[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      A11682DevCruObs = T01V811_A11682DevCruObs[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A11670DevCruFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11672DevCruMat))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11674DevCruHash))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11675DevCruDesc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11678DevCruStt))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11680DevCruAtId))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11681DevCruAT))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A11682DevCruObs)+"\"") ;
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
                         int A44AlbRecCod )
   {
      /* Using cursor T01V812 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A45AlbRef = T01V812_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A3613AlbRefDsc = T01V812_A3613AlbRefDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      A60AlbRUniUti = T01V812_A60AlbRUniUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A58AlbRUniEnt = T01V812_A58AlbRUniEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A54AlbRPieUti = T01V812_A54AlbRPieUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A52AlbRPieEnt = T01V812_A52AlbRPieEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A47AlbREst = T01V812_A47AlbREst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A56AlbRUni = T01V812_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A252CliCod = T01V812_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A840TrnCod = T01V812_A840TrnCod[0] ;
      n840TrnCod = T01V812_n840TrnCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3613AlbRefDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A56AlbRUni))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_7( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01V813 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01V813_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_8( String A396EmprCod ,
                         short A840TrnCod )
   {
      /* Using cursor T01V814 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01V814_A841TrnNom[0] ;
      n841TrnNom = T01V814_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void getKey1V81634( )
   {
      /* Using cursor T01V815 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1634 = (short)(1) ;
      }
      else
      {
         RcdFound1634 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01V83 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1V81634( 3) ;
         RcdFound1634 = (short)(1) ;
         A11683DevCruUnd = T01V83_A11683DevCruUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11683DevCruUnd", GXutil.ltrimstr( A11683DevCruUnd, 9, 2));
         A11684DevCruPzs = T01V83_A11684DevCruPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11684DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11684DevCruPzs), 6, 0));
         A396EmprCod = T01V83_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = T01V83_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A11669DevCruId = T01V83_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z11669DevCruId = A11669DevCruId ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode1634 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1V81634( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1634 = (short)(0) ;
            initializeNonKey1V81634( ) ;
         }
         Gx_mode = sMode1634 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1634 = (short)(0) ;
         initializeNonKey1V81634( ) ;
         sMode1634 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1634 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1V81634( ) ;
      if ( RcdFound1634 == 0 )
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
      RcdFound1634 = (short)(0) ;
      /* Using cursor T01V816 */
      pr_default.execute(14, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01V816_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01V816_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V816_A44AlbRecCod[0] < A44AlbRecCod ) || ( T01V816_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01V816_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V816_A11669DevCruId[0] < A11669DevCruId ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01V816_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01V816_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V816_A44AlbRecCod[0] > A44AlbRecCod ) || ( T01V816_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01V816_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V816_A11669DevCruId[0] > A11669DevCruId ) ) )
         {
            A396EmprCod = T01V816_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = T01V816_A44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A11669DevCruId = T01V816_A11669DevCruId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            RcdFound1634 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound1634 = (short)(0) ;
      /* Using cursor T01V817 */
      pr_default.execute(15, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01V817_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01V817_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V817_A44AlbRecCod[0] > A44AlbRecCod ) || ( T01V817_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01V817_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V817_A11669DevCruId[0] > A11669DevCruId ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01V817_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01V817_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V817_A44AlbRecCod[0] < A44AlbRecCod ) || ( T01V817_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01V817_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V817_A11669DevCruId[0] < A11669DevCruId ) ) )
         {
            A396EmprCod = T01V817_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = T01V817_A44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A11669DevCruId = T01V817_A11669DevCruId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            RcdFound1634 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1V81634( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1V81634( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1634 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A11669DevCruId = Z11669DevCruId ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
               A44AlbRecCod = Z44AlbRecCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
               update1V81634( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1V81634( ) ;
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
                  insert1V81634( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11669DevCruId = Z11669DevCruId ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         A44AlbRecCod = Z44AlbRecCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
      if ( RcdFound1634 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDevCruUnd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1V81634( ) ;
      if ( RcdFound1634 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevCruUnd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1V81634( ) ;
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
      if ( RcdFound1634 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevCruUnd_Internalname ;
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
      if ( RcdFound1634 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevCruUnd_Internalname ;
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
      scanStart1V81634( ) ;
      if ( RcdFound1634 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1634 != 0 )
         {
            scanNext1V81634( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevCruUnd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1V81634( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1V81634( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01V82 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCR1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11683DevCruUnd, T01V82_A11683DevCruUnd[0]) != 0 ) || ( Z11684DevCruPzs != T01V82_A11684DevCruPzs[0] ) )
         {
            if ( DecimalUtil.compareTo(Z11683DevCruUnd, T01V82_A11683DevCruUnd[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_trn:[seudo value changed for attri]"+"DevCruUnd");
               GXutil.writeLogRaw("Old: ",Z11683DevCruUnd);
               GXutil.writeLogRaw("Current: ",T01V82_A11683DevCruUnd[0]);
            }
            if ( Z11684DevCruPzs != T01V82_A11684DevCruPzs[0] )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_trn:[seudo value changed for attri]"+"DevCruPzs");
               GXutil.writeLogRaw("Old: ",Z11684DevCruPzs);
               GXutil.writeLogRaw("Current: ",T01V82_A11684DevCruPzs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVCR1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1V81634( )
   {
      beforeValidate1V81634( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1V81634( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1V81634( 0) ;
         checkOptimisticConcurrency1V81634( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1V81634( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1V81634( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01V818 */
                  pr_default.execute(16, new Object[] {A11683DevCruUnd, Integer.valueOf(A11684DevCruPzs), A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A11669DevCruId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
                  if ( (pr_default.getStatus(16) == 1) )
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
                        resetCaption1V80( ) ;
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
            load1V81634( ) ;
         }
         endLevel1V81634( ) ;
      }
      closeExtendedTableCursors1V81634( ) ;
   }

   public void update1V81634( )
   {
      beforeValidate1V81634( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1V81634( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1V81634( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1V81634( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1V81634( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01V819 */
                  pr_default.execute(17, new Object[] {A11683DevCruUnd, Integer.valueOf(A11684DevCruPzs), A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
                  if ( (pr_default.getStatus(17) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCR1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1V81634( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1V80( ) ;
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
         endLevel1V81634( ) ;
      }
      closeExtendedTableCursors1V81634( ) ;
   }

   public void deferredUpdate1V81634( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1V81634( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1V81634( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1V81634( ) ;
         afterConfirm1V81634( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1V81634( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01V820 */
               pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1634 == 0 )
                     {
                        initAll1V81634( ) ;
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
                     resetCaption1V80( ) ;
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
      sMode1634 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1V81634( ) ;
      Gx_mode = sMode1634 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1V81634( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01V821 */
         pr_default.execute(19, new Object[] {A396EmprCod});
         A407EmprNom = T01V821_A407EmprNom[0] ;
         n407EmprNom = T01V821_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(19);
         /* Using cursor T01V822 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
         A11670DevCruFec = T01V822_A11670DevCruFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A11671DevCruEst = T01V822_A11671DevCruEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
         A11672DevCruMat = T01V822_A11672DevCruMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
         A11673DevCruSal = T01V822_A11673DevCruSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11674DevCruHash = T01V822_A11674DevCruHash[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
         A11675DevCruDesc = T01V822_A11675DevCruDesc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
         A11676DevCruDtSy = T01V822_A11676DevCruDtSy[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11677DevCruGros = T01V822_A11677DevCruGros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
         A11678DevCruStt = T01V822_A11678DevCruStt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
         A11679DevCruEnvA = T01V822_A11679DevCruEnvA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
         A11680DevCruAtId = T01V822_A11680DevCruAtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
         A11681DevCruAT = T01V822_A11681DevCruAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
         A11682DevCruObs = T01V822_A11682DevCruObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
         pr_default.close(20);
         /* Using cursor T01V823 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         A45AlbRef = T01V823_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A3613AlbRefDsc = T01V823_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A60AlbRUniUti = T01V823_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A58AlbRUniEnt = T01V823_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A54AlbRPieUti = T01V823_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A52AlbRPieEnt = T01V823_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A47AlbREst = T01V823_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A56AlbRUni = T01V823_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A252CliCod = T01V823_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01V823_A840TrnCod[0] ;
         n840TrnCod = T01V823_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         pr_default.close(21);
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         /* Using cursor T01V824 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01V824_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(22);
         /* Using cursor T01V825 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01V825_A841TrnNom[0] ;
         n841TrnNom = T01V825_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         pr_default.close(23);
      }
   }

   public void endLevel1V81634( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1V81634( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "almacensindetalle.devoluciontejido_trn");
         if ( AnyError == 0 )
         {
            confirmValues1V80( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "almacensindetalle.devoluciontejido_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1V81634( )
   {
      /* Using cursor T01V826 */
      pr_default.execute(24);
      RcdFound1634 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A396EmprCod = T01V826_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11669DevCruId = T01V826_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         A44AlbRecCod = T01V826_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1V81634( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1634 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A396EmprCod = T01V826_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11669DevCruId = T01V826_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         A44AlbRecCod = T01V826_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void scanEnd1V81634( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1V81634( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1V81634( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1V81634( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1V81634( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1V81634( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1V81634( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1V81634( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDevCruId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      edtDevCruFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruFec_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
      edtDevCruEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruEst_Enabled), 5, 0), true);
      edtDevCruMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruMat_Enabled), 5, 0), true);
      edtDevCruSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruSal_Enabled), 5, 0), true);
      edtDevCruHash_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruHash_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruHash_Enabled), 5, 0), true);
      edtDevCruDesc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruDesc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDesc_Enabled), 5, 0), true);
      edtDevCruDtSy_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruDtSy_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDtSy_Enabled), 5, 0), true);
      edtDevCruGros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruGros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruGros_Enabled), 5, 0), true);
      edtDevCruStt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruStt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruStt_Enabled), 5, 0), true);
      edtDevCruEnvA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruEnvA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruEnvA_Enabled), 5, 0), true);
      edtDevCruAtId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruAtId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruAtId_Enabled), 5, 0), true);
      edtDevCruAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruAT_Enabled), 5, 0), true);
      edtDevCruObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruObs_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), true);
      edtDevCruUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruUnd_Enabled), 5, 0), true);
      edtDevCruPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruPzs_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1V81634( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1V80( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacensindetalle.devoluciontejido_trn", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11669DevCruId", GXutil.ltrim( localUtil.ntoc( Z11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11683DevCruUnd", GXutil.ltrim( localUtil.ntoc( Z11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11684DevCruPzs", GXutil.ltrim( localUtil.ntoc( Z11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.almacensindetalle.devoluciontejido_trn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "AlmacenSinDetalle.DevolucionTejido_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Devolucion de Tejido", "") ;
   }

   public void initializeNonKey1V81634( )
   {
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A11670DevCruFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A11671DevCruEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
      A11672DevCruMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11674DevCruHash = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
      A11675DevCruDesc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11677DevCruGros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
      A11678DevCruStt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
      A11679DevCruEnvA = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      A11680DevCruAtId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
      A11681DevCruAT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      A11682DevCruObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A3613AlbRefDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      A11683DevCruUnd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11683DevCruUnd", GXutil.ltrimstr( A11683DevCruUnd, 9, 2));
      A11684DevCruPzs = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11684DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11684DevCruPzs), 6, 0));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      Z11683DevCruUnd = DecimalUtil.ZERO ;
      Z11684DevCruPzs = 0 ;
   }

   public void initAll1V81634( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11669DevCruId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      A44AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      initializeNonKey1V81634( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415124033", true, true);
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
      httpContext.AddJavascriptSource("almacensindetalle/devoluciontejido_trn.js", "?202682415124034", false, true);
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
      edtDevCruId_Internalname = "DEVCRUID" ;
      edtDevCruFec_Internalname = "DEVCRUFEC" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      edtDevCruEst_Internalname = "DEVCRUEST" ;
      edtDevCruMat_Internalname = "DEVCRUMAT" ;
      edtDevCruSal_Internalname = "DEVCRUSAL" ;
      edtDevCruHash_Internalname = "DEVCRUHASH" ;
      edtDevCruDesc_Internalname = "DEVCRUDESC" ;
      edtDevCruDtSy_Internalname = "DEVCRUDTSY" ;
      edtDevCruGros_Internalname = "DEVCRUGROS" ;
      edtDevCruStt_Internalname = "DEVCRUSTT" ;
      edtDevCruEnvA_Internalname = "DEVCRUENVA" ;
      edtDevCruAtId_Internalname = "DEVCRUATID" ;
      edtDevCruAT_Internalname = "DEVCRUAT" ;
      edtDevCruObs_Internalname = "DEVCRUOBS" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      edtDevCruUnd_Internalname = "DEVCRUUND" ;
      edtDevCruPzs_Internalname = "DEVCRUPZS" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      cmbAlbRUni.setInternalname( "ALBRUNI" );
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
      Form.setCaption( httpContext.getMessage( "Devolucion de Tejido", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 0 );
      cmbAlbREst.setJsonclick( "" );
      cmbAlbREst.setEnabled( 0 );
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Enabled = 0 ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Enabled = 0 ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniUti_Enabled = 0 ;
      edtDevCruPzs_Jsonclick = "" ;
      edtDevCruPzs_Enabled = 1 ;
      edtDevCruUnd_Jsonclick = "" ;
      edtDevCruUnd_Enabled = 1 ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRefDsc_Enabled = 0 ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Enabled = 0 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 1 ;
      edtDevCruObs_Enabled = 0 ;
      edtDevCruAT_Jsonclick = "" ;
      edtDevCruAT_Enabled = 0 ;
      edtDevCruAtId_Jsonclick = "" ;
      edtDevCruAtId_Enabled = 0 ;
      edtDevCruEnvA_Jsonclick = "" ;
      edtDevCruEnvA_Enabled = 0 ;
      edtDevCruStt_Jsonclick = "" ;
      edtDevCruStt_Enabled = 0 ;
      edtDevCruGros_Jsonclick = "" ;
      edtDevCruGros_Enabled = 0 ;
      edtDevCruDtSy_Jsonclick = "" ;
      edtDevCruDtSy_Enabled = 0 ;
      edtDevCruDesc_Enabled = 0 ;
      edtDevCruHash_Enabled = 0 ;
      edtDevCruSal_Jsonclick = "" ;
      edtDevCruSal_Enabled = 0 ;
      edtDevCruMat_Jsonclick = "" ;
      edtDevCruMat_Enabled = 0 ;
      edtDevCruEst_Jsonclick = "" ;
      edtDevCruEst_Enabled = 0 ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtDevCruFec_Jsonclick = "" ;
      edtDevCruFec_Enabled = 0 ;
      edtDevCruId_Jsonclick = "" ;
      edtDevCruId_Enabled = 1 ;
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
      cmbAlbREst.setName( "ALBREST" );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01V821 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01V821_A407EmprNom[0] ;
      n407EmprNom = T01V821_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(19);
      /* Using cursor T01V822 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DEVOLUCION GENERO CRUDO detail", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11670DevCruFec = T01V822_A11670DevCruFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      A11671DevCruEst = T01V822_A11671DevCruEst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
      A11672DevCruMat = T01V822_A11672DevCruMat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
      A11673DevCruSal = T01V822_A11673DevCruSal[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11674DevCruHash = T01V822_A11674DevCruHash[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
      A11675DevCruDesc = T01V822_A11675DevCruDesc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
      A11676DevCruDtSy = T01V822_A11676DevCruDtSy[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11677DevCruGros = T01V822_A11677DevCruGros[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
      A11678DevCruStt = T01V822_A11678DevCruStt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
      A11679DevCruEnvA = T01V822_A11679DevCruEnvA[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      A11680DevCruAtId = T01V822_A11680DevCruAtId[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
      A11681DevCruAT = T01V822_A11681DevCruAT[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      A11682DevCruObs = T01V822_A11682DevCruObs[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
      pr_default.close(20);
      /* Using cursor T01V823 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A45AlbRef = T01V823_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A3613AlbRefDsc = T01V823_A3613AlbRefDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      A60AlbRUniUti = T01V823_A60AlbRUniUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A58AlbRUniEnt = T01V823_A58AlbRUniEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A54AlbRPieUti = T01V823_A54AlbRPieUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A52AlbRPieEnt = T01V823_A52AlbRPieEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A47AlbREst = T01V823_A47AlbREst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A56AlbRUni = T01V823_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A252CliCod = T01V823_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A840TrnCod = T01V823_A840TrnCod[0] ;
      n840TrnCod = T01V823_n840TrnCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      pr_default.close(21);
      /* Using cursor T01V824 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01V824_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(22);
      /* Using cursor T01V825 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01V825_A841TrnNom[0] ;
      n841TrnNom = T01V825_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(23);
      GX_FocusControl = edtDevCruUnd_Internalname ;
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
      /* Using cursor T01V821 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01V821_A407EmprNom[0] ;
      n407EmprNom = T01V821_n407EmprNom[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Devcruid( )
   {
      /* Using cursor T01V822 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DEVOLUCION GENERO CRUDO detail", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A11670DevCruFec = T01V822_A11670DevCruFec[0] ;
      A11671DevCruEst = T01V822_A11671DevCruEst[0] ;
      A11672DevCruMat = T01V822_A11672DevCruMat[0] ;
      A11673DevCruSal = T01V822_A11673DevCruSal[0] ;
      A11674DevCruHash = T01V822_A11674DevCruHash[0] ;
      A11675DevCruDesc = T01V822_A11675DevCruDesc[0] ;
      A11676DevCruDtSy = T01V822_A11676DevCruDtSy[0] ;
      A11677DevCruGros = T01V822_A11677DevCruGros[0] ;
      A11678DevCruStt = T01V822_A11678DevCruStt[0] ;
      A11679DevCruEnvA = T01V822_A11679DevCruEnvA[0] ;
      A11680DevCruAtId = T01V822_A11680DevCruAtId[0] ;
      A11681DevCruAT = T01V822_A11681DevCruAT[0] ;
      A11682DevCruObs = T01V822_A11682DevCruObs[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", GXutil.rtrim( A11672DevCruMat));
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", GXutil.rtrim( A11674DevCruHash));
      httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", GXutil.rtrim( A11675DevCruDesc));
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", GXutil.rtrim( A11678DevCruStt));
      httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", GXutil.rtrim( A11680DevCruAtId));
      httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", GXutil.rtrim( A11681DevCruAT));
      httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
   }

   public void valid_Albreccod( )
   {
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      n840TrnCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01V823 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A45AlbRef = T01V823_A45AlbRef[0] ;
      A3613AlbRefDsc = T01V823_A3613AlbRefDsc[0] ;
      A60AlbRUniUti = T01V823_A60AlbRUniUti[0] ;
      A58AlbRUniEnt = T01V823_A58AlbRUniEnt[0] ;
      A54AlbRPieUti = T01V823_A54AlbRPieUti[0] ;
      A52AlbRPieEnt = T01V823_A52AlbRPieEnt[0] ;
      A47AlbREst = T01V823_A47AlbREst[0] ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      A56AlbRUni = T01V823_A56AlbRUni[0] ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A252CliCod = T01V823_A252CliCod[0] ;
      A840TrnCod = T01V823_A840TrnCod[0] ;
      n840TrnCod = T01V823_n840TrnCod[0] ;
      pr_default.close(21);
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      /* Using cursor T01V824 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01V824_A279CliNom[0] ;
      pr_default.close(22);
      /* Using cursor T01V825 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A841TrnNom = T01V825_A841TrnNom[0] ;
      n841TrnNom = T01V825_n841TrnNom[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      }
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11683DevCruUnd", GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11684DevCruPzs", GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", GXutil.rtrim( A11672DevCruMat));
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", GXutil.rtrim( A11674DevCruHash));
      httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", GXutil.rtrim( A11675DevCruDesc));
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", GXutil.rtrim( A11678DevCruStt));
      httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", GXutil.rtrim( A11680DevCruAtId));
      httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", GXutil.rtrim( A11681DevCruAT));
      httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", GXutil.rtrim( A3613AlbRefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11669DevCruId", GXutil.ltrim( localUtil.ntoc( Z11669DevCruId, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11683DevCruUnd", GXutil.ltrim( localUtil.ntoc( Z11683DevCruUnd, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11684DevCruPzs", GXutil.ltrim( localUtil.ntoc( Z11684DevCruPzs, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11670DevCruFec", localUtil.format(Z11670DevCruFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11671DevCruEst", GXutil.ltrim( localUtil.ntoc( Z11671DevCruEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11672DevCruMat", GXutil.rtrim( Z11672DevCruMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11673DevCruSal", localUtil.ttoc( Z11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11674DevCruHash", GXutil.rtrim( Z11674DevCruHash));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11675DevCruDesc", GXutil.rtrim( Z11675DevCruDesc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11676DevCruDtSy", localUtil.ttoc( Z11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11677DevCruGros", GXutil.ltrim( localUtil.ntoc( Z11677DevCruGros, (byte)(13), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11678DevCruStt", GXutil.rtrim( Z11678DevCruStt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11679DevCruEnvA", GXutil.ltrim( localUtil.ntoc( Z11679DevCruEnvA, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11680DevCruAtId", GXutil.rtrim( Z11680DevCruAtId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11681DevCruAT", GXutil.rtrim( Z11681DevCruAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11682DevCruObs", Z11682DevCruObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3613AlbRefDsc", GXutil.rtrim( Z3613AlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( Z57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( Z51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z841TrnNom", GXutil.rtrim( Z841TrnNom));
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
      setEventMetadata("VALID_DEVCRUID","{handler:'valid_Devcruid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A11671DevCruEst',fld:'DEVCRUEST',pic:'9'},{av:'A11672DevCruMat',fld:'DEVCRUMAT',pic:''},{av:'A11673DevCruSal',fld:'DEVCRUSAL',pic:'99/99/99 99:99'},{av:'A11674DevCruHash',fld:'DEVCRUHASH',pic:''},{av:'A11675DevCruDesc',fld:'DEVCRUDESC',pic:''},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'A11677DevCruGros',fld:'DEVCRUGROS',pic:'ZZZZZZZZZ9.99'},{av:'A11678DevCruStt',fld:'DEVCRUSTT',pic:''},{av:'A11679DevCruEnvA',fld:'DEVCRUENVA',pic:'9'},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''},{av:'A11681DevCruAT',fld:'DEVCRUAT',pic:''},{av:'A11682DevCruObs',fld:'DEVCRUOBS',pic:''}]");
      setEventMetadata("VALID_DEVCRUID",",oparms:[{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A11671DevCruEst',fld:'DEVCRUEST',pic:'9'},{av:'A11672DevCruMat',fld:'DEVCRUMAT',pic:''},{av:'A11673DevCruSal',fld:'DEVCRUSAL',pic:'99/99/99 99:99'},{av:'A11674DevCruHash',fld:'DEVCRUHASH',pic:''},{av:'A11675DevCruDesc',fld:'DEVCRUDESC',pic:''},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'A11677DevCruGros',fld:'DEVCRUGROS',pic:'ZZZZZZZZZ9.99'},{av:'A11678DevCruStt',fld:'DEVCRUSTT',pic:''},{av:'A11679DevCruEnvA',fld:'DEVCRUENVA',pic:'9'},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''},{av:'A11681DevCruAT',fld:'DEVCRUAT',pic:''},{av:'A11682DevCruObs',fld:'DEVCRUOBS',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[]");
      setEventMetadata("VALID_TRNCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A11683DevCruUnd',fld:'DEVCRUUND',pic:'ZZZZZ9.99'},{av:'A11684DevCruPzs',fld:'DEVCRUPZS',pic:'ZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A11671DevCruEst',fld:'DEVCRUEST',pic:'9'},{av:'A11672DevCruMat',fld:'DEVCRUMAT',pic:''},{av:'A11673DevCruSal',fld:'DEVCRUSAL',pic:'99/99/99 99:99'},{av:'A11674DevCruHash',fld:'DEVCRUHASH',pic:''},{av:'A11675DevCruDesc',fld:'DEVCRUDESC',pic:''},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'A11677DevCruGros',fld:'DEVCRUGROS',pic:'ZZZZZZZZZ9.99'},{av:'A11678DevCruStt',fld:'DEVCRUSTT',pic:''},{av:'A11679DevCruEnvA',fld:'DEVCRUENVA',pic:'9'},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''},{av:'A11681DevCruAT',fld:'DEVCRUAT',pic:''},{av:'A11682DevCruObs',fld:'DEVCRUOBS',pic:''},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11669DevCruId'},{av:'Z44AlbRecCod'},{av:'Z11683DevCruUnd'},{av:'Z11684DevCruPzs'},{av:'Z407EmprNom'},{av:'Z11670DevCruFec'},{av:'Z11671DevCruEst'},{av:'Z11672DevCruMat'},{av:'Z11673DevCruSal'},{av:'Z11674DevCruHash'},{av:'Z11675DevCruDesc'},{av:'Z11676DevCruDtSy'},{av:'Z11677DevCruGros'},{av:'Z11678DevCruStt'},{av:'Z11679DevCruEnvA'},{av:'Z11680DevCruAtId'},{av:'Z11681DevCruAT'},{av:'Z11682DevCruObs'},{av:'Z45AlbRef'},{av:'Z3613AlbRefDsc'},{av:'Z60AlbRUniUti'},{av:'Z58AlbRUniEnt'},{av:'Z54AlbRPieUti'},{av:'Z52AlbRPieEnt'},{av:'Z47AlbREst'},{av:'Z56AlbRUni'},{av:'Z252CliCod'},{av:'Z840TrnCod'},{av:'Z57AlbRUniDis'},{av:'Z51AlbRPieDis'},{av:'Z279CliNom'},{av:'Z841TrnNom'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
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
      pr_default.close(19);
      pr_default.close(20);
      pr_default.close(22);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11683DevCruUnd = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A56AlbRUni = "" ;
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
      A11670DevCruFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A841TrnNom = "" ;
      A11672DevCruMat = "" ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      A11677DevCruGros = DecimalUtil.ZERO ;
      A11678DevCruStt = "" ;
      A11680DevCruAtId = "" ;
      A11681DevCruAT = "" ;
      A11682DevCruObs = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
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
      Z11670DevCruFec = GXutil.nullDate() ;
      Z11672DevCruMat = "" ;
      Z11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      Z11674DevCruHash = "" ;
      Z11675DevCruDesc = "" ;
      Z11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      Z11677DevCruGros = DecimalUtil.ZERO ;
      Z11678DevCruStt = "" ;
      Z11680DevCruAtId = "" ;
      Z11681DevCruAT = "" ;
      Z11682DevCruObs = "" ;
      Z45AlbRef = "" ;
      Z3613AlbRefDsc = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z56AlbRUni = "" ;
      Z279CliNom = "" ;
      Z841TrnNom = "" ;
      T01V89_A407EmprNom = new String[] {""} ;
      T01V89_n407EmprNom = new boolean[] {false} ;
      T01V89_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01V89_A279CliNom = new String[] {""} ;
      T01V89_A841TrnNom = new String[] {""} ;
      T01V89_n841TrnNom = new boolean[] {false} ;
      T01V89_A11671DevCruEst = new byte[1] ;
      T01V89_A11672DevCruMat = new String[] {""} ;
      T01V89_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01V89_A11674DevCruHash = new String[] {""} ;
      T01V89_A11675DevCruDesc = new String[] {""} ;
      T01V89_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01V89_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V89_A11678DevCruStt = new String[] {""} ;
      T01V89_A11679DevCruEnvA = new byte[1] ;
      T01V89_A11680DevCruAtId = new String[] {""} ;
      T01V89_A11681DevCruAT = new String[] {""} ;
      T01V89_A11682DevCruObs = new String[] {""} ;
      T01V89_A45AlbRef = new String[] {""} ;
      T01V89_A3613AlbRefDsc = new String[] {""} ;
      T01V89_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V89_A11684DevCruPzs = new int[1] ;
      T01V89_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V89_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V89_A54AlbRPieUti = new int[1] ;
      T01V89_A52AlbRPieEnt = new int[1] ;
      T01V89_A47AlbREst = new byte[1] ;
      T01V89_A56AlbRUni = new String[] {""} ;
      T01V89_A396EmprCod = new String[] {""} ;
      T01V89_A44AlbRecCod = new int[1] ;
      T01V89_A11669DevCruId = new int[1] ;
      T01V89_A252CliCod = new int[1] ;
      T01V89_A840TrnCod = new short[1] ;
      T01V89_n840TrnCod = new boolean[] {false} ;
      T01V84_A407EmprNom = new String[] {""} ;
      T01V84_n407EmprNom = new boolean[] {false} ;
      T01V86_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01V86_A11671DevCruEst = new byte[1] ;
      T01V86_A11672DevCruMat = new String[] {""} ;
      T01V86_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01V86_A11674DevCruHash = new String[] {""} ;
      T01V86_A11675DevCruDesc = new String[] {""} ;
      T01V86_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01V86_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V86_A11678DevCruStt = new String[] {""} ;
      T01V86_A11679DevCruEnvA = new byte[1] ;
      T01V86_A11680DevCruAtId = new String[] {""} ;
      T01V86_A11681DevCruAT = new String[] {""} ;
      T01V86_A11682DevCruObs = new String[] {""} ;
      T01V85_A45AlbRef = new String[] {""} ;
      T01V85_A3613AlbRefDsc = new String[] {""} ;
      T01V85_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V85_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V85_A54AlbRPieUti = new int[1] ;
      T01V85_A52AlbRPieEnt = new int[1] ;
      T01V85_A47AlbREst = new byte[1] ;
      T01V85_A56AlbRUni = new String[] {""} ;
      T01V85_A252CliCod = new int[1] ;
      T01V85_A840TrnCod = new short[1] ;
      T01V85_n840TrnCod = new boolean[] {false} ;
      T01V87_A279CliNom = new String[] {""} ;
      T01V88_A841TrnNom = new String[] {""} ;
      T01V88_n841TrnNom = new boolean[] {false} ;
      T01V810_A407EmprNom = new String[] {""} ;
      T01V810_n407EmprNom = new boolean[] {false} ;
      T01V811_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01V811_A11671DevCruEst = new byte[1] ;
      T01V811_A11672DevCruMat = new String[] {""} ;
      T01V811_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01V811_A11674DevCruHash = new String[] {""} ;
      T01V811_A11675DevCruDesc = new String[] {""} ;
      T01V811_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01V811_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V811_A11678DevCruStt = new String[] {""} ;
      T01V811_A11679DevCruEnvA = new byte[1] ;
      T01V811_A11680DevCruAtId = new String[] {""} ;
      T01V811_A11681DevCruAT = new String[] {""} ;
      T01V811_A11682DevCruObs = new String[] {""} ;
      T01V812_A45AlbRef = new String[] {""} ;
      T01V812_A3613AlbRefDsc = new String[] {""} ;
      T01V812_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V812_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V812_A54AlbRPieUti = new int[1] ;
      T01V812_A52AlbRPieEnt = new int[1] ;
      T01V812_A47AlbREst = new byte[1] ;
      T01V812_A56AlbRUni = new String[] {""} ;
      T01V812_A252CliCod = new int[1] ;
      T01V812_A840TrnCod = new short[1] ;
      T01V812_n840TrnCod = new boolean[] {false} ;
      T01V813_A279CliNom = new String[] {""} ;
      T01V814_A841TrnNom = new String[] {""} ;
      T01V814_n841TrnNom = new boolean[] {false} ;
      T01V815_A396EmprCod = new String[] {""} ;
      T01V815_A11669DevCruId = new int[1] ;
      T01V815_A44AlbRecCod = new int[1] ;
      T01V83_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V83_A11684DevCruPzs = new int[1] ;
      T01V83_A396EmprCod = new String[] {""} ;
      T01V83_A44AlbRecCod = new int[1] ;
      T01V83_A11669DevCruId = new int[1] ;
      sMode1634 = "" ;
      T01V816_A396EmprCod = new String[] {""} ;
      T01V816_A44AlbRecCod = new int[1] ;
      T01V816_A11669DevCruId = new int[1] ;
      T01V817_A396EmprCod = new String[] {""} ;
      T01V817_A44AlbRecCod = new int[1] ;
      T01V817_A11669DevCruId = new int[1] ;
      T01V82_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V82_A11684DevCruPzs = new int[1] ;
      T01V82_A396EmprCod = new String[] {""} ;
      T01V82_A44AlbRecCod = new int[1] ;
      T01V82_A11669DevCruId = new int[1] ;
      T01V821_A407EmprNom = new String[] {""} ;
      T01V821_n407EmprNom = new boolean[] {false} ;
      T01V822_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01V822_A11671DevCruEst = new byte[1] ;
      T01V822_A11672DevCruMat = new String[] {""} ;
      T01V822_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01V822_A11674DevCruHash = new String[] {""} ;
      T01V822_A11675DevCruDesc = new String[] {""} ;
      T01V822_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01V822_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V822_A11678DevCruStt = new String[] {""} ;
      T01V822_A11679DevCruEnvA = new byte[1] ;
      T01V822_A11680DevCruAtId = new String[] {""} ;
      T01V822_A11681DevCruAT = new String[] {""} ;
      T01V822_A11682DevCruObs = new String[] {""} ;
      T01V823_A45AlbRef = new String[] {""} ;
      T01V823_A3613AlbRefDsc = new String[] {""} ;
      T01V823_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V823_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V823_A54AlbRPieUti = new int[1] ;
      T01V823_A52AlbRPieEnt = new int[1] ;
      T01V823_A47AlbREst = new byte[1] ;
      T01V823_A56AlbRUni = new String[] {""} ;
      T01V823_A252CliCod = new int[1] ;
      T01V823_A840TrnCod = new short[1] ;
      T01V823_n840TrnCod = new boolean[] {false} ;
      T01V824_A279CliNom = new String[] {""} ;
      T01V825_A841TrnNom = new String[] {""} ;
      T01V825_n841TrnNom = new boolean[] {false} ;
      T01V826_A396EmprCod = new String[] {""} ;
      T01V826_A11669DevCruId = new int[1] ;
      T01V826_A44AlbRecCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ11683DevCruUnd = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ11670DevCruFec = GXutil.nullDate() ;
      ZZ11672DevCruMat = "" ;
      ZZ11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      ZZ11674DevCruHash = "" ;
      ZZ11675DevCruDesc = "" ;
      ZZ11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      ZZ11677DevCruGros = DecimalUtil.ZERO ;
      ZZ11678DevCruStt = "" ;
      ZZ11680DevCruAtId = "" ;
      ZZ11681DevCruAT = "" ;
      ZZ11682DevCruObs = "" ;
      ZZ45AlbRef = "" ;
      ZZ3613AlbRefDsc = "" ;
      ZZ60AlbRUniUti = DecimalUtil.ZERO ;
      ZZ58AlbRUniEnt = DecimalUtil.ZERO ;
      ZZ56AlbRUni = "" ;
      ZZ57AlbRUniDis = DecimalUtil.ZERO ;
      ZZ279CliNom = "" ;
      ZZ841TrnNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_trn__default(),
         new Object[] {
             new Object[] {
            T01V82_A11683DevCruUnd, T01V82_A11684DevCruPzs, T01V82_A396EmprCod, T01V82_A44AlbRecCod, T01V82_A11669DevCruId
            }
            , new Object[] {
            T01V83_A11683DevCruUnd, T01V83_A11684DevCruPzs, T01V83_A396EmprCod, T01V83_A44AlbRecCod, T01V83_A11669DevCruId
            }
            , new Object[] {
            T01V84_A407EmprNom, T01V84_n407EmprNom
            }
            , new Object[] {
            T01V85_A45AlbRef, T01V85_A3613AlbRefDsc, T01V85_A60AlbRUniUti, T01V85_A58AlbRUniEnt, T01V85_A54AlbRPieUti, T01V85_A52AlbRPieEnt, T01V85_A47AlbREst, T01V85_A56AlbRUni, T01V85_A252CliCod, T01V85_A840TrnCod,
            T01V85_n840TrnCod
            }
            , new Object[] {
            T01V86_A11670DevCruFec, T01V86_A11671DevCruEst, T01V86_A11672DevCruMat, T01V86_A11673DevCruSal, T01V86_A11674DevCruHash, T01V86_A11675DevCruDesc, T01V86_A11676DevCruDtSy, T01V86_A11677DevCruGros, T01V86_A11678DevCruStt, T01V86_A11679DevCruEnvA,
            T01V86_A11680DevCruAtId, T01V86_A11681DevCruAT, T01V86_A11682DevCruObs
            }
            , new Object[] {
            T01V87_A279CliNom
            }
            , new Object[] {
            T01V88_A841TrnNom, T01V88_n841TrnNom
            }
            , new Object[] {
            T01V89_A407EmprNom, T01V89_n407EmprNom, T01V89_A11670DevCruFec, T01V89_A279CliNom, T01V89_A841TrnNom, T01V89_n841TrnNom, T01V89_A11671DevCruEst, T01V89_A11672DevCruMat, T01V89_A11673DevCruSal, T01V89_A11674DevCruHash,
            T01V89_A11675DevCruDesc, T01V89_A11676DevCruDtSy, T01V89_A11677DevCruGros, T01V89_A11678DevCruStt, T01V89_A11679DevCruEnvA, T01V89_A11680DevCruAtId, T01V89_A11681DevCruAT, T01V89_A11682DevCruObs, T01V89_A45AlbRef, T01V89_A3613AlbRefDsc,
            T01V89_A11683DevCruUnd, T01V89_A11684DevCruPzs, T01V89_A60AlbRUniUti, T01V89_A58AlbRUniEnt, T01V89_A54AlbRPieUti, T01V89_A52AlbRPieEnt, T01V89_A47AlbREst, T01V89_A56AlbRUni, T01V89_A396EmprCod, T01V89_A44AlbRecCod,
            T01V89_A11669DevCruId, T01V89_A252CliCod, T01V89_A840TrnCod, T01V89_n840TrnCod
            }
            , new Object[] {
            T01V810_A407EmprNom, T01V810_n407EmprNom
            }
            , new Object[] {
            T01V811_A11670DevCruFec, T01V811_A11671DevCruEst, T01V811_A11672DevCruMat, T01V811_A11673DevCruSal, T01V811_A11674DevCruHash, T01V811_A11675DevCruDesc, T01V811_A11676DevCruDtSy, T01V811_A11677DevCruGros, T01V811_A11678DevCruStt, T01V811_A11679DevCruEnvA,
            T01V811_A11680DevCruAtId, T01V811_A11681DevCruAT, T01V811_A11682DevCruObs
            }
            , new Object[] {
            T01V812_A45AlbRef, T01V812_A3613AlbRefDsc, T01V812_A60AlbRUniUti, T01V812_A58AlbRUniEnt, T01V812_A54AlbRPieUti, T01V812_A52AlbRPieEnt, T01V812_A47AlbREst, T01V812_A56AlbRUni, T01V812_A252CliCod, T01V812_A840TrnCod,
            T01V812_n840TrnCod
            }
            , new Object[] {
            T01V813_A279CliNom
            }
            , new Object[] {
            T01V814_A841TrnNom, T01V814_n841TrnNom
            }
            , new Object[] {
            T01V815_A396EmprCod, T01V815_A11669DevCruId, T01V815_A44AlbRecCod
            }
            , new Object[] {
            T01V816_A396EmprCod, T01V816_A44AlbRecCod, T01V816_A11669DevCruId
            }
            , new Object[] {
            T01V817_A396EmprCod, T01V817_A44AlbRecCod, T01V817_A11669DevCruId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01V821_A407EmprNom, T01V821_n407EmprNom
            }
            , new Object[] {
            T01V822_A11670DevCruFec, T01V822_A11671DevCruEst, T01V822_A11672DevCruMat, T01V822_A11673DevCruSal, T01V822_A11674DevCruHash, T01V822_A11675DevCruDesc, T01V822_A11676DevCruDtSy, T01V822_A11677DevCruGros, T01V822_A11678DevCruStt, T01V822_A11679DevCruEnvA,
            T01V822_A11680DevCruAtId, T01V822_A11681DevCruAT, T01V822_A11682DevCruObs
            }
            , new Object[] {
            T01V823_A45AlbRef, T01V823_A3613AlbRefDsc, T01V823_A60AlbRUniUti, T01V823_A58AlbRUniEnt, T01V823_A54AlbRPieUti, T01V823_A52AlbRPieEnt, T01V823_A47AlbREst, T01V823_A56AlbRUni, T01V823_A252CliCod, T01V823_A840TrnCod,
            T01V823_n840TrnCod
            }
            , new Object[] {
            T01V824_A279CliNom
            }
            , new Object[] {
            T01V825_A841TrnNom, T01V825_n841TrnNom
            }
            , new Object[] {
            T01V826_A396EmprCod, T01V826_A11669DevCruId, T01V826_A44AlbRecCod
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A47AlbREst ;
   private byte A11671DevCruEst ;
   private byte A11679DevCruEnvA ;
   private byte Z11671DevCruEst ;
   private byte Z11679DevCruEnvA ;
   private byte Z47AlbREst ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ11671DevCruEst ;
   private byte ZZ11679DevCruEnvA ;
   private byte ZZ47AlbREst ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z840TrnCod ;
   private short RcdFound1634 ;
   private short nIsDirty_1634 ;
   private short ZZ840TrnCod ;
   private int Z11669DevCruId ;
   private int Z44AlbRecCod ;
   private int Z11684DevCruPzs ;
   private int A11669DevCruId ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDevCruId_Enabled ;
   private int edtDevCruFec_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtTrnNom_Enabled ;
   private int edtDevCruEst_Enabled ;
   private int edtDevCruMat_Enabled ;
   private int edtDevCruSal_Enabled ;
   private int edtDevCruHash_Enabled ;
   private int edtDevCruDesc_Enabled ;
   private int edtDevCruDtSy_Enabled ;
   private int edtDevCruGros_Enabled ;
   private int edtDevCruStt_Enabled ;
   private int edtDevCruEnvA_Enabled ;
   private int edtDevCruAtId_Enabled ;
   private int edtDevCruAT_Enabled ;
   private int edtDevCruObs_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtAlbRefDsc_Enabled ;
   private int edtDevCruUnd_Enabled ;
   private int A11684DevCruPzs ;
   private int edtDevCruPzs_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int A54AlbRPieUti ;
   private int edtAlbRPieUti_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int Z54AlbRPieUti ;
   private int Z52AlbRPieEnt ;
   private int Z252CliCod ;
   private int idxLst ;
   private int Z51AlbRPieDis ;
   private int ZZ11669DevCruId ;
   private int ZZ44AlbRecCod ;
   private int ZZ11684DevCruPzs ;
   private int ZZ54AlbRPieUti ;
   private int ZZ52AlbRPieEnt ;
   private int ZZ252CliCod ;
   private int ZZ51AlbRPieDis ;
   private java.math.BigDecimal Z11683DevCruUnd ;
   private java.math.BigDecimal A11677DevCruGros ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal Z11677DevCruGros ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZZ11683DevCruUnd ;
   private java.math.BigDecimal ZZ11677DevCruGros ;
   private java.math.BigDecimal ZZ60AlbRUniUti ;
   private java.math.BigDecimal ZZ58AlbRUniEnt ;
   private java.math.BigDecimal ZZ57AlbRUniDis ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String A56AlbRUni ;
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
   private String edtDevCruId_Internalname ;
   private String edtDevCruId_Jsonclick ;
   private String edtDevCruFec_Internalname ;
   private String edtDevCruFec_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String edtDevCruEst_Internalname ;
   private String edtDevCruEst_Jsonclick ;
   private String edtDevCruMat_Internalname ;
   private String A11672DevCruMat ;
   private String edtDevCruMat_Jsonclick ;
   private String edtDevCruSal_Internalname ;
   private String edtDevCruSal_Jsonclick ;
   private String edtDevCruHash_Internalname ;
   private String A11674DevCruHash ;
   private String edtDevCruDesc_Internalname ;
   private String A11675DevCruDesc ;
   private String edtDevCruDtSy_Internalname ;
   private String edtDevCruDtSy_Jsonclick ;
   private String edtDevCruGros_Internalname ;
   private String edtDevCruGros_Jsonclick ;
   private String edtDevCruStt_Internalname ;
   private String A11678DevCruStt ;
   private String edtDevCruStt_Jsonclick ;
   private String edtDevCruEnvA_Internalname ;
   private String edtDevCruEnvA_Jsonclick ;
   private String edtDevCruAtId_Internalname ;
   private String A11680DevCruAtId ;
   private String edtDevCruAtId_Jsonclick ;
   private String edtDevCruAT_Internalname ;
   private String A11681DevCruAT ;
   private String edtDevCruAT_Jsonclick ;
   private String edtDevCruObs_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbRef_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Jsonclick ;
   private String edtDevCruUnd_Internalname ;
   private String edtDevCruUnd_Jsonclick ;
   private String edtDevCruPzs_Internalname ;
   private String edtDevCruPzs_Jsonclick ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
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
   private String Z11672DevCruMat ;
   private String Z11674DevCruHash ;
   private String Z11675DevCruDesc ;
   private String Z11678DevCruStt ;
   private String Z11680DevCruAtId ;
   private String Z11681DevCruAT ;
   private String Z45AlbRef ;
   private String Z3613AlbRefDsc ;
   private String Z56AlbRUni ;
   private String Z279CliNom ;
   private String Z841TrnNom ;
   private String sMode1634 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ11672DevCruMat ;
   private String ZZ11674DevCruHash ;
   private String ZZ11675DevCruDesc ;
   private String ZZ11678DevCruStt ;
   private String ZZ11680DevCruAtId ;
   private String ZZ11681DevCruAT ;
   private String ZZ45AlbRef ;
   private String ZZ3613AlbRefDsc ;
   private String ZZ56AlbRUni ;
   private String ZZ279CliNom ;
   private String ZZ841TrnNom ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date A11676DevCruDtSy ;
   private java.util.Date Z11673DevCruSal ;
   private java.util.Date Z11676DevCruDtSy ;
   private java.util.Date ZZ11673DevCruSal ;
   private java.util.Date ZZ11676DevCruDtSy ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date Z11670DevCruFec ;
   private java.util.Date ZZ11670DevCruFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n840TrnCod ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private String A11682DevCruObs ;
   private String Z11682DevCruObs ;
   private String ZZ11682DevCruObs ;
   private HTMLChoice cmbAlbREst ;
   private HTMLChoice cmbAlbRUni ;
   private IDataStoreProvider pr_default ;
   private String[] T01V89_A407EmprNom ;
   private boolean[] T01V89_n407EmprNom ;
   private java.util.Date[] T01V89_A11670DevCruFec ;
   private String[] T01V89_A279CliNom ;
   private String[] T01V89_A841TrnNom ;
   private boolean[] T01V89_n841TrnNom ;
   private byte[] T01V89_A11671DevCruEst ;
   private String[] T01V89_A11672DevCruMat ;
   private java.util.Date[] T01V89_A11673DevCruSal ;
   private String[] T01V89_A11674DevCruHash ;
   private String[] T01V89_A11675DevCruDesc ;
   private java.util.Date[] T01V89_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01V89_A11677DevCruGros ;
   private String[] T01V89_A11678DevCruStt ;
   private byte[] T01V89_A11679DevCruEnvA ;
   private String[] T01V89_A11680DevCruAtId ;
   private String[] T01V89_A11681DevCruAT ;
   private String[] T01V89_A11682DevCruObs ;
   private String[] T01V89_A45AlbRef ;
   private String[] T01V89_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01V89_A11683DevCruUnd ;
   private int[] T01V89_A11684DevCruPzs ;
   private java.math.BigDecimal[] T01V89_A60AlbRUniUti ;
   private java.math.BigDecimal[] T01V89_A58AlbRUniEnt ;
   private int[] T01V89_A54AlbRPieUti ;
   private int[] T01V89_A52AlbRPieEnt ;
   private byte[] T01V89_A47AlbREst ;
   private String[] T01V89_A56AlbRUni ;
   private String[] T01V89_A396EmprCod ;
   private int[] T01V89_A44AlbRecCod ;
   private int[] T01V89_A11669DevCruId ;
   private int[] T01V89_A252CliCod ;
   private short[] T01V89_A840TrnCod ;
   private boolean[] T01V89_n840TrnCod ;
   private String[] T01V84_A407EmprNom ;
   private boolean[] T01V84_n407EmprNom ;
   private java.util.Date[] T01V86_A11670DevCruFec ;
   private byte[] T01V86_A11671DevCruEst ;
   private String[] T01V86_A11672DevCruMat ;
   private java.util.Date[] T01V86_A11673DevCruSal ;
   private String[] T01V86_A11674DevCruHash ;
   private String[] T01V86_A11675DevCruDesc ;
   private java.util.Date[] T01V86_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01V86_A11677DevCruGros ;
   private String[] T01V86_A11678DevCruStt ;
   private byte[] T01V86_A11679DevCruEnvA ;
   private String[] T01V86_A11680DevCruAtId ;
   private String[] T01V86_A11681DevCruAT ;
   private String[] T01V86_A11682DevCruObs ;
   private String[] T01V85_A45AlbRef ;
   private String[] T01V85_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01V85_A60AlbRUniUti ;
   private java.math.BigDecimal[] T01V85_A58AlbRUniEnt ;
   private int[] T01V85_A54AlbRPieUti ;
   private int[] T01V85_A52AlbRPieEnt ;
   private byte[] T01V85_A47AlbREst ;
   private String[] T01V85_A56AlbRUni ;
   private int[] T01V85_A252CliCod ;
   private short[] T01V85_A840TrnCod ;
   private boolean[] T01V85_n840TrnCod ;
   private String[] T01V87_A279CliNom ;
   private String[] T01V88_A841TrnNom ;
   private boolean[] T01V88_n841TrnNom ;
   private String[] T01V810_A407EmprNom ;
   private boolean[] T01V810_n407EmprNom ;
   private java.util.Date[] T01V811_A11670DevCruFec ;
   private byte[] T01V811_A11671DevCruEst ;
   private String[] T01V811_A11672DevCruMat ;
   private java.util.Date[] T01V811_A11673DevCruSal ;
   private String[] T01V811_A11674DevCruHash ;
   private String[] T01V811_A11675DevCruDesc ;
   private java.util.Date[] T01V811_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01V811_A11677DevCruGros ;
   private String[] T01V811_A11678DevCruStt ;
   private byte[] T01V811_A11679DevCruEnvA ;
   private String[] T01V811_A11680DevCruAtId ;
   private String[] T01V811_A11681DevCruAT ;
   private String[] T01V811_A11682DevCruObs ;
   private String[] T01V812_A45AlbRef ;
   private String[] T01V812_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01V812_A60AlbRUniUti ;
   private java.math.BigDecimal[] T01V812_A58AlbRUniEnt ;
   private int[] T01V812_A54AlbRPieUti ;
   private int[] T01V812_A52AlbRPieEnt ;
   private byte[] T01V812_A47AlbREst ;
   private String[] T01V812_A56AlbRUni ;
   private int[] T01V812_A252CliCod ;
   private short[] T01V812_A840TrnCod ;
   private boolean[] T01V812_n840TrnCod ;
   private String[] T01V813_A279CliNom ;
   private String[] T01V814_A841TrnNom ;
   private boolean[] T01V814_n841TrnNom ;
   private String[] T01V815_A396EmprCod ;
   private int[] T01V815_A11669DevCruId ;
   private int[] T01V815_A44AlbRecCod ;
   private java.math.BigDecimal[] T01V83_A11683DevCruUnd ;
   private int[] T01V83_A11684DevCruPzs ;
   private String[] T01V83_A396EmprCod ;
   private int[] T01V83_A44AlbRecCod ;
   private int[] T01V83_A11669DevCruId ;
   private String[] T01V816_A396EmprCod ;
   private int[] T01V816_A44AlbRecCod ;
   private int[] T01V816_A11669DevCruId ;
   private String[] T01V817_A396EmprCod ;
   private int[] T01V817_A44AlbRecCod ;
   private int[] T01V817_A11669DevCruId ;
   private java.math.BigDecimal[] T01V82_A11683DevCruUnd ;
   private int[] T01V82_A11684DevCruPzs ;
   private String[] T01V82_A396EmprCod ;
   private int[] T01V82_A44AlbRecCod ;
   private int[] T01V82_A11669DevCruId ;
   private String[] T01V821_A407EmprNom ;
   private boolean[] T01V821_n407EmprNom ;
   private java.util.Date[] T01V822_A11670DevCruFec ;
   private byte[] T01V822_A11671DevCruEst ;
   private String[] T01V822_A11672DevCruMat ;
   private java.util.Date[] T01V822_A11673DevCruSal ;
   private String[] T01V822_A11674DevCruHash ;
   private String[] T01V822_A11675DevCruDesc ;
   private java.util.Date[] T01V822_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01V822_A11677DevCruGros ;
   private String[] T01V822_A11678DevCruStt ;
   private byte[] T01V822_A11679DevCruEnvA ;
   private String[] T01V822_A11680DevCruAtId ;
   private String[] T01V822_A11681DevCruAT ;
   private String[] T01V822_A11682DevCruObs ;
   private String[] T01V823_A45AlbRef ;
   private String[] T01V823_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01V823_A60AlbRUniUti ;
   private java.math.BigDecimal[] T01V823_A58AlbRUniEnt ;
   private int[] T01V823_A54AlbRPieUti ;
   private int[] T01V823_A52AlbRPieEnt ;
   private byte[] T01V823_A47AlbREst ;
   private String[] T01V823_A56AlbRUni ;
   private int[] T01V823_A252CliCod ;
   private short[] T01V823_A840TrnCod ;
   private boolean[] T01V823_n840TrnCod ;
   private String[] T01V824_A279CliNom ;
   private String[] T01V825_A841TrnNom ;
   private boolean[] T01V825_n841TrnNom ;
   private String[] T01V826_A396EmprCod ;
   private int[] T01V826_A11669DevCruId ;
   private int[] T01V826_A44AlbRecCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class devoluciontejido_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devoluciontejido_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devoluciontejido_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devoluciontejido_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devoluciontejido_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01V82", "SELECT DevCruUnd, DevCruPzs, EmprCod, AlbRecCod, DevCruId FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?  FOR UPDATE OF DevCruUnd, DevCruPzs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V83", "SELECT DevCruUnd, DevCruPzs, EmprCod, AlbRecCod, DevCruId FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V84", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V85", "SELECT AlbRef, AlbRefDsc, AlbRUniUti, AlbRUniEnt, AlbRPieUti, AlbRPieEnt, AlbREst, AlbRUni, CliCod, TrnCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V86", "SELECT DevCruFec, DevCruEst, DevCruMat, DevCruSal, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V87", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V88", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V89", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, T3.DevCruFec, T5.CliNom, T6.TrnNom, T3.DevCruEst, T3.DevCruMat, T3.DevCruSal, T3.DevCruHash, T3.DevCruDesc, T3.DevCruDtSy, T3.DevCruGros, T3.DevCruStt, T3.DevCruEnvA, T3.DevCruAtId, T3.DevCruAT, T3.DevCruObs, T4.AlbRef, T4.AlbRefDsc, TM1.DevCruUnd, TM1.DevCruPzs, T4.AlbRUniUti, T4.AlbRUniEnt, T4.AlbRPieUti, T4.AlbRPieEnt, T4.AlbREst, T4.AlbRUni, TM1.EmprCod, TM1.AlbRecCod, TM1.DevCruId, T4.CliCod, T4.TrnCod FROM (((((TXPDEVCR1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPDEVCRU T3 ON T3.EmprCod = TM1.EmprCod AND T3.DevCruId = TM1.DevCruId) INNER JOIN TXPALBREC T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = T4.CliCod) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = T4.TrnCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? and TM1.DevCruId = ? ORDER BY TM1.EmprCod, TM1.DevCruId, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V810", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V811", "SELECT DevCruFec, DevCruEst, DevCruMat, DevCruSal, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V812", "SELECT AlbRef, AlbRefDsc, AlbRUniUti, AlbRUniEnt, AlbRPieUti, AlbRPieEnt, AlbREst, AlbRUni, CliCod, TrnCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V813", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V814", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V815", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V816", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, DevCruId FROM TXPDEVCR1 WHERE ( EmprCod > ? or EmprCod = ? and AlbRecCod > ? or AlbRecCod = ? and EmprCod = ? and DevCruId > ?) ORDER BY EmprCod, DevCruId, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V817", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, DevCruId FROM TXPDEVCR1 WHERE ( EmprCod < ? or EmprCod = ? and AlbRecCod < ? or AlbRecCod = ? and EmprCod = ? and DevCruId < ?) ORDER BY EmprCod DESC, DevCruId DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01V818", "INSERT INTO TXPDEVCR1(DevCruUnd, DevCruPzs, EmprCod, AlbRecCod, DevCruId) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPDEVCR1")
         ,new UpdateCursor("T01V819", "UPDATE TXPDEVCR1 SET DevCruUnd=?, DevCruPzs=?  WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDEVCR1")
         ,new UpdateCursor("T01V820", "DELETE FROM TXPDEVCR1  WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDEVCR1")
         ,new ForEachCursor("T01V821", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V822", "SELECT DevCruFec, DevCruEst, DevCruMat, DevCruSal, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V823", "SELECT AlbRef, AlbRefDsc, AlbRUniUti, AlbRUniEnt, AlbRPieUti, AlbRPieEnt, AlbREst, AlbRUni, CliCod, TrnCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V824", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V825", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V826", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 ORDER BY EmprCod, DevCruId, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 300);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 200);
               ((String[]) buf[10])[0] = rslt.getString(9, 300);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 20);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               ((String[]) buf[17])[0] = rslt.getVarchar(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 16);
               ((String[]) buf[19])[0] = rslt.getString(18, 26);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((int[]) buf[21])[0] = rslt.getInt(20);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((int[]) buf[24])[0] = rslt.getInt(23);
               ((int[]) buf[25])[0] = rslt.getInt(24);
               ((byte[]) buf[26])[0] = rslt.getByte(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 1);
               ((String[]) buf[28])[0] = rslt.getString(27, 3);
               ((int[]) buf[29])[0] = rslt.getInt(28);
               ((int[]) buf[30])[0] = rslt.getInt(29);
               ((int[]) buf[31])[0] = rslt.getInt(30);
               ((short[]) buf[32])[0] = rslt.getShort(31);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 300);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 300);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 16 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 17 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
      }
   }

}

