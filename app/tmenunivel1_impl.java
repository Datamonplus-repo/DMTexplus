package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmenunivel1_impl extends GXDataArea
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
         A945MnuId = httpContext.GetPar( "MnuId") ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A945MnuId) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TMENUNIVEL1", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMnuId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tmenunivel1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmenunivel1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmenunivel1_impl.class ));
   }

   public tmenunivel1_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "TMENUNIVEL1", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TMENUNIVEL1.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMENUNIVEL1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMENUNIVEL1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMENUNIVEL1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMENUNIVEL1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMENUNIVEL1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMnuId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMnuId_Internalname, httpContext.getMessage( "Identificacion del Menu", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMnuId_Internalname, GXutil.rtrim( A945MnuId), GXutil.rtrim( localUtil.format( A945MnuId, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMnuId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMnuId_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMENUNIVEL1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMnuTxt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMnuTxt_Internalname, httpContext.getMessage( "Descripción del Menú", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMnuTxt_Internalname, GXutil.rtrim( A951MnuTxt), GXutil.rtrim( localUtil.format( A951MnuTxt, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMnuTxt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMnuTxt_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMENUNIVEL1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMnuOp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMnuOp_Internalname, httpContext.getMessage( "Opción del Menú", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMnuOp_Internalname, GXutil.ltrim( localUtil.ntoc( A946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMnuOp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A946MnuOp), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A946MnuOp), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMnuOp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMnuOp_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMENUNIVEL1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMnuPgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMnuPgm_Internalname, httpContext.getMessage( "Programa a llamar", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMnuPgm_Internalname, GXutil.rtrim( A947MnuPgm), GXutil.rtrim( localUtil.format( A947MnuPgm, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMnuPgm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMnuPgm_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMENUNIVEL1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMnuPgmWeb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMnuPgmWeb_Internalname, httpContext.getMessage( "Link", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMnuPgmWeb_Internalname, A14286MnuPgmWeb, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", (short)(0), 1, edtMnuPgmWeb_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TMENUNIVEL1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMnuPgmTpo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMnuPgmTpo_Internalname, httpContext.getMessage( "Ind. de Requiere parámetro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMnuPgmTpo_Internalname, GXutil.rtrim( A948MnuPgmTpo), GXutil.rtrim( localUtil.format( A948MnuPgmTpo, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMnuPgmTpo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMnuPgmTpo_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMENUNIVEL1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMnuPgmTxt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMnuPgmTxt_Internalname, httpContext.getMessage( "Descripción del Programa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMnuPgmTxt_Internalname, GXutil.rtrim( A949MnuPgmTxt), GXutil.rtrim( localUtil.format( A949MnuPgmTxt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMnuPgmTxt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMnuPgmTxt_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMENUNIVEL1.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMENUNIVEL1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMENUNIVEL1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMENUNIVEL1.htm");
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
         Z945MnuId = httpContext.cgiGet( "Z945MnuId") ;
         Z946MnuOp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z946MnuOp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z947MnuPgm = httpContext.cgiGet( "Z947MnuPgm") ;
         Z14286MnuPgmWeb = httpContext.cgiGet( "Z14286MnuPgmWeb") ;
         Z948MnuPgmTpo = httpContext.cgiGet( "Z948MnuPgmTpo") ;
         Z949MnuPgmTxt = httpContext.cgiGet( "Z949MnuPgmTxt") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A945MnuId = GXutil.upper( httpContext.cgiGet( edtMnuId_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
         A951MnuTxt = httpContext.cgiGet( edtMnuTxt_Internalname) ;
         n951MnuTxt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMnuOp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMnuOp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MNUOP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMnuOp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A946MnuOp = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A946MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A946MnuOp), 2, 0));
         }
         else
         {
            A946MnuOp = (byte)(localUtil.ctol( httpContext.cgiGet( edtMnuOp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A946MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A946MnuOp), 2, 0));
         }
         A947MnuPgm = GXutil.upper( httpContext.cgiGet( edtMnuPgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A947MnuPgm", A947MnuPgm);
         A14286MnuPgmWeb = httpContext.cgiGet( edtMnuPgmWeb_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14286MnuPgmWeb", A14286MnuPgmWeb);
         A948MnuPgmTpo = GXutil.upper( httpContext.cgiGet( edtMnuPgmTpo_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A948MnuPgmTpo", A948MnuPgmTpo);
         A949MnuPgmTxt = httpContext.cgiGet( edtMnuPgmTxt_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A949MnuPgmTxt", A949MnuPgmTxt);
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
            A945MnuId = httpContext.GetPar( "MnuId") ;
            httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
            A946MnuOp = (byte)(GXutil.lval( httpContext.GetPar( "MnuOp"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A946MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A946MnuOp), 2, 0));
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
            initAll1UA125( ) ;
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
      disableAttributes1UA125( ) ;
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

   public void resetCaption1UA0( )
   {
   }

   public void zm1UA125( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z947MnuPgm = T01UA3_A947MnuPgm[0] ;
            Z14286MnuPgmWeb = T01UA3_A14286MnuPgmWeb[0] ;
            Z948MnuPgmTpo = T01UA3_A948MnuPgmTpo[0] ;
            Z949MnuPgmTxt = T01UA3_A949MnuPgmTxt[0] ;
         }
         else
         {
            Z947MnuPgm = A947MnuPgm ;
            Z14286MnuPgmWeb = A14286MnuPgmWeb ;
            Z948MnuPgmTpo = A948MnuPgmTpo ;
            Z949MnuPgmTxt = A949MnuPgmTxt ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z946MnuOp = A946MnuOp ;
         Z947MnuPgm = A947MnuPgm ;
         Z14286MnuPgmWeb = A14286MnuPgmWeb ;
         Z948MnuPgmTpo = A948MnuPgmTpo ;
         Z949MnuPgmTxt = A949MnuPgmTxt ;
         Z945MnuId = A945MnuId ;
         Z951MnuTxt = A951MnuTxt ;
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

   public void load1UA125( )
   {
      /* Using cursor T01UA5 */
      pr_default.execute(3, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound125 = (short)(1) ;
         A951MnuTxt = T01UA5_A951MnuTxt[0] ;
         n951MnuTxt = T01UA5_n951MnuTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
         A947MnuPgm = T01UA5_A947MnuPgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A947MnuPgm", A947MnuPgm);
         A14286MnuPgmWeb = T01UA5_A14286MnuPgmWeb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14286MnuPgmWeb", A14286MnuPgmWeb);
         A948MnuPgmTpo = T01UA5_A948MnuPgmTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A948MnuPgmTpo", A948MnuPgmTpo);
         A949MnuPgmTxt = T01UA5_A949MnuPgmTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A949MnuPgmTxt", A949MnuPgmTxt);
         zm1UA125( -2) ;
      }
      pr_default.close(3);
      onLoadActions1UA125( ) ;
   }

   public void onLoadActions1UA125( )
   {
   }

   public void checkExtendedTable1UA125( )
   {
      nIsDirty_125 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01UA4 */
      pr_default.execute(2, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MNUCAB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MNUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMnuId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A951MnuTxt = T01UA4_A951MnuTxt[0] ;
      n951MnuTxt = T01UA4_n951MnuTxt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
      pr_default.close(2);
      if ( ! ( ( GXutil.strcmp(A948MnuPgmTpo, "S") == 0 ) || ( GXutil.strcmp(A948MnuPgmTpo, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Ind. de Requiere parámetro", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "MNUPGMTPO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMnuPgmTpo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1UA125( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A945MnuId )
   {
      /* Using cursor T01UA6 */
      pr_default.execute(4, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MNUCAB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MNUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMnuId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A951MnuTxt = T01UA6_A951MnuTxt[0] ;
      n951MnuTxt = T01UA6_n951MnuTxt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A951MnuTxt))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey1UA125( )
   {
      /* Using cursor T01UA7 */
      pr_default.execute(5, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound125 = (short)(1) ;
      }
      else
      {
         RcdFound125 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UA3 */
      pr_default.execute(1, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UA125( 2) ;
         RcdFound125 = (short)(1) ;
         A946MnuOp = T01UA3_A946MnuOp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A946MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A946MnuOp), 2, 0));
         A947MnuPgm = T01UA3_A947MnuPgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A947MnuPgm", A947MnuPgm);
         A14286MnuPgmWeb = T01UA3_A14286MnuPgmWeb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14286MnuPgmWeb", A14286MnuPgmWeb);
         A948MnuPgmTpo = T01UA3_A948MnuPgmTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A948MnuPgmTpo", A948MnuPgmTpo);
         A949MnuPgmTxt = T01UA3_A949MnuPgmTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A949MnuPgmTxt", A949MnuPgmTxt);
         A945MnuId = T01UA3_A945MnuId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
         Z945MnuId = A945MnuId ;
         Z946MnuOp = A946MnuOp ;
         sMode125 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1UA125( ) ;
         if ( AnyError == 1 )
         {
            RcdFound125 = (short)(0) ;
            initializeNonKey1UA125( ) ;
         }
         Gx_mode = sMode125 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound125 = (short)(0) ;
         initializeNonKey1UA125( ) ;
         sMode125 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode125 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1UA125( ) ;
      if ( RcdFound125 == 0 )
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
      RcdFound125 = (short)(0) ;
      /* Using cursor T01UA8 */
      pr_default.execute(6, new Object[] {A945MnuId, A945MnuId, Byte.valueOf(A946MnuOp)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01UA8_A945MnuId[0], A945MnuId) < 0 ) || ( GXutil.strcmp(T01UA8_A945MnuId[0], A945MnuId) == 0 ) && ( T01UA8_A946MnuOp[0] < A946MnuOp ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01UA8_A945MnuId[0], A945MnuId) > 0 ) || ( GXutil.strcmp(T01UA8_A945MnuId[0], A945MnuId) == 0 ) && ( T01UA8_A946MnuOp[0] > A946MnuOp ) ) )
         {
            A945MnuId = T01UA8_A945MnuId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
            A946MnuOp = T01UA8_A946MnuOp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A946MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A946MnuOp), 2, 0));
            RcdFound125 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound125 = (short)(0) ;
      /* Using cursor T01UA9 */
      pr_default.execute(7, new Object[] {A945MnuId, A945MnuId, Byte.valueOf(A946MnuOp)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01UA9_A945MnuId[0], A945MnuId) > 0 ) || ( GXutil.strcmp(T01UA9_A945MnuId[0], A945MnuId) == 0 ) && ( T01UA9_A946MnuOp[0] > A946MnuOp ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01UA9_A945MnuId[0], A945MnuId) < 0 ) || ( GXutil.strcmp(T01UA9_A945MnuId[0], A945MnuId) == 0 ) && ( T01UA9_A946MnuOp[0] < A946MnuOp ) ) )
         {
            A945MnuId = T01UA9_A945MnuId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
            A946MnuOp = T01UA9_A946MnuOp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A946MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A946MnuOp), 2, 0));
            RcdFound125 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UA125( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMnuId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UA125( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound125 == 1 )
         {
            if ( ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 ) || ( A946MnuOp != Z946MnuOp ) )
            {
               A945MnuId = Z945MnuId ;
               httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
               A946MnuOp = Z946MnuOp ;
               httpContext.ajax_rsp_assign_attri("", false, "A946MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A946MnuOp), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MNUID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMnuId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMnuId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1UA125( ) ;
               GX_FocusControl = edtMnuId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 ) || ( A946MnuOp != Z946MnuOp ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMnuId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UA125( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MNUID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMnuId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtMnuId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1UA125( ) ;
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
      if ( ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 ) || ( A946MnuOp != Z946MnuOp ) )
      {
         A945MnuId = Z945MnuId ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
         A946MnuOp = Z946MnuOp ;
         httpContext.ajax_rsp_assign_attri("", false, "A946MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A946MnuOp), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MNUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMnuId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMnuId_Internalname ;
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
      if ( RcdFound125 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "MNUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMnuId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMnuPgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1UA125( ) ;
      if ( RcdFound125 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMnuPgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1UA125( ) ;
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
      if ( RcdFound125 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMnuPgm_Internalname ;
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
      if ( RcdFound125 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMnuPgm_Internalname ;
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
      scanStart1UA125( ) ;
      if ( RcdFound125 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound125 != 0 )
         {
            scanNext1UA125( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMnuPgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1UA125( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1UA125( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UA2 */
         pr_default.execute(0, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMNUOP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z947MnuPgm, T01UA2_A947MnuPgm[0]) != 0 ) || ( GXutil.strcmp(Z14286MnuPgmWeb, T01UA2_A14286MnuPgmWeb[0]) != 0 ) || ( GXutil.strcmp(Z948MnuPgmTpo, T01UA2_A948MnuPgmTpo[0]) != 0 ) || ( GXutil.strcmp(Z949MnuPgmTxt, T01UA2_A949MnuPgmTxt[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z947MnuPgm, T01UA2_A947MnuPgm[0]) != 0 )
            {
               GXutil.writeLogln("tmenunivel1:[seudo value changed for attri]"+"MnuPgm");
               GXutil.writeLogRaw("Old: ",Z947MnuPgm);
               GXutil.writeLogRaw("Current: ",T01UA2_A947MnuPgm[0]);
            }
            if ( GXutil.strcmp(Z14286MnuPgmWeb, T01UA2_A14286MnuPgmWeb[0]) != 0 )
            {
               GXutil.writeLogln("tmenunivel1:[seudo value changed for attri]"+"MnuPgmWeb");
               GXutil.writeLogRaw("Old: ",Z14286MnuPgmWeb);
               GXutil.writeLogRaw("Current: ",T01UA2_A14286MnuPgmWeb[0]);
            }
            if ( GXutil.strcmp(Z948MnuPgmTpo, T01UA2_A948MnuPgmTpo[0]) != 0 )
            {
               GXutil.writeLogln("tmenunivel1:[seudo value changed for attri]"+"MnuPgmTpo");
               GXutil.writeLogRaw("Old: ",Z948MnuPgmTpo);
               GXutil.writeLogRaw("Current: ",T01UA2_A948MnuPgmTpo[0]);
            }
            if ( GXutil.strcmp(Z949MnuPgmTxt, T01UA2_A949MnuPgmTxt[0]) != 0 )
            {
               GXutil.writeLogln("tmenunivel1:[seudo value changed for attri]"+"MnuPgmTxt");
               GXutil.writeLogRaw("Old: ",Z949MnuPgmTxt);
               GXutil.writeLogRaw("Current: ",T01UA2_A949MnuPgmTxt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMNUOP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UA125( )
   {
      beforeValidate1UA125( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UA125( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UA125( 0) ;
         checkOptimisticConcurrency1UA125( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UA125( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UA125( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UA10 */
                  pr_default.execute(8, new Object[] {Byte.valueOf(A946MnuOp), A947MnuPgm, A14286MnuPgmWeb, A948MnuPgmTpo, A949MnuPgmTxt, A945MnuId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUOP");
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
                        resetCaption1UA0( ) ;
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
            load1UA125( ) ;
         }
         endLevel1UA125( ) ;
      }
      closeExtendedTableCursors1UA125( ) ;
   }

   public void update1UA125( )
   {
      beforeValidate1UA125( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UA125( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UA125( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UA125( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UA125( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UA11 */
                  pr_default.execute(9, new Object[] {A947MnuPgm, A14286MnuPgmWeb, A948MnuPgmTpo, A949MnuPgmTxt, A945MnuId, Byte.valueOf(A946MnuOp)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUOP");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMNUOP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UA125( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1UA0( ) ;
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
         endLevel1UA125( ) ;
      }
      closeExtendedTableCursors1UA125( ) ;
   }

   public void deferredUpdate1UA125( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1UA125( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UA125( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UA125( ) ;
         afterConfirm1UA125( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UA125( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UA12 */
               pr_default.execute(10, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUOP");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound125 == 0 )
                     {
                        initAll1UA125( ) ;
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
                     resetCaption1UA0( ) ;
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
      sMode125 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UA125( ) ;
      Gx_mode = sMode125 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UA125( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UA13 */
         pr_default.execute(11, new Object[] {A945MnuId});
         A951MnuTxt = T01UA13_A951MnuTxt[0] ;
         n951MnuTxt = T01UA13_n951MnuTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
         pr_default.close(11);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01UA14 */
         pr_default.execute(12, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPCGRU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel1UA125( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UA125( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmenunivel1");
         if ( AnyError == 0 )
         {
            confirmValues1UA0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmenunivel1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UA125( )
   {
      /* Using cursor T01UA15 */
      pr_default.execute(13);
      RcdFound125 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound125 = (short)(1) ;
         A945MnuId = T01UA15_A945MnuId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
         A946MnuOp = T01UA15_A946MnuOp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A946MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A946MnuOp), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UA125( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound125 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound125 = (short)(1) ;
         A945MnuId = T01UA15_A945MnuId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
         A946MnuOp = T01UA15_A946MnuOp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A946MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A946MnuOp), 2, 0));
      }
   }

   public void scanEnd1UA125( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1UA125( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UA125( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UA125( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UA125( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UA125( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UA125( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UA125( )
   {
      edtMnuId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuId_Enabled), 5, 0), true);
      edtMnuTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuTxt_Enabled), 5, 0), true);
      edtMnuOp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuOp_Enabled), 5, 0), true);
      edtMnuPgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgm_Enabled), 5, 0), true);
      edtMnuPgmWeb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmWeb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmWeb_Enabled), 5, 0), true);
      edtMnuPgmTpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmTpo_Enabled), 5, 0), true);
      edtMnuPgmTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmTxt_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1UA125( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1UA0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmenunivel1", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z945MnuId", GXutil.rtrim( Z945MnuId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z946MnuOp", GXutil.ltrim( localUtil.ntoc( Z946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z947MnuPgm", GXutil.rtrim( Z947MnuPgm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14286MnuPgmWeb", Z14286MnuPgmWeb);
      app.GxWebStd.gx_hidden_field( httpContext, "Z948MnuPgmTpo", GXutil.rtrim( Z948MnuPgmTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z949MnuPgmTxt", GXutil.rtrim( Z949MnuPgmTxt));
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
      return formatLink("app.tmenunivel1", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMENUNIVEL1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TMENUNIVEL1", "") ;
   }

   public void initializeNonKey1UA125( )
   {
      A951MnuTxt = "" ;
      n951MnuTxt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
      A947MnuPgm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A947MnuPgm", A947MnuPgm);
      A14286MnuPgmWeb = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14286MnuPgmWeb", A14286MnuPgmWeb);
      A948MnuPgmTpo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A948MnuPgmTpo", A948MnuPgmTpo);
      A949MnuPgmTxt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A949MnuPgmTxt", A949MnuPgmTxt);
      Z947MnuPgm = "" ;
      Z14286MnuPgmWeb = "" ;
      Z948MnuPgmTpo = "" ;
      Z949MnuPgmTxt = "" ;
   }

   public void initAll1UA125( )
   {
      A945MnuId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
      A946MnuOp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A946MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A946MnuOp), 2, 0));
      initializeNonKey1UA125( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202612519105115", true, true);
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
      httpContext.AddJavascriptSource("tmenunivel1.js", "?202612519105115", false, true);
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
      edtMnuId_Internalname = "MNUID" ;
      edtMnuTxt_Internalname = "MNUTXT" ;
      edtMnuOp_Internalname = "MNUOP" ;
      edtMnuPgm_Internalname = "MNUPGM" ;
      edtMnuPgmWeb_Internalname = "MNUPGMWEB" ;
      edtMnuPgmTpo_Internalname = "MNUPGMTPO" ;
      edtMnuPgmTxt_Internalname = "MNUPGMTXT" ;
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
      Form.setCaption( httpContext.getMessage( "TMENUNIVEL1", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMnuPgmTxt_Jsonclick = "" ;
      edtMnuPgmTxt_Enabled = 1 ;
      edtMnuPgmTpo_Jsonclick = "" ;
      edtMnuPgmTpo_Enabled = 1 ;
      edtMnuPgmWeb_Enabled = 1 ;
      edtMnuPgm_Jsonclick = "" ;
      edtMnuPgm_Enabled = 1 ;
      edtMnuOp_Jsonclick = "" ;
      edtMnuOp_Enabled = 1 ;
      edtMnuTxt_Jsonclick = "" ;
      edtMnuTxt_Enabled = 0 ;
      edtMnuId_Jsonclick = "" ;
      edtMnuId_Enabled = 1 ;
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
      /* Using cursor T01UA13 */
      pr_default.execute(11, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MNUCAB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MNUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMnuId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A951MnuTxt = T01UA13_A951MnuTxt[0] ;
      n951MnuTxt = T01UA13_n951MnuTxt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
      pr_default.close(11);
      GX_FocusControl = edtMnuPgm_Internalname ;
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

   public void valid_Mnuid( )
   {
      n951MnuTxt = false ;
      /* Using cursor T01UA13 */
      pr_default.execute(11, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MNUCAB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MNUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMnuId_Internalname ;
      }
      A951MnuTxt = T01UA13_A951MnuTxt[0] ;
      n951MnuTxt = T01UA13_n951MnuTxt[0] ;
      pr_default.close(11);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", GXutil.rtrim( A951MnuTxt));
   }

   public void valid_Mnuop( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A947MnuPgm", GXutil.rtrim( A947MnuPgm));
      httpContext.ajax_rsp_assign_attri("", false, "A14286MnuPgmWeb", A14286MnuPgmWeb);
      httpContext.ajax_rsp_assign_attri("", false, "A948MnuPgmTpo", GXutil.rtrim( A948MnuPgmTpo));
      httpContext.ajax_rsp_assign_attri("", false, "A949MnuPgmTxt", GXutil.rtrim( A949MnuPgmTxt));
      httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", GXutil.rtrim( A951MnuTxt));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z945MnuId", GXutil.rtrim( Z945MnuId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z946MnuOp", GXutil.ltrim( localUtil.ntoc( Z946MnuOp, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z947MnuPgm", GXutil.rtrim( Z947MnuPgm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14286MnuPgmWeb", Z14286MnuPgmWeb);
      app.GxWebStd.gx_hidden_field( httpContext, "Z948MnuPgmTpo", GXutil.rtrim( Z948MnuPgmTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z949MnuPgmTxt", GXutil.rtrim( Z949MnuPgmTxt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z951MnuTxt", GXutil.rtrim( Z951MnuTxt));
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
      setEventMetadata("VALID_MNUID","{handler:'valid_Mnuid',iparms:[{av:'A945MnuId',fld:'MNUID',pic:'@!'},{av:'A951MnuTxt',fld:'MNUTXT',pic:''}]");
      setEventMetadata("VALID_MNUID",",oparms:[{av:'A951MnuTxt',fld:'MNUTXT',pic:''}]}");
      setEventMetadata("VALID_MNUOP","{handler:'valid_Mnuop',iparms:[{av:'A945MnuId',fld:'MNUID',pic:'@!'},{av:'A946MnuOp',fld:'MNUOP',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MNUOP",",oparms:[{av:'A947MnuPgm',fld:'MNUPGM',pic:'@!'},{av:'A14286MnuPgmWeb',fld:'MNUPGMWEB',pic:''},{av:'A948MnuPgmTpo',fld:'MNUPGMTPO',pic:'@!'},{av:'A949MnuPgmTxt',fld:'MNUPGMTXT',pic:''},{av:'A951MnuTxt',fld:'MNUTXT',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z945MnuId'},{av:'Z946MnuOp'},{av:'Z947MnuPgm'},{av:'Z14286MnuPgmWeb'},{av:'Z948MnuPgmTpo'},{av:'Z949MnuPgmTxt'},{av:'Z951MnuTxt'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_MNUPGMTPO","{handler:'valid_Mnupgmtpo',iparms:[]");
      setEventMetadata("VALID_MNUPGMTPO",",oparms:[]}");
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
      pr_default.close(11);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z945MnuId = "" ;
      Z947MnuPgm = "" ;
      Z14286MnuPgmWeb = "" ;
      Z948MnuPgmTpo = "" ;
      Z949MnuPgmTxt = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A945MnuId = "" ;
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
      A951MnuTxt = "" ;
      A947MnuPgm = "" ;
      A14286MnuPgmWeb = "" ;
      A948MnuPgmTpo = "" ;
      A949MnuPgmTxt = "" ;
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
      Z951MnuTxt = "" ;
      T01UA5_A946MnuOp = new byte[1] ;
      T01UA5_A951MnuTxt = new String[] {""} ;
      T01UA5_n951MnuTxt = new boolean[] {false} ;
      T01UA5_A947MnuPgm = new String[] {""} ;
      T01UA5_A14286MnuPgmWeb = new String[] {""} ;
      T01UA5_A948MnuPgmTpo = new String[] {""} ;
      T01UA5_A949MnuPgmTxt = new String[] {""} ;
      T01UA5_A945MnuId = new String[] {""} ;
      T01UA4_A951MnuTxt = new String[] {""} ;
      T01UA4_n951MnuTxt = new boolean[] {false} ;
      T01UA6_A951MnuTxt = new String[] {""} ;
      T01UA6_n951MnuTxt = new boolean[] {false} ;
      T01UA7_A945MnuId = new String[] {""} ;
      T01UA7_A946MnuOp = new byte[1] ;
      T01UA3_A946MnuOp = new byte[1] ;
      T01UA3_A947MnuPgm = new String[] {""} ;
      T01UA3_A14286MnuPgmWeb = new String[] {""} ;
      T01UA3_A948MnuPgmTpo = new String[] {""} ;
      T01UA3_A949MnuPgmTxt = new String[] {""} ;
      T01UA3_A945MnuId = new String[] {""} ;
      sMode125 = "" ;
      T01UA8_A945MnuId = new String[] {""} ;
      T01UA8_A946MnuOp = new byte[1] ;
      T01UA9_A945MnuId = new String[] {""} ;
      T01UA9_A946MnuOp = new byte[1] ;
      T01UA2_A946MnuOp = new byte[1] ;
      T01UA2_A947MnuPgm = new String[] {""} ;
      T01UA2_A14286MnuPgmWeb = new String[] {""} ;
      T01UA2_A948MnuPgmTpo = new String[] {""} ;
      T01UA2_A949MnuPgmTxt = new String[] {""} ;
      T01UA2_A945MnuId = new String[] {""} ;
      T01UA13_A951MnuTxt = new String[] {""} ;
      T01UA13_n951MnuTxt = new boolean[] {false} ;
      T01UA14_A945MnuId = new String[] {""} ;
      T01UA14_A946MnuOp = new byte[1] ;
      T01UA14_A943GrpId = new String[] {""} ;
      T01UA15_A945MnuId = new String[] {""} ;
      T01UA15_A946MnuOp = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ945MnuId = "" ;
      ZZ947MnuPgm = "" ;
      ZZ14286MnuPgmWeb = "" ;
      ZZ948MnuPgmTpo = "" ;
      ZZ949MnuPgmTxt = "" ;
      ZZ951MnuTxt = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmenunivel1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmenunivel1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmenunivel1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmenunivel1__default(),
         new Object[] {
             new Object[] {
            T01UA2_A946MnuOp, T01UA2_A947MnuPgm, T01UA2_A14286MnuPgmWeb, T01UA2_A948MnuPgmTpo, T01UA2_A949MnuPgmTxt, T01UA2_A945MnuId
            }
            , new Object[] {
            T01UA3_A946MnuOp, T01UA3_A947MnuPgm, T01UA3_A14286MnuPgmWeb, T01UA3_A948MnuPgmTpo, T01UA3_A949MnuPgmTxt, T01UA3_A945MnuId
            }
            , new Object[] {
            T01UA4_A951MnuTxt, T01UA4_n951MnuTxt
            }
            , new Object[] {
            T01UA5_A946MnuOp, T01UA5_A951MnuTxt, T01UA5_n951MnuTxt, T01UA5_A947MnuPgm, T01UA5_A14286MnuPgmWeb, T01UA5_A948MnuPgmTpo, T01UA5_A949MnuPgmTxt, T01UA5_A945MnuId
            }
            , new Object[] {
            T01UA6_A951MnuTxt, T01UA6_n951MnuTxt
            }
            , new Object[] {
            T01UA7_A945MnuId, T01UA7_A946MnuOp
            }
            , new Object[] {
            T01UA8_A945MnuId, T01UA8_A946MnuOp
            }
            , new Object[] {
            T01UA9_A945MnuId, T01UA9_A946MnuOp
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UA13_A951MnuTxt, T01UA13_n951MnuTxt
            }
            , new Object[] {
            T01UA14_A945MnuId, T01UA14_A946MnuOp, T01UA14_A943GrpId
            }
            , new Object[] {
            T01UA15_A945MnuId, T01UA15_A946MnuOp
            }
         }
      );
   }

   private byte Z946MnuOp ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A946MnuOp ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ946MnuOp ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound125 ;
   private short nIsDirty_125 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtMnuId_Enabled ;
   private int edtMnuTxt_Enabled ;
   private int edtMnuOp_Enabled ;
   private int edtMnuPgm_Enabled ;
   private int edtMnuPgmWeb_Enabled ;
   private int edtMnuPgmTpo_Enabled ;
   private int edtMnuPgmTxt_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String Z945MnuId ;
   private String Z947MnuPgm ;
   private String Z948MnuPgmTpo ;
   private String Z949MnuPgmTxt ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A945MnuId ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMnuId_Internalname ;
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
   private String edtMnuId_Jsonclick ;
   private String edtMnuTxt_Internalname ;
   private String A951MnuTxt ;
   private String edtMnuTxt_Jsonclick ;
   private String edtMnuOp_Internalname ;
   private String edtMnuOp_Jsonclick ;
   private String edtMnuPgm_Internalname ;
   private String A947MnuPgm ;
   private String edtMnuPgm_Jsonclick ;
   private String edtMnuPgmWeb_Internalname ;
   private String edtMnuPgmTpo_Internalname ;
   private String A948MnuPgmTpo ;
   private String edtMnuPgmTpo_Jsonclick ;
   private String edtMnuPgmTxt_Internalname ;
   private String A949MnuPgmTxt ;
   private String edtMnuPgmTxt_Jsonclick ;
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
   private String Z951MnuTxt ;
   private String sMode125 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ945MnuId ;
   private String ZZ947MnuPgm ;
   private String ZZ948MnuPgmTpo ;
   private String ZZ949MnuPgmTxt ;
   private String ZZ951MnuTxt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n951MnuTxt ;
   private String Z14286MnuPgmWeb ;
   private String A14286MnuPgmWeb ;
   private String ZZ14286MnuPgmWeb ;
   private IDataStoreProvider pr_default ;
   private byte[] T01UA5_A946MnuOp ;
   private String[] T01UA5_A951MnuTxt ;
   private boolean[] T01UA5_n951MnuTxt ;
   private String[] T01UA5_A947MnuPgm ;
   private String[] T01UA5_A14286MnuPgmWeb ;
   private String[] T01UA5_A948MnuPgmTpo ;
   private String[] T01UA5_A949MnuPgmTxt ;
   private String[] T01UA5_A945MnuId ;
   private String[] T01UA4_A951MnuTxt ;
   private boolean[] T01UA4_n951MnuTxt ;
   private String[] T01UA6_A951MnuTxt ;
   private boolean[] T01UA6_n951MnuTxt ;
   private String[] T01UA7_A945MnuId ;
   private byte[] T01UA7_A946MnuOp ;
   private byte[] T01UA3_A946MnuOp ;
   private String[] T01UA3_A947MnuPgm ;
   private String[] T01UA3_A14286MnuPgmWeb ;
   private String[] T01UA3_A948MnuPgmTpo ;
   private String[] T01UA3_A949MnuPgmTxt ;
   private String[] T01UA3_A945MnuId ;
   private String[] T01UA8_A945MnuId ;
   private byte[] T01UA8_A946MnuOp ;
   private String[] T01UA9_A945MnuId ;
   private byte[] T01UA9_A946MnuOp ;
   private byte[] T01UA2_A946MnuOp ;
   private String[] T01UA2_A947MnuPgm ;
   private String[] T01UA2_A14286MnuPgmWeb ;
   private String[] T01UA2_A948MnuPgmTpo ;
   private String[] T01UA2_A949MnuPgmTxt ;
   private String[] T01UA2_A945MnuId ;
   private String[] T01UA13_A951MnuTxt ;
   private boolean[] T01UA13_n951MnuTxt ;
   private String[] T01UA14_A945MnuId ;
   private byte[] T01UA14_A946MnuOp ;
   private String[] T01UA14_A943GrpId ;
   private String[] T01UA15_A945MnuId ;
   private byte[] T01UA15_A946MnuOp ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmenunivel1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmenunivel1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmenunivel1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmenunivel1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UA2", "SELECT MnuOp, MnuPgm, MnuPgmWeb, MnuPgmTpo, MnuPgmTxt, MnuId FROM TXPMNUOP WHERE MnuId = ? AND MnuOp = ?  FOR UPDATE OF MnuPgm, MnuPgmWeb, MnuPgmTpo, MnuPgmTxt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UA3", "SELECT MnuOp, MnuPgm, MnuPgmWeb, MnuPgmTpo, MnuPgmTxt, MnuId FROM TXPMNUOP WHERE MnuId = ? AND MnuOp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UA4", "SELECT MnuTxt FROM TXPMNUCAB WHERE MnuId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UA5", "SELECT /*+ FIRST_ROWS(100) */ TM1.MnuOp, T2.MnuTxt, TM1.MnuPgm, TM1.MnuPgmWeb, TM1.MnuPgmTpo, TM1.MnuPgmTxt, TM1.MnuId FROM (TXPMNUOP TM1 INNER JOIN TXPMNUCAB T2 ON T2.MnuId = TM1.MnuId) WHERE TM1.MnuId = ? and TM1.MnuOp = ? ORDER BY TM1.MnuId, TM1.MnuOp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UA6", "SELECT MnuTxt FROM TXPMNUCAB WHERE MnuId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UA7", "SELECT /*+ FIRST_ROWS(1) */ MnuId, MnuOp FROM TXPMNUOP WHERE MnuId = ? AND MnuOp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UA8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MnuId, MnuOp FROM TXPMNUOP WHERE ( MnuId > ? or MnuId = ? and MnuOp > ?) ORDER BY MnuId, MnuOp) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UA9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MnuId, MnuOp FROM TXPMNUOP WHERE ( MnuId < ? or MnuId = ? and MnuOp < ?) ORDER BY MnuId DESC, MnuOp DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UA10", "INSERT INTO TXPMNUOP(MnuOp, MnuPgm, MnuPgmWeb, MnuPgmTpo, MnuPgmTxt, MnuId, MnuIcon, MnuSit) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ')", GX_NOMASK, "TXPMNUOP")
         ,new UpdateCursor("T01UA11", "UPDATE TXPMNUOP SET MnuPgm=?, MnuPgmWeb=?, MnuPgmTpo=?, MnuPgmTxt=?  WHERE MnuId = ? AND MnuOp = ?", GX_NOMASK, "TXPMNUOP")
         ,new UpdateCursor("T01UA12", "DELETE FROM TXPMNUOP  WHERE MnuId = ? AND MnuOp = ?", GX_NOMASK, "TXPMNUOP")
         ,new ForEachCursor("T01UA13", "SELECT MnuTxt FROM TXPMNUCAB WHERE MnuId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UA14", "SELECT * FROM (SELECT MnuId, MnuOp, GrpId FROM TXPOPCGRU WHERE MnuId = ? AND MnuOp = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UA15", "SELECT /*+ FIRST_ROWS(100) */ MnuId, MnuOp FROM TXPMNUOP ORDER BY MnuId, MnuOp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 200, false);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 30);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

