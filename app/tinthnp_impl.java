package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tinthnp_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
      {
         httpContext.setAjaxEventMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtinthnp_level1item") == 0 )
      {
         gxnrgridtinthnp_level1item_newrow_invoke( ) ;
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A599MaqAny = (short)(GXutil.lval( httpContext.GetPar( "MaqAny"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
            A614MaqMes = (byte)(GXutil.lval( httpContext.GetPar( "MaqMes"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
         }
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
         Form.getMeta().addItem("description", httpContext.getMessage( "INTERVALOS HORAS NO PROD/DIA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMaqHNPMes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridtinthnp_level1item_newrow_invoke( )
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
      gxnrgridtinthnp_level1item_newrow( ) ;
      /* End function gxnrGridtinthnp_level1item_newrow_invoke */
   }

   public tinthnp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tinthnp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tinthnp_impl.class ));
   }

   public tinthnp_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "INTERVALOS HORAS NO PROD/DIA", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TINTHNP.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINTHNP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINTHNP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINTHNP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINTHNP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TINTHNP.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINTHNP.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINTHNP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqAny_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqAny_Internalname, httpContext.getMessage( "MaqAny", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqAny_Internalname, GXutil.ltrim( localUtil.ntoc( A599MaqAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A599MaqAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A599MaqAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqAny_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINTHNP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqMes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqMes_Internalname, httpContext.getMessage( "MaqMes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqMes_Internalname, GXutil.ltrim( localUtil.ntoc( A614MaqMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqMes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A614MaqMes), "99") : localUtil.format( DecimalUtil.doubleToDec(A614MaqMes), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqMes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqMes_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINTHNP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqDsc_Internalname, httpContext.getMessage( "Descripcion Maquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINTHNP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqHNPMes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqHNPMes_Internalname, httpContext.getMessage( "Días Horas No Productivas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqHNPMes_Internalname, A610MaqHNPMes, GXutil.rtrim( localUtil.format( A610MaqHNPMes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqHNPMes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqHNPMes_Enabled, 0, "text", "", 63, "chr", 1, "row", 63, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Descripcion63", "left", true, "", "HLP_TINTHNP.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINTHNP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLevel1table_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TINTHNP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtinthnp_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINTHNP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINTHNP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINTHNP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtinthnp_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol73( ) ;
      nGXsfl_73_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount748 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_748 = (short)(1) ;
            scanStartOD748( ) ;
            while ( RcdFound748 != 0 )
            {
               init_level_properties748( ) ;
               getByPrimaryKeyOD748( ) ;
               addRowOD748( ) ;
               scanNextOD748( ) ;
            }
            scanEndOD748( ) ;
            nBlankRcdCount748 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalOD748( ) ;
         standaloneModalOD748( ) ;
         sMode748 = Gx_mode ;
         while ( nGXsfl_73_idx < nRC_GXsfl_73 )
         {
            bGXsfl_73_Refreshing = true ;
            readRowOD748( ) ;
            edtMaqHnpDia_Title = httpContext.cgiGet( "MAQHNPDIA_"+sGXsfl_73_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpDia_Internalname, "Title", edtMaqHnpDia_Title, !bGXsfl_73_Refreshing);
            edtMaqHnpDia_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPDIA_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpDia_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtMaqHnpI1i_Title = httpContext.cgiGet( "MAQHNPI1I_"+sGXsfl_73_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI1i_Internalname, "Title", edtMaqHnpI1i_Title, !bGXsfl_73_Refreshing);
            edtMaqHnpI1i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPI1I_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI1i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpI1i_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtMaqHnpI1f_Title = httpContext.cgiGet( "MAQHNPI1F_"+sGXsfl_73_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI1f_Internalname, "Title", edtMaqHnpI1f_Title, !bGXsfl_73_Refreshing);
            edtMaqHnpI1f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPI1F_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI1f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpI1f_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtHNPInterv1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HNPINTERV1_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHNPInterv1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHNPInterv1_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtMaqHnpI2i_Title = httpContext.cgiGet( "MAQHNPI2I_"+sGXsfl_73_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI2i_Internalname, "Title", edtMaqHnpI2i_Title, !bGXsfl_73_Refreshing);
            edtMaqHnpI2i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPI2I_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI2i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpI2i_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtMaqHnpI2f_Title = httpContext.cgiGet( "MAQHNPI2F_"+sGXsfl_73_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI2f_Internalname, "Title", edtMaqHnpI2f_Title, !bGXsfl_73_Refreshing);
            edtMaqHnpI2f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPI2F_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI2f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpI2f_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtHNPInterv2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HNPINTERV2_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHNPInterv2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHNPInterv2_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtMaqHnpI3i_Title = httpContext.cgiGet( "MAQHNPI3I_"+sGXsfl_73_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI3i_Internalname, "Title", edtMaqHnpI3i_Title, !bGXsfl_73_Refreshing);
            edtMaqHnpI3i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPI3I_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI3i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpI3i_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtMaqHnpI3f_Title = httpContext.cgiGet( "MAQHNPI3F_"+sGXsfl_73_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI3f_Internalname, "Title", edtMaqHnpI3f_Title, !bGXsfl_73_Refreshing);
            edtMaqHnpI3f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPI3F_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI3f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpI3f_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtHNPInterv3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HNPINTERV3_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHNPInterv3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHNPInterv3_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtMaqHNPTota_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPTOTA_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqHNPTota_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHNPTota_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            if ( ( nRcdExists_748 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalOD748( ) ;
            }
            sendRowOD748( ) ;
            bGXsfl_73_Refreshing = false ;
         }
         Gx_mode = sMode748 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount748 = (short)(5) ;
         nRcdExists_748 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartOD748( ) ;
            while ( RcdFound748 != 0 )
            {
               sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_73748( ) ;
               init_level_properties748( ) ;
               standaloneNotModalOD748( ) ;
               getByPrimaryKeyOD748( ) ;
               standaloneModalOD748( ) ;
               addRowOD748( ) ;
               scanNextOD748( ) ;
            }
            scanEndOD748( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode748 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_73748( ) ;
      initAllOD748( ) ;
      init_level_properties748( ) ;
      nRcdExists_748 = (short)(0) ;
      nIsMod_748 = (short)(0) ;
      nRcdDeleted_748 = (short)(0) ;
      nBlankRcdCount748 = (short)(nBlankRcdUsr748+nBlankRcdCount748) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount748 > 0 )
      {
         standaloneNotModalOD748( ) ;
         standaloneModalOD748( ) ;
         addRowOD748( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMaqHnpDia_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount748 = (short)(nBlankRcdCount748-1) ;
      }
      Gx_mode = sMode748 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtinthnp_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtinthnp_level1item", Gridtinthnp_level1itemContainer, subGridtinthnp_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtinthnp_level1itemContainerData", Gridtinthnp_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtinthnp_level1itemContainerData"+"V", Gridtinthnp_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtinthnp_level1itemContainerData"+"V"+"\" value='"+Gridtinthnp_level1itemContainer.GridValuesHidden()+"'/>") ;
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
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11OD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
            Z599MaqAny = (short)(localUtil.ctol( httpContext.cgiGet( "Z599MaqAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z614MaqMes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z614MaqMes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z610MaqHNPMes = httpContext.cgiGet( "Z610MaqHNPMes") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_73 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_73"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV26Lit6 = httpContext.cgiGet( "vLIT6") ;
            AV27Lit7 = httpContext.cgiGet( "vLIT7") ;
            AV28Lit8 = httpContext.cgiGet( "vLIT8") ;
            AV29Lit9 = httpContext.cgiGet( "vLIT9") ;
            AV30Lit10 = httpContext.cgiGet( "vLIT10") ;
            AV31Lit11 = httpContext.cgiGet( "vLIT11") ;
            AV32Lit12 = httpContext.cgiGet( "vLIT12") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A599MaqAny = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
            A614MaqMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
            A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
            n606MaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
            A610MaqHNPMes = httpContext.cgiGet( edtMaqHNPMes_Internalname) ;
            n610MaqHNPMes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A610MaqHNPMes", A610MaqHNPMes);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
               A602MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A599MaqAny = (short)(GXutil.lval( httpContext.GetPar( "MaqAny"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A599MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A599MaqAny), 4, 0));
               A614MaqMes = (byte)(GXutil.lval( httpContext.GetPar( "MaqMes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A614MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A614MaqMes), 2, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               getEqualNoModal( ) ;
               standaloneModal( ) ;
            }
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e11OD2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
            initAllOD67( ) ;
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
      disableAttributesOD67( ) ;
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

   public void confirm_OD748( )
   {
      nGXsfl_73_idx = 0 ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         readRowOD748( ) ;
         if ( ( nRcdExists_748 != 0 ) || ( nIsMod_748 != 0 ) )
         {
            getKeyOD748( ) ;
            if ( ( nRcdExists_748 == 0 ) && ( nRcdDeleted_748 == 0 ) )
            {
               if ( RcdFound748 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateOD748( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableOD748( ) ;
                     closeExtendedTableCursorsOD748( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MAQHNPDIA_" + sGXsfl_73_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMaqHnpDia_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound748 != 0 )
               {
                  if ( nRcdDeleted_748 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyOD748( ) ;
                     loadOD748( ) ;
                     beforeValidateOD748( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsOD748( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_748 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateOD748( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableOD748( ) ;
                           closeExtendedTableCursorsOD748( ) ;
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
                  if ( nRcdDeleted_748 == 0 )
                  {
                     GXCCtl = "MAQHNPDIA_" + sGXsfl_73_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqHnpDia_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMaqHnpDia_Internalname, GXutil.ltrim( localUtil.ntoc( A5123MaqHnpDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqHnpI1i_Internalname, localUtil.ttoc( A5124MaqHnpI1i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqHnpI1f_Internalname, localUtil.ttoc( A5125MaqHnpI1f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHNPInterv1_Internalname, GXutil.ltrim( localUtil.ntoc( A13684HNPInterv1, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqHnpI2i_Internalname, localUtil.ttoc( A5126MaqHnpI2i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqHnpI2f_Internalname, localUtil.ttoc( A5127MaqHnpI2f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHNPInterv2_Internalname, GXutil.ltrim( localUtil.ntoc( A13685HNPInterv2, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqHnpI3i_Internalname, localUtil.ttoc( A5128MaqHnpI3i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqHnpI3f_Internalname, localUtil.ttoc( A5129MaqHnpI3f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHNPInterv3_Internalname, GXutil.ltrim( localUtil.ntoc( A13686HNPInterv3, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqHNPTota_Internalname, GXutil.ltrim( localUtil.ntoc( A13683MaqHNPTota, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5123MaqHnpDia_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z5123MaqHnpDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5124MaqHnpI1i_"+sGXsfl_73_idx, localUtil.ttoc( Z5124MaqHnpI1i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5125MaqHnpI1f_"+sGXsfl_73_idx, localUtil.ttoc( Z5125MaqHnpI1f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5126MaqHnpI2i_"+sGXsfl_73_idx, localUtil.ttoc( Z5126MaqHnpI2i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5127MaqHnpI2f_"+sGXsfl_73_idx, localUtil.ttoc( Z5127MaqHnpI2f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5128MaqHnpI3i_"+sGXsfl_73_idx, localUtil.ttoc( Z5128MaqHnpI3i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5129MaqHnpI3f_"+sGXsfl_73_idx, localUtil.ttoc( Z5129MaqHnpI3f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_748_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_748, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_748_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_748, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_748_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_748, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_748 != 0 )
         {
            httpContext.changePostValue( "MAQHNPDIA_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpDia_Title)) ;
            httpContext.changePostValue( "MAQHNPDIA_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpDia_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQHNPI1I_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI1i_Title)) ;
            httpContext.changePostValue( "MAQHNPI1I_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI1i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQHNPI1F_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI1f_Title)) ;
            httpContext.changePostValue( "MAQHNPI1F_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI1f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HNPINTERV1_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHNPInterv1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQHNPI2I_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI2i_Title)) ;
            httpContext.changePostValue( "MAQHNPI2I_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI2i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQHNPI2F_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI2f_Title)) ;
            httpContext.changePostValue( "MAQHNPI2F_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI2f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HNPINTERV2_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHNPInterv2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQHNPI3I_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI3i_Title)) ;
            httpContext.changePostValue( "MAQHNPI3I_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI3i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQHNPI3F_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI3f_Title)) ;
            httpContext.changePostValue( "MAQHNPI3F_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI3f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HNPINTERV3_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHNPInterv3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQHNPTOTA_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHNPTota_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionOD0( )
   {
   }

   public void e11OD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char1, GXv_char2, GXv_char3) ;
      tinthnp_impl.this.A396EmprCod = GXv_char1[0] ;
      tinthnp_impl.this.AV16EmprNom = GXv_char2[0] ;
      tinthnp_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV20LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tinthnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV20LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20LitFe", AV20LitFe);
      GXt_char4 = AV19Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      tinthnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV19Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit0", AV19Lit0);
      GXt_char4 = AV21Lit1 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2193_", ""), (byte)(99), GXv_char3) ;
      tinthnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV21Lit1 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit1", AV21Lit1);
      GXt_char4 = AV22Lit2 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char3) ;
      tinthnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV22Lit2 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit2", AV22Lit2);
      GXt_char4 = AV23Lit3 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN113_", ""), (byte)(99), GXv_char3) ;
      tinthnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV23Lit3 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit3", AV23Lit3);
      GXt_char4 = AV24Lit4 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN112_", ""), (byte)(99), GXv_char3) ;
      tinthnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV24Lit4 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit4", AV24Lit4);
      GXt_char4 = AV25Lit5 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN820_", ""), (byte)(99), GXv_char3) ;
      tinthnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV25Lit5 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit5", AV25Lit5);
      GXt_char4 = AV26Lit6 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT406_", ""), (byte)(99), GXv_char3) ;
      tinthnp_impl.this.GXt_char4 = GXv_char3[0] ;
      AV26Lit6 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit6", AV26Lit6);
      GXt_char4 = AV27Lit7 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN468_", ""), (byte)(99), GXv_char3) ;
      tinthnp_impl.this.GXt_char4 = GXv_char3[0] ;
      GXt_char5 = AV27Lit7 ;
      GXv_char2[0] = GXt_char5 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1053_", ""), (byte)(99), GXv_char2) ;
      tinthnp_impl.this.GXt_char5 = GXv_char2[0] ;
      AV27Lit7 = GXutil.trim( GXt_char4) + " " + GXutil.trim( GXt_char5) + " 1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit7", AV27Lit7);
      GXt_char5 = AV28Lit8 ;
      GXv_char3[0] = GXt_char5 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN469_", ""), (byte)(99), GXv_char3) ;
      tinthnp_impl.this.GXt_char5 = GXv_char3[0] ;
      GXt_char4 = AV28Lit8 ;
      GXv_char2[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1053_", ""), (byte)(99), GXv_char2) ;
      tinthnp_impl.this.GXt_char4 = GXv_char2[0] ;
      AV28Lit8 = GXutil.trim( GXt_char5) + " " + GXutil.trim( GXt_char4) + " 1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit8", AV28Lit8);
      GXt_char5 = AV29Lit9 ;
      GXv_char3[0] = GXt_char5 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN468_", ""), (byte)(99), GXv_char3) ;
      tinthnp_impl.this.GXt_char5 = GXv_char3[0] ;
      GXt_char4 = AV29Lit9 ;
      GXv_char2[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1053_", ""), (byte)(99), GXv_char2) ;
      tinthnp_impl.this.GXt_char4 = GXv_char2[0] ;
      AV29Lit9 = GXutil.trim( GXt_char5) + " " + GXutil.trim( GXt_char4) + " 2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit9", AV29Lit9);
      GXt_char5 = AV30Lit10 ;
      GXv_char3[0] = GXt_char5 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN469_", ""), (byte)(99), GXv_char3) ;
      tinthnp_impl.this.GXt_char5 = GXv_char3[0] ;
      GXt_char4 = AV30Lit10 ;
      GXv_char2[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1053_", ""), (byte)(99), GXv_char2) ;
      tinthnp_impl.this.GXt_char4 = GXv_char2[0] ;
      AV30Lit10 = GXutil.trim( GXt_char5) + " " + GXutil.trim( GXt_char4) + " 2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit10", AV30Lit10);
      GXt_char5 = AV31Lit11 ;
      GXv_char3[0] = GXt_char5 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN468_", ""), (byte)(99), GXv_char3) ;
      tinthnp_impl.this.GXt_char5 = GXv_char3[0] ;
      GXt_char4 = AV31Lit11 ;
      GXv_char2[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1053_", ""), (byte)(99), GXv_char2) ;
      tinthnp_impl.this.GXt_char4 = GXv_char2[0] ;
      AV31Lit11 = GXutil.trim( GXt_char5) + " " + GXutil.trim( GXt_char4) + " 3" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit11", AV31Lit11);
      GXt_char5 = AV32Lit12 ;
      GXv_char3[0] = GXt_char5 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN469_", ""), (byte)(99), GXv_char3) ;
      tinthnp_impl.this.GXt_char5 = GXv_char3[0] ;
      GXt_char4 = AV32Lit12 ;
      GXv_char2[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1053_", ""), (byte)(99), GXv_char2) ;
      tinthnp_impl.this.GXt_char4 = GXv_char2[0] ;
      AV32Lit12 = GXutil.trim( GXt_char5) + " " + GXutil.trim( GXt_char4) + " 3" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit12", AV32Lit12);
   }

   public void zmOD67( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z610MaqHNPMes = T00OD5_A610MaqHNPMes[0] ;
         }
         else
         {
            Z610MaqHNPMes = A610MaqHNPMes ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z599MaqAny = A599MaqAny ;
         Z614MaqMes = A614MaqMes ;
         Z610MaqHNPMes = A610MaqHNPMes ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z407EmprNom = A407EmprNom ;
         Z606MaqDsc = A606MaqDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      /* Using cursor T00OD6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00OD6_A407EmprNom[0] ;
      n407EmprNom = T00OD6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T00OD7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
      }
      A606MaqDsc = T00OD7_A606MaqDsc[0] ;
      n606MaqDsc = T00OD7_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      pr_default.close(5);
      edtMaqHnpDia_Title = AV26Lit6 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpDia_Internalname, "Title", edtMaqHnpDia_Title, !bGXsfl_73_Refreshing);
      edtMaqHnpI1i_Title = AV27Lit7 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI1i_Internalname, "Title", edtMaqHnpI1i_Title, !bGXsfl_73_Refreshing);
      edtMaqHnpI1f_Title = AV28Lit8 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI1f_Internalname, "Title", edtMaqHnpI1f_Title, !bGXsfl_73_Refreshing);
      edtMaqHnpI2i_Title = AV29Lit9 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI2i_Internalname, "Title", edtMaqHnpI2i_Title, !bGXsfl_73_Refreshing);
      edtMaqHnpI2f_Title = AV30Lit10 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI2f_Internalname, "Title", edtMaqHnpI2f_Title, !bGXsfl_73_Refreshing);
      edtMaqHnpI3i_Title = AV31Lit11 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI3i_Internalname, "Title", edtMaqHnpI3i_Title, !bGXsfl_73_Refreshing);
      edtMaqHnpI3f_Title = AV32Lit12 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI3f_Internalname, "Title", edtMaqHnpI3f_Title, !bGXsfl_73_Refreshing);
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

   public void loadOD67( )
   {
      /* Using cursor T00OD8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound67 = (short)(1) ;
         A606MaqDsc = T00OD8_A606MaqDsc[0] ;
         n606MaqDsc = T00OD8_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         A610MaqHNPMes = T00OD8_A610MaqHNPMes[0] ;
         n610MaqHNPMes = T00OD8_n610MaqHNPMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A610MaqHNPMes", A610MaqHNPMes);
         A407EmprNom = T00OD8_A407EmprNom[0] ;
         n407EmprNom = T00OD8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zmOD67( -14) ;
      }
      pr_default.close(6);
      onLoadActionsOD67( ) ;
   }

   public void onLoadActionsOD67( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void checkExtendedTableOD67( )
   {
      nIsDirty_67 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void closeExtendedTableCursorsOD67( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyOD67( )
   {
      /* Using cursor T00OD9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound67 = (short)(1) ;
      }
      else
      {
         RcdFound67 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00OD5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
      if ( (pr_default.getStatus(3) != 101) && ( T00OD5_A599MaqAny[0] == A599MaqAny ) && ( T00OD5_A614MaqMes[0] == A614MaqMes ) && ( GXutil.strcmp(T00OD5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00OD5_A602MaqCod[0], A602MaqCod) == 0 ) )
      {
         zmOD67( 14) ;
         RcdFound67 = (short)(1) ;
         A610MaqHNPMes = T00OD5_A610MaqHNPMes[0] ;
         n610MaqHNPMes = T00OD5_n610MaqHNPMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A610MaqHNPMes", A610MaqHNPMes);
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z599MaqAny = A599MaqAny ;
         Z614MaqMes = A614MaqMes ;
         sMode67 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadOD67( ) ;
         if ( AnyError == 1 )
         {
            RcdFound67 = (short)(0) ;
            initializeNonKeyOD67( ) ;
         }
         Gx_mode = sMode67 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound67 = (short)(0) ;
         initializeNonKeyOD67( ) ;
         sMode67 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode67 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyOD67( ) ;
      if ( RcdFound67 == 0 )
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
      RcdFound67 = (short)(0) ;
      /* Using cursor T00OD10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T00OD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00OD10_A602MaqCod[0], A602MaqCod) == 0 ) && ( T00OD10_A599MaqAny[0] == A599MaqAny ) && ( T00OD10_A614MaqMes[0] == A614MaqMes ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T00OD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00OD10_A602MaqCod[0], A602MaqCod) == 0 ) && ( T00OD10_A599MaqAny[0] == A599MaqAny ) && ( T00OD10_A614MaqMes[0] == A614MaqMes ) )
         {
            RcdFound67 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound67 = (short)(0) ;
      /* Using cursor T00OD11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00OD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00OD11_A602MaqCod[0], A602MaqCod) == 0 ) && ( T00OD11_A599MaqAny[0] == A599MaqAny ) && ( T00OD11_A614MaqMes[0] == A614MaqMes ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00OD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00OD11_A602MaqCod[0], A602MaqCod) == 0 ) && ( T00OD11_A599MaqAny[0] == A599MaqAny ) && ( T00OD11_A614MaqMes[0] == A614MaqMes ) )
         {
            RcdFound67 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyOD67( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMaqHNPMes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertOD67( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound67 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A599MaqAny != Z599MaqAny ) || ( A614MaqMes != Z614MaqMes ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMaqHNPMes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateOD67( ) ;
               GX_FocusControl = edtMaqHNPMes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A599MaqAny != Z599MaqAny ) || ( A614MaqMes != Z614MaqMes ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMaqHNPMes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertOD67( ) ;
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
                  GX_FocusControl = edtMaqHNPMes_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertOD67( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A599MaqAny != Z599MaqAny ) || ( A614MaqMes != Z614MaqMes ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMaqHNPMes_Internalname ;
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
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqHNPMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartOD67( ) ;
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqHNPMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndOD67( ) ;
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
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqHNPMes_Internalname ;
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
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqHNPMes_Internalname ;
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
      scanStartOD67( ) ;
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound67 != 0 )
         {
            scanNextOD67( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqHNPMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndOD67( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyOD67( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00OD4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQHNP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z610MaqHNPMes, T00OD4_A610MaqHNPMes[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z610MaqHNPMes, T00OD4_A610MaqHNPMes[0]) != 0 )
            {
               GXutil.writeLogln("tinthnp:[seudo value changed for attri]"+"MaqHNPMes");
               GXutil.writeLogRaw("Old: ",Z610MaqHNPMes);
               GXutil.writeLogRaw("Current: ",T00OD4_A610MaqHNPMes[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQHNP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertOD67( )
   {
      beforeValidateOD67( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableOD67( ) ;
      }
      if ( AnyError == 0 )
      {
         zmOD67( 0) ;
         checkOptimisticConcurrencyOD67( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmOD67( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertOD67( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00OD12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Boolean.valueOf(n610MaqHNPMes), A610MaqHNPMes, A396EmprCod, A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQHNP");
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
                        processLevelOD67( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionOD0( ) ;
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
            loadOD67( ) ;
         }
         endLevelOD67( ) ;
      }
      closeExtendedTableCursorsOD67( ) ;
   }

   public void updateOD67( )
   {
      beforeValidateOD67( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableOD67( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyOD67( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmOD67( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateOD67( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00OD13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n610MaqHNPMes), A610MaqHNPMes, A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQHNP");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQHNP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateOD67( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelOD67( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionOD0( ) ;
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
         endLevelOD67( ) ;
      }
      closeExtendedTableCursorsOD67( ) ;
   }

   public void deferredUpdateOD67( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateOD67( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyOD67( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsOD67( ) ;
         afterConfirmOD67( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteOD67( ) ;
            if ( AnyError == 0 )
            {
               scanStartOD748( ) ;
               while ( RcdFound748 != 0 )
               {
                  getByPrimaryKeyOD748( ) ;
                  deleteOD748( ) ;
                  scanNextOD748( ) ;
               }
               scanEndOD748( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00OD14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQHNP");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound67 == 0 )
                        {
                           initAllOD67( ) ;
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
                        resetCaptionOD0( ) ;
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
      sMode67 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelOD67( ) ;
      Gx_mode = sMode67 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsOD67( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
      }
   }

   public void processNestedLevelOD748( )
   {
      nGXsfl_73_idx = 0 ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         readRowOD748( ) ;
         if ( ( nRcdExists_748 != 0 ) || ( nIsMod_748 != 0 ) )
         {
            standaloneNotModalOD748( ) ;
            getKeyOD748( ) ;
            if ( ( nRcdExists_748 == 0 ) && ( nRcdDeleted_748 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertOD748( ) ;
            }
            else
            {
               if ( RcdFound748 != 0 )
               {
                  if ( ( nRcdDeleted_748 != 0 ) && ( nRcdExists_748 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteOD748( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_748 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateOD748( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_748 == 0 )
                  {
                     GXCCtl = "MAQHNPDIA_" + sGXsfl_73_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqHnpDia_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMaqHnpDia_Internalname, GXutil.ltrim( localUtil.ntoc( A5123MaqHnpDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqHnpI1i_Internalname, localUtil.ttoc( A5124MaqHnpI1i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqHnpI1f_Internalname, localUtil.ttoc( A5125MaqHnpI1f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHNPInterv1_Internalname, GXutil.ltrim( localUtil.ntoc( A13684HNPInterv1, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqHnpI2i_Internalname, localUtil.ttoc( A5126MaqHnpI2i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqHnpI2f_Internalname, localUtil.ttoc( A5127MaqHnpI2f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHNPInterv2_Internalname, GXutil.ltrim( localUtil.ntoc( A13685HNPInterv2, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqHnpI3i_Internalname, localUtil.ttoc( A5128MaqHnpI3i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqHnpI3f_Internalname, localUtil.ttoc( A5129MaqHnpI3f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHNPInterv3_Internalname, GXutil.ltrim( localUtil.ntoc( A13686HNPInterv3, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqHNPTota_Internalname, GXutil.ltrim( localUtil.ntoc( A13683MaqHNPTota, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5123MaqHnpDia_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z5123MaqHnpDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5124MaqHnpI1i_"+sGXsfl_73_idx, localUtil.ttoc( Z5124MaqHnpI1i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5125MaqHnpI1f_"+sGXsfl_73_idx, localUtil.ttoc( Z5125MaqHnpI1f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5126MaqHnpI2i_"+sGXsfl_73_idx, localUtil.ttoc( Z5126MaqHnpI2i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5127MaqHnpI2f_"+sGXsfl_73_idx, localUtil.ttoc( Z5127MaqHnpI2f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5128MaqHnpI3i_"+sGXsfl_73_idx, localUtil.ttoc( Z5128MaqHnpI3i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5129MaqHnpI3f_"+sGXsfl_73_idx, localUtil.ttoc( Z5129MaqHnpI3f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_748_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_748, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_748_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_748, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_748_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_748, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_748 != 0 )
         {
            httpContext.changePostValue( "MAQHNPDIA_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpDia_Title)) ;
            httpContext.changePostValue( "MAQHNPDIA_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpDia_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQHNPI1I_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI1i_Title)) ;
            httpContext.changePostValue( "MAQHNPI1I_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI1i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQHNPI1F_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI1f_Title)) ;
            httpContext.changePostValue( "MAQHNPI1F_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI1f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HNPINTERV1_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHNPInterv1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQHNPI2I_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI2i_Title)) ;
            httpContext.changePostValue( "MAQHNPI2I_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI2i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQHNPI2F_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI2f_Title)) ;
            httpContext.changePostValue( "MAQHNPI2F_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI2f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HNPINTERV2_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHNPInterv2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQHNPI3I_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI3i_Title)) ;
            httpContext.changePostValue( "MAQHNPI3I_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI3i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQHNPI3F_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI3f_Title)) ;
            httpContext.changePostValue( "MAQHNPI3F_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI3f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HNPINTERV3_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHNPInterv3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQHNPTOTA_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHNPTota_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllOD748( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_748 = (short)(0) ;
      nIsMod_748 = (short)(0) ;
      nRcdDeleted_748 = (short)(0) ;
   }

   public void processLevelOD67( )
   {
      /* Save parent mode. */
      sMode67 = Gx_mode ;
      processNestedLevelOD748( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode67 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelOD67( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteOD67( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tinthnp");
         if ( AnyError == 0 )
         {
            confirmValuesOD0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tinthnp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartOD67( )
   {
      /* Scan By routine */
      /* Using cursor T00OD15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
      RcdFound67 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound67 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextOD67( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound67 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound67 = (short)(1) ;
      }
   }

   public void scanEndOD67( )
   {
      pr_default.close(13);
   }

   public void afterConfirmOD67( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertOD67( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateOD67( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteOD67( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteOD67( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateOD67( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesOD67( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqAny_Enabled), 5, 0), true);
      edtMaqMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMes_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
      edtMaqHNPMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHNPMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHNPMes_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmOD748( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5124MaqHnpI1i = T00OD3_A5124MaqHnpI1i[0] ;
            Z5125MaqHnpI1f = T00OD3_A5125MaqHnpI1f[0] ;
            Z5126MaqHnpI2i = T00OD3_A5126MaqHnpI2i[0] ;
            Z5127MaqHnpI2f = T00OD3_A5127MaqHnpI2f[0] ;
            Z5128MaqHnpI3i = T00OD3_A5128MaqHnpI3i[0] ;
            Z5129MaqHnpI3f = T00OD3_A5129MaqHnpI3f[0] ;
         }
         else
         {
            Z5124MaqHnpI1i = A5124MaqHnpI1i ;
            Z5125MaqHnpI1f = A5125MaqHnpI1f ;
            Z5126MaqHnpI2i = A5126MaqHnpI2i ;
            Z5127MaqHnpI2f = A5127MaqHnpI2f ;
            Z5128MaqHnpI3i = A5128MaqHnpI3i ;
            Z5129MaqHnpI3f = A5129MaqHnpI3f ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z602MaqCod = A602MaqCod ;
         Z599MaqAny = A599MaqAny ;
         Z614MaqMes = A614MaqMes ;
         Z5123MaqHnpDia = A5123MaqHnpDia ;
         Z5124MaqHnpI1i = A5124MaqHnpI1i ;
         Z5125MaqHnpI1f = A5125MaqHnpI1f ;
         Z5126MaqHnpI2i = A5126MaqHnpI2i ;
         Z5127MaqHnpI2f = A5127MaqHnpI2f ;
         Z5128MaqHnpI3i = A5128MaqHnpI3i ;
         Z5129MaqHnpI3f = A5129MaqHnpI3f ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalOD748( )
   {
   }

   public void standaloneModalOD748( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMaqHnpDia_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpDia_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      }
      else
      {
         edtMaqHnpDia_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpDia_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      }
   }

   public void loadOD748( )
   {
      /* Using cursor T00OD16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Byte.valueOf(A5123MaqHnpDia)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound748 = (short)(1) ;
         A5124MaqHnpI1i = T00OD16_A5124MaqHnpI1i[0] ;
         n5124MaqHnpI1i = T00OD16_n5124MaqHnpI1i[0] ;
         A5125MaqHnpI1f = T00OD16_A5125MaqHnpI1f[0] ;
         n5125MaqHnpI1f = T00OD16_n5125MaqHnpI1f[0] ;
         A5126MaqHnpI2i = T00OD16_A5126MaqHnpI2i[0] ;
         n5126MaqHnpI2i = T00OD16_n5126MaqHnpI2i[0] ;
         A5127MaqHnpI2f = T00OD16_A5127MaqHnpI2f[0] ;
         n5127MaqHnpI2f = T00OD16_n5127MaqHnpI2f[0] ;
         A5128MaqHnpI3i = T00OD16_A5128MaqHnpI3i[0] ;
         n5128MaqHnpI3i = T00OD16_n5128MaqHnpI3i[0] ;
         A5129MaqHnpI3f = T00OD16_A5129MaqHnpI3f[0] ;
         n5129MaqHnpI3f = T00OD16_n5129MaqHnpI3f[0] ;
         zmOD748( -17) ;
      }
      pr_default.close(14);
      onLoadActionsOD748( ) ;
   }

   public void onLoadActionsOD748( )
   {
      A13684HNPInterv1 = DecimalUtil.doubleToDec((GXutil.dtdiff( A5125MaqHnpI1f, A5124MaqHnpI1i))/ (double) (3600)) ;
      A13685HNPInterv2 = DecimalUtil.doubleToDec(GXutil.dtdiff( A5127MaqHnpI2f, A5126MaqHnpI2i)/ (double) (3600)) ;
      A13686HNPInterv3 = DecimalUtil.doubleToDec(GXutil.dtdiff( A5129MaqHnpI3f, A5128MaqHnpI3i)/ (double) (3600)) ;
      if ( A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3).doubleValue() > 0 )
      {
         A13683MaqHNPTota = (byte)(DecimalUtil.decToDouble(GXutil.roundDecimal( A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3), 0).add(DecimalUtil.doubleToDec(((DecimalUtil.compareTo(GXutil.roundDecimal( A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3), 0), A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3))<0) ? 1 : 0))))) ;
      }
      else
      {
         A13683MaqHNPTota = (byte)(0) ;
      }
   }

   public void checkExtendedTableOD748( )
   {
      nIsDirty_748 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalOD748( ) ;
      nIsDirty_748 = (short)(1) ;
      A13684HNPInterv1 = DecimalUtil.doubleToDec((GXutil.dtdiff( A5125MaqHnpI1f, A5124MaqHnpI1i))/ (double) (3600)) ;
      nIsDirty_748 = (short)(1) ;
      A13685HNPInterv2 = DecimalUtil.doubleToDec(GXutil.dtdiff( A5127MaqHnpI2f, A5126MaqHnpI2i)/ (double) (3600)) ;
      nIsDirty_748 = (short)(1) ;
      A13686HNPInterv3 = DecimalUtil.doubleToDec(GXutil.dtdiff( A5129MaqHnpI3f, A5128MaqHnpI3i)/ (double) (3600)) ;
      if ( A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3).doubleValue() > 0 )
      {
         nIsDirty_748 = (short)(1) ;
         A13683MaqHNPTota = (byte)(DecimalUtil.decToDouble(GXutil.roundDecimal( A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3), 0).add(DecimalUtil.doubleToDec(((DecimalUtil.compareTo(GXutil.roundDecimal( A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3), 0), A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3))<0) ? 1 : 0))))) ;
      }
      else
      {
         nIsDirty_748 = (short)(1) ;
         A13683MaqHNPTota = (byte)(0) ;
      }
   }

   public void closeExtendedTableCursorsOD748( )
   {
   }

   public void enableDisableOD748( )
   {
   }

   public void getKeyOD748( )
   {
      /* Using cursor T00OD17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Byte.valueOf(A5123MaqHnpDia)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound748 = (short)(1) ;
      }
      else
      {
         RcdFound748 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKeyOD748( )
   {
      /* Using cursor T00OD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Byte.valueOf(A5123MaqHnpDia)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00OD3_A602MaqCod[0], A602MaqCod) == 0 ) && ( T00OD3_A599MaqAny[0] == A599MaqAny ) && ( T00OD3_A614MaqMes[0] == A614MaqMes ) && ( GXutil.strcmp(T00OD3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmOD748( 17) ;
         RcdFound748 = (short)(1) ;
         initializeNonKeyOD748( ) ;
         A5123MaqHnpDia = T00OD3_A5123MaqHnpDia[0] ;
         A5124MaqHnpI1i = T00OD3_A5124MaqHnpI1i[0] ;
         n5124MaqHnpI1i = T00OD3_n5124MaqHnpI1i[0] ;
         A5125MaqHnpI1f = T00OD3_A5125MaqHnpI1f[0] ;
         n5125MaqHnpI1f = T00OD3_n5125MaqHnpI1f[0] ;
         A5126MaqHnpI2i = T00OD3_A5126MaqHnpI2i[0] ;
         n5126MaqHnpI2i = T00OD3_n5126MaqHnpI2i[0] ;
         A5127MaqHnpI2f = T00OD3_A5127MaqHnpI2f[0] ;
         n5127MaqHnpI2f = T00OD3_n5127MaqHnpI2f[0] ;
         A5128MaqHnpI3i = T00OD3_A5128MaqHnpI3i[0] ;
         n5128MaqHnpI3i = T00OD3_n5128MaqHnpI3i[0] ;
         A5129MaqHnpI3f = T00OD3_A5129MaqHnpI3f[0] ;
         n5129MaqHnpI3f = T00OD3_n5129MaqHnpI3f[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z599MaqAny = A599MaqAny ;
         Z614MaqMes = A614MaqMes ;
         Z5123MaqHnpDia = A5123MaqHnpDia ;
         sMode748 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalOD748( ) ;
         loadOD748( ) ;
         Gx_mode = sMode748 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound748 = (short)(0) ;
         initializeNonKeyOD748( ) ;
         sMode748 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalOD748( ) ;
         Gx_mode = sMode748 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesOD748( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyOD748( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00OD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Byte.valueOf(A5123MaqHnpDia)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINTHNP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z5124MaqHnpI1i, T00OD2_A5124MaqHnpI1i[0]) ) || !( GXutil.dateCompare(Z5125MaqHnpI1f, T00OD2_A5125MaqHnpI1f[0]) ) || !( GXutil.dateCompare(Z5126MaqHnpI2i, T00OD2_A5126MaqHnpI2i[0]) ) || !( GXutil.dateCompare(Z5127MaqHnpI2f, T00OD2_A5127MaqHnpI2f[0]) ) || !( GXutil.dateCompare(Z5128MaqHnpI3i, T00OD2_A5128MaqHnpI3i[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z5129MaqHnpI3f, T00OD2_A5129MaqHnpI3f[0]) ) )
         {
            if ( !( GXutil.dateCompare(Z5124MaqHnpI1i, T00OD2_A5124MaqHnpI1i[0]) ) )
            {
               GXutil.writeLogln("tinthnp:[seudo value changed for attri]"+"MaqHnpI1i");
               GXutil.writeLogRaw("Old: ",Z5124MaqHnpI1i);
               GXutil.writeLogRaw("Current: ",T00OD2_A5124MaqHnpI1i[0]);
            }
            if ( !( GXutil.dateCompare(Z5125MaqHnpI1f, T00OD2_A5125MaqHnpI1f[0]) ) )
            {
               GXutil.writeLogln("tinthnp:[seudo value changed for attri]"+"MaqHnpI1f");
               GXutil.writeLogRaw("Old: ",Z5125MaqHnpI1f);
               GXutil.writeLogRaw("Current: ",T00OD2_A5125MaqHnpI1f[0]);
            }
            if ( !( GXutil.dateCompare(Z5126MaqHnpI2i, T00OD2_A5126MaqHnpI2i[0]) ) )
            {
               GXutil.writeLogln("tinthnp:[seudo value changed for attri]"+"MaqHnpI2i");
               GXutil.writeLogRaw("Old: ",Z5126MaqHnpI2i);
               GXutil.writeLogRaw("Current: ",T00OD2_A5126MaqHnpI2i[0]);
            }
            if ( !( GXutil.dateCompare(Z5127MaqHnpI2f, T00OD2_A5127MaqHnpI2f[0]) ) )
            {
               GXutil.writeLogln("tinthnp:[seudo value changed for attri]"+"MaqHnpI2f");
               GXutil.writeLogRaw("Old: ",Z5127MaqHnpI2f);
               GXutil.writeLogRaw("Current: ",T00OD2_A5127MaqHnpI2f[0]);
            }
            if ( !( GXutil.dateCompare(Z5128MaqHnpI3i, T00OD2_A5128MaqHnpI3i[0]) ) )
            {
               GXutil.writeLogln("tinthnp:[seudo value changed for attri]"+"MaqHnpI3i");
               GXutil.writeLogRaw("Old: ",Z5128MaqHnpI3i);
               GXutil.writeLogRaw("Current: ",T00OD2_A5128MaqHnpI3i[0]);
            }
            if ( !( GXutil.dateCompare(Z5129MaqHnpI3f, T00OD2_A5129MaqHnpI3f[0]) ) )
            {
               GXutil.writeLogln("tinthnp:[seudo value changed for attri]"+"MaqHnpI3f");
               GXutil.writeLogRaw("Old: ",Z5129MaqHnpI3f);
               GXutil.writeLogRaw("Current: ",T00OD2_A5129MaqHnpI3f[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPINTHNP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertOD748( )
   {
      beforeValidateOD748( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableOD748( ) ;
      }
      if ( AnyError == 0 )
      {
         zmOD748( 0) ;
         checkOptimisticConcurrencyOD748( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmOD748( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertOD748( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00OD18 */
                  pr_default.execute(16, new Object[] {A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Byte.valueOf(A5123MaqHnpDia), Boolean.valueOf(n5124MaqHnpI1i), A5124MaqHnpI1i, Boolean.valueOf(n5125MaqHnpI1f), A5125MaqHnpI1f, Boolean.valueOf(n5126MaqHnpI2i), A5126MaqHnpI2i, Boolean.valueOf(n5127MaqHnpI2f), A5127MaqHnpI2f, Boolean.valueOf(n5128MaqHnpI3i), A5128MaqHnpI3i, Boolean.valueOf(n5129MaqHnpI3f), A5129MaqHnpI3f, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTHNP");
                  if ( (pr_default.getStatus(16) == 1) )
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
            loadOD748( ) ;
         }
         endLevelOD748( ) ;
      }
      closeExtendedTableCursorsOD748( ) ;
   }

   public void updateOD748( )
   {
      beforeValidateOD748( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableOD748( ) ;
      }
      if ( ( nIsMod_748 != 0 ) || ( nIsDirty_748 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyOD748( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmOD748( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateOD748( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00OD19 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n5124MaqHnpI1i), A5124MaqHnpI1i, Boolean.valueOf(n5125MaqHnpI1f), A5125MaqHnpI1f, Boolean.valueOf(n5126MaqHnpI2i), A5126MaqHnpI2i, Boolean.valueOf(n5127MaqHnpI2f), A5127MaqHnpI2f, Boolean.valueOf(n5128MaqHnpI3i), A5128MaqHnpI3i, Boolean.valueOf(n5129MaqHnpI3f), A5129MaqHnpI3f, A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Byte.valueOf(A5123MaqHnpDia)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTHNP");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINTHNP"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateOD748( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyOD748( ) ;
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
            endLevelOD748( ) ;
         }
      }
      closeExtendedTableCursorsOD748( ) ;
   }

   public void deferredUpdateOD748( )
   {
   }

   public void deleteOD748( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateOD748( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyOD748( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsOD748( ) ;
         afterConfirmOD748( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteOD748( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00OD20 */
               pr_default.execute(18, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Byte.valueOf(A5123MaqHnpDia)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTHNP");
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
      sMode748 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelOD748( ) ;
      Gx_mode = sMode748 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsOD748( )
   {
      standaloneModalOD748( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13684HNPInterv1 = DecimalUtil.doubleToDec((GXutil.dtdiff( A5125MaqHnpI1f, A5124MaqHnpI1i))/ (double) (3600)) ;
         A13685HNPInterv2 = DecimalUtil.doubleToDec(GXutil.dtdiff( A5127MaqHnpI2f, A5126MaqHnpI2i)/ (double) (3600)) ;
         A13686HNPInterv3 = DecimalUtil.doubleToDec(GXutil.dtdiff( A5129MaqHnpI3f, A5128MaqHnpI3i)/ (double) (3600)) ;
         if ( A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3).doubleValue() > 0 )
         {
            A13683MaqHNPTota = (byte)(DecimalUtil.decToDouble(GXutil.roundDecimal( A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3), 0).add(DecimalUtil.doubleToDec(((DecimalUtil.compareTo(GXutil.roundDecimal( A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3), 0), A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3))<0) ? 1 : 0))))) ;
         }
         else
         {
            A13683MaqHNPTota = (byte)(0) ;
         }
      }
   }

   public void endLevelOD748( )
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

   public void scanStartOD748( )
   {
      /* Scan By routine */
      /* Using cursor T00OD21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
      RcdFound748 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound748 = (short)(1) ;
         A5123MaqHnpDia = T00OD21_A5123MaqHnpDia[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextOD748( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound748 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound748 = (short)(1) ;
         A5123MaqHnpDia = T00OD21_A5123MaqHnpDia[0] ;
      }
   }

   public void scanEndOD748( )
   {
      pr_default.close(19);
   }

   public void afterConfirmOD748( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertOD748( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateOD748( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteOD748( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteOD748( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateOD748( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesOD748( )
   {
      edtMaqHnpDia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpDia_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtMaqHnpI1i_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI1i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpI1i_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtMaqHnpI1f_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI1f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpI1f_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtHNPInterv1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHNPInterv1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHNPInterv1_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtMaqHnpI2i_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI2i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpI2i_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtMaqHnpI2f_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI2f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpI2f_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtHNPInterv2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHNPInterv2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHNPInterv2_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtMaqHnpI3i_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI3i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpI3i_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtMaqHnpI3f_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpI3f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpI3f_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtHNPInterv3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHNPInterv3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHNPInterv3_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtMaqHNPTota_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHNPTota_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHNPTota_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void send_integrity_lvl_hashesOD748( )
   {
   }

   public void send_integrity_lvl_hashesOD67( )
   {
   }

   public void subsflControlProps_73748( )
   {
      edtMaqHnpDia_Internalname = "MAQHNPDIA_"+sGXsfl_73_idx ;
      edtMaqHnpI1i_Internalname = "MAQHNPI1I_"+sGXsfl_73_idx ;
      edtMaqHnpI1f_Internalname = "MAQHNPI1F_"+sGXsfl_73_idx ;
      edtHNPInterv1_Internalname = "HNPINTERV1_"+sGXsfl_73_idx ;
      edtMaqHnpI2i_Internalname = "MAQHNPI2I_"+sGXsfl_73_idx ;
      edtMaqHnpI2f_Internalname = "MAQHNPI2F_"+sGXsfl_73_idx ;
      edtHNPInterv2_Internalname = "HNPINTERV2_"+sGXsfl_73_idx ;
      edtMaqHnpI3i_Internalname = "MAQHNPI3I_"+sGXsfl_73_idx ;
      edtMaqHnpI3f_Internalname = "MAQHNPI3F_"+sGXsfl_73_idx ;
      edtHNPInterv3_Internalname = "HNPINTERV3_"+sGXsfl_73_idx ;
      edtMaqHNPTota_Internalname = "MAQHNPTOTA_"+sGXsfl_73_idx ;
   }

   public void subsflControlProps_fel_73748( )
   {
      edtMaqHnpDia_Internalname = "MAQHNPDIA_"+sGXsfl_73_fel_idx ;
      edtMaqHnpI1i_Internalname = "MAQHNPI1I_"+sGXsfl_73_fel_idx ;
      edtMaqHnpI1f_Internalname = "MAQHNPI1F_"+sGXsfl_73_fel_idx ;
      edtHNPInterv1_Internalname = "HNPINTERV1_"+sGXsfl_73_fel_idx ;
      edtMaqHnpI2i_Internalname = "MAQHNPI2I_"+sGXsfl_73_fel_idx ;
      edtMaqHnpI2f_Internalname = "MAQHNPI2F_"+sGXsfl_73_fel_idx ;
      edtHNPInterv2_Internalname = "HNPINTERV2_"+sGXsfl_73_fel_idx ;
      edtMaqHnpI3i_Internalname = "MAQHNPI3I_"+sGXsfl_73_fel_idx ;
      edtMaqHnpI3f_Internalname = "MAQHNPI3F_"+sGXsfl_73_fel_idx ;
      edtHNPInterv3_Internalname = "HNPINTERV3_"+sGXsfl_73_fel_idx ;
      edtMaqHNPTota_Internalname = "MAQHNPTOTA_"+sGXsfl_73_fel_idx ;
   }

   public void addRowOD748( )
   {
      nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_73748( ) ;
      sendRowOD748( ) ;
   }

   public void sendRowOD748( )
   {
      Gridtinthnp_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtinthnp_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtinthnp_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtinthnp_level1item_Class, "") != 0 )
         {
            subGridtinthnp_level1item_Linesclass = subGridtinthnp_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtinthnp_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtinthnp_level1item_Backstyle = (byte)(0) ;
         subGridtinthnp_level1item_Backcolor = subGridtinthnp_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtinthnp_level1item_Class, "") != 0 )
         {
            subGridtinthnp_level1item_Linesclass = subGridtinthnp_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtinthnp_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtinthnp_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtinthnp_level1item_Class, "") != 0 )
         {
            subGridtinthnp_level1item_Linesclass = subGridtinthnp_level1item_Class+"Odd" ;
         }
         subGridtinthnp_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtinthnp_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtinthnp_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_73_idx) % (2))) == 0 )
         {
            subGridtinthnp_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtinthnp_level1item_Class, "") != 0 )
            {
               subGridtinthnp_level1item_Linesclass = subGridtinthnp_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtinthnp_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtinthnp_level1item_Class, "") != 0 )
            {
               subGridtinthnp_level1item_Linesclass = subGridtinthnp_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_748_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtinthnp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqHnpDia_Internalname,GXutil.ltrim( localUtil.ntoc( A5123MaqHnpDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5123MaqHnpDia), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqHnpDia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqHnpDia_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_748_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtinthnp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqHnpI1i_Internalname,localUtil.ttoc( A5124MaqHnpI1i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A5124MaqHnpI1i, "99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqHnpI1i_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqHnpI1i_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"GeneXus\\Time","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_748_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtinthnp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqHnpI1f_Internalname,localUtil.ttoc( A5125MaqHnpI1f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A5125MaqHnpI1f, "99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqHnpI1f_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqHnpI1f_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"GeneXus\\Time","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtinthnp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHNPInterv1_Internalname,GXutil.ltrim( localUtil.ntoc( A13684HNPInterv1, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHNPInterv1_Enabled!=0) ? localUtil.format( A13684HNPInterv1, "Z9.99") : localUtil.format( A13684HNPInterv1, "Z9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHNPInterv1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHNPInterv1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"Decimal5_2","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_748_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtinthnp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqHnpI2i_Internalname,localUtil.ttoc( A5126MaqHnpI2i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A5126MaqHnpI2i, "99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqHnpI2i_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqHnpI2i_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"GeneXus\\Time","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_748_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtinthnp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqHnpI2f_Internalname,localUtil.ttoc( A5127MaqHnpI2f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A5127MaqHnpI2f, "99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqHnpI2f_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqHnpI2f_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"GeneXus\\Time","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtinthnp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHNPInterv2_Internalname,GXutil.ltrim( localUtil.ntoc( A13685HNPInterv2, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHNPInterv2_Enabled!=0) ? localUtil.format( A13685HNPInterv2, "Z9.99") : localUtil.format( A13685HNPInterv2, "Z9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHNPInterv2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHNPInterv2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"Decimal5_2","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_748_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtinthnp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqHnpI3i_Internalname,localUtil.ttoc( A5128MaqHnpI3i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A5128MaqHnpI3i, "99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqHnpI3i_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqHnpI3i_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"GeneXus\\Time","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_748_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtinthnp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqHnpI3f_Internalname,localUtil.ttoc( A5129MaqHnpI3f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A5129MaqHnpI3f, "99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqHnpI3f_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqHnpI3f_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"GeneXus\\Time","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtinthnp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHNPInterv3_Internalname,GXutil.ltrim( localUtil.ntoc( A13686HNPInterv3, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHNPInterv3_Enabled!=0) ? localUtil.format( A13686HNPInterv3, "Z9.99") : localUtil.format( A13686HNPInterv3, "Z9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHNPInterv3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHNPInterv3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"Decimal5_2","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtinthnp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqHNPTota_Internalname,GXutil.ltrim( localUtil.ntoc( A13683MaqHNPTota, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqHNPTota_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13683MaqHNPTota), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A13683MaqHNPTota), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqHNPTota_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqHNPTota_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"FicherosBasicos\\CodigoNumerico02","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridtinthnp_level1itemRow);
      send_integrity_lvl_hashesOD748( ) ;
      GXCCtl = "Z5123MaqHnpDia_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5123MaqHnpDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5124MaqHnpI1i_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z5124MaqHnpI1i, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z5125MaqHnpI1f_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z5125MaqHnpI1f, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z5126MaqHnpI2i_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z5126MaqHnpI2i, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z5127MaqHnpI2f_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z5127MaqHnpI2f, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z5128MaqHnpI3i_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z5128MaqHnpI3i, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z5129MaqHnpI3f_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z5129MaqHnpI3f, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "nRcdDeleted_748_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_748, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_748_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_748, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_748_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_748, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPDIA_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpDia_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPDIA_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpDia_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI1I_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI1i_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI1I_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI1i_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI1F_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI1f_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI1F_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI1f_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HNPINTERV1_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHNPInterv1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI2I_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI2i_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI2I_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI2i_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI2F_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI2f_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI2F_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI2f_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HNPINTERV2_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHNPInterv2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI3I_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI3i_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI3I_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI3i_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI3F_"+sGXsfl_73_idx+"Title", GXutil.rtrim( edtMaqHnpI3f_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI3F_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI3f_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HNPINTERV3_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHNPInterv3_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPTOTA_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHNPTota_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtinthnp_level1itemContainer.AddRow(Gridtinthnp_level1itemRow);
   }

   public void readRowOD748( )
   {
      nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_73748( ) ;
      edtMaqHnpDia_Title = httpContext.cgiGet( "MAQHNPDIA_"+sGXsfl_73_idx+"Title") ;
      edtMaqHnpDia_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPDIA_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqHnpI1i_Title = httpContext.cgiGet( "MAQHNPI1I_"+sGXsfl_73_idx+"Title") ;
      edtMaqHnpI1i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPI1I_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqHnpI1f_Title = httpContext.cgiGet( "MAQHNPI1F_"+sGXsfl_73_idx+"Title") ;
      edtMaqHnpI1f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPI1F_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHNPInterv1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HNPINTERV1_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqHnpI2i_Title = httpContext.cgiGet( "MAQHNPI2I_"+sGXsfl_73_idx+"Title") ;
      edtMaqHnpI2i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPI2I_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqHnpI2f_Title = httpContext.cgiGet( "MAQHNPI2F_"+sGXsfl_73_idx+"Title") ;
      edtMaqHnpI2f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPI2F_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHNPInterv2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HNPINTERV2_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqHnpI3i_Title = httpContext.cgiGet( "MAQHNPI3I_"+sGXsfl_73_idx+"Title") ;
      edtMaqHnpI3i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPI3I_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqHnpI3f_Title = httpContext.cgiGet( "MAQHNPI3F_"+sGXsfl_73_idx+"Title") ;
      edtMaqHnpI3f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPI3F_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHNPInterv3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HNPINTERV3_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqHNPTota_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQHNPTOTA_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqHnpDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqHnpDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MAQHNPDIA_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqHnpDia_Internalname ;
         wbErr = true ;
         A5123MaqHnpDia = (byte)(0) ;
      }
      else
      {
         A5123MaqHnpDia = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqHnpDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtMaqHnpI1i_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "MAQHNPI1I_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqHnpI1i_Internalname ;
         wbErr = true ;
         A5124MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
         n5124MaqHnpI1i = false ;
      }
      else
      {
         A5124MaqHnpI1i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtMaqHnpI1i_Internalname))) ;
         n5124MaqHnpI1i = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtMaqHnpI1f_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "MAQHNPI1F_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqHnpI1f_Internalname ;
         wbErr = true ;
         A5125MaqHnpI1f = GXutil.resetTime( GXutil.nullDate() );
         n5125MaqHnpI1f = false ;
      }
      else
      {
         A5125MaqHnpI1f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtMaqHnpI1f_Internalname))) ;
         n5125MaqHnpI1f = false ;
      }
      A13684HNPInterv1 = localUtil.ctond( httpContext.cgiGet( edtHNPInterv1_Internalname)) ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtMaqHnpI2i_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "MAQHNPI2I_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqHnpI2i_Internalname ;
         wbErr = true ;
         A5126MaqHnpI2i = GXutil.resetTime( GXutil.nullDate() );
         n5126MaqHnpI2i = false ;
      }
      else
      {
         A5126MaqHnpI2i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtMaqHnpI2i_Internalname))) ;
         n5126MaqHnpI2i = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtMaqHnpI2f_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "MAQHNPI2F_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqHnpI2f_Internalname ;
         wbErr = true ;
         A5127MaqHnpI2f = GXutil.resetTime( GXutil.nullDate() );
         n5127MaqHnpI2f = false ;
      }
      else
      {
         A5127MaqHnpI2f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtMaqHnpI2f_Internalname))) ;
         n5127MaqHnpI2f = false ;
      }
      A13685HNPInterv2 = localUtil.ctond( httpContext.cgiGet( edtHNPInterv2_Internalname)) ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtMaqHnpI3i_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "MAQHNPI3I_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqHnpI3i_Internalname ;
         wbErr = true ;
         A5128MaqHnpI3i = GXutil.resetTime( GXutil.nullDate() );
         n5128MaqHnpI3i = false ;
      }
      else
      {
         A5128MaqHnpI3i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtMaqHnpI3i_Internalname))) ;
         n5128MaqHnpI3i = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtMaqHnpI3f_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "MAQHNPI3F_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqHnpI3f_Internalname ;
         wbErr = true ;
         A5129MaqHnpI3f = GXutil.resetTime( GXutil.nullDate() );
         n5129MaqHnpI3f = false ;
      }
      else
      {
         A5129MaqHnpI3f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtMaqHnpI3f_Internalname))) ;
         n5129MaqHnpI3f = false ;
      }
      A13686HNPInterv3 = localUtil.ctond( httpContext.cgiGet( edtHNPInterv3_Internalname)) ;
      A13683MaqHNPTota = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqHNPTota_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5123MaqHnpDia_" + sGXsfl_73_idx ;
      Z5123MaqHnpDia = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5124MaqHnpI1i_" + sGXsfl_73_idx ;
      Z5124MaqHnpI1i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z5125MaqHnpI1f_" + sGXsfl_73_idx ;
      Z5125MaqHnpI1f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z5126MaqHnpI2i_" + sGXsfl_73_idx ;
      Z5126MaqHnpI2i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z5127MaqHnpI2f_" + sGXsfl_73_idx ;
      Z5127MaqHnpI2f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z5128MaqHnpI3i_" + sGXsfl_73_idx ;
      Z5128MaqHnpI3i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z5129MaqHnpI3f_" + sGXsfl_73_idx ;
      Z5129MaqHnpI3f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "nRcdDeleted_748_" + sGXsfl_73_idx ;
      nRcdDeleted_748 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_748_" + sGXsfl_73_idx ;
      nRcdExists_748 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_748_" + sGXsfl_73_idx ;
      nIsMod_748 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMaqHnpDia_Enabled = edtMaqHnpDia_Enabled ;
   }

   public void confirmValuesOD0( )
   {
      nGXsfl_73_idx = 0 ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_73748( ) ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_73748( ) ;
         httpContext.changePostValue( "Z5123MaqHnpDia_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z5123MaqHnpDia_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5123MaqHnpDia_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z5124MaqHnpI1i_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z5124MaqHnpI1i_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5124MaqHnpI1i_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z5125MaqHnpI1f_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z5125MaqHnpI1f_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5125MaqHnpI1f_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z5126MaqHnpI2i_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z5126MaqHnpI2i_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5126MaqHnpI2i_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z5127MaqHnpI2f_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z5127MaqHnpI2f_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5127MaqHnpI2f_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z5128MaqHnpI3i_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z5128MaqHnpI3i_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5128MaqHnpI3i_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z5129MaqHnpI3f_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z5129MaqHnpI3f_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5129MaqHnpI3f_"+sGXsfl_73_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tinthnp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.ltrimstr(A599MaqAny,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A614MaqMes,2,0))}, new String[] {"EmprCod","MaqCod","MaqAny","MaqMes"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z599MaqAny", GXutil.ltrim( localUtil.ntoc( Z599MaqAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z614MaqMes", GXutil.ltrim( localUtil.ntoc( Z614MaqMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z610MaqHNPMes", Z610MaqHNPMes);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_73", GXutil.ltrim( localUtil.ntoc( nGXsfl_73_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT6", GXutil.rtrim( AV26Lit6));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT7", GXutil.rtrim( AV27Lit7));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT8", GXutil.rtrim( AV28Lit8));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT9", GXutil.rtrim( AV29Lit9));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT10", GXutil.rtrim( AV30Lit10));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT11", GXutil.rtrim( AV31Lit11));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT12", GXutil.rtrim( AV32Lit12));
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
      return formatLink("app.tinthnp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.ltrimstr(A599MaqAny,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A614MaqMes,2,0))}, new String[] {"EmprCod","MaqCod","MaqAny","MaqMes"})  ;
   }

   public String getPgmname( )
   {
      return "TINTHNP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "INTERVALOS HORAS NO PROD/DIA", "") ;
   }

   public void initializeNonKeyOD67( )
   {
      A610MaqHNPMes = "" ;
      n610MaqHNPMes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A610MaqHNPMes", A610MaqHNPMes);
      Z610MaqHNPMes = "" ;
   }

   public void initAllOD67( )
   {
      initializeNonKeyOD67( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyOD748( )
   {
      A13686HNPInterv3 = DecimalUtil.ZERO ;
      A13685HNPInterv2 = DecimalUtil.ZERO ;
      A13683MaqHNPTota = (byte)(0) ;
      A13684HNPInterv1 = DecimalUtil.ZERO ;
      A5124MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
      n5124MaqHnpI1i = false ;
      A5125MaqHnpI1f = GXutil.resetTime( GXutil.nullDate() );
      n5125MaqHnpI1f = false ;
      A5126MaqHnpI2i = GXutil.resetTime( GXutil.nullDate() );
      n5126MaqHnpI2i = false ;
      A5127MaqHnpI2f = GXutil.resetTime( GXutil.nullDate() );
      n5127MaqHnpI2f = false ;
      A5128MaqHnpI3i = GXutil.resetTime( GXutil.nullDate() );
      n5128MaqHnpI3i = false ;
      A5129MaqHnpI3f = GXutil.resetTime( GXutil.nullDate() );
      n5129MaqHnpI3f = false ;
      Z5124MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
      Z5125MaqHnpI1f = GXutil.resetTime( GXutil.nullDate() );
      Z5126MaqHnpI2i = GXutil.resetTime( GXutil.nullDate() );
      Z5127MaqHnpI2f = GXutil.resetTime( GXutil.nullDate() );
      Z5128MaqHnpI3i = GXutil.resetTime( GXutil.nullDate() );
      Z5129MaqHnpI3f = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAllOD748( )
   {
      A5123MaqHnpDia = (byte)(0) ;
      initializeNonKeyOD748( ) ;
   }

   public void standaloneModalInsertOD748( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241522997", true, true);
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
      httpContext.AddJavascriptSource("tinthnp.js", "?20268241522997", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties748( )
   {
      edtMaqHnpDia_Enabled = defedtMaqHnpDia_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHnpDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHnpDia_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void startgridcontrol73( )
   {
      Gridtinthnp_level1itemContainer.AddObjectProperty("GridName", "Gridtinthnp_level1item");
      Gridtinthnp_level1itemContainer.AddObjectProperty("Header", subGridtinthnp_level1item_Header);
      Gridtinthnp_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtinthnp_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtinthnp_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtinthnp_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtinthnp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtinthnp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5123MaqHnpDia, (byte)(2), (byte)(0), ".", "")));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Title", GXutil.rtrim( edtMaqHnpDia_Title));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpDia_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddColumnProperties(Gridtinthnp_level1itemColumn);
      Gridtinthnp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtinthnp_level1itemColumn.AddObjectProperty("Value", localUtil.ttoc( A5124MaqHnpI1i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Title", GXutil.rtrim( edtMaqHnpI1i_Title));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI1i_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddColumnProperties(Gridtinthnp_level1itemColumn);
      Gridtinthnp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtinthnp_level1itemColumn.AddObjectProperty("Value", localUtil.ttoc( A5125MaqHnpI1f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Title", GXutil.rtrim( edtMaqHnpI1f_Title));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI1f_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddColumnProperties(Gridtinthnp_level1itemColumn);
      Gridtinthnp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtinthnp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13684HNPInterv1, (byte)(5), (byte)(2), ".", "")));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHNPInterv1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddColumnProperties(Gridtinthnp_level1itemColumn);
      Gridtinthnp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtinthnp_level1itemColumn.AddObjectProperty("Value", localUtil.ttoc( A5126MaqHnpI2i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Title", GXutil.rtrim( edtMaqHnpI2i_Title));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI2i_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddColumnProperties(Gridtinthnp_level1itemColumn);
      Gridtinthnp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtinthnp_level1itemColumn.AddObjectProperty("Value", localUtil.ttoc( A5127MaqHnpI2f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Title", GXutil.rtrim( edtMaqHnpI2f_Title));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI2f_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddColumnProperties(Gridtinthnp_level1itemColumn);
      Gridtinthnp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtinthnp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13685HNPInterv2, (byte)(5), (byte)(2), ".", "")));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHNPInterv2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddColumnProperties(Gridtinthnp_level1itemColumn);
      Gridtinthnp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtinthnp_level1itemColumn.AddObjectProperty("Value", localUtil.ttoc( A5128MaqHnpI3i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Title", GXutil.rtrim( edtMaqHnpI3i_Title));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI3i_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddColumnProperties(Gridtinthnp_level1itemColumn);
      Gridtinthnp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtinthnp_level1itemColumn.AddObjectProperty("Value", localUtil.ttoc( A5129MaqHnpI3f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Title", GXutil.rtrim( edtMaqHnpI3f_Title));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHnpI3f_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddColumnProperties(Gridtinthnp_level1itemColumn);
      Gridtinthnp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtinthnp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13686HNPInterv3, (byte)(5), (byte)(2), ".", "")));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHNPInterv3_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddColumnProperties(Gridtinthnp_level1itemColumn);
      Gridtinthnp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtinthnp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13683MaqHNPTota, (byte)(2), (byte)(0), ".", "")));
      Gridtinthnp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqHNPTota_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddColumnProperties(Gridtinthnp_level1itemColumn);
      Gridtinthnp_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtinthnp_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtinthnp_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtinthnp_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtinthnp_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtinthnp_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtinthnp_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtinthnp_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtinthnp_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = "MAQCOD" ;
      edtMaqAny_Internalname = "MAQANY" ;
      edtMaqMes_Internalname = "MAQMES" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      edtMaqHNPMes_Internalname = "MAQHNPMES" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtMaqHnpDia_Internalname = "MAQHNPDIA" ;
      edtMaqHnpI1i_Internalname = "MAQHNPI1I" ;
      edtMaqHnpI1f_Internalname = "MAQHNPI1F" ;
      edtHNPInterv1_Internalname = "HNPINTERV1" ;
      edtMaqHnpI2i_Internalname = "MAQHNPI2I" ;
      edtMaqHnpI2f_Internalname = "MAQHNPI2F" ;
      edtHNPInterv2_Internalname = "HNPINTERV2" ;
      edtMaqHnpI3i_Internalname = "MAQHNPI3I" ;
      edtMaqHnpI3f_Internalname = "MAQHNPI3F" ;
      edtHNPInterv3_Internalname = "HNPINTERV3" ;
      edtMaqHNPTota_Internalname = "MAQHNPTOTA" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtinthnp_level1item_Internalname = "GRIDTINTHNP_LEVEL1ITEM" ;
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
      subGridtinthnp_level1item_Allowcollapsing = (byte)(0) ;
      subGridtinthnp_level1item_Allowselection = (byte)(0) ;
      subGridtinthnp_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "INTERVALOS HORAS NO PROD/DIA", "") );
      edtMaqHNPTota_Jsonclick = "" ;
      edtHNPInterv3_Jsonclick = "" ;
      edtMaqHnpI3f_Jsonclick = "" ;
      edtMaqHnpI3i_Jsonclick = "" ;
      edtHNPInterv2_Jsonclick = "" ;
      edtMaqHnpI2f_Jsonclick = "" ;
      edtMaqHnpI2i_Jsonclick = "" ;
      edtHNPInterv1_Jsonclick = "" ;
      edtMaqHnpI1f_Jsonclick = "" ;
      edtMaqHnpI1i_Jsonclick = "" ;
      edtMaqHnpDia_Jsonclick = "" ;
      subGridtinthnp_level1item_Class = "Grid" ;
      subGridtinthnp_level1item_Backcolorstyle = (byte)(0) ;
      edtMaqHNPTota_Enabled = 0 ;
      edtHNPInterv3_Enabled = 0 ;
      edtMaqHnpI3f_Enabled = 1 ;
      edtMaqHnpI3f_Title = httpContext.getMessage( "Fin Intervalo 3", "") ;
      edtMaqHnpI3i_Enabled = 1 ;
      edtMaqHnpI3i_Title = httpContext.getMessage( "Inicio Intervalo 3", "") ;
      edtHNPInterv2_Enabled = 0 ;
      edtMaqHnpI2f_Enabled = 1 ;
      edtMaqHnpI2f_Title = httpContext.getMessage( "Fin Intervalo 2", "") ;
      edtMaqHnpI2i_Enabled = 1 ;
      edtMaqHnpI2i_Title = httpContext.getMessage( "Inicio Intervalo 2", "") ;
      edtHNPInterv1_Enabled = 0 ;
      edtMaqHnpI1f_Enabled = 1 ;
      edtMaqHnpI1f_Title = httpContext.getMessage( "Fin Intervalo 1", "") ;
      edtMaqHnpI1i_Enabled = 1 ;
      edtMaqHnpI1i_Title = httpContext.getMessage( "Inicio Intervalo 1", "") ;
      edtMaqHnpDia_Enabled = 1 ;
      edtMaqHnpDia_Title = httpContext.getMessage( "Dia", "") ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtMaqHNPMes_Jsonclick = "" ;
      edtMaqHNPMes_Enabled = 1 ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Enabled = 0 ;
      edtMaqMes_Jsonclick = "" ;
      edtMaqMes_Enabled = 0 ;
      edtMaqAny_Jsonclick = "" ;
      edtMaqAny_Enabled = 0 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
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

   public void gxnrgridtinthnp_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_73748( ) ;
      while ( nGXsfl_73_idx <= nRC_GXsfl_73 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalOD748( ) ;
         standaloneModalOD748( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowOD748( ) ;
         nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_73748( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtinthnp_level1itemContainer)) ;
      /* End function gxnrGridtinthnp_level1item_newrow */
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
      /* Using cursor T00OD22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00OD22_A407EmprNom[0] ;
      n407EmprNom = T00OD22_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
      /* Using cursor T00OD23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
      }
      A606MaqDsc = T00OD23_A606MaqDsc[0] ;
      n606MaqDsc = T00OD23_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      pr_default.close(21);
      GX_FocusControl = edtMaqHNPMes_Internalname ;
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

   public void valid_Maqmes( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A610MaqHNPMes", A610MaqHNPMes);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", GXutil.rtrim( AV17UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z599MaqAny", GXutil.ltrim( localUtil.ntoc( Z599MaqAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z614MaqMes", GXutil.ltrim( localUtil.ntoc( Z614MaqMes, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z610MaqHNPMes", Z610MaqHNPMes);
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV17UsurCod", GXutil.rtrim( ZV17UsurCod));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A599MaqAny',fld:'MAQANY',pic:'ZZZ9'},{av:'A614MaqMes',fld:'MAQMES',pic:'99'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQANY","{handler:'valid_Maqany',iparms:[]");
      setEventMetadata("VALID_MAQANY",",oparms:[]}");
      setEventMetadata("VALID_MAQMES","{handler:'valid_Maqmes',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A599MaqAny',fld:'MAQANY',pic:'ZZZ9'},{av:'A614MaqMes',fld:'MAQMES',pic:'99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV26Lit6',fld:'vLIT6',pic:''},{av:'AV27Lit7',fld:'vLIT7',pic:''},{av:'AV28Lit8',fld:'vLIT8',pic:''},{av:'AV29Lit9',fld:'vLIT9',pic:''},{av:'AV30Lit10',fld:'vLIT10',pic:''},{av:'AV31Lit11',fld:'vLIT11',pic:''},{av:'AV32Lit12',fld:'vLIT12',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_MAQMES",",oparms:[{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A610MaqHNPMes',fld:'MAQHNPMES',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z599MaqAny'},{av:'Z614MaqMes'},{av:'Z606MaqDsc'},{av:'Z610MaqHNPMes'},{av:'Z407EmprNom'},{av:'ZV17UsurCod'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAQHNPDIA","{handler:'valid_Maqhnpdia',iparms:[]");
      setEventMetadata("VALID_MAQHNPDIA",",oparms:[]}");
      setEventMetadata("VALID_MAQHNPI1I","{handler:'valid_Maqhnpi1i',iparms:[]");
      setEventMetadata("VALID_MAQHNPI1I",",oparms:[]}");
      setEventMetadata("VALID_MAQHNPI1F","{handler:'valid_Maqhnpi1f',iparms:[]");
      setEventMetadata("VALID_MAQHNPI1F",",oparms:[]}");
      setEventMetadata("VALID_HNPINTERV1","{handler:'valid_Hnpinterv1',iparms:[]");
      setEventMetadata("VALID_HNPINTERV1",",oparms:[]}");
      setEventMetadata("VALID_MAQHNPI2I","{handler:'valid_Maqhnpi2i',iparms:[]");
      setEventMetadata("VALID_MAQHNPI2I",",oparms:[]}");
      setEventMetadata("VALID_MAQHNPI2F","{handler:'valid_Maqhnpi2f',iparms:[]");
      setEventMetadata("VALID_MAQHNPI2F",",oparms:[]}");
      setEventMetadata("VALID_HNPINTERV2","{handler:'valid_Hnpinterv2',iparms:[]");
      setEventMetadata("VALID_HNPINTERV2",",oparms:[]}");
      setEventMetadata("VALID_MAQHNPI3I","{handler:'valid_Maqhnpi3i',iparms:[]");
      setEventMetadata("VALID_MAQHNPI3I",",oparms:[]}");
      setEventMetadata("VALID_MAQHNPI3F","{handler:'valid_Maqhnpi3f',iparms:[]");
      setEventMetadata("VALID_MAQHNPI3F",",oparms:[]}");
      setEventMetadata("VALID_HNPINTERV3","{handler:'valid_Hnpinterv3',iparms:[]");
      setEventMetadata("VALID_HNPINTERV3",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Maqhnptota',iparms:[]");
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
      pr_default.close(20);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA602MaqCod = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z610MaqHNPMes = "" ;
      Z5124MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
      Z5125MaqHnpI1f = GXutil.resetTime( GXutil.nullDate() );
      Z5126MaqHnpI2i = GXutil.resetTime( GXutil.nullDate() );
      Z5127MaqHnpI2f = GXutil.resetTime( GXutil.nullDate() );
      Z5128MaqHnpI3i = GXutil.resetTime( GXutil.nullDate() );
      Z5129MaqHnpI3f = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
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
      A606MaqDsc = "" ;
      A610MaqHNPMes = "" ;
      A407EmprNom = "" ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtinthnp_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode748 = "" ;
      sStyleString = "" ;
      AV17UsurCod = "" ;
      AV26Lit6 = "" ;
      AV27Lit7 = "" ;
      AV28Lit8 = "" ;
      AV29Lit9 = "" ;
      AV30Lit10 = "" ;
      AV31Lit11 = "" ;
      AV32Lit12 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A5124MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
      A5125MaqHnpI1f = GXutil.resetTime( GXutil.nullDate() );
      A13684HNPInterv1 = DecimalUtil.ZERO ;
      A5126MaqHnpI2i = GXutil.resetTime( GXutil.nullDate() );
      A5127MaqHnpI2f = GXutil.resetTime( GXutil.nullDate() );
      A13685HNPInterv2 = DecimalUtil.ZERO ;
      A5128MaqHnpI3i = GXutil.resetTime( GXutil.nullDate() );
      A5129MaqHnpI3f = GXutil.resetTime( GXutil.nullDate() );
      A13686HNPInterv3 = DecimalUtil.ZERO ;
      AV18Station = "" ;
      GXv_char1 = new String[1] ;
      AV16EmprNom = "" ;
      AV20LitFe = "" ;
      AV19Lit0 = "" ;
      AV21Lit1 = "" ;
      AV22Lit2 = "" ;
      AV23Lit3 = "" ;
      AV24Lit4 = "" ;
      AV25Lit5 = "" ;
      GXt_char5 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char4 = "" ;
      GXv_char2 = new String[1] ;
      Z407EmprNom = "" ;
      Z606MaqDsc = "" ;
      T00OD6_A407EmprNom = new String[] {""} ;
      T00OD6_n407EmprNom = new boolean[] {false} ;
      T00OD7_A606MaqDsc = new String[] {""} ;
      T00OD7_n606MaqDsc = new boolean[] {false} ;
      T00OD8_A599MaqAny = new short[1] ;
      T00OD8_A614MaqMes = new byte[1] ;
      T00OD8_A606MaqDsc = new String[] {""} ;
      T00OD8_n606MaqDsc = new boolean[] {false} ;
      T00OD8_A610MaqHNPMes = new String[] {""} ;
      T00OD8_n610MaqHNPMes = new boolean[] {false} ;
      T00OD8_A407EmprNom = new String[] {""} ;
      T00OD8_n407EmprNom = new boolean[] {false} ;
      T00OD8_A396EmprCod = new String[] {""} ;
      T00OD8_A602MaqCod = new String[] {""} ;
      T00OD9_A396EmprCod = new String[] {""} ;
      T00OD9_A602MaqCod = new String[] {""} ;
      T00OD9_A599MaqAny = new short[1] ;
      T00OD9_A614MaqMes = new byte[1] ;
      T00OD5_A599MaqAny = new short[1] ;
      T00OD5_A614MaqMes = new byte[1] ;
      T00OD5_A610MaqHNPMes = new String[] {""} ;
      T00OD5_n610MaqHNPMes = new boolean[] {false} ;
      T00OD5_A396EmprCod = new String[] {""} ;
      T00OD5_A602MaqCod = new String[] {""} ;
      sMode67 = "" ;
      T00OD10_A396EmprCod = new String[] {""} ;
      T00OD10_A602MaqCod = new String[] {""} ;
      T00OD10_A599MaqAny = new short[1] ;
      T00OD10_A614MaqMes = new byte[1] ;
      T00OD11_A396EmprCod = new String[] {""} ;
      T00OD11_A602MaqCod = new String[] {""} ;
      T00OD11_A599MaqAny = new short[1] ;
      T00OD11_A614MaqMes = new byte[1] ;
      T00OD4_A599MaqAny = new short[1] ;
      T00OD4_A614MaqMes = new byte[1] ;
      T00OD4_A610MaqHNPMes = new String[] {""} ;
      T00OD4_n610MaqHNPMes = new boolean[] {false} ;
      T00OD4_A396EmprCod = new String[] {""} ;
      T00OD4_A602MaqCod = new String[] {""} ;
      T00OD15_A396EmprCod = new String[] {""} ;
      T00OD15_A602MaqCod = new String[] {""} ;
      T00OD15_A599MaqAny = new short[1] ;
      T00OD15_A614MaqMes = new byte[1] ;
      T00OD16_A602MaqCod = new String[] {""} ;
      T00OD16_A599MaqAny = new short[1] ;
      T00OD16_A614MaqMes = new byte[1] ;
      T00OD16_A5123MaqHnpDia = new byte[1] ;
      T00OD16_A5124MaqHnpI1i = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD16_n5124MaqHnpI1i = new boolean[] {false} ;
      T00OD16_A5125MaqHnpI1f = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD16_n5125MaqHnpI1f = new boolean[] {false} ;
      T00OD16_A5126MaqHnpI2i = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD16_n5126MaqHnpI2i = new boolean[] {false} ;
      T00OD16_A5127MaqHnpI2f = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD16_n5127MaqHnpI2f = new boolean[] {false} ;
      T00OD16_A5128MaqHnpI3i = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD16_n5128MaqHnpI3i = new boolean[] {false} ;
      T00OD16_A5129MaqHnpI3f = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD16_n5129MaqHnpI3f = new boolean[] {false} ;
      T00OD16_A396EmprCod = new String[] {""} ;
      T00OD17_A396EmprCod = new String[] {""} ;
      T00OD17_A602MaqCod = new String[] {""} ;
      T00OD17_A599MaqAny = new short[1] ;
      T00OD17_A614MaqMes = new byte[1] ;
      T00OD17_A5123MaqHnpDia = new byte[1] ;
      T00OD3_A602MaqCod = new String[] {""} ;
      T00OD3_A599MaqAny = new short[1] ;
      T00OD3_A614MaqMes = new byte[1] ;
      T00OD3_A5123MaqHnpDia = new byte[1] ;
      T00OD3_A5124MaqHnpI1i = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD3_n5124MaqHnpI1i = new boolean[] {false} ;
      T00OD3_A5125MaqHnpI1f = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD3_n5125MaqHnpI1f = new boolean[] {false} ;
      T00OD3_A5126MaqHnpI2i = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD3_n5126MaqHnpI2i = new boolean[] {false} ;
      T00OD3_A5127MaqHnpI2f = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD3_n5127MaqHnpI2f = new boolean[] {false} ;
      T00OD3_A5128MaqHnpI3i = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD3_n5128MaqHnpI3i = new boolean[] {false} ;
      T00OD3_A5129MaqHnpI3f = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD3_n5129MaqHnpI3f = new boolean[] {false} ;
      T00OD3_A396EmprCod = new String[] {""} ;
      T00OD2_A602MaqCod = new String[] {""} ;
      T00OD2_A599MaqAny = new short[1] ;
      T00OD2_A614MaqMes = new byte[1] ;
      T00OD2_A5123MaqHnpDia = new byte[1] ;
      T00OD2_A5124MaqHnpI1i = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD2_n5124MaqHnpI1i = new boolean[] {false} ;
      T00OD2_A5125MaqHnpI1f = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD2_n5125MaqHnpI1f = new boolean[] {false} ;
      T00OD2_A5126MaqHnpI2i = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD2_n5126MaqHnpI2i = new boolean[] {false} ;
      T00OD2_A5127MaqHnpI2f = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD2_n5127MaqHnpI2f = new boolean[] {false} ;
      T00OD2_A5128MaqHnpI3i = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD2_n5128MaqHnpI3i = new boolean[] {false} ;
      T00OD2_A5129MaqHnpI3f = new java.util.Date[] {GXutil.nullDate()} ;
      T00OD2_n5129MaqHnpI3f = new boolean[] {false} ;
      T00OD2_A396EmprCod = new String[] {""} ;
      T00OD21_A396EmprCod = new String[] {""} ;
      T00OD21_A602MaqCod = new String[] {""} ;
      T00OD21_A599MaqAny = new short[1] ;
      T00OD21_A614MaqMes = new byte[1] ;
      T00OD21_A5123MaqHnpDia = new byte[1] ;
      Gridtinthnp_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtinthnp_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtinthnp_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      T00OD22_A407EmprNom = new String[] {""} ;
      T00OD22_n407EmprNom = new boolean[] {false} ;
      T00OD23_A606MaqDsc = new String[] {""} ;
      T00OD23_n606MaqDsc = new boolean[] {false} ;
      ZV17UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ606MaqDsc = "" ;
      ZZ610MaqHNPMes = "" ;
      ZZ407EmprNom = "" ;
      ZZV17UsurCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tinthnp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tinthnp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tinthnp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tinthnp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tinthnp__default(),
         new Object[] {
             new Object[] {
            T00OD2_A602MaqCod, T00OD2_A599MaqAny, T00OD2_A614MaqMes, T00OD2_A5123MaqHnpDia, T00OD2_A5124MaqHnpI1i, T00OD2_n5124MaqHnpI1i, T00OD2_A5125MaqHnpI1f, T00OD2_n5125MaqHnpI1f, T00OD2_A5126MaqHnpI2i, T00OD2_n5126MaqHnpI2i,
            T00OD2_A5127MaqHnpI2f, T00OD2_n5127MaqHnpI2f, T00OD2_A5128MaqHnpI3i, T00OD2_n5128MaqHnpI3i, T00OD2_A5129MaqHnpI3f, T00OD2_n5129MaqHnpI3f, T00OD2_A396EmprCod
            }
            , new Object[] {
            T00OD3_A602MaqCod, T00OD3_A599MaqAny, T00OD3_A614MaqMes, T00OD3_A5123MaqHnpDia, T00OD3_A5124MaqHnpI1i, T00OD3_n5124MaqHnpI1i, T00OD3_A5125MaqHnpI1f, T00OD3_n5125MaqHnpI1f, T00OD3_A5126MaqHnpI2i, T00OD3_n5126MaqHnpI2i,
            T00OD3_A5127MaqHnpI2f, T00OD3_n5127MaqHnpI2f, T00OD3_A5128MaqHnpI3i, T00OD3_n5128MaqHnpI3i, T00OD3_A5129MaqHnpI3f, T00OD3_n5129MaqHnpI3f, T00OD3_A396EmprCod
            }
            , new Object[] {
            T00OD4_A599MaqAny, T00OD4_A614MaqMes, T00OD4_A610MaqHNPMes, T00OD4_n610MaqHNPMes, T00OD4_A396EmprCod, T00OD4_A602MaqCod
            }
            , new Object[] {
            T00OD5_A599MaqAny, T00OD5_A614MaqMes, T00OD5_A610MaqHNPMes, T00OD5_n610MaqHNPMes, T00OD5_A396EmprCod, T00OD5_A602MaqCod
            }
            , new Object[] {
            T00OD6_A407EmprNom, T00OD6_n407EmprNom
            }
            , new Object[] {
            T00OD7_A606MaqDsc, T00OD7_n606MaqDsc
            }
            , new Object[] {
            T00OD8_A599MaqAny, T00OD8_A614MaqMes, T00OD8_A606MaqDsc, T00OD8_n606MaqDsc, T00OD8_A610MaqHNPMes, T00OD8_n610MaqHNPMes, T00OD8_A407EmprNom, T00OD8_n407EmprNom, T00OD8_A396EmprCod, T00OD8_A602MaqCod
            }
            , new Object[] {
            T00OD9_A396EmprCod, T00OD9_A602MaqCod, T00OD9_A599MaqAny, T00OD9_A614MaqMes
            }
            , new Object[] {
            T00OD10_A396EmprCod, T00OD10_A602MaqCod, T00OD10_A599MaqAny, T00OD10_A614MaqMes
            }
            , new Object[] {
            T00OD11_A396EmprCod, T00OD11_A602MaqCod, T00OD11_A599MaqAny, T00OD11_A614MaqMes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00OD15_A396EmprCod, T00OD15_A602MaqCod, T00OD15_A599MaqAny, T00OD15_A614MaqMes
            }
            , new Object[] {
            T00OD16_A602MaqCod, T00OD16_A599MaqAny, T00OD16_A614MaqMes, T00OD16_A5123MaqHnpDia, T00OD16_A5124MaqHnpI1i, T00OD16_n5124MaqHnpI1i, T00OD16_A5125MaqHnpI1f, T00OD16_n5125MaqHnpI1f, T00OD16_A5126MaqHnpI2i, T00OD16_n5126MaqHnpI2i,
            T00OD16_A5127MaqHnpI2f, T00OD16_n5127MaqHnpI2f, T00OD16_A5128MaqHnpI3i, T00OD16_n5128MaqHnpI3i, T00OD16_A5129MaqHnpI3f, T00OD16_n5129MaqHnpI3f, T00OD16_A396EmprCod
            }
            , new Object[] {
            T00OD17_A396EmprCod, T00OD17_A602MaqCod, T00OD17_A599MaqAny, T00OD17_A614MaqMes, T00OD17_A5123MaqHnpDia
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00OD21_A396EmprCod, T00OD21_A602MaqCod, T00OD21_A599MaqAny, T00OD21_A614MaqMes, T00OD21_A5123MaqHnpDia
            }
            , new Object[] {
            T00OD22_A407EmprNom, T00OD22_n407EmprNom
            }
            , new Object[] {
            T00OD23_A606MaqDsc, T00OD23_n606MaqDsc
            }
         }
      );
      Z614MaqMes = (byte)(0) ;
      A614MaqMes = (byte)(0) ;
      Z599MaqAny = (short)(0) ;
      A599MaqAny = (short)(0) ;
      Z602MaqCod = "" ;
      A602MaqCod = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte wcpOA614MaqMes ;
   private byte Z614MaqMes ;
   private byte Z5123MaqHnpDia ;
   private byte GxWebError ;
   private byte A614MaqMes ;
   private byte nKeyPressed ;
   private byte A5123MaqHnpDia ;
   private byte A13683MaqHNPTota ;
   private byte Gx_BScreen ;
   private byte subGridtinthnp_level1item_Backcolorstyle ;
   private byte subGridtinthnp_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtinthnp_level1item_Allowselection ;
   private byte subGridtinthnp_level1item_Allowhovering ;
   private byte subGridtinthnp_level1item_Allowcollapsing ;
   private byte subGridtinthnp_level1item_Collapsed ;
   private byte ZZ614MaqMes ;
   private short wcpOA599MaqAny ;
   private short Z599MaqAny ;
   private short nRcdDeleted_748 ;
   private short nRcdExists_748 ;
   private short nIsMod_748 ;
   private short A599MaqAny ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount748 ;
   private short RcdFound748 ;
   private short nBlankRcdUsr748 ;
   private short RcdFound67 ;
   private short nIsDirty_67 ;
   private short nIsDirty_748 ;
   private short ZZ599MaqAny ;
   private int nRC_GXsfl_73 ;
   private int nGXsfl_73_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtMaqAny_Enabled ;
   private int edtMaqMes_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int edtMaqHNPMes_Enabled ;
   private int edtEmprNom_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtMaqHnpDia_Enabled ;
   private int edtMaqHnpI1i_Enabled ;
   private int edtMaqHnpI1f_Enabled ;
   private int edtHNPInterv1_Enabled ;
   private int edtMaqHnpI2i_Enabled ;
   private int edtMaqHnpI2f_Enabled ;
   private int edtHNPInterv2_Enabled ;
   private int edtMaqHnpI3i_Enabled ;
   private int edtMaqHnpI3f_Enabled ;
   private int edtHNPInterv3_Enabled ;
   private int edtMaqHNPTota_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtinthnp_level1item_Backcolor ;
   private int subGridtinthnp_level1item_Allbackcolor ;
   private int defedtMaqHnpDia_Enabled ;
   private int idxLst ;
   private int subGridtinthnp_level1item_Selectedindex ;
   private int subGridtinthnp_level1item_Selectioncolor ;
   private int subGridtinthnp_level1item_Hoveringcolor ;
   private long GRIDTINTHNP_LEVEL1ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal A13684HNPInterv1 ;
   private java.math.BigDecimal A13685HNPInterv2 ;
   private java.math.BigDecimal A13686HNPInterv3 ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA602MaqCod ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMaqHNPMes_Internalname ;
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
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtMaqCod_Internalname ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqAny_Internalname ;
   private String edtMaqAny_Jsonclick ;
   private String edtMaqMes_Internalname ;
   private String edtMaqMes_Jsonclick ;
   private String edtMaqDsc_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Jsonclick ;
   private String edtMaqHNPMes_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode748 ;
   private String edtMaqHnpDia_Title ;
   private String edtMaqHnpDia_Internalname ;
   private String edtMaqHnpI1i_Title ;
   private String edtMaqHnpI1i_Internalname ;
   private String edtMaqHnpI1f_Title ;
   private String edtMaqHnpI1f_Internalname ;
   private String edtHNPInterv1_Internalname ;
   private String edtMaqHnpI2i_Title ;
   private String edtMaqHnpI2i_Internalname ;
   private String edtMaqHnpI2f_Title ;
   private String edtMaqHnpI2f_Internalname ;
   private String edtHNPInterv2_Internalname ;
   private String edtMaqHnpI3i_Title ;
   private String edtMaqHnpI3i_Internalname ;
   private String edtMaqHnpI3f_Title ;
   private String edtMaqHnpI3f_Internalname ;
   private String edtHNPInterv3_Internalname ;
   private String edtMaqHNPTota_Internalname ;
   private String sStyleString ;
   private String subGridtinthnp_level1item_Internalname ;
   private String AV17UsurCod ;
   private String AV26Lit6 ;
   private String AV27Lit7 ;
   private String AV28Lit8 ;
   private String AV29Lit9 ;
   private String AV30Lit10 ;
   private String AV31Lit11 ;
   private String AV32Lit12 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String AV18Station ;
   private String GXv_char1[] ;
   private String AV16EmprNom ;
   private String AV20LitFe ;
   private String AV19Lit0 ;
   private String AV21Lit1 ;
   private String AV22Lit2 ;
   private String AV23Lit3 ;
   private String AV24Lit4 ;
   private String AV25Lit5 ;
   private String GXt_char5 ;
   private String GXv_char3[] ;
   private String GXt_char4 ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z606MaqDsc ;
   private String sMode67 ;
   private String sGXsfl_73_fel_idx="0001" ;
   private String subGridtinthnp_level1item_Class ;
   private String subGridtinthnp_level1item_Linesclass ;
   private String ROClassString ;
   private String edtMaqHnpDia_Jsonclick ;
   private String edtMaqHnpI1i_Jsonclick ;
   private String edtMaqHnpI1f_Jsonclick ;
   private String edtHNPInterv1_Jsonclick ;
   private String edtMaqHnpI2i_Jsonclick ;
   private String edtMaqHnpI2f_Jsonclick ;
   private String edtHNPInterv2_Jsonclick ;
   private String edtMaqHnpI3i_Jsonclick ;
   private String edtMaqHnpI3f_Jsonclick ;
   private String edtHNPInterv3_Jsonclick ;
   private String edtMaqHNPTota_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtinthnp_level1item_Header ;
   private String ZV17UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ606MaqDsc ;
   private String ZZ407EmprNom ;
   private String ZZV17UsurCod ;
   private java.util.Date Z5124MaqHnpI1i ;
   private java.util.Date Z5125MaqHnpI1f ;
   private java.util.Date Z5126MaqHnpI2i ;
   private java.util.Date Z5127MaqHnpI2f ;
   private java.util.Date Z5128MaqHnpI3i ;
   private java.util.Date Z5129MaqHnpI3f ;
   private java.util.Date A5124MaqHnpI1i ;
   private java.util.Date A5125MaqHnpI1f ;
   private java.util.Date A5126MaqHnpI2i ;
   private java.util.Date A5127MaqHnpI2f ;
   private java.util.Date A5128MaqHnpI3i ;
   private java.util.Date A5129MaqHnpI3f ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_73_Refreshing=false ;
   private boolean n606MaqDsc ;
   private boolean n610MaqHNPMes ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n5124MaqHnpI1i ;
   private boolean n5125MaqHnpI1f ;
   private boolean n5126MaqHnpI2i ;
   private boolean n5127MaqHnpI2f ;
   private boolean n5128MaqHnpI3i ;
   private boolean n5129MaqHnpI3f ;
   private boolean Gx_longc ;
   private String Z610MaqHNPMes ;
   private String A610MaqHNPMes ;
   private String ZZ610MaqHNPMes ;
   private com.genexus.webpanels.GXWebGrid Gridtinthnp_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtinthnp_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtinthnp_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private String[] T00OD6_A407EmprNom ;
   private boolean[] T00OD6_n407EmprNom ;
   private String[] T00OD7_A606MaqDsc ;
   private boolean[] T00OD7_n606MaqDsc ;
   private short[] T00OD8_A599MaqAny ;
   private byte[] T00OD8_A614MaqMes ;
   private String[] T00OD8_A606MaqDsc ;
   private boolean[] T00OD8_n606MaqDsc ;
   private String[] T00OD8_A610MaqHNPMes ;
   private boolean[] T00OD8_n610MaqHNPMes ;
   private String[] T00OD8_A407EmprNom ;
   private boolean[] T00OD8_n407EmprNom ;
   private String[] T00OD8_A396EmprCod ;
   private String[] T00OD8_A602MaqCod ;
   private String[] T00OD9_A396EmprCod ;
   private String[] T00OD9_A602MaqCod ;
   private short[] T00OD9_A599MaqAny ;
   private byte[] T00OD9_A614MaqMes ;
   private short[] T00OD5_A599MaqAny ;
   private byte[] T00OD5_A614MaqMes ;
   private String[] T00OD5_A610MaqHNPMes ;
   private boolean[] T00OD5_n610MaqHNPMes ;
   private String[] T00OD5_A396EmprCod ;
   private String[] T00OD5_A602MaqCod ;
   private String[] T00OD10_A396EmprCod ;
   private String[] T00OD10_A602MaqCod ;
   private short[] T00OD10_A599MaqAny ;
   private byte[] T00OD10_A614MaqMes ;
   private String[] T00OD11_A396EmprCod ;
   private String[] T00OD11_A602MaqCod ;
   private short[] T00OD11_A599MaqAny ;
   private byte[] T00OD11_A614MaqMes ;
   private short[] T00OD4_A599MaqAny ;
   private byte[] T00OD4_A614MaqMes ;
   private String[] T00OD4_A610MaqHNPMes ;
   private boolean[] T00OD4_n610MaqHNPMes ;
   private String[] T00OD4_A396EmprCod ;
   private String[] T00OD4_A602MaqCod ;
   private String[] T00OD15_A396EmprCod ;
   private String[] T00OD15_A602MaqCod ;
   private short[] T00OD15_A599MaqAny ;
   private byte[] T00OD15_A614MaqMes ;
   private String[] T00OD16_A602MaqCod ;
   private short[] T00OD16_A599MaqAny ;
   private byte[] T00OD16_A614MaqMes ;
   private byte[] T00OD16_A5123MaqHnpDia ;
   private java.util.Date[] T00OD16_A5124MaqHnpI1i ;
   private boolean[] T00OD16_n5124MaqHnpI1i ;
   private java.util.Date[] T00OD16_A5125MaqHnpI1f ;
   private boolean[] T00OD16_n5125MaqHnpI1f ;
   private java.util.Date[] T00OD16_A5126MaqHnpI2i ;
   private boolean[] T00OD16_n5126MaqHnpI2i ;
   private java.util.Date[] T00OD16_A5127MaqHnpI2f ;
   private boolean[] T00OD16_n5127MaqHnpI2f ;
   private java.util.Date[] T00OD16_A5128MaqHnpI3i ;
   private boolean[] T00OD16_n5128MaqHnpI3i ;
   private java.util.Date[] T00OD16_A5129MaqHnpI3f ;
   private boolean[] T00OD16_n5129MaqHnpI3f ;
   private String[] T00OD16_A396EmprCod ;
   private String[] T00OD17_A396EmprCod ;
   private String[] T00OD17_A602MaqCod ;
   private short[] T00OD17_A599MaqAny ;
   private byte[] T00OD17_A614MaqMes ;
   private byte[] T00OD17_A5123MaqHnpDia ;
   private String[] T00OD3_A602MaqCod ;
   private short[] T00OD3_A599MaqAny ;
   private byte[] T00OD3_A614MaqMes ;
   private byte[] T00OD3_A5123MaqHnpDia ;
   private java.util.Date[] T00OD3_A5124MaqHnpI1i ;
   private boolean[] T00OD3_n5124MaqHnpI1i ;
   private java.util.Date[] T00OD3_A5125MaqHnpI1f ;
   private boolean[] T00OD3_n5125MaqHnpI1f ;
   private java.util.Date[] T00OD3_A5126MaqHnpI2i ;
   private boolean[] T00OD3_n5126MaqHnpI2i ;
   private java.util.Date[] T00OD3_A5127MaqHnpI2f ;
   private boolean[] T00OD3_n5127MaqHnpI2f ;
   private java.util.Date[] T00OD3_A5128MaqHnpI3i ;
   private boolean[] T00OD3_n5128MaqHnpI3i ;
   private java.util.Date[] T00OD3_A5129MaqHnpI3f ;
   private boolean[] T00OD3_n5129MaqHnpI3f ;
   private String[] T00OD3_A396EmprCod ;
   private String[] T00OD2_A602MaqCod ;
   private short[] T00OD2_A599MaqAny ;
   private byte[] T00OD2_A614MaqMes ;
   private byte[] T00OD2_A5123MaqHnpDia ;
   private java.util.Date[] T00OD2_A5124MaqHnpI1i ;
   private boolean[] T00OD2_n5124MaqHnpI1i ;
   private java.util.Date[] T00OD2_A5125MaqHnpI1f ;
   private boolean[] T00OD2_n5125MaqHnpI1f ;
   private java.util.Date[] T00OD2_A5126MaqHnpI2i ;
   private boolean[] T00OD2_n5126MaqHnpI2i ;
   private java.util.Date[] T00OD2_A5127MaqHnpI2f ;
   private boolean[] T00OD2_n5127MaqHnpI2f ;
   private java.util.Date[] T00OD2_A5128MaqHnpI3i ;
   private boolean[] T00OD2_n5128MaqHnpI3i ;
   private java.util.Date[] T00OD2_A5129MaqHnpI3f ;
   private boolean[] T00OD2_n5129MaqHnpI3f ;
   private String[] T00OD2_A396EmprCod ;
   private String[] T00OD21_A396EmprCod ;
   private String[] T00OD21_A602MaqCod ;
   private short[] T00OD21_A599MaqAny ;
   private byte[] T00OD21_A614MaqMes ;
   private byte[] T00OD21_A5123MaqHnpDia ;
   private String[] T00OD22_A407EmprNom ;
   private boolean[] T00OD22_n407EmprNom ;
   private String[] T00OD23_A606MaqDsc ;
   private boolean[] T00OD23_n606MaqDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tinthnp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinthnp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinthnp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinthnp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinthnp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00OD2", "SELECT MaqCod, MaqAny, MaqMes, MaqHnpDia, MaqHnpI1i, MaqHnpI1f, MaqHnpI2i, MaqHnpI2f, MaqHnpI3i, MaqHnpI3f, EmprCod FROM TXPINTHNP WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ? AND MaqHnpDia = ?  FOR UPDATE OF MaqHnpI1i, MaqHnpI1f, MaqHnpI2i, MaqHnpI2f, MaqHnpI3i, MaqHnpI3f NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OD3", "SELECT MaqCod, MaqAny, MaqMes, MaqHnpDia, MaqHnpI1i, MaqHnpI1f, MaqHnpI2i, MaqHnpI2f, MaqHnpI3i, MaqHnpI3f, EmprCod FROM TXPINTHNP WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ? AND MaqHnpDia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OD4", "SELECT MaqAny, MaqMes, MaqHNPMes, EmprCod, MaqCod FROM TXPMAQHNP WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ?  FOR UPDATE OF MaqHNPMes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00OD5", "SELECT MaqAny, MaqMes, MaqHNPMes, EmprCod, MaqCod FROM TXPMAQHNP WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00OD6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00OD7", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00OD8", "SELECT /*+ FIRST_ROWS(1) */ TM1.MaqAny, TM1.MaqMes, T3.MaqDsc, TM1.MaqHNPMes, T2.EmprNom, TM1.EmprCod, TM1.MaqCod FROM ((TXPMAQHNP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.MaqCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.MaqAny = ? and TM1.MaqMes = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.MaqAny, TM1.MaqMes ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00OD9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00OD10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00OD11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod DESC, MaqCod DESC, MaqAny DESC, MaqMes DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00OD12", "INSERT INTO TXPMAQHNP(MaqAny, MaqMes, MaqHNPMes, EmprCod, MaqCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPMAQHNP")
         ,new UpdateCursor("T00OD13", "UPDATE TXPMAQHNP SET MaqHNPMes=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ?", GX_NOMASK, "TXPMAQHNP")
         ,new UpdateCursor("T00OD14", "DELETE FROM TXPMAQHNP  WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ?", GX_NOMASK, "TXPMAQHNP")
         ,new ForEachCursor("T00OD15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00OD16", "SELECT MaqCod, MaqAny, MaqMes, MaqHnpDia, MaqHnpI1i, MaqHnpI1f, MaqHnpI2i, MaqHnpI2f, MaqHnpI3i, MaqHnpI3f, EmprCod FROM TXPINTHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? and MaqHnpDia = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes, MaqHnpDia ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OD17", "SELECT EmprCod, MaqCod, MaqAny, MaqMes, MaqHnpDia FROM TXPINTHNP WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ? AND MaqHnpDia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00OD18", "INSERT INTO TXPINTHNP(MaqCod, MaqAny, MaqMes, MaqHnpDia, MaqHnpI1i, MaqHnpI1f, MaqHnpI2i, MaqHnpI2f, MaqHnpI3i, MaqHnpI3f, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPINTHNP")
         ,new UpdateCursor("T00OD19", "UPDATE TXPINTHNP SET MaqHnpI1i=?, MaqHnpI1f=?, MaqHnpI2i=?, MaqHnpI2f=?, MaqHnpI3i=?, MaqHnpI3f=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ? AND MaqHnpDia = ?", GX_NOMASK, "TXPINTHNP")
         ,new UpdateCursor("T00OD20", "DELETE FROM TXPINTHNP  WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ? AND MaqHnpDia = ?", GX_NOMASK, "TXPINTHNP")
         ,new ForEachCursor("T00OD21", "SELECT EmprCod, MaqCod, MaqAny, MaqMes, MaqHnpDia FROM TXPINTHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes, MaqHnpDia ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OD22", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00OD23", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 63);
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setString(5, (String)parms[5], 6);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 63);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[5], true);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[7], true);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], true);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[11], true);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[13], true);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[15], true);
               }
               stmt.setString(11, (String)parms[16], 3);
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], true);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], true);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], true);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], true);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], true);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[11], true);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setString(8, (String)parms[13], 6);
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               stmt.setByte(10, ((Number) parms[15]).byteValue());
               stmt.setByte(11, ((Number) parms[16]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

