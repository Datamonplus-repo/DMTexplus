package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class upq_cuentacorriente_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3345TipMovCc = httpContext.GetPar( "TipMovCc") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A3345TipMovCc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A3839CcoCod = (short)(GXutil.lval( httpContext.GetPar( "CcoCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A3839CcoCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "UPQ_Cuenta CorrienteTRN", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public upq_cuentacorriente_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public upq_cuentacorriente_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upq_cuentacorriente_trn_impl.class ));
   }

   public upq_cuentacorriente_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "UPQ_Cuenta CorrienteTRN", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStKULin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStKULin_Internalname, httpContext.getMessage( "Ultima Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStKULin_Internalname, GXutil.ltrim( localUtil.ntoc( A3341CCStKULin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStKULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3341CCStKULin), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3341CCStKULin), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStKULin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStKULin_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkLin_Internalname, httpContext.getMessage( "Linea Movimiento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3342CCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3342CCStkLin), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3342CCStkLin), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkLin_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkCanE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkCanE_Internalname, httpContext.getMessage( "Cantidad Entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkCanE_Internalname, GXutil.ltrim( localUtil.ntoc( A3343CCStkCanE, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkCanE_Enabled!=0) ? localUtil.format( A3343CCStkCanE, "ZZZZZZ9.9999") : localUtil.format( A3343CCStkCanE, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkCanE_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkCanE_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkCanS_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkCanS_Internalname, httpContext.getMessage( "Cantidad Salida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkCanS_Internalname, GXutil.ltrim( localUtil.ntoc( A3344CCStkCanS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkCanS_Enabled!=0) ? localUtil.format( A3344CCStkCanS, "ZZZZZZ9.9999") : localUtil.format( A3344CCStkCanS, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkCanS_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkCanS_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipMovCc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipMovCc_Internalname, httpContext.getMessage( "Codigo Tipo Movimiento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMovCc_Internalname, GXutil.rtrim( A3345TipMovCc), GXutil.rtrim( localUtil.format( A3345TipMovCc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMovCc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTipMovCc_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipMovCn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipMovCn_Internalname, httpContext.getMessage( "Descripcion Tipo Movimiento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMovCn_Internalname, GXutil.rtrim( A3346TipMovCn), GXutil.rtrim( localUtil.format( A3346TipMovCn, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMovCn_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTipMovCn_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkPri_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkPri_Internalname, httpContext.getMessage( "CCStkPri", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkPri_Internalname, GXutil.rtrim( A3347CCStkPri), GXutil.rtrim( localUtil.format( A3347CCStkPri, "9")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkPri_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkPri_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkFec_Internalname, httpContext.getMessage( "Fecha Movimiento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCCStkFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkFec_Internalname, localUtil.format(A3348CCStkFec, "99/99/99"), localUtil.format( A3348CCStkFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCCStkFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCStkFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkPre_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkPre_Internalname, GXutil.ltrim( localUtil.ntoc( A3349CCStkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkPre_Enabled!=0) ? localUtil.format( A3349CCStkPre, "ZZZZZZZ9.999") : localUtil.format( A3349CCStkPre, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkPre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkPre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkBar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkBar_Internalname, httpContext.getMessage( "Hoja de Ruta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkBar_Internalname, GXutil.ltrim( localUtil.ntoc( A3350CCStkBar, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkBar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3350CCStkBar), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3350CCStkBar), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkBar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkBar_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkReo_Internalname, httpContext.getMessage( "Reoperado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkReo_Internalname, GXutil.ltrim( localUtil.ntoc( A3351CCStkReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3351CCStkReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A3351CCStkReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkPar_Internalname, httpContext.getMessage( "Particion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkPar_Internalname, GXutil.rtrim( A3352CCStkPar), GXutil.rtrim( localUtil.format( A3352CCStkPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkPed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkPed_Internalname, httpContext.getMessage( "Pedido", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkPed_Internalname, GXutil.ltrim( localUtil.ntoc( A3353CCStkPed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkPed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3353CCStkPed), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3353CCStkPed), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkPed_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkPed_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkAlb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkAlb_Internalname, httpContext.getMessage( "Albaran", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkAlb_Internalname, GXutil.rtrim( A3354CCStkAlb), GXutil.rtrim( localUtil.format( A3354CCStkAlb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkAlb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkAlb_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkUsu_Internalname, GXutil.rtrim( A3355CCStkUsu), GXutil.rtrim( localUtil.format( A3355CCStkUsu, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkUsu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkHor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkHor_Internalname, httpContext.getMessage( "Hora", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkHor_Internalname, GXutil.rtrim( A3356CCStkHor), GXutil.rtrim( localUtil.format( A3356CCStkHor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkHor_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkHor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkDsc_Internalname, GXutil.rtrim( A3357CCStkDsc), GXutil.rtrim( localUtil.format( A3357CCStkDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkLen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkLen_Internalname, httpContext.getMessage( "Linea Entrada Almacen", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkLen_Internalname, GXutil.ltrim( localUtil.ntoc( A3358CCStkLen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkLen_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3358CCStkLen), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3358CCStkLen), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkLen_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkLen_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiAlm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdExiAlm_Internalname, httpContext.getMessage( "Existencias Almacen", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdExiAlm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCcoCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCcoCod_Internalname, httpContext.getMessage( "CcoCod", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCcoCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3839CcoCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3839CcoCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcoCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCcoCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtValorE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtValorE_Internalname, httpContext.getMessage( "Valor Entradas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtValorE_Internalname, GXutil.ltrim( localUtil.ntoc( A3909ValorE, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValorE_Enabled!=0) ? localUtil.format( A3909ValorE, "ZZZZZZZ9.99") : localUtil.format( A3909ValorE, "ZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValorE_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtValorE_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtValorS_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtValorS_Internalname, httpContext.getMessage( "Valor salidas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtValorS_Internalname, GXutil.ltrim( localUtil.ntoc( A3910ValorS, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValorS_Enabled!=0) ? localUtil.format( A3910ValorS, "ZZZZZZZZ9.99") : localUtil.format( A3910ValorS, "ZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValorS_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtValorS_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtValorEI_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtValorEI_Internalname, httpContext.getMessage( "ValorEI", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtValorEI_Internalname, GXutil.ltrim( localUtil.ntoc( A3916ValorEI, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValorEI_Enabled!=0) ? localUtil.format( A3916ValorEI, "ZZZZZZZ9.99999") : localUtil.format( A3916ValorEI, "ZZZZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValorEI_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtValorEI_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtValorSI_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtValorSI_Internalname, httpContext.getMessage( "ValorSI", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtValorSI_Internalname, GXutil.ltrim( localUtil.ntoc( A3917ValorSI, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValorSI_Enabled!=0) ? localUtil.format( A3917ValorSI, "ZZZZZZZ9.99999") : localUtil.format( A3917ValorSI, "ZZZZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValorSI_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtValorSI_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkLot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkLot_Internalname, httpContext.getMessage( "Lote Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkLot_Internalname, GXutil.rtrim( A5722CCStkLot), GXutil.rtrim( localUtil.format( A5722CCStkLot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkLot_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkLot_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkExp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkExp_Internalname, httpContext.getMessage( "Exportado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkExp_Internalname, GXutil.ltrim( localUtil.ntoc( A6834CCStkExp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkExp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6834CCStkExp), "9") : localUtil.format( DecimalUtil.doubleToDec(A6834CCStkExp), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkExp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkExp_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkExpF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkExpF_Internalname, httpContext.getMessage( "Fecha Exportacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCCStkExpF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkExpF_Internalname, localUtil.format(A6835CCStkExpF, "99/99/99"), localUtil.format( A6835CCStkExpF, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkExpF_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkExpF_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCCStkExpF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCStkExpF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCcStkPrv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCcStkPrv_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcStkPrv_Internalname, GXutil.ltrim( localUtil.ntoc( A6157CcStkPrv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCcStkPrv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6157CcStkPrv), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6157CcStkPrv), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcStkPrv_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCcStkPrv_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCcstkhis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCcstkhis_Internalname, httpContext.getMessage( "Historico?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcstkhis_Internalname, GXutil.ltrim( localUtil.ntoc( A11347Ccstkhis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCcstkhis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11347Ccstkhis), "9") : localUtil.format( DecimalUtil.doubleToDec(A11347Ccstkhis), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcstkhis_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCcstkhis_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkDoc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkDoc_Internalname, httpContext.getMessage( "Documento Disolucion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkDoc_Internalname, GXutil.ltrim( localUtil.ntoc( A12229CCStkDoc, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkDoc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12229CCStkDoc), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12229CCStkDoc), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkDoc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkDoc_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkNAlb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkNAlb_Internalname, httpContext.getMessage( "N Albaran Mayor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkNAlb_Internalname, GXutil.rtrim( A12858CCStkNAlb), GXutil.rtrim( localUtil.format( A12858CCStkNAlb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkNAlb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkNAlb_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkLotFe_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCStkLotFe_Internalname, httpContext.getMessage( "Caducidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCCStkLotFe_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkLotFe_Internalname, localUtil.format(A13979CCStkLotFe, "99/99/99"), localUtil.format( A13979CCStkLotFe, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkLotFe_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCStkLotFe_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCCStkLotFe_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCStkLotFe_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCstkLotAl_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCstkLotAl_Internalname, httpContext.getMessage( "Almacen", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCstkLotAl_Internalname, GXutil.ltrim( localUtil.ntoc( A13980CCstkLotAl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCstkLotAl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13980CCstkLotAl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13980CCstkLotAl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCstkLotAl_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCstkLotAl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 223,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\UPQ_CuentaCorriente_TRN.htm");
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
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z3342CCStkLin = localUtil.ctol( httpContext.cgiGet( "Z3342CCStkLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z3343CCStkCanE = localUtil.ctond( httpContext.cgiGet( "Z3343CCStkCanE")) ;
         Z3344CCStkCanS = localUtil.ctond( httpContext.cgiGet( "Z3344CCStkCanS")) ;
         Z3347CCStkPri = httpContext.cgiGet( "Z3347CCStkPri") ;
         Z3348CCStkFec = localUtil.ctod( httpContext.cgiGet( "Z3348CCStkFec"), 0) ;
         Z3349CCStkPre = localUtil.ctond( httpContext.cgiGet( "Z3349CCStkPre")) ;
         Z3350CCStkBar = (int)(localUtil.ctol( httpContext.cgiGet( "Z3350CCStkBar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3351CCStkReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3351CCStkReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3352CCStkPar = httpContext.cgiGet( "Z3352CCStkPar") ;
         Z3353CCStkPed = (int)(localUtil.ctol( httpContext.cgiGet( "Z3353CCStkPed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3354CCStkAlb = httpContext.cgiGet( "Z3354CCStkAlb") ;
         Z3355CCStkUsu = httpContext.cgiGet( "Z3355CCStkUsu") ;
         Z3356CCStkHor = httpContext.cgiGet( "Z3356CCStkHor") ;
         Z3357CCStkDsc = httpContext.cgiGet( "Z3357CCStkDsc") ;
         Z3358CCStkLen = (short)(localUtil.ctol( httpContext.cgiGet( "Z3358CCStkLen"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5722CCStkLot = httpContext.cgiGet( "Z5722CCStkLot") ;
         Z6834CCStkExp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6834CCStkExp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6835CCStkExpF = localUtil.ctod( httpContext.cgiGet( "Z6835CCStkExpF"), 0) ;
         Z6157CcStkPrv = (int)(localUtil.ctol( httpContext.cgiGet( "Z6157CcStkPrv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11347Ccstkhis = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11347Ccstkhis"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12229CCStkDoc = localUtil.ctol( httpContext.cgiGet( "Z12229CCStkDoc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z12858CCStkNAlb = httpContext.cgiGet( "Z12858CCStkNAlb") ;
         Z13979CCStkLotFe = localUtil.ctod( httpContext.cgiGet( "Z13979CCStkLotFe"), 0) ;
         Z13980CCstkLotAl = (short)(localUtil.ctol( httpContext.cgiGet( "Z13980CCstkLotAl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3345TipMovCc = httpContext.cgiGet( "Z3345TipMovCc") ;
         Z3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3839CcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( "EMPNUMDEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3915EmpNumDec = false ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A3341CCStKULin = localUtil.ctol( httpContext.cgiGet( edtCCStKULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n3341CCStKULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3341CCStKULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3341CCStKULin), 12, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCStkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCStkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSTKLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCStkLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3342CCStkLin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
         }
         else
         {
            A3342CCStkLin = localUtil.ctol( httpContext.cgiGet( edtCCStkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCCStkCanE_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCCStkCanE_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSTKCANE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCStkCanE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3343CCStkCanE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A3343CCStkCanE", GXutil.ltrimstr( A3343CCStkCanE, 12, 4));
         }
         else
         {
            A3343CCStkCanE = localUtil.ctond( httpContext.cgiGet( edtCCStkCanE_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3343CCStkCanE", GXutil.ltrimstr( A3343CCStkCanE, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCCStkCanS_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCCStkCanS_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSTKCANS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCStkCanS_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3344CCStkCanS = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A3344CCStkCanS", GXutil.ltrimstr( A3344CCStkCanS, 12, 4));
         }
         else
         {
            A3344CCStkCanS = localUtil.ctond( httpContext.cgiGet( edtCCStkCanS_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3344CCStkCanS", GXutil.ltrimstr( A3344CCStkCanS, 12, 4));
         }
         A3345TipMovCc = httpContext.cgiGet( edtTipMovCc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
         A3346TipMovCn = httpContext.cgiGet( edtTipMovCn_Internalname) ;
         n3346TipMovCn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
         A3347CCStkPri = httpContext.cgiGet( edtCCStkPri_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3347CCStkPri", A3347CCStkPri);
         if ( localUtil.vcdate( httpContext.cgiGet( edtCCStkFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CCSTKFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCStkFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3348CCStkFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A3348CCStkFec", localUtil.format(A3348CCStkFec, "99/99/99"));
         }
         else
         {
            A3348CCStkFec = localUtil.ctod( httpContext.cgiGet( edtCCStkFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3348CCStkFec", localUtil.format(A3348CCStkFec, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCCStkPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCCStkPre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSTKPRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCStkPre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3349CCStkPre = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A3349CCStkPre", GXutil.ltrimstr( A3349CCStkPre, 14, 5));
         }
         else
         {
            A3349CCStkPre = localUtil.ctond( httpContext.cgiGet( edtCCStkPre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3349CCStkPre", GXutil.ltrimstr( A3349CCStkPre, 14, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCStkBar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCStkBar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSTKBAR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCStkBar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3350CCStkBar = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3350CCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3350CCStkBar), 8, 0));
         }
         else
         {
            A3350CCStkBar = (int)(localUtil.ctol( httpContext.cgiGet( edtCCStkBar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3350CCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3350CCStkBar), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCStkReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCStkReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSTKREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCStkReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3351CCStkReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3351CCStkReo", GXutil.str( A3351CCStkReo, 1, 0));
         }
         else
         {
            A3351CCStkReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCStkReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3351CCStkReo", GXutil.str( A3351CCStkReo, 1, 0));
         }
         A3352CCStkPar = httpContext.cgiGet( edtCCStkPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3352CCStkPar", A3352CCStkPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCStkPed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCStkPed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSTKPED");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCStkPed_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3353CCStkPed = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3353CCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3353CCStkPed), 8, 0));
         }
         else
         {
            A3353CCStkPed = (int)(localUtil.ctol( httpContext.cgiGet( edtCCStkPed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3353CCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3353CCStkPed), 8, 0));
         }
         A3354CCStkAlb = httpContext.cgiGet( edtCCStkAlb_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3354CCStkAlb", A3354CCStkAlb);
         A3355CCStkUsu = GXutil.upper( httpContext.cgiGet( edtCCStkUsu_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3355CCStkUsu", A3355CCStkUsu);
         A3356CCStkHor = httpContext.cgiGet( edtCCStkHor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3356CCStkHor", A3356CCStkHor);
         A3357CCStkDsc = httpContext.cgiGet( edtCCStkDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3357CCStkDsc", A3357CCStkDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCStkLen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCStkLen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSTKLEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCStkLen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3358CCStkLen = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3358CCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3358CCStkLen), 4, 0));
         }
         else
         {
            A3358CCStkLen = (short)(localUtil.ctol( httpContext.cgiGet( edtCCStkLen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3358CCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3358CCStkLen), 4, 0));
         }
         A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCcoCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3839CcoCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         }
         else
         {
            A3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( edtCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         }
         A3909ValorE = localUtil.ctond( httpContext.cgiGet( edtValorE_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
         A3910ValorS = localUtil.ctond( httpContext.cgiGet( edtValorS_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
         A3916ValorEI = localUtil.ctond( httpContext.cgiGet( edtValorEI_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3916ValorEI", GXutil.ltrimstr( A3916ValorEI, 14, 5));
         A3917ValorSI = localUtil.ctond( httpContext.cgiGet( edtValorSI_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3917ValorSI", GXutil.ltrimstr( A3917ValorSI, 14, 5));
         A5722CCStkLot = httpContext.cgiGet( edtCCStkLot_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5722CCStkLot", A5722CCStkLot);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCStkExp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCStkExp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSTKEXP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCStkExp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6834CCStkExp = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6834CCStkExp", GXutil.str( A6834CCStkExp, 1, 0));
         }
         else
         {
            A6834CCStkExp = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCStkExp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6834CCStkExp", GXutil.str( A6834CCStkExp, 1, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtCCStkExpF_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CCSTKEXPF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCStkExpF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6835CCStkExpF = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A6835CCStkExpF", localUtil.format(A6835CCStkExpF, "99/99/99"));
         }
         else
         {
            A6835CCStkExpF = localUtil.ctod( httpContext.cgiGet( edtCCStkExpF_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6835CCStkExpF", localUtil.format(A6835CCStkExpF, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCcStkPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCcStkPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSTKPRV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCcStkPrv_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6157CcStkPrv = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6157CcStkPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6157CcStkPrv), 6, 0));
         }
         else
         {
            A6157CcStkPrv = (int)(localUtil.ctol( httpContext.cgiGet( edtCcStkPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6157CcStkPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6157CcStkPrv), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCcstkhis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCcstkhis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSTKHIS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCcstkhis_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11347Ccstkhis = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11347Ccstkhis", GXutil.str( A11347Ccstkhis, 1, 0));
         }
         else
         {
            A11347Ccstkhis = (byte)(localUtil.ctol( httpContext.cgiGet( edtCcstkhis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11347Ccstkhis", GXutil.str( A11347Ccstkhis, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCStkDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCStkDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSTKDOC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCStkDoc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12229CCStkDoc = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A12229CCStkDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12229CCStkDoc), 10, 0));
         }
         else
         {
            A12229CCStkDoc = localUtil.ctol( httpContext.cgiGet( edtCCStkDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12229CCStkDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12229CCStkDoc), 10, 0));
         }
         A12858CCStkNAlb = httpContext.cgiGet( edtCCStkNAlb_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12858CCStkNAlb", A12858CCStkNAlb);
         if ( localUtil.vcdate( httpContext.cgiGet( edtCCStkLotFe_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CCSTKLOTFE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCStkLotFe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13979CCStkLotFe = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A13979CCStkLotFe", localUtil.format(A13979CCStkLotFe, "99/99/99"));
         }
         else
         {
            A13979CCStkLotFe = localUtil.ctod( httpContext.cgiGet( edtCCStkLotFe_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13979CCStkLotFe", localUtil.format(A13979CCStkLotFe, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCstkLotAl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCstkLotAl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSTKLOTAL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCstkLotAl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13980CCstkLotAl = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13980CCstkLotAl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13980CCstkLotAl), 4, 0));
         }
         else
         {
            A13980CCstkLotAl = (short)(localUtil.ctol( httpContext.cgiGet( edtCCstkLotAl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13980CCstkLotAl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13980CCstkLotAl), 4, 0));
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
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A3342CCStkLin = GXutil.lval( httpContext.GetPar( "CCStkLin")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
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
            initAll1SG484( ) ;
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
      disableAttributes1SG484( ) ;
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

   public void resetCaption1SG0( )
   {
   }

   public void zm1SG484( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3343CCStkCanE = T01SG3_A3343CCStkCanE[0] ;
            Z3344CCStkCanS = T01SG3_A3344CCStkCanS[0] ;
            Z3347CCStkPri = T01SG3_A3347CCStkPri[0] ;
            Z3348CCStkFec = T01SG3_A3348CCStkFec[0] ;
            Z3349CCStkPre = T01SG3_A3349CCStkPre[0] ;
            Z3350CCStkBar = T01SG3_A3350CCStkBar[0] ;
            Z3351CCStkReo = T01SG3_A3351CCStkReo[0] ;
            Z3352CCStkPar = T01SG3_A3352CCStkPar[0] ;
            Z3353CCStkPed = T01SG3_A3353CCStkPed[0] ;
            Z3354CCStkAlb = T01SG3_A3354CCStkAlb[0] ;
            Z3355CCStkUsu = T01SG3_A3355CCStkUsu[0] ;
            Z3356CCStkHor = T01SG3_A3356CCStkHor[0] ;
            Z3357CCStkDsc = T01SG3_A3357CCStkDsc[0] ;
            Z3358CCStkLen = T01SG3_A3358CCStkLen[0] ;
            Z5722CCStkLot = T01SG3_A5722CCStkLot[0] ;
            Z6834CCStkExp = T01SG3_A6834CCStkExp[0] ;
            Z6835CCStkExpF = T01SG3_A6835CCStkExpF[0] ;
            Z6157CcStkPrv = T01SG3_A6157CcStkPrv[0] ;
            Z11347Ccstkhis = T01SG3_A11347Ccstkhis[0] ;
            Z12229CCStkDoc = T01SG3_A12229CCStkDoc[0] ;
            Z12858CCStkNAlb = T01SG3_A12858CCStkNAlb[0] ;
            Z13979CCStkLotFe = T01SG3_A13979CCStkLotFe[0] ;
            Z13980CCstkLotAl = T01SG3_A13980CCstkLotAl[0] ;
            Z3345TipMovCc = T01SG3_A3345TipMovCc[0] ;
            Z3839CcoCod = T01SG3_A3839CcoCod[0] ;
         }
         else
         {
            Z3343CCStkCanE = A3343CCStkCanE ;
            Z3344CCStkCanS = A3344CCStkCanS ;
            Z3347CCStkPri = A3347CCStkPri ;
            Z3348CCStkFec = A3348CCStkFec ;
            Z3349CCStkPre = A3349CCStkPre ;
            Z3350CCStkBar = A3350CCStkBar ;
            Z3351CCStkReo = A3351CCStkReo ;
            Z3352CCStkPar = A3352CCStkPar ;
            Z3353CCStkPed = A3353CCStkPed ;
            Z3354CCStkAlb = A3354CCStkAlb ;
            Z3355CCStkUsu = A3355CCStkUsu ;
            Z3356CCStkHor = A3356CCStkHor ;
            Z3357CCStkDsc = A3357CCStkDsc ;
            Z3358CCStkLen = A3358CCStkLen ;
            Z5722CCStkLot = A5722CCStkLot ;
            Z6834CCStkExp = A6834CCStkExp ;
            Z6835CCStkExpF = A6835CCStkExpF ;
            Z6157CcStkPrv = A6157CcStkPrv ;
            Z11347Ccstkhis = A11347Ccstkhis ;
            Z12229CCStkDoc = A12229CCStkDoc ;
            Z12858CCStkNAlb = A12858CCStkNAlb ;
            Z13979CCStkLotFe = A13979CCStkLotFe ;
            Z13980CCstkLotAl = A13980CCstkLotAl ;
            Z3345TipMovCc = A3345TipMovCc ;
            Z3839CcoCod = A3839CcoCod ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z3342CCStkLin = A3342CCStkLin ;
         Z3343CCStkCanE = A3343CCStkCanE ;
         Z3344CCStkCanS = A3344CCStkCanS ;
         Z3347CCStkPri = A3347CCStkPri ;
         Z3348CCStkFec = A3348CCStkFec ;
         Z3349CCStkPre = A3349CCStkPre ;
         Z3350CCStkBar = A3350CCStkBar ;
         Z3351CCStkReo = A3351CCStkReo ;
         Z3352CCStkPar = A3352CCStkPar ;
         Z3353CCStkPed = A3353CCStkPed ;
         Z3354CCStkAlb = A3354CCStkAlb ;
         Z3355CCStkUsu = A3355CCStkUsu ;
         Z3356CCStkHor = A3356CCStkHor ;
         Z3357CCStkDsc = A3357CCStkDsc ;
         Z3358CCStkLen = A3358CCStkLen ;
         Z5722CCStkLot = A5722CCStkLot ;
         Z6834CCStkExp = A6834CCStkExp ;
         Z6835CCStkExpF = A6835CCStkExpF ;
         Z6157CcStkPrv = A6157CcStkPrv ;
         Z11347Ccstkhis = A11347Ccstkhis ;
         Z12229CCStkDoc = A12229CCStkDoc ;
         Z12858CCStkNAlb = A12858CCStkNAlb ;
         Z13979CCStkLotFe = A13979CCStkLotFe ;
         Z13980CCstkLotAl = A13980CCstkLotAl ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z3345TipMovCc = A3345TipMovCc ;
         Z3839CcoCod = A3839CcoCod ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z718PrdNom = A718PrdNom ;
         Z3341CCStKULin = A3341CCStKULin ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z3346TipMovCn = A3346TipMovCn ;
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

   public void load1SG484( )
   {
      /* Using cursor T01SG8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound484 = (short)(1) ;
         A407EmprNom = T01SG8_A407EmprNom[0] ;
         n407EmprNom = T01SG8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A718PrdNom = T01SG8_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A3341CCStKULin = T01SG8_A3341CCStKULin[0] ;
         n3341CCStKULin = T01SG8_n3341CCStKULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3341CCStKULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3341CCStKULin), 12, 0));
         A3343CCStkCanE = T01SG8_A3343CCStkCanE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3343CCStkCanE", GXutil.ltrimstr( A3343CCStkCanE, 12, 4));
         A3344CCStkCanS = T01SG8_A3344CCStkCanS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3344CCStkCanS", GXutil.ltrimstr( A3344CCStkCanS, 12, 4));
         A3346TipMovCn = T01SG8_A3346TipMovCn[0] ;
         n3346TipMovCn = T01SG8_n3346TipMovCn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
         A3347CCStkPri = T01SG8_A3347CCStkPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3347CCStkPri", A3347CCStkPri);
         A3348CCStkFec = T01SG8_A3348CCStkFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3348CCStkFec", localUtil.format(A3348CCStkFec, "99/99/99"));
         A3349CCStkPre = T01SG8_A3349CCStkPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3349CCStkPre", GXutil.ltrimstr( A3349CCStkPre, 14, 5));
         A3350CCStkBar = T01SG8_A3350CCStkBar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3350CCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3350CCStkBar), 8, 0));
         A3351CCStkReo = T01SG8_A3351CCStkReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3351CCStkReo", GXutil.str( A3351CCStkReo, 1, 0));
         A3352CCStkPar = T01SG8_A3352CCStkPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3352CCStkPar", A3352CCStkPar);
         A3353CCStkPed = T01SG8_A3353CCStkPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3353CCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3353CCStkPed), 8, 0));
         A3354CCStkAlb = T01SG8_A3354CCStkAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3354CCStkAlb", A3354CCStkAlb);
         A3355CCStkUsu = T01SG8_A3355CCStkUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3355CCStkUsu", A3355CCStkUsu);
         A3356CCStkHor = T01SG8_A3356CCStkHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3356CCStkHor", A3356CCStkHor);
         A3357CCStkDsc = T01SG8_A3357CCStkDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3357CCStkDsc", A3357CCStkDsc);
         A3358CCStkLen = T01SG8_A3358CCStkLen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3358CCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3358CCStkLen), 4, 0));
         A704PrdExiAlm = T01SG8_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A5722CCStkLot = T01SG8_A5722CCStkLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5722CCStkLot", A5722CCStkLot);
         A6834CCStkExp = T01SG8_A6834CCStkExp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6834CCStkExp", GXutil.str( A6834CCStkExp, 1, 0));
         A6835CCStkExpF = T01SG8_A6835CCStkExpF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6835CCStkExpF", localUtil.format(A6835CCStkExpF, "99/99/99"));
         A6157CcStkPrv = T01SG8_A6157CcStkPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6157CcStkPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6157CcStkPrv), 6, 0));
         A11347Ccstkhis = T01SG8_A11347Ccstkhis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11347Ccstkhis", GXutil.str( A11347Ccstkhis, 1, 0));
         A12229CCStkDoc = T01SG8_A12229CCStkDoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12229CCStkDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12229CCStkDoc), 10, 0));
         A12858CCStkNAlb = T01SG8_A12858CCStkNAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12858CCStkNAlb", A12858CCStkNAlb);
         A13979CCStkLotFe = T01SG8_A13979CCStkLotFe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13979CCStkLotFe", localUtil.format(A13979CCStkLotFe, "99/99/99"));
         A13980CCstkLotAl = T01SG8_A13980CCstkLotAl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13980CCstkLotAl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13980CCstkLotAl), 4, 0));
         A3915EmpNumDec = T01SG8_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01SG8_n3915EmpNumDec[0] ;
         A3345TipMovCc = T01SG8_A3345TipMovCc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
         A3839CcoCod = T01SG8_A3839CcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         zm1SG484( -6) ;
      }
      pr_default.close(6);
      onLoadActions1SG484( ) ;
   }

   public void onLoadActions1SG484( )
   {
      A3916ValorEI = A3343CCStkCanE.multiply(A3349CCStkPre) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3916ValorEI", GXutil.ltrimstr( A3916ValorEI, 14, 5));
      if ( A3915EmpNumDec == 0 )
      {
         A3909ValorE = GXutil.roundDecimal( A3916ValorEI, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
      }
      else
      {
         if ( A3915EmpNumDec == 2 )
         {
            A3909ValorE = GXutil.roundDecimal( A3916ValorEI, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
         }
         else
         {
            A3909ValorE = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
         }
      }
      A3917ValorSI = A3344CCStkCanS.multiply(A3349CCStkPre) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3917ValorSI", GXutil.ltrimstr( A3917ValorSI, 14, 5));
      if ( A3915EmpNumDec == 0 )
      {
         A3910ValorS = GXutil.roundDecimal( A3917ValorSI, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
      }
      else
      {
         if ( A3915EmpNumDec == 2 )
         {
            A3910ValorS = GXutil.roundDecimal( A3917ValorSI, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
         }
         else
         {
            A3910ValorS = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
         }
      }
   }

   public void checkExtendedTable1SG484( )
   {
      nIsDirty_484 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01SG4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SG4_A407EmprNom[0] ;
      n407EmprNom = T01SG4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T01SG4_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01SG4_n3915EmpNumDec[0] ;
      pr_default.close(2);
      /* Using cursor T01SG6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A3345TipMovCc});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPMOV", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPMOVCC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3346TipMovCn = T01SG6_A3346TipMovCn[0] ;
      n3346TipMovCn = T01SG6_n3346TipMovCn[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
      pr_default.close(4);
      /* Using cursor T01SG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SG5_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A3341CCStKULin = T01SG5_A3341CCStKULin[0] ;
      n3341CCStKULin = T01SG5_n3341CCStKULin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3341CCStKULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3341CCStKULin), 12, 0));
      A704PrdExiAlm = T01SG5_A704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      pr_default.close(3);
      nIsDirty_484 = (short)(1) ;
      A3916ValorEI = A3343CCStkCanE.multiply(A3349CCStkPre) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3916ValorEI", GXutil.ltrimstr( A3916ValorEI, 14, 5));
      if ( A3915EmpNumDec == 0 )
      {
         nIsDirty_484 = (short)(1) ;
         A3909ValorE = GXutil.roundDecimal( A3916ValorEI, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
      }
      else
      {
         if ( A3915EmpNumDec == 2 )
         {
            nIsDirty_484 = (short)(1) ;
            A3909ValorE = GXutil.roundDecimal( A3916ValorEI, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
         }
         else
         {
            nIsDirty_484 = (short)(1) ;
            A3909ValorE = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
         }
      }
      nIsDirty_484 = (short)(1) ;
      A3917ValorSI = A3344CCStkCanS.multiply(A3349CCStkPre) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3917ValorSI", GXutil.ltrimstr( A3917ValorSI, 14, 5));
      if ( A3915EmpNumDec == 0 )
      {
         nIsDirty_484 = (short)(1) ;
         A3910ValorS = GXutil.roundDecimal( A3917ValorSI, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
      }
      else
      {
         if ( A3915EmpNumDec == 2 )
         {
            nIsDirty_484 = (short)(1) ;
            A3910ValorS = GXutil.roundDecimal( A3917ValorSI, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
         }
         else
         {
            nIsDirty_484 = (short)(1) ;
            A3910ValorS = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
         }
      }
      if ( ! ( ( GXutil.strcmp(A3347CCStkPri, "0") == 0 ) || ( GXutil.strcmp(A3347CCStkPri, "1") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "CCStkPri", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CCSTKPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCStkPri_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01SG7 */
      pr_default.execute(5, new Object[] {Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCcoCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1SG484( )
   {
      pr_default.close(2);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_7( String A396EmprCod )
   {
      /* Using cursor T01SG9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SG9_A407EmprNom[0] ;
      n407EmprNom = T01SG9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T01SG9_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01SG9_n3915EmpNumDec[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_9( String A396EmprCod ,
                         String A3345TipMovCc )
   {
      /* Using cursor T01SG10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A3345TipMovCc});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPMOV", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPMOVCC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3346TipMovCn = T01SG10_A3346TipMovCn[0] ;
      n3346TipMovCn = T01SG10_n3346TipMovCn[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3346TipMovCn))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_8( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T01SG11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SG11_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A3341CCStKULin = T01SG11_A3341CCStKULin[0] ;
      n3341CCStKULin = T01SG11_n3341CCStKULin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3341CCStKULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3341CCStKULin), 12, 0));
      A704PrdExiAlm = T01SG11_A704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3341CCStKULin, (byte)(12), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_10( short A3839CcoCod )
   {
      /* Using cursor T01SG12 */
      pr_default.execute(10, new Object[] {Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCcoCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1SG484( )
   {
      /* Using cursor T01SG13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound484 = (short)(1) ;
      }
      else
      {
         RcdFound484 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1SG484( 6) ;
         RcdFound484 = (short)(1) ;
         A3342CCStkLin = T01SG3_A3342CCStkLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
         A3343CCStkCanE = T01SG3_A3343CCStkCanE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3343CCStkCanE", GXutil.ltrimstr( A3343CCStkCanE, 12, 4));
         A3344CCStkCanS = T01SG3_A3344CCStkCanS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3344CCStkCanS", GXutil.ltrimstr( A3344CCStkCanS, 12, 4));
         A3347CCStkPri = T01SG3_A3347CCStkPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3347CCStkPri", A3347CCStkPri);
         A3348CCStkFec = T01SG3_A3348CCStkFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3348CCStkFec", localUtil.format(A3348CCStkFec, "99/99/99"));
         A3349CCStkPre = T01SG3_A3349CCStkPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3349CCStkPre", GXutil.ltrimstr( A3349CCStkPre, 14, 5));
         A3350CCStkBar = T01SG3_A3350CCStkBar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3350CCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3350CCStkBar), 8, 0));
         A3351CCStkReo = T01SG3_A3351CCStkReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3351CCStkReo", GXutil.str( A3351CCStkReo, 1, 0));
         A3352CCStkPar = T01SG3_A3352CCStkPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3352CCStkPar", A3352CCStkPar);
         A3353CCStkPed = T01SG3_A3353CCStkPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3353CCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3353CCStkPed), 8, 0));
         A3354CCStkAlb = T01SG3_A3354CCStkAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3354CCStkAlb", A3354CCStkAlb);
         A3355CCStkUsu = T01SG3_A3355CCStkUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3355CCStkUsu", A3355CCStkUsu);
         A3356CCStkHor = T01SG3_A3356CCStkHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3356CCStkHor", A3356CCStkHor);
         A3357CCStkDsc = T01SG3_A3357CCStkDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3357CCStkDsc", A3357CCStkDsc);
         A3358CCStkLen = T01SG3_A3358CCStkLen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3358CCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3358CCStkLen), 4, 0));
         A5722CCStkLot = T01SG3_A5722CCStkLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5722CCStkLot", A5722CCStkLot);
         A6834CCStkExp = T01SG3_A6834CCStkExp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6834CCStkExp", GXutil.str( A6834CCStkExp, 1, 0));
         A6835CCStkExpF = T01SG3_A6835CCStkExpF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6835CCStkExpF", localUtil.format(A6835CCStkExpF, "99/99/99"));
         A6157CcStkPrv = T01SG3_A6157CcStkPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6157CcStkPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6157CcStkPrv), 6, 0));
         A11347Ccstkhis = T01SG3_A11347Ccstkhis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11347Ccstkhis", GXutil.str( A11347Ccstkhis, 1, 0));
         A12229CCStkDoc = T01SG3_A12229CCStkDoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12229CCStkDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12229CCStkDoc), 10, 0));
         A12858CCStkNAlb = T01SG3_A12858CCStkNAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12858CCStkNAlb", A12858CCStkNAlb);
         A13979CCStkLotFe = T01SG3_A13979CCStkLotFe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13979CCStkLotFe", localUtil.format(A13979CCStkLotFe, "99/99/99"));
         A13980CCstkLotAl = T01SG3_A13980CCstkLotAl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13980CCstkLotAl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13980CCstkLotAl), 4, 0));
         A396EmprCod = T01SG3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01SG3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A3345TipMovCc = T01SG3_A3345TipMovCc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
         A3839CcoCod = T01SG3_A3839CcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z3342CCStkLin = A3342CCStkLin ;
         sMode484 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1SG484( ) ;
         if ( AnyError == 1 )
         {
            RcdFound484 = (short)(0) ;
            initializeNonKey1SG484( ) ;
         }
         Gx_mode = sMode484 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound484 = (short)(0) ;
         initializeNonKey1SG484( ) ;
         sMode484 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode484 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1SG484( ) ;
      if ( RcdFound484 == 0 )
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
      RcdFound484 = (short)(0) ;
      /* Using cursor T01SG14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, Long.valueOf(A3342CCStkLin)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01SG14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SG14_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01SG14_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SG14_A3342CCStkLin[0] < A3342CCStkLin ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01SG14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SG14_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01SG14_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SG14_A3342CCStkLin[0] > A3342CCStkLin ) ) )
         {
            A396EmprCod = T01SG14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T01SG14_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A3342CCStkLin = T01SG14_A3342CCStkLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
            RcdFound484 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound484 = (short)(0) ;
      /* Using cursor T01SG15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, Long.valueOf(A3342CCStkLin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01SG15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SG15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SG15_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01SG15_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SG15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SG15_A3342CCStkLin[0] > A3342CCStkLin ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01SG15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SG15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SG15_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01SG15_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SG15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SG15_A3342CCStkLin[0] < A3342CCStkLin ) ) )
         {
            A396EmprCod = T01SG15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T01SG15_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A3342CCStkLin = T01SG15_A3342CCStkLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
            RcdFound484 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SG484( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SG484( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound484 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A3342CCStkLin != Z3342CCStkLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A3342CCStkLin = Z3342CCStkLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1SG484( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A3342CCStkLin != Z3342CCStkLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SG484( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1SG484( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A3342CCStkLin != Z3342CCStkLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A3342CCStkLin = Z3342CCStkLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      if ( RcdFound484 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCCStkCanE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1SG484( ) ;
      if ( RcdFound484 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCStkCanE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1SG484( ) ;
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
      if ( RcdFound484 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCStkCanE_Internalname ;
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
      if ( RcdFound484 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCStkCanE_Internalname ;
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
      scanStart1SG484( ) ;
      if ( RcdFound484 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound484 != 0 )
         {
            scanNext1SG484( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCStkCanE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1SG484( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1SG484( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCSTKS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z3343CCStkCanE, T01SG2_A3343CCStkCanE[0]) != 0 ) || ( DecimalUtil.compareTo(Z3344CCStkCanS, T01SG2_A3344CCStkCanS[0]) != 0 ) || ( GXutil.strcmp(Z3347CCStkPri, T01SG2_A3347CCStkPri[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3348CCStkFec), GXutil.resetTime(T01SG2_A3348CCStkFec[0])) ) || ( DecimalUtil.compareTo(Z3349CCStkPre, T01SG2_A3349CCStkPre[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3350CCStkBar != T01SG2_A3350CCStkBar[0] ) || ( Z3351CCStkReo != T01SG2_A3351CCStkReo[0] ) || ( GXutil.strcmp(Z3352CCStkPar, T01SG2_A3352CCStkPar[0]) != 0 ) || ( Z3353CCStkPed != T01SG2_A3353CCStkPed[0] ) || ( GXutil.strcmp(Z3354CCStkAlb, T01SG2_A3354CCStkAlb[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3355CCStkUsu, T01SG2_A3355CCStkUsu[0]) != 0 ) || ( GXutil.strcmp(Z3356CCStkHor, T01SG2_A3356CCStkHor[0]) != 0 ) || ( GXutil.strcmp(Z3357CCStkDsc, T01SG2_A3357CCStkDsc[0]) != 0 ) || ( Z3358CCStkLen != T01SG2_A3358CCStkLen[0] ) || ( GXutil.strcmp(Z5722CCStkLot, T01SG2_A5722CCStkLot[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6834CCStkExp != T01SG2_A6834CCStkExp[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z6835CCStkExpF), GXutil.resetTime(T01SG2_A6835CCStkExpF[0])) ) || ( Z6157CcStkPrv != T01SG2_A6157CcStkPrv[0] ) || ( Z11347Ccstkhis != T01SG2_A11347Ccstkhis[0] ) || ( Z12229CCStkDoc != T01SG2_A12229CCStkDoc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12858CCStkNAlb, T01SG2_A12858CCStkNAlb[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z13979CCStkLotFe), GXutil.resetTime(T01SG2_A13979CCStkLotFe[0])) ) || ( Z13980CCstkLotAl != T01SG2_A13980CCstkLotAl[0] ) || ( GXutil.strcmp(Z3345TipMovCc, T01SG2_A3345TipMovCc[0]) != 0 ) || ( Z3839CcoCod != T01SG2_A3839CcoCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z3343CCStkCanE, T01SG2_A3343CCStkCanE[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkCanE");
               GXutil.writeLogRaw("Old: ",Z3343CCStkCanE);
               GXutil.writeLogRaw("Current: ",T01SG2_A3343CCStkCanE[0]);
            }
            if ( DecimalUtil.compareTo(Z3344CCStkCanS, T01SG2_A3344CCStkCanS[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkCanS");
               GXutil.writeLogRaw("Old: ",Z3344CCStkCanS);
               GXutil.writeLogRaw("Current: ",T01SG2_A3344CCStkCanS[0]);
            }
            if ( GXutil.strcmp(Z3347CCStkPri, T01SG2_A3347CCStkPri[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkPri");
               GXutil.writeLogRaw("Old: ",Z3347CCStkPri);
               GXutil.writeLogRaw("Current: ",T01SG2_A3347CCStkPri[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3348CCStkFec), GXutil.resetTime(T01SG2_A3348CCStkFec[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkFec");
               GXutil.writeLogRaw("Old: ",Z3348CCStkFec);
               GXutil.writeLogRaw("Current: ",T01SG2_A3348CCStkFec[0]);
            }
            if ( DecimalUtil.compareTo(Z3349CCStkPre, T01SG2_A3349CCStkPre[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkPre");
               GXutil.writeLogRaw("Old: ",Z3349CCStkPre);
               GXutil.writeLogRaw("Current: ",T01SG2_A3349CCStkPre[0]);
            }
            if ( Z3350CCStkBar != T01SG2_A3350CCStkBar[0] )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkBar");
               GXutil.writeLogRaw("Old: ",Z3350CCStkBar);
               GXutil.writeLogRaw("Current: ",T01SG2_A3350CCStkBar[0]);
            }
            if ( Z3351CCStkReo != T01SG2_A3351CCStkReo[0] )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkReo");
               GXutil.writeLogRaw("Old: ",Z3351CCStkReo);
               GXutil.writeLogRaw("Current: ",T01SG2_A3351CCStkReo[0]);
            }
            if ( GXutil.strcmp(Z3352CCStkPar, T01SG2_A3352CCStkPar[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkPar");
               GXutil.writeLogRaw("Old: ",Z3352CCStkPar);
               GXutil.writeLogRaw("Current: ",T01SG2_A3352CCStkPar[0]);
            }
            if ( Z3353CCStkPed != T01SG2_A3353CCStkPed[0] )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkPed");
               GXutil.writeLogRaw("Old: ",Z3353CCStkPed);
               GXutil.writeLogRaw("Current: ",T01SG2_A3353CCStkPed[0]);
            }
            if ( GXutil.strcmp(Z3354CCStkAlb, T01SG2_A3354CCStkAlb[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkAlb");
               GXutil.writeLogRaw("Old: ",Z3354CCStkAlb);
               GXutil.writeLogRaw("Current: ",T01SG2_A3354CCStkAlb[0]);
            }
            if ( GXutil.strcmp(Z3355CCStkUsu, T01SG2_A3355CCStkUsu[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkUsu");
               GXutil.writeLogRaw("Old: ",Z3355CCStkUsu);
               GXutil.writeLogRaw("Current: ",T01SG2_A3355CCStkUsu[0]);
            }
            if ( GXutil.strcmp(Z3356CCStkHor, T01SG2_A3356CCStkHor[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkHor");
               GXutil.writeLogRaw("Old: ",Z3356CCStkHor);
               GXutil.writeLogRaw("Current: ",T01SG2_A3356CCStkHor[0]);
            }
            if ( GXutil.strcmp(Z3357CCStkDsc, T01SG2_A3357CCStkDsc[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkDsc");
               GXutil.writeLogRaw("Old: ",Z3357CCStkDsc);
               GXutil.writeLogRaw("Current: ",T01SG2_A3357CCStkDsc[0]);
            }
            if ( Z3358CCStkLen != T01SG2_A3358CCStkLen[0] )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkLen");
               GXutil.writeLogRaw("Old: ",Z3358CCStkLen);
               GXutil.writeLogRaw("Current: ",T01SG2_A3358CCStkLen[0]);
            }
            if ( GXutil.strcmp(Z5722CCStkLot, T01SG2_A5722CCStkLot[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkLot");
               GXutil.writeLogRaw("Old: ",Z5722CCStkLot);
               GXutil.writeLogRaw("Current: ",T01SG2_A5722CCStkLot[0]);
            }
            if ( Z6834CCStkExp != T01SG2_A6834CCStkExp[0] )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkExp");
               GXutil.writeLogRaw("Old: ",Z6834CCStkExp);
               GXutil.writeLogRaw("Current: ",T01SG2_A6834CCStkExp[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z6835CCStkExpF), GXutil.resetTime(T01SG2_A6835CCStkExpF[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkExpF");
               GXutil.writeLogRaw("Old: ",Z6835CCStkExpF);
               GXutil.writeLogRaw("Current: ",T01SG2_A6835CCStkExpF[0]);
            }
            if ( Z6157CcStkPrv != T01SG2_A6157CcStkPrv[0] )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CcStkPrv");
               GXutil.writeLogRaw("Old: ",Z6157CcStkPrv);
               GXutil.writeLogRaw("Current: ",T01SG2_A6157CcStkPrv[0]);
            }
            if ( Z11347Ccstkhis != T01SG2_A11347Ccstkhis[0] )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"Ccstkhis");
               GXutil.writeLogRaw("Old: ",Z11347Ccstkhis);
               GXutil.writeLogRaw("Current: ",T01SG2_A11347Ccstkhis[0]);
            }
            if ( Z12229CCStkDoc != T01SG2_A12229CCStkDoc[0] )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkDoc");
               GXutil.writeLogRaw("Old: ",Z12229CCStkDoc);
               GXutil.writeLogRaw("Current: ",T01SG2_A12229CCStkDoc[0]);
            }
            if ( GXutil.strcmp(Z12858CCStkNAlb, T01SG2_A12858CCStkNAlb[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkNAlb");
               GXutil.writeLogRaw("Old: ",Z12858CCStkNAlb);
               GXutil.writeLogRaw("Current: ",T01SG2_A12858CCStkNAlb[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13979CCStkLotFe), GXutil.resetTime(T01SG2_A13979CCStkLotFe[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCStkLotFe");
               GXutil.writeLogRaw("Old: ",Z13979CCStkLotFe);
               GXutil.writeLogRaw("Current: ",T01SG2_A13979CCStkLotFe[0]);
            }
            if ( Z13980CCstkLotAl != T01SG2_A13980CCstkLotAl[0] )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CCstkLotAl");
               GXutil.writeLogRaw("Old: ",Z13980CCstkLotAl);
               GXutil.writeLogRaw("Current: ",T01SG2_A13980CCstkLotAl[0]);
            }
            if ( GXutil.strcmp(Z3345TipMovCc, T01SG2_A3345TipMovCc[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"TipMovCc");
               GXutil.writeLogRaw("Old: ",Z3345TipMovCc);
               GXutil.writeLogRaw("Current: ",T01SG2_A3345TipMovCc[0]);
            }
            if ( Z3839CcoCod != T01SG2_A3839CcoCod[0] )
            {
               GXutil.writeLogln("stocksquimicos.upq_cuentacorriente_trn:[seudo value changed for attri]"+"CcoCod");
               GXutil.writeLogRaw("Old: ",Z3839CcoCod);
               GXutil.writeLogRaw("Current: ",T01SG2_A3839CcoCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCSTKS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SG484( )
   {
      beforeValidate1SG484( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SG484( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SG484( 0) ;
         checkOptimisticConcurrency1SG484( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SG484( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SG484( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SG16 */
                  pr_default.execute(14, new Object[] {Long.valueOf(A3342CCStkLin), A3343CCStkCanE, A3344CCStkCanS, A3347CCStkPri, A3348CCStkFec, A3349CCStkPre, Integer.valueOf(A3350CCStkBar), Byte.valueOf(A3351CCStkReo), A3352CCStkPar, Integer.valueOf(A3353CCStkPed), A3354CCStkAlb, A3355CCStkUsu, A3356CCStkHor, A3357CCStkDsc, Short.valueOf(A3358CCStkLen), A5722CCStkLot, Byte.valueOf(A6834CCStkExp), A6835CCStkExpF, Integer.valueOf(A6157CcStkPrv), Byte.valueOf(A11347Ccstkhis), Long.valueOf(A12229CCStkDoc), A12858CCStkNAlb, A13979CCStkLotFe, Short.valueOf(A13980CCstkLotAl), A396EmprCod, A719PrdNum, A3345TipMovCc, Short.valueOf(A3839CcoCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
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
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1SG0( ) ;
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
            load1SG484( ) ;
         }
         endLevel1SG484( ) ;
      }
      closeExtendedTableCursors1SG484( ) ;
   }

   public void update1SG484( )
   {
      beforeValidate1SG484( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SG484( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SG484( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SG484( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SG484( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SG17 */
                  pr_default.execute(15, new Object[] {A3343CCStkCanE, A3344CCStkCanS, A3347CCStkPri, A3348CCStkFec, A3349CCStkPre, Integer.valueOf(A3350CCStkBar), Byte.valueOf(A3351CCStkReo), A3352CCStkPar, Integer.valueOf(A3353CCStkPed), A3354CCStkAlb, A3355CCStkUsu, A3356CCStkHor, A3357CCStkDsc, Short.valueOf(A3358CCStkLen), A5722CCStkLot, Byte.valueOf(A6834CCStkExp), A6835CCStkExpF, Integer.valueOf(A6157CcStkPrv), Byte.valueOf(A11347Ccstkhis), Long.valueOf(A12229CCStkDoc), A12858CCStkNAlb, A13979CCStkLotFe, Short.valueOf(A13980CCstkLotAl), A3345TipMovCc, Short.valueOf(A3839CcoCod), A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCSTKS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SG484( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1SG0( ) ;
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
         endLevel1SG484( ) ;
      }
      closeExtendedTableCursors1SG484( ) ;
   }

   public void deferredUpdate1SG484( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1SG484( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SG484( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SG484( ) ;
         afterConfirm1SG484( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SG484( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SG18 */
               pr_default.execute(16, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound484 == 0 )
                     {
                        initAll1SG484( ) ;
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
                     resetCaption1SG0( ) ;
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
      sMode484 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SG484( ) ;
      Gx_mode = sMode484 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SG484( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SG19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T01SG19_A407EmprNom[0] ;
         n407EmprNom = T01SG19_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3915EmpNumDec = T01SG19_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01SG19_n3915EmpNumDec[0] ;
         pr_default.close(17);
         /* Using cursor T01SG20 */
         pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01SG20_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A3341CCStKULin = T01SG20_A3341CCStKULin[0] ;
         n3341CCStKULin = T01SG20_n3341CCStKULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3341CCStKULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3341CCStKULin), 12, 0));
         A704PrdExiAlm = T01SG20_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         pr_default.close(18);
         /* Using cursor T01SG21 */
         pr_default.execute(19, new Object[] {A396EmprCod, A3345TipMovCc});
         A3346TipMovCn = T01SG21_A3346TipMovCn[0] ;
         n3346TipMovCn = T01SG21_n3346TipMovCn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
         pr_default.close(19);
         A3916ValorEI = A3343CCStkCanE.multiply(A3349CCStkPre) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3916ValorEI", GXutil.ltrimstr( A3916ValorEI, 14, 5));
         if ( A3915EmpNumDec == 0 )
         {
            A3909ValorE = GXutil.roundDecimal( A3916ValorEI, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               A3909ValorE = GXutil.roundDecimal( A3916ValorEI, 2) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
            }
            else
            {
               A3909ValorE = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
            }
         }
         A3917ValorSI = A3344CCStkCanS.multiply(A3349CCStkPre) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3917ValorSI", GXutil.ltrimstr( A3917ValorSI, 14, 5));
         if ( A3915EmpNumDec == 0 )
         {
            A3910ValorS = GXutil.roundDecimal( A3917ValorSI, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               A3910ValorS = GXutil.roundDecimal( A3917ValorSI, 2) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
            }
            else
            {
               A3910ValorS = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
            }
         }
      }
   }

   public void endLevel1SG484( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SG484( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.upq_cuentacorriente_trn");
         if ( AnyError == 0 )
         {
            confirmValues1SG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.upq_cuentacorriente_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SG484( )
   {
      /* Using cursor T01SG22 */
      pr_default.execute(20);
      RcdFound484 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound484 = (short)(1) ;
         A396EmprCod = T01SG22_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01SG22_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A3342CCStkLin = T01SG22_A3342CCStkLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SG484( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound484 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound484 = (short)(1) ;
         A396EmprCod = T01SG22_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01SG22_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A3342CCStkLin = T01SG22_A3342CCStkLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
      }
   }

   public void scanEnd1SG484( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1SG484( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SG484( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SG484( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SG484( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SG484( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SG484( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SG484( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtCCStKULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStKULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStKULin_Enabled), 5, 0), true);
      edtCCStkLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkLin_Enabled), 5, 0), true);
      edtCCStkCanE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkCanE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkCanE_Enabled), 5, 0), true);
      edtCCStkCanS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkCanS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkCanS_Enabled), 5, 0), true);
      edtTipMovCc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMovCc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCc_Enabled), 5, 0), true);
      edtTipMovCn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMovCn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCn_Enabled), 5, 0), true);
      edtCCStkPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkPri_Enabled), 5, 0), true);
      edtCCStkFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkFec_Enabled), 5, 0), true);
      edtCCStkPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkPre_Enabled), 5, 0), true);
      edtCCStkBar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkBar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkBar_Enabled), 5, 0), true);
      edtCCStkReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkReo_Enabled), 5, 0), true);
      edtCCStkPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkPar_Enabled), 5, 0), true);
      edtCCStkPed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkPed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkPed_Enabled), 5, 0), true);
      edtCCStkAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkAlb_Enabled), 5, 0), true);
      edtCCStkUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkUsu_Enabled), 5, 0), true);
      edtCCStkHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkHor_Enabled), 5, 0), true);
      edtCCStkDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkDsc_Enabled), 5, 0), true);
      edtCCStkLen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkLen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkLen_Enabled), 5, 0), true);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      edtCcoCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcoCod_Enabled), 5, 0), true);
      edtValorE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValorE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValorE_Enabled), 5, 0), true);
      edtValorS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValorS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValorS_Enabled), 5, 0), true);
      edtValorEI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValorEI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValorEI_Enabled), 5, 0), true);
      edtValorSI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValorSI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValorSI_Enabled), 5, 0), true);
      edtCCStkLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkLot_Enabled), 5, 0), true);
      edtCCStkExp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkExp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkExp_Enabled), 5, 0), true);
      edtCCStkExpF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkExpF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkExpF_Enabled), 5, 0), true);
      edtCcStkPrv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcStkPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcStkPrv_Enabled), 5, 0), true);
      edtCcstkhis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcstkhis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcstkhis_Enabled), 5, 0), true);
      edtCCStkDoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkDoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkDoc_Enabled), 5, 0), true);
      edtCCStkNAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkNAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkNAlb_Enabled), 5, 0), true);
      edtCCStkLotFe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkLotFe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkLotFe_Enabled), 5, 0), true);
      edtCCstkLotAl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCstkLotAl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCstkLotAl_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1SG484( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1SG0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.upq_cuentacorriente_trn", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3342CCStkLin", GXutil.ltrim( localUtil.ntoc( Z3342CCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3343CCStkCanE", GXutil.ltrim( localUtil.ntoc( Z3343CCStkCanE, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3344CCStkCanS", GXutil.ltrim( localUtil.ntoc( Z3344CCStkCanS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3347CCStkPri", GXutil.rtrim( Z3347CCStkPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3348CCStkFec", localUtil.dtoc( Z3348CCStkFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3349CCStkPre", GXutil.ltrim( localUtil.ntoc( Z3349CCStkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3350CCStkBar", GXutil.ltrim( localUtil.ntoc( Z3350CCStkBar, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3351CCStkReo", GXutil.ltrim( localUtil.ntoc( Z3351CCStkReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3352CCStkPar", GXutil.rtrim( Z3352CCStkPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3353CCStkPed", GXutil.ltrim( localUtil.ntoc( Z3353CCStkPed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3354CCStkAlb", GXutil.rtrim( Z3354CCStkAlb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3355CCStkUsu", GXutil.rtrim( Z3355CCStkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3356CCStkHor", GXutil.rtrim( Z3356CCStkHor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3357CCStkDsc", GXutil.rtrim( Z3357CCStkDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3358CCStkLen", GXutil.ltrim( localUtil.ntoc( Z3358CCStkLen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5722CCStkLot", GXutil.rtrim( Z5722CCStkLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6834CCStkExp", GXutil.ltrim( localUtil.ntoc( Z6834CCStkExp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6835CCStkExpF", localUtil.dtoc( Z6835CCStkExpF, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6157CcStkPrv", GXutil.ltrim( localUtil.ntoc( Z6157CcStkPrv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11347Ccstkhis", GXutil.ltrim( localUtil.ntoc( Z11347Ccstkhis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12229CCStkDoc", GXutil.ltrim( localUtil.ntoc( Z12229CCStkDoc, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12858CCStkNAlb", GXutil.rtrim( Z12858CCStkNAlb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13979CCStkLotFe", localUtil.dtoc( Z13979CCStkLotFe, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13980CCstkLotAl", GXutil.ltrim( localUtil.ntoc( Z13980CCstkLotAl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3345TipMovCc", GXutil.rtrim( Z3345TipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3839CcoCod", GXutil.ltrim( localUtil.ntoc( Z3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPNUMDEC", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.stocksquimicos.upq_cuentacorriente_trn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.UPQ_CuentaCorriente_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "UPQ_Cuenta CorrienteTRN", "") ;
   }

   public void initializeNonKey1SG484( )
   {
      A3910ValorS = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
      A3909ValorE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
      A3917ValorSI = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3917ValorSI", GXutil.ltrimstr( A3917ValorSI, 14, 5));
      A3916ValorEI = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3916ValorEI", GXutil.ltrimstr( A3916ValorEI, 14, 5));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A3341CCStKULin = 0 ;
      n3341CCStKULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3341CCStKULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3341CCStKULin), 12, 0));
      A3343CCStkCanE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3343CCStkCanE", GXutil.ltrimstr( A3343CCStkCanE, 12, 4));
      A3344CCStkCanS = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3344CCStkCanS", GXutil.ltrimstr( A3344CCStkCanS, 12, 4));
      A3345TipMovCc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
      A3346TipMovCn = "" ;
      n3346TipMovCn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
      A3347CCStkPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3347CCStkPri", A3347CCStkPri);
      A3348CCStkFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A3348CCStkFec", localUtil.format(A3348CCStkFec, "99/99/99"));
      A3349CCStkPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3349CCStkPre", GXutil.ltrimstr( A3349CCStkPre, 14, 5));
      A3350CCStkBar = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3350CCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3350CCStkBar), 8, 0));
      A3351CCStkReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3351CCStkReo", GXutil.str( A3351CCStkReo, 1, 0));
      A3352CCStkPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3352CCStkPar", A3352CCStkPar);
      A3353CCStkPed = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3353CCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3353CCStkPed), 8, 0));
      A3354CCStkAlb = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3354CCStkAlb", A3354CCStkAlb);
      A3355CCStkUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3355CCStkUsu", A3355CCStkUsu);
      A3356CCStkHor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3356CCStkHor", A3356CCStkHor);
      A3357CCStkDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3357CCStkDsc", A3357CCStkDsc);
      A3358CCStkLen = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3358CCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3358CCStkLen), 4, 0));
      A704PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A3839CcoCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
      A5722CCStkLot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5722CCStkLot", A5722CCStkLot);
      A6834CCStkExp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6834CCStkExp", GXutil.str( A6834CCStkExp, 1, 0));
      A6835CCStkExpF = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A6835CCStkExpF", localUtil.format(A6835CCStkExpF, "99/99/99"));
      A6157CcStkPrv = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6157CcStkPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6157CcStkPrv), 6, 0));
      A11347Ccstkhis = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11347Ccstkhis", GXutil.str( A11347Ccstkhis, 1, 0));
      A12229CCStkDoc = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12229CCStkDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12229CCStkDoc), 10, 0));
      A12858CCStkNAlb = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12858CCStkNAlb", A12858CCStkNAlb);
      A13979CCStkLotFe = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A13979CCStkLotFe", localUtil.format(A13979CCStkLotFe, "99/99/99"));
      A13980CCstkLotAl = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13980CCstkLotAl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13980CCstkLotAl), 4, 0));
      A3915EmpNumDec = (byte)(0) ;
      n3915EmpNumDec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      Z3343CCStkCanE = DecimalUtil.ZERO ;
      Z3344CCStkCanS = DecimalUtil.ZERO ;
      Z3347CCStkPri = "" ;
      Z3348CCStkFec = GXutil.nullDate() ;
      Z3349CCStkPre = DecimalUtil.ZERO ;
      Z3350CCStkBar = 0 ;
      Z3351CCStkReo = (byte)(0) ;
      Z3352CCStkPar = "" ;
      Z3353CCStkPed = 0 ;
      Z3354CCStkAlb = "" ;
      Z3355CCStkUsu = "" ;
      Z3356CCStkHor = "" ;
      Z3357CCStkDsc = "" ;
      Z3358CCStkLen = (short)(0) ;
      Z5722CCStkLot = "" ;
      Z6834CCStkExp = (byte)(0) ;
      Z6835CCStkExpF = GXutil.nullDate() ;
      Z6157CcStkPrv = 0 ;
      Z11347Ccstkhis = (byte)(0) ;
      Z12229CCStkDoc = 0 ;
      Z12858CCStkNAlb = "" ;
      Z13979CCStkLotFe = GXutil.nullDate() ;
      Z13980CCstkLotAl = (short)(0) ;
      Z3345TipMovCc = "" ;
      Z3839CcoCod = (short)(0) ;
   }

   public void initAll1SG484( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3342CCStkLin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
      initializeNonKey1SG484( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415114889", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/upq_cuentacorriente_trn.js", "?202682415114890", false, true);
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
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtCCStKULin_Internalname = "CCSTKULIN" ;
      edtCCStkLin_Internalname = "CCSTKLIN" ;
      edtCCStkCanE_Internalname = "CCSTKCANE" ;
      edtCCStkCanS_Internalname = "CCSTKCANS" ;
      edtTipMovCc_Internalname = "TIPMOVCC" ;
      edtTipMovCn_Internalname = "TIPMOVCN" ;
      edtCCStkPri_Internalname = "CCSTKPRI" ;
      edtCCStkFec_Internalname = "CCSTKFEC" ;
      edtCCStkPre_Internalname = "CCSTKPRE" ;
      edtCCStkBar_Internalname = "CCSTKBAR" ;
      edtCCStkReo_Internalname = "CCSTKREO" ;
      edtCCStkPar_Internalname = "CCSTKPAR" ;
      edtCCStkPed_Internalname = "CCSTKPED" ;
      edtCCStkAlb_Internalname = "CCSTKALB" ;
      edtCCStkUsu_Internalname = "CCSTKUSU" ;
      edtCCStkHor_Internalname = "CCSTKHOR" ;
      edtCCStkDsc_Internalname = "CCSTKDSC" ;
      edtCCStkLen_Internalname = "CCSTKLEN" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtCcoCod_Internalname = "CCOCOD" ;
      edtValorE_Internalname = "VALORE" ;
      edtValorS_Internalname = "VALORS" ;
      edtValorEI_Internalname = "VALOREI" ;
      edtValorSI_Internalname = "VALORSI" ;
      edtCCStkLot_Internalname = "CCSTKLOT" ;
      edtCCStkExp_Internalname = "CCSTKEXP" ;
      edtCCStkExpF_Internalname = "CCSTKEXPF" ;
      edtCcStkPrv_Internalname = "CCSTKPRV" ;
      edtCcstkhis_Internalname = "CCSTKHIS" ;
      edtCCStkDoc_Internalname = "CCSTKDOC" ;
      edtCCStkNAlb_Internalname = "CCSTKNALB" ;
      edtCCStkLotFe_Internalname = "CCSTKLOTFE" ;
      edtCCstkLotAl_Internalname = "CCSTKLOTAL" ;
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
      Form.setCaption( httpContext.getMessage( "UPQ_Cuenta CorrienteTRN", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCCstkLotAl_Jsonclick = "" ;
      edtCCstkLotAl_Enabled = 1 ;
      edtCCStkLotFe_Jsonclick = "" ;
      edtCCStkLotFe_Enabled = 1 ;
      edtCCStkNAlb_Jsonclick = "" ;
      edtCCStkNAlb_Enabled = 1 ;
      edtCCStkDoc_Jsonclick = "" ;
      edtCCStkDoc_Enabled = 1 ;
      edtCcstkhis_Jsonclick = "" ;
      edtCcstkhis_Enabled = 1 ;
      edtCcStkPrv_Jsonclick = "" ;
      edtCcStkPrv_Enabled = 1 ;
      edtCCStkExpF_Jsonclick = "" ;
      edtCCStkExpF_Enabled = 1 ;
      edtCCStkExp_Jsonclick = "" ;
      edtCCStkExp_Enabled = 1 ;
      edtCCStkLot_Jsonclick = "" ;
      edtCCStkLot_Enabled = 1 ;
      edtValorSI_Jsonclick = "" ;
      edtValorSI_Enabled = 0 ;
      edtValorEI_Jsonclick = "" ;
      edtValorEI_Enabled = 0 ;
      edtValorS_Jsonclick = "" ;
      edtValorS_Enabled = 0 ;
      edtValorE_Jsonclick = "" ;
      edtValorE_Enabled = 0 ;
      edtCcoCod_Jsonclick = "" ;
      edtCcoCod_Enabled = 1 ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdExiAlm_Enabled = 0 ;
      edtCCStkLen_Jsonclick = "" ;
      edtCCStkLen_Enabled = 1 ;
      edtCCStkDsc_Jsonclick = "" ;
      edtCCStkDsc_Enabled = 1 ;
      edtCCStkHor_Jsonclick = "" ;
      edtCCStkHor_Enabled = 1 ;
      edtCCStkUsu_Jsonclick = "" ;
      edtCCStkUsu_Enabled = 1 ;
      edtCCStkAlb_Jsonclick = "" ;
      edtCCStkAlb_Enabled = 1 ;
      edtCCStkPed_Jsonclick = "" ;
      edtCCStkPed_Enabled = 1 ;
      edtCCStkPar_Jsonclick = "" ;
      edtCCStkPar_Enabled = 1 ;
      edtCCStkReo_Jsonclick = "" ;
      edtCCStkReo_Enabled = 1 ;
      edtCCStkBar_Jsonclick = "" ;
      edtCCStkBar_Enabled = 1 ;
      edtCCStkPre_Jsonclick = "" ;
      edtCCStkPre_Enabled = 1 ;
      edtCCStkFec_Jsonclick = "" ;
      edtCCStkFec_Enabled = 1 ;
      edtCCStkPri_Jsonclick = "" ;
      edtCCStkPri_Enabled = 1 ;
      edtTipMovCn_Jsonclick = "" ;
      edtTipMovCn_Enabled = 0 ;
      edtTipMovCc_Jsonclick = "" ;
      edtTipMovCc_Enabled = 1 ;
      edtCCStkCanS_Jsonclick = "" ;
      edtCCStkCanS_Enabled = 1 ;
      edtCCStkCanE_Jsonclick = "" ;
      edtCCStkCanE_Enabled = 1 ;
      edtCCStkLin_Jsonclick = "" ;
      edtCCStkLin_Enabled = 1 ;
      edtCCStKULin_Jsonclick = "" ;
      edtCCStKULin_Enabled = 0 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
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
      /* Using cursor T01SG19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SG19_A407EmprNom[0] ;
      n407EmprNom = T01SG19_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T01SG19_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01SG19_n3915EmpNumDec[0] ;
      pr_default.close(17);
      /* Using cursor T01SG20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SG20_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A3341CCStKULin = T01SG20_A3341CCStKULin[0] ;
      n3341CCStKULin = T01SG20_n3341CCStKULin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3341CCStKULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3341CCStKULin), 12, 0));
      A704PrdExiAlm = T01SG20_A704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      pr_default.close(18);
      GX_FocusControl = edtCCStkCanE_Internalname ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      n3915EmpNumDec = false ;
      /* Using cursor T01SG19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01SG19_A407EmprNom[0] ;
      n407EmprNom = T01SG19_n407EmprNom[0] ;
      A3915EmpNumDec = T01SG19_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01SG19_n3915EmpNumDec[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Prdnum( )
   {
      n3341CCStKULin = false ;
      /* Using cursor T01SG20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A718PrdNom = T01SG20_A718PrdNom[0] ;
      A3341CCStKULin = T01SG20_A3341CCStKULin[0] ;
      n3341CCStKULin = T01SG20_n3341CCStKULin[0] ;
      A704PrdExiAlm = T01SG20_A704PrdExiAlm[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3341CCStKULin", GXutil.ltrim( localUtil.ntoc( A3341CCStKULin, (byte)(12), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
   }

   public void valid_Ccstklin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3343CCStkCanE", GXutil.ltrim( localUtil.ntoc( A3343CCStkCanE, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3344CCStkCanS", GXutil.ltrim( localUtil.ntoc( A3344CCStkCanS, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", GXutil.rtrim( A3345TipMovCc));
      httpContext.ajax_rsp_assign_attri("", false, "A3347CCStkPri", GXutil.rtrim( A3347CCStkPri));
      httpContext.ajax_rsp_assign_attri("", false, "A3348CCStkFec", localUtil.format(A3348CCStkFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A3349CCStkPre", GXutil.ltrim( localUtil.ntoc( A3349CCStkPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3350CCStkBar", GXutil.ltrim( localUtil.ntoc( A3350CCStkBar, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3351CCStkReo", GXutil.ltrim( localUtil.ntoc( A3351CCStkReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3352CCStkPar", GXutil.rtrim( A3352CCStkPar));
      httpContext.ajax_rsp_assign_attri("", false, "A3353CCStkPed", GXutil.ltrim( localUtil.ntoc( A3353CCStkPed, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3354CCStkAlb", GXutil.rtrim( A3354CCStkAlb));
      httpContext.ajax_rsp_assign_attri("", false, "A3355CCStkUsu", GXutil.rtrim( A3355CCStkUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A3356CCStkHor", GXutil.rtrim( A3356CCStkHor));
      httpContext.ajax_rsp_assign_attri("", false, "A3357CCStkDsc", GXutil.rtrim( A3357CCStkDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A3358CCStkLen", GXutil.ltrim( localUtil.ntoc( A3358CCStkLen, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5722CCStkLot", GXutil.rtrim( A5722CCStkLot));
      httpContext.ajax_rsp_assign_attri("", false, "A6834CCStkExp", GXutil.ltrim( localUtil.ntoc( A6834CCStkExp, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6835CCStkExpF", localUtil.format(A6835CCStkExpF, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A6157CcStkPrv", GXutil.ltrim( localUtil.ntoc( A6157CcStkPrv, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11347Ccstkhis", GXutil.ltrim( localUtil.ntoc( A11347Ccstkhis, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12229CCStkDoc", GXutil.ltrim( localUtil.ntoc( A12229CCStkDoc, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12858CCStkNAlb", GXutil.rtrim( A12858CCStkNAlb));
      httpContext.ajax_rsp_assign_attri("", false, "A13979CCStkLotFe", localUtil.format(A13979CCStkLotFe, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A13980CCstkLotAl", GXutil.ltrim( localUtil.ntoc( A13980CCstkLotAl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", GXutil.rtrim( A3346TipMovCn));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3341CCStKULin", GXutil.ltrim( localUtil.ntoc( A3341CCStKULin, (byte)(12), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3916ValorEI", GXutil.ltrim( localUtil.ntoc( A3916ValorEI, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3909ValorE", GXutil.ltrim( localUtil.ntoc( A3909ValorE, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3917ValorSI", GXutil.ltrim( localUtil.ntoc( A3917ValorSI, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3910ValorS", GXutil.ltrim( localUtil.ntoc( A3910ValorS, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3342CCStkLin", GXutil.ltrim( localUtil.ntoc( Z3342CCStkLin, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3343CCStkCanE", GXutil.ltrim( localUtil.ntoc( Z3343CCStkCanE, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3344CCStkCanS", GXutil.ltrim( localUtil.ntoc( Z3344CCStkCanS, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3345TipMovCc", GXutil.rtrim( Z3345TipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3347CCStkPri", GXutil.rtrim( Z3347CCStkPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3348CCStkFec", localUtil.format(Z3348CCStkFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3349CCStkPre", GXutil.ltrim( localUtil.ntoc( Z3349CCStkPre, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3350CCStkBar", GXutil.ltrim( localUtil.ntoc( Z3350CCStkBar, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3351CCStkReo", GXutil.ltrim( localUtil.ntoc( Z3351CCStkReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3352CCStkPar", GXutil.rtrim( Z3352CCStkPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3353CCStkPed", GXutil.ltrim( localUtil.ntoc( Z3353CCStkPed, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3354CCStkAlb", GXutil.rtrim( Z3354CCStkAlb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3355CCStkUsu", GXutil.rtrim( Z3355CCStkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3356CCStkHor", GXutil.rtrim( Z3356CCStkHor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3357CCStkDsc", GXutil.rtrim( Z3357CCStkDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3358CCStkLen", GXutil.ltrim( localUtil.ntoc( Z3358CCStkLen, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3839CcoCod", GXutil.ltrim( localUtil.ntoc( Z3839CcoCod, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5722CCStkLot", GXutil.rtrim( Z5722CCStkLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6834CCStkExp", GXutil.ltrim( localUtil.ntoc( Z6834CCStkExp, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6835CCStkExpF", localUtil.format(Z6835CCStkExpF, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6157CcStkPrv", GXutil.ltrim( localUtil.ntoc( Z6157CcStkPrv, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11347Ccstkhis", GXutil.ltrim( localUtil.ntoc( Z11347Ccstkhis, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12229CCStkDoc", GXutil.ltrim( localUtil.ntoc( Z12229CCStkDoc, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12858CCStkNAlb", GXutil.rtrim( Z12858CCStkNAlb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13979CCStkLotFe", localUtil.format(Z13979CCStkLotFe, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13980CCstkLotAl", GXutil.ltrim( localUtil.ntoc( Z13980CCstkLotAl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( Z3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3346TipMovCn", GXutil.rtrim( Z3346TipMovCn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3341CCStKULin", GXutil.ltrim( localUtil.ntoc( Z3341CCStKULin, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3916ValorEI", GXutil.ltrim( localUtil.ntoc( Z3916ValorEI, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3909ValorE", GXutil.ltrim( localUtil.ntoc( Z3909ValorE, (byte)(11), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3917ValorSI", GXutil.ltrim( localUtil.ntoc( Z3917ValorSI, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3910ValorS", GXutil.ltrim( localUtil.ntoc( Z3910ValorS, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Tipmovcc( )
   {
      n3346TipMovCn = false ;
      /* Using cursor T01SG21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A3345TipMovCc});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPMOV", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPMOVCC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A3346TipMovCn = T01SG21_A3346TipMovCn[0] ;
      n3346TipMovCn = T01SG21_n3346TipMovCn[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", GXutil.rtrim( A3346TipMovCn));
   }

   public void valid_Ccocod( )
   {
      /* Using cursor T01SG23 */
      pr_default.execute(21, new Object[] {Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCcoCod_Internalname ;
      }
      pr_default.close(21);
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A3341CCStKULin',fld:'CCSTKULIN',pic:'ZZZZZZZZZZZ9'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A3341CCStKULin',fld:'CCSTKULIN',pic:'ZZZZZZZZZZZ9'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("VALID_CCSTKLIN","{handler:'valid_Ccstklin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_CCSTKLIN",",oparms:[{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3347CCStkPri',fld:'CCSTKPRI',pic:'9'},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3354CCStkAlb',fld:'CCSTKALB',pic:''},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3839CcoCod',fld:'CCOCOD',pic:'ZZ9'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A6834CCStkExp',fld:'CCSTKEXP',pic:'9'},{av:'A6835CCStkExpF',fld:'CCSTKEXPF',pic:''},{av:'A6157CcStkPrv',fld:'CCSTKPRV',pic:'ZZZZZ9'},{av:'A11347Ccstkhis',fld:'CCSTKHIS',pic:'9'},{av:'A12229CCStkDoc',fld:'CCSTKDOC',pic:'ZZZZZZZZZ9'},{av:'A12858CCStkNAlb',fld:'CCSTKNALB',pic:''},{av:'A13979CCStkLotFe',fld:'CCSTKLOTFE',pic:''},{av:'A13980CCstkLotAl',fld:'CCSTKLOTAL',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'},{av:'A3346TipMovCn',fld:'TIPMOVCN',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A3341CCStKULin',fld:'CCSTKULIN',pic:'ZZZZZZZZZZZ9'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A3916ValorEI',fld:'VALOREI',pic:'ZZZZZZZ9.99999'},{av:'A3909ValorE',fld:'VALORE',pic:'ZZZZZZZ9.99'},{av:'A3917ValorSI',fld:'VALORSI',pic:'ZZZZZZZ9.99999'},{av:'A3910ValorS',fld:'VALORS',pic:'ZZZZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z3342CCStkLin'},{av:'Z3343CCStkCanE'},{av:'Z3344CCStkCanS'},{av:'Z3345TipMovCc'},{av:'Z3347CCStkPri'},{av:'Z3348CCStkFec'},{av:'Z3349CCStkPre'},{av:'Z3350CCStkBar'},{av:'Z3351CCStkReo'},{av:'Z3352CCStkPar'},{av:'Z3353CCStkPed'},{av:'Z3354CCStkAlb'},{av:'Z3355CCStkUsu'},{av:'Z3356CCStkHor'},{av:'Z3357CCStkDsc'},{av:'Z3358CCStkLen'},{av:'Z3839CcoCod'},{av:'Z5722CCStkLot'},{av:'Z6834CCStkExp'},{av:'Z6835CCStkExpF'},{av:'Z6157CcStkPrv'},{av:'Z11347Ccstkhis'},{av:'Z12229CCStkDoc'},{av:'Z12858CCStkNAlb'},{av:'Z13979CCStkLotFe'},{av:'Z13980CCstkLotAl'},{av:'Z407EmprNom'},{av:'Z3915EmpNumDec'},{av:'Z3346TipMovCn'},{av:'Z718PrdNom'},{av:'Z3341CCStKULin'},{av:'Z704PrdExiAlm'},{av:'Z3916ValorEI'},{av:'Z3909ValorE'},{av:'Z3917ValorSI'},{av:'Z3910ValorS'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_CCSTKCANE","{handler:'valid_Ccstkcane',iparms:[]");
      setEventMetadata("VALID_CCSTKCANE",",oparms:[]}");
      setEventMetadata("VALID_CCSTKCANS","{handler:'valid_Ccstkcans',iparms:[]");
      setEventMetadata("VALID_CCSTKCANS",",oparms:[]}");
      setEventMetadata("VALID_TIPMOVCC","{handler:'valid_Tipmovcc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3346TipMovCn',fld:'TIPMOVCN',pic:''}]");
      setEventMetadata("VALID_TIPMOVCC",",oparms:[{av:'A3346TipMovCn',fld:'TIPMOVCN',pic:''}]}");
      setEventMetadata("VALID_CCSTKPRI","{handler:'valid_Ccstkpri',iparms:[]");
      setEventMetadata("VALID_CCSTKPRI",",oparms:[]}");
      setEventMetadata("VALID_CCSTKPRE","{handler:'valid_Ccstkpre',iparms:[]");
      setEventMetadata("VALID_CCSTKPRE",",oparms:[]}");
      setEventMetadata("VALID_CCOCOD","{handler:'valid_Ccocod',iparms:[{av:'A3839CcoCod',fld:'CCOCOD',pic:'ZZ9'}]");
      setEventMetadata("VALID_CCOCOD",",oparms:[]}");
      setEventMetadata("VALID_VALOREI","{handler:'valid_Valorei',iparms:[]");
      setEventMetadata("VALID_VALOREI",",oparms:[]}");
      setEventMetadata("VALID_VALORSI","{handler:'valid_Valorsi',iparms:[]");
      setEventMetadata("VALID_VALORSI",",oparms:[]}");
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
      pr_default.close(17);
      pr_default.close(18);
      pr_default.close(19);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z3343CCStkCanE = DecimalUtil.ZERO ;
      Z3344CCStkCanS = DecimalUtil.ZERO ;
      Z3347CCStkPri = "" ;
      Z3348CCStkFec = GXutil.nullDate() ;
      Z3349CCStkPre = DecimalUtil.ZERO ;
      Z3352CCStkPar = "" ;
      Z3354CCStkAlb = "" ;
      Z3355CCStkUsu = "" ;
      Z3356CCStkHor = "" ;
      Z3357CCStkDsc = "" ;
      Z5722CCStkLot = "" ;
      Z6835CCStkExpF = GXutil.nullDate() ;
      Z12858CCStkNAlb = "" ;
      Z13979CCStkLotFe = GXutil.nullDate() ;
      Z3345TipMovCc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A3345TipMovCc = "" ;
      A719PrdNum = "" ;
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
      A407EmprNom = "" ;
      A718PrdNom = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3346TipMovCn = "" ;
      A3347CCStkPri = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3352CCStkPar = "" ;
      A3354CCStkAlb = "" ;
      A3355CCStkUsu = "" ;
      A3356CCStkHor = "" ;
      A3357CCStkDsc = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A3909ValorE = DecimalUtil.ZERO ;
      A3910ValorS = DecimalUtil.ZERO ;
      A3916ValorEI = DecimalUtil.ZERO ;
      A3917ValorSI = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      A6835CCStkExpF = GXutil.nullDate() ;
      A12858CCStkNAlb = "" ;
      A13979CCStkLotFe = GXutil.nullDate() ;
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
      Z407EmprNom = "" ;
      Z718PrdNom = "" ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z3346TipMovCn = "" ;
      T01SG8_A3342CCStkLin = new long[1] ;
      T01SG8_A407EmprNom = new String[] {""} ;
      T01SG8_n407EmprNom = new boolean[] {false} ;
      T01SG8_A718PrdNom = new String[] {""} ;
      T01SG8_A3341CCStKULin = new long[1] ;
      T01SG8_n3341CCStKULin = new boolean[] {false} ;
      T01SG8_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SG8_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SG8_A3346TipMovCn = new String[] {""} ;
      T01SG8_n3346TipMovCn = new boolean[] {false} ;
      T01SG8_A3347CCStkPri = new String[] {""} ;
      T01SG8_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SG8_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SG8_A3350CCStkBar = new int[1] ;
      T01SG8_A3351CCStkReo = new byte[1] ;
      T01SG8_A3352CCStkPar = new String[] {""} ;
      T01SG8_A3353CCStkPed = new int[1] ;
      T01SG8_A3354CCStkAlb = new String[] {""} ;
      T01SG8_A3355CCStkUsu = new String[] {""} ;
      T01SG8_A3356CCStkHor = new String[] {""} ;
      T01SG8_A3357CCStkDsc = new String[] {""} ;
      T01SG8_A3358CCStkLen = new short[1] ;
      T01SG8_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SG8_A5722CCStkLot = new String[] {""} ;
      T01SG8_A6834CCStkExp = new byte[1] ;
      T01SG8_A6835CCStkExpF = new java.util.Date[] {GXutil.nullDate()} ;
      T01SG8_A6157CcStkPrv = new int[1] ;
      T01SG8_A11347Ccstkhis = new byte[1] ;
      T01SG8_A12229CCStkDoc = new long[1] ;
      T01SG8_A12858CCStkNAlb = new String[] {""} ;
      T01SG8_A13979CCStkLotFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01SG8_A13980CCstkLotAl = new short[1] ;
      T01SG8_A3915EmpNumDec = new byte[1] ;
      T01SG8_n3915EmpNumDec = new boolean[] {false} ;
      T01SG8_A396EmprCod = new String[] {""} ;
      T01SG8_A719PrdNum = new String[] {""} ;
      T01SG8_A3345TipMovCc = new String[] {""} ;
      T01SG8_A3839CcoCod = new short[1] ;
      T01SG4_A407EmprNom = new String[] {""} ;
      T01SG4_n407EmprNom = new boolean[] {false} ;
      T01SG4_A3915EmpNumDec = new byte[1] ;
      T01SG4_n3915EmpNumDec = new boolean[] {false} ;
      T01SG6_A3346TipMovCn = new String[] {""} ;
      T01SG6_n3346TipMovCn = new boolean[] {false} ;
      T01SG5_A718PrdNom = new String[] {""} ;
      T01SG5_A3341CCStKULin = new long[1] ;
      T01SG5_n3341CCStKULin = new boolean[] {false} ;
      T01SG5_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SG7_A3839CcoCod = new short[1] ;
      T01SG9_A407EmprNom = new String[] {""} ;
      T01SG9_n407EmprNom = new boolean[] {false} ;
      T01SG9_A3915EmpNumDec = new byte[1] ;
      T01SG9_n3915EmpNumDec = new boolean[] {false} ;
      T01SG10_A3346TipMovCn = new String[] {""} ;
      T01SG10_n3346TipMovCn = new boolean[] {false} ;
      T01SG11_A718PrdNom = new String[] {""} ;
      T01SG11_A3341CCStKULin = new long[1] ;
      T01SG11_n3341CCStKULin = new boolean[] {false} ;
      T01SG11_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SG12_A3839CcoCod = new short[1] ;
      T01SG13_A396EmprCod = new String[] {""} ;
      T01SG13_A719PrdNum = new String[] {""} ;
      T01SG13_A3342CCStkLin = new long[1] ;
      T01SG3_A3342CCStkLin = new long[1] ;
      T01SG3_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SG3_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SG3_A3347CCStkPri = new String[] {""} ;
      T01SG3_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SG3_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SG3_A3350CCStkBar = new int[1] ;
      T01SG3_A3351CCStkReo = new byte[1] ;
      T01SG3_A3352CCStkPar = new String[] {""} ;
      T01SG3_A3353CCStkPed = new int[1] ;
      T01SG3_A3354CCStkAlb = new String[] {""} ;
      T01SG3_A3355CCStkUsu = new String[] {""} ;
      T01SG3_A3356CCStkHor = new String[] {""} ;
      T01SG3_A3357CCStkDsc = new String[] {""} ;
      T01SG3_A3358CCStkLen = new short[1] ;
      T01SG3_A5722CCStkLot = new String[] {""} ;
      T01SG3_A6834CCStkExp = new byte[1] ;
      T01SG3_A6835CCStkExpF = new java.util.Date[] {GXutil.nullDate()} ;
      T01SG3_A6157CcStkPrv = new int[1] ;
      T01SG3_A11347Ccstkhis = new byte[1] ;
      T01SG3_A12229CCStkDoc = new long[1] ;
      T01SG3_A12858CCStkNAlb = new String[] {""} ;
      T01SG3_A13979CCStkLotFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01SG3_A13980CCstkLotAl = new short[1] ;
      T01SG3_A396EmprCod = new String[] {""} ;
      T01SG3_A719PrdNum = new String[] {""} ;
      T01SG3_A3345TipMovCc = new String[] {""} ;
      T01SG3_A3839CcoCod = new short[1] ;
      sMode484 = "" ;
      T01SG14_A396EmprCod = new String[] {""} ;
      T01SG14_A719PrdNum = new String[] {""} ;
      T01SG14_A3342CCStkLin = new long[1] ;
      T01SG15_A396EmprCod = new String[] {""} ;
      T01SG15_A719PrdNum = new String[] {""} ;
      T01SG15_A3342CCStkLin = new long[1] ;
      T01SG2_A3342CCStkLin = new long[1] ;
      T01SG2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SG2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SG2_A3347CCStkPri = new String[] {""} ;
      T01SG2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SG2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SG2_A3350CCStkBar = new int[1] ;
      T01SG2_A3351CCStkReo = new byte[1] ;
      T01SG2_A3352CCStkPar = new String[] {""} ;
      T01SG2_A3353CCStkPed = new int[1] ;
      T01SG2_A3354CCStkAlb = new String[] {""} ;
      T01SG2_A3355CCStkUsu = new String[] {""} ;
      T01SG2_A3356CCStkHor = new String[] {""} ;
      T01SG2_A3357CCStkDsc = new String[] {""} ;
      T01SG2_A3358CCStkLen = new short[1] ;
      T01SG2_A5722CCStkLot = new String[] {""} ;
      T01SG2_A6834CCStkExp = new byte[1] ;
      T01SG2_A6835CCStkExpF = new java.util.Date[] {GXutil.nullDate()} ;
      T01SG2_A6157CcStkPrv = new int[1] ;
      T01SG2_A11347Ccstkhis = new byte[1] ;
      T01SG2_A12229CCStkDoc = new long[1] ;
      T01SG2_A12858CCStkNAlb = new String[] {""} ;
      T01SG2_A13979CCStkLotFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01SG2_A13980CCstkLotAl = new short[1] ;
      T01SG2_A396EmprCod = new String[] {""} ;
      T01SG2_A719PrdNum = new String[] {""} ;
      T01SG2_A3345TipMovCc = new String[] {""} ;
      T01SG2_A3839CcoCod = new short[1] ;
      T01SG19_A407EmprNom = new String[] {""} ;
      T01SG19_n407EmprNom = new boolean[] {false} ;
      T01SG19_A3915EmpNumDec = new byte[1] ;
      T01SG19_n3915EmpNumDec = new boolean[] {false} ;
      T01SG20_A718PrdNom = new String[] {""} ;
      T01SG20_A3341CCStKULin = new long[1] ;
      T01SG20_n3341CCStKULin = new boolean[] {false} ;
      T01SG20_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SG21_A3346TipMovCn = new String[] {""} ;
      T01SG21_n3346TipMovCn = new boolean[] {false} ;
      T01SG22_A396EmprCod = new String[] {""} ;
      T01SG22_A719PrdNum = new String[] {""} ;
      T01SG22_A3342CCStkLin = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z3916ValorEI = DecimalUtil.ZERO ;
      Z3909ValorE = DecimalUtil.ZERO ;
      Z3917ValorSI = DecimalUtil.ZERO ;
      Z3910ValorS = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ3343CCStkCanE = DecimalUtil.ZERO ;
      ZZ3344CCStkCanS = DecimalUtil.ZERO ;
      ZZ3345TipMovCc = "" ;
      ZZ3347CCStkPri = "" ;
      ZZ3348CCStkFec = GXutil.nullDate() ;
      ZZ3349CCStkPre = DecimalUtil.ZERO ;
      ZZ3352CCStkPar = "" ;
      ZZ3354CCStkAlb = "" ;
      ZZ3355CCStkUsu = "" ;
      ZZ3356CCStkHor = "" ;
      ZZ3357CCStkDsc = "" ;
      ZZ5722CCStkLot = "" ;
      ZZ6835CCStkExpF = GXutil.nullDate() ;
      ZZ12858CCStkNAlb = "" ;
      ZZ13979CCStkLotFe = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ3346TipMovCn = "" ;
      ZZ718PrdNom = "" ;
      ZZ704PrdExiAlm = DecimalUtil.ZERO ;
      ZZ3916ValorEI = DecimalUtil.ZERO ;
      ZZ3909ValorE = DecimalUtil.ZERO ;
      ZZ3917ValorSI = DecimalUtil.ZERO ;
      ZZ3910ValorS = DecimalUtil.ZERO ;
      T01SG23_A3839CcoCod = new short[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_trn__default(),
         new Object[] {
             new Object[] {
            T01SG2_A3342CCStkLin, T01SG2_A3343CCStkCanE, T01SG2_A3344CCStkCanS, T01SG2_A3347CCStkPri, T01SG2_A3348CCStkFec, T01SG2_A3349CCStkPre, T01SG2_A3350CCStkBar, T01SG2_A3351CCStkReo, T01SG2_A3352CCStkPar, T01SG2_A3353CCStkPed,
            T01SG2_A3354CCStkAlb, T01SG2_A3355CCStkUsu, T01SG2_A3356CCStkHor, T01SG2_A3357CCStkDsc, T01SG2_A3358CCStkLen, T01SG2_A5722CCStkLot, T01SG2_A6834CCStkExp, T01SG2_A6835CCStkExpF, T01SG2_A6157CcStkPrv, T01SG2_A11347Ccstkhis,
            T01SG2_A12229CCStkDoc, T01SG2_A12858CCStkNAlb, T01SG2_A13979CCStkLotFe, T01SG2_A13980CCstkLotAl, T01SG2_A396EmprCod, T01SG2_A719PrdNum, T01SG2_A3345TipMovCc, T01SG2_A3839CcoCod
            }
            , new Object[] {
            T01SG3_A3342CCStkLin, T01SG3_A3343CCStkCanE, T01SG3_A3344CCStkCanS, T01SG3_A3347CCStkPri, T01SG3_A3348CCStkFec, T01SG3_A3349CCStkPre, T01SG3_A3350CCStkBar, T01SG3_A3351CCStkReo, T01SG3_A3352CCStkPar, T01SG3_A3353CCStkPed,
            T01SG3_A3354CCStkAlb, T01SG3_A3355CCStkUsu, T01SG3_A3356CCStkHor, T01SG3_A3357CCStkDsc, T01SG3_A3358CCStkLen, T01SG3_A5722CCStkLot, T01SG3_A6834CCStkExp, T01SG3_A6835CCStkExpF, T01SG3_A6157CcStkPrv, T01SG3_A11347Ccstkhis,
            T01SG3_A12229CCStkDoc, T01SG3_A12858CCStkNAlb, T01SG3_A13979CCStkLotFe, T01SG3_A13980CCstkLotAl, T01SG3_A396EmprCod, T01SG3_A719PrdNum, T01SG3_A3345TipMovCc, T01SG3_A3839CcoCod
            }
            , new Object[] {
            T01SG4_A407EmprNom, T01SG4_n407EmprNom, T01SG4_A3915EmpNumDec, T01SG4_n3915EmpNumDec
            }
            , new Object[] {
            T01SG5_A718PrdNom, T01SG5_A3341CCStKULin, T01SG5_n3341CCStKULin, T01SG5_A704PrdExiAlm
            }
            , new Object[] {
            T01SG6_A3346TipMovCn, T01SG6_n3346TipMovCn
            }
            , new Object[] {
            T01SG7_A3839CcoCod
            }
            , new Object[] {
            T01SG8_A3342CCStkLin, T01SG8_A407EmprNom, T01SG8_n407EmprNom, T01SG8_A718PrdNom, T01SG8_A3341CCStKULin, T01SG8_n3341CCStKULin, T01SG8_A3343CCStkCanE, T01SG8_A3344CCStkCanS, T01SG8_A3346TipMovCn, T01SG8_n3346TipMovCn,
            T01SG8_A3347CCStkPri, T01SG8_A3348CCStkFec, T01SG8_A3349CCStkPre, T01SG8_A3350CCStkBar, T01SG8_A3351CCStkReo, T01SG8_A3352CCStkPar, T01SG8_A3353CCStkPed, T01SG8_A3354CCStkAlb, T01SG8_A3355CCStkUsu, T01SG8_A3356CCStkHor,
            T01SG8_A3357CCStkDsc, T01SG8_A3358CCStkLen, T01SG8_A704PrdExiAlm, T01SG8_A5722CCStkLot, T01SG8_A6834CCStkExp, T01SG8_A6835CCStkExpF, T01SG8_A6157CcStkPrv, T01SG8_A11347Ccstkhis, T01SG8_A12229CCStkDoc, T01SG8_A12858CCStkNAlb,
            T01SG8_A13979CCStkLotFe, T01SG8_A13980CCstkLotAl, T01SG8_A3915EmpNumDec, T01SG8_n3915EmpNumDec, T01SG8_A396EmprCod, T01SG8_A719PrdNum, T01SG8_A3345TipMovCc, T01SG8_A3839CcoCod
            }
            , new Object[] {
            T01SG9_A407EmprNom, T01SG9_n407EmprNom, T01SG9_A3915EmpNumDec, T01SG9_n3915EmpNumDec
            }
            , new Object[] {
            T01SG10_A3346TipMovCn, T01SG10_n3346TipMovCn
            }
            , new Object[] {
            T01SG11_A718PrdNom, T01SG11_A3341CCStKULin, T01SG11_n3341CCStKULin, T01SG11_A704PrdExiAlm
            }
            , new Object[] {
            T01SG12_A3839CcoCod
            }
            , new Object[] {
            T01SG13_A396EmprCod, T01SG13_A719PrdNum, T01SG13_A3342CCStkLin
            }
            , new Object[] {
            T01SG14_A396EmprCod, T01SG14_A719PrdNum, T01SG14_A3342CCStkLin
            }
            , new Object[] {
            T01SG15_A396EmprCod, T01SG15_A719PrdNum, T01SG15_A3342CCStkLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SG19_A407EmprNom, T01SG19_n407EmprNom, T01SG19_A3915EmpNumDec, T01SG19_n3915EmpNumDec
            }
            , new Object[] {
            T01SG20_A718PrdNom, T01SG20_A3341CCStKULin, T01SG20_n3341CCStKULin, T01SG20_A704PrdExiAlm
            }
            , new Object[] {
            T01SG21_A3346TipMovCn, T01SG21_n3346TipMovCn
            }
            , new Object[] {
            T01SG22_A396EmprCod, T01SG22_A719PrdNum, T01SG22_A3342CCStkLin
            }
            , new Object[] {
            T01SG23_A3839CcoCod
            }
         }
      );
   }

   private byte Z3351CCStkReo ;
   private byte Z6834CCStkExp ;
   private byte Z11347Ccstkhis ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A3351CCStkReo ;
   private byte A6834CCStkExp ;
   private byte A11347Ccstkhis ;
   private byte A3915EmpNumDec ;
   private byte Z3915EmpNumDec ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ3351CCStkReo ;
   private byte ZZ6834CCStkExp ;
   private byte ZZ11347Ccstkhis ;
   private byte ZZ3915EmpNumDec ;
   private short Z3358CCStkLen ;
   private short Z13980CCstkLotAl ;
   private short Z3839CcoCod ;
   private short A3839CcoCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3358CCStkLen ;
   private short A13980CCstkLotAl ;
   private short RcdFound484 ;
   private short nIsDirty_484 ;
   private short ZZ3358CCStkLen ;
   private short ZZ3839CcoCod ;
   private short ZZ13980CCstkLotAl ;
   private int Z3350CCStkBar ;
   private int Z3353CCStkPed ;
   private int Z6157CcStkPrv ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtCCStKULin_Enabled ;
   private int edtCCStkLin_Enabled ;
   private int edtCCStkCanE_Enabled ;
   private int edtCCStkCanS_Enabled ;
   private int edtTipMovCc_Enabled ;
   private int edtTipMovCn_Enabled ;
   private int edtCCStkPri_Enabled ;
   private int edtCCStkFec_Enabled ;
   private int edtCCStkPre_Enabled ;
   private int A3350CCStkBar ;
   private int edtCCStkBar_Enabled ;
   private int edtCCStkReo_Enabled ;
   private int edtCCStkPar_Enabled ;
   private int A3353CCStkPed ;
   private int edtCCStkPed_Enabled ;
   private int edtCCStkAlb_Enabled ;
   private int edtCCStkUsu_Enabled ;
   private int edtCCStkHor_Enabled ;
   private int edtCCStkDsc_Enabled ;
   private int edtCCStkLen_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtCcoCod_Enabled ;
   private int edtValorE_Enabled ;
   private int edtValorS_Enabled ;
   private int edtValorEI_Enabled ;
   private int edtValorSI_Enabled ;
   private int edtCCStkLot_Enabled ;
   private int edtCCStkExp_Enabled ;
   private int edtCCStkExpF_Enabled ;
   private int A6157CcStkPrv ;
   private int edtCcStkPrv_Enabled ;
   private int edtCcstkhis_Enabled ;
   private int edtCCStkDoc_Enabled ;
   private int edtCCStkNAlb_Enabled ;
   private int edtCCStkLotFe_Enabled ;
   private int edtCCstkLotAl_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ3350CCStkBar ;
   private int ZZ3353CCStkPed ;
   private int ZZ6157CcStkPrv ;
   private long Z3342CCStkLin ;
   private long Z12229CCStkDoc ;
   private long A3341CCStKULin ;
   private long A3342CCStkLin ;
   private long A12229CCStkDoc ;
   private long Z3341CCStKULin ;
   private long ZZ3342CCStkLin ;
   private long ZZ12229CCStkDoc ;
   private long ZZ3341CCStKULin ;
   private java.math.BigDecimal Z3343CCStkCanE ;
   private java.math.BigDecimal Z3344CCStkCanS ;
   private java.math.BigDecimal Z3349CCStkPre ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A3909ValorE ;
   private java.math.BigDecimal A3910ValorS ;
   private java.math.BigDecimal A3916ValorEI ;
   private java.math.BigDecimal A3917ValorSI ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z3916ValorEI ;
   private java.math.BigDecimal Z3909ValorE ;
   private java.math.BigDecimal Z3917ValorSI ;
   private java.math.BigDecimal Z3910ValorS ;
   private java.math.BigDecimal ZZ3343CCStkCanE ;
   private java.math.BigDecimal ZZ3344CCStkCanS ;
   private java.math.BigDecimal ZZ3349CCStkPre ;
   private java.math.BigDecimal ZZ704PrdExiAlm ;
   private java.math.BigDecimal ZZ3916ValorEI ;
   private java.math.BigDecimal ZZ3909ValorE ;
   private java.math.BigDecimal ZZ3917ValorSI ;
   private java.math.BigDecimal ZZ3910ValorS ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z3347CCStkPri ;
   private String Z3352CCStkPar ;
   private String Z3354CCStkAlb ;
   private String Z3355CCStkUsu ;
   private String Z3356CCStkHor ;
   private String Z3357CCStkDsc ;
   private String Z5722CCStkLot ;
   private String Z12858CCStkNAlb ;
   private String Z3345TipMovCc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A3345TipMovCc ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String edtCCStKULin_Internalname ;
   private String edtCCStKULin_Jsonclick ;
   private String edtCCStkLin_Internalname ;
   private String edtCCStkLin_Jsonclick ;
   private String edtCCStkCanE_Internalname ;
   private String edtCCStkCanE_Jsonclick ;
   private String edtCCStkCanS_Internalname ;
   private String edtCCStkCanS_Jsonclick ;
   private String edtTipMovCc_Internalname ;
   private String edtTipMovCc_Jsonclick ;
   private String edtTipMovCn_Internalname ;
   private String A3346TipMovCn ;
   private String edtTipMovCn_Jsonclick ;
   private String edtCCStkPri_Internalname ;
   private String A3347CCStkPri ;
   private String edtCCStkPri_Jsonclick ;
   private String edtCCStkFec_Internalname ;
   private String edtCCStkFec_Jsonclick ;
   private String edtCCStkPre_Internalname ;
   private String edtCCStkPre_Jsonclick ;
   private String edtCCStkBar_Internalname ;
   private String edtCCStkBar_Jsonclick ;
   private String edtCCStkReo_Internalname ;
   private String edtCCStkReo_Jsonclick ;
   private String edtCCStkPar_Internalname ;
   private String A3352CCStkPar ;
   private String edtCCStkPar_Jsonclick ;
   private String edtCCStkPed_Internalname ;
   private String edtCCStkPed_Jsonclick ;
   private String edtCCStkAlb_Internalname ;
   private String A3354CCStkAlb ;
   private String edtCCStkAlb_Jsonclick ;
   private String edtCCStkUsu_Internalname ;
   private String A3355CCStkUsu ;
   private String edtCCStkUsu_Jsonclick ;
   private String edtCCStkHor_Internalname ;
   private String A3356CCStkHor ;
   private String edtCCStkHor_Jsonclick ;
   private String edtCCStkDsc_Internalname ;
   private String A3357CCStkDsc ;
   private String edtCCStkDsc_Jsonclick ;
   private String edtCCStkLen_Internalname ;
   private String edtCCStkLen_Jsonclick ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtCcoCod_Internalname ;
   private String edtCcoCod_Jsonclick ;
   private String edtValorE_Internalname ;
   private String edtValorE_Jsonclick ;
   private String edtValorS_Internalname ;
   private String edtValorS_Jsonclick ;
   private String edtValorEI_Internalname ;
   private String edtValorEI_Jsonclick ;
   private String edtValorSI_Internalname ;
   private String edtValorSI_Jsonclick ;
   private String edtCCStkLot_Internalname ;
   private String A5722CCStkLot ;
   private String edtCCStkLot_Jsonclick ;
   private String edtCCStkExp_Internalname ;
   private String edtCCStkExp_Jsonclick ;
   private String edtCCStkExpF_Internalname ;
   private String edtCCStkExpF_Jsonclick ;
   private String edtCcStkPrv_Internalname ;
   private String edtCcStkPrv_Jsonclick ;
   private String edtCcstkhis_Internalname ;
   private String edtCcstkhis_Jsonclick ;
   private String edtCCStkDoc_Internalname ;
   private String edtCCStkDoc_Jsonclick ;
   private String edtCCStkNAlb_Internalname ;
   private String A12858CCStkNAlb ;
   private String edtCCStkNAlb_Jsonclick ;
   private String edtCCStkLotFe_Internalname ;
   private String edtCCStkLotFe_Jsonclick ;
   private String edtCCstkLotAl_Internalname ;
   private String edtCCstkLotAl_Jsonclick ;
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
   private String Z407EmprNom ;
   private String Z718PrdNom ;
   private String Z3346TipMovCn ;
   private String sMode484 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ3345TipMovCc ;
   private String ZZ3347CCStkPri ;
   private String ZZ3352CCStkPar ;
   private String ZZ3354CCStkAlb ;
   private String ZZ3355CCStkUsu ;
   private String ZZ3356CCStkHor ;
   private String ZZ3357CCStkDsc ;
   private String ZZ5722CCStkLot ;
   private String ZZ12858CCStkNAlb ;
   private String ZZ407EmprNom ;
   private String ZZ3346TipMovCn ;
   private String ZZ718PrdNom ;
   private java.util.Date Z3348CCStkFec ;
   private java.util.Date Z6835CCStkExpF ;
   private java.util.Date Z13979CCStkLotFe ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date A6835CCStkExpF ;
   private java.util.Date A13979CCStkLotFe ;
   private java.util.Date ZZ3348CCStkFec ;
   private java.util.Date ZZ6835CCStkExpF ;
   private java.util.Date ZZ13979CCStkLotFe ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n3915EmpNumDec ;
   private boolean n407EmprNom ;
   private boolean n3341CCStKULin ;
   private boolean n3346TipMovCn ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private long[] T01SG8_A3342CCStkLin ;
   private String[] T01SG8_A407EmprNom ;
   private boolean[] T01SG8_n407EmprNom ;
   private String[] T01SG8_A718PrdNom ;
   private long[] T01SG8_A3341CCStKULin ;
   private boolean[] T01SG8_n3341CCStKULin ;
   private java.math.BigDecimal[] T01SG8_A3343CCStkCanE ;
   private java.math.BigDecimal[] T01SG8_A3344CCStkCanS ;
   private String[] T01SG8_A3346TipMovCn ;
   private boolean[] T01SG8_n3346TipMovCn ;
   private String[] T01SG8_A3347CCStkPri ;
   private java.util.Date[] T01SG8_A3348CCStkFec ;
   private java.math.BigDecimal[] T01SG8_A3349CCStkPre ;
   private int[] T01SG8_A3350CCStkBar ;
   private byte[] T01SG8_A3351CCStkReo ;
   private String[] T01SG8_A3352CCStkPar ;
   private int[] T01SG8_A3353CCStkPed ;
   private String[] T01SG8_A3354CCStkAlb ;
   private String[] T01SG8_A3355CCStkUsu ;
   private String[] T01SG8_A3356CCStkHor ;
   private String[] T01SG8_A3357CCStkDsc ;
   private short[] T01SG8_A3358CCStkLen ;
   private java.math.BigDecimal[] T01SG8_A704PrdExiAlm ;
   private String[] T01SG8_A5722CCStkLot ;
   private byte[] T01SG8_A6834CCStkExp ;
   private java.util.Date[] T01SG8_A6835CCStkExpF ;
   private int[] T01SG8_A6157CcStkPrv ;
   private byte[] T01SG8_A11347Ccstkhis ;
   private long[] T01SG8_A12229CCStkDoc ;
   private String[] T01SG8_A12858CCStkNAlb ;
   private java.util.Date[] T01SG8_A13979CCStkLotFe ;
   private short[] T01SG8_A13980CCstkLotAl ;
   private byte[] T01SG8_A3915EmpNumDec ;
   private boolean[] T01SG8_n3915EmpNumDec ;
   private String[] T01SG8_A396EmprCod ;
   private String[] T01SG8_A719PrdNum ;
   private String[] T01SG8_A3345TipMovCc ;
   private short[] T01SG8_A3839CcoCod ;
   private String[] T01SG4_A407EmprNom ;
   private boolean[] T01SG4_n407EmprNom ;
   private byte[] T01SG4_A3915EmpNumDec ;
   private boolean[] T01SG4_n3915EmpNumDec ;
   private String[] T01SG6_A3346TipMovCn ;
   private boolean[] T01SG6_n3346TipMovCn ;
   private String[] T01SG5_A718PrdNom ;
   private long[] T01SG5_A3341CCStKULin ;
   private boolean[] T01SG5_n3341CCStKULin ;
   private java.math.BigDecimal[] T01SG5_A704PrdExiAlm ;
   private short[] T01SG7_A3839CcoCod ;
   private String[] T01SG9_A407EmprNom ;
   private boolean[] T01SG9_n407EmprNom ;
   private byte[] T01SG9_A3915EmpNumDec ;
   private boolean[] T01SG9_n3915EmpNumDec ;
   private String[] T01SG10_A3346TipMovCn ;
   private boolean[] T01SG10_n3346TipMovCn ;
   private String[] T01SG11_A718PrdNom ;
   private long[] T01SG11_A3341CCStKULin ;
   private boolean[] T01SG11_n3341CCStKULin ;
   private java.math.BigDecimal[] T01SG11_A704PrdExiAlm ;
   private short[] T01SG12_A3839CcoCod ;
   private String[] T01SG13_A396EmprCod ;
   private String[] T01SG13_A719PrdNum ;
   private long[] T01SG13_A3342CCStkLin ;
   private long[] T01SG3_A3342CCStkLin ;
   private java.math.BigDecimal[] T01SG3_A3343CCStkCanE ;
   private java.math.BigDecimal[] T01SG3_A3344CCStkCanS ;
   private String[] T01SG3_A3347CCStkPri ;
   private java.util.Date[] T01SG3_A3348CCStkFec ;
   private java.math.BigDecimal[] T01SG3_A3349CCStkPre ;
   private int[] T01SG3_A3350CCStkBar ;
   private byte[] T01SG3_A3351CCStkReo ;
   private String[] T01SG3_A3352CCStkPar ;
   private int[] T01SG3_A3353CCStkPed ;
   private String[] T01SG3_A3354CCStkAlb ;
   private String[] T01SG3_A3355CCStkUsu ;
   private String[] T01SG3_A3356CCStkHor ;
   private String[] T01SG3_A3357CCStkDsc ;
   private short[] T01SG3_A3358CCStkLen ;
   private String[] T01SG3_A5722CCStkLot ;
   private byte[] T01SG3_A6834CCStkExp ;
   private java.util.Date[] T01SG3_A6835CCStkExpF ;
   private int[] T01SG3_A6157CcStkPrv ;
   private byte[] T01SG3_A11347Ccstkhis ;
   private long[] T01SG3_A12229CCStkDoc ;
   private String[] T01SG3_A12858CCStkNAlb ;
   private java.util.Date[] T01SG3_A13979CCStkLotFe ;
   private short[] T01SG3_A13980CCstkLotAl ;
   private String[] T01SG3_A396EmprCod ;
   private String[] T01SG3_A719PrdNum ;
   private String[] T01SG3_A3345TipMovCc ;
   private short[] T01SG3_A3839CcoCod ;
   private String[] T01SG14_A396EmprCod ;
   private String[] T01SG14_A719PrdNum ;
   private long[] T01SG14_A3342CCStkLin ;
   private String[] T01SG15_A396EmprCod ;
   private String[] T01SG15_A719PrdNum ;
   private long[] T01SG15_A3342CCStkLin ;
   private long[] T01SG2_A3342CCStkLin ;
   private java.math.BigDecimal[] T01SG2_A3343CCStkCanE ;
   private java.math.BigDecimal[] T01SG2_A3344CCStkCanS ;
   private String[] T01SG2_A3347CCStkPri ;
   private java.util.Date[] T01SG2_A3348CCStkFec ;
   private java.math.BigDecimal[] T01SG2_A3349CCStkPre ;
   private int[] T01SG2_A3350CCStkBar ;
   private byte[] T01SG2_A3351CCStkReo ;
   private String[] T01SG2_A3352CCStkPar ;
   private int[] T01SG2_A3353CCStkPed ;
   private String[] T01SG2_A3354CCStkAlb ;
   private String[] T01SG2_A3355CCStkUsu ;
   private String[] T01SG2_A3356CCStkHor ;
   private String[] T01SG2_A3357CCStkDsc ;
   private short[] T01SG2_A3358CCStkLen ;
   private String[] T01SG2_A5722CCStkLot ;
   private byte[] T01SG2_A6834CCStkExp ;
   private java.util.Date[] T01SG2_A6835CCStkExpF ;
   private int[] T01SG2_A6157CcStkPrv ;
   private byte[] T01SG2_A11347Ccstkhis ;
   private long[] T01SG2_A12229CCStkDoc ;
   private String[] T01SG2_A12858CCStkNAlb ;
   private java.util.Date[] T01SG2_A13979CCStkLotFe ;
   private short[] T01SG2_A13980CCstkLotAl ;
   private String[] T01SG2_A396EmprCod ;
   private String[] T01SG2_A719PrdNum ;
   private String[] T01SG2_A3345TipMovCc ;
   private short[] T01SG2_A3839CcoCod ;
   private String[] T01SG19_A407EmprNom ;
   private boolean[] T01SG19_n407EmprNom ;
   private byte[] T01SG19_A3915EmpNumDec ;
   private boolean[] T01SG19_n3915EmpNumDec ;
   private String[] T01SG20_A718PrdNom ;
   private long[] T01SG20_A3341CCStKULin ;
   private boolean[] T01SG20_n3341CCStKULin ;
   private java.math.BigDecimal[] T01SG20_A704PrdExiAlm ;
   private String[] T01SG21_A3346TipMovCn ;
   private boolean[] T01SG21_n3346TipMovCn ;
   private String[] T01SG22_A396EmprCod ;
   private String[] T01SG22_A719PrdNum ;
   private long[] T01SG22_A3342CCStkLin ;
   private short[] T01SG23_A3839CcoCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class upq_cuentacorriente_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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
      return "MODA21";
   }

}

final  class upq_cuentacorriente_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class upq_cuentacorriente_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class upq_cuentacorriente_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class upq_cuentacorriente_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SG2", "SELECT CCStkLin, CCStkCanE, CCStkCanS, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CCStkLot, CCStkExp, CCStkExpF, CcStkPrv, Ccstkhis, CCStkDoc, CCStkNAlb, CCStkLotFe, CCstkLotAl, EmprCod, PrdNum, TipMovCc, CcoCod FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?  FOR UPDATE OF CCStkCanE, CCStkCanS, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CCStkLot, CCStkExp, CCStkExpF, CcStkPrv, Ccstkhis, CCStkDoc, CCStkNAlb, CCStkLotFe, CCstkLotAl, TipMovCc, CcoCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG3", "SELECT CCStkLin, CCStkCanE, CCStkCanS, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CCStkLot, CCStkExp, CCStkExpF, CcStkPrv, Ccstkhis, CCStkDoc, CCStkNAlb, CCStkLotFe, CCstkLotAl, EmprCod, PrdNum, TipMovCc, CcoCod FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG4", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG5", "SELECT PrdNom, CCStKULin, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG6", "SELECT TipMovCn FROM TXPTIPMOV WHERE EmprCod = ? AND TipMovCc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG7", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG8", "SELECT /*+ FIRST_ROWS(100) */ TM1.CCStkLin, T2.EmprNom, T3.PrdNom, T3.CCStKULin, TM1.CCStkCanE, TM1.CCStkCanS, T4.TipMovCn, TM1.CCStkPri, TM1.CCStkFec, TM1.CCStkPre, TM1.CCStkBar, TM1.CCStkReo, TM1.CCStkPar, TM1.CCStkPed, TM1.CCStkAlb, TM1.CCStkUsu, TM1.CCStkHor, TM1.CCStkDsc, TM1.CCStkLen, T3.PrdExiAlm, TM1.CCStkLot, TM1.CCStkExp, TM1.CCStkExpF, TM1.CcStkPrv, TM1.Ccstkhis, TM1.CCStkDoc, TM1.CCStkNAlb, TM1.CCStkLotFe, TM1.CCstkLotAl, T2.EmpNumDec, TM1.EmprCod, TM1.PrdNum, TM1.TipMovCc, TM1.CcoCod FROM (((TXPCCSTKS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) INNER JOIN TXPTIPMOV T4 ON T4.EmprCod = TM1.EmprCod AND T4.TipMovCc = TM1.TipMovCc) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.CCStkLin = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.CCStkLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG9", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG10", "SELECT TipMovCn FROM TXPTIPMOV WHERE EmprCod = ? AND TipMovCc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG11", "SELECT PrdNom, CCStKULin, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG12", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ? or PrdNum = ? and EmprCod = ? and CCStkLin > ?) ORDER BY EmprCod, PrdNum, CCStkLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SG15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ? or PrdNum = ? and EmprCod = ? and CCStkLin < ?) ORDER BY EmprCod DESC, PrdNum DESC, CCStkLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SG16", "INSERT INTO TXPCCSTKS(CCStkLin, CCStkCanE, CCStkCanS, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CCStkLot, CCStkExp, CCStkExpF, CcStkPrv, Ccstkhis, CCStkDoc, CCStkNAlb, CCStkLotFe, CCstkLotAl, EmprCod, PrdNum, TipMovCc, CcoCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCSTKS")
         ,new UpdateCursor("T01SG17", "UPDATE TXPCCSTKS SET CCStkCanE=?, CCStkCanS=?, CCStkPri=?, CCStkFec=?, CCStkPre=?, CCStkBar=?, CCStkReo=?, CCStkPar=?, CCStkPed=?, CCStkAlb=?, CCStkUsu=?, CCStkHor=?, CCStkDsc=?, CCStkLen=?, CCStkLot=?, CCStkExp=?, CCStkExpF=?, CcStkPrv=?, Ccstkhis=?, CCStkDoc=?, CCStkNAlb=?, CCStkLotFe=?, CCstkLotAl=?, TipMovCc=?, CcoCod=?  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK, "TXPCCSTKS")
         ,new UpdateCursor("T01SG18", "DELETE FROM TXPCCSTKS  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK, "TXPCCSTKS")
         ,new ForEachCursor("T01SG19", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG20", "SELECT PrdNom, CCStKULin, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG21", "SELECT TipMovCn FROM TXPTIPMOV WHERE EmprCod = ? AND TipMovCc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG22", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS ORDER BY EmprCod, PrdNum, CCStkLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SG23", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 10);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 26);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(18);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((long[]) buf[20])[0] = rslt.getLong(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 20);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 3);
               ((String[]) buf[25])[0] = rslt.getString(26, 6);
               ((String[]) buf[26])[0] = rslt.getString(27, 2);
               ((short[]) buf[27])[0] = rslt.getShort(28);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 10);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 26);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(18);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((long[]) buf[20])[0] = rslt.getLong(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 20);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 3);
               ((String[]) buf[25])[0] = rslt.getString(26, 6);
               ((String[]) buf[26])[0] = rslt.getString(27, 2);
               ((short[]) buf[27])[0] = rslt.getShort(28);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(9);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,5);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 10);
               ((String[]) buf[18])[0] = rslt.getString(16, 8);
               ((String[]) buf[19])[0] = rslt.getString(17, 8);
               ((String[]) buf[20])[0] = rslt.getString(18, 30);
               ((short[]) buf[21])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,4);
               ((String[]) buf[23])[0] = rslt.getString(21, 26);
               ((byte[]) buf[24])[0] = rslt.getByte(22);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(23);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((byte[]) buf[27])[0] = rslt.getByte(25);
               ((long[]) buf[28])[0] = rslt.getLong(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 20);
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(28);
               ((short[]) buf[31])[0] = rslt.getShort(29);
               ((byte[]) buf[32])[0] = rslt.getByte(30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(31, 3);
               ((String[]) buf[35])[0] = rslt.getString(32, 6);
               ((String[]) buf[36])[0] = rslt.getString(33, 2);
               ((short[]) buf[37])[0] = rslt.getShort(34);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 21 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 10);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setString(13, (String)parms[12], 8);
               stmt.setString(14, (String)parms[13], 30);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 26);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setDate(18, (java.util.Date)parms[17]);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setByte(20, ((Number) parms[19]).byteValue());
               stmt.setLong(21, ((Number) parms[20]).longValue());
               stmt.setString(22, (String)parms[21], 20);
               stmt.setDate(23, (java.util.Date)parms[22]);
               stmt.setShort(24, ((Number) parms[23]).shortValue());
               stmt.setString(25, (String)parms[24], 3);
               stmt.setString(26, (String)parms[25], 6);
               stmt.setString(27, (String)parms[26], 2);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               return;
            case 15 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 10);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setString(13, (String)parms[12], 30);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setString(15, (String)parms[14], 26);
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setDate(17, (java.util.Date)parms[16]);
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setLong(20, ((Number) parms[19]).longValue());
               stmt.setString(21, (String)parms[20], 20);
               stmt.setDate(22, (java.util.Date)parms[21]);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setString(24, (String)parms[23], 2);
               stmt.setShort(25, ((Number) parms[24]).shortValue());
               stmt.setString(26, (String)parms[25], 3);
               stmt.setString(27, (String)parms[26], 6);
               stmt.setLong(28, ((Number) parms[27]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 21 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

