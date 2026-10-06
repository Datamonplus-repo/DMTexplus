package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrpr_impl extends GXDataArea
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "M Recibido Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMRPrId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public mrpr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrpr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrpr_impl.class ));
   }

   public mrpr_impl( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkMRPrEr = UIFactory.getCheckbox(this);
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
      A14722MRPrEr = GXutil.strtobool( GXutil.booltostr( A14722MRPrEr)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14722MRPrEr", A14722MRPrEr);
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "M Recibido Produccion", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRPr.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Ingenieria\\MRPr.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrId_Internalname, httpContext.getMessage( "Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrId_Internalname, GXutil.ltrim( localUtil.ntoc( A14681MRPrId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRPrId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14681MRPrId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14681MRPrId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_Ingenieria\\MRPr.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRPr.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRPr.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrOrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrOrd_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A14761MRPrOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRPrOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14761MRPrOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14761MRPrOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrOrd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrLin_Internalname, httpContext.getMessage( "Lìnea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrLin_Internalname, GXutil.ltrim( localUtil.ntoc( A14762MRPrLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRPrLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14762MRPrLin), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14762MRPrLin), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrLin_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrFasCod_Internalname, httpContext.getMessage( "fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrFasCod_Internalname, GXutil.rtrim( A14719MRPrFasCod), GXutil.rtrim( localUtil.format( A14719MRPrFasCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrFasCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrFasDsc_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrFasDsc_Internalname, A14759MRPrFasDsc, GXutil.rtrim( localUtil.format( A14759MRPrFasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrFasDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrFasDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrMaqCod_Internalname, httpContext.getMessage( "máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrMaqCod_Internalname, GXutil.rtrim( A14720MRPrMaqCod), GXutil.rtrim( localUtil.format( A14720MRPrMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrMaqDsc_Internalname, httpContext.getMessage( "Máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrMaqDsc_Internalname, A14760MRPrMaqDsc, GXutil.rtrim( localUtil.format( A14760MRPrMaqDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrMaqDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrMaqDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrHdr_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrHdr_Internalname, GXutil.rtrim( A14755MRPrHdr), GXutil.rtrim( localUtil.format( A14755MRPrHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrHdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrHdr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Hdr", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrHdr2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrHdr2_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrHdr2_Internalname, A14754MRPrHdr2, GXutil.rtrim( localUtil.format( A14754MRPrHdr2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrHdr2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrHdr2_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkMRPrEr.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkMRPrEr.getInternalname(), httpContext.getMessage( "Error", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkMRPrEr.getInternalname(), GXutil.booltostr( A14722MRPrEr), "", httpContext.getMessage( "Error", ""), 1, chkMRPrEr.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(99, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,99);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrFec_Internalname, httpContext.getMessage( "Registrado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMRPrFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrFec_Internalname, localUtil.ttoc( A14682MRPrFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14682MRPrFec, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrFec_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMRPrFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMRPrFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MRPr.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrVal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrVal_Internalname, httpContext.getMessage( "Valor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrVal_Internalname, GXutil.rtrim( A14721MRPrVal), GXutil.rtrim( localUtil.format( A14721MRPrVal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrVal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrVal_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrValMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrValMin_Internalname, httpContext.getMessage( "Val Min", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrValMin_Internalname, GXutil.rtrim( A14764MRPrValMin), GXutil.rtrim( localUtil.format( A14764MRPrValMin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrValMin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrValMin_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrValMax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrValMax_Internalname, httpContext.getMessage( "Val Max", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrValMax_Internalname, GXutil.rtrim( A14765MRPrValMax), GXutil.rtrim( localUtil.format( A14765MRPrValMax, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrValMax_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrValMax_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrPLC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrPLC_Internalname, httpContext.getMessage( "c/PLC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrPLC_Internalname, A14757MRPrPLC, GXutil.rtrim( localUtil.format( A14757MRPrPLC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrPLC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrPLC_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrParCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrParCod_Internalname, httpContext.getMessage( "parametro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrParCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14750MRPrParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRPrParCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14750MRPrParCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14750MRPrParCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrParCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrParCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrParDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrParDsc_Internalname, httpContext.getMessage( "Parametro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrParDsc_Internalname, A14758MRPrParDsc, GXutil.rtrim( localUtil.format( A14758MRPrParDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrParDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrParDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrParId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrParId_Internalname, httpContext.getMessage( "Parametro Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrParId_Internalname, GXutil.ltrim( localUtil.ntoc( A14723MRPrParId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRPrParId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14723MRPrParId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14723MRPrParId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrParId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrParId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrFecEv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrFecEv_Internalname, httpContext.getMessage( "Evaluado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMRPrFecEv_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrFecEv_Internalname, localUtil.ttoc( A14763MRPrFecEv, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14763MRPrFecEv, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrFecEv_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrFecEv_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMRPrFecEv_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMRPrFecEv_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MRPr.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrUsu_Internalname, httpContext.getMessage( "Usu", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrUsu_Internalname, GXutil.rtrim( A14751MRPrUsu), GXutil.rtrim( localUtil.format( A14751MRPrUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrUsu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrIp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrIp_Internalname, httpContext.getMessage( "Ip", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrIp_Internalname, A14752MRPrIp, GXutil.rtrim( localUtil.format( A14752MRPrIp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrIp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrIp_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrReg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrReg_Internalname, httpContext.getMessage( "Reg", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMRPrReg_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPrReg_Internalname, localUtil.ttoc( A14753MRPrReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14753MRPrReg, "99/99/99 99:99:99.999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPrReg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRPrReg_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMRPrReg_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMRPrReg_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MRPr.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPrTkn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPrTkn_Internalname, httpContext.getMessage( "Token", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMRPrTkn_Internalname, A14756MRPrTkn, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", (short)(0), 1, edtMRPrTkn_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Ingenieria\\MRPr.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRPr.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRPr.htm");
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
         Z14681MRPrId = localUtil.ctol( httpContext.cgiGet( "Z14681MRPrId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14761MRPrOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z14761MRPrOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14762MRPrLin = localUtil.ctol( httpContext.cgiGet( "Z14762MRPrLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14719MRPrFasCod = httpContext.cgiGet( "Z14719MRPrFasCod") ;
         Z14759MRPrFasDsc = httpContext.cgiGet( "Z14759MRPrFasDsc") ;
         Z14720MRPrMaqCod = httpContext.cgiGet( "Z14720MRPrMaqCod") ;
         Z14760MRPrMaqDsc = httpContext.cgiGet( "Z14760MRPrMaqDsc") ;
         Z14755MRPrHdr = httpContext.cgiGet( "Z14755MRPrHdr") ;
         Z14754MRPrHdr2 = httpContext.cgiGet( "Z14754MRPrHdr2") ;
         Z14722MRPrEr = GXutil.strtobool( httpContext.cgiGet( "Z14722MRPrEr")) ;
         Z14682MRPrFec = localUtil.ctot( httpContext.cgiGet( "Z14682MRPrFec"), 0) ;
         Z14721MRPrVal = httpContext.cgiGet( "Z14721MRPrVal") ;
         Z14764MRPrValMin = httpContext.cgiGet( "Z14764MRPrValMin") ;
         Z14765MRPrValMax = httpContext.cgiGet( "Z14765MRPrValMax") ;
         Z14757MRPrPLC = httpContext.cgiGet( "Z14757MRPrPLC") ;
         Z14750MRPrParCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z14750MRPrParCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14758MRPrParDsc = httpContext.cgiGet( "Z14758MRPrParDsc") ;
         Z14723MRPrParId = localUtil.ctol( httpContext.cgiGet( "Z14723MRPrParId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14763MRPrFecEv = localUtil.ctot( httpContext.cgiGet( "Z14763MRPrFecEv"), 0) ;
         Z14751MRPrUsu = httpContext.cgiGet( "Z14751MRPrUsu") ;
         Z14752MRPrIp = httpContext.cgiGet( "Z14752MRPrIp") ;
         Z14753MRPrReg = localUtil.ctot( httpContext.cgiGet( "Z14753MRPrReg"), 0) ;
         Z14756MRPrTkn = httpContext.cgiGet( "Z14756MRPrTkn") ;
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRPrId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRPrId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRPRID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRPrId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14681MRPrId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14681MRPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14681MRPrId), 10, 0));
         }
         else
         {
            A14681MRPrId = localUtil.ctol( httpContext.cgiGet( edtMRPrId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14681MRPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14681MRPrId), 10, 0));
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRPrOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRPrOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRPRORD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRPrOrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14761MRPrOrd = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14761MRPrOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14761MRPrOrd), 4, 0));
         }
         else
         {
            A14761MRPrOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtMRPrOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14761MRPrOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14761MRPrOrd), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRPrLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRPrLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRPRLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRPrLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14762MRPrLin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14762MRPrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14762MRPrLin), 12, 0));
         }
         else
         {
            A14762MRPrLin = localUtil.ctol( httpContext.cgiGet( edtMRPrLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14762MRPrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14762MRPrLin), 12, 0));
         }
         A14719MRPrFasCod = httpContext.cgiGet( edtMRPrFasCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14719MRPrFasCod", A14719MRPrFasCod);
         A14759MRPrFasDsc = httpContext.cgiGet( edtMRPrFasDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14759MRPrFasDsc", A14759MRPrFasDsc);
         A14720MRPrMaqCod = httpContext.cgiGet( edtMRPrMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14720MRPrMaqCod", A14720MRPrMaqCod);
         A14760MRPrMaqDsc = httpContext.cgiGet( edtMRPrMaqDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14760MRPrMaqDsc", A14760MRPrMaqDsc);
         A14755MRPrHdr = httpContext.cgiGet( edtMRPrHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14755MRPrHdr", A14755MRPrHdr);
         A14754MRPrHdr2 = httpContext.cgiGet( edtMRPrHdr2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14754MRPrHdr2", A14754MRPrHdr2);
         A14722MRPrEr = GXutil.strtobool( httpContext.cgiGet( chkMRPrEr.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14722MRPrEr", A14722MRPrEr);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMRPrFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MRPRFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRPrFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14682MRPrFec = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14682MRPrFec", localUtil.ttoc( A14682MRPrFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14682MRPrFec = localUtil.ctot( httpContext.cgiGet( edtMRPrFec_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14682MRPrFec", localUtil.ttoc( A14682MRPrFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A14721MRPrVal = httpContext.cgiGet( edtMRPrVal_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14721MRPrVal", A14721MRPrVal);
         A14764MRPrValMin = httpContext.cgiGet( edtMRPrValMin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14764MRPrValMin", A14764MRPrValMin);
         A14765MRPrValMax = httpContext.cgiGet( edtMRPrValMax_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14765MRPrValMax", A14765MRPrValMax);
         A14757MRPrPLC = httpContext.cgiGet( edtMRPrPLC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14757MRPrPLC", A14757MRPrPLC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRPrParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRPrParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRPRPARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRPrParCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14750MRPrParCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14750MRPrParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14750MRPrParCod), 4, 0));
         }
         else
         {
            A14750MRPrParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtMRPrParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14750MRPrParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14750MRPrParCod), 4, 0));
         }
         A14758MRPrParDsc = httpContext.cgiGet( edtMRPrParDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14758MRPrParDsc", A14758MRPrParDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRPrParId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRPrParId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRPRPARID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRPrParId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14723MRPrParId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14723MRPrParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14723MRPrParId), 10, 0));
         }
         else
         {
            A14723MRPrParId = localUtil.ctol( httpContext.cgiGet( edtMRPrParId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14723MRPrParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14723MRPrParId), 10, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMRPrFecEv_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MRPRFECEV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRPrFecEv_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14763MRPrFecEv = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14763MRPrFecEv", localUtil.ttoc( A14763MRPrFecEv, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14763MRPrFecEv = localUtil.ctot( httpContext.cgiGet( edtMRPrFecEv_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14763MRPrFecEv", localUtil.ttoc( A14763MRPrFecEv, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A14751MRPrUsu = httpContext.cgiGet( edtMRPrUsu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14751MRPrUsu", A14751MRPrUsu);
         A14752MRPrIp = httpContext.cgiGet( edtMRPrIp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14752MRPrIp", A14752MRPrIp);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMRPrReg_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MRPRREG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRPrReg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14753MRPrReg = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14753MRPrReg", localUtil.ttoc( A14753MRPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14753MRPrReg = localUtil.ctot( httpContext.cgiGet( edtMRPrReg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14753MRPrReg", localUtil.ttoc( A14753MRPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A14756MRPrTkn = httpContext.cgiGet( edtMRPrTkn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14756MRPrTkn", A14756MRPrTkn);
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
            A14681MRPrId = GXutil.lval( httpContext.GetPar( "MRPrId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14681MRPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14681MRPrId), 10, 0));
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
            initAll1WD1925( ) ;
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
      disableAttributes1WD1925( ) ;
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

   public void resetCaption1WD0( )
   {
   }

   public void zm1WD1925( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14761MRPrOrd = T01WD3_A14761MRPrOrd[0] ;
            Z14762MRPrLin = T01WD3_A14762MRPrLin[0] ;
            Z14719MRPrFasCod = T01WD3_A14719MRPrFasCod[0] ;
            Z14759MRPrFasDsc = T01WD3_A14759MRPrFasDsc[0] ;
            Z14720MRPrMaqCod = T01WD3_A14720MRPrMaqCod[0] ;
            Z14760MRPrMaqDsc = T01WD3_A14760MRPrMaqDsc[0] ;
            Z14755MRPrHdr = T01WD3_A14755MRPrHdr[0] ;
            Z14754MRPrHdr2 = T01WD3_A14754MRPrHdr2[0] ;
            Z14722MRPrEr = T01WD3_A14722MRPrEr[0] ;
            Z14682MRPrFec = T01WD3_A14682MRPrFec[0] ;
            Z14721MRPrVal = T01WD3_A14721MRPrVal[0] ;
            Z14764MRPrValMin = T01WD3_A14764MRPrValMin[0] ;
            Z14765MRPrValMax = T01WD3_A14765MRPrValMax[0] ;
            Z14757MRPrPLC = T01WD3_A14757MRPrPLC[0] ;
            Z14750MRPrParCod = T01WD3_A14750MRPrParCod[0] ;
            Z14758MRPrParDsc = T01WD3_A14758MRPrParDsc[0] ;
            Z14723MRPrParId = T01WD3_A14723MRPrParId[0] ;
            Z14763MRPrFecEv = T01WD3_A14763MRPrFecEv[0] ;
            Z14751MRPrUsu = T01WD3_A14751MRPrUsu[0] ;
            Z14752MRPrIp = T01WD3_A14752MRPrIp[0] ;
            Z14753MRPrReg = T01WD3_A14753MRPrReg[0] ;
            Z14756MRPrTkn = T01WD3_A14756MRPrTkn[0] ;
            Z396EmprCod = T01WD3_A396EmprCod[0] ;
            Z129BarCod = T01WD3_A129BarCod[0] ;
            Z132BarCodReo = T01WD3_A132BarCodReo[0] ;
            Z130BarCodPar = T01WD3_A130BarCodPar[0] ;
         }
         else
         {
            Z14761MRPrOrd = A14761MRPrOrd ;
            Z14762MRPrLin = A14762MRPrLin ;
            Z14719MRPrFasCod = A14719MRPrFasCod ;
            Z14759MRPrFasDsc = A14759MRPrFasDsc ;
            Z14720MRPrMaqCod = A14720MRPrMaqCod ;
            Z14760MRPrMaqDsc = A14760MRPrMaqDsc ;
            Z14755MRPrHdr = A14755MRPrHdr ;
            Z14754MRPrHdr2 = A14754MRPrHdr2 ;
            Z14722MRPrEr = A14722MRPrEr ;
            Z14682MRPrFec = A14682MRPrFec ;
            Z14721MRPrVal = A14721MRPrVal ;
            Z14764MRPrValMin = A14764MRPrValMin ;
            Z14765MRPrValMax = A14765MRPrValMax ;
            Z14757MRPrPLC = A14757MRPrPLC ;
            Z14750MRPrParCod = A14750MRPrParCod ;
            Z14758MRPrParDsc = A14758MRPrParDsc ;
            Z14723MRPrParId = A14723MRPrParId ;
            Z14763MRPrFecEv = A14763MRPrFecEv ;
            Z14751MRPrUsu = A14751MRPrUsu ;
            Z14752MRPrIp = A14752MRPrIp ;
            Z14753MRPrReg = A14753MRPrReg ;
            Z14756MRPrTkn = A14756MRPrTkn ;
            Z396EmprCod = A396EmprCod ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z14681MRPrId = A14681MRPrId ;
         Z14761MRPrOrd = A14761MRPrOrd ;
         Z14762MRPrLin = A14762MRPrLin ;
         Z14719MRPrFasCod = A14719MRPrFasCod ;
         Z14759MRPrFasDsc = A14759MRPrFasDsc ;
         Z14720MRPrMaqCod = A14720MRPrMaqCod ;
         Z14760MRPrMaqDsc = A14760MRPrMaqDsc ;
         Z14755MRPrHdr = A14755MRPrHdr ;
         Z14754MRPrHdr2 = A14754MRPrHdr2 ;
         Z14722MRPrEr = A14722MRPrEr ;
         Z14682MRPrFec = A14682MRPrFec ;
         Z14721MRPrVal = A14721MRPrVal ;
         Z14764MRPrValMin = A14764MRPrValMin ;
         Z14765MRPrValMax = A14765MRPrValMax ;
         Z14757MRPrPLC = A14757MRPrPLC ;
         Z14750MRPrParCod = A14750MRPrParCod ;
         Z14758MRPrParDsc = A14758MRPrParDsc ;
         Z14723MRPrParId = A14723MRPrParId ;
         Z14763MRPrFecEv = A14763MRPrFecEv ;
         Z14751MRPrUsu = A14751MRPrUsu ;
         Z14752MRPrIp = A14752MRPrIp ;
         Z14753MRPrReg = A14753MRPrReg ;
         Z14756MRPrTkn = A14756MRPrTkn ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
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

   public void load1WD1925( )
   {
      /* Using cursor T01WD5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14681MRPrId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1925 = (short)(1) ;
         A14761MRPrOrd = T01WD5_A14761MRPrOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14761MRPrOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14761MRPrOrd), 4, 0));
         A14762MRPrLin = T01WD5_A14762MRPrLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14762MRPrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14762MRPrLin), 12, 0));
         A14719MRPrFasCod = T01WD5_A14719MRPrFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14719MRPrFasCod", A14719MRPrFasCod);
         A14759MRPrFasDsc = T01WD5_A14759MRPrFasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14759MRPrFasDsc", A14759MRPrFasDsc);
         A14720MRPrMaqCod = T01WD5_A14720MRPrMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14720MRPrMaqCod", A14720MRPrMaqCod);
         A14760MRPrMaqDsc = T01WD5_A14760MRPrMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14760MRPrMaqDsc", A14760MRPrMaqDsc);
         A14755MRPrHdr = T01WD5_A14755MRPrHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14755MRPrHdr", A14755MRPrHdr);
         A14754MRPrHdr2 = T01WD5_A14754MRPrHdr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14754MRPrHdr2", A14754MRPrHdr2);
         A14722MRPrEr = T01WD5_A14722MRPrEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14722MRPrEr", A14722MRPrEr);
         A14682MRPrFec = T01WD5_A14682MRPrFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14682MRPrFec", localUtil.ttoc( A14682MRPrFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14721MRPrVal = T01WD5_A14721MRPrVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14721MRPrVal", A14721MRPrVal);
         A14764MRPrValMin = T01WD5_A14764MRPrValMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14764MRPrValMin", A14764MRPrValMin);
         A14765MRPrValMax = T01WD5_A14765MRPrValMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14765MRPrValMax", A14765MRPrValMax);
         A14757MRPrPLC = T01WD5_A14757MRPrPLC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14757MRPrPLC", A14757MRPrPLC);
         A14750MRPrParCod = T01WD5_A14750MRPrParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14750MRPrParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14750MRPrParCod), 4, 0));
         A14758MRPrParDsc = T01WD5_A14758MRPrParDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14758MRPrParDsc", A14758MRPrParDsc);
         A14723MRPrParId = T01WD5_A14723MRPrParId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14723MRPrParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14723MRPrParId), 10, 0));
         A14763MRPrFecEv = T01WD5_A14763MRPrFecEv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14763MRPrFecEv", localUtil.ttoc( A14763MRPrFecEv, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14751MRPrUsu = T01WD5_A14751MRPrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14751MRPrUsu", A14751MRPrUsu);
         A14752MRPrIp = T01WD5_A14752MRPrIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14752MRPrIp", A14752MRPrIp);
         A14753MRPrReg = T01WD5_A14753MRPrReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14753MRPrReg", localUtil.ttoc( A14753MRPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14756MRPrTkn = T01WD5_A14756MRPrTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14756MRPrTkn", A14756MRPrTkn);
         A396EmprCod = T01WD5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01WD5_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01WD5_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01WD5_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         zm1WD1925( -1) ;
      }
      pr_default.close(3);
      onLoadActions1WD1925( ) ;
   }

   public void onLoadActions1WD1925( )
   {
   }

   public void checkExtendedTable1WD1925( )
   {
      nIsDirty_1925 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01WD4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1WD1925( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01WD6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
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

   public void getKey1WD1925( )
   {
      /* Using cursor T01WD7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14681MRPrId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1925 = (short)(1) ;
      }
      else
      {
         RcdFound1925 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01WD3 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14681MRPrId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1WD1925( 1) ;
         RcdFound1925 = (short)(1) ;
         A14681MRPrId = T01WD3_A14681MRPrId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14681MRPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14681MRPrId), 10, 0));
         A14761MRPrOrd = T01WD3_A14761MRPrOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14761MRPrOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14761MRPrOrd), 4, 0));
         A14762MRPrLin = T01WD3_A14762MRPrLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14762MRPrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14762MRPrLin), 12, 0));
         A14719MRPrFasCod = T01WD3_A14719MRPrFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14719MRPrFasCod", A14719MRPrFasCod);
         A14759MRPrFasDsc = T01WD3_A14759MRPrFasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14759MRPrFasDsc", A14759MRPrFasDsc);
         A14720MRPrMaqCod = T01WD3_A14720MRPrMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14720MRPrMaqCod", A14720MRPrMaqCod);
         A14760MRPrMaqDsc = T01WD3_A14760MRPrMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14760MRPrMaqDsc", A14760MRPrMaqDsc);
         A14755MRPrHdr = T01WD3_A14755MRPrHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14755MRPrHdr", A14755MRPrHdr);
         A14754MRPrHdr2 = T01WD3_A14754MRPrHdr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14754MRPrHdr2", A14754MRPrHdr2);
         A14722MRPrEr = T01WD3_A14722MRPrEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14722MRPrEr", A14722MRPrEr);
         A14682MRPrFec = T01WD3_A14682MRPrFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14682MRPrFec", localUtil.ttoc( A14682MRPrFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14721MRPrVal = T01WD3_A14721MRPrVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14721MRPrVal", A14721MRPrVal);
         A14764MRPrValMin = T01WD3_A14764MRPrValMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14764MRPrValMin", A14764MRPrValMin);
         A14765MRPrValMax = T01WD3_A14765MRPrValMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14765MRPrValMax", A14765MRPrValMax);
         A14757MRPrPLC = T01WD3_A14757MRPrPLC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14757MRPrPLC", A14757MRPrPLC);
         A14750MRPrParCod = T01WD3_A14750MRPrParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14750MRPrParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14750MRPrParCod), 4, 0));
         A14758MRPrParDsc = T01WD3_A14758MRPrParDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14758MRPrParDsc", A14758MRPrParDsc);
         A14723MRPrParId = T01WD3_A14723MRPrParId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14723MRPrParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14723MRPrParId), 10, 0));
         A14763MRPrFecEv = T01WD3_A14763MRPrFecEv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14763MRPrFecEv", localUtil.ttoc( A14763MRPrFecEv, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14751MRPrUsu = T01WD3_A14751MRPrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14751MRPrUsu", A14751MRPrUsu);
         A14752MRPrIp = T01WD3_A14752MRPrIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14752MRPrIp", A14752MRPrIp);
         A14753MRPrReg = T01WD3_A14753MRPrReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14753MRPrReg", localUtil.ttoc( A14753MRPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14756MRPrTkn = T01WD3_A14756MRPrTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14756MRPrTkn", A14756MRPrTkn);
         A396EmprCod = T01WD3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01WD3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01WD3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01WD3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Z14681MRPrId = A14681MRPrId ;
         sMode1925 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1WD1925( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1925 = (short)(0) ;
            initializeNonKey1WD1925( ) ;
         }
         Gx_mode = sMode1925 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1925 = (short)(0) ;
         initializeNonKey1WD1925( ) ;
         sMode1925 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1925 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1WD1925( ) ;
      if ( RcdFound1925 == 0 )
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
      RcdFound1925 = (short)(0) ;
      /* Using cursor T01WD8 */
      pr_default.execute(6, new Object[] {Long.valueOf(A14681MRPrId)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01WD8_A14681MRPrId[0] < A14681MRPrId ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01WD8_A14681MRPrId[0] > A14681MRPrId ) ) )
         {
            A14681MRPrId = T01WD8_A14681MRPrId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14681MRPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14681MRPrId), 10, 0));
            RcdFound1925 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1925 = (short)(0) ;
      /* Using cursor T01WD9 */
      pr_default.execute(7, new Object[] {Long.valueOf(A14681MRPrId)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01WD9_A14681MRPrId[0] > A14681MRPrId ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01WD9_A14681MRPrId[0] < A14681MRPrId ) ) )
         {
            A14681MRPrId = T01WD9_A14681MRPrId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14681MRPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14681MRPrId), 10, 0));
            RcdFound1925 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1WD1925( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMRPrId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1WD1925( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1925 == 1 )
         {
            if ( A14681MRPrId != Z14681MRPrId )
            {
               A14681MRPrId = Z14681MRPrId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14681MRPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14681MRPrId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MRPRID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMRPrId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMRPrId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1WD1925( ) ;
               GX_FocusControl = edtMRPrId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14681MRPrId != Z14681MRPrId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMRPrId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1WD1925( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MRPRID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMRPrId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtMRPrId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1WD1925( ) ;
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
      if ( A14681MRPrId != Z14681MRPrId )
      {
         A14681MRPrId = Z14681MRPrId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14681MRPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14681MRPrId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MRPRID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRPrId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMRPrId_Internalname ;
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
      if ( RcdFound1925 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "MRPRID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRPrId_Internalname ;
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
      scanStart1WD1925( ) ;
      if ( RcdFound1925 == 0 )
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
      scanEnd1WD1925( ) ;
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
      if ( RcdFound1925 == 0 )
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
      if ( RcdFound1925 == 0 )
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
      scanStart1WD1925( ) ;
      if ( RcdFound1925 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1925 != 0 )
         {
            scanNext1WD1925( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1WD1925( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1WD1925( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01WD2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14681MRPrId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MRPr"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z14761MRPrOrd != T01WD2_A14761MRPrOrd[0] ) || ( Z14762MRPrLin != T01WD2_A14762MRPrLin[0] ) || ( GXutil.strcmp(Z14719MRPrFasCod, T01WD2_A14719MRPrFasCod[0]) != 0 ) || ( GXutil.strcmp(Z14759MRPrFasDsc, T01WD2_A14759MRPrFasDsc[0]) != 0 ) || ( GXutil.strcmp(Z14720MRPrMaqCod, T01WD2_A14720MRPrMaqCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14760MRPrMaqDsc, T01WD2_A14760MRPrMaqDsc[0]) != 0 ) || ( GXutil.strcmp(Z14755MRPrHdr, T01WD2_A14755MRPrHdr[0]) != 0 ) || ( GXutil.strcmp(Z14754MRPrHdr2, T01WD2_A14754MRPrHdr2[0]) != 0 ) || ( Z14722MRPrEr != T01WD2_A14722MRPrEr[0] ) || !( GXutil.dateCompare(Z14682MRPrFec, T01WD2_A14682MRPrFec[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14721MRPrVal, T01WD2_A14721MRPrVal[0]) != 0 ) || ( GXutil.strcmp(Z14764MRPrValMin, T01WD2_A14764MRPrValMin[0]) != 0 ) || ( GXutil.strcmp(Z14765MRPrValMax, T01WD2_A14765MRPrValMax[0]) != 0 ) || ( GXutil.strcmp(Z14757MRPrPLC, T01WD2_A14757MRPrPLC[0]) != 0 ) || ( Z14750MRPrParCod != T01WD2_A14750MRPrParCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14758MRPrParDsc, T01WD2_A14758MRPrParDsc[0]) != 0 ) || ( Z14723MRPrParId != T01WD2_A14723MRPrParId[0] ) || !( GXutil.dateCompare(Z14763MRPrFecEv, T01WD2_A14763MRPrFecEv[0]) ) || ( GXutil.strcmp(Z14751MRPrUsu, T01WD2_A14751MRPrUsu[0]) != 0 ) || ( GXutil.strcmp(Z14752MRPrIp, T01WD2_A14752MRPrIp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z14753MRPrReg, T01WD2_A14753MRPrReg[0]) ) || ( GXutil.strcmp(Z14756MRPrTkn, T01WD2_A14756MRPrTkn[0]) != 0 ) || ( GXutil.strcmp(Z396EmprCod, T01WD2_A396EmprCod[0]) != 0 ) || ( Z129BarCod != T01WD2_A129BarCod[0] ) || ( Z132BarCodReo != T01WD2_A132BarCodReo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z130BarCodPar, T01WD2_A130BarCodPar[0]) != 0 ) )
         {
            if ( Z14761MRPrOrd != T01WD2_A14761MRPrOrd[0] )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrOrd");
               GXutil.writeLogRaw("Old: ",Z14761MRPrOrd);
               GXutil.writeLogRaw("Current: ",T01WD2_A14761MRPrOrd[0]);
            }
            if ( Z14762MRPrLin != T01WD2_A14762MRPrLin[0] )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrLin");
               GXutil.writeLogRaw("Old: ",Z14762MRPrLin);
               GXutil.writeLogRaw("Current: ",T01WD2_A14762MRPrLin[0]);
            }
            if ( GXutil.strcmp(Z14719MRPrFasCod, T01WD2_A14719MRPrFasCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrFasCod");
               GXutil.writeLogRaw("Old: ",Z14719MRPrFasCod);
               GXutil.writeLogRaw("Current: ",T01WD2_A14719MRPrFasCod[0]);
            }
            if ( GXutil.strcmp(Z14759MRPrFasDsc, T01WD2_A14759MRPrFasDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrFasDsc");
               GXutil.writeLogRaw("Old: ",Z14759MRPrFasDsc);
               GXutil.writeLogRaw("Current: ",T01WD2_A14759MRPrFasDsc[0]);
            }
            if ( GXutil.strcmp(Z14720MRPrMaqCod, T01WD2_A14720MRPrMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrMaqCod");
               GXutil.writeLogRaw("Old: ",Z14720MRPrMaqCod);
               GXutil.writeLogRaw("Current: ",T01WD2_A14720MRPrMaqCod[0]);
            }
            if ( GXutil.strcmp(Z14760MRPrMaqDsc, T01WD2_A14760MRPrMaqDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrMaqDsc");
               GXutil.writeLogRaw("Old: ",Z14760MRPrMaqDsc);
               GXutil.writeLogRaw("Current: ",T01WD2_A14760MRPrMaqDsc[0]);
            }
            if ( GXutil.strcmp(Z14755MRPrHdr, T01WD2_A14755MRPrHdr[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrHdr");
               GXutil.writeLogRaw("Old: ",Z14755MRPrHdr);
               GXutil.writeLogRaw("Current: ",T01WD2_A14755MRPrHdr[0]);
            }
            if ( GXutil.strcmp(Z14754MRPrHdr2, T01WD2_A14754MRPrHdr2[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrHdr2");
               GXutil.writeLogRaw("Old: ",Z14754MRPrHdr2);
               GXutil.writeLogRaw("Current: ",T01WD2_A14754MRPrHdr2[0]);
            }
            if ( Z14722MRPrEr != T01WD2_A14722MRPrEr[0] )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrEr");
               GXutil.writeLogRaw("Old: ",Z14722MRPrEr);
               GXutil.writeLogRaw("Current: ",T01WD2_A14722MRPrEr[0]);
            }
            if ( !( GXutil.dateCompare(Z14682MRPrFec, T01WD2_A14682MRPrFec[0]) ) )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrFec");
               GXutil.writeLogRaw("Old: ",Z14682MRPrFec);
               GXutil.writeLogRaw("Current: ",T01WD2_A14682MRPrFec[0]);
            }
            if ( GXutil.strcmp(Z14721MRPrVal, T01WD2_A14721MRPrVal[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrVal");
               GXutil.writeLogRaw("Old: ",Z14721MRPrVal);
               GXutil.writeLogRaw("Current: ",T01WD2_A14721MRPrVal[0]);
            }
            if ( GXutil.strcmp(Z14764MRPrValMin, T01WD2_A14764MRPrValMin[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrValMin");
               GXutil.writeLogRaw("Old: ",Z14764MRPrValMin);
               GXutil.writeLogRaw("Current: ",T01WD2_A14764MRPrValMin[0]);
            }
            if ( GXutil.strcmp(Z14765MRPrValMax, T01WD2_A14765MRPrValMax[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrValMax");
               GXutil.writeLogRaw("Old: ",Z14765MRPrValMax);
               GXutil.writeLogRaw("Current: ",T01WD2_A14765MRPrValMax[0]);
            }
            if ( GXutil.strcmp(Z14757MRPrPLC, T01WD2_A14757MRPrPLC[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrPLC");
               GXutil.writeLogRaw("Old: ",Z14757MRPrPLC);
               GXutil.writeLogRaw("Current: ",T01WD2_A14757MRPrPLC[0]);
            }
            if ( Z14750MRPrParCod != T01WD2_A14750MRPrParCod[0] )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrParCod");
               GXutil.writeLogRaw("Old: ",Z14750MRPrParCod);
               GXutil.writeLogRaw("Current: ",T01WD2_A14750MRPrParCod[0]);
            }
            if ( GXutil.strcmp(Z14758MRPrParDsc, T01WD2_A14758MRPrParDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrParDsc");
               GXutil.writeLogRaw("Old: ",Z14758MRPrParDsc);
               GXutil.writeLogRaw("Current: ",T01WD2_A14758MRPrParDsc[0]);
            }
            if ( Z14723MRPrParId != T01WD2_A14723MRPrParId[0] )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrParId");
               GXutil.writeLogRaw("Old: ",Z14723MRPrParId);
               GXutil.writeLogRaw("Current: ",T01WD2_A14723MRPrParId[0]);
            }
            if ( !( GXutil.dateCompare(Z14763MRPrFecEv, T01WD2_A14763MRPrFecEv[0]) ) )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrFecEv");
               GXutil.writeLogRaw("Old: ",Z14763MRPrFecEv);
               GXutil.writeLogRaw("Current: ",T01WD2_A14763MRPrFecEv[0]);
            }
            if ( GXutil.strcmp(Z14751MRPrUsu, T01WD2_A14751MRPrUsu[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrUsu");
               GXutil.writeLogRaw("Old: ",Z14751MRPrUsu);
               GXutil.writeLogRaw("Current: ",T01WD2_A14751MRPrUsu[0]);
            }
            if ( GXutil.strcmp(Z14752MRPrIp, T01WD2_A14752MRPrIp[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrIp");
               GXutil.writeLogRaw("Old: ",Z14752MRPrIp);
               GXutil.writeLogRaw("Current: ",T01WD2_A14752MRPrIp[0]);
            }
            if ( !( GXutil.dateCompare(Z14753MRPrReg, T01WD2_A14753MRPrReg[0]) ) )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrReg");
               GXutil.writeLogRaw("Old: ",Z14753MRPrReg);
               GXutil.writeLogRaw("Current: ",T01WD2_A14753MRPrReg[0]);
            }
            if ( GXutil.strcmp(Z14756MRPrTkn, T01WD2_A14756MRPrTkn[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"MRPrTkn");
               GXutil.writeLogRaw("Old: ",Z14756MRPrTkn);
               GXutil.writeLogRaw("Current: ",T01WD2_A14756MRPrTkn[0]);
            }
            if ( GXutil.strcmp(Z396EmprCod, T01WD2_A396EmprCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"EmprCod");
               GXutil.writeLogRaw("Old: ",Z396EmprCod);
               GXutil.writeLogRaw("Current: ",T01WD2_A396EmprCod[0]);
            }
            if ( Z129BarCod != T01WD2_A129BarCod[0] )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01WD2_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01WD2_A132BarCodReo[0] )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01WD2_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01WD2_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrpr:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01WD2_A130BarCodPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"MRPr"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1WD1925( )
   {
      beforeValidate1WD1925( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1WD1925( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1WD1925( 0) ;
         checkOptimisticConcurrency1WD1925( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1WD1925( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1WD1925( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01WD10 */
                  pr_default.execute(8, new Object[] {Short.valueOf(A14761MRPrOrd), Long.valueOf(A14762MRPrLin), A14719MRPrFasCod, A14759MRPrFasDsc, A14720MRPrMaqCod, A14760MRPrMaqDsc, A14755MRPrHdr, A14754MRPrHdr2, Boolean.valueOf(A14722MRPrEr), A14682MRPrFec, A14721MRPrVal, A14764MRPrValMin, A14765MRPrValMax, A14757MRPrPLC, Short.valueOf(A14750MRPrParCod), A14758MRPrParDsc, Long.valueOf(A14723MRPrParId), A14763MRPrFecEv, A14751MRPrUsu, A14752MRPrIp, A14753MRPrReg, A14756MRPrTkn, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  /* Retrieving last key number assigned */
                  /* Using cursor T01WD11 */
                  pr_default.execute(9);
                  A14681MRPrId = T01WD11_A14681MRPrId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14681MRPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14681MRPrId), 10, 0));
                  pr_default.close(9);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MRPr");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1WD0( ) ;
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
            load1WD1925( ) ;
         }
         endLevel1WD1925( ) ;
      }
      closeExtendedTableCursors1WD1925( ) ;
   }

   public void update1WD1925( )
   {
      beforeValidate1WD1925( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1WD1925( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1WD1925( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1WD1925( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1WD1925( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01WD12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A14761MRPrOrd), Long.valueOf(A14762MRPrLin), A14719MRPrFasCod, A14759MRPrFasDsc, A14720MRPrMaqCod, A14760MRPrMaqDsc, A14755MRPrHdr, A14754MRPrHdr2, Boolean.valueOf(A14722MRPrEr), A14682MRPrFec, A14721MRPrVal, A14764MRPrValMin, A14765MRPrValMax, A14757MRPrPLC, Short.valueOf(A14750MRPrParCod), A14758MRPrParDsc, Long.valueOf(A14723MRPrParId), A14763MRPrFecEv, A14751MRPrUsu, A14752MRPrIp, A14753MRPrReg, A14756MRPrTkn, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A14681MRPrId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MRPr");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MRPr"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1WD1925( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1WD0( ) ;
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
         endLevel1WD1925( ) ;
      }
      closeExtendedTableCursors1WD1925( ) ;
   }

   public void deferredUpdate1WD1925( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1WD1925( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1WD1925( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1WD1925( ) ;
         afterConfirm1WD1925( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1WD1925( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01WD13 */
               pr_default.execute(11, new Object[] {Long.valueOf(A14681MRPrId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("MRPr");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1925 == 0 )
                     {
                        initAll1WD1925( ) ;
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
                     resetCaption1WD0( ) ;
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
      sMode1925 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1WD1925( ) ;
      Gx_mode = sMode1925 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1WD1925( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1WD1925( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1WD1925( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.mrpr");
         if ( AnyError == 0 )
         {
            confirmValues1WD0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ingenieria.mrpr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1WD1925( )
   {
      /* Using cursor T01WD14 */
      pr_default.execute(12);
      RcdFound1925 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1925 = (short)(1) ;
         A14681MRPrId = T01WD14_A14681MRPrId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14681MRPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14681MRPrId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1WD1925( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1925 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1925 = (short)(1) ;
         A14681MRPrId = T01WD14_A14681MRPrId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14681MRPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14681MRPrId), 10, 0));
      }
   }

   public void scanEnd1WD1925( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1WD1925( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1WD1925( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1WD1925( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1WD1925( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1WD1925( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1WD1925( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1WD1925( )
   {
      edtMRPrId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrId_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtMRPrOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrOrd_Enabled), 5, 0), true);
      edtMRPrLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrLin_Enabled), 5, 0), true);
      edtMRPrFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrFasCod_Enabled), 5, 0), true);
      edtMRPrFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrFasDsc_Enabled), 5, 0), true);
      edtMRPrMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrMaqCod_Enabled), 5, 0), true);
      edtMRPrMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrMaqDsc_Enabled), 5, 0), true);
      edtMRPrHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrHdr_Enabled), 5, 0), true);
      edtMRPrHdr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrHdr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrHdr2_Enabled), 5, 0), true);
      chkMRPrEr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkMRPrEr.getInternalname(), "Enabled", GXutil.ltrimstr( chkMRPrEr.getEnabled(), 5, 0), true);
      edtMRPrFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrFec_Enabled), 5, 0), true);
      edtMRPrVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrVal_Enabled), 5, 0), true);
      edtMRPrValMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrValMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrValMin_Enabled), 5, 0), true);
      edtMRPrValMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrValMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrValMax_Enabled), 5, 0), true);
      edtMRPrPLC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrPLC_Enabled), 5, 0), true);
      edtMRPrParCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrParCod_Enabled), 5, 0), true);
      edtMRPrParDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrParDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrParDsc_Enabled), 5, 0), true);
      edtMRPrParId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrParId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrParId_Enabled), 5, 0), true);
      edtMRPrFecEv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrFecEv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrFecEv_Enabled), 5, 0), true);
      edtMRPrUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrUsu_Enabled), 5, 0), true);
      edtMRPrIp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrIp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrIp_Enabled), 5, 0), true);
      edtMRPrReg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrReg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrReg_Enabled), 5, 0), true);
      edtMRPrTkn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPrTkn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrTkn_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1WD1925( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1WD0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mrpr", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14681MRPrId", GXutil.ltrim( localUtil.ntoc( Z14681MRPrId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14761MRPrOrd", GXutil.ltrim( localUtil.ntoc( Z14761MRPrOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14762MRPrLin", GXutil.ltrim( localUtil.ntoc( Z14762MRPrLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14719MRPrFasCod", GXutil.rtrim( Z14719MRPrFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14759MRPrFasDsc", Z14759MRPrFasDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14720MRPrMaqCod", GXutil.rtrim( Z14720MRPrMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14760MRPrMaqDsc", Z14760MRPrMaqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14755MRPrHdr", GXutil.rtrim( Z14755MRPrHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14754MRPrHdr2", Z14754MRPrHdr2);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "Z14722MRPrEr", Z14722MRPrEr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14682MRPrFec", localUtil.ttoc( Z14682MRPrFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14721MRPrVal", GXutil.rtrim( Z14721MRPrVal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14764MRPrValMin", GXutil.rtrim( Z14764MRPrValMin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14765MRPrValMax", GXutil.rtrim( Z14765MRPrValMax));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14757MRPrPLC", Z14757MRPrPLC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14750MRPrParCod", GXutil.ltrim( localUtil.ntoc( Z14750MRPrParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14758MRPrParDsc", Z14758MRPrParDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14723MRPrParId", GXutil.ltrim( localUtil.ntoc( Z14723MRPrParId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14763MRPrFecEv", localUtil.ttoc( Z14763MRPrFecEv, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14751MRPrUsu", GXutil.rtrim( Z14751MRPrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14752MRPrIp", Z14752MRPrIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14753MRPrReg", localUtil.ttoc( Z14753MRPrReg, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14756MRPrTkn", Z14756MRPrTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
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
      return formatLink("app.ingenieria.mrpr", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.MRPr" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "M Recibido Produccion", "") ;
   }

   public void initializeNonKey1WD1925( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A14761MRPrOrd = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14761MRPrOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14761MRPrOrd), 4, 0));
      A14762MRPrLin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14762MRPrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14762MRPrLin), 12, 0));
      A14719MRPrFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14719MRPrFasCod", A14719MRPrFasCod);
      A14759MRPrFasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14759MRPrFasDsc", A14759MRPrFasDsc);
      A14720MRPrMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14720MRPrMaqCod", A14720MRPrMaqCod);
      A14760MRPrMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14760MRPrMaqDsc", A14760MRPrMaqDsc);
      A14755MRPrHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14755MRPrHdr", A14755MRPrHdr);
      A14754MRPrHdr2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14754MRPrHdr2", A14754MRPrHdr2);
      A14722MRPrEr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14722MRPrEr", A14722MRPrEr);
      A14682MRPrFec = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14682MRPrFec", localUtil.ttoc( A14682MRPrFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14721MRPrVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14721MRPrVal", A14721MRPrVal);
      A14764MRPrValMin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14764MRPrValMin", A14764MRPrValMin);
      A14765MRPrValMax = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14765MRPrValMax", A14765MRPrValMax);
      A14757MRPrPLC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14757MRPrPLC", A14757MRPrPLC);
      A14750MRPrParCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14750MRPrParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14750MRPrParCod), 4, 0));
      A14758MRPrParDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14758MRPrParDsc", A14758MRPrParDsc);
      A14723MRPrParId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14723MRPrParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14723MRPrParId), 10, 0));
      A14763MRPrFecEv = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14763MRPrFecEv", localUtil.ttoc( A14763MRPrFecEv, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14751MRPrUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14751MRPrUsu", A14751MRPrUsu);
      A14752MRPrIp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14752MRPrIp", A14752MRPrIp);
      A14753MRPrReg = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14753MRPrReg", localUtil.ttoc( A14753MRPrReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14756MRPrTkn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14756MRPrTkn", A14756MRPrTkn);
      Z14761MRPrOrd = (short)(0) ;
      Z14762MRPrLin = 0 ;
      Z14719MRPrFasCod = "" ;
      Z14759MRPrFasDsc = "" ;
      Z14720MRPrMaqCod = "" ;
      Z14760MRPrMaqDsc = "" ;
      Z14755MRPrHdr = "" ;
      Z14754MRPrHdr2 = "" ;
      Z14722MRPrEr = false ;
      Z14682MRPrFec = GXutil.resetTime( GXutil.nullDate() );
      Z14721MRPrVal = "" ;
      Z14764MRPrValMin = "" ;
      Z14765MRPrValMax = "" ;
      Z14757MRPrPLC = "" ;
      Z14750MRPrParCod = (short)(0) ;
      Z14758MRPrParDsc = "" ;
      Z14723MRPrParId = 0 ;
      Z14763MRPrFecEv = GXutil.resetTime( GXutil.nullDate() );
      Z14751MRPrUsu = "" ;
      Z14752MRPrIp = "" ;
      Z14753MRPrReg = GXutil.resetTime( GXutil.nullDate() );
      Z14756MRPrTkn = "" ;
      Z396EmprCod = "" ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
   }

   public void initAll1WD1925( )
   {
      A14681MRPrId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14681MRPrId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14681MRPrId), 10, 0));
      initializeNonKey1WD1925( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671011105655", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/mrpr.js", "?202671011105656", false, true);
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
      edtMRPrId_Internalname = "MRPRID" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtMRPrOrd_Internalname = "MRPRORD" ;
      edtMRPrLin_Internalname = "MRPRLIN" ;
      edtMRPrFasCod_Internalname = "MRPRFASCOD" ;
      edtMRPrFasDsc_Internalname = "MRPRFASDSC" ;
      edtMRPrMaqCod_Internalname = "MRPRMAQCOD" ;
      edtMRPrMaqDsc_Internalname = "MRPRMAQDSC" ;
      edtMRPrHdr_Internalname = "MRPRHDR" ;
      edtMRPrHdr2_Internalname = "MRPRHDR2" ;
      chkMRPrEr.setInternalname( "MRPRER" );
      edtMRPrFec_Internalname = "MRPRFEC" ;
      edtMRPrVal_Internalname = "MRPRVAL" ;
      edtMRPrValMin_Internalname = "MRPRVALMIN" ;
      edtMRPrValMax_Internalname = "MRPRVALMAX" ;
      edtMRPrPLC_Internalname = "MRPRPLC" ;
      edtMRPrParCod_Internalname = "MRPRPARCOD" ;
      edtMRPrParDsc_Internalname = "MRPRPARDSC" ;
      edtMRPrParId_Internalname = "MRPRPARID" ;
      edtMRPrFecEv_Internalname = "MRPRFECEV" ;
      edtMRPrUsu_Internalname = "MRPRUSU" ;
      edtMRPrIp_Internalname = "MRPRIP" ;
      edtMRPrReg_Internalname = "MRPRREG" ;
      edtMRPrTkn_Internalname = "MRPRTKN" ;
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
      Form.setCaption( httpContext.getMessage( "M Recibido Produccion", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMRPrTkn_Enabled = 1 ;
      edtMRPrReg_Jsonclick = "" ;
      edtMRPrReg_Enabled = 1 ;
      edtMRPrIp_Jsonclick = "" ;
      edtMRPrIp_Enabled = 1 ;
      edtMRPrUsu_Jsonclick = "" ;
      edtMRPrUsu_Enabled = 1 ;
      edtMRPrFecEv_Jsonclick = "" ;
      edtMRPrFecEv_Enabled = 1 ;
      edtMRPrParId_Jsonclick = "" ;
      edtMRPrParId_Enabled = 1 ;
      edtMRPrParDsc_Jsonclick = "" ;
      edtMRPrParDsc_Enabled = 1 ;
      edtMRPrParCod_Jsonclick = "" ;
      edtMRPrParCod_Enabled = 1 ;
      edtMRPrPLC_Jsonclick = "" ;
      edtMRPrPLC_Enabled = 1 ;
      edtMRPrValMax_Jsonclick = "" ;
      edtMRPrValMax_Enabled = 1 ;
      edtMRPrValMin_Jsonclick = "" ;
      edtMRPrValMin_Enabled = 1 ;
      edtMRPrVal_Jsonclick = "" ;
      edtMRPrVal_Enabled = 1 ;
      edtMRPrFec_Jsonclick = "" ;
      edtMRPrFec_Enabled = 1 ;
      chkMRPrEr.setEnabled( 1 );
      edtMRPrHdr2_Jsonclick = "" ;
      edtMRPrHdr2_Enabled = 1 ;
      edtMRPrHdr_Jsonclick = "" ;
      edtMRPrHdr_Enabled = 1 ;
      edtMRPrMaqDsc_Jsonclick = "" ;
      edtMRPrMaqDsc_Enabled = 1 ;
      edtMRPrMaqCod_Jsonclick = "" ;
      edtMRPrMaqCod_Enabled = 1 ;
      edtMRPrFasDsc_Jsonclick = "" ;
      edtMRPrFasDsc_Enabled = 1 ;
      edtMRPrFasCod_Jsonclick = "" ;
      edtMRPrFasCod_Enabled = 1 ;
      edtMRPrLin_Jsonclick = "" ;
      edtMRPrLin_Enabled = 1 ;
      edtMRPrOrd_Jsonclick = "" ;
      edtMRPrOrd_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtMRPrId_Jsonclick = "" ;
      edtMRPrId_Enabled = 1 ;
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
      chkMRPrEr.setName( "MRPRER" );
      chkMRPrEr.setWebtags( "" );
      chkMRPrEr.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkMRPrEr.getInternalname(), "TitleCaption", chkMRPrEr.getCaption(), true);
      chkMRPrEr.setCheckedValue( "false" );
      A14722MRPrEr = GXutil.strtobool( GXutil.booltostr( A14722MRPrEr)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14722MRPrEr", A14722MRPrEr);
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

   public void valid_Mrprid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A14722MRPrEr = GXutil.strtobool( GXutil.booltostr( A14722MRPrEr)) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A14761MRPrOrd", GXutil.ltrim( localUtil.ntoc( A14761MRPrOrd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14762MRPrLin", GXutil.ltrim( localUtil.ntoc( A14762MRPrLin, (byte)(12), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14719MRPrFasCod", GXutil.rtrim( A14719MRPrFasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14759MRPrFasDsc", A14759MRPrFasDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14720MRPrMaqCod", GXutil.rtrim( A14720MRPrMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14760MRPrMaqDsc", A14760MRPrMaqDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14755MRPrHdr", GXutil.rtrim( A14755MRPrHdr));
      httpContext.ajax_rsp_assign_attri("", false, "A14754MRPrHdr2", A14754MRPrHdr2);
      httpContext.ajax_rsp_assign_attri("", false, "A14722MRPrEr", A14722MRPrEr);
      httpContext.ajax_rsp_assign_attri("", false, "A14682MRPrFec", localUtil.ttoc( A14682MRPrFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14721MRPrVal", GXutil.rtrim( A14721MRPrVal));
      httpContext.ajax_rsp_assign_attri("", false, "A14764MRPrValMin", GXutil.rtrim( A14764MRPrValMin));
      httpContext.ajax_rsp_assign_attri("", false, "A14765MRPrValMax", GXutil.rtrim( A14765MRPrValMax));
      httpContext.ajax_rsp_assign_attri("", false, "A14757MRPrPLC", A14757MRPrPLC);
      httpContext.ajax_rsp_assign_attri("", false, "A14750MRPrParCod", GXutil.ltrim( localUtil.ntoc( A14750MRPrParCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14758MRPrParDsc", A14758MRPrParDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14723MRPrParId", GXutil.ltrim( localUtil.ntoc( A14723MRPrParId, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14763MRPrFecEv", localUtil.ttoc( A14763MRPrFecEv, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14751MRPrUsu", GXutil.rtrim( A14751MRPrUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A14752MRPrIp", A14752MRPrIp);
      httpContext.ajax_rsp_assign_attri("", false, "A14753MRPrReg", localUtil.ttoc( A14753MRPrReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14756MRPrTkn", A14756MRPrTkn);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14681MRPrId", GXutil.ltrim( localUtil.ntoc( Z14681MRPrId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14761MRPrOrd", GXutil.ltrim( localUtil.ntoc( Z14761MRPrOrd, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14762MRPrLin", GXutil.ltrim( localUtil.ntoc( Z14762MRPrLin, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14719MRPrFasCod", GXutil.rtrim( Z14719MRPrFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14759MRPrFasDsc", Z14759MRPrFasDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14720MRPrMaqCod", GXutil.rtrim( Z14720MRPrMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14760MRPrMaqDsc", Z14760MRPrMaqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14755MRPrHdr", GXutil.rtrim( Z14755MRPrHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14754MRPrHdr2", Z14754MRPrHdr2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14722MRPrEr", GXutil.booltostr( Z14722MRPrEr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14682MRPrFec", localUtil.ttoc( Z14682MRPrFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14721MRPrVal", GXutil.rtrim( Z14721MRPrVal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14764MRPrValMin", GXutil.rtrim( Z14764MRPrValMin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14765MRPrValMax", GXutil.rtrim( Z14765MRPrValMax));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14757MRPrPLC", Z14757MRPrPLC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14750MRPrParCod", GXutil.ltrim( localUtil.ntoc( Z14750MRPrParCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14758MRPrParDsc", Z14758MRPrParDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14723MRPrParId", GXutil.ltrim( localUtil.ntoc( Z14723MRPrParId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14763MRPrFecEv", localUtil.ttoc( Z14763MRPrFecEv, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14751MRPrUsu", GXutil.rtrim( Z14751MRPrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14752MRPrIp", Z14752MRPrIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14753MRPrReg", localUtil.ttoc( Z14753MRPrReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14756MRPrTkn", Z14756MRPrTkn);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      /* Using cursor T01WD15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A14722MRPrEr',fld:'MRPRER',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A14722MRPrEr',fld:'MRPRER',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A14722MRPrEr',fld:'MRPRER',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A14722MRPrEr',fld:'MRPRER',pic:''}]}");
      setEventMetadata("VALID_MRPRID","{handler:'valid_Mrprid',iparms:[{av:'A14681MRPrId',fld:'MRPRID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A14722MRPrEr',fld:'MRPRER',pic:''}]");
      setEventMetadata("VALID_MRPRID",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A14761MRPrOrd',fld:'MRPRORD',pic:'ZZZ9'},{av:'A14762MRPrLin',fld:'MRPRLIN',pic:'ZZZZZZZZZZZ9'},{av:'A14719MRPrFasCod',fld:'MRPRFASCOD',pic:''},{av:'A14759MRPrFasDsc',fld:'MRPRFASDSC',pic:''},{av:'A14720MRPrMaqCod',fld:'MRPRMAQCOD',pic:''},{av:'A14760MRPrMaqDsc',fld:'MRPRMAQDSC',pic:''},{av:'A14755MRPrHdr',fld:'MRPRHDR',pic:''},{av:'A14754MRPrHdr2',fld:'MRPRHDR2',pic:''},{av:'A14682MRPrFec',fld:'MRPRFEC',pic:'99/99/99 99:99'},{av:'A14721MRPrVal',fld:'MRPRVAL',pic:''},{av:'A14764MRPrValMin',fld:'MRPRVALMIN',pic:''},{av:'A14765MRPrValMax',fld:'MRPRVALMAX',pic:''},{av:'A14757MRPrPLC',fld:'MRPRPLC',pic:''},{av:'A14750MRPrParCod',fld:'MRPRPARCOD',pic:'ZZZ9'},{av:'A14758MRPrParDsc',fld:'MRPRPARDSC',pic:''},{av:'A14723MRPrParId',fld:'MRPRPARID',pic:'ZZZZZZZZZ9'},{av:'A14763MRPrFecEv',fld:'MRPRFECEV',pic:'99/99/99 99:99'},{av:'A14751MRPrUsu',fld:'MRPRUSU',pic:''},{av:'A14752MRPrIp',fld:'MRPRIP',pic:''},{av:'A14753MRPrReg',fld:'MRPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14756MRPrTkn',fld:'MRPRTKN',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14681MRPrId'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z14761MRPrOrd'},{av:'Z14762MRPrLin'},{av:'Z14719MRPrFasCod'},{av:'Z14759MRPrFasDsc'},{av:'Z14720MRPrMaqCod'},{av:'Z14760MRPrMaqDsc'},{av:'Z14755MRPrHdr'},{av:'Z14754MRPrHdr2'},{av:'Z14722MRPrEr'},{av:'Z14682MRPrFec'},{av:'Z14721MRPrVal'},{av:'Z14764MRPrValMin'},{av:'Z14765MRPrValMax'},{av:'Z14757MRPrPLC'},{av:'Z14750MRPrParCod'},{av:'Z14758MRPrParDsc'},{av:'Z14723MRPrParId'},{av:'Z14763MRPrFecEv'},{av:'Z14751MRPrUsu'},{av:'Z14752MRPrIp'},{av:'Z14753MRPrReg'},{av:'Z14756MRPrTkn'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{av:'A14722MRPrEr',fld:'MRPRER',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A14722MRPrEr',fld:'MRPRER',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A14722MRPrEr',fld:'MRPRER',pic:''}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[{av:'A14722MRPrEr',fld:'MRPRER',pic:''}]");
      setEventMetadata("VALID_BARCOD",",oparms:[{av:'A14722MRPrEr',fld:'MRPRER',pic:''}]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[{av:'A14722MRPrEr',fld:'MRPRER',pic:''}]");
      setEventMetadata("VALID_BARCODREO",",oparms:[{av:'A14722MRPrEr',fld:'MRPRER',pic:''}]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A14722MRPrEr',fld:'MRPRER',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A14722MRPrEr',fld:'MRPRER',pic:''}]}");
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
      Z14719MRPrFasCod = "" ;
      Z14759MRPrFasDsc = "" ;
      Z14720MRPrMaqCod = "" ;
      Z14760MRPrMaqDsc = "" ;
      Z14755MRPrHdr = "" ;
      Z14754MRPrHdr2 = "" ;
      Z14682MRPrFec = GXutil.resetTime( GXutil.nullDate() );
      Z14721MRPrVal = "" ;
      Z14764MRPrValMin = "" ;
      Z14765MRPrValMax = "" ;
      Z14757MRPrPLC = "" ;
      Z14758MRPrParDsc = "" ;
      Z14763MRPrFecEv = GXutil.resetTime( GXutil.nullDate() );
      Z14751MRPrUsu = "" ;
      Z14752MRPrIp = "" ;
      Z14753MRPrReg = GXutil.resetTime( GXutil.nullDate() );
      Z14756MRPrTkn = "" ;
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
      A14719MRPrFasCod = "" ;
      A14759MRPrFasDsc = "" ;
      A14720MRPrMaqCod = "" ;
      A14760MRPrMaqDsc = "" ;
      A14755MRPrHdr = "" ;
      A14754MRPrHdr2 = "" ;
      A14682MRPrFec = GXutil.resetTime( GXutil.nullDate() );
      A14721MRPrVal = "" ;
      A14764MRPrValMin = "" ;
      A14765MRPrValMax = "" ;
      A14757MRPrPLC = "" ;
      A14758MRPrParDsc = "" ;
      A14763MRPrFecEv = GXutil.resetTime( GXutil.nullDate() );
      A14751MRPrUsu = "" ;
      A14752MRPrIp = "" ;
      A14753MRPrReg = GXutil.resetTime( GXutil.nullDate() );
      A14756MRPrTkn = "" ;
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
      T01WD5_A14681MRPrId = new long[1] ;
      T01WD5_A14761MRPrOrd = new short[1] ;
      T01WD5_A14762MRPrLin = new long[1] ;
      T01WD5_A14719MRPrFasCod = new String[] {""} ;
      T01WD5_A14759MRPrFasDsc = new String[] {""} ;
      T01WD5_A14720MRPrMaqCod = new String[] {""} ;
      T01WD5_A14760MRPrMaqDsc = new String[] {""} ;
      T01WD5_A14755MRPrHdr = new String[] {""} ;
      T01WD5_A14754MRPrHdr2 = new String[] {""} ;
      T01WD5_A14722MRPrEr = new boolean[] {false} ;
      T01WD5_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01WD5_A14721MRPrVal = new String[] {""} ;
      T01WD5_A14764MRPrValMin = new String[] {""} ;
      T01WD5_A14765MRPrValMax = new String[] {""} ;
      T01WD5_A14757MRPrPLC = new String[] {""} ;
      T01WD5_A14750MRPrParCod = new short[1] ;
      T01WD5_A14758MRPrParDsc = new String[] {""} ;
      T01WD5_A14723MRPrParId = new long[1] ;
      T01WD5_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01WD5_A14751MRPrUsu = new String[] {""} ;
      T01WD5_A14752MRPrIp = new String[] {""} ;
      T01WD5_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WD5_A14756MRPrTkn = new String[] {""} ;
      T01WD5_A396EmprCod = new String[] {""} ;
      T01WD5_A129BarCod = new int[1] ;
      T01WD5_A132BarCodReo = new byte[1] ;
      T01WD5_A130BarCodPar = new String[] {""} ;
      T01WD4_A396EmprCod = new String[] {""} ;
      T01WD6_A396EmprCod = new String[] {""} ;
      T01WD7_A14681MRPrId = new long[1] ;
      T01WD3_A14681MRPrId = new long[1] ;
      T01WD3_A14761MRPrOrd = new short[1] ;
      T01WD3_A14762MRPrLin = new long[1] ;
      T01WD3_A14719MRPrFasCod = new String[] {""} ;
      T01WD3_A14759MRPrFasDsc = new String[] {""} ;
      T01WD3_A14720MRPrMaqCod = new String[] {""} ;
      T01WD3_A14760MRPrMaqDsc = new String[] {""} ;
      T01WD3_A14755MRPrHdr = new String[] {""} ;
      T01WD3_A14754MRPrHdr2 = new String[] {""} ;
      T01WD3_A14722MRPrEr = new boolean[] {false} ;
      T01WD3_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01WD3_A14721MRPrVal = new String[] {""} ;
      T01WD3_A14764MRPrValMin = new String[] {""} ;
      T01WD3_A14765MRPrValMax = new String[] {""} ;
      T01WD3_A14757MRPrPLC = new String[] {""} ;
      T01WD3_A14750MRPrParCod = new short[1] ;
      T01WD3_A14758MRPrParDsc = new String[] {""} ;
      T01WD3_A14723MRPrParId = new long[1] ;
      T01WD3_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01WD3_A14751MRPrUsu = new String[] {""} ;
      T01WD3_A14752MRPrIp = new String[] {""} ;
      T01WD3_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WD3_A14756MRPrTkn = new String[] {""} ;
      T01WD3_A396EmprCod = new String[] {""} ;
      T01WD3_A129BarCod = new int[1] ;
      T01WD3_A132BarCodReo = new byte[1] ;
      T01WD3_A130BarCodPar = new String[] {""} ;
      sMode1925 = "" ;
      T01WD8_A14681MRPrId = new long[1] ;
      T01WD9_A14681MRPrId = new long[1] ;
      T01WD2_A14681MRPrId = new long[1] ;
      T01WD2_A14761MRPrOrd = new short[1] ;
      T01WD2_A14762MRPrLin = new long[1] ;
      T01WD2_A14719MRPrFasCod = new String[] {""} ;
      T01WD2_A14759MRPrFasDsc = new String[] {""} ;
      T01WD2_A14720MRPrMaqCod = new String[] {""} ;
      T01WD2_A14760MRPrMaqDsc = new String[] {""} ;
      T01WD2_A14755MRPrHdr = new String[] {""} ;
      T01WD2_A14754MRPrHdr2 = new String[] {""} ;
      T01WD2_A14722MRPrEr = new boolean[] {false} ;
      T01WD2_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01WD2_A14721MRPrVal = new String[] {""} ;
      T01WD2_A14764MRPrValMin = new String[] {""} ;
      T01WD2_A14765MRPrValMax = new String[] {""} ;
      T01WD2_A14757MRPrPLC = new String[] {""} ;
      T01WD2_A14750MRPrParCod = new short[1] ;
      T01WD2_A14758MRPrParDsc = new String[] {""} ;
      T01WD2_A14723MRPrParId = new long[1] ;
      T01WD2_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01WD2_A14751MRPrUsu = new String[] {""} ;
      T01WD2_A14752MRPrIp = new String[] {""} ;
      T01WD2_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WD2_A14756MRPrTkn = new String[] {""} ;
      T01WD2_A396EmprCod = new String[] {""} ;
      T01WD2_A129BarCod = new int[1] ;
      T01WD2_A132BarCodReo = new byte[1] ;
      T01WD2_A130BarCodPar = new String[] {""} ;
      T01WD11_A14681MRPrId = new long[1] ;
      T01WD14_A14681MRPrId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ14719MRPrFasCod = "" ;
      ZZ14759MRPrFasDsc = "" ;
      ZZ14720MRPrMaqCod = "" ;
      ZZ14760MRPrMaqDsc = "" ;
      ZZ14755MRPrHdr = "" ;
      ZZ14754MRPrHdr2 = "" ;
      ZZ14682MRPrFec = GXutil.resetTime( GXutil.nullDate() );
      ZZ14721MRPrVal = "" ;
      ZZ14764MRPrValMin = "" ;
      ZZ14765MRPrValMax = "" ;
      ZZ14757MRPrPLC = "" ;
      ZZ14758MRPrParDsc = "" ;
      ZZ14763MRPrFecEv = GXutil.resetTime( GXutil.nullDate() );
      ZZ14751MRPrUsu = "" ;
      ZZ14752MRPrIp = "" ;
      ZZ14753MRPrReg = GXutil.resetTime( GXutil.nullDate() );
      ZZ14756MRPrTkn = "" ;
      T01WD15_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrpr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrpr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrpr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrpr__default(),
         new Object[] {
             new Object[] {
            T01WD2_A14681MRPrId, T01WD2_A14761MRPrOrd, T01WD2_A14762MRPrLin, T01WD2_A14719MRPrFasCod, T01WD2_A14759MRPrFasDsc, T01WD2_A14720MRPrMaqCod, T01WD2_A14760MRPrMaqDsc, T01WD2_A14755MRPrHdr, T01WD2_A14754MRPrHdr2, T01WD2_A14722MRPrEr,
            T01WD2_A14682MRPrFec, T01WD2_A14721MRPrVal, T01WD2_A14764MRPrValMin, T01WD2_A14765MRPrValMax, T01WD2_A14757MRPrPLC, T01WD2_A14750MRPrParCod, T01WD2_A14758MRPrParDsc, T01WD2_A14723MRPrParId, T01WD2_A14763MRPrFecEv, T01WD2_A14751MRPrUsu,
            T01WD2_A14752MRPrIp, T01WD2_A14753MRPrReg, T01WD2_A14756MRPrTkn, T01WD2_A396EmprCod, T01WD2_A129BarCod, T01WD2_A132BarCodReo, T01WD2_A130BarCodPar
            }
            , new Object[] {
            T01WD3_A14681MRPrId, T01WD3_A14761MRPrOrd, T01WD3_A14762MRPrLin, T01WD3_A14719MRPrFasCod, T01WD3_A14759MRPrFasDsc, T01WD3_A14720MRPrMaqCod, T01WD3_A14760MRPrMaqDsc, T01WD3_A14755MRPrHdr, T01WD3_A14754MRPrHdr2, T01WD3_A14722MRPrEr,
            T01WD3_A14682MRPrFec, T01WD3_A14721MRPrVal, T01WD3_A14764MRPrValMin, T01WD3_A14765MRPrValMax, T01WD3_A14757MRPrPLC, T01WD3_A14750MRPrParCod, T01WD3_A14758MRPrParDsc, T01WD3_A14723MRPrParId, T01WD3_A14763MRPrFecEv, T01WD3_A14751MRPrUsu,
            T01WD3_A14752MRPrIp, T01WD3_A14753MRPrReg, T01WD3_A14756MRPrTkn, T01WD3_A396EmprCod, T01WD3_A129BarCod, T01WD3_A132BarCodReo, T01WD3_A130BarCodPar
            }
            , new Object[] {
            T01WD4_A396EmprCod
            }
            , new Object[] {
            T01WD5_A14681MRPrId, T01WD5_A14761MRPrOrd, T01WD5_A14762MRPrLin, T01WD5_A14719MRPrFasCod, T01WD5_A14759MRPrFasDsc, T01WD5_A14720MRPrMaqCod, T01WD5_A14760MRPrMaqDsc, T01WD5_A14755MRPrHdr, T01WD5_A14754MRPrHdr2, T01WD5_A14722MRPrEr,
            T01WD5_A14682MRPrFec, T01WD5_A14721MRPrVal, T01WD5_A14764MRPrValMin, T01WD5_A14765MRPrValMax, T01WD5_A14757MRPrPLC, T01WD5_A14750MRPrParCod, T01WD5_A14758MRPrParDsc, T01WD5_A14723MRPrParId, T01WD5_A14763MRPrFecEv, T01WD5_A14751MRPrUsu,
            T01WD5_A14752MRPrIp, T01WD5_A14753MRPrReg, T01WD5_A14756MRPrTkn, T01WD5_A396EmprCod, T01WD5_A129BarCod, T01WD5_A132BarCodReo, T01WD5_A130BarCodPar
            }
            , new Object[] {
            T01WD6_A396EmprCod
            }
            , new Object[] {
            T01WD7_A14681MRPrId
            }
            , new Object[] {
            T01WD8_A14681MRPrId
            }
            , new Object[] {
            T01WD9_A14681MRPrId
            }
            , new Object[] {
            }
            , new Object[] {
            T01WD11_A14681MRPrId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01WD14_A14681MRPrId
            }
            , new Object[] {
            T01WD15_A396EmprCod
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
   private short Z14761MRPrOrd ;
   private short Z14750MRPrParCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14761MRPrOrd ;
   private short A14750MRPrParCod ;
   private short RcdFound1925 ;
   private short nIsDirty_1925 ;
   private short ZZ14761MRPrOrd ;
   private short ZZ14750MRPrParCod ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtMRPrId_Enabled ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtMRPrOrd_Enabled ;
   private int edtMRPrLin_Enabled ;
   private int edtMRPrFasCod_Enabled ;
   private int edtMRPrFasDsc_Enabled ;
   private int edtMRPrMaqCod_Enabled ;
   private int edtMRPrMaqDsc_Enabled ;
   private int edtMRPrHdr_Enabled ;
   private int edtMRPrHdr2_Enabled ;
   private int edtMRPrFec_Enabled ;
   private int edtMRPrVal_Enabled ;
   private int edtMRPrValMin_Enabled ;
   private int edtMRPrValMax_Enabled ;
   private int edtMRPrPLC_Enabled ;
   private int edtMRPrParCod_Enabled ;
   private int edtMRPrParDsc_Enabled ;
   private int edtMRPrParId_Enabled ;
   private int edtMRPrFecEv_Enabled ;
   private int edtMRPrUsu_Enabled ;
   private int edtMRPrIp_Enabled ;
   private int edtMRPrReg_Enabled ;
   private int edtMRPrTkn_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ129BarCod ;
   private long Z14681MRPrId ;
   private long Z14762MRPrLin ;
   private long Z14723MRPrParId ;
   private long A14681MRPrId ;
   private long A14762MRPrLin ;
   private long A14723MRPrParId ;
   private long ZZ14681MRPrId ;
   private long ZZ14762MRPrLin ;
   private long ZZ14723MRPrParId ;
   private String sPrefix ;
   private String Z14719MRPrFasCod ;
   private String Z14720MRPrMaqCod ;
   private String Z14755MRPrHdr ;
   private String Z14721MRPrVal ;
   private String Z14764MRPrValMin ;
   private String Z14765MRPrValMax ;
   private String Z14751MRPrUsu ;
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
   private String edtMRPrId_Internalname ;
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
   private String edtMRPrId_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtMRPrOrd_Internalname ;
   private String edtMRPrOrd_Jsonclick ;
   private String edtMRPrLin_Internalname ;
   private String edtMRPrLin_Jsonclick ;
   private String edtMRPrFasCod_Internalname ;
   private String A14719MRPrFasCod ;
   private String edtMRPrFasCod_Jsonclick ;
   private String edtMRPrFasDsc_Internalname ;
   private String edtMRPrFasDsc_Jsonclick ;
   private String edtMRPrMaqCod_Internalname ;
   private String A14720MRPrMaqCod ;
   private String edtMRPrMaqCod_Jsonclick ;
   private String edtMRPrMaqDsc_Internalname ;
   private String edtMRPrMaqDsc_Jsonclick ;
   private String edtMRPrHdr_Internalname ;
   private String A14755MRPrHdr ;
   private String edtMRPrHdr_Jsonclick ;
   private String edtMRPrHdr2_Internalname ;
   private String edtMRPrHdr2_Jsonclick ;
   private String edtMRPrFec_Internalname ;
   private String edtMRPrFec_Jsonclick ;
   private String edtMRPrVal_Internalname ;
   private String A14721MRPrVal ;
   private String edtMRPrVal_Jsonclick ;
   private String edtMRPrValMin_Internalname ;
   private String A14764MRPrValMin ;
   private String edtMRPrValMin_Jsonclick ;
   private String edtMRPrValMax_Internalname ;
   private String A14765MRPrValMax ;
   private String edtMRPrValMax_Jsonclick ;
   private String edtMRPrPLC_Internalname ;
   private String edtMRPrPLC_Jsonclick ;
   private String edtMRPrParCod_Internalname ;
   private String edtMRPrParCod_Jsonclick ;
   private String edtMRPrParDsc_Internalname ;
   private String edtMRPrParDsc_Jsonclick ;
   private String edtMRPrParId_Internalname ;
   private String edtMRPrParId_Jsonclick ;
   private String edtMRPrFecEv_Internalname ;
   private String edtMRPrFecEv_Jsonclick ;
   private String edtMRPrUsu_Internalname ;
   private String A14751MRPrUsu ;
   private String edtMRPrUsu_Jsonclick ;
   private String edtMRPrIp_Internalname ;
   private String edtMRPrIp_Jsonclick ;
   private String edtMRPrReg_Internalname ;
   private String edtMRPrReg_Jsonclick ;
   private String edtMRPrTkn_Internalname ;
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
   private String sMode1925 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ14719MRPrFasCod ;
   private String ZZ14720MRPrMaqCod ;
   private String ZZ14755MRPrHdr ;
   private String ZZ14721MRPrVal ;
   private String ZZ14764MRPrValMin ;
   private String ZZ14765MRPrValMax ;
   private String ZZ14751MRPrUsu ;
   private java.util.Date Z14682MRPrFec ;
   private java.util.Date Z14763MRPrFecEv ;
   private java.util.Date Z14753MRPrReg ;
   private java.util.Date A14682MRPrFec ;
   private java.util.Date A14763MRPrFecEv ;
   private java.util.Date A14753MRPrReg ;
   private java.util.Date ZZ14682MRPrFec ;
   private java.util.Date ZZ14763MRPrFecEv ;
   private java.util.Date ZZ14753MRPrReg ;
   private boolean Z14722MRPrEr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean A14722MRPrEr ;
   private boolean Gx_longc ;
   private boolean ZZ14722MRPrEr ;
   private String Z14759MRPrFasDsc ;
   private String Z14760MRPrMaqDsc ;
   private String Z14754MRPrHdr2 ;
   private String Z14757MRPrPLC ;
   private String Z14758MRPrParDsc ;
   private String Z14752MRPrIp ;
   private String Z14756MRPrTkn ;
   private String A14759MRPrFasDsc ;
   private String A14760MRPrMaqDsc ;
   private String A14754MRPrHdr2 ;
   private String A14757MRPrPLC ;
   private String A14758MRPrParDsc ;
   private String A14752MRPrIp ;
   private String A14756MRPrTkn ;
   private String ZZ14759MRPrFasDsc ;
   private String ZZ14760MRPrMaqDsc ;
   private String ZZ14754MRPrHdr2 ;
   private String ZZ14757MRPrPLC ;
   private String ZZ14758MRPrParDsc ;
   private String ZZ14752MRPrIp ;
   private String ZZ14756MRPrTkn ;
   private ICheckbox chkMRPrEr ;
   private IDataStoreProvider pr_default ;
   private long[] T01WD5_A14681MRPrId ;
   private short[] T01WD5_A14761MRPrOrd ;
   private long[] T01WD5_A14762MRPrLin ;
   private String[] T01WD5_A14719MRPrFasCod ;
   private String[] T01WD5_A14759MRPrFasDsc ;
   private String[] T01WD5_A14720MRPrMaqCod ;
   private String[] T01WD5_A14760MRPrMaqDsc ;
   private String[] T01WD5_A14755MRPrHdr ;
   private String[] T01WD5_A14754MRPrHdr2 ;
   private boolean[] T01WD5_A14722MRPrEr ;
   private java.util.Date[] T01WD5_A14682MRPrFec ;
   private String[] T01WD5_A14721MRPrVal ;
   private String[] T01WD5_A14764MRPrValMin ;
   private String[] T01WD5_A14765MRPrValMax ;
   private String[] T01WD5_A14757MRPrPLC ;
   private short[] T01WD5_A14750MRPrParCod ;
   private String[] T01WD5_A14758MRPrParDsc ;
   private long[] T01WD5_A14723MRPrParId ;
   private java.util.Date[] T01WD5_A14763MRPrFecEv ;
   private String[] T01WD5_A14751MRPrUsu ;
   private String[] T01WD5_A14752MRPrIp ;
   private java.util.Date[] T01WD5_A14753MRPrReg ;
   private String[] T01WD5_A14756MRPrTkn ;
   private String[] T01WD5_A396EmprCod ;
   private int[] T01WD5_A129BarCod ;
   private byte[] T01WD5_A132BarCodReo ;
   private String[] T01WD5_A130BarCodPar ;
   private String[] T01WD4_A396EmprCod ;
   private String[] T01WD6_A396EmprCod ;
   private long[] T01WD7_A14681MRPrId ;
   private long[] T01WD3_A14681MRPrId ;
   private short[] T01WD3_A14761MRPrOrd ;
   private long[] T01WD3_A14762MRPrLin ;
   private String[] T01WD3_A14719MRPrFasCod ;
   private String[] T01WD3_A14759MRPrFasDsc ;
   private String[] T01WD3_A14720MRPrMaqCod ;
   private String[] T01WD3_A14760MRPrMaqDsc ;
   private String[] T01WD3_A14755MRPrHdr ;
   private String[] T01WD3_A14754MRPrHdr2 ;
   private boolean[] T01WD3_A14722MRPrEr ;
   private java.util.Date[] T01WD3_A14682MRPrFec ;
   private String[] T01WD3_A14721MRPrVal ;
   private String[] T01WD3_A14764MRPrValMin ;
   private String[] T01WD3_A14765MRPrValMax ;
   private String[] T01WD3_A14757MRPrPLC ;
   private short[] T01WD3_A14750MRPrParCod ;
   private String[] T01WD3_A14758MRPrParDsc ;
   private long[] T01WD3_A14723MRPrParId ;
   private java.util.Date[] T01WD3_A14763MRPrFecEv ;
   private String[] T01WD3_A14751MRPrUsu ;
   private String[] T01WD3_A14752MRPrIp ;
   private java.util.Date[] T01WD3_A14753MRPrReg ;
   private String[] T01WD3_A14756MRPrTkn ;
   private String[] T01WD3_A396EmprCod ;
   private int[] T01WD3_A129BarCod ;
   private byte[] T01WD3_A132BarCodReo ;
   private String[] T01WD3_A130BarCodPar ;
   private long[] T01WD8_A14681MRPrId ;
   private long[] T01WD9_A14681MRPrId ;
   private long[] T01WD2_A14681MRPrId ;
   private short[] T01WD2_A14761MRPrOrd ;
   private long[] T01WD2_A14762MRPrLin ;
   private String[] T01WD2_A14719MRPrFasCod ;
   private String[] T01WD2_A14759MRPrFasDsc ;
   private String[] T01WD2_A14720MRPrMaqCod ;
   private String[] T01WD2_A14760MRPrMaqDsc ;
   private String[] T01WD2_A14755MRPrHdr ;
   private String[] T01WD2_A14754MRPrHdr2 ;
   private boolean[] T01WD2_A14722MRPrEr ;
   private java.util.Date[] T01WD2_A14682MRPrFec ;
   private String[] T01WD2_A14721MRPrVal ;
   private String[] T01WD2_A14764MRPrValMin ;
   private String[] T01WD2_A14765MRPrValMax ;
   private String[] T01WD2_A14757MRPrPLC ;
   private short[] T01WD2_A14750MRPrParCod ;
   private String[] T01WD2_A14758MRPrParDsc ;
   private long[] T01WD2_A14723MRPrParId ;
   private java.util.Date[] T01WD2_A14763MRPrFecEv ;
   private String[] T01WD2_A14751MRPrUsu ;
   private String[] T01WD2_A14752MRPrIp ;
   private java.util.Date[] T01WD2_A14753MRPrReg ;
   private String[] T01WD2_A14756MRPrTkn ;
   private String[] T01WD2_A396EmprCod ;
   private int[] T01WD2_A129BarCod ;
   private byte[] T01WD2_A132BarCodReo ;
   private String[] T01WD2_A130BarCodPar ;
   private long[] T01WD11_A14681MRPrId ;
   private long[] T01WD14_A14681MRPrId ;
   private String[] T01WD15_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mrpr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrpr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrpr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrpr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01WD2", "SELECT MRPrId, MRPrOrd, MRPrLin, MRPrFasCod, MRPrFasDsc, MRPrMaqCod, MRPrMaqDsc, MRPrHdr, MRPrHdr2, MRPrEr, MRPrFec, MRPrVal, MRPrValMin, MRPrValMax, MRPrPLC, MRPrParCod, MRPrParDsc, MRPrParId, MRPrFecEv, MRPrUsu, MRPrIp, MRPrReg, MRPrTkn, EmprCod, BarCod, BarCodReo, BarCodPar FROM MRPr WHERE MRPrId = ?  FOR UPDATE OF MRPrOrd, MRPrLin, MRPrFasCod, MRPrFasDsc, MRPrMaqCod, MRPrMaqDsc, MRPrHdr, MRPrHdr2, MRPrEr, MRPrFec, MRPrVal, MRPrValMin, MRPrValMax, MRPrPLC, MRPrParCod, MRPrParDsc, MRPrParId, MRPrFecEv, MRPrUsu, MRPrIp, MRPrReg, MRPrTkn, EmprCod, BarCod, BarCodReo, BarCodPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WD3", "SELECT MRPrId, MRPrOrd, MRPrLin, MRPrFasCod, MRPrFasDsc, MRPrMaqCod, MRPrMaqDsc, MRPrHdr, MRPrHdr2, MRPrEr, MRPrFec, MRPrVal, MRPrValMin, MRPrValMax, MRPrPLC, MRPrParCod, MRPrParDsc, MRPrParId, MRPrFecEv, MRPrUsu, MRPrIp, MRPrReg, MRPrTkn, EmprCod, BarCod, BarCodReo, BarCodPar FROM MRPr WHERE MRPrId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WD4", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WD5", "SELECT /*+ FIRST_ROWS(100) */ TM1.MRPrId, TM1.MRPrOrd, TM1.MRPrLin, TM1.MRPrFasCod, TM1.MRPrFasDsc, TM1.MRPrMaqCod, TM1.MRPrMaqDsc, TM1.MRPrHdr, TM1.MRPrHdr2, TM1.MRPrEr, TM1.MRPrFec, TM1.MRPrVal, TM1.MRPrValMin, TM1.MRPrValMax, TM1.MRPrPLC, TM1.MRPrParCod, TM1.MRPrParDsc, TM1.MRPrParId, TM1.MRPrFecEv, TM1.MRPrUsu, TM1.MRPrIp, TM1.MRPrReg, TM1.MRPrTkn, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM MRPr TM1 WHERE TM1.MRPrId = ? ORDER BY TM1.MRPrId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WD6", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WD7", "SELECT /*+ FIRST_ROWS(1) */ MRPrId FROM MRPr WHERE MRPrId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WD8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MRPrId FROM MRPr WHERE ( MRPrId > ?) ORDER BY MRPrId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01WD9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MRPrId FROM MRPr WHERE ( MRPrId < ?) ORDER BY MRPrId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01WD10", "INSERT INTO MRPr(MRPrOrd, MRPrLin, MRPrFasCod, MRPrFasDsc, MRPrMaqCod, MRPrMaqDsc, MRPrHdr, MRPrHdr2, MRPrEr, MRPrFec, MRPrVal, MRPrValMin, MRPrValMax, MRPrPLC, MRPrParCod, MRPrParDsc, MRPrParId, MRPrFecEv, MRPrUsu, MRPrIp, MRPrReg, MRPrTkn, EmprCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "MRPr")
         ,new ForEachCursor("T01WD11", "SELECT MRPrId.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01WD12", "UPDATE MRPr SET MRPrOrd=?, MRPrLin=?, MRPrFasCod=?, MRPrFasDsc=?, MRPrMaqCod=?, MRPrMaqDsc=?, MRPrHdr=?, MRPrHdr2=?, MRPrEr=?, MRPrFec=?, MRPrVal=?, MRPrValMin=?, MRPrValMax=?, MRPrPLC=?, MRPrParCod=?, MRPrParDsc=?, MRPrParId=?, MRPrFecEv=?, MRPrUsu=?, MRPrIp=?, MRPrReg=?, MRPrTkn=?, EmprCod=?, BarCod=?, BarCodReo=?, BarCodPar=?  WHERE MRPrId = ?", GX_NOMASK, "MRPr")
         ,new UpdateCursor("T01WD13", "DELETE FROM MRPr  WHERE MRPrId = ?", GX_NOMASK, "MRPr")
         ,new ForEachCursor("T01WD14", "SELECT /*+ FIRST_ROWS(100) */ MRPrId FROM MRPr ORDER BY MRPrId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WD15", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[9])[0] = rslt.getBoolean(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 12);
               ((String[]) buf[12])[0] = rslt.getString(13, 12);
               ((String[]) buf[13])[0] = rslt.getString(14, 12);
               ((String[]) buf[14])[0] = rslt.getVarchar(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((long[]) buf[17])[0] = rslt.getLong(18);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 8);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(22, true);
               ((String[]) buf[22])[0] = rslt.getVarchar(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 3);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((byte[]) buf[25])[0] = rslt.getByte(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 1);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[9])[0] = rslt.getBoolean(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 12);
               ((String[]) buf[12])[0] = rslt.getString(13, 12);
               ((String[]) buf[13])[0] = rslt.getString(14, 12);
               ((String[]) buf[14])[0] = rslt.getVarchar(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((long[]) buf[17])[0] = rslt.getLong(18);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 8);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(22, true);
               ((String[]) buf[22])[0] = rslt.getVarchar(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 3);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((byte[]) buf[25])[0] = rslt.getByte(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[9])[0] = rslt.getBoolean(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 12);
               ((String[]) buf[12])[0] = rslt.getString(13, 12);
               ((String[]) buf[13])[0] = rslt.getString(14, 12);
               ((String[]) buf[14])[0] = rslt.getVarchar(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((long[]) buf[17])[0] = rslt.getLong(18);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 8);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(22, true);
               ((String[]) buf[22])[0] = rslt.getVarchar(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 3);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((byte[]) buf[25])[0] = rslt.getByte(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 1);
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
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 100, false);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setVarchar(6, (String)parms[5], 100, false);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setVarchar(8, (String)parms[7], 10, false);
               stmt.setBoolean(9, ((Boolean) parms[8]).booleanValue());
               stmt.setDateTime(10, (java.util.Date)parms[9], false);
               stmt.setString(11, (String)parms[10], 12);
               stmt.setString(12, (String)parms[11], 12);
               stmt.setString(13, (String)parms[12], 12);
               stmt.setVarchar(14, (String)parms[13], 100, false);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setVarchar(16, (String)parms[15], 100, false);
               stmt.setLong(17, ((Number) parms[16]).longValue());
               stmt.setDateTime(18, (java.util.Date)parms[17], false);
               stmt.setString(19, (String)parms[18], 8);
               stmt.setVarchar(20, (String)parms[19], 20, false);
               stmt.setDateTime(21, (java.util.Date)parms[20], false, true);
               stmt.setVarchar(22, (String)parms[21], 256, false);
               stmt.setString(23, (String)parms[22], 3);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setString(26, (String)parms[25], 1);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 100, false);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setVarchar(6, (String)parms[5], 100, false);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setVarchar(8, (String)parms[7], 10, false);
               stmt.setBoolean(9, ((Boolean) parms[8]).booleanValue());
               stmt.setDateTime(10, (java.util.Date)parms[9], false);
               stmt.setString(11, (String)parms[10], 12);
               stmt.setString(12, (String)parms[11], 12);
               stmt.setString(13, (String)parms[12], 12);
               stmt.setVarchar(14, (String)parms[13], 100, false);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setVarchar(16, (String)parms[15], 100, false);
               stmt.setLong(17, ((Number) parms[16]).longValue());
               stmt.setDateTime(18, (java.util.Date)parms[17], false);
               stmt.setString(19, (String)parms[18], 8);
               stmt.setVarchar(20, (String)parms[19], 20, false);
               stmt.setDateTime(21, (java.util.Date)parms[20], false, true);
               stmt.setVarchar(22, (String)parms[21], 256, false);
               stmt.setString(23, (String)parms[22], 3);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setString(26, (String)parms[25], 1);
               stmt.setLong(27, ((Number) parms[26]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

