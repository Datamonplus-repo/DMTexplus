package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lmacro_impl extends GXDataArea
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
         A1199MacCod = (int)(GXutil.lval( httpContext.GetPar( "MacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A1199MacCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "LMACRO", ""), (short)(0)) ;
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

   public lmacro_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lmacro_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lmacro_impl.class ));
   }

   public lmacro_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "LMACRO", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_LMACRO.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_LMACRO.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacCod_Internalname, httpContext.getMessage( "Nº Macro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1199MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1199MacCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1199MacCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacLin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1201MacLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1201MacLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1201MacLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacDisCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacDisCod_Internalname, httpContext.getMessage( "Nº Disp Int", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1202MacDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1202MacDisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1202MacDisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacDisCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacBarCod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1203MacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1203MacBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1203MacBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacBarReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacBarReo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A1204MacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1204MacBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A1204MacBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacBarReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacBarPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacBarPar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacBarPar_Internalname, GXutil.rtrim( A1205MacBarPar), GXutil.rtrim( localUtil.format( A1205MacBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacBarPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacKgs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacKgs_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A3366MacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacKgs_Enabled!=0) ? localUtil.format( A3366MacKgs, "ZZZZZ9.99") : localUtil.format( A3366MacKgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacKgs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacMts_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacMts_Internalname, httpContext.getMessage( "Metos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacMts_Internalname, GXutil.ltrim( localUtil.ntoc( A3367MacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacMts_Enabled!=0) ? localUtil.format( A3367MacMts, "ZZZZZ9.99") : localUtil.format( A3367MacMts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacMts_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacMts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacHdr_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacHdr_Internalname, GXutil.rtrim( A13714MacHdr), GXutil.rtrim( localUtil.format( A13714MacHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacHdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMacHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LMACRO.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LMACRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LMACRO.htm");
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
         Z1199MacCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z1199MacCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1201MacLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1201MacLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1202MacDisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z1202MacDisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1203MacBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z1203MacBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1204MacBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1204MacBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1205MacBarPar = httpContext.cgiGet( "Z1205MacBarPar") ;
         Z3366MacKgs = localUtil.ctond( httpContext.cgiGet( "Z3366MacKgs")) ;
         Z3367MacMts = localUtil.ctond( httpContext.cgiGet( "Z3367MacMts")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1199MacCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         }
         else
         {
            A1199MacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1201MacLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1201MacLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1201MacLin), 4, 0));
         }
         else
         {
            A1201MacLin = (short)(localUtil.ctol( httpContext.cgiGet( edtMacLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1201MacLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1201MacLin), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACDISCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacDisCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1202MacDisCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1202MacDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1202MacDisCod), 8, 0));
         }
         else
         {
            A1202MacDisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMacDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1202MacDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1202MacDisCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACBARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1203MacBarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1203MacBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1203MacBarCod), 8, 0));
         }
         else
         {
            A1203MacBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMacBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1203MacBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1203MacBarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACBARREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacBarReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1204MacBarReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1204MacBarReo", GXutil.str( A1204MacBarReo, 1, 0));
         }
         else
         {
            A1204MacBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtMacBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1204MacBarReo", GXutil.str( A1204MacBarReo, 1, 0));
         }
         A1205MacBarPar = httpContext.cgiGet( edtMacBarPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1205MacBarPar", A1205MacBarPar);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMacKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMacKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACKGS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacKgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3366MacKgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A3366MacKgs", GXutil.ltrimstr( A3366MacKgs, 9, 2));
         }
         else
         {
            A3366MacKgs = localUtil.ctond( httpContext.cgiGet( edtMacKgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3366MacKgs", GXutil.ltrimstr( A3366MacKgs, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMacMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMacMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACMTS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacMts_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3367MacMts = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A3367MacMts", GXutil.ltrimstr( A3367MacMts, 9, 2));
         }
         else
         {
            A3367MacMts = localUtil.ctond( httpContext.cgiGet( edtMacMts_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3367MacMts", GXutil.ltrimstr( A3367MacMts, 9, 2));
         }
         A13714MacHdr = httpContext.cgiGet( edtMacHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13714MacHdr", A13714MacHdr);
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
            A1199MacCod = (int)(GXutil.lval( httpContext.GetPar( "MacCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
            A1201MacLin = (short)(GXutil.lval( httpContext.GetPar( "MacLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1201MacLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1201MacLin), 4, 0));
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
            initAll1Q5168( ) ;
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
      disableAttributes1Q5168( ) ;
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

   public void resetCaption1Q50( )
   {
   }

   public void zm1Q5168( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1202MacDisCod = T01Q53_A1202MacDisCod[0] ;
            Z1203MacBarCod = T01Q53_A1203MacBarCod[0] ;
            Z1204MacBarReo = T01Q53_A1204MacBarReo[0] ;
            Z1205MacBarPar = T01Q53_A1205MacBarPar[0] ;
            Z3366MacKgs = T01Q53_A3366MacKgs[0] ;
            Z3367MacMts = T01Q53_A3367MacMts[0] ;
         }
         else
         {
            Z1202MacDisCod = A1202MacDisCod ;
            Z1203MacBarCod = A1203MacBarCod ;
            Z1204MacBarReo = A1204MacBarReo ;
            Z1205MacBarPar = A1205MacBarPar ;
            Z3366MacKgs = A3366MacKgs ;
            Z3367MacMts = A3367MacMts ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z1201MacLin = A1201MacLin ;
         Z1202MacDisCod = A1202MacDisCod ;
         Z1203MacBarCod = A1203MacBarCod ;
         Z1204MacBarReo = A1204MacBarReo ;
         Z1205MacBarPar = A1205MacBarPar ;
         Z3366MacKgs = A3366MacKgs ;
         Z3367MacMts = A3367MacMts ;
         Z396EmprCod = A396EmprCod ;
         Z1199MacCod = A1199MacCod ;
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

   public void load1Q5168( )
   {
      /* Using cursor T01Q55 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound168 = (short)(1) ;
         A1202MacDisCod = T01Q55_A1202MacDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1202MacDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1202MacDisCod), 8, 0));
         A1203MacBarCod = T01Q55_A1203MacBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1203MacBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1203MacBarCod), 8, 0));
         A1204MacBarReo = T01Q55_A1204MacBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1204MacBarReo", GXutil.str( A1204MacBarReo, 1, 0));
         A1205MacBarPar = T01Q55_A1205MacBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1205MacBarPar", A1205MacBarPar);
         A3366MacKgs = T01Q55_A3366MacKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3366MacKgs", GXutil.ltrimstr( A3366MacKgs, 9, 2));
         A3367MacMts = T01Q55_A3367MacMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3367MacMts", GXutil.ltrimstr( A3367MacMts, 9, 2));
         zm1Q5168( -2) ;
      }
      pr_default.close(3);
      onLoadActions1Q5168( ) ;
   }

   public void onLoadActions1Q5168( )
   {
      A13714MacHdr = GXutil.trim( GXutil.str( A1203MacBarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A1204MacBarReo, 1, 0)) + A1205MacBarPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13714MacHdr", A13714MacHdr);
   }

   public void checkExtendedTable1Q5168( )
   {
      nIsDirty_168 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01Q54 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMACRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MACCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      nIsDirty_168 = (short)(1) ;
      A13714MacHdr = GXutil.trim( GXutil.str( A1203MacBarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A1204MacBarReo, 1, 0)) + A1205MacBarPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13714MacHdr", A13714MacHdr);
   }

   public void closeExtendedTableCursors1Q5168( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A1199MacCod )
   {
      /* Using cursor T01Q56 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMACRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MACCOD");
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

   public void getKey1Q5168( )
   {
      /* Using cursor T01Q57 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound168 = (short)(1) ;
      }
      else
      {
         RcdFound168 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01Q53 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1Q5168( 2) ;
         RcdFound168 = (short)(1) ;
         A1201MacLin = T01Q53_A1201MacLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1201MacLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1201MacLin), 4, 0));
         A1202MacDisCod = T01Q53_A1202MacDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1202MacDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1202MacDisCod), 8, 0));
         A1203MacBarCod = T01Q53_A1203MacBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1203MacBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1203MacBarCod), 8, 0));
         A1204MacBarReo = T01Q53_A1204MacBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1204MacBarReo", GXutil.str( A1204MacBarReo, 1, 0));
         A1205MacBarPar = T01Q53_A1205MacBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1205MacBarPar", A1205MacBarPar);
         A3366MacKgs = T01Q53_A3366MacKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3366MacKgs", GXutil.ltrimstr( A3366MacKgs, 9, 2));
         A3367MacMts = T01Q53_A3367MacMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3367MacMts", GXutil.ltrimstr( A3367MacMts, 9, 2));
         A396EmprCod = T01Q53_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1199MacCod = T01Q53_A1199MacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z1199MacCod = A1199MacCod ;
         Z1201MacLin = A1201MacLin ;
         sMode168 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1Q5168( ) ;
         if ( AnyError == 1 )
         {
            RcdFound168 = (short)(0) ;
            initializeNonKey1Q5168( ) ;
         }
         Gx_mode = sMode168 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound168 = (short)(0) ;
         initializeNonKey1Q5168( ) ;
         sMode168 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode168 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1Q5168( ) ;
      if ( RcdFound168 == 0 )
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
      RcdFound168 = (short)(0) ;
      /* Using cursor T01Q58 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A1199MacCod), Integer.valueOf(A1199MacCod), A396EmprCod, Short.valueOf(A1201MacLin)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01Q58_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01Q58_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q58_A1199MacCod[0] < A1199MacCod ) || ( T01Q58_A1199MacCod[0] == A1199MacCod ) && ( GXutil.strcmp(T01Q58_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q58_A1201MacLin[0] < A1201MacLin ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01Q58_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01Q58_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q58_A1199MacCod[0] > A1199MacCod ) || ( T01Q58_A1199MacCod[0] == A1199MacCod ) && ( GXutil.strcmp(T01Q58_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q58_A1201MacLin[0] > A1201MacLin ) ) )
         {
            A396EmprCod = T01Q58_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1199MacCod = T01Q58_A1199MacCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
            A1201MacLin = T01Q58_A1201MacLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1201MacLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1201MacLin), 4, 0));
            RcdFound168 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound168 = (short)(0) ;
      /* Using cursor T01Q59 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A1199MacCod), Integer.valueOf(A1199MacCod), A396EmprCod, Short.valueOf(A1201MacLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01Q59_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01Q59_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q59_A1199MacCod[0] > A1199MacCod ) || ( T01Q59_A1199MacCod[0] == A1199MacCod ) && ( GXutil.strcmp(T01Q59_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q59_A1201MacLin[0] > A1201MacLin ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01Q59_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01Q59_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q59_A1199MacCod[0] < A1199MacCod ) || ( T01Q59_A1199MacCod[0] == A1199MacCod ) && ( GXutil.strcmp(T01Q59_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q59_A1201MacLin[0] < A1201MacLin ) ) )
         {
            A396EmprCod = T01Q59_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1199MacCod = T01Q59_A1199MacCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
            A1201MacLin = T01Q59_A1201MacLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1201MacLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1201MacLin), 4, 0));
            RcdFound168 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1Q5168( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1Q5168( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound168 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1199MacCod != Z1199MacCod ) || ( A1201MacLin != Z1201MacLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A1199MacCod = Z1199MacCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
               A1201MacLin = Z1201MacLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1201MacLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1201MacLin), 4, 0));
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
               update1Q5168( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1199MacCod != Z1199MacCod ) || ( A1201MacLin != Z1201MacLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1Q5168( ) ;
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
                  insert1Q5168( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1199MacCod != Z1199MacCod ) || ( A1201MacLin != Z1201MacLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1199MacCod = Z1199MacCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         A1201MacLin = Z1201MacLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1201MacLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1201MacLin), 4, 0));
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
      if ( RcdFound168 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMacDisCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1Q5168( ) ;
      if ( RcdFound168 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMacDisCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1Q5168( ) ;
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
      if ( RcdFound168 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMacDisCod_Internalname ;
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
      if ( RcdFound168 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMacDisCod_Internalname ;
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
      scanStart1Q5168( ) ;
      if ( RcdFound168 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound168 != 0 )
         {
            scanNext1Q5168( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMacDisCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1Q5168( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1Q5168( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01Q52 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMACRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z1202MacDisCod != T01Q52_A1202MacDisCod[0] ) || ( Z1203MacBarCod != T01Q52_A1203MacBarCod[0] ) || ( Z1204MacBarReo != T01Q52_A1204MacBarReo[0] ) || ( GXutil.strcmp(Z1205MacBarPar, T01Q52_A1205MacBarPar[0]) != 0 ) || ( DecimalUtil.compareTo(Z3366MacKgs, T01Q52_A3366MacKgs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3367MacMts, T01Q52_A3367MacMts[0]) != 0 ) )
         {
            if ( Z1202MacDisCod != T01Q52_A1202MacDisCod[0] )
            {
               GXutil.writeLogln("lmacro:[seudo value changed for attri]"+"MacDisCod");
               GXutil.writeLogRaw("Old: ",Z1202MacDisCod);
               GXutil.writeLogRaw("Current: ",T01Q52_A1202MacDisCod[0]);
            }
            if ( Z1203MacBarCod != T01Q52_A1203MacBarCod[0] )
            {
               GXutil.writeLogln("lmacro:[seudo value changed for attri]"+"MacBarCod");
               GXutil.writeLogRaw("Old: ",Z1203MacBarCod);
               GXutil.writeLogRaw("Current: ",T01Q52_A1203MacBarCod[0]);
            }
            if ( Z1204MacBarReo != T01Q52_A1204MacBarReo[0] )
            {
               GXutil.writeLogln("lmacro:[seudo value changed for attri]"+"MacBarReo");
               GXutil.writeLogRaw("Old: ",Z1204MacBarReo);
               GXutil.writeLogRaw("Current: ",T01Q52_A1204MacBarReo[0]);
            }
            if ( GXutil.strcmp(Z1205MacBarPar, T01Q52_A1205MacBarPar[0]) != 0 )
            {
               GXutil.writeLogln("lmacro:[seudo value changed for attri]"+"MacBarPar");
               GXutil.writeLogRaw("Old: ",Z1205MacBarPar);
               GXutil.writeLogRaw("Current: ",T01Q52_A1205MacBarPar[0]);
            }
            if ( DecimalUtil.compareTo(Z3366MacKgs, T01Q52_A3366MacKgs[0]) != 0 )
            {
               GXutil.writeLogln("lmacro:[seudo value changed for attri]"+"MacKgs");
               GXutil.writeLogRaw("Old: ",Z3366MacKgs);
               GXutil.writeLogRaw("Current: ",T01Q52_A3366MacKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z3367MacMts, T01Q52_A3367MacMts[0]) != 0 )
            {
               GXutil.writeLogln("lmacro:[seudo value changed for attri]"+"MacMts");
               GXutil.writeLogRaw("Old: ",Z3367MacMts);
               GXutil.writeLogRaw("Current: ",T01Q52_A3367MacMts[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMACRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1Q5168( )
   {
      beforeValidate1Q5168( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q5168( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1Q5168( 0) ;
         checkOptimisticConcurrency1Q5168( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q5168( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1Q5168( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01Q510 */
                  pr_default.execute(8, new Object[] {Short.valueOf(A1201MacLin), Integer.valueOf(A1202MacDisCod), Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar, A3366MacKgs, A3367MacMts, A396EmprCod, Integer.valueOf(A1199MacCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
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
                        resetCaption1Q50( ) ;
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
            load1Q5168( ) ;
         }
         endLevel1Q5168( ) ;
      }
      closeExtendedTableCursors1Q5168( ) ;
   }

   public void update1Q5168( )
   {
      beforeValidate1Q5168( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q5168( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q5168( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q5168( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1Q5168( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01Q511 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A1202MacDisCod), Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar, A3366MacKgs, A3367MacMts, A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMACRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1Q5168( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1Q50( ) ;
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
         endLevel1Q5168( ) ;
      }
      closeExtendedTableCursors1Q5168( ) ;
   }

   public void deferredUpdate1Q5168( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1Q5168( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q5168( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1Q5168( ) ;
         afterConfirm1Q5168( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1Q5168( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01Q512 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound168 == 0 )
                     {
                        initAll1Q5168( ) ;
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
                     resetCaption1Q50( ) ;
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
      sMode168 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1Q5168( ) ;
      Gx_mode = sMode168 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1Q5168( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13714MacHdr = GXutil.trim( GXutil.str( A1203MacBarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A1204MacBarReo, 1, 0)) + A1205MacBarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13714MacHdr", A13714MacHdr);
      }
   }

   public void endLevel1Q5168( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1Q5168( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "lmacro");
         if ( AnyError == 0 )
         {
            confirmValues1Q50( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "lmacro");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1Q5168( )
   {
      /* Using cursor T01Q513 */
      pr_default.execute(11);
      RcdFound168 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound168 = (short)(1) ;
         A396EmprCod = T01Q513_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1199MacCod = T01Q513_A1199MacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         A1201MacLin = T01Q513_A1201MacLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1201MacLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1201MacLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1Q5168( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound168 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound168 = (short)(1) ;
         A396EmprCod = T01Q513_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1199MacCod = T01Q513_A1199MacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         A1201MacLin = T01Q513_A1201MacLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1201MacLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1201MacLin), 4, 0));
      }
   }

   public void scanEnd1Q5168( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1Q5168( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1Q5168( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1Q5168( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1Q5168( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1Q5168( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1Q5168( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1Q5168( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMacCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacCod_Enabled), 5, 0), true);
      edtMacLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacLin_Enabled), 5, 0), true);
      edtMacDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacDisCod_Enabled), 5, 0), true);
      edtMacBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarCod_Enabled), 5, 0), true);
      edtMacBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarReo_Enabled), 5, 0), true);
      edtMacBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarPar_Enabled), 5, 0), true);
      edtMacKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacKgs_Enabled), 5, 0), true);
      edtMacMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacMts_Enabled), 5, 0), true);
      edtMacHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacHdr_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1Q5168( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1Q50( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.lmacro", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1199MacCod", GXutil.ltrim( localUtil.ntoc( Z1199MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1201MacLin", GXutil.ltrim( localUtil.ntoc( Z1201MacLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1202MacDisCod", GXutil.ltrim( localUtil.ntoc( Z1202MacDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1203MacBarCod", GXutil.ltrim( localUtil.ntoc( Z1203MacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1204MacBarReo", GXutil.ltrim( localUtil.ntoc( Z1204MacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1205MacBarPar", GXutil.rtrim( Z1205MacBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3366MacKgs", GXutil.ltrim( localUtil.ntoc( Z3366MacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3367MacMts", GXutil.ltrim( localUtil.ntoc( Z3367MacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.lmacro", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "LMACRO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "LMACRO", "") ;
   }

   public void initializeNonKey1Q5168( )
   {
      A13714MacHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13714MacHdr", A13714MacHdr);
      A1202MacDisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1202MacDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1202MacDisCod), 8, 0));
      A1203MacBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1203MacBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1203MacBarCod), 8, 0));
      A1204MacBarReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1204MacBarReo", GXutil.str( A1204MacBarReo, 1, 0));
      A1205MacBarPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1205MacBarPar", A1205MacBarPar);
      A3366MacKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3366MacKgs", GXutil.ltrimstr( A3366MacKgs, 9, 2));
      A3367MacMts = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3367MacMts", GXutil.ltrimstr( A3367MacMts, 9, 2));
      Z1202MacDisCod = 0 ;
      Z1203MacBarCod = 0 ;
      Z1204MacBarReo = (byte)(0) ;
      Z1205MacBarPar = "" ;
      Z3366MacKgs = DecimalUtil.ZERO ;
      Z3367MacMts = DecimalUtil.ZERO ;
   }

   public void initAll1Q5168( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A1199MacCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
      A1201MacLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1201MacLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1201MacLin), 4, 0));
      initializeNonKey1Q5168( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101637136", true, true);
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
      httpContext.AddJavascriptSource("lmacro.js", "?20266101637136", false, true);
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
      edtMacCod_Internalname = "MACCOD" ;
      edtMacLin_Internalname = "MACLIN" ;
      edtMacDisCod_Internalname = "MACDISCOD" ;
      edtMacBarCod_Internalname = "MACBARCOD" ;
      edtMacBarReo_Internalname = "MACBARREO" ;
      edtMacBarPar_Internalname = "MACBARPAR" ;
      edtMacKgs_Internalname = "MACKGS" ;
      edtMacMts_Internalname = "MACMTS" ;
      edtMacHdr_Internalname = "MACHDR" ;
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
      Form.setCaption( httpContext.getMessage( "LMACRO", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMacHdr_Jsonclick = "" ;
      edtMacHdr_Enabled = 0 ;
      edtMacMts_Jsonclick = "" ;
      edtMacMts_Enabled = 1 ;
      edtMacKgs_Jsonclick = "" ;
      edtMacKgs_Enabled = 1 ;
      edtMacBarPar_Jsonclick = "" ;
      edtMacBarPar_Enabled = 1 ;
      edtMacBarReo_Jsonclick = "" ;
      edtMacBarReo_Enabled = 1 ;
      edtMacBarCod_Jsonclick = "" ;
      edtMacBarCod_Enabled = 1 ;
      edtMacDisCod_Jsonclick = "" ;
      edtMacDisCod_Enabled = 1 ;
      edtMacLin_Jsonclick = "" ;
      edtMacLin_Enabled = 1 ;
      edtMacCod_Jsonclick = "" ;
      edtMacCod_Enabled = 1 ;
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
      /* Using cursor T01Q514 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMACRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MACCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(12);
      GX_FocusControl = edtMacDisCod_Internalname ;
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

   public void valid_Maccod( )
   {
      /* Using cursor T01Q514 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMACRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MACCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Maclin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1202MacDisCod", GXutil.ltrim( localUtil.ntoc( A1202MacDisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1203MacBarCod", GXutil.ltrim( localUtil.ntoc( A1203MacBarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1204MacBarReo", GXutil.ltrim( localUtil.ntoc( A1204MacBarReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1205MacBarPar", GXutil.rtrim( A1205MacBarPar));
      httpContext.ajax_rsp_assign_attri("", false, "A3366MacKgs", GXutil.ltrim( localUtil.ntoc( A3366MacKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3367MacMts", GXutil.ltrim( localUtil.ntoc( A3367MacMts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13714MacHdr", GXutil.rtrim( A13714MacHdr));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1199MacCod", GXutil.ltrim( localUtil.ntoc( Z1199MacCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1201MacLin", GXutil.ltrim( localUtil.ntoc( Z1201MacLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1202MacDisCod", GXutil.ltrim( localUtil.ntoc( Z1202MacDisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1203MacBarCod", GXutil.ltrim( localUtil.ntoc( Z1203MacBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1204MacBarReo", GXutil.ltrim( localUtil.ntoc( Z1204MacBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1205MacBarPar", GXutil.rtrim( Z1205MacBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3366MacKgs", GXutil.ltrim( localUtil.ntoc( Z3366MacKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3367MacMts", GXutil.ltrim( localUtil.ntoc( Z3367MacMts, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13714MacHdr", GXutil.rtrim( Z13714MacHdr));
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
      setEventMetadata("VALID_MACCOD","{handler:'valid_Maccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_MACCOD",",oparms:[]}");
      setEventMetadata("VALID_MACLIN","{handler:'valid_Maclin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'A1201MacLin',fld:'MACLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MACLIN",",oparms:[{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1203MacBarCod',fld:'MACBARCOD',pic:'ZZZZZZZ9'},{av:'A1204MacBarReo',fld:'MACBARREO',pic:'9'},{av:'A1205MacBarPar',fld:'MACBARPAR',pic:''},{av:'A3366MacKgs',fld:'MACKGS',pic:'ZZZZZ9.99'},{av:'A3367MacMts',fld:'MACMTS',pic:'ZZZZZ9.99'},{av:'A13714MacHdr',fld:'MACHDR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z1199MacCod'},{av:'Z1201MacLin'},{av:'Z1202MacDisCod'},{av:'Z1203MacBarCod'},{av:'Z1204MacBarReo'},{av:'Z1205MacBarPar'},{av:'Z3366MacKgs'},{av:'Z3367MacMts'},{av:'Z13714MacHdr'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_MACBARCOD","{handler:'valid_Macbarcod',iparms:[]");
      setEventMetadata("VALID_MACBARCOD",",oparms:[]}");
      setEventMetadata("VALID_MACBARREO","{handler:'valid_Macbarreo',iparms:[]");
      setEventMetadata("VALID_MACBARREO",",oparms:[]}");
      setEventMetadata("VALID_MACBARPAR","{handler:'valid_Macbarpar',iparms:[]");
      setEventMetadata("VALID_MACBARPAR",",oparms:[]}");
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
      Z1205MacBarPar = "" ;
      Z3366MacKgs = DecimalUtil.ZERO ;
      Z3367MacMts = DecimalUtil.ZERO ;
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
      A1205MacBarPar = "" ;
      A3366MacKgs = DecimalUtil.ZERO ;
      A3367MacMts = DecimalUtil.ZERO ;
      A13714MacHdr = "" ;
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
      T01Q55_A1201MacLin = new short[1] ;
      T01Q55_A1202MacDisCod = new int[1] ;
      T01Q55_A1203MacBarCod = new int[1] ;
      T01Q55_A1204MacBarReo = new byte[1] ;
      T01Q55_A1205MacBarPar = new String[] {""} ;
      T01Q55_A3366MacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q55_A3367MacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q55_A396EmprCod = new String[] {""} ;
      T01Q55_A1199MacCod = new int[1] ;
      T01Q54_A396EmprCod = new String[] {""} ;
      T01Q56_A396EmprCod = new String[] {""} ;
      T01Q57_A396EmprCod = new String[] {""} ;
      T01Q57_A1199MacCod = new int[1] ;
      T01Q57_A1201MacLin = new short[1] ;
      T01Q53_A1201MacLin = new short[1] ;
      T01Q53_A1202MacDisCod = new int[1] ;
      T01Q53_A1203MacBarCod = new int[1] ;
      T01Q53_A1204MacBarReo = new byte[1] ;
      T01Q53_A1205MacBarPar = new String[] {""} ;
      T01Q53_A3366MacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q53_A3367MacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q53_A396EmprCod = new String[] {""} ;
      T01Q53_A1199MacCod = new int[1] ;
      sMode168 = "" ;
      T01Q58_A396EmprCod = new String[] {""} ;
      T01Q58_A1199MacCod = new int[1] ;
      T01Q58_A1201MacLin = new short[1] ;
      T01Q59_A396EmprCod = new String[] {""} ;
      T01Q59_A1199MacCod = new int[1] ;
      T01Q59_A1201MacLin = new short[1] ;
      T01Q52_A1201MacLin = new short[1] ;
      T01Q52_A1202MacDisCod = new int[1] ;
      T01Q52_A1203MacBarCod = new int[1] ;
      T01Q52_A1204MacBarReo = new byte[1] ;
      T01Q52_A1205MacBarPar = new String[] {""} ;
      T01Q52_A3366MacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q52_A3367MacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q52_A396EmprCod = new String[] {""} ;
      T01Q52_A1199MacCod = new int[1] ;
      T01Q513_A396EmprCod = new String[] {""} ;
      T01Q513_A1199MacCod = new int[1] ;
      T01Q513_A1201MacLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01Q514_A396EmprCod = new String[] {""} ;
      Z13714MacHdr = "" ;
      ZZ396EmprCod = "" ;
      ZZ1205MacBarPar = "" ;
      ZZ3366MacKgs = DecimalUtil.ZERO ;
      ZZ3367MacMts = DecimalUtil.ZERO ;
      ZZ13714MacHdr = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.lmacro__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.lmacro__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.lmacro__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lmacro__default(),
         new Object[] {
             new Object[] {
            T01Q52_A1201MacLin, T01Q52_A1202MacDisCod, T01Q52_A1203MacBarCod, T01Q52_A1204MacBarReo, T01Q52_A1205MacBarPar, T01Q52_A3366MacKgs, T01Q52_A3367MacMts, T01Q52_A396EmprCod, T01Q52_A1199MacCod
            }
            , new Object[] {
            T01Q53_A1201MacLin, T01Q53_A1202MacDisCod, T01Q53_A1203MacBarCod, T01Q53_A1204MacBarReo, T01Q53_A1205MacBarPar, T01Q53_A3366MacKgs, T01Q53_A3367MacMts, T01Q53_A396EmprCod, T01Q53_A1199MacCod
            }
            , new Object[] {
            T01Q54_A396EmprCod
            }
            , new Object[] {
            T01Q55_A1201MacLin, T01Q55_A1202MacDisCod, T01Q55_A1203MacBarCod, T01Q55_A1204MacBarReo, T01Q55_A1205MacBarPar, T01Q55_A3366MacKgs, T01Q55_A3367MacMts, T01Q55_A396EmprCod, T01Q55_A1199MacCod
            }
            , new Object[] {
            T01Q56_A396EmprCod
            }
            , new Object[] {
            T01Q57_A396EmprCod, T01Q57_A1199MacCod, T01Q57_A1201MacLin
            }
            , new Object[] {
            T01Q58_A396EmprCod, T01Q58_A1199MacCod, T01Q58_A1201MacLin
            }
            , new Object[] {
            T01Q59_A396EmprCod, T01Q59_A1199MacCod, T01Q59_A1201MacLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01Q513_A396EmprCod, T01Q513_A1199MacCod, T01Q513_A1201MacLin
            }
            , new Object[] {
            T01Q514_A396EmprCod
            }
         }
      );
   }

   private byte Z1204MacBarReo ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A1204MacBarReo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ1204MacBarReo ;
   private short Z1201MacLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1201MacLin ;
   private short RcdFound168 ;
   private short nIsDirty_168 ;
   private short ZZ1201MacLin ;
   private int Z1199MacCod ;
   private int Z1202MacDisCod ;
   private int Z1203MacBarCod ;
   private int A1199MacCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMacCod_Enabled ;
   private int edtMacLin_Enabled ;
   private int A1202MacDisCod ;
   private int edtMacDisCod_Enabled ;
   private int A1203MacBarCod ;
   private int edtMacBarCod_Enabled ;
   private int edtMacBarReo_Enabled ;
   private int edtMacBarPar_Enabled ;
   private int edtMacKgs_Enabled ;
   private int edtMacMts_Enabled ;
   private int edtMacHdr_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ1199MacCod ;
   private int ZZ1202MacDisCod ;
   private int ZZ1203MacBarCod ;
   private java.math.BigDecimal Z3366MacKgs ;
   private java.math.BigDecimal Z3367MacMts ;
   private java.math.BigDecimal A3366MacKgs ;
   private java.math.BigDecimal A3367MacMts ;
   private java.math.BigDecimal ZZ3366MacKgs ;
   private java.math.BigDecimal ZZ3367MacMts ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z1205MacBarPar ;
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
   private String edtMacCod_Internalname ;
   private String edtMacCod_Jsonclick ;
   private String edtMacLin_Internalname ;
   private String edtMacLin_Jsonclick ;
   private String edtMacDisCod_Internalname ;
   private String edtMacDisCod_Jsonclick ;
   private String edtMacBarCod_Internalname ;
   private String edtMacBarCod_Jsonclick ;
   private String edtMacBarReo_Internalname ;
   private String edtMacBarReo_Jsonclick ;
   private String edtMacBarPar_Internalname ;
   private String A1205MacBarPar ;
   private String edtMacBarPar_Jsonclick ;
   private String edtMacKgs_Internalname ;
   private String edtMacKgs_Jsonclick ;
   private String edtMacMts_Internalname ;
   private String edtMacMts_Jsonclick ;
   private String edtMacHdr_Internalname ;
   private String A13714MacHdr ;
   private String edtMacHdr_Jsonclick ;
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
   private String sMode168 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z13714MacHdr ;
   private String ZZ396EmprCod ;
   private String ZZ1205MacBarPar ;
   private String ZZ13714MacHdr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private short[] T01Q55_A1201MacLin ;
   private int[] T01Q55_A1202MacDisCod ;
   private int[] T01Q55_A1203MacBarCod ;
   private byte[] T01Q55_A1204MacBarReo ;
   private String[] T01Q55_A1205MacBarPar ;
   private java.math.BigDecimal[] T01Q55_A3366MacKgs ;
   private java.math.BigDecimal[] T01Q55_A3367MacMts ;
   private String[] T01Q55_A396EmprCod ;
   private int[] T01Q55_A1199MacCod ;
   private String[] T01Q54_A396EmprCod ;
   private String[] T01Q56_A396EmprCod ;
   private String[] T01Q57_A396EmprCod ;
   private int[] T01Q57_A1199MacCod ;
   private short[] T01Q57_A1201MacLin ;
   private short[] T01Q53_A1201MacLin ;
   private int[] T01Q53_A1202MacDisCod ;
   private int[] T01Q53_A1203MacBarCod ;
   private byte[] T01Q53_A1204MacBarReo ;
   private String[] T01Q53_A1205MacBarPar ;
   private java.math.BigDecimal[] T01Q53_A3366MacKgs ;
   private java.math.BigDecimal[] T01Q53_A3367MacMts ;
   private String[] T01Q53_A396EmprCod ;
   private int[] T01Q53_A1199MacCod ;
   private String[] T01Q58_A396EmprCod ;
   private int[] T01Q58_A1199MacCod ;
   private short[] T01Q58_A1201MacLin ;
   private String[] T01Q59_A396EmprCod ;
   private int[] T01Q59_A1199MacCod ;
   private short[] T01Q59_A1201MacLin ;
   private short[] T01Q52_A1201MacLin ;
   private int[] T01Q52_A1202MacDisCod ;
   private int[] T01Q52_A1203MacBarCod ;
   private byte[] T01Q52_A1204MacBarReo ;
   private String[] T01Q52_A1205MacBarPar ;
   private java.math.BigDecimal[] T01Q52_A3366MacKgs ;
   private java.math.BigDecimal[] T01Q52_A3367MacMts ;
   private String[] T01Q52_A396EmprCod ;
   private int[] T01Q52_A1199MacCod ;
   private String[] T01Q513_A396EmprCod ;
   private int[] T01Q513_A1199MacCod ;
   private short[] T01Q513_A1201MacLin ;
   private String[] T01Q514_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class lmacro__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lmacro__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lmacro__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lmacro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01Q52", "SELECT MacLin, MacDisCod, MacBarCod, MacBarReo, MacBarPar, MacKgs, MacMts, EmprCod, MacCod FROM TXPLMACRO WHERE EmprCod = ? AND MacCod = ? AND MacLin = ?  FOR UPDATE OF MacDisCod, MacBarCod, MacBarReo, MacBarPar, MacKgs, MacMts NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q53", "SELECT MacLin, MacDisCod, MacBarCod, MacBarReo, MacBarPar, MacKgs, MacMts, EmprCod, MacCod FROM TXPLMACRO WHERE EmprCod = ? AND MacCod = ? AND MacLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q54", "SELECT EmprCod FROM TXPCMACRO WHERE EmprCod = ? AND MacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q55", "SELECT /*+ FIRST_ROWS(100) */ TM1.MacLin, TM1.MacDisCod, TM1.MacBarCod, TM1.MacBarReo, TM1.MacBarPar, TM1.MacKgs, TM1.MacMts, TM1.EmprCod, TM1.MacCod FROM TXPLMACRO TM1 WHERE TM1.EmprCod = ? and TM1.MacCod = ? and TM1.MacLin = ? ORDER BY TM1.EmprCod, TM1.MacCod, TM1.MacLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q56", "SELECT EmprCod FROM TXPCMACRO WHERE EmprCod = ? AND MacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q57", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? AND MacCod = ? AND MacLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q58", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacCod, MacLin FROM TXPLMACRO WHERE ( EmprCod > ? or EmprCod = ? and MacCod > ? or MacCod = ? and EmprCod = ? and MacLin > ?) ORDER BY EmprCod, MacCod, MacLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q59", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacCod, MacLin FROM TXPLMACRO WHERE ( EmprCod < ? or EmprCod = ? and MacCod < ? or MacCod = ? and EmprCod = ? and MacLin < ?) ORDER BY EmprCod DESC, MacCod DESC, MacLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01Q510", "INSERT INTO TXPLMACRO(MacLin, MacDisCod, MacBarCod, MacBarReo, MacBarPar, MacKgs, MacMts, EmprCod, MacCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLMACRO")
         ,new UpdateCursor("T01Q511", "UPDATE TXPLMACRO SET MacDisCod=?, MacBarCod=?, MacBarReo=?, MacBarPar=?, MacKgs=?, MacMts=?  WHERE EmprCod = ? AND MacCod = ? AND MacLin = ?", GX_NOMASK, "TXPLMACRO")
         ,new UpdateCursor("T01Q512", "DELETE FROM TXPLMACRO  WHERE EmprCod = ? AND MacCod = ? AND MacLin = ?", GX_NOMASK, "TXPLMACRO")
         ,new ForEachCursor("T01Q513", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MacCod, MacLin FROM TXPLMACRO ORDER BY EmprCod, MacCod, MacLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q514", "SELECT EmprCod FROM TXPCMACRO WHERE EmprCod = ? AND MacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

