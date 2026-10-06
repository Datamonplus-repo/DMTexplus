package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrparpr_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MRPar Pr", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMRParPrId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public mrparpr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrparpr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrparpr_impl.class ));
   }

   public mrparpr_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "MRPar Pr", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRParPr.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Ingenieria\\MRParPr.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRParPrId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRParPrId_Internalname, httpContext.getMessage( "Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRParPrId_Internalname, GXutil.ltrim( localUtil.ntoc( A14680MRParPrId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRParPrId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14680MRParPrId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14680MRParPrId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRParPrId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRParPrId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRParPrCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRParPrCod_Internalname, httpContext.getMessage( "parametro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRParPrCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14778MRParPrCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRParPrCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14778MRParPrCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14778MRParPrCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRParPrCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRParPrCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRParPrDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRParPrDsc_Internalname, httpContext.getMessage( "Parametro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRParPrDsc_Internalname, A14779MRParPrDsc, GXutil.rtrim( localUtil.format( A14779MRParPrDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRParPrDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRParPrDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRParPrPLC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRParPrPLC_Internalname, httpContext.getMessage( "c/PLC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRParPrPLC_Internalname, A14749MRParPrPLC, GXutil.rtrim( localUtil.format( A14749MRParPrPLC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRParPrPLC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRParPrPLC_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRParPrUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRParPrUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRParPrUsu_Internalname, GXutil.rtrim( A14780MRParPrUsu), GXutil.rtrim( localUtil.format( A14780MRParPrUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRParPrUsu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRParPrUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRParPrIp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRParPrIp_Internalname, httpContext.getMessage( "Ip", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRParPrIp_Internalname, A14781MRParPrIp, GXutil.rtrim( localUtil.format( A14781MRParPrIp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRParPrIp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRParPrIp_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Ip", "left", true, "", "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRParPrReg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRParPrReg_Internalname, httpContext.getMessage( "Registro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMRParPrReg_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRParPrReg_Internalname, localUtil.ttoc( A14782MRParPrReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14782MRParPrReg, "99/99/99 99:99:99.999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRParPrReg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRParPrReg_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMRParPrReg_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMRParPrReg_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MRParPr.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRParPrTkn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRParPrTkn_Internalname, httpContext.getMessage( "Token", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMRParPrTkn_Internalname, A14783MRParPrTkn, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", (short)(0), 1, edtMRParPrTkn_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRParPrHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRParPrHdr_Internalname, httpContext.getMessage( "Pr Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRParPrHdr_Internalname, GXutil.rtrim( A14784MRParPrHdr), GXutil.rtrim( localUtil.format( A14784MRParPrHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRParPrHdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRParPrHdr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Hdr", "left", true, "", "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRParPrMaq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRParPrMaq_Internalname, httpContext.getMessage( "Maq Cod", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRParPrMaq_Internalname, GXutil.rtrim( A14785MRParPrMaq), GXutil.rtrim( localUtil.format( A14785MRParPrMaq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRParPrMaq_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRParPrMaq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\MaqCod", "left", true, "", "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRParPrFas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRParPrFas_Internalname, httpContext.getMessage( "Fas Cod", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRParPrFas_Internalname, GXutil.rtrim( A14786MRParPrFas), GXutil.rtrim( localUtil.format( A14786MRParPrFas, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRParPrFas_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRParPrFas_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\FasCod", "left", true, "", "HLP_Ingenieria\\MRParPr.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRParPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRParPr.htm");
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
         Z14680MRParPrId = localUtil.ctol( httpContext.cgiGet( "Z14680MRParPrId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14778MRParPrCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z14778MRParPrCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14779MRParPrDsc = httpContext.cgiGet( "Z14779MRParPrDsc") ;
         Z14749MRParPrPLC = httpContext.cgiGet( "Z14749MRParPrPLC") ;
         Z14780MRParPrUsu = httpContext.cgiGet( "Z14780MRParPrUsu") ;
         Z14781MRParPrIp = httpContext.cgiGet( "Z14781MRParPrIp") ;
         Z14782MRParPrReg = localUtil.ctot( httpContext.cgiGet( "Z14782MRParPrReg"), 0) ;
         Z14783MRParPrTkn = httpContext.cgiGet( "Z14783MRParPrTkn") ;
         Z14784MRParPrHdr = httpContext.cgiGet( "Z14784MRParPrHdr") ;
         Z14785MRParPrMaq = httpContext.cgiGet( "Z14785MRParPrMaq") ;
         Z14786MRParPrFas = httpContext.cgiGet( "Z14786MRParPrFas") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRParPrId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRParPrId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRPARPRID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRParPrId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14680MRParPrId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14680MRParPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14680MRParPrId), 10, 0));
         }
         else
         {
            A14680MRParPrId = localUtil.ctol( httpContext.cgiGet( edtMRParPrId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14680MRParPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14680MRParPrId), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRParPrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRParPrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRPARPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRParPrCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14778MRParPrCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14778MRParPrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14778MRParPrCod), 4, 0));
         }
         else
         {
            A14778MRParPrCod = (short)(localUtil.ctol( httpContext.cgiGet( edtMRParPrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14778MRParPrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14778MRParPrCod), 4, 0));
         }
         A14779MRParPrDsc = httpContext.cgiGet( edtMRParPrDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14779MRParPrDsc", A14779MRParPrDsc);
         A14749MRParPrPLC = httpContext.cgiGet( edtMRParPrPLC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14749MRParPrPLC", A14749MRParPrPLC);
         A14780MRParPrUsu = httpContext.cgiGet( edtMRParPrUsu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14780MRParPrUsu", A14780MRParPrUsu);
         A14781MRParPrIp = httpContext.cgiGet( edtMRParPrIp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14781MRParPrIp", A14781MRParPrIp);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMRParPrReg_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MRPARPRREG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRParPrReg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14782MRParPrReg = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14782MRParPrReg", localUtil.ttoc( A14782MRParPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14782MRParPrReg = localUtil.ctot( httpContext.cgiGet( edtMRParPrReg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14782MRParPrReg", localUtil.ttoc( A14782MRParPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A14783MRParPrTkn = httpContext.cgiGet( edtMRParPrTkn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14783MRParPrTkn", A14783MRParPrTkn);
         A14784MRParPrHdr = httpContext.cgiGet( edtMRParPrHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14784MRParPrHdr", A14784MRParPrHdr);
         A14785MRParPrMaq = httpContext.cgiGet( edtMRParPrMaq_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14785MRParPrMaq", A14785MRParPrMaq);
         A14786MRParPrFas = httpContext.cgiGet( edtMRParPrFas_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14786MRParPrFas", A14786MRParPrFas);
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
            A14680MRParPrId = GXutil.lval( httpContext.GetPar( "MRParPrId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14680MRParPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14680MRParPrId), 10, 0));
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
            initAll1WC1924( ) ;
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
      disableAttributes1WC1924( ) ;
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

   public void resetCaption1WC0( )
   {
   }

   public void zm1WC1924( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14778MRParPrCod = T01WC3_A14778MRParPrCod[0] ;
            Z14779MRParPrDsc = T01WC3_A14779MRParPrDsc[0] ;
            Z14749MRParPrPLC = T01WC3_A14749MRParPrPLC[0] ;
            Z14780MRParPrUsu = T01WC3_A14780MRParPrUsu[0] ;
            Z14781MRParPrIp = T01WC3_A14781MRParPrIp[0] ;
            Z14782MRParPrReg = T01WC3_A14782MRParPrReg[0] ;
            Z14783MRParPrTkn = T01WC3_A14783MRParPrTkn[0] ;
            Z14784MRParPrHdr = T01WC3_A14784MRParPrHdr[0] ;
            Z14785MRParPrMaq = T01WC3_A14785MRParPrMaq[0] ;
            Z14786MRParPrFas = T01WC3_A14786MRParPrFas[0] ;
         }
         else
         {
            Z14778MRParPrCod = A14778MRParPrCod ;
            Z14779MRParPrDsc = A14779MRParPrDsc ;
            Z14749MRParPrPLC = A14749MRParPrPLC ;
            Z14780MRParPrUsu = A14780MRParPrUsu ;
            Z14781MRParPrIp = A14781MRParPrIp ;
            Z14782MRParPrReg = A14782MRParPrReg ;
            Z14783MRParPrTkn = A14783MRParPrTkn ;
            Z14784MRParPrHdr = A14784MRParPrHdr ;
            Z14785MRParPrMaq = A14785MRParPrMaq ;
            Z14786MRParPrFas = A14786MRParPrFas ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z14680MRParPrId = A14680MRParPrId ;
         Z14778MRParPrCod = A14778MRParPrCod ;
         Z14779MRParPrDsc = A14779MRParPrDsc ;
         Z14749MRParPrPLC = A14749MRParPrPLC ;
         Z14780MRParPrUsu = A14780MRParPrUsu ;
         Z14781MRParPrIp = A14781MRParPrIp ;
         Z14782MRParPrReg = A14782MRParPrReg ;
         Z14783MRParPrTkn = A14783MRParPrTkn ;
         Z14784MRParPrHdr = A14784MRParPrHdr ;
         Z14785MRParPrMaq = A14785MRParPrMaq ;
         Z14786MRParPrFas = A14786MRParPrFas ;
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

   public void load1WC1924( )
   {
      /* Using cursor T01WC4 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14680MRParPrId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1924 = (short)(1) ;
         A14778MRParPrCod = T01WC4_A14778MRParPrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14778MRParPrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14778MRParPrCod), 4, 0));
         A14779MRParPrDsc = T01WC4_A14779MRParPrDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14779MRParPrDsc", A14779MRParPrDsc);
         A14749MRParPrPLC = T01WC4_A14749MRParPrPLC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14749MRParPrPLC", A14749MRParPrPLC);
         A14780MRParPrUsu = T01WC4_A14780MRParPrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14780MRParPrUsu", A14780MRParPrUsu);
         A14781MRParPrIp = T01WC4_A14781MRParPrIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14781MRParPrIp", A14781MRParPrIp);
         A14782MRParPrReg = T01WC4_A14782MRParPrReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14782MRParPrReg", localUtil.ttoc( A14782MRParPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14783MRParPrTkn = T01WC4_A14783MRParPrTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14783MRParPrTkn", A14783MRParPrTkn);
         A14784MRParPrHdr = T01WC4_A14784MRParPrHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14784MRParPrHdr", A14784MRParPrHdr);
         A14785MRParPrMaq = T01WC4_A14785MRParPrMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14785MRParPrMaq", A14785MRParPrMaq);
         A14786MRParPrFas = T01WC4_A14786MRParPrFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14786MRParPrFas", A14786MRParPrFas);
         zm1WC1924( -1) ;
      }
      pr_default.close(2);
      onLoadActions1WC1924( ) ;
   }

   public void onLoadActions1WC1924( )
   {
   }

   public void checkExtendedTable1WC1924( )
   {
      nIsDirty_1924 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1WC1924( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1WC1924( )
   {
      /* Using cursor T01WC5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14680MRParPrId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1924 = (short)(1) ;
      }
      else
      {
         RcdFound1924 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01WC3 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14680MRParPrId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1WC1924( 1) ;
         RcdFound1924 = (short)(1) ;
         A14680MRParPrId = T01WC3_A14680MRParPrId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14680MRParPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14680MRParPrId), 10, 0));
         A14778MRParPrCod = T01WC3_A14778MRParPrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14778MRParPrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14778MRParPrCod), 4, 0));
         A14779MRParPrDsc = T01WC3_A14779MRParPrDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14779MRParPrDsc", A14779MRParPrDsc);
         A14749MRParPrPLC = T01WC3_A14749MRParPrPLC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14749MRParPrPLC", A14749MRParPrPLC);
         A14780MRParPrUsu = T01WC3_A14780MRParPrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14780MRParPrUsu", A14780MRParPrUsu);
         A14781MRParPrIp = T01WC3_A14781MRParPrIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14781MRParPrIp", A14781MRParPrIp);
         A14782MRParPrReg = T01WC3_A14782MRParPrReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14782MRParPrReg", localUtil.ttoc( A14782MRParPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14783MRParPrTkn = T01WC3_A14783MRParPrTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14783MRParPrTkn", A14783MRParPrTkn);
         A14784MRParPrHdr = T01WC3_A14784MRParPrHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14784MRParPrHdr", A14784MRParPrHdr);
         A14785MRParPrMaq = T01WC3_A14785MRParPrMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14785MRParPrMaq", A14785MRParPrMaq);
         A14786MRParPrFas = T01WC3_A14786MRParPrFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14786MRParPrFas", A14786MRParPrFas);
         Z14680MRParPrId = A14680MRParPrId ;
         sMode1924 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1WC1924( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1924 = (short)(0) ;
            initializeNonKey1WC1924( ) ;
         }
         Gx_mode = sMode1924 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1924 = (short)(0) ;
         initializeNonKey1WC1924( ) ;
         sMode1924 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1924 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1WC1924( ) ;
      if ( RcdFound1924 == 0 )
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
      RcdFound1924 = (short)(0) ;
      /* Using cursor T01WC6 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14680MRParPrId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01WC6_A14680MRParPrId[0] < A14680MRParPrId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01WC6_A14680MRParPrId[0] > A14680MRParPrId ) ) )
         {
            A14680MRParPrId = T01WC6_A14680MRParPrId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14680MRParPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14680MRParPrId), 10, 0));
            RcdFound1924 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1924 = (short)(0) ;
      /* Using cursor T01WC7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14680MRParPrId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01WC7_A14680MRParPrId[0] > A14680MRParPrId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01WC7_A14680MRParPrId[0] < A14680MRParPrId ) ) )
         {
            A14680MRParPrId = T01WC7_A14680MRParPrId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14680MRParPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14680MRParPrId), 10, 0));
            RcdFound1924 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1WC1924( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMRParPrId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1WC1924( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1924 == 1 )
         {
            if ( A14680MRParPrId != Z14680MRParPrId )
            {
               A14680MRParPrId = Z14680MRParPrId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14680MRParPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14680MRParPrId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MRPARPRID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMRParPrId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMRParPrId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1WC1924( ) ;
               GX_FocusControl = edtMRParPrId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14680MRParPrId != Z14680MRParPrId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMRParPrId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1WC1924( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MRPARPRID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMRParPrId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtMRParPrId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1WC1924( ) ;
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
      if ( A14680MRParPrId != Z14680MRParPrId )
      {
         A14680MRParPrId = Z14680MRParPrId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14680MRParPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14680MRParPrId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MRPARPRID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRParPrId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMRParPrId_Internalname ;
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
      if ( RcdFound1924 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "MRPARPRID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRParPrId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMRParPrCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1WC1924( ) ;
      if ( RcdFound1924 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMRParPrCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1WC1924( ) ;
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
      if ( RcdFound1924 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMRParPrCod_Internalname ;
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
      if ( RcdFound1924 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMRParPrCod_Internalname ;
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
      scanStart1WC1924( ) ;
      if ( RcdFound1924 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1924 != 0 )
         {
            scanNext1WC1924( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMRParPrCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1WC1924( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1WC1924( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01WC2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14680MRParPrId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MRParPr"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z14778MRParPrCod != T01WC2_A14778MRParPrCod[0] ) || ( GXutil.strcmp(Z14779MRParPrDsc, T01WC2_A14779MRParPrDsc[0]) != 0 ) || ( GXutil.strcmp(Z14749MRParPrPLC, T01WC2_A14749MRParPrPLC[0]) != 0 ) || ( GXutil.strcmp(Z14780MRParPrUsu, T01WC2_A14780MRParPrUsu[0]) != 0 ) || ( GXutil.strcmp(Z14781MRParPrIp, T01WC2_A14781MRParPrIp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z14782MRParPrReg, T01WC2_A14782MRParPrReg[0]) ) || ( GXutil.strcmp(Z14783MRParPrTkn, T01WC2_A14783MRParPrTkn[0]) != 0 ) || ( GXutil.strcmp(Z14784MRParPrHdr, T01WC2_A14784MRParPrHdr[0]) != 0 ) || ( GXutil.strcmp(Z14785MRParPrMaq, T01WC2_A14785MRParPrMaq[0]) != 0 ) || ( GXutil.strcmp(Z14786MRParPrFas, T01WC2_A14786MRParPrFas[0]) != 0 ) )
         {
            if ( Z14778MRParPrCod != T01WC2_A14778MRParPrCod[0] )
            {
               GXutil.writeLogln("ingenieria.mrparpr:[seudo value changed for attri]"+"MRParPrCod");
               GXutil.writeLogRaw("Old: ",Z14778MRParPrCod);
               GXutil.writeLogRaw("Current: ",T01WC2_A14778MRParPrCod[0]);
            }
            if ( GXutil.strcmp(Z14779MRParPrDsc, T01WC2_A14779MRParPrDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrparpr:[seudo value changed for attri]"+"MRParPrDsc");
               GXutil.writeLogRaw("Old: ",Z14779MRParPrDsc);
               GXutil.writeLogRaw("Current: ",T01WC2_A14779MRParPrDsc[0]);
            }
            if ( GXutil.strcmp(Z14749MRParPrPLC, T01WC2_A14749MRParPrPLC[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrparpr:[seudo value changed for attri]"+"MRParPrPLC");
               GXutil.writeLogRaw("Old: ",Z14749MRParPrPLC);
               GXutil.writeLogRaw("Current: ",T01WC2_A14749MRParPrPLC[0]);
            }
            if ( GXutil.strcmp(Z14780MRParPrUsu, T01WC2_A14780MRParPrUsu[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrparpr:[seudo value changed for attri]"+"MRParPrUsu");
               GXutil.writeLogRaw("Old: ",Z14780MRParPrUsu);
               GXutil.writeLogRaw("Current: ",T01WC2_A14780MRParPrUsu[0]);
            }
            if ( GXutil.strcmp(Z14781MRParPrIp, T01WC2_A14781MRParPrIp[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrparpr:[seudo value changed for attri]"+"MRParPrIp");
               GXutil.writeLogRaw("Old: ",Z14781MRParPrIp);
               GXutil.writeLogRaw("Current: ",T01WC2_A14781MRParPrIp[0]);
            }
            if ( !( GXutil.dateCompare(Z14782MRParPrReg, T01WC2_A14782MRParPrReg[0]) ) )
            {
               GXutil.writeLogln("ingenieria.mrparpr:[seudo value changed for attri]"+"MRParPrReg");
               GXutil.writeLogRaw("Old: ",Z14782MRParPrReg);
               GXutil.writeLogRaw("Current: ",T01WC2_A14782MRParPrReg[0]);
            }
            if ( GXutil.strcmp(Z14783MRParPrTkn, T01WC2_A14783MRParPrTkn[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrparpr:[seudo value changed for attri]"+"MRParPrTkn");
               GXutil.writeLogRaw("Old: ",Z14783MRParPrTkn);
               GXutil.writeLogRaw("Current: ",T01WC2_A14783MRParPrTkn[0]);
            }
            if ( GXutil.strcmp(Z14784MRParPrHdr, T01WC2_A14784MRParPrHdr[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrparpr:[seudo value changed for attri]"+"MRParPrHdr");
               GXutil.writeLogRaw("Old: ",Z14784MRParPrHdr);
               GXutil.writeLogRaw("Current: ",T01WC2_A14784MRParPrHdr[0]);
            }
            if ( GXutil.strcmp(Z14785MRParPrMaq, T01WC2_A14785MRParPrMaq[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrparpr:[seudo value changed for attri]"+"MRParPrMaq");
               GXutil.writeLogRaw("Old: ",Z14785MRParPrMaq);
               GXutil.writeLogRaw("Current: ",T01WC2_A14785MRParPrMaq[0]);
            }
            if ( GXutil.strcmp(Z14786MRParPrFas, T01WC2_A14786MRParPrFas[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrparpr:[seudo value changed for attri]"+"MRParPrFas");
               GXutil.writeLogRaw("Old: ",Z14786MRParPrFas);
               GXutil.writeLogRaw("Current: ",T01WC2_A14786MRParPrFas[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"MRParPr"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1WC1924( )
   {
      beforeValidate1WC1924( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1WC1924( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1WC1924( 0) ;
         checkOptimisticConcurrency1WC1924( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1WC1924( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1WC1924( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01WC8 */
                  pr_default.execute(6, new Object[] {Short.valueOf(A14778MRParPrCod), A14779MRParPrDsc, A14749MRParPrPLC, A14780MRParPrUsu, A14781MRParPrIp, A14782MRParPrReg, A14783MRParPrTkn, A14784MRParPrHdr, A14785MRParPrMaq, A14786MRParPrFas});
                  /* Retrieving last key number assigned */
                  /* Using cursor T01WC9 */
                  pr_default.execute(7);
                  A14680MRParPrId = T01WC9_A14680MRParPrId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14680MRParPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14680MRParPrId), 10, 0));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MRParPr");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1WC0( ) ;
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
            load1WC1924( ) ;
         }
         endLevel1WC1924( ) ;
      }
      closeExtendedTableCursors1WC1924( ) ;
   }

   public void update1WC1924( )
   {
      beforeValidate1WC1924( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1WC1924( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1WC1924( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1WC1924( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1WC1924( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01WC10 */
                  pr_default.execute(8, new Object[] {Short.valueOf(A14778MRParPrCod), A14779MRParPrDsc, A14749MRParPrPLC, A14780MRParPrUsu, A14781MRParPrIp, A14782MRParPrReg, A14783MRParPrTkn, A14784MRParPrHdr, A14785MRParPrMaq, A14786MRParPrFas, Long.valueOf(A14680MRParPrId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MRParPr");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MRParPr"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1WC1924( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1WC0( ) ;
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
         endLevel1WC1924( ) ;
      }
      closeExtendedTableCursors1WC1924( ) ;
   }

   public void deferredUpdate1WC1924( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1WC1924( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1WC1924( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1WC1924( ) ;
         afterConfirm1WC1924( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1WC1924( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01WC11 */
               pr_default.execute(9, new Object[] {Long.valueOf(A14680MRParPrId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("MRParPr");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1924 == 0 )
                     {
                        initAll1WC1924( ) ;
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
                     resetCaption1WC0( ) ;
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
      sMode1924 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1WC1924( ) ;
      Gx_mode = sMode1924 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1WC1924( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1WC1924( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1WC1924( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.mrparpr");
         if ( AnyError == 0 )
         {
            confirmValues1WC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ingenieria.mrparpr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1WC1924( )
   {
      /* Using cursor T01WC12 */
      pr_default.execute(10);
      RcdFound1924 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1924 = (short)(1) ;
         A14680MRParPrId = T01WC12_A14680MRParPrId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14680MRParPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14680MRParPrId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1WC1924( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1924 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1924 = (short)(1) ;
         A14680MRParPrId = T01WC12_A14680MRParPrId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14680MRParPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14680MRParPrId), 10, 0));
      }
   }

   public void scanEnd1WC1924( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1WC1924( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1WC1924( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1WC1924( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1WC1924( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1WC1924( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1WC1924( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1WC1924( )
   {
      edtMRParPrId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRParPrId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRParPrId_Enabled), 5, 0), true);
      edtMRParPrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRParPrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRParPrCod_Enabled), 5, 0), true);
      edtMRParPrDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRParPrDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRParPrDsc_Enabled), 5, 0), true);
      edtMRParPrPLC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRParPrPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRParPrPLC_Enabled), 5, 0), true);
      edtMRParPrUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRParPrUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRParPrUsu_Enabled), 5, 0), true);
      edtMRParPrIp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRParPrIp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRParPrIp_Enabled), 5, 0), true);
      edtMRParPrReg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRParPrReg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRParPrReg_Enabled), 5, 0), true);
      edtMRParPrTkn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRParPrTkn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRParPrTkn_Enabled), 5, 0), true);
      edtMRParPrHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRParPrHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRParPrHdr_Enabled), 5, 0), true);
      edtMRParPrMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRParPrMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRParPrMaq_Enabled), 5, 0), true);
      edtMRParPrFas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRParPrFas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRParPrFas_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1WC1924( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1WC0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mrparpr", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14680MRParPrId", GXutil.ltrim( localUtil.ntoc( Z14680MRParPrId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14778MRParPrCod", GXutil.ltrim( localUtil.ntoc( Z14778MRParPrCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14779MRParPrDsc", Z14779MRParPrDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14749MRParPrPLC", Z14749MRParPrPLC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14780MRParPrUsu", GXutil.rtrim( Z14780MRParPrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14781MRParPrIp", Z14781MRParPrIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14782MRParPrReg", localUtil.ttoc( Z14782MRParPrReg, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14783MRParPrTkn", Z14783MRParPrTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14784MRParPrHdr", GXutil.rtrim( Z14784MRParPrHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14785MRParPrMaq", GXutil.rtrim( Z14785MRParPrMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14786MRParPrFas", GXutil.rtrim( Z14786MRParPrFas));
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
      return formatLink("app.ingenieria.mrparpr", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.MRParPr" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MRPar Pr", "") ;
   }

   public void initializeNonKey1WC1924( )
   {
      A14778MRParPrCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14778MRParPrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14778MRParPrCod), 4, 0));
      A14779MRParPrDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14779MRParPrDsc", A14779MRParPrDsc);
      A14749MRParPrPLC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14749MRParPrPLC", A14749MRParPrPLC);
      A14780MRParPrUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14780MRParPrUsu", A14780MRParPrUsu);
      A14781MRParPrIp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14781MRParPrIp", A14781MRParPrIp);
      A14782MRParPrReg = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14782MRParPrReg", localUtil.ttoc( A14782MRParPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14783MRParPrTkn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14783MRParPrTkn", A14783MRParPrTkn);
      A14784MRParPrHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14784MRParPrHdr", A14784MRParPrHdr);
      A14785MRParPrMaq = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14785MRParPrMaq", A14785MRParPrMaq);
      A14786MRParPrFas = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14786MRParPrFas", A14786MRParPrFas);
      Z14778MRParPrCod = (short)(0) ;
      Z14779MRParPrDsc = "" ;
      Z14749MRParPrPLC = "" ;
      Z14780MRParPrUsu = "" ;
      Z14781MRParPrIp = "" ;
      Z14782MRParPrReg = GXutil.resetTime( GXutil.nullDate() );
      Z14783MRParPrTkn = "" ;
      Z14784MRParPrHdr = "" ;
      Z14785MRParPrMaq = "" ;
      Z14786MRParPrFas = "" ;
   }

   public void initAll1WC1924( )
   {
      A14680MRParPrId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14680MRParPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14680MRParPrId), 10, 0));
      initializeNonKey1WC1924( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671011105150", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/mrparpr.js", "?202671011105150", false, true);
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
      edtMRParPrId_Internalname = "MRPARPRID" ;
      edtMRParPrCod_Internalname = "MRPARPRCOD" ;
      edtMRParPrDsc_Internalname = "MRPARPRDSC" ;
      edtMRParPrPLC_Internalname = "MRPARPRPLC" ;
      edtMRParPrUsu_Internalname = "MRPARPRUSU" ;
      edtMRParPrIp_Internalname = "MRPARPRIP" ;
      edtMRParPrReg_Internalname = "MRPARPRREG" ;
      edtMRParPrTkn_Internalname = "MRPARPRTKN" ;
      edtMRParPrHdr_Internalname = "MRPARPRHDR" ;
      edtMRParPrMaq_Internalname = "MRPARPRMAQ" ;
      edtMRParPrFas_Internalname = "MRPARPRFAS" ;
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
      Form.setCaption( httpContext.getMessage( "MRPar Pr", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMRParPrFas_Jsonclick = "" ;
      edtMRParPrFas_Enabled = 1 ;
      edtMRParPrMaq_Jsonclick = "" ;
      edtMRParPrMaq_Enabled = 1 ;
      edtMRParPrHdr_Jsonclick = "" ;
      edtMRParPrHdr_Enabled = 1 ;
      edtMRParPrTkn_Enabled = 1 ;
      edtMRParPrReg_Jsonclick = "" ;
      edtMRParPrReg_Enabled = 1 ;
      edtMRParPrIp_Jsonclick = "" ;
      edtMRParPrIp_Enabled = 1 ;
      edtMRParPrUsu_Jsonclick = "" ;
      edtMRParPrUsu_Enabled = 1 ;
      edtMRParPrPLC_Jsonclick = "" ;
      edtMRParPrPLC_Enabled = 1 ;
      edtMRParPrDsc_Jsonclick = "" ;
      edtMRParPrDsc_Enabled = 1 ;
      edtMRParPrCod_Jsonclick = "" ;
      edtMRParPrCod_Enabled = 1 ;
      edtMRParPrId_Jsonclick = "" ;
      edtMRParPrId_Enabled = 1 ;
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
      GX_FocusControl = edtMRParPrCod_Internalname ;
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

   public void valid_Mrparprid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14778MRParPrCod", GXutil.ltrim( localUtil.ntoc( A14778MRParPrCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14779MRParPrDsc", A14779MRParPrDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14749MRParPrPLC", A14749MRParPrPLC);
      httpContext.ajax_rsp_assign_attri("", false, "A14780MRParPrUsu", GXutil.rtrim( A14780MRParPrUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A14781MRParPrIp", A14781MRParPrIp);
      httpContext.ajax_rsp_assign_attri("", false, "A14782MRParPrReg", localUtil.ttoc( A14782MRParPrReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14783MRParPrTkn", A14783MRParPrTkn);
      httpContext.ajax_rsp_assign_attri("", false, "A14784MRParPrHdr", GXutil.rtrim( A14784MRParPrHdr));
      httpContext.ajax_rsp_assign_attri("", false, "A14785MRParPrMaq", GXutil.rtrim( A14785MRParPrMaq));
      httpContext.ajax_rsp_assign_attri("", false, "A14786MRParPrFas", GXutil.rtrim( A14786MRParPrFas));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14680MRParPrId", GXutil.ltrim( localUtil.ntoc( Z14680MRParPrId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14778MRParPrCod", GXutil.ltrim( localUtil.ntoc( Z14778MRParPrCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14779MRParPrDsc", Z14779MRParPrDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14749MRParPrPLC", Z14749MRParPrPLC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14780MRParPrUsu", GXutil.rtrim( Z14780MRParPrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14781MRParPrIp", Z14781MRParPrIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14782MRParPrReg", localUtil.ttoc( Z14782MRParPrReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14783MRParPrTkn", Z14783MRParPrTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14784MRParPrHdr", GXutil.rtrim( Z14784MRParPrHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14785MRParPrMaq", GXutil.rtrim( Z14785MRParPrMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14786MRParPrFas", GXutil.rtrim( Z14786MRParPrFas));
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
      setEventMetadata("VALID_MRPARPRID","{handler:'valid_Mrparprid',iparms:[{av:'A14680MRParPrId',fld:'MRPARPRID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MRPARPRID",",oparms:[{av:'A14778MRParPrCod',fld:'MRPARPRCOD',pic:'ZZZ9'},{av:'A14779MRParPrDsc',fld:'MRPARPRDSC',pic:''},{av:'A14749MRParPrPLC',fld:'MRPARPRPLC',pic:''},{av:'A14780MRParPrUsu',fld:'MRPARPRUSU',pic:''},{av:'A14781MRParPrIp',fld:'MRPARPRIP',pic:''},{av:'A14782MRParPrReg',fld:'MRPARPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14783MRParPrTkn',fld:'MRPARPRTKN',pic:''},{av:'A14784MRParPrHdr',fld:'MRPARPRHDR',pic:''},{av:'A14785MRParPrMaq',fld:'MRPARPRMAQ',pic:''},{av:'A14786MRParPrFas',fld:'MRPARPRFAS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14680MRParPrId'},{av:'Z14778MRParPrCod'},{av:'Z14779MRParPrDsc'},{av:'Z14749MRParPrPLC'},{av:'Z14780MRParPrUsu'},{av:'Z14781MRParPrIp'},{av:'Z14782MRParPrReg'},{av:'Z14783MRParPrTkn'},{av:'Z14784MRParPrHdr'},{av:'Z14785MRParPrMaq'},{av:'Z14786MRParPrFas'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      Z14779MRParPrDsc = "" ;
      Z14749MRParPrPLC = "" ;
      Z14780MRParPrUsu = "" ;
      Z14781MRParPrIp = "" ;
      Z14782MRParPrReg = GXutil.resetTime( GXutil.nullDate() );
      Z14783MRParPrTkn = "" ;
      Z14784MRParPrHdr = "" ;
      Z14785MRParPrMaq = "" ;
      Z14786MRParPrFas = "" ;
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
      A14779MRParPrDsc = "" ;
      A14749MRParPrPLC = "" ;
      A14780MRParPrUsu = "" ;
      A14781MRParPrIp = "" ;
      A14782MRParPrReg = GXutil.resetTime( GXutil.nullDate() );
      A14783MRParPrTkn = "" ;
      A14784MRParPrHdr = "" ;
      A14785MRParPrMaq = "" ;
      A14786MRParPrFas = "" ;
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
      T01WC4_A14680MRParPrId = new long[1] ;
      T01WC4_A14778MRParPrCod = new short[1] ;
      T01WC4_A14779MRParPrDsc = new String[] {""} ;
      T01WC4_A14749MRParPrPLC = new String[] {""} ;
      T01WC4_A14780MRParPrUsu = new String[] {""} ;
      T01WC4_A14781MRParPrIp = new String[] {""} ;
      T01WC4_A14782MRParPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WC4_A14783MRParPrTkn = new String[] {""} ;
      T01WC4_A14784MRParPrHdr = new String[] {""} ;
      T01WC4_A14785MRParPrMaq = new String[] {""} ;
      T01WC4_A14786MRParPrFas = new String[] {""} ;
      T01WC5_A14680MRParPrId = new long[1] ;
      T01WC3_A14680MRParPrId = new long[1] ;
      T01WC3_A14778MRParPrCod = new short[1] ;
      T01WC3_A14779MRParPrDsc = new String[] {""} ;
      T01WC3_A14749MRParPrPLC = new String[] {""} ;
      T01WC3_A14780MRParPrUsu = new String[] {""} ;
      T01WC3_A14781MRParPrIp = new String[] {""} ;
      T01WC3_A14782MRParPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WC3_A14783MRParPrTkn = new String[] {""} ;
      T01WC3_A14784MRParPrHdr = new String[] {""} ;
      T01WC3_A14785MRParPrMaq = new String[] {""} ;
      T01WC3_A14786MRParPrFas = new String[] {""} ;
      sMode1924 = "" ;
      T01WC6_A14680MRParPrId = new long[1] ;
      T01WC7_A14680MRParPrId = new long[1] ;
      T01WC2_A14680MRParPrId = new long[1] ;
      T01WC2_A14778MRParPrCod = new short[1] ;
      T01WC2_A14779MRParPrDsc = new String[] {""} ;
      T01WC2_A14749MRParPrPLC = new String[] {""} ;
      T01WC2_A14780MRParPrUsu = new String[] {""} ;
      T01WC2_A14781MRParPrIp = new String[] {""} ;
      T01WC2_A14782MRParPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WC2_A14783MRParPrTkn = new String[] {""} ;
      T01WC2_A14784MRParPrHdr = new String[] {""} ;
      T01WC2_A14785MRParPrMaq = new String[] {""} ;
      T01WC2_A14786MRParPrFas = new String[] {""} ;
      T01WC9_A14680MRParPrId = new long[1] ;
      T01WC12_A14680MRParPrId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ14779MRParPrDsc = "" ;
      ZZ14749MRParPrPLC = "" ;
      ZZ14780MRParPrUsu = "" ;
      ZZ14781MRParPrIp = "" ;
      ZZ14782MRParPrReg = GXutil.resetTime( GXutil.nullDate() );
      ZZ14783MRParPrTkn = "" ;
      ZZ14784MRParPrHdr = "" ;
      ZZ14785MRParPrMaq = "" ;
      ZZ14786MRParPrFas = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrparpr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrparpr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrparpr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrparpr__default(),
         new Object[] {
             new Object[] {
            T01WC2_A14680MRParPrId, T01WC2_A14778MRParPrCod, T01WC2_A14779MRParPrDsc, T01WC2_A14749MRParPrPLC, T01WC2_A14780MRParPrUsu, T01WC2_A14781MRParPrIp, T01WC2_A14782MRParPrReg, T01WC2_A14783MRParPrTkn, T01WC2_A14784MRParPrHdr, T01WC2_A14785MRParPrMaq,
            T01WC2_A14786MRParPrFas
            }
            , new Object[] {
            T01WC3_A14680MRParPrId, T01WC3_A14778MRParPrCod, T01WC3_A14779MRParPrDsc, T01WC3_A14749MRParPrPLC, T01WC3_A14780MRParPrUsu, T01WC3_A14781MRParPrIp, T01WC3_A14782MRParPrReg, T01WC3_A14783MRParPrTkn, T01WC3_A14784MRParPrHdr, T01WC3_A14785MRParPrMaq,
            T01WC3_A14786MRParPrFas
            }
            , new Object[] {
            T01WC4_A14680MRParPrId, T01WC4_A14778MRParPrCod, T01WC4_A14779MRParPrDsc, T01WC4_A14749MRParPrPLC, T01WC4_A14780MRParPrUsu, T01WC4_A14781MRParPrIp, T01WC4_A14782MRParPrReg, T01WC4_A14783MRParPrTkn, T01WC4_A14784MRParPrHdr, T01WC4_A14785MRParPrMaq,
            T01WC4_A14786MRParPrFas
            }
            , new Object[] {
            T01WC5_A14680MRParPrId
            }
            , new Object[] {
            T01WC6_A14680MRParPrId
            }
            , new Object[] {
            T01WC7_A14680MRParPrId
            }
            , new Object[] {
            }
            , new Object[] {
            T01WC9_A14680MRParPrId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01WC12_A14680MRParPrId
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z14778MRParPrCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14778MRParPrCod ;
   private short RcdFound1924 ;
   private short nIsDirty_1924 ;
   private short ZZ14778MRParPrCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtMRParPrId_Enabled ;
   private int edtMRParPrCod_Enabled ;
   private int edtMRParPrDsc_Enabled ;
   private int edtMRParPrPLC_Enabled ;
   private int edtMRParPrUsu_Enabled ;
   private int edtMRParPrIp_Enabled ;
   private int edtMRParPrReg_Enabled ;
   private int edtMRParPrTkn_Enabled ;
   private int edtMRParPrHdr_Enabled ;
   private int edtMRParPrMaq_Enabled ;
   private int edtMRParPrFas_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z14680MRParPrId ;
   private long A14680MRParPrId ;
   private long ZZ14680MRParPrId ;
   private String sPrefix ;
   private String Z14780MRParPrUsu ;
   private String Z14784MRParPrHdr ;
   private String Z14785MRParPrMaq ;
   private String Z14786MRParPrFas ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMRParPrId_Internalname ;
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
   private String edtMRParPrId_Jsonclick ;
   private String edtMRParPrCod_Internalname ;
   private String edtMRParPrCod_Jsonclick ;
   private String edtMRParPrDsc_Internalname ;
   private String edtMRParPrDsc_Jsonclick ;
   private String edtMRParPrPLC_Internalname ;
   private String edtMRParPrPLC_Jsonclick ;
   private String edtMRParPrUsu_Internalname ;
   private String A14780MRParPrUsu ;
   private String edtMRParPrUsu_Jsonclick ;
   private String edtMRParPrIp_Internalname ;
   private String edtMRParPrIp_Jsonclick ;
   private String edtMRParPrReg_Internalname ;
   private String edtMRParPrReg_Jsonclick ;
   private String edtMRParPrTkn_Internalname ;
   private String edtMRParPrHdr_Internalname ;
   private String A14784MRParPrHdr ;
   private String edtMRParPrHdr_Jsonclick ;
   private String edtMRParPrMaq_Internalname ;
   private String A14785MRParPrMaq ;
   private String edtMRParPrMaq_Jsonclick ;
   private String edtMRParPrFas_Internalname ;
   private String A14786MRParPrFas ;
   private String edtMRParPrFas_Jsonclick ;
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
   private String sMode1924 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ14780MRParPrUsu ;
   private String ZZ14784MRParPrHdr ;
   private String ZZ14785MRParPrMaq ;
   private String ZZ14786MRParPrFas ;
   private java.util.Date Z14782MRParPrReg ;
   private java.util.Date A14782MRParPrReg ;
   private java.util.Date ZZ14782MRParPrReg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private String Z14779MRParPrDsc ;
   private String Z14749MRParPrPLC ;
   private String Z14781MRParPrIp ;
   private String Z14783MRParPrTkn ;
   private String A14779MRParPrDsc ;
   private String A14749MRParPrPLC ;
   private String A14781MRParPrIp ;
   private String A14783MRParPrTkn ;
   private String ZZ14779MRParPrDsc ;
   private String ZZ14749MRParPrPLC ;
   private String ZZ14781MRParPrIp ;
   private String ZZ14783MRParPrTkn ;
   private IDataStoreProvider pr_default ;
   private long[] T01WC4_A14680MRParPrId ;
   private short[] T01WC4_A14778MRParPrCod ;
   private String[] T01WC4_A14779MRParPrDsc ;
   private String[] T01WC4_A14749MRParPrPLC ;
   private String[] T01WC4_A14780MRParPrUsu ;
   private String[] T01WC4_A14781MRParPrIp ;
   private java.util.Date[] T01WC4_A14782MRParPrReg ;
   private String[] T01WC4_A14783MRParPrTkn ;
   private String[] T01WC4_A14784MRParPrHdr ;
   private String[] T01WC4_A14785MRParPrMaq ;
   private String[] T01WC4_A14786MRParPrFas ;
   private long[] T01WC5_A14680MRParPrId ;
   private long[] T01WC3_A14680MRParPrId ;
   private short[] T01WC3_A14778MRParPrCod ;
   private String[] T01WC3_A14779MRParPrDsc ;
   private String[] T01WC3_A14749MRParPrPLC ;
   private String[] T01WC3_A14780MRParPrUsu ;
   private String[] T01WC3_A14781MRParPrIp ;
   private java.util.Date[] T01WC3_A14782MRParPrReg ;
   private String[] T01WC3_A14783MRParPrTkn ;
   private String[] T01WC3_A14784MRParPrHdr ;
   private String[] T01WC3_A14785MRParPrMaq ;
   private String[] T01WC3_A14786MRParPrFas ;
   private long[] T01WC6_A14680MRParPrId ;
   private long[] T01WC7_A14680MRParPrId ;
   private long[] T01WC2_A14680MRParPrId ;
   private short[] T01WC2_A14778MRParPrCod ;
   private String[] T01WC2_A14779MRParPrDsc ;
   private String[] T01WC2_A14749MRParPrPLC ;
   private String[] T01WC2_A14780MRParPrUsu ;
   private String[] T01WC2_A14781MRParPrIp ;
   private java.util.Date[] T01WC2_A14782MRParPrReg ;
   private String[] T01WC2_A14783MRParPrTkn ;
   private String[] T01WC2_A14784MRParPrHdr ;
   private String[] T01WC2_A14785MRParPrMaq ;
   private String[] T01WC2_A14786MRParPrFas ;
   private long[] T01WC9_A14680MRParPrId ;
   private long[] T01WC12_A14680MRParPrId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mrparpr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrparpr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrparpr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrparpr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01WC2", "SELECT MRParPrId, MRParPrCod, MRParPrDsc, MRParPrPLC, MRParPrUsu, MRParPrIp, MRParPrReg, MRParPrTkn, MRParPrHdr, MRParPrMaq, MRParPrFas FROM MRParPr WHERE MRParPrId = ?  FOR UPDATE OF MRParPrCod, MRParPrDsc, MRParPrPLC, MRParPrUsu, MRParPrIp, MRParPrReg, MRParPrTkn, MRParPrHdr, MRParPrMaq, MRParPrFas NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WC3", "SELECT MRParPrId, MRParPrCod, MRParPrDsc, MRParPrPLC, MRParPrUsu, MRParPrIp, MRParPrReg, MRParPrTkn, MRParPrHdr, MRParPrMaq, MRParPrFas FROM MRParPr WHERE MRParPrId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WC4", "SELECT /*+ FIRST_ROWS(100) */ TM1.MRParPrId, TM1.MRParPrCod, TM1.MRParPrDsc, TM1.MRParPrPLC, TM1.MRParPrUsu, TM1.MRParPrIp, TM1.MRParPrReg, TM1.MRParPrTkn, TM1.MRParPrHdr, TM1.MRParPrMaq, TM1.MRParPrFas FROM MRParPr TM1 WHERE TM1.MRParPrId = ? ORDER BY TM1.MRParPrId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WC5", "SELECT /*+ FIRST_ROWS(1) */ MRParPrId FROM MRParPr WHERE MRParPrId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WC6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MRParPrId FROM MRParPr WHERE ( MRParPrId > ?) ORDER BY MRParPrId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01WC7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MRParPrId FROM MRParPr WHERE ( MRParPrId < ?) ORDER BY MRParPrId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01WC8", "INSERT INTO MRParPr(MRParPrCod, MRParPrDsc, MRParPrPLC, MRParPrUsu, MRParPrIp, MRParPrReg, MRParPrTkn, MRParPrHdr, MRParPrMaq, MRParPrFas) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "MRParPr")
         ,new ForEachCursor("T01WC9", "SELECT MRParPrId.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01WC10", "UPDATE MRParPr SET MRParPrCod=?, MRParPrDsc=?, MRParPrPLC=?, MRParPrUsu=?, MRParPrIp=?, MRParPrReg=?, MRParPrTkn=?, MRParPrHdr=?, MRParPrMaq=?, MRParPrFas=?  WHERE MRParPrId = ?", GX_NOMASK, "MRParPr")
         ,new UpdateCursor("T01WC11", "DELETE FROM MRParPr  WHERE MRParPrId = ?", GX_NOMASK, "MRParPr")
         ,new ForEachCursor("T01WC12", "SELECT /*+ FIRST_ROWS(100) */ MRParPrId FROM MRParPr ORDER BY MRParPrId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7, true);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7, true);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7, true);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 100, false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setVarchar(5, (String)parms[4], 20, false);
               stmt.setDateTime(6, (java.util.Date)parms[5], false, true);
               stmt.setVarchar(7, (String)parms[6], 256, false);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setString(10, (String)parms[9], 8);
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 100, false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setVarchar(5, (String)parms[4], 20, false);
               stmt.setDateTime(6, (java.util.Date)parms[5], false, true);
               stmt.setVarchar(7, (String)parms[6], 256, false);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setString(10, (String)parms[9], 8);
               stmt.setLong(11, ((Number) parms[10]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

