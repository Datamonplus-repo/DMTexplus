package app.ponteway.v1 ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ogguiaimport_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Oliveira Gonçalo Guia Remesa", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtogLinha_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ogguiaimport_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ogguiaimport_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ogguiaimport_impl.class ));
   }

   public ogguiaimport_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Oliveira Gonçalo Guia Remesa", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_PonteWay\\v1\\OgGuiaImport.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_PonteWay\\v1\\OgGuiaImport.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogLinha_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogLinha_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogLinha_Internalname, GXutil.ltrim( localUtil.ntoc( A14503ogLinha, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogLinha_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14503ogLinha), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14503ogLinha), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogLinha_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogLinha_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogEmprCod_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogEmprCod_Internalname, A14504ogEmprCod, GXutil.rtrim( localUtil.format( A14504ogEmprCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogEmprCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14505ogCliCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14505ogCliCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14505ogCliCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogCliCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogNmrGuia_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogNmrGuia_Internalname, httpContext.getMessage( "Guia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogNmrGuia_Internalname, GXutil.ltrim( localUtil.ntoc( A14522ogNmrGuia, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogNmrGuia_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14522ogNmrGuia), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14522ogNmrGuia), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogNmrGuia_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogNmrGuia_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogSerie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogSerie_Internalname, httpContext.getMessage( "Serie", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogSerie_Internalname, GXutil.ltrim( localUtil.ntoc( A14523ogSerie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogSerie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14523ogSerie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14523ogSerie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogSerie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogSerie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogFecha_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogFecha_Internalname, httpContext.getMessage( "Doc.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtogFecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogFecha_Internalname, localUtil.format(A14506ogFecha, "99/99/99"), localUtil.format( A14506ogFecha, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogFecha_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogFecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtogFecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtogFecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogCodArt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogCodArt_Internalname, httpContext.getMessage( "Articu", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogCodArt_Internalname, A14507ogCodArt, GXutil.rtrim( localUtil.format( A14507ogCodArt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogCodArt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogCodArt_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogRolos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogRolos_Internalname, httpContext.getMessage( "Rollos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogRolos_Internalname, GXutil.ltrim( localUtil.ntoc( A14508ogRolos, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogRolos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14508ogRolos), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14508ogRolos), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogRolos_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogRolos_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogRolos__Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogRolos__Internalname, httpContext.getMessage( "Rolos_", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogRolos__Internalname, GXutil.ltrim( localUtil.ntoc( A14556ogRolos_, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogRolos__Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14556ogRolos_), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14556ogRolos_), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogRolos__Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogRolos__Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogQuant_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogQuant_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogQuant_Internalname, GXutil.ltrim( localUtil.ntoc( A14509ogQuant, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogQuant_Enabled!=0) ? localUtil.format( A14509ogQuant, "ZZZ9.99") : localUtil.format( A14509ogQuant, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogQuant_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogQuant_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogQuant__Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogQuant__Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogQuant__Internalname, GXutil.ltrim( localUtil.ntoc( A14557ogQuant_, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogQuant__Enabled!=0) ? localUtil.format( A14557ogQuant_, "ZZZ9.99") : localUtil.format( A14557ogQuant_, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogQuant__Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogQuant__Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogUnidad_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogUnidad_Internalname, httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogUnidad_Internalname, A14510ogUnidad, GXutil.rtrim( localUtil.format( A14510ogUnidad, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogUnidad_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogUnidad_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogUnidad__Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogUnidad__Internalname, httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogUnidad__Internalname, A14558ogUnidad_, GXutil.rtrim( localUtil.format( A14558ogUnidad_, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogUnidad__Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogUnidad__Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogReferen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogReferen_Internalname, httpContext.getMessage( "Referencia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogReferen_Internalname, A14528ogReferen, GXutil.rtrim( localUtil.format( A14528ogReferen, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogReferen_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogReferen_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogReclam_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogReclam_Internalname, httpContext.getMessage( "Reclamacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogReclam_Internalname, A14511ogReclam, GXutil.rtrim( localUtil.format( A14511ogReclam, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogReclam_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogReclam_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogLote_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogLote_Internalname, A14518ogLote, GXutil.rtrim( localUtil.format( A14518ogLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogLote_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogLote_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogJogo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogJogo_Internalname, httpContext.getMessage( "Juego", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogJogo_Internalname, A14512ogJogo, GXutil.rtrim( localUtil.format( A14512ogJogo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogJogo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogJogo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogPoleg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogPoleg_Internalname, httpContext.getMessage( "Polegadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogPoleg_Internalname, A14513ogPoleg, GXutil.rtrim( localUtil.format( A14513ogPoleg, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogPoleg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogPoleg_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogFio_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogFio_Internalname, httpContext.getMessage( "Fio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogFio_Internalname, A14514ogFio, GXutil.rtrim( localUtil.format( A14514ogFio, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogFio_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogFio_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogFio__Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogFio__Internalname, httpContext.getMessage( "Fio_", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogFio__Internalname, A14560ogFio_, GXutil.rtrim( localUtil.format( A14560ogFio_, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogFio__Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogFio__Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogMaqui_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogMaqui_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogMaqui_Internalname, A14515ogMaqui, GXutil.rtrim( localUtil.format( A14515ogMaqui, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogMaqui_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogMaqui_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogEntrada_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogEntrada_Internalname, httpContext.getMessage( "de Entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogEntrada_Internalname, A14516ogEntrada, GXutil.rtrim( localUtil.format( A14516ogEntrada, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogEntrada_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogEntrada_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogVossaR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogVossaR_Internalname, httpContext.getMessage( "Reccepcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogVossaR_Internalname, A14517ogVossaR, GXutil.rtrim( localUtil.format( A14517ogVossaR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogVossaR_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogVossaR_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogArtiCR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogArtiCR_Internalname, httpContext.getMessage( "CR", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogArtiCR_Internalname, A14519ogArtiCR, GXutil.rtrim( localUtil.format( A14519ogArtiCR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogArtiCR_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogArtiCR_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogArtiAC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogArtiAC_Internalname, httpContext.getMessage( "AC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogArtiAC_Internalname, A14520ogArtiAC, GXutil.rtrim( localUtil.format( A14520ogArtiAC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogArtiAC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogArtiAC_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogARecCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogARecCod_Internalname, httpContext.getMessage( "Recepcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogARecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14521ogARecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogARecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14521ogARecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14521ogARecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogARecCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogARecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogLocaliza_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogLocaliza_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogLocaliza_Internalname, A14554ogLocaliza, GXutil.rtrim( localUtil.format( A14554ogLocaliza, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogLocaliza_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogLocaliza_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogLocalizc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtogLocalizc_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtogLocalizc_Internalname, A14559ogLocalizc, GXutil.rtrim( localUtil.format( A14559ogLocalizc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogLocalizc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtogLocalizc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\v1\\OgGuiaImport.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PonteWay\\v1\\OgGuiaImport.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PonteWay\\v1\\OgGuiaImport.htm");
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
         Z14503ogLinha = localUtil.ctol( httpContext.cgiGet( "Z14503ogLinha"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14504ogEmprCod = httpContext.cgiGet( "Z14504ogEmprCod") ;
         Z14505ogCliCod = localUtil.ctol( httpContext.cgiGet( "Z14505ogCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14522ogNmrGuia = localUtil.ctol( httpContext.cgiGet( "Z14522ogNmrGuia"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14523ogSerie = (short)(localUtil.ctol( httpContext.cgiGet( "Z14523ogSerie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14506ogFecha = localUtil.ctod( httpContext.cgiGet( "Z14506ogFecha"), 0) ;
         Z14507ogCodArt = httpContext.cgiGet( "Z14507ogCodArt") ;
         Z14508ogRolos = (short)(localUtil.ctol( httpContext.cgiGet( "Z14508ogRolos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14556ogRolos_ = (short)(localUtil.ctol( httpContext.cgiGet( "Z14556ogRolos_"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14509ogQuant = localUtil.ctond( httpContext.cgiGet( "Z14509ogQuant")) ;
         Z14557ogQuant_ = localUtil.ctond( httpContext.cgiGet( "Z14557ogQuant_")) ;
         Z14510ogUnidad = httpContext.cgiGet( "Z14510ogUnidad") ;
         Z14558ogUnidad_ = httpContext.cgiGet( "Z14558ogUnidad_") ;
         Z14528ogReferen = httpContext.cgiGet( "Z14528ogReferen") ;
         Z14511ogReclam = httpContext.cgiGet( "Z14511ogReclam") ;
         Z14518ogLote = httpContext.cgiGet( "Z14518ogLote") ;
         Z14512ogJogo = httpContext.cgiGet( "Z14512ogJogo") ;
         Z14513ogPoleg = httpContext.cgiGet( "Z14513ogPoleg") ;
         Z14514ogFio = httpContext.cgiGet( "Z14514ogFio") ;
         Z14560ogFio_ = httpContext.cgiGet( "Z14560ogFio_") ;
         Z14515ogMaqui = httpContext.cgiGet( "Z14515ogMaqui") ;
         Z14516ogEntrada = httpContext.cgiGet( "Z14516ogEntrada") ;
         Z14517ogVossaR = httpContext.cgiGet( "Z14517ogVossaR") ;
         Z14519ogArtiCR = httpContext.cgiGet( "Z14519ogArtiCR") ;
         Z14520ogArtiAC = httpContext.cgiGet( "Z14520ogArtiAC") ;
         Z14521ogARecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z14521ogARecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14554ogLocaliza = httpContext.cgiGet( "Z14554ogLocaliza") ;
         Z14559ogLocalizc = httpContext.cgiGet( "Z14559ogLocalizc") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtogLinha_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtogLinha_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGLINHA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtogLinha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14503ogLinha = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14503ogLinha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14503ogLinha), 10, 0));
         }
         else
         {
            A14503ogLinha = localUtil.ctol( httpContext.cgiGet( edtogLinha_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14503ogLinha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14503ogLinha), 10, 0));
         }
         A14504ogEmprCod = httpContext.cgiGet( edtogEmprCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14504ogEmprCod", A14504ogEmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtogCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtogCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGCLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtogCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14505ogCliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
         }
         else
         {
            A14505ogCliCod = localUtil.ctol( httpContext.cgiGet( edtogCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtogNmrGuia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtogNmrGuia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGNMRGUIA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtogNmrGuia_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14522ogNmrGuia = 0 ;
            n14522ogNmrGuia = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14522ogNmrGuia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14522ogNmrGuia), 10, 0));
         }
         else
         {
            A14522ogNmrGuia = localUtil.ctol( httpContext.cgiGet( edtogNmrGuia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n14522ogNmrGuia = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14522ogNmrGuia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14522ogNmrGuia), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtogSerie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtogSerie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGSERIE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtogSerie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14523ogSerie = (short)(0) ;
            n14523ogSerie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14523ogSerie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14523ogSerie), 4, 0));
         }
         else
         {
            A14523ogSerie = (short)(localUtil.ctol( httpContext.cgiGet( edtogSerie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14523ogSerie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14523ogSerie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14523ogSerie), 4, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtogFecha_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "OGFECHA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtogFecha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14506ogFecha = GXutil.nullDate() ;
            n14506ogFecha = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14506ogFecha", localUtil.format(A14506ogFecha, "99/99/99"));
         }
         else
         {
            A14506ogFecha = localUtil.ctod( httpContext.cgiGet( edtogFecha_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n14506ogFecha = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14506ogFecha", localUtil.format(A14506ogFecha, "99/99/99"));
         }
         A14507ogCodArt = httpContext.cgiGet( edtogCodArt_Internalname) ;
         n14507ogCodArt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14507ogCodArt", A14507ogCodArt);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtogRolos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtogRolos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGROLOS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtogRolos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14508ogRolos = (short)(0) ;
            n14508ogRolos = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14508ogRolos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14508ogRolos), 3, 0));
         }
         else
         {
            A14508ogRolos = (short)(localUtil.ctol( httpContext.cgiGet( edtogRolos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14508ogRolos = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14508ogRolos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14508ogRolos), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtogRolos__Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtogRolos__Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGROLOS_");
            AnyError = (short)(1) ;
            GX_FocusControl = edtogRolos__Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14556ogRolos_ = (short)(0) ;
            n14556ogRolos_ = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14556ogRolos_", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14556ogRolos_), 3, 0));
         }
         else
         {
            A14556ogRolos_ = (short)(localUtil.ctol( httpContext.cgiGet( edtogRolos__Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14556ogRolos_ = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14556ogRolos_", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14556ogRolos_), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtogQuant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtogQuant_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGQUANT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtogQuant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14509ogQuant = DecimalUtil.ZERO ;
            n14509ogQuant = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14509ogQuant", GXutil.ltrimstr( A14509ogQuant, 7, 2));
         }
         else
         {
            A14509ogQuant = localUtil.ctond( httpContext.cgiGet( edtogQuant_Internalname)) ;
            n14509ogQuant = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14509ogQuant", GXutil.ltrimstr( A14509ogQuant, 7, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtogQuant__Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtogQuant__Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGQUANT_");
            AnyError = (short)(1) ;
            GX_FocusControl = edtogQuant__Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14557ogQuant_ = DecimalUtil.ZERO ;
            n14557ogQuant_ = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14557ogQuant_", GXutil.ltrimstr( A14557ogQuant_, 7, 2));
         }
         else
         {
            A14557ogQuant_ = localUtil.ctond( httpContext.cgiGet( edtogQuant__Internalname)) ;
            n14557ogQuant_ = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14557ogQuant_", GXutil.ltrimstr( A14557ogQuant_, 7, 2));
         }
         A14510ogUnidad = httpContext.cgiGet( edtogUnidad_Internalname) ;
         n14510ogUnidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14510ogUnidad", A14510ogUnidad);
         A14558ogUnidad_ = httpContext.cgiGet( edtogUnidad__Internalname) ;
         n14558ogUnidad_ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14558ogUnidad_", A14558ogUnidad_);
         A14528ogReferen = httpContext.cgiGet( edtogReferen_Internalname) ;
         n14528ogReferen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14528ogReferen", A14528ogReferen);
         A14511ogReclam = httpContext.cgiGet( edtogReclam_Internalname) ;
         n14511ogReclam = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14511ogReclam", A14511ogReclam);
         A14518ogLote = httpContext.cgiGet( edtogLote_Internalname) ;
         n14518ogLote = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14518ogLote", A14518ogLote);
         A14512ogJogo = httpContext.cgiGet( edtogJogo_Internalname) ;
         n14512ogJogo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14512ogJogo", A14512ogJogo);
         A14513ogPoleg = httpContext.cgiGet( edtogPoleg_Internalname) ;
         n14513ogPoleg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14513ogPoleg", A14513ogPoleg);
         A14514ogFio = httpContext.cgiGet( edtogFio_Internalname) ;
         n14514ogFio = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14514ogFio", A14514ogFio);
         A14560ogFio_ = httpContext.cgiGet( edtogFio__Internalname) ;
         n14560ogFio_ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14560ogFio_", A14560ogFio_);
         A14515ogMaqui = httpContext.cgiGet( edtogMaqui_Internalname) ;
         n14515ogMaqui = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14515ogMaqui", A14515ogMaqui);
         A14516ogEntrada = httpContext.cgiGet( edtogEntrada_Internalname) ;
         n14516ogEntrada = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14516ogEntrada", A14516ogEntrada);
         A14517ogVossaR = httpContext.cgiGet( edtogVossaR_Internalname) ;
         n14517ogVossaR = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14517ogVossaR", A14517ogVossaR);
         A14519ogArtiCR = httpContext.cgiGet( edtogArtiCR_Internalname) ;
         n14519ogArtiCR = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14519ogArtiCR", A14519ogArtiCR);
         A14520ogArtiAC = httpContext.cgiGet( edtogArtiAC_Internalname) ;
         n14520ogArtiAC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14520ogArtiAC", A14520ogArtiAC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtogARecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtogARecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGARECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtogARecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14521ogARecCod = 0 ;
            n14521ogARecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14521ogARecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14521ogARecCod), 8, 0));
         }
         else
         {
            A14521ogARecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtogARecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14521ogARecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14521ogARecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14521ogARecCod), 8, 0));
         }
         A14554ogLocaliza = httpContext.cgiGet( edtogLocaliza_Internalname) ;
         n14554ogLocaliza = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14554ogLocaliza", A14554ogLocaliza);
         A14559ogLocalizc = httpContext.cgiGet( edtogLocalizc_Internalname) ;
         n14559ogLocalizc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14559ogLocalizc", A14559ogLocalizc);
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
            A14503ogLinha = GXutil.lval( httpContext.GetPar( "ogLinha")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14503ogLinha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14503ogLinha), 10, 0));
            A14504ogEmprCod = httpContext.GetPar( "ogEmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A14504ogEmprCod", A14504ogEmprCod);
            A14505ogCliCod = GXutil.lval( httpContext.GetPar( "ogCliCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
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
            initAll1VY1912( ) ;
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
      disableAttributes1VY1912( ) ;
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

   public void resetCaption1VY0( )
   {
   }

   public void zm1VY1912( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14522ogNmrGuia = T01VY3_A14522ogNmrGuia[0] ;
            Z14523ogSerie = T01VY3_A14523ogSerie[0] ;
            Z14506ogFecha = T01VY3_A14506ogFecha[0] ;
            Z14507ogCodArt = T01VY3_A14507ogCodArt[0] ;
            Z14508ogRolos = T01VY3_A14508ogRolos[0] ;
            Z14556ogRolos_ = T01VY3_A14556ogRolos_[0] ;
            Z14509ogQuant = T01VY3_A14509ogQuant[0] ;
            Z14557ogQuant_ = T01VY3_A14557ogQuant_[0] ;
            Z14510ogUnidad = T01VY3_A14510ogUnidad[0] ;
            Z14558ogUnidad_ = T01VY3_A14558ogUnidad_[0] ;
            Z14528ogReferen = T01VY3_A14528ogReferen[0] ;
            Z14511ogReclam = T01VY3_A14511ogReclam[0] ;
            Z14518ogLote = T01VY3_A14518ogLote[0] ;
            Z14512ogJogo = T01VY3_A14512ogJogo[0] ;
            Z14513ogPoleg = T01VY3_A14513ogPoleg[0] ;
            Z14514ogFio = T01VY3_A14514ogFio[0] ;
            Z14560ogFio_ = T01VY3_A14560ogFio_[0] ;
            Z14515ogMaqui = T01VY3_A14515ogMaqui[0] ;
            Z14516ogEntrada = T01VY3_A14516ogEntrada[0] ;
            Z14517ogVossaR = T01VY3_A14517ogVossaR[0] ;
            Z14519ogArtiCR = T01VY3_A14519ogArtiCR[0] ;
            Z14520ogArtiAC = T01VY3_A14520ogArtiAC[0] ;
            Z14521ogARecCod = T01VY3_A14521ogARecCod[0] ;
            Z14554ogLocaliza = T01VY3_A14554ogLocaliza[0] ;
            Z14559ogLocalizc = T01VY3_A14559ogLocalizc[0] ;
         }
         else
         {
            Z14522ogNmrGuia = A14522ogNmrGuia ;
            Z14523ogSerie = A14523ogSerie ;
            Z14506ogFecha = A14506ogFecha ;
            Z14507ogCodArt = A14507ogCodArt ;
            Z14508ogRolos = A14508ogRolos ;
            Z14556ogRolos_ = A14556ogRolos_ ;
            Z14509ogQuant = A14509ogQuant ;
            Z14557ogQuant_ = A14557ogQuant_ ;
            Z14510ogUnidad = A14510ogUnidad ;
            Z14558ogUnidad_ = A14558ogUnidad_ ;
            Z14528ogReferen = A14528ogReferen ;
            Z14511ogReclam = A14511ogReclam ;
            Z14518ogLote = A14518ogLote ;
            Z14512ogJogo = A14512ogJogo ;
            Z14513ogPoleg = A14513ogPoleg ;
            Z14514ogFio = A14514ogFio ;
            Z14560ogFio_ = A14560ogFio_ ;
            Z14515ogMaqui = A14515ogMaqui ;
            Z14516ogEntrada = A14516ogEntrada ;
            Z14517ogVossaR = A14517ogVossaR ;
            Z14519ogArtiCR = A14519ogArtiCR ;
            Z14520ogArtiAC = A14520ogArtiAC ;
            Z14521ogARecCod = A14521ogARecCod ;
            Z14554ogLocaliza = A14554ogLocaliza ;
            Z14559ogLocalizc = A14559ogLocalizc ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z14503ogLinha = A14503ogLinha ;
         Z14504ogEmprCod = A14504ogEmprCod ;
         Z14505ogCliCod = A14505ogCliCod ;
         Z14522ogNmrGuia = A14522ogNmrGuia ;
         Z14523ogSerie = A14523ogSerie ;
         Z14506ogFecha = A14506ogFecha ;
         Z14507ogCodArt = A14507ogCodArt ;
         Z14508ogRolos = A14508ogRolos ;
         Z14556ogRolos_ = A14556ogRolos_ ;
         Z14509ogQuant = A14509ogQuant ;
         Z14557ogQuant_ = A14557ogQuant_ ;
         Z14510ogUnidad = A14510ogUnidad ;
         Z14558ogUnidad_ = A14558ogUnidad_ ;
         Z14528ogReferen = A14528ogReferen ;
         Z14511ogReclam = A14511ogReclam ;
         Z14518ogLote = A14518ogLote ;
         Z14512ogJogo = A14512ogJogo ;
         Z14513ogPoleg = A14513ogPoleg ;
         Z14514ogFio = A14514ogFio ;
         Z14560ogFio_ = A14560ogFio_ ;
         Z14515ogMaqui = A14515ogMaqui ;
         Z14516ogEntrada = A14516ogEntrada ;
         Z14517ogVossaR = A14517ogVossaR ;
         Z14519ogArtiCR = A14519ogArtiCR ;
         Z14520ogArtiAC = A14520ogArtiAC ;
         Z14521ogARecCod = A14521ogARecCod ;
         Z14554ogLocaliza = A14554ogLocaliza ;
         Z14559ogLocalizc = A14559ogLocalizc ;
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

   public void load1VY1912( )
   {
      /* Using cursor T01VY4 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1912 = (short)(1) ;
         A14522ogNmrGuia = T01VY4_A14522ogNmrGuia[0] ;
         n14522ogNmrGuia = T01VY4_n14522ogNmrGuia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14522ogNmrGuia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14522ogNmrGuia), 10, 0));
         A14523ogSerie = T01VY4_A14523ogSerie[0] ;
         n14523ogSerie = T01VY4_n14523ogSerie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14523ogSerie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14523ogSerie), 4, 0));
         A14506ogFecha = T01VY4_A14506ogFecha[0] ;
         n14506ogFecha = T01VY4_n14506ogFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14506ogFecha", localUtil.format(A14506ogFecha, "99/99/99"));
         A14507ogCodArt = T01VY4_A14507ogCodArt[0] ;
         n14507ogCodArt = T01VY4_n14507ogCodArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14507ogCodArt", A14507ogCodArt);
         A14508ogRolos = T01VY4_A14508ogRolos[0] ;
         n14508ogRolos = T01VY4_n14508ogRolos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14508ogRolos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14508ogRolos), 3, 0));
         A14556ogRolos_ = T01VY4_A14556ogRolos_[0] ;
         n14556ogRolos_ = T01VY4_n14556ogRolos_[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14556ogRolos_", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14556ogRolos_), 3, 0));
         A14509ogQuant = T01VY4_A14509ogQuant[0] ;
         n14509ogQuant = T01VY4_n14509ogQuant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14509ogQuant", GXutil.ltrimstr( A14509ogQuant, 7, 2));
         A14557ogQuant_ = T01VY4_A14557ogQuant_[0] ;
         n14557ogQuant_ = T01VY4_n14557ogQuant_[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14557ogQuant_", GXutil.ltrimstr( A14557ogQuant_, 7, 2));
         A14510ogUnidad = T01VY4_A14510ogUnidad[0] ;
         n14510ogUnidad = T01VY4_n14510ogUnidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14510ogUnidad", A14510ogUnidad);
         A14558ogUnidad_ = T01VY4_A14558ogUnidad_[0] ;
         n14558ogUnidad_ = T01VY4_n14558ogUnidad_[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14558ogUnidad_", A14558ogUnidad_);
         A14528ogReferen = T01VY4_A14528ogReferen[0] ;
         n14528ogReferen = T01VY4_n14528ogReferen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14528ogReferen", A14528ogReferen);
         A14511ogReclam = T01VY4_A14511ogReclam[0] ;
         n14511ogReclam = T01VY4_n14511ogReclam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14511ogReclam", A14511ogReclam);
         A14518ogLote = T01VY4_A14518ogLote[0] ;
         n14518ogLote = T01VY4_n14518ogLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14518ogLote", A14518ogLote);
         A14512ogJogo = T01VY4_A14512ogJogo[0] ;
         n14512ogJogo = T01VY4_n14512ogJogo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14512ogJogo", A14512ogJogo);
         A14513ogPoleg = T01VY4_A14513ogPoleg[0] ;
         n14513ogPoleg = T01VY4_n14513ogPoleg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14513ogPoleg", A14513ogPoleg);
         A14514ogFio = T01VY4_A14514ogFio[0] ;
         n14514ogFio = T01VY4_n14514ogFio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14514ogFio", A14514ogFio);
         A14560ogFio_ = T01VY4_A14560ogFio_[0] ;
         n14560ogFio_ = T01VY4_n14560ogFio_[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14560ogFio_", A14560ogFio_);
         A14515ogMaqui = T01VY4_A14515ogMaqui[0] ;
         n14515ogMaqui = T01VY4_n14515ogMaqui[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14515ogMaqui", A14515ogMaqui);
         A14516ogEntrada = T01VY4_A14516ogEntrada[0] ;
         n14516ogEntrada = T01VY4_n14516ogEntrada[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14516ogEntrada", A14516ogEntrada);
         A14517ogVossaR = T01VY4_A14517ogVossaR[0] ;
         n14517ogVossaR = T01VY4_n14517ogVossaR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14517ogVossaR", A14517ogVossaR);
         A14519ogArtiCR = T01VY4_A14519ogArtiCR[0] ;
         n14519ogArtiCR = T01VY4_n14519ogArtiCR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14519ogArtiCR", A14519ogArtiCR);
         A14520ogArtiAC = T01VY4_A14520ogArtiAC[0] ;
         n14520ogArtiAC = T01VY4_n14520ogArtiAC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14520ogArtiAC", A14520ogArtiAC);
         A14521ogARecCod = T01VY4_A14521ogARecCod[0] ;
         n14521ogARecCod = T01VY4_n14521ogARecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14521ogARecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14521ogARecCod), 8, 0));
         A14554ogLocaliza = T01VY4_A14554ogLocaliza[0] ;
         n14554ogLocaliza = T01VY4_n14554ogLocaliza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14554ogLocaliza", A14554ogLocaliza);
         A14559ogLocalizc = T01VY4_A14559ogLocalizc[0] ;
         n14559ogLocalizc = T01VY4_n14559ogLocalizc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14559ogLocalizc", A14559ogLocalizc);
         zm1VY1912( -1) ;
      }
      pr_default.close(2);
      onLoadActions1VY1912( ) ;
   }

   public void onLoadActions1VY1912( )
   {
   }

   public void checkExtendedTable1VY1912( )
   {
      nIsDirty_1912 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1VY1912( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1VY1912( )
   {
      /* Using cursor T01VY5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1912 = (short)(1) ;
      }
      else
      {
         RcdFound1912 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01VY3 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1VY1912( 1) ;
         RcdFound1912 = (short)(1) ;
         A14503ogLinha = T01VY3_A14503ogLinha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14503ogLinha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14503ogLinha), 10, 0));
         A14504ogEmprCod = T01VY3_A14504ogEmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14504ogEmprCod", A14504ogEmprCod);
         A14505ogCliCod = T01VY3_A14505ogCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
         A14522ogNmrGuia = T01VY3_A14522ogNmrGuia[0] ;
         n14522ogNmrGuia = T01VY3_n14522ogNmrGuia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14522ogNmrGuia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14522ogNmrGuia), 10, 0));
         A14523ogSerie = T01VY3_A14523ogSerie[0] ;
         n14523ogSerie = T01VY3_n14523ogSerie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14523ogSerie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14523ogSerie), 4, 0));
         A14506ogFecha = T01VY3_A14506ogFecha[0] ;
         n14506ogFecha = T01VY3_n14506ogFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14506ogFecha", localUtil.format(A14506ogFecha, "99/99/99"));
         A14507ogCodArt = T01VY3_A14507ogCodArt[0] ;
         n14507ogCodArt = T01VY3_n14507ogCodArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14507ogCodArt", A14507ogCodArt);
         A14508ogRolos = T01VY3_A14508ogRolos[0] ;
         n14508ogRolos = T01VY3_n14508ogRolos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14508ogRolos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14508ogRolos), 3, 0));
         A14556ogRolos_ = T01VY3_A14556ogRolos_[0] ;
         n14556ogRolos_ = T01VY3_n14556ogRolos_[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14556ogRolos_", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14556ogRolos_), 3, 0));
         A14509ogQuant = T01VY3_A14509ogQuant[0] ;
         n14509ogQuant = T01VY3_n14509ogQuant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14509ogQuant", GXutil.ltrimstr( A14509ogQuant, 7, 2));
         A14557ogQuant_ = T01VY3_A14557ogQuant_[0] ;
         n14557ogQuant_ = T01VY3_n14557ogQuant_[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14557ogQuant_", GXutil.ltrimstr( A14557ogQuant_, 7, 2));
         A14510ogUnidad = T01VY3_A14510ogUnidad[0] ;
         n14510ogUnidad = T01VY3_n14510ogUnidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14510ogUnidad", A14510ogUnidad);
         A14558ogUnidad_ = T01VY3_A14558ogUnidad_[0] ;
         n14558ogUnidad_ = T01VY3_n14558ogUnidad_[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14558ogUnidad_", A14558ogUnidad_);
         A14528ogReferen = T01VY3_A14528ogReferen[0] ;
         n14528ogReferen = T01VY3_n14528ogReferen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14528ogReferen", A14528ogReferen);
         A14511ogReclam = T01VY3_A14511ogReclam[0] ;
         n14511ogReclam = T01VY3_n14511ogReclam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14511ogReclam", A14511ogReclam);
         A14518ogLote = T01VY3_A14518ogLote[0] ;
         n14518ogLote = T01VY3_n14518ogLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14518ogLote", A14518ogLote);
         A14512ogJogo = T01VY3_A14512ogJogo[0] ;
         n14512ogJogo = T01VY3_n14512ogJogo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14512ogJogo", A14512ogJogo);
         A14513ogPoleg = T01VY3_A14513ogPoleg[0] ;
         n14513ogPoleg = T01VY3_n14513ogPoleg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14513ogPoleg", A14513ogPoleg);
         A14514ogFio = T01VY3_A14514ogFio[0] ;
         n14514ogFio = T01VY3_n14514ogFio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14514ogFio", A14514ogFio);
         A14560ogFio_ = T01VY3_A14560ogFio_[0] ;
         n14560ogFio_ = T01VY3_n14560ogFio_[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14560ogFio_", A14560ogFio_);
         A14515ogMaqui = T01VY3_A14515ogMaqui[0] ;
         n14515ogMaqui = T01VY3_n14515ogMaqui[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14515ogMaqui", A14515ogMaqui);
         A14516ogEntrada = T01VY3_A14516ogEntrada[0] ;
         n14516ogEntrada = T01VY3_n14516ogEntrada[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14516ogEntrada", A14516ogEntrada);
         A14517ogVossaR = T01VY3_A14517ogVossaR[0] ;
         n14517ogVossaR = T01VY3_n14517ogVossaR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14517ogVossaR", A14517ogVossaR);
         A14519ogArtiCR = T01VY3_A14519ogArtiCR[0] ;
         n14519ogArtiCR = T01VY3_n14519ogArtiCR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14519ogArtiCR", A14519ogArtiCR);
         A14520ogArtiAC = T01VY3_A14520ogArtiAC[0] ;
         n14520ogArtiAC = T01VY3_n14520ogArtiAC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14520ogArtiAC", A14520ogArtiAC);
         A14521ogARecCod = T01VY3_A14521ogARecCod[0] ;
         n14521ogARecCod = T01VY3_n14521ogARecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14521ogARecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14521ogARecCod), 8, 0));
         A14554ogLocaliza = T01VY3_A14554ogLocaliza[0] ;
         n14554ogLocaliza = T01VY3_n14554ogLocaliza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14554ogLocaliza", A14554ogLocaliza);
         A14559ogLocalizc = T01VY3_A14559ogLocalizc[0] ;
         n14559ogLocalizc = T01VY3_n14559ogLocalizc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14559ogLocalizc", A14559ogLocalizc);
         Z14503ogLinha = A14503ogLinha ;
         Z14504ogEmprCod = A14504ogEmprCod ;
         Z14505ogCliCod = A14505ogCliCod ;
         sMode1912 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1VY1912( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1912 = (short)(0) ;
            initializeNonKey1VY1912( ) ;
         }
         Gx_mode = sMode1912 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1912 = (short)(0) ;
         initializeNonKey1VY1912( ) ;
         sMode1912 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1912 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1VY1912( ) ;
      if ( RcdFound1912 == 0 )
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
      RcdFound1912 = (short)(0) ;
      /* Using cursor T01VY6 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14503ogLinha), Long.valueOf(A14503ogLinha), A14504ogEmprCod, A14504ogEmprCod, Long.valueOf(A14503ogLinha), Long.valueOf(A14505ogCliCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01VY6_A14503ogLinha[0] < A14503ogLinha ) || ( T01VY6_A14503ogLinha[0] == A14503ogLinha ) && ( GXutil.strcmp(T01VY6_A14504ogEmprCod[0], A14504ogEmprCod) < 0 ) || ( GXutil.strcmp(T01VY6_A14504ogEmprCod[0], A14504ogEmprCod) == 0 ) && ( T01VY6_A14503ogLinha[0] == A14503ogLinha ) && ( T01VY6_A14505ogCliCod[0] < A14505ogCliCod ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01VY6_A14503ogLinha[0] > A14503ogLinha ) || ( T01VY6_A14503ogLinha[0] == A14503ogLinha ) && ( GXutil.strcmp(T01VY6_A14504ogEmprCod[0], A14504ogEmprCod) > 0 ) || ( GXutil.strcmp(T01VY6_A14504ogEmprCod[0], A14504ogEmprCod) == 0 ) && ( T01VY6_A14503ogLinha[0] == A14503ogLinha ) && ( T01VY6_A14505ogCliCod[0] > A14505ogCliCod ) ) )
         {
            A14503ogLinha = T01VY6_A14503ogLinha[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14503ogLinha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14503ogLinha), 10, 0));
            A14504ogEmprCod = T01VY6_A14504ogEmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14504ogEmprCod", A14504ogEmprCod);
            A14505ogCliCod = T01VY6_A14505ogCliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
            RcdFound1912 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1912 = (short)(0) ;
      /* Using cursor T01VY7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14503ogLinha), Long.valueOf(A14503ogLinha), A14504ogEmprCod, A14504ogEmprCod, Long.valueOf(A14503ogLinha), Long.valueOf(A14505ogCliCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01VY7_A14503ogLinha[0] > A14503ogLinha ) || ( T01VY7_A14503ogLinha[0] == A14503ogLinha ) && ( GXutil.strcmp(T01VY7_A14504ogEmprCod[0], A14504ogEmprCod) > 0 ) || ( GXutil.strcmp(T01VY7_A14504ogEmprCod[0], A14504ogEmprCod) == 0 ) && ( T01VY7_A14503ogLinha[0] == A14503ogLinha ) && ( T01VY7_A14505ogCliCod[0] > A14505ogCliCod ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01VY7_A14503ogLinha[0] < A14503ogLinha ) || ( T01VY7_A14503ogLinha[0] == A14503ogLinha ) && ( GXutil.strcmp(T01VY7_A14504ogEmprCod[0], A14504ogEmprCod) < 0 ) || ( GXutil.strcmp(T01VY7_A14504ogEmprCod[0], A14504ogEmprCod) == 0 ) && ( T01VY7_A14503ogLinha[0] == A14503ogLinha ) && ( T01VY7_A14505ogCliCod[0] < A14505ogCliCod ) ) )
         {
            A14503ogLinha = T01VY7_A14503ogLinha[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14503ogLinha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14503ogLinha), 10, 0));
            A14504ogEmprCod = T01VY7_A14504ogEmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14504ogEmprCod", A14504ogEmprCod);
            A14505ogCliCod = T01VY7_A14505ogCliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
            RcdFound1912 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VY1912( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtogLinha_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1VY1912( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1912 == 1 )
         {
            if ( ( A14503ogLinha != Z14503ogLinha ) || ( GXutil.strcmp(A14504ogEmprCod, Z14504ogEmprCod) != 0 ) || ( A14505ogCliCod != Z14505ogCliCod ) )
            {
               A14503ogLinha = Z14503ogLinha ;
               httpContext.ajax_rsp_assign_attri("", false, "A14503ogLinha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14503ogLinha), 10, 0));
               A14504ogEmprCod = Z14504ogEmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A14504ogEmprCod", A14504ogEmprCod);
               A14505ogCliCod = Z14505ogCliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "OGLINHA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtogLinha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtogLinha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1VY1912( ) ;
               GX_FocusControl = edtogLinha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A14503ogLinha != Z14503ogLinha ) || ( GXutil.strcmp(A14504ogEmprCod, Z14504ogEmprCod) != 0 ) || ( A14505ogCliCod != Z14505ogCliCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtogLinha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1VY1912( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "OGLINHA");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtogLinha_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtogLinha_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1VY1912( ) ;
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
      if ( ( A14503ogLinha != Z14503ogLinha ) || ( GXutil.strcmp(A14504ogEmprCod, Z14504ogEmprCod) != 0 ) || ( A14505ogCliCod != Z14505ogCliCod ) )
      {
         A14503ogLinha = Z14503ogLinha ;
         httpContext.ajax_rsp_assign_attri("", false, "A14503ogLinha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14503ogLinha), 10, 0));
         A14504ogEmprCod = Z14504ogEmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A14504ogEmprCod", A14504ogEmprCod);
         A14505ogCliCod = Z14505ogCliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "OGLINHA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtogLinha_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtogLinha_Internalname ;
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
      if ( RcdFound1912 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "OGLINHA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtogLinha_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtogNmrGuia_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1VY1912( ) ;
      if ( RcdFound1912 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtogNmrGuia_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VY1912( ) ;
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
      if ( RcdFound1912 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtogNmrGuia_Internalname ;
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
      if ( RcdFound1912 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtogNmrGuia_Internalname ;
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
      scanStart1VY1912( ) ;
      if ( RcdFound1912 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1912 != 0 )
         {
            scanNext1VY1912( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtogNmrGuia_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VY1912( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1VY1912( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01VY2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOGGUIA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z14522ogNmrGuia != T01VY2_A14522ogNmrGuia[0] ) || ( Z14523ogSerie != T01VY2_A14523ogSerie[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z14506ogFecha), GXutil.resetTime(T01VY2_A14506ogFecha[0])) ) || ( GXutil.strcmp(Z14507ogCodArt, T01VY2_A14507ogCodArt[0]) != 0 ) || ( Z14508ogRolos != T01VY2_A14508ogRolos[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14556ogRolos_ != T01VY2_A14556ogRolos_[0] ) || ( DecimalUtil.compareTo(Z14509ogQuant, T01VY2_A14509ogQuant[0]) != 0 ) || ( DecimalUtil.compareTo(Z14557ogQuant_, T01VY2_A14557ogQuant_[0]) != 0 ) || ( GXutil.strcmp(Z14510ogUnidad, T01VY2_A14510ogUnidad[0]) != 0 ) || ( GXutil.strcmp(Z14558ogUnidad_, T01VY2_A14558ogUnidad_[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14528ogReferen, T01VY2_A14528ogReferen[0]) != 0 ) || ( GXutil.strcmp(Z14511ogReclam, T01VY2_A14511ogReclam[0]) != 0 ) || ( GXutil.strcmp(Z14518ogLote, T01VY2_A14518ogLote[0]) != 0 ) || ( GXutil.strcmp(Z14512ogJogo, T01VY2_A14512ogJogo[0]) != 0 ) || ( GXutil.strcmp(Z14513ogPoleg, T01VY2_A14513ogPoleg[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14514ogFio, T01VY2_A14514ogFio[0]) != 0 ) || ( GXutil.strcmp(Z14560ogFio_, T01VY2_A14560ogFio_[0]) != 0 ) || ( GXutil.strcmp(Z14515ogMaqui, T01VY2_A14515ogMaqui[0]) != 0 ) || ( GXutil.strcmp(Z14516ogEntrada, T01VY2_A14516ogEntrada[0]) != 0 ) || ( GXutil.strcmp(Z14517ogVossaR, T01VY2_A14517ogVossaR[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14519ogArtiCR, T01VY2_A14519ogArtiCR[0]) != 0 ) || ( GXutil.strcmp(Z14520ogArtiAC, T01VY2_A14520ogArtiAC[0]) != 0 ) || ( Z14521ogARecCod != T01VY2_A14521ogARecCod[0] ) || ( GXutil.strcmp(Z14554ogLocaliza, T01VY2_A14554ogLocaliza[0]) != 0 ) || ( GXutil.strcmp(Z14559ogLocalizc, T01VY2_A14559ogLocalizc[0]) != 0 ) )
         {
            if ( Z14522ogNmrGuia != T01VY2_A14522ogNmrGuia[0] )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogNmrGuia");
               GXutil.writeLogRaw("Old: ",Z14522ogNmrGuia);
               GXutil.writeLogRaw("Current: ",T01VY2_A14522ogNmrGuia[0]);
            }
            if ( Z14523ogSerie != T01VY2_A14523ogSerie[0] )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogSerie");
               GXutil.writeLogRaw("Old: ",Z14523ogSerie);
               GXutil.writeLogRaw("Current: ",T01VY2_A14523ogSerie[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14506ogFecha), GXutil.resetTime(T01VY2_A14506ogFecha[0])) ) )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogFecha");
               GXutil.writeLogRaw("Old: ",Z14506ogFecha);
               GXutil.writeLogRaw("Current: ",T01VY2_A14506ogFecha[0]);
            }
            if ( GXutil.strcmp(Z14507ogCodArt, T01VY2_A14507ogCodArt[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogCodArt");
               GXutil.writeLogRaw("Old: ",Z14507ogCodArt);
               GXutil.writeLogRaw("Current: ",T01VY2_A14507ogCodArt[0]);
            }
            if ( Z14508ogRolos != T01VY2_A14508ogRolos[0] )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogRolos");
               GXutil.writeLogRaw("Old: ",Z14508ogRolos);
               GXutil.writeLogRaw("Current: ",T01VY2_A14508ogRolos[0]);
            }
            if ( Z14556ogRolos_ != T01VY2_A14556ogRolos_[0] )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogRolos_");
               GXutil.writeLogRaw("Old: ",Z14556ogRolos_);
               GXutil.writeLogRaw("Current: ",T01VY2_A14556ogRolos_[0]);
            }
            if ( DecimalUtil.compareTo(Z14509ogQuant, T01VY2_A14509ogQuant[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogQuant");
               GXutil.writeLogRaw("Old: ",Z14509ogQuant);
               GXutil.writeLogRaw("Current: ",T01VY2_A14509ogQuant[0]);
            }
            if ( DecimalUtil.compareTo(Z14557ogQuant_, T01VY2_A14557ogQuant_[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogQuant_");
               GXutil.writeLogRaw("Old: ",Z14557ogQuant_);
               GXutil.writeLogRaw("Current: ",T01VY2_A14557ogQuant_[0]);
            }
            if ( GXutil.strcmp(Z14510ogUnidad, T01VY2_A14510ogUnidad[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogUnidad");
               GXutil.writeLogRaw("Old: ",Z14510ogUnidad);
               GXutil.writeLogRaw("Current: ",T01VY2_A14510ogUnidad[0]);
            }
            if ( GXutil.strcmp(Z14558ogUnidad_, T01VY2_A14558ogUnidad_[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogUnidad_");
               GXutil.writeLogRaw("Old: ",Z14558ogUnidad_);
               GXutil.writeLogRaw("Current: ",T01VY2_A14558ogUnidad_[0]);
            }
            if ( GXutil.strcmp(Z14528ogReferen, T01VY2_A14528ogReferen[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogReferen");
               GXutil.writeLogRaw("Old: ",Z14528ogReferen);
               GXutil.writeLogRaw("Current: ",T01VY2_A14528ogReferen[0]);
            }
            if ( GXutil.strcmp(Z14511ogReclam, T01VY2_A14511ogReclam[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogReclam");
               GXutil.writeLogRaw("Old: ",Z14511ogReclam);
               GXutil.writeLogRaw("Current: ",T01VY2_A14511ogReclam[0]);
            }
            if ( GXutil.strcmp(Z14518ogLote, T01VY2_A14518ogLote[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogLote");
               GXutil.writeLogRaw("Old: ",Z14518ogLote);
               GXutil.writeLogRaw("Current: ",T01VY2_A14518ogLote[0]);
            }
            if ( GXutil.strcmp(Z14512ogJogo, T01VY2_A14512ogJogo[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogJogo");
               GXutil.writeLogRaw("Old: ",Z14512ogJogo);
               GXutil.writeLogRaw("Current: ",T01VY2_A14512ogJogo[0]);
            }
            if ( GXutil.strcmp(Z14513ogPoleg, T01VY2_A14513ogPoleg[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogPoleg");
               GXutil.writeLogRaw("Old: ",Z14513ogPoleg);
               GXutil.writeLogRaw("Current: ",T01VY2_A14513ogPoleg[0]);
            }
            if ( GXutil.strcmp(Z14514ogFio, T01VY2_A14514ogFio[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogFio");
               GXutil.writeLogRaw("Old: ",Z14514ogFio);
               GXutil.writeLogRaw("Current: ",T01VY2_A14514ogFio[0]);
            }
            if ( GXutil.strcmp(Z14560ogFio_, T01VY2_A14560ogFio_[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogFio_");
               GXutil.writeLogRaw("Old: ",Z14560ogFio_);
               GXutil.writeLogRaw("Current: ",T01VY2_A14560ogFio_[0]);
            }
            if ( GXutil.strcmp(Z14515ogMaqui, T01VY2_A14515ogMaqui[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogMaqui");
               GXutil.writeLogRaw("Old: ",Z14515ogMaqui);
               GXutil.writeLogRaw("Current: ",T01VY2_A14515ogMaqui[0]);
            }
            if ( GXutil.strcmp(Z14516ogEntrada, T01VY2_A14516ogEntrada[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogEntrada");
               GXutil.writeLogRaw("Old: ",Z14516ogEntrada);
               GXutil.writeLogRaw("Current: ",T01VY2_A14516ogEntrada[0]);
            }
            if ( GXutil.strcmp(Z14517ogVossaR, T01VY2_A14517ogVossaR[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogVossaR");
               GXutil.writeLogRaw("Old: ",Z14517ogVossaR);
               GXutil.writeLogRaw("Current: ",T01VY2_A14517ogVossaR[0]);
            }
            if ( GXutil.strcmp(Z14519ogArtiCR, T01VY2_A14519ogArtiCR[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogArtiCR");
               GXutil.writeLogRaw("Old: ",Z14519ogArtiCR);
               GXutil.writeLogRaw("Current: ",T01VY2_A14519ogArtiCR[0]);
            }
            if ( GXutil.strcmp(Z14520ogArtiAC, T01VY2_A14520ogArtiAC[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogArtiAC");
               GXutil.writeLogRaw("Old: ",Z14520ogArtiAC);
               GXutil.writeLogRaw("Current: ",T01VY2_A14520ogArtiAC[0]);
            }
            if ( Z14521ogARecCod != T01VY2_A14521ogARecCod[0] )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogARecCod");
               GXutil.writeLogRaw("Old: ",Z14521ogARecCod);
               GXutil.writeLogRaw("Current: ",T01VY2_A14521ogARecCod[0]);
            }
            if ( GXutil.strcmp(Z14554ogLocaliza, T01VY2_A14554ogLocaliza[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogLocaliza");
               GXutil.writeLogRaw("Old: ",Z14554ogLocaliza);
               GXutil.writeLogRaw("Current: ",T01VY2_A14554ogLocaliza[0]);
            }
            if ( GXutil.strcmp(Z14559ogLocalizc, T01VY2_A14559ogLocalizc[0]) != 0 )
            {
               GXutil.writeLogln("ponteway.v1.ogguiaimport:[seudo value changed for attri]"+"ogLocalizc");
               GXutil.writeLogRaw("Old: ",Z14559ogLocalizc);
               GXutil.writeLogRaw("Current: ",T01VY2_A14559ogLocalizc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOGGUIA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VY1912( )
   {
      beforeValidate1VY1912( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VY1912( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VY1912( 0) ;
         checkOptimisticConcurrency1VY1912( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VY1912( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VY1912( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VY8 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod), Boolean.valueOf(n14522ogNmrGuia), Long.valueOf(A14522ogNmrGuia), Boolean.valueOf(n14523ogSerie), Short.valueOf(A14523ogSerie), Boolean.valueOf(n14506ogFecha), A14506ogFecha, Boolean.valueOf(n14507ogCodArt), A14507ogCodArt, Boolean.valueOf(n14508ogRolos), Short.valueOf(A14508ogRolos), Boolean.valueOf(n14556ogRolos_), Short.valueOf(A14556ogRolos_), Boolean.valueOf(n14509ogQuant), A14509ogQuant, Boolean.valueOf(n14557ogQuant_), A14557ogQuant_, Boolean.valueOf(n14510ogUnidad), A14510ogUnidad, Boolean.valueOf(n14558ogUnidad_), A14558ogUnidad_, Boolean.valueOf(n14528ogReferen), A14528ogReferen, Boolean.valueOf(n14511ogReclam), A14511ogReclam, Boolean.valueOf(n14518ogLote), A14518ogLote, Boolean.valueOf(n14512ogJogo), A14512ogJogo, Boolean.valueOf(n14513ogPoleg), A14513ogPoleg, Boolean.valueOf(n14514ogFio), A14514ogFio, Boolean.valueOf(n14560ogFio_), A14560ogFio_, Boolean.valueOf(n14515ogMaqui), A14515ogMaqui, Boolean.valueOf(n14516ogEntrada), A14516ogEntrada, Boolean.valueOf(n14517ogVossaR), A14517ogVossaR, Boolean.valueOf(n14519ogArtiCR), A14519ogArtiCR, Boolean.valueOf(n14520ogArtiAC), A14520ogArtiAC, Boolean.valueOf(n14521ogARecCod), Integer.valueOf(A14521ogARecCod), Boolean.valueOf(n14554ogLocaliza), A14554ogLocaliza, Boolean.valueOf(n14559ogLocalizc), A14559ogLocalizc});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOGGUIA");
                  if ( (pr_default.getStatus(6) == 1) )
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
                        resetCaption1VY0( ) ;
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
            load1VY1912( ) ;
         }
         endLevel1VY1912( ) ;
      }
      closeExtendedTableCursors1VY1912( ) ;
   }

   public void update1VY1912( )
   {
      beforeValidate1VY1912( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VY1912( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VY1912( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VY1912( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VY1912( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VY9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n14522ogNmrGuia), Long.valueOf(A14522ogNmrGuia), Boolean.valueOf(n14523ogSerie), Short.valueOf(A14523ogSerie), Boolean.valueOf(n14506ogFecha), A14506ogFecha, Boolean.valueOf(n14507ogCodArt), A14507ogCodArt, Boolean.valueOf(n14508ogRolos), Short.valueOf(A14508ogRolos), Boolean.valueOf(n14556ogRolos_), Short.valueOf(A14556ogRolos_), Boolean.valueOf(n14509ogQuant), A14509ogQuant, Boolean.valueOf(n14557ogQuant_), A14557ogQuant_, Boolean.valueOf(n14510ogUnidad), A14510ogUnidad, Boolean.valueOf(n14558ogUnidad_), A14558ogUnidad_, Boolean.valueOf(n14528ogReferen), A14528ogReferen, Boolean.valueOf(n14511ogReclam), A14511ogReclam, Boolean.valueOf(n14518ogLote), A14518ogLote, Boolean.valueOf(n14512ogJogo), A14512ogJogo, Boolean.valueOf(n14513ogPoleg), A14513ogPoleg, Boolean.valueOf(n14514ogFio), A14514ogFio, Boolean.valueOf(n14560ogFio_), A14560ogFio_, Boolean.valueOf(n14515ogMaqui), A14515ogMaqui, Boolean.valueOf(n14516ogEntrada), A14516ogEntrada, Boolean.valueOf(n14517ogVossaR), A14517ogVossaR, Boolean.valueOf(n14519ogArtiCR), A14519ogArtiCR, Boolean.valueOf(n14520ogArtiAC), A14520ogArtiAC, Boolean.valueOf(n14521ogARecCod), Integer.valueOf(A14521ogARecCod), Boolean.valueOf(n14554ogLocaliza), A14554ogLocaliza, Boolean.valueOf(n14559ogLocalizc), A14559ogLocalizc, Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOGGUIA");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOGGUIA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VY1912( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1VY0( ) ;
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
         endLevel1VY1912( ) ;
      }
      closeExtendedTableCursors1VY1912( ) ;
   }

   public void deferredUpdate1VY1912( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1VY1912( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VY1912( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VY1912( ) ;
         afterConfirm1VY1912( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VY1912( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01VY10 */
               pr_default.execute(8, new Object[] {Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOGGUIA");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1912 == 0 )
                     {
                        initAll1VY1912( ) ;
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
                     resetCaption1VY0( ) ;
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
      sMode1912 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1VY1912( ) ;
      Gx_mode = sMode1912 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1VY1912( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1VY1912( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VY1912( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ponteway.v1.ogguiaimport");
         if ( AnyError == 0 )
         {
            confirmValues1VY0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ponteway.v1.ogguiaimport");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1VY1912( )
   {
      /* Using cursor T01VY11 */
      pr_default.execute(9);
      RcdFound1912 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1912 = (short)(1) ;
         A14503ogLinha = T01VY11_A14503ogLinha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14503ogLinha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14503ogLinha), 10, 0));
         A14504ogEmprCod = T01VY11_A14504ogEmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14504ogEmprCod", A14504ogEmprCod);
         A14505ogCliCod = T01VY11_A14505ogCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1VY1912( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1912 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1912 = (short)(1) ;
         A14503ogLinha = T01VY11_A14503ogLinha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14503ogLinha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14503ogLinha), 10, 0));
         A14504ogEmprCod = T01VY11_A14504ogEmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14504ogEmprCod", A14504ogEmprCod);
         A14505ogCliCod = T01VY11_A14505ogCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
      }
   }

   public void scanEnd1VY1912( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1VY1912( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1VY1912( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VY1912( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VY1912( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VY1912( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VY1912( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VY1912( )
   {
      edtogLinha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogLinha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogLinha_Enabled), 5, 0), true);
      edtogEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogEmprCod_Enabled), 5, 0), true);
      edtogCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogCliCod_Enabled), 5, 0), true);
      edtogNmrGuia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogNmrGuia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogNmrGuia_Enabled), 5, 0), true);
      edtogSerie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogSerie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogSerie_Enabled), 5, 0), true);
      edtogFecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogFecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogFecha_Enabled), 5, 0), true);
      edtogCodArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogCodArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogCodArt_Enabled), 5, 0), true);
      edtogRolos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogRolos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogRolos_Enabled), 5, 0), true);
      edtogRolos__Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogRolos__Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogRolos__Enabled), 5, 0), true);
      edtogQuant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogQuant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogQuant_Enabled), 5, 0), true);
      edtogQuant__Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogQuant__Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogQuant__Enabled), 5, 0), true);
      edtogUnidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogUnidad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogUnidad_Enabled), 5, 0), true);
      edtogUnidad__Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogUnidad__Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogUnidad__Enabled), 5, 0), true);
      edtogReferen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogReferen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogReferen_Enabled), 5, 0), true);
      edtogReclam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogReclam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogReclam_Enabled), 5, 0), true);
      edtogLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogLote_Enabled), 5, 0), true);
      edtogJogo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogJogo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogJogo_Enabled), 5, 0), true);
      edtogPoleg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogPoleg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogPoleg_Enabled), 5, 0), true);
      edtogFio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogFio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogFio_Enabled), 5, 0), true);
      edtogFio__Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogFio__Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogFio__Enabled), 5, 0), true);
      edtogMaqui_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogMaqui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogMaqui_Enabled), 5, 0), true);
      edtogEntrada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogEntrada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogEntrada_Enabled), 5, 0), true);
      edtogVossaR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogVossaR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogVossaR_Enabled), 5, 0), true);
      edtogArtiCR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogArtiCR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogArtiCR_Enabled), 5, 0), true);
      edtogArtiAC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogArtiAC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogArtiAC_Enabled), 5, 0), true);
      edtogARecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogARecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogARecCod_Enabled), 5, 0), true);
      edtogLocaliza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogLocaliza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogLocaliza_Enabled), 5, 0), true);
      edtogLocalizc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtogLocalizc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogLocalizc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1VY1912( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1VY0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ponteway.v1.ogguiaimport", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14503ogLinha", GXutil.ltrim( localUtil.ntoc( Z14503ogLinha, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14504ogEmprCod", Z14504ogEmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14505ogCliCod", GXutil.ltrim( localUtil.ntoc( Z14505ogCliCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14522ogNmrGuia", GXutil.ltrim( localUtil.ntoc( Z14522ogNmrGuia, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14523ogSerie", GXutil.ltrim( localUtil.ntoc( Z14523ogSerie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14506ogFecha", localUtil.dtoc( Z14506ogFecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14507ogCodArt", Z14507ogCodArt);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14508ogRolos", GXutil.ltrim( localUtil.ntoc( Z14508ogRolos, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14556ogRolos_", GXutil.ltrim( localUtil.ntoc( Z14556ogRolos_, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14509ogQuant", GXutil.ltrim( localUtil.ntoc( Z14509ogQuant, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14557ogQuant_", GXutil.ltrim( localUtil.ntoc( Z14557ogQuant_, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14510ogUnidad", Z14510ogUnidad);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14558ogUnidad_", Z14558ogUnidad_);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14528ogReferen", Z14528ogReferen);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14511ogReclam", Z14511ogReclam);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14518ogLote", Z14518ogLote);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14512ogJogo", Z14512ogJogo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14513ogPoleg", Z14513ogPoleg);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14514ogFio", Z14514ogFio);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14560ogFio_", Z14560ogFio_);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14515ogMaqui", Z14515ogMaqui);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14516ogEntrada", Z14516ogEntrada);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14517ogVossaR", Z14517ogVossaR);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14519ogArtiCR", Z14519ogArtiCR);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14520ogArtiAC", Z14520ogArtiAC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14521ogARecCod", GXutil.ltrim( localUtil.ntoc( Z14521ogARecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14554ogLocaliza", Z14554ogLocaliza);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14559ogLocalizc", Z14559ogLocalizc);
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
      return formatLink("app.ponteway.v1.ogguiaimport", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "PonteWay.v1.OgGuiaImport" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Oliveira Gonçalo Guia Remesa", "") ;
   }

   public void initializeNonKey1VY1912( )
   {
      A14522ogNmrGuia = 0 ;
      n14522ogNmrGuia = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14522ogNmrGuia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14522ogNmrGuia), 10, 0));
      A14523ogSerie = (short)(0) ;
      n14523ogSerie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14523ogSerie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14523ogSerie), 4, 0));
      A14506ogFecha = GXutil.nullDate() ;
      n14506ogFecha = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14506ogFecha", localUtil.format(A14506ogFecha, "99/99/99"));
      A14507ogCodArt = "" ;
      n14507ogCodArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14507ogCodArt", A14507ogCodArt);
      A14508ogRolos = (short)(0) ;
      n14508ogRolos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14508ogRolos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14508ogRolos), 3, 0));
      A14556ogRolos_ = (short)(0) ;
      n14556ogRolos_ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14556ogRolos_", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14556ogRolos_), 3, 0));
      A14509ogQuant = DecimalUtil.ZERO ;
      n14509ogQuant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14509ogQuant", GXutil.ltrimstr( A14509ogQuant, 7, 2));
      A14557ogQuant_ = DecimalUtil.ZERO ;
      n14557ogQuant_ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14557ogQuant_", GXutil.ltrimstr( A14557ogQuant_, 7, 2));
      A14510ogUnidad = "" ;
      n14510ogUnidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14510ogUnidad", A14510ogUnidad);
      A14558ogUnidad_ = "" ;
      n14558ogUnidad_ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14558ogUnidad_", A14558ogUnidad_);
      A14528ogReferen = "" ;
      n14528ogReferen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14528ogReferen", A14528ogReferen);
      A14511ogReclam = "" ;
      n14511ogReclam = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14511ogReclam", A14511ogReclam);
      A14518ogLote = "" ;
      n14518ogLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14518ogLote", A14518ogLote);
      A14512ogJogo = "" ;
      n14512ogJogo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14512ogJogo", A14512ogJogo);
      A14513ogPoleg = "" ;
      n14513ogPoleg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14513ogPoleg", A14513ogPoleg);
      A14514ogFio = "" ;
      n14514ogFio = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14514ogFio", A14514ogFio);
      A14560ogFio_ = "" ;
      n14560ogFio_ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14560ogFio_", A14560ogFio_);
      A14515ogMaqui = "" ;
      n14515ogMaqui = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14515ogMaqui", A14515ogMaqui);
      A14516ogEntrada = "" ;
      n14516ogEntrada = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14516ogEntrada", A14516ogEntrada);
      A14517ogVossaR = "" ;
      n14517ogVossaR = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14517ogVossaR", A14517ogVossaR);
      A14519ogArtiCR = "" ;
      n14519ogArtiCR = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14519ogArtiCR", A14519ogArtiCR);
      A14520ogArtiAC = "" ;
      n14520ogArtiAC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14520ogArtiAC", A14520ogArtiAC);
      A14521ogARecCod = 0 ;
      n14521ogARecCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14521ogARecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14521ogARecCod), 8, 0));
      A14554ogLocaliza = "" ;
      n14554ogLocaliza = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14554ogLocaliza", A14554ogLocaliza);
      A14559ogLocalizc = "" ;
      n14559ogLocalizc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14559ogLocalizc", A14559ogLocalizc);
      Z14522ogNmrGuia = 0 ;
      Z14523ogSerie = (short)(0) ;
      Z14506ogFecha = GXutil.nullDate() ;
      Z14507ogCodArt = "" ;
      Z14508ogRolos = (short)(0) ;
      Z14556ogRolos_ = (short)(0) ;
      Z14509ogQuant = DecimalUtil.ZERO ;
      Z14557ogQuant_ = DecimalUtil.ZERO ;
      Z14510ogUnidad = "" ;
      Z14558ogUnidad_ = "" ;
      Z14528ogReferen = "" ;
      Z14511ogReclam = "" ;
      Z14518ogLote = "" ;
      Z14512ogJogo = "" ;
      Z14513ogPoleg = "" ;
      Z14514ogFio = "" ;
      Z14560ogFio_ = "" ;
      Z14515ogMaqui = "" ;
      Z14516ogEntrada = "" ;
      Z14517ogVossaR = "" ;
      Z14519ogArtiCR = "" ;
      Z14520ogArtiAC = "" ;
      Z14521ogARecCod = 0 ;
      Z14554ogLocaliza = "" ;
      Z14559ogLocalizc = "" ;
   }

   public void initAll1VY1912( )
   {
      A14503ogLinha = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14503ogLinha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14503ogLinha), 10, 0));
      A14504ogEmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14504ogEmprCod", A14504ogEmprCod);
      A14505ogCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
      initializeNonKey1VY1912( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026727929340", true, true);
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
      httpContext.AddJavascriptSource("ponteway/v1/ogguiaimport.js", "?2026727929340", false, true);
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
      edtogLinha_Internalname = "OGLINHA" ;
      edtogEmprCod_Internalname = "OGEMPRCOD" ;
      edtogCliCod_Internalname = "OGCLICOD" ;
      edtogNmrGuia_Internalname = "OGNMRGUIA" ;
      edtogSerie_Internalname = "OGSERIE" ;
      edtogFecha_Internalname = "OGFECHA" ;
      edtogCodArt_Internalname = "OGCODART" ;
      edtogRolos_Internalname = "OGROLOS" ;
      edtogRolos__Internalname = "OGROLOS_" ;
      edtogQuant_Internalname = "OGQUANT" ;
      edtogQuant__Internalname = "OGQUANT_" ;
      edtogUnidad_Internalname = "OGUNIDAD" ;
      edtogUnidad__Internalname = "OGUNIDAD_" ;
      edtogReferen_Internalname = "OGREFEREN" ;
      edtogReclam_Internalname = "OGRECLAM" ;
      edtogLote_Internalname = "OGLOTE" ;
      edtogJogo_Internalname = "OGJOGO" ;
      edtogPoleg_Internalname = "OGPOLEG" ;
      edtogFio_Internalname = "OGFIO" ;
      edtogFio__Internalname = "OGFIO_" ;
      edtogMaqui_Internalname = "OGMAQUI" ;
      edtogEntrada_Internalname = "OGENTRADA" ;
      edtogVossaR_Internalname = "OGVOSSAR" ;
      edtogArtiCR_Internalname = "OGARTICR" ;
      edtogArtiAC_Internalname = "OGARTIAC" ;
      edtogARecCod_Internalname = "OGARECCOD" ;
      edtogLocaliza_Internalname = "OGLOCALIZA" ;
      edtogLocalizc_Internalname = "OGLOCALIZC" ;
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
      Form.setCaption( httpContext.getMessage( "Oliveira Gonçalo Guia Remesa", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtogLocalizc_Jsonclick = "" ;
      edtogLocalizc_Enabled = 1 ;
      edtogLocaliza_Jsonclick = "" ;
      edtogLocaliza_Enabled = 1 ;
      edtogARecCod_Jsonclick = "" ;
      edtogARecCod_Enabled = 1 ;
      edtogArtiAC_Jsonclick = "" ;
      edtogArtiAC_Enabled = 1 ;
      edtogArtiCR_Jsonclick = "" ;
      edtogArtiCR_Enabled = 1 ;
      edtogVossaR_Jsonclick = "" ;
      edtogVossaR_Enabled = 1 ;
      edtogEntrada_Jsonclick = "" ;
      edtogEntrada_Enabled = 1 ;
      edtogMaqui_Jsonclick = "" ;
      edtogMaqui_Enabled = 1 ;
      edtogFio__Jsonclick = "" ;
      edtogFio__Enabled = 1 ;
      edtogFio_Jsonclick = "" ;
      edtogFio_Enabled = 1 ;
      edtogPoleg_Jsonclick = "" ;
      edtogPoleg_Enabled = 1 ;
      edtogJogo_Jsonclick = "" ;
      edtogJogo_Enabled = 1 ;
      edtogLote_Jsonclick = "" ;
      edtogLote_Enabled = 1 ;
      edtogReclam_Jsonclick = "" ;
      edtogReclam_Enabled = 1 ;
      edtogReferen_Jsonclick = "" ;
      edtogReferen_Enabled = 1 ;
      edtogUnidad__Jsonclick = "" ;
      edtogUnidad__Enabled = 1 ;
      edtogUnidad_Jsonclick = "" ;
      edtogUnidad_Enabled = 1 ;
      edtogQuant__Jsonclick = "" ;
      edtogQuant__Enabled = 1 ;
      edtogQuant_Jsonclick = "" ;
      edtogQuant_Enabled = 1 ;
      edtogRolos__Jsonclick = "" ;
      edtogRolos__Enabled = 1 ;
      edtogRolos_Jsonclick = "" ;
      edtogRolos_Enabled = 1 ;
      edtogCodArt_Jsonclick = "" ;
      edtogCodArt_Enabled = 1 ;
      edtogFecha_Jsonclick = "" ;
      edtogFecha_Enabled = 1 ;
      edtogSerie_Jsonclick = "" ;
      edtogSerie_Enabled = 1 ;
      edtogNmrGuia_Jsonclick = "" ;
      edtogNmrGuia_Enabled = 1 ;
      edtogCliCod_Jsonclick = "" ;
      edtogCliCod_Enabled = 1 ;
      edtogEmprCod_Jsonclick = "" ;
      edtogEmprCod_Enabled = 1 ;
      edtogLinha_Jsonclick = "" ;
      edtogLinha_Enabled = 1 ;
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
      GX_FocusControl = edtogNmrGuia_Internalname ;
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

   public void valid_Ogclicod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14522ogNmrGuia", GXutil.ltrim( localUtil.ntoc( A14522ogNmrGuia, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14523ogSerie", GXutil.ltrim( localUtil.ntoc( A14523ogSerie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14506ogFecha", localUtil.format(A14506ogFecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A14507ogCodArt", A14507ogCodArt);
      httpContext.ajax_rsp_assign_attri("", false, "A14508ogRolos", GXutil.ltrim( localUtil.ntoc( A14508ogRolos, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14556ogRolos_", GXutil.ltrim( localUtil.ntoc( A14556ogRolos_, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14509ogQuant", GXutil.ltrim( localUtil.ntoc( A14509ogQuant, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14557ogQuant_", GXutil.ltrim( localUtil.ntoc( A14557ogQuant_, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14510ogUnidad", A14510ogUnidad);
      httpContext.ajax_rsp_assign_attri("", false, "A14558ogUnidad_", A14558ogUnidad_);
      httpContext.ajax_rsp_assign_attri("", false, "A14528ogReferen", A14528ogReferen);
      httpContext.ajax_rsp_assign_attri("", false, "A14511ogReclam", A14511ogReclam);
      httpContext.ajax_rsp_assign_attri("", false, "A14518ogLote", A14518ogLote);
      httpContext.ajax_rsp_assign_attri("", false, "A14512ogJogo", A14512ogJogo);
      httpContext.ajax_rsp_assign_attri("", false, "A14513ogPoleg", A14513ogPoleg);
      httpContext.ajax_rsp_assign_attri("", false, "A14514ogFio", A14514ogFio);
      httpContext.ajax_rsp_assign_attri("", false, "A14560ogFio_", A14560ogFio_);
      httpContext.ajax_rsp_assign_attri("", false, "A14515ogMaqui", A14515ogMaqui);
      httpContext.ajax_rsp_assign_attri("", false, "A14516ogEntrada", A14516ogEntrada);
      httpContext.ajax_rsp_assign_attri("", false, "A14517ogVossaR", A14517ogVossaR);
      httpContext.ajax_rsp_assign_attri("", false, "A14519ogArtiCR", A14519ogArtiCR);
      httpContext.ajax_rsp_assign_attri("", false, "A14520ogArtiAC", A14520ogArtiAC);
      httpContext.ajax_rsp_assign_attri("", false, "A14521ogARecCod", GXutil.ltrim( localUtil.ntoc( A14521ogARecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14554ogLocaliza", A14554ogLocaliza);
      httpContext.ajax_rsp_assign_attri("", false, "A14559ogLocalizc", A14559ogLocalizc);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14503ogLinha", GXutil.ltrim( localUtil.ntoc( Z14503ogLinha, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14504ogEmprCod", Z14504ogEmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14505ogCliCod", GXutil.ltrim( localUtil.ntoc( Z14505ogCliCod, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14522ogNmrGuia", GXutil.ltrim( localUtil.ntoc( Z14522ogNmrGuia, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14523ogSerie", GXutil.ltrim( localUtil.ntoc( Z14523ogSerie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14506ogFecha", localUtil.format(Z14506ogFecha, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14507ogCodArt", Z14507ogCodArt);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14508ogRolos", GXutil.ltrim( localUtil.ntoc( Z14508ogRolos, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14556ogRolos_", GXutil.ltrim( localUtil.ntoc( Z14556ogRolos_, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14509ogQuant", GXutil.ltrim( localUtil.ntoc( Z14509ogQuant, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14557ogQuant_", GXutil.ltrim( localUtil.ntoc( Z14557ogQuant_, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14510ogUnidad", Z14510ogUnidad);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14558ogUnidad_", Z14558ogUnidad_);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14528ogReferen", Z14528ogReferen);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14511ogReclam", Z14511ogReclam);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14518ogLote", Z14518ogLote);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14512ogJogo", Z14512ogJogo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14513ogPoleg", Z14513ogPoleg);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14514ogFio", Z14514ogFio);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14560ogFio_", Z14560ogFio_);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14515ogMaqui", Z14515ogMaqui);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14516ogEntrada", Z14516ogEntrada);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14517ogVossaR", Z14517ogVossaR);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14519ogArtiCR", Z14519ogArtiCR);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14520ogArtiAC", Z14520ogArtiAC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14521ogARecCod", GXutil.ltrim( localUtil.ntoc( Z14521ogARecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14554ogLocaliza", Z14554ogLocaliza);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14559ogLocalizc", Z14559ogLocalizc);
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
      setEventMetadata("VALID_OGLINHA","{handler:'valid_Oglinha',iparms:[]");
      setEventMetadata("VALID_OGLINHA",",oparms:[]}");
      setEventMetadata("VALID_OGEMPRCOD","{handler:'valid_Ogemprcod',iparms:[]");
      setEventMetadata("VALID_OGEMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_OGCLICOD","{handler:'valid_Ogclicod',iparms:[{av:'A14503ogLinha',fld:'OGLINHA',pic:'ZZZZZZZZZ9'},{av:'A14504ogEmprCod',fld:'OGEMPRCOD',pic:''},{av:'A14505ogCliCod',fld:'OGCLICOD',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_OGCLICOD",",oparms:[{av:'A14522ogNmrGuia',fld:'OGNMRGUIA',pic:'ZZZZZZZZZ9'},{av:'A14523ogSerie',fld:'OGSERIE',pic:'ZZZ9'},{av:'A14506ogFecha',fld:'OGFECHA',pic:''},{av:'A14507ogCodArt',fld:'OGCODART',pic:''},{av:'A14508ogRolos',fld:'OGROLOS',pic:'ZZ9'},{av:'A14556ogRolos_',fld:'OGROLOS_',pic:'ZZ9'},{av:'A14509ogQuant',fld:'OGQUANT',pic:'ZZZ9.99'},{av:'A14557ogQuant_',fld:'OGQUANT_',pic:'ZZZ9.99'},{av:'A14510ogUnidad',fld:'OGUNIDAD',pic:''},{av:'A14558ogUnidad_',fld:'OGUNIDAD_',pic:''},{av:'A14528ogReferen',fld:'OGREFEREN',pic:''},{av:'A14511ogReclam',fld:'OGRECLAM',pic:''},{av:'A14518ogLote',fld:'OGLOTE',pic:''},{av:'A14512ogJogo',fld:'OGJOGO',pic:''},{av:'A14513ogPoleg',fld:'OGPOLEG',pic:''},{av:'A14514ogFio',fld:'OGFIO',pic:''},{av:'A14560ogFio_',fld:'OGFIO_',pic:''},{av:'A14515ogMaqui',fld:'OGMAQUI',pic:''},{av:'A14516ogEntrada',fld:'OGENTRADA',pic:''},{av:'A14517ogVossaR',fld:'OGVOSSAR',pic:''},{av:'A14519ogArtiCR',fld:'OGARTICR',pic:''},{av:'A14520ogArtiAC',fld:'OGARTIAC',pic:''},{av:'A14521ogARecCod',fld:'OGARECCOD',pic:'ZZZZZZZ9'},{av:'A14554ogLocaliza',fld:'OGLOCALIZA',pic:''},{av:'A14559ogLocalizc',fld:'OGLOCALIZC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14503ogLinha'},{av:'Z14504ogEmprCod'},{av:'Z14505ogCliCod'},{av:'Z14522ogNmrGuia'},{av:'Z14523ogSerie'},{av:'Z14506ogFecha'},{av:'Z14507ogCodArt'},{av:'Z14508ogRolos'},{av:'Z14556ogRolos_'},{av:'Z14509ogQuant'},{av:'Z14557ogQuant_'},{av:'Z14510ogUnidad'},{av:'Z14558ogUnidad_'},{av:'Z14528ogReferen'},{av:'Z14511ogReclam'},{av:'Z14518ogLote'},{av:'Z14512ogJogo'},{av:'Z14513ogPoleg'},{av:'Z14514ogFio'},{av:'Z14560ogFio_'},{av:'Z14515ogMaqui'},{av:'Z14516ogEntrada'},{av:'Z14517ogVossaR'},{av:'Z14519ogArtiCR'},{av:'Z14520ogArtiAC'},{av:'Z14521ogARecCod'},{av:'Z14554ogLocaliza'},{av:'Z14559ogLocalizc'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z14504ogEmprCod = "" ;
      Z14506ogFecha = GXutil.nullDate() ;
      Z14507ogCodArt = "" ;
      Z14509ogQuant = DecimalUtil.ZERO ;
      Z14557ogQuant_ = DecimalUtil.ZERO ;
      Z14510ogUnidad = "" ;
      Z14558ogUnidad_ = "" ;
      Z14528ogReferen = "" ;
      Z14511ogReclam = "" ;
      Z14518ogLote = "" ;
      Z14512ogJogo = "" ;
      Z14513ogPoleg = "" ;
      Z14514ogFio = "" ;
      Z14560ogFio_ = "" ;
      Z14515ogMaqui = "" ;
      Z14516ogEntrada = "" ;
      Z14517ogVossaR = "" ;
      Z14519ogArtiCR = "" ;
      Z14520ogArtiAC = "" ;
      Z14554ogLocaliza = "" ;
      Z14559ogLocalizc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A14504ogEmprCod = "" ;
      A14506ogFecha = GXutil.nullDate() ;
      A14507ogCodArt = "" ;
      A14509ogQuant = DecimalUtil.ZERO ;
      A14557ogQuant_ = DecimalUtil.ZERO ;
      A14510ogUnidad = "" ;
      A14558ogUnidad_ = "" ;
      A14528ogReferen = "" ;
      A14511ogReclam = "" ;
      A14518ogLote = "" ;
      A14512ogJogo = "" ;
      A14513ogPoleg = "" ;
      A14514ogFio = "" ;
      A14560ogFio_ = "" ;
      A14515ogMaqui = "" ;
      A14516ogEntrada = "" ;
      A14517ogVossaR = "" ;
      A14519ogArtiCR = "" ;
      A14520ogArtiAC = "" ;
      A14554ogLocaliza = "" ;
      A14559ogLocalizc = "" ;
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
      T01VY4_A14503ogLinha = new long[1] ;
      T01VY4_A14504ogEmprCod = new String[] {""} ;
      T01VY4_A14505ogCliCod = new long[1] ;
      T01VY4_A14522ogNmrGuia = new long[1] ;
      T01VY4_n14522ogNmrGuia = new boolean[] {false} ;
      T01VY4_A14523ogSerie = new short[1] ;
      T01VY4_n14523ogSerie = new boolean[] {false} ;
      T01VY4_A14506ogFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01VY4_n14506ogFecha = new boolean[] {false} ;
      T01VY4_A14507ogCodArt = new String[] {""} ;
      T01VY4_n14507ogCodArt = new boolean[] {false} ;
      T01VY4_A14508ogRolos = new short[1] ;
      T01VY4_n14508ogRolos = new boolean[] {false} ;
      T01VY4_A14556ogRolos_ = new short[1] ;
      T01VY4_n14556ogRolos_ = new boolean[] {false} ;
      T01VY4_A14509ogQuant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VY4_n14509ogQuant = new boolean[] {false} ;
      T01VY4_A14557ogQuant_ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VY4_n14557ogQuant_ = new boolean[] {false} ;
      T01VY4_A14510ogUnidad = new String[] {""} ;
      T01VY4_n14510ogUnidad = new boolean[] {false} ;
      T01VY4_A14558ogUnidad_ = new String[] {""} ;
      T01VY4_n14558ogUnidad_ = new boolean[] {false} ;
      T01VY4_A14528ogReferen = new String[] {""} ;
      T01VY4_n14528ogReferen = new boolean[] {false} ;
      T01VY4_A14511ogReclam = new String[] {""} ;
      T01VY4_n14511ogReclam = new boolean[] {false} ;
      T01VY4_A14518ogLote = new String[] {""} ;
      T01VY4_n14518ogLote = new boolean[] {false} ;
      T01VY4_A14512ogJogo = new String[] {""} ;
      T01VY4_n14512ogJogo = new boolean[] {false} ;
      T01VY4_A14513ogPoleg = new String[] {""} ;
      T01VY4_n14513ogPoleg = new boolean[] {false} ;
      T01VY4_A14514ogFio = new String[] {""} ;
      T01VY4_n14514ogFio = new boolean[] {false} ;
      T01VY4_A14560ogFio_ = new String[] {""} ;
      T01VY4_n14560ogFio_ = new boolean[] {false} ;
      T01VY4_A14515ogMaqui = new String[] {""} ;
      T01VY4_n14515ogMaqui = new boolean[] {false} ;
      T01VY4_A14516ogEntrada = new String[] {""} ;
      T01VY4_n14516ogEntrada = new boolean[] {false} ;
      T01VY4_A14517ogVossaR = new String[] {""} ;
      T01VY4_n14517ogVossaR = new boolean[] {false} ;
      T01VY4_A14519ogArtiCR = new String[] {""} ;
      T01VY4_n14519ogArtiCR = new boolean[] {false} ;
      T01VY4_A14520ogArtiAC = new String[] {""} ;
      T01VY4_n14520ogArtiAC = new boolean[] {false} ;
      T01VY4_A14521ogARecCod = new int[1] ;
      T01VY4_n14521ogARecCod = new boolean[] {false} ;
      T01VY4_A14554ogLocaliza = new String[] {""} ;
      T01VY4_n14554ogLocaliza = new boolean[] {false} ;
      T01VY4_A14559ogLocalizc = new String[] {""} ;
      T01VY4_n14559ogLocalizc = new boolean[] {false} ;
      T01VY5_A14503ogLinha = new long[1] ;
      T01VY5_A14504ogEmprCod = new String[] {""} ;
      T01VY5_A14505ogCliCod = new long[1] ;
      T01VY3_A14503ogLinha = new long[1] ;
      T01VY3_A14504ogEmprCod = new String[] {""} ;
      T01VY3_A14505ogCliCod = new long[1] ;
      T01VY3_A14522ogNmrGuia = new long[1] ;
      T01VY3_n14522ogNmrGuia = new boolean[] {false} ;
      T01VY3_A14523ogSerie = new short[1] ;
      T01VY3_n14523ogSerie = new boolean[] {false} ;
      T01VY3_A14506ogFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01VY3_n14506ogFecha = new boolean[] {false} ;
      T01VY3_A14507ogCodArt = new String[] {""} ;
      T01VY3_n14507ogCodArt = new boolean[] {false} ;
      T01VY3_A14508ogRolos = new short[1] ;
      T01VY3_n14508ogRolos = new boolean[] {false} ;
      T01VY3_A14556ogRolos_ = new short[1] ;
      T01VY3_n14556ogRolos_ = new boolean[] {false} ;
      T01VY3_A14509ogQuant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VY3_n14509ogQuant = new boolean[] {false} ;
      T01VY3_A14557ogQuant_ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VY3_n14557ogQuant_ = new boolean[] {false} ;
      T01VY3_A14510ogUnidad = new String[] {""} ;
      T01VY3_n14510ogUnidad = new boolean[] {false} ;
      T01VY3_A14558ogUnidad_ = new String[] {""} ;
      T01VY3_n14558ogUnidad_ = new boolean[] {false} ;
      T01VY3_A14528ogReferen = new String[] {""} ;
      T01VY3_n14528ogReferen = new boolean[] {false} ;
      T01VY3_A14511ogReclam = new String[] {""} ;
      T01VY3_n14511ogReclam = new boolean[] {false} ;
      T01VY3_A14518ogLote = new String[] {""} ;
      T01VY3_n14518ogLote = new boolean[] {false} ;
      T01VY3_A14512ogJogo = new String[] {""} ;
      T01VY3_n14512ogJogo = new boolean[] {false} ;
      T01VY3_A14513ogPoleg = new String[] {""} ;
      T01VY3_n14513ogPoleg = new boolean[] {false} ;
      T01VY3_A14514ogFio = new String[] {""} ;
      T01VY3_n14514ogFio = new boolean[] {false} ;
      T01VY3_A14560ogFio_ = new String[] {""} ;
      T01VY3_n14560ogFio_ = new boolean[] {false} ;
      T01VY3_A14515ogMaqui = new String[] {""} ;
      T01VY3_n14515ogMaqui = new boolean[] {false} ;
      T01VY3_A14516ogEntrada = new String[] {""} ;
      T01VY3_n14516ogEntrada = new boolean[] {false} ;
      T01VY3_A14517ogVossaR = new String[] {""} ;
      T01VY3_n14517ogVossaR = new boolean[] {false} ;
      T01VY3_A14519ogArtiCR = new String[] {""} ;
      T01VY3_n14519ogArtiCR = new boolean[] {false} ;
      T01VY3_A14520ogArtiAC = new String[] {""} ;
      T01VY3_n14520ogArtiAC = new boolean[] {false} ;
      T01VY3_A14521ogARecCod = new int[1] ;
      T01VY3_n14521ogARecCod = new boolean[] {false} ;
      T01VY3_A14554ogLocaliza = new String[] {""} ;
      T01VY3_n14554ogLocaliza = new boolean[] {false} ;
      T01VY3_A14559ogLocalizc = new String[] {""} ;
      T01VY3_n14559ogLocalizc = new boolean[] {false} ;
      sMode1912 = "" ;
      T01VY6_A14503ogLinha = new long[1] ;
      T01VY6_A14504ogEmprCod = new String[] {""} ;
      T01VY6_A14505ogCliCod = new long[1] ;
      T01VY7_A14503ogLinha = new long[1] ;
      T01VY7_A14504ogEmprCod = new String[] {""} ;
      T01VY7_A14505ogCliCod = new long[1] ;
      T01VY2_A14503ogLinha = new long[1] ;
      T01VY2_A14504ogEmprCod = new String[] {""} ;
      T01VY2_A14505ogCliCod = new long[1] ;
      T01VY2_A14522ogNmrGuia = new long[1] ;
      T01VY2_n14522ogNmrGuia = new boolean[] {false} ;
      T01VY2_A14523ogSerie = new short[1] ;
      T01VY2_n14523ogSerie = new boolean[] {false} ;
      T01VY2_A14506ogFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01VY2_n14506ogFecha = new boolean[] {false} ;
      T01VY2_A14507ogCodArt = new String[] {""} ;
      T01VY2_n14507ogCodArt = new boolean[] {false} ;
      T01VY2_A14508ogRolos = new short[1] ;
      T01VY2_n14508ogRolos = new boolean[] {false} ;
      T01VY2_A14556ogRolos_ = new short[1] ;
      T01VY2_n14556ogRolos_ = new boolean[] {false} ;
      T01VY2_A14509ogQuant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VY2_n14509ogQuant = new boolean[] {false} ;
      T01VY2_A14557ogQuant_ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VY2_n14557ogQuant_ = new boolean[] {false} ;
      T01VY2_A14510ogUnidad = new String[] {""} ;
      T01VY2_n14510ogUnidad = new boolean[] {false} ;
      T01VY2_A14558ogUnidad_ = new String[] {""} ;
      T01VY2_n14558ogUnidad_ = new boolean[] {false} ;
      T01VY2_A14528ogReferen = new String[] {""} ;
      T01VY2_n14528ogReferen = new boolean[] {false} ;
      T01VY2_A14511ogReclam = new String[] {""} ;
      T01VY2_n14511ogReclam = new boolean[] {false} ;
      T01VY2_A14518ogLote = new String[] {""} ;
      T01VY2_n14518ogLote = new boolean[] {false} ;
      T01VY2_A14512ogJogo = new String[] {""} ;
      T01VY2_n14512ogJogo = new boolean[] {false} ;
      T01VY2_A14513ogPoleg = new String[] {""} ;
      T01VY2_n14513ogPoleg = new boolean[] {false} ;
      T01VY2_A14514ogFio = new String[] {""} ;
      T01VY2_n14514ogFio = new boolean[] {false} ;
      T01VY2_A14560ogFio_ = new String[] {""} ;
      T01VY2_n14560ogFio_ = new boolean[] {false} ;
      T01VY2_A14515ogMaqui = new String[] {""} ;
      T01VY2_n14515ogMaqui = new boolean[] {false} ;
      T01VY2_A14516ogEntrada = new String[] {""} ;
      T01VY2_n14516ogEntrada = new boolean[] {false} ;
      T01VY2_A14517ogVossaR = new String[] {""} ;
      T01VY2_n14517ogVossaR = new boolean[] {false} ;
      T01VY2_A14519ogArtiCR = new String[] {""} ;
      T01VY2_n14519ogArtiCR = new boolean[] {false} ;
      T01VY2_A14520ogArtiAC = new String[] {""} ;
      T01VY2_n14520ogArtiAC = new boolean[] {false} ;
      T01VY2_A14521ogARecCod = new int[1] ;
      T01VY2_n14521ogARecCod = new boolean[] {false} ;
      T01VY2_A14554ogLocaliza = new String[] {""} ;
      T01VY2_n14554ogLocaliza = new boolean[] {false} ;
      T01VY2_A14559ogLocalizc = new String[] {""} ;
      T01VY2_n14559ogLocalizc = new boolean[] {false} ;
      T01VY11_A14503ogLinha = new long[1] ;
      T01VY11_A14504ogEmprCod = new String[] {""} ;
      T01VY11_A14505ogCliCod = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ14504ogEmprCod = "" ;
      ZZ14506ogFecha = GXutil.nullDate() ;
      ZZ14507ogCodArt = "" ;
      ZZ14509ogQuant = DecimalUtil.ZERO ;
      ZZ14557ogQuant_ = DecimalUtil.ZERO ;
      ZZ14510ogUnidad = "" ;
      ZZ14558ogUnidad_ = "" ;
      ZZ14528ogReferen = "" ;
      ZZ14511ogReclam = "" ;
      ZZ14518ogLote = "" ;
      ZZ14512ogJogo = "" ;
      ZZ14513ogPoleg = "" ;
      ZZ14514ogFio = "" ;
      ZZ14560ogFio_ = "" ;
      ZZ14515ogMaqui = "" ;
      ZZ14516ogEntrada = "" ;
      ZZ14517ogVossaR = "" ;
      ZZ14519ogArtiCR = "" ;
      ZZ14520ogArtiAC = "" ;
      ZZ14554ogLocaliza = "" ;
      ZZ14559ogLocalizc = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.ogguiaimport__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.ogguiaimport__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.ogguiaimport__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.ogguiaimport__default(),
         new Object[] {
             new Object[] {
            T01VY2_A14503ogLinha, T01VY2_A14504ogEmprCod, T01VY2_A14505ogCliCod, T01VY2_A14522ogNmrGuia, T01VY2_n14522ogNmrGuia, T01VY2_A14523ogSerie, T01VY2_n14523ogSerie, T01VY2_A14506ogFecha, T01VY2_n14506ogFecha, T01VY2_A14507ogCodArt,
            T01VY2_n14507ogCodArt, T01VY2_A14508ogRolos, T01VY2_n14508ogRolos, T01VY2_A14556ogRolos_, T01VY2_n14556ogRolos_, T01VY2_A14509ogQuant, T01VY2_n14509ogQuant, T01VY2_A14557ogQuant_, T01VY2_n14557ogQuant_, T01VY2_A14510ogUnidad,
            T01VY2_n14510ogUnidad, T01VY2_A14558ogUnidad_, T01VY2_n14558ogUnidad_, T01VY2_A14528ogReferen, T01VY2_n14528ogReferen, T01VY2_A14511ogReclam, T01VY2_n14511ogReclam, T01VY2_A14518ogLote, T01VY2_n14518ogLote, T01VY2_A14512ogJogo,
            T01VY2_n14512ogJogo, T01VY2_A14513ogPoleg, T01VY2_n14513ogPoleg, T01VY2_A14514ogFio, T01VY2_n14514ogFio, T01VY2_A14560ogFio_, T01VY2_n14560ogFio_, T01VY2_A14515ogMaqui, T01VY2_n14515ogMaqui, T01VY2_A14516ogEntrada,
            T01VY2_n14516ogEntrada, T01VY2_A14517ogVossaR, T01VY2_n14517ogVossaR, T01VY2_A14519ogArtiCR, T01VY2_n14519ogArtiCR, T01VY2_A14520ogArtiAC, T01VY2_n14520ogArtiAC, T01VY2_A14521ogARecCod, T01VY2_n14521ogARecCod, T01VY2_A14554ogLocaliza,
            T01VY2_n14554ogLocaliza, T01VY2_A14559ogLocalizc, T01VY2_n14559ogLocalizc
            }
            , new Object[] {
            T01VY3_A14503ogLinha, T01VY3_A14504ogEmprCod, T01VY3_A14505ogCliCod, T01VY3_A14522ogNmrGuia, T01VY3_n14522ogNmrGuia, T01VY3_A14523ogSerie, T01VY3_n14523ogSerie, T01VY3_A14506ogFecha, T01VY3_n14506ogFecha, T01VY3_A14507ogCodArt,
            T01VY3_n14507ogCodArt, T01VY3_A14508ogRolos, T01VY3_n14508ogRolos, T01VY3_A14556ogRolos_, T01VY3_n14556ogRolos_, T01VY3_A14509ogQuant, T01VY3_n14509ogQuant, T01VY3_A14557ogQuant_, T01VY3_n14557ogQuant_, T01VY3_A14510ogUnidad,
            T01VY3_n14510ogUnidad, T01VY3_A14558ogUnidad_, T01VY3_n14558ogUnidad_, T01VY3_A14528ogReferen, T01VY3_n14528ogReferen, T01VY3_A14511ogReclam, T01VY3_n14511ogReclam, T01VY3_A14518ogLote, T01VY3_n14518ogLote, T01VY3_A14512ogJogo,
            T01VY3_n14512ogJogo, T01VY3_A14513ogPoleg, T01VY3_n14513ogPoleg, T01VY3_A14514ogFio, T01VY3_n14514ogFio, T01VY3_A14560ogFio_, T01VY3_n14560ogFio_, T01VY3_A14515ogMaqui, T01VY3_n14515ogMaqui, T01VY3_A14516ogEntrada,
            T01VY3_n14516ogEntrada, T01VY3_A14517ogVossaR, T01VY3_n14517ogVossaR, T01VY3_A14519ogArtiCR, T01VY3_n14519ogArtiCR, T01VY3_A14520ogArtiAC, T01VY3_n14520ogArtiAC, T01VY3_A14521ogARecCod, T01VY3_n14521ogARecCod, T01VY3_A14554ogLocaliza,
            T01VY3_n14554ogLocaliza, T01VY3_A14559ogLocalizc, T01VY3_n14559ogLocalizc
            }
            , new Object[] {
            T01VY4_A14503ogLinha, T01VY4_A14504ogEmprCod, T01VY4_A14505ogCliCod, T01VY4_A14522ogNmrGuia, T01VY4_n14522ogNmrGuia, T01VY4_A14523ogSerie, T01VY4_n14523ogSerie, T01VY4_A14506ogFecha, T01VY4_n14506ogFecha, T01VY4_A14507ogCodArt,
            T01VY4_n14507ogCodArt, T01VY4_A14508ogRolos, T01VY4_n14508ogRolos, T01VY4_A14556ogRolos_, T01VY4_n14556ogRolos_, T01VY4_A14509ogQuant, T01VY4_n14509ogQuant, T01VY4_A14557ogQuant_, T01VY4_n14557ogQuant_, T01VY4_A14510ogUnidad,
            T01VY4_n14510ogUnidad, T01VY4_A14558ogUnidad_, T01VY4_n14558ogUnidad_, T01VY4_A14528ogReferen, T01VY4_n14528ogReferen, T01VY4_A14511ogReclam, T01VY4_n14511ogReclam, T01VY4_A14518ogLote, T01VY4_n14518ogLote, T01VY4_A14512ogJogo,
            T01VY4_n14512ogJogo, T01VY4_A14513ogPoleg, T01VY4_n14513ogPoleg, T01VY4_A14514ogFio, T01VY4_n14514ogFio, T01VY4_A14560ogFio_, T01VY4_n14560ogFio_, T01VY4_A14515ogMaqui, T01VY4_n14515ogMaqui, T01VY4_A14516ogEntrada,
            T01VY4_n14516ogEntrada, T01VY4_A14517ogVossaR, T01VY4_n14517ogVossaR, T01VY4_A14519ogArtiCR, T01VY4_n14519ogArtiCR, T01VY4_A14520ogArtiAC, T01VY4_n14520ogArtiAC, T01VY4_A14521ogARecCod, T01VY4_n14521ogARecCod, T01VY4_A14554ogLocaliza,
            T01VY4_n14554ogLocaliza, T01VY4_A14559ogLocalizc, T01VY4_n14559ogLocalizc
            }
            , new Object[] {
            T01VY5_A14503ogLinha, T01VY5_A14504ogEmprCod, T01VY5_A14505ogCliCod
            }
            , new Object[] {
            T01VY6_A14503ogLinha, T01VY6_A14504ogEmprCod, T01VY6_A14505ogCliCod
            }
            , new Object[] {
            T01VY7_A14503ogLinha, T01VY7_A14504ogEmprCod, T01VY7_A14505ogCliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01VY11_A14503ogLinha, T01VY11_A14504ogEmprCod, T01VY11_A14505ogCliCod
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z14523ogSerie ;
   private short Z14508ogRolos ;
   private short Z14556ogRolos_ ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14523ogSerie ;
   private short A14508ogRolos ;
   private short A14556ogRolos_ ;
   private short RcdFound1912 ;
   private short nIsDirty_1912 ;
   private short ZZ14523ogSerie ;
   private short ZZ14508ogRolos ;
   private short ZZ14556ogRolos_ ;
   private int Z14521ogARecCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtogLinha_Enabled ;
   private int edtogEmprCod_Enabled ;
   private int edtogCliCod_Enabled ;
   private int edtogNmrGuia_Enabled ;
   private int edtogSerie_Enabled ;
   private int edtogFecha_Enabled ;
   private int edtogCodArt_Enabled ;
   private int edtogRolos_Enabled ;
   private int edtogRolos__Enabled ;
   private int edtogQuant_Enabled ;
   private int edtogQuant__Enabled ;
   private int edtogUnidad_Enabled ;
   private int edtogUnidad__Enabled ;
   private int edtogReferen_Enabled ;
   private int edtogReclam_Enabled ;
   private int edtogLote_Enabled ;
   private int edtogJogo_Enabled ;
   private int edtogPoleg_Enabled ;
   private int edtogFio_Enabled ;
   private int edtogFio__Enabled ;
   private int edtogMaqui_Enabled ;
   private int edtogEntrada_Enabled ;
   private int edtogVossaR_Enabled ;
   private int edtogArtiCR_Enabled ;
   private int edtogArtiAC_Enabled ;
   private int A14521ogARecCod ;
   private int edtogARecCod_Enabled ;
   private int edtogLocaliza_Enabled ;
   private int edtogLocalizc_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ14521ogARecCod ;
   private long Z14503ogLinha ;
   private long Z14505ogCliCod ;
   private long Z14522ogNmrGuia ;
   private long A14503ogLinha ;
   private long A14505ogCliCod ;
   private long A14522ogNmrGuia ;
   private long ZZ14503ogLinha ;
   private long ZZ14505ogCliCod ;
   private long ZZ14522ogNmrGuia ;
   private java.math.BigDecimal Z14509ogQuant ;
   private java.math.BigDecimal Z14557ogQuant_ ;
   private java.math.BigDecimal A14509ogQuant ;
   private java.math.BigDecimal A14557ogQuant_ ;
   private java.math.BigDecimal ZZ14509ogQuant ;
   private java.math.BigDecimal ZZ14557ogQuant_ ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtogLinha_Internalname ;
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
   private String edtogLinha_Jsonclick ;
   private String edtogEmprCod_Internalname ;
   private String edtogEmprCod_Jsonclick ;
   private String edtogCliCod_Internalname ;
   private String edtogCliCod_Jsonclick ;
   private String edtogNmrGuia_Internalname ;
   private String edtogNmrGuia_Jsonclick ;
   private String edtogSerie_Internalname ;
   private String edtogSerie_Jsonclick ;
   private String edtogFecha_Internalname ;
   private String edtogFecha_Jsonclick ;
   private String edtogCodArt_Internalname ;
   private String edtogCodArt_Jsonclick ;
   private String edtogRolos_Internalname ;
   private String edtogRolos_Jsonclick ;
   private String edtogRolos__Internalname ;
   private String edtogRolos__Jsonclick ;
   private String edtogQuant_Internalname ;
   private String edtogQuant_Jsonclick ;
   private String edtogQuant__Internalname ;
   private String edtogQuant__Jsonclick ;
   private String edtogUnidad_Internalname ;
   private String edtogUnidad_Jsonclick ;
   private String edtogUnidad__Internalname ;
   private String edtogUnidad__Jsonclick ;
   private String edtogReferen_Internalname ;
   private String edtogReferen_Jsonclick ;
   private String edtogReclam_Internalname ;
   private String edtogReclam_Jsonclick ;
   private String edtogLote_Internalname ;
   private String edtogLote_Jsonclick ;
   private String edtogJogo_Internalname ;
   private String edtogJogo_Jsonclick ;
   private String edtogPoleg_Internalname ;
   private String edtogPoleg_Jsonclick ;
   private String edtogFio_Internalname ;
   private String edtogFio_Jsonclick ;
   private String edtogFio__Internalname ;
   private String edtogFio__Jsonclick ;
   private String edtogMaqui_Internalname ;
   private String edtogMaqui_Jsonclick ;
   private String edtogEntrada_Internalname ;
   private String edtogEntrada_Jsonclick ;
   private String edtogVossaR_Internalname ;
   private String edtogVossaR_Jsonclick ;
   private String edtogArtiCR_Internalname ;
   private String edtogArtiCR_Jsonclick ;
   private String edtogArtiAC_Internalname ;
   private String edtogArtiAC_Jsonclick ;
   private String edtogARecCod_Internalname ;
   private String edtogARecCod_Jsonclick ;
   private String edtogLocaliza_Internalname ;
   private String edtogLocaliza_Jsonclick ;
   private String edtogLocalizc_Internalname ;
   private String edtogLocalizc_Jsonclick ;
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
   private String sMode1912 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z14506ogFecha ;
   private java.util.Date A14506ogFecha ;
   private java.util.Date ZZ14506ogFecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n14522ogNmrGuia ;
   private boolean n14523ogSerie ;
   private boolean n14506ogFecha ;
   private boolean n14507ogCodArt ;
   private boolean n14508ogRolos ;
   private boolean n14556ogRolos_ ;
   private boolean n14509ogQuant ;
   private boolean n14557ogQuant_ ;
   private boolean n14510ogUnidad ;
   private boolean n14558ogUnidad_ ;
   private boolean n14528ogReferen ;
   private boolean n14511ogReclam ;
   private boolean n14518ogLote ;
   private boolean n14512ogJogo ;
   private boolean n14513ogPoleg ;
   private boolean n14514ogFio ;
   private boolean n14560ogFio_ ;
   private boolean n14515ogMaqui ;
   private boolean n14516ogEntrada ;
   private boolean n14517ogVossaR ;
   private boolean n14519ogArtiCR ;
   private boolean n14520ogArtiAC ;
   private boolean n14521ogARecCod ;
   private boolean n14554ogLocaliza ;
   private boolean n14559ogLocalizc ;
   private boolean Gx_longc ;
   private String Z14504ogEmprCod ;
   private String Z14507ogCodArt ;
   private String Z14510ogUnidad ;
   private String Z14558ogUnidad_ ;
   private String Z14528ogReferen ;
   private String Z14511ogReclam ;
   private String Z14518ogLote ;
   private String Z14512ogJogo ;
   private String Z14513ogPoleg ;
   private String Z14514ogFio ;
   private String Z14560ogFio_ ;
   private String Z14515ogMaqui ;
   private String Z14516ogEntrada ;
   private String Z14517ogVossaR ;
   private String Z14519ogArtiCR ;
   private String Z14520ogArtiAC ;
   private String Z14554ogLocaliza ;
   private String Z14559ogLocalizc ;
   private String A14504ogEmprCod ;
   private String A14507ogCodArt ;
   private String A14510ogUnidad ;
   private String A14558ogUnidad_ ;
   private String A14528ogReferen ;
   private String A14511ogReclam ;
   private String A14518ogLote ;
   private String A14512ogJogo ;
   private String A14513ogPoleg ;
   private String A14514ogFio ;
   private String A14560ogFio_ ;
   private String A14515ogMaqui ;
   private String A14516ogEntrada ;
   private String A14517ogVossaR ;
   private String A14519ogArtiCR ;
   private String A14520ogArtiAC ;
   private String A14554ogLocaliza ;
   private String A14559ogLocalizc ;
   private String ZZ14504ogEmprCod ;
   private String ZZ14507ogCodArt ;
   private String ZZ14510ogUnidad ;
   private String ZZ14558ogUnidad_ ;
   private String ZZ14528ogReferen ;
   private String ZZ14511ogReclam ;
   private String ZZ14518ogLote ;
   private String ZZ14512ogJogo ;
   private String ZZ14513ogPoleg ;
   private String ZZ14514ogFio ;
   private String ZZ14560ogFio_ ;
   private String ZZ14515ogMaqui ;
   private String ZZ14516ogEntrada ;
   private String ZZ14517ogVossaR ;
   private String ZZ14519ogArtiCR ;
   private String ZZ14520ogArtiAC ;
   private String ZZ14554ogLocaliza ;
   private String ZZ14559ogLocalizc ;
   private IDataStoreProvider pr_default ;
   private long[] T01VY4_A14503ogLinha ;
   private String[] T01VY4_A14504ogEmprCod ;
   private long[] T01VY4_A14505ogCliCod ;
   private long[] T01VY4_A14522ogNmrGuia ;
   private boolean[] T01VY4_n14522ogNmrGuia ;
   private short[] T01VY4_A14523ogSerie ;
   private boolean[] T01VY4_n14523ogSerie ;
   private java.util.Date[] T01VY4_A14506ogFecha ;
   private boolean[] T01VY4_n14506ogFecha ;
   private String[] T01VY4_A14507ogCodArt ;
   private boolean[] T01VY4_n14507ogCodArt ;
   private short[] T01VY4_A14508ogRolos ;
   private boolean[] T01VY4_n14508ogRolos ;
   private short[] T01VY4_A14556ogRolos_ ;
   private boolean[] T01VY4_n14556ogRolos_ ;
   private java.math.BigDecimal[] T01VY4_A14509ogQuant ;
   private boolean[] T01VY4_n14509ogQuant ;
   private java.math.BigDecimal[] T01VY4_A14557ogQuant_ ;
   private boolean[] T01VY4_n14557ogQuant_ ;
   private String[] T01VY4_A14510ogUnidad ;
   private boolean[] T01VY4_n14510ogUnidad ;
   private String[] T01VY4_A14558ogUnidad_ ;
   private boolean[] T01VY4_n14558ogUnidad_ ;
   private String[] T01VY4_A14528ogReferen ;
   private boolean[] T01VY4_n14528ogReferen ;
   private String[] T01VY4_A14511ogReclam ;
   private boolean[] T01VY4_n14511ogReclam ;
   private String[] T01VY4_A14518ogLote ;
   private boolean[] T01VY4_n14518ogLote ;
   private String[] T01VY4_A14512ogJogo ;
   private boolean[] T01VY4_n14512ogJogo ;
   private String[] T01VY4_A14513ogPoleg ;
   private boolean[] T01VY4_n14513ogPoleg ;
   private String[] T01VY4_A14514ogFio ;
   private boolean[] T01VY4_n14514ogFio ;
   private String[] T01VY4_A14560ogFio_ ;
   private boolean[] T01VY4_n14560ogFio_ ;
   private String[] T01VY4_A14515ogMaqui ;
   private boolean[] T01VY4_n14515ogMaqui ;
   private String[] T01VY4_A14516ogEntrada ;
   private boolean[] T01VY4_n14516ogEntrada ;
   private String[] T01VY4_A14517ogVossaR ;
   private boolean[] T01VY4_n14517ogVossaR ;
   private String[] T01VY4_A14519ogArtiCR ;
   private boolean[] T01VY4_n14519ogArtiCR ;
   private String[] T01VY4_A14520ogArtiAC ;
   private boolean[] T01VY4_n14520ogArtiAC ;
   private int[] T01VY4_A14521ogARecCod ;
   private boolean[] T01VY4_n14521ogARecCod ;
   private String[] T01VY4_A14554ogLocaliza ;
   private boolean[] T01VY4_n14554ogLocaliza ;
   private String[] T01VY4_A14559ogLocalizc ;
   private boolean[] T01VY4_n14559ogLocalizc ;
   private long[] T01VY5_A14503ogLinha ;
   private String[] T01VY5_A14504ogEmprCod ;
   private long[] T01VY5_A14505ogCliCod ;
   private long[] T01VY3_A14503ogLinha ;
   private String[] T01VY3_A14504ogEmprCod ;
   private long[] T01VY3_A14505ogCliCod ;
   private long[] T01VY3_A14522ogNmrGuia ;
   private boolean[] T01VY3_n14522ogNmrGuia ;
   private short[] T01VY3_A14523ogSerie ;
   private boolean[] T01VY3_n14523ogSerie ;
   private java.util.Date[] T01VY3_A14506ogFecha ;
   private boolean[] T01VY3_n14506ogFecha ;
   private String[] T01VY3_A14507ogCodArt ;
   private boolean[] T01VY3_n14507ogCodArt ;
   private short[] T01VY3_A14508ogRolos ;
   private boolean[] T01VY3_n14508ogRolos ;
   private short[] T01VY3_A14556ogRolos_ ;
   private boolean[] T01VY3_n14556ogRolos_ ;
   private java.math.BigDecimal[] T01VY3_A14509ogQuant ;
   private boolean[] T01VY3_n14509ogQuant ;
   private java.math.BigDecimal[] T01VY3_A14557ogQuant_ ;
   private boolean[] T01VY3_n14557ogQuant_ ;
   private String[] T01VY3_A14510ogUnidad ;
   private boolean[] T01VY3_n14510ogUnidad ;
   private String[] T01VY3_A14558ogUnidad_ ;
   private boolean[] T01VY3_n14558ogUnidad_ ;
   private String[] T01VY3_A14528ogReferen ;
   private boolean[] T01VY3_n14528ogReferen ;
   private String[] T01VY3_A14511ogReclam ;
   private boolean[] T01VY3_n14511ogReclam ;
   private String[] T01VY3_A14518ogLote ;
   private boolean[] T01VY3_n14518ogLote ;
   private String[] T01VY3_A14512ogJogo ;
   private boolean[] T01VY3_n14512ogJogo ;
   private String[] T01VY3_A14513ogPoleg ;
   private boolean[] T01VY3_n14513ogPoleg ;
   private String[] T01VY3_A14514ogFio ;
   private boolean[] T01VY3_n14514ogFio ;
   private String[] T01VY3_A14560ogFio_ ;
   private boolean[] T01VY3_n14560ogFio_ ;
   private String[] T01VY3_A14515ogMaqui ;
   private boolean[] T01VY3_n14515ogMaqui ;
   private String[] T01VY3_A14516ogEntrada ;
   private boolean[] T01VY3_n14516ogEntrada ;
   private String[] T01VY3_A14517ogVossaR ;
   private boolean[] T01VY3_n14517ogVossaR ;
   private String[] T01VY3_A14519ogArtiCR ;
   private boolean[] T01VY3_n14519ogArtiCR ;
   private String[] T01VY3_A14520ogArtiAC ;
   private boolean[] T01VY3_n14520ogArtiAC ;
   private int[] T01VY3_A14521ogARecCod ;
   private boolean[] T01VY3_n14521ogARecCod ;
   private String[] T01VY3_A14554ogLocaliza ;
   private boolean[] T01VY3_n14554ogLocaliza ;
   private String[] T01VY3_A14559ogLocalizc ;
   private boolean[] T01VY3_n14559ogLocalizc ;
   private long[] T01VY6_A14503ogLinha ;
   private String[] T01VY6_A14504ogEmprCod ;
   private long[] T01VY6_A14505ogCliCod ;
   private long[] T01VY7_A14503ogLinha ;
   private String[] T01VY7_A14504ogEmprCod ;
   private long[] T01VY7_A14505ogCliCod ;
   private long[] T01VY2_A14503ogLinha ;
   private String[] T01VY2_A14504ogEmprCod ;
   private long[] T01VY2_A14505ogCliCod ;
   private long[] T01VY2_A14522ogNmrGuia ;
   private boolean[] T01VY2_n14522ogNmrGuia ;
   private short[] T01VY2_A14523ogSerie ;
   private boolean[] T01VY2_n14523ogSerie ;
   private java.util.Date[] T01VY2_A14506ogFecha ;
   private boolean[] T01VY2_n14506ogFecha ;
   private String[] T01VY2_A14507ogCodArt ;
   private boolean[] T01VY2_n14507ogCodArt ;
   private short[] T01VY2_A14508ogRolos ;
   private boolean[] T01VY2_n14508ogRolos ;
   private short[] T01VY2_A14556ogRolos_ ;
   private boolean[] T01VY2_n14556ogRolos_ ;
   private java.math.BigDecimal[] T01VY2_A14509ogQuant ;
   private boolean[] T01VY2_n14509ogQuant ;
   private java.math.BigDecimal[] T01VY2_A14557ogQuant_ ;
   private boolean[] T01VY2_n14557ogQuant_ ;
   private String[] T01VY2_A14510ogUnidad ;
   private boolean[] T01VY2_n14510ogUnidad ;
   private String[] T01VY2_A14558ogUnidad_ ;
   private boolean[] T01VY2_n14558ogUnidad_ ;
   private String[] T01VY2_A14528ogReferen ;
   private boolean[] T01VY2_n14528ogReferen ;
   private String[] T01VY2_A14511ogReclam ;
   private boolean[] T01VY2_n14511ogReclam ;
   private String[] T01VY2_A14518ogLote ;
   private boolean[] T01VY2_n14518ogLote ;
   private String[] T01VY2_A14512ogJogo ;
   private boolean[] T01VY2_n14512ogJogo ;
   private String[] T01VY2_A14513ogPoleg ;
   private boolean[] T01VY2_n14513ogPoleg ;
   private String[] T01VY2_A14514ogFio ;
   private boolean[] T01VY2_n14514ogFio ;
   private String[] T01VY2_A14560ogFio_ ;
   private boolean[] T01VY2_n14560ogFio_ ;
   private String[] T01VY2_A14515ogMaqui ;
   private boolean[] T01VY2_n14515ogMaqui ;
   private String[] T01VY2_A14516ogEntrada ;
   private boolean[] T01VY2_n14516ogEntrada ;
   private String[] T01VY2_A14517ogVossaR ;
   private boolean[] T01VY2_n14517ogVossaR ;
   private String[] T01VY2_A14519ogArtiCR ;
   private boolean[] T01VY2_n14519ogArtiCR ;
   private String[] T01VY2_A14520ogArtiAC ;
   private boolean[] T01VY2_n14520ogArtiAC ;
   private int[] T01VY2_A14521ogARecCod ;
   private boolean[] T01VY2_n14521ogARecCod ;
   private String[] T01VY2_A14554ogLocaliza ;
   private boolean[] T01VY2_n14554ogLocaliza ;
   private String[] T01VY2_A14559ogLocalizc ;
   private boolean[] T01VY2_n14559ogLocalizc ;
   private long[] T01VY11_A14503ogLinha ;
   private String[] T01VY11_A14504ogEmprCod ;
   private long[] T01VY11_A14505ogCliCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ogguiaimport__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ogguiaimport__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ogguiaimport__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ogguiaimport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01VY2", "SELECT ogLinha, ogEmprCod, ogCliCod, ogNmrGuia, ogSerie, ogFecha, ogCodArt, ogRolos, ogRolos_, ogQuant, ogQuant_, ogUnidad, ogUnidad_, ogReferen, ogReclam, ogLote, ogJogo, ogPoleg, ogFio, ogFio_, ogMaqui, ogEntrada, ogVossaR, ogArtiCR, ogArtiAC, ogARecCod, ogLocaliza, ogLocalizc FROM TXPOGGUIA WHERE ogLinha = ? AND ogEmprCod = ? AND ogCliCod = ?  FOR UPDATE OF ogNmrGuia, ogSerie, ogFecha, ogCodArt, ogRolos, ogRolos_, ogQuant, ogQuant_, ogUnidad, ogUnidad_, ogReferen, ogReclam, ogLote, ogJogo, ogPoleg, ogFio, ogFio_, ogMaqui, ogEntrada, ogVossaR, ogArtiCR, ogArtiAC, ogARecCod, ogLocaliza, ogLocalizc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VY3", "SELECT ogLinha, ogEmprCod, ogCliCod, ogNmrGuia, ogSerie, ogFecha, ogCodArt, ogRolos, ogRolos_, ogQuant, ogQuant_, ogUnidad, ogUnidad_, ogReferen, ogReclam, ogLote, ogJogo, ogPoleg, ogFio, ogFio_, ogMaqui, ogEntrada, ogVossaR, ogArtiCR, ogArtiAC, ogARecCod, ogLocaliza, ogLocalizc FROM TXPOGGUIA WHERE ogLinha = ? AND ogEmprCod = ? AND ogCliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VY4", "SELECT /*+ FIRST_ROWS(100) */ TM1.ogLinha, TM1.ogEmprCod, TM1.ogCliCod, TM1.ogNmrGuia, TM1.ogSerie, TM1.ogFecha, TM1.ogCodArt, TM1.ogRolos, TM1.ogRolos_, TM1.ogQuant, TM1.ogQuant_, TM1.ogUnidad, TM1.ogUnidad_, TM1.ogReferen, TM1.ogReclam, TM1.ogLote, TM1.ogJogo, TM1.ogPoleg, TM1.ogFio, TM1.ogFio_, TM1.ogMaqui, TM1.ogEntrada, TM1.ogVossaR, TM1.ogArtiCR, TM1.ogArtiAC, TM1.ogARecCod, TM1.ogLocaliza, TM1.ogLocalizc FROM TXPOGGUIA TM1 WHERE TM1.ogLinha = ? and TM1.ogEmprCod = ? and TM1.ogCliCod = ? ORDER BY TM1.ogLinha, TM1.ogEmprCod, TM1.ogCliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VY5", "SELECT /*+ FIRST_ROWS(1) */ ogLinha, ogEmprCod, ogCliCod FROM TXPOGGUIA WHERE ogLinha = ? AND ogEmprCod = ? AND ogCliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VY6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ogLinha, ogEmprCod, ogCliCod FROM TXPOGGUIA WHERE ( ogLinha > ? or ogLinha = ? and ogEmprCod > ? or ogEmprCod = ? and ogLinha = ? and ogCliCod > ?) ORDER BY ogLinha, ogEmprCod, ogCliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VY7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ogLinha, ogEmprCod, ogCliCod FROM TXPOGGUIA WHERE ( ogLinha < ? or ogLinha = ? and ogEmprCod < ? or ogEmprCod = ? and ogLinha = ? and ogCliCod < ?) ORDER BY ogLinha DESC, ogEmprCod DESC, ogCliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01VY8", "INSERT INTO TXPOGGUIA(ogLinha, ogEmprCod, ogCliCod, ogNmrGuia, ogSerie, ogFecha, ogCodArt, ogRolos, ogRolos_, ogQuant, ogQuant_, ogUnidad, ogUnidad_, ogReferen, ogReclam, ogLote, ogJogo, ogPoleg, ogFio, ogFio_, ogMaqui, ogEntrada, ogVossaR, ogArtiCR, ogArtiAC, ogARecCod, ogLocaliza, ogLocalizc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPOGGUIA")
         ,new UpdateCursor("T01VY9", "UPDATE TXPOGGUIA SET ogNmrGuia=?, ogSerie=?, ogFecha=?, ogCodArt=?, ogRolos=?, ogRolos_=?, ogQuant=?, ogQuant_=?, ogUnidad=?, ogUnidad_=?, ogReferen=?, ogReclam=?, ogLote=?, ogJogo=?, ogPoleg=?, ogFio=?, ogFio_=?, ogMaqui=?, ogEntrada=?, ogVossaR=?, ogArtiCR=?, ogArtiAC=?, ogARecCod=?, ogLocaliza=?, ogLocalizc=?  WHERE ogLinha = ? AND ogEmprCod = ? AND ogCliCod = ?", GX_NOMASK, "TXPOGGUIA")
         ,new UpdateCursor("T01VY10", "DELETE FROM TXPOGGUIA  WHERE ogLinha = ? AND ogEmprCod = ? AND ogCliCod = ?", GX_NOMASK, "TXPOGGUIA")
         ,new ForEachCursor("T01VY11", "SELECT /*+ FIRST_ROWS(100) */ ogLinha, ogEmprCod, ogCliCod FROM TXPOGGUIA ORDER BY ogLinha, ogEmprCod, ogCliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
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
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setVarchar(4, (String)parms[3], 10, false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 10, false);
               stmt.setVarchar(4, (String)parms[3], 10, false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[4]).longValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 100);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 16);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 4);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 4);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 4);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 4);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 15);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[40], 10);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[42], 100);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[44], 100);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[46], 100);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[48]).intValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[50], 10);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[52], 10);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 16);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 4);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 4);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 4);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 4);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 15);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 10);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 100);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 100);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 100);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[45]).intValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[47], 10);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 10);
               }
               stmt.setLong(26, ((Number) parms[50]).longValue());
               stmt.setVarchar(27, (String)parms[51], 10, false);
               stmt.setLong(28, ((Number) parms[52]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

