package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hishra_impl extends GXDataArea
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
         A4492HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = httpContext.GetPar( "HreBarPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla HISHRA", ""), (short)(0)) ;
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

   public hishra_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hishra_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hishra_impl.class ));
   }

   public hishra_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla HISHRA", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_HISHRA.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_HISHRA.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreBarCod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreBarReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreBarReo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreBarPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreBarPar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarPar_Internalname, GXutil.rtrim( A4494HreBarPar), GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreNumCie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreNumCie_Internalname, httpContext.getMessage( "Nº Cierre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumCie_Internalname, GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumCie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumCie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreNumCie_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAcCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAcCod_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9985HreAcCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAcCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9985HreAcCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9985HreAcCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAcCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAcReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAcReo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcReo_Internalname, GXutil.ltrim( localUtil.ntoc( A9986HreAcReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAcReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9986HreAcReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A9986HreAcReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAcReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAcPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAcPar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcPar_Internalname, GXutil.rtrim( A9987HreAcPar), GXutil.rtrim( localUtil.format( A9987HreAcPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAcPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAcKgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAcKgm_Internalname, httpContext.getMessage( "Kgs", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A9988HreAcKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAcKgm_Enabled!=0) ? localUtil.format( A9988HreAcKgm, "ZZZZZ9.99") : localUtil.format( A9988HreAcKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcKgm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAcKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAcMtr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAcMtr_Internalname, httpContext.getMessage( "Mts", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A9989HreAcMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAcMtr_Enabled!=0) ? localUtil.format( A9989HreAcMtr, "ZZZZZ9.99") : localUtil.format( A9989HreAcMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcMtr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAcMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAcPie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAcPie_Internalname, httpContext.getMessage( "Pzs", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcPie_Internalname, GXutil.ltrim( localUtil.ntoc( A9990HreAcPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAcPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9990HreAcPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9990HreAcPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcPie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAcPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAcCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAcCli_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcCli_Internalname, GXutil.ltrim( localUtil.ntoc( A9991HreAcCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAcCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9991HreAcCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9991HreAcCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAcCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAcSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAcSer_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcSer_Internalname, GXutil.rtrim( A9992HreAcSer), GXutil.rtrim( localUtil.format( A9992HreAcSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcSer_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAcSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAcDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAcDsc_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcDsc_Internalname, GXutil.rtrim( A9993HreAcDsc), GXutil.rtrim( localUtil.format( A9993HreAcDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAcDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAcCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAcCol_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcCol_Internalname, GXutil.rtrim( A9994HreAcCol), GXutil.rtrim( localUtil.format( A9994HreAcCol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcCol_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAcCol_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAcNumC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAcNumC_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcNumC_Internalname, GXutil.ltrim( localUtil.ntoc( A9995HreAcNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAcNumC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9995HreAcNumC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9995HreAcNumC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcNumC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAcNumC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAcNHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAcNHdr_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcNHdr_Internalname, GXutil.rtrim( A13895HreAcNHdr), GXutil.rtrim( localUtil.format( A13895HreAcNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcNHdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAcNHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISHRA.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISHRA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISHRA.htm");
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
         Z4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4492HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4493HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4494HreBarPar = httpContext.cgiGet( "Z4494HreBarPar") ;
         Z4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4495HreNumCie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9985HreAcCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9985HreAcCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9986HreAcReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z9986HreAcReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9987HreAcPar = httpContext.cgiGet( "Z9987HreAcPar") ;
         Z9988HreAcKgm = localUtil.ctond( httpContext.cgiGet( "Z9988HreAcKgm")) ;
         Z9989HreAcMtr = localUtil.ctond( httpContext.cgiGet( "Z9989HreAcMtr")) ;
         Z9990HreAcPie = (int)(localUtil.ctol( httpContext.cgiGet( "Z9990HreAcPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9991HreAcCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z9991HreAcCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9992HreAcSer = httpContext.cgiGet( "Z9992HreAcSer") ;
         Z9993HreAcDsc = httpContext.cgiGet( "Z9993HreAcDsc") ;
         Z9994HreAcCol = httpContext.cgiGet( "Z9994HreAcCol") ;
         Z9995HreAcNumC = (int)(localUtil.ctol( httpContext.cgiGet( "Z9995HreAcNumC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREBARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4492HreBarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         }
         else
         {
            A4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREBARREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreBarReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4493HreBarReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         }
         else
         {
            A4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         }
         A4494HreBarPar = httpContext.cgiGet( edtHreBarPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRENUMCIE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreNumCie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4495HreNumCie = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         }
         else
         {
            A4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREACCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAcCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9985HreAcCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A9985HreAcCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9985HreAcCod), 8, 0));
         }
         else
         {
            A9985HreAcCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9985HreAcCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9985HreAcCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREACREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAcReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9986HreAcReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9986HreAcReo", GXutil.str( A9986HreAcReo, 1, 0));
         }
         else
         {
            A9986HreAcReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreAcReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9986HreAcReo", GXutil.str( A9986HreAcReo, 1, 0));
         }
         A9987HreAcPar = httpContext.cgiGet( edtHreAcPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9987HreAcPar", A9987HreAcPar);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreAcKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreAcKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREACKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAcKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9988HreAcKgm = DecimalUtil.ZERO ;
            n9988HreAcKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9988HreAcKgm", GXutil.ltrimstr( A9988HreAcKgm, 9, 2));
         }
         else
         {
            A9988HreAcKgm = localUtil.ctond( httpContext.cgiGet( edtHreAcKgm_Internalname)) ;
            n9988HreAcKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9988HreAcKgm", GXutil.ltrimstr( A9988HreAcKgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreAcMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreAcMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREACMTR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAcMtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9989HreAcMtr = DecimalUtil.ZERO ;
            n9989HreAcMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9989HreAcMtr", GXutil.ltrimstr( A9989HreAcMtr, 9, 2));
         }
         else
         {
            A9989HreAcMtr = localUtil.ctond( httpContext.cgiGet( edtHreAcMtr_Internalname)) ;
            n9989HreAcMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9989HreAcMtr", GXutil.ltrimstr( A9989HreAcMtr, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREACPIE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAcPie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9990HreAcPie = 0 ;
            n9990HreAcPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9990HreAcPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9990HreAcPie), 6, 0));
         }
         else
         {
            A9990HreAcPie = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9990HreAcPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9990HreAcPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9990HreAcPie), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREACCLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAcCli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9991HreAcCli = 0 ;
            n9991HreAcCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9991HreAcCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9991HreAcCli), 6, 0));
         }
         else
         {
            A9991HreAcCli = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9991HreAcCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9991HreAcCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9991HreAcCli), 6, 0));
         }
         A9992HreAcSer = httpContext.cgiGet( edtHreAcSer_Internalname) ;
         n9992HreAcSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9992HreAcSer", A9992HreAcSer);
         A9993HreAcDsc = httpContext.cgiGet( edtHreAcDsc_Internalname) ;
         n9993HreAcDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9993HreAcDsc", A9993HreAcDsc);
         A9994HreAcCol = httpContext.cgiGet( edtHreAcCol_Internalname) ;
         n9994HreAcCol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9994HreAcCol", A9994HreAcCol);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREACNUMC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAcNumC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9995HreAcNumC = 0 ;
            n9995HreAcNumC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9995HreAcNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9995HreAcNumC), 6, 0));
         }
         else
         {
            A9995HreAcNumC = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9995HreAcNumC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9995HreAcNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9995HreAcNumC), 6, 0));
         }
         A13895HreAcNHdr = httpContext.cgiGet( edtHreAcNHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13895HreAcNHdr", A13895HreAcNHdr);
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
            A4492HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = httpContext.GetPar( "HreBarPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A9985HreAcCod = (int)(GXutil.lval( httpContext.GetPar( "HreAcCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9985HreAcCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9985HreAcCod), 8, 0));
            A9986HreAcReo = (byte)(GXutil.lval( httpContext.GetPar( "HreAcReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9986HreAcReo", GXutil.str( A9986HreAcReo, 1, 0));
            A9987HreAcPar = httpContext.GetPar( "HreAcPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9987HreAcPar", A9987HreAcPar);
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
            initAll1R71327( ) ;
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
      disableAttributes1R71327( ) ;
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

   public void resetCaption1R70( )
   {
   }

   public void zm1R71327( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9988HreAcKgm = T01R73_A9988HreAcKgm[0] ;
            Z9989HreAcMtr = T01R73_A9989HreAcMtr[0] ;
            Z9990HreAcPie = T01R73_A9990HreAcPie[0] ;
            Z9991HreAcCli = T01R73_A9991HreAcCli[0] ;
            Z9992HreAcSer = T01R73_A9992HreAcSer[0] ;
            Z9993HreAcDsc = T01R73_A9993HreAcDsc[0] ;
            Z9994HreAcCol = T01R73_A9994HreAcCol[0] ;
            Z9995HreAcNumC = T01R73_A9995HreAcNumC[0] ;
         }
         else
         {
            Z9988HreAcKgm = A9988HreAcKgm ;
            Z9989HreAcMtr = A9989HreAcMtr ;
            Z9990HreAcPie = A9990HreAcPie ;
            Z9991HreAcCli = A9991HreAcCli ;
            Z9992HreAcSer = A9992HreAcSer ;
            Z9993HreAcDsc = A9993HreAcDsc ;
            Z9994HreAcCol = A9994HreAcCol ;
            Z9995HreAcNumC = A9995HreAcNumC ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z9985HreAcCod = A9985HreAcCod ;
         Z9986HreAcReo = A9986HreAcReo ;
         Z9987HreAcPar = A9987HreAcPar ;
         Z9988HreAcKgm = A9988HreAcKgm ;
         Z9989HreAcMtr = A9989HreAcMtr ;
         Z9990HreAcPie = A9990HreAcPie ;
         Z9991HreAcCli = A9991HreAcCli ;
         Z9992HreAcSer = A9992HreAcSer ;
         Z9993HreAcDsc = A9993HreAcDsc ;
         Z9994HreAcCol = A9994HreAcCol ;
         Z9995HreAcNumC = A9995HreAcNumC ;
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
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

   public void load1R71327( )
   {
      /* Using cursor T01R75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1327 = (short)(1) ;
         A9988HreAcKgm = T01R75_A9988HreAcKgm[0] ;
         n9988HreAcKgm = T01R75_n9988HreAcKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9988HreAcKgm", GXutil.ltrimstr( A9988HreAcKgm, 9, 2));
         A9989HreAcMtr = T01R75_A9989HreAcMtr[0] ;
         n9989HreAcMtr = T01R75_n9989HreAcMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9989HreAcMtr", GXutil.ltrimstr( A9989HreAcMtr, 9, 2));
         A9990HreAcPie = T01R75_A9990HreAcPie[0] ;
         n9990HreAcPie = T01R75_n9990HreAcPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9990HreAcPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9990HreAcPie), 6, 0));
         A9991HreAcCli = T01R75_A9991HreAcCli[0] ;
         n9991HreAcCli = T01R75_n9991HreAcCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9991HreAcCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9991HreAcCli), 6, 0));
         A9992HreAcSer = T01R75_A9992HreAcSer[0] ;
         n9992HreAcSer = T01R75_n9992HreAcSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9992HreAcSer", A9992HreAcSer);
         A9993HreAcDsc = T01R75_A9993HreAcDsc[0] ;
         n9993HreAcDsc = T01R75_n9993HreAcDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9993HreAcDsc", A9993HreAcDsc);
         A9994HreAcCol = T01R75_A9994HreAcCol[0] ;
         n9994HreAcCol = T01R75_n9994HreAcCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9994HreAcCol", A9994HreAcCol);
         A9995HreAcNumC = T01R75_A9995HreAcNumC[0] ;
         n9995HreAcNumC = T01R75_n9995HreAcNumC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9995HreAcNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9995HreAcNumC), 6, 0));
         zm1R71327( -2) ;
      }
      pr_default.close(3);
      onLoadActions1R71327( ) ;
   }

   public void onLoadActions1R71327( )
   {
      A13895HreAcNHdr = GXutil.trim( GXutil.str( A9985HreAcCod, 8, 0)) + "-" + GXutil.str( A9986HreAcReo, 1, 0) + A9987HreAcPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13895HreAcNHdr", A13895HreAcNHdr);
   }

   public void checkExtendedTable1R71327( )
   {
      nIsDirty_1327 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01R74 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      nIsDirty_1327 = (short)(1) ;
      A13895HreAcNHdr = GXutil.trim( GXutil.str( A9985HreAcCod, 8, 0)) + "-" + GXutil.str( A9986HreAcReo, 1, 0) + A9987HreAcPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13895HreAcNHdr", A13895HreAcNHdr);
   }

   public void closeExtendedTableCursors1R71327( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A4492HreBarCod ,
                         byte A4493HreBarReo ,
                         String A4494HreBarPar ,
                         byte A4495HreNumCie )
   {
      /* Using cursor T01R76 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey1R71327( )
   {
      /* Using cursor T01R77 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1327 = (short)(1) ;
      }
      else
      {
         RcdFound1327 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01R73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1R71327( 2) ;
         RcdFound1327 = (short)(1) ;
         A9985HreAcCod = T01R73_A9985HreAcCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9985HreAcCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9985HreAcCod), 8, 0));
         A9986HreAcReo = T01R73_A9986HreAcReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9986HreAcReo", GXutil.str( A9986HreAcReo, 1, 0));
         A9987HreAcPar = T01R73_A9987HreAcPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9987HreAcPar", A9987HreAcPar);
         A9988HreAcKgm = T01R73_A9988HreAcKgm[0] ;
         n9988HreAcKgm = T01R73_n9988HreAcKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9988HreAcKgm", GXutil.ltrimstr( A9988HreAcKgm, 9, 2));
         A9989HreAcMtr = T01R73_A9989HreAcMtr[0] ;
         n9989HreAcMtr = T01R73_n9989HreAcMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9989HreAcMtr", GXutil.ltrimstr( A9989HreAcMtr, 9, 2));
         A9990HreAcPie = T01R73_A9990HreAcPie[0] ;
         n9990HreAcPie = T01R73_n9990HreAcPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9990HreAcPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9990HreAcPie), 6, 0));
         A9991HreAcCli = T01R73_A9991HreAcCli[0] ;
         n9991HreAcCli = T01R73_n9991HreAcCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9991HreAcCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9991HreAcCli), 6, 0));
         A9992HreAcSer = T01R73_A9992HreAcSer[0] ;
         n9992HreAcSer = T01R73_n9992HreAcSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9992HreAcSer", A9992HreAcSer);
         A9993HreAcDsc = T01R73_A9993HreAcDsc[0] ;
         n9993HreAcDsc = T01R73_n9993HreAcDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9993HreAcDsc", A9993HreAcDsc);
         A9994HreAcCol = T01R73_A9994HreAcCol[0] ;
         n9994HreAcCol = T01R73_n9994HreAcCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9994HreAcCol", A9994HreAcCol);
         A9995HreAcNumC = T01R73_A9995HreAcNumC[0] ;
         n9995HreAcNumC = T01R73_n9995HreAcNumC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9995HreAcNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9995HreAcNumC), 6, 0));
         A396EmprCod = T01R73_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T01R73_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T01R73_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T01R73_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T01R73_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z9985HreAcCod = A9985HreAcCod ;
         Z9986HreAcReo = A9986HreAcReo ;
         Z9987HreAcPar = A9987HreAcPar ;
         sMode1327 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1R71327( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1327 = (short)(0) ;
            initializeNonKey1R71327( ) ;
         }
         Gx_mode = sMode1327 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1327 = (short)(0) ;
         initializeNonKey1R71327( ) ;
         sMode1327 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1327 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1R71327( ) ;
      if ( RcdFound1327 == 0 )
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
      RcdFound1327 = (short)(0) ;
      /* Using cursor T01R78 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4495HreNumCie), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Integer.valueOf(A9985HreAcCod), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A9986HreAcReo), Byte.valueOf(A9986HreAcReo), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A9987HreAcPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R78_A4492HreBarCod[0] < A4492HreBarCod ) || ( T01R78_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R78_A4493HreBarReo[0] < A4493HreBarReo ) || ( T01R78_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R78_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R78_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T01R78_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R78_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R78_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R78_A4495HreNumCie[0] < A4495HreNumCie ) || ( T01R78_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R78_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R78_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R78_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R78_A9985HreAcCod[0] < A9985HreAcCod ) || ( T01R78_A9985HreAcCod[0] == A9985HreAcCod ) && ( T01R78_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R78_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R78_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R78_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R78_A9986HreAcReo[0] < A9986HreAcReo ) || ( T01R78_A9986HreAcReo[0] == A9986HreAcReo ) && ( T01R78_A9985HreAcCod[0] == A9985HreAcCod ) && ( T01R78_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R78_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R78_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R78_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R78_A9987HreAcPar[0], A9987HreAcPar) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R78_A4492HreBarCod[0] > A4492HreBarCod ) || ( T01R78_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R78_A4493HreBarReo[0] > A4493HreBarReo ) || ( T01R78_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R78_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R78_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T01R78_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R78_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R78_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R78_A4495HreNumCie[0] > A4495HreNumCie ) || ( T01R78_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R78_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R78_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R78_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R78_A9985HreAcCod[0] > A9985HreAcCod ) || ( T01R78_A9985HreAcCod[0] == A9985HreAcCod ) && ( T01R78_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R78_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R78_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R78_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R78_A9986HreAcReo[0] > A9986HreAcReo ) || ( T01R78_A9986HreAcReo[0] == A9986HreAcReo ) && ( T01R78_A9985HreAcCod[0] == A9985HreAcCod ) && ( T01R78_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R78_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R78_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R78_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R78_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R78_A9987HreAcPar[0], A9987HreAcPar) > 0 ) ) )
         {
            A396EmprCod = T01R78_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4492HreBarCod = T01R78_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T01R78_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T01R78_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T01R78_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A9985HreAcCod = T01R78_A9985HreAcCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9985HreAcCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9985HreAcCod), 8, 0));
            A9986HreAcReo = T01R78_A9986HreAcReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9986HreAcReo", GXutil.str( A9986HreAcReo, 1, 0));
            A9987HreAcPar = T01R78_A9987HreAcPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9987HreAcPar", A9987HreAcPar);
            RcdFound1327 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1327 = (short)(0) ;
      /* Using cursor T01R79 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4495HreNumCie), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Integer.valueOf(A9985HreAcCod), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A9986HreAcReo), Byte.valueOf(A9986HreAcReo), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A9987HreAcPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R79_A4492HreBarCod[0] > A4492HreBarCod ) || ( T01R79_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R79_A4493HreBarReo[0] > A4493HreBarReo ) || ( T01R79_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R79_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R79_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T01R79_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R79_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R79_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R79_A4495HreNumCie[0] > A4495HreNumCie ) || ( T01R79_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R79_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R79_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R79_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R79_A9985HreAcCod[0] > A9985HreAcCod ) || ( T01R79_A9985HreAcCod[0] == A9985HreAcCod ) && ( T01R79_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R79_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R79_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R79_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R79_A9986HreAcReo[0] > A9986HreAcReo ) || ( T01R79_A9986HreAcReo[0] == A9986HreAcReo ) && ( T01R79_A9985HreAcCod[0] == A9985HreAcCod ) && ( T01R79_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R79_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R79_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R79_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R79_A9987HreAcPar[0], A9987HreAcPar) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R79_A4492HreBarCod[0] < A4492HreBarCod ) || ( T01R79_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R79_A4493HreBarReo[0] < A4493HreBarReo ) || ( T01R79_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R79_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R79_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T01R79_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R79_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R79_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R79_A4495HreNumCie[0] < A4495HreNumCie ) || ( T01R79_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R79_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R79_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R79_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R79_A9985HreAcCod[0] < A9985HreAcCod ) || ( T01R79_A9985HreAcCod[0] == A9985HreAcCod ) && ( T01R79_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R79_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R79_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R79_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R79_A9986HreAcReo[0] < A9986HreAcReo ) || ( T01R79_A9986HreAcReo[0] == A9986HreAcReo ) && ( T01R79_A9985HreAcCod[0] == A9985HreAcCod ) && ( T01R79_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R79_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R79_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R79_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R79_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R79_A9987HreAcPar[0], A9987HreAcPar) < 0 ) ) )
         {
            A396EmprCod = T01R79_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4492HreBarCod = T01R79_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T01R79_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T01R79_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T01R79_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A9985HreAcCod = T01R79_A9985HreAcCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9985HreAcCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9985HreAcCod), 8, 0));
            A9986HreAcReo = T01R79_A9986HreAcReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9986HreAcReo", GXutil.str( A9986HreAcReo, 1, 0));
            A9987HreAcPar = T01R79_A9987HreAcPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9987HreAcPar", A9987HreAcPar);
            RcdFound1327 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1R71327( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1R71327( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1327 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A9985HreAcCod != Z9985HreAcCod ) || ( A9986HreAcReo != Z9986HreAcReo ) || ( GXutil.strcmp(A9987HreAcPar, Z9987HreAcPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A4492HreBarCod = Z4492HreBarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
               A4493HreBarReo = Z4493HreBarReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
               A4494HreBarPar = Z4494HreBarPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
               A4495HreNumCie = Z4495HreNumCie ;
               httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
               A9985HreAcCod = Z9985HreAcCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9985HreAcCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9985HreAcCod), 8, 0));
               A9986HreAcReo = Z9986HreAcReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A9986HreAcReo", GXutil.str( A9986HreAcReo, 1, 0));
               A9987HreAcPar = Z9987HreAcPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A9987HreAcPar", A9987HreAcPar);
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
               update1R71327( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A9985HreAcCod != Z9985HreAcCod ) || ( A9986HreAcReo != Z9986HreAcReo ) || ( GXutil.strcmp(A9987HreAcPar, Z9987HreAcPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1R71327( ) ;
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
                  insert1R71327( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A9985HreAcCod != Z9985HreAcCod ) || ( A9986HreAcReo != Z9986HreAcReo ) || ( GXutil.strcmp(A9987HreAcPar, Z9987HreAcPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = Z4492HreBarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = Z4493HreBarReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = Z4494HreBarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = Z4495HreNumCie ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A9985HreAcCod = Z9985HreAcCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9985HreAcCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9985HreAcCod), 8, 0));
         A9986HreAcReo = Z9986HreAcReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A9986HreAcReo", GXutil.str( A9986HreAcReo, 1, 0));
         A9987HreAcPar = Z9987HreAcPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A9987HreAcPar", A9987HreAcPar);
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
      if ( RcdFound1327 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtHreAcKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1R71327( ) ;
      if ( RcdFound1327 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreAcKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1R71327( ) ;
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
      if ( RcdFound1327 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreAcKgm_Internalname ;
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
      if ( RcdFound1327 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreAcKgm_Internalname ;
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
      scanStart1R71327( ) ;
      if ( RcdFound1327 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1327 != 0 )
         {
            scanNext1R71327( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreAcKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1R71327( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1R71327( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01R72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISHRA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9988HreAcKgm, T01R72_A9988HreAcKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z9989HreAcMtr, T01R72_A9989HreAcMtr[0]) != 0 ) || ( Z9990HreAcPie != T01R72_A9990HreAcPie[0] ) || ( Z9991HreAcCli != T01R72_A9991HreAcCli[0] ) || ( GXutil.strcmp(Z9992HreAcSer, T01R72_A9992HreAcSer[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9993HreAcDsc, T01R72_A9993HreAcDsc[0]) != 0 ) || ( GXutil.strcmp(Z9994HreAcCol, T01R72_A9994HreAcCol[0]) != 0 ) || ( Z9995HreAcNumC != T01R72_A9995HreAcNumC[0] ) )
         {
            if ( DecimalUtil.compareTo(Z9988HreAcKgm, T01R72_A9988HreAcKgm[0]) != 0 )
            {
               GXutil.writeLogln("hishra:[seudo value changed for attri]"+"HreAcKgm");
               GXutil.writeLogRaw("Old: ",Z9988HreAcKgm);
               GXutil.writeLogRaw("Current: ",T01R72_A9988HreAcKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z9989HreAcMtr, T01R72_A9989HreAcMtr[0]) != 0 )
            {
               GXutil.writeLogln("hishra:[seudo value changed for attri]"+"HreAcMtr");
               GXutil.writeLogRaw("Old: ",Z9989HreAcMtr);
               GXutil.writeLogRaw("Current: ",T01R72_A9989HreAcMtr[0]);
            }
            if ( Z9990HreAcPie != T01R72_A9990HreAcPie[0] )
            {
               GXutil.writeLogln("hishra:[seudo value changed for attri]"+"HreAcPie");
               GXutil.writeLogRaw("Old: ",Z9990HreAcPie);
               GXutil.writeLogRaw("Current: ",T01R72_A9990HreAcPie[0]);
            }
            if ( Z9991HreAcCli != T01R72_A9991HreAcCli[0] )
            {
               GXutil.writeLogln("hishra:[seudo value changed for attri]"+"HreAcCli");
               GXutil.writeLogRaw("Old: ",Z9991HreAcCli);
               GXutil.writeLogRaw("Current: ",T01R72_A9991HreAcCli[0]);
            }
            if ( GXutil.strcmp(Z9992HreAcSer, T01R72_A9992HreAcSer[0]) != 0 )
            {
               GXutil.writeLogln("hishra:[seudo value changed for attri]"+"HreAcSer");
               GXutil.writeLogRaw("Old: ",Z9992HreAcSer);
               GXutil.writeLogRaw("Current: ",T01R72_A9992HreAcSer[0]);
            }
            if ( GXutil.strcmp(Z9993HreAcDsc, T01R72_A9993HreAcDsc[0]) != 0 )
            {
               GXutil.writeLogln("hishra:[seudo value changed for attri]"+"HreAcDsc");
               GXutil.writeLogRaw("Old: ",Z9993HreAcDsc);
               GXutil.writeLogRaw("Current: ",T01R72_A9993HreAcDsc[0]);
            }
            if ( GXutil.strcmp(Z9994HreAcCol, T01R72_A9994HreAcCol[0]) != 0 )
            {
               GXutil.writeLogln("hishra:[seudo value changed for attri]"+"HreAcCol");
               GXutil.writeLogRaw("Old: ",Z9994HreAcCol);
               GXutil.writeLogRaw("Current: ",T01R72_A9994HreAcCol[0]);
            }
            if ( Z9995HreAcNumC != T01R72_A9995HreAcNumC[0] )
            {
               GXutil.writeLogln("hishra:[seudo value changed for attri]"+"HreAcNumC");
               GXutil.writeLogRaw("Old: ",Z9995HreAcNumC);
               GXutil.writeLogRaw("Current: ",T01R72_A9995HreAcNumC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISHRA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1R71327( )
   {
      beforeValidate1R71327( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1R71327( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1R71327( 0) ;
         checkOptimisticConcurrency1R71327( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1R71327( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1R71327( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01R710 */
                  pr_default.execute(8, new Object[] {Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar, Boolean.valueOf(n9988HreAcKgm), A9988HreAcKgm, Boolean.valueOf(n9989HreAcMtr), A9989HreAcMtr, Boolean.valueOf(n9990HreAcPie), Integer.valueOf(A9990HreAcPie), Boolean.valueOf(n9991HreAcCli), Integer.valueOf(A9991HreAcCli), Boolean.valueOf(n9992HreAcSer), A9992HreAcSer, Boolean.valueOf(n9993HreAcDsc), A9993HreAcDsc, Boolean.valueOf(n9994HreAcCol), A9994HreAcCol, Boolean.valueOf(n9995HreAcNumC), Integer.valueOf(A9995HreAcNumC), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISHRA");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        resetCaption1R70( ) ;
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
            load1R71327( ) ;
         }
         endLevel1R71327( ) ;
      }
      closeExtendedTableCursors1R71327( ) ;
   }

   public void update1R71327( )
   {
      beforeValidate1R71327( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1R71327( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1R71327( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1R71327( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1R71327( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01R711 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n9988HreAcKgm), A9988HreAcKgm, Boolean.valueOf(n9989HreAcMtr), A9989HreAcMtr, Boolean.valueOf(n9990HreAcPie), Integer.valueOf(A9990HreAcPie), Boolean.valueOf(n9991HreAcCli), Integer.valueOf(A9991HreAcCli), Boolean.valueOf(n9992HreAcSer), A9992HreAcSer, Boolean.valueOf(n9993HreAcDsc), A9993HreAcDsc, Boolean.valueOf(n9994HreAcCol), A9994HreAcCol, Boolean.valueOf(n9995HreAcNumC), Integer.valueOf(A9995HreAcNumC), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISHRA");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISHRA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1R71327( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1R70( ) ;
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
         endLevel1R71327( ) ;
      }
      closeExtendedTableCursors1R71327( ) ;
   }

   public void deferredUpdate1R71327( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1R71327( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1R71327( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1R71327( ) ;
         afterConfirm1R71327( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1R71327( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01R712 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISHRA");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1327 == 0 )
                     {
                        initAll1R71327( ) ;
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
                     resetCaption1R70( ) ;
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
      sMode1327 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1R71327( ) ;
      Gx_mode = sMode1327 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1R71327( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13895HreAcNHdr = GXutil.trim( GXutil.str( A9985HreAcCod, 8, 0)) + "-" + GXutil.str( A9986HreAcReo, 1, 0) + A9987HreAcPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13895HreAcNHdr", A13895HreAcNHdr);
      }
   }

   public void endLevel1R71327( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1R71327( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "hishra");
         if ( AnyError == 0 )
         {
            confirmValues1R70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "hishra");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1R71327( )
   {
      /* Using cursor T01R713 */
      pr_default.execute(11);
      RcdFound1327 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1327 = (short)(1) ;
         A396EmprCod = T01R713_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T01R713_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T01R713_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T01R713_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T01R713_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A9985HreAcCod = T01R713_A9985HreAcCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9985HreAcCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9985HreAcCod), 8, 0));
         A9986HreAcReo = T01R713_A9986HreAcReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9986HreAcReo", GXutil.str( A9986HreAcReo, 1, 0));
         A9987HreAcPar = T01R713_A9987HreAcPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9987HreAcPar", A9987HreAcPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1R71327( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1327 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1327 = (short)(1) ;
         A396EmprCod = T01R713_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T01R713_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T01R713_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T01R713_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T01R713_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A9985HreAcCod = T01R713_A9985HreAcCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9985HreAcCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9985HreAcCod), 8, 0));
         A9986HreAcReo = T01R713_A9986HreAcReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9986HreAcReo", GXutil.str( A9986HreAcReo, 1, 0));
         A9987HreAcPar = T01R713_A9987HreAcPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9987HreAcPar", A9987HreAcPar);
      }
   }

   public void scanEnd1R71327( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1R71327( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1R71327( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1R71327( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1R71327( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1R71327( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1R71327( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1R71327( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtHreBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarCod_Enabled), 5, 0), true);
      edtHreBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarReo_Enabled), 5, 0), true);
      edtHreBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarPar_Enabled), 5, 0), true);
      edtHreNumCie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumCie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumCie_Enabled), 5, 0), true);
      edtHreAcCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCod_Enabled), 5, 0), true);
      edtHreAcReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcReo_Enabled), 5, 0), true);
      edtHreAcPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcPar_Enabled), 5, 0), true);
      edtHreAcKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcKgm_Enabled), 5, 0), true);
      edtHreAcMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcMtr_Enabled), 5, 0), true);
      edtHreAcPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcPie_Enabled), 5, 0), true);
      edtHreAcCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCli_Enabled), 5, 0), true);
      edtHreAcSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcSer_Enabled), 5, 0), true);
      edtHreAcDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcDsc_Enabled), 5, 0), true);
      edtHreAcCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCol_Enabled), 5, 0), true);
      edtHreAcNumC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcNumC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcNumC_Enabled), 5, 0), true);
      edtHreAcNHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcNHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcNHdr_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1R71327( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1R70( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.hishra", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9985HreAcCod", GXutil.ltrim( localUtil.ntoc( Z9985HreAcCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9986HreAcReo", GXutil.ltrim( localUtil.ntoc( Z9986HreAcReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9987HreAcPar", GXutil.rtrim( Z9987HreAcPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9988HreAcKgm", GXutil.ltrim( localUtil.ntoc( Z9988HreAcKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9989HreAcMtr", GXutil.ltrim( localUtil.ntoc( Z9989HreAcMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9990HreAcPie", GXutil.ltrim( localUtil.ntoc( Z9990HreAcPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9991HreAcCli", GXutil.ltrim( localUtil.ntoc( Z9991HreAcCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9992HreAcSer", GXutil.rtrim( Z9992HreAcSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9993HreAcDsc", GXutil.rtrim( Z9993HreAcDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9994HreAcCol", GXutil.rtrim( Z9994HreAcCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9995HreAcNumC", GXutil.ltrim( localUtil.ntoc( Z9995HreAcNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.hishra", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "HISHRA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla HISHRA", "") ;
   }

   public void initializeNonKey1R71327( )
   {
      A13895HreAcNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13895HreAcNHdr", A13895HreAcNHdr);
      A9988HreAcKgm = DecimalUtil.ZERO ;
      n9988HreAcKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9988HreAcKgm", GXutil.ltrimstr( A9988HreAcKgm, 9, 2));
      A9989HreAcMtr = DecimalUtil.ZERO ;
      n9989HreAcMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9989HreAcMtr", GXutil.ltrimstr( A9989HreAcMtr, 9, 2));
      A9990HreAcPie = 0 ;
      n9990HreAcPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9990HreAcPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9990HreAcPie), 6, 0));
      A9991HreAcCli = 0 ;
      n9991HreAcCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9991HreAcCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9991HreAcCli), 6, 0));
      A9992HreAcSer = "" ;
      n9992HreAcSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9992HreAcSer", A9992HreAcSer);
      A9993HreAcDsc = "" ;
      n9993HreAcDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9993HreAcDsc", A9993HreAcDsc);
      A9994HreAcCol = "" ;
      n9994HreAcCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9994HreAcCol", A9994HreAcCol);
      A9995HreAcNumC = 0 ;
      n9995HreAcNumC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9995HreAcNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9995HreAcNumC), 6, 0));
      Z9988HreAcKgm = DecimalUtil.ZERO ;
      Z9989HreAcMtr = DecimalUtil.ZERO ;
      Z9990HreAcPie = 0 ;
      Z9991HreAcCli = 0 ;
      Z9992HreAcSer = "" ;
      Z9993HreAcDsc = "" ;
      Z9994HreAcCol = "" ;
      Z9995HreAcNumC = 0 ;
   }

   public void initAll1R71327( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4492HreBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
      A4493HreBarReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
      A4494HreBarPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
      A4495HreNumCie = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
      A9985HreAcCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9985HreAcCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9985HreAcCod), 8, 0));
      A9986HreAcReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9986HreAcReo", GXutil.str( A9986HreAcReo, 1, 0));
      A9987HreAcPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9987HreAcPar", A9987HreAcPar);
      initializeNonKey1R71327( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101638444", true, true);
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
      httpContext.AddJavascriptSource("hishra.js", "?20266101638445", false, true);
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
      edtHreBarCod_Internalname = "HREBARCOD" ;
      edtHreBarReo_Internalname = "HREBARREO" ;
      edtHreBarPar_Internalname = "HREBARPAR" ;
      edtHreNumCie_Internalname = "HRENUMCIE" ;
      edtHreAcCod_Internalname = "HREACCOD" ;
      edtHreAcReo_Internalname = "HREACREO" ;
      edtHreAcPar_Internalname = "HREACPAR" ;
      edtHreAcKgm_Internalname = "HREACKGM" ;
      edtHreAcMtr_Internalname = "HREACMTR" ;
      edtHreAcPie_Internalname = "HREACPIE" ;
      edtHreAcCli_Internalname = "HREACCLI" ;
      edtHreAcSer_Internalname = "HREACSER" ;
      edtHreAcDsc_Internalname = "HREACDSC" ;
      edtHreAcCol_Internalname = "HREACCOL" ;
      edtHreAcNumC_Internalname = "HREACNUMC" ;
      edtHreAcNHdr_Internalname = "HREACNHDR" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla HISHRA", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtHreAcNHdr_Jsonclick = "" ;
      edtHreAcNHdr_Enabled = 0 ;
      edtHreAcNumC_Jsonclick = "" ;
      edtHreAcNumC_Enabled = 1 ;
      edtHreAcCol_Jsonclick = "" ;
      edtHreAcCol_Enabled = 1 ;
      edtHreAcDsc_Jsonclick = "" ;
      edtHreAcDsc_Enabled = 1 ;
      edtHreAcSer_Jsonclick = "" ;
      edtHreAcSer_Enabled = 1 ;
      edtHreAcCli_Jsonclick = "" ;
      edtHreAcCli_Enabled = 1 ;
      edtHreAcPie_Jsonclick = "" ;
      edtHreAcPie_Enabled = 1 ;
      edtHreAcMtr_Jsonclick = "" ;
      edtHreAcMtr_Enabled = 1 ;
      edtHreAcKgm_Jsonclick = "" ;
      edtHreAcKgm_Enabled = 1 ;
      edtHreAcPar_Jsonclick = "" ;
      edtHreAcPar_Enabled = 1 ;
      edtHreAcReo_Jsonclick = "" ;
      edtHreAcReo_Enabled = 1 ;
      edtHreAcCod_Jsonclick = "" ;
      edtHreAcCod_Enabled = 1 ;
      edtHreNumCie_Jsonclick = "" ;
      edtHreNumCie_Enabled = 1 ;
      edtHreBarPar_Jsonclick = "" ;
      edtHreBarPar_Enabled = 1 ;
      edtHreBarReo_Jsonclick = "" ;
      edtHreBarReo_Enabled = 1 ;
      edtHreBarCod_Jsonclick = "" ;
      edtHreBarCod_Enabled = 1 ;
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
      /* Using cursor T01R714 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(12);
      GX_FocusControl = edtHreAcKgm_Internalname ;
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

   public void valid_Hrenumcie( )
   {
      /* Using cursor T01R714 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Hreacpar( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      A13895HreAcNHdr = GXutil.trim( GXutil.str( A9985HreAcCod, 8, 0)) + "-" + GXutil.str( A9986HreAcReo, 1, 0) + A9987HreAcPar ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9988HreAcKgm", GXutil.ltrim( localUtil.ntoc( A9988HreAcKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9989HreAcMtr", GXutil.ltrim( localUtil.ntoc( A9989HreAcMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9990HreAcPie", GXutil.ltrim( localUtil.ntoc( A9990HreAcPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9991HreAcCli", GXutil.ltrim( localUtil.ntoc( A9991HreAcCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9992HreAcSer", GXutil.rtrim( A9992HreAcSer));
      httpContext.ajax_rsp_assign_attri("", false, "A9993HreAcDsc", GXutil.rtrim( A9993HreAcDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A9994HreAcCol", GXutil.rtrim( A9994HreAcCol));
      httpContext.ajax_rsp_assign_attri("", false, "A9995HreAcNumC", GXutil.ltrim( localUtil.ntoc( A9995HreAcNumC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13895HreAcNHdr", GXutil.rtrim( A13895HreAcNHdr));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9985HreAcCod", GXutil.ltrim( localUtil.ntoc( Z9985HreAcCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9986HreAcReo", GXutil.ltrim( localUtil.ntoc( Z9986HreAcReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9987HreAcPar", GXutil.rtrim( Z9987HreAcPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9988HreAcKgm", GXutil.ltrim( localUtil.ntoc( Z9988HreAcKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9989HreAcMtr", GXutil.ltrim( localUtil.ntoc( Z9989HreAcMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9990HreAcPie", GXutil.ltrim( localUtil.ntoc( Z9990HreAcPie, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9991HreAcCli", GXutil.ltrim( localUtil.ntoc( Z9991HreAcCli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9992HreAcSer", GXutil.rtrim( Z9992HreAcSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9993HreAcDsc", GXutil.rtrim( Z9993HreAcDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9994HreAcCol", GXutil.rtrim( Z9994HreAcCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9995HreAcNumC", GXutil.ltrim( localUtil.ntoc( Z9995HreAcNumC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13895HreAcNHdr", GXutil.rtrim( Z13895HreAcNHdr));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARCOD","{handler:'valid_Hrebarcod',iparms:[]");
      setEventMetadata("VALID_HREBARCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARREO","{handler:'valid_Hrebarreo',iparms:[]");
      setEventMetadata("VALID_HREBARREO",",oparms:[]}");
      setEventMetadata("VALID_HREBARPAR","{handler:'valid_Hrebarpar',iparms:[]");
      setEventMetadata("VALID_HREBARPAR",",oparms:[]}");
      setEventMetadata("VALID_HRENUMCIE","{handler:'valid_Hrenumcie',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'}]");
      setEventMetadata("VALID_HRENUMCIE",",oparms:[]}");
      setEventMetadata("VALID_HREACCOD","{handler:'valid_Hreaccod',iparms:[]");
      setEventMetadata("VALID_HREACCOD",",oparms:[]}");
      setEventMetadata("VALID_HREACREO","{handler:'valid_Hreacreo',iparms:[]");
      setEventMetadata("VALID_HREACREO",",oparms:[]}");
      setEventMetadata("VALID_HREACPAR","{handler:'valid_Hreacpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A9986HreAcReo',fld:'HREACREO',pic:'9'},{av:'A9987HreAcPar',fld:'HREACPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HREACPAR",",oparms:[{av:'A9988HreAcKgm',fld:'HREACKGM',pic:'ZZZZZ9.99'},{av:'A9989HreAcMtr',fld:'HREACMTR',pic:'ZZZZZ9.99'},{av:'A9990HreAcPie',fld:'HREACPIE',pic:'ZZZZZ9'},{av:'A9991HreAcCli',fld:'HREACCLI',pic:'ZZZZZ9'},{av:'A9992HreAcSer',fld:'HREACSER',pic:''},{av:'A9993HreAcDsc',fld:'HREACDSC',pic:''},{av:'A9994HreAcCol',fld:'HREACCOL',pic:''},{av:'A9995HreAcNumC',fld:'HREACNUMC',pic:'ZZZZZ9'},{av:'A13895HreAcNHdr',fld:'HREACNHDR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4492HreBarCod'},{av:'Z4493HreBarReo'},{av:'Z4494HreBarPar'},{av:'Z4495HreNumCie'},{av:'Z9985HreAcCod'},{av:'Z9986HreAcReo'},{av:'Z9987HreAcPar'},{av:'Z9988HreAcKgm'},{av:'Z9989HreAcMtr'},{av:'Z9990HreAcPie'},{av:'Z9991HreAcCli'},{av:'Z9992HreAcSer'},{av:'Z9993HreAcDsc'},{av:'Z9994HreAcCol'},{av:'Z9995HreAcNumC'},{av:'Z13895HreAcNHdr'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(12);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4494HreBarPar = "" ;
      Z9987HreAcPar = "" ;
      Z9988HreAcKgm = DecimalUtil.ZERO ;
      Z9989HreAcMtr = DecimalUtil.ZERO ;
      Z9992HreAcSer = "" ;
      Z9993HreAcDsc = "" ;
      Z9994HreAcCol = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
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
      A9987HreAcPar = "" ;
      A9988HreAcKgm = DecimalUtil.ZERO ;
      A9989HreAcMtr = DecimalUtil.ZERO ;
      A9992HreAcSer = "" ;
      A9993HreAcDsc = "" ;
      A9994HreAcCol = "" ;
      A13895HreAcNHdr = "" ;
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
      T01R75_A9985HreAcCod = new int[1] ;
      T01R75_A9986HreAcReo = new byte[1] ;
      T01R75_A9987HreAcPar = new String[] {""} ;
      T01R75_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R75_n9988HreAcKgm = new boolean[] {false} ;
      T01R75_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R75_n9989HreAcMtr = new boolean[] {false} ;
      T01R75_A9990HreAcPie = new int[1] ;
      T01R75_n9990HreAcPie = new boolean[] {false} ;
      T01R75_A9991HreAcCli = new int[1] ;
      T01R75_n9991HreAcCli = new boolean[] {false} ;
      T01R75_A9992HreAcSer = new String[] {""} ;
      T01R75_n9992HreAcSer = new boolean[] {false} ;
      T01R75_A9993HreAcDsc = new String[] {""} ;
      T01R75_n9993HreAcDsc = new boolean[] {false} ;
      T01R75_A9994HreAcCol = new String[] {""} ;
      T01R75_n9994HreAcCol = new boolean[] {false} ;
      T01R75_A9995HreAcNumC = new int[1] ;
      T01R75_n9995HreAcNumC = new boolean[] {false} ;
      T01R75_A396EmprCod = new String[] {""} ;
      T01R75_A4492HreBarCod = new int[1] ;
      T01R75_A4493HreBarReo = new byte[1] ;
      T01R75_A4494HreBarPar = new String[] {""} ;
      T01R75_A4495HreNumCie = new byte[1] ;
      T01R74_A396EmprCod = new String[] {""} ;
      T01R76_A396EmprCod = new String[] {""} ;
      T01R77_A396EmprCod = new String[] {""} ;
      T01R77_A4492HreBarCod = new int[1] ;
      T01R77_A4493HreBarReo = new byte[1] ;
      T01R77_A4494HreBarPar = new String[] {""} ;
      T01R77_A4495HreNumCie = new byte[1] ;
      T01R77_A9985HreAcCod = new int[1] ;
      T01R77_A9986HreAcReo = new byte[1] ;
      T01R77_A9987HreAcPar = new String[] {""} ;
      T01R73_A9985HreAcCod = new int[1] ;
      T01R73_A9986HreAcReo = new byte[1] ;
      T01R73_A9987HreAcPar = new String[] {""} ;
      T01R73_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R73_n9988HreAcKgm = new boolean[] {false} ;
      T01R73_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R73_n9989HreAcMtr = new boolean[] {false} ;
      T01R73_A9990HreAcPie = new int[1] ;
      T01R73_n9990HreAcPie = new boolean[] {false} ;
      T01R73_A9991HreAcCli = new int[1] ;
      T01R73_n9991HreAcCli = new boolean[] {false} ;
      T01R73_A9992HreAcSer = new String[] {""} ;
      T01R73_n9992HreAcSer = new boolean[] {false} ;
      T01R73_A9993HreAcDsc = new String[] {""} ;
      T01R73_n9993HreAcDsc = new boolean[] {false} ;
      T01R73_A9994HreAcCol = new String[] {""} ;
      T01R73_n9994HreAcCol = new boolean[] {false} ;
      T01R73_A9995HreAcNumC = new int[1] ;
      T01R73_n9995HreAcNumC = new boolean[] {false} ;
      T01R73_A396EmprCod = new String[] {""} ;
      T01R73_A4492HreBarCod = new int[1] ;
      T01R73_A4493HreBarReo = new byte[1] ;
      T01R73_A4494HreBarPar = new String[] {""} ;
      T01R73_A4495HreNumCie = new byte[1] ;
      sMode1327 = "" ;
      T01R78_A396EmprCod = new String[] {""} ;
      T01R78_A4492HreBarCod = new int[1] ;
      T01R78_A4493HreBarReo = new byte[1] ;
      T01R78_A4494HreBarPar = new String[] {""} ;
      T01R78_A4495HreNumCie = new byte[1] ;
      T01R78_A9985HreAcCod = new int[1] ;
      T01R78_A9986HreAcReo = new byte[1] ;
      T01R78_A9987HreAcPar = new String[] {""} ;
      T01R79_A396EmprCod = new String[] {""} ;
      T01R79_A4492HreBarCod = new int[1] ;
      T01R79_A4493HreBarReo = new byte[1] ;
      T01R79_A4494HreBarPar = new String[] {""} ;
      T01R79_A4495HreNumCie = new byte[1] ;
      T01R79_A9985HreAcCod = new int[1] ;
      T01R79_A9986HreAcReo = new byte[1] ;
      T01R79_A9987HreAcPar = new String[] {""} ;
      T01R72_A9985HreAcCod = new int[1] ;
      T01R72_A9986HreAcReo = new byte[1] ;
      T01R72_A9987HreAcPar = new String[] {""} ;
      T01R72_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R72_n9988HreAcKgm = new boolean[] {false} ;
      T01R72_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R72_n9989HreAcMtr = new boolean[] {false} ;
      T01R72_A9990HreAcPie = new int[1] ;
      T01R72_n9990HreAcPie = new boolean[] {false} ;
      T01R72_A9991HreAcCli = new int[1] ;
      T01R72_n9991HreAcCli = new boolean[] {false} ;
      T01R72_A9992HreAcSer = new String[] {""} ;
      T01R72_n9992HreAcSer = new boolean[] {false} ;
      T01R72_A9993HreAcDsc = new String[] {""} ;
      T01R72_n9993HreAcDsc = new boolean[] {false} ;
      T01R72_A9994HreAcCol = new String[] {""} ;
      T01R72_n9994HreAcCol = new boolean[] {false} ;
      T01R72_A9995HreAcNumC = new int[1] ;
      T01R72_n9995HreAcNumC = new boolean[] {false} ;
      T01R72_A396EmprCod = new String[] {""} ;
      T01R72_A4492HreBarCod = new int[1] ;
      T01R72_A4493HreBarReo = new byte[1] ;
      T01R72_A4494HreBarPar = new String[] {""} ;
      T01R72_A4495HreNumCie = new byte[1] ;
      T01R713_A396EmprCod = new String[] {""} ;
      T01R713_A4492HreBarCod = new int[1] ;
      T01R713_A4493HreBarReo = new byte[1] ;
      T01R713_A4494HreBarPar = new String[] {""} ;
      T01R713_A4495HreNumCie = new byte[1] ;
      T01R713_A9985HreAcCod = new int[1] ;
      T01R713_A9986HreAcReo = new byte[1] ;
      T01R713_A9987HreAcPar = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01R714_A396EmprCod = new String[] {""} ;
      Z13895HreAcNHdr = "" ;
      ZZ396EmprCod = "" ;
      ZZ4494HreBarPar = "" ;
      ZZ9987HreAcPar = "" ;
      ZZ9988HreAcKgm = DecimalUtil.ZERO ;
      ZZ9989HreAcMtr = DecimalUtil.ZERO ;
      ZZ9992HreAcSer = "" ;
      ZZ9993HreAcDsc = "" ;
      ZZ9994HreAcCol = "" ;
      ZZ13895HreAcNHdr = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.hishra__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.hishra__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.hishra__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.hishra__default(),
         new Object[] {
             new Object[] {
            T01R72_A9985HreAcCod, T01R72_A9986HreAcReo, T01R72_A9987HreAcPar, T01R72_A9988HreAcKgm, T01R72_n9988HreAcKgm, T01R72_A9989HreAcMtr, T01R72_n9989HreAcMtr, T01R72_A9990HreAcPie, T01R72_n9990HreAcPie, T01R72_A9991HreAcCli,
            T01R72_n9991HreAcCli, T01R72_A9992HreAcSer, T01R72_n9992HreAcSer, T01R72_A9993HreAcDsc, T01R72_n9993HreAcDsc, T01R72_A9994HreAcCol, T01R72_n9994HreAcCol, T01R72_A9995HreAcNumC, T01R72_n9995HreAcNumC, T01R72_A396EmprCod,
            T01R72_A4492HreBarCod, T01R72_A4493HreBarReo, T01R72_A4494HreBarPar, T01R72_A4495HreNumCie
            }
            , new Object[] {
            T01R73_A9985HreAcCod, T01R73_A9986HreAcReo, T01R73_A9987HreAcPar, T01R73_A9988HreAcKgm, T01R73_n9988HreAcKgm, T01R73_A9989HreAcMtr, T01R73_n9989HreAcMtr, T01R73_A9990HreAcPie, T01R73_n9990HreAcPie, T01R73_A9991HreAcCli,
            T01R73_n9991HreAcCli, T01R73_A9992HreAcSer, T01R73_n9992HreAcSer, T01R73_A9993HreAcDsc, T01R73_n9993HreAcDsc, T01R73_A9994HreAcCol, T01R73_n9994HreAcCol, T01R73_A9995HreAcNumC, T01R73_n9995HreAcNumC, T01R73_A396EmprCod,
            T01R73_A4492HreBarCod, T01R73_A4493HreBarReo, T01R73_A4494HreBarPar, T01R73_A4495HreNumCie
            }
            , new Object[] {
            T01R74_A396EmprCod
            }
            , new Object[] {
            T01R75_A9985HreAcCod, T01R75_A9986HreAcReo, T01R75_A9987HreAcPar, T01R75_A9988HreAcKgm, T01R75_n9988HreAcKgm, T01R75_A9989HreAcMtr, T01R75_n9989HreAcMtr, T01R75_A9990HreAcPie, T01R75_n9990HreAcPie, T01R75_A9991HreAcCli,
            T01R75_n9991HreAcCli, T01R75_A9992HreAcSer, T01R75_n9992HreAcSer, T01R75_A9993HreAcDsc, T01R75_n9993HreAcDsc, T01R75_A9994HreAcCol, T01R75_n9994HreAcCol, T01R75_A9995HreAcNumC, T01R75_n9995HreAcNumC, T01R75_A396EmprCod,
            T01R75_A4492HreBarCod, T01R75_A4493HreBarReo, T01R75_A4494HreBarPar, T01R75_A4495HreNumCie
            }
            , new Object[] {
            T01R76_A396EmprCod
            }
            , new Object[] {
            T01R77_A396EmprCod, T01R77_A4492HreBarCod, T01R77_A4493HreBarReo, T01R77_A4494HreBarPar, T01R77_A4495HreNumCie, T01R77_A9985HreAcCod, T01R77_A9986HreAcReo, T01R77_A9987HreAcPar
            }
            , new Object[] {
            T01R78_A396EmprCod, T01R78_A4492HreBarCod, T01R78_A4493HreBarReo, T01R78_A4494HreBarPar, T01R78_A4495HreNumCie, T01R78_A9985HreAcCod, T01R78_A9986HreAcReo, T01R78_A9987HreAcPar
            }
            , new Object[] {
            T01R79_A396EmprCod, T01R79_A4492HreBarCod, T01R79_A4493HreBarReo, T01R79_A4494HreBarPar, T01R79_A4495HreNumCie, T01R79_A9985HreAcCod, T01R79_A9986HreAcReo, T01R79_A9987HreAcPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01R713_A396EmprCod, T01R713_A4492HreBarCod, T01R713_A4493HreBarReo, T01R713_A4494HreBarPar, T01R713_A4495HreNumCie, T01R713_A9985HreAcCod, T01R713_A9986HreAcReo, T01R713_A9987HreAcPar
            }
            , new Object[] {
            T01R714_A396EmprCod
            }
         }
      );
   }

   private byte Z4493HreBarReo ;
   private byte Z4495HreNumCie ;
   private byte Z9986HreAcReo ;
   private byte GxWebError ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte nKeyPressed ;
   private byte A9986HreAcReo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ4493HreBarReo ;
   private byte ZZ4495HreNumCie ;
   private byte ZZ9986HreAcReo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1327 ;
   private short nIsDirty_1327 ;
   private int Z4492HreBarCod ;
   private int Z9985HreAcCod ;
   private int Z9990HreAcPie ;
   private int Z9991HreAcCli ;
   private int Z9995HreAcNumC ;
   private int A4492HreBarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtHreBarCod_Enabled ;
   private int edtHreBarReo_Enabled ;
   private int edtHreBarPar_Enabled ;
   private int edtHreNumCie_Enabled ;
   private int A9985HreAcCod ;
   private int edtHreAcCod_Enabled ;
   private int edtHreAcReo_Enabled ;
   private int edtHreAcPar_Enabled ;
   private int edtHreAcKgm_Enabled ;
   private int edtHreAcMtr_Enabled ;
   private int A9990HreAcPie ;
   private int edtHreAcPie_Enabled ;
   private int A9991HreAcCli ;
   private int edtHreAcCli_Enabled ;
   private int edtHreAcSer_Enabled ;
   private int edtHreAcDsc_Enabled ;
   private int edtHreAcCol_Enabled ;
   private int A9995HreAcNumC ;
   private int edtHreAcNumC_Enabled ;
   private int edtHreAcNHdr_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ4492HreBarCod ;
   private int ZZ9985HreAcCod ;
   private int ZZ9990HreAcPie ;
   private int ZZ9991HreAcCli ;
   private int ZZ9995HreAcNumC ;
   private java.math.BigDecimal Z9988HreAcKgm ;
   private java.math.BigDecimal Z9989HreAcMtr ;
   private java.math.BigDecimal A9988HreAcKgm ;
   private java.math.BigDecimal A9989HreAcMtr ;
   private java.math.BigDecimal ZZ9988HreAcKgm ;
   private java.math.BigDecimal ZZ9989HreAcMtr ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4494HreBarPar ;
   private String Z9987HreAcPar ;
   private String Z9992HreAcSer ;
   private String Z9993HreAcDsc ;
   private String Z9994HreAcCol ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
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
   private String edtHreBarCod_Internalname ;
   private String edtHreBarCod_Jsonclick ;
   private String edtHreBarReo_Internalname ;
   private String edtHreBarReo_Jsonclick ;
   private String edtHreBarPar_Internalname ;
   private String edtHreBarPar_Jsonclick ;
   private String edtHreNumCie_Internalname ;
   private String edtHreNumCie_Jsonclick ;
   private String edtHreAcCod_Internalname ;
   private String edtHreAcCod_Jsonclick ;
   private String edtHreAcReo_Internalname ;
   private String edtHreAcReo_Jsonclick ;
   private String edtHreAcPar_Internalname ;
   private String A9987HreAcPar ;
   private String edtHreAcPar_Jsonclick ;
   private String edtHreAcKgm_Internalname ;
   private String edtHreAcKgm_Jsonclick ;
   private String edtHreAcMtr_Internalname ;
   private String edtHreAcMtr_Jsonclick ;
   private String edtHreAcPie_Internalname ;
   private String edtHreAcPie_Jsonclick ;
   private String edtHreAcCli_Internalname ;
   private String edtHreAcCli_Jsonclick ;
   private String edtHreAcSer_Internalname ;
   private String A9992HreAcSer ;
   private String edtHreAcSer_Jsonclick ;
   private String edtHreAcDsc_Internalname ;
   private String A9993HreAcDsc ;
   private String edtHreAcDsc_Jsonclick ;
   private String edtHreAcCol_Internalname ;
   private String A9994HreAcCol ;
   private String edtHreAcCol_Jsonclick ;
   private String edtHreAcNumC_Internalname ;
   private String edtHreAcNumC_Jsonclick ;
   private String edtHreAcNHdr_Internalname ;
   private String A13895HreAcNHdr ;
   private String edtHreAcNHdr_Jsonclick ;
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
   private String sMode1327 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z13895HreAcNHdr ;
   private String ZZ396EmprCod ;
   private String ZZ4494HreBarPar ;
   private String ZZ9987HreAcPar ;
   private String ZZ9992HreAcSer ;
   private String ZZ9993HreAcDsc ;
   private String ZZ9994HreAcCol ;
   private String ZZ13895HreAcNHdr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n9988HreAcKgm ;
   private boolean n9989HreAcMtr ;
   private boolean n9990HreAcPie ;
   private boolean n9991HreAcCli ;
   private boolean n9992HreAcSer ;
   private boolean n9993HreAcDsc ;
   private boolean n9994HreAcCol ;
   private boolean n9995HreAcNumC ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private int[] T01R75_A9985HreAcCod ;
   private byte[] T01R75_A9986HreAcReo ;
   private String[] T01R75_A9987HreAcPar ;
   private java.math.BigDecimal[] T01R75_A9988HreAcKgm ;
   private boolean[] T01R75_n9988HreAcKgm ;
   private java.math.BigDecimal[] T01R75_A9989HreAcMtr ;
   private boolean[] T01R75_n9989HreAcMtr ;
   private int[] T01R75_A9990HreAcPie ;
   private boolean[] T01R75_n9990HreAcPie ;
   private int[] T01R75_A9991HreAcCli ;
   private boolean[] T01R75_n9991HreAcCli ;
   private String[] T01R75_A9992HreAcSer ;
   private boolean[] T01R75_n9992HreAcSer ;
   private String[] T01R75_A9993HreAcDsc ;
   private boolean[] T01R75_n9993HreAcDsc ;
   private String[] T01R75_A9994HreAcCol ;
   private boolean[] T01R75_n9994HreAcCol ;
   private int[] T01R75_A9995HreAcNumC ;
   private boolean[] T01R75_n9995HreAcNumC ;
   private String[] T01R75_A396EmprCod ;
   private int[] T01R75_A4492HreBarCod ;
   private byte[] T01R75_A4493HreBarReo ;
   private String[] T01R75_A4494HreBarPar ;
   private byte[] T01R75_A4495HreNumCie ;
   private String[] T01R74_A396EmprCod ;
   private String[] T01R76_A396EmprCod ;
   private String[] T01R77_A396EmprCod ;
   private int[] T01R77_A4492HreBarCod ;
   private byte[] T01R77_A4493HreBarReo ;
   private String[] T01R77_A4494HreBarPar ;
   private byte[] T01R77_A4495HreNumCie ;
   private int[] T01R77_A9985HreAcCod ;
   private byte[] T01R77_A9986HreAcReo ;
   private String[] T01R77_A9987HreAcPar ;
   private int[] T01R73_A9985HreAcCod ;
   private byte[] T01R73_A9986HreAcReo ;
   private String[] T01R73_A9987HreAcPar ;
   private java.math.BigDecimal[] T01R73_A9988HreAcKgm ;
   private boolean[] T01R73_n9988HreAcKgm ;
   private java.math.BigDecimal[] T01R73_A9989HreAcMtr ;
   private boolean[] T01R73_n9989HreAcMtr ;
   private int[] T01R73_A9990HreAcPie ;
   private boolean[] T01R73_n9990HreAcPie ;
   private int[] T01R73_A9991HreAcCli ;
   private boolean[] T01R73_n9991HreAcCli ;
   private String[] T01R73_A9992HreAcSer ;
   private boolean[] T01R73_n9992HreAcSer ;
   private String[] T01R73_A9993HreAcDsc ;
   private boolean[] T01R73_n9993HreAcDsc ;
   private String[] T01R73_A9994HreAcCol ;
   private boolean[] T01R73_n9994HreAcCol ;
   private int[] T01R73_A9995HreAcNumC ;
   private boolean[] T01R73_n9995HreAcNumC ;
   private String[] T01R73_A396EmprCod ;
   private int[] T01R73_A4492HreBarCod ;
   private byte[] T01R73_A4493HreBarReo ;
   private String[] T01R73_A4494HreBarPar ;
   private byte[] T01R73_A4495HreNumCie ;
   private String[] T01R78_A396EmprCod ;
   private int[] T01R78_A4492HreBarCod ;
   private byte[] T01R78_A4493HreBarReo ;
   private String[] T01R78_A4494HreBarPar ;
   private byte[] T01R78_A4495HreNumCie ;
   private int[] T01R78_A9985HreAcCod ;
   private byte[] T01R78_A9986HreAcReo ;
   private String[] T01R78_A9987HreAcPar ;
   private String[] T01R79_A396EmprCod ;
   private int[] T01R79_A4492HreBarCod ;
   private byte[] T01R79_A4493HreBarReo ;
   private String[] T01R79_A4494HreBarPar ;
   private byte[] T01R79_A4495HreNumCie ;
   private int[] T01R79_A9985HreAcCod ;
   private byte[] T01R79_A9986HreAcReo ;
   private String[] T01R79_A9987HreAcPar ;
   private int[] T01R72_A9985HreAcCod ;
   private byte[] T01R72_A9986HreAcReo ;
   private String[] T01R72_A9987HreAcPar ;
   private java.math.BigDecimal[] T01R72_A9988HreAcKgm ;
   private boolean[] T01R72_n9988HreAcKgm ;
   private java.math.BigDecimal[] T01R72_A9989HreAcMtr ;
   private boolean[] T01R72_n9989HreAcMtr ;
   private int[] T01R72_A9990HreAcPie ;
   private boolean[] T01R72_n9990HreAcPie ;
   private int[] T01R72_A9991HreAcCli ;
   private boolean[] T01R72_n9991HreAcCli ;
   private String[] T01R72_A9992HreAcSer ;
   private boolean[] T01R72_n9992HreAcSer ;
   private String[] T01R72_A9993HreAcDsc ;
   private boolean[] T01R72_n9993HreAcDsc ;
   private String[] T01R72_A9994HreAcCol ;
   private boolean[] T01R72_n9994HreAcCol ;
   private int[] T01R72_A9995HreAcNumC ;
   private boolean[] T01R72_n9995HreAcNumC ;
   private String[] T01R72_A396EmprCod ;
   private int[] T01R72_A4492HreBarCod ;
   private byte[] T01R72_A4493HreBarReo ;
   private String[] T01R72_A4494HreBarPar ;
   private byte[] T01R72_A4495HreNumCie ;
   private String[] T01R713_A396EmprCod ;
   private int[] T01R713_A4492HreBarCod ;
   private byte[] T01R713_A4493HreBarReo ;
   private String[] T01R713_A4494HreBarPar ;
   private byte[] T01R713_A4495HreNumCie ;
   private int[] T01R713_A9985HreAcCod ;
   private byte[] T01R713_A9986HreAcReo ;
   private String[] T01R713_A9987HreAcPar ;
   private String[] T01R714_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class hishra__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hishra__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hishra__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hishra__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01R72", "SELECT HreAcCod, HreAcReo, HreAcPar, HreAcKgm, HreAcMtr, HreAcPie, HreAcCli, HreAcSer, HreAcDsc, HreAcCol, HreAcNumC, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISHRA WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAcCod = ? AND HreAcReo = ? AND HreAcPar = ?  FOR UPDATE OF HreAcKgm, HreAcMtr, HreAcPie, HreAcCli, HreAcSer, HreAcDsc, HreAcCol, HreAcNumC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R73", "SELECT HreAcCod, HreAcReo, HreAcPar, HreAcKgm, HreAcMtr, HreAcPie, HreAcCli, HreAcSer, HreAcDsc, HreAcCol, HreAcNumC, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISHRA WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAcCod = ? AND HreAcReo = ? AND HreAcPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R74", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R75", "SELECT /*+ FIRST_ROWS(100) */ TM1.HreAcCod, TM1.HreAcReo, TM1.HreAcPar, TM1.HreAcKgm, TM1.HreAcMtr, TM1.HreAcPie, TM1.HreAcCli, TM1.HreAcSer, TM1.HreAcDsc, TM1.HreAcCol, TM1.HreAcNumC, TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie FROM TXPHISHRA TM1 WHERE TM1.EmprCod = ? and TM1.HreBarCod = ? and TM1.HreBarReo = ? and TM1.HreBarPar = ? and TM1.HreNumCie = ? and TM1.HreAcCod = ? and TM1.HreAcReo = ? and TM1.HreAcPar = ? ORDER BY TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie, TM1.HreAcCod, TM1.HreAcReo, TM1.HreAcPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R76", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R77", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar FROM TXPHISHRA WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAcCod = ? AND HreAcReo = ? AND HreAcPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R78", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar FROM TXPHISHRA WHERE ( EmprCod > ? or EmprCod = ? and HreBarCod > ? or HreBarCod = ? and EmprCod = ? and HreBarReo > ? or HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreBarPar > ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreNumCie > ? or HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreAcCod > ? or HreAcCod = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreAcReo > ? or HreAcReo = ? and HreAcCod = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreAcPar > ?) ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01R79", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar FROM TXPHISHRA WHERE ( EmprCod < ? or EmprCod = ? and HreBarCod < ? or HreBarCod = ? and EmprCod = ? and HreBarReo < ? or HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreBarPar < ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreNumCie < ? or HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreAcCod < ? or HreAcCod = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreAcReo < ? or HreAcReo = ? and HreAcCod = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreAcPar < ?) ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreAcCod DESC, HreAcReo DESC, HreAcPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01R710", "INSERT INTO TXPHISHRA(HreAcCod, HreAcReo, HreAcPar, HreAcKgm, HreAcMtr, HreAcPie, HreAcCli, HreAcSer, HreAcDsc, HreAcCol, HreAcNumC, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHISHRA")
         ,new UpdateCursor("T01R711", "UPDATE TXPHISHRA SET HreAcKgm=?, HreAcMtr=?, HreAcPie=?, HreAcCli=?, HreAcSer=?, HreAcDsc=?, HreAcCol=?, HreAcNumC=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAcCod = ? AND HreAcReo = ? AND HreAcPar = ?", GX_NOMASK, "TXPHISHRA")
         ,new UpdateCursor("T01R712", "DELETE FROM TXPHISHRA  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAcCod = ? AND HreAcReo = ? AND HreAcPar = ?", GX_NOMASK, "TXPHISHRA")
         ,new ForEachCursor("T01R713", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar FROM TXPHISHRA ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R714", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               ((int[]) buf[20])[0] = rslt.getInt(13);
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(16);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               ((int[]) buf[20])[0] = rslt.getInt(13);
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               ((int[]) buf[20])[0] = rslt.getInt(13);
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 12 :
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 6 :
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
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setInt(22, ((Number) parms[21]).intValue());
               stmt.setByte(23, ((Number) parms[22]).byteValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setByte(28, ((Number) parms[27]).byteValue());
               stmt.setByte(29, ((Number) parms[28]).byteValue());
               stmt.setInt(30, ((Number) parms[29]).intValue());
               stmt.setByte(31, ((Number) parms[30]).byteValue());
               stmt.setString(32, (String)parms[31], 1);
               stmt.setByte(33, ((Number) parms[32]).byteValue());
               stmt.setInt(34, ((Number) parms[33]).intValue());
               stmt.setString(35, (String)parms[34], 3);
               stmt.setString(36, (String)parms[35], 1);
               return;
            case 7 :
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
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setInt(22, ((Number) parms[21]).intValue());
               stmt.setByte(23, ((Number) parms[22]).byteValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setByte(28, ((Number) parms[27]).byteValue());
               stmt.setByte(29, ((Number) parms[28]).byteValue());
               stmt.setInt(30, ((Number) parms[29]).intValue());
               stmt.setByte(31, ((Number) parms[30]).byteValue());
               stmt.setString(32, (String)parms[31], 1);
               stmt.setByte(33, ((Number) parms[32]).byteValue());
               stmt.setInt(34, ((Number) parms[33]).intValue());
               stmt.setString(35, (String)parms[34], 3);
               stmt.setString(36, (String)parms[35], 1);
               return;
            case 8 :
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
                  stmt.setInt(6, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 16);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 26);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 13);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[18]).intValue());
               }
               stmt.setString(12, (String)parms[19], 3);
               stmt.setInt(13, ((Number) parms[20]).intValue());
               stmt.setByte(14, ((Number) parms[21]).byteValue());
               stmt.setString(15, (String)parms[22], 1);
               stmt.setByte(16, ((Number) parms[23]).byteValue());
               return;
            case 9 :
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
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 26);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 13);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setByte(11, ((Number) parms[18]).byteValue());
               stmt.setString(12, (String)parms[19], 1);
               stmt.setByte(13, ((Number) parms[20]).byteValue());
               stmt.setInt(14, ((Number) parms[21]).intValue());
               stmt.setByte(15, ((Number) parms[22]).byteValue());
               stmt.setString(16, (String)parms[23], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

