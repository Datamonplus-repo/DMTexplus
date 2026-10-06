package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpenmd_trn_impl extends GXDataArea
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
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
         gxload_3( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Penalizaciones", ""), (short)(0)) ;
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

   public tpenmd_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpenmd_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpenmd_trn_impl.class ));
   }

   public tpenmd_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Penalizaciones", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\TPenMD_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Facturacion\\TPenMD_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TPenMD_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TPenMD_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDPreLim_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDPreLim_Internalname, httpContext.getMessage( "Precio Limite", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDPreLim_Internalname, GXutil.ltrim( localUtil.ntoc( A8400PMDPreLim, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDPreLim_Enabled!=0) ? localUtil.format( A8400PMDPreLim, "Z,ZZ9.99 €") : localUtil.format( A8400PMDPreLim, "Z,ZZ9.99 €"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDPreLim_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDPreLim_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDPreMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDPreMin_Internalname, httpContext.getMessage( "Precio Mínimo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDPreMin_Internalname, GXutil.ltrim( localUtil.ntoc( A8401PMDPreMin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDPreMin_Enabled!=0) ? localUtil.format( A8401PMDPreMin, "Z,ZZ9.99 €") : localUtil.format( A8401PMDPreMin, "Z,ZZ9.99 €"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDPreMin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDPreMin_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDLinUlt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDLinUlt_Internalname, httpContext.getMessage( "Ultima Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDLinUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A8402PMDLinUlt, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDLinUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8402PMDLinUlt), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8402PMDLinUlt), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDLinUlt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDLinUlt_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDLin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDLin_Internalname, GXutil.ltrim( localUtil.ntoc( A8403PMDLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8403PMDLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8403PMDLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDKgmMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDKgmMin_Internalname, httpContext.getMessage( "de (kg)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDKgmMin_Internalname, GXutil.ltrim( localUtil.ntoc( A8404PMDKgmMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDKgmMin_Enabled!=0) ? localUtil.format( A8404PMDKgmMin, "Z,ZZ9.99 kg") : localUtil.format( A8404PMDKgmMin, "Z,ZZ9.99 kg"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDKgmMin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDKgmMin_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDKgmMax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDKgmMax_Internalname, httpContext.getMessage( "a (kg)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDKgmMax_Internalname, GXutil.ltrim( localUtil.ntoc( A8405PMDKgmMax, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDKgmMax_Enabled!=0) ? localUtil.format( A8405PMDKgmMax, "Z,ZZ9.99 kg") : localUtil.format( A8405PMDKgmMax, "Z,ZZ9.99 kg"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDKgmMax_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDKgmMax_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDTinPrc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDTinPrc_Internalname, httpContext.getMessage( "% de Penal. Tint.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDTinPrc_Internalname, GXutil.ltrim( localUtil.ntoc( A8406PMDTinPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDTinPrc_Enabled!=0) ? localUtil.format( A8406PMDTinPrc, "ZZ9.99") : localUtil.format( A8406PMDTinPrc, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDTinPrc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDTinPrc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDAcaPrc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDAcaPrc_Internalname, httpContext.getMessage( "% de Penal. Acab.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDAcaPrc_Internalname, GXutil.ltrim( localUtil.ntoc( A8407PMDAcaPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDAcaPrc_Enabled!=0) ? localUtil.format( A8407PMDAcaPrc, "ZZ9.99") : localUtil.format( A8407PMDAcaPrc, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDAcaPrc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDAcaPrc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDKgmMinS_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDKgmMinS_Internalname, httpContext.getMessage( "Kgs.Minimos Salida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDKgmMinS_Internalname, GXutil.ltrim( localUtil.ntoc( A8408PMDKgmMinS, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDKgmMinS_Enabled!=0) ? localUtil.format( A8408PMDKgmMinS, "ZZZ9.99") : localUtil.format( A8408PMDKgmMinS, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDKgmMinS_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDKgmMinS_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPenMD_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPenMD_TRN.htm");
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
         Z8403PMDLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z8403PMDLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8404PMDKgmMin = localUtil.ctond( httpContext.cgiGet( "Z8404PMDKgmMin")) ;
         Z8405PMDKgmMax = localUtil.ctond( httpContext.cgiGet( "Z8405PMDKgmMax")) ;
         Z8406PMDTinPrc = localUtil.ctond( httpContext.cgiGet( "Z8406PMDTinPrc")) ;
         Z8407PMDAcaPrc = localUtil.ctond( httpContext.cgiGet( "Z8407PMDAcaPrc")) ;
         Z8408PMDKgmMinS = localUtil.ctond( httpContext.cgiGet( "Z8408PMDKgmMinS")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A8400PMDPreLim = localUtil.ctond( httpContext.cgiGet( edtPMDPreLim_Internalname)) ;
         n8400PMDPreLim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8400PMDPreLim", GXutil.ltrimstr( A8400PMDPreLim, 7, 2));
         A8401PMDPreMin = localUtil.ctond( httpContext.cgiGet( edtPMDPreMin_Internalname)) ;
         n8401PMDPreMin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8401PMDPreMin", GXutil.ltrimstr( A8401PMDPreMin, 7, 2));
         A8402PMDLinUlt = (int)(localUtil.ctol( httpContext.cgiGet( edtPMDLinUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8402PMDLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8403PMDLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8403PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8403PMDLin), 4, 0));
         }
         else
         {
            A8403PMDLin = (short)(localUtil.ctol( httpContext.cgiGet( edtPMDLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8403PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8403PMDLin), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDKgmMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDKgmMin_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDKGMMIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDKgmMin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8404PMDKgmMin = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8404PMDKgmMin", GXutil.ltrimstr( A8404PMDKgmMin, 7, 2));
         }
         else
         {
            A8404PMDKgmMin = localUtil.ctond( httpContext.cgiGet( edtPMDKgmMin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8404PMDKgmMin", GXutil.ltrimstr( A8404PMDKgmMin, 7, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDKgmMax_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDKgmMax_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDKGMMAX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDKgmMax_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8405PMDKgmMax = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8405PMDKgmMax", GXutil.ltrimstr( A8405PMDKgmMax, 7, 2));
         }
         else
         {
            A8405PMDKgmMax = localUtil.ctond( httpContext.cgiGet( edtPMDKgmMax_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8405PMDKgmMax", GXutil.ltrimstr( A8405PMDKgmMax, 7, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDTinPrc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDTinPrc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDTINPRC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDTinPrc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8406PMDTinPrc = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8406PMDTinPrc", GXutil.ltrimstr( A8406PMDTinPrc, 6, 2));
         }
         else
         {
            A8406PMDTinPrc = localUtil.ctond( httpContext.cgiGet( edtPMDTinPrc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8406PMDTinPrc", GXutil.ltrimstr( A8406PMDTinPrc, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDAcaPrc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDAcaPrc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDACAPRC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDAcaPrc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8407PMDAcaPrc = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8407PMDAcaPrc", GXutil.ltrimstr( A8407PMDAcaPrc, 6, 2));
         }
         else
         {
            A8407PMDAcaPrc = localUtil.ctond( httpContext.cgiGet( edtPMDAcaPrc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8407PMDAcaPrc", GXutil.ltrimstr( A8407PMDAcaPrc, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDKgmMinS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDKgmMinS_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDKGMMINS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDKgmMinS_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8408PMDKgmMinS = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8408PMDKgmMinS", GXutil.ltrimstr( A8408PMDKgmMinS, 7, 2));
         }
         else
         {
            A8408PMDKgmMinS = localUtil.ctond( httpContext.cgiGet( edtPMDKgmMinS_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8408PMDKgmMinS", GXutil.ltrimstr( A8408PMDKgmMinS, 7, 2));
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
            A8403PMDLin = (short)(GXutil.lval( httpContext.GetPar( "PMDLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8403PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8403PMDLin), 4, 0));
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
            initAll1VE1160( ) ;
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
      disableAttributes1VE1160( ) ;
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

   public void resetCaption1VE0( )
   {
   }

   public void zm1VE1160( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8404PMDKgmMin = T01VE3_A8404PMDKgmMin[0] ;
            Z8405PMDKgmMax = T01VE3_A8405PMDKgmMax[0] ;
            Z8406PMDTinPrc = T01VE3_A8406PMDTinPrc[0] ;
            Z8407PMDAcaPrc = T01VE3_A8407PMDAcaPrc[0] ;
            Z8408PMDKgmMinS = T01VE3_A8408PMDKgmMinS[0] ;
         }
         else
         {
            Z8404PMDKgmMin = A8404PMDKgmMin ;
            Z8405PMDKgmMax = A8405PMDKgmMax ;
            Z8406PMDTinPrc = A8406PMDTinPrc ;
            Z8407PMDAcaPrc = A8407PMDAcaPrc ;
            Z8408PMDKgmMinS = A8408PMDKgmMinS ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z8403PMDLin = A8403PMDLin ;
         Z8404PMDKgmMin = A8404PMDKgmMin ;
         Z8405PMDKgmMax = A8405PMDKgmMax ;
         Z8406PMDTinPrc = A8406PMDTinPrc ;
         Z8407PMDAcaPrc = A8407PMDAcaPrc ;
         Z8408PMDKgmMinS = A8408PMDKgmMinS ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z8400PMDPreLim = A8400PMDPreLim ;
         Z8401PMDPreMin = A8401PMDPreMin ;
         Z8402PMDLinUlt = A8402PMDLinUlt ;
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

   public void load1VE1160( )
   {
      /* Using cursor T01VE6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1160 = (short)(1) ;
         A407EmprNom = T01VE6_A407EmprNom[0] ;
         n407EmprNom = T01VE6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01VE6_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A8400PMDPreLim = T01VE6_A8400PMDPreLim[0] ;
         n8400PMDPreLim = T01VE6_n8400PMDPreLim[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8400PMDPreLim", GXutil.ltrimstr( A8400PMDPreLim, 7, 2));
         A8401PMDPreMin = T01VE6_A8401PMDPreMin[0] ;
         n8401PMDPreMin = T01VE6_n8401PMDPreMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8401PMDPreMin", GXutil.ltrimstr( A8401PMDPreMin, 7, 2));
         A8402PMDLinUlt = T01VE6_A8402PMDLinUlt[0] ;
         n8402PMDLinUlt = T01VE6_n8402PMDLinUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
         A8404PMDKgmMin = T01VE6_A8404PMDKgmMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8404PMDKgmMin", GXutil.ltrimstr( A8404PMDKgmMin, 7, 2));
         A8405PMDKgmMax = T01VE6_A8405PMDKgmMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8405PMDKgmMax", GXutil.ltrimstr( A8405PMDKgmMax, 7, 2));
         A8406PMDTinPrc = T01VE6_A8406PMDTinPrc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8406PMDTinPrc", GXutil.ltrimstr( A8406PMDTinPrc, 6, 2));
         A8407PMDAcaPrc = T01VE6_A8407PMDAcaPrc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8407PMDAcaPrc", GXutil.ltrimstr( A8407PMDAcaPrc, 6, 2));
         A8408PMDKgmMinS = T01VE6_A8408PMDKgmMinS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8408PMDKgmMinS", GXutil.ltrimstr( A8408PMDKgmMinS, 7, 2));
         zm1VE1160( -1) ;
      }
      pr_default.close(4);
      onLoadActions1VE1160( ) ;
   }

   public void onLoadActions1VE1160( )
   {
   }

   public void checkExtendedTable1VE1160( )
   {
      nIsDirty_1160 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01VE4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VE4_A407EmprNom[0] ;
      n407EmprNom = T01VE4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01VE5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01VE5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A8400PMDPreLim = T01VE5_A8400PMDPreLim[0] ;
      n8400PMDPreLim = T01VE5_n8400PMDPreLim[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8400PMDPreLim", GXutil.ltrimstr( A8400PMDPreLim, 7, 2));
      A8401PMDPreMin = T01VE5_A8401PMDPreMin[0] ;
      n8401PMDPreMin = T01VE5_n8401PMDPreMin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8401PMDPreMin", GXutil.ltrimstr( A8401PMDPreMin, 7, 2));
      A8402PMDLinUlt = T01VE5_A8402PMDLinUlt[0] ;
      n8402PMDLinUlt = T01VE5_n8402PMDLinUlt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1VE1160( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01VE7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VE7_A407EmprNom[0] ;
      n407EmprNom = T01VE7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
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
                         int A252CliCod )
   {
      /* Using cursor T01VE8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01VE8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A8400PMDPreLim = T01VE8_A8400PMDPreLim[0] ;
      n8400PMDPreLim = T01VE8_n8400PMDPreLim[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8400PMDPreLim", GXutil.ltrimstr( A8400PMDPreLim, 7, 2));
      A8401PMDPreMin = T01VE8_A8401PMDPreMin[0] ;
      n8401PMDPreMin = T01VE8_n8401PMDPreMin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8401PMDPreMin", GXutil.ltrimstr( A8401PMDPreMin, 7, 2));
      A8402PMDLinUlt = T01VE8_A8402PMDLinUlt[0] ;
      n8402PMDLinUlt = T01VE8_n8402PMDLinUlt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8400PMDPreLim, (byte)(7), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8401PMDPreMin, (byte)(7), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8402PMDLinUlt, (byte)(5), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1VE1160( )
   {
      /* Using cursor T01VE9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1160 = (short)(1) ;
      }
      else
      {
         RcdFound1160 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01VE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1VE1160( 1) ;
         RcdFound1160 = (short)(1) ;
         A8403PMDLin = T01VE3_A8403PMDLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8403PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8403PMDLin), 4, 0));
         A8404PMDKgmMin = T01VE3_A8404PMDKgmMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8404PMDKgmMin", GXutil.ltrimstr( A8404PMDKgmMin, 7, 2));
         A8405PMDKgmMax = T01VE3_A8405PMDKgmMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8405PMDKgmMax", GXutil.ltrimstr( A8405PMDKgmMax, 7, 2));
         A8406PMDTinPrc = T01VE3_A8406PMDTinPrc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8406PMDTinPrc", GXutil.ltrimstr( A8406PMDTinPrc, 6, 2));
         A8407PMDAcaPrc = T01VE3_A8407PMDAcaPrc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8407PMDAcaPrc", GXutil.ltrimstr( A8407PMDAcaPrc, 6, 2));
         A8408PMDKgmMinS = T01VE3_A8408PMDKgmMinS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8408PMDKgmMinS", GXutil.ltrimstr( A8408PMDKgmMinS, 7, 2));
         A396EmprCod = T01VE3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01VE3_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z8403PMDLin = A8403PMDLin ;
         sMode1160 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1VE1160( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1160 = (short)(0) ;
            initializeNonKey1VE1160( ) ;
         }
         Gx_mode = sMode1160 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1160 = (short)(0) ;
         initializeNonKey1VE1160( ) ;
         sMode1160 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1160 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1VE1160( ) ;
      if ( RcdFound1160 == 0 )
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
      RcdFound1160 = (short)(0) ;
      /* Using cursor T01VE10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Short.valueOf(A8403PMDLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01VE10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VE10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VE10_A252CliCod[0] < A252CliCod ) || ( T01VE10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VE10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VE10_A8403PMDLin[0] < A8403PMDLin ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01VE10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VE10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VE10_A252CliCod[0] > A252CliCod ) || ( T01VE10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VE10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VE10_A8403PMDLin[0] > A8403PMDLin ) ) )
         {
            A396EmprCod = T01VE10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01VE10_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A8403PMDLin = T01VE10_A8403PMDLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8403PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8403PMDLin), 4, 0));
            RcdFound1160 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1160 = (short)(0) ;
      /* Using cursor T01VE11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Short.valueOf(A8403PMDLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01VE11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VE11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VE11_A252CliCod[0] > A252CliCod ) || ( T01VE11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VE11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VE11_A8403PMDLin[0] > A8403PMDLin ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01VE11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VE11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VE11_A252CliCod[0] < A252CliCod ) || ( T01VE11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VE11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VE11_A8403PMDLin[0] < A8403PMDLin ) ) )
         {
            A396EmprCod = T01VE11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01VE11_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A8403PMDLin = T01VE11_A8403PMDLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8403PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8403PMDLin), 4, 0));
            RcdFound1160 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VE1160( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1VE1160( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1160 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A8403PMDLin != Z8403PMDLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A8403PMDLin = Z8403PMDLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A8403PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8403PMDLin), 4, 0));
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
               update1VE1160( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A8403PMDLin != Z8403PMDLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1VE1160( ) ;
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
                  insert1VE1160( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A8403PMDLin != Z8403PMDLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8403PMDLin = Z8403PMDLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A8403PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8403PMDLin), 4, 0));
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
      if ( RcdFound1160 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPMDKgmMin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1VE1160( ) ;
      if ( RcdFound1160 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPMDKgmMin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VE1160( ) ;
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
      if ( RcdFound1160 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPMDKgmMin_Internalname ;
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
      if ( RcdFound1160 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPMDKgmMin_Internalname ;
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
      scanStart1VE1160( ) ;
      if ( RcdFound1160 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1160 != 0 )
         {
            scanNext1VE1160( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPMDKgmMin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VE1160( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1VE1160( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01VE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPenMD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z8404PMDKgmMin, T01VE2_A8404PMDKgmMin[0]) != 0 ) || ( DecimalUtil.compareTo(Z8405PMDKgmMax, T01VE2_A8405PMDKgmMax[0]) != 0 ) || ( DecimalUtil.compareTo(Z8406PMDTinPrc, T01VE2_A8406PMDTinPrc[0]) != 0 ) || ( DecimalUtil.compareTo(Z8407PMDAcaPrc, T01VE2_A8407PMDAcaPrc[0]) != 0 ) || ( DecimalUtil.compareTo(Z8408PMDKgmMinS, T01VE2_A8408PMDKgmMinS[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z8404PMDKgmMin, T01VE2_A8404PMDKgmMin[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpenmd_trn:[seudo value changed for attri]"+"PMDKgmMin");
               GXutil.writeLogRaw("Old: ",Z8404PMDKgmMin);
               GXutil.writeLogRaw("Current: ",T01VE2_A8404PMDKgmMin[0]);
            }
            if ( DecimalUtil.compareTo(Z8405PMDKgmMax, T01VE2_A8405PMDKgmMax[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpenmd_trn:[seudo value changed for attri]"+"PMDKgmMax");
               GXutil.writeLogRaw("Old: ",Z8405PMDKgmMax);
               GXutil.writeLogRaw("Current: ",T01VE2_A8405PMDKgmMax[0]);
            }
            if ( DecimalUtil.compareTo(Z8406PMDTinPrc, T01VE2_A8406PMDTinPrc[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpenmd_trn:[seudo value changed for attri]"+"PMDTinPrc");
               GXutil.writeLogRaw("Old: ",Z8406PMDTinPrc);
               GXutil.writeLogRaw("Current: ",T01VE2_A8406PMDTinPrc[0]);
            }
            if ( DecimalUtil.compareTo(Z8407PMDAcaPrc, T01VE2_A8407PMDAcaPrc[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpenmd_trn:[seudo value changed for attri]"+"PMDAcaPrc");
               GXutil.writeLogRaw("Old: ",Z8407PMDAcaPrc);
               GXutil.writeLogRaw("Current: ",T01VE2_A8407PMDAcaPrc[0]);
            }
            if ( DecimalUtil.compareTo(Z8408PMDKgmMinS, T01VE2_A8408PMDKgmMinS[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpenmd_trn:[seudo value changed for attri]"+"PMDKgmMinS");
               GXutil.writeLogRaw("Old: ",Z8408PMDKgmMinS);
               GXutil.writeLogRaw("Current: ",T01VE2_A8408PMDKgmMinS[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPenMD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VE1160( )
   {
      beforeValidate1VE1160( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VE1160( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VE1160( 0) ;
         checkOptimisticConcurrency1VE1160( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VE1160( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VE1160( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VE12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A8403PMDLin), A8404PMDKgmMin, A8405PMDKgmMax, A8406PMDTinPrc, A8407PMDAcaPrc, A8408PMDKgmMinS, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPenMD");
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
                        resetCaption1VE0( ) ;
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
            load1VE1160( ) ;
         }
         endLevel1VE1160( ) ;
      }
      closeExtendedTableCursors1VE1160( ) ;
   }

   public void update1VE1160( )
   {
      beforeValidate1VE1160( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VE1160( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VE1160( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VE1160( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VE1160( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VE13 */
                  pr_default.execute(11, new Object[] {A8404PMDKgmMin, A8405PMDKgmMax, A8406PMDTinPrc, A8407PMDAcaPrc, A8408PMDKgmMinS, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPenMD");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPenMD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VE1160( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1VE0( ) ;
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
         endLevel1VE1160( ) ;
      }
      closeExtendedTableCursors1VE1160( ) ;
   }

   public void deferredUpdate1VE1160( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1VE1160( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VE1160( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VE1160( ) ;
         afterConfirm1VE1160( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VE1160( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01VE14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPenMD");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1160 == 0 )
                     {
                        initAll1VE1160( ) ;
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
                     resetCaption1VE0( ) ;
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
      sMode1160 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1VE1160( ) ;
      Gx_mode = sMode1160 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1VE1160( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01VE15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01VE15_A407EmprNom[0] ;
         n407EmprNom = T01VE15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
         /* Using cursor T01VE16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01VE16_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A8400PMDPreLim = T01VE16_A8400PMDPreLim[0] ;
         n8400PMDPreLim = T01VE16_n8400PMDPreLim[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8400PMDPreLim", GXutil.ltrimstr( A8400PMDPreLim, 7, 2));
         A8401PMDPreMin = T01VE16_A8401PMDPreMin[0] ;
         n8401PMDPreMin = T01VE16_n8401PMDPreMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8401PMDPreMin", GXutil.ltrimstr( A8401PMDPreMin, 7, 2));
         A8402PMDLinUlt = T01VE16_A8402PMDLinUlt[0] ;
         n8402PMDLinUlt = T01VE16_n8402PMDLinUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
         pr_default.close(14);
      }
   }

   public void endLevel1VE1160( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VE1160( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tpenmd_trn");
         if ( AnyError == 0 )
         {
            confirmValues1VE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.tpenmd_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1VE1160( )
   {
      /* Using cursor T01VE17 */
      pr_default.execute(15);
      RcdFound1160 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1160 = (short)(1) ;
         A396EmprCod = T01VE17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01VE17_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8403PMDLin = T01VE17_A8403PMDLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8403PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8403PMDLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1VE1160( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1160 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1160 = (short)(1) ;
         A396EmprCod = T01VE17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01VE17_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8403PMDLin = T01VE17_A8403PMDLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8403PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8403PMDLin), 4, 0));
      }
   }

   public void scanEnd1VE1160( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1VE1160( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1VE1160( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VE1160( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VE1160( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VE1160( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VE1160( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VE1160( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtPMDPreLim_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDPreLim_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDPreLim_Enabled), 5, 0), true);
      edtPMDPreMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDPreMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDPreMin_Enabled), 5, 0), true);
      edtPMDLinUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDLinUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDLinUlt_Enabled), 5, 0), true);
      edtPMDLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDLin_Enabled), 5, 0), true);
      edtPMDKgmMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDKgmMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDKgmMin_Enabled), 5, 0), true);
      edtPMDKgmMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDKgmMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDKgmMax_Enabled), 5, 0), true);
      edtPMDTinPrc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDTinPrc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDTinPrc_Enabled), 5, 0), true);
      edtPMDAcaPrc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDAcaPrc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDAcaPrc_Enabled), 5, 0), true);
      edtPMDKgmMinS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDKgmMinS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDKgmMinS_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1VE1160( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1VE0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.tpenmd_trn", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z8403PMDLin", GXutil.ltrim( localUtil.ntoc( Z8403PMDLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8404PMDKgmMin", GXutil.ltrim( localUtil.ntoc( Z8404PMDKgmMin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8405PMDKgmMax", GXutil.ltrim( localUtil.ntoc( Z8405PMDKgmMax, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8406PMDTinPrc", GXutil.ltrim( localUtil.ntoc( Z8406PMDTinPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8407PMDAcaPrc", GXutil.ltrim( localUtil.ntoc( Z8407PMDAcaPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8408PMDKgmMinS", GXutil.ltrim( localUtil.ntoc( Z8408PMDKgmMinS, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.facturacion.tpenmd_trn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.TPenMD_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Penalizaciones", "") ;
   }

   public void initializeNonKey1VE1160( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A8400PMDPreLim = DecimalUtil.ZERO ;
      n8400PMDPreLim = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8400PMDPreLim", GXutil.ltrimstr( A8400PMDPreLim, 7, 2));
      A8401PMDPreMin = DecimalUtil.ZERO ;
      n8401PMDPreMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8401PMDPreMin", GXutil.ltrimstr( A8401PMDPreMin, 7, 2));
      A8402PMDLinUlt = 0 ;
      n8402PMDLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
      A8404PMDKgmMin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8404PMDKgmMin", GXutil.ltrimstr( A8404PMDKgmMin, 7, 2));
      A8405PMDKgmMax = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8405PMDKgmMax", GXutil.ltrimstr( A8405PMDKgmMax, 7, 2));
      A8406PMDTinPrc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8406PMDTinPrc", GXutil.ltrimstr( A8406PMDTinPrc, 6, 2));
      A8407PMDAcaPrc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8407PMDAcaPrc", GXutil.ltrimstr( A8407PMDAcaPrc, 6, 2));
      A8408PMDKgmMinS = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8408PMDKgmMinS", GXutil.ltrimstr( A8408PMDKgmMinS, 7, 2));
      Z8404PMDKgmMin = DecimalUtil.ZERO ;
      Z8405PMDKgmMax = DecimalUtil.ZERO ;
      Z8406PMDTinPrc = DecimalUtil.ZERO ;
      Z8407PMDAcaPrc = DecimalUtil.ZERO ;
      Z8408PMDKgmMinS = DecimalUtil.ZERO ;
   }

   public void initAll1VE1160( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A8403PMDLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8403PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8403PMDLin), 4, 0));
      initializeNonKey1VE1160( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415124183", true, true);
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
      httpContext.AddJavascriptSource("facturacion/tpenmd_trn.js", "?202682415124184", false, true);
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
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtPMDPreLim_Internalname = "PMDPRELIM" ;
      edtPMDPreMin_Internalname = "PMDPREMIN" ;
      edtPMDLinUlt_Internalname = "PMDLINULT" ;
      edtPMDLin_Internalname = "PMDLIN" ;
      edtPMDKgmMin_Internalname = "PMDKGMMIN" ;
      edtPMDKgmMax_Internalname = "PMDKGMMAX" ;
      edtPMDTinPrc_Internalname = "PMDTINPRC" ;
      edtPMDAcaPrc_Internalname = "PMDACAPRC" ;
      edtPMDKgmMinS_Internalname = "PMDKGMMINS" ;
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
      Form.setCaption( httpContext.getMessage( "Penalizaciones", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPMDKgmMinS_Jsonclick = "" ;
      edtPMDKgmMinS_Enabled = 1 ;
      edtPMDAcaPrc_Jsonclick = "" ;
      edtPMDAcaPrc_Enabled = 1 ;
      edtPMDTinPrc_Jsonclick = "" ;
      edtPMDTinPrc_Enabled = 1 ;
      edtPMDKgmMax_Jsonclick = "" ;
      edtPMDKgmMax_Enabled = 1 ;
      edtPMDKgmMin_Jsonclick = "" ;
      edtPMDKgmMin_Enabled = 1 ;
      edtPMDLin_Jsonclick = "" ;
      edtPMDLin_Enabled = 1 ;
      edtPMDLinUlt_Jsonclick = "" ;
      edtPMDLinUlt_Enabled = 0 ;
      edtPMDPreMin_Jsonclick = "" ;
      edtPMDPreMin_Enabled = 0 ;
      edtPMDPreLim_Jsonclick = "" ;
      edtPMDPreLim_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
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
      /* Using cursor T01VE15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VE15_A407EmprNom[0] ;
      n407EmprNom = T01VE15_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      /* Using cursor T01VE16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01VE16_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A8400PMDPreLim = T01VE16_A8400PMDPreLim[0] ;
      n8400PMDPreLim = T01VE16_n8400PMDPreLim[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8400PMDPreLim", GXutil.ltrimstr( A8400PMDPreLim, 7, 2));
      A8401PMDPreMin = T01VE16_A8401PMDPreMin[0] ;
      n8401PMDPreMin = T01VE16_n8401PMDPreMin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8401PMDPreMin", GXutil.ltrimstr( A8401PMDPreMin, 7, 2));
      A8402PMDLinUlt = T01VE16_A8402PMDLinUlt[0] ;
      n8402PMDLinUlt = T01VE16_n8402PMDLinUlt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
      pr_default.close(14);
      GX_FocusControl = edtPMDKgmMin_Internalname ;
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
      /* Using cursor T01VE15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01VE15_A407EmprNom[0] ;
      n407EmprNom = T01VE15_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Clicod( )
   {
      n8400PMDPreLim = false ;
      n8401PMDPreMin = false ;
      n8402PMDLinUlt = false ;
      /* Using cursor T01VE16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01VE16_A279CliNom[0] ;
      A8400PMDPreLim = T01VE16_A8400PMDPreLim[0] ;
      n8400PMDPreLim = T01VE16_n8400PMDPreLim[0] ;
      A8401PMDPreMin = T01VE16_A8401PMDPreMin[0] ;
      n8401PMDPreMin = T01VE16_n8401PMDPreMin[0] ;
      A8402PMDLinUlt = T01VE16_A8402PMDLinUlt[0] ;
      n8402PMDLinUlt = T01VE16_n8402PMDLinUlt[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8400PMDPreLim", GXutil.ltrim( localUtil.ntoc( A8400PMDPreLim, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8401PMDPreMin", GXutil.ltrim( localUtil.ntoc( A8401PMDPreMin, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrim( localUtil.ntoc( A8402PMDLinUlt, (byte)(5), (byte)(0), ".", "")));
   }

   public void valid_Pmdlin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8404PMDKgmMin", GXutil.ltrim( localUtil.ntoc( A8404PMDKgmMin, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8405PMDKgmMax", GXutil.ltrim( localUtil.ntoc( A8405PMDKgmMax, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8406PMDTinPrc", GXutil.ltrim( localUtil.ntoc( A8406PMDTinPrc, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8407PMDAcaPrc", GXutil.ltrim( localUtil.ntoc( A8407PMDAcaPrc, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8408PMDKgmMinS", GXutil.ltrim( localUtil.ntoc( A8408PMDKgmMinS, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8400PMDPreLim", GXutil.ltrim( localUtil.ntoc( A8400PMDPreLim, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8401PMDPreMin", GXutil.ltrim( localUtil.ntoc( A8401PMDPreMin, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrim( localUtil.ntoc( A8402PMDLinUlt, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8403PMDLin", GXutil.ltrim( localUtil.ntoc( Z8403PMDLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8404PMDKgmMin", GXutil.ltrim( localUtil.ntoc( Z8404PMDKgmMin, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8405PMDKgmMax", GXutil.ltrim( localUtil.ntoc( Z8405PMDKgmMax, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8406PMDTinPrc", GXutil.ltrim( localUtil.ntoc( Z8406PMDTinPrc, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8407PMDAcaPrc", GXutil.ltrim( localUtil.ntoc( Z8407PMDAcaPrc, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8408PMDKgmMinS", GXutil.ltrim( localUtil.ntoc( Z8408PMDKgmMinS, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8400PMDPreLim", GXutil.ltrim( localUtil.ntoc( Z8400PMDPreLim, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8401PMDPreMin", GXutil.ltrim( localUtil.ntoc( Z8401PMDPreMin, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8402PMDLinUlt", GXutil.ltrim( localUtil.ntoc( Z8402PMDLinUlt, (byte)(5), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A8400PMDPreLim',fld:'PMDPRELIM',pic:'Z,ZZ9.99 €'},{av:'A8401PMDPreMin',fld:'PMDPREMIN',pic:'Z,ZZ9.99 €'},{av:'A8402PMDLinUlt',fld:'PMDLINULT',pic:'ZZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A8400PMDPreLim',fld:'PMDPRELIM',pic:'Z,ZZ9.99 €'},{av:'A8401PMDPreMin',fld:'PMDPREMIN',pic:'Z,ZZ9.99 €'},{av:'A8402PMDLinUlt',fld:'PMDLINULT',pic:'ZZZZ9'}]}");
      setEventMetadata("VALID_PMDLIN","{handler:'valid_Pmdlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A8403PMDLin',fld:'PMDLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PMDLIN",",oparms:[{av:'A8404PMDKgmMin',fld:'PMDKGMMIN',pic:'Z,ZZ9.99 kg'},{av:'A8405PMDKgmMax',fld:'PMDKGMMAX',pic:'Z,ZZ9.99 kg'},{av:'A8406PMDTinPrc',fld:'PMDTINPRC',pic:'ZZ9.99'},{av:'A8407PMDAcaPrc',fld:'PMDACAPRC',pic:'ZZ9.99'},{av:'A8408PMDKgmMinS',fld:'PMDKGMMINS',pic:'ZZZ9.99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A8400PMDPreLim',fld:'PMDPRELIM',pic:'Z,ZZ9.99 €'},{av:'A8401PMDPreMin',fld:'PMDPREMIN',pic:'Z,ZZ9.99 €'},{av:'A8402PMDLinUlt',fld:'PMDLINULT',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z8403PMDLin'},{av:'Z8404PMDKgmMin'},{av:'Z8405PMDKgmMax'},{av:'Z8406PMDTinPrc'},{av:'Z8407PMDAcaPrc'},{av:'Z8408PMDKgmMinS'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z8400PMDPreLim'},{av:'Z8401PMDPreMin'},{av:'Z8402PMDLinUlt'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(14);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z8404PMDKgmMin = DecimalUtil.ZERO ;
      Z8405PMDKgmMax = DecimalUtil.ZERO ;
      Z8406PMDTinPrc = DecimalUtil.ZERO ;
      Z8407PMDAcaPrc = DecimalUtil.ZERO ;
      Z8408PMDKgmMinS = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A279CliNom = "" ;
      A8400PMDPreLim = DecimalUtil.ZERO ;
      A8401PMDPreMin = DecimalUtil.ZERO ;
      A8404PMDKgmMin = DecimalUtil.ZERO ;
      A8405PMDKgmMax = DecimalUtil.ZERO ;
      A8406PMDTinPrc = DecimalUtil.ZERO ;
      A8407PMDAcaPrc = DecimalUtil.ZERO ;
      A8408PMDKgmMinS = DecimalUtil.ZERO ;
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
      Z279CliNom = "" ;
      Z8400PMDPreLim = DecimalUtil.ZERO ;
      Z8401PMDPreMin = DecimalUtil.ZERO ;
      T01VE6_A8403PMDLin = new short[1] ;
      T01VE6_A407EmprNom = new String[] {""} ;
      T01VE6_n407EmprNom = new boolean[] {false} ;
      T01VE6_A279CliNom = new String[] {""} ;
      T01VE6_A8400PMDPreLim = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE6_n8400PMDPreLim = new boolean[] {false} ;
      T01VE6_A8401PMDPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE6_n8401PMDPreMin = new boolean[] {false} ;
      T01VE6_A8402PMDLinUlt = new int[1] ;
      T01VE6_n8402PMDLinUlt = new boolean[] {false} ;
      T01VE6_A8404PMDKgmMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE6_A8405PMDKgmMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE6_A8406PMDTinPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE6_A8407PMDAcaPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE6_A8408PMDKgmMinS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE6_A396EmprCod = new String[] {""} ;
      T01VE6_A252CliCod = new int[1] ;
      T01VE4_A407EmprNom = new String[] {""} ;
      T01VE4_n407EmprNom = new boolean[] {false} ;
      T01VE5_A279CliNom = new String[] {""} ;
      T01VE5_A8400PMDPreLim = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE5_n8400PMDPreLim = new boolean[] {false} ;
      T01VE5_A8401PMDPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE5_n8401PMDPreMin = new boolean[] {false} ;
      T01VE5_A8402PMDLinUlt = new int[1] ;
      T01VE5_n8402PMDLinUlt = new boolean[] {false} ;
      T01VE7_A407EmprNom = new String[] {""} ;
      T01VE7_n407EmprNom = new boolean[] {false} ;
      T01VE8_A279CliNom = new String[] {""} ;
      T01VE8_A8400PMDPreLim = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE8_n8400PMDPreLim = new boolean[] {false} ;
      T01VE8_A8401PMDPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE8_n8401PMDPreMin = new boolean[] {false} ;
      T01VE8_A8402PMDLinUlt = new int[1] ;
      T01VE8_n8402PMDLinUlt = new boolean[] {false} ;
      T01VE9_A396EmprCod = new String[] {""} ;
      T01VE9_A252CliCod = new int[1] ;
      T01VE9_A8403PMDLin = new short[1] ;
      T01VE3_A8403PMDLin = new short[1] ;
      T01VE3_A8404PMDKgmMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE3_A8405PMDKgmMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE3_A8406PMDTinPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE3_A8407PMDAcaPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE3_A8408PMDKgmMinS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE3_A396EmprCod = new String[] {""} ;
      T01VE3_A252CliCod = new int[1] ;
      sMode1160 = "" ;
      T01VE10_A396EmprCod = new String[] {""} ;
      T01VE10_A252CliCod = new int[1] ;
      T01VE10_A8403PMDLin = new short[1] ;
      T01VE11_A396EmprCod = new String[] {""} ;
      T01VE11_A252CliCod = new int[1] ;
      T01VE11_A8403PMDLin = new short[1] ;
      T01VE2_A8403PMDLin = new short[1] ;
      T01VE2_A8404PMDKgmMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE2_A8405PMDKgmMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE2_A8406PMDTinPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE2_A8407PMDAcaPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE2_A8408PMDKgmMinS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE2_A396EmprCod = new String[] {""} ;
      T01VE2_A252CliCod = new int[1] ;
      T01VE15_A407EmprNom = new String[] {""} ;
      T01VE15_n407EmprNom = new boolean[] {false} ;
      T01VE16_A279CliNom = new String[] {""} ;
      T01VE16_A8400PMDPreLim = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE16_n8400PMDPreLim = new boolean[] {false} ;
      T01VE16_A8401PMDPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VE16_n8401PMDPreMin = new boolean[] {false} ;
      T01VE16_A8402PMDLinUlt = new int[1] ;
      T01VE16_n8402PMDLinUlt = new boolean[] {false} ;
      T01VE17_A396EmprCod = new String[] {""} ;
      T01VE17_A252CliCod = new int[1] ;
      T01VE17_A8403PMDLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ8404PMDKgmMin = DecimalUtil.ZERO ;
      ZZ8405PMDKgmMax = DecimalUtil.ZERO ;
      ZZ8406PMDTinPrc = DecimalUtil.ZERO ;
      ZZ8407PMDAcaPrc = DecimalUtil.ZERO ;
      ZZ8408PMDKgmMinS = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ8400PMDPreLim = DecimalUtil.ZERO ;
      ZZ8401PMDPreMin = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd_trn__default(),
         new Object[] {
             new Object[] {
            T01VE2_A8403PMDLin, T01VE2_A8404PMDKgmMin, T01VE2_A8405PMDKgmMax, T01VE2_A8406PMDTinPrc, T01VE2_A8407PMDAcaPrc, T01VE2_A8408PMDKgmMinS, T01VE2_A396EmprCod, T01VE2_A252CliCod
            }
            , new Object[] {
            T01VE3_A8403PMDLin, T01VE3_A8404PMDKgmMin, T01VE3_A8405PMDKgmMax, T01VE3_A8406PMDTinPrc, T01VE3_A8407PMDAcaPrc, T01VE3_A8408PMDKgmMinS, T01VE3_A396EmprCod, T01VE3_A252CliCod
            }
            , new Object[] {
            T01VE4_A407EmprNom, T01VE4_n407EmprNom
            }
            , new Object[] {
            T01VE5_A279CliNom, T01VE5_A8400PMDPreLim, T01VE5_n8400PMDPreLim, T01VE5_A8401PMDPreMin, T01VE5_n8401PMDPreMin, T01VE5_A8402PMDLinUlt, T01VE5_n8402PMDLinUlt
            }
            , new Object[] {
            T01VE6_A8403PMDLin, T01VE6_A407EmprNom, T01VE6_n407EmprNom, T01VE6_A279CliNom, T01VE6_A8400PMDPreLim, T01VE6_n8400PMDPreLim, T01VE6_A8401PMDPreMin, T01VE6_n8401PMDPreMin, T01VE6_A8402PMDLinUlt, T01VE6_n8402PMDLinUlt,
            T01VE6_A8404PMDKgmMin, T01VE6_A8405PMDKgmMax, T01VE6_A8406PMDTinPrc, T01VE6_A8407PMDAcaPrc, T01VE6_A8408PMDKgmMinS, T01VE6_A396EmprCod, T01VE6_A252CliCod
            }
            , new Object[] {
            T01VE7_A407EmprNom, T01VE7_n407EmprNom
            }
            , new Object[] {
            T01VE8_A279CliNom, T01VE8_A8400PMDPreLim, T01VE8_n8400PMDPreLim, T01VE8_A8401PMDPreMin, T01VE8_n8401PMDPreMin, T01VE8_A8402PMDLinUlt, T01VE8_n8402PMDLinUlt
            }
            , new Object[] {
            T01VE9_A396EmprCod, T01VE9_A252CliCod, T01VE9_A8403PMDLin
            }
            , new Object[] {
            T01VE10_A396EmprCod, T01VE10_A252CliCod, T01VE10_A8403PMDLin
            }
            , new Object[] {
            T01VE11_A396EmprCod, T01VE11_A252CliCod, T01VE11_A8403PMDLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01VE15_A407EmprNom, T01VE15_n407EmprNom
            }
            , new Object[] {
            T01VE16_A279CliNom, T01VE16_A8400PMDPreLim, T01VE16_n8400PMDPreLim, T01VE16_A8401PMDPreMin, T01VE16_n8401PMDPreMin, T01VE16_A8402PMDLinUlt, T01VE16_n8402PMDLinUlt
            }
            , new Object[] {
            T01VE17_A396EmprCod, T01VE17_A252CliCod, T01VE17_A8403PMDLin
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z8403PMDLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A8403PMDLin ;
   private short RcdFound1160 ;
   private short nIsDirty_1160 ;
   private short ZZ8403PMDLin ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtPMDPreLim_Enabled ;
   private int edtPMDPreMin_Enabled ;
   private int A8402PMDLinUlt ;
   private int edtPMDLinUlt_Enabled ;
   private int edtPMDLin_Enabled ;
   private int edtPMDKgmMin_Enabled ;
   private int edtPMDKgmMax_Enabled ;
   private int edtPMDTinPrc_Enabled ;
   private int edtPMDAcaPrc_Enabled ;
   private int edtPMDKgmMinS_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int Z8402PMDLinUlt ;
   private int idxLst ;
   private int ZZ252CliCod ;
   private int ZZ8402PMDLinUlt ;
   private java.math.BigDecimal Z8404PMDKgmMin ;
   private java.math.BigDecimal Z8405PMDKgmMax ;
   private java.math.BigDecimal Z8406PMDTinPrc ;
   private java.math.BigDecimal Z8407PMDAcaPrc ;
   private java.math.BigDecimal Z8408PMDKgmMinS ;
   private java.math.BigDecimal A8400PMDPreLim ;
   private java.math.BigDecimal A8401PMDPreMin ;
   private java.math.BigDecimal A8404PMDKgmMin ;
   private java.math.BigDecimal A8405PMDKgmMax ;
   private java.math.BigDecimal A8406PMDTinPrc ;
   private java.math.BigDecimal A8407PMDAcaPrc ;
   private java.math.BigDecimal A8408PMDKgmMinS ;
   private java.math.BigDecimal Z8400PMDPreLim ;
   private java.math.BigDecimal Z8401PMDPreMin ;
   private java.math.BigDecimal ZZ8404PMDKgmMin ;
   private java.math.BigDecimal ZZ8405PMDKgmMax ;
   private java.math.BigDecimal ZZ8406PMDTinPrc ;
   private java.math.BigDecimal ZZ8407PMDAcaPrc ;
   private java.math.BigDecimal ZZ8408PMDKgmMinS ;
   private java.math.BigDecimal ZZ8400PMDPreLim ;
   private java.math.BigDecimal ZZ8401PMDPreMin ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtPMDPreLim_Internalname ;
   private String edtPMDPreLim_Jsonclick ;
   private String edtPMDPreMin_Internalname ;
   private String edtPMDPreMin_Jsonclick ;
   private String edtPMDLinUlt_Internalname ;
   private String edtPMDLinUlt_Jsonclick ;
   private String edtPMDLin_Internalname ;
   private String edtPMDLin_Jsonclick ;
   private String edtPMDKgmMin_Internalname ;
   private String edtPMDKgmMin_Jsonclick ;
   private String edtPMDKgmMax_Internalname ;
   private String edtPMDKgmMax_Jsonclick ;
   private String edtPMDTinPrc_Internalname ;
   private String edtPMDTinPrc_Jsonclick ;
   private String edtPMDAcaPrc_Internalname ;
   private String edtPMDAcaPrc_Jsonclick ;
   private String edtPMDKgmMinS_Internalname ;
   private String edtPMDKgmMinS_Jsonclick ;
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
   private String Z279CliNom ;
   private String sMode1160 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n8400PMDPreLim ;
   private boolean n8401PMDPreMin ;
   private boolean n8402PMDLinUlt ;
   private IDataStoreProvider pr_default ;
   private short[] T01VE6_A8403PMDLin ;
   private String[] T01VE6_A407EmprNom ;
   private boolean[] T01VE6_n407EmprNom ;
   private String[] T01VE6_A279CliNom ;
   private java.math.BigDecimal[] T01VE6_A8400PMDPreLim ;
   private boolean[] T01VE6_n8400PMDPreLim ;
   private java.math.BigDecimal[] T01VE6_A8401PMDPreMin ;
   private boolean[] T01VE6_n8401PMDPreMin ;
   private int[] T01VE6_A8402PMDLinUlt ;
   private boolean[] T01VE6_n8402PMDLinUlt ;
   private java.math.BigDecimal[] T01VE6_A8404PMDKgmMin ;
   private java.math.BigDecimal[] T01VE6_A8405PMDKgmMax ;
   private java.math.BigDecimal[] T01VE6_A8406PMDTinPrc ;
   private java.math.BigDecimal[] T01VE6_A8407PMDAcaPrc ;
   private java.math.BigDecimal[] T01VE6_A8408PMDKgmMinS ;
   private String[] T01VE6_A396EmprCod ;
   private int[] T01VE6_A252CliCod ;
   private String[] T01VE4_A407EmprNom ;
   private boolean[] T01VE4_n407EmprNom ;
   private String[] T01VE5_A279CliNom ;
   private java.math.BigDecimal[] T01VE5_A8400PMDPreLim ;
   private boolean[] T01VE5_n8400PMDPreLim ;
   private java.math.BigDecimal[] T01VE5_A8401PMDPreMin ;
   private boolean[] T01VE5_n8401PMDPreMin ;
   private int[] T01VE5_A8402PMDLinUlt ;
   private boolean[] T01VE5_n8402PMDLinUlt ;
   private String[] T01VE7_A407EmprNom ;
   private boolean[] T01VE7_n407EmprNom ;
   private String[] T01VE8_A279CliNom ;
   private java.math.BigDecimal[] T01VE8_A8400PMDPreLim ;
   private boolean[] T01VE8_n8400PMDPreLim ;
   private java.math.BigDecimal[] T01VE8_A8401PMDPreMin ;
   private boolean[] T01VE8_n8401PMDPreMin ;
   private int[] T01VE8_A8402PMDLinUlt ;
   private boolean[] T01VE8_n8402PMDLinUlt ;
   private String[] T01VE9_A396EmprCod ;
   private int[] T01VE9_A252CliCod ;
   private short[] T01VE9_A8403PMDLin ;
   private short[] T01VE3_A8403PMDLin ;
   private java.math.BigDecimal[] T01VE3_A8404PMDKgmMin ;
   private java.math.BigDecimal[] T01VE3_A8405PMDKgmMax ;
   private java.math.BigDecimal[] T01VE3_A8406PMDTinPrc ;
   private java.math.BigDecimal[] T01VE3_A8407PMDAcaPrc ;
   private java.math.BigDecimal[] T01VE3_A8408PMDKgmMinS ;
   private String[] T01VE3_A396EmprCod ;
   private int[] T01VE3_A252CliCod ;
   private String[] T01VE10_A396EmprCod ;
   private int[] T01VE10_A252CliCod ;
   private short[] T01VE10_A8403PMDLin ;
   private String[] T01VE11_A396EmprCod ;
   private int[] T01VE11_A252CliCod ;
   private short[] T01VE11_A8403PMDLin ;
   private short[] T01VE2_A8403PMDLin ;
   private java.math.BigDecimal[] T01VE2_A8404PMDKgmMin ;
   private java.math.BigDecimal[] T01VE2_A8405PMDKgmMax ;
   private java.math.BigDecimal[] T01VE2_A8406PMDTinPrc ;
   private java.math.BigDecimal[] T01VE2_A8407PMDAcaPrc ;
   private java.math.BigDecimal[] T01VE2_A8408PMDKgmMinS ;
   private String[] T01VE2_A396EmprCod ;
   private int[] T01VE2_A252CliCod ;
   private String[] T01VE15_A407EmprNom ;
   private boolean[] T01VE15_n407EmprNom ;
   private String[] T01VE16_A279CliNom ;
   private java.math.BigDecimal[] T01VE16_A8400PMDPreLim ;
   private boolean[] T01VE16_n8400PMDPreLim ;
   private java.math.BigDecimal[] T01VE16_A8401PMDPreMin ;
   private boolean[] T01VE16_n8401PMDPreMin ;
   private int[] T01VE16_A8402PMDLinUlt ;
   private boolean[] T01VE16_n8402PMDLinUlt ;
   private String[] T01VE17_A396EmprCod ;
   private int[] T01VE17_A252CliCod ;
   private short[] T01VE17_A8403PMDLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpenmd_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpenmd_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpenmd_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpenmd_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpenmd_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01VE2", "SELECT PMDLin, PMDKgmMin, PMDKgmMax, PMDTinPrc, PMDAcaPrc, PMDKgmMinS, EmprCod, CliCod FROM TXPPenMD WHERE EmprCod = ? AND CliCod = ? AND PMDLin = ?  FOR UPDATE OF PMDKgmMin, PMDKgmMax, PMDTinPrc, PMDAcaPrc, PMDKgmMinS NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VE3", "SELECT PMDLin, PMDKgmMin, PMDKgmMax, PMDTinPrc, PMDAcaPrc, PMDKgmMinS, EmprCod, CliCod FROM TXPPenMD WHERE EmprCod = ? AND CliCod = ? AND PMDLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VE4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VE5", "SELECT CliNom, PMDPreLim, PMDPreMin, PMDLinUlt FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VE6", "SELECT /*+ FIRST_ROWS(100) */ TM1.PMDLin, T2.EmprNom, T3.CliNom, T3.PMDPreLim, T3.PMDPreMin, T3.PMDLinUlt, TM1.PMDKgmMin, TM1.PMDKgmMax, TM1.PMDTinPrc, TM1.PMDAcaPrc, TM1.PMDKgmMinS, TM1.EmprCod, TM1.CliCod FROM ((TXPPenMD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.PMDLin = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.PMDLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VE7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VE8", "SELECT CliNom, PMDPreLim, PMDPreMin, PMDLinUlt FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VE9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PMDLin FROM TXPPenMD WHERE EmprCod = ? AND CliCod = ? AND PMDLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VE10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PMDLin FROM TXPPenMD WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and PMDLin > ?) ORDER BY EmprCod, CliCod, PMDLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VE11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PMDLin FROM TXPPenMD WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and PMDLin < ?) ORDER BY EmprCod DESC, CliCod DESC, PMDLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01VE12", "INSERT INTO TXPPenMD(PMDLin, PMDKgmMin, PMDKgmMax, PMDTinPrc, PMDAcaPrc, PMDKgmMinS, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPenMD")
         ,new UpdateCursor("T01VE13", "UPDATE TXPPenMD SET PMDKgmMin=?, PMDKgmMax=?, PMDTinPrc=?, PMDAcaPrc=?, PMDKgmMinS=?  WHERE EmprCod = ? AND CliCod = ? AND PMDLin = ?", GX_NOMASK, "TXPPenMD")
         ,new UpdateCursor("T01VE14", "DELETE FROM TXPPenMD  WHERE EmprCod = ? AND CliCod = ? AND PMDLin = ?", GX_NOMASK, "TXPPenMD")
         ,new ForEachCursor("T01VE15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VE16", "SELECT CliNom, PMDPreLim, PMDPreMin, PMDLinUlt FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VE17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, PMDLin FROM TXPPenMD ORDER BY EmprCod, CliCod, PMDLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[15])[0] = rslt.getString(12, 3);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

