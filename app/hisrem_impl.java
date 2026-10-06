package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hisrem_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla HISREM", ""), (short)(0)) ;
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

   public hisrem_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hisrem_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hisrem_impl.class ));
   }

   public hisrem_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla HISREM", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_HISREM.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_HISREM.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISREM.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarPar_Internalname, GXutil.rtrim( A4494HreBarPar), GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISREM.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumCie_Internalname, GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumCie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumCie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreNumCie_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreLinMaq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreLinMaq_Internalname, httpContext.getMessage( "Linea Maquina. Hist.Receta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLinMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLinMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLinMaq_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreLinMaq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreMaqCod_Internalname, httpContext.getMessage( "Maquina Hdr. Hist.Receta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreMaqCod_Internalname, GXutil.rtrim( A4546HreMaqCod), GXutil.rtrim( localUtil.format( A4546HreMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreVolPrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreVolPrd_Internalname, httpContext.getMessage( "Volumen Maq. Hist.Receta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreVolPrd_Internalname, GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreVolPrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4547HreVolPrd), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4547HreVolPrd), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreVolPrd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreVolPrd_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreFacAbs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreFacAbs_Internalname, httpContext.getMessage( "Factor Abs.Hist.Receta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFacAbs_Internalname, GXutil.ltrim( localUtil.ntoc( A4548HreFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreFacAbs_Enabled!=0) ? localUtil.format( A4548HreFacAbs, "ZZ9.99") : localUtil.format( A4548HreFacAbs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFacAbs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreFacAbs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreFecPes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreFecPes_Internalname, httpContext.getMessage( "Fecha Hora Pesaje", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHreFecPes_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFecPes_Internalname, localUtil.ttoc( A4584HreFecPes, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4584HreFecPes, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFecPes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreFecPes_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHreFecPes_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHreFecPes_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_HISREM.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreMaqPes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreMaqPes_Internalname, httpContext.getMessage( "Maquina Pesada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreMaqPes_Internalname, GXutil.ltrim( localUtil.ntoc( A4585HreMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreMaqPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4585HreMaqPes), "9") : localUtil.format( DecimalUtil.doubleToDec(A4585HreMaqPes), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreMaqPes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreMaqPes_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreULinPro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreULinPro_Internalname, httpContext.getMessage( "Ul.Lin.Proceso Rec.Hist.Receta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreULinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A4549HreULinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreULinPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4549HreULinPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4549HreULinPro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreULinPro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreULinPro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreUsrCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreUsrCod_Internalname, httpContext.getMessage( "Usuario creo receta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreUsrCod_Internalname, GXutil.rtrim( A4863HreUsrCod), GXutil.rtrim( localUtil.format( A4863HreUsrCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreUsrCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreUsrCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHReMaqNh_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHReMaqNh_Internalname, httpContext.getMessage( "HReMaqNh", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHReMaqNh_Internalname, GXutil.ltrim( localUtil.ntoc( A7814HReMaqNh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHReMaqNh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7814HReMaqNh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7814HReMaqNh), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHReMaqNh_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHReMaqNh_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHReMaqVX_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHReMaqVX_Internalname, httpContext.getMessage( "HReMaqVX", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHReMaqVX_Internalname, GXutil.ltrim( localUtil.ntoc( A7815HReMaqVX, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHReMaqVX_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7815HReMaqVX), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7815HReMaqVX), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHReMaqVX_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHReMaqVX_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHReMaqBL_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHReMaqBL_Internalname, httpContext.getMessage( "HReMaqBL", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHReMaqBL_Internalname, GXutil.ltrim( localUtil.ntoc( A7816HReMaqBL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHReMaqBL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7816HReMaqBL), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7816HReMaqBL), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHReMaqBL_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHReMaqBL_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHReMaqFlow_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHReMaqFlow_Internalname, httpContext.getMessage( "HReMaqFlow", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHReMaqFlow_Internalname, GXutil.ltrim( localUtil.ntoc( A7817HReMaqFlow, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHReMaqFlow_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7817HReMaqFlow), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7817HReMaqFlow), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHReMaqFlow_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHReMaqFlow_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHReMaqRPM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHReMaqRPM_Internalname, httpContext.getMessage( "HReMaqRPM", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHReMaqRPM_Internalname, GXutil.ltrim( localUtil.ntoc( A7818HReMaqRPM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHReMaqRPM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7818HReMaqRPM), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7818HReMaqRPM), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHReMaqRPM_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHReMaqRPM_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHReMaqMol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHReMaqMol_Internalname, httpContext.getMessage( "HReMaqMol", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHReMaqMol_Internalname, GXutil.ltrim( localUtil.ntoc( A7819HReMaqMol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHReMaqMol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7819HReMaqMol), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7819HReMaqMol), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHReMaqMol_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHReMaqMol_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHReMaqTor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHReMaqTor_Internalname, httpContext.getMessage( "HReMaqTor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHReMaqTor_Internalname, GXutil.ltrim( localUtil.ntoc( A7820HReMaqTor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHReMaqTor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7820HReMaqTor), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7820HReMaqTor), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHReMaqTor_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHReMaqTor_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHReMaqCla_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHReMaqCla_Internalname, httpContext.getMessage( "HReMaqCla", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHReMaqCla_Internalname, GXutil.rtrim( A7821HReMaqCla), GXutil.rtrim( localUtil.format( A7821HReMaqCla, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHReMaqCla_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHReMaqCla_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHReMaqTej_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHReMaqTej_Internalname, httpContext.getMessage( "HReMaqTej", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHReMaqTej_Internalname, GXutil.ltrim( localUtil.ntoc( A7822HReMaqTej, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHReMaqTej_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7822HReMaqTej), "9") : localUtil.format( DecimalUtil.doubleToDec(A7822HReMaqTej), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHReMaqTej_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHReMaqTej_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHReMaqDel_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHReMaqDel_Internalname, httpContext.getMessage( "HReMaqDel", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHReMaqDel_Internalname, GXutil.ltrim( localUtil.ntoc( A7823HReMaqDel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHReMaqDel_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7823HReMaqDel), "9") : localUtil.format( DecimalUtil.doubleToDec(A7823HReMaqDel), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHReMaqDel_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHReMaqDel_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHReMaqPML_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHReMaqPML_Internalname, httpContext.getMessage( "HReMaqPML", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHReMaqPML_Internalname, GXutil.ltrim( localUtil.ntoc( A7824HReMaqPML, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHReMaqPML_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7824HReMaqPML), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7824HReMaqPML), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHReMaqPML_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHReMaqPML_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreCosAA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreCosAA_Internalname, httpContext.getMessage( "HreCosAA", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreCosAA_Internalname, GXutil.ltrim( localUtil.ntoc( A8602HreCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreCosAA_Enabled!=0) ? localUtil.format( A8602HreCosAA, "ZZZZZZ9.99") : localUtil.format( A8602HreCosAA, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreCosAA_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreCosAA_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHrecosAd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHrecosAd_Internalname, httpContext.getMessage( "HrecosAd", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrecosAd_Internalname, GXutil.ltrim( localUtil.ntoc( A8603HrecosAd, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHrecosAd_Enabled!=0) ? localUtil.format( A8603HrecosAd, "ZZZZZZ9.99") : localUtil.format( A8603HrecosAd, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrecosAd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHrecosAd_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreCosAnc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreCosAnc_Internalname, httpContext.getMessage( "HreCosAnc", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreCosAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A8604HreCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreCosAnc_Enabled!=0) ? localUtil.format( A8604HreCosAnc, "ZZZZZZ9.99") : localUtil.format( A8604HreCosAnc, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreCosAnc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreCosAnc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreCosCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreCosCol_Internalname, httpContext.getMessage( "HreCosCol", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreCosCol_Internalname, GXutil.ltrim( localUtil.ntoc( A8605HreCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreCosCol_Enabled!=0) ? localUtil.format( A8605HreCosCol, "ZZZZZZ9.99") : localUtil.format( A8605HreCosCol, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreCosCol_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreCosCol_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreCosPA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreCosPA_Internalname, httpContext.getMessage( "HreCosPA", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreCosPA_Internalname, GXutil.ltrim( localUtil.ntoc( A8606HreCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreCosPA_Enabled!=0) ? localUtil.format( A8606HreCosPA, "ZZZZZZ9.99") : localUtil.format( A8606HreCosPA, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreCosPA_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreCosPA_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreCosPD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreCosPD_Internalname, httpContext.getMessage( "HreCosPD", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreCosPD_Internalname, GXutil.ltrim( localUtil.ntoc( A8607HreCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreCosPD_Enabled!=0) ? localUtil.format( A8607HreCosPD, "ZZZZZZ9.99") : localUtil.format( A8607HreCosPD, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreCosPD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreCosPD_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreLtsSb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreLtsSb_Internalname, httpContext.getMessage( "Lts Sobrantes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLtsSb_Internalname, GXutil.ltrim( localUtil.ntoc( A9780HreLtsSb, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLtsSb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9780HreLtsSb), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9780HreLtsSb), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLtsSb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreLtsSb_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreLtsRm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreLtsRm_Internalname, httpContext.getMessage( "Lts Remante", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLtsRm_Internalname, GXutil.ltrim( localUtil.ntoc( A9781HreLtsRm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLtsRm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9781HreLtsRm), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9781HreLtsRm), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLtsRm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreLtsRm_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAcaQ_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAcaQ_Internalname, httpContext.getMessage( "Proceso Acab Quimico", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcaQ_Internalname, GXutil.rtrim( A9803HreAcaQ), GXutil.rtrim( localUtil.format( A9803HreAcaQ, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcaQ_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAcaQ_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAcab_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAcab_Internalname, httpContext.getMessage( "Receta Acabado?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcab_Internalname, GXutil.rtrim( A9804HreAcab), GXutil.rtrim( localUtil.format( A9804HreAcab, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcab_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAcab_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISREM.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreNPrg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreNPrg_Internalname, httpContext.getMessage( "N Programa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNPrg_Internalname, GXutil.rtrim( A1094HreNPrg), GXutil.rtrim( localUtil.format( A1094HreNPrg, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNPrg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreNPrg_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreLotF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreLotF_Internalname, httpContext.getMessage( "Lote de Hilado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLotF_Internalname, GXutil.rtrim( A697HreLotF), GXutil.rtrim( localUtil.format( A697HreLotF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLotF_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreLotF_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAnc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAnc_Internalname, httpContext.getMessage( "Ancho Carvema", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A10381HreAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10381HreAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10381HreAnc), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAnc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAnc_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreGrm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreGrm_Internalname, httpContext.getMessage( "Grrm Carvema", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreGrm_Internalname, GXutil.ltrim( localUtil.ntoc( A10382HreGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreGrm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10382HreGrm), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10382HreGrm), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,219);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreGrm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreGrm_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreVel_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreVel_Internalname, httpContext.getMessage( "Vel Carvema", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreVel_Internalname, GXutil.ltrim( localUtil.ntoc( A10383HreVel, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreVel_Enabled!=0) ? localUtil.format( A10383HreVel, "ZZ9.99") : localUtil.format( A10383HreVel, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreVel_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreVel_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreObs_Internalname, httpContext.getMessage( "Obs Carvema", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtHreObs_Internalname, A10384HreObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,229);\"", (short)(0), 1, edtHreObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "800", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAva_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAva_Internalname, httpContext.getMessage( "Avanza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAva_Internalname, GXutil.rtrim( A11508HreAva), GXutil.rtrim( localUtil.format( A11508HreAva, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAva_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAva_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAs_Internalname, httpContext.getMessage( "AS", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAs_Internalname, GXutil.rtrim( A12126HreAs), GXutil.rtrim( localUtil.format( A12126HreAs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAs_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAi_Internalname, httpContext.getMessage( "AI", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAi_Internalname, GXutil.rtrim( A12127HreAi), GXutil.rtrim( localUtil.format( A12127HreAi, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,244);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAi_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAi_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISREM.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISREM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 253,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISREM.htm");
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
         Z4545HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( "Z4545HreLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4546HreMaqCod = httpContext.cgiGet( "Z4546HreMaqCod") ;
         Z4547HreVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( "Z4547HreVolPrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4548HreFacAbs = localUtil.ctond( httpContext.cgiGet( "Z4548HreFacAbs")) ;
         Z4584HreFecPes = localUtil.ctot( httpContext.cgiGet( "Z4584HreFecPes"), 0) ;
         Z4585HreMaqPes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4585HreMaqPes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4549HreULinPro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4549HreULinPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4863HreUsrCod = httpContext.cgiGet( "Z4863HreUsrCod") ;
         Z7814HReMaqNh = (short)(localUtil.ctol( httpContext.cgiGet( "Z7814HReMaqNh"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7815HReMaqVX = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7815HReMaqVX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7816HReMaqBL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7816HReMaqBL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7817HReMaqFlow = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7817HReMaqFlow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7818HReMaqRPM = (short)(localUtil.ctol( httpContext.cgiGet( "Z7818HReMaqRPM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7819HReMaqMol = (short)(localUtil.ctol( httpContext.cgiGet( "Z7819HReMaqMol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7820HReMaqTor = (short)(localUtil.ctol( httpContext.cgiGet( "Z7820HReMaqTor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7821HReMaqCla = httpContext.cgiGet( "Z7821HReMaqCla") ;
         Z7822HReMaqTej = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7822HReMaqTej"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7823HReMaqDel = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7823HReMaqDel"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7824HReMaqPML = (short)(localUtil.ctol( httpContext.cgiGet( "Z7824HReMaqPML"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8602HreCosAA = localUtil.ctond( httpContext.cgiGet( "Z8602HreCosAA")) ;
         Z8603HrecosAd = localUtil.ctond( httpContext.cgiGet( "Z8603HrecosAd")) ;
         Z8604HreCosAnc = localUtil.ctond( httpContext.cgiGet( "Z8604HreCosAnc")) ;
         Z8605HreCosCol = localUtil.ctond( httpContext.cgiGet( "Z8605HreCosCol")) ;
         Z8606HreCosPA = localUtil.ctond( httpContext.cgiGet( "Z8606HreCosPA")) ;
         Z8607HreCosPD = localUtil.ctond( httpContext.cgiGet( "Z8607HreCosPD")) ;
         Z9780HreLtsSb = (int)(localUtil.ctol( httpContext.cgiGet( "Z9780HreLtsSb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9781HreLtsRm = (int)(localUtil.ctol( httpContext.cgiGet( "Z9781HreLtsRm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9803HreAcaQ = httpContext.cgiGet( "Z9803HreAcaQ") ;
         Z9804HreAcab = httpContext.cgiGet( "Z9804HreAcab") ;
         Z1094HreNPrg = httpContext.cgiGet( "Z1094HreNPrg") ;
         Z697HreLotF = httpContext.cgiGet( "Z697HreLotF") ;
         Z10381HreAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z10381HreAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10382HreGrm = (short)(localUtil.ctol( httpContext.cgiGet( "Z10382HreGrm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10383HreVel = localUtil.ctond( httpContext.cgiGet( "Z10383HreVel")) ;
         Z10384HreObs = httpContext.cgiGet( "Z10384HreObs") ;
         Z11508HreAva = httpContext.cgiGet( "Z11508HreAva") ;
         Z12126HreAs = httpContext.cgiGet( "Z12126HreAs") ;
         Z12127HreAi = httpContext.cgiGet( "Z12127HreAi") ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRELINMAQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreLinMaq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4545HreLinMaq = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
         }
         else
         {
            A4545HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
         }
         A4546HreMaqCod = httpContext.cgiGet( edtHreMaqCod_Internalname) ;
         n4546HreMaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4546HreMaqCod", A4546HreMaqCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREVOLPRD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreVolPrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4547HreVolPrd = 0 ;
            n4547HreVolPrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4547HreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4547HreVolPrd), 5, 0));
         }
         else
         {
            A4547HreVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtHreVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4547HreVolPrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4547HreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4547HreVolPrd), 5, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreFacAbs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreFacAbs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREFACABS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreFacAbs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4548HreFacAbs = DecimalUtil.ZERO ;
            n4548HreFacAbs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4548HreFacAbs", GXutil.ltrimstr( A4548HreFacAbs, 6, 2));
         }
         else
         {
            A4548HreFacAbs = localUtil.ctond( httpContext.cgiGet( edtHreFacAbs_Internalname)) ;
            n4548HreFacAbs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4548HreFacAbs", GXutil.ltrimstr( A4548HreFacAbs, 6, 2));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtHreFecPes_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "HREFECPES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreFecPes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4584HreFecPes = GXutil.resetTime( GXutil.nullDate() );
            n4584HreFecPes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4584HreFecPes", localUtil.ttoc( A4584HreFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A4584HreFecPes = localUtil.ctot( httpContext.cgiGet( edtHreFecPes_Internalname)) ;
            n4584HreFecPes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4584HreFecPes", localUtil.ttoc( A4584HreFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreMaqPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreMaqPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREMAQPES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreMaqPes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4585HreMaqPes = (byte)(0) ;
            n4585HreMaqPes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4585HreMaqPes", GXutil.str( A4585HreMaqPes, 1, 0));
         }
         else
         {
            A4585HreMaqPes = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreMaqPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4585HreMaqPes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4585HreMaqPes", GXutil.str( A4585HreMaqPes, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreULinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreULinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREULINPRO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreULinPro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4549HreULinPro = (byte)(0) ;
            n4549HreULinPro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4549HreULinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4549HreULinPro), 2, 0));
         }
         else
         {
            A4549HreULinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreULinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4549HreULinPro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4549HreULinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4549HreULinPro), 2, 0));
         }
         A4863HreUsrCod = httpContext.cgiGet( edtHreUsrCod_Internalname) ;
         n4863HreUsrCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4863HreUsrCod", A4863HreUsrCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqNh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqNh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREMAQNH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHReMaqNh_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7814HReMaqNh = (short)(0) ;
            n7814HReMaqNh = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7814HReMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7814HReMaqNh), 3, 0));
         }
         else
         {
            A7814HReMaqNh = (short)(localUtil.ctol( httpContext.cgiGet( edtHReMaqNh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7814HReMaqNh = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7814HReMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7814HReMaqNh), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqVX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqVX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREMAQVX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHReMaqVX_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7815HReMaqVX = (byte)(0) ;
            n7815HReMaqVX = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7815HReMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7815HReMaqVX), 2, 0));
         }
         else
         {
            A7815HReMaqVX = (byte)(localUtil.ctol( httpContext.cgiGet( edtHReMaqVX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7815HReMaqVX = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7815HReMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7815HReMaqVX), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqBL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqBL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREMAQBL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHReMaqBL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7816HReMaqBL = (byte)(0) ;
            n7816HReMaqBL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7816HReMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7816HReMaqBL), 2, 0));
         }
         else
         {
            A7816HReMaqBL = (byte)(localUtil.ctol( httpContext.cgiGet( edtHReMaqBL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7816HReMaqBL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7816HReMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7816HReMaqBL), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqFlow_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqFlow_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREMAQFLOW");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHReMaqFlow_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7817HReMaqFlow = (byte)(0) ;
            n7817HReMaqFlow = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7817HReMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7817HReMaqFlow), 2, 0));
         }
         else
         {
            A7817HReMaqFlow = (byte)(localUtil.ctol( httpContext.cgiGet( edtHReMaqFlow_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7817HReMaqFlow = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7817HReMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7817HReMaqFlow), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqRPM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqRPM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREMAQRPM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHReMaqRPM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7818HReMaqRPM = (short)(0) ;
            n7818HReMaqRPM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7818HReMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7818HReMaqRPM), 4, 0));
         }
         else
         {
            A7818HReMaqRPM = (short)(localUtil.ctol( httpContext.cgiGet( edtHReMaqRPM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7818HReMaqRPM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7818HReMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7818HReMaqRPM), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqMol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqMol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREMAQMOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHReMaqMol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7819HReMaqMol = (short)(0) ;
            n7819HReMaqMol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7819HReMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7819HReMaqMol), 3, 0));
         }
         else
         {
            A7819HReMaqMol = (short)(localUtil.ctol( httpContext.cgiGet( edtHReMaqMol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7819HReMaqMol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7819HReMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7819HReMaqMol), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqTor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqTor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREMAQTOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHReMaqTor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7820HReMaqTor = (short)(0) ;
            n7820HReMaqTor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7820HReMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7820HReMaqTor), 3, 0));
         }
         else
         {
            A7820HReMaqTor = (short)(localUtil.ctol( httpContext.cgiGet( edtHReMaqTor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7820HReMaqTor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7820HReMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7820HReMaqTor), 3, 0));
         }
         A7821HReMaqCla = httpContext.cgiGet( edtHReMaqCla_Internalname) ;
         n7821HReMaqCla = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7821HReMaqCla", A7821HReMaqCla);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqTej_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqTej_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREMAQTEJ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHReMaqTej_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7822HReMaqTej = (byte)(0) ;
            n7822HReMaqTej = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7822HReMaqTej", GXutil.str( A7822HReMaqTej, 1, 0));
         }
         else
         {
            A7822HReMaqTej = (byte)(localUtil.ctol( httpContext.cgiGet( edtHReMaqTej_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7822HReMaqTej = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7822HReMaqTej", GXutil.str( A7822HReMaqTej, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqDel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqDel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREMAQDEL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHReMaqDel_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7823HReMaqDel = (byte)(0) ;
            n7823HReMaqDel = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7823HReMaqDel", GXutil.str( A7823HReMaqDel, 1, 0));
         }
         else
         {
            A7823HReMaqDel = (byte)(localUtil.ctol( httpContext.cgiGet( edtHReMaqDel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7823HReMaqDel = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7823HReMaqDel", GXutil.str( A7823HReMaqDel, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqPML_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqPML_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREMAQPML");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHReMaqPML_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7824HReMaqPML = (short)(0) ;
            n7824HReMaqPML = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7824HReMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7824HReMaqPML), 3, 0));
         }
         else
         {
            A7824HReMaqPML = (short)(localUtil.ctol( httpContext.cgiGet( edtHReMaqPML_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7824HReMaqPML = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7824HReMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7824HReMaqPML), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreCosAA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreCosAA_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRECOSAA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreCosAA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8602HreCosAA = DecimalUtil.ZERO ;
            n8602HreCosAA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8602HreCosAA", GXutil.ltrimstr( A8602HreCosAA, 10, 2));
         }
         else
         {
            A8602HreCosAA = localUtil.ctond( httpContext.cgiGet( edtHreCosAA_Internalname)) ;
            n8602HreCosAA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8602HreCosAA", GXutil.ltrimstr( A8602HreCosAA, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHrecosAd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHrecosAd_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRECOSAD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHrecosAd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8603HrecosAd = DecimalUtil.ZERO ;
            n8603HrecosAd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8603HrecosAd", GXutil.ltrimstr( A8603HrecosAd, 10, 2));
         }
         else
         {
            A8603HrecosAd = localUtil.ctond( httpContext.cgiGet( edtHrecosAd_Internalname)) ;
            n8603HrecosAd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8603HrecosAd", GXutil.ltrimstr( A8603HrecosAd, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreCosAnc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreCosAnc_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRECOSANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreCosAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8604HreCosAnc = DecimalUtil.ZERO ;
            n8604HreCosAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8604HreCosAnc", GXutil.ltrimstr( A8604HreCosAnc, 10, 2));
         }
         else
         {
            A8604HreCosAnc = localUtil.ctond( httpContext.cgiGet( edtHreCosAnc_Internalname)) ;
            n8604HreCosAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8604HreCosAnc", GXutil.ltrimstr( A8604HreCosAnc, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreCosCol_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreCosCol_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRECOSCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreCosCol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8605HreCosCol = DecimalUtil.ZERO ;
            n8605HreCosCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8605HreCosCol", GXutil.ltrimstr( A8605HreCosCol, 10, 2));
         }
         else
         {
            A8605HreCosCol = localUtil.ctond( httpContext.cgiGet( edtHreCosCol_Internalname)) ;
            n8605HreCosCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8605HreCosCol", GXutil.ltrimstr( A8605HreCosCol, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreCosPA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreCosPA_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRECOSPA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreCosPA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8606HreCosPA = DecimalUtil.ZERO ;
            n8606HreCosPA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8606HreCosPA", GXutil.ltrimstr( A8606HreCosPA, 10, 2));
         }
         else
         {
            A8606HreCosPA = localUtil.ctond( httpContext.cgiGet( edtHreCosPA_Internalname)) ;
            n8606HreCosPA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8606HreCosPA", GXutil.ltrimstr( A8606HreCosPA, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreCosPD_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreCosPD_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRECOSPD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreCosPD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8607HreCosPD = DecimalUtil.ZERO ;
            n8607HreCosPD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8607HreCosPD", GXutil.ltrimstr( A8607HreCosPD, 10, 2));
         }
         else
         {
            A8607HreCosPD = localUtil.ctond( httpContext.cgiGet( edtHreCosPD_Internalname)) ;
            n8607HreCosPD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8607HreCosPD", GXutil.ltrimstr( A8607HreCosPD, 10, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLtsSb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLtsSb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRELTSSB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreLtsSb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9780HreLtsSb = 0 ;
            n9780HreLtsSb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9780HreLtsSb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9780HreLtsSb), 5, 0));
         }
         else
         {
            A9780HreLtsSb = (int)(localUtil.ctol( httpContext.cgiGet( edtHreLtsSb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9780HreLtsSb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9780HreLtsSb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9780HreLtsSb), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLtsRm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLtsRm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRELTSRM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreLtsRm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9781HreLtsRm = 0 ;
            n9781HreLtsRm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9781HreLtsRm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9781HreLtsRm), 5, 0));
         }
         else
         {
            A9781HreLtsRm = (int)(localUtil.ctol( httpContext.cgiGet( edtHreLtsRm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9781HreLtsRm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9781HreLtsRm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9781HreLtsRm), 5, 0));
         }
         A9803HreAcaQ = httpContext.cgiGet( edtHreAcaQ_Internalname) ;
         n9803HreAcaQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9803HreAcaQ", A9803HreAcaQ);
         A9804HreAcab = httpContext.cgiGet( edtHreAcab_Internalname) ;
         n9804HreAcab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9804HreAcab", A9804HreAcab);
         A1094HreNPrg = httpContext.cgiGet( edtHreNPrg_Internalname) ;
         n1094HreNPrg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1094HreNPrg", A1094HreNPrg);
         A697HreLotF = httpContext.cgiGet( edtHreLotF_Internalname) ;
         n697HreLotF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A697HreLotF", A697HreLotF);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10381HreAnc = (short)(0) ;
            n10381HreAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10381HreAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10381HreAnc), 3, 0));
         }
         else
         {
            A10381HreAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtHreAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10381HreAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10381HreAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10381HreAnc), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREGRM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreGrm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10382HreGrm = (short)(0) ;
            n10382HreGrm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10382HreGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10382HreGrm), 4, 0));
         }
         else
         {
            A10382HreGrm = (short)(localUtil.ctol( httpContext.cgiGet( edtHreGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10382HreGrm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10382HreGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10382HreGrm), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreVel_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreVel_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREVEL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreVel_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10383HreVel = DecimalUtil.ZERO ;
            n10383HreVel = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10383HreVel", GXutil.ltrimstr( A10383HreVel, 6, 2));
         }
         else
         {
            A10383HreVel = localUtil.ctond( httpContext.cgiGet( edtHreVel_Internalname)) ;
            n10383HreVel = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10383HreVel", GXutil.ltrimstr( A10383HreVel, 6, 2));
         }
         A10384HreObs = httpContext.cgiGet( edtHreObs_Internalname) ;
         n10384HreObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10384HreObs", A10384HreObs);
         A11508HreAva = httpContext.cgiGet( edtHreAva_Internalname) ;
         n11508HreAva = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11508HreAva", A11508HreAva);
         A12126HreAs = httpContext.cgiGet( edtHreAs_Internalname) ;
         n12126HreAs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12126HreAs", A12126HreAs);
         A12127HreAi = httpContext.cgiGet( edtHreAi_Internalname) ;
         n12127HreAi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12127HreAi", A12127HreAi);
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
            A4545HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
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
            initAll1PM678( ) ;
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
      disableAttributes1PM678( ) ;
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

   public void resetCaption1PM0( )
   {
   }

   public void zm1PM678( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4546HreMaqCod = T01PM3_A4546HreMaqCod[0] ;
            Z4547HreVolPrd = T01PM3_A4547HreVolPrd[0] ;
            Z4548HreFacAbs = T01PM3_A4548HreFacAbs[0] ;
            Z4584HreFecPes = T01PM3_A4584HreFecPes[0] ;
            Z4585HreMaqPes = T01PM3_A4585HreMaqPes[0] ;
            Z4549HreULinPro = T01PM3_A4549HreULinPro[0] ;
            Z4863HreUsrCod = T01PM3_A4863HreUsrCod[0] ;
            Z7814HReMaqNh = T01PM3_A7814HReMaqNh[0] ;
            Z7815HReMaqVX = T01PM3_A7815HReMaqVX[0] ;
            Z7816HReMaqBL = T01PM3_A7816HReMaqBL[0] ;
            Z7817HReMaqFlow = T01PM3_A7817HReMaqFlow[0] ;
            Z7818HReMaqRPM = T01PM3_A7818HReMaqRPM[0] ;
            Z7819HReMaqMol = T01PM3_A7819HReMaqMol[0] ;
            Z7820HReMaqTor = T01PM3_A7820HReMaqTor[0] ;
            Z7821HReMaqCla = T01PM3_A7821HReMaqCla[0] ;
            Z7822HReMaqTej = T01PM3_A7822HReMaqTej[0] ;
            Z7823HReMaqDel = T01PM3_A7823HReMaqDel[0] ;
            Z7824HReMaqPML = T01PM3_A7824HReMaqPML[0] ;
            Z8602HreCosAA = T01PM3_A8602HreCosAA[0] ;
            Z8603HrecosAd = T01PM3_A8603HrecosAd[0] ;
            Z8604HreCosAnc = T01PM3_A8604HreCosAnc[0] ;
            Z8605HreCosCol = T01PM3_A8605HreCosCol[0] ;
            Z8606HreCosPA = T01PM3_A8606HreCosPA[0] ;
            Z8607HreCosPD = T01PM3_A8607HreCosPD[0] ;
            Z9780HreLtsSb = T01PM3_A9780HreLtsSb[0] ;
            Z9781HreLtsRm = T01PM3_A9781HreLtsRm[0] ;
            Z9803HreAcaQ = T01PM3_A9803HreAcaQ[0] ;
            Z9804HreAcab = T01PM3_A9804HreAcab[0] ;
            Z1094HreNPrg = T01PM3_A1094HreNPrg[0] ;
            Z697HreLotF = T01PM3_A697HreLotF[0] ;
            Z10381HreAnc = T01PM3_A10381HreAnc[0] ;
            Z10382HreGrm = T01PM3_A10382HreGrm[0] ;
            Z10383HreVel = T01PM3_A10383HreVel[0] ;
            Z10384HreObs = T01PM3_A10384HreObs[0] ;
            Z11508HreAva = T01PM3_A11508HreAva[0] ;
            Z12126HreAs = T01PM3_A12126HreAs[0] ;
            Z12127HreAi = T01PM3_A12127HreAi[0] ;
         }
         else
         {
            Z4546HreMaqCod = A4546HreMaqCod ;
            Z4547HreVolPrd = A4547HreVolPrd ;
            Z4548HreFacAbs = A4548HreFacAbs ;
            Z4584HreFecPes = A4584HreFecPes ;
            Z4585HreMaqPes = A4585HreMaqPes ;
            Z4549HreULinPro = A4549HreULinPro ;
            Z4863HreUsrCod = A4863HreUsrCod ;
            Z7814HReMaqNh = A7814HReMaqNh ;
            Z7815HReMaqVX = A7815HReMaqVX ;
            Z7816HReMaqBL = A7816HReMaqBL ;
            Z7817HReMaqFlow = A7817HReMaqFlow ;
            Z7818HReMaqRPM = A7818HReMaqRPM ;
            Z7819HReMaqMol = A7819HReMaqMol ;
            Z7820HReMaqTor = A7820HReMaqTor ;
            Z7821HReMaqCla = A7821HReMaqCla ;
            Z7822HReMaqTej = A7822HReMaqTej ;
            Z7823HReMaqDel = A7823HReMaqDel ;
            Z7824HReMaqPML = A7824HReMaqPML ;
            Z8602HreCosAA = A8602HreCosAA ;
            Z8603HrecosAd = A8603HrecosAd ;
            Z8604HreCosAnc = A8604HreCosAnc ;
            Z8605HreCosCol = A8605HreCosCol ;
            Z8606HreCosPA = A8606HreCosPA ;
            Z8607HreCosPD = A8607HreCosPD ;
            Z9780HreLtsSb = A9780HreLtsSb ;
            Z9781HreLtsRm = A9781HreLtsRm ;
            Z9803HreAcaQ = A9803HreAcaQ ;
            Z9804HreAcab = A9804HreAcab ;
            Z1094HreNPrg = A1094HreNPrg ;
            Z697HreLotF = A697HreLotF ;
            Z10381HreAnc = A10381HreAnc ;
            Z10382HreGrm = A10382HreGrm ;
            Z10383HreVel = A10383HreVel ;
            Z10384HreObs = A10384HreObs ;
            Z11508HreAva = A11508HreAva ;
            Z12126HreAs = A12126HreAs ;
            Z12127HreAi = A12127HreAi ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z4545HreLinMaq = A4545HreLinMaq ;
         Z4546HreMaqCod = A4546HreMaqCod ;
         Z4547HreVolPrd = A4547HreVolPrd ;
         Z4548HreFacAbs = A4548HreFacAbs ;
         Z4584HreFecPes = A4584HreFecPes ;
         Z4585HreMaqPes = A4585HreMaqPes ;
         Z4549HreULinPro = A4549HreULinPro ;
         Z4863HreUsrCod = A4863HreUsrCod ;
         Z7814HReMaqNh = A7814HReMaqNh ;
         Z7815HReMaqVX = A7815HReMaqVX ;
         Z7816HReMaqBL = A7816HReMaqBL ;
         Z7817HReMaqFlow = A7817HReMaqFlow ;
         Z7818HReMaqRPM = A7818HReMaqRPM ;
         Z7819HReMaqMol = A7819HReMaqMol ;
         Z7820HReMaqTor = A7820HReMaqTor ;
         Z7821HReMaqCla = A7821HReMaqCla ;
         Z7822HReMaqTej = A7822HReMaqTej ;
         Z7823HReMaqDel = A7823HReMaqDel ;
         Z7824HReMaqPML = A7824HReMaqPML ;
         Z8602HreCosAA = A8602HreCosAA ;
         Z8603HrecosAd = A8603HrecosAd ;
         Z8604HreCosAnc = A8604HreCosAnc ;
         Z8605HreCosCol = A8605HreCosCol ;
         Z8606HreCosPA = A8606HreCosPA ;
         Z8607HreCosPD = A8607HreCosPD ;
         Z9780HreLtsSb = A9780HreLtsSb ;
         Z9781HreLtsRm = A9781HreLtsRm ;
         Z9803HreAcaQ = A9803HreAcaQ ;
         Z9804HreAcab = A9804HreAcab ;
         Z1094HreNPrg = A1094HreNPrg ;
         Z697HreLotF = A697HreLotF ;
         Z10381HreAnc = A10381HreAnc ;
         Z10382HreGrm = A10382HreGrm ;
         Z10383HreVel = A10383HreVel ;
         Z10384HreObs = A10384HreObs ;
         Z11508HreAva = A11508HreAva ;
         Z12126HreAs = A12126HreAs ;
         Z12127HreAi = A12127HreAi ;
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

   public void load1PM678( )
   {
      /* Using cursor T01PM5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound678 = (short)(1) ;
         A4546HreMaqCod = T01PM5_A4546HreMaqCod[0] ;
         n4546HreMaqCod = T01PM5_n4546HreMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4546HreMaqCod", A4546HreMaqCod);
         A4547HreVolPrd = T01PM5_A4547HreVolPrd[0] ;
         n4547HreVolPrd = T01PM5_n4547HreVolPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4547HreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4547HreVolPrd), 5, 0));
         A4548HreFacAbs = T01PM5_A4548HreFacAbs[0] ;
         n4548HreFacAbs = T01PM5_n4548HreFacAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4548HreFacAbs", GXutil.ltrimstr( A4548HreFacAbs, 6, 2));
         A4584HreFecPes = T01PM5_A4584HreFecPes[0] ;
         n4584HreFecPes = T01PM5_n4584HreFecPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4584HreFecPes", localUtil.ttoc( A4584HreFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4585HreMaqPes = T01PM5_A4585HreMaqPes[0] ;
         n4585HreMaqPes = T01PM5_n4585HreMaqPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4585HreMaqPes", GXutil.str( A4585HreMaqPes, 1, 0));
         A4549HreULinPro = T01PM5_A4549HreULinPro[0] ;
         n4549HreULinPro = T01PM5_n4549HreULinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4549HreULinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4549HreULinPro), 2, 0));
         A4863HreUsrCod = T01PM5_A4863HreUsrCod[0] ;
         n4863HreUsrCod = T01PM5_n4863HreUsrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4863HreUsrCod", A4863HreUsrCod);
         A7814HReMaqNh = T01PM5_A7814HReMaqNh[0] ;
         n7814HReMaqNh = T01PM5_n7814HReMaqNh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7814HReMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7814HReMaqNh), 3, 0));
         A7815HReMaqVX = T01PM5_A7815HReMaqVX[0] ;
         n7815HReMaqVX = T01PM5_n7815HReMaqVX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7815HReMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7815HReMaqVX), 2, 0));
         A7816HReMaqBL = T01PM5_A7816HReMaqBL[0] ;
         n7816HReMaqBL = T01PM5_n7816HReMaqBL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7816HReMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7816HReMaqBL), 2, 0));
         A7817HReMaqFlow = T01PM5_A7817HReMaqFlow[0] ;
         n7817HReMaqFlow = T01PM5_n7817HReMaqFlow[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7817HReMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7817HReMaqFlow), 2, 0));
         A7818HReMaqRPM = T01PM5_A7818HReMaqRPM[0] ;
         n7818HReMaqRPM = T01PM5_n7818HReMaqRPM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7818HReMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7818HReMaqRPM), 4, 0));
         A7819HReMaqMol = T01PM5_A7819HReMaqMol[0] ;
         n7819HReMaqMol = T01PM5_n7819HReMaqMol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7819HReMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7819HReMaqMol), 3, 0));
         A7820HReMaqTor = T01PM5_A7820HReMaqTor[0] ;
         n7820HReMaqTor = T01PM5_n7820HReMaqTor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7820HReMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7820HReMaqTor), 3, 0));
         A7821HReMaqCla = T01PM5_A7821HReMaqCla[0] ;
         n7821HReMaqCla = T01PM5_n7821HReMaqCla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7821HReMaqCla", A7821HReMaqCla);
         A7822HReMaqTej = T01PM5_A7822HReMaqTej[0] ;
         n7822HReMaqTej = T01PM5_n7822HReMaqTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7822HReMaqTej", GXutil.str( A7822HReMaqTej, 1, 0));
         A7823HReMaqDel = T01PM5_A7823HReMaqDel[0] ;
         n7823HReMaqDel = T01PM5_n7823HReMaqDel[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7823HReMaqDel", GXutil.str( A7823HReMaqDel, 1, 0));
         A7824HReMaqPML = T01PM5_A7824HReMaqPML[0] ;
         n7824HReMaqPML = T01PM5_n7824HReMaqPML[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7824HReMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7824HReMaqPML), 3, 0));
         A8602HreCosAA = T01PM5_A8602HreCosAA[0] ;
         n8602HreCosAA = T01PM5_n8602HreCosAA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8602HreCosAA", GXutil.ltrimstr( A8602HreCosAA, 10, 2));
         A8603HrecosAd = T01PM5_A8603HrecosAd[0] ;
         n8603HrecosAd = T01PM5_n8603HrecosAd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8603HrecosAd", GXutil.ltrimstr( A8603HrecosAd, 10, 2));
         A8604HreCosAnc = T01PM5_A8604HreCosAnc[0] ;
         n8604HreCosAnc = T01PM5_n8604HreCosAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8604HreCosAnc", GXutil.ltrimstr( A8604HreCosAnc, 10, 2));
         A8605HreCosCol = T01PM5_A8605HreCosCol[0] ;
         n8605HreCosCol = T01PM5_n8605HreCosCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8605HreCosCol", GXutil.ltrimstr( A8605HreCosCol, 10, 2));
         A8606HreCosPA = T01PM5_A8606HreCosPA[0] ;
         n8606HreCosPA = T01PM5_n8606HreCosPA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8606HreCosPA", GXutil.ltrimstr( A8606HreCosPA, 10, 2));
         A8607HreCosPD = T01PM5_A8607HreCosPD[0] ;
         n8607HreCosPD = T01PM5_n8607HreCosPD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8607HreCosPD", GXutil.ltrimstr( A8607HreCosPD, 10, 2));
         A9780HreLtsSb = T01PM5_A9780HreLtsSb[0] ;
         n9780HreLtsSb = T01PM5_n9780HreLtsSb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9780HreLtsSb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9780HreLtsSb), 5, 0));
         A9781HreLtsRm = T01PM5_A9781HreLtsRm[0] ;
         n9781HreLtsRm = T01PM5_n9781HreLtsRm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9781HreLtsRm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9781HreLtsRm), 5, 0));
         A9803HreAcaQ = T01PM5_A9803HreAcaQ[0] ;
         n9803HreAcaQ = T01PM5_n9803HreAcaQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9803HreAcaQ", A9803HreAcaQ);
         A9804HreAcab = T01PM5_A9804HreAcab[0] ;
         n9804HreAcab = T01PM5_n9804HreAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9804HreAcab", A9804HreAcab);
         A1094HreNPrg = T01PM5_A1094HreNPrg[0] ;
         n1094HreNPrg = T01PM5_n1094HreNPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1094HreNPrg", A1094HreNPrg);
         A697HreLotF = T01PM5_A697HreLotF[0] ;
         n697HreLotF = T01PM5_n697HreLotF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A697HreLotF", A697HreLotF);
         A10381HreAnc = T01PM5_A10381HreAnc[0] ;
         n10381HreAnc = T01PM5_n10381HreAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10381HreAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10381HreAnc), 3, 0));
         A10382HreGrm = T01PM5_A10382HreGrm[0] ;
         n10382HreGrm = T01PM5_n10382HreGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10382HreGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10382HreGrm), 4, 0));
         A10383HreVel = T01PM5_A10383HreVel[0] ;
         n10383HreVel = T01PM5_n10383HreVel[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10383HreVel", GXutil.ltrimstr( A10383HreVel, 6, 2));
         A10384HreObs = T01PM5_A10384HreObs[0] ;
         n10384HreObs = T01PM5_n10384HreObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10384HreObs", A10384HreObs);
         A11508HreAva = T01PM5_A11508HreAva[0] ;
         n11508HreAva = T01PM5_n11508HreAva[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11508HreAva", A11508HreAva);
         A12126HreAs = T01PM5_A12126HreAs[0] ;
         n12126HreAs = T01PM5_n12126HreAs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12126HreAs", A12126HreAs);
         A12127HreAi = T01PM5_A12127HreAi[0] ;
         n12127HreAi = T01PM5_n12127HreAi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12127HreAi", A12127HreAi);
         zm1PM678( -2) ;
      }
      pr_default.close(3);
      onLoadActions1PM678( ) ;
   }

   public void onLoadActions1PM678( )
   {
   }

   public void checkExtendedTable1PM678( )
   {
      nIsDirty_678 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01PM4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      if ( ! ( ( ( A4585HreMaqPes >= 0 ) && ( A4585HreMaqPes <= 2 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Maquina Pesada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "HREMAQPES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreMaqPes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1PM678( )
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
      /* Using cursor T01PM6 */
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

   public void getKey1PM678( )
   {
      /* Using cursor T01PM7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound678 = (short)(1) ;
      }
      else
      {
         RcdFound678 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01PM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1PM678( 2) ;
         RcdFound678 = (short)(1) ;
         A4545HreLinMaq = T01PM3_A4545HreLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
         A4546HreMaqCod = T01PM3_A4546HreMaqCod[0] ;
         n4546HreMaqCod = T01PM3_n4546HreMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4546HreMaqCod", A4546HreMaqCod);
         A4547HreVolPrd = T01PM3_A4547HreVolPrd[0] ;
         n4547HreVolPrd = T01PM3_n4547HreVolPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4547HreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4547HreVolPrd), 5, 0));
         A4548HreFacAbs = T01PM3_A4548HreFacAbs[0] ;
         n4548HreFacAbs = T01PM3_n4548HreFacAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4548HreFacAbs", GXutil.ltrimstr( A4548HreFacAbs, 6, 2));
         A4584HreFecPes = T01PM3_A4584HreFecPes[0] ;
         n4584HreFecPes = T01PM3_n4584HreFecPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4584HreFecPes", localUtil.ttoc( A4584HreFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4585HreMaqPes = T01PM3_A4585HreMaqPes[0] ;
         n4585HreMaqPes = T01PM3_n4585HreMaqPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4585HreMaqPes", GXutil.str( A4585HreMaqPes, 1, 0));
         A4549HreULinPro = T01PM3_A4549HreULinPro[0] ;
         n4549HreULinPro = T01PM3_n4549HreULinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4549HreULinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4549HreULinPro), 2, 0));
         A4863HreUsrCod = T01PM3_A4863HreUsrCod[0] ;
         n4863HreUsrCod = T01PM3_n4863HreUsrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4863HreUsrCod", A4863HreUsrCod);
         A7814HReMaqNh = T01PM3_A7814HReMaqNh[0] ;
         n7814HReMaqNh = T01PM3_n7814HReMaqNh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7814HReMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7814HReMaqNh), 3, 0));
         A7815HReMaqVX = T01PM3_A7815HReMaqVX[0] ;
         n7815HReMaqVX = T01PM3_n7815HReMaqVX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7815HReMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7815HReMaqVX), 2, 0));
         A7816HReMaqBL = T01PM3_A7816HReMaqBL[0] ;
         n7816HReMaqBL = T01PM3_n7816HReMaqBL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7816HReMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7816HReMaqBL), 2, 0));
         A7817HReMaqFlow = T01PM3_A7817HReMaqFlow[0] ;
         n7817HReMaqFlow = T01PM3_n7817HReMaqFlow[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7817HReMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7817HReMaqFlow), 2, 0));
         A7818HReMaqRPM = T01PM3_A7818HReMaqRPM[0] ;
         n7818HReMaqRPM = T01PM3_n7818HReMaqRPM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7818HReMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7818HReMaqRPM), 4, 0));
         A7819HReMaqMol = T01PM3_A7819HReMaqMol[0] ;
         n7819HReMaqMol = T01PM3_n7819HReMaqMol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7819HReMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7819HReMaqMol), 3, 0));
         A7820HReMaqTor = T01PM3_A7820HReMaqTor[0] ;
         n7820HReMaqTor = T01PM3_n7820HReMaqTor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7820HReMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7820HReMaqTor), 3, 0));
         A7821HReMaqCla = T01PM3_A7821HReMaqCla[0] ;
         n7821HReMaqCla = T01PM3_n7821HReMaqCla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7821HReMaqCla", A7821HReMaqCla);
         A7822HReMaqTej = T01PM3_A7822HReMaqTej[0] ;
         n7822HReMaqTej = T01PM3_n7822HReMaqTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7822HReMaqTej", GXutil.str( A7822HReMaqTej, 1, 0));
         A7823HReMaqDel = T01PM3_A7823HReMaqDel[0] ;
         n7823HReMaqDel = T01PM3_n7823HReMaqDel[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7823HReMaqDel", GXutil.str( A7823HReMaqDel, 1, 0));
         A7824HReMaqPML = T01PM3_A7824HReMaqPML[0] ;
         n7824HReMaqPML = T01PM3_n7824HReMaqPML[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7824HReMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7824HReMaqPML), 3, 0));
         A8602HreCosAA = T01PM3_A8602HreCosAA[0] ;
         n8602HreCosAA = T01PM3_n8602HreCosAA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8602HreCosAA", GXutil.ltrimstr( A8602HreCosAA, 10, 2));
         A8603HrecosAd = T01PM3_A8603HrecosAd[0] ;
         n8603HrecosAd = T01PM3_n8603HrecosAd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8603HrecosAd", GXutil.ltrimstr( A8603HrecosAd, 10, 2));
         A8604HreCosAnc = T01PM3_A8604HreCosAnc[0] ;
         n8604HreCosAnc = T01PM3_n8604HreCosAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8604HreCosAnc", GXutil.ltrimstr( A8604HreCosAnc, 10, 2));
         A8605HreCosCol = T01PM3_A8605HreCosCol[0] ;
         n8605HreCosCol = T01PM3_n8605HreCosCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8605HreCosCol", GXutil.ltrimstr( A8605HreCosCol, 10, 2));
         A8606HreCosPA = T01PM3_A8606HreCosPA[0] ;
         n8606HreCosPA = T01PM3_n8606HreCosPA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8606HreCosPA", GXutil.ltrimstr( A8606HreCosPA, 10, 2));
         A8607HreCosPD = T01PM3_A8607HreCosPD[0] ;
         n8607HreCosPD = T01PM3_n8607HreCosPD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8607HreCosPD", GXutil.ltrimstr( A8607HreCosPD, 10, 2));
         A9780HreLtsSb = T01PM3_A9780HreLtsSb[0] ;
         n9780HreLtsSb = T01PM3_n9780HreLtsSb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9780HreLtsSb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9780HreLtsSb), 5, 0));
         A9781HreLtsRm = T01PM3_A9781HreLtsRm[0] ;
         n9781HreLtsRm = T01PM3_n9781HreLtsRm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9781HreLtsRm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9781HreLtsRm), 5, 0));
         A9803HreAcaQ = T01PM3_A9803HreAcaQ[0] ;
         n9803HreAcaQ = T01PM3_n9803HreAcaQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9803HreAcaQ", A9803HreAcaQ);
         A9804HreAcab = T01PM3_A9804HreAcab[0] ;
         n9804HreAcab = T01PM3_n9804HreAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9804HreAcab", A9804HreAcab);
         A1094HreNPrg = T01PM3_A1094HreNPrg[0] ;
         n1094HreNPrg = T01PM3_n1094HreNPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1094HreNPrg", A1094HreNPrg);
         A697HreLotF = T01PM3_A697HreLotF[0] ;
         n697HreLotF = T01PM3_n697HreLotF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A697HreLotF", A697HreLotF);
         A10381HreAnc = T01PM3_A10381HreAnc[0] ;
         n10381HreAnc = T01PM3_n10381HreAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10381HreAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10381HreAnc), 3, 0));
         A10382HreGrm = T01PM3_A10382HreGrm[0] ;
         n10382HreGrm = T01PM3_n10382HreGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10382HreGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10382HreGrm), 4, 0));
         A10383HreVel = T01PM3_A10383HreVel[0] ;
         n10383HreVel = T01PM3_n10383HreVel[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10383HreVel", GXutil.ltrimstr( A10383HreVel, 6, 2));
         A10384HreObs = T01PM3_A10384HreObs[0] ;
         n10384HreObs = T01PM3_n10384HreObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10384HreObs", A10384HreObs);
         A11508HreAva = T01PM3_A11508HreAva[0] ;
         n11508HreAva = T01PM3_n11508HreAva[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11508HreAva", A11508HreAva);
         A12126HreAs = T01PM3_A12126HreAs[0] ;
         n12126HreAs = T01PM3_n12126HreAs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12126HreAs", A12126HreAs);
         A12127HreAi = T01PM3_A12127HreAi[0] ;
         n12127HreAi = T01PM3_n12127HreAi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12127HreAi", A12127HreAi);
         A396EmprCod = T01PM3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T01PM3_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T01PM3_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T01PM3_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T01PM3_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4545HreLinMaq = A4545HreLinMaq ;
         sMode678 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1PM678( ) ;
         if ( AnyError == 1 )
         {
            RcdFound678 = (short)(0) ;
            initializeNonKey1PM678( ) ;
         }
         Gx_mode = sMode678 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound678 = (short)(0) ;
         initializeNonKey1PM678( ) ;
         sMode678 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode678 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1PM678( ) ;
      if ( RcdFound678 == 0 )
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
      RcdFound678 = (short)(0) ;
      /* Using cursor T01PM8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4495HreNumCie), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01PM8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01PM8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM8_A4492HreBarCod[0] < A4492HreBarCod ) || ( T01PM8_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM8_A4493HreBarReo[0] < A4493HreBarReo ) || ( T01PM8_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01PM8_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PM8_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T01PM8_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01PM8_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01PM8_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM8_A4495HreNumCie[0] < A4495HreNumCie ) || ( T01PM8_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01PM8_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01PM8_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01PM8_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM8_A4545HreLinMaq[0] < A4545HreLinMaq ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01PM8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01PM8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM8_A4492HreBarCod[0] > A4492HreBarCod ) || ( T01PM8_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM8_A4493HreBarReo[0] > A4493HreBarReo ) || ( T01PM8_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01PM8_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PM8_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T01PM8_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01PM8_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01PM8_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM8_A4495HreNumCie[0] > A4495HreNumCie ) || ( T01PM8_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01PM8_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01PM8_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01PM8_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM8_A4545HreLinMaq[0] > A4545HreLinMaq ) ) )
         {
            A396EmprCod = T01PM8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4492HreBarCod = T01PM8_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T01PM8_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T01PM8_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T01PM8_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A4545HreLinMaq = T01PM8_A4545HreLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
            RcdFound678 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound678 = (short)(0) ;
      /* Using cursor T01PM9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4495HreNumCie), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01PM9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01PM9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM9_A4492HreBarCod[0] > A4492HreBarCod ) || ( T01PM9_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM9_A4493HreBarReo[0] > A4493HreBarReo ) || ( T01PM9_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01PM9_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PM9_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T01PM9_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01PM9_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01PM9_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM9_A4495HreNumCie[0] > A4495HreNumCie ) || ( T01PM9_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01PM9_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01PM9_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01PM9_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM9_A4545HreLinMaq[0] > A4545HreLinMaq ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01PM9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01PM9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM9_A4492HreBarCod[0] < A4492HreBarCod ) || ( T01PM9_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM9_A4493HreBarReo[0] < A4493HreBarReo ) || ( T01PM9_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01PM9_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PM9_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T01PM9_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01PM9_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01PM9_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM9_A4495HreNumCie[0] < A4495HreNumCie ) || ( T01PM9_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01PM9_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01PM9_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01PM9_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01PM9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PM9_A4545HreLinMaq[0] < A4545HreLinMaq ) ) )
         {
            A396EmprCod = T01PM9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4492HreBarCod = T01PM9_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T01PM9_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T01PM9_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T01PM9_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A4545HreLinMaq = T01PM9_A4545HreLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
            RcdFound678 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PM678( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1PM678( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound678 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4545HreLinMaq != Z4545HreLinMaq ) )
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
               A4545HreLinMaq = Z4545HreLinMaq ;
               httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
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
               update1PM678( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4545HreLinMaq != Z4545HreLinMaq ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1PM678( ) ;
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
                  insert1PM678( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4545HreLinMaq != Z4545HreLinMaq ) )
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
         A4545HreLinMaq = Z4545HreLinMaq ;
         httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
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
      if ( RcdFound678 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtHreMaqCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1PM678( ) ;
      if ( RcdFound678 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreMaqCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1PM678( ) ;
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
      if ( RcdFound678 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreMaqCod_Internalname ;
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
      if ( RcdFound678 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreMaqCod_Internalname ;
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
      scanStart1PM678( ) ;
      if ( RcdFound678 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound678 != 0 )
         {
            scanNext1PM678( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreMaqCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1PM678( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1PM678( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4546HreMaqCod, T01PM2_A4546HreMaqCod[0]) != 0 ) || ( Z4547HreVolPrd != T01PM2_A4547HreVolPrd[0] ) || ( DecimalUtil.compareTo(Z4548HreFacAbs, T01PM2_A4548HreFacAbs[0]) != 0 ) || !( GXutil.dateCompare(Z4584HreFecPes, T01PM2_A4584HreFecPes[0]) ) || ( Z4585HreMaqPes != T01PM2_A4585HreMaqPes[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4549HreULinPro != T01PM2_A4549HreULinPro[0] ) || ( GXutil.strcmp(Z4863HreUsrCod, T01PM2_A4863HreUsrCod[0]) != 0 ) || ( Z7814HReMaqNh != T01PM2_A7814HReMaqNh[0] ) || ( Z7815HReMaqVX != T01PM2_A7815HReMaqVX[0] ) || ( Z7816HReMaqBL != T01PM2_A7816HReMaqBL[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7817HReMaqFlow != T01PM2_A7817HReMaqFlow[0] ) || ( Z7818HReMaqRPM != T01PM2_A7818HReMaqRPM[0] ) || ( Z7819HReMaqMol != T01PM2_A7819HReMaqMol[0] ) || ( Z7820HReMaqTor != T01PM2_A7820HReMaqTor[0] ) || ( GXutil.strcmp(Z7821HReMaqCla, T01PM2_A7821HReMaqCla[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7822HReMaqTej != T01PM2_A7822HReMaqTej[0] ) || ( Z7823HReMaqDel != T01PM2_A7823HReMaqDel[0] ) || ( Z7824HReMaqPML != T01PM2_A7824HReMaqPML[0] ) || ( DecimalUtil.compareTo(Z8602HreCosAA, T01PM2_A8602HreCosAA[0]) != 0 ) || ( DecimalUtil.compareTo(Z8603HrecosAd, T01PM2_A8603HrecosAd[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8604HreCosAnc, T01PM2_A8604HreCosAnc[0]) != 0 ) || ( DecimalUtil.compareTo(Z8605HreCosCol, T01PM2_A8605HreCosCol[0]) != 0 ) || ( DecimalUtil.compareTo(Z8606HreCosPA, T01PM2_A8606HreCosPA[0]) != 0 ) || ( DecimalUtil.compareTo(Z8607HreCosPD, T01PM2_A8607HreCosPD[0]) != 0 ) || ( Z9780HreLtsSb != T01PM2_A9780HreLtsSb[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z9781HreLtsRm != T01PM2_A9781HreLtsRm[0] ) || ( GXutil.strcmp(Z9803HreAcaQ, T01PM2_A9803HreAcaQ[0]) != 0 ) || ( GXutil.strcmp(Z9804HreAcab, T01PM2_A9804HreAcab[0]) != 0 ) || ( GXutil.strcmp(Z1094HreNPrg, T01PM2_A1094HreNPrg[0]) != 0 ) || ( GXutil.strcmp(Z697HreLotF, T01PM2_A697HreLotF[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10381HreAnc != T01PM2_A10381HreAnc[0] ) || ( Z10382HreGrm != T01PM2_A10382HreGrm[0] ) || ( DecimalUtil.compareTo(Z10383HreVel, T01PM2_A10383HreVel[0]) != 0 ) || ( GXutil.strcmp(Z10384HreObs, T01PM2_A10384HreObs[0]) != 0 ) || ( GXutil.strcmp(Z11508HreAva, T01PM2_A11508HreAva[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12126HreAs, T01PM2_A12126HreAs[0]) != 0 ) || ( GXutil.strcmp(Z12127HreAi, T01PM2_A12127HreAi[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4546HreMaqCod, T01PM2_A4546HreMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreMaqCod");
               GXutil.writeLogRaw("Old: ",Z4546HreMaqCod);
               GXutil.writeLogRaw("Current: ",T01PM2_A4546HreMaqCod[0]);
            }
            if ( Z4547HreVolPrd != T01PM2_A4547HreVolPrd[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreVolPrd");
               GXutil.writeLogRaw("Old: ",Z4547HreVolPrd);
               GXutil.writeLogRaw("Current: ",T01PM2_A4547HreVolPrd[0]);
            }
            if ( DecimalUtil.compareTo(Z4548HreFacAbs, T01PM2_A4548HreFacAbs[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreFacAbs");
               GXutil.writeLogRaw("Old: ",Z4548HreFacAbs);
               GXutil.writeLogRaw("Current: ",T01PM2_A4548HreFacAbs[0]);
            }
            if ( !( GXutil.dateCompare(Z4584HreFecPes, T01PM2_A4584HreFecPes[0]) ) )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreFecPes");
               GXutil.writeLogRaw("Old: ",Z4584HreFecPes);
               GXutil.writeLogRaw("Current: ",T01PM2_A4584HreFecPes[0]);
            }
            if ( Z4585HreMaqPes != T01PM2_A4585HreMaqPes[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreMaqPes");
               GXutil.writeLogRaw("Old: ",Z4585HreMaqPes);
               GXutil.writeLogRaw("Current: ",T01PM2_A4585HreMaqPes[0]);
            }
            if ( Z4549HreULinPro != T01PM2_A4549HreULinPro[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreULinPro");
               GXutil.writeLogRaw("Old: ",Z4549HreULinPro);
               GXutil.writeLogRaw("Current: ",T01PM2_A4549HreULinPro[0]);
            }
            if ( GXutil.strcmp(Z4863HreUsrCod, T01PM2_A4863HreUsrCod[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreUsrCod");
               GXutil.writeLogRaw("Old: ",Z4863HreUsrCod);
               GXutil.writeLogRaw("Current: ",T01PM2_A4863HreUsrCod[0]);
            }
            if ( Z7814HReMaqNh != T01PM2_A7814HReMaqNh[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HReMaqNh");
               GXutil.writeLogRaw("Old: ",Z7814HReMaqNh);
               GXutil.writeLogRaw("Current: ",T01PM2_A7814HReMaqNh[0]);
            }
            if ( Z7815HReMaqVX != T01PM2_A7815HReMaqVX[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HReMaqVX");
               GXutil.writeLogRaw("Old: ",Z7815HReMaqVX);
               GXutil.writeLogRaw("Current: ",T01PM2_A7815HReMaqVX[0]);
            }
            if ( Z7816HReMaqBL != T01PM2_A7816HReMaqBL[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HReMaqBL");
               GXutil.writeLogRaw("Old: ",Z7816HReMaqBL);
               GXutil.writeLogRaw("Current: ",T01PM2_A7816HReMaqBL[0]);
            }
            if ( Z7817HReMaqFlow != T01PM2_A7817HReMaqFlow[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HReMaqFlow");
               GXutil.writeLogRaw("Old: ",Z7817HReMaqFlow);
               GXutil.writeLogRaw("Current: ",T01PM2_A7817HReMaqFlow[0]);
            }
            if ( Z7818HReMaqRPM != T01PM2_A7818HReMaqRPM[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HReMaqRPM");
               GXutil.writeLogRaw("Old: ",Z7818HReMaqRPM);
               GXutil.writeLogRaw("Current: ",T01PM2_A7818HReMaqRPM[0]);
            }
            if ( Z7819HReMaqMol != T01PM2_A7819HReMaqMol[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HReMaqMol");
               GXutil.writeLogRaw("Old: ",Z7819HReMaqMol);
               GXutil.writeLogRaw("Current: ",T01PM2_A7819HReMaqMol[0]);
            }
            if ( Z7820HReMaqTor != T01PM2_A7820HReMaqTor[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HReMaqTor");
               GXutil.writeLogRaw("Old: ",Z7820HReMaqTor);
               GXutil.writeLogRaw("Current: ",T01PM2_A7820HReMaqTor[0]);
            }
            if ( GXutil.strcmp(Z7821HReMaqCla, T01PM2_A7821HReMaqCla[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HReMaqCla");
               GXutil.writeLogRaw("Old: ",Z7821HReMaqCla);
               GXutil.writeLogRaw("Current: ",T01PM2_A7821HReMaqCla[0]);
            }
            if ( Z7822HReMaqTej != T01PM2_A7822HReMaqTej[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HReMaqTej");
               GXutil.writeLogRaw("Old: ",Z7822HReMaqTej);
               GXutil.writeLogRaw("Current: ",T01PM2_A7822HReMaqTej[0]);
            }
            if ( Z7823HReMaqDel != T01PM2_A7823HReMaqDel[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HReMaqDel");
               GXutil.writeLogRaw("Old: ",Z7823HReMaqDel);
               GXutil.writeLogRaw("Current: ",T01PM2_A7823HReMaqDel[0]);
            }
            if ( Z7824HReMaqPML != T01PM2_A7824HReMaqPML[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HReMaqPML");
               GXutil.writeLogRaw("Old: ",Z7824HReMaqPML);
               GXutil.writeLogRaw("Current: ",T01PM2_A7824HReMaqPML[0]);
            }
            if ( DecimalUtil.compareTo(Z8602HreCosAA, T01PM2_A8602HreCosAA[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreCosAA");
               GXutil.writeLogRaw("Old: ",Z8602HreCosAA);
               GXutil.writeLogRaw("Current: ",T01PM2_A8602HreCosAA[0]);
            }
            if ( DecimalUtil.compareTo(Z8603HrecosAd, T01PM2_A8603HrecosAd[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HrecosAd");
               GXutil.writeLogRaw("Old: ",Z8603HrecosAd);
               GXutil.writeLogRaw("Current: ",T01PM2_A8603HrecosAd[0]);
            }
            if ( DecimalUtil.compareTo(Z8604HreCosAnc, T01PM2_A8604HreCosAnc[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreCosAnc");
               GXutil.writeLogRaw("Old: ",Z8604HreCosAnc);
               GXutil.writeLogRaw("Current: ",T01PM2_A8604HreCosAnc[0]);
            }
            if ( DecimalUtil.compareTo(Z8605HreCosCol, T01PM2_A8605HreCosCol[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreCosCol");
               GXutil.writeLogRaw("Old: ",Z8605HreCosCol);
               GXutil.writeLogRaw("Current: ",T01PM2_A8605HreCosCol[0]);
            }
            if ( DecimalUtil.compareTo(Z8606HreCosPA, T01PM2_A8606HreCosPA[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreCosPA");
               GXutil.writeLogRaw("Old: ",Z8606HreCosPA);
               GXutil.writeLogRaw("Current: ",T01PM2_A8606HreCosPA[0]);
            }
            if ( DecimalUtil.compareTo(Z8607HreCosPD, T01PM2_A8607HreCosPD[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreCosPD");
               GXutil.writeLogRaw("Old: ",Z8607HreCosPD);
               GXutil.writeLogRaw("Current: ",T01PM2_A8607HreCosPD[0]);
            }
            if ( Z9780HreLtsSb != T01PM2_A9780HreLtsSb[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreLtsSb");
               GXutil.writeLogRaw("Old: ",Z9780HreLtsSb);
               GXutil.writeLogRaw("Current: ",T01PM2_A9780HreLtsSb[0]);
            }
            if ( Z9781HreLtsRm != T01PM2_A9781HreLtsRm[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreLtsRm");
               GXutil.writeLogRaw("Old: ",Z9781HreLtsRm);
               GXutil.writeLogRaw("Current: ",T01PM2_A9781HreLtsRm[0]);
            }
            if ( GXutil.strcmp(Z9803HreAcaQ, T01PM2_A9803HreAcaQ[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreAcaQ");
               GXutil.writeLogRaw("Old: ",Z9803HreAcaQ);
               GXutil.writeLogRaw("Current: ",T01PM2_A9803HreAcaQ[0]);
            }
            if ( GXutil.strcmp(Z9804HreAcab, T01PM2_A9804HreAcab[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreAcab");
               GXutil.writeLogRaw("Old: ",Z9804HreAcab);
               GXutil.writeLogRaw("Current: ",T01PM2_A9804HreAcab[0]);
            }
            if ( GXutil.strcmp(Z1094HreNPrg, T01PM2_A1094HreNPrg[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreNPrg");
               GXutil.writeLogRaw("Old: ",Z1094HreNPrg);
               GXutil.writeLogRaw("Current: ",T01PM2_A1094HreNPrg[0]);
            }
            if ( GXutil.strcmp(Z697HreLotF, T01PM2_A697HreLotF[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreLotF");
               GXutil.writeLogRaw("Old: ",Z697HreLotF);
               GXutil.writeLogRaw("Current: ",T01PM2_A697HreLotF[0]);
            }
            if ( Z10381HreAnc != T01PM2_A10381HreAnc[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreAnc");
               GXutil.writeLogRaw("Old: ",Z10381HreAnc);
               GXutil.writeLogRaw("Current: ",T01PM2_A10381HreAnc[0]);
            }
            if ( Z10382HreGrm != T01PM2_A10382HreGrm[0] )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreGrm");
               GXutil.writeLogRaw("Old: ",Z10382HreGrm);
               GXutil.writeLogRaw("Current: ",T01PM2_A10382HreGrm[0]);
            }
            if ( DecimalUtil.compareTo(Z10383HreVel, T01PM2_A10383HreVel[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreVel");
               GXutil.writeLogRaw("Old: ",Z10383HreVel);
               GXutil.writeLogRaw("Current: ",T01PM2_A10383HreVel[0]);
            }
            if ( GXutil.strcmp(Z10384HreObs, T01PM2_A10384HreObs[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreObs");
               GXutil.writeLogRaw("Old: ",Z10384HreObs);
               GXutil.writeLogRaw("Current: ",T01PM2_A10384HreObs[0]);
            }
            if ( GXutil.strcmp(Z11508HreAva, T01PM2_A11508HreAva[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreAva");
               GXutil.writeLogRaw("Old: ",Z11508HreAva);
               GXutil.writeLogRaw("Current: ",T01PM2_A11508HreAva[0]);
            }
            if ( GXutil.strcmp(Z12126HreAs, T01PM2_A12126HreAs[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreAs");
               GXutil.writeLogRaw("Old: ",Z12126HreAs);
               GXutil.writeLogRaw("Current: ",T01PM2_A12126HreAs[0]);
            }
            if ( GXutil.strcmp(Z12127HreAi, T01PM2_A12127HreAi[0]) != 0 )
            {
               GXutil.writeLogln("hisrem:[seudo value changed for attri]"+"HreAi");
               GXutil.writeLogRaw("Old: ",Z12127HreAi);
               GXutil.writeLogRaw("Current: ",T01PM2_A12127HreAi[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISREM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PM678( )
   {
      beforeValidate1PM678( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PM678( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PM678( 0) ;
         checkOptimisticConcurrency1PM678( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PM678( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PM678( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PM10 */
                  pr_default.execute(8, new Object[] {Short.valueOf(A4545HreLinMaq), Boolean.valueOf(n4546HreMaqCod), A4546HreMaqCod, Boolean.valueOf(n4547HreVolPrd), Integer.valueOf(A4547HreVolPrd), Boolean.valueOf(n4548HreFacAbs), A4548HreFacAbs, Boolean.valueOf(n4584HreFecPes), A4584HreFecPes, Boolean.valueOf(n4585HreMaqPes), Byte.valueOf(A4585HreMaqPes), Boolean.valueOf(n4549HreULinPro), Byte.valueOf(A4549HreULinPro), Boolean.valueOf(n4863HreUsrCod), A4863HreUsrCod, Boolean.valueOf(n7814HReMaqNh), Short.valueOf(A7814HReMaqNh), Boolean.valueOf(n7815HReMaqVX), Byte.valueOf(A7815HReMaqVX), Boolean.valueOf(n7816HReMaqBL), Byte.valueOf(A7816HReMaqBL), Boolean.valueOf(n7817HReMaqFlow), Byte.valueOf(A7817HReMaqFlow), Boolean.valueOf(n7818HReMaqRPM), Short.valueOf(A7818HReMaqRPM), Boolean.valueOf(n7819HReMaqMol), Short.valueOf(A7819HReMaqMol), Boolean.valueOf(n7820HReMaqTor), Short.valueOf(A7820HReMaqTor), Boolean.valueOf(n7821HReMaqCla), A7821HReMaqCla, Boolean.valueOf(n7822HReMaqTej), Byte.valueOf(A7822HReMaqTej), Boolean.valueOf(n7823HReMaqDel), Byte.valueOf(A7823HReMaqDel), Boolean.valueOf(n7824HReMaqPML), Short.valueOf(A7824HReMaqPML), Boolean.valueOf(n8602HreCosAA), A8602HreCosAA, Boolean.valueOf(n8603HrecosAd), A8603HrecosAd, Boolean.valueOf(n8604HreCosAnc), A8604HreCosAnc, Boolean.valueOf(n8605HreCosCol), A8605HreCosCol, Boolean.valueOf(n8606HreCosPA), A8606HreCosPA, Boolean.valueOf(n8607HreCosPD), A8607HreCosPD, Boolean.valueOf(n9780HreLtsSb), Integer.valueOf(A9780HreLtsSb), Boolean.valueOf(n9781HreLtsRm), Integer.valueOf(A9781HreLtsRm), Boolean.valueOf(n9803HreAcaQ), A9803HreAcaQ, Boolean.valueOf(n9804HreAcab), A9804HreAcab, Boolean.valueOf(n1094HreNPrg), A1094HreNPrg, Boolean.valueOf(n697HreLotF), A697HreLotF, Boolean.valueOf(n10381HreAnc), Short.valueOf(A10381HreAnc), Boolean.valueOf(n10382HreGrm), Short.valueOf(A10382HreGrm), Boolean.valueOf(n10383HreVel), A10383HreVel, Boolean.valueOf(n10384HreObs), A10384HreObs, Boolean.valueOf(n11508HreAva), A11508HreAva, Boolean.valueOf(n12126HreAs), A12126HreAs, Boolean.valueOf(n12127HreAi), A12127HreAi, A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
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
                        resetCaption1PM0( ) ;
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
            load1PM678( ) ;
         }
         endLevel1PM678( ) ;
      }
      closeExtendedTableCursors1PM678( ) ;
   }

   public void update1PM678( )
   {
      beforeValidate1PM678( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PM678( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PM678( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PM678( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PM678( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PM11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n4546HreMaqCod), A4546HreMaqCod, Boolean.valueOf(n4547HreVolPrd), Integer.valueOf(A4547HreVolPrd), Boolean.valueOf(n4548HreFacAbs), A4548HreFacAbs, Boolean.valueOf(n4584HreFecPes), A4584HreFecPes, Boolean.valueOf(n4585HreMaqPes), Byte.valueOf(A4585HreMaqPes), Boolean.valueOf(n4549HreULinPro), Byte.valueOf(A4549HreULinPro), Boolean.valueOf(n4863HreUsrCod), A4863HreUsrCod, Boolean.valueOf(n7814HReMaqNh), Short.valueOf(A7814HReMaqNh), Boolean.valueOf(n7815HReMaqVX), Byte.valueOf(A7815HReMaqVX), Boolean.valueOf(n7816HReMaqBL), Byte.valueOf(A7816HReMaqBL), Boolean.valueOf(n7817HReMaqFlow), Byte.valueOf(A7817HReMaqFlow), Boolean.valueOf(n7818HReMaqRPM), Short.valueOf(A7818HReMaqRPM), Boolean.valueOf(n7819HReMaqMol), Short.valueOf(A7819HReMaqMol), Boolean.valueOf(n7820HReMaqTor), Short.valueOf(A7820HReMaqTor), Boolean.valueOf(n7821HReMaqCla), A7821HReMaqCla, Boolean.valueOf(n7822HReMaqTej), Byte.valueOf(A7822HReMaqTej), Boolean.valueOf(n7823HReMaqDel), Byte.valueOf(A7823HReMaqDel), Boolean.valueOf(n7824HReMaqPML), Short.valueOf(A7824HReMaqPML), Boolean.valueOf(n8602HreCosAA), A8602HreCosAA, Boolean.valueOf(n8603HrecosAd), A8603HrecosAd, Boolean.valueOf(n8604HreCosAnc), A8604HreCosAnc, Boolean.valueOf(n8605HreCosCol), A8605HreCosCol, Boolean.valueOf(n8606HreCosPA), A8606HreCosPA, Boolean.valueOf(n8607HreCosPD), A8607HreCosPD, Boolean.valueOf(n9780HreLtsSb), Integer.valueOf(A9780HreLtsSb), Boolean.valueOf(n9781HreLtsRm), Integer.valueOf(A9781HreLtsRm), Boolean.valueOf(n9803HreAcaQ), A9803HreAcaQ, Boolean.valueOf(n9804HreAcab), A9804HreAcab, Boolean.valueOf(n1094HreNPrg), A1094HreNPrg, Boolean.valueOf(n697HreLotF), A697HreLotF, Boolean.valueOf(n10381HreAnc), Short.valueOf(A10381HreAnc), Boolean.valueOf(n10382HreGrm), Short.valueOf(A10382HreGrm), Boolean.valueOf(n10383HreVel), A10383HreVel, Boolean.valueOf(n10384HreObs), A10384HreObs, Boolean.valueOf(n11508HreAva), A11508HreAva, Boolean.valueOf(n12126HreAs), A12126HreAs, Boolean.valueOf(n12127HreAi), A12127HreAi, A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1PM678( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1PM0( ) ;
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
         endLevel1PM678( ) ;
      }
      closeExtendedTableCursors1PM678( ) ;
   }

   public void deferredUpdate1PM678( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1PM678( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PM678( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PM678( ) ;
         afterConfirm1PM678( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PM678( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PM12 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound678 == 0 )
                     {
                        initAll1PM678( ) ;
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
                     resetCaption1PM0( ) ;
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
      sMode678 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PM678( ) ;
      Gx_mode = sMode678 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PM678( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01PM13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T01PM14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01PM15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01PM16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevel1PM678( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1PM678( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "hisrem");
         if ( AnyError == 0 )
         {
            confirmValues1PM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "hisrem");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PM678( )
   {
      /* Using cursor T01PM17 */
      pr_default.execute(15);
      RcdFound678 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound678 = (short)(1) ;
         A396EmprCod = T01PM17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T01PM17_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T01PM17_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T01PM17_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T01PM17_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A4545HreLinMaq = T01PM17_A4545HreLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PM678( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound678 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound678 = (short)(1) ;
         A396EmprCod = T01PM17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T01PM17_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T01PM17_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T01PM17_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T01PM17_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A4545HreLinMaq = T01PM17_A4545HreLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
      }
   }

   public void scanEnd1PM678( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1PM678( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PM678( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PM678( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PM678( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PM678( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PM678( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PM678( )
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
      edtHreLinMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Enabled), 5, 0), true);
      edtHreMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqCod_Enabled), 5, 0), true);
      edtHreVolPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreVolPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreVolPrd_Enabled), 5, 0), true);
      edtHreFacAbs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFacAbs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFacAbs_Enabled), 5, 0), true);
      edtHreFecPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFecPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecPes_Enabled), 5, 0), true);
      edtHreMaqPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreMaqPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqPes_Enabled), 5, 0), true);
      edtHreULinPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreULinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreULinPro_Enabled), 5, 0), true);
      edtHreUsrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreUsrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreUsrCod_Enabled), 5, 0), true);
      edtHReMaqNh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqNh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqNh_Enabled), 5, 0), true);
      edtHReMaqVX_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqVX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqVX_Enabled), 5, 0), true);
      edtHReMaqBL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqBL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqBL_Enabled), 5, 0), true);
      edtHReMaqFlow_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqFlow_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqFlow_Enabled), 5, 0), true);
      edtHReMaqRPM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqRPM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqRPM_Enabled), 5, 0), true);
      edtHReMaqMol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqMol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqMol_Enabled), 5, 0), true);
      edtHReMaqTor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqTor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqTor_Enabled), 5, 0), true);
      edtHReMaqCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqCla_Enabled), 5, 0), true);
      edtHReMaqTej_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqTej_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqTej_Enabled), 5, 0), true);
      edtHReMaqDel_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqDel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqDel_Enabled), 5, 0), true);
      edtHReMaqPML_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqPML_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqPML_Enabled), 5, 0), true);
      edtHreCosAA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCosAA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosAA_Enabled), 5, 0), true);
      edtHrecosAd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrecosAd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrecosAd_Enabled), 5, 0), true);
      edtHreCosAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCosAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosAnc_Enabled), 5, 0), true);
      edtHreCosCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCosCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosCol_Enabled), 5, 0), true);
      edtHreCosPA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCosPA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosPA_Enabled), 5, 0), true);
      edtHreCosPD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCosPD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosPD_Enabled), 5, 0), true);
      edtHreLtsSb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLtsSb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLtsSb_Enabled), 5, 0), true);
      edtHreLtsRm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLtsRm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLtsRm_Enabled), 5, 0), true);
      edtHreAcaQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcaQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcaQ_Enabled), 5, 0), true);
      edtHreAcab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcab_Enabled), 5, 0), true);
      edtHreNPrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNPrg_Enabled), 5, 0), true);
      edtHreLotF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLotF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLotF_Enabled), 5, 0), true);
      edtHreAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAnc_Enabled), 5, 0), true);
      edtHreGrm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreGrm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreGrm_Enabled), 5, 0), true);
      edtHreVel_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreVel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreVel_Enabled), 5, 0), true);
      edtHreObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreObs_Enabled), 5, 0), true);
      edtHreAva_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAva_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAva_Enabled), 5, 0), true);
      edtHreAs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAs_Enabled), 5, 0), true);
      edtHreAi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAi_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1PM678( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1PM0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.hisrem", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4545HreLinMaq", GXutil.ltrim( localUtil.ntoc( Z4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4546HreMaqCod", GXutil.rtrim( Z4546HreMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4547HreVolPrd", GXutil.ltrim( localUtil.ntoc( Z4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4548HreFacAbs", GXutil.ltrim( localUtil.ntoc( Z4548HreFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4584HreFecPes", localUtil.ttoc( Z4584HreFecPes, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4585HreMaqPes", GXutil.ltrim( localUtil.ntoc( Z4585HreMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4549HreULinPro", GXutil.ltrim( localUtil.ntoc( Z4549HreULinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4863HreUsrCod", GXutil.rtrim( Z4863HreUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7814HReMaqNh", GXutil.ltrim( localUtil.ntoc( Z7814HReMaqNh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7815HReMaqVX", GXutil.ltrim( localUtil.ntoc( Z7815HReMaqVX, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7816HReMaqBL", GXutil.ltrim( localUtil.ntoc( Z7816HReMaqBL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7817HReMaqFlow", GXutil.ltrim( localUtil.ntoc( Z7817HReMaqFlow, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7818HReMaqRPM", GXutil.ltrim( localUtil.ntoc( Z7818HReMaqRPM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7819HReMaqMol", GXutil.ltrim( localUtil.ntoc( Z7819HReMaqMol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7820HReMaqTor", GXutil.ltrim( localUtil.ntoc( Z7820HReMaqTor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7821HReMaqCla", GXutil.rtrim( Z7821HReMaqCla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7822HReMaqTej", GXutil.ltrim( localUtil.ntoc( Z7822HReMaqTej, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7823HReMaqDel", GXutil.ltrim( localUtil.ntoc( Z7823HReMaqDel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7824HReMaqPML", GXutil.ltrim( localUtil.ntoc( Z7824HReMaqPML, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8602HreCosAA", GXutil.ltrim( localUtil.ntoc( Z8602HreCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8603HrecosAd", GXutil.ltrim( localUtil.ntoc( Z8603HrecosAd, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8604HreCosAnc", GXutil.ltrim( localUtil.ntoc( Z8604HreCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8605HreCosCol", GXutil.ltrim( localUtil.ntoc( Z8605HreCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8606HreCosPA", GXutil.ltrim( localUtil.ntoc( Z8606HreCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8607HreCosPD", GXutil.ltrim( localUtil.ntoc( Z8607HreCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9780HreLtsSb", GXutil.ltrim( localUtil.ntoc( Z9780HreLtsSb, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9781HreLtsRm", GXutil.ltrim( localUtil.ntoc( Z9781HreLtsRm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9803HreAcaQ", GXutil.rtrim( Z9803HreAcaQ));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9804HreAcab", GXutil.rtrim( Z9804HreAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1094HreNPrg", GXutil.rtrim( Z1094HreNPrg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z697HreLotF", GXutil.rtrim( Z697HreLotF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10381HreAnc", GXutil.ltrim( localUtil.ntoc( Z10381HreAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10382HreGrm", GXutil.ltrim( localUtil.ntoc( Z10382HreGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10383HreVel", GXutil.ltrim( localUtil.ntoc( Z10383HreVel, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10384HreObs", Z10384HreObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11508HreAva", GXutil.rtrim( Z11508HreAva));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12126HreAs", GXutil.rtrim( Z12126HreAs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12127HreAi", GXutil.rtrim( Z12127HreAi));
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
      return formatLink("app.hisrem", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "HISREM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla HISREM", "") ;
   }

   public void initializeNonKey1PM678( )
   {
      A4546HreMaqCod = "" ;
      n4546HreMaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4546HreMaqCod", A4546HreMaqCod);
      A4547HreVolPrd = 0 ;
      n4547HreVolPrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4547HreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4547HreVolPrd), 5, 0));
      A4548HreFacAbs = DecimalUtil.ZERO ;
      n4548HreFacAbs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4548HreFacAbs", GXutil.ltrimstr( A4548HreFacAbs, 6, 2));
      A4584HreFecPes = GXutil.resetTime( GXutil.nullDate() );
      n4584HreFecPes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4584HreFecPes", localUtil.ttoc( A4584HreFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A4585HreMaqPes = (byte)(0) ;
      n4585HreMaqPes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4585HreMaqPes", GXutil.str( A4585HreMaqPes, 1, 0));
      A4549HreULinPro = (byte)(0) ;
      n4549HreULinPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4549HreULinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4549HreULinPro), 2, 0));
      A4863HreUsrCod = "" ;
      n4863HreUsrCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4863HreUsrCod", A4863HreUsrCod);
      A7814HReMaqNh = (short)(0) ;
      n7814HReMaqNh = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7814HReMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7814HReMaqNh), 3, 0));
      A7815HReMaqVX = (byte)(0) ;
      n7815HReMaqVX = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7815HReMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7815HReMaqVX), 2, 0));
      A7816HReMaqBL = (byte)(0) ;
      n7816HReMaqBL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7816HReMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7816HReMaqBL), 2, 0));
      A7817HReMaqFlow = (byte)(0) ;
      n7817HReMaqFlow = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7817HReMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7817HReMaqFlow), 2, 0));
      A7818HReMaqRPM = (short)(0) ;
      n7818HReMaqRPM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7818HReMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7818HReMaqRPM), 4, 0));
      A7819HReMaqMol = (short)(0) ;
      n7819HReMaqMol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7819HReMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7819HReMaqMol), 3, 0));
      A7820HReMaqTor = (short)(0) ;
      n7820HReMaqTor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7820HReMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7820HReMaqTor), 3, 0));
      A7821HReMaqCla = "" ;
      n7821HReMaqCla = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7821HReMaqCla", A7821HReMaqCla);
      A7822HReMaqTej = (byte)(0) ;
      n7822HReMaqTej = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7822HReMaqTej", GXutil.str( A7822HReMaqTej, 1, 0));
      A7823HReMaqDel = (byte)(0) ;
      n7823HReMaqDel = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7823HReMaqDel", GXutil.str( A7823HReMaqDel, 1, 0));
      A7824HReMaqPML = (short)(0) ;
      n7824HReMaqPML = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7824HReMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7824HReMaqPML), 3, 0));
      A8602HreCosAA = DecimalUtil.ZERO ;
      n8602HreCosAA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8602HreCosAA", GXutil.ltrimstr( A8602HreCosAA, 10, 2));
      A8603HrecosAd = DecimalUtil.ZERO ;
      n8603HrecosAd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8603HrecosAd", GXutil.ltrimstr( A8603HrecosAd, 10, 2));
      A8604HreCosAnc = DecimalUtil.ZERO ;
      n8604HreCosAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8604HreCosAnc", GXutil.ltrimstr( A8604HreCosAnc, 10, 2));
      A8605HreCosCol = DecimalUtil.ZERO ;
      n8605HreCosCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8605HreCosCol", GXutil.ltrimstr( A8605HreCosCol, 10, 2));
      A8606HreCosPA = DecimalUtil.ZERO ;
      n8606HreCosPA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8606HreCosPA", GXutil.ltrimstr( A8606HreCosPA, 10, 2));
      A8607HreCosPD = DecimalUtil.ZERO ;
      n8607HreCosPD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8607HreCosPD", GXutil.ltrimstr( A8607HreCosPD, 10, 2));
      A9780HreLtsSb = 0 ;
      n9780HreLtsSb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9780HreLtsSb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9780HreLtsSb), 5, 0));
      A9781HreLtsRm = 0 ;
      n9781HreLtsRm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9781HreLtsRm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9781HreLtsRm), 5, 0));
      A9803HreAcaQ = "" ;
      n9803HreAcaQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9803HreAcaQ", A9803HreAcaQ);
      A9804HreAcab = "" ;
      n9804HreAcab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9804HreAcab", A9804HreAcab);
      A1094HreNPrg = "" ;
      n1094HreNPrg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1094HreNPrg", A1094HreNPrg);
      A697HreLotF = "" ;
      n697HreLotF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A697HreLotF", A697HreLotF);
      A10381HreAnc = (short)(0) ;
      n10381HreAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10381HreAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10381HreAnc), 3, 0));
      A10382HreGrm = (short)(0) ;
      n10382HreGrm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10382HreGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10382HreGrm), 4, 0));
      A10383HreVel = DecimalUtil.ZERO ;
      n10383HreVel = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10383HreVel", GXutil.ltrimstr( A10383HreVel, 6, 2));
      A10384HreObs = "" ;
      n10384HreObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10384HreObs", A10384HreObs);
      A11508HreAva = "" ;
      n11508HreAva = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11508HreAva", A11508HreAva);
      A12126HreAs = "" ;
      n12126HreAs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12126HreAs", A12126HreAs);
      A12127HreAi = "" ;
      n12127HreAi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12127HreAi", A12127HreAi);
      Z4546HreMaqCod = "" ;
      Z4547HreVolPrd = 0 ;
      Z4548HreFacAbs = DecimalUtil.ZERO ;
      Z4584HreFecPes = GXutil.resetTime( GXutil.nullDate() );
      Z4585HreMaqPes = (byte)(0) ;
      Z4549HreULinPro = (byte)(0) ;
      Z4863HreUsrCod = "" ;
      Z7814HReMaqNh = (short)(0) ;
      Z7815HReMaqVX = (byte)(0) ;
      Z7816HReMaqBL = (byte)(0) ;
      Z7817HReMaqFlow = (byte)(0) ;
      Z7818HReMaqRPM = (short)(0) ;
      Z7819HReMaqMol = (short)(0) ;
      Z7820HReMaqTor = (short)(0) ;
      Z7821HReMaqCla = "" ;
      Z7822HReMaqTej = (byte)(0) ;
      Z7823HReMaqDel = (byte)(0) ;
      Z7824HReMaqPML = (short)(0) ;
      Z8602HreCosAA = DecimalUtil.ZERO ;
      Z8603HrecosAd = DecimalUtil.ZERO ;
      Z8604HreCosAnc = DecimalUtil.ZERO ;
      Z8605HreCosCol = DecimalUtil.ZERO ;
      Z8606HreCosPA = DecimalUtil.ZERO ;
      Z8607HreCosPD = DecimalUtil.ZERO ;
      Z9780HreLtsSb = 0 ;
      Z9781HreLtsRm = 0 ;
      Z9803HreAcaQ = "" ;
      Z9804HreAcab = "" ;
      Z1094HreNPrg = "" ;
      Z697HreLotF = "" ;
      Z10381HreAnc = (short)(0) ;
      Z10382HreGrm = (short)(0) ;
      Z10383HreVel = DecimalUtil.ZERO ;
      Z10384HreObs = "" ;
      Z11508HreAva = "" ;
      Z12126HreAs = "" ;
      Z12127HreAi = "" ;
   }

   public void initAll1PM678( )
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
      A4545HreLinMaq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
      initializeNonKey1PM678( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016362917", true, true);
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
      httpContext.AddJavascriptSource("hisrem.js", "?202661016362917", false, true);
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
      edtHreLinMaq_Internalname = "HRELINMAQ" ;
      edtHreMaqCod_Internalname = "HREMAQCOD" ;
      edtHreVolPrd_Internalname = "HREVOLPRD" ;
      edtHreFacAbs_Internalname = "HREFACABS" ;
      edtHreFecPes_Internalname = "HREFECPES" ;
      edtHreMaqPes_Internalname = "HREMAQPES" ;
      edtHreULinPro_Internalname = "HREULINPRO" ;
      edtHreUsrCod_Internalname = "HREUSRCOD" ;
      edtHReMaqNh_Internalname = "HREMAQNH" ;
      edtHReMaqVX_Internalname = "HREMAQVX" ;
      edtHReMaqBL_Internalname = "HREMAQBL" ;
      edtHReMaqFlow_Internalname = "HREMAQFLOW" ;
      edtHReMaqRPM_Internalname = "HREMAQRPM" ;
      edtHReMaqMol_Internalname = "HREMAQMOL" ;
      edtHReMaqTor_Internalname = "HREMAQTOR" ;
      edtHReMaqCla_Internalname = "HREMAQCLA" ;
      edtHReMaqTej_Internalname = "HREMAQTEJ" ;
      edtHReMaqDel_Internalname = "HREMAQDEL" ;
      edtHReMaqPML_Internalname = "HREMAQPML" ;
      edtHreCosAA_Internalname = "HRECOSAA" ;
      edtHrecosAd_Internalname = "HRECOSAD" ;
      edtHreCosAnc_Internalname = "HRECOSANC" ;
      edtHreCosCol_Internalname = "HRECOSCOL" ;
      edtHreCosPA_Internalname = "HRECOSPA" ;
      edtHreCosPD_Internalname = "HRECOSPD" ;
      edtHreLtsSb_Internalname = "HRELTSSB" ;
      edtHreLtsRm_Internalname = "HRELTSRM" ;
      edtHreAcaQ_Internalname = "HREACAQ" ;
      edtHreAcab_Internalname = "HREACAB" ;
      edtHreNPrg_Internalname = "HRENPRG" ;
      edtHreLotF_Internalname = "HRELOTF" ;
      edtHreAnc_Internalname = "HREANC" ;
      edtHreGrm_Internalname = "HREGRM" ;
      edtHreVel_Internalname = "HREVEL" ;
      edtHreObs_Internalname = "HREOBS" ;
      edtHreAva_Internalname = "HREAVA" ;
      edtHreAs_Internalname = "HREAS" ;
      edtHreAi_Internalname = "HREAI" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla HISREM", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtHreAi_Jsonclick = "" ;
      edtHreAi_Enabled = 1 ;
      edtHreAs_Jsonclick = "" ;
      edtHreAs_Enabled = 1 ;
      edtHreAva_Jsonclick = "" ;
      edtHreAva_Enabled = 1 ;
      edtHreObs_Enabled = 1 ;
      edtHreVel_Jsonclick = "" ;
      edtHreVel_Enabled = 1 ;
      edtHreGrm_Jsonclick = "" ;
      edtHreGrm_Enabled = 1 ;
      edtHreAnc_Jsonclick = "" ;
      edtHreAnc_Enabled = 1 ;
      edtHreLotF_Jsonclick = "" ;
      edtHreLotF_Enabled = 1 ;
      edtHreNPrg_Jsonclick = "" ;
      edtHreNPrg_Enabled = 1 ;
      edtHreAcab_Jsonclick = "" ;
      edtHreAcab_Enabled = 1 ;
      edtHreAcaQ_Jsonclick = "" ;
      edtHreAcaQ_Enabled = 1 ;
      edtHreLtsRm_Jsonclick = "" ;
      edtHreLtsRm_Enabled = 1 ;
      edtHreLtsSb_Jsonclick = "" ;
      edtHreLtsSb_Enabled = 1 ;
      edtHreCosPD_Jsonclick = "" ;
      edtHreCosPD_Enabled = 1 ;
      edtHreCosPA_Jsonclick = "" ;
      edtHreCosPA_Enabled = 1 ;
      edtHreCosCol_Jsonclick = "" ;
      edtHreCosCol_Enabled = 1 ;
      edtHreCosAnc_Jsonclick = "" ;
      edtHreCosAnc_Enabled = 1 ;
      edtHrecosAd_Jsonclick = "" ;
      edtHrecosAd_Enabled = 1 ;
      edtHreCosAA_Jsonclick = "" ;
      edtHreCosAA_Enabled = 1 ;
      edtHReMaqPML_Jsonclick = "" ;
      edtHReMaqPML_Enabled = 1 ;
      edtHReMaqDel_Jsonclick = "" ;
      edtHReMaqDel_Enabled = 1 ;
      edtHReMaqTej_Jsonclick = "" ;
      edtHReMaqTej_Enabled = 1 ;
      edtHReMaqCla_Jsonclick = "" ;
      edtHReMaqCla_Enabled = 1 ;
      edtHReMaqTor_Jsonclick = "" ;
      edtHReMaqTor_Enabled = 1 ;
      edtHReMaqMol_Jsonclick = "" ;
      edtHReMaqMol_Enabled = 1 ;
      edtHReMaqRPM_Jsonclick = "" ;
      edtHReMaqRPM_Enabled = 1 ;
      edtHReMaqFlow_Jsonclick = "" ;
      edtHReMaqFlow_Enabled = 1 ;
      edtHReMaqBL_Jsonclick = "" ;
      edtHReMaqBL_Enabled = 1 ;
      edtHReMaqVX_Jsonclick = "" ;
      edtHReMaqVX_Enabled = 1 ;
      edtHReMaqNh_Jsonclick = "" ;
      edtHReMaqNh_Enabled = 1 ;
      edtHreUsrCod_Jsonclick = "" ;
      edtHreUsrCod_Enabled = 1 ;
      edtHreULinPro_Jsonclick = "" ;
      edtHreULinPro_Enabled = 1 ;
      edtHreMaqPes_Jsonclick = "" ;
      edtHreMaqPes_Enabled = 1 ;
      edtHreFecPes_Jsonclick = "" ;
      edtHreFecPes_Enabled = 1 ;
      edtHreFacAbs_Jsonclick = "" ;
      edtHreFacAbs_Enabled = 1 ;
      edtHreVolPrd_Jsonclick = "" ;
      edtHreVolPrd_Enabled = 1 ;
      edtHreMaqCod_Jsonclick = "" ;
      edtHreMaqCod_Enabled = 1 ;
      edtHreLinMaq_Jsonclick = "" ;
      edtHreLinMaq_Enabled = 1 ;
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
      /* Using cursor T01PM18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(16);
      GX_FocusControl = edtHreMaqCod_Internalname ;
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
      /* Using cursor T01PM18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Hrelinmaq( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4546HreMaqCod", GXutil.rtrim( A4546HreMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4547HreVolPrd", GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4548HreFacAbs", GXutil.ltrim( localUtil.ntoc( A4548HreFacAbs, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4584HreFecPes", localUtil.ttoc( A4584HreFecPes, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A4585HreMaqPes", GXutil.ltrim( localUtil.ntoc( A4585HreMaqPes, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4549HreULinPro", GXutil.ltrim( localUtil.ntoc( A4549HreULinPro, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4863HreUsrCod", GXutil.rtrim( A4863HreUsrCod));
      httpContext.ajax_rsp_assign_attri("", false, "A7814HReMaqNh", GXutil.ltrim( localUtil.ntoc( A7814HReMaqNh, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7815HReMaqVX", GXutil.ltrim( localUtil.ntoc( A7815HReMaqVX, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7816HReMaqBL", GXutil.ltrim( localUtil.ntoc( A7816HReMaqBL, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7817HReMaqFlow", GXutil.ltrim( localUtil.ntoc( A7817HReMaqFlow, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7818HReMaqRPM", GXutil.ltrim( localUtil.ntoc( A7818HReMaqRPM, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7819HReMaqMol", GXutil.ltrim( localUtil.ntoc( A7819HReMaqMol, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7820HReMaqTor", GXutil.ltrim( localUtil.ntoc( A7820HReMaqTor, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7821HReMaqCla", GXutil.rtrim( A7821HReMaqCla));
      httpContext.ajax_rsp_assign_attri("", false, "A7822HReMaqTej", GXutil.ltrim( localUtil.ntoc( A7822HReMaqTej, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7823HReMaqDel", GXutil.ltrim( localUtil.ntoc( A7823HReMaqDel, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7824HReMaqPML", GXutil.ltrim( localUtil.ntoc( A7824HReMaqPML, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8602HreCosAA", GXutil.ltrim( localUtil.ntoc( A8602HreCosAA, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8603HrecosAd", GXutil.ltrim( localUtil.ntoc( A8603HrecosAd, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8604HreCosAnc", GXutil.ltrim( localUtil.ntoc( A8604HreCosAnc, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8605HreCosCol", GXutil.ltrim( localUtil.ntoc( A8605HreCosCol, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8606HreCosPA", GXutil.ltrim( localUtil.ntoc( A8606HreCosPA, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8607HreCosPD", GXutil.ltrim( localUtil.ntoc( A8607HreCosPD, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9780HreLtsSb", GXutil.ltrim( localUtil.ntoc( A9780HreLtsSb, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9781HreLtsRm", GXutil.ltrim( localUtil.ntoc( A9781HreLtsRm, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9803HreAcaQ", GXutil.rtrim( A9803HreAcaQ));
      httpContext.ajax_rsp_assign_attri("", false, "A9804HreAcab", GXutil.rtrim( A9804HreAcab));
      httpContext.ajax_rsp_assign_attri("", false, "A1094HreNPrg", GXutil.rtrim( A1094HreNPrg));
      httpContext.ajax_rsp_assign_attri("", false, "A697HreLotF", GXutil.rtrim( A697HreLotF));
      httpContext.ajax_rsp_assign_attri("", false, "A10381HreAnc", GXutil.ltrim( localUtil.ntoc( A10381HreAnc, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10382HreGrm", GXutil.ltrim( localUtil.ntoc( A10382HreGrm, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10383HreVel", GXutil.ltrim( localUtil.ntoc( A10383HreVel, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10384HreObs", A10384HreObs);
      httpContext.ajax_rsp_assign_attri("", false, "A11508HreAva", GXutil.rtrim( A11508HreAva));
      httpContext.ajax_rsp_assign_attri("", false, "A12126HreAs", GXutil.rtrim( A12126HreAs));
      httpContext.ajax_rsp_assign_attri("", false, "A12127HreAi", GXutil.rtrim( A12127HreAi));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4545HreLinMaq", GXutil.ltrim( localUtil.ntoc( Z4545HreLinMaq, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4546HreMaqCod", GXutil.rtrim( Z4546HreMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4547HreVolPrd", GXutil.ltrim( localUtil.ntoc( Z4547HreVolPrd, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4548HreFacAbs", GXutil.ltrim( localUtil.ntoc( Z4548HreFacAbs, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4584HreFecPes", localUtil.ttoc( Z4584HreFecPes, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4585HreMaqPes", GXutil.ltrim( localUtil.ntoc( Z4585HreMaqPes, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4549HreULinPro", GXutil.ltrim( localUtil.ntoc( Z4549HreULinPro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4863HreUsrCod", GXutil.rtrim( Z4863HreUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7814HReMaqNh", GXutil.ltrim( localUtil.ntoc( Z7814HReMaqNh, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7815HReMaqVX", GXutil.ltrim( localUtil.ntoc( Z7815HReMaqVX, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7816HReMaqBL", GXutil.ltrim( localUtil.ntoc( Z7816HReMaqBL, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7817HReMaqFlow", GXutil.ltrim( localUtil.ntoc( Z7817HReMaqFlow, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7818HReMaqRPM", GXutil.ltrim( localUtil.ntoc( Z7818HReMaqRPM, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7819HReMaqMol", GXutil.ltrim( localUtil.ntoc( Z7819HReMaqMol, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7820HReMaqTor", GXutil.ltrim( localUtil.ntoc( Z7820HReMaqTor, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7821HReMaqCla", GXutil.rtrim( Z7821HReMaqCla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7822HReMaqTej", GXutil.ltrim( localUtil.ntoc( Z7822HReMaqTej, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7823HReMaqDel", GXutil.ltrim( localUtil.ntoc( Z7823HReMaqDel, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7824HReMaqPML", GXutil.ltrim( localUtil.ntoc( Z7824HReMaqPML, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8602HreCosAA", GXutil.ltrim( localUtil.ntoc( Z8602HreCosAA, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8603HrecosAd", GXutil.ltrim( localUtil.ntoc( Z8603HrecosAd, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8604HreCosAnc", GXutil.ltrim( localUtil.ntoc( Z8604HreCosAnc, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8605HreCosCol", GXutil.ltrim( localUtil.ntoc( Z8605HreCosCol, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8606HreCosPA", GXutil.ltrim( localUtil.ntoc( Z8606HreCosPA, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8607HreCosPD", GXutil.ltrim( localUtil.ntoc( Z8607HreCosPD, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9780HreLtsSb", GXutil.ltrim( localUtil.ntoc( Z9780HreLtsSb, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9781HreLtsRm", GXutil.ltrim( localUtil.ntoc( Z9781HreLtsRm, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9803HreAcaQ", GXutil.rtrim( Z9803HreAcaQ));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9804HreAcab", GXutil.rtrim( Z9804HreAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1094HreNPrg", GXutil.rtrim( Z1094HreNPrg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z697HreLotF", GXutil.rtrim( Z697HreLotF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10381HreAnc", GXutil.ltrim( localUtil.ntoc( Z10381HreAnc, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10382HreGrm", GXutil.ltrim( localUtil.ntoc( Z10382HreGrm, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10383HreVel", GXutil.ltrim( localUtil.ntoc( Z10383HreVel, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10384HreObs", Z10384HreObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11508HreAva", GXutil.rtrim( Z11508HreAva));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12126HreAs", GXutil.rtrim( Z12126HreAs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12127HreAi", GXutil.rtrim( Z12127HreAi));
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
      setEventMetadata("VALID_HRELINMAQ","{handler:'valid_Hrelinmaq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HRELINMAQ",",oparms:[{av:'A4546HreMaqCod',fld:'HREMAQCOD',pic:''},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A4548HreFacAbs',fld:'HREFACABS',pic:'ZZ9.99'},{av:'A4584HreFecPes',fld:'HREFECPES',pic:'99/99/99 99:99:99'},{av:'A4585HreMaqPes',fld:'HREMAQPES',pic:'9'},{av:'A4549HreULinPro',fld:'HREULINPRO',pic:'Z9'},{av:'A4863HreUsrCod',fld:'HREUSRCOD',pic:''},{av:'A7814HReMaqNh',fld:'HREMAQNH',pic:'ZZ9'},{av:'A7815HReMaqVX',fld:'HREMAQVX',pic:'Z9'},{av:'A7816HReMaqBL',fld:'HREMAQBL',pic:'Z9'},{av:'A7817HReMaqFlow',fld:'HREMAQFLOW',pic:'Z9'},{av:'A7818HReMaqRPM',fld:'HREMAQRPM',pic:'ZZZ9'},{av:'A7819HReMaqMol',fld:'HREMAQMOL',pic:'ZZ9'},{av:'A7820HReMaqTor',fld:'HREMAQTOR',pic:'ZZ9'},{av:'A7821HReMaqCla',fld:'HREMAQCLA',pic:''},{av:'A7822HReMaqTej',fld:'HREMAQTEJ',pic:'9'},{av:'A7823HReMaqDel',fld:'HREMAQDEL',pic:'9'},{av:'A7824HReMaqPML',fld:'HREMAQPML',pic:'ZZ9'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A9780HreLtsSb',fld:'HRELTSSB',pic:'ZZZZ9'},{av:'A9781HreLtsRm',fld:'HRELTSRM',pic:'ZZZZ9'},{av:'A9803HreAcaQ',fld:'HREACAQ',pic:''},{av:'A9804HreAcab',fld:'HREACAB',pic:''},{av:'A1094HreNPrg',fld:'HRENPRG',pic:''},{av:'A697HreLotF',fld:'HRELOTF',pic:''},{av:'A10381HreAnc',fld:'HREANC',pic:'ZZ9'},{av:'A10382HreGrm',fld:'HREGRM',pic:'ZZZ9'},{av:'A10383HreVel',fld:'HREVEL',pic:'ZZ9.99'},{av:'A10384HreObs',fld:'HREOBS',pic:''},{av:'A11508HreAva',fld:'HREAVA',pic:''},{av:'A12126HreAs',fld:'HREAS',pic:''},{av:'A12127HreAi',fld:'HREAI',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4492HreBarCod'},{av:'Z4493HreBarReo'},{av:'Z4494HreBarPar'},{av:'Z4495HreNumCie'},{av:'Z4545HreLinMaq'},{av:'Z4546HreMaqCod'},{av:'Z4547HreVolPrd'},{av:'Z4548HreFacAbs'},{av:'Z4584HreFecPes'},{av:'Z4585HreMaqPes'},{av:'Z4549HreULinPro'},{av:'Z4863HreUsrCod'},{av:'Z7814HReMaqNh'},{av:'Z7815HReMaqVX'},{av:'Z7816HReMaqBL'},{av:'Z7817HReMaqFlow'},{av:'Z7818HReMaqRPM'},{av:'Z7819HReMaqMol'},{av:'Z7820HReMaqTor'},{av:'Z7821HReMaqCla'},{av:'Z7822HReMaqTej'},{av:'Z7823HReMaqDel'},{av:'Z7824HReMaqPML'},{av:'Z8602HreCosAA'},{av:'Z8603HrecosAd'},{av:'Z8604HreCosAnc'},{av:'Z8605HreCosCol'},{av:'Z8606HreCosPA'},{av:'Z8607HreCosPD'},{av:'Z9780HreLtsSb'},{av:'Z9781HreLtsRm'},{av:'Z9803HreAcaQ'},{av:'Z9804HreAcab'},{av:'Z1094HreNPrg'},{av:'Z697HreLotF'},{av:'Z10381HreAnc'},{av:'Z10382HreGrm'},{av:'Z10383HreVel'},{av:'Z10384HreObs'},{av:'Z11508HreAva'},{av:'Z12126HreAs'},{av:'Z12127HreAi'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_HREMAQPES","{handler:'valid_Hremaqpes',iparms:[]");
      setEventMetadata("VALID_HREMAQPES",",oparms:[]}");
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
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4494HreBarPar = "" ;
      Z4546HreMaqCod = "" ;
      Z4548HreFacAbs = DecimalUtil.ZERO ;
      Z4584HreFecPes = GXutil.resetTime( GXutil.nullDate() );
      Z4863HreUsrCod = "" ;
      Z7821HReMaqCla = "" ;
      Z8602HreCosAA = DecimalUtil.ZERO ;
      Z8603HrecosAd = DecimalUtil.ZERO ;
      Z8604HreCosAnc = DecimalUtil.ZERO ;
      Z8605HreCosCol = DecimalUtil.ZERO ;
      Z8606HreCosPA = DecimalUtil.ZERO ;
      Z8607HreCosPD = DecimalUtil.ZERO ;
      Z9803HreAcaQ = "" ;
      Z9804HreAcab = "" ;
      Z1094HreNPrg = "" ;
      Z697HreLotF = "" ;
      Z10383HreVel = DecimalUtil.ZERO ;
      Z10384HreObs = "" ;
      Z11508HreAva = "" ;
      Z12126HreAs = "" ;
      Z12127HreAi = "" ;
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
      A4546HreMaqCod = "" ;
      A4548HreFacAbs = DecimalUtil.ZERO ;
      A4584HreFecPes = GXutil.resetTime( GXutil.nullDate() );
      A4863HreUsrCod = "" ;
      A7821HReMaqCla = "" ;
      A8602HreCosAA = DecimalUtil.ZERO ;
      A8603HrecosAd = DecimalUtil.ZERO ;
      A8604HreCosAnc = DecimalUtil.ZERO ;
      A8605HreCosCol = DecimalUtil.ZERO ;
      A8606HreCosPA = DecimalUtil.ZERO ;
      A8607HreCosPD = DecimalUtil.ZERO ;
      A9803HreAcaQ = "" ;
      A9804HreAcab = "" ;
      A1094HreNPrg = "" ;
      A697HreLotF = "" ;
      A10383HreVel = DecimalUtil.ZERO ;
      A10384HreObs = "" ;
      A11508HreAva = "" ;
      A12126HreAs = "" ;
      A12127HreAi = "" ;
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
      T01PM5_A4545HreLinMaq = new short[1] ;
      T01PM5_A4546HreMaqCod = new String[] {""} ;
      T01PM5_n4546HreMaqCod = new boolean[] {false} ;
      T01PM5_A4547HreVolPrd = new int[1] ;
      T01PM5_n4547HreVolPrd = new boolean[] {false} ;
      T01PM5_A4548HreFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM5_n4548HreFacAbs = new boolean[] {false} ;
      T01PM5_A4584HreFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T01PM5_n4584HreFecPes = new boolean[] {false} ;
      T01PM5_A4585HreMaqPes = new byte[1] ;
      T01PM5_n4585HreMaqPes = new boolean[] {false} ;
      T01PM5_A4549HreULinPro = new byte[1] ;
      T01PM5_n4549HreULinPro = new boolean[] {false} ;
      T01PM5_A4863HreUsrCod = new String[] {""} ;
      T01PM5_n4863HreUsrCod = new boolean[] {false} ;
      T01PM5_A7814HReMaqNh = new short[1] ;
      T01PM5_n7814HReMaqNh = new boolean[] {false} ;
      T01PM5_A7815HReMaqVX = new byte[1] ;
      T01PM5_n7815HReMaqVX = new boolean[] {false} ;
      T01PM5_A7816HReMaqBL = new byte[1] ;
      T01PM5_n7816HReMaqBL = new boolean[] {false} ;
      T01PM5_A7817HReMaqFlow = new byte[1] ;
      T01PM5_n7817HReMaqFlow = new boolean[] {false} ;
      T01PM5_A7818HReMaqRPM = new short[1] ;
      T01PM5_n7818HReMaqRPM = new boolean[] {false} ;
      T01PM5_A7819HReMaqMol = new short[1] ;
      T01PM5_n7819HReMaqMol = new boolean[] {false} ;
      T01PM5_A7820HReMaqTor = new short[1] ;
      T01PM5_n7820HReMaqTor = new boolean[] {false} ;
      T01PM5_A7821HReMaqCla = new String[] {""} ;
      T01PM5_n7821HReMaqCla = new boolean[] {false} ;
      T01PM5_A7822HReMaqTej = new byte[1] ;
      T01PM5_n7822HReMaqTej = new boolean[] {false} ;
      T01PM5_A7823HReMaqDel = new byte[1] ;
      T01PM5_n7823HReMaqDel = new boolean[] {false} ;
      T01PM5_A7824HReMaqPML = new short[1] ;
      T01PM5_n7824HReMaqPML = new boolean[] {false} ;
      T01PM5_A8602HreCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM5_n8602HreCosAA = new boolean[] {false} ;
      T01PM5_A8603HrecosAd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM5_n8603HrecosAd = new boolean[] {false} ;
      T01PM5_A8604HreCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM5_n8604HreCosAnc = new boolean[] {false} ;
      T01PM5_A8605HreCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM5_n8605HreCosCol = new boolean[] {false} ;
      T01PM5_A8606HreCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM5_n8606HreCosPA = new boolean[] {false} ;
      T01PM5_A8607HreCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM5_n8607HreCosPD = new boolean[] {false} ;
      T01PM5_A9780HreLtsSb = new int[1] ;
      T01PM5_n9780HreLtsSb = new boolean[] {false} ;
      T01PM5_A9781HreLtsRm = new int[1] ;
      T01PM5_n9781HreLtsRm = new boolean[] {false} ;
      T01PM5_A9803HreAcaQ = new String[] {""} ;
      T01PM5_n9803HreAcaQ = new boolean[] {false} ;
      T01PM5_A9804HreAcab = new String[] {""} ;
      T01PM5_n9804HreAcab = new boolean[] {false} ;
      T01PM5_A1094HreNPrg = new String[] {""} ;
      T01PM5_n1094HreNPrg = new boolean[] {false} ;
      T01PM5_A697HreLotF = new String[] {""} ;
      T01PM5_n697HreLotF = new boolean[] {false} ;
      T01PM5_A10381HreAnc = new short[1] ;
      T01PM5_n10381HreAnc = new boolean[] {false} ;
      T01PM5_A10382HreGrm = new short[1] ;
      T01PM5_n10382HreGrm = new boolean[] {false} ;
      T01PM5_A10383HreVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM5_n10383HreVel = new boolean[] {false} ;
      T01PM5_A10384HreObs = new String[] {""} ;
      T01PM5_n10384HreObs = new boolean[] {false} ;
      T01PM5_A11508HreAva = new String[] {""} ;
      T01PM5_n11508HreAva = new boolean[] {false} ;
      T01PM5_A12126HreAs = new String[] {""} ;
      T01PM5_n12126HreAs = new boolean[] {false} ;
      T01PM5_A12127HreAi = new String[] {""} ;
      T01PM5_n12127HreAi = new boolean[] {false} ;
      T01PM5_A396EmprCod = new String[] {""} ;
      T01PM5_A4492HreBarCod = new int[1] ;
      T01PM5_A4493HreBarReo = new byte[1] ;
      T01PM5_A4494HreBarPar = new String[] {""} ;
      T01PM5_A4495HreNumCie = new byte[1] ;
      T01PM4_A396EmprCod = new String[] {""} ;
      T01PM6_A396EmprCod = new String[] {""} ;
      T01PM7_A396EmprCod = new String[] {""} ;
      T01PM7_A4492HreBarCod = new int[1] ;
      T01PM7_A4493HreBarReo = new byte[1] ;
      T01PM7_A4494HreBarPar = new String[] {""} ;
      T01PM7_A4495HreNumCie = new byte[1] ;
      T01PM7_A4545HreLinMaq = new short[1] ;
      T01PM3_A4545HreLinMaq = new short[1] ;
      T01PM3_A4546HreMaqCod = new String[] {""} ;
      T01PM3_n4546HreMaqCod = new boolean[] {false} ;
      T01PM3_A4547HreVolPrd = new int[1] ;
      T01PM3_n4547HreVolPrd = new boolean[] {false} ;
      T01PM3_A4548HreFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM3_n4548HreFacAbs = new boolean[] {false} ;
      T01PM3_A4584HreFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T01PM3_n4584HreFecPes = new boolean[] {false} ;
      T01PM3_A4585HreMaqPes = new byte[1] ;
      T01PM3_n4585HreMaqPes = new boolean[] {false} ;
      T01PM3_A4549HreULinPro = new byte[1] ;
      T01PM3_n4549HreULinPro = new boolean[] {false} ;
      T01PM3_A4863HreUsrCod = new String[] {""} ;
      T01PM3_n4863HreUsrCod = new boolean[] {false} ;
      T01PM3_A7814HReMaqNh = new short[1] ;
      T01PM3_n7814HReMaqNh = new boolean[] {false} ;
      T01PM3_A7815HReMaqVX = new byte[1] ;
      T01PM3_n7815HReMaqVX = new boolean[] {false} ;
      T01PM3_A7816HReMaqBL = new byte[1] ;
      T01PM3_n7816HReMaqBL = new boolean[] {false} ;
      T01PM3_A7817HReMaqFlow = new byte[1] ;
      T01PM3_n7817HReMaqFlow = new boolean[] {false} ;
      T01PM3_A7818HReMaqRPM = new short[1] ;
      T01PM3_n7818HReMaqRPM = new boolean[] {false} ;
      T01PM3_A7819HReMaqMol = new short[1] ;
      T01PM3_n7819HReMaqMol = new boolean[] {false} ;
      T01PM3_A7820HReMaqTor = new short[1] ;
      T01PM3_n7820HReMaqTor = new boolean[] {false} ;
      T01PM3_A7821HReMaqCla = new String[] {""} ;
      T01PM3_n7821HReMaqCla = new boolean[] {false} ;
      T01PM3_A7822HReMaqTej = new byte[1] ;
      T01PM3_n7822HReMaqTej = new boolean[] {false} ;
      T01PM3_A7823HReMaqDel = new byte[1] ;
      T01PM3_n7823HReMaqDel = new boolean[] {false} ;
      T01PM3_A7824HReMaqPML = new short[1] ;
      T01PM3_n7824HReMaqPML = new boolean[] {false} ;
      T01PM3_A8602HreCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM3_n8602HreCosAA = new boolean[] {false} ;
      T01PM3_A8603HrecosAd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM3_n8603HrecosAd = new boolean[] {false} ;
      T01PM3_A8604HreCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM3_n8604HreCosAnc = new boolean[] {false} ;
      T01PM3_A8605HreCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM3_n8605HreCosCol = new boolean[] {false} ;
      T01PM3_A8606HreCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM3_n8606HreCosPA = new boolean[] {false} ;
      T01PM3_A8607HreCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM3_n8607HreCosPD = new boolean[] {false} ;
      T01PM3_A9780HreLtsSb = new int[1] ;
      T01PM3_n9780HreLtsSb = new boolean[] {false} ;
      T01PM3_A9781HreLtsRm = new int[1] ;
      T01PM3_n9781HreLtsRm = new boolean[] {false} ;
      T01PM3_A9803HreAcaQ = new String[] {""} ;
      T01PM3_n9803HreAcaQ = new boolean[] {false} ;
      T01PM3_A9804HreAcab = new String[] {""} ;
      T01PM3_n9804HreAcab = new boolean[] {false} ;
      T01PM3_A1094HreNPrg = new String[] {""} ;
      T01PM3_n1094HreNPrg = new boolean[] {false} ;
      T01PM3_A697HreLotF = new String[] {""} ;
      T01PM3_n697HreLotF = new boolean[] {false} ;
      T01PM3_A10381HreAnc = new short[1] ;
      T01PM3_n10381HreAnc = new boolean[] {false} ;
      T01PM3_A10382HreGrm = new short[1] ;
      T01PM3_n10382HreGrm = new boolean[] {false} ;
      T01PM3_A10383HreVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM3_n10383HreVel = new boolean[] {false} ;
      T01PM3_A10384HreObs = new String[] {""} ;
      T01PM3_n10384HreObs = new boolean[] {false} ;
      T01PM3_A11508HreAva = new String[] {""} ;
      T01PM3_n11508HreAva = new boolean[] {false} ;
      T01PM3_A12126HreAs = new String[] {""} ;
      T01PM3_n12126HreAs = new boolean[] {false} ;
      T01PM3_A12127HreAi = new String[] {""} ;
      T01PM3_n12127HreAi = new boolean[] {false} ;
      T01PM3_A396EmprCod = new String[] {""} ;
      T01PM3_A4492HreBarCod = new int[1] ;
      T01PM3_A4493HreBarReo = new byte[1] ;
      T01PM3_A4494HreBarPar = new String[] {""} ;
      T01PM3_A4495HreNumCie = new byte[1] ;
      sMode678 = "" ;
      T01PM8_A396EmprCod = new String[] {""} ;
      T01PM8_A4492HreBarCod = new int[1] ;
      T01PM8_A4493HreBarReo = new byte[1] ;
      T01PM8_A4494HreBarPar = new String[] {""} ;
      T01PM8_A4495HreNumCie = new byte[1] ;
      T01PM8_A4545HreLinMaq = new short[1] ;
      T01PM9_A396EmprCod = new String[] {""} ;
      T01PM9_A4492HreBarCod = new int[1] ;
      T01PM9_A4493HreBarReo = new byte[1] ;
      T01PM9_A4494HreBarPar = new String[] {""} ;
      T01PM9_A4495HreNumCie = new byte[1] ;
      T01PM9_A4545HreLinMaq = new short[1] ;
      T01PM2_A4545HreLinMaq = new short[1] ;
      T01PM2_A4546HreMaqCod = new String[] {""} ;
      T01PM2_n4546HreMaqCod = new boolean[] {false} ;
      T01PM2_A4547HreVolPrd = new int[1] ;
      T01PM2_n4547HreVolPrd = new boolean[] {false} ;
      T01PM2_A4548HreFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM2_n4548HreFacAbs = new boolean[] {false} ;
      T01PM2_A4584HreFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T01PM2_n4584HreFecPes = new boolean[] {false} ;
      T01PM2_A4585HreMaqPes = new byte[1] ;
      T01PM2_n4585HreMaqPes = new boolean[] {false} ;
      T01PM2_A4549HreULinPro = new byte[1] ;
      T01PM2_n4549HreULinPro = new boolean[] {false} ;
      T01PM2_A4863HreUsrCod = new String[] {""} ;
      T01PM2_n4863HreUsrCod = new boolean[] {false} ;
      T01PM2_A7814HReMaqNh = new short[1] ;
      T01PM2_n7814HReMaqNh = new boolean[] {false} ;
      T01PM2_A7815HReMaqVX = new byte[1] ;
      T01PM2_n7815HReMaqVX = new boolean[] {false} ;
      T01PM2_A7816HReMaqBL = new byte[1] ;
      T01PM2_n7816HReMaqBL = new boolean[] {false} ;
      T01PM2_A7817HReMaqFlow = new byte[1] ;
      T01PM2_n7817HReMaqFlow = new boolean[] {false} ;
      T01PM2_A7818HReMaqRPM = new short[1] ;
      T01PM2_n7818HReMaqRPM = new boolean[] {false} ;
      T01PM2_A7819HReMaqMol = new short[1] ;
      T01PM2_n7819HReMaqMol = new boolean[] {false} ;
      T01PM2_A7820HReMaqTor = new short[1] ;
      T01PM2_n7820HReMaqTor = new boolean[] {false} ;
      T01PM2_A7821HReMaqCla = new String[] {""} ;
      T01PM2_n7821HReMaqCla = new boolean[] {false} ;
      T01PM2_A7822HReMaqTej = new byte[1] ;
      T01PM2_n7822HReMaqTej = new boolean[] {false} ;
      T01PM2_A7823HReMaqDel = new byte[1] ;
      T01PM2_n7823HReMaqDel = new boolean[] {false} ;
      T01PM2_A7824HReMaqPML = new short[1] ;
      T01PM2_n7824HReMaqPML = new boolean[] {false} ;
      T01PM2_A8602HreCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM2_n8602HreCosAA = new boolean[] {false} ;
      T01PM2_A8603HrecosAd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM2_n8603HrecosAd = new boolean[] {false} ;
      T01PM2_A8604HreCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM2_n8604HreCosAnc = new boolean[] {false} ;
      T01PM2_A8605HreCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM2_n8605HreCosCol = new boolean[] {false} ;
      T01PM2_A8606HreCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM2_n8606HreCosPA = new boolean[] {false} ;
      T01PM2_A8607HreCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM2_n8607HreCosPD = new boolean[] {false} ;
      T01PM2_A9780HreLtsSb = new int[1] ;
      T01PM2_n9780HreLtsSb = new boolean[] {false} ;
      T01PM2_A9781HreLtsRm = new int[1] ;
      T01PM2_n9781HreLtsRm = new boolean[] {false} ;
      T01PM2_A9803HreAcaQ = new String[] {""} ;
      T01PM2_n9803HreAcaQ = new boolean[] {false} ;
      T01PM2_A9804HreAcab = new String[] {""} ;
      T01PM2_n9804HreAcab = new boolean[] {false} ;
      T01PM2_A1094HreNPrg = new String[] {""} ;
      T01PM2_n1094HreNPrg = new boolean[] {false} ;
      T01PM2_A697HreLotF = new String[] {""} ;
      T01PM2_n697HreLotF = new boolean[] {false} ;
      T01PM2_A10381HreAnc = new short[1] ;
      T01PM2_n10381HreAnc = new boolean[] {false} ;
      T01PM2_A10382HreGrm = new short[1] ;
      T01PM2_n10382HreGrm = new boolean[] {false} ;
      T01PM2_A10383HreVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PM2_n10383HreVel = new boolean[] {false} ;
      T01PM2_A10384HreObs = new String[] {""} ;
      T01PM2_n10384HreObs = new boolean[] {false} ;
      T01PM2_A11508HreAva = new String[] {""} ;
      T01PM2_n11508HreAva = new boolean[] {false} ;
      T01PM2_A12126HreAs = new String[] {""} ;
      T01PM2_n12126HreAs = new boolean[] {false} ;
      T01PM2_A12127HreAi = new String[] {""} ;
      T01PM2_n12127HreAi = new boolean[] {false} ;
      T01PM2_A396EmprCod = new String[] {""} ;
      T01PM2_A4492HreBarCod = new int[1] ;
      T01PM2_A4493HreBarReo = new byte[1] ;
      T01PM2_A4494HreBarPar = new String[] {""} ;
      T01PM2_A4495HreNumCie = new byte[1] ;
      T01PM13_A396EmprCod = new String[] {""} ;
      T01PM13_A4492HreBarCod = new int[1] ;
      T01PM13_A4493HreBarReo = new byte[1] ;
      T01PM13_A4494HreBarPar = new String[] {""} ;
      T01PM13_A4495HreNumCie = new byte[1] ;
      T01PM13_A4545HreLinMaq = new short[1] ;
      T01PM13_A14278HreNormId = new String[] {""} ;
      T01PM14_A396EmprCod = new String[] {""} ;
      T01PM14_A4492HreBarCod = new int[1] ;
      T01PM14_A4493HreBarReo = new byte[1] ;
      T01PM14_A4494HreBarPar = new String[] {""} ;
      T01PM14_A4495HreNumCie = new byte[1] ;
      T01PM14_A4545HreLinMaq = new short[1] ;
      T01PM14_A14282HreTraID = new String[] {""} ;
      T01PM15_A396EmprCod = new String[] {""} ;
      T01PM15_A4492HreBarCod = new int[1] ;
      T01PM15_A4493HreBarReo = new byte[1] ;
      T01PM15_A4494HreBarPar = new String[] {""} ;
      T01PM15_A4495HreNumCie = new byte[1] ;
      T01PM15_A4545HreLinMaq = new short[1] ;
      T01PM15_A4550HreLinPro = new byte[1] ;
      T01PM16_A396EmprCod = new String[] {""} ;
      T01PM16_A4492HreBarCod = new int[1] ;
      T01PM16_A4493HreBarReo = new byte[1] ;
      T01PM16_A4494HreBarPar = new String[] {""} ;
      T01PM16_A4495HreNumCie = new byte[1] ;
      T01PM16_A4545HreLinMaq = new short[1] ;
      T01PM16_A11322HreLinObs = new short[1] ;
      T01PM17_A396EmprCod = new String[] {""} ;
      T01PM17_A4492HreBarCod = new int[1] ;
      T01PM17_A4493HreBarReo = new byte[1] ;
      T01PM17_A4494HreBarPar = new String[] {""} ;
      T01PM17_A4495HreNumCie = new byte[1] ;
      T01PM17_A4545HreLinMaq = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01PM18_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ4494HreBarPar = "" ;
      ZZ4546HreMaqCod = "" ;
      ZZ4548HreFacAbs = DecimalUtil.ZERO ;
      ZZ4584HreFecPes = GXutil.resetTime( GXutil.nullDate() );
      ZZ4863HreUsrCod = "" ;
      ZZ7821HReMaqCla = "" ;
      ZZ8602HreCosAA = DecimalUtil.ZERO ;
      ZZ8603HrecosAd = DecimalUtil.ZERO ;
      ZZ8604HreCosAnc = DecimalUtil.ZERO ;
      ZZ8605HreCosCol = DecimalUtil.ZERO ;
      ZZ8606HreCosPA = DecimalUtil.ZERO ;
      ZZ8607HreCosPD = DecimalUtil.ZERO ;
      ZZ9803HreAcaQ = "" ;
      ZZ9804HreAcab = "" ;
      ZZ1094HreNPrg = "" ;
      ZZ697HreLotF = "" ;
      ZZ10383HreVel = DecimalUtil.ZERO ;
      ZZ10384HreObs = "" ;
      ZZ11508HreAva = "" ;
      ZZ12126HreAs = "" ;
      ZZ12127HreAi = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.hisrem__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.hisrem__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.hisrem__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.hisrem__default(),
         new Object[] {
             new Object[] {
            T01PM2_A4545HreLinMaq, T01PM2_A4546HreMaqCod, T01PM2_n4546HreMaqCod, T01PM2_A4547HreVolPrd, T01PM2_n4547HreVolPrd, T01PM2_A4548HreFacAbs, T01PM2_n4548HreFacAbs, T01PM2_A4584HreFecPes, T01PM2_n4584HreFecPes, T01PM2_A4585HreMaqPes,
            T01PM2_n4585HreMaqPes, T01PM2_A4549HreULinPro, T01PM2_n4549HreULinPro, T01PM2_A4863HreUsrCod, T01PM2_n4863HreUsrCod, T01PM2_A7814HReMaqNh, T01PM2_n7814HReMaqNh, T01PM2_A7815HReMaqVX, T01PM2_n7815HReMaqVX, T01PM2_A7816HReMaqBL,
            T01PM2_n7816HReMaqBL, T01PM2_A7817HReMaqFlow, T01PM2_n7817HReMaqFlow, T01PM2_A7818HReMaqRPM, T01PM2_n7818HReMaqRPM, T01PM2_A7819HReMaqMol, T01PM2_n7819HReMaqMol, T01PM2_A7820HReMaqTor, T01PM2_n7820HReMaqTor, T01PM2_A7821HReMaqCla,
            T01PM2_n7821HReMaqCla, T01PM2_A7822HReMaqTej, T01PM2_n7822HReMaqTej, T01PM2_A7823HReMaqDel, T01PM2_n7823HReMaqDel, T01PM2_A7824HReMaqPML, T01PM2_n7824HReMaqPML, T01PM2_A8602HreCosAA, T01PM2_n8602HreCosAA, T01PM2_A8603HrecosAd,
            T01PM2_n8603HrecosAd, T01PM2_A8604HreCosAnc, T01PM2_n8604HreCosAnc, T01PM2_A8605HreCosCol, T01PM2_n8605HreCosCol, T01PM2_A8606HreCosPA, T01PM2_n8606HreCosPA, T01PM2_A8607HreCosPD, T01PM2_n8607HreCosPD, T01PM2_A9780HreLtsSb,
            T01PM2_n9780HreLtsSb, T01PM2_A9781HreLtsRm, T01PM2_n9781HreLtsRm, T01PM2_A9803HreAcaQ, T01PM2_n9803HreAcaQ, T01PM2_A9804HreAcab, T01PM2_n9804HreAcab, T01PM2_A1094HreNPrg, T01PM2_n1094HreNPrg, T01PM2_A697HreLotF,
            T01PM2_n697HreLotF, T01PM2_A10381HreAnc, T01PM2_n10381HreAnc, T01PM2_A10382HreGrm, T01PM2_n10382HreGrm, T01PM2_A10383HreVel, T01PM2_n10383HreVel, T01PM2_A10384HreObs, T01PM2_n10384HreObs, T01PM2_A11508HreAva,
            T01PM2_n11508HreAva, T01PM2_A12126HreAs, T01PM2_n12126HreAs, T01PM2_A12127HreAi, T01PM2_n12127HreAi, T01PM2_A396EmprCod, T01PM2_A4492HreBarCod, T01PM2_A4493HreBarReo, T01PM2_A4494HreBarPar, T01PM2_A4495HreNumCie
            }
            , new Object[] {
            T01PM3_A4545HreLinMaq, T01PM3_A4546HreMaqCod, T01PM3_n4546HreMaqCod, T01PM3_A4547HreVolPrd, T01PM3_n4547HreVolPrd, T01PM3_A4548HreFacAbs, T01PM3_n4548HreFacAbs, T01PM3_A4584HreFecPes, T01PM3_n4584HreFecPes, T01PM3_A4585HreMaqPes,
            T01PM3_n4585HreMaqPes, T01PM3_A4549HreULinPro, T01PM3_n4549HreULinPro, T01PM3_A4863HreUsrCod, T01PM3_n4863HreUsrCod, T01PM3_A7814HReMaqNh, T01PM3_n7814HReMaqNh, T01PM3_A7815HReMaqVX, T01PM3_n7815HReMaqVX, T01PM3_A7816HReMaqBL,
            T01PM3_n7816HReMaqBL, T01PM3_A7817HReMaqFlow, T01PM3_n7817HReMaqFlow, T01PM3_A7818HReMaqRPM, T01PM3_n7818HReMaqRPM, T01PM3_A7819HReMaqMol, T01PM3_n7819HReMaqMol, T01PM3_A7820HReMaqTor, T01PM3_n7820HReMaqTor, T01PM3_A7821HReMaqCla,
            T01PM3_n7821HReMaqCla, T01PM3_A7822HReMaqTej, T01PM3_n7822HReMaqTej, T01PM3_A7823HReMaqDel, T01PM3_n7823HReMaqDel, T01PM3_A7824HReMaqPML, T01PM3_n7824HReMaqPML, T01PM3_A8602HreCosAA, T01PM3_n8602HreCosAA, T01PM3_A8603HrecosAd,
            T01PM3_n8603HrecosAd, T01PM3_A8604HreCosAnc, T01PM3_n8604HreCosAnc, T01PM3_A8605HreCosCol, T01PM3_n8605HreCosCol, T01PM3_A8606HreCosPA, T01PM3_n8606HreCosPA, T01PM3_A8607HreCosPD, T01PM3_n8607HreCosPD, T01PM3_A9780HreLtsSb,
            T01PM3_n9780HreLtsSb, T01PM3_A9781HreLtsRm, T01PM3_n9781HreLtsRm, T01PM3_A9803HreAcaQ, T01PM3_n9803HreAcaQ, T01PM3_A9804HreAcab, T01PM3_n9804HreAcab, T01PM3_A1094HreNPrg, T01PM3_n1094HreNPrg, T01PM3_A697HreLotF,
            T01PM3_n697HreLotF, T01PM3_A10381HreAnc, T01PM3_n10381HreAnc, T01PM3_A10382HreGrm, T01PM3_n10382HreGrm, T01PM3_A10383HreVel, T01PM3_n10383HreVel, T01PM3_A10384HreObs, T01PM3_n10384HreObs, T01PM3_A11508HreAva,
            T01PM3_n11508HreAva, T01PM3_A12126HreAs, T01PM3_n12126HreAs, T01PM3_A12127HreAi, T01PM3_n12127HreAi, T01PM3_A396EmprCod, T01PM3_A4492HreBarCod, T01PM3_A4493HreBarReo, T01PM3_A4494HreBarPar, T01PM3_A4495HreNumCie
            }
            , new Object[] {
            T01PM4_A396EmprCod
            }
            , new Object[] {
            T01PM5_A4545HreLinMaq, T01PM5_A4546HreMaqCod, T01PM5_n4546HreMaqCod, T01PM5_A4547HreVolPrd, T01PM5_n4547HreVolPrd, T01PM5_A4548HreFacAbs, T01PM5_n4548HreFacAbs, T01PM5_A4584HreFecPes, T01PM5_n4584HreFecPes, T01PM5_A4585HreMaqPes,
            T01PM5_n4585HreMaqPes, T01PM5_A4549HreULinPro, T01PM5_n4549HreULinPro, T01PM5_A4863HreUsrCod, T01PM5_n4863HreUsrCod, T01PM5_A7814HReMaqNh, T01PM5_n7814HReMaqNh, T01PM5_A7815HReMaqVX, T01PM5_n7815HReMaqVX, T01PM5_A7816HReMaqBL,
            T01PM5_n7816HReMaqBL, T01PM5_A7817HReMaqFlow, T01PM5_n7817HReMaqFlow, T01PM5_A7818HReMaqRPM, T01PM5_n7818HReMaqRPM, T01PM5_A7819HReMaqMol, T01PM5_n7819HReMaqMol, T01PM5_A7820HReMaqTor, T01PM5_n7820HReMaqTor, T01PM5_A7821HReMaqCla,
            T01PM5_n7821HReMaqCla, T01PM5_A7822HReMaqTej, T01PM5_n7822HReMaqTej, T01PM5_A7823HReMaqDel, T01PM5_n7823HReMaqDel, T01PM5_A7824HReMaqPML, T01PM5_n7824HReMaqPML, T01PM5_A8602HreCosAA, T01PM5_n8602HreCosAA, T01PM5_A8603HrecosAd,
            T01PM5_n8603HrecosAd, T01PM5_A8604HreCosAnc, T01PM5_n8604HreCosAnc, T01PM5_A8605HreCosCol, T01PM5_n8605HreCosCol, T01PM5_A8606HreCosPA, T01PM5_n8606HreCosPA, T01PM5_A8607HreCosPD, T01PM5_n8607HreCosPD, T01PM5_A9780HreLtsSb,
            T01PM5_n9780HreLtsSb, T01PM5_A9781HreLtsRm, T01PM5_n9781HreLtsRm, T01PM5_A9803HreAcaQ, T01PM5_n9803HreAcaQ, T01PM5_A9804HreAcab, T01PM5_n9804HreAcab, T01PM5_A1094HreNPrg, T01PM5_n1094HreNPrg, T01PM5_A697HreLotF,
            T01PM5_n697HreLotF, T01PM5_A10381HreAnc, T01PM5_n10381HreAnc, T01PM5_A10382HreGrm, T01PM5_n10382HreGrm, T01PM5_A10383HreVel, T01PM5_n10383HreVel, T01PM5_A10384HreObs, T01PM5_n10384HreObs, T01PM5_A11508HreAva,
            T01PM5_n11508HreAva, T01PM5_A12126HreAs, T01PM5_n12126HreAs, T01PM5_A12127HreAi, T01PM5_n12127HreAi, T01PM5_A396EmprCod, T01PM5_A4492HreBarCod, T01PM5_A4493HreBarReo, T01PM5_A4494HreBarPar, T01PM5_A4495HreNumCie
            }
            , new Object[] {
            T01PM6_A396EmprCod
            }
            , new Object[] {
            T01PM7_A396EmprCod, T01PM7_A4492HreBarCod, T01PM7_A4493HreBarReo, T01PM7_A4494HreBarPar, T01PM7_A4495HreNumCie, T01PM7_A4545HreLinMaq
            }
            , new Object[] {
            T01PM8_A396EmprCod, T01PM8_A4492HreBarCod, T01PM8_A4493HreBarReo, T01PM8_A4494HreBarPar, T01PM8_A4495HreNumCie, T01PM8_A4545HreLinMaq
            }
            , new Object[] {
            T01PM9_A396EmprCod, T01PM9_A4492HreBarCod, T01PM9_A4493HreBarReo, T01PM9_A4494HreBarPar, T01PM9_A4495HreNumCie, T01PM9_A4545HreLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PM13_A396EmprCod, T01PM13_A4492HreBarCod, T01PM13_A4493HreBarReo, T01PM13_A4494HreBarPar, T01PM13_A4495HreNumCie, T01PM13_A4545HreLinMaq, T01PM13_A14278HreNormId
            }
            , new Object[] {
            T01PM14_A396EmprCod, T01PM14_A4492HreBarCod, T01PM14_A4493HreBarReo, T01PM14_A4494HreBarPar, T01PM14_A4495HreNumCie, T01PM14_A4545HreLinMaq, T01PM14_A14282HreTraID
            }
            , new Object[] {
            T01PM15_A396EmprCod, T01PM15_A4492HreBarCod, T01PM15_A4493HreBarReo, T01PM15_A4494HreBarPar, T01PM15_A4495HreNumCie, T01PM15_A4545HreLinMaq, T01PM15_A4550HreLinPro
            }
            , new Object[] {
            T01PM16_A396EmprCod, T01PM16_A4492HreBarCod, T01PM16_A4493HreBarReo, T01PM16_A4494HreBarPar, T01PM16_A4495HreNumCie, T01PM16_A4545HreLinMaq, T01PM16_A11322HreLinObs
            }
            , new Object[] {
            T01PM17_A396EmprCod, T01PM17_A4492HreBarCod, T01PM17_A4493HreBarReo, T01PM17_A4494HreBarPar, T01PM17_A4495HreNumCie, T01PM17_A4545HreLinMaq
            }
            , new Object[] {
            T01PM18_A396EmprCod
            }
         }
      );
   }

   private byte Z4493HreBarReo ;
   private byte Z4495HreNumCie ;
   private byte Z4585HreMaqPes ;
   private byte Z4549HreULinPro ;
   private byte Z7815HReMaqVX ;
   private byte Z7816HReMaqBL ;
   private byte Z7817HReMaqFlow ;
   private byte Z7822HReMaqTej ;
   private byte Z7823HReMaqDel ;
   private byte GxWebError ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte nKeyPressed ;
   private byte A4585HreMaqPes ;
   private byte A4549HreULinPro ;
   private byte A7815HReMaqVX ;
   private byte A7816HReMaqBL ;
   private byte A7817HReMaqFlow ;
   private byte A7822HReMaqTej ;
   private byte A7823HReMaqDel ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ4493HreBarReo ;
   private byte ZZ4495HreNumCie ;
   private byte ZZ4585HreMaqPes ;
   private byte ZZ4549HreULinPro ;
   private byte ZZ7815HReMaqVX ;
   private byte ZZ7816HReMaqBL ;
   private byte ZZ7817HReMaqFlow ;
   private byte ZZ7822HReMaqTej ;
   private byte ZZ7823HReMaqDel ;
   private short Z4545HreLinMaq ;
   private short Z7814HReMaqNh ;
   private short Z7818HReMaqRPM ;
   private short Z7819HReMaqMol ;
   private short Z7820HReMaqTor ;
   private short Z7824HReMaqPML ;
   private short Z10381HreAnc ;
   private short Z10382HreGrm ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4545HreLinMaq ;
   private short A7814HReMaqNh ;
   private short A7818HReMaqRPM ;
   private short A7819HReMaqMol ;
   private short A7820HReMaqTor ;
   private short A7824HReMaqPML ;
   private short A10381HreAnc ;
   private short A10382HreGrm ;
   private short RcdFound678 ;
   private short nIsDirty_678 ;
   private short ZZ4545HreLinMaq ;
   private short ZZ7814HReMaqNh ;
   private short ZZ7818HReMaqRPM ;
   private short ZZ7819HReMaqMol ;
   private short ZZ7820HReMaqTor ;
   private short ZZ7824HReMaqPML ;
   private short ZZ10381HreAnc ;
   private short ZZ10382HreGrm ;
   private int Z4492HreBarCod ;
   private int Z4547HreVolPrd ;
   private int Z9780HreLtsSb ;
   private int Z9781HreLtsRm ;
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
   private int edtHreLinMaq_Enabled ;
   private int edtHreMaqCod_Enabled ;
   private int A4547HreVolPrd ;
   private int edtHreVolPrd_Enabled ;
   private int edtHreFacAbs_Enabled ;
   private int edtHreFecPes_Enabled ;
   private int edtHreMaqPes_Enabled ;
   private int edtHreULinPro_Enabled ;
   private int edtHreUsrCod_Enabled ;
   private int edtHReMaqNh_Enabled ;
   private int edtHReMaqVX_Enabled ;
   private int edtHReMaqBL_Enabled ;
   private int edtHReMaqFlow_Enabled ;
   private int edtHReMaqRPM_Enabled ;
   private int edtHReMaqMol_Enabled ;
   private int edtHReMaqTor_Enabled ;
   private int edtHReMaqCla_Enabled ;
   private int edtHReMaqTej_Enabled ;
   private int edtHReMaqDel_Enabled ;
   private int edtHReMaqPML_Enabled ;
   private int edtHreCosAA_Enabled ;
   private int edtHrecosAd_Enabled ;
   private int edtHreCosAnc_Enabled ;
   private int edtHreCosCol_Enabled ;
   private int edtHreCosPA_Enabled ;
   private int edtHreCosPD_Enabled ;
   private int A9780HreLtsSb ;
   private int edtHreLtsSb_Enabled ;
   private int A9781HreLtsRm ;
   private int edtHreLtsRm_Enabled ;
   private int edtHreAcaQ_Enabled ;
   private int edtHreAcab_Enabled ;
   private int edtHreNPrg_Enabled ;
   private int edtHreLotF_Enabled ;
   private int edtHreAnc_Enabled ;
   private int edtHreGrm_Enabled ;
   private int edtHreVel_Enabled ;
   private int edtHreObs_Enabled ;
   private int edtHreAva_Enabled ;
   private int edtHreAs_Enabled ;
   private int edtHreAi_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ4492HreBarCod ;
   private int ZZ4547HreVolPrd ;
   private int ZZ9780HreLtsSb ;
   private int ZZ9781HreLtsRm ;
   private java.math.BigDecimal Z4548HreFacAbs ;
   private java.math.BigDecimal Z8602HreCosAA ;
   private java.math.BigDecimal Z8603HrecosAd ;
   private java.math.BigDecimal Z8604HreCosAnc ;
   private java.math.BigDecimal Z8605HreCosCol ;
   private java.math.BigDecimal Z8606HreCosPA ;
   private java.math.BigDecimal Z8607HreCosPD ;
   private java.math.BigDecimal Z10383HreVel ;
   private java.math.BigDecimal A4548HreFacAbs ;
   private java.math.BigDecimal A8602HreCosAA ;
   private java.math.BigDecimal A8603HrecosAd ;
   private java.math.BigDecimal A8604HreCosAnc ;
   private java.math.BigDecimal A8605HreCosCol ;
   private java.math.BigDecimal A8606HreCosPA ;
   private java.math.BigDecimal A8607HreCosPD ;
   private java.math.BigDecimal A10383HreVel ;
   private java.math.BigDecimal ZZ4548HreFacAbs ;
   private java.math.BigDecimal ZZ8602HreCosAA ;
   private java.math.BigDecimal ZZ8603HrecosAd ;
   private java.math.BigDecimal ZZ8604HreCosAnc ;
   private java.math.BigDecimal ZZ8605HreCosCol ;
   private java.math.BigDecimal ZZ8606HreCosPA ;
   private java.math.BigDecimal ZZ8607HreCosPD ;
   private java.math.BigDecimal ZZ10383HreVel ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4494HreBarPar ;
   private String Z4546HreMaqCod ;
   private String Z4863HreUsrCod ;
   private String Z7821HReMaqCla ;
   private String Z9803HreAcaQ ;
   private String Z9804HreAcab ;
   private String Z1094HreNPrg ;
   private String Z697HreLotF ;
   private String Z11508HreAva ;
   private String Z12126HreAs ;
   private String Z12127HreAi ;
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
   private String edtHreLinMaq_Internalname ;
   private String edtHreLinMaq_Jsonclick ;
   private String edtHreMaqCod_Internalname ;
   private String A4546HreMaqCod ;
   private String edtHreMaqCod_Jsonclick ;
   private String edtHreVolPrd_Internalname ;
   private String edtHreVolPrd_Jsonclick ;
   private String edtHreFacAbs_Internalname ;
   private String edtHreFacAbs_Jsonclick ;
   private String edtHreFecPes_Internalname ;
   private String edtHreFecPes_Jsonclick ;
   private String edtHreMaqPes_Internalname ;
   private String edtHreMaqPes_Jsonclick ;
   private String edtHreULinPro_Internalname ;
   private String edtHreULinPro_Jsonclick ;
   private String edtHreUsrCod_Internalname ;
   private String A4863HreUsrCod ;
   private String edtHreUsrCod_Jsonclick ;
   private String edtHReMaqNh_Internalname ;
   private String edtHReMaqNh_Jsonclick ;
   private String edtHReMaqVX_Internalname ;
   private String edtHReMaqVX_Jsonclick ;
   private String edtHReMaqBL_Internalname ;
   private String edtHReMaqBL_Jsonclick ;
   private String edtHReMaqFlow_Internalname ;
   private String edtHReMaqFlow_Jsonclick ;
   private String edtHReMaqRPM_Internalname ;
   private String edtHReMaqRPM_Jsonclick ;
   private String edtHReMaqMol_Internalname ;
   private String edtHReMaqMol_Jsonclick ;
   private String edtHReMaqTor_Internalname ;
   private String edtHReMaqTor_Jsonclick ;
   private String edtHReMaqCla_Internalname ;
   private String A7821HReMaqCla ;
   private String edtHReMaqCla_Jsonclick ;
   private String edtHReMaqTej_Internalname ;
   private String edtHReMaqTej_Jsonclick ;
   private String edtHReMaqDel_Internalname ;
   private String edtHReMaqDel_Jsonclick ;
   private String edtHReMaqPML_Internalname ;
   private String edtHReMaqPML_Jsonclick ;
   private String edtHreCosAA_Internalname ;
   private String edtHreCosAA_Jsonclick ;
   private String edtHrecosAd_Internalname ;
   private String edtHrecosAd_Jsonclick ;
   private String edtHreCosAnc_Internalname ;
   private String edtHreCosAnc_Jsonclick ;
   private String edtHreCosCol_Internalname ;
   private String edtHreCosCol_Jsonclick ;
   private String edtHreCosPA_Internalname ;
   private String edtHreCosPA_Jsonclick ;
   private String edtHreCosPD_Internalname ;
   private String edtHreCosPD_Jsonclick ;
   private String edtHreLtsSb_Internalname ;
   private String edtHreLtsSb_Jsonclick ;
   private String edtHreLtsRm_Internalname ;
   private String edtHreLtsRm_Jsonclick ;
   private String edtHreAcaQ_Internalname ;
   private String A9803HreAcaQ ;
   private String edtHreAcaQ_Jsonclick ;
   private String edtHreAcab_Internalname ;
   private String A9804HreAcab ;
   private String edtHreAcab_Jsonclick ;
   private String edtHreNPrg_Internalname ;
   private String A1094HreNPrg ;
   private String edtHreNPrg_Jsonclick ;
   private String edtHreLotF_Internalname ;
   private String A697HreLotF ;
   private String edtHreLotF_Jsonclick ;
   private String edtHreAnc_Internalname ;
   private String edtHreAnc_Jsonclick ;
   private String edtHreGrm_Internalname ;
   private String edtHreGrm_Jsonclick ;
   private String edtHreVel_Internalname ;
   private String edtHreVel_Jsonclick ;
   private String edtHreObs_Internalname ;
   private String edtHreAva_Internalname ;
   private String A11508HreAva ;
   private String edtHreAva_Jsonclick ;
   private String edtHreAs_Internalname ;
   private String A12126HreAs ;
   private String edtHreAs_Jsonclick ;
   private String edtHreAi_Internalname ;
   private String A12127HreAi ;
   private String edtHreAi_Jsonclick ;
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
   private String sMode678 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ4494HreBarPar ;
   private String ZZ4546HreMaqCod ;
   private String ZZ4863HreUsrCod ;
   private String ZZ7821HReMaqCla ;
   private String ZZ9803HreAcaQ ;
   private String ZZ9804HreAcab ;
   private String ZZ1094HreNPrg ;
   private String ZZ697HreLotF ;
   private String ZZ11508HreAva ;
   private String ZZ12126HreAs ;
   private String ZZ12127HreAi ;
   private java.util.Date Z4584HreFecPes ;
   private java.util.Date A4584HreFecPes ;
   private java.util.Date ZZ4584HreFecPes ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n4546HreMaqCod ;
   private boolean n4547HreVolPrd ;
   private boolean n4548HreFacAbs ;
   private boolean n4584HreFecPes ;
   private boolean n4585HreMaqPes ;
   private boolean n4549HreULinPro ;
   private boolean n4863HreUsrCod ;
   private boolean n7814HReMaqNh ;
   private boolean n7815HReMaqVX ;
   private boolean n7816HReMaqBL ;
   private boolean n7817HReMaqFlow ;
   private boolean n7818HReMaqRPM ;
   private boolean n7819HReMaqMol ;
   private boolean n7820HReMaqTor ;
   private boolean n7821HReMaqCla ;
   private boolean n7822HReMaqTej ;
   private boolean n7823HReMaqDel ;
   private boolean n7824HReMaqPML ;
   private boolean n8602HreCosAA ;
   private boolean n8603HrecosAd ;
   private boolean n8604HreCosAnc ;
   private boolean n8605HreCosCol ;
   private boolean n8606HreCosPA ;
   private boolean n8607HreCosPD ;
   private boolean n9780HreLtsSb ;
   private boolean n9781HreLtsRm ;
   private boolean n9803HreAcaQ ;
   private boolean n9804HreAcab ;
   private boolean n1094HreNPrg ;
   private boolean n697HreLotF ;
   private boolean n10381HreAnc ;
   private boolean n10382HreGrm ;
   private boolean n10383HreVel ;
   private boolean n10384HreObs ;
   private boolean n11508HreAva ;
   private boolean n12126HreAs ;
   private boolean n12127HreAi ;
   private boolean Gx_longc ;
   private String Z10384HreObs ;
   private String A10384HreObs ;
   private String ZZ10384HreObs ;
   private IDataStoreProvider pr_default ;
   private short[] T01PM5_A4545HreLinMaq ;
   private String[] T01PM5_A4546HreMaqCod ;
   private boolean[] T01PM5_n4546HreMaqCod ;
   private int[] T01PM5_A4547HreVolPrd ;
   private boolean[] T01PM5_n4547HreVolPrd ;
   private java.math.BigDecimal[] T01PM5_A4548HreFacAbs ;
   private boolean[] T01PM5_n4548HreFacAbs ;
   private java.util.Date[] T01PM5_A4584HreFecPes ;
   private boolean[] T01PM5_n4584HreFecPes ;
   private byte[] T01PM5_A4585HreMaqPes ;
   private boolean[] T01PM5_n4585HreMaqPes ;
   private byte[] T01PM5_A4549HreULinPro ;
   private boolean[] T01PM5_n4549HreULinPro ;
   private String[] T01PM5_A4863HreUsrCod ;
   private boolean[] T01PM5_n4863HreUsrCod ;
   private short[] T01PM5_A7814HReMaqNh ;
   private boolean[] T01PM5_n7814HReMaqNh ;
   private byte[] T01PM5_A7815HReMaqVX ;
   private boolean[] T01PM5_n7815HReMaqVX ;
   private byte[] T01PM5_A7816HReMaqBL ;
   private boolean[] T01PM5_n7816HReMaqBL ;
   private byte[] T01PM5_A7817HReMaqFlow ;
   private boolean[] T01PM5_n7817HReMaqFlow ;
   private short[] T01PM5_A7818HReMaqRPM ;
   private boolean[] T01PM5_n7818HReMaqRPM ;
   private short[] T01PM5_A7819HReMaqMol ;
   private boolean[] T01PM5_n7819HReMaqMol ;
   private short[] T01PM5_A7820HReMaqTor ;
   private boolean[] T01PM5_n7820HReMaqTor ;
   private String[] T01PM5_A7821HReMaqCla ;
   private boolean[] T01PM5_n7821HReMaqCla ;
   private byte[] T01PM5_A7822HReMaqTej ;
   private boolean[] T01PM5_n7822HReMaqTej ;
   private byte[] T01PM5_A7823HReMaqDel ;
   private boolean[] T01PM5_n7823HReMaqDel ;
   private short[] T01PM5_A7824HReMaqPML ;
   private boolean[] T01PM5_n7824HReMaqPML ;
   private java.math.BigDecimal[] T01PM5_A8602HreCosAA ;
   private boolean[] T01PM5_n8602HreCosAA ;
   private java.math.BigDecimal[] T01PM5_A8603HrecosAd ;
   private boolean[] T01PM5_n8603HrecosAd ;
   private java.math.BigDecimal[] T01PM5_A8604HreCosAnc ;
   private boolean[] T01PM5_n8604HreCosAnc ;
   private java.math.BigDecimal[] T01PM5_A8605HreCosCol ;
   private boolean[] T01PM5_n8605HreCosCol ;
   private java.math.BigDecimal[] T01PM5_A8606HreCosPA ;
   private boolean[] T01PM5_n8606HreCosPA ;
   private java.math.BigDecimal[] T01PM5_A8607HreCosPD ;
   private boolean[] T01PM5_n8607HreCosPD ;
   private int[] T01PM5_A9780HreLtsSb ;
   private boolean[] T01PM5_n9780HreLtsSb ;
   private int[] T01PM5_A9781HreLtsRm ;
   private boolean[] T01PM5_n9781HreLtsRm ;
   private String[] T01PM5_A9803HreAcaQ ;
   private boolean[] T01PM5_n9803HreAcaQ ;
   private String[] T01PM5_A9804HreAcab ;
   private boolean[] T01PM5_n9804HreAcab ;
   private String[] T01PM5_A1094HreNPrg ;
   private boolean[] T01PM5_n1094HreNPrg ;
   private String[] T01PM5_A697HreLotF ;
   private boolean[] T01PM5_n697HreLotF ;
   private short[] T01PM5_A10381HreAnc ;
   private boolean[] T01PM5_n10381HreAnc ;
   private short[] T01PM5_A10382HreGrm ;
   private boolean[] T01PM5_n10382HreGrm ;
   private java.math.BigDecimal[] T01PM5_A10383HreVel ;
   private boolean[] T01PM5_n10383HreVel ;
   private String[] T01PM5_A10384HreObs ;
   private boolean[] T01PM5_n10384HreObs ;
   private String[] T01PM5_A11508HreAva ;
   private boolean[] T01PM5_n11508HreAva ;
   private String[] T01PM5_A12126HreAs ;
   private boolean[] T01PM5_n12126HreAs ;
   private String[] T01PM5_A12127HreAi ;
   private boolean[] T01PM5_n12127HreAi ;
   private String[] T01PM5_A396EmprCod ;
   private int[] T01PM5_A4492HreBarCod ;
   private byte[] T01PM5_A4493HreBarReo ;
   private String[] T01PM5_A4494HreBarPar ;
   private byte[] T01PM5_A4495HreNumCie ;
   private String[] T01PM4_A396EmprCod ;
   private String[] T01PM6_A396EmprCod ;
   private String[] T01PM7_A396EmprCod ;
   private int[] T01PM7_A4492HreBarCod ;
   private byte[] T01PM7_A4493HreBarReo ;
   private String[] T01PM7_A4494HreBarPar ;
   private byte[] T01PM7_A4495HreNumCie ;
   private short[] T01PM7_A4545HreLinMaq ;
   private short[] T01PM3_A4545HreLinMaq ;
   private String[] T01PM3_A4546HreMaqCod ;
   private boolean[] T01PM3_n4546HreMaqCod ;
   private int[] T01PM3_A4547HreVolPrd ;
   private boolean[] T01PM3_n4547HreVolPrd ;
   private java.math.BigDecimal[] T01PM3_A4548HreFacAbs ;
   private boolean[] T01PM3_n4548HreFacAbs ;
   private java.util.Date[] T01PM3_A4584HreFecPes ;
   private boolean[] T01PM3_n4584HreFecPes ;
   private byte[] T01PM3_A4585HreMaqPes ;
   private boolean[] T01PM3_n4585HreMaqPes ;
   private byte[] T01PM3_A4549HreULinPro ;
   private boolean[] T01PM3_n4549HreULinPro ;
   private String[] T01PM3_A4863HreUsrCod ;
   private boolean[] T01PM3_n4863HreUsrCod ;
   private short[] T01PM3_A7814HReMaqNh ;
   private boolean[] T01PM3_n7814HReMaqNh ;
   private byte[] T01PM3_A7815HReMaqVX ;
   private boolean[] T01PM3_n7815HReMaqVX ;
   private byte[] T01PM3_A7816HReMaqBL ;
   private boolean[] T01PM3_n7816HReMaqBL ;
   private byte[] T01PM3_A7817HReMaqFlow ;
   private boolean[] T01PM3_n7817HReMaqFlow ;
   private short[] T01PM3_A7818HReMaqRPM ;
   private boolean[] T01PM3_n7818HReMaqRPM ;
   private short[] T01PM3_A7819HReMaqMol ;
   private boolean[] T01PM3_n7819HReMaqMol ;
   private short[] T01PM3_A7820HReMaqTor ;
   private boolean[] T01PM3_n7820HReMaqTor ;
   private String[] T01PM3_A7821HReMaqCla ;
   private boolean[] T01PM3_n7821HReMaqCla ;
   private byte[] T01PM3_A7822HReMaqTej ;
   private boolean[] T01PM3_n7822HReMaqTej ;
   private byte[] T01PM3_A7823HReMaqDel ;
   private boolean[] T01PM3_n7823HReMaqDel ;
   private short[] T01PM3_A7824HReMaqPML ;
   private boolean[] T01PM3_n7824HReMaqPML ;
   private java.math.BigDecimal[] T01PM3_A8602HreCosAA ;
   private boolean[] T01PM3_n8602HreCosAA ;
   private java.math.BigDecimal[] T01PM3_A8603HrecosAd ;
   private boolean[] T01PM3_n8603HrecosAd ;
   private java.math.BigDecimal[] T01PM3_A8604HreCosAnc ;
   private boolean[] T01PM3_n8604HreCosAnc ;
   private java.math.BigDecimal[] T01PM3_A8605HreCosCol ;
   private boolean[] T01PM3_n8605HreCosCol ;
   private java.math.BigDecimal[] T01PM3_A8606HreCosPA ;
   private boolean[] T01PM3_n8606HreCosPA ;
   private java.math.BigDecimal[] T01PM3_A8607HreCosPD ;
   private boolean[] T01PM3_n8607HreCosPD ;
   private int[] T01PM3_A9780HreLtsSb ;
   private boolean[] T01PM3_n9780HreLtsSb ;
   private int[] T01PM3_A9781HreLtsRm ;
   private boolean[] T01PM3_n9781HreLtsRm ;
   private String[] T01PM3_A9803HreAcaQ ;
   private boolean[] T01PM3_n9803HreAcaQ ;
   private String[] T01PM3_A9804HreAcab ;
   private boolean[] T01PM3_n9804HreAcab ;
   private String[] T01PM3_A1094HreNPrg ;
   private boolean[] T01PM3_n1094HreNPrg ;
   private String[] T01PM3_A697HreLotF ;
   private boolean[] T01PM3_n697HreLotF ;
   private short[] T01PM3_A10381HreAnc ;
   private boolean[] T01PM3_n10381HreAnc ;
   private short[] T01PM3_A10382HreGrm ;
   private boolean[] T01PM3_n10382HreGrm ;
   private java.math.BigDecimal[] T01PM3_A10383HreVel ;
   private boolean[] T01PM3_n10383HreVel ;
   private String[] T01PM3_A10384HreObs ;
   private boolean[] T01PM3_n10384HreObs ;
   private String[] T01PM3_A11508HreAva ;
   private boolean[] T01PM3_n11508HreAva ;
   private String[] T01PM3_A12126HreAs ;
   private boolean[] T01PM3_n12126HreAs ;
   private String[] T01PM3_A12127HreAi ;
   private boolean[] T01PM3_n12127HreAi ;
   private String[] T01PM3_A396EmprCod ;
   private int[] T01PM3_A4492HreBarCod ;
   private byte[] T01PM3_A4493HreBarReo ;
   private String[] T01PM3_A4494HreBarPar ;
   private byte[] T01PM3_A4495HreNumCie ;
   private String[] T01PM8_A396EmprCod ;
   private int[] T01PM8_A4492HreBarCod ;
   private byte[] T01PM8_A4493HreBarReo ;
   private String[] T01PM8_A4494HreBarPar ;
   private byte[] T01PM8_A4495HreNumCie ;
   private short[] T01PM8_A4545HreLinMaq ;
   private String[] T01PM9_A396EmprCod ;
   private int[] T01PM9_A4492HreBarCod ;
   private byte[] T01PM9_A4493HreBarReo ;
   private String[] T01PM9_A4494HreBarPar ;
   private byte[] T01PM9_A4495HreNumCie ;
   private short[] T01PM9_A4545HreLinMaq ;
   private short[] T01PM2_A4545HreLinMaq ;
   private String[] T01PM2_A4546HreMaqCod ;
   private boolean[] T01PM2_n4546HreMaqCod ;
   private int[] T01PM2_A4547HreVolPrd ;
   private boolean[] T01PM2_n4547HreVolPrd ;
   private java.math.BigDecimal[] T01PM2_A4548HreFacAbs ;
   private boolean[] T01PM2_n4548HreFacAbs ;
   private java.util.Date[] T01PM2_A4584HreFecPes ;
   private boolean[] T01PM2_n4584HreFecPes ;
   private byte[] T01PM2_A4585HreMaqPes ;
   private boolean[] T01PM2_n4585HreMaqPes ;
   private byte[] T01PM2_A4549HreULinPro ;
   private boolean[] T01PM2_n4549HreULinPro ;
   private String[] T01PM2_A4863HreUsrCod ;
   private boolean[] T01PM2_n4863HreUsrCod ;
   private short[] T01PM2_A7814HReMaqNh ;
   private boolean[] T01PM2_n7814HReMaqNh ;
   private byte[] T01PM2_A7815HReMaqVX ;
   private boolean[] T01PM2_n7815HReMaqVX ;
   private byte[] T01PM2_A7816HReMaqBL ;
   private boolean[] T01PM2_n7816HReMaqBL ;
   private byte[] T01PM2_A7817HReMaqFlow ;
   private boolean[] T01PM2_n7817HReMaqFlow ;
   private short[] T01PM2_A7818HReMaqRPM ;
   private boolean[] T01PM2_n7818HReMaqRPM ;
   private short[] T01PM2_A7819HReMaqMol ;
   private boolean[] T01PM2_n7819HReMaqMol ;
   private short[] T01PM2_A7820HReMaqTor ;
   private boolean[] T01PM2_n7820HReMaqTor ;
   private String[] T01PM2_A7821HReMaqCla ;
   private boolean[] T01PM2_n7821HReMaqCla ;
   private byte[] T01PM2_A7822HReMaqTej ;
   private boolean[] T01PM2_n7822HReMaqTej ;
   private byte[] T01PM2_A7823HReMaqDel ;
   private boolean[] T01PM2_n7823HReMaqDel ;
   private short[] T01PM2_A7824HReMaqPML ;
   private boolean[] T01PM2_n7824HReMaqPML ;
   private java.math.BigDecimal[] T01PM2_A8602HreCosAA ;
   private boolean[] T01PM2_n8602HreCosAA ;
   private java.math.BigDecimal[] T01PM2_A8603HrecosAd ;
   private boolean[] T01PM2_n8603HrecosAd ;
   private java.math.BigDecimal[] T01PM2_A8604HreCosAnc ;
   private boolean[] T01PM2_n8604HreCosAnc ;
   private java.math.BigDecimal[] T01PM2_A8605HreCosCol ;
   private boolean[] T01PM2_n8605HreCosCol ;
   private java.math.BigDecimal[] T01PM2_A8606HreCosPA ;
   private boolean[] T01PM2_n8606HreCosPA ;
   private java.math.BigDecimal[] T01PM2_A8607HreCosPD ;
   private boolean[] T01PM2_n8607HreCosPD ;
   private int[] T01PM2_A9780HreLtsSb ;
   private boolean[] T01PM2_n9780HreLtsSb ;
   private int[] T01PM2_A9781HreLtsRm ;
   private boolean[] T01PM2_n9781HreLtsRm ;
   private String[] T01PM2_A9803HreAcaQ ;
   private boolean[] T01PM2_n9803HreAcaQ ;
   private String[] T01PM2_A9804HreAcab ;
   private boolean[] T01PM2_n9804HreAcab ;
   private String[] T01PM2_A1094HreNPrg ;
   private boolean[] T01PM2_n1094HreNPrg ;
   private String[] T01PM2_A697HreLotF ;
   private boolean[] T01PM2_n697HreLotF ;
   private short[] T01PM2_A10381HreAnc ;
   private boolean[] T01PM2_n10381HreAnc ;
   private short[] T01PM2_A10382HreGrm ;
   private boolean[] T01PM2_n10382HreGrm ;
   private java.math.BigDecimal[] T01PM2_A10383HreVel ;
   private boolean[] T01PM2_n10383HreVel ;
   private String[] T01PM2_A10384HreObs ;
   private boolean[] T01PM2_n10384HreObs ;
   private String[] T01PM2_A11508HreAva ;
   private boolean[] T01PM2_n11508HreAva ;
   private String[] T01PM2_A12126HreAs ;
   private boolean[] T01PM2_n12126HreAs ;
   private String[] T01PM2_A12127HreAi ;
   private boolean[] T01PM2_n12127HreAi ;
   private String[] T01PM2_A396EmprCod ;
   private int[] T01PM2_A4492HreBarCod ;
   private byte[] T01PM2_A4493HreBarReo ;
   private String[] T01PM2_A4494HreBarPar ;
   private byte[] T01PM2_A4495HreNumCie ;
   private String[] T01PM13_A396EmprCod ;
   private int[] T01PM13_A4492HreBarCod ;
   private byte[] T01PM13_A4493HreBarReo ;
   private String[] T01PM13_A4494HreBarPar ;
   private byte[] T01PM13_A4495HreNumCie ;
   private short[] T01PM13_A4545HreLinMaq ;
   private String[] T01PM13_A14278HreNormId ;
   private String[] T01PM14_A396EmprCod ;
   private int[] T01PM14_A4492HreBarCod ;
   private byte[] T01PM14_A4493HreBarReo ;
   private String[] T01PM14_A4494HreBarPar ;
   private byte[] T01PM14_A4495HreNumCie ;
   private short[] T01PM14_A4545HreLinMaq ;
   private String[] T01PM14_A14282HreTraID ;
   private String[] T01PM15_A396EmprCod ;
   private int[] T01PM15_A4492HreBarCod ;
   private byte[] T01PM15_A4493HreBarReo ;
   private String[] T01PM15_A4494HreBarPar ;
   private byte[] T01PM15_A4495HreNumCie ;
   private short[] T01PM15_A4545HreLinMaq ;
   private byte[] T01PM15_A4550HreLinPro ;
   private String[] T01PM16_A396EmprCod ;
   private int[] T01PM16_A4492HreBarCod ;
   private byte[] T01PM16_A4493HreBarReo ;
   private String[] T01PM16_A4494HreBarPar ;
   private byte[] T01PM16_A4495HreNumCie ;
   private short[] T01PM16_A4545HreLinMaq ;
   private short[] T01PM16_A11322HreLinObs ;
   private String[] T01PM17_A396EmprCod ;
   private int[] T01PM17_A4492HreBarCod ;
   private byte[] T01PM17_A4493HreBarReo ;
   private String[] T01PM17_A4494HreBarPar ;
   private byte[] T01PM17_A4495HreNumCie ;
   private short[] T01PM17_A4545HreLinMaq ;
   private String[] T01PM18_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class hisrem__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hisrem__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hisrem__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hisrem__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PM2", "SELECT HreLinMaq, HreMaqCod, HreVolPrd, HreFacAbs, HreFecPes, HreMaqPes, HreULinPro, HreUsrCod, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreNPrg, HreLotF, HreAnc, HreGrm, HreVel, HreObs, HreAva, HreAs, HreAi, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?  FOR UPDATE OF HreMaqCod, HreVolPrd, HreFacAbs, HreFecPes, HreMaqPes, HreULinPro, HreUsrCod, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreNPrg, HreLotF, HreAnc, HreGrm, HreVel, HreObs, HreAva, HreAs, HreAi NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PM3", "SELECT HreLinMaq, HreMaqCod, HreVolPrd, HreFacAbs, HreFecPes, HreMaqPes, HreULinPro, HreUsrCod, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreNPrg, HreLotF, HreAnc, HreGrm, HreVel, HreObs, HreAva, HreAs, HreAi, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PM4", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PM5", "SELECT /*+ FIRST_ROWS(100) */ TM1.HreLinMaq, TM1.HreMaqCod, TM1.HreVolPrd, TM1.HreFacAbs, TM1.HreFecPes, TM1.HreMaqPes, TM1.HreULinPro, TM1.HreUsrCod, TM1.HReMaqNh, TM1.HReMaqVX, TM1.HReMaqBL, TM1.HReMaqFlow, TM1.HReMaqRPM, TM1.HReMaqMol, TM1.HReMaqTor, TM1.HReMaqCla, TM1.HReMaqTej, TM1.HReMaqDel, TM1.HReMaqPML, TM1.HreCosAA, TM1.HrecosAd, TM1.HreCosAnc, TM1.HreCosCol, TM1.HreCosPA, TM1.HreCosPD, TM1.HreLtsSb, TM1.HreLtsRm, TM1.HreAcaQ, TM1.HreAcab, TM1.HreNPrg, TM1.HreLotF, TM1.HreAnc, TM1.HreGrm, TM1.HreVel, TM1.HreObs, TM1.HreAva, TM1.HreAs, TM1.HreAi, TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie FROM TXPHISREM TM1 WHERE TM1.EmprCod = ? and TM1.HreBarCod = ? and TM1.HreBarReo = ? and TM1.HreBarPar = ? and TM1.HreNumCie = ? and TM1.HreLinMaq = ? ORDER BY TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie, TM1.HreLinMaq ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PM6", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PM7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PM8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE ( EmprCod > ? or EmprCod = ? and HreBarCod > ? or HreBarCod = ? and EmprCod = ? and HreBarReo > ? or HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreBarPar > ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreNumCie > ? or HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreLinMaq > ?) ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PM9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE ( EmprCod < ? or EmprCod = ? and HreBarCod < ? or HreBarCod = ? and EmprCod = ? and HreBarReo < ? or HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreBarPar < ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreNumCie < ? or HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreLinMaq < ?) ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreLinMaq DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PM10", "INSERT INTO TXPHISREM(HreLinMaq, HreMaqCod, HreVolPrd, HreFacAbs, HreFecPes, HreMaqPes, HreULinPro, HreUsrCod, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreNPrg, HreLotF, HreAnc, HreGrm, HreVel, HreObs, HreAva, HreAs, HreAi, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreFecAlt, HreUsrMod, HreFecMod, HreFasCod, HreOrdLin, HreNroPar, HreTotKgs, HreTotMts, HreTotPrd, HreProPrd, HreNumRmt, HreNumReo, HreNumInt, HreDti, HreDtf, HreUltObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK, "TXPHISREM")
         ,new UpdateCursor("T01PM11", "UPDATE TXPHISREM SET HreMaqCod=?, HreVolPrd=?, HreFacAbs=?, HreFecPes=?, HreMaqPes=?, HreULinPro=?, HreUsrCod=?, HReMaqNh=?, HReMaqVX=?, HReMaqBL=?, HReMaqFlow=?, HReMaqRPM=?, HReMaqMol=?, HReMaqTor=?, HReMaqCla=?, HReMaqTej=?, HReMaqDel=?, HReMaqPML=?, HreCosAA=?, HrecosAd=?, HreCosAnc=?, HreCosCol=?, HreCosPA=?, HreCosPD=?, HreLtsSb=?, HreLtsRm=?, HreAcaQ=?, HreAcab=?, HreNPrg=?, HreLotF=?, HreAnc=?, HreGrm=?, HreVel=?, HreObs=?, HreAva=?, HreAs=?, HreAi=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?", GX_NOMASK, "TXPHISREM")
         ,new UpdateCursor("T01PM12", "DELETE FROM TXPHISREM  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?", GX_NOMASK, "TXPHISREM")
         ,new ForEachCursor("T01PM13", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreNormId FROM TXPHISRE2 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PM14", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreTraID FROM TXPHISRE3 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PM15", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro FROM TXPHISREC WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PM16", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinObs FROM TXPHISOBS WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PM17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PM18", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 10);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 6);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 6);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 20);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(36, 4);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 3);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(38, 3);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(39, 3);
               ((int[]) buf[76])[0] = rslt.getInt(40);
               ((byte[]) buf[77])[0] = rslt.getByte(41);
               ((String[]) buf[78])[0] = rslt.getString(42, 1);
               ((byte[]) buf[79])[0] = rslt.getByte(43);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 10);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 6);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 6);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 20);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(36, 4);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 3);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(38, 3);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(39, 3);
               ((int[]) buf[76])[0] = rslt.getInt(40);
               ((byte[]) buf[77])[0] = rslt.getByte(41);
               ((String[]) buf[78])[0] = rslt.getString(42, 1);
               ((byte[]) buf[79])[0] = rslt.getByte(43);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 10);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 6);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 6);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 20);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(36, 4);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 3);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(38, 3);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(39, 3);
               ((int[]) buf[76])[0] = rslt.getInt(40);
               ((byte[]) buf[77])[0] = rslt.getByte(41);
               ((String[]) buf[78])[0] = rslt.getString(42, 1);
               ((byte[]) buf[79])[0] = rslt.getByte(43);
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setShort(21, ((Number) parms[20]).shortValue());
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
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 8);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[20]).byteValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 10);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[32]).byteValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[34]).byteValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[36]).shortValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[50]).intValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[52]).intValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[54], 6);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[56], 1);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[58], 6);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[60], 20);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[62]).shortValue());
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[64]).shortValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[68], 800);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[70], 4);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[72], 3);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[74], 3);
               }
               stmt.setString(39, (String)parms[75], 3);
               stmt.setInt(40, ((Number) parms[76]).intValue());
               stmt.setByte(41, ((Number) parms[77]).byteValue());
               stmt.setString(42, (String)parms[78], 1);
               stmt.setByte(43, ((Number) parms[79]).byteValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 8);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 10);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[49]).intValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[51]).intValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 6);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 1);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 6);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 20);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[67], 800);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[69], 4);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[71], 3);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[73], 3);
               }
               stmt.setString(38, (String)parms[74], 3);
               stmt.setInt(39, ((Number) parms[75]).intValue());
               stmt.setByte(40, ((Number) parms[76]).byteValue());
               stmt.setString(41, (String)parms[77], 1);
               stmt.setByte(42, ((Number) parms[78]).byteValue());
               stmt.setShort(43, ((Number) parms[79]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

