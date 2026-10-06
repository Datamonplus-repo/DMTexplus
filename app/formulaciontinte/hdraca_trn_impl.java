package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hdraca_trn_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Transaccion igual a THDRACA pero estrutura de otra forma", ""), (short)(0)) ;
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

   public hdraca_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hdraca_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hdraca_trn_impl.class ));
   }

   public hdraca_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Transaccion igual a THDRACA pero estrutura de otra forma", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\HDRACA_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_FormulacionTinte\\HDRACA_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\HDRACA_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\HDRACA_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\HDRACA_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\HDRACA_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAcaQui_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAcaQui_Internalname, httpContext.getMessage( "Acs Quimico", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAcaQui_Internalname, GXutil.rtrim( A118BarAcaQui), GXutil.rtrim( localUtil.format( A118BarAcaQui, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAcaQui_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAcaQui_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAc_Barcod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAc_Barcod_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAc_Barcod_Internalname, GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAc_Barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6031Ac_Barcod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6031Ac_Barcod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAc_Barcod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAc_Barcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAc_BarReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAc_BarReo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAc_BarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAc_BarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6032Ac_BarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A6032Ac_BarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAc_BarReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAc_BarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAc_BarPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAc_BarPar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAc_BarPar_Internalname, GXutil.rtrim( A6033Ac_BarPar), GXutil.rtrim( localUtil.format( A6033Ac_BarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAc_BarPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAc_BarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAc_Metros_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAc_Metros_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAc_Metros_Internalname, GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAc_Metros_Enabled!=0) ? localUtil.format( A6034Ac_Metros, "ZZZZZ9.99") : localUtil.format( A6034Ac_Metros, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAc_Metros_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAc_Metros_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAc_Kilos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAc_Kilos_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAc_Kilos_Internalname, GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAc_Kilos_Enabled!=0) ? localUtil.format( A6035Ac_Kilos, "ZZZZZ9.99") : localUtil.format( A6035Ac_Kilos, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAc_Kilos_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAc_Kilos_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAc_Pzs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAc_Pzs_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAc_Pzs_Internalname, GXutil.ltrim( localUtil.ntoc( A6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAc_Pzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6036Ac_Pzs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6036Ac_Pzs), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAc_Pzs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAc_Pzs_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAc_Abs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAc_Abs_Internalname, httpContext.getMessage( "Fact. Abs.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAc_Abs_Internalname, GXutil.ltrim( localUtil.ntoc( A9839Ac_Abs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAc_Abs_Enabled!=0) ? localUtil.format( A9839Ac_Abs, "ZZ9.99") : localUtil.format( A9839Ac_Abs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAc_Abs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAc_Abs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAc_AcaQui_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAc_AcaQui_Internalname, httpContext.getMessage( "Acs", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAc_AcaQui_Internalname, GXutil.rtrim( A9840Ac_AcaQui), GXutil.rtrim( localUtil.format( A9840Ac_AcaQui, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAc_AcaQui_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAc_AcaQui_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\HDRACA_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\HDRACA_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\HDRACA_TRN.htm");
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
         Z6031Ac_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( "Z6031Ac_Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6032Ac_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6032Ac_BarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6033Ac_BarPar = httpContext.cgiGet( "Z6033Ac_BarPar") ;
         Z6034Ac_Metros = localUtil.ctond( httpContext.cgiGet( "Z6034Ac_Metros")) ;
         Z6035Ac_Kilos = localUtil.ctond( httpContext.cgiGet( "Z6035Ac_Kilos")) ;
         Z6036Ac_Pzs = (short)(localUtil.ctol( httpContext.cgiGet( "Z6036Ac_Pzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9839Ac_Abs = localUtil.ctond( httpContext.cgiGet( "Z9839Ac_Abs")) ;
         Z9840Ac_AcaQui = httpContext.cgiGet( "Z9840Ac_AcaQui") ;
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
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A118BarAcaQui = httpContext.cgiGet( edtBarAcaQui_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AC_BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAc_Barcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6031Ac_Barcod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6031Ac_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6031Ac_Barcod), 8, 0));
         }
         else
         {
            A6031Ac_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtAc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6031Ac_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6031Ac_Barcod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AC_BARREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAc_BarReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6032Ac_BarReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6032Ac_BarReo", GXutil.str( A6032Ac_BarReo, 1, 0));
         }
         else
         {
            A6032Ac_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtAc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6032Ac_BarReo", GXutil.str( A6032Ac_BarReo, 1, 0));
         }
         A6033Ac_BarPar = httpContext.cgiGet( edtAc_BarPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6033Ac_BarPar", A6033Ac_BarPar);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAc_Metros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAc_Metros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AC_METROS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAc_Metros_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6034Ac_Metros = DecimalUtil.ZERO ;
            n6034Ac_Metros = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6034Ac_Metros", GXutil.ltrimstr( A6034Ac_Metros, 9, 2));
         }
         else
         {
            A6034Ac_Metros = localUtil.ctond( httpContext.cgiGet( edtAc_Metros_Internalname)) ;
            n6034Ac_Metros = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6034Ac_Metros", GXutil.ltrimstr( A6034Ac_Metros, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAc_Kilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAc_Kilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AC_KILOS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAc_Kilos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6035Ac_Kilos = DecimalUtil.ZERO ;
            n6035Ac_Kilos = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6035Ac_Kilos", GXutil.ltrimstr( A6035Ac_Kilos, 9, 2));
         }
         else
         {
            A6035Ac_Kilos = localUtil.ctond( httpContext.cgiGet( edtAc_Kilos_Internalname)) ;
            n6035Ac_Kilos = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6035Ac_Kilos", GXutil.ltrimstr( A6035Ac_Kilos, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAc_Pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAc_Pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AC_PZS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAc_Pzs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6036Ac_Pzs = (short)(0) ;
            n6036Ac_Pzs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6036Ac_Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6036Ac_Pzs), 4, 0));
         }
         else
         {
            A6036Ac_Pzs = (short)(localUtil.ctol( httpContext.cgiGet( edtAc_Pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6036Ac_Pzs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6036Ac_Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6036Ac_Pzs), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAc_Abs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAc_Abs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AC_ABS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAc_Abs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9839Ac_Abs = DecimalUtil.ZERO ;
            n9839Ac_Abs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9839Ac_Abs", GXutil.ltrimstr( A9839Ac_Abs, 6, 2));
         }
         else
         {
            A9839Ac_Abs = localUtil.ctond( httpContext.cgiGet( edtAc_Abs_Internalname)) ;
            n9839Ac_Abs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9839Ac_Abs", GXutil.ltrimstr( A9839Ac_Abs, 6, 2));
         }
         A9840Ac_AcaQui = httpContext.cgiGet( edtAc_AcaQui_Internalname) ;
         n9840Ac_AcaQui = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9840Ac_AcaQui", A9840Ac_AcaQui);
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
            A6031Ac_Barcod = (int)(GXutil.lval( httpContext.GetPar( "Ac_Barcod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6031Ac_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6031Ac_Barcod), 8, 0));
            A6032Ac_BarReo = (byte)(GXutil.lval( httpContext.GetPar( "Ac_BarReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6032Ac_BarReo", GXutil.str( A6032Ac_BarReo, 1, 0));
            A6033Ac_BarPar = httpContext.GetPar( "Ac_BarPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A6033Ac_BarPar", A6033Ac_BarPar);
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
            initAll1RZ883( ) ;
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
      disableAttributes1RZ883( ) ;
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

   public void resetCaption1RZ0( )
   {
   }

   public void zm1RZ883( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6034Ac_Metros = T01RZ3_A6034Ac_Metros[0] ;
            Z6035Ac_Kilos = T01RZ3_A6035Ac_Kilos[0] ;
            Z6036Ac_Pzs = T01RZ3_A6036Ac_Pzs[0] ;
            Z9839Ac_Abs = T01RZ3_A9839Ac_Abs[0] ;
            Z9840Ac_AcaQui = T01RZ3_A9840Ac_AcaQui[0] ;
         }
         else
         {
            Z6034Ac_Metros = A6034Ac_Metros ;
            Z6035Ac_Kilos = A6035Ac_Kilos ;
            Z6036Ac_Pzs = A6036Ac_Pzs ;
            Z9839Ac_Abs = A9839Ac_Abs ;
            Z9840Ac_AcaQui = A9840Ac_AcaQui ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z6031Ac_Barcod = A6031Ac_Barcod ;
         Z6032Ac_BarReo = A6032Ac_BarReo ;
         Z6033Ac_BarPar = A6033Ac_BarPar ;
         Z6034Ac_Metros = A6034Ac_Metros ;
         Z6035Ac_Kilos = A6035Ac_Kilos ;
         Z6036Ac_Pzs = A6036Ac_Pzs ;
         Z9839Ac_Abs = A9839Ac_Abs ;
         Z9840Ac_AcaQui = A9840Ac_AcaQui ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
         Z118BarAcaQui = A118BarAcaQui ;
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

   public void load1RZ883( )
   {
      /* Using cursor T01RZ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound883 = (short)(1) ;
         A407EmprNom = T01RZ6_A407EmprNom[0] ;
         n407EmprNom = T01RZ6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A118BarAcaQui = T01RZ6_A118BarAcaQui[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
         A6034Ac_Metros = T01RZ6_A6034Ac_Metros[0] ;
         n6034Ac_Metros = T01RZ6_n6034Ac_Metros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6034Ac_Metros", GXutil.ltrimstr( A6034Ac_Metros, 9, 2));
         A6035Ac_Kilos = T01RZ6_A6035Ac_Kilos[0] ;
         n6035Ac_Kilos = T01RZ6_n6035Ac_Kilos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6035Ac_Kilos", GXutil.ltrimstr( A6035Ac_Kilos, 9, 2));
         A6036Ac_Pzs = T01RZ6_A6036Ac_Pzs[0] ;
         n6036Ac_Pzs = T01RZ6_n6036Ac_Pzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6036Ac_Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6036Ac_Pzs), 4, 0));
         A9839Ac_Abs = T01RZ6_A9839Ac_Abs[0] ;
         n9839Ac_Abs = T01RZ6_n9839Ac_Abs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9839Ac_Abs", GXutil.ltrimstr( A9839Ac_Abs, 6, 2));
         A9840Ac_AcaQui = T01RZ6_A9840Ac_AcaQui[0] ;
         n9840Ac_AcaQui = T01RZ6_n9840Ac_AcaQui[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9840Ac_AcaQui", A9840Ac_AcaQui);
         zm1RZ883( -1) ;
      }
      pr_default.close(4);
      onLoadActions1RZ883( ) ;
   }

   public void onLoadActions1RZ883( )
   {
   }

   public void checkExtendedTable1RZ883( )
   {
      nIsDirty_883 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01RZ4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RZ4_A407EmprNom[0] ;
      n407EmprNom = T01RZ4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01RZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A118BarAcaQui = T01RZ5_A118BarAcaQui[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1RZ883( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01RZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RZ7_A407EmprNom[0] ;
      n407EmprNom = T01RZ7_n407EmprNom[0] ;
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
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01RZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A118BarAcaQui = T01RZ8_A118BarAcaQui[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A118BarAcaQui))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1RZ883( )
   {
      /* Using cursor T01RZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound883 = (short)(1) ;
      }
      else
      {
         RcdFound883 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RZ883( 1) ;
         RcdFound883 = (short)(1) ;
         A6031Ac_Barcod = T01RZ3_A6031Ac_Barcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6031Ac_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6031Ac_Barcod), 8, 0));
         A6032Ac_BarReo = T01RZ3_A6032Ac_BarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6032Ac_BarReo", GXutil.str( A6032Ac_BarReo, 1, 0));
         A6033Ac_BarPar = T01RZ3_A6033Ac_BarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6033Ac_BarPar", A6033Ac_BarPar);
         A6034Ac_Metros = T01RZ3_A6034Ac_Metros[0] ;
         n6034Ac_Metros = T01RZ3_n6034Ac_Metros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6034Ac_Metros", GXutil.ltrimstr( A6034Ac_Metros, 9, 2));
         A6035Ac_Kilos = T01RZ3_A6035Ac_Kilos[0] ;
         n6035Ac_Kilos = T01RZ3_n6035Ac_Kilos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6035Ac_Kilos", GXutil.ltrimstr( A6035Ac_Kilos, 9, 2));
         A6036Ac_Pzs = T01RZ3_A6036Ac_Pzs[0] ;
         n6036Ac_Pzs = T01RZ3_n6036Ac_Pzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6036Ac_Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6036Ac_Pzs), 4, 0));
         A9839Ac_Abs = T01RZ3_A9839Ac_Abs[0] ;
         n9839Ac_Abs = T01RZ3_n9839Ac_Abs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9839Ac_Abs", GXutil.ltrimstr( A9839Ac_Abs, 6, 2));
         A9840Ac_AcaQui = T01RZ3_A9840Ac_AcaQui[0] ;
         n9840Ac_AcaQui = T01RZ3_n9840Ac_AcaQui[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9840Ac_AcaQui", A9840Ac_AcaQui);
         A396EmprCod = T01RZ3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RZ3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RZ3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RZ3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z6031Ac_Barcod = A6031Ac_Barcod ;
         Z6032Ac_BarReo = A6032Ac_BarReo ;
         Z6033Ac_BarPar = A6033Ac_BarPar ;
         sMode883 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1RZ883( ) ;
         if ( AnyError == 1 )
         {
            RcdFound883 = (short)(0) ;
            initializeNonKey1RZ883( ) ;
         }
         Gx_mode = sMode883 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound883 = (short)(0) ;
         initializeNonKey1RZ883( ) ;
         sMode883 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode883 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1RZ883( ) ;
      if ( RcdFound883 == 0 )
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
      RcdFound883 = (short)(0) ;
      /* Using cursor T01RZ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Integer.valueOf(A6031Ac_Barcod), Integer.valueOf(A6031Ac_Barcod), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A6032Ac_BarReo), Byte.valueOf(A6032Ac_BarReo), Integer.valueOf(A6031Ac_Barcod), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A6033Ac_BarPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01RZ10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ10_A129BarCod[0] < A129BarCod ) || ( T01RZ10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ10_A132BarCodReo[0] < A132BarCodReo ) || ( T01RZ10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RZ10_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01RZ10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RZ10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ10_A6031Ac_Barcod[0] < A6031Ac_Barcod ) || ( T01RZ10_A6031Ac_Barcod[0] == A6031Ac_Barcod ) && ( GXutil.strcmp(T01RZ10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RZ10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ10_A6032Ac_BarReo[0] < A6032Ac_BarReo ) || ( T01RZ10_A6032Ac_BarReo[0] == A6032Ac_BarReo ) && ( T01RZ10_A6031Ac_Barcod[0] == A6031Ac_Barcod ) && ( GXutil.strcmp(T01RZ10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RZ10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RZ10_A6033Ac_BarPar[0], A6033Ac_BarPar) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01RZ10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ10_A129BarCod[0] > A129BarCod ) || ( T01RZ10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ10_A132BarCodReo[0] > A132BarCodReo ) || ( T01RZ10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RZ10_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01RZ10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RZ10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ10_A6031Ac_Barcod[0] > A6031Ac_Barcod ) || ( T01RZ10_A6031Ac_Barcod[0] == A6031Ac_Barcod ) && ( GXutil.strcmp(T01RZ10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RZ10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ10_A6032Ac_BarReo[0] > A6032Ac_BarReo ) || ( T01RZ10_A6032Ac_BarReo[0] == A6032Ac_BarReo ) && ( T01RZ10_A6031Ac_Barcod[0] == A6031Ac_Barcod ) && ( GXutil.strcmp(T01RZ10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RZ10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RZ10_A6033Ac_BarPar[0], A6033Ac_BarPar) > 0 ) ) )
         {
            A396EmprCod = T01RZ10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01RZ10_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RZ10_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RZ10_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A6031Ac_Barcod = T01RZ10_A6031Ac_Barcod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6031Ac_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6031Ac_Barcod), 8, 0));
            A6032Ac_BarReo = T01RZ10_A6032Ac_BarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6032Ac_BarReo", GXutil.str( A6032Ac_BarReo, 1, 0));
            A6033Ac_BarPar = T01RZ10_A6033Ac_BarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6033Ac_BarPar", A6033Ac_BarPar);
            RcdFound883 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound883 = (short)(0) ;
      /* Using cursor T01RZ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Integer.valueOf(A6031Ac_Barcod), Integer.valueOf(A6031Ac_Barcod), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A6032Ac_BarReo), Byte.valueOf(A6032Ac_BarReo), Integer.valueOf(A6031Ac_Barcod), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A6033Ac_BarPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01RZ11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ11_A129BarCod[0] > A129BarCod ) || ( T01RZ11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ11_A132BarCodReo[0] > A132BarCodReo ) || ( T01RZ11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RZ11_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01RZ11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RZ11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ11_A6031Ac_Barcod[0] > A6031Ac_Barcod ) || ( T01RZ11_A6031Ac_Barcod[0] == A6031Ac_Barcod ) && ( GXutil.strcmp(T01RZ11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RZ11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ11_A6032Ac_BarReo[0] > A6032Ac_BarReo ) || ( T01RZ11_A6032Ac_BarReo[0] == A6032Ac_BarReo ) && ( T01RZ11_A6031Ac_Barcod[0] == A6031Ac_Barcod ) && ( GXutil.strcmp(T01RZ11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RZ11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RZ11_A6033Ac_BarPar[0], A6033Ac_BarPar) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01RZ11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ11_A129BarCod[0] < A129BarCod ) || ( T01RZ11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ11_A132BarCodReo[0] < A132BarCodReo ) || ( T01RZ11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RZ11_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01RZ11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RZ11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ11_A6031Ac_Barcod[0] < A6031Ac_Barcod ) || ( T01RZ11_A6031Ac_Barcod[0] == A6031Ac_Barcod ) && ( GXutil.strcmp(T01RZ11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RZ11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RZ11_A6032Ac_BarReo[0] < A6032Ac_BarReo ) || ( T01RZ11_A6032Ac_BarReo[0] == A6032Ac_BarReo ) && ( T01RZ11_A6031Ac_Barcod[0] == A6031Ac_Barcod ) && ( GXutil.strcmp(T01RZ11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RZ11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RZ11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RZ11_A6033Ac_BarPar[0], A6033Ac_BarPar) < 0 ) ) )
         {
            A396EmprCod = T01RZ11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01RZ11_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RZ11_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RZ11_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A6031Ac_Barcod = T01RZ11_A6031Ac_Barcod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6031Ac_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6031Ac_Barcod), 8, 0));
            A6032Ac_BarReo = T01RZ11_A6032Ac_BarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6032Ac_BarReo", GXutil.str( A6032Ac_BarReo, 1, 0));
            A6033Ac_BarPar = T01RZ11_A6033Ac_BarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6033Ac_BarPar", A6033Ac_BarPar);
            RcdFound883 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RZ883( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RZ883( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound883 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A6031Ac_Barcod != Z6031Ac_Barcod ) || ( A6032Ac_BarReo != Z6032Ac_BarReo ) || ( GXutil.strcmp(A6033Ac_BarPar, Z6033Ac_BarPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A6031Ac_Barcod = Z6031Ac_Barcod ;
               httpContext.ajax_rsp_assign_attri("", false, "A6031Ac_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6031Ac_Barcod), 8, 0));
               A6032Ac_BarReo = Z6032Ac_BarReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A6032Ac_BarReo", GXutil.str( A6032Ac_BarReo, 1, 0));
               A6033Ac_BarPar = Z6033Ac_BarPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A6033Ac_BarPar", A6033Ac_BarPar);
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
               update1RZ883( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A6031Ac_Barcod != Z6031Ac_Barcod ) || ( A6032Ac_BarReo != Z6032Ac_BarReo ) || ( GXutil.strcmp(A6033Ac_BarPar, Z6033Ac_BarPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RZ883( ) ;
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
                  insert1RZ883( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A6031Ac_Barcod != Z6031Ac_Barcod ) || ( A6032Ac_BarReo != Z6032Ac_BarReo ) || ( GXutil.strcmp(A6033Ac_BarPar, Z6033Ac_BarPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A6031Ac_Barcod = Z6031Ac_Barcod ;
         httpContext.ajax_rsp_assign_attri("", false, "A6031Ac_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6031Ac_Barcod), 8, 0));
         A6032Ac_BarReo = Z6032Ac_BarReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A6032Ac_BarReo", GXutil.str( A6032Ac_BarReo, 1, 0));
         A6033Ac_BarPar = Z6033Ac_BarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A6033Ac_BarPar", A6033Ac_BarPar);
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
      if ( RcdFound883 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAc_Metros_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1RZ883( ) ;
      if ( RcdFound883 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAc_Metros_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RZ883( ) ;
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
      if ( RcdFound883 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAc_Metros_Internalname ;
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
      if ( RcdFound883 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAc_Metros_Internalname ;
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
      scanStart1RZ883( ) ;
      if ( RcdFound883 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound883 != 0 )
         {
            scanNext1RZ883( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAc_Metros_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RZ883( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1RZ883( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRACA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6034Ac_Metros, T01RZ2_A6034Ac_Metros[0]) != 0 ) || ( DecimalUtil.compareTo(Z6035Ac_Kilos, T01RZ2_A6035Ac_Kilos[0]) != 0 ) || ( Z6036Ac_Pzs != T01RZ2_A6036Ac_Pzs[0] ) || ( DecimalUtil.compareTo(Z9839Ac_Abs, T01RZ2_A9839Ac_Abs[0]) != 0 ) || ( GXutil.strcmp(Z9840Ac_AcaQui, T01RZ2_A9840Ac_AcaQui[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z6034Ac_Metros, T01RZ2_A6034Ac_Metros[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.hdraca_trn:[seudo value changed for attri]"+"Ac_Metros");
               GXutil.writeLogRaw("Old: ",Z6034Ac_Metros);
               GXutil.writeLogRaw("Current: ",T01RZ2_A6034Ac_Metros[0]);
            }
            if ( DecimalUtil.compareTo(Z6035Ac_Kilos, T01RZ2_A6035Ac_Kilos[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.hdraca_trn:[seudo value changed for attri]"+"Ac_Kilos");
               GXutil.writeLogRaw("Old: ",Z6035Ac_Kilos);
               GXutil.writeLogRaw("Current: ",T01RZ2_A6035Ac_Kilos[0]);
            }
            if ( Z6036Ac_Pzs != T01RZ2_A6036Ac_Pzs[0] )
            {
               GXutil.writeLogln("formulaciontinte.hdraca_trn:[seudo value changed for attri]"+"Ac_Pzs");
               GXutil.writeLogRaw("Old: ",Z6036Ac_Pzs);
               GXutil.writeLogRaw("Current: ",T01RZ2_A6036Ac_Pzs[0]);
            }
            if ( DecimalUtil.compareTo(Z9839Ac_Abs, T01RZ2_A9839Ac_Abs[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.hdraca_trn:[seudo value changed for attri]"+"Ac_Abs");
               GXutil.writeLogRaw("Old: ",Z9839Ac_Abs);
               GXutil.writeLogRaw("Current: ",T01RZ2_A9839Ac_Abs[0]);
            }
            if ( GXutil.strcmp(Z9840Ac_AcaQui, T01RZ2_A9840Ac_AcaQui[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.hdraca_trn:[seudo value changed for attri]"+"Ac_AcaQui");
               GXutil.writeLogRaw("Old: ",Z9840Ac_AcaQui);
               GXutil.writeLogRaw("Current: ",T01RZ2_A9840Ac_AcaQui[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHDRACA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RZ883( )
   {
      beforeValidate1RZ883( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RZ883( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RZ883( 0) ;
         checkOptimisticConcurrency1RZ883( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RZ883( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RZ883( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RZ12 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar, Boolean.valueOf(n6034Ac_Metros), A6034Ac_Metros, Boolean.valueOf(n6035Ac_Kilos), A6035Ac_Kilos, Boolean.valueOf(n6036Ac_Pzs), Short.valueOf(A6036Ac_Pzs), Boolean.valueOf(n9839Ac_Abs), A9839Ac_Abs, Boolean.valueOf(n9840Ac_AcaQui), A9840Ac_AcaQui, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRACA");
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
                        resetCaption1RZ0( ) ;
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
            load1RZ883( ) ;
         }
         endLevel1RZ883( ) ;
      }
      closeExtendedTableCursors1RZ883( ) ;
   }

   public void update1RZ883( )
   {
      beforeValidate1RZ883( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RZ883( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RZ883( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RZ883( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RZ883( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RZ13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n6034Ac_Metros), A6034Ac_Metros, Boolean.valueOf(n6035Ac_Kilos), A6035Ac_Kilos, Boolean.valueOf(n6036Ac_Pzs), Short.valueOf(A6036Ac_Pzs), Boolean.valueOf(n9839Ac_Abs), A9839Ac_Abs, Boolean.valueOf(n9840Ac_AcaQui), A9840Ac_AcaQui, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRACA");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRACA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RZ883( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1RZ0( ) ;
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
         endLevel1RZ883( ) ;
      }
      closeExtendedTableCursors1RZ883( ) ;
   }

   public void deferredUpdate1RZ883( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RZ883( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RZ883( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RZ883( ) ;
         afterConfirm1RZ883( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RZ883( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RZ14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRACA");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound883 == 0 )
                     {
                        initAll1RZ883( ) ;
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
                     resetCaption1RZ0( ) ;
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
      sMode883 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RZ883( ) ;
      Gx_mode = sMode883 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RZ883( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01RZ15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01RZ15_A407EmprNom[0] ;
         n407EmprNom = T01RZ15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
         /* Using cursor T01RZ16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A118BarAcaQui = T01RZ16_A118BarAcaQui[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
         pr_default.close(14);
      }
   }

   public void endLevel1RZ883( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RZ883( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.hdraca_trn");
         if ( AnyError == 0 )
         {
            confirmValues1RZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.hdraca_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RZ883( )
   {
      /* Using cursor T01RZ17 */
      pr_default.execute(15);
      RcdFound883 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound883 = (short)(1) ;
         A396EmprCod = T01RZ17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RZ17_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RZ17_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RZ17_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A6031Ac_Barcod = T01RZ17_A6031Ac_Barcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6031Ac_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6031Ac_Barcod), 8, 0));
         A6032Ac_BarReo = T01RZ17_A6032Ac_BarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6032Ac_BarReo", GXutil.str( A6032Ac_BarReo, 1, 0));
         A6033Ac_BarPar = T01RZ17_A6033Ac_BarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6033Ac_BarPar", A6033Ac_BarPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RZ883( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound883 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound883 = (short)(1) ;
         A396EmprCod = T01RZ17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RZ17_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RZ17_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RZ17_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A6031Ac_Barcod = T01RZ17_A6031Ac_Barcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6031Ac_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6031Ac_Barcod), 8, 0));
         A6032Ac_BarReo = T01RZ17_A6032Ac_BarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6032Ac_BarReo", GXutil.str( A6032Ac_BarReo, 1, 0));
         A6033Ac_BarPar = T01RZ17_A6033Ac_BarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6033Ac_BarPar", A6033Ac_BarPar);
      }
   }

   public void scanEnd1RZ883( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1RZ883( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RZ883( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RZ883( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RZ883( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RZ883( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RZ883( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RZ883( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarAcaQui_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaQui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaQui_Enabled), 5, 0), true);
      edtAc_Barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Barcod_Enabled), 5, 0), true);
      edtAc_BarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarReo_Enabled), 5, 0), true);
      edtAc_BarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarPar_Enabled), 5, 0), true);
      edtAc_Metros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Metros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Metros_Enabled), 5, 0), true);
      edtAc_Kilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Kilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Kilos_Enabled), 5, 0), true);
      edtAc_Pzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Pzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Pzs_Enabled), 5, 0), true);
      edtAc_Abs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Abs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Abs_Enabled), 5, 0), true);
      edtAc_AcaQui_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_AcaQui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_AcaQui_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1RZ883( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1RZ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.hdraca_trn", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6031Ac_Barcod", GXutil.ltrim( localUtil.ntoc( Z6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6032Ac_BarReo", GXutil.ltrim( localUtil.ntoc( Z6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6033Ac_BarPar", GXutil.rtrim( Z6033Ac_BarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6034Ac_Metros", GXutil.ltrim( localUtil.ntoc( Z6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6035Ac_Kilos", GXutil.ltrim( localUtil.ntoc( Z6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6036Ac_Pzs", GXutil.ltrim( localUtil.ntoc( Z6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9839Ac_Abs", GXutil.ltrim( localUtil.ntoc( Z9839Ac_Abs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9840Ac_AcaQui", GXutil.rtrim( Z9840Ac_AcaQui));
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
      return formatLink("app.formulaciontinte.hdraca_trn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.HDRACA_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Transaccion igual a THDRACA pero estrutura de otra forma", "") ;
   }

   public void initializeNonKey1RZ883( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A118BarAcaQui = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
      A6034Ac_Metros = DecimalUtil.ZERO ;
      n6034Ac_Metros = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6034Ac_Metros", GXutil.ltrimstr( A6034Ac_Metros, 9, 2));
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      n6035Ac_Kilos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6035Ac_Kilos", GXutil.ltrimstr( A6035Ac_Kilos, 9, 2));
      A6036Ac_Pzs = (short)(0) ;
      n6036Ac_Pzs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6036Ac_Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6036Ac_Pzs), 4, 0));
      A9839Ac_Abs = DecimalUtil.ZERO ;
      n9839Ac_Abs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9839Ac_Abs", GXutil.ltrimstr( A9839Ac_Abs, 6, 2));
      A9840Ac_AcaQui = "" ;
      n9840Ac_AcaQui = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9840Ac_AcaQui", A9840Ac_AcaQui);
      Z6034Ac_Metros = DecimalUtil.ZERO ;
      Z6035Ac_Kilos = DecimalUtil.ZERO ;
      Z6036Ac_Pzs = (short)(0) ;
      Z9839Ac_Abs = DecimalUtil.ZERO ;
      Z9840Ac_AcaQui = "" ;
   }

   public void initAll1RZ883( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A6031Ac_Barcod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6031Ac_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6031Ac_Barcod), 8, 0));
      A6032Ac_BarReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6032Ac_BarReo", GXutil.str( A6032Ac_BarReo, 1, 0));
      A6033Ac_BarPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6033Ac_BarPar", A6033Ac_BarPar);
      initializeNonKey1RZ883( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415112928", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/hdraca_trn.js", "?202682415112928", false, true);
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtBarAcaQui_Internalname = "BARACAQUI" ;
      edtAc_Barcod_Internalname = "AC_BARCOD" ;
      edtAc_BarReo_Internalname = "AC_BARREO" ;
      edtAc_BarPar_Internalname = "AC_BARPAR" ;
      edtAc_Metros_Internalname = "AC_METROS" ;
      edtAc_Kilos_Internalname = "AC_KILOS" ;
      edtAc_Pzs_Internalname = "AC_PZS" ;
      edtAc_Abs_Internalname = "AC_ABS" ;
      edtAc_AcaQui_Internalname = "AC_ACAQUI" ;
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
      Form.setCaption( httpContext.getMessage( "Transaccion igual a THDRACA pero estrutura de otra forma", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAc_AcaQui_Jsonclick = "" ;
      edtAc_AcaQui_Enabled = 1 ;
      edtAc_Abs_Jsonclick = "" ;
      edtAc_Abs_Enabled = 1 ;
      edtAc_Pzs_Jsonclick = "" ;
      edtAc_Pzs_Enabled = 1 ;
      edtAc_Kilos_Jsonclick = "" ;
      edtAc_Kilos_Enabled = 1 ;
      edtAc_Metros_Jsonclick = "" ;
      edtAc_Metros_Enabled = 1 ;
      edtAc_BarPar_Jsonclick = "" ;
      edtAc_BarPar_Enabled = 1 ;
      edtAc_BarReo_Jsonclick = "" ;
      edtAc_BarReo_Enabled = 1 ;
      edtAc_Barcod_Jsonclick = "" ;
      edtAc_Barcod_Enabled = 1 ;
      edtBarAcaQui_Jsonclick = "" ;
      edtBarAcaQui_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01RZ15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RZ15_A407EmprNom[0] ;
      n407EmprNom = T01RZ15_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      /* Using cursor T01RZ16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A118BarAcaQui = T01RZ16_A118BarAcaQui[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
      pr_default.close(14);
      GX_FocusControl = edtAc_Metros_Internalname ;
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
      /* Using cursor T01RZ15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01RZ15_A407EmprNom[0] ;
      n407EmprNom = T01RZ15_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Barcodpar( )
   {
      /* Using cursor T01RZ16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A118BarAcaQui = T01RZ16_A118BarAcaQui[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", GXutil.rtrim( A118BarAcaQui));
   }

   public void valid_Ac_barpar( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6034Ac_Metros", GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6035Ac_Kilos", GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6036Ac_Pzs", GXutil.ltrim( localUtil.ntoc( A6036Ac_Pzs, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9839Ac_Abs", GXutil.ltrim( localUtil.ntoc( A9839Ac_Abs, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9840Ac_AcaQui", GXutil.rtrim( A9840Ac_AcaQui));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", GXutil.rtrim( A118BarAcaQui));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6031Ac_Barcod", GXutil.ltrim( localUtil.ntoc( Z6031Ac_Barcod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6032Ac_BarReo", GXutil.ltrim( localUtil.ntoc( Z6032Ac_BarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6033Ac_BarPar", GXutil.rtrim( Z6033Ac_BarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6034Ac_Metros", GXutil.ltrim( localUtil.ntoc( Z6034Ac_Metros, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6035Ac_Kilos", GXutil.ltrim( localUtil.ntoc( Z6035Ac_Kilos, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6036Ac_Pzs", GXutil.ltrim( localUtil.ntoc( Z6036Ac_Pzs, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9839Ac_Abs", GXutil.ltrim( localUtil.ntoc( Z9839Ac_Abs, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9840Ac_AcaQui", GXutil.rtrim( Z9840Ac_AcaQui));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z118BarAcaQui", GXutil.rtrim( Z118BarAcaQui));
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
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A118BarAcaQui',fld:'BARACAQUI',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A118BarAcaQui',fld:'BARACAQUI',pic:''}]}");
      setEventMetadata("VALID_AC_BARCOD","{handler:'valid_Ac_barcod',iparms:[]");
      setEventMetadata("VALID_AC_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_AC_BARREO","{handler:'valid_Ac_barreo',iparms:[]");
      setEventMetadata("VALID_AC_BARREO",",oparms:[]}");
      setEventMetadata("VALID_AC_BARPAR","{handler:'valid_Ac_barpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A6031Ac_Barcod',fld:'AC_BARCOD',pic:'ZZZZZZZ9'},{av:'A6032Ac_BarReo',fld:'AC_BARREO',pic:'9'},{av:'A6033Ac_BarPar',fld:'AC_BARPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_AC_BARPAR",",oparms:[{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'A6035Ac_Kilos',fld:'AC_KILOS',pic:'ZZZZZ9.99'},{av:'A6036Ac_Pzs',fld:'AC_PZS',pic:'ZZZ9'},{av:'A9839Ac_Abs',fld:'AC_ABS',pic:'ZZ9.99'},{av:'A9840Ac_AcaQui',fld:'AC_ACAQUI',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A118BarAcaQui',fld:'BARACAQUI',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z6031Ac_Barcod'},{av:'Z6032Ac_BarReo'},{av:'Z6033Ac_BarPar'},{av:'Z6034Ac_Metros'},{av:'Z6035Ac_Kilos'},{av:'Z6036Ac_Pzs'},{av:'Z9839Ac_Abs'},{av:'Z9840Ac_AcaQui'},{av:'Z407EmprNom'},{av:'Z118BarAcaQui'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      Z130BarCodPar = "" ;
      Z6033Ac_BarPar = "" ;
      Z6034Ac_Metros = DecimalUtil.ZERO ;
      Z6035Ac_Kilos = DecimalUtil.ZERO ;
      Z9839Ac_Abs = DecimalUtil.ZERO ;
      Z9840Ac_AcaQui = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A118BarAcaQui = "" ;
      A6033Ac_BarPar = "" ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      A9839Ac_Abs = DecimalUtil.ZERO ;
      A9840Ac_AcaQui = "" ;
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
      Z118BarAcaQui = "" ;
      T01RZ6_A6031Ac_Barcod = new int[1] ;
      T01RZ6_A6032Ac_BarReo = new byte[1] ;
      T01RZ6_A6033Ac_BarPar = new String[] {""} ;
      T01RZ6_A407EmprNom = new String[] {""} ;
      T01RZ6_n407EmprNom = new boolean[] {false} ;
      T01RZ6_A118BarAcaQui = new String[] {""} ;
      T01RZ6_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RZ6_n6034Ac_Metros = new boolean[] {false} ;
      T01RZ6_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RZ6_n6035Ac_Kilos = new boolean[] {false} ;
      T01RZ6_A6036Ac_Pzs = new short[1] ;
      T01RZ6_n6036Ac_Pzs = new boolean[] {false} ;
      T01RZ6_A9839Ac_Abs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RZ6_n9839Ac_Abs = new boolean[] {false} ;
      T01RZ6_A9840Ac_AcaQui = new String[] {""} ;
      T01RZ6_n9840Ac_AcaQui = new boolean[] {false} ;
      T01RZ6_A396EmprCod = new String[] {""} ;
      T01RZ6_A129BarCod = new int[1] ;
      T01RZ6_A132BarCodReo = new byte[1] ;
      T01RZ6_A130BarCodPar = new String[] {""} ;
      T01RZ4_A407EmprNom = new String[] {""} ;
      T01RZ4_n407EmprNom = new boolean[] {false} ;
      T01RZ5_A118BarAcaQui = new String[] {""} ;
      T01RZ7_A407EmprNom = new String[] {""} ;
      T01RZ7_n407EmprNom = new boolean[] {false} ;
      T01RZ8_A118BarAcaQui = new String[] {""} ;
      T01RZ9_A396EmprCod = new String[] {""} ;
      T01RZ9_A129BarCod = new int[1] ;
      T01RZ9_A132BarCodReo = new byte[1] ;
      T01RZ9_A130BarCodPar = new String[] {""} ;
      T01RZ9_A6031Ac_Barcod = new int[1] ;
      T01RZ9_A6032Ac_BarReo = new byte[1] ;
      T01RZ9_A6033Ac_BarPar = new String[] {""} ;
      T01RZ3_A6031Ac_Barcod = new int[1] ;
      T01RZ3_A6032Ac_BarReo = new byte[1] ;
      T01RZ3_A6033Ac_BarPar = new String[] {""} ;
      T01RZ3_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RZ3_n6034Ac_Metros = new boolean[] {false} ;
      T01RZ3_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RZ3_n6035Ac_Kilos = new boolean[] {false} ;
      T01RZ3_A6036Ac_Pzs = new short[1] ;
      T01RZ3_n6036Ac_Pzs = new boolean[] {false} ;
      T01RZ3_A9839Ac_Abs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RZ3_n9839Ac_Abs = new boolean[] {false} ;
      T01RZ3_A9840Ac_AcaQui = new String[] {""} ;
      T01RZ3_n9840Ac_AcaQui = new boolean[] {false} ;
      T01RZ3_A396EmprCod = new String[] {""} ;
      T01RZ3_A129BarCod = new int[1] ;
      T01RZ3_A132BarCodReo = new byte[1] ;
      T01RZ3_A130BarCodPar = new String[] {""} ;
      sMode883 = "" ;
      T01RZ10_A396EmprCod = new String[] {""} ;
      T01RZ10_A129BarCod = new int[1] ;
      T01RZ10_A132BarCodReo = new byte[1] ;
      T01RZ10_A130BarCodPar = new String[] {""} ;
      T01RZ10_A6031Ac_Barcod = new int[1] ;
      T01RZ10_A6032Ac_BarReo = new byte[1] ;
      T01RZ10_A6033Ac_BarPar = new String[] {""} ;
      T01RZ11_A396EmprCod = new String[] {""} ;
      T01RZ11_A129BarCod = new int[1] ;
      T01RZ11_A132BarCodReo = new byte[1] ;
      T01RZ11_A130BarCodPar = new String[] {""} ;
      T01RZ11_A6031Ac_Barcod = new int[1] ;
      T01RZ11_A6032Ac_BarReo = new byte[1] ;
      T01RZ11_A6033Ac_BarPar = new String[] {""} ;
      T01RZ2_A6031Ac_Barcod = new int[1] ;
      T01RZ2_A6032Ac_BarReo = new byte[1] ;
      T01RZ2_A6033Ac_BarPar = new String[] {""} ;
      T01RZ2_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RZ2_n6034Ac_Metros = new boolean[] {false} ;
      T01RZ2_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RZ2_n6035Ac_Kilos = new boolean[] {false} ;
      T01RZ2_A6036Ac_Pzs = new short[1] ;
      T01RZ2_n6036Ac_Pzs = new boolean[] {false} ;
      T01RZ2_A9839Ac_Abs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RZ2_n9839Ac_Abs = new boolean[] {false} ;
      T01RZ2_A9840Ac_AcaQui = new String[] {""} ;
      T01RZ2_n9840Ac_AcaQui = new boolean[] {false} ;
      T01RZ2_A396EmprCod = new String[] {""} ;
      T01RZ2_A129BarCod = new int[1] ;
      T01RZ2_A132BarCodReo = new byte[1] ;
      T01RZ2_A130BarCodPar = new String[] {""} ;
      T01RZ15_A407EmprNom = new String[] {""} ;
      T01RZ15_n407EmprNom = new boolean[] {false} ;
      T01RZ16_A118BarAcaQui = new String[] {""} ;
      T01RZ17_A396EmprCod = new String[] {""} ;
      T01RZ17_A129BarCod = new int[1] ;
      T01RZ17_A132BarCodReo = new byte[1] ;
      T01RZ17_A130BarCodPar = new String[] {""} ;
      T01RZ17_A6031Ac_Barcod = new int[1] ;
      T01RZ17_A6032Ac_BarReo = new byte[1] ;
      T01RZ17_A6033Ac_BarPar = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ6033Ac_BarPar = "" ;
      ZZ6034Ac_Metros = DecimalUtil.ZERO ;
      ZZ6035Ac_Kilos = DecimalUtil.ZERO ;
      ZZ9839Ac_Abs = DecimalUtil.ZERO ;
      ZZ9840Ac_AcaQui = "" ;
      ZZ407EmprNom = "" ;
      ZZ118BarAcaQui = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.hdraca_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.hdraca_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.hdraca_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.hdraca_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.hdraca_trn__default(),
         new Object[] {
             new Object[] {
            T01RZ2_A6031Ac_Barcod, T01RZ2_A6032Ac_BarReo, T01RZ2_A6033Ac_BarPar, T01RZ2_A6034Ac_Metros, T01RZ2_n6034Ac_Metros, T01RZ2_A6035Ac_Kilos, T01RZ2_n6035Ac_Kilos, T01RZ2_A6036Ac_Pzs, T01RZ2_n6036Ac_Pzs, T01RZ2_A9839Ac_Abs,
            T01RZ2_n9839Ac_Abs, T01RZ2_A9840Ac_AcaQui, T01RZ2_n9840Ac_AcaQui, T01RZ2_A396EmprCod, T01RZ2_A129BarCod, T01RZ2_A132BarCodReo, T01RZ2_A130BarCodPar
            }
            , new Object[] {
            T01RZ3_A6031Ac_Barcod, T01RZ3_A6032Ac_BarReo, T01RZ3_A6033Ac_BarPar, T01RZ3_A6034Ac_Metros, T01RZ3_n6034Ac_Metros, T01RZ3_A6035Ac_Kilos, T01RZ3_n6035Ac_Kilos, T01RZ3_A6036Ac_Pzs, T01RZ3_n6036Ac_Pzs, T01RZ3_A9839Ac_Abs,
            T01RZ3_n9839Ac_Abs, T01RZ3_A9840Ac_AcaQui, T01RZ3_n9840Ac_AcaQui, T01RZ3_A396EmprCod, T01RZ3_A129BarCod, T01RZ3_A132BarCodReo, T01RZ3_A130BarCodPar
            }
            , new Object[] {
            T01RZ4_A407EmprNom, T01RZ4_n407EmprNom
            }
            , new Object[] {
            T01RZ5_A118BarAcaQui
            }
            , new Object[] {
            T01RZ6_A6031Ac_Barcod, T01RZ6_A6032Ac_BarReo, T01RZ6_A6033Ac_BarPar, T01RZ6_A407EmprNom, T01RZ6_n407EmprNom, T01RZ6_A118BarAcaQui, T01RZ6_A6034Ac_Metros, T01RZ6_n6034Ac_Metros, T01RZ6_A6035Ac_Kilos, T01RZ6_n6035Ac_Kilos,
            T01RZ6_A6036Ac_Pzs, T01RZ6_n6036Ac_Pzs, T01RZ6_A9839Ac_Abs, T01RZ6_n9839Ac_Abs, T01RZ6_A9840Ac_AcaQui, T01RZ6_n9840Ac_AcaQui, T01RZ6_A396EmprCod, T01RZ6_A129BarCod, T01RZ6_A132BarCodReo, T01RZ6_A130BarCodPar
            }
            , new Object[] {
            T01RZ7_A407EmprNom, T01RZ7_n407EmprNom
            }
            , new Object[] {
            T01RZ8_A118BarAcaQui
            }
            , new Object[] {
            T01RZ9_A396EmprCod, T01RZ9_A129BarCod, T01RZ9_A132BarCodReo, T01RZ9_A130BarCodPar, T01RZ9_A6031Ac_Barcod, T01RZ9_A6032Ac_BarReo, T01RZ9_A6033Ac_BarPar
            }
            , new Object[] {
            T01RZ10_A396EmprCod, T01RZ10_A129BarCod, T01RZ10_A132BarCodReo, T01RZ10_A130BarCodPar, T01RZ10_A6031Ac_Barcod, T01RZ10_A6032Ac_BarReo, T01RZ10_A6033Ac_BarPar
            }
            , new Object[] {
            T01RZ11_A396EmprCod, T01RZ11_A129BarCod, T01RZ11_A132BarCodReo, T01RZ11_A130BarCodPar, T01RZ11_A6031Ac_Barcod, T01RZ11_A6032Ac_BarReo, T01RZ11_A6033Ac_BarPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RZ15_A407EmprNom, T01RZ15_n407EmprNom
            }
            , new Object[] {
            T01RZ16_A118BarAcaQui
            }
            , new Object[] {
            T01RZ17_A396EmprCod, T01RZ17_A129BarCod, T01RZ17_A132BarCodReo, T01RZ17_A130BarCodPar, T01RZ17_A6031Ac_Barcod, T01RZ17_A6032Ac_BarReo, T01RZ17_A6033Ac_BarPar
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z6032Ac_BarReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A6032Ac_BarReo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private byte ZZ6032Ac_BarReo ;
   private short Z6036Ac_Pzs ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6036Ac_Pzs ;
   private short RcdFound883 ;
   private short nIsDirty_883 ;
   private short ZZ6036Ac_Pzs ;
   private int Z129BarCod ;
   private int Z6031Ac_Barcod ;
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
   private int edtEmprNom_Enabled ;
   private int edtBarAcaQui_Enabled ;
   private int A6031Ac_Barcod ;
   private int edtAc_Barcod_Enabled ;
   private int edtAc_BarReo_Enabled ;
   private int edtAc_BarPar_Enabled ;
   private int edtAc_Metros_Enabled ;
   private int edtAc_Kilos_Enabled ;
   private int edtAc_Pzs_Enabled ;
   private int edtAc_Abs_Enabled ;
   private int edtAc_AcaQui_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ129BarCod ;
   private int ZZ6031Ac_Barcod ;
   private java.math.BigDecimal Z6034Ac_Metros ;
   private java.math.BigDecimal Z6035Ac_Kilos ;
   private java.math.BigDecimal Z9839Ac_Abs ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private java.math.BigDecimal A6035Ac_Kilos ;
   private java.math.BigDecimal A9839Ac_Abs ;
   private java.math.BigDecimal ZZ6034Ac_Metros ;
   private java.math.BigDecimal ZZ6035Ac_Kilos ;
   private java.math.BigDecimal ZZ9839Ac_Abs ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z6033Ac_BarPar ;
   private String Z9840Ac_AcaQui ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
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
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtBarAcaQui_Internalname ;
   private String A118BarAcaQui ;
   private String edtBarAcaQui_Jsonclick ;
   private String edtAc_Barcod_Internalname ;
   private String edtAc_Barcod_Jsonclick ;
   private String edtAc_BarReo_Internalname ;
   private String edtAc_BarReo_Jsonclick ;
   private String edtAc_BarPar_Internalname ;
   private String A6033Ac_BarPar ;
   private String edtAc_BarPar_Jsonclick ;
   private String edtAc_Metros_Internalname ;
   private String edtAc_Metros_Jsonclick ;
   private String edtAc_Kilos_Internalname ;
   private String edtAc_Kilos_Jsonclick ;
   private String edtAc_Pzs_Internalname ;
   private String edtAc_Pzs_Jsonclick ;
   private String edtAc_Abs_Internalname ;
   private String edtAc_Abs_Jsonclick ;
   private String edtAc_AcaQui_Internalname ;
   private String A9840Ac_AcaQui ;
   private String edtAc_AcaQui_Jsonclick ;
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
   private String Z118BarAcaQui ;
   private String sMode883 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ6033Ac_BarPar ;
   private String ZZ9840Ac_AcaQui ;
   private String ZZ407EmprNom ;
   private String ZZ118BarAcaQui ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n6034Ac_Metros ;
   private boolean n6035Ac_Kilos ;
   private boolean n6036Ac_Pzs ;
   private boolean n9839Ac_Abs ;
   private boolean n9840Ac_AcaQui ;
   private IDataStoreProvider pr_default ;
   private int[] T01RZ6_A6031Ac_Barcod ;
   private byte[] T01RZ6_A6032Ac_BarReo ;
   private String[] T01RZ6_A6033Ac_BarPar ;
   private String[] T01RZ6_A407EmprNom ;
   private boolean[] T01RZ6_n407EmprNom ;
   private String[] T01RZ6_A118BarAcaQui ;
   private java.math.BigDecimal[] T01RZ6_A6034Ac_Metros ;
   private boolean[] T01RZ6_n6034Ac_Metros ;
   private java.math.BigDecimal[] T01RZ6_A6035Ac_Kilos ;
   private boolean[] T01RZ6_n6035Ac_Kilos ;
   private short[] T01RZ6_A6036Ac_Pzs ;
   private boolean[] T01RZ6_n6036Ac_Pzs ;
   private java.math.BigDecimal[] T01RZ6_A9839Ac_Abs ;
   private boolean[] T01RZ6_n9839Ac_Abs ;
   private String[] T01RZ6_A9840Ac_AcaQui ;
   private boolean[] T01RZ6_n9840Ac_AcaQui ;
   private String[] T01RZ6_A396EmprCod ;
   private int[] T01RZ6_A129BarCod ;
   private byte[] T01RZ6_A132BarCodReo ;
   private String[] T01RZ6_A130BarCodPar ;
   private String[] T01RZ4_A407EmprNom ;
   private boolean[] T01RZ4_n407EmprNom ;
   private String[] T01RZ5_A118BarAcaQui ;
   private String[] T01RZ7_A407EmprNom ;
   private boolean[] T01RZ7_n407EmprNom ;
   private String[] T01RZ8_A118BarAcaQui ;
   private String[] T01RZ9_A396EmprCod ;
   private int[] T01RZ9_A129BarCod ;
   private byte[] T01RZ9_A132BarCodReo ;
   private String[] T01RZ9_A130BarCodPar ;
   private int[] T01RZ9_A6031Ac_Barcod ;
   private byte[] T01RZ9_A6032Ac_BarReo ;
   private String[] T01RZ9_A6033Ac_BarPar ;
   private int[] T01RZ3_A6031Ac_Barcod ;
   private byte[] T01RZ3_A6032Ac_BarReo ;
   private String[] T01RZ3_A6033Ac_BarPar ;
   private java.math.BigDecimal[] T01RZ3_A6034Ac_Metros ;
   private boolean[] T01RZ3_n6034Ac_Metros ;
   private java.math.BigDecimal[] T01RZ3_A6035Ac_Kilos ;
   private boolean[] T01RZ3_n6035Ac_Kilos ;
   private short[] T01RZ3_A6036Ac_Pzs ;
   private boolean[] T01RZ3_n6036Ac_Pzs ;
   private java.math.BigDecimal[] T01RZ3_A9839Ac_Abs ;
   private boolean[] T01RZ3_n9839Ac_Abs ;
   private String[] T01RZ3_A9840Ac_AcaQui ;
   private boolean[] T01RZ3_n9840Ac_AcaQui ;
   private String[] T01RZ3_A396EmprCod ;
   private int[] T01RZ3_A129BarCod ;
   private byte[] T01RZ3_A132BarCodReo ;
   private String[] T01RZ3_A130BarCodPar ;
   private String[] T01RZ10_A396EmprCod ;
   private int[] T01RZ10_A129BarCod ;
   private byte[] T01RZ10_A132BarCodReo ;
   private String[] T01RZ10_A130BarCodPar ;
   private int[] T01RZ10_A6031Ac_Barcod ;
   private byte[] T01RZ10_A6032Ac_BarReo ;
   private String[] T01RZ10_A6033Ac_BarPar ;
   private String[] T01RZ11_A396EmprCod ;
   private int[] T01RZ11_A129BarCod ;
   private byte[] T01RZ11_A132BarCodReo ;
   private String[] T01RZ11_A130BarCodPar ;
   private int[] T01RZ11_A6031Ac_Barcod ;
   private byte[] T01RZ11_A6032Ac_BarReo ;
   private String[] T01RZ11_A6033Ac_BarPar ;
   private int[] T01RZ2_A6031Ac_Barcod ;
   private byte[] T01RZ2_A6032Ac_BarReo ;
   private String[] T01RZ2_A6033Ac_BarPar ;
   private java.math.BigDecimal[] T01RZ2_A6034Ac_Metros ;
   private boolean[] T01RZ2_n6034Ac_Metros ;
   private java.math.BigDecimal[] T01RZ2_A6035Ac_Kilos ;
   private boolean[] T01RZ2_n6035Ac_Kilos ;
   private short[] T01RZ2_A6036Ac_Pzs ;
   private boolean[] T01RZ2_n6036Ac_Pzs ;
   private java.math.BigDecimal[] T01RZ2_A9839Ac_Abs ;
   private boolean[] T01RZ2_n9839Ac_Abs ;
   private String[] T01RZ2_A9840Ac_AcaQui ;
   private boolean[] T01RZ2_n9840Ac_AcaQui ;
   private String[] T01RZ2_A396EmprCod ;
   private int[] T01RZ2_A129BarCod ;
   private byte[] T01RZ2_A132BarCodReo ;
   private String[] T01RZ2_A130BarCodPar ;
   private String[] T01RZ15_A407EmprNom ;
   private boolean[] T01RZ15_n407EmprNom ;
   private String[] T01RZ16_A118BarAcaQui ;
   private String[] T01RZ17_A396EmprCod ;
   private int[] T01RZ17_A129BarCod ;
   private byte[] T01RZ17_A132BarCodReo ;
   private String[] T01RZ17_A130BarCodPar ;
   private int[] T01RZ17_A6031Ac_Barcod ;
   private byte[] T01RZ17_A6032Ac_BarReo ;
   private String[] T01RZ17_A6033Ac_BarPar ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class hdraca_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hdraca_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hdraca_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hdraca_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hdraca_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RZ2", "SELECT Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Metros, Ac_Kilos, Ac_Pzs, Ac_Abs, Ac_AcaQui, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ?  FOR UPDATE OF Ac_Metros, Ac_Kilos, Ac_Pzs, Ac_Abs, Ac_AcaQui NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RZ3", "SELECT Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Metros, Ac_Kilos, Ac_Pzs, Ac_Abs, Ac_AcaQui, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RZ4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RZ5", "SELECT BarAcaQui FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RZ6", "SELECT /*+ FIRST_ROWS(100) */ TM1.Ac_Barcod, TM1.Ac_BarReo, TM1.Ac_BarPar, T2.EmprNom, T3.BarAcaQui, TM1.Ac_Metros, TM1.Ac_Kilos, TM1.Ac_Pzs, TM1.Ac_Abs, TM1.Ac_AcaQui, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM ((TXPHDRACA TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.Ac_Barcod = ? and TM1.Ac_BarReo = ? and TM1.Ac_BarPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.Ac_Barcod, TM1.Ac_BarReo, TM1.Ac_BarPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RZ7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RZ8", "SELECT BarAcaQui FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RZ9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RZ10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and Ac_Barcod > ? or Ac_Barcod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and Ac_BarReo > ? or Ac_BarReo = ? and Ac_Barcod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and Ac_BarPar > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RZ11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and Ac_Barcod < ? or Ac_Barcod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and Ac_BarReo < ? or Ac_BarReo = ? and Ac_Barcod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and Ac_BarPar < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, Ac_Barcod DESC, Ac_BarReo DESC, Ac_BarPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RZ12", "INSERT INTO TXPHDRACA(Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Metros, Ac_Kilos, Ac_Pzs, Ac_Abs, Ac_AcaQui, EmprCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHDRACA")
         ,new UpdateCursor("T01RZ13", "UPDATE TXPHDRACA SET Ac_Metros=?, Ac_Kilos=?, Ac_Pzs=?, Ac_Abs=?, Ac_AcaQui=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ?", GX_NOMASK, "TXPHDRACA")
         ,new UpdateCursor("T01RZ14", "DELETE FROM TXPHDRACA  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ?", GX_NOMASK, "TXPHDRACA")
         ,new ForEachCursor("T01RZ15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RZ16", "SELECT BarAcaQui FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RZ17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((byte[]) buf[18])[0] = rslt.getByte(13);
               ((String[]) buf[19])[0] = rslt.getString(14, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
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
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setString(28, (String)parms[27], 1);
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
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setString(28, (String)parms[27], 1);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 6);
               }
               stmt.setString(9, (String)parms[13], 3);
               stmt.setInt(10, ((Number) parms[14]).intValue());
               stmt.setByte(11, ((Number) parms[15]).byteValue());
               stmt.setString(12, (String)parms[16], 1);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 6);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               stmt.setInt(10, ((Number) parms[14]).intValue());
               stmt.setByte(11, ((Number) parms[15]).byteValue());
               stmt.setString(12, (String)parms[16], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

