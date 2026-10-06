package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class estructuratablalmacpr_impl extends GXDataArea
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
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A764ProForCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1514MacProCod = httpContext.GetPar( "MacProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A1514MacProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1514MacProCod = httpContext.GetPar( "MacProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A1514MacProCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Estructura Tabla LMACPR", ""), (short)(0)) ;
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

   public estructuratablalmacpr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public estructuratablalmacpr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( estructuratablalmacpr_impl.class ));
   }

   public estructuratablalmacpr_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Estructura Tabla LMACPR", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProCod_Internalname, httpContext.getMessage( "Nº de Programa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProCod_Internalname, GXutil.rtrim( A1514MacProCod), GXutil.rtrim( localUtil.format( A1514MacProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacProCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProDsc_Internalname, httpContext.getMessage( "Descripción del Nº Programa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProDsc_Internalname, GXutil.rtrim( A1515MacProDsc), GXutil.rtrim( localUtil.format( A1515MacProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacProDsc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProDsc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProDsc2_Internalname, httpContext.getMessage( "Descripción del Nº Programa (mayor)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProDsc2_Internalname, GXutil.rtrim( A6231MacProDsc2), GXutil.rtrim( localUtil.format( A6231MacProDsc2, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProDsc2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacProDsc2_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacNumPrg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacNumPrg_Internalname, httpContext.getMessage( "Nº Programa Centralizacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacNumPrg_Internalname, GXutil.ltrim( localUtil.ntoc( A6096MacNumPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacNumPrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6096MacNumPrg), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6096MacNumPrg), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacNumPrg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacNumPrg_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacKgTTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacKgTTin_Internalname, httpContext.getMessage( "Lavar LItros p/kg", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacKgTTin_Internalname, GXutil.ltrim( localUtil.ntoc( A12534MacKgTTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacKgTTin_Enabled!=0) ? localUtil.format( A12534MacKgTTin, "ZZZZZ9.99") : localUtil.format( A12534MacKgTTin, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacKgTTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacKgTTin_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProPrg2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProPrg2_Internalname, httpContext.getMessage( "Programa 2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProPrg2_Internalname, GXutil.rtrim( A13463MacProPrg2), GXutil.rtrim( localUtil.format( A13463MacProPrg2, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProPrg2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacProPrg2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProPrg3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProPrg3_Internalname, httpContext.getMessage( "Programa 3", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProPrg3_Internalname, GXutil.rtrim( A13464MacProPrg3), GXutil.rtrim( localUtil.format( A13464MacProPrg3, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProPrg3_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacProPrg3_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProULin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProULin_Internalname, httpContext.getMessage( "Ultima Linea Poceso", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProULin_Internalname, GXutil.ltrim( localUtil.ntoc( A1516MacProULin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacProULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1516MacProULin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1516MacProULin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProULin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacProULin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacSumTim_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacSumTim_Internalname, httpContext.getMessage( "Suma Tiempo Procesos Q", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacSumTim_Internalname, GXutil.ltrim( localUtil.ntoc( A6097MacSumTim, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacSumTim_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6097MacSumTim), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6097MacSumTim), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacSumTim_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacSumTim_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProCDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProCDsc_Internalname, httpContext.getMessage( "Codigo-Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProCDsc_Internalname, A13755MacProCDsc, GXutil.rtrim( localUtil.format( A13755MacProCDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProCDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacProCDsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacProLin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1517MacProLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacProLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1517MacProLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1517MacProLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacProLin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCod_Internalname, GXutil.rtrim( A764ProForCod), GXutil.rtrim( localUtil.format( A764ProForCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForDsc_Internalname, httpContext.getMessage( "Proceso Quimico", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc), GXutil.rtrim( localUtil.format( A766ProForDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTie_Internalname, httpContext.getMessage( "Tiempo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTie_Internalname, GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForTie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTmx_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTmx_Internalname, httpContext.getMessage( "Temperatura", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTmx_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForTmx_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForMat_Internalname, httpContext.getMessage( "Materia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForMat_Internalname, GXutil.rtrim( A769ProForMat), GXutil.rtrim( localUtil.format( A769ProForMat, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForMat_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacPrgNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacPrgNum_Internalname, httpContext.getMessage( "Nº Programa por Proceso", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacPrgNum_Internalname, GXutil.ltrim( localUtil.ntoc( A7787MacPrgNum, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacPrgNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7787MacPrgNum), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7787MacPrgNum), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacPrgNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacPrgNum_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacPrdTt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacPrdTt_Internalname, httpContext.getMessage( "Tiempo Proceso", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacPrdTt_Internalname, GXutil.ltrim( localUtil.ntoc( A8011MacPrdTt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacPrdTt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8011MacPrdTt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8011MacPrdTt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacPrdTt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacPrdTt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacRb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacRb_Internalname, httpContext.getMessage( "Rb", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacRb_Internalname, GXutil.ltrim( localUtil.ntoc( A10549MacRb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacRb_Enabled!=0) ? localUtil.format( A10549MacRb, "ZZ9.99") : localUtil.format( A10549MacRb, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacRb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacRb_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacNH2O_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacNH2O_Internalname, httpContext.getMessage( "N de Aguas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacNH2O_Internalname, GXutil.ltrim( localUtil.ntoc( A10550MacNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacNH2O_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10550MacNH2O), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10550MacNH2O), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacNH2O_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacNH2O_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\EstructuraTablaLMACPR.htm");
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
         Z1514MacProCod = httpContext.cgiGet( "Z1514MacProCod") ;
         Z1517MacProLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1517MacProLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7787MacPrgNum = (short)(localUtil.ctol( httpContext.cgiGet( "Z7787MacPrgNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8011MacPrdTt = (short)(localUtil.ctol( httpContext.cgiGet( "Z8011MacPrdTt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10549MacRb = localUtil.ctond( httpContext.cgiGet( "Z10549MacRb")) ;
         Z10550MacNH2O = (short)(localUtil.ctol( httpContext.cgiGet( "Z10550MacNH2O"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z764ProForCod = httpContext.cgiGet( "Z764ProForCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1514MacProCod = httpContext.cgiGet( edtMacProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         A1515MacProDsc = httpContext.cgiGet( edtMacProDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
         A6231MacProDsc2 = httpContext.cgiGet( edtMacProDsc2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6231MacProDsc2", A6231MacProDsc2);
         A6096MacNumPrg = (int)(localUtil.ctol( httpContext.cgiGet( edtMacNumPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
         A12534MacKgTTin = localUtil.ctond( httpContext.cgiGet( edtMacKgTTin_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
         A13463MacProPrg2 = httpContext.cgiGet( edtMacProPrg2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", A13463MacProPrg2);
         A13464MacProPrg3 = httpContext.cgiGet( edtMacProPrg3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", A13464MacProPrg3);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1516MacProULin = (short)(localUtil.ctol( httpContext.cgiGet( edtMacProULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
         A6097MacSumTim = (int)(localUtil.ctol( httpContext.cgiGet( edtMacSumTim_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         A13755MacProCDsc = httpContext.cgiGet( edtMacProCDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13755MacProCDsc", A13755MacProCDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACPROLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacProLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1517MacProLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1517MacProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1517MacProLin), 3, 0));
         }
         else
         {
            A1517MacProLin = (short)(localUtil.ctol( httpContext.cgiGet( edtMacProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1517MacProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1517MacProLin), 3, 0));
         }
         A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A771ProForTie = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
         A772ProForTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         A769ProForMat = httpContext.cgiGet( edtProForMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacPrgNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacPrgNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACPRGNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacPrgNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7787MacPrgNum = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7787MacPrgNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7787MacPrgNum), 3, 0));
         }
         else
         {
            A7787MacPrgNum = (short)(localUtil.ctol( httpContext.cgiGet( edtMacPrgNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7787MacPrgNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7787MacPrgNum), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacPrdTt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacPrdTt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACPRDTT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacPrdTt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8011MacPrdTt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8011MacPrdTt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8011MacPrdTt), 4, 0));
         }
         else
         {
            A8011MacPrdTt = (short)(localUtil.ctol( httpContext.cgiGet( edtMacPrdTt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8011MacPrdTt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8011MacPrdTt), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMacRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMacRb_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACRB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacRb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10549MacRb = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A10549MacRb", GXutil.ltrimstr( A10549MacRb, 6, 2));
         }
         else
         {
            A10549MacRb = localUtil.ctond( httpContext.cgiGet( edtMacRb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10549MacRb", GXutil.ltrimstr( A10549MacRb, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacNH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacNH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACNH2O");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacNH2O_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10550MacNH2O = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10550MacNH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10550MacNH2O), 4, 0));
         }
         else
         {
            A10550MacNH2O = (short)(localUtil.ctol( httpContext.cgiGet( edtMacNH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10550MacNH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10550MacNH2O), 4, 0));
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
            A1514MacProCod = httpContext.GetPar( "MacProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
            A1517MacProLin = (short)(GXutil.lval( httpContext.GetPar( "MacProLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1517MacProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1517MacProLin), 3, 0));
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
            initAll1RP215( ) ;
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
      disableAttributes1RP215( ) ;
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

   public void resetCaption1RP0( )
   {
   }

   public void zm1RP215( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7787MacPrgNum = T01RP3_A7787MacPrgNum[0] ;
            Z8011MacPrdTt = T01RP3_A8011MacPrdTt[0] ;
            Z10549MacRb = T01RP3_A10549MacRb[0] ;
            Z10550MacNH2O = T01RP3_A10550MacNH2O[0] ;
            Z764ProForCod = T01RP3_A764ProForCod[0] ;
         }
         else
         {
            Z7787MacPrgNum = A7787MacPrgNum ;
            Z8011MacPrdTt = A8011MacPrdTt ;
            Z10549MacRb = A10549MacRb ;
            Z10550MacNH2O = A10550MacNH2O ;
            Z764ProForCod = A764ProForCod ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z1517MacProLin = A1517MacProLin ;
         Z7787MacPrgNum = A7787MacPrgNum ;
         Z8011MacPrdTt = A8011MacPrdTt ;
         Z10549MacRb = A10549MacRb ;
         Z10550MacNH2O = A10550MacNH2O ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z1514MacProCod = A1514MacProCod ;
         Z407EmprNom = A407EmprNom ;
         Z1515MacProDsc = A1515MacProDsc ;
         Z6231MacProDsc2 = A6231MacProDsc2 ;
         Z6096MacNumPrg = A6096MacNumPrg ;
         Z12534MacKgTTin = A12534MacKgTTin ;
         Z13463MacProPrg2 = A13463MacProPrg2 ;
         Z13464MacProPrg3 = A13464MacProPrg3 ;
         Z1516MacProULin = A1516MacProULin ;
         Z6097MacSumTim = A6097MacSumTim ;
         Z766ProForDsc = A766ProForDsc ;
         Z771ProForTie = A771ProForTie ;
         Z772ProForTmx = A772ProForTmx ;
         Z769ProForMat = A769ProForMat ;
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

   public void load1RP215( )
   {
      /* Using cursor T01RP10 */
      pr_default.execute(6, new Object[] {A396EmprCod, A1514MacProCod, Short.valueOf(A1517MacProLin)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound215 = (short)(1) ;
         A1515MacProDsc = T01RP10_A1515MacProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
         A6231MacProDsc2 = T01RP10_A6231MacProDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6231MacProDsc2", A6231MacProDsc2);
         A6096MacNumPrg = T01RP10_A6096MacNumPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
         A12534MacKgTTin = T01RP10_A12534MacKgTTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
         A13463MacProPrg2 = T01RP10_A13463MacProPrg2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", A13463MacProPrg2);
         A13464MacProPrg3 = T01RP10_A13464MacProPrg3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", A13464MacProPrg3);
         A407EmprNom = T01RP10_A407EmprNom[0] ;
         n407EmprNom = T01RP10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1516MacProULin = T01RP10_A1516MacProULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
         A766ProForDsc = T01RP10_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A771ProForTie = T01RP10_A771ProForTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
         A772ProForTmx = T01RP10_A772ProForTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         A769ProForMat = T01RP10_A769ProForMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
         A7787MacPrgNum = T01RP10_A7787MacPrgNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7787MacPrgNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7787MacPrgNum), 3, 0));
         A8011MacPrdTt = T01RP10_A8011MacPrdTt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8011MacPrdTt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8011MacPrdTt), 4, 0));
         A10549MacRb = T01RP10_A10549MacRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10549MacRb", GXutil.ltrimstr( A10549MacRb, 6, 2));
         A10550MacNH2O = T01RP10_A10550MacNH2O[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10550MacNH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10550MacNH2O), 4, 0));
         A764ProForCod = T01RP10_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A6097MacSumTim = T01RP10_A6097MacSumTim[0] ;
         n6097MacSumTim = T01RP10_n6097MacSumTim[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         zm1RP215( -2) ;
      }
      pr_default.close(6);
      onLoadActions1RP215( ) ;
   }

   public void onLoadActions1RP215( )
   {
      A13755MacProCDsc = GXutil.trim( A1514MacProCod) + "-" + GXutil.trim( A1515MacProDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13755MacProCDsc", A13755MacProCDsc);
   }

   public void checkExtendedTable1RP215( )
   {
      nIsDirty_215 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01RP4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RP4_A407EmprNom[0] ;
      n407EmprNom = T01RP4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01RP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01RP5_A766ProForDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A771ProForTie = T01RP5_A771ProForTie[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
      A772ProForTmx = T01RP5_A772ProForTmx[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
      A769ProForMat = T01RP5_A769ProForMat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
      pr_default.close(3);
      /* Using cursor T01RP6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A1514MacProCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMACPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MACPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1515MacProDsc = T01RP6_A1515MacProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
      A6231MacProDsc2 = T01RP6_A6231MacProDsc2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6231MacProDsc2", A6231MacProDsc2);
      A6096MacNumPrg = T01RP6_A6096MacNumPrg[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
      A12534MacKgTTin = T01RP6_A12534MacKgTTin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
      A13463MacProPrg2 = T01RP6_A13463MacProPrg2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", A13463MacProPrg2);
      A13464MacProPrg3 = T01RP6_A13464MacProPrg3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", A13464MacProPrg3);
      A1516MacProULin = T01RP6_A1516MacProULin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
      pr_default.close(4);
      /* Using cursor T01RP8 */
      pr_default.execute(5, new Object[] {A396EmprCod, A1514MacProCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A6097MacSumTim = T01RP8_A6097MacSumTim[0] ;
         n6097MacSumTim = T01RP8_n6097MacSumTim[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      }
      else
      {
         nIsDirty_215 = (short)(1) ;
         A6097MacSumTim = 0 ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      }
      pr_default.close(5);
      nIsDirty_215 = (short)(1) ;
      A13755MacProCDsc = GXutil.trim( A1514MacProCod) + "-" + GXutil.trim( A1515MacProDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13755MacProCDsc", A13755MacProCDsc);
   }

   public void closeExtendedTableCursors1RP215( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod )
   {
      /* Using cursor T01RP11 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RP11_A407EmprNom[0] ;
      n407EmprNom = T01RP11_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
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
                         String A764ProForCod )
   {
      /* Using cursor T01RP12 */
      pr_default.execute(8, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01RP12_A766ProForDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A771ProForTie = T01RP12_A771ProForTie[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
      A772ProForTmx = T01RP12_A772ProForTmx[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
      A769ProForMat = T01RP12_A769ProForMat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A769ProForMat))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_5( String A396EmprCod ,
                         String A1514MacProCod )
   {
      /* Using cursor T01RP13 */
      pr_default.execute(9, new Object[] {A396EmprCod, A1514MacProCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMACPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MACPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1515MacProDsc = T01RP13_A1515MacProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
      A6231MacProDsc2 = T01RP13_A6231MacProDsc2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6231MacProDsc2", A6231MacProDsc2);
      A6096MacNumPrg = T01RP13_A6096MacNumPrg[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
      A12534MacKgTTin = T01RP13_A12534MacKgTTin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
      A13463MacProPrg2 = T01RP13_A13463MacProPrg2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", A13463MacProPrg2);
      A13464MacProPrg3 = T01RP13_A13464MacProPrg3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", A13464MacProPrg3);
      A1516MacProULin = T01RP13_A1516MacProULin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1515MacProDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6231MacProDsc2))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6096MacNumPrg, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12534MacKgTTin, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13463MacProPrg2))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13464MacProPrg3))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1516MacProULin, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_6( String A396EmprCod ,
                         String A1514MacProCod )
   {
      /* Using cursor T01RP15 */
      pr_default.execute(10, new Object[] {A396EmprCod, A1514MacProCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A6097MacSumTim = T01RP15_A6097MacSumTim[0] ;
         n6097MacSumTim = T01RP15_n6097MacSumTim[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      }
      else
      {
         A6097MacSumTim = 0 ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6097MacSumTim, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1RP215( )
   {
      /* Using cursor T01RP16 */
      pr_default.execute(11, new Object[] {A396EmprCod, A1514MacProCod, Short.valueOf(A1517MacProLin)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound215 = (short)(1) ;
      }
      else
      {
         RcdFound215 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A1514MacProCod, Short.valueOf(A1517MacProLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RP215( 2) ;
         RcdFound215 = (short)(1) ;
         A1517MacProLin = T01RP3_A1517MacProLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1517MacProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1517MacProLin), 3, 0));
         A7787MacPrgNum = T01RP3_A7787MacPrgNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7787MacPrgNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7787MacPrgNum), 3, 0));
         A8011MacPrdTt = T01RP3_A8011MacPrdTt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8011MacPrdTt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8011MacPrdTt), 4, 0));
         A10549MacRb = T01RP3_A10549MacRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10549MacRb", GXutil.ltrimstr( A10549MacRb, 6, 2));
         A10550MacNH2O = T01RP3_A10550MacNH2O[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10550MacNH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10550MacNH2O), 4, 0));
         A396EmprCod = T01RP3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = T01RP3_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A1514MacProCod = T01RP3_A1514MacProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         Z396EmprCod = A396EmprCod ;
         Z1514MacProCod = A1514MacProCod ;
         Z1517MacProLin = A1517MacProLin ;
         sMode215 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1RP215( ) ;
         if ( AnyError == 1 )
         {
            RcdFound215 = (short)(0) ;
            initializeNonKey1RP215( ) ;
         }
         Gx_mode = sMode215 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound215 = (short)(0) ;
         initializeNonKey1RP215( ) ;
         sMode215 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode215 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1RP215( ) ;
      if ( RcdFound215 == 0 )
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
      RcdFound215 = (short)(0) ;
      /* Using cursor T01RP17 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, A1514MacProCod, A1514MacProCod, A396EmprCod, Short.valueOf(A1517MacProLin)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01RP17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RP17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RP17_A1514MacProCod[0], A1514MacProCod) < 0 ) || ( GXutil.strcmp(T01RP17_A1514MacProCod[0], A1514MacProCod) == 0 ) && ( GXutil.strcmp(T01RP17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RP17_A1517MacProLin[0] < A1517MacProLin ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01RP17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RP17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RP17_A1514MacProCod[0], A1514MacProCod) > 0 ) || ( GXutil.strcmp(T01RP17_A1514MacProCod[0], A1514MacProCod) == 0 ) && ( GXutil.strcmp(T01RP17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RP17_A1517MacProLin[0] > A1517MacProLin ) ) )
         {
            A396EmprCod = T01RP17_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1514MacProCod = T01RP17_A1514MacProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
            A1517MacProLin = T01RP17_A1517MacProLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1517MacProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1517MacProLin), 3, 0));
            RcdFound215 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound215 = (short)(0) ;
      /* Using cursor T01RP18 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, A1514MacProCod, A1514MacProCod, A396EmprCod, Short.valueOf(A1517MacProLin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01RP18_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RP18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RP18_A1514MacProCod[0], A1514MacProCod) > 0 ) || ( GXutil.strcmp(T01RP18_A1514MacProCod[0], A1514MacProCod) == 0 ) && ( GXutil.strcmp(T01RP18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RP18_A1517MacProLin[0] > A1517MacProLin ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01RP18_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RP18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RP18_A1514MacProCod[0], A1514MacProCod) < 0 ) || ( GXutil.strcmp(T01RP18_A1514MacProCod[0], A1514MacProCod) == 0 ) && ( GXutil.strcmp(T01RP18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RP18_A1517MacProLin[0] < A1517MacProLin ) ) )
         {
            A396EmprCod = T01RP18_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1514MacProCod = T01RP18_A1514MacProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
            A1517MacProLin = T01RP18_A1517MacProLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1517MacProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1517MacProLin), 3, 0));
            RcdFound215 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RP215( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RP215( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound215 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1514MacProCod, Z1514MacProCod) != 0 ) || ( A1517MacProLin != Z1517MacProLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A1514MacProCod = Z1514MacProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
               A1517MacProLin = Z1517MacProLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1517MacProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1517MacProLin), 3, 0));
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
               update1RP215( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1514MacProCod, Z1514MacProCod) != 0 ) || ( A1517MacProLin != Z1517MacProLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RP215( ) ;
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
                  insert1RP215( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1514MacProCod, Z1514MacProCod) != 0 ) || ( A1517MacProLin != Z1517MacProLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1514MacProCod = Z1514MacProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         A1517MacProLin = Z1517MacProLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1517MacProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1517MacProLin), 3, 0));
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
      if ( RcdFound215 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtProForCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1RP215( ) ;
      if ( RcdFound215 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RP215( ) ;
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
      if ( RcdFound215 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForCod_Internalname ;
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
      if ( RcdFound215 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForCod_Internalname ;
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
      scanStart1RP215( ) ;
      if ( RcdFound215 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound215 != 0 )
         {
            scanNext1RP215( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RP215( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1RP215( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A1514MacProCod, Short.valueOf(A1517MacProLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMACPR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z7787MacPrgNum != T01RP2_A7787MacPrgNum[0] ) || ( Z8011MacPrdTt != T01RP2_A8011MacPrdTt[0] ) || ( DecimalUtil.compareTo(Z10549MacRb, T01RP2_A10549MacRb[0]) != 0 ) || ( Z10550MacNH2O != T01RP2_A10550MacNH2O[0] ) || ( GXutil.strcmp(Z764ProForCod, T01RP2_A764ProForCod[0]) != 0 ) )
         {
            if ( Z7787MacPrgNum != T01RP2_A7787MacPrgNum[0] )
            {
               GXutil.writeLogln("formulaciontinte.estructuratablalmacpr:[seudo value changed for attri]"+"MacPrgNum");
               GXutil.writeLogRaw("Old: ",Z7787MacPrgNum);
               GXutil.writeLogRaw("Current: ",T01RP2_A7787MacPrgNum[0]);
            }
            if ( Z8011MacPrdTt != T01RP2_A8011MacPrdTt[0] )
            {
               GXutil.writeLogln("formulaciontinte.estructuratablalmacpr:[seudo value changed for attri]"+"MacPrdTt");
               GXutil.writeLogRaw("Old: ",Z8011MacPrdTt);
               GXutil.writeLogRaw("Current: ",T01RP2_A8011MacPrdTt[0]);
            }
            if ( DecimalUtil.compareTo(Z10549MacRb, T01RP2_A10549MacRb[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.estructuratablalmacpr:[seudo value changed for attri]"+"MacRb");
               GXutil.writeLogRaw("Old: ",Z10549MacRb);
               GXutil.writeLogRaw("Current: ",T01RP2_A10549MacRb[0]);
            }
            if ( Z10550MacNH2O != T01RP2_A10550MacNH2O[0] )
            {
               GXutil.writeLogln("formulaciontinte.estructuratablalmacpr:[seudo value changed for attri]"+"MacNH2O");
               GXutil.writeLogRaw("Old: ",Z10550MacNH2O);
               GXutil.writeLogRaw("Current: ",T01RP2_A10550MacNH2O[0]);
            }
            if ( GXutil.strcmp(Z764ProForCod, T01RP2_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.estructuratablalmacpr:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T01RP2_A764ProForCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMACPR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RP215( )
   {
      beforeValidate1RP215( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RP215( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RP215( 0) ;
         checkOptimisticConcurrency1RP215( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RP215( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RP215( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RP19 */
                  pr_default.execute(14, new Object[] {Short.valueOf(A1517MacProLin), Short.valueOf(A7787MacPrgNum), Short.valueOf(A8011MacPrdTt), A10549MacRb, Short.valueOf(A10550MacNH2O), A396EmprCod, A764ProForCod, A1514MacProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACPR");
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
                        resetCaption1RP0( ) ;
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
            load1RP215( ) ;
         }
         endLevel1RP215( ) ;
      }
      closeExtendedTableCursors1RP215( ) ;
   }

   public void update1RP215( )
   {
      beforeValidate1RP215( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RP215( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RP215( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RP215( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RP215( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RP20 */
                  pr_default.execute(15, new Object[] {Short.valueOf(A7787MacPrgNum), Short.valueOf(A8011MacPrdTt), A10549MacRb, Short.valueOf(A10550MacNH2O), A764ProForCod, A396EmprCod, A1514MacProCod, Short.valueOf(A1517MacProLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACPR");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMACPR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RP215( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1RP0( ) ;
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
         endLevel1RP215( ) ;
      }
      closeExtendedTableCursors1RP215( ) ;
   }

   public void deferredUpdate1RP215( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RP215( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RP215( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RP215( ) ;
         afterConfirm1RP215( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RP215( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RP21 */
               pr_default.execute(16, new Object[] {A396EmprCod, A1514MacProCod, Short.valueOf(A1517MacProLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACPR");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound215 == 0 )
                     {
                        initAll1RP215( ) ;
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
                     resetCaption1RP0( ) ;
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
      sMode215 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RP215( ) ;
      Gx_mode = sMode215 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RP215( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01RP22 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T01RP22_A407EmprNom[0] ;
         n407EmprNom = T01RP22_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         /* Using cursor T01RP23 */
         pr_default.execute(18, new Object[] {A396EmprCod, A1514MacProCod});
         A1515MacProDsc = T01RP23_A1515MacProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
         A6231MacProDsc2 = T01RP23_A6231MacProDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6231MacProDsc2", A6231MacProDsc2);
         A6096MacNumPrg = T01RP23_A6096MacNumPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
         A12534MacKgTTin = T01RP23_A12534MacKgTTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
         A13463MacProPrg2 = T01RP23_A13463MacProPrg2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", A13463MacProPrg2);
         A13464MacProPrg3 = T01RP23_A13464MacProPrg3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", A13464MacProPrg3);
         A1516MacProULin = T01RP23_A1516MacProULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
         pr_default.close(18);
         /* Using cursor T01RP25 */
         pr_default.execute(19, new Object[] {A396EmprCod, A1514MacProCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            A6097MacSumTim = T01RP25_A6097MacSumTim[0] ;
            n6097MacSumTim = T01RP25_n6097MacSumTim[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         }
         else
         {
            A6097MacSumTim = 0 ;
            n6097MacSumTim = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
         }
         pr_default.close(19);
         A13755MacProCDsc = GXutil.trim( A1514MacProCod) + "-" + GXutil.trim( A1515MacProDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13755MacProCDsc", A13755MacProCDsc);
         /* Using cursor T01RP26 */
         pr_default.execute(20, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T01RP26_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A771ProForTie = T01RP26_A771ProForTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
         A772ProForTmx = T01RP26_A772ProForTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         A769ProForMat = T01RP26_A769ProForMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
         pr_default.close(20);
      }
   }

   public void endLevel1RP215( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RP215( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.estructuratablalmacpr");
         if ( AnyError == 0 )
         {
            confirmValues1RP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.estructuratablalmacpr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RP215( )
   {
      /* Using cursor T01RP27 */
      pr_default.execute(21);
      RcdFound215 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound215 = (short)(1) ;
         A396EmprCod = T01RP27_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1514MacProCod = T01RP27_A1514MacProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         A1517MacProLin = T01RP27_A1517MacProLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1517MacProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1517MacProLin), 3, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RP215( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound215 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound215 = (short)(1) ;
         A396EmprCod = T01RP27_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1514MacProCod = T01RP27_A1514MacProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         A1517MacProLin = T01RP27_A1517MacProLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1517MacProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1517MacProLin), 3, 0));
      }
   }

   public void scanEnd1RP215( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1RP215( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RP215( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RP215( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RP215( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RP215( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RP215( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RP215( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMacProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProCod_Enabled), 5, 0), true);
      edtMacProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProDsc_Enabled), 5, 0), true);
      edtMacProDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProDsc2_Enabled), 5, 0), true);
      edtMacNumPrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacNumPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacNumPrg_Enabled), 5, 0), true);
      edtMacKgTTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacKgTTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacKgTTin_Enabled), 5, 0), true);
      edtMacProPrg2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProPrg2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProPrg2_Enabled), 5, 0), true);
      edtMacProPrg3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProPrg3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProPrg3_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMacProULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProULin_Enabled), 5, 0), true);
      edtMacSumTim_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacSumTim_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacSumTim_Enabled), 5, 0), true);
      edtMacProCDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProCDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProCDsc_Enabled), 5, 0), true);
      edtMacProLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProLin_Enabled), 5, 0), true);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), true);
      edtProForTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTie_Enabled), 5, 0), true);
      edtProForTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTmx_Enabled), 5, 0), true);
      edtProForMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMat_Enabled), 5, 0), true);
      edtMacPrgNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacPrgNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacPrgNum_Enabled), 5, 0), true);
      edtMacPrdTt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacPrdTt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacPrdTt_Enabled), 5, 0), true);
      edtMacRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacRb_Enabled), 5, 0), true);
      edtMacNH2O_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacNH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacNH2O_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1RP215( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1RP0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.estructuratablalmacpr", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1514MacProCod", GXutil.rtrim( Z1514MacProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1517MacProLin", GXutil.ltrim( localUtil.ntoc( Z1517MacProLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7787MacPrgNum", GXutil.ltrim( localUtil.ntoc( Z7787MacPrgNum, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8011MacPrdTt", GXutil.ltrim( localUtil.ntoc( Z8011MacPrdTt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10549MacRb", GXutil.ltrim( localUtil.ntoc( Z10549MacRb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10550MacNH2O", GXutil.ltrim( localUtil.ntoc( Z10550MacNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
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
      return formatLink("app.formulaciontinte.estructuratablalmacpr", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.EstructuraTablaLMACPR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Estructura Tabla LMACPR", "") ;
   }

   public void initializeNonKey1RP215( )
   {
      A6097MacSumTim = 0 ;
      n6097MacSumTim = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      A13755MacProCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13755MacProCDsc", A13755MacProCDsc);
      A1515MacProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
      A6231MacProDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6231MacProDsc2", A6231MacProDsc2);
      A6096MacNumPrg = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
      A12534MacKgTTin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
      A13463MacProPrg2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", A13463MacProPrg2);
      A13464MacProPrg3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", A13464MacProPrg3);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A1516MacProULin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
      A764ProForCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A771ProForTie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
      A772ProForTmx = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
      A769ProForMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
      A7787MacPrgNum = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7787MacPrgNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7787MacPrgNum), 3, 0));
      A8011MacPrdTt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8011MacPrdTt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8011MacPrdTt), 4, 0));
      A10549MacRb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10549MacRb", GXutil.ltrimstr( A10549MacRb, 6, 2));
      A10550MacNH2O = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10550MacNH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10550MacNH2O), 4, 0));
      Z7787MacPrgNum = (short)(0) ;
      Z8011MacPrdTt = (short)(0) ;
      Z10549MacRb = DecimalUtil.ZERO ;
      Z10550MacNH2O = (short)(0) ;
      Z764ProForCod = "" ;
   }

   public void initAll1RP215( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A1514MacProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
      A1517MacProLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1517MacProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1517MacProLin), 3, 0));
      initializeNonKey1RP215( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415112624", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/estructuratablalmacpr.js", "?202682415112625", false, true);
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
      edtMacProCod_Internalname = "MACPROCOD" ;
      edtMacProDsc_Internalname = "MACPRODSC" ;
      edtMacProDsc2_Internalname = "MACPRODSC2" ;
      edtMacNumPrg_Internalname = "MACNUMPRG" ;
      edtMacKgTTin_Internalname = "MACKGTTIN" ;
      edtMacProPrg2_Internalname = "MACPROPRG2" ;
      edtMacProPrg3_Internalname = "MACPROPRG3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtMacProULin_Internalname = "MACPROULIN" ;
      edtMacSumTim_Internalname = "MACSUMTIM" ;
      edtMacProCDsc_Internalname = "MACPROCDSC" ;
      edtMacProLin_Internalname = "MACPROLIN" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtProForTie_Internalname = "PROFORTIE" ;
      edtProForTmx_Internalname = "PROFORTMX" ;
      edtProForMat_Internalname = "PROFORMAT" ;
      edtMacPrgNum_Internalname = "MACPRGNUM" ;
      edtMacPrdTt_Internalname = "MACPRDTT" ;
      edtMacRb_Internalname = "MACRB" ;
      edtMacNH2O_Internalname = "MACNH2O" ;
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
      Form.setCaption( httpContext.getMessage( "Estructura Tabla LMACPR", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMacNH2O_Jsonclick = "" ;
      edtMacNH2O_Enabled = 1 ;
      edtMacRb_Jsonclick = "" ;
      edtMacRb_Enabled = 1 ;
      edtMacPrdTt_Jsonclick = "" ;
      edtMacPrdTt_Enabled = 1 ;
      edtMacPrgNum_Jsonclick = "" ;
      edtMacPrgNum_Enabled = 1 ;
      edtProForMat_Jsonclick = "" ;
      edtProForMat_Enabled = 0 ;
      edtProForTmx_Jsonclick = "" ;
      edtProForTmx_Enabled = 0 ;
      edtProForTie_Jsonclick = "" ;
      edtProForTie_Enabled = 0 ;
      edtProForDsc_Jsonclick = "" ;
      edtProForDsc_Enabled = 0 ;
      edtProForCod_Jsonclick = "" ;
      edtProForCod_Enabled = 1 ;
      edtMacProLin_Jsonclick = "" ;
      edtMacProLin_Enabled = 1 ;
      edtMacProCDsc_Jsonclick = "" ;
      edtMacProCDsc_Enabled = 0 ;
      edtMacSumTim_Jsonclick = "" ;
      edtMacSumTim_Enabled = 0 ;
      edtMacProULin_Jsonclick = "" ;
      edtMacProULin_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtMacProPrg3_Jsonclick = "" ;
      edtMacProPrg3_Enabled = 0 ;
      edtMacProPrg2_Jsonclick = "" ;
      edtMacProPrg2_Enabled = 0 ;
      edtMacKgTTin_Jsonclick = "" ;
      edtMacKgTTin_Enabled = 0 ;
      edtMacNumPrg_Jsonclick = "" ;
      edtMacNumPrg_Enabled = 0 ;
      edtMacProDsc2_Jsonclick = "" ;
      edtMacProDsc2_Enabled = 0 ;
      edtMacProDsc_Jsonclick = "" ;
      edtMacProDsc_Enabled = 0 ;
      edtMacProCod_Jsonclick = "" ;
      edtMacProCod_Enabled = 1 ;
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
      /* Using cursor T01RP22 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RP22_A407EmprNom[0] ;
      n407EmprNom = T01RP22_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      /* Using cursor T01RP23 */
      pr_default.execute(18, new Object[] {A396EmprCod, A1514MacProCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMACPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MACPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1515MacProDsc = T01RP23_A1515MacProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
      A6231MacProDsc2 = T01RP23_A6231MacProDsc2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6231MacProDsc2", A6231MacProDsc2);
      A6096MacNumPrg = T01RP23_A6096MacNumPrg[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6096MacNumPrg), 5, 0));
      A12534MacKgTTin = T01RP23_A12534MacKgTTin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrimstr( A12534MacKgTTin, 9, 2));
      A13463MacProPrg2 = T01RP23_A13463MacProPrg2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", A13463MacProPrg2);
      A13464MacProPrg3 = T01RP23_A13464MacProPrg3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", A13464MacProPrg3);
      A1516MacProULin = T01RP23_A1516MacProULin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1516MacProULin), 3, 0));
      pr_default.close(18);
      /* Using cursor T01RP25 */
      pr_default.execute(19, new Object[] {A396EmprCod, A1514MacProCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A6097MacSumTim = T01RP25_A6097MacSumTim[0] ;
         n6097MacSumTim = T01RP25_n6097MacSumTim[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      }
      else
      {
         A6097MacSumTim = 0 ;
         n6097MacSumTim = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6097MacSumTim), 6, 0));
      }
      pr_default.close(19);
      GX_FocusControl = edtProForCod_Internalname ;
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
      /* Using cursor T01RP22 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01RP22_A407EmprNom[0] ;
      n407EmprNom = T01RP22_n407EmprNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Macprocod( )
   {
      n6097MacSumTim = false ;
      /* Using cursor T01RP23 */
      pr_default.execute(18, new Object[] {A396EmprCod, A1514MacProCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMACPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MACPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A1515MacProDsc = T01RP23_A1515MacProDsc[0] ;
      A6231MacProDsc2 = T01RP23_A6231MacProDsc2[0] ;
      A6096MacNumPrg = T01RP23_A6096MacNumPrg[0] ;
      A12534MacKgTTin = T01RP23_A12534MacKgTTin[0] ;
      A13463MacProPrg2 = T01RP23_A13463MacProPrg2[0] ;
      A13464MacProPrg3 = T01RP23_A13464MacProPrg3[0] ;
      A1516MacProULin = T01RP23_A1516MacProULin[0] ;
      pr_default.close(18);
      /* Using cursor T01RP25 */
      pr_default.execute(19, new Object[] {A396EmprCod, A1514MacProCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A6097MacSumTim = T01RP25_A6097MacSumTim[0] ;
         n6097MacSumTim = T01RP25_n6097MacSumTim[0] ;
      }
      else
      {
         A6097MacSumTim = 0 ;
         n6097MacSumTim = false ;
      }
      pr_default.close(19);
      A13755MacProCDsc = GXutil.trim( A1514MacProCod) + "-" + GXutil.trim( A1515MacProDsc) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", GXutil.rtrim( A1515MacProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A6231MacProDsc2", GXutil.rtrim( A6231MacProDsc2));
      httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrim( localUtil.ntoc( A6096MacNumPrg, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrim( localUtil.ntoc( A12534MacKgTTin, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", GXutil.rtrim( A13463MacProPrg2));
      httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", GXutil.rtrim( A13464MacProPrg3));
      httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrim( localUtil.ntoc( A1516MacProULin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrim( localUtil.ntoc( A6097MacSumTim, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13755MacProCDsc", A13755MacProCDsc);
   }

   public void valid_Macprolin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", GXutil.rtrim( A764ProForCod));
      httpContext.ajax_rsp_assign_attri("", false, "A7787MacPrgNum", GXutil.ltrim( localUtil.ntoc( A7787MacPrgNum, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8011MacPrdTt", GXutil.ltrim( localUtil.ntoc( A8011MacPrdTt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10549MacRb", GXutil.ltrim( localUtil.ntoc( A10549MacRb, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10550MacNH2O", GXutil.ltrim( localUtil.ntoc( A10550MacNH2O, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", GXutil.rtrim( A769ProForMat));
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", GXutil.rtrim( A1515MacProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A6231MacProDsc2", GXutil.rtrim( A6231MacProDsc2));
      httpContext.ajax_rsp_assign_attri("", false, "A6096MacNumPrg", GXutil.ltrim( localUtil.ntoc( A6096MacNumPrg, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12534MacKgTTin", GXutil.ltrim( localUtil.ntoc( A12534MacKgTTin, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13463MacProPrg2", GXutil.rtrim( A13463MacProPrg2));
      httpContext.ajax_rsp_assign_attri("", false, "A13464MacProPrg3", GXutil.rtrim( A13464MacProPrg3));
      httpContext.ajax_rsp_assign_attri("", false, "A1516MacProULin", GXutil.ltrim( localUtil.ntoc( A1516MacProULin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6097MacSumTim", GXutil.ltrim( localUtil.ntoc( A6097MacSumTim, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13755MacProCDsc", A13755MacProCDsc);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1514MacProCod", GXutil.rtrim( Z1514MacProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1517MacProLin", GXutil.ltrim( localUtil.ntoc( Z1517MacProLin, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7787MacPrgNum", GXutil.ltrim( localUtil.ntoc( Z7787MacPrgNum, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8011MacPrdTt", GXutil.ltrim( localUtil.ntoc( Z8011MacPrdTt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10549MacRb", GXutil.ltrim( localUtil.ntoc( Z10549MacRb, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10550MacNH2O", GXutil.ltrim( localUtil.ntoc( Z10550MacNH2O, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z766ProForDsc", GXutil.rtrim( Z766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z771ProForTie", GXutil.ltrim( localUtil.ntoc( Z771ProForTie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z772ProForTmx", GXutil.ltrim( localUtil.ntoc( Z772ProForTmx, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z769ProForMat", GXutil.rtrim( Z769ProForMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1515MacProDsc", GXutil.rtrim( Z1515MacProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6231MacProDsc2", GXutil.rtrim( Z6231MacProDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6096MacNumPrg", GXutil.ltrim( localUtil.ntoc( Z6096MacNumPrg, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12534MacKgTTin", GXutil.ltrim( localUtil.ntoc( Z12534MacKgTTin, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13463MacProPrg2", GXutil.rtrim( Z13463MacProPrg2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13464MacProPrg3", GXutil.rtrim( Z13464MacProPrg3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1516MacProULin", GXutil.ltrim( localUtil.ntoc( Z1516MacProULin, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6097MacSumTim", GXutil.ltrim( localUtil.ntoc( Z6097MacSumTim, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13755MacProCDsc", Z13755MacProCDsc);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Proforcod( )
   {
      /* Using cursor T01RP26 */
      pr_default.execute(20, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A766ProForDsc = T01RP26_A766ProForDsc[0] ;
      A771ProForTie = T01RP26_A771ProForTie[0] ;
      A772ProForTmx = T01RP26_A772ProForTmx[0] ;
      A769ProForMat = T01RP26_A769ProForMat[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", GXutil.rtrim( A769ProForMat));
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
      setEventMetadata("VALID_MACPROCOD","{handler:'valid_Macprocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1514MacProCod',fld:'MACPROCOD',pic:''},{av:'A1515MacProDsc',fld:'MACPRODSC',pic:''},{av:'A6231MacProDsc2',fld:'MACPRODSC2',pic:''},{av:'A6096MacNumPrg',fld:'MACNUMPRG',pic:'ZZZZ9'},{av:'A12534MacKgTTin',fld:'MACKGTTIN',pic:'ZZZZZ9.99'},{av:'A13463MacProPrg2',fld:'MACPROPRG2',pic:''},{av:'A13464MacProPrg3',fld:'MACPROPRG3',pic:''},{av:'A1516MacProULin',fld:'MACPROULIN',pic:'ZZ9'},{av:'A6097MacSumTim',fld:'MACSUMTIM',pic:'ZZZZZ9'},{av:'A13755MacProCDsc',fld:'MACPROCDSC',pic:''}]");
      setEventMetadata("VALID_MACPROCOD",",oparms:[{av:'A1515MacProDsc',fld:'MACPRODSC',pic:''},{av:'A6231MacProDsc2',fld:'MACPRODSC2',pic:''},{av:'A6096MacNumPrg',fld:'MACNUMPRG',pic:'ZZZZ9'},{av:'A12534MacKgTTin',fld:'MACKGTTIN',pic:'ZZZZZ9.99'},{av:'A13463MacProPrg2',fld:'MACPROPRG2',pic:''},{av:'A13464MacProPrg3',fld:'MACPROPRG3',pic:''},{av:'A1516MacProULin',fld:'MACPROULIN',pic:'ZZ9'},{av:'A6097MacSumTim',fld:'MACSUMTIM',pic:'ZZZZZ9'},{av:'A13755MacProCDsc',fld:'MACPROCDSC',pic:''}]}");
      setEventMetadata("VALID_MACPRODSC","{handler:'valid_Macprodsc',iparms:[]");
      setEventMetadata("VALID_MACPRODSC",",oparms:[]}");
      setEventMetadata("VALID_MACPROLIN","{handler:'valid_Macprolin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1514MacProCod',fld:'MACPROCOD',pic:''},{av:'A1517MacProLin',fld:'MACPROLIN',pic:'ZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MACPROLIN",",oparms:[{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A7787MacPrgNum',fld:'MACPRGNUM',pic:'ZZ9'},{av:'A8011MacPrdTt',fld:'MACPRDTT',pic:'ZZZ9'},{av:'A10549MacRb',fld:'MACRB',pic:'ZZ9.99'},{av:'A10550MacNH2O',fld:'MACNH2O',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A771ProForTie',fld:'PROFORTIE',pic:'ZZZ9'},{av:'A772ProForTmx',fld:'PROFORTMX',pic:'ZZZ9'},{av:'A769ProForMat',fld:'PROFORMAT',pic:''},{av:'A1515MacProDsc',fld:'MACPRODSC',pic:''},{av:'A6231MacProDsc2',fld:'MACPRODSC2',pic:''},{av:'A6096MacNumPrg',fld:'MACNUMPRG',pic:'ZZZZ9'},{av:'A12534MacKgTTin',fld:'MACKGTTIN',pic:'ZZZZZ9.99'},{av:'A13463MacProPrg2',fld:'MACPROPRG2',pic:''},{av:'A13464MacProPrg3',fld:'MACPROPRG3',pic:''},{av:'A1516MacProULin',fld:'MACPROULIN',pic:'ZZ9'},{av:'A6097MacSumTim',fld:'MACSUMTIM',pic:'ZZZZZ9'},{av:'A13755MacProCDsc',fld:'MACPROCDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z1514MacProCod'},{av:'Z1517MacProLin'},{av:'Z764ProForCod'},{av:'Z7787MacPrgNum'},{av:'Z8011MacPrdTt'},{av:'Z10549MacRb'},{av:'Z10550MacNH2O'},{av:'Z407EmprNom'},{av:'Z766ProForDsc'},{av:'Z771ProForTie'},{av:'Z772ProForTmx'},{av:'Z769ProForMat'},{av:'Z1515MacProDsc'},{av:'Z6231MacProDsc2'},{av:'Z6096MacNumPrg'},{av:'Z12534MacKgTTin'},{av:'Z13463MacProPrg2'},{av:'Z13464MacProPrg3'},{av:'Z1516MacProULin'},{av:'Z6097MacSumTim'},{av:'Z13755MacProCDsc'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A771ProForTie',fld:'PROFORTIE',pic:'ZZZ9'},{av:'A772ProForTmx',fld:'PROFORTMX',pic:'ZZZ9'},{av:'A769ProForMat',fld:'PROFORMAT',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A771ProForTie',fld:'PROFORTIE',pic:'ZZZ9'},{av:'A772ProForTmx',fld:'PROFORTMX',pic:'ZZZ9'},{av:'A769ProForMat',fld:'PROFORMAT',pic:''}]}");
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
      pr_default.close(20);
      pr_default.close(18);
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z1514MacProCod = "" ;
      Z10549MacRb = DecimalUtil.ZERO ;
      Z764ProForCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      A1514MacProCod = "" ;
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
      A1515MacProDsc = "" ;
      A6231MacProDsc2 = "" ;
      A12534MacKgTTin = DecimalUtil.ZERO ;
      A13463MacProPrg2 = "" ;
      A13464MacProPrg3 = "" ;
      A407EmprNom = "" ;
      A13755MacProCDsc = "" ;
      A766ProForDsc = "" ;
      A769ProForMat = "" ;
      A10549MacRb = DecimalUtil.ZERO ;
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
      Z1515MacProDsc = "" ;
      Z6231MacProDsc2 = "" ;
      Z12534MacKgTTin = DecimalUtil.ZERO ;
      Z13463MacProPrg2 = "" ;
      Z13464MacProPrg3 = "" ;
      Z766ProForDsc = "" ;
      Z769ProForMat = "" ;
      T01RP10_A1517MacProLin = new short[1] ;
      T01RP10_A1515MacProDsc = new String[] {""} ;
      T01RP10_A6231MacProDsc2 = new String[] {""} ;
      T01RP10_A6096MacNumPrg = new int[1] ;
      T01RP10_A12534MacKgTTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RP10_A13463MacProPrg2 = new String[] {""} ;
      T01RP10_A13464MacProPrg3 = new String[] {""} ;
      T01RP10_A407EmprNom = new String[] {""} ;
      T01RP10_n407EmprNom = new boolean[] {false} ;
      T01RP10_A1516MacProULin = new short[1] ;
      T01RP10_A766ProForDsc = new String[] {""} ;
      T01RP10_A771ProForTie = new short[1] ;
      T01RP10_A772ProForTmx = new short[1] ;
      T01RP10_A769ProForMat = new String[] {""} ;
      T01RP10_A7787MacPrgNum = new short[1] ;
      T01RP10_A8011MacPrdTt = new short[1] ;
      T01RP10_A10549MacRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RP10_A10550MacNH2O = new short[1] ;
      T01RP10_A396EmprCod = new String[] {""} ;
      T01RP10_A764ProForCod = new String[] {""} ;
      T01RP10_A1514MacProCod = new String[] {""} ;
      T01RP10_A6097MacSumTim = new int[1] ;
      T01RP10_n6097MacSumTim = new boolean[] {false} ;
      T01RP4_A407EmprNom = new String[] {""} ;
      T01RP4_n407EmprNom = new boolean[] {false} ;
      T01RP5_A766ProForDsc = new String[] {""} ;
      T01RP5_A771ProForTie = new short[1] ;
      T01RP5_A772ProForTmx = new short[1] ;
      T01RP5_A769ProForMat = new String[] {""} ;
      T01RP6_A1515MacProDsc = new String[] {""} ;
      T01RP6_A6231MacProDsc2 = new String[] {""} ;
      T01RP6_A6096MacNumPrg = new int[1] ;
      T01RP6_A12534MacKgTTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RP6_A13463MacProPrg2 = new String[] {""} ;
      T01RP6_A13464MacProPrg3 = new String[] {""} ;
      T01RP6_A1516MacProULin = new short[1] ;
      T01RP8_A6097MacSumTim = new int[1] ;
      T01RP8_n6097MacSumTim = new boolean[] {false} ;
      T01RP11_A407EmprNom = new String[] {""} ;
      T01RP11_n407EmprNom = new boolean[] {false} ;
      T01RP12_A766ProForDsc = new String[] {""} ;
      T01RP12_A771ProForTie = new short[1] ;
      T01RP12_A772ProForTmx = new short[1] ;
      T01RP12_A769ProForMat = new String[] {""} ;
      T01RP13_A1515MacProDsc = new String[] {""} ;
      T01RP13_A6231MacProDsc2 = new String[] {""} ;
      T01RP13_A6096MacNumPrg = new int[1] ;
      T01RP13_A12534MacKgTTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RP13_A13463MacProPrg2 = new String[] {""} ;
      T01RP13_A13464MacProPrg3 = new String[] {""} ;
      T01RP13_A1516MacProULin = new short[1] ;
      T01RP15_A6097MacSumTim = new int[1] ;
      T01RP15_n6097MacSumTim = new boolean[] {false} ;
      T01RP16_A396EmprCod = new String[] {""} ;
      T01RP16_A1514MacProCod = new String[] {""} ;
      T01RP16_A1517MacProLin = new short[1] ;
      T01RP3_A1517MacProLin = new short[1] ;
      T01RP3_A7787MacPrgNum = new short[1] ;
      T01RP3_A8011MacPrdTt = new short[1] ;
      T01RP3_A10549MacRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RP3_A10550MacNH2O = new short[1] ;
      T01RP3_A396EmprCod = new String[] {""} ;
      T01RP3_A764ProForCod = new String[] {""} ;
      T01RP3_A1514MacProCod = new String[] {""} ;
      sMode215 = "" ;
      T01RP17_A396EmprCod = new String[] {""} ;
      T01RP17_A1514MacProCod = new String[] {""} ;
      T01RP17_A1517MacProLin = new short[1] ;
      T01RP18_A396EmprCod = new String[] {""} ;
      T01RP18_A1514MacProCod = new String[] {""} ;
      T01RP18_A1517MacProLin = new short[1] ;
      T01RP2_A1517MacProLin = new short[1] ;
      T01RP2_A7787MacPrgNum = new short[1] ;
      T01RP2_A8011MacPrdTt = new short[1] ;
      T01RP2_A10549MacRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RP2_A10550MacNH2O = new short[1] ;
      T01RP2_A396EmprCod = new String[] {""} ;
      T01RP2_A764ProForCod = new String[] {""} ;
      T01RP2_A1514MacProCod = new String[] {""} ;
      T01RP22_A407EmprNom = new String[] {""} ;
      T01RP22_n407EmprNom = new boolean[] {false} ;
      T01RP23_A1515MacProDsc = new String[] {""} ;
      T01RP23_A6231MacProDsc2 = new String[] {""} ;
      T01RP23_A6096MacNumPrg = new int[1] ;
      T01RP23_A12534MacKgTTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RP23_A13463MacProPrg2 = new String[] {""} ;
      T01RP23_A13464MacProPrg3 = new String[] {""} ;
      T01RP23_A1516MacProULin = new short[1] ;
      T01RP25_A6097MacSumTim = new int[1] ;
      T01RP25_n6097MacSumTim = new boolean[] {false} ;
      T01RP26_A766ProForDsc = new String[] {""} ;
      T01RP26_A771ProForTie = new short[1] ;
      T01RP26_A772ProForTmx = new short[1] ;
      T01RP26_A769ProForMat = new String[] {""} ;
      T01RP27_A396EmprCod = new String[] {""} ;
      T01RP27_A1514MacProCod = new String[] {""} ;
      T01RP27_A1517MacProLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z13755MacProCDsc = "" ;
      ZZ396EmprCod = "" ;
      ZZ1514MacProCod = "" ;
      ZZ764ProForCod = "" ;
      ZZ10549MacRb = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ766ProForDsc = "" ;
      ZZ769ProForMat = "" ;
      ZZ1515MacProDsc = "" ;
      ZZ6231MacProDsc2 = "" ;
      ZZ12534MacKgTTin = DecimalUtil.ZERO ;
      ZZ13463MacProPrg2 = "" ;
      ZZ13464MacProPrg3 = "" ;
      ZZ13755MacProCDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.estructuratablalmacpr__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.estructuratablalmacpr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.estructuratablalmacpr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.estructuratablalmacpr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.estructuratablalmacpr__default(),
         new Object[] {
             new Object[] {
            T01RP2_A1517MacProLin, T01RP2_A7787MacPrgNum, T01RP2_A8011MacPrdTt, T01RP2_A10549MacRb, T01RP2_A10550MacNH2O, T01RP2_A396EmprCod, T01RP2_A764ProForCod, T01RP2_A1514MacProCod
            }
            , new Object[] {
            T01RP3_A1517MacProLin, T01RP3_A7787MacPrgNum, T01RP3_A8011MacPrdTt, T01RP3_A10549MacRb, T01RP3_A10550MacNH2O, T01RP3_A396EmprCod, T01RP3_A764ProForCod, T01RP3_A1514MacProCod
            }
            , new Object[] {
            T01RP4_A407EmprNom, T01RP4_n407EmprNom
            }
            , new Object[] {
            T01RP5_A766ProForDsc, T01RP5_A771ProForTie, T01RP5_A772ProForTmx, T01RP5_A769ProForMat
            }
            , new Object[] {
            T01RP6_A1515MacProDsc, T01RP6_A6231MacProDsc2, T01RP6_A6096MacNumPrg, T01RP6_A12534MacKgTTin, T01RP6_A13463MacProPrg2, T01RP6_A13464MacProPrg3, T01RP6_A1516MacProULin
            }
            , new Object[] {
            T01RP8_A6097MacSumTim, T01RP8_n6097MacSumTim
            }
            , new Object[] {
            T01RP10_A1517MacProLin, T01RP10_A1515MacProDsc, T01RP10_A6231MacProDsc2, T01RP10_A6096MacNumPrg, T01RP10_A12534MacKgTTin, T01RP10_A13463MacProPrg2, T01RP10_A13464MacProPrg3, T01RP10_A407EmprNom, T01RP10_n407EmprNom, T01RP10_A1516MacProULin,
            T01RP10_A766ProForDsc, T01RP10_A771ProForTie, T01RP10_A772ProForTmx, T01RP10_A769ProForMat, T01RP10_A7787MacPrgNum, T01RP10_A8011MacPrdTt, T01RP10_A10549MacRb, T01RP10_A10550MacNH2O, T01RP10_A396EmprCod, T01RP10_A764ProForCod,
            T01RP10_A1514MacProCod, T01RP10_A6097MacSumTim, T01RP10_n6097MacSumTim
            }
            , new Object[] {
            T01RP11_A407EmprNom, T01RP11_n407EmprNom
            }
            , new Object[] {
            T01RP12_A766ProForDsc, T01RP12_A771ProForTie, T01RP12_A772ProForTmx, T01RP12_A769ProForMat
            }
            , new Object[] {
            T01RP13_A1515MacProDsc, T01RP13_A6231MacProDsc2, T01RP13_A6096MacNumPrg, T01RP13_A12534MacKgTTin, T01RP13_A13463MacProPrg2, T01RP13_A13464MacProPrg3, T01RP13_A1516MacProULin
            }
            , new Object[] {
            T01RP15_A6097MacSumTim, T01RP15_n6097MacSumTim
            }
            , new Object[] {
            T01RP16_A396EmprCod, T01RP16_A1514MacProCod, T01RP16_A1517MacProLin
            }
            , new Object[] {
            T01RP17_A396EmprCod, T01RP17_A1514MacProCod, T01RP17_A1517MacProLin
            }
            , new Object[] {
            T01RP18_A396EmprCod, T01RP18_A1514MacProCod, T01RP18_A1517MacProLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RP22_A407EmprNom, T01RP22_n407EmprNom
            }
            , new Object[] {
            T01RP23_A1515MacProDsc, T01RP23_A6231MacProDsc2, T01RP23_A6096MacNumPrg, T01RP23_A12534MacKgTTin, T01RP23_A13463MacProPrg2, T01RP23_A13464MacProPrg3, T01RP23_A1516MacProULin
            }
            , new Object[] {
            T01RP25_A6097MacSumTim, T01RP25_n6097MacSumTim
            }
            , new Object[] {
            T01RP26_A766ProForDsc, T01RP26_A771ProForTie, T01RP26_A772ProForTmx, T01RP26_A769ProForMat
            }
            , new Object[] {
            T01RP27_A396EmprCod, T01RP27_A1514MacProCod, T01RP27_A1517MacProLin
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z1517MacProLin ;
   private short Z7787MacPrgNum ;
   private short Z8011MacPrdTt ;
   private short Z10550MacNH2O ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1516MacProULin ;
   private short A1517MacProLin ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short A7787MacPrgNum ;
   private short A8011MacPrdTt ;
   private short A10550MacNH2O ;
   private short Z1516MacProULin ;
   private short Z771ProForTie ;
   private short Z772ProForTmx ;
   private short RcdFound215 ;
   private short nIsDirty_215 ;
   private short ZZ1517MacProLin ;
   private short ZZ7787MacPrgNum ;
   private short ZZ8011MacPrdTt ;
   private short ZZ10550MacNH2O ;
   private short ZZ771ProForTie ;
   private short ZZ772ProForTmx ;
   private short ZZ1516MacProULin ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMacProCod_Enabled ;
   private int edtMacProDsc_Enabled ;
   private int edtMacProDsc2_Enabled ;
   private int A6096MacNumPrg ;
   private int edtMacNumPrg_Enabled ;
   private int edtMacKgTTin_Enabled ;
   private int edtMacProPrg2_Enabled ;
   private int edtMacProPrg3_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMacProULin_Enabled ;
   private int A6097MacSumTim ;
   private int edtMacSumTim_Enabled ;
   private int edtMacProCDsc_Enabled ;
   private int edtMacProLin_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtProForTie_Enabled ;
   private int edtProForTmx_Enabled ;
   private int edtProForMat_Enabled ;
   private int edtMacPrgNum_Enabled ;
   private int edtMacPrdTt_Enabled ;
   private int edtMacRb_Enabled ;
   private int edtMacNH2O_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int Z6096MacNumPrg ;
   private int Z6097MacSumTim ;
   private int idxLst ;
   private int ZZ6096MacNumPrg ;
   private int ZZ6097MacSumTim ;
   private java.math.BigDecimal Z10549MacRb ;
   private java.math.BigDecimal A12534MacKgTTin ;
   private java.math.BigDecimal A10549MacRb ;
   private java.math.BigDecimal Z12534MacKgTTin ;
   private java.math.BigDecimal ZZ10549MacRb ;
   private java.math.BigDecimal ZZ12534MacKgTTin ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z1514MacProCod ;
   private String Z764ProForCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A1514MacProCod ;
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
   private String edtMacProCod_Internalname ;
   private String edtMacProCod_Jsonclick ;
   private String edtMacProDsc_Internalname ;
   private String A1515MacProDsc ;
   private String edtMacProDsc_Jsonclick ;
   private String edtMacProDsc2_Internalname ;
   private String A6231MacProDsc2 ;
   private String edtMacProDsc2_Jsonclick ;
   private String edtMacNumPrg_Internalname ;
   private String edtMacNumPrg_Jsonclick ;
   private String edtMacKgTTin_Internalname ;
   private String edtMacKgTTin_Jsonclick ;
   private String edtMacProPrg2_Internalname ;
   private String A13463MacProPrg2 ;
   private String edtMacProPrg2_Jsonclick ;
   private String edtMacProPrg3_Internalname ;
   private String A13464MacProPrg3 ;
   private String edtMacProPrg3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtMacProULin_Internalname ;
   private String edtMacProULin_Jsonclick ;
   private String edtMacSumTim_Internalname ;
   private String edtMacSumTim_Jsonclick ;
   private String edtMacProCDsc_Internalname ;
   private String edtMacProCDsc_Jsonclick ;
   private String edtMacProLin_Internalname ;
   private String edtMacProLin_Jsonclick ;
   private String edtProForCod_Internalname ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Jsonclick ;
   private String edtProForTie_Internalname ;
   private String edtProForTie_Jsonclick ;
   private String edtProForTmx_Internalname ;
   private String edtProForTmx_Jsonclick ;
   private String edtProForMat_Internalname ;
   private String A769ProForMat ;
   private String edtProForMat_Jsonclick ;
   private String edtMacPrgNum_Internalname ;
   private String edtMacPrgNum_Jsonclick ;
   private String edtMacPrdTt_Internalname ;
   private String edtMacPrdTt_Jsonclick ;
   private String edtMacRb_Internalname ;
   private String edtMacRb_Jsonclick ;
   private String edtMacNH2O_Internalname ;
   private String edtMacNH2O_Jsonclick ;
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
   private String Z1515MacProDsc ;
   private String Z6231MacProDsc2 ;
   private String Z13463MacProPrg2 ;
   private String Z13464MacProPrg3 ;
   private String Z766ProForDsc ;
   private String Z769ProForMat ;
   private String sMode215 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ1514MacProCod ;
   private String ZZ764ProForCod ;
   private String ZZ407EmprNom ;
   private String ZZ766ProForDsc ;
   private String ZZ769ProForMat ;
   private String ZZ1515MacProDsc ;
   private String ZZ6231MacProDsc2 ;
   private String ZZ13463MacProPrg2 ;
   private String ZZ13464MacProPrg3 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n6097MacSumTim ;
   private String A13755MacProCDsc ;
   private String Z13755MacProCDsc ;
   private String ZZ13755MacProCDsc ;
   private IDataStoreProvider pr_default ;
   private short[] T01RP10_A1517MacProLin ;
   private String[] T01RP10_A1515MacProDsc ;
   private String[] T01RP10_A6231MacProDsc2 ;
   private int[] T01RP10_A6096MacNumPrg ;
   private java.math.BigDecimal[] T01RP10_A12534MacKgTTin ;
   private String[] T01RP10_A13463MacProPrg2 ;
   private String[] T01RP10_A13464MacProPrg3 ;
   private String[] T01RP10_A407EmprNom ;
   private boolean[] T01RP10_n407EmprNom ;
   private short[] T01RP10_A1516MacProULin ;
   private String[] T01RP10_A766ProForDsc ;
   private short[] T01RP10_A771ProForTie ;
   private short[] T01RP10_A772ProForTmx ;
   private String[] T01RP10_A769ProForMat ;
   private short[] T01RP10_A7787MacPrgNum ;
   private short[] T01RP10_A8011MacPrdTt ;
   private java.math.BigDecimal[] T01RP10_A10549MacRb ;
   private short[] T01RP10_A10550MacNH2O ;
   private String[] T01RP10_A396EmprCod ;
   private String[] T01RP10_A764ProForCod ;
   private String[] T01RP10_A1514MacProCod ;
   private int[] T01RP10_A6097MacSumTim ;
   private boolean[] T01RP10_n6097MacSumTim ;
   private String[] T01RP4_A407EmprNom ;
   private boolean[] T01RP4_n407EmprNom ;
   private String[] T01RP5_A766ProForDsc ;
   private short[] T01RP5_A771ProForTie ;
   private short[] T01RP5_A772ProForTmx ;
   private String[] T01RP5_A769ProForMat ;
   private String[] T01RP6_A1515MacProDsc ;
   private String[] T01RP6_A6231MacProDsc2 ;
   private int[] T01RP6_A6096MacNumPrg ;
   private java.math.BigDecimal[] T01RP6_A12534MacKgTTin ;
   private String[] T01RP6_A13463MacProPrg2 ;
   private String[] T01RP6_A13464MacProPrg3 ;
   private short[] T01RP6_A1516MacProULin ;
   private int[] T01RP8_A6097MacSumTim ;
   private boolean[] T01RP8_n6097MacSumTim ;
   private String[] T01RP11_A407EmprNom ;
   private boolean[] T01RP11_n407EmprNom ;
   private String[] T01RP12_A766ProForDsc ;
   private short[] T01RP12_A771ProForTie ;
   private short[] T01RP12_A772ProForTmx ;
   private String[] T01RP12_A769ProForMat ;
   private String[] T01RP13_A1515MacProDsc ;
   private String[] T01RP13_A6231MacProDsc2 ;
   private int[] T01RP13_A6096MacNumPrg ;
   private java.math.BigDecimal[] T01RP13_A12534MacKgTTin ;
   private String[] T01RP13_A13463MacProPrg2 ;
   private String[] T01RP13_A13464MacProPrg3 ;
   private short[] T01RP13_A1516MacProULin ;
   private int[] T01RP15_A6097MacSumTim ;
   private boolean[] T01RP15_n6097MacSumTim ;
   private String[] T01RP16_A396EmprCod ;
   private String[] T01RP16_A1514MacProCod ;
   private short[] T01RP16_A1517MacProLin ;
   private short[] T01RP3_A1517MacProLin ;
   private short[] T01RP3_A7787MacPrgNum ;
   private short[] T01RP3_A8011MacPrdTt ;
   private java.math.BigDecimal[] T01RP3_A10549MacRb ;
   private short[] T01RP3_A10550MacNH2O ;
   private String[] T01RP3_A396EmprCod ;
   private String[] T01RP3_A764ProForCod ;
   private String[] T01RP3_A1514MacProCod ;
   private String[] T01RP17_A396EmprCod ;
   private String[] T01RP17_A1514MacProCod ;
   private short[] T01RP17_A1517MacProLin ;
   private String[] T01RP18_A396EmprCod ;
   private String[] T01RP18_A1514MacProCod ;
   private short[] T01RP18_A1517MacProLin ;
   private short[] T01RP2_A1517MacProLin ;
   private short[] T01RP2_A7787MacPrgNum ;
   private short[] T01RP2_A8011MacPrdTt ;
   private java.math.BigDecimal[] T01RP2_A10549MacRb ;
   private short[] T01RP2_A10550MacNH2O ;
   private String[] T01RP2_A396EmprCod ;
   private String[] T01RP2_A764ProForCod ;
   private String[] T01RP2_A1514MacProCod ;
   private String[] T01RP22_A407EmprNom ;
   private boolean[] T01RP22_n407EmprNom ;
   private String[] T01RP23_A1515MacProDsc ;
   private String[] T01RP23_A6231MacProDsc2 ;
   private int[] T01RP23_A6096MacNumPrg ;
   private java.math.BigDecimal[] T01RP23_A12534MacKgTTin ;
   private String[] T01RP23_A13463MacProPrg2 ;
   private String[] T01RP23_A13464MacProPrg3 ;
   private short[] T01RP23_A1516MacProULin ;
   private int[] T01RP25_A6097MacSumTim ;
   private boolean[] T01RP25_n6097MacSumTim ;
   private String[] T01RP26_A766ProForDsc ;
   private short[] T01RP26_A771ProForTie ;
   private short[] T01RP26_A772ProForTmx ;
   private String[] T01RP26_A769ProForMat ;
   private String[] T01RP27_A396EmprCod ;
   private String[] T01RP27_A1514MacProCod ;
   private short[] T01RP27_A1517MacProLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class estructuratablalmacpr__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class estructuratablalmacpr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class estructuratablalmacpr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class estructuratablalmacpr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class estructuratablalmacpr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RP2", "SELECT MacProLin, MacPrgNum, MacPrdTt, MacRb, MacNH2O, EmprCod, ProForCod, MacProCod FROM TXPLMACPR WHERE EmprCod = ? AND MacProCod = ? AND MacProLin = ?  FOR UPDATE OF MacPrgNum, MacPrdTt, MacRb, MacNH2O, ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP3", "SELECT MacProLin, MacPrgNum, MacPrdTt, MacRb, MacNH2O, EmprCod, ProForCod, MacProCod FROM TXPLMACPR WHERE EmprCod = ? AND MacProCod = ? AND MacProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP5", "SELECT ProForDsc, ProForTie, ProForTmx, ProForMat FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP6", "SELECT MacProDsc, MacProDsc2, MacNumPrg, MacKgTTin, MacProPrg2, MacProPrg3, MacProULin FROM TXPCMACPR WHERE EmprCod = ? AND MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP8", "SELECT COALESCE( T1.MacSumTim, 0) AS MacSumTim FROM (SELECT SUM(MacPrdTt) AS MacSumTim, EmprCod, MacProCod FROM TXPLMACPR GROUP BY EmprCod, MacProCod ) T1 WHERE T1.EmprCod = ? AND T1.MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP10", "SELECT /*+ FIRST_ROWS(100) */ TM1.MacProLin, T3.MacProDsc, T3.MacProDsc2, T3.MacNumPrg, T3.MacKgTTin, T3.MacProPrg2, T3.MacProPrg3, T2.EmprNom, T3.MacProULin, T5.ProForDsc, T5.ProForTie, T5.ProForTmx, T5.ProForMat, TM1.MacPrgNum, TM1.MacPrdTt, TM1.MacRb, TM1.MacNH2O, TM1.EmprCod, TM1.ProForCod, TM1.MacProCod, COALESCE( T4.MacSumTim, 0) AS MacSumTim FROM ((((TXPLMACPR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCMACPR T3 ON T3.EmprCod = TM1.EmprCod AND T3.MacProCod = TM1.MacProCod) LEFT JOIN (SELECT SUM(TM1.MacPrdTt) AS MacSumTim, TM1.EmprCod, TM1.MacProCod FROM TXPLMACPR TM1 GROUP BY TM1.EmprCod, TM1.MacProCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.MacProCod = TM1.MacProCod) INNER JOIN TXPCPROFO T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProForCod = TM1.ProForCod) WHERE TM1.EmprCod = ? and TM1.MacProCod = ? and TM1.MacProLin = ? ORDER BY TM1.EmprCod, TM1.MacProCod, TM1.MacProLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP11", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP12", "SELECT ProForDsc, ProForTie, ProForTmx, ProForMat FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP13", "SELECT MacProDsc, MacProDsc2, MacNumPrg, MacKgTTin, MacProPrg2, MacProPrg3, MacProULin FROM TXPCMACPR WHERE EmprCod = ? AND MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP15", "SELECT COALESCE( T1.MacSumTim, 0) AS MacSumTim FROM (SELECT SUM(MacPrdTt) AS MacSumTim, EmprCod, MacProCod FROM TXPLMACPR GROUP BY EmprCod, MacProCod ) T1 WHERE T1.EmprCod = ? AND T1.MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP16", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacProCod, MacProLin FROM TXPLMACPR WHERE EmprCod = ? AND MacProCod = ? AND MacProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacProCod, MacProLin FROM TXPLMACPR WHERE ( EmprCod > ? or EmprCod = ? and MacProCod > ? or MacProCod = ? and EmprCod = ? and MacProLin > ?) ORDER BY EmprCod, MacProCod, MacProLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RP18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacProCod, MacProLin FROM TXPLMACPR WHERE ( EmprCod < ? or EmprCod = ? and MacProCod < ? or MacProCod = ? and EmprCod = ? and MacProLin < ?) ORDER BY EmprCod DESC, MacProCod DESC, MacProLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RP19", "INSERT INTO TXPLMACPR(MacProLin, MacPrgNum, MacPrdTt, MacRb, MacNH2O, EmprCod, ProForCod, MacProCod, MacProNPro, MacProTPau) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK, "TXPLMACPR")
         ,new UpdateCursor("T01RP20", "UPDATE TXPLMACPR SET MacPrgNum=?, MacPrdTt=?, MacRb=?, MacNH2O=?, ProForCod=?  WHERE EmprCod = ? AND MacProCod = ? AND MacProLin = ?", GX_NOMASK, "TXPLMACPR")
         ,new UpdateCursor("T01RP21", "DELETE FROM TXPLMACPR  WHERE EmprCod = ? AND MacProCod = ? AND MacProLin = ?", GX_NOMASK, "TXPLMACPR")
         ,new ForEachCursor("T01RP22", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP23", "SELECT MacProDsc, MacProDsc2, MacNumPrg, MacKgTTin, MacProPrg2, MacProPrg3, MacProULin FROM TXPCMACPR WHERE EmprCod = ? AND MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP25", "SELECT COALESCE( T1.MacSumTim, 0) AS MacSumTim FROM (SELECT SUM(MacPrdTt) AS MacSumTim, EmprCod, MacProCod FROM TXPLMACPR GROUP BY EmprCod, MacProCod ) T1 WHERE T1.EmprCod = ? AND T1.MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP26", "SELECT ProForDsc, ProForTie, ProForTmx, ProForMat FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RP27", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MacProCod, MacProLin FROM TXPLMACPR ORDER BY EmprCod, MacProCod, MacProLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 3);
               ((String[]) buf[19])[0] = rslt.getString(19, 6);
               ((String[]) buf[20])[0] = rslt.getString(20, 6);
               ((int[]) buf[21])[0] = rslt.getInt(21);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 6);
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

