package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hisre2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridhisre2_normas") == 0 )
      {
         gxnrgridhisre2_normas_newrow_invoke( ) ;
         return  ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISRE2", ""), (short)(0)) ;
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

   public void gxnrgridhisre2_normas_newrow_invoke( )
   {
      nRC_GXsfl_73 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_73"))) ;
      nGXsfl_73_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_73_idx"))) ;
      sGXsfl_73_idx = httpContext.GetPar( "sGXsfl_73_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridhisre2_normas_newrow( ) ;
      /* End function gxnrGridhisre2_normas_newrow_invoke */
   }

   public hisre2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hisre2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hisre2_impl.class ));
   }

   public hisre2_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "HISRE2", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_HISRE2.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISRE2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISRE2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISRE2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISRE2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_HISRE2.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISRE2.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISRE2.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISRE2.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarPar_Internalname, GXutil.rtrim( A4494HreBarPar), GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISRE2.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumCie_Internalname, GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumCie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumCie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreNumCie_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISRE2.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HISRE2.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLinMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLinMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLinMaq_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHreLinMaq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HISRE2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divNormastable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlenormas_Internalname, httpContext.getMessage( "Normas", ""), "", "", lblTitlenormas_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_HISRE2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridhisre2_normas( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISRE2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISRE2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HISRE2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridhisre2_normas( )
   {
      /*  Grid Control  */
      startgridcontrol73( ) ;
      nGXsfl_73_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1901 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1901 = (short)(1) ;
            scanStart1U41901( ) ;
            while ( RcdFound1901 != 0 )
            {
               init_level_properties1901( ) ;
               getByPrimaryKey1U41901( ) ;
               addRow1U41901( ) ;
               scanNext1U41901( ) ;
            }
            scanEnd1U41901( ) ;
            nBlankRcdCount1901 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1U41901( ) ;
         standaloneModal1U41901( ) ;
         sMode1901 = Gx_mode ;
         while ( nGXsfl_73_idx < nRC_GXsfl_73 )
         {
            bGXsfl_73_Refreshing = true ;
            readRow1U41901( ) ;
            edtHreNormId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENORMID_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNormId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNormId_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtHreNormDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENORMDSC_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNormDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNormDsc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtHreNormSt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENORMST_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNormSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNormSt_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtHreNormNc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENORMNC_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNormNc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNormNc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            if ( ( nRcdExists_1901 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1U41901( ) ;
            }
            sendRow1U41901( ) ;
            bGXsfl_73_Refreshing = false ;
         }
         Gx_mode = sMode1901 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1901 = (short)(5) ;
         nRcdExists_1901 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1U41901( ) ;
            while ( RcdFound1901 != 0 )
            {
               sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_731901( ) ;
               init_level_properties1901( ) ;
               standaloneNotModal1U41901( ) ;
               getByPrimaryKey1U41901( ) ;
               standaloneModal1U41901( ) ;
               addRow1U41901( ) ;
               scanNext1U41901( ) ;
            }
            scanEnd1U41901( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1901 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_731901( ) ;
      initAll1U41901( ) ;
      init_level_properties1901( ) ;
      nRcdExists_1901 = (short)(0) ;
      nIsMod_1901 = (short)(0) ;
      nRcdDeleted_1901 = (short)(0) ;
      nBlankRcdCount1901 = (short)(nBlankRcdUsr1901+nBlankRcdCount1901) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1901 > 0 )
      {
         standaloneNotModal1U41901( ) ;
         standaloneModal1U41901( ) ;
         addRow1U41901( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHreNormId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1901 = (short)(nBlankRcdCount1901-1) ;
      }
      Gx_mode = sMode1901 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridhisre2_normasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridhisre2_normas", Gridhisre2_normasContainer, subGridhisre2_normas_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridhisre2_normasContainerData", Gridhisre2_normasContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridhisre2_normasContainerData"+"V", Gridhisre2_normasContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridhisre2_normasContainerData"+"V"+"\" value='"+Gridhisre2_normasContainer.GridValuesHidden()+"'/>") ;
      }
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
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_73 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_73"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
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
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
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
            initAll1U4678( ) ;
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
      disableAttributes1U4678( ) ;
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

   public void confirm_1U41901( )
   {
      nGXsfl_73_idx = 0 ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         readRow1U41901( ) ;
         if ( ( nRcdExists_1901 != 0 ) || ( nIsMod_1901 != 0 ) )
         {
            getKey1U41901( ) ;
            if ( ( nRcdExists_1901 == 0 ) && ( nRcdDeleted_1901 == 0 ) )
            {
               if ( RcdFound1901 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1U41901( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1U41901( ) ;
                     closeExtendedTableCursors1U41901( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "HRENORMID_" + sGXsfl_73_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHreNormId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1901 != 0 )
               {
                  if ( nRcdDeleted_1901 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1U41901( ) ;
                     load1U41901( ) ;
                     beforeValidate1U41901( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1U41901( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1901 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1U41901( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1U41901( ) ;
                           closeExtendedTableCursors1U41901( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1901 == 0 )
                  {
                     GXCCtl = "HRENORMID_" + sGXsfl_73_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHreNormId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtHreNormId_Internalname, GXutil.rtrim( A14278HreNormId)) ;
         httpContext.changePostValue( edtHreNormDsc_Internalname, GXutil.rtrim( A14279HreNormDsc)) ;
         httpContext.changePostValue( edtHreNormSt_Internalname, GXutil.rtrim( A14280HreNormSt)) ;
         httpContext.changePostValue( edtHreNormNc_Internalname, GXutil.rtrim( A14281HreNormNc)) ;
         httpContext.changePostValue( "ZT_"+"Z14278HreNormId_"+sGXsfl_73_idx, GXutil.rtrim( Z14278HreNormId)) ;
         httpContext.changePostValue( "ZT_"+"Z14279HreNormDsc_"+sGXsfl_73_idx, GXutil.rtrim( Z14279HreNormDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z14280HreNormSt_"+sGXsfl_73_idx, GXutil.rtrim( Z14280HreNormSt)) ;
         httpContext.changePostValue( "ZT_"+"Z14281HreNormNc_"+sGXsfl_73_idx, GXutil.rtrim( Z14281HreNormNc)) ;
         httpContext.changePostValue( "nRcdDeleted_1901_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1901, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1901_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1901, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1901_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1901, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1901 != 0 )
         {
            httpContext.changePostValue( "HRENORMID_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENORMDSC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENORMST_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormSt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENORMNC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormNc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1U40( )
   {
   }

   public void zm1U4678( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -1 )
      {
         Z4545HreLinMaq = A4545HreLinMaq ;
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z407EmprNom = A407EmprNom ;
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

   public void load1U4678( )
   {
      /* Using cursor T01U48 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound678 = (short)(1) ;
         A407EmprNom = T01U48_A407EmprNom[0] ;
         n407EmprNom = T01U48_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1U4678( -1) ;
      }
      pr_default.close(6);
      onLoadActions1U4678( ) ;
   }

   public void onLoadActions1U4678( )
   {
   }

   public void checkExtendedTable1U4678( )
   {
      nIsDirty_678 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01U46 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01U46_A407EmprNom[0] ;
      n407EmprNom = T01U46_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01U47 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1U4678( )
   {
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01U49 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01U49_A407EmprNom[0] ;
      n407EmprNom = T01U49_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
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
                         int A4492HreBarCod ,
                         byte A4493HreBarReo ,
                         String A4494HreBarPar ,
                         byte A4495HreNumCie )
   {
      /* Using cursor T01U410 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1U4678( )
   {
      /* Using cursor T01U411 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound678 = (short)(1) ;
      }
      else
      {
         RcdFound678 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01U45 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1U4678( 1) ;
         RcdFound678 = (short)(1) ;
         A4545HreLinMaq = T01U45_A4545HreLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
         A396EmprCod = T01U45_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T01U45_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T01U45_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T01U45_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T01U45_A4495HreNumCie[0] ;
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
         load1U4678( ) ;
         if ( AnyError == 1 )
         {
            RcdFound678 = (short)(0) ;
            initializeNonKey1U4678( ) ;
         }
         Gx_mode = sMode678 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound678 = (short)(0) ;
         initializeNonKey1U4678( ) ;
         sMode678 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode678 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1U4678( ) ;
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
      /* Using cursor T01U412 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4495HreNumCie), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01U412_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01U412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U412_A4492HreBarCod[0] < A4492HreBarCod ) || ( T01U412_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U412_A4493HreBarReo[0] < A4493HreBarReo ) || ( T01U412_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01U412_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U412_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01U412_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T01U412_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01U412_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01U412_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U412_A4495HreNumCie[0] < A4495HreNumCie ) || ( T01U412_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01U412_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01U412_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01U412_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U412_A4545HreLinMaq[0] < A4545HreLinMaq ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01U412_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01U412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U412_A4492HreBarCod[0] > A4492HreBarCod ) || ( T01U412_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U412_A4493HreBarReo[0] > A4493HreBarReo ) || ( T01U412_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01U412_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U412_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01U412_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T01U412_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01U412_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01U412_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U412_A4495HreNumCie[0] > A4495HreNumCie ) || ( T01U412_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01U412_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01U412_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01U412_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U412_A4545HreLinMaq[0] > A4545HreLinMaq ) ) )
         {
            A396EmprCod = T01U412_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4492HreBarCod = T01U412_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T01U412_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T01U412_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T01U412_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A4545HreLinMaq = T01U412_A4545HreLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
            RcdFound678 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound678 = (short)(0) ;
      /* Using cursor T01U413 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4495HreNumCie), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01U413_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01U413_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U413_A4492HreBarCod[0] > A4492HreBarCod ) || ( T01U413_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U413_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U413_A4493HreBarReo[0] > A4493HreBarReo ) || ( T01U413_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01U413_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U413_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01U413_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T01U413_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01U413_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01U413_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U413_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U413_A4495HreNumCie[0] > A4495HreNumCie ) || ( T01U413_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01U413_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01U413_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01U413_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U413_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U413_A4545HreLinMaq[0] > A4545HreLinMaq ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01U413_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01U413_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U413_A4492HreBarCod[0] < A4492HreBarCod ) || ( T01U413_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U413_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U413_A4493HreBarReo[0] < A4493HreBarReo ) || ( T01U413_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01U413_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U413_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01U413_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T01U413_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01U413_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01U413_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U413_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U413_A4495HreNumCie[0] < A4495HreNumCie ) || ( T01U413_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T01U413_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01U413_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01U413_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01U413_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U413_A4545HreLinMaq[0] < A4545HreLinMaq ) ) )
         {
            A396EmprCod = T01U413_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4492HreBarCod = T01U413_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T01U413_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T01U413_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T01U413_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A4545HreLinMaq = T01U413_A4545HreLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
            RcdFound678 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1U4678( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1U4678( ) ;
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
               update1U4678( ) ;
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
               insert1U4678( ) ;
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
                  insert1U4678( ) ;
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
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1U4678( ) ;
      if ( RcdFound678 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1U4678( ) ;
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
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1U4678( ) ;
      if ( RcdFound678 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound678 != 0 )
         {
            scanNext1U4678( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1U4678( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1U4678( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01U44 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISREM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1U4678( )
   {
      beforeValidate1U4678( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1U4678( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1U4678( 0) ;
         checkOptimisticConcurrency1U4678( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1U4678( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1U4678( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01U414 */
                  pr_default.execute(12, new Object[] {Short.valueOf(A4545HreLinMaq), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevel1U4678( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1U40( ) ;
                        }
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
            load1U4678( ) ;
         }
         endLevel1U4678( ) ;
      }
      closeExtendedTableCursors1U4678( ) ;
   }

   public void update1U4678( )
   {
      beforeValidate1U4678( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1U4678( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1U4678( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1U4678( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1U4678( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPHISREM */
                  deferredUpdate1U4678( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1U4678( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1U40( ) ;
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
         }
         endLevel1U4678( ) ;
      }
      closeExtendedTableCursors1U4678( ) ;
   }

   public void deferredUpdate1U4678( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1U4678( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1U4678( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1U4678( ) ;
         afterConfirm1U4678( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1U4678( ) ;
            if ( AnyError == 0 )
            {
               scanStart1U41901( ) ;
               while ( RcdFound1901 != 0 )
               {
                  getByPrimaryKey1U41901( ) ;
                  delete1U41901( ) ;
                  scanNext1U41901( ) ;
               }
               scanEnd1U41901( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01U415 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
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
                           initAll1U4678( ) ;
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
                        resetCaption1U40( ) ;
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
      }
      sMode678 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1U4678( ) ;
      Gx_mode = sMode678 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1U4678( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01U416 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         A407EmprNom = T01U416_A407EmprNom[0] ;
         n407EmprNom = T01U416_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01U417 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01U418 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01U419 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void processNestedLevel1U41901( )
   {
      nGXsfl_73_idx = 0 ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         readRow1U41901( ) ;
         if ( ( nRcdExists_1901 != 0 ) || ( nIsMod_1901 != 0 ) )
         {
            standaloneNotModal1U41901( ) ;
            getKey1U41901( ) ;
            if ( ( nRcdExists_1901 == 0 ) && ( nRcdDeleted_1901 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1U41901( ) ;
            }
            else
            {
               if ( RcdFound1901 != 0 )
               {
                  if ( ( nRcdDeleted_1901 != 0 ) && ( nRcdExists_1901 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1U41901( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1901 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1U41901( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1901 == 0 )
                  {
                     GXCCtl = "HRENORMID_" + sGXsfl_73_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHreNormId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtHreNormId_Internalname, GXutil.rtrim( A14278HreNormId)) ;
         httpContext.changePostValue( edtHreNormDsc_Internalname, GXutil.rtrim( A14279HreNormDsc)) ;
         httpContext.changePostValue( edtHreNormSt_Internalname, GXutil.rtrim( A14280HreNormSt)) ;
         httpContext.changePostValue( edtHreNormNc_Internalname, GXutil.rtrim( A14281HreNormNc)) ;
         httpContext.changePostValue( "ZT_"+"Z14278HreNormId_"+sGXsfl_73_idx, GXutil.rtrim( Z14278HreNormId)) ;
         httpContext.changePostValue( "ZT_"+"Z14279HreNormDsc_"+sGXsfl_73_idx, GXutil.rtrim( Z14279HreNormDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z14280HreNormSt_"+sGXsfl_73_idx, GXutil.rtrim( Z14280HreNormSt)) ;
         httpContext.changePostValue( "ZT_"+"Z14281HreNormNc_"+sGXsfl_73_idx, GXutil.rtrim( Z14281HreNormNc)) ;
         httpContext.changePostValue( "nRcdDeleted_1901_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1901, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1901_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1901, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1901_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1901, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1901 != 0 )
         {
            httpContext.changePostValue( "HRENORMID_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENORMDSC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENORMST_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormSt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENORMNC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormNc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1U41901( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1901 = (short)(0) ;
      nIsMod_1901 = (short)(0) ;
      nRcdDeleted_1901 = (short)(0) ;
   }

   public void processLevel1U4678( )
   {
      /* Save parent mode. */
      sMode678 = Gx_mode ;
      processNestedLevel1U41901( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode678 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1U4678( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1U4678( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "hisre2");
         if ( AnyError == 0 )
         {
            confirmValues1U40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "hisre2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1U4678( )
   {
      /* Using cursor T01U420 */
      pr_default.execute(18);
      RcdFound678 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound678 = (short)(1) ;
         A396EmprCod = T01U420_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T01U420_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T01U420_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T01U420_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T01U420_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A4545HreLinMaq = T01U420_A4545HreLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1U4678( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound678 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound678 = (short)(1) ;
         A396EmprCod = T01U420_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T01U420_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T01U420_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T01U420_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T01U420_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A4545HreLinMaq = T01U420_A4545HreLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
      }
   }

   public void scanEnd1U4678( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1U4678( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1U4678( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1U4678( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1U4678( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1U4678( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1U4678( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1U4678( )
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
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtHreLinMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Enabled), 5, 0), true);
   }

   public void zm1U41901( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14279HreNormDsc = T01U43_A14279HreNormDsc[0] ;
            Z14280HreNormSt = T01U43_A14280HreNormSt[0] ;
            Z14281HreNormNc = T01U43_A14281HreNormNc[0] ;
         }
         else
         {
            Z14279HreNormDsc = A14279HreNormDsc ;
            Z14280HreNormSt = A14280HreNormSt ;
            Z14281HreNormNc = A14281HreNormNc ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4545HreLinMaq = A4545HreLinMaq ;
         Z14278HreNormId = A14278HreNormId ;
         Z14279HreNormDsc = A14279HreNormDsc ;
         Z14280HreNormSt = A14280HreNormSt ;
         Z14281HreNormNc = A14281HreNormNc ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1U41901( )
   {
   }

   public void standaloneModal1U41901( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHreNormId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreNormId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNormId_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      }
      else
      {
         edtHreNormId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreNormId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNormId_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      }
   }

   public void load1U41901( )
   {
      /* Using cursor T01U421 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), A14278HreNormId});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1901 = (short)(1) ;
         A14279HreNormDsc = T01U421_A14279HreNormDsc[0] ;
         A14280HreNormSt = T01U421_A14280HreNormSt[0] ;
         A14281HreNormNc = T01U421_A14281HreNormNc[0] ;
         zm1U41901( -4) ;
      }
      pr_default.close(19);
      onLoadActions1U41901( ) ;
   }

   public void onLoadActions1U41901( )
   {
   }

   public void checkExtendedTable1U41901( )
   {
      nIsDirty_1901 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1U41901( ) ;
   }

   public void closeExtendedTableCursors1U41901( )
   {
   }

   public void enableDisable1U41901( )
   {
   }

   public void getKey1U41901( )
   {
      /* Using cursor T01U422 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), A14278HreNormId});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1901 = (short)(1) ;
      }
      else
      {
         RcdFound1901 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1U41901( )
   {
      /* Using cursor T01U43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), A14278HreNormId});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1U41901( 4) ;
         RcdFound1901 = (short)(1) ;
         initializeNonKey1U41901( ) ;
         A14278HreNormId = T01U43_A14278HreNormId[0] ;
         A14279HreNormDsc = T01U43_A14279HreNormDsc[0] ;
         A14280HreNormSt = T01U43_A14280HreNormSt[0] ;
         A14281HreNormNc = T01U43_A14281HreNormNc[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4545HreLinMaq = A4545HreLinMaq ;
         Z14278HreNormId = A14278HreNormId ;
         sMode1901 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1U41901( ) ;
         load1U41901( ) ;
         Gx_mode = sMode1901 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1901 = (short)(0) ;
         initializeNonKey1U41901( ) ;
         sMode1901 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1U41901( ) ;
         Gx_mode = sMode1901 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1U41901( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1U41901( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01U42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), A14278HreNormId});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISRE2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14279HreNormDsc, T01U42_A14279HreNormDsc[0]) != 0 ) || ( GXutil.strcmp(Z14280HreNormSt, T01U42_A14280HreNormSt[0]) != 0 ) || ( GXutil.strcmp(Z14281HreNormNc, T01U42_A14281HreNormNc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z14279HreNormDsc, T01U42_A14279HreNormDsc[0]) != 0 )
            {
               GXutil.writeLogln("hisre2:[seudo value changed for attri]"+"HreNormDsc");
               GXutil.writeLogRaw("Old: ",Z14279HreNormDsc);
               GXutil.writeLogRaw("Current: ",T01U42_A14279HreNormDsc[0]);
            }
            if ( GXutil.strcmp(Z14280HreNormSt, T01U42_A14280HreNormSt[0]) != 0 )
            {
               GXutil.writeLogln("hisre2:[seudo value changed for attri]"+"HreNormSt");
               GXutil.writeLogRaw("Old: ",Z14280HreNormSt);
               GXutil.writeLogRaw("Current: ",T01U42_A14280HreNormSt[0]);
            }
            if ( GXutil.strcmp(Z14281HreNormNc, T01U42_A14281HreNormNc[0]) != 0 )
            {
               GXutil.writeLogln("hisre2:[seudo value changed for attri]"+"HreNormNc");
               GXutil.writeLogRaw("Old: ",Z14281HreNormNc);
               GXutil.writeLogRaw("Current: ",T01U42_A14281HreNormNc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISRE2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1U41901( )
   {
      beforeValidate1U41901( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1U41901( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1U41901( 0) ;
         checkOptimisticConcurrency1U41901( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1U41901( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1U41901( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01U423 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), A14278HreNormId, A14279HreNormDsc, A14280HreNormSt, A14281HreNormNc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISRE2");
                  if ( (pr_default.getStatus(21) == 1) )
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
            load1U41901( ) ;
         }
         endLevel1U41901( ) ;
      }
      closeExtendedTableCursors1U41901( ) ;
   }

   public void update1U41901( )
   {
      beforeValidate1U41901( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1U41901( ) ;
      }
      if ( ( nIsMod_1901 != 0 ) || ( nIsDirty_1901 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1U41901( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1U41901( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1U41901( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01U424 */
                     pr_default.execute(22, new Object[] {A14279HreNormDsc, A14280HreNormSt, A14281HreNormNc, A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), A14278HreNormId});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISRE2");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISRE2"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1U41901( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1U41901( ) ;
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
            endLevel1U41901( ) ;
         }
      }
      closeExtendedTableCursors1U41901( ) ;
   }

   public void deferredUpdate1U41901( )
   {
   }

   public void delete1U41901( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1U41901( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1U41901( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1U41901( ) ;
         afterConfirm1U41901( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1U41901( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01U425 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), A14278HreNormId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISRE2");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode1901 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1U41901( ) ;
      Gx_mode = sMode1901 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1U41901( )
   {
      standaloneModal1U41901( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1U41901( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1U41901( )
   {
      /* Scan By routine */
      /* Using cursor T01U426 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      RcdFound1901 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1901 = (short)(1) ;
         A14278HreNormId = T01U426_A14278HreNormId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1U41901( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1901 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1901 = (short)(1) ;
         A14278HreNormId = T01U426_A14278HreNormId[0] ;
      }
   }

   public void scanEnd1U41901( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1U41901( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1U41901( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1U41901( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1U41901( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1U41901( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1U41901( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1U41901( )
   {
      edtHreNormId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNormId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNormId_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtHreNormDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNormDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNormDsc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtHreNormSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNormSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNormSt_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtHreNormNc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNormNc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNormNc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void send_integrity_lvl_hashes1U41901( )
   {
   }

   public void send_integrity_lvl_hashes1U4678( )
   {
   }

   public void subsflControlProps_731901( )
   {
      edtHreNormId_Internalname = "HRENORMID_"+sGXsfl_73_idx ;
      edtHreNormDsc_Internalname = "HRENORMDSC_"+sGXsfl_73_idx ;
      edtHreNormSt_Internalname = "HRENORMST_"+sGXsfl_73_idx ;
      edtHreNormNc_Internalname = "HRENORMNC_"+sGXsfl_73_idx ;
   }

   public void subsflControlProps_fel_731901( )
   {
      edtHreNormId_Internalname = "HRENORMID_"+sGXsfl_73_fel_idx ;
      edtHreNormDsc_Internalname = "HRENORMDSC_"+sGXsfl_73_fel_idx ;
      edtHreNormSt_Internalname = "HRENORMST_"+sGXsfl_73_fel_idx ;
      edtHreNormNc_Internalname = "HRENORMNC_"+sGXsfl_73_fel_idx ;
   }

   public void addRow1U41901( )
   {
      nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_731901( ) ;
      sendRow1U41901( ) ;
   }

   public void sendRow1U41901( )
   {
      Gridhisre2_normasRow = GXWebRow.GetNew(context) ;
      if ( subGridhisre2_normas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridhisre2_normas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridhisre2_normas_Class, "") != 0 )
         {
            subGridhisre2_normas_Linesclass = subGridhisre2_normas_Class+"Odd" ;
         }
      }
      else if ( subGridhisre2_normas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridhisre2_normas_Backstyle = (byte)(0) ;
         subGridhisre2_normas_Backcolor = subGridhisre2_normas_Allbackcolor ;
         if ( GXutil.strcmp(subGridhisre2_normas_Class, "") != 0 )
         {
            subGridhisre2_normas_Linesclass = subGridhisre2_normas_Class+"Uniform" ;
         }
      }
      else if ( subGridhisre2_normas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridhisre2_normas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridhisre2_normas_Class, "") != 0 )
         {
            subGridhisre2_normas_Linesclass = subGridhisre2_normas_Class+"Odd" ;
         }
         subGridhisre2_normas_Backcolor = (int)(0x0) ;
      }
      else if ( subGridhisre2_normas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridhisre2_normas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_73_idx) % (2))) == 0 )
         {
            subGridhisre2_normas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridhisre2_normas_Class, "") != 0 )
            {
               subGridhisre2_normas_Linesclass = subGridhisre2_normas_Class+"Even" ;
            }
         }
         else
         {
            subGridhisre2_normas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridhisre2_normas_Class, "") != 0 )
            {
               subGridhisre2_normas_Linesclass = subGridhisre2_normas_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1901_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridhisre2_normasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNormId_Internalname,GXutil.rtrim( A14278HreNormId),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNormId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreNormId_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1901_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridhisre2_normasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNormDsc_Internalname,GXutil.rtrim( A14279HreNormDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNormDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreNormDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1901_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridhisre2_normasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNormSt_Internalname,GXutil.rtrim( A14280HreNormSt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNormSt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreNormSt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1901_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridhisre2_normasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNormNc_Internalname,GXutil.rtrim( A14281HreNormNc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNormNc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreNormNc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridhisre2_normasRow);
      send_integrity_lvl_hashes1U41901( ) ;
      GXCCtl = "Z14278HreNormId_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14278HreNormId));
      GXCCtl = "Z14279HreNormDsc_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14279HreNormDsc));
      GXCCtl = "Z14280HreNormSt_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14280HreNormSt));
      GXCCtl = "Z14281HreNormNc_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14281HreNormNc));
      GXCCtl = "nRcdDeleted_1901_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1901, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1901_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1901, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1901_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1901, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENORMID_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENORMDSC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENORMST_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormSt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENORMNC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormNc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridhisre2_normasContainer.AddRow(Gridhisre2_normasRow);
   }

   public void readRow1U41901( )
   {
      nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_731901( ) ;
      edtHreNormId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENORMID_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreNormDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENORMDSC_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreNormSt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENORMST_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreNormNc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENORMNC_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A14278HreNormId = httpContext.cgiGet( edtHreNormId_Internalname) ;
      A14279HreNormDsc = httpContext.cgiGet( edtHreNormDsc_Internalname) ;
      A14280HreNormSt = httpContext.cgiGet( edtHreNormSt_Internalname) ;
      A14281HreNormNc = httpContext.cgiGet( edtHreNormNc_Internalname) ;
      GXCCtl = "Z14278HreNormId_" + sGXsfl_73_idx ;
      Z14278HreNormId = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14279HreNormDsc_" + sGXsfl_73_idx ;
      Z14279HreNormDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14280HreNormSt_" + sGXsfl_73_idx ;
      Z14280HreNormSt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14281HreNormNc_" + sGXsfl_73_idx ;
      Z14281HreNormNc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1901_" + sGXsfl_73_idx ;
      nRcdDeleted_1901 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1901_" + sGXsfl_73_idx ;
      nRcdExists_1901 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1901_" + sGXsfl_73_idx ;
      nIsMod_1901 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHreNormId_Enabled = edtHreNormId_Enabled ;
   }

   public void confirmValues1U40( )
   {
      nGXsfl_73_idx = 0 ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_731901( ) ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_731901( ) ;
         httpContext.changePostValue( "Z14278HreNormId_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z14278HreNormId_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14278HreNormId_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z14279HreNormDsc_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z14279HreNormDsc_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14279HreNormDsc_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z14280HreNormSt_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z14280HreNormSt_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14280HreNormSt_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z14281HreNormNc_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z14281HreNormNc_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14281HreNormNc_"+sGXsfl_73_idx) ;
      }
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.hisre2", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_73", GXutil.ltrim( localUtil.ntoc( nGXsfl_73_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.hisre2", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "HISRE2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISRE2", "") ;
   }

   public void initializeNonKey1U4678( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
   }

   public void initAll1U4678( )
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
      initializeNonKey1U4678( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1U41901( )
   {
      A14279HreNormDsc = "" ;
      A14280HreNormSt = "" ;
      A14281HreNormNc = "" ;
      Z14279HreNormDsc = "" ;
      Z14280HreNormSt = "" ;
      Z14281HreNormNc = "" ;
   }

   public void initAll1U41901( )
   {
      A14278HreNormId = "" ;
      initializeNonKey1U41901( ) ;
   }

   public void standaloneModalInsert1U41901( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415121227", true, true);
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
      httpContext.AddJavascriptSource("hisre2.js", "?202682415121227", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1901( )
   {
      edtHreNormId_Enabled = defedtHreNormId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNormId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNormId_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void startgridcontrol73( )
   {
      Gridhisre2_normasContainer.AddObjectProperty("GridName", "Gridhisre2_normas");
      Gridhisre2_normasContainer.AddObjectProperty("Header", subGridhisre2_normas_Header);
      Gridhisre2_normasContainer.AddObjectProperty("Class", "Grid");
      Gridhisre2_normasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridhisre2_normasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridhisre2_normasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridhisre2_normas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridhisre2_normasContainer.AddObjectProperty("CmpContext", "");
      Gridhisre2_normasContainer.AddObjectProperty("InMasterPage", "false");
      Gridhisre2_normasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridhisre2_normasColumn.AddObjectProperty("Value", GXutil.rtrim( A14278HreNormId));
      Gridhisre2_normasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridhisre2_normasContainer.AddColumnProperties(Gridhisre2_normasColumn);
      Gridhisre2_normasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridhisre2_normasColumn.AddObjectProperty("Value", GXutil.rtrim( A14279HreNormDsc));
      Gridhisre2_normasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridhisre2_normasContainer.AddColumnProperties(Gridhisre2_normasColumn);
      Gridhisre2_normasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridhisre2_normasColumn.AddObjectProperty("Value", GXutil.rtrim( A14280HreNormSt));
      Gridhisre2_normasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormSt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridhisre2_normasContainer.AddColumnProperties(Gridhisre2_normasColumn);
      Gridhisre2_normasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridhisre2_normasColumn.AddObjectProperty("Value", GXutil.rtrim( A14281HreNormNc));
      Gridhisre2_normasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNormNc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridhisre2_normasContainer.AddColumnProperties(Gridhisre2_normasColumn);
      Gridhisre2_normasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridhisre2_normas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridhisre2_normasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridhisre2_normas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridhisre2_normasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridhisre2_normas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridhisre2_normasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridhisre2_normas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridhisre2_normasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridhisre2_normas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridhisre2_normasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridhisre2_normas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridhisre2_normasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridhisre2_normas_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtHreLinMaq_Internalname = "HRELINMAQ" ;
      lblTitlenormas_Internalname = "TITLENORMAS" ;
      edtHreNormId_Internalname = "HRENORMID" ;
      edtHreNormDsc_Internalname = "HRENORMDSC" ;
      edtHreNormSt_Internalname = "HRENORMST" ;
      edtHreNormNc_Internalname = "HRENORMNC" ;
      divNormastable_Internalname = "NORMASTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridhisre2_normas_Internalname = "GRIDHISRE2_NORMAS" ;
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
      subGridhisre2_normas_Allowcollapsing = (byte)(0) ;
      subGridhisre2_normas_Allowselection = (byte)(0) ;
      subGridhisre2_normas_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "HISRE2", "") );
      edtHreNormNc_Jsonclick = "" ;
      edtHreNormSt_Jsonclick = "" ;
      edtHreNormDsc_Jsonclick = "" ;
      edtHreNormId_Jsonclick = "" ;
      subGridhisre2_normas_Class = "Grid" ;
      subGridhisre2_normas_Backcolorstyle = (byte)(0) ;
      edtHreNormNc_Enabled = 1 ;
      edtHreNormSt_Enabled = 1 ;
      edtHreNormDsc_Enabled = 1 ;
      edtHreNormId_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtHreLinMaq_Jsonclick = "" ;
      edtHreLinMaq_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
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

   public void gxnrgridhisre2_normas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_731901( ) ;
      while ( nGXsfl_73_idx <= nRC_GXsfl_73 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1U41901( ) ;
         standaloneModal1U41901( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1U41901( ) ;
         nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_731901( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridhisre2_normasContainer)) ;
      /* End function gxnrGridhisre2_normas_newrow */
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
      /* Using cursor T01U416 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01U416_A407EmprNom[0] ;
      n407EmprNom = T01U416_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      /* Using cursor T01U427 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(25);
      if ( AnyError == 0 )
      {
         GX_FocusControl = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
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
      /* Using cursor T01U416 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01U416_A407EmprNom[0] ;
      n407EmprNom = T01U416_n407EmprNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Hrenumcie( )
   {
      /* Using cursor T01U427 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(25);
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
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4545HreLinMaq", GXutil.ltrim( localUtil.ntoc( Z4545HreLinMaq, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
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
      setEventMetadata("VALID_HREBARCOD","{handler:'valid_Hrebarcod',iparms:[]");
      setEventMetadata("VALID_HREBARCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARREO","{handler:'valid_Hrebarreo',iparms:[]");
      setEventMetadata("VALID_HREBARREO",",oparms:[]}");
      setEventMetadata("VALID_HREBARPAR","{handler:'valid_Hrebarpar',iparms:[]");
      setEventMetadata("VALID_HREBARPAR",",oparms:[]}");
      setEventMetadata("VALID_HRENUMCIE","{handler:'valid_Hrenumcie',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'}]");
      setEventMetadata("VALID_HRENUMCIE",",oparms:[]}");
      setEventMetadata("VALID_HRELINMAQ","{handler:'valid_Hrelinmaq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HRELINMAQ",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4492HreBarCod'},{av:'Z4493HreBarReo'},{av:'Z4494HreBarPar'},{av:'Z4495HreNumCie'},{av:'Z4545HreLinMaq'},{av:'Z407EmprNom'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_HRENORMID","{handler:'valid_Hrenormid',iparms:[]");
      setEventMetadata("VALID_HRENORMID",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hrenormnc',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4494HreBarPar = "" ;
      Z14278HreNormId = "" ;
      Z14279HreNormDsc = "" ;
      Z14280HreNormSt = "" ;
      Z14281HreNormNc = "" ;
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
      Gx_mode = "" ;
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
      lblTitlenormas_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridhisre2_normasContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1901 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A14278HreNormId = "" ;
      A14279HreNormDsc = "" ;
      A14280HreNormSt = "" ;
      A14281HreNormNc = "" ;
      Z407EmprNom = "" ;
      T01U48_A4545HreLinMaq = new short[1] ;
      T01U48_A407EmprNom = new String[] {""} ;
      T01U48_n407EmprNom = new boolean[] {false} ;
      T01U48_A396EmprCod = new String[] {""} ;
      T01U48_A4492HreBarCod = new int[1] ;
      T01U48_A4493HreBarReo = new byte[1] ;
      T01U48_A4494HreBarPar = new String[] {""} ;
      T01U48_A4495HreNumCie = new byte[1] ;
      T01U46_A407EmprNom = new String[] {""} ;
      T01U46_n407EmprNom = new boolean[] {false} ;
      T01U47_A396EmprCod = new String[] {""} ;
      T01U49_A407EmprNom = new String[] {""} ;
      T01U49_n407EmprNom = new boolean[] {false} ;
      T01U410_A396EmprCod = new String[] {""} ;
      T01U411_A396EmprCod = new String[] {""} ;
      T01U411_A4492HreBarCod = new int[1] ;
      T01U411_A4493HreBarReo = new byte[1] ;
      T01U411_A4494HreBarPar = new String[] {""} ;
      T01U411_A4495HreNumCie = new byte[1] ;
      T01U411_A4545HreLinMaq = new short[1] ;
      T01U45_A4545HreLinMaq = new short[1] ;
      T01U45_A396EmprCod = new String[] {""} ;
      T01U45_A4492HreBarCod = new int[1] ;
      T01U45_A4493HreBarReo = new byte[1] ;
      T01U45_A4494HreBarPar = new String[] {""} ;
      T01U45_A4495HreNumCie = new byte[1] ;
      sMode678 = "" ;
      T01U412_A396EmprCod = new String[] {""} ;
      T01U412_A4492HreBarCod = new int[1] ;
      T01U412_A4493HreBarReo = new byte[1] ;
      T01U412_A4494HreBarPar = new String[] {""} ;
      T01U412_A4495HreNumCie = new byte[1] ;
      T01U412_A4545HreLinMaq = new short[1] ;
      T01U413_A396EmprCod = new String[] {""} ;
      T01U413_A4492HreBarCod = new int[1] ;
      T01U413_A4493HreBarReo = new byte[1] ;
      T01U413_A4494HreBarPar = new String[] {""} ;
      T01U413_A4495HreNumCie = new byte[1] ;
      T01U413_A4545HreLinMaq = new short[1] ;
      T01U44_A4545HreLinMaq = new short[1] ;
      T01U44_A396EmprCod = new String[] {""} ;
      T01U44_A4492HreBarCod = new int[1] ;
      T01U44_A4493HreBarReo = new byte[1] ;
      T01U44_A4494HreBarPar = new String[] {""} ;
      T01U44_A4495HreNumCie = new byte[1] ;
      T01U416_A407EmprNom = new String[] {""} ;
      T01U416_n407EmprNom = new boolean[] {false} ;
      T01U417_A396EmprCod = new String[] {""} ;
      T01U417_A4492HreBarCod = new int[1] ;
      T01U417_A4493HreBarReo = new byte[1] ;
      T01U417_A4494HreBarPar = new String[] {""} ;
      T01U417_A4495HreNumCie = new byte[1] ;
      T01U417_A4545HreLinMaq = new short[1] ;
      T01U417_A14282HreTraID = new String[] {""} ;
      T01U418_A396EmprCod = new String[] {""} ;
      T01U418_A4492HreBarCod = new int[1] ;
      T01U418_A4493HreBarReo = new byte[1] ;
      T01U418_A4494HreBarPar = new String[] {""} ;
      T01U418_A4495HreNumCie = new byte[1] ;
      T01U418_A4545HreLinMaq = new short[1] ;
      T01U418_A4550HreLinPro = new byte[1] ;
      T01U419_A396EmprCod = new String[] {""} ;
      T01U419_A4492HreBarCod = new int[1] ;
      T01U419_A4493HreBarReo = new byte[1] ;
      T01U419_A4494HreBarPar = new String[] {""} ;
      T01U419_A4495HreNumCie = new byte[1] ;
      T01U419_A4545HreLinMaq = new short[1] ;
      T01U419_A11322HreLinObs = new short[1] ;
      T01U420_A396EmprCod = new String[] {""} ;
      T01U420_A4492HreBarCod = new int[1] ;
      T01U420_A4493HreBarReo = new byte[1] ;
      T01U420_A4494HreBarPar = new String[] {""} ;
      T01U420_A4495HreNumCie = new byte[1] ;
      T01U420_A4545HreLinMaq = new short[1] ;
      T01U421_A4492HreBarCod = new int[1] ;
      T01U421_A4493HreBarReo = new byte[1] ;
      T01U421_A4494HreBarPar = new String[] {""} ;
      T01U421_A4495HreNumCie = new byte[1] ;
      T01U421_A4545HreLinMaq = new short[1] ;
      T01U421_A14278HreNormId = new String[] {""} ;
      T01U421_A14279HreNormDsc = new String[] {""} ;
      T01U421_A14280HreNormSt = new String[] {""} ;
      T01U421_A14281HreNormNc = new String[] {""} ;
      T01U421_A396EmprCod = new String[] {""} ;
      T01U422_A396EmprCod = new String[] {""} ;
      T01U422_A4492HreBarCod = new int[1] ;
      T01U422_A4493HreBarReo = new byte[1] ;
      T01U422_A4494HreBarPar = new String[] {""} ;
      T01U422_A4495HreNumCie = new byte[1] ;
      T01U422_A4545HreLinMaq = new short[1] ;
      T01U422_A14278HreNormId = new String[] {""} ;
      T01U43_A4492HreBarCod = new int[1] ;
      T01U43_A4493HreBarReo = new byte[1] ;
      T01U43_A4494HreBarPar = new String[] {""} ;
      T01U43_A4495HreNumCie = new byte[1] ;
      T01U43_A4545HreLinMaq = new short[1] ;
      T01U43_A14278HreNormId = new String[] {""} ;
      T01U43_A14279HreNormDsc = new String[] {""} ;
      T01U43_A14280HreNormSt = new String[] {""} ;
      T01U43_A14281HreNormNc = new String[] {""} ;
      T01U43_A396EmprCod = new String[] {""} ;
      T01U42_A4492HreBarCod = new int[1] ;
      T01U42_A4493HreBarReo = new byte[1] ;
      T01U42_A4494HreBarPar = new String[] {""} ;
      T01U42_A4495HreNumCie = new byte[1] ;
      T01U42_A4545HreLinMaq = new short[1] ;
      T01U42_A14278HreNormId = new String[] {""} ;
      T01U42_A14279HreNormDsc = new String[] {""} ;
      T01U42_A14280HreNormSt = new String[] {""} ;
      T01U42_A14281HreNormNc = new String[] {""} ;
      T01U42_A396EmprCod = new String[] {""} ;
      T01U426_A396EmprCod = new String[] {""} ;
      T01U426_A4492HreBarCod = new int[1] ;
      T01U426_A4493HreBarReo = new byte[1] ;
      T01U426_A4494HreBarPar = new String[] {""} ;
      T01U426_A4495HreNumCie = new byte[1] ;
      T01U426_A4545HreLinMaq = new short[1] ;
      T01U426_A14278HreNormId = new String[] {""} ;
      Gridhisre2_normasRow = new com.genexus.webpanels.GXWebRow();
      subGridhisre2_normas_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridhisre2_normasColumn = new com.genexus.webpanels.GXWebColumn();
      T01U427_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ4494HreBarPar = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.hisre2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.hisre2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.hisre2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.hisre2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.hisre2__default(),
         new Object[] {
             new Object[] {
            T01U42_A4492HreBarCod, T01U42_A4493HreBarReo, T01U42_A4494HreBarPar, T01U42_A4495HreNumCie, T01U42_A4545HreLinMaq, T01U42_A14278HreNormId, T01U42_A14279HreNormDsc, T01U42_A14280HreNormSt, T01U42_A14281HreNormNc, T01U42_A396EmprCod
            }
            , new Object[] {
            T01U43_A4492HreBarCod, T01U43_A4493HreBarReo, T01U43_A4494HreBarPar, T01U43_A4495HreNumCie, T01U43_A4545HreLinMaq, T01U43_A14278HreNormId, T01U43_A14279HreNormDsc, T01U43_A14280HreNormSt, T01U43_A14281HreNormNc, T01U43_A396EmprCod
            }
            , new Object[] {
            T01U44_A4545HreLinMaq, T01U44_A396EmprCod, T01U44_A4492HreBarCod, T01U44_A4493HreBarReo, T01U44_A4494HreBarPar, T01U44_A4495HreNumCie
            }
            , new Object[] {
            T01U45_A4545HreLinMaq, T01U45_A396EmprCod, T01U45_A4492HreBarCod, T01U45_A4493HreBarReo, T01U45_A4494HreBarPar, T01U45_A4495HreNumCie
            }
            , new Object[] {
            T01U46_A407EmprNom, T01U46_n407EmprNom
            }
            , new Object[] {
            T01U47_A396EmprCod
            }
            , new Object[] {
            T01U48_A4545HreLinMaq, T01U48_A407EmprNom, T01U48_n407EmprNom, T01U48_A396EmprCod, T01U48_A4492HreBarCod, T01U48_A4493HreBarReo, T01U48_A4494HreBarPar, T01U48_A4495HreNumCie
            }
            , new Object[] {
            T01U49_A407EmprNom, T01U49_n407EmprNom
            }
            , new Object[] {
            T01U410_A396EmprCod
            }
            , new Object[] {
            T01U411_A396EmprCod, T01U411_A4492HreBarCod, T01U411_A4493HreBarReo, T01U411_A4494HreBarPar, T01U411_A4495HreNumCie, T01U411_A4545HreLinMaq
            }
            , new Object[] {
            T01U412_A396EmprCod, T01U412_A4492HreBarCod, T01U412_A4493HreBarReo, T01U412_A4494HreBarPar, T01U412_A4495HreNumCie, T01U412_A4545HreLinMaq
            }
            , new Object[] {
            T01U413_A396EmprCod, T01U413_A4492HreBarCod, T01U413_A4493HreBarReo, T01U413_A4494HreBarPar, T01U413_A4495HreNumCie, T01U413_A4545HreLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01U416_A407EmprNom, T01U416_n407EmprNom
            }
            , new Object[] {
            T01U417_A396EmprCod, T01U417_A4492HreBarCod, T01U417_A4493HreBarReo, T01U417_A4494HreBarPar, T01U417_A4495HreNumCie, T01U417_A4545HreLinMaq, T01U417_A14282HreTraID
            }
            , new Object[] {
            T01U418_A396EmprCod, T01U418_A4492HreBarCod, T01U418_A4493HreBarReo, T01U418_A4494HreBarPar, T01U418_A4495HreNumCie, T01U418_A4545HreLinMaq, T01U418_A4550HreLinPro
            }
            , new Object[] {
            T01U419_A396EmprCod, T01U419_A4492HreBarCod, T01U419_A4493HreBarReo, T01U419_A4494HreBarPar, T01U419_A4495HreNumCie, T01U419_A4545HreLinMaq, T01U419_A11322HreLinObs
            }
            , new Object[] {
            T01U420_A396EmprCod, T01U420_A4492HreBarCod, T01U420_A4493HreBarReo, T01U420_A4494HreBarPar, T01U420_A4495HreNumCie, T01U420_A4545HreLinMaq
            }
            , new Object[] {
            T01U421_A4492HreBarCod, T01U421_A4493HreBarReo, T01U421_A4494HreBarPar, T01U421_A4495HreNumCie, T01U421_A4545HreLinMaq, T01U421_A14278HreNormId, T01U421_A14279HreNormDsc, T01U421_A14280HreNormSt, T01U421_A14281HreNormNc, T01U421_A396EmprCod
            }
            , new Object[] {
            T01U422_A396EmprCod, T01U422_A4492HreBarCod, T01U422_A4493HreBarReo, T01U422_A4494HreBarPar, T01U422_A4495HreNumCie, T01U422_A4545HreLinMaq, T01U422_A14278HreNormId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01U426_A396EmprCod, T01U426_A4492HreBarCod, T01U426_A4493HreBarReo, T01U426_A4494HreBarPar, T01U426_A4495HreNumCie, T01U426_A4545HreLinMaq, T01U426_A14278HreNormId
            }
            , new Object[] {
            T01U427_A396EmprCod
            }
         }
      );
   }

   private byte Z4493HreBarReo ;
   private byte Z4495HreNumCie ;
   private byte GxWebError ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridhisre2_normas_Backcolorstyle ;
   private byte subGridhisre2_normas_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridhisre2_normas_Allowselection ;
   private byte subGridhisre2_normas_Allowhovering ;
   private byte subGridhisre2_normas_Allowcollapsing ;
   private byte subGridhisre2_normas_Collapsed ;
   private byte ZZ4493HreBarReo ;
   private byte ZZ4495HreNumCie ;
   private short Z4545HreLinMaq ;
   private short nRcdDeleted_1901 ;
   private short nRcdExists_1901 ;
   private short nIsMod_1901 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4545HreLinMaq ;
   private short nBlankRcdCount1901 ;
   private short RcdFound1901 ;
   private short nBlankRcdUsr1901 ;
   private short RcdFound678 ;
   private short nIsDirty_678 ;
   private short nIsDirty_1901 ;
   private short ZZ4545HreLinMaq ;
   private int Z4492HreBarCod ;
   private int nRC_GXsfl_73 ;
   private int nGXsfl_73_idx=1 ;
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
   private int edtEmprNom_Enabled ;
   private int edtHreLinMaq_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtHreNormId_Enabled ;
   private int edtHreNormDsc_Enabled ;
   private int edtHreNormSt_Enabled ;
   private int edtHreNormNc_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridhisre2_normas_Backcolor ;
   private int subGridhisre2_normas_Allbackcolor ;
   private int defedtHreNormId_Enabled ;
   private int idxLst ;
   private int subGridhisre2_normas_Selectedindex ;
   private int subGridhisre2_normas_Selectioncolor ;
   private int subGridhisre2_normas_Hoveringcolor ;
   private int ZZ4492HreBarCod ;
   private long GRIDHISRE2_NORMAS_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4494HreBarPar ;
   private String Z14278HreNormId ;
   private String Z14279HreNormDsc ;
   private String Z14280HreNormSt ;
   private String Z14281HreNormNc ;
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
   private String sGXsfl_73_idx="0001" ;
   private String Gx_mode ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtHreLinMaq_Internalname ;
   private String edtHreLinMaq_Jsonclick ;
   private String divNormastable_Internalname ;
   private String lblTitlenormas_Internalname ;
   private String lblTitlenormas_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode1901 ;
   private String edtHreNormId_Internalname ;
   private String edtHreNormDsc_Internalname ;
   private String edtHreNormSt_Internalname ;
   private String edtHreNormNc_Internalname ;
   private String sStyleString ;
   private String subGridhisre2_normas_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A14278HreNormId ;
   private String A14279HreNormDsc ;
   private String A14280HreNormSt ;
   private String A14281HreNormNc ;
   private String Z407EmprNom ;
   private String sMode678 ;
   private String sGXsfl_73_fel_idx="0001" ;
   private String subGridhisre2_normas_Class ;
   private String subGridhisre2_normas_Linesclass ;
   private String ROClassString ;
   private String edtHreNormId_Jsonclick ;
   private String edtHreNormDsc_Jsonclick ;
   private String edtHreNormSt_Jsonclick ;
   private String edtHreNormNc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridhisre2_normas_Header ;
   private String ZZ396EmprCod ;
   private String ZZ4494HreBarPar ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_73_Refreshing=false ;
   private boolean n407EmprNom ;
   private com.genexus.webpanels.GXWebGrid Gridhisre2_normasContainer ;
   private com.genexus.webpanels.GXWebRow Gridhisre2_normasRow ;
   private com.genexus.webpanels.GXWebColumn Gridhisre2_normasColumn ;
   private IDataStoreProvider pr_default ;
   private short[] T01U48_A4545HreLinMaq ;
   private String[] T01U48_A407EmprNom ;
   private boolean[] T01U48_n407EmprNom ;
   private String[] T01U48_A396EmprCod ;
   private int[] T01U48_A4492HreBarCod ;
   private byte[] T01U48_A4493HreBarReo ;
   private String[] T01U48_A4494HreBarPar ;
   private byte[] T01U48_A4495HreNumCie ;
   private String[] T01U46_A407EmprNom ;
   private boolean[] T01U46_n407EmprNom ;
   private String[] T01U47_A396EmprCod ;
   private String[] T01U49_A407EmprNom ;
   private boolean[] T01U49_n407EmprNom ;
   private String[] T01U410_A396EmprCod ;
   private String[] T01U411_A396EmprCod ;
   private int[] T01U411_A4492HreBarCod ;
   private byte[] T01U411_A4493HreBarReo ;
   private String[] T01U411_A4494HreBarPar ;
   private byte[] T01U411_A4495HreNumCie ;
   private short[] T01U411_A4545HreLinMaq ;
   private short[] T01U45_A4545HreLinMaq ;
   private String[] T01U45_A396EmprCod ;
   private int[] T01U45_A4492HreBarCod ;
   private byte[] T01U45_A4493HreBarReo ;
   private String[] T01U45_A4494HreBarPar ;
   private byte[] T01U45_A4495HreNumCie ;
   private String[] T01U412_A396EmprCod ;
   private int[] T01U412_A4492HreBarCod ;
   private byte[] T01U412_A4493HreBarReo ;
   private String[] T01U412_A4494HreBarPar ;
   private byte[] T01U412_A4495HreNumCie ;
   private short[] T01U412_A4545HreLinMaq ;
   private String[] T01U413_A396EmprCod ;
   private int[] T01U413_A4492HreBarCod ;
   private byte[] T01U413_A4493HreBarReo ;
   private String[] T01U413_A4494HreBarPar ;
   private byte[] T01U413_A4495HreNumCie ;
   private short[] T01U413_A4545HreLinMaq ;
   private short[] T01U44_A4545HreLinMaq ;
   private String[] T01U44_A396EmprCod ;
   private int[] T01U44_A4492HreBarCod ;
   private byte[] T01U44_A4493HreBarReo ;
   private String[] T01U44_A4494HreBarPar ;
   private byte[] T01U44_A4495HreNumCie ;
   private String[] T01U416_A407EmprNom ;
   private boolean[] T01U416_n407EmprNom ;
   private String[] T01U417_A396EmprCod ;
   private int[] T01U417_A4492HreBarCod ;
   private byte[] T01U417_A4493HreBarReo ;
   private String[] T01U417_A4494HreBarPar ;
   private byte[] T01U417_A4495HreNumCie ;
   private short[] T01U417_A4545HreLinMaq ;
   private String[] T01U417_A14282HreTraID ;
   private String[] T01U418_A396EmprCod ;
   private int[] T01U418_A4492HreBarCod ;
   private byte[] T01U418_A4493HreBarReo ;
   private String[] T01U418_A4494HreBarPar ;
   private byte[] T01U418_A4495HreNumCie ;
   private short[] T01U418_A4545HreLinMaq ;
   private byte[] T01U418_A4550HreLinPro ;
   private String[] T01U419_A396EmprCod ;
   private int[] T01U419_A4492HreBarCod ;
   private byte[] T01U419_A4493HreBarReo ;
   private String[] T01U419_A4494HreBarPar ;
   private byte[] T01U419_A4495HreNumCie ;
   private short[] T01U419_A4545HreLinMaq ;
   private short[] T01U419_A11322HreLinObs ;
   private String[] T01U420_A396EmprCod ;
   private int[] T01U420_A4492HreBarCod ;
   private byte[] T01U420_A4493HreBarReo ;
   private String[] T01U420_A4494HreBarPar ;
   private byte[] T01U420_A4495HreNumCie ;
   private short[] T01U420_A4545HreLinMaq ;
   private int[] T01U421_A4492HreBarCod ;
   private byte[] T01U421_A4493HreBarReo ;
   private String[] T01U421_A4494HreBarPar ;
   private byte[] T01U421_A4495HreNumCie ;
   private short[] T01U421_A4545HreLinMaq ;
   private String[] T01U421_A14278HreNormId ;
   private String[] T01U421_A14279HreNormDsc ;
   private String[] T01U421_A14280HreNormSt ;
   private String[] T01U421_A14281HreNormNc ;
   private String[] T01U421_A396EmprCod ;
   private String[] T01U422_A396EmprCod ;
   private int[] T01U422_A4492HreBarCod ;
   private byte[] T01U422_A4493HreBarReo ;
   private String[] T01U422_A4494HreBarPar ;
   private byte[] T01U422_A4495HreNumCie ;
   private short[] T01U422_A4545HreLinMaq ;
   private String[] T01U422_A14278HreNormId ;
   private int[] T01U43_A4492HreBarCod ;
   private byte[] T01U43_A4493HreBarReo ;
   private String[] T01U43_A4494HreBarPar ;
   private byte[] T01U43_A4495HreNumCie ;
   private short[] T01U43_A4545HreLinMaq ;
   private String[] T01U43_A14278HreNormId ;
   private String[] T01U43_A14279HreNormDsc ;
   private String[] T01U43_A14280HreNormSt ;
   private String[] T01U43_A14281HreNormNc ;
   private String[] T01U43_A396EmprCod ;
   private int[] T01U42_A4492HreBarCod ;
   private byte[] T01U42_A4493HreBarReo ;
   private String[] T01U42_A4494HreBarPar ;
   private byte[] T01U42_A4495HreNumCie ;
   private short[] T01U42_A4545HreLinMaq ;
   private String[] T01U42_A14278HreNormId ;
   private String[] T01U42_A14279HreNormDsc ;
   private String[] T01U42_A14280HreNormSt ;
   private String[] T01U42_A14281HreNormNc ;
   private String[] T01U42_A396EmprCod ;
   private String[] T01U426_A396EmprCod ;
   private int[] T01U426_A4492HreBarCod ;
   private byte[] T01U426_A4493HreBarReo ;
   private String[] T01U426_A4494HreBarPar ;
   private byte[] T01U426_A4495HreNumCie ;
   private short[] T01U426_A4545HreLinMaq ;
   private String[] T01U426_A14278HreNormId ;
   private String[] T01U427_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class hisre2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hisre2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hisre2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hisre2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hisre2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01U42", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreNormId, HreNormDsc, HreNormSt, HreNormNc, EmprCod FROM TXPHISRE2 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreNormId = ?  FOR UPDATE OF HreNormDsc, HreNormSt, HreNormNc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U43", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreNormId, HreNormDsc, HreNormSt, HreNormNc, EmprCod FROM TXPHISRE2 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreNormId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U44", "SELECT HreLinMaq, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?  FOR UPDATE OF HreLinMaq NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U45", "SELECT HreLinMaq, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U46", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U47", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U48", "SELECT /*+ FIRST_ROWS(100) */ TM1.HreLinMaq, T2.EmprNom, TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie FROM (TXPHISREM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.HreBarCod = ? and TM1.HreBarReo = ? and TM1.HreBarPar = ? and TM1.HreNumCie = ? and TM1.HreLinMaq = ? ORDER BY TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie, TM1.HreLinMaq ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U49", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U410", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U411", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U412", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE ( EmprCod > ? or EmprCod = ? and HreBarCod > ? or HreBarCod = ? and EmprCod = ? and HreBarReo > ? or HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreBarPar > ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreNumCie > ? or HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreLinMaq > ?) ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U413", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE ( EmprCod < ? or EmprCod = ? and HreBarCod < ? or HreBarCod = ? and EmprCod = ? and HreBarReo < ? or HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreBarPar < ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreNumCie < ? or HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreLinMaq < ?) ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreLinMaq DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01U414", "INSERT INTO TXPHISREM(HreLinMaq, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreMaqCod, HreVolPrd, HreFacAbs, HreULinPro, HreFecPes, HreMaqPes, HreUsrCod, HreFecAlt, HreUsrMod, HreFecMod, HreFasCod, HreOrdLin, HreNroPar, HreTotKgs, HreTotMts, HreTotPrd, HreProPrd, HreNumRmt, HreNumReo, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreNPrg, HreLotF, HreNumInt, HreDti, HreDtf, HreAnc, HreGrm, HreVel, HreObs, HreUltObs, HreAva, HreAs, HreAi) VALUES(?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, ' ', ' ', ' ')", GX_NOMASK, "TXPHISREM")
         ,new UpdateCursor("T01U415", "DELETE FROM TXPHISREM  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?", GX_NOMASK, "TXPHISREM")
         ,new ForEachCursor("T01U416", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U417", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreTraID FROM TXPHISRE3 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U418", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro FROM TXPHISREC WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U419", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinObs FROM TXPHISOBS WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U420", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U421", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreNormId, HreNormDsc, HreNormSt, HreNormNc, EmprCod FROM TXPHISRE2 WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreNormId = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreNormId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U422", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreNormId FROM TXPHISRE2 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreNormId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01U423", "INSERT INTO TXPHISRE2(HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreNormId, HreNormDsc, HreNormSt, HreNormNc, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHISRE2")
         ,new UpdateCursor("T01U424", "UPDATE TXPHISRE2 SET HreNormDsc=?, HreNormSt=?, HreNormNc=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreNormId = ?", GX_NOMASK, "TXPHISRE2")
         ,new UpdateCursor("T01U425", "DELETE FROM TXPHISRE2  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreNormId = ?", GX_NOMASK, "TXPHISRE2")
         ,new ForEachCursor("T01U426", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreNormId FROM TXPHISRE2 WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreNormId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U427", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 10 :
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
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 25 :
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
               stmt.setString(7, (String)parms[6], 4);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 4);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
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
            case 11 :
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
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
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
               return;
            case 15 :
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 4);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 4);
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 4);
               stmt.setString(7, (String)parms[6], 30);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 4);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 4);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

