package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hdsto1_impl extends GXDataArea
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
         A10746Stp_hdr = (int)(GXutil.lval( httpContext.GetPar( "Stp_hdr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         A10747Stp_r = (byte)(GXutil.lval( httpContext.GetPar( "Stp_r"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         A10748Stp_p = httpContext.GetPar( "Stp_p") ;
         httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A10746Stp_hdr, A10747Stp_r, A10748Stp_p) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla HDSTO1", ""), (short)(0)) ;
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

   public hdsto1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hdsto1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hdsto1_impl.class ));
   }

   public hdsto1_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla HDSTO1", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_HDSTO1.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_HDSTO1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HDSTO1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtStp_hdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtStp_hdr_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A10746Stp_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtStp_hdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10746Stp_hdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10746Stp_hdr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_hdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtStp_hdr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtStp_r_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtStp_r_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_r_Internalname, GXutil.ltrim( localUtil.ntoc( A10747Stp_r, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtStp_r_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10747Stp_r), "9") : localUtil.format( DecimalUtil.doubleToDec(A10747Stp_r), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_r_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtStp_r_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtStp_p_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtStp_p_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_p_Internalname, GXutil.rtrim( A10748Stp_p), GXutil.rtrim( localUtil.format( A10748Stp_p, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_p_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtStp_p_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtStp_Lin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtStp_Lin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_Lin_Internalname, GXutil.ltrim( localUtil.ntoc( A10750Stp_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtStp_Lin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10750Stp_Lin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10750Stp_Lin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_Lin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtStp_Lin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtStp_Dia_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtStp_Dia_Internalname, httpContext.getMessage( "Dia Suspension", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtStp_Dia_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_Dia_Internalname, localUtil.ttoc( A10751Stp_Dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10751Stp_Dia, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_Dia_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtStp_Dia_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HDSTO1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtStp_Dia_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtStp_Dia_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_HDSTO1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtStp_Mot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtStp_Mot_Internalname, httpContext.getMessage( "Motivo Suspension", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtStp_Mot_Internalname, A10752Stp_Mot, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", (short)(0), 1, edtStp_Mot_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtStp_Term_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtStp_Term_Internalname, httpContext.getMessage( "Terminal", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_Term_Internalname, GXutil.rtrim( A10753Stp_Term), GXutil.rtrim( localUtil.format( A10753Stp_Term, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_Term_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtStp_Term_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtStp_Usu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtStp_Usu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_Usu_Internalname, GXutil.rtrim( A10754Stp_Usu), GXutil.rtrim( localUtil.format( A10754Stp_Usu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_Usu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtStp_Usu_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtStp_Est_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtStp_Est_Internalname, httpContext.getMessage( "Estado: 1 Suspendida 2 Activa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_Est_Internalname, GXutil.ltrim( localUtil.ntoc( A10755Stp_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtStp_Est_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10755Stp_Est), "9") : localUtil.format( DecimalUtil.doubleToDec(A10755Stp_Est), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_Est_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtStp_Est_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtStp_DiaA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtStp_DiaA_Internalname, httpContext.getMessage( "Dia Activacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtStp_DiaA_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_DiaA_Internalname, localUtil.ttoc( A10756Stp_DiaA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10756Stp_DiaA, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_DiaA_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtStp_DiaA_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HDSTO1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtStp_DiaA_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtStp_DiaA_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_HDSTO1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtStp_MotA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtStp_MotA_Internalname, httpContext.getMessage( "Motivo Activacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtStp_MotA_Internalname, A10757Stp_MotA, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", (short)(0), 1, edtStp_MotA_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtStp_UsuAct_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtStp_UsuAct_Internalname, httpContext.getMessage( "Usuario Activacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_UsuAct_Internalname, GXutil.rtrim( A11688Stp_UsuAct), GXutil.rtrim( localUtil.format( A11688Stp_UsuAct, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_UsuAct_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtStp_UsuAct_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtStp_TermAc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtStp_TermAc_Internalname, httpContext.getMessage( "Terminal Activacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_TermAc_Internalname, GXutil.rtrim( A11689Stp_TermAc), GXutil.rtrim( localUtil.format( A11689Stp_TermAc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_TermAc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtStp_TermAc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HDSTO1.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HDSTO1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HDSTO1.htm");
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
         Z10746Stp_hdr = (int)(localUtil.ctol( httpContext.cgiGet( "Z10746Stp_hdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10747Stp_r = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10747Stp_r"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10748Stp_p = httpContext.cgiGet( "Z10748Stp_p") ;
         Z10750Stp_Lin = (short)(localUtil.ctol( httpContext.cgiGet( "Z10750Stp_Lin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10751Stp_Dia = localUtil.ctot( httpContext.cgiGet( "Z10751Stp_Dia"), 0) ;
         Z10752Stp_Mot = httpContext.cgiGet( "Z10752Stp_Mot") ;
         Z10753Stp_Term = httpContext.cgiGet( "Z10753Stp_Term") ;
         Z10754Stp_Usu = httpContext.cgiGet( "Z10754Stp_Usu") ;
         Z10755Stp_Est = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10755Stp_Est"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10756Stp_DiaA = localUtil.ctot( httpContext.cgiGet( "Z10756Stp_DiaA"), 0) ;
         Z10757Stp_MotA = httpContext.cgiGet( "Z10757Stp_MotA") ;
         Z11688Stp_UsuAct = httpContext.cgiGet( "Z11688Stp_UsuAct") ;
         Z11689Stp_TermAc = httpContext.cgiGet( "Z11689Stp_TermAc") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtStp_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtStp_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "STP_HDR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtStp_hdr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10746Stp_hdr = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         }
         else
         {
            A10746Stp_hdr = (int)(localUtil.ctol( httpContext.cgiGet( edtStp_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtStp_r_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtStp_r_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "STP_R");
            AnyError = (short)(1) ;
            GX_FocusControl = edtStp_r_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10747Stp_r = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         }
         else
         {
            A10747Stp_r = (byte)(localUtil.ctol( httpContext.cgiGet( edtStp_r_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         }
         A10748Stp_p = httpContext.cgiGet( edtStp_p_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtStp_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtStp_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "STP_LIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtStp_Lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10750Stp_Lin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10750Stp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10750Stp_Lin), 4, 0));
         }
         else
         {
            A10750Stp_Lin = (short)(localUtil.ctol( httpContext.cgiGet( edtStp_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10750Stp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10750Stp_Lin), 4, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtStp_Dia_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "STP_DIA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtStp_Dia_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A10751Stp_Dia", localUtil.ttoc( A10751Stp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A10751Stp_Dia = localUtil.ctot( httpContext.cgiGet( edtStp_Dia_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10751Stp_Dia", localUtil.ttoc( A10751Stp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A10752Stp_Mot = httpContext.cgiGet( edtStp_Mot_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10752Stp_Mot", A10752Stp_Mot);
         A10753Stp_Term = httpContext.cgiGet( edtStp_Term_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10753Stp_Term", A10753Stp_Term);
         A10754Stp_Usu = httpContext.cgiGet( edtStp_Usu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10754Stp_Usu", A10754Stp_Usu);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtStp_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtStp_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "STP_EST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtStp_Est_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10755Stp_Est = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10755Stp_Est", GXutil.str( A10755Stp_Est, 1, 0));
         }
         else
         {
            A10755Stp_Est = (byte)(localUtil.ctol( httpContext.cgiGet( edtStp_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10755Stp_Est", GXutil.str( A10755Stp_Est, 1, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtStp_DiaA_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "STP_DIAA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtStp_DiaA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A10756Stp_DiaA", localUtil.ttoc( A10756Stp_DiaA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A10756Stp_DiaA = localUtil.ctot( httpContext.cgiGet( edtStp_DiaA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10756Stp_DiaA", localUtil.ttoc( A10756Stp_DiaA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A10757Stp_MotA = httpContext.cgiGet( edtStp_MotA_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10757Stp_MotA", A10757Stp_MotA);
         A11688Stp_UsuAct = httpContext.cgiGet( edtStp_UsuAct_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11688Stp_UsuAct", A11688Stp_UsuAct);
         A11689Stp_TermAc = httpContext.cgiGet( edtStp_TermAc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11689Stp_TermAc", A11689Stp_TermAc);
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
            A10746Stp_hdr = (int)(GXutil.lval( httpContext.GetPar( "Stp_hdr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
            A10747Stp_r = (byte)(GXutil.lval( httpContext.GetPar( "Stp_r"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
            A10748Stp_p = httpContext.GetPar( "Stp_p") ;
            httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
            A10750Stp_Lin = (short)(GXutil.lval( httpContext.GetPar( "Stp_Lin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10750Stp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10750Stp_Lin), 4, 0));
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
            initAll1QG1430( ) ;
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
      disableAttributes1QG1430( ) ;
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

   public void resetCaption1QG0( )
   {
   }

   public void zm1QG1430( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10751Stp_Dia = T01QG3_A10751Stp_Dia[0] ;
            Z10752Stp_Mot = T01QG3_A10752Stp_Mot[0] ;
            Z10753Stp_Term = T01QG3_A10753Stp_Term[0] ;
            Z10754Stp_Usu = T01QG3_A10754Stp_Usu[0] ;
            Z10755Stp_Est = T01QG3_A10755Stp_Est[0] ;
            Z10756Stp_DiaA = T01QG3_A10756Stp_DiaA[0] ;
            Z10757Stp_MotA = T01QG3_A10757Stp_MotA[0] ;
            Z11688Stp_UsuAct = T01QG3_A11688Stp_UsuAct[0] ;
            Z11689Stp_TermAc = T01QG3_A11689Stp_TermAc[0] ;
         }
         else
         {
            Z10751Stp_Dia = A10751Stp_Dia ;
            Z10752Stp_Mot = A10752Stp_Mot ;
            Z10753Stp_Term = A10753Stp_Term ;
            Z10754Stp_Usu = A10754Stp_Usu ;
            Z10755Stp_Est = A10755Stp_Est ;
            Z10756Stp_DiaA = A10756Stp_DiaA ;
            Z10757Stp_MotA = A10757Stp_MotA ;
            Z11688Stp_UsuAct = A11688Stp_UsuAct ;
            Z11689Stp_TermAc = A11689Stp_TermAc ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z10750Stp_Lin = A10750Stp_Lin ;
         Z10751Stp_Dia = A10751Stp_Dia ;
         Z10752Stp_Mot = A10752Stp_Mot ;
         Z10753Stp_Term = A10753Stp_Term ;
         Z10754Stp_Usu = A10754Stp_Usu ;
         Z10755Stp_Est = A10755Stp_Est ;
         Z10756Stp_DiaA = A10756Stp_DiaA ;
         Z10757Stp_MotA = A10757Stp_MotA ;
         Z11688Stp_UsuAct = A11688Stp_UsuAct ;
         Z11689Stp_TermAc = A11689Stp_TermAc ;
         Z396EmprCod = A396EmprCod ;
         Z10746Stp_hdr = A10746Stp_hdr ;
         Z10747Stp_r = A10747Stp_r ;
         Z10748Stp_p = A10748Stp_p ;
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

   public void load1QG1430( )
   {
      /* Using cursor T01QG6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Short.valueOf(A10750Stp_Lin)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1430 = (short)(1) ;
         A407EmprNom = T01QG6_A407EmprNom[0] ;
         n407EmprNom = T01QG6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10751Stp_Dia = T01QG6_A10751Stp_Dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10751Stp_Dia", localUtil.ttoc( A10751Stp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10752Stp_Mot = T01QG6_A10752Stp_Mot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10752Stp_Mot", A10752Stp_Mot);
         A10753Stp_Term = T01QG6_A10753Stp_Term[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10753Stp_Term", A10753Stp_Term);
         A10754Stp_Usu = T01QG6_A10754Stp_Usu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10754Stp_Usu", A10754Stp_Usu);
         A10755Stp_Est = T01QG6_A10755Stp_Est[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10755Stp_Est", GXutil.str( A10755Stp_Est, 1, 0));
         A10756Stp_DiaA = T01QG6_A10756Stp_DiaA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10756Stp_DiaA", localUtil.ttoc( A10756Stp_DiaA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10757Stp_MotA = T01QG6_A10757Stp_MotA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10757Stp_MotA", A10757Stp_MotA);
         A11688Stp_UsuAct = T01QG6_A11688Stp_UsuAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11688Stp_UsuAct", A11688Stp_UsuAct);
         A11689Stp_TermAc = T01QG6_A11689Stp_TermAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11689Stp_TermAc", A11689Stp_TermAc);
         zm1QG1430( -1) ;
      }
      pr_default.close(4);
      onLoadActions1QG1430( ) ;
   }

   public void onLoadActions1QG1430( )
   {
   }

   public void checkExtendedTable1QG1430( )
   {
      nIsDirty_1430 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QG4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01QG4_A407EmprNom[0] ;
      n407EmprNom = T01QG4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01QG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SUSPENSION HDR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "STP_P");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1QG1430( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01QG7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01QG7_A407EmprNom[0] ;
      n407EmprNom = T01QG7_n407EmprNom[0] ;
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
                         int A10746Stp_hdr ,
                         byte A10747Stp_r ,
                         String A10748Stp_p )
   {
      /* Using cursor T01QG8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SUSPENSION HDR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "STP_P");
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

   public void getKey1QG1430( )
   {
      /* Using cursor T01QG9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Short.valueOf(A10750Stp_Lin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1430 = (short)(1) ;
      }
      else
      {
         RcdFound1430 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Short.valueOf(A10750Stp_Lin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QG1430( 1) ;
         RcdFound1430 = (short)(1) ;
         A10750Stp_Lin = T01QG3_A10750Stp_Lin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10750Stp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10750Stp_Lin), 4, 0));
         A10751Stp_Dia = T01QG3_A10751Stp_Dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10751Stp_Dia", localUtil.ttoc( A10751Stp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10752Stp_Mot = T01QG3_A10752Stp_Mot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10752Stp_Mot", A10752Stp_Mot);
         A10753Stp_Term = T01QG3_A10753Stp_Term[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10753Stp_Term", A10753Stp_Term);
         A10754Stp_Usu = T01QG3_A10754Stp_Usu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10754Stp_Usu", A10754Stp_Usu);
         A10755Stp_Est = T01QG3_A10755Stp_Est[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10755Stp_Est", GXutil.str( A10755Stp_Est, 1, 0));
         A10756Stp_DiaA = T01QG3_A10756Stp_DiaA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10756Stp_DiaA", localUtil.ttoc( A10756Stp_DiaA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10757Stp_MotA = T01QG3_A10757Stp_MotA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10757Stp_MotA", A10757Stp_MotA);
         A11688Stp_UsuAct = T01QG3_A11688Stp_UsuAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11688Stp_UsuAct", A11688Stp_UsuAct);
         A11689Stp_TermAc = T01QG3_A11689Stp_TermAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11689Stp_TermAc", A11689Stp_TermAc);
         A396EmprCod = T01QG3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10746Stp_hdr = T01QG3_A10746Stp_hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         A10747Stp_r = T01QG3_A10747Stp_r[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         A10748Stp_p = T01QG3_A10748Stp_p[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
         Z396EmprCod = A396EmprCod ;
         Z10746Stp_hdr = A10746Stp_hdr ;
         Z10747Stp_r = A10747Stp_r ;
         Z10748Stp_p = A10748Stp_p ;
         Z10750Stp_Lin = A10750Stp_Lin ;
         sMode1430 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1QG1430( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1430 = (short)(0) ;
            initializeNonKey1QG1430( ) ;
         }
         Gx_mode = sMode1430 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1430 = (short)(0) ;
         initializeNonKey1QG1430( ) ;
         sMode1430 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1430 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QG1430( ) ;
      if ( RcdFound1430 == 0 )
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
      RcdFound1430 = (short)(0) ;
      /* Using cursor T01QG10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A10746Stp_hdr), Integer.valueOf(A10746Stp_hdr), A396EmprCod, Byte.valueOf(A10747Stp_r), Byte.valueOf(A10747Stp_r), Integer.valueOf(A10746Stp_hdr), A396EmprCod, A10748Stp_p, A10748Stp_p, Byte.valueOf(A10747Stp_r), Integer.valueOf(A10746Stp_hdr), A396EmprCod, Short.valueOf(A10750Stp_Lin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QG10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QG10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QG10_A10746Stp_hdr[0] < A10746Stp_hdr ) || ( T01QG10_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T01QG10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QG10_A10747Stp_r[0] < A10747Stp_r ) || ( T01QG10_A10747Stp_r[0] == A10747Stp_r ) && ( T01QG10_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T01QG10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QG10_A10748Stp_p[0], A10748Stp_p) < 0 ) || ( GXutil.strcmp(T01QG10_A10748Stp_p[0], A10748Stp_p) == 0 ) && ( T01QG10_A10747Stp_r[0] == A10747Stp_r ) && ( T01QG10_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T01QG10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QG10_A10750Stp_Lin[0] < A10750Stp_Lin ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QG10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QG10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QG10_A10746Stp_hdr[0] > A10746Stp_hdr ) || ( T01QG10_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T01QG10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QG10_A10747Stp_r[0] > A10747Stp_r ) || ( T01QG10_A10747Stp_r[0] == A10747Stp_r ) && ( T01QG10_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T01QG10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QG10_A10748Stp_p[0], A10748Stp_p) > 0 ) || ( GXutil.strcmp(T01QG10_A10748Stp_p[0], A10748Stp_p) == 0 ) && ( T01QG10_A10747Stp_r[0] == A10747Stp_r ) && ( T01QG10_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T01QG10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QG10_A10750Stp_Lin[0] > A10750Stp_Lin ) ) )
         {
            A396EmprCod = T01QG10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A10746Stp_hdr = T01QG10_A10746Stp_hdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
            A10747Stp_r = T01QG10_A10747Stp_r[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
            A10748Stp_p = T01QG10_A10748Stp_p[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
            A10750Stp_Lin = T01QG10_A10750Stp_Lin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10750Stp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10750Stp_Lin), 4, 0));
            RcdFound1430 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1430 = (short)(0) ;
      /* Using cursor T01QG11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A10746Stp_hdr), Integer.valueOf(A10746Stp_hdr), A396EmprCod, Byte.valueOf(A10747Stp_r), Byte.valueOf(A10747Stp_r), Integer.valueOf(A10746Stp_hdr), A396EmprCod, A10748Stp_p, A10748Stp_p, Byte.valueOf(A10747Stp_r), Integer.valueOf(A10746Stp_hdr), A396EmprCod, Short.valueOf(A10750Stp_Lin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QG11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QG11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QG11_A10746Stp_hdr[0] > A10746Stp_hdr ) || ( T01QG11_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T01QG11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QG11_A10747Stp_r[0] > A10747Stp_r ) || ( T01QG11_A10747Stp_r[0] == A10747Stp_r ) && ( T01QG11_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T01QG11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QG11_A10748Stp_p[0], A10748Stp_p) > 0 ) || ( GXutil.strcmp(T01QG11_A10748Stp_p[0], A10748Stp_p) == 0 ) && ( T01QG11_A10747Stp_r[0] == A10747Stp_r ) && ( T01QG11_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T01QG11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QG11_A10750Stp_Lin[0] > A10750Stp_Lin ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QG11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QG11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QG11_A10746Stp_hdr[0] < A10746Stp_hdr ) || ( T01QG11_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T01QG11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QG11_A10747Stp_r[0] < A10747Stp_r ) || ( T01QG11_A10747Stp_r[0] == A10747Stp_r ) && ( T01QG11_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T01QG11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QG11_A10748Stp_p[0], A10748Stp_p) < 0 ) || ( GXutil.strcmp(T01QG11_A10748Stp_p[0], A10748Stp_p) == 0 ) && ( T01QG11_A10747Stp_r[0] == A10747Stp_r ) && ( T01QG11_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T01QG11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QG11_A10750Stp_Lin[0] < A10750Stp_Lin ) ) )
         {
            A396EmprCod = T01QG11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A10746Stp_hdr = T01QG11_A10746Stp_hdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
            A10747Stp_r = T01QG11_A10747Stp_r[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
            A10748Stp_p = T01QG11_A10748Stp_p[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
            A10750Stp_Lin = T01QG11_A10750Stp_Lin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10750Stp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10750Stp_Lin), 4, 0));
            RcdFound1430 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QG1430( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QG1430( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1430 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10746Stp_hdr != Z10746Stp_hdr ) || ( A10747Stp_r != Z10747Stp_r ) || ( GXutil.strcmp(A10748Stp_p, Z10748Stp_p) != 0 ) || ( A10750Stp_Lin != Z10750Stp_Lin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A10746Stp_hdr = Z10746Stp_hdr ;
               httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
               A10747Stp_r = Z10747Stp_r ;
               httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
               A10748Stp_p = Z10748Stp_p ;
               httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
               A10750Stp_Lin = Z10750Stp_Lin ;
               httpContext.ajax_rsp_assign_attri("", false, "A10750Stp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10750Stp_Lin), 4, 0));
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
               update1QG1430( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10746Stp_hdr != Z10746Stp_hdr ) || ( A10747Stp_r != Z10747Stp_r ) || ( GXutil.strcmp(A10748Stp_p, Z10748Stp_p) != 0 ) || ( A10750Stp_Lin != Z10750Stp_Lin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QG1430( ) ;
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
                  insert1QG1430( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10746Stp_hdr != Z10746Stp_hdr ) || ( A10747Stp_r != Z10747Stp_r ) || ( GXutil.strcmp(A10748Stp_p, Z10748Stp_p) != 0 ) || ( A10750Stp_Lin != Z10750Stp_Lin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10746Stp_hdr = Z10746Stp_hdr ;
         httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         A10747Stp_r = Z10747Stp_r ;
         httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         A10748Stp_p = Z10748Stp_p ;
         httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
         A10750Stp_Lin = Z10750Stp_Lin ;
         httpContext.ajax_rsp_assign_attri("", false, "A10750Stp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10750Stp_Lin), 4, 0));
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
      if ( RcdFound1430 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtStp_Dia_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1QG1430( ) ;
      if ( RcdFound1430 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtStp_Dia_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QG1430( ) ;
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
      if ( RcdFound1430 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtStp_Dia_Internalname ;
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
      if ( RcdFound1430 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtStp_Dia_Internalname ;
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
      scanStart1QG1430( ) ;
      if ( RcdFound1430 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1430 != 0 )
         {
            scanNext1QG1430( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtStp_Dia_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QG1430( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1QG1430( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Short.valueOf(A10750Stp_Lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDSTO1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z10751Stp_Dia, T01QG2_A10751Stp_Dia[0]) ) || ( GXutil.strcmp(Z10752Stp_Mot, T01QG2_A10752Stp_Mot[0]) != 0 ) || ( GXutil.strcmp(Z10753Stp_Term, T01QG2_A10753Stp_Term[0]) != 0 ) || ( GXutil.strcmp(Z10754Stp_Usu, T01QG2_A10754Stp_Usu[0]) != 0 ) || ( Z10755Stp_Est != T01QG2_A10755Stp_Est[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z10756Stp_DiaA, T01QG2_A10756Stp_DiaA[0]) ) || ( GXutil.strcmp(Z10757Stp_MotA, T01QG2_A10757Stp_MotA[0]) != 0 ) || ( GXutil.strcmp(Z11688Stp_UsuAct, T01QG2_A11688Stp_UsuAct[0]) != 0 ) || ( GXutil.strcmp(Z11689Stp_TermAc, T01QG2_A11689Stp_TermAc[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(Z10751Stp_Dia, T01QG2_A10751Stp_Dia[0]) ) )
            {
               GXutil.writeLogln("hdsto1:[seudo value changed for attri]"+"Stp_Dia");
               GXutil.writeLogRaw("Old: ",Z10751Stp_Dia);
               GXutil.writeLogRaw("Current: ",T01QG2_A10751Stp_Dia[0]);
            }
            if ( GXutil.strcmp(Z10752Stp_Mot, T01QG2_A10752Stp_Mot[0]) != 0 )
            {
               GXutil.writeLogln("hdsto1:[seudo value changed for attri]"+"Stp_Mot");
               GXutil.writeLogRaw("Old: ",Z10752Stp_Mot);
               GXutil.writeLogRaw("Current: ",T01QG2_A10752Stp_Mot[0]);
            }
            if ( GXutil.strcmp(Z10753Stp_Term, T01QG2_A10753Stp_Term[0]) != 0 )
            {
               GXutil.writeLogln("hdsto1:[seudo value changed for attri]"+"Stp_Term");
               GXutil.writeLogRaw("Old: ",Z10753Stp_Term);
               GXutil.writeLogRaw("Current: ",T01QG2_A10753Stp_Term[0]);
            }
            if ( GXutil.strcmp(Z10754Stp_Usu, T01QG2_A10754Stp_Usu[0]) != 0 )
            {
               GXutil.writeLogln("hdsto1:[seudo value changed for attri]"+"Stp_Usu");
               GXutil.writeLogRaw("Old: ",Z10754Stp_Usu);
               GXutil.writeLogRaw("Current: ",T01QG2_A10754Stp_Usu[0]);
            }
            if ( Z10755Stp_Est != T01QG2_A10755Stp_Est[0] )
            {
               GXutil.writeLogln("hdsto1:[seudo value changed for attri]"+"Stp_Est");
               GXutil.writeLogRaw("Old: ",Z10755Stp_Est);
               GXutil.writeLogRaw("Current: ",T01QG2_A10755Stp_Est[0]);
            }
            if ( !( GXutil.dateCompare(Z10756Stp_DiaA, T01QG2_A10756Stp_DiaA[0]) ) )
            {
               GXutil.writeLogln("hdsto1:[seudo value changed for attri]"+"Stp_DiaA");
               GXutil.writeLogRaw("Old: ",Z10756Stp_DiaA);
               GXutil.writeLogRaw("Current: ",T01QG2_A10756Stp_DiaA[0]);
            }
            if ( GXutil.strcmp(Z10757Stp_MotA, T01QG2_A10757Stp_MotA[0]) != 0 )
            {
               GXutil.writeLogln("hdsto1:[seudo value changed for attri]"+"Stp_MotA");
               GXutil.writeLogRaw("Old: ",Z10757Stp_MotA);
               GXutil.writeLogRaw("Current: ",T01QG2_A10757Stp_MotA[0]);
            }
            if ( GXutil.strcmp(Z11688Stp_UsuAct, T01QG2_A11688Stp_UsuAct[0]) != 0 )
            {
               GXutil.writeLogln("hdsto1:[seudo value changed for attri]"+"Stp_UsuAct");
               GXutil.writeLogRaw("Old: ",Z11688Stp_UsuAct);
               GXutil.writeLogRaw("Current: ",T01QG2_A11688Stp_UsuAct[0]);
            }
            if ( GXutil.strcmp(Z11689Stp_TermAc, T01QG2_A11689Stp_TermAc[0]) != 0 )
            {
               GXutil.writeLogln("hdsto1:[seudo value changed for attri]"+"Stp_TermAc");
               GXutil.writeLogRaw("Old: ",Z11689Stp_TermAc);
               GXutil.writeLogRaw("Current: ",T01QG2_A11689Stp_TermAc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHDSTO1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QG1430( )
   {
      beforeValidate1QG1430( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QG1430( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QG1430( 0) ;
         checkOptimisticConcurrency1QG1430( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QG1430( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QG1430( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QG12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A10750Stp_Lin), A10751Stp_Dia, A10752Stp_Mot, A10753Stp_Term, A10754Stp_Usu, Byte.valueOf(A10755Stp_Est), A10756Stp_DiaA, A10757Stp_MotA, A11688Stp_UsuAct, A11689Stp_TermAc, A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDSTO1");
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
                        resetCaption1QG0( ) ;
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
            load1QG1430( ) ;
         }
         endLevel1QG1430( ) ;
      }
      closeExtendedTableCursors1QG1430( ) ;
   }

   public void update1QG1430( )
   {
      beforeValidate1QG1430( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QG1430( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QG1430( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QG1430( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QG1430( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QG13 */
                  pr_default.execute(11, new Object[] {A10751Stp_Dia, A10752Stp_Mot, A10753Stp_Term, A10754Stp_Usu, Byte.valueOf(A10755Stp_Est), A10756Stp_DiaA, A10757Stp_MotA, A11688Stp_UsuAct, A11689Stp_TermAc, A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Short.valueOf(A10750Stp_Lin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDSTO1");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDSTO1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QG1430( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1QG0( ) ;
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
         endLevel1QG1430( ) ;
      }
      closeExtendedTableCursors1QG1430( ) ;
   }

   public void deferredUpdate1QG1430( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QG1430( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QG1430( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QG1430( ) ;
         afterConfirm1QG1430( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QG1430( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QG14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Short.valueOf(A10750Stp_Lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDSTO1");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1430 == 0 )
                     {
                        initAll1QG1430( ) ;
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
                     resetCaption1QG0( ) ;
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
      sMode1430 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QG1430( ) ;
      Gx_mode = sMode1430 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QG1430( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01QG15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01QG15_A407EmprNom[0] ;
         n407EmprNom = T01QG15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
      }
   }

   public void endLevel1QG1430( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QG1430( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "hdsto1");
         if ( AnyError == 0 )
         {
            confirmValues1QG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "hdsto1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QG1430( )
   {
      /* Using cursor T01QG16 */
      pr_default.execute(14);
      RcdFound1430 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1430 = (short)(1) ;
         A396EmprCod = T01QG16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10746Stp_hdr = T01QG16_A10746Stp_hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         A10747Stp_r = T01QG16_A10747Stp_r[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         A10748Stp_p = T01QG16_A10748Stp_p[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
         A10750Stp_Lin = T01QG16_A10750Stp_Lin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10750Stp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10750Stp_Lin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QG1430( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1430 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1430 = (short)(1) ;
         A396EmprCod = T01QG16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10746Stp_hdr = T01QG16_A10746Stp_hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         A10747Stp_r = T01QG16_A10747Stp_r[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         A10748Stp_p = T01QG16_A10748Stp_p[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
         A10750Stp_Lin = T01QG16_A10750Stp_Lin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10750Stp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10750Stp_Lin), 4, 0));
      }
   }

   public void scanEnd1QG1430( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1QG1430( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QG1430( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QG1430( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QG1430( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QG1430( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QG1430( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QG1430( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtStp_hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_hdr_Enabled), 5, 0), true);
      edtStp_r_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_r_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_r_Enabled), 5, 0), true);
      edtStp_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_p_Enabled), 5, 0), true);
      edtStp_Lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Lin_Enabled), 5, 0), true);
      edtStp_Dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Dia_Enabled), 5, 0), true);
      edtStp_Mot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Mot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Mot_Enabled), 5, 0), true);
      edtStp_Term_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Term_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Term_Enabled), 5, 0), true);
      edtStp_Usu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Usu_Enabled), 5, 0), true);
      edtStp_Est_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Est_Enabled), 5, 0), true);
      edtStp_DiaA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_DiaA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_DiaA_Enabled), 5, 0), true);
      edtStp_MotA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_MotA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_MotA_Enabled), 5, 0), true);
      edtStp_UsuAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_UsuAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_UsuAct_Enabled), 5, 0), true);
      edtStp_TermAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_TermAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_TermAc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QG1430( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QG0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.hdsto1", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10746Stp_hdr", GXutil.ltrim( localUtil.ntoc( Z10746Stp_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10747Stp_r", GXutil.ltrim( localUtil.ntoc( Z10747Stp_r, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10748Stp_p", GXutil.rtrim( Z10748Stp_p));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10750Stp_Lin", GXutil.ltrim( localUtil.ntoc( Z10750Stp_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10751Stp_Dia", localUtil.ttoc( Z10751Stp_Dia, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10752Stp_Mot", Z10752Stp_Mot);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10753Stp_Term", GXutil.rtrim( Z10753Stp_Term));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10754Stp_Usu", GXutil.rtrim( Z10754Stp_Usu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10755Stp_Est", GXutil.ltrim( localUtil.ntoc( Z10755Stp_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10756Stp_DiaA", localUtil.ttoc( Z10756Stp_DiaA, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10757Stp_MotA", Z10757Stp_MotA);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11688Stp_UsuAct", GXutil.rtrim( Z11688Stp_UsuAct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11689Stp_TermAc", GXutil.rtrim( Z11689Stp_TermAc));
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
      return formatLink("app.hdsto1", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "HDSTO1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla HDSTO1", "") ;
   }

   public void initializeNonKey1QG1430( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A10751Stp_Dia", localUtil.ttoc( A10751Stp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10752Stp_Mot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10752Stp_Mot", A10752Stp_Mot);
      A10753Stp_Term = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10753Stp_Term", A10753Stp_Term);
      A10754Stp_Usu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10754Stp_Usu", A10754Stp_Usu);
      A10755Stp_Est = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10755Stp_Est", GXutil.str( A10755Stp_Est, 1, 0));
      A10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A10756Stp_DiaA", localUtil.ttoc( A10756Stp_DiaA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10757Stp_MotA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10757Stp_MotA", A10757Stp_MotA);
      A11688Stp_UsuAct = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11688Stp_UsuAct", A11688Stp_UsuAct);
      A11689Stp_TermAc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11689Stp_TermAc", A11689Stp_TermAc);
      Z10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      Z10752Stp_Mot = "" ;
      Z10753Stp_Term = "" ;
      Z10754Stp_Usu = "" ;
      Z10755Stp_Est = (byte)(0) ;
      Z10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      Z10757Stp_MotA = "" ;
      Z11688Stp_UsuAct = "" ;
      Z11689Stp_TermAc = "" ;
   }

   public void initAll1QG1430( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A10746Stp_hdr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
      A10747Stp_r = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
      A10748Stp_p = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
      A10750Stp_Lin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10750Stp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10750Stp_Lin), 4, 0));
      initializeNonKey1QG1430( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241511676", true, true);
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
      httpContext.AddJavascriptSource("hdsto1.js", "?20268241511676", false, true);
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtStp_hdr_Internalname = "STP_HDR" ;
      edtStp_r_Internalname = "STP_R" ;
      edtStp_p_Internalname = "STP_P" ;
      edtStp_Lin_Internalname = "STP_LIN" ;
      edtStp_Dia_Internalname = "STP_DIA" ;
      edtStp_Mot_Internalname = "STP_MOT" ;
      edtStp_Term_Internalname = "STP_TERM" ;
      edtStp_Usu_Internalname = "STP_USU" ;
      edtStp_Est_Internalname = "STP_EST" ;
      edtStp_DiaA_Internalname = "STP_DIAA" ;
      edtStp_MotA_Internalname = "STP_MOTA" ;
      edtStp_UsuAct_Internalname = "STP_USUACT" ;
      edtStp_TermAc_Internalname = "STP_TERMAC" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla HDSTO1", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtStp_TermAc_Jsonclick = "" ;
      edtStp_TermAc_Enabled = 1 ;
      edtStp_UsuAct_Jsonclick = "" ;
      edtStp_UsuAct_Enabled = 1 ;
      edtStp_MotA_Enabled = 1 ;
      edtStp_DiaA_Jsonclick = "" ;
      edtStp_DiaA_Enabled = 1 ;
      edtStp_Est_Jsonclick = "" ;
      edtStp_Est_Enabled = 1 ;
      edtStp_Usu_Jsonclick = "" ;
      edtStp_Usu_Enabled = 1 ;
      edtStp_Term_Jsonclick = "" ;
      edtStp_Term_Enabled = 1 ;
      edtStp_Mot_Enabled = 1 ;
      edtStp_Dia_Jsonclick = "" ;
      edtStp_Dia_Enabled = 1 ;
      edtStp_Lin_Jsonclick = "" ;
      edtStp_Lin_Enabled = 1 ;
      edtStp_p_Jsonclick = "" ;
      edtStp_p_Enabled = 1 ;
      edtStp_r_Jsonclick = "" ;
      edtStp_r_Enabled = 1 ;
      edtStp_hdr_Jsonclick = "" ;
      edtStp_hdr_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
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
      /* Using cursor T01QG15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01QG15_A407EmprNom[0] ;
      n407EmprNom = T01QG15_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      /* Using cursor T01QG17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SUSPENSION HDR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "STP_P");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      GX_FocusControl = edtStp_Dia_Internalname ;
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
      /* Using cursor T01QG15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01QG15_A407EmprNom[0] ;
      n407EmprNom = T01QG15_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Stp_p( )
   {
      /* Using cursor T01QG17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SUSPENSION HDR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "STP_P");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Stp_lin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10751Stp_Dia", localUtil.ttoc( A10751Stp_Dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A10752Stp_Mot", A10752Stp_Mot);
      httpContext.ajax_rsp_assign_attri("", false, "A10753Stp_Term", GXutil.rtrim( A10753Stp_Term));
      httpContext.ajax_rsp_assign_attri("", false, "A10754Stp_Usu", GXutil.rtrim( A10754Stp_Usu));
      httpContext.ajax_rsp_assign_attri("", false, "A10755Stp_Est", GXutil.ltrim( localUtil.ntoc( A10755Stp_Est, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10756Stp_DiaA", localUtil.ttoc( A10756Stp_DiaA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A10757Stp_MotA", A10757Stp_MotA);
      httpContext.ajax_rsp_assign_attri("", false, "A11688Stp_UsuAct", GXutil.rtrim( A11688Stp_UsuAct));
      httpContext.ajax_rsp_assign_attri("", false, "A11689Stp_TermAc", GXutil.rtrim( A11689Stp_TermAc));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10746Stp_hdr", GXutil.ltrim( localUtil.ntoc( Z10746Stp_hdr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10747Stp_r", GXutil.ltrim( localUtil.ntoc( Z10747Stp_r, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10748Stp_p", GXutil.rtrim( Z10748Stp_p));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10750Stp_Lin", GXutil.ltrim( localUtil.ntoc( Z10750Stp_Lin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10751Stp_Dia", localUtil.ttoc( Z10751Stp_Dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10752Stp_Mot", Z10752Stp_Mot);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10753Stp_Term", GXutil.rtrim( Z10753Stp_Term));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10754Stp_Usu", GXutil.rtrim( Z10754Stp_Usu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10755Stp_Est", GXutil.ltrim( localUtil.ntoc( Z10755Stp_Est, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10756Stp_DiaA", localUtil.ttoc( Z10756Stp_DiaA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10757Stp_MotA", Z10757Stp_MotA);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11688Stp_UsuAct", GXutil.rtrim( Z11688Stp_UsuAct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11689Stp_TermAc", GXutil.rtrim( Z11689Stp_TermAc));
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
      setEventMetadata("VALID_STP_HDR","{handler:'valid_Stp_hdr',iparms:[]");
      setEventMetadata("VALID_STP_HDR",",oparms:[]}");
      setEventMetadata("VALID_STP_R","{handler:'valid_Stp_r',iparms:[]");
      setEventMetadata("VALID_STP_R",",oparms:[]}");
      setEventMetadata("VALID_STP_P","{handler:'valid_Stp_p',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10746Stp_hdr',fld:'STP_HDR',pic:'ZZZZZZZ9'},{av:'A10747Stp_r',fld:'STP_R',pic:'9'},{av:'A10748Stp_p',fld:'STP_P',pic:''}]");
      setEventMetadata("VALID_STP_P",",oparms:[]}");
      setEventMetadata("VALID_STP_LIN","{handler:'valid_Stp_lin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10746Stp_hdr',fld:'STP_HDR',pic:'ZZZZZZZ9'},{av:'A10747Stp_r',fld:'STP_R',pic:'9'},{av:'A10748Stp_p',fld:'STP_P',pic:''},{av:'A10750Stp_Lin',fld:'STP_LIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_STP_LIN",",oparms:[{av:'A10751Stp_Dia',fld:'STP_DIA',pic:'99/99/99 99:99'},{av:'A10752Stp_Mot',fld:'STP_MOT',pic:''},{av:'A10753Stp_Term',fld:'STP_TERM',pic:''},{av:'A10754Stp_Usu',fld:'STP_USU',pic:''},{av:'A10755Stp_Est',fld:'STP_EST',pic:'9'},{av:'A10756Stp_DiaA',fld:'STP_DIAA',pic:'99/99/99 99:99'},{av:'A10757Stp_MotA',fld:'STP_MOTA',pic:''},{av:'A11688Stp_UsuAct',fld:'STP_USUACT',pic:''},{av:'A11689Stp_TermAc',fld:'STP_TERMAC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10746Stp_hdr'},{av:'Z10747Stp_r'},{av:'Z10748Stp_p'},{av:'Z10750Stp_Lin'},{av:'Z10751Stp_Dia'},{av:'Z10752Stp_Mot'},{av:'Z10753Stp_Term'},{av:'Z10754Stp_Usu'},{av:'Z10755Stp_Est'},{av:'Z10756Stp_DiaA'},{av:'Z10757Stp_MotA'},{av:'Z11688Stp_UsuAct'},{av:'Z11689Stp_TermAc'},{av:'Z407EmprNom'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10748Stp_p = "" ;
      Z10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      Z10752Stp_Mot = "" ;
      Z10753Stp_Term = "" ;
      Z10754Stp_Usu = "" ;
      Z10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      Z10757Stp_MotA = "" ;
      Z11688Stp_UsuAct = "" ;
      Z11689Stp_TermAc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A10748Stp_p = "" ;
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
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10752Stp_Mot = "" ;
      A10753Stp_Term = "" ;
      A10754Stp_Usu = "" ;
      A10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      A10757Stp_MotA = "" ;
      A11688Stp_UsuAct = "" ;
      A11689Stp_TermAc = "" ;
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
      T01QG6_A10750Stp_Lin = new short[1] ;
      T01QG6_A407EmprNom = new String[] {""} ;
      T01QG6_n407EmprNom = new boolean[] {false} ;
      T01QG6_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01QG6_A10752Stp_Mot = new String[] {""} ;
      T01QG6_A10753Stp_Term = new String[] {""} ;
      T01QG6_A10754Stp_Usu = new String[] {""} ;
      T01QG6_A10755Stp_Est = new byte[1] ;
      T01QG6_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01QG6_A10757Stp_MotA = new String[] {""} ;
      T01QG6_A11688Stp_UsuAct = new String[] {""} ;
      T01QG6_A11689Stp_TermAc = new String[] {""} ;
      T01QG6_A396EmprCod = new String[] {""} ;
      T01QG6_A10746Stp_hdr = new int[1] ;
      T01QG6_A10747Stp_r = new byte[1] ;
      T01QG6_A10748Stp_p = new String[] {""} ;
      T01QG4_A407EmprNom = new String[] {""} ;
      T01QG4_n407EmprNom = new boolean[] {false} ;
      T01QG5_A396EmprCod = new String[] {""} ;
      T01QG7_A407EmprNom = new String[] {""} ;
      T01QG7_n407EmprNom = new boolean[] {false} ;
      T01QG8_A396EmprCod = new String[] {""} ;
      T01QG9_A396EmprCod = new String[] {""} ;
      T01QG9_A10746Stp_hdr = new int[1] ;
      T01QG9_A10747Stp_r = new byte[1] ;
      T01QG9_A10748Stp_p = new String[] {""} ;
      T01QG9_A10750Stp_Lin = new short[1] ;
      T01QG3_A10750Stp_Lin = new short[1] ;
      T01QG3_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01QG3_A10752Stp_Mot = new String[] {""} ;
      T01QG3_A10753Stp_Term = new String[] {""} ;
      T01QG3_A10754Stp_Usu = new String[] {""} ;
      T01QG3_A10755Stp_Est = new byte[1] ;
      T01QG3_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01QG3_A10757Stp_MotA = new String[] {""} ;
      T01QG3_A11688Stp_UsuAct = new String[] {""} ;
      T01QG3_A11689Stp_TermAc = new String[] {""} ;
      T01QG3_A396EmprCod = new String[] {""} ;
      T01QG3_A10746Stp_hdr = new int[1] ;
      T01QG3_A10747Stp_r = new byte[1] ;
      T01QG3_A10748Stp_p = new String[] {""} ;
      sMode1430 = "" ;
      T01QG10_A396EmprCod = new String[] {""} ;
      T01QG10_A10746Stp_hdr = new int[1] ;
      T01QG10_A10747Stp_r = new byte[1] ;
      T01QG10_A10748Stp_p = new String[] {""} ;
      T01QG10_A10750Stp_Lin = new short[1] ;
      T01QG11_A396EmprCod = new String[] {""} ;
      T01QG11_A10746Stp_hdr = new int[1] ;
      T01QG11_A10747Stp_r = new byte[1] ;
      T01QG11_A10748Stp_p = new String[] {""} ;
      T01QG11_A10750Stp_Lin = new short[1] ;
      T01QG2_A10750Stp_Lin = new short[1] ;
      T01QG2_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01QG2_A10752Stp_Mot = new String[] {""} ;
      T01QG2_A10753Stp_Term = new String[] {""} ;
      T01QG2_A10754Stp_Usu = new String[] {""} ;
      T01QG2_A10755Stp_Est = new byte[1] ;
      T01QG2_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01QG2_A10757Stp_MotA = new String[] {""} ;
      T01QG2_A11688Stp_UsuAct = new String[] {""} ;
      T01QG2_A11689Stp_TermAc = new String[] {""} ;
      T01QG2_A396EmprCod = new String[] {""} ;
      T01QG2_A10746Stp_hdr = new int[1] ;
      T01QG2_A10747Stp_r = new byte[1] ;
      T01QG2_A10748Stp_p = new String[] {""} ;
      T01QG15_A407EmprNom = new String[] {""} ;
      T01QG15_n407EmprNom = new boolean[] {false} ;
      T01QG16_A396EmprCod = new String[] {""} ;
      T01QG16_A10746Stp_hdr = new int[1] ;
      T01QG16_A10747Stp_r = new byte[1] ;
      T01QG16_A10748Stp_p = new String[] {""} ;
      T01QG16_A10750Stp_Lin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01QG17_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ10748Stp_p = "" ;
      ZZ10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      ZZ10752Stp_Mot = "" ;
      ZZ10753Stp_Term = "" ;
      ZZ10754Stp_Usu = "" ;
      ZZ10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      ZZ10757Stp_MotA = "" ;
      ZZ11688Stp_UsuAct = "" ;
      ZZ11689Stp_TermAc = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.hdsto1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.hdsto1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.hdsto1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.hdsto1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.hdsto1__default(),
         new Object[] {
             new Object[] {
            T01QG2_A10750Stp_Lin, T01QG2_A10751Stp_Dia, T01QG2_A10752Stp_Mot, T01QG2_A10753Stp_Term, T01QG2_A10754Stp_Usu, T01QG2_A10755Stp_Est, T01QG2_A10756Stp_DiaA, T01QG2_A10757Stp_MotA, T01QG2_A11688Stp_UsuAct, T01QG2_A11689Stp_TermAc,
            T01QG2_A396EmprCod, T01QG2_A10746Stp_hdr, T01QG2_A10747Stp_r, T01QG2_A10748Stp_p
            }
            , new Object[] {
            T01QG3_A10750Stp_Lin, T01QG3_A10751Stp_Dia, T01QG3_A10752Stp_Mot, T01QG3_A10753Stp_Term, T01QG3_A10754Stp_Usu, T01QG3_A10755Stp_Est, T01QG3_A10756Stp_DiaA, T01QG3_A10757Stp_MotA, T01QG3_A11688Stp_UsuAct, T01QG3_A11689Stp_TermAc,
            T01QG3_A396EmprCod, T01QG3_A10746Stp_hdr, T01QG3_A10747Stp_r, T01QG3_A10748Stp_p
            }
            , new Object[] {
            T01QG4_A407EmprNom, T01QG4_n407EmprNom
            }
            , new Object[] {
            T01QG5_A396EmprCod
            }
            , new Object[] {
            T01QG6_A10750Stp_Lin, T01QG6_A407EmprNom, T01QG6_n407EmprNom, T01QG6_A10751Stp_Dia, T01QG6_A10752Stp_Mot, T01QG6_A10753Stp_Term, T01QG6_A10754Stp_Usu, T01QG6_A10755Stp_Est, T01QG6_A10756Stp_DiaA, T01QG6_A10757Stp_MotA,
            T01QG6_A11688Stp_UsuAct, T01QG6_A11689Stp_TermAc, T01QG6_A396EmprCod, T01QG6_A10746Stp_hdr, T01QG6_A10747Stp_r, T01QG6_A10748Stp_p
            }
            , new Object[] {
            T01QG7_A407EmprNom, T01QG7_n407EmprNom
            }
            , new Object[] {
            T01QG8_A396EmprCod
            }
            , new Object[] {
            T01QG9_A396EmprCod, T01QG9_A10746Stp_hdr, T01QG9_A10747Stp_r, T01QG9_A10748Stp_p, T01QG9_A10750Stp_Lin
            }
            , new Object[] {
            T01QG10_A396EmprCod, T01QG10_A10746Stp_hdr, T01QG10_A10747Stp_r, T01QG10_A10748Stp_p, T01QG10_A10750Stp_Lin
            }
            , new Object[] {
            T01QG11_A396EmprCod, T01QG11_A10746Stp_hdr, T01QG11_A10747Stp_r, T01QG11_A10748Stp_p, T01QG11_A10750Stp_Lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QG15_A407EmprNom, T01QG15_n407EmprNom
            }
            , new Object[] {
            T01QG16_A396EmprCod, T01QG16_A10746Stp_hdr, T01QG16_A10747Stp_r, T01QG16_A10748Stp_p, T01QG16_A10750Stp_Lin
            }
            , new Object[] {
            T01QG17_A396EmprCod
            }
         }
      );
   }

   private byte Z10747Stp_r ;
   private byte Z10755Stp_Est ;
   private byte GxWebError ;
   private byte A10747Stp_r ;
   private byte nKeyPressed ;
   private byte A10755Stp_Est ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ10747Stp_r ;
   private byte ZZ10755Stp_Est ;
   private short Z10750Stp_Lin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10750Stp_Lin ;
   private short RcdFound1430 ;
   private short nIsDirty_1430 ;
   private short ZZ10750Stp_Lin ;
   private int Z10746Stp_hdr ;
   private int A10746Stp_hdr ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtStp_hdr_Enabled ;
   private int edtStp_r_Enabled ;
   private int edtStp_p_Enabled ;
   private int edtStp_Lin_Enabled ;
   private int edtStp_Dia_Enabled ;
   private int edtStp_Mot_Enabled ;
   private int edtStp_Term_Enabled ;
   private int edtStp_Usu_Enabled ;
   private int edtStp_Est_Enabled ;
   private int edtStp_DiaA_Enabled ;
   private int edtStp_MotA_Enabled ;
   private int edtStp_UsuAct_Enabled ;
   private int edtStp_TermAc_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ10746Stp_hdr ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10748Stp_p ;
   private String Z10753Stp_Term ;
   private String Z10754Stp_Usu ;
   private String Z11688Stp_UsuAct ;
   private String Z11689Stp_TermAc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A10748Stp_p ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtStp_hdr_Internalname ;
   private String edtStp_hdr_Jsonclick ;
   private String edtStp_r_Internalname ;
   private String edtStp_r_Jsonclick ;
   private String edtStp_p_Internalname ;
   private String edtStp_p_Jsonclick ;
   private String edtStp_Lin_Internalname ;
   private String edtStp_Lin_Jsonclick ;
   private String edtStp_Dia_Internalname ;
   private String edtStp_Dia_Jsonclick ;
   private String edtStp_Mot_Internalname ;
   private String edtStp_Term_Internalname ;
   private String A10753Stp_Term ;
   private String edtStp_Term_Jsonclick ;
   private String edtStp_Usu_Internalname ;
   private String A10754Stp_Usu ;
   private String edtStp_Usu_Jsonclick ;
   private String edtStp_Est_Internalname ;
   private String edtStp_Est_Jsonclick ;
   private String edtStp_DiaA_Internalname ;
   private String edtStp_DiaA_Jsonclick ;
   private String edtStp_MotA_Internalname ;
   private String edtStp_UsuAct_Internalname ;
   private String A11688Stp_UsuAct ;
   private String edtStp_UsuAct_Jsonclick ;
   private String edtStp_TermAc_Internalname ;
   private String A11689Stp_TermAc ;
   private String edtStp_TermAc_Jsonclick ;
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
   private String sMode1430 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ10748Stp_p ;
   private String ZZ10753Stp_Term ;
   private String ZZ10754Stp_Usu ;
   private String ZZ11688Stp_UsuAct ;
   private String ZZ11689Stp_TermAc ;
   private String ZZ407EmprNom ;
   private java.util.Date Z10751Stp_Dia ;
   private java.util.Date Z10756Stp_DiaA ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date A10756Stp_DiaA ;
   private java.util.Date ZZ10751Stp_Dia ;
   private java.util.Date ZZ10756Stp_DiaA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean Gx_longc ;
   private String Z10752Stp_Mot ;
   private String Z10757Stp_MotA ;
   private String A10752Stp_Mot ;
   private String A10757Stp_MotA ;
   private String ZZ10752Stp_Mot ;
   private String ZZ10757Stp_MotA ;
   private IDataStoreProvider pr_default ;
   private short[] T01QG6_A10750Stp_Lin ;
   private String[] T01QG6_A407EmprNom ;
   private boolean[] T01QG6_n407EmprNom ;
   private java.util.Date[] T01QG6_A10751Stp_Dia ;
   private String[] T01QG6_A10752Stp_Mot ;
   private String[] T01QG6_A10753Stp_Term ;
   private String[] T01QG6_A10754Stp_Usu ;
   private byte[] T01QG6_A10755Stp_Est ;
   private java.util.Date[] T01QG6_A10756Stp_DiaA ;
   private String[] T01QG6_A10757Stp_MotA ;
   private String[] T01QG6_A11688Stp_UsuAct ;
   private String[] T01QG6_A11689Stp_TermAc ;
   private String[] T01QG6_A396EmprCod ;
   private int[] T01QG6_A10746Stp_hdr ;
   private byte[] T01QG6_A10747Stp_r ;
   private String[] T01QG6_A10748Stp_p ;
   private String[] T01QG4_A407EmprNom ;
   private boolean[] T01QG4_n407EmprNom ;
   private String[] T01QG5_A396EmprCod ;
   private String[] T01QG7_A407EmprNom ;
   private boolean[] T01QG7_n407EmprNom ;
   private String[] T01QG8_A396EmprCod ;
   private String[] T01QG9_A396EmprCod ;
   private int[] T01QG9_A10746Stp_hdr ;
   private byte[] T01QG9_A10747Stp_r ;
   private String[] T01QG9_A10748Stp_p ;
   private short[] T01QG9_A10750Stp_Lin ;
   private short[] T01QG3_A10750Stp_Lin ;
   private java.util.Date[] T01QG3_A10751Stp_Dia ;
   private String[] T01QG3_A10752Stp_Mot ;
   private String[] T01QG3_A10753Stp_Term ;
   private String[] T01QG3_A10754Stp_Usu ;
   private byte[] T01QG3_A10755Stp_Est ;
   private java.util.Date[] T01QG3_A10756Stp_DiaA ;
   private String[] T01QG3_A10757Stp_MotA ;
   private String[] T01QG3_A11688Stp_UsuAct ;
   private String[] T01QG3_A11689Stp_TermAc ;
   private String[] T01QG3_A396EmprCod ;
   private int[] T01QG3_A10746Stp_hdr ;
   private byte[] T01QG3_A10747Stp_r ;
   private String[] T01QG3_A10748Stp_p ;
   private String[] T01QG10_A396EmprCod ;
   private int[] T01QG10_A10746Stp_hdr ;
   private byte[] T01QG10_A10747Stp_r ;
   private String[] T01QG10_A10748Stp_p ;
   private short[] T01QG10_A10750Stp_Lin ;
   private String[] T01QG11_A396EmprCod ;
   private int[] T01QG11_A10746Stp_hdr ;
   private byte[] T01QG11_A10747Stp_r ;
   private String[] T01QG11_A10748Stp_p ;
   private short[] T01QG11_A10750Stp_Lin ;
   private short[] T01QG2_A10750Stp_Lin ;
   private java.util.Date[] T01QG2_A10751Stp_Dia ;
   private String[] T01QG2_A10752Stp_Mot ;
   private String[] T01QG2_A10753Stp_Term ;
   private String[] T01QG2_A10754Stp_Usu ;
   private byte[] T01QG2_A10755Stp_Est ;
   private java.util.Date[] T01QG2_A10756Stp_DiaA ;
   private String[] T01QG2_A10757Stp_MotA ;
   private String[] T01QG2_A11688Stp_UsuAct ;
   private String[] T01QG2_A11689Stp_TermAc ;
   private String[] T01QG2_A396EmprCod ;
   private int[] T01QG2_A10746Stp_hdr ;
   private byte[] T01QG2_A10747Stp_r ;
   private String[] T01QG2_A10748Stp_p ;
   private String[] T01QG15_A407EmprNom ;
   private boolean[] T01QG15_n407EmprNom ;
   private String[] T01QG16_A396EmprCod ;
   private int[] T01QG16_A10746Stp_hdr ;
   private byte[] T01QG16_A10747Stp_r ;
   private String[] T01QG16_A10748Stp_p ;
   private short[] T01QG16_A10750Stp_Lin ;
   private String[] T01QG17_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class hdsto1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hdsto1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hdsto1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hdsto1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class hdsto1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QG2", "SELECT Stp_Lin, Stp_Dia, Stp_Mot, Stp_Term, Stp_Usu, Stp_Est, Stp_DiaA, Stp_MotA, Stp_UsuAct, Stp_TermAc, EmprCod, Stp_hdr, Stp_r, Stp_p FROM TXPHDSTO1 WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? AND Stp_Lin = ?  FOR UPDATE OF Stp_Dia, Stp_Mot, Stp_Term, Stp_Usu, Stp_Est, Stp_DiaA, Stp_MotA, Stp_UsuAct, Stp_TermAc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QG3", "SELECT Stp_Lin, Stp_Dia, Stp_Mot, Stp_Term, Stp_Usu, Stp_Est, Stp_DiaA, Stp_MotA, Stp_UsuAct, Stp_TermAc, EmprCod, Stp_hdr, Stp_r, Stp_p FROM TXPHDSTO1 WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? AND Stp_Lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QG4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QG5", "SELECT EmprCod FROM TXPHDSTOP WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QG6", "SELECT /*+ FIRST_ROWS(100) */ TM1.Stp_Lin, T2.EmprNom, TM1.Stp_Dia, TM1.Stp_Mot, TM1.Stp_Term, TM1.Stp_Usu, TM1.Stp_Est, TM1.Stp_DiaA, TM1.Stp_MotA, TM1.Stp_UsuAct, TM1.Stp_TermAc, TM1.EmprCod, TM1.Stp_hdr, TM1.Stp_r, TM1.Stp_p FROM (TXPHDSTO1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Stp_hdr = ? and TM1.Stp_r = ? and TM1.Stp_p = ? and TM1.Stp_Lin = ? ORDER BY TM1.EmprCod, TM1.Stp_hdr, TM1.Stp_r, TM1.Stp_p, TM1.Stp_Lin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QG7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QG8", "SELECT EmprCod FROM TXPHDSTOP WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QG9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin FROM TXPHDSTO1 WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? AND Stp_Lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QG10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin FROM TXPHDSTO1 WHERE ( EmprCod > ? or EmprCod = ? and Stp_hdr > ? or Stp_hdr = ? and EmprCod = ? and Stp_r > ? or Stp_r = ? and Stp_hdr = ? and EmprCod = ? and Stp_p > ? or Stp_p = ? and Stp_r = ? and Stp_hdr = ? and EmprCod = ? and Stp_Lin > ?) ORDER BY EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QG11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin FROM TXPHDSTO1 WHERE ( EmprCod < ? or EmprCod = ? and Stp_hdr < ? or Stp_hdr = ? and EmprCod = ? and Stp_r < ? or Stp_r = ? and Stp_hdr = ? and EmprCod = ? and Stp_p < ? or Stp_p = ? and Stp_r = ? and Stp_hdr = ? and EmprCod = ? and Stp_Lin < ?) ORDER BY EmprCod DESC, Stp_hdr DESC, Stp_r DESC, Stp_p DESC, Stp_Lin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QG12", "INSERT INTO TXPHDSTO1(Stp_Lin, Stp_Dia, Stp_Mot, Stp_Term, Stp_Usu, Stp_Est, Stp_DiaA, Stp_MotA, Stp_UsuAct, Stp_TermAc, EmprCod, Stp_hdr, Stp_r, Stp_p) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHDSTO1")
         ,new UpdateCursor("T01QG13", "UPDATE TXPHDSTO1 SET Stp_Dia=?, Stp_Mot=?, Stp_Term=?, Stp_Usu=?, Stp_Est=?, Stp_DiaA=?, Stp_MotA=?, Stp_UsuAct=?, Stp_TermAc=?  WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? AND Stp_Lin = ?", GX_NOMASK, "TXPHDSTO1")
         ,new UpdateCursor("T01QG14", "DELETE FROM TXPHDSTO1  WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? AND Stp_Lin = ?", GX_NOMASK, "TXPHDSTO1")
         ,new ForEachCursor("T01QG15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QG16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin FROM TXPHDSTO1 ORDER BY EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QG17", "SELECT EmprCod FROM TXPHDSTOP WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((String[]) buf[11])[0] = rslt.getString(11, 10);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setVarchar(3, (String)parms[2], 300, false);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDateTime(7, (java.util.Date)parms[6], false);
               stmt.setVarchar(8, (String)parms[7], 300, false);
               stmt.setString(9, (String)parms[8], 10);
               stmt.setString(10, (String)parms[9], 10);
               stmt.setString(11, (String)parms[10], 3);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               return;
            case 11 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setVarchar(2, (String)parms[1], 300, false);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setVarchar(7, (String)parms[6], 300, false);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 10);
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
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
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

