package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class linses_trn_impl extends GXDataArea
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
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A8366PrdAnyo = (short)(GXutil.lval( httpContext.GetPar( "PrdAnyo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8366PrdAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8366PrdAnyo), 4, 0));
         A8360PrdProv = (int)(GXutil.lval( httpContext.GetPar( "PrdProv"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8360PrdProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8360PrdProv), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A719PrdNum, A8366PrdAnyo, A8360PrdProv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A8366PrdAnyo = (short)(GXutil.lval( httpContext.GetPar( "PrdAnyo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8366PrdAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8366PrdAnyo), 4, 0));
         A8360PrdProv = (int)(GXutil.lval( httpContext.GetPar( "PrdProv"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8360PrdProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8360PrdProv), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A719PrdNum, A8366PrdAnyo, A8360PrdProv) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "LINSES_TRN", ""), (short)(0)) ;
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

   public linses_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public linses_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( linses_trn_impl.class ));
   }

   public linses_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "LINSES_TRN", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_LINSES_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LINSES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LINSES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LINSES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LINSES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_LINSES_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LINSES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LINSES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdAnyo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdAnyo_Internalname, httpContext.getMessage( "Anyo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdAnyo_Internalname, GXutil.ltrim( localUtil.ntoc( A8366PrdAnyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdAnyo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8366PrdAnyo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8366PrdAnyo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdAnyo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdAnyo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LINSES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdProv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdProv_Internalname, httpContext.getMessage( "Proveedor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdProv_Internalname, GXutil.ltrim( localUtil.ntoc( A8360PrdProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdProv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8360PrdProv), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8360PrdProv), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdProv_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdProv_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LINSES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUndCpA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUndCpA_Internalname, httpContext.getMessage( "Suma Unidades Compradas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUndCpA_Internalname, GXutil.ltrim( localUtil.ntoc( A8361PrdUndCpA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUndCpA_Enabled!=0) ? localUtil.format( A8361PrdUndCpA, "ZZZZZZ9.99") : localUtil.format( A8361PrdUndCpA, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUndCpA_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUndCpA_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LINSES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUndCnA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUndCnA_Internalname, httpContext.getMessage( "Suma Unidades Valor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUndCnA_Internalname, GXutil.ltrim( localUtil.ntoc( A8362PrdUndCnA, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUndCnA_Enabled!=0) ? localUtil.format( A8362PrdUndCnA, "ZZZZZZZZ9.99") : localUtil.format( A8362PrdUndCnA, "ZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUndCnA_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUndCnA_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LINSES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdMesL_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdMesL_Internalname, httpContext.getMessage( "Mes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdMesL_Internalname, GXutil.ltrim( localUtil.ntoc( A8363PrdMesL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdMesL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8363PrdMesL), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A8363PrdMesL), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdMesL_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdMesL_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LINSES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUndCpM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUndCpM_Internalname, httpContext.getMessage( "Unidades Compras Mes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUndCpM_Internalname, GXutil.ltrim( localUtil.ntoc( A8364PrdUndCpM, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUndCpM_Enabled!=0) ? localUtil.format( A8364PrdUndCpM, "ZZZZZZ9.99") : localUtil.format( A8364PrdUndCpM, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUndCpM_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUndCpM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LINSES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUndCnM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUndCnM_Internalname, httpContext.getMessage( "Valor Unidades Compradas Mes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUndCnM_Internalname, GXutil.ltrim( localUtil.ntoc( A8365PrdUndCnM, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUndCnM_Enabled!=0) ? localUtil.format( A8365PrdUndCnM, "ZZZZZZZZ9.99") : localUtil.format( A8365PrdUndCnM, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUndCnM_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUndCnM_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LINSES_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LINSES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LINSES_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LINSES_TRN.htm");
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
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z8366PrdAnyo = (short)(localUtil.ctol( httpContext.cgiGet( "Z8366PrdAnyo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8360PrdProv = (int)(localUtil.ctol( httpContext.cgiGet( "Z8360PrdProv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8363PrdMesL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8363PrdMesL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8364PrdUndCpM = localUtil.ctond( httpContext.cgiGet( "Z8364PrdUndCpM")) ;
         Z8365PrdUndCnM = localUtil.ctond( httpContext.cgiGet( "Z8365PrdUndCnM")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdAnyo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdAnyo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDANYO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdAnyo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8366PrdAnyo = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8366PrdAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8366PrdAnyo), 4, 0));
         }
         else
         {
            A8366PrdAnyo = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdAnyo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8366PrdAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8366PrdAnyo), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdProv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdProv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPROV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdProv_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8360PrdProv = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A8360PrdProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8360PrdProv), 6, 0));
         }
         else
         {
            A8360PrdProv = (int)(localUtil.ctol( httpContext.cgiGet( edtPrdProv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8360PrdProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8360PrdProv), 6, 0));
         }
         A8361PrdUndCpA = localUtil.ctond( httpContext.cgiGet( edtPrdUndCpA_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8361PrdUndCpA", GXutil.ltrimstr( A8361PrdUndCpA, 10, 2));
         A8362PrdUndCnA = localUtil.ctond( httpContext.cgiGet( edtPrdUndCnA_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8362PrdUndCnA", GXutil.ltrimstr( A8362PrdUndCnA, 12, 2));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdMesL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdMesL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDMESL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdMesL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8363PrdMesL = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8363PrdMesL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8363PrdMesL), 2, 0));
         }
         else
         {
            A8363PrdMesL = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdMesL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8363PrdMesL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8363PrdMesL), 2, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdUndCpM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdUndCpM_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDUNDCPM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUndCpM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8364PrdUndCpM = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8364PrdUndCpM", GXutil.ltrimstr( A8364PrdUndCpM, 10, 2));
         }
         else
         {
            A8364PrdUndCpM = localUtil.ctond( httpContext.cgiGet( edtPrdUndCpM_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8364PrdUndCpM", GXutil.ltrimstr( A8364PrdUndCpM, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdUndCnM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdUndCnM_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDUNDCNM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUndCnM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8365PrdUndCnM = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8365PrdUndCnM", GXutil.ltrimstr( A8365PrdUndCnM, 12, 2));
         }
         else
         {
            A8365PrdUndCnM = localUtil.ctond( httpContext.cgiGet( edtPrdUndCnM_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8365PrdUndCnM", GXutil.ltrimstr( A8365PrdUndCnM, 12, 2));
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
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A8366PrdAnyo = (short)(GXutil.lval( httpContext.GetPar( "PrdAnyo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8366PrdAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8366PrdAnyo), 4, 0));
            A8360PrdProv = (int)(GXutil.lval( httpContext.GetPar( "PrdProv"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8360PrdProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8360PrdProv), 6, 0));
            A8363PrdMesL = (byte)(GXutil.lval( httpContext.GetPar( "PrdMesL"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8363PrdMesL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8363PrdMesL), 2, 0));
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
            initAll1RY1157( ) ;
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
      disableAttributes1RY1157( ) ;
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

   public void resetCaption1RY0( )
   {
   }

   public void zm1RY1157( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8364PrdUndCpM = T01RY3_A8364PrdUndCpM[0] ;
            Z8365PrdUndCnM = T01RY3_A8365PrdUndCnM[0] ;
         }
         else
         {
            Z8364PrdUndCpM = A8364PrdUndCpM ;
            Z8365PrdUndCnM = A8365PrdUndCnM ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z8363PrdMesL = A8363PrdMesL ;
         Z8364PrdUndCpM = A8364PrdUndCpM ;
         Z8365PrdUndCnM = A8365PrdUndCnM ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z8366PrdAnyo = A8366PrdAnyo ;
         Z8360PrdProv = A8360PrdProv ;
         Z8362PrdUndCnA = A8362PrdUndCnA ;
         Z8361PrdUndCpA = A8361PrdUndCpA ;
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

   public void load1RY1157( )
   {
      /* Using cursor T01RY8 */
      pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv), Byte.valueOf(A8363PrdMesL)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1157 = (short)(1) ;
         A8364PrdUndCpM = T01RY8_A8364PrdUndCpM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8364PrdUndCpM", GXutil.ltrimstr( A8364PrdUndCpM, 10, 2));
         A8365PrdUndCnM = T01RY8_A8365PrdUndCnM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8365PrdUndCnM", GXutil.ltrimstr( A8365PrdUndCnM, 12, 2));
         A8362PrdUndCnA = T01RY8_A8362PrdUndCnA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8362PrdUndCnA", GXutil.ltrimstr( A8362PrdUndCnA, 12, 2));
         A8361PrdUndCpA = T01RY8_A8361PrdUndCpA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8361PrdUndCpA", GXutil.ltrimstr( A8361PrdUndCpA, 10, 2));
         zm1RY1157( -1) ;
      }
      pr_default.close(4);
      onLoadActions1RY1157( ) ;
   }

   public void onLoadActions1RY1157( )
   {
   }

   public void checkExtendedTable1RY1157( )
   {
      nIsDirty_1157 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01RY4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INSEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDPROV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01RY6 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A8362PrdUndCnA = T01RY6_A8362PrdUndCnA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8362PrdUndCnA", GXutil.ltrimstr( A8362PrdUndCnA, 12, 2));
         A8361PrdUndCpA = T01RY6_A8361PrdUndCpA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8361PrdUndCpA", GXutil.ltrimstr( A8361PrdUndCpA, 10, 2));
      }
      else
      {
         nIsDirty_1157 = (short)(1) ;
         A8362PrdUndCnA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8362PrdUndCnA", GXutil.ltrimstr( A8362PrdUndCnA, 12, 2));
         nIsDirty_1157 = (short)(1) ;
         A8361PrdUndCpA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8361PrdUndCpA", GXutil.ltrimstr( A8361PrdUndCpA, 10, 2));
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1RY1157( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         String A719PrdNum ,
                         short A8366PrdAnyo ,
                         int A8360PrdProv )
   {
      /* Using cursor T01RY9 */
      pr_default.execute(5, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INSEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDPROV");
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
                         String A719PrdNum ,
                         short A8366PrdAnyo ,
                         int A8360PrdProv )
   {
      /* Using cursor T01RY11 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A8362PrdUndCnA = T01RY11_A8362PrdUndCnA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8362PrdUndCnA", GXutil.ltrimstr( A8362PrdUndCnA, 12, 2));
         A8361PrdUndCpA = T01RY11_A8361PrdUndCpA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8361PrdUndCpA", GXutil.ltrimstr( A8361PrdUndCpA, 10, 2));
      }
      else
      {
         A8362PrdUndCnA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8362PrdUndCnA", GXutil.ltrimstr( A8362PrdUndCnA, 12, 2));
         A8361PrdUndCpA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8361PrdUndCpA", GXutil.ltrimstr( A8361PrdUndCpA, 10, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8362PrdUndCnA, (byte)(12), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8361PrdUndCpA, (byte)(10), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1RY1157( )
   {
      /* Using cursor T01RY12 */
      pr_default.execute(7, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv), Byte.valueOf(A8363PrdMesL)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1157 = (short)(1) ;
      }
      else
      {
         RcdFound1157 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RY3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv), Byte.valueOf(A8363PrdMesL)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RY1157( 1) ;
         RcdFound1157 = (short)(1) ;
         A8363PrdMesL = T01RY3_A8363PrdMesL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8363PrdMesL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8363PrdMesL), 2, 0));
         A8364PrdUndCpM = T01RY3_A8364PrdUndCpM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8364PrdUndCpM", GXutil.ltrimstr( A8364PrdUndCpM, 10, 2));
         A8365PrdUndCnM = T01RY3_A8365PrdUndCnM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8365PrdUndCnM", GXutil.ltrimstr( A8365PrdUndCnM, 12, 2));
         A396EmprCod = T01RY3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01RY3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A8366PrdAnyo = T01RY3_A8366PrdAnyo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8366PrdAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8366PrdAnyo), 4, 0));
         A8360PrdProv = T01RY3_A8360PrdProv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8360PrdProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8360PrdProv), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z8366PrdAnyo = A8366PrdAnyo ;
         Z8360PrdProv = A8360PrdProv ;
         Z8363PrdMesL = A8363PrdMesL ;
         sMode1157 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1RY1157( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1157 = (short)(0) ;
            initializeNonKey1RY1157( ) ;
         }
         Gx_mode = sMode1157 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1157 = (short)(0) ;
         initializeNonKey1RY1157( ) ;
         sMode1157 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1157 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1RY1157( ) ;
      if ( RcdFound1157 == 0 )
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
      RcdFound1157 = (short)(0) ;
      /* Using cursor T01RY13 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, Short.valueOf(A8366PrdAnyo), Short.valueOf(A8366PrdAnyo), A719PrdNum, A396EmprCod, Integer.valueOf(A8360PrdProv), Integer.valueOf(A8360PrdProv), Short.valueOf(A8366PrdAnyo), A719PrdNum, A396EmprCod, Byte.valueOf(A8363PrdMesL)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01RY13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RY13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RY13_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01RY13_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RY13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RY13_A8366PrdAnyo[0] < A8366PrdAnyo ) || ( T01RY13_A8366PrdAnyo[0] == A8366PrdAnyo ) && ( GXutil.strcmp(T01RY13_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RY13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RY13_A8360PrdProv[0] < A8360PrdProv ) || ( T01RY13_A8360PrdProv[0] == A8360PrdProv ) && ( T01RY13_A8366PrdAnyo[0] == A8366PrdAnyo ) && ( GXutil.strcmp(T01RY13_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RY13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RY13_A8363PrdMesL[0] < A8363PrdMesL ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01RY13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RY13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RY13_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01RY13_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RY13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RY13_A8366PrdAnyo[0] > A8366PrdAnyo ) || ( T01RY13_A8366PrdAnyo[0] == A8366PrdAnyo ) && ( GXutil.strcmp(T01RY13_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RY13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RY13_A8360PrdProv[0] > A8360PrdProv ) || ( T01RY13_A8360PrdProv[0] == A8360PrdProv ) && ( T01RY13_A8366PrdAnyo[0] == A8366PrdAnyo ) && ( GXutil.strcmp(T01RY13_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RY13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RY13_A8363PrdMesL[0] > A8363PrdMesL ) ) )
         {
            A396EmprCod = T01RY13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T01RY13_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A8366PrdAnyo = T01RY13_A8366PrdAnyo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8366PrdAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8366PrdAnyo), 4, 0));
            A8360PrdProv = T01RY13_A8360PrdProv[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8360PrdProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8360PrdProv), 6, 0));
            A8363PrdMesL = T01RY13_A8363PrdMesL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8363PrdMesL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8363PrdMesL), 2, 0));
            RcdFound1157 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1157 = (short)(0) ;
      /* Using cursor T01RY14 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, Short.valueOf(A8366PrdAnyo), Short.valueOf(A8366PrdAnyo), A719PrdNum, A396EmprCod, Integer.valueOf(A8360PrdProv), Integer.valueOf(A8360PrdProv), Short.valueOf(A8366PrdAnyo), A719PrdNum, A396EmprCod, Byte.valueOf(A8363PrdMesL)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01RY14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RY14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RY14_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01RY14_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RY14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RY14_A8366PrdAnyo[0] > A8366PrdAnyo ) || ( T01RY14_A8366PrdAnyo[0] == A8366PrdAnyo ) && ( GXutil.strcmp(T01RY14_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RY14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RY14_A8360PrdProv[0] > A8360PrdProv ) || ( T01RY14_A8360PrdProv[0] == A8360PrdProv ) && ( T01RY14_A8366PrdAnyo[0] == A8366PrdAnyo ) && ( GXutil.strcmp(T01RY14_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RY14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RY14_A8363PrdMesL[0] > A8363PrdMesL ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01RY14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RY14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RY14_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01RY14_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RY14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RY14_A8366PrdAnyo[0] < A8366PrdAnyo ) || ( T01RY14_A8366PrdAnyo[0] == A8366PrdAnyo ) && ( GXutil.strcmp(T01RY14_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RY14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RY14_A8360PrdProv[0] < A8360PrdProv ) || ( T01RY14_A8360PrdProv[0] == A8360PrdProv ) && ( T01RY14_A8366PrdAnyo[0] == A8366PrdAnyo ) && ( GXutil.strcmp(T01RY14_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01RY14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RY14_A8363PrdMesL[0] < A8363PrdMesL ) ) )
         {
            A396EmprCod = T01RY14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T01RY14_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A8366PrdAnyo = T01RY14_A8366PrdAnyo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8366PrdAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8366PrdAnyo), 4, 0));
            A8360PrdProv = T01RY14_A8360PrdProv[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8360PrdProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8360PrdProv), 6, 0));
            A8363PrdMesL = T01RY14_A8363PrdMesL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8363PrdMesL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8363PrdMesL), 2, 0));
            RcdFound1157 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RY1157( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RY1157( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1157 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A8366PrdAnyo != Z8366PrdAnyo ) || ( A8360PrdProv != Z8360PrdProv ) || ( A8363PrdMesL != Z8363PrdMesL ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A8366PrdAnyo = Z8366PrdAnyo ;
               httpContext.ajax_rsp_assign_attri("", false, "A8366PrdAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8366PrdAnyo), 4, 0));
               A8360PrdProv = Z8360PrdProv ;
               httpContext.ajax_rsp_assign_attri("", false, "A8360PrdProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8360PrdProv), 6, 0));
               A8363PrdMesL = Z8363PrdMesL ;
               httpContext.ajax_rsp_assign_attri("", false, "A8363PrdMesL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8363PrdMesL), 2, 0));
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
               update1RY1157( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A8366PrdAnyo != Z8366PrdAnyo ) || ( A8360PrdProv != Z8360PrdProv ) || ( A8363PrdMesL != Z8363PrdMesL ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RY1157( ) ;
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
                  insert1RY1157( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A8366PrdAnyo != Z8366PrdAnyo ) || ( A8360PrdProv != Z8360PrdProv ) || ( A8363PrdMesL != Z8363PrdMesL ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A8366PrdAnyo = Z8366PrdAnyo ;
         httpContext.ajax_rsp_assign_attri("", false, "A8366PrdAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8366PrdAnyo), 4, 0));
         A8360PrdProv = Z8360PrdProv ;
         httpContext.ajax_rsp_assign_attri("", false, "A8360PrdProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8360PrdProv), 6, 0));
         A8363PrdMesL = Z8363PrdMesL ;
         httpContext.ajax_rsp_assign_attri("", false, "A8363PrdMesL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8363PrdMesL), 2, 0));
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
      if ( RcdFound1157 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdUndCpM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1RY1157( ) ;
      if ( RcdFound1157 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdUndCpM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RY1157( ) ;
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
      if ( RcdFound1157 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdUndCpM_Internalname ;
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
      if ( RcdFound1157 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdUndCpM_Internalname ;
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
      scanStart1RY1157( ) ;
      if ( RcdFound1157 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1157 != 0 )
         {
            scanNext1RY1157( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdUndCpM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RY1157( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1RY1157( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RY2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv), Byte.valueOf(A8363PrdMesL)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINSES1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z8364PrdUndCpM, T01RY2_A8364PrdUndCpM[0]) != 0 ) || ( DecimalUtil.compareTo(Z8365PrdUndCnM, T01RY2_A8365PrdUndCnM[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z8364PrdUndCpM, T01RY2_A8364PrdUndCpM[0]) != 0 )
            {
               GXutil.writeLogln("linses_trn:[seudo value changed for attri]"+"PrdUndCpM");
               GXutil.writeLogRaw("Old: ",Z8364PrdUndCpM);
               GXutil.writeLogRaw("Current: ",T01RY2_A8364PrdUndCpM[0]);
            }
            if ( DecimalUtil.compareTo(Z8365PrdUndCnM, T01RY2_A8365PrdUndCnM[0]) != 0 )
            {
               GXutil.writeLogln("linses_trn:[seudo value changed for attri]"+"PrdUndCnM");
               GXutil.writeLogRaw("Old: ",Z8365PrdUndCnM);
               GXutil.writeLogRaw("Current: ",T01RY2_A8365PrdUndCnM[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPINSES1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RY1157( )
   {
      beforeValidate1RY1157( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RY1157( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RY1157( 0) ;
         checkOptimisticConcurrency1RY1157( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RY1157( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RY1157( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RY15 */
                  pr_default.execute(10, new Object[] {Byte.valueOf(A8363PrdMesL), A8364PrdUndCpM, A8365PrdUndCnM, A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSES1");
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
                        resetCaption1RY0( ) ;
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
            load1RY1157( ) ;
         }
         endLevel1RY1157( ) ;
      }
      closeExtendedTableCursors1RY1157( ) ;
   }

   public void update1RY1157( )
   {
      beforeValidate1RY1157( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RY1157( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RY1157( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RY1157( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RY1157( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RY16 */
                  pr_default.execute(11, new Object[] {A8364PrdUndCpM, A8365PrdUndCnM, A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv), Byte.valueOf(A8363PrdMesL)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSES1");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINSES1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RY1157( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1RY0( ) ;
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
         endLevel1RY1157( ) ;
      }
      closeExtendedTableCursors1RY1157( ) ;
   }

   public void deferredUpdate1RY1157( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RY1157( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RY1157( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RY1157( ) ;
         afterConfirm1RY1157( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RY1157( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RY17 */
               pr_default.execute(12, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv), Byte.valueOf(A8363PrdMesL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSES1");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1157 == 0 )
                     {
                        initAll1RY1157( ) ;
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
                     resetCaption1RY0( ) ;
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
      sMode1157 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RY1157( ) ;
      Gx_mode = sMode1157 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RY1157( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01RY19 */
         pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            A8362PrdUndCnA = T01RY19_A8362PrdUndCnA[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8362PrdUndCnA", GXutil.ltrimstr( A8362PrdUndCnA, 12, 2));
            A8361PrdUndCpA = T01RY19_A8361PrdUndCpA[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8361PrdUndCpA", GXutil.ltrimstr( A8361PrdUndCpA, 10, 2));
         }
         else
         {
            A8362PrdUndCnA = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8362PrdUndCnA", GXutil.ltrimstr( A8362PrdUndCnA, 12, 2));
            A8361PrdUndCpA = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8361PrdUndCpA", GXutil.ltrimstr( A8361PrdUndCpA, 10, 2));
         }
         pr_default.close(13);
      }
   }

   public void endLevel1RY1157( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RY1157( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "linses_trn");
         if ( AnyError == 0 )
         {
            confirmValues1RY0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "linses_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RY1157( )
   {
      /* Using cursor T01RY20 */
      pr_default.execute(14);
      RcdFound1157 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1157 = (short)(1) ;
         A396EmprCod = T01RY20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01RY20_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A8366PrdAnyo = T01RY20_A8366PrdAnyo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8366PrdAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8366PrdAnyo), 4, 0));
         A8360PrdProv = T01RY20_A8360PrdProv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8360PrdProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8360PrdProv), 6, 0));
         A8363PrdMesL = T01RY20_A8363PrdMesL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8363PrdMesL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8363PrdMesL), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RY1157( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1157 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1157 = (short)(1) ;
         A396EmprCod = T01RY20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01RY20_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A8366PrdAnyo = T01RY20_A8366PrdAnyo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8366PrdAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8366PrdAnyo), 4, 0));
         A8360PrdProv = T01RY20_A8360PrdProv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8360PrdProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8360PrdProv), 6, 0));
         A8363PrdMesL = T01RY20_A8363PrdMesL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8363PrdMesL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8363PrdMesL), 2, 0));
      }
   }

   public void scanEnd1RY1157( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1RY1157( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RY1157( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RY1157( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RY1157( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RY1157( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RY1157( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RY1157( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdAnyo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdAnyo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAnyo_Enabled), 5, 0), true);
      edtPrdProv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdProv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdProv_Enabled), 5, 0), true);
      edtPrdUndCpA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUndCpA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUndCpA_Enabled), 5, 0), true);
      edtPrdUndCnA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUndCnA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUndCnA_Enabled), 5, 0), true);
      edtPrdMesL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdMesL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdMesL_Enabled), 5, 0), true);
      edtPrdUndCpM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUndCpM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUndCpM_Enabled), 5, 0), true);
      edtPrdUndCnM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUndCnM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUndCnM_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1RY1157( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1RY0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.linses_trn", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8366PrdAnyo", GXutil.ltrim( localUtil.ntoc( Z8366PrdAnyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8360PrdProv", GXutil.ltrim( localUtil.ntoc( Z8360PrdProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8363PrdMesL", GXutil.ltrim( localUtil.ntoc( Z8363PrdMesL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8364PrdUndCpM", GXutil.ltrim( localUtil.ntoc( Z8364PrdUndCpM, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8365PrdUndCnM", GXutil.ltrim( localUtil.ntoc( Z8365PrdUndCnM, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.linses_trn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "LINSES_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "LINSES_TRN", "") ;
   }

   public void initializeNonKey1RY1157( )
   {
      A8362PrdUndCnA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8362PrdUndCnA", GXutil.ltrimstr( A8362PrdUndCnA, 12, 2));
      A8361PrdUndCpA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8361PrdUndCpA", GXutil.ltrimstr( A8361PrdUndCpA, 10, 2));
      A8364PrdUndCpM = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8364PrdUndCpM", GXutil.ltrimstr( A8364PrdUndCpM, 10, 2));
      A8365PrdUndCnM = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8365PrdUndCnM", GXutil.ltrimstr( A8365PrdUndCnM, 12, 2));
      Z8364PrdUndCpM = DecimalUtil.ZERO ;
      Z8365PrdUndCnM = DecimalUtil.ZERO ;
   }

   public void initAll1RY1157( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A8366PrdAnyo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8366PrdAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8366PrdAnyo), 4, 0));
      A8360PrdProv = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8360PrdProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8360PrdProv), 6, 0));
      A8363PrdMesL = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8363PrdMesL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8363PrdMesL), 2, 0));
      initializeNonKey1RY1157( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016382193", true, true);
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
      httpContext.AddJavascriptSource("linses_trn.js", "?202661016382193", false, true);
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
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdAnyo_Internalname = "PRDANYO" ;
      edtPrdProv_Internalname = "PRDPROV" ;
      edtPrdUndCpA_Internalname = "PRDUNDCPA" ;
      edtPrdUndCnA_Internalname = "PRDUNDCNA" ;
      edtPrdMesL_Internalname = "PRDMESL" ;
      edtPrdUndCpM_Internalname = "PRDUNDCPM" ;
      edtPrdUndCnM_Internalname = "PRDUNDCNM" ;
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
      Form.setCaption( httpContext.getMessage( "LINSES_TRN", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPrdUndCnM_Jsonclick = "" ;
      edtPrdUndCnM_Enabled = 1 ;
      edtPrdUndCpM_Jsonclick = "" ;
      edtPrdUndCpM_Enabled = 1 ;
      edtPrdMesL_Jsonclick = "" ;
      edtPrdMesL_Enabled = 1 ;
      edtPrdUndCnA_Jsonclick = "" ;
      edtPrdUndCnA_Enabled = 0 ;
      edtPrdUndCpA_Jsonclick = "" ;
      edtPrdUndCpA_Enabled = 0 ;
      edtPrdProv_Jsonclick = "" ;
      edtPrdProv_Enabled = 1 ;
      edtPrdAnyo_Jsonclick = "" ;
      edtPrdAnyo_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
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
      /* Using cursor T01RY21 */
      pr_default.execute(15, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INSEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDPROV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      /* Using cursor T01RY19 */
      pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A8362PrdUndCnA = T01RY19_A8362PrdUndCnA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8362PrdUndCnA", GXutil.ltrimstr( A8362PrdUndCnA, 12, 2));
         A8361PrdUndCpA = T01RY19_A8361PrdUndCpA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8361PrdUndCpA", GXutil.ltrimstr( A8361PrdUndCpA, 10, 2));
      }
      else
      {
         A8362PrdUndCnA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8362PrdUndCnA", GXutil.ltrimstr( A8362PrdUndCnA, 12, 2));
         A8361PrdUndCpA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8361PrdUndCpA", GXutil.ltrimstr( A8361PrdUndCpA, 10, 2));
      }
      pr_default.close(13);
      GX_FocusControl = edtPrdUndCpM_Internalname ;
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

   public void valid_Prdprov( )
   {
      /* Using cursor T01RY21 */
      pr_default.execute(15, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INSEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDPROV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      /* Using cursor T01RY19 */
      pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A8362PrdUndCnA = T01RY19_A8362PrdUndCnA[0] ;
         A8361PrdUndCpA = T01RY19_A8361PrdUndCpA[0] ;
      }
      else
      {
         A8362PrdUndCnA = DecimalUtil.doubleToDec(0) ;
         A8361PrdUndCpA = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8362PrdUndCnA", GXutil.ltrim( localUtil.ntoc( A8362PrdUndCnA, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8361PrdUndCpA", GXutil.ltrim( localUtil.ntoc( A8361PrdUndCpA, (byte)(10), (byte)(2), ".", "")));
   }

   public void valid_Prdmesl( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8364PrdUndCpM", GXutil.ltrim( localUtil.ntoc( A8364PrdUndCpM, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8365PrdUndCnM", GXutil.ltrim( localUtil.ntoc( A8365PrdUndCnM, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8362PrdUndCnA", GXutil.ltrim( localUtil.ntoc( A8362PrdUndCnA, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8361PrdUndCpA", GXutil.ltrim( localUtil.ntoc( A8361PrdUndCpA, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8366PrdAnyo", GXutil.ltrim( localUtil.ntoc( Z8366PrdAnyo, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8360PrdProv", GXutil.ltrim( localUtil.ntoc( Z8360PrdProv, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8363PrdMesL", GXutil.ltrim( localUtil.ntoc( Z8363PrdMesL, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8364PrdUndCpM", GXutil.ltrim( localUtil.ntoc( Z8364PrdUndCpM, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8365PrdUndCnM", GXutil.ltrim( localUtil.ntoc( Z8365PrdUndCnM, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8362PrdUndCnA", GXutil.ltrim( localUtil.ntoc( Z8362PrdUndCnA, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8361PrdUndCpA", GXutil.ltrim( localUtil.ntoc( Z8361PrdUndCpA, (byte)(10), (byte)(2), ".", "")));
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
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDANYO","{handler:'valid_Prdanyo',iparms:[]");
      setEventMetadata("VALID_PRDANYO",",oparms:[]}");
      setEventMetadata("VALID_PRDPROV","{handler:'valid_Prdprov',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A8366PrdAnyo',fld:'PRDANYO',pic:'ZZZ9'},{av:'A8360PrdProv',fld:'PRDPROV',pic:'ZZZZZ9'},{av:'A8362PrdUndCnA',fld:'PRDUNDCNA',pic:'ZZZZZZZZ9.99'},{av:'A8361PrdUndCpA',fld:'PRDUNDCPA',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("VALID_PRDPROV",",oparms:[{av:'A8362PrdUndCnA',fld:'PRDUNDCNA',pic:'ZZZZZZZZ9.99'},{av:'A8361PrdUndCpA',fld:'PRDUNDCPA',pic:'ZZZZZZ9.99'}]}");
      setEventMetadata("VALID_PRDMESL","{handler:'valid_Prdmesl',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A8366PrdAnyo',fld:'PRDANYO',pic:'ZZZ9'},{av:'A8360PrdProv',fld:'PRDPROV',pic:'ZZZZZ9'},{av:'A8363PrdMesL',fld:'PRDMESL',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRDMESL",",oparms:[{av:'A8364PrdUndCpM',fld:'PRDUNDCPM',pic:'ZZZZZZ9.99'},{av:'A8365PrdUndCnM',fld:'PRDUNDCNM',pic:'ZZZZZZZZ9.99'},{av:'A8362PrdUndCnA',fld:'PRDUNDCNA',pic:'ZZZZZZZZ9.99'},{av:'A8361PrdUndCpA',fld:'PRDUNDCPA',pic:'ZZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z8366PrdAnyo'},{av:'Z8360PrdProv'},{av:'Z8363PrdMesL'},{av:'Z8364PrdUndCpM'},{av:'Z8365PrdUndCnM'},{av:'Z8362PrdUndCnA'},{av:'Z8361PrdUndCpA'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(15);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z8364PrdUndCpM = DecimalUtil.ZERO ;
      Z8365PrdUndCnM = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
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
      A8361PrdUndCpA = DecimalUtil.ZERO ;
      A8362PrdUndCnA = DecimalUtil.ZERO ;
      A8364PrdUndCpM = DecimalUtil.ZERO ;
      A8365PrdUndCnM = DecimalUtil.ZERO ;
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
      Z8362PrdUndCnA = DecimalUtil.ZERO ;
      Z8361PrdUndCpA = DecimalUtil.ZERO ;
      T01RY8_A8363PrdMesL = new byte[1] ;
      T01RY8_A8364PrdUndCpM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RY8_A8365PrdUndCnM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RY8_A396EmprCod = new String[] {""} ;
      T01RY8_A719PrdNum = new String[] {""} ;
      T01RY8_A8366PrdAnyo = new short[1] ;
      T01RY8_A8360PrdProv = new int[1] ;
      T01RY8_A8362PrdUndCnA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RY8_A8361PrdUndCpA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RY4_A396EmprCod = new String[] {""} ;
      T01RY6_A8362PrdUndCnA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RY6_A8361PrdUndCpA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RY9_A396EmprCod = new String[] {""} ;
      T01RY11_A8362PrdUndCnA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RY11_A8361PrdUndCpA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RY12_A396EmprCod = new String[] {""} ;
      T01RY12_A719PrdNum = new String[] {""} ;
      T01RY12_A8366PrdAnyo = new short[1] ;
      T01RY12_A8360PrdProv = new int[1] ;
      T01RY12_A8363PrdMesL = new byte[1] ;
      T01RY3_A8363PrdMesL = new byte[1] ;
      T01RY3_A8364PrdUndCpM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RY3_A8365PrdUndCnM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RY3_A396EmprCod = new String[] {""} ;
      T01RY3_A719PrdNum = new String[] {""} ;
      T01RY3_A8366PrdAnyo = new short[1] ;
      T01RY3_A8360PrdProv = new int[1] ;
      sMode1157 = "" ;
      T01RY13_A396EmprCod = new String[] {""} ;
      T01RY13_A719PrdNum = new String[] {""} ;
      T01RY13_A8366PrdAnyo = new short[1] ;
      T01RY13_A8360PrdProv = new int[1] ;
      T01RY13_A8363PrdMesL = new byte[1] ;
      T01RY14_A396EmprCod = new String[] {""} ;
      T01RY14_A719PrdNum = new String[] {""} ;
      T01RY14_A8366PrdAnyo = new short[1] ;
      T01RY14_A8360PrdProv = new int[1] ;
      T01RY14_A8363PrdMesL = new byte[1] ;
      T01RY2_A8363PrdMesL = new byte[1] ;
      T01RY2_A8364PrdUndCpM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RY2_A8365PrdUndCnM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RY2_A396EmprCod = new String[] {""} ;
      T01RY2_A719PrdNum = new String[] {""} ;
      T01RY2_A8366PrdAnyo = new short[1] ;
      T01RY2_A8360PrdProv = new int[1] ;
      T01RY19_A8362PrdUndCnA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RY19_A8361PrdUndCpA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RY20_A396EmprCod = new String[] {""} ;
      T01RY20_A719PrdNum = new String[] {""} ;
      T01RY20_A8366PrdAnyo = new short[1] ;
      T01RY20_A8360PrdProv = new int[1] ;
      T01RY20_A8363PrdMesL = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01RY21_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ8364PrdUndCpM = DecimalUtil.ZERO ;
      ZZ8365PrdUndCnM = DecimalUtil.ZERO ;
      ZZ8362PrdUndCnA = DecimalUtil.ZERO ;
      ZZ8361PrdUndCpA = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.linses_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.linses_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.linses_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.linses_trn__default(),
         new Object[] {
             new Object[] {
            T01RY2_A8363PrdMesL, T01RY2_A8364PrdUndCpM, T01RY2_A8365PrdUndCnM, T01RY2_A396EmprCod, T01RY2_A719PrdNum, T01RY2_A8366PrdAnyo, T01RY2_A8360PrdProv
            }
            , new Object[] {
            T01RY3_A8363PrdMesL, T01RY3_A8364PrdUndCpM, T01RY3_A8365PrdUndCnM, T01RY3_A396EmprCod, T01RY3_A719PrdNum, T01RY3_A8366PrdAnyo, T01RY3_A8360PrdProv
            }
            , new Object[] {
            T01RY4_A396EmprCod
            }
            , new Object[] {
            T01RY6_A8362PrdUndCnA, T01RY6_A8361PrdUndCpA
            }
            , new Object[] {
            T01RY8_A8363PrdMesL, T01RY8_A8364PrdUndCpM, T01RY8_A8365PrdUndCnM, T01RY8_A396EmprCod, T01RY8_A719PrdNum, T01RY8_A8366PrdAnyo, T01RY8_A8360PrdProv, T01RY8_A8362PrdUndCnA, T01RY8_A8361PrdUndCpA
            }
            , new Object[] {
            T01RY9_A396EmprCod
            }
            , new Object[] {
            T01RY11_A8362PrdUndCnA, T01RY11_A8361PrdUndCpA
            }
            , new Object[] {
            T01RY12_A396EmprCod, T01RY12_A719PrdNum, T01RY12_A8366PrdAnyo, T01RY12_A8360PrdProv, T01RY12_A8363PrdMesL
            }
            , new Object[] {
            T01RY13_A396EmprCod, T01RY13_A719PrdNum, T01RY13_A8366PrdAnyo, T01RY13_A8360PrdProv, T01RY13_A8363PrdMesL
            }
            , new Object[] {
            T01RY14_A396EmprCod, T01RY14_A719PrdNum, T01RY14_A8366PrdAnyo, T01RY14_A8360PrdProv, T01RY14_A8363PrdMesL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RY19_A8362PrdUndCnA, T01RY19_A8361PrdUndCpA
            }
            , new Object[] {
            T01RY20_A396EmprCod, T01RY20_A719PrdNum, T01RY20_A8366PrdAnyo, T01RY20_A8360PrdProv, T01RY20_A8363PrdMesL
            }
            , new Object[] {
            T01RY21_A396EmprCod
            }
         }
      );
   }

   private byte Z8363PrdMesL ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A8363PrdMesL ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ8363PrdMesL ;
   private short Z8366PrdAnyo ;
   private short A8366PrdAnyo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1157 ;
   private short nIsDirty_1157 ;
   private short ZZ8366PrdAnyo ;
   private int Z8360PrdProv ;
   private int A8360PrdProv ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdAnyo_Enabled ;
   private int edtPrdProv_Enabled ;
   private int edtPrdUndCpA_Enabled ;
   private int edtPrdUndCnA_Enabled ;
   private int edtPrdMesL_Enabled ;
   private int edtPrdUndCpM_Enabled ;
   private int edtPrdUndCnM_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ8360PrdProv ;
   private java.math.BigDecimal Z8364PrdUndCpM ;
   private java.math.BigDecimal Z8365PrdUndCnM ;
   private java.math.BigDecimal A8361PrdUndCpA ;
   private java.math.BigDecimal A8362PrdUndCnA ;
   private java.math.BigDecimal A8364PrdUndCpM ;
   private java.math.BigDecimal A8365PrdUndCnM ;
   private java.math.BigDecimal Z8362PrdUndCnA ;
   private java.math.BigDecimal Z8361PrdUndCpA ;
   private java.math.BigDecimal ZZ8364PrdUndCpM ;
   private java.math.BigDecimal ZZ8365PrdUndCnM ;
   private java.math.BigDecimal ZZ8362PrdUndCnA ;
   private java.math.BigDecimal ZZ8361PrdUndCpA ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
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
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdAnyo_Internalname ;
   private String edtPrdAnyo_Jsonclick ;
   private String edtPrdProv_Internalname ;
   private String edtPrdProv_Jsonclick ;
   private String edtPrdUndCpA_Internalname ;
   private String edtPrdUndCpA_Jsonclick ;
   private String edtPrdUndCnA_Internalname ;
   private String edtPrdUndCnA_Jsonclick ;
   private String edtPrdMesL_Internalname ;
   private String edtPrdMesL_Jsonclick ;
   private String edtPrdUndCpM_Internalname ;
   private String edtPrdUndCpM_Jsonclick ;
   private String edtPrdUndCnM_Internalname ;
   private String edtPrdUndCnM_Jsonclick ;
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
   private String sMode1157 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private IDataStoreProvider pr_default ;
   private byte[] T01RY8_A8363PrdMesL ;
   private java.math.BigDecimal[] T01RY8_A8364PrdUndCpM ;
   private java.math.BigDecimal[] T01RY8_A8365PrdUndCnM ;
   private String[] T01RY8_A396EmprCod ;
   private String[] T01RY8_A719PrdNum ;
   private short[] T01RY8_A8366PrdAnyo ;
   private int[] T01RY8_A8360PrdProv ;
   private java.math.BigDecimal[] T01RY8_A8362PrdUndCnA ;
   private java.math.BigDecimal[] T01RY8_A8361PrdUndCpA ;
   private String[] T01RY4_A396EmprCod ;
   private java.math.BigDecimal[] T01RY6_A8362PrdUndCnA ;
   private java.math.BigDecimal[] T01RY6_A8361PrdUndCpA ;
   private String[] T01RY9_A396EmprCod ;
   private java.math.BigDecimal[] T01RY11_A8362PrdUndCnA ;
   private java.math.BigDecimal[] T01RY11_A8361PrdUndCpA ;
   private String[] T01RY12_A396EmprCod ;
   private String[] T01RY12_A719PrdNum ;
   private short[] T01RY12_A8366PrdAnyo ;
   private int[] T01RY12_A8360PrdProv ;
   private byte[] T01RY12_A8363PrdMesL ;
   private byte[] T01RY3_A8363PrdMesL ;
   private java.math.BigDecimal[] T01RY3_A8364PrdUndCpM ;
   private java.math.BigDecimal[] T01RY3_A8365PrdUndCnM ;
   private String[] T01RY3_A396EmprCod ;
   private String[] T01RY3_A719PrdNum ;
   private short[] T01RY3_A8366PrdAnyo ;
   private int[] T01RY3_A8360PrdProv ;
   private String[] T01RY13_A396EmprCod ;
   private String[] T01RY13_A719PrdNum ;
   private short[] T01RY13_A8366PrdAnyo ;
   private int[] T01RY13_A8360PrdProv ;
   private byte[] T01RY13_A8363PrdMesL ;
   private String[] T01RY14_A396EmprCod ;
   private String[] T01RY14_A719PrdNum ;
   private short[] T01RY14_A8366PrdAnyo ;
   private int[] T01RY14_A8360PrdProv ;
   private byte[] T01RY14_A8363PrdMesL ;
   private byte[] T01RY2_A8363PrdMesL ;
   private java.math.BigDecimal[] T01RY2_A8364PrdUndCpM ;
   private java.math.BigDecimal[] T01RY2_A8365PrdUndCnM ;
   private String[] T01RY2_A396EmprCod ;
   private String[] T01RY2_A719PrdNum ;
   private short[] T01RY2_A8366PrdAnyo ;
   private int[] T01RY2_A8360PrdProv ;
   private java.math.BigDecimal[] T01RY19_A8362PrdUndCnA ;
   private java.math.BigDecimal[] T01RY19_A8361PrdUndCpA ;
   private String[] T01RY20_A396EmprCod ;
   private String[] T01RY20_A719PrdNum ;
   private short[] T01RY20_A8366PrdAnyo ;
   private int[] T01RY20_A8360PrdProv ;
   private byte[] T01RY20_A8363PrdMesL ;
   private String[] T01RY21_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class linses_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class linses_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class linses_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class linses_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RY2", "SELECT PrdMesL, PrdUndCpM, PrdUndCnM, EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSES1 WHERE EmprCod = ? AND PrdNum = ? AND PrdAnyo = ? AND PrdProv = ? AND PrdMesL = ?  FOR UPDATE OF PrdUndCpM, PrdUndCnM NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RY3", "SELECT PrdMesL, PrdUndCpM, PrdUndCnM, EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSES1 WHERE EmprCod = ? AND PrdNum = ? AND PrdAnyo = ? AND PrdProv = ? AND PrdMesL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RY4", "SELECT EmprCod FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ? AND PrdAnyo = ? AND PrdProv = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RY6", "SELECT COALESCE( T1.PrdUndCnA, 0) AS PrdUndCnA, COALESCE( T1.PrdUndCpA, 0) AS PrdUndCpA FROM (SELECT SUM(PrdUndCnM) AS PrdUndCnA, EmprCod, PrdNum, PrdAnyo, PrdProv, SUM(PrdUndCpM) AS PrdUndCpA FROM TXPINSES1 GROUP BY EmprCod, PrdNum, PrdAnyo, PrdProv ) T1 WHERE T1.EmprCod = ? AND T1.PrdNum = ? AND T1.PrdAnyo = ? AND T1.PrdProv = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RY8", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdMesL, TM1.PrdUndCpM, TM1.PrdUndCnM, TM1.EmprCod, TM1.PrdNum, TM1.PrdAnyo, TM1.PrdProv, COALESCE( T2.PrdUndCnA, 0) AS PrdUndCnA, COALESCE( T2.PrdUndCpA, 0) AS PrdUndCpA FROM (TXPINSES1 TM1 LEFT JOIN (SELECT SUM(TM1.PrdUndCnM) AS PrdUndCnA, TM1.EmprCod, TM1.PrdNum, TM1.PrdAnyo, TM1.PrdProv, SUM(TM1.PrdUndCpM) AS PrdUndCpA FROM TXPINSES1 TM1 GROUP BY TM1.EmprCod, TM1.PrdNum, TM1.PrdAnyo, TM1.PrdProv ) T2 ON T2.EmprCod = TM1.EmprCod AND T2.PrdNum = TM1.PrdNum AND T2.PrdAnyo = TM1.PrdAnyo AND T2.PrdProv = TM1.PrdProv) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.PrdAnyo = ? and TM1.PrdProv = ? and TM1.PrdMesL = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.PrdAnyo, TM1.PrdProv, TM1.PrdMesL ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RY9", "SELECT EmprCod FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ? AND PrdAnyo = ? AND PrdProv = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RY11", "SELECT COALESCE( T1.PrdUndCnA, 0) AS PrdUndCnA, COALESCE( T1.PrdUndCpA, 0) AS PrdUndCpA FROM (SELECT SUM(PrdUndCnM) AS PrdUndCnA, EmprCod, PrdNum, PrdAnyo, PrdProv, SUM(PrdUndCpM) AS PrdUndCpA FROM TXPINSES1 GROUP BY EmprCod, PrdNum, PrdAnyo, PrdProv ) T1 WHERE T1.EmprCod = ? AND T1.PrdNum = ? AND T1.PrdAnyo = ? AND T1.PrdProv = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RY12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, PrdAnyo, PrdProv, PrdMesL FROM TXPINSES1 WHERE EmprCod = ? AND PrdNum = ? AND PrdAnyo = ? AND PrdProv = ? AND PrdMesL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RY13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, PrdAnyo, PrdProv, PrdMesL FROM TXPINSES1 WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ? or PrdNum = ? and EmprCod = ? and PrdAnyo > ? or PrdAnyo = ? and PrdNum = ? and EmprCod = ? and PrdProv > ? or PrdProv = ? and PrdAnyo = ? and PrdNum = ? and EmprCod = ? and PrdMesL > ?) ORDER BY EmprCod, PrdNum, PrdAnyo, PrdProv, PrdMesL) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RY14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, PrdAnyo, PrdProv, PrdMesL FROM TXPINSES1 WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ? or PrdNum = ? and EmprCod = ? and PrdAnyo < ? or PrdAnyo = ? and PrdNum = ? and EmprCod = ? and PrdProv < ? or PrdProv = ? and PrdAnyo = ? and PrdNum = ? and EmprCod = ? and PrdMesL < ?) ORDER BY EmprCod DESC, PrdNum DESC, PrdAnyo DESC, PrdProv DESC, PrdMesL DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RY15", "INSERT INTO TXPINSES1(PrdMesL, PrdUndCpM, PrdUndCnM, EmprCod, PrdNum, PrdAnyo, PrdProv) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPINSES1")
         ,new UpdateCursor("T01RY16", "UPDATE TXPINSES1 SET PrdUndCpM=?, PrdUndCnM=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAnyo = ? AND PrdProv = ? AND PrdMesL = ?", GX_NOMASK, "TXPINSES1")
         ,new UpdateCursor("T01RY17", "DELETE FROM TXPINSES1  WHERE EmprCod = ? AND PrdNum = ? AND PrdAnyo = ? AND PrdProv = ? AND PrdMesL = ?", GX_NOMASK, "TXPINSES1")
         ,new ForEachCursor("T01RY19", "SELECT COALESCE( T1.PrdUndCnA, 0) AS PrdUndCnA, COALESCE( T1.PrdUndCpA, 0) AS PrdUndCpA FROM (SELECT SUM(PrdUndCnM) AS PrdUndCnA, EmprCod, PrdNum, PrdAnyo, PrdProv, SUM(PrdUndCpM) AS PrdUndCpA FROM TXPINSES1 GROUP BY EmprCod, PrdNum, PrdAnyo, PrdProv ) T1 WHERE T1.EmprCod = ? AND T1.PrdNum = ? AND T1.PrdAnyo = ? AND T1.PrdProv = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RY20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, PrdAnyo, PrdProv, PrdMesL FROM TXPINSES1 ORDER BY EmprCod, PrdNum, PrdAnyo, PrdProv, PrdMesL ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RY21", "SELECT EmprCod FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ? AND PrdAnyo = ? AND PrdProv = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 6);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 6);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               return;
            case 10 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

