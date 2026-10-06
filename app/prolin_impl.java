package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class prolin_impl extends GXDataArea
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
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A758ProCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla PROLIN", ""), (short)(0)) ;
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

   public prolin_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public prolin_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prolin_impl.class ));
   }

   public prolin_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla PROLIN", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_PROLIN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_PROLIN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProNumLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProNumLin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProNumLin_Internalname, GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProNumLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A774ProNumLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A774ProNumLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProNumLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProNumLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCod_Internalname, httpContext.getMessage( "Codigo Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDsc_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCod_Internalname, httpContext.getMessage( "Código Máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDec_Internalname, httpContext.getMessage( "Decalage", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasDec_Enabled!=0) ? localUtil.format( A459FasDec, "ZZ9.9") : localUtil.format( A459FasDec, "ZZ9.9"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasDec_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPreSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasPreSal_Internalname, httpContext.getMessage( "Tiempo Prep. y Salida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreSal_Internalname, GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPreSal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreSal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasPreSal_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPrePie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasPrePie_Internalname, httpContext.getMessage( "Tiempo Prep. por Pieza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasPrePie_Internalname, GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPrePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPrePie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasPrePie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasVelPro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasVelPro_Internalname, httpContext.getMessage( "Velocidad (mts/m)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasVelPro_Internalname, GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasVelPro_Enabled!=0) ? localUtil.format( A472FasVelPro, "ZZ9.9") : localUtil.format( A472FasVelPro, "ZZ9.9"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasVelPro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasVelPro_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasNumPas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasNumPas_Internalname, httpContext.getMessage( "Numero de Pases", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasNumPas_Internalname, GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasNumPas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasNumPas_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasNumPas_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasActTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasActTin_Internalname, httpContext.getMessage( "Actualizacion Tinte", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin), GXutil.rtrim( localUtil.format( A456FasActTin, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasActTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasActTin_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasCon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCon_Internalname, httpContext.getMessage( "Control?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCon_Internalname, GXutil.rtrim( A458FasCon), GXutil.rtrim( localUtil.format( A458FasCon, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCon_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasCon_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasForMul_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasForMul_Internalname, httpContext.getMessage( "Formula?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasForMul_Internalname, GXutil.rtrim( A4286FasForMul), GXutil.rtrim( localUtil.format( A4286FasForMul, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasForMul_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasForMul_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasConPla_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasConPla_Internalname, httpContext.getMessage( "Planning?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasConPla_Internalname, GXutil.rtrim( A4299FasConPla), GXutil.rtrim( localUtil.format( A4299FasConPla, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasConPla_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasConPla_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasAcab_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasAcab_Internalname, httpContext.getMessage( "Acabado?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasAcab_Internalname, GXutil.rtrim( A4903FasAcab), GXutil.rtrim( localUtil.format( A4903FasAcab, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasAcab_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasAcab_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProUltFP_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProUltFP_Internalname, httpContext.getMessage( "Ultima linea Proceso Q", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProUltFP_Internalname, GXutil.ltrim( localUtil.ntoc( A6437ProUltFP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProUltFP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6437ProUltFP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6437ProUltFP), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProUltFP_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProUltFP_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PROLIN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PROLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PROLIN.htm");
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
         Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
         Z774ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z774ProNumLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6437ProUltFP = (short)(localUtil.ctol( httpContext.cgiGet( "Z6437ProUltFP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRONUMLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProNumLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A774ProNumLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
         }
         else
         {
            A774ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
         }
         A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A459FasDec = localUtil.ctond( httpContext.cgiGet( edtFasDec_Internalname)) ;
         n459FasDec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
         A469FasPreSal = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPreSal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n469FasPreSal = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
         A468FasPrePie = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPrePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n468FasPrePie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
         A472FasVelPro = localUtil.ctond( httpContext.cgiGet( edtFasVelPro_Internalname)) ;
         n472FasVelPro = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
         A464FasNumPas = (short)(localUtil.ctol( httpContext.cgiGet( edtFasNumPas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n464FasNumPas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
         A456FasActTin = GXutil.upper( httpContext.cgiGet( edtFasActTin_Internalname)) ;
         n456FasActTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
         A458FasCon = GXutil.upper( httpContext.cgiGet( edtFasCon_Internalname)) ;
         n458FasCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
         A4286FasForMul = GXutil.upper( httpContext.cgiGet( edtFasForMul_Internalname)) ;
         n4286FasForMul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
         A4299FasConPla = GXutil.upper( httpContext.cgiGet( edtFasConPla_Internalname)) ;
         n4299FasConPla = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", A4299FasConPla);
         A4903FasAcab = GXutil.upper( httpContext.cgiGet( edtFasAcab_Internalname)) ;
         n4903FasAcab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProUltFP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProUltFP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROULTFP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProUltFP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6437ProUltFP = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6437ProUltFP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6437ProUltFP), 4, 0));
         }
         else
         {
            A6437ProUltFP = (short)(localUtil.ctol( httpContext.cgiGet( edtProUltFP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6437ProUltFP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6437ProUltFP), 4, 0));
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
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A774ProNumLin = (short)(GXutil.lval( httpContext.GetPar( "ProNumLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
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
            initAll1QF88( ) ;
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
      disableAttributes1QF88( ) ;
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

   public void resetCaption1QF0( )
   {
   }

   public void zm1QF88( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6437ProUltFP = T01QF3_A6437ProUltFP[0] ;
            Z457FasCod = T01QF3_A457FasCod[0] ;
         }
         else
         {
            Z6437ProUltFP = A6437ProUltFP ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z774ProNumLin = A774ProNumLin ;
         Z6437ProUltFP = A6437ProUltFP ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z758ProCod = A758ProCod ;
         Z759ProDsc = A759ProDsc ;
         Z460FasDsc = A460FasDsc ;
         Z459FasDec = A459FasDec ;
         Z469FasPreSal = A469FasPreSal ;
         Z468FasPrePie = A468FasPrePie ;
         Z472FasVelPro = A472FasVelPro ;
         Z464FasNumPas = A464FasNumPas ;
         Z456FasActTin = A456FasActTin ;
         Z458FasCon = A458FasCon ;
         Z4286FasForMul = A4286FasForMul ;
         Z4299FasConPla = A4299FasConPla ;
         Z4903FasAcab = A4903FasAcab ;
         Z602MaqCod = A602MaqCod ;
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

   public void load1QF88( )
   {
      /* Using cursor T01QF6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound88 = (short)(1) ;
         A759ProDsc = T01QF6_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A460FasDsc = T01QF6_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A459FasDec = T01QF6_A459FasDec[0] ;
         n459FasDec = T01QF6_n459FasDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
         A469FasPreSal = T01QF6_A469FasPreSal[0] ;
         n469FasPreSal = T01QF6_n469FasPreSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
         A468FasPrePie = T01QF6_A468FasPrePie[0] ;
         n468FasPrePie = T01QF6_n468FasPrePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
         A472FasVelPro = T01QF6_A472FasVelPro[0] ;
         n472FasVelPro = T01QF6_n472FasVelPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
         A464FasNumPas = T01QF6_A464FasNumPas[0] ;
         n464FasNumPas = T01QF6_n464FasNumPas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
         A456FasActTin = T01QF6_A456FasActTin[0] ;
         n456FasActTin = T01QF6_n456FasActTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
         A458FasCon = T01QF6_A458FasCon[0] ;
         n458FasCon = T01QF6_n458FasCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
         A4286FasForMul = T01QF6_A4286FasForMul[0] ;
         n4286FasForMul = T01QF6_n4286FasForMul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
         A4299FasConPla = T01QF6_A4299FasConPla[0] ;
         n4299FasConPla = T01QF6_n4299FasConPla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", A4299FasConPla);
         A4903FasAcab = T01QF6_A4903FasAcab[0] ;
         n4903FasAcab = T01QF6_n4903FasAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
         A6437ProUltFP = T01QF6_A6437ProUltFP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6437ProUltFP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6437ProUltFP), 4, 0));
         A457FasCod = T01QF6_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A602MaqCod = T01QF6_A602MaqCod[0] ;
         n602MaqCod = T01QF6_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         zm1QF88( -1) ;
      }
      pr_default.close(4);
      onLoadActions1QF88( ) ;
   }

   public void onLoadActions1QF88( )
   {
   }

   public void checkExtendedTable1QF88( )
   {
      nIsDirty_88 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QF4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01QF4_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A459FasDec = T01QF4_A459FasDec[0] ;
      n459FasDec = T01QF4_n459FasDec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
      A469FasPreSal = T01QF4_A469FasPreSal[0] ;
      n469FasPreSal = T01QF4_n469FasPreSal[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
      A468FasPrePie = T01QF4_A468FasPrePie[0] ;
      n468FasPrePie = T01QF4_n468FasPrePie[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
      A472FasVelPro = T01QF4_A472FasVelPro[0] ;
      n472FasVelPro = T01QF4_n472FasVelPro[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
      A464FasNumPas = T01QF4_A464FasNumPas[0] ;
      n464FasNumPas = T01QF4_n464FasNumPas[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
      A456FasActTin = T01QF4_A456FasActTin[0] ;
      n456FasActTin = T01QF4_n456FasActTin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
      A458FasCon = T01QF4_A458FasCon[0] ;
      n458FasCon = T01QF4_n458FasCon[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
      A4286FasForMul = T01QF4_A4286FasForMul[0] ;
      n4286FasForMul = T01QF4_n4286FasForMul[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
      A4299FasConPla = T01QF4_A4299FasConPla[0] ;
      n4299FasConPla = T01QF4_n4299FasConPla[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", A4299FasConPla);
      A4903FasAcab = T01QF4_A4903FasAcab[0] ;
      n4903FasAcab = T01QF4_n4903FasAcab[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
      A602MaqCod = T01QF4_A602MaqCod[0] ;
      n602MaqCod = T01QF4_n602MaqCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      pr_default.close(2);
      /* Using cursor T01QF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01QF5_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1QF88( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         String A457FasCod )
   {
      /* Using cursor T01QF7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01QF7_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A459FasDec = T01QF7_A459FasDec[0] ;
      n459FasDec = T01QF7_n459FasDec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
      A469FasPreSal = T01QF7_A469FasPreSal[0] ;
      n469FasPreSal = T01QF7_n469FasPreSal[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
      A468FasPrePie = T01QF7_A468FasPrePie[0] ;
      n468FasPrePie = T01QF7_n468FasPrePie[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
      A472FasVelPro = T01QF7_A472FasVelPro[0] ;
      n472FasVelPro = T01QF7_n472FasVelPro[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
      A464FasNumPas = T01QF7_A464FasNumPas[0] ;
      n464FasNumPas = T01QF7_n464FasNumPas[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
      A456FasActTin = T01QF7_A456FasActTin[0] ;
      n456FasActTin = T01QF7_n456FasActTin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
      A458FasCon = T01QF7_A458FasCon[0] ;
      n458FasCon = T01QF7_n458FasCon[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
      A4286FasForMul = T01QF7_A4286FasForMul[0] ;
      n4286FasForMul = T01QF7_n4286FasForMul[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
      A4299FasConPla = T01QF7_A4299FasConPla[0] ;
      n4299FasConPla = T01QF7_n4299FasConPla[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", A4299FasConPla);
      A4903FasAcab = T01QF7_A4903FasAcab[0] ;
      n4903FasAcab = T01QF7_n4903FasAcab[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
      A602MaqCod = T01QF7_A602MaqCod[0] ;
      n602MaqCod = T01QF7_n602MaqCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A456FasActTin))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A458FasCon))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4286FasForMul))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4299FasConPla))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4903FasAcab))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
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
                         String A758ProCod )
   {
      /* Using cursor T01QF8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01QF8_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1QF88( )
   {
      /* Using cursor T01QF9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound88 = (short)(1) ;
      }
      else
      {
         RcdFound88 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QF88( 1) ;
         RcdFound88 = (short)(1) ;
         A774ProNumLin = T01QF3_A774ProNumLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
         A6437ProUltFP = T01QF3_A6437ProUltFP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6437ProUltFP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6437ProUltFP), 4, 0));
         A396EmprCod = T01QF3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = T01QF3_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A758ProCod = T01QF3_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z774ProNumLin = A774ProNumLin ;
         sMode88 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1QF88( ) ;
         if ( AnyError == 1 )
         {
            RcdFound88 = (short)(0) ;
            initializeNonKey1QF88( ) ;
         }
         Gx_mode = sMode88 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound88 = (short)(0) ;
         initializeNonKey1QF88( ) ;
         sMode88 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode88 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QF88( ) ;
      if ( RcdFound88 == 0 )
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
      RcdFound88 = (short)(0) ;
      /* Using cursor T01QF10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A758ProCod, A758ProCod, A396EmprCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QF10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QF10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QF10_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01QF10_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01QF10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QF10_A774ProNumLin[0] < A774ProNumLin ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QF10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QF10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QF10_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01QF10_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01QF10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QF10_A774ProNumLin[0] > A774ProNumLin ) ) )
         {
            A396EmprCod = T01QF10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A758ProCod = T01QF10_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A774ProNumLin = T01QF10_A774ProNumLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
            RcdFound88 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound88 = (short)(0) ;
      /* Using cursor T01QF11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A758ProCod, A758ProCod, A396EmprCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QF11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QF11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QF11_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01QF11_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01QF11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QF11_A774ProNumLin[0] > A774ProNumLin ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QF11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QF11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QF11_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01QF11_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01QF11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QF11_A774ProNumLin[0] < A774ProNumLin ) ) )
         {
            A396EmprCod = T01QF11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A758ProCod = T01QF11_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A774ProNumLin = T01QF11_A774ProNumLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
            RcdFound88 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QF88( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QF88( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound88 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A774ProNumLin = Z774ProNumLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
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
               update1QF88( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QF88( ) ;
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
                  insert1QF88( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A774ProNumLin = Z774ProNumLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
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
      if ( RcdFound88 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1QF88( ) ;
      if ( RcdFound88 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QF88( ) ;
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
      if ( RcdFound88 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
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
      if ( RcdFound88 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
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
      scanStart1QF88( ) ;
      if ( RcdFound88 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound88 != 0 )
         {
            scanNext1QF88( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QF88( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1QF88( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z6437ProUltFP != T01QF2_A6437ProUltFP[0] ) || ( GXutil.strcmp(Z457FasCod, T01QF2_A457FasCod[0]) != 0 ) )
         {
            if ( Z6437ProUltFP != T01QF2_A6437ProUltFP[0] )
            {
               GXutil.writeLogln("prolin:[seudo value changed for attri]"+"ProUltFP");
               GXutil.writeLogRaw("Old: ",Z6437ProUltFP);
               GXutil.writeLogRaw("Current: ",T01QF2_A6437ProUltFP[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01QF2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("prolin:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01QF2_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPROLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QF88( )
   {
      beforeValidate1QF88( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QF88( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QF88( 0) ;
         checkOptimisticConcurrency1QF88( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QF88( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QF88( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QF12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A774ProNumLin), Short.valueOf(A6437ProUltFP), A396EmprCod, A457FasCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
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
                        resetCaption1QF0( ) ;
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
            load1QF88( ) ;
         }
         endLevel1QF88( ) ;
      }
      closeExtendedTableCursors1QF88( ) ;
   }

   public void update1QF88( )
   {
      beforeValidate1QF88( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QF88( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QF88( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QF88( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QF88( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QF13 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A6437ProUltFP), A457FasCod, A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROLIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QF88( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1QF0( ) ;
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
         endLevel1QF88( ) ;
      }
      closeExtendedTableCursors1QF88( ) ;
   }

   public void deferredUpdate1QF88( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QF88( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QF88( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QF88( ) ;
         afterConfirm1QF88( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QF88( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QF14 */
               pr_default.execute(12, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound88 == 0 )
                     {
                        initAll1QF88( ) ;
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
                     resetCaption1QF0( ) ;
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
      sMode88 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QF88( ) ;
      Gx_mode = sMode88 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QF88( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01QF15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01QF15_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(13);
         /* Using cursor T01QF16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01QF16_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A459FasDec = T01QF16_A459FasDec[0] ;
         n459FasDec = T01QF16_n459FasDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
         A469FasPreSal = T01QF16_A469FasPreSal[0] ;
         n469FasPreSal = T01QF16_n469FasPreSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
         A468FasPrePie = T01QF16_A468FasPrePie[0] ;
         n468FasPrePie = T01QF16_n468FasPrePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
         A472FasVelPro = T01QF16_A472FasVelPro[0] ;
         n472FasVelPro = T01QF16_n472FasVelPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
         A464FasNumPas = T01QF16_A464FasNumPas[0] ;
         n464FasNumPas = T01QF16_n464FasNumPas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
         A456FasActTin = T01QF16_A456FasActTin[0] ;
         n456FasActTin = T01QF16_n456FasActTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
         A458FasCon = T01QF16_A458FasCon[0] ;
         n458FasCon = T01QF16_n458FasCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
         A4286FasForMul = T01QF16_A4286FasForMul[0] ;
         n4286FasForMul = T01QF16_n4286FasForMul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
         A4299FasConPla = T01QF16_A4299FasConPla[0] ;
         n4299FasConPla = T01QF16_n4299FasConPla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", A4299FasConPla);
         A4903FasAcab = T01QF16_A4903FasAcab[0] ;
         n4903FasAcab = T01QF16_n4903FasAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
         A602MaqCod = T01QF16_A602MaqCod[0] ;
         n602MaqCod = T01QF16_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01QF17 */
         pr_default.execute(15, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT002", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01QF18 */
         pr_default.execute(16, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
   }

   public void endLevel1QF88( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QF88( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "prolin");
         if ( AnyError == 0 )
         {
            confirmValues1QF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "prolin");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QF88( )
   {
      /* Using cursor T01QF19 */
      pr_default.execute(17);
      RcdFound88 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound88 = (short)(1) ;
         A396EmprCod = T01QF19_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = T01QF19_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A774ProNumLin = T01QF19_A774ProNumLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QF88( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound88 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound88 = (short)(1) ;
         A396EmprCod = T01QF19_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = T01QF19_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A774ProNumLin = T01QF19_A774ProNumLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
      }
   }

   public void scanEnd1QF88( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1QF88( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QF88( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QF88( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QF88( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QF88( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QF88( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QF88( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtProNumLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtFasDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), true);
      edtFasPreSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreSal_Enabled), 5, 0), true);
      edtFasPrePie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPrePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPrePie_Enabled), 5, 0), true);
      edtFasVelPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasVelPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasVelPro_Enabled), 5, 0), true);
      edtFasNumPas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasNumPas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumPas_Enabled), 5, 0), true);
      edtFasActTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), true);
      edtFasCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Enabled), 5, 0), true);
      edtFasForMul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasForMul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForMul_Enabled), 5, 0), true);
      edtFasConPla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasConPla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasConPla_Enabled), 5, 0), true);
      edtFasAcab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasAcab_Enabled), 5, 0), true);
      edtProUltFP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUltFP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUltFP_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QF88( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QF0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.prolin", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z774ProNumLin", GXutil.ltrim( localUtil.ntoc( Z774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6437ProUltFP", GXutil.ltrim( localUtil.ntoc( Z6437ProUltFP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
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
      return formatLink("app.prolin", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "PROLIN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla PROLIN", "") ;
   }

   public void initializeNonKey1QF88( )
   {
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A602MaqCod = "" ;
      n602MaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A459FasDec = DecimalUtil.ZERO ;
      n459FasDec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
      A469FasPreSal = (short)(0) ;
      n469FasPreSal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
      A468FasPrePie = (short)(0) ;
      n468FasPrePie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
      A472FasVelPro = DecimalUtil.ZERO ;
      n472FasVelPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
      A464FasNumPas = (short)(0) ;
      n464FasNumPas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
      A456FasActTin = "" ;
      n456FasActTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
      A458FasCon = "" ;
      n458FasCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
      A4286FasForMul = "" ;
      n4286FasForMul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
      A4299FasConPla = "" ;
      n4299FasConPla = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", A4299FasConPla);
      A4903FasAcab = "" ;
      n4903FasAcab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
      A6437ProUltFP = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6437ProUltFP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6437ProUltFP), 4, 0));
      Z6437ProUltFP = (short)(0) ;
      Z457FasCod = "" ;
   }

   public void initAll1QF88( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A774ProNumLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
      initializeNonKey1QF88( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016373426", true, true);
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
      httpContext.AddJavascriptSource("prolin.js", "?202661016373426", false, true);
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
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtProNumLin_Internalname = "PRONUMLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtFasDec_Internalname = "FASDEC" ;
      edtFasPreSal_Internalname = "FASPRESAL" ;
      edtFasPrePie_Internalname = "FASPREPIE" ;
      edtFasVelPro_Internalname = "FASVELPRO" ;
      edtFasNumPas_Internalname = "FASNUMPAS" ;
      edtFasActTin_Internalname = "FASACTTIN" ;
      edtFasCon_Internalname = "FASCON" ;
      edtFasForMul_Internalname = "FASFORMUL" ;
      edtFasConPla_Internalname = "FASCONPLA" ;
      edtFasAcab_Internalname = "FASACAB" ;
      edtProUltFP_Internalname = "PROULTFP" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla PROLIN", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtProUltFP_Jsonclick = "" ;
      edtProUltFP_Enabled = 1 ;
      edtFasAcab_Jsonclick = "" ;
      edtFasAcab_Enabled = 0 ;
      edtFasConPla_Jsonclick = "" ;
      edtFasConPla_Enabled = 0 ;
      edtFasForMul_Jsonclick = "" ;
      edtFasForMul_Enabled = 0 ;
      edtFasCon_Jsonclick = "" ;
      edtFasCon_Enabled = 0 ;
      edtFasActTin_Jsonclick = "" ;
      edtFasActTin_Enabled = 0 ;
      edtFasNumPas_Jsonclick = "" ;
      edtFasNumPas_Enabled = 0 ;
      edtFasVelPro_Jsonclick = "" ;
      edtFasVelPro_Enabled = 0 ;
      edtFasPrePie_Jsonclick = "" ;
      edtFasPrePie_Enabled = 0 ;
      edtFasPreSal_Jsonclick = "" ;
      edtFasPreSal_Enabled = 0 ;
      edtFasDec_Jsonclick = "" ;
      edtFasDec_Enabled = 0 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Enabled = 0 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 1 ;
      edtProNumLin_Jsonclick = "" ;
      edtProNumLin_Enabled = 1 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 1 ;
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
      /* Using cursor T01QF15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01QF15_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(13);
      GX_FocusControl = edtFasCod_Internalname ;
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

   public void valid_Procod( )
   {
      /* Using cursor T01QF15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A759ProDsc = T01QF15_A759ProDsc[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
   }

   public void valid_Pronumlin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6437ProUltFP", GXutil.ltrim( localUtil.ntoc( A6437ProUltFP, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", GXutil.rtrim( A456FasActTin));
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", GXutil.rtrim( A458FasCon));
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", GXutil.rtrim( A4286FasForMul));
      httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", GXutil.rtrim( A4299FasConPla));
      httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", GXutil.rtrim( A4903FasAcab));
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", GXutil.rtrim( A602MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z774ProNumLin", GXutil.ltrim( localUtil.ntoc( Z774ProNumLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6437ProUltFP", GXutil.ltrim( localUtil.ntoc( Z6437ProUltFP, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z459FasDec", GXutil.ltrim( localUtil.ntoc( Z459FasDec, (byte)(5), (byte)(1), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z469FasPreSal", GXutil.ltrim( localUtil.ntoc( Z469FasPreSal, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z468FasPrePie", GXutil.ltrim( localUtil.ntoc( Z468FasPrePie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z472FasVelPro", GXutil.ltrim( localUtil.ntoc( Z472FasVelPro, (byte)(5), (byte)(1), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z464FasNumPas", GXutil.ltrim( localUtil.ntoc( Z464FasNumPas, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z456FasActTin", GXutil.rtrim( Z456FasActTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z458FasCon", GXutil.rtrim( Z458FasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4286FasForMul", GXutil.rtrim( Z4286FasForMul));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4299FasConPla", GXutil.rtrim( Z4299FasConPla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4903FasAcab", GXutil.rtrim( Z4903FasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      n459FasDec = false ;
      n469FasPreSal = false ;
      n468FasPrePie = false ;
      n472FasVelPro = false ;
      n464FasNumPas = false ;
      n456FasActTin = false ;
      n458FasCon = false ;
      n4286FasForMul = false ;
      n4299FasConPla = false ;
      n4903FasAcab = false ;
      n602MaqCod = false ;
      /* Using cursor T01QF16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A460FasDsc = T01QF16_A460FasDsc[0] ;
      A459FasDec = T01QF16_A459FasDec[0] ;
      n459FasDec = T01QF16_n459FasDec[0] ;
      A469FasPreSal = T01QF16_A469FasPreSal[0] ;
      n469FasPreSal = T01QF16_n469FasPreSal[0] ;
      A468FasPrePie = T01QF16_A468FasPrePie[0] ;
      n468FasPrePie = T01QF16_n468FasPrePie[0] ;
      A472FasVelPro = T01QF16_A472FasVelPro[0] ;
      n472FasVelPro = T01QF16_n472FasVelPro[0] ;
      A464FasNumPas = T01QF16_A464FasNumPas[0] ;
      n464FasNumPas = T01QF16_n464FasNumPas[0] ;
      A456FasActTin = T01QF16_A456FasActTin[0] ;
      n456FasActTin = T01QF16_n456FasActTin[0] ;
      A458FasCon = T01QF16_A458FasCon[0] ;
      n458FasCon = T01QF16_n458FasCon[0] ;
      A4286FasForMul = T01QF16_A4286FasForMul[0] ;
      n4286FasForMul = T01QF16_n4286FasForMul[0] ;
      A4299FasConPla = T01QF16_A4299FasConPla[0] ;
      n4299FasConPla = T01QF16_n4299FasConPla[0] ;
      A4903FasAcab = T01QF16_A4903FasAcab[0] ;
      n4903FasAcab = T01QF16_n4903FasAcab[0] ;
      A602MaqCod = T01QF16_A602MaqCod[0] ;
      n602MaqCod = T01QF16_n602MaqCod[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", GXutil.rtrim( A456FasActTin));
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", GXutil.rtrim( A458FasCon));
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", GXutil.rtrim( A4286FasForMul));
      httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", GXutil.rtrim( A4299FasConPla));
      httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", GXutil.rtrim( A4903FasAcab));
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", GXutil.rtrim( A602MaqCod));
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
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''}]}");
      setEventMetadata("VALID_PRONUMLIN","{handler:'valid_Pronumlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A774ProNumLin',fld:'PRONUMLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRONUMLIN",",oparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A6437ProUltFP',fld:'PROULTFP',pic:'ZZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A4299FasConPla',fld:'FASCONPLA',pic:'@!'},{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z758ProCod'},{av:'Z774ProNumLin'},{av:'Z457FasCod'},{av:'Z6437ProUltFP'},{av:'Z460FasDsc'},{av:'Z459FasDec'},{av:'Z469FasPreSal'},{av:'Z468FasPrePie'},{av:'Z472FasVelPro'},{av:'Z464FasNumPas'},{av:'Z456FasActTin'},{av:'Z458FasCon'},{av:'Z4286FasForMul'},{av:'Z4299FasConPla'},{av:'Z4903FasAcab'},{av:'Z602MaqCod'},{av:'Z759ProDsc'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A4299FasConPla',fld:'FASCONPLA',pic:'@!'},{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A4299FasConPla',fld:'FASCONPLA',pic:'@!'},{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]}");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z457FasCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
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
      A759ProDsc = "" ;
      A460FasDsc = "" ;
      A602MaqCod = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4286FasForMul = "" ;
      A4299FasConPla = "" ;
      A4903FasAcab = "" ;
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
      Z759ProDsc = "" ;
      Z460FasDsc = "" ;
      Z459FasDec = DecimalUtil.ZERO ;
      Z472FasVelPro = DecimalUtil.ZERO ;
      Z456FasActTin = "" ;
      Z458FasCon = "" ;
      Z4286FasForMul = "" ;
      Z4299FasConPla = "" ;
      Z4903FasAcab = "" ;
      Z602MaqCod = "" ;
      T01QF6_A774ProNumLin = new short[1] ;
      T01QF6_A759ProDsc = new String[] {""} ;
      T01QF6_A460FasDsc = new String[] {""} ;
      T01QF6_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QF6_n459FasDec = new boolean[] {false} ;
      T01QF6_A469FasPreSal = new short[1] ;
      T01QF6_n469FasPreSal = new boolean[] {false} ;
      T01QF6_A468FasPrePie = new short[1] ;
      T01QF6_n468FasPrePie = new boolean[] {false} ;
      T01QF6_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QF6_n472FasVelPro = new boolean[] {false} ;
      T01QF6_A464FasNumPas = new short[1] ;
      T01QF6_n464FasNumPas = new boolean[] {false} ;
      T01QF6_A456FasActTin = new String[] {""} ;
      T01QF6_n456FasActTin = new boolean[] {false} ;
      T01QF6_A458FasCon = new String[] {""} ;
      T01QF6_n458FasCon = new boolean[] {false} ;
      T01QF6_A4286FasForMul = new String[] {""} ;
      T01QF6_n4286FasForMul = new boolean[] {false} ;
      T01QF6_A4299FasConPla = new String[] {""} ;
      T01QF6_n4299FasConPla = new boolean[] {false} ;
      T01QF6_A4903FasAcab = new String[] {""} ;
      T01QF6_n4903FasAcab = new boolean[] {false} ;
      T01QF6_A6437ProUltFP = new short[1] ;
      T01QF6_A396EmprCod = new String[] {""} ;
      T01QF6_A457FasCod = new String[] {""} ;
      T01QF6_A758ProCod = new String[] {""} ;
      T01QF6_A602MaqCod = new String[] {""} ;
      T01QF6_n602MaqCod = new boolean[] {false} ;
      T01QF4_A460FasDsc = new String[] {""} ;
      T01QF4_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QF4_n459FasDec = new boolean[] {false} ;
      T01QF4_A469FasPreSal = new short[1] ;
      T01QF4_n469FasPreSal = new boolean[] {false} ;
      T01QF4_A468FasPrePie = new short[1] ;
      T01QF4_n468FasPrePie = new boolean[] {false} ;
      T01QF4_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QF4_n472FasVelPro = new boolean[] {false} ;
      T01QF4_A464FasNumPas = new short[1] ;
      T01QF4_n464FasNumPas = new boolean[] {false} ;
      T01QF4_A456FasActTin = new String[] {""} ;
      T01QF4_n456FasActTin = new boolean[] {false} ;
      T01QF4_A458FasCon = new String[] {""} ;
      T01QF4_n458FasCon = new boolean[] {false} ;
      T01QF4_A4286FasForMul = new String[] {""} ;
      T01QF4_n4286FasForMul = new boolean[] {false} ;
      T01QF4_A4299FasConPla = new String[] {""} ;
      T01QF4_n4299FasConPla = new boolean[] {false} ;
      T01QF4_A4903FasAcab = new String[] {""} ;
      T01QF4_n4903FasAcab = new boolean[] {false} ;
      T01QF4_A602MaqCod = new String[] {""} ;
      T01QF4_n602MaqCod = new boolean[] {false} ;
      T01QF5_A759ProDsc = new String[] {""} ;
      T01QF7_A460FasDsc = new String[] {""} ;
      T01QF7_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QF7_n459FasDec = new boolean[] {false} ;
      T01QF7_A469FasPreSal = new short[1] ;
      T01QF7_n469FasPreSal = new boolean[] {false} ;
      T01QF7_A468FasPrePie = new short[1] ;
      T01QF7_n468FasPrePie = new boolean[] {false} ;
      T01QF7_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QF7_n472FasVelPro = new boolean[] {false} ;
      T01QF7_A464FasNumPas = new short[1] ;
      T01QF7_n464FasNumPas = new boolean[] {false} ;
      T01QF7_A456FasActTin = new String[] {""} ;
      T01QF7_n456FasActTin = new boolean[] {false} ;
      T01QF7_A458FasCon = new String[] {""} ;
      T01QF7_n458FasCon = new boolean[] {false} ;
      T01QF7_A4286FasForMul = new String[] {""} ;
      T01QF7_n4286FasForMul = new boolean[] {false} ;
      T01QF7_A4299FasConPla = new String[] {""} ;
      T01QF7_n4299FasConPla = new boolean[] {false} ;
      T01QF7_A4903FasAcab = new String[] {""} ;
      T01QF7_n4903FasAcab = new boolean[] {false} ;
      T01QF7_A602MaqCod = new String[] {""} ;
      T01QF7_n602MaqCod = new boolean[] {false} ;
      T01QF8_A759ProDsc = new String[] {""} ;
      T01QF9_A396EmprCod = new String[] {""} ;
      T01QF9_A758ProCod = new String[] {""} ;
      T01QF9_A774ProNumLin = new short[1] ;
      T01QF3_A774ProNumLin = new short[1] ;
      T01QF3_A6437ProUltFP = new short[1] ;
      T01QF3_A396EmprCod = new String[] {""} ;
      T01QF3_A457FasCod = new String[] {""} ;
      T01QF3_A758ProCod = new String[] {""} ;
      sMode88 = "" ;
      T01QF10_A396EmprCod = new String[] {""} ;
      T01QF10_A758ProCod = new String[] {""} ;
      T01QF10_A774ProNumLin = new short[1] ;
      T01QF11_A396EmprCod = new String[] {""} ;
      T01QF11_A758ProCod = new String[] {""} ;
      T01QF11_A774ProNumLin = new short[1] ;
      T01QF2_A774ProNumLin = new short[1] ;
      T01QF2_A6437ProUltFP = new short[1] ;
      T01QF2_A396EmprCod = new String[] {""} ;
      T01QF2_A457FasCod = new String[] {""} ;
      T01QF2_A758ProCod = new String[] {""} ;
      T01QF15_A759ProDsc = new String[] {""} ;
      T01QF16_A460FasDsc = new String[] {""} ;
      T01QF16_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QF16_n459FasDec = new boolean[] {false} ;
      T01QF16_A469FasPreSal = new short[1] ;
      T01QF16_n469FasPreSal = new boolean[] {false} ;
      T01QF16_A468FasPrePie = new short[1] ;
      T01QF16_n468FasPrePie = new boolean[] {false} ;
      T01QF16_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QF16_n472FasVelPro = new boolean[] {false} ;
      T01QF16_A464FasNumPas = new short[1] ;
      T01QF16_n464FasNumPas = new boolean[] {false} ;
      T01QF16_A456FasActTin = new String[] {""} ;
      T01QF16_n456FasActTin = new boolean[] {false} ;
      T01QF16_A458FasCon = new String[] {""} ;
      T01QF16_n458FasCon = new boolean[] {false} ;
      T01QF16_A4286FasForMul = new String[] {""} ;
      T01QF16_n4286FasForMul = new boolean[] {false} ;
      T01QF16_A4299FasConPla = new String[] {""} ;
      T01QF16_n4299FasConPla = new boolean[] {false} ;
      T01QF16_A4903FasAcab = new String[] {""} ;
      T01QF16_n4903FasAcab = new boolean[] {false} ;
      T01QF16_A602MaqCod = new String[] {""} ;
      T01QF16_n602MaqCod = new boolean[] {false} ;
      T01QF17_A396EmprCod = new String[] {""} ;
      T01QF17_A758ProCod = new String[] {""} ;
      T01QF17_A774ProNumLin = new short[1] ;
      T01QF17_A7897Dtp_Ordl = new short[1] ;
      T01QF18_A396EmprCod = new String[] {""} ;
      T01QF18_A758ProCod = new String[] {""} ;
      T01QF18_A774ProNumLin = new short[1] ;
      T01QF18_A6438ProFsaL = new short[1] ;
      T01QF19_A396EmprCod = new String[] {""} ;
      T01QF19_A758ProCod = new String[] {""} ;
      T01QF19_A774ProNumLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ758ProCod = "" ;
      ZZ457FasCod = "" ;
      ZZ460FasDsc = "" ;
      ZZ459FasDec = DecimalUtil.ZERO ;
      ZZ472FasVelPro = DecimalUtil.ZERO ;
      ZZ456FasActTin = "" ;
      ZZ458FasCon = "" ;
      ZZ4286FasForMul = "" ;
      ZZ4299FasConPla = "" ;
      ZZ4903FasAcab = "" ;
      ZZ602MaqCod = "" ;
      ZZ759ProDsc = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.prolin__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.prolin__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.prolin__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prolin__default(),
         new Object[] {
             new Object[] {
            T01QF2_A774ProNumLin, T01QF2_A6437ProUltFP, T01QF2_A396EmprCod, T01QF2_A457FasCod, T01QF2_A758ProCod
            }
            , new Object[] {
            T01QF3_A774ProNumLin, T01QF3_A6437ProUltFP, T01QF3_A396EmprCod, T01QF3_A457FasCod, T01QF3_A758ProCod
            }
            , new Object[] {
            T01QF4_A460FasDsc, T01QF4_A459FasDec, T01QF4_n459FasDec, T01QF4_A469FasPreSal, T01QF4_n469FasPreSal, T01QF4_A468FasPrePie, T01QF4_n468FasPrePie, T01QF4_A472FasVelPro, T01QF4_n472FasVelPro, T01QF4_A464FasNumPas,
            T01QF4_n464FasNumPas, T01QF4_A456FasActTin, T01QF4_n456FasActTin, T01QF4_A458FasCon, T01QF4_n458FasCon, T01QF4_A4286FasForMul, T01QF4_n4286FasForMul, T01QF4_A4299FasConPla, T01QF4_n4299FasConPla, T01QF4_A4903FasAcab,
            T01QF4_n4903FasAcab, T01QF4_A602MaqCod, T01QF4_n602MaqCod
            }
            , new Object[] {
            T01QF5_A759ProDsc
            }
            , new Object[] {
            T01QF6_A774ProNumLin, T01QF6_A759ProDsc, T01QF6_A460FasDsc, T01QF6_A459FasDec, T01QF6_n459FasDec, T01QF6_A469FasPreSal, T01QF6_n469FasPreSal, T01QF6_A468FasPrePie, T01QF6_n468FasPrePie, T01QF6_A472FasVelPro,
            T01QF6_n472FasVelPro, T01QF6_A464FasNumPas, T01QF6_n464FasNumPas, T01QF6_A456FasActTin, T01QF6_n456FasActTin, T01QF6_A458FasCon, T01QF6_n458FasCon, T01QF6_A4286FasForMul, T01QF6_n4286FasForMul, T01QF6_A4299FasConPla,
            T01QF6_n4299FasConPla, T01QF6_A4903FasAcab, T01QF6_n4903FasAcab, T01QF6_A6437ProUltFP, T01QF6_A396EmprCod, T01QF6_A457FasCod, T01QF6_A758ProCod, T01QF6_A602MaqCod, T01QF6_n602MaqCod
            }
            , new Object[] {
            T01QF7_A460FasDsc, T01QF7_A459FasDec, T01QF7_n459FasDec, T01QF7_A469FasPreSal, T01QF7_n469FasPreSal, T01QF7_A468FasPrePie, T01QF7_n468FasPrePie, T01QF7_A472FasVelPro, T01QF7_n472FasVelPro, T01QF7_A464FasNumPas,
            T01QF7_n464FasNumPas, T01QF7_A456FasActTin, T01QF7_n456FasActTin, T01QF7_A458FasCon, T01QF7_n458FasCon, T01QF7_A4286FasForMul, T01QF7_n4286FasForMul, T01QF7_A4299FasConPla, T01QF7_n4299FasConPla, T01QF7_A4903FasAcab,
            T01QF7_n4903FasAcab, T01QF7_A602MaqCod, T01QF7_n602MaqCod
            }
            , new Object[] {
            T01QF8_A759ProDsc
            }
            , new Object[] {
            T01QF9_A396EmprCod, T01QF9_A758ProCod, T01QF9_A774ProNumLin
            }
            , new Object[] {
            T01QF10_A396EmprCod, T01QF10_A758ProCod, T01QF10_A774ProNumLin
            }
            , new Object[] {
            T01QF11_A396EmprCod, T01QF11_A758ProCod, T01QF11_A774ProNumLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QF15_A759ProDsc
            }
            , new Object[] {
            T01QF16_A460FasDsc, T01QF16_A459FasDec, T01QF16_n459FasDec, T01QF16_A469FasPreSal, T01QF16_n469FasPreSal, T01QF16_A468FasPrePie, T01QF16_n468FasPrePie, T01QF16_A472FasVelPro, T01QF16_n472FasVelPro, T01QF16_A464FasNumPas,
            T01QF16_n464FasNumPas, T01QF16_A456FasActTin, T01QF16_n456FasActTin, T01QF16_A458FasCon, T01QF16_n458FasCon, T01QF16_A4286FasForMul, T01QF16_n4286FasForMul, T01QF16_A4299FasConPla, T01QF16_n4299FasConPla, T01QF16_A4903FasAcab,
            T01QF16_n4903FasAcab, T01QF16_A602MaqCod, T01QF16_n602MaqCod
            }
            , new Object[] {
            T01QF17_A396EmprCod, T01QF17_A758ProCod, T01QF17_A774ProNumLin, T01QF17_A7897Dtp_Ordl
            }
            , new Object[] {
            T01QF18_A396EmprCod, T01QF18_A758ProCod, T01QF18_A774ProNumLin, T01QF18_A6438ProFsaL
            }
            , new Object[] {
            T01QF19_A396EmprCod, T01QF19_A758ProCod, T01QF19_A774ProNumLin
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z774ProNumLin ;
   private short Z6437ProUltFP ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A774ProNumLin ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short A6437ProUltFP ;
   private short Z469FasPreSal ;
   private short Z468FasPrePie ;
   private short Z464FasNumPas ;
   private short RcdFound88 ;
   private short nIsDirty_88 ;
   private short ZZ774ProNumLin ;
   private short ZZ6437ProUltFP ;
   private short ZZ469FasPreSal ;
   private short ZZ468FasPrePie ;
   private short ZZ464FasNumPas ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtProNumLin_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtFasDec_Enabled ;
   private int edtFasPreSal_Enabled ;
   private int edtFasPrePie_Enabled ;
   private int edtFasVelPro_Enabled ;
   private int edtFasNumPas_Enabled ;
   private int edtFasActTin_Enabled ;
   private int edtFasCon_Enabled ;
   private int edtFasForMul_Enabled ;
   private int edtFasConPla_Enabled ;
   private int edtFasAcab_Enabled ;
   private int edtProUltFP_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal Z459FasDec ;
   private java.math.BigDecimal Z472FasVelPro ;
   private java.math.BigDecimal ZZ459FasDec ;
   private java.math.BigDecimal ZZ472FasVelPro ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A758ProCod ;
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
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String edtProNumLin_Internalname ;
   private String edtProNumLin_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String edtMaqCod_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Jsonclick ;
   private String edtFasDec_Internalname ;
   private String edtFasDec_Jsonclick ;
   private String edtFasPreSal_Internalname ;
   private String edtFasPreSal_Jsonclick ;
   private String edtFasPrePie_Internalname ;
   private String edtFasPrePie_Jsonclick ;
   private String edtFasVelPro_Internalname ;
   private String edtFasVelPro_Jsonclick ;
   private String edtFasNumPas_Internalname ;
   private String edtFasNumPas_Jsonclick ;
   private String edtFasActTin_Internalname ;
   private String A456FasActTin ;
   private String edtFasActTin_Jsonclick ;
   private String edtFasCon_Internalname ;
   private String A458FasCon ;
   private String edtFasCon_Jsonclick ;
   private String edtFasForMul_Internalname ;
   private String A4286FasForMul ;
   private String edtFasForMul_Jsonclick ;
   private String edtFasConPla_Internalname ;
   private String A4299FasConPla ;
   private String edtFasConPla_Jsonclick ;
   private String edtFasAcab_Internalname ;
   private String A4903FasAcab ;
   private String edtFasAcab_Jsonclick ;
   private String edtProUltFP_Internalname ;
   private String edtProUltFP_Jsonclick ;
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
   private String Z759ProDsc ;
   private String Z460FasDsc ;
   private String Z456FasActTin ;
   private String Z458FasCon ;
   private String Z4286FasForMul ;
   private String Z4299FasConPla ;
   private String Z4903FasAcab ;
   private String Z602MaqCod ;
   private String sMode88 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ758ProCod ;
   private String ZZ457FasCod ;
   private String ZZ460FasDsc ;
   private String ZZ456FasActTin ;
   private String ZZ458FasCon ;
   private String ZZ4286FasForMul ;
   private String ZZ4299FasConPla ;
   private String ZZ4903FasAcab ;
   private String ZZ602MaqCod ;
   private String ZZ759ProDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n602MaqCod ;
   private boolean n459FasDec ;
   private boolean n469FasPreSal ;
   private boolean n468FasPrePie ;
   private boolean n472FasVelPro ;
   private boolean n464FasNumPas ;
   private boolean n456FasActTin ;
   private boolean n458FasCon ;
   private boolean n4286FasForMul ;
   private boolean n4299FasConPla ;
   private boolean n4903FasAcab ;
   private IDataStoreProvider pr_default ;
   private short[] T01QF6_A774ProNumLin ;
   private String[] T01QF6_A759ProDsc ;
   private String[] T01QF6_A460FasDsc ;
   private java.math.BigDecimal[] T01QF6_A459FasDec ;
   private boolean[] T01QF6_n459FasDec ;
   private short[] T01QF6_A469FasPreSal ;
   private boolean[] T01QF6_n469FasPreSal ;
   private short[] T01QF6_A468FasPrePie ;
   private boolean[] T01QF6_n468FasPrePie ;
   private java.math.BigDecimal[] T01QF6_A472FasVelPro ;
   private boolean[] T01QF6_n472FasVelPro ;
   private short[] T01QF6_A464FasNumPas ;
   private boolean[] T01QF6_n464FasNumPas ;
   private String[] T01QF6_A456FasActTin ;
   private boolean[] T01QF6_n456FasActTin ;
   private String[] T01QF6_A458FasCon ;
   private boolean[] T01QF6_n458FasCon ;
   private String[] T01QF6_A4286FasForMul ;
   private boolean[] T01QF6_n4286FasForMul ;
   private String[] T01QF6_A4299FasConPla ;
   private boolean[] T01QF6_n4299FasConPla ;
   private String[] T01QF6_A4903FasAcab ;
   private boolean[] T01QF6_n4903FasAcab ;
   private short[] T01QF6_A6437ProUltFP ;
   private String[] T01QF6_A396EmprCod ;
   private String[] T01QF6_A457FasCod ;
   private String[] T01QF6_A758ProCod ;
   private String[] T01QF6_A602MaqCod ;
   private boolean[] T01QF6_n602MaqCod ;
   private String[] T01QF4_A460FasDsc ;
   private java.math.BigDecimal[] T01QF4_A459FasDec ;
   private boolean[] T01QF4_n459FasDec ;
   private short[] T01QF4_A469FasPreSal ;
   private boolean[] T01QF4_n469FasPreSal ;
   private short[] T01QF4_A468FasPrePie ;
   private boolean[] T01QF4_n468FasPrePie ;
   private java.math.BigDecimal[] T01QF4_A472FasVelPro ;
   private boolean[] T01QF4_n472FasVelPro ;
   private short[] T01QF4_A464FasNumPas ;
   private boolean[] T01QF4_n464FasNumPas ;
   private String[] T01QF4_A456FasActTin ;
   private boolean[] T01QF4_n456FasActTin ;
   private String[] T01QF4_A458FasCon ;
   private boolean[] T01QF4_n458FasCon ;
   private String[] T01QF4_A4286FasForMul ;
   private boolean[] T01QF4_n4286FasForMul ;
   private String[] T01QF4_A4299FasConPla ;
   private boolean[] T01QF4_n4299FasConPla ;
   private String[] T01QF4_A4903FasAcab ;
   private boolean[] T01QF4_n4903FasAcab ;
   private String[] T01QF4_A602MaqCod ;
   private boolean[] T01QF4_n602MaqCod ;
   private String[] T01QF5_A759ProDsc ;
   private String[] T01QF7_A460FasDsc ;
   private java.math.BigDecimal[] T01QF7_A459FasDec ;
   private boolean[] T01QF7_n459FasDec ;
   private short[] T01QF7_A469FasPreSal ;
   private boolean[] T01QF7_n469FasPreSal ;
   private short[] T01QF7_A468FasPrePie ;
   private boolean[] T01QF7_n468FasPrePie ;
   private java.math.BigDecimal[] T01QF7_A472FasVelPro ;
   private boolean[] T01QF7_n472FasVelPro ;
   private short[] T01QF7_A464FasNumPas ;
   private boolean[] T01QF7_n464FasNumPas ;
   private String[] T01QF7_A456FasActTin ;
   private boolean[] T01QF7_n456FasActTin ;
   private String[] T01QF7_A458FasCon ;
   private boolean[] T01QF7_n458FasCon ;
   private String[] T01QF7_A4286FasForMul ;
   private boolean[] T01QF7_n4286FasForMul ;
   private String[] T01QF7_A4299FasConPla ;
   private boolean[] T01QF7_n4299FasConPla ;
   private String[] T01QF7_A4903FasAcab ;
   private boolean[] T01QF7_n4903FasAcab ;
   private String[] T01QF7_A602MaqCod ;
   private boolean[] T01QF7_n602MaqCod ;
   private String[] T01QF8_A759ProDsc ;
   private String[] T01QF9_A396EmprCod ;
   private String[] T01QF9_A758ProCod ;
   private short[] T01QF9_A774ProNumLin ;
   private short[] T01QF3_A774ProNumLin ;
   private short[] T01QF3_A6437ProUltFP ;
   private String[] T01QF3_A396EmprCod ;
   private String[] T01QF3_A457FasCod ;
   private String[] T01QF3_A758ProCod ;
   private String[] T01QF10_A396EmprCod ;
   private String[] T01QF10_A758ProCod ;
   private short[] T01QF10_A774ProNumLin ;
   private String[] T01QF11_A396EmprCod ;
   private String[] T01QF11_A758ProCod ;
   private short[] T01QF11_A774ProNumLin ;
   private short[] T01QF2_A774ProNumLin ;
   private short[] T01QF2_A6437ProUltFP ;
   private String[] T01QF2_A396EmprCod ;
   private String[] T01QF2_A457FasCod ;
   private String[] T01QF2_A758ProCod ;
   private String[] T01QF15_A759ProDsc ;
   private String[] T01QF16_A460FasDsc ;
   private java.math.BigDecimal[] T01QF16_A459FasDec ;
   private boolean[] T01QF16_n459FasDec ;
   private short[] T01QF16_A469FasPreSal ;
   private boolean[] T01QF16_n469FasPreSal ;
   private short[] T01QF16_A468FasPrePie ;
   private boolean[] T01QF16_n468FasPrePie ;
   private java.math.BigDecimal[] T01QF16_A472FasVelPro ;
   private boolean[] T01QF16_n472FasVelPro ;
   private short[] T01QF16_A464FasNumPas ;
   private boolean[] T01QF16_n464FasNumPas ;
   private String[] T01QF16_A456FasActTin ;
   private boolean[] T01QF16_n456FasActTin ;
   private String[] T01QF16_A458FasCon ;
   private boolean[] T01QF16_n458FasCon ;
   private String[] T01QF16_A4286FasForMul ;
   private boolean[] T01QF16_n4286FasForMul ;
   private String[] T01QF16_A4299FasConPla ;
   private boolean[] T01QF16_n4299FasConPla ;
   private String[] T01QF16_A4903FasAcab ;
   private boolean[] T01QF16_n4903FasAcab ;
   private String[] T01QF16_A602MaqCod ;
   private boolean[] T01QF16_n602MaqCod ;
   private String[] T01QF17_A396EmprCod ;
   private String[] T01QF17_A758ProCod ;
   private short[] T01QF17_A774ProNumLin ;
   private short[] T01QF17_A7897Dtp_Ordl ;
   private String[] T01QF18_A396EmprCod ;
   private String[] T01QF18_A758ProCod ;
   private short[] T01QF18_A774ProNumLin ;
   private short[] T01QF18_A6438ProFsaL ;
   private String[] T01QF19_A396EmprCod ;
   private String[] T01QF19_A758ProCod ;
   private short[] T01QF19_A774ProNumLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class prolin__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class prolin__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class prolin__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class prolin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QF2", "SELECT ProNumLin, ProUltFP, EmprCod, FasCod, ProCod FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?  FOR UPDATE OF ProUltFP, FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QF3", "SELECT ProNumLin, ProUltFP, EmprCod, FasCod, ProCod FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QF4", "SELECT FasDsc, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasForMul, FasConPla, FasAcab, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QF5", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QF6", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProNumLin, T2.ProDsc, T3.FasDsc, T3.FasDec, T3.FasPreSal, T3.FasPrePie, T3.FasVelPro, T3.FasNumPas, T3.FasActTin, T3.FasCon, T3.FasForMul, T3.FasConPla, T3.FasAcab, TM1.ProUltFP, TM1.EmprCod, TM1.FasCod, TM1.ProCod, T3.MaqCod FROM ((TXPPROLIN TM1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = TM1.EmprCod AND T2.ProCod = TM1.ProCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = TM1.EmprCod AND T3.FasCod = TM1.FasCod) WHERE TM1.EmprCod = ? and TM1.ProCod = ? and TM1.ProNumLin = ? ORDER BY TM1.EmprCod, TM1.ProCod, TM1.ProNumLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QF7", "SELECT FasDsc, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasForMul, FasConPla, FasAcab, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QF8", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QF9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QF10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE ( EmprCod > ? or EmprCod = ? and ProCod > ? or ProCod = ? and EmprCod = ? and ProNumLin > ?) ORDER BY EmprCod, ProCod, ProNumLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QF11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE ( EmprCod < ? or EmprCod = ? and ProCod < ? or ProCod = ? and EmprCod = ? and ProNumLin < ?) ORDER BY EmprCod DESC, ProCod DESC, ProNumLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QF12", "INSERT INTO TXPPROLIN(ProNumLin, ProUltFP, EmprCod, FasCod, ProCod, ProFasNot, Dtp_FasDsc, Dtp_Tpp, Dtp_H2OReh, Dtp_TpCost, Dtp_UnpLt, Dtp_UOrd) VALUES(?, ?, ?, ?, ?, ' ', ' ', 0, ' ', 0, 0, 0)", GX_NOMASK, "TXPPROLIN")
         ,new UpdateCursor("T01QF13", "UPDATE TXPPROLIN SET ProUltFP=?, FasCod=?  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK, "TXPPROLIN")
         ,new UpdateCursor("T01QF14", "DELETE FROM TXPPROLIN  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK, "TXPPROLIN")
         ,new ForEachCursor("T01QF15", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QF16", "SELECT FasDsc, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasForMul, FasConPla, FasAcab, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QF17", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl FROM TXPDT002 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QF18", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QF19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProCod, ProNumLin FROM TXPPROLIN ORDER BY EmprCod, ProCod, ProNumLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14);
               ((String[]) buf[24])[0] = rslt.getString(15, 3);
               ((String[]) buf[25])[0] = rslt.getString(16, 8);
               ((String[]) buf[26])[0] = rslt.getString(17, 8);
               ((String[]) buf[27])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

