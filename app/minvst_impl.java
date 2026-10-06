package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class minvst_impl extends GXDataArea
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
         A9398MISCod = (int)(GXutil.lval( httpContext.GetPar( "MISCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A9398MISCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9403MISRCod = (int)(GXutil.lval( httpContext.GetPar( "MISRCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9403MISRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9403MISRCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A9403MISRCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla MInv St (Inventarios de Stocks)", ""), (short)(0)) ;
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

   public minvst_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public minvst_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( minvst_impl.class ));
   }

   public minvst_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla MInv St (Inventarios de Stocks)", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_MInvSt.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_MInvSt.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMISCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMISCod_Internalname, httpContext.getMessage( "Inventario de Stock", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMISCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9398MISCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMISCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9398MISCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9398MISCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMISCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMISCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMISRCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMISRCod_Internalname, httpContext.getMessage( "Codigo de Repuesto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMISRCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9403MISRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMISRCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9403MISRCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9403MISRCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMISRCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMISRCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMISRNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMISRNom_Internalname, httpContext.getMessage( "Nombre del Repuesto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMISRNom_Internalname, GXutil.rtrim( A9404MISRNom), GXutil.rtrim( localUtil.format( A9404MISRNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMISRNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMISRNom_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMISRStkAct_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMISRStkAct_Internalname, httpContext.getMessage( "Stock Actual", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMISRStkAct_Internalname, GXutil.ltrim( localUtil.ntoc( A9405MISRStkAct, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMISRStkAct_Enabled!=0) ? localUtil.format( A9405MISRStkAct, "Z,ZZZ,ZZZ9.999") : localUtil.format( A9405MISRStkAct, "Z,ZZZ,ZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMISRStkAct_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMISRStkAct_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMISRStkTeo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMISRStkTeo_Internalname, httpContext.getMessage( "Stock Teorico", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMISRStkTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A9406MISRStkTeo, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMISRStkTeo_Enabled!=0) ? localUtil.format( A9406MISRStkTeo, "ZZZZZZZ9.999") : localUtil.format( A9406MISRStkTeo, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMISRStkTeo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMISRStkTeo_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMISRStkRea_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMISRStkRea_Internalname, httpContext.getMessage( "Stock Real", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMISRStkRea_Internalname, GXutil.ltrim( localUtil.ntoc( A9407MISRStkRea, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMISRStkRea_Enabled!=0) ? localUtil.format( A9407MISRStkRea, "ZZZZZ9.999") : localUtil.format( A9407MISRStkRea, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMISRStkRea_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMISRStkRea_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMISRStkDif_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMISRStkDif_Internalname, httpContext.getMessage( "Diferencia de Stock", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMISRStkDif_Internalname, GXutil.ltrim( localUtil.ntoc( A9408MISRStkDif, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMISRStkDif_Enabled!=0) ? localUtil.format( A9408MISRStkDif, "ZZZZZ9.999") : localUtil.format( A9408MISRStkDif, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMISRStkDif_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMISRStkDif_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MInvSt.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MInvSt.htm");
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
         Z9398MISCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9398MISCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9403MISRCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9403MISRCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9406MISRStkTeo = localUtil.ctond( httpContext.cgiGet( "Z9406MISRStkTeo")) ;
         Z9407MISRStkRea = localUtil.ctond( httpContext.cgiGet( "Z9407MISRStkRea")) ;
         Z9408MISRStkDif = localUtil.ctond( httpContext.cgiGet( "Z9408MISRStkDif")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMISCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMISCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MISCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMISCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9398MISCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
         }
         else
         {
            A9398MISCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMISCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMISRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMISRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MISRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMISRCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9403MISRCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A9403MISRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9403MISRCod), 8, 0));
         }
         else
         {
            A9403MISRCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMISRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9403MISRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9403MISRCod), 8, 0));
         }
         A9404MISRNom = httpContext.cgiGet( edtMISRNom_Internalname) ;
         n9404MISRNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9404MISRNom", A9404MISRNom);
         A9405MISRStkAct = localUtil.ctond( httpContext.cgiGet( edtMISRStkAct_Internalname)) ;
         n9405MISRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9405MISRStkAct", GXutil.ltrimstr( A9405MISRStkAct, 10, 3));
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMISRStkTeo_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMISRStkTeo_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MISRSTKTEO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMISRStkTeo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9406MISRStkTeo = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A9406MISRStkTeo", GXutil.ltrimstr( A9406MISRStkTeo, 12, 3));
         }
         else
         {
            A9406MISRStkTeo = localUtil.ctond( httpContext.cgiGet( edtMISRStkTeo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9406MISRStkTeo", GXutil.ltrimstr( A9406MISRStkTeo, 12, 3));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMISRStkRea_Internalname)), DecimalUtil.stringToDec("-99999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMISRStkRea_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MISRSTKREA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMISRStkRea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9407MISRStkRea = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A9407MISRStkRea", GXutil.ltrimstr( A9407MISRStkRea, 10, 3));
         }
         else
         {
            A9407MISRStkRea = localUtil.ctond( httpContext.cgiGet( edtMISRStkRea_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9407MISRStkRea", GXutil.ltrimstr( A9407MISRStkRea, 10, 3));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMISRStkDif_Internalname)), DecimalUtil.stringToDec("-99999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMISRStkDif_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MISRSTKDIF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMISRStkDif_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9408MISRStkDif = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A9408MISRStkDif", GXutil.ltrimstr( A9408MISRStkDif, 10, 3));
         }
         else
         {
            A9408MISRStkDif = localUtil.ctond( httpContext.cgiGet( edtMISRStkDif_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9408MISRStkDif", GXutil.ltrimstr( A9408MISRStkDif, 10, 3));
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
            A9398MISCod = (int)(GXutil.lval( httpContext.GetPar( "MISCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
            A9403MISRCod = (int)(GXutil.lval( httpContext.GetPar( "MISRCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9403MISRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9403MISRCod), 8, 0));
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
            initAll1QW1229( ) ;
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
      disableAttributes1QW1229( ) ;
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

   public void resetCaption1QW0( )
   {
   }

   public void zm1QW1229( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9406MISRStkTeo = T01QW3_A9406MISRStkTeo[0] ;
            Z9407MISRStkRea = T01QW3_A9407MISRStkRea[0] ;
            Z9408MISRStkDif = T01QW3_A9408MISRStkDif[0] ;
         }
         else
         {
            Z9406MISRStkTeo = A9406MISRStkTeo ;
            Z9407MISRStkRea = A9407MISRStkRea ;
            Z9408MISRStkDif = A9408MISRStkDif ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z9406MISRStkTeo = A9406MISRStkTeo ;
         Z9407MISRStkRea = A9407MISRStkRea ;
         Z9408MISRStkDif = A9408MISRStkDif ;
         Z396EmprCod = A396EmprCod ;
         Z9398MISCod = A9398MISCod ;
         Z9403MISRCod = A9403MISRCod ;
         Z9404MISRNom = A9404MISRNom ;
         Z9405MISRStkAct = A9405MISRStkAct ;
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

   public void load1QW1229( )
   {
      /* Using cursor T01QW6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1229 = (short)(1) ;
         A9404MISRNom = T01QW6_A9404MISRNom[0] ;
         n9404MISRNom = T01QW6_n9404MISRNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9404MISRNom", A9404MISRNom);
         A9405MISRStkAct = T01QW6_A9405MISRStkAct[0] ;
         n9405MISRStkAct = T01QW6_n9405MISRStkAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9405MISRStkAct", GXutil.ltrimstr( A9405MISRStkAct, 10, 3));
         A9406MISRStkTeo = T01QW6_A9406MISRStkTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9406MISRStkTeo", GXutil.ltrimstr( A9406MISRStkTeo, 12, 3));
         A9407MISRStkRea = T01QW6_A9407MISRStkRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9407MISRStkRea", GXutil.ltrimstr( A9407MISRStkRea, 10, 3));
         A9408MISRStkDif = T01QW6_A9408MISRStkDif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9408MISRStkDif", GXutil.ltrimstr( A9408MISRStkDif, 10, 3));
         zm1QW1229( -1) ;
      }
      pr_default.close(4);
      onLoadActions1QW1229( ) ;
   }

   public void onLoadActions1QW1229( )
   {
   }

   public void checkExtendedTable1QW1229( )
   {
      nIsDirty_1229 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QW4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Inventarios de Stock - MInvStk", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01QW5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MISRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MISRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9404MISRNom = T01QW5_A9404MISRNom[0] ;
      n9404MISRNom = T01QW5_n9404MISRNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9404MISRNom", A9404MISRNom);
      A9405MISRStkAct = T01QW5_A9405MISRStkAct[0] ;
      n9405MISRStkAct = T01QW5_n9405MISRStkAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9405MISRStkAct", GXutil.ltrimstr( A9405MISRStkAct, 10, 3));
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1QW1229( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         int A9398MISCod )
   {
      /* Using cursor T01QW7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Inventarios de Stock - MInvStk", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MISCOD");
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
                         int A9403MISRCod )
   {
      /* Using cursor T01QW8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MISRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MISRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9404MISRNom = T01QW8_A9404MISRNom[0] ;
      n9404MISRNom = T01QW8_n9404MISRNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9404MISRNom", A9404MISRNom);
      A9405MISRStkAct = T01QW8_A9405MISRStkAct[0] ;
      n9405MISRStkAct = T01QW8_n9405MISRStkAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9405MISRStkAct", GXutil.ltrimstr( A9405MISRStkAct, 10, 3));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9404MISRNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9405MISRStkAct, (byte)(10), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1QW1229( )
   {
      /* Using cursor T01QW9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1229 = (short)(1) ;
      }
      else
      {
         RcdFound1229 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QW3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QW1229( 1) ;
         RcdFound1229 = (short)(1) ;
         A9406MISRStkTeo = T01QW3_A9406MISRStkTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9406MISRStkTeo", GXutil.ltrimstr( A9406MISRStkTeo, 12, 3));
         A9407MISRStkRea = T01QW3_A9407MISRStkRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9407MISRStkRea", GXutil.ltrimstr( A9407MISRStkRea, 10, 3));
         A9408MISRStkDif = T01QW3_A9408MISRStkDif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9408MISRStkDif", GXutil.ltrimstr( A9408MISRStkDif, 10, 3));
         A396EmprCod = T01QW3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9398MISCod = T01QW3_A9398MISCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
         A9403MISRCod = T01QW3_A9403MISRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9403MISRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9403MISRCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z9398MISCod = A9398MISCod ;
         Z9403MISRCod = A9403MISRCod ;
         sMode1229 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1QW1229( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1229 = (short)(0) ;
            initializeNonKey1QW1229( ) ;
         }
         Gx_mode = sMode1229 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1229 = (short)(0) ;
         initializeNonKey1QW1229( ) ;
         sMode1229 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1229 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QW1229( ) ;
      if ( RcdFound1229 == 0 )
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
      RcdFound1229 = (short)(0) ;
      /* Using cursor T01QW10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9398MISCod), A396EmprCod, Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QW10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QW10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QW10_A9398MISCod[0] < A9398MISCod ) || ( T01QW10_A9398MISCod[0] == A9398MISCod ) && ( GXutil.strcmp(T01QW10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QW10_A9403MISRCod[0] < A9403MISRCod ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QW10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QW10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QW10_A9398MISCod[0] > A9398MISCod ) || ( T01QW10_A9398MISCod[0] == A9398MISCod ) && ( GXutil.strcmp(T01QW10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QW10_A9403MISRCod[0] > A9403MISRCod ) ) )
         {
            A396EmprCod = T01QW10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9398MISCod = T01QW10_A9398MISCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
            A9403MISRCod = T01QW10_A9403MISRCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9403MISRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9403MISRCod), 8, 0));
            RcdFound1229 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1229 = (short)(0) ;
      /* Using cursor T01QW11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9398MISCod), A396EmprCod, Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QW11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QW11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QW11_A9398MISCod[0] > A9398MISCod ) || ( T01QW11_A9398MISCod[0] == A9398MISCod ) && ( GXutil.strcmp(T01QW11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QW11_A9403MISRCod[0] > A9403MISRCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QW11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QW11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QW11_A9398MISCod[0] < A9398MISCod ) || ( T01QW11_A9398MISCod[0] == A9398MISCod ) && ( GXutil.strcmp(T01QW11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QW11_A9403MISRCod[0] < A9403MISRCod ) ) )
         {
            A396EmprCod = T01QW11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9398MISCod = T01QW11_A9398MISCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
            A9403MISRCod = T01QW11_A9403MISRCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9403MISRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9403MISRCod), 8, 0));
            RcdFound1229 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QW1229( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QW1229( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1229 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9398MISCod != Z9398MISCod ) || ( A9403MISRCod != Z9403MISRCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A9398MISCod = Z9398MISCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
               A9403MISRCod = Z9403MISRCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9403MISRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9403MISRCod), 8, 0));
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
               update1QW1229( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9398MISCod != Z9398MISCod ) || ( A9403MISRCod != Z9403MISRCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QW1229( ) ;
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
                  insert1QW1229( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9398MISCod != Z9398MISCod ) || ( A9403MISRCod != Z9403MISRCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9398MISCod = Z9398MISCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
         A9403MISRCod = Z9403MISRCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9403MISRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9403MISRCod), 8, 0));
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
      if ( RcdFound1229 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMISRStkTeo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1QW1229( ) ;
      if ( RcdFound1229 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMISRStkTeo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QW1229( ) ;
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
      if ( RcdFound1229 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMISRStkTeo_Internalname ;
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
      if ( RcdFound1229 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMISRStkTeo_Internalname ;
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
      scanStart1QW1229( ) ;
      if ( RcdFound1229 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1229 != 0 )
         {
            scanNext1QW1229( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMISRStkTeo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QW1229( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1QW1229( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QW2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9403MISRCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMInSRe"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9406MISRStkTeo, T01QW2_A9406MISRStkTeo[0]) != 0 ) || ( DecimalUtil.compareTo(Z9407MISRStkRea, T01QW2_A9407MISRStkRea[0]) != 0 ) || ( DecimalUtil.compareTo(Z9408MISRStkDif, T01QW2_A9408MISRStkDif[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9406MISRStkTeo, T01QW2_A9406MISRStkTeo[0]) != 0 )
            {
               GXutil.writeLogln("minvst:[seudo value changed for attri]"+"MISRStkTeo");
               GXutil.writeLogRaw("Old: ",Z9406MISRStkTeo);
               GXutil.writeLogRaw("Current: ",T01QW2_A9406MISRStkTeo[0]);
            }
            if ( DecimalUtil.compareTo(Z9407MISRStkRea, T01QW2_A9407MISRStkRea[0]) != 0 )
            {
               GXutil.writeLogln("minvst:[seudo value changed for attri]"+"MISRStkRea");
               GXutil.writeLogRaw("Old: ",Z9407MISRStkRea);
               GXutil.writeLogRaw("Current: ",T01QW2_A9407MISRStkRea[0]);
            }
            if ( DecimalUtil.compareTo(Z9408MISRStkDif, T01QW2_A9408MISRStkDif[0]) != 0 )
            {
               GXutil.writeLogln("minvst:[seudo value changed for attri]"+"MISRStkDif");
               GXutil.writeLogRaw("Old: ",Z9408MISRStkDif);
               GXutil.writeLogRaw("Current: ",T01QW2_A9408MISRStkDif[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMInSRe"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QW1229( )
   {
      beforeValidate1QW1229( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QW1229( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QW1229( 0) ;
         checkOptimisticConcurrency1QW1229( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QW1229( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QW1229( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QW12 */
                  pr_default.execute(10, new Object[] {A9406MISRStkTeo, A9407MISRStkRea, A9408MISRStkDif, A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9403MISRCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMInSRe");
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
                        resetCaption1QW0( ) ;
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
            load1QW1229( ) ;
         }
         endLevel1QW1229( ) ;
      }
      closeExtendedTableCursors1QW1229( ) ;
   }

   public void update1QW1229( )
   {
      beforeValidate1QW1229( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QW1229( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QW1229( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QW1229( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QW1229( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QW13 */
                  pr_default.execute(11, new Object[] {A9406MISRStkTeo, A9407MISRStkRea, A9408MISRStkDif, A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9403MISRCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMInSRe");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMInSRe"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QW1229( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1QW0( ) ;
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
         endLevel1QW1229( ) ;
      }
      closeExtendedTableCursors1QW1229( ) ;
   }

   public void deferredUpdate1QW1229( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QW1229( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QW1229( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QW1229( ) ;
         afterConfirm1QW1229( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QW1229( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QW14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9403MISRCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMInSRe");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1229 == 0 )
                     {
                        initAll1QW1229( ) ;
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
                     resetCaption1QW0( ) ;
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
      sMode1229 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QW1229( ) ;
      Gx_mode = sMode1229 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QW1229( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01QW15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9403MISRCod)});
         A9404MISRNom = T01QW15_A9404MISRNom[0] ;
         n9404MISRNom = T01QW15_n9404MISRNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9404MISRNom", A9404MISRNom);
         A9405MISRStkAct = T01QW15_A9405MISRStkAct[0] ;
         n9405MISRStkAct = T01QW15_n9405MISRStkAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9405MISRStkAct", GXutil.ltrimstr( A9405MISRStkAct, 10, 3));
         pr_default.close(13);
      }
   }

   public void endLevel1QW1229( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QW1229( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "minvst");
         if ( AnyError == 0 )
         {
            confirmValues1QW0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "minvst");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QW1229( )
   {
      /* Using cursor T01QW16 */
      pr_default.execute(14);
      RcdFound1229 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1229 = (short)(1) ;
         A396EmprCod = T01QW16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9398MISCod = T01QW16_A9398MISCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
         A9403MISRCod = T01QW16_A9403MISRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9403MISRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9403MISRCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QW1229( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1229 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1229 = (short)(1) ;
         A396EmprCod = T01QW16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9398MISCod = T01QW16_A9398MISCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
         A9403MISRCod = T01QW16_A9403MISRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9403MISRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9403MISRCod), 8, 0));
      }
   }

   public void scanEnd1QW1229( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1QW1229( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QW1229( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QW1229( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QW1229( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QW1229( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QW1229( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QW1229( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMISCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISCod_Enabled), 5, 0), true);
      edtMISRCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRCod_Enabled), 5, 0), true);
      edtMISRNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRNom_Enabled), 5, 0), true);
      edtMISRStkAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRStkAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkAct_Enabled), 5, 0), true);
      edtMISRStkTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRStkTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkTeo_Enabled), 5, 0), true);
      edtMISRStkRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRStkRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkRea_Enabled), 5, 0), true);
      edtMISRStkDif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRStkDif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkDif_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QW1229( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QW0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.minvst", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9398MISCod", GXutil.ltrim( localUtil.ntoc( Z9398MISCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9403MISRCod", GXutil.ltrim( localUtil.ntoc( Z9403MISRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9406MISRStkTeo", GXutil.ltrim( localUtil.ntoc( Z9406MISRStkTeo, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9407MISRStkRea", GXutil.ltrim( localUtil.ntoc( Z9407MISRStkRea, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9408MISRStkDif", GXutil.ltrim( localUtil.ntoc( Z9408MISRStkDif, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.minvst", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "MInvSt" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla MInv St (Inventarios de Stocks)", "") ;
   }

   public void initializeNonKey1QW1229( )
   {
      A9404MISRNom = "" ;
      n9404MISRNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9404MISRNom", A9404MISRNom);
      A9405MISRStkAct = DecimalUtil.ZERO ;
      n9405MISRStkAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9405MISRStkAct", GXutil.ltrimstr( A9405MISRStkAct, 10, 3));
      A9406MISRStkTeo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9406MISRStkTeo", GXutil.ltrimstr( A9406MISRStkTeo, 12, 3));
      A9407MISRStkRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9407MISRStkRea", GXutil.ltrimstr( A9407MISRStkRea, 10, 3));
      A9408MISRStkDif = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9408MISRStkDif", GXutil.ltrimstr( A9408MISRStkDif, 10, 3));
      Z9406MISRStkTeo = DecimalUtil.ZERO ;
      Z9407MISRStkRea = DecimalUtil.ZERO ;
      Z9408MISRStkDif = DecimalUtil.ZERO ;
   }

   public void initAll1QW1229( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9398MISCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
      A9403MISRCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9403MISRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9403MISRCod), 8, 0));
      initializeNonKey1QW1229( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101637545", true, true);
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
      httpContext.AddJavascriptSource("minvst.js", "?20266101637545", false, true);
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
      edtMISCod_Internalname = "MISCOD" ;
      edtMISRCod_Internalname = "MISRCOD" ;
      edtMISRNom_Internalname = "MISRNOM" ;
      edtMISRStkAct_Internalname = "MISRSTKACT" ;
      edtMISRStkTeo_Internalname = "MISRSTKTEO" ;
      edtMISRStkRea_Internalname = "MISRSTKREA" ;
      edtMISRStkDif_Internalname = "MISRSTKDIF" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla MInv St (Inventarios de Stocks)", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMISRStkDif_Jsonclick = "" ;
      edtMISRStkDif_Enabled = 1 ;
      edtMISRStkRea_Jsonclick = "" ;
      edtMISRStkRea_Enabled = 1 ;
      edtMISRStkTeo_Jsonclick = "" ;
      edtMISRStkTeo_Enabled = 1 ;
      edtMISRStkAct_Jsonclick = "" ;
      edtMISRStkAct_Enabled = 0 ;
      edtMISRNom_Jsonclick = "" ;
      edtMISRNom_Enabled = 0 ;
      edtMISRCod_Jsonclick = "" ;
      edtMISRCod_Enabled = 1 ;
      edtMISCod_Jsonclick = "" ;
      edtMISCod_Enabled = 1 ;
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
      /* Using cursor T01QW17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Inventarios de Stock - MInvStk", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      /* Using cursor T01QW15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MISRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MISRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9404MISRNom = T01QW15_A9404MISRNom[0] ;
      n9404MISRNom = T01QW15_n9404MISRNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9404MISRNom", A9404MISRNom);
      A9405MISRStkAct = T01QW15_A9405MISRStkAct[0] ;
      n9405MISRStkAct = T01QW15_n9405MISRStkAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9405MISRStkAct", GXutil.ltrimstr( A9405MISRStkAct, 10, 3));
      pr_default.close(13);
      GX_FocusControl = edtMISRStkTeo_Internalname ;
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

   public void valid_Miscod( )
   {
      /* Using cursor T01QW17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Inventarios de Stock - MInvStk", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Misrcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01QW15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MISRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MISRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A9404MISRNom = T01QW15_A9404MISRNom[0] ;
      n9404MISRNom = T01QW15_n9404MISRNom[0] ;
      A9405MISRStkAct = T01QW15_A9405MISRStkAct[0] ;
      n9405MISRStkAct = T01QW15_n9405MISRStkAct[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9406MISRStkTeo", GXutil.ltrim( localUtil.ntoc( A9406MISRStkTeo, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9407MISRStkRea", GXutil.ltrim( localUtil.ntoc( A9407MISRStkRea, (byte)(10), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9408MISRStkDif", GXutil.ltrim( localUtil.ntoc( A9408MISRStkDif, (byte)(10), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9404MISRNom", GXutil.rtrim( A9404MISRNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9405MISRStkAct", GXutil.ltrim( localUtil.ntoc( A9405MISRStkAct, (byte)(10), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9398MISCod", GXutil.ltrim( localUtil.ntoc( Z9398MISCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9403MISRCod", GXutil.ltrim( localUtil.ntoc( Z9403MISRCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9406MISRStkTeo", GXutil.ltrim( localUtil.ntoc( Z9406MISRStkTeo, (byte)(12), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9407MISRStkRea", GXutil.ltrim( localUtil.ntoc( Z9407MISRStkRea, (byte)(10), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9408MISRStkDif", GXutil.ltrim( localUtil.ntoc( Z9408MISRStkDif, (byte)(10), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9404MISRNom", GXutil.rtrim( Z9404MISRNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9405MISRStkAct", GXutil.ltrim( localUtil.ntoc( Z9405MISRStkAct, (byte)(10), (byte)(3), ".", "")));
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
      setEventMetadata("VALID_MISCOD","{handler:'valid_Miscod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9398MISCod',fld:'MISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_MISCOD",",oparms:[]}");
      setEventMetadata("VALID_MISRCOD","{handler:'valid_Misrcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9398MISCod',fld:'MISCOD',pic:'ZZZZZZZ9'},{av:'A9403MISRCod',fld:'MISRCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MISRCOD",",oparms:[{av:'A9406MISRStkTeo',fld:'MISRSTKTEO',pic:'ZZZZZZZ9.999'},{av:'A9407MISRStkRea',fld:'MISRSTKREA',pic:'ZZZZZ9.999'},{av:'A9408MISRStkDif',fld:'MISRSTKDIF',pic:'ZZZZZ9.999'},{av:'A9404MISRNom',fld:'MISRNOM',pic:''},{av:'A9405MISRStkAct',fld:'MISRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9398MISCod'},{av:'Z9403MISRCod'},{av:'Z9406MISRStkTeo'},{av:'Z9407MISRStkRea'},{av:'Z9408MISRStkDif'},{av:'Z9404MISRNom'},{av:'Z9405MISRStkAct'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      Z9406MISRStkTeo = DecimalUtil.ZERO ;
      Z9407MISRStkRea = DecimalUtil.ZERO ;
      Z9408MISRStkDif = DecimalUtil.ZERO ;
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
      A9404MISRNom = "" ;
      A9405MISRStkAct = DecimalUtil.ZERO ;
      A9406MISRStkTeo = DecimalUtil.ZERO ;
      A9407MISRStkRea = DecimalUtil.ZERO ;
      A9408MISRStkDif = DecimalUtil.ZERO ;
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
      Z9404MISRNom = "" ;
      Z9405MISRStkAct = DecimalUtil.ZERO ;
      T01QW6_A9404MISRNom = new String[] {""} ;
      T01QW6_n9404MISRNom = new boolean[] {false} ;
      T01QW6_A9405MISRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QW6_n9405MISRStkAct = new boolean[] {false} ;
      T01QW6_A9406MISRStkTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QW6_A9407MISRStkRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QW6_A9408MISRStkDif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QW6_A396EmprCod = new String[] {""} ;
      T01QW6_A9398MISCod = new int[1] ;
      T01QW6_A9403MISRCod = new int[1] ;
      T01QW4_A396EmprCod = new String[] {""} ;
      T01QW5_A9404MISRNom = new String[] {""} ;
      T01QW5_n9404MISRNom = new boolean[] {false} ;
      T01QW5_A9405MISRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QW5_n9405MISRStkAct = new boolean[] {false} ;
      T01QW7_A396EmprCod = new String[] {""} ;
      T01QW8_A9404MISRNom = new String[] {""} ;
      T01QW8_n9404MISRNom = new boolean[] {false} ;
      T01QW8_A9405MISRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QW8_n9405MISRStkAct = new boolean[] {false} ;
      T01QW9_A396EmprCod = new String[] {""} ;
      T01QW9_A9398MISCod = new int[1] ;
      T01QW9_A9403MISRCod = new int[1] ;
      T01QW3_A9406MISRStkTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QW3_A9407MISRStkRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QW3_A9408MISRStkDif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QW3_A396EmprCod = new String[] {""} ;
      T01QW3_A9398MISCod = new int[1] ;
      T01QW3_A9403MISRCod = new int[1] ;
      sMode1229 = "" ;
      T01QW10_A396EmprCod = new String[] {""} ;
      T01QW10_A9398MISCod = new int[1] ;
      T01QW10_A9403MISRCod = new int[1] ;
      T01QW11_A396EmprCod = new String[] {""} ;
      T01QW11_A9398MISCod = new int[1] ;
      T01QW11_A9403MISRCod = new int[1] ;
      T01QW2_A9406MISRStkTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QW2_A9407MISRStkRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QW2_A9408MISRStkDif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QW2_A396EmprCod = new String[] {""} ;
      T01QW2_A9398MISCod = new int[1] ;
      T01QW2_A9403MISRCod = new int[1] ;
      T01QW15_A9404MISRNom = new String[] {""} ;
      T01QW15_n9404MISRNom = new boolean[] {false} ;
      T01QW15_A9405MISRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QW15_n9405MISRStkAct = new boolean[] {false} ;
      T01QW16_A396EmprCod = new String[] {""} ;
      T01QW16_A9398MISCod = new int[1] ;
      T01QW16_A9403MISRCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01QW17_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ9406MISRStkTeo = DecimalUtil.ZERO ;
      ZZ9407MISRStkRea = DecimalUtil.ZERO ;
      ZZ9408MISRStkDif = DecimalUtil.ZERO ;
      ZZ9404MISRNom = "" ;
      ZZ9405MISRStkAct = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.minvst__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.minvst__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.minvst__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.minvst__default(),
         new Object[] {
             new Object[] {
            T01QW2_A9406MISRStkTeo, T01QW2_A9407MISRStkRea, T01QW2_A9408MISRStkDif, T01QW2_A396EmprCod, T01QW2_A9398MISCod, T01QW2_A9403MISRCod
            }
            , new Object[] {
            T01QW3_A9406MISRStkTeo, T01QW3_A9407MISRStkRea, T01QW3_A9408MISRStkDif, T01QW3_A396EmprCod, T01QW3_A9398MISCod, T01QW3_A9403MISRCod
            }
            , new Object[] {
            T01QW4_A396EmprCod
            }
            , new Object[] {
            T01QW5_A9404MISRNom, T01QW5_n9404MISRNom, T01QW5_A9405MISRStkAct, T01QW5_n9405MISRStkAct
            }
            , new Object[] {
            T01QW6_A9404MISRNom, T01QW6_n9404MISRNom, T01QW6_A9405MISRStkAct, T01QW6_n9405MISRStkAct, T01QW6_A9406MISRStkTeo, T01QW6_A9407MISRStkRea, T01QW6_A9408MISRStkDif, T01QW6_A396EmprCod, T01QW6_A9398MISCod, T01QW6_A9403MISRCod
            }
            , new Object[] {
            T01QW7_A396EmprCod
            }
            , new Object[] {
            T01QW8_A9404MISRNom, T01QW8_n9404MISRNom, T01QW8_A9405MISRStkAct, T01QW8_n9405MISRStkAct
            }
            , new Object[] {
            T01QW9_A396EmprCod, T01QW9_A9398MISCod, T01QW9_A9403MISRCod
            }
            , new Object[] {
            T01QW10_A396EmprCod, T01QW10_A9398MISCod, T01QW10_A9403MISRCod
            }
            , new Object[] {
            T01QW11_A396EmprCod, T01QW11_A9398MISCod, T01QW11_A9403MISRCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QW15_A9404MISRNom, T01QW15_n9404MISRNom, T01QW15_A9405MISRStkAct, T01QW15_n9405MISRStkAct
            }
            , new Object[] {
            T01QW16_A396EmprCod, T01QW16_A9398MISCod, T01QW16_A9403MISRCod
            }
            , new Object[] {
            T01QW17_A396EmprCod
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
   private short RcdFound1229 ;
   private short nIsDirty_1229 ;
   private int Z9398MISCod ;
   private int Z9403MISRCod ;
   private int A9398MISCod ;
   private int A9403MISRCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMISCod_Enabled ;
   private int edtMISRCod_Enabled ;
   private int edtMISRNom_Enabled ;
   private int edtMISRStkAct_Enabled ;
   private int edtMISRStkTeo_Enabled ;
   private int edtMISRStkRea_Enabled ;
   private int edtMISRStkDif_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ9398MISCod ;
   private int ZZ9403MISRCod ;
   private java.math.BigDecimal Z9406MISRStkTeo ;
   private java.math.BigDecimal Z9407MISRStkRea ;
   private java.math.BigDecimal Z9408MISRStkDif ;
   private java.math.BigDecimal A9405MISRStkAct ;
   private java.math.BigDecimal A9406MISRStkTeo ;
   private java.math.BigDecimal A9407MISRStkRea ;
   private java.math.BigDecimal A9408MISRStkDif ;
   private java.math.BigDecimal Z9405MISRStkAct ;
   private java.math.BigDecimal ZZ9406MISRStkTeo ;
   private java.math.BigDecimal ZZ9407MISRStkRea ;
   private java.math.BigDecimal ZZ9408MISRStkDif ;
   private java.math.BigDecimal ZZ9405MISRStkAct ;
   private String sPrefix ;
   private String Z396EmprCod ;
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
   private String edtMISCod_Internalname ;
   private String edtMISCod_Jsonclick ;
   private String edtMISRCod_Internalname ;
   private String edtMISRCod_Jsonclick ;
   private String edtMISRNom_Internalname ;
   private String A9404MISRNom ;
   private String edtMISRNom_Jsonclick ;
   private String edtMISRStkAct_Internalname ;
   private String edtMISRStkAct_Jsonclick ;
   private String edtMISRStkTeo_Internalname ;
   private String edtMISRStkTeo_Jsonclick ;
   private String edtMISRStkRea_Internalname ;
   private String edtMISRStkRea_Jsonclick ;
   private String edtMISRStkDif_Internalname ;
   private String edtMISRStkDif_Jsonclick ;
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
   private String Z9404MISRNom ;
   private String sMode1229 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ9404MISRNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n9404MISRNom ;
   private boolean n9405MISRStkAct ;
   private IDataStoreProvider pr_default ;
   private String[] T01QW6_A9404MISRNom ;
   private boolean[] T01QW6_n9404MISRNom ;
   private java.math.BigDecimal[] T01QW6_A9405MISRStkAct ;
   private boolean[] T01QW6_n9405MISRStkAct ;
   private java.math.BigDecimal[] T01QW6_A9406MISRStkTeo ;
   private java.math.BigDecimal[] T01QW6_A9407MISRStkRea ;
   private java.math.BigDecimal[] T01QW6_A9408MISRStkDif ;
   private String[] T01QW6_A396EmprCod ;
   private int[] T01QW6_A9398MISCod ;
   private int[] T01QW6_A9403MISRCod ;
   private String[] T01QW4_A396EmprCod ;
   private String[] T01QW5_A9404MISRNom ;
   private boolean[] T01QW5_n9404MISRNom ;
   private java.math.BigDecimal[] T01QW5_A9405MISRStkAct ;
   private boolean[] T01QW5_n9405MISRStkAct ;
   private String[] T01QW7_A396EmprCod ;
   private String[] T01QW8_A9404MISRNom ;
   private boolean[] T01QW8_n9404MISRNom ;
   private java.math.BigDecimal[] T01QW8_A9405MISRStkAct ;
   private boolean[] T01QW8_n9405MISRStkAct ;
   private String[] T01QW9_A396EmprCod ;
   private int[] T01QW9_A9398MISCod ;
   private int[] T01QW9_A9403MISRCod ;
   private java.math.BigDecimal[] T01QW3_A9406MISRStkTeo ;
   private java.math.BigDecimal[] T01QW3_A9407MISRStkRea ;
   private java.math.BigDecimal[] T01QW3_A9408MISRStkDif ;
   private String[] T01QW3_A396EmprCod ;
   private int[] T01QW3_A9398MISCod ;
   private int[] T01QW3_A9403MISRCod ;
   private String[] T01QW10_A396EmprCod ;
   private int[] T01QW10_A9398MISCod ;
   private int[] T01QW10_A9403MISRCod ;
   private String[] T01QW11_A396EmprCod ;
   private int[] T01QW11_A9398MISCod ;
   private int[] T01QW11_A9403MISRCod ;
   private java.math.BigDecimal[] T01QW2_A9406MISRStkTeo ;
   private java.math.BigDecimal[] T01QW2_A9407MISRStkRea ;
   private java.math.BigDecimal[] T01QW2_A9408MISRStkDif ;
   private String[] T01QW2_A396EmprCod ;
   private int[] T01QW2_A9398MISCod ;
   private int[] T01QW2_A9403MISRCod ;
   private String[] T01QW15_A9404MISRNom ;
   private boolean[] T01QW15_n9404MISRNom ;
   private java.math.BigDecimal[] T01QW15_A9405MISRStkAct ;
   private boolean[] T01QW15_n9405MISRStkAct ;
   private String[] T01QW16_A396EmprCod ;
   private int[] T01QW16_A9398MISCod ;
   private int[] T01QW16_A9403MISRCod ;
   private String[] T01QW17_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class minvst__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class minvst__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class minvst__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class minvst__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QW2", "SELECT MISRStkTeo, MISRStkRea, MISRStkDif, EmprCod, MISCod, MISRCod FROM TXPMInSRe WHERE EmprCod = ? AND MISCod = ? AND MISRCod = ?  FOR UPDATE OF MISRStkTeo, MISRStkRea, MISRStkDif NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QW3", "SELECT MISRStkTeo, MISRStkRea, MISRStkDif, EmprCod, MISCod, MISRCod FROM TXPMInSRe WHERE EmprCod = ? AND MISCod = ? AND MISRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QW4", "SELECT EmprCod FROM TXPMINVST WHERE EmprCod = ? AND MISCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QW5", "SELECT MRNom AS MISRNom, MRStkAct AS MISRStkAct FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QW6", "SELECT /*+ FIRST_ROWS(100) */ T2.MRNom AS MISRNom, T2.MRStkAct AS MISRStkAct, TM1.MISRStkTeo, TM1.MISRStkRea, TM1.MISRStkDif, TM1.EmprCod, TM1.MISCod, TM1.MISRCod AS MISRCod FROM (TXPMInSRe TM1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = TM1.EmprCod AND T2.MRCod = TM1.MISRCod) WHERE TM1.EmprCod = ? and TM1.MISCod = ? and TM1.MISRCod = ? ORDER BY TM1.EmprCod, TM1.MISCod, TM1.MISRCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QW7", "SELECT EmprCod FROM TXPMINVST WHERE EmprCod = ? AND MISCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QW8", "SELECT MRNom AS MISRNom, MRStkAct AS MISRStkAct FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QW9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MISCod, MISRCod FROM TXPMInSRe WHERE EmprCod = ? AND MISCod = ? AND MISRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QW10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MISCod, MISRCod FROM TXPMInSRe WHERE ( EmprCod > ? or EmprCod = ? and MISCod > ? or MISCod = ? and EmprCod = ? and MISRCod > ?) ORDER BY EmprCod, MISCod, MISRCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QW11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MISCod, MISRCod FROM TXPMInSRe WHERE ( EmprCod < ? or EmprCod = ? and MISCod < ? or MISCod = ? and EmprCod = ? and MISRCod < ?) ORDER BY EmprCod DESC, MISCod DESC, MISRCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QW12", "INSERT INTO TXPMInSRe(MISRStkTeo, MISRStkRea, MISRStkDif, EmprCod, MISCod, MISRCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMInSRe")
         ,new UpdateCursor("T01QW13", "UPDATE TXPMInSRe SET MISRStkTeo=?, MISRStkRea=?, MISRStkDif=?  WHERE EmprCod = ? AND MISCod = ? AND MISRCod = ?", GX_NOMASK, "TXPMInSRe")
         ,new UpdateCursor("T01QW14", "DELETE FROM TXPMInSRe  WHERE EmprCod = ? AND MISCod = ? AND MISRCod = ?", GX_NOMASK, "TXPMInSRe")
         ,new ForEachCursor("T01QW15", "SELECT MRNom AS MISRNom, MRStkAct AS MISRStkAct FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QW16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MISCod, MISRCod FROM TXPMInSRe ORDER BY EmprCod, MISCod, MISRCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QW17", "SELECT EmprCod FROM TXPMINVST WHERE EmprCod = ? AND MISCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 10 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 13 :
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

