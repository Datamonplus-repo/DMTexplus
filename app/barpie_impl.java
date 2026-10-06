package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class barpie_impl extends GXDataArea
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
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A44AlbRecCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla BARPIE", ""), (short)(0)) ;
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

   public barpie_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public barpie_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( barpie_impl.class ));
   }

   public barpie_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla BARPIE", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_BARPIE.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_BARPIE.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieCod_Internalname, httpContext.getMessage( "Nº Pieza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod), GXutil.rtrim( localUtil.format( A200BarPieCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRecCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieKil_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieKil_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieKil_Enabled!=0) ? localUtil.format( A203BarPieKil, "ZZZZZ9.99") : localUtil.format( A203BarPieKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieKil_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieKil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieMet_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieMet_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieMet_Enabled!=0) ? localUtil.format( A205BarPieMet, "ZZZZZ9.99") : localUtil.format( A205BarPieMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieMet_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieMet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieEst_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieEst_Internalname, httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieEst_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarKilLan_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarKilLan_Internalname, httpContext.getMessage( "Kgs Lan", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarKilLan_Internalname, GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKilLan_Enabled!=0) ? localUtil.format( A170BarKilLan, "ZZZZZ9.99") : localUtil.format( A170BarKilLan, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKilLan_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarKilLan_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarMetLan_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarMetLan_Internalname, httpContext.getMessage( "Mts Lan", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMetLan_Internalname, GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarMetLan_Enabled!=0) ? localUtil.format( A183BarMetLan, "ZZZZZ9.99") : localUtil.format( A183BarMetLan, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMetLan_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarMetLan_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPConTro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPConTro_Internalname, httpContext.getMessage( "Nº Trozos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPConTro_Internalname, GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPConTro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPConTro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPConTro_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPieOriCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPieOriCod_Internalname, httpContext.getMessage( "Nº Pza Origen", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPieOriCod_Internalname, GXutil.rtrim( A908PieOriCod), GXutil.rtrim( localUtil.format( A908PieOriCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPieOriCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPieOriCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieLzd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieLzd_Internalname, httpContext.getMessage( "Pzs Lan", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieLzd_Internalname, GXutil.ltrim( localUtil.ntoc( A1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieLzd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1271BarPieLzd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1271BarPieLzd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieLzd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieLzd_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPiePie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPiePie_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPiePie_Internalname, GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPiePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPiePie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPiePie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieLoc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieLoc_Internalname, httpContext.getMessage( "Localizacion Pieza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieLoc_Internalname, GXutil.rtrim( A2186BarPieLoc), GXutil.rtrim( localUtil.format( A2186BarPieLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieLoc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieAnc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieAnc_Internalname, httpContext.getMessage( "Ancho Acabado Pieza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A1691BarPieAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1691BarPieAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1691BarPieAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieAnc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarKgsAut_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarKgsAut_Internalname, httpContext.getMessage( "BarKgsAut", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarKgsAut_Internalname, GXutil.ltrim( localUtil.ntoc( A3275BarKgsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKgsAut_Enabled!=0) ? localUtil.format( A3275BarKgsAut, "ZZZZZ9.99") : localUtil.format( A3275BarKgsAut, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKgsAut_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarKgsAut_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarMtsAut_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarMtsAut_Internalname, httpContext.getMessage( "BarMtsAut", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMtsAut_Internalname, GXutil.ltrim( localUtil.ntoc( A3276BarMtsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarMtsAut_Enabled!=0) ? localUtil.format( A3276BarMtsAut, "ZZZZZ9.99") : localUtil.format( A3276BarMtsAut, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMtsAut_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarMtsAut_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieAut_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieAut_Internalname, httpContext.getMessage( "BarPieAut", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieAut_Internalname, GXutil.ltrim( localUtil.ntoc( A3277BarPieAut, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieAut_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3277BarPieAut), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3277BarPieAut), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieAut_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieAut_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieImp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieImp_Internalname, httpContext.getMessage( "Impresa?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieImp_Internalname, GXutil.rtrim( A6116BarPieImp), GXutil.rtrim( localUtil.format( A6116BarPieImp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieImp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieImp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieIdPz_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieIdPz_Internalname, httpContext.getMessage( "Identificacion Pieza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieIdPz_Internalname, GXutil.rtrim( A6489BarPieIdPz), GXutil.rtrim( localUtil.format( A6489BarPieIdPz, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieIdPz_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieIdPz_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBapieObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBapieObs_Internalname, httpContext.getMessage( "Observaciones Pieza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBapieObs_Internalname, GXutil.rtrim( A8707BapieObs), GXutil.rtrim( localUtil.format( A8707BapieObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBapieObs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBapieObs_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCodBarPz_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCodBarPz_Internalname, httpContext.getMessage( "CodigoBarras", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCodBarPz_Internalname, GXutil.rtrim( A8838CodBarPz), GXutil.rtrim( localUtil.format( A8838CodBarPz, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodBarPz_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCodBarPz_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPzaB80_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPzaB80_Internalname, httpContext.getMessage( "Pza B80", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPzaB80_Internalname, GXutil.rtrim( A8907PzaB80), GXutil.rtrim( localUtil.format( A8907PzaB80, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPzaB80_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPzaB80_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieK1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieK1_Internalname, httpContext.getMessage( "Kilos 1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieK1_Internalname, GXutil.ltrim( localUtil.ntoc( A9795BarPieK1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieK1_Enabled!=0) ? localUtil.format( A9795BarPieK1, "ZZZZZ9.99") : localUtil.format( A9795BarPieK1, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieK1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieK1_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieK2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieK2_Internalname, httpContext.getMessage( "Kilos 2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieK2_Internalname, GXutil.ltrim( localUtil.ntoc( A9796BarPieK2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieK2_Enabled!=0) ? localUtil.format( A9796BarPieK2, "ZZZZZ9.99") : localUtil.format( A9796BarPieK2, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieK2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieK2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPz1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPz1_Internalname, httpContext.getMessage( "Piezas 1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPz1_Internalname, GXutil.ltrim( localUtil.ntoc( A9798BarPz1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPz1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9798BarPz1), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9798BarPz1), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPz1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPz1_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPz2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPz2_Internalname, httpContext.getMessage( "Piezas 2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPz2_Internalname, GXutil.ltrim( localUtil.ntoc( A9799BarPz2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPz2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9799BarPz2), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9799BarPz2), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPz2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPz2_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNPes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNPes_Internalname, httpContext.getMessage( "N veces Pesadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNPes_Internalname, GXutil.ltrim( localUtil.ntoc( A9800BarNPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9800BarNPes), "9") : localUtil.format( DecimalUtil.doubleToDec(A9800BarNPes), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNPes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNPes_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieAncc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieAncc_Internalname, httpContext.getMessage( "Ancho Crudo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieAncc_Internalname, GXutil.ltrim( localUtil.ntoc( A9846BarPieAncc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieAncc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9846BarPieAncc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9846BarPieAncc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieAncc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieAncc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPiePda_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPiePda_Internalname, httpContext.getMessage( "Pulgadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPiePda_Internalname, GXutil.ltrim( localUtil.ntoc( A9984BarPiePda, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPiePda_Enabled!=0) ? localUtil.format( A9984BarPiePda, "ZZ9.99") : localUtil.format( A9984BarPiePda, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPiePda_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPiePda_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieObs_Internalname, GXutil.rtrim( A1919BarPieObs), GXutil.rtrim( localUtil.format( A1919BarPieObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieObs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieObs_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTara_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTara_Internalname, httpContext.getMessage( "Tara", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTara_Internalname, GXutil.ltrim( localUtil.ntoc( A6472BarTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTara_Enabled!=0) ? localUtil.format( A6472BarTara, "ZZ9.99") : localUtil.format( A6472BarTara, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTara_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarTara_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarUniB_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarUniB_Internalname, httpContext.getMessage( "Bruto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarUniB_Internalname, GXutil.ltrim( localUtil.ntoc( A6473BarUniB, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarUniB_Enabled!=0) ? localUtil.format( A6473BarUniB, "ZZZZZ9.99") : localUtil.format( A6473BarUniB, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarUniB_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarUniB_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieCLd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieCLd_Internalname, httpContext.getMessage( "Calidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieCLd_Internalname, GXutil.ltrim( localUtil.ntoc( A12113BarPieCLd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieCLd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12113BarPieCLd), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12113BarPieCLd), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieCLd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieCLd_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieFdv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieFdv_Internalname, httpContext.getMessage( "Fecha Division Pieza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarPieFdv_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieFdv_Internalname, localUtil.format(A12779BarPieFdv, "99/99/99"), localUtil.format( A12779BarPieFdv, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieFdv_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieFdv_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarPieFdv_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarPieFdv_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_BARPIE.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieUsu_Internalname, httpContext.getMessage( "Usuario Division Pieza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieUsu_Internalname, GXutil.rtrim( A12780BarPieUsu), GXutil.rtrim( localUtil.format( A12780BarPieUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,219);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieUsu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieUsu_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieFep_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieFep_Internalname, httpContext.getMessage( "Fecha Expedicion Automatizada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarPieFep_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieFep_Internalname, localUtil.format(A12911BarPieFep, "99/99/99"), localUtil.format( A12911BarPieFep, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieFep_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieFep_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarPieFep_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarPieFep_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_BARPIE.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieColD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieColD_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieColD_Internalname, GXutil.rtrim( A12920BarPieColD), GXutil.rtrim( localUtil.format( A12920BarPieColD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieColD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieColD_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieColN_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieColN_Internalname, httpContext.getMessage( "Numero Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieColN_Internalname, GXutil.ltrim( localUtil.ntoc( A12921BarPieColN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieColN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12921BarPieColN), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12921BarPieColN), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieColN_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieColN_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieCoCI_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieCoCI_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieCoCI_Internalname, GXutil.rtrim( A12926BarPieCoCI), GXutil.rtrim( localUtil.format( A12926BarPieCoCI, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieCoCI_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieCoCI_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieCoCN_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieCoCN_Internalname, httpContext.getMessage( "Numero Color Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieCoCN_Internalname, GXutil.ltrim( localUtil.ntoc( A12927BarPieCoCN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieCoCN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12927BarPieCoCN), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12927BarPieCoCN), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,244);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieCoCN_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieCoCN_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieArtI_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieArtI_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieArtI_Internalname, GXutil.rtrim( A12922BarPieArtI), GXutil.rtrim( localUtil.format( A12922BarPieArtI, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,249);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieArtI_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieArtI_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieArtD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieArtD_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 254,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieArtD_Internalname, GXutil.rtrim( A12923BarPieArtD), GXutil.rtrim( localUtil.format( A12923BarPieArtD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,254);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieArtD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieArtD_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieCliI_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieCliI_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieCliI_Internalname, GXutil.ltrim( localUtil.ntoc( A12924BarPieCliI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieCliI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12924BarPieCliI), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12924BarPieCliI), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,259);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieCliI_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieCliI_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieCliN_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieCliN_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieCliN_Internalname, GXutil.rtrim( A12925BarPieCliN), GXutil.rtrim( localUtil.format( A12925BarPieCliN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,264);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieCliN_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieCliN_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieEncC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieEncC_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieEncC_Internalname, GXutil.rtrim( A12928BarPieEncC), GXutil.rtrim( localUtil.format( A12928BarPieEncC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,269);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieEncC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieEncC_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieTono_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieTono_Internalname, httpContext.getMessage( "Tono", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 274,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieTono_Internalname, GXutil.rtrim( A12935BarPieTono), GXutil.rtrim( localUtil.format( A12935BarPieTono, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,274);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieTono_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieTono_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieSecu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieSecu_Internalname, httpContext.getMessage( "Secuencia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieSecu_Internalname, GXutil.rtrim( A12936BarPieSecu), GXutil.rtrim( localUtil.format( A12936BarPieSecu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,279);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieSecu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieSecu_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieOpe_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieOpe_Internalname, httpContext.getMessage( "Operario", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 284,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieOpe_Internalname, GXutil.ltrim( localUtil.ntoc( A12992BarPieOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieOpe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12992BarPieOpe), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12992BarPieOpe), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,284);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieOpe_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieOpe_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieDest_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieDest_Internalname, httpContext.getMessage( "Destino para BIANCO", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 289,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieDest_Internalname, GXutil.ltrim( localUtil.ntoc( A13004BarPieDest, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieDest_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13004BarPieDest), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A13004BarPieDest), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,289);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieDest_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieDest_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieEmp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieEmp_Internalname, httpContext.getMessage( "N Piezas conforman un ROLLO", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 294,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieEmp_Internalname, GXutil.ltrim( localUtil.ntoc( A13107BarPieEmp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieEmp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13107BarPieEmp), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13107BarPieEmp), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,294);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieEmp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieEmp_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieLote_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 299,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieLote_Internalname, GXutil.rtrim( A13108BarPieLote), GXutil.rtrim( localUtil.format( A13108BarPieLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,299);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieLote_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieLote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieST_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieST_Internalname, httpContext.getMessage( "%ST", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 304,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieST_Internalname, GXutil.rtrim( A13109BarPieST), GXutil.rtrim( localUtil.format( A13109BarPieST, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,304);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieST_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieST_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieTurn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieTurn_Internalname, httpContext.getMessage( "Turno", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 309,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieTurn_Internalname, GXutil.ltrim( localUtil.ntoc( A13518BarPieTurn, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieTurn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13518BarPieTurn), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A13518BarPieTurn), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,309);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieTurn_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieTurn_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieMq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieMq_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 314,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieMq_Internalname, GXutil.rtrim( A13519BarPieMq), GXutil.rtrim( localUtil.format( A13519BarPieMq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,314);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieMq_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieMq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARPIE.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 319,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARPIE.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 323,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARPIE.htm");
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
         Z200BarPieCod = httpContext.cgiGet( "Z200BarPieCod") ;
         Z203BarPieKil = localUtil.ctond( httpContext.cgiGet( "Z203BarPieKil")) ;
         Z205BarPieMet = localUtil.ctond( httpContext.cgiGet( "Z205BarPieMet")) ;
         Z201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z201BarPieEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z170BarKilLan = localUtil.ctond( httpContext.cgiGet( "Z170BarKilLan")) ;
         Z183BarMetLan = localUtil.ctond( httpContext.cgiGet( "Z183BarMetLan")) ;
         Z197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( "Z197BarPConTro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z908PieOriCod = httpContext.cgiGet( "Z908PieOriCod") ;
         Z1271BarPieLzd = (int)(localUtil.ctol( httpContext.cgiGet( "Z1271BarPieLzd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( "Z1501BarPiePie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2186BarPieLoc = httpContext.cgiGet( "Z2186BarPieLoc") ;
         Z1691BarPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z1691BarPieAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3275BarKgsAut = localUtil.ctond( httpContext.cgiGet( "Z3275BarKgsAut")) ;
         Z3276BarMtsAut = localUtil.ctond( httpContext.cgiGet( "Z3276BarMtsAut")) ;
         Z3277BarPieAut = (short)(localUtil.ctol( httpContext.cgiGet( "Z3277BarPieAut"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6116BarPieImp = httpContext.cgiGet( "Z6116BarPieImp") ;
         Z6489BarPieIdPz = httpContext.cgiGet( "Z6489BarPieIdPz") ;
         Z8707BapieObs = httpContext.cgiGet( "Z8707BapieObs") ;
         Z8838CodBarPz = httpContext.cgiGet( "Z8838CodBarPz") ;
         Z8907PzaB80 = httpContext.cgiGet( "Z8907PzaB80") ;
         Z9795BarPieK1 = localUtil.ctond( httpContext.cgiGet( "Z9795BarPieK1")) ;
         Z9796BarPieK2 = localUtil.ctond( httpContext.cgiGet( "Z9796BarPieK2")) ;
         Z9798BarPz1 = (int)(localUtil.ctol( httpContext.cgiGet( "Z9798BarPz1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9799BarPz2 = (int)(localUtil.ctol( httpContext.cgiGet( "Z9799BarPz2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9800BarNPes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z9800BarNPes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9846BarPieAncc = (short)(localUtil.ctol( httpContext.cgiGet( "Z9846BarPieAncc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9984BarPiePda = localUtil.ctond( httpContext.cgiGet( "Z9984BarPiePda")) ;
         Z1919BarPieObs = httpContext.cgiGet( "Z1919BarPieObs") ;
         Z6472BarTara = localUtil.ctond( httpContext.cgiGet( "Z6472BarTara")) ;
         Z6473BarUniB = localUtil.ctond( httpContext.cgiGet( "Z6473BarUniB")) ;
         Z12113BarPieCLd = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12113BarPieCLd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12779BarPieFdv = localUtil.ctod( httpContext.cgiGet( "Z12779BarPieFdv"), 0) ;
         Z12780BarPieUsu = httpContext.cgiGet( "Z12780BarPieUsu") ;
         Z12911BarPieFep = localUtil.ctod( httpContext.cgiGet( "Z12911BarPieFep"), 0) ;
         Z12920BarPieColD = httpContext.cgiGet( "Z12920BarPieColD") ;
         Z12921BarPieColN = (int)(localUtil.ctol( httpContext.cgiGet( "Z12921BarPieColN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12926BarPieCoCI = httpContext.cgiGet( "Z12926BarPieCoCI") ;
         Z12927BarPieCoCN = (int)(localUtil.ctol( httpContext.cgiGet( "Z12927BarPieCoCN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12922BarPieArtI = httpContext.cgiGet( "Z12922BarPieArtI") ;
         Z12923BarPieArtD = httpContext.cgiGet( "Z12923BarPieArtD") ;
         Z12924BarPieCliI = (int)(localUtil.ctol( httpContext.cgiGet( "Z12924BarPieCliI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12925BarPieCliN = httpContext.cgiGet( "Z12925BarPieCliN") ;
         Z12928BarPieEncC = httpContext.cgiGet( "Z12928BarPieEncC") ;
         Z12935BarPieTono = httpContext.cgiGet( "Z12935BarPieTono") ;
         Z12936BarPieSecu = httpContext.cgiGet( "Z12936BarPieSecu") ;
         Z12992BarPieOpe = (int)(localUtil.ctol( httpContext.cgiGet( "Z12992BarPieOpe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13004BarPieDest = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13004BarPieDest"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13107BarPieEmp = (short)(localUtil.ctol( httpContext.cgiGet( "Z13107BarPieEmp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13108BarPieLote = httpContext.cgiGet( "Z13108BarPieLote") ;
         Z13109BarPieST = httpContext.cgiGet( "Z13109BarPieST") ;
         Z13518BarPieTurn = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13518BarPieTurn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13519BarPieMq = httpContext.cgiGet( "Z13519BarPieMq") ;
         Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A44AlbRecCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
         else
         {
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEKIL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieKil_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A203BarPieKil = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         }
         else
         {
            A203BarPieKil = localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEMET");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieMet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A205BarPieMet = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
         }
         else
         {
            A205BarPieMet = localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEEST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieEst_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A201BarPieEst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A201BarPieEst", GXutil.str( A201BarPieEst, 1, 0));
         }
         else
         {
            A201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A201BarPieEst", GXutil.str( A201BarPieEst, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarKilLan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarKilLan_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARKILLAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarKilLan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A170BarKilLan = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
         }
         else
         {
            A170BarKilLan = localUtil.ctond( httpContext.cgiGet( edtBarKilLan_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarMetLan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarMetLan_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARMETLAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarMetLan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A183BarMetLan = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
         }
         else
         {
            A183BarMetLan = localUtil.ctond( httpContext.cgiGet( edtBarMetLan_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPConTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPConTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPCONTRO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPConTro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A197BarPConTro = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         }
         else
         {
            A197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPConTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         }
         A908PieOriCod = httpContext.cgiGet( edtPieOriCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A908PieOriCod", A908PieOriCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieLzd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieLzd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIELZD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieLzd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1271BarPieLzd = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1271BarPieLzd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1271BarPieLzd), 6, 0));
         }
         else
         {
            A1271BarPieLzd = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieLzd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1271BarPieLzd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1271BarPieLzd), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEPIE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPiePie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1501BarPiePie = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
         }
         else
         {
            A1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
         }
         A2186BarPieLoc = httpContext.cgiGet( edtBarPieLoc_Internalname) ;
         n2186BarPieLoc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1691BarPieAnc = (short)(0) ;
            n1691BarPieAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1691BarPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1691BarPieAnc), 4, 0));
         }
         else
         {
            A1691BarPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1691BarPieAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1691BarPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1691BarPieAnc), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarKgsAut_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarKgsAut_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARKGSAUT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarKgsAut_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3275BarKgsAut = DecimalUtil.ZERO ;
            n3275BarKgsAut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3275BarKgsAut", GXutil.ltrimstr( A3275BarKgsAut, 9, 2));
         }
         else
         {
            A3275BarKgsAut = localUtil.ctond( httpContext.cgiGet( edtBarKgsAut_Internalname)) ;
            n3275BarKgsAut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3275BarKgsAut", GXutil.ltrimstr( A3275BarKgsAut, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarMtsAut_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarMtsAut_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARMTSAUT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarMtsAut_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3276BarMtsAut = DecimalUtil.ZERO ;
            n3276BarMtsAut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3276BarMtsAut", GXutil.ltrimstr( A3276BarMtsAut, 9, 2));
         }
         else
         {
            A3276BarMtsAut = localUtil.ctond( httpContext.cgiGet( edtBarMtsAut_Internalname)) ;
            n3276BarMtsAut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3276BarMtsAut", GXutil.ltrimstr( A3276BarMtsAut, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieAut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieAut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEAUT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieAut_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3277BarPieAut = (short)(0) ;
            n3277BarPieAut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3277BarPieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3277BarPieAut), 4, 0));
         }
         else
         {
            A3277BarPieAut = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPieAut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3277BarPieAut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3277BarPieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3277BarPieAut), 4, 0));
         }
         A6116BarPieImp = httpContext.cgiGet( edtBarPieImp_Internalname) ;
         n6116BarPieImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6116BarPieImp", A6116BarPieImp);
         A6489BarPieIdPz = httpContext.cgiGet( edtBarPieIdPz_Internalname) ;
         n6489BarPieIdPz = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6489BarPieIdPz", A6489BarPieIdPz);
         A8707BapieObs = httpContext.cgiGet( edtBapieObs_Internalname) ;
         n8707BapieObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8707BapieObs", A8707BapieObs);
         A8838CodBarPz = httpContext.cgiGet( edtCodBarPz_Internalname) ;
         n8838CodBarPz = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8838CodBarPz", A8838CodBarPz);
         A8907PzaB80 = httpContext.cgiGet( edtPzaB80_Internalname) ;
         n8907PzaB80 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8907PzaB80", A8907PzaB80);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieK1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieK1_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEK1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieK1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9795BarPieK1 = DecimalUtil.ZERO ;
            n9795BarPieK1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9795BarPieK1", GXutil.ltrimstr( A9795BarPieK1, 9, 2));
         }
         else
         {
            A9795BarPieK1 = localUtil.ctond( httpContext.cgiGet( edtBarPieK1_Internalname)) ;
            n9795BarPieK1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9795BarPieK1", GXutil.ltrimstr( A9795BarPieK1, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieK2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieK2_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEK2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieK2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9796BarPieK2 = DecimalUtil.ZERO ;
            n9796BarPieK2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9796BarPieK2", GXutil.ltrimstr( A9796BarPieK2, 9, 2));
         }
         else
         {
            A9796BarPieK2 = localUtil.ctond( httpContext.cgiGet( edtBarPieK2_Internalname)) ;
            n9796BarPieK2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9796BarPieK2", GXutil.ltrimstr( A9796BarPieK2, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPz1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPz1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPZ1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPz1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9798BarPz1 = 0 ;
            n9798BarPz1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9798BarPz1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9798BarPz1), 6, 0));
         }
         else
         {
            A9798BarPz1 = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPz1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9798BarPz1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9798BarPz1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9798BarPz1), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPz2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPz2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPZ2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPz2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9799BarPz2 = 0 ;
            n9799BarPz2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9799BarPz2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9799BarPz2), 6, 0));
         }
         else
         {
            A9799BarPz2 = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPz2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9799BarPz2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9799BarPz2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9799BarPz2), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARNPES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarNPes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9800BarNPes = (byte)(0) ;
            n9800BarNPes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9800BarNPes", GXutil.str( A9800BarNPes, 1, 0));
         }
         else
         {
            A9800BarNPes = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarNPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9800BarNPes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9800BarNPes", GXutil.str( A9800BarNPes, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieAncc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieAncc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEANCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieAncc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9846BarPieAncc = (short)(0) ;
            n9846BarPieAncc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9846BarPieAncc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9846BarPieAncc), 4, 0));
         }
         else
         {
            A9846BarPieAncc = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPieAncc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9846BarPieAncc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9846BarPieAncc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9846BarPieAncc), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPiePda_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPiePda_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEPDA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPiePda_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9984BarPiePda = DecimalUtil.ZERO ;
            n9984BarPiePda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9984BarPiePda", GXutil.ltrimstr( A9984BarPiePda, 6, 2));
         }
         else
         {
            A9984BarPiePda = localUtil.ctond( httpContext.cgiGet( edtBarPiePda_Internalname)) ;
            n9984BarPiePda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9984BarPiePda", GXutil.ltrimstr( A9984BarPiePda, 6, 2));
         }
         A1919BarPieObs = httpContext.cgiGet( edtBarPieObs_Internalname) ;
         n1919BarPieObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1919BarPieObs", A1919BarPieObs);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTara_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTara_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTARA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarTara_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6472BarTara = DecimalUtil.ZERO ;
            n6472BarTara = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6472BarTara", GXutil.ltrimstr( A6472BarTara, 6, 2));
         }
         else
         {
            A6472BarTara = localUtil.ctond( httpContext.cgiGet( edtBarTara_Internalname)) ;
            n6472BarTara = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6472BarTara", GXutil.ltrimstr( A6472BarTara, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarUniB_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarUniB_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARUNIB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarUniB_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6473BarUniB = DecimalUtil.ZERO ;
            n6473BarUniB = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6473BarUniB", GXutil.ltrimstr( A6473BarUniB, 9, 2));
         }
         else
         {
            A6473BarUniB = localUtil.ctond( httpContext.cgiGet( edtBarUniB_Internalname)) ;
            n6473BarUniB = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6473BarUniB", GXutil.ltrimstr( A6473BarUniB, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieCLd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieCLd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIECLD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieCLd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12113BarPieCLd = (byte)(0) ;
            n12113BarPieCLd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12113BarPieCLd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12113BarPieCLd), 2, 0));
         }
         else
         {
            A12113BarPieCLd = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPieCLd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12113BarPieCLd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12113BarPieCLd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12113BarPieCLd), 2, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtBarPieFdv_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BARPIEFDV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieFdv_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12779BarPieFdv = GXutil.nullDate() ;
            n12779BarPieFdv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12779BarPieFdv", localUtil.format(A12779BarPieFdv, "99/99/99"));
         }
         else
         {
            A12779BarPieFdv = localUtil.ctod( httpContext.cgiGet( edtBarPieFdv_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n12779BarPieFdv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12779BarPieFdv", localUtil.format(A12779BarPieFdv, "99/99/99"));
         }
         A12780BarPieUsu = httpContext.cgiGet( edtBarPieUsu_Internalname) ;
         n12780BarPieUsu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12780BarPieUsu", A12780BarPieUsu);
         if ( localUtil.vcdate( httpContext.cgiGet( edtBarPieFep_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BARPIEFEP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieFep_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12911BarPieFep = GXutil.nullDate() ;
            n12911BarPieFep = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12911BarPieFep", localUtil.format(A12911BarPieFep, "99/99/99"));
         }
         else
         {
            A12911BarPieFep = localUtil.ctod( httpContext.cgiGet( edtBarPieFep_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n12911BarPieFep = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12911BarPieFep", localUtil.format(A12911BarPieFep, "99/99/99"));
         }
         A12920BarPieColD = httpContext.cgiGet( edtBarPieColD_Internalname) ;
         n12920BarPieColD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12920BarPieColD", A12920BarPieColD);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieColN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieColN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIECOLN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieColN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12921BarPieColN = 0 ;
            n12921BarPieColN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12921BarPieColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12921BarPieColN), 6, 0));
         }
         else
         {
            A12921BarPieColN = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieColN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12921BarPieColN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12921BarPieColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12921BarPieColN), 6, 0));
         }
         A12926BarPieCoCI = httpContext.cgiGet( edtBarPieCoCI_Internalname) ;
         n12926BarPieCoCI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12926BarPieCoCI", A12926BarPieCoCI);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieCoCN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieCoCN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIECOCN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieCoCN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12927BarPieCoCN = 0 ;
            n12927BarPieCoCN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12927BarPieCoCN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12927BarPieCoCN), 6, 0));
         }
         else
         {
            A12927BarPieCoCN = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieCoCN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12927BarPieCoCN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12927BarPieCoCN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12927BarPieCoCN), 6, 0));
         }
         A12922BarPieArtI = httpContext.cgiGet( edtBarPieArtI_Internalname) ;
         n12922BarPieArtI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12922BarPieArtI", A12922BarPieArtI);
         A12923BarPieArtD = httpContext.cgiGet( edtBarPieArtD_Internalname) ;
         n12923BarPieArtD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12923BarPieArtD", A12923BarPieArtD);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieCliI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieCliI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIECLII");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieCliI_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12924BarPieCliI = 0 ;
            n12924BarPieCliI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12924BarPieCliI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12924BarPieCliI), 6, 0));
         }
         else
         {
            A12924BarPieCliI = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieCliI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12924BarPieCliI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12924BarPieCliI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12924BarPieCliI), 6, 0));
         }
         A12925BarPieCliN = httpContext.cgiGet( edtBarPieCliN_Internalname) ;
         n12925BarPieCliN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12925BarPieCliN", A12925BarPieCliN);
         A12928BarPieEncC = httpContext.cgiGet( edtBarPieEncC_Internalname) ;
         n12928BarPieEncC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12928BarPieEncC", A12928BarPieEncC);
         A12935BarPieTono = httpContext.cgiGet( edtBarPieTono_Internalname) ;
         n12935BarPieTono = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12935BarPieTono", A12935BarPieTono);
         A12936BarPieSecu = httpContext.cgiGet( edtBarPieSecu_Internalname) ;
         n12936BarPieSecu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12936BarPieSecu", A12936BarPieSecu);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieOpe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieOpe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEOPE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieOpe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12992BarPieOpe = 0 ;
            n12992BarPieOpe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12992BarPieOpe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12992BarPieOpe), 6, 0));
         }
         else
         {
            A12992BarPieOpe = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieOpe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12992BarPieOpe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12992BarPieOpe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12992BarPieOpe), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieDest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieDest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEDEST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieDest_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13004BarPieDest = (byte)(0) ;
            n13004BarPieDest = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13004BarPieDest", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13004BarPieDest), 2, 0));
         }
         else
         {
            A13004BarPieDest = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPieDest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13004BarPieDest = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13004BarPieDest", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13004BarPieDest), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieEmp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieEmp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEEMP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieEmp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13107BarPieEmp = (short)(0) ;
            n13107BarPieEmp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13107BarPieEmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13107BarPieEmp), 4, 0));
         }
         else
         {
            A13107BarPieEmp = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPieEmp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13107BarPieEmp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13107BarPieEmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13107BarPieEmp), 4, 0));
         }
         A13108BarPieLote = httpContext.cgiGet( edtBarPieLote_Internalname) ;
         n13108BarPieLote = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13108BarPieLote", A13108BarPieLote);
         A13109BarPieST = httpContext.cgiGet( edtBarPieST_Internalname) ;
         n13109BarPieST = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13109BarPieST", A13109BarPieST);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieTurn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieTurn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIETURN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieTurn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13518BarPieTurn = (byte)(0) ;
            n13518BarPieTurn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13518BarPieTurn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13518BarPieTurn), 2, 0));
         }
         else
         {
            A13518BarPieTurn = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPieTurn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13518BarPieTurn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13518BarPieTurn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13518BarPieTurn), 2, 0));
         }
         A13519BarPieMq = httpContext.cgiGet( edtBarPieMq_Internalname) ;
         n13519BarPieMq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13519BarPieMq", A13519BarPieMq);
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
            A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
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
            initAll1PO18( ) ;
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
      disableAttributes1PO18( ) ;
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

   public void resetCaption1PO0( )
   {
   }

   public void zm1PO18( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z203BarPieKil = T01PO3_A203BarPieKil[0] ;
            Z205BarPieMet = T01PO3_A205BarPieMet[0] ;
            Z201BarPieEst = T01PO3_A201BarPieEst[0] ;
            Z170BarKilLan = T01PO3_A170BarKilLan[0] ;
            Z183BarMetLan = T01PO3_A183BarMetLan[0] ;
            Z197BarPConTro = T01PO3_A197BarPConTro[0] ;
            Z908PieOriCod = T01PO3_A908PieOriCod[0] ;
            Z1271BarPieLzd = T01PO3_A1271BarPieLzd[0] ;
            Z1501BarPiePie = T01PO3_A1501BarPiePie[0] ;
            Z2186BarPieLoc = T01PO3_A2186BarPieLoc[0] ;
            Z1691BarPieAnc = T01PO3_A1691BarPieAnc[0] ;
            Z3275BarKgsAut = T01PO3_A3275BarKgsAut[0] ;
            Z3276BarMtsAut = T01PO3_A3276BarMtsAut[0] ;
            Z3277BarPieAut = T01PO3_A3277BarPieAut[0] ;
            Z6116BarPieImp = T01PO3_A6116BarPieImp[0] ;
            Z6489BarPieIdPz = T01PO3_A6489BarPieIdPz[0] ;
            Z8707BapieObs = T01PO3_A8707BapieObs[0] ;
            Z8838CodBarPz = T01PO3_A8838CodBarPz[0] ;
            Z8907PzaB80 = T01PO3_A8907PzaB80[0] ;
            Z9795BarPieK1 = T01PO3_A9795BarPieK1[0] ;
            Z9796BarPieK2 = T01PO3_A9796BarPieK2[0] ;
            Z9798BarPz1 = T01PO3_A9798BarPz1[0] ;
            Z9799BarPz2 = T01PO3_A9799BarPz2[0] ;
            Z9800BarNPes = T01PO3_A9800BarNPes[0] ;
            Z9846BarPieAncc = T01PO3_A9846BarPieAncc[0] ;
            Z9984BarPiePda = T01PO3_A9984BarPiePda[0] ;
            Z1919BarPieObs = T01PO3_A1919BarPieObs[0] ;
            Z6472BarTara = T01PO3_A6472BarTara[0] ;
            Z6473BarUniB = T01PO3_A6473BarUniB[0] ;
            Z12113BarPieCLd = T01PO3_A12113BarPieCLd[0] ;
            Z12779BarPieFdv = T01PO3_A12779BarPieFdv[0] ;
            Z12780BarPieUsu = T01PO3_A12780BarPieUsu[0] ;
            Z12911BarPieFep = T01PO3_A12911BarPieFep[0] ;
            Z12920BarPieColD = T01PO3_A12920BarPieColD[0] ;
            Z12921BarPieColN = T01PO3_A12921BarPieColN[0] ;
            Z12926BarPieCoCI = T01PO3_A12926BarPieCoCI[0] ;
            Z12927BarPieCoCN = T01PO3_A12927BarPieCoCN[0] ;
            Z12922BarPieArtI = T01PO3_A12922BarPieArtI[0] ;
            Z12923BarPieArtD = T01PO3_A12923BarPieArtD[0] ;
            Z12924BarPieCliI = T01PO3_A12924BarPieCliI[0] ;
            Z12925BarPieCliN = T01PO3_A12925BarPieCliN[0] ;
            Z12928BarPieEncC = T01PO3_A12928BarPieEncC[0] ;
            Z12935BarPieTono = T01PO3_A12935BarPieTono[0] ;
            Z12936BarPieSecu = T01PO3_A12936BarPieSecu[0] ;
            Z12992BarPieOpe = T01PO3_A12992BarPieOpe[0] ;
            Z13004BarPieDest = T01PO3_A13004BarPieDest[0] ;
            Z13107BarPieEmp = T01PO3_A13107BarPieEmp[0] ;
            Z13108BarPieLote = T01PO3_A13108BarPieLote[0] ;
            Z13109BarPieST = T01PO3_A13109BarPieST[0] ;
            Z13518BarPieTurn = T01PO3_A13518BarPieTurn[0] ;
            Z13519BarPieMq = T01PO3_A13519BarPieMq[0] ;
            Z44AlbRecCod = T01PO3_A44AlbRecCod[0] ;
         }
         else
         {
            Z203BarPieKil = A203BarPieKil ;
            Z205BarPieMet = A205BarPieMet ;
            Z201BarPieEst = A201BarPieEst ;
            Z170BarKilLan = A170BarKilLan ;
            Z183BarMetLan = A183BarMetLan ;
            Z197BarPConTro = A197BarPConTro ;
            Z908PieOriCod = A908PieOriCod ;
            Z1271BarPieLzd = A1271BarPieLzd ;
            Z1501BarPiePie = A1501BarPiePie ;
            Z2186BarPieLoc = A2186BarPieLoc ;
            Z1691BarPieAnc = A1691BarPieAnc ;
            Z3275BarKgsAut = A3275BarKgsAut ;
            Z3276BarMtsAut = A3276BarMtsAut ;
            Z3277BarPieAut = A3277BarPieAut ;
            Z6116BarPieImp = A6116BarPieImp ;
            Z6489BarPieIdPz = A6489BarPieIdPz ;
            Z8707BapieObs = A8707BapieObs ;
            Z8838CodBarPz = A8838CodBarPz ;
            Z8907PzaB80 = A8907PzaB80 ;
            Z9795BarPieK1 = A9795BarPieK1 ;
            Z9796BarPieK2 = A9796BarPieK2 ;
            Z9798BarPz1 = A9798BarPz1 ;
            Z9799BarPz2 = A9799BarPz2 ;
            Z9800BarNPes = A9800BarNPes ;
            Z9846BarPieAncc = A9846BarPieAncc ;
            Z9984BarPiePda = A9984BarPiePda ;
            Z1919BarPieObs = A1919BarPieObs ;
            Z6472BarTara = A6472BarTara ;
            Z6473BarUniB = A6473BarUniB ;
            Z12113BarPieCLd = A12113BarPieCLd ;
            Z12779BarPieFdv = A12779BarPieFdv ;
            Z12780BarPieUsu = A12780BarPieUsu ;
            Z12911BarPieFep = A12911BarPieFep ;
            Z12920BarPieColD = A12920BarPieColD ;
            Z12921BarPieColN = A12921BarPieColN ;
            Z12926BarPieCoCI = A12926BarPieCoCI ;
            Z12927BarPieCoCN = A12927BarPieCoCN ;
            Z12922BarPieArtI = A12922BarPieArtI ;
            Z12923BarPieArtD = A12923BarPieArtD ;
            Z12924BarPieCliI = A12924BarPieCliI ;
            Z12925BarPieCliN = A12925BarPieCliN ;
            Z12928BarPieEncC = A12928BarPieEncC ;
            Z12935BarPieTono = A12935BarPieTono ;
            Z12936BarPieSecu = A12936BarPieSecu ;
            Z12992BarPieOpe = A12992BarPieOpe ;
            Z13004BarPieDest = A13004BarPieDest ;
            Z13107BarPieEmp = A13107BarPieEmp ;
            Z13108BarPieLote = A13108BarPieLote ;
            Z13109BarPieST = A13109BarPieST ;
            Z13518BarPieTurn = A13518BarPieTurn ;
            Z13519BarPieMq = A13519BarPieMq ;
            Z44AlbRecCod = A44AlbRecCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z200BarPieCod = A200BarPieCod ;
         Z203BarPieKil = A203BarPieKil ;
         Z205BarPieMet = A205BarPieMet ;
         Z201BarPieEst = A201BarPieEst ;
         Z170BarKilLan = A170BarKilLan ;
         Z183BarMetLan = A183BarMetLan ;
         Z197BarPConTro = A197BarPConTro ;
         Z908PieOriCod = A908PieOriCod ;
         Z1271BarPieLzd = A1271BarPieLzd ;
         Z1501BarPiePie = A1501BarPiePie ;
         Z2186BarPieLoc = A2186BarPieLoc ;
         Z1691BarPieAnc = A1691BarPieAnc ;
         Z3275BarKgsAut = A3275BarKgsAut ;
         Z3276BarMtsAut = A3276BarMtsAut ;
         Z3277BarPieAut = A3277BarPieAut ;
         Z6116BarPieImp = A6116BarPieImp ;
         Z6489BarPieIdPz = A6489BarPieIdPz ;
         Z8707BapieObs = A8707BapieObs ;
         Z8838CodBarPz = A8838CodBarPz ;
         Z8907PzaB80 = A8907PzaB80 ;
         Z9795BarPieK1 = A9795BarPieK1 ;
         Z9796BarPieK2 = A9796BarPieK2 ;
         Z9798BarPz1 = A9798BarPz1 ;
         Z9799BarPz2 = A9799BarPz2 ;
         Z9800BarNPes = A9800BarNPes ;
         Z9846BarPieAncc = A9846BarPieAncc ;
         Z9984BarPiePda = A9984BarPiePda ;
         Z1919BarPieObs = A1919BarPieObs ;
         Z6472BarTara = A6472BarTara ;
         Z6473BarUniB = A6473BarUniB ;
         Z12113BarPieCLd = A12113BarPieCLd ;
         Z12779BarPieFdv = A12779BarPieFdv ;
         Z12780BarPieUsu = A12780BarPieUsu ;
         Z12911BarPieFep = A12911BarPieFep ;
         Z12920BarPieColD = A12920BarPieColD ;
         Z12921BarPieColN = A12921BarPieColN ;
         Z12926BarPieCoCI = A12926BarPieCoCI ;
         Z12927BarPieCoCN = A12927BarPieCoCN ;
         Z12922BarPieArtI = A12922BarPieArtI ;
         Z12923BarPieArtD = A12923BarPieArtD ;
         Z12924BarPieCliI = A12924BarPieCliI ;
         Z12925BarPieCliN = A12925BarPieCliN ;
         Z12928BarPieEncC = A12928BarPieEncC ;
         Z12935BarPieTono = A12935BarPieTono ;
         Z12936BarPieSecu = A12936BarPieSecu ;
         Z12992BarPieOpe = A12992BarPieOpe ;
         Z13004BarPieDest = A13004BarPieDest ;
         Z13107BarPieEmp = A13107BarPieEmp ;
         Z13108BarPieLote = A13108BarPieLote ;
         Z13109BarPieST = A13109BarPieST ;
         Z13518BarPieTurn = A13518BarPieTurn ;
         Z13519BarPieMq = A13519BarPieMq ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
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

   public void load1PO18( )
   {
      /* Using cursor T01PO6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A203BarPieKil = T01PO6_A203BarPieKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         A205BarPieMet = T01PO6_A205BarPieMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
         A201BarPieEst = T01PO6_A201BarPieEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A201BarPieEst", GXutil.str( A201BarPieEst, 1, 0));
         A170BarKilLan = T01PO6_A170BarKilLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
         A183BarMetLan = T01PO6_A183BarMetLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
         A197BarPConTro = T01PO6_A197BarPConTro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         A908PieOriCod = T01PO6_A908PieOriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A908PieOriCod", A908PieOriCod);
         A1271BarPieLzd = T01PO6_A1271BarPieLzd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1271BarPieLzd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1271BarPieLzd), 6, 0));
         A1501BarPiePie = T01PO6_A1501BarPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
         A2186BarPieLoc = T01PO6_A2186BarPieLoc[0] ;
         n2186BarPieLoc = T01PO6_n2186BarPieLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
         A1691BarPieAnc = T01PO6_A1691BarPieAnc[0] ;
         n1691BarPieAnc = T01PO6_n1691BarPieAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1691BarPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1691BarPieAnc), 4, 0));
         A3275BarKgsAut = T01PO6_A3275BarKgsAut[0] ;
         n3275BarKgsAut = T01PO6_n3275BarKgsAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3275BarKgsAut", GXutil.ltrimstr( A3275BarKgsAut, 9, 2));
         A3276BarMtsAut = T01PO6_A3276BarMtsAut[0] ;
         n3276BarMtsAut = T01PO6_n3276BarMtsAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3276BarMtsAut", GXutil.ltrimstr( A3276BarMtsAut, 9, 2));
         A3277BarPieAut = T01PO6_A3277BarPieAut[0] ;
         n3277BarPieAut = T01PO6_n3277BarPieAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3277BarPieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3277BarPieAut), 4, 0));
         A6116BarPieImp = T01PO6_A6116BarPieImp[0] ;
         n6116BarPieImp = T01PO6_n6116BarPieImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6116BarPieImp", A6116BarPieImp);
         A6489BarPieIdPz = T01PO6_A6489BarPieIdPz[0] ;
         n6489BarPieIdPz = T01PO6_n6489BarPieIdPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6489BarPieIdPz", A6489BarPieIdPz);
         A8707BapieObs = T01PO6_A8707BapieObs[0] ;
         n8707BapieObs = T01PO6_n8707BapieObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8707BapieObs", A8707BapieObs);
         A8838CodBarPz = T01PO6_A8838CodBarPz[0] ;
         n8838CodBarPz = T01PO6_n8838CodBarPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8838CodBarPz", A8838CodBarPz);
         A8907PzaB80 = T01PO6_A8907PzaB80[0] ;
         n8907PzaB80 = T01PO6_n8907PzaB80[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8907PzaB80", A8907PzaB80);
         A9795BarPieK1 = T01PO6_A9795BarPieK1[0] ;
         n9795BarPieK1 = T01PO6_n9795BarPieK1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9795BarPieK1", GXutil.ltrimstr( A9795BarPieK1, 9, 2));
         A9796BarPieK2 = T01PO6_A9796BarPieK2[0] ;
         n9796BarPieK2 = T01PO6_n9796BarPieK2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9796BarPieK2", GXutil.ltrimstr( A9796BarPieK2, 9, 2));
         A9798BarPz1 = T01PO6_A9798BarPz1[0] ;
         n9798BarPz1 = T01PO6_n9798BarPz1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9798BarPz1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9798BarPz1), 6, 0));
         A9799BarPz2 = T01PO6_A9799BarPz2[0] ;
         n9799BarPz2 = T01PO6_n9799BarPz2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9799BarPz2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9799BarPz2), 6, 0));
         A9800BarNPes = T01PO6_A9800BarNPes[0] ;
         n9800BarNPes = T01PO6_n9800BarNPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9800BarNPes", GXutil.str( A9800BarNPes, 1, 0));
         A9846BarPieAncc = T01PO6_A9846BarPieAncc[0] ;
         n9846BarPieAncc = T01PO6_n9846BarPieAncc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9846BarPieAncc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9846BarPieAncc), 4, 0));
         A9984BarPiePda = T01PO6_A9984BarPiePda[0] ;
         n9984BarPiePda = T01PO6_n9984BarPiePda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9984BarPiePda", GXutil.ltrimstr( A9984BarPiePda, 6, 2));
         A1919BarPieObs = T01PO6_A1919BarPieObs[0] ;
         n1919BarPieObs = T01PO6_n1919BarPieObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1919BarPieObs", A1919BarPieObs);
         A6472BarTara = T01PO6_A6472BarTara[0] ;
         n6472BarTara = T01PO6_n6472BarTara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6472BarTara", GXutil.ltrimstr( A6472BarTara, 6, 2));
         A6473BarUniB = T01PO6_A6473BarUniB[0] ;
         n6473BarUniB = T01PO6_n6473BarUniB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6473BarUniB", GXutil.ltrimstr( A6473BarUniB, 9, 2));
         A12113BarPieCLd = T01PO6_A12113BarPieCLd[0] ;
         n12113BarPieCLd = T01PO6_n12113BarPieCLd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12113BarPieCLd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12113BarPieCLd), 2, 0));
         A12779BarPieFdv = T01PO6_A12779BarPieFdv[0] ;
         n12779BarPieFdv = T01PO6_n12779BarPieFdv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12779BarPieFdv", localUtil.format(A12779BarPieFdv, "99/99/99"));
         A12780BarPieUsu = T01PO6_A12780BarPieUsu[0] ;
         n12780BarPieUsu = T01PO6_n12780BarPieUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12780BarPieUsu", A12780BarPieUsu);
         A12911BarPieFep = T01PO6_A12911BarPieFep[0] ;
         n12911BarPieFep = T01PO6_n12911BarPieFep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12911BarPieFep", localUtil.format(A12911BarPieFep, "99/99/99"));
         A12920BarPieColD = T01PO6_A12920BarPieColD[0] ;
         n12920BarPieColD = T01PO6_n12920BarPieColD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12920BarPieColD", A12920BarPieColD);
         A12921BarPieColN = T01PO6_A12921BarPieColN[0] ;
         n12921BarPieColN = T01PO6_n12921BarPieColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12921BarPieColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12921BarPieColN), 6, 0));
         A12926BarPieCoCI = T01PO6_A12926BarPieCoCI[0] ;
         n12926BarPieCoCI = T01PO6_n12926BarPieCoCI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12926BarPieCoCI", A12926BarPieCoCI);
         A12927BarPieCoCN = T01PO6_A12927BarPieCoCN[0] ;
         n12927BarPieCoCN = T01PO6_n12927BarPieCoCN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12927BarPieCoCN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12927BarPieCoCN), 6, 0));
         A12922BarPieArtI = T01PO6_A12922BarPieArtI[0] ;
         n12922BarPieArtI = T01PO6_n12922BarPieArtI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12922BarPieArtI", A12922BarPieArtI);
         A12923BarPieArtD = T01PO6_A12923BarPieArtD[0] ;
         n12923BarPieArtD = T01PO6_n12923BarPieArtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12923BarPieArtD", A12923BarPieArtD);
         A12924BarPieCliI = T01PO6_A12924BarPieCliI[0] ;
         n12924BarPieCliI = T01PO6_n12924BarPieCliI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12924BarPieCliI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12924BarPieCliI), 6, 0));
         A12925BarPieCliN = T01PO6_A12925BarPieCliN[0] ;
         n12925BarPieCliN = T01PO6_n12925BarPieCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12925BarPieCliN", A12925BarPieCliN);
         A12928BarPieEncC = T01PO6_A12928BarPieEncC[0] ;
         n12928BarPieEncC = T01PO6_n12928BarPieEncC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12928BarPieEncC", A12928BarPieEncC);
         A12935BarPieTono = T01PO6_A12935BarPieTono[0] ;
         n12935BarPieTono = T01PO6_n12935BarPieTono[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12935BarPieTono", A12935BarPieTono);
         A12936BarPieSecu = T01PO6_A12936BarPieSecu[0] ;
         n12936BarPieSecu = T01PO6_n12936BarPieSecu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12936BarPieSecu", A12936BarPieSecu);
         A12992BarPieOpe = T01PO6_A12992BarPieOpe[0] ;
         n12992BarPieOpe = T01PO6_n12992BarPieOpe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12992BarPieOpe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12992BarPieOpe), 6, 0));
         A13004BarPieDest = T01PO6_A13004BarPieDest[0] ;
         n13004BarPieDest = T01PO6_n13004BarPieDest[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13004BarPieDest", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13004BarPieDest), 2, 0));
         A13107BarPieEmp = T01PO6_A13107BarPieEmp[0] ;
         n13107BarPieEmp = T01PO6_n13107BarPieEmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13107BarPieEmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13107BarPieEmp), 4, 0));
         A13108BarPieLote = T01PO6_A13108BarPieLote[0] ;
         n13108BarPieLote = T01PO6_n13108BarPieLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13108BarPieLote", A13108BarPieLote);
         A13109BarPieST = T01PO6_A13109BarPieST[0] ;
         n13109BarPieST = T01PO6_n13109BarPieST[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13109BarPieST", A13109BarPieST);
         A13518BarPieTurn = T01PO6_A13518BarPieTurn[0] ;
         n13518BarPieTurn = T01PO6_n13518BarPieTurn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13518BarPieTurn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13518BarPieTurn), 2, 0));
         A13519BarPieMq = T01PO6_A13519BarPieMq[0] ;
         n13519BarPieMq = T01PO6_n13519BarPieMq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13519BarPieMq", A13519BarPieMq);
         A44AlbRecCod = T01PO6_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         zm1PO18( -1) ;
      }
      pr_default.close(4);
      onLoadActions1PO18( ) ;
   }

   public void onLoadActions1PO18( )
   {
   }

   public void checkExtendedTable1PO18( )
   {
      nIsDirty_18 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01PO4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01PO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1PO18( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         int A44AlbRecCod )
   {
      /* Using cursor T01PO7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
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

   public void gxload_3( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01PO8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
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

   public void getKey1PO18( )
   {
      /* Using cursor T01PO9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound18 = (short)(1) ;
      }
      else
      {
         RcdFound18 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01PO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1PO18( 1) ;
         RcdFound18 = (short)(1) ;
         A200BarPieCod = T01PO3_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         A203BarPieKil = T01PO3_A203BarPieKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         A205BarPieMet = T01PO3_A205BarPieMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
         A201BarPieEst = T01PO3_A201BarPieEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A201BarPieEst", GXutil.str( A201BarPieEst, 1, 0));
         A170BarKilLan = T01PO3_A170BarKilLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
         A183BarMetLan = T01PO3_A183BarMetLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
         A197BarPConTro = T01PO3_A197BarPConTro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         A908PieOriCod = T01PO3_A908PieOriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A908PieOriCod", A908PieOriCod);
         A1271BarPieLzd = T01PO3_A1271BarPieLzd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1271BarPieLzd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1271BarPieLzd), 6, 0));
         A1501BarPiePie = T01PO3_A1501BarPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
         A2186BarPieLoc = T01PO3_A2186BarPieLoc[0] ;
         n2186BarPieLoc = T01PO3_n2186BarPieLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
         A1691BarPieAnc = T01PO3_A1691BarPieAnc[0] ;
         n1691BarPieAnc = T01PO3_n1691BarPieAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1691BarPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1691BarPieAnc), 4, 0));
         A3275BarKgsAut = T01PO3_A3275BarKgsAut[0] ;
         n3275BarKgsAut = T01PO3_n3275BarKgsAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3275BarKgsAut", GXutil.ltrimstr( A3275BarKgsAut, 9, 2));
         A3276BarMtsAut = T01PO3_A3276BarMtsAut[0] ;
         n3276BarMtsAut = T01PO3_n3276BarMtsAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3276BarMtsAut", GXutil.ltrimstr( A3276BarMtsAut, 9, 2));
         A3277BarPieAut = T01PO3_A3277BarPieAut[0] ;
         n3277BarPieAut = T01PO3_n3277BarPieAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3277BarPieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3277BarPieAut), 4, 0));
         A6116BarPieImp = T01PO3_A6116BarPieImp[0] ;
         n6116BarPieImp = T01PO3_n6116BarPieImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6116BarPieImp", A6116BarPieImp);
         A6489BarPieIdPz = T01PO3_A6489BarPieIdPz[0] ;
         n6489BarPieIdPz = T01PO3_n6489BarPieIdPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6489BarPieIdPz", A6489BarPieIdPz);
         A8707BapieObs = T01PO3_A8707BapieObs[0] ;
         n8707BapieObs = T01PO3_n8707BapieObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8707BapieObs", A8707BapieObs);
         A8838CodBarPz = T01PO3_A8838CodBarPz[0] ;
         n8838CodBarPz = T01PO3_n8838CodBarPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8838CodBarPz", A8838CodBarPz);
         A8907PzaB80 = T01PO3_A8907PzaB80[0] ;
         n8907PzaB80 = T01PO3_n8907PzaB80[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8907PzaB80", A8907PzaB80);
         A9795BarPieK1 = T01PO3_A9795BarPieK1[0] ;
         n9795BarPieK1 = T01PO3_n9795BarPieK1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9795BarPieK1", GXutil.ltrimstr( A9795BarPieK1, 9, 2));
         A9796BarPieK2 = T01PO3_A9796BarPieK2[0] ;
         n9796BarPieK2 = T01PO3_n9796BarPieK2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9796BarPieK2", GXutil.ltrimstr( A9796BarPieK2, 9, 2));
         A9798BarPz1 = T01PO3_A9798BarPz1[0] ;
         n9798BarPz1 = T01PO3_n9798BarPz1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9798BarPz1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9798BarPz1), 6, 0));
         A9799BarPz2 = T01PO3_A9799BarPz2[0] ;
         n9799BarPz2 = T01PO3_n9799BarPz2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9799BarPz2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9799BarPz2), 6, 0));
         A9800BarNPes = T01PO3_A9800BarNPes[0] ;
         n9800BarNPes = T01PO3_n9800BarNPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9800BarNPes", GXutil.str( A9800BarNPes, 1, 0));
         A9846BarPieAncc = T01PO3_A9846BarPieAncc[0] ;
         n9846BarPieAncc = T01PO3_n9846BarPieAncc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9846BarPieAncc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9846BarPieAncc), 4, 0));
         A9984BarPiePda = T01PO3_A9984BarPiePda[0] ;
         n9984BarPiePda = T01PO3_n9984BarPiePda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9984BarPiePda", GXutil.ltrimstr( A9984BarPiePda, 6, 2));
         A1919BarPieObs = T01PO3_A1919BarPieObs[0] ;
         n1919BarPieObs = T01PO3_n1919BarPieObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1919BarPieObs", A1919BarPieObs);
         A6472BarTara = T01PO3_A6472BarTara[0] ;
         n6472BarTara = T01PO3_n6472BarTara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6472BarTara", GXutil.ltrimstr( A6472BarTara, 6, 2));
         A6473BarUniB = T01PO3_A6473BarUniB[0] ;
         n6473BarUniB = T01PO3_n6473BarUniB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6473BarUniB", GXutil.ltrimstr( A6473BarUniB, 9, 2));
         A12113BarPieCLd = T01PO3_A12113BarPieCLd[0] ;
         n12113BarPieCLd = T01PO3_n12113BarPieCLd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12113BarPieCLd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12113BarPieCLd), 2, 0));
         A12779BarPieFdv = T01PO3_A12779BarPieFdv[0] ;
         n12779BarPieFdv = T01PO3_n12779BarPieFdv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12779BarPieFdv", localUtil.format(A12779BarPieFdv, "99/99/99"));
         A12780BarPieUsu = T01PO3_A12780BarPieUsu[0] ;
         n12780BarPieUsu = T01PO3_n12780BarPieUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12780BarPieUsu", A12780BarPieUsu);
         A12911BarPieFep = T01PO3_A12911BarPieFep[0] ;
         n12911BarPieFep = T01PO3_n12911BarPieFep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12911BarPieFep", localUtil.format(A12911BarPieFep, "99/99/99"));
         A12920BarPieColD = T01PO3_A12920BarPieColD[0] ;
         n12920BarPieColD = T01PO3_n12920BarPieColD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12920BarPieColD", A12920BarPieColD);
         A12921BarPieColN = T01PO3_A12921BarPieColN[0] ;
         n12921BarPieColN = T01PO3_n12921BarPieColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12921BarPieColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12921BarPieColN), 6, 0));
         A12926BarPieCoCI = T01PO3_A12926BarPieCoCI[0] ;
         n12926BarPieCoCI = T01PO3_n12926BarPieCoCI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12926BarPieCoCI", A12926BarPieCoCI);
         A12927BarPieCoCN = T01PO3_A12927BarPieCoCN[0] ;
         n12927BarPieCoCN = T01PO3_n12927BarPieCoCN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12927BarPieCoCN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12927BarPieCoCN), 6, 0));
         A12922BarPieArtI = T01PO3_A12922BarPieArtI[0] ;
         n12922BarPieArtI = T01PO3_n12922BarPieArtI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12922BarPieArtI", A12922BarPieArtI);
         A12923BarPieArtD = T01PO3_A12923BarPieArtD[0] ;
         n12923BarPieArtD = T01PO3_n12923BarPieArtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12923BarPieArtD", A12923BarPieArtD);
         A12924BarPieCliI = T01PO3_A12924BarPieCliI[0] ;
         n12924BarPieCliI = T01PO3_n12924BarPieCliI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12924BarPieCliI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12924BarPieCliI), 6, 0));
         A12925BarPieCliN = T01PO3_A12925BarPieCliN[0] ;
         n12925BarPieCliN = T01PO3_n12925BarPieCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12925BarPieCliN", A12925BarPieCliN);
         A12928BarPieEncC = T01PO3_A12928BarPieEncC[0] ;
         n12928BarPieEncC = T01PO3_n12928BarPieEncC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12928BarPieEncC", A12928BarPieEncC);
         A12935BarPieTono = T01PO3_A12935BarPieTono[0] ;
         n12935BarPieTono = T01PO3_n12935BarPieTono[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12935BarPieTono", A12935BarPieTono);
         A12936BarPieSecu = T01PO3_A12936BarPieSecu[0] ;
         n12936BarPieSecu = T01PO3_n12936BarPieSecu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12936BarPieSecu", A12936BarPieSecu);
         A12992BarPieOpe = T01PO3_A12992BarPieOpe[0] ;
         n12992BarPieOpe = T01PO3_n12992BarPieOpe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12992BarPieOpe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12992BarPieOpe), 6, 0));
         A13004BarPieDest = T01PO3_A13004BarPieDest[0] ;
         n13004BarPieDest = T01PO3_n13004BarPieDest[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13004BarPieDest", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13004BarPieDest), 2, 0));
         A13107BarPieEmp = T01PO3_A13107BarPieEmp[0] ;
         n13107BarPieEmp = T01PO3_n13107BarPieEmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13107BarPieEmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13107BarPieEmp), 4, 0));
         A13108BarPieLote = T01PO3_A13108BarPieLote[0] ;
         n13108BarPieLote = T01PO3_n13108BarPieLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13108BarPieLote", A13108BarPieLote);
         A13109BarPieST = T01PO3_A13109BarPieST[0] ;
         n13109BarPieST = T01PO3_n13109BarPieST[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13109BarPieST", A13109BarPieST);
         A13518BarPieTurn = T01PO3_A13518BarPieTurn[0] ;
         n13518BarPieTurn = T01PO3_n13518BarPieTurn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13518BarPieTurn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13518BarPieTurn), 2, 0));
         A13519BarPieMq = T01PO3_A13519BarPieMq[0] ;
         n13519BarPieMq = T01PO3_n13519BarPieMq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13519BarPieMq", A13519BarPieMq);
         A396EmprCod = T01PO3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = T01PO3_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A129BarCod = T01PO3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01PO3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01PO3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1PO18( ) ;
         if ( AnyError == 1 )
         {
            RcdFound18 = (short)(0) ;
            initializeNonKey1PO18( ) ;
         }
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound18 = (short)(0) ;
         initializeNonKey1PO18( ) ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1PO18( ) ;
      if ( RcdFound18 == 0 )
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
      RcdFound18 = (short)(0) ;
      /* Using cursor T01PO10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A200BarPieCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01PO10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01PO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PO10_A129BarCod[0] < A129BarCod ) || ( T01PO10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PO10_A132BarCodReo[0] < A132BarCodReo ) || ( T01PO10_A132BarCodReo[0] == A132BarCodReo ) && ( T01PO10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PO10_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01PO10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01PO10_A132BarCodReo[0] == A132BarCodReo ) && ( T01PO10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PO10_A200BarPieCod[0], A200BarPieCod) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01PO10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01PO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PO10_A129BarCod[0] > A129BarCod ) || ( T01PO10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PO10_A132BarCodReo[0] > A132BarCodReo ) || ( T01PO10_A132BarCodReo[0] == A132BarCodReo ) && ( T01PO10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PO10_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01PO10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01PO10_A132BarCodReo[0] == A132BarCodReo ) && ( T01PO10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PO10_A200BarPieCod[0], A200BarPieCod) > 0 ) ) )
         {
            A396EmprCod = T01PO10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01PO10_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01PO10_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01PO10_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = T01PO10_A200BarPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound18 = (short)(0) ;
      /* Using cursor T01PO11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A200BarPieCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01PO11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01PO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PO11_A129BarCod[0] > A129BarCod ) || ( T01PO11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PO11_A132BarCodReo[0] > A132BarCodReo ) || ( T01PO11_A132BarCodReo[0] == A132BarCodReo ) && ( T01PO11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PO11_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01PO11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01PO11_A132BarCodReo[0] == A132BarCodReo ) && ( T01PO11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PO11_A200BarPieCod[0], A200BarPieCod) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01PO11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01PO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PO11_A129BarCod[0] < A129BarCod ) || ( T01PO11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PO11_A132BarCodReo[0] < A132BarCodReo ) || ( T01PO11_A132BarCodReo[0] == A132BarCodReo ) && ( T01PO11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PO11_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01PO11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01PO11_A132BarCodReo[0] == A132BarCodReo ) && ( T01PO11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PO11_A200BarPieCod[0], A200BarPieCod) < 0 ) ) )
         {
            A396EmprCod = T01PO11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01PO11_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01PO11_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01PO11_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = T01PO11_A200BarPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PO18( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1PO18( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound18 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A200BarPieCod = Z200BarPieCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
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
               update1PO18( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1PO18( ) ;
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
                  insert1PO18( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A200BarPieCod = Z200BarPieCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
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
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAlbRecCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1PO18( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRecCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1PO18( ) ;
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
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRecCod_Internalname ;
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
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRecCod_Internalname ;
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
      scanStart1PO18( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound18 != 0 )
         {
            scanNext1PO18( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRecCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1PO18( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1PO18( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z203BarPieKil, T01PO2_A203BarPieKil[0]) != 0 ) || ( DecimalUtil.compareTo(Z205BarPieMet, T01PO2_A205BarPieMet[0]) != 0 ) || ( Z201BarPieEst != T01PO2_A201BarPieEst[0] ) || ( DecimalUtil.compareTo(Z170BarKilLan, T01PO2_A170BarKilLan[0]) != 0 ) || ( DecimalUtil.compareTo(Z183BarMetLan, T01PO2_A183BarMetLan[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z197BarPConTro != T01PO2_A197BarPConTro[0] ) || ( GXutil.strcmp(Z908PieOriCod, T01PO2_A908PieOriCod[0]) != 0 ) || ( Z1271BarPieLzd != T01PO2_A1271BarPieLzd[0] ) || ( Z1501BarPiePie != T01PO2_A1501BarPiePie[0] ) || ( GXutil.strcmp(Z2186BarPieLoc, T01PO2_A2186BarPieLoc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1691BarPieAnc != T01PO2_A1691BarPieAnc[0] ) || ( DecimalUtil.compareTo(Z3275BarKgsAut, T01PO2_A3275BarKgsAut[0]) != 0 ) || ( DecimalUtil.compareTo(Z3276BarMtsAut, T01PO2_A3276BarMtsAut[0]) != 0 ) || ( Z3277BarPieAut != T01PO2_A3277BarPieAut[0] ) || ( GXutil.strcmp(Z6116BarPieImp, T01PO2_A6116BarPieImp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6489BarPieIdPz, T01PO2_A6489BarPieIdPz[0]) != 0 ) || ( GXutil.strcmp(Z8707BapieObs, T01PO2_A8707BapieObs[0]) != 0 ) || ( GXutil.strcmp(Z8838CodBarPz, T01PO2_A8838CodBarPz[0]) != 0 ) || ( GXutil.strcmp(Z8907PzaB80, T01PO2_A8907PzaB80[0]) != 0 ) || ( DecimalUtil.compareTo(Z9795BarPieK1, T01PO2_A9795BarPieK1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z9796BarPieK2, T01PO2_A9796BarPieK2[0]) != 0 ) || ( Z9798BarPz1 != T01PO2_A9798BarPz1[0] ) || ( Z9799BarPz2 != T01PO2_A9799BarPz2[0] ) || ( Z9800BarNPes != T01PO2_A9800BarNPes[0] ) || ( Z9846BarPieAncc != T01PO2_A9846BarPieAncc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z9984BarPiePda, T01PO2_A9984BarPiePda[0]) != 0 ) || ( GXutil.strcmp(Z1919BarPieObs, T01PO2_A1919BarPieObs[0]) != 0 ) || ( DecimalUtil.compareTo(Z6472BarTara, T01PO2_A6472BarTara[0]) != 0 ) || ( DecimalUtil.compareTo(Z6473BarUniB, T01PO2_A6473BarUniB[0]) != 0 ) || ( Z12113BarPieCLd != T01PO2_A12113BarPieCLd[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z12779BarPieFdv), GXutil.resetTime(T01PO2_A12779BarPieFdv[0])) ) || ( GXutil.strcmp(Z12780BarPieUsu, T01PO2_A12780BarPieUsu[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z12911BarPieFep), GXutil.resetTime(T01PO2_A12911BarPieFep[0])) ) || ( GXutil.strcmp(Z12920BarPieColD, T01PO2_A12920BarPieColD[0]) != 0 ) || ( Z12921BarPieColN != T01PO2_A12921BarPieColN[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12926BarPieCoCI, T01PO2_A12926BarPieCoCI[0]) != 0 ) || ( Z12927BarPieCoCN != T01PO2_A12927BarPieCoCN[0] ) || ( GXutil.strcmp(Z12922BarPieArtI, T01PO2_A12922BarPieArtI[0]) != 0 ) || ( GXutil.strcmp(Z12923BarPieArtD, T01PO2_A12923BarPieArtD[0]) != 0 ) || ( Z12924BarPieCliI != T01PO2_A12924BarPieCliI[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12925BarPieCliN, T01PO2_A12925BarPieCliN[0]) != 0 ) || ( GXutil.strcmp(Z12928BarPieEncC, T01PO2_A12928BarPieEncC[0]) != 0 ) || ( GXutil.strcmp(Z12935BarPieTono, T01PO2_A12935BarPieTono[0]) != 0 ) || ( GXutil.strcmp(Z12936BarPieSecu, T01PO2_A12936BarPieSecu[0]) != 0 ) || ( Z12992BarPieOpe != T01PO2_A12992BarPieOpe[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13004BarPieDest != T01PO2_A13004BarPieDest[0] ) || ( Z13107BarPieEmp != T01PO2_A13107BarPieEmp[0] ) || ( GXutil.strcmp(Z13108BarPieLote, T01PO2_A13108BarPieLote[0]) != 0 ) || ( GXutil.strcmp(Z13109BarPieST, T01PO2_A13109BarPieST[0]) != 0 ) || ( Z13518BarPieTurn != T01PO2_A13518BarPieTurn[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13519BarPieMq, T01PO2_A13519BarPieMq[0]) != 0 ) || ( Z44AlbRecCod != T01PO2_A44AlbRecCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z203BarPieKil, T01PO2_A203BarPieKil[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieKil");
               GXutil.writeLogRaw("Old: ",Z203BarPieKil);
               GXutil.writeLogRaw("Current: ",T01PO2_A203BarPieKil[0]);
            }
            if ( DecimalUtil.compareTo(Z205BarPieMet, T01PO2_A205BarPieMet[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieMet");
               GXutil.writeLogRaw("Old: ",Z205BarPieMet);
               GXutil.writeLogRaw("Current: ",T01PO2_A205BarPieMet[0]);
            }
            if ( Z201BarPieEst != T01PO2_A201BarPieEst[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieEst");
               GXutil.writeLogRaw("Old: ",Z201BarPieEst);
               GXutil.writeLogRaw("Current: ",T01PO2_A201BarPieEst[0]);
            }
            if ( DecimalUtil.compareTo(Z170BarKilLan, T01PO2_A170BarKilLan[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarKilLan");
               GXutil.writeLogRaw("Old: ",Z170BarKilLan);
               GXutil.writeLogRaw("Current: ",T01PO2_A170BarKilLan[0]);
            }
            if ( DecimalUtil.compareTo(Z183BarMetLan, T01PO2_A183BarMetLan[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarMetLan");
               GXutil.writeLogRaw("Old: ",Z183BarMetLan);
               GXutil.writeLogRaw("Current: ",T01PO2_A183BarMetLan[0]);
            }
            if ( Z197BarPConTro != T01PO2_A197BarPConTro[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPConTro");
               GXutil.writeLogRaw("Old: ",Z197BarPConTro);
               GXutil.writeLogRaw("Current: ",T01PO2_A197BarPConTro[0]);
            }
            if ( GXutil.strcmp(Z908PieOriCod, T01PO2_A908PieOriCod[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"PieOriCod");
               GXutil.writeLogRaw("Old: ",Z908PieOriCod);
               GXutil.writeLogRaw("Current: ",T01PO2_A908PieOriCod[0]);
            }
            if ( Z1271BarPieLzd != T01PO2_A1271BarPieLzd[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieLzd");
               GXutil.writeLogRaw("Old: ",Z1271BarPieLzd);
               GXutil.writeLogRaw("Current: ",T01PO2_A1271BarPieLzd[0]);
            }
            if ( Z1501BarPiePie != T01PO2_A1501BarPiePie[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPiePie");
               GXutil.writeLogRaw("Old: ",Z1501BarPiePie);
               GXutil.writeLogRaw("Current: ",T01PO2_A1501BarPiePie[0]);
            }
            if ( GXutil.strcmp(Z2186BarPieLoc, T01PO2_A2186BarPieLoc[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieLoc");
               GXutil.writeLogRaw("Old: ",Z2186BarPieLoc);
               GXutil.writeLogRaw("Current: ",T01PO2_A2186BarPieLoc[0]);
            }
            if ( Z1691BarPieAnc != T01PO2_A1691BarPieAnc[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieAnc");
               GXutil.writeLogRaw("Old: ",Z1691BarPieAnc);
               GXutil.writeLogRaw("Current: ",T01PO2_A1691BarPieAnc[0]);
            }
            if ( DecimalUtil.compareTo(Z3275BarKgsAut, T01PO2_A3275BarKgsAut[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarKgsAut");
               GXutil.writeLogRaw("Old: ",Z3275BarKgsAut);
               GXutil.writeLogRaw("Current: ",T01PO2_A3275BarKgsAut[0]);
            }
            if ( DecimalUtil.compareTo(Z3276BarMtsAut, T01PO2_A3276BarMtsAut[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarMtsAut");
               GXutil.writeLogRaw("Old: ",Z3276BarMtsAut);
               GXutil.writeLogRaw("Current: ",T01PO2_A3276BarMtsAut[0]);
            }
            if ( Z3277BarPieAut != T01PO2_A3277BarPieAut[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieAut");
               GXutil.writeLogRaw("Old: ",Z3277BarPieAut);
               GXutil.writeLogRaw("Current: ",T01PO2_A3277BarPieAut[0]);
            }
            if ( GXutil.strcmp(Z6116BarPieImp, T01PO2_A6116BarPieImp[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieImp");
               GXutil.writeLogRaw("Old: ",Z6116BarPieImp);
               GXutil.writeLogRaw("Current: ",T01PO2_A6116BarPieImp[0]);
            }
            if ( GXutil.strcmp(Z6489BarPieIdPz, T01PO2_A6489BarPieIdPz[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieIdPz");
               GXutil.writeLogRaw("Old: ",Z6489BarPieIdPz);
               GXutil.writeLogRaw("Current: ",T01PO2_A6489BarPieIdPz[0]);
            }
            if ( GXutil.strcmp(Z8707BapieObs, T01PO2_A8707BapieObs[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BapieObs");
               GXutil.writeLogRaw("Old: ",Z8707BapieObs);
               GXutil.writeLogRaw("Current: ",T01PO2_A8707BapieObs[0]);
            }
            if ( GXutil.strcmp(Z8838CodBarPz, T01PO2_A8838CodBarPz[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"CodBarPz");
               GXutil.writeLogRaw("Old: ",Z8838CodBarPz);
               GXutil.writeLogRaw("Current: ",T01PO2_A8838CodBarPz[0]);
            }
            if ( GXutil.strcmp(Z8907PzaB80, T01PO2_A8907PzaB80[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"PzaB80");
               GXutil.writeLogRaw("Old: ",Z8907PzaB80);
               GXutil.writeLogRaw("Current: ",T01PO2_A8907PzaB80[0]);
            }
            if ( DecimalUtil.compareTo(Z9795BarPieK1, T01PO2_A9795BarPieK1[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieK1");
               GXutil.writeLogRaw("Old: ",Z9795BarPieK1);
               GXutil.writeLogRaw("Current: ",T01PO2_A9795BarPieK1[0]);
            }
            if ( DecimalUtil.compareTo(Z9796BarPieK2, T01PO2_A9796BarPieK2[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieK2");
               GXutil.writeLogRaw("Old: ",Z9796BarPieK2);
               GXutil.writeLogRaw("Current: ",T01PO2_A9796BarPieK2[0]);
            }
            if ( Z9798BarPz1 != T01PO2_A9798BarPz1[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPz1");
               GXutil.writeLogRaw("Old: ",Z9798BarPz1);
               GXutil.writeLogRaw("Current: ",T01PO2_A9798BarPz1[0]);
            }
            if ( Z9799BarPz2 != T01PO2_A9799BarPz2[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPz2");
               GXutil.writeLogRaw("Old: ",Z9799BarPz2);
               GXutil.writeLogRaw("Current: ",T01PO2_A9799BarPz2[0]);
            }
            if ( Z9800BarNPes != T01PO2_A9800BarNPes[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarNPes");
               GXutil.writeLogRaw("Old: ",Z9800BarNPes);
               GXutil.writeLogRaw("Current: ",T01PO2_A9800BarNPes[0]);
            }
            if ( Z9846BarPieAncc != T01PO2_A9846BarPieAncc[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieAncc");
               GXutil.writeLogRaw("Old: ",Z9846BarPieAncc);
               GXutil.writeLogRaw("Current: ",T01PO2_A9846BarPieAncc[0]);
            }
            if ( DecimalUtil.compareTo(Z9984BarPiePda, T01PO2_A9984BarPiePda[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPiePda");
               GXutil.writeLogRaw("Old: ",Z9984BarPiePda);
               GXutil.writeLogRaw("Current: ",T01PO2_A9984BarPiePda[0]);
            }
            if ( GXutil.strcmp(Z1919BarPieObs, T01PO2_A1919BarPieObs[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieObs");
               GXutil.writeLogRaw("Old: ",Z1919BarPieObs);
               GXutil.writeLogRaw("Current: ",T01PO2_A1919BarPieObs[0]);
            }
            if ( DecimalUtil.compareTo(Z6472BarTara, T01PO2_A6472BarTara[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarTara");
               GXutil.writeLogRaw("Old: ",Z6472BarTara);
               GXutil.writeLogRaw("Current: ",T01PO2_A6472BarTara[0]);
            }
            if ( DecimalUtil.compareTo(Z6473BarUniB, T01PO2_A6473BarUniB[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarUniB");
               GXutil.writeLogRaw("Old: ",Z6473BarUniB);
               GXutil.writeLogRaw("Current: ",T01PO2_A6473BarUniB[0]);
            }
            if ( Z12113BarPieCLd != T01PO2_A12113BarPieCLd[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieCLd");
               GXutil.writeLogRaw("Old: ",Z12113BarPieCLd);
               GXutil.writeLogRaw("Current: ",T01PO2_A12113BarPieCLd[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12779BarPieFdv), GXutil.resetTime(T01PO2_A12779BarPieFdv[0])) ) )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieFdv");
               GXutil.writeLogRaw("Old: ",Z12779BarPieFdv);
               GXutil.writeLogRaw("Current: ",T01PO2_A12779BarPieFdv[0]);
            }
            if ( GXutil.strcmp(Z12780BarPieUsu, T01PO2_A12780BarPieUsu[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieUsu");
               GXutil.writeLogRaw("Old: ",Z12780BarPieUsu);
               GXutil.writeLogRaw("Current: ",T01PO2_A12780BarPieUsu[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12911BarPieFep), GXutil.resetTime(T01PO2_A12911BarPieFep[0])) ) )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieFep");
               GXutil.writeLogRaw("Old: ",Z12911BarPieFep);
               GXutil.writeLogRaw("Current: ",T01PO2_A12911BarPieFep[0]);
            }
            if ( GXutil.strcmp(Z12920BarPieColD, T01PO2_A12920BarPieColD[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieColD");
               GXutil.writeLogRaw("Old: ",Z12920BarPieColD);
               GXutil.writeLogRaw("Current: ",T01PO2_A12920BarPieColD[0]);
            }
            if ( Z12921BarPieColN != T01PO2_A12921BarPieColN[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieColN");
               GXutil.writeLogRaw("Old: ",Z12921BarPieColN);
               GXutil.writeLogRaw("Current: ",T01PO2_A12921BarPieColN[0]);
            }
            if ( GXutil.strcmp(Z12926BarPieCoCI, T01PO2_A12926BarPieCoCI[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieCoCI");
               GXutil.writeLogRaw("Old: ",Z12926BarPieCoCI);
               GXutil.writeLogRaw("Current: ",T01PO2_A12926BarPieCoCI[0]);
            }
            if ( Z12927BarPieCoCN != T01PO2_A12927BarPieCoCN[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieCoCN");
               GXutil.writeLogRaw("Old: ",Z12927BarPieCoCN);
               GXutil.writeLogRaw("Current: ",T01PO2_A12927BarPieCoCN[0]);
            }
            if ( GXutil.strcmp(Z12922BarPieArtI, T01PO2_A12922BarPieArtI[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieArtI");
               GXutil.writeLogRaw("Old: ",Z12922BarPieArtI);
               GXutil.writeLogRaw("Current: ",T01PO2_A12922BarPieArtI[0]);
            }
            if ( GXutil.strcmp(Z12923BarPieArtD, T01PO2_A12923BarPieArtD[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieArtD");
               GXutil.writeLogRaw("Old: ",Z12923BarPieArtD);
               GXutil.writeLogRaw("Current: ",T01PO2_A12923BarPieArtD[0]);
            }
            if ( Z12924BarPieCliI != T01PO2_A12924BarPieCliI[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieCliI");
               GXutil.writeLogRaw("Old: ",Z12924BarPieCliI);
               GXutil.writeLogRaw("Current: ",T01PO2_A12924BarPieCliI[0]);
            }
            if ( GXutil.strcmp(Z12925BarPieCliN, T01PO2_A12925BarPieCliN[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieCliN");
               GXutil.writeLogRaw("Old: ",Z12925BarPieCliN);
               GXutil.writeLogRaw("Current: ",T01PO2_A12925BarPieCliN[0]);
            }
            if ( GXutil.strcmp(Z12928BarPieEncC, T01PO2_A12928BarPieEncC[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieEncC");
               GXutil.writeLogRaw("Old: ",Z12928BarPieEncC);
               GXutil.writeLogRaw("Current: ",T01PO2_A12928BarPieEncC[0]);
            }
            if ( GXutil.strcmp(Z12935BarPieTono, T01PO2_A12935BarPieTono[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieTono");
               GXutil.writeLogRaw("Old: ",Z12935BarPieTono);
               GXutil.writeLogRaw("Current: ",T01PO2_A12935BarPieTono[0]);
            }
            if ( GXutil.strcmp(Z12936BarPieSecu, T01PO2_A12936BarPieSecu[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieSecu");
               GXutil.writeLogRaw("Old: ",Z12936BarPieSecu);
               GXutil.writeLogRaw("Current: ",T01PO2_A12936BarPieSecu[0]);
            }
            if ( Z12992BarPieOpe != T01PO2_A12992BarPieOpe[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieOpe");
               GXutil.writeLogRaw("Old: ",Z12992BarPieOpe);
               GXutil.writeLogRaw("Current: ",T01PO2_A12992BarPieOpe[0]);
            }
            if ( Z13004BarPieDest != T01PO2_A13004BarPieDest[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieDest");
               GXutil.writeLogRaw("Old: ",Z13004BarPieDest);
               GXutil.writeLogRaw("Current: ",T01PO2_A13004BarPieDest[0]);
            }
            if ( Z13107BarPieEmp != T01PO2_A13107BarPieEmp[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieEmp");
               GXutil.writeLogRaw("Old: ",Z13107BarPieEmp);
               GXutil.writeLogRaw("Current: ",T01PO2_A13107BarPieEmp[0]);
            }
            if ( GXutil.strcmp(Z13108BarPieLote, T01PO2_A13108BarPieLote[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieLote");
               GXutil.writeLogRaw("Old: ",Z13108BarPieLote);
               GXutil.writeLogRaw("Current: ",T01PO2_A13108BarPieLote[0]);
            }
            if ( GXutil.strcmp(Z13109BarPieST, T01PO2_A13109BarPieST[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieST");
               GXutil.writeLogRaw("Old: ",Z13109BarPieST);
               GXutil.writeLogRaw("Current: ",T01PO2_A13109BarPieST[0]);
            }
            if ( Z13518BarPieTurn != T01PO2_A13518BarPieTurn[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieTurn");
               GXutil.writeLogRaw("Old: ",Z13518BarPieTurn);
               GXutil.writeLogRaw("Current: ",T01PO2_A13518BarPieTurn[0]);
            }
            if ( GXutil.strcmp(Z13519BarPieMq, T01PO2_A13519BarPieMq[0]) != 0 )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"BarPieMq");
               GXutil.writeLogRaw("Old: ",Z13519BarPieMq);
               GXutil.writeLogRaw("Current: ",T01PO2_A13519BarPieMq[0]);
            }
            if ( Z44AlbRecCod != T01PO2_A44AlbRecCod[0] )
            {
               GXutil.writeLogln("barpie:[seudo value changed for attri]"+"AlbRecCod");
               GXutil.writeLogRaw("Old: ",Z44AlbRecCod);
               GXutil.writeLogRaw("Current: ",T01PO2_A44AlbRecCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARPIE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PO18( )
   {
      beforeValidate1PO18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PO18( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PO18( 0) ;
         checkOptimisticConcurrency1PO18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PO18( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PO18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PO12 */
                  pr_default.execute(10, new Object[] {A200BarPieCod, A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), Boolean.valueOf(n6116BarPieImp), A6116BarPieImp, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz, Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n8907PzaB80), A8907PzaB80, Boolean.valueOf(n9795BarPieK1), A9795BarPieK1, Boolean.valueOf(n9796BarPieK2), A9796BarPieK2, Boolean.valueOf(n9798BarPz1), Integer.valueOf(A9798BarPz1), Boolean.valueOf(n9799BarPz2), Integer.valueOf(A9799BarPz2), Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), Boolean.valueOf(n9846BarPieAncc), Short.valueOf(A9846BarPieAncc), Boolean.valueOf(n9984BarPiePda), A9984BarPiePda, Boolean.valueOf(n1919BarPieObs), A1919BarPieObs, Boolean.valueOf(n6472BarTara), A6472BarTara, Boolean.valueOf(n6473BarUniB), A6473BarUniB, Boolean.valueOf(n12113BarPieCLd), Byte.valueOf(A12113BarPieCLd), Boolean.valueOf(n12779BarPieFdv), A12779BarPieFdv, Boolean.valueOf(n12780BarPieUsu), A12780BarPieUsu, Boolean.valueOf(n12911BarPieFep), A12911BarPieFep, Boolean.valueOf(n12920BarPieColD), A12920BarPieColD, Boolean.valueOf(n12921BarPieColN), Integer.valueOf(A12921BarPieColN), Boolean.valueOf(n12926BarPieCoCI), A12926BarPieCoCI, Boolean.valueOf(n12927BarPieCoCN), Integer.valueOf(A12927BarPieCoCN), Boolean.valueOf(n12922BarPieArtI), A12922BarPieArtI, Boolean.valueOf(n12923BarPieArtD), A12923BarPieArtD, Boolean.valueOf(n12924BarPieCliI), Integer.valueOf(A12924BarPieCliI), Boolean.valueOf(n12925BarPieCliN), A12925BarPieCliN, Boolean.valueOf(n12928BarPieEncC), A12928BarPieEncC, Boolean.valueOf(n12935BarPieTono), A12935BarPieTono, Boolean.valueOf(n12936BarPieSecu), A12936BarPieSecu, Boolean.valueOf(n12992BarPieOpe), Integer.valueOf(A12992BarPieOpe), Boolean.valueOf(n13004BarPieDest), Byte.valueOf(A13004BarPieDest), Boolean.valueOf(n13107BarPieEmp), Short.valueOf(A13107BarPieEmp), Boolean.valueOf(n13108BarPieLote), A13108BarPieLote, Boolean.valueOf(n13109BarPieST), A13109BarPieST, Boolean.valueOf(n13518BarPieTurn), Byte.valueOf(A13518BarPieTurn), Boolean.valueOf(n13519BarPieMq), A13519BarPieMq, A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
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
                        resetCaption1PO0( ) ;
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
            load1PO18( ) ;
         }
         endLevel1PO18( ) ;
      }
      closeExtendedTableCursors1PO18( ) ;
   }

   public void update1PO18( )
   {
      beforeValidate1PO18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PO18( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PO18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PO18( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PO18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PO13 */
                  pr_default.execute(11, new Object[] {A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), Boolean.valueOf(n6116BarPieImp), A6116BarPieImp, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz, Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n8907PzaB80), A8907PzaB80, Boolean.valueOf(n9795BarPieK1), A9795BarPieK1, Boolean.valueOf(n9796BarPieK2), A9796BarPieK2, Boolean.valueOf(n9798BarPz1), Integer.valueOf(A9798BarPz1), Boolean.valueOf(n9799BarPz2), Integer.valueOf(A9799BarPz2), Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), Boolean.valueOf(n9846BarPieAncc), Short.valueOf(A9846BarPieAncc), Boolean.valueOf(n9984BarPiePda), A9984BarPiePda, Boolean.valueOf(n1919BarPieObs), A1919BarPieObs, Boolean.valueOf(n6472BarTara), A6472BarTara, Boolean.valueOf(n6473BarUniB), A6473BarUniB, Boolean.valueOf(n12113BarPieCLd), Byte.valueOf(A12113BarPieCLd), Boolean.valueOf(n12779BarPieFdv), A12779BarPieFdv, Boolean.valueOf(n12780BarPieUsu), A12780BarPieUsu, Boolean.valueOf(n12911BarPieFep), A12911BarPieFep, Boolean.valueOf(n12920BarPieColD), A12920BarPieColD, Boolean.valueOf(n12921BarPieColN), Integer.valueOf(A12921BarPieColN), Boolean.valueOf(n12926BarPieCoCI), A12926BarPieCoCI, Boolean.valueOf(n12927BarPieCoCN), Integer.valueOf(A12927BarPieCoCN), Boolean.valueOf(n12922BarPieArtI), A12922BarPieArtI, Boolean.valueOf(n12923BarPieArtD), A12923BarPieArtD, Boolean.valueOf(n12924BarPieCliI), Integer.valueOf(A12924BarPieCliI), Boolean.valueOf(n12925BarPieCliN), A12925BarPieCliN, Boolean.valueOf(n12928BarPieEncC), A12928BarPieEncC, Boolean.valueOf(n12935BarPieTono), A12935BarPieTono, Boolean.valueOf(n12936BarPieSecu), A12936BarPieSecu, Boolean.valueOf(n12992BarPieOpe), Integer.valueOf(A12992BarPieOpe), Boolean.valueOf(n13004BarPieDest), Byte.valueOf(A13004BarPieDest), Boolean.valueOf(n13107BarPieEmp), Short.valueOf(A13107BarPieEmp), Boolean.valueOf(n13108BarPieLote), A13108BarPieLote, Boolean.valueOf(n13109BarPieST), A13109BarPieST, Boolean.valueOf(n13518BarPieTurn), Byte.valueOf(A13518BarPieTurn), Boolean.valueOf(n13519BarPieMq), A13519BarPieMq, Integer.valueOf(A44AlbRecCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1PO18( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1PO0( ) ;
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
         endLevel1PO18( ) ;
      }
      closeExtendedTableCursors1PO18( ) ;
   }

   public void deferredUpdate1PO18( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1PO18( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PO18( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PO18( ) ;
         afterConfirm1PO18( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PO18( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PO14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound18 == 0 )
                     {
                        initAll1PO18( ) ;
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
                     resetCaption1PO0( ) ;
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
      sMode18 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PO18( ) ;
      Gx_mode = sMode18 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PO18( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01PO15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01PO16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01PO17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void endLevel1PO18( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1PO18( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "barpie");
         if ( AnyError == 0 )
         {
            confirmValues1PO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "barpie");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PO18( )
   {
      /* Using cursor T01PO18 */
      pr_default.execute(16);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A396EmprCod = T01PO18_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01PO18_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01PO18_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01PO18_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A200BarPieCod = T01PO18_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PO18( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A396EmprCod = T01PO18_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01PO18_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01PO18_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01PO18_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A200BarPieCod = T01PO18_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      }
   }

   public void scanEnd1PO18( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1PO18( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PO18( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PO18( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PO18( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PO18( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PO18( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PO18( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtBarPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieKil_Enabled), 5, 0), true);
      edtBarPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Enabled), 5, 0), true);
      edtBarPieEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieEst_Enabled), 5, 0), true);
      edtBarKilLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKilLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKilLan_Enabled), 5, 0), true);
      edtBarMetLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMetLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMetLan_Enabled), 5, 0), true);
      edtBarPConTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), true);
      edtPieOriCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieOriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieOriCod_Enabled), 5, 0), true);
      edtBarPieLzd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieLzd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLzd_Enabled), 5, 0), true);
      edtBarPiePie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPiePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPiePie_Enabled), 5, 0), true);
      edtBarPieLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLoc_Enabled), 5, 0), true);
      edtBarPieAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieAnc_Enabled), 5, 0), true);
      edtBarKgsAut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgsAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgsAut_Enabled), 5, 0), true);
      edtBarMtsAut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMtsAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtsAut_Enabled), 5, 0), true);
      edtBarPieAut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieAut_Enabled), 5, 0), true);
      edtBarPieImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieImp_Enabled), 5, 0), true);
      edtBarPieIdPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieIdPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieIdPz_Enabled), 5, 0), true);
      edtBapieObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBapieObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBapieObs_Enabled), 5, 0), true);
      edtCodBarPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodBarPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodBarPz_Enabled), 5, 0), true);
      edtPzaB80_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPzaB80_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPzaB80_Enabled), 5, 0), true);
      edtBarPieK1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieK1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieK1_Enabled), 5, 0), true);
      edtBarPieK2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieK2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieK2_Enabled), 5, 0), true);
      edtBarPz1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPz1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPz1_Enabled), 5, 0), true);
      edtBarPz2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPz2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPz2_Enabled), 5, 0), true);
      edtBarNPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNPes_Enabled), 5, 0), true);
      edtBarPieAncc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieAncc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieAncc_Enabled), 5, 0), true);
      edtBarPiePda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPiePda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPiePda_Enabled), 5, 0), true);
      edtBarPieObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieObs_Enabled), 5, 0), true);
      edtBarTara_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTara_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTara_Enabled), 5, 0), true);
      edtBarUniB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUniB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUniB_Enabled), 5, 0), true);
      edtBarPieCLd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCLd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCLd_Enabled), 5, 0), true);
      edtBarPieFdv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieFdv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieFdv_Enabled), 5, 0), true);
      edtBarPieUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieUsu_Enabled), 5, 0), true);
      edtBarPieFep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieFep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieFep_Enabled), 5, 0), true);
      edtBarPieColD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieColD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieColD_Enabled), 5, 0), true);
      edtBarPieColN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieColN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieColN_Enabled), 5, 0), true);
      edtBarPieCoCI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCoCI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCoCI_Enabled), 5, 0), true);
      edtBarPieCoCN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCoCN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCoCN_Enabled), 5, 0), true);
      edtBarPieArtI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieArtI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieArtI_Enabled), 5, 0), true);
      edtBarPieArtD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieArtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieArtD_Enabled), 5, 0), true);
      edtBarPieCliI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCliI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCliI_Enabled), 5, 0), true);
      edtBarPieCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCliN_Enabled), 5, 0), true);
      edtBarPieEncC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieEncC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieEncC_Enabled), 5, 0), true);
      edtBarPieTono_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieTono_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieTono_Enabled), 5, 0), true);
      edtBarPieSecu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieSecu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieSecu_Enabled), 5, 0), true);
      edtBarPieOpe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieOpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieOpe_Enabled), 5, 0), true);
      edtBarPieDest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieDest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDest_Enabled), 5, 0), true);
      edtBarPieEmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieEmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieEmp_Enabled), 5, 0), true);
      edtBarPieLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLote_Enabled), 5, 0), true);
      edtBarPieST_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieST_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieST_Enabled), 5, 0), true);
      edtBarPieTurn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieTurn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieTurn_Enabled), 5, 0), true);
      edtBarPieMq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieMq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMq_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1PO18( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1PO0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.barpie", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z203BarPieKil", GXutil.ltrim( localUtil.ntoc( Z203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z205BarPieMet", GXutil.ltrim( localUtil.ntoc( Z205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z201BarPieEst", GXutil.ltrim( localUtil.ntoc( Z201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z170BarKilLan", GXutil.ltrim( localUtil.ntoc( Z170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z183BarMetLan", GXutil.ltrim( localUtil.ntoc( Z183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z197BarPConTro", GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z908PieOriCod", GXutil.rtrim( Z908PieOriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1271BarPieLzd", GXutil.ltrim( localUtil.ntoc( Z1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1501BarPiePie", GXutil.ltrim( localUtil.ntoc( Z1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2186BarPieLoc", GXutil.rtrim( Z2186BarPieLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1691BarPieAnc", GXutil.ltrim( localUtil.ntoc( Z1691BarPieAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3275BarKgsAut", GXutil.ltrim( localUtil.ntoc( Z3275BarKgsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3276BarMtsAut", GXutil.ltrim( localUtil.ntoc( Z3276BarMtsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3277BarPieAut", GXutil.ltrim( localUtil.ntoc( Z3277BarPieAut, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6116BarPieImp", GXutil.rtrim( Z6116BarPieImp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6489BarPieIdPz", GXutil.rtrim( Z6489BarPieIdPz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8707BapieObs", GXutil.rtrim( Z8707BapieObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8838CodBarPz", GXutil.rtrim( Z8838CodBarPz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8907PzaB80", GXutil.rtrim( Z8907PzaB80));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9795BarPieK1", GXutil.ltrim( localUtil.ntoc( Z9795BarPieK1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9796BarPieK2", GXutil.ltrim( localUtil.ntoc( Z9796BarPieK2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9798BarPz1", GXutil.ltrim( localUtil.ntoc( Z9798BarPz1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9799BarPz2", GXutil.ltrim( localUtil.ntoc( Z9799BarPz2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9800BarNPes", GXutil.ltrim( localUtil.ntoc( Z9800BarNPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9846BarPieAncc", GXutil.ltrim( localUtil.ntoc( Z9846BarPieAncc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9984BarPiePda", GXutil.ltrim( localUtil.ntoc( Z9984BarPiePda, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1919BarPieObs", GXutil.rtrim( Z1919BarPieObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6472BarTara", GXutil.ltrim( localUtil.ntoc( Z6472BarTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6473BarUniB", GXutil.ltrim( localUtil.ntoc( Z6473BarUniB, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12113BarPieCLd", GXutil.ltrim( localUtil.ntoc( Z12113BarPieCLd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12779BarPieFdv", localUtil.dtoc( Z12779BarPieFdv, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12780BarPieUsu", GXutil.rtrim( Z12780BarPieUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12911BarPieFep", localUtil.dtoc( Z12911BarPieFep, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12920BarPieColD", GXutil.rtrim( Z12920BarPieColD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12921BarPieColN", GXutil.ltrim( localUtil.ntoc( Z12921BarPieColN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12926BarPieCoCI", GXutil.rtrim( Z12926BarPieCoCI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12927BarPieCoCN", GXutil.ltrim( localUtil.ntoc( Z12927BarPieCoCN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12922BarPieArtI", GXutil.rtrim( Z12922BarPieArtI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12923BarPieArtD", GXutil.rtrim( Z12923BarPieArtD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12924BarPieCliI", GXutil.ltrim( localUtil.ntoc( Z12924BarPieCliI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12925BarPieCliN", GXutil.rtrim( Z12925BarPieCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12928BarPieEncC", GXutil.rtrim( Z12928BarPieEncC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12935BarPieTono", GXutil.rtrim( Z12935BarPieTono));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12936BarPieSecu", GXutil.rtrim( Z12936BarPieSecu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12992BarPieOpe", GXutil.ltrim( localUtil.ntoc( Z12992BarPieOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13004BarPieDest", GXutil.ltrim( localUtil.ntoc( Z13004BarPieDest, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13107BarPieEmp", GXutil.ltrim( localUtil.ntoc( Z13107BarPieEmp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13108BarPieLote", GXutil.rtrim( Z13108BarPieLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13109BarPieST", GXutil.rtrim( Z13109BarPieST));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13518BarPieTurn", GXutil.ltrim( localUtil.ntoc( Z13518BarPieTurn, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13519BarPieMq", GXutil.rtrim( Z13519BarPieMq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.barpie", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "BARPIE" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla BARPIE", "") ;
   }

   public void initializeNonKey1PO18( )
   {
      A44AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A203BarPieKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
      A205BarPieMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
      A201BarPieEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A201BarPieEst", GXutil.str( A201BarPieEst, 1, 0));
      A170BarKilLan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
      A183BarMetLan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
      A197BarPConTro = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      A908PieOriCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A908PieOriCod", A908PieOriCod);
      A1271BarPieLzd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1271BarPieLzd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1271BarPieLzd), 6, 0));
      A1501BarPiePie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
      A2186BarPieLoc = "" ;
      n2186BarPieLoc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
      A1691BarPieAnc = (short)(0) ;
      n1691BarPieAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1691BarPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1691BarPieAnc), 4, 0));
      A3275BarKgsAut = DecimalUtil.ZERO ;
      n3275BarKgsAut = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3275BarKgsAut", GXutil.ltrimstr( A3275BarKgsAut, 9, 2));
      A3276BarMtsAut = DecimalUtil.ZERO ;
      n3276BarMtsAut = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3276BarMtsAut", GXutil.ltrimstr( A3276BarMtsAut, 9, 2));
      A3277BarPieAut = (short)(0) ;
      n3277BarPieAut = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3277BarPieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3277BarPieAut), 4, 0));
      A6116BarPieImp = "" ;
      n6116BarPieImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6116BarPieImp", A6116BarPieImp);
      A6489BarPieIdPz = "" ;
      n6489BarPieIdPz = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6489BarPieIdPz", A6489BarPieIdPz);
      A8707BapieObs = "" ;
      n8707BapieObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8707BapieObs", A8707BapieObs);
      A8838CodBarPz = "" ;
      n8838CodBarPz = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8838CodBarPz", A8838CodBarPz);
      A8907PzaB80 = "" ;
      n8907PzaB80 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8907PzaB80", A8907PzaB80);
      A9795BarPieK1 = DecimalUtil.ZERO ;
      n9795BarPieK1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9795BarPieK1", GXutil.ltrimstr( A9795BarPieK1, 9, 2));
      A9796BarPieK2 = DecimalUtil.ZERO ;
      n9796BarPieK2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9796BarPieK2", GXutil.ltrimstr( A9796BarPieK2, 9, 2));
      A9798BarPz1 = 0 ;
      n9798BarPz1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9798BarPz1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9798BarPz1), 6, 0));
      A9799BarPz2 = 0 ;
      n9799BarPz2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9799BarPz2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9799BarPz2), 6, 0));
      A9800BarNPes = (byte)(0) ;
      n9800BarNPes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9800BarNPes", GXutil.str( A9800BarNPes, 1, 0));
      A9846BarPieAncc = (short)(0) ;
      n9846BarPieAncc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9846BarPieAncc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9846BarPieAncc), 4, 0));
      A9984BarPiePda = DecimalUtil.ZERO ;
      n9984BarPiePda = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9984BarPiePda", GXutil.ltrimstr( A9984BarPiePda, 6, 2));
      A1919BarPieObs = "" ;
      n1919BarPieObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1919BarPieObs", A1919BarPieObs);
      A6472BarTara = DecimalUtil.ZERO ;
      n6472BarTara = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6472BarTara", GXutil.ltrimstr( A6472BarTara, 6, 2));
      A6473BarUniB = DecimalUtil.ZERO ;
      n6473BarUniB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6473BarUniB", GXutil.ltrimstr( A6473BarUniB, 9, 2));
      A12113BarPieCLd = (byte)(0) ;
      n12113BarPieCLd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12113BarPieCLd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12113BarPieCLd), 2, 0));
      A12779BarPieFdv = GXutil.nullDate() ;
      n12779BarPieFdv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12779BarPieFdv", localUtil.format(A12779BarPieFdv, "99/99/99"));
      A12780BarPieUsu = "" ;
      n12780BarPieUsu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12780BarPieUsu", A12780BarPieUsu);
      A12911BarPieFep = GXutil.nullDate() ;
      n12911BarPieFep = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12911BarPieFep", localUtil.format(A12911BarPieFep, "99/99/99"));
      A12920BarPieColD = "" ;
      n12920BarPieColD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12920BarPieColD", A12920BarPieColD);
      A12921BarPieColN = 0 ;
      n12921BarPieColN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12921BarPieColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12921BarPieColN), 6, 0));
      A12926BarPieCoCI = "" ;
      n12926BarPieCoCI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12926BarPieCoCI", A12926BarPieCoCI);
      A12927BarPieCoCN = 0 ;
      n12927BarPieCoCN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12927BarPieCoCN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12927BarPieCoCN), 6, 0));
      A12922BarPieArtI = "" ;
      n12922BarPieArtI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12922BarPieArtI", A12922BarPieArtI);
      A12923BarPieArtD = "" ;
      n12923BarPieArtD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12923BarPieArtD", A12923BarPieArtD);
      A12924BarPieCliI = 0 ;
      n12924BarPieCliI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12924BarPieCliI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12924BarPieCliI), 6, 0));
      A12925BarPieCliN = "" ;
      n12925BarPieCliN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12925BarPieCliN", A12925BarPieCliN);
      A12928BarPieEncC = "" ;
      n12928BarPieEncC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12928BarPieEncC", A12928BarPieEncC);
      A12935BarPieTono = "" ;
      n12935BarPieTono = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12935BarPieTono", A12935BarPieTono);
      A12936BarPieSecu = "" ;
      n12936BarPieSecu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12936BarPieSecu", A12936BarPieSecu);
      A12992BarPieOpe = 0 ;
      n12992BarPieOpe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12992BarPieOpe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12992BarPieOpe), 6, 0));
      A13004BarPieDest = (byte)(0) ;
      n13004BarPieDest = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13004BarPieDest", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13004BarPieDest), 2, 0));
      A13107BarPieEmp = (short)(0) ;
      n13107BarPieEmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13107BarPieEmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13107BarPieEmp), 4, 0));
      A13108BarPieLote = "" ;
      n13108BarPieLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13108BarPieLote", A13108BarPieLote);
      A13109BarPieST = "" ;
      n13109BarPieST = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13109BarPieST", A13109BarPieST);
      A13518BarPieTurn = (byte)(0) ;
      n13518BarPieTurn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13518BarPieTurn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13518BarPieTurn), 2, 0));
      A13519BarPieMq = "" ;
      n13519BarPieMq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13519BarPieMq", A13519BarPieMq);
      Z203BarPieKil = DecimalUtil.ZERO ;
      Z205BarPieMet = DecimalUtil.ZERO ;
      Z201BarPieEst = (byte)(0) ;
      Z170BarKilLan = DecimalUtil.ZERO ;
      Z183BarMetLan = DecimalUtil.ZERO ;
      Z197BarPConTro = (short)(0) ;
      Z908PieOriCod = "" ;
      Z1271BarPieLzd = 0 ;
      Z1501BarPiePie = 0 ;
      Z2186BarPieLoc = "" ;
      Z1691BarPieAnc = (short)(0) ;
      Z3275BarKgsAut = DecimalUtil.ZERO ;
      Z3276BarMtsAut = DecimalUtil.ZERO ;
      Z3277BarPieAut = (short)(0) ;
      Z6116BarPieImp = "" ;
      Z6489BarPieIdPz = "" ;
      Z8707BapieObs = "" ;
      Z8838CodBarPz = "" ;
      Z8907PzaB80 = "" ;
      Z9795BarPieK1 = DecimalUtil.ZERO ;
      Z9796BarPieK2 = DecimalUtil.ZERO ;
      Z9798BarPz1 = 0 ;
      Z9799BarPz2 = 0 ;
      Z9800BarNPes = (byte)(0) ;
      Z9846BarPieAncc = (short)(0) ;
      Z9984BarPiePda = DecimalUtil.ZERO ;
      Z1919BarPieObs = "" ;
      Z6472BarTara = DecimalUtil.ZERO ;
      Z6473BarUniB = DecimalUtil.ZERO ;
      Z12113BarPieCLd = (byte)(0) ;
      Z12779BarPieFdv = GXutil.nullDate() ;
      Z12780BarPieUsu = "" ;
      Z12911BarPieFep = GXutil.nullDate() ;
      Z12920BarPieColD = "" ;
      Z12921BarPieColN = 0 ;
      Z12926BarPieCoCI = "" ;
      Z12927BarPieCoCN = 0 ;
      Z12922BarPieArtI = "" ;
      Z12923BarPieArtD = "" ;
      Z12924BarPieCliI = 0 ;
      Z12925BarPieCliN = "" ;
      Z12928BarPieEncC = "" ;
      Z12935BarPieTono = "" ;
      Z12936BarPieSecu = "" ;
      Z12992BarPieOpe = 0 ;
      Z13004BarPieDest = (byte)(0) ;
      Z13107BarPieEmp = (short)(0) ;
      Z13108BarPieLote = "" ;
      Z13109BarPieST = "" ;
      Z13518BarPieTurn = (byte)(0) ;
      Z13519BarPieMq = "" ;
      Z44AlbRecCod = 0 ;
   }

   public void initAll1PO18( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A200BarPieCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      initializeNonKey1PO18( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267613475062", true, true);
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
      httpContext.AddJavascriptSource("barpie.js", "?20267613475062", false, true);
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
      edtBarPieCod_Internalname = "BARPIECOD" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtBarPieKil_Internalname = "BARPIEKIL" ;
      edtBarPieMet_Internalname = "BARPIEMET" ;
      edtBarPieEst_Internalname = "BARPIEEST" ;
      edtBarKilLan_Internalname = "BARKILLAN" ;
      edtBarMetLan_Internalname = "BARMETLAN" ;
      edtBarPConTro_Internalname = "BARPCONTRO" ;
      edtPieOriCod_Internalname = "PIEORICOD" ;
      edtBarPieLzd_Internalname = "BARPIELZD" ;
      edtBarPiePie_Internalname = "BARPIEPIE" ;
      edtBarPieLoc_Internalname = "BARPIELOC" ;
      edtBarPieAnc_Internalname = "BARPIEANC" ;
      edtBarKgsAut_Internalname = "BARKGSAUT" ;
      edtBarMtsAut_Internalname = "BARMTSAUT" ;
      edtBarPieAut_Internalname = "BARPIEAUT" ;
      edtBarPieImp_Internalname = "BARPIEIMP" ;
      edtBarPieIdPz_Internalname = "BARPIEIDPZ" ;
      edtBapieObs_Internalname = "BAPIEOBS" ;
      edtCodBarPz_Internalname = "CODBARPZ" ;
      edtPzaB80_Internalname = "PZAB80" ;
      edtBarPieK1_Internalname = "BARPIEK1" ;
      edtBarPieK2_Internalname = "BARPIEK2" ;
      edtBarPz1_Internalname = "BARPZ1" ;
      edtBarPz2_Internalname = "BARPZ2" ;
      edtBarNPes_Internalname = "BARNPES" ;
      edtBarPieAncc_Internalname = "BARPIEANCC" ;
      edtBarPiePda_Internalname = "BARPIEPDA" ;
      edtBarPieObs_Internalname = "BARPIEOBS" ;
      edtBarTara_Internalname = "BARTARA" ;
      edtBarUniB_Internalname = "BARUNIB" ;
      edtBarPieCLd_Internalname = "BARPIECLD" ;
      edtBarPieFdv_Internalname = "BARPIEFDV" ;
      edtBarPieUsu_Internalname = "BARPIEUSU" ;
      edtBarPieFep_Internalname = "BARPIEFEP" ;
      edtBarPieColD_Internalname = "BARPIECOLD" ;
      edtBarPieColN_Internalname = "BARPIECOLN" ;
      edtBarPieCoCI_Internalname = "BARPIECOCI" ;
      edtBarPieCoCN_Internalname = "BARPIECOCN" ;
      edtBarPieArtI_Internalname = "BARPIEARTI" ;
      edtBarPieArtD_Internalname = "BARPIEARTD" ;
      edtBarPieCliI_Internalname = "BARPIECLII" ;
      edtBarPieCliN_Internalname = "BARPIECLIN" ;
      edtBarPieEncC_Internalname = "BARPIEENCC" ;
      edtBarPieTono_Internalname = "BARPIETONO" ;
      edtBarPieSecu_Internalname = "BARPIESECU" ;
      edtBarPieOpe_Internalname = "BARPIEOPE" ;
      edtBarPieDest_Internalname = "BARPIEDEST" ;
      edtBarPieEmp_Internalname = "BARPIEEMP" ;
      edtBarPieLote_Internalname = "BARPIELOTE" ;
      edtBarPieST_Internalname = "BARPIEST" ;
      edtBarPieTurn_Internalname = "BARPIETURN" ;
      edtBarPieMq_Internalname = "BARPIEMQ" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla BARPIE", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBarPieMq_Jsonclick = "" ;
      edtBarPieMq_Enabled = 1 ;
      edtBarPieTurn_Jsonclick = "" ;
      edtBarPieTurn_Enabled = 1 ;
      edtBarPieST_Jsonclick = "" ;
      edtBarPieST_Enabled = 1 ;
      edtBarPieLote_Jsonclick = "" ;
      edtBarPieLote_Enabled = 1 ;
      edtBarPieEmp_Jsonclick = "" ;
      edtBarPieEmp_Enabled = 1 ;
      edtBarPieDest_Jsonclick = "" ;
      edtBarPieDest_Enabled = 1 ;
      edtBarPieOpe_Jsonclick = "" ;
      edtBarPieOpe_Enabled = 1 ;
      edtBarPieSecu_Jsonclick = "" ;
      edtBarPieSecu_Enabled = 1 ;
      edtBarPieTono_Jsonclick = "" ;
      edtBarPieTono_Enabled = 1 ;
      edtBarPieEncC_Jsonclick = "" ;
      edtBarPieEncC_Enabled = 1 ;
      edtBarPieCliN_Jsonclick = "" ;
      edtBarPieCliN_Enabled = 1 ;
      edtBarPieCliI_Jsonclick = "" ;
      edtBarPieCliI_Enabled = 1 ;
      edtBarPieArtD_Jsonclick = "" ;
      edtBarPieArtD_Enabled = 1 ;
      edtBarPieArtI_Jsonclick = "" ;
      edtBarPieArtI_Enabled = 1 ;
      edtBarPieCoCN_Jsonclick = "" ;
      edtBarPieCoCN_Enabled = 1 ;
      edtBarPieCoCI_Jsonclick = "" ;
      edtBarPieCoCI_Enabled = 1 ;
      edtBarPieColN_Jsonclick = "" ;
      edtBarPieColN_Enabled = 1 ;
      edtBarPieColD_Jsonclick = "" ;
      edtBarPieColD_Enabled = 1 ;
      edtBarPieFep_Jsonclick = "" ;
      edtBarPieFep_Enabled = 1 ;
      edtBarPieUsu_Jsonclick = "" ;
      edtBarPieUsu_Enabled = 1 ;
      edtBarPieFdv_Jsonclick = "" ;
      edtBarPieFdv_Enabled = 1 ;
      edtBarPieCLd_Jsonclick = "" ;
      edtBarPieCLd_Enabled = 1 ;
      edtBarUniB_Jsonclick = "" ;
      edtBarUniB_Enabled = 1 ;
      edtBarTara_Jsonclick = "" ;
      edtBarTara_Enabled = 1 ;
      edtBarPieObs_Jsonclick = "" ;
      edtBarPieObs_Enabled = 1 ;
      edtBarPiePda_Jsonclick = "" ;
      edtBarPiePda_Enabled = 1 ;
      edtBarPieAncc_Jsonclick = "" ;
      edtBarPieAncc_Enabled = 1 ;
      edtBarNPes_Jsonclick = "" ;
      edtBarNPes_Enabled = 1 ;
      edtBarPz2_Jsonclick = "" ;
      edtBarPz2_Enabled = 1 ;
      edtBarPz1_Jsonclick = "" ;
      edtBarPz1_Enabled = 1 ;
      edtBarPieK2_Jsonclick = "" ;
      edtBarPieK2_Enabled = 1 ;
      edtBarPieK1_Jsonclick = "" ;
      edtBarPieK1_Enabled = 1 ;
      edtPzaB80_Jsonclick = "" ;
      edtPzaB80_Enabled = 1 ;
      edtCodBarPz_Jsonclick = "" ;
      edtCodBarPz_Enabled = 1 ;
      edtBapieObs_Jsonclick = "" ;
      edtBapieObs_Enabled = 1 ;
      edtBarPieIdPz_Jsonclick = "" ;
      edtBarPieIdPz_Enabled = 1 ;
      edtBarPieImp_Jsonclick = "" ;
      edtBarPieImp_Enabled = 1 ;
      edtBarPieAut_Jsonclick = "" ;
      edtBarPieAut_Enabled = 1 ;
      edtBarMtsAut_Jsonclick = "" ;
      edtBarMtsAut_Enabled = 1 ;
      edtBarKgsAut_Jsonclick = "" ;
      edtBarKgsAut_Enabled = 1 ;
      edtBarPieAnc_Jsonclick = "" ;
      edtBarPieAnc_Enabled = 1 ;
      edtBarPieLoc_Jsonclick = "" ;
      edtBarPieLoc_Enabled = 1 ;
      edtBarPiePie_Jsonclick = "" ;
      edtBarPiePie_Enabled = 1 ;
      edtBarPieLzd_Jsonclick = "" ;
      edtBarPieLzd_Enabled = 1 ;
      edtPieOriCod_Jsonclick = "" ;
      edtPieOriCod_Enabled = 1 ;
      edtBarPConTro_Jsonclick = "" ;
      edtBarPConTro_Enabled = 1 ;
      edtBarMetLan_Jsonclick = "" ;
      edtBarMetLan_Enabled = 1 ;
      edtBarKilLan_Jsonclick = "" ;
      edtBarKilLan_Enabled = 1 ;
      edtBarPieEst_Jsonclick = "" ;
      edtBarPieEst_Enabled = 1 ;
      edtBarPieMet_Jsonclick = "" ;
      edtBarPieMet_Enabled = 1 ;
      edtBarPieKil_Jsonclick = "" ;
      edtBarPieKil_Enabled = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 1 ;
      edtBarPieCod_Jsonclick = "" ;
      edtBarPieCod_Enabled = 1 ;
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
      /* Using cursor T01PO19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(17);
      GX_FocusControl = edtAlbRecCod_Internalname ;
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
      /* Using cursor T01PO19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Barpiecod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A201BarPieEst", GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A908PieOriCod", GXutil.rtrim( A908PieOriCod));
      httpContext.ajax_rsp_assign_attri("", false, "A1271BarPieLzd", GXutil.ltrim( localUtil.ntoc( A1271BarPieLzd, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", GXutil.rtrim( A2186BarPieLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A1691BarPieAnc", GXutil.ltrim( localUtil.ntoc( A1691BarPieAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3275BarKgsAut", GXutil.ltrim( localUtil.ntoc( A3275BarKgsAut, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3276BarMtsAut", GXutil.ltrim( localUtil.ntoc( A3276BarMtsAut, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3277BarPieAut", GXutil.ltrim( localUtil.ntoc( A3277BarPieAut, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6116BarPieImp", GXutil.rtrim( A6116BarPieImp));
      httpContext.ajax_rsp_assign_attri("", false, "A6489BarPieIdPz", GXutil.rtrim( A6489BarPieIdPz));
      httpContext.ajax_rsp_assign_attri("", false, "A8707BapieObs", GXutil.rtrim( A8707BapieObs));
      httpContext.ajax_rsp_assign_attri("", false, "A8838CodBarPz", GXutil.rtrim( A8838CodBarPz));
      httpContext.ajax_rsp_assign_attri("", false, "A8907PzaB80", GXutil.rtrim( A8907PzaB80));
      httpContext.ajax_rsp_assign_attri("", false, "A9795BarPieK1", GXutil.ltrim( localUtil.ntoc( A9795BarPieK1, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9796BarPieK2", GXutil.ltrim( localUtil.ntoc( A9796BarPieK2, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9798BarPz1", GXutil.ltrim( localUtil.ntoc( A9798BarPz1, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9799BarPz2", GXutil.ltrim( localUtil.ntoc( A9799BarPz2, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9800BarNPes", GXutil.ltrim( localUtil.ntoc( A9800BarNPes, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9846BarPieAncc", GXutil.ltrim( localUtil.ntoc( A9846BarPieAncc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9984BarPiePda", GXutil.ltrim( localUtil.ntoc( A9984BarPiePda, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1919BarPieObs", GXutil.rtrim( A1919BarPieObs));
      httpContext.ajax_rsp_assign_attri("", false, "A6472BarTara", GXutil.ltrim( localUtil.ntoc( A6472BarTara, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6473BarUniB", GXutil.ltrim( localUtil.ntoc( A6473BarUniB, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12113BarPieCLd", GXutil.ltrim( localUtil.ntoc( A12113BarPieCLd, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12779BarPieFdv", localUtil.format(A12779BarPieFdv, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12780BarPieUsu", GXutil.rtrim( A12780BarPieUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A12911BarPieFep", localUtil.format(A12911BarPieFep, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12920BarPieColD", GXutil.rtrim( A12920BarPieColD));
      httpContext.ajax_rsp_assign_attri("", false, "A12921BarPieColN", GXutil.ltrim( localUtil.ntoc( A12921BarPieColN, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12926BarPieCoCI", GXutil.rtrim( A12926BarPieCoCI));
      httpContext.ajax_rsp_assign_attri("", false, "A12927BarPieCoCN", GXutil.ltrim( localUtil.ntoc( A12927BarPieCoCN, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12922BarPieArtI", GXutil.rtrim( A12922BarPieArtI));
      httpContext.ajax_rsp_assign_attri("", false, "A12923BarPieArtD", GXutil.rtrim( A12923BarPieArtD));
      httpContext.ajax_rsp_assign_attri("", false, "A12924BarPieCliI", GXutil.ltrim( localUtil.ntoc( A12924BarPieCliI, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12925BarPieCliN", GXutil.rtrim( A12925BarPieCliN));
      httpContext.ajax_rsp_assign_attri("", false, "A12928BarPieEncC", GXutil.rtrim( A12928BarPieEncC));
      httpContext.ajax_rsp_assign_attri("", false, "A12935BarPieTono", GXutil.rtrim( A12935BarPieTono));
      httpContext.ajax_rsp_assign_attri("", false, "A12936BarPieSecu", GXutil.rtrim( A12936BarPieSecu));
      httpContext.ajax_rsp_assign_attri("", false, "A12992BarPieOpe", GXutil.ltrim( localUtil.ntoc( A12992BarPieOpe, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13004BarPieDest", GXutil.ltrim( localUtil.ntoc( A13004BarPieDest, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13107BarPieEmp", GXutil.ltrim( localUtil.ntoc( A13107BarPieEmp, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13108BarPieLote", GXutil.rtrim( A13108BarPieLote));
      httpContext.ajax_rsp_assign_attri("", false, "A13109BarPieST", GXutil.rtrim( A13109BarPieST));
      httpContext.ajax_rsp_assign_attri("", false, "A13518BarPieTurn", GXutil.ltrim( localUtil.ntoc( A13518BarPieTurn, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13519BarPieMq", GXutil.rtrim( A13519BarPieMq));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z203BarPieKil", GXutil.ltrim( localUtil.ntoc( Z203BarPieKil, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z205BarPieMet", GXutil.ltrim( localUtil.ntoc( Z205BarPieMet, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z201BarPieEst", GXutil.ltrim( localUtil.ntoc( Z201BarPieEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z170BarKilLan", GXutil.ltrim( localUtil.ntoc( Z170BarKilLan, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z183BarMetLan", GXutil.ltrim( localUtil.ntoc( Z183BarMetLan, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z197BarPConTro", GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z908PieOriCod", GXutil.rtrim( Z908PieOriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1271BarPieLzd", GXutil.ltrim( localUtil.ntoc( Z1271BarPieLzd, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1501BarPiePie", GXutil.ltrim( localUtil.ntoc( Z1501BarPiePie, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2186BarPieLoc", GXutil.rtrim( Z2186BarPieLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1691BarPieAnc", GXutil.ltrim( localUtil.ntoc( Z1691BarPieAnc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3275BarKgsAut", GXutil.ltrim( localUtil.ntoc( Z3275BarKgsAut, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3276BarMtsAut", GXutil.ltrim( localUtil.ntoc( Z3276BarMtsAut, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3277BarPieAut", GXutil.ltrim( localUtil.ntoc( Z3277BarPieAut, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6116BarPieImp", GXutil.rtrim( Z6116BarPieImp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6489BarPieIdPz", GXutil.rtrim( Z6489BarPieIdPz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8707BapieObs", GXutil.rtrim( Z8707BapieObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8838CodBarPz", GXutil.rtrim( Z8838CodBarPz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8907PzaB80", GXutil.rtrim( Z8907PzaB80));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9795BarPieK1", GXutil.ltrim( localUtil.ntoc( Z9795BarPieK1, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9796BarPieK2", GXutil.ltrim( localUtil.ntoc( Z9796BarPieK2, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9798BarPz1", GXutil.ltrim( localUtil.ntoc( Z9798BarPz1, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9799BarPz2", GXutil.ltrim( localUtil.ntoc( Z9799BarPz2, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9800BarNPes", GXutil.ltrim( localUtil.ntoc( Z9800BarNPes, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9846BarPieAncc", GXutil.ltrim( localUtil.ntoc( Z9846BarPieAncc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9984BarPiePda", GXutil.ltrim( localUtil.ntoc( Z9984BarPiePda, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1919BarPieObs", GXutil.rtrim( Z1919BarPieObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6472BarTara", GXutil.ltrim( localUtil.ntoc( Z6472BarTara, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6473BarUniB", GXutil.ltrim( localUtil.ntoc( Z6473BarUniB, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12113BarPieCLd", GXutil.ltrim( localUtil.ntoc( Z12113BarPieCLd, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12779BarPieFdv", localUtil.format(Z12779BarPieFdv, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12780BarPieUsu", GXutil.rtrim( Z12780BarPieUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12911BarPieFep", localUtil.format(Z12911BarPieFep, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12920BarPieColD", GXutil.rtrim( Z12920BarPieColD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12921BarPieColN", GXutil.ltrim( localUtil.ntoc( Z12921BarPieColN, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12926BarPieCoCI", GXutil.rtrim( Z12926BarPieCoCI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12927BarPieCoCN", GXutil.ltrim( localUtil.ntoc( Z12927BarPieCoCN, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12922BarPieArtI", GXutil.rtrim( Z12922BarPieArtI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12923BarPieArtD", GXutil.rtrim( Z12923BarPieArtD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12924BarPieCliI", GXutil.ltrim( localUtil.ntoc( Z12924BarPieCliI, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12925BarPieCliN", GXutil.rtrim( Z12925BarPieCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12928BarPieEncC", GXutil.rtrim( Z12928BarPieEncC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12935BarPieTono", GXutil.rtrim( Z12935BarPieTono));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12936BarPieSecu", GXutil.rtrim( Z12936BarPieSecu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12992BarPieOpe", GXutil.ltrim( localUtil.ntoc( Z12992BarPieOpe, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13004BarPieDest", GXutil.ltrim( localUtil.ntoc( Z13004BarPieDest, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13107BarPieEmp", GXutil.ltrim( localUtil.ntoc( Z13107BarPieEmp, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13108BarPieLote", GXutil.rtrim( Z13108BarPieLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13109BarPieST", GXutil.rtrim( Z13109BarPieST));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13518BarPieTurn", GXutil.ltrim( localUtil.ntoc( Z13518BarPieTurn, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13519BarPieMq", GXutil.rtrim( Z13519BarPieMq));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Albreccod( )
   {
      /* Using cursor T01PO20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(18);
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
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARPIECOD","{handler:'valid_Barpiecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARPIECOD",",oparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A201BarPieEst',fld:'BARPIEEST',pic:'9'},{av:'A170BarKilLan',fld:'BARKILLAN',pic:'ZZZZZ9.99'},{av:'A183BarMetLan',fld:'BARMETLAN',pic:'ZZZZZ9.99'},{av:'A197BarPConTro',fld:'BARPCONTRO',pic:'ZZ9'},{av:'A908PieOriCod',fld:'PIEORICOD',pic:''},{av:'A1271BarPieLzd',fld:'BARPIELZD',pic:'ZZZ9'},{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'},{av:'A2186BarPieLoc',fld:'BARPIELOC',pic:''},{av:'A1691BarPieAnc',fld:'BARPIEANC',pic:'ZZZ9'},{av:'A3275BarKgsAut',fld:'BARKGSAUT',pic:'ZZZZZ9.99'},{av:'A3276BarMtsAut',fld:'BARMTSAUT',pic:'ZZZZZ9.99'},{av:'A3277BarPieAut',fld:'BARPIEAUT',pic:'ZZZ9'},{av:'A6116BarPieImp',fld:'BARPIEIMP',pic:''},{av:'A6489BarPieIdPz',fld:'BARPIEIDPZ',pic:''},{av:'A8707BapieObs',fld:'BAPIEOBS',pic:''},{av:'A8838CodBarPz',fld:'CODBARPZ',pic:''},{av:'A8907PzaB80',fld:'PZAB80',pic:''},{av:'A9795BarPieK1',fld:'BARPIEK1',pic:'ZZZZZ9.99'},{av:'A9796BarPieK2',fld:'BARPIEK2',pic:'ZZZZZ9.99'},{av:'A9798BarPz1',fld:'BARPZ1',pic:'ZZZZZ9'},{av:'A9799BarPz2',fld:'BARPZ2',pic:'ZZZZZ9'},{av:'A9800BarNPes',fld:'BARNPES',pic:'9'},{av:'A9846BarPieAncc',fld:'BARPIEANCC',pic:'ZZZ9'},{av:'A9984BarPiePda',fld:'BARPIEPDA',pic:'ZZ9.99'},{av:'A1919BarPieObs',fld:'BARPIEOBS',pic:''},{av:'A6472BarTara',fld:'BARTARA',pic:'ZZ9.99'},{av:'A6473BarUniB',fld:'BARUNIB',pic:'ZZZZZ9.99'},{av:'A12113BarPieCLd',fld:'BARPIECLD',pic:'Z9'},{av:'A12779BarPieFdv',fld:'BARPIEFDV',pic:''},{av:'A12780BarPieUsu',fld:'BARPIEUSU',pic:''},{av:'A12911BarPieFep',fld:'BARPIEFEP',pic:''},{av:'A12920BarPieColD',fld:'BARPIECOLD',pic:''},{av:'A12921BarPieColN',fld:'BARPIECOLN',pic:'ZZZZZ9'},{av:'A12926BarPieCoCI',fld:'BARPIECOCI',pic:''},{av:'A12927BarPieCoCN',fld:'BARPIECOCN',pic:'ZZZZZ9'},{av:'A12922BarPieArtI',fld:'BARPIEARTI',pic:''},{av:'A12923BarPieArtD',fld:'BARPIEARTD',pic:''},{av:'A12924BarPieCliI',fld:'BARPIECLII',pic:'ZZZZZ9'},{av:'A12925BarPieCliN',fld:'BARPIECLIN',pic:''},{av:'A12928BarPieEncC',fld:'BARPIEENCC',pic:''},{av:'A12935BarPieTono',fld:'BARPIETONO',pic:''},{av:'A12936BarPieSecu',fld:'BARPIESECU',pic:''},{av:'A12992BarPieOpe',fld:'BARPIEOPE',pic:'ZZZZZ9'},{av:'A13004BarPieDest',fld:'BARPIEDEST',pic:'Z9'},{av:'A13107BarPieEmp',fld:'BARPIEEMP',pic:'ZZZ9'},{av:'A13108BarPieLote',fld:'BARPIELOTE',pic:''},{av:'A13109BarPieST',fld:'BARPIEST',pic:''},{av:'A13518BarPieTurn',fld:'BARPIETURN',pic:'Z9'},{av:'A13519BarPieMq',fld:'BARPIEMQ',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z200BarPieCod'},{av:'Z44AlbRecCod'},{av:'Z203BarPieKil'},{av:'Z205BarPieMet'},{av:'Z201BarPieEst'},{av:'Z170BarKilLan'},{av:'Z183BarMetLan'},{av:'Z197BarPConTro'},{av:'Z908PieOriCod'},{av:'Z1271BarPieLzd'},{av:'Z1501BarPiePie'},{av:'Z2186BarPieLoc'},{av:'Z1691BarPieAnc'},{av:'Z3275BarKgsAut'},{av:'Z3276BarMtsAut'},{av:'Z3277BarPieAut'},{av:'Z6116BarPieImp'},{av:'Z6489BarPieIdPz'},{av:'Z8707BapieObs'},{av:'Z8838CodBarPz'},{av:'Z8907PzaB80'},{av:'Z9795BarPieK1'},{av:'Z9796BarPieK2'},{av:'Z9798BarPz1'},{av:'Z9799BarPz2'},{av:'Z9800BarNPes'},{av:'Z9846BarPieAncc'},{av:'Z9984BarPiePda'},{av:'Z1919BarPieObs'},{av:'Z6472BarTara'},{av:'Z6473BarUniB'},{av:'Z12113BarPieCLd'},{av:'Z12779BarPieFdv'},{av:'Z12780BarPieUsu'},{av:'Z12911BarPieFep'},{av:'Z12920BarPieColD'},{av:'Z12921BarPieColN'},{av:'Z12926BarPieCoCI'},{av:'Z12927BarPieCoCN'},{av:'Z12922BarPieArtI'},{av:'Z12923BarPieArtD'},{av:'Z12924BarPieCliI'},{av:'Z12925BarPieCliN'},{av:'Z12928BarPieEncC'},{av:'Z12935BarPieTono'},{av:'Z12936BarPieSecu'},{av:'Z12992BarPieOpe'},{av:'Z13004BarPieDest'},{av:'Z13107BarPieEmp'},{av:'Z13108BarPieLote'},{av:'Z13109BarPieST'},{av:'Z13518BarPieTurn'},{av:'Z13519BarPieMq'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
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
      pr_default.close(18);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z200BarPieCod = "" ;
      Z203BarPieKil = DecimalUtil.ZERO ;
      Z205BarPieMet = DecimalUtil.ZERO ;
      Z170BarKilLan = DecimalUtil.ZERO ;
      Z183BarMetLan = DecimalUtil.ZERO ;
      Z908PieOriCod = "" ;
      Z2186BarPieLoc = "" ;
      Z3275BarKgsAut = DecimalUtil.ZERO ;
      Z3276BarMtsAut = DecimalUtil.ZERO ;
      Z6116BarPieImp = "" ;
      Z6489BarPieIdPz = "" ;
      Z8707BapieObs = "" ;
      Z8838CodBarPz = "" ;
      Z8907PzaB80 = "" ;
      Z9795BarPieK1 = DecimalUtil.ZERO ;
      Z9796BarPieK2 = DecimalUtil.ZERO ;
      Z9984BarPiePda = DecimalUtil.ZERO ;
      Z1919BarPieObs = "" ;
      Z6472BarTara = DecimalUtil.ZERO ;
      Z6473BarUniB = DecimalUtil.ZERO ;
      Z12779BarPieFdv = GXutil.nullDate() ;
      Z12780BarPieUsu = "" ;
      Z12911BarPieFep = GXutil.nullDate() ;
      Z12920BarPieColD = "" ;
      Z12926BarPieCoCI = "" ;
      Z12922BarPieArtI = "" ;
      Z12923BarPieArtD = "" ;
      Z12925BarPieCliN = "" ;
      Z12928BarPieEncC = "" ;
      Z12935BarPieTono = "" ;
      Z12936BarPieSecu = "" ;
      Z13108BarPieLote = "" ;
      Z13109BarPieST = "" ;
      Z13519BarPieMq = "" ;
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
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A908PieOriCod = "" ;
      A2186BarPieLoc = "" ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A6116BarPieImp = "" ;
      A6489BarPieIdPz = "" ;
      A8707BapieObs = "" ;
      A8838CodBarPz = "" ;
      A8907PzaB80 = "" ;
      A9795BarPieK1 = DecimalUtil.ZERO ;
      A9796BarPieK2 = DecimalUtil.ZERO ;
      A9984BarPiePda = DecimalUtil.ZERO ;
      A1919BarPieObs = "" ;
      A6472BarTara = DecimalUtil.ZERO ;
      A6473BarUniB = DecimalUtil.ZERO ;
      A12779BarPieFdv = GXutil.nullDate() ;
      A12780BarPieUsu = "" ;
      A12911BarPieFep = GXutil.nullDate() ;
      A12920BarPieColD = "" ;
      A12926BarPieCoCI = "" ;
      A12922BarPieArtI = "" ;
      A12923BarPieArtD = "" ;
      A12925BarPieCliN = "" ;
      A12928BarPieEncC = "" ;
      A12935BarPieTono = "" ;
      A12936BarPieSecu = "" ;
      A13108BarPieLote = "" ;
      A13109BarPieST = "" ;
      A13519BarPieMq = "" ;
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
      T01PO6_A200BarPieCod = new String[] {""} ;
      T01PO6_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO6_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO6_A201BarPieEst = new byte[1] ;
      T01PO6_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO6_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO6_A197BarPConTro = new short[1] ;
      T01PO6_A908PieOriCod = new String[] {""} ;
      T01PO6_A1271BarPieLzd = new int[1] ;
      T01PO6_A1501BarPiePie = new int[1] ;
      T01PO6_A2186BarPieLoc = new String[] {""} ;
      T01PO6_n2186BarPieLoc = new boolean[] {false} ;
      T01PO6_A1691BarPieAnc = new short[1] ;
      T01PO6_n1691BarPieAnc = new boolean[] {false} ;
      T01PO6_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO6_n3275BarKgsAut = new boolean[] {false} ;
      T01PO6_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO6_n3276BarMtsAut = new boolean[] {false} ;
      T01PO6_A3277BarPieAut = new short[1] ;
      T01PO6_n3277BarPieAut = new boolean[] {false} ;
      T01PO6_A6116BarPieImp = new String[] {""} ;
      T01PO6_n6116BarPieImp = new boolean[] {false} ;
      T01PO6_A6489BarPieIdPz = new String[] {""} ;
      T01PO6_n6489BarPieIdPz = new boolean[] {false} ;
      T01PO6_A8707BapieObs = new String[] {""} ;
      T01PO6_n8707BapieObs = new boolean[] {false} ;
      T01PO6_A8838CodBarPz = new String[] {""} ;
      T01PO6_n8838CodBarPz = new boolean[] {false} ;
      T01PO6_A8907PzaB80 = new String[] {""} ;
      T01PO6_n8907PzaB80 = new boolean[] {false} ;
      T01PO6_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO6_n9795BarPieK1 = new boolean[] {false} ;
      T01PO6_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO6_n9796BarPieK2 = new boolean[] {false} ;
      T01PO6_A9798BarPz1 = new int[1] ;
      T01PO6_n9798BarPz1 = new boolean[] {false} ;
      T01PO6_A9799BarPz2 = new int[1] ;
      T01PO6_n9799BarPz2 = new boolean[] {false} ;
      T01PO6_A9800BarNPes = new byte[1] ;
      T01PO6_n9800BarNPes = new boolean[] {false} ;
      T01PO6_A9846BarPieAncc = new short[1] ;
      T01PO6_n9846BarPieAncc = new boolean[] {false} ;
      T01PO6_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO6_n9984BarPiePda = new boolean[] {false} ;
      T01PO6_A1919BarPieObs = new String[] {""} ;
      T01PO6_n1919BarPieObs = new boolean[] {false} ;
      T01PO6_A6472BarTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO6_n6472BarTara = new boolean[] {false} ;
      T01PO6_A6473BarUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO6_n6473BarUniB = new boolean[] {false} ;
      T01PO6_A12113BarPieCLd = new byte[1] ;
      T01PO6_n12113BarPieCLd = new boolean[] {false} ;
      T01PO6_A12779BarPieFdv = new java.util.Date[] {GXutil.nullDate()} ;
      T01PO6_n12779BarPieFdv = new boolean[] {false} ;
      T01PO6_A12780BarPieUsu = new String[] {""} ;
      T01PO6_n12780BarPieUsu = new boolean[] {false} ;
      T01PO6_A12911BarPieFep = new java.util.Date[] {GXutil.nullDate()} ;
      T01PO6_n12911BarPieFep = new boolean[] {false} ;
      T01PO6_A12920BarPieColD = new String[] {""} ;
      T01PO6_n12920BarPieColD = new boolean[] {false} ;
      T01PO6_A12921BarPieColN = new int[1] ;
      T01PO6_n12921BarPieColN = new boolean[] {false} ;
      T01PO6_A12926BarPieCoCI = new String[] {""} ;
      T01PO6_n12926BarPieCoCI = new boolean[] {false} ;
      T01PO6_A12927BarPieCoCN = new int[1] ;
      T01PO6_n12927BarPieCoCN = new boolean[] {false} ;
      T01PO6_A12922BarPieArtI = new String[] {""} ;
      T01PO6_n12922BarPieArtI = new boolean[] {false} ;
      T01PO6_A12923BarPieArtD = new String[] {""} ;
      T01PO6_n12923BarPieArtD = new boolean[] {false} ;
      T01PO6_A12924BarPieCliI = new int[1] ;
      T01PO6_n12924BarPieCliI = new boolean[] {false} ;
      T01PO6_A12925BarPieCliN = new String[] {""} ;
      T01PO6_n12925BarPieCliN = new boolean[] {false} ;
      T01PO6_A12928BarPieEncC = new String[] {""} ;
      T01PO6_n12928BarPieEncC = new boolean[] {false} ;
      T01PO6_A12935BarPieTono = new String[] {""} ;
      T01PO6_n12935BarPieTono = new boolean[] {false} ;
      T01PO6_A12936BarPieSecu = new String[] {""} ;
      T01PO6_n12936BarPieSecu = new boolean[] {false} ;
      T01PO6_A12992BarPieOpe = new int[1] ;
      T01PO6_n12992BarPieOpe = new boolean[] {false} ;
      T01PO6_A13004BarPieDest = new byte[1] ;
      T01PO6_n13004BarPieDest = new boolean[] {false} ;
      T01PO6_A13107BarPieEmp = new short[1] ;
      T01PO6_n13107BarPieEmp = new boolean[] {false} ;
      T01PO6_A13108BarPieLote = new String[] {""} ;
      T01PO6_n13108BarPieLote = new boolean[] {false} ;
      T01PO6_A13109BarPieST = new String[] {""} ;
      T01PO6_n13109BarPieST = new boolean[] {false} ;
      T01PO6_A13518BarPieTurn = new byte[1] ;
      T01PO6_n13518BarPieTurn = new boolean[] {false} ;
      T01PO6_A13519BarPieMq = new String[] {""} ;
      T01PO6_n13519BarPieMq = new boolean[] {false} ;
      T01PO6_A396EmprCod = new String[] {""} ;
      T01PO6_A44AlbRecCod = new int[1] ;
      T01PO6_A129BarCod = new int[1] ;
      T01PO6_A132BarCodReo = new byte[1] ;
      T01PO6_A130BarCodPar = new String[] {""} ;
      T01PO4_A396EmprCod = new String[] {""} ;
      T01PO5_A396EmprCod = new String[] {""} ;
      T01PO7_A396EmprCod = new String[] {""} ;
      T01PO8_A396EmprCod = new String[] {""} ;
      T01PO9_A396EmprCod = new String[] {""} ;
      T01PO9_A129BarCod = new int[1] ;
      T01PO9_A132BarCodReo = new byte[1] ;
      T01PO9_A130BarCodPar = new String[] {""} ;
      T01PO9_A200BarPieCod = new String[] {""} ;
      T01PO3_A200BarPieCod = new String[] {""} ;
      T01PO3_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO3_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO3_A201BarPieEst = new byte[1] ;
      T01PO3_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO3_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO3_A197BarPConTro = new short[1] ;
      T01PO3_A908PieOriCod = new String[] {""} ;
      T01PO3_A1271BarPieLzd = new int[1] ;
      T01PO3_A1501BarPiePie = new int[1] ;
      T01PO3_A2186BarPieLoc = new String[] {""} ;
      T01PO3_n2186BarPieLoc = new boolean[] {false} ;
      T01PO3_A1691BarPieAnc = new short[1] ;
      T01PO3_n1691BarPieAnc = new boolean[] {false} ;
      T01PO3_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO3_n3275BarKgsAut = new boolean[] {false} ;
      T01PO3_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO3_n3276BarMtsAut = new boolean[] {false} ;
      T01PO3_A3277BarPieAut = new short[1] ;
      T01PO3_n3277BarPieAut = new boolean[] {false} ;
      T01PO3_A6116BarPieImp = new String[] {""} ;
      T01PO3_n6116BarPieImp = new boolean[] {false} ;
      T01PO3_A6489BarPieIdPz = new String[] {""} ;
      T01PO3_n6489BarPieIdPz = new boolean[] {false} ;
      T01PO3_A8707BapieObs = new String[] {""} ;
      T01PO3_n8707BapieObs = new boolean[] {false} ;
      T01PO3_A8838CodBarPz = new String[] {""} ;
      T01PO3_n8838CodBarPz = new boolean[] {false} ;
      T01PO3_A8907PzaB80 = new String[] {""} ;
      T01PO3_n8907PzaB80 = new boolean[] {false} ;
      T01PO3_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO3_n9795BarPieK1 = new boolean[] {false} ;
      T01PO3_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO3_n9796BarPieK2 = new boolean[] {false} ;
      T01PO3_A9798BarPz1 = new int[1] ;
      T01PO3_n9798BarPz1 = new boolean[] {false} ;
      T01PO3_A9799BarPz2 = new int[1] ;
      T01PO3_n9799BarPz2 = new boolean[] {false} ;
      T01PO3_A9800BarNPes = new byte[1] ;
      T01PO3_n9800BarNPes = new boolean[] {false} ;
      T01PO3_A9846BarPieAncc = new short[1] ;
      T01PO3_n9846BarPieAncc = new boolean[] {false} ;
      T01PO3_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO3_n9984BarPiePda = new boolean[] {false} ;
      T01PO3_A1919BarPieObs = new String[] {""} ;
      T01PO3_n1919BarPieObs = new boolean[] {false} ;
      T01PO3_A6472BarTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO3_n6472BarTara = new boolean[] {false} ;
      T01PO3_A6473BarUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO3_n6473BarUniB = new boolean[] {false} ;
      T01PO3_A12113BarPieCLd = new byte[1] ;
      T01PO3_n12113BarPieCLd = new boolean[] {false} ;
      T01PO3_A12779BarPieFdv = new java.util.Date[] {GXutil.nullDate()} ;
      T01PO3_n12779BarPieFdv = new boolean[] {false} ;
      T01PO3_A12780BarPieUsu = new String[] {""} ;
      T01PO3_n12780BarPieUsu = new boolean[] {false} ;
      T01PO3_A12911BarPieFep = new java.util.Date[] {GXutil.nullDate()} ;
      T01PO3_n12911BarPieFep = new boolean[] {false} ;
      T01PO3_A12920BarPieColD = new String[] {""} ;
      T01PO3_n12920BarPieColD = new boolean[] {false} ;
      T01PO3_A12921BarPieColN = new int[1] ;
      T01PO3_n12921BarPieColN = new boolean[] {false} ;
      T01PO3_A12926BarPieCoCI = new String[] {""} ;
      T01PO3_n12926BarPieCoCI = new boolean[] {false} ;
      T01PO3_A12927BarPieCoCN = new int[1] ;
      T01PO3_n12927BarPieCoCN = new boolean[] {false} ;
      T01PO3_A12922BarPieArtI = new String[] {""} ;
      T01PO3_n12922BarPieArtI = new boolean[] {false} ;
      T01PO3_A12923BarPieArtD = new String[] {""} ;
      T01PO3_n12923BarPieArtD = new boolean[] {false} ;
      T01PO3_A12924BarPieCliI = new int[1] ;
      T01PO3_n12924BarPieCliI = new boolean[] {false} ;
      T01PO3_A12925BarPieCliN = new String[] {""} ;
      T01PO3_n12925BarPieCliN = new boolean[] {false} ;
      T01PO3_A12928BarPieEncC = new String[] {""} ;
      T01PO3_n12928BarPieEncC = new boolean[] {false} ;
      T01PO3_A12935BarPieTono = new String[] {""} ;
      T01PO3_n12935BarPieTono = new boolean[] {false} ;
      T01PO3_A12936BarPieSecu = new String[] {""} ;
      T01PO3_n12936BarPieSecu = new boolean[] {false} ;
      T01PO3_A12992BarPieOpe = new int[1] ;
      T01PO3_n12992BarPieOpe = new boolean[] {false} ;
      T01PO3_A13004BarPieDest = new byte[1] ;
      T01PO3_n13004BarPieDest = new boolean[] {false} ;
      T01PO3_A13107BarPieEmp = new short[1] ;
      T01PO3_n13107BarPieEmp = new boolean[] {false} ;
      T01PO3_A13108BarPieLote = new String[] {""} ;
      T01PO3_n13108BarPieLote = new boolean[] {false} ;
      T01PO3_A13109BarPieST = new String[] {""} ;
      T01PO3_n13109BarPieST = new boolean[] {false} ;
      T01PO3_A13518BarPieTurn = new byte[1] ;
      T01PO3_n13518BarPieTurn = new boolean[] {false} ;
      T01PO3_A13519BarPieMq = new String[] {""} ;
      T01PO3_n13519BarPieMq = new boolean[] {false} ;
      T01PO3_A396EmprCod = new String[] {""} ;
      T01PO3_A44AlbRecCod = new int[1] ;
      T01PO3_A129BarCod = new int[1] ;
      T01PO3_A132BarCodReo = new byte[1] ;
      T01PO3_A130BarCodPar = new String[] {""} ;
      sMode18 = "" ;
      T01PO10_A396EmprCod = new String[] {""} ;
      T01PO10_A129BarCod = new int[1] ;
      T01PO10_A132BarCodReo = new byte[1] ;
      T01PO10_A130BarCodPar = new String[] {""} ;
      T01PO10_A200BarPieCod = new String[] {""} ;
      T01PO11_A396EmprCod = new String[] {""} ;
      T01PO11_A129BarCod = new int[1] ;
      T01PO11_A132BarCodReo = new byte[1] ;
      T01PO11_A130BarCodPar = new String[] {""} ;
      T01PO11_A200BarPieCod = new String[] {""} ;
      T01PO2_A200BarPieCod = new String[] {""} ;
      T01PO2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO2_A201BarPieEst = new byte[1] ;
      T01PO2_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO2_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO2_A197BarPConTro = new short[1] ;
      T01PO2_A908PieOriCod = new String[] {""} ;
      T01PO2_A1271BarPieLzd = new int[1] ;
      T01PO2_A1501BarPiePie = new int[1] ;
      T01PO2_A2186BarPieLoc = new String[] {""} ;
      T01PO2_n2186BarPieLoc = new boolean[] {false} ;
      T01PO2_A1691BarPieAnc = new short[1] ;
      T01PO2_n1691BarPieAnc = new boolean[] {false} ;
      T01PO2_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO2_n3275BarKgsAut = new boolean[] {false} ;
      T01PO2_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO2_n3276BarMtsAut = new boolean[] {false} ;
      T01PO2_A3277BarPieAut = new short[1] ;
      T01PO2_n3277BarPieAut = new boolean[] {false} ;
      T01PO2_A6116BarPieImp = new String[] {""} ;
      T01PO2_n6116BarPieImp = new boolean[] {false} ;
      T01PO2_A6489BarPieIdPz = new String[] {""} ;
      T01PO2_n6489BarPieIdPz = new boolean[] {false} ;
      T01PO2_A8707BapieObs = new String[] {""} ;
      T01PO2_n8707BapieObs = new boolean[] {false} ;
      T01PO2_A8838CodBarPz = new String[] {""} ;
      T01PO2_n8838CodBarPz = new boolean[] {false} ;
      T01PO2_A8907PzaB80 = new String[] {""} ;
      T01PO2_n8907PzaB80 = new boolean[] {false} ;
      T01PO2_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO2_n9795BarPieK1 = new boolean[] {false} ;
      T01PO2_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO2_n9796BarPieK2 = new boolean[] {false} ;
      T01PO2_A9798BarPz1 = new int[1] ;
      T01PO2_n9798BarPz1 = new boolean[] {false} ;
      T01PO2_A9799BarPz2 = new int[1] ;
      T01PO2_n9799BarPz2 = new boolean[] {false} ;
      T01PO2_A9800BarNPes = new byte[1] ;
      T01PO2_n9800BarNPes = new boolean[] {false} ;
      T01PO2_A9846BarPieAncc = new short[1] ;
      T01PO2_n9846BarPieAncc = new boolean[] {false} ;
      T01PO2_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO2_n9984BarPiePda = new boolean[] {false} ;
      T01PO2_A1919BarPieObs = new String[] {""} ;
      T01PO2_n1919BarPieObs = new boolean[] {false} ;
      T01PO2_A6472BarTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO2_n6472BarTara = new boolean[] {false} ;
      T01PO2_A6473BarUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PO2_n6473BarUniB = new boolean[] {false} ;
      T01PO2_A12113BarPieCLd = new byte[1] ;
      T01PO2_n12113BarPieCLd = new boolean[] {false} ;
      T01PO2_A12779BarPieFdv = new java.util.Date[] {GXutil.nullDate()} ;
      T01PO2_n12779BarPieFdv = new boolean[] {false} ;
      T01PO2_A12780BarPieUsu = new String[] {""} ;
      T01PO2_n12780BarPieUsu = new boolean[] {false} ;
      T01PO2_A12911BarPieFep = new java.util.Date[] {GXutil.nullDate()} ;
      T01PO2_n12911BarPieFep = new boolean[] {false} ;
      T01PO2_A12920BarPieColD = new String[] {""} ;
      T01PO2_n12920BarPieColD = new boolean[] {false} ;
      T01PO2_A12921BarPieColN = new int[1] ;
      T01PO2_n12921BarPieColN = new boolean[] {false} ;
      T01PO2_A12926BarPieCoCI = new String[] {""} ;
      T01PO2_n12926BarPieCoCI = new boolean[] {false} ;
      T01PO2_A12927BarPieCoCN = new int[1] ;
      T01PO2_n12927BarPieCoCN = new boolean[] {false} ;
      T01PO2_A12922BarPieArtI = new String[] {""} ;
      T01PO2_n12922BarPieArtI = new boolean[] {false} ;
      T01PO2_A12923BarPieArtD = new String[] {""} ;
      T01PO2_n12923BarPieArtD = new boolean[] {false} ;
      T01PO2_A12924BarPieCliI = new int[1] ;
      T01PO2_n12924BarPieCliI = new boolean[] {false} ;
      T01PO2_A12925BarPieCliN = new String[] {""} ;
      T01PO2_n12925BarPieCliN = new boolean[] {false} ;
      T01PO2_A12928BarPieEncC = new String[] {""} ;
      T01PO2_n12928BarPieEncC = new boolean[] {false} ;
      T01PO2_A12935BarPieTono = new String[] {""} ;
      T01PO2_n12935BarPieTono = new boolean[] {false} ;
      T01PO2_A12936BarPieSecu = new String[] {""} ;
      T01PO2_n12936BarPieSecu = new boolean[] {false} ;
      T01PO2_A12992BarPieOpe = new int[1] ;
      T01PO2_n12992BarPieOpe = new boolean[] {false} ;
      T01PO2_A13004BarPieDest = new byte[1] ;
      T01PO2_n13004BarPieDest = new boolean[] {false} ;
      T01PO2_A13107BarPieEmp = new short[1] ;
      T01PO2_n13107BarPieEmp = new boolean[] {false} ;
      T01PO2_A13108BarPieLote = new String[] {""} ;
      T01PO2_n13108BarPieLote = new boolean[] {false} ;
      T01PO2_A13109BarPieST = new String[] {""} ;
      T01PO2_n13109BarPieST = new boolean[] {false} ;
      T01PO2_A13518BarPieTurn = new byte[1] ;
      T01PO2_n13518BarPieTurn = new boolean[] {false} ;
      T01PO2_A13519BarPieMq = new String[] {""} ;
      T01PO2_n13519BarPieMq = new boolean[] {false} ;
      T01PO2_A396EmprCod = new String[] {""} ;
      T01PO2_A44AlbRecCod = new int[1] ;
      T01PO2_A129BarCod = new int[1] ;
      T01PO2_A132BarCodReo = new byte[1] ;
      T01PO2_A130BarCodPar = new String[] {""} ;
      T01PO15_A396EmprCod = new String[] {""} ;
      T01PO15_A129BarCod = new int[1] ;
      T01PO15_A132BarCodReo = new byte[1] ;
      T01PO15_A130BarCodPar = new String[] {""} ;
      T01PO15_A200BarPieCod = new String[] {""} ;
      T01PO15_A12913BarPieLDf = new short[1] ;
      T01PO16_A396EmprCod = new String[] {""} ;
      T01PO16_A129BarCod = new int[1] ;
      T01PO16_A132BarCodReo = new byte[1] ;
      T01PO16_A130BarCodPar = new String[] {""} ;
      T01PO16_A200BarPieCod = new String[] {""} ;
      T01PO16_A3858BarTroCod = new short[1] ;
      T01PO17_A396EmprCod = new String[] {""} ;
      T01PO17_A30AlbProCod = new long[1] ;
      T01PO17_A129BarCod = new int[1] ;
      T01PO17_A132BarCodReo = new byte[1] ;
      T01PO17_A130BarCodPar = new String[] {""} ;
      T01PO17_A200BarPieCod = new String[] {""} ;
      T01PO18_A396EmprCod = new String[] {""} ;
      T01PO18_A129BarCod = new int[1] ;
      T01PO18_A132BarCodReo = new byte[1] ;
      T01PO18_A130BarCodPar = new String[] {""} ;
      T01PO18_A200BarPieCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01PO19_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ200BarPieCod = "" ;
      ZZ203BarPieKil = DecimalUtil.ZERO ;
      ZZ205BarPieMet = DecimalUtil.ZERO ;
      ZZ170BarKilLan = DecimalUtil.ZERO ;
      ZZ183BarMetLan = DecimalUtil.ZERO ;
      ZZ908PieOriCod = "" ;
      ZZ2186BarPieLoc = "" ;
      ZZ3275BarKgsAut = DecimalUtil.ZERO ;
      ZZ3276BarMtsAut = DecimalUtil.ZERO ;
      ZZ6116BarPieImp = "" ;
      ZZ6489BarPieIdPz = "" ;
      ZZ8707BapieObs = "" ;
      ZZ8838CodBarPz = "" ;
      ZZ8907PzaB80 = "" ;
      ZZ9795BarPieK1 = DecimalUtil.ZERO ;
      ZZ9796BarPieK2 = DecimalUtil.ZERO ;
      ZZ9984BarPiePda = DecimalUtil.ZERO ;
      ZZ1919BarPieObs = "" ;
      ZZ6472BarTara = DecimalUtil.ZERO ;
      ZZ6473BarUniB = DecimalUtil.ZERO ;
      ZZ12779BarPieFdv = GXutil.nullDate() ;
      ZZ12780BarPieUsu = "" ;
      ZZ12911BarPieFep = GXutil.nullDate() ;
      ZZ12920BarPieColD = "" ;
      ZZ12926BarPieCoCI = "" ;
      ZZ12922BarPieArtI = "" ;
      ZZ12923BarPieArtD = "" ;
      ZZ12925BarPieCliN = "" ;
      ZZ12928BarPieEncC = "" ;
      ZZ12935BarPieTono = "" ;
      ZZ12936BarPieSecu = "" ;
      ZZ13108BarPieLote = "" ;
      ZZ13109BarPieST = "" ;
      ZZ13519BarPieMq = "" ;
      T01PO20_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.barpie__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.barpie__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.barpie__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.barpie__default(),
         new Object[] {
             new Object[] {
            T01PO2_A200BarPieCod, T01PO2_A203BarPieKil, T01PO2_A205BarPieMet, T01PO2_A201BarPieEst, T01PO2_A170BarKilLan, T01PO2_A183BarMetLan, T01PO2_A197BarPConTro, T01PO2_A908PieOriCod, T01PO2_A1271BarPieLzd, T01PO2_A1501BarPiePie,
            T01PO2_A2186BarPieLoc, T01PO2_n2186BarPieLoc, T01PO2_A1691BarPieAnc, T01PO2_n1691BarPieAnc, T01PO2_A3275BarKgsAut, T01PO2_n3275BarKgsAut, T01PO2_A3276BarMtsAut, T01PO2_n3276BarMtsAut, T01PO2_A3277BarPieAut, T01PO2_n3277BarPieAut,
            T01PO2_A6116BarPieImp, T01PO2_n6116BarPieImp, T01PO2_A6489BarPieIdPz, T01PO2_n6489BarPieIdPz, T01PO2_A8707BapieObs, T01PO2_n8707BapieObs, T01PO2_A8838CodBarPz, T01PO2_n8838CodBarPz, T01PO2_A8907PzaB80, T01PO2_n8907PzaB80,
            T01PO2_A9795BarPieK1, T01PO2_n9795BarPieK1, T01PO2_A9796BarPieK2, T01PO2_n9796BarPieK2, T01PO2_A9798BarPz1, T01PO2_n9798BarPz1, T01PO2_A9799BarPz2, T01PO2_n9799BarPz2, T01PO2_A9800BarNPes, T01PO2_n9800BarNPes,
            T01PO2_A9846BarPieAncc, T01PO2_n9846BarPieAncc, T01PO2_A9984BarPiePda, T01PO2_n9984BarPiePda, T01PO2_A1919BarPieObs, T01PO2_n1919BarPieObs, T01PO2_A6472BarTara, T01PO2_n6472BarTara, T01PO2_A6473BarUniB, T01PO2_n6473BarUniB,
            T01PO2_A12113BarPieCLd, T01PO2_n12113BarPieCLd, T01PO2_A12779BarPieFdv, T01PO2_n12779BarPieFdv, T01PO2_A12780BarPieUsu, T01PO2_n12780BarPieUsu, T01PO2_A12911BarPieFep, T01PO2_n12911BarPieFep, T01PO2_A12920BarPieColD, T01PO2_n12920BarPieColD,
            T01PO2_A12921BarPieColN, T01PO2_n12921BarPieColN, T01PO2_A12926BarPieCoCI, T01PO2_n12926BarPieCoCI, T01PO2_A12927BarPieCoCN, T01PO2_n12927BarPieCoCN, T01PO2_A12922BarPieArtI, T01PO2_n12922BarPieArtI, T01PO2_A12923BarPieArtD, T01PO2_n12923BarPieArtD,
            T01PO2_A12924BarPieCliI, T01PO2_n12924BarPieCliI, T01PO2_A12925BarPieCliN, T01PO2_n12925BarPieCliN, T01PO2_A12928BarPieEncC, T01PO2_n12928BarPieEncC, T01PO2_A12935BarPieTono, T01PO2_n12935BarPieTono, T01PO2_A12936BarPieSecu, T01PO2_n12936BarPieSecu,
            T01PO2_A12992BarPieOpe, T01PO2_n12992BarPieOpe, T01PO2_A13004BarPieDest, T01PO2_n13004BarPieDest, T01PO2_A13107BarPieEmp, T01PO2_n13107BarPieEmp, T01PO2_A13108BarPieLote, T01PO2_n13108BarPieLote, T01PO2_A13109BarPieST, T01PO2_n13109BarPieST,
            T01PO2_A13518BarPieTurn, T01PO2_n13518BarPieTurn, T01PO2_A13519BarPieMq, T01PO2_n13519BarPieMq, T01PO2_A396EmprCod, T01PO2_A44AlbRecCod, T01PO2_A129BarCod, T01PO2_A132BarCodReo, T01PO2_A130BarCodPar
            }
            , new Object[] {
            T01PO3_A200BarPieCod, T01PO3_A203BarPieKil, T01PO3_A205BarPieMet, T01PO3_A201BarPieEst, T01PO3_A170BarKilLan, T01PO3_A183BarMetLan, T01PO3_A197BarPConTro, T01PO3_A908PieOriCod, T01PO3_A1271BarPieLzd, T01PO3_A1501BarPiePie,
            T01PO3_A2186BarPieLoc, T01PO3_n2186BarPieLoc, T01PO3_A1691BarPieAnc, T01PO3_n1691BarPieAnc, T01PO3_A3275BarKgsAut, T01PO3_n3275BarKgsAut, T01PO3_A3276BarMtsAut, T01PO3_n3276BarMtsAut, T01PO3_A3277BarPieAut, T01PO3_n3277BarPieAut,
            T01PO3_A6116BarPieImp, T01PO3_n6116BarPieImp, T01PO3_A6489BarPieIdPz, T01PO3_n6489BarPieIdPz, T01PO3_A8707BapieObs, T01PO3_n8707BapieObs, T01PO3_A8838CodBarPz, T01PO3_n8838CodBarPz, T01PO3_A8907PzaB80, T01PO3_n8907PzaB80,
            T01PO3_A9795BarPieK1, T01PO3_n9795BarPieK1, T01PO3_A9796BarPieK2, T01PO3_n9796BarPieK2, T01PO3_A9798BarPz1, T01PO3_n9798BarPz1, T01PO3_A9799BarPz2, T01PO3_n9799BarPz2, T01PO3_A9800BarNPes, T01PO3_n9800BarNPes,
            T01PO3_A9846BarPieAncc, T01PO3_n9846BarPieAncc, T01PO3_A9984BarPiePda, T01PO3_n9984BarPiePda, T01PO3_A1919BarPieObs, T01PO3_n1919BarPieObs, T01PO3_A6472BarTara, T01PO3_n6472BarTara, T01PO3_A6473BarUniB, T01PO3_n6473BarUniB,
            T01PO3_A12113BarPieCLd, T01PO3_n12113BarPieCLd, T01PO3_A12779BarPieFdv, T01PO3_n12779BarPieFdv, T01PO3_A12780BarPieUsu, T01PO3_n12780BarPieUsu, T01PO3_A12911BarPieFep, T01PO3_n12911BarPieFep, T01PO3_A12920BarPieColD, T01PO3_n12920BarPieColD,
            T01PO3_A12921BarPieColN, T01PO3_n12921BarPieColN, T01PO3_A12926BarPieCoCI, T01PO3_n12926BarPieCoCI, T01PO3_A12927BarPieCoCN, T01PO3_n12927BarPieCoCN, T01PO3_A12922BarPieArtI, T01PO3_n12922BarPieArtI, T01PO3_A12923BarPieArtD, T01PO3_n12923BarPieArtD,
            T01PO3_A12924BarPieCliI, T01PO3_n12924BarPieCliI, T01PO3_A12925BarPieCliN, T01PO3_n12925BarPieCliN, T01PO3_A12928BarPieEncC, T01PO3_n12928BarPieEncC, T01PO3_A12935BarPieTono, T01PO3_n12935BarPieTono, T01PO3_A12936BarPieSecu, T01PO3_n12936BarPieSecu,
            T01PO3_A12992BarPieOpe, T01PO3_n12992BarPieOpe, T01PO3_A13004BarPieDest, T01PO3_n13004BarPieDest, T01PO3_A13107BarPieEmp, T01PO3_n13107BarPieEmp, T01PO3_A13108BarPieLote, T01PO3_n13108BarPieLote, T01PO3_A13109BarPieST, T01PO3_n13109BarPieST,
            T01PO3_A13518BarPieTurn, T01PO3_n13518BarPieTurn, T01PO3_A13519BarPieMq, T01PO3_n13519BarPieMq, T01PO3_A396EmprCod, T01PO3_A44AlbRecCod, T01PO3_A129BarCod, T01PO3_A132BarCodReo, T01PO3_A130BarCodPar
            }
            , new Object[] {
            T01PO4_A396EmprCod
            }
            , new Object[] {
            T01PO5_A396EmprCod
            }
            , new Object[] {
            T01PO6_A200BarPieCod, T01PO6_A203BarPieKil, T01PO6_A205BarPieMet, T01PO6_A201BarPieEst, T01PO6_A170BarKilLan, T01PO6_A183BarMetLan, T01PO6_A197BarPConTro, T01PO6_A908PieOriCod, T01PO6_A1271BarPieLzd, T01PO6_A1501BarPiePie,
            T01PO6_A2186BarPieLoc, T01PO6_n2186BarPieLoc, T01PO6_A1691BarPieAnc, T01PO6_n1691BarPieAnc, T01PO6_A3275BarKgsAut, T01PO6_n3275BarKgsAut, T01PO6_A3276BarMtsAut, T01PO6_n3276BarMtsAut, T01PO6_A3277BarPieAut, T01PO6_n3277BarPieAut,
            T01PO6_A6116BarPieImp, T01PO6_n6116BarPieImp, T01PO6_A6489BarPieIdPz, T01PO6_n6489BarPieIdPz, T01PO6_A8707BapieObs, T01PO6_n8707BapieObs, T01PO6_A8838CodBarPz, T01PO6_n8838CodBarPz, T01PO6_A8907PzaB80, T01PO6_n8907PzaB80,
            T01PO6_A9795BarPieK1, T01PO6_n9795BarPieK1, T01PO6_A9796BarPieK2, T01PO6_n9796BarPieK2, T01PO6_A9798BarPz1, T01PO6_n9798BarPz1, T01PO6_A9799BarPz2, T01PO6_n9799BarPz2, T01PO6_A9800BarNPes, T01PO6_n9800BarNPes,
            T01PO6_A9846BarPieAncc, T01PO6_n9846BarPieAncc, T01PO6_A9984BarPiePda, T01PO6_n9984BarPiePda, T01PO6_A1919BarPieObs, T01PO6_n1919BarPieObs, T01PO6_A6472BarTara, T01PO6_n6472BarTara, T01PO6_A6473BarUniB, T01PO6_n6473BarUniB,
            T01PO6_A12113BarPieCLd, T01PO6_n12113BarPieCLd, T01PO6_A12779BarPieFdv, T01PO6_n12779BarPieFdv, T01PO6_A12780BarPieUsu, T01PO6_n12780BarPieUsu, T01PO6_A12911BarPieFep, T01PO6_n12911BarPieFep, T01PO6_A12920BarPieColD, T01PO6_n12920BarPieColD,
            T01PO6_A12921BarPieColN, T01PO6_n12921BarPieColN, T01PO6_A12926BarPieCoCI, T01PO6_n12926BarPieCoCI, T01PO6_A12927BarPieCoCN, T01PO6_n12927BarPieCoCN, T01PO6_A12922BarPieArtI, T01PO6_n12922BarPieArtI, T01PO6_A12923BarPieArtD, T01PO6_n12923BarPieArtD,
            T01PO6_A12924BarPieCliI, T01PO6_n12924BarPieCliI, T01PO6_A12925BarPieCliN, T01PO6_n12925BarPieCliN, T01PO6_A12928BarPieEncC, T01PO6_n12928BarPieEncC, T01PO6_A12935BarPieTono, T01PO6_n12935BarPieTono, T01PO6_A12936BarPieSecu, T01PO6_n12936BarPieSecu,
            T01PO6_A12992BarPieOpe, T01PO6_n12992BarPieOpe, T01PO6_A13004BarPieDest, T01PO6_n13004BarPieDest, T01PO6_A13107BarPieEmp, T01PO6_n13107BarPieEmp, T01PO6_A13108BarPieLote, T01PO6_n13108BarPieLote, T01PO6_A13109BarPieST, T01PO6_n13109BarPieST,
            T01PO6_A13518BarPieTurn, T01PO6_n13518BarPieTurn, T01PO6_A13519BarPieMq, T01PO6_n13519BarPieMq, T01PO6_A396EmprCod, T01PO6_A44AlbRecCod, T01PO6_A129BarCod, T01PO6_A132BarCodReo, T01PO6_A130BarCodPar
            }
            , new Object[] {
            T01PO7_A396EmprCod
            }
            , new Object[] {
            T01PO8_A396EmprCod
            }
            , new Object[] {
            T01PO9_A396EmprCod, T01PO9_A129BarCod, T01PO9_A132BarCodReo, T01PO9_A130BarCodPar, T01PO9_A200BarPieCod
            }
            , new Object[] {
            T01PO10_A396EmprCod, T01PO10_A129BarCod, T01PO10_A132BarCodReo, T01PO10_A130BarCodPar, T01PO10_A200BarPieCod
            }
            , new Object[] {
            T01PO11_A396EmprCod, T01PO11_A129BarCod, T01PO11_A132BarCodReo, T01PO11_A130BarCodPar, T01PO11_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PO15_A396EmprCod, T01PO15_A129BarCod, T01PO15_A132BarCodReo, T01PO15_A130BarCodPar, T01PO15_A200BarPieCod, T01PO15_A12913BarPieLDf
            }
            , new Object[] {
            T01PO16_A396EmprCod, T01PO16_A129BarCod, T01PO16_A132BarCodReo, T01PO16_A130BarCodPar, T01PO16_A200BarPieCod, T01PO16_A3858BarTroCod
            }
            , new Object[] {
            T01PO17_A396EmprCod, T01PO17_A30AlbProCod, T01PO17_A129BarCod, T01PO17_A132BarCodReo, T01PO17_A130BarCodPar, T01PO17_A200BarPieCod
            }
            , new Object[] {
            T01PO18_A396EmprCod, T01PO18_A129BarCod, T01PO18_A132BarCodReo, T01PO18_A130BarCodPar, T01PO18_A200BarPieCod
            }
            , new Object[] {
            T01PO19_A396EmprCod
            }
            , new Object[] {
            T01PO20_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z201BarPieEst ;
   private byte Z9800BarNPes ;
   private byte Z12113BarPieCLd ;
   private byte Z13004BarPieDest ;
   private byte Z13518BarPieTurn ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A201BarPieEst ;
   private byte A9800BarNPes ;
   private byte A12113BarPieCLd ;
   private byte A13004BarPieDest ;
   private byte A13518BarPieTurn ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private byte ZZ201BarPieEst ;
   private byte ZZ9800BarNPes ;
   private byte ZZ12113BarPieCLd ;
   private byte ZZ13004BarPieDest ;
   private byte ZZ13518BarPieTurn ;
   private short Z197BarPConTro ;
   private short Z1691BarPieAnc ;
   private short Z3277BarPieAut ;
   private short Z9846BarPieAncc ;
   private short Z13107BarPieEmp ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A197BarPConTro ;
   private short A1691BarPieAnc ;
   private short A3277BarPieAut ;
   private short A9846BarPieAncc ;
   private short A13107BarPieEmp ;
   private short RcdFound18 ;
   private short nIsDirty_18 ;
   private short ZZ197BarPConTro ;
   private short ZZ1691BarPieAnc ;
   private short ZZ3277BarPieAut ;
   private short ZZ9846BarPieAncc ;
   private short ZZ13107BarPieEmp ;
   private int Z129BarCod ;
   private int Z1271BarPieLzd ;
   private int Z1501BarPiePie ;
   private int Z9798BarPz1 ;
   private int Z9799BarPz2 ;
   private int Z12921BarPieColN ;
   private int Z12927BarPieCoCN ;
   private int Z12924BarPieCliI ;
   private int Z12992BarPieOpe ;
   private int Z44AlbRecCod ;
   private int A44AlbRecCod ;
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
   private int edtBarPieCod_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtBarPieKil_Enabled ;
   private int edtBarPieMet_Enabled ;
   private int edtBarPieEst_Enabled ;
   private int edtBarKilLan_Enabled ;
   private int edtBarMetLan_Enabled ;
   private int edtBarPConTro_Enabled ;
   private int edtPieOriCod_Enabled ;
   private int A1271BarPieLzd ;
   private int edtBarPieLzd_Enabled ;
   private int A1501BarPiePie ;
   private int edtBarPiePie_Enabled ;
   private int edtBarPieLoc_Enabled ;
   private int edtBarPieAnc_Enabled ;
   private int edtBarKgsAut_Enabled ;
   private int edtBarMtsAut_Enabled ;
   private int edtBarPieAut_Enabled ;
   private int edtBarPieImp_Enabled ;
   private int edtBarPieIdPz_Enabled ;
   private int edtBapieObs_Enabled ;
   private int edtCodBarPz_Enabled ;
   private int edtPzaB80_Enabled ;
   private int edtBarPieK1_Enabled ;
   private int edtBarPieK2_Enabled ;
   private int A9798BarPz1 ;
   private int edtBarPz1_Enabled ;
   private int A9799BarPz2 ;
   private int edtBarPz2_Enabled ;
   private int edtBarNPes_Enabled ;
   private int edtBarPieAncc_Enabled ;
   private int edtBarPiePda_Enabled ;
   private int edtBarPieObs_Enabled ;
   private int edtBarTara_Enabled ;
   private int edtBarUniB_Enabled ;
   private int edtBarPieCLd_Enabled ;
   private int edtBarPieFdv_Enabled ;
   private int edtBarPieUsu_Enabled ;
   private int edtBarPieFep_Enabled ;
   private int edtBarPieColD_Enabled ;
   private int A12921BarPieColN ;
   private int edtBarPieColN_Enabled ;
   private int edtBarPieCoCI_Enabled ;
   private int A12927BarPieCoCN ;
   private int edtBarPieCoCN_Enabled ;
   private int edtBarPieArtI_Enabled ;
   private int edtBarPieArtD_Enabled ;
   private int A12924BarPieCliI ;
   private int edtBarPieCliI_Enabled ;
   private int edtBarPieCliN_Enabled ;
   private int edtBarPieEncC_Enabled ;
   private int edtBarPieTono_Enabled ;
   private int edtBarPieSecu_Enabled ;
   private int A12992BarPieOpe ;
   private int edtBarPieOpe_Enabled ;
   private int edtBarPieDest_Enabled ;
   private int edtBarPieEmp_Enabled ;
   private int edtBarPieLote_Enabled ;
   private int edtBarPieST_Enabled ;
   private int edtBarPieTurn_Enabled ;
   private int edtBarPieMq_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ129BarCod ;
   private int ZZ44AlbRecCod ;
   private int ZZ1271BarPieLzd ;
   private int ZZ1501BarPiePie ;
   private int ZZ9798BarPz1 ;
   private int ZZ9799BarPz2 ;
   private int ZZ12921BarPieColN ;
   private int ZZ12927BarPieCoCN ;
   private int ZZ12924BarPieCliI ;
   private int ZZ12992BarPieOpe ;
   private java.math.BigDecimal Z203BarPieKil ;
   private java.math.BigDecimal Z205BarPieMet ;
   private java.math.BigDecimal Z170BarKilLan ;
   private java.math.BigDecimal Z183BarMetLan ;
   private java.math.BigDecimal Z3275BarKgsAut ;
   private java.math.BigDecimal Z3276BarMtsAut ;
   private java.math.BigDecimal Z9795BarPieK1 ;
   private java.math.BigDecimal Z9796BarPieK2 ;
   private java.math.BigDecimal Z9984BarPiePda ;
   private java.math.BigDecimal Z6472BarTara ;
   private java.math.BigDecimal Z6473BarUniB ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A9795BarPieK1 ;
   private java.math.BigDecimal A9796BarPieK2 ;
   private java.math.BigDecimal A9984BarPiePda ;
   private java.math.BigDecimal A6472BarTara ;
   private java.math.BigDecimal A6473BarUniB ;
   private java.math.BigDecimal ZZ203BarPieKil ;
   private java.math.BigDecimal ZZ205BarPieMet ;
   private java.math.BigDecimal ZZ170BarKilLan ;
   private java.math.BigDecimal ZZ183BarMetLan ;
   private java.math.BigDecimal ZZ3275BarKgsAut ;
   private java.math.BigDecimal ZZ3276BarMtsAut ;
   private java.math.BigDecimal ZZ9795BarPieK1 ;
   private java.math.BigDecimal ZZ9796BarPieK2 ;
   private java.math.BigDecimal ZZ9984BarPiePda ;
   private java.math.BigDecimal ZZ6472BarTara ;
   private java.math.BigDecimal ZZ6473BarUniB ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z200BarPieCod ;
   private String Z908PieOriCod ;
   private String Z2186BarPieLoc ;
   private String Z6116BarPieImp ;
   private String Z6489BarPieIdPz ;
   private String Z8707BapieObs ;
   private String Z8838CodBarPz ;
   private String Z8907PzaB80 ;
   private String Z1919BarPieObs ;
   private String Z12780BarPieUsu ;
   private String Z12920BarPieColD ;
   private String Z12926BarPieCoCI ;
   private String Z12922BarPieArtI ;
   private String Z12923BarPieArtD ;
   private String Z12925BarPieCliN ;
   private String Z12928BarPieEncC ;
   private String Z12935BarPieTono ;
   private String Z12936BarPieSecu ;
   private String Z13108BarPieLote ;
   private String Z13109BarPieST ;
   private String Z13519BarPieMq ;
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
   private String edtBarPieCod_Internalname ;
   private String A200BarPieCod ;
   private String edtBarPieCod_Jsonclick ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtBarPieKil_Internalname ;
   private String edtBarPieKil_Jsonclick ;
   private String edtBarPieMet_Internalname ;
   private String edtBarPieMet_Jsonclick ;
   private String edtBarPieEst_Internalname ;
   private String edtBarPieEst_Jsonclick ;
   private String edtBarKilLan_Internalname ;
   private String edtBarKilLan_Jsonclick ;
   private String edtBarMetLan_Internalname ;
   private String edtBarMetLan_Jsonclick ;
   private String edtBarPConTro_Internalname ;
   private String edtBarPConTro_Jsonclick ;
   private String edtPieOriCod_Internalname ;
   private String A908PieOriCod ;
   private String edtPieOriCod_Jsonclick ;
   private String edtBarPieLzd_Internalname ;
   private String edtBarPieLzd_Jsonclick ;
   private String edtBarPiePie_Internalname ;
   private String edtBarPiePie_Jsonclick ;
   private String edtBarPieLoc_Internalname ;
   private String A2186BarPieLoc ;
   private String edtBarPieLoc_Jsonclick ;
   private String edtBarPieAnc_Internalname ;
   private String edtBarPieAnc_Jsonclick ;
   private String edtBarKgsAut_Internalname ;
   private String edtBarKgsAut_Jsonclick ;
   private String edtBarMtsAut_Internalname ;
   private String edtBarMtsAut_Jsonclick ;
   private String edtBarPieAut_Internalname ;
   private String edtBarPieAut_Jsonclick ;
   private String edtBarPieImp_Internalname ;
   private String A6116BarPieImp ;
   private String edtBarPieImp_Jsonclick ;
   private String edtBarPieIdPz_Internalname ;
   private String A6489BarPieIdPz ;
   private String edtBarPieIdPz_Jsonclick ;
   private String edtBapieObs_Internalname ;
   private String A8707BapieObs ;
   private String edtBapieObs_Jsonclick ;
   private String edtCodBarPz_Internalname ;
   private String A8838CodBarPz ;
   private String edtCodBarPz_Jsonclick ;
   private String edtPzaB80_Internalname ;
   private String A8907PzaB80 ;
   private String edtPzaB80_Jsonclick ;
   private String edtBarPieK1_Internalname ;
   private String edtBarPieK1_Jsonclick ;
   private String edtBarPieK2_Internalname ;
   private String edtBarPieK2_Jsonclick ;
   private String edtBarPz1_Internalname ;
   private String edtBarPz1_Jsonclick ;
   private String edtBarPz2_Internalname ;
   private String edtBarPz2_Jsonclick ;
   private String edtBarNPes_Internalname ;
   private String edtBarNPes_Jsonclick ;
   private String edtBarPieAncc_Internalname ;
   private String edtBarPieAncc_Jsonclick ;
   private String edtBarPiePda_Internalname ;
   private String edtBarPiePda_Jsonclick ;
   private String edtBarPieObs_Internalname ;
   private String A1919BarPieObs ;
   private String edtBarPieObs_Jsonclick ;
   private String edtBarTara_Internalname ;
   private String edtBarTara_Jsonclick ;
   private String edtBarUniB_Internalname ;
   private String edtBarUniB_Jsonclick ;
   private String edtBarPieCLd_Internalname ;
   private String edtBarPieCLd_Jsonclick ;
   private String edtBarPieFdv_Internalname ;
   private String edtBarPieFdv_Jsonclick ;
   private String edtBarPieUsu_Internalname ;
   private String A12780BarPieUsu ;
   private String edtBarPieUsu_Jsonclick ;
   private String edtBarPieFep_Internalname ;
   private String edtBarPieFep_Jsonclick ;
   private String edtBarPieColD_Internalname ;
   private String A12920BarPieColD ;
   private String edtBarPieColD_Jsonclick ;
   private String edtBarPieColN_Internalname ;
   private String edtBarPieColN_Jsonclick ;
   private String edtBarPieCoCI_Internalname ;
   private String A12926BarPieCoCI ;
   private String edtBarPieCoCI_Jsonclick ;
   private String edtBarPieCoCN_Internalname ;
   private String edtBarPieCoCN_Jsonclick ;
   private String edtBarPieArtI_Internalname ;
   private String A12922BarPieArtI ;
   private String edtBarPieArtI_Jsonclick ;
   private String edtBarPieArtD_Internalname ;
   private String A12923BarPieArtD ;
   private String edtBarPieArtD_Jsonclick ;
   private String edtBarPieCliI_Internalname ;
   private String edtBarPieCliI_Jsonclick ;
   private String edtBarPieCliN_Internalname ;
   private String A12925BarPieCliN ;
   private String edtBarPieCliN_Jsonclick ;
   private String edtBarPieEncC_Internalname ;
   private String A12928BarPieEncC ;
   private String edtBarPieEncC_Jsonclick ;
   private String edtBarPieTono_Internalname ;
   private String A12935BarPieTono ;
   private String edtBarPieTono_Jsonclick ;
   private String edtBarPieSecu_Internalname ;
   private String A12936BarPieSecu ;
   private String edtBarPieSecu_Jsonclick ;
   private String edtBarPieOpe_Internalname ;
   private String edtBarPieOpe_Jsonclick ;
   private String edtBarPieDest_Internalname ;
   private String edtBarPieDest_Jsonclick ;
   private String edtBarPieEmp_Internalname ;
   private String edtBarPieEmp_Jsonclick ;
   private String edtBarPieLote_Internalname ;
   private String A13108BarPieLote ;
   private String edtBarPieLote_Jsonclick ;
   private String edtBarPieST_Internalname ;
   private String A13109BarPieST ;
   private String edtBarPieST_Jsonclick ;
   private String edtBarPieTurn_Internalname ;
   private String edtBarPieTurn_Jsonclick ;
   private String edtBarPieMq_Internalname ;
   private String A13519BarPieMq ;
   private String edtBarPieMq_Jsonclick ;
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
   private String sMode18 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ200BarPieCod ;
   private String ZZ908PieOriCod ;
   private String ZZ2186BarPieLoc ;
   private String ZZ6116BarPieImp ;
   private String ZZ6489BarPieIdPz ;
   private String ZZ8707BapieObs ;
   private String ZZ8838CodBarPz ;
   private String ZZ8907PzaB80 ;
   private String ZZ1919BarPieObs ;
   private String ZZ12780BarPieUsu ;
   private String ZZ12920BarPieColD ;
   private String ZZ12926BarPieCoCI ;
   private String ZZ12922BarPieArtI ;
   private String ZZ12923BarPieArtD ;
   private String ZZ12925BarPieCliN ;
   private String ZZ12928BarPieEncC ;
   private String ZZ12935BarPieTono ;
   private String ZZ12936BarPieSecu ;
   private String ZZ13108BarPieLote ;
   private String ZZ13109BarPieST ;
   private String ZZ13519BarPieMq ;
   private java.util.Date Z12779BarPieFdv ;
   private java.util.Date Z12911BarPieFep ;
   private java.util.Date A12779BarPieFdv ;
   private java.util.Date A12911BarPieFep ;
   private java.util.Date ZZ12779BarPieFdv ;
   private java.util.Date ZZ12911BarPieFep ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n2186BarPieLoc ;
   private boolean n1691BarPieAnc ;
   private boolean n3275BarKgsAut ;
   private boolean n3276BarMtsAut ;
   private boolean n3277BarPieAut ;
   private boolean n6116BarPieImp ;
   private boolean n6489BarPieIdPz ;
   private boolean n8707BapieObs ;
   private boolean n8838CodBarPz ;
   private boolean n8907PzaB80 ;
   private boolean n9795BarPieK1 ;
   private boolean n9796BarPieK2 ;
   private boolean n9798BarPz1 ;
   private boolean n9799BarPz2 ;
   private boolean n9800BarNPes ;
   private boolean n9846BarPieAncc ;
   private boolean n9984BarPiePda ;
   private boolean n1919BarPieObs ;
   private boolean n6472BarTara ;
   private boolean n6473BarUniB ;
   private boolean n12113BarPieCLd ;
   private boolean n12779BarPieFdv ;
   private boolean n12780BarPieUsu ;
   private boolean n12911BarPieFep ;
   private boolean n12920BarPieColD ;
   private boolean n12921BarPieColN ;
   private boolean n12926BarPieCoCI ;
   private boolean n12927BarPieCoCN ;
   private boolean n12922BarPieArtI ;
   private boolean n12923BarPieArtD ;
   private boolean n12924BarPieCliI ;
   private boolean n12925BarPieCliN ;
   private boolean n12928BarPieEncC ;
   private boolean n12935BarPieTono ;
   private boolean n12936BarPieSecu ;
   private boolean n12992BarPieOpe ;
   private boolean n13004BarPieDest ;
   private boolean n13107BarPieEmp ;
   private boolean n13108BarPieLote ;
   private boolean n13109BarPieST ;
   private boolean n13518BarPieTurn ;
   private boolean n13519BarPieMq ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01PO6_A200BarPieCod ;
   private java.math.BigDecimal[] T01PO6_A203BarPieKil ;
   private java.math.BigDecimal[] T01PO6_A205BarPieMet ;
   private byte[] T01PO6_A201BarPieEst ;
   private java.math.BigDecimal[] T01PO6_A170BarKilLan ;
   private java.math.BigDecimal[] T01PO6_A183BarMetLan ;
   private short[] T01PO6_A197BarPConTro ;
   private String[] T01PO6_A908PieOriCod ;
   private int[] T01PO6_A1271BarPieLzd ;
   private int[] T01PO6_A1501BarPiePie ;
   private String[] T01PO6_A2186BarPieLoc ;
   private boolean[] T01PO6_n2186BarPieLoc ;
   private short[] T01PO6_A1691BarPieAnc ;
   private boolean[] T01PO6_n1691BarPieAnc ;
   private java.math.BigDecimal[] T01PO6_A3275BarKgsAut ;
   private boolean[] T01PO6_n3275BarKgsAut ;
   private java.math.BigDecimal[] T01PO6_A3276BarMtsAut ;
   private boolean[] T01PO6_n3276BarMtsAut ;
   private short[] T01PO6_A3277BarPieAut ;
   private boolean[] T01PO6_n3277BarPieAut ;
   private String[] T01PO6_A6116BarPieImp ;
   private boolean[] T01PO6_n6116BarPieImp ;
   private String[] T01PO6_A6489BarPieIdPz ;
   private boolean[] T01PO6_n6489BarPieIdPz ;
   private String[] T01PO6_A8707BapieObs ;
   private boolean[] T01PO6_n8707BapieObs ;
   private String[] T01PO6_A8838CodBarPz ;
   private boolean[] T01PO6_n8838CodBarPz ;
   private String[] T01PO6_A8907PzaB80 ;
   private boolean[] T01PO6_n8907PzaB80 ;
   private java.math.BigDecimal[] T01PO6_A9795BarPieK1 ;
   private boolean[] T01PO6_n9795BarPieK1 ;
   private java.math.BigDecimal[] T01PO6_A9796BarPieK2 ;
   private boolean[] T01PO6_n9796BarPieK2 ;
   private int[] T01PO6_A9798BarPz1 ;
   private boolean[] T01PO6_n9798BarPz1 ;
   private int[] T01PO6_A9799BarPz2 ;
   private boolean[] T01PO6_n9799BarPz2 ;
   private byte[] T01PO6_A9800BarNPes ;
   private boolean[] T01PO6_n9800BarNPes ;
   private short[] T01PO6_A9846BarPieAncc ;
   private boolean[] T01PO6_n9846BarPieAncc ;
   private java.math.BigDecimal[] T01PO6_A9984BarPiePda ;
   private boolean[] T01PO6_n9984BarPiePda ;
   private String[] T01PO6_A1919BarPieObs ;
   private boolean[] T01PO6_n1919BarPieObs ;
   private java.math.BigDecimal[] T01PO6_A6472BarTara ;
   private boolean[] T01PO6_n6472BarTara ;
   private java.math.BigDecimal[] T01PO6_A6473BarUniB ;
   private boolean[] T01PO6_n6473BarUniB ;
   private byte[] T01PO6_A12113BarPieCLd ;
   private boolean[] T01PO6_n12113BarPieCLd ;
   private java.util.Date[] T01PO6_A12779BarPieFdv ;
   private boolean[] T01PO6_n12779BarPieFdv ;
   private String[] T01PO6_A12780BarPieUsu ;
   private boolean[] T01PO6_n12780BarPieUsu ;
   private java.util.Date[] T01PO6_A12911BarPieFep ;
   private boolean[] T01PO6_n12911BarPieFep ;
   private String[] T01PO6_A12920BarPieColD ;
   private boolean[] T01PO6_n12920BarPieColD ;
   private int[] T01PO6_A12921BarPieColN ;
   private boolean[] T01PO6_n12921BarPieColN ;
   private String[] T01PO6_A12926BarPieCoCI ;
   private boolean[] T01PO6_n12926BarPieCoCI ;
   private int[] T01PO6_A12927BarPieCoCN ;
   private boolean[] T01PO6_n12927BarPieCoCN ;
   private String[] T01PO6_A12922BarPieArtI ;
   private boolean[] T01PO6_n12922BarPieArtI ;
   private String[] T01PO6_A12923BarPieArtD ;
   private boolean[] T01PO6_n12923BarPieArtD ;
   private int[] T01PO6_A12924BarPieCliI ;
   private boolean[] T01PO6_n12924BarPieCliI ;
   private String[] T01PO6_A12925BarPieCliN ;
   private boolean[] T01PO6_n12925BarPieCliN ;
   private String[] T01PO6_A12928BarPieEncC ;
   private boolean[] T01PO6_n12928BarPieEncC ;
   private String[] T01PO6_A12935BarPieTono ;
   private boolean[] T01PO6_n12935BarPieTono ;
   private String[] T01PO6_A12936BarPieSecu ;
   private boolean[] T01PO6_n12936BarPieSecu ;
   private int[] T01PO6_A12992BarPieOpe ;
   private boolean[] T01PO6_n12992BarPieOpe ;
   private byte[] T01PO6_A13004BarPieDest ;
   private boolean[] T01PO6_n13004BarPieDest ;
   private short[] T01PO6_A13107BarPieEmp ;
   private boolean[] T01PO6_n13107BarPieEmp ;
   private String[] T01PO6_A13108BarPieLote ;
   private boolean[] T01PO6_n13108BarPieLote ;
   private String[] T01PO6_A13109BarPieST ;
   private boolean[] T01PO6_n13109BarPieST ;
   private byte[] T01PO6_A13518BarPieTurn ;
   private boolean[] T01PO6_n13518BarPieTurn ;
   private String[] T01PO6_A13519BarPieMq ;
   private boolean[] T01PO6_n13519BarPieMq ;
   private String[] T01PO6_A396EmprCod ;
   private int[] T01PO6_A44AlbRecCod ;
   private int[] T01PO6_A129BarCod ;
   private byte[] T01PO6_A132BarCodReo ;
   private String[] T01PO6_A130BarCodPar ;
   private String[] T01PO4_A396EmprCod ;
   private String[] T01PO5_A396EmprCod ;
   private String[] T01PO7_A396EmprCod ;
   private String[] T01PO8_A396EmprCod ;
   private String[] T01PO9_A396EmprCod ;
   private int[] T01PO9_A129BarCod ;
   private byte[] T01PO9_A132BarCodReo ;
   private String[] T01PO9_A130BarCodPar ;
   private String[] T01PO9_A200BarPieCod ;
   private String[] T01PO3_A200BarPieCod ;
   private java.math.BigDecimal[] T01PO3_A203BarPieKil ;
   private java.math.BigDecimal[] T01PO3_A205BarPieMet ;
   private byte[] T01PO3_A201BarPieEst ;
   private java.math.BigDecimal[] T01PO3_A170BarKilLan ;
   private java.math.BigDecimal[] T01PO3_A183BarMetLan ;
   private short[] T01PO3_A197BarPConTro ;
   private String[] T01PO3_A908PieOriCod ;
   private int[] T01PO3_A1271BarPieLzd ;
   private int[] T01PO3_A1501BarPiePie ;
   private String[] T01PO3_A2186BarPieLoc ;
   private boolean[] T01PO3_n2186BarPieLoc ;
   private short[] T01PO3_A1691BarPieAnc ;
   private boolean[] T01PO3_n1691BarPieAnc ;
   private java.math.BigDecimal[] T01PO3_A3275BarKgsAut ;
   private boolean[] T01PO3_n3275BarKgsAut ;
   private java.math.BigDecimal[] T01PO3_A3276BarMtsAut ;
   private boolean[] T01PO3_n3276BarMtsAut ;
   private short[] T01PO3_A3277BarPieAut ;
   private boolean[] T01PO3_n3277BarPieAut ;
   private String[] T01PO3_A6116BarPieImp ;
   private boolean[] T01PO3_n6116BarPieImp ;
   private String[] T01PO3_A6489BarPieIdPz ;
   private boolean[] T01PO3_n6489BarPieIdPz ;
   private String[] T01PO3_A8707BapieObs ;
   private boolean[] T01PO3_n8707BapieObs ;
   private String[] T01PO3_A8838CodBarPz ;
   private boolean[] T01PO3_n8838CodBarPz ;
   private String[] T01PO3_A8907PzaB80 ;
   private boolean[] T01PO3_n8907PzaB80 ;
   private java.math.BigDecimal[] T01PO3_A9795BarPieK1 ;
   private boolean[] T01PO3_n9795BarPieK1 ;
   private java.math.BigDecimal[] T01PO3_A9796BarPieK2 ;
   private boolean[] T01PO3_n9796BarPieK2 ;
   private int[] T01PO3_A9798BarPz1 ;
   private boolean[] T01PO3_n9798BarPz1 ;
   private int[] T01PO3_A9799BarPz2 ;
   private boolean[] T01PO3_n9799BarPz2 ;
   private byte[] T01PO3_A9800BarNPes ;
   private boolean[] T01PO3_n9800BarNPes ;
   private short[] T01PO3_A9846BarPieAncc ;
   private boolean[] T01PO3_n9846BarPieAncc ;
   private java.math.BigDecimal[] T01PO3_A9984BarPiePda ;
   private boolean[] T01PO3_n9984BarPiePda ;
   private String[] T01PO3_A1919BarPieObs ;
   private boolean[] T01PO3_n1919BarPieObs ;
   private java.math.BigDecimal[] T01PO3_A6472BarTara ;
   private boolean[] T01PO3_n6472BarTara ;
   private java.math.BigDecimal[] T01PO3_A6473BarUniB ;
   private boolean[] T01PO3_n6473BarUniB ;
   private byte[] T01PO3_A12113BarPieCLd ;
   private boolean[] T01PO3_n12113BarPieCLd ;
   private java.util.Date[] T01PO3_A12779BarPieFdv ;
   private boolean[] T01PO3_n12779BarPieFdv ;
   private String[] T01PO3_A12780BarPieUsu ;
   private boolean[] T01PO3_n12780BarPieUsu ;
   private java.util.Date[] T01PO3_A12911BarPieFep ;
   private boolean[] T01PO3_n12911BarPieFep ;
   private String[] T01PO3_A12920BarPieColD ;
   private boolean[] T01PO3_n12920BarPieColD ;
   private int[] T01PO3_A12921BarPieColN ;
   private boolean[] T01PO3_n12921BarPieColN ;
   private String[] T01PO3_A12926BarPieCoCI ;
   private boolean[] T01PO3_n12926BarPieCoCI ;
   private int[] T01PO3_A12927BarPieCoCN ;
   private boolean[] T01PO3_n12927BarPieCoCN ;
   private String[] T01PO3_A12922BarPieArtI ;
   private boolean[] T01PO3_n12922BarPieArtI ;
   private String[] T01PO3_A12923BarPieArtD ;
   private boolean[] T01PO3_n12923BarPieArtD ;
   private int[] T01PO3_A12924BarPieCliI ;
   private boolean[] T01PO3_n12924BarPieCliI ;
   private String[] T01PO3_A12925BarPieCliN ;
   private boolean[] T01PO3_n12925BarPieCliN ;
   private String[] T01PO3_A12928BarPieEncC ;
   private boolean[] T01PO3_n12928BarPieEncC ;
   private String[] T01PO3_A12935BarPieTono ;
   private boolean[] T01PO3_n12935BarPieTono ;
   private String[] T01PO3_A12936BarPieSecu ;
   private boolean[] T01PO3_n12936BarPieSecu ;
   private int[] T01PO3_A12992BarPieOpe ;
   private boolean[] T01PO3_n12992BarPieOpe ;
   private byte[] T01PO3_A13004BarPieDest ;
   private boolean[] T01PO3_n13004BarPieDest ;
   private short[] T01PO3_A13107BarPieEmp ;
   private boolean[] T01PO3_n13107BarPieEmp ;
   private String[] T01PO3_A13108BarPieLote ;
   private boolean[] T01PO3_n13108BarPieLote ;
   private String[] T01PO3_A13109BarPieST ;
   private boolean[] T01PO3_n13109BarPieST ;
   private byte[] T01PO3_A13518BarPieTurn ;
   private boolean[] T01PO3_n13518BarPieTurn ;
   private String[] T01PO3_A13519BarPieMq ;
   private boolean[] T01PO3_n13519BarPieMq ;
   private String[] T01PO3_A396EmprCod ;
   private int[] T01PO3_A44AlbRecCod ;
   private int[] T01PO3_A129BarCod ;
   private byte[] T01PO3_A132BarCodReo ;
   private String[] T01PO3_A130BarCodPar ;
   private String[] T01PO10_A396EmprCod ;
   private int[] T01PO10_A129BarCod ;
   private byte[] T01PO10_A132BarCodReo ;
   private String[] T01PO10_A130BarCodPar ;
   private String[] T01PO10_A200BarPieCod ;
   private String[] T01PO11_A396EmprCod ;
   private int[] T01PO11_A129BarCod ;
   private byte[] T01PO11_A132BarCodReo ;
   private String[] T01PO11_A130BarCodPar ;
   private String[] T01PO11_A200BarPieCod ;
   private String[] T01PO2_A200BarPieCod ;
   private java.math.BigDecimal[] T01PO2_A203BarPieKil ;
   private java.math.BigDecimal[] T01PO2_A205BarPieMet ;
   private byte[] T01PO2_A201BarPieEst ;
   private java.math.BigDecimal[] T01PO2_A170BarKilLan ;
   private java.math.BigDecimal[] T01PO2_A183BarMetLan ;
   private short[] T01PO2_A197BarPConTro ;
   private String[] T01PO2_A908PieOriCod ;
   private int[] T01PO2_A1271BarPieLzd ;
   private int[] T01PO2_A1501BarPiePie ;
   private String[] T01PO2_A2186BarPieLoc ;
   private boolean[] T01PO2_n2186BarPieLoc ;
   private short[] T01PO2_A1691BarPieAnc ;
   private boolean[] T01PO2_n1691BarPieAnc ;
   private java.math.BigDecimal[] T01PO2_A3275BarKgsAut ;
   private boolean[] T01PO2_n3275BarKgsAut ;
   private java.math.BigDecimal[] T01PO2_A3276BarMtsAut ;
   private boolean[] T01PO2_n3276BarMtsAut ;
   private short[] T01PO2_A3277BarPieAut ;
   private boolean[] T01PO2_n3277BarPieAut ;
   private String[] T01PO2_A6116BarPieImp ;
   private boolean[] T01PO2_n6116BarPieImp ;
   private String[] T01PO2_A6489BarPieIdPz ;
   private boolean[] T01PO2_n6489BarPieIdPz ;
   private String[] T01PO2_A8707BapieObs ;
   private boolean[] T01PO2_n8707BapieObs ;
   private String[] T01PO2_A8838CodBarPz ;
   private boolean[] T01PO2_n8838CodBarPz ;
   private String[] T01PO2_A8907PzaB80 ;
   private boolean[] T01PO2_n8907PzaB80 ;
   private java.math.BigDecimal[] T01PO2_A9795BarPieK1 ;
   private boolean[] T01PO2_n9795BarPieK1 ;
   private java.math.BigDecimal[] T01PO2_A9796BarPieK2 ;
   private boolean[] T01PO2_n9796BarPieK2 ;
   private int[] T01PO2_A9798BarPz1 ;
   private boolean[] T01PO2_n9798BarPz1 ;
   private int[] T01PO2_A9799BarPz2 ;
   private boolean[] T01PO2_n9799BarPz2 ;
   private byte[] T01PO2_A9800BarNPes ;
   private boolean[] T01PO2_n9800BarNPes ;
   private short[] T01PO2_A9846BarPieAncc ;
   private boolean[] T01PO2_n9846BarPieAncc ;
   private java.math.BigDecimal[] T01PO2_A9984BarPiePda ;
   private boolean[] T01PO2_n9984BarPiePda ;
   private String[] T01PO2_A1919BarPieObs ;
   private boolean[] T01PO2_n1919BarPieObs ;
   private java.math.BigDecimal[] T01PO2_A6472BarTara ;
   private boolean[] T01PO2_n6472BarTara ;
   private java.math.BigDecimal[] T01PO2_A6473BarUniB ;
   private boolean[] T01PO2_n6473BarUniB ;
   private byte[] T01PO2_A12113BarPieCLd ;
   private boolean[] T01PO2_n12113BarPieCLd ;
   private java.util.Date[] T01PO2_A12779BarPieFdv ;
   private boolean[] T01PO2_n12779BarPieFdv ;
   private String[] T01PO2_A12780BarPieUsu ;
   private boolean[] T01PO2_n12780BarPieUsu ;
   private java.util.Date[] T01PO2_A12911BarPieFep ;
   private boolean[] T01PO2_n12911BarPieFep ;
   private String[] T01PO2_A12920BarPieColD ;
   private boolean[] T01PO2_n12920BarPieColD ;
   private int[] T01PO2_A12921BarPieColN ;
   private boolean[] T01PO2_n12921BarPieColN ;
   private String[] T01PO2_A12926BarPieCoCI ;
   private boolean[] T01PO2_n12926BarPieCoCI ;
   private int[] T01PO2_A12927BarPieCoCN ;
   private boolean[] T01PO2_n12927BarPieCoCN ;
   private String[] T01PO2_A12922BarPieArtI ;
   private boolean[] T01PO2_n12922BarPieArtI ;
   private String[] T01PO2_A12923BarPieArtD ;
   private boolean[] T01PO2_n12923BarPieArtD ;
   private int[] T01PO2_A12924BarPieCliI ;
   private boolean[] T01PO2_n12924BarPieCliI ;
   private String[] T01PO2_A12925BarPieCliN ;
   private boolean[] T01PO2_n12925BarPieCliN ;
   private String[] T01PO2_A12928BarPieEncC ;
   private boolean[] T01PO2_n12928BarPieEncC ;
   private String[] T01PO2_A12935BarPieTono ;
   private boolean[] T01PO2_n12935BarPieTono ;
   private String[] T01PO2_A12936BarPieSecu ;
   private boolean[] T01PO2_n12936BarPieSecu ;
   private int[] T01PO2_A12992BarPieOpe ;
   private boolean[] T01PO2_n12992BarPieOpe ;
   private byte[] T01PO2_A13004BarPieDest ;
   private boolean[] T01PO2_n13004BarPieDest ;
   private short[] T01PO2_A13107BarPieEmp ;
   private boolean[] T01PO2_n13107BarPieEmp ;
   private String[] T01PO2_A13108BarPieLote ;
   private boolean[] T01PO2_n13108BarPieLote ;
   private String[] T01PO2_A13109BarPieST ;
   private boolean[] T01PO2_n13109BarPieST ;
   private byte[] T01PO2_A13518BarPieTurn ;
   private boolean[] T01PO2_n13518BarPieTurn ;
   private String[] T01PO2_A13519BarPieMq ;
   private boolean[] T01PO2_n13519BarPieMq ;
   private String[] T01PO2_A396EmprCod ;
   private int[] T01PO2_A44AlbRecCod ;
   private int[] T01PO2_A129BarCod ;
   private byte[] T01PO2_A132BarCodReo ;
   private String[] T01PO2_A130BarCodPar ;
   private String[] T01PO15_A396EmprCod ;
   private int[] T01PO15_A129BarCod ;
   private byte[] T01PO15_A132BarCodReo ;
   private String[] T01PO15_A130BarCodPar ;
   private String[] T01PO15_A200BarPieCod ;
   private short[] T01PO15_A12913BarPieLDf ;
   private String[] T01PO16_A396EmprCod ;
   private int[] T01PO16_A129BarCod ;
   private byte[] T01PO16_A132BarCodReo ;
   private String[] T01PO16_A130BarCodPar ;
   private String[] T01PO16_A200BarPieCod ;
   private short[] T01PO16_A3858BarTroCod ;
   private String[] T01PO17_A396EmprCod ;
   private long[] T01PO17_A30AlbProCod ;
   private int[] T01PO17_A129BarCod ;
   private byte[] T01PO17_A132BarCodReo ;
   private String[] T01PO17_A130BarCodPar ;
   private String[] T01PO17_A200BarPieCod ;
   private String[] T01PO18_A396EmprCod ;
   private int[] T01PO18_A129BarCod ;
   private byte[] T01PO18_A132BarCodReo ;
   private String[] T01PO18_A130BarCodPar ;
   private String[] T01PO18_A200BarPieCod ;
   private String[] T01PO19_A396EmprCod ;
   private String[] T01PO20_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class barpie__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class barpie__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class barpie__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class barpie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PO2", "SELECT BarPieCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieLoc, BarPieAnc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieColD, BarPieColN, BarPieCoCI, BarPieCoCN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?  FOR UPDATE OF BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieLoc, BarPieAnc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieColD, BarPieColN, BarPieCoCI, BarPieCoCN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, AlbRecCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PO3", "SELECT BarPieCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieLoc, BarPieAnc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieColD, BarPieColN, BarPieCoCI, BarPieCoCN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PO4", "SELECT EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PO5", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PO6", "SELECT /*+ FIRST_ROWS(100) */ TM1.BarPieCod, TM1.BarPieKil, TM1.BarPieMet, TM1.BarPieEst, TM1.BarKilLan, TM1.BarMetLan, TM1.BarPConTro, TM1.PieOriCod, TM1.BarPieLzd, TM1.BarPiePie, TM1.BarPieLoc, TM1.BarPieAnc, TM1.BarKgsAut, TM1.BarMtsAut, TM1.BarPieAut, TM1.BarPieImp, TM1.BarPieIdPz, TM1.BapieObs, TM1.CodBarPz, TM1.PzaB80, TM1.BarPieK1, TM1.BarPieK2, TM1.BarPz1, TM1.BarPz2, TM1.BarNPes, TM1.BarPieAncc, TM1.BarPiePda, TM1.BarPieObs, TM1.BarTara, TM1.BarUniB, TM1.BarPieCLd, TM1.BarPieFdv, TM1.BarPieUsu, TM1.BarPieFep, TM1.BarPieColD, TM1.BarPieColN, TM1.BarPieCoCI, TM1.BarPieCoCN, TM1.BarPieArtI, TM1.BarPieArtD, TM1.BarPieCliI, TM1.BarPieCliN, TM1.BarPieEncC, TM1.BarPieTono, TM1.BarPieSecu, TM1.BarPieOpe, TM1.BarPieDest, TM1.BarPieEmp, TM1.BarPieLote, TM1.BarPieST, TM1.BarPieTurn, TM1.BarPieMq, TM1.EmprCod, TM1.AlbRecCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM TXPBARPIE TM1 WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.BarPieCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PO7", "SELECT EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PO8", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PO9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PO10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarPieCod > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PO11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarPieCod < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, BarPieCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PO12", "INSERT INTO TXPBARPIE(BarPieCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieLoc, BarPieAnc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieColD, BarPieColN, BarPieCoCI, BarPieCoCN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar, BarPieOrd, BarPieUltD, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ')", GX_NOMASK, "TXPBARPIE")
         ,new UpdateCursor("T01PO13", "UPDATE TXPBARPIE SET BarPieKil=?, BarPieMet=?, BarPieEst=?, BarKilLan=?, BarMetLan=?, BarPConTro=?, PieOriCod=?, BarPieLzd=?, BarPiePie=?, BarPieLoc=?, BarPieAnc=?, BarKgsAut=?, BarMtsAut=?, BarPieAut=?, BarPieImp=?, BarPieIdPz=?, BapieObs=?, CodBarPz=?, PzaB80=?, BarPieK1=?, BarPieK2=?, BarPz1=?, BarPz2=?, BarNPes=?, BarPieAncc=?, BarPiePda=?, BarPieObs=?, BarTara=?, BarUniB=?, BarPieCLd=?, BarPieFdv=?, BarPieUsu=?, BarPieFep=?, BarPieColD=?, BarPieColN=?, BarPieCoCI=?, BarPieCoCN=?, BarPieArtI=?, BarPieArtD=?, BarPieCliI=?, BarPieCliN=?, BarPieEncC=?, BarPieTono=?, BarPieSecu=?, BarPieOpe=?, BarPieDest=?, BarPieEmp=?, BarPieLote=?, BarPieST=?, BarPieTurn=?, BarPieMq=?, AlbRecCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new UpdateCursor("T01PO14", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new ForEachCursor("T01PO15", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf FROM TXPBARPDE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PO16", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PO17", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PO18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PO19", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PO20", "SELECT EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(18, 40);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(20, 9);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(23);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(24);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(25);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(26);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(28, 60);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((byte[]) buf[50])[0] = rslt.getByte(31);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDate(32);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(33, 10);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDate(34);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(35, 13);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((int[]) buf[60])[0] = rslt.getInt(36);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(37, 13);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((int[]) buf[64])[0] = rslt.getInt(38);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(39, 16);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(40, 26);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((int[]) buf[70])[0] = rslt.getInt(41);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(42, 60);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(43, 20);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(44, 10);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(45, 10);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((int[]) buf[80])[0] = rslt.getInt(46);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((byte[]) buf[82])[0] = rslt.getByte(47);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((short[]) buf[84])[0] = rslt.getShort(48);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(49, 20);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(50, 20);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((byte[]) buf[90])[0] = rslt.getByte(51);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(52, 6);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getString(53, 3);
               ((int[]) buf[95])[0] = rslt.getInt(54);
               ((int[]) buf[96])[0] = rslt.getInt(55);
               ((byte[]) buf[97])[0] = rslt.getByte(56);
               ((String[]) buf[98])[0] = rslt.getString(57, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(18, 40);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(20, 9);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(23);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(24);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(25);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(26);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(28, 60);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((byte[]) buf[50])[0] = rslt.getByte(31);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDate(32);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(33, 10);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDate(34);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(35, 13);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((int[]) buf[60])[0] = rslt.getInt(36);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(37, 13);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((int[]) buf[64])[0] = rslt.getInt(38);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(39, 16);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(40, 26);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((int[]) buf[70])[0] = rslt.getInt(41);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(42, 60);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(43, 20);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(44, 10);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(45, 10);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((int[]) buf[80])[0] = rslt.getInt(46);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((byte[]) buf[82])[0] = rslt.getByte(47);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((short[]) buf[84])[0] = rslt.getShort(48);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(49, 20);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(50, 20);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((byte[]) buf[90])[0] = rslt.getByte(51);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(52, 6);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getString(53, 3);
               ((int[]) buf[95])[0] = rslt.getInt(54);
               ((int[]) buf[96])[0] = rslt.getInt(55);
               ((byte[]) buf[97])[0] = rslt.getByte(56);
               ((String[]) buf[98])[0] = rslt.getString(57, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(18, 40);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(20, 9);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(23);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(24);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(25);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(26);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(28, 60);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((byte[]) buf[50])[0] = rslt.getByte(31);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDate(32);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(33, 10);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDate(34);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(35, 13);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((int[]) buf[60])[0] = rslt.getInt(36);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(37, 13);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((int[]) buf[64])[0] = rslt.getInt(38);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(39, 16);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(40, 26);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((int[]) buf[70])[0] = rslt.getInt(41);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(42, 60);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(43, 20);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(44, 10);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(45, 10);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((int[]) buf[80])[0] = rslt.getInt(46);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((byte[]) buf[82])[0] = rslt.getByte(47);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((short[]) buf[84])[0] = rslt.getShort(48);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(49, 20);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(50, 20);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((byte[]) buf[90])[0] = rslt.getByte(51);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(52, 6);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getString(53, 3);
               ((int[]) buf[95])[0] = rslt.getInt(54);
               ((int[]) buf[96])[0] = rslt.getInt(55);
               ((byte[]) buf[97])[0] = rslt.getByte(56);
               ((String[]) buf[98])[0] = rslt.getString(57, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 18 :
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(5, (String)parms[4], 9);
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
               stmt.setString(15, (String)parms[14], 9);
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
               stmt.setString(15, (String)parms[14], 9);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 9);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 9);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[11], 10);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[23], 15);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[25], 40);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[27], 20);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[29], 9);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[35]).intValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[37]).intValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(25, ((Number) parms[39]).byteValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[45], 60);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(31, ((Number) parms[51]).byteValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DATE );
               }
               else
               {
                  stmt.setDate(32, (java.util.Date)parms[53]);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[55], 10);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DATE );
               }
               else
               {
                  stmt.setDate(34, (java.util.Date)parms[57]);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[59], 13);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(36, ((Number) parms[61]).intValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[63], 13);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(38, ((Number) parms[65]).intValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[67], 16);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[69], 26);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(41, ((Number) parms[71]).intValue());
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[73], 60);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[75], 20);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[77], 10);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[79], 10);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(46, ((Number) parms[81]).intValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(47, ((Number) parms[83]).byteValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(48, ((Number) parms[85]).shortValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[87], 20);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[89], 20);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(51, ((Number) parms[91]).byteValue());
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[93], 6);
               }
               stmt.setString(53, (String)parms[94], 3);
               stmt.setInt(54, ((Number) parms[95]).intValue());
               stmt.setInt(55, ((Number) parms[96]).intValue());
               stmt.setByte(56, ((Number) parms[97]).byteValue());
               stmt.setString(57, (String)parms[98], 1);
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 9);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[10], 10);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[22], 15);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[24], 40);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[26], 20);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[28], 9);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[34]).intValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[36]).intValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[38]).byteValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[40]).shortValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[44], 60);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(30, ((Number) parms[50]).byteValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DATE );
               }
               else
               {
                  stmt.setDate(31, (java.util.Date)parms[52]);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[54], 10);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DATE );
               }
               else
               {
                  stmt.setDate(33, (java.util.Date)parms[56]);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[58], 13);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(35, ((Number) parms[60]).intValue());
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[62], 13);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(37, ((Number) parms[64]).intValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[66], 16);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[68], 26);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(40, ((Number) parms[70]).intValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[72], 60);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[74], 20);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[76], 10);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[78], 10);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(45, ((Number) parms[80]).intValue());
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(46, ((Number) parms[82]).byteValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[84]).shortValue());
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[86], 20);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[88], 20);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(50, ((Number) parms[90]).byteValue());
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[92], 6);
               }
               stmt.setInt(52, ((Number) parms[93]).intValue());
               stmt.setString(53, (String)parms[94], 3);
               stmt.setInt(54, ((Number) parms[95]).intValue());
               stmt.setByte(55, ((Number) parms[96]).byteValue());
               stmt.setString(56, (String)parms[97], 1);
               stmt.setString(57, (String)parms[98], 9);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

