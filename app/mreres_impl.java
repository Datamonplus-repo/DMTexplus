package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mreres_impl extends GXDataArea
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
         A9513MRResTpo = (int)(GXutil.lval( httpContext.GetPar( "MRResTpo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9513MRResTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9513MRResTpo), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A9513MRResTpo) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla MRERES (Reserva de Repuestos)", ""), (short)(0)) ;
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

   public mreres_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mreres_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mreres_impl.class ));
   }

   public mreres_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla MRERES (Reserva de Repuestos)", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_MRERES.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MRERES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MRERES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MRERES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MRERES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_MRERES.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MRERES.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MRERES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRRes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRRes_Internalname, httpContext.getMessage( "Reserva", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRRes_Internalname, GXutil.ltrim( localUtil.ntoc( A9510MRRes, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRRes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9510MRRes), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9510MRRes), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRRes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRRes_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MRERES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRResOrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRResOrd_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRResOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A9511MRResOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRResOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9511MRResOrd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9511MRResOrd), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRResOrd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRResOrd_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MRERES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRResFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRResFch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMRResFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRResFch_Internalname, localUtil.ttoc( A9512MRResFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9512MRResFch, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRResFch_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRResFch_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MRERES.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMRResFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMRResFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MRERES.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRResTpo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRResTpo_Internalname, httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRResTpo_Internalname, GXutil.ltrim( localUtil.ntoc( A9513MRResTpo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRResTpo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9513MRResTpo), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9513MRResTpo), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRResTpo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRResTpo_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MRERES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRResTpoD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRResTpoD_Internalname, httpContext.getMessage( "Desc Tipo Movimiento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRResTpoD_Internalname, GXutil.rtrim( A9514MRResTpoD), GXutil.rtrim( localUtil.format( A9514MRResTpoD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRResTpoD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRResTpoD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MRERES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRResDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRResDsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRResDsc_Internalname, GXutil.rtrim( A9515MRResDsc), GXutil.rtrim( localUtil.format( A9515MRResDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRResDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRResDsc_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MRERES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRResCnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRResCnt_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRResCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9516MRResCnt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRResCnt_Enabled!=0) ? localUtil.format( A9516MRResCnt, "ZZZ,ZZ9.999") : localUtil.format( A9516MRResCnt, "ZZZ,ZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRResCnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRResCnt_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MRERES.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MRERES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MRERES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MRERES.htm");
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
         Z9510MRRes = localUtil.ctol( httpContext.cgiGet( "Z9510MRRes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z9511MRResOrd = (int)(localUtil.ctol( httpContext.cgiGet( "Z9511MRResOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9512MRResFch = localUtil.ctot( httpContext.cgiGet( "Z9512MRResFch"), 0) ;
         Z9515MRResDsc = httpContext.cgiGet( "Z9515MRResDsc") ;
         Z9516MRResCnt = localUtil.ctond( httpContext.cgiGet( "Z9516MRResCnt")) ;
         Z9513MRResTpo = (int)(localUtil.ctol( httpContext.cgiGet( "Z9513MRResTpo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRRES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRRes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9510MRRes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A9510MRRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9510MRRes), 10, 0));
         }
         else
         {
            A9510MRRes = localUtil.ctol( httpContext.cgiGet( edtMRRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9510MRRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9510MRRes), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRResOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRResOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRRESORD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRResOrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9511MRResOrd = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A9511MRResOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9511MRResOrd), 8, 0));
         }
         else
         {
            A9511MRResOrd = (int)(localUtil.ctol( httpContext.cgiGet( edtMRResOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9511MRResOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9511MRResOrd), 8, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMRResFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MRRESFCH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRResFch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A9512MRResFch", localUtil.ttoc( A9512MRResFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A9512MRResFch = localUtil.ctot( httpContext.cgiGet( edtMRResFch_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9512MRResFch", localUtil.ttoc( A9512MRResFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRResTpo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRResTpo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRRESTPO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRResTpo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9513MRResTpo = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A9513MRResTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9513MRResTpo), 8, 0));
         }
         else
         {
            A9513MRResTpo = (int)(localUtil.ctol( httpContext.cgiGet( edtMRResTpo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9513MRResTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9513MRResTpo), 8, 0));
         }
         A9514MRResTpoD = httpContext.cgiGet( edtMRResTpoD_Internalname) ;
         n9514MRResTpoD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9514MRResTpoD", A9514MRResTpoD);
         A9515MRResDsc = httpContext.cgiGet( edtMRResDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9515MRResDsc", A9515MRResDsc);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRResCnt_Internalname)), DecimalUtil.stringToDec("-99999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRResCnt_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRRESCNT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRResCnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9516MRResCnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A9516MRResCnt", GXutil.ltrimstr( A9516MRResCnt, 10, 3));
         }
         else
         {
            A9516MRResCnt = localUtil.ctond( httpContext.cgiGet( edtMRResCnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9516MRResCnt", GXutil.ltrimstr( A9516MRResCnt, 10, 3));
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
            A9510MRRes = GXutil.lval( httpContext.GetPar( "MRRes")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9510MRRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9510MRRes), 10, 0));
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
            initAll1QU1240( ) ;
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
      disableAttributes1QU1240( ) ;
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

   public void resetCaption1QU0( )
   {
   }

   public void zm1QU1240( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9511MRResOrd = T01QU3_A9511MRResOrd[0] ;
            Z9512MRResFch = T01QU3_A9512MRResFch[0] ;
            Z9515MRResDsc = T01QU3_A9515MRResDsc[0] ;
            Z9516MRResCnt = T01QU3_A9516MRResCnt[0] ;
            Z9513MRResTpo = T01QU3_A9513MRResTpo[0] ;
         }
         else
         {
            Z9511MRResOrd = A9511MRResOrd ;
            Z9512MRResFch = A9512MRResFch ;
            Z9515MRResDsc = A9515MRResDsc ;
            Z9516MRResCnt = A9516MRResCnt ;
            Z9513MRResTpo = A9513MRResTpo ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z9510MRRes = A9510MRRes ;
         Z9511MRResOrd = A9511MRResOrd ;
         Z9512MRResFch = A9512MRResFch ;
         Z9515MRResDsc = A9515MRResDsc ;
         Z9516MRResCnt = A9516MRResCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9492MRCod = A9492MRCod ;
         Z9513MRResTpo = A9513MRResTpo ;
         Z9514MRResTpoD = A9514MRResTpoD ;
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

   public void load1QU1240( )
   {
      /* Using cursor T01QU6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1240 = (short)(1) ;
         A9511MRResOrd = T01QU6_A9511MRResOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9511MRResOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9511MRResOrd), 8, 0));
         A9512MRResFch = T01QU6_A9512MRResFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9512MRResFch", localUtil.ttoc( A9512MRResFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9514MRResTpoD = T01QU6_A9514MRResTpoD[0] ;
         n9514MRResTpoD = T01QU6_n9514MRResTpoD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9514MRResTpoD", A9514MRResTpoD);
         A9515MRResDsc = T01QU6_A9515MRResDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9515MRResDsc", A9515MRResDsc);
         A9516MRResCnt = T01QU6_A9516MRResCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9516MRResCnt", GXutil.ltrimstr( A9516MRResCnt, 10, 3));
         A9513MRResTpo = T01QU6_A9513MRResTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9513MRResTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9513MRResTpo), 8, 0));
         zm1QU1240( -1) ;
      }
      pr_default.close(4);
      onLoadActions1QU1240( ) ;
   }

   public void onLoadActions1QU1240( )
   {
   }

   public void checkExtendedTable1QU1240( )
   {
      nIsDirty_1240 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QU5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9513MRResTpo)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRResTpo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRRESTPO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9514MRResTpoD = T01QU5_A9514MRResTpoD[0] ;
      n9514MRResTpoD = T01QU5_n9514MRResTpoD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9514MRResTpoD", A9514MRResTpoD);
      pr_default.close(3);
      /* Using cursor T01QU4 */
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

   public void closeExtendedTableCursors1QU1240( )
   {
      pr_default.close(3);
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A9513MRResTpo )
   {
      /* Using cursor T01QU7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9513MRResTpo)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRResTpo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRRESTPO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9514MRResTpoD = T01QU7_A9514MRResTpoD[0] ;
      n9514MRResTpoD = T01QU7_n9514MRResTpoD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9514MRResTpoD", A9514MRResTpoD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9514MRResTpoD))+"\"") ;
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
      /* Using cursor T01QU8 */
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

   public void getKey1QU1240( )
   {
      /* Using cursor T01QU9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1240 = (short)(1) ;
      }
      else
      {
         RcdFound1240 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QU1240( 1) ;
         RcdFound1240 = (short)(1) ;
         A9510MRRes = T01QU3_A9510MRRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9510MRRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9510MRRes), 10, 0));
         A9511MRResOrd = T01QU3_A9511MRResOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9511MRResOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9511MRResOrd), 8, 0));
         A9512MRResFch = T01QU3_A9512MRResFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9512MRResFch", localUtil.ttoc( A9512MRResFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9515MRResDsc = T01QU3_A9515MRResDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9515MRResDsc", A9515MRResDsc);
         A9516MRResCnt = T01QU3_A9516MRResCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9516MRResCnt", GXutil.ltrimstr( A9516MRResCnt, 10, 3));
         A396EmprCod = T01QU3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = T01QU3_A9492MRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         A9513MRResTpo = T01QU3_A9513MRResTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9513MRResTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9513MRResTpo), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z9492MRCod = A9492MRCod ;
         Z9510MRRes = A9510MRRes ;
         sMode1240 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1QU1240( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1240 = (short)(0) ;
            initializeNonKey1QU1240( ) ;
         }
         Gx_mode = sMode1240 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1240 = (short)(0) ;
         initializeNonKey1QU1240( ) ;
         sMode1240 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1240 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QU1240( ) ;
      if ( RcdFound1240 == 0 )
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
      RcdFound1240 = (short)(0) ;
      /* Using cursor T01QU10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A9492MRCod), A396EmprCod, Long.valueOf(A9510MRRes)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QU10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QU10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QU10_A9492MRCod[0] < A9492MRCod ) || ( T01QU10_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(T01QU10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QU10_A9510MRRes[0] < A9510MRRes ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QU10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QU10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QU10_A9492MRCod[0] > A9492MRCod ) || ( T01QU10_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(T01QU10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QU10_A9510MRRes[0] > A9510MRRes ) ) )
         {
            A396EmprCod = T01QU10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9492MRCod = T01QU10_A9492MRCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
            A9510MRRes = T01QU10_A9510MRRes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9510MRRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9510MRRes), 10, 0));
            RcdFound1240 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1240 = (short)(0) ;
      /* Using cursor T01QU11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A9492MRCod), A396EmprCod, Long.valueOf(A9510MRRes)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QU11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QU11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QU11_A9492MRCod[0] > A9492MRCod ) || ( T01QU11_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(T01QU11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QU11_A9510MRRes[0] > A9510MRRes ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QU11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QU11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QU11_A9492MRCod[0] < A9492MRCod ) || ( T01QU11_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(T01QU11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QU11_A9510MRRes[0] < A9510MRRes ) ) )
         {
            A396EmprCod = T01QU11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9492MRCod = T01QU11_A9492MRCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
            A9510MRRes = T01QU11_A9510MRRes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9510MRRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9510MRRes), 10, 0));
            RcdFound1240 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QU1240( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QU1240( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1240 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9492MRCod != Z9492MRCod ) || ( A9510MRRes != Z9510MRRes ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A9492MRCod = Z9492MRCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
               A9510MRRes = Z9510MRRes ;
               httpContext.ajax_rsp_assign_attri("", false, "A9510MRRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9510MRRes), 10, 0));
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
               update1QU1240( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9492MRCod != Z9492MRCod ) || ( A9510MRRes != Z9510MRRes ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QU1240( ) ;
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
                  insert1QU1240( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9492MRCod != Z9492MRCod ) || ( A9510MRRes != Z9510MRRes ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = Z9492MRCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         A9510MRRes = Z9510MRRes ;
         httpContext.ajax_rsp_assign_attri("", false, "A9510MRRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9510MRRes), 10, 0));
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
      if ( RcdFound1240 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMRResOrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1QU1240( ) ;
      if ( RcdFound1240 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMRResOrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QU1240( ) ;
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
      if ( RcdFound1240 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMRResOrd_Internalname ;
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
      if ( RcdFound1240 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMRResOrd_Internalname ;
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
      scanStart1QU1240( ) ;
      if ( RcdFound1240 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1240 != 0 )
         {
            scanNext1QU1240( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMRResOrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QU1240( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1QU1240( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMReRes"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z9511MRResOrd != T01QU2_A9511MRResOrd[0] ) || !( GXutil.dateCompare(Z9512MRResFch, T01QU2_A9512MRResFch[0]) ) || ( GXutil.strcmp(Z9515MRResDsc, T01QU2_A9515MRResDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z9516MRResCnt, T01QU2_A9516MRResCnt[0]) != 0 ) || ( Z9513MRResTpo != T01QU2_A9513MRResTpo[0] ) )
         {
            if ( Z9511MRResOrd != T01QU2_A9511MRResOrd[0] )
            {
               GXutil.writeLogln("mreres:[seudo value changed for attri]"+"MRResOrd");
               GXutil.writeLogRaw("Old: ",Z9511MRResOrd);
               GXutil.writeLogRaw("Current: ",T01QU2_A9511MRResOrd[0]);
            }
            if ( !( GXutil.dateCompare(Z9512MRResFch, T01QU2_A9512MRResFch[0]) ) )
            {
               GXutil.writeLogln("mreres:[seudo value changed for attri]"+"MRResFch");
               GXutil.writeLogRaw("Old: ",Z9512MRResFch);
               GXutil.writeLogRaw("Current: ",T01QU2_A9512MRResFch[0]);
            }
            if ( GXutil.strcmp(Z9515MRResDsc, T01QU2_A9515MRResDsc[0]) != 0 )
            {
               GXutil.writeLogln("mreres:[seudo value changed for attri]"+"MRResDsc");
               GXutil.writeLogRaw("Old: ",Z9515MRResDsc);
               GXutil.writeLogRaw("Current: ",T01QU2_A9515MRResDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z9516MRResCnt, T01QU2_A9516MRResCnt[0]) != 0 )
            {
               GXutil.writeLogln("mreres:[seudo value changed for attri]"+"MRResCnt");
               GXutil.writeLogRaw("Old: ",Z9516MRResCnt);
               GXutil.writeLogRaw("Current: ",T01QU2_A9516MRResCnt[0]);
            }
            if ( Z9513MRResTpo != T01QU2_A9513MRResTpo[0] )
            {
               GXutil.writeLogln("mreres:[seudo value changed for attri]"+"MRResTpo");
               GXutil.writeLogRaw("Old: ",Z9513MRResTpo);
               GXutil.writeLogRaw("Current: ",T01QU2_A9513MRResTpo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMReRes"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QU1240( )
   {
      beforeValidate1QU1240( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QU1240( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QU1240( 0) ;
         checkOptimisticConcurrency1QU1240( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QU1240( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QU1240( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QU12 */
                  pr_default.execute(10, new Object[] {Long.valueOf(A9510MRRes), Integer.valueOf(A9511MRResOrd), A9512MRResFch, A9515MRResDsc, A9516MRResCnt, A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A9513MRResTpo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReRes");
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
                        resetCaption1QU0( ) ;
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
            load1QU1240( ) ;
         }
         endLevel1QU1240( ) ;
      }
      closeExtendedTableCursors1QU1240( ) ;
   }

   public void update1QU1240( )
   {
      beforeValidate1QU1240( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QU1240( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QU1240( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QU1240( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QU1240( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QU13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A9511MRResOrd), A9512MRResFch, A9515MRResDsc, A9516MRResCnt, Integer.valueOf(A9513MRResTpo), A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReRes");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMReRes"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QU1240( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1QU0( ) ;
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
         endLevel1QU1240( ) ;
      }
      closeExtendedTableCursors1QU1240( ) ;
   }

   public void deferredUpdate1QU1240( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QU1240( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QU1240( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QU1240( ) ;
         afterConfirm1QU1240( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QU1240( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QU14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReRes");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1240 == 0 )
                     {
                        initAll1QU1240( ) ;
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
                     resetCaption1QU0( ) ;
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
      sMode1240 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QU1240( ) ;
      Gx_mode = sMode1240 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QU1240( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01QU15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9513MRResTpo)});
         A9514MRResTpoD = T01QU15_A9514MRResTpoD[0] ;
         n9514MRResTpoD = T01QU15_n9514MRResTpoD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9514MRResTpoD", A9514MRResTpoD);
         pr_default.close(13);
      }
   }

   public void endLevel1QU1240( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QU1240( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mreres");
         if ( AnyError == 0 )
         {
            confirmValues1QU0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mreres");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QU1240( )
   {
      /* Using cursor T01QU16 */
      pr_default.execute(14);
      RcdFound1240 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1240 = (short)(1) ;
         A396EmprCod = T01QU16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = T01QU16_A9492MRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         A9510MRRes = T01QU16_A9510MRRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9510MRRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9510MRRes), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QU1240( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1240 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1240 = (short)(1) ;
         A396EmprCod = T01QU16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = T01QU16_A9492MRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         A9510MRRes = T01QU16_A9510MRRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9510MRRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9510MRRes), 10, 0));
      }
   }

   public void scanEnd1QU1240( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1QU1240( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QU1240( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QU1240( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QU1240( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QU1240( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QU1240( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QU1240( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMRCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), true);
      edtMRRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRRes_Enabled), 5, 0), true);
      edtMRResOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRResOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResOrd_Enabled), 5, 0), true);
      edtMRResFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRResFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResFch_Enabled), 5, 0), true);
      edtMRResTpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRResTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResTpo_Enabled), 5, 0), true);
      edtMRResTpoD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRResTpoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResTpoD_Enabled), 5, 0), true);
      edtMRResDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRResDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResDsc_Enabled), 5, 0), true);
      edtMRResCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRResCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResCnt_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QU1240( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QU0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mreres", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9510MRRes", GXutil.ltrim( localUtil.ntoc( Z9510MRRes, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9511MRResOrd", GXutil.ltrim( localUtil.ntoc( Z9511MRResOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9512MRResFch", localUtil.ttoc( Z9512MRResFch, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9515MRResDsc", GXutil.rtrim( Z9515MRResDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9516MRResCnt", GXutil.ltrim( localUtil.ntoc( Z9516MRResCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9513MRResTpo", GXutil.ltrim( localUtil.ntoc( Z9513MRResTpo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.mreres", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "MRERES" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla MRERES (Reserva de Repuestos)", "") ;
   }

   public void initializeNonKey1QU1240( )
   {
      A9511MRResOrd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9511MRResOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9511MRResOrd), 8, 0));
      A9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A9512MRResFch", localUtil.ttoc( A9512MRResFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9513MRResTpo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9513MRResTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9513MRResTpo), 8, 0));
      A9514MRResTpoD = "" ;
      n9514MRResTpoD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9514MRResTpoD", A9514MRResTpoD);
      A9515MRResDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9515MRResDsc", A9515MRResDsc);
      A9516MRResCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9516MRResCnt", GXutil.ltrimstr( A9516MRResCnt, 10, 3));
      Z9511MRResOrd = 0 ;
      Z9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      Z9515MRResDsc = "" ;
      Z9516MRResCnt = DecimalUtil.ZERO ;
      Z9513MRResTpo = 0 ;
   }

   public void initAll1QU1240( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9492MRCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
      A9510MRRes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9510MRRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9510MRRes), 10, 0));
      initializeNonKey1QU1240( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016375334", true, true);
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
      httpContext.AddJavascriptSource("mreres.js", "?202661016375335", false, true);
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
      edtMRRes_Internalname = "MRRES" ;
      edtMRResOrd_Internalname = "MRRESORD" ;
      edtMRResFch_Internalname = "MRRESFCH" ;
      edtMRResTpo_Internalname = "MRRESTPO" ;
      edtMRResTpoD_Internalname = "MRRESTPOD" ;
      edtMRResDsc_Internalname = "MRRESDSC" ;
      edtMRResCnt_Internalname = "MRRESCNT" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla MRERES (Reserva de Repuestos)", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMRResCnt_Jsonclick = "" ;
      edtMRResCnt_Enabled = 1 ;
      edtMRResDsc_Jsonclick = "" ;
      edtMRResDsc_Enabled = 1 ;
      edtMRResTpoD_Jsonclick = "" ;
      edtMRResTpoD_Enabled = 0 ;
      edtMRResTpo_Jsonclick = "" ;
      edtMRResTpo_Enabled = 1 ;
      edtMRResFch_Jsonclick = "" ;
      edtMRResFch_Enabled = 1 ;
      edtMRResOrd_Jsonclick = "" ;
      edtMRResOrd_Enabled = 1 ;
      edtMRRes_Jsonclick = "" ;
      edtMRRes_Enabled = 1 ;
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
      /* Using cursor T01QU17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      GX_FocusControl = edtMRResOrd_Internalname ;
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
      /* Using cursor T01QU17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Mrres( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9511MRResOrd", GXutil.ltrim( localUtil.ntoc( A9511MRResOrd, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9512MRResFch", localUtil.ttoc( A9512MRResFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A9513MRResTpo", GXutil.ltrim( localUtil.ntoc( A9513MRResTpo, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9515MRResDsc", GXutil.rtrim( A9515MRResDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A9516MRResCnt", GXutil.ltrim( localUtil.ntoc( A9516MRResCnt, (byte)(10), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9514MRResTpoD", GXutil.rtrim( A9514MRResTpoD));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9492MRCod", GXutil.ltrim( localUtil.ntoc( Z9492MRCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9510MRRes", GXutil.ltrim( localUtil.ntoc( Z9510MRRes, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9511MRResOrd", GXutil.ltrim( localUtil.ntoc( Z9511MRResOrd, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9512MRResFch", localUtil.ttoc( Z9512MRResFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9513MRResTpo", GXutil.ltrim( localUtil.ntoc( Z9513MRResTpo, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9515MRResDsc", GXutil.rtrim( Z9515MRResDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9516MRResCnt", GXutil.ltrim( localUtil.ntoc( Z9516MRResCnt, (byte)(10), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9514MRResTpoD", GXutil.rtrim( Z9514MRResTpoD));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Mrrestpo( )
   {
      n9514MRResTpoD = false ;
      /* Using cursor T01QU15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9513MRResTpo)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRResTpo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRRESTPO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A9514MRResTpoD = T01QU15_A9514MRResTpoD[0] ;
      n9514MRResTpoD = T01QU15_n9514MRResTpoD[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9514MRResTpoD", GXutil.rtrim( A9514MRResTpoD));
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
      setEventMetadata("VALID_MRRES","{handler:'valid_Mrres',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'},{av:'A9510MRRes',fld:'MRRES',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MRRES",",oparms:[{av:'A9511MRResOrd',fld:'MRRESORD',pic:'ZZZZZZZ9'},{av:'A9512MRResFch',fld:'MRRESFCH',pic:'99/99/99 99:99'},{av:'A9513MRResTpo',fld:'MRRESTPO',pic:'ZZZZZZZ9'},{av:'A9515MRResDsc',fld:'MRRESDSC',pic:''},{av:'A9516MRResCnt',fld:'MRRESCNT',pic:'ZZZ,ZZ9.999'},{av:'A9514MRResTpoD',fld:'MRRESTPOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9492MRCod'},{av:'Z9510MRRes'},{av:'Z9511MRResOrd'},{av:'Z9512MRResFch'},{av:'Z9513MRResTpo'},{av:'Z9515MRResDsc'},{av:'Z9516MRResCnt'},{av:'Z9514MRResTpoD'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_MRRESTPO","{handler:'valid_Mrrestpo',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9513MRResTpo',fld:'MRRESTPO',pic:'ZZZZZZZ9'},{av:'A9514MRResTpoD',fld:'MRRESTPOD',pic:''}]");
      setEventMetadata("VALID_MRRESTPO",",oparms:[{av:'A9514MRResTpoD',fld:'MRRESTPOD',pic:''}]}");
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
      Z9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      Z9515MRResDsc = "" ;
      Z9516MRResCnt = DecimalUtil.ZERO ;
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
      A9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      A9514MRResTpoD = "" ;
      A9515MRResDsc = "" ;
      A9516MRResCnt = DecimalUtil.ZERO ;
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
      Z9514MRResTpoD = "" ;
      T01QU6_A9510MRRes = new long[1] ;
      T01QU6_A9511MRResOrd = new int[1] ;
      T01QU6_A9512MRResFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01QU6_A9514MRResTpoD = new String[] {""} ;
      T01QU6_n9514MRResTpoD = new boolean[] {false} ;
      T01QU6_A9515MRResDsc = new String[] {""} ;
      T01QU6_A9516MRResCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QU6_A396EmprCod = new String[] {""} ;
      T01QU6_A9492MRCod = new int[1] ;
      T01QU6_A9513MRResTpo = new int[1] ;
      T01QU5_A9514MRResTpoD = new String[] {""} ;
      T01QU5_n9514MRResTpoD = new boolean[] {false} ;
      T01QU4_A396EmprCod = new String[] {""} ;
      T01QU7_A9514MRResTpoD = new String[] {""} ;
      T01QU7_n9514MRResTpoD = new boolean[] {false} ;
      T01QU8_A396EmprCod = new String[] {""} ;
      T01QU9_A396EmprCod = new String[] {""} ;
      T01QU9_A9492MRCod = new int[1] ;
      T01QU9_A9510MRRes = new long[1] ;
      T01QU3_A9510MRRes = new long[1] ;
      T01QU3_A9511MRResOrd = new int[1] ;
      T01QU3_A9512MRResFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01QU3_A9515MRResDsc = new String[] {""} ;
      T01QU3_A9516MRResCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QU3_A396EmprCod = new String[] {""} ;
      T01QU3_A9492MRCod = new int[1] ;
      T01QU3_A9513MRResTpo = new int[1] ;
      sMode1240 = "" ;
      T01QU10_A396EmprCod = new String[] {""} ;
      T01QU10_A9492MRCod = new int[1] ;
      T01QU10_A9510MRRes = new long[1] ;
      T01QU11_A396EmprCod = new String[] {""} ;
      T01QU11_A9492MRCod = new int[1] ;
      T01QU11_A9510MRRes = new long[1] ;
      T01QU2_A9510MRRes = new long[1] ;
      T01QU2_A9511MRResOrd = new int[1] ;
      T01QU2_A9512MRResFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01QU2_A9515MRResDsc = new String[] {""} ;
      T01QU2_A9516MRResCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QU2_A396EmprCod = new String[] {""} ;
      T01QU2_A9492MRCod = new int[1] ;
      T01QU2_A9513MRResTpo = new int[1] ;
      T01QU15_A9514MRResTpoD = new String[] {""} ;
      T01QU15_n9514MRResTpoD = new boolean[] {false} ;
      T01QU16_A396EmprCod = new String[] {""} ;
      T01QU16_A9492MRCod = new int[1] ;
      T01QU16_A9510MRRes = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01QU17_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      ZZ9515MRResDsc = "" ;
      ZZ9516MRResCnt = DecimalUtil.ZERO ;
      ZZ9514MRResTpoD = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mreres__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mreres__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mreres__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mreres__default(),
         new Object[] {
             new Object[] {
            T01QU2_A9510MRRes, T01QU2_A9511MRResOrd, T01QU2_A9512MRResFch, T01QU2_A9515MRResDsc, T01QU2_A9516MRResCnt, T01QU2_A396EmprCod, T01QU2_A9492MRCod, T01QU2_A9513MRResTpo
            }
            , new Object[] {
            T01QU3_A9510MRRes, T01QU3_A9511MRResOrd, T01QU3_A9512MRResFch, T01QU3_A9515MRResDsc, T01QU3_A9516MRResCnt, T01QU3_A396EmprCod, T01QU3_A9492MRCod, T01QU3_A9513MRResTpo
            }
            , new Object[] {
            T01QU4_A396EmprCod
            }
            , new Object[] {
            T01QU5_A9514MRResTpoD, T01QU5_n9514MRResTpoD
            }
            , new Object[] {
            T01QU6_A9510MRRes, T01QU6_A9511MRResOrd, T01QU6_A9512MRResFch, T01QU6_A9514MRResTpoD, T01QU6_n9514MRResTpoD, T01QU6_A9515MRResDsc, T01QU6_A9516MRResCnt, T01QU6_A396EmprCod, T01QU6_A9492MRCod, T01QU6_A9513MRResTpo
            }
            , new Object[] {
            T01QU7_A9514MRResTpoD, T01QU7_n9514MRResTpoD
            }
            , new Object[] {
            T01QU8_A396EmprCod
            }
            , new Object[] {
            T01QU9_A396EmprCod, T01QU9_A9492MRCod, T01QU9_A9510MRRes
            }
            , new Object[] {
            T01QU10_A396EmprCod, T01QU10_A9492MRCod, T01QU10_A9510MRRes
            }
            , new Object[] {
            T01QU11_A396EmprCod, T01QU11_A9492MRCod, T01QU11_A9510MRRes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QU15_A9514MRResTpoD, T01QU15_n9514MRResTpoD
            }
            , new Object[] {
            T01QU16_A396EmprCod, T01QU16_A9492MRCod, T01QU16_A9510MRRes
            }
            , new Object[] {
            T01QU17_A396EmprCod
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
   private short RcdFound1240 ;
   private short nIsDirty_1240 ;
   private int Z9492MRCod ;
   private int Z9511MRResOrd ;
   private int Z9513MRResTpo ;
   private int A9513MRResTpo ;
   private int A9492MRCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMRCod_Enabled ;
   private int edtMRRes_Enabled ;
   private int A9511MRResOrd ;
   private int edtMRResOrd_Enabled ;
   private int edtMRResFch_Enabled ;
   private int edtMRResTpo_Enabled ;
   private int edtMRResTpoD_Enabled ;
   private int edtMRResDsc_Enabled ;
   private int edtMRResCnt_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ9492MRCod ;
   private int ZZ9511MRResOrd ;
   private int ZZ9513MRResTpo ;
   private long Z9510MRRes ;
   private long A9510MRRes ;
   private long ZZ9510MRRes ;
   private java.math.BigDecimal Z9516MRResCnt ;
   private java.math.BigDecimal A9516MRResCnt ;
   private java.math.BigDecimal ZZ9516MRResCnt ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z9515MRResDsc ;
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
   private String edtMRRes_Internalname ;
   private String edtMRRes_Jsonclick ;
   private String edtMRResOrd_Internalname ;
   private String edtMRResOrd_Jsonclick ;
   private String edtMRResFch_Internalname ;
   private String edtMRResFch_Jsonclick ;
   private String edtMRResTpo_Internalname ;
   private String edtMRResTpo_Jsonclick ;
   private String edtMRResTpoD_Internalname ;
   private String A9514MRResTpoD ;
   private String edtMRResTpoD_Jsonclick ;
   private String edtMRResDsc_Internalname ;
   private String A9515MRResDsc ;
   private String edtMRResDsc_Jsonclick ;
   private String edtMRResCnt_Internalname ;
   private String edtMRResCnt_Jsonclick ;
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
   private String Z9514MRResTpoD ;
   private String sMode1240 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ9515MRResDsc ;
   private String ZZ9514MRResTpoD ;
   private java.util.Date Z9512MRResFch ;
   private java.util.Date A9512MRResFch ;
   private java.util.Date ZZ9512MRResFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n9514MRResTpoD ;
   private IDataStoreProvider pr_default ;
   private long[] T01QU6_A9510MRRes ;
   private int[] T01QU6_A9511MRResOrd ;
   private java.util.Date[] T01QU6_A9512MRResFch ;
   private String[] T01QU6_A9514MRResTpoD ;
   private boolean[] T01QU6_n9514MRResTpoD ;
   private String[] T01QU6_A9515MRResDsc ;
   private java.math.BigDecimal[] T01QU6_A9516MRResCnt ;
   private String[] T01QU6_A396EmprCod ;
   private int[] T01QU6_A9492MRCod ;
   private int[] T01QU6_A9513MRResTpo ;
   private String[] T01QU5_A9514MRResTpoD ;
   private boolean[] T01QU5_n9514MRResTpoD ;
   private String[] T01QU4_A396EmprCod ;
   private String[] T01QU7_A9514MRResTpoD ;
   private boolean[] T01QU7_n9514MRResTpoD ;
   private String[] T01QU8_A396EmprCod ;
   private String[] T01QU9_A396EmprCod ;
   private int[] T01QU9_A9492MRCod ;
   private long[] T01QU9_A9510MRRes ;
   private long[] T01QU3_A9510MRRes ;
   private int[] T01QU3_A9511MRResOrd ;
   private java.util.Date[] T01QU3_A9512MRResFch ;
   private String[] T01QU3_A9515MRResDsc ;
   private java.math.BigDecimal[] T01QU3_A9516MRResCnt ;
   private String[] T01QU3_A396EmprCod ;
   private int[] T01QU3_A9492MRCod ;
   private int[] T01QU3_A9513MRResTpo ;
   private String[] T01QU10_A396EmprCod ;
   private int[] T01QU10_A9492MRCod ;
   private long[] T01QU10_A9510MRRes ;
   private String[] T01QU11_A396EmprCod ;
   private int[] T01QU11_A9492MRCod ;
   private long[] T01QU11_A9510MRRes ;
   private long[] T01QU2_A9510MRRes ;
   private int[] T01QU2_A9511MRResOrd ;
   private java.util.Date[] T01QU2_A9512MRResFch ;
   private String[] T01QU2_A9515MRResDsc ;
   private java.math.BigDecimal[] T01QU2_A9516MRResCnt ;
   private String[] T01QU2_A396EmprCod ;
   private int[] T01QU2_A9492MRCod ;
   private int[] T01QU2_A9513MRResTpo ;
   private String[] T01QU15_A9514MRResTpoD ;
   private boolean[] T01QU15_n9514MRResTpoD ;
   private String[] T01QU16_A396EmprCod ;
   private int[] T01QU16_A9492MRCod ;
   private long[] T01QU16_A9510MRRes ;
   private String[] T01QU17_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mreres__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mreres__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mreres__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mreres__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QU2", "SELECT MRRes, MRResOrd, MRResFch, MRResDsc, MRResCnt, EmprCod, MRCod, MRResTpo FROM TXPMReRes WHERE EmprCod = ? AND MRCod = ? AND MRRes = ?  FOR UPDATE OF MRResOrd, MRResFch, MRResDsc, MRResCnt, MRResTpo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QU3", "SELECT MRRes, MRResOrd, MRResFch, MRResDsc, MRResCnt, EmprCod, MRCod, MRResTpo FROM TXPMReRes WHERE EmprCod = ? AND MRCod = ? AND MRRes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QU4", "SELECT EmprCod FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QU5", "SELECT MTMovNom AS MRResTpoD FROM TXPMTPOMO WHERE EmprCod = ? AND MTMovCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QU6", "SELECT /*+ FIRST_ROWS(100) */ TM1.MRRes, TM1.MRResOrd, TM1.MRResFch, T2.MTMovNom AS MRResTpoD, TM1.MRResDsc, TM1.MRResCnt, TM1.EmprCod, TM1.MRCod, TM1.MRResTpo AS MRResTpo FROM (TXPMReRes TM1 INNER JOIN TXPMTPOMO T2 ON T2.EmprCod = TM1.EmprCod AND T2.MTMovCod = TM1.MRResTpo) WHERE TM1.EmprCod = ? and TM1.MRCod = ? and TM1.MRRes = ? ORDER BY TM1.EmprCod, TM1.MRCod, TM1.MRRes ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QU7", "SELECT MTMovNom AS MRResTpoD FROM TXPMTPOMO WHERE EmprCod = ? AND MTMovCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QU8", "SELECT EmprCod FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QU9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRCod, MRRes FROM TXPMReRes WHERE EmprCod = ? AND MRCod = ? AND MRRes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QU10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRCod, MRRes FROM TXPMReRes WHERE ( EmprCod > ? or EmprCod = ? and MRCod > ? or MRCod = ? and EmprCod = ? and MRRes > ?) ORDER BY EmprCod, MRCod, MRRes) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QU11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRCod, MRRes FROM TXPMReRes WHERE ( EmprCod < ? or EmprCod = ? and MRCod < ? or MRCod = ? and EmprCod = ? and MRRes < ?) ORDER BY EmprCod DESC, MRCod DESC, MRRes DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QU12", "INSERT INTO TXPMReRes(MRRes, MRResOrd, MRResFch, MRResDsc, MRResCnt, EmprCod, MRCod, MRResTpo) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMReRes")
         ,new UpdateCursor("T01QU13", "UPDATE TXPMReRes SET MRResOrd=?, MRResFch=?, MRResDsc=?, MRResCnt=?, MRResTpo=?  WHERE EmprCod = ? AND MRCod = ? AND MRRes = ?", GX_NOMASK, "TXPMReRes")
         ,new UpdateCursor("T01QU14", "DELETE FROM TXPMReRes  WHERE EmprCod = ? AND MRCod = ? AND MRRes = ?", GX_NOMASK, "TXPMReRes")
         ,new ForEachCursor("T01QU15", "SELECT MTMovNom AS MRResTpoD FROM TXPMTPOMO WHERE EmprCod = ? AND MTMovCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QU16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MRCod, MRRes FROM TXPMReRes ORDER BY EmprCod, MRCod, MRRes ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QU17", "SELECT EmprCod FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 50);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
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
               stmt.setString(4, (String)parms[3], 50);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 50);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setLong(8, ((Number) parms[7]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
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

