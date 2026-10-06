package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mremov_impl extends GXDataArea
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
         A9505MRMovTpo = (int)(GXutil.lval( httpContext.GetPar( "MRMovTpo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9505MRMovTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9505MRMovTpo), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A9505MRMovTpo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = (int)(GXutil.lval( httpContext.GetPar( "MRCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A9492MRCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Movimientos Repuestos", ""), (short)(0)) ;
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

   public mremov_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mremov_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mremov_impl.class ));
   }

   public mremov_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Movimientos Repuestos", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_MReMov.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MReMov.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MReMov.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MReMov.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MReMov.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_MReMov.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MReMov.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRCod_Internalname, httpContext.getMessage( "Repuesto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MReMov.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRMov_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRMov_Internalname, httpContext.getMessage( "Movimiento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRMov_Internalname, GXutil.ltrim( localUtil.ntoc( A9502MRMov, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRMov_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9502MRMov), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9502MRMov), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRMov_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRMov_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MReMov.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRMovOrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRMovOrd_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRMovOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A9503MRMovOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRMovOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9503MRMovOrd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9503MRMovOrd), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRMovOrd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRMovOrd_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MReMov.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRMovFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRMovFch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMRMovFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRMovFch_Internalname, localUtil.ttoc( A9504MRMovFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9504MRMovFch, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRMovFch_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRMovFch_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MReMov.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMRMovFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMRMovFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MReMov.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRMovTpo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRMovTpo_Internalname, httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRMovTpo_Internalname, GXutil.ltrim( localUtil.ntoc( A9505MRMovTpo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRMovTpo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9505MRMovTpo), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9505MRMovTpo), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRMovTpo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRMovTpo_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MReMov.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRMovDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRMovDsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRMovDsc_Internalname, GXutil.rtrim( A9507MRMovDsc), GXutil.rtrim( localUtil.format( A9507MRMovDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRMovDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRMovDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MReMov.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRMovCnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRMovCnt_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRMovCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9508MRMovCnt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRMovCnt_Enabled!=0) ? localUtil.format( A9508MRMovCnt, "ZZZ,ZZ9.999") : localUtil.format( A9508MRMovCnt, "ZZZ,ZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRMovCnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRMovCnt_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MReMov.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRMovPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRMovPre_Internalname, httpContext.getMessage( "Precio del Mov.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRMovPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9509MRMovPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRMovPre_Enabled!=0) ? localUtil.format( A9509MRMovPre, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9509MRMovPre, "ZZ,ZZZ,ZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRMovPre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRMovPre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MReMov.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MReMov.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MReMov.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MReMov.htm");
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
         Z9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9492MRCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9502MRMov = localUtil.ctol( httpContext.cgiGet( "Z9502MRMov"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z9503MRMovOrd = (int)(localUtil.ctol( httpContext.cgiGet( "Z9503MRMovOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9504MRMovFch = localUtil.ctot( httpContext.cgiGet( "Z9504MRMovFch"), 0) ;
         Z9507MRMovDsc = httpContext.cgiGet( "Z9507MRMovDsc") ;
         Z9508MRMovCnt = localUtil.ctond( httpContext.cgiGet( "Z9508MRMovCnt")) ;
         Z9509MRMovPre = localUtil.ctond( httpContext.cgiGet( "Z9509MRMovPre")) ;
         Z9505MRMovTpo = (int)(localUtil.ctol( httpContext.cgiGet( "Z9505MRMovTpo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9492MRCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         }
         else
         {
            A9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRMov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRMov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRMOV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRMov_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9502MRMov = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A9502MRMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9502MRMov), 10, 0));
         }
         else
         {
            A9502MRMov = localUtil.ctol( httpContext.cgiGet( edtMRMov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9502MRMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9502MRMov), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRMovOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRMovOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRMOVORD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRMovOrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9503MRMovOrd = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A9503MRMovOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9503MRMovOrd), 8, 0));
         }
         else
         {
            A9503MRMovOrd = (int)(localUtil.ctol( httpContext.cgiGet( edtMRMovOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9503MRMovOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9503MRMovOrd), 8, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMRMovFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MRMOVFCH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRMovFch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A9504MRMovFch", localUtil.ttoc( A9504MRMovFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A9504MRMovFch = localUtil.ctot( httpContext.cgiGet( edtMRMovFch_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9504MRMovFch", localUtil.ttoc( A9504MRMovFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRMovTpo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRMovTpo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRMOVTPO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRMovTpo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9505MRMovTpo = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A9505MRMovTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9505MRMovTpo), 8, 0));
         }
         else
         {
            A9505MRMovTpo = (int)(localUtil.ctol( httpContext.cgiGet( edtMRMovTpo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9505MRMovTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9505MRMovTpo), 8, 0));
         }
         A9507MRMovDsc = httpContext.cgiGet( edtMRMovDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9507MRMovDsc", A9507MRMovDsc);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRMovCnt_Internalname)), DecimalUtil.stringToDec("-99999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRMovCnt_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRMOVCNT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRMovCnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9508MRMovCnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A9508MRMovCnt", GXutil.ltrimstr( A9508MRMovCnt, 10, 3));
         }
         else
         {
            A9508MRMovCnt = localUtil.ctond( httpContext.cgiGet( edtMRMovCnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9508MRMovCnt", GXutil.ltrimstr( A9508MRMovCnt, 10, 3));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRMovPre_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRMovPre_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRMOVPRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRMovPre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9509MRMovPre = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A9509MRMovPre", GXutil.ltrimstr( A9509MRMovPre, 12, 3));
         }
         else
         {
            A9509MRMovPre = localUtil.ctond( httpContext.cgiGet( edtMRMovPre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9509MRMovPre", GXutil.ltrimstr( A9509MRMovPre, 12, 3));
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
            A9492MRCod = (int)(GXutil.lval( httpContext.GetPar( "MRCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
            A9502MRMov = GXutil.lval( httpContext.GetPar( "MRMov")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9502MRMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9502MRMov), 10, 0));
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
            initAll1QT1239( ) ;
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
      disableAttributes1QT1239( ) ;
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

   public void resetCaption1QT0( )
   {
   }

   public void zm1QT1239( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9503MRMovOrd = T01QT3_A9503MRMovOrd[0] ;
            Z9504MRMovFch = T01QT3_A9504MRMovFch[0] ;
            Z9507MRMovDsc = T01QT3_A9507MRMovDsc[0] ;
            Z9508MRMovCnt = T01QT3_A9508MRMovCnt[0] ;
            Z9509MRMovPre = T01QT3_A9509MRMovPre[0] ;
            Z9505MRMovTpo = T01QT3_A9505MRMovTpo[0] ;
         }
         else
         {
            Z9503MRMovOrd = A9503MRMovOrd ;
            Z9504MRMovFch = A9504MRMovFch ;
            Z9507MRMovDsc = A9507MRMovDsc ;
            Z9508MRMovCnt = A9508MRMovCnt ;
            Z9509MRMovPre = A9509MRMovPre ;
            Z9505MRMovTpo = A9505MRMovTpo ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z9502MRMov = A9502MRMov ;
         Z9503MRMovOrd = A9503MRMovOrd ;
         Z9504MRMovFch = A9504MRMovFch ;
         Z9507MRMovDsc = A9507MRMovDsc ;
         Z9508MRMovCnt = A9508MRMovCnt ;
         Z9509MRMovPre = A9509MRMovPre ;
         Z396EmprCod = A396EmprCod ;
         Z9492MRCod = A9492MRCod ;
         Z9505MRMovTpo = A9505MRMovTpo ;
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

   public void load1QT1239( )
   {
      /* Using cursor T01QT6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1239 = (short)(1) ;
         A9503MRMovOrd = T01QT6_A9503MRMovOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9503MRMovOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9503MRMovOrd), 8, 0));
         A9504MRMovFch = T01QT6_A9504MRMovFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9504MRMovFch", localUtil.ttoc( A9504MRMovFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9507MRMovDsc = T01QT6_A9507MRMovDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9507MRMovDsc", A9507MRMovDsc);
         A9508MRMovCnt = T01QT6_A9508MRMovCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9508MRMovCnt", GXutil.ltrimstr( A9508MRMovCnt, 10, 3));
         A9509MRMovPre = T01QT6_A9509MRMovPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9509MRMovPre", GXutil.ltrimstr( A9509MRMovPre, 12, 3));
         A9505MRMovTpo = T01QT6_A9505MRMovTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9505MRMovTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9505MRMovTpo), 8, 0));
         zm1QT1239( -1) ;
      }
      pr_default.close(4);
      onLoadActions1QT1239( ) ;
   }

   public void onLoadActions1QT1239( )
   {
   }

   public void checkExtendedTable1QT1239( )
   {
      nIsDirty_1239 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QT5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9505MRMovTpo)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMovTpo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRMOVTPO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      /* Using cursor T01QT4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1QT1239( )
   {
      pr_default.close(3);
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A9505MRMovTpo )
   {
      /* Using cursor T01QT7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9505MRMovTpo)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMovTpo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRMOVTPO");
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

   public void gxload_2( String A396EmprCod ,
                         int A9492MRCod )
   {
      /* Using cursor T01QT8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRCOD");
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

   public void getKey1QT1239( )
   {
      /* Using cursor T01QT9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1239 = (short)(1) ;
      }
      else
      {
         RcdFound1239 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QT1239( 1) ;
         RcdFound1239 = (short)(1) ;
         A9502MRMov = T01QT3_A9502MRMov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9502MRMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9502MRMov), 10, 0));
         A9503MRMovOrd = T01QT3_A9503MRMovOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9503MRMovOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9503MRMovOrd), 8, 0));
         A9504MRMovFch = T01QT3_A9504MRMovFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9504MRMovFch", localUtil.ttoc( A9504MRMovFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9507MRMovDsc = T01QT3_A9507MRMovDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9507MRMovDsc", A9507MRMovDsc);
         A9508MRMovCnt = T01QT3_A9508MRMovCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9508MRMovCnt", GXutil.ltrimstr( A9508MRMovCnt, 10, 3));
         A9509MRMovPre = T01QT3_A9509MRMovPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9509MRMovPre", GXutil.ltrimstr( A9509MRMovPre, 12, 3));
         A396EmprCod = T01QT3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = T01QT3_A9492MRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         A9505MRMovTpo = T01QT3_A9505MRMovTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9505MRMovTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9505MRMovTpo), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z9492MRCod = A9492MRCod ;
         Z9502MRMov = A9502MRMov ;
         sMode1239 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1QT1239( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1239 = (short)(0) ;
            initializeNonKey1QT1239( ) ;
         }
         Gx_mode = sMode1239 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1239 = (short)(0) ;
         initializeNonKey1QT1239( ) ;
         sMode1239 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1239 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QT1239( ) ;
      if ( RcdFound1239 == 0 )
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
      RcdFound1239 = (short)(0) ;
      /* Using cursor T01QT10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A9492MRCod), A396EmprCod, Long.valueOf(A9502MRMov)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QT10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QT10_A9492MRCod[0] < A9492MRCod ) || ( T01QT10_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(T01QT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QT10_A9502MRMov[0] < A9502MRMov ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QT10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QT10_A9492MRCod[0] > A9492MRCod ) || ( T01QT10_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(T01QT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QT10_A9502MRMov[0] > A9502MRMov ) ) )
         {
            A396EmprCod = T01QT10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9492MRCod = T01QT10_A9492MRCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
            A9502MRMov = T01QT10_A9502MRMov[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9502MRMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9502MRMov), 10, 0));
            RcdFound1239 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1239 = (short)(0) ;
      /* Using cursor T01QT11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A9492MRCod), A396EmprCod, Long.valueOf(A9502MRMov)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QT11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QT11_A9492MRCod[0] > A9492MRCod ) || ( T01QT11_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(T01QT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QT11_A9502MRMov[0] > A9502MRMov ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QT11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QT11_A9492MRCod[0] < A9492MRCod ) || ( T01QT11_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(T01QT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QT11_A9502MRMov[0] < A9502MRMov ) ) )
         {
            A396EmprCod = T01QT11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9492MRCod = T01QT11_A9492MRCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
            A9502MRMov = T01QT11_A9502MRMov[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9502MRMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9502MRMov), 10, 0));
            RcdFound1239 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QT1239( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QT1239( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1239 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9492MRCod != Z9492MRCod ) || ( A9502MRMov != Z9502MRMov ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A9492MRCod = Z9492MRCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
               A9502MRMov = Z9502MRMov ;
               httpContext.ajax_rsp_assign_attri("", false, "A9502MRMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9502MRMov), 10, 0));
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
               update1QT1239( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9492MRCod != Z9492MRCod ) || ( A9502MRMov != Z9502MRMov ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QT1239( ) ;
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
                  insert1QT1239( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9492MRCod != Z9492MRCod ) || ( A9502MRMov != Z9502MRMov ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = Z9492MRCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         A9502MRMov = Z9502MRMov ;
         httpContext.ajax_rsp_assign_attri("", false, "A9502MRMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9502MRMov), 10, 0));
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
      if ( RcdFound1239 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMRMovOrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1QT1239( ) ;
      if ( RcdFound1239 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMRMovOrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QT1239( ) ;
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
      if ( RcdFound1239 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMRMovOrd_Internalname ;
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
      if ( RcdFound1239 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMRMovOrd_Internalname ;
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
      scanStart1QT1239( ) ;
      if ( RcdFound1239 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1239 != 0 )
         {
            scanNext1QT1239( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMRMovOrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QT1239( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1QT1239( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QT2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMReMov"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z9503MRMovOrd != T01QT2_A9503MRMovOrd[0] ) || !( GXutil.dateCompare(Z9504MRMovFch, T01QT2_A9504MRMovFch[0]) ) || ( GXutil.strcmp(Z9507MRMovDsc, T01QT2_A9507MRMovDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z9508MRMovCnt, T01QT2_A9508MRMovCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9509MRMovPre, T01QT2_A9509MRMovPre[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z9505MRMovTpo != T01QT2_A9505MRMovTpo[0] ) )
         {
            if ( Z9503MRMovOrd != T01QT2_A9503MRMovOrd[0] )
            {
               GXutil.writeLogln("mremov:[seudo value changed for attri]"+"MRMovOrd");
               GXutil.writeLogRaw("Old: ",Z9503MRMovOrd);
               GXutil.writeLogRaw("Current: ",T01QT2_A9503MRMovOrd[0]);
            }
            if ( !( GXutil.dateCompare(Z9504MRMovFch, T01QT2_A9504MRMovFch[0]) ) )
            {
               GXutil.writeLogln("mremov:[seudo value changed for attri]"+"MRMovFch");
               GXutil.writeLogRaw("Old: ",Z9504MRMovFch);
               GXutil.writeLogRaw("Current: ",T01QT2_A9504MRMovFch[0]);
            }
            if ( GXutil.strcmp(Z9507MRMovDsc, T01QT2_A9507MRMovDsc[0]) != 0 )
            {
               GXutil.writeLogln("mremov:[seudo value changed for attri]"+"MRMovDsc");
               GXutil.writeLogRaw("Old: ",Z9507MRMovDsc);
               GXutil.writeLogRaw("Current: ",T01QT2_A9507MRMovDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z9508MRMovCnt, T01QT2_A9508MRMovCnt[0]) != 0 )
            {
               GXutil.writeLogln("mremov:[seudo value changed for attri]"+"MRMovCnt");
               GXutil.writeLogRaw("Old: ",Z9508MRMovCnt);
               GXutil.writeLogRaw("Current: ",T01QT2_A9508MRMovCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9509MRMovPre, T01QT2_A9509MRMovPre[0]) != 0 )
            {
               GXutil.writeLogln("mremov:[seudo value changed for attri]"+"MRMovPre");
               GXutil.writeLogRaw("Old: ",Z9509MRMovPre);
               GXutil.writeLogRaw("Current: ",T01QT2_A9509MRMovPre[0]);
            }
            if ( Z9505MRMovTpo != T01QT2_A9505MRMovTpo[0] )
            {
               GXutil.writeLogln("mremov:[seudo value changed for attri]"+"MRMovTpo");
               GXutil.writeLogRaw("Old: ",Z9505MRMovTpo);
               GXutil.writeLogRaw("Current: ",T01QT2_A9505MRMovTpo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMReMov"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QT1239( )
   {
      beforeValidate1QT1239( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QT1239( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QT1239( 0) ;
         checkOptimisticConcurrency1QT1239( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QT1239( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QT1239( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QT12 */
                  pr_default.execute(10, new Object[] {Long.valueOf(A9502MRMov), Integer.valueOf(A9503MRMovOrd), A9504MRMovFch, A9507MRMovDsc, A9508MRMovCnt, A9509MRMovPre, A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A9505MRMovTpo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReMov");
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
                        resetCaption1QT0( ) ;
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
            load1QT1239( ) ;
         }
         endLevel1QT1239( ) ;
      }
      closeExtendedTableCursors1QT1239( ) ;
   }

   public void update1QT1239( )
   {
      beforeValidate1QT1239( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QT1239( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QT1239( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QT1239( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QT1239( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QT13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A9503MRMovOrd), A9504MRMovFch, A9507MRMovDsc, A9508MRMovCnt, A9509MRMovPre, Integer.valueOf(A9505MRMovTpo), A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReMov");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMReMov"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QT1239( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1QT0( ) ;
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
         endLevel1QT1239( ) ;
      }
      closeExtendedTableCursors1QT1239( ) ;
   }

   public void deferredUpdate1QT1239( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QT1239( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QT1239( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QT1239( ) ;
         afterConfirm1QT1239( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QT1239( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QT14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReMov");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1239 == 0 )
                     {
                        initAll1QT1239( ) ;
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
                     resetCaption1QT0( ) ;
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
      sMode1239 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QT1239( ) ;
      Gx_mode = sMode1239 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QT1239( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1QT1239( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QT1239( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mremov");
         if ( AnyError == 0 )
         {
            confirmValues1QT0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mremov");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QT1239( )
   {
      /* Using cursor T01QT15 */
      pr_default.execute(13);
      RcdFound1239 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1239 = (short)(1) ;
         A396EmprCod = T01QT15_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = T01QT15_A9492MRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         A9502MRMov = T01QT15_A9502MRMov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9502MRMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9502MRMov), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QT1239( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1239 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1239 = (short)(1) ;
         A396EmprCod = T01QT15_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = T01QT15_A9492MRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         A9502MRMov = T01QT15_A9502MRMov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9502MRMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9502MRMov), 10, 0));
      }
   }

   public void scanEnd1QT1239( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1QT1239( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QT1239( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QT1239( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QT1239( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QT1239( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QT1239( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QT1239( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMRCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), true);
      edtMRMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMov_Enabled), 5, 0), true);
      edtMRMovOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovOrd_Enabled), 5, 0), true);
      edtMRMovFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovFch_Enabled), 5, 0), true);
      edtMRMovTpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovTpo_Enabled), 5, 0), true);
      edtMRMovDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovDsc_Enabled), 5, 0), true);
      edtMRMovCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovCnt_Enabled), 5, 0), true);
      edtMRMovPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovPre_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QT1239( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QT0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mremov", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9492MRCod", GXutil.ltrim( localUtil.ntoc( Z9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9502MRMov", GXutil.ltrim( localUtil.ntoc( Z9502MRMov, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9503MRMovOrd", GXutil.ltrim( localUtil.ntoc( Z9503MRMovOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9504MRMovFch", localUtil.ttoc( Z9504MRMovFch, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9507MRMovDsc", GXutil.rtrim( Z9507MRMovDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9508MRMovCnt", GXutil.ltrim( localUtil.ntoc( Z9508MRMovCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9509MRMovPre", GXutil.ltrim( localUtil.ntoc( Z9509MRMovPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9505MRMovTpo", GXutil.ltrim( localUtil.ntoc( Z9505MRMovTpo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.mremov", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "MReMov" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Movimientos Repuestos", "") ;
   }

   public void initializeNonKey1QT1239( )
   {
      A9503MRMovOrd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9503MRMovOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9503MRMovOrd), 8, 0));
      A9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A9504MRMovFch", localUtil.ttoc( A9504MRMovFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9505MRMovTpo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9505MRMovTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9505MRMovTpo), 8, 0));
      A9507MRMovDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9507MRMovDsc", A9507MRMovDsc);
      A9508MRMovCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9508MRMovCnt", GXutil.ltrimstr( A9508MRMovCnt, 10, 3));
      A9509MRMovPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9509MRMovPre", GXutil.ltrimstr( A9509MRMovPre, 12, 3));
      Z9503MRMovOrd = 0 ;
      Z9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      Z9507MRMovDsc = "" ;
      Z9508MRMovCnt = DecimalUtil.ZERO ;
      Z9509MRMovPre = DecimalUtil.ZERO ;
      Z9505MRMovTpo = 0 ;
   }

   public void initAll1QT1239( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9492MRCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
      A9502MRMov = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9502MRMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9502MRMov), 10, 0));
      initializeNonKey1QT1239( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016375273", true, true);
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
      httpContext.AddJavascriptSource("mremov.js", "?202661016375273", false, true);
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
      edtMRCod_Internalname = "MRCOD" ;
      edtMRMov_Internalname = "MRMOV" ;
      edtMRMovOrd_Internalname = "MRMOVORD" ;
      edtMRMovFch_Internalname = "MRMOVFCH" ;
      edtMRMovTpo_Internalname = "MRMOVTPO" ;
      edtMRMovDsc_Internalname = "MRMOVDSC" ;
      edtMRMovCnt_Internalname = "MRMOVCNT" ;
      edtMRMovPre_Internalname = "MRMOVPRE" ;
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
      Form.setCaption( httpContext.getMessage( "Movimientos Repuestos", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMRMovPre_Jsonclick = "" ;
      edtMRMovPre_Enabled = 1 ;
      edtMRMovCnt_Jsonclick = "" ;
      edtMRMovCnt_Enabled = 1 ;
      edtMRMovDsc_Jsonclick = "" ;
      edtMRMovDsc_Enabled = 1 ;
      edtMRMovTpo_Jsonclick = "" ;
      edtMRMovTpo_Enabled = 1 ;
      edtMRMovFch_Jsonclick = "" ;
      edtMRMovFch_Enabled = 1 ;
      edtMRMovOrd_Jsonclick = "" ;
      edtMRMovOrd_Enabled = 1 ;
      edtMRMov_Jsonclick = "" ;
      edtMRMov_Enabled = 1 ;
      edtMRCod_Jsonclick = "" ;
      edtMRCod_Enabled = 1 ;
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
      /* Using cursor T01QT16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(14);
      GX_FocusControl = edtMRMovOrd_Internalname ;
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

   public void valid_Mrcod( )
   {
      /* Using cursor T01QT16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Mrmov( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9503MRMovOrd", GXutil.ltrim( localUtil.ntoc( A9503MRMovOrd, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9504MRMovFch", localUtil.ttoc( A9504MRMovFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A9505MRMovTpo", GXutil.ltrim( localUtil.ntoc( A9505MRMovTpo, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9507MRMovDsc", GXutil.rtrim( A9507MRMovDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A9508MRMovCnt", GXutil.ltrim( localUtil.ntoc( A9508MRMovCnt, (byte)(10), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9509MRMovPre", GXutil.ltrim( localUtil.ntoc( A9509MRMovPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9492MRCod", GXutil.ltrim( localUtil.ntoc( Z9492MRCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9502MRMov", GXutil.ltrim( localUtil.ntoc( Z9502MRMov, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9503MRMovOrd", GXutil.ltrim( localUtil.ntoc( Z9503MRMovOrd, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9504MRMovFch", localUtil.ttoc( Z9504MRMovFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9505MRMovTpo", GXutil.ltrim( localUtil.ntoc( Z9505MRMovTpo, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9507MRMovDsc", GXutil.rtrim( Z9507MRMovDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9508MRMovCnt", GXutil.ltrim( localUtil.ntoc( Z9508MRMovCnt, (byte)(10), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9509MRMovPre", GXutil.ltrim( localUtil.ntoc( Z9509MRMovPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Mrmovtpo( )
   {
      /* Using cursor T01QT17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9505MRMovTpo)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMovTpo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRMOVTPO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
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
      setEventMetadata("VALID_MRCOD","{handler:'valid_Mrcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_MRCOD",",oparms:[]}");
      setEventMetadata("VALID_MRMOV","{handler:'valid_Mrmov',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'},{av:'A9502MRMov',fld:'MRMOV',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MRMOV",",oparms:[{av:'A9503MRMovOrd',fld:'MRMOVORD',pic:'ZZZZZZZ9'},{av:'A9504MRMovFch',fld:'MRMOVFCH',pic:'99/99/99 99:99'},{av:'A9505MRMovTpo',fld:'MRMOVTPO',pic:'ZZZZZZZ9'},{av:'A9507MRMovDsc',fld:'MRMOVDSC',pic:''},{av:'A9508MRMovCnt',fld:'MRMOVCNT',pic:'ZZZ,ZZ9.999'},{av:'A9509MRMovPre',fld:'MRMOVPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9492MRCod'},{av:'Z9502MRMov'},{av:'Z9503MRMovOrd'},{av:'Z9504MRMovFch'},{av:'Z9505MRMovTpo'},{av:'Z9507MRMovDsc'},{av:'Z9508MRMovCnt'},{av:'Z9509MRMovPre'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_MRMOVTPO","{handler:'valid_Mrmovtpo',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9505MRMovTpo',fld:'MRMOVTPO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_MRMOVTPO",",oparms:[]}");
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
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      Z9507MRMovDsc = "" ;
      Z9508MRMovCnt = DecimalUtil.ZERO ;
      Z9509MRMovPre = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      A9507MRMovDsc = "" ;
      A9508MRMovCnt = DecimalUtil.ZERO ;
      A9509MRMovPre = DecimalUtil.ZERO ;
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
      T01QT6_A9502MRMov = new long[1] ;
      T01QT6_A9503MRMovOrd = new int[1] ;
      T01QT6_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01QT6_A9507MRMovDsc = new String[] {""} ;
      T01QT6_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QT6_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QT6_A396EmprCod = new String[] {""} ;
      T01QT6_A9492MRCod = new int[1] ;
      T01QT6_A9505MRMovTpo = new int[1] ;
      T01QT5_A396EmprCod = new String[] {""} ;
      T01QT4_A396EmprCod = new String[] {""} ;
      T01QT7_A396EmprCod = new String[] {""} ;
      T01QT8_A396EmprCod = new String[] {""} ;
      T01QT9_A396EmprCod = new String[] {""} ;
      T01QT9_A9492MRCod = new int[1] ;
      T01QT9_A9502MRMov = new long[1] ;
      T01QT3_A9502MRMov = new long[1] ;
      T01QT3_A9503MRMovOrd = new int[1] ;
      T01QT3_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01QT3_A9507MRMovDsc = new String[] {""} ;
      T01QT3_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QT3_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QT3_A396EmprCod = new String[] {""} ;
      T01QT3_A9492MRCod = new int[1] ;
      T01QT3_A9505MRMovTpo = new int[1] ;
      sMode1239 = "" ;
      T01QT10_A396EmprCod = new String[] {""} ;
      T01QT10_A9492MRCod = new int[1] ;
      T01QT10_A9502MRMov = new long[1] ;
      T01QT11_A396EmprCod = new String[] {""} ;
      T01QT11_A9492MRCod = new int[1] ;
      T01QT11_A9502MRMov = new long[1] ;
      T01QT2_A9502MRMov = new long[1] ;
      T01QT2_A9503MRMovOrd = new int[1] ;
      T01QT2_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01QT2_A9507MRMovDsc = new String[] {""} ;
      T01QT2_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QT2_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QT2_A396EmprCod = new String[] {""} ;
      T01QT2_A9492MRCod = new int[1] ;
      T01QT2_A9505MRMovTpo = new int[1] ;
      T01QT15_A396EmprCod = new String[] {""} ;
      T01QT15_A9492MRCod = new int[1] ;
      T01QT15_A9502MRMov = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01QT16_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      ZZ9507MRMovDsc = "" ;
      ZZ9508MRMovCnt = DecimalUtil.ZERO ;
      ZZ9509MRMovPre = DecimalUtil.ZERO ;
      T01QT17_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mremov__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mremov__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mremov__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mremov__default(),
         new Object[] {
             new Object[] {
            T01QT2_A9502MRMov, T01QT2_A9503MRMovOrd, T01QT2_A9504MRMovFch, T01QT2_A9507MRMovDsc, T01QT2_A9508MRMovCnt, T01QT2_A9509MRMovPre, T01QT2_A396EmprCod, T01QT2_A9492MRCod, T01QT2_A9505MRMovTpo
            }
            , new Object[] {
            T01QT3_A9502MRMov, T01QT3_A9503MRMovOrd, T01QT3_A9504MRMovFch, T01QT3_A9507MRMovDsc, T01QT3_A9508MRMovCnt, T01QT3_A9509MRMovPre, T01QT3_A396EmprCod, T01QT3_A9492MRCod, T01QT3_A9505MRMovTpo
            }
            , new Object[] {
            T01QT4_A396EmprCod
            }
            , new Object[] {
            T01QT5_A396EmprCod
            }
            , new Object[] {
            T01QT6_A9502MRMov, T01QT6_A9503MRMovOrd, T01QT6_A9504MRMovFch, T01QT6_A9507MRMovDsc, T01QT6_A9508MRMovCnt, T01QT6_A9509MRMovPre, T01QT6_A396EmprCod, T01QT6_A9492MRCod, T01QT6_A9505MRMovTpo
            }
            , new Object[] {
            T01QT7_A396EmprCod
            }
            , new Object[] {
            T01QT8_A396EmprCod
            }
            , new Object[] {
            T01QT9_A396EmprCod, T01QT9_A9492MRCod, T01QT9_A9502MRMov
            }
            , new Object[] {
            T01QT10_A396EmprCod, T01QT10_A9492MRCod, T01QT10_A9502MRMov
            }
            , new Object[] {
            T01QT11_A396EmprCod, T01QT11_A9492MRCod, T01QT11_A9502MRMov
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QT15_A396EmprCod, T01QT15_A9492MRCod, T01QT15_A9502MRMov
            }
            , new Object[] {
            T01QT16_A396EmprCod
            }
            , new Object[] {
            T01QT17_A396EmprCod
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1239 ;
   private short nIsDirty_1239 ;
   private int Z9492MRCod ;
   private int Z9503MRMovOrd ;
   private int Z9505MRMovTpo ;
   private int A9505MRMovTpo ;
   private int A9492MRCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMRCod_Enabled ;
   private int edtMRMov_Enabled ;
   private int A9503MRMovOrd ;
   private int edtMRMovOrd_Enabled ;
   private int edtMRMovFch_Enabled ;
   private int edtMRMovTpo_Enabled ;
   private int edtMRMovDsc_Enabled ;
   private int edtMRMovCnt_Enabled ;
   private int edtMRMovPre_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ9492MRCod ;
   private int ZZ9503MRMovOrd ;
   private int ZZ9505MRMovTpo ;
   private long Z9502MRMov ;
   private long A9502MRMov ;
   private long ZZ9502MRMov ;
   private java.math.BigDecimal Z9508MRMovCnt ;
   private java.math.BigDecimal Z9509MRMovPre ;
   private java.math.BigDecimal A9508MRMovCnt ;
   private java.math.BigDecimal A9509MRMovPre ;
   private java.math.BigDecimal ZZ9508MRMovCnt ;
   private java.math.BigDecimal ZZ9509MRMovPre ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z9507MRMovDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
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
   private String edtMRCod_Internalname ;
   private String edtMRCod_Jsonclick ;
   private String edtMRMov_Internalname ;
   private String edtMRMov_Jsonclick ;
   private String edtMRMovOrd_Internalname ;
   private String edtMRMovOrd_Jsonclick ;
   private String edtMRMovFch_Internalname ;
   private String edtMRMovFch_Jsonclick ;
   private String edtMRMovTpo_Internalname ;
   private String edtMRMovTpo_Jsonclick ;
   private String edtMRMovDsc_Internalname ;
   private String A9507MRMovDsc ;
   private String edtMRMovDsc_Jsonclick ;
   private String edtMRMovCnt_Internalname ;
   private String edtMRMovCnt_Jsonclick ;
   private String edtMRMovPre_Internalname ;
   private String edtMRMovPre_Jsonclick ;
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
   private String sMode1239 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ9507MRMovDsc ;
   private java.util.Date Z9504MRMovFch ;
   private java.util.Date A9504MRMovFch ;
   private java.util.Date ZZ9504MRMovFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private long[] T01QT6_A9502MRMov ;
   private int[] T01QT6_A9503MRMovOrd ;
   private java.util.Date[] T01QT6_A9504MRMovFch ;
   private String[] T01QT6_A9507MRMovDsc ;
   private java.math.BigDecimal[] T01QT6_A9508MRMovCnt ;
   private java.math.BigDecimal[] T01QT6_A9509MRMovPre ;
   private String[] T01QT6_A396EmprCod ;
   private int[] T01QT6_A9492MRCod ;
   private int[] T01QT6_A9505MRMovTpo ;
   private String[] T01QT5_A396EmprCod ;
   private String[] T01QT4_A396EmprCod ;
   private String[] T01QT7_A396EmprCod ;
   private String[] T01QT8_A396EmprCod ;
   private String[] T01QT9_A396EmprCod ;
   private int[] T01QT9_A9492MRCod ;
   private long[] T01QT9_A9502MRMov ;
   private long[] T01QT3_A9502MRMov ;
   private int[] T01QT3_A9503MRMovOrd ;
   private java.util.Date[] T01QT3_A9504MRMovFch ;
   private String[] T01QT3_A9507MRMovDsc ;
   private java.math.BigDecimal[] T01QT3_A9508MRMovCnt ;
   private java.math.BigDecimal[] T01QT3_A9509MRMovPre ;
   private String[] T01QT3_A396EmprCod ;
   private int[] T01QT3_A9492MRCod ;
   private int[] T01QT3_A9505MRMovTpo ;
   private String[] T01QT10_A396EmprCod ;
   private int[] T01QT10_A9492MRCod ;
   private long[] T01QT10_A9502MRMov ;
   private String[] T01QT11_A396EmprCod ;
   private int[] T01QT11_A9492MRCod ;
   private long[] T01QT11_A9502MRMov ;
   private long[] T01QT2_A9502MRMov ;
   private int[] T01QT2_A9503MRMovOrd ;
   private java.util.Date[] T01QT2_A9504MRMovFch ;
   private String[] T01QT2_A9507MRMovDsc ;
   private java.math.BigDecimal[] T01QT2_A9508MRMovCnt ;
   private java.math.BigDecimal[] T01QT2_A9509MRMovPre ;
   private String[] T01QT2_A396EmprCod ;
   private int[] T01QT2_A9492MRCod ;
   private int[] T01QT2_A9505MRMovTpo ;
   private String[] T01QT15_A396EmprCod ;
   private int[] T01QT15_A9492MRCod ;
   private long[] T01QT15_A9502MRMov ;
   private String[] T01QT16_A396EmprCod ;
   private String[] T01QT17_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mremov__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mremov__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mremov__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mremov__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QT2", "SELECT MRMov, MRMovOrd, MRMovFch, MRMovDsc, MRMovCnt, MRMovPre, EmprCod, MRCod, MRMovTpo FROM TXPMReMov WHERE EmprCod = ? AND MRCod = ? AND MRMov = ?  FOR UPDATE OF MRMovOrd, MRMovFch, MRMovDsc, MRMovCnt, MRMovPre, MRMovTpo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QT3", "SELECT MRMov, MRMovOrd, MRMovFch, MRMovDsc, MRMovCnt, MRMovPre, EmprCod, MRCod, MRMovTpo FROM TXPMReMov WHERE EmprCod = ? AND MRCod = ? AND MRMov = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QT4", "SELECT EmprCod FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QT5", "SELECT EmprCod FROM TXPMTPOMO WHERE EmprCod = ? AND MTMovCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QT6", "SELECT /*+ FIRST_ROWS(100) */ TM1.MRMov, TM1.MRMovOrd, TM1.MRMovFch, TM1.MRMovDsc, TM1.MRMovCnt, TM1.MRMovPre, TM1.EmprCod, TM1.MRCod, TM1.MRMovTpo AS MRMovTpo FROM TXPMReMov TM1 WHERE TM1.EmprCod = ? and TM1.MRCod = ? and TM1.MRMov = ? ORDER BY TM1.EmprCod, TM1.MRCod, TM1.MRMov ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QT7", "SELECT EmprCod FROM TXPMTPOMO WHERE EmprCod = ? AND MTMovCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QT8", "SELECT EmprCod FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QT9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRCod, MRMov FROM TXPMReMov WHERE EmprCod = ? AND MRCod = ? AND MRMov = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QT10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRCod, MRMov FROM TXPMReMov WHERE ( EmprCod > ? or EmprCod = ? and MRCod > ? or MRCod = ? and EmprCod = ? and MRMov > ?) ORDER BY EmprCod, MRCod, MRMov) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QT11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRCod, MRMov FROM TXPMReMov WHERE ( EmprCod < ? or EmprCod = ? and MRCod < ? or MRCod = ? and EmprCod = ? and MRMov < ?) ORDER BY EmprCod DESC, MRCod DESC, MRMov DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QT12", "INSERT INTO TXPMReMov(MRMov, MRMovOrd, MRMovFch, MRMovDsc, MRMovCnt, MRMovPre, EmprCod, MRCod, MRMovTpo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMReMov")
         ,new UpdateCursor("T01QT13", "UPDATE TXPMReMov SET MRMovOrd=?, MRMovFch=?, MRMovDsc=?, MRMovCnt=?, MRMovPre=?, MRMovTpo=?  WHERE EmprCod = ? AND MRCod = ? AND MRMov = ?", GX_NOMASK, "TXPMReMov")
         ,new UpdateCursor("T01QT14", "DELETE FROM TXPMReMov  WHERE EmprCod = ? AND MRCod = ? AND MRMov = ?", GX_NOMASK, "TXPMReMov")
         ,new ForEachCursor("T01QT15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MRCod, MRMov FROM TXPMReMov ORDER BY EmprCod, MRCod, MRMov ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QT16", "SELECT EmprCod FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QT17", "SELECT EmprCod FROM TXPMTPOMO WHERE EmprCod = ? AND MTMovCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 15 :
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
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setString(4, (String)parms[3], 30);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

