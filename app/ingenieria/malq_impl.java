package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class malq_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "M Alerta Maquinas Ingenieria", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMAlqId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public malq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public malq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( malq_impl.class ));
   }

   public malq_impl( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkMAlqEr = UIFactory.getCheckbox(this);
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
      A14808MAlqEr = GXutil.strtobool( GXutil.booltostr( A14808MAlqEr)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14808MAlqEr", A14808MAlqEr);
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "M Alerta Maquinas Ingenieria", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MAlq.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Ingenieria\\MAlq.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqId_Internalname, httpContext.getMessage( "Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqId_Internalname, GXutil.ltrim( localUtil.ntoc( A14788MAlqId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAlqId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14788MAlqId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14788MAlqId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqEmprCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqEmprCo_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqEmprCo_Internalname, GXutil.rtrim( A14789MAlqEmprCo), GXutil.rtrim( localUtil.format( A14789MAlqEmprCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqEmprCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqEmprCo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqMaqCod_Internalname, httpContext.getMessage( "máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqMaqCod_Internalname, GXutil.rtrim( A14790MAlqMaqCod), GXutil.rtrim( localUtil.format( A14790MAlqMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\MaqCod", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqMaqDsc_Internalname, httpContext.getMessage( "Máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqMaqDsc_Internalname, A14791MAlqMaqDsc, GXutil.rtrim( localUtil.format( A14791MAlqMaqDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqMaqDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqMaqDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqFasCod_Internalname, httpContext.getMessage( "fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqFasCod_Internalname, GXutil.rtrim( A14792MAlqFasCod), GXutil.rtrim( localUtil.format( A14792MAlqFasCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqFasCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\FasCod", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqFasDsc_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqFasDsc_Internalname, A14793MAlqFasDsc, GXutil.rtrim( localUtil.format( A14793MAlqFasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqFasDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqFasDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqBarCod_Internalname, httpContext.getMessage( "Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14794MAlqBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAlqBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14794MAlqBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14794MAlqBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqBarReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqBarReo_Internalname, httpContext.getMessage( "Reoperado Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A14795MAlqBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAlqBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14795MAlqBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A14795MAlqBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqBarReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqBarPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqBarPar_Internalname, httpContext.getMessage( "Particion Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqBarPar_Internalname, GXutil.rtrim( A14796MAlqBarPar), GXutil.rtrim( localUtil.format( A14796MAlqBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqBarPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqHdr_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqHdr_Internalname, GXutil.rtrim( A14797MAlqHdr), GXutil.rtrim( localUtil.format( A14797MAlqHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqHdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqHdr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Hdr", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqHdr2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqHdr2_Internalname, httpContext.getMessage( " Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqHdr2_Internalname, A14798MAlqHdr2, GXutil.rtrim( localUtil.format( A14798MAlqHdr2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqHdr2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqHdr2_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqParCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqParCod_Internalname, httpContext.getMessage( "parametro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqParCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14799MAlqParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAlqParCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14799MAlqParCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14799MAlqParCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqParCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqParCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqParDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqParDsc_Internalname, httpContext.getMessage( "Parametro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqParDsc_Internalname, A14800MAlqParDsc, GXutil.rtrim( localUtil.format( A14800MAlqParDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqParDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqParDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqPLC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqPLC_Internalname, httpContext.getMessage( "c/PLC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqPLC_Internalname, A14801MAlqPLC, GXutil.rtrim( localUtil.format( A14801MAlqPLC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqPLC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqPLC_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqOrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqOrd_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A14802MAlqOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAlqOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14802MAlqOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14802MAlqOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqOrd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqLin_Internalname, httpContext.getMessage( "Lìnea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqLin_Internalname, GXutil.ltrim( localUtil.ntoc( A14803MAlqLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAlqLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14803MAlqLin), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14803MAlqLin), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqLin_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqFec_Internalname, httpContext.getMessage( "Registrado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMAlqFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqFec_Internalname, localUtil.ttoc( A14804MAlqFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14804MAlqFec, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqFec_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMAlqFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMAlqFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MAlq.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqVal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqVal_Internalname, httpContext.getMessage( "Valor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqVal_Internalname, GXutil.rtrim( A14805MAlqVal), GXutil.rtrim( localUtil.format( A14805MAlqVal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqVal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqVal_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqValMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqValMin_Internalname, httpContext.getMessage( "Minimo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqValMin_Internalname, GXutil.rtrim( A14806MAlqValMin), GXutil.rtrim( localUtil.format( A14806MAlqValMin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqValMin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqValMin_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqValMax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqValMax_Internalname, httpContext.getMessage( "Maximo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqValMax_Internalname, GXutil.rtrim( A14807MAlqValMax), GXutil.rtrim( localUtil.format( A14807MAlqValMax, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqValMax_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqValMax_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkMAlqEr.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkMAlqEr.getInternalname(), httpContext.getMessage( "Error", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkMAlqEr.getInternalname(), GXutil.booltostr( A14808MAlqEr), "", httpContext.getMessage( "Error", ""), 1, chkMAlqEr.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(134, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,134);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqFecEv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqFecEv_Internalname, httpContext.getMessage( "Evaluado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMAlqFecEv_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqFecEv_Internalname, localUtil.ttoc( A14809MAlqFecEv, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14809MAlqFecEv, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqFecEv_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqFecEv_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMAlqFecEv_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMAlqFecEv_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MAlq.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqParId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqParId_Internalname, httpContext.getMessage( "Parametro Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqParId_Internalname, GXutil.ltrim( localUtil.ntoc( A14810MAlqParId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAlqParId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14810MAlqParId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14810MAlqParId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqParId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqParId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqUsu_Internalname, GXutil.rtrim( A14811MAlqUsu), GXutil.rtrim( localUtil.format( A14811MAlqUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqUsu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqIp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqIp_Internalname, httpContext.getMessage( "Ip", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqIp_Internalname, A14812MAlqIp, GXutil.rtrim( localUtil.format( A14812MAlqIp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqIp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqIp_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Ip", "left", true, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqReg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqReg_Internalname, httpContext.getMessage( "Registro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMAlqReg_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlqReg_Internalname, localUtil.ttoc( A14813MAlqReg, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14813MAlqReg, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlqReg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlqReg_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMAlqReg_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMAlqReg_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MAlq.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlqTkn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlqTkn_Internalname, httpContext.getMessage( "Token", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMAlqTkn_Internalname, A14814MAlqTkn, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", (short)(0), 1, edtMAlqTkn_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Ingenieria\\MAlq.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAlq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAlq.htm");
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
         Z14788MAlqId = localUtil.ctol( httpContext.cgiGet( "Z14788MAlqId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14789MAlqEmprCo = httpContext.cgiGet( "Z14789MAlqEmprCo") ;
         Z14790MAlqMaqCod = httpContext.cgiGet( "Z14790MAlqMaqCod") ;
         Z14791MAlqMaqDsc = httpContext.cgiGet( "Z14791MAlqMaqDsc") ;
         Z14792MAlqFasCod = httpContext.cgiGet( "Z14792MAlqFasCod") ;
         Z14793MAlqFasDsc = httpContext.cgiGet( "Z14793MAlqFasDsc") ;
         Z14794MAlqBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z14794MAlqBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14795MAlqBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14795MAlqBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14796MAlqBarPar = httpContext.cgiGet( "Z14796MAlqBarPar") ;
         Z14797MAlqHdr = httpContext.cgiGet( "Z14797MAlqHdr") ;
         Z14798MAlqHdr2 = httpContext.cgiGet( "Z14798MAlqHdr2") ;
         Z14799MAlqParCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z14799MAlqParCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14800MAlqParDsc = httpContext.cgiGet( "Z14800MAlqParDsc") ;
         Z14801MAlqPLC = httpContext.cgiGet( "Z14801MAlqPLC") ;
         Z14802MAlqOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z14802MAlqOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14803MAlqLin = localUtil.ctol( httpContext.cgiGet( "Z14803MAlqLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14804MAlqFec = localUtil.ctot( httpContext.cgiGet( "Z14804MAlqFec"), 0) ;
         Z14805MAlqVal = httpContext.cgiGet( "Z14805MAlqVal") ;
         Z14806MAlqValMin = httpContext.cgiGet( "Z14806MAlqValMin") ;
         Z14807MAlqValMax = httpContext.cgiGet( "Z14807MAlqValMax") ;
         Z14808MAlqEr = GXutil.strtobool( httpContext.cgiGet( "Z14808MAlqEr")) ;
         Z14809MAlqFecEv = localUtil.ctot( httpContext.cgiGet( "Z14809MAlqFecEv"), 0) ;
         Z14810MAlqParId = localUtil.ctol( httpContext.cgiGet( "Z14810MAlqParId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14811MAlqUsu = httpContext.cgiGet( "Z14811MAlqUsu") ;
         Z14812MAlqIp = httpContext.cgiGet( "Z14812MAlqIp") ;
         Z14813MAlqReg = localUtil.ctot( httpContext.cgiGet( "Z14813MAlqReg"), 0) ;
         Z14814MAlqTkn = httpContext.cgiGet( "Z14814MAlqTkn") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAlqId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAlqId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MALQID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAlqId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14788MAlqId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14788MAlqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14788MAlqId), 10, 0));
         }
         else
         {
            A14788MAlqId = localUtil.ctol( httpContext.cgiGet( edtMAlqId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14788MAlqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14788MAlqId), 10, 0));
         }
         A14789MAlqEmprCo = httpContext.cgiGet( edtMAlqEmprCo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14789MAlqEmprCo", A14789MAlqEmprCo);
         A14790MAlqMaqCod = httpContext.cgiGet( edtMAlqMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14790MAlqMaqCod", A14790MAlqMaqCod);
         A14791MAlqMaqDsc = httpContext.cgiGet( edtMAlqMaqDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14791MAlqMaqDsc", A14791MAlqMaqDsc);
         A14792MAlqFasCod = httpContext.cgiGet( edtMAlqFasCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14792MAlqFasCod", A14792MAlqFasCod);
         A14793MAlqFasDsc = httpContext.cgiGet( edtMAlqFasDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14793MAlqFasDsc", A14793MAlqFasDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAlqBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAlqBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MALQBARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAlqBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14794MAlqBarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14794MAlqBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14794MAlqBarCod), 8, 0));
         }
         else
         {
            A14794MAlqBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMAlqBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14794MAlqBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14794MAlqBarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAlqBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAlqBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MALQBARREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAlqBarReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14795MAlqBarReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14795MAlqBarReo", GXutil.str( A14795MAlqBarReo, 1, 0));
         }
         else
         {
            A14795MAlqBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtMAlqBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14795MAlqBarReo", GXutil.str( A14795MAlqBarReo, 1, 0));
         }
         A14796MAlqBarPar = httpContext.cgiGet( edtMAlqBarPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14796MAlqBarPar", A14796MAlqBarPar);
         A14797MAlqHdr = httpContext.cgiGet( edtMAlqHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14797MAlqHdr", A14797MAlqHdr);
         A14798MAlqHdr2 = httpContext.cgiGet( edtMAlqHdr2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14798MAlqHdr2", A14798MAlqHdr2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAlqParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAlqParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MALQPARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAlqParCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14799MAlqParCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14799MAlqParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14799MAlqParCod), 4, 0));
         }
         else
         {
            A14799MAlqParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtMAlqParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14799MAlqParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14799MAlqParCod), 4, 0));
         }
         A14800MAlqParDsc = httpContext.cgiGet( edtMAlqParDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14800MAlqParDsc", A14800MAlqParDsc);
         A14801MAlqPLC = httpContext.cgiGet( edtMAlqPLC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14801MAlqPLC", A14801MAlqPLC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAlqOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAlqOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MALQORD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAlqOrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14802MAlqOrd = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14802MAlqOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14802MAlqOrd), 4, 0));
         }
         else
         {
            A14802MAlqOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtMAlqOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14802MAlqOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14802MAlqOrd), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAlqLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAlqLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MALQLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAlqLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14803MAlqLin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14803MAlqLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14803MAlqLin), 12, 0));
         }
         else
         {
            A14803MAlqLin = localUtil.ctol( httpContext.cgiGet( edtMAlqLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14803MAlqLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14803MAlqLin), 12, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMAlqFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MALQFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAlqFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14804MAlqFec = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14804MAlqFec", localUtil.ttoc( A14804MAlqFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14804MAlqFec = localUtil.ctot( httpContext.cgiGet( edtMAlqFec_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14804MAlqFec", localUtil.ttoc( A14804MAlqFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A14805MAlqVal = httpContext.cgiGet( edtMAlqVal_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14805MAlqVal", A14805MAlqVal);
         A14806MAlqValMin = httpContext.cgiGet( edtMAlqValMin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14806MAlqValMin", A14806MAlqValMin);
         A14807MAlqValMax = httpContext.cgiGet( edtMAlqValMax_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14807MAlqValMax", A14807MAlqValMax);
         A14808MAlqEr = GXutil.strtobool( httpContext.cgiGet( chkMAlqEr.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14808MAlqEr", A14808MAlqEr);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMAlqFecEv_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MALQFECEV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAlqFecEv_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14809MAlqFecEv = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14809MAlqFecEv", localUtil.ttoc( A14809MAlqFecEv, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14809MAlqFecEv = localUtil.ctot( httpContext.cgiGet( edtMAlqFecEv_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14809MAlqFecEv", localUtil.ttoc( A14809MAlqFecEv, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAlqParId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAlqParId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MALQPARID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAlqParId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14810MAlqParId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14810MAlqParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14810MAlqParId), 10, 0));
         }
         else
         {
            A14810MAlqParId = localUtil.ctol( httpContext.cgiGet( edtMAlqParId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14810MAlqParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14810MAlqParId), 10, 0));
         }
         A14811MAlqUsu = httpContext.cgiGet( edtMAlqUsu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14811MAlqUsu", A14811MAlqUsu);
         A14812MAlqIp = httpContext.cgiGet( edtMAlqIp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14812MAlqIp", A14812MAlqIp);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMAlqReg_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MALQREG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAlqReg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14813MAlqReg = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14813MAlqReg", localUtil.ttoc( A14813MAlqReg, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14813MAlqReg = localUtil.ctot( httpContext.cgiGet( edtMAlqReg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14813MAlqReg", localUtil.ttoc( A14813MAlqReg, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A14814MAlqTkn = httpContext.cgiGet( edtMAlqTkn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14814MAlqTkn", A14814MAlqTkn);
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
            A14788MAlqId = GXutil.lval( httpContext.GetPar( "MAlqId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14788MAlqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14788MAlqId), 10, 0));
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
            initAll1WF1927( ) ;
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
      disableAttributes1WF1927( ) ;
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

   public void resetCaption1WF0( )
   {
   }

   public void zm1WF1927( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14789MAlqEmprCo = T01WF3_A14789MAlqEmprCo[0] ;
            Z14790MAlqMaqCod = T01WF3_A14790MAlqMaqCod[0] ;
            Z14791MAlqMaqDsc = T01WF3_A14791MAlqMaqDsc[0] ;
            Z14792MAlqFasCod = T01WF3_A14792MAlqFasCod[0] ;
            Z14793MAlqFasDsc = T01WF3_A14793MAlqFasDsc[0] ;
            Z14794MAlqBarCod = T01WF3_A14794MAlqBarCod[0] ;
            Z14795MAlqBarReo = T01WF3_A14795MAlqBarReo[0] ;
            Z14796MAlqBarPar = T01WF3_A14796MAlqBarPar[0] ;
            Z14797MAlqHdr = T01WF3_A14797MAlqHdr[0] ;
            Z14798MAlqHdr2 = T01WF3_A14798MAlqHdr2[0] ;
            Z14799MAlqParCod = T01WF3_A14799MAlqParCod[0] ;
            Z14800MAlqParDsc = T01WF3_A14800MAlqParDsc[0] ;
            Z14801MAlqPLC = T01WF3_A14801MAlqPLC[0] ;
            Z14802MAlqOrd = T01WF3_A14802MAlqOrd[0] ;
            Z14803MAlqLin = T01WF3_A14803MAlqLin[0] ;
            Z14804MAlqFec = T01WF3_A14804MAlqFec[0] ;
            Z14805MAlqVal = T01WF3_A14805MAlqVal[0] ;
            Z14806MAlqValMin = T01WF3_A14806MAlqValMin[0] ;
            Z14807MAlqValMax = T01WF3_A14807MAlqValMax[0] ;
            Z14808MAlqEr = T01WF3_A14808MAlqEr[0] ;
            Z14809MAlqFecEv = T01WF3_A14809MAlqFecEv[0] ;
            Z14810MAlqParId = T01WF3_A14810MAlqParId[0] ;
            Z14811MAlqUsu = T01WF3_A14811MAlqUsu[0] ;
            Z14812MAlqIp = T01WF3_A14812MAlqIp[0] ;
            Z14813MAlqReg = T01WF3_A14813MAlqReg[0] ;
            Z14814MAlqTkn = T01WF3_A14814MAlqTkn[0] ;
         }
         else
         {
            Z14789MAlqEmprCo = A14789MAlqEmprCo ;
            Z14790MAlqMaqCod = A14790MAlqMaqCod ;
            Z14791MAlqMaqDsc = A14791MAlqMaqDsc ;
            Z14792MAlqFasCod = A14792MAlqFasCod ;
            Z14793MAlqFasDsc = A14793MAlqFasDsc ;
            Z14794MAlqBarCod = A14794MAlqBarCod ;
            Z14795MAlqBarReo = A14795MAlqBarReo ;
            Z14796MAlqBarPar = A14796MAlqBarPar ;
            Z14797MAlqHdr = A14797MAlqHdr ;
            Z14798MAlqHdr2 = A14798MAlqHdr2 ;
            Z14799MAlqParCod = A14799MAlqParCod ;
            Z14800MAlqParDsc = A14800MAlqParDsc ;
            Z14801MAlqPLC = A14801MAlqPLC ;
            Z14802MAlqOrd = A14802MAlqOrd ;
            Z14803MAlqLin = A14803MAlqLin ;
            Z14804MAlqFec = A14804MAlqFec ;
            Z14805MAlqVal = A14805MAlqVal ;
            Z14806MAlqValMin = A14806MAlqValMin ;
            Z14807MAlqValMax = A14807MAlqValMax ;
            Z14808MAlqEr = A14808MAlqEr ;
            Z14809MAlqFecEv = A14809MAlqFecEv ;
            Z14810MAlqParId = A14810MAlqParId ;
            Z14811MAlqUsu = A14811MAlqUsu ;
            Z14812MAlqIp = A14812MAlqIp ;
            Z14813MAlqReg = A14813MAlqReg ;
            Z14814MAlqTkn = A14814MAlqTkn ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z14788MAlqId = A14788MAlqId ;
         Z14789MAlqEmprCo = A14789MAlqEmprCo ;
         Z14790MAlqMaqCod = A14790MAlqMaqCod ;
         Z14791MAlqMaqDsc = A14791MAlqMaqDsc ;
         Z14792MAlqFasCod = A14792MAlqFasCod ;
         Z14793MAlqFasDsc = A14793MAlqFasDsc ;
         Z14794MAlqBarCod = A14794MAlqBarCod ;
         Z14795MAlqBarReo = A14795MAlqBarReo ;
         Z14796MAlqBarPar = A14796MAlqBarPar ;
         Z14797MAlqHdr = A14797MAlqHdr ;
         Z14798MAlqHdr2 = A14798MAlqHdr2 ;
         Z14799MAlqParCod = A14799MAlqParCod ;
         Z14800MAlqParDsc = A14800MAlqParDsc ;
         Z14801MAlqPLC = A14801MAlqPLC ;
         Z14802MAlqOrd = A14802MAlqOrd ;
         Z14803MAlqLin = A14803MAlqLin ;
         Z14804MAlqFec = A14804MAlqFec ;
         Z14805MAlqVal = A14805MAlqVal ;
         Z14806MAlqValMin = A14806MAlqValMin ;
         Z14807MAlqValMax = A14807MAlqValMax ;
         Z14808MAlqEr = A14808MAlqEr ;
         Z14809MAlqFecEv = A14809MAlqFecEv ;
         Z14810MAlqParId = A14810MAlqParId ;
         Z14811MAlqUsu = A14811MAlqUsu ;
         Z14812MAlqIp = A14812MAlqIp ;
         Z14813MAlqReg = A14813MAlqReg ;
         Z14814MAlqTkn = A14814MAlqTkn ;
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

   public void load1WF1927( )
   {
      /* Using cursor T01WF4 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14788MAlqId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1927 = (short)(1) ;
         A14789MAlqEmprCo = T01WF4_A14789MAlqEmprCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14789MAlqEmprCo", A14789MAlqEmprCo);
         A14790MAlqMaqCod = T01WF4_A14790MAlqMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14790MAlqMaqCod", A14790MAlqMaqCod);
         A14791MAlqMaqDsc = T01WF4_A14791MAlqMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14791MAlqMaqDsc", A14791MAlqMaqDsc);
         A14792MAlqFasCod = T01WF4_A14792MAlqFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14792MAlqFasCod", A14792MAlqFasCod);
         A14793MAlqFasDsc = T01WF4_A14793MAlqFasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14793MAlqFasDsc", A14793MAlqFasDsc);
         A14794MAlqBarCod = T01WF4_A14794MAlqBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14794MAlqBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14794MAlqBarCod), 8, 0));
         A14795MAlqBarReo = T01WF4_A14795MAlqBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14795MAlqBarReo", GXutil.str( A14795MAlqBarReo, 1, 0));
         A14796MAlqBarPar = T01WF4_A14796MAlqBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14796MAlqBarPar", A14796MAlqBarPar);
         A14797MAlqHdr = T01WF4_A14797MAlqHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14797MAlqHdr", A14797MAlqHdr);
         A14798MAlqHdr2 = T01WF4_A14798MAlqHdr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14798MAlqHdr2", A14798MAlqHdr2);
         A14799MAlqParCod = T01WF4_A14799MAlqParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14799MAlqParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14799MAlqParCod), 4, 0));
         A14800MAlqParDsc = T01WF4_A14800MAlqParDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14800MAlqParDsc", A14800MAlqParDsc);
         A14801MAlqPLC = T01WF4_A14801MAlqPLC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14801MAlqPLC", A14801MAlqPLC);
         A14802MAlqOrd = T01WF4_A14802MAlqOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14802MAlqOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14802MAlqOrd), 4, 0));
         A14803MAlqLin = T01WF4_A14803MAlqLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14803MAlqLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14803MAlqLin), 12, 0));
         A14804MAlqFec = T01WF4_A14804MAlqFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14804MAlqFec", localUtil.ttoc( A14804MAlqFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14805MAlqVal = T01WF4_A14805MAlqVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14805MAlqVal", A14805MAlqVal);
         A14806MAlqValMin = T01WF4_A14806MAlqValMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14806MAlqValMin", A14806MAlqValMin);
         A14807MAlqValMax = T01WF4_A14807MAlqValMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14807MAlqValMax", A14807MAlqValMax);
         A14808MAlqEr = T01WF4_A14808MAlqEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14808MAlqEr", A14808MAlqEr);
         A14809MAlqFecEv = T01WF4_A14809MAlqFecEv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14809MAlqFecEv", localUtil.ttoc( A14809MAlqFecEv, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14810MAlqParId = T01WF4_A14810MAlqParId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14810MAlqParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14810MAlqParId), 10, 0));
         A14811MAlqUsu = T01WF4_A14811MAlqUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14811MAlqUsu", A14811MAlqUsu);
         A14812MAlqIp = T01WF4_A14812MAlqIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14812MAlqIp", A14812MAlqIp);
         A14813MAlqReg = T01WF4_A14813MAlqReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14813MAlqReg", localUtil.ttoc( A14813MAlqReg, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14814MAlqTkn = T01WF4_A14814MAlqTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14814MAlqTkn", A14814MAlqTkn);
         zm1WF1927( -1) ;
      }
      pr_default.close(2);
      onLoadActions1WF1927( ) ;
   }

   public void onLoadActions1WF1927( )
   {
   }

   public void checkExtendedTable1WF1927( )
   {
      nIsDirty_1927 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1WF1927( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1WF1927( )
   {
      /* Using cursor T01WF5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14788MAlqId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1927 = (short)(1) ;
      }
      else
      {
         RcdFound1927 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01WF3 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14788MAlqId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1WF1927( 1) ;
         RcdFound1927 = (short)(1) ;
         A14788MAlqId = T01WF3_A14788MAlqId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14788MAlqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14788MAlqId), 10, 0));
         A14789MAlqEmprCo = T01WF3_A14789MAlqEmprCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14789MAlqEmprCo", A14789MAlqEmprCo);
         A14790MAlqMaqCod = T01WF3_A14790MAlqMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14790MAlqMaqCod", A14790MAlqMaqCod);
         A14791MAlqMaqDsc = T01WF3_A14791MAlqMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14791MAlqMaqDsc", A14791MAlqMaqDsc);
         A14792MAlqFasCod = T01WF3_A14792MAlqFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14792MAlqFasCod", A14792MAlqFasCod);
         A14793MAlqFasDsc = T01WF3_A14793MAlqFasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14793MAlqFasDsc", A14793MAlqFasDsc);
         A14794MAlqBarCod = T01WF3_A14794MAlqBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14794MAlqBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14794MAlqBarCod), 8, 0));
         A14795MAlqBarReo = T01WF3_A14795MAlqBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14795MAlqBarReo", GXutil.str( A14795MAlqBarReo, 1, 0));
         A14796MAlqBarPar = T01WF3_A14796MAlqBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14796MAlqBarPar", A14796MAlqBarPar);
         A14797MAlqHdr = T01WF3_A14797MAlqHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14797MAlqHdr", A14797MAlqHdr);
         A14798MAlqHdr2 = T01WF3_A14798MAlqHdr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14798MAlqHdr2", A14798MAlqHdr2);
         A14799MAlqParCod = T01WF3_A14799MAlqParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14799MAlqParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14799MAlqParCod), 4, 0));
         A14800MAlqParDsc = T01WF3_A14800MAlqParDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14800MAlqParDsc", A14800MAlqParDsc);
         A14801MAlqPLC = T01WF3_A14801MAlqPLC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14801MAlqPLC", A14801MAlqPLC);
         A14802MAlqOrd = T01WF3_A14802MAlqOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14802MAlqOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14802MAlqOrd), 4, 0));
         A14803MAlqLin = T01WF3_A14803MAlqLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14803MAlqLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14803MAlqLin), 12, 0));
         A14804MAlqFec = T01WF3_A14804MAlqFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14804MAlqFec", localUtil.ttoc( A14804MAlqFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14805MAlqVal = T01WF3_A14805MAlqVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14805MAlqVal", A14805MAlqVal);
         A14806MAlqValMin = T01WF3_A14806MAlqValMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14806MAlqValMin", A14806MAlqValMin);
         A14807MAlqValMax = T01WF3_A14807MAlqValMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14807MAlqValMax", A14807MAlqValMax);
         A14808MAlqEr = T01WF3_A14808MAlqEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14808MAlqEr", A14808MAlqEr);
         A14809MAlqFecEv = T01WF3_A14809MAlqFecEv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14809MAlqFecEv", localUtil.ttoc( A14809MAlqFecEv, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14810MAlqParId = T01WF3_A14810MAlqParId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14810MAlqParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14810MAlqParId), 10, 0));
         A14811MAlqUsu = T01WF3_A14811MAlqUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14811MAlqUsu", A14811MAlqUsu);
         A14812MAlqIp = T01WF3_A14812MAlqIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14812MAlqIp", A14812MAlqIp);
         A14813MAlqReg = T01WF3_A14813MAlqReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14813MAlqReg", localUtil.ttoc( A14813MAlqReg, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14814MAlqTkn = T01WF3_A14814MAlqTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14814MAlqTkn", A14814MAlqTkn);
         Z14788MAlqId = A14788MAlqId ;
         sMode1927 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1WF1927( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1927 = (short)(0) ;
            initializeNonKey1WF1927( ) ;
         }
         Gx_mode = sMode1927 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1927 = (short)(0) ;
         initializeNonKey1WF1927( ) ;
         sMode1927 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1927 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1WF1927( ) ;
      if ( RcdFound1927 == 0 )
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
      RcdFound1927 = (short)(0) ;
      /* Using cursor T01WF6 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14788MAlqId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01WF6_A14788MAlqId[0] < A14788MAlqId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01WF6_A14788MAlqId[0] > A14788MAlqId ) ) )
         {
            A14788MAlqId = T01WF6_A14788MAlqId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14788MAlqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14788MAlqId), 10, 0));
            RcdFound1927 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1927 = (short)(0) ;
      /* Using cursor T01WF7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14788MAlqId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01WF7_A14788MAlqId[0] > A14788MAlqId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01WF7_A14788MAlqId[0] < A14788MAlqId ) ) )
         {
            A14788MAlqId = T01WF7_A14788MAlqId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14788MAlqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14788MAlqId), 10, 0));
            RcdFound1927 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1WF1927( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMAlqId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1WF1927( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1927 == 1 )
         {
            if ( A14788MAlqId != Z14788MAlqId )
            {
               A14788MAlqId = Z14788MAlqId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14788MAlqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14788MAlqId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MALQID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMAlqId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMAlqId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1WF1927( ) ;
               GX_FocusControl = edtMAlqId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14788MAlqId != Z14788MAlqId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMAlqId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1WF1927( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MALQID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMAlqId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtMAlqId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1WF1927( ) ;
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
      if ( A14788MAlqId != Z14788MAlqId )
      {
         A14788MAlqId = Z14788MAlqId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14788MAlqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14788MAlqId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MALQID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMAlqId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMAlqId_Internalname ;
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
      if ( RcdFound1927 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "MALQID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMAlqId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMAlqEmprCo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1WF1927( ) ;
      if ( RcdFound1927 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMAlqEmprCo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1WF1927( ) ;
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
      if ( RcdFound1927 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMAlqEmprCo_Internalname ;
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
      if ( RcdFound1927 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMAlqEmprCo_Internalname ;
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
      scanStart1WF1927( ) ;
      if ( RcdFound1927 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1927 != 0 )
         {
            scanNext1WF1927( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMAlqEmprCo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1WF1927( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1WF1927( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01WF2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14788MAlqId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAlq"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14789MAlqEmprCo, T01WF2_A14789MAlqEmprCo[0]) != 0 ) || ( GXutil.strcmp(Z14790MAlqMaqCod, T01WF2_A14790MAlqMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z14791MAlqMaqDsc, T01WF2_A14791MAlqMaqDsc[0]) != 0 ) || ( GXutil.strcmp(Z14792MAlqFasCod, T01WF2_A14792MAlqFasCod[0]) != 0 ) || ( GXutil.strcmp(Z14793MAlqFasDsc, T01WF2_A14793MAlqFasDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14794MAlqBarCod != T01WF2_A14794MAlqBarCod[0] ) || ( Z14795MAlqBarReo != T01WF2_A14795MAlqBarReo[0] ) || ( GXutil.strcmp(Z14796MAlqBarPar, T01WF2_A14796MAlqBarPar[0]) != 0 ) || ( GXutil.strcmp(Z14797MAlqHdr, T01WF2_A14797MAlqHdr[0]) != 0 ) || ( GXutil.strcmp(Z14798MAlqHdr2, T01WF2_A14798MAlqHdr2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14799MAlqParCod != T01WF2_A14799MAlqParCod[0] ) || ( GXutil.strcmp(Z14800MAlqParDsc, T01WF2_A14800MAlqParDsc[0]) != 0 ) || ( GXutil.strcmp(Z14801MAlqPLC, T01WF2_A14801MAlqPLC[0]) != 0 ) || ( Z14802MAlqOrd != T01WF2_A14802MAlqOrd[0] ) || ( Z14803MAlqLin != T01WF2_A14803MAlqLin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z14804MAlqFec, T01WF2_A14804MAlqFec[0]) ) || ( GXutil.strcmp(Z14805MAlqVal, T01WF2_A14805MAlqVal[0]) != 0 ) || ( GXutil.strcmp(Z14806MAlqValMin, T01WF2_A14806MAlqValMin[0]) != 0 ) || ( GXutil.strcmp(Z14807MAlqValMax, T01WF2_A14807MAlqValMax[0]) != 0 ) || ( Z14808MAlqEr != T01WF2_A14808MAlqEr[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z14809MAlqFecEv, T01WF2_A14809MAlqFecEv[0]) ) || ( Z14810MAlqParId != T01WF2_A14810MAlqParId[0] ) || ( GXutil.strcmp(Z14811MAlqUsu, T01WF2_A14811MAlqUsu[0]) != 0 ) || ( GXutil.strcmp(Z14812MAlqIp, T01WF2_A14812MAlqIp[0]) != 0 ) || !( GXutil.dateCompare(Z14813MAlqReg, T01WF2_A14813MAlqReg[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14814MAlqTkn, T01WF2_A14814MAlqTkn[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z14789MAlqEmprCo, T01WF2_A14789MAlqEmprCo[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqEmprCo");
               GXutil.writeLogRaw("Old: ",Z14789MAlqEmprCo);
               GXutil.writeLogRaw("Current: ",T01WF2_A14789MAlqEmprCo[0]);
            }
            if ( GXutil.strcmp(Z14790MAlqMaqCod, T01WF2_A14790MAlqMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqMaqCod");
               GXutil.writeLogRaw("Old: ",Z14790MAlqMaqCod);
               GXutil.writeLogRaw("Current: ",T01WF2_A14790MAlqMaqCod[0]);
            }
            if ( GXutil.strcmp(Z14791MAlqMaqDsc, T01WF2_A14791MAlqMaqDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqMaqDsc");
               GXutil.writeLogRaw("Old: ",Z14791MAlqMaqDsc);
               GXutil.writeLogRaw("Current: ",T01WF2_A14791MAlqMaqDsc[0]);
            }
            if ( GXutil.strcmp(Z14792MAlqFasCod, T01WF2_A14792MAlqFasCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqFasCod");
               GXutil.writeLogRaw("Old: ",Z14792MAlqFasCod);
               GXutil.writeLogRaw("Current: ",T01WF2_A14792MAlqFasCod[0]);
            }
            if ( GXutil.strcmp(Z14793MAlqFasDsc, T01WF2_A14793MAlqFasDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqFasDsc");
               GXutil.writeLogRaw("Old: ",Z14793MAlqFasDsc);
               GXutil.writeLogRaw("Current: ",T01WF2_A14793MAlqFasDsc[0]);
            }
            if ( Z14794MAlqBarCod != T01WF2_A14794MAlqBarCod[0] )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqBarCod");
               GXutil.writeLogRaw("Old: ",Z14794MAlqBarCod);
               GXutil.writeLogRaw("Current: ",T01WF2_A14794MAlqBarCod[0]);
            }
            if ( Z14795MAlqBarReo != T01WF2_A14795MAlqBarReo[0] )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqBarReo");
               GXutil.writeLogRaw("Old: ",Z14795MAlqBarReo);
               GXutil.writeLogRaw("Current: ",T01WF2_A14795MAlqBarReo[0]);
            }
            if ( GXutil.strcmp(Z14796MAlqBarPar, T01WF2_A14796MAlqBarPar[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqBarPar");
               GXutil.writeLogRaw("Old: ",Z14796MAlqBarPar);
               GXutil.writeLogRaw("Current: ",T01WF2_A14796MAlqBarPar[0]);
            }
            if ( GXutil.strcmp(Z14797MAlqHdr, T01WF2_A14797MAlqHdr[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqHdr");
               GXutil.writeLogRaw("Old: ",Z14797MAlqHdr);
               GXutil.writeLogRaw("Current: ",T01WF2_A14797MAlqHdr[0]);
            }
            if ( GXutil.strcmp(Z14798MAlqHdr2, T01WF2_A14798MAlqHdr2[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqHdr2");
               GXutil.writeLogRaw("Old: ",Z14798MAlqHdr2);
               GXutil.writeLogRaw("Current: ",T01WF2_A14798MAlqHdr2[0]);
            }
            if ( Z14799MAlqParCod != T01WF2_A14799MAlqParCod[0] )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqParCod");
               GXutil.writeLogRaw("Old: ",Z14799MAlqParCod);
               GXutil.writeLogRaw("Current: ",T01WF2_A14799MAlqParCod[0]);
            }
            if ( GXutil.strcmp(Z14800MAlqParDsc, T01WF2_A14800MAlqParDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqParDsc");
               GXutil.writeLogRaw("Old: ",Z14800MAlqParDsc);
               GXutil.writeLogRaw("Current: ",T01WF2_A14800MAlqParDsc[0]);
            }
            if ( GXutil.strcmp(Z14801MAlqPLC, T01WF2_A14801MAlqPLC[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqPLC");
               GXutil.writeLogRaw("Old: ",Z14801MAlqPLC);
               GXutil.writeLogRaw("Current: ",T01WF2_A14801MAlqPLC[0]);
            }
            if ( Z14802MAlqOrd != T01WF2_A14802MAlqOrd[0] )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqOrd");
               GXutil.writeLogRaw("Old: ",Z14802MAlqOrd);
               GXutil.writeLogRaw("Current: ",T01WF2_A14802MAlqOrd[0]);
            }
            if ( Z14803MAlqLin != T01WF2_A14803MAlqLin[0] )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqLin");
               GXutil.writeLogRaw("Old: ",Z14803MAlqLin);
               GXutil.writeLogRaw("Current: ",T01WF2_A14803MAlqLin[0]);
            }
            if ( !( GXutil.dateCompare(Z14804MAlqFec, T01WF2_A14804MAlqFec[0]) ) )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqFec");
               GXutil.writeLogRaw("Old: ",Z14804MAlqFec);
               GXutil.writeLogRaw("Current: ",T01WF2_A14804MAlqFec[0]);
            }
            if ( GXutil.strcmp(Z14805MAlqVal, T01WF2_A14805MAlqVal[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqVal");
               GXutil.writeLogRaw("Old: ",Z14805MAlqVal);
               GXutil.writeLogRaw("Current: ",T01WF2_A14805MAlqVal[0]);
            }
            if ( GXutil.strcmp(Z14806MAlqValMin, T01WF2_A14806MAlqValMin[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqValMin");
               GXutil.writeLogRaw("Old: ",Z14806MAlqValMin);
               GXutil.writeLogRaw("Current: ",T01WF2_A14806MAlqValMin[0]);
            }
            if ( GXutil.strcmp(Z14807MAlqValMax, T01WF2_A14807MAlqValMax[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqValMax");
               GXutil.writeLogRaw("Old: ",Z14807MAlqValMax);
               GXutil.writeLogRaw("Current: ",T01WF2_A14807MAlqValMax[0]);
            }
            if ( Z14808MAlqEr != T01WF2_A14808MAlqEr[0] )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqEr");
               GXutil.writeLogRaw("Old: ",Z14808MAlqEr);
               GXutil.writeLogRaw("Current: ",T01WF2_A14808MAlqEr[0]);
            }
            if ( !( GXutil.dateCompare(Z14809MAlqFecEv, T01WF2_A14809MAlqFecEv[0]) ) )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqFecEv");
               GXutil.writeLogRaw("Old: ",Z14809MAlqFecEv);
               GXutil.writeLogRaw("Current: ",T01WF2_A14809MAlqFecEv[0]);
            }
            if ( Z14810MAlqParId != T01WF2_A14810MAlqParId[0] )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqParId");
               GXutil.writeLogRaw("Old: ",Z14810MAlqParId);
               GXutil.writeLogRaw("Current: ",T01WF2_A14810MAlqParId[0]);
            }
            if ( GXutil.strcmp(Z14811MAlqUsu, T01WF2_A14811MAlqUsu[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqUsu");
               GXutil.writeLogRaw("Old: ",Z14811MAlqUsu);
               GXutil.writeLogRaw("Current: ",T01WF2_A14811MAlqUsu[0]);
            }
            if ( GXutil.strcmp(Z14812MAlqIp, T01WF2_A14812MAlqIp[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqIp");
               GXutil.writeLogRaw("Old: ",Z14812MAlqIp);
               GXutil.writeLogRaw("Current: ",T01WF2_A14812MAlqIp[0]);
            }
            if ( !( GXutil.dateCompare(Z14813MAlqReg, T01WF2_A14813MAlqReg[0]) ) )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqReg");
               GXutil.writeLogRaw("Old: ",Z14813MAlqReg);
               GXutil.writeLogRaw("Current: ",T01WF2_A14813MAlqReg[0]);
            }
            if ( GXutil.strcmp(Z14814MAlqTkn, T01WF2_A14814MAlqTkn[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.malq:[seudo value changed for attri]"+"MAlqTkn");
               GXutil.writeLogRaw("Old: ",Z14814MAlqTkn);
               GXutil.writeLogRaw("Current: ",T01WF2_A14814MAlqTkn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"MAlq"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1WF1927( )
   {
      beforeValidate1WF1927( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1WF1927( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1WF1927( 0) ;
         checkOptimisticConcurrency1WF1927( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1WF1927( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1WF1927( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01WF8 */
                  pr_default.execute(6, new Object[] {A14789MAlqEmprCo, A14790MAlqMaqCod, A14791MAlqMaqDsc, A14792MAlqFasCod, A14793MAlqFasDsc, Integer.valueOf(A14794MAlqBarCod), Byte.valueOf(A14795MAlqBarReo), A14796MAlqBarPar, A14797MAlqHdr, A14798MAlqHdr2, Short.valueOf(A14799MAlqParCod), A14800MAlqParDsc, A14801MAlqPLC, Short.valueOf(A14802MAlqOrd), Long.valueOf(A14803MAlqLin), A14804MAlqFec, A14805MAlqVal, A14806MAlqValMin, A14807MAlqValMax, Boolean.valueOf(A14808MAlqEr), A14809MAlqFecEv, Long.valueOf(A14810MAlqParId), A14811MAlqUsu, A14812MAlqIp, A14813MAlqReg, A14814MAlqTkn});
                  /* Retrieving last key number assigned */
                  /* Using cursor T01WF9 */
                  pr_default.execute(7);
                  A14788MAlqId = T01WF9_A14788MAlqId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14788MAlqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14788MAlqId), 10, 0));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAlq");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1WF0( ) ;
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
            load1WF1927( ) ;
         }
         endLevel1WF1927( ) ;
      }
      closeExtendedTableCursors1WF1927( ) ;
   }

   public void update1WF1927( )
   {
      beforeValidate1WF1927( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1WF1927( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1WF1927( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1WF1927( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1WF1927( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01WF10 */
                  pr_default.execute(8, new Object[] {A14789MAlqEmprCo, A14790MAlqMaqCod, A14791MAlqMaqDsc, A14792MAlqFasCod, A14793MAlqFasDsc, Integer.valueOf(A14794MAlqBarCod), Byte.valueOf(A14795MAlqBarReo), A14796MAlqBarPar, A14797MAlqHdr, A14798MAlqHdr2, Short.valueOf(A14799MAlqParCod), A14800MAlqParDsc, A14801MAlqPLC, Short.valueOf(A14802MAlqOrd), Long.valueOf(A14803MAlqLin), A14804MAlqFec, A14805MAlqVal, A14806MAlqValMin, A14807MAlqValMax, Boolean.valueOf(A14808MAlqEr), A14809MAlqFecEv, Long.valueOf(A14810MAlqParId), A14811MAlqUsu, A14812MAlqIp, A14813MAlqReg, A14814MAlqTkn, Long.valueOf(A14788MAlqId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAlq");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAlq"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1WF1927( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1WF0( ) ;
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
         endLevel1WF1927( ) ;
      }
      closeExtendedTableCursors1WF1927( ) ;
   }

   public void deferredUpdate1WF1927( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1WF1927( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1WF1927( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1WF1927( ) ;
         afterConfirm1WF1927( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1WF1927( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01WF11 */
               pr_default.execute(9, new Object[] {Long.valueOf(A14788MAlqId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("MAlq");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1927 == 0 )
                     {
                        initAll1WF1927( ) ;
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
                     resetCaption1WF0( ) ;
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
      sMode1927 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1WF1927( ) ;
      Gx_mode = sMode1927 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1WF1927( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1WF1927( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1WF1927( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.malq");
         if ( AnyError == 0 )
         {
            confirmValues1WF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ingenieria.malq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1WF1927( )
   {
      /* Using cursor T01WF12 */
      pr_default.execute(10);
      RcdFound1927 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1927 = (short)(1) ;
         A14788MAlqId = T01WF12_A14788MAlqId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14788MAlqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14788MAlqId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1WF1927( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1927 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1927 = (short)(1) ;
         A14788MAlqId = T01WF12_A14788MAlqId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14788MAlqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14788MAlqId), 10, 0));
      }
   }

   public void scanEnd1WF1927( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1WF1927( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1WF1927( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1WF1927( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1WF1927( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1WF1927( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1WF1927( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1WF1927( )
   {
      edtMAlqId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqId_Enabled), 5, 0), true);
      edtMAlqEmprCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqEmprCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqEmprCo_Enabled), 5, 0), true);
      edtMAlqMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqMaqCod_Enabled), 5, 0), true);
      edtMAlqMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqMaqDsc_Enabled), 5, 0), true);
      edtMAlqFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqFasCod_Enabled), 5, 0), true);
      edtMAlqFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqFasDsc_Enabled), 5, 0), true);
      edtMAlqBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqBarCod_Enabled), 5, 0), true);
      edtMAlqBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqBarReo_Enabled), 5, 0), true);
      edtMAlqBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqBarPar_Enabled), 5, 0), true);
      edtMAlqHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqHdr_Enabled), 5, 0), true);
      edtMAlqHdr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqHdr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqHdr2_Enabled), 5, 0), true);
      edtMAlqParCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqParCod_Enabled), 5, 0), true);
      edtMAlqParDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqParDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqParDsc_Enabled), 5, 0), true);
      edtMAlqPLC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqPLC_Enabled), 5, 0), true);
      edtMAlqOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqOrd_Enabled), 5, 0), true);
      edtMAlqLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqLin_Enabled), 5, 0), true);
      edtMAlqFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqFec_Enabled), 5, 0), true);
      edtMAlqVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqVal_Enabled), 5, 0), true);
      edtMAlqValMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqValMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqValMin_Enabled), 5, 0), true);
      edtMAlqValMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqValMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqValMax_Enabled), 5, 0), true);
      chkMAlqEr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkMAlqEr.getInternalname(), "Enabled", GXutil.ltrimstr( chkMAlqEr.getEnabled(), 5, 0), true);
      edtMAlqFecEv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqFecEv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqFecEv_Enabled), 5, 0), true);
      edtMAlqParId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqParId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqParId_Enabled), 5, 0), true);
      edtMAlqUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqUsu_Enabled), 5, 0), true);
      edtMAlqIp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqIp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqIp_Enabled), 5, 0), true);
      edtMAlqReg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqReg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqReg_Enabled), 5, 0), true);
      edtMAlqTkn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlqTkn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlqTkn_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1WF1927( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1WF0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.malq", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14788MAlqId", GXutil.ltrim( localUtil.ntoc( Z14788MAlqId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14789MAlqEmprCo", GXutil.rtrim( Z14789MAlqEmprCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14790MAlqMaqCod", GXutil.rtrim( Z14790MAlqMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14791MAlqMaqDsc", Z14791MAlqMaqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14792MAlqFasCod", GXutil.rtrim( Z14792MAlqFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14793MAlqFasDsc", Z14793MAlqFasDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14794MAlqBarCod", GXutil.ltrim( localUtil.ntoc( Z14794MAlqBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14795MAlqBarReo", GXutil.ltrim( localUtil.ntoc( Z14795MAlqBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14796MAlqBarPar", GXutil.rtrim( Z14796MAlqBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14797MAlqHdr", GXutil.rtrim( Z14797MAlqHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14798MAlqHdr2", Z14798MAlqHdr2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14799MAlqParCod", GXutil.ltrim( localUtil.ntoc( Z14799MAlqParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14800MAlqParDsc", Z14800MAlqParDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14801MAlqPLC", Z14801MAlqPLC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14802MAlqOrd", GXutil.ltrim( localUtil.ntoc( Z14802MAlqOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14803MAlqLin", GXutil.ltrim( localUtil.ntoc( Z14803MAlqLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14804MAlqFec", localUtil.ttoc( Z14804MAlqFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14805MAlqVal", GXutil.rtrim( Z14805MAlqVal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14806MAlqValMin", GXutil.rtrim( Z14806MAlqValMin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14807MAlqValMax", GXutil.rtrim( Z14807MAlqValMax));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "Z14808MAlqEr", Z14808MAlqEr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14809MAlqFecEv", localUtil.ttoc( Z14809MAlqFecEv, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14810MAlqParId", GXutil.ltrim( localUtil.ntoc( Z14810MAlqParId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14811MAlqUsu", GXutil.rtrim( Z14811MAlqUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14812MAlqIp", Z14812MAlqIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14813MAlqReg", localUtil.ttoc( Z14813MAlqReg, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14814MAlqTkn", Z14814MAlqTkn);
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
      return formatLink("app.ingenieria.malq", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.MAlq" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "M Alerta Maquinas Ingenieria", "") ;
   }

   public void initializeNonKey1WF1927( )
   {
      A14789MAlqEmprCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14789MAlqEmprCo", A14789MAlqEmprCo);
      A14790MAlqMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14790MAlqMaqCod", A14790MAlqMaqCod);
      A14791MAlqMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14791MAlqMaqDsc", A14791MAlqMaqDsc);
      A14792MAlqFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14792MAlqFasCod", A14792MAlqFasCod);
      A14793MAlqFasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14793MAlqFasDsc", A14793MAlqFasDsc);
      A14794MAlqBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14794MAlqBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14794MAlqBarCod), 8, 0));
      A14795MAlqBarReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14795MAlqBarReo", GXutil.str( A14795MAlqBarReo, 1, 0));
      A14796MAlqBarPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14796MAlqBarPar", A14796MAlqBarPar);
      A14797MAlqHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14797MAlqHdr", A14797MAlqHdr);
      A14798MAlqHdr2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14798MAlqHdr2", A14798MAlqHdr2);
      A14799MAlqParCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14799MAlqParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14799MAlqParCod), 4, 0));
      A14800MAlqParDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14800MAlqParDsc", A14800MAlqParDsc);
      A14801MAlqPLC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14801MAlqPLC", A14801MAlqPLC);
      A14802MAlqOrd = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14802MAlqOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14802MAlqOrd), 4, 0));
      A14803MAlqLin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14803MAlqLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14803MAlqLin), 12, 0));
      A14804MAlqFec = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14804MAlqFec", localUtil.ttoc( A14804MAlqFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14805MAlqVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14805MAlqVal", A14805MAlqVal);
      A14806MAlqValMin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14806MAlqValMin", A14806MAlqValMin);
      A14807MAlqValMax = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14807MAlqValMax", A14807MAlqValMax);
      A14808MAlqEr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14808MAlqEr", A14808MAlqEr);
      A14809MAlqFecEv = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14809MAlqFecEv", localUtil.ttoc( A14809MAlqFecEv, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14810MAlqParId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14810MAlqParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14810MAlqParId), 10, 0));
      A14811MAlqUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14811MAlqUsu", A14811MAlqUsu);
      A14812MAlqIp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14812MAlqIp", A14812MAlqIp);
      A14813MAlqReg = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14813MAlqReg", localUtil.ttoc( A14813MAlqReg, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14814MAlqTkn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14814MAlqTkn", A14814MAlqTkn);
      Z14789MAlqEmprCo = "" ;
      Z14790MAlqMaqCod = "" ;
      Z14791MAlqMaqDsc = "" ;
      Z14792MAlqFasCod = "" ;
      Z14793MAlqFasDsc = "" ;
      Z14794MAlqBarCod = 0 ;
      Z14795MAlqBarReo = (byte)(0) ;
      Z14796MAlqBarPar = "" ;
      Z14797MAlqHdr = "" ;
      Z14798MAlqHdr2 = "" ;
      Z14799MAlqParCod = (short)(0) ;
      Z14800MAlqParDsc = "" ;
      Z14801MAlqPLC = "" ;
      Z14802MAlqOrd = (short)(0) ;
      Z14803MAlqLin = 0 ;
      Z14804MAlqFec = GXutil.resetTime( GXutil.nullDate() );
      Z14805MAlqVal = "" ;
      Z14806MAlqValMin = "" ;
      Z14807MAlqValMax = "" ;
      Z14808MAlqEr = false ;
      Z14809MAlqFecEv = GXutil.resetTime( GXutil.nullDate() );
      Z14810MAlqParId = 0 ;
      Z14811MAlqUsu = "" ;
      Z14812MAlqIp = "" ;
      Z14813MAlqReg = GXutil.resetTime( GXutil.nullDate() );
      Z14814MAlqTkn = "" ;
   }

   public void initAll1WF1927( )
   {
      A14788MAlqId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14788MAlqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14788MAlqId), 10, 0));
      initializeNonKey1WF1927( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202672414114362", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/malq.js", "?202672414114362", false, true);
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
      edtMAlqId_Internalname = "MALQID" ;
      edtMAlqEmprCo_Internalname = "MALQEMPRCO" ;
      edtMAlqMaqCod_Internalname = "MALQMAQCOD" ;
      edtMAlqMaqDsc_Internalname = "MALQMAQDSC" ;
      edtMAlqFasCod_Internalname = "MALQFASCOD" ;
      edtMAlqFasDsc_Internalname = "MALQFASDSC" ;
      edtMAlqBarCod_Internalname = "MALQBARCOD" ;
      edtMAlqBarReo_Internalname = "MALQBARREO" ;
      edtMAlqBarPar_Internalname = "MALQBARPAR" ;
      edtMAlqHdr_Internalname = "MALQHDR" ;
      edtMAlqHdr2_Internalname = "MALQHDR2" ;
      edtMAlqParCod_Internalname = "MALQPARCOD" ;
      edtMAlqParDsc_Internalname = "MALQPARDSC" ;
      edtMAlqPLC_Internalname = "MALQPLC" ;
      edtMAlqOrd_Internalname = "MALQORD" ;
      edtMAlqLin_Internalname = "MALQLIN" ;
      edtMAlqFec_Internalname = "MALQFEC" ;
      edtMAlqVal_Internalname = "MALQVAL" ;
      edtMAlqValMin_Internalname = "MALQVALMIN" ;
      edtMAlqValMax_Internalname = "MALQVALMAX" ;
      chkMAlqEr.setInternalname( "MALQER" );
      edtMAlqFecEv_Internalname = "MALQFECEV" ;
      edtMAlqParId_Internalname = "MALQPARID" ;
      edtMAlqUsu_Internalname = "MALQUSU" ;
      edtMAlqIp_Internalname = "MALQIP" ;
      edtMAlqReg_Internalname = "MALQREG" ;
      edtMAlqTkn_Internalname = "MALQTKN" ;
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
      Form.setCaption( httpContext.getMessage( "M Alerta Maquinas Ingenieria", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMAlqTkn_Enabled = 1 ;
      edtMAlqReg_Jsonclick = "" ;
      edtMAlqReg_Enabled = 1 ;
      edtMAlqIp_Jsonclick = "" ;
      edtMAlqIp_Enabled = 1 ;
      edtMAlqUsu_Jsonclick = "" ;
      edtMAlqUsu_Enabled = 1 ;
      edtMAlqParId_Jsonclick = "" ;
      edtMAlqParId_Enabled = 1 ;
      edtMAlqFecEv_Jsonclick = "" ;
      edtMAlqFecEv_Enabled = 1 ;
      chkMAlqEr.setEnabled( 1 );
      edtMAlqValMax_Jsonclick = "" ;
      edtMAlqValMax_Enabled = 1 ;
      edtMAlqValMin_Jsonclick = "" ;
      edtMAlqValMin_Enabled = 1 ;
      edtMAlqVal_Jsonclick = "" ;
      edtMAlqVal_Enabled = 1 ;
      edtMAlqFec_Jsonclick = "" ;
      edtMAlqFec_Enabled = 1 ;
      edtMAlqLin_Jsonclick = "" ;
      edtMAlqLin_Enabled = 1 ;
      edtMAlqOrd_Jsonclick = "" ;
      edtMAlqOrd_Enabled = 1 ;
      edtMAlqPLC_Jsonclick = "" ;
      edtMAlqPLC_Enabled = 1 ;
      edtMAlqParDsc_Jsonclick = "" ;
      edtMAlqParDsc_Enabled = 1 ;
      edtMAlqParCod_Jsonclick = "" ;
      edtMAlqParCod_Enabled = 1 ;
      edtMAlqHdr2_Jsonclick = "" ;
      edtMAlqHdr2_Enabled = 1 ;
      edtMAlqHdr_Jsonclick = "" ;
      edtMAlqHdr_Enabled = 1 ;
      edtMAlqBarPar_Jsonclick = "" ;
      edtMAlqBarPar_Enabled = 1 ;
      edtMAlqBarReo_Jsonclick = "" ;
      edtMAlqBarReo_Enabled = 1 ;
      edtMAlqBarCod_Jsonclick = "" ;
      edtMAlqBarCod_Enabled = 1 ;
      edtMAlqFasDsc_Jsonclick = "" ;
      edtMAlqFasDsc_Enabled = 1 ;
      edtMAlqFasCod_Jsonclick = "" ;
      edtMAlqFasCod_Enabled = 1 ;
      edtMAlqMaqDsc_Jsonclick = "" ;
      edtMAlqMaqDsc_Enabled = 1 ;
      edtMAlqMaqCod_Jsonclick = "" ;
      edtMAlqMaqCod_Enabled = 1 ;
      edtMAlqEmprCo_Jsonclick = "" ;
      edtMAlqEmprCo_Enabled = 1 ;
      edtMAlqId_Jsonclick = "" ;
      edtMAlqId_Enabled = 1 ;
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
      chkMAlqEr.setName( "MALQER" );
      chkMAlqEr.setWebtags( "" );
      chkMAlqEr.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkMAlqEr.getInternalname(), "TitleCaption", chkMAlqEr.getCaption(), true);
      chkMAlqEr.setCheckedValue( "false" );
      A14808MAlqEr = GXutil.strtobool( GXutil.booltostr( A14808MAlqEr)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14808MAlqEr", A14808MAlqEr);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      GX_FocusControl = edtMAlqEmprCo_Internalname ;
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

   public void valid_Malqid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A14808MAlqEr = GXutil.strtobool( GXutil.booltostr( A14808MAlqEr)) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14789MAlqEmprCo", GXutil.rtrim( A14789MAlqEmprCo));
      httpContext.ajax_rsp_assign_attri("", false, "A14790MAlqMaqCod", GXutil.rtrim( A14790MAlqMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14791MAlqMaqDsc", A14791MAlqMaqDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14792MAlqFasCod", GXutil.rtrim( A14792MAlqFasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14793MAlqFasDsc", A14793MAlqFasDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14794MAlqBarCod", GXutil.ltrim( localUtil.ntoc( A14794MAlqBarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14795MAlqBarReo", GXutil.ltrim( localUtil.ntoc( A14795MAlqBarReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14796MAlqBarPar", GXutil.rtrim( A14796MAlqBarPar));
      httpContext.ajax_rsp_assign_attri("", false, "A14797MAlqHdr", GXutil.rtrim( A14797MAlqHdr));
      httpContext.ajax_rsp_assign_attri("", false, "A14798MAlqHdr2", A14798MAlqHdr2);
      httpContext.ajax_rsp_assign_attri("", false, "A14799MAlqParCod", GXutil.ltrim( localUtil.ntoc( A14799MAlqParCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14800MAlqParDsc", A14800MAlqParDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14801MAlqPLC", A14801MAlqPLC);
      httpContext.ajax_rsp_assign_attri("", false, "A14802MAlqOrd", GXutil.ltrim( localUtil.ntoc( A14802MAlqOrd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14803MAlqLin", GXutil.ltrim( localUtil.ntoc( A14803MAlqLin, (byte)(12), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14804MAlqFec", localUtil.ttoc( A14804MAlqFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14805MAlqVal", GXutil.rtrim( A14805MAlqVal));
      httpContext.ajax_rsp_assign_attri("", false, "A14806MAlqValMin", GXutil.rtrim( A14806MAlqValMin));
      httpContext.ajax_rsp_assign_attri("", false, "A14807MAlqValMax", GXutil.rtrim( A14807MAlqValMax));
      httpContext.ajax_rsp_assign_attri("", false, "A14808MAlqEr", A14808MAlqEr);
      httpContext.ajax_rsp_assign_attri("", false, "A14809MAlqFecEv", localUtil.ttoc( A14809MAlqFecEv, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14810MAlqParId", GXutil.ltrim( localUtil.ntoc( A14810MAlqParId, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14811MAlqUsu", GXutil.rtrim( A14811MAlqUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A14812MAlqIp", A14812MAlqIp);
      httpContext.ajax_rsp_assign_attri("", false, "A14813MAlqReg", localUtil.ttoc( A14813MAlqReg, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14814MAlqTkn", A14814MAlqTkn);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14788MAlqId", GXutil.ltrim( localUtil.ntoc( Z14788MAlqId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14789MAlqEmprCo", GXutil.rtrim( Z14789MAlqEmprCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14790MAlqMaqCod", GXutil.rtrim( Z14790MAlqMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14791MAlqMaqDsc", Z14791MAlqMaqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14792MAlqFasCod", GXutil.rtrim( Z14792MAlqFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14793MAlqFasDsc", Z14793MAlqFasDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14794MAlqBarCod", GXutil.ltrim( localUtil.ntoc( Z14794MAlqBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14795MAlqBarReo", GXutil.ltrim( localUtil.ntoc( Z14795MAlqBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14796MAlqBarPar", GXutil.rtrim( Z14796MAlqBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14797MAlqHdr", GXutil.rtrim( Z14797MAlqHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14798MAlqHdr2", Z14798MAlqHdr2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14799MAlqParCod", GXutil.ltrim( localUtil.ntoc( Z14799MAlqParCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14800MAlqParDsc", Z14800MAlqParDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14801MAlqPLC", Z14801MAlqPLC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14802MAlqOrd", GXutil.ltrim( localUtil.ntoc( Z14802MAlqOrd, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14803MAlqLin", GXutil.ltrim( localUtil.ntoc( Z14803MAlqLin, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14804MAlqFec", localUtil.ttoc( Z14804MAlqFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14805MAlqVal", GXutil.rtrim( Z14805MAlqVal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14806MAlqValMin", GXutil.rtrim( Z14806MAlqValMin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14807MAlqValMax", GXutil.rtrim( Z14807MAlqValMax));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14808MAlqEr", GXutil.booltostr( Z14808MAlqEr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14809MAlqFecEv", localUtil.ttoc( Z14809MAlqFecEv, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14810MAlqParId", GXutil.ltrim( localUtil.ntoc( Z14810MAlqParId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14811MAlqUsu", GXutil.rtrim( Z14811MAlqUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14812MAlqIp", Z14812MAlqIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14813MAlqReg", localUtil.ttoc( Z14813MAlqReg, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14814MAlqTkn", Z14814MAlqTkn);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A14808MAlqEr',fld:'MALQER',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A14808MAlqEr',fld:'MALQER',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A14808MAlqEr',fld:'MALQER',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A14808MAlqEr',fld:'MALQER',pic:''}]}");
      setEventMetadata("VALID_MALQID","{handler:'valid_Malqid',iparms:[{av:'A14788MAlqId',fld:'MALQID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A14808MAlqEr',fld:'MALQER',pic:''}]");
      setEventMetadata("VALID_MALQID",",oparms:[{av:'A14789MAlqEmprCo',fld:'MALQEMPRCO',pic:''},{av:'A14790MAlqMaqCod',fld:'MALQMAQCOD',pic:''},{av:'A14791MAlqMaqDsc',fld:'MALQMAQDSC',pic:''},{av:'A14792MAlqFasCod',fld:'MALQFASCOD',pic:''},{av:'A14793MAlqFasDsc',fld:'MALQFASDSC',pic:''},{av:'A14794MAlqBarCod',fld:'MALQBARCOD',pic:'ZZZZZZZ9'},{av:'A14795MAlqBarReo',fld:'MALQBARREO',pic:'9'},{av:'A14796MAlqBarPar',fld:'MALQBARPAR',pic:''},{av:'A14797MAlqHdr',fld:'MALQHDR',pic:''},{av:'A14798MAlqHdr2',fld:'MALQHDR2',pic:''},{av:'A14799MAlqParCod',fld:'MALQPARCOD',pic:'ZZZ9'},{av:'A14800MAlqParDsc',fld:'MALQPARDSC',pic:''},{av:'A14801MAlqPLC',fld:'MALQPLC',pic:''},{av:'A14802MAlqOrd',fld:'MALQORD',pic:'ZZZ9'},{av:'A14803MAlqLin',fld:'MALQLIN',pic:'ZZZZZZZZZZZ9'},{av:'A14804MAlqFec',fld:'MALQFEC',pic:'99/99/99 99:99'},{av:'A14805MAlqVal',fld:'MALQVAL',pic:''},{av:'A14806MAlqValMin',fld:'MALQVALMIN',pic:''},{av:'A14807MAlqValMax',fld:'MALQVALMAX',pic:''},{av:'A14809MAlqFecEv',fld:'MALQFECEV',pic:'99/99/99 99:99'},{av:'A14810MAlqParId',fld:'MALQPARID',pic:'ZZZZZZZZZ9'},{av:'A14811MAlqUsu',fld:'MALQUSU',pic:''},{av:'A14812MAlqIp',fld:'MALQIP',pic:''},{av:'A14813MAlqReg',fld:'MALQREG',pic:'99/99/99 99:99'},{av:'A14814MAlqTkn',fld:'MALQTKN',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14788MAlqId'},{av:'Z14789MAlqEmprCo'},{av:'Z14790MAlqMaqCod'},{av:'Z14791MAlqMaqDsc'},{av:'Z14792MAlqFasCod'},{av:'Z14793MAlqFasDsc'},{av:'Z14794MAlqBarCod'},{av:'Z14795MAlqBarReo'},{av:'Z14796MAlqBarPar'},{av:'Z14797MAlqHdr'},{av:'Z14798MAlqHdr2'},{av:'Z14799MAlqParCod'},{av:'Z14800MAlqParDsc'},{av:'Z14801MAlqPLC'},{av:'Z14802MAlqOrd'},{av:'Z14803MAlqLin'},{av:'Z14804MAlqFec'},{av:'Z14805MAlqVal'},{av:'Z14806MAlqValMin'},{av:'Z14807MAlqValMax'},{av:'Z14808MAlqEr'},{av:'Z14809MAlqFecEv'},{av:'Z14810MAlqParId'},{av:'Z14811MAlqUsu'},{av:'Z14812MAlqIp'},{av:'Z14813MAlqReg'},{av:'Z14814MAlqTkn'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{av:'A14808MAlqEr',fld:'MALQER',pic:''}]}");
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
      Z14789MAlqEmprCo = "" ;
      Z14790MAlqMaqCod = "" ;
      Z14791MAlqMaqDsc = "" ;
      Z14792MAlqFasCod = "" ;
      Z14793MAlqFasDsc = "" ;
      Z14796MAlqBarPar = "" ;
      Z14797MAlqHdr = "" ;
      Z14798MAlqHdr2 = "" ;
      Z14800MAlqParDsc = "" ;
      Z14801MAlqPLC = "" ;
      Z14804MAlqFec = GXutil.resetTime( GXutil.nullDate() );
      Z14805MAlqVal = "" ;
      Z14806MAlqValMin = "" ;
      Z14807MAlqValMax = "" ;
      Z14809MAlqFecEv = GXutil.resetTime( GXutil.nullDate() );
      Z14811MAlqUsu = "" ;
      Z14812MAlqIp = "" ;
      Z14813MAlqReg = GXutil.resetTime( GXutil.nullDate() );
      Z14814MAlqTkn = "" ;
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
      A14789MAlqEmprCo = "" ;
      A14790MAlqMaqCod = "" ;
      A14791MAlqMaqDsc = "" ;
      A14792MAlqFasCod = "" ;
      A14793MAlqFasDsc = "" ;
      A14796MAlqBarPar = "" ;
      A14797MAlqHdr = "" ;
      A14798MAlqHdr2 = "" ;
      A14800MAlqParDsc = "" ;
      A14801MAlqPLC = "" ;
      A14804MAlqFec = GXutil.resetTime( GXutil.nullDate() );
      A14805MAlqVal = "" ;
      A14806MAlqValMin = "" ;
      A14807MAlqValMax = "" ;
      A14809MAlqFecEv = GXutil.resetTime( GXutil.nullDate() );
      A14811MAlqUsu = "" ;
      A14812MAlqIp = "" ;
      A14813MAlqReg = GXutil.resetTime( GXutil.nullDate() );
      A14814MAlqTkn = "" ;
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
      T01WF4_A14788MAlqId = new long[1] ;
      T01WF4_A14789MAlqEmprCo = new String[] {""} ;
      T01WF4_A14790MAlqMaqCod = new String[] {""} ;
      T01WF4_A14791MAlqMaqDsc = new String[] {""} ;
      T01WF4_A14792MAlqFasCod = new String[] {""} ;
      T01WF4_A14793MAlqFasDsc = new String[] {""} ;
      T01WF4_A14794MAlqBarCod = new int[1] ;
      T01WF4_A14795MAlqBarReo = new byte[1] ;
      T01WF4_A14796MAlqBarPar = new String[] {""} ;
      T01WF4_A14797MAlqHdr = new String[] {""} ;
      T01WF4_A14798MAlqHdr2 = new String[] {""} ;
      T01WF4_A14799MAlqParCod = new short[1] ;
      T01WF4_A14800MAlqParDsc = new String[] {""} ;
      T01WF4_A14801MAlqPLC = new String[] {""} ;
      T01WF4_A14802MAlqOrd = new short[1] ;
      T01WF4_A14803MAlqLin = new long[1] ;
      T01WF4_A14804MAlqFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01WF4_A14805MAlqVal = new String[] {""} ;
      T01WF4_A14806MAlqValMin = new String[] {""} ;
      T01WF4_A14807MAlqValMax = new String[] {""} ;
      T01WF4_A14808MAlqEr = new boolean[] {false} ;
      T01WF4_A14809MAlqFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01WF4_A14810MAlqParId = new long[1] ;
      T01WF4_A14811MAlqUsu = new String[] {""} ;
      T01WF4_A14812MAlqIp = new String[] {""} ;
      T01WF4_A14813MAlqReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WF4_A14814MAlqTkn = new String[] {""} ;
      T01WF5_A14788MAlqId = new long[1] ;
      T01WF3_A14788MAlqId = new long[1] ;
      T01WF3_A14789MAlqEmprCo = new String[] {""} ;
      T01WF3_A14790MAlqMaqCod = new String[] {""} ;
      T01WF3_A14791MAlqMaqDsc = new String[] {""} ;
      T01WF3_A14792MAlqFasCod = new String[] {""} ;
      T01WF3_A14793MAlqFasDsc = new String[] {""} ;
      T01WF3_A14794MAlqBarCod = new int[1] ;
      T01WF3_A14795MAlqBarReo = new byte[1] ;
      T01WF3_A14796MAlqBarPar = new String[] {""} ;
      T01WF3_A14797MAlqHdr = new String[] {""} ;
      T01WF3_A14798MAlqHdr2 = new String[] {""} ;
      T01WF3_A14799MAlqParCod = new short[1] ;
      T01WF3_A14800MAlqParDsc = new String[] {""} ;
      T01WF3_A14801MAlqPLC = new String[] {""} ;
      T01WF3_A14802MAlqOrd = new short[1] ;
      T01WF3_A14803MAlqLin = new long[1] ;
      T01WF3_A14804MAlqFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01WF3_A14805MAlqVal = new String[] {""} ;
      T01WF3_A14806MAlqValMin = new String[] {""} ;
      T01WF3_A14807MAlqValMax = new String[] {""} ;
      T01WF3_A14808MAlqEr = new boolean[] {false} ;
      T01WF3_A14809MAlqFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01WF3_A14810MAlqParId = new long[1] ;
      T01WF3_A14811MAlqUsu = new String[] {""} ;
      T01WF3_A14812MAlqIp = new String[] {""} ;
      T01WF3_A14813MAlqReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WF3_A14814MAlqTkn = new String[] {""} ;
      sMode1927 = "" ;
      T01WF6_A14788MAlqId = new long[1] ;
      T01WF7_A14788MAlqId = new long[1] ;
      T01WF2_A14788MAlqId = new long[1] ;
      T01WF2_A14789MAlqEmprCo = new String[] {""} ;
      T01WF2_A14790MAlqMaqCod = new String[] {""} ;
      T01WF2_A14791MAlqMaqDsc = new String[] {""} ;
      T01WF2_A14792MAlqFasCod = new String[] {""} ;
      T01WF2_A14793MAlqFasDsc = new String[] {""} ;
      T01WF2_A14794MAlqBarCod = new int[1] ;
      T01WF2_A14795MAlqBarReo = new byte[1] ;
      T01WF2_A14796MAlqBarPar = new String[] {""} ;
      T01WF2_A14797MAlqHdr = new String[] {""} ;
      T01WF2_A14798MAlqHdr2 = new String[] {""} ;
      T01WF2_A14799MAlqParCod = new short[1] ;
      T01WF2_A14800MAlqParDsc = new String[] {""} ;
      T01WF2_A14801MAlqPLC = new String[] {""} ;
      T01WF2_A14802MAlqOrd = new short[1] ;
      T01WF2_A14803MAlqLin = new long[1] ;
      T01WF2_A14804MAlqFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01WF2_A14805MAlqVal = new String[] {""} ;
      T01WF2_A14806MAlqValMin = new String[] {""} ;
      T01WF2_A14807MAlqValMax = new String[] {""} ;
      T01WF2_A14808MAlqEr = new boolean[] {false} ;
      T01WF2_A14809MAlqFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01WF2_A14810MAlqParId = new long[1] ;
      T01WF2_A14811MAlqUsu = new String[] {""} ;
      T01WF2_A14812MAlqIp = new String[] {""} ;
      T01WF2_A14813MAlqReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WF2_A14814MAlqTkn = new String[] {""} ;
      T01WF9_A14788MAlqId = new long[1] ;
      T01WF12_A14788MAlqId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ14789MAlqEmprCo = "" ;
      ZZ14790MAlqMaqCod = "" ;
      ZZ14791MAlqMaqDsc = "" ;
      ZZ14792MAlqFasCod = "" ;
      ZZ14793MAlqFasDsc = "" ;
      ZZ14796MAlqBarPar = "" ;
      ZZ14797MAlqHdr = "" ;
      ZZ14798MAlqHdr2 = "" ;
      ZZ14800MAlqParDsc = "" ;
      ZZ14801MAlqPLC = "" ;
      ZZ14804MAlqFec = GXutil.resetTime( GXutil.nullDate() );
      ZZ14805MAlqVal = "" ;
      ZZ14806MAlqValMin = "" ;
      ZZ14807MAlqValMax = "" ;
      ZZ14809MAlqFecEv = GXutil.resetTime( GXutil.nullDate() );
      ZZ14811MAlqUsu = "" ;
      ZZ14812MAlqIp = "" ;
      ZZ14813MAlqReg = GXutil.resetTime( GXutil.nullDate() );
      ZZ14814MAlqTkn = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.malq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.malq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.malq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.malq__default(),
         new Object[] {
             new Object[] {
            T01WF2_A14788MAlqId, T01WF2_A14789MAlqEmprCo, T01WF2_A14790MAlqMaqCod, T01WF2_A14791MAlqMaqDsc, T01WF2_A14792MAlqFasCod, T01WF2_A14793MAlqFasDsc, T01WF2_A14794MAlqBarCod, T01WF2_A14795MAlqBarReo, T01WF2_A14796MAlqBarPar, T01WF2_A14797MAlqHdr,
            T01WF2_A14798MAlqHdr2, T01WF2_A14799MAlqParCod, T01WF2_A14800MAlqParDsc, T01WF2_A14801MAlqPLC, T01WF2_A14802MAlqOrd, T01WF2_A14803MAlqLin, T01WF2_A14804MAlqFec, T01WF2_A14805MAlqVal, T01WF2_A14806MAlqValMin, T01WF2_A14807MAlqValMax,
            T01WF2_A14808MAlqEr, T01WF2_A14809MAlqFecEv, T01WF2_A14810MAlqParId, T01WF2_A14811MAlqUsu, T01WF2_A14812MAlqIp, T01WF2_A14813MAlqReg, T01WF2_A14814MAlqTkn
            }
            , new Object[] {
            T01WF3_A14788MAlqId, T01WF3_A14789MAlqEmprCo, T01WF3_A14790MAlqMaqCod, T01WF3_A14791MAlqMaqDsc, T01WF3_A14792MAlqFasCod, T01WF3_A14793MAlqFasDsc, T01WF3_A14794MAlqBarCod, T01WF3_A14795MAlqBarReo, T01WF3_A14796MAlqBarPar, T01WF3_A14797MAlqHdr,
            T01WF3_A14798MAlqHdr2, T01WF3_A14799MAlqParCod, T01WF3_A14800MAlqParDsc, T01WF3_A14801MAlqPLC, T01WF3_A14802MAlqOrd, T01WF3_A14803MAlqLin, T01WF3_A14804MAlqFec, T01WF3_A14805MAlqVal, T01WF3_A14806MAlqValMin, T01WF3_A14807MAlqValMax,
            T01WF3_A14808MAlqEr, T01WF3_A14809MAlqFecEv, T01WF3_A14810MAlqParId, T01WF3_A14811MAlqUsu, T01WF3_A14812MAlqIp, T01WF3_A14813MAlqReg, T01WF3_A14814MAlqTkn
            }
            , new Object[] {
            T01WF4_A14788MAlqId, T01WF4_A14789MAlqEmprCo, T01WF4_A14790MAlqMaqCod, T01WF4_A14791MAlqMaqDsc, T01WF4_A14792MAlqFasCod, T01WF4_A14793MAlqFasDsc, T01WF4_A14794MAlqBarCod, T01WF4_A14795MAlqBarReo, T01WF4_A14796MAlqBarPar, T01WF4_A14797MAlqHdr,
            T01WF4_A14798MAlqHdr2, T01WF4_A14799MAlqParCod, T01WF4_A14800MAlqParDsc, T01WF4_A14801MAlqPLC, T01WF4_A14802MAlqOrd, T01WF4_A14803MAlqLin, T01WF4_A14804MAlqFec, T01WF4_A14805MAlqVal, T01WF4_A14806MAlqValMin, T01WF4_A14807MAlqValMax,
            T01WF4_A14808MAlqEr, T01WF4_A14809MAlqFecEv, T01WF4_A14810MAlqParId, T01WF4_A14811MAlqUsu, T01WF4_A14812MAlqIp, T01WF4_A14813MAlqReg, T01WF4_A14814MAlqTkn
            }
            , new Object[] {
            T01WF5_A14788MAlqId
            }
            , new Object[] {
            T01WF6_A14788MAlqId
            }
            , new Object[] {
            T01WF7_A14788MAlqId
            }
            , new Object[] {
            }
            , new Object[] {
            T01WF9_A14788MAlqId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01WF12_A14788MAlqId
            }
         }
      );
   }

   private byte Z14795MAlqBarReo ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A14795MAlqBarReo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ14795MAlqBarReo ;
   private short Z14799MAlqParCod ;
   private short Z14802MAlqOrd ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14799MAlqParCod ;
   private short A14802MAlqOrd ;
   private short RcdFound1927 ;
   private short nIsDirty_1927 ;
   private short ZZ14799MAlqParCod ;
   private short ZZ14802MAlqOrd ;
   private int Z14794MAlqBarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtMAlqId_Enabled ;
   private int edtMAlqEmprCo_Enabled ;
   private int edtMAlqMaqCod_Enabled ;
   private int edtMAlqMaqDsc_Enabled ;
   private int edtMAlqFasCod_Enabled ;
   private int edtMAlqFasDsc_Enabled ;
   private int A14794MAlqBarCod ;
   private int edtMAlqBarCod_Enabled ;
   private int edtMAlqBarReo_Enabled ;
   private int edtMAlqBarPar_Enabled ;
   private int edtMAlqHdr_Enabled ;
   private int edtMAlqHdr2_Enabled ;
   private int edtMAlqParCod_Enabled ;
   private int edtMAlqParDsc_Enabled ;
   private int edtMAlqPLC_Enabled ;
   private int edtMAlqOrd_Enabled ;
   private int edtMAlqLin_Enabled ;
   private int edtMAlqFec_Enabled ;
   private int edtMAlqVal_Enabled ;
   private int edtMAlqValMin_Enabled ;
   private int edtMAlqValMax_Enabled ;
   private int edtMAlqFecEv_Enabled ;
   private int edtMAlqParId_Enabled ;
   private int edtMAlqUsu_Enabled ;
   private int edtMAlqIp_Enabled ;
   private int edtMAlqReg_Enabled ;
   private int edtMAlqTkn_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ14794MAlqBarCod ;
   private long Z14788MAlqId ;
   private long Z14803MAlqLin ;
   private long Z14810MAlqParId ;
   private long A14788MAlqId ;
   private long A14803MAlqLin ;
   private long A14810MAlqParId ;
   private long ZZ14788MAlqId ;
   private long ZZ14803MAlqLin ;
   private long ZZ14810MAlqParId ;
   private String sPrefix ;
   private String Z14789MAlqEmprCo ;
   private String Z14790MAlqMaqCod ;
   private String Z14792MAlqFasCod ;
   private String Z14796MAlqBarPar ;
   private String Z14797MAlqHdr ;
   private String Z14805MAlqVal ;
   private String Z14806MAlqValMin ;
   private String Z14807MAlqValMax ;
   private String Z14811MAlqUsu ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMAlqId_Internalname ;
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
   private String edtMAlqId_Jsonclick ;
   private String edtMAlqEmprCo_Internalname ;
   private String A14789MAlqEmprCo ;
   private String edtMAlqEmprCo_Jsonclick ;
   private String edtMAlqMaqCod_Internalname ;
   private String A14790MAlqMaqCod ;
   private String edtMAlqMaqCod_Jsonclick ;
   private String edtMAlqMaqDsc_Internalname ;
   private String edtMAlqMaqDsc_Jsonclick ;
   private String edtMAlqFasCod_Internalname ;
   private String A14792MAlqFasCod ;
   private String edtMAlqFasCod_Jsonclick ;
   private String edtMAlqFasDsc_Internalname ;
   private String edtMAlqFasDsc_Jsonclick ;
   private String edtMAlqBarCod_Internalname ;
   private String edtMAlqBarCod_Jsonclick ;
   private String edtMAlqBarReo_Internalname ;
   private String edtMAlqBarReo_Jsonclick ;
   private String edtMAlqBarPar_Internalname ;
   private String A14796MAlqBarPar ;
   private String edtMAlqBarPar_Jsonclick ;
   private String edtMAlqHdr_Internalname ;
   private String A14797MAlqHdr ;
   private String edtMAlqHdr_Jsonclick ;
   private String edtMAlqHdr2_Internalname ;
   private String edtMAlqHdr2_Jsonclick ;
   private String edtMAlqParCod_Internalname ;
   private String edtMAlqParCod_Jsonclick ;
   private String edtMAlqParDsc_Internalname ;
   private String edtMAlqParDsc_Jsonclick ;
   private String edtMAlqPLC_Internalname ;
   private String edtMAlqPLC_Jsonclick ;
   private String edtMAlqOrd_Internalname ;
   private String edtMAlqOrd_Jsonclick ;
   private String edtMAlqLin_Internalname ;
   private String edtMAlqLin_Jsonclick ;
   private String edtMAlqFec_Internalname ;
   private String edtMAlqFec_Jsonclick ;
   private String edtMAlqVal_Internalname ;
   private String A14805MAlqVal ;
   private String edtMAlqVal_Jsonclick ;
   private String edtMAlqValMin_Internalname ;
   private String A14806MAlqValMin ;
   private String edtMAlqValMin_Jsonclick ;
   private String edtMAlqValMax_Internalname ;
   private String A14807MAlqValMax ;
   private String edtMAlqValMax_Jsonclick ;
   private String edtMAlqFecEv_Internalname ;
   private String edtMAlqFecEv_Jsonclick ;
   private String edtMAlqParId_Internalname ;
   private String edtMAlqParId_Jsonclick ;
   private String edtMAlqUsu_Internalname ;
   private String A14811MAlqUsu ;
   private String edtMAlqUsu_Jsonclick ;
   private String edtMAlqIp_Internalname ;
   private String edtMAlqIp_Jsonclick ;
   private String edtMAlqReg_Internalname ;
   private String edtMAlqReg_Jsonclick ;
   private String edtMAlqTkn_Internalname ;
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
   private String sMode1927 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ14789MAlqEmprCo ;
   private String ZZ14790MAlqMaqCod ;
   private String ZZ14792MAlqFasCod ;
   private String ZZ14796MAlqBarPar ;
   private String ZZ14797MAlqHdr ;
   private String ZZ14805MAlqVal ;
   private String ZZ14806MAlqValMin ;
   private String ZZ14807MAlqValMax ;
   private String ZZ14811MAlqUsu ;
   private java.util.Date Z14804MAlqFec ;
   private java.util.Date Z14809MAlqFecEv ;
   private java.util.Date Z14813MAlqReg ;
   private java.util.Date A14804MAlqFec ;
   private java.util.Date A14809MAlqFecEv ;
   private java.util.Date A14813MAlqReg ;
   private java.util.Date ZZ14804MAlqFec ;
   private java.util.Date ZZ14809MAlqFecEv ;
   private java.util.Date ZZ14813MAlqReg ;
   private boolean Z14808MAlqEr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean A14808MAlqEr ;
   private boolean Gx_longc ;
   private boolean ZZ14808MAlqEr ;
   private String Z14791MAlqMaqDsc ;
   private String Z14793MAlqFasDsc ;
   private String Z14798MAlqHdr2 ;
   private String Z14800MAlqParDsc ;
   private String Z14801MAlqPLC ;
   private String Z14812MAlqIp ;
   private String Z14814MAlqTkn ;
   private String A14791MAlqMaqDsc ;
   private String A14793MAlqFasDsc ;
   private String A14798MAlqHdr2 ;
   private String A14800MAlqParDsc ;
   private String A14801MAlqPLC ;
   private String A14812MAlqIp ;
   private String A14814MAlqTkn ;
   private String ZZ14791MAlqMaqDsc ;
   private String ZZ14793MAlqFasDsc ;
   private String ZZ14798MAlqHdr2 ;
   private String ZZ14800MAlqParDsc ;
   private String ZZ14801MAlqPLC ;
   private String ZZ14812MAlqIp ;
   private String ZZ14814MAlqTkn ;
   private ICheckbox chkMAlqEr ;
   private IDataStoreProvider pr_default ;
   private long[] T01WF4_A14788MAlqId ;
   private String[] T01WF4_A14789MAlqEmprCo ;
   private String[] T01WF4_A14790MAlqMaqCod ;
   private String[] T01WF4_A14791MAlqMaqDsc ;
   private String[] T01WF4_A14792MAlqFasCod ;
   private String[] T01WF4_A14793MAlqFasDsc ;
   private int[] T01WF4_A14794MAlqBarCod ;
   private byte[] T01WF4_A14795MAlqBarReo ;
   private String[] T01WF4_A14796MAlqBarPar ;
   private String[] T01WF4_A14797MAlqHdr ;
   private String[] T01WF4_A14798MAlqHdr2 ;
   private short[] T01WF4_A14799MAlqParCod ;
   private String[] T01WF4_A14800MAlqParDsc ;
   private String[] T01WF4_A14801MAlqPLC ;
   private short[] T01WF4_A14802MAlqOrd ;
   private long[] T01WF4_A14803MAlqLin ;
   private java.util.Date[] T01WF4_A14804MAlqFec ;
   private String[] T01WF4_A14805MAlqVal ;
   private String[] T01WF4_A14806MAlqValMin ;
   private String[] T01WF4_A14807MAlqValMax ;
   private boolean[] T01WF4_A14808MAlqEr ;
   private java.util.Date[] T01WF4_A14809MAlqFecEv ;
   private long[] T01WF4_A14810MAlqParId ;
   private String[] T01WF4_A14811MAlqUsu ;
   private String[] T01WF4_A14812MAlqIp ;
   private java.util.Date[] T01WF4_A14813MAlqReg ;
   private String[] T01WF4_A14814MAlqTkn ;
   private long[] T01WF5_A14788MAlqId ;
   private long[] T01WF3_A14788MAlqId ;
   private String[] T01WF3_A14789MAlqEmprCo ;
   private String[] T01WF3_A14790MAlqMaqCod ;
   private String[] T01WF3_A14791MAlqMaqDsc ;
   private String[] T01WF3_A14792MAlqFasCod ;
   private String[] T01WF3_A14793MAlqFasDsc ;
   private int[] T01WF3_A14794MAlqBarCod ;
   private byte[] T01WF3_A14795MAlqBarReo ;
   private String[] T01WF3_A14796MAlqBarPar ;
   private String[] T01WF3_A14797MAlqHdr ;
   private String[] T01WF3_A14798MAlqHdr2 ;
   private short[] T01WF3_A14799MAlqParCod ;
   private String[] T01WF3_A14800MAlqParDsc ;
   private String[] T01WF3_A14801MAlqPLC ;
   private short[] T01WF3_A14802MAlqOrd ;
   private long[] T01WF3_A14803MAlqLin ;
   private java.util.Date[] T01WF3_A14804MAlqFec ;
   private String[] T01WF3_A14805MAlqVal ;
   private String[] T01WF3_A14806MAlqValMin ;
   private String[] T01WF3_A14807MAlqValMax ;
   private boolean[] T01WF3_A14808MAlqEr ;
   private java.util.Date[] T01WF3_A14809MAlqFecEv ;
   private long[] T01WF3_A14810MAlqParId ;
   private String[] T01WF3_A14811MAlqUsu ;
   private String[] T01WF3_A14812MAlqIp ;
   private java.util.Date[] T01WF3_A14813MAlqReg ;
   private String[] T01WF3_A14814MAlqTkn ;
   private long[] T01WF6_A14788MAlqId ;
   private long[] T01WF7_A14788MAlqId ;
   private long[] T01WF2_A14788MAlqId ;
   private String[] T01WF2_A14789MAlqEmprCo ;
   private String[] T01WF2_A14790MAlqMaqCod ;
   private String[] T01WF2_A14791MAlqMaqDsc ;
   private String[] T01WF2_A14792MAlqFasCod ;
   private String[] T01WF2_A14793MAlqFasDsc ;
   private int[] T01WF2_A14794MAlqBarCod ;
   private byte[] T01WF2_A14795MAlqBarReo ;
   private String[] T01WF2_A14796MAlqBarPar ;
   private String[] T01WF2_A14797MAlqHdr ;
   private String[] T01WF2_A14798MAlqHdr2 ;
   private short[] T01WF2_A14799MAlqParCod ;
   private String[] T01WF2_A14800MAlqParDsc ;
   private String[] T01WF2_A14801MAlqPLC ;
   private short[] T01WF2_A14802MAlqOrd ;
   private long[] T01WF2_A14803MAlqLin ;
   private java.util.Date[] T01WF2_A14804MAlqFec ;
   private String[] T01WF2_A14805MAlqVal ;
   private String[] T01WF2_A14806MAlqValMin ;
   private String[] T01WF2_A14807MAlqValMax ;
   private boolean[] T01WF2_A14808MAlqEr ;
   private java.util.Date[] T01WF2_A14809MAlqFecEv ;
   private long[] T01WF2_A14810MAlqParId ;
   private String[] T01WF2_A14811MAlqUsu ;
   private String[] T01WF2_A14812MAlqIp ;
   private java.util.Date[] T01WF2_A14813MAlqReg ;
   private String[] T01WF2_A14814MAlqTkn ;
   private long[] T01WF9_A14788MAlqId ;
   private long[] T01WF12_A14788MAlqId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class malq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class malq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class malq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class malq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01WF2", "SELECT MAlqId, MAlqEmprCo, MAlqMaqCod, MAlqMaqDsc, MAlqFasCod, MAlqFasDsc, MAlqBarCod, MAlqBarReo, MAlqBarPar, MAlqHdr, MAlqHdr2, MAlqParCod, MAlqParDsc, MAlqPLC, MAlqOrd, MAlqLin, MAlqFec, MAlqVal, MAlqValMin, MAlqValMax, MAlqEr, MAlqFecEv, MAlqParId, MAlqUsu, MAlqIp, MAlqReg, MAlqTkn FROM MAlq WHERE MAlqId = ?  FOR UPDATE OF MAlqEmprCo, MAlqMaqCod, MAlqMaqDsc, MAlqFasCod, MAlqFasDsc, MAlqBarCod, MAlqBarReo, MAlqBarPar, MAlqHdr, MAlqHdr2, MAlqParCod, MAlqParDsc, MAlqPLC, MAlqOrd, MAlqLin, MAlqFec, MAlqVal, MAlqValMin, MAlqValMax, MAlqEr, MAlqFecEv, MAlqParId, MAlqUsu, MAlqIp, MAlqReg, MAlqTkn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WF3", "SELECT MAlqId, MAlqEmprCo, MAlqMaqCod, MAlqMaqDsc, MAlqFasCod, MAlqFasDsc, MAlqBarCod, MAlqBarReo, MAlqBarPar, MAlqHdr, MAlqHdr2, MAlqParCod, MAlqParDsc, MAlqPLC, MAlqOrd, MAlqLin, MAlqFec, MAlqVal, MAlqValMin, MAlqValMax, MAlqEr, MAlqFecEv, MAlqParId, MAlqUsu, MAlqIp, MAlqReg, MAlqTkn FROM MAlq WHERE MAlqId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WF4", "SELECT /*+ FIRST_ROWS(100) */ TM1.MAlqId, TM1.MAlqEmprCo, TM1.MAlqMaqCod, TM1.MAlqMaqDsc, TM1.MAlqFasCod, TM1.MAlqFasDsc, TM1.MAlqBarCod, TM1.MAlqBarReo, TM1.MAlqBarPar, TM1.MAlqHdr, TM1.MAlqHdr2, TM1.MAlqParCod, TM1.MAlqParDsc, TM1.MAlqPLC, TM1.MAlqOrd, TM1.MAlqLin, TM1.MAlqFec, TM1.MAlqVal, TM1.MAlqValMin, TM1.MAlqValMax, TM1.MAlqEr, TM1.MAlqFecEv, TM1.MAlqParId, TM1.MAlqUsu, TM1.MAlqIp, TM1.MAlqReg, TM1.MAlqTkn FROM MAlq TM1 WHERE TM1.MAlqId = ? ORDER BY TM1.MAlqId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WF5", "SELECT /*+ FIRST_ROWS(1) */ MAlqId FROM MAlq WHERE MAlqId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WF6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MAlqId FROM MAlq WHERE ( MAlqId > ?) ORDER BY MAlqId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01WF7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MAlqId FROM MAlq WHERE ( MAlqId < ?) ORDER BY MAlqId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01WF8", "INSERT INTO MAlq(MAlqEmprCo, MAlqMaqCod, MAlqMaqDsc, MAlqFasCod, MAlqFasDsc, MAlqBarCod, MAlqBarReo, MAlqBarPar, MAlqHdr, MAlqHdr2, MAlqParCod, MAlqParDsc, MAlqPLC, MAlqOrd, MAlqLin, MAlqFec, MAlqVal, MAlqValMin, MAlqValMax, MAlqEr, MAlqFecEv, MAlqParId, MAlqUsu, MAlqIp, MAlqReg, MAlqTkn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "MAlq")
         ,new ForEachCursor("T01WF9", "SELECT MAlqId.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01WF10", "UPDATE MAlq SET MAlqEmprCo=?, MAlqMaqCod=?, MAlqMaqDsc=?, MAlqFasCod=?, MAlqFasDsc=?, MAlqBarCod=?, MAlqBarReo=?, MAlqBarPar=?, MAlqHdr=?, MAlqHdr2=?, MAlqParCod=?, MAlqParDsc=?, MAlqPLC=?, MAlqOrd=?, MAlqLin=?, MAlqFec=?, MAlqVal=?, MAlqValMin=?, MAlqValMax=?, MAlqEr=?, MAlqFecEv=?, MAlqParId=?, MAlqUsu=?, MAlqIp=?, MAlqReg=?, MAlqTkn=?  WHERE MAlqId = ?", GX_NOMASK, "MAlq")
         ,new UpdateCursor("T01WF11", "DELETE FROM MAlq  WHERE MAlqId = ?", GX_NOMASK, "MAlq")
         ,new ForEachCursor("T01WF12", "SELECT /*+ FIRST_ROWS(100) */ MAlqId FROM MAlq ORDER BY MAlqId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 12);
               ((String[]) buf[18])[0] = rslt.getString(19, 12);
               ((String[]) buf[19])[0] = rslt.getString(20, 12);
               ((boolean[]) buf[20])[0] = rslt.getBoolean(21);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(22);
               ((long[]) buf[22])[0] = rslt.getLong(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 8);
               ((String[]) buf[24])[0] = rslt.getVarchar(25);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(26);
               ((String[]) buf[26])[0] = rslt.getVarchar(27);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 12);
               ((String[]) buf[18])[0] = rslt.getString(19, 12);
               ((String[]) buf[19])[0] = rslt.getString(20, 12);
               ((boolean[]) buf[20])[0] = rslt.getBoolean(21);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(22);
               ((long[]) buf[22])[0] = rslt.getLong(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 8);
               ((String[]) buf[24])[0] = rslt.getVarchar(25);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(26);
               ((String[]) buf[26])[0] = rslt.getVarchar(27);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 12);
               ((String[]) buf[18])[0] = rslt.getString(19, 12);
               ((String[]) buf[19])[0] = rslt.getString(20, 12);
               ((boolean[]) buf[20])[0] = rslt.getBoolean(21);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(22);
               ((long[]) buf[22])[0] = rslt.getLong(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 8);
               ((String[]) buf[24])[0] = rslt.getVarchar(25);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(26);
               ((String[]) buf[26])[0] = rslt.getVarchar(27);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setVarchar(5, (String)parms[4], 100, false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 10);
               stmt.setVarchar(10, (String)parms[9], 10, false);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setVarchar(12, (String)parms[11], 100, false);
               stmt.setVarchar(13, (String)parms[12], 100, false);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setLong(15, ((Number) parms[14]).longValue());
               stmt.setDateTime(16, (java.util.Date)parms[15], false);
               stmt.setString(17, (String)parms[16], 12);
               stmt.setString(18, (String)parms[17], 12);
               stmt.setString(19, (String)parms[18], 12);
               stmt.setBoolean(20, ((Boolean) parms[19]).booleanValue());
               stmt.setDateTime(21, (java.util.Date)parms[20], false);
               stmt.setLong(22, ((Number) parms[21]).longValue());
               stmt.setString(23, (String)parms[22], 8);
               stmt.setVarchar(24, (String)parms[23], 20, false);
               stmt.setDateTime(25, (java.util.Date)parms[24], false);
               stmt.setVarchar(26, (String)parms[25], 256, false);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setVarchar(5, (String)parms[4], 100, false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 10);
               stmt.setVarchar(10, (String)parms[9], 10, false);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setVarchar(12, (String)parms[11], 100, false);
               stmt.setVarchar(13, (String)parms[12], 100, false);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setLong(15, ((Number) parms[14]).longValue());
               stmt.setDateTime(16, (java.util.Date)parms[15], false);
               stmt.setString(17, (String)parms[16], 12);
               stmt.setString(18, (String)parms[17], 12);
               stmt.setString(19, (String)parms[18], 12);
               stmt.setBoolean(20, ((Boolean) parms[19]).booleanValue());
               stmt.setDateTime(21, (java.util.Date)parms[20], false);
               stmt.setLong(22, ((Number) parms[21]).longValue());
               stmt.setString(23, (String)parms[22], 8);
               stmt.setVarchar(24, (String)parms[23], 20, false);
               stmt.setDateTime(25, (java.util.Date)parms[24], false);
               stmt.setVarchar(26, (String)parms[25], 256, false);
               stmt.setLong(27, ((Number) parms[26]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

