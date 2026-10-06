package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recmaq_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"RECHAYANY") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asarechayany1QD408( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A602MaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
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
         gxload_6( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla RECMAQ", ""), (short)(0)) ;
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

   public recmaq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recmaq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recmaq_impl.class ));
   }

   public recmaq_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla RECMAQ", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_RECMAQ.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_RECMAQ.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECMAQ.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNHdr_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNHdr_Internalname, GXutil.rtrim( A13696BarNHdr), GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNHdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSer_Internalname, httpContext.getMessage( "Serie", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSerDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSerDsc_Internalname, httpContext.getMessage( "Descripción Serie", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc), GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSerDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNom_Internalname, httpContext.getMessage( "Nombre Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNum_Internalname, httpContext.getMessage( "Numero del Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipCol_Internalname, httpContext.getMessage( "Codigo TC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCol_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNomCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNomCli_Internalname, httpContext.getMessage( "Nombre Color Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNomCli_Internalname, GXutil.rtrim( A1234BarNomCli), GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNomCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNumCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNumCli_Internalname, httpContext.getMessage( "Numero ", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNumCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecLinMaq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecLinMaq_Internalname, httpContext.getMessage( "Linea Maquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLinMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecLinMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLinMaq_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecLinMaq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCod_Internalname, httpContext.getMessage( "Código Máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecVolPrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecVolPrd_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecVolPrd_Internalname, GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecVolPrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2805RecVolPrd), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2805RecVolPrd), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecVolPrd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecVolPrd_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecFA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecFA_Internalname, httpContext.getMessage( "Factor Absorcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecFA_Internalname, GXutil.ltrim( localUtil.ntoc( A2806RecFA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecFA_Enabled!=0) ? localUtil.format( A2806RecFA, "ZZ9.99") : localUtil.format( A2806RecFA, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecFA_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecFA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUltLinPro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtUltLinPro_Internalname, httpContext.getMessage( "Ultima Linea Proceso Receta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUltLinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A1272UltLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtUltLinPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1272UltLinPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1272UltLinPro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUltLinPro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUltLinPro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecUsrCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecUsrCod_Internalname, httpContext.getMessage( "Usuario Receta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecUsrCod_Internalname, GXutil.rtrim( A4402RecUsrCod), GXutil.rtrim( localUtil.format( A4402RecUsrCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecUsrCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecUsrCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecFecPes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecFecPes_Internalname, httpContext.getMessage( "Hora Fecha Pesaje.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRecFecPes_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecFecPes_Internalname, localUtil.ttoc( A4574RecFecPes, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4574RecFecPes, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecFecPes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecFecPes_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRecFecPes_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRecFecPes_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RECMAQ.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMaqPes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMaqPes_Internalname, httpContext.getMessage( "Linea Maquina Pesada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqPes_Internalname, GXutil.ltrim( localUtil.ntoc( A4575RecMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4575RecMaqPes), "9") : localUtil.format( DecimalUtil.doubleToDec(A4575RecMaqPes), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqPes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecMaqPes_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecNumInt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecNumInt_Internalname, httpContext.getMessage( "Numero Receta Interno,Aut?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecNumInt_Internalname, GXutil.ltrim( localUtil.ntoc( A5109RecNumInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecNumInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5109RecNumInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5109RecNumInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecNumInt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecNumInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecNumPrg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecNumPrg_Internalname, httpContext.getMessage( "Numero Programa Aut", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecNumPrg_Internalname, GXutil.rtrim( A5110RecNumPrg), GXutil.rtrim( localUtil.format( A5110RecNumPrg, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecNumPrg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecNumPrg_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecBp12_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecBp12_Internalname, httpContext.getMessage( "Vel Inicial Salhilho (Barco)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecBp12_Internalname, GXutil.ltrim( localUtil.ntoc( A5111RecBp12, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecBp12_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5111RecBp12), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5111RecBp12), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecBp12_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecBp12_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecBp13_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecBp13_Internalname, httpContext.getMessage( "Tiempo Vueltas (Barco)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecBp13_Internalname, GXutil.ltrim( localUtil.ntoc( A5112RecBp13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecBp13_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5112RecBp13), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5112RecBp13), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecBp13_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecBp13_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecBp14_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecBp14_Internalname, httpContext.getMessage( "Presion Jet (Barco)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecBp14_Internalname, GXutil.ltrim( localUtil.ntoc( A5113RecBp14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecBp14_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5113RecBp14), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5113RecBp14), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecBp14_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecBp14_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecBp15_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecBp15_Internalname, httpContext.getMessage( "Velocidad Bomba (Barco)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecBp15_Internalname, GXutil.ltrim( localUtil.ntoc( A5114RecBp15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecBp15_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5114RecBp15), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5114RecBp15), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecBp15_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecBp15_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecAbsFac_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecAbsFac_Internalname, httpContext.getMessage( "Factor Absorcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecAbsFac_Internalname, GXutil.ltrim( localUtil.ntoc( A5115RecAbsFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecAbsFac_Enabled!=0) ? localUtil.format( A5115RecAbsFac, "ZZ9.99") : localUtil.format( A5115RecAbsFac, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecAbsFac_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecAbsFac_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecRecep_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecRecep_Internalname, httpContext.getMessage( "Recepcionada del Automata?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecRecep_Internalname, GXutil.ltrim( localUtil.ntoc( A4701RecRecep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecRecep_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4701RecRecep), "9") : localUtil.format( DecimalUtil.doubleToDec(A4701RecRecep), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecRecep_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecRecep_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecEnvio_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecEnvio_Internalname, httpContext.getMessage( "Enviado; 0,1=Enviado,2=En Maq", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecEnvio_Internalname, GXutil.ltrim( localUtil.ntoc( A4700RecEnvio, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecEnvio_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4700RecEnvio), "9") : localUtil.format( DecimalUtil.doubleToDec(A4700RecEnvio), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecEnvio_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecEnvio_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecPrg2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecPrg2_Internalname, httpContext.getMessage( "Programa 2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPrg2_Internalname, GXutil.rtrim( A6269RecPrg2), GXutil.rtrim( localUtil.format( A6269RecPrg2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPrg2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecPrg2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecPrg3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecPrg3_Internalname, httpContext.getMessage( "Programa 3", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPrg3_Internalname, GXutil.rtrim( A6270RecPrg3), GXutil.rtrim( localUtil.format( A6270RecPrg3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPrg3_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecPrg3_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMaqNh_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMaqNh_Internalname, httpContext.getMessage( "Nh", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqNh_Internalname, GXutil.ltrim( localUtil.ntoc( A7764RecMaqNh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqNh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7764RecMaqNh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7764RecMaqNh), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqNh_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecMaqNh_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMaqVX_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMaqVX_Internalname, httpContext.getMessage( "VX", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqVX_Internalname, GXutil.ltrim( localUtil.ntoc( A7765RecMaqVX, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqVX_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7765RecMaqVX), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7765RecMaqVX), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqVX_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecMaqVX_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMaqBL_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMaqBL_Internalname, httpContext.getMessage( "BL", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqBL_Internalname, GXutil.ltrim( localUtil.ntoc( A7766RecMaqBL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqBL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7766RecMaqBL), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7766RecMaqBL), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqBL_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecMaqBL_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMaqFlow_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMaqFlow_Internalname, httpContext.getMessage( "Flow", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqFlow_Internalname, GXutil.ltrim( localUtil.ntoc( A7767RecMaqFlow, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqFlow_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7767RecMaqFlow), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7767RecMaqFlow), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqFlow_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecMaqFlow_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMaqRPM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMaqRPM_Internalname, httpContext.getMessage( "RecMaqRPM", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqRPM_Internalname, GXutil.ltrim( localUtil.ntoc( A7768RecMaqRPM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqRPM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7768RecMaqRPM), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7768RecMaqRPM), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqRPM_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecMaqRPM_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMaqMol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMaqMol_Internalname, httpContext.getMessage( "Mol", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqMol_Internalname, GXutil.ltrim( localUtil.ntoc( A7769RecMaqMol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqMol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7769RecMaqMol), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7769RecMaqMol), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqMol_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecMaqMol_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMaqTor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMaqTor_Internalname, httpContext.getMessage( "Torsión", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqTor_Internalname, GXutil.ltrim( localUtil.ntoc( A7770RecMaqTor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqTor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7770RecMaqTor), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7770RecMaqTor), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,219);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqTor_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecMaqTor_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMaqCla_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMaqCla_Internalname, httpContext.getMessage( "Clapeta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqCla_Internalname, GXutil.rtrim( A7771RecMaqCla), GXutil.rtrim( localUtil.format( A7771RecMaqCla, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqCla_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecMaqCla_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMaqTej_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMaqTej_Internalname, httpContext.getMessage( "Tipo Tejido", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqTej_Internalname, GXutil.ltrim( localUtil.ntoc( A7772RecMaqTej, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqTej_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7772RecMaqTej), "9") : localUtil.format( DecimalUtil.doubleToDec(A7772RecMaqTej), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqTej_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecMaqTej_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMaqDel_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMaqDel_Internalname, httpContext.getMessage( "Delicado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqDel_Internalname, GXutil.ltrim( localUtil.ntoc( A7773RecMaqDel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqDel_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7773RecMaqDel), "9") : localUtil.format( DecimalUtil.doubleToDec(A7773RecMaqDel), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqDel_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecMaqDel_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMaqPML_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMaqPML_Internalname, httpContext.getMessage( "Peso Metro Lineal", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqPML_Internalname, GXutil.ltrim( localUtil.ntoc( A7774RecMaqPML, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqPML_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7774RecMaqPML), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7774RecMaqPML), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqPML_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecMaqPML_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMaqObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMaqObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtRecMaqObs_Internalname, A8353RecMaqObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,244);\"", (short)(0), 1, edtRecMaqObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "4000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecTotKgs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecTotKgs_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecTotKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A4259RecTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecTotKgs_Enabled!=0) ? localUtil.format( A4259RecTotKgs, "ZZZZZZ9.99") : localUtil.format( A4259RecTotKgs, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,249);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecTotKgs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecTotKgs_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRsedo1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRsedo1_Internalname, httpContext.getMessage( "Igual Sedo1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 254,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRsedo1_Internalname, GXutil.ltrim( localUtil.ntoc( A10124Rsedo1, (byte)(4), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRsedo1_Enabled!=0) ? localUtil.format( A10124Rsedo1, "Z9.9") : localUtil.format( A10124Rsedo1, "Z9.9"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onblur(this,254);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRsedo1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRsedo1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRsedo2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRsedo2_Internalname, httpContext.getMessage( "Igual Sedo2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRsedo2_Internalname, GXutil.ltrim( localUtil.ntoc( A10125Rsedo2, (byte)(4), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRsedo2_Enabled!=0) ? localUtil.format( A10125Rsedo2, "Z9.9") : localUtil.format( A10125Rsedo2, "Z9.9"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onblur(this,259);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRsedo2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRsedo2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRsedo3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRsedo3_Internalname, httpContext.getMessage( "Igual Sedo3", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRsedo3_Internalname, GXutil.ltrim( localUtil.ntoc( A10126Rsedo3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRsedo3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10126Rsedo3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10126Rsedo3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,264);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRsedo3_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRsedo3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRsedo4_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRsedo4_Internalname, httpContext.getMessage( "Igual Sedo4", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRsedo4_Internalname, GXutil.ltrim( localUtil.ntoc( A10127Rsedo4, (byte)(4), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRsedo4_Enabled!=0) ? localUtil.format( A10127Rsedo4, "9.99") : localUtil.format( A10127Rsedo4, "9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,269);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRsedo4_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRsedo4_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRsedo5_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRsedo5_Internalname, httpContext.getMessage( "Igual Sedo5", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 274,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRsedo5_Internalname, GXutil.ltrim( localUtil.ntoc( A10128Rsedo5, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRsedo5_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10128Rsedo5), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10128Rsedo5), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,274);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRsedo5_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRsedo5_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRsedo6_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRsedo6_Internalname, httpContext.getMessage( "Igual Sedo6", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRsedo6_Internalname, GXutil.ltrim( localUtil.ntoc( A10129Rsedo6, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRsedo6_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10129Rsedo6), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10129Rsedo6), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,279);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRsedo6_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRsedo6_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecCAut_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecCAut_Internalname, httpContext.getMessage( "CierreAutomatico", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 284,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecCAut_Internalname, GXutil.ltrim( localUtil.ntoc( A10385RecCAut, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecCAut_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10385RecCAut), "9") : localUtil.format( DecimalUtil.doubleToDec(A10385RecCAut), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,284);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecCAut_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecCAut_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRsedo7_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRsedo7_Internalname, httpContext.getMessage( "BP12 - Tempo de Volta (min.) 999.9", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 289,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRsedo7_Internalname, GXutil.ltrim( localUtil.ntoc( A12270Rsedo7, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRsedo7_Enabled!=0) ? localUtil.format( A12270Rsedo7, "ZZ9.9") : localUtil.format( A12270Rsedo7, "ZZ9.9"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onblur(this,289);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRsedo7_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRsedo7_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRsedo8_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRsedo8_Internalname, httpContext.getMessage( "BP13 - RI-FI Fact 99.9", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 294,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRsedo8_Internalname, GXutil.ltrim( localUtil.ntoc( A12271Rsedo8, (byte)(4), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRsedo8_Enabled!=0) ? localUtil.format( A12271Rsedo8, "Z9.9") : localUtil.format( A12271Rsedo8, "Z9.9"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onblur(this,294);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRsedo8_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRsedo8_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRsedo9_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRsedo9_Internalname, httpContext.getMessage( "BP17 - %Reg. Jet 999", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 299,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRsedo9_Internalname, GXutil.ltrim( localUtil.ntoc( A12272Rsedo9, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRsedo9_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12272Rsedo9), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12272Rsedo9), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,299);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRsedo9_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRsedo9_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRsedo10_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRsedo10_Internalname, httpContext.getMessage( "BP18 - Vel. Bomba RPM 9999", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 304,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRsedo10_Internalname, GXutil.ltrim( localUtil.ntoc( A12273Rsedo10, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRsedo10_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12273Rsedo10), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12273Rsedo10), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,304);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRsedo10_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRsedo10_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRsedo11_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRsedo11_Internalname, httpContext.getMessage( "BP 19 - Vel. Sarilho 999", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 309,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRsedo11_Internalname, GXutil.ltrim( localUtil.ntoc( A12274Rsedo11, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRsedo11_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12274Rsedo11), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12274Rsedo11), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,309);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRsedo11_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRsedo11_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRsedo12_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRsedo12_Internalname, httpContext.getMessage( "BP14 Comprimento metros", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 314,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRsedo12_Internalname, GXutil.ltrim( localUtil.ntoc( A12900Rsedo12, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRsedo12_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12900Rsedo12), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12900Rsedo12), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,314);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRsedo12_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRsedo12_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRsedo13_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRsedo13_Internalname, httpContext.getMessage( "BP15 Profundidad de la Caja", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 319,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRsedo13_Internalname, GXutil.ltrim( localUtil.ntoc( A12901Rsedo13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRsedo13_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12901Rsedo13), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12901Rsedo13), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,319);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRsedo13_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRsedo13_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRsedo14_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRsedo14_Internalname, httpContext.getMessage( "Volumen Dosificacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 324,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRsedo14_Internalname, GXutil.ltrim( localUtil.ntoc( A12902Rsedo14, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRsedo14_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12902Rsedo14), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12902Rsedo14), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,324);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRsedo14_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRsedo14_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecHayAny_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecHayAny_Internalname, httpContext.getMessage( "añadidas?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecHayAny_Internalname, GXutil.rtrim( A14372RecHayAny), GXutil.rtrim( localUtil.format( A14372RecHayAny, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecHayAny_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecHayAny_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECMAQ.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 334,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 336,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RECMAQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 338,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RECMAQ.htm");
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
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( "Z2804RecLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2805RecVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( "Z2805RecVolPrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2806RecFA = localUtil.ctond( httpContext.cgiGet( "Z2806RecFA")) ;
         Z1272UltLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1272UltLinPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4402RecUsrCod = httpContext.cgiGet( "Z4402RecUsrCod") ;
         Z4574RecFecPes = localUtil.ctot( httpContext.cgiGet( "Z4574RecFecPes"), 0) ;
         Z4575RecMaqPes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4575RecMaqPes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5109RecNumInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z5109RecNumInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5110RecNumPrg = httpContext.cgiGet( "Z5110RecNumPrg") ;
         Z5111RecBp12 = (short)(localUtil.ctol( httpContext.cgiGet( "Z5111RecBp12"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5112RecBp13 = (short)(localUtil.ctol( httpContext.cgiGet( "Z5112RecBp13"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5113RecBp14 = (short)(localUtil.ctol( httpContext.cgiGet( "Z5113RecBp14"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5114RecBp15 = (short)(localUtil.ctol( httpContext.cgiGet( "Z5114RecBp15"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5115RecAbsFac = localUtil.ctond( httpContext.cgiGet( "Z5115RecAbsFac")) ;
         Z4701RecRecep = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4701RecRecep"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4700RecEnvio = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4700RecEnvio"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6269RecPrg2 = httpContext.cgiGet( "Z6269RecPrg2") ;
         Z6270RecPrg3 = httpContext.cgiGet( "Z6270RecPrg3") ;
         Z7764RecMaqNh = (short)(localUtil.ctol( httpContext.cgiGet( "Z7764RecMaqNh"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7765RecMaqVX = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7765RecMaqVX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7766RecMaqBL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7766RecMaqBL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7767RecMaqFlow = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7767RecMaqFlow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7768RecMaqRPM = (short)(localUtil.ctol( httpContext.cgiGet( "Z7768RecMaqRPM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7769RecMaqMol = (short)(localUtil.ctol( httpContext.cgiGet( "Z7769RecMaqMol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7770RecMaqTor = (short)(localUtil.ctol( httpContext.cgiGet( "Z7770RecMaqTor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7771RecMaqCla = httpContext.cgiGet( "Z7771RecMaqCla") ;
         Z7772RecMaqTej = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7772RecMaqTej"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7773RecMaqDel = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7773RecMaqDel"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7774RecMaqPML = (short)(localUtil.ctol( httpContext.cgiGet( "Z7774RecMaqPML"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4259RecTotKgs = localUtil.ctond( httpContext.cgiGet( "Z4259RecTotKgs")) ;
         Z10124Rsedo1 = localUtil.ctond( httpContext.cgiGet( "Z10124Rsedo1")) ;
         Z10125Rsedo2 = localUtil.ctond( httpContext.cgiGet( "Z10125Rsedo2")) ;
         Z10126Rsedo3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z10126Rsedo3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10127Rsedo4 = localUtil.ctond( httpContext.cgiGet( "Z10127Rsedo4")) ;
         Z10128Rsedo5 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10128Rsedo5"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10129Rsedo6 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10129Rsedo6"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10385RecCAut = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10385RecCAut"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12270Rsedo7 = localUtil.ctond( httpContext.cgiGet( "Z12270Rsedo7")) ;
         Z12271Rsedo8 = localUtil.ctond( httpContext.cgiGet( "Z12271Rsedo8")) ;
         Z12272Rsedo9 = (short)(localUtil.ctol( httpContext.cgiGet( "Z12272Rsedo9"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12273Rsedo10 = (short)(localUtil.ctol( httpContext.cgiGet( "Z12273Rsedo10"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12274Rsedo11 = (short)(localUtil.ctol( httpContext.cgiGet( "Z12274Rsedo11"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12900Rsedo12 = (short)(localUtil.ctol( httpContext.cgiGet( "Z12900Rsedo12"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12901Rsedo13 = (short)(localUtil.ctol( httpContext.cgiGet( "Z12901Rsedo13"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12902Rsedo14 = (int)(localUtil.ctol( httpContext.cgiGet( "Z12902Rsedo14"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
         A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
         A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECLINMAQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecLinMaq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2804RecLinMaq = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         }
         else
         {
            A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         }
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECVOLPRD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecVolPrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2805RecVolPrd = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
         }
         else
         {
            A2805RecVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtRecVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecFA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecFA_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECFA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecFA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2806RecFA = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A2806RecFA", GXutil.ltrimstr( A2806RecFA, 6, 2));
         }
         else
         {
            A2806RecFA = localUtil.ctond( httpContext.cgiGet( edtRecFA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2806RecFA", GXutil.ltrimstr( A2806RecFA, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUltLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUltLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ULTLINPRO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtUltLinPro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1272UltLinPro = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
         }
         else
         {
            A1272UltLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtUltLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
         }
         A4402RecUsrCod = httpContext.cgiGet( edtRecUsrCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4402RecUsrCod", A4402RecUsrCod);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtRecFecPes_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "RECFECPES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecFecPes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A4574RecFecPes", localUtil.ttoc( A4574RecFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A4574RecFecPes = localUtil.ctot( httpContext.cgiGet( edtRecFecPes_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4574RecFecPes", localUtil.ttoc( A4574RecFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQPES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecMaqPes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4575RecMaqPes = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4575RecMaqPes", GXutil.str( A4575RecMaqPes, 1, 0));
         }
         else
         {
            A4575RecMaqPes = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMaqPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4575RecMaqPes", GXutil.str( A4575RecMaqPes, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecNumInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecNumInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECNUMINT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecNumInt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5109RecNumInt = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A5109RecNumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5109RecNumInt), 8, 0));
         }
         else
         {
            A5109RecNumInt = (int)(localUtil.ctol( httpContext.cgiGet( edtRecNumInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5109RecNumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5109RecNumInt), 8, 0));
         }
         A5110RecNumPrg = httpContext.cgiGet( edtRecNumPrg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5110RecNumPrg", A5110RecNumPrg);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp12_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp12_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECBP12");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecBp12_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5111RecBp12 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5111RecBp12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5111RecBp12), 4, 0));
         }
         else
         {
            A5111RecBp12 = (short)(localUtil.ctol( httpContext.cgiGet( edtRecBp12_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5111RecBp12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5111RecBp12), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp13_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp13_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECBP13");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecBp13_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5112RecBp13 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5112RecBp13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5112RecBp13), 4, 0));
         }
         else
         {
            A5112RecBp13 = (short)(localUtil.ctol( httpContext.cgiGet( edtRecBp13_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5112RecBp13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5112RecBp13), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp14_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp14_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECBP14");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecBp14_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5113RecBp14 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5113RecBp14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5113RecBp14), 4, 0));
         }
         else
         {
            A5113RecBp14 = (short)(localUtil.ctol( httpContext.cgiGet( edtRecBp14_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5113RecBp14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5113RecBp14), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECBP15");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecBp15_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5114RecBp15 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5114RecBp15", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5114RecBp15), 4, 0));
         }
         else
         {
            A5114RecBp15 = (short)(localUtil.ctol( httpContext.cgiGet( edtRecBp15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5114RecBp15", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5114RecBp15), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecAbsFac_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecAbsFac_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECABSFAC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecAbsFac_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5115RecAbsFac = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A5115RecAbsFac", GXutil.ltrimstr( A5115RecAbsFac, 6, 2));
         }
         else
         {
            A5115RecAbsFac = localUtil.ctond( httpContext.cgiGet( edtRecAbsFac_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5115RecAbsFac", GXutil.ltrimstr( A5115RecAbsFac, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecRecep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecRecep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECRECEP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecRecep_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4701RecRecep = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4701RecRecep", GXutil.str( A4701RecRecep, 1, 0));
         }
         else
         {
            A4701RecRecep = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecRecep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4701RecRecep", GXutil.str( A4701RecRecep, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecEnvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecEnvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECENVIO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecEnvio_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4700RecEnvio = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4700RecEnvio", GXutil.str( A4700RecEnvio, 1, 0));
         }
         else
         {
            A4700RecEnvio = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecEnvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4700RecEnvio", GXutil.str( A4700RecEnvio, 1, 0));
         }
         A6269RecPrg2 = httpContext.cgiGet( edtRecPrg2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6269RecPrg2", A6269RecPrg2);
         A6270RecPrg3 = httpContext.cgiGet( edtRecPrg3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6270RecPrg3", A6270RecPrg3);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqNh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqNh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQNH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecMaqNh_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7764RecMaqNh = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7764RecMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7764RecMaqNh), 3, 0));
         }
         else
         {
            A7764RecMaqNh = (short)(localUtil.ctol( httpContext.cgiGet( edtRecMaqNh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7764RecMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7764RecMaqNh), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqVX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqVX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQVX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecMaqVX_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7765RecMaqVX = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7765RecMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7765RecMaqVX), 2, 0));
         }
         else
         {
            A7765RecMaqVX = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMaqVX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7765RecMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7765RecMaqVX), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqBL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqBL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQBL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecMaqBL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7766RecMaqBL = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7766RecMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7766RecMaqBL), 2, 0));
         }
         else
         {
            A7766RecMaqBL = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMaqBL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7766RecMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7766RecMaqBL), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqFlow_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqFlow_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQFLOW");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecMaqFlow_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7767RecMaqFlow = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7767RecMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7767RecMaqFlow), 2, 0));
         }
         else
         {
            A7767RecMaqFlow = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMaqFlow_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7767RecMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7767RecMaqFlow), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqRPM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqRPM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQRPM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecMaqRPM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7768RecMaqRPM = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7768RecMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7768RecMaqRPM), 4, 0));
         }
         else
         {
            A7768RecMaqRPM = (short)(localUtil.ctol( httpContext.cgiGet( edtRecMaqRPM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7768RecMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7768RecMaqRPM), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqMol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqMol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQMOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecMaqMol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7769RecMaqMol = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7769RecMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7769RecMaqMol), 3, 0));
         }
         else
         {
            A7769RecMaqMol = (short)(localUtil.ctol( httpContext.cgiGet( edtRecMaqMol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7769RecMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7769RecMaqMol), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqTor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqTor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQTOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecMaqTor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7770RecMaqTor = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7770RecMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7770RecMaqTor), 3, 0));
         }
         else
         {
            A7770RecMaqTor = (short)(localUtil.ctol( httpContext.cgiGet( edtRecMaqTor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7770RecMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7770RecMaqTor), 3, 0));
         }
         A7771RecMaqCla = httpContext.cgiGet( edtRecMaqCla_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7771RecMaqCla", A7771RecMaqCla);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqTej_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqTej_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQTEJ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecMaqTej_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7772RecMaqTej = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7772RecMaqTej", GXutil.str( A7772RecMaqTej, 1, 0));
         }
         else
         {
            A7772RecMaqTej = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMaqTej_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7772RecMaqTej", GXutil.str( A7772RecMaqTej, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqDel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqDel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQDEL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecMaqDel_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7773RecMaqDel = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7773RecMaqDel", GXutil.str( A7773RecMaqDel, 1, 0));
         }
         else
         {
            A7773RecMaqDel = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMaqDel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7773RecMaqDel", GXutil.str( A7773RecMaqDel, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqPML_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqPML_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQPML");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecMaqPML_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7774RecMaqPML = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7774RecMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7774RecMaqPML), 3, 0));
         }
         else
         {
            A7774RecMaqPML = (short)(localUtil.ctol( httpContext.cgiGet( edtRecMaqPML_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7774RecMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7774RecMaqPML), 3, 0));
         }
         A8353RecMaqObs = httpContext.cgiGet( edtRecMaqObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8353RecMaqObs", A8353RecMaqObs);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecTotKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecTotKgs_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECTOTKGS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecTotKgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4259RecTotKgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A4259RecTotKgs", GXutil.ltrimstr( A4259RecTotKgs, 10, 2));
         }
         else
         {
            A4259RecTotKgs = localUtil.ctond( httpContext.cgiGet( edtRecTotKgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4259RecTotKgs", GXutil.ltrimstr( A4259RecTotKgs, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRsedo1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRsedo1_Internalname)), DecimalUtil.stringToDec("99.9")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RSEDO1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRsedo1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10124Rsedo1 = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A10124Rsedo1", GXutil.ltrimstr( A10124Rsedo1, 4, 1));
         }
         else
         {
            A10124Rsedo1 = localUtil.ctond( httpContext.cgiGet( edtRsedo1_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10124Rsedo1", GXutil.ltrimstr( A10124Rsedo1, 4, 1));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRsedo2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRsedo2_Internalname)), DecimalUtil.stringToDec("99.9")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RSEDO2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRsedo2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10125Rsedo2 = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A10125Rsedo2", GXutil.ltrimstr( A10125Rsedo2, 4, 1));
         }
         else
         {
            A10125Rsedo2 = localUtil.ctond( httpContext.cgiGet( edtRsedo2_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10125Rsedo2", GXutil.ltrimstr( A10125Rsedo2, 4, 1));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RSEDO3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRsedo3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10126Rsedo3 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10126Rsedo3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10126Rsedo3), 3, 0));
         }
         else
         {
            A10126Rsedo3 = (short)(localUtil.ctol( httpContext.cgiGet( edtRsedo3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10126Rsedo3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10126Rsedo3), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRsedo4_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRsedo4_Internalname)), DecimalUtil.stringToDec("9.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RSEDO4");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRsedo4_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10127Rsedo4 = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A10127Rsedo4", GXutil.ltrimstr( A10127Rsedo4, 4, 2));
         }
         else
         {
            A10127Rsedo4 = localUtil.ctond( httpContext.cgiGet( edtRsedo4_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10127Rsedo4", GXutil.ltrimstr( A10127Rsedo4, 4, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RSEDO5");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRsedo5_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10128Rsedo5 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10128Rsedo5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10128Rsedo5), 2, 0));
         }
         else
         {
            A10128Rsedo5 = (byte)(localUtil.ctol( httpContext.cgiGet( edtRsedo5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10128Rsedo5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10128Rsedo5), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RSEDO6");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRsedo6_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10129Rsedo6 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10129Rsedo6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10129Rsedo6), 2, 0));
         }
         else
         {
            A10129Rsedo6 = (byte)(localUtil.ctol( httpContext.cgiGet( edtRsedo6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10129Rsedo6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10129Rsedo6), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecCAut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecCAut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECCAUT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecCAut_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10385RecCAut = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10385RecCAut", GXutil.str( A10385RecCAut, 1, 0));
         }
         else
         {
            A10385RecCAut = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecCAut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10385RecCAut", GXutil.str( A10385RecCAut, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRsedo7_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRsedo7_Internalname)), DecimalUtil.stringToDec("999.9")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RSEDO7");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRsedo7_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12270Rsedo7 = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A12270Rsedo7", GXutil.ltrimstr( A12270Rsedo7, 5, 1));
         }
         else
         {
            A12270Rsedo7 = localUtil.ctond( httpContext.cgiGet( edtRsedo7_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12270Rsedo7", GXutil.ltrimstr( A12270Rsedo7, 5, 1));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRsedo8_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRsedo8_Internalname)), DecimalUtil.stringToDec("99.9")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RSEDO8");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRsedo8_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12271Rsedo8 = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A12271Rsedo8", GXutil.ltrimstr( A12271Rsedo8, 4, 1));
         }
         else
         {
            A12271Rsedo8 = localUtil.ctond( httpContext.cgiGet( edtRsedo8_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12271Rsedo8", GXutil.ltrimstr( A12271Rsedo8, 4, 1));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo9_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo9_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RSEDO9");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRsedo9_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12272Rsedo9 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12272Rsedo9", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12272Rsedo9), 3, 0));
         }
         else
         {
            A12272Rsedo9 = (short)(localUtil.ctol( httpContext.cgiGet( edtRsedo9_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12272Rsedo9", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12272Rsedo9), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo10_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo10_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RSEDO10");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRsedo10_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12273Rsedo10 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12273Rsedo10", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12273Rsedo10), 4, 0));
         }
         else
         {
            A12273Rsedo10 = (short)(localUtil.ctol( httpContext.cgiGet( edtRsedo10_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12273Rsedo10", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12273Rsedo10), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo11_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo11_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RSEDO11");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRsedo11_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12274Rsedo11 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12274Rsedo11", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12274Rsedo11), 3, 0));
         }
         else
         {
            A12274Rsedo11 = (short)(localUtil.ctol( httpContext.cgiGet( edtRsedo11_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12274Rsedo11", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12274Rsedo11), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo12_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo12_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RSEDO12");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRsedo12_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12900Rsedo12 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12900Rsedo12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12900Rsedo12), 4, 0));
         }
         else
         {
            A12900Rsedo12 = (short)(localUtil.ctol( httpContext.cgiGet( edtRsedo12_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12900Rsedo12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12900Rsedo12), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo13_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo13_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RSEDO13");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRsedo13_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12901Rsedo13 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12901Rsedo13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12901Rsedo13), 4, 0));
         }
         else
         {
            A12901Rsedo13 = (short)(localUtil.ctol( httpContext.cgiGet( edtRsedo13_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12901Rsedo13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12901Rsedo13), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo14_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRsedo14_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RSEDO14");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRsedo14_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12902Rsedo14 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A12902Rsedo14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12902Rsedo14), 6, 0));
         }
         else
         {
            A12902Rsedo14 = (int)(localUtil.ctol( httpContext.cgiGet( edtRsedo14_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12902Rsedo14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12902Rsedo14), 6, 0));
         }
         A14372RecHayAny = httpContext.cgiGet( edtRecHayAny_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14372RecHayAny", A14372RecHayAny);
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
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
            initAll1QD408( ) ;
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
      disableAttributes1QD408( ) ;
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

   public void resetCaption1QD0( )
   {
   }

   public void zm1QD408( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2805RecVolPrd = T01QD3_A2805RecVolPrd[0] ;
            Z2806RecFA = T01QD3_A2806RecFA[0] ;
            Z1272UltLinPro = T01QD3_A1272UltLinPro[0] ;
            Z4402RecUsrCod = T01QD3_A4402RecUsrCod[0] ;
            Z4574RecFecPes = T01QD3_A4574RecFecPes[0] ;
            Z4575RecMaqPes = T01QD3_A4575RecMaqPes[0] ;
            Z5109RecNumInt = T01QD3_A5109RecNumInt[0] ;
            Z5110RecNumPrg = T01QD3_A5110RecNumPrg[0] ;
            Z5111RecBp12 = T01QD3_A5111RecBp12[0] ;
            Z5112RecBp13 = T01QD3_A5112RecBp13[0] ;
            Z5113RecBp14 = T01QD3_A5113RecBp14[0] ;
            Z5114RecBp15 = T01QD3_A5114RecBp15[0] ;
            Z5115RecAbsFac = T01QD3_A5115RecAbsFac[0] ;
            Z4701RecRecep = T01QD3_A4701RecRecep[0] ;
            Z4700RecEnvio = T01QD3_A4700RecEnvio[0] ;
            Z6269RecPrg2 = T01QD3_A6269RecPrg2[0] ;
            Z6270RecPrg3 = T01QD3_A6270RecPrg3[0] ;
            Z7764RecMaqNh = T01QD3_A7764RecMaqNh[0] ;
            Z7765RecMaqVX = T01QD3_A7765RecMaqVX[0] ;
            Z7766RecMaqBL = T01QD3_A7766RecMaqBL[0] ;
            Z7767RecMaqFlow = T01QD3_A7767RecMaqFlow[0] ;
            Z7768RecMaqRPM = T01QD3_A7768RecMaqRPM[0] ;
            Z7769RecMaqMol = T01QD3_A7769RecMaqMol[0] ;
            Z7770RecMaqTor = T01QD3_A7770RecMaqTor[0] ;
            Z7771RecMaqCla = T01QD3_A7771RecMaqCla[0] ;
            Z7772RecMaqTej = T01QD3_A7772RecMaqTej[0] ;
            Z7773RecMaqDel = T01QD3_A7773RecMaqDel[0] ;
            Z7774RecMaqPML = T01QD3_A7774RecMaqPML[0] ;
            Z4259RecTotKgs = T01QD3_A4259RecTotKgs[0] ;
            Z10124Rsedo1 = T01QD3_A10124Rsedo1[0] ;
            Z10125Rsedo2 = T01QD3_A10125Rsedo2[0] ;
            Z10126Rsedo3 = T01QD3_A10126Rsedo3[0] ;
            Z10127Rsedo4 = T01QD3_A10127Rsedo4[0] ;
            Z10128Rsedo5 = T01QD3_A10128Rsedo5[0] ;
            Z10129Rsedo6 = T01QD3_A10129Rsedo6[0] ;
            Z10385RecCAut = T01QD3_A10385RecCAut[0] ;
            Z12270Rsedo7 = T01QD3_A12270Rsedo7[0] ;
            Z12271Rsedo8 = T01QD3_A12271Rsedo8[0] ;
            Z12272Rsedo9 = T01QD3_A12272Rsedo9[0] ;
            Z12273Rsedo10 = T01QD3_A12273Rsedo10[0] ;
            Z12274Rsedo11 = T01QD3_A12274Rsedo11[0] ;
            Z12900Rsedo12 = T01QD3_A12900Rsedo12[0] ;
            Z12901Rsedo13 = T01QD3_A12901Rsedo13[0] ;
            Z12902Rsedo14 = T01QD3_A12902Rsedo14[0] ;
            Z602MaqCod = T01QD3_A602MaqCod[0] ;
         }
         else
         {
            Z2805RecVolPrd = A2805RecVolPrd ;
            Z2806RecFA = A2806RecFA ;
            Z1272UltLinPro = A1272UltLinPro ;
            Z4402RecUsrCod = A4402RecUsrCod ;
            Z4574RecFecPes = A4574RecFecPes ;
            Z4575RecMaqPes = A4575RecMaqPes ;
            Z5109RecNumInt = A5109RecNumInt ;
            Z5110RecNumPrg = A5110RecNumPrg ;
            Z5111RecBp12 = A5111RecBp12 ;
            Z5112RecBp13 = A5112RecBp13 ;
            Z5113RecBp14 = A5113RecBp14 ;
            Z5114RecBp15 = A5114RecBp15 ;
            Z5115RecAbsFac = A5115RecAbsFac ;
            Z4701RecRecep = A4701RecRecep ;
            Z4700RecEnvio = A4700RecEnvio ;
            Z6269RecPrg2 = A6269RecPrg2 ;
            Z6270RecPrg3 = A6270RecPrg3 ;
            Z7764RecMaqNh = A7764RecMaqNh ;
            Z7765RecMaqVX = A7765RecMaqVX ;
            Z7766RecMaqBL = A7766RecMaqBL ;
            Z7767RecMaqFlow = A7767RecMaqFlow ;
            Z7768RecMaqRPM = A7768RecMaqRPM ;
            Z7769RecMaqMol = A7769RecMaqMol ;
            Z7770RecMaqTor = A7770RecMaqTor ;
            Z7771RecMaqCla = A7771RecMaqCla ;
            Z7772RecMaqTej = A7772RecMaqTej ;
            Z7773RecMaqDel = A7773RecMaqDel ;
            Z7774RecMaqPML = A7774RecMaqPML ;
            Z4259RecTotKgs = A4259RecTotKgs ;
            Z10124Rsedo1 = A10124Rsedo1 ;
            Z10125Rsedo2 = A10125Rsedo2 ;
            Z10126Rsedo3 = A10126Rsedo3 ;
            Z10127Rsedo4 = A10127Rsedo4 ;
            Z10128Rsedo5 = A10128Rsedo5 ;
            Z10129Rsedo6 = A10129Rsedo6 ;
            Z10385RecCAut = A10385RecCAut ;
            Z12270Rsedo7 = A12270Rsedo7 ;
            Z12271Rsedo8 = A12271Rsedo8 ;
            Z12272Rsedo9 = A12272Rsedo9 ;
            Z12273Rsedo10 = A12273Rsedo10 ;
            Z12274Rsedo11 = A12274Rsedo11 ;
            Z12900Rsedo12 = A12900Rsedo12 ;
            Z12901Rsedo13 = A12901Rsedo13 ;
            Z12902Rsedo14 = A12902Rsedo14 ;
            Z602MaqCod = A602MaqCod ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z2805RecVolPrd = A2805RecVolPrd ;
         Z2806RecFA = A2806RecFA ;
         Z1272UltLinPro = A1272UltLinPro ;
         Z4402RecUsrCod = A4402RecUsrCod ;
         Z4574RecFecPes = A4574RecFecPes ;
         Z4575RecMaqPes = A4575RecMaqPes ;
         Z5109RecNumInt = A5109RecNumInt ;
         Z5110RecNumPrg = A5110RecNumPrg ;
         Z5111RecBp12 = A5111RecBp12 ;
         Z5112RecBp13 = A5112RecBp13 ;
         Z5113RecBp14 = A5113RecBp14 ;
         Z5114RecBp15 = A5114RecBp15 ;
         Z5115RecAbsFac = A5115RecAbsFac ;
         Z4701RecRecep = A4701RecRecep ;
         Z4700RecEnvio = A4700RecEnvio ;
         Z6269RecPrg2 = A6269RecPrg2 ;
         Z6270RecPrg3 = A6270RecPrg3 ;
         Z7764RecMaqNh = A7764RecMaqNh ;
         Z7765RecMaqVX = A7765RecMaqVX ;
         Z7766RecMaqBL = A7766RecMaqBL ;
         Z7767RecMaqFlow = A7767RecMaqFlow ;
         Z7768RecMaqRPM = A7768RecMaqRPM ;
         Z7769RecMaqMol = A7769RecMaqMol ;
         Z7770RecMaqTor = A7770RecMaqTor ;
         Z7771RecMaqCla = A7771RecMaqCla ;
         Z7772RecMaqTej = A7772RecMaqTej ;
         Z7773RecMaqDel = A7773RecMaqDel ;
         Z7774RecMaqPML = A7774RecMaqPML ;
         Z8353RecMaqObs = A8353RecMaqObs ;
         Z4259RecTotKgs = A4259RecTotKgs ;
         Z10124Rsedo1 = A10124Rsedo1 ;
         Z10125Rsedo2 = A10125Rsedo2 ;
         Z10126Rsedo3 = A10126Rsedo3 ;
         Z10127Rsedo4 = A10127Rsedo4 ;
         Z10128Rsedo5 = A10128Rsedo5 ;
         Z10129Rsedo6 = A10129Rsedo6 ;
         Z10385RecCAut = A10385RecCAut ;
         Z12270Rsedo7 = A12270Rsedo7 ;
         Z12271Rsedo8 = A12271Rsedo8 ;
         Z12272Rsedo9 = A12272Rsedo9 ;
         Z12273Rsedo10 = A12273Rsedo10 ;
         Z12274Rsedo11 = A12274Rsedo11 ;
         Z12900Rsedo12 = A12900Rsedo12 ;
         Z12901Rsedo13 = A12901Rsedo13 ;
         Z12902Rsedo14 = A12902Rsedo14 ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z212BarSer = A212BarSer ;
         Z1652BarSerDsc = A1652BarSerDsc ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z218BarTipCol = A218BarTipCol ;
         Z1234BarNomCli = A1234BarNomCli ;
         Z1235BarNumCli = A1235BarNumCli ;
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

   public void load1QD408( )
   {
      /* Using cursor T01QD6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound408 = (short)(1) ;
         A8353RecMaqObs = T01QD6_A8353RecMaqObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8353RecMaqObs", A8353RecMaqObs);
         A212BarSer = T01QD6_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = T01QD6_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A135BarColNom = T01QD6_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01QD6_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T01QD6_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A1234BarNomCli = T01QD6_A1234BarNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A1235BarNumCli = T01QD6_A1235BarNumCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
         A2805RecVolPrd = T01QD6_A2805RecVolPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
         A2806RecFA = T01QD6_A2806RecFA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2806RecFA", GXutil.ltrimstr( A2806RecFA, 6, 2));
         A1272UltLinPro = T01QD6_A1272UltLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
         A4402RecUsrCod = T01QD6_A4402RecUsrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4402RecUsrCod", A4402RecUsrCod);
         A4574RecFecPes = T01QD6_A4574RecFecPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4574RecFecPes", localUtil.ttoc( A4574RecFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4575RecMaqPes = T01QD6_A4575RecMaqPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4575RecMaqPes", GXutil.str( A4575RecMaqPes, 1, 0));
         A5109RecNumInt = T01QD6_A5109RecNumInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5109RecNumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5109RecNumInt), 8, 0));
         A5110RecNumPrg = T01QD6_A5110RecNumPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5110RecNumPrg", A5110RecNumPrg);
         A5111RecBp12 = T01QD6_A5111RecBp12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5111RecBp12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5111RecBp12), 4, 0));
         A5112RecBp13 = T01QD6_A5112RecBp13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5112RecBp13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5112RecBp13), 4, 0));
         A5113RecBp14 = T01QD6_A5113RecBp14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5113RecBp14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5113RecBp14), 4, 0));
         A5114RecBp15 = T01QD6_A5114RecBp15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5114RecBp15", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5114RecBp15), 4, 0));
         A5115RecAbsFac = T01QD6_A5115RecAbsFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5115RecAbsFac", GXutil.ltrimstr( A5115RecAbsFac, 6, 2));
         A4701RecRecep = T01QD6_A4701RecRecep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4701RecRecep", GXutil.str( A4701RecRecep, 1, 0));
         A4700RecEnvio = T01QD6_A4700RecEnvio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4700RecEnvio", GXutil.str( A4700RecEnvio, 1, 0));
         A6269RecPrg2 = T01QD6_A6269RecPrg2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6269RecPrg2", A6269RecPrg2);
         A6270RecPrg3 = T01QD6_A6270RecPrg3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6270RecPrg3", A6270RecPrg3);
         A7764RecMaqNh = T01QD6_A7764RecMaqNh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7764RecMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7764RecMaqNh), 3, 0));
         A7765RecMaqVX = T01QD6_A7765RecMaqVX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7765RecMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7765RecMaqVX), 2, 0));
         A7766RecMaqBL = T01QD6_A7766RecMaqBL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7766RecMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7766RecMaqBL), 2, 0));
         A7767RecMaqFlow = T01QD6_A7767RecMaqFlow[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7767RecMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7767RecMaqFlow), 2, 0));
         A7768RecMaqRPM = T01QD6_A7768RecMaqRPM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7768RecMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7768RecMaqRPM), 4, 0));
         A7769RecMaqMol = T01QD6_A7769RecMaqMol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7769RecMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7769RecMaqMol), 3, 0));
         A7770RecMaqTor = T01QD6_A7770RecMaqTor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7770RecMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7770RecMaqTor), 3, 0));
         A7771RecMaqCla = T01QD6_A7771RecMaqCla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7771RecMaqCla", A7771RecMaqCla);
         A7772RecMaqTej = T01QD6_A7772RecMaqTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7772RecMaqTej", GXutil.str( A7772RecMaqTej, 1, 0));
         A7773RecMaqDel = T01QD6_A7773RecMaqDel[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7773RecMaqDel", GXutil.str( A7773RecMaqDel, 1, 0));
         A7774RecMaqPML = T01QD6_A7774RecMaqPML[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7774RecMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7774RecMaqPML), 3, 0));
         A4259RecTotKgs = T01QD6_A4259RecTotKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4259RecTotKgs", GXutil.ltrimstr( A4259RecTotKgs, 10, 2));
         A10124Rsedo1 = T01QD6_A10124Rsedo1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10124Rsedo1", GXutil.ltrimstr( A10124Rsedo1, 4, 1));
         A10125Rsedo2 = T01QD6_A10125Rsedo2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10125Rsedo2", GXutil.ltrimstr( A10125Rsedo2, 4, 1));
         A10126Rsedo3 = T01QD6_A10126Rsedo3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10126Rsedo3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10126Rsedo3), 3, 0));
         A10127Rsedo4 = T01QD6_A10127Rsedo4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10127Rsedo4", GXutil.ltrimstr( A10127Rsedo4, 4, 2));
         A10128Rsedo5 = T01QD6_A10128Rsedo5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10128Rsedo5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10128Rsedo5), 2, 0));
         A10129Rsedo6 = T01QD6_A10129Rsedo6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10129Rsedo6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10129Rsedo6), 2, 0));
         A10385RecCAut = T01QD6_A10385RecCAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10385RecCAut", GXutil.str( A10385RecCAut, 1, 0));
         A12270Rsedo7 = T01QD6_A12270Rsedo7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12270Rsedo7", GXutil.ltrimstr( A12270Rsedo7, 5, 1));
         A12271Rsedo8 = T01QD6_A12271Rsedo8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12271Rsedo8", GXutil.ltrimstr( A12271Rsedo8, 4, 1));
         A12272Rsedo9 = T01QD6_A12272Rsedo9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12272Rsedo9", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12272Rsedo9), 3, 0));
         A12273Rsedo10 = T01QD6_A12273Rsedo10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12273Rsedo10", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12273Rsedo10), 4, 0));
         A12274Rsedo11 = T01QD6_A12274Rsedo11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12274Rsedo11", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12274Rsedo11), 3, 0));
         A12900Rsedo12 = T01QD6_A12900Rsedo12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12900Rsedo12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12900Rsedo12), 4, 0));
         A12901Rsedo13 = T01QD6_A12901Rsedo13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12901Rsedo13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12901Rsedo13), 4, 0));
         A12902Rsedo14 = T01QD6_A12902Rsedo14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12902Rsedo14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12902Rsedo14), 6, 0));
         A602MaqCod = T01QD6_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         zm1QD408( -4) ;
      }
      pr_default.close(4);
      onLoadActions1QD408( ) ;
   }

   public void onLoadActions1QD408( )
   {
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      GXt_char1 = A14372RecHayAny ;
      GXv_char2[0] = GXt_char1 ;
      new app.formulaciontinte.hayanyadidas(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_char2) ;
      recmaq_impl.this.GXt_char1 = GXv_char2[0] ;
      A14372RecHayAny = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14372RecHayAny", A14372RecHayAny);
   }

   public void checkExtendedTable1QD408( )
   {
      nIsDirty_408 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QD4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01QD5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A212BarSer = T01QD5_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = T01QD5_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A135BarColNom = T01QD5_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01QD5_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T01QD5_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A1234BarNomCli = T01QD5_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A1235BarNumCli = T01QD5_A1235BarNumCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      pr_default.close(3);
      nIsDirty_408 = (short)(1) ;
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      nIsDirty_408 = (short)(1) ;
      GXt_char1 = A14372RecHayAny ;
      GXv_char2[0] = GXt_char1 ;
      new app.formulaciontinte.hayanyadidas(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_char2) ;
      recmaq_impl.this.GXt_char1 = GXv_char2[0] ;
      A14372RecHayAny = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14372RecHayAny", A14372RecHayAny);
      if ( ! ( ( ( A4575RecMaqPes >= 0 ) && ( A4575RecMaqPes <= 2 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Linea Maquina Pesada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "RECMAQPES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecMaqPes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1QD408( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         String A602MaqCod )
   {
      /* Using cursor T01QD7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_6( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01QD8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A212BarSer = T01QD8_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = T01QD8_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A135BarColNom = T01QD8_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01QD8_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T01QD8_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A1234BarNomCli = T01QD8_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A1235BarNumCli = T01QD8_A1235BarNumCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1652BarSerDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1234BarNomCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1QD408( )
   {
      /* Using cursor T01QD9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound408 = (short)(1) ;
      }
      else
      {
         RcdFound408 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QD408( 4) ;
         RcdFound408 = (short)(1) ;
         A8353RecMaqObs = T01QD3_A8353RecMaqObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8353RecMaqObs", A8353RecMaqObs);
         A2804RecLinMaq = T01QD3_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A2805RecVolPrd = T01QD3_A2805RecVolPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
         A2806RecFA = T01QD3_A2806RecFA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2806RecFA", GXutil.ltrimstr( A2806RecFA, 6, 2));
         A1272UltLinPro = T01QD3_A1272UltLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
         A4402RecUsrCod = T01QD3_A4402RecUsrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4402RecUsrCod", A4402RecUsrCod);
         A4574RecFecPes = T01QD3_A4574RecFecPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4574RecFecPes", localUtil.ttoc( A4574RecFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4575RecMaqPes = T01QD3_A4575RecMaqPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4575RecMaqPes", GXutil.str( A4575RecMaqPes, 1, 0));
         A5109RecNumInt = T01QD3_A5109RecNumInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5109RecNumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5109RecNumInt), 8, 0));
         A5110RecNumPrg = T01QD3_A5110RecNumPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5110RecNumPrg", A5110RecNumPrg);
         A5111RecBp12 = T01QD3_A5111RecBp12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5111RecBp12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5111RecBp12), 4, 0));
         A5112RecBp13 = T01QD3_A5112RecBp13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5112RecBp13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5112RecBp13), 4, 0));
         A5113RecBp14 = T01QD3_A5113RecBp14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5113RecBp14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5113RecBp14), 4, 0));
         A5114RecBp15 = T01QD3_A5114RecBp15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5114RecBp15", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5114RecBp15), 4, 0));
         A5115RecAbsFac = T01QD3_A5115RecAbsFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5115RecAbsFac", GXutil.ltrimstr( A5115RecAbsFac, 6, 2));
         A4701RecRecep = T01QD3_A4701RecRecep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4701RecRecep", GXutil.str( A4701RecRecep, 1, 0));
         A4700RecEnvio = T01QD3_A4700RecEnvio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4700RecEnvio", GXutil.str( A4700RecEnvio, 1, 0));
         A6269RecPrg2 = T01QD3_A6269RecPrg2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6269RecPrg2", A6269RecPrg2);
         A6270RecPrg3 = T01QD3_A6270RecPrg3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6270RecPrg3", A6270RecPrg3);
         A7764RecMaqNh = T01QD3_A7764RecMaqNh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7764RecMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7764RecMaqNh), 3, 0));
         A7765RecMaqVX = T01QD3_A7765RecMaqVX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7765RecMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7765RecMaqVX), 2, 0));
         A7766RecMaqBL = T01QD3_A7766RecMaqBL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7766RecMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7766RecMaqBL), 2, 0));
         A7767RecMaqFlow = T01QD3_A7767RecMaqFlow[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7767RecMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7767RecMaqFlow), 2, 0));
         A7768RecMaqRPM = T01QD3_A7768RecMaqRPM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7768RecMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7768RecMaqRPM), 4, 0));
         A7769RecMaqMol = T01QD3_A7769RecMaqMol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7769RecMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7769RecMaqMol), 3, 0));
         A7770RecMaqTor = T01QD3_A7770RecMaqTor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7770RecMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7770RecMaqTor), 3, 0));
         A7771RecMaqCla = T01QD3_A7771RecMaqCla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7771RecMaqCla", A7771RecMaqCla);
         A7772RecMaqTej = T01QD3_A7772RecMaqTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7772RecMaqTej", GXutil.str( A7772RecMaqTej, 1, 0));
         A7773RecMaqDel = T01QD3_A7773RecMaqDel[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7773RecMaqDel", GXutil.str( A7773RecMaqDel, 1, 0));
         A7774RecMaqPML = T01QD3_A7774RecMaqPML[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7774RecMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7774RecMaqPML), 3, 0));
         A4259RecTotKgs = T01QD3_A4259RecTotKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4259RecTotKgs", GXutil.ltrimstr( A4259RecTotKgs, 10, 2));
         A10124Rsedo1 = T01QD3_A10124Rsedo1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10124Rsedo1", GXutil.ltrimstr( A10124Rsedo1, 4, 1));
         A10125Rsedo2 = T01QD3_A10125Rsedo2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10125Rsedo2", GXutil.ltrimstr( A10125Rsedo2, 4, 1));
         A10126Rsedo3 = T01QD3_A10126Rsedo3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10126Rsedo3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10126Rsedo3), 3, 0));
         A10127Rsedo4 = T01QD3_A10127Rsedo4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10127Rsedo4", GXutil.ltrimstr( A10127Rsedo4, 4, 2));
         A10128Rsedo5 = T01QD3_A10128Rsedo5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10128Rsedo5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10128Rsedo5), 2, 0));
         A10129Rsedo6 = T01QD3_A10129Rsedo6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10129Rsedo6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10129Rsedo6), 2, 0));
         A10385RecCAut = T01QD3_A10385RecCAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10385RecCAut", GXutil.str( A10385RecCAut, 1, 0));
         A12270Rsedo7 = T01QD3_A12270Rsedo7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12270Rsedo7", GXutil.ltrimstr( A12270Rsedo7, 5, 1));
         A12271Rsedo8 = T01QD3_A12271Rsedo8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12271Rsedo8", GXutil.ltrimstr( A12271Rsedo8, 4, 1));
         A12272Rsedo9 = T01QD3_A12272Rsedo9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12272Rsedo9", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12272Rsedo9), 3, 0));
         A12273Rsedo10 = T01QD3_A12273Rsedo10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12273Rsedo10", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12273Rsedo10), 4, 0));
         A12274Rsedo11 = T01QD3_A12274Rsedo11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12274Rsedo11", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12274Rsedo11), 3, 0));
         A12900Rsedo12 = T01QD3_A12900Rsedo12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12900Rsedo12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12900Rsedo12), 4, 0));
         A12901Rsedo13 = T01QD3_A12901Rsedo13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12901Rsedo13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12901Rsedo13), 4, 0));
         A12902Rsedo14 = T01QD3_A12902Rsedo14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12902Rsedo14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12902Rsedo14), 6, 0));
         A396EmprCod = T01QD3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01QD3_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A129BarCod = T01QD3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01QD3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01QD3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         sMode408 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1QD408( ) ;
         if ( AnyError == 1 )
         {
            RcdFound408 = (short)(0) ;
            initializeNonKey1QD408( ) ;
         }
         Gx_mode = sMode408 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound408 = (short)(0) ;
         initializeNonKey1QD408( ) ;
         sMode408 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode408 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QD408( ) ;
      if ( RcdFound408 == 0 )
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
      RcdFound408 = (short)(0) ;
      /* Using cursor T01QD10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QD10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QD10_A129BarCod[0] < A129BarCod ) || ( T01QD10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QD10_A132BarCodReo[0] < A132BarCodReo ) || ( T01QD10_A132BarCodReo[0] == A132BarCodReo ) && ( T01QD10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QD10_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01QD10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QD10_A132BarCodReo[0] == A132BarCodReo ) && ( T01QD10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QD10_A2804RecLinMaq[0] < A2804RecLinMaq ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QD10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QD10_A129BarCod[0] > A129BarCod ) || ( T01QD10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QD10_A132BarCodReo[0] > A132BarCodReo ) || ( T01QD10_A132BarCodReo[0] == A132BarCodReo ) && ( T01QD10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QD10_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01QD10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QD10_A132BarCodReo[0] == A132BarCodReo ) && ( T01QD10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QD10_A2804RecLinMaq[0] > A2804RecLinMaq ) ) )
         {
            A396EmprCod = T01QD10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01QD10_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01QD10_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01QD10_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2804RecLinMaq = T01QD10_A2804RecLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            RcdFound408 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound408 = (short)(0) ;
      /* Using cursor T01QD11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QD11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QD11_A129BarCod[0] > A129BarCod ) || ( T01QD11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QD11_A132BarCodReo[0] > A132BarCodReo ) || ( T01QD11_A132BarCodReo[0] == A132BarCodReo ) && ( T01QD11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QD11_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01QD11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QD11_A132BarCodReo[0] == A132BarCodReo ) && ( T01QD11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QD11_A2804RecLinMaq[0] > A2804RecLinMaq ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QD11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QD11_A129BarCod[0] < A129BarCod ) || ( T01QD11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QD11_A132BarCodReo[0] < A132BarCodReo ) || ( T01QD11_A132BarCodReo[0] == A132BarCodReo ) && ( T01QD11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QD11_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01QD11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QD11_A132BarCodReo[0] == A132BarCodReo ) && ( T01QD11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QD11_A2804RecLinMaq[0] < A2804RecLinMaq ) ) )
         {
            A396EmprCod = T01QD11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01QD11_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01QD11_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01QD11_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2804RecLinMaq = T01QD11_A2804RecLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            RcdFound408 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QD408( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QD408( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound408 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2804RecLinMaq = Z2804RecLinMaq ;
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
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
               update1QD408( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QD408( ) ;
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
                  insert1QD408( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = Z2804RecLinMaq ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
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
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1QD408( ) ;
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QD408( ) ;
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
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqCod_Internalname ;
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
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqCod_Internalname ;
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
      scanStart1QD408( ) ;
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound408 != 0 )
         {
            scanNext1QD408( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QD408( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1QD408( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECMAQ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z2805RecVolPrd != T01QD2_A2805RecVolPrd[0] ) || ( DecimalUtil.compareTo(Z2806RecFA, T01QD2_A2806RecFA[0]) != 0 ) || ( Z1272UltLinPro != T01QD2_A1272UltLinPro[0] ) || ( GXutil.strcmp(Z4402RecUsrCod, T01QD2_A4402RecUsrCod[0]) != 0 ) || !( GXutil.dateCompare(Z4574RecFecPes, T01QD2_A4574RecFecPes[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4575RecMaqPes != T01QD2_A4575RecMaqPes[0] ) || ( Z5109RecNumInt != T01QD2_A5109RecNumInt[0] ) || ( GXutil.strcmp(Z5110RecNumPrg, T01QD2_A5110RecNumPrg[0]) != 0 ) || ( Z5111RecBp12 != T01QD2_A5111RecBp12[0] ) || ( Z5112RecBp13 != T01QD2_A5112RecBp13[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5113RecBp14 != T01QD2_A5113RecBp14[0] ) || ( Z5114RecBp15 != T01QD2_A5114RecBp15[0] ) || ( DecimalUtil.compareTo(Z5115RecAbsFac, T01QD2_A5115RecAbsFac[0]) != 0 ) || ( Z4701RecRecep != T01QD2_A4701RecRecep[0] ) || ( Z4700RecEnvio != T01QD2_A4700RecEnvio[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6269RecPrg2, T01QD2_A6269RecPrg2[0]) != 0 ) || ( GXutil.strcmp(Z6270RecPrg3, T01QD2_A6270RecPrg3[0]) != 0 ) || ( Z7764RecMaqNh != T01QD2_A7764RecMaqNh[0] ) || ( Z7765RecMaqVX != T01QD2_A7765RecMaqVX[0] ) || ( Z7766RecMaqBL != T01QD2_A7766RecMaqBL[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7767RecMaqFlow != T01QD2_A7767RecMaqFlow[0] ) || ( Z7768RecMaqRPM != T01QD2_A7768RecMaqRPM[0] ) || ( Z7769RecMaqMol != T01QD2_A7769RecMaqMol[0] ) || ( Z7770RecMaqTor != T01QD2_A7770RecMaqTor[0] ) || ( GXutil.strcmp(Z7771RecMaqCla, T01QD2_A7771RecMaqCla[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7772RecMaqTej != T01QD2_A7772RecMaqTej[0] ) || ( Z7773RecMaqDel != T01QD2_A7773RecMaqDel[0] ) || ( Z7774RecMaqPML != T01QD2_A7774RecMaqPML[0] ) || ( DecimalUtil.compareTo(Z4259RecTotKgs, T01QD2_A4259RecTotKgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z10124Rsedo1, T01QD2_A10124Rsedo1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10125Rsedo2, T01QD2_A10125Rsedo2[0]) != 0 ) || ( Z10126Rsedo3 != T01QD2_A10126Rsedo3[0] ) || ( DecimalUtil.compareTo(Z10127Rsedo4, T01QD2_A10127Rsedo4[0]) != 0 ) || ( Z10128Rsedo5 != T01QD2_A10128Rsedo5[0] ) || ( Z10129Rsedo6 != T01QD2_A10129Rsedo6[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10385RecCAut != T01QD2_A10385RecCAut[0] ) || ( DecimalUtil.compareTo(Z12270Rsedo7, T01QD2_A12270Rsedo7[0]) != 0 ) || ( DecimalUtil.compareTo(Z12271Rsedo8, T01QD2_A12271Rsedo8[0]) != 0 ) || ( Z12272Rsedo9 != T01QD2_A12272Rsedo9[0] ) || ( Z12273Rsedo10 != T01QD2_A12273Rsedo10[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12274Rsedo11 != T01QD2_A12274Rsedo11[0] ) || ( Z12900Rsedo12 != T01QD2_A12900Rsedo12[0] ) || ( Z12901Rsedo13 != T01QD2_A12901Rsedo13[0] ) || ( Z12902Rsedo14 != T01QD2_A12902Rsedo14[0] ) || ( GXutil.strcmp(Z602MaqCod, T01QD2_A602MaqCod[0]) != 0 ) )
         {
            if ( Z2805RecVolPrd != T01QD2_A2805RecVolPrd[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecVolPrd");
               GXutil.writeLogRaw("Old: ",Z2805RecVolPrd);
               GXutil.writeLogRaw("Current: ",T01QD2_A2805RecVolPrd[0]);
            }
            if ( DecimalUtil.compareTo(Z2806RecFA, T01QD2_A2806RecFA[0]) != 0 )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecFA");
               GXutil.writeLogRaw("Old: ",Z2806RecFA);
               GXutil.writeLogRaw("Current: ",T01QD2_A2806RecFA[0]);
            }
            if ( Z1272UltLinPro != T01QD2_A1272UltLinPro[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"UltLinPro");
               GXutil.writeLogRaw("Old: ",Z1272UltLinPro);
               GXutil.writeLogRaw("Current: ",T01QD2_A1272UltLinPro[0]);
            }
            if ( GXutil.strcmp(Z4402RecUsrCod, T01QD2_A4402RecUsrCod[0]) != 0 )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecUsrCod");
               GXutil.writeLogRaw("Old: ",Z4402RecUsrCod);
               GXutil.writeLogRaw("Current: ",T01QD2_A4402RecUsrCod[0]);
            }
            if ( !( GXutil.dateCompare(Z4574RecFecPes, T01QD2_A4574RecFecPes[0]) ) )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecFecPes");
               GXutil.writeLogRaw("Old: ",Z4574RecFecPes);
               GXutil.writeLogRaw("Current: ",T01QD2_A4574RecFecPes[0]);
            }
            if ( Z4575RecMaqPes != T01QD2_A4575RecMaqPes[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecMaqPes");
               GXutil.writeLogRaw("Old: ",Z4575RecMaqPes);
               GXutil.writeLogRaw("Current: ",T01QD2_A4575RecMaqPes[0]);
            }
            if ( Z5109RecNumInt != T01QD2_A5109RecNumInt[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecNumInt");
               GXutil.writeLogRaw("Old: ",Z5109RecNumInt);
               GXutil.writeLogRaw("Current: ",T01QD2_A5109RecNumInt[0]);
            }
            if ( GXutil.strcmp(Z5110RecNumPrg, T01QD2_A5110RecNumPrg[0]) != 0 )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecNumPrg");
               GXutil.writeLogRaw("Old: ",Z5110RecNumPrg);
               GXutil.writeLogRaw("Current: ",T01QD2_A5110RecNumPrg[0]);
            }
            if ( Z5111RecBp12 != T01QD2_A5111RecBp12[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecBp12");
               GXutil.writeLogRaw("Old: ",Z5111RecBp12);
               GXutil.writeLogRaw("Current: ",T01QD2_A5111RecBp12[0]);
            }
            if ( Z5112RecBp13 != T01QD2_A5112RecBp13[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecBp13");
               GXutil.writeLogRaw("Old: ",Z5112RecBp13);
               GXutil.writeLogRaw("Current: ",T01QD2_A5112RecBp13[0]);
            }
            if ( Z5113RecBp14 != T01QD2_A5113RecBp14[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecBp14");
               GXutil.writeLogRaw("Old: ",Z5113RecBp14);
               GXutil.writeLogRaw("Current: ",T01QD2_A5113RecBp14[0]);
            }
            if ( Z5114RecBp15 != T01QD2_A5114RecBp15[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecBp15");
               GXutil.writeLogRaw("Old: ",Z5114RecBp15);
               GXutil.writeLogRaw("Current: ",T01QD2_A5114RecBp15[0]);
            }
            if ( DecimalUtil.compareTo(Z5115RecAbsFac, T01QD2_A5115RecAbsFac[0]) != 0 )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecAbsFac");
               GXutil.writeLogRaw("Old: ",Z5115RecAbsFac);
               GXutil.writeLogRaw("Current: ",T01QD2_A5115RecAbsFac[0]);
            }
            if ( Z4701RecRecep != T01QD2_A4701RecRecep[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecRecep");
               GXutil.writeLogRaw("Old: ",Z4701RecRecep);
               GXutil.writeLogRaw("Current: ",T01QD2_A4701RecRecep[0]);
            }
            if ( Z4700RecEnvio != T01QD2_A4700RecEnvio[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecEnvio");
               GXutil.writeLogRaw("Old: ",Z4700RecEnvio);
               GXutil.writeLogRaw("Current: ",T01QD2_A4700RecEnvio[0]);
            }
            if ( GXutil.strcmp(Z6269RecPrg2, T01QD2_A6269RecPrg2[0]) != 0 )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecPrg2");
               GXutil.writeLogRaw("Old: ",Z6269RecPrg2);
               GXutil.writeLogRaw("Current: ",T01QD2_A6269RecPrg2[0]);
            }
            if ( GXutil.strcmp(Z6270RecPrg3, T01QD2_A6270RecPrg3[0]) != 0 )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecPrg3");
               GXutil.writeLogRaw("Old: ",Z6270RecPrg3);
               GXutil.writeLogRaw("Current: ",T01QD2_A6270RecPrg3[0]);
            }
            if ( Z7764RecMaqNh != T01QD2_A7764RecMaqNh[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecMaqNh");
               GXutil.writeLogRaw("Old: ",Z7764RecMaqNh);
               GXutil.writeLogRaw("Current: ",T01QD2_A7764RecMaqNh[0]);
            }
            if ( Z7765RecMaqVX != T01QD2_A7765RecMaqVX[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecMaqVX");
               GXutil.writeLogRaw("Old: ",Z7765RecMaqVX);
               GXutil.writeLogRaw("Current: ",T01QD2_A7765RecMaqVX[0]);
            }
            if ( Z7766RecMaqBL != T01QD2_A7766RecMaqBL[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecMaqBL");
               GXutil.writeLogRaw("Old: ",Z7766RecMaqBL);
               GXutil.writeLogRaw("Current: ",T01QD2_A7766RecMaqBL[0]);
            }
            if ( Z7767RecMaqFlow != T01QD2_A7767RecMaqFlow[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecMaqFlow");
               GXutil.writeLogRaw("Old: ",Z7767RecMaqFlow);
               GXutil.writeLogRaw("Current: ",T01QD2_A7767RecMaqFlow[0]);
            }
            if ( Z7768RecMaqRPM != T01QD2_A7768RecMaqRPM[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecMaqRPM");
               GXutil.writeLogRaw("Old: ",Z7768RecMaqRPM);
               GXutil.writeLogRaw("Current: ",T01QD2_A7768RecMaqRPM[0]);
            }
            if ( Z7769RecMaqMol != T01QD2_A7769RecMaqMol[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecMaqMol");
               GXutil.writeLogRaw("Old: ",Z7769RecMaqMol);
               GXutil.writeLogRaw("Current: ",T01QD2_A7769RecMaqMol[0]);
            }
            if ( Z7770RecMaqTor != T01QD2_A7770RecMaqTor[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecMaqTor");
               GXutil.writeLogRaw("Old: ",Z7770RecMaqTor);
               GXutil.writeLogRaw("Current: ",T01QD2_A7770RecMaqTor[0]);
            }
            if ( GXutil.strcmp(Z7771RecMaqCla, T01QD2_A7771RecMaqCla[0]) != 0 )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecMaqCla");
               GXutil.writeLogRaw("Old: ",Z7771RecMaqCla);
               GXutil.writeLogRaw("Current: ",T01QD2_A7771RecMaqCla[0]);
            }
            if ( Z7772RecMaqTej != T01QD2_A7772RecMaqTej[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecMaqTej");
               GXutil.writeLogRaw("Old: ",Z7772RecMaqTej);
               GXutil.writeLogRaw("Current: ",T01QD2_A7772RecMaqTej[0]);
            }
            if ( Z7773RecMaqDel != T01QD2_A7773RecMaqDel[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecMaqDel");
               GXutil.writeLogRaw("Old: ",Z7773RecMaqDel);
               GXutil.writeLogRaw("Current: ",T01QD2_A7773RecMaqDel[0]);
            }
            if ( Z7774RecMaqPML != T01QD2_A7774RecMaqPML[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecMaqPML");
               GXutil.writeLogRaw("Old: ",Z7774RecMaqPML);
               GXutil.writeLogRaw("Current: ",T01QD2_A7774RecMaqPML[0]);
            }
            if ( DecimalUtil.compareTo(Z4259RecTotKgs, T01QD2_A4259RecTotKgs[0]) != 0 )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecTotKgs");
               GXutil.writeLogRaw("Old: ",Z4259RecTotKgs);
               GXutil.writeLogRaw("Current: ",T01QD2_A4259RecTotKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z10124Rsedo1, T01QD2_A10124Rsedo1[0]) != 0 )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"Rsedo1");
               GXutil.writeLogRaw("Old: ",Z10124Rsedo1);
               GXutil.writeLogRaw("Current: ",T01QD2_A10124Rsedo1[0]);
            }
            if ( DecimalUtil.compareTo(Z10125Rsedo2, T01QD2_A10125Rsedo2[0]) != 0 )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"Rsedo2");
               GXutil.writeLogRaw("Old: ",Z10125Rsedo2);
               GXutil.writeLogRaw("Current: ",T01QD2_A10125Rsedo2[0]);
            }
            if ( Z10126Rsedo3 != T01QD2_A10126Rsedo3[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"Rsedo3");
               GXutil.writeLogRaw("Old: ",Z10126Rsedo3);
               GXutil.writeLogRaw("Current: ",T01QD2_A10126Rsedo3[0]);
            }
            if ( DecimalUtil.compareTo(Z10127Rsedo4, T01QD2_A10127Rsedo4[0]) != 0 )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"Rsedo4");
               GXutil.writeLogRaw("Old: ",Z10127Rsedo4);
               GXutil.writeLogRaw("Current: ",T01QD2_A10127Rsedo4[0]);
            }
            if ( Z10128Rsedo5 != T01QD2_A10128Rsedo5[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"Rsedo5");
               GXutil.writeLogRaw("Old: ",Z10128Rsedo5);
               GXutil.writeLogRaw("Current: ",T01QD2_A10128Rsedo5[0]);
            }
            if ( Z10129Rsedo6 != T01QD2_A10129Rsedo6[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"Rsedo6");
               GXutil.writeLogRaw("Old: ",Z10129Rsedo6);
               GXutil.writeLogRaw("Current: ",T01QD2_A10129Rsedo6[0]);
            }
            if ( Z10385RecCAut != T01QD2_A10385RecCAut[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"RecCAut");
               GXutil.writeLogRaw("Old: ",Z10385RecCAut);
               GXutil.writeLogRaw("Current: ",T01QD2_A10385RecCAut[0]);
            }
            if ( DecimalUtil.compareTo(Z12270Rsedo7, T01QD2_A12270Rsedo7[0]) != 0 )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"Rsedo7");
               GXutil.writeLogRaw("Old: ",Z12270Rsedo7);
               GXutil.writeLogRaw("Current: ",T01QD2_A12270Rsedo7[0]);
            }
            if ( DecimalUtil.compareTo(Z12271Rsedo8, T01QD2_A12271Rsedo8[0]) != 0 )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"Rsedo8");
               GXutil.writeLogRaw("Old: ",Z12271Rsedo8);
               GXutil.writeLogRaw("Current: ",T01QD2_A12271Rsedo8[0]);
            }
            if ( Z12272Rsedo9 != T01QD2_A12272Rsedo9[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"Rsedo9");
               GXutil.writeLogRaw("Old: ",Z12272Rsedo9);
               GXutil.writeLogRaw("Current: ",T01QD2_A12272Rsedo9[0]);
            }
            if ( Z12273Rsedo10 != T01QD2_A12273Rsedo10[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"Rsedo10");
               GXutil.writeLogRaw("Old: ",Z12273Rsedo10);
               GXutil.writeLogRaw("Current: ",T01QD2_A12273Rsedo10[0]);
            }
            if ( Z12274Rsedo11 != T01QD2_A12274Rsedo11[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"Rsedo11");
               GXutil.writeLogRaw("Old: ",Z12274Rsedo11);
               GXutil.writeLogRaw("Current: ",T01QD2_A12274Rsedo11[0]);
            }
            if ( Z12900Rsedo12 != T01QD2_A12900Rsedo12[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"Rsedo12");
               GXutil.writeLogRaw("Old: ",Z12900Rsedo12);
               GXutil.writeLogRaw("Current: ",T01QD2_A12900Rsedo12[0]);
            }
            if ( Z12901Rsedo13 != T01QD2_A12901Rsedo13[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"Rsedo13");
               GXutil.writeLogRaw("Old: ",Z12901Rsedo13);
               GXutil.writeLogRaw("Current: ",T01QD2_A12901Rsedo13[0]);
            }
            if ( Z12902Rsedo14 != T01QD2_A12902Rsedo14[0] )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"Rsedo14");
               GXutil.writeLogRaw("Old: ",Z12902Rsedo14);
               GXutil.writeLogRaw("Current: ",T01QD2_A12902Rsedo14[0]);
            }
            if ( GXutil.strcmp(Z602MaqCod, T01QD2_A602MaqCod[0]) != 0 )
            {
               GXutil.writeLogln("recmaq:[seudo value changed for attri]"+"MaqCod");
               GXutil.writeLogRaw("Old: ",Z602MaqCod);
               GXutil.writeLogRaw("Current: ",T01QD2_A602MaqCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRECMAQ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QD408( )
   {
      beforeValidate1QD408( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QD408( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QD408( 0) ;
         checkOptimisticConcurrency1QD408( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QD408( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QD408( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QD12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A2804RecLinMaq), Integer.valueOf(A2805RecVolPrd), A2806RecFA, Byte.valueOf(A1272UltLinPro), A4402RecUsrCod, A4574RecFecPes, Byte.valueOf(A4575RecMaqPes), Integer.valueOf(A5109RecNumInt), A5110RecNumPrg, Short.valueOf(A5111RecBp12), Short.valueOf(A5112RecBp13), Short.valueOf(A5113RecBp14), Short.valueOf(A5114RecBp15), A5115RecAbsFac, Byte.valueOf(A4701RecRecep), Byte.valueOf(A4700RecEnvio), A6269RecPrg2, A6270RecPrg3, Short.valueOf(A7764RecMaqNh), Byte.valueOf(A7765RecMaqVX), Byte.valueOf(A7766RecMaqBL), Byte.valueOf(A7767RecMaqFlow), Short.valueOf(A7768RecMaqRPM), Short.valueOf(A7769RecMaqMol), Short.valueOf(A7770RecMaqTor), A7771RecMaqCla, Byte.valueOf(A7772RecMaqTej), Byte.valueOf(A7773RecMaqDel), Short.valueOf(A7774RecMaqPML), A8353RecMaqObs, A4259RecTotKgs, A10124Rsedo1, A10125Rsedo2, Short.valueOf(A10126Rsedo3), A10127Rsedo4, Byte.valueOf(A10128Rsedo5), Byte.valueOf(A10129Rsedo6), Byte.valueOf(A10385RecCAut), A12270Rsedo7, A12271Rsedo8, Short.valueOf(A12272Rsedo9), Short.valueOf(A12273Rsedo10), Short.valueOf(A12274Rsedo11), Short.valueOf(A12900Rsedo12), Short.valueOf(A12901Rsedo13), Integer.valueOf(A12902Rsedo14), A396EmprCod, A602MaqCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
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
                        resetCaption1QD0( ) ;
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
            load1QD408( ) ;
         }
         endLevel1QD408( ) ;
      }
      closeExtendedTableCursors1QD408( ) ;
   }

   public void update1QD408( )
   {
      beforeValidate1QD408( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QD408( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QD408( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QD408( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QD408( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QD13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A2805RecVolPrd), A2806RecFA, Byte.valueOf(A1272UltLinPro), A4402RecUsrCod, A4574RecFecPes, Byte.valueOf(A4575RecMaqPes), Integer.valueOf(A5109RecNumInt), A5110RecNumPrg, Short.valueOf(A5111RecBp12), Short.valueOf(A5112RecBp13), Short.valueOf(A5113RecBp14), Short.valueOf(A5114RecBp15), A5115RecAbsFac, Byte.valueOf(A4701RecRecep), Byte.valueOf(A4700RecEnvio), A6269RecPrg2, A6270RecPrg3, Short.valueOf(A7764RecMaqNh), Byte.valueOf(A7765RecMaqVX), Byte.valueOf(A7766RecMaqBL), Byte.valueOf(A7767RecMaqFlow), Short.valueOf(A7768RecMaqRPM), Short.valueOf(A7769RecMaqMol), Short.valueOf(A7770RecMaqTor), A7771RecMaqCla, Byte.valueOf(A7772RecMaqTej), Byte.valueOf(A7773RecMaqDel), Short.valueOf(A7774RecMaqPML), A8353RecMaqObs, A4259RecTotKgs, A10124Rsedo1, A10125Rsedo2, Short.valueOf(A10126Rsedo3), A10127Rsedo4, Byte.valueOf(A10128Rsedo5), Byte.valueOf(A10129Rsedo6), Byte.valueOf(A10385RecCAut), A12270Rsedo7, A12271Rsedo8, Short.valueOf(A12272Rsedo9), Short.valueOf(A12273Rsedo10), Short.valueOf(A12274Rsedo11), Short.valueOf(A12900Rsedo12), Short.valueOf(A12901Rsedo13), Integer.valueOf(A12902Rsedo14), A602MaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECMAQ"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QD408( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1QD0( ) ;
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
         endLevel1QD408( ) ;
      }
      closeExtendedTableCursors1QD408( ) ;
   }

   public void deferredUpdate1QD408( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QD408( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QD408( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QD408( ) ;
         afterConfirm1QD408( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QD408( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QD14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound408 == 0 )
                     {
                        initAll1QD408( ) ;
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
                     resetCaption1QD0( ) ;
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
      sMode408 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QD408( ) ;
      Gx_mode = sMode408 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QD408( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01QD15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A212BarSer = T01QD15_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = T01QD15_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A135BarColNom = T01QD15_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01QD15_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T01QD15_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A1234BarNomCli = T01QD15_A1234BarNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A1235BarNumCli = T01QD15_A1235BarNumCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
         pr_default.close(13);
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
         GXt_char1 = A14372RecHayAny ;
         GXv_char2[0] = GXt_char1 ;
         new app.formulaciontinte.hayanyadidas(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_char2) ;
         recmaq_impl.this.GXt_char1 = GXv_char2[0] ;
         A14372RecHayAny = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14372RecHayAny", A14372RecHayAny);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01QD16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01QD17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01QD18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECFAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01QD19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void endLevel1QD408( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QD408( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "recmaq");
         if ( AnyError == 0 )
         {
            confirmValues1QD0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "recmaq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QD408( )
   {
      /* Using cursor T01QD20 */
      pr_default.execute(18);
      RcdFound408 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound408 = (short)(1) ;
         A396EmprCod = T01QD20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01QD20_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01QD20_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01QD20_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T01QD20_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QD408( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound408 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound408 = (short)(1) ;
         A396EmprCod = T01QD20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01QD20_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01QD20_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01QD20_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T01QD20_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      }
   }

   public void scanEnd1QD408( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1QD408( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QD408( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QD408( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QD408( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QD408( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QD408( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QD408( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarNHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtBarNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Enabled), 5, 0), true);
      edtBarNumCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumCli_Enabled), 5, 0), true);
      edtRecLinMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtRecVolPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecVolPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecVolPrd_Enabled), 5, 0), true);
      edtRecFA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFA_Enabled), 5, 0), true);
      edtUltLinPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltLinPro_Enabled), 5, 0), true);
      edtRecUsrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUsrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUsrCod_Enabled), 5, 0), true);
      edtRecFecPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFecPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecPes_Enabled), 5, 0), true);
      edtRecMaqPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqPes_Enabled), 5, 0), true);
      edtRecNumInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecNumInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecNumInt_Enabled), 5, 0), true);
      edtRecNumPrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecNumPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecNumPrg_Enabled), 5, 0), true);
      edtRecBp12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecBp12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecBp12_Enabled), 5, 0), true);
      edtRecBp13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecBp13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecBp13_Enabled), 5, 0), true);
      edtRecBp14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecBp14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecBp14_Enabled), 5, 0), true);
      edtRecBp15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecBp15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecBp15_Enabled), 5, 0), true);
      edtRecAbsFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecAbsFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecAbsFac_Enabled), 5, 0), true);
      edtRecRecep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecRecep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecRecep_Enabled), 5, 0), true);
      edtRecEnvio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecEnvio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEnvio_Enabled), 5, 0), true);
      edtRecPrg2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrg2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrg2_Enabled), 5, 0), true);
      edtRecPrg3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrg3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrg3_Enabled), 5, 0), true);
      edtRecMaqNh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqNh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqNh_Enabled), 5, 0), true);
      edtRecMaqVX_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqVX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqVX_Enabled), 5, 0), true);
      edtRecMaqBL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqBL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqBL_Enabled), 5, 0), true);
      edtRecMaqFlow_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqFlow_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqFlow_Enabled), 5, 0), true);
      edtRecMaqRPM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqRPM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqRPM_Enabled), 5, 0), true);
      edtRecMaqMol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqMol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqMol_Enabled), 5, 0), true);
      edtRecMaqTor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqTor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqTor_Enabled), 5, 0), true);
      edtRecMaqCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqCla_Enabled), 5, 0), true);
      edtRecMaqTej_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqTej_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqTej_Enabled), 5, 0), true);
      edtRecMaqDel_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqDel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqDel_Enabled), 5, 0), true);
      edtRecMaqPML_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqPML_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqPML_Enabled), 5, 0), true);
      edtRecMaqObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqObs_Enabled), 5, 0), true);
      edtRecTotKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecTotKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecTotKgs_Enabled), 5, 0), true);
      edtRsedo1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRsedo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRsedo1_Enabled), 5, 0), true);
      edtRsedo2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRsedo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRsedo2_Enabled), 5, 0), true);
      edtRsedo3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRsedo3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRsedo3_Enabled), 5, 0), true);
      edtRsedo4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRsedo4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRsedo4_Enabled), 5, 0), true);
      edtRsedo5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRsedo5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRsedo5_Enabled), 5, 0), true);
      edtRsedo6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRsedo6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRsedo6_Enabled), 5, 0), true);
      edtRecCAut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecCAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecCAut_Enabled), 5, 0), true);
      edtRsedo7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRsedo7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRsedo7_Enabled), 5, 0), true);
      edtRsedo8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRsedo8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRsedo8_Enabled), 5, 0), true);
      edtRsedo9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRsedo9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRsedo9_Enabled), 5, 0), true);
      edtRsedo10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRsedo10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRsedo10_Enabled), 5, 0), true);
      edtRsedo11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRsedo11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRsedo11_Enabled), 5, 0), true);
      edtRsedo12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRsedo12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRsedo12_Enabled), 5, 0), true);
      edtRsedo13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRsedo13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRsedo13_Enabled), 5, 0), true);
      edtRsedo14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRsedo14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRsedo14_Enabled), 5, 0), true);
      edtRecHayAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecHayAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecHayAny_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QD408( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QD0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recmaq", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2804RecLinMaq", GXutil.ltrim( localUtil.ntoc( Z2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2805RecVolPrd", GXutil.ltrim( localUtil.ntoc( Z2805RecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2806RecFA", GXutil.ltrim( localUtil.ntoc( Z2806RecFA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1272UltLinPro", GXutil.ltrim( localUtil.ntoc( Z1272UltLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4402RecUsrCod", GXutil.rtrim( Z4402RecUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4574RecFecPes", localUtil.ttoc( Z4574RecFecPes, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4575RecMaqPes", GXutil.ltrim( localUtil.ntoc( Z4575RecMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5109RecNumInt", GXutil.ltrim( localUtil.ntoc( Z5109RecNumInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5110RecNumPrg", GXutil.rtrim( Z5110RecNumPrg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5111RecBp12", GXutil.ltrim( localUtil.ntoc( Z5111RecBp12, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5112RecBp13", GXutil.ltrim( localUtil.ntoc( Z5112RecBp13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5113RecBp14", GXutil.ltrim( localUtil.ntoc( Z5113RecBp14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5114RecBp15", GXutil.ltrim( localUtil.ntoc( Z5114RecBp15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5115RecAbsFac", GXutil.ltrim( localUtil.ntoc( Z5115RecAbsFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4701RecRecep", GXutil.ltrim( localUtil.ntoc( Z4701RecRecep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4700RecEnvio", GXutil.ltrim( localUtil.ntoc( Z4700RecEnvio, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6269RecPrg2", GXutil.rtrim( Z6269RecPrg2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6270RecPrg3", GXutil.rtrim( Z6270RecPrg3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7764RecMaqNh", GXutil.ltrim( localUtil.ntoc( Z7764RecMaqNh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7765RecMaqVX", GXutil.ltrim( localUtil.ntoc( Z7765RecMaqVX, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7766RecMaqBL", GXutil.ltrim( localUtil.ntoc( Z7766RecMaqBL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7767RecMaqFlow", GXutil.ltrim( localUtil.ntoc( Z7767RecMaqFlow, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7768RecMaqRPM", GXutil.ltrim( localUtil.ntoc( Z7768RecMaqRPM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7769RecMaqMol", GXutil.ltrim( localUtil.ntoc( Z7769RecMaqMol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7770RecMaqTor", GXutil.ltrim( localUtil.ntoc( Z7770RecMaqTor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7771RecMaqCla", GXutil.rtrim( Z7771RecMaqCla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7772RecMaqTej", GXutil.ltrim( localUtil.ntoc( Z7772RecMaqTej, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7773RecMaqDel", GXutil.ltrim( localUtil.ntoc( Z7773RecMaqDel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7774RecMaqPML", GXutil.ltrim( localUtil.ntoc( Z7774RecMaqPML, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4259RecTotKgs", GXutil.ltrim( localUtil.ntoc( Z4259RecTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10124Rsedo1", GXutil.ltrim( localUtil.ntoc( Z10124Rsedo1, (byte)(4), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10125Rsedo2", GXutil.ltrim( localUtil.ntoc( Z10125Rsedo2, (byte)(4), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10126Rsedo3", GXutil.ltrim( localUtil.ntoc( Z10126Rsedo3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10127Rsedo4", GXutil.ltrim( localUtil.ntoc( Z10127Rsedo4, (byte)(4), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10128Rsedo5", GXutil.ltrim( localUtil.ntoc( Z10128Rsedo5, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10129Rsedo6", GXutil.ltrim( localUtil.ntoc( Z10129Rsedo6, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10385RecCAut", GXutil.ltrim( localUtil.ntoc( Z10385RecCAut, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12270Rsedo7", GXutil.ltrim( localUtil.ntoc( Z12270Rsedo7, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12271Rsedo8", GXutil.ltrim( localUtil.ntoc( Z12271Rsedo8, (byte)(4), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12272Rsedo9", GXutil.ltrim( localUtil.ntoc( Z12272Rsedo9, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12273Rsedo10", GXutil.ltrim( localUtil.ntoc( Z12273Rsedo10, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12274Rsedo11", GXutil.ltrim( localUtil.ntoc( Z12274Rsedo11, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12900Rsedo12", GXutil.ltrim( localUtil.ntoc( Z12900Rsedo12, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12901Rsedo13", GXutil.ltrim( localUtil.ntoc( Z12901Rsedo13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12902Rsedo14", GXutil.ltrim( localUtil.ntoc( Z12902Rsedo14, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
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
      return formatLink("app.recmaq", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "RECMAQ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla RECMAQ", "") ;
   }

   public void initializeNonKey1QD408( )
   {
      A13696BarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      A14372RecHayAny = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14372RecHayAny", A14372RecHayAny);
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A1234BarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A1235BarNumCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      A602MaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A2805RecVolPrd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
      A2806RecFA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2806RecFA", GXutil.ltrimstr( A2806RecFA, 6, 2));
      A1272UltLinPro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
      A4402RecUsrCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4402RecUsrCod", A4402RecUsrCod);
      A4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A4574RecFecPes", localUtil.ttoc( A4574RecFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A4575RecMaqPes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4575RecMaqPes", GXutil.str( A4575RecMaqPes, 1, 0));
      A5109RecNumInt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5109RecNumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5109RecNumInt), 8, 0));
      A5110RecNumPrg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5110RecNumPrg", A5110RecNumPrg);
      A5111RecBp12 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5111RecBp12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5111RecBp12), 4, 0));
      A5112RecBp13 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5112RecBp13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5112RecBp13), 4, 0));
      A5113RecBp14 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5113RecBp14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5113RecBp14), 4, 0));
      A5114RecBp15 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5114RecBp15", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5114RecBp15), 4, 0));
      A5115RecAbsFac = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5115RecAbsFac", GXutil.ltrimstr( A5115RecAbsFac, 6, 2));
      A4701RecRecep = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4701RecRecep", GXutil.str( A4701RecRecep, 1, 0));
      A4700RecEnvio = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4700RecEnvio", GXutil.str( A4700RecEnvio, 1, 0));
      A6269RecPrg2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6269RecPrg2", A6269RecPrg2);
      A6270RecPrg3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6270RecPrg3", A6270RecPrg3);
      A7764RecMaqNh = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7764RecMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7764RecMaqNh), 3, 0));
      A7765RecMaqVX = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7765RecMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7765RecMaqVX), 2, 0));
      A7766RecMaqBL = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7766RecMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7766RecMaqBL), 2, 0));
      A7767RecMaqFlow = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7767RecMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7767RecMaqFlow), 2, 0));
      A7768RecMaqRPM = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7768RecMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7768RecMaqRPM), 4, 0));
      A7769RecMaqMol = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7769RecMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7769RecMaqMol), 3, 0));
      A7770RecMaqTor = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7770RecMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7770RecMaqTor), 3, 0));
      A7771RecMaqCla = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7771RecMaqCla", A7771RecMaqCla);
      A7772RecMaqTej = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7772RecMaqTej", GXutil.str( A7772RecMaqTej, 1, 0));
      A7773RecMaqDel = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7773RecMaqDel", GXutil.str( A7773RecMaqDel, 1, 0));
      A7774RecMaqPML = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7774RecMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7774RecMaqPML), 3, 0));
      A8353RecMaqObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8353RecMaqObs", A8353RecMaqObs);
      A4259RecTotKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4259RecTotKgs", GXutil.ltrimstr( A4259RecTotKgs, 10, 2));
      A10124Rsedo1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10124Rsedo1", GXutil.ltrimstr( A10124Rsedo1, 4, 1));
      A10125Rsedo2 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10125Rsedo2", GXutil.ltrimstr( A10125Rsedo2, 4, 1));
      A10126Rsedo3 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10126Rsedo3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10126Rsedo3), 3, 0));
      A10127Rsedo4 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10127Rsedo4", GXutil.ltrimstr( A10127Rsedo4, 4, 2));
      A10128Rsedo5 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10128Rsedo5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10128Rsedo5), 2, 0));
      A10129Rsedo6 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10129Rsedo6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10129Rsedo6), 2, 0));
      A10385RecCAut = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10385RecCAut", GXutil.str( A10385RecCAut, 1, 0));
      A12270Rsedo7 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12270Rsedo7", GXutil.ltrimstr( A12270Rsedo7, 5, 1));
      A12271Rsedo8 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12271Rsedo8", GXutil.ltrimstr( A12271Rsedo8, 4, 1));
      A12272Rsedo9 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12272Rsedo9", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12272Rsedo9), 3, 0));
      A12273Rsedo10 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12273Rsedo10", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12273Rsedo10), 4, 0));
      A12274Rsedo11 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12274Rsedo11", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12274Rsedo11), 3, 0));
      A12900Rsedo12 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12900Rsedo12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12900Rsedo12), 4, 0));
      A12901Rsedo13 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12901Rsedo13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12901Rsedo13), 4, 0));
      A12902Rsedo14 = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12902Rsedo14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12902Rsedo14), 6, 0));
      Z2805RecVolPrd = 0 ;
      Z2806RecFA = DecimalUtil.ZERO ;
      Z1272UltLinPro = (byte)(0) ;
      Z4402RecUsrCod = "" ;
      Z4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      Z4575RecMaqPes = (byte)(0) ;
      Z5109RecNumInt = 0 ;
      Z5110RecNumPrg = "" ;
      Z5111RecBp12 = (short)(0) ;
      Z5112RecBp13 = (short)(0) ;
      Z5113RecBp14 = (short)(0) ;
      Z5114RecBp15 = (short)(0) ;
      Z5115RecAbsFac = DecimalUtil.ZERO ;
      Z4701RecRecep = (byte)(0) ;
      Z4700RecEnvio = (byte)(0) ;
      Z6269RecPrg2 = "" ;
      Z6270RecPrg3 = "" ;
      Z7764RecMaqNh = (short)(0) ;
      Z7765RecMaqVX = (byte)(0) ;
      Z7766RecMaqBL = (byte)(0) ;
      Z7767RecMaqFlow = (byte)(0) ;
      Z7768RecMaqRPM = (short)(0) ;
      Z7769RecMaqMol = (short)(0) ;
      Z7770RecMaqTor = (short)(0) ;
      Z7771RecMaqCla = "" ;
      Z7772RecMaqTej = (byte)(0) ;
      Z7773RecMaqDel = (byte)(0) ;
      Z7774RecMaqPML = (short)(0) ;
      Z4259RecTotKgs = DecimalUtil.ZERO ;
      Z10124Rsedo1 = DecimalUtil.ZERO ;
      Z10125Rsedo2 = DecimalUtil.ZERO ;
      Z10126Rsedo3 = (short)(0) ;
      Z10127Rsedo4 = DecimalUtil.ZERO ;
      Z10128Rsedo5 = (byte)(0) ;
      Z10129Rsedo6 = (byte)(0) ;
      Z10385RecCAut = (byte)(0) ;
      Z12270Rsedo7 = DecimalUtil.ZERO ;
      Z12271Rsedo8 = DecimalUtil.ZERO ;
      Z12272Rsedo9 = (short)(0) ;
      Z12273Rsedo10 = (short)(0) ;
      Z12274Rsedo11 = (short)(0) ;
      Z12900Rsedo12 = (short)(0) ;
      Z12901Rsedo13 = (short)(0) ;
      Z12902Rsedo14 = 0 ;
      Z602MaqCod = "" ;
   }

   public void initAll1QD408( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2804RecLinMaq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      initializeNonKey1QD408( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016373784", true, true);
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
      httpContext.AddJavascriptSource("recmaq.js", "?202661016373785", false, true);
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
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      edtBarNumCli_Internalname = "BARNUMCLI" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtRecVolPrd_Internalname = "RECVOLPRD" ;
      edtRecFA_Internalname = "RECFA" ;
      edtUltLinPro_Internalname = "ULTLINPRO" ;
      edtRecUsrCod_Internalname = "RECUSRCOD" ;
      edtRecFecPes_Internalname = "RECFECPES" ;
      edtRecMaqPes_Internalname = "RECMAQPES" ;
      edtRecNumInt_Internalname = "RECNUMINT" ;
      edtRecNumPrg_Internalname = "RECNUMPRG" ;
      edtRecBp12_Internalname = "RECBP12" ;
      edtRecBp13_Internalname = "RECBP13" ;
      edtRecBp14_Internalname = "RECBP14" ;
      edtRecBp15_Internalname = "RECBP15" ;
      edtRecAbsFac_Internalname = "RECABSFAC" ;
      edtRecRecep_Internalname = "RECRECEP" ;
      edtRecEnvio_Internalname = "RECENVIO" ;
      edtRecPrg2_Internalname = "RECPRG2" ;
      edtRecPrg3_Internalname = "RECPRG3" ;
      edtRecMaqNh_Internalname = "RECMAQNH" ;
      edtRecMaqVX_Internalname = "RECMAQVX" ;
      edtRecMaqBL_Internalname = "RECMAQBL" ;
      edtRecMaqFlow_Internalname = "RECMAQFLOW" ;
      edtRecMaqRPM_Internalname = "RECMAQRPM" ;
      edtRecMaqMol_Internalname = "RECMAQMOL" ;
      edtRecMaqTor_Internalname = "RECMAQTOR" ;
      edtRecMaqCla_Internalname = "RECMAQCLA" ;
      edtRecMaqTej_Internalname = "RECMAQTEJ" ;
      edtRecMaqDel_Internalname = "RECMAQDEL" ;
      edtRecMaqPML_Internalname = "RECMAQPML" ;
      edtRecMaqObs_Internalname = "RECMAQOBS" ;
      edtRecTotKgs_Internalname = "RECTOTKGS" ;
      edtRsedo1_Internalname = "RSEDO1" ;
      edtRsedo2_Internalname = "RSEDO2" ;
      edtRsedo3_Internalname = "RSEDO3" ;
      edtRsedo4_Internalname = "RSEDO4" ;
      edtRsedo5_Internalname = "RSEDO5" ;
      edtRsedo6_Internalname = "RSEDO6" ;
      edtRecCAut_Internalname = "RECCAUT" ;
      edtRsedo7_Internalname = "RSEDO7" ;
      edtRsedo8_Internalname = "RSEDO8" ;
      edtRsedo9_Internalname = "RSEDO9" ;
      edtRsedo10_Internalname = "RSEDO10" ;
      edtRsedo11_Internalname = "RSEDO11" ;
      edtRsedo12_Internalname = "RSEDO12" ;
      edtRsedo13_Internalname = "RSEDO13" ;
      edtRsedo14_Internalname = "RSEDO14" ;
      edtRecHayAny_Internalname = "RECHAYANY" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla RECMAQ", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtRecHayAny_Jsonclick = "" ;
      edtRecHayAny_Enabled = 0 ;
      edtRsedo14_Jsonclick = "" ;
      edtRsedo14_Enabled = 1 ;
      edtRsedo13_Jsonclick = "" ;
      edtRsedo13_Enabled = 1 ;
      edtRsedo12_Jsonclick = "" ;
      edtRsedo12_Enabled = 1 ;
      edtRsedo11_Jsonclick = "" ;
      edtRsedo11_Enabled = 1 ;
      edtRsedo10_Jsonclick = "" ;
      edtRsedo10_Enabled = 1 ;
      edtRsedo9_Jsonclick = "" ;
      edtRsedo9_Enabled = 1 ;
      edtRsedo8_Jsonclick = "" ;
      edtRsedo8_Enabled = 1 ;
      edtRsedo7_Jsonclick = "" ;
      edtRsedo7_Enabled = 1 ;
      edtRecCAut_Jsonclick = "" ;
      edtRecCAut_Enabled = 1 ;
      edtRsedo6_Jsonclick = "" ;
      edtRsedo6_Enabled = 1 ;
      edtRsedo5_Jsonclick = "" ;
      edtRsedo5_Enabled = 1 ;
      edtRsedo4_Jsonclick = "" ;
      edtRsedo4_Enabled = 1 ;
      edtRsedo3_Jsonclick = "" ;
      edtRsedo3_Enabled = 1 ;
      edtRsedo2_Jsonclick = "" ;
      edtRsedo2_Enabled = 1 ;
      edtRsedo1_Jsonclick = "" ;
      edtRsedo1_Enabled = 1 ;
      edtRecTotKgs_Jsonclick = "" ;
      edtRecTotKgs_Enabled = 1 ;
      edtRecMaqObs_Enabled = 1 ;
      edtRecMaqPML_Jsonclick = "" ;
      edtRecMaqPML_Enabled = 1 ;
      edtRecMaqDel_Jsonclick = "" ;
      edtRecMaqDel_Enabled = 1 ;
      edtRecMaqTej_Jsonclick = "" ;
      edtRecMaqTej_Enabled = 1 ;
      edtRecMaqCla_Jsonclick = "" ;
      edtRecMaqCla_Enabled = 1 ;
      edtRecMaqTor_Jsonclick = "" ;
      edtRecMaqTor_Enabled = 1 ;
      edtRecMaqMol_Jsonclick = "" ;
      edtRecMaqMol_Enabled = 1 ;
      edtRecMaqRPM_Jsonclick = "" ;
      edtRecMaqRPM_Enabled = 1 ;
      edtRecMaqFlow_Jsonclick = "" ;
      edtRecMaqFlow_Enabled = 1 ;
      edtRecMaqBL_Jsonclick = "" ;
      edtRecMaqBL_Enabled = 1 ;
      edtRecMaqVX_Jsonclick = "" ;
      edtRecMaqVX_Enabled = 1 ;
      edtRecMaqNh_Jsonclick = "" ;
      edtRecMaqNh_Enabled = 1 ;
      edtRecPrg3_Jsonclick = "" ;
      edtRecPrg3_Enabled = 1 ;
      edtRecPrg2_Jsonclick = "" ;
      edtRecPrg2_Enabled = 1 ;
      edtRecEnvio_Jsonclick = "" ;
      edtRecEnvio_Enabled = 1 ;
      edtRecRecep_Jsonclick = "" ;
      edtRecRecep_Enabled = 1 ;
      edtRecAbsFac_Jsonclick = "" ;
      edtRecAbsFac_Enabled = 1 ;
      edtRecBp15_Jsonclick = "" ;
      edtRecBp15_Enabled = 1 ;
      edtRecBp14_Jsonclick = "" ;
      edtRecBp14_Enabled = 1 ;
      edtRecBp13_Jsonclick = "" ;
      edtRecBp13_Enabled = 1 ;
      edtRecBp12_Jsonclick = "" ;
      edtRecBp12_Enabled = 1 ;
      edtRecNumPrg_Jsonclick = "" ;
      edtRecNumPrg_Enabled = 1 ;
      edtRecNumInt_Jsonclick = "" ;
      edtRecNumInt_Enabled = 1 ;
      edtRecMaqPes_Jsonclick = "" ;
      edtRecMaqPes_Enabled = 1 ;
      edtRecFecPes_Jsonclick = "" ;
      edtRecFecPes_Enabled = 1 ;
      edtRecUsrCod_Jsonclick = "" ;
      edtRecUsrCod_Enabled = 1 ;
      edtUltLinPro_Jsonclick = "" ;
      edtUltLinPro_Enabled = 1 ;
      edtRecFA_Jsonclick = "" ;
      edtRecFA_Enabled = 1 ;
      edtRecVolPrd_Jsonclick = "" ;
      edtRecVolPrd_Enabled = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Enabled = 1 ;
      edtRecLinMaq_Jsonclick = "" ;
      edtRecLinMaq_Enabled = 1 ;
      edtBarNumCli_Jsonclick = "" ;
      edtBarNumCli_Enabled = 0 ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarNomCli_Enabled = 0 ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarTipCol_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Enabled = 0 ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSerDsc_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Enabled = 0 ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
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

   public void gx2asarechayany1QD408( String A396EmprCod ,
                                      int A129BarCod ,
                                      byte A132BarCodReo ,
                                      String A130BarCodPar ,
                                      short A2804RecLinMaq )
   {
      GXt_char1 = A14372RecHayAny ;
      GXv_char2[0] = GXt_char1 ;
      new app.formulaciontinte.hayanyadidas(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_char2) ;
      recmaq_impl.this.GXt_char1 = GXv_char2[0] ;
      A14372RecHayAny = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14372RecHayAny", A14372RecHayAny);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14372RecHayAny))+"\"") ;
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
      /* Using cursor T01QD15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A212BarSer = T01QD15_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = T01QD15_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A135BarColNom = T01QD15_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01QD15_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T01QD15_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A1234BarNomCli = T01QD15_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A1235BarNumCli = T01QD15_A1235BarNumCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      pr_default.close(13);
      GX_FocusControl = edtMaqCod_Internalname ;
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
      /* Using cursor T01QD15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A212BarSer = T01QD15_A212BarSer[0] ;
      A1652BarSerDsc = T01QD15_A1652BarSerDsc[0] ;
      A135BarColNom = T01QD15_A135BarColNom[0] ;
      A136BarColNum = T01QD15_A136BarColNum[0] ;
      A218BarTipCol = T01QD15_A218BarTipCol[0] ;
      A1234BarNomCli = T01QD15_A1234BarNomCli[0] ;
      A1235BarNumCli = T01QD15_A1235BarNumCli[0] ;
      pr_default.close(13);
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", GXutil.rtrim( A1652BarSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", GXutil.rtrim( A1234BarNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", GXutil.rtrim( A13696BarNHdr));
   }

   public void valid_Reclinmaq( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      GXt_char1 = A14372RecHayAny ;
      GXv_char2[0] = GXt_char1 ;
      new app.formulaciontinte.hayanyadidas(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_char2) ;
      recmaq_impl.this.GXt_char1 = GXv_char2[0] ;
      A14372RecHayAny = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", GXutil.rtrim( A602MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2806RecFA", GXutil.ltrim( localUtil.ntoc( A2806RecFA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrim( localUtil.ntoc( A1272UltLinPro, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4402RecUsrCod", GXutil.rtrim( A4402RecUsrCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4574RecFecPes", localUtil.ttoc( A4574RecFecPes, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A4575RecMaqPes", GXutil.ltrim( localUtil.ntoc( A4575RecMaqPes, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5109RecNumInt", GXutil.ltrim( localUtil.ntoc( A5109RecNumInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5110RecNumPrg", GXutil.rtrim( A5110RecNumPrg));
      httpContext.ajax_rsp_assign_attri("", false, "A5111RecBp12", GXutil.ltrim( localUtil.ntoc( A5111RecBp12, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5112RecBp13", GXutil.ltrim( localUtil.ntoc( A5112RecBp13, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5113RecBp14", GXutil.ltrim( localUtil.ntoc( A5113RecBp14, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5114RecBp15", GXutil.ltrim( localUtil.ntoc( A5114RecBp15, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5115RecAbsFac", GXutil.ltrim( localUtil.ntoc( A5115RecAbsFac, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4701RecRecep", GXutil.ltrim( localUtil.ntoc( A4701RecRecep, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4700RecEnvio", GXutil.ltrim( localUtil.ntoc( A4700RecEnvio, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6269RecPrg2", GXutil.rtrim( A6269RecPrg2));
      httpContext.ajax_rsp_assign_attri("", false, "A6270RecPrg3", GXutil.rtrim( A6270RecPrg3));
      httpContext.ajax_rsp_assign_attri("", false, "A7764RecMaqNh", GXutil.ltrim( localUtil.ntoc( A7764RecMaqNh, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7765RecMaqVX", GXutil.ltrim( localUtil.ntoc( A7765RecMaqVX, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7766RecMaqBL", GXutil.ltrim( localUtil.ntoc( A7766RecMaqBL, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7767RecMaqFlow", GXutil.ltrim( localUtil.ntoc( A7767RecMaqFlow, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7768RecMaqRPM", GXutil.ltrim( localUtil.ntoc( A7768RecMaqRPM, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7769RecMaqMol", GXutil.ltrim( localUtil.ntoc( A7769RecMaqMol, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7770RecMaqTor", GXutil.ltrim( localUtil.ntoc( A7770RecMaqTor, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7771RecMaqCla", GXutil.rtrim( A7771RecMaqCla));
      httpContext.ajax_rsp_assign_attri("", false, "A7772RecMaqTej", GXutil.ltrim( localUtil.ntoc( A7772RecMaqTej, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7773RecMaqDel", GXutil.ltrim( localUtil.ntoc( A7773RecMaqDel, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7774RecMaqPML", GXutil.ltrim( localUtil.ntoc( A7774RecMaqPML, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8353RecMaqObs", A8353RecMaqObs);
      httpContext.ajax_rsp_assign_attri("", false, "A4259RecTotKgs", GXutil.ltrim( localUtil.ntoc( A4259RecTotKgs, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10124Rsedo1", GXutil.ltrim( localUtil.ntoc( A10124Rsedo1, (byte)(4), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10125Rsedo2", GXutil.ltrim( localUtil.ntoc( A10125Rsedo2, (byte)(4), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10126Rsedo3", GXutil.ltrim( localUtil.ntoc( A10126Rsedo3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10127Rsedo4", GXutil.ltrim( localUtil.ntoc( A10127Rsedo4, (byte)(4), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10128Rsedo5", GXutil.ltrim( localUtil.ntoc( A10128Rsedo5, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10129Rsedo6", GXutil.ltrim( localUtil.ntoc( A10129Rsedo6, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10385RecCAut", GXutil.ltrim( localUtil.ntoc( A10385RecCAut, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12270Rsedo7", GXutil.ltrim( localUtil.ntoc( A12270Rsedo7, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12271Rsedo8", GXutil.ltrim( localUtil.ntoc( A12271Rsedo8, (byte)(4), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12272Rsedo9", GXutil.ltrim( localUtil.ntoc( A12272Rsedo9, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12273Rsedo10", GXutil.ltrim( localUtil.ntoc( A12273Rsedo10, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12274Rsedo11", GXutil.ltrim( localUtil.ntoc( A12274Rsedo11, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12900Rsedo12", GXutil.ltrim( localUtil.ntoc( A12900Rsedo12, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12901Rsedo13", GXutil.ltrim( localUtil.ntoc( A12901Rsedo13, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12902Rsedo14", GXutil.ltrim( localUtil.ntoc( A12902Rsedo14, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", GXutil.rtrim( A1652BarSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", GXutil.rtrim( A1234BarNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", GXutil.rtrim( A13696BarNHdr));
      httpContext.ajax_rsp_assign_attri("", false, "A14372RecHayAny", GXutil.rtrim( A14372RecHayAny));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2804RecLinMaq", GXutil.ltrim( localUtil.ntoc( Z2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2805RecVolPrd", GXutil.ltrim( localUtil.ntoc( Z2805RecVolPrd, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2806RecFA", GXutil.ltrim( localUtil.ntoc( Z2806RecFA, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1272UltLinPro", GXutil.ltrim( localUtil.ntoc( Z1272UltLinPro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4402RecUsrCod", GXutil.rtrim( Z4402RecUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4574RecFecPes", localUtil.ttoc( Z4574RecFecPes, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4575RecMaqPes", GXutil.ltrim( localUtil.ntoc( Z4575RecMaqPes, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5109RecNumInt", GXutil.ltrim( localUtil.ntoc( Z5109RecNumInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5110RecNumPrg", GXutil.rtrim( Z5110RecNumPrg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5111RecBp12", GXutil.ltrim( localUtil.ntoc( Z5111RecBp12, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5112RecBp13", GXutil.ltrim( localUtil.ntoc( Z5112RecBp13, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5113RecBp14", GXutil.ltrim( localUtil.ntoc( Z5113RecBp14, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5114RecBp15", GXutil.ltrim( localUtil.ntoc( Z5114RecBp15, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5115RecAbsFac", GXutil.ltrim( localUtil.ntoc( Z5115RecAbsFac, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4701RecRecep", GXutil.ltrim( localUtil.ntoc( Z4701RecRecep, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4700RecEnvio", GXutil.ltrim( localUtil.ntoc( Z4700RecEnvio, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6269RecPrg2", GXutil.rtrim( Z6269RecPrg2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6270RecPrg3", GXutil.rtrim( Z6270RecPrg3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7764RecMaqNh", GXutil.ltrim( localUtil.ntoc( Z7764RecMaqNh, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7765RecMaqVX", GXutil.ltrim( localUtil.ntoc( Z7765RecMaqVX, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7766RecMaqBL", GXutil.ltrim( localUtil.ntoc( Z7766RecMaqBL, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7767RecMaqFlow", GXutil.ltrim( localUtil.ntoc( Z7767RecMaqFlow, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7768RecMaqRPM", GXutil.ltrim( localUtil.ntoc( Z7768RecMaqRPM, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7769RecMaqMol", GXutil.ltrim( localUtil.ntoc( Z7769RecMaqMol, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7770RecMaqTor", GXutil.ltrim( localUtil.ntoc( Z7770RecMaqTor, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7771RecMaqCla", GXutil.rtrim( Z7771RecMaqCla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7772RecMaqTej", GXutil.ltrim( localUtil.ntoc( Z7772RecMaqTej, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7773RecMaqDel", GXutil.ltrim( localUtil.ntoc( Z7773RecMaqDel, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7774RecMaqPML", GXutil.ltrim( localUtil.ntoc( Z7774RecMaqPML, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8353RecMaqObs", Z8353RecMaqObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z4259RecTotKgs", GXutil.ltrim( localUtil.ntoc( Z4259RecTotKgs, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10124Rsedo1", GXutil.ltrim( localUtil.ntoc( Z10124Rsedo1, (byte)(4), (byte)(1), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10125Rsedo2", GXutil.ltrim( localUtil.ntoc( Z10125Rsedo2, (byte)(4), (byte)(1), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10126Rsedo3", GXutil.ltrim( localUtil.ntoc( Z10126Rsedo3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10127Rsedo4", GXutil.ltrim( localUtil.ntoc( Z10127Rsedo4, (byte)(4), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10128Rsedo5", GXutil.ltrim( localUtil.ntoc( Z10128Rsedo5, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10129Rsedo6", GXutil.ltrim( localUtil.ntoc( Z10129Rsedo6, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10385RecCAut", GXutil.ltrim( localUtil.ntoc( Z10385RecCAut, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12270Rsedo7", GXutil.ltrim( localUtil.ntoc( Z12270Rsedo7, (byte)(5), (byte)(1), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12271Rsedo8", GXutil.ltrim( localUtil.ntoc( Z12271Rsedo8, (byte)(4), (byte)(1), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12272Rsedo9", GXutil.ltrim( localUtil.ntoc( Z12272Rsedo9, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12273Rsedo10", GXutil.ltrim( localUtil.ntoc( Z12273Rsedo10, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12274Rsedo11", GXutil.ltrim( localUtil.ntoc( Z12274Rsedo11, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12900Rsedo12", GXutil.ltrim( localUtil.ntoc( Z12900Rsedo12, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12901Rsedo13", GXutil.ltrim( localUtil.ntoc( Z12901Rsedo13, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12902Rsedo14", GXutil.ltrim( localUtil.ntoc( Z12902Rsedo14, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1652BarSerDsc", GXutil.rtrim( Z1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z218BarTipCol", GXutil.ltrim( localUtil.ntoc( Z218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1234BarNomCli", GXutil.rtrim( Z1234BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1235BarNumCli", GXutil.ltrim( localUtil.ntoc( Z1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13696BarNHdr", GXutil.rtrim( Z13696BarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14372RecHayAny", GXutil.rtrim( Z14372RecHayAny));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Maqcod( )
   {
      /* Using cursor T01QD21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(19);
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''}]}");
      setEventMetadata("VALID_RECLINMAQ","{handler:'valid_Reclinmaq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RECLINMAQ",",oparms:[{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A2806RecFA',fld:'RECFA',pic:'ZZ9.99'},{av:'A1272UltLinPro',fld:'ULTLINPRO',pic:'Z9'},{av:'A4402RecUsrCod',fld:'RECUSRCOD',pic:''},{av:'A4574RecFecPes',fld:'RECFECPES',pic:'99/99/99 99:99:99'},{av:'A4575RecMaqPes',fld:'RECMAQPES',pic:'9'},{av:'A5109RecNumInt',fld:'RECNUMINT',pic:'ZZZZZZZ9'},{av:'A5110RecNumPrg',fld:'RECNUMPRG',pic:''},{av:'A5111RecBp12',fld:'RECBP12',pic:'ZZZ9'},{av:'A5112RecBp13',fld:'RECBP13',pic:'ZZZ9'},{av:'A5113RecBp14',fld:'RECBP14',pic:'ZZZ9'},{av:'A5114RecBp15',fld:'RECBP15',pic:'ZZZ9'},{av:'A5115RecAbsFac',fld:'RECABSFAC',pic:'ZZ9.99'},{av:'A4701RecRecep',fld:'RECRECEP',pic:'9'},{av:'A4700RecEnvio',fld:'RECENVIO',pic:'9'},{av:'A6269RecPrg2',fld:'RECPRG2',pic:''},{av:'A6270RecPrg3',fld:'RECPRG3',pic:''},{av:'A7764RecMaqNh',fld:'RECMAQNH',pic:'ZZ9'},{av:'A7765RecMaqVX',fld:'RECMAQVX',pic:'Z9'},{av:'A7766RecMaqBL',fld:'RECMAQBL',pic:'Z9'},{av:'A7767RecMaqFlow',fld:'RECMAQFLOW',pic:'Z9'},{av:'A7768RecMaqRPM',fld:'RECMAQRPM',pic:'ZZZ9'},{av:'A7769RecMaqMol',fld:'RECMAQMOL',pic:'ZZ9'},{av:'A7770RecMaqTor',fld:'RECMAQTOR',pic:'ZZ9'},{av:'A7771RecMaqCla',fld:'RECMAQCLA',pic:''},{av:'A7772RecMaqTej',fld:'RECMAQTEJ',pic:'9'},{av:'A7773RecMaqDel',fld:'RECMAQDEL',pic:'9'},{av:'A7774RecMaqPML',fld:'RECMAQPML',pic:'ZZ9'},{av:'A8353RecMaqObs',fld:'RECMAQOBS',pic:''},{av:'A4259RecTotKgs',fld:'RECTOTKGS',pic:'ZZZZZZ9.99'},{av:'A10124Rsedo1',fld:'RSEDO1',pic:'Z9.9'},{av:'A10125Rsedo2',fld:'RSEDO2',pic:'Z9.9'},{av:'A10126Rsedo3',fld:'RSEDO3',pic:'ZZ9'},{av:'A10127Rsedo4',fld:'RSEDO4',pic:'9.99'},{av:'A10128Rsedo5',fld:'RSEDO5',pic:'Z9'},{av:'A10129Rsedo6',fld:'RSEDO6',pic:'Z9'},{av:'A10385RecCAut',fld:'RECCAUT',pic:'9'},{av:'A12270Rsedo7',fld:'RSEDO7',pic:'ZZ9.9'},{av:'A12271Rsedo8',fld:'RSEDO8',pic:'Z9.9'},{av:'A12272Rsedo9',fld:'RSEDO9',pic:'ZZ9'},{av:'A12273Rsedo10',fld:'RSEDO10',pic:'ZZZ9'},{av:'A12274Rsedo11',fld:'RSEDO11',pic:'ZZ9'},{av:'A12900Rsedo12',fld:'RSEDO12',pic:'ZZZ9'},{av:'A12901Rsedo13',fld:'RSEDO13',pic:'ZZZ9'},{av:'A12902Rsedo14',fld:'RSEDO14',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A14372RecHayAny',fld:'RECHAYANY',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2804RecLinMaq'},{av:'Z602MaqCod'},{av:'Z2805RecVolPrd'},{av:'Z2806RecFA'},{av:'Z1272UltLinPro'},{av:'Z4402RecUsrCod'},{av:'Z4574RecFecPes'},{av:'Z4575RecMaqPes'},{av:'Z5109RecNumInt'},{av:'Z5110RecNumPrg'},{av:'Z5111RecBp12'},{av:'Z5112RecBp13'},{av:'Z5113RecBp14'},{av:'Z5114RecBp15'},{av:'Z5115RecAbsFac'},{av:'Z4701RecRecep'},{av:'Z4700RecEnvio'},{av:'Z6269RecPrg2'},{av:'Z6270RecPrg3'},{av:'Z7764RecMaqNh'},{av:'Z7765RecMaqVX'},{av:'Z7766RecMaqBL'},{av:'Z7767RecMaqFlow'},{av:'Z7768RecMaqRPM'},{av:'Z7769RecMaqMol'},{av:'Z7770RecMaqTor'},{av:'Z7771RecMaqCla'},{av:'Z7772RecMaqTej'},{av:'Z7773RecMaqDel'},{av:'Z7774RecMaqPML'},{av:'Z8353RecMaqObs'},{av:'Z4259RecTotKgs'},{av:'Z10124Rsedo1'},{av:'Z10125Rsedo2'},{av:'Z10126Rsedo3'},{av:'Z10127Rsedo4'},{av:'Z10128Rsedo5'},{av:'Z10129Rsedo6'},{av:'Z10385RecCAut'},{av:'Z12270Rsedo7'},{av:'Z12271Rsedo8'},{av:'Z12272Rsedo9'},{av:'Z12273Rsedo10'},{av:'Z12274Rsedo11'},{av:'Z12900Rsedo12'},{av:'Z12901Rsedo13'},{av:'Z12902Rsedo14'},{av:'Z212BarSer'},{av:'Z1652BarSerDsc'},{av:'Z135BarColNom'},{av:'Z136BarColNum'},{av:'Z218BarTipCol'},{av:'Z1234BarNomCli'},{av:'Z1235BarNumCli'},{av:'Z13696BarNHdr'},{av:'Z14372RecHayAny'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_RECMAQPES","{handler:'valid_Recmaqpes',iparms:[]");
      setEventMetadata("VALID_RECMAQPES",",oparms:[]}");
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
      pr_default.close(19);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2806RecFA = DecimalUtil.ZERO ;
      Z4402RecUsrCod = "" ;
      Z4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      Z5110RecNumPrg = "" ;
      Z5115RecAbsFac = DecimalUtil.ZERO ;
      Z6269RecPrg2 = "" ;
      Z6270RecPrg3 = "" ;
      Z7771RecMaqCla = "" ;
      Z4259RecTotKgs = DecimalUtil.ZERO ;
      Z10124Rsedo1 = DecimalUtil.ZERO ;
      Z10125Rsedo2 = DecimalUtil.ZERO ;
      Z10127Rsedo4 = DecimalUtil.ZERO ;
      Z12270Rsedo7 = DecimalUtil.ZERO ;
      Z12271Rsedo8 = DecimalUtil.ZERO ;
      Z602MaqCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
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
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A2806RecFA = DecimalUtil.ZERO ;
      A4402RecUsrCod = "" ;
      A4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      A5110RecNumPrg = "" ;
      A5115RecAbsFac = DecimalUtil.ZERO ;
      A6269RecPrg2 = "" ;
      A6270RecPrg3 = "" ;
      A7771RecMaqCla = "" ;
      A8353RecMaqObs = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A10124Rsedo1 = DecimalUtil.ZERO ;
      A10125Rsedo2 = DecimalUtil.ZERO ;
      A10127Rsedo4 = DecimalUtil.ZERO ;
      A12270Rsedo7 = DecimalUtil.ZERO ;
      A12271Rsedo8 = DecimalUtil.ZERO ;
      A14372RecHayAny = "" ;
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
      Z8353RecMaqObs = "" ;
      Z212BarSer = "" ;
      Z1652BarSerDsc = "" ;
      Z135BarColNom = "" ;
      Z1234BarNomCli = "" ;
      T01QD6_A8353RecMaqObs = new String[] {""} ;
      T01QD6_A2804RecLinMaq = new short[1] ;
      T01QD6_A212BarSer = new String[] {""} ;
      T01QD6_A1652BarSerDsc = new String[] {""} ;
      T01QD6_A135BarColNom = new String[] {""} ;
      T01QD6_A136BarColNum = new int[1] ;
      T01QD6_A218BarTipCol = new byte[1] ;
      T01QD6_A1234BarNomCli = new String[] {""} ;
      T01QD6_A1235BarNumCli = new int[1] ;
      T01QD6_A2805RecVolPrd = new int[1] ;
      T01QD6_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD6_A1272UltLinPro = new byte[1] ;
      T01QD6_A4402RecUsrCod = new String[] {""} ;
      T01QD6_A4574RecFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T01QD6_A4575RecMaqPes = new byte[1] ;
      T01QD6_A5109RecNumInt = new int[1] ;
      T01QD6_A5110RecNumPrg = new String[] {""} ;
      T01QD6_A5111RecBp12 = new short[1] ;
      T01QD6_A5112RecBp13 = new short[1] ;
      T01QD6_A5113RecBp14 = new short[1] ;
      T01QD6_A5114RecBp15 = new short[1] ;
      T01QD6_A5115RecAbsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD6_A4701RecRecep = new byte[1] ;
      T01QD6_A4700RecEnvio = new byte[1] ;
      T01QD6_A6269RecPrg2 = new String[] {""} ;
      T01QD6_A6270RecPrg3 = new String[] {""} ;
      T01QD6_A7764RecMaqNh = new short[1] ;
      T01QD6_A7765RecMaqVX = new byte[1] ;
      T01QD6_A7766RecMaqBL = new byte[1] ;
      T01QD6_A7767RecMaqFlow = new byte[1] ;
      T01QD6_A7768RecMaqRPM = new short[1] ;
      T01QD6_A7769RecMaqMol = new short[1] ;
      T01QD6_A7770RecMaqTor = new short[1] ;
      T01QD6_A7771RecMaqCla = new String[] {""} ;
      T01QD6_A7772RecMaqTej = new byte[1] ;
      T01QD6_A7773RecMaqDel = new byte[1] ;
      T01QD6_A7774RecMaqPML = new short[1] ;
      T01QD6_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD6_A10124Rsedo1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD6_A10125Rsedo2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD6_A10126Rsedo3 = new short[1] ;
      T01QD6_A10127Rsedo4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD6_A10128Rsedo5 = new byte[1] ;
      T01QD6_A10129Rsedo6 = new byte[1] ;
      T01QD6_A10385RecCAut = new byte[1] ;
      T01QD6_A12270Rsedo7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD6_A12271Rsedo8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD6_A12272Rsedo9 = new short[1] ;
      T01QD6_A12273Rsedo10 = new short[1] ;
      T01QD6_A12274Rsedo11 = new short[1] ;
      T01QD6_A12900Rsedo12 = new short[1] ;
      T01QD6_A12901Rsedo13 = new short[1] ;
      T01QD6_A12902Rsedo14 = new int[1] ;
      T01QD6_A396EmprCod = new String[] {""} ;
      T01QD6_A602MaqCod = new String[] {""} ;
      T01QD6_A129BarCod = new int[1] ;
      T01QD6_A132BarCodReo = new byte[1] ;
      T01QD6_A130BarCodPar = new String[] {""} ;
      T01QD4_A396EmprCod = new String[] {""} ;
      T01QD5_A212BarSer = new String[] {""} ;
      T01QD5_A1652BarSerDsc = new String[] {""} ;
      T01QD5_A135BarColNom = new String[] {""} ;
      T01QD5_A136BarColNum = new int[1] ;
      T01QD5_A218BarTipCol = new byte[1] ;
      T01QD5_A1234BarNomCli = new String[] {""} ;
      T01QD5_A1235BarNumCli = new int[1] ;
      T01QD7_A396EmprCod = new String[] {""} ;
      T01QD8_A212BarSer = new String[] {""} ;
      T01QD8_A1652BarSerDsc = new String[] {""} ;
      T01QD8_A135BarColNom = new String[] {""} ;
      T01QD8_A136BarColNum = new int[1] ;
      T01QD8_A218BarTipCol = new byte[1] ;
      T01QD8_A1234BarNomCli = new String[] {""} ;
      T01QD8_A1235BarNumCli = new int[1] ;
      T01QD9_A396EmprCod = new String[] {""} ;
      T01QD9_A129BarCod = new int[1] ;
      T01QD9_A132BarCodReo = new byte[1] ;
      T01QD9_A130BarCodPar = new String[] {""} ;
      T01QD9_A2804RecLinMaq = new short[1] ;
      T01QD3_A8353RecMaqObs = new String[] {""} ;
      T01QD3_A2804RecLinMaq = new short[1] ;
      T01QD3_A2805RecVolPrd = new int[1] ;
      T01QD3_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD3_A1272UltLinPro = new byte[1] ;
      T01QD3_A4402RecUsrCod = new String[] {""} ;
      T01QD3_A4574RecFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T01QD3_A4575RecMaqPes = new byte[1] ;
      T01QD3_A5109RecNumInt = new int[1] ;
      T01QD3_A5110RecNumPrg = new String[] {""} ;
      T01QD3_A5111RecBp12 = new short[1] ;
      T01QD3_A5112RecBp13 = new short[1] ;
      T01QD3_A5113RecBp14 = new short[1] ;
      T01QD3_A5114RecBp15 = new short[1] ;
      T01QD3_A5115RecAbsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD3_A4701RecRecep = new byte[1] ;
      T01QD3_A4700RecEnvio = new byte[1] ;
      T01QD3_A6269RecPrg2 = new String[] {""} ;
      T01QD3_A6270RecPrg3 = new String[] {""} ;
      T01QD3_A7764RecMaqNh = new short[1] ;
      T01QD3_A7765RecMaqVX = new byte[1] ;
      T01QD3_A7766RecMaqBL = new byte[1] ;
      T01QD3_A7767RecMaqFlow = new byte[1] ;
      T01QD3_A7768RecMaqRPM = new short[1] ;
      T01QD3_A7769RecMaqMol = new short[1] ;
      T01QD3_A7770RecMaqTor = new short[1] ;
      T01QD3_A7771RecMaqCla = new String[] {""} ;
      T01QD3_A7772RecMaqTej = new byte[1] ;
      T01QD3_A7773RecMaqDel = new byte[1] ;
      T01QD3_A7774RecMaqPML = new short[1] ;
      T01QD3_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD3_A10124Rsedo1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD3_A10125Rsedo2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD3_A10126Rsedo3 = new short[1] ;
      T01QD3_A10127Rsedo4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD3_A10128Rsedo5 = new byte[1] ;
      T01QD3_A10129Rsedo6 = new byte[1] ;
      T01QD3_A10385RecCAut = new byte[1] ;
      T01QD3_A12270Rsedo7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD3_A12271Rsedo8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD3_A12272Rsedo9 = new short[1] ;
      T01QD3_A12273Rsedo10 = new short[1] ;
      T01QD3_A12274Rsedo11 = new short[1] ;
      T01QD3_A12900Rsedo12 = new short[1] ;
      T01QD3_A12901Rsedo13 = new short[1] ;
      T01QD3_A12902Rsedo14 = new int[1] ;
      T01QD3_A396EmprCod = new String[] {""} ;
      T01QD3_A602MaqCod = new String[] {""} ;
      T01QD3_A129BarCod = new int[1] ;
      T01QD3_A132BarCodReo = new byte[1] ;
      T01QD3_A130BarCodPar = new String[] {""} ;
      sMode408 = "" ;
      T01QD10_A396EmprCod = new String[] {""} ;
      T01QD10_A129BarCod = new int[1] ;
      T01QD10_A132BarCodReo = new byte[1] ;
      T01QD10_A130BarCodPar = new String[] {""} ;
      T01QD10_A2804RecLinMaq = new short[1] ;
      T01QD11_A396EmprCod = new String[] {""} ;
      T01QD11_A129BarCod = new int[1] ;
      T01QD11_A132BarCodReo = new byte[1] ;
      T01QD11_A130BarCodPar = new String[] {""} ;
      T01QD11_A2804RecLinMaq = new short[1] ;
      T01QD2_A8353RecMaqObs = new String[] {""} ;
      T01QD2_A2804RecLinMaq = new short[1] ;
      T01QD2_A2805RecVolPrd = new int[1] ;
      T01QD2_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD2_A1272UltLinPro = new byte[1] ;
      T01QD2_A4402RecUsrCod = new String[] {""} ;
      T01QD2_A4574RecFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T01QD2_A4575RecMaqPes = new byte[1] ;
      T01QD2_A5109RecNumInt = new int[1] ;
      T01QD2_A5110RecNumPrg = new String[] {""} ;
      T01QD2_A5111RecBp12 = new short[1] ;
      T01QD2_A5112RecBp13 = new short[1] ;
      T01QD2_A5113RecBp14 = new short[1] ;
      T01QD2_A5114RecBp15 = new short[1] ;
      T01QD2_A5115RecAbsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD2_A4701RecRecep = new byte[1] ;
      T01QD2_A4700RecEnvio = new byte[1] ;
      T01QD2_A6269RecPrg2 = new String[] {""} ;
      T01QD2_A6270RecPrg3 = new String[] {""} ;
      T01QD2_A7764RecMaqNh = new short[1] ;
      T01QD2_A7765RecMaqVX = new byte[1] ;
      T01QD2_A7766RecMaqBL = new byte[1] ;
      T01QD2_A7767RecMaqFlow = new byte[1] ;
      T01QD2_A7768RecMaqRPM = new short[1] ;
      T01QD2_A7769RecMaqMol = new short[1] ;
      T01QD2_A7770RecMaqTor = new short[1] ;
      T01QD2_A7771RecMaqCla = new String[] {""} ;
      T01QD2_A7772RecMaqTej = new byte[1] ;
      T01QD2_A7773RecMaqDel = new byte[1] ;
      T01QD2_A7774RecMaqPML = new short[1] ;
      T01QD2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD2_A10124Rsedo1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD2_A10125Rsedo2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD2_A10126Rsedo3 = new short[1] ;
      T01QD2_A10127Rsedo4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD2_A10128Rsedo5 = new byte[1] ;
      T01QD2_A10129Rsedo6 = new byte[1] ;
      T01QD2_A10385RecCAut = new byte[1] ;
      T01QD2_A12270Rsedo7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD2_A12271Rsedo8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QD2_A12272Rsedo9 = new short[1] ;
      T01QD2_A12273Rsedo10 = new short[1] ;
      T01QD2_A12274Rsedo11 = new short[1] ;
      T01QD2_A12900Rsedo12 = new short[1] ;
      T01QD2_A12901Rsedo13 = new short[1] ;
      T01QD2_A12902Rsedo14 = new int[1] ;
      T01QD2_A396EmprCod = new String[] {""} ;
      T01QD2_A602MaqCod = new String[] {""} ;
      T01QD2_A129BarCod = new int[1] ;
      T01QD2_A132BarCodReo = new byte[1] ;
      T01QD2_A130BarCodPar = new String[] {""} ;
      T01QD15_A212BarSer = new String[] {""} ;
      T01QD15_A1652BarSerDsc = new String[] {""} ;
      T01QD15_A135BarColNom = new String[] {""} ;
      T01QD15_A136BarColNum = new int[1] ;
      T01QD15_A218BarTipCol = new byte[1] ;
      T01QD15_A1234BarNomCli = new String[] {""} ;
      T01QD15_A1235BarNumCli = new int[1] ;
      T01QD16_A396EmprCod = new String[] {""} ;
      T01QD16_A129BarCod = new int[1] ;
      T01QD16_A132BarCodReo = new byte[1] ;
      T01QD16_A130BarCodPar = new String[] {""} ;
      T01QD16_A2804RecLinMaq = new short[1] ;
      T01QD16_A5408RecLinCol = new short[1] ;
      T01QD17_A396EmprCod = new String[] {""} ;
      T01QD17_A129BarCod = new int[1] ;
      T01QD17_A132BarCodReo = new byte[1] ;
      T01QD17_A130BarCodPar = new String[] {""} ;
      T01QD17_A2804RecLinMaq = new short[1] ;
      T01QD17_A5257RecLinObs = new short[1] ;
      T01QD18_A396EmprCod = new String[] {""} ;
      T01QD18_A129BarCod = new int[1] ;
      T01QD18_A132BarCodReo = new byte[1] ;
      T01QD18_A130BarCodPar = new String[] {""} ;
      T01QD18_A2804RecLinMaq = new short[1] ;
      T01QD18_A4274RecBarCAg = new int[1] ;
      T01QD18_A4275RecBarRAg = new byte[1] ;
      T01QD18_A4276RecBarPAg = new String[] {""} ;
      T01QD18_A4698RecBarNPd = new int[1] ;
      T01QD18_A4699RecBarOrd = new short[1] ;
      T01QD19_A396EmprCod = new String[] {""} ;
      T01QD19_A129BarCod = new int[1] ;
      T01QD19_A132BarCodReo = new byte[1] ;
      T01QD19_A130BarCodPar = new String[] {""} ;
      T01QD19_A2804RecLinMaq = new short[1] ;
      T01QD19_A1273RecLinPro = new byte[1] ;
      T01QD20_A396EmprCod = new String[] {""} ;
      T01QD20_A129BarCod = new int[1] ;
      T01QD20_A132BarCodReo = new byte[1] ;
      T01QD20_A130BarCodPar = new String[] {""} ;
      T01QD20_A2804RecLinMaq = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z13696BarNHdr = "" ;
      Z14372RecHayAny = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ602MaqCod = "" ;
      ZZ2806RecFA = DecimalUtil.ZERO ;
      ZZ4402RecUsrCod = "" ;
      ZZ4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      ZZ5110RecNumPrg = "" ;
      ZZ5115RecAbsFac = DecimalUtil.ZERO ;
      ZZ6269RecPrg2 = "" ;
      ZZ6270RecPrg3 = "" ;
      ZZ7771RecMaqCla = "" ;
      ZZ8353RecMaqObs = "" ;
      ZZ4259RecTotKgs = DecimalUtil.ZERO ;
      ZZ10124Rsedo1 = DecimalUtil.ZERO ;
      ZZ10125Rsedo2 = DecimalUtil.ZERO ;
      ZZ10127Rsedo4 = DecimalUtil.ZERO ;
      ZZ12270Rsedo7 = DecimalUtil.ZERO ;
      ZZ12271Rsedo8 = DecimalUtil.ZERO ;
      ZZ212BarSer = "" ;
      ZZ1652BarSerDsc = "" ;
      ZZ135BarColNom = "" ;
      ZZ1234BarNomCli = "" ;
      ZZ13696BarNHdr = "" ;
      ZZ14372RecHayAny = "" ;
      T01QD21_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.recmaq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.recmaq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.recmaq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recmaq__default(),
         new Object[] {
             new Object[] {
            T01QD2_A8353RecMaqObs, T01QD2_A2804RecLinMaq, T01QD2_A2805RecVolPrd, T01QD2_A2806RecFA, T01QD2_A1272UltLinPro, T01QD2_A4402RecUsrCod, T01QD2_A4574RecFecPes, T01QD2_A4575RecMaqPes, T01QD2_A5109RecNumInt, T01QD2_A5110RecNumPrg,
            T01QD2_A5111RecBp12, T01QD2_A5112RecBp13, T01QD2_A5113RecBp14, T01QD2_A5114RecBp15, T01QD2_A5115RecAbsFac, T01QD2_A4701RecRecep, T01QD2_A4700RecEnvio, T01QD2_A6269RecPrg2, T01QD2_A6270RecPrg3, T01QD2_A7764RecMaqNh,
            T01QD2_A7765RecMaqVX, T01QD2_A7766RecMaqBL, T01QD2_A7767RecMaqFlow, T01QD2_A7768RecMaqRPM, T01QD2_A7769RecMaqMol, T01QD2_A7770RecMaqTor, T01QD2_A7771RecMaqCla, T01QD2_A7772RecMaqTej, T01QD2_A7773RecMaqDel, T01QD2_A7774RecMaqPML,
            T01QD2_A4259RecTotKgs, T01QD2_A10124Rsedo1, T01QD2_A10125Rsedo2, T01QD2_A10126Rsedo3, T01QD2_A10127Rsedo4, T01QD2_A10128Rsedo5, T01QD2_A10129Rsedo6, T01QD2_A10385RecCAut, T01QD2_A12270Rsedo7, T01QD2_A12271Rsedo8,
            T01QD2_A12272Rsedo9, T01QD2_A12273Rsedo10, T01QD2_A12274Rsedo11, T01QD2_A12900Rsedo12, T01QD2_A12901Rsedo13, T01QD2_A12902Rsedo14, T01QD2_A396EmprCod, T01QD2_A602MaqCod, T01QD2_A129BarCod, T01QD2_A132BarCodReo,
            T01QD2_A130BarCodPar
            }
            , new Object[] {
            T01QD3_A8353RecMaqObs, T01QD3_A2804RecLinMaq, T01QD3_A2805RecVolPrd, T01QD3_A2806RecFA, T01QD3_A1272UltLinPro, T01QD3_A4402RecUsrCod, T01QD3_A4574RecFecPes, T01QD3_A4575RecMaqPes, T01QD3_A5109RecNumInt, T01QD3_A5110RecNumPrg,
            T01QD3_A5111RecBp12, T01QD3_A5112RecBp13, T01QD3_A5113RecBp14, T01QD3_A5114RecBp15, T01QD3_A5115RecAbsFac, T01QD3_A4701RecRecep, T01QD3_A4700RecEnvio, T01QD3_A6269RecPrg2, T01QD3_A6270RecPrg3, T01QD3_A7764RecMaqNh,
            T01QD3_A7765RecMaqVX, T01QD3_A7766RecMaqBL, T01QD3_A7767RecMaqFlow, T01QD3_A7768RecMaqRPM, T01QD3_A7769RecMaqMol, T01QD3_A7770RecMaqTor, T01QD3_A7771RecMaqCla, T01QD3_A7772RecMaqTej, T01QD3_A7773RecMaqDel, T01QD3_A7774RecMaqPML,
            T01QD3_A4259RecTotKgs, T01QD3_A10124Rsedo1, T01QD3_A10125Rsedo2, T01QD3_A10126Rsedo3, T01QD3_A10127Rsedo4, T01QD3_A10128Rsedo5, T01QD3_A10129Rsedo6, T01QD3_A10385RecCAut, T01QD3_A12270Rsedo7, T01QD3_A12271Rsedo8,
            T01QD3_A12272Rsedo9, T01QD3_A12273Rsedo10, T01QD3_A12274Rsedo11, T01QD3_A12900Rsedo12, T01QD3_A12901Rsedo13, T01QD3_A12902Rsedo14, T01QD3_A396EmprCod, T01QD3_A602MaqCod, T01QD3_A129BarCod, T01QD3_A132BarCodReo,
            T01QD3_A130BarCodPar
            }
            , new Object[] {
            T01QD4_A396EmprCod
            }
            , new Object[] {
            T01QD5_A212BarSer, T01QD5_A1652BarSerDsc, T01QD5_A135BarColNom, T01QD5_A136BarColNum, T01QD5_A218BarTipCol, T01QD5_A1234BarNomCli, T01QD5_A1235BarNumCli
            }
            , new Object[] {
            T01QD6_A8353RecMaqObs, T01QD6_A2804RecLinMaq, T01QD6_A212BarSer, T01QD6_A1652BarSerDsc, T01QD6_A135BarColNom, T01QD6_A136BarColNum, T01QD6_A218BarTipCol, T01QD6_A1234BarNomCli, T01QD6_A1235BarNumCli, T01QD6_A2805RecVolPrd,
            T01QD6_A2806RecFA, T01QD6_A1272UltLinPro, T01QD6_A4402RecUsrCod, T01QD6_A4574RecFecPes, T01QD6_A4575RecMaqPes, T01QD6_A5109RecNumInt, T01QD6_A5110RecNumPrg, T01QD6_A5111RecBp12, T01QD6_A5112RecBp13, T01QD6_A5113RecBp14,
            T01QD6_A5114RecBp15, T01QD6_A5115RecAbsFac, T01QD6_A4701RecRecep, T01QD6_A4700RecEnvio, T01QD6_A6269RecPrg2, T01QD6_A6270RecPrg3, T01QD6_A7764RecMaqNh, T01QD6_A7765RecMaqVX, T01QD6_A7766RecMaqBL, T01QD6_A7767RecMaqFlow,
            T01QD6_A7768RecMaqRPM, T01QD6_A7769RecMaqMol, T01QD6_A7770RecMaqTor, T01QD6_A7771RecMaqCla, T01QD6_A7772RecMaqTej, T01QD6_A7773RecMaqDel, T01QD6_A7774RecMaqPML, T01QD6_A4259RecTotKgs, T01QD6_A10124Rsedo1, T01QD6_A10125Rsedo2,
            T01QD6_A10126Rsedo3, T01QD6_A10127Rsedo4, T01QD6_A10128Rsedo5, T01QD6_A10129Rsedo6, T01QD6_A10385RecCAut, T01QD6_A12270Rsedo7, T01QD6_A12271Rsedo8, T01QD6_A12272Rsedo9, T01QD6_A12273Rsedo10, T01QD6_A12274Rsedo11,
            T01QD6_A12900Rsedo12, T01QD6_A12901Rsedo13, T01QD6_A12902Rsedo14, T01QD6_A396EmprCod, T01QD6_A602MaqCod, T01QD6_A129BarCod, T01QD6_A132BarCodReo, T01QD6_A130BarCodPar
            }
            , new Object[] {
            T01QD7_A396EmprCod
            }
            , new Object[] {
            T01QD8_A212BarSer, T01QD8_A1652BarSerDsc, T01QD8_A135BarColNom, T01QD8_A136BarColNum, T01QD8_A218BarTipCol, T01QD8_A1234BarNomCli, T01QD8_A1235BarNumCli
            }
            , new Object[] {
            T01QD9_A396EmprCod, T01QD9_A129BarCod, T01QD9_A132BarCodReo, T01QD9_A130BarCodPar, T01QD9_A2804RecLinMaq
            }
            , new Object[] {
            T01QD10_A396EmprCod, T01QD10_A129BarCod, T01QD10_A132BarCodReo, T01QD10_A130BarCodPar, T01QD10_A2804RecLinMaq
            }
            , new Object[] {
            T01QD11_A396EmprCod, T01QD11_A129BarCod, T01QD11_A132BarCodReo, T01QD11_A130BarCodPar, T01QD11_A2804RecLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QD15_A212BarSer, T01QD15_A1652BarSerDsc, T01QD15_A135BarColNom, T01QD15_A136BarColNum, T01QD15_A218BarTipCol, T01QD15_A1234BarNomCli, T01QD15_A1235BarNumCli
            }
            , new Object[] {
            T01QD16_A396EmprCod, T01QD16_A129BarCod, T01QD16_A132BarCodReo, T01QD16_A130BarCodPar, T01QD16_A2804RecLinMaq, T01QD16_A5408RecLinCol
            }
            , new Object[] {
            T01QD17_A396EmprCod, T01QD17_A129BarCod, T01QD17_A132BarCodReo, T01QD17_A130BarCodPar, T01QD17_A2804RecLinMaq, T01QD17_A5257RecLinObs
            }
            , new Object[] {
            T01QD18_A396EmprCod, T01QD18_A129BarCod, T01QD18_A132BarCodReo, T01QD18_A130BarCodPar, T01QD18_A2804RecLinMaq, T01QD18_A4274RecBarCAg, T01QD18_A4275RecBarRAg, T01QD18_A4276RecBarPAg, T01QD18_A4698RecBarNPd, T01QD18_A4699RecBarOrd
            }
            , new Object[] {
            T01QD19_A396EmprCod, T01QD19_A129BarCod, T01QD19_A132BarCodReo, T01QD19_A130BarCodPar, T01QD19_A2804RecLinMaq, T01QD19_A1273RecLinPro
            }
            , new Object[] {
            T01QD20_A396EmprCod, T01QD20_A129BarCod, T01QD20_A132BarCodReo, T01QD20_A130BarCodPar, T01QD20_A2804RecLinMaq
            }
            , new Object[] {
            T01QD21_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z1272UltLinPro ;
   private byte Z4575RecMaqPes ;
   private byte Z4701RecRecep ;
   private byte Z4700RecEnvio ;
   private byte Z7765RecMaqVX ;
   private byte Z7766RecMaqBL ;
   private byte Z7767RecMaqFlow ;
   private byte Z7772RecMaqTej ;
   private byte Z7773RecMaqDel ;
   private byte Z10128Rsedo5 ;
   private byte Z10129Rsedo6 ;
   private byte Z10385RecCAut ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A218BarTipCol ;
   private byte A1272UltLinPro ;
   private byte A4575RecMaqPes ;
   private byte A4701RecRecep ;
   private byte A4700RecEnvio ;
   private byte A7765RecMaqVX ;
   private byte A7766RecMaqBL ;
   private byte A7767RecMaqFlow ;
   private byte A7772RecMaqTej ;
   private byte A7773RecMaqDel ;
   private byte A10128Rsedo5 ;
   private byte A10129Rsedo6 ;
   private byte A10385RecCAut ;
   private byte Z218BarTipCol ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private byte ZZ1272UltLinPro ;
   private byte ZZ4575RecMaqPes ;
   private byte ZZ4701RecRecep ;
   private byte ZZ4700RecEnvio ;
   private byte ZZ7765RecMaqVX ;
   private byte ZZ7766RecMaqBL ;
   private byte ZZ7767RecMaqFlow ;
   private byte ZZ7772RecMaqTej ;
   private byte ZZ7773RecMaqDel ;
   private byte ZZ10128Rsedo5 ;
   private byte ZZ10129Rsedo6 ;
   private byte ZZ10385RecCAut ;
   private byte ZZ218BarTipCol ;
   private short Z2804RecLinMaq ;
   private short Z5111RecBp12 ;
   private short Z5112RecBp13 ;
   private short Z5113RecBp14 ;
   private short Z5114RecBp15 ;
   private short Z7764RecMaqNh ;
   private short Z7768RecMaqRPM ;
   private short Z7769RecMaqMol ;
   private short Z7770RecMaqTor ;
   private short Z7774RecMaqPML ;
   private short Z10126Rsedo3 ;
   private short Z12272Rsedo9 ;
   private short Z12273Rsedo10 ;
   private short Z12274Rsedo11 ;
   private short Z12900Rsedo12 ;
   private short Z12901Rsedo13 ;
   private short A2804RecLinMaq ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5111RecBp12 ;
   private short A5112RecBp13 ;
   private short A5113RecBp14 ;
   private short A5114RecBp15 ;
   private short A7764RecMaqNh ;
   private short A7768RecMaqRPM ;
   private short A7769RecMaqMol ;
   private short A7770RecMaqTor ;
   private short A7774RecMaqPML ;
   private short A10126Rsedo3 ;
   private short A12272Rsedo9 ;
   private short A12273Rsedo10 ;
   private short A12274Rsedo11 ;
   private short A12900Rsedo12 ;
   private short A12901Rsedo13 ;
   private short RcdFound408 ;
   private short nIsDirty_408 ;
   private short ZZ2804RecLinMaq ;
   private short ZZ5111RecBp12 ;
   private short ZZ5112RecBp13 ;
   private short ZZ5113RecBp14 ;
   private short ZZ5114RecBp15 ;
   private short ZZ7764RecMaqNh ;
   private short ZZ7768RecMaqRPM ;
   private short ZZ7769RecMaqMol ;
   private short ZZ7770RecMaqTor ;
   private short ZZ7774RecMaqPML ;
   private short ZZ10126Rsedo3 ;
   private short ZZ12272Rsedo9 ;
   private short ZZ12273Rsedo10 ;
   private short ZZ12274Rsedo11 ;
   private short ZZ12900Rsedo12 ;
   private short ZZ12901Rsedo13 ;
   private int Z129BarCod ;
   private int Z2805RecVolPrd ;
   private int Z5109RecNumInt ;
   private int Z12902Rsedo14 ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarNHdr_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtBarNomCli_Enabled ;
   private int A1235BarNumCli ;
   private int edtBarNumCli_Enabled ;
   private int edtRecLinMaq_Enabled ;
   private int edtMaqCod_Enabled ;
   private int A2805RecVolPrd ;
   private int edtRecVolPrd_Enabled ;
   private int edtRecFA_Enabled ;
   private int edtUltLinPro_Enabled ;
   private int edtRecUsrCod_Enabled ;
   private int edtRecFecPes_Enabled ;
   private int edtRecMaqPes_Enabled ;
   private int A5109RecNumInt ;
   private int edtRecNumInt_Enabled ;
   private int edtRecNumPrg_Enabled ;
   private int edtRecBp12_Enabled ;
   private int edtRecBp13_Enabled ;
   private int edtRecBp14_Enabled ;
   private int edtRecBp15_Enabled ;
   private int edtRecAbsFac_Enabled ;
   private int edtRecRecep_Enabled ;
   private int edtRecEnvio_Enabled ;
   private int edtRecPrg2_Enabled ;
   private int edtRecPrg3_Enabled ;
   private int edtRecMaqNh_Enabled ;
   private int edtRecMaqVX_Enabled ;
   private int edtRecMaqBL_Enabled ;
   private int edtRecMaqFlow_Enabled ;
   private int edtRecMaqRPM_Enabled ;
   private int edtRecMaqMol_Enabled ;
   private int edtRecMaqTor_Enabled ;
   private int edtRecMaqCla_Enabled ;
   private int edtRecMaqTej_Enabled ;
   private int edtRecMaqDel_Enabled ;
   private int edtRecMaqPML_Enabled ;
   private int edtRecMaqObs_Enabled ;
   private int edtRecTotKgs_Enabled ;
   private int edtRsedo1_Enabled ;
   private int edtRsedo2_Enabled ;
   private int edtRsedo3_Enabled ;
   private int edtRsedo4_Enabled ;
   private int edtRsedo5_Enabled ;
   private int edtRsedo6_Enabled ;
   private int edtRecCAut_Enabled ;
   private int edtRsedo7_Enabled ;
   private int edtRsedo8_Enabled ;
   private int edtRsedo9_Enabled ;
   private int edtRsedo10_Enabled ;
   private int edtRsedo11_Enabled ;
   private int edtRsedo12_Enabled ;
   private int edtRsedo13_Enabled ;
   private int A12902Rsedo14 ;
   private int edtRsedo14_Enabled ;
   private int edtRecHayAny_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int Z136BarColNum ;
   private int Z1235BarNumCli ;
   private int idxLst ;
   private int ZZ129BarCod ;
   private int ZZ2805RecVolPrd ;
   private int ZZ5109RecNumInt ;
   private int ZZ12902Rsedo14 ;
   private int ZZ136BarColNum ;
   private int ZZ1235BarNumCli ;
   private java.math.BigDecimal Z2806RecFA ;
   private java.math.BigDecimal Z5115RecAbsFac ;
   private java.math.BigDecimal Z4259RecTotKgs ;
   private java.math.BigDecimal Z10124Rsedo1 ;
   private java.math.BigDecimal Z10125Rsedo2 ;
   private java.math.BigDecimal Z10127Rsedo4 ;
   private java.math.BigDecimal Z12270Rsedo7 ;
   private java.math.BigDecimal Z12271Rsedo8 ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A5115RecAbsFac ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A10124Rsedo1 ;
   private java.math.BigDecimal A10125Rsedo2 ;
   private java.math.BigDecimal A10127Rsedo4 ;
   private java.math.BigDecimal A12270Rsedo7 ;
   private java.math.BigDecimal A12271Rsedo8 ;
   private java.math.BigDecimal ZZ2806RecFA ;
   private java.math.BigDecimal ZZ5115RecAbsFac ;
   private java.math.BigDecimal ZZ4259RecTotKgs ;
   private java.math.BigDecimal ZZ10124Rsedo1 ;
   private java.math.BigDecimal ZZ10125Rsedo2 ;
   private java.math.BigDecimal ZZ10127Rsedo4 ;
   private java.math.BigDecimal ZZ12270Rsedo7 ;
   private java.math.BigDecimal ZZ12271Rsedo8 ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z4402RecUsrCod ;
   private String Z5110RecNumPrg ;
   private String Z6269RecPrg2 ;
   private String Z6270RecPrg3 ;
   private String Z7771RecMaqCla ;
   private String Z602MaqCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
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
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarNHdr_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarTipCol_Internalname ;
   private String edtBarTipCol_Jsonclick ;
   private String edtBarNomCli_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarNumCli_Internalname ;
   private String edtBarNumCli_Jsonclick ;
   private String edtRecLinMaq_Internalname ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtMaqCod_Internalname ;
   private String edtMaqCod_Jsonclick ;
   private String edtRecVolPrd_Internalname ;
   private String edtRecVolPrd_Jsonclick ;
   private String edtRecFA_Internalname ;
   private String edtRecFA_Jsonclick ;
   private String edtUltLinPro_Internalname ;
   private String edtUltLinPro_Jsonclick ;
   private String edtRecUsrCod_Internalname ;
   private String A4402RecUsrCod ;
   private String edtRecUsrCod_Jsonclick ;
   private String edtRecFecPes_Internalname ;
   private String edtRecFecPes_Jsonclick ;
   private String edtRecMaqPes_Internalname ;
   private String edtRecMaqPes_Jsonclick ;
   private String edtRecNumInt_Internalname ;
   private String edtRecNumInt_Jsonclick ;
   private String edtRecNumPrg_Internalname ;
   private String A5110RecNumPrg ;
   private String edtRecNumPrg_Jsonclick ;
   private String edtRecBp12_Internalname ;
   private String edtRecBp12_Jsonclick ;
   private String edtRecBp13_Internalname ;
   private String edtRecBp13_Jsonclick ;
   private String edtRecBp14_Internalname ;
   private String edtRecBp14_Jsonclick ;
   private String edtRecBp15_Internalname ;
   private String edtRecBp15_Jsonclick ;
   private String edtRecAbsFac_Internalname ;
   private String edtRecAbsFac_Jsonclick ;
   private String edtRecRecep_Internalname ;
   private String edtRecRecep_Jsonclick ;
   private String edtRecEnvio_Internalname ;
   private String edtRecEnvio_Jsonclick ;
   private String edtRecPrg2_Internalname ;
   private String A6269RecPrg2 ;
   private String edtRecPrg2_Jsonclick ;
   private String edtRecPrg3_Internalname ;
   private String A6270RecPrg3 ;
   private String edtRecPrg3_Jsonclick ;
   private String edtRecMaqNh_Internalname ;
   private String edtRecMaqNh_Jsonclick ;
   private String edtRecMaqVX_Internalname ;
   private String edtRecMaqVX_Jsonclick ;
   private String edtRecMaqBL_Internalname ;
   private String edtRecMaqBL_Jsonclick ;
   private String edtRecMaqFlow_Internalname ;
   private String edtRecMaqFlow_Jsonclick ;
   private String edtRecMaqRPM_Internalname ;
   private String edtRecMaqRPM_Jsonclick ;
   private String edtRecMaqMol_Internalname ;
   private String edtRecMaqMol_Jsonclick ;
   private String edtRecMaqTor_Internalname ;
   private String edtRecMaqTor_Jsonclick ;
   private String edtRecMaqCla_Internalname ;
   private String A7771RecMaqCla ;
   private String edtRecMaqCla_Jsonclick ;
   private String edtRecMaqTej_Internalname ;
   private String edtRecMaqTej_Jsonclick ;
   private String edtRecMaqDel_Internalname ;
   private String edtRecMaqDel_Jsonclick ;
   private String edtRecMaqPML_Internalname ;
   private String edtRecMaqPML_Jsonclick ;
   private String edtRecMaqObs_Internalname ;
   private String edtRecTotKgs_Internalname ;
   private String edtRecTotKgs_Jsonclick ;
   private String edtRsedo1_Internalname ;
   private String edtRsedo1_Jsonclick ;
   private String edtRsedo2_Internalname ;
   private String edtRsedo2_Jsonclick ;
   private String edtRsedo3_Internalname ;
   private String edtRsedo3_Jsonclick ;
   private String edtRsedo4_Internalname ;
   private String edtRsedo4_Jsonclick ;
   private String edtRsedo5_Internalname ;
   private String edtRsedo5_Jsonclick ;
   private String edtRsedo6_Internalname ;
   private String edtRsedo6_Jsonclick ;
   private String edtRecCAut_Internalname ;
   private String edtRecCAut_Jsonclick ;
   private String edtRsedo7_Internalname ;
   private String edtRsedo7_Jsonclick ;
   private String edtRsedo8_Internalname ;
   private String edtRsedo8_Jsonclick ;
   private String edtRsedo9_Internalname ;
   private String edtRsedo9_Jsonclick ;
   private String edtRsedo10_Internalname ;
   private String edtRsedo10_Jsonclick ;
   private String edtRsedo11_Internalname ;
   private String edtRsedo11_Jsonclick ;
   private String edtRsedo12_Internalname ;
   private String edtRsedo12_Jsonclick ;
   private String edtRsedo13_Internalname ;
   private String edtRsedo13_Jsonclick ;
   private String edtRsedo14_Internalname ;
   private String edtRsedo14_Jsonclick ;
   private String edtRecHayAny_Internalname ;
   private String A14372RecHayAny ;
   private String edtRecHayAny_Jsonclick ;
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
   private String Z212BarSer ;
   private String Z1652BarSerDsc ;
   private String Z135BarColNom ;
   private String Z1234BarNomCli ;
   private String sMode408 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z13696BarNHdr ;
   private String Z14372RecHayAny ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ602MaqCod ;
   private String ZZ4402RecUsrCod ;
   private String ZZ5110RecNumPrg ;
   private String ZZ6269RecPrg2 ;
   private String ZZ6270RecPrg3 ;
   private String ZZ7771RecMaqCla ;
   private String ZZ212BarSer ;
   private String ZZ1652BarSerDsc ;
   private String ZZ135BarColNom ;
   private String ZZ1234BarNomCli ;
   private String ZZ13696BarNHdr ;
   private String ZZ14372RecHayAny ;
   private java.util.Date Z4574RecFecPes ;
   private java.util.Date A4574RecFecPes ;
   private java.util.Date ZZ4574RecFecPes ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private String A8353RecMaqObs ;
   private String Z8353RecMaqObs ;
   private String ZZ8353RecMaqObs ;
   private IDataStoreProvider pr_default ;
   private String[] T01QD6_A8353RecMaqObs ;
   private short[] T01QD6_A2804RecLinMaq ;
   private String[] T01QD6_A212BarSer ;
   private String[] T01QD6_A1652BarSerDsc ;
   private String[] T01QD6_A135BarColNom ;
   private int[] T01QD6_A136BarColNum ;
   private byte[] T01QD6_A218BarTipCol ;
   private String[] T01QD6_A1234BarNomCli ;
   private int[] T01QD6_A1235BarNumCli ;
   private int[] T01QD6_A2805RecVolPrd ;
   private java.math.BigDecimal[] T01QD6_A2806RecFA ;
   private byte[] T01QD6_A1272UltLinPro ;
   private String[] T01QD6_A4402RecUsrCod ;
   private java.util.Date[] T01QD6_A4574RecFecPes ;
   private byte[] T01QD6_A4575RecMaqPes ;
   private int[] T01QD6_A5109RecNumInt ;
   private String[] T01QD6_A5110RecNumPrg ;
   private short[] T01QD6_A5111RecBp12 ;
   private short[] T01QD6_A5112RecBp13 ;
   private short[] T01QD6_A5113RecBp14 ;
   private short[] T01QD6_A5114RecBp15 ;
   private java.math.BigDecimal[] T01QD6_A5115RecAbsFac ;
   private byte[] T01QD6_A4701RecRecep ;
   private byte[] T01QD6_A4700RecEnvio ;
   private String[] T01QD6_A6269RecPrg2 ;
   private String[] T01QD6_A6270RecPrg3 ;
   private short[] T01QD6_A7764RecMaqNh ;
   private byte[] T01QD6_A7765RecMaqVX ;
   private byte[] T01QD6_A7766RecMaqBL ;
   private byte[] T01QD6_A7767RecMaqFlow ;
   private short[] T01QD6_A7768RecMaqRPM ;
   private short[] T01QD6_A7769RecMaqMol ;
   private short[] T01QD6_A7770RecMaqTor ;
   private String[] T01QD6_A7771RecMaqCla ;
   private byte[] T01QD6_A7772RecMaqTej ;
   private byte[] T01QD6_A7773RecMaqDel ;
   private short[] T01QD6_A7774RecMaqPML ;
   private java.math.BigDecimal[] T01QD6_A4259RecTotKgs ;
   private java.math.BigDecimal[] T01QD6_A10124Rsedo1 ;
   private java.math.BigDecimal[] T01QD6_A10125Rsedo2 ;
   private short[] T01QD6_A10126Rsedo3 ;
   private java.math.BigDecimal[] T01QD6_A10127Rsedo4 ;
   private byte[] T01QD6_A10128Rsedo5 ;
   private byte[] T01QD6_A10129Rsedo6 ;
   private byte[] T01QD6_A10385RecCAut ;
   private java.math.BigDecimal[] T01QD6_A12270Rsedo7 ;
   private java.math.BigDecimal[] T01QD6_A12271Rsedo8 ;
   private short[] T01QD6_A12272Rsedo9 ;
   private short[] T01QD6_A12273Rsedo10 ;
   private short[] T01QD6_A12274Rsedo11 ;
   private short[] T01QD6_A12900Rsedo12 ;
   private short[] T01QD6_A12901Rsedo13 ;
   private int[] T01QD6_A12902Rsedo14 ;
   private String[] T01QD6_A396EmprCod ;
   private String[] T01QD6_A602MaqCod ;
   private int[] T01QD6_A129BarCod ;
   private byte[] T01QD6_A132BarCodReo ;
   private String[] T01QD6_A130BarCodPar ;
   private String[] T01QD4_A396EmprCod ;
   private String[] T01QD5_A212BarSer ;
   private String[] T01QD5_A1652BarSerDsc ;
   private String[] T01QD5_A135BarColNom ;
   private int[] T01QD5_A136BarColNum ;
   private byte[] T01QD5_A218BarTipCol ;
   private String[] T01QD5_A1234BarNomCli ;
   private int[] T01QD5_A1235BarNumCli ;
   private String[] T01QD7_A396EmprCod ;
   private String[] T01QD8_A212BarSer ;
   private String[] T01QD8_A1652BarSerDsc ;
   private String[] T01QD8_A135BarColNom ;
   private int[] T01QD8_A136BarColNum ;
   private byte[] T01QD8_A218BarTipCol ;
   private String[] T01QD8_A1234BarNomCli ;
   private int[] T01QD8_A1235BarNumCli ;
   private String[] T01QD9_A396EmprCod ;
   private int[] T01QD9_A129BarCod ;
   private byte[] T01QD9_A132BarCodReo ;
   private String[] T01QD9_A130BarCodPar ;
   private short[] T01QD9_A2804RecLinMaq ;
   private String[] T01QD3_A8353RecMaqObs ;
   private short[] T01QD3_A2804RecLinMaq ;
   private int[] T01QD3_A2805RecVolPrd ;
   private java.math.BigDecimal[] T01QD3_A2806RecFA ;
   private byte[] T01QD3_A1272UltLinPro ;
   private String[] T01QD3_A4402RecUsrCod ;
   private java.util.Date[] T01QD3_A4574RecFecPes ;
   private byte[] T01QD3_A4575RecMaqPes ;
   private int[] T01QD3_A5109RecNumInt ;
   private String[] T01QD3_A5110RecNumPrg ;
   private short[] T01QD3_A5111RecBp12 ;
   private short[] T01QD3_A5112RecBp13 ;
   private short[] T01QD3_A5113RecBp14 ;
   private short[] T01QD3_A5114RecBp15 ;
   private java.math.BigDecimal[] T01QD3_A5115RecAbsFac ;
   private byte[] T01QD3_A4701RecRecep ;
   private byte[] T01QD3_A4700RecEnvio ;
   private String[] T01QD3_A6269RecPrg2 ;
   private String[] T01QD3_A6270RecPrg3 ;
   private short[] T01QD3_A7764RecMaqNh ;
   private byte[] T01QD3_A7765RecMaqVX ;
   private byte[] T01QD3_A7766RecMaqBL ;
   private byte[] T01QD3_A7767RecMaqFlow ;
   private short[] T01QD3_A7768RecMaqRPM ;
   private short[] T01QD3_A7769RecMaqMol ;
   private short[] T01QD3_A7770RecMaqTor ;
   private String[] T01QD3_A7771RecMaqCla ;
   private byte[] T01QD3_A7772RecMaqTej ;
   private byte[] T01QD3_A7773RecMaqDel ;
   private short[] T01QD3_A7774RecMaqPML ;
   private java.math.BigDecimal[] T01QD3_A4259RecTotKgs ;
   private java.math.BigDecimal[] T01QD3_A10124Rsedo1 ;
   private java.math.BigDecimal[] T01QD3_A10125Rsedo2 ;
   private short[] T01QD3_A10126Rsedo3 ;
   private java.math.BigDecimal[] T01QD3_A10127Rsedo4 ;
   private byte[] T01QD3_A10128Rsedo5 ;
   private byte[] T01QD3_A10129Rsedo6 ;
   private byte[] T01QD3_A10385RecCAut ;
   private java.math.BigDecimal[] T01QD3_A12270Rsedo7 ;
   private java.math.BigDecimal[] T01QD3_A12271Rsedo8 ;
   private short[] T01QD3_A12272Rsedo9 ;
   private short[] T01QD3_A12273Rsedo10 ;
   private short[] T01QD3_A12274Rsedo11 ;
   private short[] T01QD3_A12900Rsedo12 ;
   private short[] T01QD3_A12901Rsedo13 ;
   private int[] T01QD3_A12902Rsedo14 ;
   private String[] T01QD3_A396EmprCod ;
   private String[] T01QD3_A602MaqCod ;
   private int[] T01QD3_A129BarCod ;
   private byte[] T01QD3_A132BarCodReo ;
   private String[] T01QD3_A130BarCodPar ;
   private String[] T01QD10_A396EmprCod ;
   private int[] T01QD10_A129BarCod ;
   private byte[] T01QD10_A132BarCodReo ;
   private String[] T01QD10_A130BarCodPar ;
   private short[] T01QD10_A2804RecLinMaq ;
   private String[] T01QD11_A396EmprCod ;
   private int[] T01QD11_A129BarCod ;
   private byte[] T01QD11_A132BarCodReo ;
   private String[] T01QD11_A130BarCodPar ;
   private short[] T01QD11_A2804RecLinMaq ;
   private String[] T01QD2_A8353RecMaqObs ;
   private short[] T01QD2_A2804RecLinMaq ;
   private int[] T01QD2_A2805RecVolPrd ;
   private java.math.BigDecimal[] T01QD2_A2806RecFA ;
   private byte[] T01QD2_A1272UltLinPro ;
   private String[] T01QD2_A4402RecUsrCod ;
   private java.util.Date[] T01QD2_A4574RecFecPes ;
   private byte[] T01QD2_A4575RecMaqPes ;
   private int[] T01QD2_A5109RecNumInt ;
   private String[] T01QD2_A5110RecNumPrg ;
   private short[] T01QD2_A5111RecBp12 ;
   private short[] T01QD2_A5112RecBp13 ;
   private short[] T01QD2_A5113RecBp14 ;
   private short[] T01QD2_A5114RecBp15 ;
   private java.math.BigDecimal[] T01QD2_A5115RecAbsFac ;
   private byte[] T01QD2_A4701RecRecep ;
   private byte[] T01QD2_A4700RecEnvio ;
   private String[] T01QD2_A6269RecPrg2 ;
   private String[] T01QD2_A6270RecPrg3 ;
   private short[] T01QD2_A7764RecMaqNh ;
   private byte[] T01QD2_A7765RecMaqVX ;
   private byte[] T01QD2_A7766RecMaqBL ;
   private byte[] T01QD2_A7767RecMaqFlow ;
   private short[] T01QD2_A7768RecMaqRPM ;
   private short[] T01QD2_A7769RecMaqMol ;
   private short[] T01QD2_A7770RecMaqTor ;
   private String[] T01QD2_A7771RecMaqCla ;
   private byte[] T01QD2_A7772RecMaqTej ;
   private byte[] T01QD2_A7773RecMaqDel ;
   private short[] T01QD2_A7774RecMaqPML ;
   private java.math.BigDecimal[] T01QD2_A4259RecTotKgs ;
   private java.math.BigDecimal[] T01QD2_A10124Rsedo1 ;
   private java.math.BigDecimal[] T01QD2_A10125Rsedo2 ;
   private short[] T01QD2_A10126Rsedo3 ;
   private java.math.BigDecimal[] T01QD2_A10127Rsedo4 ;
   private byte[] T01QD2_A10128Rsedo5 ;
   private byte[] T01QD2_A10129Rsedo6 ;
   private byte[] T01QD2_A10385RecCAut ;
   private java.math.BigDecimal[] T01QD2_A12270Rsedo7 ;
   private java.math.BigDecimal[] T01QD2_A12271Rsedo8 ;
   private short[] T01QD2_A12272Rsedo9 ;
   private short[] T01QD2_A12273Rsedo10 ;
   private short[] T01QD2_A12274Rsedo11 ;
   private short[] T01QD2_A12900Rsedo12 ;
   private short[] T01QD2_A12901Rsedo13 ;
   private int[] T01QD2_A12902Rsedo14 ;
   private String[] T01QD2_A396EmprCod ;
   private String[] T01QD2_A602MaqCod ;
   private int[] T01QD2_A129BarCod ;
   private byte[] T01QD2_A132BarCodReo ;
   private String[] T01QD2_A130BarCodPar ;
   private String[] T01QD15_A212BarSer ;
   private String[] T01QD15_A1652BarSerDsc ;
   private String[] T01QD15_A135BarColNom ;
   private int[] T01QD15_A136BarColNum ;
   private byte[] T01QD15_A218BarTipCol ;
   private String[] T01QD15_A1234BarNomCli ;
   private int[] T01QD15_A1235BarNumCli ;
   private String[] T01QD16_A396EmprCod ;
   private int[] T01QD16_A129BarCod ;
   private byte[] T01QD16_A132BarCodReo ;
   private String[] T01QD16_A130BarCodPar ;
   private short[] T01QD16_A2804RecLinMaq ;
   private short[] T01QD16_A5408RecLinCol ;
   private String[] T01QD17_A396EmprCod ;
   private int[] T01QD17_A129BarCod ;
   private byte[] T01QD17_A132BarCodReo ;
   private String[] T01QD17_A130BarCodPar ;
   private short[] T01QD17_A2804RecLinMaq ;
   private short[] T01QD17_A5257RecLinObs ;
   private String[] T01QD18_A396EmprCod ;
   private int[] T01QD18_A129BarCod ;
   private byte[] T01QD18_A132BarCodReo ;
   private String[] T01QD18_A130BarCodPar ;
   private short[] T01QD18_A2804RecLinMaq ;
   private int[] T01QD18_A4274RecBarCAg ;
   private byte[] T01QD18_A4275RecBarRAg ;
   private String[] T01QD18_A4276RecBarPAg ;
   private int[] T01QD18_A4698RecBarNPd ;
   private short[] T01QD18_A4699RecBarOrd ;
   private String[] T01QD19_A396EmprCod ;
   private int[] T01QD19_A129BarCod ;
   private byte[] T01QD19_A132BarCodReo ;
   private String[] T01QD19_A130BarCodPar ;
   private short[] T01QD19_A2804RecLinMaq ;
   private byte[] T01QD19_A1273RecLinPro ;
   private String[] T01QD20_A396EmprCod ;
   private int[] T01QD20_A129BarCod ;
   private byte[] T01QD20_A132BarCodReo ;
   private String[] T01QD20_A130BarCodPar ;
   private short[] T01QD20_A2804RecLinMaq ;
   private String[] T01QD21_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class recmaq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recmaq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recmaq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recmaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QD2", "SELECT RecMaqObs, RecLinMaq, RecVolPrd, RecFA, UltLinPro, RecUsrCod, RecFecPes, RecMaqPes, RecNumInt, RecNumPrg, RecBp12, RecBp13, RecBp14, RecBp15, RecAbsFac, RecRecep, RecEnvio, RecPrg2, RecPrg3, RecMaqNh, RecMaqVX, RecMaqBL, RecMaqFlow, RecMaqRPM, RecMaqMol, RecMaqTor, RecMaqCla, RecMaqTej, RecMaqDel, RecMaqPML, RecTotKgs, Rsedo1, Rsedo2, Rsedo3, Rsedo4, Rsedo5, Rsedo6, RecCAut, Rsedo7, Rsedo8, Rsedo9, Rsedo10, Rsedo11, Rsedo12, Rsedo13, Rsedo14, EmprCod, MaqCod, BarCod, BarCodReo, BarCodPar FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?  FOR UPDATE OF RecVolPrd, RecFA, UltLinPro, RecUsrCod, RecFecPes, RecMaqPes, RecNumInt, RecNumPrg, RecBp12, RecBp13, RecBp14, RecBp15, RecAbsFac, RecRecep, RecEnvio, RecPrg2, RecPrg3, RecMaqNh, RecMaqVX, RecMaqBL, RecMaqFlow, RecMaqRPM, RecMaqMol, RecMaqTor, RecMaqCla, RecMaqTej, RecMaqDel, RecMaqPML, RecMaqObs, RecTotKgs, Rsedo1, Rsedo2, Rsedo3, Rsedo4, Rsedo5, Rsedo6, RecCAut, Rsedo7, Rsedo8, Rsedo9, Rsedo10, Rsedo11, Rsedo12, Rsedo13, Rsedo14, MaqCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QD3", "SELECT RecMaqObs, RecLinMaq, RecVolPrd, RecFA, UltLinPro, RecUsrCod, RecFecPes, RecMaqPes, RecNumInt, RecNumPrg, RecBp12, RecBp13, RecBp14, RecBp15, RecAbsFac, RecRecep, RecEnvio, RecPrg2, RecPrg3, RecMaqNh, RecMaqVX, RecMaqBL, RecMaqFlow, RecMaqRPM, RecMaqMol, RecMaqTor, RecMaqCla, RecMaqTej, RecMaqDel, RecMaqPML, RecTotKgs, Rsedo1, Rsedo2, Rsedo3, Rsedo4, Rsedo5, Rsedo6, RecCAut, Rsedo7, Rsedo8, Rsedo9, Rsedo10, Rsedo11, Rsedo12, Rsedo13, Rsedo14, EmprCod, MaqCod, BarCod, BarCodReo, BarCodPar FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QD4", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QD5", "SELECT BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol, BarNomCli, BarNumCli FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QD6", "SELECT /*+ FIRST_ROWS(100) */ TM1.RecMaqObs, TM1.RecLinMaq, T2.BarSer, T2.BarSerDsc, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T2.BarNomCli, T2.BarNumCli, TM1.RecVolPrd, TM1.RecFA, TM1.UltLinPro, TM1.RecUsrCod, TM1.RecFecPes, TM1.RecMaqPes, TM1.RecNumInt, TM1.RecNumPrg, TM1.RecBp12, TM1.RecBp13, TM1.RecBp14, TM1.RecBp15, TM1.RecAbsFac, TM1.RecRecep, TM1.RecEnvio, TM1.RecPrg2, TM1.RecPrg3, TM1.RecMaqNh, TM1.RecMaqVX, TM1.RecMaqBL, TM1.RecMaqFlow, TM1.RecMaqRPM, TM1.RecMaqMol, TM1.RecMaqTor, TM1.RecMaqCla, TM1.RecMaqTej, TM1.RecMaqDel, TM1.RecMaqPML, TM1.RecTotKgs, TM1.Rsedo1, TM1.Rsedo2, TM1.Rsedo3, TM1.Rsedo4, TM1.Rsedo5, TM1.Rsedo6, TM1.RecCAut, TM1.Rsedo7, TM1.Rsedo8, TM1.Rsedo9, TM1.Rsedo10, TM1.Rsedo11, TM1.Rsedo12, TM1.Rsedo13, TM1.Rsedo14, TM1.EmprCod, TM1.MaqCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM (TXPRECMAQ TM1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = TM1.EmprCod AND T2.BarCod = TM1.BarCod AND T2.BarCodReo = TM1.BarCodReo AND T2.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.RecLinMaq = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.RecLinMaq ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QD7", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QD8", "SELECT BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol, BarNomCli, BarNumCli FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QD9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QD10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinMaq > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QD11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinMaq < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, RecLinMaq DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QD12", "INSERT INTO TXPRECMAQ(RecLinMaq, RecVolPrd, RecFA, UltLinPro, RecUsrCod, RecFecPes, RecMaqPes, RecNumInt, RecNumPrg, RecBp12, RecBp13, RecBp14, RecBp15, RecAbsFac, RecRecep, RecEnvio, RecPrg2, RecPrg3, RecMaqNh, RecMaqVX, RecMaqBL, RecMaqFlow, RecMaqRPM, RecMaqMol, RecMaqTor, RecMaqCla, RecMaqTej, RecMaqDel, RecMaqPML, RecMaqObs, RecTotKgs, Rsedo1, Rsedo2, Rsedo3, Rsedo4, Rsedo5, Rsedo6, RecCAut, Rsedo7, Rsedo8, Rsedo9, Rsedo10, Rsedo11, Rsedo12, Rsedo13, Rsedo14, EmprCod, MaqCod, BarCod, BarCodReo, BarCodPar, RecMaqFas, RecTotMts, RecTotPrd, RecBarCod, RecBarReo, RecBarPar, RecOrdLin, RecAgrEst, RecRecLan, RecNroPar, RecFecAlt, RecFecMod, RecUsrMod, RecUltObs, RecUltLCo, RecIntCol, RecMatCol, RecFecPla, RecPriPla, RecAcab, RecPriAca, RecLtsSR, RecLtsDf, RecAbs2, RecHdrLts, RecObsq, Recgrm, RecAnc, RecAva, RecAs, RecAi) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, ' ', 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ')", GX_NOMASK, "TXPRECMAQ")
         ,new UpdateCursor("T01QD13", "UPDATE TXPRECMAQ SET RecVolPrd=?, RecFA=?, UltLinPro=?, RecUsrCod=?, RecFecPes=?, RecMaqPes=?, RecNumInt=?, RecNumPrg=?, RecBp12=?, RecBp13=?, RecBp14=?, RecBp15=?, RecAbsFac=?, RecRecep=?, RecEnvio=?, RecPrg2=?, RecPrg3=?, RecMaqNh=?, RecMaqVX=?, RecMaqBL=?, RecMaqFlow=?, RecMaqRPM=?, RecMaqMol=?, RecMaqTor=?, RecMaqCla=?, RecMaqTej=?, RecMaqDel=?, RecMaqPML=?, RecMaqObs=?, RecTotKgs=?, Rsedo1=?, Rsedo2=?, Rsedo3=?, Rsedo4=?, Rsedo5=?, Rsedo6=?, RecCAut=?, Rsedo7=?, Rsedo8=?, Rsedo9=?, Rsedo10=?, Rsedo11=?, Rsedo12=?, Rsedo13=?, Rsedo14=?, MaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK, "TXPRECMAQ")
         ,new UpdateCursor("T01QD14", "DELETE FROM TXPRECMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK, "TXPRECMAQ")
         ,new ForEachCursor("T01QD15", "SELECT BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol, BarNomCli, BarNumCli FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QD16", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QD17", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs FROM TXPOBSREC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QD18", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecBarCAg, RecBarRAg, RecBarPAg, RecBarNPd, RecBarOrd FROM TXPRECFAG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QD19", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QD20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QD21", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((byte[]) buf[20])[0] = rslt.getByte(21);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((short[]) buf[25])[0] = rslt.getShort(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 10);
               ((byte[]) buf[27])[0] = rslt.getByte(28);
               ((byte[]) buf[28])[0] = rslt.getByte(29);
               ((short[]) buf[29])[0] = rslt.getShort(30);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,1);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(33,1);
               ((short[]) buf[33])[0] = rslt.getShort(34);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,2);
               ((byte[]) buf[35])[0] = rslt.getByte(36);
               ((byte[]) buf[36])[0] = rslt.getByte(37);
               ((byte[]) buf[37])[0] = rslt.getByte(38);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(39,1);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(40,1);
               ((short[]) buf[40])[0] = rslt.getShort(41);
               ((short[]) buf[41])[0] = rslt.getShort(42);
               ((short[]) buf[42])[0] = rslt.getShort(43);
               ((short[]) buf[43])[0] = rslt.getShort(44);
               ((short[]) buf[44])[0] = rslt.getShort(45);
               ((int[]) buf[45])[0] = rslt.getInt(46);
               ((String[]) buf[46])[0] = rslt.getString(47, 3);
               ((String[]) buf[47])[0] = rslt.getString(48, 6);
               ((int[]) buf[48])[0] = rslt.getInt(49);
               ((byte[]) buf[49])[0] = rslt.getByte(50);
               ((String[]) buf[50])[0] = rslt.getString(51, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((byte[]) buf[20])[0] = rslt.getByte(21);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((short[]) buf[25])[0] = rslt.getShort(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 10);
               ((byte[]) buf[27])[0] = rslt.getByte(28);
               ((byte[]) buf[28])[0] = rslt.getByte(29);
               ((short[]) buf[29])[0] = rslt.getShort(30);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,1);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(33,1);
               ((short[]) buf[33])[0] = rslt.getShort(34);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,2);
               ((byte[]) buf[35])[0] = rslt.getByte(36);
               ((byte[]) buf[36])[0] = rslt.getByte(37);
               ((byte[]) buf[37])[0] = rslt.getByte(38);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(39,1);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(40,1);
               ((short[]) buf[40])[0] = rslt.getShort(41);
               ((short[]) buf[41])[0] = rslt.getShort(42);
               ((short[]) buf[42])[0] = rslt.getShort(43);
               ((short[]) buf[43])[0] = rslt.getShort(44);
               ((short[]) buf[44])[0] = rslt.getShort(45);
               ((int[]) buf[45])[0] = rslt.getInt(46);
               ((String[]) buf[46])[0] = rslt.getString(47, 3);
               ((String[]) buf[47])[0] = rslt.getString(48, 6);
               ((int[]) buf[48])[0] = rslt.getInt(49);
               ((byte[]) buf[49])[0] = rslt.getByte(50);
               ((String[]) buf[50])[0] = rslt.getString(51, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 6);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((byte[]) buf[23])[0] = rslt.getByte(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 6);
               ((String[]) buf[25])[0] = rslt.getString(26, 6);
               ((short[]) buf[26])[0] = rslt.getShort(27);
               ((byte[]) buf[27])[0] = rslt.getByte(28);
               ((byte[]) buf[28])[0] = rslt.getByte(29);
               ((byte[]) buf[29])[0] = rslt.getByte(30);
               ((short[]) buf[30])[0] = rslt.getShort(31);
               ((short[]) buf[31])[0] = rslt.getShort(32);
               ((short[]) buf[32])[0] = rslt.getShort(33);
               ((String[]) buf[33])[0] = rslt.getString(34, 10);
               ((byte[]) buf[34])[0] = rslt.getByte(35);
               ((byte[]) buf[35])[0] = rslt.getByte(36);
               ((short[]) buf[36])[0] = rslt.getShort(37);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(38,2);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(39,1);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(40,1);
               ((short[]) buf[40])[0] = rslt.getShort(41);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(42,2);
               ((byte[]) buf[42])[0] = rslt.getByte(43);
               ((byte[]) buf[43])[0] = rslt.getByte(44);
               ((byte[]) buf[44])[0] = rslt.getByte(45);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(46,1);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(47,1);
               ((short[]) buf[47])[0] = rslt.getShort(48);
               ((short[]) buf[48])[0] = rslt.getShort(49);
               ((short[]) buf[49])[0] = rslt.getShort(50);
               ((short[]) buf[50])[0] = rslt.getShort(51);
               ((short[]) buf[51])[0] = rslt.getShort(52);
               ((int[]) buf[52])[0] = rslt.getInt(53);
               ((String[]) buf[53])[0] = rslt.getString(54, 3);
               ((String[]) buf[54])[0] = rslt.getString(55, 6);
               ((int[]) buf[55])[0] = rslt.getInt(56);
               ((byte[]) buf[56])[0] = rslt.getByte(57);
               ((String[]) buf[57])[0] = rslt.getString(58, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 6);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 6);
               stmt.setString(18, (String)parms[17], 6);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setByte(20, ((Number) parms[19]).byteValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setShort(24, ((Number) parms[23]).shortValue());
               stmt.setShort(25, ((Number) parms[24]).shortValue());
               stmt.setString(26, (String)parms[25], 10);
               stmt.setByte(27, ((Number) parms[26]).byteValue());
               stmt.setByte(28, ((Number) parms[27]).byteValue());
               stmt.setShort(29, ((Number) parms[28]).shortValue());
               stmt.setLongVarchar(30, (String)parms[29], false);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 2);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[31], 1);
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[32], 1);
               stmt.setShort(34, ((Number) parms[33]).shortValue());
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[34], 2);
               stmt.setByte(36, ((Number) parms[35]).byteValue());
               stmt.setByte(37, ((Number) parms[36]).byteValue());
               stmt.setByte(38, ((Number) parms[37]).byteValue());
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[38], 1);
               stmt.setBigDecimal(40, (java.math.BigDecimal)parms[39], 1);
               stmt.setShort(41, ((Number) parms[40]).shortValue());
               stmt.setShort(42, ((Number) parms[41]).shortValue());
               stmt.setShort(43, ((Number) parms[42]).shortValue());
               stmt.setShort(44, ((Number) parms[43]).shortValue());
               stmt.setShort(45, ((Number) parms[44]).shortValue());
               stmt.setInt(46, ((Number) parms[45]).intValue());
               stmt.setString(47, (String)parms[46], 3);
               stmt.setString(48, (String)parms[47], 6);
               stmt.setInt(49, ((Number) parms[48]).intValue());
               stmt.setByte(50, ((Number) parms[49]).byteValue());
               stmt.setString(51, (String)parms[50], 1);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 8);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 6);
               stmt.setString(17, (String)parms[16], 6);
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setByte(20, ((Number) parms[19]).byteValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setShort(24, ((Number) parms[23]).shortValue());
               stmt.setString(25, (String)parms[24], 10);
               stmt.setByte(26, ((Number) parms[25]).byteValue());
               stmt.setByte(27, ((Number) parms[26]).byteValue());
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               stmt.setLongVarchar(29, (String)parms[28], false);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[29], 2);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 1);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[31], 1);
               stmt.setShort(33, ((Number) parms[32]).shortValue());
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[33], 2);
               stmt.setByte(35, ((Number) parms[34]).byteValue());
               stmt.setByte(36, ((Number) parms[35]).byteValue());
               stmt.setByte(37, ((Number) parms[36]).byteValue());
               stmt.setBigDecimal(38, (java.math.BigDecimal)parms[37], 1);
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[38], 1);
               stmt.setShort(40, ((Number) parms[39]).shortValue());
               stmt.setShort(41, ((Number) parms[40]).shortValue());
               stmt.setShort(42, ((Number) parms[41]).shortValue());
               stmt.setShort(43, ((Number) parms[42]).shortValue());
               stmt.setShort(44, ((Number) parms[43]).shortValue());
               stmt.setInt(45, ((Number) parms[44]).intValue());
               stmt.setString(46, (String)parms[45], 6);
               stmt.setString(47, (String)parms[46], 3);
               stmt.setInt(48, ((Number) parms[47]).intValue());
               stmt.setByte(49, ((Number) parms[48]).byteValue());
               stmt.setString(50, (String)parms[49], 1);
               stmt.setShort(51, ((Number) parms[50]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

