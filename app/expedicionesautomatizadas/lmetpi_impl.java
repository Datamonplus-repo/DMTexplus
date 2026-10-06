package app.expedicionesautomatizadas ;
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
         gxload_2( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "LMETPI", ""), (short)(0)) ;
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
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "Container FormContainer", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "LMETPI", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
      ClassString = "BtnFirst" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetTerCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetTerCod_Internalname, httpContext.getMessage( "Terminal", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTerCod_Internalname, GXutil.rtrim( A2809MetTerCod), GXutil.rtrim( localUtil.format( A2809MetTerCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTerCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetTerCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieCod_Internalname, httpContext.getMessage( "Pieza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieCod_Internalname, GXutil.rtrim( A2813MetPieCod), GXutil.rtrim( localUtil.format( A2813MetPieCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieKil_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieKil_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieKil_Enabled!=0) ? localUtil.format( A2814MetPieKil, "ZZZZZ9.99") : localUtil.format( A2814MetPieKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieKil_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieKil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieMet_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieMet_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieMet_Enabled!=0) ? localUtil.format( A2815MetPieMet, "ZZZZZ9.99") : localUtil.format( A2815MetPieMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieMet_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieMet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieDfUl_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieDfUl_Internalname, httpContext.getMessage( "Ultima Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieDfUl_Internalname, GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieDfUl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12994MetPieDfUl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12994MetPieDfUl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieDfUl_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetPieDfUl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarUniMed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarUniMed_Internalname, httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarUniMed_Internalname, GXutil.rtrim( A228BarUniMed), GXutil.rtrim( localUtil.format( A228BarUniMed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarUniMed_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\LMETPI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         Z6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z6635MetPieAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( "Z4910MetPieMtD")) ;
         Z2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2816MetPieEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4917MetPieObs = httpContext.cgiGet( "Z4917MetPieObs") ;
         Z12994MetPieDfUl = (short)(localUtil.ctol( httpContext.cgiGet( "Z12994MetPieDfUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z6635MetPieAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( "Z4910MetPieMtD")) ;
         A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2816MetPieEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4917MetPieObs = httpContext.cgiGet( "Z4917MetPieObs") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( "METPIEANC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( "METPIEMTD")) ;
         A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( "METPIEEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4917MetPieObs = httpContext.cgiGet( "METPIEOBS") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDfUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDfUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEDFUL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMetPieDfUl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12994MetPieDfUl = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
         }
         else
         {
            A12994MetPieDfUl = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDfUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
         }
         A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"LMETPI");
         forbiddenHiddens.add("MetPieAnc", localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9"));
         forbiddenHiddens.add("MetPieMtD", localUtil.format( A4910MetPieMtD, "ZZZZ9.99"));
         forbiddenHiddens.add("MetPieEst", localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9"));
         forbiddenHiddens.add("MetPieObs", GXutil.rtrim( localUtil.format( A4917MetPieObs, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A2813MetPieCod, Z2813MetPieCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("expedicionesautomatizadas\\lmetpi:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
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
            initAll1RC413( ) ;
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
      disableAttributes1RC413( ) ;
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

   public void resetCaption1RC0( )
   {
   }

   public void zm1RC413( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2814MetPieKil = T01RC3_A2814MetPieKil[0] ;
            Z2815MetPieMet = T01RC3_A2815MetPieMet[0] ;
            Z6635MetPieAnc = T01RC3_A6635MetPieAnc[0] ;
            Z4910MetPieMtD = T01RC3_A4910MetPieMtD[0] ;
            Z2816MetPieEst = T01RC3_A2816MetPieEst[0] ;
            Z4917MetPieObs = T01RC3_A4917MetPieObs[0] ;
            Z12994MetPieDfUl = T01RC3_A12994MetPieDfUl[0] ;
         }
         else
         {
            Z2814MetPieKil = A2814MetPieKil ;
            Z2815MetPieMet = A2815MetPieMet ;
            Z6635MetPieAnc = A6635MetPieAnc ;
            Z4910MetPieMtD = A4910MetPieMtD ;
            Z2816MetPieEst = A2816MetPieEst ;
            Z4917MetPieObs = A4917MetPieObs ;
            Z12994MetPieDfUl = A12994MetPieDfUl ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z2813MetPieCod = A2813MetPieCod ;
         Z2814MetPieKil = A2814MetPieKil ;
         Z2815MetPieMet = A2815MetPieMet ;
         Z6635MetPieAnc = A6635MetPieAnc ;
         Z4910MetPieMtD = A4910MetPieMtD ;
         Z2816MetPieEst = A2816MetPieEst ;
         Z4917MetPieObs = A4917MetPieObs ;
         Z12994MetPieDfUl = A12994MetPieDfUl ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z228BarUniMed = A228BarUniMed ;
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

   public void load1RC413( )
   {
      /* Using cursor T01RC6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2814MetPieKil = T01RC6_A2814MetPieKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
         A2815MetPieMet = T01RC6_A2815MetPieMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
         A6635MetPieAnc = T01RC6_A6635MetPieAnc[0] ;
         A4910MetPieMtD = T01RC6_A4910MetPieMtD[0] ;
         A2816MetPieEst = T01RC6_A2816MetPieEst[0] ;
         A4917MetPieObs = T01RC6_A4917MetPieObs[0] ;
         A12994MetPieDfUl = T01RC6_A12994MetPieDfUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
         A228BarUniMed = T01RC6_A228BarUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
         zm1RC413( -1) ;
      }
      pr_default.close(4);
      onLoadActions1RC413( ) ;
   }

   public void onLoadActions1RC413( )
   {
   }

   public void checkExtendedTable1RC413( )
   {
      nIsDirty_413 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01RC4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A228BarUniMed = T01RC4_A228BarUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
      pr_default.close(2);
      /* Using cursor T01RC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1RC413( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01RC7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A228BarUniMed = T01RC7_A228BarUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A228BarUniMed))+"\"") ;
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
                         String A2809MetTerCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01RC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1RC413( )
   {
      /* Using cursor T01RC9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound413 = (short)(1) ;
      }
      else
      {
         RcdFound413 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RC413( 1) ;
         RcdFound413 = (short)(1) ;
         A2813MetPieCod = T01RC3_A2813MetPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
         A2814MetPieKil = T01RC3_A2814MetPieKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
         A2815MetPieMet = T01RC3_A2815MetPieMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
         A6635MetPieAnc = T01RC3_A6635MetPieAnc[0] ;
         A4910MetPieMtD = T01RC3_A4910MetPieMtD[0] ;
         A2816MetPieEst = T01RC3_A2816MetPieEst[0] ;
         A4917MetPieObs = T01RC3_A4917MetPieObs[0] ;
         A12994MetPieDfUl = T01RC3_A12994MetPieDfUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
         A396EmprCod = T01RC3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RC3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RC3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RC3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2809MetTerCod = T01RC3_A2809MetTerCod[0] ;
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
         load1RC413( ) ;
         if ( AnyError == 1 )
         {
            RcdFound413 = (short)(0) ;
            initializeNonKey1RC413( ) ;
         }
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound413 = (short)(0) ;
         initializeNonKey1RC413( ) ;
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
      getKey1RC413( ) ;
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
      /* Using cursor T01RC10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A2809MetTerCod, A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A2813MetPieCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01RC10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RC10_A2809MetTerCod[0], A2809MetTerCod) < 0 ) || ( GXutil.strcmp(T01RC10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RC10_A129BarCod[0] < A129BarCod ) || ( T01RC10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RC10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RC10_A132BarCodReo[0] < A132BarCodReo ) || ( T01RC10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RC10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RC10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RC10_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01RC10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RC10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RC10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RC10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RC10_A2813MetPieCod[0], A2813MetPieCod) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01RC10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RC10_A2809MetTerCod[0], A2809MetTerCod) > 0 ) || ( GXutil.strcmp(T01RC10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RC10_A129BarCod[0] > A129BarCod ) || ( T01RC10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RC10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RC10_A132BarCodReo[0] > A132BarCodReo ) || ( T01RC10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RC10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RC10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RC10_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01RC10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RC10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RC10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RC10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RC10_A2813MetPieCod[0], A2813MetPieCod) > 0 ) ) )
         {
            A396EmprCod = T01RC10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2809MetTerCod = T01RC10_A2809MetTerCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = T01RC10_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RC10_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RC10_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2813MetPieCod = T01RC10_A2813MetPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
            RcdFound413 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound413 = (short)(0) ;
      /* Using cursor T01RC11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A2809MetTerCod, A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A2813MetPieCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01RC11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RC11_A2809MetTerCod[0], A2809MetTerCod) > 0 ) || ( GXutil.strcmp(T01RC11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RC11_A129BarCod[0] > A129BarCod ) || ( T01RC11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RC11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RC11_A132BarCodReo[0] > A132BarCodReo ) || ( T01RC11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RC11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RC11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RC11_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01RC11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RC11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RC11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RC11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RC11_A2813MetPieCod[0], A2813MetPieCod) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01RC11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RC11_A2809MetTerCod[0], A2809MetTerCod) < 0 ) || ( GXutil.strcmp(T01RC11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RC11_A129BarCod[0] < A129BarCod ) || ( T01RC11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RC11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RC11_A132BarCodReo[0] < A132BarCodReo ) || ( T01RC11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RC11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RC11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RC11_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01RC11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RC11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RC11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RC11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RC11_A2813MetPieCod[0], A2813MetPieCod) < 0 ) ) )
         {
            A396EmprCod = T01RC11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2809MetTerCod = T01RC11_A2809MetTerCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = T01RC11_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RC11_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RC11_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2813MetPieCod = T01RC11_A2813MetPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
            RcdFound413 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RC413( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RC413( ) ;
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
               update1RC413( ) ;
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
               insert1RC413( ) ;
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
                  insert1RC413( ) ;
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
      scanStart1RC413( ) ;
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
      scanEnd1RC413( ) ;
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
      scanStart1RC413( ) ;
      if ( RcdFound413 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound413 != 0 )
         {
            scanNext1RC413( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMetPieKil_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RC413( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1RC413( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2814MetPieKil, T01RC2_A2814MetPieKil[0]) != 0 ) || ( DecimalUtil.compareTo(Z2815MetPieMet, T01RC2_A2815MetPieMet[0]) != 0 ) || ( Z6635MetPieAnc != T01RC2_A6635MetPieAnc[0] ) || ( DecimalUtil.compareTo(Z4910MetPieMtD, T01RC2_A4910MetPieMtD[0]) != 0 ) || ( Z2816MetPieEst != T01RC2_A2816MetPieEst[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4917MetPieObs, T01RC2_A4917MetPieObs[0]) != 0 ) || ( Z12994MetPieDfUl != T01RC2_A12994MetPieDfUl[0] ) )
         {
            if ( DecimalUtil.compareTo(Z2814MetPieKil, T01RC2_A2814MetPieKil[0]) != 0 )
            {
               GXutil.writeLogln("expedicionesautomatizadas.lmetpi:[seudo value changed for attri]"+"MetPieKil");
               GXutil.writeLogRaw("Old: ",Z2814MetPieKil);
               GXutil.writeLogRaw("Current: ",T01RC2_A2814MetPieKil[0]);
            }
            if ( DecimalUtil.compareTo(Z2815MetPieMet, T01RC2_A2815MetPieMet[0]) != 0 )
            {
               GXutil.writeLogln("expedicionesautomatizadas.lmetpi:[seudo value changed for attri]"+"MetPieMet");
               GXutil.writeLogRaw("Old: ",Z2815MetPieMet);
               GXutil.writeLogRaw("Current: ",T01RC2_A2815MetPieMet[0]);
            }
            if ( Z6635MetPieAnc != T01RC2_A6635MetPieAnc[0] )
            {
               GXutil.writeLogln("expedicionesautomatizadas.lmetpi:[seudo value changed for attri]"+"MetPieAnc");
               GXutil.writeLogRaw("Old: ",Z6635MetPieAnc);
               GXutil.writeLogRaw("Current: ",T01RC2_A6635MetPieAnc[0]);
            }
            if ( DecimalUtil.compareTo(Z4910MetPieMtD, T01RC2_A4910MetPieMtD[0]) != 0 )
            {
               GXutil.writeLogln("expedicionesautomatizadas.lmetpi:[seudo value changed for attri]"+"MetPieMtD");
               GXutil.writeLogRaw("Old: ",Z4910MetPieMtD);
               GXutil.writeLogRaw("Current: ",T01RC2_A4910MetPieMtD[0]);
            }
            if ( Z2816MetPieEst != T01RC2_A2816MetPieEst[0] )
            {
               GXutil.writeLogln("expedicionesautomatizadas.lmetpi:[seudo value changed for attri]"+"MetPieEst");
               GXutil.writeLogRaw("Old: ",Z2816MetPieEst);
               GXutil.writeLogRaw("Current: ",T01RC2_A2816MetPieEst[0]);
            }
            if ( GXutil.strcmp(Z4917MetPieObs, T01RC2_A4917MetPieObs[0]) != 0 )
            {
               GXutil.writeLogln("expedicionesautomatizadas.lmetpi:[seudo value changed for attri]"+"MetPieObs");
               GXutil.writeLogRaw("Old: ",Z4917MetPieObs);
               GXutil.writeLogRaw("Current: ",T01RC2_A4917MetPieObs[0]);
            }
            if ( Z12994MetPieDfUl != T01RC2_A12994MetPieDfUl[0] )
            {
               GXutil.writeLogln("expedicionesautomatizadas.lmetpi:[seudo value changed for attri]"+"MetPieDfUl");
               GXutil.writeLogRaw("Old: ",Z12994MetPieDfUl);
               GXutil.writeLogRaw("Current: ",T01RC2_A12994MetPieDfUl[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMETPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RC413( )
   {
      beforeValidate1RC413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RC413( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RC413( 0) ;
         checkOptimisticConcurrency1RC413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RC413( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RC413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RC12 */
                  pr_default.execute(10, new Object[] {A2813MetPieCod, A2814MetPieKil, A2815MetPieMet, Short.valueOf(A6635MetPieAnc), A4910MetPieMtD, Byte.valueOf(A2816MetPieEst), A4917MetPieObs, Short.valueOf(A12994MetPieDfUl), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2809MetTerCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
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
                        resetCaption1RC0( ) ;
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
            load1RC413( ) ;
         }
         endLevel1RC413( ) ;
      }
      closeExtendedTableCursors1RC413( ) ;
   }

   public void update1RC413( )
   {
      beforeValidate1RC413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RC413( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RC413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RC413( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RC413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RC13 */
                  pr_default.execute(11, new Object[] {A2814MetPieKil, A2815MetPieMet, Short.valueOf(A6635MetPieAnc), A4910MetPieMtD, Byte.valueOf(A2816MetPieEst), A4917MetPieObs, Short.valueOf(A12994MetPieDfUl), A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RC413( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1RC0( ) ;
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
         endLevel1RC413( ) ;
      }
      closeExtendedTableCursors1RC413( ) ;
   }

   public void deferredUpdate1RC413( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RC413( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RC413( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RC413( ) ;
         afterConfirm1RC413( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RC413( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RC14 */
               pr_default.execute(12, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
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
                        initAll1RC413( ) ;
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
                     resetCaption1RC0( ) ;
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
      endLevel1RC413( ) ;
      Gx_mode = sMode413 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RC413( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01RC15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A228BarUniMed = T01RC15_A228BarUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
         pr_default.close(13);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01RC16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevel1RC413( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RC413( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "expedicionesautomatizadas.lmetpi");
         if ( AnyError == 0 )
         {
            confirmValues1RC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "expedicionesautomatizadas.lmetpi");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RC413( )
   {
      /* Using cursor T01RC17 */
      pr_default.execute(15);
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A396EmprCod = T01RC17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = T01RC17_A2809MetTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = T01RC17_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RC17_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RC17_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2813MetPieCod = T01RC17_A2813MetPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RC413( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A396EmprCod = T01RC17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = T01RC17_A2809MetTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = T01RC17_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RC17_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RC17_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2813MetPieCod = T01RC17_A2813MetPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
      }
   }

   public void scanEnd1RC413( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1RC413( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RC413( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RC413( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RC413( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RC413( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RC413( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RC413( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMetTerCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTerCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTerCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtMetPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), true);
      edtMetPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Enabled), 5, 0), true);
      edtMetPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Enabled), 5, 0), true);
      edtMetPieDfUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfUl_Enabled), 5, 0), true);
      edtBarUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUniMed_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1RC413( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1RC0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.lmetpi", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"LMETPI");
      forbiddenHiddens.add("MetPieAnc", localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9"));
      forbiddenHiddens.add("MetPieMtD", localUtil.format( A4910MetPieMtD, "ZZZZ9.99"));
      forbiddenHiddens.add("MetPieEst", localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9"));
      forbiddenHiddens.add("MetPieObs", GXutil.rtrim( localUtil.format( A4917MetPieObs, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("expedicionesautomatizadas\\lmetpi:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6635MetPieAnc", GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4910MetPieMtD", GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2816MetPieEst", GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4917MetPieObs", Z4917MetPieObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12994MetPieDfUl", GXutil.ltrim( localUtil.ntoc( Z12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEANC", GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEMTD", GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEEST", GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEOBS", A4917MetPieObs);
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
      return formatLink("app.expedicionesautomatizadas.lmetpi", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ExpedicionesAutomatizadas.LMETPI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "LMETPI", "") ;
   }

   public void initializeNonKey1RC413( )
   {
      A2814MetPieKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
      A2815MetPieMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
      A6635MetPieAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6635MetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6635MetPieAnc), 3, 0));
      A4910MetPieMtD = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4910MetPieMtD", GXutil.ltrimstr( A4910MetPieMtD, 8, 2));
      A2816MetPieEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.str( A2816MetPieEst, 1, 0));
      A4917MetPieObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4917MetPieObs", A4917MetPieObs);
      A12994MetPieDfUl = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
      A228BarUniMed = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z6635MetPieAnc = (short)(0) ;
      Z4910MetPieMtD = DecimalUtil.ZERO ;
      Z2816MetPieEst = (byte)(0) ;
      Z4917MetPieObs = "" ;
      Z12994MetPieDfUl = (short)(0) ;
   }

   public void initAll1RC413( )
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
      initializeNonKey1RC413( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101638375", true, true);
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
      httpContext.AddJavascriptSource("expedicionesautomatizadas/lmetpi.js", "?20266101638376", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtMetTerCod_Internalname = "METTERCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtMetPieCod_Internalname = "METPIECOD" ;
      edtMetPieKil_Internalname = "METPIEKIL" ;
      edtMetPieMet_Internalname = "METPIEMET" ;
      edtMetPieDfUl_Internalname = "METPIEDFUL" ;
      edtBarUniMed_Internalname = "BARUNIMED" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      Form.setCaption( httpContext.getMessage( "LMETPI", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBarUniMed_Jsonclick = "" ;
      edtBarUniMed_Enabled = 0 ;
      edtMetPieDfUl_Jsonclick = "" ;
      edtMetPieDfUl_Enabled = 1 ;
      edtMetPieMet_Jsonclick = "" ;
      edtMetPieMet_Enabled = 1 ;
      edtMetPieKil_Jsonclick = "" ;
      edtMetPieKil_Enabled = 1 ;
      edtMetPieCod_Jsonclick = "" ;
      edtMetPieCod_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtMetTerCod_Jsonclick = "" ;
      edtMetTerCod_Enabled = 1 ;
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
      /* Using cursor T01RC15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A228BarUniMed = T01RC15_A228BarUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
      pr_default.close(13);
      /* Using cursor T01RC18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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

   public void valid_Barcodpar( )
   {
      /* Using cursor T01RC15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A228BarUniMed = T01RC15_A228BarUniMed[0] ;
      pr_default.close(13);
      /* Using cursor T01RC18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", GXutil.rtrim( A228BarUniMed));
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
      httpContext.ajax_rsp_assign_attri("", false, "A6635MetPieAnc", GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4910MetPieMtD", GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4917MetPieObs", A4917MetPieObs);
      httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", GXutil.rtrim( A228BarUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2809MetTerCod", GXutil.rtrim( Z2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2813MetPieCod", GXutil.rtrim( Z2813MetPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2814MetPieKil", GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2815MetPieMet", GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6635MetPieAnc", GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4910MetPieMtD", GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2816MetPieEst", GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4917MetPieObs", Z4917MetPieObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12994MetPieDfUl", GXutil.ltrim( localUtil.ntoc( Z12994MetPieDfUl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z228BarUniMed", GXutil.rtrim( Z228BarUniMed));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A6635MetPieAnc',fld:'METPIEANC',pic:'ZZ9'},{av:'A4910MetPieMtD',fld:'METPIEMTD',pic:'ZZZZ9.99'},{av:'A2816MetPieEst',fld:'METPIEEST',pic:'9'},{av:'A4917MetPieObs',fld:'METPIEOBS',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_METTERCOD","{handler:'valid_Mettercod',iparms:[]");
      setEventMetadata("VALID_METTERCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'}]}");
      setEventMetadata("VALID_METPIECOD","{handler:'valid_Metpiecod',iparms:[{av:'A4917MetPieObs',fld:'METPIEOBS',pic:''},{av:'A2816MetPieEst',fld:'METPIEEST',pic:'9'},{av:'A4910MetPieMtD',fld:'METPIEMTD',pic:'ZZZZ9.99'},{av:'A6635MetPieAnc',fld:'METPIEANC',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_METPIECOD",",oparms:[{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'},{av:'A6635MetPieAnc',fld:'METPIEANC',pic:'ZZ9'},{av:'A4910MetPieMtD',fld:'METPIEMTD',pic:'ZZZZ9.99'},{av:'A2816MetPieEst',fld:'METPIEEST',pic:'9'},{av:'A4917MetPieObs',fld:'METPIEOBS',pic:''},{av:'A12994MetPieDfUl',fld:'METPIEDFUL',pic:'ZZZ9'},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2809MetTerCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2813MetPieCod'},{av:'Z2814MetPieKil'},{av:'Z2815MetPieMet'},{av:'Z6635MetPieAnc'},{av:'Z4910MetPieMtD'},{av:'Z2816MetPieEst'},{av:'Z4917MetPieObs'},{av:'Z12994MetPieDfUl'},{av:'Z228BarUniMed'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(13);
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
      Z4910MetPieMtD = DecimalUtil.ZERO ;
      Z4917MetPieObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A2809MetTerCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      lblTitle_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A4917MetPieObs = "" ;
      Gx_mode = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z228BarUniMed = "" ;
      T01RC6_A2813MetPieCod = new String[] {""} ;
      T01RC6_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RC6_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RC6_A6635MetPieAnc = new short[1] ;
      T01RC6_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RC6_A2816MetPieEst = new byte[1] ;
      T01RC6_A4917MetPieObs = new String[] {""} ;
      T01RC6_A12994MetPieDfUl = new short[1] ;
      T01RC6_A228BarUniMed = new String[] {""} ;
      T01RC6_A396EmprCod = new String[] {""} ;
      T01RC6_A129BarCod = new int[1] ;
      T01RC6_A132BarCodReo = new byte[1] ;
      T01RC6_A130BarCodPar = new String[] {""} ;
      T01RC6_A2809MetTerCod = new String[] {""} ;
      T01RC4_A228BarUniMed = new String[] {""} ;
      T01RC5_A396EmprCod = new String[] {""} ;
      T01RC7_A228BarUniMed = new String[] {""} ;
      T01RC8_A396EmprCod = new String[] {""} ;
      T01RC9_A396EmprCod = new String[] {""} ;
      T01RC9_A2809MetTerCod = new String[] {""} ;
      T01RC9_A129BarCod = new int[1] ;
      T01RC9_A132BarCodReo = new byte[1] ;
      T01RC9_A130BarCodPar = new String[] {""} ;
      T01RC9_A2813MetPieCod = new String[] {""} ;
      T01RC3_A2813MetPieCod = new String[] {""} ;
      T01RC3_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RC3_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RC3_A6635MetPieAnc = new short[1] ;
      T01RC3_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RC3_A2816MetPieEst = new byte[1] ;
      T01RC3_A4917MetPieObs = new String[] {""} ;
      T01RC3_A12994MetPieDfUl = new short[1] ;
      T01RC3_A396EmprCod = new String[] {""} ;
      T01RC3_A129BarCod = new int[1] ;
      T01RC3_A132BarCodReo = new byte[1] ;
      T01RC3_A130BarCodPar = new String[] {""} ;
      T01RC3_A2809MetTerCod = new String[] {""} ;
      sMode413 = "" ;
      T01RC10_A396EmprCod = new String[] {""} ;
      T01RC10_A2809MetTerCod = new String[] {""} ;
      T01RC10_A129BarCod = new int[1] ;
      T01RC10_A132BarCodReo = new byte[1] ;
      T01RC10_A130BarCodPar = new String[] {""} ;
      T01RC10_A2813MetPieCod = new String[] {""} ;
      T01RC11_A396EmprCod = new String[] {""} ;
      T01RC11_A2809MetTerCod = new String[] {""} ;
      T01RC11_A129BarCod = new int[1] ;
      T01RC11_A132BarCodReo = new byte[1] ;
      T01RC11_A130BarCodPar = new String[] {""} ;
      T01RC11_A2813MetPieCod = new String[] {""} ;
      T01RC2_A2813MetPieCod = new String[] {""} ;
      T01RC2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RC2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RC2_A6635MetPieAnc = new short[1] ;
      T01RC2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RC2_A2816MetPieEst = new byte[1] ;
      T01RC2_A4917MetPieObs = new String[] {""} ;
      T01RC2_A12994MetPieDfUl = new short[1] ;
      T01RC2_A396EmprCod = new String[] {""} ;
      T01RC2_A129BarCod = new int[1] ;
      T01RC2_A132BarCodReo = new byte[1] ;
      T01RC2_A130BarCodPar = new String[] {""} ;
      T01RC2_A2809MetTerCod = new String[] {""} ;
      T01RC15_A228BarUniMed = new String[] {""} ;
      T01RC16_A396EmprCod = new String[] {""} ;
      T01RC16_A2809MetTerCod = new String[] {""} ;
      T01RC16_A129BarCod = new int[1] ;
      T01RC16_A132BarCodReo = new byte[1] ;
      T01RC16_A130BarCodPar = new String[] {""} ;
      T01RC16_A2813MetPieCod = new String[] {""} ;
      T01RC16_A12995MetPieDfLi = new short[1] ;
      T01RC17_A396EmprCod = new String[] {""} ;
      T01RC17_A2809MetTerCod = new String[] {""} ;
      T01RC17_A129BarCod = new int[1] ;
      T01RC17_A132BarCodReo = new byte[1] ;
      T01RC17_A130BarCodPar = new String[] {""} ;
      T01RC17_A2813MetPieCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01RC18_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ2809MetTerCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2813MetPieCod = "" ;
      ZZ2814MetPieKil = DecimalUtil.ZERO ;
      ZZ2815MetPieMet = DecimalUtil.ZERO ;
      ZZ4910MetPieMtD = DecimalUtil.ZERO ;
      ZZ4917MetPieObs = "" ;
      ZZ228BarUniMed = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.lmetpi__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.lmetpi__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.lmetpi__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.lmetpi__default(),
         new Object[] {
             new Object[] {
            T01RC2_A2813MetPieCod, T01RC2_A2814MetPieKil, T01RC2_A2815MetPieMet, T01RC2_A6635MetPieAnc, T01RC2_A4910MetPieMtD, T01RC2_A2816MetPieEst, T01RC2_A4917MetPieObs, T01RC2_A12994MetPieDfUl, T01RC2_A396EmprCod, T01RC2_A129BarCod,
            T01RC2_A132BarCodReo, T01RC2_A130BarCodPar, T01RC2_A2809MetTerCod
            }
            , new Object[] {
            T01RC3_A2813MetPieCod, T01RC3_A2814MetPieKil, T01RC3_A2815MetPieMet, T01RC3_A6635MetPieAnc, T01RC3_A4910MetPieMtD, T01RC3_A2816MetPieEst, T01RC3_A4917MetPieObs, T01RC3_A12994MetPieDfUl, T01RC3_A396EmprCod, T01RC3_A129BarCod,
            T01RC3_A132BarCodReo, T01RC3_A130BarCodPar, T01RC3_A2809MetTerCod
            }
            , new Object[] {
            T01RC4_A228BarUniMed
            }
            , new Object[] {
            T01RC5_A396EmprCod
            }
            , new Object[] {
            T01RC6_A2813MetPieCod, T01RC6_A2814MetPieKil, T01RC6_A2815MetPieMet, T01RC6_A6635MetPieAnc, T01RC6_A4910MetPieMtD, T01RC6_A2816MetPieEst, T01RC6_A4917MetPieObs, T01RC6_A12994MetPieDfUl, T01RC6_A228BarUniMed, T01RC6_A396EmprCod,
            T01RC6_A129BarCod, T01RC6_A132BarCodReo, T01RC6_A130BarCodPar, T01RC6_A2809MetTerCod
            }
            , new Object[] {
            T01RC7_A228BarUniMed
            }
            , new Object[] {
            T01RC8_A396EmprCod
            }
            , new Object[] {
            T01RC9_A396EmprCod, T01RC9_A2809MetTerCod, T01RC9_A129BarCod, T01RC9_A132BarCodReo, T01RC9_A130BarCodPar, T01RC9_A2813MetPieCod
            }
            , new Object[] {
            T01RC10_A396EmprCod, T01RC10_A2809MetTerCod, T01RC10_A129BarCod, T01RC10_A132BarCodReo, T01RC10_A130BarCodPar, T01RC10_A2813MetPieCod
            }
            , new Object[] {
            T01RC11_A396EmprCod, T01RC11_A2809MetTerCod, T01RC11_A129BarCod, T01RC11_A132BarCodReo, T01RC11_A130BarCodPar, T01RC11_A2813MetPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RC15_A228BarUniMed
            }
            , new Object[] {
            T01RC16_A396EmprCod, T01RC16_A2809MetTerCod, T01RC16_A129BarCod, T01RC16_A132BarCodReo, T01RC16_A130BarCodPar, T01RC16_A2813MetPieCod, T01RC16_A12995MetPieDfLi
            }
            , new Object[] {
            T01RC17_A396EmprCod, T01RC17_A2809MetTerCod, T01RC17_A129BarCod, T01RC17_A132BarCodReo, T01RC17_A130BarCodPar, T01RC17_A2813MetPieCod
            }
            , new Object[] {
            T01RC18_A396EmprCod
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
   private short Z12994MetPieDfUl ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12994MetPieDfUl ;
   private short A6635MetPieAnc ;
   private short RcdFound413 ;
   private short nIsDirty_413 ;
   private short ZZ6635MetPieAnc ;
   private short ZZ12994MetPieDfUl ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMetTerCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtMetPieCod_Enabled ;
   private int edtMetPieKil_Enabled ;
   private int edtMetPieMet_Enabled ;
   private int edtMetPieDfUl_Enabled ;
   private int edtBarUniMed_Enabled ;
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
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal ZZ2814MetPieKil ;
   private java.math.BigDecimal ZZ2815MetPieMet ;
   private java.math.BigDecimal ZZ4910MetPieMtD ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z2809MetTerCod ;
   private String Z130BarCodPar ;
   private String Z2813MetPieCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A2809MetTerCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String divTablemain_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
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
   private String edtMetTerCod_Internalname ;
   private String edtMetTerCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtMetPieCod_Internalname ;
   private String A2813MetPieCod ;
   private String edtMetPieCod_Jsonclick ;
   private String edtMetPieKil_Internalname ;
   private String edtMetPieKil_Jsonclick ;
   private String edtMetPieMet_Internalname ;
   private String edtMetPieMet_Jsonclick ;
   private String edtMetPieDfUl_Internalname ;
   private String edtMetPieDfUl_Jsonclick ;
   private String edtBarUniMed_Internalname ;
   private String A228BarUniMed ;
   private String edtBarUniMed_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z228BarUniMed ;
   private String sMode413 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ2809MetTerCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2813MetPieCod ;
   private String ZZ228BarUniMed ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private String Z4917MetPieObs ;
   private String A4917MetPieObs ;
   private String ZZ4917MetPieObs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01RC6_A2813MetPieCod ;
   private java.math.BigDecimal[] T01RC6_A2814MetPieKil ;
   private java.math.BigDecimal[] T01RC6_A2815MetPieMet ;
   private short[] T01RC6_A6635MetPieAnc ;
   private java.math.BigDecimal[] T01RC6_A4910MetPieMtD ;
   private byte[] T01RC6_A2816MetPieEst ;
   private String[] T01RC6_A4917MetPieObs ;
   private short[] T01RC6_A12994MetPieDfUl ;
   private String[] T01RC6_A228BarUniMed ;
   private String[] T01RC6_A396EmprCod ;
   private int[] T01RC6_A129BarCod ;
   private byte[] T01RC6_A132BarCodReo ;
   private String[] T01RC6_A130BarCodPar ;
   private String[] T01RC6_A2809MetTerCod ;
   private String[] T01RC4_A228BarUniMed ;
   private String[] T01RC5_A396EmprCod ;
   private String[] T01RC7_A228BarUniMed ;
   private String[] T01RC8_A396EmprCod ;
   private String[] T01RC9_A396EmprCod ;
   private String[] T01RC9_A2809MetTerCod ;
   private int[] T01RC9_A129BarCod ;
   private byte[] T01RC9_A132BarCodReo ;
   private String[] T01RC9_A130BarCodPar ;
   private String[] T01RC9_A2813MetPieCod ;
   private String[] T01RC3_A2813MetPieCod ;
   private java.math.BigDecimal[] T01RC3_A2814MetPieKil ;
   private java.math.BigDecimal[] T01RC3_A2815MetPieMet ;
   private short[] T01RC3_A6635MetPieAnc ;
   private java.math.BigDecimal[] T01RC3_A4910MetPieMtD ;
   private byte[] T01RC3_A2816MetPieEst ;
   private String[] T01RC3_A4917MetPieObs ;
   private short[] T01RC3_A12994MetPieDfUl ;
   private String[] T01RC3_A396EmprCod ;
   private int[] T01RC3_A129BarCod ;
   private byte[] T01RC3_A132BarCodReo ;
   private String[] T01RC3_A130BarCodPar ;
   private String[] T01RC3_A2809MetTerCod ;
   private String[] T01RC10_A396EmprCod ;
   private String[] T01RC10_A2809MetTerCod ;
   private int[] T01RC10_A129BarCod ;
   private byte[] T01RC10_A132BarCodReo ;
   private String[] T01RC10_A130BarCodPar ;
   private String[] T01RC10_A2813MetPieCod ;
   private String[] T01RC11_A396EmprCod ;
   private String[] T01RC11_A2809MetTerCod ;
   private int[] T01RC11_A129BarCod ;
   private byte[] T01RC11_A132BarCodReo ;
   private String[] T01RC11_A130BarCodPar ;
   private String[] T01RC11_A2813MetPieCod ;
   private String[] T01RC2_A2813MetPieCod ;
   private java.math.BigDecimal[] T01RC2_A2814MetPieKil ;
   private java.math.BigDecimal[] T01RC2_A2815MetPieMet ;
   private short[] T01RC2_A6635MetPieAnc ;
   private java.math.BigDecimal[] T01RC2_A4910MetPieMtD ;
   private byte[] T01RC2_A2816MetPieEst ;
   private String[] T01RC2_A4917MetPieObs ;
   private short[] T01RC2_A12994MetPieDfUl ;
   private String[] T01RC2_A396EmprCod ;
   private int[] T01RC2_A129BarCod ;
   private byte[] T01RC2_A132BarCodReo ;
   private String[] T01RC2_A130BarCodPar ;
   private String[] T01RC2_A2809MetTerCod ;
   private String[] T01RC15_A228BarUniMed ;
   private String[] T01RC16_A396EmprCod ;
   private String[] T01RC16_A2809MetTerCod ;
   private int[] T01RC16_A129BarCod ;
   private byte[] T01RC16_A132BarCodReo ;
   private String[] T01RC16_A130BarCodPar ;
   private String[] T01RC16_A2813MetPieCod ;
   private short[] T01RC16_A12995MetPieDfLi ;
   private String[] T01RC17_A396EmprCod ;
   private String[] T01RC17_A2809MetTerCod ;
   private int[] T01RC17_A129BarCod ;
   private byte[] T01RC17_A132BarCodReo ;
   private String[] T01RC17_A130BarCodPar ;
   private String[] T01RC17_A2813MetPieCod ;
   private String[] T01RC18_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
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
          new ForEachCursor("T01RC2", "SELECT MetPieCod, MetPieKil, MetPieMet, MetPieAnc, MetPieMtD, MetPieEst, MetPieObs, MetPieDfUl, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?  FOR UPDATE OF MetPieKil, MetPieMet, MetPieAnc, MetPieMtD, MetPieEst, MetPieObs, MetPieDfUl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RC3", "SELECT MetPieCod, MetPieKil, MetPieMet, MetPieAnc, MetPieMtD, MetPieEst, MetPieObs, MetPieDfUl, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RC4", "SELECT BarUniMed FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RC5", "SELECT EmprCod FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RC6", "SELECT /*+ FIRST_ROWS(100) */ TM1.MetPieCod, TM1.MetPieKil, TM1.MetPieMet, TM1.MetPieAnc, TM1.MetPieMtD, TM1.MetPieEst, TM1.MetPieObs, TM1.MetPieDfUl, T2.BarUniMed, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MetTerCod FROM (TXPLMETPI TM1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = TM1.EmprCod AND T2.BarCod = TM1.BarCod AND T2.BarCodReo = TM1.BarCodReo AND T2.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.MetTerCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.MetPieCod = ? ORDER BY TM1.EmprCod, TM1.MetTerCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MetPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RC7", "SELECT BarUniMed FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RC8", "SELECT EmprCod FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RC9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RC10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE ( EmprCod > ? or EmprCod = ? and MetTerCod > ? or MetTerCod = ? and EmprCod = ? and BarCod > ? or BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and MetPieCod > ?) ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RC11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE ( EmprCod < ? or EmprCod = ? and MetTerCod < ? or MetTerCod = ? and EmprCod = ? and BarCod < ? or BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and MetPieCod < ?) ORDER BY EmprCod DESC, MetTerCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RC12", "INSERT INTO TXPLMETPI(MetPieCod, MetPieKil, MetPieMet, MetPieAnc, MetPieMtD, MetPieEst, MetPieObs, MetPieDfUl, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod, MetPieDsc, MetPieDef, MetPieFch, MetPieOb, MetPiectr, MetPieId, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieOpe, MetPieTurn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, 0)", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01RC13", "UPDATE TXPLMETPI SET MetPieKil=?, MetPieMet=?, MetPieAnc=?, MetPieMtD=?, MetPieEst=?, MetPieObs=?, MetPieDfUl=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01RC14", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new ForEachCursor("T01RC15", "SELECT BarUniMed FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RC16", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RC17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RC18", "SELECT EmprCod FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 16 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 8 :
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
            case 9 :
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
            case 10 :
               stmt.setString(1, (String)parms[0], 9);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 1024, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 10);
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setVarchar(6, (String)parms[5], 1024, false);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setString(9, (String)parms[8], 10);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 9);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

