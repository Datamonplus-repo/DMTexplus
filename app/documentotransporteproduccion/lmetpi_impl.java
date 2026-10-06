package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lmetpi_impl extends GXDataArea
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
         A2809MetTerCod = httpContext.GetPar( "MetTerCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
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
         gxload_3( A396EmprCod, A2809MetTerCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = httpContext.GetPar( "MetTerCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
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
         gxload_4( A396EmprCod, A2809MetTerCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla LMETPI", ""), (short)(0)) ;
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

   public lmetpi_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lmetpi_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lmetpi_impl.class ));
   }

   public lmetpi_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla LMETPI", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetTerCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetTerCod_Internalname, httpContext.getMessage( "Terminal", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTerCod_Internalname, GXutil.rtrim( A2809MetTerCod), GXutil.rtrim( localUtil.format( A2809MetTerCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTerCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetTerCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetTotPie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetTotPie_Internalname, httpContext.getMessage( "Total Piezas Meradas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTotPie_Internalname, GXutil.ltrim( localUtil.ntoc( A2812MetTotPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetTotPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2812MetTotPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2812MetTotPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTotPie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetTotPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetTotMet_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetTotMet_Internalname, httpContext.getMessage( "Total Metros Metrados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTotMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2811MetTotMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetTotMet_Enabled!=0) ? localUtil.format( A2811MetTotMet, "ZZZZZ9.99") : localUtil.format( A2811MetTotMet, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTotMet_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetTotMet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetTotKil_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetTotKil_Internalname, httpContext.getMessage( "Total Kilos Metrados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTotKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2810MetTotKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetTotKil_Enabled!=0) ? localUtil.format( A2810MetTotKil, "ZZZZZ9.99") : localUtil.format( A2810MetTotKil, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTotKil_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetTotKil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieCod_Internalname, httpContext.getMessage( "Pieza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieCod_Internalname, GXutil.rtrim( A2813MetPieCod), GXutil.rtrim( localUtil.format( A2813MetPieCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieKil_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieKil_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieKil_Enabled!=0) ? localUtil.format( A2814MetPieKil, "ZZZZZ9.99") : localUtil.format( A2814MetPieKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieKil_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieKil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieMet_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieMet_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieMet_Enabled!=0) ? localUtil.format( A2815MetPieMet, "ZZZZZ9.99") : localUtil.format( A2815MetPieMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieMet_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieMet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieId_Internalname, httpContext.getMessage( "N Pieza Sistema Externo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieId_Internalname, GXutil.rtrim( A10784MetPieId), GXutil.rtrim( localUtil.format( A10784MetPieId, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieId_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPiectr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPiectr_Internalname, httpContext.getMessage( "Control", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPiectr_Internalname, GXutil.rtrim( A10780MetPiectr), GXutil.rtrim( localUtil.format( A10780MetPiectr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPiectr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPiectr_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieOb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieOb_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieOb_Internalname, GXutil.rtrim( A10779MetPieOb), GXutil.rtrim( localUtil.format( A10779MetPieOb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieOb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieOb_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieAnc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieAnc_Internalname, httpContext.getMessage( "Ancho Final", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieAnc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieAnc_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieFch_Internalname, httpContext.getMessage( "Fecha Pieza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMetPieFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieFch_Internalname, localUtil.format(A5136MetPieFch, "99/99/99"), localUtil.format( A5136MetPieFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieFch_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMetPieFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMetPieFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieDef_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieDef_Internalname, httpContext.getMessage( "Defecto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieDef_Internalname, GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieDef_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4909MetPieDef), "ZZZ") : localUtil.format( DecimalUtil.doubleToDec(A4909MetPieDef), "ZZZ"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieDef_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieDef_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieDsc_Internalname, httpContext.getMessage( "Descripcion Pieza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieDsc_Internalname, GXutil.rtrim( A2846MetPieDsc), GXutil.rtrim( localUtil.format( A2846MetPieDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieDsc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieEst_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieEst_Internalname, httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieEst_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieMtD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieMtD_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieMtD_Internalname, GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieMtD_Enabled!=0) ? localUtil.format( A4910MetPieMtD, "ZZZZ9.99") : localUtil.format( A4910MetPieMtD, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieMtD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieMtD_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\LMETPI.htm");
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
         Z2809MetTerCod = httpContext.cgiGet( "Z2809MetTerCod") ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z2813MetPieCod = httpContext.cgiGet( "Z2813MetPieCod") ;
         Z2814MetPieKil = localUtil.ctond( httpContext.cgiGet( "Z2814MetPieKil")) ;
         Z2815MetPieMet = localUtil.ctond( httpContext.cgiGet( "Z2815MetPieMet")) ;
         Z10784MetPieId = httpContext.cgiGet( "Z10784MetPieId") ;
         Z10780MetPiectr = httpContext.cgiGet( "Z10780MetPiectr") ;
         Z10779MetPieOb = httpContext.cgiGet( "Z10779MetPieOb") ;
         Z6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z6635MetPieAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5136MetPieFch = localUtil.ctod( httpContext.cgiGet( "Z5136MetPieFch"), 0) ;
         Z4909MetPieDef = (short)(localUtil.ctol( httpContext.cgiGet( "Z4909MetPieDef"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2846MetPieDsc = httpContext.cgiGet( "Z2846MetPieDsc") ;
         Z2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2816MetPieEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( "Z4910MetPieMtD")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
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
         A2812MetTotPie = (short)(localUtil.ctol( httpContext.cgiGet( edtMetTotPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A2811MetTotMet = localUtil.ctond( httpContext.cgiGet( edtMetTotMet_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = localUtil.ctond( httpContext.cgiGet( edtMetTotKil_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEKIL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMetPieKil_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2814MetPieKil = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
         }
         else
         {
            A2814MetPieKil = localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEMET");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMetPieMet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2815MetPieMet = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
         }
         else
         {
            A2815MetPieMet = localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
         }
         A10784MetPieId = httpContext.cgiGet( edtMetPieId_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10784MetPieId", A10784MetPieId);
         A10780MetPiectr = httpContext.cgiGet( edtMetPiectr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10780MetPiectr", A10780MetPiectr);
         A10779MetPieOb = httpContext.cgiGet( edtMetPieOb_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10779MetPieOb", A10779MetPieOb);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMetPieAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6635MetPieAnc = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6635MetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6635MetPieAnc), 3, 0));
         }
         else
         {
            A6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6635MetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6635MetPieAnc), 3, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtMetPieFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "METPIEFCH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMetPieFch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5136MetPieFch = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A5136MetPieFch", localUtil.format(A5136MetPieFch, "99/99/99"));
         }
         else
         {
            A5136MetPieFch = localUtil.ctod( httpContext.cgiGet( edtMetPieFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5136MetPieFch", localUtil.format(A5136MetPieFch, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEDEF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMetPieDef_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4909MetPieDef = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4909MetPieDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4909MetPieDef), 3, 0));
         }
         else
         {
            A4909MetPieDef = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4909MetPieDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4909MetPieDef), 3, 0));
         }
         A2846MetPieDsc = httpContext.cgiGet( edtMetPieDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2846MetPieDsc", A2846MetPieDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEEST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMetPieEst_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2816MetPieEst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.str( A2816MetPieEst, 1, 0));
         }
         else
         {
            A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.str( A2816MetPieEst, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEMTD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMetPieMtD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4910MetPieMtD = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A4910MetPieMtD", GXutil.ltrimstr( A4910MetPieMtD, 8, 2));
         }
         else
         {
            A4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4910MetPieMtD", GXutil.ltrimstr( A4910MetPieMtD, 8, 2));
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
            A2809MetTerCod = httpContext.GetPar( "MetTerCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2813MetPieCod = httpContext.GetPar( "MetPieCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
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
            initAll1V4413( ) ;
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
      disableAttributes1V4413( ) ;
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

   public void resetCaption1V40( )
   {
   }

   public void zm1V4413( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2814MetPieKil = T01V43_A2814MetPieKil[0] ;
            Z2815MetPieMet = T01V43_A2815MetPieMet[0] ;
            Z10784MetPieId = T01V43_A10784MetPieId[0] ;
            Z10780MetPiectr = T01V43_A10780MetPiectr[0] ;
            Z10779MetPieOb = T01V43_A10779MetPieOb[0] ;
            Z6635MetPieAnc = T01V43_A6635MetPieAnc[0] ;
            Z5136MetPieFch = T01V43_A5136MetPieFch[0] ;
            Z4909MetPieDef = T01V43_A4909MetPieDef[0] ;
            Z2846MetPieDsc = T01V43_A2846MetPieDsc[0] ;
            Z2816MetPieEst = T01V43_A2816MetPieEst[0] ;
            Z4910MetPieMtD = T01V43_A4910MetPieMtD[0] ;
         }
         else
         {
            Z2814MetPieKil = A2814MetPieKil ;
            Z2815MetPieMet = A2815MetPieMet ;
            Z10784MetPieId = A10784MetPieId ;
            Z10780MetPiectr = A10780MetPiectr ;
            Z10779MetPieOb = A10779MetPieOb ;
            Z6635MetPieAnc = A6635MetPieAnc ;
            Z5136MetPieFch = A5136MetPieFch ;
            Z4909MetPieDef = A4909MetPieDef ;
            Z2846MetPieDsc = A2846MetPieDsc ;
            Z2816MetPieEst = A2816MetPieEst ;
            Z4910MetPieMtD = A4910MetPieMtD ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z2813MetPieCod = A2813MetPieCod ;
         Z2814MetPieKil = A2814MetPieKil ;
         Z2815MetPieMet = A2815MetPieMet ;
         Z10784MetPieId = A10784MetPieId ;
         Z10780MetPiectr = A10780MetPiectr ;
         Z10779MetPieOb = A10779MetPieOb ;
         Z6635MetPieAnc = A6635MetPieAnc ;
         Z5136MetPieFch = A5136MetPieFch ;
         Z4909MetPieDef = A4909MetPieDef ;
         Z2846MetPieDsc = A2846MetPieDsc ;
         Z2816MetPieEst = A2816MetPieEst ;
         Z4910MetPieMtD = A4910MetPieMtD ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z407EmprNom = A407EmprNom ;
         Z2811MetTotMet = A2811MetTotMet ;
         Z2810MetTotKil = A2810MetTotKil ;
         Z2812MetTotPie = A2812MetTotPie ;
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

   public void load1V4413( )
   {
      /* Using cursor T01V49 */
      pr_default.execute(5, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A407EmprNom = T01V49_A407EmprNom[0] ;
         n407EmprNom = T01V49_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2814MetPieKil = T01V49_A2814MetPieKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
         A2815MetPieMet = T01V49_A2815MetPieMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
         A10784MetPieId = T01V49_A10784MetPieId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10784MetPieId", A10784MetPieId);
         A10780MetPiectr = T01V49_A10780MetPiectr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10780MetPiectr", A10780MetPiectr);
         A10779MetPieOb = T01V49_A10779MetPieOb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10779MetPieOb", A10779MetPieOb);
         A6635MetPieAnc = T01V49_A6635MetPieAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6635MetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6635MetPieAnc), 3, 0));
         A5136MetPieFch = T01V49_A5136MetPieFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5136MetPieFch", localUtil.format(A5136MetPieFch, "99/99/99"));
         A4909MetPieDef = T01V49_A4909MetPieDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4909MetPieDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4909MetPieDef), 3, 0));
         A2846MetPieDsc = T01V49_A2846MetPieDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2846MetPieDsc", A2846MetPieDsc);
         A2816MetPieEst = T01V49_A2816MetPieEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.str( A2816MetPieEst, 1, 0));
         A4910MetPieMtD = T01V49_A4910MetPieMtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4910MetPieMtD", GXutil.ltrimstr( A4910MetPieMtD, 8, 2));
         A2811MetTotMet = T01V49_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = T01V49_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = T01V49_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         zm1V4413( -1) ;
      }
      pr_default.close(5);
      onLoadActions1V4413( ) ;
   }

   public void onLoadActions1V4413( )
   {
   }

   public void checkExtendedTable1V4413( )
   {
      nIsDirty_413 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01V44 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01V44_A407EmprNom[0] ;
      n407EmprNom = T01V44_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01V45 */
      pr_default.execute(3, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      /* Using cursor T01V47 */
      pr_default.execute(4, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A2811MetTotMet = T01V47_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = T01V47_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = T01V47_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         nIsDirty_413 = (short)(1) ;
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         nIsDirty_413 = (short)(1) ;
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         nIsDirty_413 = (short)(1) ;
         A2812MetTotPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1V4413( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01V410 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01V410_A407EmprNom[0] ;
      n407EmprNom = T01V410_n407EmprNom[0] ;
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

   public void gxload_3( String A396EmprCod ,
                         String A2809MetTerCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01V411 */
      pr_default.execute(7, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_4( String A396EmprCod ,
                         String A2809MetTerCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01V413 */
      pr_default.execute(8, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A2811MetTotMet = T01V413_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = T01V413_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = T01V413_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2811MetTotMet, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2810MetTotKil, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2812MetTotPie, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1V4413( )
   {
      /* Using cursor T01V414 */
      pr_default.execute(9, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound413 = (short)(1) ;
      }
      else
      {
         RcdFound413 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01V43 */
      pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1V4413( 1) ;
         RcdFound413 = (short)(1) ;
         A2813MetPieCod = T01V43_A2813MetPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
         A2814MetPieKil = T01V43_A2814MetPieKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
         A2815MetPieMet = T01V43_A2815MetPieMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
         A10784MetPieId = T01V43_A10784MetPieId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10784MetPieId", A10784MetPieId);
         A10780MetPiectr = T01V43_A10780MetPiectr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10780MetPiectr", A10780MetPiectr);
         A10779MetPieOb = T01V43_A10779MetPieOb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10779MetPieOb", A10779MetPieOb);
         A6635MetPieAnc = T01V43_A6635MetPieAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6635MetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6635MetPieAnc), 3, 0));
         A5136MetPieFch = T01V43_A5136MetPieFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5136MetPieFch", localUtil.format(A5136MetPieFch, "99/99/99"));
         A4909MetPieDef = T01V43_A4909MetPieDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4909MetPieDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4909MetPieDef), 3, 0));
         A2846MetPieDsc = T01V43_A2846MetPieDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2846MetPieDsc", A2846MetPieDsc);
         A2816MetPieEst = T01V43_A2816MetPieEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.str( A2816MetPieEst, 1, 0));
         A4910MetPieMtD = T01V43_A4910MetPieMtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4910MetPieMtD", GXutil.ltrimstr( A4910MetPieMtD, 8, 2));
         A396EmprCod = T01V43_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01V43_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01V43_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01V43_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2809MetTerCod = T01V43_A2809MetTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         Z396EmprCod = A396EmprCod ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1V4413( ) ;
         if ( AnyError == 1 )
         {
            RcdFound413 = (short)(0) ;
            initializeNonKey1V4413( ) ;
         }
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound413 = (short)(0) ;
         initializeNonKey1V4413( ) ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1V4413( ) ;
      if ( RcdFound413 == 0 )
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
      RcdFound413 = (short)(0) ;
      /* Using cursor T01V415 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, A2809MetTerCod, A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A2813MetPieCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01V415_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01V415_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V415_A2809MetTerCod[0], A2809MetTerCod) < 0 ) || ( GXutil.strcmp(T01V415_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V415_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V415_A129BarCod[0] < A129BarCod ) || ( T01V415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01V415_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V415_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V415_A132BarCodReo[0] < A132BarCodReo ) || ( T01V415_A132BarCodReo[0] == A132BarCodReo ) && ( T01V415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01V415_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V415_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V415_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01V415_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01V415_A132BarCodReo[0] == A132BarCodReo ) && ( T01V415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01V415_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V415_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V415_A2813MetPieCod[0], A2813MetPieCod) < 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01V415_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01V415_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V415_A2809MetTerCod[0], A2809MetTerCod) > 0 ) || ( GXutil.strcmp(T01V415_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V415_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V415_A129BarCod[0] > A129BarCod ) || ( T01V415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01V415_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V415_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V415_A132BarCodReo[0] > A132BarCodReo ) || ( T01V415_A132BarCodReo[0] == A132BarCodReo ) && ( T01V415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01V415_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V415_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V415_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01V415_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01V415_A132BarCodReo[0] == A132BarCodReo ) && ( T01V415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01V415_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V415_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V415_A2813MetPieCod[0], A2813MetPieCod) > 0 ) ) )
         {
            A396EmprCod = T01V415_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2809MetTerCod = T01V415_A2809MetTerCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = T01V415_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01V415_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01V415_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2813MetPieCod = T01V415_A2813MetPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
            RcdFound413 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound413 = (short)(0) ;
      /* Using cursor T01V416 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, A2809MetTerCod, A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A2813MetPieCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01V416_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01V416_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V416_A2809MetTerCod[0], A2809MetTerCod) > 0 ) || ( GXutil.strcmp(T01V416_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V416_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V416_A129BarCod[0] > A129BarCod ) || ( T01V416_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01V416_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V416_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V416_A132BarCodReo[0] > A132BarCodReo ) || ( T01V416_A132BarCodReo[0] == A132BarCodReo ) && ( T01V416_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01V416_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V416_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V416_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01V416_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01V416_A132BarCodReo[0] == A132BarCodReo ) && ( T01V416_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01V416_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V416_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V416_A2813MetPieCod[0], A2813MetPieCod) > 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01V416_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01V416_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V416_A2809MetTerCod[0], A2809MetTerCod) < 0 ) || ( GXutil.strcmp(T01V416_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V416_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V416_A129BarCod[0] < A129BarCod ) || ( T01V416_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01V416_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V416_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V416_A132BarCodReo[0] < A132BarCodReo ) || ( T01V416_A132BarCodReo[0] == A132BarCodReo ) && ( T01V416_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01V416_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V416_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V416_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01V416_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01V416_A132BarCodReo[0] == A132BarCodReo ) && ( T01V416_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01V416_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01V416_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01V416_A2813MetPieCod[0], A2813MetPieCod) < 0 ) ) )
         {
            A396EmprCod = T01V416_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2809MetTerCod = T01V416_A2809MetTerCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = T01V416_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01V416_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01V416_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2813MetPieCod = T01V416_A2813MetPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
            RcdFound413 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1V4413( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1V4413( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound413 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A2813MetPieCod, Z2813MetPieCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A2809MetTerCod = Z2809MetTerCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2813MetPieCod = Z2813MetPieCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
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
               update1V4413( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A2813MetPieCod, Z2813MetPieCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1V4413( ) ;
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
                  insert1V4413( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A2813MetPieCod, Z2813MetPieCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = Z2809MetTerCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2813MetPieCod = Z2813MetPieCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
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
      if ( RcdFound413 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMetPieKil_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1V4413( ) ;
      if ( RcdFound413 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMetPieKil_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1V4413( ) ;
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
      if ( RcdFound413 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMetPieKil_Internalname ;
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
      if ( RcdFound413 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMetPieKil_Internalname ;
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
      scanStart1V4413( ) ;
      if ( RcdFound413 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound413 != 0 )
         {
            scanNext1V4413( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMetPieKil_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1V4413( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1V4413( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01V42 */
         pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2814MetPieKil, T01V42_A2814MetPieKil[0]) != 0 ) || ( DecimalUtil.compareTo(Z2815MetPieMet, T01V42_A2815MetPieMet[0]) != 0 ) || ( GXutil.strcmp(Z10784MetPieId, T01V42_A10784MetPieId[0]) != 0 ) || ( GXutil.strcmp(Z10780MetPiectr, T01V42_A10780MetPiectr[0]) != 0 ) || ( GXutil.strcmp(Z10779MetPieOb, T01V42_A10779MetPieOb[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6635MetPieAnc != T01V42_A6635MetPieAnc[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z5136MetPieFch), GXutil.resetTime(T01V42_A5136MetPieFch[0])) ) || ( Z4909MetPieDef != T01V42_A4909MetPieDef[0] ) || ( GXutil.strcmp(Z2846MetPieDsc, T01V42_A2846MetPieDsc[0]) != 0 ) || ( Z2816MetPieEst != T01V42_A2816MetPieEst[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4910MetPieMtD, T01V42_A4910MetPieMtD[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z2814MetPieKil, T01V42_A2814MetPieKil[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.lmetpi:[seudo value changed for attri]"+"MetPieKil");
               GXutil.writeLogRaw("Old: ",Z2814MetPieKil);
               GXutil.writeLogRaw("Current: ",T01V42_A2814MetPieKil[0]);
            }
            if ( DecimalUtil.compareTo(Z2815MetPieMet, T01V42_A2815MetPieMet[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.lmetpi:[seudo value changed for attri]"+"MetPieMet");
               GXutil.writeLogRaw("Old: ",Z2815MetPieMet);
               GXutil.writeLogRaw("Current: ",T01V42_A2815MetPieMet[0]);
            }
            if ( GXutil.strcmp(Z10784MetPieId, T01V42_A10784MetPieId[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.lmetpi:[seudo value changed for attri]"+"MetPieId");
               GXutil.writeLogRaw("Old: ",Z10784MetPieId);
               GXutil.writeLogRaw("Current: ",T01V42_A10784MetPieId[0]);
            }
            if ( GXutil.strcmp(Z10780MetPiectr, T01V42_A10780MetPiectr[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.lmetpi:[seudo value changed for attri]"+"MetPiectr");
               GXutil.writeLogRaw("Old: ",Z10780MetPiectr);
               GXutil.writeLogRaw("Current: ",T01V42_A10780MetPiectr[0]);
            }
            if ( GXutil.strcmp(Z10779MetPieOb, T01V42_A10779MetPieOb[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.lmetpi:[seudo value changed for attri]"+"MetPieOb");
               GXutil.writeLogRaw("Old: ",Z10779MetPieOb);
               GXutil.writeLogRaw("Current: ",T01V42_A10779MetPieOb[0]);
            }
            if ( Z6635MetPieAnc != T01V42_A6635MetPieAnc[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.lmetpi:[seudo value changed for attri]"+"MetPieAnc");
               GXutil.writeLogRaw("Old: ",Z6635MetPieAnc);
               GXutil.writeLogRaw("Current: ",T01V42_A6635MetPieAnc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5136MetPieFch), GXutil.resetTime(T01V42_A5136MetPieFch[0])) ) )
            {
               GXutil.writeLogln("documentotransporteproduccion.lmetpi:[seudo value changed for attri]"+"MetPieFch");
               GXutil.writeLogRaw("Old: ",Z5136MetPieFch);
               GXutil.writeLogRaw("Current: ",T01V42_A5136MetPieFch[0]);
            }
            if ( Z4909MetPieDef != T01V42_A4909MetPieDef[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.lmetpi:[seudo value changed for attri]"+"MetPieDef");
               GXutil.writeLogRaw("Old: ",Z4909MetPieDef);
               GXutil.writeLogRaw("Current: ",T01V42_A4909MetPieDef[0]);
            }
            if ( GXutil.strcmp(Z2846MetPieDsc, T01V42_A2846MetPieDsc[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.lmetpi:[seudo value changed for attri]"+"MetPieDsc");
               GXutil.writeLogRaw("Old: ",Z2846MetPieDsc);
               GXutil.writeLogRaw("Current: ",T01V42_A2846MetPieDsc[0]);
            }
            if ( Z2816MetPieEst != T01V42_A2816MetPieEst[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.lmetpi:[seudo value changed for attri]"+"MetPieEst");
               GXutil.writeLogRaw("Old: ",Z2816MetPieEst);
               GXutil.writeLogRaw("Current: ",T01V42_A2816MetPieEst[0]);
            }
            if ( DecimalUtil.compareTo(Z4910MetPieMtD, T01V42_A4910MetPieMtD[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.lmetpi:[seudo value changed for attri]"+"MetPieMtD");
               GXutil.writeLogRaw("Old: ",Z4910MetPieMtD);
               GXutil.writeLogRaw("Current: ",T01V42_A4910MetPieMtD[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMETPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1V4413( )
   {
      beforeValidate1V4413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1V4413( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1V4413( 0) ;
         checkOptimisticConcurrency1V4413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1V4413( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1V4413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01V417 */
                  pr_default.execute(12, new Object[] {A2813MetPieCod, A2814MetPieKil, A2815MetPieMet, A10784MetPieId, A10780MetPiectr, A10779MetPieOb, Short.valueOf(A6635MetPieAnc), A5136MetPieFch, Short.valueOf(A4909MetPieDef), A2846MetPieDsc, Byte.valueOf(A2816MetPieEst), A4910MetPieMtD, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2809MetTerCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
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
                        resetCaption1V40( ) ;
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
            load1V4413( ) ;
         }
         endLevel1V4413( ) ;
      }
      closeExtendedTableCursors1V4413( ) ;
   }

   public void update1V4413( )
   {
      beforeValidate1V4413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1V4413( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1V4413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1V4413( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1V4413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01V418 */
                  pr_default.execute(13, new Object[] {A2814MetPieKil, A2815MetPieMet, A10784MetPieId, A10780MetPiectr, A10779MetPieOb, Short.valueOf(A6635MetPieAnc), A5136MetPieFch, Short.valueOf(A4909MetPieDef), A2846MetPieDsc, Byte.valueOf(A2816MetPieEst), A4910MetPieMtD, A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1V4413( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1V40( ) ;
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
         endLevel1V4413( ) ;
      }
      closeExtendedTableCursors1V4413( ) ;
   }

   public void deferredUpdate1V4413( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1V4413( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1V4413( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1V4413( ) ;
         afterConfirm1V4413( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1V4413( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01V419 */
               pr_default.execute(14, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound413 == 0 )
                     {
                        initAll1V4413( ) ;
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
                     resetCaption1V40( ) ;
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
      sMode413 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1V4413( ) ;
      Gx_mode = sMode413 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1V4413( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01V420 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         A407EmprNom = T01V420_A407EmprNom[0] ;
         n407EmprNom = T01V420_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(15);
         /* Using cursor T01V422 */
         pr_default.execute(16, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            A2811MetTotMet = T01V422_A2811MetTotMet[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            A2810MetTotKil = T01V422_A2810MetTotKil[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            A2812MetTotPie = T01V422_A2812MetTotPie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         else
         {
            A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            A2812MetTotPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         pr_default.close(16);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01V423 */
         pr_default.execute(17, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void endLevel1V4413( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1V4413( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.lmetpi");
         if ( AnyError == 0 )
         {
            confirmValues1V40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.lmetpi");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1V4413( )
   {
      /* Using cursor T01V424 */
      pr_default.execute(18);
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A396EmprCod = T01V424_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = T01V424_A2809MetTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = T01V424_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01V424_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01V424_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2813MetPieCod = T01V424_A2813MetPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1V4413( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A396EmprCod = T01V424_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = T01V424_A2809MetTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = T01V424_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01V424_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01V424_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2813MetPieCod = T01V424_A2813MetPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
      }
   }

   public void scanEnd1V4413( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1V4413( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1V4413( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1V4413( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1V4413( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1V4413( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1V4413( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1V4413( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMetTerCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTerCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTerCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtMetTotPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTotPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTotPie_Enabled), 5, 0), true);
      edtMetTotMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTotMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTotMet_Enabled), 5, 0), true);
      edtMetTotKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTotKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTotKil_Enabled), 5, 0), true);
      edtMetPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), true);
      edtMetPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Enabled), 5, 0), true);
      edtMetPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Enabled), 5, 0), true);
      edtMetPieId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieId_Enabled), 5, 0), true);
      edtMetPiectr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPiectr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPiectr_Enabled), 5, 0), true);
      edtMetPieOb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieOb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieOb_Enabled), 5, 0), true);
      edtMetPieAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieAnc_Enabled), 5, 0), true);
      edtMetPieFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieFch_Enabled), 5, 0), true);
      edtMetPieDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDef_Enabled), 5, 0), true);
      edtMetPieDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDsc_Enabled), 5, 0), true);
      edtMetPieEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieEst_Enabled), 5, 0), true);
      edtMetPieMtD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMtD_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1V4413( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1V40( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.lmetpi", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2809MetTerCod", GXutil.rtrim( Z2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2813MetPieCod", GXutil.rtrim( Z2813MetPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2814MetPieKil", GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2815MetPieMet", GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10784MetPieId", GXutil.rtrim( Z10784MetPieId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10780MetPiectr", GXutil.rtrim( Z10780MetPiectr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10779MetPieOb", GXutil.rtrim( Z10779MetPieOb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6635MetPieAnc", GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5136MetPieFch", localUtil.dtoc( Z5136MetPieFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4909MetPieDef", GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2846MetPieDsc", GXutil.rtrim( Z2846MetPieDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2816MetPieEst", GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4910MetPieMtD", GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.documentotransporteproduccion.lmetpi", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteProduccion.LMETPI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla LMETPI", "") ;
   }

   public void initializeNonKey1V4413( )
   {
      A2811MetTotMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      A2810MetTotKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      A2812MetTotPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A2814MetPieKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
      A2815MetPieMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
      A10784MetPieId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10784MetPieId", A10784MetPieId);
      A10780MetPiectr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10780MetPiectr", A10780MetPiectr);
      A10779MetPieOb = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10779MetPieOb", A10779MetPieOb);
      A6635MetPieAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6635MetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6635MetPieAnc), 3, 0));
      A5136MetPieFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A5136MetPieFch", localUtil.format(A5136MetPieFch, "99/99/99"));
      A4909MetPieDef = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4909MetPieDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4909MetPieDef), 3, 0));
      A2846MetPieDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2846MetPieDsc", A2846MetPieDsc);
      A2816MetPieEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.str( A2816MetPieEst, 1, 0));
      A4910MetPieMtD = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4910MetPieMtD", GXutil.ltrimstr( A4910MetPieMtD, 8, 2));
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z10784MetPieId = "" ;
      Z10780MetPiectr = "" ;
      Z10779MetPieOb = "" ;
      Z6635MetPieAnc = (short)(0) ;
      Z5136MetPieFch = GXutil.nullDate() ;
      Z4909MetPieDef = (short)(0) ;
      Z2846MetPieDsc = "" ;
      Z2816MetPieEst = (byte)(0) ;
      Z4910MetPieMtD = DecimalUtil.ZERO ;
   }

   public void initAll1V4413( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A2809MetTerCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2813MetPieCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
      initializeNonKey1V4413( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415123642", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/lmetpi.js", "?202682415123643", false, true);
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
      edtMetTerCod_Internalname = "METTERCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtMetTotPie_Internalname = "METTOTPIE" ;
      edtMetTotMet_Internalname = "METTOTMET" ;
      edtMetTotKil_Internalname = "METTOTKIL" ;
      edtMetPieCod_Internalname = "METPIECOD" ;
      edtMetPieKil_Internalname = "METPIEKIL" ;
      edtMetPieMet_Internalname = "METPIEMET" ;
      edtMetPieId_Internalname = "METPIEID" ;
      edtMetPiectr_Internalname = "METPIECTR" ;
      edtMetPieOb_Internalname = "METPIEOB" ;
      edtMetPieAnc_Internalname = "METPIEANC" ;
      edtMetPieFch_Internalname = "METPIEFCH" ;
      edtMetPieDef_Internalname = "METPIEDEF" ;
      edtMetPieDsc_Internalname = "METPIEDSC" ;
      edtMetPieEst_Internalname = "METPIEEST" ;
      edtMetPieMtD_Internalname = "METPIEMTD" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla LMETPI", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMetPieMtD_Jsonclick = "" ;
      edtMetPieMtD_Enabled = 1 ;
      edtMetPieEst_Jsonclick = "" ;
      edtMetPieEst_Enabled = 1 ;
      edtMetPieDsc_Jsonclick = "" ;
      edtMetPieDsc_Enabled = 1 ;
      edtMetPieDef_Jsonclick = "" ;
      edtMetPieDef_Enabled = 1 ;
      edtMetPieFch_Jsonclick = "" ;
      edtMetPieFch_Enabled = 1 ;
      edtMetPieAnc_Jsonclick = "" ;
      edtMetPieAnc_Enabled = 1 ;
      edtMetPieOb_Jsonclick = "" ;
      edtMetPieOb_Enabled = 1 ;
      edtMetPiectr_Jsonclick = "" ;
      edtMetPiectr_Enabled = 1 ;
      edtMetPieId_Jsonclick = "" ;
      edtMetPieId_Enabled = 1 ;
      edtMetPieMet_Jsonclick = "" ;
      edtMetPieMet_Enabled = 1 ;
      edtMetPieKil_Jsonclick = "" ;
      edtMetPieKil_Enabled = 1 ;
      edtMetPieCod_Jsonclick = "" ;
      edtMetPieCod_Enabled = 1 ;
      edtMetTotKil_Jsonclick = "" ;
      edtMetTotKil_Enabled = 0 ;
      edtMetTotMet_Jsonclick = "" ;
      edtMetTotMet_Enabled = 0 ;
      edtMetTotPie_Jsonclick = "" ;
      edtMetTotPie_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtMetTerCod_Jsonclick = "" ;
      edtMetTerCod_Enabled = 1 ;
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
      /* Using cursor T01V420 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01V420_A407EmprNom[0] ;
      n407EmprNom = T01V420_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(15);
      /* Using cursor T01V425 */
      pr_default.execute(19, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(19);
      /* Using cursor T01V422 */
      pr_default.execute(16, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A2811MetTotMet = T01V422_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = T01V422_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = T01V422_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      pr_default.close(16);
      GX_FocusControl = edtMetPieKil_Internalname ;
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
      /* Using cursor T01V420 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01V420_A407EmprNom[0] ;
      n407EmprNom = T01V420_n407EmprNom[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Barcodpar( )
   {
      /* Using cursor T01V425 */
      pr_default.execute(19, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(19);
      /* Using cursor T01V422 */
      pr_default.execute(16, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A2811MetTotMet = T01V422_A2811MetTotMet[0] ;
         A2810MetTotKil = T01V422_A2810MetTotKil[0] ;
         A2812MetTotPie = T01V422_A2812MetTotPie[0] ;
      }
      else
      {
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
         A2812MetTotPie = (short)(0) ;
      }
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrim( localUtil.ntoc( A2811MetTotMet, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrim( localUtil.ntoc( A2810MetTotKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrim( localUtil.ntoc( A2812MetTotPie, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Metpiecod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10784MetPieId", GXutil.rtrim( A10784MetPieId));
      httpContext.ajax_rsp_assign_attri("", false, "A10780MetPiectr", GXutil.rtrim( A10780MetPiectr));
      httpContext.ajax_rsp_assign_attri("", false, "A10779MetPieOb", GXutil.rtrim( A10779MetPieOb));
      httpContext.ajax_rsp_assign_attri("", false, "A6635MetPieAnc", GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5136MetPieFch", localUtil.format(A5136MetPieFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4909MetPieDef", GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2846MetPieDsc", GXutil.rtrim( A2846MetPieDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4910MetPieMtD", GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrim( localUtil.ntoc( A2811MetTotMet, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrim( localUtil.ntoc( A2810MetTotKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrim( localUtil.ntoc( A2812MetTotPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2809MetTerCod", GXutil.rtrim( Z2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2813MetPieCod", GXutil.rtrim( Z2813MetPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2814MetPieKil", GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2815MetPieMet", GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10784MetPieId", GXutil.rtrim( Z10784MetPieId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10780MetPiectr", GXutil.rtrim( Z10780MetPiectr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10779MetPieOb", GXutil.rtrim( Z10779MetPieOb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6635MetPieAnc", GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5136MetPieFch", localUtil.format(Z5136MetPieFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4909MetPieDef", GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2846MetPieDsc", GXutil.rtrim( Z2846MetPieDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2816MetPieEst", GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4910MetPieMtD", GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2811MetTotMet", GXutil.ltrim( localUtil.ntoc( Z2811MetTotMet, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2810MetTotKil", GXutil.ltrim( localUtil.ntoc( Z2810MetTotKil, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2812MetTotPie", GXutil.ltrim( localUtil.ntoc( Z2812MetTotPie, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_METTERCOD","{handler:'valid_Mettercod',iparms:[]");
      setEventMetadata("VALID_METTERCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2811MetTotMet',fld:'METTOTMET',pic:'ZZZZZ9.99'},{av:'A2810MetTotKil',fld:'METTOTKIL',pic:'ZZZZZ9.99'},{av:'A2812MetTotPie',fld:'METTOTPIE',pic:'ZZZ9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A2811MetTotMet',fld:'METTOTMET',pic:'ZZZZZ9.99'},{av:'A2810MetTotKil',fld:'METTOTKIL',pic:'ZZZZZ9.99'},{av:'A2812MetTotPie',fld:'METTOTPIE',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_METPIECOD","{handler:'valid_Metpiecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_METPIECOD",",oparms:[{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'},{av:'A10784MetPieId',fld:'METPIEID',pic:''},{av:'A10780MetPiectr',fld:'METPIECTR',pic:''},{av:'A10779MetPieOb',fld:'METPIEOB',pic:''},{av:'A6635MetPieAnc',fld:'METPIEANC',pic:'ZZ9'},{av:'A5136MetPieFch',fld:'METPIEFCH',pic:''},{av:'A4909MetPieDef',fld:'METPIEDEF',pic:'ZZZ'},{av:'A2846MetPieDsc',fld:'METPIEDSC',pic:''},{av:'A2816MetPieEst',fld:'METPIEEST',pic:'9'},{av:'A4910MetPieMtD',fld:'METPIEMTD',pic:'ZZZZ9.99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2811MetTotMet',fld:'METTOTMET',pic:'ZZZZZ9.99'},{av:'A2810MetTotKil',fld:'METTOTKIL',pic:'ZZZZZ9.99'},{av:'A2812MetTotPie',fld:'METTOTPIE',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2809MetTerCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2813MetPieCod'},{av:'Z2814MetPieKil'},{av:'Z2815MetPieMet'},{av:'Z10784MetPieId'},{av:'Z10780MetPiectr'},{av:'Z10779MetPieOb'},{av:'Z6635MetPieAnc'},{av:'Z5136MetPieFch'},{av:'Z4909MetPieDef'},{av:'Z2846MetPieDsc'},{av:'Z2816MetPieEst'},{av:'Z4910MetPieMtD'},{av:'Z407EmprNom'},{av:'Z2811MetTotMet'},{av:'Z2810MetTotKil'},{av:'Z2812MetTotPie'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(15);
      pr_default.close(19);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z2809MetTerCod = "" ;
      Z130BarCodPar = "" ;
      Z2813MetPieCod = "" ;
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z10784MetPieId = "" ;
      Z10780MetPiectr = "" ;
      Z10779MetPieOb = "" ;
      Z5136MetPieFch = GXutil.nullDate() ;
      Z2846MetPieDsc = "" ;
      Z4910MetPieMtD = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
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
      A407EmprNom = "" ;
      A2811MetTotMet = DecimalUtil.ZERO ;
      A2810MetTotKil = DecimalUtil.ZERO ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A10784MetPieId = "" ;
      A10780MetPiectr = "" ;
      A10779MetPieOb = "" ;
      A5136MetPieFch = GXutil.nullDate() ;
      A2846MetPieDsc = "" ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
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
      Z2811MetTotMet = DecimalUtil.ZERO ;
      Z2810MetTotKil = DecimalUtil.ZERO ;
      T01V49_A2813MetPieCod = new String[] {""} ;
      T01V49_A407EmprNom = new String[] {""} ;
      T01V49_n407EmprNom = new boolean[] {false} ;
      T01V49_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V49_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V49_A10784MetPieId = new String[] {""} ;
      T01V49_A10780MetPiectr = new String[] {""} ;
      T01V49_A10779MetPieOb = new String[] {""} ;
      T01V49_A6635MetPieAnc = new short[1] ;
      T01V49_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01V49_A4909MetPieDef = new short[1] ;
      T01V49_A2846MetPieDsc = new String[] {""} ;
      T01V49_A2816MetPieEst = new byte[1] ;
      T01V49_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V49_A396EmprCod = new String[] {""} ;
      T01V49_A129BarCod = new int[1] ;
      T01V49_A132BarCodReo = new byte[1] ;
      T01V49_A130BarCodPar = new String[] {""} ;
      T01V49_A2809MetTerCod = new String[] {""} ;
      T01V49_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V49_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V49_A2812MetTotPie = new short[1] ;
      T01V44_A407EmprNom = new String[] {""} ;
      T01V44_n407EmprNom = new boolean[] {false} ;
      T01V45_A396EmprCod = new String[] {""} ;
      T01V47_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V47_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V47_A2812MetTotPie = new short[1] ;
      T01V410_A407EmprNom = new String[] {""} ;
      T01V410_n407EmprNom = new boolean[] {false} ;
      T01V411_A396EmprCod = new String[] {""} ;
      T01V413_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V413_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V413_A2812MetTotPie = new short[1] ;
      T01V414_A396EmprCod = new String[] {""} ;
      T01V414_A2809MetTerCod = new String[] {""} ;
      T01V414_A129BarCod = new int[1] ;
      T01V414_A132BarCodReo = new byte[1] ;
      T01V414_A130BarCodPar = new String[] {""} ;
      T01V414_A2813MetPieCod = new String[] {""} ;
      T01V43_A2813MetPieCod = new String[] {""} ;
      T01V43_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V43_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V43_A10784MetPieId = new String[] {""} ;
      T01V43_A10780MetPiectr = new String[] {""} ;
      T01V43_A10779MetPieOb = new String[] {""} ;
      T01V43_A6635MetPieAnc = new short[1] ;
      T01V43_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01V43_A4909MetPieDef = new short[1] ;
      T01V43_A2846MetPieDsc = new String[] {""} ;
      T01V43_A2816MetPieEst = new byte[1] ;
      T01V43_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V43_A396EmprCod = new String[] {""} ;
      T01V43_A129BarCod = new int[1] ;
      T01V43_A132BarCodReo = new byte[1] ;
      T01V43_A130BarCodPar = new String[] {""} ;
      T01V43_A2809MetTerCod = new String[] {""} ;
      sMode413 = "" ;
      T01V415_A396EmprCod = new String[] {""} ;
      T01V415_A2809MetTerCod = new String[] {""} ;
      T01V415_A129BarCod = new int[1] ;
      T01V415_A132BarCodReo = new byte[1] ;
      T01V415_A130BarCodPar = new String[] {""} ;
      T01V415_A2813MetPieCod = new String[] {""} ;
      T01V416_A396EmprCod = new String[] {""} ;
      T01V416_A2809MetTerCod = new String[] {""} ;
      T01V416_A129BarCod = new int[1] ;
      T01V416_A132BarCodReo = new byte[1] ;
      T01V416_A130BarCodPar = new String[] {""} ;
      T01V416_A2813MetPieCod = new String[] {""} ;
      T01V42_A2813MetPieCod = new String[] {""} ;
      T01V42_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V42_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V42_A10784MetPieId = new String[] {""} ;
      T01V42_A10780MetPiectr = new String[] {""} ;
      T01V42_A10779MetPieOb = new String[] {""} ;
      T01V42_A6635MetPieAnc = new short[1] ;
      T01V42_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01V42_A4909MetPieDef = new short[1] ;
      T01V42_A2846MetPieDsc = new String[] {""} ;
      T01V42_A2816MetPieEst = new byte[1] ;
      T01V42_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V42_A396EmprCod = new String[] {""} ;
      T01V42_A129BarCod = new int[1] ;
      T01V42_A132BarCodReo = new byte[1] ;
      T01V42_A130BarCodPar = new String[] {""} ;
      T01V42_A2809MetTerCod = new String[] {""} ;
      T01V420_A407EmprNom = new String[] {""} ;
      T01V420_n407EmprNom = new boolean[] {false} ;
      T01V422_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V422_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V422_A2812MetTotPie = new short[1] ;
      T01V423_A396EmprCod = new String[] {""} ;
      T01V423_A2809MetTerCod = new String[] {""} ;
      T01V423_A129BarCod = new int[1] ;
      T01V423_A132BarCodReo = new byte[1] ;
      T01V423_A130BarCodPar = new String[] {""} ;
      T01V423_A2813MetPieCod = new String[] {""} ;
      T01V423_A12995MetPieDfLi = new short[1] ;
      T01V424_A396EmprCod = new String[] {""} ;
      T01V424_A2809MetTerCod = new String[] {""} ;
      T01V424_A129BarCod = new int[1] ;
      T01V424_A132BarCodReo = new byte[1] ;
      T01V424_A130BarCodPar = new String[] {""} ;
      T01V424_A2813MetPieCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01V425_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ2809MetTerCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2813MetPieCod = "" ;
      ZZ2814MetPieKil = DecimalUtil.ZERO ;
      ZZ2815MetPieMet = DecimalUtil.ZERO ;
      ZZ10784MetPieId = "" ;
      ZZ10780MetPiectr = "" ;
      ZZ10779MetPieOb = "" ;
      ZZ5136MetPieFch = GXutil.nullDate() ;
      ZZ2846MetPieDsc = "" ;
      ZZ4910MetPieMtD = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ2811MetTotMet = DecimalUtil.ZERO ;
      ZZ2810MetTotKil = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.lmetpi__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.lmetpi__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.lmetpi__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.lmetpi__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.lmetpi__default(),
         new Object[] {
             new Object[] {
            T01V42_A2813MetPieCod, T01V42_A2814MetPieKil, T01V42_A2815MetPieMet, T01V42_A10784MetPieId, T01V42_A10780MetPiectr, T01V42_A10779MetPieOb, T01V42_A6635MetPieAnc, T01V42_A5136MetPieFch, T01V42_A4909MetPieDef, T01V42_A2846MetPieDsc,
            T01V42_A2816MetPieEst, T01V42_A4910MetPieMtD, T01V42_A396EmprCod, T01V42_A129BarCod, T01V42_A132BarCodReo, T01V42_A130BarCodPar, T01V42_A2809MetTerCod
            }
            , new Object[] {
            T01V43_A2813MetPieCod, T01V43_A2814MetPieKil, T01V43_A2815MetPieMet, T01V43_A10784MetPieId, T01V43_A10780MetPiectr, T01V43_A10779MetPieOb, T01V43_A6635MetPieAnc, T01V43_A5136MetPieFch, T01V43_A4909MetPieDef, T01V43_A2846MetPieDsc,
            T01V43_A2816MetPieEst, T01V43_A4910MetPieMtD, T01V43_A396EmprCod, T01V43_A129BarCod, T01V43_A132BarCodReo, T01V43_A130BarCodPar, T01V43_A2809MetTerCod
            }
            , new Object[] {
            T01V44_A407EmprNom, T01V44_n407EmprNom
            }
            , new Object[] {
            T01V45_A396EmprCod
            }
            , new Object[] {
            T01V47_A2811MetTotMet, T01V47_A2810MetTotKil, T01V47_A2812MetTotPie
            }
            , new Object[] {
            T01V49_A2813MetPieCod, T01V49_A407EmprNom, T01V49_n407EmprNom, T01V49_A2814MetPieKil, T01V49_A2815MetPieMet, T01V49_A10784MetPieId, T01V49_A10780MetPiectr, T01V49_A10779MetPieOb, T01V49_A6635MetPieAnc, T01V49_A5136MetPieFch,
            T01V49_A4909MetPieDef, T01V49_A2846MetPieDsc, T01V49_A2816MetPieEst, T01V49_A4910MetPieMtD, T01V49_A396EmprCod, T01V49_A129BarCod, T01V49_A132BarCodReo, T01V49_A130BarCodPar, T01V49_A2809MetTerCod, T01V49_A2811MetTotMet,
            T01V49_A2810MetTotKil, T01V49_A2812MetTotPie
            }
            , new Object[] {
            T01V410_A407EmprNom, T01V410_n407EmprNom
            }
            , new Object[] {
            T01V411_A396EmprCod
            }
            , new Object[] {
            T01V413_A2811MetTotMet, T01V413_A2810MetTotKil, T01V413_A2812MetTotPie
            }
            , new Object[] {
            T01V414_A396EmprCod, T01V414_A2809MetTerCod, T01V414_A129BarCod, T01V414_A132BarCodReo, T01V414_A130BarCodPar, T01V414_A2813MetPieCod
            }
            , new Object[] {
            T01V415_A396EmprCod, T01V415_A2809MetTerCod, T01V415_A129BarCod, T01V415_A132BarCodReo, T01V415_A130BarCodPar, T01V415_A2813MetPieCod
            }
            , new Object[] {
            T01V416_A396EmprCod, T01V416_A2809MetTerCod, T01V416_A129BarCod, T01V416_A132BarCodReo, T01V416_A130BarCodPar, T01V416_A2813MetPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01V420_A407EmprNom, T01V420_n407EmprNom
            }
            , new Object[] {
            T01V422_A2811MetTotMet, T01V422_A2810MetTotKil, T01V422_A2812MetTotPie
            }
            , new Object[] {
            T01V423_A396EmprCod, T01V423_A2809MetTerCod, T01V423_A129BarCod, T01V423_A132BarCodReo, T01V423_A130BarCodPar, T01V423_A2813MetPieCod, T01V423_A12995MetPieDfLi
            }
            , new Object[] {
            T01V424_A396EmprCod, T01V424_A2809MetTerCod, T01V424_A129BarCod, T01V424_A132BarCodReo, T01V424_A130BarCodPar, T01V424_A2813MetPieCod
            }
            , new Object[] {
            T01V425_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z2816MetPieEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A2816MetPieEst ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private byte ZZ2816MetPieEst ;
   private short Z6635MetPieAnc ;
   private short Z4909MetPieDef ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2812MetTotPie ;
   private short A6635MetPieAnc ;
   private short A4909MetPieDef ;
   private short Z2812MetTotPie ;
   private short RcdFound413 ;
   private short nIsDirty_413 ;
   private short ZZ6635MetPieAnc ;
   private short ZZ4909MetPieDef ;
   private short ZZ2812MetTotPie ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMetTerCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtMetTotPie_Enabled ;
   private int edtMetTotMet_Enabled ;
   private int edtMetTotKil_Enabled ;
   private int edtMetPieCod_Enabled ;
   private int edtMetPieKil_Enabled ;
   private int edtMetPieMet_Enabled ;
   private int edtMetPieId_Enabled ;
   private int edtMetPiectr_Enabled ;
   private int edtMetPieOb_Enabled ;
   private int edtMetPieAnc_Enabled ;
   private int edtMetPieFch_Enabled ;
   private int edtMetPieDef_Enabled ;
   private int edtMetPieDsc_Enabled ;
   private int edtMetPieEst_Enabled ;
   private int edtMetPieMtD_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ129BarCod ;
   private java.math.BigDecimal Z2814MetPieKil ;
   private java.math.BigDecimal Z2815MetPieMet ;
   private java.math.BigDecimal Z4910MetPieMtD ;
   private java.math.BigDecimal A2811MetTotMet ;
   private java.math.BigDecimal A2810MetTotKil ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal Z2811MetTotMet ;
   private java.math.BigDecimal Z2810MetTotKil ;
   private java.math.BigDecimal ZZ2814MetPieKil ;
   private java.math.BigDecimal ZZ2815MetPieMet ;
   private java.math.BigDecimal ZZ4910MetPieMtD ;
   private java.math.BigDecimal ZZ2811MetTotMet ;
   private java.math.BigDecimal ZZ2810MetTotKil ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z2809MetTerCod ;
   private String Z130BarCodPar ;
   private String Z2813MetPieCod ;
   private String Z10784MetPieId ;
   private String Z10780MetPiectr ;
   private String Z10779MetPieOb ;
   private String Z2846MetPieDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
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
   private String edtMetTerCod_Internalname ;
   private String edtMetTerCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtMetTotPie_Internalname ;
   private String edtMetTotPie_Jsonclick ;
   private String edtMetTotMet_Internalname ;
   private String edtMetTotMet_Jsonclick ;
   private String edtMetTotKil_Internalname ;
   private String edtMetTotKil_Jsonclick ;
   private String edtMetPieCod_Internalname ;
   private String A2813MetPieCod ;
   private String edtMetPieCod_Jsonclick ;
   private String edtMetPieKil_Internalname ;
   private String edtMetPieKil_Jsonclick ;
   private String edtMetPieMet_Internalname ;
   private String edtMetPieMet_Jsonclick ;
   private String edtMetPieId_Internalname ;
   private String A10784MetPieId ;
   private String edtMetPieId_Jsonclick ;
   private String edtMetPiectr_Internalname ;
   private String A10780MetPiectr ;
   private String edtMetPiectr_Jsonclick ;
   private String edtMetPieOb_Internalname ;
   private String A10779MetPieOb ;
   private String edtMetPieOb_Jsonclick ;
   private String edtMetPieAnc_Internalname ;
   private String edtMetPieAnc_Jsonclick ;
   private String edtMetPieFch_Internalname ;
   private String edtMetPieFch_Jsonclick ;
   private String edtMetPieDef_Internalname ;
   private String edtMetPieDef_Jsonclick ;
   private String edtMetPieDsc_Internalname ;
   private String A2846MetPieDsc ;
   private String edtMetPieDsc_Jsonclick ;
   private String edtMetPieEst_Internalname ;
   private String edtMetPieEst_Jsonclick ;
   private String edtMetPieMtD_Internalname ;
   private String edtMetPieMtD_Jsonclick ;
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
   private String sMode413 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ2809MetTerCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2813MetPieCod ;
   private String ZZ10784MetPieId ;
   private String ZZ10780MetPiectr ;
   private String ZZ10779MetPieOb ;
   private String ZZ2846MetPieDsc ;
   private String ZZ407EmprNom ;
   private java.util.Date Z5136MetPieFch ;
   private java.util.Date A5136MetPieFch ;
   private java.util.Date ZZ5136MetPieFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01V49_A2813MetPieCod ;
   private String[] T01V49_A407EmprNom ;
   private boolean[] T01V49_n407EmprNom ;
   private java.math.BigDecimal[] T01V49_A2814MetPieKil ;
   private java.math.BigDecimal[] T01V49_A2815MetPieMet ;
   private String[] T01V49_A10784MetPieId ;
   private String[] T01V49_A10780MetPiectr ;
   private String[] T01V49_A10779MetPieOb ;
   private short[] T01V49_A6635MetPieAnc ;
   private java.util.Date[] T01V49_A5136MetPieFch ;
   private short[] T01V49_A4909MetPieDef ;
   private String[] T01V49_A2846MetPieDsc ;
   private byte[] T01V49_A2816MetPieEst ;
   private java.math.BigDecimal[] T01V49_A4910MetPieMtD ;
   private String[] T01V49_A396EmprCod ;
   private int[] T01V49_A129BarCod ;
   private byte[] T01V49_A132BarCodReo ;
   private String[] T01V49_A130BarCodPar ;
   private String[] T01V49_A2809MetTerCod ;
   private java.math.BigDecimal[] T01V49_A2811MetTotMet ;
   private java.math.BigDecimal[] T01V49_A2810MetTotKil ;
   private short[] T01V49_A2812MetTotPie ;
   private String[] T01V44_A407EmprNom ;
   private boolean[] T01V44_n407EmprNom ;
   private String[] T01V45_A396EmprCod ;
   private java.math.BigDecimal[] T01V47_A2811MetTotMet ;
   private java.math.BigDecimal[] T01V47_A2810MetTotKil ;
   private short[] T01V47_A2812MetTotPie ;
   private String[] T01V410_A407EmprNom ;
   private boolean[] T01V410_n407EmprNom ;
   private String[] T01V411_A396EmprCod ;
   private java.math.BigDecimal[] T01V413_A2811MetTotMet ;
   private java.math.BigDecimal[] T01V413_A2810MetTotKil ;
   private short[] T01V413_A2812MetTotPie ;
   private String[] T01V414_A396EmprCod ;
   private String[] T01V414_A2809MetTerCod ;
   private int[] T01V414_A129BarCod ;
   private byte[] T01V414_A132BarCodReo ;
   private String[] T01V414_A130BarCodPar ;
   private String[] T01V414_A2813MetPieCod ;
   private String[] T01V43_A2813MetPieCod ;
   private java.math.BigDecimal[] T01V43_A2814MetPieKil ;
   private java.math.BigDecimal[] T01V43_A2815MetPieMet ;
   private String[] T01V43_A10784MetPieId ;
   private String[] T01V43_A10780MetPiectr ;
   private String[] T01V43_A10779MetPieOb ;
   private short[] T01V43_A6635MetPieAnc ;
   private java.util.Date[] T01V43_A5136MetPieFch ;
   private short[] T01V43_A4909MetPieDef ;
   private String[] T01V43_A2846MetPieDsc ;
   private byte[] T01V43_A2816MetPieEst ;
   private java.math.BigDecimal[] T01V43_A4910MetPieMtD ;
   private String[] T01V43_A396EmprCod ;
   private int[] T01V43_A129BarCod ;
   private byte[] T01V43_A132BarCodReo ;
   private String[] T01V43_A130BarCodPar ;
   private String[] T01V43_A2809MetTerCod ;
   private String[] T01V415_A396EmprCod ;
   private String[] T01V415_A2809MetTerCod ;
   private int[] T01V415_A129BarCod ;
   private byte[] T01V415_A132BarCodReo ;
   private String[] T01V415_A130BarCodPar ;
   private String[] T01V415_A2813MetPieCod ;
   private String[] T01V416_A396EmprCod ;
   private String[] T01V416_A2809MetTerCod ;
   private int[] T01V416_A129BarCod ;
   private byte[] T01V416_A132BarCodReo ;
   private String[] T01V416_A130BarCodPar ;
   private String[] T01V416_A2813MetPieCod ;
   private String[] T01V42_A2813MetPieCod ;
   private java.math.BigDecimal[] T01V42_A2814MetPieKil ;
   private java.math.BigDecimal[] T01V42_A2815MetPieMet ;
   private String[] T01V42_A10784MetPieId ;
   private String[] T01V42_A10780MetPiectr ;
   private String[] T01V42_A10779MetPieOb ;
   private short[] T01V42_A6635MetPieAnc ;
   private java.util.Date[] T01V42_A5136MetPieFch ;
   private short[] T01V42_A4909MetPieDef ;
   private String[] T01V42_A2846MetPieDsc ;
   private byte[] T01V42_A2816MetPieEst ;
   private java.math.BigDecimal[] T01V42_A4910MetPieMtD ;
   private String[] T01V42_A396EmprCod ;
   private int[] T01V42_A129BarCod ;
   private byte[] T01V42_A132BarCodReo ;
   private String[] T01V42_A130BarCodPar ;
   private String[] T01V42_A2809MetTerCod ;
   private String[] T01V420_A407EmprNom ;
   private boolean[] T01V420_n407EmprNom ;
   private java.math.BigDecimal[] T01V422_A2811MetTotMet ;
   private java.math.BigDecimal[] T01V422_A2810MetTotKil ;
   private short[] T01V422_A2812MetTotPie ;
   private String[] T01V423_A396EmprCod ;
   private String[] T01V423_A2809MetTerCod ;
   private int[] T01V423_A129BarCod ;
   private byte[] T01V423_A132BarCodReo ;
   private String[] T01V423_A130BarCodPar ;
   private String[] T01V423_A2813MetPieCod ;
   private short[] T01V423_A12995MetPieDfLi ;
   private String[] T01V424_A396EmprCod ;
   private String[] T01V424_A2809MetTerCod ;
   private int[] T01V424_A129BarCod ;
   private byte[] T01V424_A132BarCodReo ;
   private String[] T01V424_A130BarCodPar ;
   private String[] T01V424_A2813MetPieCod ;
   private String[] T01V425_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class lmetpi__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lmetpi__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lmetpi__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lmetpi__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lmetpi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01V42", "SELECT MetPieCod, MetPieKil, MetPieMet, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieDef, MetPieDsc, MetPieEst, MetPieMtD, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?  FOR UPDATE OF MetPieKil, MetPieMet, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieDef, MetPieDsc, MetPieEst, MetPieMtD NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V43", "SELECT MetPieCod, MetPieKil, MetPieMet, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieDef, MetPieDsc, MetPieEst, MetPieMtD, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V44", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V45", "SELECT EmprCod FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V47", "SELECT COALESCE( T1.MetTotMet, 0) AS MetTotMet, COALESCE( T1.MetTotKil, 0) AS MetTotKil, COALESCE( T1.MetTotPie, 0) AS MetTotPie FROM (SELECT SUM(MetPieMet) AS MetTotMet, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieKil) AS MetTotKil, COUNT(*) AS MetTotPie FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.MetTerCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V49", "SELECT /*+ FIRST_ROWS(100) */ TM1.MetPieCod, T2.EmprNom, TM1.MetPieKil, TM1.MetPieMet, TM1.MetPieId, TM1.MetPiectr, TM1.MetPieOb, TM1.MetPieAnc, TM1.MetPieFch, TM1.MetPieDef, TM1.MetPieDsc, TM1.MetPieEst, TM1.MetPieMtD, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MetTerCod, COALESCE( T3.MetTotMet, 0) AS MetTotMet, COALESCE( T3.MetTotKil, 0) AS MetTotKil, COALESCE( T3.MetTotPie, 0) AS MetTotPie FROM ((TXPLMETPI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(TM1.MetPieMet) AS MetTotMet, TM1.EmprCod, TM1.MetTerCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, SUM(TM1.MetPieKil) AS MetTotKil, COUNT(*) AS MetTotPie FROM TXPLMETPI TM1 GROUP BY TM1.EmprCod, TM1.MetTerCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.MetTerCod = TM1.MetTerCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.MetTerCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.MetPieCod = ? ORDER BY TM1.EmprCod, TM1.MetTerCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MetPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V410", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V411", "SELECT EmprCod FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V413", "SELECT COALESCE( T1.MetTotMet, 0) AS MetTotMet, COALESCE( T1.MetTotKil, 0) AS MetTotKil, COALESCE( T1.MetTotPie, 0) AS MetTotPie FROM (SELECT SUM(MetPieMet) AS MetTotMet, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieKil) AS MetTotKil, COUNT(*) AS MetTotPie FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.MetTerCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V414", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V415", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE ( EmprCod > ? or EmprCod = ? and MetTerCod > ? or MetTerCod = ? and EmprCod = ? and BarCod > ? or BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and MetPieCod > ?) ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V416", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE ( EmprCod < ? or EmprCod = ? and MetTerCod < ? or MetTerCod = ? and EmprCod = ? and BarCod < ? or BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and MetPieCod < ?) ORDER BY EmprCod DESC, MetTerCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01V417", "INSERT INTO TXPLMETPI(MetPieCod, MetPieKil, MetPieMet, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieDef, MetPieDsc, MetPieEst, MetPieMtD, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieDfUl, MetPieOpe, MetPieTurn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0)", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01V418", "UPDATE TXPLMETPI SET MetPieKil=?, MetPieMet=?, MetPieId=?, MetPiectr=?, MetPieOb=?, MetPieAnc=?, MetPieFch=?, MetPieDef=?, MetPieDsc=?, MetPieEst=?, MetPieMtD=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01V419", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new ForEachCursor("T01V420", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V422", "SELECT COALESCE( T1.MetTotMet, 0) AS MetTotMet, COALESCE( T1.MetTotKil, 0) AS MetTotKil, COALESCE( T1.MetTotPie, 0) AS MetTotPie FROM (SELECT SUM(MetPieMet) AS MetTotMet, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieKil) AS MetTotKil, COUNT(*) AS MetTotPie FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.MetTerCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V423", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V424", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V425", "SELECT EmprCod FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[5])[0] = rslt.getString(5, 9);
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((String[]) buf[7])[0] = rslt.getString(7, 60);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 20);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 3);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((String[]) buf[18])[0] = rslt.getString(18, 10);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 19 :
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 10);
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 9);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 10);
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 9);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 9);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 9);
               stmt.setString(5, (String)parms[4], 40);
               stmt.setString(6, (String)parms[5], 60);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 20);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setString(13, (String)parms[12], 3);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setString(17, (String)parms[16], 10);
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 9);
               stmt.setString(4, (String)parms[3], 40);
               stmt.setString(5, (String)parms[4], 60);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 20);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setString(12, (String)parms[11], 3);
               stmt.setString(13, (String)parms[12], 10);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setString(17, (String)parms[16], 9);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

