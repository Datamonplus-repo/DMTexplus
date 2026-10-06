package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class preciofase_trn_impl extends GXDataArea
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         n457FasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A457FasCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Precio Fase ", ""), (short)(0)) ;
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

   public preciofase_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public preciofase_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preciofase_trn_impl.class ));
   }

   public preciofase_trn_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkFasPreU = UIFactory.getCheckbox(this);
      chkFasPreKgF = UIFactory.getCheckbox(this);
      chkFasKgsEnt = UIFactory.getCheckbox(this);
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
      A10882FasPreU = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10882FasPreU, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10882FasPreU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10882FasPreU", GXutil.str( A10882FasPreU, 1, 0));
      A12577FasPreKgF = ((GXutil.strcmp(GXutil.rtrim( A12577FasPreKgF), "S")==0) ? "S" : "N") ;
      n12577FasPreKgF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12577FasPreKgF", A12577FasPreKgF);
      A13587FasKgsEnt = ((GXutil.strcmp(GXutil.rtrim( A13587FasKgsEnt), "S")==0) ? "S" : "N") ;
      n13587FasKgsEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13587FasKgsEnt", A13587FasKgsEnt);
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Precio Fase ", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\PrecioFase_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Facturacion\\PrecioFase_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCod_Internalname, httpContext.getMessage( "Codigo Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDsc_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDsc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDsc2_Internalname, httpContext.getMessage( "Descripcion II", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc2_Internalname, GXutil.rtrim( A4642FasDsc2), GXutil.rtrim( localUtil.format( A4642FasDsc2, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasDsc2_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPreMtr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasPreMtr_Internalname, httpContext.getMessage( "Precio Metro Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPreMtr_Enabled!=0) ? localUtil.format( A467FasPreMtr, "ZZZZZZ9.999") : localUtil.format( A467FasPreMtr, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreMtr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasPreMtr_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPreKgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasPreKgm_Internalname, httpContext.getMessage( "Precio Kilo Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPreKgm_Enabled!=0) ? localUtil.format( A466FasPreKgm, "ZZZZZZ9.999") : localUtil.format( A466FasPreKgm, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreKgm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasPreKgm_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasSumTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasSumTin_Internalname, httpContext.getMessage( "Suma fase tinte", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasSumTin_Internalname, GXutil.rtrim( A470FasSumTin), GXutil.rtrim( localUtil.format( A470FasSumTin, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasSumTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasSumTin_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasFacCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasFacCod_Internalname, httpContext.getMessage( "Codigo Factura", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasFacCod_Internalname, GXutil.rtrim( A3615FasFacCod), GXutil.rtrim( localUtil.format( A3615FasFacCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasFacCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasFacCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPreFAc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasPreFAc_Internalname, httpContext.getMessage( "Fecha Precio Actual", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtFasPreFAc_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreFAc_Internalname, localUtil.format(A4385FasPreFAc, "99/99/99"), localUtil.format( A4385FasPreFAc, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreFAc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasPreFAc_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtFasPreFAc_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFasPreFAc_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPreKAn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasPreKAn_Internalname, httpContext.getMessage( "Precio Kilo Anterior", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreKAn_Internalname, GXutil.ltrim( localUtil.ntoc( A4386FasPreKAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPreKAn_Enabled!=0) ? localUtil.format( A4386FasPreKAn, "ZZZZZZ9.99999") : localUtil.format( A4386FasPreKAn, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreKAn_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasPreKAn_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPreMAn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasPreMAn_Internalname, httpContext.getMessage( "Precio Metro Anterior", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreMAn_Internalname, GXutil.ltrim( localUtil.ntoc( A4387FasPreMAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPreMAn_Enabled!=0) ? localUtil.format( A4387FasPreMAn, "ZZZZZZ9.99999") : localUtil.format( A4387FasPreMAn, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreMAn_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasPreMAn_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPreFAn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasPreFAn_Internalname, httpContext.getMessage( "Fecha Precio Anterior", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtFasPreFAn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreFAn_Internalname, localUtil.format(A4388FasPreFAn, "99/99/99"), localUtil.format( A4388FasPreFAn, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreFAn_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasPreFAn_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtFasPreFAn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFasPreFAn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkFasPreU.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkFasPreU.getInternalname(), httpContext.getMessage( "Precio Unico p/Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkFasPreU.getInternalname(), GXutil.str( A10882FasPreU, 1, 0), "", httpContext.getMessage( "Precio Unico p/Fase", ""), 1, chkFasPreU.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(109, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPreMt2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasPreMt2_Internalname, httpContext.getMessage( "Precio Mt 2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreMt2_Internalname, GXutil.ltrim( localUtil.ntoc( A12576FasPreMt2, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPreMt2_Enabled!=0) ? localUtil.format( A12576FasPreMt2, "ZZZZZZ9.99999") : localUtil.format( A12576FasPreMt2, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreMt2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasPreMt2_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkFasPreKgF.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkFasPreKgF.getInternalname(), httpContext.getMessage( "Facturar Precio Kilo?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkFasPreKgF.getInternalname(), A12577FasPreKgF, "", httpContext.getMessage( "Facturar Precio Kilo?", ""), 1, chkFasPreKgF.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(119, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,119);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasKgsMn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasKgsMn_Internalname, httpContext.getMessage( "Kgs Minimo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasKgsMn_Internalname, GXutil.ltrim( localUtil.ntoc( A12704FasKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasKgsMn_Enabled!=0) ? localUtil.format( A12704FasKgsMn, "ZZZZZ9.99") : localUtil.format( A12704FasKgsMn, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasKgsMn_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasKgsMn_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkFasKgsEnt.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkFasKgsEnt.getInternalname(), httpContext.getMessage( "Facturar por Kilos Entrada?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkFasKgsEnt.getInternalname(), A13587FasKgsEnt, "", httpContext.getMessage( "Facturar por Kilos Entrada?", ""), 1, chkFasKgsEnt.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(129, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,129);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasSigla_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasSigla_Internalname, httpContext.getMessage( "Siglas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasSigla_Internalname, GXutil.rtrim( A7070FasSigla), GXutil.rtrim( localUtil.format( A7070FasSigla, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasSigla_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasSigla_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasFactura_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasFactura_Internalname, httpContext.getMessage( "Facturar?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasFactura_Internalname, GXutil.rtrim( A14258FasFactura), GXutil.rtrim( localUtil.format( A14258FasFactura, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasFactura_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasFactura_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioFase_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioFase_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioFase_TRN.htm");
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
         Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
         Z467FasPreMtr = localUtil.ctond( httpContext.cgiGet( "Z467FasPreMtr")) ;
         Z466FasPreKgm = localUtil.ctond( httpContext.cgiGet( "Z466FasPreKgm")) ;
         Z470FasSumTin = httpContext.cgiGet( "Z470FasSumTin") ;
         Z3615FasFacCod = httpContext.cgiGet( "Z3615FasFacCod") ;
         Z4385FasPreFAc = localUtil.ctod( httpContext.cgiGet( "Z4385FasPreFAc"), 0) ;
         Z4386FasPreKAn = localUtil.ctond( httpContext.cgiGet( "Z4386FasPreKAn")) ;
         Z4387FasPreMAn = localUtil.ctond( httpContext.cgiGet( "Z4387FasPreMAn")) ;
         Z4388FasPreFAn = localUtil.ctod( httpContext.cgiGet( "Z4388FasPreFAn"), 0) ;
         Z10882FasPreU = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10882FasPreU"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12576FasPreMt2 = localUtil.ctond( httpContext.cgiGet( "Z12576FasPreMt2")) ;
         Z12577FasPreKgF = httpContext.cgiGet( "Z12577FasPreKgF") ;
         Z12704FasKgsMn = localUtil.ctond( httpContext.cgiGet( "Z12704FasKgsMn")) ;
         Z13587FasKgsEnt = httpContext.cgiGet( "Z13587FasKgsEnt") ;
         Z14258FasFactura = httpContext.cgiGet( "Z14258FasFactura") ;
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
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
         n457FasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A4642FasDsc2 = httpContext.cgiGet( edtFasDsc2_Internalname) ;
         n4642FasDsc2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", A4642FasDsc2);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASPREMTR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasPreMtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A467FasPreMtr = DecimalUtil.ZERO ;
            n467FasPreMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrimstr( A467FasPreMtr, 13, 5));
         }
         else
         {
            A467FasPreMtr = localUtil.ctond( httpContext.cgiGet( edtFasPreMtr_Internalname)) ;
            n467FasPreMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrimstr( A467FasPreMtr, 13, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasPreKgm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASPREKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasPreKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A466FasPreKgm = DecimalUtil.ZERO ;
            n466FasPreKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrimstr( A466FasPreKgm, 13, 5));
         }
         else
         {
            A466FasPreKgm = localUtil.ctond( httpContext.cgiGet( edtFasPreKgm_Internalname)) ;
            n466FasPreKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrimstr( A466FasPreKgm, 13, 5));
         }
         A470FasSumTin = GXutil.upper( httpContext.cgiGet( edtFasSumTin_Internalname)) ;
         n470FasSumTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A470FasSumTin", A470FasSumTin);
         A3615FasFacCod = httpContext.cgiGet( edtFasFacCod_Internalname) ;
         n3615FasFacCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3615FasFacCod", A3615FasFacCod);
         if ( localUtil.vcdate( httpContext.cgiGet( edtFasPreFAc_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FASPREFAC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasPreFAc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4385FasPreFAc = GXutil.nullDate() ;
            n4385FasPreFAc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4385FasPreFAc", localUtil.format(A4385FasPreFAc, "99/99/99"));
         }
         else
         {
            A4385FasPreFAc = localUtil.ctod( httpContext.cgiGet( edtFasPreFAc_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4385FasPreFAc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4385FasPreFAc", localUtil.format(A4385FasPreFAc, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasPreKAn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasPreKAn_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASPREKAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasPreKAn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4386FasPreKAn = DecimalUtil.ZERO ;
            n4386FasPreKAn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4386FasPreKAn", GXutil.ltrimstr( A4386FasPreKAn, 13, 5));
         }
         else
         {
            A4386FasPreKAn = localUtil.ctond( httpContext.cgiGet( edtFasPreKAn_Internalname)) ;
            n4386FasPreKAn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4386FasPreKAn", GXutil.ltrimstr( A4386FasPreKAn, 13, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasPreMAn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasPreMAn_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASPREMAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasPreMAn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4387FasPreMAn = DecimalUtil.ZERO ;
            n4387FasPreMAn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4387FasPreMAn", GXutil.ltrimstr( A4387FasPreMAn, 13, 5));
         }
         else
         {
            A4387FasPreMAn = localUtil.ctond( httpContext.cgiGet( edtFasPreMAn_Internalname)) ;
            n4387FasPreMAn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4387FasPreMAn", GXutil.ltrimstr( A4387FasPreMAn, 13, 5));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtFasPreFAn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FASPREFAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasPreFAn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4388FasPreFAn = GXutil.nullDate() ;
            n4388FasPreFAn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4388FasPreFAn", localUtil.format(A4388FasPreFAn, "99/99/99"));
         }
         else
         {
            A4388FasPreFAn = localUtil.ctod( httpContext.cgiGet( edtFasPreFAn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4388FasPreFAn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4388FasPreFAn", localUtil.format(A4388FasPreFAn, "99/99/99"));
         }
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkFasPreU.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkFasPreU.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASPREU");
            AnyError = (short)(1) ;
            GX_FocusControl = chkFasPreU.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10882FasPreU = (byte)(0) ;
            n10882FasPreU = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10882FasPreU", GXutil.str( A10882FasPreU, 1, 0));
         }
         else
         {
            A10882FasPreU = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkFasPreU.getInternalname()), "1")==0) ? 1 : 0)) ;
            n10882FasPreU = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10882FasPreU", GXutil.str( A10882FasPreU, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasPreMt2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasPreMt2_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASPREMT2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasPreMt2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12576FasPreMt2 = DecimalUtil.ZERO ;
            n12576FasPreMt2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12576FasPreMt2", GXutil.ltrimstr( A12576FasPreMt2, 13, 5));
         }
         else
         {
            A12576FasPreMt2 = localUtil.ctond( httpContext.cgiGet( edtFasPreMt2_Internalname)) ;
            n12576FasPreMt2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12576FasPreMt2", GXutil.ltrimstr( A12576FasPreMt2, 13, 5));
         }
         A12577FasPreKgF = ((GXutil.strcmp(httpContext.cgiGet( chkFasPreKgF.getInternalname()), "S")==0) ? "S" : "N") ;
         n12577FasPreKgF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12577FasPreKgF", A12577FasPreKgF);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasKgsMn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasKgsMn_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASKGSMN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasKgsMn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12704FasKgsMn = DecimalUtil.ZERO ;
            n12704FasKgsMn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12704FasKgsMn", GXutil.ltrimstr( A12704FasKgsMn, 9, 2));
         }
         else
         {
            A12704FasKgsMn = localUtil.ctond( httpContext.cgiGet( edtFasKgsMn_Internalname)) ;
            n12704FasKgsMn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12704FasKgsMn", GXutil.ltrimstr( A12704FasKgsMn, 9, 2));
         }
         A13587FasKgsEnt = ((GXutil.strcmp(httpContext.cgiGet( chkFasKgsEnt.getInternalname()), "S")==0) ? "S" : "N") ;
         n13587FasKgsEnt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13587FasKgsEnt", A13587FasKgsEnt);
         A7070FasSigla = httpContext.cgiGet( edtFasSigla_Internalname) ;
         n7070FasSigla = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7070FasSigla", A7070FasSigla);
         A14258FasFactura = httpContext.cgiGet( edtFasFactura_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14258FasFactura", A14258FasFactura);
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
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A457FasCod = httpContext.GetPar( "FasCod") ;
            n457FasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
            initAll1V785( ) ;
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
      disableAttributes1V785( ) ;
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

   public void resetCaption1V70( )
   {
   }

   public void zm1V785( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z467FasPreMtr = T01V73_A467FasPreMtr[0] ;
            Z466FasPreKgm = T01V73_A466FasPreKgm[0] ;
            Z470FasSumTin = T01V73_A470FasSumTin[0] ;
            Z3615FasFacCod = T01V73_A3615FasFacCod[0] ;
            Z4385FasPreFAc = T01V73_A4385FasPreFAc[0] ;
            Z4386FasPreKAn = T01V73_A4386FasPreKAn[0] ;
            Z4387FasPreMAn = T01V73_A4387FasPreMAn[0] ;
            Z4388FasPreFAn = T01V73_A4388FasPreFAn[0] ;
            Z10882FasPreU = T01V73_A10882FasPreU[0] ;
            Z12576FasPreMt2 = T01V73_A12576FasPreMt2[0] ;
            Z12577FasPreKgF = T01V73_A12577FasPreKgF[0] ;
            Z12704FasKgsMn = T01V73_A12704FasKgsMn[0] ;
            Z13587FasKgsEnt = T01V73_A13587FasKgsEnt[0] ;
            Z14258FasFactura = T01V73_A14258FasFactura[0] ;
         }
         else
         {
            Z467FasPreMtr = A467FasPreMtr ;
            Z466FasPreKgm = A466FasPreKgm ;
            Z470FasSumTin = A470FasSumTin ;
            Z3615FasFacCod = A3615FasFacCod ;
            Z4385FasPreFAc = A4385FasPreFAc ;
            Z4386FasPreKAn = A4386FasPreKAn ;
            Z4387FasPreMAn = A4387FasPreMAn ;
            Z4388FasPreFAn = A4388FasPreFAn ;
            Z10882FasPreU = A10882FasPreU ;
            Z12576FasPreMt2 = A12576FasPreMt2 ;
            Z12577FasPreKgF = A12577FasPreKgF ;
            Z12704FasKgsMn = A12704FasKgsMn ;
            Z13587FasKgsEnt = A13587FasKgsEnt ;
            Z14258FasFactura = A14258FasFactura ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z467FasPreMtr = A467FasPreMtr ;
         Z466FasPreKgm = A466FasPreKgm ;
         Z470FasSumTin = A470FasSumTin ;
         Z3615FasFacCod = A3615FasFacCod ;
         Z4385FasPreFAc = A4385FasPreFAc ;
         Z4386FasPreKAn = A4386FasPreKAn ;
         Z4387FasPreMAn = A4387FasPreMAn ;
         Z4388FasPreFAn = A4388FasPreFAn ;
         Z10882FasPreU = A10882FasPreU ;
         Z12576FasPreMt2 = A12576FasPreMt2 ;
         Z12577FasPreKgF = A12577FasPreKgF ;
         Z12704FasKgsMn = A12704FasKgsMn ;
         Z13587FasKgsEnt = A13587FasKgsEnt ;
         Z14258FasFactura = A14258FasFactura ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z457FasCod = A457FasCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z460FasDsc = A460FasDsc ;
         Z4642FasDsc2 = A4642FasDsc2 ;
         Z7070FasSigla = A7070FasSigla ;
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

   public void load1V785( )
   {
      /* Using cursor T01V77 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound85 = (short)(1) ;
         A279CliNom = T01V77_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = T01V77_A407EmprNom[0] ;
         n407EmprNom = T01V77_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A460FasDsc = T01V77_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A4642FasDsc2 = T01V77_A4642FasDsc2[0] ;
         n4642FasDsc2 = T01V77_n4642FasDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", A4642FasDsc2);
         A467FasPreMtr = T01V77_A467FasPreMtr[0] ;
         n467FasPreMtr = T01V77_n467FasPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrimstr( A467FasPreMtr, 13, 5));
         A466FasPreKgm = T01V77_A466FasPreKgm[0] ;
         n466FasPreKgm = T01V77_n466FasPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrimstr( A466FasPreKgm, 13, 5));
         A470FasSumTin = T01V77_A470FasSumTin[0] ;
         n470FasSumTin = T01V77_n470FasSumTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A470FasSumTin", A470FasSumTin);
         A3615FasFacCod = T01V77_A3615FasFacCod[0] ;
         n3615FasFacCod = T01V77_n3615FasFacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3615FasFacCod", A3615FasFacCod);
         A4385FasPreFAc = T01V77_A4385FasPreFAc[0] ;
         n4385FasPreFAc = T01V77_n4385FasPreFAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4385FasPreFAc", localUtil.format(A4385FasPreFAc, "99/99/99"));
         A4386FasPreKAn = T01V77_A4386FasPreKAn[0] ;
         n4386FasPreKAn = T01V77_n4386FasPreKAn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4386FasPreKAn", GXutil.ltrimstr( A4386FasPreKAn, 13, 5));
         A4387FasPreMAn = T01V77_A4387FasPreMAn[0] ;
         n4387FasPreMAn = T01V77_n4387FasPreMAn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4387FasPreMAn", GXutil.ltrimstr( A4387FasPreMAn, 13, 5));
         A4388FasPreFAn = T01V77_A4388FasPreFAn[0] ;
         n4388FasPreFAn = T01V77_n4388FasPreFAn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4388FasPreFAn", localUtil.format(A4388FasPreFAn, "99/99/99"));
         A10882FasPreU = T01V77_A10882FasPreU[0] ;
         n10882FasPreU = T01V77_n10882FasPreU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10882FasPreU", GXutil.str( A10882FasPreU, 1, 0));
         A12576FasPreMt2 = T01V77_A12576FasPreMt2[0] ;
         n12576FasPreMt2 = T01V77_n12576FasPreMt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12576FasPreMt2", GXutil.ltrimstr( A12576FasPreMt2, 13, 5));
         A12577FasPreKgF = T01V77_A12577FasPreKgF[0] ;
         n12577FasPreKgF = T01V77_n12577FasPreKgF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12577FasPreKgF", A12577FasPreKgF);
         A12704FasKgsMn = T01V77_A12704FasKgsMn[0] ;
         n12704FasKgsMn = T01V77_n12704FasKgsMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12704FasKgsMn", GXutil.ltrimstr( A12704FasKgsMn, 9, 2));
         A13587FasKgsEnt = T01V77_A13587FasKgsEnt[0] ;
         n13587FasKgsEnt = T01V77_n13587FasKgsEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13587FasKgsEnt", A13587FasKgsEnt);
         A7070FasSigla = T01V77_A7070FasSigla[0] ;
         n7070FasSigla = T01V77_n7070FasSigla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7070FasSigla", A7070FasSigla);
         A14258FasFactura = T01V77_A14258FasFactura[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14258FasFactura", A14258FasFactura);
         zm1V785( -2) ;
      }
      pr_default.close(5);
      onLoadActions1V785( ) ;
   }

   public void onLoadActions1V785( )
   {
   }

   public void checkExtendedTable1V785( )
   {
      nIsDirty_85 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01V74 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01V74_A407EmprNom[0] ;
      n407EmprNom = T01V74_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01V75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01V75_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
      /* Using cursor T01V76 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01V76_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A4642FasDsc2 = T01V76_A4642FasDsc2[0] ;
      n4642FasDsc2 = T01V76_n4642FasDsc2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", A4642FasDsc2);
      A7070FasSigla = T01V76_A7070FasSigla[0] ;
      n7070FasSigla = T01V76_n7070FasSigla[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7070FasSigla", A7070FasSigla);
      pr_default.close(4);
      if ( ! ( ( GXutil.strcmp(A470FasSumTin, "S") == 0 ) || ( GXutil.strcmp(A470FasSumTin, "N") == 0 ) || ( GXutil.strcmp(A470FasSumTin, "F") == 0 ) || ( GXutil.strcmp(A470FasSumTin, "P") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Suma fase tinte", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FASSUMTIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasSumTin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1V785( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod )
   {
      /* Using cursor T01V78 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01V78_A407EmprNom[0] ;
      n407EmprNom = T01V78_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_4( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01V79 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01V79_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_5( String A396EmprCod ,
                         String A457FasCod )
   {
      /* Using cursor T01V710 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01V710_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A4642FasDsc2 = T01V710_A4642FasDsc2[0] ;
      n4642FasDsc2 = T01V710_n4642FasDsc2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", A4642FasDsc2);
      A7070FasSigla = T01V710_A7070FasSigla[0] ;
      n7070FasSigla = T01V710_n7070FasSigla[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7070FasSigla", A7070FasSigla);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4642FasDsc2))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7070FasSigla))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1V785( )
   {
      /* Using cursor T01V711 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound85 = (short)(1) ;
      }
      else
      {
         RcdFound85 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01V73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1V785( 2) ;
         RcdFound85 = (short)(1) ;
         A467FasPreMtr = T01V73_A467FasPreMtr[0] ;
         n467FasPreMtr = T01V73_n467FasPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrimstr( A467FasPreMtr, 13, 5));
         A466FasPreKgm = T01V73_A466FasPreKgm[0] ;
         n466FasPreKgm = T01V73_n466FasPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrimstr( A466FasPreKgm, 13, 5));
         A470FasSumTin = T01V73_A470FasSumTin[0] ;
         n470FasSumTin = T01V73_n470FasSumTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A470FasSumTin", A470FasSumTin);
         A3615FasFacCod = T01V73_A3615FasFacCod[0] ;
         n3615FasFacCod = T01V73_n3615FasFacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3615FasFacCod", A3615FasFacCod);
         A4385FasPreFAc = T01V73_A4385FasPreFAc[0] ;
         n4385FasPreFAc = T01V73_n4385FasPreFAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4385FasPreFAc", localUtil.format(A4385FasPreFAc, "99/99/99"));
         A4386FasPreKAn = T01V73_A4386FasPreKAn[0] ;
         n4386FasPreKAn = T01V73_n4386FasPreKAn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4386FasPreKAn", GXutil.ltrimstr( A4386FasPreKAn, 13, 5));
         A4387FasPreMAn = T01V73_A4387FasPreMAn[0] ;
         n4387FasPreMAn = T01V73_n4387FasPreMAn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4387FasPreMAn", GXutil.ltrimstr( A4387FasPreMAn, 13, 5));
         A4388FasPreFAn = T01V73_A4388FasPreFAn[0] ;
         n4388FasPreFAn = T01V73_n4388FasPreFAn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4388FasPreFAn", localUtil.format(A4388FasPreFAn, "99/99/99"));
         A10882FasPreU = T01V73_A10882FasPreU[0] ;
         n10882FasPreU = T01V73_n10882FasPreU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10882FasPreU", GXutil.str( A10882FasPreU, 1, 0));
         A12576FasPreMt2 = T01V73_A12576FasPreMt2[0] ;
         n12576FasPreMt2 = T01V73_n12576FasPreMt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12576FasPreMt2", GXutil.ltrimstr( A12576FasPreMt2, 13, 5));
         A12577FasPreKgF = T01V73_A12577FasPreKgF[0] ;
         n12577FasPreKgF = T01V73_n12577FasPreKgF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12577FasPreKgF", A12577FasPreKgF);
         A12704FasKgsMn = T01V73_A12704FasKgsMn[0] ;
         n12704FasKgsMn = T01V73_n12704FasKgsMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12704FasKgsMn", GXutil.ltrimstr( A12704FasKgsMn, 9, 2));
         A13587FasKgsEnt = T01V73_A13587FasKgsEnt[0] ;
         n13587FasKgsEnt = T01V73_n13587FasKgsEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13587FasKgsEnt", A13587FasKgsEnt);
         A14258FasFactura = T01V73_A14258FasFactura[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14258FasFactura", A14258FasFactura);
         A396EmprCod = T01V73_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01V73_A252CliCod[0] ;
         n252CliCod = T01V73_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A457FasCod = T01V73_A457FasCod[0] ;
         n457FasCod = T01V73_n457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z457FasCod = A457FasCod ;
         sMode85 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1V785( ) ;
         if ( AnyError == 1 )
         {
            RcdFound85 = (short)(0) ;
            initializeNonKey1V785( ) ;
         }
         Gx_mode = sMode85 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound85 = (short)(0) ;
         initializeNonKey1V785( ) ;
         sMode85 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode85 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1V785( ) ;
      if ( RcdFound85 == 0 )
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
      RcdFound85 = (short)(0) ;
      /* Using cursor T01V712 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01V712_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01V712_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V712_A252CliCod[0] < A252CliCod ) || ( T01V712_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01V712_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V712_A457FasCod[0], A457FasCod) < 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01V712_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01V712_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V712_A252CliCod[0] > A252CliCod ) || ( T01V712_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01V712_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V712_A457FasCod[0], A457FasCod) > 0 ) ) )
         {
            A396EmprCod = T01V712_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01V712_A252CliCod[0] ;
            n252CliCod = T01V712_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A457FasCod = T01V712_A457FasCod[0] ;
            n457FasCod = T01V712_n457FasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            RcdFound85 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound85 = (short)(0) ;
      /* Using cursor T01V713 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01V713_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01V713_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V713_A252CliCod[0] > A252CliCod ) || ( T01V713_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01V713_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V713_A457FasCod[0], A457FasCod) > 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01V713_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01V713_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V713_A252CliCod[0] < A252CliCod ) || ( T01V713_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01V713_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V713_A457FasCod[0], A457FasCod) < 0 ) ) )
         {
            A396EmprCod = T01V713_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01V713_A252CliCod[0] ;
            n252CliCod = T01V713_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A457FasCod = T01V713_A457FasCod[0] ;
            n457FasCod = T01V713_n457FasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            RcdFound85 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1V785( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1V785( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound85 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A457FasCod = Z457FasCod ;
               n457FasCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
               update1V785( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1V785( ) ;
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
                  insert1V785( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A457FasCod = Z457FasCod ;
         n457FasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
      if ( RcdFound85 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFasPreMtr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1V785( ) ;
      if ( RcdFound85 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasPreMtr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1V785( ) ;
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
      if ( RcdFound85 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasPreMtr_Internalname ;
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
      if ( RcdFound85 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasPreMtr_Internalname ;
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
      scanStart1V785( ) ;
      if ( RcdFound85 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound85 != 0 )
         {
            scanNext1V785( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasPreMtr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1V785( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1V785( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01V72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPREFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z467FasPreMtr, T01V72_A467FasPreMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z466FasPreKgm, T01V72_A466FasPreKgm[0]) != 0 ) || ( GXutil.strcmp(Z470FasSumTin, T01V72_A470FasSumTin[0]) != 0 ) || ( GXutil.strcmp(Z3615FasFacCod, T01V72_A3615FasFacCod[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z4385FasPreFAc), GXutil.resetTime(T01V72_A4385FasPreFAc[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4386FasPreKAn, T01V72_A4386FasPreKAn[0]) != 0 ) || ( DecimalUtil.compareTo(Z4387FasPreMAn, T01V72_A4387FasPreMAn[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z4388FasPreFAn), GXutil.resetTime(T01V72_A4388FasPreFAn[0])) ) || ( Z10882FasPreU != T01V72_A10882FasPreU[0] ) || ( DecimalUtil.compareTo(Z12576FasPreMt2, T01V72_A12576FasPreMt2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12577FasPreKgF, T01V72_A12577FasPreKgF[0]) != 0 ) || ( DecimalUtil.compareTo(Z12704FasKgsMn, T01V72_A12704FasKgsMn[0]) != 0 ) || ( GXutil.strcmp(Z13587FasKgsEnt, T01V72_A13587FasKgsEnt[0]) != 0 ) || ( GXutil.strcmp(Z14258FasFactura, T01V72_A14258FasFactura[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z467FasPreMtr, T01V72_A467FasPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.preciofase_trn:[seudo value changed for attri]"+"FasPreMtr");
               GXutil.writeLogRaw("Old: ",Z467FasPreMtr);
               GXutil.writeLogRaw("Current: ",T01V72_A467FasPreMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z466FasPreKgm, T01V72_A466FasPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.preciofase_trn:[seudo value changed for attri]"+"FasPreKgm");
               GXutil.writeLogRaw("Old: ",Z466FasPreKgm);
               GXutil.writeLogRaw("Current: ",T01V72_A466FasPreKgm[0]);
            }
            if ( GXutil.strcmp(Z470FasSumTin, T01V72_A470FasSumTin[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.preciofase_trn:[seudo value changed for attri]"+"FasSumTin");
               GXutil.writeLogRaw("Old: ",Z470FasSumTin);
               GXutil.writeLogRaw("Current: ",T01V72_A470FasSumTin[0]);
            }
            if ( GXutil.strcmp(Z3615FasFacCod, T01V72_A3615FasFacCod[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.preciofase_trn:[seudo value changed for attri]"+"FasFacCod");
               GXutil.writeLogRaw("Old: ",Z3615FasFacCod);
               GXutil.writeLogRaw("Current: ",T01V72_A3615FasFacCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4385FasPreFAc), GXutil.resetTime(T01V72_A4385FasPreFAc[0])) ) )
            {
               GXutil.writeLogln("facturacion.preciofase_trn:[seudo value changed for attri]"+"FasPreFAc");
               GXutil.writeLogRaw("Old: ",Z4385FasPreFAc);
               GXutil.writeLogRaw("Current: ",T01V72_A4385FasPreFAc[0]);
            }
            if ( DecimalUtil.compareTo(Z4386FasPreKAn, T01V72_A4386FasPreKAn[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.preciofase_trn:[seudo value changed for attri]"+"FasPreKAn");
               GXutil.writeLogRaw("Old: ",Z4386FasPreKAn);
               GXutil.writeLogRaw("Current: ",T01V72_A4386FasPreKAn[0]);
            }
            if ( DecimalUtil.compareTo(Z4387FasPreMAn, T01V72_A4387FasPreMAn[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.preciofase_trn:[seudo value changed for attri]"+"FasPreMAn");
               GXutil.writeLogRaw("Old: ",Z4387FasPreMAn);
               GXutil.writeLogRaw("Current: ",T01V72_A4387FasPreMAn[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4388FasPreFAn), GXutil.resetTime(T01V72_A4388FasPreFAn[0])) ) )
            {
               GXutil.writeLogln("facturacion.preciofase_trn:[seudo value changed for attri]"+"FasPreFAn");
               GXutil.writeLogRaw("Old: ",Z4388FasPreFAn);
               GXutil.writeLogRaw("Current: ",T01V72_A4388FasPreFAn[0]);
            }
            if ( Z10882FasPreU != T01V72_A10882FasPreU[0] )
            {
               GXutil.writeLogln("facturacion.preciofase_trn:[seudo value changed for attri]"+"FasPreU");
               GXutil.writeLogRaw("Old: ",Z10882FasPreU);
               GXutil.writeLogRaw("Current: ",T01V72_A10882FasPreU[0]);
            }
            if ( DecimalUtil.compareTo(Z12576FasPreMt2, T01V72_A12576FasPreMt2[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.preciofase_trn:[seudo value changed for attri]"+"FasPreMt2");
               GXutil.writeLogRaw("Old: ",Z12576FasPreMt2);
               GXutil.writeLogRaw("Current: ",T01V72_A12576FasPreMt2[0]);
            }
            if ( GXutil.strcmp(Z12577FasPreKgF, T01V72_A12577FasPreKgF[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.preciofase_trn:[seudo value changed for attri]"+"FasPreKgF");
               GXutil.writeLogRaw("Old: ",Z12577FasPreKgF);
               GXutil.writeLogRaw("Current: ",T01V72_A12577FasPreKgF[0]);
            }
            if ( DecimalUtil.compareTo(Z12704FasKgsMn, T01V72_A12704FasKgsMn[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.preciofase_trn:[seudo value changed for attri]"+"FasKgsMn");
               GXutil.writeLogRaw("Old: ",Z12704FasKgsMn);
               GXutil.writeLogRaw("Current: ",T01V72_A12704FasKgsMn[0]);
            }
            if ( GXutil.strcmp(Z13587FasKgsEnt, T01V72_A13587FasKgsEnt[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.preciofase_trn:[seudo value changed for attri]"+"FasKgsEnt");
               GXutil.writeLogRaw("Old: ",Z13587FasKgsEnt);
               GXutil.writeLogRaw("Current: ",T01V72_A13587FasKgsEnt[0]);
            }
            if ( GXutil.strcmp(Z14258FasFactura, T01V72_A14258FasFactura[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.preciofase_trn:[seudo value changed for attri]"+"FasFactura");
               GXutil.writeLogRaw("Old: ",Z14258FasFactura);
               GXutil.writeLogRaw("Current: ",T01V72_A14258FasFactura[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPREFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1V785( )
   {
      beforeValidate1V785( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1V785( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1V785( 0) ;
         checkOptimisticConcurrency1V785( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1V785( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1V785( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01V714 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n467FasPreMtr), A467FasPreMtr, Boolean.valueOf(n466FasPreKgm), A466FasPreKgm, Boolean.valueOf(n470FasSumTin), A470FasSumTin, Boolean.valueOf(n3615FasFacCod), A3615FasFacCod, Boolean.valueOf(n4385FasPreFAc), A4385FasPreFAc, Boolean.valueOf(n4386FasPreKAn), A4386FasPreKAn, Boolean.valueOf(n4387FasPreMAn), A4387FasPreMAn, Boolean.valueOf(n4388FasPreFAn), A4388FasPreFAn, Boolean.valueOf(n10882FasPreU), Byte.valueOf(A10882FasPreU), Boolean.valueOf(n12576FasPreMt2), A12576FasPreMt2, Boolean.valueOf(n12577FasPreKgF), A12577FasPreKgF, Boolean.valueOf(n12704FasKgsMn), A12704FasKgsMn, Boolean.valueOf(n13587FasKgsEnt), A13587FasKgsEnt, A14258FasFactura, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        resetCaption1V70( ) ;
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
            load1V785( ) ;
         }
         endLevel1V785( ) ;
      }
      closeExtendedTableCursors1V785( ) ;
   }

   public void update1V785( )
   {
      beforeValidate1V785( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1V785( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1V785( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1V785( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1V785( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01V715 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n467FasPreMtr), A467FasPreMtr, Boolean.valueOf(n466FasPreKgm), A466FasPreKgm, Boolean.valueOf(n470FasSumTin), A470FasSumTin, Boolean.valueOf(n3615FasFacCod), A3615FasFacCod, Boolean.valueOf(n4385FasPreFAc), A4385FasPreFAc, Boolean.valueOf(n4386FasPreKAn), A4386FasPreKAn, Boolean.valueOf(n4387FasPreMAn), A4387FasPreMAn, Boolean.valueOf(n4388FasPreFAn), A4388FasPreFAn, Boolean.valueOf(n10882FasPreU), Byte.valueOf(A10882FasPreU), Boolean.valueOf(n12576FasPreMt2), A12576FasPreMt2, Boolean.valueOf(n12577FasPreKgF), A12577FasPreKgF, Boolean.valueOf(n12704FasKgsMn), A12704FasKgsMn, Boolean.valueOf(n13587FasKgsEnt), A13587FasKgsEnt, A14258FasFactura, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPREFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1V785( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1V70( ) ;
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
         endLevel1V785( ) ;
      }
      closeExtendedTableCursors1V785( ) ;
   }

   public void deferredUpdate1V785( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1V785( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1V785( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1V785( ) ;
         afterConfirm1V785( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1V785( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01V716 */
               pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound85 == 0 )
                     {
                        initAll1V785( ) ;
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
                     resetCaption1V70( ) ;
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
      sMode85 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1V785( ) ;
      Gx_mode = sMode85 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1V785( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01V717 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         A407EmprNom = T01V717_A407EmprNom[0] ;
         n407EmprNom = T01V717_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(15);
         /* Using cursor T01V718 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01V718_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(16);
         /* Using cursor T01V719 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         A460FasDsc = T01V719_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A4642FasDsc2 = T01V719_A4642FasDsc2[0] ;
         n4642FasDsc2 = T01V719_n4642FasDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", A4642FasDsc2);
         A7070FasSigla = T01V719_A7070FasSigla[0] ;
         n7070FasSigla = T01V719_n7070FasSigla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7070FasSigla", A7070FasSigla);
         pr_default.close(17);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01V720 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases Fac. x Cliente (Lin)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01V721 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TAB003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01V722 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTPFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01V723 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01V724 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASCLIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01V725 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIMTO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01V726 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIFS1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01V727 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIFSD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01V728 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cab Est Cliente-Fase(Servicios", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01V729 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cabezal de Formulac. por Fases", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01V730 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cabezal de parametro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01V731 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01V732 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01V733 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRETIT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
      }
   }

   public void endLevel1V785( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1V785( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.preciofase_trn");
         if ( AnyError == 0 )
         {
            confirmValues1V70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.preciofase_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1V785( )
   {
      /* Using cursor T01V734 */
      pr_default.execute(32);
      RcdFound85 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound85 = (short)(1) ;
         A396EmprCod = T01V734_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01V734_A252CliCod[0] ;
         n252CliCod = T01V734_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A457FasCod = T01V734_A457FasCod[0] ;
         n457FasCod = T01V734_n457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1V785( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound85 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound85 = (short)(1) ;
         A396EmprCod = T01V734_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01V734_A252CliCod[0] ;
         n252CliCod = T01V734_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A457FasCod = T01V734_A457FasCod[0] ;
         n457FasCod = T01V734_n457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
   }

   public void scanEnd1V785( )
   {
      pr_default.close(32);
   }

   public void afterConfirm1V785( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1V785( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1V785( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1V785( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1V785( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1V785( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1V785( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtFasDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc2_Enabled), 5, 0), true);
      edtFasPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMtr_Enabled), 5, 0), true);
      edtFasPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreKgm_Enabled), 5, 0), true);
      edtFasSumTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasSumTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasSumTin_Enabled), 5, 0), true);
      edtFasFacCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasFacCod_Enabled), 5, 0), true);
      edtFasPreFAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreFAc_Enabled), 5, 0), true);
      edtFasPreKAn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreKAn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreKAn_Enabled), 5, 0), true);
      edtFasPreMAn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMAn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMAn_Enabled), 5, 0), true);
      edtFasPreFAn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreFAn_Enabled), 5, 0), true);
      chkFasPreU.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreU.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasPreU.getEnabled(), 5, 0), true);
      edtFasPreMt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMt2_Enabled), 5, 0), true);
      chkFasPreKgF.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreKgF.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasPreKgF.getEnabled(), 5, 0), true);
      edtFasKgsMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasKgsMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasKgsMn_Enabled), 5, 0), true);
      chkFasKgsEnt.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasKgsEnt.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasKgsEnt.getEnabled(), 5, 0), true);
      edtFasSigla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasSigla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasSigla_Enabled), 5, 0), true);
      edtFasFactura_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasFactura_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasFactura_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1V785( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1V70( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.preciofase_trn", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z467FasPreMtr", GXutil.ltrim( localUtil.ntoc( Z467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z466FasPreKgm", GXutil.ltrim( localUtil.ntoc( Z466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z470FasSumTin", GXutil.rtrim( Z470FasSumTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3615FasFacCod", GXutil.rtrim( Z3615FasFacCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4385FasPreFAc", localUtil.dtoc( Z4385FasPreFAc, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4386FasPreKAn", GXutil.ltrim( localUtil.ntoc( Z4386FasPreKAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4387FasPreMAn", GXutil.ltrim( localUtil.ntoc( Z4387FasPreMAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4388FasPreFAn", localUtil.dtoc( Z4388FasPreFAn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10882FasPreU", GXutil.ltrim( localUtil.ntoc( Z10882FasPreU, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12576FasPreMt2", GXutil.ltrim( localUtil.ntoc( Z12576FasPreMt2, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12577FasPreKgF", GXutil.rtrim( Z12577FasPreKgF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12704FasKgsMn", GXutil.ltrim( localUtil.ntoc( Z12704FasKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13587FasKgsEnt", GXutil.rtrim( Z13587FasKgsEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14258FasFactura", GXutil.rtrim( Z14258FasFactura));
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
      return formatLink("app.facturacion.preciofase_trn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.PrecioFase_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Precio Fase ", "") ;
   }

   public void initializeNonKey1V785( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A4642FasDsc2 = "" ;
      n4642FasDsc2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", A4642FasDsc2);
      A467FasPreMtr = DecimalUtil.ZERO ;
      n467FasPreMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrimstr( A467FasPreMtr, 13, 5));
      A466FasPreKgm = DecimalUtil.ZERO ;
      n466FasPreKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrimstr( A466FasPreKgm, 13, 5));
      A470FasSumTin = "" ;
      n470FasSumTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A470FasSumTin", A470FasSumTin);
      A3615FasFacCod = "" ;
      n3615FasFacCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3615FasFacCod", A3615FasFacCod);
      A4385FasPreFAc = GXutil.nullDate() ;
      n4385FasPreFAc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4385FasPreFAc", localUtil.format(A4385FasPreFAc, "99/99/99"));
      A4386FasPreKAn = DecimalUtil.ZERO ;
      n4386FasPreKAn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4386FasPreKAn", GXutil.ltrimstr( A4386FasPreKAn, 13, 5));
      A4387FasPreMAn = DecimalUtil.ZERO ;
      n4387FasPreMAn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4387FasPreMAn", GXutil.ltrimstr( A4387FasPreMAn, 13, 5));
      A4388FasPreFAn = GXutil.nullDate() ;
      n4388FasPreFAn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4388FasPreFAn", localUtil.format(A4388FasPreFAn, "99/99/99"));
      A10882FasPreU = (byte)(0) ;
      n10882FasPreU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10882FasPreU", GXutil.str( A10882FasPreU, 1, 0));
      A12576FasPreMt2 = DecimalUtil.ZERO ;
      n12576FasPreMt2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12576FasPreMt2", GXutil.ltrimstr( A12576FasPreMt2, 13, 5));
      A12577FasPreKgF = "" ;
      n12577FasPreKgF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12577FasPreKgF", A12577FasPreKgF);
      A12704FasKgsMn = DecimalUtil.ZERO ;
      n12704FasKgsMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12704FasKgsMn", GXutil.ltrimstr( A12704FasKgsMn, 9, 2));
      A13587FasKgsEnt = "" ;
      n13587FasKgsEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13587FasKgsEnt", A13587FasKgsEnt);
      A7070FasSigla = "" ;
      n7070FasSigla = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7070FasSigla", A7070FasSigla);
      A14258FasFactura = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14258FasFactura", A14258FasFactura);
      Z467FasPreMtr = DecimalUtil.ZERO ;
      Z466FasPreKgm = DecimalUtil.ZERO ;
      Z470FasSumTin = "" ;
      Z3615FasFacCod = "" ;
      Z4385FasPreFAc = GXutil.nullDate() ;
      Z4386FasPreKAn = DecimalUtil.ZERO ;
      Z4387FasPreMAn = DecimalUtil.ZERO ;
      Z4388FasPreFAn = GXutil.nullDate() ;
      Z10882FasPreU = (byte)(0) ;
      Z12576FasPreMt2 = DecimalUtil.ZERO ;
      Z12577FasPreKgF = "" ;
      Z12704FasKgsMn = DecimalUtil.ZERO ;
      Z13587FasKgsEnt = "" ;
      Z14258FasFactura = "" ;
   }

   public void initAll1V785( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A457FasCod = "" ;
      n457FasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      initializeNonKey1V785( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415124483", true, true);
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
      httpContext.AddJavascriptSource("facturacion/preciofase_trn.js", "?202682415124483", false, true);
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
      edtCliNom_Internalname = "CLINOM" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtFasDsc2_Internalname = "FASDSC2" ;
      edtFasPreMtr_Internalname = "FASPREMTR" ;
      edtFasPreKgm_Internalname = "FASPREKGM" ;
      edtFasSumTin_Internalname = "FASSUMTIN" ;
      edtFasFacCod_Internalname = "FASFACCOD" ;
      edtFasPreFAc_Internalname = "FASPREFAC" ;
      edtFasPreKAn_Internalname = "FASPREKAN" ;
      edtFasPreMAn_Internalname = "FASPREMAN" ;
      edtFasPreFAn_Internalname = "FASPREFAN" ;
      chkFasPreU.setInternalname( "FASPREU" );
      edtFasPreMt2_Internalname = "FASPREMT2" ;
      chkFasPreKgF.setInternalname( "FASPREKGF" );
      edtFasKgsMn_Internalname = "FASKGSMN" ;
      chkFasKgsEnt.setInternalname( "FASKGSENT" );
      edtFasSigla_Internalname = "FASSIGLA" ;
      edtFasFactura_Internalname = "FASFACTURA" ;
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
      Form.setCaption( httpContext.getMessage( "Precio Fase ", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtFasFactura_Jsonclick = "" ;
      edtFasFactura_Enabled = 1 ;
      edtFasSigla_Jsonclick = "" ;
      edtFasSigla_Enabled = 0 ;
      chkFasKgsEnt.setEnabled( 1 );
      edtFasKgsMn_Jsonclick = "" ;
      edtFasKgsMn_Enabled = 1 ;
      chkFasPreKgF.setEnabled( 1 );
      edtFasPreMt2_Jsonclick = "" ;
      edtFasPreMt2_Enabled = 1 ;
      chkFasPreU.setEnabled( 1 );
      edtFasPreFAn_Jsonclick = "" ;
      edtFasPreFAn_Enabled = 1 ;
      edtFasPreMAn_Jsonclick = "" ;
      edtFasPreMAn_Enabled = 1 ;
      edtFasPreKAn_Jsonclick = "" ;
      edtFasPreKAn_Enabled = 1 ;
      edtFasPreFAc_Jsonclick = "" ;
      edtFasPreFAc_Enabled = 1 ;
      edtFasFacCod_Jsonclick = "" ;
      edtFasFacCod_Enabled = 1 ;
      edtFasSumTin_Jsonclick = "" ;
      edtFasSumTin_Enabled = 1 ;
      edtFasPreKgm_Jsonclick = "" ;
      edtFasPreKgm_Enabled = 1 ;
      edtFasPreMtr_Jsonclick = "" ;
      edtFasPreMtr_Enabled = 1 ;
      edtFasDsc2_Jsonclick = "" ;
      edtFasDsc2_Enabled = 0 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
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
      chkFasPreU.setName( "FASPREU" );
      chkFasPreU.setWebtags( "" );
      chkFasPreU.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreU.getInternalname(), "TitleCaption", chkFasPreU.getCaption(), true);
      chkFasPreU.setCheckedValue( "0" );
      A10882FasPreU = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10882FasPreU, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10882FasPreU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10882FasPreU", GXutil.str( A10882FasPreU, 1, 0));
      chkFasPreKgF.setName( "FASPREKGF" );
      chkFasPreKgF.setWebtags( "" );
      chkFasPreKgF.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreKgF.getInternalname(), "TitleCaption", chkFasPreKgF.getCaption(), true);
      chkFasPreKgF.setCheckedValue( "N" );
      A12577FasPreKgF = ((GXutil.strcmp(GXutil.rtrim( A12577FasPreKgF), "S")==0) ? "S" : "N") ;
      n12577FasPreKgF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12577FasPreKgF", A12577FasPreKgF);
      chkFasKgsEnt.setName( "FASKGSENT" );
      chkFasKgsEnt.setWebtags( "" );
      chkFasKgsEnt.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasKgsEnt.getInternalname(), "TitleCaption", chkFasKgsEnt.getCaption(), true);
      chkFasKgsEnt.setCheckedValue( "N" );
      A13587FasKgsEnt = ((GXutil.strcmp(GXutil.rtrim( A13587FasKgsEnt), "S")==0) ? "S" : "N") ;
      n13587FasKgsEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13587FasKgsEnt", A13587FasKgsEnt);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01V717 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01V717_A407EmprNom[0] ;
      n407EmprNom = T01V717_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(15);
      /* Using cursor T01V718 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01V718_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(16);
      /* Using cursor T01V719 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01V719_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A4642FasDsc2 = T01V719_A4642FasDsc2[0] ;
      n4642FasDsc2 = T01V719_n4642FasDsc2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", A4642FasDsc2);
      A7070FasSigla = T01V719_A7070FasSigla[0] ;
      n7070FasSigla = T01V719_n7070FasSigla[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7070FasSigla", A7070FasSigla);
      pr_default.close(17);
      GX_FocusControl = edtFasPreMtr_Internalname ;
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
      /* Using cursor T01V717 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01V717_A407EmprNom[0] ;
      n407EmprNom = T01V717_n407EmprNom[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T01V718 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01V718_A279CliNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Fascod( )
   {
      n252CliCod = false ;
      n457FasCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01V719 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A460FasDsc = T01V719_A460FasDsc[0] ;
      A4642FasDsc2 = T01V719_A4642FasDsc2[0] ;
      n4642FasDsc2 = T01V719_n4642FasDsc2[0] ;
      A7070FasSigla = T01V719_A7070FasSigla[0] ;
      n7070FasSigla = T01V719_n7070FasSigla[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      A10882FasPreU = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10882FasPreU, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10882FasPreU = false ;
      A12577FasPreKgF = ((GXutil.strcmp(GXutil.rtrim( A12577FasPreKgF), "S")==0) ? "S" : "N") ;
      n12577FasPreKgF = false ;
      A13587FasKgsEnt = ((GXutil.strcmp(GXutil.rtrim( A13587FasKgsEnt), "S")==0) ? "S" : "N") ;
      n13587FasKgsEnt = false ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A470FasSumTin", GXutil.rtrim( A470FasSumTin));
      httpContext.ajax_rsp_assign_attri("", false, "A3615FasFacCod", GXutil.rtrim( A3615FasFacCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4385FasPreFAc", localUtil.format(A4385FasPreFAc, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4386FasPreKAn", GXutil.ltrim( localUtil.ntoc( A4386FasPreKAn, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4387FasPreMAn", GXutil.ltrim( localUtil.ntoc( A4387FasPreMAn, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4388FasPreFAn", localUtil.format(A4388FasPreFAn, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10882FasPreU", GXutil.ltrim( localUtil.ntoc( A10882FasPreU, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12576FasPreMt2", GXutil.ltrim( localUtil.ntoc( A12576FasPreMt2, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12577FasPreKgF", GXutil.rtrim( A12577FasPreKgF));
      httpContext.ajax_rsp_assign_attri("", false, "A12704FasKgsMn", GXutil.ltrim( localUtil.ntoc( A12704FasKgsMn, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13587FasKgsEnt", GXutil.rtrim( A13587FasKgsEnt));
      httpContext.ajax_rsp_assign_attri("", false, "A14258FasFactura", GXutil.rtrim( A14258FasFactura));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", GXutil.rtrim( A4642FasDsc2));
      httpContext.ajax_rsp_assign_attri("", false, "A7070FasSigla", GXutil.rtrim( A7070FasSigla));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z467FasPreMtr", GXutil.ltrim( localUtil.ntoc( Z467FasPreMtr, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z466FasPreKgm", GXutil.ltrim( localUtil.ntoc( Z466FasPreKgm, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z470FasSumTin", GXutil.rtrim( Z470FasSumTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3615FasFacCod", GXutil.rtrim( Z3615FasFacCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4385FasPreFAc", localUtil.format(Z4385FasPreFAc, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4386FasPreKAn", GXutil.ltrim( localUtil.ntoc( Z4386FasPreKAn, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4387FasPreMAn", GXutil.ltrim( localUtil.ntoc( Z4387FasPreMAn, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4388FasPreFAn", localUtil.format(Z4388FasPreFAn, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10882FasPreU", GXutil.ltrim( localUtil.ntoc( Z10882FasPreU, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12576FasPreMt2", GXutil.ltrim( localUtil.ntoc( Z12576FasPreMt2, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12577FasPreKgF", GXutil.rtrim( Z12577FasPreKgF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12704FasKgsMn", GXutil.ltrim( localUtil.ntoc( Z12704FasKgsMn, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13587FasKgsEnt", GXutil.rtrim( Z13587FasKgsEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14258FasFactura", GXutil.rtrim( Z14258FasFactura));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4642FasDsc2", GXutil.rtrim( Z4642FasDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7070FasSigla", GXutil.rtrim( Z7070FasSigla));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A10882FasPreU',fld:'FASPREU',pic:'9'},{av:'A12577FasPreKgF',fld:'FASPREKGF',pic:''},{av:'A13587FasKgsEnt',fld:'FASKGSENT',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A10882FasPreU',fld:'FASPREU',pic:'9'},{av:'A12577FasPreKgF',fld:'FASPREKGF',pic:''},{av:'A13587FasKgsEnt',fld:'FASKGSENT',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A10882FasPreU',fld:'FASPREU',pic:'9'},{av:'A12577FasPreKgF',fld:'FASPREKGF',pic:''},{av:'A13587FasKgsEnt',fld:'FASKGSENT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A10882FasPreU',fld:'FASPREU',pic:'9'},{av:'A12577FasPreKgF',fld:'FASPREKGF',pic:''},{av:'A13587FasKgsEnt',fld:'FASKGSENT',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10882FasPreU',fld:'FASPREU',pic:'9'},{av:'A12577FasPreKgF',fld:'FASPREKGF',pic:''},{av:'A13587FasKgsEnt',fld:'FASKGSENT',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10882FasPreU',fld:'FASPREU',pic:'9'},{av:'A12577FasPreKgF',fld:'FASPREKGF',pic:''},{av:'A13587FasKgsEnt',fld:'FASKGSENT',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10882FasPreU',fld:'FASPREU',pic:'9'},{av:'A12577FasPreKgF',fld:'FASPREKGF',pic:''},{av:'A13587FasKgsEnt',fld:'FASKGSENT',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10882FasPreU',fld:'FASPREU',pic:'9'},{av:'A12577FasPreKgF',fld:'FASPREKGF',pic:''},{av:'A13587FasKgsEnt',fld:'FASKGSENT',pic:''}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A10882FasPreU',fld:'FASPREU',pic:'9'},{av:'A12577FasPreKgF',fld:'FASPREKGF',pic:''},{av:'A13587FasKgsEnt',fld:'FASKGSENT',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A467FasPreMtr',fld:'FASPREMTR',pic:'ZZZZZZ9.999'},{av:'A466FasPreKgm',fld:'FASPREKGM',pic:'ZZZZZZ9.999'},{av:'A470FasSumTin',fld:'FASSUMTIN',pic:'@!'},{av:'A3615FasFacCod',fld:'FASFACCOD',pic:''},{av:'A4385FasPreFAc',fld:'FASPREFAC',pic:''},{av:'A4386FasPreKAn',fld:'FASPREKAN',pic:'ZZZZZZ9.99999'},{av:'A4387FasPreMAn',fld:'FASPREMAN',pic:'ZZZZZZ9.99999'},{av:'A4388FasPreFAn',fld:'FASPREFAN',pic:''},{av:'A12576FasPreMt2',fld:'FASPREMT2',pic:'ZZZZZZ9.99999'},{av:'A12704FasKgsMn',fld:'FASKGSMN',pic:'ZZZZZ9.99'},{av:'A14258FasFactura',fld:'FASFACTURA',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4642FasDsc2',fld:'FASDSC2',pic:''},{av:'A7070FasSigla',fld:'FASSIGLA',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z457FasCod'},{av:'Z467FasPreMtr'},{av:'Z466FasPreKgm'},{av:'Z470FasSumTin'},{av:'Z3615FasFacCod'},{av:'Z4385FasPreFAc'},{av:'Z4386FasPreKAn'},{av:'Z4387FasPreMAn'},{av:'Z4388FasPreFAn'},{av:'Z10882FasPreU'},{av:'Z12576FasPreMt2'},{av:'Z12577FasPreKgF'},{av:'Z12704FasKgsMn'},{av:'Z13587FasKgsEnt'},{av:'Z14258FasFactura'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z460FasDsc'},{av:'Z4642FasDsc2'},{av:'Z7070FasSigla'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{av:'A10882FasPreU',fld:'FASPREU',pic:'9'},{av:'A12577FasPreKgF',fld:'FASPREKGF',pic:''},{av:'A13587FasKgsEnt',fld:'FASKGSENT',pic:''}]}");
      setEventMetadata("VALID_FASSUMTIN","{handler:'valid_Fassumtin',iparms:[{av:'A10882FasPreU',fld:'FASPREU',pic:'9'},{av:'A12577FasPreKgF',fld:'FASPREKGF',pic:''},{av:'A13587FasKgsEnt',fld:'FASKGSENT',pic:''}]");
      setEventMetadata("VALID_FASSUMTIN",",oparms:[{av:'A10882FasPreU',fld:'FASPREU',pic:'9'},{av:'A12577FasPreKgF',fld:'FASPREKGF',pic:''},{av:'A13587FasKgsEnt',fld:'FASKGSENT',pic:''}]}");
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
      pr_default.close(16);
      pr_default.close(15);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z457FasCod = "" ;
      Z467FasPreMtr = DecimalUtil.ZERO ;
      Z466FasPreKgm = DecimalUtil.ZERO ;
      Z470FasSumTin = "" ;
      Z3615FasFacCod = "" ;
      Z4385FasPreFAc = GXutil.nullDate() ;
      Z4386FasPreKAn = DecimalUtil.ZERO ;
      Z4387FasPreMAn = DecimalUtil.ZERO ;
      Z4388FasPreFAn = GXutil.nullDate() ;
      Z12576FasPreMt2 = DecimalUtil.ZERO ;
      Z12577FasPreKgF = "" ;
      Z12704FasKgsMn = DecimalUtil.ZERO ;
      Z13587FasKgsEnt = "" ;
      Z14258FasFactura = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A12577FasPreKgF = "" ;
      A13587FasKgsEnt = "" ;
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
      A407EmprNom = "" ;
      A460FasDsc = "" ;
      A4642FasDsc2 = "" ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A470FasSumTin = "" ;
      A3615FasFacCod = "" ;
      A4385FasPreFAc = GXutil.nullDate() ;
      A4386FasPreKAn = DecimalUtil.ZERO ;
      A4387FasPreMAn = DecimalUtil.ZERO ;
      A4388FasPreFAn = GXutil.nullDate() ;
      A12576FasPreMt2 = DecimalUtil.ZERO ;
      A12704FasKgsMn = DecimalUtil.ZERO ;
      A7070FasSigla = "" ;
      A14258FasFactura = "" ;
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
      Z460FasDsc = "" ;
      Z4642FasDsc2 = "" ;
      Z7070FasSigla = "" ;
      T01V77_A279CliNom = new String[] {""} ;
      T01V77_A407EmprNom = new String[] {""} ;
      T01V77_n407EmprNom = new boolean[] {false} ;
      T01V77_A460FasDsc = new String[] {""} ;
      T01V77_A4642FasDsc2 = new String[] {""} ;
      T01V77_n4642FasDsc2 = new boolean[] {false} ;
      T01V77_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V77_n467FasPreMtr = new boolean[] {false} ;
      T01V77_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V77_n466FasPreKgm = new boolean[] {false} ;
      T01V77_A470FasSumTin = new String[] {""} ;
      T01V77_n470FasSumTin = new boolean[] {false} ;
      T01V77_A3615FasFacCod = new String[] {""} ;
      T01V77_n3615FasFacCod = new boolean[] {false} ;
      T01V77_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      T01V77_n4385FasPreFAc = new boolean[] {false} ;
      T01V77_A4386FasPreKAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V77_n4386FasPreKAn = new boolean[] {false} ;
      T01V77_A4387FasPreMAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V77_n4387FasPreMAn = new boolean[] {false} ;
      T01V77_A4388FasPreFAn = new java.util.Date[] {GXutil.nullDate()} ;
      T01V77_n4388FasPreFAn = new boolean[] {false} ;
      T01V77_A10882FasPreU = new byte[1] ;
      T01V77_n10882FasPreU = new boolean[] {false} ;
      T01V77_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V77_n12576FasPreMt2 = new boolean[] {false} ;
      T01V77_A12577FasPreKgF = new String[] {""} ;
      T01V77_n12577FasPreKgF = new boolean[] {false} ;
      T01V77_A12704FasKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V77_n12704FasKgsMn = new boolean[] {false} ;
      T01V77_A13587FasKgsEnt = new String[] {""} ;
      T01V77_n13587FasKgsEnt = new boolean[] {false} ;
      T01V77_A7070FasSigla = new String[] {""} ;
      T01V77_n7070FasSigla = new boolean[] {false} ;
      T01V77_A14258FasFactura = new String[] {""} ;
      T01V77_A396EmprCod = new String[] {""} ;
      T01V77_A252CliCod = new int[1] ;
      T01V77_n252CliCod = new boolean[] {false} ;
      T01V77_A457FasCod = new String[] {""} ;
      T01V77_n457FasCod = new boolean[] {false} ;
      T01V74_A407EmprNom = new String[] {""} ;
      T01V74_n407EmprNom = new boolean[] {false} ;
      T01V75_A279CliNom = new String[] {""} ;
      T01V76_A460FasDsc = new String[] {""} ;
      T01V76_A4642FasDsc2 = new String[] {""} ;
      T01V76_n4642FasDsc2 = new boolean[] {false} ;
      T01V76_A7070FasSigla = new String[] {""} ;
      T01V76_n7070FasSigla = new boolean[] {false} ;
      T01V78_A407EmprNom = new String[] {""} ;
      T01V78_n407EmprNom = new boolean[] {false} ;
      T01V79_A279CliNom = new String[] {""} ;
      T01V710_A460FasDsc = new String[] {""} ;
      T01V710_A4642FasDsc2 = new String[] {""} ;
      T01V710_n4642FasDsc2 = new boolean[] {false} ;
      T01V710_A7070FasSigla = new String[] {""} ;
      T01V710_n7070FasSigla = new boolean[] {false} ;
      T01V711_A396EmprCod = new String[] {""} ;
      T01V711_A252CliCod = new int[1] ;
      T01V711_n252CliCod = new boolean[] {false} ;
      T01V711_A457FasCod = new String[] {""} ;
      T01V711_n457FasCod = new boolean[] {false} ;
      T01V73_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V73_n467FasPreMtr = new boolean[] {false} ;
      T01V73_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V73_n466FasPreKgm = new boolean[] {false} ;
      T01V73_A470FasSumTin = new String[] {""} ;
      T01V73_n470FasSumTin = new boolean[] {false} ;
      T01V73_A3615FasFacCod = new String[] {""} ;
      T01V73_n3615FasFacCod = new boolean[] {false} ;
      T01V73_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      T01V73_n4385FasPreFAc = new boolean[] {false} ;
      T01V73_A4386FasPreKAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V73_n4386FasPreKAn = new boolean[] {false} ;
      T01V73_A4387FasPreMAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V73_n4387FasPreMAn = new boolean[] {false} ;
      T01V73_A4388FasPreFAn = new java.util.Date[] {GXutil.nullDate()} ;
      T01V73_n4388FasPreFAn = new boolean[] {false} ;
      T01V73_A10882FasPreU = new byte[1] ;
      T01V73_n10882FasPreU = new boolean[] {false} ;
      T01V73_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V73_n12576FasPreMt2 = new boolean[] {false} ;
      T01V73_A12577FasPreKgF = new String[] {""} ;
      T01V73_n12577FasPreKgF = new boolean[] {false} ;
      T01V73_A12704FasKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V73_n12704FasKgsMn = new boolean[] {false} ;
      T01V73_A13587FasKgsEnt = new String[] {""} ;
      T01V73_n13587FasKgsEnt = new boolean[] {false} ;
      T01V73_A14258FasFactura = new String[] {""} ;
      T01V73_A396EmprCod = new String[] {""} ;
      T01V73_A252CliCod = new int[1] ;
      T01V73_n252CliCod = new boolean[] {false} ;
      T01V73_A457FasCod = new String[] {""} ;
      T01V73_n457FasCod = new boolean[] {false} ;
      sMode85 = "" ;
      T01V712_A396EmprCod = new String[] {""} ;
      T01V712_A252CliCod = new int[1] ;
      T01V712_n252CliCod = new boolean[] {false} ;
      T01V712_A457FasCod = new String[] {""} ;
      T01V712_n457FasCod = new boolean[] {false} ;
      T01V713_A396EmprCod = new String[] {""} ;
      T01V713_A252CliCod = new int[1] ;
      T01V713_n252CliCod = new boolean[] {false} ;
      T01V713_A457FasCod = new String[] {""} ;
      T01V713_n457FasCod = new boolean[] {false} ;
      T01V72_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V72_n467FasPreMtr = new boolean[] {false} ;
      T01V72_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V72_n466FasPreKgm = new boolean[] {false} ;
      T01V72_A470FasSumTin = new String[] {""} ;
      T01V72_n470FasSumTin = new boolean[] {false} ;
      T01V72_A3615FasFacCod = new String[] {""} ;
      T01V72_n3615FasFacCod = new boolean[] {false} ;
      T01V72_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      T01V72_n4385FasPreFAc = new boolean[] {false} ;
      T01V72_A4386FasPreKAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V72_n4386FasPreKAn = new boolean[] {false} ;
      T01V72_A4387FasPreMAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V72_n4387FasPreMAn = new boolean[] {false} ;
      T01V72_A4388FasPreFAn = new java.util.Date[] {GXutil.nullDate()} ;
      T01V72_n4388FasPreFAn = new boolean[] {false} ;
      T01V72_A10882FasPreU = new byte[1] ;
      T01V72_n10882FasPreU = new boolean[] {false} ;
      T01V72_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V72_n12576FasPreMt2 = new boolean[] {false} ;
      T01V72_A12577FasPreKgF = new String[] {""} ;
      T01V72_n12577FasPreKgF = new boolean[] {false} ;
      T01V72_A12704FasKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V72_n12704FasKgsMn = new boolean[] {false} ;
      T01V72_A13587FasKgsEnt = new String[] {""} ;
      T01V72_n13587FasKgsEnt = new boolean[] {false} ;
      T01V72_A14258FasFactura = new String[] {""} ;
      T01V72_A396EmprCod = new String[] {""} ;
      T01V72_A252CliCod = new int[1] ;
      T01V72_n252CliCod = new boolean[] {false} ;
      T01V72_A457FasCod = new String[] {""} ;
      T01V72_n457FasCod = new boolean[] {false} ;
      T01V717_A407EmprNom = new String[] {""} ;
      T01V717_n407EmprNom = new boolean[] {false} ;
      T01V718_A279CliNom = new String[] {""} ;
      T01V719_A460FasDsc = new String[] {""} ;
      T01V719_A4642FasDsc2 = new String[] {""} ;
      T01V719_n4642FasDsc2 = new boolean[] {false} ;
      T01V719_A7070FasSigla = new String[] {""} ;
      T01V719_n7070FasSigla = new boolean[] {false} ;
      T01V720_A396EmprCod = new String[] {""} ;
      T01V720_A252CliCod = new int[1] ;
      T01V720_n252CliCod = new boolean[] {false} ;
      T01V720_A4589FFProCod = new String[] {""} ;
      T01V720_A4591FFFasCod = new String[] {""} ;
      T01V721_A396EmprCod = new String[] {""} ;
      T01V721_A252CliCod = new int[1] ;
      T01V721_n252CliCod = new boolean[] {false} ;
      T01V721_A494ForSer = new String[] {""} ;
      T01V721_A482ForColNom = new String[] {""} ;
      T01V721_A483ForColNum = new int[1] ;
      T01V721_A831TipColCod = new byte[1] ;
      T01V721_A853For_ProC = new String[] {""} ;
      T01V721_A1028For_Ord = new int[1] ;
      T01V722_A396EmprCod = new String[] {""} ;
      T01V722_A252CliCod = new int[1] ;
      T01V722_n252CliCod = new boolean[] {false} ;
      T01V722_A457FasCod = new String[] {""} ;
      T01V722_n457FasCod = new boolean[] {false} ;
      T01V722_A7727ArtAdiCod = new short[1] ;
      T01V723_A396EmprCod = new String[] {""} ;
      T01V723_A252CliCod = new int[1] ;
      T01V723_n252CliCod = new boolean[] {false} ;
      T01V723_A65ArtCod = new String[] {""} ;
      T01V723_A7135Lin_fast = new short[1] ;
      T01V724_A396EmprCod = new String[] {""} ;
      T01V724_A252CliCod = new int[1] ;
      T01V724_n252CliCod = new boolean[] {false} ;
      T01V724_A6016FasExpLin = new short[1] ;
      T01V725_A396EmprCod = new String[] {""} ;
      T01V725_A966PartCod = new String[] {""} ;
      T01V725_A252CliCod = new int[1] ;
      T01V725_n252CliCod = new boolean[] {false} ;
      T01V725_A5849UbiLin = new short[1] ;
      T01V726_A396EmprCod = new String[] {""} ;
      T01V726_A252CliCod = new int[1] ;
      T01V726_n252CliCod = new boolean[] {false} ;
      T01V726_A457FasCod = new String[] {""} ;
      T01V726_n457FasCod = new boolean[] {false} ;
      T01V726_A5515ClifsiLin = new short[1] ;
      T01V727_A396EmprCod = new String[] {""} ;
      T01V727_A252CliCod = new int[1] ;
      T01V727_n252CliCod = new boolean[] {false} ;
      T01V727_A457FasCod = new String[] {""} ;
      T01V727_n457FasCod = new boolean[] {false} ;
      T01V727_A5519ClifsdLin = new short[1] ;
      T01V728_A396EmprCod = new String[] {""} ;
      T01V728_A252CliCod = new int[1] ;
      T01V728_n252CliCod = new boolean[] {false} ;
      T01V728_A457FasCod = new String[] {""} ;
      T01V728_n457FasCod = new boolean[] {false} ;
      T01V728_A5310ClFsAny = new short[1] ;
      T01V728_A5311ClFsSer = new String[] {""} ;
      T01V729_A396EmprCod = new String[] {""} ;
      T01V729_A252CliCod = new int[1] ;
      T01V729_n252CliCod = new boolean[] {false} ;
      T01V729_A65ArtCod = new String[] {""} ;
      T01V729_A4658MdlCod = new String[] {""} ;
      T01V729_A457FasCod = new String[] {""} ;
      T01V729_n457FasCod = new boolean[] {false} ;
      T01V730_A396EmprCod = new String[] {""} ;
      T01V730_A252CliCod = new int[1] ;
      T01V730_n252CliCod = new boolean[] {false} ;
      T01V730_A65ArtCod = new String[] {""} ;
      T01V730_A758ProCod = new String[] {""} ;
      T01V730_A457FasCod = new String[] {""} ;
      T01V730_n457FasCod = new boolean[] {false} ;
      T01V731_A396EmprCod = new String[] {""} ;
      T01V731_A2333ExtPdoAlb = new int[1] ;
      T01V731_A2790ExtPdoLin = new short[1] ;
      T01V732_A396EmprCod = new String[] {""} ;
      T01V732_A252CliCod = new int[1] ;
      T01V732_n252CliCod = new boolean[] {false} ;
      T01V732_A457FasCod = new String[] {""} ;
      T01V732_n457FasCod = new boolean[] {false} ;
      T01V732_A2740PreExtSer = new String[] {""} ;
      T01V732_A2427PreExtNMtr = new String[] {""} ;
      T01V733_A396EmprCod = new String[] {""} ;
      T01V733_A2730RecTipCo = new short[1] ;
      T01V733_A252CliCod = new int[1] ;
      T01V733_n252CliCod = new boolean[] {false} ;
      T01V733_A2736RecLin2 = new short[1] ;
      T01V734_A396EmprCod = new String[] {""} ;
      T01V734_A252CliCod = new int[1] ;
      T01V734_n252CliCod = new boolean[] {false} ;
      T01V734_A457FasCod = new String[] {""} ;
      T01V734_n457FasCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ457FasCod = "" ;
      ZZ467FasPreMtr = DecimalUtil.ZERO ;
      ZZ466FasPreKgm = DecimalUtil.ZERO ;
      ZZ470FasSumTin = "" ;
      ZZ3615FasFacCod = "" ;
      ZZ4385FasPreFAc = GXutil.nullDate() ;
      ZZ4386FasPreKAn = DecimalUtil.ZERO ;
      ZZ4387FasPreMAn = DecimalUtil.ZERO ;
      ZZ4388FasPreFAn = GXutil.nullDate() ;
      ZZ12576FasPreMt2 = DecimalUtil.ZERO ;
      ZZ12577FasPreKgF = "" ;
      ZZ12704FasKgsMn = DecimalUtil.ZERO ;
      ZZ13587FasKgsEnt = "" ;
      ZZ14258FasFactura = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ460FasDsc = "" ;
      ZZ4642FasDsc2 = "" ;
      ZZ7070FasSigla = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.preciofase_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.preciofase_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.preciofase_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.preciofase_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.preciofase_trn__default(),
         new Object[] {
             new Object[] {
            T01V72_A467FasPreMtr, T01V72_n467FasPreMtr, T01V72_A466FasPreKgm, T01V72_n466FasPreKgm, T01V72_A470FasSumTin, T01V72_n470FasSumTin, T01V72_A3615FasFacCod, T01V72_n3615FasFacCod, T01V72_A4385FasPreFAc, T01V72_n4385FasPreFAc,
            T01V72_A4386FasPreKAn, T01V72_n4386FasPreKAn, T01V72_A4387FasPreMAn, T01V72_n4387FasPreMAn, T01V72_A4388FasPreFAn, T01V72_n4388FasPreFAn, T01V72_A10882FasPreU, T01V72_n10882FasPreU, T01V72_A12576FasPreMt2, T01V72_n12576FasPreMt2,
            T01V72_A12577FasPreKgF, T01V72_n12577FasPreKgF, T01V72_A12704FasKgsMn, T01V72_n12704FasKgsMn, T01V72_A13587FasKgsEnt, T01V72_n13587FasKgsEnt, T01V72_A14258FasFactura, T01V72_A396EmprCod, T01V72_A252CliCod, T01V72_A457FasCod
            }
            , new Object[] {
            T01V73_A467FasPreMtr, T01V73_n467FasPreMtr, T01V73_A466FasPreKgm, T01V73_n466FasPreKgm, T01V73_A470FasSumTin, T01V73_n470FasSumTin, T01V73_A3615FasFacCod, T01V73_n3615FasFacCod, T01V73_A4385FasPreFAc, T01V73_n4385FasPreFAc,
            T01V73_A4386FasPreKAn, T01V73_n4386FasPreKAn, T01V73_A4387FasPreMAn, T01V73_n4387FasPreMAn, T01V73_A4388FasPreFAn, T01V73_n4388FasPreFAn, T01V73_A10882FasPreU, T01V73_n10882FasPreU, T01V73_A12576FasPreMt2, T01V73_n12576FasPreMt2,
            T01V73_A12577FasPreKgF, T01V73_n12577FasPreKgF, T01V73_A12704FasKgsMn, T01V73_n12704FasKgsMn, T01V73_A13587FasKgsEnt, T01V73_n13587FasKgsEnt, T01V73_A14258FasFactura, T01V73_A396EmprCod, T01V73_A252CliCod, T01V73_A457FasCod
            }
            , new Object[] {
            T01V74_A407EmprNom, T01V74_n407EmprNom
            }
            , new Object[] {
            T01V75_A279CliNom
            }
            , new Object[] {
            T01V76_A460FasDsc, T01V76_A4642FasDsc2, T01V76_n4642FasDsc2, T01V76_A7070FasSigla, T01V76_n7070FasSigla
            }
            , new Object[] {
            T01V77_A279CliNom, T01V77_A407EmprNom, T01V77_n407EmprNom, T01V77_A460FasDsc, T01V77_A4642FasDsc2, T01V77_n4642FasDsc2, T01V77_A467FasPreMtr, T01V77_n467FasPreMtr, T01V77_A466FasPreKgm, T01V77_n466FasPreKgm,
            T01V77_A470FasSumTin, T01V77_n470FasSumTin, T01V77_A3615FasFacCod, T01V77_n3615FasFacCod, T01V77_A4385FasPreFAc, T01V77_n4385FasPreFAc, T01V77_A4386FasPreKAn, T01V77_n4386FasPreKAn, T01V77_A4387FasPreMAn, T01V77_n4387FasPreMAn,
            T01V77_A4388FasPreFAn, T01V77_n4388FasPreFAn, T01V77_A10882FasPreU, T01V77_n10882FasPreU, T01V77_A12576FasPreMt2, T01V77_n12576FasPreMt2, T01V77_A12577FasPreKgF, T01V77_n12577FasPreKgF, T01V77_A12704FasKgsMn, T01V77_n12704FasKgsMn,
            T01V77_A13587FasKgsEnt, T01V77_n13587FasKgsEnt, T01V77_A7070FasSigla, T01V77_n7070FasSigla, T01V77_A14258FasFactura, T01V77_A396EmprCod, T01V77_A252CliCod, T01V77_A457FasCod
            }
            , new Object[] {
            T01V78_A407EmprNom, T01V78_n407EmprNom
            }
            , new Object[] {
            T01V79_A279CliNom
            }
            , new Object[] {
            T01V710_A460FasDsc, T01V710_A4642FasDsc2, T01V710_n4642FasDsc2, T01V710_A7070FasSigla, T01V710_n7070FasSigla
            }
            , new Object[] {
            T01V711_A396EmprCod, T01V711_A252CliCod, T01V711_A457FasCod
            }
            , new Object[] {
            T01V712_A396EmprCod, T01V712_A252CliCod, T01V712_A457FasCod
            }
            , new Object[] {
            T01V713_A396EmprCod, T01V713_A252CliCod, T01V713_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01V717_A407EmprNom, T01V717_n407EmprNom
            }
            , new Object[] {
            T01V718_A279CliNom
            }
            , new Object[] {
            T01V719_A460FasDsc, T01V719_A4642FasDsc2, T01V719_n4642FasDsc2, T01V719_A7070FasSigla, T01V719_n7070FasSigla
            }
            , new Object[] {
            T01V720_A396EmprCod, T01V720_A252CliCod, T01V720_A4589FFProCod, T01V720_A4591FFFasCod
            }
            , new Object[] {
            T01V721_A396EmprCod, T01V721_A252CliCod, T01V721_A494ForSer, T01V721_A482ForColNom, T01V721_A483ForColNum, T01V721_A831TipColCod, T01V721_A853For_ProC, T01V721_A1028For_Ord
            }
            , new Object[] {
            T01V722_A396EmprCod, T01V722_A252CliCod, T01V722_A457FasCod, T01V722_A7727ArtAdiCod
            }
            , new Object[] {
            T01V723_A396EmprCod, T01V723_A252CliCod, T01V723_A65ArtCod, T01V723_A7135Lin_fast
            }
            , new Object[] {
            T01V724_A396EmprCod, T01V724_A252CliCod, T01V724_A6016FasExpLin
            }
            , new Object[] {
            T01V725_A396EmprCod, T01V725_A966PartCod, T01V725_A252CliCod, T01V725_A5849UbiLin
            }
            , new Object[] {
            T01V726_A396EmprCod, T01V726_A252CliCod, T01V726_A457FasCod, T01V726_A5515ClifsiLin
            }
            , new Object[] {
            T01V727_A396EmprCod, T01V727_A252CliCod, T01V727_A457FasCod, T01V727_A5519ClifsdLin
            }
            , new Object[] {
            T01V728_A396EmprCod, T01V728_A252CliCod, T01V728_A457FasCod, T01V728_A5310ClFsAny, T01V728_A5311ClFsSer
            }
            , new Object[] {
            T01V729_A396EmprCod, T01V729_A252CliCod, T01V729_A65ArtCod, T01V729_A4658MdlCod, T01V729_A457FasCod
            }
            , new Object[] {
            T01V730_A396EmprCod, T01V730_A252CliCod, T01V730_A65ArtCod, T01V730_A758ProCod, T01V730_A457FasCod
            }
            , new Object[] {
            T01V731_A396EmprCod, T01V731_A2333ExtPdoAlb, T01V731_A2790ExtPdoLin
            }
            , new Object[] {
            T01V732_A396EmprCod, T01V732_A252CliCod, T01V732_A457FasCod, T01V732_A2740PreExtSer, T01V732_A2427PreExtNMtr
            }
            , new Object[] {
            T01V733_A396EmprCod, T01V733_A2730RecTipCo, T01V733_A252CliCod, T01V733_A2736RecLin2
            }
            , new Object[] {
            T01V734_A396EmprCod, T01V734_A252CliCod, T01V734_A457FasCod
            }
         }
      );
   }

   private byte Z10882FasPreU ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A10882FasPreU ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ10882FasPreU ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound85 ;
   private short nIsDirty_85 ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtFasDsc2_Enabled ;
   private int edtFasPreMtr_Enabled ;
   private int edtFasPreKgm_Enabled ;
   private int edtFasSumTin_Enabled ;
   private int edtFasFacCod_Enabled ;
   private int edtFasPreFAc_Enabled ;
   private int edtFasPreKAn_Enabled ;
   private int edtFasPreMAn_Enabled ;
   private int edtFasPreFAn_Enabled ;
   private int edtFasPreMt2_Enabled ;
   private int edtFasKgsMn_Enabled ;
   private int edtFasSigla_Enabled ;
   private int edtFasFactura_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ252CliCod ;
   private java.math.BigDecimal Z467FasPreMtr ;
   private java.math.BigDecimal Z466FasPreKgm ;
   private java.math.BigDecimal Z4386FasPreKAn ;
   private java.math.BigDecimal Z4387FasPreMAn ;
   private java.math.BigDecimal Z12576FasPreMt2 ;
   private java.math.BigDecimal Z12704FasKgsMn ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A4386FasPreKAn ;
   private java.math.BigDecimal A4387FasPreMAn ;
   private java.math.BigDecimal A12576FasPreMt2 ;
   private java.math.BigDecimal A12704FasKgsMn ;
   private java.math.BigDecimal ZZ467FasPreMtr ;
   private java.math.BigDecimal ZZ466FasPreKgm ;
   private java.math.BigDecimal ZZ4386FasPreKAn ;
   private java.math.BigDecimal ZZ4387FasPreMAn ;
   private java.math.BigDecimal ZZ12576FasPreMt2 ;
   private java.math.BigDecimal ZZ12704FasKgsMn ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z457FasCod ;
   private String Z470FasSumTin ;
   private String Z3615FasFacCod ;
   private String Z12577FasPreKgF ;
   private String Z13587FasKgsEnt ;
   private String Z14258FasFactura ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String A12577FasPreKgF ;
   private String A13587FasKgsEnt ;
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
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String edtFasDsc2_Internalname ;
   private String A4642FasDsc2 ;
   private String edtFasDsc2_Jsonclick ;
   private String edtFasPreMtr_Internalname ;
   private String edtFasPreMtr_Jsonclick ;
   private String edtFasPreKgm_Internalname ;
   private String edtFasPreKgm_Jsonclick ;
   private String edtFasSumTin_Internalname ;
   private String A470FasSumTin ;
   private String edtFasSumTin_Jsonclick ;
   private String edtFasFacCod_Internalname ;
   private String A3615FasFacCod ;
   private String edtFasFacCod_Jsonclick ;
   private String edtFasPreFAc_Internalname ;
   private String edtFasPreFAc_Jsonclick ;
   private String edtFasPreKAn_Internalname ;
   private String edtFasPreKAn_Jsonclick ;
   private String edtFasPreMAn_Internalname ;
   private String edtFasPreMAn_Jsonclick ;
   private String edtFasPreFAn_Internalname ;
   private String edtFasPreFAn_Jsonclick ;
   private String edtFasPreMt2_Internalname ;
   private String edtFasPreMt2_Jsonclick ;
   private String edtFasKgsMn_Internalname ;
   private String edtFasKgsMn_Jsonclick ;
   private String edtFasSigla_Internalname ;
   private String A7070FasSigla ;
   private String edtFasSigla_Jsonclick ;
   private String edtFasFactura_Internalname ;
   private String A14258FasFactura ;
   private String edtFasFactura_Jsonclick ;
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
   private String Z460FasDsc ;
   private String Z4642FasDsc2 ;
   private String Z7070FasSigla ;
   private String sMode85 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ457FasCod ;
   private String ZZ470FasSumTin ;
   private String ZZ3615FasFacCod ;
   private String ZZ12577FasPreKgF ;
   private String ZZ13587FasKgsEnt ;
   private String ZZ14258FasFactura ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ460FasDsc ;
   private String ZZ4642FasDsc2 ;
   private String ZZ7070FasSigla ;
   private java.util.Date Z4385FasPreFAc ;
   private java.util.Date Z4388FasPreFAn ;
   private java.util.Date A4385FasPreFAc ;
   private java.util.Date A4388FasPreFAn ;
   private java.util.Date ZZ4385FasPreFAc ;
   private java.util.Date ZZ4388FasPreFAn ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n457FasCod ;
   private boolean wbErr ;
   private boolean n10882FasPreU ;
   private boolean n12577FasPreKgF ;
   private boolean n13587FasKgsEnt ;
   private boolean n407EmprNom ;
   private boolean n4642FasDsc2 ;
   private boolean n467FasPreMtr ;
   private boolean n466FasPreKgm ;
   private boolean n470FasSumTin ;
   private boolean n3615FasFacCod ;
   private boolean n4385FasPreFAc ;
   private boolean n4386FasPreKAn ;
   private boolean n4387FasPreMAn ;
   private boolean n4388FasPreFAn ;
   private boolean n12576FasPreMt2 ;
   private boolean n12704FasKgsMn ;
   private boolean n7070FasSigla ;
   private boolean Gx_longc ;
   private ICheckbox chkFasPreU ;
   private ICheckbox chkFasPreKgF ;
   private ICheckbox chkFasKgsEnt ;
   private IDataStoreProvider pr_default ;
   private String[] T01V77_A279CliNom ;
   private String[] T01V77_A407EmprNom ;
   private boolean[] T01V77_n407EmprNom ;
   private String[] T01V77_A460FasDsc ;
   private String[] T01V77_A4642FasDsc2 ;
   private boolean[] T01V77_n4642FasDsc2 ;
   private java.math.BigDecimal[] T01V77_A467FasPreMtr ;
   private boolean[] T01V77_n467FasPreMtr ;
   private java.math.BigDecimal[] T01V77_A466FasPreKgm ;
   private boolean[] T01V77_n466FasPreKgm ;
   private String[] T01V77_A470FasSumTin ;
   private boolean[] T01V77_n470FasSumTin ;
   private String[] T01V77_A3615FasFacCod ;
   private boolean[] T01V77_n3615FasFacCod ;
   private java.util.Date[] T01V77_A4385FasPreFAc ;
   private boolean[] T01V77_n4385FasPreFAc ;
   private java.math.BigDecimal[] T01V77_A4386FasPreKAn ;
   private boolean[] T01V77_n4386FasPreKAn ;
   private java.math.BigDecimal[] T01V77_A4387FasPreMAn ;
   private boolean[] T01V77_n4387FasPreMAn ;
   private java.util.Date[] T01V77_A4388FasPreFAn ;
   private boolean[] T01V77_n4388FasPreFAn ;
   private byte[] T01V77_A10882FasPreU ;
   private boolean[] T01V77_n10882FasPreU ;
   private java.math.BigDecimal[] T01V77_A12576FasPreMt2 ;
   private boolean[] T01V77_n12576FasPreMt2 ;
   private String[] T01V77_A12577FasPreKgF ;
   private boolean[] T01V77_n12577FasPreKgF ;
   private java.math.BigDecimal[] T01V77_A12704FasKgsMn ;
   private boolean[] T01V77_n12704FasKgsMn ;
   private String[] T01V77_A13587FasKgsEnt ;
   private boolean[] T01V77_n13587FasKgsEnt ;
   private String[] T01V77_A7070FasSigla ;
   private boolean[] T01V77_n7070FasSigla ;
   private String[] T01V77_A14258FasFactura ;
   private String[] T01V77_A396EmprCod ;
   private int[] T01V77_A252CliCod ;
   private boolean[] T01V77_n252CliCod ;
   private String[] T01V77_A457FasCod ;
   private boolean[] T01V77_n457FasCod ;
   private String[] T01V74_A407EmprNom ;
   private boolean[] T01V74_n407EmprNom ;
   private String[] T01V75_A279CliNom ;
   private String[] T01V76_A460FasDsc ;
   private String[] T01V76_A4642FasDsc2 ;
   private boolean[] T01V76_n4642FasDsc2 ;
   private String[] T01V76_A7070FasSigla ;
   private boolean[] T01V76_n7070FasSigla ;
   private String[] T01V78_A407EmprNom ;
   private boolean[] T01V78_n407EmprNom ;
   private String[] T01V79_A279CliNom ;
   private String[] T01V710_A460FasDsc ;
   private String[] T01V710_A4642FasDsc2 ;
   private boolean[] T01V710_n4642FasDsc2 ;
   private String[] T01V710_A7070FasSigla ;
   private boolean[] T01V710_n7070FasSigla ;
   private String[] T01V711_A396EmprCod ;
   private int[] T01V711_A252CliCod ;
   private boolean[] T01V711_n252CliCod ;
   private String[] T01V711_A457FasCod ;
   private boolean[] T01V711_n457FasCod ;
   private java.math.BigDecimal[] T01V73_A467FasPreMtr ;
   private boolean[] T01V73_n467FasPreMtr ;
   private java.math.BigDecimal[] T01V73_A466FasPreKgm ;
   private boolean[] T01V73_n466FasPreKgm ;
   private String[] T01V73_A470FasSumTin ;
   private boolean[] T01V73_n470FasSumTin ;
   private String[] T01V73_A3615FasFacCod ;
   private boolean[] T01V73_n3615FasFacCod ;
   private java.util.Date[] T01V73_A4385FasPreFAc ;
   private boolean[] T01V73_n4385FasPreFAc ;
   private java.math.BigDecimal[] T01V73_A4386FasPreKAn ;
   private boolean[] T01V73_n4386FasPreKAn ;
   private java.math.BigDecimal[] T01V73_A4387FasPreMAn ;
   private boolean[] T01V73_n4387FasPreMAn ;
   private java.util.Date[] T01V73_A4388FasPreFAn ;
   private boolean[] T01V73_n4388FasPreFAn ;
   private byte[] T01V73_A10882FasPreU ;
   private boolean[] T01V73_n10882FasPreU ;
   private java.math.BigDecimal[] T01V73_A12576FasPreMt2 ;
   private boolean[] T01V73_n12576FasPreMt2 ;
   private String[] T01V73_A12577FasPreKgF ;
   private boolean[] T01V73_n12577FasPreKgF ;
   private java.math.BigDecimal[] T01V73_A12704FasKgsMn ;
   private boolean[] T01V73_n12704FasKgsMn ;
   private String[] T01V73_A13587FasKgsEnt ;
   private boolean[] T01V73_n13587FasKgsEnt ;
   private String[] T01V73_A14258FasFactura ;
   private String[] T01V73_A396EmprCod ;
   private int[] T01V73_A252CliCod ;
   private boolean[] T01V73_n252CliCod ;
   private String[] T01V73_A457FasCod ;
   private boolean[] T01V73_n457FasCod ;
   private String[] T01V712_A396EmprCod ;
   private int[] T01V712_A252CliCod ;
   private boolean[] T01V712_n252CliCod ;
   private String[] T01V712_A457FasCod ;
   private boolean[] T01V712_n457FasCod ;
   private String[] T01V713_A396EmprCod ;
   private int[] T01V713_A252CliCod ;
   private boolean[] T01V713_n252CliCod ;
   private String[] T01V713_A457FasCod ;
   private boolean[] T01V713_n457FasCod ;
   private java.math.BigDecimal[] T01V72_A467FasPreMtr ;
   private boolean[] T01V72_n467FasPreMtr ;
   private java.math.BigDecimal[] T01V72_A466FasPreKgm ;
   private boolean[] T01V72_n466FasPreKgm ;
   private String[] T01V72_A470FasSumTin ;
   private boolean[] T01V72_n470FasSumTin ;
   private String[] T01V72_A3615FasFacCod ;
   private boolean[] T01V72_n3615FasFacCod ;
   private java.util.Date[] T01V72_A4385FasPreFAc ;
   private boolean[] T01V72_n4385FasPreFAc ;
   private java.math.BigDecimal[] T01V72_A4386FasPreKAn ;
   private boolean[] T01V72_n4386FasPreKAn ;
   private java.math.BigDecimal[] T01V72_A4387FasPreMAn ;
   private boolean[] T01V72_n4387FasPreMAn ;
   private java.util.Date[] T01V72_A4388FasPreFAn ;
   private boolean[] T01V72_n4388FasPreFAn ;
   private byte[] T01V72_A10882FasPreU ;
   private boolean[] T01V72_n10882FasPreU ;
   private java.math.BigDecimal[] T01V72_A12576FasPreMt2 ;
   private boolean[] T01V72_n12576FasPreMt2 ;
   private String[] T01V72_A12577FasPreKgF ;
   private boolean[] T01V72_n12577FasPreKgF ;
   private java.math.BigDecimal[] T01V72_A12704FasKgsMn ;
   private boolean[] T01V72_n12704FasKgsMn ;
   private String[] T01V72_A13587FasKgsEnt ;
   private boolean[] T01V72_n13587FasKgsEnt ;
   private String[] T01V72_A14258FasFactura ;
   private String[] T01V72_A396EmprCod ;
   private int[] T01V72_A252CliCod ;
   private boolean[] T01V72_n252CliCod ;
   private String[] T01V72_A457FasCod ;
   private boolean[] T01V72_n457FasCod ;
   private String[] T01V717_A407EmprNom ;
   private boolean[] T01V717_n407EmprNom ;
   private String[] T01V718_A279CliNom ;
   private String[] T01V719_A460FasDsc ;
   private String[] T01V719_A4642FasDsc2 ;
   private boolean[] T01V719_n4642FasDsc2 ;
   private String[] T01V719_A7070FasSigla ;
   private boolean[] T01V719_n7070FasSigla ;
   private String[] T01V720_A396EmprCod ;
   private int[] T01V720_A252CliCod ;
   private boolean[] T01V720_n252CliCod ;
   private String[] T01V720_A4589FFProCod ;
   private String[] T01V720_A4591FFFasCod ;
   private String[] T01V721_A396EmprCod ;
   private int[] T01V721_A252CliCod ;
   private boolean[] T01V721_n252CliCod ;
   private String[] T01V721_A494ForSer ;
   private String[] T01V721_A482ForColNom ;
   private int[] T01V721_A483ForColNum ;
   private byte[] T01V721_A831TipColCod ;
   private String[] T01V721_A853For_ProC ;
   private int[] T01V721_A1028For_Ord ;
   private String[] T01V722_A396EmprCod ;
   private int[] T01V722_A252CliCod ;
   private boolean[] T01V722_n252CliCod ;
   private String[] T01V722_A457FasCod ;
   private boolean[] T01V722_n457FasCod ;
   private short[] T01V722_A7727ArtAdiCod ;
   private String[] T01V723_A396EmprCod ;
   private int[] T01V723_A252CliCod ;
   private boolean[] T01V723_n252CliCod ;
   private String[] T01V723_A65ArtCod ;
   private short[] T01V723_A7135Lin_fast ;
   private String[] T01V724_A396EmprCod ;
   private int[] T01V724_A252CliCod ;
   private boolean[] T01V724_n252CliCod ;
   private short[] T01V724_A6016FasExpLin ;
   private String[] T01V725_A396EmprCod ;
   private String[] T01V725_A966PartCod ;
   private int[] T01V725_A252CliCod ;
   private boolean[] T01V725_n252CliCod ;
   private short[] T01V725_A5849UbiLin ;
   private String[] T01V726_A396EmprCod ;
   private int[] T01V726_A252CliCod ;
   private boolean[] T01V726_n252CliCod ;
   private String[] T01V726_A457FasCod ;
   private boolean[] T01V726_n457FasCod ;
   private short[] T01V726_A5515ClifsiLin ;
   private String[] T01V727_A396EmprCod ;
   private int[] T01V727_A252CliCod ;
   private boolean[] T01V727_n252CliCod ;
   private String[] T01V727_A457FasCod ;
   private boolean[] T01V727_n457FasCod ;
   private short[] T01V727_A5519ClifsdLin ;
   private String[] T01V728_A396EmprCod ;
   private int[] T01V728_A252CliCod ;
   private boolean[] T01V728_n252CliCod ;
   private String[] T01V728_A457FasCod ;
   private boolean[] T01V728_n457FasCod ;
   private short[] T01V728_A5310ClFsAny ;
   private String[] T01V728_A5311ClFsSer ;
   private String[] T01V729_A396EmprCod ;
   private int[] T01V729_A252CliCod ;
   private boolean[] T01V729_n252CliCod ;
   private String[] T01V729_A65ArtCod ;
   private String[] T01V729_A4658MdlCod ;
   private String[] T01V729_A457FasCod ;
   private boolean[] T01V729_n457FasCod ;
   private String[] T01V730_A396EmprCod ;
   private int[] T01V730_A252CliCod ;
   private boolean[] T01V730_n252CliCod ;
   private String[] T01V730_A65ArtCod ;
   private String[] T01V730_A758ProCod ;
   private String[] T01V730_A457FasCod ;
   private boolean[] T01V730_n457FasCod ;
   private String[] T01V731_A396EmprCod ;
   private int[] T01V731_A2333ExtPdoAlb ;
   private short[] T01V731_A2790ExtPdoLin ;
   private String[] T01V732_A396EmprCod ;
   private int[] T01V732_A252CliCod ;
   private boolean[] T01V732_n252CliCod ;
   private String[] T01V732_A457FasCod ;
   private boolean[] T01V732_n457FasCod ;
   private String[] T01V732_A2740PreExtSer ;
   private String[] T01V732_A2427PreExtNMtr ;
   private String[] T01V733_A396EmprCod ;
   private short[] T01V733_A2730RecTipCo ;
   private int[] T01V733_A252CliCod ;
   private boolean[] T01V733_n252CliCod ;
   private short[] T01V733_A2736RecLin2 ;
   private String[] T01V734_A396EmprCod ;
   private int[] T01V734_A252CliCod ;
   private boolean[] T01V734_n252CliCod ;
   private String[] T01V734_A457FasCod ;
   private boolean[] T01V734_n457FasCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class preciofase_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class preciofase_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class preciofase_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class preciofase_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class preciofase_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01V72", "SELECT FasPreMtr, FasPreKgm, FasSumTin, FasFacCod, FasPreFAc, FasPreKAn, FasPreMAn, FasPreFAn, FasPreU, FasPreMt2, FasPreKgF, FasKgsMn, FasKgsEnt, FasFactura, EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?  FOR UPDATE OF FasPreMtr, FasPreKgm, FasSumTin, FasFacCod, FasPreFAc, FasPreKAn, FasPreMAn, FasPreFAn, FasPreU, FasPreMt2, FasPreKgF, FasKgsMn, FasKgsEnt, FasFactura NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V73", "SELECT FasPreMtr, FasPreKgm, FasSumTin, FasFacCod, FasPreFAc, FasPreKAn, FasPreMAn, FasPreFAn, FasPreU, FasPreMt2, FasPreKgF, FasKgsMn, FasKgsEnt, FasFactura, EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V74", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V75", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V76", "SELECT FasDsc, FasDsc2, FasSigla FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V77", "SELECT /*+ FIRST_ROWS(100) */ T3.CliNom, T2.EmprNom, T4.FasDsc, T4.FasDsc2, TM1.FasPreMtr, TM1.FasPreKgm, TM1.FasSumTin, TM1.FasFacCod, TM1.FasPreFAc, TM1.FasPreKAn, TM1.FasPreMAn, TM1.FasPreFAn, TM1.FasPreU, TM1.FasPreMt2, TM1.FasPreKgF, TM1.FasKgsMn, TM1.FasKgsEnt, T4.FasSigla, TM1.FasFactura, TM1.EmprCod, TM1.CliCod, TM1.FasCod FROM (((TXPPREFAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPFASPRO T4 ON T4.EmprCod = TM1.EmprCod AND T4.FasCod = TM1.FasCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.FasCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.FasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V78", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V79", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V710", "SELECT FasDsc, FasDsc2, FasSigla FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V711", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V712", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and FasCod > ?) ORDER BY EmprCod, CliCod, FasCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V713", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and FasCod < ?) ORDER BY EmprCod DESC, CliCod DESC, FasCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01V714", "INSERT INTO TXPPREFAS(FasPreMtr, FasPreKgm, FasSumTin, FasFacCod, FasPreFAc, FasPreKAn, FasPreMAn, FasPreFAn, FasPreU, FasPreMt2, FasPreKgF, FasKgsMn, FasKgsEnt, FasFactura, EmprCod, CliCod, FasCod, ClifsdUl, ClifsiUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK, "TXPPREFAS")
         ,new UpdateCursor("T01V715", "UPDATE TXPPREFAS SET FasPreMtr=?, FasPreKgm=?, FasSumTin=?, FasFacCod=?, FasPreFAc=?, FasPreKAn=?, FasPreMAn=?, FasPreFAn=?, FasPreU=?, FasPreMt2=?, FasPreKgF=?, FasKgsMn=?, FasKgsEnt=?, FasFactura=?  WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?", GX_NOMASK, "TXPPREFAS")
         ,new UpdateCursor("T01V716", "DELETE FROM TXPPREFAS  WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?", GX_NOMASK, "TXPPREFAS")
         ,new ForEachCursor("T01V717", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V718", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V719", "SELECT FasDsc, FasDsc2, FasSigla FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V720", "SELECT * FROM (SELECT EmprCod, CliCod, FFProCod, FFFasCod FROM TXPFasFC2 WHERE EmprCod = ? AND CliCod = ? AND FFFasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V721", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, For_ProC, For_Ord FROM TXPTAB001 WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V722", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, ArtAdiCod FROM TXPARTPFA WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V723", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND FasCodt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V724", "SELECT * FROM (SELECT EmprCod, CliCod, FasExpLin FROM TXPFASCLI WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V725", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod, UbiLin FROM TXPUBIMTO WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V726", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, ClifsiLin FROM TXPCLIFS1 WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V727", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, ClifsdLin FROM TXPCLIFSD WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V728", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, ClFsAny, ClFsSer FROM TXPCLFSE WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V729", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod, FasCod FROM TXPCForFa WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V730", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V731", "SELECT * FROM (SELECT EmprCod, ExtPdoAlb, ExtPdoLin FROM TXPLEXTPD WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V732", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, PreExtSer, PreExtNMtr FROM TXPPREEXT WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V733", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod, RecLin2 FROM TXPLRETIT WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V734", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, FasCod FROM TXPPREFAS ORDER BY EmprCod, CliCod, FasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(14, 1);
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((int[]) buf[28])[0] = rslt.getInt(16);
               ((String[]) buf[29])[0] = rslt.getString(17, 8);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(14, 1);
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((int[]) buf[28])[0] = rslt.getInt(16);
               ((String[]) buf[29])[0] = rslt.getString(17, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((String[]) buf[4])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 4);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 1);
               ((String[]) buf[35])[0] = rslt.getString(20, 3);
               ((int[]) buf[36])[0] = rslt.getInt(21);
               ((String[]) buf[37])[0] = rslt.getString(22, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 8);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 8);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 5);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 1);
               }
               stmt.setString(14, (String)parms[26], 1);
               stmt.setString(15, (String)parms[27], 3);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[31], 8);
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 5);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 1);
               }
               stmt.setString(14, (String)parms[26], 1);
               stmt.setString(15, (String)parms[27], 3);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[31], 8);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
      }
   }

}

