package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hisrag_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla HISRAG", ""), (short)(0)) ;
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

   public hisrag_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hisrag_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hisrag_impl.class ));
   }

   public hisrag_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla HISRAG", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_HISRAG.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_HISRAG.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISRAG.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISRAG.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISRAG.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarPar_Internalname, GXutil.rtrim( A4494HreBarPar), GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISRAG.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumCie_Internalname, GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumCie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumCie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreNumCie_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAgrCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAgrCod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAgrCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4497HreAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAgrCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4497HreAgrCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4497HreAgrCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAgrCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAgrCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAgrReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAgrReo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAgrReo_Internalname, GXutil.ltrim( localUtil.ntoc( A4498HreAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAgrReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4498HreAgrReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4498HreAgrReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAgrReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAgrReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAgrPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAgrPar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAgrPar_Internalname, GXutil.rtrim( A4499HreAgrPar), GXutil.rtrim( localUtil.format( A4499HreAgrPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAgrPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAgrPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAgrKgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAgrKgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAgrKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A4500HreAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAgrKgm_Enabled!=0) ? localUtil.format( A4500HreAgrKgm, "ZZZZZ9.99") : localUtil.format( A4500HreAgrKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAgrKgm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAgrKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAgrMtr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAgrMtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAgrMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A4501HreAgrMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAgrMtr_Enabled!=0) ? localUtil.format( A4501HreAgrMtr, "ZZZZZ9.99") : localUtil.format( A4501HreAgrMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAgrMtr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAgrMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAgrPie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAgrPie_Internalname, httpContext.getMessage( "Pzas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAgrPie_Internalname, GXutil.ltrim( localUtil.ntoc( A4502HreAgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAgrPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4502HreAgrPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4502HreAgrPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAgrPie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAgrPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAgrCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAgrCli_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAgrCli_Internalname, GXutil.ltrim( localUtil.ntoc( A4503HreAgrCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAgrCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4503HreAgrCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4503HreAgrCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAgrCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAgrCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAgrSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAgrSer_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAgrSer_Internalname, GXutil.rtrim( A4504HreAgrSer), GXutil.rtrim( localUtil.format( A4504HreAgrSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAgrSer_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAgrSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAgrDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAgrDsc_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAgrDsc_Internalname, GXutil.rtrim( A4505HreAgrDsc), GXutil.rtrim( localUtil.format( A4505HreAgrDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAgrDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAgrDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAgrCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAgrCol_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAgrCol_Internalname, GXutil.rtrim( A4506HreAgrCol), GXutil.rtrim( localUtil.format( A4506HreAgrCol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAgrCol_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAgrCol_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAgrNumC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAgrNumC_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAgrNumC_Internalname, GXutil.ltrim( localUtil.ntoc( A4507HreAgrNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAgrNumC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4507HreAgrNumC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4507HreAgrNumC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAgrNumC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAgrNumC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHreAgrNHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHreAgrNHdr_Internalname, httpContext.getMessage( "HDR", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAgrNHdr_Internalname, GXutil.rtrim( A13894HreAgrNHdr), GXutil.rtrim( localUtil.format( A13894HreAgrNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAgrNHdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreAgrNHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISRAG.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISRAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISRAG.htm");
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
         Z4497HreAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4497HreAgrCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4498HreAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4498HreAgrReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4499HreAgrPar = httpContext.cgiGet( "Z4499HreAgrPar") ;
         Z4500HreAgrKgm = localUtil.ctond( httpContext.cgiGet( "Z4500HreAgrKgm")) ;
         Z4501HreAgrMtr = localUtil.ctond( httpContext.cgiGet( "Z4501HreAgrMtr")) ;
         Z4502HreAgrPie = (short)(localUtil.ctol( httpContext.cgiGet( "Z4502HreAgrPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4503HreAgrCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z4503HreAgrCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4504HreAgrSer = httpContext.cgiGet( "Z4504HreAgrSer") ;
         Z4505HreAgrDsc = httpContext.cgiGet( "Z4505HreAgrDsc") ;
         Z4506HreAgrCol = httpContext.cgiGet( "Z4506HreAgrCol") ;
         Z4507HreAgrNumC = (int)(localUtil.ctol( httpContext.cgiGet( "Z4507HreAgrNumC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREAGRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAgrCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4497HreAgrCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4497HreAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4497HreAgrCod), 8, 0));
         }
         else
         {
            A4497HreAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4497HreAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4497HreAgrCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREAGRREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAgrReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4498HreAgrReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4498HreAgrReo", GXutil.str( A4498HreAgrReo, 1, 0));
         }
         else
         {
            A4498HreAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4498HreAgrReo", GXutil.str( A4498HreAgrReo, 1, 0));
         }
         A4499HreAgrPar = httpContext.cgiGet( edtHreAgrPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4499HreAgrPar", A4499HreAgrPar);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreAgrKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreAgrKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREAGRKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAgrKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4500HreAgrKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A4500HreAgrKgm", GXutil.ltrimstr( A4500HreAgrKgm, 9, 2));
         }
         else
         {
            A4500HreAgrKgm = localUtil.ctond( httpContext.cgiGet( edtHreAgrKgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4500HreAgrKgm", GXutil.ltrimstr( A4500HreAgrKgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreAgrMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreAgrMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREAGRMTR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAgrMtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4501HreAgrMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A4501HreAgrMtr", GXutil.ltrimstr( A4501HreAgrMtr, 9, 2));
         }
         else
         {
            A4501HreAgrMtr = localUtil.ctond( httpContext.cgiGet( edtHreAgrMtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4501HreAgrMtr", GXutil.ltrimstr( A4501HreAgrMtr, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAgrPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAgrPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREAGRPIE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAgrPie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4502HreAgrPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4502HreAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4502HreAgrPie), 4, 0));
         }
         else
         {
            A4502HreAgrPie = (short)(localUtil.ctol( httpContext.cgiGet( edtHreAgrPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4502HreAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4502HreAgrPie), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAgrCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAgrCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREAGRCLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAgrCli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4503HreAgrCli = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4503HreAgrCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4503HreAgrCli), 6, 0));
         }
         else
         {
            A4503HreAgrCli = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAgrCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4503HreAgrCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4503HreAgrCli), 6, 0));
         }
         A4504HreAgrSer = httpContext.cgiGet( edtHreAgrSer_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4504HreAgrSer", A4504HreAgrSer);
         A4505HreAgrDsc = httpContext.cgiGet( edtHreAgrDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4505HreAgrDsc", A4505HreAgrDsc);
         A4506HreAgrCol = httpContext.cgiGet( edtHreAgrCol_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4506HreAgrCol", A4506HreAgrCol);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAgrNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAgrNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREAGRNUMC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreAgrNumC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4507HreAgrNumC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4507HreAgrNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4507HreAgrNumC), 6, 0));
         }
         else
         {
            A4507HreAgrNumC = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAgrNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4507HreAgrNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4507HreAgrNumC), 6, 0));
         }
         A13894HreAgrNHdr = httpContext.cgiGet( edtHreAgrNHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13894HreAgrNHdr", A13894HreAgrNHdr);
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
            A4497HreAgrCod = (int)(GXutil.lval( httpContext.GetPar( "HreAgrCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4497HreAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4497HreAgrCod), 8, 0));
            A4498HreAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "HreAgrReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4498HreAgrReo", GXutil.str( A4498HreAgrReo, 1, 0));
            A4499HreAgrPar = httpContext.GetPar( "HreAgrPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4499HreAgrPar", A4499HreAgrPar);
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
            initAll1R6676( ) ;
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
      disableAttributes1R6676( ) ;
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

   public void resetCaption1R60( )
   {
   }

   public void zm1R6676( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4500HreAgrKgm = T01R63_A4500HreAgrKgm[0] ;
            Z4501HreAgrMtr = T01R63_A4501HreAgrMtr[0] ;
            Z4502HreAgrPie = T01R63_A4502HreAgrPie[0] ;
            Z4503HreAgrCli = T01R63_A4503HreAgrCli[0] ;
            Z4504HreAgrSer = T01R63_A4504HreAgrSer[0] ;
            Z4505HreAgrDsc = T01R63_A4505HreAgrDsc[0] ;
            Z4506HreAgrCol = T01R63_A4506HreAgrCol[0] ;
            Z4507HreAgrNumC = T01R63_A4507HreAgrNumC[0] ;
         }
         else
         {
            Z4500HreAgrKgm = A4500HreAgrKgm ;
            Z4501HreAgrMtr = A4501HreAgrMtr ;
            Z4502HreAgrPie = A4502HreAgrPie ;
            Z4503HreAgrCli = A4503HreAgrCli ;
            Z4504HreAgrSer = A4504HreAgrSer ;
            Z4505HreAgrDsc = A4505HreAgrDsc ;
            Z4506HreAgrCol = A4506HreAgrCol ;
            Z4507HreAgrNumC = A4507HreAgrNumC ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z4497HreAgrCod = A4497HreAgrCod ;
         Z4498HreAgrReo = A4498HreAgrReo ;
         Z4499HreAgrPar = A4499HreAgrPar ;
         Z4500HreAgrKgm = A4500HreAgrKgm ;
         Z4501HreAgrMtr = A4501HreAgrMtr ;
         Z4502HreAgrPie = A4502HreAgrPie ;
         Z4503HreAgrCli = A4503HreAgrCli ;
         Z4504HreAgrSer = A4504HreAgrSer ;
         Z4505HreAgrDsc = A4505HreAgrDsc ;
         Z4506HreAgrCol = A4506HreAgrCol ;
         Z4507HreAgrNumC = A4507HreAgrNumC ;
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

   public void load1R6676( )
   {
      /* Using cursor T01R65 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4498HreAgrReo), A4499HreAgrPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound676 = (short)(1) ;
         A4500HreAgrKgm = T01R65_A4500HreAgrKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4500HreAgrKgm", GXutil.ltrimstr( A4500HreAgrKgm, 9, 2));
         A4501HreAgrMtr = T01R65_A4501HreAgrMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4501HreAgrMtr", GXutil.ltrimstr( A4501HreAgrMtr, 9, 2));
         A4502HreAgrPie = T01R65_A4502HreAgrPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4502HreAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4502HreAgrPie), 4, 0));
         A4503HreAgrCli = T01R65_A4503HreAgrCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4503HreAgrCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4503HreAgrCli), 6, 0));
         A4504HreAgrSer = T01R65_A4504HreAgrSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4504HreAgrSer", A4504HreAgrSer);
         A4505HreAgrDsc = T01R65_A4505HreAgrDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4505HreAgrDsc", A4505HreAgrDsc);
         A4506HreAgrCol = T01R65_A4506HreAgrCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4506HreAgrCol", A4506HreAgrCol);
         A4507HreAgrNumC = T01R65_A4507HreAgrNumC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4507HreAgrNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4507HreAgrNumC), 6, 0));
         zm1R6676( -2) ;
      }
      pr_default.close(3);
      onLoadActions1R6676( ) ;
   }

   public void onLoadActions1R6676( )
   {
      A13894HreAgrNHdr = GXutil.trim( GXutil.str( A4497HreAgrCod, 8, 0)) + "-" + GXutil.str( A4498HreAgrReo, 1, 0) + A4499HreAgrPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13894HreAgrNHdr", A13894HreAgrNHdr);
   }

   public void checkExtendedTable1R6676( )
   {
      nIsDirty_676 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01R64 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      nIsDirty_676 = (short)(1) ;
      A13894HreAgrNHdr = GXutil.trim( GXutil.str( A4497HreAgrCod, 8, 0)) + "-" + GXutil.str( A4498HreAgrReo, 1, 0) + A4499HreAgrPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13894HreAgrNHdr", A13894HreAgrNHdr);
   }

   public void closeExtendedTableCursors1R6676( )
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
      /* Using cursor T01R66 */
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

   public void getKey1R6676( )
   {
      /* Using cursor T01R67 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4498HreAgrReo), A4499HreAgrPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound676 = (short)(1) ;
      }
      else
      {
         RcdFound676 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01R63 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4498HreAgrReo), A4499HreAgrPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1R6676( 2) ;
         RcdFound676 = (short)(1) ;
         A4497HreAgrCod = T01R63_A4497HreAgrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4497HreAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4497HreAgrCod), 8, 0));
         A4498HreAgrReo = T01R63_A4498HreAgrReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4498HreAgrReo", GXutil.str( A4498HreAgrReo, 1, 0));
         A4499HreAgrPar = T01R63_A4499HreAgrPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4499HreAgrPar", A4499HreAgrPar);
         A4500HreAgrKgm = T01R63_A4500HreAgrKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4500HreAgrKgm", GXutil.ltrimstr( A4500HreAgrKgm, 9, 2));
         A4501HreAgrMtr = T01R63_A4501HreAgrMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4501HreAgrMtr", GXutil.ltrimstr( A4501HreAgrMtr, 9, 2));
         A4502HreAgrPie = T01R63_A4502HreAgrPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4502HreAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4502HreAgrPie), 4, 0));
         A4503HreAgrCli = T01R63_A4503HreAgrCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4503HreAgrCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4503HreAgrCli), 6, 0));
         A4504HreAgrSer = T01R63_A4504HreAgrSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4504HreAgrSer", A4504HreAgrSer);
         A4505HreAgrDsc = T01R63_A4505HreAgrDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4505HreAgrDsc", A4505HreAgrDsc);
         A4506HreAgrCol = T01R63_A4506HreAgrCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4506HreAgrCol", A4506HreAgrCol);
         A4507HreAgrNumC = T01R63_A4507HreAgrNumC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4507HreAgrNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4507HreAgrNumC), 6, 0));
         A396EmprCod = T01R63_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T01R63_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T01R63_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T01R63_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T01R63_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4497HreAgrCod = A4497HreAgrCod ;
         Z4498HreAgrReo = A4498HreAgrReo ;
         Z4499HreAgrPar = A4499HreAgrPar ;
         sMode676 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1R6676( ) ;
         if ( AnyError == 1 )
         {
            RcdFound676 = (short)(0) ;
            initializeNonKey1R6676( ) ;
         }
         Gx_mode = sMode676 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound676 = (short)(0) ;
         initializeNonKey1R6676( ) ;
         sMode676 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode676 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1R6676( ) ;
      if ( RcdFound676 == 0 )
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
      RcdFound676 = (short)(0) ;
      /* Using cursor T01R68 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4495HreNumCie), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Integer.valueOf(A4497HreAgrCod), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4498HreAgrReo), Byte.valueOf(A4498HreAgrReo), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A4499HreAgrPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R68_A4492HreBarCod[0] < A4492HreBarCod ) || ( T01R68_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R68_A4493HreBarReo[0] < A4493HreBarReo ) || ( T01R68_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R68_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R68_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T01R68_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R68_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R68_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R68_A4495HreNumCie[0] < A4495HreNumCie ) || ( T01R68_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R68_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R68_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R68_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R68_A4497HreAgrCod[0] < A4497HreAgrCod ) || ( T01R68_A4497HreAgrCod[0] == A4497HreAgrCod ) && ( T01R68_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R68_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R68_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R68_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R68_A4498HreAgrReo[0] < A4498HreAgrReo ) || ( T01R68_A4498HreAgrReo[0] == A4498HreAgrReo ) && ( T01R68_A4497HreAgrCod[0] == A4497HreAgrCod ) && ( T01R68_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R68_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R68_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R68_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R68_A4499HreAgrPar[0], A4499HreAgrPar) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R68_A4492HreBarCod[0] > A4492HreBarCod ) || ( T01R68_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R68_A4493HreBarReo[0] > A4493HreBarReo ) || ( T01R68_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R68_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R68_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T01R68_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R68_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R68_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R68_A4495HreNumCie[0] > A4495HreNumCie ) || ( T01R68_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R68_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R68_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R68_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R68_A4497HreAgrCod[0] > A4497HreAgrCod ) || ( T01R68_A4497HreAgrCod[0] == A4497HreAgrCod ) && ( T01R68_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R68_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R68_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R68_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R68_A4498HreAgrReo[0] > A4498HreAgrReo ) || ( T01R68_A4498HreAgrReo[0] == A4498HreAgrReo ) && ( T01R68_A4497HreAgrCod[0] == A4497HreAgrCod ) && ( T01R68_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R68_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R68_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R68_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R68_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R68_A4499HreAgrPar[0], A4499HreAgrPar) > 0 ) ) )
         {
            A396EmprCod = T01R68_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4492HreBarCod = T01R68_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T01R68_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T01R68_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T01R68_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A4497HreAgrCod = T01R68_A4497HreAgrCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4497HreAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4497HreAgrCod), 8, 0));
            A4498HreAgrReo = T01R68_A4498HreAgrReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4498HreAgrReo", GXutil.str( A4498HreAgrReo, 1, 0));
            A4499HreAgrPar = T01R68_A4499HreAgrPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4499HreAgrPar", A4499HreAgrPar);
            RcdFound676 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound676 = (short)(0) ;
      /* Using cursor T01R69 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4495HreNumCie), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Integer.valueOf(A4497HreAgrCod), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4498HreAgrReo), Byte.valueOf(A4498HreAgrReo), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A4499HreAgrPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R69_A4492HreBarCod[0] > A4492HreBarCod ) || ( T01R69_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R69_A4493HreBarReo[0] > A4493HreBarReo ) || ( T01R69_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R69_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R69_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T01R69_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R69_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R69_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R69_A4495HreNumCie[0] > A4495HreNumCie ) || ( T01R69_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R69_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R69_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R69_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R69_A4497HreAgrCod[0] > A4497HreAgrCod ) || ( T01R69_A4497HreAgrCod[0] == A4497HreAgrCod ) && ( T01R69_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R69_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R69_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R69_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R69_A4498HreAgrReo[0] > A4498HreAgrReo ) || ( T01R69_A4498HreAgrReo[0] == A4498HreAgrReo ) && ( T01R69_A4497HreAgrCod[0] == A4497HreAgrCod ) && ( T01R69_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R69_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R69_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R69_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R69_A4499HreAgrPar[0], A4499HreAgrPar) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R69_A4492HreBarCod[0] < A4492HreBarCod ) || ( T01R69_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R69_A4493HreBarReo[0] < A4493HreBarReo ) || ( T01R69_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R69_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R69_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T01R69_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R69_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R69_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R69_A4495HreNumCie[0] < A4495HreNumCie ) || ( T01R69_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R69_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R69_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R69_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R69_A4497HreAgrCod[0] < A4497HreAgrCod ) || ( T01R69_A4497HreAgrCod[0] == A4497HreAgrCod ) && ( T01R69_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R69_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R69_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R69_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R69_A4498HreAgrReo[0] < A4498HreAgrReo ) || ( T01R69_A4498HreAgrReo[0] == A4498HreAgrReo ) && ( T01R69_A4497HreAgrCod[0] == A4497HreAgrCod ) && ( T01R69_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01R69_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01R69_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01R69_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01R69_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R69_A4499HreAgrPar[0], A4499HreAgrPar) < 0 ) ) )
         {
            A396EmprCod = T01R69_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4492HreBarCod = T01R69_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T01R69_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T01R69_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T01R69_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A4497HreAgrCod = T01R69_A4497HreAgrCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4497HreAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4497HreAgrCod), 8, 0));
            A4498HreAgrReo = T01R69_A4498HreAgrReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4498HreAgrReo", GXutil.str( A4498HreAgrReo, 1, 0));
            A4499HreAgrPar = T01R69_A4499HreAgrPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4499HreAgrPar", A4499HreAgrPar);
            RcdFound676 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1R6676( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1R6676( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound676 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4497HreAgrCod != Z4497HreAgrCod ) || ( A4498HreAgrReo != Z4498HreAgrReo ) || ( GXutil.strcmp(A4499HreAgrPar, Z4499HreAgrPar) != 0 ) )
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
               A4497HreAgrCod = Z4497HreAgrCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4497HreAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4497HreAgrCod), 8, 0));
               A4498HreAgrReo = Z4498HreAgrReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A4498HreAgrReo", GXutil.str( A4498HreAgrReo, 1, 0));
               A4499HreAgrPar = Z4499HreAgrPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A4499HreAgrPar", A4499HreAgrPar);
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
               update1R6676( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4497HreAgrCod != Z4497HreAgrCod ) || ( A4498HreAgrReo != Z4498HreAgrReo ) || ( GXutil.strcmp(A4499HreAgrPar, Z4499HreAgrPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1R6676( ) ;
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
                  insert1R6676( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4497HreAgrCod != Z4497HreAgrCod ) || ( A4498HreAgrReo != Z4498HreAgrReo ) || ( GXutil.strcmp(A4499HreAgrPar, Z4499HreAgrPar) != 0 ) )
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
         A4497HreAgrCod = Z4497HreAgrCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4497HreAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4497HreAgrCod), 8, 0));
         A4498HreAgrReo = Z4498HreAgrReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A4498HreAgrReo", GXutil.str( A4498HreAgrReo, 1, 0));
         A4499HreAgrPar = Z4499HreAgrPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A4499HreAgrPar", A4499HreAgrPar);
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
      if ( RcdFound676 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtHreAgrKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1R6676( ) ;
      if ( RcdFound676 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreAgrKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1R6676( ) ;
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
      if ( RcdFound676 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreAgrKgm_Internalname ;
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
      if ( RcdFound676 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreAgrKgm_Internalname ;
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
      scanStart1R6676( ) ;
      if ( RcdFound676 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound676 != 0 )
         {
            scanNext1R6676( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreAgrKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1R6676( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1R6676( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01R62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4498HreAgrReo), A4499HreAgrPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISRAG"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z4500HreAgrKgm, T01R62_A4500HreAgrKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z4501HreAgrMtr, T01R62_A4501HreAgrMtr[0]) != 0 ) || ( Z4502HreAgrPie != T01R62_A4502HreAgrPie[0] ) || ( Z4503HreAgrCli != T01R62_A4503HreAgrCli[0] ) || ( GXutil.strcmp(Z4504HreAgrSer, T01R62_A4504HreAgrSer[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4505HreAgrDsc, T01R62_A4505HreAgrDsc[0]) != 0 ) || ( GXutil.strcmp(Z4506HreAgrCol, T01R62_A4506HreAgrCol[0]) != 0 ) || ( Z4507HreAgrNumC != T01R62_A4507HreAgrNumC[0] ) )
         {
            if ( DecimalUtil.compareTo(Z4500HreAgrKgm, T01R62_A4500HreAgrKgm[0]) != 0 )
            {
               GXutil.writeLogln("hisrag:[seudo value changed for attri]"+"HreAgrKgm");
               GXutil.writeLogRaw("Old: ",Z4500HreAgrKgm);
               GXutil.writeLogRaw("Current: ",T01R62_A4500HreAgrKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z4501HreAgrMtr, T01R62_A4501HreAgrMtr[0]) != 0 )
            {
               GXutil.writeLogln("hisrag:[seudo value changed for attri]"+"HreAgrMtr");
               GXutil.writeLogRaw("Old: ",Z4501HreAgrMtr);
               GXutil.writeLogRaw("Current: ",T01R62_A4501HreAgrMtr[0]);
            }
            if ( Z4502HreAgrPie != T01R62_A4502HreAgrPie[0] )
            {
               GXutil.writeLogln("hisrag:[seudo value changed for attri]"+"HreAgrPie");
               GXutil.writeLogRaw("Old: ",Z4502HreAgrPie);
               GXutil.writeLogRaw("Current: ",T01R62_A4502HreAgrPie[0]);
            }
            if ( Z4503HreAgrCli != T01R62_A4503HreAgrCli[0] )
            {
               GXutil.writeLogln("hisrag:[seudo value changed for attri]"+"HreAgrCli");
               GXutil.writeLogRaw("Old: ",Z4503HreAgrCli);
               GXutil.writeLogRaw("Current: ",T01R62_A4503HreAgrCli[0]);
            }
            if ( GXutil.strcmp(Z4504HreAgrSer, T01R62_A4504HreAgrSer[0]) != 0 )
            {
               GXutil.writeLogln("hisrag:[seudo value changed for attri]"+"HreAgrSer");
               GXutil.writeLogRaw("Old: ",Z4504HreAgrSer);
               GXutil.writeLogRaw("Current: ",T01R62_A4504HreAgrSer[0]);
            }
            if ( GXutil.strcmp(Z4505HreAgrDsc, T01R62_A4505HreAgrDsc[0]) != 0 )
            {
               GXutil.writeLogln("hisrag:[seudo value changed for attri]"+"HreAgrDsc");
               GXutil.writeLogRaw("Old: ",Z4505HreAgrDsc);
               GXutil.writeLogRaw("Current: ",T01R62_A4505HreAgrDsc[0]);
            }
            if ( GXutil.strcmp(Z4506HreAgrCol, T01R62_A4506HreAgrCol[0]) != 0 )
            {
               GXutil.writeLogln("hisrag:[seudo value changed for attri]"+"HreAgrCol");
               GXutil.writeLogRaw("Old: ",Z4506HreAgrCol);
               GXutil.writeLogRaw("Current: ",T01R62_A4506HreAgrCol[0]);
            }
            if ( Z4507HreAgrNumC != T01R62_A4507HreAgrNumC[0] )
            {
               GXutil.writeLogln("hisrag:[seudo value changed for attri]"+"HreAgrNumC");
               GXutil.writeLogRaw("Old: ",Z4507HreAgrNumC);
               GXutil.writeLogRaw("Current: ",T01R62_A4507HreAgrNumC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISRAG"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1R6676( )
   {
      beforeValidate1R6676( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1R6676( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1R6676( 0) ;
         checkOptimisticConcurrency1R6676( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1R6676( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1R6676( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01R610 */
                  pr_default.execute(8, new Object[] {Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4498HreAgrReo), A4499HreAgrPar, A4500HreAgrKgm, A4501HreAgrMtr, Short.valueOf(A4502HreAgrPie), Integer.valueOf(A4503HreAgrCli), A4504HreAgrSer, A4505HreAgrDsc, A4506HreAgrCol, Integer.valueOf(A4507HreAgrNumC), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISRAG");
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
                        resetCaption1R60( ) ;
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
            load1R6676( ) ;
         }
         endLevel1R6676( ) ;
      }
      closeExtendedTableCursors1R6676( ) ;
   }

   public void update1R6676( )
   {
      beforeValidate1R6676( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1R6676( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1R6676( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1R6676( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1R6676( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01R611 */
                  pr_default.execute(9, new Object[] {A4500HreAgrKgm, A4501HreAgrMtr, Short.valueOf(A4502HreAgrPie), Integer.valueOf(A4503HreAgrCli), A4504HreAgrSer, A4505HreAgrDsc, A4506HreAgrCol, Integer.valueOf(A4507HreAgrNumC), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4498HreAgrReo), A4499HreAgrPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISRAG");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISRAG"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1R6676( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1R60( ) ;
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
         endLevel1R6676( ) ;
      }
      closeExtendedTableCursors1R6676( ) ;
   }

   public void deferredUpdate1R6676( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1R6676( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1R6676( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1R6676( ) ;
         afterConfirm1R6676( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1R6676( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01R612 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4498HreAgrReo), A4499HreAgrPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISRAG");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound676 == 0 )
                     {
                        initAll1R6676( ) ;
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
                     resetCaption1R60( ) ;
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
      sMode676 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1R6676( ) ;
      Gx_mode = sMode676 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1R6676( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13894HreAgrNHdr = GXutil.trim( GXutil.str( A4497HreAgrCod, 8, 0)) + "-" + GXutil.str( A4498HreAgrReo, 1, 0) + A4499HreAgrPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13894HreAgrNHdr", A13894HreAgrNHdr);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01R613 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4498HreAgrReo), A4499HreAgrPar});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T01R614 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4498HreAgrReo), A4499HreAgrPar});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel1R6676( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1R6676( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "hisrag");
         if ( AnyError == 0 )
         {
            confirmValues1R60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "hisrag");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1R6676( )
   {
      /* Using cursor T01R615 */
      pr_default.execute(13);
      RcdFound676 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound676 = (short)(1) ;
         A396EmprCod = T01R615_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T01R615_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T01R615_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T01R615_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T01R615_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A4497HreAgrCod = T01R615_A4497HreAgrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4497HreAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4497HreAgrCod), 8, 0));
         A4498HreAgrReo = T01R615_A4498HreAgrReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4498HreAgrReo", GXutil.str( A4498HreAgrReo, 1, 0));
         A4499HreAgrPar = T01R615_A4499HreAgrPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4499HreAgrPar", A4499HreAgrPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1R6676( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound676 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound676 = (short)(1) ;
         A396EmprCod = T01R615_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T01R615_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T01R615_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T01R615_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T01R615_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A4497HreAgrCod = T01R615_A4497HreAgrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4497HreAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4497HreAgrCod), 8, 0));
         A4498HreAgrReo = T01R615_A4498HreAgrReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4498HreAgrReo", GXutil.str( A4498HreAgrReo, 1, 0));
         A4499HreAgrPar = T01R615_A4499HreAgrPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4499HreAgrPar", A4499HreAgrPar);
      }
   }

   public void scanEnd1R6676( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1R6676( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1R6676( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1R6676( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1R6676( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1R6676( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1R6676( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1R6676( )
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
      edtHreAgrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrCod_Enabled), 5, 0), true);
      edtHreAgrReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrReo_Enabled), 5, 0), true);
      edtHreAgrPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrPar_Enabled), 5, 0), true);
      edtHreAgrKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrKgm_Enabled), 5, 0), true);
      edtHreAgrMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrMtr_Enabled), 5, 0), true);
      edtHreAgrPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrPie_Enabled), 5, 0), true);
      edtHreAgrCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrCli_Enabled), 5, 0), true);
      edtHreAgrSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrSer_Enabled), 5, 0), true);
      edtHreAgrDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrDsc_Enabled), 5, 0), true);
      edtHreAgrCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrCol_Enabled), 5, 0), true);
      edtHreAgrNumC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrNumC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrNumC_Enabled), 5, 0), true);
      edtHreAgrNHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrNHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrNHdr_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1R6676( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1R60( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.hisrag", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4497HreAgrCod", GXutil.ltrim( localUtil.ntoc( Z4497HreAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4498HreAgrReo", GXutil.ltrim( localUtil.ntoc( Z4498HreAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4499HreAgrPar", GXutil.rtrim( Z4499HreAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4500HreAgrKgm", GXutil.ltrim( localUtil.ntoc( Z4500HreAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4501HreAgrMtr", GXutil.ltrim( localUtil.ntoc( Z4501HreAgrMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4502HreAgrPie", GXutil.ltrim( localUtil.ntoc( Z4502HreAgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4503HreAgrCli", GXutil.ltrim( localUtil.ntoc( Z4503HreAgrCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4504HreAgrSer", GXutil.rtrim( Z4504HreAgrSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4505HreAgrDsc", GXutil.rtrim( Z4505HreAgrDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4506HreAgrCol", GXutil.rtrim( Z4506HreAgrCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4507HreAgrNumC", GXutil.ltrim( localUtil.ntoc( Z4507HreAgrNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.hisrag", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "HISRAG" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla HISRAG", "") ;
   }

   public void initializeNonKey1R6676( )
   {
      A13894HreAgrNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13894HreAgrNHdr", A13894HreAgrNHdr);
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4500HreAgrKgm", GXutil.ltrimstr( A4500HreAgrKgm, 9, 2));
      A4501HreAgrMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4501HreAgrMtr", GXutil.ltrimstr( A4501HreAgrMtr, 9, 2));
      A4502HreAgrPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4502HreAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4502HreAgrPie), 4, 0));
      A4503HreAgrCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4503HreAgrCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4503HreAgrCli), 6, 0));
      A4504HreAgrSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4504HreAgrSer", A4504HreAgrSer);
      A4505HreAgrDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4505HreAgrDsc", A4505HreAgrDsc);
      A4506HreAgrCol = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4506HreAgrCol", A4506HreAgrCol);
      A4507HreAgrNumC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4507HreAgrNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4507HreAgrNumC), 6, 0));
      Z4500HreAgrKgm = DecimalUtil.ZERO ;
      Z4501HreAgrMtr = DecimalUtil.ZERO ;
      Z4502HreAgrPie = (short)(0) ;
      Z4503HreAgrCli = 0 ;
      Z4504HreAgrSer = "" ;
      Z4505HreAgrDsc = "" ;
      Z4506HreAgrCol = "" ;
      Z4507HreAgrNumC = 0 ;
   }

   public void initAll1R6676( )
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
      A4497HreAgrCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4497HreAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4497HreAgrCod), 8, 0));
      A4498HreAgrReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4498HreAgrReo", GXutil.str( A4498HreAgrReo, 1, 0));
      A4499HreAgrPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4499HreAgrPar", A4499HreAgrPar);
      initializeNonKey1R6676( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101638342", true, true);
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
      httpContext.AddJavascriptSource("hisrag.js", "?20266101638342", false, true);
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
      edtHreAgrCod_Internalname = "HREAGRCOD" ;
      edtHreAgrReo_Internalname = "HREAGRREO" ;
      edtHreAgrPar_Internalname = "HREAGRPAR" ;
      edtHreAgrKgm_Internalname = "HREAGRKGM" ;
      edtHreAgrMtr_Internalname = "HREAGRMTR" ;
      edtHreAgrPie_Internalname = "HREAGRPIE" ;
      edtHreAgrCli_Internalname = "HREAGRCLI" ;
      edtHreAgrSer_Internalname = "HREAGRSER" ;
      edtHreAgrDsc_Internalname = "HREAGRDSC" ;
      edtHreAgrCol_Internalname = "HREAGRCOL" ;
      edtHreAgrNumC_Internalname = "HREAGRNUMC" ;
      edtHreAgrNHdr_Internalname = "HREAGRNHDR" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla HISRAG", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtHreAgrNHdr_Jsonclick = "" ;
      edtHreAgrNHdr_Enabled = 0 ;
      edtHreAgrNumC_Jsonclick = "" ;
      edtHreAgrNumC_Enabled = 1 ;
      edtHreAgrCol_Jsonclick = "" ;
      edtHreAgrCol_Enabled = 1 ;
      edtHreAgrDsc_Jsonclick = "" ;
      edtHreAgrDsc_Enabled = 1 ;
      edtHreAgrSer_Jsonclick = "" ;
      edtHreAgrSer_Enabled = 1 ;
      edtHreAgrCli_Jsonclick = "" ;
      edtHreAgrCli_Enabled = 1 ;
      edtHreAgrPie_Jsonclick = "" ;
      edtHreAgrPie_Enabled = 1 ;
      edtHreAgrMtr_Jsonclick = "" ;
      edtHreAgrMtr_Enabled = 1 ;
      edtHreAgrKgm_Jsonclick = "" ;
      edtHreAgrKgm_Enabled = 1 ;
      edtHreAgrPar_Jsonclick = "" ;
      edtHreAgrPar_Enabled = 1 ;
      edtHreAgrReo_Jsonclick = "" ;
      edtHreAgrReo_Enabled = 1 ;
      edtHreAgrCod_Jsonclick = "" ;
      edtHreAgrCod_Enabled = 1 ;
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
      /* Using cursor T01R616 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(14);
      GX_FocusControl = edtHreAgrKgm_Internalname ;
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
      /* Using cursor T01R616 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Hreagrpar( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      A13894HreAgrNHdr = GXutil.trim( GXutil.str( A4497HreAgrCod, 8, 0)) + "-" + GXutil.str( A4498HreAgrReo, 1, 0) + A4499HreAgrPar ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4500HreAgrKgm", GXutil.ltrim( localUtil.ntoc( A4500HreAgrKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4501HreAgrMtr", GXutil.ltrim( localUtil.ntoc( A4501HreAgrMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4502HreAgrPie", GXutil.ltrim( localUtil.ntoc( A4502HreAgrPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4503HreAgrCli", GXutil.ltrim( localUtil.ntoc( A4503HreAgrCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4504HreAgrSer", GXutil.rtrim( A4504HreAgrSer));
      httpContext.ajax_rsp_assign_attri("", false, "A4505HreAgrDsc", GXutil.rtrim( A4505HreAgrDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4506HreAgrCol", GXutil.rtrim( A4506HreAgrCol));
      httpContext.ajax_rsp_assign_attri("", false, "A4507HreAgrNumC", GXutil.ltrim( localUtil.ntoc( A4507HreAgrNumC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13894HreAgrNHdr", GXutil.rtrim( A13894HreAgrNHdr));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4497HreAgrCod", GXutil.ltrim( localUtil.ntoc( Z4497HreAgrCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4498HreAgrReo", GXutil.ltrim( localUtil.ntoc( Z4498HreAgrReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4499HreAgrPar", GXutil.rtrim( Z4499HreAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4500HreAgrKgm", GXutil.ltrim( localUtil.ntoc( Z4500HreAgrKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4501HreAgrMtr", GXutil.ltrim( localUtil.ntoc( Z4501HreAgrMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4502HreAgrPie", GXutil.ltrim( localUtil.ntoc( Z4502HreAgrPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4503HreAgrCli", GXutil.ltrim( localUtil.ntoc( Z4503HreAgrCli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4504HreAgrSer", GXutil.rtrim( Z4504HreAgrSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4505HreAgrDsc", GXutil.rtrim( Z4505HreAgrDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4506HreAgrCol", GXutil.rtrim( Z4506HreAgrCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4507HreAgrNumC", GXutil.ltrim( localUtil.ntoc( Z4507HreAgrNumC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13894HreAgrNHdr", GXutil.rtrim( Z13894HreAgrNHdr));
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
      setEventMetadata("VALID_HREAGRCOD","{handler:'valid_Hreagrcod',iparms:[]");
      setEventMetadata("VALID_HREAGRCOD",",oparms:[]}");
      setEventMetadata("VALID_HREAGRREO","{handler:'valid_Hreagrreo',iparms:[]");
      setEventMetadata("VALID_HREAGRREO",",oparms:[]}");
      setEventMetadata("VALID_HREAGRPAR","{handler:'valid_Hreagrpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A4498HreAgrReo',fld:'HREAGRREO',pic:'9'},{av:'A4499HreAgrPar',fld:'HREAGRPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HREAGRPAR",",oparms:[{av:'A4500HreAgrKgm',fld:'HREAGRKGM',pic:'ZZZZZ9.99'},{av:'A4501HreAgrMtr',fld:'HREAGRMTR',pic:'ZZZZZ9.99'},{av:'A4502HreAgrPie',fld:'HREAGRPIE',pic:'ZZZ9'},{av:'A4503HreAgrCli',fld:'HREAGRCLI',pic:'ZZZZZ9'},{av:'A4504HreAgrSer',fld:'HREAGRSER',pic:''},{av:'A4505HreAgrDsc',fld:'HREAGRDSC',pic:''},{av:'A4506HreAgrCol',fld:'HREAGRCOL',pic:''},{av:'A4507HreAgrNumC',fld:'HREAGRNUMC',pic:'ZZZZZ9'},{av:'A13894HreAgrNHdr',fld:'HREAGRNHDR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4492HreBarCod'},{av:'Z4493HreBarReo'},{av:'Z4494HreBarPar'},{av:'Z4495HreNumCie'},{av:'Z4497HreAgrCod'},{av:'Z4498HreAgrReo'},{av:'Z4499HreAgrPar'},{av:'Z4500HreAgrKgm'},{av:'Z4501HreAgrMtr'},{av:'Z4502HreAgrPie'},{av:'Z4503HreAgrCli'},{av:'Z4504HreAgrSer'},{av:'Z4505HreAgrDsc'},{av:'Z4506HreAgrCol'},{av:'Z4507HreAgrNumC'},{av:'Z13894HreAgrNHdr'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4494HreBarPar = "" ;
      Z4499HreAgrPar = "" ;
      Z4500HreAgrKgm = DecimalUtil.ZERO ;
      Z4501HreAgrMtr = DecimalUtil.ZERO ;
      Z4504HreAgrSer = "" ;
      Z4505HreAgrDsc = "" ;
      Z4506HreAgrCol = "" ;
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
      A4499HreAgrPar = "" ;
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      A4501HreAgrMtr = DecimalUtil.ZERO ;
      A4504HreAgrSer = "" ;
      A4505HreAgrDsc = "" ;
      A4506HreAgrCol = "" ;
      A13894HreAgrNHdr = "" ;
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
      T01R65_A4497HreAgrCod = new int[1] ;
      T01R65_A4498HreAgrReo = new byte[1] ;
      T01R65_A4499HreAgrPar = new String[] {""} ;
      T01R65_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R65_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R65_A4502HreAgrPie = new short[1] ;
      T01R65_A4503HreAgrCli = new int[1] ;
      T01R65_A4504HreAgrSer = new String[] {""} ;
      T01R65_A4505HreAgrDsc = new String[] {""} ;
      T01R65_A4506HreAgrCol = new String[] {""} ;
      T01R65_A4507HreAgrNumC = new int[1] ;
      T01R65_A396EmprCod = new String[] {""} ;
      T01R65_A4492HreBarCod = new int[1] ;
      T01R65_A4493HreBarReo = new byte[1] ;
      T01R65_A4494HreBarPar = new String[] {""} ;
      T01R65_A4495HreNumCie = new byte[1] ;
      T01R64_A396EmprCod = new String[] {""} ;
      T01R66_A396EmprCod = new String[] {""} ;
      T01R67_A396EmprCod = new String[] {""} ;
      T01R67_A4492HreBarCod = new int[1] ;
      T01R67_A4493HreBarReo = new byte[1] ;
      T01R67_A4494HreBarPar = new String[] {""} ;
      T01R67_A4495HreNumCie = new byte[1] ;
      T01R67_A4497HreAgrCod = new int[1] ;
      T01R67_A4498HreAgrReo = new byte[1] ;
      T01R67_A4499HreAgrPar = new String[] {""} ;
      T01R63_A4497HreAgrCod = new int[1] ;
      T01R63_A4498HreAgrReo = new byte[1] ;
      T01R63_A4499HreAgrPar = new String[] {""} ;
      T01R63_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R63_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R63_A4502HreAgrPie = new short[1] ;
      T01R63_A4503HreAgrCli = new int[1] ;
      T01R63_A4504HreAgrSer = new String[] {""} ;
      T01R63_A4505HreAgrDsc = new String[] {""} ;
      T01R63_A4506HreAgrCol = new String[] {""} ;
      T01R63_A4507HreAgrNumC = new int[1] ;
      T01R63_A396EmprCod = new String[] {""} ;
      T01R63_A4492HreBarCod = new int[1] ;
      T01R63_A4493HreBarReo = new byte[1] ;
      T01R63_A4494HreBarPar = new String[] {""} ;
      T01R63_A4495HreNumCie = new byte[1] ;
      sMode676 = "" ;
      T01R68_A396EmprCod = new String[] {""} ;
      T01R68_A4492HreBarCod = new int[1] ;
      T01R68_A4493HreBarReo = new byte[1] ;
      T01R68_A4494HreBarPar = new String[] {""} ;
      T01R68_A4495HreNumCie = new byte[1] ;
      T01R68_A4497HreAgrCod = new int[1] ;
      T01R68_A4498HreAgrReo = new byte[1] ;
      T01R68_A4499HreAgrPar = new String[] {""} ;
      T01R69_A396EmprCod = new String[] {""} ;
      T01R69_A4492HreBarCod = new int[1] ;
      T01R69_A4493HreBarReo = new byte[1] ;
      T01R69_A4494HreBarPar = new String[] {""} ;
      T01R69_A4495HreNumCie = new byte[1] ;
      T01R69_A4497HreAgrCod = new int[1] ;
      T01R69_A4498HreAgrReo = new byte[1] ;
      T01R69_A4499HreAgrPar = new String[] {""} ;
      T01R62_A4497HreAgrCod = new int[1] ;
      T01R62_A4498HreAgrReo = new byte[1] ;
      T01R62_A4499HreAgrPar = new String[] {""} ;
      T01R62_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R62_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R62_A4502HreAgrPie = new short[1] ;
      T01R62_A4503HreAgrCli = new int[1] ;
      T01R62_A4504HreAgrSer = new String[] {""} ;
      T01R62_A4505HreAgrDsc = new String[] {""} ;
      T01R62_A4506HreAgrCol = new String[] {""} ;
      T01R62_A4507HreAgrNumC = new int[1] ;
      T01R62_A396EmprCod = new String[] {""} ;
      T01R62_A4492HreBarCod = new int[1] ;
      T01R62_A4493HreBarReo = new byte[1] ;
      T01R62_A4494HreBarPar = new String[] {""} ;
      T01R62_A4495HreNumCie = new byte[1] ;
      T01R613_A396EmprCod = new String[] {""} ;
      T01R613_A4492HreBarCod = new int[1] ;
      T01R613_A4493HreBarReo = new byte[1] ;
      T01R613_A4494HreBarPar = new String[] {""} ;
      T01R613_A4495HreNumCie = new byte[1] ;
      T01R613_A4497HreAgrCod = new int[1] ;
      T01R613_A4498HreAgrReo = new byte[1] ;
      T01R613_A4499HreAgrPar = new String[] {""} ;
      T01R613_A14085HreAgrTraI = new String[] {""} ;
      T01R614_A396EmprCod = new String[] {""} ;
      T01R614_A4492HreBarCod = new int[1] ;
      T01R614_A4493HreBarReo = new byte[1] ;
      T01R614_A4494HreBarPar = new String[] {""} ;
      T01R614_A4495HreNumCie = new byte[1] ;
      T01R614_A4497HreAgrCod = new int[1] ;
      T01R614_A4498HreAgrReo = new byte[1] ;
      T01R614_A4499HreAgrPar = new String[] {""} ;
      T01R614_A14081HreAgrNmId = new String[] {""} ;
      T01R615_A396EmprCod = new String[] {""} ;
      T01R615_A4492HreBarCod = new int[1] ;
      T01R615_A4493HreBarReo = new byte[1] ;
      T01R615_A4494HreBarPar = new String[] {""} ;
      T01R615_A4495HreNumCie = new byte[1] ;
      T01R615_A4497HreAgrCod = new int[1] ;
      T01R615_A4498HreAgrReo = new byte[1] ;
      T01R615_A4499HreAgrPar = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01R616_A396EmprCod = new String[] {""} ;
      Z13894HreAgrNHdr = "" ;
      ZZ396EmprCod = "" ;
      ZZ4494HreBarPar = "" ;
      ZZ4499HreAgrPar = "" ;
      ZZ4500HreAgrKgm = DecimalUtil.ZERO ;
      ZZ4501HreAgrMtr = DecimalUtil.ZERO ;
      ZZ4504HreAgrSer = "" ;
      ZZ4505HreAgrDsc = "" ;
      ZZ4506HreAgrCol = "" ;
      ZZ13894HreAgrNHdr = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.hisrag__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.hisrag__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.hisrag__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.hisrag__default(),
         new Object[] {
             new Object[] {
            T01R62_A4497HreAgrCod, T01R62_A4498HreAgrReo, T01R62_A4499HreAgrPar, T01R62_A4500HreAgrKgm, T01R62_A4501HreAgrMtr, T01R62_A4502HreAgrPie, T01R62_A4503HreAgrCli, T01R62_A4504HreAgrSer, T01R62_A4505HreAgrDsc, T01R62_A4506HreAgrCol,
            T01R62_A4507HreAgrNumC, T01R62_A396EmprCod, T01R62_A4492HreBarCod, T01R62_A4493HreBarReo, T01R62_A4494HreBarPar, T01R62_A4495HreNumCie
            }
            , new Object[] {
            T01R63_A4497HreAgrCod, T01R63_A4498HreAgrReo, T01R63_A4499HreAgrPar, T01R63_A4500HreAgrKgm, T01R63_A4501HreAgrMtr, T01R63_A4502HreAgrPie, T01R63_A4503HreAgrCli, T01R63_A4504HreAgrSer, T01R63_A4505HreAgrDsc, T01R63_A4506HreAgrCol,
            T01R63_A4507HreAgrNumC, T01R63_A396EmprCod, T01R63_A4492HreBarCod, T01R63_A4493HreBarReo, T01R63_A4494HreBarPar, T01R63_A4495HreNumCie
            }
            , new Object[] {
            T01R64_A396EmprCod
            }
            , new Object[] {
            T01R65_A4497HreAgrCod, T01R65_A4498HreAgrReo, T01R65_A4499HreAgrPar, T01R65_A4500HreAgrKgm, T01R65_A4501HreAgrMtr, T01R65_A4502HreAgrPie, T01R65_A4503HreAgrCli, T01R65_A4504HreAgrSer, T01R65_A4505HreAgrDsc, T01R65_A4506HreAgrCol,
            T01R65_A4507HreAgrNumC, T01R65_A396EmprCod, T01R65_A4492HreBarCod, T01R65_A4493HreBarReo, T01R65_A4494HreBarPar, T01R65_A4495HreNumCie
            }
            , new Object[] {
            T01R66_A396EmprCod
            }
            , new Object[] {
            T01R67_A396EmprCod, T01R67_A4492HreBarCod, T01R67_A4493HreBarReo, T01R67_A4494HreBarPar, T01R67_A4495HreNumCie, T01R67_A4497HreAgrCod, T01R67_A4498HreAgrReo, T01R67_A4499HreAgrPar
            }
            , new Object[] {
            T01R68_A396EmprCod, T01R68_A4492HreBarCod, T01R68_A4493HreBarReo, T01R68_A4494HreBarPar, T01R68_A4495HreNumCie, T01R68_A4497HreAgrCod, T01R68_A4498HreAgrReo, T01R68_A4499HreAgrPar
            }
            , new Object[] {
            T01R69_A396EmprCod, T01R69_A4492HreBarCod, T01R69_A4493HreBarReo, T01R69_A4494HreBarPar, T01R69_A4495HreNumCie, T01R69_A4497HreAgrCod, T01R69_A4498HreAgrReo, T01R69_A4499HreAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01R613_A396EmprCod, T01R613_A4492HreBarCod, T01R613_A4493HreBarReo, T01R613_A4494HreBarPar, T01R613_A4495HreNumCie, T01R613_A4497HreAgrCod, T01R613_A4498HreAgrReo, T01R613_A4499HreAgrPar, T01R613_A14085HreAgrTraI
            }
            , new Object[] {
            T01R614_A396EmprCod, T01R614_A4492HreBarCod, T01R614_A4493HreBarReo, T01R614_A4494HreBarPar, T01R614_A4495HreNumCie, T01R614_A4497HreAgrCod, T01R614_A4498HreAgrReo, T01R614_A4499HreAgrPar, T01R614_A14081HreAgrNmId
            }
            , new Object[] {
            T01R615_A396EmprCod, T01R615_A4492HreBarCod, T01R615_A4493HreBarReo, T01R615_A4494HreBarPar, T01R615_A4495HreNumCie, T01R615_A4497HreAgrCod, T01R615_A4498HreAgrReo, T01R615_A4499HreAgrPar
            }
            , new Object[] {
            T01R616_A396EmprCod
            }
         }
      );
   }

   private byte Z4493HreBarReo ;
   private byte Z4495HreNumCie ;
   private byte Z4498HreAgrReo ;
   private byte GxWebError ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte nKeyPressed ;
   private byte A4498HreAgrReo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ4493HreBarReo ;
   private byte ZZ4495HreNumCie ;
   private byte ZZ4498HreAgrReo ;
   private short Z4502HreAgrPie ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4502HreAgrPie ;
   private short RcdFound676 ;
   private short nIsDirty_676 ;
   private short ZZ4502HreAgrPie ;
   private int Z4492HreBarCod ;
   private int Z4497HreAgrCod ;
   private int Z4503HreAgrCli ;
   private int Z4507HreAgrNumC ;
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
   private int A4497HreAgrCod ;
   private int edtHreAgrCod_Enabled ;
   private int edtHreAgrReo_Enabled ;
   private int edtHreAgrPar_Enabled ;
   private int edtHreAgrKgm_Enabled ;
   private int edtHreAgrMtr_Enabled ;
   private int edtHreAgrPie_Enabled ;
   private int A4503HreAgrCli ;
   private int edtHreAgrCli_Enabled ;
   private int edtHreAgrSer_Enabled ;
   private int edtHreAgrDsc_Enabled ;
   private int edtHreAgrCol_Enabled ;
   private int A4507HreAgrNumC ;
   private int edtHreAgrNumC_Enabled ;
   private int edtHreAgrNHdr_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ4492HreBarCod ;
   private int ZZ4497HreAgrCod ;
   private int ZZ4503HreAgrCli ;
   private int ZZ4507HreAgrNumC ;
   private java.math.BigDecimal Z4500HreAgrKgm ;
   private java.math.BigDecimal Z4501HreAgrMtr ;
   private java.math.BigDecimal A4500HreAgrKgm ;
   private java.math.BigDecimal A4501HreAgrMtr ;
   private java.math.BigDecimal ZZ4500HreAgrKgm ;
   private java.math.BigDecimal ZZ4501HreAgrMtr ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4494HreBarPar ;
   private String Z4499HreAgrPar ;
   private String Z4504HreAgrSer ;
   private String Z4505HreAgrDsc ;
   private String Z4506HreAgrCol ;
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
   private String edtHreAgrCod_Internalname ;
   private String edtHreAgrCod_Jsonclick ;
   private String edtHreAgrReo_Internalname ;
   private String edtHreAgrReo_Jsonclick ;
   private String edtHreAgrPar_Internalname ;
   private String A4499HreAgrPar ;
   private String edtHreAgrPar_Jsonclick ;
   private String edtHreAgrKgm_Internalname ;
   private String edtHreAgrKgm_Jsonclick ;
   private String edtHreAgrMtr_Internalname ;
   private String edtHreAgrMtr_Jsonclick ;
   private String edtHreAgrPie_Internalname ;
   private String edtHreAgrPie_Jsonclick ;
   private String edtHreAgrCli_Internalname ;
   private String edtHreAgrCli_Jsonclick ;
   private String edtHreAgrSer_Internalname ;
   private String A4504HreAgrSer ;
   private String edtHreAgrSer_Jsonclick ;
   private String edtHreAgrDsc_Internalname ;
   private String A4505HreAgrDsc ;
   private String edtHreAgrDsc_Jsonclick ;
   private String edtHreAgrCol_Internalname ;
   private String A4506HreAgrCol ;
   private String edtHreAgrCol_Jsonclick ;
   private String edtHreAgrNumC_Internalname ;
   private String edtHreAgrNumC_Jsonclick ;
   private String edtHreAgrNHdr_Internalname ;
   private String A13894HreAgrNHdr ;
   private String edtHreAgrNHdr_Jsonclick ;
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
   private String sMode676 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z13894HreAgrNHdr ;
   private String ZZ396EmprCod ;
   private String ZZ4494HreBarPar ;
   private String ZZ4499HreAgrPar ;
   private String ZZ4504HreAgrSer ;
   private String ZZ4505HreAgrDsc ;
   private String ZZ4506HreAgrCol ;
   private String ZZ13894HreAgrNHdr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private int[] T01R65_A4497HreAgrCod ;
   private byte[] T01R65_A4498HreAgrReo ;
   private String[] T01R65_A4499HreAgrPar ;
   private java.math.BigDecimal[] T01R65_A4500HreAgrKgm ;
   private java.math.BigDecimal[] T01R65_A4501HreAgrMtr ;
   private short[] T01R65_A4502HreAgrPie ;
   private int[] T01R65_A4503HreAgrCli ;
   private String[] T01R65_A4504HreAgrSer ;
   private String[] T01R65_A4505HreAgrDsc ;
   private String[] T01R65_A4506HreAgrCol ;
   private int[] T01R65_A4507HreAgrNumC ;
   private String[] T01R65_A396EmprCod ;
   private int[] T01R65_A4492HreBarCod ;
   private byte[] T01R65_A4493HreBarReo ;
   private String[] T01R65_A4494HreBarPar ;
   private byte[] T01R65_A4495HreNumCie ;
   private String[] T01R64_A396EmprCod ;
   private String[] T01R66_A396EmprCod ;
   private String[] T01R67_A396EmprCod ;
   private int[] T01R67_A4492HreBarCod ;
   private byte[] T01R67_A4493HreBarReo ;
   private String[] T01R67_A4494HreBarPar ;
   private byte[] T01R67_A4495HreNumCie ;
   private int[] T01R67_A4497HreAgrCod ;
   private byte[] T01R67_A4498HreAgrReo ;
   private String[] T01R67_A4499HreAgrPar ;
   private int[] T01R63_A4497HreAgrCod ;
   private byte[] T01R63_A4498HreAgrReo ;
   private String[] T01R63_A4499HreAgrPar ;
   private java.math.BigDecimal[] T01R63_A4500HreAgrKgm ;
   private java.math.BigDecimal[] T01R63_A4501HreAgrMtr ;
   private short[] T01R63_A4502HreAgrPie ;
   private int[] T01R63_A4503HreAgrCli ;
   private String[] T01R63_A4504HreAgrSer ;
   private String[] T01R63_A4505HreAgrDsc ;
   private String[] T01R63_A4506HreAgrCol ;
   private int[] T01R63_A4507HreAgrNumC ;
   private String[] T01R63_A396EmprCod ;
   private int[] T01R63_A4492HreBarCod ;
   private byte[] T01R63_A4493HreBarReo ;
   private String[] T01R63_A4494HreBarPar ;
   private byte[] T01R63_A4495HreNumCie ;
   private String[] T01R68_A396EmprCod ;
   private int[] T01R68_A4492HreBarCod ;
   private byte[] T01R68_A4493HreBarReo ;
   private String[] T01R68_A4494HreBarPar ;
   private byte[] T01R68_A4495HreNumCie ;
   private int[] T01R68_A4497HreAgrCod ;
   private byte[] T01R68_A4498HreAgrReo ;
   private String[] T01R68_A4499HreAgrPar ;
   private String[] T01R69_A396EmprCod ;
   private int[] T01R69_A4492HreBarCod ;
   private byte[] T01R69_A4493HreBarReo ;
   private String[] T01R69_A4494HreBarPar ;
   private byte[] T01R69_A4495HreNumCie ;
   private int[] T01R69_A4497HreAgrCod ;
   private byte[] T01R69_A4498HreAgrReo ;
   private String[] T01R69_A4499HreAgrPar ;
   private int[] T01R62_A4497HreAgrCod ;
   private byte[] T01R62_A4498HreAgrReo ;
   private String[] T01R62_A4499HreAgrPar ;
   private java.math.BigDecimal[] T01R62_A4500HreAgrKgm ;
   private java.math.BigDecimal[] T01R62_A4501HreAgrMtr ;
   private short[] T01R62_A4502HreAgrPie ;
   private int[] T01R62_A4503HreAgrCli ;
   private String[] T01R62_A4504HreAgrSer ;
   private String[] T01R62_A4505HreAgrDsc ;
   private String[] T01R62_A4506HreAgrCol ;
   private int[] T01R62_A4507HreAgrNumC ;
   private String[] T01R62_A396EmprCod ;
   private int[] T01R62_A4492HreBarCod ;
   private byte[] T01R62_A4493HreBarReo ;
   private String[] T01R62_A4494HreBarPar ;
   private byte[] T01R62_A4495HreNumCie ;
   private String[] T01R613_A396EmprCod ;
   private int[] T01R613_A4492HreBarCod ;
   private byte[] T01R613_A4493HreBarReo ;
   private String[] T01R613_A4494HreBarPar ;
   private byte[] T01R613_A4495HreNumCie ;
   private int[] T01R613_A4497HreAgrCod ;
   private byte[] T01R613_A4498HreAgrReo ;
   private String[] T01R613_A4499HreAgrPar ;
   private String[] T01R613_A14085HreAgrTraI ;
   private String[] T01R614_A396EmprCod ;
   private int[] T01R614_A4492HreBarCod ;
   private byte[] T01R614_A4493HreBarReo ;
   private String[] T01R614_A4494HreBarPar ;
   private byte[] T01R614_A4495HreNumCie ;
   private int[] T01R614_A4497HreAgrCod ;
   private byte[] T01R614_A4498HreAgrReo ;
   private String[] T01R614_A4499HreAgrPar ;
   private String[] T01R614_A14081HreAgrNmId ;
   private String[] T01R615_A396EmprCod ;
   private int[] T01R615_A4492HreBarCod ;
   private byte[] T01R615_A4493HreBarReo ;
   private String[] T01R615_A4494HreBarPar ;
   private byte[] T01R615_A4495HreNumCie ;
   private int[] T01R615_A4497HreAgrCod ;
   private byte[] T01R615_A4498HreAgrReo ;
   private String[] T01R615_A4499HreAgrPar ;
   private String[] T01R616_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class hisrag__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hisrag__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hisrag__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hisrag__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01R62", "SELECT HreAgrCod, HreAgrReo, HreAgrPar, HreAgrKgm, HreAgrMtr, HreAgrPie, HreAgrCli, HreAgrSer, HreAgrDsc, HreAgrCol, HreAgrNumC, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISRAG WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAgrCod = ? AND HreAgrReo = ? AND HreAgrPar = ?  FOR UPDATE OF HreAgrKgm, HreAgrMtr, HreAgrPie, HreAgrCli, HreAgrSer, HreAgrDsc, HreAgrCol, HreAgrNumC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R63", "SELECT HreAgrCod, HreAgrReo, HreAgrPar, HreAgrKgm, HreAgrMtr, HreAgrPie, HreAgrCli, HreAgrSer, HreAgrDsc, HreAgrCol, HreAgrNumC, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISRAG WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAgrCod = ? AND HreAgrReo = ? AND HreAgrPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R64", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R65", "SELECT /*+ FIRST_ROWS(100) */ TM1.HreAgrCod, TM1.HreAgrReo, TM1.HreAgrPar, TM1.HreAgrKgm, TM1.HreAgrMtr, TM1.HreAgrPie, TM1.HreAgrCli, TM1.HreAgrSer, TM1.HreAgrDsc, TM1.HreAgrCol, TM1.HreAgrNumC, TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie FROM TXPHISRAG TM1 WHERE TM1.EmprCod = ? and TM1.HreBarCod = ? and TM1.HreBarReo = ? and TM1.HreBarPar = ? and TM1.HreNumCie = ? and TM1.HreAgrCod = ? and TM1.HreAgrReo = ? and TM1.HreAgrPar = ? ORDER BY TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie, TM1.HreAgrCod, TM1.HreAgrReo, TM1.HreAgrPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R66", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R67", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar FROM TXPHISRAG WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAgrCod = ? AND HreAgrReo = ? AND HreAgrPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R68", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar FROM TXPHISRAG WHERE ( EmprCod > ? or EmprCod = ? and HreBarCod > ? or HreBarCod = ? and EmprCod = ? and HreBarReo > ? or HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreBarPar > ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreNumCie > ? or HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreAgrCod > ? or HreAgrCod = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreAgrReo > ? or HreAgrReo = ? and HreAgrCod = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreAgrPar > ?) ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01R69", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar FROM TXPHISRAG WHERE ( EmprCod < ? or EmprCod = ? and HreBarCod < ? or HreBarCod = ? and EmprCod = ? and HreBarReo < ? or HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreBarPar < ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreNumCie < ? or HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreAgrCod < ? or HreAgrCod = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreAgrReo < ? or HreAgrReo = ? and HreAgrCod = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreAgrPar < ?) ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreAgrCod DESC, HreAgrReo DESC, HreAgrPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01R610", "INSERT INTO TXPHISRAG(HreAgrCod, HreAgrReo, HreAgrPar, HreAgrKgm, HreAgrMtr, HreAgrPie, HreAgrCli, HreAgrSer, HreAgrDsc, HreAgrCol, HreAgrNumC, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHISRAG")
         ,new UpdateCursor("T01R611", "UPDATE TXPHISRAG SET HreAgrKgm=?, HreAgrMtr=?, HreAgrPie=?, HreAgrCli=?, HreAgrSer=?, HreAgrDsc=?, HreAgrCol=?, HreAgrNumC=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAgrCod = ? AND HreAgrReo = ? AND HreAgrPar = ?", GX_NOMASK, "TXPHISRAG")
         ,new UpdateCursor("T01R612", "DELETE FROM TXPHISRAG  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAgrCod = ? AND HreAgrReo = ? AND HreAgrPar = ?", GX_NOMASK, "TXPHISRAG")
         ,new ForEachCursor("T01R613", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar, HreAgrTraI FROM TXPHISRA2 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAgrCod = ? AND HreAgrReo = ? AND HreAgrPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01R614", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar, HreAgrNmId FROM TXPHISRA1 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAgrCod = ? AND HreAgrReo = ? AND HreAgrPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01R615", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar FROM TXPHISRAG ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R616", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
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
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 14 :
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
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 26);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 3);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               return;
            case 9 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 26);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 1);
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
            case 11 :
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
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

