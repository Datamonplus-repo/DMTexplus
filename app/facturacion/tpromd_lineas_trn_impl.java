package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpromd_lineas_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"PMDCOLNOM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8531PMDConCod = (int)(GXutil.lval( httpContext.GetPar( "PMDConCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8531PMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8531PMDConCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asapmdcolnom1VG1159( A396EmprCod, A252CliCod, A8531PMDConCod) ;
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
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8391PMDCod = (short)(GXutil.lval( httpContext.GetPar( "PMDCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A252CliCod, A8391PMDCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Programas, Lineas ", ""), (short)(0)) ;
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

   public tpromd_lineas_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpromd_lineas_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpromd_lineas_trn_impl.class ));
   }

   public tpromd_lineas_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Programas, Lineas ", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\TProMD_lineas_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Facturacion\\TProMD_lineas_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDCod_Internalname, httpContext.getMessage( "Programa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8391PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8391PMDCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8391PMDCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDDsc_Internalname, httpContext.getMessage( "Descripción Programa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDDsc_Internalname, GXutil.rtrim( A8392PMDDsc), GXutil.rtrim( localUtil.format( A8392PMDDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDColNum_Internalname, httpContext.getMessage( "Número de Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8393PMDColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8393PMDColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDColNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDColNom_Internalname, httpContext.getMessage( "Nombre Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDColNom_Internalname, GXutil.rtrim( A8394PMDColNom), GXutil.rtrim( localUtil.format( A8394PMDColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDColNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDPreKgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDPreKgm_Internalname, httpContext.getMessage( "Kgms Previstos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A8395PMDPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDPreKgm_Enabled!=0) ? localUtil.format( A8395PMDPreKgm, "ZZZ,ZZ9.99") : localUtil.format( A8395PMDPreKgm, "ZZZ,ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDPreKgm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDPreKgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDEntKgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDEntKgm_Internalname, httpContext.getMessage( "Kgms Entrados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDEntKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A8396PMDEntKgm, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDEntKgm_Enabled!=0) ? localUtil.format( A8396PMDEntKgm, "ZZZ,ZZ9.99 ") : localUtil.format( A8396PMDEntKgm, "ZZZ,ZZ9.99 "))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDEntKgm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDEntKgm_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDDtoTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDDtoTin_Internalname, httpContext.getMessage( "Dto Tint", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDDtoTin_Internalname, GXutil.ltrim( localUtil.ntoc( A8397PMDDtoTin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDDtoTin_Enabled!=0) ? localUtil.format( A8397PMDDtoTin, "ZZ9.99 ") : localUtil.format( A8397PMDDtoTin, "ZZ9.99 "))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDDtoTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDDtoTin_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDDtoAca_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDDtoAca_Internalname, httpContext.getMessage( "Dto Acabado.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDDtoAca_Internalname, GXutil.ltrim( localUtil.ntoc( A8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDDtoAca_Enabled!=0) ? localUtil.format( A8398PMDDtoAca, "ZZ9.99") : localUtil.format( A8398PMDDtoAca, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDDtoAca_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDDtoAca_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDValFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDValFch_Internalname, httpContext.getMessage( "Validez", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPMDValFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDValFch_Internalname, localUtil.format(A8399PMDValFch, "99/99/99"), localUtil.format( A8399PMDValFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDValFch_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDValFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPMDValFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPMDValFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDColCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDColCli_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDColCli_Internalname, GXutil.rtrim( A8530PMDColCli), GXutil.rtrim( localUtil.format( A8530PMDColCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDColCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDColCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDConCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDConCod_Internalname, httpContext.getMessage( "Numero Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDConCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDConCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8531PMDConCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8531PMDConCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDConCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDConCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDPreUni_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDPreUni_Internalname, httpContext.getMessage( "Precio Unico", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDPreUni_Internalname, GXutil.ltrim( localUtil.ntoc( A8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDPreUni_Enabled!=0) ? localUtil.format( A8532PMDPreUni, "ZZZZZZ9.999") : localUtil.format( A8532PMDPreUni, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDPreUni_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPMDPreUni_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD_lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD_lineas_TRN.htm");
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
         Z8391PMDCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z8391PMDCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8393PMDColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z8393PMDColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8395PMDPreKgm = localUtil.ctond( httpContext.cgiGet( "Z8395PMDPreKgm")) ;
         Z8396PMDEntKgm = localUtil.ctond( httpContext.cgiGet( "Z8396PMDEntKgm")) ;
         Z8397PMDDtoTin = localUtil.ctond( httpContext.cgiGet( "Z8397PMDDtoTin")) ;
         Z8398PMDDtoAca = localUtil.ctond( httpContext.cgiGet( "Z8398PMDDtoAca")) ;
         Z8399PMDValFch = localUtil.ctod( httpContext.cgiGet( "Z8399PMDValFch"), 0) ;
         Z8530PMDColCli = httpContext.cgiGet( "Z8530PMDColCli") ;
         Z8531PMDConCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z8531PMDConCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8532PMDPreUni = localUtil.ctond( httpContext.cgiGet( "Z8532PMDPreUni")) ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8391PMDCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
         }
         else
         {
            A8391PMDCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPMDCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
         }
         A8392PMDDsc = httpContext.cgiGet( edtPMDDsc_Internalname) ;
         n8392PMDDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8392PMDDsc", A8392PMDDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8393PMDColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A8393PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8393PMDColNum), 6, 0));
         }
         else
         {
            A8393PMDColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPMDColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8393PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8393PMDColNum), 6, 0));
         }
         A8394PMDColNom = httpContext.cgiGet( edtPMDColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8394PMDColNom", A8394PMDColNom);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDPreKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDPREKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDPreKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8395PMDPreKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8395PMDPreKgm", GXutil.ltrimstr( A8395PMDPreKgm, 9, 2));
         }
         else
         {
            A8395PMDPreKgm = localUtil.ctond( httpContext.cgiGet( edtPMDPreKgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8395PMDPreKgm", GXutil.ltrimstr( A8395PMDPreKgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDEntKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDEntKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDENTKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDEntKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8396PMDEntKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8396PMDEntKgm", GXutil.ltrimstr( A8396PMDEntKgm, 9, 2));
         }
         else
         {
            A8396PMDEntKgm = localUtil.ctond( httpContext.cgiGet( edtPMDEntKgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8396PMDEntKgm", GXutil.ltrimstr( A8396PMDEntKgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDDtoTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDDtoTin_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDDTOTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDDtoTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8397PMDDtoTin = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8397PMDDtoTin", GXutil.ltrimstr( A8397PMDDtoTin, 6, 2));
         }
         else
         {
            A8397PMDDtoTin = localUtil.ctond( httpContext.cgiGet( edtPMDDtoTin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8397PMDDtoTin", GXutil.ltrimstr( A8397PMDDtoTin, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDDtoAca_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDDtoAca_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDDTOACA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDDtoAca_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8398PMDDtoAca = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8398PMDDtoAca", GXutil.ltrimstr( A8398PMDDtoAca, 6, 2));
         }
         else
         {
            A8398PMDDtoAca = localUtil.ctond( httpContext.cgiGet( edtPMDDtoAca_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8398PMDDtoAca", GXutil.ltrimstr( A8398PMDDtoAca, 6, 2));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtPMDValFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PMDVALFCH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDValFch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8399PMDValFch = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A8399PMDValFch", localUtil.format(A8399PMDValFch, "99/99/99"));
         }
         else
         {
            A8399PMDValFch = localUtil.ctod( httpContext.cgiGet( edtPMDValFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8399PMDValFch", localUtil.format(A8399PMDValFch, "99/99/99"));
         }
         A8530PMDColCli = httpContext.cgiGet( edtPMDColCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8530PMDColCli", A8530PMDColCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDCONCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDConCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8531PMDConCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A8531PMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8531PMDConCod), 6, 0));
         }
         else
         {
            A8531PMDConCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMDConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8531PMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8531PMDConCod), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDPreUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDPreUni_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDPREUNI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMDPreUni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8532PMDPreUni = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8532PMDPreUni", GXutil.ltrimstr( A8532PMDPreUni, 14, 5));
         }
         else
         {
            A8532PMDPreUni = localUtil.ctond( httpContext.cgiGet( edtPMDPreUni_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8532PMDPreUni", GXutil.ltrimstr( A8532PMDPreUni, 14, 5));
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
            A8391PMDCod = (short)(GXutil.lval( httpContext.GetPar( "PMDCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
            A8393PMDColNum = (int)(GXutil.lval( httpContext.GetPar( "PMDColNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8393PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8393PMDColNum), 6, 0));
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
            initAll1VG1159( ) ;
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
      disableAttributes1VG1159( ) ;
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

   public void resetCaption1VG0( )
   {
   }

   public void zm1VG1159( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8395PMDPreKgm = T01VG3_A8395PMDPreKgm[0] ;
            Z8396PMDEntKgm = T01VG3_A8396PMDEntKgm[0] ;
            Z8397PMDDtoTin = T01VG3_A8397PMDDtoTin[0] ;
            Z8398PMDDtoAca = T01VG3_A8398PMDDtoAca[0] ;
            Z8399PMDValFch = T01VG3_A8399PMDValFch[0] ;
            Z8530PMDColCli = T01VG3_A8530PMDColCli[0] ;
            Z8531PMDConCod = T01VG3_A8531PMDConCod[0] ;
            Z8532PMDPreUni = T01VG3_A8532PMDPreUni[0] ;
         }
         else
         {
            Z8395PMDPreKgm = A8395PMDPreKgm ;
            Z8396PMDEntKgm = A8396PMDEntKgm ;
            Z8397PMDDtoTin = A8397PMDDtoTin ;
            Z8398PMDDtoAca = A8398PMDDtoAca ;
            Z8399PMDValFch = A8399PMDValFch ;
            Z8530PMDColCli = A8530PMDColCli ;
            Z8531PMDConCod = A8531PMDConCod ;
            Z8532PMDPreUni = A8532PMDPreUni ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z8393PMDColNum = A8393PMDColNum ;
         Z8395PMDPreKgm = A8395PMDPreKgm ;
         Z8396PMDEntKgm = A8396PMDEntKgm ;
         Z8397PMDDtoTin = A8397PMDDtoTin ;
         Z8398PMDDtoAca = A8398PMDDtoAca ;
         Z8399PMDValFch = A8399PMDValFch ;
         Z8530PMDColCli = A8530PMDColCli ;
         Z8531PMDConCod = A8531PMDConCod ;
         Z8532PMDPreUni = A8532PMDPreUni ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z8391PMDCod = A8391PMDCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z8392PMDDsc = A8392PMDDsc ;
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

   public void load1VG1159( )
   {
      /* Using cursor T01VG7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1159 = (short)(1) ;
         A407EmprNom = T01VG7_A407EmprNom[0] ;
         n407EmprNom = T01VG7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01VG7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A8392PMDDsc = T01VG7_A8392PMDDsc[0] ;
         n8392PMDDsc = T01VG7_n8392PMDDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8392PMDDsc", A8392PMDDsc);
         A8395PMDPreKgm = T01VG7_A8395PMDPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8395PMDPreKgm", GXutil.ltrimstr( A8395PMDPreKgm, 9, 2));
         A8396PMDEntKgm = T01VG7_A8396PMDEntKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8396PMDEntKgm", GXutil.ltrimstr( A8396PMDEntKgm, 9, 2));
         A8397PMDDtoTin = T01VG7_A8397PMDDtoTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8397PMDDtoTin", GXutil.ltrimstr( A8397PMDDtoTin, 6, 2));
         A8398PMDDtoAca = T01VG7_A8398PMDDtoAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8398PMDDtoAca", GXutil.ltrimstr( A8398PMDDtoAca, 6, 2));
         A8399PMDValFch = T01VG7_A8399PMDValFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8399PMDValFch", localUtil.format(A8399PMDValFch, "99/99/99"));
         A8530PMDColCli = T01VG7_A8530PMDColCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8530PMDColCli", A8530PMDColCli);
         A8531PMDConCod = T01VG7_A8531PMDConCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8531PMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8531PMDConCod), 6, 0));
         A8532PMDPreUni = T01VG7_A8532PMDPreUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8532PMDPreUni", GXutil.ltrimstr( A8532PMDPreUni, 14, 5));
         zm1VG1159( -2) ;
      }
      pr_default.close(5);
      onLoadActions1VG1159( ) ;
   }

   public void onLoadActions1VG1159( )
   {
      GXt_char1 = A8394PMDColNom ;
      GXv_char2[0] = GXt_char1 ;
      new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char2) ;
      tpromd_lineas_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A8394PMDColNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8394PMDColNom", A8394PMDColNom);
   }

   public void checkExtendedTable1VG1159( )
   {
      nIsDirty_1159 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01VG4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VG4_A407EmprNom[0] ;
      n407EmprNom = T01VG4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01VG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01VG5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
      nIsDirty_1159 = (short)(1) ;
      GXt_char1 = A8394PMDColNom ;
      GXv_char2[0] = GXt_char1 ;
      new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char2) ;
      tpromd_lineas_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A8394PMDColNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8394PMDColNom", A8394PMDColNom);
      /* Using cursor T01VG6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ProMD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8392PMDDsc = T01VG6_A8392PMDDsc[0] ;
      n8392PMDDsc = T01VG6_n8392PMDDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8392PMDDsc", A8392PMDDsc);
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1VG1159( )
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
      /* Using cursor T01VG8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VG8_A407EmprNom[0] ;
      n407EmprNom = T01VG8_n407EmprNom[0] ;
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
      /* Using cursor T01VG9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01VG9_A279CliNom[0] ;
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
                         int A252CliCod ,
                         short A8391PMDCod )
   {
      /* Using cursor T01VG10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ProMD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8392PMDDsc = T01VG10_A8392PMDDsc[0] ;
      n8392PMDDsc = T01VG10_n8392PMDDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8392PMDDsc", A8392PMDDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8392PMDDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1VG1159( )
   {
      /* Using cursor T01VG11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1159 = (short)(1) ;
      }
      else
      {
         RcdFound1159 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01VG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1VG1159( 2) ;
         RcdFound1159 = (short)(1) ;
         A8393PMDColNum = T01VG3_A8393PMDColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8393PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8393PMDColNum), 6, 0));
         A8395PMDPreKgm = T01VG3_A8395PMDPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8395PMDPreKgm", GXutil.ltrimstr( A8395PMDPreKgm, 9, 2));
         A8396PMDEntKgm = T01VG3_A8396PMDEntKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8396PMDEntKgm", GXutil.ltrimstr( A8396PMDEntKgm, 9, 2));
         A8397PMDDtoTin = T01VG3_A8397PMDDtoTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8397PMDDtoTin", GXutil.ltrimstr( A8397PMDDtoTin, 6, 2));
         A8398PMDDtoAca = T01VG3_A8398PMDDtoAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8398PMDDtoAca", GXutil.ltrimstr( A8398PMDDtoAca, 6, 2));
         A8399PMDValFch = T01VG3_A8399PMDValFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8399PMDValFch", localUtil.format(A8399PMDValFch, "99/99/99"));
         A8530PMDColCli = T01VG3_A8530PMDColCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8530PMDColCli", A8530PMDColCli);
         A8531PMDConCod = T01VG3_A8531PMDConCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8531PMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8531PMDConCod), 6, 0));
         A8532PMDPreUni = T01VG3_A8532PMDPreUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8532PMDPreUni", GXutil.ltrimstr( A8532PMDPreUni, 14, 5));
         A396EmprCod = T01VG3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01VG3_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8391PMDCod = T01VG3_A8391PMDCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z8391PMDCod = A8391PMDCod ;
         Z8393PMDColNum = A8393PMDColNum ;
         sMode1159 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1VG1159( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1159 = (short)(0) ;
            initializeNonKey1VG1159( ) ;
         }
         Gx_mode = sMode1159 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1159 = (short)(0) ;
         initializeNonKey1VG1159( ) ;
         sMode1159 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1159 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1VG1159( ) ;
      if ( RcdFound1159 == 0 )
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
      RcdFound1159 = (short)(0) ;
      /* Using cursor T01VG12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Short.valueOf(A8391PMDCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A8393PMDColNum)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01VG12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VG12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VG12_A252CliCod[0] < A252CliCod ) || ( T01VG12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VG12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VG12_A8391PMDCod[0] < A8391PMDCod ) || ( T01VG12_A8391PMDCod[0] == A8391PMDCod ) && ( T01VG12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VG12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VG12_A8393PMDColNum[0] < A8393PMDColNum ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01VG12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VG12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VG12_A252CliCod[0] > A252CliCod ) || ( T01VG12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VG12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VG12_A8391PMDCod[0] > A8391PMDCod ) || ( T01VG12_A8391PMDCod[0] == A8391PMDCod ) && ( T01VG12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VG12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VG12_A8393PMDColNum[0] > A8393PMDColNum ) ) )
         {
            A396EmprCod = T01VG12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01VG12_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A8391PMDCod = T01VG12_A8391PMDCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
            A8393PMDColNum = T01VG12_A8393PMDColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8393PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8393PMDColNum), 6, 0));
            RcdFound1159 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1159 = (short)(0) ;
      /* Using cursor T01VG13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Short.valueOf(A8391PMDCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A8393PMDColNum)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01VG13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VG13_A252CliCod[0] > A252CliCod ) || ( T01VG13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VG13_A8391PMDCod[0] > A8391PMDCod ) || ( T01VG13_A8391PMDCod[0] == A8391PMDCod ) && ( T01VG13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VG13_A8393PMDColNum[0] > A8393PMDColNum ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01VG13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VG13_A252CliCod[0] < A252CliCod ) || ( T01VG13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VG13_A8391PMDCod[0] < A8391PMDCod ) || ( T01VG13_A8391PMDCod[0] == A8391PMDCod ) && ( T01VG13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VG13_A8393PMDColNum[0] < A8393PMDColNum ) ) )
         {
            A396EmprCod = T01VG13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01VG13_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A8391PMDCod = T01VG13_A8391PMDCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
            A8393PMDColNum = T01VG13_A8393PMDColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8393PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8393PMDColNum), 6, 0));
            RcdFound1159 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VG1159( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1VG1159( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1159 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A8391PMDCod != Z8391PMDCod ) || ( A8393PMDColNum != Z8393PMDColNum ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A8391PMDCod = Z8391PMDCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
               A8393PMDColNum = Z8393PMDColNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A8393PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8393PMDColNum), 6, 0));
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
               update1VG1159( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A8391PMDCod != Z8391PMDCod ) || ( A8393PMDColNum != Z8393PMDColNum ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1VG1159( ) ;
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
                  insert1VG1159( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A8391PMDCod != Z8391PMDCod ) || ( A8393PMDColNum != Z8393PMDColNum ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8391PMDCod = Z8391PMDCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
         A8393PMDColNum = Z8393PMDColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A8393PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8393PMDColNum), 6, 0));
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
      if ( RcdFound1159 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPMDPreKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1VG1159( ) ;
      if ( RcdFound1159 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPMDPreKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VG1159( ) ;
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
      if ( RcdFound1159 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPMDPreKgm_Internalname ;
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
      if ( RcdFound1159 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPMDPreKgm_Internalname ;
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
      scanStart1VG1159( ) ;
      if ( RcdFound1159 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1159 != 0 )
         {
            scanNext1VG1159( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPMDPreKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VG1159( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1VG1159( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01VG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPProMD1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z8395PMDPreKgm, T01VG2_A8395PMDPreKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z8396PMDEntKgm, T01VG2_A8396PMDEntKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z8397PMDDtoTin, T01VG2_A8397PMDDtoTin[0]) != 0 ) || ( DecimalUtil.compareTo(Z8398PMDDtoAca, T01VG2_A8398PMDDtoAca[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z8399PMDValFch), GXutil.resetTime(T01VG2_A8399PMDValFch[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8530PMDColCli, T01VG2_A8530PMDColCli[0]) != 0 ) || ( Z8531PMDConCod != T01VG2_A8531PMDConCod[0] ) || ( DecimalUtil.compareTo(Z8532PMDPreUni, T01VG2_A8532PMDPreUni[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z8395PMDPreKgm, T01VG2_A8395PMDPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpromd_lineas_trn:[seudo value changed for attri]"+"PMDPreKgm");
               GXutil.writeLogRaw("Old: ",Z8395PMDPreKgm);
               GXutil.writeLogRaw("Current: ",T01VG2_A8395PMDPreKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z8396PMDEntKgm, T01VG2_A8396PMDEntKgm[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpromd_lineas_trn:[seudo value changed for attri]"+"PMDEntKgm");
               GXutil.writeLogRaw("Old: ",Z8396PMDEntKgm);
               GXutil.writeLogRaw("Current: ",T01VG2_A8396PMDEntKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z8397PMDDtoTin, T01VG2_A8397PMDDtoTin[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpromd_lineas_trn:[seudo value changed for attri]"+"PMDDtoTin");
               GXutil.writeLogRaw("Old: ",Z8397PMDDtoTin);
               GXutil.writeLogRaw("Current: ",T01VG2_A8397PMDDtoTin[0]);
            }
            if ( DecimalUtil.compareTo(Z8398PMDDtoAca, T01VG2_A8398PMDDtoAca[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpromd_lineas_trn:[seudo value changed for attri]"+"PMDDtoAca");
               GXutil.writeLogRaw("Old: ",Z8398PMDDtoAca);
               GXutil.writeLogRaw("Current: ",T01VG2_A8398PMDDtoAca[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8399PMDValFch), GXutil.resetTime(T01VG2_A8399PMDValFch[0])) ) )
            {
               GXutil.writeLogln("facturacion.tpromd_lineas_trn:[seudo value changed for attri]"+"PMDValFch");
               GXutil.writeLogRaw("Old: ",Z8399PMDValFch);
               GXutil.writeLogRaw("Current: ",T01VG2_A8399PMDValFch[0]);
            }
            if ( GXutil.strcmp(Z8530PMDColCli, T01VG2_A8530PMDColCli[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpromd_lineas_trn:[seudo value changed for attri]"+"PMDColCli");
               GXutil.writeLogRaw("Old: ",Z8530PMDColCli);
               GXutil.writeLogRaw("Current: ",T01VG2_A8530PMDColCli[0]);
            }
            if ( Z8531PMDConCod != T01VG2_A8531PMDConCod[0] )
            {
               GXutil.writeLogln("facturacion.tpromd_lineas_trn:[seudo value changed for attri]"+"PMDConCod");
               GXutil.writeLogRaw("Old: ",Z8531PMDConCod);
               GXutil.writeLogRaw("Current: ",T01VG2_A8531PMDConCod[0]);
            }
            if ( DecimalUtil.compareTo(Z8532PMDPreUni, T01VG2_A8532PMDPreUni[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpromd_lineas_trn:[seudo value changed for attri]"+"PMDPreUni");
               GXutil.writeLogRaw("Old: ",Z8532PMDPreUni);
               GXutil.writeLogRaw("Current: ",T01VG2_A8532PMDPreUni[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPProMD1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VG1159( )
   {
      beforeValidate1VG1159( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VG1159( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VG1159( 0) ;
         checkOptimisticConcurrency1VG1159( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VG1159( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VG1159( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VG14 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A8393PMDColNum), A8395PMDPreKgm, A8396PMDEntKgm, A8397PMDDtoTin, A8398PMDDtoAca, A8399PMDValFch, A8530PMDColCli, Integer.valueOf(A8531PMDConCod), A8532PMDPreUni, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
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
                        resetCaption1VG0( ) ;
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
            load1VG1159( ) ;
         }
         endLevel1VG1159( ) ;
      }
      closeExtendedTableCursors1VG1159( ) ;
   }

   public void update1VG1159( )
   {
      beforeValidate1VG1159( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VG1159( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VG1159( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VG1159( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VG1159( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VG15 */
                  pr_default.execute(13, new Object[] {A8395PMDPreKgm, A8396PMDEntKgm, A8397PMDDtoTin, A8398PMDDtoAca, A8399PMDValFch, A8530PMDColCli, Integer.valueOf(A8531PMDConCod), A8532PMDPreUni, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPProMD1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VG1159( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1VG0( ) ;
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
         endLevel1VG1159( ) ;
      }
      closeExtendedTableCursors1VG1159( ) ;
   }

   public void deferredUpdate1VG1159( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1VG1159( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VG1159( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VG1159( ) ;
         afterConfirm1VG1159( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VG1159( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01VG16 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1159 == 0 )
                     {
                        initAll1VG1159( ) ;
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
                     resetCaption1VG0( ) ;
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
      sMode1159 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1VG1159( ) ;
      Gx_mode = sMode1159 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1VG1159( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01VG17 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         A407EmprNom = T01VG17_A407EmprNom[0] ;
         n407EmprNom = T01VG17_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(15);
         /* Using cursor T01VG18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01VG18_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(16);
         /* Using cursor T01VG19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
         A8392PMDDsc = T01VG19_A8392PMDDsc[0] ;
         n8392PMDDsc = T01VG19_n8392PMDDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8392PMDDsc", A8392PMDDsc);
         pr_default.close(17);
         GXt_char1 = A8394PMDColNom ;
         GXv_char2[0] = GXt_char1 ;
         new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char2) ;
         tpromd_lineas_trn_impl.this.GXt_char1 = GXv_char2[0] ;
         A8394PMDColNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8394PMDColNom", A8394PMDColNom);
      }
   }

   public void endLevel1VG1159( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VG1159( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tpromd_lineas_trn");
         if ( AnyError == 0 )
         {
            confirmValues1VG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.tpromd_lineas_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1VG1159( )
   {
      /* Using cursor T01VG20 */
      pr_default.execute(18);
      RcdFound1159 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1159 = (short)(1) ;
         A396EmprCod = T01VG20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01VG20_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8391PMDCod = T01VG20_A8391PMDCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
         A8393PMDColNum = T01VG20_A8393PMDColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8393PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8393PMDColNum), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1VG1159( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1159 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1159 = (short)(1) ;
         A396EmprCod = T01VG20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01VG20_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8391PMDCod = T01VG20_A8391PMDCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
         A8393PMDColNum = T01VG20_A8393PMDColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8393PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8393PMDColNum), 6, 0));
      }
   }

   public void scanEnd1VG1159( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1VG1159( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1VG1159( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VG1159( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VG1159( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VG1159( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VG1159( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VG1159( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtPMDCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDCod_Enabled), 5, 0), true);
      edtPMDDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDsc_Enabled), 5, 0), true);
      edtPMDColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNum_Enabled), 5, 0), true);
      edtPMDColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNom_Enabled), 5, 0), true);
      edtPMDPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDPreKgm_Enabled), 5, 0), true);
      edtPMDEntKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDEntKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDEntKgm_Enabled), 5, 0), true);
      edtPMDDtoTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDDtoTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDtoTin_Enabled), 5, 0), true);
      edtPMDDtoAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDDtoAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDtoAca_Enabled), 5, 0), true);
      edtPMDValFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDValFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDValFch_Enabled), 5, 0), true);
      edtPMDColCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDColCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColCli_Enabled), 5, 0), true);
      edtPMDConCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDConCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDConCod_Enabled), 5, 0), true);
      edtPMDPreUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDPreUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDPreUni_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1VG1159( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1VG0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.tpromd_lineas_trn", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z8391PMDCod", GXutil.ltrim( localUtil.ntoc( Z8391PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8393PMDColNum", GXutil.ltrim( localUtil.ntoc( Z8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8395PMDPreKgm", GXutil.ltrim( localUtil.ntoc( Z8395PMDPreKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8396PMDEntKgm", GXutil.ltrim( localUtil.ntoc( Z8396PMDEntKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8397PMDDtoTin", GXutil.ltrim( localUtil.ntoc( Z8397PMDDtoTin, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8398PMDDtoAca", GXutil.ltrim( localUtil.ntoc( Z8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8399PMDValFch", localUtil.dtoc( Z8399PMDValFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8530PMDColCli", GXutil.rtrim( Z8530PMDColCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8531PMDConCod", GXutil.ltrim( localUtil.ntoc( Z8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8532PMDPreUni", GXutil.ltrim( localUtil.ntoc( Z8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.facturacion.tpromd_lineas_trn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.TProMD_lineas_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Programas, Lineas ", "") ;
   }

   public void initializeNonKey1VG1159( )
   {
      A8394PMDColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8394PMDColNom", A8394PMDColNom);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A8392PMDDsc = "" ;
      n8392PMDDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8392PMDDsc", A8392PMDDsc);
      A8395PMDPreKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8395PMDPreKgm", GXutil.ltrimstr( A8395PMDPreKgm, 9, 2));
      A8396PMDEntKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8396PMDEntKgm", GXutil.ltrimstr( A8396PMDEntKgm, 9, 2));
      A8397PMDDtoTin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8397PMDDtoTin", GXutil.ltrimstr( A8397PMDDtoTin, 6, 2));
      A8398PMDDtoAca = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8398PMDDtoAca", GXutil.ltrimstr( A8398PMDDtoAca, 6, 2));
      A8399PMDValFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A8399PMDValFch", localUtil.format(A8399PMDValFch, "99/99/99"));
      A8530PMDColCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8530PMDColCli", A8530PMDColCli);
      A8531PMDConCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8531PMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8531PMDConCod), 6, 0));
      A8532PMDPreUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8532PMDPreUni", GXutil.ltrimstr( A8532PMDPreUni, 14, 5));
      Z8395PMDPreKgm = DecimalUtil.ZERO ;
      Z8396PMDEntKgm = DecimalUtil.ZERO ;
      Z8397PMDDtoTin = DecimalUtil.ZERO ;
      Z8398PMDDtoAca = DecimalUtil.ZERO ;
      Z8399PMDValFch = GXutil.nullDate() ;
      Z8530PMDColCli = "" ;
      Z8531PMDConCod = 0 ;
      Z8532PMDPreUni = DecimalUtil.ZERO ;
   }

   public void initAll1VG1159( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A8391PMDCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8391PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8391PMDCod), 4, 0));
      A8393PMDColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8393PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8393PMDColNum), 6, 0));
      initializeNonKey1VG1159( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415124249", true, true);
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
      httpContext.AddJavascriptSource("facturacion/tpromd_lineas_trn.js", "?202682415124249", false, true);
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
      edtPMDCod_Internalname = "PMDCOD" ;
      edtPMDDsc_Internalname = "PMDDSC" ;
      edtPMDColNum_Internalname = "PMDCOLNUM" ;
      edtPMDColNom_Internalname = "PMDCOLNOM" ;
      edtPMDPreKgm_Internalname = "PMDPREKGM" ;
      edtPMDEntKgm_Internalname = "PMDENTKGM" ;
      edtPMDDtoTin_Internalname = "PMDDTOTIN" ;
      edtPMDDtoAca_Internalname = "PMDDTOACA" ;
      edtPMDValFch_Internalname = "PMDVALFCH" ;
      edtPMDColCli_Internalname = "PMDCOLCLI" ;
      edtPMDConCod_Internalname = "PMDCONCOD" ;
      edtPMDPreUni_Internalname = "PMDPREUNI" ;
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
      Form.setCaption( httpContext.getMessage( "Programas, Lineas ", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPMDPreUni_Jsonclick = "" ;
      edtPMDPreUni_Enabled = 1 ;
      edtPMDConCod_Jsonclick = "" ;
      edtPMDConCod_Enabled = 1 ;
      edtPMDColCli_Jsonclick = "" ;
      edtPMDColCli_Enabled = 1 ;
      edtPMDValFch_Jsonclick = "" ;
      edtPMDValFch_Enabled = 1 ;
      edtPMDDtoAca_Jsonclick = "" ;
      edtPMDDtoAca_Enabled = 1 ;
      edtPMDDtoTin_Jsonclick = "" ;
      edtPMDDtoTin_Enabled = 1 ;
      edtPMDEntKgm_Jsonclick = "" ;
      edtPMDEntKgm_Enabled = 1 ;
      edtPMDPreKgm_Jsonclick = "" ;
      edtPMDPreKgm_Enabled = 1 ;
      edtPMDColNom_Jsonclick = "" ;
      edtPMDColNom_Enabled = 0 ;
      edtPMDColNum_Jsonclick = "" ;
      edtPMDColNum_Enabled = 1 ;
      edtPMDDsc_Jsonclick = "" ;
      edtPMDDsc_Enabled = 0 ;
      edtPMDCod_Jsonclick = "" ;
      edtPMDCod_Enabled = 1 ;
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

   public void gx1asapmdcolnom1VG1159( String A396EmprCod ,
                                       int A252CliCod ,
                                       int A8531PMDConCod )
   {
      GXt_char1 = A8394PMDColNom ;
      GXv_char2[0] = GXt_char1 ;
      new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char2) ;
      tpromd_lineas_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A8394PMDColNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8394PMDColNom", A8394PMDColNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8394PMDColNom))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
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
      /* Using cursor T01VG17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VG17_A407EmprNom[0] ;
      n407EmprNom = T01VG17_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(15);
      /* Using cursor T01VG18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01VG18_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(16);
      /* Using cursor T01VG19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ProMD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8392PMDDsc = T01VG19_A8392PMDDsc[0] ;
      n8392PMDDsc = T01VG19_n8392PMDDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8392PMDDsc", A8392PMDDsc);
      pr_default.close(17);
      GX_FocusControl = edtPMDPreKgm_Internalname ;
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
      /* Using cursor T01VG17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01VG17_A407EmprNom[0] ;
      n407EmprNom = T01VG17_n407EmprNom[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Clicod( )
   {
      /* Using cursor T01VG18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01VG18_A279CliNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Pmdcod( )
   {
      n8392PMDDsc = false ;
      /* Using cursor T01VG19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ProMD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A8392PMDDsc = T01VG19_A8392PMDDsc[0] ;
      n8392PMDDsc = T01VG19_n8392PMDDsc[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8392PMDDsc", GXutil.rtrim( A8392PMDDsc));
   }

   public void valid_Pmdcolnum( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8395PMDPreKgm", GXutil.ltrim( localUtil.ntoc( A8395PMDPreKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8396PMDEntKgm", GXutil.ltrim( localUtil.ntoc( A8396PMDEntKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8397PMDDtoTin", GXutil.ltrim( localUtil.ntoc( A8397PMDDtoTin, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8398PMDDtoAca", GXutil.ltrim( localUtil.ntoc( A8398PMDDtoAca, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8399PMDValFch", localUtil.format(A8399PMDValFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8530PMDColCli", GXutil.rtrim( A8530PMDColCli));
      httpContext.ajax_rsp_assign_attri("", false, "A8531PMDConCod", GXutil.ltrim( localUtil.ntoc( A8531PMDConCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8532PMDPreUni", GXutil.ltrim( localUtil.ntoc( A8532PMDPreUni, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8394PMDColNom", GXutil.rtrim( A8394PMDColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8392PMDDsc", GXutil.rtrim( A8392PMDDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8391PMDCod", GXutil.ltrim( localUtil.ntoc( Z8391PMDCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8393PMDColNum", GXutil.ltrim( localUtil.ntoc( Z8393PMDColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8395PMDPreKgm", GXutil.ltrim( localUtil.ntoc( Z8395PMDPreKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8396PMDEntKgm", GXutil.ltrim( localUtil.ntoc( Z8396PMDEntKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8397PMDDtoTin", GXutil.ltrim( localUtil.ntoc( Z8397PMDDtoTin, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8398PMDDtoAca", GXutil.ltrim( localUtil.ntoc( Z8398PMDDtoAca, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8399PMDValFch", localUtil.format(Z8399PMDValFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8530PMDColCli", GXutil.rtrim( Z8530PMDColCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8531PMDConCod", GXutil.ltrim( localUtil.ntoc( Z8531PMDConCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8532PMDPreUni", GXutil.ltrim( localUtil.ntoc( Z8532PMDPreUni, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8394PMDColNom", GXutil.rtrim( Z8394PMDColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8392PMDDsc", GXutil.rtrim( Z8392PMDDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Pmdconcod( )
   {
      GXt_char1 = A8394PMDColNom ;
      GXv_char2[0] = GXt_char1 ;
      new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char2) ;
      tpromd_lineas_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A8394PMDColNom = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8394PMDColNom", GXutil.rtrim( A8394PMDColNom));
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_PMDCOD","{handler:'valid_Pmdcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A8391PMDCod',fld:'PMDCOD',pic:'ZZZ9'},{av:'A8392PMDDsc',fld:'PMDDSC',pic:''}]");
      setEventMetadata("VALID_PMDCOD",",oparms:[{av:'A8392PMDDsc',fld:'PMDDSC',pic:''}]}");
      setEventMetadata("VALID_PMDCOLNUM","{handler:'valid_Pmdcolnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A8391PMDCod',fld:'PMDCOD',pic:'ZZZ9'},{av:'A8393PMDColNum',fld:'PMDCOLNUM',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PMDCOLNUM",",oparms:[{av:'A8395PMDPreKgm',fld:'PMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'A8396PMDEntKgm',fld:'PMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'A8397PMDDtoTin',fld:'PMDDTOTIN',pic:'ZZ9.99 '},{av:'A8398PMDDtoAca',fld:'PMDDTOACA',pic:'ZZ9.99'},{av:'A8399PMDValFch',fld:'PMDVALFCH',pic:''},{av:'A8530PMDColCli',fld:'PMDCOLCLI',pic:''},{av:'A8531PMDConCod',fld:'PMDCONCOD',pic:'ZZZZZ9'},{av:'A8532PMDPreUni',fld:'PMDPREUNI',pic:'ZZZZZZ9.999'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A8394PMDColNom',fld:'PMDCOLNOM',pic:''},{av:'A8392PMDDsc',fld:'PMDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z8391PMDCod'},{av:'Z8393PMDColNum'},{av:'Z8395PMDPreKgm'},{av:'Z8396PMDEntKgm'},{av:'Z8397PMDDtoTin'},{av:'Z8398PMDDtoAca'},{av:'Z8399PMDValFch'},{av:'Z8530PMDColCli'},{av:'Z8531PMDConCod'},{av:'Z8532PMDPreUni'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z8394PMDColNom'},{av:'Z8392PMDDsc'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_PMDCONCOD","{handler:'valid_Pmdconcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A8531PMDConCod',fld:'PMDCONCOD',pic:'ZZZZZ9'},{av:'A8394PMDColNom',fld:'PMDCOLNOM',pic:''}]");
      setEventMetadata("VALID_PMDCONCOD",",oparms:[{av:'A8394PMDColNom',fld:'PMDCOLNOM',pic:''}]}");
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
      Z8395PMDPreKgm = DecimalUtil.ZERO ;
      Z8396PMDEntKgm = DecimalUtil.ZERO ;
      Z8397PMDDtoTin = DecimalUtil.ZERO ;
      Z8398PMDDtoAca = DecimalUtil.ZERO ;
      Z8399PMDValFch = GXutil.nullDate() ;
      Z8530PMDColCli = "" ;
      Z8532PMDPreUni = DecimalUtil.ZERO ;
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
      A8392PMDDsc = "" ;
      A8394PMDColNom = "" ;
      A8395PMDPreKgm = DecimalUtil.ZERO ;
      A8396PMDEntKgm = DecimalUtil.ZERO ;
      A8397PMDDtoTin = DecimalUtil.ZERO ;
      A8398PMDDtoAca = DecimalUtil.ZERO ;
      A8399PMDValFch = GXutil.nullDate() ;
      A8530PMDColCli = "" ;
      A8532PMDPreUni = DecimalUtil.ZERO ;
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
      Z8392PMDDsc = "" ;
      T01VG7_A8393PMDColNum = new int[1] ;
      T01VG7_A407EmprNom = new String[] {""} ;
      T01VG7_n407EmprNom = new boolean[] {false} ;
      T01VG7_A279CliNom = new String[] {""} ;
      T01VG7_A8392PMDDsc = new String[] {""} ;
      T01VG7_n8392PMDDsc = new boolean[] {false} ;
      T01VG7_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG7_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG7_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG7_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG7_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01VG7_A8530PMDColCli = new String[] {""} ;
      T01VG7_A8531PMDConCod = new int[1] ;
      T01VG7_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG7_A396EmprCod = new String[] {""} ;
      T01VG7_A252CliCod = new int[1] ;
      T01VG7_A8391PMDCod = new short[1] ;
      T01VG4_A407EmprNom = new String[] {""} ;
      T01VG4_n407EmprNom = new boolean[] {false} ;
      T01VG5_A279CliNom = new String[] {""} ;
      T01VG6_A8392PMDDsc = new String[] {""} ;
      T01VG6_n8392PMDDsc = new boolean[] {false} ;
      T01VG8_A407EmprNom = new String[] {""} ;
      T01VG8_n407EmprNom = new boolean[] {false} ;
      T01VG9_A279CliNom = new String[] {""} ;
      T01VG10_A8392PMDDsc = new String[] {""} ;
      T01VG10_n8392PMDDsc = new boolean[] {false} ;
      T01VG11_A396EmprCod = new String[] {""} ;
      T01VG11_A252CliCod = new int[1] ;
      T01VG11_A8391PMDCod = new short[1] ;
      T01VG11_A8393PMDColNum = new int[1] ;
      T01VG3_A8393PMDColNum = new int[1] ;
      T01VG3_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG3_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG3_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG3_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG3_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01VG3_A8530PMDColCli = new String[] {""} ;
      T01VG3_A8531PMDConCod = new int[1] ;
      T01VG3_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG3_A396EmprCod = new String[] {""} ;
      T01VG3_A252CliCod = new int[1] ;
      T01VG3_A8391PMDCod = new short[1] ;
      sMode1159 = "" ;
      T01VG12_A396EmprCod = new String[] {""} ;
      T01VG12_A252CliCod = new int[1] ;
      T01VG12_A8391PMDCod = new short[1] ;
      T01VG12_A8393PMDColNum = new int[1] ;
      T01VG13_A396EmprCod = new String[] {""} ;
      T01VG13_A252CliCod = new int[1] ;
      T01VG13_A8391PMDCod = new short[1] ;
      T01VG13_A8393PMDColNum = new int[1] ;
      T01VG2_A8393PMDColNum = new int[1] ;
      T01VG2_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG2_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG2_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG2_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG2_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01VG2_A8530PMDColCli = new String[] {""} ;
      T01VG2_A8531PMDConCod = new int[1] ;
      T01VG2_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VG2_A396EmprCod = new String[] {""} ;
      T01VG2_A252CliCod = new int[1] ;
      T01VG2_A8391PMDCod = new short[1] ;
      T01VG17_A407EmprNom = new String[] {""} ;
      T01VG17_n407EmprNom = new boolean[] {false} ;
      T01VG18_A279CliNom = new String[] {""} ;
      T01VG19_A8392PMDDsc = new String[] {""} ;
      T01VG19_n8392PMDDsc = new boolean[] {false} ;
      T01VG20_A396EmprCod = new String[] {""} ;
      T01VG20_A252CliCod = new int[1] ;
      T01VG20_A8391PMDCod = new short[1] ;
      T01VG20_A8393PMDColNum = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z8394PMDColNom = "" ;
      ZZ396EmprCod = "" ;
      ZZ8395PMDPreKgm = DecimalUtil.ZERO ;
      ZZ8396PMDEntKgm = DecimalUtil.ZERO ;
      ZZ8397PMDDtoTin = DecimalUtil.ZERO ;
      ZZ8398PMDDtoAca = DecimalUtil.ZERO ;
      ZZ8399PMDValFch = GXutil.nullDate() ;
      ZZ8530PMDColCli = "" ;
      ZZ8532PMDPreUni = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ8394PMDColNom = "" ;
      ZZ8392PMDDsc = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_lineas_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_lineas_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_lineas_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_lineas_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_lineas_trn__default(),
         new Object[] {
             new Object[] {
            T01VG2_A8393PMDColNum, T01VG2_A8395PMDPreKgm, T01VG2_A8396PMDEntKgm, T01VG2_A8397PMDDtoTin, T01VG2_A8398PMDDtoAca, T01VG2_A8399PMDValFch, T01VG2_A8530PMDColCli, T01VG2_A8531PMDConCod, T01VG2_A8532PMDPreUni, T01VG2_A396EmprCod,
            T01VG2_A252CliCod, T01VG2_A8391PMDCod
            }
            , new Object[] {
            T01VG3_A8393PMDColNum, T01VG3_A8395PMDPreKgm, T01VG3_A8396PMDEntKgm, T01VG3_A8397PMDDtoTin, T01VG3_A8398PMDDtoAca, T01VG3_A8399PMDValFch, T01VG3_A8530PMDColCli, T01VG3_A8531PMDConCod, T01VG3_A8532PMDPreUni, T01VG3_A396EmprCod,
            T01VG3_A252CliCod, T01VG3_A8391PMDCod
            }
            , new Object[] {
            T01VG4_A407EmprNom, T01VG4_n407EmprNom
            }
            , new Object[] {
            T01VG5_A279CliNom
            }
            , new Object[] {
            T01VG6_A8392PMDDsc, T01VG6_n8392PMDDsc
            }
            , new Object[] {
            T01VG7_A8393PMDColNum, T01VG7_A407EmprNom, T01VG7_n407EmprNom, T01VG7_A279CliNom, T01VG7_A8392PMDDsc, T01VG7_n8392PMDDsc, T01VG7_A8395PMDPreKgm, T01VG7_A8396PMDEntKgm, T01VG7_A8397PMDDtoTin, T01VG7_A8398PMDDtoAca,
            T01VG7_A8399PMDValFch, T01VG7_A8530PMDColCli, T01VG7_A8531PMDConCod, T01VG7_A8532PMDPreUni, T01VG7_A396EmprCod, T01VG7_A252CliCod, T01VG7_A8391PMDCod
            }
            , new Object[] {
            T01VG8_A407EmprNom, T01VG8_n407EmprNom
            }
            , new Object[] {
            T01VG9_A279CliNom
            }
            , new Object[] {
            T01VG10_A8392PMDDsc, T01VG10_n8392PMDDsc
            }
            , new Object[] {
            T01VG11_A396EmprCod, T01VG11_A252CliCod, T01VG11_A8391PMDCod, T01VG11_A8393PMDColNum
            }
            , new Object[] {
            T01VG12_A396EmprCod, T01VG12_A252CliCod, T01VG12_A8391PMDCod, T01VG12_A8393PMDColNum
            }
            , new Object[] {
            T01VG13_A396EmprCod, T01VG13_A252CliCod, T01VG13_A8391PMDCod, T01VG13_A8393PMDColNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01VG17_A407EmprNom, T01VG17_n407EmprNom
            }
            , new Object[] {
            T01VG18_A279CliNom
            }
            , new Object[] {
            T01VG19_A8392PMDDsc, T01VG19_n8392PMDDsc
            }
            , new Object[] {
            T01VG20_A396EmprCod, T01VG20_A252CliCod, T01VG20_A8391PMDCod, T01VG20_A8393PMDColNum
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z8391PMDCod ;
   private short A8391PMDCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1159 ;
   private short nIsDirty_1159 ;
   private short ZZ8391PMDCod ;
   private int Z252CliCod ;
   private int Z8393PMDColNum ;
   private int Z8531PMDConCod ;
   private int A252CliCod ;
   private int A8531PMDConCod ;
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
   private int edtPMDCod_Enabled ;
   private int edtPMDDsc_Enabled ;
   private int A8393PMDColNum ;
   private int edtPMDColNum_Enabled ;
   private int edtPMDColNom_Enabled ;
   private int edtPMDPreKgm_Enabled ;
   private int edtPMDEntKgm_Enabled ;
   private int edtPMDDtoTin_Enabled ;
   private int edtPMDDtoAca_Enabled ;
   private int edtPMDValFch_Enabled ;
   private int edtPMDColCli_Enabled ;
   private int edtPMDConCod_Enabled ;
   private int edtPMDPreUni_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ252CliCod ;
   private int ZZ8393PMDColNum ;
   private int ZZ8531PMDConCod ;
   private java.math.BigDecimal Z8395PMDPreKgm ;
   private java.math.BigDecimal Z8396PMDEntKgm ;
   private java.math.BigDecimal Z8397PMDDtoTin ;
   private java.math.BigDecimal Z8398PMDDtoAca ;
   private java.math.BigDecimal Z8532PMDPreUni ;
   private java.math.BigDecimal A8395PMDPreKgm ;
   private java.math.BigDecimal A8396PMDEntKgm ;
   private java.math.BigDecimal A8397PMDDtoTin ;
   private java.math.BigDecimal A8398PMDDtoAca ;
   private java.math.BigDecimal A8532PMDPreUni ;
   private java.math.BigDecimal ZZ8395PMDPreKgm ;
   private java.math.BigDecimal ZZ8396PMDEntKgm ;
   private java.math.BigDecimal ZZ8397PMDDtoTin ;
   private java.math.BigDecimal ZZ8398PMDDtoAca ;
   private java.math.BigDecimal ZZ8532PMDPreUni ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z8530PMDColCli ;
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
   private String edtPMDCod_Internalname ;
   private String edtPMDCod_Jsonclick ;
   private String edtPMDDsc_Internalname ;
   private String A8392PMDDsc ;
   private String edtPMDDsc_Jsonclick ;
   private String edtPMDColNum_Internalname ;
   private String edtPMDColNum_Jsonclick ;
   private String edtPMDColNom_Internalname ;
   private String A8394PMDColNom ;
   private String edtPMDColNom_Jsonclick ;
   private String edtPMDPreKgm_Internalname ;
   private String edtPMDPreKgm_Jsonclick ;
   private String edtPMDEntKgm_Internalname ;
   private String edtPMDEntKgm_Jsonclick ;
   private String edtPMDDtoTin_Internalname ;
   private String edtPMDDtoTin_Jsonclick ;
   private String edtPMDDtoAca_Internalname ;
   private String edtPMDDtoAca_Jsonclick ;
   private String edtPMDValFch_Internalname ;
   private String edtPMDValFch_Jsonclick ;
   private String edtPMDColCli_Internalname ;
   private String A8530PMDColCli ;
   private String edtPMDColCli_Jsonclick ;
   private String edtPMDConCod_Internalname ;
   private String edtPMDConCod_Jsonclick ;
   private String edtPMDPreUni_Internalname ;
   private String edtPMDPreUni_Jsonclick ;
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
   private String Z8392PMDDsc ;
   private String sMode1159 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z8394PMDColNom ;
   private String ZZ396EmprCod ;
   private String ZZ8530PMDColCli ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ8394PMDColNom ;
   private String ZZ8392PMDDsc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date Z8399PMDValFch ;
   private java.util.Date A8399PMDValFch ;
   private java.util.Date ZZ8399PMDValFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n8392PMDDsc ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private int[] T01VG7_A8393PMDColNum ;
   private String[] T01VG7_A407EmprNom ;
   private boolean[] T01VG7_n407EmprNom ;
   private String[] T01VG7_A279CliNom ;
   private String[] T01VG7_A8392PMDDsc ;
   private boolean[] T01VG7_n8392PMDDsc ;
   private java.math.BigDecimal[] T01VG7_A8395PMDPreKgm ;
   private java.math.BigDecimal[] T01VG7_A8396PMDEntKgm ;
   private java.math.BigDecimal[] T01VG7_A8397PMDDtoTin ;
   private java.math.BigDecimal[] T01VG7_A8398PMDDtoAca ;
   private java.util.Date[] T01VG7_A8399PMDValFch ;
   private String[] T01VG7_A8530PMDColCli ;
   private int[] T01VG7_A8531PMDConCod ;
   private java.math.BigDecimal[] T01VG7_A8532PMDPreUni ;
   private String[] T01VG7_A396EmprCod ;
   private int[] T01VG7_A252CliCod ;
   private short[] T01VG7_A8391PMDCod ;
   private String[] T01VG4_A407EmprNom ;
   private boolean[] T01VG4_n407EmprNom ;
   private String[] T01VG5_A279CliNom ;
   private String[] T01VG6_A8392PMDDsc ;
   private boolean[] T01VG6_n8392PMDDsc ;
   private String[] T01VG8_A407EmprNom ;
   private boolean[] T01VG8_n407EmprNom ;
   private String[] T01VG9_A279CliNom ;
   private String[] T01VG10_A8392PMDDsc ;
   private boolean[] T01VG10_n8392PMDDsc ;
   private String[] T01VG11_A396EmprCod ;
   private int[] T01VG11_A252CliCod ;
   private short[] T01VG11_A8391PMDCod ;
   private int[] T01VG11_A8393PMDColNum ;
   private int[] T01VG3_A8393PMDColNum ;
   private java.math.BigDecimal[] T01VG3_A8395PMDPreKgm ;
   private java.math.BigDecimal[] T01VG3_A8396PMDEntKgm ;
   private java.math.BigDecimal[] T01VG3_A8397PMDDtoTin ;
   private java.math.BigDecimal[] T01VG3_A8398PMDDtoAca ;
   private java.util.Date[] T01VG3_A8399PMDValFch ;
   private String[] T01VG3_A8530PMDColCli ;
   private int[] T01VG3_A8531PMDConCod ;
   private java.math.BigDecimal[] T01VG3_A8532PMDPreUni ;
   private String[] T01VG3_A396EmprCod ;
   private int[] T01VG3_A252CliCod ;
   private short[] T01VG3_A8391PMDCod ;
   private String[] T01VG12_A396EmprCod ;
   private int[] T01VG12_A252CliCod ;
   private short[] T01VG12_A8391PMDCod ;
   private int[] T01VG12_A8393PMDColNum ;
   private String[] T01VG13_A396EmprCod ;
   private int[] T01VG13_A252CliCod ;
   private short[] T01VG13_A8391PMDCod ;
   private int[] T01VG13_A8393PMDColNum ;
   private int[] T01VG2_A8393PMDColNum ;
   private java.math.BigDecimal[] T01VG2_A8395PMDPreKgm ;
   private java.math.BigDecimal[] T01VG2_A8396PMDEntKgm ;
   private java.math.BigDecimal[] T01VG2_A8397PMDDtoTin ;
   private java.math.BigDecimal[] T01VG2_A8398PMDDtoAca ;
   private java.util.Date[] T01VG2_A8399PMDValFch ;
   private String[] T01VG2_A8530PMDColCli ;
   private int[] T01VG2_A8531PMDConCod ;
   private java.math.BigDecimal[] T01VG2_A8532PMDPreUni ;
   private String[] T01VG2_A396EmprCod ;
   private int[] T01VG2_A252CliCod ;
   private short[] T01VG2_A8391PMDCod ;
   private String[] T01VG17_A407EmprNom ;
   private boolean[] T01VG17_n407EmprNom ;
   private String[] T01VG18_A279CliNom ;
   private String[] T01VG19_A8392PMDDsc ;
   private boolean[] T01VG19_n8392PMDDsc ;
   private String[] T01VG20_A396EmprCod ;
   private int[] T01VG20_A252CliCod ;
   private short[] T01VG20_A8391PMDCod ;
   private int[] T01VG20_A8393PMDColNum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpromd_lineas_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpromd_lineas_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpromd_lineas_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpromd_lineas_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpromd_lineas_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01VG2", "SELECT PMDColNum, PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDDtoAca, PMDValFch, PMDColCli, PMDConCod, PMDPreUni, EmprCod, CliCod, PMDCod FROM TXPProMD1 WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ?  FOR UPDATE OF PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDDtoAca, PMDValFch, PMDColCli, PMDConCod, PMDPreUni NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VG3", "SELECT PMDColNum, PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDDtoAca, PMDValFch, PMDColCli, PMDConCod, PMDPreUni, EmprCod, CliCod, PMDCod FROM TXPProMD1 WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VG4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VG5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VG6", "SELECT PMDDsc FROM TXPProMD WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VG7", "SELECT /*+ FIRST_ROWS(100) */ TM1.PMDColNum, T2.EmprNom, T3.CliNom, T4.PMDDsc, TM1.PMDPreKgm, TM1.PMDEntKgm, TM1.PMDDtoTin, TM1.PMDDtoAca, TM1.PMDValFch, TM1.PMDColCli, TM1.PMDConCod, TM1.PMDPreUni, TM1.EmprCod, TM1.CliCod, TM1.PMDCod FROM (((TXPProMD1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPProMD T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.PMDCod = TM1.PMDCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.PMDCod = ? and TM1.PMDColNum = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.PMDCod, TM1.PMDColNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VG8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VG9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VG10", "SELECT PMDDsc FROM TXPProMD WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VG11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PMDCod, PMDColNum FROM TXPProMD1 WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VG12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PMDCod, PMDColNum FROM TXPProMD1 WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and PMDCod > ? or PMDCod = ? and CliCod = ? and EmprCod = ? and PMDColNum > ?) ORDER BY EmprCod, CliCod, PMDCod, PMDColNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VG13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PMDCod, PMDColNum FROM TXPProMD1 WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and PMDCod < ? or PMDCod = ? and CliCod = ? and EmprCod = ? and PMDColNum < ?) ORDER BY EmprCod DESC, CliCod DESC, PMDCod DESC, PMDColNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01VG14", "INSERT INTO TXPProMD1(PMDColNum, PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDDtoAca, PMDValFch, PMDColCli, PMDConCod, PMDPreUni, EmprCod, CliCod, PMDCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPProMD1")
         ,new UpdateCursor("T01VG15", "UPDATE TXPProMD1 SET PMDPreKgm=?, PMDEntKgm=?, PMDDtoTin=?, PMDDtoAca=?, PMDValFch=?, PMDColCli=?, PMDConCod=?, PMDPreUni=?  WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ?", GX_NOMASK, "TXPProMD1")
         ,new UpdateCursor("T01VG16", "DELETE FROM TXPProMD1  WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ?", GX_NOMASK, "TXPProMD1")
         ,new ForEachCursor("T01VG17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VG18", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VG19", "SELECT PMDDsc FROM TXPProMD WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VG20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, PMDCod, PMDColNum FROM TXPProMD1 ORDER BY EmprCod, CliCod, PMDCod, PMDColNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[14])[0] = rslt.getString(13, 3);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

