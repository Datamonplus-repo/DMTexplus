package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class male_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "M Alertas Ingenieria", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMAleId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public male_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public male_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( male_impl.class ));
   }

   public male_impl( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkMAleEr = UIFactory.getCheckbox(this);
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
      A14727MAleEr = GXutil.strtobool( GXutil.booltostr( A14727MAleEr)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14727MAleEr", A14727MAleEr);
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "M Alertas Ingenieria", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MAle.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Ingenieria\\MAle.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleId_Internalname, httpContext.getMessage( "Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleId_Internalname, GXutil.ltrim( localUtil.ntoc( A14677MAleId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAleId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14677MAleId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14677MAleId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleEmprCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleEmprCo_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleEmprCo_Internalname, GXutil.rtrim( A14732MAleEmprCo), GXutil.rtrim( localUtil.format( A14732MAleEmprCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleEmprCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleEmprCo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleMaqCod_Internalname, httpContext.getMessage( "Cód. máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleMaqCod_Internalname, GXutil.rtrim( A14724MAleMaqCod), GXutil.rtrim( localUtil.format( A14724MAleMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\MaqCod", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleMaqDsc_Internalname, httpContext.getMessage( "Máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleMaqDsc_Internalname, A14737MAleMaqDsc, GXutil.rtrim( localUtil.format( A14737MAleMaqDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleMaqDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleMaqDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleFasCod_Internalname, httpContext.getMessage( "Cód. fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleFasCod_Internalname, GXutil.rtrim( A14725MAleFasCod), GXutil.rtrim( localUtil.format( A14725MAleFasCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleFasCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\FasCod", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleFasDsc_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleFasDsc_Internalname, A14738MAleFasDsc, GXutil.rtrim( localUtil.format( A14738MAleFasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleFasDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleFasDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14745MAleBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAleBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14745MAleBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14745MAleBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleBarReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleBarReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A14746MAleBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAleBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14746MAleBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A14746MAleBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleBarReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleBarPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleBarPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleBarPar_Internalname, GXutil.rtrim( A14747MAleBarPar), GXutil.rtrim( localUtil.format( A14747MAleBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleBarPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleHdr_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleHdr_Internalname, GXutil.rtrim( A14739MAleHdr), GXutil.rtrim( localUtil.format( A14739MAleHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleHdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleHdr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Hdr", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleHdr2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleHdr2_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleHdr2_Internalname, A14736MAleHdr2, GXutil.rtrim( localUtil.format( A14736MAleHdr2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleHdr2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleHdr2_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleParCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleParCod_Internalname, httpContext.getMessage( "Cód. parametro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleParCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14726MAleParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAleParCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14726MAleParCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14726MAleParCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleParCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleParCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleParDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleParDsc_Internalname, httpContext.getMessage( "Parametro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleParDsc_Internalname, A14740MAleParDsc, GXutil.rtrim( localUtil.format( A14740MAleParDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleParDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleParDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAlePLC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAlePLC_Internalname, httpContext.getMessage( "c/PLC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAlePLC_Internalname, A14743MAlePLC, GXutil.rtrim( localUtil.format( A14743MAlePLC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAlePLC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAlePLC_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleOrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleOrd_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A14741MAleOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAleOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14741MAleOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14741MAleOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleOrd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleLin_Internalname, httpContext.getMessage( "Lìnea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleLin_Internalname, GXutil.ltrim( localUtil.ntoc( A14742MAleLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAleLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14742MAleLin), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14742MAleLin), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleLin_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleFec_Internalname, httpContext.getMessage( "Registrado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMAleFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleFec_Internalname, localUtil.ttoc( A14678MAleFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14678MAleFec, "99/99/99 99:99:99.999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleFec_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMAleFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMAleFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MAle.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleVal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleVal_Internalname, httpContext.getMessage( "Valor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleVal_Internalname, GXutil.rtrim( A14728MAleVal), GXutil.rtrim( localUtil.format( A14728MAleVal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleVal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleVal_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleValMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleValMin_Internalname, httpContext.getMessage( "Minimo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleValMin_Internalname, GXutil.rtrim( A14733MAleValMin), GXutil.rtrim( localUtil.format( A14733MAleValMin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleValMin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleValMin_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleValMax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleValMax_Internalname, httpContext.getMessage( "Maximo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleValMax_Internalname, GXutil.rtrim( A14734MAleValMax), GXutil.rtrim( localUtil.format( A14734MAleValMax, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleValMax_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleValMax_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkMAleEr.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkMAleEr.getInternalname(), httpContext.getMessage( "Error", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkMAleEr.getInternalname(), GXutil.booltostr( A14727MAleEr), "", httpContext.getMessage( "Error", ""), 1, chkMAleEr.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(134, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,134);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleFecEv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleFecEv_Internalname, httpContext.getMessage( "Evaluado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMAleFecEv_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleFecEv_Internalname, localUtil.ttoc( A14744MAleFecEv, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14744MAleFecEv, "99/99/99 99:99:99.999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleFecEv_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleFecEv_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMAleFecEv_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMAleFecEv_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MAle.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleParId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleParId_Internalname, httpContext.getMessage( "Par Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleParId_Internalname, GXutil.ltrim( localUtil.ntoc( A14748MAleParId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAleParId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14748MAleParId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14748MAleParId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleParId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleParId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleUsu_Internalname, GXutil.rtrim( A14729MAleUsu), GXutil.rtrim( localUtil.format( A14729MAleUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleUsu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleIp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleIp_Internalname, httpContext.getMessage( "Ip", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleIp_Internalname, A14730MAleIp, GXutil.rtrim( localUtil.format( A14730MAleIp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleIp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleIp_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Ip", "left", true, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleReg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleReg_Internalname, httpContext.getMessage( "Registro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMAleReg_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAleReg_Internalname, localUtil.ttoc( A14731MAleReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14731MAleReg, "99/99/99 99:99:99.999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAleReg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAleReg_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMAleReg_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMAleReg_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MAle.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAleTkn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAleTkn_Internalname, httpContext.getMessage( "Token", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMAleTkn_Internalname, A14735MAleTkn, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", (short)(0), 1, edtMAleTkn_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Ingenieria\\MAle.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAle.htm");
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
         Z14677MAleId = localUtil.ctol( httpContext.cgiGet( "Z14677MAleId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14732MAleEmprCo = httpContext.cgiGet( "Z14732MAleEmprCo") ;
         Z14724MAleMaqCod = httpContext.cgiGet( "Z14724MAleMaqCod") ;
         Z14737MAleMaqDsc = httpContext.cgiGet( "Z14737MAleMaqDsc") ;
         Z14725MAleFasCod = httpContext.cgiGet( "Z14725MAleFasCod") ;
         Z14738MAleFasDsc = httpContext.cgiGet( "Z14738MAleFasDsc") ;
         Z14745MAleBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z14745MAleBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14746MAleBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14746MAleBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14747MAleBarPar = httpContext.cgiGet( "Z14747MAleBarPar") ;
         Z14739MAleHdr = httpContext.cgiGet( "Z14739MAleHdr") ;
         Z14736MAleHdr2 = httpContext.cgiGet( "Z14736MAleHdr2") ;
         Z14726MAleParCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z14726MAleParCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14740MAleParDsc = httpContext.cgiGet( "Z14740MAleParDsc") ;
         Z14743MAlePLC = httpContext.cgiGet( "Z14743MAlePLC") ;
         Z14741MAleOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z14741MAleOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14742MAleLin = localUtil.ctol( httpContext.cgiGet( "Z14742MAleLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14678MAleFec = localUtil.ctot( httpContext.cgiGet( "Z14678MAleFec"), 0) ;
         Z14728MAleVal = httpContext.cgiGet( "Z14728MAleVal") ;
         Z14733MAleValMin = httpContext.cgiGet( "Z14733MAleValMin") ;
         Z14734MAleValMax = httpContext.cgiGet( "Z14734MAleValMax") ;
         Z14727MAleEr = GXutil.strtobool( httpContext.cgiGet( "Z14727MAleEr")) ;
         Z14744MAleFecEv = localUtil.ctot( httpContext.cgiGet( "Z14744MAleFecEv"), 0) ;
         Z14748MAleParId = localUtil.ctol( httpContext.cgiGet( "Z14748MAleParId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14729MAleUsu = httpContext.cgiGet( "Z14729MAleUsu") ;
         Z14730MAleIp = httpContext.cgiGet( "Z14730MAleIp") ;
         Z14731MAleReg = localUtil.ctot( httpContext.cgiGet( "Z14731MAleReg"), 0) ;
         Z14735MAleTkn = httpContext.cgiGet( "Z14735MAleTkn") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAleId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAleId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MALEID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAleId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14677MAleId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14677MAleId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14677MAleId), 10, 0));
         }
         else
         {
            A14677MAleId = localUtil.ctol( httpContext.cgiGet( edtMAleId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14677MAleId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14677MAleId), 10, 0));
         }
         A14732MAleEmprCo = httpContext.cgiGet( edtMAleEmprCo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14732MAleEmprCo", A14732MAleEmprCo);
         A14724MAleMaqCod = httpContext.cgiGet( edtMAleMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14724MAleMaqCod", A14724MAleMaqCod);
         A14737MAleMaqDsc = httpContext.cgiGet( edtMAleMaqDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14737MAleMaqDsc", A14737MAleMaqDsc);
         A14725MAleFasCod = httpContext.cgiGet( edtMAleFasCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14725MAleFasCod", A14725MAleFasCod);
         A14738MAleFasDsc = httpContext.cgiGet( edtMAleFasDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14738MAleFasDsc", A14738MAleFasDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAleBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAleBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MALEBARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAleBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14745MAleBarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14745MAleBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14745MAleBarCod), 8, 0));
         }
         else
         {
            A14745MAleBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMAleBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14745MAleBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14745MAleBarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAleBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAleBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MALEBARREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAleBarReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14746MAleBarReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14746MAleBarReo", GXutil.str( A14746MAleBarReo, 1, 0));
         }
         else
         {
            A14746MAleBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtMAleBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14746MAleBarReo", GXutil.str( A14746MAleBarReo, 1, 0));
         }
         A14747MAleBarPar = httpContext.cgiGet( edtMAleBarPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14747MAleBarPar", A14747MAleBarPar);
         A14739MAleHdr = httpContext.cgiGet( edtMAleHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14739MAleHdr", A14739MAleHdr);
         A14736MAleHdr2 = httpContext.cgiGet( edtMAleHdr2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14736MAleHdr2", A14736MAleHdr2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAleParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAleParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MALEPARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAleParCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14726MAleParCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14726MAleParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14726MAleParCod), 4, 0));
         }
         else
         {
            A14726MAleParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtMAleParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14726MAleParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14726MAleParCod), 4, 0));
         }
         A14740MAleParDsc = httpContext.cgiGet( edtMAleParDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14740MAleParDsc", A14740MAleParDsc);
         A14743MAlePLC = httpContext.cgiGet( edtMAlePLC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14743MAlePLC", A14743MAlePLC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAleOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAleOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MALEORD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAleOrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14741MAleOrd = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14741MAleOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14741MAleOrd), 4, 0));
         }
         else
         {
            A14741MAleOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtMAleOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14741MAleOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14741MAleOrd), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAleLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAleLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MALELIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAleLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14742MAleLin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14742MAleLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14742MAleLin), 12, 0));
         }
         else
         {
            A14742MAleLin = localUtil.ctol( httpContext.cgiGet( edtMAleLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14742MAleLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14742MAleLin), 12, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMAleFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MALEFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAleFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14678MAleFec = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14678MAleFec", localUtil.ttoc( A14678MAleFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14678MAleFec = localUtil.ctot( httpContext.cgiGet( edtMAleFec_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14678MAleFec", localUtil.ttoc( A14678MAleFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A14728MAleVal = httpContext.cgiGet( edtMAleVal_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14728MAleVal", A14728MAleVal);
         A14733MAleValMin = httpContext.cgiGet( edtMAleValMin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14733MAleValMin", A14733MAleValMin);
         A14734MAleValMax = httpContext.cgiGet( edtMAleValMax_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14734MAleValMax", A14734MAleValMax);
         A14727MAleEr = GXutil.strtobool( httpContext.cgiGet( chkMAleEr.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14727MAleEr", A14727MAleEr);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMAleFecEv_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MALEFECEV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAleFecEv_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14744MAleFecEv = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14744MAleFecEv", localUtil.ttoc( A14744MAleFecEv, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14744MAleFecEv = localUtil.ctot( httpContext.cgiGet( edtMAleFecEv_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14744MAleFecEv", localUtil.ttoc( A14744MAleFecEv, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAleParId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAleParId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MALEPARID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAleParId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14748MAleParId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14748MAleParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14748MAleParId), 10, 0));
         }
         else
         {
            A14748MAleParId = localUtil.ctol( httpContext.cgiGet( edtMAleParId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14748MAleParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14748MAleParId), 10, 0));
         }
         A14729MAleUsu = httpContext.cgiGet( edtMAleUsu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14729MAleUsu", A14729MAleUsu);
         A14730MAleIp = httpContext.cgiGet( edtMAleIp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14730MAleIp", A14730MAleIp);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMAleReg_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MALEREG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAleReg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14731MAleReg = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14731MAleReg", localUtil.ttoc( A14731MAleReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14731MAleReg = localUtil.ctot( httpContext.cgiGet( edtMAleReg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14731MAleReg", localUtil.ttoc( A14731MAleReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A14735MAleTkn = httpContext.cgiGet( edtMAleTkn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14735MAleTkn", A14735MAleTkn);
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
            A14677MAleId = GXutil.lval( httpContext.GetPar( "MAleId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14677MAleId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14677MAleId), 10, 0));
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
            initAll1WA1922( ) ;
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
      disableAttributes1WA1922( ) ;
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

   public void resetCaption1WA0( )
   {
   }

   public void zm1WA1922( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14732MAleEmprCo = T01WA3_A14732MAleEmprCo[0] ;
            Z14724MAleMaqCod = T01WA3_A14724MAleMaqCod[0] ;
            Z14737MAleMaqDsc = T01WA3_A14737MAleMaqDsc[0] ;
            Z14725MAleFasCod = T01WA3_A14725MAleFasCod[0] ;
            Z14738MAleFasDsc = T01WA3_A14738MAleFasDsc[0] ;
            Z14745MAleBarCod = T01WA3_A14745MAleBarCod[0] ;
            Z14746MAleBarReo = T01WA3_A14746MAleBarReo[0] ;
            Z14747MAleBarPar = T01WA3_A14747MAleBarPar[0] ;
            Z14739MAleHdr = T01WA3_A14739MAleHdr[0] ;
            Z14736MAleHdr2 = T01WA3_A14736MAleHdr2[0] ;
            Z14726MAleParCod = T01WA3_A14726MAleParCod[0] ;
            Z14740MAleParDsc = T01WA3_A14740MAleParDsc[0] ;
            Z14743MAlePLC = T01WA3_A14743MAlePLC[0] ;
            Z14741MAleOrd = T01WA3_A14741MAleOrd[0] ;
            Z14742MAleLin = T01WA3_A14742MAleLin[0] ;
            Z14678MAleFec = T01WA3_A14678MAleFec[0] ;
            Z14728MAleVal = T01WA3_A14728MAleVal[0] ;
            Z14733MAleValMin = T01WA3_A14733MAleValMin[0] ;
            Z14734MAleValMax = T01WA3_A14734MAleValMax[0] ;
            Z14727MAleEr = T01WA3_A14727MAleEr[0] ;
            Z14744MAleFecEv = T01WA3_A14744MAleFecEv[0] ;
            Z14748MAleParId = T01WA3_A14748MAleParId[0] ;
            Z14729MAleUsu = T01WA3_A14729MAleUsu[0] ;
            Z14730MAleIp = T01WA3_A14730MAleIp[0] ;
            Z14731MAleReg = T01WA3_A14731MAleReg[0] ;
            Z14735MAleTkn = T01WA3_A14735MAleTkn[0] ;
         }
         else
         {
            Z14732MAleEmprCo = A14732MAleEmprCo ;
            Z14724MAleMaqCod = A14724MAleMaqCod ;
            Z14737MAleMaqDsc = A14737MAleMaqDsc ;
            Z14725MAleFasCod = A14725MAleFasCod ;
            Z14738MAleFasDsc = A14738MAleFasDsc ;
            Z14745MAleBarCod = A14745MAleBarCod ;
            Z14746MAleBarReo = A14746MAleBarReo ;
            Z14747MAleBarPar = A14747MAleBarPar ;
            Z14739MAleHdr = A14739MAleHdr ;
            Z14736MAleHdr2 = A14736MAleHdr2 ;
            Z14726MAleParCod = A14726MAleParCod ;
            Z14740MAleParDsc = A14740MAleParDsc ;
            Z14743MAlePLC = A14743MAlePLC ;
            Z14741MAleOrd = A14741MAleOrd ;
            Z14742MAleLin = A14742MAleLin ;
            Z14678MAleFec = A14678MAleFec ;
            Z14728MAleVal = A14728MAleVal ;
            Z14733MAleValMin = A14733MAleValMin ;
            Z14734MAleValMax = A14734MAleValMax ;
            Z14727MAleEr = A14727MAleEr ;
            Z14744MAleFecEv = A14744MAleFecEv ;
            Z14748MAleParId = A14748MAleParId ;
            Z14729MAleUsu = A14729MAleUsu ;
            Z14730MAleIp = A14730MAleIp ;
            Z14731MAleReg = A14731MAleReg ;
            Z14735MAleTkn = A14735MAleTkn ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z14677MAleId = A14677MAleId ;
         Z14732MAleEmprCo = A14732MAleEmprCo ;
         Z14724MAleMaqCod = A14724MAleMaqCod ;
         Z14737MAleMaqDsc = A14737MAleMaqDsc ;
         Z14725MAleFasCod = A14725MAleFasCod ;
         Z14738MAleFasDsc = A14738MAleFasDsc ;
         Z14745MAleBarCod = A14745MAleBarCod ;
         Z14746MAleBarReo = A14746MAleBarReo ;
         Z14747MAleBarPar = A14747MAleBarPar ;
         Z14739MAleHdr = A14739MAleHdr ;
         Z14736MAleHdr2 = A14736MAleHdr2 ;
         Z14726MAleParCod = A14726MAleParCod ;
         Z14740MAleParDsc = A14740MAleParDsc ;
         Z14743MAlePLC = A14743MAlePLC ;
         Z14741MAleOrd = A14741MAleOrd ;
         Z14742MAleLin = A14742MAleLin ;
         Z14678MAleFec = A14678MAleFec ;
         Z14728MAleVal = A14728MAleVal ;
         Z14733MAleValMin = A14733MAleValMin ;
         Z14734MAleValMax = A14734MAleValMax ;
         Z14727MAleEr = A14727MAleEr ;
         Z14744MAleFecEv = A14744MAleFecEv ;
         Z14748MAleParId = A14748MAleParId ;
         Z14729MAleUsu = A14729MAleUsu ;
         Z14730MAleIp = A14730MAleIp ;
         Z14731MAleReg = A14731MAleReg ;
         Z14735MAleTkn = A14735MAleTkn ;
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

   public void load1WA1922( )
   {
      /* Using cursor T01WA4 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14677MAleId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1922 = (short)(1) ;
         A14732MAleEmprCo = T01WA4_A14732MAleEmprCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14732MAleEmprCo", A14732MAleEmprCo);
         A14724MAleMaqCod = T01WA4_A14724MAleMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14724MAleMaqCod", A14724MAleMaqCod);
         A14737MAleMaqDsc = T01WA4_A14737MAleMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14737MAleMaqDsc", A14737MAleMaqDsc);
         A14725MAleFasCod = T01WA4_A14725MAleFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14725MAleFasCod", A14725MAleFasCod);
         A14738MAleFasDsc = T01WA4_A14738MAleFasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14738MAleFasDsc", A14738MAleFasDsc);
         A14745MAleBarCod = T01WA4_A14745MAleBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14745MAleBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14745MAleBarCod), 8, 0));
         A14746MAleBarReo = T01WA4_A14746MAleBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14746MAleBarReo", GXutil.str( A14746MAleBarReo, 1, 0));
         A14747MAleBarPar = T01WA4_A14747MAleBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14747MAleBarPar", A14747MAleBarPar);
         A14739MAleHdr = T01WA4_A14739MAleHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14739MAleHdr", A14739MAleHdr);
         A14736MAleHdr2 = T01WA4_A14736MAleHdr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14736MAleHdr2", A14736MAleHdr2);
         A14726MAleParCod = T01WA4_A14726MAleParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14726MAleParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14726MAleParCod), 4, 0));
         A14740MAleParDsc = T01WA4_A14740MAleParDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14740MAleParDsc", A14740MAleParDsc);
         A14743MAlePLC = T01WA4_A14743MAlePLC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14743MAlePLC", A14743MAlePLC);
         A14741MAleOrd = T01WA4_A14741MAleOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14741MAleOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14741MAleOrd), 4, 0));
         A14742MAleLin = T01WA4_A14742MAleLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14742MAleLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14742MAleLin), 12, 0));
         A14678MAleFec = T01WA4_A14678MAleFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14678MAleFec", localUtil.ttoc( A14678MAleFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14728MAleVal = T01WA4_A14728MAleVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14728MAleVal", A14728MAleVal);
         A14733MAleValMin = T01WA4_A14733MAleValMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14733MAleValMin", A14733MAleValMin);
         A14734MAleValMax = T01WA4_A14734MAleValMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14734MAleValMax", A14734MAleValMax);
         A14727MAleEr = T01WA4_A14727MAleEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14727MAleEr", A14727MAleEr);
         A14744MAleFecEv = T01WA4_A14744MAleFecEv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14744MAleFecEv", localUtil.ttoc( A14744MAleFecEv, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14748MAleParId = T01WA4_A14748MAleParId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14748MAleParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14748MAleParId), 10, 0));
         A14729MAleUsu = T01WA4_A14729MAleUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14729MAleUsu", A14729MAleUsu);
         A14730MAleIp = T01WA4_A14730MAleIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14730MAleIp", A14730MAleIp);
         A14731MAleReg = T01WA4_A14731MAleReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14731MAleReg", localUtil.ttoc( A14731MAleReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14735MAleTkn = T01WA4_A14735MAleTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14735MAleTkn", A14735MAleTkn);
         zm1WA1922( -1) ;
      }
      pr_default.close(2);
      onLoadActions1WA1922( ) ;
   }

   public void onLoadActions1WA1922( )
   {
   }

   public void checkExtendedTable1WA1922( )
   {
      nIsDirty_1922 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1WA1922( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1WA1922( )
   {
      /* Using cursor T01WA5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14677MAleId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1922 = (short)(1) ;
      }
      else
      {
         RcdFound1922 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01WA3 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14677MAleId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1WA1922( 1) ;
         RcdFound1922 = (short)(1) ;
         A14677MAleId = T01WA3_A14677MAleId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14677MAleId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14677MAleId), 10, 0));
         A14732MAleEmprCo = T01WA3_A14732MAleEmprCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14732MAleEmprCo", A14732MAleEmprCo);
         A14724MAleMaqCod = T01WA3_A14724MAleMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14724MAleMaqCod", A14724MAleMaqCod);
         A14737MAleMaqDsc = T01WA3_A14737MAleMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14737MAleMaqDsc", A14737MAleMaqDsc);
         A14725MAleFasCod = T01WA3_A14725MAleFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14725MAleFasCod", A14725MAleFasCod);
         A14738MAleFasDsc = T01WA3_A14738MAleFasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14738MAleFasDsc", A14738MAleFasDsc);
         A14745MAleBarCod = T01WA3_A14745MAleBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14745MAleBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14745MAleBarCod), 8, 0));
         A14746MAleBarReo = T01WA3_A14746MAleBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14746MAleBarReo", GXutil.str( A14746MAleBarReo, 1, 0));
         A14747MAleBarPar = T01WA3_A14747MAleBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14747MAleBarPar", A14747MAleBarPar);
         A14739MAleHdr = T01WA3_A14739MAleHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14739MAleHdr", A14739MAleHdr);
         A14736MAleHdr2 = T01WA3_A14736MAleHdr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14736MAleHdr2", A14736MAleHdr2);
         A14726MAleParCod = T01WA3_A14726MAleParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14726MAleParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14726MAleParCod), 4, 0));
         A14740MAleParDsc = T01WA3_A14740MAleParDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14740MAleParDsc", A14740MAleParDsc);
         A14743MAlePLC = T01WA3_A14743MAlePLC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14743MAlePLC", A14743MAlePLC);
         A14741MAleOrd = T01WA3_A14741MAleOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14741MAleOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14741MAleOrd), 4, 0));
         A14742MAleLin = T01WA3_A14742MAleLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14742MAleLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14742MAleLin), 12, 0));
         A14678MAleFec = T01WA3_A14678MAleFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14678MAleFec", localUtil.ttoc( A14678MAleFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14728MAleVal = T01WA3_A14728MAleVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14728MAleVal", A14728MAleVal);
         A14733MAleValMin = T01WA3_A14733MAleValMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14733MAleValMin", A14733MAleValMin);
         A14734MAleValMax = T01WA3_A14734MAleValMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14734MAleValMax", A14734MAleValMax);
         A14727MAleEr = T01WA3_A14727MAleEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14727MAleEr", A14727MAleEr);
         A14744MAleFecEv = T01WA3_A14744MAleFecEv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14744MAleFecEv", localUtil.ttoc( A14744MAleFecEv, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14748MAleParId = T01WA3_A14748MAleParId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14748MAleParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14748MAleParId), 10, 0));
         A14729MAleUsu = T01WA3_A14729MAleUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14729MAleUsu", A14729MAleUsu);
         A14730MAleIp = T01WA3_A14730MAleIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14730MAleIp", A14730MAleIp);
         A14731MAleReg = T01WA3_A14731MAleReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14731MAleReg", localUtil.ttoc( A14731MAleReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14735MAleTkn = T01WA3_A14735MAleTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14735MAleTkn", A14735MAleTkn);
         Z14677MAleId = A14677MAleId ;
         sMode1922 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1WA1922( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1922 = (short)(0) ;
            initializeNonKey1WA1922( ) ;
         }
         Gx_mode = sMode1922 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1922 = (short)(0) ;
         initializeNonKey1WA1922( ) ;
         sMode1922 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1922 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1WA1922( ) ;
      if ( RcdFound1922 == 0 )
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
      RcdFound1922 = (short)(0) ;
      /* Using cursor T01WA6 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14677MAleId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01WA6_A14677MAleId[0] < A14677MAleId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01WA6_A14677MAleId[0] > A14677MAleId ) ) )
         {
            A14677MAleId = T01WA6_A14677MAleId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14677MAleId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14677MAleId), 10, 0));
            RcdFound1922 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1922 = (short)(0) ;
      /* Using cursor T01WA7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14677MAleId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01WA7_A14677MAleId[0] > A14677MAleId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01WA7_A14677MAleId[0] < A14677MAleId ) ) )
         {
            A14677MAleId = T01WA7_A14677MAleId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14677MAleId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14677MAleId), 10, 0));
            RcdFound1922 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1WA1922( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMAleId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1WA1922( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1922 == 1 )
         {
            if ( A14677MAleId != Z14677MAleId )
            {
               A14677MAleId = Z14677MAleId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14677MAleId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14677MAleId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MALEID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMAleId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMAleId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1WA1922( ) ;
               GX_FocusControl = edtMAleId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14677MAleId != Z14677MAleId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMAleId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1WA1922( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MALEID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMAleId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtMAleId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1WA1922( ) ;
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
      if ( A14677MAleId != Z14677MAleId )
      {
         A14677MAleId = Z14677MAleId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14677MAleId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14677MAleId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MALEID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMAleId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMAleId_Internalname ;
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
      if ( RcdFound1922 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "MALEID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMAleId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMAleEmprCo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1WA1922( ) ;
      if ( RcdFound1922 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMAleEmprCo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1WA1922( ) ;
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
      if ( RcdFound1922 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMAleEmprCo_Internalname ;
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
      if ( RcdFound1922 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMAleEmprCo_Internalname ;
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
      scanStart1WA1922( ) ;
      if ( RcdFound1922 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1922 != 0 )
         {
            scanNext1WA1922( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMAleEmprCo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1WA1922( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1WA1922( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01WA2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14677MAleId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAle"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14732MAleEmprCo, T01WA2_A14732MAleEmprCo[0]) != 0 ) || ( GXutil.strcmp(Z14724MAleMaqCod, T01WA2_A14724MAleMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z14737MAleMaqDsc, T01WA2_A14737MAleMaqDsc[0]) != 0 ) || ( GXutil.strcmp(Z14725MAleFasCod, T01WA2_A14725MAleFasCod[0]) != 0 ) || ( GXutil.strcmp(Z14738MAleFasDsc, T01WA2_A14738MAleFasDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14745MAleBarCod != T01WA2_A14745MAleBarCod[0] ) || ( Z14746MAleBarReo != T01WA2_A14746MAleBarReo[0] ) || ( GXutil.strcmp(Z14747MAleBarPar, T01WA2_A14747MAleBarPar[0]) != 0 ) || ( GXutil.strcmp(Z14739MAleHdr, T01WA2_A14739MAleHdr[0]) != 0 ) || ( GXutil.strcmp(Z14736MAleHdr2, T01WA2_A14736MAleHdr2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14726MAleParCod != T01WA2_A14726MAleParCod[0] ) || ( GXutil.strcmp(Z14740MAleParDsc, T01WA2_A14740MAleParDsc[0]) != 0 ) || ( GXutil.strcmp(Z14743MAlePLC, T01WA2_A14743MAlePLC[0]) != 0 ) || ( Z14741MAleOrd != T01WA2_A14741MAleOrd[0] ) || ( Z14742MAleLin != T01WA2_A14742MAleLin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z14678MAleFec, T01WA2_A14678MAleFec[0]) ) || ( GXutil.strcmp(Z14728MAleVal, T01WA2_A14728MAleVal[0]) != 0 ) || ( GXutil.strcmp(Z14733MAleValMin, T01WA2_A14733MAleValMin[0]) != 0 ) || ( GXutil.strcmp(Z14734MAleValMax, T01WA2_A14734MAleValMax[0]) != 0 ) || ( Z14727MAleEr != T01WA2_A14727MAleEr[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z14744MAleFecEv, T01WA2_A14744MAleFecEv[0]) ) || ( Z14748MAleParId != T01WA2_A14748MAleParId[0] ) || ( GXutil.strcmp(Z14729MAleUsu, T01WA2_A14729MAleUsu[0]) != 0 ) || ( GXutil.strcmp(Z14730MAleIp, T01WA2_A14730MAleIp[0]) != 0 ) || !( GXutil.dateCompare(Z14731MAleReg, T01WA2_A14731MAleReg[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14735MAleTkn, T01WA2_A14735MAleTkn[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z14732MAleEmprCo, T01WA2_A14732MAleEmprCo[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleEmprCo");
               GXutil.writeLogRaw("Old: ",Z14732MAleEmprCo);
               GXutil.writeLogRaw("Current: ",T01WA2_A14732MAleEmprCo[0]);
            }
            if ( GXutil.strcmp(Z14724MAleMaqCod, T01WA2_A14724MAleMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleMaqCod");
               GXutil.writeLogRaw("Old: ",Z14724MAleMaqCod);
               GXutil.writeLogRaw("Current: ",T01WA2_A14724MAleMaqCod[0]);
            }
            if ( GXutil.strcmp(Z14737MAleMaqDsc, T01WA2_A14737MAleMaqDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleMaqDsc");
               GXutil.writeLogRaw("Old: ",Z14737MAleMaqDsc);
               GXutil.writeLogRaw("Current: ",T01WA2_A14737MAleMaqDsc[0]);
            }
            if ( GXutil.strcmp(Z14725MAleFasCod, T01WA2_A14725MAleFasCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleFasCod");
               GXutil.writeLogRaw("Old: ",Z14725MAleFasCod);
               GXutil.writeLogRaw("Current: ",T01WA2_A14725MAleFasCod[0]);
            }
            if ( GXutil.strcmp(Z14738MAleFasDsc, T01WA2_A14738MAleFasDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleFasDsc");
               GXutil.writeLogRaw("Old: ",Z14738MAleFasDsc);
               GXutil.writeLogRaw("Current: ",T01WA2_A14738MAleFasDsc[0]);
            }
            if ( Z14745MAleBarCod != T01WA2_A14745MAleBarCod[0] )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleBarCod");
               GXutil.writeLogRaw("Old: ",Z14745MAleBarCod);
               GXutil.writeLogRaw("Current: ",T01WA2_A14745MAleBarCod[0]);
            }
            if ( Z14746MAleBarReo != T01WA2_A14746MAleBarReo[0] )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleBarReo");
               GXutil.writeLogRaw("Old: ",Z14746MAleBarReo);
               GXutil.writeLogRaw("Current: ",T01WA2_A14746MAleBarReo[0]);
            }
            if ( GXutil.strcmp(Z14747MAleBarPar, T01WA2_A14747MAleBarPar[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleBarPar");
               GXutil.writeLogRaw("Old: ",Z14747MAleBarPar);
               GXutil.writeLogRaw("Current: ",T01WA2_A14747MAleBarPar[0]);
            }
            if ( GXutil.strcmp(Z14739MAleHdr, T01WA2_A14739MAleHdr[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleHdr");
               GXutil.writeLogRaw("Old: ",Z14739MAleHdr);
               GXutil.writeLogRaw("Current: ",T01WA2_A14739MAleHdr[0]);
            }
            if ( GXutil.strcmp(Z14736MAleHdr2, T01WA2_A14736MAleHdr2[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleHdr2");
               GXutil.writeLogRaw("Old: ",Z14736MAleHdr2);
               GXutil.writeLogRaw("Current: ",T01WA2_A14736MAleHdr2[0]);
            }
            if ( Z14726MAleParCod != T01WA2_A14726MAleParCod[0] )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleParCod");
               GXutil.writeLogRaw("Old: ",Z14726MAleParCod);
               GXutil.writeLogRaw("Current: ",T01WA2_A14726MAleParCod[0]);
            }
            if ( GXutil.strcmp(Z14740MAleParDsc, T01WA2_A14740MAleParDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleParDsc");
               GXutil.writeLogRaw("Old: ",Z14740MAleParDsc);
               GXutil.writeLogRaw("Current: ",T01WA2_A14740MAleParDsc[0]);
            }
            if ( GXutil.strcmp(Z14743MAlePLC, T01WA2_A14743MAlePLC[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAlePLC");
               GXutil.writeLogRaw("Old: ",Z14743MAlePLC);
               GXutil.writeLogRaw("Current: ",T01WA2_A14743MAlePLC[0]);
            }
            if ( Z14741MAleOrd != T01WA2_A14741MAleOrd[0] )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleOrd");
               GXutil.writeLogRaw("Old: ",Z14741MAleOrd);
               GXutil.writeLogRaw("Current: ",T01WA2_A14741MAleOrd[0]);
            }
            if ( Z14742MAleLin != T01WA2_A14742MAleLin[0] )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleLin");
               GXutil.writeLogRaw("Old: ",Z14742MAleLin);
               GXutil.writeLogRaw("Current: ",T01WA2_A14742MAleLin[0]);
            }
            if ( !( GXutil.dateCompare(Z14678MAleFec, T01WA2_A14678MAleFec[0]) ) )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleFec");
               GXutil.writeLogRaw("Old: ",Z14678MAleFec);
               GXutil.writeLogRaw("Current: ",T01WA2_A14678MAleFec[0]);
            }
            if ( GXutil.strcmp(Z14728MAleVal, T01WA2_A14728MAleVal[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleVal");
               GXutil.writeLogRaw("Old: ",Z14728MAleVal);
               GXutil.writeLogRaw("Current: ",T01WA2_A14728MAleVal[0]);
            }
            if ( GXutil.strcmp(Z14733MAleValMin, T01WA2_A14733MAleValMin[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleValMin");
               GXutil.writeLogRaw("Old: ",Z14733MAleValMin);
               GXutil.writeLogRaw("Current: ",T01WA2_A14733MAleValMin[0]);
            }
            if ( GXutil.strcmp(Z14734MAleValMax, T01WA2_A14734MAleValMax[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleValMax");
               GXutil.writeLogRaw("Old: ",Z14734MAleValMax);
               GXutil.writeLogRaw("Current: ",T01WA2_A14734MAleValMax[0]);
            }
            if ( Z14727MAleEr != T01WA2_A14727MAleEr[0] )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleEr");
               GXutil.writeLogRaw("Old: ",Z14727MAleEr);
               GXutil.writeLogRaw("Current: ",T01WA2_A14727MAleEr[0]);
            }
            if ( !( GXutil.dateCompare(Z14744MAleFecEv, T01WA2_A14744MAleFecEv[0]) ) )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleFecEv");
               GXutil.writeLogRaw("Old: ",Z14744MAleFecEv);
               GXutil.writeLogRaw("Current: ",T01WA2_A14744MAleFecEv[0]);
            }
            if ( Z14748MAleParId != T01WA2_A14748MAleParId[0] )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleParId");
               GXutil.writeLogRaw("Old: ",Z14748MAleParId);
               GXutil.writeLogRaw("Current: ",T01WA2_A14748MAleParId[0]);
            }
            if ( GXutil.strcmp(Z14729MAleUsu, T01WA2_A14729MAleUsu[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleUsu");
               GXutil.writeLogRaw("Old: ",Z14729MAleUsu);
               GXutil.writeLogRaw("Current: ",T01WA2_A14729MAleUsu[0]);
            }
            if ( GXutil.strcmp(Z14730MAleIp, T01WA2_A14730MAleIp[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleIp");
               GXutil.writeLogRaw("Old: ",Z14730MAleIp);
               GXutil.writeLogRaw("Current: ",T01WA2_A14730MAleIp[0]);
            }
            if ( !( GXutil.dateCompare(Z14731MAleReg, T01WA2_A14731MAleReg[0]) ) )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleReg");
               GXutil.writeLogRaw("Old: ",Z14731MAleReg);
               GXutil.writeLogRaw("Current: ",T01WA2_A14731MAleReg[0]);
            }
            if ( GXutil.strcmp(Z14735MAleTkn, T01WA2_A14735MAleTkn[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.male:[seudo value changed for attri]"+"MAleTkn");
               GXutil.writeLogRaw("Old: ",Z14735MAleTkn);
               GXutil.writeLogRaw("Current: ",T01WA2_A14735MAleTkn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"MAle"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1WA1922( )
   {
      beforeValidate1WA1922( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1WA1922( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1WA1922( 0) ;
         checkOptimisticConcurrency1WA1922( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1WA1922( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1WA1922( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01WA8 */
                  pr_default.execute(6, new Object[] {A14732MAleEmprCo, A14724MAleMaqCod, A14737MAleMaqDsc, A14725MAleFasCod, A14738MAleFasDsc, Integer.valueOf(A14745MAleBarCod), Byte.valueOf(A14746MAleBarReo), A14747MAleBarPar, A14739MAleHdr, A14736MAleHdr2, Short.valueOf(A14726MAleParCod), A14740MAleParDsc, A14743MAlePLC, Short.valueOf(A14741MAleOrd), Long.valueOf(A14742MAleLin), A14678MAleFec, A14728MAleVal, A14733MAleValMin, A14734MAleValMax, Boolean.valueOf(A14727MAleEr), A14744MAleFecEv, Long.valueOf(A14748MAleParId), A14729MAleUsu, A14730MAleIp, A14731MAleReg, A14735MAleTkn});
                  /* Retrieving last key number assigned */
                  /* Using cursor T01WA9 */
                  pr_default.execute(7);
                  A14677MAleId = T01WA9_A14677MAleId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14677MAleId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14677MAleId), 10, 0));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAle");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1WA0( ) ;
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
            load1WA1922( ) ;
         }
         endLevel1WA1922( ) ;
      }
      closeExtendedTableCursors1WA1922( ) ;
   }

   public void update1WA1922( )
   {
      beforeValidate1WA1922( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1WA1922( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1WA1922( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1WA1922( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1WA1922( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01WA10 */
                  pr_default.execute(8, new Object[] {A14732MAleEmprCo, A14724MAleMaqCod, A14737MAleMaqDsc, A14725MAleFasCod, A14738MAleFasDsc, Integer.valueOf(A14745MAleBarCod), Byte.valueOf(A14746MAleBarReo), A14747MAleBarPar, A14739MAleHdr, A14736MAleHdr2, Short.valueOf(A14726MAleParCod), A14740MAleParDsc, A14743MAlePLC, Short.valueOf(A14741MAleOrd), Long.valueOf(A14742MAleLin), A14678MAleFec, A14728MAleVal, A14733MAleValMin, A14734MAleValMax, Boolean.valueOf(A14727MAleEr), A14744MAleFecEv, Long.valueOf(A14748MAleParId), A14729MAleUsu, A14730MAleIp, A14731MAleReg, A14735MAleTkn, Long.valueOf(A14677MAleId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAle");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAle"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1WA1922( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1WA0( ) ;
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
         endLevel1WA1922( ) ;
      }
      closeExtendedTableCursors1WA1922( ) ;
   }

   public void deferredUpdate1WA1922( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1WA1922( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1WA1922( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1WA1922( ) ;
         afterConfirm1WA1922( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1WA1922( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01WA11 */
               pr_default.execute(9, new Object[] {Long.valueOf(A14677MAleId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("MAle");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1922 == 0 )
                     {
                        initAll1WA1922( ) ;
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
                     resetCaption1WA0( ) ;
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
      sMode1922 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1WA1922( ) ;
      Gx_mode = sMode1922 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1WA1922( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1WA1922( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1WA1922( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.male");
         if ( AnyError == 0 )
         {
            confirmValues1WA0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ingenieria.male");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1WA1922( )
   {
      /* Using cursor T01WA12 */
      pr_default.execute(10);
      RcdFound1922 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1922 = (short)(1) ;
         A14677MAleId = T01WA12_A14677MAleId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14677MAleId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14677MAleId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1WA1922( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1922 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1922 = (short)(1) ;
         A14677MAleId = T01WA12_A14677MAleId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14677MAleId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14677MAleId), 10, 0));
      }
   }

   public void scanEnd1WA1922( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1WA1922( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1WA1922( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1WA1922( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1WA1922( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1WA1922( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1WA1922( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1WA1922( )
   {
      edtMAleId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleId_Enabled), 5, 0), true);
      edtMAleEmprCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleEmprCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleEmprCo_Enabled), 5, 0), true);
      edtMAleMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleMaqCod_Enabled), 5, 0), true);
      edtMAleMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleMaqDsc_Enabled), 5, 0), true);
      edtMAleFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleFasCod_Enabled), 5, 0), true);
      edtMAleFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleFasDsc_Enabled), 5, 0), true);
      edtMAleBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleBarCod_Enabled), 5, 0), true);
      edtMAleBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleBarReo_Enabled), 5, 0), true);
      edtMAleBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleBarPar_Enabled), 5, 0), true);
      edtMAleHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleHdr_Enabled), 5, 0), true);
      edtMAleHdr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleHdr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleHdr2_Enabled), 5, 0), true);
      edtMAleParCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleParCod_Enabled), 5, 0), true);
      edtMAleParDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleParDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleParDsc_Enabled), 5, 0), true);
      edtMAlePLC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAlePLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAlePLC_Enabled), 5, 0), true);
      edtMAleOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleOrd_Enabled), 5, 0), true);
      edtMAleLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleLin_Enabled), 5, 0), true);
      edtMAleFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleFec_Enabled), 5, 0), true);
      edtMAleVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleVal_Enabled), 5, 0), true);
      edtMAleValMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleValMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleValMin_Enabled), 5, 0), true);
      edtMAleValMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleValMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleValMax_Enabled), 5, 0), true);
      chkMAleEr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkMAleEr.getInternalname(), "Enabled", GXutil.ltrimstr( chkMAleEr.getEnabled(), 5, 0), true);
      edtMAleFecEv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleFecEv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleFecEv_Enabled), 5, 0), true);
      edtMAleParId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleParId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleParId_Enabled), 5, 0), true);
      edtMAleUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleUsu_Enabled), 5, 0), true);
      edtMAleIp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleIp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleIp_Enabled), 5, 0), true);
      edtMAleReg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleReg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleReg_Enabled), 5, 0), true);
      edtMAleTkn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAleTkn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAleTkn_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1WA1922( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1WA0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.male", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14677MAleId", GXutil.ltrim( localUtil.ntoc( Z14677MAleId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14732MAleEmprCo", GXutil.rtrim( Z14732MAleEmprCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14724MAleMaqCod", GXutil.rtrim( Z14724MAleMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14737MAleMaqDsc", Z14737MAleMaqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14725MAleFasCod", GXutil.rtrim( Z14725MAleFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14738MAleFasDsc", Z14738MAleFasDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14745MAleBarCod", GXutil.ltrim( localUtil.ntoc( Z14745MAleBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14746MAleBarReo", GXutil.ltrim( localUtil.ntoc( Z14746MAleBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14747MAleBarPar", GXutil.rtrim( Z14747MAleBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14739MAleHdr", GXutil.rtrim( Z14739MAleHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14736MAleHdr2", Z14736MAleHdr2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14726MAleParCod", GXutil.ltrim( localUtil.ntoc( Z14726MAleParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14740MAleParDsc", Z14740MAleParDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14743MAlePLC", Z14743MAlePLC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14741MAleOrd", GXutil.ltrim( localUtil.ntoc( Z14741MAleOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14742MAleLin", GXutil.ltrim( localUtil.ntoc( Z14742MAleLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14678MAleFec", localUtil.ttoc( Z14678MAleFec, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14728MAleVal", GXutil.rtrim( Z14728MAleVal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14733MAleValMin", GXutil.rtrim( Z14733MAleValMin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14734MAleValMax", GXutil.rtrim( Z14734MAleValMax));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "Z14727MAleEr", Z14727MAleEr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14744MAleFecEv", localUtil.ttoc( Z14744MAleFecEv, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14748MAleParId", GXutil.ltrim( localUtil.ntoc( Z14748MAleParId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14729MAleUsu", GXutil.rtrim( Z14729MAleUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14730MAleIp", Z14730MAleIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14731MAleReg", localUtil.ttoc( Z14731MAleReg, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14735MAleTkn", Z14735MAleTkn);
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
      return formatLink("app.ingenieria.male", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.MAle" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "M Alertas Ingenieria", "") ;
   }

   public void initializeNonKey1WA1922( )
   {
      A14732MAleEmprCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14732MAleEmprCo", A14732MAleEmprCo);
      A14724MAleMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14724MAleMaqCod", A14724MAleMaqCod);
      A14737MAleMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14737MAleMaqDsc", A14737MAleMaqDsc);
      A14725MAleFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14725MAleFasCod", A14725MAleFasCod);
      A14738MAleFasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14738MAleFasDsc", A14738MAleFasDsc);
      A14745MAleBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14745MAleBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14745MAleBarCod), 8, 0));
      A14746MAleBarReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14746MAleBarReo", GXutil.str( A14746MAleBarReo, 1, 0));
      A14747MAleBarPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14747MAleBarPar", A14747MAleBarPar);
      A14739MAleHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14739MAleHdr", A14739MAleHdr);
      A14736MAleHdr2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14736MAleHdr2", A14736MAleHdr2);
      A14726MAleParCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14726MAleParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14726MAleParCod), 4, 0));
      A14740MAleParDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14740MAleParDsc", A14740MAleParDsc);
      A14743MAlePLC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14743MAlePLC", A14743MAlePLC);
      A14741MAleOrd = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14741MAleOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14741MAleOrd), 4, 0));
      A14742MAleLin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14742MAleLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14742MAleLin), 12, 0));
      A14678MAleFec = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14678MAleFec", localUtil.ttoc( A14678MAleFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14728MAleVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14728MAleVal", A14728MAleVal);
      A14733MAleValMin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14733MAleValMin", A14733MAleValMin);
      A14734MAleValMax = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14734MAleValMax", A14734MAleValMax);
      A14727MAleEr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14727MAleEr", A14727MAleEr);
      A14744MAleFecEv = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14744MAleFecEv", localUtil.ttoc( A14744MAleFecEv, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14748MAleParId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14748MAleParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14748MAleParId), 10, 0));
      A14729MAleUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14729MAleUsu", A14729MAleUsu);
      A14730MAleIp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14730MAleIp", A14730MAleIp);
      A14731MAleReg = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14731MAleReg", localUtil.ttoc( A14731MAleReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14735MAleTkn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14735MAleTkn", A14735MAleTkn);
      Z14732MAleEmprCo = "" ;
      Z14724MAleMaqCod = "" ;
      Z14737MAleMaqDsc = "" ;
      Z14725MAleFasCod = "" ;
      Z14738MAleFasDsc = "" ;
      Z14745MAleBarCod = 0 ;
      Z14746MAleBarReo = (byte)(0) ;
      Z14747MAleBarPar = "" ;
      Z14739MAleHdr = "" ;
      Z14736MAleHdr2 = "" ;
      Z14726MAleParCod = (short)(0) ;
      Z14740MAleParDsc = "" ;
      Z14743MAlePLC = "" ;
      Z14741MAleOrd = (short)(0) ;
      Z14742MAleLin = 0 ;
      Z14678MAleFec = GXutil.resetTime( GXutil.nullDate() );
      Z14728MAleVal = "" ;
      Z14733MAleValMin = "" ;
      Z14734MAleValMax = "" ;
      Z14727MAleEr = false ;
      Z14744MAleFecEv = GXutil.resetTime( GXutil.nullDate() );
      Z14748MAleParId = 0 ;
      Z14729MAleUsu = "" ;
      Z14730MAleIp = "" ;
      Z14731MAleReg = GXutil.resetTime( GXutil.nullDate() );
      Z14735MAleTkn = "" ;
   }

   public void initAll1WA1922( )
   {
      A14677MAleId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14677MAleId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14677MAleId), 10, 0));
      initializeNonKey1WA1922( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267101110533", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/male.js", "?20267101110533", false, true);
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
      edtMAleId_Internalname = "MALEID" ;
      edtMAleEmprCo_Internalname = "MALEEMPRCO" ;
      edtMAleMaqCod_Internalname = "MALEMAQCOD" ;
      edtMAleMaqDsc_Internalname = "MALEMAQDSC" ;
      edtMAleFasCod_Internalname = "MALEFASCOD" ;
      edtMAleFasDsc_Internalname = "MALEFASDSC" ;
      edtMAleBarCod_Internalname = "MALEBARCOD" ;
      edtMAleBarReo_Internalname = "MALEBARREO" ;
      edtMAleBarPar_Internalname = "MALEBARPAR" ;
      edtMAleHdr_Internalname = "MALEHDR" ;
      edtMAleHdr2_Internalname = "MALEHDR2" ;
      edtMAleParCod_Internalname = "MALEPARCOD" ;
      edtMAleParDsc_Internalname = "MALEPARDSC" ;
      edtMAlePLC_Internalname = "MALEPLC" ;
      edtMAleOrd_Internalname = "MALEORD" ;
      edtMAleLin_Internalname = "MALELIN" ;
      edtMAleFec_Internalname = "MALEFEC" ;
      edtMAleVal_Internalname = "MALEVAL" ;
      edtMAleValMin_Internalname = "MALEVALMIN" ;
      edtMAleValMax_Internalname = "MALEVALMAX" ;
      chkMAleEr.setInternalname( "MALEER" );
      edtMAleFecEv_Internalname = "MALEFECEV" ;
      edtMAleParId_Internalname = "MALEPARID" ;
      edtMAleUsu_Internalname = "MALEUSU" ;
      edtMAleIp_Internalname = "MALEIP" ;
      edtMAleReg_Internalname = "MALEREG" ;
      edtMAleTkn_Internalname = "MALETKN" ;
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
      Form.setCaption( httpContext.getMessage( "M Alertas Ingenieria", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMAleTkn_Enabled = 1 ;
      edtMAleReg_Jsonclick = "" ;
      edtMAleReg_Enabled = 1 ;
      edtMAleIp_Jsonclick = "" ;
      edtMAleIp_Enabled = 1 ;
      edtMAleUsu_Jsonclick = "" ;
      edtMAleUsu_Enabled = 1 ;
      edtMAleParId_Jsonclick = "" ;
      edtMAleParId_Enabled = 1 ;
      edtMAleFecEv_Jsonclick = "" ;
      edtMAleFecEv_Enabled = 1 ;
      chkMAleEr.setEnabled( 1 );
      edtMAleValMax_Jsonclick = "" ;
      edtMAleValMax_Enabled = 1 ;
      edtMAleValMin_Jsonclick = "" ;
      edtMAleValMin_Enabled = 1 ;
      edtMAleVal_Jsonclick = "" ;
      edtMAleVal_Enabled = 1 ;
      edtMAleFec_Jsonclick = "" ;
      edtMAleFec_Enabled = 1 ;
      edtMAleLin_Jsonclick = "" ;
      edtMAleLin_Enabled = 1 ;
      edtMAleOrd_Jsonclick = "" ;
      edtMAleOrd_Enabled = 1 ;
      edtMAlePLC_Jsonclick = "" ;
      edtMAlePLC_Enabled = 1 ;
      edtMAleParDsc_Jsonclick = "" ;
      edtMAleParDsc_Enabled = 1 ;
      edtMAleParCod_Jsonclick = "" ;
      edtMAleParCod_Enabled = 1 ;
      edtMAleHdr2_Jsonclick = "" ;
      edtMAleHdr2_Enabled = 1 ;
      edtMAleHdr_Jsonclick = "" ;
      edtMAleHdr_Enabled = 1 ;
      edtMAleBarPar_Jsonclick = "" ;
      edtMAleBarPar_Enabled = 1 ;
      edtMAleBarReo_Jsonclick = "" ;
      edtMAleBarReo_Enabled = 1 ;
      edtMAleBarCod_Jsonclick = "" ;
      edtMAleBarCod_Enabled = 1 ;
      edtMAleFasDsc_Jsonclick = "" ;
      edtMAleFasDsc_Enabled = 1 ;
      edtMAleFasCod_Jsonclick = "" ;
      edtMAleFasCod_Enabled = 1 ;
      edtMAleMaqDsc_Jsonclick = "" ;
      edtMAleMaqDsc_Enabled = 1 ;
      edtMAleMaqCod_Jsonclick = "" ;
      edtMAleMaqCod_Enabled = 1 ;
      edtMAleEmprCo_Jsonclick = "" ;
      edtMAleEmprCo_Enabled = 1 ;
      edtMAleId_Jsonclick = "" ;
      edtMAleId_Enabled = 1 ;
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
      chkMAleEr.setName( "MALEER" );
      chkMAleEr.setWebtags( "" );
      chkMAleEr.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkMAleEr.getInternalname(), "TitleCaption", chkMAleEr.getCaption(), true);
      chkMAleEr.setCheckedValue( "false" );
      A14727MAleEr = GXutil.strtobool( GXutil.booltostr( A14727MAleEr)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14727MAleEr", A14727MAleEr);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      GX_FocusControl = edtMAleEmprCo_Internalname ;
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

   public void valid_Maleid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A14727MAleEr = GXutil.strtobool( GXutil.booltostr( A14727MAleEr)) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14732MAleEmprCo", GXutil.rtrim( A14732MAleEmprCo));
      httpContext.ajax_rsp_assign_attri("", false, "A14724MAleMaqCod", GXutil.rtrim( A14724MAleMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14737MAleMaqDsc", A14737MAleMaqDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14725MAleFasCod", GXutil.rtrim( A14725MAleFasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14738MAleFasDsc", A14738MAleFasDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14745MAleBarCod", GXutil.ltrim( localUtil.ntoc( A14745MAleBarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14746MAleBarReo", GXutil.ltrim( localUtil.ntoc( A14746MAleBarReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14747MAleBarPar", GXutil.rtrim( A14747MAleBarPar));
      httpContext.ajax_rsp_assign_attri("", false, "A14739MAleHdr", GXutil.rtrim( A14739MAleHdr));
      httpContext.ajax_rsp_assign_attri("", false, "A14736MAleHdr2", A14736MAleHdr2);
      httpContext.ajax_rsp_assign_attri("", false, "A14726MAleParCod", GXutil.ltrim( localUtil.ntoc( A14726MAleParCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14740MAleParDsc", A14740MAleParDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14743MAlePLC", A14743MAlePLC);
      httpContext.ajax_rsp_assign_attri("", false, "A14741MAleOrd", GXutil.ltrim( localUtil.ntoc( A14741MAleOrd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14742MAleLin", GXutil.ltrim( localUtil.ntoc( A14742MAleLin, (byte)(12), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14678MAleFec", localUtil.ttoc( A14678MAleFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14728MAleVal", GXutil.rtrim( A14728MAleVal));
      httpContext.ajax_rsp_assign_attri("", false, "A14733MAleValMin", GXutil.rtrim( A14733MAleValMin));
      httpContext.ajax_rsp_assign_attri("", false, "A14734MAleValMax", GXutil.rtrim( A14734MAleValMax));
      httpContext.ajax_rsp_assign_attri("", false, "A14727MAleEr", A14727MAleEr);
      httpContext.ajax_rsp_assign_attri("", false, "A14744MAleFecEv", localUtil.ttoc( A14744MAleFecEv, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14748MAleParId", GXutil.ltrim( localUtil.ntoc( A14748MAleParId, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14729MAleUsu", GXutil.rtrim( A14729MAleUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A14730MAleIp", A14730MAleIp);
      httpContext.ajax_rsp_assign_attri("", false, "A14731MAleReg", localUtil.ttoc( A14731MAleReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14735MAleTkn", A14735MAleTkn);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14677MAleId", GXutil.ltrim( localUtil.ntoc( Z14677MAleId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14732MAleEmprCo", GXutil.rtrim( Z14732MAleEmprCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14724MAleMaqCod", GXutil.rtrim( Z14724MAleMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14737MAleMaqDsc", Z14737MAleMaqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14725MAleFasCod", GXutil.rtrim( Z14725MAleFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14738MAleFasDsc", Z14738MAleFasDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14745MAleBarCod", GXutil.ltrim( localUtil.ntoc( Z14745MAleBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14746MAleBarReo", GXutil.ltrim( localUtil.ntoc( Z14746MAleBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14747MAleBarPar", GXutil.rtrim( Z14747MAleBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14739MAleHdr", GXutil.rtrim( Z14739MAleHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14736MAleHdr2", Z14736MAleHdr2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14726MAleParCod", GXutil.ltrim( localUtil.ntoc( Z14726MAleParCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14740MAleParDsc", Z14740MAleParDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14743MAlePLC", Z14743MAlePLC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14741MAleOrd", GXutil.ltrim( localUtil.ntoc( Z14741MAleOrd, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14742MAleLin", GXutil.ltrim( localUtil.ntoc( Z14742MAleLin, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14678MAleFec", localUtil.ttoc( Z14678MAleFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14728MAleVal", GXutil.rtrim( Z14728MAleVal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14733MAleValMin", GXutil.rtrim( Z14733MAleValMin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14734MAleValMax", GXutil.rtrim( Z14734MAleValMax));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14727MAleEr", GXutil.booltostr( Z14727MAleEr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14744MAleFecEv", localUtil.ttoc( Z14744MAleFecEv, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14748MAleParId", GXutil.ltrim( localUtil.ntoc( Z14748MAleParId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14729MAleUsu", GXutil.rtrim( Z14729MAleUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14730MAleIp", Z14730MAleIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14731MAleReg", localUtil.ttoc( Z14731MAleReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14735MAleTkn", Z14735MAleTkn);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A14727MAleEr',fld:'MALEER',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A14727MAleEr',fld:'MALEER',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A14727MAleEr',fld:'MALEER',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A14727MAleEr',fld:'MALEER',pic:''}]}");
      setEventMetadata("VALID_MALEID","{handler:'valid_Maleid',iparms:[{av:'A14677MAleId',fld:'MALEID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A14727MAleEr',fld:'MALEER',pic:''}]");
      setEventMetadata("VALID_MALEID",",oparms:[{av:'A14732MAleEmprCo',fld:'MALEEMPRCO',pic:''},{av:'A14724MAleMaqCod',fld:'MALEMAQCOD',pic:''},{av:'A14737MAleMaqDsc',fld:'MALEMAQDSC',pic:''},{av:'A14725MAleFasCod',fld:'MALEFASCOD',pic:''},{av:'A14738MAleFasDsc',fld:'MALEFASDSC',pic:''},{av:'A14745MAleBarCod',fld:'MALEBARCOD',pic:'ZZZZZZZ9'},{av:'A14746MAleBarReo',fld:'MALEBARREO',pic:'9'},{av:'A14747MAleBarPar',fld:'MALEBARPAR',pic:''},{av:'A14739MAleHdr',fld:'MALEHDR',pic:''},{av:'A14736MAleHdr2',fld:'MALEHDR2',pic:''},{av:'A14726MAleParCod',fld:'MALEPARCOD',pic:'ZZZ9'},{av:'A14740MAleParDsc',fld:'MALEPARDSC',pic:''},{av:'A14743MAlePLC',fld:'MALEPLC',pic:''},{av:'A14741MAleOrd',fld:'MALEORD',pic:'ZZZ9'},{av:'A14742MAleLin',fld:'MALELIN',pic:'ZZZZZZZZZZZ9'},{av:'A14678MAleFec',fld:'MALEFEC',pic:'99/99/99 99:99:99.999'},{av:'A14728MAleVal',fld:'MALEVAL',pic:''},{av:'A14733MAleValMin',fld:'MALEVALMIN',pic:''},{av:'A14734MAleValMax',fld:'MALEVALMAX',pic:''},{av:'A14744MAleFecEv',fld:'MALEFECEV',pic:'99/99/99 99:99:99.999'},{av:'A14748MAleParId',fld:'MALEPARID',pic:'ZZZZZZZZZ9'},{av:'A14729MAleUsu',fld:'MALEUSU',pic:''},{av:'A14730MAleIp',fld:'MALEIP',pic:''},{av:'A14731MAleReg',fld:'MALEREG',pic:'99/99/99 99:99:99.999'},{av:'A14735MAleTkn',fld:'MALETKN',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14677MAleId'},{av:'Z14732MAleEmprCo'},{av:'Z14724MAleMaqCod'},{av:'Z14737MAleMaqDsc'},{av:'Z14725MAleFasCod'},{av:'Z14738MAleFasDsc'},{av:'Z14745MAleBarCod'},{av:'Z14746MAleBarReo'},{av:'Z14747MAleBarPar'},{av:'Z14739MAleHdr'},{av:'Z14736MAleHdr2'},{av:'Z14726MAleParCod'},{av:'Z14740MAleParDsc'},{av:'Z14743MAlePLC'},{av:'Z14741MAleOrd'},{av:'Z14742MAleLin'},{av:'Z14678MAleFec'},{av:'Z14728MAleVal'},{av:'Z14733MAleValMin'},{av:'Z14734MAleValMax'},{av:'Z14727MAleEr'},{av:'Z14744MAleFecEv'},{av:'Z14748MAleParId'},{av:'Z14729MAleUsu'},{av:'Z14730MAleIp'},{av:'Z14731MAleReg'},{av:'Z14735MAleTkn'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{av:'A14727MAleEr',fld:'MALEER',pic:''}]}");
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
      Z14732MAleEmprCo = "" ;
      Z14724MAleMaqCod = "" ;
      Z14737MAleMaqDsc = "" ;
      Z14725MAleFasCod = "" ;
      Z14738MAleFasDsc = "" ;
      Z14747MAleBarPar = "" ;
      Z14739MAleHdr = "" ;
      Z14736MAleHdr2 = "" ;
      Z14740MAleParDsc = "" ;
      Z14743MAlePLC = "" ;
      Z14678MAleFec = GXutil.resetTime( GXutil.nullDate() );
      Z14728MAleVal = "" ;
      Z14733MAleValMin = "" ;
      Z14734MAleValMax = "" ;
      Z14744MAleFecEv = GXutil.resetTime( GXutil.nullDate() );
      Z14729MAleUsu = "" ;
      Z14730MAleIp = "" ;
      Z14731MAleReg = GXutil.resetTime( GXutil.nullDate() );
      Z14735MAleTkn = "" ;
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
      A14732MAleEmprCo = "" ;
      A14724MAleMaqCod = "" ;
      A14737MAleMaqDsc = "" ;
      A14725MAleFasCod = "" ;
      A14738MAleFasDsc = "" ;
      A14747MAleBarPar = "" ;
      A14739MAleHdr = "" ;
      A14736MAleHdr2 = "" ;
      A14740MAleParDsc = "" ;
      A14743MAlePLC = "" ;
      A14678MAleFec = GXutil.resetTime( GXutil.nullDate() );
      A14728MAleVal = "" ;
      A14733MAleValMin = "" ;
      A14734MAleValMax = "" ;
      A14744MAleFecEv = GXutil.resetTime( GXutil.nullDate() );
      A14729MAleUsu = "" ;
      A14730MAleIp = "" ;
      A14731MAleReg = GXutil.resetTime( GXutil.nullDate() );
      A14735MAleTkn = "" ;
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
      T01WA4_A14677MAleId = new long[1] ;
      T01WA4_A14732MAleEmprCo = new String[] {""} ;
      T01WA4_A14724MAleMaqCod = new String[] {""} ;
      T01WA4_A14737MAleMaqDsc = new String[] {""} ;
      T01WA4_A14725MAleFasCod = new String[] {""} ;
      T01WA4_A14738MAleFasDsc = new String[] {""} ;
      T01WA4_A14745MAleBarCod = new int[1] ;
      T01WA4_A14746MAleBarReo = new byte[1] ;
      T01WA4_A14747MAleBarPar = new String[] {""} ;
      T01WA4_A14739MAleHdr = new String[] {""} ;
      T01WA4_A14736MAleHdr2 = new String[] {""} ;
      T01WA4_A14726MAleParCod = new short[1] ;
      T01WA4_A14740MAleParDsc = new String[] {""} ;
      T01WA4_A14743MAlePLC = new String[] {""} ;
      T01WA4_A14741MAleOrd = new short[1] ;
      T01WA4_A14742MAleLin = new long[1] ;
      T01WA4_A14678MAleFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01WA4_A14728MAleVal = new String[] {""} ;
      T01WA4_A14733MAleValMin = new String[] {""} ;
      T01WA4_A14734MAleValMax = new String[] {""} ;
      T01WA4_A14727MAleEr = new boolean[] {false} ;
      T01WA4_A14744MAleFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01WA4_A14748MAleParId = new long[1] ;
      T01WA4_A14729MAleUsu = new String[] {""} ;
      T01WA4_A14730MAleIp = new String[] {""} ;
      T01WA4_A14731MAleReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WA4_A14735MAleTkn = new String[] {""} ;
      T01WA5_A14677MAleId = new long[1] ;
      T01WA3_A14677MAleId = new long[1] ;
      T01WA3_A14732MAleEmprCo = new String[] {""} ;
      T01WA3_A14724MAleMaqCod = new String[] {""} ;
      T01WA3_A14737MAleMaqDsc = new String[] {""} ;
      T01WA3_A14725MAleFasCod = new String[] {""} ;
      T01WA3_A14738MAleFasDsc = new String[] {""} ;
      T01WA3_A14745MAleBarCod = new int[1] ;
      T01WA3_A14746MAleBarReo = new byte[1] ;
      T01WA3_A14747MAleBarPar = new String[] {""} ;
      T01WA3_A14739MAleHdr = new String[] {""} ;
      T01WA3_A14736MAleHdr2 = new String[] {""} ;
      T01WA3_A14726MAleParCod = new short[1] ;
      T01WA3_A14740MAleParDsc = new String[] {""} ;
      T01WA3_A14743MAlePLC = new String[] {""} ;
      T01WA3_A14741MAleOrd = new short[1] ;
      T01WA3_A14742MAleLin = new long[1] ;
      T01WA3_A14678MAleFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01WA3_A14728MAleVal = new String[] {""} ;
      T01WA3_A14733MAleValMin = new String[] {""} ;
      T01WA3_A14734MAleValMax = new String[] {""} ;
      T01WA3_A14727MAleEr = new boolean[] {false} ;
      T01WA3_A14744MAleFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01WA3_A14748MAleParId = new long[1] ;
      T01WA3_A14729MAleUsu = new String[] {""} ;
      T01WA3_A14730MAleIp = new String[] {""} ;
      T01WA3_A14731MAleReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WA3_A14735MAleTkn = new String[] {""} ;
      sMode1922 = "" ;
      T01WA6_A14677MAleId = new long[1] ;
      T01WA7_A14677MAleId = new long[1] ;
      T01WA2_A14677MAleId = new long[1] ;
      T01WA2_A14732MAleEmprCo = new String[] {""} ;
      T01WA2_A14724MAleMaqCod = new String[] {""} ;
      T01WA2_A14737MAleMaqDsc = new String[] {""} ;
      T01WA2_A14725MAleFasCod = new String[] {""} ;
      T01WA2_A14738MAleFasDsc = new String[] {""} ;
      T01WA2_A14745MAleBarCod = new int[1] ;
      T01WA2_A14746MAleBarReo = new byte[1] ;
      T01WA2_A14747MAleBarPar = new String[] {""} ;
      T01WA2_A14739MAleHdr = new String[] {""} ;
      T01WA2_A14736MAleHdr2 = new String[] {""} ;
      T01WA2_A14726MAleParCod = new short[1] ;
      T01WA2_A14740MAleParDsc = new String[] {""} ;
      T01WA2_A14743MAlePLC = new String[] {""} ;
      T01WA2_A14741MAleOrd = new short[1] ;
      T01WA2_A14742MAleLin = new long[1] ;
      T01WA2_A14678MAleFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01WA2_A14728MAleVal = new String[] {""} ;
      T01WA2_A14733MAleValMin = new String[] {""} ;
      T01WA2_A14734MAleValMax = new String[] {""} ;
      T01WA2_A14727MAleEr = new boolean[] {false} ;
      T01WA2_A14744MAleFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01WA2_A14748MAleParId = new long[1] ;
      T01WA2_A14729MAleUsu = new String[] {""} ;
      T01WA2_A14730MAleIp = new String[] {""} ;
      T01WA2_A14731MAleReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WA2_A14735MAleTkn = new String[] {""} ;
      T01WA9_A14677MAleId = new long[1] ;
      T01WA12_A14677MAleId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ14732MAleEmprCo = "" ;
      ZZ14724MAleMaqCod = "" ;
      ZZ14737MAleMaqDsc = "" ;
      ZZ14725MAleFasCod = "" ;
      ZZ14738MAleFasDsc = "" ;
      ZZ14747MAleBarPar = "" ;
      ZZ14739MAleHdr = "" ;
      ZZ14736MAleHdr2 = "" ;
      ZZ14740MAleParDsc = "" ;
      ZZ14743MAlePLC = "" ;
      ZZ14678MAleFec = GXutil.resetTime( GXutil.nullDate() );
      ZZ14728MAleVal = "" ;
      ZZ14733MAleValMin = "" ;
      ZZ14734MAleValMax = "" ;
      ZZ14744MAleFecEv = GXutil.resetTime( GXutil.nullDate() );
      ZZ14729MAleUsu = "" ;
      ZZ14730MAleIp = "" ;
      ZZ14731MAleReg = GXutil.resetTime( GXutil.nullDate() );
      ZZ14735MAleTkn = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.male__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.male__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.male__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.male__default(),
         new Object[] {
             new Object[] {
            T01WA2_A14677MAleId, T01WA2_A14732MAleEmprCo, T01WA2_A14724MAleMaqCod, T01WA2_A14737MAleMaqDsc, T01WA2_A14725MAleFasCod, T01WA2_A14738MAleFasDsc, T01WA2_A14745MAleBarCod, T01WA2_A14746MAleBarReo, T01WA2_A14747MAleBarPar, T01WA2_A14739MAleHdr,
            T01WA2_A14736MAleHdr2, T01WA2_A14726MAleParCod, T01WA2_A14740MAleParDsc, T01WA2_A14743MAlePLC, T01WA2_A14741MAleOrd, T01WA2_A14742MAleLin, T01WA2_A14678MAleFec, T01WA2_A14728MAleVal, T01WA2_A14733MAleValMin, T01WA2_A14734MAleValMax,
            T01WA2_A14727MAleEr, T01WA2_A14744MAleFecEv, T01WA2_A14748MAleParId, T01WA2_A14729MAleUsu, T01WA2_A14730MAleIp, T01WA2_A14731MAleReg, T01WA2_A14735MAleTkn
            }
            , new Object[] {
            T01WA3_A14677MAleId, T01WA3_A14732MAleEmprCo, T01WA3_A14724MAleMaqCod, T01WA3_A14737MAleMaqDsc, T01WA3_A14725MAleFasCod, T01WA3_A14738MAleFasDsc, T01WA3_A14745MAleBarCod, T01WA3_A14746MAleBarReo, T01WA3_A14747MAleBarPar, T01WA3_A14739MAleHdr,
            T01WA3_A14736MAleHdr2, T01WA3_A14726MAleParCod, T01WA3_A14740MAleParDsc, T01WA3_A14743MAlePLC, T01WA3_A14741MAleOrd, T01WA3_A14742MAleLin, T01WA3_A14678MAleFec, T01WA3_A14728MAleVal, T01WA3_A14733MAleValMin, T01WA3_A14734MAleValMax,
            T01WA3_A14727MAleEr, T01WA3_A14744MAleFecEv, T01WA3_A14748MAleParId, T01WA3_A14729MAleUsu, T01WA3_A14730MAleIp, T01WA3_A14731MAleReg, T01WA3_A14735MAleTkn
            }
            , new Object[] {
            T01WA4_A14677MAleId, T01WA4_A14732MAleEmprCo, T01WA4_A14724MAleMaqCod, T01WA4_A14737MAleMaqDsc, T01WA4_A14725MAleFasCod, T01WA4_A14738MAleFasDsc, T01WA4_A14745MAleBarCod, T01WA4_A14746MAleBarReo, T01WA4_A14747MAleBarPar, T01WA4_A14739MAleHdr,
            T01WA4_A14736MAleHdr2, T01WA4_A14726MAleParCod, T01WA4_A14740MAleParDsc, T01WA4_A14743MAlePLC, T01WA4_A14741MAleOrd, T01WA4_A14742MAleLin, T01WA4_A14678MAleFec, T01WA4_A14728MAleVal, T01WA4_A14733MAleValMin, T01WA4_A14734MAleValMax,
            T01WA4_A14727MAleEr, T01WA4_A14744MAleFecEv, T01WA4_A14748MAleParId, T01WA4_A14729MAleUsu, T01WA4_A14730MAleIp, T01WA4_A14731MAleReg, T01WA4_A14735MAleTkn
            }
            , new Object[] {
            T01WA5_A14677MAleId
            }
            , new Object[] {
            T01WA6_A14677MAleId
            }
            , new Object[] {
            T01WA7_A14677MAleId
            }
            , new Object[] {
            }
            , new Object[] {
            T01WA9_A14677MAleId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01WA12_A14677MAleId
            }
         }
      );
   }

   private byte Z14746MAleBarReo ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A14746MAleBarReo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ14746MAleBarReo ;
   private short Z14726MAleParCod ;
   private short Z14741MAleOrd ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14726MAleParCod ;
   private short A14741MAleOrd ;
   private short RcdFound1922 ;
   private short nIsDirty_1922 ;
   private short ZZ14726MAleParCod ;
   private short ZZ14741MAleOrd ;
   private int Z14745MAleBarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtMAleId_Enabled ;
   private int edtMAleEmprCo_Enabled ;
   private int edtMAleMaqCod_Enabled ;
   private int edtMAleMaqDsc_Enabled ;
   private int edtMAleFasCod_Enabled ;
   private int edtMAleFasDsc_Enabled ;
   private int A14745MAleBarCod ;
   private int edtMAleBarCod_Enabled ;
   private int edtMAleBarReo_Enabled ;
   private int edtMAleBarPar_Enabled ;
   private int edtMAleHdr_Enabled ;
   private int edtMAleHdr2_Enabled ;
   private int edtMAleParCod_Enabled ;
   private int edtMAleParDsc_Enabled ;
   private int edtMAlePLC_Enabled ;
   private int edtMAleOrd_Enabled ;
   private int edtMAleLin_Enabled ;
   private int edtMAleFec_Enabled ;
   private int edtMAleVal_Enabled ;
   private int edtMAleValMin_Enabled ;
   private int edtMAleValMax_Enabled ;
   private int edtMAleFecEv_Enabled ;
   private int edtMAleParId_Enabled ;
   private int edtMAleUsu_Enabled ;
   private int edtMAleIp_Enabled ;
   private int edtMAleReg_Enabled ;
   private int edtMAleTkn_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ14745MAleBarCod ;
   private long Z14677MAleId ;
   private long Z14742MAleLin ;
   private long Z14748MAleParId ;
   private long A14677MAleId ;
   private long A14742MAleLin ;
   private long A14748MAleParId ;
   private long ZZ14677MAleId ;
   private long ZZ14742MAleLin ;
   private long ZZ14748MAleParId ;
   private String sPrefix ;
   private String Z14732MAleEmprCo ;
   private String Z14724MAleMaqCod ;
   private String Z14725MAleFasCod ;
   private String Z14747MAleBarPar ;
   private String Z14739MAleHdr ;
   private String Z14728MAleVal ;
   private String Z14733MAleValMin ;
   private String Z14734MAleValMax ;
   private String Z14729MAleUsu ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMAleId_Internalname ;
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
   private String edtMAleId_Jsonclick ;
   private String edtMAleEmprCo_Internalname ;
   private String A14732MAleEmprCo ;
   private String edtMAleEmprCo_Jsonclick ;
   private String edtMAleMaqCod_Internalname ;
   private String A14724MAleMaqCod ;
   private String edtMAleMaqCod_Jsonclick ;
   private String edtMAleMaqDsc_Internalname ;
   private String edtMAleMaqDsc_Jsonclick ;
   private String edtMAleFasCod_Internalname ;
   private String A14725MAleFasCod ;
   private String edtMAleFasCod_Jsonclick ;
   private String edtMAleFasDsc_Internalname ;
   private String edtMAleFasDsc_Jsonclick ;
   private String edtMAleBarCod_Internalname ;
   private String edtMAleBarCod_Jsonclick ;
   private String edtMAleBarReo_Internalname ;
   private String edtMAleBarReo_Jsonclick ;
   private String edtMAleBarPar_Internalname ;
   private String A14747MAleBarPar ;
   private String edtMAleBarPar_Jsonclick ;
   private String edtMAleHdr_Internalname ;
   private String A14739MAleHdr ;
   private String edtMAleHdr_Jsonclick ;
   private String edtMAleHdr2_Internalname ;
   private String edtMAleHdr2_Jsonclick ;
   private String edtMAleParCod_Internalname ;
   private String edtMAleParCod_Jsonclick ;
   private String edtMAleParDsc_Internalname ;
   private String edtMAleParDsc_Jsonclick ;
   private String edtMAlePLC_Internalname ;
   private String edtMAlePLC_Jsonclick ;
   private String edtMAleOrd_Internalname ;
   private String edtMAleOrd_Jsonclick ;
   private String edtMAleLin_Internalname ;
   private String edtMAleLin_Jsonclick ;
   private String edtMAleFec_Internalname ;
   private String edtMAleFec_Jsonclick ;
   private String edtMAleVal_Internalname ;
   private String A14728MAleVal ;
   private String edtMAleVal_Jsonclick ;
   private String edtMAleValMin_Internalname ;
   private String A14733MAleValMin ;
   private String edtMAleValMin_Jsonclick ;
   private String edtMAleValMax_Internalname ;
   private String A14734MAleValMax ;
   private String edtMAleValMax_Jsonclick ;
   private String edtMAleFecEv_Internalname ;
   private String edtMAleFecEv_Jsonclick ;
   private String edtMAleParId_Internalname ;
   private String edtMAleParId_Jsonclick ;
   private String edtMAleUsu_Internalname ;
   private String A14729MAleUsu ;
   private String edtMAleUsu_Jsonclick ;
   private String edtMAleIp_Internalname ;
   private String edtMAleIp_Jsonclick ;
   private String edtMAleReg_Internalname ;
   private String edtMAleReg_Jsonclick ;
   private String edtMAleTkn_Internalname ;
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
   private String sMode1922 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ14732MAleEmprCo ;
   private String ZZ14724MAleMaqCod ;
   private String ZZ14725MAleFasCod ;
   private String ZZ14747MAleBarPar ;
   private String ZZ14739MAleHdr ;
   private String ZZ14728MAleVal ;
   private String ZZ14733MAleValMin ;
   private String ZZ14734MAleValMax ;
   private String ZZ14729MAleUsu ;
   private java.util.Date Z14678MAleFec ;
   private java.util.Date Z14744MAleFecEv ;
   private java.util.Date Z14731MAleReg ;
   private java.util.Date A14678MAleFec ;
   private java.util.Date A14744MAleFecEv ;
   private java.util.Date A14731MAleReg ;
   private java.util.Date ZZ14678MAleFec ;
   private java.util.Date ZZ14744MAleFecEv ;
   private java.util.Date ZZ14731MAleReg ;
   private boolean Z14727MAleEr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean A14727MAleEr ;
   private boolean Gx_longc ;
   private boolean ZZ14727MAleEr ;
   private String Z14737MAleMaqDsc ;
   private String Z14738MAleFasDsc ;
   private String Z14736MAleHdr2 ;
   private String Z14740MAleParDsc ;
   private String Z14743MAlePLC ;
   private String Z14730MAleIp ;
   private String Z14735MAleTkn ;
   private String A14737MAleMaqDsc ;
   private String A14738MAleFasDsc ;
   private String A14736MAleHdr2 ;
   private String A14740MAleParDsc ;
   private String A14743MAlePLC ;
   private String A14730MAleIp ;
   private String A14735MAleTkn ;
   private String ZZ14737MAleMaqDsc ;
   private String ZZ14738MAleFasDsc ;
   private String ZZ14736MAleHdr2 ;
   private String ZZ14740MAleParDsc ;
   private String ZZ14743MAlePLC ;
   private String ZZ14730MAleIp ;
   private String ZZ14735MAleTkn ;
   private ICheckbox chkMAleEr ;
   private IDataStoreProvider pr_default ;
   private long[] T01WA4_A14677MAleId ;
   private String[] T01WA4_A14732MAleEmprCo ;
   private String[] T01WA4_A14724MAleMaqCod ;
   private String[] T01WA4_A14737MAleMaqDsc ;
   private String[] T01WA4_A14725MAleFasCod ;
   private String[] T01WA4_A14738MAleFasDsc ;
   private int[] T01WA4_A14745MAleBarCod ;
   private byte[] T01WA4_A14746MAleBarReo ;
   private String[] T01WA4_A14747MAleBarPar ;
   private String[] T01WA4_A14739MAleHdr ;
   private String[] T01WA4_A14736MAleHdr2 ;
   private short[] T01WA4_A14726MAleParCod ;
   private String[] T01WA4_A14740MAleParDsc ;
   private String[] T01WA4_A14743MAlePLC ;
   private short[] T01WA4_A14741MAleOrd ;
   private long[] T01WA4_A14742MAleLin ;
   private java.util.Date[] T01WA4_A14678MAleFec ;
   private String[] T01WA4_A14728MAleVal ;
   private String[] T01WA4_A14733MAleValMin ;
   private String[] T01WA4_A14734MAleValMax ;
   private boolean[] T01WA4_A14727MAleEr ;
   private java.util.Date[] T01WA4_A14744MAleFecEv ;
   private long[] T01WA4_A14748MAleParId ;
   private String[] T01WA4_A14729MAleUsu ;
   private String[] T01WA4_A14730MAleIp ;
   private java.util.Date[] T01WA4_A14731MAleReg ;
   private String[] T01WA4_A14735MAleTkn ;
   private long[] T01WA5_A14677MAleId ;
   private long[] T01WA3_A14677MAleId ;
   private String[] T01WA3_A14732MAleEmprCo ;
   private String[] T01WA3_A14724MAleMaqCod ;
   private String[] T01WA3_A14737MAleMaqDsc ;
   private String[] T01WA3_A14725MAleFasCod ;
   private String[] T01WA3_A14738MAleFasDsc ;
   private int[] T01WA3_A14745MAleBarCod ;
   private byte[] T01WA3_A14746MAleBarReo ;
   private String[] T01WA3_A14747MAleBarPar ;
   private String[] T01WA3_A14739MAleHdr ;
   private String[] T01WA3_A14736MAleHdr2 ;
   private short[] T01WA3_A14726MAleParCod ;
   private String[] T01WA3_A14740MAleParDsc ;
   private String[] T01WA3_A14743MAlePLC ;
   private short[] T01WA3_A14741MAleOrd ;
   private long[] T01WA3_A14742MAleLin ;
   private java.util.Date[] T01WA3_A14678MAleFec ;
   private String[] T01WA3_A14728MAleVal ;
   private String[] T01WA3_A14733MAleValMin ;
   private String[] T01WA3_A14734MAleValMax ;
   private boolean[] T01WA3_A14727MAleEr ;
   private java.util.Date[] T01WA3_A14744MAleFecEv ;
   private long[] T01WA3_A14748MAleParId ;
   private String[] T01WA3_A14729MAleUsu ;
   private String[] T01WA3_A14730MAleIp ;
   private java.util.Date[] T01WA3_A14731MAleReg ;
   private String[] T01WA3_A14735MAleTkn ;
   private long[] T01WA6_A14677MAleId ;
   private long[] T01WA7_A14677MAleId ;
   private long[] T01WA2_A14677MAleId ;
   private String[] T01WA2_A14732MAleEmprCo ;
   private String[] T01WA2_A14724MAleMaqCod ;
   private String[] T01WA2_A14737MAleMaqDsc ;
   private String[] T01WA2_A14725MAleFasCod ;
   private String[] T01WA2_A14738MAleFasDsc ;
   private int[] T01WA2_A14745MAleBarCod ;
   private byte[] T01WA2_A14746MAleBarReo ;
   private String[] T01WA2_A14747MAleBarPar ;
   private String[] T01WA2_A14739MAleHdr ;
   private String[] T01WA2_A14736MAleHdr2 ;
   private short[] T01WA2_A14726MAleParCod ;
   private String[] T01WA2_A14740MAleParDsc ;
   private String[] T01WA2_A14743MAlePLC ;
   private short[] T01WA2_A14741MAleOrd ;
   private long[] T01WA2_A14742MAleLin ;
   private java.util.Date[] T01WA2_A14678MAleFec ;
   private String[] T01WA2_A14728MAleVal ;
   private String[] T01WA2_A14733MAleValMin ;
   private String[] T01WA2_A14734MAleValMax ;
   private boolean[] T01WA2_A14727MAleEr ;
   private java.util.Date[] T01WA2_A14744MAleFecEv ;
   private long[] T01WA2_A14748MAleParId ;
   private String[] T01WA2_A14729MAleUsu ;
   private String[] T01WA2_A14730MAleIp ;
   private java.util.Date[] T01WA2_A14731MAleReg ;
   private String[] T01WA2_A14735MAleTkn ;
   private long[] T01WA9_A14677MAleId ;
   private long[] T01WA12_A14677MAleId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class male__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class male__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class male__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class male__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01WA2", "SELECT MAleId, MAleEmprCo, MAleMaqCod, MAleMaqDsc, MAleFasCod, MAleFasDsc, MAleBarCod, MAleBarReo, MAleBarPar, MAleHdr, MAleHdr2, MAleParCod, MAleParDsc, MAlePLC, MAleOrd, MAleLin, MAleFec, MAleVal, MAleValMin, MAleValMax, MAleEr, MAleFecEv, MAleParId, MAleUsu, MAleIp, MAleReg, MAleTkn FROM MAle WHERE MAleId = ?  FOR UPDATE OF MAleEmprCo, MAleMaqCod, MAleMaqDsc, MAleFasCod, MAleFasDsc, MAleBarCod, MAleBarReo, MAleBarPar, MAleHdr, MAleHdr2, MAleParCod, MAleParDsc, MAlePLC, MAleOrd, MAleLin, MAleFec, MAleVal, MAleValMin, MAleValMax, MAleEr, MAleFecEv, MAleParId, MAleUsu, MAleIp, MAleReg, MAleTkn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WA3", "SELECT MAleId, MAleEmprCo, MAleMaqCod, MAleMaqDsc, MAleFasCod, MAleFasDsc, MAleBarCod, MAleBarReo, MAleBarPar, MAleHdr, MAleHdr2, MAleParCod, MAleParDsc, MAlePLC, MAleOrd, MAleLin, MAleFec, MAleVal, MAleValMin, MAleValMax, MAleEr, MAleFecEv, MAleParId, MAleUsu, MAleIp, MAleReg, MAleTkn FROM MAle WHERE MAleId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WA4", "SELECT /*+ FIRST_ROWS(100) */ TM1.MAleId, TM1.MAleEmprCo, TM1.MAleMaqCod, TM1.MAleMaqDsc, TM1.MAleFasCod, TM1.MAleFasDsc, TM1.MAleBarCod, TM1.MAleBarReo, TM1.MAleBarPar, TM1.MAleHdr, TM1.MAleHdr2, TM1.MAleParCod, TM1.MAleParDsc, TM1.MAlePLC, TM1.MAleOrd, TM1.MAleLin, TM1.MAleFec, TM1.MAleVal, TM1.MAleValMin, TM1.MAleValMax, TM1.MAleEr, TM1.MAleFecEv, TM1.MAleParId, TM1.MAleUsu, TM1.MAleIp, TM1.MAleReg, TM1.MAleTkn FROM MAle TM1 WHERE TM1.MAleId = ? ORDER BY TM1.MAleId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WA5", "SELECT /*+ FIRST_ROWS(1) */ MAleId FROM MAle WHERE MAleId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WA6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MAleId FROM MAle WHERE ( MAleId > ?) ORDER BY MAleId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01WA7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MAleId FROM MAle WHERE ( MAleId < ?) ORDER BY MAleId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01WA8", "INSERT INTO MAle(MAleEmprCo, MAleMaqCod, MAleMaqDsc, MAleFasCod, MAleFasDsc, MAleBarCod, MAleBarReo, MAleBarPar, MAleHdr, MAleHdr2, MAleParCod, MAleParDsc, MAlePLC, MAleOrd, MAleLin, MAleFec, MAleVal, MAleValMin, MAleValMax, MAleEr, MAleFecEv, MAleParId, MAleUsu, MAleIp, MAleReg, MAleTkn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "MAle")
         ,new ForEachCursor("T01WA9", "SELECT MAleId.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01WA10", "UPDATE MAle SET MAleEmprCo=?, MAleMaqCod=?, MAleMaqDsc=?, MAleFasCod=?, MAleFasDsc=?, MAleBarCod=?, MAleBarReo=?, MAleBarPar=?, MAleHdr=?, MAleHdr2=?, MAleParCod=?, MAleParDsc=?, MAlePLC=?, MAleOrd=?, MAleLin=?, MAleFec=?, MAleVal=?, MAleValMin=?, MAleValMax=?, MAleEr=?, MAleFecEv=?, MAleParId=?, MAleUsu=?, MAleIp=?, MAleReg=?, MAleTkn=?  WHERE MAleId = ?", GX_NOMASK, "MAle")
         ,new UpdateCursor("T01WA11", "DELETE FROM MAle  WHERE MAleId = ?", GX_NOMASK, "MAle")
         ,new ForEachCursor("T01WA12", "SELECT /*+ FIRST_ROWS(100) */ MAleId FROM MAle ORDER BY MAleId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(17, true);
               ((String[]) buf[17])[0] = rslt.getString(18, 12);
               ((String[]) buf[18])[0] = rslt.getString(19, 12);
               ((String[]) buf[19])[0] = rslt.getString(20, 12);
               ((boolean[]) buf[20])[0] = rslt.getBoolean(21);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(22, true);
               ((long[]) buf[22])[0] = rslt.getLong(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 8);
               ((String[]) buf[24])[0] = rslt.getVarchar(25);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(26, true);
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
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(17, true);
               ((String[]) buf[17])[0] = rslt.getString(18, 12);
               ((String[]) buf[18])[0] = rslt.getString(19, 12);
               ((String[]) buf[19])[0] = rslt.getString(20, 12);
               ((boolean[]) buf[20])[0] = rslt.getBoolean(21);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(22, true);
               ((long[]) buf[22])[0] = rslt.getLong(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 8);
               ((String[]) buf[24])[0] = rslt.getVarchar(25);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(26, true);
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
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(17, true);
               ((String[]) buf[17])[0] = rslt.getString(18, 12);
               ((String[]) buf[18])[0] = rslt.getString(19, 12);
               ((String[]) buf[19])[0] = rslt.getString(20, 12);
               ((boolean[]) buf[20])[0] = rslt.getBoolean(21);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(22, true);
               ((long[]) buf[22])[0] = rslt.getLong(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 8);
               ((String[]) buf[24])[0] = rslt.getVarchar(25);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(26, true);
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
               stmt.setDateTime(16, (java.util.Date)parms[15], false, true);
               stmt.setString(17, (String)parms[16], 12);
               stmt.setString(18, (String)parms[17], 12);
               stmt.setString(19, (String)parms[18], 12);
               stmt.setBoolean(20, ((Boolean) parms[19]).booleanValue());
               stmt.setDateTime(21, (java.util.Date)parms[20], false, true);
               stmt.setLong(22, ((Number) parms[21]).longValue());
               stmt.setString(23, (String)parms[22], 8);
               stmt.setVarchar(24, (String)parms[23], 20, false);
               stmt.setDateTime(25, (java.util.Date)parms[24], false, true);
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
               stmt.setDateTime(16, (java.util.Date)parms[15], false, true);
               stmt.setString(17, (String)parms[16], 12);
               stmt.setString(18, (String)parms[17], 12);
               stmt.setString(19, (String)parms[18], 12);
               stmt.setBoolean(20, ((Boolean) parms[19]).booleanValue());
               stmt.setDateTime(21, (java.util.Date)parms[20], false, true);
               stmt.setLong(22, ((Number) parms[21]).longValue());
               stmt.setString(23, (String)parms[22], 8);
               stmt.setVarchar(24, (String)parms[23], 20, false);
               stmt.setDateTime(25, (java.util.Date)parms[24], false, true);
               stmt.setVarchar(26, (String)parms[25], 256, false);
               stmt.setLong(27, ((Number) parms[26]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

