package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class infil_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "In Fil", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtInFilId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public infil_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public infil_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( infil_impl.class ));
   }

   public infil_impl( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkInFilErr = UIFactory.getCheckbox(this);
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
      A14775InFilErr = GXutil.strtobool( GXutil.booltostr( A14775InFilErr)) ;
      n14775InFilErr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14775InFilErr", A14775InFilErr);
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "In Fil", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\InFil.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Ingenieria\\InFil.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInFilId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInFilId_Internalname, httpContext.getMessage( "Fil Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInFilId_Internalname, GXutil.ltrim( localUtil.ntoc( A14679InFilId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtInFilId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14679InFilId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14679InFilId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInFilId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInFilId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInFilUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInFilUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInFilUsu_Internalname, GXutil.rtrim( A14766InFilUsu), GXutil.rtrim( localUtil.format( A14766InFilUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInFilUsu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInFilUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInFilIp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInFilIp_Internalname, httpContext.getMessage( "IP", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInFilIp_Internalname, A14776InFilIp, GXutil.rtrim( localUtil.format( A14776InFilIp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInFilIp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInFilIp_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInFilObj_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInFilObj_Internalname, httpContext.getMessage( "Objeto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInFilObj_Internalname, A14767InFilObj, GXutil.rtrim( localUtil.format( A14767InFilObj, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInFilObj_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInFilObj_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInFilFReg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInFilFReg_Internalname, httpContext.getMessage( "Registro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtInFilFReg_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInFilFReg_Internalname, localUtil.ttoc( A14768InFilFReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14768InFilFReg, "99/99/99 99:99:99.999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInFilFReg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInFilFReg_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtInFilFReg_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtInFilFReg_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\InFil.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInFilFIni_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInFilFIni_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtInFilFIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInFilFIni_Internalname, localUtil.ttoc( A14769InFilFIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14769InFilFIni, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInFilFIni_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInFilFIni_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtInFilFIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtInFilFIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\InFil.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInFilFFin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInFilFFin_Internalname, httpContext.getMessage( "Fin", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtInFilFFin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInFilFFin_Internalname, localUtil.ttoc( A14770InFilFFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14770InFilFFin, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInFilFFin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInFilFFin_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtInFilFFin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtInFilFFin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\InFil.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInFilMaq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInFilMaq_Internalname, httpContext.getMessage( "Maquinas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtInFilMaq_Internalname, A14771InFilMaq, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", (short)(0), 1, edtInFilMaq_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "120000", -1, 0, "", "", (byte)(-1), true, "Ingenieria\\Filtro", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInFilFase_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInFilFase_Internalname, httpContext.getMessage( "Fases", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtInFilFase_Internalname, A14772InFilFase, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", (short)(0), 1, edtInFilFase_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "120000", -1, 0, "", "", (byte)(-1), true, "Ingenieria\\Filtro", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInFilHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInFilHdr_Internalname, httpContext.getMessage( "Hdrs", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtInFilHdr_Internalname, A14773InFilHdr, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", (short)(0), 1, edtInFilHdr_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "120000", -1, 0, "", "", (byte)(-1), true, "Ingenieria\\Filtro", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInFilPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInFilPar_Internalname, httpContext.getMessage( "Parametros", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtInFilPar_Internalname, A14774InFilPar, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", (short)(0), 1, edtInFilPar_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "120000", -1, 0, "", "", (byte)(-1), true, "Ingenieria\\Filtro", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkInFilErr.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkInFilErr.getInternalname(), httpContext.getMessage( "Error", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkInFilErr.getInternalname(), GXutil.booltostr( A14775InFilErr), "", httpContext.getMessage( "Error", ""), 1, chkInFilErr.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(89, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,89);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInFilEmp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInFilEmp_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInFilEmp_Internalname, GXutil.rtrim( A14777InFilEmp), GXutil.rtrim( localUtil.format( A14777InFilEmp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInFilEmp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInFilEmp_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInFilTkn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInFilTkn_Internalname, httpContext.getMessage( "Token", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtInFilTkn_Internalname, A14704InFilTkn, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", (short)(0), 1, edtInFilTkn_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Ingenieria\\InFil.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\InFil.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\InFil.htm");
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
         Z14679InFilId = localUtil.ctol( httpContext.cgiGet( "Z14679InFilId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14766InFilUsu = httpContext.cgiGet( "Z14766InFilUsu") ;
         Z14776InFilIp = httpContext.cgiGet( "Z14776InFilIp") ;
         Z14767InFilObj = httpContext.cgiGet( "Z14767InFilObj") ;
         Z14768InFilFReg = localUtil.ctot( httpContext.cgiGet( "Z14768InFilFReg"), 0) ;
         Z14769InFilFIni = localUtil.ctot( httpContext.cgiGet( "Z14769InFilFIni"), 0) ;
         Z14770InFilFFin = localUtil.ctot( httpContext.cgiGet( "Z14770InFilFFin"), 0) ;
         Z14771InFilMaq = httpContext.cgiGet( "Z14771InFilMaq") ;
         Z14772InFilFase = httpContext.cgiGet( "Z14772InFilFase") ;
         Z14773InFilHdr = httpContext.cgiGet( "Z14773InFilHdr") ;
         Z14774InFilPar = httpContext.cgiGet( "Z14774InFilPar") ;
         Z14775InFilErr = GXutil.strtobool( httpContext.cgiGet( "Z14775InFilErr")) ;
         Z14777InFilEmp = httpContext.cgiGet( "Z14777InFilEmp") ;
         Z14704InFilTkn = httpContext.cgiGet( "Z14704InFilTkn") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtInFilId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtInFilId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INFILID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtInFilId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14679InFilId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14679InFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14679InFilId), 10, 0));
         }
         else
         {
            A14679InFilId = localUtil.ctol( httpContext.cgiGet( edtInFilId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14679InFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14679InFilId), 10, 0));
         }
         A14766InFilUsu = httpContext.cgiGet( edtInFilUsu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14766InFilUsu", A14766InFilUsu);
         A14776InFilIp = httpContext.cgiGet( edtInFilIp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14776InFilIp", A14776InFilIp);
         A14767InFilObj = httpContext.cgiGet( edtInFilObj_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14767InFilObj", A14767InFilObj);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtInFilFReg_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "INFILFREG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtInFilFReg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14768InFilFReg = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14768InFilFReg", localUtil.ttoc( A14768InFilFReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14768InFilFReg = localUtil.ctot( httpContext.cgiGet( edtInFilFReg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14768InFilFReg", localUtil.ttoc( A14768InFilFReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtInFilFIni_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "INFILFINI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtInFilFIni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14769InFilFIni = GXutil.resetTime( GXutil.nullDate() );
            n14769InFilFIni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14769InFilFIni", localUtil.ttoc( A14769InFilFIni, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14769InFilFIni = localUtil.ctot( httpContext.cgiGet( edtInFilFIni_Internalname)) ;
            n14769InFilFIni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14769InFilFIni", localUtil.ttoc( A14769InFilFIni, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtInFilFFin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "INFILFFIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtInFilFFin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14770InFilFFin = GXutil.resetTime( GXutil.nullDate() );
            n14770InFilFFin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14770InFilFFin", localUtil.ttoc( A14770InFilFFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14770InFilFFin = localUtil.ctot( httpContext.cgiGet( edtInFilFFin_Internalname)) ;
            n14770InFilFFin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14770InFilFFin", localUtil.ttoc( A14770InFilFFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A14771InFilMaq = httpContext.cgiGet( edtInFilMaq_Internalname) ;
         n14771InFilMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14771InFilMaq", A14771InFilMaq);
         A14772InFilFase = httpContext.cgiGet( edtInFilFase_Internalname) ;
         n14772InFilFase = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14772InFilFase", A14772InFilFase);
         A14773InFilHdr = httpContext.cgiGet( edtInFilHdr_Internalname) ;
         n14773InFilHdr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14773InFilHdr", A14773InFilHdr);
         A14774InFilPar = httpContext.cgiGet( edtInFilPar_Internalname) ;
         n14774InFilPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14774InFilPar", A14774InFilPar);
         A14775InFilErr = GXutil.strtobool( httpContext.cgiGet( chkInFilErr.getInternalname())) ;
         n14775InFilErr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14775InFilErr", A14775InFilErr);
         A14777InFilEmp = httpContext.cgiGet( edtInFilEmp_Internalname) ;
         n14777InFilEmp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14777InFilEmp", A14777InFilEmp);
         A14704InFilTkn = httpContext.cgiGet( edtInFilTkn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14704InFilTkn", A14704InFilTkn);
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
            A14679InFilId = GXutil.lval( httpContext.GetPar( "InFilId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14679InFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14679InFilId), 10, 0));
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
            initAll1WB1923( ) ;
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
      disableAttributes1WB1923( ) ;
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

   public void resetCaption1WB0( )
   {
   }

   public void zm1WB1923( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14766InFilUsu = T01WB3_A14766InFilUsu[0] ;
            Z14776InFilIp = T01WB3_A14776InFilIp[0] ;
            Z14767InFilObj = T01WB3_A14767InFilObj[0] ;
            Z14768InFilFReg = T01WB3_A14768InFilFReg[0] ;
            Z14769InFilFIni = T01WB3_A14769InFilFIni[0] ;
            Z14770InFilFFin = T01WB3_A14770InFilFFin[0] ;
            Z14771InFilMaq = T01WB3_A14771InFilMaq[0] ;
            Z14772InFilFase = T01WB3_A14772InFilFase[0] ;
            Z14773InFilHdr = T01WB3_A14773InFilHdr[0] ;
            Z14774InFilPar = T01WB3_A14774InFilPar[0] ;
            Z14775InFilErr = T01WB3_A14775InFilErr[0] ;
            Z14777InFilEmp = T01WB3_A14777InFilEmp[0] ;
            Z14704InFilTkn = T01WB3_A14704InFilTkn[0] ;
         }
         else
         {
            Z14766InFilUsu = A14766InFilUsu ;
            Z14776InFilIp = A14776InFilIp ;
            Z14767InFilObj = A14767InFilObj ;
            Z14768InFilFReg = A14768InFilFReg ;
            Z14769InFilFIni = A14769InFilFIni ;
            Z14770InFilFFin = A14770InFilFFin ;
            Z14771InFilMaq = A14771InFilMaq ;
            Z14772InFilFase = A14772InFilFase ;
            Z14773InFilHdr = A14773InFilHdr ;
            Z14774InFilPar = A14774InFilPar ;
            Z14775InFilErr = A14775InFilErr ;
            Z14777InFilEmp = A14777InFilEmp ;
            Z14704InFilTkn = A14704InFilTkn ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z14679InFilId = A14679InFilId ;
         Z14766InFilUsu = A14766InFilUsu ;
         Z14776InFilIp = A14776InFilIp ;
         Z14767InFilObj = A14767InFilObj ;
         Z14768InFilFReg = A14768InFilFReg ;
         Z14769InFilFIni = A14769InFilFIni ;
         Z14770InFilFFin = A14770InFilFFin ;
         Z14771InFilMaq = A14771InFilMaq ;
         Z14772InFilFase = A14772InFilFase ;
         Z14773InFilHdr = A14773InFilHdr ;
         Z14774InFilPar = A14774InFilPar ;
         Z14775InFilErr = A14775InFilErr ;
         Z14777InFilEmp = A14777InFilEmp ;
         Z14704InFilTkn = A14704InFilTkn ;
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

   public void load1WB1923( )
   {
      /* Using cursor T01WB4 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14679InFilId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1923 = (short)(1) ;
         A14766InFilUsu = T01WB4_A14766InFilUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14766InFilUsu", A14766InFilUsu);
         A14776InFilIp = T01WB4_A14776InFilIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14776InFilIp", A14776InFilIp);
         A14767InFilObj = T01WB4_A14767InFilObj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14767InFilObj", A14767InFilObj);
         A14768InFilFReg = T01WB4_A14768InFilFReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14768InFilFReg", localUtil.ttoc( A14768InFilFReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14769InFilFIni = T01WB4_A14769InFilFIni[0] ;
         n14769InFilFIni = T01WB4_n14769InFilFIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14769InFilFIni", localUtil.ttoc( A14769InFilFIni, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14770InFilFFin = T01WB4_A14770InFilFFin[0] ;
         n14770InFilFFin = T01WB4_n14770InFilFFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14770InFilFFin", localUtil.ttoc( A14770InFilFFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14771InFilMaq = T01WB4_A14771InFilMaq[0] ;
         n14771InFilMaq = T01WB4_n14771InFilMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14771InFilMaq", A14771InFilMaq);
         A14772InFilFase = T01WB4_A14772InFilFase[0] ;
         n14772InFilFase = T01WB4_n14772InFilFase[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14772InFilFase", A14772InFilFase);
         A14773InFilHdr = T01WB4_A14773InFilHdr[0] ;
         n14773InFilHdr = T01WB4_n14773InFilHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14773InFilHdr", A14773InFilHdr);
         A14774InFilPar = T01WB4_A14774InFilPar[0] ;
         n14774InFilPar = T01WB4_n14774InFilPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14774InFilPar", A14774InFilPar);
         A14775InFilErr = T01WB4_A14775InFilErr[0] ;
         n14775InFilErr = T01WB4_n14775InFilErr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14775InFilErr", A14775InFilErr);
         A14777InFilEmp = T01WB4_A14777InFilEmp[0] ;
         n14777InFilEmp = T01WB4_n14777InFilEmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14777InFilEmp", A14777InFilEmp);
         A14704InFilTkn = T01WB4_A14704InFilTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14704InFilTkn", A14704InFilTkn);
         zm1WB1923( -1) ;
      }
      pr_default.close(2);
      onLoadActions1WB1923( ) ;
   }

   public void onLoadActions1WB1923( )
   {
   }

   public void checkExtendedTable1WB1923( )
   {
      nIsDirty_1923 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1WB1923( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1WB1923( )
   {
      /* Using cursor T01WB5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14679InFilId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1923 = (short)(1) ;
      }
      else
      {
         RcdFound1923 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01WB3 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14679InFilId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1WB1923( 1) ;
         RcdFound1923 = (short)(1) ;
         A14679InFilId = T01WB3_A14679InFilId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14679InFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14679InFilId), 10, 0));
         A14766InFilUsu = T01WB3_A14766InFilUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14766InFilUsu", A14766InFilUsu);
         A14776InFilIp = T01WB3_A14776InFilIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14776InFilIp", A14776InFilIp);
         A14767InFilObj = T01WB3_A14767InFilObj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14767InFilObj", A14767InFilObj);
         A14768InFilFReg = T01WB3_A14768InFilFReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14768InFilFReg", localUtil.ttoc( A14768InFilFReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14769InFilFIni = T01WB3_A14769InFilFIni[0] ;
         n14769InFilFIni = T01WB3_n14769InFilFIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14769InFilFIni", localUtil.ttoc( A14769InFilFIni, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14770InFilFFin = T01WB3_A14770InFilFFin[0] ;
         n14770InFilFFin = T01WB3_n14770InFilFFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14770InFilFFin", localUtil.ttoc( A14770InFilFFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14771InFilMaq = T01WB3_A14771InFilMaq[0] ;
         n14771InFilMaq = T01WB3_n14771InFilMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14771InFilMaq", A14771InFilMaq);
         A14772InFilFase = T01WB3_A14772InFilFase[0] ;
         n14772InFilFase = T01WB3_n14772InFilFase[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14772InFilFase", A14772InFilFase);
         A14773InFilHdr = T01WB3_A14773InFilHdr[0] ;
         n14773InFilHdr = T01WB3_n14773InFilHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14773InFilHdr", A14773InFilHdr);
         A14774InFilPar = T01WB3_A14774InFilPar[0] ;
         n14774InFilPar = T01WB3_n14774InFilPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14774InFilPar", A14774InFilPar);
         A14775InFilErr = T01WB3_A14775InFilErr[0] ;
         n14775InFilErr = T01WB3_n14775InFilErr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14775InFilErr", A14775InFilErr);
         A14777InFilEmp = T01WB3_A14777InFilEmp[0] ;
         n14777InFilEmp = T01WB3_n14777InFilEmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14777InFilEmp", A14777InFilEmp);
         A14704InFilTkn = T01WB3_A14704InFilTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14704InFilTkn", A14704InFilTkn);
         Z14679InFilId = A14679InFilId ;
         sMode1923 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1WB1923( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1923 = (short)(0) ;
            initializeNonKey1WB1923( ) ;
         }
         Gx_mode = sMode1923 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1923 = (short)(0) ;
         initializeNonKey1WB1923( ) ;
         sMode1923 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1923 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1WB1923( ) ;
      if ( RcdFound1923 == 0 )
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
      RcdFound1923 = (short)(0) ;
      /* Using cursor T01WB6 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14679InFilId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01WB6_A14679InFilId[0] < A14679InFilId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01WB6_A14679InFilId[0] > A14679InFilId ) ) )
         {
            A14679InFilId = T01WB6_A14679InFilId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14679InFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14679InFilId), 10, 0));
            RcdFound1923 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1923 = (short)(0) ;
      /* Using cursor T01WB7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14679InFilId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01WB7_A14679InFilId[0] > A14679InFilId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01WB7_A14679InFilId[0] < A14679InFilId ) ) )
         {
            A14679InFilId = T01WB7_A14679InFilId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14679InFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14679InFilId), 10, 0));
            RcdFound1923 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1WB1923( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtInFilId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1WB1923( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1923 == 1 )
         {
            if ( A14679InFilId != Z14679InFilId )
            {
               A14679InFilId = Z14679InFilId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14679InFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14679InFilId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "INFILID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtInFilId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtInFilId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1WB1923( ) ;
               GX_FocusControl = edtInFilId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14679InFilId != Z14679InFilId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtInFilId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1WB1923( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "INFILID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtInFilId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtInFilId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1WB1923( ) ;
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
      if ( A14679InFilId != Z14679InFilId )
      {
         A14679InFilId = Z14679InFilId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14679InFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14679InFilId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "INFILID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtInFilId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtInFilId_Internalname ;
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
      if ( RcdFound1923 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "INFILID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtInFilId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtInFilUsu_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1WB1923( ) ;
      if ( RcdFound1923 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtInFilUsu_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1WB1923( ) ;
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
      if ( RcdFound1923 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtInFilUsu_Internalname ;
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
      if ( RcdFound1923 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtInFilUsu_Internalname ;
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
      scanStart1WB1923( ) ;
      if ( RcdFound1923 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1923 != 0 )
         {
            scanNext1WB1923( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtInFilUsu_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1WB1923( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1WB1923( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01WB2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14679InFilId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPInFil"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14766InFilUsu, T01WB2_A14766InFilUsu[0]) != 0 ) || ( GXutil.strcmp(Z14776InFilIp, T01WB2_A14776InFilIp[0]) != 0 ) || ( GXutil.strcmp(Z14767InFilObj, T01WB2_A14767InFilObj[0]) != 0 ) || !( GXutil.dateCompare(Z14768InFilFReg, T01WB2_A14768InFilFReg[0]) ) || !( GXutil.dateCompare(Z14769InFilFIni, T01WB2_A14769InFilFIni[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z14770InFilFFin, T01WB2_A14770InFilFFin[0]) ) || ( GXutil.strcmp(Z14771InFilMaq, T01WB2_A14771InFilMaq[0]) != 0 ) || ( GXutil.strcmp(Z14772InFilFase, T01WB2_A14772InFilFase[0]) != 0 ) || ( GXutil.strcmp(Z14773InFilHdr, T01WB2_A14773InFilHdr[0]) != 0 ) || ( GXutil.strcmp(Z14774InFilPar, T01WB2_A14774InFilPar[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14775InFilErr != T01WB2_A14775InFilErr[0] ) || ( GXutil.strcmp(Z14777InFilEmp, T01WB2_A14777InFilEmp[0]) != 0 ) || ( GXutil.strcmp(Z14704InFilTkn, T01WB2_A14704InFilTkn[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z14766InFilUsu, T01WB2_A14766InFilUsu[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.infil:[seudo value changed for attri]"+"InFilUsu");
               GXutil.writeLogRaw("Old: ",Z14766InFilUsu);
               GXutil.writeLogRaw("Current: ",T01WB2_A14766InFilUsu[0]);
            }
            if ( GXutil.strcmp(Z14776InFilIp, T01WB2_A14776InFilIp[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.infil:[seudo value changed for attri]"+"InFilIp");
               GXutil.writeLogRaw("Old: ",Z14776InFilIp);
               GXutil.writeLogRaw("Current: ",T01WB2_A14776InFilIp[0]);
            }
            if ( GXutil.strcmp(Z14767InFilObj, T01WB2_A14767InFilObj[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.infil:[seudo value changed for attri]"+"InFilObj");
               GXutil.writeLogRaw("Old: ",Z14767InFilObj);
               GXutil.writeLogRaw("Current: ",T01WB2_A14767InFilObj[0]);
            }
            if ( !( GXutil.dateCompare(Z14768InFilFReg, T01WB2_A14768InFilFReg[0]) ) )
            {
               GXutil.writeLogln("ingenieria.infil:[seudo value changed for attri]"+"InFilFReg");
               GXutil.writeLogRaw("Old: ",Z14768InFilFReg);
               GXutil.writeLogRaw("Current: ",T01WB2_A14768InFilFReg[0]);
            }
            if ( !( GXutil.dateCompare(Z14769InFilFIni, T01WB2_A14769InFilFIni[0]) ) )
            {
               GXutil.writeLogln("ingenieria.infil:[seudo value changed for attri]"+"InFilFIni");
               GXutil.writeLogRaw("Old: ",Z14769InFilFIni);
               GXutil.writeLogRaw("Current: ",T01WB2_A14769InFilFIni[0]);
            }
            if ( !( GXutil.dateCompare(Z14770InFilFFin, T01WB2_A14770InFilFFin[0]) ) )
            {
               GXutil.writeLogln("ingenieria.infil:[seudo value changed for attri]"+"InFilFFin");
               GXutil.writeLogRaw("Old: ",Z14770InFilFFin);
               GXutil.writeLogRaw("Current: ",T01WB2_A14770InFilFFin[0]);
            }
            if ( GXutil.strcmp(Z14771InFilMaq, T01WB2_A14771InFilMaq[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.infil:[seudo value changed for attri]"+"InFilMaq");
               GXutil.writeLogRaw("Old: ",Z14771InFilMaq);
               GXutil.writeLogRaw("Current: ",T01WB2_A14771InFilMaq[0]);
            }
            if ( GXutil.strcmp(Z14772InFilFase, T01WB2_A14772InFilFase[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.infil:[seudo value changed for attri]"+"InFilFase");
               GXutil.writeLogRaw("Old: ",Z14772InFilFase);
               GXutil.writeLogRaw("Current: ",T01WB2_A14772InFilFase[0]);
            }
            if ( GXutil.strcmp(Z14773InFilHdr, T01WB2_A14773InFilHdr[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.infil:[seudo value changed for attri]"+"InFilHdr");
               GXutil.writeLogRaw("Old: ",Z14773InFilHdr);
               GXutil.writeLogRaw("Current: ",T01WB2_A14773InFilHdr[0]);
            }
            if ( GXutil.strcmp(Z14774InFilPar, T01WB2_A14774InFilPar[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.infil:[seudo value changed for attri]"+"InFilPar");
               GXutil.writeLogRaw("Old: ",Z14774InFilPar);
               GXutil.writeLogRaw("Current: ",T01WB2_A14774InFilPar[0]);
            }
            if ( Z14775InFilErr != T01WB2_A14775InFilErr[0] )
            {
               GXutil.writeLogln("ingenieria.infil:[seudo value changed for attri]"+"InFilErr");
               GXutil.writeLogRaw("Old: ",Z14775InFilErr);
               GXutil.writeLogRaw("Current: ",T01WB2_A14775InFilErr[0]);
            }
            if ( GXutil.strcmp(Z14777InFilEmp, T01WB2_A14777InFilEmp[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.infil:[seudo value changed for attri]"+"InFilEmp");
               GXutil.writeLogRaw("Old: ",Z14777InFilEmp);
               GXutil.writeLogRaw("Current: ",T01WB2_A14777InFilEmp[0]);
            }
            if ( GXutil.strcmp(Z14704InFilTkn, T01WB2_A14704InFilTkn[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.infil:[seudo value changed for attri]"+"InFilTkn");
               GXutil.writeLogRaw("Old: ",Z14704InFilTkn);
               GXutil.writeLogRaw("Current: ",T01WB2_A14704InFilTkn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPInFil"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1WB1923( )
   {
      beforeValidate1WB1923( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1WB1923( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1WB1923( 0) ;
         checkOptimisticConcurrency1WB1923( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1WB1923( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1WB1923( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01WB8 */
                  pr_default.execute(6, new Object[] {A14766InFilUsu, A14776InFilIp, A14767InFilObj, A14768InFilFReg, Boolean.valueOf(n14769InFilFIni), A14769InFilFIni, Boolean.valueOf(n14770InFilFFin), A14770InFilFFin, Boolean.valueOf(n14771InFilMaq), A14771InFilMaq, Boolean.valueOf(n14772InFilFase), A14772InFilFase, Boolean.valueOf(n14773InFilHdr), A14773InFilHdr, Boolean.valueOf(n14774InFilPar), A14774InFilPar, Boolean.valueOf(n14775InFilErr), Boolean.valueOf(A14775InFilErr), Boolean.valueOf(n14777InFilEmp), A14777InFilEmp, A14704InFilTkn});
                  /* Retrieving last key number assigned */
                  /* Using cursor T01WB9 */
                  pr_default.execute(7);
                  A14679InFilId = T01WB9_A14679InFilId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14679InFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14679InFilId), 10, 0));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPInFil");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1WB0( ) ;
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
            load1WB1923( ) ;
         }
         endLevel1WB1923( ) ;
      }
      closeExtendedTableCursors1WB1923( ) ;
   }

   public void update1WB1923( )
   {
      beforeValidate1WB1923( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1WB1923( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1WB1923( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1WB1923( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1WB1923( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01WB10 */
                  pr_default.execute(8, new Object[] {A14766InFilUsu, A14776InFilIp, A14767InFilObj, A14768InFilFReg, Boolean.valueOf(n14769InFilFIni), A14769InFilFIni, Boolean.valueOf(n14770InFilFFin), A14770InFilFFin, Boolean.valueOf(n14771InFilMaq), A14771InFilMaq, Boolean.valueOf(n14772InFilFase), A14772InFilFase, Boolean.valueOf(n14773InFilHdr), A14773InFilHdr, Boolean.valueOf(n14774InFilPar), A14774InFilPar, Boolean.valueOf(n14775InFilErr), Boolean.valueOf(A14775InFilErr), Boolean.valueOf(n14777InFilEmp), A14777InFilEmp, A14704InFilTkn, Long.valueOf(A14679InFilId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPInFil");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPInFil"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1WB1923( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1WB0( ) ;
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
         endLevel1WB1923( ) ;
      }
      closeExtendedTableCursors1WB1923( ) ;
   }

   public void deferredUpdate1WB1923( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1WB1923( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1WB1923( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1WB1923( ) ;
         afterConfirm1WB1923( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1WB1923( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01WB11 */
               pr_default.execute(9, new Object[] {Long.valueOf(A14679InFilId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPInFil");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1923 == 0 )
                     {
                        initAll1WB1923( ) ;
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
                     resetCaption1WB0( ) ;
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
      sMode1923 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1WB1923( ) ;
      Gx_mode = sMode1923 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1WB1923( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1WB1923( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1WB1923( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.infil");
         if ( AnyError == 0 )
         {
            confirmValues1WB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ingenieria.infil");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1WB1923( )
   {
      /* Using cursor T01WB12 */
      pr_default.execute(10);
      RcdFound1923 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1923 = (short)(1) ;
         A14679InFilId = T01WB12_A14679InFilId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14679InFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14679InFilId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1WB1923( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1923 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1923 = (short)(1) ;
         A14679InFilId = T01WB12_A14679InFilId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14679InFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14679InFilId), 10, 0));
      }
   }

   public void scanEnd1WB1923( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1WB1923( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1WB1923( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1WB1923( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1WB1923( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1WB1923( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1WB1923( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1WB1923( )
   {
      edtInFilId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInFilId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInFilId_Enabled), 5, 0), true);
      edtInFilUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInFilUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInFilUsu_Enabled), 5, 0), true);
      edtInFilIp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInFilIp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInFilIp_Enabled), 5, 0), true);
      edtInFilObj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInFilObj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInFilObj_Enabled), 5, 0), true);
      edtInFilFReg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInFilFReg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInFilFReg_Enabled), 5, 0), true);
      edtInFilFIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInFilFIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInFilFIni_Enabled), 5, 0), true);
      edtInFilFFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInFilFFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInFilFFin_Enabled), 5, 0), true);
      edtInFilMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInFilMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInFilMaq_Enabled), 5, 0), true);
      edtInFilFase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInFilFase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInFilFase_Enabled), 5, 0), true);
      edtInFilHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInFilHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInFilHdr_Enabled), 5, 0), true);
      edtInFilPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInFilPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInFilPar_Enabled), 5, 0), true);
      chkInFilErr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkInFilErr.getInternalname(), "Enabled", GXutil.ltrimstr( chkInFilErr.getEnabled(), 5, 0), true);
      edtInFilEmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInFilEmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInFilEmp_Enabled), 5, 0), true);
      edtInFilTkn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInFilTkn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInFilTkn_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1WB1923( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1WB0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.infil", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14679InFilId", GXutil.ltrim( localUtil.ntoc( Z14679InFilId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14766InFilUsu", GXutil.rtrim( Z14766InFilUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14776InFilIp", Z14776InFilIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14767InFilObj", Z14767InFilObj);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14768InFilFReg", localUtil.ttoc( Z14768InFilFReg, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14769InFilFIni", localUtil.ttoc( Z14769InFilFIni, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14770InFilFFin", localUtil.ttoc( Z14770InFilFFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14771InFilMaq", Z14771InFilMaq);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14772InFilFase", Z14772InFilFase);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14773InFilHdr", Z14773InFilHdr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14774InFilPar", Z14774InFilPar);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "Z14775InFilErr", Z14775InFilErr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14777InFilEmp", GXutil.rtrim( Z14777InFilEmp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14704InFilTkn", Z14704InFilTkn);
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
      return formatLink("app.ingenieria.infil", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.InFil" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "In Fil", "") ;
   }

   public void initializeNonKey1WB1923( )
   {
      A14766InFilUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14766InFilUsu", A14766InFilUsu);
      A14776InFilIp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14776InFilIp", A14776InFilIp);
      A14767InFilObj = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14767InFilObj", A14767InFilObj);
      A14768InFilFReg = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14768InFilFReg", localUtil.ttoc( A14768InFilFReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14769InFilFIni = GXutil.resetTime( GXutil.nullDate() );
      n14769InFilFIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14769InFilFIni", localUtil.ttoc( A14769InFilFIni, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14770InFilFFin = GXutil.resetTime( GXutil.nullDate() );
      n14770InFilFFin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14770InFilFFin", localUtil.ttoc( A14770InFilFFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14771InFilMaq = "" ;
      n14771InFilMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14771InFilMaq", A14771InFilMaq);
      A14772InFilFase = "" ;
      n14772InFilFase = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14772InFilFase", A14772InFilFase);
      A14773InFilHdr = "" ;
      n14773InFilHdr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14773InFilHdr", A14773InFilHdr);
      A14774InFilPar = "" ;
      n14774InFilPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14774InFilPar", A14774InFilPar);
      A14775InFilErr = false ;
      n14775InFilErr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14775InFilErr", A14775InFilErr);
      A14777InFilEmp = "" ;
      n14777InFilEmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14777InFilEmp", A14777InFilEmp);
      A14704InFilTkn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14704InFilTkn", A14704InFilTkn);
      Z14766InFilUsu = "" ;
      Z14776InFilIp = "" ;
      Z14767InFilObj = "" ;
      Z14768InFilFReg = GXutil.resetTime( GXutil.nullDate() );
      Z14769InFilFIni = GXutil.resetTime( GXutil.nullDate() );
      Z14770InFilFFin = GXutil.resetTime( GXutil.nullDate() );
      Z14771InFilMaq = "" ;
      Z14772InFilFase = "" ;
      Z14773InFilHdr = "" ;
      Z14774InFilPar = "" ;
      Z14775InFilErr = false ;
      Z14777InFilEmp = "" ;
      Z14704InFilTkn = "" ;
   }

   public void initAll1WB1923( )
   {
      A14679InFilId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14679InFilId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14679InFilId), 10, 0));
      initializeNonKey1WB1923( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671011105299", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/infil.js", "?202671011105299", false, true);
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
      edtInFilId_Internalname = "INFILID" ;
      edtInFilUsu_Internalname = "INFILUSU" ;
      edtInFilIp_Internalname = "INFILIP" ;
      edtInFilObj_Internalname = "INFILOBJ" ;
      edtInFilFReg_Internalname = "INFILFREG" ;
      edtInFilFIni_Internalname = "INFILFINI" ;
      edtInFilFFin_Internalname = "INFILFFIN" ;
      edtInFilMaq_Internalname = "INFILMAQ" ;
      edtInFilFase_Internalname = "INFILFASE" ;
      edtInFilHdr_Internalname = "INFILHDR" ;
      edtInFilPar_Internalname = "INFILPAR" ;
      chkInFilErr.setInternalname( "INFILERR" );
      edtInFilEmp_Internalname = "INFILEMP" ;
      edtInFilTkn_Internalname = "INFILTKN" ;
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
      Form.setCaption( httpContext.getMessage( "In Fil", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtInFilTkn_Enabled = 1 ;
      edtInFilEmp_Jsonclick = "" ;
      edtInFilEmp_Enabled = 1 ;
      chkInFilErr.setEnabled( 1 );
      edtInFilPar_Enabled = 1 ;
      edtInFilHdr_Enabled = 1 ;
      edtInFilFase_Enabled = 1 ;
      edtInFilMaq_Enabled = 1 ;
      edtInFilFFin_Jsonclick = "" ;
      edtInFilFFin_Enabled = 1 ;
      edtInFilFIni_Jsonclick = "" ;
      edtInFilFIni_Enabled = 1 ;
      edtInFilFReg_Jsonclick = "" ;
      edtInFilFReg_Enabled = 1 ;
      edtInFilObj_Jsonclick = "" ;
      edtInFilObj_Enabled = 1 ;
      edtInFilIp_Jsonclick = "" ;
      edtInFilIp_Enabled = 1 ;
      edtInFilUsu_Jsonclick = "" ;
      edtInFilUsu_Enabled = 1 ;
      edtInFilId_Jsonclick = "" ;
      edtInFilId_Enabled = 1 ;
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
      chkInFilErr.setName( "INFILERR" );
      chkInFilErr.setWebtags( "" );
      chkInFilErr.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkInFilErr.getInternalname(), "TitleCaption", chkInFilErr.getCaption(), true);
      chkInFilErr.setCheckedValue( "false" );
      A14775InFilErr = GXutil.strtobool( GXutil.booltostr( A14775InFilErr)) ;
      n14775InFilErr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14775InFilErr", A14775InFilErr);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      GX_FocusControl = edtInFilUsu_Internalname ;
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

   public void valid_Infilid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A14775InFilErr = GXutil.strtobool( GXutil.booltostr( A14775InFilErr)) ;
      n14775InFilErr = false ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14766InFilUsu", GXutil.rtrim( A14766InFilUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A14776InFilIp", A14776InFilIp);
      httpContext.ajax_rsp_assign_attri("", false, "A14767InFilObj", A14767InFilObj);
      httpContext.ajax_rsp_assign_attri("", false, "A14768InFilFReg", localUtil.ttoc( A14768InFilFReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14769InFilFIni", localUtil.ttoc( A14769InFilFIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14770InFilFFin", localUtil.ttoc( A14770InFilFFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14771InFilMaq", A14771InFilMaq);
      httpContext.ajax_rsp_assign_attri("", false, "A14772InFilFase", A14772InFilFase);
      httpContext.ajax_rsp_assign_attri("", false, "A14773InFilHdr", A14773InFilHdr);
      httpContext.ajax_rsp_assign_attri("", false, "A14774InFilPar", A14774InFilPar);
      httpContext.ajax_rsp_assign_attri("", false, "A14775InFilErr", A14775InFilErr);
      httpContext.ajax_rsp_assign_attri("", false, "A14777InFilEmp", GXutil.rtrim( A14777InFilEmp));
      httpContext.ajax_rsp_assign_attri("", false, "A14704InFilTkn", A14704InFilTkn);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14679InFilId", GXutil.ltrim( localUtil.ntoc( Z14679InFilId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14766InFilUsu", GXutil.rtrim( Z14766InFilUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14776InFilIp", Z14776InFilIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14767InFilObj", Z14767InFilObj);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14768InFilFReg", localUtil.ttoc( Z14768InFilFReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14769InFilFIni", localUtil.ttoc( Z14769InFilFIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14770InFilFFin", localUtil.ttoc( Z14770InFilFFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14771InFilMaq", Z14771InFilMaq);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14772InFilFase", Z14772InFilFase);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14773InFilHdr", Z14773InFilHdr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14774InFilPar", Z14774InFilPar);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14775InFilErr", GXutil.booltostr( Z14775InFilErr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14777InFilEmp", GXutil.rtrim( Z14777InFilEmp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14704InFilTkn", Z14704InFilTkn);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A14775InFilErr',fld:'INFILERR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A14775InFilErr',fld:'INFILERR',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A14775InFilErr',fld:'INFILERR',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A14775InFilErr',fld:'INFILERR',pic:''}]}");
      setEventMetadata("VALID_INFILID","{handler:'valid_Infilid',iparms:[{av:'A14679InFilId',fld:'INFILID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A14775InFilErr',fld:'INFILERR',pic:''}]");
      setEventMetadata("VALID_INFILID",",oparms:[{av:'A14766InFilUsu',fld:'INFILUSU',pic:''},{av:'A14776InFilIp',fld:'INFILIP',pic:''},{av:'A14767InFilObj',fld:'INFILOBJ',pic:''},{av:'A14768InFilFReg',fld:'INFILFREG',pic:'99/99/99 99:99:99.999'},{av:'A14769InFilFIni',fld:'INFILFINI',pic:'99/99/99 99:99'},{av:'A14770InFilFFin',fld:'INFILFFIN',pic:'99/99/99 99:99'},{av:'A14771InFilMaq',fld:'INFILMAQ',pic:''},{av:'A14772InFilFase',fld:'INFILFASE',pic:''},{av:'A14773InFilHdr',fld:'INFILHDR',pic:''},{av:'A14774InFilPar',fld:'INFILPAR',pic:''},{av:'A14777InFilEmp',fld:'INFILEMP',pic:''},{av:'A14704InFilTkn',fld:'INFILTKN',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14679InFilId'},{av:'Z14766InFilUsu'},{av:'Z14776InFilIp'},{av:'Z14767InFilObj'},{av:'Z14768InFilFReg'},{av:'Z14769InFilFIni'},{av:'Z14770InFilFFin'},{av:'Z14771InFilMaq'},{av:'Z14772InFilFase'},{av:'Z14773InFilHdr'},{av:'Z14774InFilPar'},{av:'Z14775InFilErr'},{av:'Z14777InFilEmp'},{av:'Z14704InFilTkn'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{av:'A14775InFilErr',fld:'INFILERR',pic:''}]}");
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
      Z14766InFilUsu = "" ;
      Z14776InFilIp = "" ;
      Z14767InFilObj = "" ;
      Z14768InFilFReg = GXutil.resetTime( GXutil.nullDate() );
      Z14769InFilFIni = GXutil.resetTime( GXutil.nullDate() );
      Z14770InFilFFin = GXutil.resetTime( GXutil.nullDate() );
      Z14771InFilMaq = "" ;
      Z14772InFilFase = "" ;
      Z14773InFilHdr = "" ;
      Z14774InFilPar = "" ;
      Z14777InFilEmp = "" ;
      Z14704InFilTkn = "" ;
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
      A14766InFilUsu = "" ;
      A14776InFilIp = "" ;
      A14767InFilObj = "" ;
      A14768InFilFReg = GXutil.resetTime( GXutil.nullDate() );
      A14769InFilFIni = GXutil.resetTime( GXutil.nullDate() );
      A14770InFilFFin = GXutil.resetTime( GXutil.nullDate() );
      A14771InFilMaq = "" ;
      A14772InFilFase = "" ;
      A14773InFilHdr = "" ;
      A14774InFilPar = "" ;
      A14777InFilEmp = "" ;
      A14704InFilTkn = "" ;
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
      T01WB4_A14679InFilId = new long[1] ;
      T01WB4_A14766InFilUsu = new String[] {""} ;
      T01WB4_A14776InFilIp = new String[] {""} ;
      T01WB4_A14767InFilObj = new String[] {""} ;
      T01WB4_A14768InFilFReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WB4_A14769InFilFIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01WB4_n14769InFilFIni = new boolean[] {false} ;
      T01WB4_A14770InFilFFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01WB4_n14770InFilFFin = new boolean[] {false} ;
      T01WB4_A14771InFilMaq = new String[] {""} ;
      T01WB4_n14771InFilMaq = new boolean[] {false} ;
      T01WB4_A14772InFilFase = new String[] {""} ;
      T01WB4_n14772InFilFase = new boolean[] {false} ;
      T01WB4_A14773InFilHdr = new String[] {""} ;
      T01WB4_n14773InFilHdr = new boolean[] {false} ;
      T01WB4_A14774InFilPar = new String[] {""} ;
      T01WB4_n14774InFilPar = new boolean[] {false} ;
      T01WB4_A14775InFilErr = new boolean[] {false} ;
      T01WB4_n14775InFilErr = new boolean[] {false} ;
      T01WB4_A14777InFilEmp = new String[] {""} ;
      T01WB4_n14777InFilEmp = new boolean[] {false} ;
      T01WB4_A14704InFilTkn = new String[] {""} ;
      T01WB5_A14679InFilId = new long[1] ;
      T01WB3_A14679InFilId = new long[1] ;
      T01WB3_A14766InFilUsu = new String[] {""} ;
      T01WB3_A14776InFilIp = new String[] {""} ;
      T01WB3_A14767InFilObj = new String[] {""} ;
      T01WB3_A14768InFilFReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WB3_A14769InFilFIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01WB3_n14769InFilFIni = new boolean[] {false} ;
      T01WB3_A14770InFilFFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01WB3_n14770InFilFFin = new boolean[] {false} ;
      T01WB3_A14771InFilMaq = new String[] {""} ;
      T01WB3_n14771InFilMaq = new boolean[] {false} ;
      T01WB3_A14772InFilFase = new String[] {""} ;
      T01WB3_n14772InFilFase = new boolean[] {false} ;
      T01WB3_A14773InFilHdr = new String[] {""} ;
      T01WB3_n14773InFilHdr = new boolean[] {false} ;
      T01WB3_A14774InFilPar = new String[] {""} ;
      T01WB3_n14774InFilPar = new boolean[] {false} ;
      T01WB3_A14775InFilErr = new boolean[] {false} ;
      T01WB3_n14775InFilErr = new boolean[] {false} ;
      T01WB3_A14777InFilEmp = new String[] {""} ;
      T01WB3_n14777InFilEmp = new boolean[] {false} ;
      T01WB3_A14704InFilTkn = new String[] {""} ;
      sMode1923 = "" ;
      T01WB6_A14679InFilId = new long[1] ;
      T01WB7_A14679InFilId = new long[1] ;
      T01WB2_A14679InFilId = new long[1] ;
      T01WB2_A14766InFilUsu = new String[] {""} ;
      T01WB2_A14776InFilIp = new String[] {""} ;
      T01WB2_A14767InFilObj = new String[] {""} ;
      T01WB2_A14768InFilFReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WB2_A14769InFilFIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01WB2_n14769InFilFIni = new boolean[] {false} ;
      T01WB2_A14770InFilFFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01WB2_n14770InFilFFin = new boolean[] {false} ;
      T01WB2_A14771InFilMaq = new String[] {""} ;
      T01WB2_n14771InFilMaq = new boolean[] {false} ;
      T01WB2_A14772InFilFase = new String[] {""} ;
      T01WB2_n14772InFilFase = new boolean[] {false} ;
      T01WB2_A14773InFilHdr = new String[] {""} ;
      T01WB2_n14773InFilHdr = new boolean[] {false} ;
      T01WB2_A14774InFilPar = new String[] {""} ;
      T01WB2_n14774InFilPar = new boolean[] {false} ;
      T01WB2_A14775InFilErr = new boolean[] {false} ;
      T01WB2_n14775InFilErr = new boolean[] {false} ;
      T01WB2_A14777InFilEmp = new String[] {""} ;
      T01WB2_n14777InFilEmp = new boolean[] {false} ;
      T01WB2_A14704InFilTkn = new String[] {""} ;
      T01WB9_A14679InFilId = new long[1] ;
      T01WB12_A14679InFilId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ14766InFilUsu = "" ;
      ZZ14776InFilIp = "" ;
      ZZ14767InFilObj = "" ;
      ZZ14768InFilFReg = GXutil.resetTime( GXutil.nullDate() );
      ZZ14769InFilFIni = GXutil.resetTime( GXutil.nullDate() );
      ZZ14770InFilFFin = GXutil.resetTime( GXutil.nullDate() );
      ZZ14771InFilMaq = "" ;
      ZZ14772InFilFase = "" ;
      ZZ14773InFilHdr = "" ;
      ZZ14774InFilPar = "" ;
      ZZ14777InFilEmp = "" ;
      ZZ14704InFilTkn = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.infil__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.infil__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.infil__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.infil__default(),
         new Object[] {
             new Object[] {
            T01WB2_A14679InFilId, T01WB2_A14766InFilUsu, T01WB2_A14776InFilIp, T01WB2_A14767InFilObj, T01WB2_A14768InFilFReg, T01WB2_A14769InFilFIni, T01WB2_n14769InFilFIni, T01WB2_A14770InFilFFin, T01WB2_n14770InFilFFin, T01WB2_A14771InFilMaq,
            T01WB2_n14771InFilMaq, T01WB2_A14772InFilFase, T01WB2_n14772InFilFase, T01WB2_A14773InFilHdr, T01WB2_n14773InFilHdr, T01WB2_A14774InFilPar, T01WB2_n14774InFilPar, T01WB2_A14775InFilErr, T01WB2_n14775InFilErr, T01WB2_A14777InFilEmp,
            T01WB2_n14777InFilEmp, T01WB2_A14704InFilTkn
            }
            , new Object[] {
            T01WB3_A14679InFilId, T01WB3_A14766InFilUsu, T01WB3_A14776InFilIp, T01WB3_A14767InFilObj, T01WB3_A14768InFilFReg, T01WB3_A14769InFilFIni, T01WB3_n14769InFilFIni, T01WB3_A14770InFilFFin, T01WB3_n14770InFilFFin, T01WB3_A14771InFilMaq,
            T01WB3_n14771InFilMaq, T01WB3_A14772InFilFase, T01WB3_n14772InFilFase, T01WB3_A14773InFilHdr, T01WB3_n14773InFilHdr, T01WB3_A14774InFilPar, T01WB3_n14774InFilPar, T01WB3_A14775InFilErr, T01WB3_n14775InFilErr, T01WB3_A14777InFilEmp,
            T01WB3_n14777InFilEmp, T01WB3_A14704InFilTkn
            }
            , new Object[] {
            T01WB4_A14679InFilId, T01WB4_A14766InFilUsu, T01WB4_A14776InFilIp, T01WB4_A14767InFilObj, T01WB4_A14768InFilFReg, T01WB4_A14769InFilFIni, T01WB4_n14769InFilFIni, T01WB4_A14770InFilFFin, T01WB4_n14770InFilFFin, T01WB4_A14771InFilMaq,
            T01WB4_n14771InFilMaq, T01WB4_A14772InFilFase, T01WB4_n14772InFilFase, T01WB4_A14773InFilHdr, T01WB4_n14773InFilHdr, T01WB4_A14774InFilPar, T01WB4_n14774InFilPar, T01WB4_A14775InFilErr, T01WB4_n14775InFilErr, T01WB4_A14777InFilEmp,
            T01WB4_n14777InFilEmp, T01WB4_A14704InFilTkn
            }
            , new Object[] {
            T01WB5_A14679InFilId
            }
            , new Object[] {
            T01WB6_A14679InFilId
            }
            , new Object[] {
            T01WB7_A14679InFilId
            }
            , new Object[] {
            }
            , new Object[] {
            T01WB9_A14679InFilId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01WB12_A14679InFilId
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
   private short RcdFound1923 ;
   private short nIsDirty_1923 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtInFilId_Enabled ;
   private int edtInFilUsu_Enabled ;
   private int edtInFilIp_Enabled ;
   private int edtInFilObj_Enabled ;
   private int edtInFilFReg_Enabled ;
   private int edtInFilFIni_Enabled ;
   private int edtInFilFFin_Enabled ;
   private int edtInFilMaq_Enabled ;
   private int edtInFilFase_Enabled ;
   private int edtInFilHdr_Enabled ;
   private int edtInFilPar_Enabled ;
   private int edtInFilEmp_Enabled ;
   private int edtInFilTkn_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z14679InFilId ;
   private long A14679InFilId ;
   private long ZZ14679InFilId ;
   private String sPrefix ;
   private String Z14766InFilUsu ;
   private String Z14777InFilEmp ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtInFilId_Internalname ;
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
   private String edtInFilId_Jsonclick ;
   private String edtInFilUsu_Internalname ;
   private String A14766InFilUsu ;
   private String edtInFilUsu_Jsonclick ;
   private String edtInFilIp_Internalname ;
   private String edtInFilIp_Jsonclick ;
   private String edtInFilObj_Internalname ;
   private String edtInFilObj_Jsonclick ;
   private String edtInFilFReg_Internalname ;
   private String edtInFilFReg_Jsonclick ;
   private String edtInFilFIni_Internalname ;
   private String edtInFilFIni_Jsonclick ;
   private String edtInFilFFin_Internalname ;
   private String edtInFilFFin_Jsonclick ;
   private String edtInFilMaq_Internalname ;
   private String edtInFilFase_Internalname ;
   private String edtInFilHdr_Internalname ;
   private String edtInFilPar_Internalname ;
   private String edtInFilEmp_Internalname ;
   private String A14777InFilEmp ;
   private String edtInFilEmp_Jsonclick ;
   private String edtInFilTkn_Internalname ;
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
   private String sMode1923 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ14766InFilUsu ;
   private String ZZ14777InFilEmp ;
   private java.util.Date Z14768InFilFReg ;
   private java.util.Date Z14769InFilFIni ;
   private java.util.Date Z14770InFilFFin ;
   private java.util.Date A14768InFilFReg ;
   private java.util.Date A14769InFilFIni ;
   private java.util.Date A14770InFilFFin ;
   private java.util.Date ZZ14768InFilFReg ;
   private java.util.Date ZZ14769InFilFIni ;
   private java.util.Date ZZ14770InFilFFin ;
   private boolean Z14775InFilErr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean A14775InFilErr ;
   private boolean n14775InFilErr ;
   private boolean n14769InFilFIni ;
   private boolean n14770InFilFFin ;
   private boolean n14771InFilMaq ;
   private boolean n14772InFilFase ;
   private boolean n14773InFilHdr ;
   private boolean n14774InFilPar ;
   private boolean n14777InFilEmp ;
   private boolean Gx_longc ;
   private boolean ZZ14775InFilErr ;
   private String Z14776InFilIp ;
   private String Z14767InFilObj ;
   private String Z14771InFilMaq ;
   private String Z14772InFilFase ;
   private String Z14773InFilHdr ;
   private String Z14774InFilPar ;
   private String Z14704InFilTkn ;
   private String A14776InFilIp ;
   private String A14767InFilObj ;
   private String A14771InFilMaq ;
   private String A14772InFilFase ;
   private String A14773InFilHdr ;
   private String A14774InFilPar ;
   private String A14704InFilTkn ;
   private String ZZ14776InFilIp ;
   private String ZZ14767InFilObj ;
   private String ZZ14771InFilMaq ;
   private String ZZ14772InFilFase ;
   private String ZZ14773InFilHdr ;
   private String ZZ14774InFilPar ;
   private String ZZ14704InFilTkn ;
   private ICheckbox chkInFilErr ;
   private IDataStoreProvider pr_default ;
   private long[] T01WB4_A14679InFilId ;
   private String[] T01WB4_A14766InFilUsu ;
   private String[] T01WB4_A14776InFilIp ;
   private String[] T01WB4_A14767InFilObj ;
   private java.util.Date[] T01WB4_A14768InFilFReg ;
   private java.util.Date[] T01WB4_A14769InFilFIni ;
   private boolean[] T01WB4_n14769InFilFIni ;
   private java.util.Date[] T01WB4_A14770InFilFFin ;
   private boolean[] T01WB4_n14770InFilFFin ;
   private String[] T01WB4_A14771InFilMaq ;
   private boolean[] T01WB4_n14771InFilMaq ;
   private String[] T01WB4_A14772InFilFase ;
   private boolean[] T01WB4_n14772InFilFase ;
   private String[] T01WB4_A14773InFilHdr ;
   private boolean[] T01WB4_n14773InFilHdr ;
   private String[] T01WB4_A14774InFilPar ;
   private boolean[] T01WB4_n14774InFilPar ;
   private boolean[] T01WB4_A14775InFilErr ;
   private boolean[] T01WB4_n14775InFilErr ;
   private String[] T01WB4_A14777InFilEmp ;
   private boolean[] T01WB4_n14777InFilEmp ;
   private String[] T01WB4_A14704InFilTkn ;
   private long[] T01WB5_A14679InFilId ;
   private long[] T01WB3_A14679InFilId ;
   private String[] T01WB3_A14766InFilUsu ;
   private String[] T01WB3_A14776InFilIp ;
   private String[] T01WB3_A14767InFilObj ;
   private java.util.Date[] T01WB3_A14768InFilFReg ;
   private java.util.Date[] T01WB3_A14769InFilFIni ;
   private boolean[] T01WB3_n14769InFilFIni ;
   private java.util.Date[] T01WB3_A14770InFilFFin ;
   private boolean[] T01WB3_n14770InFilFFin ;
   private String[] T01WB3_A14771InFilMaq ;
   private boolean[] T01WB3_n14771InFilMaq ;
   private String[] T01WB3_A14772InFilFase ;
   private boolean[] T01WB3_n14772InFilFase ;
   private String[] T01WB3_A14773InFilHdr ;
   private boolean[] T01WB3_n14773InFilHdr ;
   private String[] T01WB3_A14774InFilPar ;
   private boolean[] T01WB3_n14774InFilPar ;
   private boolean[] T01WB3_A14775InFilErr ;
   private boolean[] T01WB3_n14775InFilErr ;
   private String[] T01WB3_A14777InFilEmp ;
   private boolean[] T01WB3_n14777InFilEmp ;
   private String[] T01WB3_A14704InFilTkn ;
   private long[] T01WB6_A14679InFilId ;
   private long[] T01WB7_A14679InFilId ;
   private long[] T01WB2_A14679InFilId ;
   private String[] T01WB2_A14766InFilUsu ;
   private String[] T01WB2_A14776InFilIp ;
   private String[] T01WB2_A14767InFilObj ;
   private java.util.Date[] T01WB2_A14768InFilFReg ;
   private java.util.Date[] T01WB2_A14769InFilFIni ;
   private boolean[] T01WB2_n14769InFilFIni ;
   private java.util.Date[] T01WB2_A14770InFilFFin ;
   private boolean[] T01WB2_n14770InFilFFin ;
   private String[] T01WB2_A14771InFilMaq ;
   private boolean[] T01WB2_n14771InFilMaq ;
   private String[] T01WB2_A14772InFilFase ;
   private boolean[] T01WB2_n14772InFilFase ;
   private String[] T01WB2_A14773InFilHdr ;
   private boolean[] T01WB2_n14773InFilHdr ;
   private String[] T01WB2_A14774InFilPar ;
   private boolean[] T01WB2_n14774InFilPar ;
   private boolean[] T01WB2_A14775InFilErr ;
   private boolean[] T01WB2_n14775InFilErr ;
   private String[] T01WB2_A14777InFilEmp ;
   private boolean[] T01WB2_n14777InFilEmp ;
   private String[] T01WB2_A14704InFilTkn ;
   private long[] T01WB9_A14679InFilId ;
   private long[] T01WB12_A14679InFilId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class infil__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class infil__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class infil__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class infil__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01WB2", "SELECT InFilId, InFilUsu, InFilIp, InFilObj, InFilFReg, InFilFIni, InFilFFin, InFilMaq, InFilFase, InFilHdr, InFilPar, InFilErr, InFilEmp, InFilTkn FROM TXPInFil WHERE InFilId = ?  FOR UPDATE OF InFilUsu, InFilIp, InFilObj, InFilFReg, InFilFIni, InFilFFin, InFilMaq, InFilFase, InFilHdr, InFilPar, InFilErr, InFilEmp, InFilTkn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WB3", "SELECT InFilId, InFilUsu, InFilIp, InFilObj, InFilFReg, InFilFIni, InFilFFin, InFilMaq, InFilFase, InFilHdr, InFilPar, InFilErr, InFilEmp, InFilTkn FROM TXPInFil WHERE InFilId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WB4", "SELECT /*+ FIRST_ROWS(100) */ TM1.InFilId, TM1.InFilUsu, TM1.InFilIp, TM1.InFilObj, TM1.InFilFReg, TM1.InFilFIni, TM1.InFilFFin, TM1.InFilMaq, TM1.InFilFase, TM1.InFilHdr, TM1.InFilPar, TM1.InFilErr, TM1.InFilEmp, TM1.InFilTkn FROM TXPInFil TM1 WHERE TM1.InFilId = ? ORDER BY TM1.InFilId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WB5", "SELECT /*+ FIRST_ROWS(1) */ InFilId FROM TXPInFil WHERE InFilId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WB6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ InFilId FROM TXPInFil WHERE ( InFilId > ?) ORDER BY InFilId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01WB7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ InFilId FROM TXPInFil WHERE ( InFilId < ?) ORDER BY InFilId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01WB8", "INSERT INTO TXPInFil(InFilUsu, InFilIp, InFilObj, InFilFReg, InFilFIni, InFilFFin, InFilMaq, InFilFase, InFilHdr, InFilPar, InFilErr, InFilEmp, InFilTkn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPInFil")
         ,new ForEachCursor("T01WB9", "SELECT InFilId.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01WB10", "UPDATE TXPInFil SET InFilUsu=?, InFilIp=?, InFilObj=?, InFilFReg=?, InFilFIni=?, InFilFFin=?, InFilMaq=?, InFilFase=?, InFilHdr=?, InFilPar=?, InFilErr=?, InFilEmp=?, InFilTkn=?  WHERE InFilId = ?", GX_NOMASK, "TXPInFil")
         ,new UpdateCursor("T01WB11", "DELETE FROM TXPInFil  WHERE InFilId = ?", GX_NOMASK, "TXPInFil")
         ,new ForEachCursor("T01WB12", "SELECT /*+ FIRST_ROWS(100) */ InFilId FROM TXPInFil ORDER BY InFilId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5, true);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((boolean[]) buf[17])[0] = rslt.getBoolean(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5, true);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((boolean[]) buf[17])[0] = rslt.getBoolean(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5, true);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((boolean[]) buf[17])[0] = rslt.getBoolean(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14);
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false, true);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[9], 120000);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 120000);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[13], 120000);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 120000);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(11, ((Boolean) parms[17]).booleanValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 3);
               }
               stmt.setVarchar(13, (String)parms[20], 256, false);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false, true);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[9], 120000);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 120000);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[13], 120000);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 120000);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(11, ((Boolean) parms[17]).booleanValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 3);
               }
               stmt.setVarchar(13, (String)parms[20], 256, false);
               stmt.setLong(14, ((Number) parms[21]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

