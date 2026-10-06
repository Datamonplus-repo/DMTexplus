package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class exhdpz_impl extends GXDataArea
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
         A6558FasCodn = httpContext.GetPar( "FasCodn") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A6558FasCodn) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
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
         gxload_4( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
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
         gxload_5( A396EmprCod, A2253SalExtAlb, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "EXHDPZ", ""), (short)(0)) ;
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

   public exhdpz_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public exhdpz_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( exhdpz_impl.class ));
   }

   public exhdpz_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "EXHDPZ", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_EXHDPZ.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_EXHDPZ.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtAlb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtAlb_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExtAlb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtAlb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSalExtAlb_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExNln_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExNln_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExNln_Internalname, GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExNln_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6248SalExNln), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6248SalExNln), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExNln_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSalExNln_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarExt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarExt_Internalname, httpContext.getMessage( "Control HDR,1=sal/2=env", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarExt_Internalname, GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarExt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9") : localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarExt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarExt_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasCodn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCodn_Internalname, httpContext.getMessage( "Codigo Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCodn_Internalname, GXutil.rtrim( A6558FasCodn), GXutil.rtrim( localUtil.format( A6558FasCodn, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCodn_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasCodn_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDscMn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDscMn_Internalname, httpContext.getMessage( "Fase Modificable", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDscMn_Internalname, GXutil.rtrim( A14410FasDscMn), GXutil.rtrim( localUtil.format( A14410FasDscMn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDscMn_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasDscMn_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExObs_Internalname, GXutil.rtrim( A6249SalExObs), GXutil.rtrim( localUtil.format( A6249SalExObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExObs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSalExObs_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExFeR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExFeR_Internalname, httpContext.getMessage( "Fecha Recepcion HDR", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSalExFeR_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExFeR_Internalname, localUtil.format(A6250SalExFeR, "99/99/99"), localUtil.format( A6250SalExFeR, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExFeR_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSalExFeR_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSalExFeR_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSalExFeR_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_EXHDPZ.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExKgR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExKgR_Internalname, httpContext.getMessage( "Kgs Recibidos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExKgR_Internalname, GXutil.ltrim( localUtil.ntoc( A6251SalExKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExKgR_Enabled!=0) ? localUtil.format( A6251SalExKgR, "ZZZZZ9.99") : localUtil.format( A6251SalExKgR, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExKgR_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSalExKgR_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExCoR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExCoR_Internalname, httpContext.getMessage( "Pzs Recibidas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExCoR_Internalname, GXutil.ltrim( localUtil.ntoc( A6252SalExCoR, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExCoR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6252SalExCoR), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6252SalExCoR), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExCoR_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSalExCoR_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExEsB_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExEsB_Internalname, httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExEsB_Internalname, GXutil.ltrim( localUtil.ntoc( A6253SalExEsB, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExEsB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6253SalExEsB), "9") : localUtil.format( DecimalUtil.doubleToDec(A6253SalExEsB), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExEsB_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSalExEsB_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExEnt_Internalname, httpContext.getMessage( "Parcial o Total", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExEnt_Internalname, GXutil.rtrim( A6254SalExEnt), GXutil.rtrim( localUtil.format( A6254SalExEnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSalExEnt_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExMtR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExMtR_Internalname, httpContext.getMessage( "Mts Recibidos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExMtR_Internalname, GXutil.ltrim( localUtil.ntoc( A6255SalExMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExMtR_Enabled!=0) ? localUtil.format( A6255SalExMtR, "ZZZZZ9.99") : localUtil.format( A6255SalExMtR, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExMtR_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSalExMtR_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EXHDPZ.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNomCli_Internalname, GXutil.rtrim( A1234BarNomCli), GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNomCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExKgE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExKgE_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExKgE_Internalname, GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExKgE_Enabled!=0) ? localUtil.format( A6256SalExKgE, "ZZZZZ9.99") : localUtil.format( A6256SalExKgE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExKgE_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSalExKgE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExCoE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExCoE_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExCoE_Internalname, GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExCoE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6257SalExCoE), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6257SalExCoE), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExCoE_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSalExCoE_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExMtE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExMtE_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExMtE_Internalname, GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExMtE_Enabled!=0) ? localUtil.format( A6258SalExMtE, "ZZZZZ9.99") : localUtil.format( A6258SalExMtE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExMtE_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSalExMtE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSit_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSit_Internalname, httpContext.getMessage( "Situacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtObsM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtObsM_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtObsM_Internalname, A8654ObsM, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", (short)(0), 1, edtObsM_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_EXHDPZ.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EXHDPZ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EXHDPZ.htm");
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
         Z2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( "Z2253SalExtAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6248SalExNln = (short)(localUtil.ctol( httpContext.cgiGet( "Z6248SalExNln"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14410FasDscMn = httpContext.cgiGet( "Z14410FasDscMn") ;
         Z6249SalExObs = httpContext.cgiGet( "Z6249SalExObs") ;
         Z6250SalExFeR = localUtil.ctod( httpContext.cgiGet( "Z6250SalExFeR"), 0) ;
         Z6251SalExKgR = localUtil.ctond( httpContext.cgiGet( "Z6251SalExKgR")) ;
         Z6252SalExCoR = (int)(localUtil.ctol( httpContext.cgiGet( "Z6252SalExCoR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6253SalExEsB = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6253SalExEsB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6254SalExEnt = httpContext.cgiGet( "Z6254SalExEnt") ;
         Z6255SalExMtR = localUtil.ctond( httpContext.cgiGet( "Z6255SalExMtR")) ;
         Z6256SalExKgE = localUtil.ctond( httpContext.cgiGet( "Z6256SalExKgE")) ;
         Z6257SalExCoE = (int)(localUtil.ctol( httpContext.cgiGet( "Z6257SalExCoE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6258SalExMtE = localUtil.ctond( httpContext.cgiGet( "Z6258SalExMtE")) ;
         Z8654ObsM = httpContext.cgiGet( "Z8654ObsM") ;
         Z6558FasCodn = httpContext.cgiGet( "Z6558FasCodn") ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A457FasCod = httpContext.cgiGet( "FASCOD") ;
         n457FasCod = false ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXTALB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSalExtAlb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2253SalExtAlb = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         }
         else
         {
            A2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         }
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExNln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExNln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXNLN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSalExNln_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6248SalExNln = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
         }
         else
         {
            A6248SalExNln = (short)(localUtil.ctol( httpContext.cgiGet( edtSalExNln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
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
         A2265BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarExt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2265BarExt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2265BarExt", GXutil.str( A2265BarExt, 1, 0));
         A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A6558FasCodn = GXutil.upper( httpContext.cgiGet( edtFasCodn_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
         A14410FasDscMn = httpContext.cgiGet( edtFasDscMn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14410FasDscMn", A14410FasDscMn);
         A6249SalExObs = httpContext.cgiGet( edtSalExObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6249SalExObs", A6249SalExObs);
         if ( localUtil.vcdate( httpContext.cgiGet( edtSalExFeR_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "SALEXFER");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSalExFeR_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6250SalExFeR = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A6250SalExFeR", localUtil.format(A6250SalExFeR, "99/99/99"));
         }
         else
         {
            A6250SalExFeR = localUtil.ctod( httpContext.cgiGet( edtSalExFeR_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6250SalExFeR", localUtil.format(A6250SalExFeR, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSalExKgR_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalExKgR_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXKGR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSalExKgR_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6251SalExKgR = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6251SalExKgR", GXutil.ltrimstr( A6251SalExKgR, 9, 2));
         }
         else
         {
            A6251SalExKgR = localUtil.ctond( httpContext.cgiGet( edtSalExKgR_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6251SalExKgR", GXutil.ltrimstr( A6251SalExKgR, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExCoR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExCoR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXCOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSalExCoR_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6252SalExCoR = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6252SalExCoR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6252SalExCoR), 6, 0));
         }
         else
         {
            A6252SalExCoR = (int)(localUtil.ctol( httpContext.cgiGet( edtSalExCoR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6252SalExCoR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6252SalExCoR), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExEsB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExEsB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXESB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSalExEsB_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6253SalExEsB = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6253SalExEsB", GXutil.str( A6253SalExEsB, 1, 0));
         }
         else
         {
            A6253SalExEsB = (byte)(localUtil.ctol( httpContext.cgiGet( edtSalExEsB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6253SalExEsB", GXutil.str( A6253SalExEsB, 1, 0));
         }
         A6254SalExEnt = httpContext.cgiGet( edtSalExEnt_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6254SalExEnt", A6254SalExEnt);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSalExMtR_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalExMtR_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXMTR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSalExMtR_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6255SalExMtR = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6255SalExMtR", GXutil.ltrimstr( A6255SalExMtR, 9, 2));
         }
         else
         {
            A6255SalExMtR = localUtil.ctond( httpContext.cgiGet( edtSalExMtR_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6255SalExMtR", GXutil.ltrimstr( A6255SalExMtR, 9, 2));
         }
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSalExKgE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalExKgE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXKGE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSalExKgE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6256SalExKgE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
         }
         else
         {
            A6256SalExKgE = localUtil.ctond( httpContext.cgiGet( edtSalExKgE_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXCOE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSalExCoE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6257SalExCoE = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
         }
         else
         {
            A6257SalExCoE = (int)(localUtil.ctol( httpContext.cgiGet( edtSalExCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSalExMtE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalExMtE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXMTE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSalExMtE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6258SalExMtE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
         }
         else
         {
            A6258SalExMtE = localUtil.ctond( httpContext.cgiGet( edtSalExMtE_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
         }
         A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A8654ObsM = httpContext.cgiGet( edtObsM_Internalname) ;
         n8654ObsM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8654ObsM", A8654ObsM);
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
            A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            A6248SalExNln = (short)(GXutil.lval( httpContext.GetPar( "SalExNln"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
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
            initAll1V3910( ) ;
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
      disableAttributes1V3910( ) ;
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

   public void resetCaption1V30( )
   {
   }

   public void zm1V3910( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14410FasDscMn = T01V33_A14410FasDscMn[0] ;
            Z6249SalExObs = T01V33_A6249SalExObs[0] ;
            Z6250SalExFeR = T01V33_A6250SalExFeR[0] ;
            Z6251SalExKgR = T01V33_A6251SalExKgR[0] ;
            Z6252SalExCoR = T01V33_A6252SalExCoR[0] ;
            Z6253SalExEsB = T01V33_A6253SalExEsB[0] ;
            Z6254SalExEnt = T01V33_A6254SalExEnt[0] ;
            Z6255SalExMtR = T01V33_A6255SalExMtR[0] ;
            Z6256SalExKgE = T01V33_A6256SalExKgE[0] ;
            Z6257SalExCoE = T01V33_A6257SalExCoE[0] ;
            Z6258SalExMtE = T01V33_A6258SalExMtE[0] ;
            Z8654ObsM = T01V33_A8654ObsM[0] ;
            Z6558FasCodn = T01V33_A6558FasCodn[0] ;
            Z129BarCod = T01V33_A129BarCod[0] ;
            Z132BarCodReo = T01V33_A132BarCodReo[0] ;
            Z130BarCodPar = T01V33_A130BarCodPar[0] ;
         }
         else
         {
            Z14410FasDscMn = A14410FasDscMn ;
            Z6249SalExObs = A6249SalExObs ;
            Z6250SalExFeR = A6250SalExFeR ;
            Z6251SalExKgR = A6251SalExKgR ;
            Z6252SalExCoR = A6252SalExCoR ;
            Z6253SalExEsB = A6253SalExEsB ;
            Z6254SalExEnt = A6254SalExEnt ;
            Z6255SalExMtR = A6255SalExMtR ;
            Z6256SalExKgE = A6256SalExKgE ;
            Z6257SalExCoE = A6257SalExCoE ;
            Z6258SalExMtE = A6258SalExMtE ;
            Z8654ObsM = A8654ObsM ;
            Z6558FasCodn = A6558FasCodn ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z6248SalExNln = A6248SalExNln ;
         Z14410FasDscMn = A14410FasDscMn ;
         Z6249SalExObs = A6249SalExObs ;
         Z6250SalExFeR = A6250SalExFeR ;
         Z6251SalExKgR = A6251SalExKgR ;
         Z6252SalExCoR = A6252SalExCoR ;
         Z6253SalExEsB = A6253SalExEsB ;
         Z6254SalExEnt = A6254SalExEnt ;
         Z6255SalExMtR = A6255SalExMtR ;
         Z6256SalExKgE = A6256SalExKgE ;
         Z6257SalExCoE = A6257SalExCoE ;
         Z6258SalExMtE = A6258SalExMtE ;
         Z8654ObsM = A8654ObsM ;
         Z396EmprCod = A396EmprCod ;
         Z6558FasCodn = A6558FasCodn ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2253SalExtAlb = A2253SalExtAlb ;
         Z407EmprNom = A407EmprNom ;
         Z2265BarExt = A2265BarExt ;
         Z212BarSer = A212BarSer ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z1234BarNomCli = A1234BarNomCli ;
         Z213BarSit = A213BarSit ;
         Z252CliCod = A252CliCod ;
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

   public void load1V3910( )
   {
      /* Using cursor T01V39 */
      pr_default.execute(7, new Object[] {Short.valueOf(A6248SalExNln), A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound910 = (short)(1) ;
         A407EmprNom = T01V39_A407EmprNom[0] ;
         n407EmprNom = T01V39_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2265BarExt = T01V39_A2265BarExt[0] ;
         n2265BarExt = T01V39_n2265BarExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2265BarExt", GXutil.str( A2265BarExt, 1, 0));
         A212BarSer = T01V39_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A14410FasDscMn = T01V39_A14410FasDscMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14410FasDscMn", A14410FasDscMn);
         A6249SalExObs = T01V39_A6249SalExObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6249SalExObs", A6249SalExObs);
         A6250SalExFeR = T01V39_A6250SalExFeR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6250SalExFeR", localUtil.format(A6250SalExFeR, "99/99/99"));
         A6251SalExKgR = T01V39_A6251SalExKgR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6251SalExKgR", GXutil.ltrimstr( A6251SalExKgR, 9, 2));
         A6252SalExCoR = T01V39_A6252SalExCoR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6252SalExCoR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6252SalExCoR), 6, 0));
         A6253SalExEsB = T01V39_A6253SalExEsB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6253SalExEsB", GXutil.str( A6253SalExEsB, 1, 0));
         A6254SalExEnt = T01V39_A6254SalExEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6254SalExEnt", A6254SalExEnt);
         A6255SalExMtR = T01V39_A6255SalExMtR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6255SalExMtR", GXutil.ltrimstr( A6255SalExMtR, 9, 2));
         A135BarColNom = T01V39_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01V39_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A1234BarNomCli = T01V39_A1234BarNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A6256SalExKgE = T01V39_A6256SalExKgE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
         A6257SalExCoE = T01V39_A6257SalExCoE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
         A6258SalExMtE = T01V39_A6258SalExMtE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
         A213BarSit = T01V39_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A8654ObsM = T01V39_A8654ObsM[0] ;
         n8654ObsM = T01V39_n8654ObsM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8654ObsM", A8654ObsM);
         A6558FasCodn = T01V39_A6558FasCodn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
         A129BarCod = T01V39_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01V39_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01V39_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A252CliCod = T01V39_A252CliCod[0] ;
         n252CliCod = T01V39_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1V3910( -1) ;
      }
      pr_default.close(7);
      onLoadActions1V3910( ) ;
   }

   public void onLoadActions1V3910( )
   {
   }

   public void checkExtendedTable1V3910( )
   {
      nIsDirty_910 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01V34 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01V34_A407EmprNom[0] ;
      n407EmprNom = T01V34_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01V35 */
      pr_default.execute(3, new Object[] {A396EmprCod, A6558FasCodn});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCODN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      /* Using cursor T01V36 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2265BarExt = T01V36_A2265BarExt[0] ;
      n2265BarExt = T01V36_n2265BarExt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2265BarExt", GXutil.str( A2265BarExt, 1, 0));
      A212BarSer = T01V36_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A135BarColNom = T01V36_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01V36_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A1234BarNomCli = T01V36_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A213BarSit = T01V36_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A252CliCod = T01V36_A252CliCod[0] ;
      n252CliCod = T01V36_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(4);
      /* Using cursor T01V37 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LEXTSA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1V3910( )
   {
      pr_default.close(2);
      pr_default.close(6);
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01V310 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01V310_A407EmprNom[0] ;
      n407EmprNom = T01V310_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_3( String A396EmprCod ,
                         String A6558FasCodn )
   {
      /* Using cursor T01V35 */
      pr_default.execute(3, new Object[] {A396EmprCod, A6558FasCodn});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCODN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(3) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void gxload_4( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01V311 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2265BarExt = T01V311_A2265BarExt[0] ;
      n2265BarExt = T01V311_n2265BarExt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2265BarExt", GXutil.str( A2265BarExt, 1, 0));
      A212BarSer = T01V311_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A135BarColNom = T01V311_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01V311_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A1234BarNomCli = T01V311_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A213BarSit = T01V311_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A252CliCod = T01V311_A252CliCod[0] ;
      n252CliCod = T01V311_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1234BarNomCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
                         int A2253SalExtAlb ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01V312 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LEXTSA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
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

   public void getKey1V3910( )
   {
      /* Using cursor T01V313 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound910 = (short)(1) ;
      }
      else
      {
         RcdFound910 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01V33 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1V3910( 1) ;
         RcdFound910 = (short)(1) ;
         A6248SalExNln = T01V33_A6248SalExNln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
         A14410FasDscMn = T01V33_A14410FasDscMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14410FasDscMn", A14410FasDscMn);
         A6249SalExObs = T01V33_A6249SalExObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6249SalExObs", A6249SalExObs);
         A6250SalExFeR = T01V33_A6250SalExFeR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6250SalExFeR", localUtil.format(A6250SalExFeR, "99/99/99"));
         A6251SalExKgR = T01V33_A6251SalExKgR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6251SalExKgR", GXutil.ltrimstr( A6251SalExKgR, 9, 2));
         A6252SalExCoR = T01V33_A6252SalExCoR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6252SalExCoR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6252SalExCoR), 6, 0));
         A6253SalExEsB = T01V33_A6253SalExEsB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6253SalExEsB", GXutil.str( A6253SalExEsB, 1, 0));
         A6254SalExEnt = T01V33_A6254SalExEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6254SalExEnt", A6254SalExEnt);
         A6255SalExMtR = T01V33_A6255SalExMtR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6255SalExMtR", GXutil.ltrimstr( A6255SalExMtR, 9, 2));
         A6256SalExKgE = T01V33_A6256SalExKgE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
         A6257SalExCoE = T01V33_A6257SalExCoE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
         A6258SalExMtE = T01V33_A6258SalExMtE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
         A8654ObsM = T01V33_A8654ObsM[0] ;
         n8654ObsM = T01V33_n8654ObsM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8654ObsM", A8654ObsM);
         A396EmprCod = T01V33_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6558FasCodn = T01V33_A6558FasCodn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
         A129BarCod = T01V33_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01V33_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01V33_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2253SalExtAlb = T01V33_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z2253SalExtAlb = A2253SalExtAlb ;
         Z6248SalExNln = A6248SalExNln ;
         sMode910 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1V3910( ) ;
         if ( AnyError == 1 )
         {
            RcdFound910 = (short)(0) ;
            initializeNonKey1V3910( ) ;
         }
         Gx_mode = sMode910 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound910 = (short)(0) ;
         initializeNonKey1V3910( ) ;
         sMode910 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode910 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1V3910( ) ;
      if ( RcdFound910 == 0 )
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
      RcdFound910 = (short)(0) ;
      /* Using cursor T01V314 */
      pr_default.execute(12, new Object[] {Short.valueOf(A6248SalExNln), Short.valueOf(A6248SalExNln), A396EmprCod, A396EmprCod, Short.valueOf(A6248SalExNln), Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01V314_A6248SalExNln[0] < A6248SalExNln ) || ( T01V314_A6248SalExNln[0] == A6248SalExNln ) && ( GXutil.strcmp(T01V314_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01V314_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V314_A6248SalExNln[0] == A6248SalExNln ) && ( T01V314_A2253SalExtAlb[0] < A2253SalExtAlb ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01V314_A6248SalExNln[0] > A6248SalExNln ) || ( T01V314_A6248SalExNln[0] == A6248SalExNln ) && ( GXutil.strcmp(T01V314_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01V314_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V314_A6248SalExNln[0] == A6248SalExNln ) && ( T01V314_A2253SalExtAlb[0] > A2253SalExtAlb ) ) )
         {
            A6248SalExNln = T01V314_A6248SalExNln[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
            A396EmprCod = T01V314_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2253SalExtAlb = T01V314_A2253SalExtAlb[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            RcdFound910 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound910 = (short)(0) ;
      /* Using cursor T01V315 */
      pr_default.execute(13, new Object[] {Short.valueOf(A6248SalExNln), Short.valueOf(A6248SalExNln), A396EmprCod, A396EmprCod, Short.valueOf(A6248SalExNln), Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T01V315_A6248SalExNln[0] > A6248SalExNln ) || ( T01V315_A6248SalExNln[0] == A6248SalExNln ) && ( GXutil.strcmp(T01V315_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01V315_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V315_A6248SalExNln[0] == A6248SalExNln ) && ( T01V315_A2253SalExtAlb[0] > A2253SalExtAlb ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T01V315_A6248SalExNln[0] < A6248SalExNln ) || ( T01V315_A6248SalExNln[0] == A6248SalExNln ) && ( GXutil.strcmp(T01V315_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01V315_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01V315_A6248SalExNln[0] == A6248SalExNln ) && ( T01V315_A2253SalExtAlb[0] < A2253SalExtAlb ) ) )
         {
            A6248SalExNln = T01V315_A6248SalExNln[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
            A396EmprCod = T01V315_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2253SalExtAlb = T01V315_A2253SalExtAlb[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            RcdFound910 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1V3910( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1V3910( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound910 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) || ( A6248SalExNln != Z6248SalExNln ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A2253SalExtAlb = Z2253SalExtAlb ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
               A6248SalExNln = Z6248SalExNln ;
               httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
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
               update1V3910( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) || ( A6248SalExNln != Z6248SalExNln ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1V3910( ) ;
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
                  insert1V3910( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) || ( A6248SalExNln != Z6248SalExNln ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2253SalExtAlb = Z2253SalExtAlb ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         A6248SalExNln = Z6248SalExNln ;
         httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
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
      if ( RcdFound910 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1V3910( ) ;
      if ( RcdFound910 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1V3910( ) ;
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
      if ( RcdFound910 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
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
      if ( RcdFound910 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
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
      scanStart1V3910( ) ;
      if ( RcdFound910 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound910 != 0 )
         {
            scanNext1V3910( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1V3910( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1V3910( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01V32 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEXHDPZ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14410FasDscMn, T01V32_A14410FasDscMn[0]) != 0 ) || ( GXutil.strcmp(Z6249SalExObs, T01V32_A6249SalExObs[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z6250SalExFeR), GXutil.resetTime(T01V32_A6250SalExFeR[0])) ) || ( DecimalUtil.compareTo(Z6251SalExKgR, T01V32_A6251SalExKgR[0]) != 0 ) || ( Z6252SalExCoR != T01V32_A6252SalExCoR[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6253SalExEsB != T01V32_A6253SalExEsB[0] ) || ( GXutil.strcmp(Z6254SalExEnt, T01V32_A6254SalExEnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z6255SalExMtR, T01V32_A6255SalExMtR[0]) != 0 ) || ( DecimalUtil.compareTo(Z6256SalExKgE, T01V32_A6256SalExKgE[0]) != 0 ) || ( Z6257SalExCoE != T01V32_A6257SalExCoE[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6258SalExMtE, T01V32_A6258SalExMtE[0]) != 0 ) || ( GXutil.strcmp(Z8654ObsM, T01V32_A8654ObsM[0]) != 0 ) || ( GXutil.strcmp(Z6558FasCodn, T01V32_A6558FasCodn[0]) != 0 ) || ( Z129BarCod != T01V32_A129BarCod[0] ) || ( Z132BarCodReo != T01V32_A132BarCodReo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z130BarCodPar, T01V32_A130BarCodPar[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z14410FasDscMn, T01V32_A14410FasDscMn[0]) != 0 )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"FasDscMn");
               GXutil.writeLogRaw("Old: ",Z14410FasDscMn);
               GXutil.writeLogRaw("Current: ",T01V32_A14410FasDscMn[0]);
            }
            if ( GXutil.strcmp(Z6249SalExObs, T01V32_A6249SalExObs[0]) != 0 )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"SalExObs");
               GXutil.writeLogRaw("Old: ",Z6249SalExObs);
               GXutil.writeLogRaw("Current: ",T01V32_A6249SalExObs[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z6250SalExFeR), GXutil.resetTime(T01V32_A6250SalExFeR[0])) ) )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"SalExFeR");
               GXutil.writeLogRaw("Old: ",Z6250SalExFeR);
               GXutil.writeLogRaw("Current: ",T01V32_A6250SalExFeR[0]);
            }
            if ( DecimalUtil.compareTo(Z6251SalExKgR, T01V32_A6251SalExKgR[0]) != 0 )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"SalExKgR");
               GXutil.writeLogRaw("Old: ",Z6251SalExKgR);
               GXutil.writeLogRaw("Current: ",T01V32_A6251SalExKgR[0]);
            }
            if ( Z6252SalExCoR != T01V32_A6252SalExCoR[0] )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"SalExCoR");
               GXutil.writeLogRaw("Old: ",Z6252SalExCoR);
               GXutil.writeLogRaw("Current: ",T01V32_A6252SalExCoR[0]);
            }
            if ( Z6253SalExEsB != T01V32_A6253SalExEsB[0] )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"SalExEsB");
               GXutil.writeLogRaw("Old: ",Z6253SalExEsB);
               GXutil.writeLogRaw("Current: ",T01V32_A6253SalExEsB[0]);
            }
            if ( GXutil.strcmp(Z6254SalExEnt, T01V32_A6254SalExEnt[0]) != 0 )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"SalExEnt");
               GXutil.writeLogRaw("Old: ",Z6254SalExEnt);
               GXutil.writeLogRaw("Current: ",T01V32_A6254SalExEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z6255SalExMtR, T01V32_A6255SalExMtR[0]) != 0 )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"SalExMtR");
               GXutil.writeLogRaw("Old: ",Z6255SalExMtR);
               GXutil.writeLogRaw("Current: ",T01V32_A6255SalExMtR[0]);
            }
            if ( DecimalUtil.compareTo(Z6256SalExKgE, T01V32_A6256SalExKgE[0]) != 0 )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"SalExKgE");
               GXutil.writeLogRaw("Old: ",Z6256SalExKgE);
               GXutil.writeLogRaw("Current: ",T01V32_A6256SalExKgE[0]);
            }
            if ( Z6257SalExCoE != T01V32_A6257SalExCoE[0] )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"SalExCoE");
               GXutil.writeLogRaw("Old: ",Z6257SalExCoE);
               GXutil.writeLogRaw("Current: ",T01V32_A6257SalExCoE[0]);
            }
            if ( DecimalUtil.compareTo(Z6258SalExMtE, T01V32_A6258SalExMtE[0]) != 0 )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"SalExMtE");
               GXutil.writeLogRaw("Old: ",Z6258SalExMtE);
               GXutil.writeLogRaw("Current: ",T01V32_A6258SalExMtE[0]);
            }
            if ( GXutil.strcmp(Z8654ObsM, T01V32_A8654ObsM[0]) != 0 )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"ObsM");
               GXutil.writeLogRaw("Old: ",Z8654ObsM);
               GXutil.writeLogRaw("Current: ",T01V32_A8654ObsM[0]);
            }
            if ( GXutil.strcmp(Z6558FasCodn, T01V32_A6558FasCodn[0]) != 0 )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"FasCodn");
               GXutil.writeLogRaw("Old: ",Z6558FasCodn);
               GXutil.writeLogRaw("Current: ",T01V32_A6558FasCodn[0]);
            }
            if ( Z129BarCod != T01V32_A129BarCod[0] )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01V32_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01V32_A132BarCodReo[0] )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01V32_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01V32_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("exhdpz:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01V32_A130BarCodPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEXHDPZ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1V3910( )
   {
      beforeValidate1V3910( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1V3910( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1V3910( 0) ;
         checkOptimisticConcurrency1V3910( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1V3910( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1V3910( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01V316 */
                  pr_default.execute(14, new Object[] {Short.valueOf(A6248SalExNln), A14410FasDscMn, A6249SalExObs, A6250SalExFeR, A6251SalExKgR, Integer.valueOf(A6252SalExCoR), Byte.valueOf(A6253SalExEsB), A6254SalExEnt, A6255SalExMtR, A6256SalExKgE, Integer.valueOf(A6257SalExCoE), A6258SalExMtE, Boolean.valueOf(n8654ObsM), A8654ObsM, A396EmprCod, A6558FasCodn, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A2253SalExtAlb)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
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
                        resetCaption1V30( ) ;
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
            load1V3910( ) ;
         }
         endLevel1V3910( ) ;
      }
      closeExtendedTableCursors1V3910( ) ;
   }

   public void update1V3910( )
   {
      beforeValidate1V3910( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1V3910( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1V3910( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1V3910( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1V3910( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01V317 */
                  pr_default.execute(15, new Object[] {A14410FasDscMn, A6249SalExObs, A6250SalExFeR, A6251SalExKgR, Integer.valueOf(A6252SalExCoR), Byte.valueOf(A6253SalExEsB), A6254SalExEnt, A6255SalExMtR, A6256SalExKgE, Integer.valueOf(A6257SalExCoE), A6258SalExMtE, Boolean.valueOf(n8654ObsM), A8654ObsM, A6558FasCodn, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEXHDPZ"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1V3910( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1V30( ) ;
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
         endLevel1V3910( ) ;
      }
      closeExtendedTableCursors1V3910( ) ;
   }

   public void deferredUpdate1V3910( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1V3910( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1V3910( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1V3910( ) ;
         afterConfirm1V3910( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1V3910( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01V318 */
               pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound910 == 0 )
                     {
                        initAll1V3910( ) ;
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
                     resetCaption1V30( ) ;
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
      sMode910 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1V3910( ) ;
      Gx_mode = sMode910 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1V3910( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01V319 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T01V319_A407EmprNom[0] ;
         n407EmprNom = T01V319_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         /* Using cursor T01V320 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A2265BarExt = T01V320_A2265BarExt[0] ;
         n2265BarExt = T01V320_n2265BarExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2265BarExt", GXutil.str( A2265BarExt, 1, 0));
         A212BarSer = T01V320_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A135BarColNom = T01V320_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01V320_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A1234BarNomCli = T01V320_A1234BarNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A213BarSit = T01V320_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A252CliCod = T01V320_A252CliCod[0] ;
         n252CliCod = T01V320_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(18);
      }
   }

   public void endLevel1V3910( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1V3910( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "exhdpz");
         if ( AnyError == 0 )
         {
            confirmValues1V30( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "exhdpz");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1V3910( )
   {
      /* Using cursor T01V321 */
      pr_default.execute(19);
      RcdFound910 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound910 = (short)(1) ;
         A396EmprCod = T01V321_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2253SalExtAlb = T01V321_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         A6248SalExNln = T01V321_A6248SalExNln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1V3910( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound910 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound910 = (short)(1) ;
         A396EmprCod = T01V321_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2253SalExtAlb = T01V321_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         A6248SalExNln = T01V321_A6248SalExNln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
      }
   }

   public void scanEnd1V3910( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1V3910( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1V3910( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1V3910( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1V3910( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1V3910( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1V3910( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1V3910( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtSalExtAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtSalExNln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExNln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExNln_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarExt_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtFasCodn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCodn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCodn_Enabled), 5, 0), true);
      edtFasDscMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDscMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDscMn_Enabled), 5, 0), true);
      edtSalExObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExObs_Enabled), 5, 0), true);
      edtSalExFeR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExFeR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExFeR_Enabled), 5, 0), true);
      edtSalExKgR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExKgR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExKgR_Enabled), 5, 0), true);
      edtSalExCoR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExCoR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExCoR_Enabled), 5, 0), true);
      edtSalExEsB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExEsB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExEsB_Enabled), 5, 0), true);
      edtSalExEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExEnt_Enabled), 5, 0), true);
      edtSalExMtR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExMtR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExMtR_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Enabled), 5, 0), true);
      edtSalExKgE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExKgE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExKgE_Enabled), 5, 0), true);
      edtSalExCoE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExCoE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExCoE_Enabled), 5, 0), true);
      edtSalExMtE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExMtE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExMtE_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      edtObsM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtObsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtObsM_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1V3910( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1V30( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.exhdpz", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2253SalExtAlb", GXutil.ltrim( localUtil.ntoc( Z2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6248SalExNln", GXutil.ltrim( localUtil.ntoc( Z6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14410FasDscMn", GXutil.rtrim( Z14410FasDscMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6249SalExObs", GXutil.rtrim( Z6249SalExObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6250SalExFeR", localUtil.dtoc( Z6250SalExFeR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6251SalExKgR", GXutil.ltrim( localUtil.ntoc( Z6251SalExKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6252SalExCoR", GXutil.ltrim( localUtil.ntoc( Z6252SalExCoR, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6253SalExEsB", GXutil.ltrim( localUtil.ntoc( Z6253SalExEsB, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6254SalExEnt", GXutil.rtrim( Z6254SalExEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6255SalExMtR", GXutil.ltrim( localUtil.ntoc( Z6255SalExMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6256SalExKgE", GXutil.ltrim( localUtil.ntoc( Z6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6257SalExCoE", GXutil.ltrim( localUtil.ntoc( Z6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6258SalExMtE", GXutil.ltrim( localUtil.ntoc( Z6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8654ObsM", Z8654ObsM);
      app.GxWebStd.gx_hidden_field( httpContext, "Z6558FasCodn", GXutil.rtrim( Z6558FasCodn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
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
      return formatLink("app.exhdpz", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "EXHDPZ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "EXHDPZ", "") ;
   }

   public void initializeNonKey1V3910( )
   {
      A457FasCod = "" ;
      n457FasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2265BarExt = (byte)(0) ;
      n2265BarExt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2265BarExt", GXutil.str( A2265BarExt, 1, 0));
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A6558FasCodn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
      A14410FasDscMn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14410FasDscMn", A14410FasDscMn);
      A6249SalExObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6249SalExObs", A6249SalExObs);
      A6250SalExFeR = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A6250SalExFeR", localUtil.format(A6250SalExFeR, "99/99/99"));
      A6251SalExKgR = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6251SalExKgR", GXutil.ltrimstr( A6251SalExKgR, 9, 2));
      A6252SalExCoR = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6252SalExCoR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6252SalExCoR), 6, 0));
      A6253SalExEsB = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6253SalExEsB", GXutil.str( A6253SalExEsB, 1, 0));
      A6254SalExEnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6254SalExEnt", A6254SalExEnt);
      A6255SalExMtR = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6255SalExMtR", GXutil.ltrimstr( A6255SalExMtR, 9, 2));
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A1234BarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A6256SalExKgE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
      A6257SalExCoE = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
      A6258SalExMtE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A8654ObsM = "" ;
      n8654ObsM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8654ObsM", A8654ObsM);
      Z14410FasDscMn = "" ;
      Z6249SalExObs = "" ;
      Z6250SalExFeR = GXutil.nullDate() ;
      Z6251SalExKgR = DecimalUtil.ZERO ;
      Z6252SalExCoR = 0 ;
      Z6253SalExEsB = (byte)(0) ;
      Z6254SalExEnt = "" ;
      Z6255SalExMtR = DecimalUtil.ZERO ;
      Z6256SalExKgE = DecimalUtil.ZERO ;
      Z6257SalExCoE = 0 ;
      Z6258SalExMtE = DecimalUtil.ZERO ;
      Z8654ObsM = "" ;
      Z6558FasCodn = "" ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
   }

   public void initAll1V3910( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A2253SalExtAlb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      A6248SalExNln = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
      initializeNonKey1V3910( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415124241", true, true);
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
      httpContext.AddJavascriptSource("exhdpz.js", "?202682415124241", false, true);
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
      edtSalExtAlb_Internalname = "SALEXTALB" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtSalExNln_Internalname = "SALEXNLN" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarExt_Internalname = "BAREXT" ;
      edtBarSer_Internalname = "BARSER" ;
      edtFasCodn_Internalname = "FASCODN" ;
      edtFasDscMn_Internalname = "FASDSCMN" ;
      edtSalExObs_Internalname = "SALEXOBS" ;
      edtSalExFeR_Internalname = "SALEXFER" ;
      edtSalExKgR_Internalname = "SALEXKGR" ;
      edtSalExCoR_Internalname = "SALEXCOR" ;
      edtSalExEsB_Internalname = "SALEXESB" ;
      edtSalExEnt_Internalname = "SALEXENT" ;
      edtSalExMtR_Internalname = "SALEXMTR" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      edtSalExKgE_Internalname = "SALEXKGE" ;
      edtSalExCoE_Internalname = "SALEXCOE" ;
      edtSalExMtE_Internalname = "SALEXMTE" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtObsM_Internalname = "OBSM" ;
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
      Form.setCaption( httpContext.getMessage( "EXHDPZ", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtObsM_Enabled = 1 ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Enabled = 0 ;
      edtSalExMtE_Jsonclick = "" ;
      edtSalExMtE_Enabled = 1 ;
      edtSalExCoE_Jsonclick = "" ;
      edtSalExCoE_Enabled = 1 ;
      edtSalExKgE_Jsonclick = "" ;
      edtSalExKgE_Enabled = 1 ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarNomCli_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtSalExMtR_Jsonclick = "" ;
      edtSalExMtR_Enabled = 1 ;
      edtSalExEnt_Jsonclick = "" ;
      edtSalExEnt_Enabled = 1 ;
      edtSalExEsB_Jsonclick = "" ;
      edtSalExEsB_Enabled = 1 ;
      edtSalExCoR_Jsonclick = "" ;
      edtSalExCoR_Enabled = 1 ;
      edtSalExKgR_Jsonclick = "" ;
      edtSalExKgR_Enabled = 1 ;
      edtSalExFeR_Jsonclick = "" ;
      edtSalExFeR_Enabled = 1 ;
      edtSalExObs_Jsonclick = "" ;
      edtSalExObs_Enabled = 1 ;
      edtFasDscMn_Jsonclick = "" ;
      edtFasDscMn_Enabled = 1 ;
      edtFasCodn_Jsonclick = "" ;
      edtFasCodn_Enabled = 1 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Enabled = 0 ;
      edtBarExt_Jsonclick = "" ;
      edtBarExt_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtSalExNln_Jsonclick = "" ;
      edtSalExNln_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtSalExtAlb_Jsonclick = "" ;
      edtSalExtAlb_Enabled = 1 ;
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
      /* Using cursor T01V319 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01V319_A407EmprNom[0] ;
      n407EmprNom = T01V319_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      GX_FocusControl = edtBarCod_Internalname ;
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
      n457FasCod = false ;
      n407EmprNom = false ;
      /* Using cursor T01V319 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01V319_A407EmprNom[0] ;
      n407EmprNom = T01V319_n407EmprNom[0] ;
      pr_default.close(17);
      /* Using cursor T01V322 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Salexnln( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", GXutil.rtrim( A6558FasCodn));
      httpContext.ajax_rsp_assign_attri("", false, "A14410FasDscMn", GXutil.rtrim( A14410FasDscMn));
      httpContext.ajax_rsp_assign_attri("", false, "A6249SalExObs", GXutil.rtrim( A6249SalExObs));
      httpContext.ajax_rsp_assign_attri("", false, "A6250SalExFeR", localUtil.format(A6250SalExFeR, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A6251SalExKgR", GXutil.ltrim( localUtil.ntoc( A6251SalExKgR, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6252SalExCoR", GXutil.ltrim( localUtil.ntoc( A6252SalExCoR, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6253SalExEsB", GXutil.ltrim( localUtil.ntoc( A6253SalExEsB, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6254SalExEnt", GXutil.rtrim( A6254SalExEnt));
      httpContext.ajax_rsp_assign_attri("", false, "A6255SalExMtR", GXutil.ltrim( localUtil.ntoc( A6255SalExMtR, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8654ObsM", A8654ObsM);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2265BarExt", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", GXutil.rtrim( A1234BarNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2253SalExtAlb", GXutil.ltrim( localUtil.ntoc( Z2253SalExtAlb, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6248SalExNln", GXutil.ltrim( localUtil.ntoc( Z6248SalExNln, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6558FasCodn", GXutil.rtrim( Z6558FasCodn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14410FasDscMn", GXutil.rtrim( Z14410FasDscMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6249SalExObs", GXutil.rtrim( Z6249SalExObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6250SalExFeR", localUtil.format(Z6250SalExFeR, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6251SalExKgR", GXutil.ltrim( localUtil.ntoc( Z6251SalExKgR, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6252SalExCoR", GXutil.ltrim( localUtil.ntoc( Z6252SalExCoR, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6253SalExEsB", GXutil.ltrim( localUtil.ntoc( Z6253SalExEsB, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6254SalExEnt", GXutil.rtrim( Z6254SalExEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6255SalExMtR", GXutil.ltrim( localUtil.ntoc( Z6255SalExMtR, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6256SalExKgE", GXutil.ltrim( localUtil.ntoc( Z6256SalExKgE, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6257SalExCoE", GXutil.ltrim( localUtil.ntoc( Z6257SalExCoE, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6258SalExMtE", GXutil.ltrim( localUtil.ntoc( Z6258SalExMtE, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8654ObsM", Z8654ObsM);
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2265BarExt", GXutil.ltrim( localUtil.ntoc( Z2265BarExt, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1234BarNomCli", GXutil.rtrim( Z1234BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      n2265BarExt = false ;
      n252CliCod = false ;
      /* Using cursor T01V320 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A2265BarExt = T01V320_A2265BarExt[0] ;
      n2265BarExt = T01V320_n2265BarExt[0] ;
      A212BarSer = T01V320_A212BarSer[0] ;
      A135BarColNom = T01V320_A135BarColNom[0] ;
      A136BarColNum = T01V320_A136BarColNum[0] ;
      A1234BarNomCli = T01V320_A1234BarNomCli[0] ;
      A213BarSit = T01V320_A213BarSit[0] ;
      A252CliCod = T01V320_A252CliCod[0] ;
      n252CliCod = T01V320_n252CliCod[0] ;
      pr_default.close(18);
      /* Using cursor T01V323 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LEXTSA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2265BarExt", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", GXutil.rtrim( A1234BarNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Fascodn( )
   {
      /* Using cursor T01V324 */
      pr_default.execute(22, new Object[] {A396EmprCod, A6558FasCodn});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCODN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(22);
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_SALEXTALB","{handler:'valid_Salextalb',iparms:[]");
      setEventMetadata("VALID_SALEXTALB",",oparms:[]}");
      setEventMetadata("VALID_SALEXNLN","{handler:'valid_Salexnln',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_SALEXNLN",",oparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'A14410FasDscMn',fld:'FASDSCMN',pic:''},{av:'A6249SalExObs',fld:'SALEXOBS',pic:''},{av:'A6250SalExFeR',fld:'SALEXFER',pic:''},{av:'A6251SalExKgR',fld:'SALEXKGR',pic:'ZZZZZ9.99'},{av:'A6252SalExCoR',fld:'SALEXCOR',pic:'ZZZZZ9'},{av:'A6253SalExEsB',fld:'SALEXESB',pic:'9'},{av:'A6254SalExEnt',fld:'SALEXENT',pic:''},{av:'A6255SalExMtR',fld:'SALEXMTR',pic:'ZZZZZ9.99'},{av:'A6256SalExKgE',fld:'SALEXKGE',pic:'ZZZZZ9.99'},{av:'A6257SalExCoE',fld:'SALEXCOE',pic:'ZZZZZ9'},{av:'A6258SalExMtE',fld:'SALEXMTE',pic:'ZZZZZ9.99'},{av:'A8654ObsM',fld:'OBSM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2253SalExtAlb'},{av:'Z6248SalExNln'},{av:'Z457FasCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z6558FasCodn'},{av:'Z14410FasDscMn'},{av:'Z6249SalExObs'},{av:'Z6250SalExFeR'},{av:'Z6251SalExKgR'},{av:'Z6252SalExCoR'},{av:'Z6253SalExEsB'},{av:'Z6254SalExEnt'},{av:'Z6255SalExMtR'},{av:'Z6256SalExKgE'},{av:'Z6257SalExCoE'},{av:'Z6258SalExMtE'},{av:'Z8654ObsM'},{av:'Z407EmprNom'},{av:'Z2265BarExt'},{av:'Z212BarSer'},{av:'Z135BarColNom'},{av:'Z136BarColNum'},{av:'Z1234BarNomCli'},{av:'Z213BarSit'},{av:'Z252CliCod'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_FASCODN","{handler:'valid_Fascodn',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'}]");
      setEventMetadata("VALID_FASCODN",",oparms:[]}");
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
      pr_default.close(22);
      pr_default.close(20);
      pr_default.close(18);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z14410FasDscMn = "" ;
      Z6249SalExObs = "" ;
      Z6250SalExFeR = GXutil.nullDate() ;
      Z6251SalExKgR = DecimalUtil.ZERO ;
      Z6254SalExEnt = "" ;
      Z6255SalExMtR = DecimalUtil.ZERO ;
      Z6256SalExKgE = DecimalUtil.ZERO ;
      Z6258SalExMtE = DecimalUtil.ZERO ;
      Z8654ObsM = "" ;
      Z6558FasCodn = "" ;
      Z130BarCodPar = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A6558FasCodn = "" ;
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
      A212BarSer = "" ;
      A14410FasDscMn = "" ;
      A6249SalExObs = "" ;
      A6250SalExFeR = GXutil.nullDate() ;
      A6251SalExKgR = DecimalUtil.ZERO ;
      A6254SalExEnt = "" ;
      A6255SalExMtR = DecimalUtil.ZERO ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      A8654ObsM = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      A457FasCod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z407EmprNom = "" ;
      Z212BarSer = "" ;
      Z135BarColNom = "" ;
      Z1234BarNomCli = "" ;
      T01V39_A6248SalExNln = new short[1] ;
      T01V39_A407EmprNom = new String[] {""} ;
      T01V39_n407EmprNom = new boolean[] {false} ;
      T01V39_A2265BarExt = new byte[1] ;
      T01V39_n2265BarExt = new boolean[] {false} ;
      T01V39_A212BarSer = new String[] {""} ;
      T01V39_A14410FasDscMn = new String[] {""} ;
      T01V39_A6249SalExObs = new String[] {""} ;
      T01V39_A6250SalExFeR = new java.util.Date[] {GXutil.nullDate()} ;
      T01V39_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V39_A6252SalExCoR = new int[1] ;
      T01V39_A6253SalExEsB = new byte[1] ;
      T01V39_A6254SalExEnt = new String[] {""} ;
      T01V39_A6255SalExMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V39_A135BarColNom = new String[] {""} ;
      T01V39_A136BarColNum = new int[1] ;
      T01V39_A1234BarNomCli = new String[] {""} ;
      T01V39_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V39_A6257SalExCoE = new int[1] ;
      T01V39_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V39_A213BarSit = new byte[1] ;
      T01V39_A8654ObsM = new String[] {""} ;
      T01V39_n8654ObsM = new boolean[] {false} ;
      T01V39_A396EmprCod = new String[] {""} ;
      T01V39_A6558FasCodn = new String[] {""} ;
      T01V39_A129BarCod = new int[1] ;
      T01V39_A132BarCodReo = new byte[1] ;
      T01V39_A130BarCodPar = new String[] {""} ;
      T01V39_A2253SalExtAlb = new int[1] ;
      T01V39_A252CliCod = new int[1] ;
      T01V39_n252CliCod = new boolean[] {false} ;
      T01V34_A407EmprNom = new String[] {""} ;
      T01V34_n407EmprNom = new boolean[] {false} ;
      T01V35_A457FasCod = new String[] {""} ;
      T01V35_n457FasCod = new boolean[] {false} ;
      T01V36_A2265BarExt = new byte[1] ;
      T01V36_n2265BarExt = new boolean[] {false} ;
      T01V36_A212BarSer = new String[] {""} ;
      T01V36_A135BarColNom = new String[] {""} ;
      T01V36_A136BarColNum = new int[1] ;
      T01V36_A1234BarNomCli = new String[] {""} ;
      T01V36_A213BarSit = new byte[1] ;
      T01V36_A252CliCod = new int[1] ;
      T01V36_n252CliCod = new boolean[] {false} ;
      T01V37_A396EmprCod = new String[] {""} ;
      T01V310_A407EmprNom = new String[] {""} ;
      T01V310_n407EmprNom = new boolean[] {false} ;
      T01V311_A2265BarExt = new byte[1] ;
      T01V311_n2265BarExt = new boolean[] {false} ;
      T01V311_A212BarSer = new String[] {""} ;
      T01V311_A135BarColNom = new String[] {""} ;
      T01V311_A136BarColNum = new int[1] ;
      T01V311_A1234BarNomCli = new String[] {""} ;
      T01V311_A213BarSit = new byte[1] ;
      T01V311_A252CliCod = new int[1] ;
      T01V311_n252CliCod = new boolean[] {false} ;
      T01V312_A396EmprCod = new String[] {""} ;
      T01V313_A396EmprCod = new String[] {""} ;
      T01V313_A2253SalExtAlb = new int[1] ;
      T01V313_A6248SalExNln = new short[1] ;
      T01V33_A6248SalExNln = new short[1] ;
      T01V33_A14410FasDscMn = new String[] {""} ;
      T01V33_A6249SalExObs = new String[] {""} ;
      T01V33_A6250SalExFeR = new java.util.Date[] {GXutil.nullDate()} ;
      T01V33_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V33_A6252SalExCoR = new int[1] ;
      T01V33_A6253SalExEsB = new byte[1] ;
      T01V33_A6254SalExEnt = new String[] {""} ;
      T01V33_A6255SalExMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V33_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V33_A6257SalExCoE = new int[1] ;
      T01V33_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V33_A8654ObsM = new String[] {""} ;
      T01V33_n8654ObsM = new boolean[] {false} ;
      T01V33_A396EmprCod = new String[] {""} ;
      T01V33_A6558FasCodn = new String[] {""} ;
      T01V33_A129BarCod = new int[1] ;
      T01V33_A132BarCodReo = new byte[1] ;
      T01V33_A130BarCodPar = new String[] {""} ;
      T01V33_A2253SalExtAlb = new int[1] ;
      sMode910 = "" ;
      T01V314_A6248SalExNln = new short[1] ;
      T01V314_A396EmprCod = new String[] {""} ;
      T01V314_A2253SalExtAlb = new int[1] ;
      T01V315_A6248SalExNln = new short[1] ;
      T01V315_A396EmprCod = new String[] {""} ;
      T01V315_A2253SalExtAlb = new int[1] ;
      T01V32_A6248SalExNln = new short[1] ;
      T01V32_A14410FasDscMn = new String[] {""} ;
      T01V32_A6249SalExObs = new String[] {""} ;
      T01V32_A6250SalExFeR = new java.util.Date[] {GXutil.nullDate()} ;
      T01V32_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V32_A6252SalExCoR = new int[1] ;
      T01V32_A6253SalExEsB = new byte[1] ;
      T01V32_A6254SalExEnt = new String[] {""} ;
      T01V32_A6255SalExMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V32_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V32_A6257SalExCoE = new int[1] ;
      T01V32_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01V32_A8654ObsM = new String[] {""} ;
      T01V32_n8654ObsM = new boolean[] {false} ;
      T01V32_A396EmprCod = new String[] {""} ;
      T01V32_A6558FasCodn = new String[] {""} ;
      T01V32_A129BarCod = new int[1] ;
      T01V32_A132BarCodReo = new byte[1] ;
      T01V32_A130BarCodPar = new String[] {""} ;
      T01V32_A2253SalExtAlb = new int[1] ;
      T01V319_A407EmprNom = new String[] {""} ;
      T01V319_n407EmprNom = new boolean[] {false} ;
      T01V320_A2265BarExt = new byte[1] ;
      T01V320_n2265BarExt = new boolean[] {false} ;
      T01V320_A212BarSer = new String[] {""} ;
      T01V320_A135BarColNom = new String[] {""} ;
      T01V320_A136BarColNum = new int[1] ;
      T01V320_A1234BarNomCli = new String[] {""} ;
      T01V320_A213BarSit = new byte[1] ;
      T01V320_A252CliCod = new int[1] ;
      T01V320_n252CliCod = new boolean[] {false} ;
      T01V321_A396EmprCod = new String[] {""} ;
      T01V321_A2253SalExtAlb = new int[1] ;
      T01V321_A6248SalExNln = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z457FasCod = "" ;
      T01V322_A457FasCod = new String[] {""} ;
      T01V322_n457FasCod = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ457FasCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ6558FasCodn = "" ;
      ZZ14410FasDscMn = "" ;
      ZZ6249SalExObs = "" ;
      ZZ6250SalExFeR = GXutil.nullDate() ;
      ZZ6251SalExKgR = DecimalUtil.ZERO ;
      ZZ6254SalExEnt = "" ;
      ZZ6255SalExMtR = DecimalUtil.ZERO ;
      ZZ6256SalExKgE = DecimalUtil.ZERO ;
      ZZ6258SalExMtE = DecimalUtil.ZERO ;
      ZZ8654ObsM = "" ;
      ZZ407EmprNom = "" ;
      ZZ212BarSer = "" ;
      ZZ135BarColNom = "" ;
      ZZ1234BarNomCli = "" ;
      T01V323_A396EmprCod = new String[] {""} ;
      T01V324_A457FasCod = new String[] {""} ;
      T01V324_n457FasCod = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.exhdpz__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.exhdpz__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.exhdpz__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.exhdpz__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.exhdpz__default(),
         new Object[] {
             new Object[] {
            T01V32_A6248SalExNln, T01V32_A14410FasDscMn, T01V32_A6249SalExObs, T01V32_A6250SalExFeR, T01V32_A6251SalExKgR, T01V32_A6252SalExCoR, T01V32_A6253SalExEsB, T01V32_A6254SalExEnt, T01V32_A6255SalExMtR, T01V32_A6256SalExKgE,
            T01V32_A6257SalExCoE, T01V32_A6258SalExMtE, T01V32_A8654ObsM, T01V32_n8654ObsM, T01V32_A396EmprCod, T01V32_A6558FasCodn, T01V32_A129BarCod, T01V32_A132BarCodReo, T01V32_A130BarCodPar, T01V32_A2253SalExtAlb
            }
            , new Object[] {
            T01V33_A6248SalExNln, T01V33_A14410FasDscMn, T01V33_A6249SalExObs, T01V33_A6250SalExFeR, T01V33_A6251SalExKgR, T01V33_A6252SalExCoR, T01V33_A6253SalExEsB, T01V33_A6254SalExEnt, T01V33_A6255SalExMtR, T01V33_A6256SalExKgE,
            T01V33_A6257SalExCoE, T01V33_A6258SalExMtE, T01V33_A8654ObsM, T01V33_n8654ObsM, T01V33_A396EmprCod, T01V33_A6558FasCodn, T01V33_A129BarCod, T01V33_A132BarCodReo, T01V33_A130BarCodPar, T01V33_A2253SalExtAlb
            }
            , new Object[] {
            T01V34_A407EmprNom, T01V34_n407EmprNom
            }
            , new Object[] {
            T01V35_A457FasCod
            }
            , new Object[] {
            T01V36_A2265BarExt, T01V36_n2265BarExt, T01V36_A212BarSer, T01V36_A135BarColNom, T01V36_A136BarColNum, T01V36_A1234BarNomCli, T01V36_A213BarSit, T01V36_A252CliCod, T01V36_n252CliCod
            }
            , new Object[] {
            T01V37_A396EmprCod
            }
            , new Object[] {
            T01V38_A457FasCod
            }
            , new Object[] {
            T01V39_A6248SalExNln, T01V39_A407EmprNom, T01V39_n407EmprNom, T01V39_A2265BarExt, T01V39_n2265BarExt, T01V39_A212BarSer, T01V39_A14410FasDscMn, T01V39_A6249SalExObs, T01V39_A6250SalExFeR, T01V39_A6251SalExKgR,
            T01V39_A6252SalExCoR, T01V39_A6253SalExEsB, T01V39_A6254SalExEnt, T01V39_A6255SalExMtR, T01V39_A135BarColNom, T01V39_A136BarColNum, T01V39_A1234BarNomCli, T01V39_A6256SalExKgE, T01V39_A6257SalExCoE, T01V39_A6258SalExMtE,
            T01V39_A213BarSit, T01V39_A8654ObsM, T01V39_n8654ObsM, T01V39_A396EmprCod, T01V39_A6558FasCodn, T01V39_A129BarCod, T01V39_A132BarCodReo, T01V39_A130BarCodPar, T01V39_A2253SalExtAlb, T01V39_A252CliCod,
            T01V39_n252CliCod
            }
            , new Object[] {
            T01V310_A407EmprNom, T01V310_n407EmprNom
            }
            , new Object[] {
            T01V311_A2265BarExt, T01V311_n2265BarExt, T01V311_A212BarSer, T01V311_A135BarColNom, T01V311_A136BarColNum, T01V311_A1234BarNomCli, T01V311_A213BarSit, T01V311_A252CliCod, T01V311_n252CliCod
            }
            , new Object[] {
            T01V312_A396EmprCod
            }
            , new Object[] {
            T01V313_A396EmprCod, T01V313_A2253SalExtAlb, T01V313_A6248SalExNln
            }
            , new Object[] {
            T01V314_A6248SalExNln, T01V314_A396EmprCod, T01V314_A2253SalExtAlb
            }
            , new Object[] {
            T01V315_A6248SalExNln, T01V315_A396EmprCod, T01V315_A2253SalExtAlb
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01V319_A407EmprNom, T01V319_n407EmprNom
            }
            , new Object[] {
            T01V320_A2265BarExt, T01V320_n2265BarExt, T01V320_A212BarSer, T01V320_A135BarColNom, T01V320_A136BarColNum, T01V320_A1234BarNomCli, T01V320_A213BarSit, T01V320_A252CliCod, T01V320_n252CliCod
            }
            , new Object[] {
            T01V321_A396EmprCod, T01V321_A2253SalExtAlb, T01V321_A6248SalExNln
            }
            , new Object[] {
            T01V322_A457FasCod
            }
            , new Object[] {
            T01V323_A396EmprCod
            }
            , new Object[] {
            T01V324_A457FasCod
            }
         }
      );
   }

   private byte Z6253SalExEsB ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A2265BarExt ;
   private byte A6253SalExEsB ;
   private byte A213BarSit ;
   private byte Z2265BarExt ;
   private byte Z213BarSit ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private byte ZZ6253SalExEsB ;
   private byte ZZ2265BarExt ;
   private byte ZZ213BarSit ;
   private short Z6248SalExNln ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6248SalExNln ;
   private short RcdFound910 ;
   private short nIsDirty_910 ;
   private short ZZ6248SalExNln ;
   private int Z2253SalExtAlb ;
   private int Z6252SalExCoR ;
   private int Z6257SalExCoE ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int A2253SalExtAlb ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtSalExtAlb_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtSalExNln_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarExt_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtFasCodn_Enabled ;
   private int edtFasDscMn_Enabled ;
   private int edtSalExObs_Enabled ;
   private int edtSalExFeR_Enabled ;
   private int edtSalExKgR_Enabled ;
   private int A6252SalExCoR ;
   private int edtSalExCoR_Enabled ;
   private int edtSalExEsB_Enabled ;
   private int edtSalExEnt_Enabled ;
   private int edtSalExMtR_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarNomCli_Enabled ;
   private int edtSalExKgE_Enabled ;
   private int A6257SalExCoE ;
   private int edtSalExCoE_Enabled ;
   private int edtSalExMtE_Enabled ;
   private int edtBarSit_Enabled ;
   private int edtObsM_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private int idxLst ;
   private int ZZ2253SalExtAlb ;
   private int ZZ129BarCod ;
   private int ZZ6252SalExCoR ;
   private int ZZ6257SalExCoE ;
   private int ZZ136BarColNum ;
   private int ZZ252CliCod ;
   private java.math.BigDecimal Z6251SalExKgR ;
   private java.math.BigDecimal Z6255SalExMtR ;
   private java.math.BigDecimal Z6256SalExKgE ;
   private java.math.BigDecimal Z6258SalExMtE ;
   private java.math.BigDecimal A6251SalExKgR ;
   private java.math.BigDecimal A6255SalExMtR ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal A6258SalExMtE ;
   private java.math.BigDecimal ZZ6251SalExKgR ;
   private java.math.BigDecimal ZZ6255SalExMtR ;
   private java.math.BigDecimal ZZ6256SalExKgE ;
   private java.math.BigDecimal ZZ6258SalExMtE ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z14410FasDscMn ;
   private String Z6249SalExObs ;
   private String Z6254SalExEnt ;
   private String Z6558FasCodn ;
   private String Z130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A6558FasCodn ;
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
   private String edtSalExtAlb_Internalname ;
   private String edtSalExtAlb_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtSalExNln_Internalname ;
   private String edtSalExNln_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarExt_Internalname ;
   private String edtBarExt_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String edtFasCodn_Internalname ;
   private String edtFasCodn_Jsonclick ;
   private String edtFasDscMn_Internalname ;
   private String A14410FasDscMn ;
   private String edtFasDscMn_Jsonclick ;
   private String edtSalExObs_Internalname ;
   private String A6249SalExObs ;
   private String edtSalExObs_Jsonclick ;
   private String edtSalExFeR_Internalname ;
   private String edtSalExFeR_Jsonclick ;
   private String edtSalExKgR_Internalname ;
   private String edtSalExKgR_Jsonclick ;
   private String edtSalExCoR_Internalname ;
   private String edtSalExCoR_Jsonclick ;
   private String edtSalExEsB_Internalname ;
   private String edtSalExEsB_Jsonclick ;
   private String edtSalExEnt_Internalname ;
   private String A6254SalExEnt ;
   private String edtSalExEnt_Jsonclick ;
   private String edtSalExMtR_Internalname ;
   private String edtSalExMtR_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarNomCli_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Jsonclick ;
   private String edtSalExKgE_Internalname ;
   private String edtSalExKgE_Jsonclick ;
   private String edtSalExCoE_Internalname ;
   private String edtSalExCoE_Jsonclick ;
   private String edtSalExMtE_Internalname ;
   private String edtSalExMtE_Jsonclick ;
   private String edtBarSit_Internalname ;
   private String edtBarSit_Jsonclick ;
   private String edtObsM_Internalname ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String A457FasCod ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z407EmprNom ;
   private String Z212BarSer ;
   private String Z135BarColNom ;
   private String Z1234BarNomCli ;
   private String sMode910 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z457FasCod ;
   private String ZZ396EmprCod ;
   private String ZZ457FasCod ;
   private String ZZ130BarCodPar ;
   private String ZZ6558FasCodn ;
   private String ZZ14410FasDscMn ;
   private String ZZ6249SalExObs ;
   private String ZZ6254SalExEnt ;
   private String ZZ407EmprNom ;
   private String ZZ212BarSer ;
   private String ZZ135BarColNom ;
   private String ZZ1234BarNomCli ;
   private java.util.Date Z6250SalExFeR ;
   private java.util.Date A6250SalExFeR ;
   private java.util.Date ZZ6250SalExFeR ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n457FasCod ;
   private boolean n407EmprNom ;
   private boolean n2265BarExt ;
   private boolean n252CliCod ;
   private boolean n8654ObsM ;
   private boolean Gx_longc ;
   private String Z8654ObsM ;
   private String A8654ObsM ;
   private String ZZ8654ObsM ;
   private IDataStoreProvider pr_default ;
   private short[] T01V39_A6248SalExNln ;
   private String[] T01V39_A407EmprNom ;
   private boolean[] T01V39_n407EmprNom ;
   private byte[] T01V39_A2265BarExt ;
   private boolean[] T01V39_n2265BarExt ;
   private String[] T01V39_A212BarSer ;
   private String[] T01V39_A14410FasDscMn ;
   private String[] T01V39_A6249SalExObs ;
   private java.util.Date[] T01V39_A6250SalExFeR ;
   private java.math.BigDecimal[] T01V39_A6251SalExKgR ;
   private int[] T01V39_A6252SalExCoR ;
   private byte[] T01V39_A6253SalExEsB ;
   private String[] T01V39_A6254SalExEnt ;
   private java.math.BigDecimal[] T01V39_A6255SalExMtR ;
   private String[] T01V39_A135BarColNom ;
   private int[] T01V39_A136BarColNum ;
   private String[] T01V39_A1234BarNomCli ;
   private java.math.BigDecimal[] T01V39_A6256SalExKgE ;
   private int[] T01V39_A6257SalExCoE ;
   private java.math.BigDecimal[] T01V39_A6258SalExMtE ;
   private byte[] T01V39_A213BarSit ;
   private String[] T01V39_A8654ObsM ;
   private boolean[] T01V39_n8654ObsM ;
   private String[] T01V39_A396EmprCod ;
   private String[] T01V39_A6558FasCodn ;
   private int[] T01V39_A129BarCod ;
   private byte[] T01V39_A132BarCodReo ;
   private String[] T01V39_A130BarCodPar ;
   private int[] T01V39_A2253SalExtAlb ;
   private int[] T01V39_A252CliCod ;
   private boolean[] T01V39_n252CliCod ;
   private String[] T01V34_A407EmprNom ;
   private boolean[] T01V34_n407EmprNom ;
   private String[] T01V35_A457FasCod ;
   private boolean[] T01V35_n457FasCod ;
   private byte[] T01V36_A2265BarExt ;
   private boolean[] T01V36_n2265BarExt ;
   private String[] T01V36_A212BarSer ;
   private String[] T01V36_A135BarColNom ;
   private int[] T01V36_A136BarColNum ;
   private String[] T01V36_A1234BarNomCli ;
   private byte[] T01V36_A213BarSit ;
   private int[] T01V36_A252CliCod ;
   private boolean[] T01V36_n252CliCod ;
   private String[] T01V37_A396EmprCod ;
   private String[] T01V310_A407EmprNom ;
   private boolean[] T01V310_n407EmprNom ;
   private byte[] T01V311_A2265BarExt ;
   private boolean[] T01V311_n2265BarExt ;
   private String[] T01V311_A212BarSer ;
   private String[] T01V311_A135BarColNom ;
   private int[] T01V311_A136BarColNum ;
   private String[] T01V311_A1234BarNomCli ;
   private byte[] T01V311_A213BarSit ;
   private int[] T01V311_A252CliCod ;
   private boolean[] T01V311_n252CliCod ;
   private String[] T01V312_A396EmprCod ;
   private String[] T01V313_A396EmprCod ;
   private int[] T01V313_A2253SalExtAlb ;
   private short[] T01V313_A6248SalExNln ;
   private short[] T01V33_A6248SalExNln ;
   private String[] T01V33_A14410FasDscMn ;
   private String[] T01V33_A6249SalExObs ;
   private java.util.Date[] T01V33_A6250SalExFeR ;
   private java.math.BigDecimal[] T01V33_A6251SalExKgR ;
   private int[] T01V33_A6252SalExCoR ;
   private byte[] T01V33_A6253SalExEsB ;
   private String[] T01V33_A6254SalExEnt ;
   private java.math.BigDecimal[] T01V33_A6255SalExMtR ;
   private java.math.BigDecimal[] T01V33_A6256SalExKgE ;
   private int[] T01V33_A6257SalExCoE ;
   private java.math.BigDecimal[] T01V33_A6258SalExMtE ;
   private String[] T01V33_A8654ObsM ;
   private boolean[] T01V33_n8654ObsM ;
   private String[] T01V33_A396EmprCod ;
   private String[] T01V33_A6558FasCodn ;
   private int[] T01V33_A129BarCod ;
   private byte[] T01V33_A132BarCodReo ;
   private String[] T01V33_A130BarCodPar ;
   private int[] T01V33_A2253SalExtAlb ;
   private short[] T01V314_A6248SalExNln ;
   private String[] T01V314_A396EmprCod ;
   private int[] T01V314_A2253SalExtAlb ;
   private short[] T01V315_A6248SalExNln ;
   private String[] T01V315_A396EmprCod ;
   private int[] T01V315_A2253SalExtAlb ;
   private short[] T01V32_A6248SalExNln ;
   private String[] T01V32_A14410FasDscMn ;
   private String[] T01V32_A6249SalExObs ;
   private java.util.Date[] T01V32_A6250SalExFeR ;
   private java.math.BigDecimal[] T01V32_A6251SalExKgR ;
   private int[] T01V32_A6252SalExCoR ;
   private byte[] T01V32_A6253SalExEsB ;
   private String[] T01V32_A6254SalExEnt ;
   private java.math.BigDecimal[] T01V32_A6255SalExMtR ;
   private java.math.BigDecimal[] T01V32_A6256SalExKgE ;
   private int[] T01V32_A6257SalExCoE ;
   private java.math.BigDecimal[] T01V32_A6258SalExMtE ;
   private String[] T01V32_A8654ObsM ;
   private boolean[] T01V32_n8654ObsM ;
   private String[] T01V32_A396EmprCod ;
   private String[] T01V32_A6558FasCodn ;
   private int[] T01V32_A129BarCod ;
   private byte[] T01V32_A132BarCodReo ;
   private String[] T01V32_A130BarCodPar ;
   private int[] T01V32_A2253SalExtAlb ;
   private String[] T01V319_A407EmprNom ;
   private boolean[] T01V319_n407EmprNom ;
   private byte[] T01V320_A2265BarExt ;
   private boolean[] T01V320_n2265BarExt ;
   private String[] T01V320_A212BarSer ;
   private String[] T01V320_A135BarColNom ;
   private int[] T01V320_A136BarColNum ;
   private String[] T01V320_A1234BarNomCli ;
   private byte[] T01V320_A213BarSit ;
   private int[] T01V320_A252CliCod ;
   private boolean[] T01V320_n252CliCod ;
   private String[] T01V321_A396EmprCod ;
   private int[] T01V321_A2253SalExtAlb ;
   private short[] T01V321_A6248SalExNln ;
   private String[] T01V322_A457FasCod ;
   private boolean[] T01V322_n457FasCod ;
   private String[] T01V323_A396EmprCod ;
   private String[] T01V324_A457FasCod ;
   private boolean[] T01V324_n457FasCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] T01V38_A457FasCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class exhdpz__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class exhdpz__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class exhdpz__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class exhdpz__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class exhdpz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01V32", "SELECT SalExNln, FasDscMn, SalExObs, SalExFeR, SalExKgR, SalExCoR, SalExEsB, SalExEnt, SalExMtR, SalExKgE, SalExCoE, SalExMtE, ObsM, EmprCod, FasCodn, BarCod, BarCodReo, BarCodPar, SalExtAlb FROM TXPEXHDPZ WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ?  FOR UPDATE OF FasDscMn, SalExObs, SalExFeR, SalExKgR, SalExCoR, SalExEsB, SalExEnt, SalExMtR, SalExKgE, SalExCoE, SalExMtE, ObsM, FasCodn, BarCod, BarCodReo, BarCodPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V33", "SELECT SalExNln, FasDscMn, SalExObs, SalExFeR, SalExKgR, SalExCoR, SalExEsB, SalExEnt, SalExMtR, SalExKgE, SalExCoE, SalExMtE, ObsM, EmprCod, FasCodn, BarCod, BarCodReo, BarCodPar, SalExtAlb FROM TXPEXHDPZ WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V34", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V35", "SELECT FasCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V36", "SELECT BarExt, BarSer, BarColNom, BarColNum, BarNomCli, BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V37", "SELECT EmprCod FROM TXPLEXTSA WHERE EmprCod = ? AND SalExtAlb = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V38", "SELECT FasCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V39", "SELECT /*+ FIRST_ROWS(100) */ TM1.SalExNln, T2.EmprNom, T3.BarExt, T3.BarSer, TM1.FasDscMn, TM1.SalExObs, TM1.SalExFeR, TM1.SalExKgR, TM1.SalExCoR, TM1.SalExEsB, TM1.SalExEnt, TM1.SalExMtR, T3.BarColNom, T3.BarColNum, T3.BarNomCli, TM1.SalExKgE, TM1.SalExCoE, TM1.SalExMtE, T3.BarSit, TM1.ObsM, TM1.EmprCod, TM1.FasCodn, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.SalExtAlb, T3.CliCod FROM ((TXPEXHDPZ TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) WHERE TM1.SalExNln = ? and TM1.EmprCod = ? and TM1.SalExtAlb = ? ORDER BY TM1.EmprCod, TM1.SalExtAlb, TM1.SalExNln ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V310", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V311", "SELECT BarExt, BarSer, BarColNom, BarColNum, BarNomCli, BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V312", "SELECT EmprCod FROM TXPLEXTSA WHERE EmprCod = ? AND SalExtAlb = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V313", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, SalExtAlb, SalExNln FROM TXPEXHDPZ WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V314", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ SalExNln, EmprCod, SalExtAlb FROM TXPEXHDPZ WHERE ( SalExNln > ? or SalExNln = ? and EmprCod > ? or EmprCod = ? and SalExNln = ? and SalExtAlb > ?) ORDER BY EmprCod, SalExtAlb, SalExNln) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V315", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ SalExNln, EmprCod, SalExtAlb FROM TXPEXHDPZ WHERE ( SalExNln < ? or SalExNln = ? and EmprCod < ? or EmprCod = ? and SalExNln = ? and SalExtAlb < ?) ORDER BY EmprCod DESC, SalExtAlb DESC, SalExNln DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01V316", "INSERT INTO TXPEXHDPZ(SalExNln, FasDscMn, SalExObs, SalExFeR, SalExKgR, SalExCoR, SalExEsB, SalExEnt, SalExMtR, SalExKgE, SalExCoE, SalExMtE, ObsM, EmprCod, FasCodn, BarCod, BarCodReo, BarCodPar, SalExtAlb, OrdLin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPEXHDPZ")
         ,new UpdateCursor("T01V317", "UPDATE TXPEXHDPZ SET FasDscMn=?, SalExObs=?, SalExFeR=?, SalExKgR=?, SalExCoR=?, SalExEsB=?, SalExEnt=?, SalExMtR=?, SalExKgE=?, SalExCoE=?, SalExMtE=?, ObsM=?, FasCodn=?, BarCod=?, BarCodReo=?, BarCodPar=?  WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ?", GX_NOMASK, "TXPEXHDPZ")
         ,new UpdateCursor("T01V318", "DELETE FROM TXPEXHDPZ  WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ?", GX_NOMASK, "TXPEXHDPZ")
         ,new ForEachCursor("T01V319", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V320", "SELECT BarExt, BarSer, BarColNom, BarColNum, BarNomCli, BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V321", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, SalExtAlb, SalExNln FROM TXPEXHDPZ ORDER BY EmprCod, SalExtAlb, SalExNln ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V322", "SELECT FasCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V323", "SELECT EmprCod FROM TXPLEXTSA WHERE EmprCod = ? AND SalExtAlb = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V324", "SELECT FasCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 3);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 3);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((String[]) buf[7])[0] = rslt.getString(6, 40);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 13);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((String[]) buf[21])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(21, 3);
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((int[]) buf[25])[0] = rslt.getInt(23);
               ((byte[]) buf[26])[0] = rslt.getByte(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 1);
               ((int[]) buf[28])[0] = rslt.getInt(26);
               ((int[]) buf[29])[0] = rslt.getInt(27);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
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
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[13], 300);
               }
               stmt.setString(14, (String)parms[14], 3);
               stmt.setString(15, (String)parms[15], 8);
               stmt.setInt(16, ((Number) parms[16]).intValue());
               stmt.setByte(17, ((Number) parms[17]).byteValue());
               stmt.setString(18, (String)parms[18], 1);
               stmt.setInt(19, ((Number) parms[19]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[12], 300);
               }
               stmt.setString(13, (String)parms[13], 8);
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setByte(15, ((Number) parms[15]).byteValue());
               stmt.setString(16, (String)parms[16], 1);
               stmt.setString(17, (String)parms[17], 3);
               stmt.setInt(18, ((Number) parms[18]).intValue());
               stmt.setShort(19, ((Number) parms[19]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 20 :
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
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

