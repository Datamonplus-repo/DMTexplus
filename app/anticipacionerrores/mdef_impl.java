package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mdef_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MDef", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMDefId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public mdef_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mdef_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mdef_impl.class ));
   }

   public mdef_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "MDef", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_AnticipacionErrores\\MDef.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_AnticipacionErrores\\MDef.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefId_Internalname, httpContext.getMessage( "Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefId_Internalname, GXutil.ltrim( localUtil.ntoc( A14594MDefId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMDefId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14594MDefId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14594MDefId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefEmprCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefEmprCo_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefEmprCo_Internalname, GXutil.rtrim( A14624MDefEmprCo), GXutil.rtrim( localUtil.format( A14624MDefEmprCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefEmprCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefEmprCo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefCliCod_Internalname, httpContext.getMessage( "Cód. Cli.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14597MDefCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMDefCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14597MDefCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14597MDefCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefCliNom_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMDefCliNom_Internalname, A14625MDefCliNom, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", (short)(0), 1, edtMDefCliNom_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefArtCod_Internalname, httpContext.getMessage( "Cód Artículo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefArtCod_Internalname, GXutil.rtrim( A14598MDefArtCod), GXutil.rtrim( localUtil.format( A14598MDefArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefArtCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefArtDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefArtDsc_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMDefArtDsc_Internalname, A14626MDefArtDsc, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", (short)(0), 1, edtMDefArtDsc_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefColNum_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A14599MDefColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMDefColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14599MDefColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14599MDefColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefColNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefColCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefColCod_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14627MDefColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMDefColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14627MDefColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A14627MDefColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefColCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefColNom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefColNom_Internalname, GXutil.rtrim( A14628MDefColNom), GXutil.rtrim( localUtil.format( A14628MDefColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefColNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefMaqCod_Internalname, httpContext.getMessage( "Cód. máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefMaqCod_Internalname, GXutil.rtrim( A14601MDefMaqCod), GXutil.rtrim( localUtil.format( A14601MDefMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefMaqDsc_Internalname, httpContext.getMessage( "Máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMDefMaqDsc_Internalname, A14629MDefMaqDsc, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", (short)(0), 1, edtMDefMaqDsc_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefTipMCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefTipMCo_Internalname, httpContext.getMessage( "Tipo Máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefTipMCo_Internalname, GXutil.rtrim( A14600MDefTipMCo), GXutil.rtrim( localUtil.format( A14600MDefTipMCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefTipMCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefTipMCo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefTipMDs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefTipMDs_Internalname, httpContext.getMessage( "Tipo Máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMDefTipMDs_Internalname, A14630MDefTipMDs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", (short)(0), 1, edtMDefTipMDs_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefDefCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefDefCod_Internalname, httpContext.getMessage( "Cód. Defecto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefDefCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14602MDefDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMDefDefCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14602MDefDefCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14602MDefDefCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefDefCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefDefCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefDefDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefDefDsc_Internalname, httpContext.getMessage( "Defecto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMDefDefDsc_Internalname, A14631MDefDefDsc, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", (short)(0), 1, edtMDefDefDsc_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefCatCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefCatCod_Internalname, httpContext.getMessage( "Cód. Categoria", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefCatCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14632MDefCatCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMDefCatCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14632MDefCatCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14632MDefCatCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefCatCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefCatCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefCatDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefCatDsc_Internalname, httpContext.getMessage( "Categoria", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMDefCatDsc_Internalname, A14633MDefCatDsc, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", (short)(0), 1, edtMDefCatDsc_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefKilTot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefKilTot_Internalname, httpContext.getMessage( "Total", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefKilTot_Internalname, GXutil.ltrim( localUtil.ntoc( A14634MDefKilTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMDefKilTot_Enabled!=0) ? localUtil.format( A14634MDefKilTot, "ZZZZZZZZ9.99") : localUtil.format( A14634MDefKilTot, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefKilTot_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefKilTot_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefKilPro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefKilPro_Internalname, httpContext.getMessage( "Produccion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefKilPro_Internalname, GXutil.ltrim( localUtil.ntoc( A14635MDefKilPro, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMDefKilPro_Enabled!=0) ? localUtil.format( A14635MDefKilPro, "ZZZZZZZZ9.99") : localUtil.format( A14635MDefKilPro, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefKilPro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefKilPro_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefKilReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefKilReo_Internalname, httpContext.getMessage( "Reoperados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefKilReo_Internalname, GXutil.ltrim( localUtil.ntoc( A14636MDefKilReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMDefKilReo_Enabled!=0) ? localUtil.format( A14636MDefKilReo, "ZZZZZZZZ9.99") : localUtil.format( A14636MDefKilReo, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefKilReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefKilReo_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefPorc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefPorc_Internalname, httpContext.getMessage( "Porc", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefPorc_Internalname, GXutil.ltrim( localUtil.ntoc( A14637MDefPorc, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMDefPorc_Enabled!=0) ? localUtil.format( A14637MDefPorc, "ZZZ9.99") : localUtil.format( A14637MDefPorc, "ZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefPorc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefPorc_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefUsu_Internalname, GXutil.rtrim( A14596MDefUsu), GXutil.rtrim( localUtil.format( A14596MDefUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefUsu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefTkn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefTkn_Internalname, httpContext.getMessage( "Token", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMDefTkn_Internalname, A14595MDefTkn, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", (short)(0), 1, edtMDefTkn_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefMetTot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefMetTot_Internalname, httpContext.getMessage( "Metros Totales", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefMetTot_Internalname, GXutil.ltrim( localUtil.ntoc( A14638MDefMetTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMDefMetTot_Enabled!=0) ? localUtil.format( A14638MDefMetTot, "ZZZZZZZZ9.99") : localUtil.format( A14638MDefMetTot, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefMetTot_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefMetTot_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefMetPro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefMetPro_Internalname, httpContext.getMessage( "M. Produccion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefMetPro_Internalname, GXutil.ltrim( localUtil.ntoc( A14639MDefMetPro, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMDefMetPro_Enabled!=0) ? localUtil.format( A14639MDefMetPro, "ZZZZZZZZ9.99") : localUtil.format( A14639MDefMetPro, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefMetPro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefMetPro_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefMetReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefMetReo_Internalname, httpContext.getMessage( "M. Reoperados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefMetReo_Internalname, GXutil.ltrim( localUtil.ntoc( A14640MDefMetReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMDefMetReo_Enabled!=0) ? localUtil.format( A14640MDefMetReo, "ZZZZZZZZ9.99") : localUtil.format( A14640MDefMetReo, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefMetReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefMetReo_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMDefMetPor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMDefMetPor_Internalname, httpContext.getMessage( "M. Porc", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMDefMetPor_Internalname, GXutil.ltrim( localUtil.ntoc( A14641MDefMetPor, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMDefMetPor_Enabled!=0) ? localUtil.format( A14641MDefMetPor, "ZZZ9.99") : localUtil.format( A14641MDefMetPor, "ZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMDefMetPor_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMDefMetPor_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MDef.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MDef.htm");
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
         Z14594MDefId = localUtil.ctol( httpContext.cgiGet( "Z14594MDefId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14624MDefEmprCo = httpContext.cgiGet( "Z14624MDefEmprCo") ;
         Z14597MDefCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z14597MDefCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14625MDefCliNom = httpContext.cgiGet( "Z14625MDefCliNom") ;
         Z14598MDefArtCod = httpContext.cgiGet( "Z14598MDefArtCod") ;
         Z14626MDefArtDsc = httpContext.cgiGet( "Z14626MDefArtDsc") ;
         Z14599MDefColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z14599MDefColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14627MDefColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14627MDefColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14628MDefColNom = httpContext.cgiGet( "Z14628MDefColNom") ;
         Z14601MDefMaqCod = httpContext.cgiGet( "Z14601MDefMaqCod") ;
         Z14629MDefMaqDsc = httpContext.cgiGet( "Z14629MDefMaqDsc") ;
         Z14600MDefTipMCo = httpContext.cgiGet( "Z14600MDefTipMCo") ;
         Z14630MDefTipMDs = httpContext.cgiGet( "Z14630MDefTipMDs") ;
         Z14602MDefDefCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z14602MDefDefCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14631MDefDefDsc = httpContext.cgiGet( "Z14631MDefDefDsc") ;
         Z14632MDefCatCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z14632MDefCatCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14633MDefCatDsc = httpContext.cgiGet( "Z14633MDefCatDsc") ;
         Z14634MDefKilTot = localUtil.ctond( httpContext.cgiGet( "Z14634MDefKilTot")) ;
         Z14635MDefKilPro = localUtil.ctond( httpContext.cgiGet( "Z14635MDefKilPro")) ;
         Z14636MDefKilReo = localUtil.ctond( httpContext.cgiGet( "Z14636MDefKilReo")) ;
         Z14596MDefUsu = httpContext.cgiGet( "Z14596MDefUsu") ;
         Z14595MDefTkn = httpContext.cgiGet( "Z14595MDefTkn") ;
         Z14638MDefMetTot = localUtil.ctond( httpContext.cgiGet( "Z14638MDefMetTot")) ;
         Z14639MDefMetPro = localUtil.ctond( httpContext.cgiGet( "Z14639MDefMetPro")) ;
         Z14640MDefMetReo = localUtil.ctond( httpContext.cgiGet( "Z14640MDefMetReo")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMDefId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMDefId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MDEFID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMDefId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14594MDefId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14594MDefId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14594MDefId), 10, 0));
         }
         else
         {
            A14594MDefId = localUtil.ctol( httpContext.cgiGet( edtMDefId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14594MDefId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14594MDefId), 10, 0));
         }
         A14624MDefEmprCo = httpContext.cgiGet( edtMDefEmprCo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14624MDefEmprCo", A14624MDefEmprCo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMDefCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMDefCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MDEFCLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMDefCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14597MDefCliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14597MDefCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14597MDefCliCod), 6, 0));
         }
         else
         {
            A14597MDefCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMDefCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14597MDefCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14597MDefCliCod), 6, 0));
         }
         A14625MDefCliNom = httpContext.cgiGet( edtMDefCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14625MDefCliNom", A14625MDefCliNom);
         A14598MDefArtCod = httpContext.cgiGet( edtMDefArtCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14598MDefArtCod", A14598MDefArtCod);
         A14626MDefArtDsc = httpContext.cgiGet( edtMDefArtDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14626MDefArtDsc", A14626MDefArtDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMDefColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMDefColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MDEFCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMDefColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14599MDefColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14599MDefColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14599MDefColNum), 6, 0));
         }
         else
         {
            A14599MDefColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtMDefColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14599MDefColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14599MDefColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMDefColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMDefColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MDEFCOLCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMDefColCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14627MDefColCod = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14627MDefColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14627MDefColCod), 2, 0));
         }
         else
         {
            A14627MDefColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtMDefColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14627MDefColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14627MDefColCod), 2, 0));
         }
         A14628MDefColNom = httpContext.cgiGet( edtMDefColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14628MDefColNom", A14628MDefColNom);
         A14601MDefMaqCod = httpContext.cgiGet( edtMDefMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14601MDefMaqCod", A14601MDefMaqCod);
         A14629MDefMaqDsc = httpContext.cgiGet( edtMDefMaqDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14629MDefMaqDsc", A14629MDefMaqDsc);
         A14600MDefTipMCo = httpContext.cgiGet( edtMDefTipMCo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14600MDefTipMCo", A14600MDefTipMCo);
         A14630MDefTipMDs = httpContext.cgiGet( edtMDefTipMDs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14630MDefTipMDs", A14630MDefTipMDs);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMDefDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMDefDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MDEFDEFCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMDefDefCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14602MDefDefCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14602MDefDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14602MDefDefCod), 4, 0));
         }
         else
         {
            A14602MDefDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtMDefDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14602MDefDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14602MDefDefCod), 4, 0));
         }
         A14631MDefDefDsc = httpContext.cgiGet( edtMDefDefDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14631MDefDefDsc", A14631MDefDefDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMDefCatCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMDefCatCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MDEFCATCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMDefCatCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14632MDefCatCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14632MDefCatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14632MDefCatCod), 4, 0));
         }
         else
         {
            A14632MDefCatCod = (short)(localUtil.ctol( httpContext.cgiGet( edtMDefCatCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14632MDefCatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14632MDefCatCod), 4, 0));
         }
         A14633MDefCatDsc = httpContext.cgiGet( edtMDefCatDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14633MDefCatDsc", A14633MDefCatDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMDefKilTot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMDefKilTot_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MDEFKILTOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMDefKilTot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14634MDefKilTot = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A14634MDefKilTot", GXutil.ltrimstr( A14634MDefKilTot, 12, 2));
         }
         else
         {
            A14634MDefKilTot = localUtil.ctond( httpContext.cgiGet( edtMDefKilTot_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14634MDefKilTot", GXutil.ltrimstr( A14634MDefKilTot, 12, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMDefKilPro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMDefKilPro_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MDEFKILPRO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMDefKilPro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14635MDefKilPro = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A14635MDefKilPro", GXutil.ltrimstr( A14635MDefKilPro, 12, 2));
         }
         else
         {
            A14635MDefKilPro = localUtil.ctond( httpContext.cgiGet( edtMDefKilPro_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14635MDefKilPro", GXutil.ltrimstr( A14635MDefKilPro, 12, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMDefKilReo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMDefKilReo_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MDEFKILREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMDefKilReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14636MDefKilReo = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A14636MDefKilReo", GXutil.ltrimstr( A14636MDefKilReo, 12, 2));
         }
         else
         {
            A14636MDefKilReo = localUtil.ctond( httpContext.cgiGet( edtMDefKilReo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14636MDefKilReo", GXutil.ltrimstr( A14636MDefKilReo, 12, 2));
         }
         A14637MDefPorc = localUtil.ctond( httpContext.cgiGet( edtMDefPorc_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14637MDefPorc", GXutil.ltrimstr( A14637MDefPorc, 7, 2));
         A14596MDefUsu = httpContext.cgiGet( edtMDefUsu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14596MDefUsu", A14596MDefUsu);
         A14595MDefTkn = httpContext.cgiGet( edtMDefTkn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14595MDefTkn", A14595MDefTkn);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMDefMetTot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMDefMetTot_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MDEFMETTOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMDefMetTot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14638MDefMetTot = DecimalUtil.ZERO ;
            n14638MDefMetTot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14638MDefMetTot", GXutil.ltrimstr( A14638MDefMetTot, 12, 2));
         }
         else
         {
            A14638MDefMetTot = localUtil.ctond( httpContext.cgiGet( edtMDefMetTot_Internalname)) ;
            n14638MDefMetTot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14638MDefMetTot", GXutil.ltrimstr( A14638MDefMetTot, 12, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMDefMetPro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMDefMetPro_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MDEFMETPRO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMDefMetPro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14639MDefMetPro = DecimalUtil.ZERO ;
            n14639MDefMetPro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14639MDefMetPro", GXutil.ltrimstr( A14639MDefMetPro, 12, 2));
         }
         else
         {
            A14639MDefMetPro = localUtil.ctond( httpContext.cgiGet( edtMDefMetPro_Internalname)) ;
            n14639MDefMetPro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14639MDefMetPro", GXutil.ltrimstr( A14639MDefMetPro, 12, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMDefMetReo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMDefMetReo_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MDEFMETREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMDefMetReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14640MDefMetReo = DecimalUtil.ZERO ;
            n14640MDefMetReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14640MDefMetReo", GXutil.ltrimstr( A14640MDefMetReo, 12, 2));
         }
         else
         {
            A14640MDefMetReo = localUtil.ctond( httpContext.cgiGet( edtMDefMetReo_Internalname)) ;
            n14640MDefMetReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14640MDefMetReo", GXutil.ltrimstr( A14640MDefMetReo, 12, 2));
         }
         A14641MDefMetPor = localUtil.ctond( httpContext.cgiGet( edtMDefMetPor_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14641MDefMetPor", GXutil.ltrimstr( A14641MDefMetPor, 7, 2));
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
            A14594MDefId = GXutil.lval( httpContext.GetPar( "MDefId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14594MDefId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14594MDefId), 10, 0));
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
            initAll1W71919( ) ;
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
      disableAttributes1W71919( ) ;
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

   public void resetCaption1W70( )
   {
   }

   public void zm1W71919( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14624MDefEmprCo = T01W73_A14624MDefEmprCo[0] ;
            Z14597MDefCliCod = T01W73_A14597MDefCliCod[0] ;
            Z14625MDefCliNom = T01W73_A14625MDefCliNom[0] ;
            Z14598MDefArtCod = T01W73_A14598MDefArtCod[0] ;
            Z14626MDefArtDsc = T01W73_A14626MDefArtDsc[0] ;
            Z14599MDefColNum = T01W73_A14599MDefColNum[0] ;
            Z14627MDefColCod = T01W73_A14627MDefColCod[0] ;
            Z14628MDefColNom = T01W73_A14628MDefColNom[0] ;
            Z14601MDefMaqCod = T01W73_A14601MDefMaqCod[0] ;
            Z14629MDefMaqDsc = T01W73_A14629MDefMaqDsc[0] ;
            Z14600MDefTipMCo = T01W73_A14600MDefTipMCo[0] ;
            Z14630MDefTipMDs = T01W73_A14630MDefTipMDs[0] ;
            Z14602MDefDefCod = T01W73_A14602MDefDefCod[0] ;
            Z14631MDefDefDsc = T01W73_A14631MDefDefDsc[0] ;
            Z14632MDefCatCod = T01W73_A14632MDefCatCod[0] ;
            Z14633MDefCatDsc = T01W73_A14633MDefCatDsc[0] ;
            Z14634MDefKilTot = T01W73_A14634MDefKilTot[0] ;
            Z14635MDefKilPro = T01W73_A14635MDefKilPro[0] ;
            Z14636MDefKilReo = T01W73_A14636MDefKilReo[0] ;
            Z14596MDefUsu = T01W73_A14596MDefUsu[0] ;
            Z14595MDefTkn = T01W73_A14595MDefTkn[0] ;
            Z14638MDefMetTot = T01W73_A14638MDefMetTot[0] ;
            Z14639MDefMetPro = T01W73_A14639MDefMetPro[0] ;
            Z14640MDefMetReo = T01W73_A14640MDefMetReo[0] ;
         }
         else
         {
            Z14624MDefEmprCo = A14624MDefEmprCo ;
            Z14597MDefCliCod = A14597MDefCliCod ;
            Z14625MDefCliNom = A14625MDefCliNom ;
            Z14598MDefArtCod = A14598MDefArtCod ;
            Z14626MDefArtDsc = A14626MDefArtDsc ;
            Z14599MDefColNum = A14599MDefColNum ;
            Z14627MDefColCod = A14627MDefColCod ;
            Z14628MDefColNom = A14628MDefColNom ;
            Z14601MDefMaqCod = A14601MDefMaqCod ;
            Z14629MDefMaqDsc = A14629MDefMaqDsc ;
            Z14600MDefTipMCo = A14600MDefTipMCo ;
            Z14630MDefTipMDs = A14630MDefTipMDs ;
            Z14602MDefDefCod = A14602MDefDefCod ;
            Z14631MDefDefDsc = A14631MDefDefDsc ;
            Z14632MDefCatCod = A14632MDefCatCod ;
            Z14633MDefCatDsc = A14633MDefCatDsc ;
            Z14634MDefKilTot = A14634MDefKilTot ;
            Z14635MDefKilPro = A14635MDefKilPro ;
            Z14636MDefKilReo = A14636MDefKilReo ;
            Z14596MDefUsu = A14596MDefUsu ;
            Z14595MDefTkn = A14595MDefTkn ;
            Z14638MDefMetTot = A14638MDefMetTot ;
            Z14639MDefMetPro = A14639MDefMetPro ;
            Z14640MDefMetReo = A14640MDefMetReo ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z14594MDefId = A14594MDefId ;
         Z14624MDefEmprCo = A14624MDefEmprCo ;
         Z14597MDefCliCod = A14597MDefCliCod ;
         Z14625MDefCliNom = A14625MDefCliNom ;
         Z14598MDefArtCod = A14598MDefArtCod ;
         Z14626MDefArtDsc = A14626MDefArtDsc ;
         Z14599MDefColNum = A14599MDefColNum ;
         Z14627MDefColCod = A14627MDefColCod ;
         Z14628MDefColNom = A14628MDefColNom ;
         Z14601MDefMaqCod = A14601MDefMaqCod ;
         Z14629MDefMaqDsc = A14629MDefMaqDsc ;
         Z14600MDefTipMCo = A14600MDefTipMCo ;
         Z14630MDefTipMDs = A14630MDefTipMDs ;
         Z14602MDefDefCod = A14602MDefDefCod ;
         Z14631MDefDefDsc = A14631MDefDefDsc ;
         Z14632MDefCatCod = A14632MDefCatCod ;
         Z14633MDefCatDsc = A14633MDefCatDsc ;
         Z14634MDefKilTot = A14634MDefKilTot ;
         Z14635MDefKilPro = A14635MDefKilPro ;
         Z14636MDefKilReo = A14636MDefKilReo ;
         Z14596MDefUsu = A14596MDefUsu ;
         Z14595MDefTkn = A14595MDefTkn ;
         Z14638MDefMetTot = A14638MDefMetTot ;
         Z14639MDefMetPro = A14639MDefMetPro ;
         Z14640MDefMetReo = A14640MDefMetReo ;
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

   public void load1W71919( )
   {
      /* Using cursor T01W74 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14594MDefId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1919 = (short)(1) ;
         A14624MDefEmprCo = T01W74_A14624MDefEmprCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14624MDefEmprCo", A14624MDefEmprCo);
         A14597MDefCliCod = T01W74_A14597MDefCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14597MDefCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14597MDefCliCod), 6, 0));
         A14625MDefCliNom = T01W74_A14625MDefCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14625MDefCliNom", A14625MDefCliNom);
         A14598MDefArtCod = T01W74_A14598MDefArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14598MDefArtCod", A14598MDefArtCod);
         A14626MDefArtDsc = T01W74_A14626MDefArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14626MDefArtDsc", A14626MDefArtDsc);
         A14599MDefColNum = T01W74_A14599MDefColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14599MDefColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14599MDefColNum), 6, 0));
         A14627MDefColCod = T01W74_A14627MDefColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14627MDefColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14627MDefColCod), 2, 0));
         A14628MDefColNom = T01W74_A14628MDefColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14628MDefColNom", A14628MDefColNom);
         A14601MDefMaqCod = T01W74_A14601MDefMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14601MDefMaqCod", A14601MDefMaqCod);
         A14629MDefMaqDsc = T01W74_A14629MDefMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14629MDefMaqDsc", A14629MDefMaqDsc);
         A14600MDefTipMCo = T01W74_A14600MDefTipMCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14600MDefTipMCo", A14600MDefTipMCo);
         A14630MDefTipMDs = T01W74_A14630MDefTipMDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14630MDefTipMDs", A14630MDefTipMDs);
         A14602MDefDefCod = T01W74_A14602MDefDefCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14602MDefDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14602MDefDefCod), 4, 0));
         A14631MDefDefDsc = T01W74_A14631MDefDefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14631MDefDefDsc", A14631MDefDefDsc);
         A14632MDefCatCod = T01W74_A14632MDefCatCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14632MDefCatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14632MDefCatCod), 4, 0));
         A14633MDefCatDsc = T01W74_A14633MDefCatDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14633MDefCatDsc", A14633MDefCatDsc);
         A14634MDefKilTot = T01W74_A14634MDefKilTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14634MDefKilTot", GXutil.ltrimstr( A14634MDefKilTot, 12, 2));
         A14635MDefKilPro = T01W74_A14635MDefKilPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14635MDefKilPro", GXutil.ltrimstr( A14635MDefKilPro, 12, 2));
         A14636MDefKilReo = T01W74_A14636MDefKilReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14636MDefKilReo", GXutil.ltrimstr( A14636MDefKilReo, 12, 2));
         A14596MDefUsu = T01W74_A14596MDefUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14596MDefUsu", A14596MDefUsu);
         A14595MDefTkn = T01W74_A14595MDefTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14595MDefTkn", A14595MDefTkn);
         A14638MDefMetTot = T01W74_A14638MDefMetTot[0] ;
         n14638MDefMetTot = T01W74_n14638MDefMetTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14638MDefMetTot", GXutil.ltrimstr( A14638MDefMetTot, 12, 2));
         A14639MDefMetPro = T01W74_A14639MDefMetPro[0] ;
         n14639MDefMetPro = T01W74_n14639MDefMetPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14639MDefMetPro", GXutil.ltrimstr( A14639MDefMetPro, 12, 2));
         A14640MDefMetReo = T01W74_A14640MDefMetReo[0] ;
         n14640MDefMetReo = T01W74_n14640MDefMetReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14640MDefMetReo", GXutil.ltrimstr( A14640MDefMetReo, 12, 2));
         zm1W71919( -3) ;
      }
      pr_default.close(2);
      onLoadActions1W71919( ) ;
   }

   public void onLoadActions1W71919( )
   {
      A14637MDefPorc = ((A14635MDefKilPro.doubleValue()>0) ? (A14636MDefKilReo.divide(A14635MDefKilPro, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14637MDefPorc", GXutil.ltrimstr( A14637MDefPorc, 7, 2));
      A14641MDefMetPor = ((A14639MDefMetPro.doubleValue()>0) ? (A14640MDefMetReo.divide(A14639MDefMetPro, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14641MDefMetPor", GXutil.ltrimstr( A14641MDefMetPor, 7, 2));
   }

   public void checkExtendedTable1W71919( )
   {
      nIsDirty_1919 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_1919 = (short)(1) ;
      A14637MDefPorc = ((A14635MDefKilPro.doubleValue()>0) ? (A14636MDefKilReo.divide(A14635MDefKilPro, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14637MDefPorc", GXutil.ltrimstr( A14637MDefPorc, 7, 2));
      nIsDirty_1919 = (short)(1) ;
      A14641MDefMetPor = ((A14639MDefMetPro.doubleValue()>0) ? (A14640MDefMetReo.divide(A14639MDefMetPro, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14641MDefMetPor", GXutil.ltrimstr( A14641MDefMetPor, 7, 2));
   }

   public void closeExtendedTableCursors1W71919( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1W71919( )
   {
      /* Using cursor T01W75 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14594MDefId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1919 = (short)(1) ;
      }
      else
      {
         RcdFound1919 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01W73 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14594MDefId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1W71919( 3) ;
         RcdFound1919 = (short)(1) ;
         A14594MDefId = T01W73_A14594MDefId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14594MDefId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14594MDefId), 10, 0));
         A14624MDefEmprCo = T01W73_A14624MDefEmprCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14624MDefEmprCo", A14624MDefEmprCo);
         A14597MDefCliCod = T01W73_A14597MDefCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14597MDefCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14597MDefCliCod), 6, 0));
         A14625MDefCliNom = T01W73_A14625MDefCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14625MDefCliNom", A14625MDefCliNom);
         A14598MDefArtCod = T01W73_A14598MDefArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14598MDefArtCod", A14598MDefArtCod);
         A14626MDefArtDsc = T01W73_A14626MDefArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14626MDefArtDsc", A14626MDefArtDsc);
         A14599MDefColNum = T01W73_A14599MDefColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14599MDefColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14599MDefColNum), 6, 0));
         A14627MDefColCod = T01W73_A14627MDefColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14627MDefColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14627MDefColCod), 2, 0));
         A14628MDefColNom = T01W73_A14628MDefColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14628MDefColNom", A14628MDefColNom);
         A14601MDefMaqCod = T01W73_A14601MDefMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14601MDefMaqCod", A14601MDefMaqCod);
         A14629MDefMaqDsc = T01W73_A14629MDefMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14629MDefMaqDsc", A14629MDefMaqDsc);
         A14600MDefTipMCo = T01W73_A14600MDefTipMCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14600MDefTipMCo", A14600MDefTipMCo);
         A14630MDefTipMDs = T01W73_A14630MDefTipMDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14630MDefTipMDs", A14630MDefTipMDs);
         A14602MDefDefCod = T01W73_A14602MDefDefCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14602MDefDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14602MDefDefCod), 4, 0));
         A14631MDefDefDsc = T01W73_A14631MDefDefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14631MDefDefDsc", A14631MDefDefDsc);
         A14632MDefCatCod = T01W73_A14632MDefCatCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14632MDefCatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14632MDefCatCod), 4, 0));
         A14633MDefCatDsc = T01W73_A14633MDefCatDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14633MDefCatDsc", A14633MDefCatDsc);
         A14634MDefKilTot = T01W73_A14634MDefKilTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14634MDefKilTot", GXutil.ltrimstr( A14634MDefKilTot, 12, 2));
         A14635MDefKilPro = T01W73_A14635MDefKilPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14635MDefKilPro", GXutil.ltrimstr( A14635MDefKilPro, 12, 2));
         A14636MDefKilReo = T01W73_A14636MDefKilReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14636MDefKilReo", GXutil.ltrimstr( A14636MDefKilReo, 12, 2));
         A14596MDefUsu = T01W73_A14596MDefUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14596MDefUsu", A14596MDefUsu);
         A14595MDefTkn = T01W73_A14595MDefTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14595MDefTkn", A14595MDefTkn);
         A14638MDefMetTot = T01W73_A14638MDefMetTot[0] ;
         n14638MDefMetTot = T01W73_n14638MDefMetTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14638MDefMetTot", GXutil.ltrimstr( A14638MDefMetTot, 12, 2));
         A14639MDefMetPro = T01W73_A14639MDefMetPro[0] ;
         n14639MDefMetPro = T01W73_n14639MDefMetPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14639MDefMetPro", GXutil.ltrimstr( A14639MDefMetPro, 12, 2));
         A14640MDefMetReo = T01W73_A14640MDefMetReo[0] ;
         n14640MDefMetReo = T01W73_n14640MDefMetReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14640MDefMetReo", GXutil.ltrimstr( A14640MDefMetReo, 12, 2));
         Z14594MDefId = A14594MDefId ;
         sMode1919 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1W71919( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1919 = (short)(0) ;
            initializeNonKey1W71919( ) ;
         }
         Gx_mode = sMode1919 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1919 = (short)(0) ;
         initializeNonKey1W71919( ) ;
         sMode1919 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1919 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1W71919( ) ;
      if ( RcdFound1919 == 0 )
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
      RcdFound1919 = (short)(0) ;
      /* Using cursor T01W76 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14594MDefId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01W76_A14594MDefId[0] < A14594MDefId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01W76_A14594MDefId[0] > A14594MDefId ) ) )
         {
            A14594MDefId = T01W76_A14594MDefId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14594MDefId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14594MDefId), 10, 0));
            RcdFound1919 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1919 = (short)(0) ;
      /* Using cursor T01W77 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14594MDefId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01W77_A14594MDefId[0] > A14594MDefId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01W77_A14594MDefId[0] < A14594MDefId ) ) )
         {
            A14594MDefId = T01W77_A14594MDefId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14594MDefId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14594MDefId), 10, 0));
            RcdFound1919 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1W71919( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMDefId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1W71919( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1919 == 1 )
         {
            if ( A14594MDefId != Z14594MDefId )
            {
               A14594MDefId = Z14594MDefId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14594MDefId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14594MDefId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MDEFID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMDefId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMDefId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1W71919( ) ;
               GX_FocusControl = edtMDefId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14594MDefId != Z14594MDefId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMDefId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1W71919( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MDEFID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMDefId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtMDefId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1W71919( ) ;
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
      if ( A14594MDefId != Z14594MDefId )
      {
         A14594MDefId = Z14594MDefId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14594MDefId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14594MDefId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MDEFID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMDefId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMDefId_Internalname ;
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
      if ( RcdFound1919 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "MDEFID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMDefId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMDefEmprCo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1W71919( ) ;
      if ( RcdFound1919 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMDefEmprCo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1W71919( ) ;
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
      if ( RcdFound1919 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMDefEmprCo_Internalname ;
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
      if ( RcdFound1919 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMDefEmprCo_Internalname ;
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
      scanStart1W71919( ) ;
      if ( RcdFound1919 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1919 != 0 )
         {
            scanNext1W71919( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMDefEmprCo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1W71919( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1W71919( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01W72 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14594MDefId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MDef"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14624MDefEmprCo, T01W72_A14624MDefEmprCo[0]) != 0 ) || ( Z14597MDefCliCod != T01W72_A14597MDefCliCod[0] ) || ( GXutil.strcmp(Z14625MDefCliNom, T01W72_A14625MDefCliNom[0]) != 0 ) || ( GXutil.strcmp(Z14598MDefArtCod, T01W72_A14598MDefArtCod[0]) != 0 ) || ( GXutil.strcmp(Z14626MDefArtDsc, T01W72_A14626MDefArtDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14599MDefColNum != T01W72_A14599MDefColNum[0] ) || ( Z14627MDefColCod != T01W72_A14627MDefColCod[0] ) || ( GXutil.strcmp(Z14628MDefColNom, T01W72_A14628MDefColNom[0]) != 0 ) || ( GXutil.strcmp(Z14601MDefMaqCod, T01W72_A14601MDefMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z14629MDefMaqDsc, T01W72_A14629MDefMaqDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14600MDefTipMCo, T01W72_A14600MDefTipMCo[0]) != 0 ) || ( GXutil.strcmp(Z14630MDefTipMDs, T01W72_A14630MDefTipMDs[0]) != 0 ) || ( Z14602MDefDefCod != T01W72_A14602MDefDefCod[0] ) || ( GXutil.strcmp(Z14631MDefDefDsc, T01W72_A14631MDefDefDsc[0]) != 0 ) || ( Z14632MDefCatCod != T01W72_A14632MDefCatCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14633MDefCatDsc, T01W72_A14633MDefCatDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z14634MDefKilTot, T01W72_A14634MDefKilTot[0]) != 0 ) || ( DecimalUtil.compareTo(Z14635MDefKilPro, T01W72_A14635MDefKilPro[0]) != 0 ) || ( DecimalUtil.compareTo(Z14636MDefKilReo, T01W72_A14636MDefKilReo[0]) != 0 ) || ( GXutil.strcmp(Z14596MDefUsu, T01W72_A14596MDefUsu[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14595MDefTkn, T01W72_A14595MDefTkn[0]) != 0 ) || ( DecimalUtil.compareTo(Z14638MDefMetTot, T01W72_A14638MDefMetTot[0]) != 0 ) || ( DecimalUtil.compareTo(Z14639MDefMetPro, T01W72_A14639MDefMetPro[0]) != 0 ) || ( DecimalUtil.compareTo(Z14640MDefMetReo, T01W72_A14640MDefMetReo[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z14624MDefEmprCo, T01W72_A14624MDefEmprCo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefEmprCo");
               GXutil.writeLogRaw("Old: ",Z14624MDefEmprCo);
               GXutil.writeLogRaw("Current: ",T01W72_A14624MDefEmprCo[0]);
            }
            if ( Z14597MDefCliCod != T01W72_A14597MDefCliCod[0] )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefCliCod");
               GXutil.writeLogRaw("Old: ",Z14597MDefCliCod);
               GXutil.writeLogRaw("Current: ",T01W72_A14597MDefCliCod[0]);
            }
            if ( GXutil.strcmp(Z14625MDefCliNom, T01W72_A14625MDefCliNom[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefCliNom");
               GXutil.writeLogRaw("Old: ",Z14625MDefCliNom);
               GXutil.writeLogRaw("Current: ",T01W72_A14625MDefCliNom[0]);
            }
            if ( GXutil.strcmp(Z14598MDefArtCod, T01W72_A14598MDefArtCod[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefArtCod");
               GXutil.writeLogRaw("Old: ",Z14598MDefArtCod);
               GXutil.writeLogRaw("Current: ",T01W72_A14598MDefArtCod[0]);
            }
            if ( GXutil.strcmp(Z14626MDefArtDsc, T01W72_A14626MDefArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefArtDsc");
               GXutil.writeLogRaw("Old: ",Z14626MDefArtDsc);
               GXutil.writeLogRaw("Current: ",T01W72_A14626MDefArtDsc[0]);
            }
            if ( Z14599MDefColNum != T01W72_A14599MDefColNum[0] )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefColNum");
               GXutil.writeLogRaw("Old: ",Z14599MDefColNum);
               GXutil.writeLogRaw("Current: ",T01W72_A14599MDefColNum[0]);
            }
            if ( Z14627MDefColCod != T01W72_A14627MDefColCod[0] )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefColCod");
               GXutil.writeLogRaw("Old: ",Z14627MDefColCod);
               GXutil.writeLogRaw("Current: ",T01W72_A14627MDefColCod[0]);
            }
            if ( GXutil.strcmp(Z14628MDefColNom, T01W72_A14628MDefColNom[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefColNom");
               GXutil.writeLogRaw("Old: ",Z14628MDefColNom);
               GXutil.writeLogRaw("Current: ",T01W72_A14628MDefColNom[0]);
            }
            if ( GXutil.strcmp(Z14601MDefMaqCod, T01W72_A14601MDefMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefMaqCod");
               GXutil.writeLogRaw("Old: ",Z14601MDefMaqCod);
               GXutil.writeLogRaw("Current: ",T01W72_A14601MDefMaqCod[0]);
            }
            if ( GXutil.strcmp(Z14629MDefMaqDsc, T01W72_A14629MDefMaqDsc[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefMaqDsc");
               GXutil.writeLogRaw("Old: ",Z14629MDefMaqDsc);
               GXutil.writeLogRaw("Current: ",T01W72_A14629MDefMaqDsc[0]);
            }
            if ( GXutil.strcmp(Z14600MDefTipMCo, T01W72_A14600MDefTipMCo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefTipMCo");
               GXutil.writeLogRaw("Old: ",Z14600MDefTipMCo);
               GXutil.writeLogRaw("Current: ",T01W72_A14600MDefTipMCo[0]);
            }
            if ( GXutil.strcmp(Z14630MDefTipMDs, T01W72_A14630MDefTipMDs[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefTipMDs");
               GXutil.writeLogRaw("Old: ",Z14630MDefTipMDs);
               GXutil.writeLogRaw("Current: ",T01W72_A14630MDefTipMDs[0]);
            }
            if ( Z14602MDefDefCod != T01W72_A14602MDefDefCod[0] )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefDefCod");
               GXutil.writeLogRaw("Old: ",Z14602MDefDefCod);
               GXutil.writeLogRaw("Current: ",T01W72_A14602MDefDefCod[0]);
            }
            if ( GXutil.strcmp(Z14631MDefDefDsc, T01W72_A14631MDefDefDsc[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefDefDsc");
               GXutil.writeLogRaw("Old: ",Z14631MDefDefDsc);
               GXutil.writeLogRaw("Current: ",T01W72_A14631MDefDefDsc[0]);
            }
            if ( Z14632MDefCatCod != T01W72_A14632MDefCatCod[0] )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefCatCod");
               GXutil.writeLogRaw("Old: ",Z14632MDefCatCod);
               GXutil.writeLogRaw("Current: ",T01W72_A14632MDefCatCod[0]);
            }
            if ( GXutil.strcmp(Z14633MDefCatDsc, T01W72_A14633MDefCatDsc[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefCatDsc");
               GXutil.writeLogRaw("Old: ",Z14633MDefCatDsc);
               GXutil.writeLogRaw("Current: ",T01W72_A14633MDefCatDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z14634MDefKilTot, T01W72_A14634MDefKilTot[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefKilTot");
               GXutil.writeLogRaw("Old: ",Z14634MDefKilTot);
               GXutil.writeLogRaw("Current: ",T01W72_A14634MDefKilTot[0]);
            }
            if ( DecimalUtil.compareTo(Z14635MDefKilPro, T01W72_A14635MDefKilPro[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefKilPro");
               GXutil.writeLogRaw("Old: ",Z14635MDefKilPro);
               GXutil.writeLogRaw("Current: ",T01W72_A14635MDefKilPro[0]);
            }
            if ( DecimalUtil.compareTo(Z14636MDefKilReo, T01W72_A14636MDefKilReo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefKilReo");
               GXutil.writeLogRaw("Old: ",Z14636MDefKilReo);
               GXutil.writeLogRaw("Current: ",T01W72_A14636MDefKilReo[0]);
            }
            if ( GXutil.strcmp(Z14596MDefUsu, T01W72_A14596MDefUsu[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefUsu");
               GXutil.writeLogRaw("Old: ",Z14596MDefUsu);
               GXutil.writeLogRaw("Current: ",T01W72_A14596MDefUsu[0]);
            }
            if ( GXutil.strcmp(Z14595MDefTkn, T01W72_A14595MDefTkn[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefTkn");
               GXutil.writeLogRaw("Old: ",Z14595MDefTkn);
               GXutil.writeLogRaw("Current: ",T01W72_A14595MDefTkn[0]);
            }
            if ( DecimalUtil.compareTo(Z14638MDefMetTot, T01W72_A14638MDefMetTot[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefMetTot");
               GXutil.writeLogRaw("Old: ",Z14638MDefMetTot);
               GXutil.writeLogRaw("Current: ",T01W72_A14638MDefMetTot[0]);
            }
            if ( DecimalUtil.compareTo(Z14639MDefMetPro, T01W72_A14639MDefMetPro[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefMetPro");
               GXutil.writeLogRaw("Old: ",Z14639MDefMetPro);
               GXutil.writeLogRaw("Current: ",T01W72_A14639MDefMetPro[0]);
            }
            if ( DecimalUtil.compareTo(Z14640MDefMetReo, T01W72_A14640MDefMetReo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mdef:[seudo value changed for attri]"+"MDefMetReo");
               GXutil.writeLogRaw("Old: ",Z14640MDefMetReo);
               GXutil.writeLogRaw("Current: ",T01W72_A14640MDefMetReo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"MDef"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1W71919( )
   {
      beforeValidate1W71919( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W71919( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1W71919( 0) ;
         checkOptimisticConcurrency1W71919( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W71919( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1W71919( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W78 */
                  pr_default.execute(6, new Object[] {A14624MDefEmprCo, Integer.valueOf(A14597MDefCliCod), A14625MDefCliNom, A14598MDefArtCod, A14626MDefArtDsc, Integer.valueOf(A14599MDefColNum), Byte.valueOf(A14627MDefColCod), A14628MDefColNom, A14601MDefMaqCod, A14629MDefMaqDsc, A14600MDefTipMCo, A14630MDefTipMDs, Short.valueOf(A14602MDefDefCod), A14631MDefDefDsc, Short.valueOf(A14632MDefCatCod), A14633MDefCatDsc, A14634MDefKilTot, A14635MDefKilPro, A14636MDefKilReo, A14596MDefUsu, A14595MDefTkn, Boolean.valueOf(n14638MDefMetTot), A14638MDefMetTot, Boolean.valueOf(n14639MDefMetPro), A14639MDefMetPro, Boolean.valueOf(n14640MDefMetReo), A14640MDefMetReo});
                  /* Retrieving last key number assigned */
                  /* Using cursor T01W79 */
                  pr_default.execute(7);
                  A14594MDefId = T01W79_A14594MDefId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14594MDefId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14594MDefId), 10, 0));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MDef");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1W70( ) ;
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
            load1W71919( ) ;
         }
         endLevel1W71919( ) ;
      }
      closeExtendedTableCursors1W71919( ) ;
   }

   public void update1W71919( )
   {
      beforeValidate1W71919( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W71919( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W71919( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W71919( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1W71919( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W710 */
                  pr_default.execute(8, new Object[] {A14624MDefEmprCo, Integer.valueOf(A14597MDefCliCod), A14625MDefCliNom, A14598MDefArtCod, A14626MDefArtDsc, Integer.valueOf(A14599MDefColNum), Byte.valueOf(A14627MDefColCod), A14628MDefColNom, A14601MDefMaqCod, A14629MDefMaqDsc, A14600MDefTipMCo, A14630MDefTipMDs, Short.valueOf(A14602MDefDefCod), A14631MDefDefDsc, Short.valueOf(A14632MDefCatCod), A14633MDefCatDsc, A14634MDefKilTot, A14635MDefKilPro, A14636MDefKilReo, A14596MDefUsu, A14595MDefTkn, Boolean.valueOf(n14638MDefMetTot), A14638MDefMetTot, Boolean.valueOf(n14639MDefMetPro), A14639MDefMetPro, Boolean.valueOf(n14640MDefMetReo), A14640MDefMetReo, Long.valueOf(A14594MDefId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MDef");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MDef"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1W71919( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1W70( ) ;
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
         endLevel1W71919( ) ;
      }
      closeExtendedTableCursors1W71919( ) ;
   }

   public void deferredUpdate1W71919( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1W71919( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W71919( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1W71919( ) ;
         afterConfirm1W71919( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1W71919( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01W711 */
               pr_default.execute(9, new Object[] {Long.valueOf(A14594MDefId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("MDef");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1919 == 0 )
                     {
                        initAll1W71919( ) ;
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
                     resetCaption1W70( ) ;
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
      sMode1919 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1W71919( ) ;
      Gx_mode = sMode1919 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1W71919( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A14637MDefPorc = ((A14635MDefKilPro.doubleValue()>0) ? (A14636MDefKilReo.divide(A14635MDefKilPro, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14637MDefPorc", GXutil.ltrimstr( A14637MDefPorc, 7, 2));
         A14641MDefMetPor = ((A14639MDefMetPro.doubleValue()>0) ? (A14640MDefMetReo.divide(A14639MDefMetPro, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14641MDefMetPor", GXutil.ltrimstr( A14641MDefMetPor, 7, 2));
      }
   }

   public void endLevel1W71919( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1W71919( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "anticipacionerrores.mdef");
         if ( AnyError == 0 )
         {
            confirmValues1W70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "anticipacionerrores.mdef");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1W71919( )
   {
      /* Using cursor T01W712 */
      pr_default.execute(10);
      RcdFound1919 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1919 = (short)(1) ;
         A14594MDefId = T01W712_A14594MDefId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14594MDefId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14594MDefId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1W71919( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1919 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1919 = (short)(1) ;
         A14594MDefId = T01W712_A14594MDefId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14594MDefId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14594MDefId), 10, 0));
      }
   }

   public void scanEnd1W71919( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1W71919( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1W71919( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1W71919( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1W71919( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1W71919( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1W71919( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1W71919( )
   {
      edtMDefId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefId_Enabled), 5, 0), true);
      edtMDefEmprCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefEmprCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefEmprCo_Enabled), 5, 0), true);
      edtMDefCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefCliCod_Enabled), 5, 0), true);
      edtMDefCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefCliNom_Enabled), 5, 0), true);
      edtMDefArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefArtCod_Enabled), 5, 0), true);
      edtMDefArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefArtDsc_Enabled), 5, 0), true);
      edtMDefColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefColNum_Enabled), 5, 0), true);
      edtMDefColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefColCod_Enabled), 5, 0), true);
      edtMDefColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefColNom_Enabled), 5, 0), true);
      edtMDefMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefMaqCod_Enabled), 5, 0), true);
      edtMDefMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefMaqDsc_Enabled), 5, 0), true);
      edtMDefTipMCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefTipMCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefTipMCo_Enabled), 5, 0), true);
      edtMDefTipMDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefTipMDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefTipMDs_Enabled), 5, 0), true);
      edtMDefDefCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefDefCod_Enabled), 5, 0), true);
      edtMDefDefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefDefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefDefDsc_Enabled), 5, 0), true);
      edtMDefCatCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefCatCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefCatCod_Enabled), 5, 0), true);
      edtMDefCatDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefCatDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefCatDsc_Enabled), 5, 0), true);
      edtMDefKilTot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefKilTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefKilTot_Enabled), 5, 0), true);
      edtMDefKilPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefKilPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefKilPro_Enabled), 5, 0), true);
      edtMDefKilReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefKilReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefKilReo_Enabled), 5, 0), true);
      edtMDefPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefPorc_Enabled), 5, 0), true);
      edtMDefUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefUsu_Enabled), 5, 0), true);
      edtMDefTkn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefTkn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefTkn_Enabled), 5, 0), true);
      edtMDefMetTot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefMetTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefMetTot_Enabled), 5, 0), true);
      edtMDefMetPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefMetPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefMetPro_Enabled), 5, 0), true);
      edtMDefMetReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefMetReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefMetReo_Enabled), 5, 0), true);
      edtMDefMetPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMDefMetPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMDefMetPor_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1W71919( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1W70( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.anticipacionerrores.mdef", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14594MDefId", GXutil.ltrim( localUtil.ntoc( Z14594MDefId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14624MDefEmprCo", GXutil.rtrim( Z14624MDefEmprCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14597MDefCliCod", GXutil.ltrim( localUtil.ntoc( Z14597MDefCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14625MDefCliNom", Z14625MDefCliNom);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14598MDefArtCod", GXutil.rtrim( Z14598MDefArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14626MDefArtDsc", Z14626MDefArtDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14599MDefColNum", GXutil.ltrim( localUtil.ntoc( Z14599MDefColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14627MDefColCod", GXutil.ltrim( localUtil.ntoc( Z14627MDefColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14628MDefColNom", GXutil.rtrim( Z14628MDefColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14601MDefMaqCod", GXutil.rtrim( Z14601MDefMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14629MDefMaqDsc", Z14629MDefMaqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14600MDefTipMCo", GXutil.rtrim( Z14600MDefTipMCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14630MDefTipMDs", Z14630MDefTipMDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14602MDefDefCod", GXutil.ltrim( localUtil.ntoc( Z14602MDefDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14631MDefDefDsc", Z14631MDefDefDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14632MDefCatCod", GXutil.ltrim( localUtil.ntoc( Z14632MDefCatCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14633MDefCatDsc", Z14633MDefCatDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14634MDefKilTot", GXutil.ltrim( localUtil.ntoc( Z14634MDefKilTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14635MDefKilPro", GXutil.ltrim( localUtil.ntoc( Z14635MDefKilPro, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14636MDefKilReo", GXutil.ltrim( localUtil.ntoc( Z14636MDefKilReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14596MDefUsu", GXutil.rtrim( Z14596MDefUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14595MDefTkn", Z14595MDefTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14638MDefMetTot", GXutil.ltrim( localUtil.ntoc( Z14638MDefMetTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14639MDefMetPro", GXutil.ltrim( localUtil.ntoc( Z14639MDefMetPro, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14640MDefMetReo", GXutil.ltrim( localUtil.ntoc( Z14640MDefMetReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.anticipacionerrores.mdef", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "AnticipacionErrores.MDef" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MDef", "") ;
   }

   public void initializeNonKey1W71919( )
   {
      A14641MDefMetPor = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14641MDefMetPor", GXutil.ltrimstr( A14641MDefMetPor, 7, 2));
      A14637MDefPorc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14637MDefPorc", GXutil.ltrimstr( A14637MDefPorc, 7, 2));
      A14624MDefEmprCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14624MDefEmprCo", A14624MDefEmprCo);
      A14597MDefCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14597MDefCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14597MDefCliCod), 6, 0));
      A14625MDefCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14625MDefCliNom", A14625MDefCliNom);
      A14598MDefArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14598MDefArtCod", A14598MDefArtCod);
      A14626MDefArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14626MDefArtDsc", A14626MDefArtDsc);
      A14599MDefColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14599MDefColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14599MDefColNum), 6, 0));
      A14627MDefColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14627MDefColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14627MDefColCod), 2, 0));
      A14628MDefColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14628MDefColNom", A14628MDefColNom);
      A14601MDefMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14601MDefMaqCod", A14601MDefMaqCod);
      A14629MDefMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14629MDefMaqDsc", A14629MDefMaqDsc);
      A14600MDefTipMCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14600MDefTipMCo", A14600MDefTipMCo);
      A14630MDefTipMDs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14630MDefTipMDs", A14630MDefTipMDs);
      A14602MDefDefCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14602MDefDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14602MDefDefCod), 4, 0));
      A14631MDefDefDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14631MDefDefDsc", A14631MDefDefDsc);
      A14632MDefCatCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14632MDefCatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14632MDefCatCod), 4, 0));
      A14633MDefCatDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14633MDefCatDsc", A14633MDefCatDsc);
      A14634MDefKilTot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14634MDefKilTot", GXutil.ltrimstr( A14634MDefKilTot, 12, 2));
      A14635MDefKilPro = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14635MDefKilPro", GXutil.ltrimstr( A14635MDefKilPro, 12, 2));
      A14636MDefKilReo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14636MDefKilReo", GXutil.ltrimstr( A14636MDefKilReo, 12, 2));
      A14596MDefUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14596MDefUsu", A14596MDefUsu);
      A14595MDefTkn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14595MDefTkn", A14595MDefTkn);
      A14638MDefMetTot = DecimalUtil.ZERO ;
      n14638MDefMetTot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14638MDefMetTot", GXutil.ltrimstr( A14638MDefMetTot, 12, 2));
      A14639MDefMetPro = DecimalUtil.ZERO ;
      n14639MDefMetPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14639MDefMetPro", GXutil.ltrimstr( A14639MDefMetPro, 12, 2));
      A14640MDefMetReo = DecimalUtil.ZERO ;
      n14640MDefMetReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14640MDefMetReo", GXutil.ltrimstr( A14640MDefMetReo, 12, 2));
      Z14624MDefEmprCo = "" ;
      Z14597MDefCliCod = 0 ;
      Z14625MDefCliNom = "" ;
      Z14598MDefArtCod = "" ;
      Z14626MDefArtDsc = "" ;
      Z14599MDefColNum = 0 ;
      Z14627MDefColCod = (byte)(0) ;
      Z14628MDefColNom = "" ;
      Z14601MDefMaqCod = "" ;
      Z14629MDefMaqDsc = "" ;
      Z14600MDefTipMCo = "" ;
      Z14630MDefTipMDs = "" ;
      Z14602MDefDefCod = (short)(0) ;
      Z14631MDefDefDsc = "" ;
      Z14632MDefCatCod = (short)(0) ;
      Z14633MDefCatDsc = "" ;
      Z14634MDefKilTot = DecimalUtil.ZERO ;
      Z14635MDefKilPro = DecimalUtil.ZERO ;
      Z14636MDefKilReo = DecimalUtil.ZERO ;
      Z14596MDefUsu = "" ;
      Z14595MDefTkn = "" ;
      Z14638MDefMetTot = DecimalUtil.ZERO ;
      Z14639MDefMetPro = DecimalUtil.ZERO ;
      Z14640MDefMetReo = DecimalUtil.ZERO ;
   }

   public void initAll1W71919( )
   {
      A14594MDefId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14594MDefId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14594MDefId), 10, 0));
      initializeNonKey1W71919( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026799163436", true, true);
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
      httpContext.AddJavascriptSource("anticipacionerrores/mdef.js", "?2026799163436", false, true);
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
      edtMDefId_Internalname = "MDEFID" ;
      edtMDefEmprCo_Internalname = "MDEFEMPRCO" ;
      edtMDefCliCod_Internalname = "MDEFCLICOD" ;
      edtMDefCliNom_Internalname = "MDEFCLINOM" ;
      edtMDefArtCod_Internalname = "MDEFARTCOD" ;
      edtMDefArtDsc_Internalname = "MDEFARTDSC" ;
      edtMDefColNum_Internalname = "MDEFCOLNUM" ;
      edtMDefColCod_Internalname = "MDEFCOLCOD" ;
      edtMDefColNom_Internalname = "MDEFCOLNOM" ;
      edtMDefMaqCod_Internalname = "MDEFMAQCOD" ;
      edtMDefMaqDsc_Internalname = "MDEFMAQDSC" ;
      edtMDefTipMCo_Internalname = "MDEFTIPMCO" ;
      edtMDefTipMDs_Internalname = "MDEFTIPMDS" ;
      edtMDefDefCod_Internalname = "MDEFDEFCOD" ;
      edtMDefDefDsc_Internalname = "MDEFDEFDSC" ;
      edtMDefCatCod_Internalname = "MDEFCATCOD" ;
      edtMDefCatDsc_Internalname = "MDEFCATDSC" ;
      edtMDefKilTot_Internalname = "MDEFKILTOT" ;
      edtMDefKilPro_Internalname = "MDEFKILPRO" ;
      edtMDefKilReo_Internalname = "MDEFKILREO" ;
      edtMDefPorc_Internalname = "MDEFPORC" ;
      edtMDefUsu_Internalname = "MDEFUSU" ;
      edtMDefTkn_Internalname = "MDEFTKN" ;
      edtMDefMetTot_Internalname = "MDEFMETTOT" ;
      edtMDefMetPro_Internalname = "MDEFMETPRO" ;
      edtMDefMetReo_Internalname = "MDEFMETREO" ;
      edtMDefMetPor_Internalname = "MDEFMETPOR" ;
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
      Form.setCaption( httpContext.getMessage( "MDef", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMDefMetPor_Jsonclick = "" ;
      edtMDefMetPor_Enabled = 0 ;
      edtMDefMetReo_Jsonclick = "" ;
      edtMDefMetReo_Enabled = 1 ;
      edtMDefMetPro_Jsonclick = "" ;
      edtMDefMetPro_Enabled = 1 ;
      edtMDefMetTot_Jsonclick = "" ;
      edtMDefMetTot_Enabled = 1 ;
      edtMDefTkn_Enabled = 1 ;
      edtMDefUsu_Jsonclick = "" ;
      edtMDefUsu_Enabled = 1 ;
      edtMDefPorc_Jsonclick = "" ;
      edtMDefPorc_Enabled = 0 ;
      edtMDefKilReo_Jsonclick = "" ;
      edtMDefKilReo_Enabled = 1 ;
      edtMDefKilPro_Jsonclick = "" ;
      edtMDefKilPro_Enabled = 1 ;
      edtMDefKilTot_Jsonclick = "" ;
      edtMDefKilTot_Enabled = 1 ;
      edtMDefCatDsc_Enabled = 1 ;
      edtMDefCatCod_Jsonclick = "" ;
      edtMDefCatCod_Enabled = 1 ;
      edtMDefDefDsc_Enabled = 1 ;
      edtMDefDefCod_Jsonclick = "" ;
      edtMDefDefCod_Enabled = 1 ;
      edtMDefTipMDs_Enabled = 1 ;
      edtMDefTipMCo_Jsonclick = "" ;
      edtMDefTipMCo_Enabled = 1 ;
      edtMDefMaqDsc_Enabled = 1 ;
      edtMDefMaqCod_Jsonclick = "" ;
      edtMDefMaqCod_Enabled = 1 ;
      edtMDefColNom_Jsonclick = "" ;
      edtMDefColNom_Enabled = 1 ;
      edtMDefColCod_Jsonclick = "" ;
      edtMDefColCod_Enabled = 1 ;
      edtMDefColNum_Jsonclick = "" ;
      edtMDefColNum_Enabled = 1 ;
      edtMDefArtDsc_Enabled = 1 ;
      edtMDefArtCod_Jsonclick = "" ;
      edtMDefArtCod_Enabled = 1 ;
      edtMDefCliNom_Enabled = 1 ;
      edtMDefCliCod_Jsonclick = "" ;
      edtMDefCliCod_Enabled = 1 ;
      edtMDefEmprCo_Jsonclick = "" ;
      edtMDefEmprCo_Enabled = 1 ;
      edtMDefId_Jsonclick = "" ;
      edtMDefId_Enabled = 1 ;
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
      GX_FocusControl = edtMDefEmprCo_Internalname ;
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

   public void valid_Mdefid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14624MDefEmprCo", GXutil.rtrim( A14624MDefEmprCo));
      httpContext.ajax_rsp_assign_attri("", false, "A14597MDefCliCod", GXutil.ltrim( localUtil.ntoc( A14597MDefCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14625MDefCliNom", A14625MDefCliNom);
      httpContext.ajax_rsp_assign_attri("", false, "A14598MDefArtCod", GXutil.rtrim( A14598MDefArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14626MDefArtDsc", A14626MDefArtDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14599MDefColNum", GXutil.ltrim( localUtil.ntoc( A14599MDefColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14627MDefColCod", GXutil.ltrim( localUtil.ntoc( A14627MDefColCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14628MDefColNom", GXutil.rtrim( A14628MDefColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A14601MDefMaqCod", GXutil.rtrim( A14601MDefMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14629MDefMaqDsc", A14629MDefMaqDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14600MDefTipMCo", GXutil.rtrim( A14600MDefTipMCo));
      httpContext.ajax_rsp_assign_attri("", false, "A14630MDefTipMDs", A14630MDefTipMDs);
      httpContext.ajax_rsp_assign_attri("", false, "A14602MDefDefCod", GXutil.ltrim( localUtil.ntoc( A14602MDefDefCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14631MDefDefDsc", A14631MDefDefDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14632MDefCatCod", GXutil.ltrim( localUtil.ntoc( A14632MDefCatCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14633MDefCatDsc", A14633MDefCatDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14634MDefKilTot", GXutil.ltrim( localUtil.ntoc( A14634MDefKilTot, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14635MDefKilPro", GXutil.ltrim( localUtil.ntoc( A14635MDefKilPro, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14636MDefKilReo", GXutil.ltrim( localUtil.ntoc( A14636MDefKilReo, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14596MDefUsu", GXutil.rtrim( A14596MDefUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A14595MDefTkn", A14595MDefTkn);
      httpContext.ajax_rsp_assign_attri("", false, "A14638MDefMetTot", GXutil.ltrim( localUtil.ntoc( A14638MDefMetTot, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14639MDefMetPro", GXutil.ltrim( localUtil.ntoc( A14639MDefMetPro, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14640MDefMetReo", GXutil.ltrim( localUtil.ntoc( A14640MDefMetReo, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14637MDefPorc", GXutil.ltrim( localUtil.ntoc( A14637MDefPorc, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14641MDefMetPor", GXutil.ltrim( localUtil.ntoc( A14641MDefMetPor, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14594MDefId", GXutil.ltrim( localUtil.ntoc( Z14594MDefId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14624MDefEmprCo", GXutil.rtrim( Z14624MDefEmprCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14597MDefCliCod", GXutil.ltrim( localUtil.ntoc( Z14597MDefCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14625MDefCliNom", Z14625MDefCliNom);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14598MDefArtCod", GXutil.rtrim( Z14598MDefArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14626MDefArtDsc", Z14626MDefArtDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14599MDefColNum", GXutil.ltrim( localUtil.ntoc( Z14599MDefColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14627MDefColCod", GXutil.ltrim( localUtil.ntoc( Z14627MDefColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14628MDefColNom", GXutil.rtrim( Z14628MDefColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14601MDefMaqCod", GXutil.rtrim( Z14601MDefMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14629MDefMaqDsc", Z14629MDefMaqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14600MDefTipMCo", GXutil.rtrim( Z14600MDefTipMCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14630MDefTipMDs", Z14630MDefTipMDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14602MDefDefCod", GXutil.ltrim( localUtil.ntoc( Z14602MDefDefCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14631MDefDefDsc", Z14631MDefDefDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14632MDefCatCod", GXutil.ltrim( localUtil.ntoc( Z14632MDefCatCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14633MDefCatDsc", Z14633MDefCatDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14634MDefKilTot", GXutil.ltrim( localUtil.ntoc( Z14634MDefKilTot, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14635MDefKilPro", GXutil.ltrim( localUtil.ntoc( Z14635MDefKilPro, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14636MDefKilReo", GXutil.ltrim( localUtil.ntoc( Z14636MDefKilReo, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14596MDefUsu", GXutil.rtrim( Z14596MDefUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14595MDefTkn", Z14595MDefTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14638MDefMetTot", GXutil.ltrim( localUtil.ntoc( Z14638MDefMetTot, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14639MDefMetPro", GXutil.ltrim( localUtil.ntoc( Z14639MDefMetPro, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14640MDefMetReo", GXutil.ltrim( localUtil.ntoc( Z14640MDefMetReo, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14637MDefPorc", GXutil.ltrim( localUtil.ntoc( Z14637MDefPorc, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14641MDefMetPor", GXutil.ltrim( localUtil.ntoc( Z14641MDefMetPor, (byte)(7), (byte)(2), ".", "")));
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
      setEventMetadata("VALID_MDEFID","{handler:'valid_Mdefid',iparms:[{av:'A14594MDefId',fld:'MDEFID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MDEFID",",oparms:[{av:'A14624MDefEmprCo',fld:'MDEFEMPRCO',pic:''},{av:'A14597MDefCliCod',fld:'MDEFCLICOD',pic:'ZZZZZ9'},{av:'A14625MDefCliNom',fld:'MDEFCLINOM',pic:''},{av:'A14598MDefArtCod',fld:'MDEFARTCOD',pic:''},{av:'A14626MDefArtDsc',fld:'MDEFARTDSC',pic:''},{av:'A14599MDefColNum',fld:'MDEFCOLNUM',pic:'ZZZZZ9'},{av:'A14627MDefColCod',fld:'MDEFCOLCOD',pic:'Z9'},{av:'A14628MDefColNom',fld:'MDEFCOLNOM',pic:''},{av:'A14601MDefMaqCod',fld:'MDEFMAQCOD',pic:''},{av:'A14629MDefMaqDsc',fld:'MDEFMAQDSC',pic:''},{av:'A14600MDefTipMCo',fld:'MDEFTIPMCO',pic:''},{av:'A14630MDefTipMDs',fld:'MDEFTIPMDS',pic:''},{av:'A14602MDefDefCod',fld:'MDEFDEFCOD',pic:'ZZZ9'},{av:'A14631MDefDefDsc',fld:'MDEFDEFDSC',pic:''},{av:'A14632MDefCatCod',fld:'MDEFCATCOD',pic:'ZZZ9'},{av:'A14633MDefCatDsc',fld:'MDEFCATDSC',pic:''},{av:'A14634MDefKilTot',fld:'MDEFKILTOT',pic:'ZZZZZZZZ9.99'},{av:'A14635MDefKilPro',fld:'MDEFKILPRO',pic:'ZZZZZZZZ9.99'},{av:'A14636MDefKilReo',fld:'MDEFKILREO',pic:'ZZZZZZZZ9.99'},{av:'A14596MDefUsu',fld:'MDEFUSU',pic:''},{av:'A14595MDefTkn',fld:'MDEFTKN',pic:''},{av:'A14638MDefMetTot',fld:'MDEFMETTOT',pic:'ZZZZZZZZ9.99'},{av:'A14639MDefMetPro',fld:'MDEFMETPRO',pic:'ZZZZZZZZ9.99'},{av:'A14640MDefMetReo',fld:'MDEFMETREO',pic:'ZZZZZZZZ9.99'},{av:'A14637MDefPorc',fld:'MDEFPORC',pic:'ZZZ9.99'},{av:'A14641MDefMetPor',fld:'MDEFMETPOR',pic:'ZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14594MDefId'},{av:'Z14624MDefEmprCo'},{av:'Z14597MDefCliCod'},{av:'Z14625MDefCliNom'},{av:'Z14598MDefArtCod'},{av:'Z14626MDefArtDsc'},{av:'Z14599MDefColNum'},{av:'Z14627MDefColCod'},{av:'Z14628MDefColNom'},{av:'Z14601MDefMaqCod'},{av:'Z14629MDefMaqDsc'},{av:'Z14600MDefTipMCo'},{av:'Z14630MDefTipMDs'},{av:'Z14602MDefDefCod'},{av:'Z14631MDefDefDsc'},{av:'Z14632MDefCatCod'},{av:'Z14633MDefCatDsc'},{av:'Z14634MDefKilTot'},{av:'Z14635MDefKilPro'},{av:'Z14636MDefKilReo'},{av:'Z14596MDefUsu'},{av:'Z14595MDefTkn'},{av:'Z14638MDefMetTot'},{av:'Z14639MDefMetPro'},{av:'Z14640MDefMetReo'},{av:'Z14637MDefPorc'},{av:'Z14641MDefMetPor'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_MDEFKILPRO","{handler:'valid_Mdefkilpro',iparms:[]");
      setEventMetadata("VALID_MDEFKILPRO",",oparms:[]}");
      setEventMetadata("VALID_MDEFKILREO","{handler:'valid_Mdefkilreo',iparms:[]");
      setEventMetadata("VALID_MDEFKILREO",",oparms:[]}");
      setEventMetadata("VALID_MDEFMETPRO","{handler:'valid_Mdefmetpro',iparms:[]");
      setEventMetadata("VALID_MDEFMETPRO",",oparms:[]}");
      setEventMetadata("VALID_MDEFMETREO","{handler:'valid_Mdefmetreo',iparms:[]");
      setEventMetadata("VALID_MDEFMETREO",",oparms:[]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z14624MDefEmprCo = "" ;
      Z14625MDefCliNom = "" ;
      Z14598MDefArtCod = "" ;
      Z14626MDefArtDsc = "" ;
      Z14628MDefColNom = "" ;
      Z14601MDefMaqCod = "" ;
      Z14629MDefMaqDsc = "" ;
      Z14600MDefTipMCo = "" ;
      Z14630MDefTipMDs = "" ;
      Z14631MDefDefDsc = "" ;
      Z14633MDefCatDsc = "" ;
      Z14634MDefKilTot = DecimalUtil.ZERO ;
      Z14635MDefKilPro = DecimalUtil.ZERO ;
      Z14636MDefKilReo = DecimalUtil.ZERO ;
      Z14596MDefUsu = "" ;
      Z14595MDefTkn = "" ;
      Z14638MDefMetTot = DecimalUtil.ZERO ;
      Z14639MDefMetPro = DecimalUtil.ZERO ;
      Z14640MDefMetReo = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A14624MDefEmprCo = "" ;
      A14625MDefCliNom = "" ;
      A14598MDefArtCod = "" ;
      A14626MDefArtDsc = "" ;
      A14628MDefColNom = "" ;
      A14601MDefMaqCod = "" ;
      A14629MDefMaqDsc = "" ;
      A14600MDefTipMCo = "" ;
      A14630MDefTipMDs = "" ;
      A14631MDefDefDsc = "" ;
      A14633MDefCatDsc = "" ;
      A14634MDefKilTot = DecimalUtil.ZERO ;
      A14635MDefKilPro = DecimalUtil.ZERO ;
      A14636MDefKilReo = DecimalUtil.ZERO ;
      A14637MDefPorc = DecimalUtil.ZERO ;
      A14596MDefUsu = "" ;
      A14595MDefTkn = "" ;
      A14638MDefMetTot = DecimalUtil.ZERO ;
      A14639MDefMetPro = DecimalUtil.ZERO ;
      A14640MDefMetReo = DecimalUtil.ZERO ;
      A14641MDefMetPor = DecimalUtil.ZERO ;
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
      T01W74_A14594MDefId = new long[1] ;
      T01W74_A14624MDefEmprCo = new String[] {""} ;
      T01W74_A14597MDefCliCod = new int[1] ;
      T01W74_A14625MDefCliNom = new String[] {""} ;
      T01W74_A14598MDefArtCod = new String[] {""} ;
      T01W74_A14626MDefArtDsc = new String[] {""} ;
      T01W74_A14599MDefColNum = new int[1] ;
      T01W74_A14627MDefColCod = new byte[1] ;
      T01W74_A14628MDefColNom = new String[] {""} ;
      T01W74_A14601MDefMaqCod = new String[] {""} ;
      T01W74_A14629MDefMaqDsc = new String[] {""} ;
      T01W74_A14600MDefTipMCo = new String[] {""} ;
      T01W74_A14630MDefTipMDs = new String[] {""} ;
      T01W74_A14602MDefDefCod = new short[1] ;
      T01W74_A14631MDefDefDsc = new String[] {""} ;
      T01W74_A14632MDefCatCod = new short[1] ;
      T01W74_A14633MDefCatDsc = new String[] {""} ;
      T01W74_A14634MDefKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W74_A14635MDefKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W74_A14636MDefKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W74_A14596MDefUsu = new String[] {""} ;
      T01W74_A14595MDefTkn = new String[] {""} ;
      T01W74_A14638MDefMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W74_n14638MDefMetTot = new boolean[] {false} ;
      T01W74_A14639MDefMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W74_n14639MDefMetPro = new boolean[] {false} ;
      T01W74_A14640MDefMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W74_n14640MDefMetReo = new boolean[] {false} ;
      T01W75_A14594MDefId = new long[1] ;
      T01W73_A14594MDefId = new long[1] ;
      T01W73_A14624MDefEmprCo = new String[] {""} ;
      T01W73_A14597MDefCliCod = new int[1] ;
      T01W73_A14625MDefCliNom = new String[] {""} ;
      T01W73_A14598MDefArtCod = new String[] {""} ;
      T01W73_A14626MDefArtDsc = new String[] {""} ;
      T01W73_A14599MDefColNum = new int[1] ;
      T01W73_A14627MDefColCod = new byte[1] ;
      T01W73_A14628MDefColNom = new String[] {""} ;
      T01W73_A14601MDefMaqCod = new String[] {""} ;
      T01W73_A14629MDefMaqDsc = new String[] {""} ;
      T01W73_A14600MDefTipMCo = new String[] {""} ;
      T01W73_A14630MDefTipMDs = new String[] {""} ;
      T01W73_A14602MDefDefCod = new short[1] ;
      T01W73_A14631MDefDefDsc = new String[] {""} ;
      T01W73_A14632MDefCatCod = new short[1] ;
      T01W73_A14633MDefCatDsc = new String[] {""} ;
      T01W73_A14634MDefKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W73_A14635MDefKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W73_A14636MDefKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W73_A14596MDefUsu = new String[] {""} ;
      T01W73_A14595MDefTkn = new String[] {""} ;
      T01W73_A14638MDefMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W73_n14638MDefMetTot = new boolean[] {false} ;
      T01W73_A14639MDefMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W73_n14639MDefMetPro = new boolean[] {false} ;
      T01W73_A14640MDefMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W73_n14640MDefMetReo = new boolean[] {false} ;
      sMode1919 = "" ;
      T01W76_A14594MDefId = new long[1] ;
      T01W77_A14594MDefId = new long[1] ;
      T01W72_A14594MDefId = new long[1] ;
      T01W72_A14624MDefEmprCo = new String[] {""} ;
      T01W72_A14597MDefCliCod = new int[1] ;
      T01W72_A14625MDefCliNom = new String[] {""} ;
      T01W72_A14598MDefArtCod = new String[] {""} ;
      T01W72_A14626MDefArtDsc = new String[] {""} ;
      T01W72_A14599MDefColNum = new int[1] ;
      T01W72_A14627MDefColCod = new byte[1] ;
      T01W72_A14628MDefColNom = new String[] {""} ;
      T01W72_A14601MDefMaqCod = new String[] {""} ;
      T01W72_A14629MDefMaqDsc = new String[] {""} ;
      T01W72_A14600MDefTipMCo = new String[] {""} ;
      T01W72_A14630MDefTipMDs = new String[] {""} ;
      T01W72_A14602MDefDefCod = new short[1] ;
      T01W72_A14631MDefDefDsc = new String[] {""} ;
      T01W72_A14632MDefCatCod = new short[1] ;
      T01W72_A14633MDefCatDsc = new String[] {""} ;
      T01W72_A14634MDefKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W72_A14635MDefKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W72_A14636MDefKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W72_A14596MDefUsu = new String[] {""} ;
      T01W72_A14595MDefTkn = new String[] {""} ;
      T01W72_A14638MDefMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W72_n14638MDefMetTot = new boolean[] {false} ;
      T01W72_A14639MDefMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W72_n14639MDefMetPro = new boolean[] {false} ;
      T01W72_A14640MDefMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W72_n14640MDefMetReo = new boolean[] {false} ;
      T01W79_A14594MDefId = new long[1] ;
      T01W712_A14594MDefId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z14637MDefPorc = DecimalUtil.ZERO ;
      Z14641MDefMetPor = DecimalUtil.ZERO ;
      ZZ14624MDefEmprCo = "" ;
      ZZ14625MDefCliNom = "" ;
      ZZ14598MDefArtCod = "" ;
      ZZ14626MDefArtDsc = "" ;
      ZZ14628MDefColNom = "" ;
      ZZ14601MDefMaqCod = "" ;
      ZZ14629MDefMaqDsc = "" ;
      ZZ14600MDefTipMCo = "" ;
      ZZ14630MDefTipMDs = "" ;
      ZZ14631MDefDefDsc = "" ;
      ZZ14633MDefCatDsc = "" ;
      ZZ14634MDefKilTot = DecimalUtil.ZERO ;
      ZZ14635MDefKilPro = DecimalUtil.ZERO ;
      ZZ14636MDefKilReo = DecimalUtil.ZERO ;
      ZZ14596MDefUsu = "" ;
      ZZ14595MDefTkn = "" ;
      ZZ14638MDefMetTot = DecimalUtil.ZERO ;
      ZZ14639MDefMetPro = DecimalUtil.ZERO ;
      ZZ14640MDefMetReo = DecimalUtil.ZERO ;
      ZZ14637MDefPorc = DecimalUtil.ZERO ;
      ZZ14641MDefMetPor = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mdef__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mdef__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mdef__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mdef__default(),
         new Object[] {
             new Object[] {
            T01W72_A14594MDefId, T01W72_A14624MDefEmprCo, T01W72_A14597MDefCliCod, T01W72_A14625MDefCliNom, T01W72_A14598MDefArtCod, T01W72_A14626MDefArtDsc, T01W72_A14599MDefColNum, T01W72_A14627MDefColCod, T01W72_A14628MDefColNom, T01W72_A14601MDefMaqCod,
            T01W72_A14629MDefMaqDsc, T01W72_A14600MDefTipMCo, T01W72_A14630MDefTipMDs, T01W72_A14602MDefDefCod, T01W72_A14631MDefDefDsc, T01W72_A14632MDefCatCod, T01W72_A14633MDefCatDsc, T01W72_A14634MDefKilTot, T01W72_A14635MDefKilPro, T01W72_A14636MDefKilReo,
            T01W72_A14596MDefUsu, T01W72_A14595MDefTkn, T01W72_A14638MDefMetTot, T01W72_n14638MDefMetTot, T01W72_A14639MDefMetPro, T01W72_n14639MDefMetPro, T01W72_A14640MDefMetReo, T01W72_n14640MDefMetReo
            }
            , new Object[] {
            T01W73_A14594MDefId, T01W73_A14624MDefEmprCo, T01W73_A14597MDefCliCod, T01W73_A14625MDefCliNom, T01W73_A14598MDefArtCod, T01W73_A14626MDefArtDsc, T01W73_A14599MDefColNum, T01W73_A14627MDefColCod, T01W73_A14628MDefColNom, T01W73_A14601MDefMaqCod,
            T01W73_A14629MDefMaqDsc, T01W73_A14600MDefTipMCo, T01W73_A14630MDefTipMDs, T01W73_A14602MDefDefCod, T01W73_A14631MDefDefDsc, T01W73_A14632MDefCatCod, T01W73_A14633MDefCatDsc, T01W73_A14634MDefKilTot, T01W73_A14635MDefKilPro, T01W73_A14636MDefKilReo,
            T01W73_A14596MDefUsu, T01W73_A14595MDefTkn, T01W73_A14638MDefMetTot, T01W73_n14638MDefMetTot, T01W73_A14639MDefMetPro, T01W73_n14639MDefMetPro, T01W73_A14640MDefMetReo, T01W73_n14640MDefMetReo
            }
            , new Object[] {
            T01W74_A14594MDefId, T01W74_A14624MDefEmprCo, T01W74_A14597MDefCliCod, T01W74_A14625MDefCliNom, T01W74_A14598MDefArtCod, T01W74_A14626MDefArtDsc, T01W74_A14599MDefColNum, T01W74_A14627MDefColCod, T01W74_A14628MDefColNom, T01W74_A14601MDefMaqCod,
            T01W74_A14629MDefMaqDsc, T01W74_A14600MDefTipMCo, T01W74_A14630MDefTipMDs, T01W74_A14602MDefDefCod, T01W74_A14631MDefDefDsc, T01W74_A14632MDefCatCod, T01W74_A14633MDefCatDsc, T01W74_A14634MDefKilTot, T01W74_A14635MDefKilPro, T01W74_A14636MDefKilReo,
            T01W74_A14596MDefUsu, T01W74_A14595MDefTkn, T01W74_A14638MDefMetTot, T01W74_n14638MDefMetTot, T01W74_A14639MDefMetPro, T01W74_n14639MDefMetPro, T01W74_A14640MDefMetReo, T01W74_n14640MDefMetReo
            }
            , new Object[] {
            T01W75_A14594MDefId
            }
            , new Object[] {
            T01W76_A14594MDefId
            }
            , new Object[] {
            T01W77_A14594MDefId
            }
            , new Object[] {
            }
            , new Object[] {
            T01W79_A14594MDefId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01W712_A14594MDefId
            }
         }
      );
   }

   private byte Z14627MDefColCod ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A14627MDefColCod ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ14627MDefColCod ;
   private short Z14602MDefDefCod ;
   private short Z14632MDefCatCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14602MDefDefCod ;
   private short A14632MDefCatCod ;
   private short RcdFound1919 ;
   private short nIsDirty_1919 ;
   private short ZZ14602MDefDefCod ;
   private short ZZ14632MDefCatCod ;
   private int Z14597MDefCliCod ;
   private int Z14599MDefColNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtMDefId_Enabled ;
   private int edtMDefEmprCo_Enabled ;
   private int A14597MDefCliCod ;
   private int edtMDefCliCod_Enabled ;
   private int edtMDefCliNom_Enabled ;
   private int edtMDefArtCod_Enabled ;
   private int edtMDefArtDsc_Enabled ;
   private int A14599MDefColNum ;
   private int edtMDefColNum_Enabled ;
   private int edtMDefColCod_Enabled ;
   private int edtMDefColNom_Enabled ;
   private int edtMDefMaqCod_Enabled ;
   private int edtMDefMaqDsc_Enabled ;
   private int edtMDefTipMCo_Enabled ;
   private int edtMDefTipMDs_Enabled ;
   private int edtMDefDefCod_Enabled ;
   private int edtMDefDefDsc_Enabled ;
   private int edtMDefCatCod_Enabled ;
   private int edtMDefCatDsc_Enabled ;
   private int edtMDefKilTot_Enabled ;
   private int edtMDefKilPro_Enabled ;
   private int edtMDefKilReo_Enabled ;
   private int edtMDefPorc_Enabled ;
   private int edtMDefUsu_Enabled ;
   private int edtMDefTkn_Enabled ;
   private int edtMDefMetTot_Enabled ;
   private int edtMDefMetPro_Enabled ;
   private int edtMDefMetReo_Enabled ;
   private int edtMDefMetPor_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ14597MDefCliCod ;
   private int ZZ14599MDefColNum ;
   private long Z14594MDefId ;
   private long A14594MDefId ;
   private long ZZ14594MDefId ;
   private java.math.BigDecimal Z14634MDefKilTot ;
   private java.math.BigDecimal Z14635MDefKilPro ;
   private java.math.BigDecimal Z14636MDefKilReo ;
   private java.math.BigDecimal Z14638MDefMetTot ;
   private java.math.BigDecimal Z14639MDefMetPro ;
   private java.math.BigDecimal Z14640MDefMetReo ;
   private java.math.BigDecimal A14634MDefKilTot ;
   private java.math.BigDecimal A14635MDefKilPro ;
   private java.math.BigDecimal A14636MDefKilReo ;
   private java.math.BigDecimal A14637MDefPorc ;
   private java.math.BigDecimal A14638MDefMetTot ;
   private java.math.BigDecimal A14639MDefMetPro ;
   private java.math.BigDecimal A14640MDefMetReo ;
   private java.math.BigDecimal A14641MDefMetPor ;
   private java.math.BigDecimal Z14637MDefPorc ;
   private java.math.BigDecimal Z14641MDefMetPor ;
   private java.math.BigDecimal ZZ14634MDefKilTot ;
   private java.math.BigDecimal ZZ14635MDefKilPro ;
   private java.math.BigDecimal ZZ14636MDefKilReo ;
   private java.math.BigDecimal ZZ14638MDefMetTot ;
   private java.math.BigDecimal ZZ14639MDefMetPro ;
   private java.math.BigDecimal ZZ14640MDefMetReo ;
   private java.math.BigDecimal ZZ14637MDefPorc ;
   private java.math.BigDecimal ZZ14641MDefMetPor ;
   private String sPrefix ;
   private String Z14624MDefEmprCo ;
   private String Z14598MDefArtCod ;
   private String Z14628MDefColNom ;
   private String Z14601MDefMaqCod ;
   private String Z14600MDefTipMCo ;
   private String Z14596MDefUsu ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMDefId_Internalname ;
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
   private String edtMDefId_Jsonclick ;
   private String edtMDefEmprCo_Internalname ;
   private String A14624MDefEmprCo ;
   private String edtMDefEmprCo_Jsonclick ;
   private String edtMDefCliCod_Internalname ;
   private String edtMDefCliCod_Jsonclick ;
   private String edtMDefCliNom_Internalname ;
   private String edtMDefArtCod_Internalname ;
   private String A14598MDefArtCod ;
   private String edtMDefArtCod_Jsonclick ;
   private String edtMDefArtDsc_Internalname ;
   private String edtMDefColNum_Internalname ;
   private String edtMDefColNum_Jsonclick ;
   private String edtMDefColCod_Internalname ;
   private String edtMDefColCod_Jsonclick ;
   private String edtMDefColNom_Internalname ;
   private String A14628MDefColNom ;
   private String edtMDefColNom_Jsonclick ;
   private String edtMDefMaqCod_Internalname ;
   private String A14601MDefMaqCod ;
   private String edtMDefMaqCod_Jsonclick ;
   private String edtMDefMaqDsc_Internalname ;
   private String edtMDefTipMCo_Internalname ;
   private String A14600MDefTipMCo ;
   private String edtMDefTipMCo_Jsonclick ;
   private String edtMDefTipMDs_Internalname ;
   private String edtMDefDefCod_Internalname ;
   private String edtMDefDefCod_Jsonclick ;
   private String edtMDefDefDsc_Internalname ;
   private String edtMDefCatCod_Internalname ;
   private String edtMDefCatCod_Jsonclick ;
   private String edtMDefCatDsc_Internalname ;
   private String edtMDefKilTot_Internalname ;
   private String edtMDefKilTot_Jsonclick ;
   private String edtMDefKilPro_Internalname ;
   private String edtMDefKilPro_Jsonclick ;
   private String edtMDefKilReo_Internalname ;
   private String edtMDefKilReo_Jsonclick ;
   private String edtMDefPorc_Internalname ;
   private String edtMDefPorc_Jsonclick ;
   private String edtMDefUsu_Internalname ;
   private String A14596MDefUsu ;
   private String edtMDefUsu_Jsonclick ;
   private String edtMDefTkn_Internalname ;
   private String edtMDefMetTot_Internalname ;
   private String edtMDefMetTot_Jsonclick ;
   private String edtMDefMetPro_Internalname ;
   private String edtMDefMetPro_Jsonclick ;
   private String edtMDefMetReo_Internalname ;
   private String edtMDefMetReo_Jsonclick ;
   private String edtMDefMetPor_Internalname ;
   private String edtMDefMetPor_Jsonclick ;
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
   private String sMode1919 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ14624MDefEmprCo ;
   private String ZZ14598MDefArtCod ;
   private String ZZ14628MDefColNom ;
   private String ZZ14601MDefMaqCod ;
   private String ZZ14600MDefTipMCo ;
   private String ZZ14596MDefUsu ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n14638MDefMetTot ;
   private boolean n14639MDefMetPro ;
   private boolean n14640MDefMetReo ;
   private boolean Gx_longc ;
   private String Z14625MDefCliNom ;
   private String Z14626MDefArtDsc ;
   private String Z14629MDefMaqDsc ;
   private String Z14630MDefTipMDs ;
   private String Z14631MDefDefDsc ;
   private String Z14633MDefCatDsc ;
   private String Z14595MDefTkn ;
   private String A14625MDefCliNom ;
   private String A14626MDefArtDsc ;
   private String A14629MDefMaqDsc ;
   private String A14630MDefTipMDs ;
   private String A14631MDefDefDsc ;
   private String A14633MDefCatDsc ;
   private String A14595MDefTkn ;
   private String ZZ14625MDefCliNom ;
   private String ZZ14626MDefArtDsc ;
   private String ZZ14629MDefMaqDsc ;
   private String ZZ14630MDefTipMDs ;
   private String ZZ14631MDefDefDsc ;
   private String ZZ14633MDefCatDsc ;
   private String ZZ14595MDefTkn ;
   private IDataStoreProvider pr_default ;
   private long[] T01W74_A14594MDefId ;
   private String[] T01W74_A14624MDefEmprCo ;
   private int[] T01W74_A14597MDefCliCod ;
   private String[] T01W74_A14625MDefCliNom ;
   private String[] T01W74_A14598MDefArtCod ;
   private String[] T01W74_A14626MDefArtDsc ;
   private int[] T01W74_A14599MDefColNum ;
   private byte[] T01W74_A14627MDefColCod ;
   private String[] T01W74_A14628MDefColNom ;
   private String[] T01W74_A14601MDefMaqCod ;
   private String[] T01W74_A14629MDefMaqDsc ;
   private String[] T01W74_A14600MDefTipMCo ;
   private String[] T01W74_A14630MDefTipMDs ;
   private short[] T01W74_A14602MDefDefCod ;
   private String[] T01W74_A14631MDefDefDsc ;
   private short[] T01W74_A14632MDefCatCod ;
   private String[] T01W74_A14633MDefCatDsc ;
   private java.math.BigDecimal[] T01W74_A14634MDefKilTot ;
   private java.math.BigDecimal[] T01W74_A14635MDefKilPro ;
   private java.math.BigDecimal[] T01W74_A14636MDefKilReo ;
   private String[] T01W74_A14596MDefUsu ;
   private String[] T01W74_A14595MDefTkn ;
   private java.math.BigDecimal[] T01W74_A14638MDefMetTot ;
   private boolean[] T01W74_n14638MDefMetTot ;
   private java.math.BigDecimal[] T01W74_A14639MDefMetPro ;
   private boolean[] T01W74_n14639MDefMetPro ;
   private java.math.BigDecimal[] T01W74_A14640MDefMetReo ;
   private boolean[] T01W74_n14640MDefMetReo ;
   private long[] T01W75_A14594MDefId ;
   private long[] T01W73_A14594MDefId ;
   private String[] T01W73_A14624MDefEmprCo ;
   private int[] T01W73_A14597MDefCliCod ;
   private String[] T01W73_A14625MDefCliNom ;
   private String[] T01W73_A14598MDefArtCod ;
   private String[] T01W73_A14626MDefArtDsc ;
   private int[] T01W73_A14599MDefColNum ;
   private byte[] T01W73_A14627MDefColCod ;
   private String[] T01W73_A14628MDefColNom ;
   private String[] T01W73_A14601MDefMaqCod ;
   private String[] T01W73_A14629MDefMaqDsc ;
   private String[] T01W73_A14600MDefTipMCo ;
   private String[] T01W73_A14630MDefTipMDs ;
   private short[] T01W73_A14602MDefDefCod ;
   private String[] T01W73_A14631MDefDefDsc ;
   private short[] T01W73_A14632MDefCatCod ;
   private String[] T01W73_A14633MDefCatDsc ;
   private java.math.BigDecimal[] T01W73_A14634MDefKilTot ;
   private java.math.BigDecimal[] T01W73_A14635MDefKilPro ;
   private java.math.BigDecimal[] T01W73_A14636MDefKilReo ;
   private String[] T01W73_A14596MDefUsu ;
   private String[] T01W73_A14595MDefTkn ;
   private java.math.BigDecimal[] T01W73_A14638MDefMetTot ;
   private boolean[] T01W73_n14638MDefMetTot ;
   private java.math.BigDecimal[] T01W73_A14639MDefMetPro ;
   private boolean[] T01W73_n14639MDefMetPro ;
   private java.math.BigDecimal[] T01W73_A14640MDefMetReo ;
   private boolean[] T01W73_n14640MDefMetReo ;
   private long[] T01W76_A14594MDefId ;
   private long[] T01W77_A14594MDefId ;
   private long[] T01W72_A14594MDefId ;
   private String[] T01W72_A14624MDefEmprCo ;
   private int[] T01W72_A14597MDefCliCod ;
   private String[] T01W72_A14625MDefCliNom ;
   private String[] T01W72_A14598MDefArtCod ;
   private String[] T01W72_A14626MDefArtDsc ;
   private int[] T01W72_A14599MDefColNum ;
   private byte[] T01W72_A14627MDefColCod ;
   private String[] T01W72_A14628MDefColNom ;
   private String[] T01W72_A14601MDefMaqCod ;
   private String[] T01W72_A14629MDefMaqDsc ;
   private String[] T01W72_A14600MDefTipMCo ;
   private String[] T01W72_A14630MDefTipMDs ;
   private short[] T01W72_A14602MDefDefCod ;
   private String[] T01W72_A14631MDefDefDsc ;
   private short[] T01W72_A14632MDefCatCod ;
   private String[] T01W72_A14633MDefCatDsc ;
   private java.math.BigDecimal[] T01W72_A14634MDefKilTot ;
   private java.math.BigDecimal[] T01W72_A14635MDefKilPro ;
   private java.math.BigDecimal[] T01W72_A14636MDefKilReo ;
   private String[] T01W72_A14596MDefUsu ;
   private String[] T01W72_A14595MDefTkn ;
   private java.math.BigDecimal[] T01W72_A14638MDefMetTot ;
   private boolean[] T01W72_n14638MDefMetTot ;
   private java.math.BigDecimal[] T01W72_A14639MDefMetPro ;
   private boolean[] T01W72_n14639MDefMetPro ;
   private java.math.BigDecimal[] T01W72_A14640MDefMetReo ;
   private boolean[] T01W72_n14640MDefMetReo ;
   private long[] T01W79_A14594MDefId ;
   private long[] T01W712_A14594MDefId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mdef__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mdef__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mdef__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mdef__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01W72", "SELECT MDefId, MDefEmprCo, MDefCliCod, MDefCliNom, MDefArtCod, MDefArtDsc, MDefColNum, MDefColCod, MDefColNom, MDefMaqCod, MDefMaqDsc, MDefTipMCo, MDefTipMDs, MDefDefCod, MDefDefDsc, MDefCatCod, MDefCatDsc, MDefKilTot, MDefKilPro, MDefKilReo, MDefUsu, MDefTkn, MDefMetTot, MDefMetPro, MDefMetReo FROM MDef WHERE MDefId = ?  FOR UPDATE OF MDefEmprCo, MDefCliCod, MDefCliNom, MDefArtCod, MDefArtDsc, MDefColNum, MDefColCod, MDefColNom, MDefMaqCod, MDefMaqDsc, MDefTipMCo, MDefTipMDs, MDefDefCod, MDefDefDsc, MDefCatCod, MDefCatDsc, MDefKilTot, MDefKilPro, MDefKilReo, MDefUsu, MDefTkn, MDefMetTot, MDefMetPro, MDefMetReo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W73", "SELECT MDefId, MDefEmprCo, MDefCliCod, MDefCliNom, MDefArtCod, MDefArtDsc, MDefColNum, MDefColCod, MDefColNom, MDefMaqCod, MDefMaqDsc, MDefTipMCo, MDefTipMDs, MDefDefCod, MDefDefDsc, MDefCatCod, MDefCatDsc, MDefKilTot, MDefKilPro, MDefKilReo, MDefUsu, MDefTkn, MDefMetTot, MDefMetPro, MDefMetReo FROM MDef WHERE MDefId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W74", "SELECT /*+ FIRST_ROWS(100) */ TM1.MDefId, TM1.MDefEmprCo, TM1.MDefCliCod, TM1.MDefCliNom, TM1.MDefArtCod, TM1.MDefArtDsc, TM1.MDefColNum, TM1.MDefColCod, TM1.MDefColNom, TM1.MDefMaqCod, TM1.MDefMaqDsc, TM1.MDefTipMCo, TM1.MDefTipMDs, TM1.MDefDefCod, TM1.MDefDefDsc, TM1.MDefCatCod, TM1.MDefCatDsc, TM1.MDefKilTot, TM1.MDefKilPro, TM1.MDefKilReo, TM1.MDefUsu, TM1.MDefTkn, TM1.MDefMetTot, TM1.MDefMetPro, TM1.MDefMetReo FROM MDef TM1 WHERE TM1.MDefId = ? ORDER BY TM1.MDefId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W75", "SELECT /*+ FIRST_ROWS(1) */ MDefId FROM MDef WHERE MDefId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W76", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MDefId FROM MDef WHERE ( MDefId > ?) ORDER BY MDefId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W77", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MDefId FROM MDef WHERE ( MDefId < ?) ORDER BY MDefId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01W78", "INSERT INTO MDef(MDefEmprCo, MDefCliCod, MDefCliNom, MDefArtCod, MDefArtDsc, MDefColNum, MDefColCod, MDefColNom, MDefMaqCod, MDefMaqDsc, MDefTipMCo, MDefTipMDs, MDefDefCod, MDefDefDsc, MDefCatCod, MDefCatDsc, MDefKilTot, MDefKilPro, MDefKilReo, MDefUsu, MDefTkn, MDefMetTot, MDefMetPro, MDefMetReo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "MDef")
         ,new ForEachCursor("T01W79", "SELECT MDefId.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01W710", "UPDATE MDef SET MDefEmprCo=?, MDefCliCod=?, MDefCliNom=?, MDefArtCod=?, MDefArtDsc=?, MDefColNum=?, MDefColCod=?, MDefColNom=?, MDefMaqCod=?, MDefMaqDsc=?, MDefTipMCo=?, MDefTipMDs=?, MDefDefCod=?, MDefDefDsc=?, MDefCatCod=?, MDefCatDsc=?, MDefKilTot=?, MDefKilPro=?, MDefKilReo=?, MDefUsu=?, MDefTkn=?, MDefMetTot=?, MDefMetPro=?, MDefMetReo=?  WHERE MDefId = ?", GX_NOMASK, "MDef")
         ,new UpdateCursor("T01W711", "DELETE FROM MDef  WHERE MDefId = ?", GX_NOMASK, "MDef")
         ,new ForEachCursor("T01W712", "SELECT /*+ FIRST_ROWS(100) */ MDefId FROM MDef ORDER BY MDefId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getVarchar(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[20])[0] = rslt.getString(21, 8);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getVarchar(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[20])[0] = rslt.getString(21, 8);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getVarchar(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[20])[0] = rslt.getString(21, 8);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 255, false);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setVarchar(5, (String)parms[4], 255, false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 13);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setVarchar(10, (String)parms[9], 255, false);
               stmt.setString(11, (String)parms[10], 4);
               stmt.setVarchar(12, (String)parms[11], 255, false);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setVarchar(14, (String)parms[13], 255, false);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setVarchar(16, (String)parms[15], 255, false);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 2);
               stmt.setString(20, (String)parms[19], 8);
               stmt.setVarchar(21, (String)parms[20], 256, false);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[26], 2);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 255, false);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setVarchar(5, (String)parms[4], 255, false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 13);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setVarchar(10, (String)parms[9], 255, false);
               stmt.setString(11, (String)parms[10], 4);
               stmt.setVarchar(12, (String)parms[11], 255, false);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setVarchar(14, (String)parms[13], 255, false);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setVarchar(16, (String)parms[15], 255, false);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 2);
               stmt.setString(20, (String)parms[19], 8);
               stmt.setVarchar(21, (String)parms[20], 256, false);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[26], 2);
               }
               stmt.setLong(25, ((Number) parms[27]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

