package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdisqui_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         AV26F_existe = (byte)(GXutil.lval( httpContext.GetPar( "F_existe"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26F_existe", GXutil.str( AV26F_existe, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_8_PN780( A396EmprCod, A764ProForCod, AV26F_existe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
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
         gxload_18( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A764ProForCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtdisqui_level1item") == 0 )
      {
         gxnrgridtdisqui_level1item_newrow_invoke( ) ;
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
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A368DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PROCESOS QUIMICOS P/FASE", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridtdisqui_level1item_newrow_invoke( )
   {
      nRC_GXsfl_83 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_83"))) ;
      nGXsfl_83_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_83_idx"))) ;
      sGXsfl_83_idx = httpContext.GetPar( "sGXsfl_83_idx") ;
      edtDisQuiDsc_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiDsc_Internalname, "Title", edtDisQuiDsc_Title, !bGXsfl_83_Refreshing);
      edtDisQuiLin_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiLin_Internalname, "Title", edtDisQuiLin_Title, !bGXsfl_83_Refreshing);
      edtProForCod_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Title", edtProForCod_Title, !bGXsfl_83_Refreshing);
      A5376DisQuiUl = (short)(GXutil.lval( httpContext.GetPar( "DisQuiUl"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtdisqui_level1item_newrow( ) ;
      /* End function gxnrGridtdisqui_level1item_newrow_invoke */
   }

   public tdisqui_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdisqui_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdisqui_impl.class ));
   }

   public tdisqui_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "PROCESOS QUIMICOS P/FASE", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TDISQUI.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDISQUI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISQUI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisFasLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisFasLin_Internalname, httpContext.getMessage( "Linea Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisFasLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFasLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDisFasLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISQUI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISQUI.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISQUI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISQUI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisQuiUl_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisQuiUl_Internalname, httpContext.getMessage( "Ultimo nº de linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisQuiUl_Internalname, GXutil.ltrim( localUtil.ntoc( A5376DisQuiUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisQuiUl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5376DisQuiUl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5376DisQuiUl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisQuiUl_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDisQuiUl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISQUI.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TDISQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtdisqui_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtdisqui_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol83( ) ;
      nGXsfl_83_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount780 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_780 = (short)(1) ;
            scanStartPN780( ) ;
            while ( RcdFound780 != 0 )
            {
               init_level_properties780( ) ;
               getByPrimaryKeyPN780( ) ;
               addRowPN780( ) ;
               scanNextPN780( ) ;
            }
            scanEndPN780( ) ;
            nBlankRcdCount780 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B5376DisQuiUl = A5376DisQuiUl ;
         httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
         standaloneNotModalPN780( ) ;
         standaloneModalPN780( ) ;
         sMode780 = Gx_mode ;
         while ( nGXsfl_83_idx < nRC_GXsfl_83 )
         {
            bGXsfl_83_Refreshing = true ;
            readRowPN780( ) ;
            edtDisQuiLin_Title = httpContext.cgiGet( "DISQUILIN_"+sGXsfl_83_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisQuiLin_Internalname, "Title", edtDisQuiLin_Title, !bGXsfl_83_Refreshing);
            edtDisQuiLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISQUILIN_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisQuiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiLin_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtProForCod_Title = httpContext.cgiGet( "PROFORCOD_"+sGXsfl_83_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Title", edtProForCod_Title, !bGXsfl_83_Refreshing);
            edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtProForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtDisQuiDsc_Title = httpContext.cgiGet( "DISQUIDSC_"+sGXsfl_83_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisQuiDsc_Internalname, "Title", edtDisQuiDsc_Title, !bGXsfl_83_Refreshing);
            edtDisQuiDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISQUIDSC_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisQuiDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiDsc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtDisQuiNp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISQUINP_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisQuiNp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiNp_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtDisQuiTp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISQUITP_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisQuiTp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiTp_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtDisQuiRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISQUIRB_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisQuiRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiRb_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            if ( ( nRcdExists_780 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalPN780( ) ;
            }
            sendRowPN780( ) ;
            bGXsfl_83_Refreshing = false ;
         }
         Gx_mode = sMode780 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5376DisQuiUl = B5376DisQuiUl ;
         httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount780 = (short)(5) ;
         nRcdExists_780 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartPN780( ) ;
            while ( RcdFound780 != 0 )
            {
               sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_83780( ) ;
               init_level_properties780( ) ;
               standaloneNotModalPN780( ) ;
               getByPrimaryKeyPN780( ) ;
               standaloneModalPN780( ) ;
               addRowPN780( ) ;
               scanNextPN780( ) ;
            }
            scanEndPN780( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode780 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_83780( ) ;
      initAllPN780( ) ;
      init_level_properties780( ) ;
      B5376DisQuiUl = A5376DisQuiUl ;
      httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
      nRcdExists_780 = (short)(0) ;
      nIsMod_780 = (short)(0) ;
      nRcdDeleted_780 = (short)(0) ;
      nBlankRcdCount780 = (short)(nBlankRcdUsr780+nBlankRcdCount780) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount780 > 0 )
      {
         standaloneNotModalPN780( ) ;
         standaloneModalPN780( ) ;
         addRowPN780( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtProForCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount780 = (short)(nBlankRcdCount780-1) ;
      }
      Gx_mode = sMode780 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A5376DisQuiUl = B5376DisQuiUl ;
      httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtdisqui_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtdisqui_level1item", Gridtdisqui_level1itemContainer, subGridtdisqui_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtdisqui_level1itemContainerData", Gridtdisqui_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtdisqui_level1itemContainerData"+"V", Gridtdisqui_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtdisqui_level1itemContainerData"+"V"+"\" value='"+Gridtdisqui_level1itemContainer.GridValuesHidden()+"'/>") ;
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
      e11PN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z368DisFasLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5376DisQuiUl = (short)(localUtil.ctol( httpContext.cgiGet( "Z5376DisQuiUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            O5376DisQuiUl = (short)(localUtil.ctol( httpContext.cgiGet( "O5376DisQuiUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_83 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_83"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7744FasPreObl = (byte)(localUtil.ctol( httpContext.cgiGet( "FASPREOBL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7744FasPreObl = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35OldProf = httpContext.cgiGet( "vOLDPROF") ;
            AV26F_existe = (byte)(localUtil.ctol( httpContext.cgiGet( "vF_EXISTE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Error1 = httpContext.cgiGet( "vERROR1") ;
            AV33Msg2 = httpContext.cgiGet( "vMSG2") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A5376DisQuiUl = (short)(localUtil.ctol( httpContext.cgiGet( edtDisQuiUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A368DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
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
                        e11PN2 ();
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
            initAllPN39( ) ;
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
      disableAttributesPN39( ) ;
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

   public void confirm_PN780( )
   {
      s5376DisQuiUl = O5376DisQuiUl ;
      httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
      nGXsfl_83_idx = 0 ;
      while ( nGXsfl_83_idx < nRC_GXsfl_83 )
      {
         readRowPN780( ) ;
         if ( ( nRcdExists_780 != 0 ) || ( nIsMod_780 != 0 ) )
         {
            getKeyPN780( ) ;
            if ( ( nRcdExists_780 == 0 ) && ( nRcdDeleted_780 == 0 ) )
            {
               if ( RcdFound780 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidatePN780( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTablePN780( ) ;
                     closeExtendedTableCursorsPN780( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O5376DisQuiUl = A5376DisQuiUl ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound780 != 0 )
               {
                  if ( nRcdDeleted_780 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyPN780( ) ;
                     loadPN780( ) ;
                     beforeValidatePN780( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsPN780( ) ;
                        O5376DisQuiUl = A5376DisQuiUl ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_780 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidatePN780( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTablePN780( ) ;
                           closeExtendedTableCursorsPN780( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O5376DisQuiUl = A5376DisQuiUl ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_780 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtDisQuiLin_Internalname, GXutil.ltrim( localUtil.ntoc( A5377DisQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc)) ;
         httpContext.changePostValue( edtDisQuiDsc_Internalname, GXutil.rtrim( A5489DisQuiDsc)) ;
         httpContext.changePostValue( edtDisQuiNp_Internalname, GXutil.ltrim( localUtil.ntoc( A5378DisQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisQuiTp_Internalname, GXutil.ltrim( localUtil.ntoc( A5379DisQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisQuiRb_Internalname, GXutil.ltrim( localUtil.ntoc( A5380DisQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5377DisQuiLin_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z5377DisQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5489DisQuiDsc_"+sGXsfl_83_idx, GXutil.rtrim( Z5489DisQuiDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z5378DisQuiNp_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z5378DisQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5379DisQuiTp_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z5379DisQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5380DisQuiRb_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z5380DisQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_83_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_780_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_780_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_780_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N5489DisQuiDsc_"+sGXsfl_83_idx, GXutil.rtrim( A5489DisQuiDsc)) ;
         if ( nIsMod_780 != 0 )
         {
            httpContext.changePostValue( "DISQUILIN_"+sGXsfl_83_idx+"Title", GXutil.rtrim( edtDisQuiLin_Title)) ;
            httpContext.changePostValue( "DISQUILIN_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_83_idx+"Title", GXutil.rtrim( edtProForCod_Title)) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISQUIDSC_"+sGXsfl_83_idx+"Title", GXutil.rtrim( edtDisQuiDsc_Title)) ;
            httpContext.changePostValue( "DISQUIDSC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISQUINP_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiNp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISQUITP_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiTp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISQUIRB_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5376DisQuiUl = s5376DisQuiUl ;
      httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionPN0( )
   {
   }

   public void e11PN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tdisqui_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit0", AV14Lit0);
      GXt_char1 = AV19LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tdisqui_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19LitFe", AV19LitFe);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1099_", ""), (byte)(99), GXv_char2) ;
      tdisqui_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT15_", ""), (byte)(99), GXv_char2) ;
      tdisqui_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "FASCODC", ""), (byte)(99), GXv_char2) ;
      tdisqui_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      GXt_char1 = AV28Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1586_", ""), (byte)(99), GXv_char2) ;
      tdisqui_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit6", AV28Lit6);
      GXt_char1 = AV30Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN184_", ""), (byte)(99), GXv_char2) ;
      tdisqui_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit7", AV30Lit7);
      GXt_char1 = AV31Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      tdisqui_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit8", AV31Lit8);
      AV32Error1 = httpContext.getMessage( "Campo ", "") + GXutil.trim( AV31Lit8) + httpContext.getMessage( " Obligatorio", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Error1", AV32Error1);
      AV21Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Station", AV21Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char4[0] = AV18UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdisqui_impl.this.A396EmprCod = GXv_char2[0] ;
      tdisqui_impl.this.AV22EmprNom = GXv_char3[0] ;
      tdisqui_impl.this.AV18UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprNom", AV22EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV18UsurCod", AV18UsurCod);
      AV20EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      GXt_int5 = AV29F_laundry ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "LAUNDR", ""), GXv_int6) ;
      tdisqui_impl.this.GXt_int5 = GXv_int6[0] ;
      AV29F_laundry = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29F_laundry", GXutil.str( AV29F_laundry, 1, 0));
      GXt_int5 = AV34Ibatex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "IBATEX", ""), GXv_int6) ;
      tdisqui_impl.this.GXt_int5 = GXv_int6[0] ;
      AV34Ibatex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Ibatex", GXutil.str( AV34Ibatex, 1, 0));
      GXt_char1 = AV33Msg2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGLR031_", ""), (byte)(99), GXv_char4) ;
      tdisqui_impl.this.GXt_char1 = GXv_char4[0] ;
      AV33Msg2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Msg2", AV33Msg2);
      GXt_char1 = AV27Msg1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG886_", ""), (byte)(99), GXv_char4) ;
      tdisqui_impl.this.GXt_char1 = GXv_char4[0] ;
      AV27Msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Msg1", AV27Msg1);
      edtDisQuiDsc_Title = AV28Lit6 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiDsc_Internalname, "Title", edtDisQuiDsc_Title, !bGXsfl_83_Refreshing);
      edtDisQuiLin_Title = AV30Lit7 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiLin_Internalname, "Title", edtDisQuiLin_Title, !bGXsfl_83_Refreshing);
      edtProForCod_Title = AV31Lit8 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Title", edtProForCod_Title, !bGXsfl_83_Refreshing);
   }

   public void zmPN39( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5376DisQuiUl = T00PN6_A5376DisQuiUl[0] ;
            Z457FasCod = T00PN6_A457FasCod[0] ;
         }
         else
         {
            Z5376DisQuiUl = A5376DisQuiUl ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z368DisFasLin = A368DisFasLin ;
         Z5376DisQuiUl = A5376DisQuiUl ;
         Z7744FasPreObl = A7744FasPreObl ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         Z407EmprNom = A407EmprNom ;
         Z759ProDsc = A759ProDsc ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDisQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiUl_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDisQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiUl_Enabled), 5, 0), true);
      /* Using cursor T00PN7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00PN7_A407EmprNom[0] ;
      n407EmprNom = T00PN7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T00PN8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T00PN8_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(6);
      /* Using cursor T00PN9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
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

   public void loadPN39( )
   {
      /* Using cursor T00PN11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A759ProDsc = T00PN11_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A460FasDsc = T00PN11_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A407EmprNom = T00PN11_A407EmprNom[0] ;
         n407EmprNom = T00PN11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A5376DisQuiUl = T00PN11_A5376DisQuiUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
         A7744FasPreObl = T00PN11_A7744FasPreObl[0] ;
         n7744FasPreObl = T00PN11_n7744FasPreObl[0] ;
         A457FasCod = T00PN11_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         zmPN39( -14) ;
      }
      pr_default.close(9);
      onLoadActionsPN39( ) ;
   }

   public void onLoadActionsPN39( )
   {
   }

   public void checkExtendedTablePN39( )
   {
      nIsDirty_39 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T00PN10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T00PN10_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A7744FasPreObl = T00PN10_A7744FasPreObl[0] ;
      n7744FasPreObl = T00PN10_n7744FasPreObl[0] ;
      pr_default.close(8);
   }

   public void closeExtendedTableCursorsPN39( )
   {
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_18( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T00PN12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T00PN12_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A7744FasPreObl = T00PN12_A7744FasPreObl[0] ;
      n7744FasPreObl = T00PN12_n7744FasPreObl[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKeyPN39( )
   {
      /* Using cursor T00PN13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00PN6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(4) != 101) && ( T00PN6_A368DisFasLin[0] == A368DisFasLin ) && ( GXutil.strcmp(T00PN6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00PN6_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T00PN6_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zmPN39( 14) ;
         RcdFound39 = (short)(1) ;
         A5376DisQuiUl = T00PN6_A5376DisQuiUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
         A457FasCod = T00PN6_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         O5376DisQuiUl = A5376DisQuiUl ;
         httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadPN39( ) ;
         if ( AnyError == 1 )
         {
            RcdFound39 = (short)(0) ;
            initializeNonKeyPN39( ) ;
         }
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKeyPN39( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyPN39( ) ;
      if ( RcdFound39 == 0 )
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
      RcdFound39 = (short)(0) ;
      /* Using cursor T00PN14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T00PN14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00PN14_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T00PN14_A758ProCod[0], A758ProCod) == 0 ) && ( T00PN14_A368DisFasLin[0] == A368DisFasLin ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T00PN14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00PN14_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T00PN14_A758ProCod[0], A758ProCod) == 0 ) && ( T00PN14_A368DisFasLin[0] == A368DisFasLin ) )
         {
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound39 = (short)(0) ;
      /* Using cursor T00PN15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T00PN15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00PN15_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T00PN15_A758ProCod[0], A758ProCod) == 0 ) && ( T00PN15_A368DisFasLin[0] == A368DisFasLin ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T00PN15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00PN15_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T00PN15_A758ProCod[0], A758ProCod) == 0 ) && ( T00PN15_A368DisFasLin[0] == A368DisFasLin ) )
         {
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyPN39( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A5376DisQuiUl = O5376DisQuiUl ;
         httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertPN39( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound39 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A5376DisQuiUl = O5376DisQuiUl ;
               httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A5376DisQuiUl = O5376DisQuiUl ;
               httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
               updatePN39( ) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A5376DisQuiUl = O5376DisQuiUl ;
               httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertPN39( ) ;
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
                  A5376DisQuiUl = O5376DisQuiUl ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertPN39( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A5376DisQuiUl = O5376DisQuiUl ;
         httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFasCod_Internalname ;
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
      if ( RcdFound39 == 0 )
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
      scanStartPN39( ) ;
      if ( RcdFound39 == 0 )
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
      scanEndPN39( ) ;
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
      if ( RcdFound39 == 0 )
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
      if ( RcdFound39 == 0 )
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
      scanStartPN39( ) ;
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound39 != 0 )
         {
            scanNextPN39( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndPN39( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyPN39( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00PN5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z5376DisQuiUl != T00PN5_A5376DisQuiUl[0] ) || ( GXutil.strcmp(Z457FasCod, T00PN5_A457FasCod[0]) != 0 ) )
         {
            if ( Z5376DisQuiUl != T00PN5_A5376DisQuiUl[0] )
            {
               GXutil.writeLogln("tdisqui:[seudo value changed for attri]"+"DisQuiUl");
               GXutil.writeLogRaw("Old: ",Z5376DisQuiUl);
               GXutil.writeLogRaw("Current: ",T00PN5_A5376DisQuiUl[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T00PN5_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("tdisqui:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T00PN5_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertPN39( )
   {
      beforeValidatePN39( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTablePN39( ) ;
      }
      if ( AnyError == 0 )
      {
         zmPN39( 0) ;
         checkOptimisticConcurrencyPN39( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmPN39( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertPN39( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00PN16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Short.valueOf(A368DisFasLin), Short.valueOf(A5376DisQuiUl), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        processLevelPN39( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionPN0( ) ;
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
            loadPN39( ) ;
         }
         endLevelPN39( ) ;
      }
      closeExtendedTableCursorsPN39( ) ;
   }

   public void updatePN39( )
   {
      beforeValidatePN39( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTablePN39( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyPN39( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmPN39( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdatePN39( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00PN17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Short.valueOf(A5376DisQuiUl), A457FasCod, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdatePN39( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelPN39( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionPN0( ) ;
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
         endLevelPN39( ) ;
      }
      closeExtendedTableCursorsPN39( ) ;
   }

   public void deferredUpdatePN39( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidatePN39( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyPN39( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsPN39( ) ;
         afterConfirmPN39( ) ;
         if ( AnyError == 0 )
         {
            beforeDeletePN39( ) ;
            if ( AnyError == 0 )
            {
               A5376DisQuiUl = O5376DisQuiUl ;
               httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
               scanStartPN780( ) ;
               while ( RcdFound780 != 0 )
               {
                  getByPrimaryKeyPN780( ) ;
                  deletePN780( ) ;
                  scanNextPN780( ) ;
                  O5376DisQuiUl = A5376DisQuiUl ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
               }
               scanEndPN780( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00PN18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound39 == 0 )
                        {
                           initAllPN39( ) ;
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
                        resetCaptionPN0( ) ;
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
      sMode39 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelPN39( ) ;
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsPN39( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00PN19 */
         pr_default.execute(17, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T00PN19_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A7744FasPreObl = T00PN19_A7744FasPreObl[0] ;
         n7744FasPreObl = T00PN19_n7744FasPreObl[0] ;
         pr_default.close(17);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00PN20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00PN21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisFPA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00PN22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00PN23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void processNestedLevelPN780( )
   {
      s5376DisQuiUl = O5376DisQuiUl ;
      httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
      nGXsfl_83_idx = 0 ;
      while ( nGXsfl_83_idx < nRC_GXsfl_83 )
      {
         readRowPN780( ) ;
         if ( ( nRcdExists_780 != 0 ) || ( nIsMod_780 != 0 ) )
         {
            standaloneNotModalPN780( ) ;
            getKeyPN780( ) ;
            if ( ( nRcdExists_780 == 0 ) && ( nRcdDeleted_780 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertPN780( ) ;
            }
            else
            {
               if ( RcdFound780 != 0 )
               {
                  if ( ( nRcdDeleted_780 != 0 ) && ( nRcdExists_780 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deletePN780( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_780 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updatePN780( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_780 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O5376DisQuiUl = A5376DisQuiUl ;
            httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
         }
         httpContext.changePostValue( edtDisQuiLin_Internalname, GXutil.ltrim( localUtil.ntoc( A5377DisQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc)) ;
         httpContext.changePostValue( edtDisQuiDsc_Internalname, GXutil.rtrim( A5489DisQuiDsc)) ;
         httpContext.changePostValue( edtDisQuiNp_Internalname, GXutil.ltrim( localUtil.ntoc( A5378DisQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisQuiTp_Internalname, GXutil.ltrim( localUtil.ntoc( A5379DisQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisQuiRb_Internalname, GXutil.ltrim( localUtil.ntoc( A5380DisQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5377DisQuiLin_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z5377DisQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5489DisQuiDsc_"+sGXsfl_83_idx, GXutil.rtrim( Z5489DisQuiDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z5378DisQuiNp_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z5378DisQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5379DisQuiTp_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z5379DisQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5380DisQuiRb_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z5380DisQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_83_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_780_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_780_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_780_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N5489DisQuiDsc_"+sGXsfl_83_idx, GXutil.rtrim( A5489DisQuiDsc)) ;
         if ( nIsMod_780 != 0 )
         {
            httpContext.changePostValue( "DISQUILIN_"+sGXsfl_83_idx+"Title", GXutil.rtrim( edtDisQuiLin_Title)) ;
            httpContext.changePostValue( "DISQUILIN_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_83_idx+"Title", GXutil.rtrim( edtProForCod_Title)) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISQUIDSC_"+sGXsfl_83_idx+"Title", GXutil.rtrim( edtDisQuiDsc_Title)) ;
            httpContext.changePostValue( "DISQUIDSC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISQUINP_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiNp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISQUITP_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiTp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISQUIRB_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllPN780( ) ;
      if ( AnyError != 0 )
      {
         O5376DisQuiUl = s5376DisQuiUl ;
         httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
      }
      nRcdExists_780 = (short)(0) ;
      nIsMod_780 = (short)(0) ;
      nRcdDeleted_780 = (short)(0) ;
   }

   public void processLevelPN39( )
   {
      /* Save parent mode. */
      sMode39 = Gx_mode ;
      processNestedLevelPN780( ) ;
      if ( AnyError != 0 )
      {
         O5376DisQuiUl = s5376DisQuiUl ;
         httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00PN24 */
      pr_default.execute(22, new Object[] {Short.valueOf(A5376DisQuiUl), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
   }

   public void endLevelPN39( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeCompletePN39( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdisqui");
         if ( AnyError == 0 )
         {
            confirmValuesPN0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdisqui");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartPN39( )
   {
      /* Scan By routine */
      /* Using cursor T00PN25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextPN39( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
   }

   public void scanEndPN39( )
   {
      pr_default.close(23);
   }

   public void afterConfirmPN39( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertPN39( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdatePN39( )
   {
      /* Before Update Rules */
   }

   public void beforeDeletePN39( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompletePN39( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidatePN39( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesPN39( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtDisFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDisQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiUl_Enabled), 5, 0), true);
   }

   public void zmPN780( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5489DisQuiDsc = T00PN3_A5489DisQuiDsc[0] ;
            Z5378DisQuiNp = T00PN3_A5378DisQuiNp[0] ;
            Z5379DisQuiTp = T00PN3_A5379DisQuiTp[0] ;
            Z5380DisQuiRb = T00PN3_A5380DisQuiRb[0] ;
            Z764ProForCod = T00PN3_A764ProForCod[0] ;
         }
         else
         {
            Z5489DisQuiDsc = A5489DisQuiDsc ;
            Z5378DisQuiNp = A5378DisQuiNp ;
            Z5379DisQuiTp = A5379DisQuiTp ;
            Z5380DisQuiRb = A5380DisQuiRb ;
            Z764ProForCod = A764ProForCod ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z5377DisQuiLin = A5377DisQuiLin ;
         Z5489DisQuiDsc = A5489DisQuiDsc ;
         Z5378DisQuiNp = A5378DisQuiNp ;
         Z5379DisQuiTp = A5379DisQuiTp ;
         Z5380DisQuiRb = A5380DisQuiRb ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z766ProForDsc = A766ProForDsc ;
      }
   }

   public void standaloneNotModalPN780( )
   {
      edtDisQuiLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiLin_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtDisQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiUl_Enabled), 5, 0), true);
      edtDisQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiUl_Enabled), 5, 0), true);
   }

   public void standaloneModalPN780( )
   {
      if ( isIns( )  )
      {
         A5376DisQuiUl = (short)(O5376DisQuiUl+10) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A5377DisQuiLin = A5376DisQuiUl ;
      }
   }

   public void loadPN780( )
   {
      /* Using cursor T00PN26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound780 = (short)(1) ;
         A766ProForDsc = T00PN26_A766ProForDsc[0] ;
         A5489DisQuiDsc = T00PN26_A5489DisQuiDsc[0] ;
         A5378DisQuiNp = T00PN26_A5378DisQuiNp[0] ;
         A5379DisQuiTp = T00PN26_A5379DisQuiTp[0] ;
         A5380DisQuiRb = T00PN26_A5380DisQuiRb[0] ;
         A764ProForCod = T00PN26_A764ProForCod[0] ;
         zmPN780( -19) ;
      }
      pr_default.close(24);
      onLoadActionsPN780( ) ;
   }

   public void onLoadActionsPN780( )
   {
      AV35OldProf = A764ProForCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldProf", AV35OldProf);
      if ( GXutil.strcmp(GXutil.trim( A5489DisQuiDsc), "@") == 0 )
      {
         edtDisQuiDsc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisQuiDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiDsc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      }
      else
      {
         edtDisQuiDsc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisQuiDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiDsc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      }
   }

   public void checkExtendedTablePN780( )
   {
      nIsDirty_780 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalPN780( ) ;
      /* Using cursor T00PN4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T00PN4_A766ProForDsc[0] ;
      pr_default.close(2);
      AV35OldProf = A764ProForCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldProf", AV35OldProf);
      if ( true /* After */ && ! (GXutil.strcmp("", A764ProForCod)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A764ProForCod ;
         GXv_int6[0] = AV26F_existe ;
         GXv_char2[0] = "" ;
         new app.pbusprot(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_char2) ;
         tdisqui_impl.this.A396EmprCod = GXv_char4[0] ;
         tdisqui_impl.this.A764ProForCod = GXv_char3[0] ;
         tdisqui_impl.this.AV26F_existe = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV26F_existe", GXutil.str( AV26F_existe, 1, 0));
      }
      if ( true /* After */ && ! (GXutil.strcmp("", A764ProForCod)==0) && ( AV26F_existe == 0 ) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(AV27Msg1, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && ( GXutil.strcmp(GXutil.trim( A5489DisQuiDsc), "@") == 0 ) && isUpd( )  && ( GXutil.strcmp(A764ProForCod, AV35OldProf) != 0 ) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(AV33Msg2, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(GXutil.trim( A5489DisQuiDsc), "@") == 0 )
      {
         edtDisQuiDsc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisQuiDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiDsc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      }
      else
      {
         edtDisQuiDsc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisQuiDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiDsc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      }
   }

   public void closeExtendedTableCursorsPN780( )
   {
      pr_default.close(2);
   }

   public void enableDisablePN780( )
   {
   }

   public void gxload_20( String A396EmprCod ,
                          String A764ProForCod )
   {
      /* Using cursor T00PN27 */
      pr_default.execute(25, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T00PN27_A766ProForDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(25) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
   }

   public void getKeyPN780( )
   {
      /* Using cursor T00PN28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound780 = (short)(1) ;
      }
      else
      {
         RcdFound780 = (short)(0) ;
      }
      pr_default.close(26);
   }

   public void getByPrimaryKeyPN780( )
   {
      /* Using cursor T00PN3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T00PN3_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T00PN3_A758ProCod[0], A758ProCod) == 0 ) && ( T00PN3_A368DisFasLin[0] == A368DisFasLin ) && ( GXutil.strcmp(T00PN3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmPN780( 19) ;
         RcdFound780 = (short)(1) ;
         initializeNonKeyPN780( ) ;
         A5377DisQuiLin = T00PN3_A5377DisQuiLin[0] ;
         A5489DisQuiDsc = T00PN3_A5489DisQuiDsc[0] ;
         A5378DisQuiNp = T00PN3_A5378DisQuiNp[0] ;
         A5379DisQuiTp = T00PN3_A5379DisQuiTp[0] ;
         A5380DisQuiRb = T00PN3_A5380DisQuiRb[0] ;
         A764ProForCod = T00PN3_A764ProForCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z5377DisQuiLin = A5377DisQuiLin ;
         sMode780 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalPN780( ) ;
         loadPN780( ) ;
         Gx_mode = sMode780 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound780 = (short)(0) ;
         initializeNonKeyPN780( ) ;
         sMode780 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalPN780( ) ;
         Gx_mode = sMode780 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesPN780( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyPN780( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00PN2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISQUI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z5489DisQuiDsc, T00PN2_A5489DisQuiDsc[0]) != 0 ) || ( Z5378DisQuiNp != T00PN2_A5378DisQuiNp[0] ) || ( Z5379DisQuiTp != T00PN2_A5379DisQuiTp[0] ) || ( Z5380DisQuiRb != T00PN2_A5380DisQuiRb[0] ) || ( GXutil.strcmp(Z764ProForCod, T00PN2_A764ProForCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z5489DisQuiDsc, T00PN2_A5489DisQuiDsc[0]) != 0 )
            {
               GXutil.writeLogln("tdisqui:[seudo value changed for attri]"+"DisQuiDsc");
               GXutil.writeLogRaw("Old: ",Z5489DisQuiDsc);
               GXutil.writeLogRaw("Current: ",T00PN2_A5489DisQuiDsc[0]);
            }
            if ( Z5378DisQuiNp != T00PN2_A5378DisQuiNp[0] )
            {
               GXutil.writeLogln("tdisqui:[seudo value changed for attri]"+"DisQuiNp");
               GXutil.writeLogRaw("Old: ",Z5378DisQuiNp);
               GXutil.writeLogRaw("Current: ",T00PN2_A5378DisQuiNp[0]);
            }
            if ( Z5379DisQuiTp != T00PN2_A5379DisQuiTp[0] )
            {
               GXutil.writeLogln("tdisqui:[seudo value changed for attri]"+"DisQuiTp");
               GXutil.writeLogRaw("Old: ",Z5379DisQuiTp);
               GXutil.writeLogRaw("Current: ",T00PN2_A5379DisQuiTp[0]);
            }
            if ( Z5380DisQuiRb != T00PN2_A5380DisQuiRb[0] )
            {
               GXutil.writeLogln("tdisqui:[seudo value changed for attri]"+"DisQuiRb");
               GXutil.writeLogRaw("Old: ",Z5380DisQuiRb);
               GXutil.writeLogRaw("Current: ",T00PN2_A5380DisQuiRb[0]);
            }
            if ( GXutil.strcmp(Z764ProForCod, T00PN2_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("tdisqui:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T00PN2_A764ProForCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISQUI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertPN780( )
   {
      beforeValidatePN780( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTablePN780( ) ;
      }
      if ( AnyError == 0 )
      {
         zmPN780( 0) ;
         checkOptimisticConcurrencyPN780( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmPN780( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertPN780( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00PN29 */
                  pr_default.execute(27, new Object[] {Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin), A5489DisQuiDsc, Short.valueOf(A5378DisQuiNp), Short.valueOf(A5379DisQuiTp), Short.valueOf(A5380DisQuiRb), A396EmprCod, A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
                  if ( (pr_default.getStatus(27) == 1) )
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
            loadPN780( ) ;
         }
         endLevelPN780( ) ;
      }
      closeExtendedTableCursorsPN780( ) ;
   }

   public void updatePN780( )
   {
      beforeValidatePN780( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTablePN780( ) ;
      }
      if ( ( nIsMod_780 != 0 ) || ( nIsDirty_780 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyPN780( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmPN780( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdatePN780( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00PN30 */
                     pr_default.execute(28, new Object[] {A5489DisQuiDsc, Short.valueOf(A5378DisQuiNp), Short.valueOf(A5379DisQuiTp), Short.valueOf(A5380DisQuiRb), A764ProForCod, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
                     if ( (pr_default.getStatus(28) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISQUI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdatePN780( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyPN780( ) ;
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
            endLevelPN780( ) ;
         }
      }
      closeExtendedTableCursorsPN780( ) ;
   }

   public void deferredUpdatePN780( )
   {
   }

   public void deletePN780( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidatePN780( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyPN780( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsPN780( ) ;
         afterConfirmPN780( ) ;
         if ( AnyError == 0 )
         {
            beforeDeletePN780( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00PN31 */
               pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
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
      sMode780 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelPN780( ) ;
      Gx_mode = sMode780 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsPN780( )
   {
      standaloneModalPN780( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00PN32 */
         pr_default.execute(30, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T00PN32_A766ProForDsc[0] ;
         pr_default.close(30);
         AV35OldProf = A764ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35OldProf", AV35OldProf);
         if ( GXutil.strcmp(GXutil.trim( A5489DisQuiDsc), "@") == 0 )
         {
            edtDisQuiDsc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisQuiDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiDsc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
         }
         else
         {
            edtDisQuiDsc_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisQuiDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiDsc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
         }
         if ( true /* Level */ && ( GXutil.strcmp(GXutil.trim( A5489DisQuiDsc), "@") == 0 ) && isDlt( )  )
         {
            GXCCtl = "DISQUIDSC_" + sGXsfl_83_idx ;
            httpContext.GX_msglist.addItem(AV33Msg2, 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisQuiDsc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
   }

   public void endLevelPN780( )
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

   public void scanStartPN780( )
   {
      /* Scan By routine */
      /* Using cursor T00PN33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      RcdFound780 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound780 = (short)(1) ;
         A5377DisQuiLin = T00PN33_A5377DisQuiLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextPN780( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound780 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound780 = (short)(1) ;
         A5377DisQuiLin = T00PN33_A5377DisQuiLin[0] ;
      }
   }

   public void scanEndPN780( )
   {
      pr_default.close(31);
   }

   public void afterConfirmPN780( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && (GXutil.strcmp("", A764ProForCod)==0) && (GXutil.strcmp("", A5489DisQuiDsc)==0) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(AV32Error1, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsertPN780( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdatePN780( )
   {
      /* Before Update Rules */
   }

   public void beforeDeletePN780( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompletePN780( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidatePN780( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesPN780( )
   {
      edtDisQuiLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiLin_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtDisQuiDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiDsc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtDisQuiNp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiNp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiNp_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtDisQuiTp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiTp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiTp_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtDisQuiRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiRb_Enabled), 5, 0), !bGXsfl_83_Refreshing);
   }

   public void send_integrity_lvl_hashesPN780( )
   {
   }

   public void send_integrity_lvl_hashesPN39( )
   {
   }

   public void subsflControlProps_83780( )
   {
      edtDisQuiLin_Internalname = "DISQUILIN_"+sGXsfl_83_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_83_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_83_idx ;
      edtDisQuiDsc_Internalname = "DISQUIDSC_"+sGXsfl_83_idx ;
      edtDisQuiNp_Internalname = "DISQUINP_"+sGXsfl_83_idx ;
      edtDisQuiTp_Internalname = "DISQUITP_"+sGXsfl_83_idx ;
      edtDisQuiRb_Internalname = "DISQUIRB_"+sGXsfl_83_idx ;
   }

   public void subsflControlProps_fel_83780( )
   {
      edtDisQuiLin_Internalname = "DISQUILIN_"+sGXsfl_83_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_83_fel_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_83_fel_idx ;
      edtDisQuiDsc_Internalname = "DISQUIDSC_"+sGXsfl_83_fel_idx ;
      edtDisQuiNp_Internalname = "DISQUINP_"+sGXsfl_83_fel_idx ;
      edtDisQuiTp_Internalname = "DISQUITP_"+sGXsfl_83_fel_idx ;
      edtDisQuiRb_Internalname = "DISQUIRB_"+sGXsfl_83_fel_idx ;
   }

   public void addRowPN780( )
   {
      nGXsfl_83_idx = (int)(nGXsfl_83_idx+1) ;
      sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_83780( ) ;
      sendRowPN780( ) ;
   }

   public void sendRowPN780( )
   {
      Gridtdisqui_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtdisqui_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtdisqui_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtdisqui_level1item_Class, "") != 0 )
         {
            subGridtdisqui_level1item_Linesclass = subGridtdisqui_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtdisqui_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtdisqui_level1item_Backstyle = (byte)(0) ;
         subGridtdisqui_level1item_Backcolor = subGridtdisqui_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtdisqui_level1item_Class, "") != 0 )
         {
            subGridtdisqui_level1item_Linesclass = subGridtdisqui_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtdisqui_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtdisqui_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtdisqui_level1item_Class, "") != 0 )
         {
            subGridtdisqui_level1item_Linesclass = subGridtdisqui_level1item_Class+"Odd" ;
         }
         subGridtdisqui_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtdisqui_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtdisqui_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_83_idx) % (2))) == 0 )
         {
            subGridtdisqui_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtdisqui_level1item_Class, "") != 0 )
            {
               subGridtdisqui_level1item_Linesclass = subGridtdisqui_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtdisqui_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtdisqui_level1item_Class, "") != 0 )
            {
               subGridtdisqui_level1item_Linesclass = subGridtdisqui_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdisqui_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisQuiLin_Internalname,GXutil.ltrim( localUtil.ntoc( A5377DisQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisQuiLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5377DisQuiLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5377DisQuiLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisQuiLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisQuiLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_780_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridtdisqui_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdisqui_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_780_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridtdisqui_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisQuiDsc_Internalname,GXutil.rtrim( A5489DisQuiDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisQuiDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisQuiDsc_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_780_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridtdisqui_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisQuiNp_Internalname,GXutil.ltrim( localUtil.ntoc( A5378DisQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisQuiNp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5378DisQuiNp), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5378DisQuiNp), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisQuiNp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisQuiNp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_780_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridtdisqui_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisQuiTp_Internalname,GXutil.ltrim( localUtil.ntoc( A5379DisQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisQuiTp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5379DisQuiTp), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5379DisQuiTp), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisQuiTp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisQuiTp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_780_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridtdisqui_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisQuiRb_Internalname,GXutil.ltrim( localUtil.ntoc( A5380DisQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisQuiRb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5380DisQuiRb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5380DisQuiRb), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisQuiRb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisQuiRb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridtdisqui_level1itemRow);
      send_integrity_lvl_hashesPN780( ) ;
      GXCCtl = "Z5377DisQuiLin_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5377DisQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5489DisQuiDsc_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5489DisQuiDsc));
      GXCCtl = "Z5378DisQuiNp_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5378DisQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5379DisQuiTp_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5379DisQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5380DisQuiRb_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5380DisQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z764ProForCod_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z764ProForCod));
      GXCCtl = "nRcdDeleted_780_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_780_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_780_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_780, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N5489DisQuiDsc_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A5489DisQuiDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "DISQUILIN_"+sGXsfl_83_idx+"Title", GXutil.rtrim( edtDisQuiLin_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DISQUILIN_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD_"+sGXsfl_83_idx+"Title", GXutil.rtrim( edtProForCod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDSC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISQUIDSC_"+sGXsfl_83_idx+"Title", GXutil.rtrim( edtDisQuiDsc_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DISQUIDSC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISQUINP_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiNp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISQUITP_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiTp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISQUIRB_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtdisqui_level1itemContainer.AddRow(Gridtdisqui_level1itemRow);
   }

   public void readRowPN780( )
   {
      nGXsfl_83_idx = (int)(nGXsfl_83_idx+1) ;
      sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_83780( ) ;
      edtDisQuiLin_Title = httpContext.cgiGet( "DISQUILIN_"+sGXsfl_83_idx+"Title") ;
      edtDisQuiLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISQUILIN_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCod_Title = httpContext.cgiGet( "PROFORCOD_"+sGXsfl_83_idx+"Title") ;
      edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisQuiDsc_Title = httpContext.cgiGet( "DISQUIDSC_"+sGXsfl_83_idx+"Title") ;
      edtDisQuiDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISQUIDSC_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisQuiNp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISQUINP_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisQuiTp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISQUITP_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisQuiRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISQUIRB_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A5377DisQuiLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDisQuiLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
      A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
      A5489DisQuiDsc = httpContext.cgiGet( edtDisQuiDsc_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisQuiNp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisQuiNp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DISQUINP_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisQuiNp_Internalname ;
         wbErr = true ;
         A5378DisQuiNp = (short)(0) ;
      }
      else
      {
         A5378DisQuiNp = (short)(localUtil.ctol( httpContext.cgiGet( edtDisQuiNp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisQuiTp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisQuiTp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DISQUITP_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisQuiTp_Internalname ;
         wbErr = true ;
         A5379DisQuiTp = (short)(0) ;
      }
      else
      {
         A5379DisQuiTp = (short)(localUtil.ctol( httpContext.cgiGet( edtDisQuiTp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisQuiRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisQuiRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DISQUIRB_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisQuiRb_Internalname ;
         wbErr = true ;
         A5380DisQuiRb = (short)(0) ;
      }
      else
      {
         A5380DisQuiRb = (short)(localUtil.ctol( httpContext.cgiGet( edtDisQuiRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z5377DisQuiLin_" + sGXsfl_83_idx ;
      Z5377DisQuiLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5489DisQuiDsc_" + sGXsfl_83_idx ;
      Z5489DisQuiDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5378DisQuiNp_" + sGXsfl_83_idx ;
      Z5378DisQuiNp = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5379DisQuiTp_" + sGXsfl_83_idx ;
      Z5379DisQuiTp = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5380DisQuiRb_" + sGXsfl_83_idx ;
      Z5380DisQuiRb = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z764ProForCod_" + sGXsfl_83_idx ;
      Z764ProForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_780_" + sGXsfl_83_idx ;
      nRcdDeleted_780 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_780_" + sGXsfl_83_idx ;
      nRcdExists_780 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_780_" + sGXsfl_83_idx ;
      nIsMod_780 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N5489DisQuiDsc_" + sGXsfl_83_idx ;
      N5489DisQuiDsc = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtDisQuiDsc_Enabled = edtDisQuiDsc_Enabled ;
      defedtDisQuiLin_Enabled = edtDisQuiLin_Enabled ;
   }

   public void confirmValuesPN0( )
   {
      nGXsfl_83_idx = 0 ;
      sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_83780( ) ;
      while ( nGXsfl_83_idx < nRC_GXsfl_83 )
      {
         nGXsfl_83_idx = (int)(nGXsfl_83_idx+1) ;
         sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_83780( ) ;
         httpContext.changePostValue( "Z5377DisQuiLin_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z5377DisQuiLin_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5377DisQuiLin_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z5489DisQuiDsc_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z5489DisQuiDsc_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5489DisQuiDsc_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z5378DisQuiNp_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z5378DisQuiNp_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5378DisQuiNp_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z5379DisQuiTp_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z5379DisQuiTp_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5379DisQuiTp_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z5380DisQuiRb_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z5380DisQuiRb_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5380DisQuiRb_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z764ProForCod_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z764ProForCod_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_83_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tdisqui", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z368DisFasLin", GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5376DisQuiUl", GXutil.ltrim( localUtil.ntoc( Z5376DisQuiUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "O5376DisQuiUl", GXutil.ltrim( localUtil.ntoc( O5376DisQuiUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_83", GXutil.ltrim( localUtil.ntoc( nGXsfl_83_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREOBL", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPROF", GXutil.rtrim( AV35OldProf));
      app.GxWebStd.gx_hidden_field( httpContext, "vF_EXISTE", GXutil.ltrim( localUtil.ntoc( AV26F_existe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERROR1", GXutil.rtrim( AV32Error1));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG2", GXutil.rtrim( AV33Msg2));
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
      return formatLink("app.tdisqui", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin"})  ;
   }

   public String getPgmname( )
   {
      return "TDISQUI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PROCESOS QUIMICOS P/FASE", "") ;
   }

   public void initializeNonKeyPN39( )
   {
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A5376DisQuiUl = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
      A7744FasPreObl = (byte)(0) ;
      n7744FasPreObl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
      O5376DisQuiUl = A5376DisQuiUl ;
      httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
      Z5376DisQuiUl = (short)(0) ;
      Z457FasCod = "" ;
   }

   public void initAllPN39( )
   {
      initializeNonKeyPN39( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyPN780( )
   {
      AV26F_existe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26F_existe", GXutil.str( AV26F_existe, 1, 0));
      AV35OldProf = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldProf", AV35OldProf);
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A5489DisQuiDsc = "" ;
      A5378DisQuiNp = (short)(0) ;
      A5379DisQuiTp = (short)(0) ;
      A5380DisQuiRb = (short)(0) ;
      Z5489DisQuiDsc = "" ;
      Z5378DisQuiNp = (short)(0) ;
      Z5379DisQuiTp = (short)(0) ;
      Z5380DisQuiRb = (short)(0) ;
      Z764ProForCod = "" ;
   }

   public void initAllPN780( )
   {
      A5377DisQuiLin = (short)(0) ;
      initializeNonKeyPN780( ) ;
   }

   public void standaloneModalInsertPN780( )
   {
      A5376DisQuiUl = i5376DisQuiUl ;
      httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5376DisQuiUl), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241523894", true, true);
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
      httpContext.AddJavascriptSource("tdisqui.js", "?20268241523894", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties780( )
   {
      edtDisQuiDsc_Enabled = defedtDisQuiDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiDsc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtDisQuiLin_Enabled = defedtDisQuiLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiLin_Enabled), 5, 0), !bGXsfl_83_Refreshing);
   }

   public void startgridcontrol83( )
   {
      Gridtdisqui_level1itemContainer.AddObjectProperty("GridName", "Gridtdisqui_level1item");
      Gridtdisqui_level1itemContainer.AddObjectProperty("Header", subGridtdisqui_level1item_Header);
      Gridtdisqui_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtdisqui_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtdisqui_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtdisqui_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtdisqui_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdisqui_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5377DisQuiLin, (byte)(4), (byte)(0), ".", "")));
      Gridtdisqui_level1itemColumn.AddObjectProperty("Title", GXutil.rtrim( edtDisQuiLin_Title));
      Gridtdisqui_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddColumnProperties(Gridtdisqui_level1itemColumn);
      Gridtdisqui_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdisqui_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
      Gridtdisqui_level1itemColumn.AddObjectProperty("Title", GXutil.rtrim( edtProForCod_Title));
      Gridtdisqui_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddColumnProperties(Gridtdisqui_level1itemColumn);
      Gridtdisqui_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdisqui_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
      Gridtdisqui_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddColumnProperties(Gridtdisqui_level1itemColumn);
      Gridtdisqui_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdisqui_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A5489DisQuiDsc));
      Gridtdisqui_level1itemColumn.AddObjectProperty("Title", GXutil.rtrim( edtDisQuiDsc_Title));
      Gridtdisqui_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddColumnProperties(Gridtdisqui_level1itemColumn);
      Gridtdisqui_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdisqui_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5378DisQuiNp, (byte)(4), (byte)(0), ".", "")));
      Gridtdisqui_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiNp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddColumnProperties(Gridtdisqui_level1itemColumn);
      Gridtdisqui_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdisqui_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5379DisQuiTp, (byte)(4), (byte)(0), ".", "")));
      Gridtdisqui_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiTp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddColumnProperties(Gridtdisqui_level1itemColumn);
      Gridtdisqui_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdisqui_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5380DisQuiRb, (byte)(4), (byte)(0), ".", "")));
      Gridtdisqui_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisQuiRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddColumnProperties(Gridtdisqui_level1itemColumn);
      Gridtdisqui_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtdisqui_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtdisqui_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtdisqui_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtdisqui_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtdisqui_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtdisqui_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtdisqui_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtdisqui_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtDisCod_Internalname = "DISCOD" ;
      edtProCod_Internalname = "PROCOD" ;
      edtDisFasLin_Internalname = "DISFASLIN" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtDisQuiUl_Internalname = "DISQUIUL" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtDisQuiLin_Internalname = "DISQUILIN" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtDisQuiDsc_Internalname = "DISQUIDSC" ;
      edtDisQuiNp_Internalname = "DISQUINP" ;
      edtDisQuiTp_Internalname = "DISQUITP" ;
      edtDisQuiRb_Internalname = "DISQUIRB" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtdisqui_level1item_Internalname = "GRIDTDISQUI_LEVEL1ITEM" ;
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
      subGridtdisqui_level1item_Allowcollapsing = (byte)(0) ;
      subGridtdisqui_level1item_Allowselection = (byte)(0) ;
      subGridtdisqui_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "PROCESOS QUIMICOS P/FASE", "") );
      edtDisQuiRb_Jsonclick = "" ;
      edtDisQuiTp_Jsonclick = "" ;
      edtDisQuiNp_Jsonclick = "" ;
      edtDisQuiDsc_Jsonclick = "" ;
      edtProForDsc_Jsonclick = "" ;
      edtProForCod_Jsonclick = "" ;
      edtDisQuiLin_Jsonclick = "" ;
      subGridtdisqui_level1item_Class = "Grid" ;
      subGridtdisqui_level1item_Backcolorstyle = (byte)(0) ;
      edtDisQuiRb_Enabled = 1 ;
      edtDisQuiTp_Enabled = 1 ;
      edtDisQuiNp_Enabled = 1 ;
      edtDisQuiDsc_Enabled = 1 ;
      edtProForDsc_Enabled = 0 ;
      edtProForCod_Enabled = 1 ;
      edtDisQuiLin_Enabled = 0 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDisQuiUl_Jsonclick = "" ;
      edtDisQuiUl_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 1 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtDisFasLin_Jsonclick = "" ;
      edtDisFasLin_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      edtProForCod_Title = httpContext.getMessage( "Codigo", "") ;
      edtDisQuiLin_Title = httpContext.getMessage( "Nº Linea", "") ;
      edtDisQuiDsc_Title = httpContext.getMessage( "Descripcion Proceso", "") ;
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

   public void xc_8_PN780( String A396EmprCod ,
                           String A764ProForCod ,
                           byte AV26F_existe )
   {
      if ( true /* After */ && ! (GXutil.strcmp("", A764ProForCod)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A764ProForCod ;
         GXv_int6[0] = AV26F_existe ;
         GXv_char2[0] = "" ;
         new app.pbusprot(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A764ProForCod = GXv_char3[0] ;
         AV26F_existe = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV26F_existe", GXutil.str( AV26F_existe, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A764ProForCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV26F_existe, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridtdisqui_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_83780( ) ;
      while ( nGXsfl_83_idx <= nRC_GXsfl_83 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalPN780( ) ;
         standaloneModalPN780( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowPN780( ) ;
         nGXsfl_83_idx = (int)(nGXsfl_83_idx+1) ;
         sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_83780( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtdisqui_level1itemContainer)) ;
      /* End function gxnrGridtdisqui_level1item_newrow */
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
      /* Using cursor T00PN34 */
      pr_default.execute(32, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00PN34_A407EmprNom[0] ;
      n407EmprNom = T00PN34_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(32);
      /* Using cursor T00PN35 */
      pr_default.execute(33, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T00PN35_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(33);
      /* Using cursor T00PN36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(34);
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

   public void valid_Disfaslin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5376DisQuiUl", GXutil.ltrim( localUtil.ntoc( A5376DisQuiUl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z368DisFasLin", GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5376DisQuiUl", GXutil.ltrim( localUtil.ntoc( Z5376DisQuiUl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7744FasPreObl", GXutil.ltrim( localUtil.ntoc( Z7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O5376DisQuiUl", GXutil.ltrim( localUtil.ntoc( O5376DisQuiUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      n7744FasPreObl = false ;
      /* Using cursor T00PN19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T00PN19_A460FasDsc[0] ;
      A7744FasPreObl = T00PN19_A7744FasPreObl[0] ;
      n7744FasPreObl = T00PN19_n7744FasPreObl[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Proforcod( )
   {
      /* Using cursor T00PN32 */
      pr_default.execute(30, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      A766ProForDsc = T00PN32_A766ProForDsc[0] ;
      pr_default.close(30);
      AV35OldProf = A764ProForCod ;
      if ( true /* After */ && ! (GXutil.strcmp("", A764ProForCod)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A764ProForCod ;
         GXv_int6[0] = AV26F_existe ;
         GXv_char2[0] = "" ;
         new app.pbusprot(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_char2) ;
         tdisqui_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdisqui_impl.this.A764ProForCod = GXv_char3[0] ;
         A764ProForCod = this.A764ProForCod ;
         tdisqui_impl.this.AV26F_existe = GXv_int6[0] ;
         AV26F_existe = this.AV26F_existe ;
      }
      if ( true /* After */ && ! (GXutil.strcmp("", A764ProForCod)==0) && ( AV26F_existe == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV27Msg1, 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldProf", GXutil.rtrim( AV35OldProf));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", GXutil.rtrim( A764ProForCod));
      httpContext.ajax_rsp_assign_attri("", false, "AV26F_existe", GXutil.ltrim( localUtil.ntoc( AV26F_existe, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Disquidsc( )
   {
      if ( GXutil.strcmp(GXutil.trim( A5489DisQuiDsc), "@") == 0 )
      {
         edtDisQuiDsc_Enabled = 0 ;
      }
      else
      {
         edtDisQuiDsc_Enabled = 1 ;
      }
      if ( true /* Level */ && ( GXutil.strcmp(GXutil.trim( A5489DisQuiDsc), "@") == 0 ) && isDlt( )  )
      {
         httpContext.GX_msglist.addItem(AV33Msg2, 1, "DISQUIDSC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisQuiDsc_Internalname ;
      }
      if ( true /* Level */ && ( GXutil.strcmp(GXutil.trim( A5489DisQuiDsc), "@") == 0 ) && isUpd( )  && ( GXutil.strcmp(A764ProForCod, AV35OldProf) != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV33Msg2, 1, "DISQUIDSC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisQuiDsc_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_prop("", false, edtDisQuiDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisQuiDsc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_DISFASLIN","{handler:'valid_Disfaslin',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A5376DisQuiUl',fld:'DISQUIUL',pic:'ZZZ9'},{av:'edtProForCod_Title',ctrl:'PROFORCOD',prop:'Title'},{av:'edtDisQuiLin_Title',ctrl:'DISQUILIN',prop:'Title'},{av:'edtDisQuiDsc_Title',ctrl:'DISQUIDSC',prop:'Title'},{av:'AV33Msg2',fld:'vMSG2',pic:''},{av:'AV32Error1',fld:'vERROR1',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DISFASLIN",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A5376DisQuiUl',fld:'DISQUIUL',pic:'ZZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z758ProCod'},{av:'Z368DisFasLin'},{av:'Z759ProDsc'},{av:'Z457FasCod'},{av:'Z407EmprNom'},{av:'Z5376DisQuiUl'},{av:'Z460FasDsc'},{av:'Z7744FasPreObl'},{av:'O5376DisQuiUl'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'}]}");
      setEventMetadata("VALID_DISQUIUL","{handler:'valid_Disquiul',iparms:[]");
      setEventMetadata("VALID_DISQUIUL",",oparms:[]}");
      setEventMetadata("VALID_DISQUILIN","{handler:'valid_Disquilin',iparms:[]");
      setEventMetadata("VALID_DISQUILIN",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'AV35OldProf',fld:'vOLDPROF',pic:''},{av:'AV26F_existe',fld:'vF_EXISTE',pic:'9'}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'AV35OldProf',fld:'vOLDPROF',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'AV26F_existe',fld:'vF_EXISTE',pic:'9'}]}");
      setEventMetadata("VALID_DISQUIDSC","{handler:'valid_Disquidsc',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A5489DisQuiDsc',fld:'DISQUIDSC',pic:''},{av:'AV33Msg2',fld:'vMSG2',pic:''},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'AV35OldProf',fld:'vOLDPROF',pic:''}]");
      setEventMetadata("VALID_DISQUIDSC",",oparms:[{av:'edtDisQuiDsc_Enabled',ctrl:'DISQUIDSC',prop:'Enabled'}]}");
      setEventMetadata("NULL","{handler:'valid_Disquirb',iparms:[]");
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
      pr_default.close(30);
      pr_default.close(32);
      pr_default.close(34);
      pr_default.close(17);
      pr_default.close(33);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA758ProCod = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z457FasCod = "" ;
      Z5489DisQuiDsc = "" ;
      Z764ProForCod = "" ;
      N5489DisQuiDsc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
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
      A407EmprNom = "" ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtdisqui_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode780 = "" ;
      Gx_mode = "" ;
      sStyleString = "" ;
      AV35OldProf = "" ;
      AV32Error1 = "" ;
      AV33Msg2 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      A766ProForDsc = "" ;
      A5489DisQuiDsc = "" ;
      AV14Lit0 = "" ;
      AV19LitFe = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV28Lit6 = "" ;
      AV30Lit7 = "" ;
      AV31Lit8 = "" ;
      AV21Station = "" ;
      AV22EmprNom = "" ;
      AV18UsurCod = "" ;
      AV20EmprCod = "" ;
      AV27Msg1 = "" ;
      GXt_char1 = "" ;
      Z407EmprNom = "" ;
      Z759ProDsc = "" ;
      Z460FasDsc = "" ;
      T00PN7_A407EmprNom = new String[] {""} ;
      T00PN7_n407EmprNom = new boolean[] {false} ;
      T00PN8_A759ProDsc = new String[] {""} ;
      T00PN9_A396EmprCod = new String[] {""} ;
      T00PN11_A368DisFasLin = new short[1] ;
      T00PN11_A759ProDsc = new String[] {""} ;
      T00PN11_A460FasDsc = new String[] {""} ;
      T00PN11_A407EmprNom = new String[] {""} ;
      T00PN11_n407EmprNom = new boolean[] {false} ;
      T00PN11_A5376DisQuiUl = new short[1] ;
      T00PN11_A7744FasPreObl = new byte[1] ;
      T00PN11_n7744FasPreObl = new boolean[] {false} ;
      T00PN11_A396EmprCod = new String[] {""} ;
      T00PN11_A361DisCod = new int[1] ;
      T00PN11_A758ProCod = new String[] {""} ;
      T00PN11_A457FasCod = new String[] {""} ;
      T00PN10_A460FasDsc = new String[] {""} ;
      T00PN10_A7744FasPreObl = new byte[1] ;
      T00PN10_n7744FasPreObl = new boolean[] {false} ;
      T00PN12_A460FasDsc = new String[] {""} ;
      T00PN12_A7744FasPreObl = new byte[1] ;
      T00PN12_n7744FasPreObl = new boolean[] {false} ;
      T00PN13_A396EmprCod = new String[] {""} ;
      T00PN13_A361DisCod = new int[1] ;
      T00PN13_A758ProCod = new String[] {""} ;
      T00PN13_A368DisFasLin = new short[1] ;
      T00PN6_A368DisFasLin = new short[1] ;
      T00PN6_A5376DisQuiUl = new short[1] ;
      T00PN6_A396EmprCod = new String[] {""} ;
      T00PN6_A361DisCod = new int[1] ;
      T00PN6_A758ProCod = new String[] {""} ;
      T00PN6_A457FasCod = new String[] {""} ;
      T00PN6_A7744FasPreObl = new byte[1] ;
      T00PN6_n7744FasPreObl = new boolean[] {false} ;
      sMode39 = "" ;
      T00PN14_A396EmprCod = new String[] {""} ;
      T00PN14_A361DisCod = new int[1] ;
      T00PN14_A758ProCod = new String[] {""} ;
      T00PN14_A368DisFasLin = new short[1] ;
      T00PN15_A396EmprCod = new String[] {""} ;
      T00PN15_A361DisCod = new int[1] ;
      T00PN15_A758ProCod = new String[] {""} ;
      T00PN15_A368DisFasLin = new short[1] ;
      T00PN5_A368DisFasLin = new short[1] ;
      T00PN5_A5376DisQuiUl = new short[1] ;
      T00PN5_A396EmprCod = new String[] {""} ;
      T00PN5_A361DisCod = new int[1] ;
      T00PN5_A758ProCod = new String[] {""} ;
      T00PN5_A457FasCod = new String[] {""} ;
      T00PN5_A7744FasPreObl = new byte[1] ;
      T00PN5_n7744FasPreObl = new boolean[] {false} ;
      T00PN19_A460FasDsc = new String[] {""} ;
      T00PN19_A7744FasPreObl = new byte[1] ;
      T00PN19_n7744FasPreObl = new boolean[] {false} ;
      T00PN20_A396EmprCod = new String[] {""} ;
      T00PN20_A361DisCod = new int[1] ;
      T00PN20_A758ProCod = new String[] {""} ;
      T00PN20_A368DisFasLin = new short[1] ;
      T00PN20_A7919Dta_Ordl = new short[1] ;
      T00PN21_A396EmprCod = new String[] {""} ;
      T00PN21_A361DisCod = new int[1] ;
      T00PN21_A758ProCod = new String[] {""} ;
      T00PN21_A368DisFasLin = new short[1] ;
      T00PN21_A7727ArtAdiCod = new short[1] ;
      T00PN22_A396EmprCod = new String[] {""} ;
      T00PN22_A361DisCod = new int[1] ;
      T00PN22_A758ProCod = new String[] {""} ;
      T00PN22_A368DisFasLin = new short[1] ;
      T00PN22_A5035A_Discod = new int[1] ;
      T00PN22_A5038A_DProcod = new String[] {""} ;
      T00PN22_A5039A_DOrdlin = new short[1] ;
      T00PN23_A396EmprCod = new String[] {""} ;
      T00PN23_A361DisCod = new int[1] ;
      T00PN23_A758ProCod = new String[] {""} ;
      T00PN23_A368DisFasLin = new short[1] ;
      T00PN23_A1664ParFasCod = new short[1] ;
      T00PN25_A396EmprCod = new String[] {""} ;
      T00PN25_A361DisCod = new int[1] ;
      T00PN25_A758ProCod = new String[] {""} ;
      T00PN25_A368DisFasLin = new short[1] ;
      Z766ProForDsc = "" ;
      T00PN26_A361DisCod = new int[1] ;
      T00PN26_A758ProCod = new String[] {""} ;
      T00PN26_A368DisFasLin = new short[1] ;
      T00PN26_A5377DisQuiLin = new short[1] ;
      T00PN26_A766ProForDsc = new String[] {""} ;
      T00PN26_A5489DisQuiDsc = new String[] {""} ;
      T00PN26_A5378DisQuiNp = new short[1] ;
      T00PN26_A5379DisQuiTp = new short[1] ;
      T00PN26_A5380DisQuiRb = new short[1] ;
      T00PN26_A396EmprCod = new String[] {""} ;
      T00PN26_A764ProForCod = new String[] {""} ;
      T00PN4_A766ProForDsc = new String[] {""} ;
      GXCCtl = "" ;
      T00PN27_A766ProForDsc = new String[] {""} ;
      T00PN28_A396EmprCod = new String[] {""} ;
      T00PN28_A361DisCod = new int[1] ;
      T00PN28_A758ProCod = new String[] {""} ;
      T00PN28_A368DisFasLin = new short[1] ;
      T00PN28_A5377DisQuiLin = new short[1] ;
      T00PN3_A361DisCod = new int[1] ;
      T00PN3_A758ProCod = new String[] {""} ;
      T00PN3_A368DisFasLin = new short[1] ;
      T00PN3_A5377DisQuiLin = new short[1] ;
      T00PN3_A5489DisQuiDsc = new String[] {""} ;
      T00PN3_A5378DisQuiNp = new short[1] ;
      T00PN3_A5379DisQuiTp = new short[1] ;
      T00PN3_A5380DisQuiRb = new short[1] ;
      T00PN3_A396EmprCod = new String[] {""} ;
      T00PN3_A764ProForCod = new String[] {""} ;
      T00PN2_A361DisCod = new int[1] ;
      T00PN2_A758ProCod = new String[] {""} ;
      T00PN2_A368DisFasLin = new short[1] ;
      T00PN2_A5377DisQuiLin = new short[1] ;
      T00PN2_A5489DisQuiDsc = new String[] {""} ;
      T00PN2_A5378DisQuiNp = new short[1] ;
      T00PN2_A5379DisQuiTp = new short[1] ;
      T00PN2_A5380DisQuiRb = new short[1] ;
      T00PN2_A396EmprCod = new String[] {""} ;
      T00PN2_A764ProForCod = new String[] {""} ;
      T00PN32_A766ProForDsc = new String[] {""} ;
      T00PN33_A396EmprCod = new String[] {""} ;
      T00PN33_A361DisCod = new int[1] ;
      T00PN33_A758ProCod = new String[] {""} ;
      T00PN33_A368DisFasLin = new short[1] ;
      T00PN33_A5377DisQuiLin = new short[1] ;
      Gridtdisqui_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtdisqui_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtdisqui_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      T00PN34_A407EmprNom = new String[] {""} ;
      T00PN34_n407EmprNom = new boolean[] {false} ;
      T00PN35_A759ProDsc = new String[] {""} ;
      T00PN36_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ758ProCod = "" ;
      ZZ759ProDsc = "" ;
      ZZ457FasCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ460FasDsc = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char2 = new String[1] ;
      ZV35OldProf = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdisqui__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdisqui__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdisqui__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdisqui__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdisqui__default(),
         new Object[] {
             new Object[] {
            T00PN2_A361DisCod, T00PN2_A758ProCod, T00PN2_A368DisFasLin, T00PN2_A5377DisQuiLin, T00PN2_A5489DisQuiDsc, T00PN2_A5378DisQuiNp, T00PN2_A5379DisQuiTp, T00PN2_A5380DisQuiRb, T00PN2_A396EmprCod, T00PN2_A764ProForCod
            }
            , new Object[] {
            T00PN3_A361DisCod, T00PN3_A758ProCod, T00PN3_A368DisFasLin, T00PN3_A5377DisQuiLin, T00PN3_A5489DisQuiDsc, T00PN3_A5378DisQuiNp, T00PN3_A5379DisQuiTp, T00PN3_A5380DisQuiRb, T00PN3_A396EmprCod, T00PN3_A764ProForCod
            }
            , new Object[] {
            T00PN4_A766ProForDsc
            }
            , new Object[] {
            T00PN5_A368DisFasLin, T00PN5_A5376DisQuiUl, T00PN5_A396EmprCod, T00PN5_A361DisCod, T00PN5_A758ProCod, T00PN5_A457FasCod, T00PN5_A7744FasPreObl, T00PN5_n7744FasPreObl
            }
            , new Object[] {
            T00PN6_A368DisFasLin, T00PN6_A5376DisQuiUl, T00PN6_A396EmprCod, T00PN6_A361DisCod, T00PN6_A758ProCod, T00PN6_A457FasCod, T00PN6_A7744FasPreObl, T00PN6_n7744FasPreObl
            }
            , new Object[] {
            T00PN7_A407EmprNom, T00PN7_n407EmprNom
            }
            , new Object[] {
            T00PN8_A759ProDsc
            }
            , new Object[] {
            T00PN9_A396EmprCod
            }
            , new Object[] {
            T00PN10_A460FasDsc, T00PN10_A7744FasPreObl, T00PN10_n7744FasPreObl
            }
            , new Object[] {
            T00PN11_A368DisFasLin, T00PN11_A759ProDsc, T00PN11_A460FasDsc, T00PN11_A407EmprNom, T00PN11_n407EmprNom, T00PN11_A5376DisQuiUl, T00PN11_A7744FasPreObl, T00PN11_n7744FasPreObl, T00PN11_A396EmprCod, T00PN11_A361DisCod,
            T00PN11_A758ProCod, T00PN11_A457FasCod
            }
            , new Object[] {
            T00PN12_A460FasDsc, T00PN12_A7744FasPreObl, T00PN12_n7744FasPreObl
            }
            , new Object[] {
            T00PN13_A396EmprCod, T00PN13_A361DisCod, T00PN13_A758ProCod, T00PN13_A368DisFasLin
            }
            , new Object[] {
            T00PN14_A396EmprCod, T00PN14_A361DisCod, T00PN14_A758ProCod, T00PN14_A368DisFasLin
            }
            , new Object[] {
            T00PN15_A396EmprCod, T00PN15_A361DisCod, T00PN15_A758ProCod, T00PN15_A368DisFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00PN19_A460FasDsc, T00PN19_A7744FasPreObl, T00PN19_n7744FasPreObl
            }
            , new Object[] {
            T00PN20_A396EmprCod, T00PN20_A361DisCod, T00PN20_A758ProCod, T00PN20_A368DisFasLin, T00PN20_A7919Dta_Ordl
            }
            , new Object[] {
            T00PN21_A396EmprCod, T00PN21_A361DisCod, T00PN21_A758ProCod, T00PN21_A368DisFasLin, T00PN21_A7727ArtAdiCod
            }
            , new Object[] {
            T00PN22_A396EmprCod, T00PN22_A361DisCod, T00PN22_A758ProCod, T00PN22_A368DisFasLin, T00PN22_A5035A_Discod, T00PN22_A5038A_DProcod, T00PN22_A5039A_DOrdlin
            }
            , new Object[] {
            T00PN23_A396EmprCod, T00PN23_A361DisCod, T00PN23_A758ProCod, T00PN23_A368DisFasLin, T00PN23_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            T00PN25_A396EmprCod, T00PN25_A361DisCod, T00PN25_A758ProCod, T00PN25_A368DisFasLin
            }
            , new Object[] {
            T00PN26_A361DisCod, T00PN26_A758ProCod, T00PN26_A368DisFasLin, T00PN26_A5377DisQuiLin, T00PN26_A766ProForDsc, T00PN26_A5489DisQuiDsc, T00PN26_A5378DisQuiNp, T00PN26_A5379DisQuiTp, T00PN26_A5380DisQuiRb, T00PN26_A396EmprCod,
            T00PN26_A764ProForCod
            }
            , new Object[] {
            T00PN27_A766ProForDsc
            }
            , new Object[] {
            T00PN28_A396EmprCod, T00PN28_A361DisCod, T00PN28_A758ProCod, T00PN28_A368DisFasLin, T00PN28_A5377DisQuiLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00PN32_A766ProForDsc
            }
            , new Object[] {
            T00PN33_A396EmprCod, T00PN33_A361DisCod, T00PN33_A758ProCod, T00PN33_A368DisFasLin, T00PN33_A5377DisQuiLin
            }
            , new Object[] {
            T00PN34_A407EmprNom, T00PN34_n407EmprNom
            }
            , new Object[] {
            T00PN35_A759ProDsc
            }
            , new Object[] {
            T00PN36_A396EmprCod
            }
         }
      );
      Z368DisFasLin = (short)(0) ;
      A368DisFasLin = (short)(0) ;
      Z758ProCod = "" ;
      A758ProCod = "" ;
      Z361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte AV26F_existe ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A7744FasPreObl ;
   private byte AV29F_laundry ;
   private byte AV34Ibatex ;
   private byte GXt_int5 ;
   private byte Z7744FasPreObl ;
   private byte subGridtdisqui_level1item_Backcolorstyle ;
   private byte subGridtdisqui_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtdisqui_level1item_Allowselection ;
   private byte subGridtdisqui_level1item_Allowhovering ;
   private byte subGridtdisqui_level1item_Allowcollapsing ;
   private byte subGridtdisqui_level1item_Collapsed ;
   private byte ZZ7744FasPreObl ;
   private byte GXv_int6[] ;
   private byte ZV26F_existe ;
   private short wcpOA368DisFasLin ;
   private short Z368DisFasLin ;
   private short Z5376DisQuiUl ;
   private short O5376DisQuiUl ;
   private short Z5377DisQuiLin ;
   private short Z5378DisQuiNp ;
   private short Z5379DisQuiTp ;
   private short Z5380DisQuiRb ;
   private short nRcdDeleted_780 ;
   private short nRcdExists_780 ;
   private short nIsMod_780 ;
   private short A368DisFasLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5376DisQuiUl ;
   private short nBlankRcdCount780 ;
   private short RcdFound780 ;
   private short B5376DisQuiUl ;
   private short nBlankRcdUsr780 ;
   private short s5376DisQuiUl ;
   private short A5377DisQuiLin ;
   private short A5378DisQuiNp ;
   private short A5379DisQuiTp ;
   private short A5380DisQuiRb ;
   private short RcdFound39 ;
   private short nIsDirty_39 ;
   private short nIsDirty_780 ;
   private short i5376DisQuiUl ;
   private short ZZ368DisFasLin ;
   private short ZZ5376DisQuiUl ;
   private short ZO5376DisQuiUl ;
   private int wcpOA361DisCod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_83 ;
   private int nGXsfl_83_idx=1 ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDisCod_Enabled ;
   private int edtProCod_Enabled ;
   private int edtDisFasLin_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDisQuiUl_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtDisQuiLin_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtDisQuiDsc_Enabled ;
   private int edtDisQuiNp_Enabled ;
   private int edtDisQuiTp_Enabled ;
   private int edtDisQuiRb_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtdisqui_level1item_Backcolor ;
   private int subGridtdisqui_level1item_Allbackcolor ;
   private int defedtDisQuiDsc_Enabled ;
   private int defedtDisQuiLin_Enabled ;
   private int idxLst ;
   private int subGridtdisqui_level1item_Selectedindex ;
   private int subGridtdisqui_level1item_Selectioncolor ;
   private int subGridtdisqui_level1item_Hoveringcolor ;
   private int ZZ361DisCod ;
   private long GRIDTDISQUI_LEVEL1ITEM_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA758ProCod ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z457FasCod ;
   private String Z5489DisQuiDsc ;
   private String Z764ProForCod ;
   private String N5489DisQuiDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFasCod_Internalname ;
   private String sGXsfl_83_idx="0001" ;
   private String edtDisQuiDsc_Title ;
   private String edtDisQuiDsc_Internalname ;
   private String edtDisQuiLin_Title ;
   private String edtDisQuiLin_Internalname ;
   private String edtProForCod_Title ;
   private String edtProForCod_Internalname ;
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
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtDisFasLin_Internalname ;
   private String edtDisFasLin_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtDisQuiUl_Internalname ;
   private String edtDisQuiUl_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode780 ;
   private String Gx_mode ;
   private String edtProForDsc_Internalname ;
   private String edtDisQuiNp_Internalname ;
   private String edtDisQuiTp_Internalname ;
   private String edtDisQuiRb_Internalname ;
   private String sStyleString ;
   private String subGridtdisqui_level1item_Internalname ;
   private String AV35OldProf ;
   private String AV32Error1 ;
   private String AV33Msg2 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String A766ProForDsc ;
   private String A5489DisQuiDsc ;
   private String AV14Lit0 ;
   private String AV19LitFe ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV28Lit6 ;
   private String AV30Lit7 ;
   private String AV31Lit8 ;
   private String AV21Station ;
   private String AV22EmprNom ;
   private String AV18UsurCod ;
   private String AV20EmprCod ;
   private String AV27Msg1 ;
   private String GXt_char1 ;
   private String Z407EmprNom ;
   private String Z759ProDsc ;
   private String Z460FasDsc ;
   private String sMode39 ;
   private String Z766ProForDsc ;
   private String GXCCtl ;
   private String sGXsfl_83_fel_idx="0001" ;
   private String subGridtdisqui_level1item_Class ;
   private String subGridtdisqui_level1item_Linesclass ;
   private String ROClassString ;
   private String edtDisQuiLin_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String edtDisQuiDsc_Jsonclick ;
   private String edtDisQuiNp_Jsonclick ;
   private String edtDisQuiTp_Jsonclick ;
   private String edtDisQuiRb_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtdisqui_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ758ProCod ;
   private String ZZ759ProDsc ;
   private String ZZ457FasCod ;
   private String ZZ407EmprNom ;
   private String ZZ460FasDsc ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV35OldProf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_83_Refreshing=false ;
   private boolean n7744FasPreObl ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Gridtdisqui_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtdisqui_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtdisqui_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private String[] T00PN7_A407EmprNom ;
   private boolean[] T00PN7_n407EmprNom ;
   private String[] T00PN8_A759ProDsc ;
   private String[] T00PN9_A396EmprCod ;
   private short[] T00PN11_A368DisFasLin ;
   private String[] T00PN11_A759ProDsc ;
   private String[] T00PN11_A460FasDsc ;
   private String[] T00PN11_A407EmprNom ;
   private boolean[] T00PN11_n407EmprNom ;
   private short[] T00PN11_A5376DisQuiUl ;
   private byte[] T00PN11_A7744FasPreObl ;
   private boolean[] T00PN11_n7744FasPreObl ;
   private String[] T00PN11_A396EmprCod ;
   private int[] T00PN11_A361DisCod ;
   private String[] T00PN11_A758ProCod ;
   private String[] T00PN11_A457FasCod ;
   private String[] T00PN10_A460FasDsc ;
   private byte[] T00PN10_A7744FasPreObl ;
   private boolean[] T00PN10_n7744FasPreObl ;
   private String[] T00PN12_A460FasDsc ;
   private byte[] T00PN12_A7744FasPreObl ;
   private boolean[] T00PN12_n7744FasPreObl ;
   private String[] T00PN13_A396EmprCod ;
   private int[] T00PN13_A361DisCod ;
   private String[] T00PN13_A758ProCod ;
   private short[] T00PN13_A368DisFasLin ;
   private short[] T00PN6_A368DisFasLin ;
   private short[] T00PN6_A5376DisQuiUl ;
   private String[] T00PN6_A396EmprCod ;
   private int[] T00PN6_A361DisCod ;
   private String[] T00PN6_A758ProCod ;
   private String[] T00PN6_A457FasCod ;
   private byte[] T00PN6_A7744FasPreObl ;
   private boolean[] T00PN6_n7744FasPreObl ;
   private String[] T00PN14_A396EmprCod ;
   private int[] T00PN14_A361DisCod ;
   private String[] T00PN14_A758ProCod ;
   private short[] T00PN14_A368DisFasLin ;
   private String[] T00PN15_A396EmprCod ;
   private int[] T00PN15_A361DisCod ;
   private String[] T00PN15_A758ProCod ;
   private short[] T00PN15_A368DisFasLin ;
   private short[] T00PN5_A368DisFasLin ;
   private short[] T00PN5_A5376DisQuiUl ;
   private String[] T00PN5_A396EmprCod ;
   private int[] T00PN5_A361DisCod ;
   private String[] T00PN5_A758ProCod ;
   private String[] T00PN5_A457FasCod ;
   private byte[] T00PN5_A7744FasPreObl ;
   private boolean[] T00PN5_n7744FasPreObl ;
   private String[] T00PN19_A460FasDsc ;
   private byte[] T00PN19_A7744FasPreObl ;
   private boolean[] T00PN19_n7744FasPreObl ;
   private String[] T00PN20_A396EmprCod ;
   private int[] T00PN20_A361DisCod ;
   private String[] T00PN20_A758ProCod ;
   private short[] T00PN20_A368DisFasLin ;
   private short[] T00PN20_A7919Dta_Ordl ;
   private String[] T00PN21_A396EmprCod ;
   private int[] T00PN21_A361DisCod ;
   private String[] T00PN21_A758ProCod ;
   private short[] T00PN21_A368DisFasLin ;
   private short[] T00PN21_A7727ArtAdiCod ;
   private String[] T00PN22_A396EmprCod ;
   private int[] T00PN22_A361DisCod ;
   private String[] T00PN22_A758ProCod ;
   private short[] T00PN22_A368DisFasLin ;
   private int[] T00PN22_A5035A_Discod ;
   private String[] T00PN22_A5038A_DProcod ;
   private short[] T00PN22_A5039A_DOrdlin ;
   private String[] T00PN23_A396EmprCod ;
   private int[] T00PN23_A361DisCod ;
   private String[] T00PN23_A758ProCod ;
   private short[] T00PN23_A368DisFasLin ;
   private short[] T00PN23_A1664ParFasCod ;
   private String[] T00PN25_A396EmprCod ;
   private int[] T00PN25_A361DisCod ;
   private String[] T00PN25_A758ProCod ;
   private short[] T00PN25_A368DisFasLin ;
   private int[] T00PN26_A361DisCod ;
   private String[] T00PN26_A758ProCod ;
   private short[] T00PN26_A368DisFasLin ;
   private short[] T00PN26_A5377DisQuiLin ;
   private String[] T00PN26_A766ProForDsc ;
   private String[] T00PN26_A5489DisQuiDsc ;
   private short[] T00PN26_A5378DisQuiNp ;
   private short[] T00PN26_A5379DisQuiTp ;
   private short[] T00PN26_A5380DisQuiRb ;
   private String[] T00PN26_A396EmprCod ;
   private String[] T00PN26_A764ProForCod ;
   private String[] T00PN4_A766ProForDsc ;
   private String[] T00PN27_A766ProForDsc ;
   private String[] T00PN28_A396EmprCod ;
   private int[] T00PN28_A361DisCod ;
   private String[] T00PN28_A758ProCod ;
   private short[] T00PN28_A368DisFasLin ;
   private short[] T00PN28_A5377DisQuiLin ;
   private int[] T00PN3_A361DisCod ;
   private String[] T00PN3_A758ProCod ;
   private short[] T00PN3_A368DisFasLin ;
   private short[] T00PN3_A5377DisQuiLin ;
   private String[] T00PN3_A5489DisQuiDsc ;
   private short[] T00PN3_A5378DisQuiNp ;
   private short[] T00PN3_A5379DisQuiTp ;
   private short[] T00PN3_A5380DisQuiRb ;
   private String[] T00PN3_A396EmprCod ;
   private String[] T00PN3_A764ProForCod ;
   private int[] T00PN2_A361DisCod ;
   private String[] T00PN2_A758ProCod ;
   private short[] T00PN2_A368DisFasLin ;
   private short[] T00PN2_A5377DisQuiLin ;
   private String[] T00PN2_A5489DisQuiDsc ;
   private short[] T00PN2_A5378DisQuiNp ;
   private short[] T00PN2_A5379DisQuiTp ;
   private short[] T00PN2_A5380DisQuiRb ;
   private String[] T00PN2_A396EmprCod ;
   private String[] T00PN2_A764ProForCod ;
   private String[] T00PN32_A766ProForDsc ;
   private String[] T00PN33_A396EmprCod ;
   private int[] T00PN33_A361DisCod ;
   private String[] T00PN33_A758ProCod ;
   private short[] T00PN33_A368DisFasLin ;
   private short[] T00PN33_A5377DisQuiLin ;
   private String[] T00PN34_A407EmprNom ;
   private boolean[] T00PN34_n407EmprNom ;
   private String[] T00PN35_A759ProDsc ;
   private String[] T00PN36_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdisqui__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisqui__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisqui__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisqui__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisqui__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00PN2", "SELECT DisCod, ProCod, DisFasLin, DisQuiLin, DisQuiDsc, DisQuiNp, DisQuiTp, DisQuiRb, EmprCod, ProForCod FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND DisQuiLin = ?  FOR UPDATE OF DisQuiDsc, DisQuiNp, DisQuiTp, DisQuiRb, ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PN3", "SELECT DisCod, ProCod, DisFasLin, DisQuiLin, DisQuiDsc, DisQuiNp, DisQuiTp, DisQuiRb, EmprCod, ProForCod FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND DisQuiLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PN4", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN5", "SELECT DisFasLin, DisQuiUl, EmprCod, DisCod, ProCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?  FOR UPDATE OF DisQuiUl, FasCod, FasPreObl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN6", "SELECT DisFasLin, DisQuiUl, EmprCod, DisCod, ProCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN8", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN9", "SELECT EmprCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN10", "SELECT FasDsc, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN11", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisFasLin, T3.ProDsc, T4.FasDsc, T2.EmprNom, TM1.DisQuiUl, TM1.FasPreObl, TM1.EmprCod, TM1.DisCod, TM1.ProCod, TM1.FasCod FROM (((TXPDISFAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProCod = TM1.ProCod) INNER JOIN TXPFASPRO T4 ON T4.EmprCod = TM1.EmprCod AND T4.FasCod = TM1.FasCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? and TM1.ProCod = ? and TM1.DisFasLin = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.ProCod, TM1.DisFasLin ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN12", "SELECT FasDsc, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod DESC, DisCod DESC, ProCod DESC, DisFasLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00PN16", "INSERT INTO TXPDISFAS(FasPreObl, DisFasLin, DisQuiUl, EmprCod, DisCod, ProCod, FasCod, FasApr, DisMaqPru, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T00PN17", "UPDATE TXPDISFAS SET FasPreObl=?, DisQuiUl=?, FasCod=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T00PN18", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new ForEachCursor("T00PN19", "SELECT FasDsc, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN20", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl FROM TXPDT004 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN21", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ArtAdiCod FROM TXPDisFPA WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN22", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, A_Discod, A_DProcod, A_DOrdlin FROM TXPAGRDIS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN23", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00PN24", "UPDATE TXPDISFAS SET DisQuiUl=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new ForEachCursor("T00PN25", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PN26", "SELECT T1.DisCod, T1.ProCod, T1.DisFasLin, T1.DisQuiLin, T2.ProForDsc, T1.DisQuiDsc, T1.DisQuiNp, T1.DisQuiTp, T1.DisQuiRb, T1.EmprCod, T1.ProForCod FROM (TXPDISQUI T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? and T1.DisQuiLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T1.DisQuiLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PN27", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PN28", "SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND DisQuiLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00PN29", "INSERT INTO TXPDISQUI(DisCod, ProCod, DisFasLin, DisQuiLin, DisQuiDsc, DisQuiNp, DisQuiTp, DisQuiRb, EmprCod, ProForCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDISQUI")
         ,new UpdateCursor("T00PN30", "UPDATE TXPDISQUI SET DisQuiDsc=?, DisQuiNp=?, DisQuiTp=?, DisQuiRb=?, ProForCod=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND DisQuiLin = ?", GX_NOMASK, "TXPDISQUI")
         ,new UpdateCursor("T00PN31", "DELETE FROM TXPDISQUI  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND DisQuiLin = ?", GX_NOMASK, "TXPDISQUI")
         ,new ForEachCursor("T00PN32", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PN33", "SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PN34", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PN35", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PN36", "SELECT EmprCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 34 :
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 8);
               stmt.setString(7, (String)parms[7], 8);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 8);
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 22 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 27 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 20);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 6);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 8);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

