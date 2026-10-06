package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class albfas_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
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
         gxload_3( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A252CliCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
         gxload_5( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla ALBFAS", ""), (short)(0)) ;
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

   public albfas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public albfas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albfas_impl.class ));
   }

   public albfas_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla ALBFAS", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_ALBFAS.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALBFAS.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBFAS.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBFAS.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBFAS.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiFasLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiFasLin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiFasLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1240GuiFasLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1240GuiFasLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiFasLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtGuiFasLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBFAS.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBFAS.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiFasPKg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiFasPKg_Internalname, httpContext.getMessage( "Precio Kilo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiFasPKg_Internalname, GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiFasPKg_Enabled!=0) ? localUtil.format( A1241GuiFasPKg, "ZZZZZZ9.999") : localUtil.format( A1241GuiFasPKg, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiFasPKg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtGuiFasPKg_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiFasPMt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiFasPMt_Internalname, httpContext.getMessage( "Precio Metro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiFasPMt_Internalname, GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiFasPMt_Enabled!=0) ? localUtil.format( A1242GuiFasPMt, "ZZZZZZ9.999") : localUtil.format( A1242GuiFasPMt, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiFasPMt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtGuiFasPMt_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBFAS.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPreKgm_Enabled!=0) ? localUtil.format( A466FasPreKgm, "ZZZZZZ9.999") : localUtil.format( A466FasPreKgm, "ZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreKgm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasPreKgm_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBFAS.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPreMtr_Enabled!=0) ? localUtil.format( A467FasPreMtr, "ZZZZZZ9.999") : localUtil.format( A467FasPreMtr, "ZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreMtr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasPreMtr_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasKgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasKgm_Internalname, httpContext.getMessage( "Kilogramos Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasKgm_Enabled!=0) ? localUtil.format( A1275FasKgm, "ZZZZZ9.99") : localUtil.format( A1275FasKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasKgm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasMtr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasMtr_Internalname, httpContext.getMessage( "Metros por Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasMtr_Enabled!=0) ? localUtil.format( A1276FasMtr, "ZZZZZ9.99") : localUtil.format( A1276FasMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasMtr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasImp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasImp_Internalname, httpContext.getMessage( "Importe Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasImp_Internalname, GXutil.ltrim( localUtil.ntoc( A1277FasImp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasImp_Enabled!=0) ? localUtil.format( A1277FasImp, "ZZZZZZ9.99") : localUtil.format( A1277FasImp, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasImp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasImp_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasUnd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasUnd_Internalname, httpContext.getMessage( "Unidades", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12193FasUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasUnd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12193FasUnd), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12193FasUnd), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasUnd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasUnd_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPreUnd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasPreUnd_Internalname, httpContext.getMessage( "Precio Unidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12194FasPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPreUnd_Enabled!=0) ? localUtil.format( A12194FasPreUnd, "ZZZZZZ9.99999") : localUtil.format( A12194FasPreUnd, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreUnd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasPreUnd_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBFAS.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALBFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALBFAS.htm");
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
         Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z1240GuiFasLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1240GuiFasLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1241GuiFasPKg = localUtil.ctond( httpContext.cgiGet( "Z1241GuiFasPKg")) ;
         Z1242GuiFasPMt = localUtil.ctond( httpContext.cgiGet( "Z1242GuiFasPMt")) ;
         Z1275FasKgm = localUtil.ctond( httpContext.cgiGet( "Z1275FasKgm")) ;
         Z1276FasMtr = localUtil.ctond( httpContext.cgiGet( "Z1276FasMtr")) ;
         Z12193FasUnd = (int)(localUtil.ctol( httpContext.cgiGet( "Z12193FasUnd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12194FasPreUnd = localUtil.ctond( httpContext.cgiGet( "Z12194FasPreUnd")) ;
         Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbProCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A30AlbProCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         }
         else
         {
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         }
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGuiFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGuiFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GUIFASLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtGuiFasLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1240GuiFasLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
         }
         else
         {
            A1240GuiFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtGuiFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
         }
         A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GUIFASPKG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtGuiFasPKg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1241GuiFasPKg = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrimstr( A1241GuiFasPKg, 13, 5));
         }
         else
         {
            A1241GuiFasPKg = localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrimstr( A1241GuiFasPKg, 13, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GUIFASPMT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtGuiFasPMt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1242GuiFasPMt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrimstr( A1242GuiFasPMt, 13, 5));
         }
         else
         {
            A1242GuiFasPMt = localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrimstr( A1242GuiFasPMt, 13, 5));
         }
         A466FasPreKgm = localUtil.ctond( httpContext.cgiGet( edtFasPreKgm_Internalname)) ;
         n466FasPreKgm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrimstr( A466FasPreKgm, 13, 5));
         A467FasPreMtr = localUtil.ctond( httpContext.cgiGet( edtFasPreMtr_Internalname)) ;
         n467FasPreMtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrimstr( A467FasPreMtr, 13, 5));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1275FasKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1275FasKgm", GXutil.ltrimstr( A1275FasKgm, 9, 2));
         }
         else
         {
            A1275FasKgm = localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1275FasKgm", GXutil.ltrimstr( A1275FasKgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASMTR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasMtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1276FasMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1276FasMtr", GXutil.ltrimstr( A1276FasMtr, 9, 2));
         }
         else
         {
            A1276FasMtr = localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1276FasMtr", GXutil.ltrimstr( A1276FasMtr, 9, 2));
         }
         A1277FasImp = localUtil.ctond( httpContext.cgiGet( edtFasImp_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1277FasImp", GXutil.ltrimstr( A1277FasImp, 13, 5));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFasUnd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFasUnd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASUND");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasUnd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12193FasUnd = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A12193FasUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12193FasUnd), 6, 0));
         }
         else
         {
            A12193FasUnd = (int)(localUtil.ctol( httpContext.cgiGet( edtFasUnd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12193FasUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12193FasUnd), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasPreUnd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasPreUnd_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASPREUND");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasPreUnd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12194FasPreUnd = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A12194FasPreUnd", GXutil.ltrimstr( A12194FasPreUnd, 13, 5));
         }
         else
         {
            A12194FasPreUnd = localUtil.ctond( httpContext.cgiGet( edtFasPreUnd_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12194FasPreUnd", GXutil.ltrimstr( A12194FasPreUnd, 13, 5));
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
            A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A1240GuiFasLin = (short)(GXutil.lval( httpContext.GetPar( "GuiFasLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
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
            initAll1QJ194( ) ;
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
      disableAttributes1QJ194( ) ;
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

   public void resetCaption1QJ0( )
   {
   }

   public void zm1QJ194( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1241GuiFasPKg = T01QJ3_A1241GuiFasPKg[0] ;
            Z1242GuiFasPMt = T01QJ3_A1242GuiFasPMt[0] ;
            Z1275FasKgm = T01QJ3_A1275FasKgm[0] ;
            Z1276FasMtr = T01QJ3_A1276FasMtr[0] ;
            Z12193FasUnd = T01QJ3_A12193FasUnd[0] ;
            Z12194FasPreUnd = T01QJ3_A12194FasPreUnd[0] ;
            Z457FasCod = T01QJ3_A457FasCod[0] ;
         }
         else
         {
            Z1241GuiFasPKg = A1241GuiFasPKg ;
            Z1242GuiFasPMt = A1242GuiFasPMt ;
            Z1275FasKgm = A1275FasKgm ;
            Z1276FasMtr = A1276FasMtr ;
            Z12193FasUnd = A12193FasUnd ;
            Z12194FasPreUnd = A12194FasPreUnd ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z1240GuiFasLin = A1240GuiFasLin ;
         Z1241GuiFasPKg = A1241GuiFasPKg ;
         Z1242GuiFasPMt = A1242GuiFasPMt ;
         Z1275FasKgm = A1275FasKgm ;
         Z1276FasMtr = A1276FasMtr ;
         Z12193FasUnd = A12193FasUnd ;
         Z12194FasPreUnd = A12194FasPreUnd ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z457FasCod = A457FasCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z252CliCod = A252CliCod ;
         Z460FasDsc = A460FasDsc ;
         Z466FasPreKgm = A466FasPreKgm ;
         Z467FasPreMtr = A467FasPreMtr ;
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

   public void load1QJ194( )
   {
      /* Using cursor T01QJ8 */
      pr_default.execute(6, new Object[] {Short.valueOf(A1240GuiFasLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound194 = (short)(1) ;
         A252CliCod = T01QJ8_A252CliCod[0] ;
         n252CliCod = T01QJ8_n252CliCod[0] ;
         A460FasDsc = T01QJ8_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A1241GuiFasPKg = T01QJ8_A1241GuiFasPKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrimstr( A1241GuiFasPKg, 13, 5));
         A1242GuiFasPMt = T01QJ8_A1242GuiFasPMt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrimstr( A1242GuiFasPMt, 13, 5));
         A466FasPreKgm = T01QJ8_A466FasPreKgm[0] ;
         n466FasPreKgm = T01QJ8_n466FasPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrimstr( A466FasPreKgm, 13, 5));
         A467FasPreMtr = T01QJ8_A467FasPreMtr[0] ;
         n467FasPreMtr = T01QJ8_n467FasPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrimstr( A467FasPreMtr, 13, 5));
         A1275FasKgm = T01QJ8_A1275FasKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1275FasKgm", GXutil.ltrimstr( A1275FasKgm, 9, 2));
         A1276FasMtr = T01QJ8_A1276FasMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1276FasMtr", GXutil.ltrimstr( A1276FasMtr, 9, 2));
         A12193FasUnd = T01QJ8_A12193FasUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12193FasUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12193FasUnd), 6, 0));
         A12194FasPreUnd = T01QJ8_A12194FasPreUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12194FasPreUnd", GXutil.ltrimstr( A12194FasPreUnd, 13, 5));
         A457FasCod = T01QJ8_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         zm1QJ194( -2) ;
      }
      pr_default.close(6);
      onLoadActions1QJ194( ) ;
   }

   public void onLoadActions1QJ194( )
   {
      A1277FasImp = (A466FasPreKgm.multiply(A1275FasKgm)).add((A467FasPreMtr.multiply(A1276FasMtr))) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1277FasImp", GXutil.ltrimstr( A1277FasImp, 13, 5));
   }

   public void checkExtendedTable1QJ194( )
   {
      nIsDirty_194 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QJ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01QJ5_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(3);
      /* Using cursor T01QJ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01QJ4_A252CliCod[0] ;
      n252CliCod = T01QJ4_n252CliCod[0] ;
      pr_default.close(2);
      /* Using cursor T01QJ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) || (GXutil.strcmp("", A457FasCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A466FasPreKgm = T01QJ7_A466FasPreKgm[0] ;
      n466FasPreKgm = T01QJ7_n466FasPreKgm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrimstr( A466FasPreKgm, 13, 5));
      A467FasPreMtr = T01QJ7_A467FasPreMtr[0] ;
      n467FasPreMtr = T01QJ7_n467FasPreMtr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrimstr( A467FasPreMtr, 13, 5));
      pr_default.close(5);
      nIsDirty_194 = (short)(1) ;
      A1277FasImp = (A466FasPreKgm.multiply(A1275FasKgm)).add((A467FasPreMtr.multiply(A1276FasMtr))) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1277FasImp", GXutil.ltrimstr( A1277FasImp, 13, 5));
      /* Using cursor T01QJ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1QJ194( )
   {
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(5);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         String A457FasCod )
   {
      /* Using cursor T01QJ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01QJ9_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_3( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01QJ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01QJ10_A252CliCod[0] ;
      n252CliCod = T01QJ10_n252CliCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_6( String A396EmprCod ,
                         int A252CliCod ,
                         String A457FasCod )
   {
      /* Using cursor T01QJ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) || (GXutil.strcmp("", A457FasCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A466FasPreKgm = T01QJ11_A466FasPreKgm[0] ;
      n466FasPreKgm = T01QJ11_n466FasPreKgm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrimstr( A466FasPreKgm, 13, 5));
      A467FasPreMtr = T01QJ11_A467FasPreMtr[0] ;
      n467FasPreMtr = T01QJ11_n467FasPreMtr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrimstr( A467FasPreMtr, 13, 5));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_5( String A396EmprCod ,
                         long A30AlbProCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01QJ12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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

   public void getKey1QJ194( )
   {
      /* Using cursor T01QJ13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound194 = (short)(1) ;
      }
      else
      {
         RcdFound194 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QJ194( 2) ;
         RcdFound194 = (short)(1) ;
         A1240GuiFasLin = T01QJ3_A1240GuiFasLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
         A1241GuiFasPKg = T01QJ3_A1241GuiFasPKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrimstr( A1241GuiFasPKg, 13, 5));
         A1242GuiFasPMt = T01QJ3_A1242GuiFasPMt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrimstr( A1242GuiFasPMt, 13, 5));
         A1275FasKgm = T01QJ3_A1275FasKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1275FasKgm", GXutil.ltrimstr( A1275FasKgm, 9, 2));
         A1276FasMtr = T01QJ3_A1276FasMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1276FasMtr", GXutil.ltrimstr( A1276FasMtr, 9, 2));
         A12193FasUnd = T01QJ3_A12193FasUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12193FasUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12193FasUnd), 6, 0));
         A12194FasPreUnd = T01QJ3_A12194FasPreUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12194FasPreUnd", GXutil.ltrimstr( A12194FasPreUnd, 13, 5));
         A396EmprCod = T01QJ3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01QJ3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01QJ3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01QJ3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A457FasCod = T01QJ3_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A30AlbProCod = T01QJ3_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z1240GuiFasLin = A1240GuiFasLin ;
         sMode194 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1QJ194( ) ;
         if ( AnyError == 1 )
         {
            RcdFound194 = (short)(0) ;
            initializeNonKey1QJ194( ) ;
         }
         Gx_mode = sMode194 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound194 = (short)(0) ;
         initializeNonKey1QJ194( ) ;
         sMode194 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode194 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QJ194( ) ;
      if ( RcdFound194 == 0 )
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
      RcdFound194 = (short)(0) ;
      /* Using cursor T01QJ14 */
      pr_default.execute(12, new Object[] {Short.valueOf(A1240GuiFasLin), Short.valueOf(A1240GuiFasLin), A396EmprCod, A396EmprCod, Short.valueOf(A1240GuiFasLin), Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A1240GuiFasLin), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A1240GuiFasLin), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A1240GuiFasLin), Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01QJ14_A1240GuiFasLin[0] < A1240GuiFasLin ) || ( T01QJ14_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01QJ14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QJ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ14_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01QJ14_A129BarCod[0] < A129BarCod ) || ( T01QJ14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QJ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ14_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01QJ14_A132BarCodReo[0] < A132BarCodReo ) || ( T01QJ14_A132BarCodReo[0] == A132BarCodReo ) && ( T01QJ14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QJ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ14_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01QJ14_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01QJ14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QJ14_A132BarCodReo[0] == A132BarCodReo ) && ( T01QJ14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QJ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ14_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01QJ14_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01QJ14_A1240GuiFasLin[0] > A1240GuiFasLin ) || ( T01QJ14_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01QJ14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QJ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ14_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01QJ14_A129BarCod[0] > A129BarCod ) || ( T01QJ14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QJ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ14_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01QJ14_A132BarCodReo[0] > A132BarCodReo ) || ( T01QJ14_A132BarCodReo[0] == A132BarCodReo ) && ( T01QJ14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QJ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ14_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01QJ14_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01QJ14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QJ14_A132BarCodReo[0] == A132BarCodReo ) && ( T01QJ14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QJ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ14_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01QJ14_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            A1240GuiFasLin = T01QJ14_A1240GuiFasLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
            A396EmprCod = T01QJ14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01QJ14_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01QJ14_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01QJ14_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A30AlbProCod = T01QJ14_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound194 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound194 = (short)(0) ;
      /* Using cursor T01QJ15 */
      pr_default.execute(13, new Object[] {Short.valueOf(A1240GuiFasLin), Short.valueOf(A1240GuiFasLin), A396EmprCod, A396EmprCod, Short.valueOf(A1240GuiFasLin), Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A1240GuiFasLin), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A1240GuiFasLin), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A1240GuiFasLin), Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T01QJ15_A1240GuiFasLin[0] > A1240GuiFasLin ) || ( T01QJ15_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01QJ15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QJ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ15_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01QJ15_A129BarCod[0] > A129BarCod ) || ( T01QJ15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QJ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ15_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01QJ15_A132BarCodReo[0] > A132BarCodReo ) || ( T01QJ15_A132BarCodReo[0] == A132BarCodReo ) && ( T01QJ15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QJ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ15_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01QJ15_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01QJ15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QJ15_A132BarCodReo[0] == A132BarCodReo ) && ( T01QJ15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QJ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ15_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01QJ15_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T01QJ15_A1240GuiFasLin[0] < A1240GuiFasLin ) || ( T01QJ15_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01QJ15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QJ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ15_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01QJ15_A129BarCod[0] < A129BarCod ) || ( T01QJ15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QJ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ15_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01QJ15_A132BarCodReo[0] < A132BarCodReo ) || ( T01QJ15_A132BarCodReo[0] == A132BarCodReo ) && ( T01QJ15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QJ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ15_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01QJ15_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01QJ15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QJ15_A132BarCodReo[0] == A132BarCodReo ) && ( T01QJ15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QJ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QJ15_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01QJ15_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            A1240GuiFasLin = T01QJ15_A1240GuiFasLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
            A396EmprCod = T01QJ15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01QJ15_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01QJ15_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01QJ15_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A30AlbProCod = T01QJ15_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound194 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QJ194( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QJ194( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound194 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A1240GuiFasLin != Z1240GuiFasLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A1240GuiFasLin = Z1240GuiFasLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
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
               update1QJ194( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A1240GuiFasLin != Z1240GuiFasLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QJ194( ) ;
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
                  insert1QJ194( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A1240GuiFasLin != Z1240GuiFasLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1240GuiFasLin = Z1240GuiFasLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
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
      if ( RcdFound194 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1QJ194( ) ;
      if ( RcdFound194 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QJ194( ) ;
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
      if ( RcdFound194 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
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
      if ( RcdFound194 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
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
      scanStart1QJ194( ) ;
      if ( RcdFound194 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound194 != 0 )
         {
            scanNext1QJ194( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QJ194( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1QJ194( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z1241GuiFasPKg, T01QJ2_A1241GuiFasPKg[0]) != 0 ) || ( DecimalUtil.compareTo(Z1242GuiFasPMt, T01QJ2_A1242GuiFasPMt[0]) != 0 ) || ( DecimalUtil.compareTo(Z1275FasKgm, T01QJ2_A1275FasKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z1276FasMtr, T01QJ2_A1276FasMtr[0]) != 0 ) || ( Z12193FasUnd != T01QJ2_A12193FasUnd[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12194FasPreUnd, T01QJ2_A12194FasPreUnd[0]) != 0 ) || ( GXutil.strcmp(Z457FasCod, T01QJ2_A457FasCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z1241GuiFasPKg, T01QJ2_A1241GuiFasPKg[0]) != 0 )
            {
               GXutil.writeLogln("albfas:[seudo value changed for attri]"+"GuiFasPKg");
               GXutil.writeLogRaw("Old: ",Z1241GuiFasPKg);
               GXutil.writeLogRaw("Current: ",T01QJ2_A1241GuiFasPKg[0]);
            }
            if ( DecimalUtil.compareTo(Z1242GuiFasPMt, T01QJ2_A1242GuiFasPMt[0]) != 0 )
            {
               GXutil.writeLogln("albfas:[seudo value changed for attri]"+"GuiFasPMt");
               GXutil.writeLogRaw("Old: ",Z1242GuiFasPMt);
               GXutil.writeLogRaw("Current: ",T01QJ2_A1242GuiFasPMt[0]);
            }
            if ( DecimalUtil.compareTo(Z1275FasKgm, T01QJ2_A1275FasKgm[0]) != 0 )
            {
               GXutil.writeLogln("albfas:[seudo value changed for attri]"+"FasKgm");
               GXutil.writeLogRaw("Old: ",Z1275FasKgm);
               GXutil.writeLogRaw("Current: ",T01QJ2_A1275FasKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z1276FasMtr, T01QJ2_A1276FasMtr[0]) != 0 )
            {
               GXutil.writeLogln("albfas:[seudo value changed for attri]"+"FasMtr");
               GXutil.writeLogRaw("Old: ",Z1276FasMtr);
               GXutil.writeLogRaw("Current: ",T01QJ2_A1276FasMtr[0]);
            }
            if ( Z12193FasUnd != T01QJ2_A12193FasUnd[0] )
            {
               GXutil.writeLogln("albfas:[seudo value changed for attri]"+"FasUnd");
               GXutil.writeLogRaw("Old: ",Z12193FasUnd);
               GXutil.writeLogRaw("Current: ",T01QJ2_A12193FasUnd[0]);
            }
            if ( DecimalUtil.compareTo(Z12194FasPreUnd, T01QJ2_A12194FasPreUnd[0]) != 0 )
            {
               GXutil.writeLogln("albfas:[seudo value changed for attri]"+"FasPreUnd");
               GXutil.writeLogRaw("Old: ",Z12194FasPreUnd);
               GXutil.writeLogRaw("Current: ",T01QJ2_A12194FasPreUnd[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01QJ2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("albfas:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01QJ2_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QJ194( )
   {
      beforeValidate1QJ194( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QJ194( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QJ194( 0) ;
         checkOptimisticConcurrency1QJ194( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QJ194( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QJ194( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QJ16 */
                  pr_default.execute(14, new Object[] {Short.valueOf(A1240GuiFasLin), A1241GuiFasPKg, A1242GuiFasPMt, A1275FasKgm, A1276FasMtr, Integer.valueOf(A12193FasUnd), A12194FasPreUnd, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A457FasCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
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
                        resetCaption1QJ0( ) ;
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
            load1QJ194( ) ;
         }
         endLevel1QJ194( ) ;
      }
      closeExtendedTableCursors1QJ194( ) ;
   }

   public void update1QJ194( )
   {
      beforeValidate1QJ194( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QJ194( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QJ194( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QJ194( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QJ194( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QJ17 */
                  pr_default.execute(15, new Object[] {A1241GuiFasPKg, A1242GuiFasPMt, A1275FasKgm, A1276FasMtr, Integer.valueOf(A12193FasUnd), A12194FasPreUnd, A457FasCod, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QJ194( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1QJ0( ) ;
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
         endLevel1QJ194( ) ;
      }
      closeExtendedTableCursors1QJ194( ) ;
   }

   public void deferredUpdate1QJ194( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QJ194( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QJ194( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QJ194( ) ;
         afterConfirm1QJ194( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QJ194( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QJ18 */
               pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound194 == 0 )
                     {
                        initAll1QJ194( ) ;
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
                     resetCaption1QJ0( ) ;
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
      sMode194 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QJ194( ) ;
      Gx_mode = sMode194 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QJ194( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01QJ19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A252CliCod = T01QJ19_A252CliCod[0] ;
         n252CliCod = T01QJ19_n252CliCod[0] ;
         pr_default.close(17);
         /* Using cursor T01QJ20 */
         pr_default.execute(18, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01QJ20_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         pr_default.close(18);
         /* Using cursor T01QJ21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
         A466FasPreKgm = T01QJ21_A466FasPreKgm[0] ;
         n466FasPreKgm = T01QJ21_n466FasPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrimstr( A466FasPreKgm, 13, 5));
         A467FasPreMtr = T01QJ21_A467FasPreMtr[0] ;
         n467FasPreMtr = T01QJ21_n467FasPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrimstr( A467FasPreMtr, 13, 5));
         pr_default.close(19);
         A1277FasImp = (A466FasPreKgm.multiply(A1275FasKgm)).add((A467FasPreMtr.multiply(A1276FasMtr))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1277FasImp", GXutil.ltrimstr( A1277FasImp, 13, 5));
      }
   }

   public void endLevel1QJ194( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QJ194( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "albfas");
         if ( AnyError == 0 )
         {
            confirmValues1QJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "albfas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QJ194( )
   {
      /* Using cursor T01QJ22 */
      pr_default.execute(20);
      RcdFound194 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound194 = (short)(1) ;
         A396EmprCod = T01QJ22_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01QJ22_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = T01QJ22_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01QJ22_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01QJ22_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1240GuiFasLin = T01QJ22_A1240GuiFasLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QJ194( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound194 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound194 = (short)(1) ;
         A396EmprCod = T01QJ22_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01QJ22_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = T01QJ22_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01QJ22_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01QJ22_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1240GuiFasLin = T01QJ22_A1240GuiFasLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
      }
   }

   public void scanEnd1QJ194( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1QJ194( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QJ194( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QJ194( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QJ194( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QJ194( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QJ194( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QJ194( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtGuiFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtGuiFasPKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPKg_Enabled), 5, 0), true);
      edtGuiFasPMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPMt_Enabled), 5, 0), true);
      edtFasPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreKgm_Enabled), 5, 0), true);
      edtFasPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMtr_Enabled), 5, 0), true);
      edtFasKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasKgm_Enabled), 5, 0), true);
      edtFasMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasMtr_Enabled), 5, 0), true);
      edtFasImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasImp_Enabled), 5, 0), true);
      edtFasUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasUnd_Enabled), 5, 0), true);
      edtFasPreUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreUnd_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QJ194( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QJ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.albfas", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1240GuiFasLin", GXutil.ltrim( localUtil.ntoc( Z1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1241GuiFasPKg", GXutil.ltrim( localUtil.ntoc( Z1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1242GuiFasPMt", GXutil.ltrim( localUtil.ntoc( Z1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1275FasKgm", GXutil.ltrim( localUtil.ntoc( Z1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1276FasMtr", GXutil.ltrim( localUtil.ntoc( Z1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12193FasUnd", GXutil.ltrim( localUtil.ntoc( Z12193FasUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12194FasPreUnd", GXutil.ltrim( localUtil.ntoc( Z12194FasPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.albfas", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ALBFAS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla ALBFAS", "") ;
   }

   public void initializeNonKey1QJ194( )
   {
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A1277FasImp = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1277FasImp", GXutil.ltrimstr( A1277FasImp, 13, 5));
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrimstr( A1241GuiFasPKg, 13, 5));
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrimstr( A1242GuiFasPMt, 13, 5));
      A466FasPreKgm = DecimalUtil.ZERO ;
      n466FasPreKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrimstr( A466FasPreKgm, 13, 5));
      A467FasPreMtr = DecimalUtil.ZERO ;
      n467FasPreMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrimstr( A467FasPreMtr, 13, 5));
      A1275FasKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1275FasKgm", GXutil.ltrimstr( A1275FasKgm, 9, 2));
      A1276FasMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1276FasMtr", GXutil.ltrimstr( A1276FasMtr, 9, 2));
      A12193FasUnd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12193FasUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12193FasUnd), 6, 0));
      A12194FasPreUnd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12194FasPreUnd", GXutil.ltrimstr( A12194FasPreUnd, 13, 5));
      Z1241GuiFasPKg = DecimalUtil.ZERO ;
      Z1242GuiFasPMt = DecimalUtil.ZERO ;
      Z1275FasKgm = DecimalUtil.ZERO ;
      Z1276FasMtr = DecimalUtil.ZERO ;
      Z12193FasUnd = 0 ;
      Z12194FasPreUnd = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
   }

   public void initAll1QJ194( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A1240GuiFasLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
      initializeNonKey1QJ194( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016373723", true, true);
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
      httpContext.AddJavascriptSource("albfas.js", "?202661016373723", false, true);
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
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtGuiFasLin_Internalname = "GUIFASLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtGuiFasPKg_Internalname = "GUIFASPKG" ;
      edtGuiFasPMt_Internalname = "GUIFASPMT" ;
      edtFasPreKgm_Internalname = "FASPREKGM" ;
      edtFasPreMtr_Internalname = "FASPREMTR" ;
      edtFasKgm_Internalname = "FASKGM" ;
      edtFasMtr_Internalname = "FASMTR" ;
      edtFasImp_Internalname = "FASIMP" ;
      edtFasUnd_Internalname = "FASUND" ;
      edtFasPreUnd_Internalname = "FASPREUND" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla ALBFAS", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtFasPreUnd_Jsonclick = "" ;
      edtFasPreUnd_Enabled = 1 ;
      edtFasUnd_Jsonclick = "" ;
      edtFasUnd_Enabled = 1 ;
      edtFasImp_Jsonclick = "" ;
      edtFasImp_Enabled = 0 ;
      edtFasMtr_Jsonclick = "" ;
      edtFasMtr_Enabled = 1 ;
      edtFasKgm_Jsonclick = "" ;
      edtFasKgm_Enabled = 1 ;
      edtFasPreMtr_Jsonclick = "" ;
      edtFasPreMtr_Enabled = 0 ;
      edtFasPreKgm_Jsonclick = "" ;
      edtFasPreKgm_Enabled = 0 ;
      edtGuiFasPMt_Jsonclick = "" ;
      edtGuiFasPMt_Enabled = 1 ;
      edtGuiFasPKg_Jsonclick = "" ;
      edtGuiFasPKg_Enabled = 1 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 1 ;
      edtGuiFasLin_Jsonclick = "" ;
      edtGuiFasLin_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 1 ;
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
      /* Using cursor T01QJ19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01QJ19_A252CliCod[0] ;
      n252CliCod = T01QJ19_n252CliCod[0] ;
      pr_default.close(17);
      /* Using cursor T01QJ23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(21);
      GX_FocusControl = edtFasCod_Internalname ;
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

   public void valid_Barcodpar( )
   {
      n252CliCod = false ;
      /* Using cursor T01QJ19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A252CliCod = T01QJ19_A252CliCod[0] ;
      n252CliCod = T01QJ19_n252CliCod[0] ;
      pr_default.close(17);
      /* Using cursor T01QJ23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Guifaslin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1275FasKgm", GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1276FasMtr", GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12193FasUnd", GXutil.ltrim( localUtil.ntoc( A12193FasUnd, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12194FasPreUnd", GXutil.ltrim( localUtil.ntoc( A12194FasPreUnd, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1277FasImp", GXutil.ltrim( localUtil.ntoc( A1277FasImp, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1240GuiFasLin", GXutil.ltrim( localUtil.ntoc( Z1240GuiFasLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1241GuiFasPKg", GXutil.ltrim( localUtil.ntoc( Z1241GuiFasPKg, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1242GuiFasPMt", GXutil.ltrim( localUtil.ntoc( Z1242GuiFasPMt, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1275FasKgm", GXutil.ltrim( localUtil.ntoc( Z1275FasKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1276FasMtr", GXutil.ltrim( localUtil.ntoc( Z1276FasMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12193FasUnd", GXutil.ltrim( localUtil.ntoc( Z12193FasUnd, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12194FasPreUnd", GXutil.ltrim( localUtil.ntoc( Z12194FasPreUnd, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z466FasPreKgm", GXutil.ltrim( localUtil.ntoc( Z466FasPreKgm, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z467FasPreMtr", GXutil.ltrim( localUtil.ntoc( Z467FasPreMtr, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1277FasImp", GXutil.ltrim( localUtil.ntoc( Z1277FasImp, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      n252CliCod = false ;
      n466FasPreKgm = false ;
      n467FasPreMtr = false ;
      /* Using cursor T01QJ20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A460FasDsc = T01QJ20_A460FasDsc[0] ;
      pr_default.close(18);
      /* Using cursor T01QJ21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) || (GXutil.strcmp("", A457FasCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A466FasPreKgm = T01QJ21_A466FasPreKgm[0] ;
      n466FasPreKgm = T01QJ21_n466FasPreKgm[0] ;
      A467FasPreMtr = T01QJ21_A467FasPreMtr[0] ;
      n467FasPreMtr = T01QJ21_n467FasPreMtr[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), ".", "")));
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
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_GUIFASLIN","{handler:'valid_Guifaslin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A1240GuiFasLin',fld:'GUIFASLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_GUIFASLIN",",oparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A1241GuiFasPKg',fld:'GUIFASPKG',pic:'ZZZZZZ9.999'},{av:'A1242GuiFasPMt',fld:'GUIFASPMT',pic:'ZZZZZZ9.999'},{av:'A1275FasKgm',fld:'FASKGM',pic:'ZZZZZ9.99'},{av:'A1276FasMtr',fld:'FASMTR',pic:'ZZZZZ9.99'},{av:'A12193FasUnd',fld:'FASUND',pic:'ZZZZZ9'},{av:'A12194FasPreUnd',fld:'FASPREUND',pic:'ZZZZZZ9.99999'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A466FasPreKgm',fld:'FASPREKGM',pic:'ZZZZZZ9.999'},{av:'A467FasPreMtr',fld:'FASPREMTR',pic:'ZZZZZZ9.999'},{av:'A1277FasImp',fld:'FASIMP',pic:'ZZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z30AlbProCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z1240GuiFasLin'},{av:'Z457FasCod'},{av:'Z1241GuiFasPKg'},{av:'Z1242GuiFasPMt'},{av:'Z1275FasKgm'},{av:'Z1276FasMtr'},{av:'Z12193FasUnd'},{av:'Z12194FasPreUnd'},{av:'Z460FasDsc'},{av:'Z252CliCod'},{av:'Z466FasPreKgm'},{av:'Z467FasPreMtr'},{av:'Z1277FasImp'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A466FasPreKgm',fld:'FASPREKGM',pic:'ZZZZZZ9.999'},{av:'A467FasPreMtr',fld:'FASPREMTR',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A466FasPreKgm',fld:'FASPREKGM',pic:'ZZZZZZ9.999'},{av:'A467FasPreMtr',fld:'FASPREMTR',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("VALID_FASPREKGM","{handler:'valid_Fasprekgm',iparms:[]");
      setEventMetadata("VALID_FASPREKGM",",oparms:[]}");
      setEventMetadata("VALID_FASPREMTR","{handler:'valid_Faspremtr',iparms:[]");
      setEventMetadata("VALID_FASPREMTR",",oparms:[]}");
      setEventMetadata("VALID_FASKGM","{handler:'valid_Faskgm',iparms:[]");
      setEventMetadata("VALID_FASKGM",",oparms:[]}");
      setEventMetadata("VALID_FASMTR","{handler:'valid_Fasmtr',iparms:[]");
      setEventMetadata("VALID_FASMTR",",oparms:[]}");
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
      pr_default.close(21);
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z1241GuiFasPKg = DecimalUtil.ZERO ;
      Z1242GuiFasPMt = DecimalUtil.ZERO ;
      Z1275FasKgm = DecimalUtil.ZERO ;
      Z1276FasMtr = DecimalUtil.ZERO ;
      Z12194FasPreUnd = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
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
      A460FasDsc = "" ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1277FasImp = DecimalUtil.ZERO ;
      A12194FasPreUnd = DecimalUtil.ZERO ;
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
      Z460FasDsc = "" ;
      Z466FasPreKgm = DecimalUtil.ZERO ;
      Z467FasPreMtr = DecimalUtil.ZERO ;
      T01QJ8_A252CliCod = new int[1] ;
      T01QJ8_n252CliCod = new boolean[] {false} ;
      T01QJ8_A1240GuiFasLin = new short[1] ;
      T01QJ8_A460FasDsc = new String[] {""} ;
      T01QJ8_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ8_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ8_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ8_n466FasPreKgm = new boolean[] {false} ;
      T01QJ8_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ8_n467FasPreMtr = new boolean[] {false} ;
      T01QJ8_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ8_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ8_A12193FasUnd = new int[1] ;
      T01QJ8_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ8_A396EmprCod = new String[] {""} ;
      T01QJ8_A129BarCod = new int[1] ;
      T01QJ8_A132BarCodReo = new byte[1] ;
      T01QJ8_A130BarCodPar = new String[] {""} ;
      T01QJ8_A457FasCod = new String[] {""} ;
      T01QJ8_A30AlbProCod = new long[1] ;
      T01QJ5_A460FasDsc = new String[] {""} ;
      T01QJ4_A252CliCod = new int[1] ;
      T01QJ4_n252CliCod = new boolean[] {false} ;
      T01QJ7_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ7_n466FasPreKgm = new boolean[] {false} ;
      T01QJ7_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ7_n467FasPreMtr = new boolean[] {false} ;
      T01QJ6_A396EmprCod = new String[] {""} ;
      T01QJ9_A460FasDsc = new String[] {""} ;
      T01QJ10_A252CliCod = new int[1] ;
      T01QJ10_n252CliCod = new boolean[] {false} ;
      T01QJ11_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ11_n466FasPreKgm = new boolean[] {false} ;
      T01QJ11_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ11_n467FasPreMtr = new boolean[] {false} ;
      T01QJ12_A396EmprCod = new String[] {""} ;
      T01QJ13_A396EmprCod = new String[] {""} ;
      T01QJ13_A30AlbProCod = new long[1] ;
      T01QJ13_A129BarCod = new int[1] ;
      T01QJ13_A132BarCodReo = new byte[1] ;
      T01QJ13_A130BarCodPar = new String[] {""} ;
      T01QJ13_A1240GuiFasLin = new short[1] ;
      T01QJ3_A1240GuiFasLin = new short[1] ;
      T01QJ3_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ3_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ3_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ3_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ3_A12193FasUnd = new int[1] ;
      T01QJ3_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ3_A396EmprCod = new String[] {""} ;
      T01QJ3_A129BarCod = new int[1] ;
      T01QJ3_A132BarCodReo = new byte[1] ;
      T01QJ3_A130BarCodPar = new String[] {""} ;
      T01QJ3_A457FasCod = new String[] {""} ;
      T01QJ3_A30AlbProCod = new long[1] ;
      sMode194 = "" ;
      T01QJ14_A1240GuiFasLin = new short[1] ;
      T01QJ14_A396EmprCod = new String[] {""} ;
      T01QJ14_A129BarCod = new int[1] ;
      T01QJ14_A132BarCodReo = new byte[1] ;
      T01QJ14_A130BarCodPar = new String[] {""} ;
      T01QJ14_A30AlbProCod = new long[1] ;
      T01QJ15_A1240GuiFasLin = new short[1] ;
      T01QJ15_A396EmprCod = new String[] {""} ;
      T01QJ15_A129BarCod = new int[1] ;
      T01QJ15_A132BarCodReo = new byte[1] ;
      T01QJ15_A130BarCodPar = new String[] {""} ;
      T01QJ15_A30AlbProCod = new long[1] ;
      T01QJ2_A1240GuiFasLin = new short[1] ;
      T01QJ2_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ2_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ2_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ2_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ2_A12193FasUnd = new int[1] ;
      T01QJ2_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ2_A396EmprCod = new String[] {""} ;
      T01QJ2_A129BarCod = new int[1] ;
      T01QJ2_A132BarCodReo = new byte[1] ;
      T01QJ2_A130BarCodPar = new String[] {""} ;
      T01QJ2_A457FasCod = new String[] {""} ;
      T01QJ2_A30AlbProCod = new long[1] ;
      T01QJ19_A252CliCod = new int[1] ;
      T01QJ19_n252CliCod = new boolean[] {false} ;
      T01QJ20_A460FasDsc = new String[] {""} ;
      T01QJ21_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ21_n466FasPreKgm = new boolean[] {false} ;
      T01QJ21_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QJ21_n467FasPreMtr = new boolean[] {false} ;
      T01QJ22_A396EmprCod = new String[] {""} ;
      T01QJ22_A30AlbProCod = new long[1] ;
      T01QJ22_A129BarCod = new int[1] ;
      T01QJ22_A132BarCodReo = new byte[1] ;
      T01QJ22_A130BarCodPar = new String[] {""} ;
      T01QJ22_A1240GuiFasLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01QJ23_A396EmprCod = new String[] {""} ;
      Z1277FasImp = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ457FasCod = "" ;
      ZZ1241GuiFasPKg = DecimalUtil.ZERO ;
      ZZ1242GuiFasPMt = DecimalUtil.ZERO ;
      ZZ1275FasKgm = DecimalUtil.ZERO ;
      ZZ1276FasMtr = DecimalUtil.ZERO ;
      ZZ12194FasPreUnd = DecimalUtil.ZERO ;
      ZZ460FasDsc = "" ;
      ZZ466FasPreKgm = DecimalUtil.ZERO ;
      ZZ467FasPreMtr = DecimalUtil.ZERO ;
      ZZ1277FasImp = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.albfas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.albfas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.albfas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albfas__default(),
         new Object[] {
             new Object[] {
            T01QJ2_A1240GuiFasLin, T01QJ2_A1241GuiFasPKg, T01QJ2_A1242GuiFasPMt, T01QJ2_A1275FasKgm, T01QJ2_A1276FasMtr, T01QJ2_A12193FasUnd, T01QJ2_A12194FasPreUnd, T01QJ2_A396EmprCod, T01QJ2_A129BarCod, T01QJ2_A132BarCodReo,
            T01QJ2_A130BarCodPar, T01QJ2_A457FasCod, T01QJ2_A30AlbProCod
            }
            , new Object[] {
            T01QJ3_A1240GuiFasLin, T01QJ3_A1241GuiFasPKg, T01QJ3_A1242GuiFasPMt, T01QJ3_A1275FasKgm, T01QJ3_A1276FasMtr, T01QJ3_A12193FasUnd, T01QJ3_A12194FasPreUnd, T01QJ3_A396EmprCod, T01QJ3_A129BarCod, T01QJ3_A132BarCodReo,
            T01QJ3_A130BarCodPar, T01QJ3_A457FasCod, T01QJ3_A30AlbProCod
            }
            , new Object[] {
            T01QJ4_A252CliCod, T01QJ4_n252CliCod
            }
            , new Object[] {
            T01QJ5_A460FasDsc
            }
            , new Object[] {
            T01QJ6_A396EmprCod
            }
            , new Object[] {
            T01QJ7_A466FasPreKgm, T01QJ7_n466FasPreKgm, T01QJ7_A467FasPreMtr, T01QJ7_n467FasPreMtr
            }
            , new Object[] {
            T01QJ8_A252CliCod, T01QJ8_n252CliCod, T01QJ8_A1240GuiFasLin, T01QJ8_A460FasDsc, T01QJ8_A1241GuiFasPKg, T01QJ8_A1242GuiFasPMt, T01QJ8_A466FasPreKgm, T01QJ8_n466FasPreKgm, T01QJ8_A467FasPreMtr, T01QJ8_n467FasPreMtr,
            T01QJ8_A1275FasKgm, T01QJ8_A1276FasMtr, T01QJ8_A12193FasUnd, T01QJ8_A12194FasPreUnd, T01QJ8_A396EmprCod, T01QJ8_A129BarCod, T01QJ8_A132BarCodReo, T01QJ8_A130BarCodPar, T01QJ8_A457FasCod, T01QJ8_A30AlbProCod
            }
            , new Object[] {
            T01QJ9_A460FasDsc
            }
            , new Object[] {
            T01QJ10_A252CliCod, T01QJ10_n252CliCod
            }
            , new Object[] {
            T01QJ11_A466FasPreKgm, T01QJ11_n466FasPreKgm, T01QJ11_A467FasPreMtr, T01QJ11_n467FasPreMtr
            }
            , new Object[] {
            T01QJ12_A396EmprCod
            }
            , new Object[] {
            T01QJ13_A396EmprCod, T01QJ13_A30AlbProCod, T01QJ13_A129BarCod, T01QJ13_A132BarCodReo, T01QJ13_A130BarCodPar, T01QJ13_A1240GuiFasLin
            }
            , new Object[] {
            T01QJ14_A1240GuiFasLin, T01QJ14_A396EmprCod, T01QJ14_A129BarCod, T01QJ14_A132BarCodReo, T01QJ14_A130BarCodPar, T01QJ14_A30AlbProCod
            }
            , new Object[] {
            T01QJ15_A1240GuiFasLin, T01QJ15_A396EmprCod, T01QJ15_A129BarCod, T01QJ15_A132BarCodReo, T01QJ15_A130BarCodPar, T01QJ15_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QJ19_A252CliCod, T01QJ19_n252CliCod
            }
            , new Object[] {
            T01QJ20_A460FasDsc
            }
            , new Object[] {
            T01QJ21_A466FasPreKgm, T01QJ21_n466FasPreKgm, T01QJ21_A467FasPreMtr, T01QJ21_n467FasPreMtr
            }
            , new Object[] {
            T01QJ22_A396EmprCod, T01QJ22_A30AlbProCod, T01QJ22_A129BarCod, T01QJ22_A132BarCodReo, T01QJ22_A130BarCodPar, T01QJ22_A1240GuiFasLin
            }
            , new Object[] {
            T01QJ23_A396EmprCod
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
   private short Z1240GuiFasLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1240GuiFasLin ;
   private short RcdFound194 ;
   private short nIsDirty_194 ;
   private short ZZ1240GuiFasLin ;
   private int Z129BarCod ;
   private int Z12193FasUnd ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtAlbProCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtGuiFasLin_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtGuiFasPKg_Enabled ;
   private int edtGuiFasPMt_Enabled ;
   private int edtFasPreKgm_Enabled ;
   private int edtFasPreMtr_Enabled ;
   private int edtFasKgm_Enabled ;
   private int edtFasMtr_Enabled ;
   private int edtFasImp_Enabled ;
   private int A12193FasUnd ;
   private int edtFasUnd_Enabled ;
   private int edtFasPreUnd_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int idxLst ;
   private int ZZ129BarCod ;
   private int ZZ12193FasUnd ;
   private int ZZ252CliCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long ZZ30AlbProCod ;
   private java.math.BigDecimal Z1241GuiFasPKg ;
   private java.math.BigDecimal Z1242GuiFasPMt ;
   private java.math.BigDecimal Z1275FasKgm ;
   private java.math.BigDecimal Z1276FasMtr ;
   private java.math.BigDecimal Z12194FasPreUnd ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1277FasImp ;
   private java.math.BigDecimal A12194FasPreUnd ;
   private java.math.BigDecimal Z466FasPreKgm ;
   private java.math.BigDecimal Z467FasPreMtr ;
   private java.math.BigDecimal Z1277FasImp ;
   private java.math.BigDecimal ZZ1241GuiFasPKg ;
   private java.math.BigDecimal ZZ1242GuiFasPMt ;
   private java.math.BigDecimal ZZ1275FasKgm ;
   private java.math.BigDecimal ZZ1276FasMtr ;
   private java.math.BigDecimal ZZ12194FasPreUnd ;
   private java.math.BigDecimal ZZ466FasPreKgm ;
   private java.math.BigDecimal ZZ467FasPreMtr ;
   private java.math.BigDecimal ZZ1277FasImp ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
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
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtGuiFasLin_Internalname ;
   private String edtGuiFasLin_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String edtGuiFasPKg_Internalname ;
   private String edtGuiFasPKg_Jsonclick ;
   private String edtGuiFasPMt_Internalname ;
   private String edtGuiFasPMt_Jsonclick ;
   private String edtFasPreKgm_Internalname ;
   private String edtFasPreKgm_Jsonclick ;
   private String edtFasPreMtr_Internalname ;
   private String edtFasPreMtr_Jsonclick ;
   private String edtFasKgm_Internalname ;
   private String edtFasKgm_Jsonclick ;
   private String edtFasMtr_Internalname ;
   private String edtFasMtr_Jsonclick ;
   private String edtFasImp_Internalname ;
   private String edtFasImp_Jsonclick ;
   private String edtFasUnd_Internalname ;
   private String edtFasUnd_Jsonclick ;
   private String edtFasPreUnd_Internalname ;
   private String edtFasPreUnd_Jsonclick ;
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
   private String Z460FasDsc ;
   private String sMode194 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ457FasCod ;
   private String ZZ460FasDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private int[] T01QJ8_A252CliCod ;
   private boolean[] T01QJ8_n252CliCod ;
   private short[] T01QJ8_A1240GuiFasLin ;
   private String[] T01QJ8_A460FasDsc ;
   private java.math.BigDecimal[] T01QJ8_A1241GuiFasPKg ;
   private java.math.BigDecimal[] T01QJ8_A1242GuiFasPMt ;
   private java.math.BigDecimal[] T01QJ8_A466FasPreKgm ;
   private boolean[] T01QJ8_n466FasPreKgm ;
   private java.math.BigDecimal[] T01QJ8_A467FasPreMtr ;
   private boolean[] T01QJ8_n467FasPreMtr ;
   private java.math.BigDecimal[] T01QJ8_A1275FasKgm ;
   private java.math.BigDecimal[] T01QJ8_A1276FasMtr ;
   private int[] T01QJ8_A12193FasUnd ;
   private java.math.BigDecimal[] T01QJ8_A12194FasPreUnd ;
   private String[] T01QJ8_A396EmprCod ;
   private int[] T01QJ8_A129BarCod ;
   private byte[] T01QJ8_A132BarCodReo ;
   private String[] T01QJ8_A130BarCodPar ;
   private String[] T01QJ8_A457FasCod ;
   private long[] T01QJ8_A30AlbProCod ;
   private String[] T01QJ5_A460FasDsc ;
   private int[] T01QJ4_A252CliCod ;
   private boolean[] T01QJ4_n252CliCod ;
   private java.math.BigDecimal[] T01QJ7_A466FasPreKgm ;
   private boolean[] T01QJ7_n466FasPreKgm ;
   private java.math.BigDecimal[] T01QJ7_A467FasPreMtr ;
   private boolean[] T01QJ7_n467FasPreMtr ;
   private String[] T01QJ6_A396EmprCod ;
   private String[] T01QJ9_A460FasDsc ;
   private int[] T01QJ10_A252CliCod ;
   private boolean[] T01QJ10_n252CliCod ;
   private java.math.BigDecimal[] T01QJ11_A466FasPreKgm ;
   private boolean[] T01QJ11_n466FasPreKgm ;
   private java.math.BigDecimal[] T01QJ11_A467FasPreMtr ;
   private boolean[] T01QJ11_n467FasPreMtr ;
   private String[] T01QJ12_A396EmprCod ;
   private String[] T01QJ13_A396EmprCod ;
   private long[] T01QJ13_A30AlbProCod ;
   private int[] T01QJ13_A129BarCod ;
   private byte[] T01QJ13_A132BarCodReo ;
   private String[] T01QJ13_A130BarCodPar ;
   private short[] T01QJ13_A1240GuiFasLin ;
   private short[] T01QJ3_A1240GuiFasLin ;
   private java.math.BigDecimal[] T01QJ3_A1241GuiFasPKg ;
   private java.math.BigDecimal[] T01QJ3_A1242GuiFasPMt ;
   private java.math.BigDecimal[] T01QJ3_A1275FasKgm ;
   private java.math.BigDecimal[] T01QJ3_A1276FasMtr ;
   private int[] T01QJ3_A12193FasUnd ;
   private java.math.BigDecimal[] T01QJ3_A12194FasPreUnd ;
   private String[] T01QJ3_A396EmprCod ;
   private int[] T01QJ3_A129BarCod ;
   private byte[] T01QJ3_A132BarCodReo ;
   private String[] T01QJ3_A130BarCodPar ;
   private String[] T01QJ3_A457FasCod ;
   private long[] T01QJ3_A30AlbProCod ;
   private short[] T01QJ14_A1240GuiFasLin ;
   private String[] T01QJ14_A396EmprCod ;
   private int[] T01QJ14_A129BarCod ;
   private byte[] T01QJ14_A132BarCodReo ;
   private String[] T01QJ14_A130BarCodPar ;
   private long[] T01QJ14_A30AlbProCod ;
   private short[] T01QJ15_A1240GuiFasLin ;
   private String[] T01QJ15_A396EmprCod ;
   private int[] T01QJ15_A129BarCod ;
   private byte[] T01QJ15_A132BarCodReo ;
   private String[] T01QJ15_A130BarCodPar ;
   private long[] T01QJ15_A30AlbProCod ;
   private short[] T01QJ2_A1240GuiFasLin ;
   private java.math.BigDecimal[] T01QJ2_A1241GuiFasPKg ;
   private java.math.BigDecimal[] T01QJ2_A1242GuiFasPMt ;
   private java.math.BigDecimal[] T01QJ2_A1275FasKgm ;
   private java.math.BigDecimal[] T01QJ2_A1276FasMtr ;
   private int[] T01QJ2_A12193FasUnd ;
   private java.math.BigDecimal[] T01QJ2_A12194FasPreUnd ;
   private String[] T01QJ2_A396EmprCod ;
   private int[] T01QJ2_A129BarCod ;
   private byte[] T01QJ2_A132BarCodReo ;
   private String[] T01QJ2_A130BarCodPar ;
   private String[] T01QJ2_A457FasCod ;
   private long[] T01QJ2_A30AlbProCod ;
   private int[] T01QJ19_A252CliCod ;
   private boolean[] T01QJ19_n252CliCod ;
   private String[] T01QJ20_A460FasDsc ;
   private java.math.BigDecimal[] T01QJ21_A466FasPreKgm ;
   private boolean[] T01QJ21_n466FasPreKgm ;
   private java.math.BigDecimal[] T01QJ21_A467FasPreMtr ;
   private boolean[] T01QJ21_n467FasPreMtr ;
   private String[] T01QJ22_A396EmprCod ;
   private long[] T01QJ22_A30AlbProCod ;
   private int[] T01QJ22_A129BarCod ;
   private byte[] T01QJ22_A132BarCodReo ;
   private String[] T01QJ22_A130BarCodPar ;
   private short[] T01QJ22_A1240GuiFasLin ;
   private String[] T01QJ23_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class albfas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albfas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albfas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QJ2", "SELECT GuiFasLin, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasUnd, FasPreUnd, EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, AlbProCod FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?  FOR UPDATE OF GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasUnd, FasPreUnd, FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ3", "SELECT GuiFasLin, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasUnd, FasPreUnd, EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, AlbProCod FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ4", "SELECT CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ5", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ6", "SELECT EmprCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ7", "SELECT FasPreKgm, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ8", "SELECT /*+ FIRST_ROWS(100) */ T2.CliCod, TM1.GuiFasLin, T3.FasDsc, TM1.GuiFasPKg, TM1.GuiFasPMt, T4.FasPreKgm, T4.FasPreMtr, TM1.FasKgm, TM1.FasMtr, TM1.FasUnd, TM1.FasPreUnd, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.FasCod, TM1.AlbProCod FROM (((TXPALBFAS TM1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = TM1.EmprCod AND T2.BarCod = TM1.BarCod AND T2.BarCodReo = TM1.BarCodReo AND T2.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPPREFAS T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = T2.CliCod AND T4.FasCod = TM1.FasCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = TM1.EmprCod AND T3.FasCod = TM1.FasCod) WHERE TM1.GuiFasLin = ? and TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.GuiFasLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ9", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ10", "SELECT CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ11", "SELECT FasPreKgm, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ12", "SELECT EmprCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ GuiFasLin, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBFAS WHERE ( GuiFasLin > ? or GuiFasLin = ? and EmprCod > ? or EmprCod = ? and GuiFasLin = ? and BarCod > ? or BarCod = ? and EmprCod = ? and GuiFasLin = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and GuiFasLin = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and GuiFasLin = ? and AlbProCod > ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QJ15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ GuiFasLin, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBFAS WHERE ( GuiFasLin < ? or GuiFasLin = ? and EmprCod < ? or EmprCod = ? and GuiFasLin = ? and BarCod < ? or BarCod = ? and EmprCod = ? and GuiFasLin = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and GuiFasLin = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and GuiFasLin = ? and AlbProCod < ?) ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, GuiFasLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QJ16", "INSERT INTO TXPALBFAS(GuiFasLin, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasUnd, FasPreUnd, EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, AlbProCod, FasCodF, FasPreDsK, FasPreDsM, F_TipPza, FasFacMaqC, ArtAdiCod, GuiFasPre, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPALBFAS")
         ,new UpdateCursor("T01QJ17", "UPDATE TXPALBFAS SET GuiFasPKg=?, GuiFasPMt=?, FasKgm=?, FasMtr=?, FasUnd=?, FasPreUnd=?, FasCod=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK, "TXPALBFAS")
         ,new UpdateCursor("T01QJ18", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK, "TXPALBFAS")
         ,new ForEachCursor("T01QJ19", "SELECT CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ20", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ21", "SELECT FasPreKgm, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ22", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QJ23", "SELECT EmprCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((long[]) buf[12])[0] = rslt.getLong(13);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((long[]) buf[12])[0] = rslt.getLong(13);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[14])[0] = rslt.getString(12, 3);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 1);
               ((String[]) buf[18])[0] = rslt.getString(16, 8);
               ((long[]) buf[19])[0] = rslt.getLong(17);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 19 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 21 :
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 3);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 3);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setLong(21, ((Number) parms[20]).longValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 3);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 3);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setLong(21, ((Number) parms[20]).longValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setLong(13, ((Number) parms[12]).longValue());
               return;
            case 15 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

