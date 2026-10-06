package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lprdes_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A681PrdAny = (short)(GXutil.lval( httpContext.GetPar( "PrdAny"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A719PrdNum, A681PrdAny) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "LPRDES_TRN", ""), (short)(0)) ;
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

   public lprdes_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lprdes_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lprdes_trn_impl.class ));
   }

   public lprdes_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "LPRDES_TRN", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_LPRDES_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LPRDES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LPRDES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LPRDES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LPRDES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_LPRDES_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LPRDES_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LPRDES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdAny_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdAny_Internalname, httpContext.getMessage( "Año estadistica Productos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdAny_Internalname, GXutil.ltrim( localUtil.ntoc( A681PrdAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A681PrdAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A681PrdAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdAny_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LPRDES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNumMes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNumMes_Internalname, httpContext.getMessage( "Mes de la Estadistica de Prod.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumMes_Internalname, GXutil.ltrim( localUtil.ntoc( A720PrdNumMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdNumMes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A720PrdNumMes), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A720PrdNumMes), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumMes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNumMes_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LPRDES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUniCprM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUniCprM_Internalname, httpContext.getMessage( "Unidades Prod.Compradas al Mes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUniCprM_Internalname, GXutil.ltrim( localUtil.ntoc( A745PrdUniCprM, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUniCprM_Enabled!=0) ? localUtil.format( A745PrdUniCprM, "ZZZZZZ9.99") : localUtil.format( A745PrdUniCprM, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUniCprM_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUniCprM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LPRDES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUniConM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUniConM_Internalname, httpContext.getMessage( "Unidades Prod.Consumidas Mes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUniConM_Internalname, GXutil.ltrim( localUtil.ntoc( A744PrdUniConM, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUniConM_Enabled!=0) ? localUtil.format( A744PrdUniConM, "ZZZZZZ9.9999") : localUtil.format( A744PrdUniConM, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUniConM_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUniConM_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LPRDES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdKilTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdKilTin_Internalname, httpContext.getMessage( "Kilos Tintados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdKilTin_Internalname, GXutil.ltrim( localUtil.ntoc( A3659PrdKilTin, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdKilTin_Enabled!=0) ? localUtil.format( A3659PrdKilTin, "ZZZZZZ9.9999") : localUtil.format( A3659PrdKilTin, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdKilTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdKilTin_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LPRDES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdMtrTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdMtrTin_Internalname, httpContext.getMessage( "Metros Tintados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdMtrTin_Internalname, GXutil.ltrim( localUtil.ntoc( A3660PrdMtrTin, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdMtrTin_Enabled!=0) ? localUtil.format( A3660PrdMtrTin, "ZZZZZZ9.9999") : localUtil.format( A3660PrdMtrTin, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdMtrTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdMtrTin_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LPRDES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdValCprM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdValCprM_Internalname, httpContext.getMessage( "Valor Compra Productos Mes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdValCprM_Internalname, GXutil.ltrim( localUtil.ntoc( A749PrdValCprM, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdValCprM_Enabled!=0) ? localUtil.format( A749PrdValCprM, "ZZZZZZZZ9.99") : localUtil.format( A749PrdValCprM, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdValCprM_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdValCprM_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LPRDES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdValConM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdValConM_Internalname, httpContext.getMessage( "Valor Consumo Productos Mes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdValConM_Internalname, GXutil.ltrim( localUtil.ntoc( A747PrdValConM, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdValConM_Enabled!=0) ? localUtil.format( A747PrdValConM, "ZZZZZZZZ9.99") : localUtil.format( A747PrdValConM, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdValConM_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdValConM_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LPRDES_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LPRDES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LPRDES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LPRDES_TRN.htm");
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
         Z681PrdAny = (short)(localUtil.ctol( httpContext.cgiGet( "Z681PrdAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z720PrdNumMes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z720PrdNumMes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z745PrdUniCprM = localUtil.ctond( httpContext.cgiGet( "Z745PrdUniCprM")) ;
         Z744PrdUniConM = localUtil.ctond( httpContext.cgiGet( "Z744PrdUniConM")) ;
         Z3659PrdKilTin = localUtil.ctond( httpContext.cgiGet( "Z3659PrdKilTin")) ;
         Z3660PrdMtrTin = localUtil.ctond( httpContext.cgiGet( "Z3660PrdMtrTin")) ;
         Z749PrdValCprM = localUtil.ctond( httpContext.cgiGet( "Z749PrdValCprM")) ;
         Z747PrdValConM = localUtil.ctond( httpContext.cgiGet( "Z747PrdValConM")) ;
         O744PrdUniConM = localUtil.ctond( httpContext.cgiGet( "O744PrdUniConM")) ;
         O676PrdAcuConA = localUtil.ctond( httpContext.cgiGet( "O676PrdAcuConA")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A676PrdAcuConA = localUtil.ctond( httpContext.cgiGet( "PRDACUCONA")) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDANY");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdAny_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A681PrdAny = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
         }
         else
         {
            A681PrdAny = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdNumMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdNumMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDNUMMES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdNumMes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A720PrdNumMes = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A720PrdNumMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A720PrdNumMes), 2, 0));
         }
         else
         {
            A720PrdNumMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdNumMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A720PrdNumMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A720PrdNumMes), 2, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdUniCprM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdUniCprM_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDUNICPRM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUniCprM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A745PrdUniCprM = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A745PrdUniCprM", GXutil.ltrimstr( A745PrdUniCprM, 10, 2));
         }
         else
         {
            A745PrdUniCprM = localUtil.ctond( httpContext.cgiGet( edtPrdUniCprM_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A745PrdUniCprM", GXutil.ltrimstr( A745PrdUniCprM, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdUniConM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdUniConM_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDUNICONM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUniConM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A744PrdUniConM = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A744PrdUniConM", GXutil.ltrimstr( A744PrdUniConM, 12, 4));
         }
         else
         {
            A744PrdUniConM = localUtil.ctond( httpContext.cgiGet( edtPrdUniConM_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A744PrdUniConM", GXutil.ltrimstr( A744PrdUniConM, 12, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdKilTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdKilTin_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDKILTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdKilTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3659PrdKilTin = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A3659PrdKilTin", GXutil.ltrimstr( A3659PrdKilTin, 12, 4));
         }
         else
         {
            A3659PrdKilTin = localUtil.ctond( httpContext.cgiGet( edtPrdKilTin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3659PrdKilTin", GXutil.ltrimstr( A3659PrdKilTin, 12, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdMtrTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdMtrTin_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDMTRTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdMtrTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3660PrdMtrTin = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A3660PrdMtrTin", GXutil.ltrimstr( A3660PrdMtrTin, 12, 4));
         }
         else
         {
            A3660PrdMtrTin = localUtil.ctond( httpContext.cgiGet( edtPrdMtrTin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3660PrdMtrTin", GXutil.ltrimstr( A3660PrdMtrTin, 12, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdValCprM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdValCprM_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDVALCPRM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdValCprM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A749PrdValCprM = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A749PrdValCprM", GXutil.ltrimstr( A749PrdValCprM, 12, 2));
         }
         else
         {
            A749PrdValCprM = localUtil.ctond( httpContext.cgiGet( edtPrdValCprM_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A749PrdValCprM", GXutil.ltrimstr( A749PrdValCprM, 12, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdValConM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdValConM_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDVALCONM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdValConM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A747PrdValConM = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A747PrdValConM", GXutil.ltrimstr( A747PrdValConM, 12, 2));
         }
         else
         {
            A747PrdValConM = localUtil.ctond( httpContext.cgiGet( edtPrdValConM_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A747PrdValConM", GXutil.ltrimstr( A747PrdValConM, 12, 2));
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
            A681PrdAny = (short)(GXutil.lval( httpContext.GetPar( "PrdAny"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
            A720PrdNumMes = (byte)(GXutil.lval( httpContext.GetPar( "PrdNumMes"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A720PrdNumMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A720PrdNumMes), 2, 0));
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
            initAll1RX81( ) ;
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
      disableAttributes1RX81( ) ;
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

   public void resetCaption1RX0( )
   {
   }

   public void zm1RX81( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z745PrdUniCprM = T01RX3_A745PrdUniCprM[0] ;
            Z744PrdUniConM = T01RX3_A744PrdUniConM[0] ;
            Z3659PrdKilTin = T01RX3_A3659PrdKilTin[0] ;
            Z3660PrdMtrTin = T01RX3_A3660PrdMtrTin[0] ;
            Z749PrdValCprM = T01RX3_A749PrdValCprM[0] ;
            Z747PrdValConM = T01RX3_A747PrdValConM[0] ;
         }
         else
         {
            Z745PrdUniCprM = A745PrdUniCprM ;
            Z744PrdUniConM = A744PrdUniConM ;
            Z3659PrdKilTin = A3659PrdKilTin ;
            Z3660PrdMtrTin = A3660PrdMtrTin ;
            Z749PrdValCprM = A749PrdValCprM ;
            Z747PrdValConM = A747PrdValConM ;
         }
      }
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -2 )
      {
         Z720PrdNumMes = A720PrdNumMes ;
         Z745PrdUniCprM = A745PrdUniCprM ;
         Z744PrdUniConM = A744PrdUniConM ;
         Z3659PrdKilTin = A3659PrdKilTin ;
         Z3660PrdMtrTin = A3660PrdMtrTin ;
         Z749PrdValCprM = A749PrdValCprM ;
         Z747PrdValConM = A747PrdValConM ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z681PrdAny = A681PrdAny ;
         Z676PrdAcuConA = A676PrdAcuConA ;
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

   public void load1RX81( )
   {
      /* Using cursor T01RX6 */
      pr_default.execute(4, new Object[] {Byte.valueOf(A720PrdNumMes), A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound81 = (short)(1) ;
         A676PrdAcuConA = T01RX6_A676PrdAcuConA[0] ;
         A745PrdUniCprM = T01RX6_A745PrdUniCprM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A745PrdUniCprM", GXutil.ltrimstr( A745PrdUniCprM, 10, 2));
         A744PrdUniConM = T01RX6_A744PrdUniConM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A744PrdUniConM", GXutil.ltrimstr( A744PrdUniConM, 12, 4));
         A3659PrdKilTin = T01RX6_A3659PrdKilTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3659PrdKilTin", GXutil.ltrimstr( A3659PrdKilTin, 12, 4));
         A3660PrdMtrTin = T01RX6_A3660PrdMtrTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3660PrdMtrTin", GXutil.ltrimstr( A3660PrdMtrTin, 12, 4));
         A749PrdValCprM = T01RX6_A749PrdValCprM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A749PrdValCprM", GXutil.ltrimstr( A749PrdValCprM, 12, 2));
         A747PrdValConM = T01RX6_A747PrdValConM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A747PrdValConM", GXutil.ltrimstr( A747PrdValConM, 12, 2));
         zm1RX81( -2) ;
      }
      pr_default.close(4);
      onLoadActions1RX81( ) ;
   }

   public void onLoadActions1RX81( )
   {
      O676PrdAcuConA = A676PrdAcuConA ;
      httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
      if ( isIns( )  )
      {
         A676PrdAcuConA = O676PrdAcuConA.add(A744PrdUniConM) ;
         httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
      }
      else
      {
         if ( isUpd( )  )
         {
            A676PrdAcuConA = O676PrdAcuConA.add(A744PrdUniConM).subtract(O744PrdUniConM) ;
            httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
         }
         else
         {
            if ( isDlt( )  )
            {
               A676PrdAcuConA = O676PrdAcuConA.subtract(O744PrdUniConM) ;
               httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
            }
         }
      }
   }

   public void checkExtendedTable1RX81( )
   {
      nIsDirty_81 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01RX5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPRDES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDANY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A676PrdAcuConA = T01RX5_A676PrdAcuConA[0] ;
      nIsDirty_81 = (short)(1) ;
      O676PrdAcuConA = A676PrdAcuConA ;
      httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
      pr_default.close(3);
      if ( isIns( )  )
      {
         nIsDirty_81 = (short)(1) ;
         A676PrdAcuConA = O676PrdAcuConA.add(A744PrdUniConM) ;
         httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_81 = (short)(1) ;
            A676PrdAcuConA = O676PrdAcuConA.add(A744PrdUniConM).subtract(O744PrdUniConM) ;
            httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_81 = (short)(1) ;
               A676PrdAcuConA = O676PrdAcuConA.subtract(O744PrdUniConM) ;
               httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
            }
         }
      }
   }

   public void closeExtendedTableCursors1RX81( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         String A719PrdNum ,
                         short A681PrdAny )
   {
      /* Using cursor T01RX5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPRDES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDANY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A676PrdAcuConA = T01RX5_A676PrdAcuConA[0] ;
      O676PrdAcuConA = A676PrdAcuConA ;
      httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A676PrdAcuConA, (byte)(12), (byte)(4), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(3) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void getKey1RX81( )
   {
      /* Using cursor T01RX7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound81 = (short)(1) ;
      }
      else
      {
         RcdFound81 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RX81( 2) ;
         RcdFound81 = (short)(1) ;
         A720PrdNumMes = T01RX3_A720PrdNumMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A720PrdNumMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A720PrdNumMes), 2, 0));
         A745PrdUniCprM = T01RX3_A745PrdUniCprM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A745PrdUniCprM", GXutil.ltrimstr( A745PrdUniCprM, 10, 2));
         A744PrdUniConM = T01RX3_A744PrdUniConM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A744PrdUniConM", GXutil.ltrimstr( A744PrdUniConM, 12, 4));
         A3659PrdKilTin = T01RX3_A3659PrdKilTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3659PrdKilTin", GXutil.ltrimstr( A3659PrdKilTin, 12, 4));
         A3660PrdMtrTin = T01RX3_A3660PrdMtrTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3660PrdMtrTin", GXutil.ltrimstr( A3660PrdMtrTin, 12, 4));
         A749PrdValCprM = T01RX3_A749PrdValCprM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A749PrdValCprM", GXutil.ltrimstr( A749PrdValCprM, 12, 2));
         A747PrdValConM = T01RX3_A747PrdValConM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A747PrdValConM", GXutil.ltrimstr( A747PrdValConM, 12, 2));
         A396EmprCod = T01RX3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01RX3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A681PrdAny = T01RX3_A681PrdAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
         O744PrdUniConM = A744PrdUniConM ;
         httpContext.ajax_rsp_assign_attri("", false, "A744PrdUniConM", GXutil.ltrimstr( A744PrdUniConM, 12, 4));
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z681PrdAny = A681PrdAny ;
         Z720PrdNumMes = A720PrdNumMes ;
         sMode81 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1RX81( ) ;
         if ( AnyError == 1 )
         {
            RcdFound81 = (short)(0) ;
            initializeNonKey1RX81( ) ;
         }
         Gx_mode = sMode81 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound81 = (short)(0) ;
         initializeNonKey1RX81( ) ;
         sMode81 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode81 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1RX81( ) ;
      if ( RcdFound81 == 0 )
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
      RcdFound81 = (short)(0) ;
      /* Using cursor T01RX8 */
      pr_default.execute(6, new Object[] {Byte.valueOf(A720PrdNumMes), Byte.valueOf(A720PrdNumMes), A396EmprCod, A396EmprCod, Byte.valueOf(A720PrdNumMes), A719PrdNum, A719PrdNum, A396EmprCod, Byte.valueOf(A720PrdNumMes), Short.valueOf(A681PrdAny)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01RX8_A720PrdNumMes[0] < A720PrdNumMes ) || ( T01RX8_A720PrdNumMes[0] == A720PrdNumMes ) && ( GXutil.strcmp(T01RX8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RX8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RX8_A720PrdNumMes[0] == A720PrdNumMes ) && ( GXutil.strcmp(T01RX8_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01RX8_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RX8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RX8_A720PrdNumMes[0] == A720PrdNumMes ) && ( T01RX8_A681PrdAny[0] < A681PrdAny ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01RX8_A720PrdNumMes[0] > A720PrdNumMes ) || ( T01RX8_A720PrdNumMes[0] == A720PrdNumMes ) && ( GXutil.strcmp(T01RX8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RX8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RX8_A720PrdNumMes[0] == A720PrdNumMes ) && ( GXutil.strcmp(T01RX8_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01RX8_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RX8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RX8_A720PrdNumMes[0] == A720PrdNumMes ) && ( T01RX8_A681PrdAny[0] > A681PrdAny ) ) )
         {
            A720PrdNumMes = T01RX8_A720PrdNumMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A720PrdNumMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A720PrdNumMes), 2, 0));
            A396EmprCod = T01RX8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T01RX8_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A681PrdAny = T01RX8_A681PrdAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
            RcdFound81 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound81 = (short)(0) ;
      /* Using cursor T01RX9 */
      pr_default.execute(7, new Object[] {Byte.valueOf(A720PrdNumMes), Byte.valueOf(A720PrdNumMes), A396EmprCod, A396EmprCod, Byte.valueOf(A720PrdNumMes), A719PrdNum, A719PrdNum, A396EmprCod, Byte.valueOf(A720PrdNumMes), Short.valueOf(A681PrdAny)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01RX9_A720PrdNumMes[0] > A720PrdNumMes ) || ( T01RX9_A720PrdNumMes[0] == A720PrdNumMes ) && ( GXutil.strcmp(T01RX9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RX9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RX9_A720PrdNumMes[0] == A720PrdNumMes ) && ( GXutil.strcmp(T01RX9_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01RX9_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RX9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RX9_A720PrdNumMes[0] == A720PrdNumMes ) && ( T01RX9_A681PrdAny[0] > A681PrdAny ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01RX9_A720PrdNumMes[0] < A720PrdNumMes ) || ( T01RX9_A720PrdNumMes[0] == A720PrdNumMes ) && ( GXutil.strcmp(T01RX9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RX9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RX9_A720PrdNumMes[0] == A720PrdNumMes ) && ( GXutil.strcmp(T01RX9_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01RX9_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RX9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RX9_A720PrdNumMes[0] == A720PrdNumMes ) && ( T01RX9_A681PrdAny[0] < A681PrdAny ) ) )
         {
            A720PrdNumMes = T01RX9_A720PrdNumMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A720PrdNumMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A720PrdNumMes), 2, 0));
            A396EmprCod = T01RX9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T01RX9_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A681PrdAny = T01RX9_A681PrdAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
            RcdFound81 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RX81( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RX81( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound81 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A681PrdAny != Z681PrdAny ) || ( A720PrdNumMes != Z720PrdNumMes ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A681PrdAny = Z681PrdAny ;
               httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
               A720PrdNumMes = Z720PrdNumMes ;
               httpContext.ajax_rsp_assign_attri("", false, "A720PrdNumMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A720PrdNumMes), 2, 0));
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
               update1RX81( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A681PrdAny != Z681PrdAny ) || ( A720PrdNumMes != Z720PrdNumMes ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RX81( ) ;
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
                  insert1RX81( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A681PrdAny != Z681PrdAny ) || ( A720PrdNumMes != Z720PrdNumMes ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A681PrdAny = Z681PrdAny ;
         httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
         A720PrdNumMes = Z720PrdNumMes ;
         httpContext.ajax_rsp_assign_attri("", false, "A720PrdNumMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A720PrdNumMes), 2, 0));
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
      if ( RcdFound81 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdUniCprM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1RX81( ) ;
      if ( RcdFound81 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdUniCprM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RX81( ) ;
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
      if ( RcdFound81 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdUniCprM_Internalname ;
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
      if ( RcdFound81 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdUniCprM_Internalname ;
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
      scanStart1RX81( ) ;
      if ( RcdFound81 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound81 != 0 )
         {
            scanNext1RX81( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdUniCprM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RX81( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1RX81( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPRDES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z745PrdUniCprM, T01RX2_A745PrdUniCprM[0]) != 0 ) || ( DecimalUtil.compareTo(Z744PrdUniConM, T01RX2_A744PrdUniConM[0]) != 0 ) || ( DecimalUtil.compareTo(Z3659PrdKilTin, T01RX2_A3659PrdKilTin[0]) != 0 ) || ( DecimalUtil.compareTo(Z3660PrdMtrTin, T01RX2_A3660PrdMtrTin[0]) != 0 ) || ( DecimalUtil.compareTo(Z749PrdValCprM, T01RX2_A749PrdValCprM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z747PrdValConM, T01RX2_A747PrdValConM[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z745PrdUniCprM, T01RX2_A745PrdUniCprM[0]) != 0 )
            {
               GXutil.writeLogln("lprdes_trn:[seudo value changed for attri]"+"PrdUniCprM");
               GXutil.writeLogRaw("Old: ",Z745PrdUniCprM);
               GXutil.writeLogRaw("Current: ",T01RX2_A745PrdUniCprM[0]);
            }
            if ( DecimalUtil.compareTo(Z744PrdUniConM, T01RX2_A744PrdUniConM[0]) != 0 )
            {
               GXutil.writeLogln("lprdes_trn:[seudo value changed for attri]"+"PrdUniConM");
               GXutil.writeLogRaw("Old: ",Z744PrdUniConM);
               GXutil.writeLogRaw("Current: ",T01RX2_A744PrdUniConM[0]);
            }
            if ( DecimalUtil.compareTo(Z3659PrdKilTin, T01RX2_A3659PrdKilTin[0]) != 0 )
            {
               GXutil.writeLogln("lprdes_trn:[seudo value changed for attri]"+"PrdKilTin");
               GXutil.writeLogRaw("Old: ",Z3659PrdKilTin);
               GXutil.writeLogRaw("Current: ",T01RX2_A3659PrdKilTin[0]);
            }
            if ( DecimalUtil.compareTo(Z3660PrdMtrTin, T01RX2_A3660PrdMtrTin[0]) != 0 )
            {
               GXutil.writeLogln("lprdes_trn:[seudo value changed for attri]"+"PrdMtrTin");
               GXutil.writeLogRaw("Old: ",Z3660PrdMtrTin);
               GXutil.writeLogRaw("Current: ",T01RX2_A3660PrdMtrTin[0]);
            }
            if ( DecimalUtil.compareTo(Z749PrdValCprM, T01RX2_A749PrdValCprM[0]) != 0 )
            {
               GXutil.writeLogln("lprdes_trn:[seudo value changed for attri]"+"PrdValCprM");
               GXutil.writeLogRaw("Old: ",Z749PrdValCprM);
               GXutil.writeLogRaw("Current: ",T01RX2_A749PrdValCprM[0]);
            }
            if ( DecimalUtil.compareTo(Z747PrdValConM, T01RX2_A747PrdValConM[0]) != 0 )
            {
               GXutil.writeLogln("lprdes_trn:[seudo value changed for attri]"+"PrdValConM");
               GXutil.writeLogRaw("Old: ",Z747PrdValConM);
               GXutil.writeLogRaw("Current: ",T01RX2_A747PrdValConM[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPRDES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01RX10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
      if ( (pr_default.getStatus(8) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPRDES"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPRDES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RX81( )
   {
      beforeValidate1RX81( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RX81( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RX81( 0) ;
         checkOptimisticConcurrency1RX81( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RX81( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RX81( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RX11 */
                  pr_default.execute(9, new Object[] {Byte.valueOf(A720PrdNumMes), A745PrdUniCprM, A744PrdUniConM, A3659PrdKilTin, A3660PrdMtrTin, A749PrdValCprM, A747PrdValConM, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
                  if ( (pr_default.getStatus(9) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11RX81( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1RX0( ) ;
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
            load1RX81( ) ;
         }
         endLevel1RX81( ) ;
      }
      closeExtendedTableCursors1RX81( ) ;
   }

   public void update1RX81( )
   {
      beforeValidate1RX81( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RX81( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RX81( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RX81( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RX81( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RX12 */
                  pr_default.execute(10, new Object[] {A745PrdUniCprM, A744PrdUniConM, A3659PrdKilTin, A3660PrdMtrTin, A749PrdValCprM, A747PrdValConM, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPRDES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RX81( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11RX81( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1RX0( ) ;
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
         endLevel1RX81( ) ;
      }
      closeExtendedTableCursors1RX81( ) ;
   }

   public void deferredUpdate1RX81( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RX81( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RX81( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RX81( ) ;
         afterConfirm1RX81( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RX81( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RX13 */
               pr_default.execute(11, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
               if ( AnyError == 0 )
               {
                  updateTablesN11RX81( ) ;
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound81 == 0 )
                     {
                        initAll1RX81( ) ;
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
                     resetCaption1RX0( ) ;
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
      sMode81 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RX81( ) ;
      Gx_mode = sMode81 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RX81( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01RX14 */
         pr_default.execute(12, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
         A676PrdAcuConA = T01RX14_A676PrdAcuConA[0] ;
         O676PrdAcuConA = A676PrdAcuConA ;
         httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
         pr_default.close(12);
         if ( isIns( )  )
         {
            A676PrdAcuConA = O676PrdAcuConA.add(A744PrdUniConM) ;
            httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
         }
         else
         {
            if ( isUpd( )  )
            {
               A676PrdAcuConA = O676PrdAcuConA.add(A744PrdUniConM).subtract(O744PrdUniConM) ;
               httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A676PrdAcuConA = O676PrdAcuConA.subtract(O744PrdUniConM) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
               }
            }
         }
      }
   }

   public void updateTablesN11RX81( )
   {
      /* Using cursor T01RX15 */
      pr_default.execute(13, new Object[] {A676PrdAcuConA, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDES");
   }

   public void endLevel1RX81( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(8);
      if ( AnyError == 0 )
      {
         beforeComplete1RX81( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "lprdes_trn");
         if ( AnyError == 0 )
         {
            confirmValues1RX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "lprdes_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RX81( )
   {
      /* Using cursor T01RX16 */
      pr_default.execute(14);
      RcdFound81 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound81 = (short)(1) ;
         A396EmprCod = T01RX16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01RX16_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A681PrdAny = T01RX16_A681PrdAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
         A720PrdNumMes = T01RX16_A720PrdNumMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A720PrdNumMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A720PrdNumMes), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RX81( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound81 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound81 = (short)(1) ;
         A396EmprCod = T01RX16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01RX16_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A681PrdAny = T01RX16_A681PrdAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
         A720PrdNumMes = T01RX16_A720PrdNumMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A720PrdNumMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A720PrdNumMes), 2, 0));
      }
   }

   public void scanEnd1RX81( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1RX81( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RX81( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RX81( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RX81( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RX81( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RX81( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RX81( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAny_Enabled), 5, 0), true);
      edtPrdNumMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNumMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNumMes_Enabled), 5, 0), true);
      edtPrdUniCprM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUniCprM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUniCprM_Enabled), 5, 0), true);
      edtPrdUniConM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUniConM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUniConM_Enabled), 5, 0), true);
      edtPrdKilTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdKilTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdKilTin_Enabled), 5, 0), true);
      edtPrdMtrTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdMtrTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMtrTin_Enabled), 5, 0), true);
      edtPrdValCprM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdValCprM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdValCprM_Enabled), 5, 0), true);
      edtPrdValConM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdValConM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdValConM_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1RX81( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1RX0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.lprdes_trn", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z681PrdAny", GXutil.ltrim( localUtil.ntoc( Z681PrdAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z720PrdNumMes", GXutil.ltrim( localUtil.ntoc( Z720PrdNumMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z745PrdUniCprM", GXutil.ltrim( localUtil.ntoc( Z745PrdUniCprM, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z744PrdUniConM", GXutil.ltrim( localUtil.ntoc( Z744PrdUniConM, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3659PrdKilTin", GXutil.ltrim( localUtil.ntoc( Z3659PrdKilTin, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3660PrdMtrTin", GXutil.ltrim( localUtil.ntoc( Z3660PrdMtrTin, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z749PrdValCprM", GXutil.ltrim( localUtil.ntoc( Z749PrdValCprM, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z747PrdValConM", GXutil.ltrim( localUtil.ntoc( Z747PrdValConM, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O744PrdUniConM", GXutil.ltrim( localUtil.ntoc( O744PrdUniConM, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O676PrdAcuConA", GXutil.ltrim( localUtil.ntoc( O676PrdAcuConA, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDACUCONA", GXutil.ltrim( localUtil.ntoc( A676PrdAcuConA, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.lprdes_trn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "LPRDES_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "LPRDES_TRN", "") ;
   }

   public void initializeNonKey1RX81( )
   {
      A676PrdAcuConA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
      A745PrdUniCprM = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A745PrdUniCprM", GXutil.ltrimstr( A745PrdUniCprM, 10, 2));
      A744PrdUniConM = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A744PrdUniConM", GXutil.ltrimstr( A744PrdUniConM, 12, 4));
      A3659PrdKilTin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3659PrdKilTin", GXutil.ltrimstr( A3659PrdKilTin, 12, 4));
      A3660PrdMtrTin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3660PrdMtrTin", GXutil.ltrimstr( A3660PrdMtrTin, 12, 4));
      A749PrdValCprM = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A749PrdValCprM", GXutil.ltrimstr( A749PrdValCprM, 12, 2));
      A747PrdValConM = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A747PrdValConM", GXutil.ltrimstr( A747PrdValConM, 12, 2));
      O744PrdUniConM = A744PrdUniConM ;
      httpContext.ajax_rsp_assign_attri("", false, "A744PrdUniConM", GXutil.ltrimstr( A744PrdUniConM, 12, 4));
      O676PrdAcuConA = A676PrdAcuConA ;
      httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrimstr( A676PrdAcuConA, 12, 4));
      Z745PrdUniCprM = DecimalUtil.ZERO ;
      Z744PrdUniConM = DecimalUtil.ZERO ;
      Z3659PrdKilTin = DecimalUtil.ZERO ;
      Z3660PrdMtrTin = DecimalUtil.ZERO ;
      Z749PrdValCprM = DecimalUtil.ZERO ;
      Z747PrdValConM = DecimalUtil.ZERO ;
   }

   public void initAll1RX81( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A681PrdAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A681PrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A681PrdAny), 4, 0));
      A720PrdNumMes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A720PrdNumMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A720PrdNumMes), 2, 0));
      initializeNonKey1RX81( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016381887", true, true);
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
      httpContext.AddJavascriptSource("lprdes_trn.js", "?202661016381888", false, true);
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
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdAny_Internalname = "PRDANY" ;
      edtPrdNumMes_Internalname = "PRDNUMMES" ;
      edtPrdUniCprM_Internalname = "PRDUNICPRM" ;
      edtPrdUniConM_Internalname = "PRDUNICONM" ;
      edtPrdKilTin_Internalname = "PRDKILTIN" ;
      edtPrdMtrTin_Internalname = "PRDMTRTIN" ;
      edtPrdValCprM_Internalname = "PRDVALCPRM" ;
      edtPrdValConM_Internalname = "PRDVALCONM" ;
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
      Form.setCaption( httpContext.getMessage( "LPRDES_TRN", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPrdValConM_Jsonclick = "" ;
      edtPrdValConM_Enabled = 1 ;
      edtPrdValCprM_Jsonclick = "" ;
      edtPrdValCprM_Enabled = 1 ;
      edtPrdMtrTin_Jsonclick = "" ;
      edtPrdMtrTin_Enabled = 1 ;
      edtPrdKilTin_Jsonclick = "" ;
      edtPrdKilTin_Enabled = 1 ;
      edtPrdUniConM_Jsonclick = "" ;
      edtPrdUniConM_Enabled = 1 ;
      edtPrdUniCprM_Jsonclick = "" ;
      edtPrdUniCprM_Enabled = 1 ;
      edtPrdNumMes_Jsonclick = "" ;
      edtPrdNumMes_Enabled = 1 ;
      edtPrdAny_Jsonclick = "" ;
      edtPrdAny_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
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
      /* Using cursor T01RX14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPRDES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDANY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A676PrdAcuConA = T01RX14_A676PrdAcuConA[0] ;
      pr_default.close(12);
      GX_FocusControl = edtPrdUniCprM_Internalname ;
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

   public void valid_Prdany( )
   {
      /* Using cursor T01RX14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPRDES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDANY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A676PrdAcuConA = T01RX14_A676PrdAcuConA[0] ;
      O676PrdAcuConA = A676PrdAcuConA ;
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O676PrdAcuConA", GXutil.ltrim( localUtil.ntoc( O676PrdAcuConA, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrim( localUtil.ntoc( A676PrdAcuConA, (byte)(12), (byte)(4), ".", "")));
   }

   public void valid_Prdnummes( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A745PrdUniCprM", GXutil.ltrim( localUtil.ntoc( A745PrdUniCprM, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A744PrdUniConM", GXutil.ltrim( localUtil.ntoc( A744PrdUniConM, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3659PrdKilTin", GXutil.ltrim( localUtil.ntoc( A3659PrdKilTin, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3660PrdMtrTin", GXutil.ltrim( localUtil.ntoc( A3660PrdMtrTin, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A749PrdValCprM", GXutil.ltrim( localUtil.ntoc( A749PrdValCprM, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A747PrdValConM", GXutil.ltrim( localUtil.ntoc( A747PrdValConM, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A676PrdAcuConA", GXutil.ltrim( localUtil.ntoc( A676PrdAcuConA, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z681PrdAny", GXutil.ltrim( localUtil.ntoc( Z681PrdAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z720PrdNumMes", GXutil.ltrim( localUtil.ntoc( Z720PrdNumMes, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z745PrdUniCprM", GXutil.ltrim( localUtil.ntoc( Z745PrdUniCprM, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z744PrdUniConM", GXutil.ltrim( localUtil.ntoc( Z744PrdUniConM, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3659PrdKilTin", GXutil.ltrim( localUtil.ntoc( Z3659PrdKilTin, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3660PrdMtrTin", GXutil.ltrim( localUtil.ntoc( Z3660PrdMtrTin, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z749PrdValCprM", GXutil.ltrim( localUtil.ntoc( Z749PrdValCprM, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z747PrdValConM", GXutil.ltrim( localUtil.ntoc( Z747PrdValConM, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z676PrdAcuConA", GXutil.ltrim( localUtil.ntoc( Z676PrdAcuConA, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O744PrdUniConM", GXutil.ltrim( localUtil.ntoc( O744PrdUniConM, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O676PrdAcuConA", GXutil.ltrim( localUtil.ntoc( O676PrdAcuConA, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDANY","{handler:'valid_Prdany',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A681PrdAny',fld:'PRDANY',pic:'ZZZ9'},{av:'A676PrdAcuConA',fld:'PRDACUCONA',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("VALID_PRDANY",",oparms:[{av:'O676PrdAcuConA'},{av:'A676PrdAcuConA',fld:'PRDACUCONA',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("VALID_PRDNUMMES","{handler:'valid_Prdnummes',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A681PrdAny',fld:'PRDANY',pic:'ZZZ9'},{av:'A720PrdNumMes',fld:'PRDNUMMES',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRDNUMMES",",oparms:[{av:'A745PrdUniCprM',fld:'PRDUNICPRM',pic:'ZZZZZZ9.99'},{av:'A744PrdUniConM',fld:'PRDUNICONM',pic:'ZZZZZZ9.9999'},{av:'A3659PrdKilTin',fld:'PRDKILTIN',pic:'ZZZZZZ9.9999'},{av:'A3660PrdMtrTin',fld:'PRDMTRTIN',pic:'ZZZZZZ9.9999'},{av:'A749PrdValCprM',fld:'PRDVALCPRM',pic:'ZZZZZZZZ9.99'},{av:'A747PrdValConM',fld:'PRDVALCONM',pic:'ZZZZZZZZ9.99'},{av:'A676PrdAcuConA',fld:'PRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z681PrdAny'},{av:'Z720PrdNumMes'},{av:'Z745PrdUniCprM'},{av:'Z744PrdUniConM'},{av:'Z3659PrdKilTin'},{av:'Z3660PrdMtrTin'},{av:'Z749PrdValCprM'},{av:'Z747PrdValConM'},{av:'Z676PrdAcuConA'},{av:'O744PrdUniConM'},{av:'O676PrdAcuConA'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_PRDUNICONM","{handler:'valid_Prduniconm',iparms:[]");
      setEventMetadata("VALID_PRDUNICONM",",oparms:[]}");
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
      pr_default.close(12);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z745PrdUniCprM = DecimalUtil.ZERO ;
      Z744PrdUniConM = DecimalUtil.ZERO ;
      Z3659PrdKilTin = DecimalUtil.ZERO ;
      Z3660PrdMtrTin = DecimalUtil.ZERO ;
      Z749PrdValCprM = DecimalUtil.ZERO ;
      Z747PrdValConM = DecimalUtil.ZERO ;
      O744PrdUniConM = DecimalUtil.ZERO ;
      O676PrdAcuConA = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A745PrdUniCprM = DecimalUtil.ZERO ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      A3659PrdKilTin = DecimalUtil.ZERO ;
      A3660PrdMtrTin = DecimalUtil.ZERO ;
      A749PrdValCprM = DecimalUtil.ZERO ;
      A747PrdValConM = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      A676PrdAcuConA = DecimalUtil.ZERO ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z676PrdAcuConA = DecimalUtil.ZERO ;
      T01RX6_A676PrdAcuConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX6_A720PrdNumMes = new byte[1] ;
      T01RX6_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX6_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX6_A3659PrdKilTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX6_A3660PrdMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX6_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX6_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX6_A396EmprCod = new String[] {""} ;
      T01RX6_A719PrdNum = new String[] {""} ;
      T01RX6_A681PrdAny = new short[1] ;
      T01RX5_A676PrdAcuConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX7_A396EmprCod = new String[] {""} ;
      T01RX7_A719PrdNum = new String[] {""} ;
      T01RX7_A681PrdAny = new short[1] ;
      T01RX7_A720PrdNumMes = new byte[1] ;
      T01RX3_A720PrdNumMes = new byte[1] ;
      T01RX3_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX3_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX3_A3659PrdKilTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX3_A3660PrdMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX3_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX3_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX3_A396EmprCod = new String[] {""} ;
      T01RX3_A719PrdNum = new String[] {""} ;
      T01RX3_A681PrdAny = new short[1] ;
      sMode81 = "" ;
      T01RX8_A720PrdNumMes = new byte[1] ;
      T01RX8_A396EmprCod = new String[] {""} ;
      T01RX8_A719PrdNum = new String[] {""} ;
      T01RX8_A681PrdAny = new short[1] ;
      T01RX9_A720PrdNumMes = new byte[1] ;
      T01RX9_A396EmprCod = new String[] {""} ;
      T01RX9_A719PrdNum = new String[] {""} ;
      T01RX9_A681PrdAny = new short[1] ;
      T01RX2_A720PrdNumMes = new byte[1] ;
      T01RX2_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX2_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX2_A3659PrdKilTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX2_A3660PrdMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX2_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX2_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX2_A396EmprCod = new String[] {""} ;
      T01RX2_A719PrdNum = new String[] {""} ;
      T01RX2_A681PrdAny = new short[1] ;
      T01RX10_A676PrdAcuConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX14_A676PrdAcuConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RX16_A396EmprCod = new String[] {""} ;
      T01RX16_A719PrdNum = new String[] {""} ;
      T01RX16_A681PrdAny = new short[1] ;
      T01RX16_A720PrdNumMes = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZO676PrdAcuConA = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ745PrdUniCprM = DecimalUtil.ZERO ;
      ZZ744PrdUniConM = DecimalUtil.ZERO ;
      ZZ3659PrdKilTin = DecimalUtil.ZERO ;
      ZZ3660PrdMtrTin = DecimalUtil.ZERO ;
      ZZ749PrdValCprM = DecimalUtil.ZERO ;
      ZZ747PrdValConM = DecimalUtil.ZERO ;
      ZZ676PrdAcuConA = DecimalUtil.ZERO ;
      ZO744PrdUniConM = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.lprdes_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.lprdes_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.lprdes_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lprdes_trn__default(),
         new Object[] {
             new Object[] {
            T01RX2_A720PrdNumMes, T01RX2_A745PrdUniCprM, T01RX2_A744PrdUniConM, T01RX2_A3659PrdKilTin, T01RX2_A3660PrdMtrTin, T01RX2_A749PrdValCprM, T01RX2_A747PrdValConM, T01RX2_A396EmprCod, T01RX2_A719PrdNum, T01RX2_A681PrdAny
            }
            , new Object[] {
            T01RX3_A720PrdNumMes, T01RX3_A745PrdUniCprM, T01RX3_A744PrdUniConM, T01RX3_A3659PrdKilTin, T01RX3_A3660PrdMtrTin, T01RX3_A749PrdValCprM, T01RX3_A747PrdValConM, T01RX3_A396EmprCod, T01RX3_A719PrdNum, T01RX3_A681PrdAny
            }
            , new Object[] {
            T01RX4_A676PrdAcuConA
            }
            , new Object[] {
            T01RX5_A676PrdAcuConA
            }
            , new Object[] {
            T01RX6_A676PrdAcuConA, T01RX6_A720PrdNumMes, T01RX6_A745PrdUniCprM, T01RX6_A744PrdUniConM, T01RX6_A3659PrdKilTin, T01RX6_A3660PrdMtrTin, T01RX6_A749PrdValCprM, T01RX6_A747PrdValConM, T01RX6_A396EmprCod, T01RX6_A719PrdNum,
            T01RX6_A681PrdAny
            }
            , new Object[] {
            T01RX7_A396EmprCod, T01RX7_A719PrdNum, T01RX7_A681PrdAny, T01RX7_A720PrdNumMes
            }
            , new Object[] {
            T01RX8_A720PrdNumMes, T01RX8_A396EmprCod, T01RX8_A719PrdNum, T01RX8_A681PrdAny
            }
            , new Object[] {
            T01RX9_A720PrdNumMes, T01RX9_A396EmprCod, T01RX9_A719PrdNum, T01RX9_A681PrdAny
            }
            , new Object[] {
            T01RX10_A676PrdAcuConA
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RX14_A676PrdAcuConA
            }
            , new Object[] {
            }
            , new Object[] {
            T01RX16_A396EmprCod, T01RX16_A719PrdNum, T01RX16_A681PrdAny, T01RX16_A720PrdNumMes
            }
         }
      );
   }

   private byte Z720PrdNumMes ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A720PrdNumMes ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ720PrdNumMes ;
   private short Z681PrdAny ;
   private short A681PrdAny ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound81 ;
   private short nIsDirty_81 ;
   private short ZZ681PrdAny ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdAny_Enabled ;
   private int edtPrdNumMes_Enabled ;
   private int edtPrdUniCprM_Enabled ;
   private int edtPrdUniConM_Enabled ;
   private int edtPrdKilTin_Enabled ;
   private int edtPrdMtrTin_Enabled ;
   private int edtPrdValCprM_Enabled ;
   private int edtPrdValConM_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z745PrdUniCprM ;
   private java.math.BigDecimal Z744PrdUniConM ;
   private java.math.BigDecimal Z3659PrdKilTin ;
   private java.math.BigDecimal Z3660PrdMtrTin ;
   private java.math.BigDecimal Z749PrdValCprM ;
   private java.math.BigDecimal Z747PrdValConM ;
   private java.math.BigDecimal O744PrdUniConM ;
   private java.math.BigDecimal O676PrdAcuConA ;
   private java.math.BigDecimal A745PrdUniCprM ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal A3659PrdKilTin ;
   private java.math.BigDecimal A3660PrdMtrTin ;
   private java.math.BigDecimal A749PrdValCprM ;
   private java.math.BigDecimal A747PrdValConM ;
   private java.math.BigDecimal A676PrdAcuConA ;
   private java.math.BigDecimal Z676PrdAcuConA ;
   private java.math.BigDecimal ZO676PrdAcuConA ;
   private java.math.BigDecimal ZZ745PrdUniCprM ;
   private java.math.BigDecimal ZZ744PrdUniConM ;
   private java.math.BigDecimal ZZ3659PrdKilTin ;
   private java.math.BigDecimal ZZ3660PrdMtrTin ;
   private java.math.BigDecimal ZZ749PrdValCprM ;
   private java.math.BigDecimal ZZ747PrdValConM ;
   private java.math.BigDecimal ZZ676PrdAcuConA ;
   private java.math.BigDecimal ZO744PrdUniConM ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
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
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdAny_Internalname ;
   private String edtPrdAny_Jsonclick ;
   private String edtPrdNumMes_Internalname ;
   private String edtPrdNumMes_Jsonclick ;
   private String edtPrdUniCprM_Internalname ;
   private String edtPrdUniCprM_Jsonclick ;
   private String edtPrdUniConM_Internalname ;
   private String edtPrdUniConM_Jsonclick ;
   private String edtPrdKilTin_Internalname ;
   private String edtPrdKilTin_Jsonclick ;
   private String edtPrdMtrTin_Internalname ;
   private String edtPrdMtrTin_Jsonclick ;
   private String edtPrdValCprM_Internalname ;
   private String edtPrdValCprM_Jsonclick ;
   private String edtPrdValConM_Internalname ;
   private String edtPrdValConM_Jsonclick ;
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
   private String sMode81 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] T01RX6_A676PrdAcuConA ;
   private byte[] T01RX6_A720PrdNumMes ;
   private java.math.BigDecimal[] T01RX6_A745PrdUniCprM ;
   private java.math.BigDecimal[] T01RX6_A744PrdUniConM ;
   private java.math.BigDecimal[] T01RX6_A3659PrdKilTin ;
   private java.math.BigDecimal[] T01RX6_A3660PrdMtrTin ;
   private java.math.BigDecimal[] T01RX6_A749PrdValCprM ;
   private java.math.BigDecimal[] T01RX6_A747PrdValConM ;
   private String[] T01RX6_A396EmprCod ;
   private String[] T01RX6_A719PrdNum ;
   private short[] T01RX6_A681PrdAny ;
   private java.math.BigDecimal[] T01RX5_A676PrdAcuConA ;
   private String[] T01RX7_A396EmprCod ;
   private String[] T01RX7_A719PrdNum ;
   private short[] T01RX7_A681PrdAny ;
   private byte[] T01RX7_A720PrdNumMes ;
   private byte[] T01RX3_A720PrdNumMes ;
   private java.math.BigDecimal[] T01RX3_A745PrdUniCprM ;
   private java.math.BigDecimal[] T01RX3_A744PrdUniConM ;
   private java.math.BigDecimal[] T01RX3_A3659PrdKilTin ;
   private java.math.BigDecimal[] T01RX3_A3660PrdMtrTin ;
   private java.math.BigDecimal[] T01RX3_A749PrdValCprM ;
   private java.math.BigDecimal[] T01RX3_A747PrdValConM ;
   private String[] T01RX3_A396EmprCod ;
   private String[] T01RX3_A719PrdNum ;
   private short[] T01RX3_A681PrdAny ;
   private byte[] T01RX8_A720PrdNumMes ;
   private String[] T01RX8_A396EmprCod ;
   private String[] T01RX8_A719PrdNum ;
   private short[] T01RX8_A681PrdAny ;
   private byte[] T01RX9_A720PrdNumMes ;
   private String[] T01RX9_A396EmprCod ;
   private String[] T01RX9_A719PrdNum ;
   private short[] T01RX9_A681PrdAny ;
   private byte[] T01RX2_A720PrdNumMes ;
   private java.math.BigDecimal[] T01RX2_A745PrdUniCprM ;
   private java.math.BigDecimal[] T01RX2_A744PrdUniConM ;
   private java.math.BigDecimal[] T01RX2_A3659PrdKilTin ;
   private java.math.BigDecimal[] T01RX2_A3660PrdMtrTin ;
   private java.math.BigDecimal[] T01RX2_A749PrdValCprM ;
   private java.math.BigDecimal[] T01RX2_A747PrdValConM ;
   private String[] T01RX2_A396EmprCod ;
   private String[] T01RX2_A719PrdNum ;
   private short[] T01RX2_A681PrdAny ;
   private java.math.BigDecimal[] T01RX10_A676PrdAcuConA ;
   private java.math.BigDecimal[] T01RX14_A676PrdAcuConA ;
   private String[] T01RX16_A396EmprCod ;
   private String[] T01RX16_A719PrdNum ;
   private short[] T01RX16_A681PrdAny ;
   private byte[] T01RX16_A720PrdNumMes ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.math.BigDecimal[] T01RX4_A676PrdAcuConA ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class lprdes_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lprdes_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lprdes_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lprdes_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RX2", "SELECT PrdNumMes, PrdUniCprM, PrdUniConM, PrdKilTin, PrdMtrTin, PrdValCprM, PrdValConM, EmprCod, PrdNum, PrdAny FROM TXPLPRDES WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdNumMes = ?  FOR UPDATE OF PrdUniCprM, PrdUniConM, PrdKilTin, PrdMtrTin, PrdValCprM, PrdValConM NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RX3", "SELECT PrdNumMes, PrdUniCprM, PrdUniConM, PrdKilTin, PrdMtrTin, PrdValCprM, PrdValConM, EmprCod, PrdNum, PrdAny FROM TXPLPRDES WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdNumMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RX4", "SELECT PrdAcuConA FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ?  FOR UPDATE OF PrdAcuConA NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RX5", "SELECT PrdAcuConA FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RX6", "SELECT /*+ FIRST_ROWS(100) */ T2.PrdAcuConA, TM1.PrdNumMes, TM1.PrdUniCprM, TM1.PrdUniConM, TM1.PrdKilTin, TM1.PrdMtrTin, TM1.PrdValCprM, TM1.PrdValConM, TM1.EmprCod, TM1.PrdNum, TM1.PrdAny FROM (TXPLPRDES TM1 INNER JOIN TXPCPRDES T2 ON T2.EmprCod = TM1.EmprCod AND T2.PrdNum = TM1.PrdNum AND T2.PrdAny = TM1.PrdAny) WHERE TM1.PrdNumMes = ? and TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.PrdAny = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.PrdAny, TM1.PrdNumMes ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RX7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, PrdAny, PrdNumMes FROM TXPLPRDES WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdNumMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RX8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ PrdNumMes, EmprCod, PrdNum, PrdAny FROM TXPLPRDES WHERE ( PrdNumMes > ? or PrdNumMes = ? and EmprCod > ? or EmprCod = ? and PrdNumMes = ? and PrdNum > ? or PrdNum = ? and EmprCod = ? and PrdNumMes = ? and PrdAny > ?) ORDER BY EmprCod, PrdNum, PrdAny, PrdNumMes) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RX9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ PrdNumMes, EmprCod, PrdNum, PrdAny FROM TXPLPRDES WHERE ( PrdNumMes < ? or PrdNumMes = ? and EmprCod < ? or EmprCod = ? and PrdNumMes = ? and PrdNum < ? or PrdNum = ? and EmprCod = ? and PrdNumMes = ? and PrdAny < ?) ORDER BY EmprCod DESC, PrdNum DESC, PrdAny DESC, PrdNumMes DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RX10", "SELECT PrdAcuConA FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ?  FOR UPDATE OF PrdAcuConA NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01RX11", "INSERT INTO TXPLPRDES(PrdNumMes, PrdUniCprM, PrdUniConM, PrdKilTin, PrdMtrTin, PrdValCprM, PrdValConM, EmprCod, PrdNum, PrdAny) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPRDES")
         ,new UpdateCursor("T01RX12", "UPDATE TXPLPRDES SET PrdUniCprM=?, PrdUniConM=?, PrdKilTin=?, PrdMtrTin=?, PrdValCprM=?, PrdValConM=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdNumMes = ?", GX_NOMASK, "TXPLPRDES")
         ,new UpdateCursor("T01RX13", "DELETE FROM TXPLPRDES  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdNumMes = ?", GX_NOMASK, "TXPLPRDES")
         ,new ForEachCursor("T01RX14", "SELECT PrdAcuConA FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01RX15", "UPDATE TXPCPRDES SET PrdAcuConA=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ?", GX_NOMASK, "TXPCPRDES")
         ,new ForEachCursor("T01RX16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, PrdAny, PrdNumMes FROM TXPLPRDES ORDER BY EmprCod, PrdNum, PrdAny, PrdNumMes ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               return;
            case 12 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 4);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 10 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

