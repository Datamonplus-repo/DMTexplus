package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mfil_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MFil", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMFilId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public mfil_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mfil_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mfil_impl.class ));
   }

   public mfil_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "MFil", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_AnticipacionErrores\\MFil.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_AnticipacionErrores\\MFil.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMFilId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMFilId_Internalname, httpContext.getMessage( "Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMFilId_Internalname, GXutil.ltrim( localUtil.ntoc( A14572MFilId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMFilId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14572MFilId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14572MFilId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMFilId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMFilId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMFilTxt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMFilTxt_Internalname, httpContext.getMessage( "Txt", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMFilTxt_Internalname, GXutil.rtrim( A14614MFilTxt), GXutil.rtrim( localUtil.format( A14614MFilTxt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMFilTxt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMFilTxt_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMFilUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMFilUsu_Internalname, httpContext.getMessage( "Usuario Codigo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMFilUsu_Internalname, GXutil.rtrim( A14573MFilUsu), GXutil.rtrim( localUtil.format( A14573MFilUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMFilUsu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMFilUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMFilEmp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMFilEmp_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMFilEmp_Internalname, GXutil.rtrim( A14577MFilEmp), GXutil.rtrim( localUtil.format( A14577MFilEmp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMFilEmp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMFilEmp_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMFilObj_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMFilObj_Internalname, httpContext.getMessage( "Objeto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMFilObj_Internalname, A14574MFilObj, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", (short)(0), 1, edtMFilObj_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "GeneXus\\ObjectName", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMFilFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMFilFec_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMFilFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMFilFec_Internalname, localUtil.ttoc( A14615MFilFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14615MFilFec, "99/99/99 99:99:99.999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMFilFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMFilFec_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMFilFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMFilFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AnticipacionErrores\\MFil.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMFilIp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMFilIp_Internalname, httpContext.getMessage( "IP", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMFilIp_Internalname, A14576MFilIp, GXutil.rtrim( localUtil.format( A14576MFilIp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMFilIp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMFilIp_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMFilTkn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMFilTkn_Internalname, httpContext.getMessage( "Token", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMFilTkn_Internalname, A14575MFilTkn, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", (short)(0), 1, edtMFilTkn_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMFilFec01_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMFilFec01_Internalname, httpContext.getMessage( "Fecha 01", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMFilFec01_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMFilFec01_Internalname, localUtil.format(A14616MFilFec01, "99/99/99"), localUtil.format( A14616MFilFec01, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMFilFec01_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMFilFec01_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMFilFec01_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMFilFec01_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AnticipacionErrores\\MFil.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMFilFec02_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMFilFec02_Internalname, httpContext.getMessage( "Fecha 02", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMFilFec02_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMFilFec02_Internalname, localUtil.format(A14617MFilFec02, "99/99/99"), localUtil.format( A14617MFilFec02, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMFilFec02_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMFilFec02_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMFilFec02_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMFilFec02_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AnticipacionErrores\\MFil.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMFilNum01_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMFilNum01_Internalname, httpContext.getMessage( "Num01", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMFilNum01_Internalname, GXutil.ltrim( localUtil.ntoc( A14618MFilNum01, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMFilNum01_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14618MFilNum01), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14618MFilNum01), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMFilNum01_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMFilNum01_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMFilNum02_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMFilNum02_Internalname, httpContext.getMessage( "Num02", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMFilNum02_Internalname, GXutil.ltrim( localUtil.ntoc( A14619MFilNum02, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMFilNum02_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14619MFilNum02), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14619MFilNum02), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMFilNum02_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMFilNum02_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MFil.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MFil.htm");
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
         Z14572MFilId = localUtil.ctol( httpContext.cgiGet( "Z14572MFilId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14614MFilTxt = httpContext.cgiGet( "Z14614MFilTxt") ;
         Z14573MFilUsu = httpContext.cgiGet( "Z14573MFilUsu") ;
         Z14577MFilEmp = httpContext.cgiGet( "Z14577MFilEmp") ;
         Z14574MFilObj = httpContext.cgiGet( "Z14574MFilObj") ;
         Z14615MFilFec = localUtil.ctot( httpContext.cgiGet( "Z14615MFilFec"), 0) ;
         Z14576MFilIp = httpContext.cgiGet( "Z14576MFilIp") ;
         Z14575MFilTkn = httpContext.cgiGet( "Z14575MFilTkn") ;
         Z14616MFilFec01 = localUtil.ctod( httpContext.cgiGet( "Z14616MFilFec01"), 0) ;
         Z14617MFilFec02 = localUtil.ctod( httpContext.cgiGet( "Z14617MFilFec02"), 0) ;
         Z14618MFilNum01 = localUtil.ctol( httpContext.cgiGet( "Z14618MFilNum01"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14619MFilNum02 = localUtil.ctol( httpContext.cgiGet( "Z14619MFilNum02"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMFilId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMFilId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MFILID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMFilId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14572MFilId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14572MFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14572MFilId), 10, 0));
         }
         else
         {
            A14572MFilId = localUtil.ctol( httpContext.cgiGet( edtMFilId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14572MFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14572MFilId), 10, 0));
         }
         A14614MFilTxt = httpContext.cgiGet( edtMFilTxt_Internalname) ;
         n14614MFilTxt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14614MFilTxt", A14614MFilTxt);
         A14573MFilUsu = httpContext.cgiGet( edtMFilUsu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14573MFilUsu", A14573MFilUsu);
         A14577MFilEmp = httpContext.cgiGet( edtMFilEmp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14577MFilEmp", A14577MFilEmp);
         A14574MFilObj = httpContext.cgiGet( edtMFilObj_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14574MFilObj", A14574MFilObj);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMFilFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MFILFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMFilFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14615MFilFec = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14615MFilFec", localUtil.ttoc( A14615MFilFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14615MFilFec = localUtil.ctot( httpContext.cgiGet( edtMFilFec_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14615MFilFec", localUtil.ttoc( A14615MFilFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A14576MFilIp = httpContext.cgiGet( edtMFilIp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14576MFilIp", A14576MFilIp);
         A14575MFilTkn = httpContext.cgiGet( edtMFilTkn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14575MFilTkn", A14575MFilTkn);
         if ( localUtil.vcdate( httpContext.cgiGet( edtMFilFec01_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "MFILFEC01");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMFilFec01_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14616MFilFec01 = GXutil.nullDate() ;
            n14616MFilFec01 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14616MFilFec01", localUtil.format(A14616MFilFec01, "99/99/99"));
         }
         else
         {
            A14616MFilFec01 = localUtil.ctod( httpContext.cgiGet( edtMFilFec01_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n14616MFilFec01 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14616MFilFec01", localUtil.format(A14616MFilFec01, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtMFilFec02_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "MFILFEC02");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMFilFec02_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14617MFilFec02 = GXutil.nullDate() ;
            n14617MFilFec02 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14617MFilFec02", localUtil.format(A14617MFilFec02, "99/99/99"));
         }
         else
         {
            A14617MFilFec02 = localUtil.ctod( httpContext.cgiGet( edtMFilFec02_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n14617MFilFec02 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14617MFilFec02", localUtil.format(A14617MFilFec02, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMFilNum01_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMFilNum01_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MFILNUM01");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMFilNum01_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14618MFilNum01 = 0 ;
            n14618MFilNum01 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14618MFilNum01", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14618MFilNum01), 10, 0));
         }
         else
         {
            A14618MFilNum01 = localUtil.ctol( httpContext.cgiGet( edtMFilNum01_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n14618MFilNum01 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14618MFilNum01", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14618MFilNum01), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMFilNum02_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMFilNum02_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MFILNUM02");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMFilNum02_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14619MFilNum02 = 0 ;
            n14619MFilNum02 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14619MFilNum02", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14619MFilNum02), 10, 0));
         }
         else
         {
            A14619MFilNum02 = localUtil.ctol( httpContext.cgiGet( edtMFilNum02_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n14619MFilNum02 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14619MFilNum02", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14619MFilNum02), 10, 0));
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
            A14572MFilId = GXutil.lval( httpContext.GetPar( "MFilId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14572MFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14572MFilId), 10, 0));
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
            initAll1W41916( ) ;
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
      disableAttributes1W41916( ) ;
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

   public void resetCaption1W40( )
   {
   }

   public void zm1W41916( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14614MFilTxt = T01W43_A14614MFilTxt[0] ;
            Z14573MFilUsu = T01W43_A14573MFilUsu[0] ;
            Z14577MFilEmp = T01W43_A14577MFilEmp[0] ;
            Z14574MFilObj = T01W43_A14574MFilObj[0] ;
            Z14615MFilFec = T01W43_A14615MFilFec[0] ;
            Z14576MFilIp = T01W43_A14576MFilIp[0] ;
            Z14575MFilTkn = T01W43_A14575MFilTkn[0] ;
            Z14616MFilFec01 = T01W43_A14616MFilFec01[0] ;
            Z14617MFilFec02 = T01W43_A14617MFilFec02[0] ;
            Z14618MFilNum01 = T01W43_A14618MFilNum01[0] ;
            Z14619MFilNum02 = T01W43_A14619MFilNum02[0] ;
         }
         else
         {
            Z14614MFilTxt = A14614MFilTxt ;
            Z14573MFilUsu = A14573MFilUsu ;
            Z14577MFilEmp = A14577MFilEmp ;
            Z14574MFilObj = A14574MFilObj ;
            Z14615MFilFec = A14615MFilFec ;
            Z14576MFilIp = A14576MFilIp ;
            Z14575MFilTkn = A14575MFilTkn ;
            Z14616MFilFec01 = A14616MFilFec01 ;
            Z14617MFilFec02 = A14617MFilFec02 ;
            Z14618MFilNum01 = A14618MFilNum01 ;
            Z14619MFilNum02 = A14619MFilNum02 ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z14572MFilId = A14572MFilId ;
         Z14614MFilTxt = A14614MFilTxt ;
         Z14573MFilUsu = A14573MFilUsu ;
         Z14577MFilEmp = A14577MFilEmp ;
         Z14574MFilObj = A14574MFilObj ;
         Z14615MFilFec = A14615MFilFec ;
         Z14576MFilIp = A14576MFilIp ;
         Z14575MFilTkn = A14575MFilTkn ;
         Z14616MFilFec01 = A14616MFilFec01 ;
         Z14617MFilFec02 = A14617MFilFec02 ;
         Z14618MFilNum01 = A14618MFilNum01 ;
         Z14619MFilNum02 = A14619MFilNum02 ;
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

   public void load1W41916( )
   {
      /* Using cursor T01W44 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14572MFilId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1916 = (short)(1) ;
         A14614MFilTxt = T01W44_A14614MFilTxt[0] ;
         n14614MFilTxt = T01W44_n14614MFilTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14614MFilTxt", A14614MFilTxt);
         A14573MFilUsu = T01W44_A14573MFilUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14573MFilUsu", A14573MFilUsu);
         A14577MFilEmp = T01W44_A14577MFilEmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14577MFilEmp", A14577MFilEmp);
         A14574MFilObj = T01W44_A14574MFilObj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14574MFilObj", A14574MFilObj);
         A14615MFilFec = T01W44_A14615MFilFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14615MFilFec", localUtil.ttoc( A14615MFilFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14576MFilIp = T01W44_A14576MFilIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14576MFilIp", A14576MFilIp);
         A14575MFilTkn = T01W44_A14575MFilTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14575MFilTkn", A14575MFilTkn);
         A14616MFilFec01 = T01W44_A14616MFilFec01[0] ;
         n14616MFilFec01 = T01W44_n14616MFilFec01[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14616MFilFec01", localUtil.format(A14616MFilFec01, "99/99/99"));
         A14617MFilFec02 = T01W44_A14617MFilFec02[0] ;
         n14617MFilFec02 = T01W44_n14617MFilFec02[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14617MFilFec02", localUtil.format(A14617MFilFec02, "99/99/99"));
         A14618MFilNum01 = T01W44_A14618MFilNum01[0] ;
         n14618MFilNum01 = T01W44_n14618MFilNum01[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14618MFilNum01", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14618MFilNum01), 10, 0));
         A14619MFilNum02 = T01W44_A14619MFilNum02[0] ;
         n14619MFilNum02 = T01W44_n14619MFilNum02[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14619MFilNum02", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14619MFilNum02), 10, 0));
         zm1W41916( -1) ;
      }
      pr_default.close(2);
      onLoadActions1W41916( ) ;
   }

   public void onLoadActions1W41916( )
   {
   }

   public void checkExtendedTable1W41916( )
   {
      nIsDirty_1916 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01W45 */
      pr_default.execute(3, new Object[] {A14573MFilUsu, A14574MFilObj, A14575MFilTkn, A14576MFilIp, A14577MFilEmp, Long.valueOf(A14572MFilId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {httpContext.getMessage( "Usuario Codigo", "")+","+httpContext.getMessage( "Objeto", "")+","+httpContext.getMessage( "Token", "")+","+httpContext.getMessage( "IP", "")+","+httpContext.getMessage( "Codigo Empresa", "")}), 1, "MFILUSU");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMFilUsu_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1W41916( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1W41916( )
   {
      /* Using cursor T01W46 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14572MFilId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1916 = (short)(1) ;
      }
      else
      {
         RcdFound1916 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01W43 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14572MFilId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1W41916( 1) ;
         RcdFound1916 = (short)(1) ;
         A14572MFilId = T01W43_A14572MFilId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14572MFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14572MFilId), 10, 0));
         A14614MFilTxt = T01W43_A14614MFilTxt[0] ;
         n14614MFilTxt = T01W43_n14614MFilTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14614MFilTxt", A14614MFilTxt);
         A14573MFilUsu = T01W43_A14573MFilUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14573MFilUsu", A14573MFilUsu);
         A14577MFilEmp = T01W43_A14577MFilEmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14577MFilEmp", A14577MFilEmp);
         A14574MFilObj = T01W43_A14574MFilObj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14574MFilObj", A14574MFilObj);
         A14615MFilFec = T01W43_A14615MFilFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14615MFilFec", localUtil.ttoc( A14615MFilFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14576MFilIp = T01W43_A14576MFilIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14576MFilIp", A14576MFilIp);
         A14575MFilTkn = T01W43_A14575MFilTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14575MFilTkn", A14575MFilTkn);
         A14616MFilFec01 = T01W43_A14616MFilFec01[0] ;
         n14616MFilFec01 = T01W43_n14616MFilFec01[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14616MFilFec01", localUtil.format(A14616MFilFec01, "99/99/99"));
         A14617MFilFec02 = T01W43_A14617MFilFec02[0] ;
         n14617MFilFec02 = T01W43_n14617MFilFec02[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14617MFilFec02", localUtil.format(A14617MFilFec02, "99/99/99"));
         A14618MFilNum01 = T01W43_A14618MFilNum01[0] ;
         n14618MFilNum01 = T01W43_n14618MFilNum01[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14618MFilNum01", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14618MFilNum01), 10, 0));
         A14619MFilNum02 = T01W43_A14619MFilNum02[0] ;
         n14619MFilNum02 = T01W43_n14619MFilNum02[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14619MFilNum02", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14619MFilNum02), 10, 0));
         Z14572MFilId = A14572MFilId ;
         sMode1916 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1W41916( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1916 = (short)(0) ;
            initializeNonKey1W41916( ) ;
         }
         Gx_mode = sMode1916 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1916 = (short)(0) ;
         initializeNonKey1W41916( ) ;
         sMode1916 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1916 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1W41916( ) ;
      if ( RcdFound1916 == 0 )
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
      RcdFound1916 = (short)(0) ;
      /* Using cursor T01W47 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14572MFilId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01W47_A14572MFilId[0] < A14572MFilId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01W47_A14572MFilId[0] > A14572MFilId ) ) )
         {
            A14572MFilId = T01W47_A14572MFilId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14572MFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14572MFilId), 10, 0));
            RcdFound1916 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1916 = (short)(0) ;
      /* Using cursor T01W48 */
      pr_default.execute(6, new Object[] {Long.valueOf(A14572MFilId)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01W48_A14572MFilId[0] > A14572MFilId ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01W48_A14572MFilId[0] < A14572MFilId ) ) )
         {
            A14572MFilId = T01W48_A14572MFilId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14572MFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14572MFilId), 10, 0));
            RcdFound1916 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1W41916( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMFilId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1W41916( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1916 == 1 )
         {
            if ( A14572MFilId != Z14572MFilId )
            {
               A14572MFilId = Z14572MFilId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14572MFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14572MFilId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MFILID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMFilId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMFilId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1W41916( ) ;
               GX_FocusControl = edtMFilId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14572MFilId != Z14572MFilId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMFilId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1W41916( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MFILID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMFilId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtMFilId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1W41916( ) ;
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
      if ( A14572MFilId != Z14572MFilId )
      {
         A14572MFilId = Z14572MFilId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14572MFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14572MFilId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MFILID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMFilId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMFilId_Internalname ;
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
      if ( RcdFound1916 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "MFILID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMFilId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMFilTxt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1W41916( ) ;
      if ( RcdFound1916 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMFilTxt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1W41916( ) ;
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
      if ( RcdFound1916 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMFilTxt_Internalname ;
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
      if ( RcdFound1916 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMFilTxt_Internalname ;
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
      scanStart1W41916( ) ;
      if ( RcdFound1916 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1916 != 0 )
         {
            scanNext1W41916( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMFilTxt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1W41916( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1W41916( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01W42 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14572MFilId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMFil"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14614MFilTxt, T01W42_A14614MFilTxt[0]) != 0 ) || ( GXutil.strcmp(Z14573MFilUsu, T01W42_A14573MFilUsu[0]) != 0 ) || ( GXutil.strcmp(Z14577MFilEmp, T01W42_A14577MFilEmp[0]) != 0 ) || ( GXutil.strcmp(Z14574MFilObj, T01W42_A14574MFilObj[0]) != 0 ) || !( GXutil.dateCompare(Z14615MFilFec, T01W42_A14615MFilFec[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14576MFilIp, T01W42_A14576MFilIp[0]) != 0 ) || ( GXutil.strcmp(Z14575MFilTkn, T01W42_A14575MFilTkn[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z14616MFilFec01), GXutil.resetTime(T01W42_A14616MFilFec01[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z14617MFilFec02), GXutil.resetTime(T01W42_A14617MFilFec02[0])) ) || ( Z14618MFilNum01 != T01W42_A14618MFilNum01[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14619MFilNum02 != T01W42_A14619MFilNum02[0] ) )
         {
            if ( GXutil.strcmp(Z14614MFilTxt, T01W42_A14614MFilTxt[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mfil:[seudo value changed for attri]"+"MFilTxt");
               GXutil.writeLogRaw("Old: ",Z14614MFilTxt);
               GXutil.writeLogRaw("Current: ",T01W42_A14614MFilTxt[0]);
            }
            if ( GXutil.strcmp(Z14573MFilUsu, T01W42_A14573MFilUsu[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mfil:[seudo value changed for attri]"+"MFilUsu");
               GXutil.writeLogRaw("Old: ",Z14573MFilUsu);
               GXutil.writeLogRaw("Current: ",T01W42_A14573MFilUsu[0]);
            }
            if ( GXutil.strcmp(Z14577MFilEmp, T01W42_A14577MFilEmp[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mfil:[seudo value changed for attri]"+"MFilEmp");
               GXutil.writeLogRaw("Old: ",Z14577MFilEmp);
               GXutil.writeLogRaw("Current: ",T01W42_A14577MFilEmp[0]);
            }
            if ( GXutil.strcmp(Z14574MFilObj, T01W42_A14574MFilObj[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mfil:[seudo value changed for attri]"+"MFilObj");
               GXutil.writeLogRaw("Old: ",Z14574MFilObj);
               GXutil.writeLogRaw("Current: ",T01W42_A14574MFilObj[0]);
            }
            if ( !( GXutil.dateCompare(Z14615MFilFec, T01W42_A14615MFilFec[0]) ) )
            {
               GXutil.writeLogln("anticipacionerrores.mfil:[seudo value changed for attri]"+"MFilFec");
               GXutil.writeLogRaw("Old: ",Z14615MFilFec);
               GXutil.writeLogRaw("Current: ",T01W42_A14615MFilFec[0]);
            }
            if ( GXutil.strcmp(Z14576MFilIp, T01W42_A14576MFilIp[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mfil:[seudo value changed for attri]"+"MFilIp");
               GXutil.writeLogRaw("Old: ",Z14576MFilIp);
               GXutil.writeLogRaw("Current: ",T01W42_A14576MFilIp[0]);
            }
            if ( GXutil.strcmp(Z14575MFilTkn, T01W42_A14575MFilTkn[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mfil:[seudo value changed for attri]"+"MFilTkn");
               GXutil.writeLogRaw("Old: ",Z14575MFilTkn);
               GXutil.writeLogRaw("Current: ",T01W42_A14575MFilTkn[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14616MFilFec01), GXutil.resetTime(T01W42_A14616MFilFec01[0])) ) )
            {
               GXutil.writeLogln("anticipacionerrores.mfil:[seudo value changed for attri]"+"MFilFec01");
               GXutil.writeLogRaw("Old: ",Z14616MFilFec01);
               GXutil.writeLogRaw("Current: ",T01W42_A14616MFilFec01[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14617MFilFec02), GXutil.resetTime(T01W42_A14617MFilFec02[0])) ) )
            {
               GXutil.writeLogln("anticipacionerrores.mfil:[seudo value changed for attri]"+"MFilFec02");
               GXutil.writeLogRaw("Old: ",Z14617MFilFec02);
               GXutil.writeLogRaw("Current: ",T01W42_A14617MFilFec02[0]);
            }
            if ( Z14618MFilNum01 != T01W42_A14618MFilNum01[0] )
            {
               GXutil.writeLogln("anticipacionerrores.mfil:[seudo value changed for attri]"+"MFilNum01");
               GXutil.writeLogRaw("Old: ",Z14618MFilNum01);
               GXutil.writeLogRaw("Current: ",T01W42_A14618MFilNum01[0]);
            }
            if ( Z14619MFilNum02 != T01W42_A14619MFilNum02[0] )
            {
               GXutil.writeLogln("anticipacionerrores.mfil:[seudo value changed for attri]"+"MFilNum02");
               GXutil.writeLogRaw("Old: ",Z14619MFilNum02);
               GXutil.writeLogRaw("Current: ",T01W42_A14619MFilNum02[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMFil"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1W41916( )
   {
      beforeValidate1W41916( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W41916( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1W41916( 0) ;
         checkOptimisticConcurrency1W41916( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W41916( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1W41916( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W49 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n14614MFilTxt), A14614MFilTxt, A14573MFilUsu, A14577MFilEmp, A14574MFilObj, A14615MFilFec, A14576MFilIp, A14575MFilTkn, Boolean.valueOf(n14616MFilFec01), A14616MFilFec01, Boolean.valueOf(n14617MFilFec02), A14617MFilFec02, Boolean.valueOf(n14618MFilNum01), Long.valueOf(A14618MFilNum01), Boolean.valueOf(n14619MFilNum02), Long.valueOf(A14619MFilNum02)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T01W410 */
                  pr_default.execute(8);
                  A14572MFilId = T01W410_A14572MFilId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14572MFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14572MFilId), 10, 0));
                  pr_default.close(8);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFil");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1W40( ) ;
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
            load1W41916( ) ;
         }
         endLevel1W41916( ) ;
      }
      closeExtendedTableCursors1W41916( ) ;
   }

   public void update1W41916( )
   {
      beforeValidate1W41916( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W41916( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W41916( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W41916( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1W41916( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W411 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n14614MFilTxt), A14614MFilTxt, A14573MFilUsu, A14577MFilEmp, A14574MFilObj, A14615MFilFec, A14576MFilIp, A14575MFilTkn, Boolean.valueOf(n14616MFilFec01), A14616MFilFec01, Boolean.valueOf(n14617MFilFec02), A14617MFilFec02, Boolean.valueOf(n14618MFilNum01), Long.valueOf(A14618MFilNum01), Boolean.valueOf(n14619MFilNum02), Long.valueOf(A14619MFilNum02), Long.valueOf(A14572MFilId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFil");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMFil"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1W41916( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1W40( ) ;
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
         endLevel1W41916( ) ;
      }
      closeExtendedTableCursors1W41916( ) ;
   }

   public void deferredUpdate1W41916( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1W41916( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W41916( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1W41916( ) ;
         afterConfirm1W41916( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1W41916( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01W412 */
               pr_default.execute(10, new Object[] {Long.valueOf(A14572MFilId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFil");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1916 == 0 )
                     {
                        initAll1W41916( ) ;
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
                     resetCaption1W40( ) ;
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
      sMode1916 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1W41916( ) ;
      Gx_mode = sMode1916 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1W41916( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1W41916( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1W41916( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "anticipacionerrores.mfil");
         if ( AnyError == 0 )
         {
            confirmValues1W40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "anticipacionerrores.mfil");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1W41916( )
   {
      /* Using cursor T01W413 */
      pr_default.execute(11);
      RcdFound1916 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1916 = (short)(1) ;
         A14572MFilId = T01W413_A14572MFilId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14572MFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14572MFilId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1W41916( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1916 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1916 = (short)(1) ;
         A14572MFilId = T01W413_A14572MFilId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14572MFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14572MFilId), 10, 0));
      }
   }

   public void scanEnd1W41916( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1W41916( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1W41916( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1W41916( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1W41916( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1W41916( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1W41916( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1W41916( )
   {
      edtMFilId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMFilId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMFilId_Enabled), 5, 0), true);
      edtMFilTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMFilTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMFilTxt_Enabled), 5, 0), true);
      edtMFilUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMFilUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMFilUsu_Enabled), 5, 0), true);
      edtMFilEmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMFilEmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMFilEmp_Enabled), 5, 0), true);
      edtMFilObj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMFilObj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMFilObj_Enabled), 5, 0), true);
      edtMFilFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMFilFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMFilFec_Enabled), 5, 0), true);
      edtMFilIp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMFilIp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMFilIp_Enabled), 5, 0), true);
      edtMFilTkn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMFilTkn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMFilTkn_Enabled), 5, 0), true);
      edtMFilFec01_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMFilFec01_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMFilFec01_Enabled), 5, 0), true);
      edtMFilFec02_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMFilFec02_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMFilFec02_Enabled), 5, 0), true);
      edtMFilNum01_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMFilNum01_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMFilNum01_Enabled), 5, 0), true);
      edtMFilNum02_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMFilNum02_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMFilNum02_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1W41916( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1W40( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.anticipacionerrores.mfil", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14572MFilId", GXutil.ltrim( localUtil.ntoc( Z14572MFilId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14614MFilTxt", GXutil.rtrim( Z14614MFilTxt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14573MFilUsu", GXutil.rtrim( Z14573MFilUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14577MFilEmp", GXutil.rtrim( Z14577MFilEmp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14574MFilObj", Z14574MFilObj);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14615MFilFec", localUtil.ttoc( Z14615MFilFec, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14576MFilIp", Z14576MFilIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14575MFilTkn", Z14575MFilTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14616MFilFec01", localUtil.dtoc( Z14616MFilFec01, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14617MFilFec02", localUtil.dtoc( Z14617MFilFec02, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14618MFilNum01", GXutil.ltrim( localUtil.ntoc( Z14618MFilNum01, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14619MFilNum02", GXutil.ltrim( localUtil.ntoc( Z14619MFilNum02, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.anticipacionerrores.mfil", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "AnticipacionErrores.MFil" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MFil", "") ;
   }

   public void initializeNonKey1W41916( )
   {
      A14614MFilTxt = "" ;
      n14614MFilTxt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14614MFilTxt", A14614MFilTxt);
      A14573MFilUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14573MFilUsu", A14573MFilUsu);
      A14577MFilEmp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14577MFilEmp", A14577MFilEmp);
      A14574MFilObj = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14574MFilObj", A14574MFilObj);
      A14615MFilFec = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14615MFilFec", localUtil.ttoc( A14615MFilFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14576MFilIp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14576MFilIp", A14576MFilIp);
      A14575MFilTkn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14575MFilTkn", A14575MFilTkn);
      A14616MFilFec01 = GXutil.nullDate() ;
      n14616MFilFec01 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14616MFilFec01", localUtil.format(A14616MFilFec01, "99/99/99"));
      A14617MFilFec02 = GXutil.nullDate() ;
      n14617MFilFec02 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14617MFilFec02", localUtil.format(A14617MFilFec02, "99/99/99"));
      A14618MFilNum01 = 0 ;
      n14618MFilNum01 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14618MFilNum01", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14618MFilNum01), 10, 0));
      A14619MFilNum02 = 0 ;
      n14619MFilNum02 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14619MFilNum02", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14619MFilNum02), 10, 0));
      Z14614MFilTxt = "" ;
      Z14573MFilUsu = "" ;
      Z14577MFilEmp = "" ;
      Z14574MFilObj = "" ;
      Z14615MFilFec = GXutil.resetTime( GXutil.nullDate() );
      Z14576MFilIp = "" ;
      Z14575MFilTkn = "" ;
      Z14616MFilFec01 = GXutil.nullDate() ;
      Z14617MFilFec02 = GXutil.nullDate() ;
      Z14618MFilNum01 = 0 ;
      Z14619MFilNum02 = 0 ;
   }

   public void initAll1W41916( )
   {
      A14572MFilId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14572MFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14572MFilId), 10, 0));
      initializeNonKey1W41916( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026799163194", true, true);
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
      httpContext.AddJavascriptSource("anticipacionerrores/mfil.js", "?2026799163194", false, true);
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
      edtMFilId_Internalname = "MFILID" ;
      edtMFilTxt_Internalname = "MFILTXT" ;
      edtMFilUsu_Internalname = "MFILUSU" ;
      edtMFilEmp_Internalname = "MFILEMP" ;
      edtMFilObj_Internalname = "MFILOBJ" ;
      edtMFilFec_Internalname = "MFILFEC" ;
      edtMFilIp_Internalname = "MFILIP" ;
      edtMFilTkn_Internalname = "MFILTKN" ;
      edtMFilFec01_Internalname = "MFILFEC01" ;
      edtMFilFec02_Internalname = "MFILFEC02" ;
      edtMFilNum01_Internalname = "MFILNUM01" ;
      edtMFilNum02_Internalname = "MFILNUM02" ;
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
      Form.setCaption( httpContext.getMessage( "MFil", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMFilNum02_Jsonclick = "" ;
      edtMFilNum02_Enabled = 1 ;
      edtMFilNum01_Jsonclick = "" ;
      edtMFilNum01_Enabled = 1 ;
      edtMFilFec02_Jsonclick = "" ;
      edtMFilFec02_Enabled = 1 ;
      edtMFilFec01_Jsonclick = "" ;
      edtMFilFec01_Enabled = 1 ;
      edtMFilTkn_Enabled = 1 ;
      edtMFilIp_Jsonclick = "" ;
      edtMFilIp_Enabled = 1 ;
      edtMFilFec_Jsonclick = "" ;
      edtMFilFec_Enabled = 1 ;
      edtMFilObj_Enabled = 1 ;
      edtMFilEmp_Jsonclick = "" ;
      edtMFilEmp_Enabled = 1 ;
      edtMFilUsu_Jsonclick = "" ;
      edtMFilUsu_Enabled = 1 ;
      edtMFilTxt_Jsonclick = "" ;
      edtMFilTxt_Enabled = 1 ;
      edtMFilId_Jsonclick = "" ;
      edtMFilId_Enabled = 1 ;
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
      GX_FocusControl = edtMFilTxt_Internalname ;
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

   public void valid_Mfilid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14614MFilTxt", GXutil.rtrim( A14614MFilTxt));
      httpContext.ajax_rsp_assign_attri("", false, "A14573MFilUsu", GXutil.rtrim( A14573MFilUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A14577MFilEmp", GXutil.rtrim( A14577MFilEmp));
      httpContext.ajax_rsp_assign_attri("", false, "A14574MFilObj", A14574MFilObj);
      httpContext.ajax_rsp_assign_attri("", false, "A14615MFilFec", localUtil.ttoc( A14615MFilFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14576MFilIp", A14576MFilIp);
      httpContext.ajax_rsp_assign_attri("", false, "A14575MFilTkn", A14575MFilTkn);
      httpContext.ajax_rsp_assign_attri("", false, "A14616MFilFec01", localUtil.format(A14616MFilFec01, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A14617MFilFec02", localUtil.format(A14617MFilFec02, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A14618MFilNum01", GXutil.ltrim( localUtil.ntoc( A14618MFilNum01, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14619MFilNum02", GXutil.ltrim( localUtil.ntoc( A14619MFilNum02, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14572MFilId", GXutil.ltrim( localUtil.ntoc( Z14572MFilId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14614MFilTxt", GXutil.rtrim( Z14614MFilTxt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14573MFilUsu", GXutil.rtrim( Z14573MFilUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14577MFilEmp", GXutil.rtrim( Z14577MFilEmp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14574MFilObj", Z14574MFilObj);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14615MFilFec", localUtil.ttoc( Z14615MFilFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14576MFilIp", Z14576MFilIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14575MFilTkn", Z14575MFilTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14616MFilFec01", localUtil.format(Z14616MFilFec01, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14617MFilFec02", localUtil.format(Z14617MFilFec02, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14618MFilNum01", GXutil.ltrim( localUtil.ntoc( Z14618MFilNum01, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14619MFilNum02", GXutil.ltrim( localUtil.ntoc( Z14619MFilNum02, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Mfiltkn( )
   {
      /* Using cursor T01W414 */
      pr_default.execute(12, new Object[] {A14573MFilUsu, A14574MFilObj, A14575MFilTkn, A14576MFilIp, A14577MFilEmp, Long.valueOf(A14572MFilId)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {httpContext.getMessage( "Usuario Codigo", "")+","+httpContext.getMessage( "Objeto", "")+","+httpContext.getMessage( "Token", "")+","+httpContext.getMessage( "IP", "")+","+httpContext.getMessage( "Codigo Empresa", "")}), 1, "MFILUSU");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMFilUsu_Internalname ;
      }
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("VALID_MFILID","{handler:'valid_Mfilid',iparms:[{av:'A14572MFilId',fld:'MFILID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MFILID",",oparms:[{av:'A14614MFilTxt',fld:'MFILTXT',pic:''},{av:'A14573MFilUsu',fld:'MFILUSU',pic:''},{av:'A14577MFilEmp',fld:'MFILEMP',pic:''},{av:'A14574MFilObj',fld:'MFILOBJ',pic:''},{av:'A14615MFilFec',fld:'MFILFEC',pic:'99/99/99 99:99:99.999'},{av:'A14576MFilIp',fld:'MFILIP',pic:''},{av:'A14575MFilTkn',fld:'MFILTKN',pic:''},{av:'A14616MFilFec01',fld:'MFILFEC01',pic:''},{av:'A14617MFilFec02',fld:'MFILFEC02',pic:''},{av:'A14618MFilNum01',fld:'MFILNUM01',pic:'ZZZZZZZZZ9'},{av:'A14619MFilNum02',fld:'MFILNUM02',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14572MFilId'},{av:'Z14614MFilTxt'},{av:'Z14573MFilUsu'},{av:'Z14577MFilEmp'},{av:'Z14574MFilObj'},{av:'Z14615MFilFec'},{av:'Z14576MFilIp'},{av:'Z14575MFilTkn'},{av:'Z14616MFilFec01'},{av:'Z14617MFilFec02'},{av:'Z14618MFilNum01'},{av:'Z14619MFilNum02'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_MFILUSU","{handler:'valid_Mfilusu',iparms:[]");
      setEventMetadata("VALID_MFILUSU",",oparms:[]}");
      setEventMetadata("VALID_MFILEMP","{handler:'valid_Mfilemp',iparms:[]");
      setEventMetadata("VALID_MFILEMP",",oparms:[]}");
      setEventMetadata("VALID_MFILOBJ","{handler:'valid_Mfilobj',iparms:[]");
      setEventMetadata("VALID_MFILOBJ",",oparms:[]}");
      setEventMetadata("VALID_MFILIP","{handler:'valid_Mfilip',iparms:[]");
      setEventMetadata("VALID_MFILIP",",oparms:[]}");
      setEventMetadata("VALID_MFILTKN","{handler:'valid_Mfiltkn',iparms:[{av:'A14573MFilUsu',fld:'MFILUSU',pic:''},{av:'A14574MFilObj',fld:'MFILOBJ',pic:''},{av:'A14575MFilTkn',fld:'MFILTKN',pic:''},{av:'A14576MFilIp',fld:'MFILIP',pic:''},{av:'A14577MFilEmp',fld:'MFILEMP',pic:''},{av:'A14572MFilId',fld:'MFILID',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("VALID_MFILTKN",",oparms:[]}");
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
      Z14614MFilTxt = "" ;
      Z14573MFilUsu = "" ;
      Z14577MFilEmp = "" ;
      Z14574MFilObj = "" ;
      Z14615MFilFec = GXutil.resetTime( GXutil.nullDate() );
      Z14576MFilIp = "" ;
      Z14575MFilTkn = "" ;
      Z14616MFilFec01 = GXutil.nullDate() ;
      Z14617MFilFec02 = GXutil.nullDate() ;
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
      A14614MFilTxt = "" ;
      A14573MFilUsu = "" ;
      A14577MFilEmp = "" ;
      A14574MFilObj = "" ;
      A14615MFilFec = GXutil.resetTime( GXutil.nullDate() );
      A14576MFilIp = "" ;
      A14575MFilTkn = "" ;
      A14616MFilFec01 = GXutil.nullDate() ;
      A14617MFilFec02 = GXutil.nullDate() ;
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
      T01W44_A14572MFilId = new long[1] ;
      T01W44_A14614MFilTxt = new String[] {""} ;
      T01W44_n14614MFilTxt = new boolean[] {false} ;
      T01W44_A14573MFilUsu = new String[] {""} ;
      T01W44_A14577MFilEmp = new String[] {""} ;
      T01W44_A14574MFilObj = new String[] {""} ;
      T01W44_A14615MFilFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01W44_A14576MFilIp = new String[] {""} ;
      T01W44_A14575MFilTkn = new String[] {""} ;
      T01W44_A14616MFilFec01 = new java.util.Date[] {GXutil.nullDate()} ;
      T01W44_n14616MFilFec01 = new boolean[] {false} ;
      T01W44_A14617MFilFec02 = new java.util.Date[] {GXutil.nullDate()} ;
      T01W44_n14617MFilFec02 = new boolean[] {false} ;
      T01W44_A14618MFilNum01 = new long[1] ;
      T01W44_n14618MFilNum01 = new boolean[] {false} ;
      T01W44_A14619MFilNum02 = new long[1] ;
      T01W44_n14619MFilNum02 = new boolean[] {false} ;
      T01W45_A14573MFilUsu = new String[] {""} ;
      T01W46_A14572MFilId = new long[1] ;
      T01W43_A14572MFilId = new long[1] ;
      T01W43_A14614MFilTxt = new String[] {""} ;
      T01W43_n14614MFilTxt = new boolean[] {false} ;
      T01W43_A14573MFilUsu = new String[] {""} ;
      T01W43_A14577MFilEmp = new String[] {""} ;
      T01W43_A14574MFilObj = new String[] {""} ;
      T01W43_A14615MFilFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01W43_A14576MFilIp = new String[] {""} ;
      T01W43_A14575MFilTkn = new String[] {""} ;
      T01W43_A14616MFilFec01 = new java.util.Date[] {GXutil.nullDate()} ;
      T01W43_n14616MFilFec01 = new boolean[] {false} ;
      T01W43_A14617MFilFec02 = new java.util.Date[] {GXutil.nullDate()} ;
      T01W43_n14617MFilFec02 = new boolean[] {false} ;
      T01W43_A14618MFilNum01 = new long[1] ;
      T01W43_n14618MFilNum01 = new boolean[] {false} ;
      T01W43_A14619MFilNum02 = new long[1] ;
      T01W43_n14619MFilNum02 = new boolean[] {false} ;
      sMode1916 = "" ;
      T01W47_A14572MFilId = new long[1] ;
      T01W48_A14572MFilId = new long[1] ;
      T01W42_A14572MFilId = new long[1] ;
      T01W42_A14614MFilTxt = new String[] {""} ;
      T01W42_n14614MFilTxt = new boolean[] {false} ;
      T01W42_A14573MFilUsu = new String[] {""} ;
      T01W42_A14577MFilEmp = new String[] {""} ;
      T01W42_A14574MFilObj = new String[] {""} ;
      T01W42_A14615MFilFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01W42_A14576MFilIp = new String[] {""} ;
      T01W42_A14575MFilTkn = new String[] {""} ;
      T01W42_A14616MFilFec01 = new java.util.Date[] {GXutil.nullDate()} ;
      T01W42_n14616MFilFec01 = new boolean[] {false} ;
      T01W42_A14617MFilFec02 = new java.util.Date[] {GXutil.nullDate()} ;
      T01W42_n14617MFilFec02 = new boolean[] {false} ;
      T01W42_A14618MFilNum01 = new long[1] ;
      T01W42_n14618MFilNum01 = new boolean[] {false} ;
      T01W42_A14619MFilNum02 = new long[1] ;
      T01W42_n14619MFilNum02 = new boolean[] {false} ;
      T01W410_A14572MFilId = new long[1] ;
      T01W413_A14572MFilId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ14614MFilTxt = "" ;
      ZZ14573MFilUsu = "" ;
      ZZ14577MFilEmp = "" ;
      ZZ14574MFilObj = "" ;
      ZZ14615MFilFec = GXutil.resetTime( GXutil.nullDate() );
      ZZ14576MFilIp = "" ;
      ZZ14575MFilTkn = "" ;
      ZZ14616MFilFec01 = GXutil.nullDate() ;
      ZZ14617MFilFec02 = GXutil.nullDate() ;
      T01W414_A14573MFilUsu = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mfil__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mfil__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mfil__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mfil__default(),
         new Object[] {
             new Object[] {
            T01W42_A14572MFilId, T01W42_A14614MFilTxt, T01W42_n14614MFilTxt, T01W42_A14573MFilUsu, T01W42_A14577MFilEmp, T01W42_A14574MFilObj, T01W42_A14615MFilFec, T01W42_A14576MFilIp, T01W42_A14575MFilTkn, T01W42_A14616MFilFec01,
            T01W42_n14616MFilFec01, T01W42_A14617MFilFec02, T01W42_n14617MFilFec02, T01W42_A14618MFilNum01, T01W42_n14618MFilNum01, T01W42_A14619MFilNum02, T01W42_n14619MFilNum02
            }
            , new Object[] {
            T01W43_A14572MFilId, T01W43_A14614MFilTxt, T01W43_n14614MFilTxt, T01W43_A14573MFilUsu, T01W43_A14577MFilEmp, T01W43_A14574MFilObj, T01W43_A14615MFilFec, T01W43_A14576MFilIp, T01W43_A14575MFilTkn, T01W43_A14616MFilFec01,
            T01W43_n14616MFilFec01, T01W43_A14617MFilFec02, T01W43_n14617MFilFec02, T01W43_A14618MFilNum01, T01W43_n14618MFilNum01, T01W43_A14619MFilNum02, T01W43_n14619MFilNum02
            }
            , new Object[] {
            T01W44_A14572MFilId, T01W44_A14614MFilTxt, T01W44_n14614MFilTxt, T01W44_A14573MFilUsu, T01W44_A14577MFilEmp, T01W44_A14574MFilObj, T01W44_A14615MFilFec, T01W44_A14576MFilIp, T01W44_A14575MFilTkn, T01W44_A14616MFilFec01,
            T01W44_n14616MFilFec01, T01W44_A14617MFilFec02, T01W44_n14617MFilFec02, T01W44_A14618MFilNum01, T01W44_n14618MFilNum01, T01W44_A14619MFilNum02, T01W44_n14619MFilNum02
            }
            , new Object[] {
            T01W45_A14573MFilUsu
            }
            , new Object[] {
            T01W46_A14572MFilId
            }
            , new Object[] {
            T01W47_A14572MFilId
            }
            , new Object[] {
            T01W48_A14572MFilId
            }
            , new Object[] {
            }
            , new Object[] {
            T01W410_A14572MFilId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01W413_A14572MFilId
            }
            , new Object[] {
            T01W414_A14573MFilUsu
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
   private short RcdFound1916 ;
   private short nIsDirty_1916 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtMFilId_Enabled ;
   private int edtMFilTxt_Enabled ;
   private int edtMFilUsu_Enabled ;
   private int edtMFilEmp_Enabled ;
   private int edtMFilObj_Enabled ;
   private int edtMFilFec_Enabled ;
   private int edtMFilIp_Enabled ;
   private int edtMFilTkn_Enabled ;
   private int edtMFilFec01_Enabled ;
   private int edtMFilFec02_Enabled ;
   private int edtMFilNum01_Enabled ;
   private int edtMFilNum02_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z14572MFilId ;
   private long Z14618MFilNum01 ;
   private long Z14619MFilNum02 ;
   private long A14572MFilId ;
   private long A14618MFilNum01 ;
   private long A14619MFilNum02 ;
   private long ZZ14572MFilId ;
   private long ZZ14618MFilNum01 ;
   private long ZZ14619MFilNum02 ;
   private String sPrefix ;
   private String Z14614MFilTxt ;
   private String Z14573MFilUsu ;
   private String Z14577MFilEmp ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMFilId_Internalname ;
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
   private String edtMFilId_Jsonclick ;
   private String edtMFilTxt_Internalname ;
   private String A14614MFilTxt ;
   private String edtMFilTxt_Jsonclick ;
   private String edtMFilUsu_Internalname ;
   private String A14573MFilUsu ;
   private String edtMFilUsu_Jsonclick ;
   private String edtMFilEmp_Internalname ;
   private String A14577MFilEmp ;
   private String edtMFilEmp_Jsonclick ;
   private String edtMFilObj_Internalname ;
   private String edtMFilFec_Internalname ;
   private String edtMFilFec_Jsonclick ;
   private String edtMFilIp_Internalname ;
   private String edtMFilIp_Jsonclick ;
   private String edtMFilTkn_Internalname ;
   private String edtMFilFec01_Internalname ;
   private String edtMFilFec01_Jsonclick ;
   private String edtMFilFec02_Internalname ;
   private String edtMFilFec02_Jsonclick ;
   private String edtMFilNum01_Internalname ;
   private String edtMFilNum01_Jsonclick ;
   private String edtMFilNum02_Internalname ;
   private String edtMFilNum02_Jsonclick ;
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
   private String sMode1916 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ14614MFilTxt ;
   private String ZZ14573MFilUsu ;
   private String ZZ14577MFilEmp ;
   private java.util.Date Z14615MFilFec ;
   private java.util.Date A14615MFilFec ;
   private java.util.Date ZZ14615MFilFec ;
   private java.util.Date Z14616MFilFec01 ;
   private java.util.Date Z14617MFilFec02 ;
   private java.util.Date A14616MFilFec01 ;
   private java.util.Date A14617MFilFec02 ;
   private java.util.Date ZZ14616MFilFec01 ;
   private java.util.Date ZZ14617MFilFec02 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n14614MFilTxt ;
   private boolean n14616MFilFec01 ;
   private boolean n14617MFilFec02 ;
   private boolean n14618MFilNum01 ;
   private boolean n14619MFilNum02 ;
   private boolean Gx_longc ;
   private String Z14574MFilObj ;
   private String Z14576MFilIp ;
   private String Z14575MFilTkn ;
   private String A14574MFilObj ;
   private String A14576MFilIp ;
   private String A14575MFilTkn ;
   private String ZZ14574MFilObj ;
   private String ZZ14576MFilIp ;
   private String ZZ14575MFilTkn ;
   private IDataStoreProvider pr_default ;
   private long[] T01W44_A14572MFilId ;
   private String[] T01W44_A14614MFilTxt ;
   private boolean[] T01W44_n14614MFilTxt ;
   private String[] T01W44_A14573MFilUsu ;
   private String[] T01W44_A14577MFilEmp ;
   private String[] T01W44_A14574MFilObj ;
   private java.util.Date[] T01W44_A14615MFilFec ;
   private String[] T01W44_A14576MFilIp ;
   private String[] T01W44_A14575MFilTkn ;
   private java.util.Date[] T01W44_A14616MFilFec01 ;
   private boolean[] T01W44_n14616MFilFec01 ;
   private java.util.Date[] T01W44_A14617MFilFec02 ;
   private boolean[] T01W44_n14617MFilFec02 ;
   private long[] T01W44_A14618MFilNum01 ;
   private boolean[] T01W44_n14618MFilNum01 ;
   private long[] T01W44_A14619MFilNum02 ;
   private boolean[] T01W44_n14619MFilNum02 ;
   private String[] T01W45_A14573MFilUsu ;
   private long[] T01W46_A14572MFilId ;
   private long[] T01W43_A14572MFilId ;
   private String[] T01W43_A14614MFilTxt ;
   private boolean[] T01W43_n14614MFilTxt ;
   private String[] T01W43_A14573MFilUsu ;
   private String[] T01W43_A14577MFilEmp ;
   private String[] T01W43_A14574MFilObj ;
   private java.util.Date[] T01W43_A14615MFilFec ;
   private String[] T01W43_A14576MFilIp ;
   private String[] T01W43_A14575MFilTkn ;
   private java.util.Date[] T01W43_A14616MFilFec01 ;
   private boolean[] T01W43_n14616MFilFec01 ;
   private java.util.Date[] T01W43_A14617MFilFec02 ;
   private boolean[] T01W43_n14617MFilFec02 ;
   private long[] T01W43_A14618MFilNum01 ;
   private boolean[] T01W43_n14618MFilNum01 ;
   private long[] T01W43_A14619MFilNum02 ;
   private boolean[] T01W43_n14619MFilNum02 ;
   private long[] T01W47_A14572MFilId ;
   private long[] T01W48_A14572MFilId ;
   private long[] T01W42_A14572MFilId ;
   private String[] T01W42_A14614MFilTxt ;
   private boolean[] T01W42_n14614MFilTxt ;
   private String[] T01W42_A14573MFilUsu ;
   private String[] T01W42_A14577MFilEmp ;
   private String[] T01W42_A14574MFilObj ;
   private java.util.Date[] T01W42_A14615MFilFec ;
   private String[] T01W42_A14576MFilIp ;
   private String[] T01W42_A14575MFilTkn ;
   private java.util.Date[] T01W42_A14616MFilFec01 ;
   private boolean[] T01W42_n14616MFilFec01 ;
   private java.util.Date[] T01W42_A14617MFilFec02 ;
   private boolean[] T01W42_n14617MFilFec02 ;
   private long[] T01W42_A14618MFilNum01 ;
   private boolean[] T01W42_n14618MFilNum01 ;
   private long[] T01W42_A14619MFilNum02 ;
   private boolean[] T01W42_n14619MFilNum02 ;
   private long[] T01W410_A14572MFilId ;
   private long[] T01W413_A14572MFilId ;
   private String[] T01W414_A14573MFilUsu ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mfil__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mfil__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mfil__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mfil__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01W42", "SELECT MFilId, MFilTxt, MFilUsu, MFilEmp, MFilObj, MFilFec, MFilIp, MFilTkn, MFilFec01, MFilFec02, MFilNum01, MFilNum02 FROM TXPMFil WHERE MFilId = ?  FOR UPDATE OF MFilTxt, MFilUsu, MFilEmp, MFilObj, MFilFec, MFilIp, MFilTkn, MFilFec01, MFilFec02, MFilNum01, MFilNum02 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W43", "SELECT MFilId, MFilTxt, MFilUsu, MFilEmp, MFilObj, MFilFec, MFilIp, MFilTkn, MFilFec01, MFilFec02, MFilNum01, MFilNum02 FROM TXPMFil WHERE MFilId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W44", "SELECT /*+ FIRST_ROWS(100) */ TM1.MFilId, TM1.MFilTxt, TM1.MFilUsu, TM1.MFilEmp, TM1.MFilObj, TM1.MFilFec, TM1.MFilIp, TM1.MFilTkn, TM1.MFilFec01, TM1.MFilFec02, TM1.MFilNum01, TM1.MFilNum02 FROM TXPMFil TM1 WHERE TM1.MFilId = ? ORDER BY TM1.MFilId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W45", "SELECT MFilUsu FROM TXPMFil WHERE (MFilUsu = ? AND MFilObj = ? AND MFilTkn = ? AND MFilIp = ? AND MFilEmp = ?) AND (Not ( MFilId = ?)) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W46", "SELECT /*+ FIRST_ROWS(1) */ MFilId FROM TXPMFil WHERE MFilId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W47", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MFilId FROM TXPMFil WHERE ( MFilId > ?) ORDER BY MFilId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W48", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MFilId FROM TXPMFil WHERE ( MFilId < ?) ORDER BY MFilId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01W49", "INSERT INTO TXPMFil(MFilTxt, MFilUsu, MFilEmp, MFilObj, MFilFec, MFilIp, MFilTkn, MFilFec01, MFilFec02, MFilNum01, MFilNum02) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMFil")
         ,new ForEachCursor("T01W410", "SELECT MFilId.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01W411", "UPDATE TXPMFil SET MFilTxt=?, MFilUsu=?, MFilEmp=?, MFilObj=?, MFilFec=?, MFilIp=?, MFilTkn=?, MFilFec01=?, MFilFec02=?, MFilNum01=?, MFilNum02=?  WHERE MFilId = ?", GX_NOMASK, "TXPMFil")
         ,new UpdateCursor("T01W412", "DELETE FROM TXPMFil  WHERE MFilId = ?", GX_NOMASK, "TXPMFil")
         ,new ForEachCursor("T01W413", "SELECT /*+ FIRST_ROWS(100) */ MFilId FROM TXPMFil ORDER BY MFilId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W414", "SELECT MFilUsu FROM TXPMFil WHERE (MFilUsu = ? AND MFilObj = ? AND MFilTkn = ? AND MFilIp = ? AND MFilEmp = ?) AND (Not ( MFilId = ?)) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6, true);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6, true);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6, true);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setVarchar(2, (String)parms[1], 256, false);
               stmt.setVarchar(3, (String)parms[2], 256, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               stmt.setString(2, (String)parms[2], 8);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setVarchar(4, (String)parms[4], 256, false);
               stmt.setDateTime(5, (java.util.Date)parms[5], false, true);
               stmt.setVarchar(6, (String)parms[6], 20, false);
               stmt.setVarchar(7, (String)parms[7], 256, false);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[13]).longValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[15]).longValue());
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               stmt.setString(2, (String)parms[2], 8);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setVarchar(4, (String)parms[4], 256, false);
               stmt.setDateTime(5, (java.util.Date)parms[5], false, true);
               stmt.setVarchar(6, (String)parms[6], 20, false);
               stmt.setVarchar(7, (String)parms[7], 256, false);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[13]).longValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[15]).longValue());
               }
               stmt.setLong(12, ((Number) parms[16]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setVarchar(2, (String)parms[1], 256, false);
               stmt.setVarchar(3, (String)parms[2], 256, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
      }
   }

}

