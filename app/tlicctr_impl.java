package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tlicctr_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtlicctr_level1item") == 0 )
      {
         gxnrgridtlicctr_level1item_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Control de Licencias", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtLicPrdId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridtlicctr_level1item_newrow_invoke( )
   {
      nRC_GXsfl_48 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_48"))) ;
      nGXsfl_48_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_48_idx"))) ;
      sGXsfl_48_idx = httpContext.GetPar( "sGXsfl_48_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtlicctr_level1item_newrow( ) ;
      /* End function gxnrGridtlicctr_level1item_newrow_invoke */
   }

   public tlicctr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tlicctr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlicctr_impl.class ));
   }

   public tlicctr_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Control de Licencias", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TLICCTR.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLICCTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLICCTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLICCTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLICCTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TLICCTR.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLicPrdId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLicPrdId_Internalname, httpContext.getMessage( "Identificación del Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLicPrdId_Internalname, GXutil.rtrim( A4103LicPrdId), GXutil.rtrim( localUtil.format( A4103LicPrdId, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLicPrdId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLicPrdId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "LicPrd", "left", true, "", "HLP_TLICCTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLicPrdDat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLicPrdDat_Internalname, httpContext.getMessage( "Datos Licencia Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLicPrdDat_Internalname, GXutil.rtrim( A4104LicPrdDat), GXutil.rtrim( localUtil.format( A4104LicPrdDat, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLicPrdDat_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLicPrdDat_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "LicDat", "left", true, "", "HLP_TLICCTR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TLICCTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtlicctr_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLICCTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLICCTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLICCTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtlicctr_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol48( ) ;
      nGXsfl_48_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1911 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1911 = (short)(1) ;
            scanStartIQ1911( ) ;
            while ( RcdFound1911 != 0 )
            {
               init_level_properties1911( ) ;
               getByPrimaryKeyIQ1911( ) ;
               addRowIQ1911( ) ;
               scanNextIQ1911( ) ;
            }
            scanEndIQ1911( ) ;
            nBlankRcdCount1911 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalIQ1911( ) ;
         standaloneModalIQ1911( ) ;
         sMode1911 = Gx_mode ;
         while ( nGXsfl_48_idx < nRC_GXsfl_48 )
         {
            bGXsfl_48_Refreshing = true ;
            readRowIQ1911( ) ;
            edtLicConId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LICCONID_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLicConId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLicConId_Enabled), 5, 0), !bGXsfl_48_Refreshing);
            edtLicConDat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LICCONDAT_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLicConDat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLicConDat_Enabled), 5, 0), !bGXsfl_48_Refreshing);
            edtLicConUso_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LICCONUSO_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLicConUso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLicConUso_Enabled), 5, 0), !bGXsfl_48_Refreshing);
            if ( ( nRcdExists_1911 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalIQ1911( ) ;
            }
            sendRowIQ1911( ) ;
            bGXsfl_48_Refreshing = false ;
         }
         Gx_mode = sMode1911 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1911 = (short)(5) ;
         nRcdExists_1911 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartIQ1911( ) ;
            while ( RcdFound1911 != 0 )
            {
               sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_481911( ) ;
               init_level_properties1911( ) ;
               standaloneNotModalIQ1911( ) ;
               getByPrimaryKeyIQ1911( ) ;
               standaloneModalIQ1911( ) ;
               addRowIQ1911( ) ;
               scanNextIQ1911( ) ;
            }
            scanEndIQ1911( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1911 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_481911( ) ;
      initAllIQ1911( ) ;
      init_level_properties1911( ) ;
      nRcdExists_1911 = (short)(0) ;
      nIsMod_1911 = (short)(0) ;
      nRcdDeleted_1911 = (short)(0) ;
      nBlankRcdCount1911 = (short)(nBlankRcdUsr1911+nBlankRcdCount1911) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1911 > 0 )
      {
         standaloneNotModalIQ1911( ) ;
         standaloneModalIQ1911( ) ;
         addRowIQ1911( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtLicConId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1911 = (short)(nBlankRcdCount1911-1) ;
      }
      Gx_mode = sMode1911 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtlicctr_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtlicctr_level1item", Gridtlicctr_level1itemContainer, subGridtlicctr_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtlicctr_level1itemContainerData", Gridtlicctr_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtlicctr_level1itemContainerData"+"V", Gridtlicctr_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtlicctr_level1itemContainerData"+"V"+"\" value='"+Gridtlicctr_level1itemContainer.GridValuesHidden()+"'/>") ;
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
         Z4103LicPrdId = httpContext.cgiGet( "Z4103LicPrdId") ;
         Z4104LicPrdDat = httpContext.cgiGet( "Z4104LicPrdDat") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_48 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_48"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A4103LicPrdId = httpContext.cgiGet( edtLicPrdId_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4103LicPrdId", A4103LicPrdId);
         A4104LicPrdDat = GXutil.upper( httpContext.cgiGet( edtLicPrdDat_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4104LicPrdDat", A4104LicPrdDat);
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
            A4103LicPrdId = httpContext.GetPar( "LicPrdId") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4103LicPrdId", A4103LicPrdId);
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
            initAllIQ1910( ) ;
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
      disableAttributesIQ1910( ) ;
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

   public void confirm_IQ1911( )
   {
      nGXsfl_48_idx = 0 ;
      while ( nGXsfl_48_idx < nRC_GXsfl_48 )
      {
         readRowIQ1911( ) ;
         if ( ( nRcdExists_1911 != 0 ) || ( nIsMod_1911 != 0 ) )
         {
            getKeyIQ1911( ) ;
            if ( ( nRcdExists_1911 == 0 ) && ( nRcdDeleted_1911 == 0 ) )
            {
               if ( RcdFound1911 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateIQ1911( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableIQ1911( ) ;
                     closeExtendedTableCursorsIQ1911( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "LICCONID_" + sGXsfl_48_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLicConId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1911 != 0 )
               {
                  if ( nRcdDeleted_1911 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyIQ1911( ) ;
                     loadIQ1911( ) ;
                     beforeValidateIQ1911( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsIQ1911( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1911 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateIQ1911( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableIQ1911( ) ;
                           closeExtendedTableCursorsIQ1911( ) ;
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
                  if ( nRcdDeleted_1911 == 0 )
                  {
                     GXCCtl = "LICCONID_" + sGXsfl_48_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLicConId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLicConId_Internalname, GXutil.rtrim( A4105LicConId)) ;
         httpContext.changePostValue( edtLicConDat_Internalname, GXutil.rtrim( A4106LicConDat)) ;
         httpContext.changePostValue( edtLicConUso_Internalname, GXutil.ltrim( localUtil.ntoc( A4107LicConUso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4105LicConId_"+sGXsfl_48_idx, GXutil.rtrim( Z4105LicConId)) ;
         httpContext.changePostValue( "ZT_"+"Z4106LicConDat_"+sGXsfl_48_idx, GXutil.rtrim( Z4106LicConDat)) ;
         httpContext.changePostValue( "ZT_"+"Z4107LicConUso_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( Z4107LicConUso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1911_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1911, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1911_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1911, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1911_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1911, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1911 != 0 )
         {
            httpContext.changePostValue( "LICCONID_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLicConId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LICCONDAT_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLicConDat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LICCONUSO_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLicConUso_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionIQ0( )
   {
   }

   public void zmIQ1910( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4104LicPrdDat = T00IQ5_A4104LicPrdDat[0] ;
         }
         else
         {
            Z4104LicPrdDat = A4104LicPrdDat ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z4103LicPrdId = A4103LicPrdId ;
         Z4104LicPrdDat = A4104LicPrdDat ;
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

   public void loadIQ1910( )
   {
      /* Using cursor T00IQ6 */
      pr_default.execute(4, new Object[] {A4103LicPrdId});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1910 = (short)(1) ;
         A4104LicPrdDat = T00IQ6_A4104LicPrdDat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4104LicPrdDat", A4104LicPrdDat);
         zmIQ1910( -1) ;
      }
      pr_default.close(4);
      onLoadActionsIQ1910( ) ;
   }

   public void onLoadActionsIQ1910( )
   {
   }

   public void checkExtendedTableIQ1910( )
   {
      nIsDirty_1910 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsIQ1910( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyIQ1910( )
   {
      /* Using cursor T00IQ7 */
      pr_default.execute(5, new Object[] {A4103LicPrdId});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1910 = (short)(1) ;
      }
      else
      {
         RcdFound1910 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00IQ5 */
      pr_default.execute(3, new Object[] {A4103LicPrdId});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmIQ1910( 1) ;
         RcdFound1910 = (short)(1) ;
         A4103LicPrdId = T00IQ5_A4103LicPrdId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4103LicPrdId", A4103LicPrdId);
         A4104LicPrdDat = T00IQ5_A4104LicPrdDat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4104LicPrdDat", A4104LicPrdDat);
         Z4103LicPrdId = A4103LicPrdId ;
         sMode1910 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadIQ1910( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1910 = (short)(0) ;
            initializeNonKeyIQ1910( ) ;
         }
         Gx_mode = sMode1910 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1910 = (short)(0) ;
         initializeNonKeyIQ1910( ) ;
         sMode1910 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1910 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyIQ1910( ) ;
      if ( RcdFound1910 == 0 )
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
      RcdFound1910 = (short)(0) ;
      /* Using cursor T00IQ8 */
      pr_default.execute(6, new Object[] {A4103LicPrdId});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00IQ8_A4103LicPrdId[0], A4103LicPrdId) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00IQ8_A4103LicPrdId[0], A4103LicPrdId) > 0 ) ) )
         {
            A4103LicPrdId = T00IQ8_A4103LicPrdId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4103LicPrdId", A4103LicPrdId);
            RcdFound1910 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1910 = (short)(0) ;
      /* Using cursor T00IQ9 */
      pr_default.execute(7, new Object[] {A4103LicPrdId});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00IQ9_A4103LicPrdId[0], A4103LicPrdId) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00IQ9_A4103LicPrdId[0], A4103LicPrdId) < 0 ) ) )
         {
            A4103LicPrdId = T00IQ9_A4103LicPrdId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4103LicPrdId", A4103LicPrdId);
            RcdFound1910 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyIQ1910( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtLicPrdId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertIQ1910( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1910 == 1 )
         {
            if ( GXutil.strcmp(A4103LicPrdId, Z4103LicPrdId) != 0 )
            {
               A4103LicPrdId = Z4103LicPrdId ;
               httpContext.ajax_rsp_assign_attri("", false, "A4103LicPrdId", A4103LicPrdId);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "LICPRDID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLicPrdId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtLicPrdId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateIQ1910( ) ;
               GX_FocusControl = edtLicPrdId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A4103LicPrdId, Z4103LicPrdId) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtLicPrdId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertIQ1910( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "LICPRDID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLicPrdId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtLicPrdId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertIQ1910( ) ;
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
      if ( GXutil.strcmp(A4103LicPrdId, Z4103LicPrdId) != 0 )
      {
         A4103LicPrdId = Z4103LicPrdId ;
         httpContext.ajax_rsp_assign_attri("", false, "A4103LicPrdId", A4103LicPrdId);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "LICPRDID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLicPrdId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtLicPrdId_Internalname ;
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
      if ( RcdFound1910 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "LICPRDID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLicPrdId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtLicPrdDat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartIQ1910( ) ;
      if ( RcdFound1910 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLicPrdDat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndIQ1910( ) ;
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
      if ( RcdFound1910 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLicPrdDat_Internalname ;
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
      if ( RcdFound1910 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLicPrdDat_Internalname ;
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
      scanStartIQ1910( ) ;
      if ( RcdFound1910 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1910 != 0 )
         {
            scanNextIQ1910( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLicPrdDat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndIQ1910( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyIQ1910( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00IQ4 */
         pr_default.execute(2, new Object[] {A4103LicPrdId});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLICPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z4104LicPrdDat, T00IQ4_A4104LicPrdDat[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4104LicPrdDat, T00IQ4_A4104LicPrdDat[0]) != 0 )
            {
               GXutil.writeLogln("tlicctr:[seudo value changed for attri]"+"LicPrdDat");
               GXutil.writeLogRaw("Old: ",Z4104LicPrdDat);
               GXutil.writeLogRaw("Current: ",T00IQ4_A4104LicPrdDat[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLICPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertIQ1910( )
   {
      beforeValidateIQ1910( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIQ1910( ) ;
      }
      if ( AnyError == 0 )
      {
         zmIQ1910( 0) ;
         checkOptimisticConcurrencyIQ1910( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmIQ1910( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertIQ1910( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00IQ10 */
                  pr_default.execute(8, new Object[] {A4103LicPrdId, A4104LicPrdDat});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLICPRD");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        processLevelIQ1910( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionIQ0( ) ;
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
            loadIQ1910( ) ;
         }
         endLevelIQ1910( ) ;
      }
      closeExtendedTableCursorsIQ1910( ) ;
   }

   public void updateIQ1910( )
   {
      beforeValidateIQ1910( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIQ1910( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyIQ1910( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmIQ1910( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateIQ1910( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00IQ11 */
                  pr_default.execute(9, new Object[] {A4104LicPrdDat, A4103LicPrdId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLICPRD");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLICPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateIQ1910( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelIQ1910( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionIQ0( ) ;
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
         endLevelIQ1910( ) ;
      }
      closeExtendedTableCursorsIQ1910( ) ;
   }

   public void deferredUpdateIQ1910( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateIQ1910( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyIQ1910( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsIQ1910( ) ;
         afterConfirmIQ1910( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteIQ1910( ) ;
            if ( AnyError == 0 )
            {
               scanStartIQ1911( ) ;
               while ( RcdFound1911 != 0 )
               {
                  getByPrimaryKeyIQ1911( ) ;
                  deleteIQ1911( ) ;
                  scanNextIQ1911( ) ;
               }
               scanEndIQ1911( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00IQ12 */
                  pr_default.execute(10, new Object[] {A4103LicPrdId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLICPRD");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1910 == 0 )
                        {
                           initAllIQ1910( ) ;
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
                        resetCaptionIQ0( ) ;
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
      sMode1910 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelIQ1910( ) ;
      Gx_mode = sMode1910 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsIQ1910( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevelIQ1911( )
   {
      nGXsfl_48_idx = 0 ;
      while ( nGXsfl_48_idx < nRC_GXsfl_48 )
      {
         readRowIQ1911( ) ;
         if ( ( nRcdExists_1911 != 0 ) || ( nIsMod_1911 != 0 ) )
         {
            standaloneNotModalIQ1911( ) ;
            getKeyIQ1911( ) ;
            if ( ( nRcdExists_1911 == 0 ) && ( nRcdDeleted_1911 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertIQ1911( ) ;
            }
            else
            {
               if ( RcdFound1911 != 0 )
               {
                  if ( ( nRcdDeleted_1911 != 0 ) && ( nRcdExists_1911 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteIQ1911( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1911 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateIQ1911( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1911 == 0 )
                  {
                     GXCCtl = "LICCONID_" + sGXsfl_48_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLicConId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLicConId_Internalname, GXutil.rtrim( A4105LicConId)) ;
         httpContext.changePostValue( edtLicConDat_Internalname, GXutil.rtrim( A4106LicConDat)) ;
         httpContext.changePostValue( edtLicConUso_Internalname, GXutil.ltrim( localUtil.ntoc( A4107LicConUso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4105LicConId_"+sGXsfl_48_idx, GXutil.rtrim( Z4105LicConId)) ;
         httpContext.changePostValue( "ZT_"+"Z4106LicConDat_"+sGXsfl_48_idx, GXutil.rtrim( Z4106LicConDat)) ;
         httpContext.changePostValue( "ZT_"+"Z4107LicConUso_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( Z4107LicConUso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1911_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1911, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1911_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1911, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1911_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1911, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1911 != 0 )
         {
            httpContext.changePostValue( "LICCONID_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLicConId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LICCONDAT_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLicConDat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LICCONUSO_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLicConUso_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllIQ1911( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1911 = (short)(0) ;
      nIsMod_1911 = (short)(0) ;
      nRcdDeleted_1911 = (short)(0) ;
   }

   public void processLevelIQ1910( )
   {
      /* Save parent mode. */
      sMode1910 = Gx_mode ;
      processNestedLevelIQ1911( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1910 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelIQ1910( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteIQ1910( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tlicctr");
         if ( AnyError == 0 )
         {
            confirmValuesIQ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tlicctr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartIQ1910( )
   {
      /* Using cursor T00IQ13 */
      pr_default.execute(11);
      RcdFound1910 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1910 = (short)(1) ;
         A4103LicPrdId = T00IQ13_A4103LicPrdId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4103LicPrdId", A4103LicPrdId);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextIQ1910( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1910 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1910 = (short)(1) ;
         A4103LicPrdId = T00IQ13_A4103LicPrdId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4103LicPrdId", A4103LicPrdId);
      }
   }

   public void scanEndIQ1910( )
   {
      pr_default.close(11);
   }

   public void afterConfirmIQ1910( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertIQ1910( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateIQ1910( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteIQ1910( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteIQ1910( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateIQ1910( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesIQ1910( )
   {
      edtLicPrdId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLicPrdId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLicPrdId_Enabled), 5, 0), true);
      edtLicPrdDat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLicPrdDat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLicPrdDat_Enabled), 5, 0), true);
   }

   public void zmIQ1911( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4106LicConDat = T00IQ3_A4106LicConDat[0] ;
            Z4107LicConUso = T00IQ3_A4107LicConUso[0] ;
         }
         else
         {
            Z4106LicConDat = A4106LicConDat ;
            Z4107LicConUso = A4107LicConUso ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z4103LicPrdId = A4103LicPrdId ;
         Z4105LicConId = A4105LicConId ;
         Z4106LicConDat = A4106LicConDat ;
         Z4107LicConUso = A4107LicConUso ;
      }
   }

   public void standaloneNotModalIQ1911( )
   {
   }

   public void standaloneModalIQ1911( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLicConId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLicConId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLicConId_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      }
      else
      {
         edtLicConId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLicConId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLicConId_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      }
   }

   public void loadIQ1911( )
   {
      /* Using cursor T00IQ14 */
      pr_default.execute(12, new Object[] {A4103LicPrdId, A4105LicConId});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1911 = (short)(1) ;
         A4106LicConDat = T00IQ14_A4106LicConDat[0] ;
         A4107LicConUso = T00IQ14_A4107LicConUso[0] ;
         zmIQ1911( -2) ;
      }
      pr_default.close(12);
      onLoadActionsIQ1911( ) ;
   }

   public void onLoadActionsIQ1911( )
   {
   }

   public void checkExtendedTableIQ1911( )
   {
      nIsDirty_1911 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalIQ1911( ) ;
   }

   public void closeExtendedTableCursorsIQ1911( )
   {
   }

   public void enableDisableIQ1911( )
   {
   }

   public void getKeyIQ1911( )
   {
      /* Using cursor T00IQ15 */
      pr_default.execute(13, new Object[] {A4103LicPrdId, A4105LicConId});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1911 = (short)(1) ;
      }
      else
      {
         RcdFound1911 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKeyIQ1911( )
   {
      /* Using cursor T00IQ3 */
      pr_default.execute(1, new Object[] {A4103LicPrdId, A4105LicConId});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmIQ1911( 2) ;
         RcdFound1911 = (short)(1) ;
         initializeNonKeyIQ1911( ) ;
         A4105LicConId = T00IQ3_A4105LicConId[0] ;
         A4106LicConDat = T00IQ3_A4106LicConDat[0] ;
         A4107LicConUso = T00IQ3_A4107LicConUso[0] ;
         Z4103LicPrdId = A4103LicPrdId ;
         Z4105LicConId = A4105LicConId ;
         sMode1911 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalIQ1911( ) ;
         loadIQ1911( ) ;
         Gx_mode = sMode1911 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1911 = (short)(0) ;
         initializeNonKeyIQ1911( ) ;
         sMode1911 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalIQ1911( ) ;
         Gx_mode = sMode1911 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesIQ1911( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyIQ1911( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00IQ2 */
         pr_default.execute(0, new Object[] {A4103LicPrdId, A4105LicConId});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLICCT1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4106LicConDat, T00IQ2_A4106LicConDat[0]) != 0 ) || ( Z4107LicConUso != T00IQ2_A4107LicConUso[0] ) )
         {
            if ( GXutil.strcmp(Z4106LicConDat, T00IQ2_A4106LicConDat[0]) != 0 )
            {
               GXutil.writeLogln("tlicctr:[seudo value changed for attri]"+"LicConDat");
               GXutil.writeLogRaw("Old: ",Z4106LicConDat);
               GXutil.writeLogRaw("Current: ",T00IQ2_A4106LicConDat[0]);
            }
            if ( Z4107LicConUso != T00IQ2_A4107LicConUso[0] )
            {
               GXutil.writeLogln("tlicctr:[seudo value changed for attri]"+"LicConUso");
               GXutil.writeLogRaw("Old: ",Z4107LicConUso);
               GXutil.writeLogRaw("Current: ",T00IQ2_A4107LicConUso[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLICCT1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertIQ1911( )
   {
      beforeValidateIQ1911( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIQ1911( ) ;
      }
      if ( AnyError == 0 )
      {
         zmIQ1911( 0) ;
         checkOptimisticConcurrencyIQ1911( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmIQ1911( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertIQ1911( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00IQ16 */
                  pr_default.execute(14, new Object[] {A4103LicPrdId, A4105LicConId, A4106LicConDat, Byte.valueOf(A4107LicConUso)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLICCT1");
                  if ( (pr_default.getStatus(14) == 1) )
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
            loadIQ1911( ) ;
         }
         endLevelIQ1911( ) ;
      }
      closeExtendedTableCursorsIQ1911( ) ;
   }

   public void updateIQ1911( )
   {
      beforeValidateIQ1911( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIQ1911( ) ;
      }
      if ( ( nIsMod_1911 != 0 ) || ( nIsDirty_1911 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyIQ1911( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmIQ1911( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateIQ1911( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00IQ17 */
                     pr_default.execute(15, new Object[] {A4106LicConDat, Byte.valueOf(A4107LicConUso), A4103LicPrdId, A4105LicConId});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLICCT1");
                     if ( (pr_default.getStatus(15) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLICCT1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateIQ1911( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyIQ1911( ) ;
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
            endLevelIQ1911( ) ;
         }
      }
      closeExtendedTableCursorsIQ1911( ) ;
   }

   public void deferredUpdateIQ1911( )
   {
   }

   public void deleteIQ1911( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateIQ1911( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyIQ1911( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsIQ1911( ) ;
         afterConfirmIQ1911( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteIQ1911( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00IQ18 */
               pr_default.execute(16, new Object[] {A4103LicPrdId, A4105LicConId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLICCT1");
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
      sMode1911 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelIQ1911( ) ;
      Gx_mode = sMode1911 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsIQ1911( )
   {
      standaloneModalIQ1911( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelIQ1911( )
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

   public void scanStartIQ1911( )
   {
      /* Scan By routine */
      /* Using cursor T00IQ19 */
      pr_default.execute(17, new Object[] {A4103LicPrdId});
      RcdFound1911 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1911 = (short)(1) ;
         A4105LicConId = T00IQ19_A4105LicConId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextIQ1911( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1911 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1911 = (short)(1) ;
         A4105LicConId = T00IQ19_A4105LicConId[0] ;
      }
   }

   public void scanEndIQ1911( )
   {
      pr_default.close(17);
   }

   public void afterConfirmIQ1911( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertIQ1911( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateIQ1911( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteIQ1911( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteIQ1911( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateIQ1911( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesIQ1911( )
   {
      edtLicConId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLicConId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLicConId_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtLicConDat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLicConDat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLicConDat_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtLicConUso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLicConUso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLicConUso_Enabled), 5, 0), !bGXsfl_48_Refreshing);
   }

   public void send_integrity_lvl_hashesIQ1911( )
   {
   }

   public void send_integrity_lvl_hashesIQ1910( )
   {
   }

   public void subsflControlProps_481911( )
   {
      edtLicConId_Internalname = "LICCONID_"+sGXsfl_48_idx ;
      edtLicConDat_Internalname = "LICCONDAT_"+sGXsfl_48_idx ;
      edtLicConUso_Internalname = "LICCONUSO_"+sGXsfl_48_idx ;
   }

   public void subsflControlProps_fel_481911( )
   {
      edtLicConId_Internalname = "LICCONID_"+sGXsfl_48_fel_idx ;
      edtLicConDat_Internalname = "LICCONDAT_"+sGXsfl_48_fel_idx ;
      edtLicConUso_Internalname = "LICCONUSO_"+sGXsfl_48_fel_idx ;
   }

   public void addRowIQ1911( )
   {
      nGXsfl_48_idx = (int)(nGXsfl_48_idx+1) ;
      sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_481911( ) ;
      sendRowIQ1911( ) ;
   }

   public void sendRowIQ1911( )
   {
      Gridtlicctr_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtlicctr_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtlicctr_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtlicctr_level1item_Class, "") != 0 )
         {
            subGridtlicctr_level1item_Linesclass = subGridtlicctr_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtlicctr_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtlicctr_level1item_Backstyle = (byte)(0) ;
         subGridtlicctr_level1item_Backcolor = subGridtlicctr_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtlicctr_level1item_Class, "") != 0 )
         {
            subGridtlicctr_level1item_Linesclass = subGridtlicctr_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtlicctr_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtlicctr_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtlicctr_level1item_Class, "") != 0 )
         {
            subGridtlicctr_level1item_Linesclass = subGridtlicctr_level1item_Class+"Odd" ;
         }
         subGridtlicctr_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtlicctr_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtlicctr_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_48_idx) % (2))) == 0 )
         {
            subGridtlicctr_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtlicctr_level1item_Class, "") != 0 )
            {
               subGridtlicctr_level1item_Linesclass = subGridtlicctr_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtlicctr_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtlicctr_level1item_Class, "") != 0 )
            {
               subGridtlicctr_level1item_Linesclass = subGridtlicctr_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1911_" + sGXsfl_48_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_48_idx + "',48)\"" ;
      ROClassString = "Attribute" ;
      Gridtlicctr_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLicConId_Internalname,GXutil.rtrim( A4105LicConId),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLicConId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLicConId_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1911_" + sGXsfl_48_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_48_idx + "',48)\"" ;
      ROClassString = "Attribute" ;
      Gridtlicctr_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLicConDat_Internalname,GXutil.rtrim( A4106LicConDat),GXutil.rtrim( localUtil.format( A4106LicConDat, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLicConDat_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLicConDat_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"LicDat","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1911_" + sGXsfl_48_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_48_idx + "',48)\"" ;
      ROClassString = "Attribute" ;
      Gridtlicctr_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLicConUso_Internalname,GXutil.ltrim( localUtil.ntoc( A4107LicConUso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLicConUso_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4107LicConUso), "9") : localUtil.format( DecimalUtil.doubleToDec(A4107LicConUso), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLicConUso_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLicConUso_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridtlicctr_level1itemRow);
      send_integrity_lvl_hashesIQ1911( ) ;
      GXCCtl = "Z4105LicConId_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4105LicConId));
      GXCCtl = "Z4106LicConDat_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4106LicConDat));
      GXCCtl = "Z4107LicConUso_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4107LicConUso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1911_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1911, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1911_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1911, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1911_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1911, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LICCONID_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLicConId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LICCONDAT_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLicConDat_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LICCONUSO_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLicConUso_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtlicctr_level1itemContainer.AddRow(Gridtlicctr_level1itemRow);
   }

   public void readRowIQ1911( )
   {
      nGXsfl_48_idx = (int)(nGXsfl_48_idx+1) ;
      sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_481911( ) ;
      edtLicConId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LICCONID_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLicConDat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LICCONDAT_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLicConUso_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LICCONUSO_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A4105LicConId = httpContext.cgiGet( edtLicConId_Internalname) ;
      A4106LicConDat = GXutil.upper( httpContext.cgiGet( edtLicConDat_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLicConUso_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLicConUso_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "LICCONUSO_" + sGXsfl_48_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLicConUso_Internalname ;
         wbErr = true ;
         A4107LicConUso = (byte)(0) ;
      }
      else
      {
         A4107LicConUso = (byte)(localUtil.ctol( httpContext.cgiGet( edtLicConUso_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z4105LicConId_" + sGXsfl_48_idx ;
      Z4105LicConId = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4106LicConDat_" + sGXsfl_48_idx ;
      Z4106LicConDat = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4107LicConUso_" + sGXsfl_48_idx ;
      Z4107LicConUso = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1911_" + sGXsfl_48_idx ;
      nRcdDeleted_1911 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1911_" + sGXsfl_48_idx ;
      nRcdExists_1911 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1911_" + sGXsfl_48_idx ;
      nIsMod_1911 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtLicConId_Enabled = edtLicConId_Enabled ;
   }

   public void confirmValuesIQ0( )
   {
      nGXsfl_48_idx = 0 ;
      sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_481911( ) ;
      while ( nGXsfl_48_idx < nRC_GXsfl_48 )
      {
         nGXsfl_48_idx = (int)(nGXsfl_48_idx+1) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_481911( ) ;
         httpContext.changePostValue( "Z4105LicConId_"+sGXsfl_48_idx, httpContext.cgiGet( "ZT_"+"Z4105LicConId_"+sGXsfl_48_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4105LicConId_"+sGXsfl_48_idx) ;
         httpContext.changePostValue( "Z4106LicConDat_"+sGXsfl_48_idx, httpContext.cgiGet( "ZT_"+"Z4106LicConDat_"+sGXsfl_48_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4106LicConDat_"+sGXsfl_48_idx) ;
         httpContext.changePostValue( "Z4107LicConUso_"+sGXsfl_48_idx, httpContext.cgiGet( "ZT_"+"Z4107LicConUso_"+sGXsfl_48_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4107LicConUso_"+sGXsfl_48_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tlicctr", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4103LicPrdId", GXutil.rtrim( Z4103LicPrdId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4104LicPrdDat", GXutil.rtrim( Z4104LicPrdDat));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_48", GXutil.ltrim( localUtil.ntoc( nGXsfl_48_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tlicctr", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TLICCTR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Control de Licencias", "") ;
   }

   public void initializeNonKeyIQ1910( )
   {
      A4104LicPrdDat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4104LicPrdDat", A4104LicPrdDat);
      Z4104LicPrdDat = "" ;
   }

   public void initAllIQ1910( )
   {
      A4103LicPrdId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4103LicPrdId", A4103LicPrdId);
      initializeNonKeyIQ1910( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyIQ1911( )
   {
      A4106LicConDat = "" ;
      A4107LicConUso = (byte)(0) ;
      Z4106LicConDat = "" ;
      Z4107LicConUso = (byte)(0) ;
   }

   public void initAllIQ1911( )
   {
      A4105LicConId = "" ;
      initializeNonKeyIQ1911( ) ;
   }

   public void standaloneModalInsertIQ1911( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202612518573441", true, true);
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
      httpContext.AddJavascriptSource("tlicctr.js", "?202612518573441", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1911( )
   {
      edtLicConId_Enabled = defedtLicConId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLicConId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLicConId_Enabled), 5, 0), !bGXsfl_48_Refreshing);
   }

   public void startgridcontrol48( )
   {
      Gridtlicctr_level1itemContainer.AddObjectProperty("GridName", "Gridtlicctr_level1item");
      Gridtlicctr_level1itemContainer.AddObjectProperty("Header", subGridtlicctr_level1item_Header);
      Gridtlicctr_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtlicctr_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtlicctr_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtlicctr_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtlicctr_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtlicctr_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtlicctr_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtlicctr_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtlicctr_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A4105LicConId));
      Gridtlicctr_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLicConId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtlicctr_level1itemContainer.AddColumnProperties(Gridtlicctr_level1itemColumn);
      Gridtlicctr_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtlicctr_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A4106LicConDat));
      Gridtlicctr_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLicConDat_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtlicctr_level1itemContainer.AddColumnProperties(Gridtlicctr_level1itemColumn);
      Gridtlicctr_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtlicctr_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4107LicConUso, (byte)(1), (byte)(0), ".", "")));
      Gridtlicctr_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLicConUso_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtlicctr_level1itemContainer.AddColumnProperties(Gridtlicctr_level1itemColumn);
      Gridtlicctr_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtlicctr_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtlicctr_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtlicctr_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtlicctr_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtlicctr_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtlicctr_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtlicctr_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtlicctr_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtlicctr_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtlicctr_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtlicctr_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtlicctr_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtlicctr_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtLicPrdId_Internalname = "LICPRDID" ;
      edtLicPrdDat_Internalname = "LICPRDDAT" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtLicConId_Internalname = "LICCONID" ;
      edtLicConDat_Internalname = "LICCONDAT" ;
      edtLicConUso_Internalname = "LICCONUSO" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtlicctr_level1item_Internalname = "GRIDTLICCTR_LEVEL1ITEM" ;
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
      subGridtlicctr_level1item_Allowcollapsing = (byte)(0) ;
      subGridtlicctr_level1item_Allowselection = (byte)(0) ;
      subGridtlicctr_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Control de Licencias", "") );
      edtLicConUso_Jsonclick = "" ;
      edtLicConDat_Jsonclick = "" ;
      edtLicConId_Jsonclick = "" ;
      subGridtlicctr_level1item_Class = "Grid" ;
      subGridtlicctr_level1item_Backcolorstyle = (byte)(0) ;
      edtLicConUso_Enabled = 1 ;
      edtLicConDat_Enabled = 1 ;
      edtLicConId_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtLicPrdDat_Jsonclick = "" ;
      edtLicPrdDat_Enabled = 1 ;
      edtLicPrdId_Jsonclick = "" ;
      edtLicPrdId_Enabled = 1 ;
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

   public void gxnrgridtlicctr_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_481911( ) ;
      while ( nGXsfl_48_idx <= nRC_GXsfl_48 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalIQ1911( ) ;
         standaloneModalIQ1911( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowIQ1911( ) ;
         nGXsfl_48_idx = (int)(nGXsfl_48_idx+1) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_481911( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtlicctr_level1itemContainer)) ;
      /* End function gxnrGridtlicctr_level1item_newrow */
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
      GX_FocusControl = edtLicPrdDat_Internalname ;
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

   public void valid_Licprdid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4104LicPrdDat", GXutil.rtrim( A4104LicPrdDat));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4103LicPrdId", GXutil.rtrim( Z4103LicPrdId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4104LicPrdDat", GXutil.rtrim( Z4104LicPrdDat));
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
      setEventMetadata("VALID_LICPRDID","{handler:'valid_Licprdid',iparms:[{av:'A4103LicPrdId',fld:'LICPRDID',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_LICPRDID",",oparms:[{av:'A4104LicPrdDat',fld:'LICPRDDAT',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z4103LicPrdId'},{av:'Z4104LicPrdDat'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_LICCONID","{handler:'valid_Licconid',iparms:[]");
      setEventMetadata("VALID_LICCONID",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Licconuso',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z4103LicPrdId = "" ;
      Z4104LicPrdDat = "" ;
      Z4105LicConId = "" ;
      Z4106LicConDat = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A4103LicPrdId = "" ;
      A4104LicPrdDat = "" ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtlicctr_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1911 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A4105LicConId = "" ;
      A4106LicConDat = "" ;
      T00IQ6_A4103LicPrdId = new String[] {""} ;
      T00IQ6_A4104LicPrdDat = new String[] {""} ;
      T00IQ7_A4103LicPrdId = new String[] {""} ;
      T00IQ5_A4103LicPrdId = new String[] {""} ;
      T00IQ5_A4104LicPrdDat = new String[] {""} ;
      sMode1910 = "" ;
      T00IQ8_A4103LicPrdId = new String[] {""} ;
      T00IQ9_A4103LicPrdId = new String[] {""} ;
      T00IQ4_A4103LicPrdId = new String[] {""} ;
      T00IQ4_A4104LicPrdDat = new String[] {""} ;
      T00IQ13_A4103LicPrdId = new String[] {""} ;
      T00IQ14_A4103LicPrdId = new String[] {""} ;
      T00IQ14_A4105LicConId = new String[] {""} ;
      T00IQ14_A4106LicConDat = new String[] {""} ;
      T00IQ14_A4107LicConUso = new byte[1] ;
      T00IQ15_A4103LicPrdId = new String[] {""} ;
      T00IQ15_A4105LicConId = new String[] {""} ;
      T00IQ3_A4103LicPrdId = new String[] {""} ;
      T00IQ3_A4105LicConId = new String[] {""} ;
      T00IQ3_A4106LicConDat = new String[] {""} ;
      T00IQ3_A4107LicConUso = new byte[1] ;
      T00IQ2_A4103LicPrdId = new String[] {""} ;
      T00IQ2_A4105LicConId = new String[] {""} ;
      T00IQ2_A4106LicConDat = new String[] {""} ;
      T00IQ2_A4107LicConUso = new byte[1] ;
      T00IQ19_A4103LicPrdId = new String[] {""} ;
      T00IQ19_A4105LicConId = new String[] {""} ;
      Gridtlicctr_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtlicctr_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtlicctr_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      ZZ4103LicPrdId = "" ;
      ZZ4104LicPrdDat = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tlicctr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tlicctr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tlicctr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tlicctr__default(),
         new Object[] {
             new Object[] {
            T00IQ2_A4103LicPrdId, T00IQ2_A4105LicConId, T00IQ2_A4106LicConDat, T00IQ2_A4107LicConUso
            }
            , new Object[] {
            T00IQ3_A4103LicPrdId, T00IQ3_A4105LicConId, T00IQ3_A4106LicConDat, T00IQ3_A4107LicConUso
            }
            , new Object[] {
            T00IQ4_A4103LicPrdId, T00IQ4_A4104LicPrdDat
            }
            , new Object[] {
            T00IQ5_A4103LicPrdId, T00IQ5_A4104LicPrdDat
            }
            , new Object[] {
            T00IQ6_A4103LicPrdId, T00IQ6_A4104LicPrdDat
            }
            , new Object[] {
            T00IQ7_A4103LicPrdId
            }
            , new Object[] {
            T00IQ8_A4103LicPrdId
            }
            , new Object[] {
            T00IQ9_A4103LicPrdId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00IQ13_A4103LicPrdId
            }
            , new Object[] {
            T00IQ14_A4103LicPrdId, T00IQ14_A4105LicConId, T00IQ14_A4106LicConDat, T00IQ14_A4107LicConUso
            }
            , new Object[] {
            T00IQ15_A4103LicPrdId, T00IQ15_A4105LicConId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00IQ19_A4103LicPrdId, T00IQ19_A4105LicConId
            }
         }
      );
   }

   private byte Z4107LicConUso ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A4107LicConUso ;
   private byte Gx_BScreen ;
   private byte subGridtlicctr_level1item_Backcolorstyle ;
   private byte subGridtlicctr_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtlicctr_level1item_Allowselection ;
   private byte subGridtlicctr_level1item_Allowhovering ;
   private byte subGridtlicctr_level1item_Allowcollapsing ;
   private byte subGridtlicctr_level1item_Collapsed ;
   private short nRcdDeleted_1911 ;
   private short nRcdExists_1911 ;
   private short nIsMod_1911 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1911 ;
   private short RcdFound1911 ;
   private short nBlankRcdUsr1911 ;
   private short RcdFound1910 ;
   private short nIsDirty_1910 ;
   private short nIsDirty_1911 ;
   private int nRC_GXsfl_48 ;
   private int nGXsfl_48_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtLicPrdId_Enabled ;
   private int edtLicPrdDat_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtLicConId_Enabled ;
   private int edtLicConDat_Enabled ;
   private int edtLicConUso_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtlicctr_level1item_Backcolor ;
   private int subGridtlicctr_level1item_Allbackcolor ;
   private int defedtLicConId_Enabled ;
   private int idxLst ;
   private int subGridtlicctr_level1item_Selectedindex ;
   private int subGridtlicctr_level1item_Selectioncolor ;
   private int subGridtlicctr_level1item_Hoveringcolor ;
   private long GRIDTLICCTR_LEVEL1ITEM_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z4103LicPrdId ;
   private String Z4104LicPrdDat ;
   private String Z4105LicConId ;
   private String Z4106LicConDat ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLicPrdId_Internalname ;
   private String sGXsfl_48_idx="0001" ;
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
   private String A4103LicPrdId ;
   private String edtLicPrdId_Jsonclick ;
   private String edtLicPrdDat_Internalname ;
   private String A4104LicPrdDat ;
   private String edtLicPrdDat_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode1911 ;
   private String edtLicConId_Internalname ;
   private String edtLicConDat_Internalname ;
   private String edtLicConUso_Internalname ;
   private String sStyleString ;
   private String subGridtlicctr_level1item_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A4105LicConId ;
   private String A4106LicConDat ;
   private String sMode1910 ;
   private String sGXsfl_48_fel_idx="0001" ;
   private String subGridtlicctr_level1item_Class ;
   private String subGridtlicctr_level1item_Linesclass ;
   private String ROClassString ;
   private String edtLicConId_Jsonclick ;
   private String edtLicConDat_Jsonclick ;
   private String edtLicConUso_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtlicctr_level1item_Header ;
   private String ZZ4103LicPrdId ;
   private String ZZ4104LicPrdDat ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_48_Refreshing=false ;
   private com.genexus.webpanels.GXWebGrid Gridtlicctr_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtlicctr_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtlicctr_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private String[] T00IQ6_A4103LicPrdId ;
   private String[] T00IQ6_A4104LicPrdDat ;
   private String[] T00IQ7_A4103LicPrdId ;
   private String[] T00IQ5_A4103LicPrdId ;
   private String[] T00IQ5_A4104LicPrdDat ;
   private String[] T00IQ8_A4103LicPrdId ;
   private String[] T00IQ9_A4103LicPrdId ;
   private String[] T00IQ4_A4103LicPrdId ;
   private String[] T00IQ4_A4104LicPrdDat ;
   private String[] T00IQ13_A4103LicPrdId ;
   private String[] T00IQ14_A4103LicPrdId ;
   private String[] T00IQ14_A4105LicConId ;
   private String[] T00IQ14_A4106LicConDat ;
   private byte[] T00IQ14_A4107LicConUso ;
   private String[] T00IQ15_A4103LicPrdId ;
   private String[] T00IQ15_A4105LicConId ;
   private String[] T00IQ3_A4103LicPrdId ;
   private String[] T00IQ3_A4105LicConId ;
   private String[] T00IQ3_A4106LicConDat ;
   private byte[] T00IQ3_A4107LicConUso ;
   private String[] T00IQ2_A4103LicPrdId ;
   private String[] T00IQ2_A4105LicConId ;
   private String[] T00IQ2_A4106LicConDat ;
   private byte[] T00IQ2_A4107LicConUso ;
   private String[] T00IQ19_A4103LicPrdId ;
   private String[] T00IQ19_A4105LicConId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tlicctr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlicctr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlicctr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlicctr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00IQ2", "SELECT LicPrdId, LicConId, LicConDat, LicConUso FROM TXPLICCT1 WHERE LicPrdId = ? AND LicConId = ?  FOR UPDATE OF LicConDat, LicConUso NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IQ3", "SELECT LicPrdId, LicConId, LicConDat, LicConUso FROM TXPLICCT1 WHERE LicPrdId = ? AND LicConId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IQ4", "SELECT LicPrdId, LicPrdDat FROM TXPLICPRD WHERE LicPrdId = ?  FOR UPDATE OF LicPrdDat NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IQ5", "SELECT LicPrdId, LicPrdDat FROM TXPLICPRD WHERE LicPrdId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IQ6", "SELECT /*+ FIRST_ROWS(100) */ TM1.LicPrdId, TM1.LicPrdDat FROM TXPLICPRD TM1 WHERE TM1.LicPrdId = ? ORDER BY TM1.LicPrdId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IQ7", "SELECT /*+ FIRST_ROWS(1) */ LicPrdId FROM TXPLICPRD WHERE LicPrdId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IQ8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ LicPrdId FROM TXPLICPRD WHERE ( LicPrdId > ?) ORDER BY LicPrdId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00IQ9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ LicPrdId FROM TXPLICPRD WHERE ( LicPrdId < ?) ORDER BY LicPrdId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00IQ10", "INSERT INTO TXPLICPRD(LicPrdId, LicPrdDat) VALUES(?, ?)", GX_NOMASK, "TXPLICPRD")
         ,new UpdateCursor("T00IQ11", "UPDATE TXPLICPRD SET LicPrdDat=?  WHERE LicPrdId = ?", GX_NOMASK, "TXPLICPRD")
         ,new UpdateCursor("T00IQ12", "DELETE FROM TXPLICPRD  WHERE LicPrdId = ?", GX_NOMASK, "TXPLICPRD")
         ,new ForEachCursor("T00IQ13", "SELECT /*+ FIRST_ROWS(100) */ LicPrdId FROM TXPLICPRD ORDER BY LicPrdId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IQ14", "SELECT LicPrdId, LicConId, LicConDat, LicConUso FROM TXPLICCT1 WHERE LicPrdId = ? and LicConId = ? ORDER BY LicPrdId, LicConId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IQ15", "SELECT LicPrdId, LicConId FROM TXPLICCT1 WHERE LicPrdId = ? AND LicConId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00IQ16", "INSERT INTO TXPLICCT1(LicPrdId, LicConId, LicConDat, LicConUso) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPLICCT1")
         ,new UpdateCursor("T00IQ17", "UPDATE TXPLICCT1 SET LicConDat=?, LicConUso=?  WHERE LicPrdId = ? AND LicConId = ?", GX_NOMASK, "TXPLICCT1")
         ,new UpdateCursor("T00IQ18", "DELETE FROM TXPLICCT1  WHERE LicPrdId = ? AND LicConId = ?", GX_NOMASK, "TXPLICCT1")
         ,new ForEachCursor("T00IQ19", "SELECT LicPrdId, LicConId FROM TXPLICCT1 WHERE LicPrdId = ? ORDER BY LicPrdId, LicConId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
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
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 4);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 4);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 4);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 4);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 4);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 4);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 100);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 4);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 100);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 100);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 20);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 4);
               return;
      }
   }

}

