package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class treccor_trn_impl extends GXDataArea
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
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = httpContext.GetPar( "ForSer") ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = httpContext.GetPar( "ForColNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Recargos por color", ""), (short)(0)) ;
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

   public treccor_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public treccor_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( treccor_trn_impl.class ));
   }

   public treccor_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Recargos por color", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\Treccor_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Facturacion\\Treccor_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForSer_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForColNom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForColNum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipColCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipColCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecCorULin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecCorULin_Internalname, httpContext.getMessage( "Ultima Linea Recargos Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecCorULin_Internalname, GXutil.ltrim( localUtil.ntoc( A1518RecCorULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecCorULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1518RecCorULin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1518RecCorULin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecCorULin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecCorULin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecCorLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecCorLin_Internalname, httpContext.getMessage( "Linea Recargos Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecCorLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1519RecCorLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecCorLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1519RecCorLin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1519RecCorLin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecCorLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecCorLin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecValIni_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecValIni_Internalname, httpContext.getMessage( "Valor Inicial", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecValIni_Internalname, GXutil.ltrim( localUtil.ntoc( A1520RecValIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecValIni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1520RecValIni), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1520RecValIni), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecValIni_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecValIni_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecValFin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecValFin_Internalname, httpContext.getMessage( "Valor Final", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecValFin_Internalname, GXutil.ltrim( localUtil.ntoc( A1521RecValFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecValFin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1521RecValFin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1521RecValFin), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecValFin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecValFin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecCanRec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecCanRec_Internalname, httpContext.getMessage( "RecCanRec", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecCanRec_Internalname, GXutil.ltrim( localUtil.ntoc( A1522RecCanRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecCanRec_Enabled!=0) ? localUtil.format( A1522RecCanRec, "ZZZZZZ9.999") : localUtil.format( A1522RecCanRec, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecCanRec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecCanRec_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecIncPor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecIncPor_Internalname, httpContext.getMessage( "Porcentaje", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecIncPor_Internalname, GXutil.ltrim( localUtil.ntoc( A3322RecIncPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecIncPor_Enabled!=0) ? localUtil.format( A3322RecIncPor, "ZZ9.99") : localUtil.format( A3322RecIncPor, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecIncPor_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecIncPor_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Treccor_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Treccor_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Treccor_TRN.htm");
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
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z494ForSer = httpContext.cgiGet( "Z494ForSer") ;
         Z482ForColNom = httpContext.cgiGet( "Z482ForColNom") ;
         Z483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z483ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1519RecCorLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1519RecCorLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1520RecValIni = (int)(localUtil.ctol( httpContext.cgiGet( "Z1520RecValIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1521RecValFin = (int)(localUtil.ctol( httpContext.cgiGet( "Z1521RecValFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1522RecCanRec = localUtil.ctond( httpContext.cgiGet( "Z1522RecCanRec")) ;
         Z3322RecIncPor = localUtil.ctond( httpContext.cgiGet( "Z3322RecIncPor")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A252CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A483ForColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         }
         else
         {
            A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPCOLCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipColCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A831TipColCod = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         }
         else
         {
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         }
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A1518RecCorULin = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecCorULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1518RecCorULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1518RecCorULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1518RecCorULin), 2, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecCorLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecCorLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECCORLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecCorLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1519RecCorLin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1519RecCorLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1519RecCorLin), 2, 0));
         }
         else
         {
            A1519RecCorLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecCorLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1519RecCorLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1519RecCorLin), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecValIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecValIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECVALINI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecValIni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1520RecValIni = 0 ;
            n1520RecValIni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1520RecValIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1520RecValIni), 8, 0));
         }
         else
         {
            A1520RecValIni = (int)(localUtil.ctol( httpContext.cgiGet( edtRecValIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1520RecValIni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1520RecValIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1520RecValIni), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecValFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecValFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECVALFIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecValFin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1521RecValFin = 0 ;
            n1521RecValFin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1521RecValFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1521RecValFin), 8, 0));
         }
         else
         {
            A1521RecValFin = (int)(localUtil.ctol( httpContext.cgiGet( edtRecValFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1521RecValFin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1521RecValFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1521RecValFin), 8, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecCanRec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecCanRec_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECCANREC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecCanRec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1522RecCanRec = DecimalUtil.ZERO ;
            n1522RecCanRec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1522RecCanRec", GXutil.ltrimstr( A1522RecCanRec, 13, 5));
         }
         else
         {
            A1522RecCanRec = localUtil.ctond( httpContext.cgiGet( edtRecCanRec_Internalname)) ;
            n1522RecCanRec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1522RecCanRec", GXutil.ltrimstr( A1522RecCanRec, 13, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecIncPor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecIncPor_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECINCPOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecIncPor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3322RecIncPor = DecimalUtil.ZERO ;
            n3322RecIncPor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3322RecIncPor", GXutil.ltrimstr( A3322RecIncPor, 6, 2));
         }
         else
         {
            A3322RecIncPor = localUtil.ctond( httpContext.cgiGet( edtRecIncPor_Internalname)) ;
            n3322RecIncPor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3322RecIncPor", GXutil.ltrimstr( A3322RecIncPor, 6, 2));
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = httpContext.GetPar( "ForSer") ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = httpContext.GetPar( "ForColNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A1519RecCorLin = (byte)(GXutil.lval( httpContext.GetPar( "RecCorLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1519RecCorLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1519RecCorLin), 2, 0));
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
            initAll1VD216( ) ;
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
      disableAttributes1VD216( ) ;
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

   public void resetCaption1VD0( )
   {
   }

   public void zm1VD216( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1520RecValIni = T01VD3_A1520RecValIni[0] ;
            Z1521RecValFin = T01VD3_A1521RecValFin[0] ;
            Z1522RecCanRec = T01VD3_A1522RecCanRec[0] ;
            Z3322RecIncPor = T01VD3_A3322RecIncPor[0] ;
         }
         else
         {
            Z1520RecValIni = A1520RecValIni ;
            Z1521RecValFin = A1521RecValFin ;
            Z1522RecCanRec = A1522RecCanRec ;
            Z3322RecIncPor = A3322RecIncPor ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z1519RecCorLin = A1519RecCorLin ;
         Z1520RecValIni = A1520RecValIni ;
         Z1521RecValFin = A1521RecValFin ;
         Z1522RecCanRec = A1522RecCanRec ;
         Z3322RecIncPor = A3322RecIncPor ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z831TipColCod = A831TipColCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z279CliNom = A279CliNom ;
         Z1518RecCorULin = A1518RecCorULin ;
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

   public void load1VD216( )
   {
      /* Using cursor T01VD6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Byte.valueOf(A1519RecCorLin)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound216 = (short)(1) ;
         A279CliNom = T01VD6_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A1518RecCorULin = T01VD6_A1518RecCorULin[0] ;
         n1518RecCorULin = T01VD6_n1518RecCorULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1518RecCorULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1518RecCorULin), 2, 0));
         A1520RecValIni = T01VD6_A1520RecValIni[0] ;
         n1520RecValIni = T01VD6_n1520RecValIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1520RecValIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1520RecValIni), 8, 0));
         A1521RecValFin = T01VD6_A1521RecValFin[0] ;
         n1521RecValFin = T01VD6_n1521RecValFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1521RecValFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1521RecValFin), 8, 0));
         A1522RecCanRec = T01VD6_A1522RecCanRec[0] ;
         n1522RecCanRec = T01VD6_n1522RecCanRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1522RecCanRec", GXutil.ltrimstr( A1522RecCanRec, 13, 5));
         A3322RecIncPor = T01VD6_A3322RecIncPor[0] ;
         n3322RecIncPor = T01VD6_n3322RecIncPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3322RecIncPor", GXutil.ltrimstr( A3322RecIncPor, 6, 2));
         zm1VD216( -1) ;
      }
      pr_default.close(4);
      onLoadActions1VD216( ) ;
   }

   public void onLoadActions1VD216( )
   {
   }

   public void checkExtendedTable1VD216( )
   {
      nIsDirty_216 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01VD4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01VD4_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(2);
      /* Using cursor T01VD5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1518RecCorULin = T01VD5_A1518RecCorULin[0] ;
      n1518RecCorULin = T01VD5_n1518RecCorULin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1518RecCorULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1518RecCorULin), 2, 0));
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1VD216( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01VD7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01VD7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_3( String A396EmprCod ,
                         int A252CliCod ,
                         String A494ForSer ,
                         String A482ForColNom ,
                         int A483ForColNum ,
                         byte A831TipColCod )
   {
      /* Using cursor T01VD8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1518RecCorULin = T01VD8_A1518RecCorULin[0] ;
      n1518RecCorULin = T01VD8_n1518RecCorULin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1518RecCorULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1518RecCorULin), 2, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1518RecCorULin, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1VD216( )
   {
      /* Using cursor T01VD9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Byte.valueOf(A1519RecCorLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound216 = (short)(1) ;
      }
      else
      {
         RcdFound216 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01VD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Byte.valueOf(A1519RecCorLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1VD216( 1) ;
         RcdFound216 = (short)(1) ;
         A1519RecCorLin = T01VD3_A1519RecCorLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1519RecCorLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1519RecCorLin), 2, 0));
         A1520RecValIni = T01VD3_A1520RecValIni[0] ;
         n1520RecValIni = T01VD3_n1520RecValIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1520RecValIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1520RecValIni), 8, 0));
         A1521RecValFin = T01VD3_A1521RecValFin[0] ;
         n1521RecValFin = T01VD3_n1521RecValFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1521RecValFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1521RecValFin), 8, 0));
         A1522RecCanRec = T01VD3_A1522RecCanRec[0] ;
         n1522RecCanRec = T01VD3_n1522RecCanRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1522RecCanRec", GXutil.ltrimstr( A1522RecCanRec, 13, 5));
         A3322RecIncPor = T01VD3_A3322RecIncPor[0] ;
         n3322RecIncPor = T01VD3_n3322RecIncPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3322RecIncPor", GXutil.ltrimstr( A3322RecIncPor, 6, 2));
         A396EmprCod = T01VD3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01VD3_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A831TipColCod = T01VD3_A831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A494ForSer = T01VD3_A494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T01VD3_A482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T01VD3_A483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z1519RecCorLin = A1519RecCorLin ;
         sMode216 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1VD216( ) ;
         if ( AnyError == 1 )
         {
            RcdFound216 = (short)(0) ;
            initializeNonKey1VD216( ) ;
         }
         Gx_mode = sMode216 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound216 = (short)(0) ;
         initializeNonKey1VD216( ) ;
         sMode216 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode216 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1VD216( ) ;
      if ( RcdFound216 == 0 )
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
      RcdFound216 = (short)(0) ;
      /* Using cursor T01VD10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A494ForSer, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, A482ForColNom, A482ForColNom, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A483ForColNum), Integer.valueOf(A483ForColNum), A482ForColNom, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A831TipColCod), Integer.valueOf(A483ForColNum), A482ForColNom, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, Byte.valueOf(A1519RecCorLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01VD10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD10_A252CliCod[0] < A252CliCod ) || ( T01VD10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VD10_A494ForSer[0], A494ForSer) < 0 ) || ( GXutil.strcmp(T01VD10_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VD10_A482ForColNom[0], A482ForColNom) < 0 ) || ( GXutil.strcmp(T01VD10_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01VD10_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD10_A483ForColNum[0] < A483ForColNum ) || ( T01VD10_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01VD10_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01VD10_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD10_A831TipColCod[0] < A831TipColCod ) || ( T01VD10_A831TipColCod[0] == A831TipColCod ) && ( T01VD10_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01VD10_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01VD10_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD10_A1519RecCorLin[0] < A1519RecCorLin ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01VD10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD10_A252CliCod[0] > A252CliCod ) || ( T01VD10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VD10_A494ForSer[0], A494ForSer) > 0 ) || ( GXutil.strcmp(T01VD10_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VD10_A482ForColNom[0], A482ForColNom) > 0 ) || ( GXutil.strcmp(T01VD10_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01VD10_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD10_A483ForColNum[0] > A483ForColNum ) || ( T01VD10_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01VD10_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01VD10_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD10_A831TipColCod[0] > A831TipColCod ) || ( T01VD10_A831TipColCod[0] == A831TipColCod ) && ( T01VD10_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01VD10_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01VD10_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD10_A1519RecCorLin[0] > A1519RecCorLin ) ) )
         {
            A396EmprCod = T01VD10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01VD10_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = T01VD10_A494ForSer[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = T01VD10_A482ForColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = T01VD10_A483ForColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = T01VD10_A831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A1519RecCorLin = T01VD10_A1519RecCorLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1519RecCorLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1519RecCorLin), 2, 0));
            RcdFound216 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound216 = (short)(0) ;
      /* Using cursor T01VD11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A494ForSer, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, A482ForColNom, A482ForColNom, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A483ForColNum), Integer.valueOf(A483ForColNum), A482ForColNom, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A831TipColCod), Integer.valueOf(A483ForColNum), A482ForColNom, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, Byte.valueOf(A1519RecCorLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01VD11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD11_A252CliCod[0] > A252CliCod ) || ( T01VD11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VD11_A494ForSer[0], A494ForSer) > 0 ) || ( GXutil.strcmp(T01VD11_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VD11_A482ForColNom[0], A482ForColNom) > 0 ) || ( GXutil.strcmp(T01VD11_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01VD11_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD11_A483ForColNum[0] > A483ForColNum ) || ( T01VD11_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01VD11_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01VD11_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD11_A831TipColCod[0] > A831TipColCod ) || ( T01VD11_A831TipColCod[0] == A831TipColCod ) && ( T01VD11_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01VD11_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01VD11_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD11_A1519RecCorLin[0] > A1519RecCorLin ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01VD11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD11_A252CliCod[0] < A252CliCod ) || ( T01VD11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VD11_A494ForSer[0], A494ForSer) < 0 ) || ( GXutil.strcmp(T01VD11_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VD11_A482ForColNom[0], A482ForColNom) < 0 ) || ( GXutil.strcmp(T01VD11_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01VD11_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD11_A483ForColNum[0] < A483ForColNum ) || ( T01VD11_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01VD11_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01VD11_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD11_A831TipColCod[0] < A831TipColCod ) || ( T01VD11_A831TipColCod[0] == A831TipColCod ) && ( T01VD11_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01VD11_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01VD11_A494ForSer[0], A494ForSer) == 0 ) && ( T01VD11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VD11_A1519RecCorLin[0] < A1519RecCorLin ) ) )
         {
            A396EmprCod = T01VD11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01VD11_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = T01VD11_A494ForSer[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = T01VD11_A482ForColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = T01VD11_A483ForColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = T01VD11_A831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A1519RecCorLin = T01VD11_A1519RecCorLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1519RecCorLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1519RecCorLin), 2, 0));
            RcdFound216 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VD216( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1VD216( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound216 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( A1519RecCorLin != Z1519RecCorLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A494ForSer = Z494ForSer ;
               httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
               A482ForColNom = Z482ForColNom ;
               httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
               A483ForColNum = Z483ForColNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
               A831TipColCod = Z831TipColCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               A1519RecCorLin = Z1519RecCorLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1519RecCorLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1519RecCorLin), 2, 0));
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
               update1VD216( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( A1519RecCorLin != Z1519RecCorLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1VD216( ) ;
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
                  insert1VD216( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( A1519RecCorLin != Z1519RecCorLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = Z494ForSer ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = Z482ForColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = Z483ForColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = Z831TipColCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A1519RecCorLin = Z1519RecCorLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1519RecCorLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1519RecCorLin), 2, 0));
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
      if ( RcdFound216 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtRecValIni_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1VD216( ) ;
      if ( RcdFound216 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecValIni_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VD216( ) ;
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
      if ( RcdFound216 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecValIni_Internalname ;
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
      if ( RcdFound216 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecValIni_Internalname ;
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
      scanStart1VD216( ) ;
      if ( RcdFound216 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound216 != 0 )
         {
            scanNext1VD216( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecValIni_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VD216( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1VD216( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01VD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Byte.valueOf(A1519RecCorLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECCOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z1520RecValIni != T01VD2_A1520RecValIni[0] ) || ( Z1521RecValFin != T01VD2_A1521RecValFin[0] ) || ( DecimalUtil.compareTo(Z1522RecCanRec, T01VD2_A1522RecCanRec[0]) != 0 ) || ( DecimalUtil.compareTo(Z3322RecIncPor, T01VD2_A3322RecIncPor[0]) != 0 ) )
         {
            if ( Z1520RecValIni != T01VD2_A1520RecValIni[0] )
            {
               GXutil.writeLogln("facturacion.treccor_trn:[seudo value changed for attri]"+"RecValIni");
               GXutil.writeLogRaw("Old: ",Z1520RecValIni);
               GXutil.writeLogRaw("Current: ",T01VD2_A1520RecValIni[0]);
            }
            if ( Z1521RecValFin != T01VD2_A1521RecValFin[0] )
            {
               GXutil.writeLogln("facturacion.treccor_trn:[seudo value changed for attri]"+"RecValFin");
               GXutil.writeLogRaw("Old: ",Z1521RecValFin);
               GXutil.writeLogRaw("Current: ",T01VD2_A1521RecValFin[0]);
            }
            if ( DecimalUtil.compareTo(Z1522RecCanRec, T01VD2_A1522RecCanRec[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.treccor_trn:[seudo value changed for attri]"+"RecCanRec");
               GXutil.writeLogRaw("Old: ",Z1522RecCanRec);
               GXutil.writeLogRaw("Current: ",T01VD2_A1522RecCanRec[0]);
            }
            if ( DecimalUtil.compareTo(Z3322RecIncPor, T01VD2_A3322RecIncPor[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.treccor_trn:[seudo value changed for attri]"+"RecIncPor");
               GXutil.writeLogRaw("Old: ",Z3322RecIncPor);
               GXutil.writeLogRaw("Current: ",T01VD2_A3322RecIncPor[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRECCOR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VD216( )
   {
      beforeValidate1VD216( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VD216( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VD216( 0) ;
         checkOptimisticConcurrency1VD216( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VD216( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VD216( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VD12 */
                  pr_default.execute(10, new Object[] {Byte.valueOf(A1519RecCorLin), Boolean.valueOf(n1520RecValIni), Integer.valueOf(A1520RecValIni), Boolean.valueOf(n1521RecValFin), Integer.valueOf(A1521RecValFin), Boolean.valueOf(n1522RecCanRec), A1522RecCanRec, Boolean.valueOf(n3322RecIncPor), A3322RecIncPor, A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A831TipColCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECCOR");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        resetCaption1VD0( ) ;
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
            load1VD216( ) ;
         }
         endLevel1VD216( ) ;
      }
      closeExtendedTableCursors1VD216( ) ;
   }

   public void update1VD216( )
   {
      beforeValidate1VD216( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VD216( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VD216( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VD216( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VD216( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VD13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n1520RecValIni), Integer.valueOf(A1520RecValIni), Boolean.valueOf(n1521RecValFin), Integer.valueOf(A1521RecValFin), Boolean.valueOf(n1522RecCanRec), A1522RecCanRec, Boolean.valueOf(n3322RecIncPor), A3322RecIncPor, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Byte.valueOf(A1519RecCorLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECCOR");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECCOR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VD216( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1VD0( ) ;
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
         endLevel1VD216( ) ;
      }
      closeExtendedTableCursors1VD216( ) ;
   }

   public void deferredUpdate1VD216( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1VD216( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VD216( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VD216( ) ;
         afterConfirm1VD216( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VD216( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01VD14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Byte.valueOf(A1519RecCorLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECCOR");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound216 == 0 )
                     {
                        initAll1VD216( ) ;
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
                     resetCaption1VD0( ) ;
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
      sMode216 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1VD216( ) ;
      Gx_mode = sMode216 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1VD216( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01VD15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01VD15_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(13);
         /* Using cursor T01VD16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         A1518RecCorULin = T01VD16_A1518RecCorULin[0] ;
         n1518RecCorULin = T01VD16_n1518RecCorULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1518RecCorULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1518RecCorULin), 2, 0));
         pr_default.close(14);
      }
   }

   public void endLevel1VD216( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VD216( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.treccor_trn");
         if ( AnyError == 0 )
         {
            confirmValues1VD0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.treccor_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1VD216( )
   {
      /* Using cursor T01VD17 */
      pr_default.execute(15);
      RcdFound216 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound216 = (short)(1) ;
         A396EmprCod = T01VD17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01VD17_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = T01VD17_A494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T01VD17_A482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T01VD17_A483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = T01VD17_A831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A1519RecCorLin = T01VD17_A1519RecCorLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1519RecCorLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1519RecCorLin), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1VD216( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound216 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound216 = (short)(1) ;
         A396EmprCod = T01VD17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01VD17_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = T01VD17_A494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T01VD17_A482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T01VD17_A483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = T01VD17_A831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A1519RecCorLin = T01VD17_A1519RecCorLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1519RecCorLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1519RecCorLin), 2, 0));
      }
   }

   public void scanEnd1VD216( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1VD216( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1VD216( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VD216( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VD216( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VD216( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VD216( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VD216( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtForSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), true);
      edtForColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), true);
      edtForColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), true);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtRecCorULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecCorULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecCorULin_Enabled), 5, 0), true);
      edtRecCorLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecCorLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecCorLin_Enabled), 5, 0), true);
      edtRecValIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecValIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecValIni_Enabled), 5, 0), true);
      edtRecValFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecValFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecValFin_Enabled), 5, 0), true);
      edtRecCanRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecCanRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecCanRec_Enabled), 5, 0), true);
      edtRecIncPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecIncPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecIncPor_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1VD216( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1VD0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.treccor_trn", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1519RecCorLin", GXutil.ltrim( localUtil.ntoc( Z1519RecCorLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1520RecValIni", GXutil.ltrim( localUtil.ntoc( Z1520RecValIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1521RecValFin", GXutil.ltrim( localUtil.ntoc( Z1521RecValFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1522RecCanRec", GXutil.ltrim( localUtil.ntoc( Z1522RecCanRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3322RecIncPor", GXutil.ltrim( localUtil.ntoc( Z3322RecIncPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.facturacion.treccor_trn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.Treccor_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recargos por color", "") ;
   }

   public void initializeNonKey1VD216( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A1518RecCorULin = (byte)(0) ;
      n1518RecCorULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1518RecCorULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1518RecCorULin), 2, 0));
      A1520RecValIni = 0 ;
      n1520RecValIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1520RecValIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1520RecValIni), 8, 0));
      A1521RecValFin = 0 ;
      n1521RecValFin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1521RecValFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1521RecValFin), 8, 0));
      A1522RecCanRec = DecimalUtil.ZERO ;
      n1522RecCanRec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1522RecCanRec", GXutil.ltrimstr( A1522RecCanRec, 13, 5));
      A3322RecIncPor = DecimalUtil.ZERO ;
      n3322RecIncPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3322RecIncPor", GXutil.ltrimstr( A3322RecIncPor, 6, 2));
      Z1520RecValIni = 0 ;
      Z1521RecValFin = 0 ;
      Z1522RecCanRec = DecimalUtil.ZERO ;
      Z3322RecIncPor = DecimalUtil.ZERO ;
   }

   public void initAll1VD216( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A494ForSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
      A482ForColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
      A483ForColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      A831TipColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      A1519RecCorLin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1519RecCorLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1519RecCorLin), 2, 0));
      initializeNonKey1VD216( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016401264", true, true);
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
      httpContext.AddJavascriptSource("facturacion/treccor_trn.js", "?202661016401264", false, true);
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
      edtCliCod_Internalname = "CLICOD" ;
      edtForSer_Internalname = "FORSER" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtRecCorULin_Internalname = "RECCORULIN" ;
      edtRecCorLin_Internalname = "RECCORLIN" ;
      edtRecValIni_Internalname = "RECVALINI" ;
      edtRecValFin_Internalname = "RECVALFIN" ;
      edtRecCanRec_Internalname = "RECCANREC" ;
      edtRecIncPor_Internalname = "RECINCPOR" ;
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
      Form.setCaption( httpContext.getMessage( "Recargos por color", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtRecIncPor_Jsonclick = "" ;
      edtRecIncPor_Enabled = 1 ;
      edtRecCanRec_Jsonclick = "" ;
      edtRecCanRec_Enabled = 1 ;
      edtRecValFin_Jsonclick = "" ;
      edtRecValFin_Enabled = 1 ;
      edtRecValIni_Jsonclick = "" ;
      edtRecValIni_Enabled = 1 ;
      edtRecCorLin_Jsonclick = "" ;
      edtRecCorLin_Enabled = 1 ;
      edtRecCorULin_Jsonclick = "" ;
      edtRecCorULin_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Enabled = 1 ;
      edtForColNum_Jsonclick = "" ;
      edtForColNum_Enabled = 1 ;
      edtForColNom_Jsonclick = "" ;
      edtForColNom_Enabled = 1 ;
      edtForSer_Jsonclick = "" ;
      edtForSer_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
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
      /* Using cursor T01VD15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01VD15_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(13);
      /* Using cursor T01VD16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1518RecCorULin = T01VD16_A1518RecCorULin[0] ;
      n1518RecCorULin = T01VD16_n1518RecCorULin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1518RecCorULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1518RecCorULin), 2, 0));
      pr_default.close(14);
      GX_FocusControl = edtRecValIni_Internalname ;
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

   public void valid_Clicod( )
   {
      /* Using cursor T01VD15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01VD15_A279CliNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Tipcolcod( )
   {
      n1518RecCorULin = false ;
      /* Using cursor T01VD16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A1518RecCorULin = T01VD16_A1518RecCorULin[0] ;
      n1518RecCorULin = T01VD16_n1518RecCorULin[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1518RecCorULin", GXutil.ltrim( localUtil.ntoc( A1518RecCorULin, (byte)(2), (byte)(0), ".", "")));
   }

   public void valid_Reccorlin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1520RecValIni", GXutil.ltrim( localUtil.ntoc( A1520RecValIni, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1521RecValFin", GXutil.ltrim( localUtil.ntoc( A1521RecValFin, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1522RecCanRec", GXutil.ltrim( localUtil.ntoc( A1522RecCanRec, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3322RecIncPor", GXutil.ltrim( localUtil.ntoc( A3322RecIncPor, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1518RecCorULin", GXutil.ltrim( localUtil.ntoc( A1518RecCorULin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1519RecCorLin", GXutil.ltrim( localUtil.ntoc( Z1519RecCorLin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1520RecValIni", GXutil.ltrim( localUtil.ntoc( Z1520RecValIni, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1521RecValFin", GXutil.ltrim( localUtil.ntoc( Z1521RecValFin, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1522RecCanRec", GXutil.ltrim( localUtil.ntoc( Z1522RecCanRec, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3322RecIncPor", GXutil.ltrim( localUtil.ntoc( Z3322RecIncPor, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1518RecCorULin", GXutil.ltrim( localUtil.ntoc( Z1518RecCorULin, (byte)(2), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[]");
      setEventMetadata("VALID_FORSER",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A1518RecCorULin',fld:'RECCORULIN',pic:'Z9'}]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[{av:'A1518RecCorULin',fld:'RECCORULIN',pic:'Z9'}]}");
      setEventMetadata("VALID_RECCORLIN","{handler:'valid_Reccorlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A1519RecCorLin',fld:'RECCORLIN',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RECCORLIN",",oparms:[{av:'A1520RecValIni',fld:'RECVALINI',pic:'ZZZZZZZ9'},{av:'A1521RecValFin',fld:'RECVALFIN',pic:'ZZZZZZZ9'},{av:'A1522RecCanRec',fld:'RECCANREC',pic:'ZZZZZZ9.999'},{av:'A3322RecIncPor',fld:'RECINCPOR',pic:'ZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A1518RecCorULin',fld:'RECCORULIN',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z494ForSer'},{av:'Z482ForColNom'},{av:'Z483ForColNum'},{av:'Z831TipColCod'},{av:'Z1519RecCorLin'},{av:'Z1520RecValIni'},{av:'Z1521RecValFin'},{av:'Z1522RecCanRec'},{av:'Z3322RecIncPor'},{av:'Z279CliNom'},{av:'Z1518RecCorULin'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z494ForSer = "" ;
      Z482ForColNom = "" ;
      Z1522RecCanRec = DecimalUtil.ZERO ;
      Z3322RecIncPor = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
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
      A279CliNom = "" ;
      A1522RecCanRec = DecimalUtil.ZERO ;
      A3322RecIncPor = DecimalUtil.ZERO ;
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
      Z279CliNom = "" ;
      T01VD6_A1519RecCorLin = new byte[1] ;
      T01VD6_A279CliNom = new String[] {""} ;
      T01VD6_A1518RecCorULin = new byte[1] ;
      T01VD6_n1518RecCorULin = new boolean[] {false} ;
      T01VD6_A1520RecValIni = new int[1] ;
      T01VD6_n1520RecValIni = new boolean[] {false} ;
      T01VD6_A1521RecValFin = new int[1] ;
      T01VD6_n1521RecValFin = new boolean[] {false} ;
      T01VD6_A1522RecCanRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VD6_n1522RecCanRec = new boolean[] {false} ;
      T01VD6_A3322RecIncPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VD6_n3322RecIncPor = new boolean[] {false} ;
      T01VD6_A396EmprCod = new String[] {""} ;
      T01VD6_A252CliCod = new int[1] ;
      T01VD6_A831TipColCod = new byte[1] ;
      T01VD6_A494ForSer = new String[] {""} ;
      T01VD6_A482ForColNom = new String[] {""} ;
      T01VD6_A483ForColNum = new int[1] ;
      T01VD4_A279CliNom = new String[] {""} ;
      T01VD5_A1518RecCorULin = new byte[1] ;
      T01VD5_n1518RecCorULin = new boolean[] {false} ;
      T01VD7_A279CliNom = new String[] {""} ;
      T01VD8_A1518RecCorULin = new byte[1] ;
      T01VD8_n1518RecCorULin = new boolean[] {false} ;
      T01VD9_A396EmprCod = new String[] {""} ;
      T01VD9_A252CliCod = new int[1] ;
      T01VD9_A494ForSer = new String[] {""} ;
      T01VD9_A482ForColNom = new String[] {""} ;
      T01VD9_A483ForColNum = new int[1] ;
      T01VD9_A831TipColCod = new byte[1] ;
      T01VD9_A1519RecCorLin = new byte[1] ;
      T01VD3_A1519RecCorLin = new byte[1] ;
      T01VD3_A1520RecValIni = new int[1] ;
      T01VD3_n1520RecValIni = new boolean[] {false} ;
      T01VD3_A1521RecValFin = new int[1] ;
      T01VD3_n1521RecValFin = new boolean[] {false} ;
      T01VD3_A1522RecCanRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VD3_n1522RecCanRec = new boolean[] {false} ;
      T01VD3_A3322RecIncPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VD3_n3322RecIncPor = new boolean[] {false} ;
      T01VD3_A396EmprCod = new String[] {""} ;
      T01VD3_A252CliCod = new int[1] ;
      T01VD3_A831TipColCod = new byte[1] ;
      T01VD3_A494ForSer = new String[] {""} ;
      T01VD3_A482ForColNom = new String[] {""} ;
      T01VD3_A483ForColNum = new int[1] ;
      sMode216 = "" ;
      T01VD10_A396EmprCod = new String[] {""} ;
      T01VD10_A252CliCod = new int[1] ;
      T01VD10_A494ForSer = new String[] {""} ;
      T01VD10_A482ForColNom = new String[] {""} ;
      T01VD10_A483ForColNum = new int[1] ;
      T01VD10_A831TipColCod = new byte[1] ;
      T01VD10_A1519RecCorLin = new byte[1] ;
      T01VD11_A396EmprCod = new String[] {""} ;
      T01VD11_A252CliCod = new int[1] ;
      T01VD11_A494ForSer = new String[] {""} ;
      T01VD11_A482ForColNom = new String[] {""} ;
      T01VD11_A483ForColNum = new int[1] ;
      T01VD11_A831TipColCod = new byte[1] ;
      T01VD11_A1519RecCorLin = new byte[1] ;
      T01VD2_A1519RecCorLin = new byte[1] ;
      T01VD2_A1520RecValIni = new int[1] ;
      T01VD2_n1520RecValIni = new boolean[] {false} ;
      T01VD2_A1521RecValFin = new int[1] ;
      T01VD2_n1521RecValFin = new boolean[] {false} ;
      T01VD2_A1522RecCanRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VD2_n1522RecCanRec = new boolean[] {false} ;
      T01VD2_A3322RecIncPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VD2_n3322RecIncPor = new boolean[] {false} ;
      T01VD2_A396EmprCod = new String[] {""} ;
      T01VD2_A252CliCod = new int[1] ;
      T01VD2_A831TipColCod = new byte[1] ;
      T01VD2_A494ForSer = new String[] {""} ;
      T01VD2_A482ForColNom = new String[] {""} ;
      T01VD2_A483ForColNum = new int[1] ;
      T01VD15_A279CliNom = new String[] {""} ;
      T01VD16_A1518RecCorULin = new byte[1] ;
      T01VD16_n1518RecCorULin = new boolean[] {false} ;
      T01VD17_A396EmprCod = new String[] {""} ;
      T01VD17_A252CliCod = new int[1] ;
      T01VD17_A494ForSer = new String[] {""} ;
      T01VD17_A482ForColNom = new String[] {""} ;
      T01VD17_A483ForColNum = new int[1] ;
      T01VD17_A831TipColCod = new byte[1] ;
      T01VD17_A1519RecCorLin = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ494ForSer = "" ;
      ZZ482ForColNom = "" ;
      ZZ1522RecCanRec = DecimalUtil.ZERO ;
      ZZ3322RecIncPor = DecimalUtil.ZERO ;
      ZZ279CliNom = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.treccor_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.treccor_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.treccor_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.treccor_trn__default(),
         new Object[] {
             new Object[] {
            T01VD2_A1519RecCorLin, T01VD2_A1520RecValIni, T01VD2_n1520RecValIni, T01VD2_A1521RecValFin, T01VD2_n1521RecValFin, T01VD2_A1522RecCanRec, T01VD2_n1522RecCanRec, T01VD2_A3322RecIncPor, T01VD2_n3322RecIncPor, T01VD2_A396EmprCod,
            T01VD2_A252CliCod, T01VD2_A831TipColCod, T01VD2_A494ForSer, T01VD2_A482ForColNom, T01VD2_A483ForColNum
            }
            , new Object[] {
            T01VD3_A1519RecCorLin, T01VD3_A1520RecValIni, T01VD3_n1520RecValIni, T01VD3_A1521RecValFin, T01VD3_n1521RecValFin, T01VD3_A1522RecCanRec, T01VD3_n1522RecCanRec, T01VD3_A3322RecIncPor, T01VD3_n3322RecIncPor, T01VD3_A396EmprCod,
            T01VD3_A252CliCod, T01VD3_A831TipColCod, T01VD3_A494ForSer, T01VD3_A482ForColNom, T01VD3_A483ForColNum
            }
            , new Object[] {
            T01VD4_A279CliNom
            }
            , new Object[] {
            T01VD5_A1518RecCorULin, T01VD5_n1518RecCorULin
            }
            , new Object[] {
            T01VD6_A1519RecCorLin, T01VD6_A279CliNom, T01VD6_A1518RecCorULin, T01VD6_n1518RecCorULin, T01VD6_A1520RecValIni, T01VD6_n1520RecValIni, T01VD6_A1521RecValFin, T01VD6_n1521RecValFin, T01VD6_A1522RecCanRec, T01VD6_n1522RecCanRec,
            T01VD6_A3322RecIncPor, T01VD6_n3322RecIncPor, T01VD6_A396EmprCod, T01VD6_A252CliCod, T01VD6_A831TipColCod, T01VD6_A494ForSer, T01VD6_A482ForColNom, T01VD6_A483ForColNum
            }
            , new Object[] {
            T01VD7_A279CliNom
            }
            , new Object[] {
            T01VD8_A1518RecCorULin, T01VD8_n1518RecCorULin
            }
            , new Object[] {
            T01VD9_A396EmprCod, T01VD9_A252CliCod, T01VD9_A494ForSer, T01VD9_A482ForColNom, T01VD9_A483ForColNum, T01VD9_A831TipColCod, T01VD9_A1519RecCorLin
            }
            , new Object[] {
            T01VD10_A396EmprCod, T01VD10_A252CliCod, T01VD10_A494ForSer, T01VD10_A482ForColNom, T01VD10_A483ForColNum, T01VD10_A831TipColCod, T01VD10_A1519RecCorLin
            }
            , new Object[] {
            T01VD11_A396EmprCod, T01VD11_A252CliCod, T01VD11_A494ForSer, T01VD11_A482ForColNom, T01VD11_A483ForColNum, T01VD11_A831TipColCod, T01VD11_A1519RecCorLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01VD15_A279CliNom
            }
            , new Object[] {
            T01VD16_A1518RecCorULin, T01VD16_n1518RecCorULin
            }
            , new Object[] {
            T01VD17_A396EmprCod, T01VD17_A252CliCod, T01VD17_A494ForSer, T01VD17_A482ForColNom, T01VD17_A483ForColNum, T01VD17_A831TipColCod, T01VD17_A1519RecCorLin
            }
         }
      );
   }

   private byte Z831TipColCod ;
   private byte Z1519RecCorLin ;
   private byte GxWebError ;
   private byte A831TipColCod ;
   private byte nKeyPressed ;
   private byte A1518RecCorULin ;
   private byte A1519RecCorLin ;
   private byte Z1518RecCorULin ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ831TipColCod ;
   private byte ZZ1519RecCorLin ;
   private byte ZZ1518RecCorULin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound216 ;
   private short nIsDirty_216 ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int Z1520RecValIni ;
   private int Z1521RecValFin ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtForSer_Enabled ;
   private int edtForColNom_Enabled ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtRecCorULin_Enabled ;
   private int edtRecCorLin_Enabled ;
   private int A1520RecValIni ;
   private int edtRecValIni_Enabled ;
   private int A1521RecValFin ;
   private int edtRecValFin_Enabled ;
   private int edtRecCanRec_Enabled ;
   private int edtRecIncPor_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ252CliCod ;
   private int ZZ483ForColNum ;
   private int ZZ1520RecValIni ;
   private int ZZ1521RecValFin ;
   private java.math.BigDecimal Z1522RecCanRec ;
   private java.math.BigDecimal Z3322RecIncPor ;
   private java.math.BigDecimal A1522RecCanRec ;
   private java.math.BigDecimal A3322RecIncPor ;
   private java.math.BigDecimal ZZ1522RecCanRec ;
   private java.math.BigDecimal ZZ3322RecIncPor ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtForSer_Internalname ;
   private String edtForSer_Jsonclick ;
   private String edtForColNom_Internalname ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Internalname ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtRecCorULin_Internalname ;
   private String edtRecCorULin_Jsonclick ;
   private String edtRecCorLin_Internalname ;
   private String edtRecCorLin_Jsonclick ;
   private String edtRecValIni_Internalname ;
   private String edtRecValIni_Jsonclick ;
   private String edtRecValFin_Internalname ;
   private String edtRecValFin_Jsonclick ;
   private String edtRecCanRec_Internalname ;
   private String edtRecCanRec_Jsonclick ;
   private String edtRecIncPor_Internalname ;
   private String edtRecIncPor_Jsonclick ;
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
   private String Z279CliNom ;
   private String sMode216 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ494ForSer ;
   private String ZZ482ForColNom ;
   private String ZZ279CliNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n1518RecCorULin ;
   private boolean n1520RecValIni ;
   private boolean n1521RecValFin ;
   private boolean n1522RecCanRec ;
   private boolean n3322RecIncPor ;
   private IDataStoreProvider pr_default ;
   private byte[] T01VD6_A1519RecCorLin ;
   private String[] T01VD6_A279CliNom ;
   private byte[] T01VD6_A1518RecCorULin ;
   private boolean[] T01VD6_n1518RecCorULin ;
   private int[] T01VD6_A1520RecValIni ;
   private boolean[] T01VD6_n1520RecValIni ;
   private int[] T01VD6_A1521RecValFin ;
   private boolean[] T01VD6_n1521RecValFin ;
   private java.math.BigDecimal[] T01VD6_A1522RecCanRec ;
   private boolean[] T01VD6_n1522RecCanRec ;
   private java.math.BigDecimal[] T01VD6_A3322RecIncPor ;
   private boolean[] T01VD6_n3322RecIncPor ;
   private String[] T01VD6_A396EmprCod ;
   private int[] T01VD6_A252CliCod ;
   private byte[] T01VD6_A831TipColCod ;
   private String[] T01VD6_A494ForSer ;
   private String[] T01VD6_A482ForColNom ;
   private int[] T01VD6_A483ForColNum ;
   private String[] T01VD4_A279CliNom ;
   private byte[] T01VD5_A1518RecCorULin ;
   private boolean[] T01VD5_n1518RecCorULin ;
   private String[] T01VD7_A279CliNom ;
   private byte[] T01VD8_A1518RecCorULin ;
   private boolean[] T01VD8_n1518RecCorULin ;
   private String[] T01VD9_A396EmprCod ;
   private int[] T01VD9_A252CliCod ;
   private String[] T01VD9_A494ForSer ;
   private String[] T01VD9_A482ForColNom ;
   private int[] T01VD9_A483ForColNum ;
   private byte[] T01VD9_A831TipColCod ;
   private byte[] T01VD9_A1519RecCorLin ;
   private byte[] T01VD3_A1519RecCorLin ;
   private int[] T01VD3_A1520RecValIni ;
   private boolean[] T01VD3_n1520RecValIni ;
   private int[] T01VD3_A1521RecValFin ;
   private boolean[] T01VD3_n1521RecValFin ;
   private java.math.BigDecimal[] T01VD3_A1522RecCanRec ;
   private boolean[] T01VD3_n1522RecCanRec ;
   private java.math.BigDecimal[] T01VD3_A3322RecIncPor ;
   private boolean[] T01VD3_n3322RecIncPor ;
   private String[] T01VD3_A396EmprCod ;
   private int[] T01VD3_A252CliCod ;
   private byte[] T01VD3_A831TipColCod ;
   private String[] T01VD3_A494ForSer ;
   private String[] T01VD3_A482ForColNom ;
   private int[] T01VD3_A483ForColNum ;
   private String[] T01VD10_A396EmprCod ;
   private int[] T01VD10_A252CliCod ;
   private String[] T01VD10_A494ForSer ;
   private String[] T01VD10_A482ForColNom ;
   private int[] T01VD10_A483ForColNum ;
   private byte[] T01VD10_A831TipColCod ;
   private byte[] T01VD10_A1519RecCorLin ;
   private String[] T01VD11_A396EmprCod ;
   private int[] T01VD11_A252CliCod ;
   private String[] T01VD11_A494ForSer ;
   private String[] T01VD11_A482ForColNom ;
   private int[] T01VD11_A483ForColNum ;
   private byte[] T01VD11_A831TipColCod ;
   private byte[] T01VD11_A1519RecCorLin ;
   private byte[] T01VD2_A1519RecCorLin ;
   private int[] T01VD2_A1520RecValIni ;
   private boolean[] T01VD2_n1520RecValIni ;
   private int[] T01VD2_A1521RecValFin ;
   private boolean[] T01VD2_n1521RecValFin ;
   private java.math.BigDecimal[] T01VD2_A1522RecCanRec ;
   private boolean[] T01VD2_n1522RecCanRec ;
   private java.math.BigDecimal[] T01VD2_A3322RecIncPor ;
   private boolean[] T01VD2_n3322RecIncPor ;
   private String[] T01VD2_A396EmprCod ;
   private int[] T01VD2_A252CliCod ;
   private byte[] T01VD2_A831TipColCod ;
   private String[] T01VD2_A494ForSer ;
   private String[] T01VD2_A482ForColNom ;
   private int[] T01VD2_A483ForColNum ;
   private String[] T01VD15_A279CliNom ;
   private byte[] T01VD16_A1518RecCorULin ;
   private boolean[] T01VD16_n1518RecCorULin ;
   private String[] T01VD17_A396EmprCod ;
   private int[] T01VD17_A252CliCod ;
   private String[] T01VD17_A494ForSer ;
   private String[] T01VD17_A482ForColNom ;
   private int[] T01VD17_A483ForColNum ;
   private byte[] T01VD17_A831TipColCod ;
   private byte[] T01VD17_A1519RecCorLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class treccor_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class treccor_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class treccor_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class treccor_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01VD2", "SELECT RecCorLin, RecValIni, RecValFin, RecCanRec, RecIncPor, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum FROM TXPRECCOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND RecCorLin = ?  FOR UPDATE OF RecValIni, RecValFin, RecCanRec, RecIncPor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VD3", "SELECT RecCorLin, RecValIni, RecValFin, RecCanRec, RecIncPor, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum FROM TXPRECCOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND RecCorLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VD4", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VD5", "SELECT RecCorULin FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VD6", "SELECT /*+ FIRST_ROWS(100) */ TM1.RecCorLin, T2.CliNom, T3.RecCorULin, TM1.RecValIni, TM1.RecValFin, TM1.RecCanRec, TM1.RecIncPor, TM1.EmprCod, TM1.CliCod, TM1.TipColCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum FROM ((TXPRECCOR TM1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = TM1.EmprCod AND T2.CliCod = TM1.CliCod) INNER JOIN TXPCFORMU T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod AND T3.ForSer = TM1.ForSer AND T3.ForColNom = TM1.ForColNom AND T3.ForColNum = TM1.ForColNum AND T3.TipColCod = TM1.TipColCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? and TM1.RecCorLin = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod, TM1.RecCorLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VD7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VD8", "SELECT RecCorULin FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VD9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND RecCorLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VD10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin FROM TXPRECCOR WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and ForSer > ? or ForSer = ? and CliCod = ? and EmprCod = ? and ForColNom > ? or ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and ForColNum > ? or ForColNum = ? and ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and TipColCod > ? or TipColCod = ? and ForColNum = ? and ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and RecCorLin > ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VD11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin FROM TXPRECCOR WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and ForSer < ? or ForSer = ? and CliCod = ? and EmprCod = ? and ForColNom < ? or ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and ForColNum < ? or ForColNum = ? and ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and TipColCod < ? or TipColCod = ? and ForColNum = ? and ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and RecCorLin < ?) ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC, RecCorLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01VD12", "INSERT INTO TXPRECCOR(RecCorLin, RecValIni, RecValFin, RecCanRec, RecIncPor, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPRECCOR")
         ,new UpdateCursor("T01VD13", "UPDATE TXPRECCOR SET RecValIni=?, RecValFin=?, RecCanRec=?, RecIncPor=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND RecCorLin = ?", GX_NOMASK, "TXPRECCOR")
         ,new UpdateCursor("T01VD14", "DELETE FROM TXPRECCOR  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND RecCorLin = ?", GX_NOMASK, "TXPRECCOR")
         ,new ForEachCursor("T01VD15", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VD16", "SELECT RecCorULin FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VD17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin FROM TXPRECCOR ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 16);
               ((String[]) buf[13])[0] = rslt.getString(10, 13);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 16);
               ((String[]) buf[13])[0] = rslt.getString(10, 13);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
               ((String[]) buf[16])[0] = rslt.getString(12, 13);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setString(11, (String)parms[10], 13);
               stmt.setString(12, (String)parms[11], 16);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setString(17, (String)parms[16], 13);
               stmt.setString(18, (String)parms[17], 16);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setString(24, (String)parms[23], 13);
               stmt.setString(25, (String)parms[24], 16);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setByte(28, ((Number) parms[27]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setString(11, (String)parms[10], 13);
               stmt.setString(12, (String)parms[11], 16);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setString(17, (String)parms[16], 13);
               stmt.setString(18, (String)parms[17], 16);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setString(24, (String)parms[23], 13);
               stmt.setString(25, (String)parms[24], 16);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setByte(28, ((Number) parms[27]).byteValue());
               return;
            case 10 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
               stmt.setString(6, (String)parms[9], 3);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setByte(8, ((Number) parms[11]).byteValue());
               stmt.setString(9, (String)parms[12], 16);
               stmt.setString(10, (String)parms[13], 13);
               stmt.setInt(11, ((Number) parms[14]).intValue());
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 16);
               stmt.setString(8, (String)parms[11], 13);
               stmt.setInt(9, ((Number) parms[12]).intValue());
               stmt.setByte(10, ((Number) parms[13]).byteValue());
               stmt.setByte(11, ((Number) parms[14]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

