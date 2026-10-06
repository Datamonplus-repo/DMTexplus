package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mepr_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = (short)(GXutil.lval( httpContext.GetPar( "MEnvOrd"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A14152MEnvOrd) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MEPr", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMEPrId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public mepr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mepr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mepr_impl.class ));
   }

   public mepr_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "MEPr", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MEPr.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Ingenieria\\MEPr.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEPrId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEPrId_Internalname, httpContext.getMessage( "Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEPrId_Internalname, GXutil.ltrim( localUtil.ntoc( A14674MEPrId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMEPrId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14674MEPrId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14674MEPrId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEPrId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEPrId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEnvOrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEnvOrd_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A14152MEnvOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMEnvOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14152MEnvOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14152MEnvOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvOrd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEnvOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEPrFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEPrFasCod_Internalname, httpContext.getMessage( "Codigo Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEPrFasCod_Internalname, GXutil.rtrim( A14691MEPrFasCod), GXutil.rtrim( localUtil.format( A14691MEPrFasCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEPrFasCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEPrFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEPrFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEPrFasDsc_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEPrFasDsc_Internalname, GXutil.rtrim( A14692MEPrFasDsc), GXutil.rtrim( localUtil.format( A14692MEPrFasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEPrFasDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEPrFasDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEPrMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEPrMaqCod_Internalname, httpContext.getMessage( "Codigo Maquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEPrMaqCod_Internalname, GXutil.rtrim( A14693MEPrMaqCod), GXutil.rtrim( localUtil.format( A14693MEPrMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEPrMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEPrMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEPrMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEPrMaqDsc_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEPrMaqDsc_Internalname, GXutil.rtrim( A14694MEPrMaqDsc), GXutil.rtrim( localUtil.format( A14694MEPrMaqDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEPrMaqDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEPrMaqDsc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEPrParCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEPrParCod_Internalname, httpContext.getMessage( "Codigo Parametro Control", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEPrParCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14695MEPrParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMEPrParCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14695MEPrParCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14695MEPrParCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEPrParCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEPrParCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEPrParDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEPrParDsc_Internalname, httpContext.getMessage( "Parametro Control", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEPrParDsc_Internalname, GXutil.rtrim( A14696MEPrParDsc), GXutil.rtrim( localUtil.format( A14696MEPrParDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEPrParDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEPrParDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEPrHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEPrHdr_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEPrHdr_Internalname, GXutil.rtrim( A14697MEPrHdr), GXutil.rtrim( localUtil.format( A14697MEPrHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEPrHdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEPrHdr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEPrUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEPrUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEPrUsu_Internalname, GXutil.rtrim( A14698MEPrUsu), GXutil.rtrim( localUtil.format( A14698MEPrUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEPrUsu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEPrUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEPrIp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEPrIp_Internalname, httpContext.getMessage( "Ip", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEPrIp_Internalname, A14699MEPrIp, GXutil.rtrim( localUtil.format( A14699MEPrIp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEPrIp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEPrIp_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Ip", "left", true, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEPrReg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEPrReg_Internalname, httpContext.getMessage( "Registro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMEPrReg_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEPrReg_Internalname, localUtil.ttoc( A14700MEPrReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14700MEPrReg, "99/99/99 99:99:99.999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEPrReg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEPrReg_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMEPrReg_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMEPrReg_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MEPr.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEPrTkn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEPrTkn_Internalname, httpContext.getMessage( "Token", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMEPrTkn_Internalname, A14701MEPrTkn, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", (short)(0), 1, edtMEPrTkn_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEPrObj_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEPrObj_Internalname, httpContext.getMessage( "Objeto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEPrObj_Internalname, A14702MEPrObj, GXutil.rtrim( localUtil.format( A14702MEPrObj, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEPrObj_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEPrObj_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MEPr.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MEPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MEPr.htm");
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
         Z14674MEPrId = localUtil.ctol( httpContext.cgiGet( "Z14674MEPrId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14691MEPrFasCod = httpContext.cgiGet( "Z14691MEPrFasCod") ;
         Z14692MEPrFasDsc = httpContext.cgiGet( "Z14692MEPrFasDsc") ;
         Z14693MEPrMaqCod = httpContext.cgiGet( "Z14693MEPrMaqCod") ;
         Z14694MEPrMaqDsc = httpContext.cgiGet( "Z14694MEPrMaqDsc") ;
         Z14695MEPrParCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z14695MEPrParCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14696MEPrParDsc = httpContext.cgiGet( "Z14696MEPrParDsc") ;
         Z14697MEPrHdr = httpContext.cgiGet( "Z14697MEPrHdr") ;
         Z14698MEPrUsu = httpContext.cgiGet( "Z14698MEPrUsu") ;
         Z14699MEPrIp = httpContext.cgiGet( "Z14699MEPrIp") ;
         Z14700MEPrReg = localUtil.ctot( httpContext.cgiGet( "Z14700MEPrReg"), 0) ;
         Z14701MEPrTkn = httpContext.cgiGet( "Z14701MEPrTkn") ;
         Z14702MEPrObj = httpContext.cgiGet( "Z14702MEPrObj") ;
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z14152MEnvOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z14152MEnvOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMEPrId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMEPrId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MEPRID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMEPrId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14674MEPrId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14674MEPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14674MEPrId), 10, 0));
         }
         else
         {
            A14674MEPrId = localUtil.ctol( httpContext.cgiGet( edtMEPrId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14674MEPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14674MEPrId), 10, 0));
         }
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A129BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         else
         {
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCodReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A132BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         else
         {
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMEnvOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMEnvOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MENVORD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMEnvOrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14152MEnvOrd = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
         }
         else
         {
            A14152MEnvOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtMEnvOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
         }
         A14691MEPrFasCod = httpContext.cgiGet( edtMEPrFasCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14691MEPrFasCod", A14691MEPrFasCod);
         A14692MEPrFasDsc = httpContext.cgiGet( edtMEPrFasDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14692MEPrFasDsc", A14692MEPrFasDsc);
         A14693MEPrMaqCod = httpContext.cgiGet( edtMEPrMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14693MEPrMaqCod", A14693MEPrMaqCod);
         A14694MEPrMaqDsc = httpContext.cgiGet( edtMEPrMaqDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14694MEPrMaqDsc", A14694MEPrMaqDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMEPrParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMEPrParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MEPRPARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMEPrParCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14695MEPrParCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14695MEPrParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14695MEPrParCod), 4, 0));
         }
         else
         {
            A14695MEPrParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtMEPrParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14695MEPrParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14695MEPrParCod), 4, 0));
         }
         A14696MEPrParDsc = httpContext.cgiGet( edtMEPrParDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14696MEPrParDsc", A14696MEPrParDsc);
         A14697MEPrHdr = httpContext.cgiGet( edtMEPrHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14697MEPrHdr", A14697MEPrHdr);
         A14698MEPrUsu = httpContext.cgiGet( edtMEPrUsu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14698MEPrUsu", A14698MEPrUsu);
         A14699MEPrIp = httpContext.cgiGet( edtMEPrIp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14699MEPrIp", A14699MEPrIp);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMEPrReg_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MEPRREG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMEPrReg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14700MEPrReg = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14700MEPrReg", localUtil.ttoc( A14700MEPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14700MEPrReg = localUtil.ctot( httpContext.cgiGet( edtMEPrReg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14700MEPrReg", localUtil.ttoc( A14700MEPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A14701MEPrTkn = httpContext.cgiGet( edtMEPrTkn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14701MEPrTkn", A14701MEPrTkn);
         A14702MEPrObj = httpContext.cgiGet( edtMEPrObj_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14702MEPrObj", A14702MEPrObj);
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
            A14674MEPrId = GXutil.lval( httpContext.GetPar( "MEPrId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14674MEPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14674MEPrId), 10, 0));
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
            initAll1W81920( ) ;
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
      disableAttributes1W81920( ) ;
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

   public void resetCaption1W80( )
   {
   }

   public void zm1W81920( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14691MEPrFasCod = T01W83_A14691MEPrFasCod[0] ;
            Z14692MEPrFasDsc = T01W83_A14692MEPrFasDsc[0] ;
            Z14693MEPrMaqCod = T01W83_A14693MEPrMaqCod[0] ;
            Z14694MEPrMaqDsc = T01W83_A14694MEPrMaqDsc[0] ;
            Z14695MEPrParCod = T01W83_A14695MEPrParCod[0] ;
            Z14696MEPrParDsc = T01W83_A14696MEPrParDsc[0] ;
            Z14697MEPrHdr = T01W83_A14697MEPrHdr[0] ;
            Z14698MEPrUsu = T01W83_A14698MEPrUsu[0] ;
            Z14699MEPrIp = T01W83_A14699MEPrIp[0] ;
            Z14700MEPrReg = T01W83_A14700MEPrReg[0] ;
            Z14701MEPrTkn = T01W83_A14701MEPrTkn[0] ;
            Z14702MEPrObj = T01W83_A14702MEPrObj[0] ;
            Z396EmprCod = T01W83_A396EmprCod[0] ;
            Z129BarCod = T01W83_A129BarCod[0] ;
            Z132BarCodReo = T01W83_A132BarCodReo[0] ;
            Z130BarCodPar = T01W83_A130BarCodPar[0] ;
            Z14152MEnvOrd = T01W83_A14152MEnvOrd[0] ;
         }
         else
         {
            Z14691MEPrFasCod = A14691MEPrFasCod ;
            Z14692MEPrFasDsc = A14692MEPrFasDsc ;
            Z14693MEPrMaqCod = A14693MEPrMaqCod ;
            Z14694MEPrMaqDsc = A14694MEPrMaqDsc ;
            Z14695MEPrParCod = A14695MEPrParCod ;
            Z14696MEPrParDsc = A14696MEPrParDsc ;
            Z14697MEPrHdr = A14697MEPrHdr ;
            Z14698MEPrUsu = A14698MEPrUsu ;
            Z14699MEPrIp = A14699MEPrIp ;
            Z14700MEPrReg = A14700MEPrReg ;
            Z14701MEPrTkn = A14701MEPrTkn ;
            Z14702MEPrObj = A14702MEPrObj ;
            Z396EmprCod = A396EmprCod ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z14152MEnvOrd = A14152MEnvOrd ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z14674MEPrId = A14674MEPrId ;
         Z14691MEPrFasCod = A14691MEPrFasCod ;
         Z14692MEPrFasDsc = A14692MEPrFasDsc ;
         Z14693MEPrMaqCod = A14693MEPrMaqCod ;
         Z14694MEPrMaqDsc = A14694MEPrMaqDsc ;
         Z14695MEPrParCod = A14695MEPrParCod ;
         Z14696MEPrParDsc = A14696MEPrParDsc ;
         Z14697MEPrHdr = A14697MEPrHdr ;
         Z14698MEPrUsu = A14698MEPrUsu ;
         Z14699MEPrIp = A14699MEPrIp ;
         Z14700MEPrReg = A14700MEPrReg ;
         Z14701MEPrTkn = A14701MEPrTkn ;
         Z14702MEPrObj = A14702MEPrObj ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14152MEnvOrd = A14152MEnvOrd ;
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

   public void load1W81920( )
   {
      /* Using cursor T01W85 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14674MEPrId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1920 = (short)(1) ;
         A14691MEPrFasCod = T01W85_A14691MEPrFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14691MEPrFasCod", A14691MEPrFasCod);
         A14692MEPrFasDsc = T01W85_A14692MEPrFasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14692MEPrFasDsc", A14692MEPrFasDsc);
         A14693MEPrMaqCod = T01W85_A14693MEPrMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14693MEPrMaqCod", A14693MEPrMaqCod);
         A14694MEPrMaqDsc = T01W85_A14694MEPrMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14694MEPrMaqDsc", A14694MEPrMaqDsc);
         A14695MEPrParCod = T01W85_A14695MEPrParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14695MEPrParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14695MEPrParCod), 4, 0));
         A14696MEPrParDsc = T01W85_A14696MEPrParDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14696MEPrParDsc", A14696MEPrParDsc);
         A14697MEPrHdr = T01W85_A14697MEPrHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14697MEPrHdr", A14697MEPrHdr);
         A14698MEPrUsu = T01W85_A14698MEPrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14698MEPrUsu", A14698MEPrUsu);
         A14699MEPrIp = T01W85_A14699MEPrIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14699MEPrIp", A14699MEPrIp);
         A14700MEPrReg = T01W85_A14700MEPrReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14700MEPrReg", localUtil.ttoc( A14700MEPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14701MEPrTkn = T01W85_A14701MEPrTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14701MEPrTkn", A14701MEPrTkn);
         A14702MEPrObj = T01W85_A14702MEPrObj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14702MEPrObj", A14702MEPrObj);
         A396EmprCod = T01W85_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01W85_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01W85_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01W85_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = T01W85_A14152MEnvOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
         zm1W81920( -1) ;
      }
      pr_default.close(3);
      onLoadActions1W81920( ) ;
   }

   public void onLoadActions1W81920( )
   {
   }

   public void checkExtendedTable1W81920( )
   {
      nIsDirty_1920 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01W84 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), "", "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MENVORD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1W81920( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar ,
                         short A14152MEnvOrd )
   {
      /* Using cursor T01W86 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), "", "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MENVORD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey1W81920( )
   {
      /* Using cursor T01W87 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14674MEPrId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1920 = (short)(1) ;
      }
      else
      {
         RcdFound1920 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01W83 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14674MEPrId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1W81920( 1) ;
         RcdFound1920 = (short)(1) ;
         A14674MEPrId = T01W83_A14674MEPrId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14674MEPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14674MEPrId), 10, 0));
         A14691MEPrFasCod = T01W83_A14691MEPrFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14691MEPrFasCod", A14691MEPrFasCod);
         A14692MEPrFasDsc = T01W83_A14692MEPrFasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14692MEPrFasDsc", A14692MEPrFasDsc);
         A14693MEPrMaqCod = T01W83_A14693MEPrMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14693MEPrMaqCod", A14693MEPrMaqCod);
         A14694MEPrMaqDsc = T01W83_A14694MEPrMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14694MEPrMaqDsc", A14694MEPrMaqDsc);
         A14695MEPrParCod = T01W83_A14695MEPrParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14695MEPrParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14695MEPrParCod), 4, 0));
         A14696MEPrParDsc = T01W83_A14696MEPrParDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14696MEPrParDsc", A14696MEPrParDsc);
         A14697MEPrHdr = T01W83_A14697MEPrHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14697MEPrHdr", A14697MEPrHdr);
         A14698MEPrUsu = T01W83_A14698MEPrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14698MEPrUsu", A14698MEPrUsu);
         A14699MEPrIp = T01W83_A14699MEPrIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14699MEPrIp", A14699MEPrIp);
         A14700MEPrReg = T01W83_A14700MEPrReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14700MEPrReg", localUtil.ttoc( A14700MEPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14701MEPrTkn = T01W83_A14701MEPrTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14701MEPrTkn", A14701MEPrTkn);
         A14702MEPrObj = T01W83_A14702MEPrObj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14702MEPrObj", A14702MEPrObj);
         A396EmprCod = T01W83_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01W83_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01W83_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01W83_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = T01W83_A14152MEnvOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
         Z14674MEPrId = A14674MEPrId ;
         sMode1920 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1W81920( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1920 = (short)(0) ;
            initializeNonKey1W81920( ) ;
         }
         Gx_mode = sMode1920 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1920 = (short)(0) ;
         initializeNonKey1W81920( ) ;
         sMode1920 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1920 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1W81920( ) ;
      if ( RcdFound1920 == 0 )
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
      RcdFound1920 = (short)(0) ;
      /* Using cursor T01W88 */
      pr_default.execute(6, new Object[] {Long.valueOf(A14674MEPrId)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01W88_A14674MEPrId[0] < A14674MEPrId ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01W88_A14674MEPrId[0] > A14674MEPrId ) ) )
         {
            A14674MEPrId = T01W88_A14674MEPrId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14674MEPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14674MEPrId), 10, 0));
            RcdFound1920 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1920 = (short)(0) ;
      /* Using cursor T01W89 */
      pr_default.execute(7, new Object[] {Long.valueOf(A14674MEPrId)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01W89_A14674MEPrId[0] > A14674MEPrId ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01W89_A14674MEPrId[0] < A14674MEPrId ) ) )
         {
            A14674MEPrId = T01W89_A14674MEPrId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14674MEPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14674MEPrId), 10, 0));
            RcdFound1920 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1W81920( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMEPrId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1W81920( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1920 == 1 )
         {
            if ( A14674MEPrId != Z14674MEPrId )
            {
               A14674MEPrId = Z14674MEPrId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14674MEPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14674MEPrId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MEPRID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMEPrId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMEPrId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1W81920( ) ;
               GX_FocusControl = edtMEPrId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14674MEPrId != Z14674MEPrId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMEPrId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1W81920( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MEPRID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMEPrId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtMEPrId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1W81920( ) ;
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
      if ( A14674MEPrId != Z14674MEPrId )
      {
         A14674MEPrId = Z14674MEPrId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14674MEPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14674MEPrId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MEPRID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMEPrId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMEPrId_Internalname ;
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
      if ( RcdFound1920 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "MEPRID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMEPrId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEmprCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1W81920( ) ;
      if ( RcdFound1920 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1W81920( ) ;
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
      if ( RcdFound1920 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprCod_Internalname ;
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
      if ( RcdFound1920 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprCod_Internalname ;
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
      scanStart1W81920( ) ;
      if ( RcdFound1920 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1920 != 0 )
         {
            scanNext1W81920( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1W81920( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1W81920( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01W82 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14674MEPrId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MEPr"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14691MEPrFasCod, T01W82_A14691MEPrFasCod[0]) != 0 ) || ( GXutil.strcmp(Z14692MEPrFasDsc, T01W82_A14692MEPrFasDsc[0]) != 0 ) || ( GXutil.strcmp(Z14693MEPrMaqCod, T01W82_A14693MEPrMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z14694MEPrMaqDsc, T01W82_A14694MEPrMaqDsc[0]) != 0 ) || ( Z14695MEPrParCod != T01W82_A14695MEPrParCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14696MEPrParDsc, T01W82_A14696MEPrParDsc[0]) != 0 ) || ( GXutil.strcmp(Z14697MEPrHdr, T01W82_A14697MEPrHdr[0]) != 0 ) || ( GXutil.strcmp(Z14698MEPrUsu, T01W82_A14698MEPrUsu[0]) != 0 ) || ( GXutil.strcmp(Z14699MEPrIp, T01W82_A14699MEPrIp[0]) != 0 ) || !( GXutil.dateCompare(Z14700MEPrReg, T01W82_A14700MEPrReg[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14701MEPrTkn, T01W82_A14701MEPrTkn[0]) != 0 ) || ( GXutil.strcmp(Z14702MEPrObj, T01W82_A14702MEPrObj[0]) != 0 ) || ( GXutil.strcmp(Z396EmprCod, T01W82_A396EmprCod[0]) != 0 ) || ( Z129BarCod != T01W82_A129BarCod[0] ) || ( Z132BarCodReo != T01W82_A132BarCodReo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z130BarCodPar, T01W82_A130BarCodPar[0]) != 0 ) || ( Z14152MEnvOrd != T01W82_A14152MEnvOrd[0] ) )
         {
            if ( GXutil.strcmp(Z14691MEPrFasCod, T01W82_A14691MEPrFasCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"MEPrFasCod");
               GXutil.writeLogRaw("Old: ",Z14691MEPrFasCod);
               GXutil.writeLogRaw("Current: ",T01W82_A14691MEPrFasCod[0]);
            }
            if ( GXutil.strcmp(Z14692MEPrFasDsc, T01W82_A14692MEPrFasDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"MEPrFasDsc");
               GXutil.writeLogRaw("Old: ",Z14692MEPrFasDsc);
               GXutil.writeLogRaw("Current: ",T01W82_A14692MEPrFasDsc[0]);
            }
            if ( GXutil.strcmp(Z14693MEPrMaqCod, T01W82_A14693MEPrMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"MEPrMaqCod");
               GXutil.writeLogRaw("Old: ",Z14693MEPrMaqCod);
               GXutil.writeLogRaw("Current: ",T01W82_A14693MEPrMaqCod[0]);
            }
            if ( GXutil.strcmp(Z14694MEPrMaqDsc, T01W82_A14694MEPrMaqDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"MEPrMaqDsc");
               GXutil.writeLogRaw("Old: ",Z14694MEPrMaqDsc);
               GXutil.writeLogRaw("Current: ",T01W82_A14694MEPrMaqDsc[0]);
            }
            if ( Z14695MEPrParCod != T01W82_A14695MEPrParCod[0] )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"MEPrParCod");
               GXutil.writeLogRaw("Old: ",Z14695MEPrParCod);
               GXutil.writeLogRaw("Current: ",T01W82_A14695MEPrParCod[0]);
            }
            if ( GXutil.strcmp(Z14696MEPrParDsc, T01W82_A14696MEPrParDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"MEPrParDsc");
               GXutil.writeLogRaw("Old: ",Z14696MEPrParDsc);
               GXutil.writeLogRaw("Current: ",T01W82_A14696MEPrParDsc[0]);
            }
            if ( GXutil.strcmp(Z14697MEPrHdr, T01W82_A14697MEPrHdr[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"MEPrHdr");
               GXutil.writeLogRaw("Old: ",Z14697MEPrHdr);
               GXutil.writeLogRaw("Current: ",T01W82_A14697MEPrHdr[0]);
            }
            if ( GXutil.strcmp(Z14698MEPrUsu, T01W82_A14698MEPrUsu[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"MEPrUsu");
               GXutil.writeLogRaw("Old: ",Z14698MEPrUsu);
               GXutil.writeLogRaw("Current: ",T01W82_A14698MEPrUsu[0]);
            }
            if ( GXutil.strcmp(Z14699MEPrIp, T01W82_A14699MEPrIp[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"MEPrIp");
               GXutil.writeLogRaw("Old: ",Z14699MEPrIp);
               GXutil.writeLogRaw("Current: ",T01W82_A14699MEPrIp[0]);
            }
            if ( !( GXutil.dateCompare(Z14700MEPrReg, T01W82_A14700MEPrReg[0]) ) )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"MEPrReg");
               GXutil.writeLogRaw("Old: ",Z14700MEPrReg);
               GXutil.writeLogRaw("Current: ",T01W82_A14700MEPrReg[0]);
            }
            if ( GXutil.strcmp(Z14701MEPrTkn, T01W82_A14701MEPrTkn[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"MEPrTkn");
               GXutil.writeLogRaw("Old: ",Z14701MEPrTkn);
               GXutil.writeLogRaw("Current: ",T01W82_A14701MEPrTkn[0]);
            }
            if ( GXutil.strcmp(Z14702MEPrObj, T01W82_A14702MEPrObj[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"MEPrObj");
               GXutil.writeLogRaw("Old: ",Z14702MEPrObj);
               GXutil.writeLogRaw("Current: ",T01W82_A14702MEPrObj[0]);
            }
            if ( GXutil.strcmp(Z396EmprCod, T01W82_A396EmprCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"EmprCod");
               GXutil.writeLogRaw("Old: ",Z396EmprCod);
               GXutil.writeLogRaw("Current: ",T01W82_A396EmprCod[0]);
            }
            if ( Z129BarCod != T01W82_A129BarCod[0] )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01W82_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01W82_A132BarCodReo[0] )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01W82_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01W82_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01W82_A130BarCodPar[0]);
            }
            if ( Z14152MEnvOrd != T01W82_A14152MEnvOrd[0] )
            {
               GXutil.writeLogln("ingenieria.mepr:[seudo value changed for attri]"+"MEnvOrd");
               GXutil.writeLogRaw("Old: ",Z14152MEnvOrd);
               GXutil.writeLogRaw("Current: ",T01W82_A14152MEnvOrd[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"MEPr"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1W81920( )
   {
      beforeValidate1W81920( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W81920( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1W81920( 0) ;
         checkOptimisticConcurrency1W81920( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W81920( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1W81920( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W810 */
                  pr_default.execute(8, new Object[] {A14691MEPrFasCod, A14692MEPrFasDsc, A14693MEPrMaqCod, A14694MEPrMaqDsc, Short.valueOf(A14695MEPrParCod), A14696MEPrParDsc, A14697MEPrHdr, A14698MEPrUsu, A14699MEPrIp, A14700MEPrReg, A14701MEPrTkn, A14702MEPrObj, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T01W811 */
                  pr_default.execute(9);
                  A14674MEPrId = T01W811_A14674MEPrId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14674MEPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14674MEPrId), 10, 0));
                  pr_default.close(9);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MEPr");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1W80( ) ;
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
            load1W81920( ) ;
         }
         endLevel1W81920( ) ;
      }
      closeExtendedTableCursors1W81920( ) ;
   }

   public void update1W81920( )
   {
      beforeValidate1W81920( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W81920( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W81920( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W81920( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1W81920( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W812 */
                  pr_default.execute(10, new Object[] {A14691MEPrFasCod, A14692MEPrFasDsc, A14693MEPrMaqCod, A14694MEPrMaqDsc, Short.valueOf(A14695MEPrParCod), A14696MEPrParDsc, A14697MEPrHdr, A14698MEPrUsu, A14699MEPrIp, A14700MEPrReg, A14701MEPrTkn, A14702MEPrObj, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14674MEPrId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MEPr");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MEPr"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1W81920( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1W80( ) ;
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
         endLevel1W81920( ) ;
      }
      closeExtendedTableCursors1W81920( ) ;
   }

   public void deferredUpdate1W81920( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1W81920( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W81920( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1W81920( ) ;
         afterConfirm1W81920( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1W81920( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01W813 */
               pr_default.execute(11, new Object[] {Long.valueOf(A14674MEPrId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("MEPr");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1920 == 0 )
                     {
                        initAll1W81920( ) ;
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
                     resetCaption1W80( ) ;
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
      sMode1920 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1W81920( ) ;
      Gx_mode = sMode1920 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1W81920( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1W81920( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1W81920( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.mepr");
         if ( AnyError == 0 )
         {
            confirmValues1W80( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ingenieria.mepr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1W81920( )
   {
      /* Using cursor T01W814 */
      pr_default.execute(12);
      RcdFound1920 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1920 = (short)(1) ;
         A14674MEPrId = T01W814_A14674MEPrId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14674MEPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14674MEPrId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1W81920( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1920 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1920 = (short)(1) ;
         A14674MEPrId = T01W814_A14674MEPrId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14674MEPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14674MEPrId), 10, 0));
      }
   }

   public void scanEnd1W81920( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1W81920( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1W81920( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1W81920( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1W81920( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1W81920( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1W81920( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1W81920( )
   {
      edtMEPrId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEPrId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEPrId_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtMEnvOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvOrd_Enabled), 5, 0), true);
      edtMEPrFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEPrFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEPrFasCod_Enabled), 5, 0), true);
      edtMEPrFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEPrFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEPrFasDsc_Enabled), 5, 0), true);
      edtMEPrMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEPrMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEPrMaqCod_Enabled), 5, 0), true);
      edtMEPrMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEPrMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEPrMaqDsc_Enabled), 5, 0), true);
      edtMEPrParCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEPrParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEPrParCod_Enabled), 5, 0), true);
      edtMEPrParDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEPrParDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEPrParDsc_Enabled), 5, 0), true);
      edtMEPrHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEPrHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEPrHdr_Enabled), 5, 0), true);
      edtMEPrUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEPrUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEPrUsu_Enabled), 5, 0), true);
      edtMEPrIp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEPrIp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEPrIp_Enabled), 5, 0), true);
      edtMEPrReg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEPrReg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEPrReg_Enabled), 5, 0), true);
      edtMEPrTkn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEPrTkn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEPrTkn_Enabled), 5, 0), true);
      edtMEPrObj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEPrObj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEPrObj_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1W81920( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1W80( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mepr", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14674MEPrId", GXutil.ltrim( localUtil.ntoc( Z14674MEPrId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14691MEPrFasCod", GXutil.rtrim( Z14691MEPrFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14692MEPrFasDsc", GXutil.rtrim( Z14692MEPrFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14693MEPrMaqCod", GXutil.rtrim( Z14693MEPrMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14694MEPrMaqDsc", GXutil.rtrim( Z14694MEPrMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14695MEPrParCod", GXutil.ltrim( localUtil.ntoc( Z14695MEPrParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14696MEPrParDsc", GXutil.rtrim( Z14696MEPrParDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14697MEPrHdr", GXutil.rtrim( Z14697MEPrHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14698MEPrUsu", GXutil.rtrim( Z14698MEPrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14699MEPrIp", Z14699MEPrIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14700MEPrReg", localUtil.ttoc( Z14700MEPrReg, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14701MEPrTkn", Z14701MEPrTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14702MEPrObj", Z14702MEPrObj);
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14152MEnvOrd", GXutil.ltrim( localUtil.ntoc( Z14152MEnvOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ingenieria.mepr", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.MEPr" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MEPr", "") ;
   }

   public void initializeNonKey1W81920( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A14152MEnvOrd = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
      A14691MEPrFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14691MEPrFasCod", A14691MEPrFasCod);
      A14692MEPrFasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14692MEPrFasDsc", A14692MEPrFasDsc);
      A14693MEPrMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14693MEPrMaqCod", A14693MEPrMaqCod);
      A14694MEPrMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14694MEPrMaqDsc", A14694MEPrMaqDsc);
      A14695MEPrParCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14695MEPrParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14695MEPrParCod), 4, 0));
      A14696MEPrParDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14696MEPrParDsc", A14696MEPrParDsc);
      A14697MEPrHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14697MEPrHdr", A14697MEPrHdr);
      A14698MEPrUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14698MEPrUsu", A14698MEPrUsu);
      A14699MEPrIp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14699MEPrIp", A14699MEPrIp);
      A14700MEPrReg = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14700MEPrReg", localUtil.ttoc( A14700MEPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14701MEPrTkn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14701MEPrTkn", A14701MEPrTkn);
      A14702MEPrObj = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14702MEPrObj", A14702MEPrObj);
      Z14691MEPrFasCod = "" ;
      Z14692MEPrFasDsc = "" ;
      Z14693MEPrMaqCod = "" ;
      Z14694MEPrMaqDsc = "" ;
      Z14695MEPrParCod = (short)(0) ;
      Z14696MEPrParDsc = "" ;
      Z14697MEPrHdr = "" ;
      Z14698MEPrUsu = "" ;
      Z14699MEPrIp = "" ;
      Z14700MEPrReg = GXutil.resetTime( GXutil.nullDate() );
      Z14701MEPrTkn = "" ;
      Z14702MEPrObj = "" ;
      Z396EmprCod = "" ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z14152MEnvOrd = (short)(0) ;
   }

   public void initAll1W81920( )
   {
      A14674MEPrId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14674MEPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14674MEPrId), 10, 0));
      initializeNonKey1W81920( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671011105330", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/mepr.js", "?202671011105330", false, true);
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
      edtMEPrId_Internalname = "MEPRID" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtMEnvOrd_Internalname = "MENVORD" ;
      edtMEPrFasCod_Internalname = "MEPRFASCOD" ;
      edtMEPrFasDsc_Internalname = "MEPRFASDSC" ;
      edtMEPrMaqCod_Internalname = "MEPRMAQCOD" ;
      edtMEPrMaqDsc_Internalname = "MEPRMAQDSC" ;
      edtMEPrParCod_Internalname = "MEPRPARCOD" ;
      edtMEPrParDsc_Internalname = "MEPRPARDSC" ;
      edtMEPrHdr_Internalname = "MEPRHDR" ;
      edtMEPrUsu_Internalname = "MEPRUSU" ;
      edtMEPrIp_Internalname = "MEPRIP" ;
      edtMEPrReg_Internalname = "MEPRREG" ;
      edtMEPrTkn_Internalname = "MEPRTKN" ;
      edtMEPrObj_Internalname = "MEPROBJ" ;
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
      Form.setCaption( httpContext.getMessage( "MEPr", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMEPrObj_Jsonclick = "" ;
      edtMEPrObj_Enabled = 1 ;
      edtMEPrTkn_Enabled = 1 ;
      edtMEPrReg_Jsonclick = "" ;
      edtMEPrReg_Enabled = 1 ;
      edtMEPrIp_Jsonclick = "" ;
      edtMEPrIp_Enabled = 1 ;
      edtMEPrUsu_Jsonclick = "" ;
      edtMEPrUsu_Enabled = 1 ;
      edtMEPrHdr_Jsonclick = "" ;
      edtMEPrHdr_Enabled = 1 ;
      edtMEPrParDsc_Jsonclick = "" ;
      edtMEPrParDsc_Enabled = 1 ;
      edtMEPrParCod_Jsonclick = "" ;
      edtMEPrParCod_Enabled = 1 ;
      edtMEPrMaqDsc_Jsonclick = "" ;
      edtMEPrMaqDsc_Enabled = 1 ;
      edtMEPrMaqCod_Jsonclick = "" ;
      edtMEPrMaqCod_Enabled = 1 ;
      edtMEPrFasDsc_Jsonclick = "" ;
      edtMEPrFasDsc_Enabled = 1 ;
      edtMEPrFasCod_Jsonclick = "" ;
      edtMEPrFasCod_Enabled = 1 ;
      edtMEnvOrd_Jsonclick = "" ;
      edtMEnvOrd_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtMEPrId_Jsonclick = "" ;
      edtMEPrId_Enabled = 1 ;
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
      GX_FocusControl = edtEmprCod_Internalname ;
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

   public void valid_Meprid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrim( localUtil.ntoc( A14152MEnvOrd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14691MEPrFasCod", GXutil.rtrim( A14691MEPrFasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14692MEPrFasDsc", GXutil.rtrim( A14692MEPrFasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A14693MEPrMaqCod", GXutil.rtrim( A14693MEPrMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14694MEPrMaqDsc", GXutil.rtrim( A14694MEPrMaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A14695MEPrParCod", GXutil.ltrim( localUtil.ntoc( A14695MEPrParCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14696MEPrParDsc", GXutil.rtrim( A14696MEPrParDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A14697MEPrHdr", GXutil.rtrim( A14697MEPrHdr));
      httpContext.ajax_rsp_assign_attri("", false, "A14698MEPrUsu", GXutil.rtrim( A14698MEPrUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A14699MEPrIp", A14699MEPrIp);
      httpContext.ajax_rsp_assign_attri("", false, "A14700MEPrReg", localUtil.ttoc( A14700MEPrReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14701MEPrTkn", A14701MEPrTkn);
      httpContext.ajax_rsp_assign_attri("", false, "A14702MEPrObj", A14702MEPrObj);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14674MEPrId", GXutil.ltrim( localUtil.ntoc( Z14674MEPrId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14152MEnvOrd", GXutil.ltrim( localUtil.ntoc( Z14152MEnvOrd, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14691MEPrFasCod", GXutil.rtrim( Z14691MEPrFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14692MEPrFasDsc", GXutil.rtrim( Z14692MEPrFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14693MEPrMaqCod", GXutil.rtrim( Z14693MEPrMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14694MEPrMaqDsc", GXutil.rtrim( Z14694MEPrMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14695MEPrParCod", GXutil.ltrim( localUtil.ntoc( Z14695MEPrParCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14696MEPrParDsc", GXutil.rtrim( Z14696MEPrParDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14697MEPrHdr", GXutil.rtrim( Z14697MEPrHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14698MEPrUsu", GXutil.rtrim( Z14698MEPrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14699MEPrIp", Z14699MEPrIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14700MEPrReg", localUtil.ttoc( Z14700MEPrReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14701MEPrTkn", Z14701MEPrTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14702MEPrObj", Z14702MEPrObj);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Menvord( )
   {
      /* Using cursor T01W815 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), "", "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MENVORD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(13);
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
      setEventMetadata("VALID_MEPRID","{handler:'valid_Meprid',iparms:[{av:'A14674MEPrId',fld:'MEPRID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MEPRID",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A14152MEnvOrd',fld:'MENVORD',pic:'ZZZ9'},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14692MEPrFasDsc',fld:'MEPRFASDSC',pic:''},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14694MEPrMaqDsc',fld:'MEPRMAQDSC',pic:''},{av:'A14695MEPrParCod',fld:'MEPRPARCOD',pic:'ZZZ9'},{av:'A14696MEPrParDsc',fld:'MEPRPARDSC',pic:''},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14674MEPrId'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z14152MEnvOrd'},{av:'Z14691MEPrFasCod'},{av:'Z14692MEPrFasDsc'},{av:'Z14693MEPrMaqCod'},{av:'Z14694MEPrMaqDsc'},{av:'Z14695MEPrParCod'},{av:'Z14696MEPrParDsc'},{av:'Z14697MEPrHdr'},{av:'Z14698MEPrUsu'},{av:'Z14699MEPrIp'},{av:'Z14700MEPrReg'},{av:'Z14701MEPrTkn'},{av:'Z14702MEPrObj'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_MENVORD","{handler:'valid_Menvord',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A14152MEnvOrd',fld:'MENVORD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_MENVORD",",oparms:[]}");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z14691MEPrFasCod = "" ;
      Z14692MEPrFasDsc = "" ;
      Z14693MEPrMaqCod = "" ;
      Z14694MEPrMaqDsc = "" ;
      Z14696MEPrParDsc = "" ;
      Z14697MEPrHdr = "" ;
      Z14698MEPrUsu = "" ;
      Z14699MEPrIp = "" ;
      Z14700MEPrReg = GXutil.resetTime( GXutil.nullDate() );
      Z14701MEPrTkn = "" ;
      Z14702MEPrObj = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
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
      A14691MEPrFasCod = "" ;
      A14692MEPrFasDsc = "" ;
      A14693MEPrMaqCod = "" ;
      A14694MEPrMaqDsc = "" ;
      A14696MEPrParDsc = "" ;
      A14697MEPrHdr = "" ;
      A14698MEPrUsu = "" ;
      A14699MEPrIp = "" ;
      A14700MEPrReg = GXutil.resetTime( GXutil.nullDate() );
      A14701MEPrTkn = "" ;
      A14702MEPrObj = "" ;
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
      T01W85_A14674MEPrId = new long[1] ;
      T01W85_A14691MEPrFasCod = new String[] {""} ;
      T01W85_A14692MEPrFasDsc = new String[] {""} ;
      T01W85_A14693MEPrMaqCod = new String[] {""} ;
      T01W85_A14694MEPrMaqDsc = new String[] {""} ;
      T01W85_A14695MEPrParCod = new short[1] ;
      T01W85_A14696MEPrParDsc = new String[] {""} ;
      T01W85_A14697MEPrHdr = new String[] {""} ;
      T01W85_A14698MEPrUsu = new String[] {""} ;
      T01W85_A14699MEPrIp = new String[] {""} ;
      T01W85_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01W85_A14701MEPrTkn = new String[] {""} ;
      T01W85_A14702MEPrObj = new String[] {""} ;
      T01W85_A396EmprCod = new String[] {""} ;
      T01W85_A129BarCod = new int[1] ;
      T01W85_A132BarCodReo = new byte[1] ;
      T01W85_A130BarCodPar = new String[] {""} ;
      T01W85_A14152MEnvOrd = new short[1] ;
      T01W84_A396EmprCod = new String[] {""} ;
      T01W86_A396EmprCod = new String[] {""} ;
      T01W87_A14674MEPrId = new long[1] ;
      T01W83_A14674MEPrId = new long[1] ;
      T01W83_A14691MEPrFasCod = new String[] {""} ;
      T01W83_A14692MEPrFasDsc = new String[] {""} ;
      T01W83_A14693MEPrMaqCod = new String[] {""} ;
      T01W83_A14694MEPrMaqDsc = new String[] {""} ;
      T01W83_A14695MEPrParCod = new short[1] ;
      T01W83_A14696MEPrParDsc = new String[] {""} ;
      T01W83_A14697MEPrHdr = new String[] {""} ;
      T01W83_A14698MEPrUsu = new String[] {""} ;
      T01W83_A14699MEPrIp = new String[] {""} ;
      T01W83_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01W83_A14701MEPrTkn = new String[] {""} ;
      T01W83_A14702MEPrObj = new String[] {""} ;
      T01W83_A396EmprCod = new String[] {""} ;
      T01W83_A129BarCod = new int[1] ;
      T01W83_A132BarCodReo = new byte[1] ;
      T01W83_A130BarCodPar = new String[] {""} ;
      T01W83_A14152MEnvOrd = new short[1] ;
      sMode1920 = "" ;
      T01W88_A14674MEPrId = new long[1] ;
      T01W89_A14674MEPrId = new long[1] ;
      T01W82_A14674MEPrId = new long[1] ;
      T01W82_A14691MEPrFasCod = new String[] {""} ;
      T01W82_A14692MEPrFasDsc = new String[] {""} ;
      T01W82_A14693MEPrMaqCod = new String[] {""} ;
      T01W82_A14694MEPrMaqDsc = new String[] {""} ;
      T01W82_A14695MEPrParCod = new short[1] ;
      T01W82_A14696MEPrParDsc = new String[] {""} ;
      T01W82_A14697MEPrHdr = new String[] {""} ;
      T01W82_A14698MEPrUsu = new String[] {""} ;
      T01W82_A14699MEPrIp = new String[] {""} ;
      T01W82_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01W82_A14701MEPrTkn = new String[] {""} ;
      T01W82_A14702MEPrObj = new String[] {""} ;
      T01W82_A396EmprCod = new String[] {""} ;
      T01W82_A129BarCod = new int[1] ;
      T01W82_A132BarCodReo = new byte[1] ;
      T01W82_A130BarCodPar = new String[] {""} ;
      T01W82_A14152MEnvOrd = new short[1] ;
      T01W811_A14674MEPrId = new long[1] ;
      T01W814_A14674MEPrId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ14691MEPrFasCod = "" ;
      ZZ14692MEPrFasDsc = "" ;
      ZZ14693MEPrMaqCod = "" ;
      ZZ14694MEPrMaqDsc = "" ;
      ZZ14696MEPrParDsc = "" ;
      ZZ14697MEPrHdr = "" ;
      ZZ14698MEPrUsu = "" ;
      ZZ14699MEPrIp = "" ;
      ZZ14700MEPrReg = GXutil.resetTime( GXutil.nullDate() );
      ZZ14701MEPrTkn = "" ;
      ZZ14702MEPrObj = "" ;
      T01W815_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mepr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mepr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mepr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mepr__default(),
         new Object[] {
             new Object[] {
            T01W82_A14674MEPrId, T01W82_A14691MEPrFasCod, T01W82_A14692MEPrFasDsc, T01W82_A14693MEPrMaqCod, T01W82_A14694MEPrMaqDsc, T01W82_A14695MEPrParCod, T01W82_A14696MEPrParDsc, T01W82_A14697MEPrHdr, T01W82_A14698MEPrUsu, T01W82_A14699MEPrIp,
            T01W82_A14700MEPrReg, T01W82_A14701MEPrTkn, T01W82_A14702MEPrObj, T01W82_A396EmprCod, T01W82_A129BarCod, T01W82_A132BarCodReo, T01W82_A130BarCodPar, T01W82_A14152MEnvOrd
            }
            , new Object[] {
            T01W83_A14674MEPrId, T01W83_A14691MEPrFasCod, T01W83_A14692MEPrFasDsc, T01W83_A14693MEPrMaqCod, T01W83_A14694MEPrMaqDsc, T01W83_A14695MEPrParCod, T01W83_A14696MEPrParDsc, T01W83_A14697MEPrHdr, T01W83_A14698MEPrUsu, T01W83_A14699MEPrIp,
            T01W83_A14700MEPrReg, T01W83_A14701MEPrTkn, T01W83_A14702MEPrObj, T01W83_A396EmprCod, T01W83_A129BarCod, T01W83_A132BarCodReo, T01W83_A130BarCodPar, T01W83_A14152MEnvOrd
            }
            , new Object[] {
            T01W84_A396EmprCod
            }
            , new Object[] {
            T01W85_A14674MEPrId, T01W85_A14691MEPrFasCod, T01W85_A14692MEPrFasDsc, T01W85_A14693MEPrMaqCod, T01W85_A14694MEPrMaqDsc, T01W85_A14695MEPrParCod, T01W85_A14696MEPrParDsc, T01W85_A14697MEPrHdr, T01W85_A14698MEPrUsu, T01W85_A14699MEPrIp,
            T01W85_A14700MEPrReg, T01W85_A14701MEPrTkn, T01W85_A14702MEPrObj, T01W85_A396EmprCod, T01W85_A129BarCod, T01W85_A132BarCodReo, T01W85_A130BarCodPar, T01W85_A14152MEnvOrd
            }
            , new Object[] {
            T01W86_A396EmprCod
            }
            , new Object[] {
            T01W87_A14674MEPrId
            }
            , new Object[] {
            T01W88_A14674MEPrId
            }
            , new Object[] {
            T01W89_A14674MEPrId
            }
            , new Object[] {
            }
            , new Object[] {
            T01W811_A14674MEPrId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01W814_A14674MEPrId
            }
            , new Object[] {
            T01W815_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private short Z14695MEPrParCod ;
   private short Z14152MEnvOrd ;
   private short A14152MEnvOrd ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14695MEPrParCod ;
   private short RcdFound1920 ;
   private short nIsDirty_1920 ;
   private short ZZ14152MEnvOrd ;
   private short ZZ14695MEPrParCod ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtMEPrId_Enabled ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtMEnvOrd_Enabled ;
   private int edtMEPrFasCod_Enabled ;
   private int edtMEPrFasDsc_Enabled ;
   private int edtMEPrMaqCod_Enabled ;
   private int edtMEPrMaqDsc_Enabled ;
   private int edtMEPrParCod_Enabled ;
   private int edtMEPrParDsc_Enabled ;
   private int edtMEPrHdr_Enabled ;
   private int edtMEPrUsu_Enabled ;
   private int edtMEPrIp_Enabled ;
   private int edtMEPrReg_Enabled ;
   private int edtMEPrTkn_Enabled ;
   private int edtMEPrObj_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ129BarCod ;
   private long Z14674MEPrId ;
   private long A14674MEPrId ;
   private long ZZ14674MEPrId ;
   private String sPrefix ;
   private String Z14691MEPrFasCod ;
   private String Z14692MEPrFasDsc ;
   private String Z14693MEPrMaqCod ;
   private String Z14694MEPrMaqDsc ;
   private String Z14696MEPrParDsc ;
   private String Z14697MEPrHdr ;
   private String Z14698MEPrUsu ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMEPrId_Internalname ;
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
   private String edtMEPrId_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtMEnvOrd_Internalname ;
   private String edtMEnvOrd_Jsonclick ;
   private String edtMEPrFasCod_Internalname ;
   private String A14691MEPrFasCod ;
   private String edtMEPrFasCod_Jsonclick ;
   private String edtMEPrFasDsc_Internalname ;
   private String A14692MEPrFasDsc ;
   private String edtMEPrFasDsc_Jsonclick ;
   private String edtMEPrMaqCod_Internalname ;
   private String A14693MEPrMaqCod ;
   private String edtMEPrMaqCod_Jsonclick ;
   private String edtMEPrMaqDsc_Internalname ;
   private String A14694MEPrMaqDsc ;
   private String edtMEPrMaqDsc_Jsonclick ;
   private String edtMEPrParCod_Internalname ;
   private String edtMEPrParCod_Jsonclick ;
   private String edtMEPrParDsc_Internalname ;
   private String A14696MEPrParDsc ;
   private String edtMEPrParDsc_Jsonclick ;
   private String edtMEPrHdr_Internalname ;
   private String A14697MEPrHdr ;
   private String edtMEPrHdr_Jsonclick ;
   private String edtMEPrUsu_Internalname ;
   private String A14698MEPrUsu ;
   private String edtMEPrUsu_Jsonclick ;
   private String edtMEPrIp_Internalname ;
   private String edtMEPrIp_Jsonclick ;
   private String edtMEPrReg_Internalname ;
   private String edtMEPrReg_Jsonclick ;
   private String edtMEPrTkn_Internalname ;
   private String edtMEPrObj_Internalname ;
   private String edtMEPrObj_Jsonclick ;
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
   private String sMode1920 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ14691MEPrFasCod ;
   private String ZZ14692MEPrFasDsc ;
   private String ZZ14693MEPrMaqCod ;
   private String ZZ14694MEPrMaqDsc ;
   private String ZZ14696MEPrParDsc ;
   private String ZZ14697MEPrHdr ;
   private String ZZ14698MEPrUsu ;
   private java.util.Date Z14700MEPrReg ;
   private java.util.Date A14700MEPrReg ;
   private java.util.Date ZZ14700MEPrReg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private String Z14699MEPrIp ;
   private String Z14701MEPrTkn ;
   private String Z14702MEPrObj ;
   private String A14699MEPrIp ;
   private String A14701MEPrTkn ;
   private String A14702MEPrObj ;
   private String ZZ14699MEPrIp ;
   private String ZZ14701MEPrTkn ;
   private String ZZ14702MEPrObj ;
   private IDataStoreProvider pr_default ;
   private long[] T01W85_A14674MEPrId ;
   private String[] T01W85_A14691MEPrFasCod ;
   private String[] T01W85_A14692MEPrFasDsc ;
   private String[] T01W85_A14693MEPrMaqCod ;
   private String[] T01W85_A14694MEPrMaqDsc ;
   private short[] T01W85_A14695MEPrParCod ;
   private String[] T01W85_A14696MEPrParDsc ;
   private String[] T01W85_A14697MEPrHdr ;
   private String[] T01W85_A14698MEPrUsu ;
   private String[] T01W85_A14699MEPrIp ;
   private java.util.Date[] T01W85_A14700MEPrReg ;
   private String[] T01W85_A14701MEPrTkn ;
   private String[] T01W85_A14702MEPrObj ;
   private String[] T01W85_A396EmprCod ;
   private int[] T01W85_A129BarCod ;
   private byte[] T01W85_A132BarCodReo ;
   private String[] T01W85_A130BarCodPar ;
   private short[] T01W85_A14152MEnvOrd ;
   private String[] T01W84_A396EmprCod ;
   private String[] T01W86_A396EmprCod ;
   private long[] T01W87_A14674MEPrId ;
   private long[] T01W83_A14674MEPrId ;
   private String[] T01W83_A14691MEPrFasCod ;
   private String[] T01W83_A14692MEPrFasDsc ;
   private String[] T01W83_A14693MEPrMaqCod ;
   private String[] T01W83_A14694MEPrMaqDsc ;
   private short[] T01W83_A14695MEPrParCod ;
   private String[] T01W83_A14696MEPrParDsc ;
   private String[] T01W83_A14697MEPrHdr ;
   private String[] T01W83_A14698MEPrUsu ;
   private String[] T01W83_A14699MEPrIp ;
   private java.util.Date[] T01W83_A14700MEPrReg ;
   private String[] T01W83_A14701MEPrTkn ;
   private String[] T01W83_A14702MEPrObj ;
   private String[] T01W83_A396EmprCod ;
   private int[] T01W83_A129BarCod ;
   private byte[] T01W83_A132BarCodReo ;
   private String[] T01W83_A130BarCodPar ;
   private short[] T01W83_A14152MEnvOrd ;
   private long[] T01W88_A14674MEPrId ;
   private long[] T01W89_A14674MEPrId ;
   private long[] T01W82_A14674MEPrId ;
   private String[] T01W82_A14691MEPrFasCod ;
   private String[] T01W82_A14692MEPrFasDsc ;
   private String[] T01W82_A14693MEPrMaqCod ;
   private String[] T01W82_A14694MEPrMaqDsc ;
   private short[] T01W82_A14695MEPrParCod ;
   private String[] T01W82_A14696MEPrParDsc ;
   private String[] T01W82_A14697MEPrHdr ;
   private String[] T01W82_A14698MEPrUsu ;
   private String[] T01W82_A14699MEPrIp ;
   private java.util.Date[] T01W82_A14700MEPrReg ;
   private String[] T01W82_A14701MEPrTkn ;
   private String[] T01W82_A14702MEPrObj ;
   private String[] T01W82_A396EmprCod ;
   private int[] T01W82_A129BarCod ;
   private byte[] T01W82_A132BarCodReo ;
   private String[] T01W82_A130BarCodPar ;
   private short[] T01W82_A14152MEnvOrd ;
   private long[] T01W811_A14674MEPrId ;
   private long[] T01W814_A14674MEPrId ;
   private String[] T01W815_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mepr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mepr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mepr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mepr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01W82", "SELECT MEPrId, MEPrFasCod, MEPrFasDsc, MEPrMaqCod, MEPrMaqDsc, MEPrParCod, MEPrParDsc, MEPrHdr, MEPrUsu, MEPrIp, MEPrReg, MEPrTkn, MEPrObj, EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM MEPr WHERE MEPrId = ?  FOR UPDATE OF MEPrFasCod, MEPrFasDsc, MEPrMaqCod, MEPrMaqDsc, MEPrParCod, MEPrParDsc, MEPrHdr, MEPrUsu, MEPrIp, MEPrReg, MEPrTkn, MEPrObj, EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W83", "SELECT MEPrId, MEPrFasCod, MEPrFasDsc, MEPrMaqCod, MEPrMaqDsc, MEPrParCod, MEPrParDsc, MEPrHdr, MEPrUsu, MEPrIp, MEPrReg, MEPrTkn, MEPrObj, EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM MEPr WHERE MEPrId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W84", "SELECT EmprCod FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W85", "SELECT /*+ FIRST_ROWS(100) */ TM1.MEPrId, TM1.MEPrFasCod, TM1.MEPrFasDsc, TM1.MEPrMaqCod, TM1.MEPrMaqDsc, TM1.MEPrParCod, TM1.MEPrParDsc, TM1.MEPrHdr, TM1.MEPrUsu, TM1.MEPrIp, TM1.MEPrReg, TM1.MEPrTkn, TM1.MEPrObj, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MEnvOrd FROM MEPr TM1 WHERE TM1.MEPrId = ? ORDER BY TM1.MEPrId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W86", "SELECT EmprCod FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W87", "SELECT /*+ FIRST_ROWS(1) */ MEPrId FROM MEPr WHERE MEPrId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W88", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MEPrId FROM MEPr WHERE ( MEPrId > ?) ORDER BY MEPrId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W89", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MEPrId FROM MEPr WHERE ( MEPrId < ?) ORDER BY MEPrId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01W810", "INSERT INTO MEPr(MEPrFasCod, MEPrFasDsc, MEPrMaqCod, MEPrMaqDsc, MEPrParCod, MEPrParDsc, MEPrHdr, MEPrUsu, MEPrIp, MEPrReg, MEPrTkn, MEPrObj, EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "MEPr")
         ,new ForEachCursor("T01W811", "SELECT MEPrId.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01W812", "UPDATE MEPr SET MEPrFasCod=?, MEPrFasDsc=?, MEPrMaqCod=?, MEPrMaqDsc=?, MEPrParCod=?, MEPrParDsc=?, MEPrHdr=?, MEPrUsu=?, MEPrIp=?, MEPrReg=?, MEPrTkn=?, MEPrObj=?, EmprCod=?, BarCod=?, BarCodReo=?, BarCodPar=?, MEnvOrd=?  WHERE MEPrId = ?", GX_NOMASK, "MEPr")
         ,new UpdateCursor("T01W813", "DELETE FROM MEPr  WHERE MEPrId = ?", GX_NOMASK, "MEPr")
         ,new ForEachCursor("T01W814", "SELECT /*+ FIRST_ROWS(100) */ MEPrId FROM MEPr ORDER BY MEPrId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W815", "SELECT EmprCod FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11, true);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11, true);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11, true);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 20);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 30);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setVarchar(9, (String)parms[8], 20, false);
               stmt.setDateTime(10, (java.util.Date)parms[9], false, true);
               stmt.setVarchar(11, (String)parms[10], 256, false);
               stmt.setVarchar(12, (String)parms[11], 100, false);
               stmt.setString(13, (String)parms[12], 3);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 20);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 30);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setVarchar(9, (String)parms[8], 20, false);
               stmt.setDateTime(10, (java.util.Date)parms[9], false, true);
               stmt.setVarchar(11, (String)parms[10], 256, false);
               stmt.setVarchar(12, (String)parms[11], 100, false);
               stmt.setString(13, (String)parms[12], 3);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setLong(18, ((Number) parms[17]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

