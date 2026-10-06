package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mcli_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MCli", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMCliId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public mcli_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mcli_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mcli_impl.class ));
   }

   public mcli_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "MCli", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_AnticipacionErrores\\MCli.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MCli.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MCli.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MCli.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MCli.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_AnticipacionErrores\\MCli.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMCliId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMCliId_Internalname, httpContext.getMessage( "Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMCliId_Internalname, GXutil.ltrim( localUtil.ntoc( A14571MCliId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMCliId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14571MCliId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14571MCliId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMCliId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMCliId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_AnticipacionErrores\\MCli.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMCliEmprCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMCliEmprCo_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMCliEmprCo_Internalname, GXutil.rtrim( A14603MCliEmprCo), GXutil.rtrim( localUtil.format( A14603MCliEmprCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMCliEmprCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMCliEmprCo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MCli.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMCliCod_Internalname, httpContext.getMessage( "Código Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14604MCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14604MCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14604MCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MCli.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMCliNom_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMCliNom_Internalname, A14605MCliNom, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", (short)(0), 1, edtMCliNom_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MCli.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMCliArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMCliArtCod_Internalname, httpContext.getMessage( "Código Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMCliArtCod_Internalname, GXutil.rtrim( A14606MCliArtCod), GXutil.rtrim( localUtil.format( A14606MCliArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMCliArtCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMCliArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MCli.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMCliArtDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMCliArtDsc_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMCliArtDsc_Internalname, A14607MCliArtDsc, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", (short)(0), 1, edtMCliArtDsc_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MCli.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMCliColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMCliColNum_Internalname, httpContext.getMessage( "Nro. Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMCliColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A14608MCliColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMCliColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14608MCliColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14608MCliColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMCliColNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMCliColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MCli.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMCliColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMCliColNom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMCliColNom_Internalname, A14609MCliColNom, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", (short)(0), 1, edtMCliColNom_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MCli.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MCli.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MCli.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MCli.htm");
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
         Z14571MCliId = localUtil.ctol( httpContext.cgiGet( "Z14571MCliId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14603MCliEmprCo = httpContext.cgiGet( "Z14603MCliEmprCo") ;
         Z14604MCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z14604MCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14605MCliNom = httpContext.cgiGet( "Z14605MCliNom") ;
         Z14606MCliArtCod = httpContext.cgiGet( "Z14606MCliArtCod") ;
         Z14607MCliArtDsc = httpContext.cgiGet( "Z14607MCliArtDsc") ;
         Z14608MCliColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z14608MCliColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14609MCliColNom = httpContext.cgiGet( "Z14609MCliColNom") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMCliId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMCliId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MCLIID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMCliId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14571MCliId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14571MCliId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14571MCliId), 10, 0));
         }
         else
         {
            A14571MCliId = localUtil.ctol( httpContext.cgiGet( edtMCliId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14571MCliId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14571MCliId), 10, 0));
         }
         A14603MCliEmprCo = httpContext.cgiGet( edtMCliEmprCo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14603MCliEmprCo", A14603MCliEmprCo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MCLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14604MCliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14604MCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14604MCliCod), 6, 0));
         }
         else
         {
            A14604MCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14604MCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14604MCliCod), 6, 0));
         }
         A14605MCliNom = httpContext.cgiGet( edtMCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14605MCliNom", A14605MCliNom);
         A14606MCliArtCod = httpContext.cgiGet( edtMCliArtCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14606MCliArtCod", A14606MCliArtCod);
         A14607MCliArtDsc = httpContext.cgiGet( edtMCliArtDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14607MCliArtDsc", A14607MCliArtDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMCliColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMCliColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MCLICOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMCliColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14608MCliColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14608MCliColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14608MCliColNum), 6, 0));
         }
         else
         {
            A14608MCliColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtMCliColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14608MCliColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14608MCliColNum), 6, 0));
         }
         A14609MCliColNom = httpContext.cgiGet( edtMCliColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14609MCliColNom", A14609MCliColNom);
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
            A14571MCliId = GXutil.lval( httpContext.GetPar( "MCliId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14571MCliId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14571MCliId), 10, 0));
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
            initAll1W31915( ) ;
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
      disableAttributes1W31915( ) ;
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

   public void resetCaption1W30( )
   {
   }

   public void zm1W31915( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14603MCliEmprCo = T01W33_A14603MCliEmprCo[0] ;
            Z14604MCliCod = T01W33_A14604MCliCod[0] ;
            Z14605MCliNom = T01W33_A14605MCliNom[0] ;
            Z14606MCliArtCod = T01W33_A14606MCliArtCod[0] ;
            Z14607MCliArtDsc = T01W33_A14607MCliArtDsc[0] ;
            Z14608MCliColNum = T01W33_A14608MCliColNum[0] ;
            Z14609MCliColNom = T01W33_A14609MCliColNom[0] ;
         }
         else
         {
            Z14603MCliEmprCo = A14603MCliEmprCo ;
            Z14604MCliCod = A14604MCliCod ;
            Z14605MCliNom = A14605MCliNom ;
            Z14606MCliArtCod = A14606MCliArtCod ;
            Z14607MCliArtDsc = A14607MCliArtDsc ;
            Z14608MCliColNum = A14608MCliColNum ;
            Z14609MCliColNom = A14609MCliColNom ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z14571MCliId = A14571MCliId ;
         Z14603MCliEmprCo = A14603MCliEmprCo ;
         Z14604MCliCod = A14604MCliCod ;
         Z14605MCliNom = A14605MCliNom ;
         Z14606MCliArtCod = A14606MCliArtCod ;
         Z14607MCliArtDsc = A14607MCliArtDsc ;
         Z14608MCliColNum = A14608MCliColNum ;
         Z14609MCliColNom = A14609MCliColNom ;
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

   public void load1W31915( )
   {
      /* Using cursor T01W34 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14571MCliId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1915 = (short)(1) ;
         A14603MCliEmprCo = T01W34_A14603MCliEmprCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14603MCliEmprCo", A14603MCliEmprCo);
         A14604MCliCod = T01W34_A14604MCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14604MCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14604MCliCod), 6, 0));
         A14605MCliNom = T01W34_A14605MCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14605MCliNom", A14605MCliNom);
         A14606MCliArtCod = T01W34_A14606MCliArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14606MCliArtCod", A14606MCliArtCod);
         A14607MCliArtDsc = T01W34_A14607MCliArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14607MCliArtDsc", A14607MCliArtDsc);
         A14608MCliColNum = T01W34_A14608MCliColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14608MCliColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14608MCliColNum), 6, 0));
         A14609MCliColNom = T01W34_A14609MCliColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14609MCliColNom", A14609MCliColNom);
         zm1W31915( -1) ;
      }
      pr_default.close(2);
      onLoadActions1W31915( ) ;
   }

   public void onLoadActions1W31915( )
   {
   }

   public void checkExtendedTable1W31915( )
   {
      nIsDirty_1915 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1W31915( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1W31915( )
   {
      /* Using cursor T01W35 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14571MCliId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1915 = (short)(1) ;
      }
      else
      {
         RcdFound1915 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01W33 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14571MCliId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1W31915( 1) ;
         RcdFound1915 = (short)(1) ;
         A14571MCliId = T01W33_A14571MCliId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14571MCliId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14571MCliId), 10, 0));
         A14603MCliEmprCo = T01W33_A14603MCliEmprCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14603MCliEmprCo", A14603MCliEmprCo);
         A14604MCliCod = T01W33_A14604MCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14604MCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14604MCliCod), 6, 0));
         A14605MCliNom = T01W33_A14605MCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14605MCliNom", A14605MCliNom);
         A14606MCliArtCod = T01W33_A14606MCliArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14606MCliArtCod", A14606MCliArtCod);
         A14607MCliArtDsc = T01W33_A14607MCliArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14607MCliArtDsc", A14607MCliArtDsc);
         A14608MCliColNum = T01W33_A14608MCliColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14608MCliColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14608MCliColNum), 6, 0));
         A14609MCliColNom = T01W33_A14609MCliColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14609MCliColNom", A14609MCliColNom);
         Z14571MCliId = A14571MCliId ;
         sMode1915 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1W31915( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1915 = (short)(0) ;
            initializeNonKey1W31915( ) ;
         }
         Gx_mode = sMode1915 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1915 = (short)(0) ;
         initializeNonKey1W31915( ) ;
         sMode1915 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1915 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1W31915( ) ;
      if ( RcdFound1915 == 0 )
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
      RcdFound1915 = (short)(0) ;
      /* Using cursor T01W36 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14571MCliId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01W36_A14571MCliId[0] < A14571MCliId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01W36_A14571MCliId[0] > A14571MCliId ) ) )
         {
            A14571MCliId = T01W36_A14571MCliId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14571MCliId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14571MCliId), 10, 0));
            RcdFound1915 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1915 = (short)(0) ;
      /* Using cursor T01W37 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14571MCliId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01W37_A14571MCliId[0] > A14571MCliId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01W37_A14571MCliId[0] < A14571MCliId ) ) )
         {
            A14571MCliId = T01W37_A14571MCliId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14571MCliId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14571MCliId), 10, 0));
            RcdFound1915 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1W31915( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMCliId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1W31915( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1915 == 1 )
         {
            if ( A14571MCliId != Z14571MCliId )
            {
               A14571MCliId = Z14571MCliId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14571MCliId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14571MCliId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MCLIID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMCliId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMCliId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1W31915( ) ;
               GX_FocusControl = edtMCliId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14571MCliId != Z14571MCliId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMCliId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1W31915( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MCLIID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMCliId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtMCliId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1W31915( ) ;
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
      if ( A14571MCliId != Z14571MCliId )
      {
         A14571MCliId = Z14571MCliId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14571MCliId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14571MCliId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MCLIID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMCliId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMCliId_Internalname ;
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
      if ( RcdFound1915 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "MCLIID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMCliId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMCliEmprCo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1W31915( ) ;
      if ( RcdFound1915 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMCliEmprCo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1W31915( ) ;
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
      if ( RcdFound1915 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMCliEmprCo_Internalname ;
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
      if ( RcdFound1915 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMCliEmprCo_Internalname ;
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
      scanStart1W31915( ) ;
      if ( RcdFound1915 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1915 != 0 )
         {
            scanNext1W31915( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMCliEmprCo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1W31915( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1W31915( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01W32 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14571MCliId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MCli"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14603MCliEmprCo, T01W32_A14603MCliEmprCo[0]) != 0 ) || ( Z14604MCliCod != T01W32_A14604MCliCod[0] ) || ( GXutil.strcmp(Z14605MCliNom, T01W32_A14605MCliNom[0]) != 0 ) || ( GXutil.strcmp(Z14606MCliArtCod, T01W32_A14606MCliArtCod[0]) != 0 ) || ( GXutil.strcmp(Z14607MCliArtDsc, T01W32_A14607MCliArtDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14608MCliColNum != T01W32_A14608MCliColNum[0] ) || ( GXutil.strcmp(Z14609MCliColNom, T01W32_A14609MCliColNom[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z14603MCliEmprCo, T01W32_A14603MCliEmprCo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mcli:[seudo value changed for attri]"+"MCliEmprCo");
               GXutil.writeLogRaw("Old: ",Z14603MCliEmprCo);
               GXutil.writeLogRaw("Current: ",T01W32_A14603MCliEmprCo[0]);
            }
            if ( Z14604MCliCod != T01W32_A14604MCliCod[0] )
            {
               GXutil.writeLogln("anticipacionerrores.mcli:[seudo value changed for attri]"+"MCliCod");
               GXutil.writeLogRaw("Old: ",Z14604MCliCod);
               GXutil.writeLogRaw("Current: ",T01W32_A14604MCliCod[0]);
            }
            if ( GXutil.strcmp(Z14605MCliNom, T01W32_A14605MCliNom[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mcli:[seudo value changed for attri]"+"MCliNom");
               GXutil.writeLogRaw("Old: ",Z14605MCliNom);
               GXutil.writeLogRaw("Current: ",T01W32_A14605MCliNom[0]);
            }
            if ( GXutil.strcmp(Z14606MCliArtCod, T01W32_A14606MCliArtCod[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mcli:[seudo value changed for attri]"+"MCliArtCod");
               GXutil.writeLogRaw("Old: ",Z14606MCliArtCod);
               GXutil.writeLogRaw("Current: ",T01W32_A14606MCliArtCod[0]);
            }
            if ( GXutil.strcmp(Z14607MCliArtDsc, T01W32_A14607MCliArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mcli:[seudo value changed for attri]"+"MCliArtDsc");
               GXutil.writeLogRaw("Old: ",Z14607MCliArtDsc);
               GXutil.writeLogRaw("Current: ",T01W32_A14607MCliArtDsc[0]);
            }
            if ( Z14608MCliColNum != T01W32_A14608MCliColNum[0] )
            {
               GXutil.writeLogln("anticipacionerrores.mcli:[seudo value changed for attri]"+"MCliColNum");
               GXutil.writeLogRaw("Old: ",Z14608MCliColNum);
               GXutil.writeLogRaw("Current: ",T01W32_A14608MCliColNum[0]);
            }
            if ( GXutil.strcmp(Z14609MCliColNom, T01W32_A14609MCliColNom[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mcli:[seudo value changed for attri]"+"MCliColNom");
               GXutil.writeLogRaw("Old: ",Z14609MCliColNom);
               GXutil.writeLogRaw("Current: ",T01W32_A14609MCliColNom[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"MCli"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1W31915( )
   {
      beforeValidate1W31915( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W31915( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1W31915( 0) ;
         checkOptimisticConcurrency1W31915( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W31915( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1W31915( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W38 */
                  pr_default.execute(6, new Object[] {A14603MCliEmprCo, Integer.valueOf(A14604MCliCod), A14605MCliNom, A14606MCliArtCod, A14607MCliArtDsc, Integer.valueOf(A14608MCliColNum), A14609MCliColNom});
                  /* Retrieving last key number assigned */
                  /* Using cursor T01W39 */
                  pr_default.execute(7);
                  A14571MCliId = T01W39_A14571MCliId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14571MCliId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14571MCliId), 10, 0));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MCli");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1W30( ) ;
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
            load1W31915( ) ;
         }
         endLevel1W31915( ) ;
      }
      closeExtendedTableCursors1W31915( ) ;
   }

   public void update1W31915( )
   {
      beforeValidate1W31915( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W31915( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W31915( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W31915( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1W31915( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W310 */
                  pr_default.execute(8, new Object[] {A14603MCliEmprCo, Integer.valueOf(A14604MCliCod), A14605MCliNom, A14606MCliArtCod, A14607MCliArtDsc, Integer.valueOf(A14608MCliColNum), A14609MCliColNom, Long.valueOf(A14571MCliId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MCli");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MCli"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1W31915( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1W30( ) ;
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
         endLevel1W31915( ) ;
      }
      closeExtendedTableCursors1W31915( ) ;
   }

   public void deferredUpdate1W31915( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1W31915( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W31915( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1W31915( ) ;
         afterConfirm1W31915( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1W31915( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01W311 */
               pr_default.execute(9, new Object[] {Long.valueOf(A14571MCliId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("MCli");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1915 == 0 )
                     {
                        initAll1W31915( ) ;
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
                     resetCaption1W30( ) ;
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
      sMode1915 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1W31915( ) ;
      Gx_mode = sMode1915 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1W31915( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1W31915( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1W31915( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "anticipacionerrores.mcli");
         if ( AnyError == 0 )
         {
            confirmValues1W30( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "anticipacionerrores.mcli");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1W31915( )
   {
      /* Using cursor T01W312 */
      pr_default.execute(10);
      RcdFound1915 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1915 = (short)(1) ;
         A14571MCliId = T01W312_A14571MCliId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14571MCliId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14571MCliId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1W31915( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1915 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1915 = (short)(1) ;
         A14571MCliId = T01W312_A14571MCliId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14571MCliId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14571MCliId), 10, 0));
      }
   }

   public void scanEnd1W31915( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1W31915( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1W31915( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1W31915( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1W31915( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1W31915( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1W31915( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1W31915( )
   {
      edtMCliId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMCliId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMCliId_Enabled), 5, 0), true);
      edtMCliEmprCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMCliEmprCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMCliEmprCo_Enabled), 5, 0), true);
      edtMCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMCliCod_Enabled), 5, 0), true);
      edtMCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMCliNom_Enabled), 5, 0), true);
      edtMCliArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMCliArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMCliArtCod_Enabled), 5, 0), true);
      edtMCliArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMCliArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMCliArtDsc_Enabled), 5, 0), true);
      edtMCliColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMCliColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMCliColNum_Enabled), 5, 0), true);
      edtMCliColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMCliColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMCliColNom_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1W31915( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1W30( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.anticipacionerrores.mcli", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14571MCliId", GXutil.ltrim( localUtil.ntoc( Z14571MCliId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14603MCliEmprCo", GXutil.rtrim( Z14603MCliEmprCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14604MCliCod", GXutil.ltrim( localUtil.ntoc( Z14604MCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14605MCliNom", Z14605MCliNom);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14606MCliArtCod", GXutil.rtrim( Z14606MCliArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14607MCliArtDsc", Z14607MCliArtDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14608MCliColNum", GXutil.ltrim( localUtil.ntoc( Z14608MCliColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14609MCliColNom", Z14609MCliColNom);
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
      return formatLink("app.anticipacionerrores.mcli", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "AnticipacionErrores.MCli" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MCli", "") ;
   }

   public void initializeNonKey1W31915( )
   {
      A14603MCliEmprCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14603MCliEmprCo", A14603MCliEmprCo);
      A14604MCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14604MCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14604MCliCod), 6, 0));
      A14605MCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14605MCliNom", A14605MCliNom);
      A14606MCliArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14606MCliArtCod", A14606MCliArtCod);
      A14607MCliArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14607MCliArtDsc", A14607MCliArtDsc);
      A14608MCliColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14608MCliColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14608MCliColNum), 6, 0));
      A14609MCliColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14609MCliColNom", A14609MCliColNom);
      Z14603MCliEmprCo = "" ;
      Z14604MCliCod = 0 ;
      Z14605MCliNom = "" ;
      Z14606MCliArtCod = "" ;
      Z14607MCliArtDsc = "" ;
      Z14608MCliColNum = 0 ;
      Z14609MCliColNom = "" ;
   }

   public void initAll1W31915( )
   {
      A14571MCliId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14571MCliId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14571MCliId), 10, 0));
      initializeNonKey1W31915( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026799163120", true, true);
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
      httpContext.AddJavascriptSource("anticipacionerrores/mcli.js", "?2026799163120", false, true);
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
      edtMCliId_Internalname = "MCLIID" ;
      edtMCliEmprCo_Internalname = "MCLIEMPRCO" ;
      edtMCliCod_Internalname = "MCLICOD" ;
      edtMCliNom_Internalname = "MCLINOM" ;
      edtMCliArtCod_Internalname = "MCLIARTCOD" ;
      edtMCliArtDsc_Internalname = "MCLIARTDSC" ;
      edtMCliColNum_Internalname = "MCLICOLNUM" ;
      edtMCliColNom_Internalname = "MCLICOLNOM" ;
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
      Form.setCaption( httpContext.getMessage( "MCli", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMCliColNom_Enabled = 1 ;
      edtMCliColNum_Jsonclick = "" ;
      edtMCliColNum_Enabled = 1 ;
      edtMCliArtDsc_Enabled = 1 ;
      edtMCliArtCod_Jsonclick = "" ;
      edtMCliArtCod_Enabled = 1 ;
      edtMCliNom_Enabled = 1 ;
      edtMCliCod_Jsonclick = "" ;
      edtMCliCod_Enabled = 1 ;
      edtMCliEmprCo_Jsonclick = "" ;
      edtMCliEmprCo_Enabled = 1 ;
      edtMCliId_Jsonclick = "" ;
      edtMCliId_Enabled = 1 ;
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
      GX_FocusControl = edtMCliEmprCo_Internalname ;
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

   public void valid_Mcliid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14603MCliEmprCo", GXutil.rtrim( A14603MCliEmprCo));
      httpContext.ajax_rsp_assign_attri("", false, "A14604MCliCod", GXutil.ltrim( localUtil.ntoc( A14604MCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14605MCliNom", A14605MCliNom);
      httpContext.ajax_rsp_assign_attri("", false, "A14606MCliArtCod", GXutil.rtrim( A14606MCliArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14607MCliArtDsc", A14607MCliArtDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14608MCliColNum", GXutil.ltrim( localUtil.ntoc( A14608MCliColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14609MCliColNom", A14609MCliColNom);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14571MCliId", GXutil.ltrim( localUtil.ntoc( Z14571MCliId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14603MCliEmprCo", GXutil.rtrim( Z14603MCliEmprCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14604MCliCod", GXutil.ltrim( localUtil.ntoc( Z14604MCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14605MCliNom", Z14605MCliNom);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14606MCliArtCod", GXutil.rtrim( Z14606MCliArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14607MCliArtDsc", Z14607MCliArtDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14608MCliColNum", GXutil.ltrim( localUtil.ntoc( Z14608MCliColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14609MCliColNom", Z14609MCliColNom);
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
      setEventMetadata("VALID_MCLIID","{handler:'valid_Mcliid',iparms:[{av:'A14571MCliId',fld:'MCLIID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MCLIID",",oparms:[{av:'A14603MCliEmprCo',fld:'MCLIEMPRCO',pic:''},{av:'A14604MCliCod',fld:'MCLICOD',pic:'ZZZZZ9'},{av:'A14605MCliNom',fld:'MCLINOM',pic:''},{av:'A14606MCliArtCod',fld:'MCLIARTCOD',pic:''},{av:'A14607MCliArtDsc',fld:'MCLIARTDSC',pic:''},{av:'A14608MCliColNum',fld:'MCLICOLNUM',pic:'ZZZZZ9'},{av:'A14609MCliColNom',fld:'MCLICOLNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14571MCliId'},{av:'Z14603MCliEmprCo'},{av:'Z14604MCliCod'},{av:'Z14605MCliNom'},{av:'Z14606MCliArtCod'},{av:'Z14607MCliArtDsc'},{av:'Z14608MCliColNum'},{av:'Z14609MCliColNom'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      Z14603MCliEmprCo = "" ;
      Z14605MCliNom = "" ;
      Z14606MCliArtCod = "" ;
      Z14607MCliArtDsc = "" ;
      Z14609MCliColNom = "" ;
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
      A14603MCliEmprCo = "" ;
      A14605MCliNom = "" ;
      A14606MCliArtCod = "" ;
      A14607MCliArtDsc = "" ;
      A14609MCliColNom = "" ;
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
      T01W34_A14571MCliId = new long[1] ;
      T01W34_A14603MCliEmprCo = new String[] {""} ;
      T01W34_A14604MCliCod = new int[1] ;
      T01W34_A14605MCliNom = new String[] {""} ;
      T01W34_A14606MCliArtCod = new String[] {""} ;
      T01W34_A14607MCliArtDsc = new String[] {""} ;
      T01W34_A14608MCliColNum = new int[1] ;
      T01W34_A14609MCliColNom = new String[] {""} ;
      T01W35_A14571MCliId = new long[1] ;
      T01W33_A14571MCliId = new long[1] ;
      T01W33_A14603MCliEmprCo = new String[] {""} ;
      T01W33_A14604MCliCod = new int[1] ;
      T01W33_A14605MCliNom = new String[] {""} ;
      T01W33_A14606MCliArtCod = new String[] {""} ;
      T01W33_A14607MCliArtDsc = new String[] {""} ;
      T01W33_A14608MCliColNum = new int[1] ;
      T01W33_A14609MCliColNom = new String[] {""} ;
      sMode1915 = "" ;
      T01W36_A14571MCliId = new long[1] ;
      T01W37_A14571MCliId = new long[1] ;
      T01W32_A14571MCliId = new long[1] ;
      T01W32_A14603MCliEmprCo = new String[] {""} ;
      T01W32_A14604MCliCod = new int[1] ;
      T01W32_A14605MCliNom = new String[] {""} ;
      T01W32_A14606MCliArtCod = new String[] {""} ;
      T01W32_A14607MCliArtDsc = new String[] {""} ;
      T01W32_A14608MCliColNum = new int[1] ;
      T01W32_A14609MCliColNom = new String[] {""} ;
      T01W39_A14571MCliId = new long[1] ;
      T01W312_A14571MCliId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ14603MCliEmprCo = "" ;
      ZZ14605MCliNom = "" ;
      ZZ14606MCliArtCod = "" ;
      ZZ14607MCliArtDsc = "" ;
      ZZ14609MCliColNom = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mcli__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mcli__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mcli__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mcli__default(),
         new Object[] {
             new Object[] {
            T01W32_A14571MCliId, T01W32_A14603MCliEmprCo, T01W32_A14604MCliCod, T01W32_A14605MCliNom, T01W32_A14606MCliArtCod, T01W32_A14607MCliArtDsc, T01W32_A14608MCliColNum, T01W32_A14609MCliColNom
            }
            , new Object[] {
            T01W33_A14571MCliId, T01W33_A14603MCliEmprCo, T01W33_A14604MCliCod, T01W33_A14605MCliNom, T01W33_A14606MCliArtCod, T01W33_A14607MCliArtDsc, T01W33_A14608MCliColNum, T01W33_A14609MCliColNom
            }
            , new Object[] {
            T01W34_A14571MCliId, T01W34_A14603MCliEmprCo, T01W34_A14604MCliCod, T01W34_A14605MCliNom, T01W34_A14606MCliArtCod, T01W34_A14607MCliArtDsc, T01W34_A14608MCliColNum, T01W34_A14609MCliColNom
            }
            , new Object[] {
            T01W35_A14571MCliId
            }
            , new Object[] {
            T01W36_A14571MCliId
            }
            , new Object[] {
            T01W37_A14571MCliId
            }
            , new Object[] {
            }
            , new Object[] {
            T01W39_A14571MCliId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01W312_A14571MCliId
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1915 ;
   private short nIsDirty_1915 ;
   private int Z14604MCliCod ;
   private int Z14608MCliColNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtMCliId_Enabled ;
   private int edtMCliEmprCo_Enabled ;
   private int A14604MCliCod ;
   private int edtMCliCod_Enabled ;
   private int edtMCliNom_Enabled ;
   private int edtMCliArtCod_Enabled ;
   private int edtMCliArtDsc_Enabled ;
   private int A14608MCliColNum ;
   private int edtMCliColNum_Enabled ;
   private int edtMCliColNom_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ14604MCliCod ;
   private int ZZ14608MCliColNum ;
   private long Z14571MCliId ;
   private long A14571MCliId ;
   private long ZZ14571MCliId ;
   private String sPrefix ;
   private String Z14603MCliEmprCo ;
   private String Z14606MCliArtCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMCliId_Internalname ;
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
   private String edtMCliId_Jsonclick ;
   private String edtMCliEmprCo_Internalname ;
   private String A14603MCliEmprCo ;
   private String edtMCliEmprCo_Jsonclick ;
   private String edtMCliCod_Internalname ;
   private String edtMCliCod_Jsonclick ;
   private String edtMCliNom_Internalname ;
   private String edtMCliArtCod_Internalname ;
   private String A14606MCliArtCod ;
   private String edtMCliArtCod_Jsonclick ;
   private String edtMCliArtDsc_Internalname ;
   private String edtMCliColNum_Internalname ;
   private String edtMCliColNum_Jsonclick ;
   private String edtMCliColNom_Internalname ;
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
   private String sMode1915 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ14603MCliEmprCo ;
   private String ZZ14606MCliArtCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private String Z14605MCliNom ;
   private String Z14607MCliArtDsc ;
   private String Z14609MCliColNom ;
   private String A14605MCliNom ;
   private String A14607MCliArtDsc ;
   private String A14609MCliColNom ;
   private String ZZ14605MCliNom ;
   private String ZZ14607MCliArtDsc ;
   private String ZZ14609MCliColNom ;
   private IDataStoreProvider pr_default ;
   private long[] T01W34_A14571MCliId ;
   private String[] T01W34_A14603MCliEmprCo ;
   private int[] T01W34_A14604MCliCod ;
   private String[] T01W34_A14605MCliNom ;
   private String[] T01W34_A14606MCliArtCod ;
   private String[] T01W34_A14607MCliArtDsc ;
   private int[] T01W34_A14608MCliColNum ;
   private String[] T01W34_A14609MCliColNom ;
   private long[] T01W35_A14571MCliId ;
   private long[] T01W33_A14571MCliId ;
   private String[] T01W33_A14603MCliEmprCo ;
   private int[] T01W33_A14604MCliCod ;
   private String[] T01W33_A14605MCliNom ;
   private String[] T01W33_A14606MCliArtCod ;
   private String[] T01W33_A14607MCliArtDsc ;
   private int[] T01W33_A14608MCliColNum ;
   private String[] T01W33_A14609MCliColNom ;
   private long[] T01W36_A14571MCliId ;
   private long[] T01W37_A14571MCliId ;
   private long[] T01W32_A14571MCliId ;
   private String[] T01W32_A14603MCliEmprCo ;
   private int[] T01W32_A14604MCliCod ;
   private String[] T01W32_A14605MCliNom ;
   private String[] T01W32_A14606MCliArtCod ;
   private String[] T01W32_A14607MCliArtDsc ;
   private int[] T01W32_A14608MCliColNum ;
   private String[] T01W32_A14609MCliColNom ;
   private long[] T01W39_A14571MCliId ;
   private long[] T01W312_A14571MCliId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mcli__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mcli__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mcli__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mcli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01W32", "SELECT MCliId, MCliEmprCo, MCliCod, MCliNom, MCliArtCod, MCliArtDsc, MCliColNum, MCliColNom FROM MCli WHERE MCliId = ?  FOR UPDATE OF MCliEmprCo, MCliCod, MCliNom, MCliArtCod, MCliArtDsc, MCliColNum, MCliColNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W33", "SELECT MCliId, MCliEmprCo, MCliCod, MCliNom, MCliArtCod, MCliArtDsc, MCliColNum, MCliColNom FROM MCli WHERE MCliId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W34", "SELECT /*+ FIRST_ROWS(100) */ TM1.MCliId, TM1.MCliEmprCo, TM1.MCliCod, TM1.MCliNom, TM1.MCliArtCod, TM1.MCliArtDsc, TM1.MCliColNum, TM1.MCliColNom FROM MCli TM1 WHERE TM1.MCliId = ? ORDER BY TM1.MCliId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W35", "SELECT /*+ FIRST_ROWS(1) */ MCliId FROM MCli WHERE MCliId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W36", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MCliId FROM MCli WHERE ( MCliId > ?) ORDER BY MCliId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W37", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MCliId FROM MCli WHERE ( MCliId < ?) ORDER BY MCliId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01W38", "INSERT INTO MCli(MCliEmprCo, MCliCod, MCliNom, MCliArtCod, MCliArtDsc, MCliColNum, MCliColNom) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "MCli")
         ,new ForEachCursor("T01W39", "SELECT MCliId.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01W310", "UPDATE MCli SET MCliEmprCo=?, MCliCod=?, MCliNom=?, MCliArtCod=?, MCliArtDsc=?, MCliColNum=?, MCliColNom=?  WHERE MCliId = ?", GX_NOMASK, "MCli")
         ,new UpdateCursor("T01W311", "DELETE FROM MCli  WHERE MCliId = ?", GX_NOMASK, "MCli")
         ,new ForEachCursor("T01W312", "SELECT /*+ FIRST_ROWS(100) */ MCliId FROM MCli ORDER BY MCliId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
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
               stmt.setVarchar(7, (String)parms[6], 255, false);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 255, false);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setVarchar(5, (String)parms[4], 255, false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 255, false);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

